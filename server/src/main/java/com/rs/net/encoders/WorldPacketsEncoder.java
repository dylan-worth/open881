package com.rs.net.encoders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.jboss.netty.channel.ChannelFuture;

import com.rs.Settings;
import com.rs.game.Animation;
import com.rs.game.DynamicRegion;
import com.rs.game.Entity;
import com.rs.game.Graphics;
import com.rs.game.Region;
import com.rs.game.World;
import com.rs.game.WorldObject;
import com.rs.game.WorldTile;
import com.rs.game.item.FloorItem;
import com.rs.game.item.Item;
import com.rs.game.item.ItemsContainer;
import com.rs.game.map.MapUtils;
import com.rs.game.map.MapUtils.Structure;
import com.rs.game.npc.NPC;
import com.rs.game.player.ChatMessage;
import com.rs.game.player.HintIcon;
import com.rs.game.player.InterfaceManager;
import com.rs.game.player.Inventory;
import com.rs.game.player.Player;
import com.rs.game.player.PublicChatMessage;
import com.rs.game.player.QuickChatMessage;
import com.rs.game.player.content.clans.ClansManager;
import com.rs.game.player.content.grandExchange.Offer;
import com.rs.io.OutputStream;
import com.rs.login.WorldInformation;
import com.rs.net.Session;
import com.rs.utils.Utils;
import com.rs.utils.huffman.Huffman;

public class WorldPacketsEncoder extends Encoder {

	private Player player;

	public WorldPacketsEncoder(Session session, Player player) {
		super(session);
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	public void sendSwitchWorld(String address, int port) {
		OutputStream stream = new OutputStream();
		stream.writePacket(player, 167);
		stream.writeString(address);
		stream.writeShort(port);
		// ////session.write(stream);
	}

	public void sendMinimapFlag(int x, int y) {
		OutputStream stream = new OutputStream(3);
		stream.writePacket(player, 190);
		stream.write128Byte(x);
		stream.writeByteC(y);
		session.write(stream);
	}

	public void sendResetMinimapFlag() {
		sendMinimapFlag(255, 255);
	}

	public void sendPing() {
		OutputStream packet = new OutputStream(1);
		packet.writePacket(player, 74);
		session.write(packet);
	}

	public void sendWorldList(int clientChecksum, int[] online) {
		int lowestWorldId = Integer.MAX_VALUE;
		int highestWorldId = Integer.MIN_VALUE;
		int ourChecksum = Settings.WORLDS_INFORMATION.length;
		for (int i = 0; i < Settings.WORLDS_INFORMATION.length; i++) {
			WorldInformation world = Settings.WORLDS_INFORMATION[i];
			ourChecksum += (ourChecksum * world.hashCode());
			if (world.getId() < lowestWorldId)
				lowestWorldId = world.getId();
			if (world.getId() > highestWorldId)
				highestWorldId = world.getId();
		}

		OutputStream packet = new OutputStream();
		packet.writePacketVarShort(player, 2);
		packet.writeByte(1); // 0 - buffer only, 1 - parse
		packet.writeByte(2); // list version
		packet.writeByte(ourChecksum != clientChecksum ? 1 : 0);
		if (ourChecksum != clientChecksum) {
			packet.writeSmart(Settings.WORLDS_INFORMATION.length); // number of
			// locations
			for (int i = 0; i < Settings.WORLDS_INFORMATION.length; i++) {
				WorldInformation world = Settings.WORLDS_INFORMATION[i];
				packet.writeSmart(world.getCountryFlagID());
				packet.writeVersionedString(world.getCountryName());

			}

			packet.writeSmart(lowestWorldId);
			packet.writeSmart(highestWorldId);
			packet.writeSmart(Settings.WORLDS_INFORMATION.length); // number of
			// worlds
			for (int i = 0; i < Settings.WORLDS_INFORMATION.length; i++) {
				WorldInformation world = Settings.WORLDS_INFORMATION[i];
				packet.writeSmart(world.getId() - lowestWorldId);
				packet.writeByte(i); // world location index
				packet.writeInt(world.getFlags());
				packet.writeSmart(0); // if not 0 also sends a string which i
				// dont know what is for yet
				packet.writeVersionedString(world.getActivity());
				packet.writeVersionedString(world.getIp());
			}
			packet.writeInt(ourChecksum);
		}

		for (int i = 0; i < Settings.WORLDS_INFORMATION.length; i++) {
			WorldInformation world = Settings.WORLDS_INFORMATION[i];
			packet.writeSmart(world.getId() - lowestWorldId);
			if (online[i] == -1)
				packet.writeShort(65535);
			else
				packet.writeShort(online[i]);
		}

		packet.endPacketVarShort();
		session.write(packet);
	}

	public void sendPlayerUnderNPCPriority(boolean priority) {
		OutputStream stream = new OutputStream(2);
		stream.writePacket(player, 185);
		stream.writeByte128(priority ? 1 : 0);
		session.write(stream);
	}

	public void sendIComponentInputInteger(int interfaceId, int componentId, int length) {
		player.getPackets().sendCSVarInteger2(2235, (interfaceId << 16 | componentId));
		player.getPackets().sendCSVarInteger2(2236, 7);
		player.getPackets().sendCSVarInteger2(2237, length);
	}

	public void sendHintIcon(HintIcon icon) {
		OutputStream stream = new OutputStream(16);
		stream.writePacket(player, 78);
		stream.writeByte((icon.getTargetType() & 0x1f) | (icon.getIndex() << 5));
		if (icon.getTargetType() == 0)
			stream.skip(13);
		else {
			stream.writeByte(icon.getArrowType());
			if (icon.getTargetType() == 1 || icon.getTargetType() == 10) {
				stream.writeShort(icon.getTargetIndex());
				stream.writeShort(2500); // how often the arrow flashes, 2500
				// ideal, 0 never
				stream.skip(4);
			} else if ((icon.getTargetType() >= 2 && icon.getTargetType() <= 6)) { // directions
				stream.writeByte(icon.getPlane()); // unknown
				stream.writeShort(icon.getCoordX());
				stream.writeShort(icon.getCoordY());
				stream.writeByte(icon.getDistanceFromFloor() * 4 >> 2);
				stream.writeShort(-1); // distance to start showing on minimap,
				// 0 doesnt show, -1 infinite
			}
			stream.writeInt(icon.getModelId());
		}
		session.write(stream);
	}

	public void sendCameraShake(int slotId, int b, int c, int d, int e) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 175);
		stream.writeByte128(c);
		stream.writeByte128(b);
		stream.writeShort(e);
		stream.writeByte(slotId);
		stream.writeByte(c);
		session.write(stream);
	}

	public void sendStopCameraShake() {
		sendResetCamera();
	}

	public void sendIComponentModel(int interfaceId, int componentId, int modelId) {
		OutputStream stream = new OutputStream(9);
		stream.writePacket(player, 10);
		stream.writeInt(modelId);
		stream.writeIntLE(interfaceId << 16 | componentId);
		session.write(stream);
	}

	public void sendGrandExchangeOffer(Offer offer) {
		OutputStream stream = new OutputStream(22);
		stream.writePacket(player, 120);
		stream.writeByte(0);
		stream.writeByte(offer.getSlot());
		stream.writeByte(offer.getStage());
		if (offer.forceRemove())
			stream.skip(18);
		else {
			stream.writeShort(offer.getId());
			stream.writeInt(offer.getPrice());
			stream.writeInt(offer.getAmount());
			stream.writeInt(offer.getTotalAmmountSoFar());
			stream.writeInt(offer.getTotalPriceSoFar());
		}
		session.write(stream);
	}

	public void sendSpriteOnIComponent(int interfaceId, int componentId, int spriteId) {
		OutputStream stream = new OutputStream(11);
		stream.writePacket(player, 44);
		stream.writeIntLE(interfaceId << 16 | componentId);
		stream.writeIntV2(spriteId);
		session.write(stream);
	}

	public void sendHideIComponent(int interfaceId, int componentId, boolean hidden) {
		OutputStream stream = new OutputStream(6);
		stream.writePacket(player, 8);
		stream.write128Byte(hidden ? 1 : 0);
		stream.writeIntV2(interfaceId << 16 | componentId);
		session.write(stream);
	}

	public void sendRemoveGroundItem(FloorItem item) {
		OutputStream stream = createChunkInSceneStream(item.getTile());
		stream.writePacket(player, 71);
		stream.writeShortLE128(item.getId());
		stream.writeByte((item.getTile().getXInChunk() << 4) | item.getTile().getYInChunk());
		session.write(stream);
	}

	public void sendGroundItem(FloorItem item) {
		OutputStream stream = createChunkInSceneStream(item.getTile());
		stream.writePacket(player, 136);
		stream.writeByte((item.getTile().getXInChunk() << 4) | item.getTile().getYInChunk());
		stream.writeShort(item.getAmount());
		stream.writeShort(0);
		stream.writeShortLE(item.getId());
		session.write(stream);
	}

	public void refreshLobbyInformation() {
		OutputStream stream = new OutputStream(1);
		stream.writePacket(player, 16);
		session.write(stream);
	}

	public void refreshSomethingIdk() {
		OutputStream stream = new OutputStream(1);
		stream.writePacket(player, 29);
		// ////session.write(stream);
	}

	public void sendProjectile(Entity receiver, WorldTile startTile, WorldTile endTile, int gfxId, int startHeight,
			int endHeight, int speed, int delay, int curve, int startDistanceOffset, int creatorSize) {
		sendProjectileProper(startTile, creatorSize, creatorSize, endTile, receiver != null ? receiver.getSize() : 1,
				receiver != null ? receiver.getSize() : 1, receiver, gfxId, startHeight, endHeight, delay,
				(Utils.getDistance(startTile.getX(), startTile.getY(), endTile.getX(), endTile.getY()) * 30
						/ ((speed / 10) < 1 ? 1 : (speed / 10))),
				startDistanceOffset, curve);
	}

	public void sendProjectileProper(WorldTile from, int fromSizeX, int fromSizeY, WorldTile to, int toSizeX,
			int toSizeY, Entity lockOn, int gfxId, int startHeight, int endHeight, int delay, int speed, int slope,
			int angle) {
		WorldTile src = new WorldTile(((from.getX() << 1) + fromSizeX) >> 1, ((from.getY() << 1) + fromSizeY) >> 1,
				from.getPlane());
		WorldTile dst = new WorldTile(((to.getX() << 1) + toSizeX) >> 1, ((to.getY() << 1) + toSizeY) >> 1,
				to.getPlane());
		OutputStream stream = createChunkInSceneStream(src);
		stream.writePacket(player, 123);
		// includes a boolean here now. idk what for. 0x80
		stream.writeByte(((src.getX() & 0x7) << 3) | (src.getY() & 0x7));

		stream.writeByte(dst.getX() - src.getX());
		stream.writeByte(dst.getY() - src.getY());
		stream.writeShort(
				lockOn == null ? 0 : (lockOn instanceof Player ? -(lockOn.getIndex() + 1) : lockOn.getIndex() + 1));
		stream.writeShort(gfxId);
		stream.writeByte(startHeight);
		stream.writeByte(endHeight);
		stream.writeShort(delay);
		stream.writeShort(delay + speed);
		stream.writeByte(angle);
		stream.writeShort(slope);

		// new. idk, according to client, doesnt do anything, if 0, havent
		// checked much but it seemed to compare with target index
		stream.writeShort(0);
		session.write(stream);
	}

	public void sendProjectileNew(WorldTile from, int fromSizeX, int fromSizeY, WorldTile to, int toSizeX, int toSizeY,
			Entity fromE, Entity toE, boolean adjustFlyingHeight, boolean adjustSenderHeight, int senderBodyPartId,
			int graphicId, int startHeight, int endHeight, int startTime, int endTime, int slope, int angle,
			int unknown) {

		int fromX = from.getXInScene(player);
		int fromY = from.getYInScene(player);

		int toX = to.getXInScene(player);
		int toY = to.getYInScene(player);

		int originalFromX = fromX;
		int originalFromY = fromY;

		fromX = fromX * 2 + fromSizeX;
		fromY = fromY * 2 + fromSizeY;
		toX = toX * 2 + toSizeX;
		toY = toY * 2 + toSizeY;

		int baseChunk[] = MapUtils.decode(Structure.CHUNK, player.getSceneBaseChunkId());

		OutputStream stream = createChunkInSceneStream(
				new WorldTile(baseChunk[0] * 8 + fromX / 2, baseChunk[1] * 8 + fromY / 2, from.getPlane()));

		stream.writePacket(player, 59);

		int adjX = ((originalFromX & 0x7) * 2) + (fromX % 2);
		int adjY = ((originalFromY & 0x7) * 2) + (fromY % 2);

		int pos = 0;
		pos |= (adjX & 0xF) << 4;
		pos |= (adjY & 0xF);

		int settings = 0;
		settings |= adjustFlyingHeight ? 0x1 : 0;
		settings |= adjustSenderHeight ? 0x2 : 0;
		settings |= adjustSenderHeight ? senderBodyPartId << 2 : 0;

		stream.writeByte(pos);
		stream.writeByte(settings);
		stream.writeByte(toX - fromX);
		stream.writeByte(toY - fromY);
		stream.writeShort(
				fromE == null ? 0 : (fromE instanceof Player ? -(fromE.getIndex() + 1) : fromE.getIndex() + 1));
		stream.writeShort(toE == null ? 0 : (toE instanceof Player ? -(toE.getIndex() + 1) : toE.getIndex() + 1));
		stream.writeShort(graphicId);
		stream.writeByte(startHeight);
		stream.writeByte(endHeight);
		stream.writeShort(startTime);
		stream.writeShort(endTime);
		stream.writeByte(angle);
		stream.writeShort(slope);
		stream.writeShort(unknown);
		session.write(stream);
	}

	public void sendUnlockIComponentOptionSlots(int interfaceId, int componentId, int fromSlot, int toSlot,
			int... optionsSlots) {
		int settingsHash = 0;
		for (int slot : optionsSlots)
			settingsHash |= 2 << slot;
		sendIComponentSettings(interfaceId, componentId, fromSlot, toSlot, settingsHash);
	}

	public void sendUnlockIComponentOptionSlots(int interfaceId, int componentId, int fromSlot, int toSlot,
			boolean unlockEvent, int... optionsSlots) {
		int settingsHash = unlockEvent ? 1 : 0;
		for (int slot : optionsSlots)
			settingsHash |= 2 << slot;
		sendIComponentSettings(interfaceId, componentId, fromSlot, toSlot, settingsHash);
	}

	public void sendIComponentSettings(int interfaceId, int componentId, int fromSlot, int toSlot, int settingsHash) {
		OutputStream stream = new OutputStream(13);
		stream.writePacket(player, 174);
		stream.writeShortLE128(fromSlot);
		stream.writeShortLE(toSlot);
		stream.writeInt(interfaceId << 16 | componentId);
		stream.writeIntV1(settingsHash);
		session.write(stream);
	}

	public void sendInterFlashScript(int interfaceId, int componentId, int width, int height, int slot) {
		Object[] parameters = new Object[4];
		int index = 0;
		parameters[index++] = slot;
		parameters[index++] = height;
		parameters[index++] = width;
		parameters[index++] = interfaceId << 16 | componentId;
		sendExecuteScriptReverse(143, parameters);
	}

	public void sendInterSetItemsOptionsScript(int interfaceId, int componentId, int key, int width, int height,
			String... options) {
		sendInterSetItemsOptionsScript(interfaceId, componentId, key, false, width, height, options);
	}

	public void sendInterSetItemsOptionsScript(int interfaceId, int componentId, int key, boolean negativeKey,
			int width, int height, String... options) {
		Object[] parameters = new Object[6 + options.length];
		int index = 0;
		for (int count = options.length - 1; count >= 0; count--)
			parameters[index++] = options[count];
		parameters[index++] = -1; // dunno but always this
		parameters[index++] = 0;// dunno but always this, maybe startslot?
		parameters[index++] = height;
		parameters[index++] = width;
		parameters[index++] = key;
		parameters[index++] = interfaceId << 16 | componentId;
		sendExecuteScriptReverse(negativeKey ? 695 : 150, parameters); // scriptid
		// 150
		// does
		// that the method
		// name says*/
	}

	public void sendPouchInfusionOptionsScript(boolean dung, int interfaceId, int componentId, int slotLength,
			int width, int height, String... options) {
		Object[] parameters = new Object[5 + options.length];
		int index = 0;
		if (dung) {
			parameters[index++] = 1159;
			parameters[index++] = 1100;
		} else {
			parameters[index++] = slotLength;
			parameters[index++] = 1;
		}
		parameters[index++] = height;
		parameters[index++] = width;
		parameters[index++] = interfaceId << 16 | componentId;
		for (int count = options.length - 1; count >= 0; count--)
			parameters[index++] = options[count];
		sendExecuteScriptReverse(757, parameters);
	}

	public void sendScrollInfusionOptionsScript(boolean dung, int interfaceId, int componentId, int slotLength,
			int width, int height, String... options) {
		Object[] parameters = new Object[5 + options.length];
		int index = 0;
		if (dung) {
			parameters[index++] = 1159;
			parameters[index++] = 1100;
		} else {
			parameters[index++] = slotLength;
			parameters[index++] = 1;
		}
		parameters[index++] = height;
		parameters[index++] = width;
		parameters[index++] = interfaceId << 16 | componentId;
		for (int count = options.length - 1; count >= 0; count--)
			parameters[index++] = options[count];
		sendExecuteScriptReverse(763, parameters);
	}

	public void sendInputNameScript(String message) {
		player.getInterfaceManager().sendInputTextInterface();
		sendExecuteScript(109, new Object[] { message });
	}

	public void sendInputIntegerScript(String message) {
		player.getInterfaceManager().sendInputTextInterface();
		sendExecuteScript(108, new Object[] { message });
	}

	public void sendInputLongTextScript(String message) {
		player.getInterfaceManager().sendInputTextInterface();
		sendExecuteScript(110, new Object[] { message });
	}

	public void sendExecuteScript(int scriptId, Object... params) {
		List<Object> l = Arrays.asList(params);
		Collections.reverse(l);
		sendExecuteScriptReverse(scriptId, l.toArray());
		System.out.println(scriptId + ", " + l.toString());
	}

	public void sendExecuteScriptReverse(int scriptId, Object... params) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 15);
		String parameterTypes = "";
		if (params != null) {
			for (int count = params.length - 1; count >= 0; count--) {
				if (params[count] instanceof String)
					parameterTypes += "s"; // string
				else
					parameterTypes += "i"; // integer
			}
		}
		stream.writeString(parameterTypes);
		if (params != null) {
			int index = 0;
			for (int count = parameterTypes.length() - 1; count >= 0; count--) {
				if (parameterTypes.charAt(count) == 's')
					stream.writeString((String) params[index++]);
				else
					stream.writeInt((Integer) params[index++]);
			}
		}
		stream.writeInt(scriptId);
		stream.endPacketVarShort();
		session.write(stream);
	}

	public void sendCSVarInteger(int id, int value) {
		if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE)
			sendCSVarInteger2(id, value);
		else
			sendCSVarInteger1(id, value);
	}

	public void sendCSVarInteger1(int id, int value) {
		OutputStream stream = new OutputStream(4);
		stream.writePacket(player, 148);
		stream.writeByteC(value);
		stream.writeShort128(id);
		session.write(stream);
	}

	public void sendCSVarInteger2(int id, int value) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 131);
		stream.writeShortLE128(id);
		stream.writeIntLE(value);
		session.write(stream);
	}

	/*
	 * resets queue of sent vars from client to server
	 */
	public void sendResetNISVars() {
		OutputStream stream = new OutputStream(2);
		stream.writePacket(player, 132);
		session.write(stream);
	}

	public void sendNISVar(int id, Object value) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 154);
		stream.writeShort(id);
		if (value instanceof Integer)
			stream.writeInt((int) value);
		else if (value instanceof Long)
			stream.writeLong((long) value);
		else if (value instanceof String)
			stream.writeVersionedString((String) value);
		else {
			// TODO last type
		}
		stream.endPacketVarByte();
		session.write(stream);
	}

	@Deprecated
	public void sendVar(int id, int value) {
		if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE)
			sendVar2(id, value);
		else
			sendVar1(id, value);
	}

	public void sendVar1(int id, int value) {
		OutputStream stream = new OutputStream(4);
		stream.writePacket(player, 166);
		stream.write128Byte(value);
		stream.writeShort128(id);
		session.write(stream);
	}

	public void sendVar2(int id, int value) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 170);
		stream.writeIntLE(value);
		stream.writeShort128(id);
		session.write(stream);
	}

	public void sendRunEnergy() {
		OutputStream stream = new OutputStream(2);
		stream.writePacket(player, 111);
		stream.writeByte(player.getRunEnergy());
		session.write(stream);
	}

	public void refreshWeight() {
		OutputStream stream = new OutputStream(3);
		stream.writePacket(player, 57);
		stream.writeShort((int) player.getWeight());
		session.write(stream);
	}

	public void sendIComponentText(int interfaceId, int componentId, String text) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 34);
		stream.writeIntV1(interfaceId << 16 | componentId);
		stream.writeString(text);
		stream.endPacketVarShort();
		session.write(stream);
	}

	public void sendIComponentAnimation(int emoteId, int interfaceId, int componentId) {
		OutputStream stream = new OutputStream(9);
		stream.writePacket(player, 101);
		stream.writeIntLE(emoteId);
		stream.writeIntLE(interfaceId << 16 | componentId);
		session.write(stream);
	}

	public void sendItemOnIComponent(int interfaceid, int componentId, int id, int amount) {
		OutputStream stream = new OutputStream(11);
		stream.writePacket(player, 20);
		stream.writeIntV1(interfaceid << 16 | componentId);
		stream.writeIntLE(amount);
		stream.writeShortLE128(id);
		session.write(stream);
	}

	public void sendEntityOnIComponent(boolean isPlayer, int entityId, int interfaceId, int componentId) {
		if (isPlayer)
			sendPlayerHeadOnIComponent(interfaceId, componentId);
		else
			sendNPCHeadOnIComponent(interfaceId, componentId, entityId);
	}

	private OutputStream createChunkInSceneStream(WorldTile tile) {
		OutputStream stream = new OutputStream(4);
		stream.writePacket(player, 102);
		stream.writeByte(tile.getChunkXInScene(player));
		stream.write128Byte(tile.getPlane());
		stream.writeByte(tile.getChunkYInScene(player));
		return stream;
	}

	public void sendObjectAnimation(WorldObject object, Animation animation) {
		OutputStream stream = new OutputStream(10);
		stream.writePacket(player, 76);
		stream.writeByte(0);
		stream.writeByteC((object.getType() << 2) + (object.getRotation() & 0x3));
		stream.writeIntV2(animation.getIds()[0]);
		stream.writeIntV2(object.getTileHash());
		session.write(stream);
	}

	public void sendAppearenceLook() {
		sendAppearanceLook(player.getEquipment().getCosmeticItems().getItems(), player.getAppearence().getLook());
	}

	public void sendAppearanceLook(Item[] items, int[] look) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 177);
		stream.writeByte(player.getAppearence().isMale() ? 0 : 1);
		stream.writeBytes(player.getAppearence().getAppearenceLook(items, look));
		stream.endPacketVarShort();
		session.write(stream);
	}

	public void sendTileInterface(FloorItem item, boolean clickThrought, int windowId, int windowComponentId,
			int interfaceId) {
		int[] xteas = new int[4];
		OutputStream stream = new OutputStream(30);
		stream.writePacket(player, 90);
		stream.writeIntV1(xteas[1]);
		stream.writeShortLE(item.getId());
		stream.writeIntV1((windowId << 16) | windowComponentId);
		stream.writeIntV1(xteas[0]);
		stream.writeIntV2(xteas[3]);
		stream.writeIntLE(item.getTileHash());
		stream.writeShort128(interfaceId);
		stream.write128Byte(clickThrought ? 1 : 0);
		stream.writeIntV1(xteas[2]);
		session.write(stream);
	}

	public void sendAddObject(WorldObject object) {
		OutputStream stream = createChunkInSceneStream(object);
		stream.writePacket(player, 108);
		stream.writeIntV1(object.getId());
		stream.writeByte128((object.getType() << 2) + (object.getRotation() & 0x3));
		stream.writeByte((object.getXInChunk() << 4) | object.getYInChunk());
		session.write(stream);
	}

	public void sendRemoveObject(WorldObject object) {
		OutputStream stream = createChunkInSceneStream(object);
		stream.writePacket(player, 188);
		stream.writeByte((object.getXInChunk() << 4) | object.getYInChunk());
		stream.writeByteC((object.getType() << 2) + (object.getRotation() & 0x3));
		session.write(stream);
	}

	public void sendPlayerHeadOnIComponent(int interfaceId, int componentId) {
		OutputStream stream = new OutputStream(5);
		stream.writePacket(player, 36);
		stream.writeInt(interfaceId << 16 | componentId);
		session.write(stream);
	}

	public void sendOtherPlayerHeadOnIComponent(int interfaceId, int componentId, Player p2) {
		OutputStream stream = new OutputStream(11);
		stream.writePacket(player, 106);
		stream.writeIntLE(interfaceId << 16 | componentId);
		stream.writeIntLE(p2.getDisplayName().hashCode());
		stream.writeShortLE(p2.getIndex());
		session.write(stream);
	}

	public void sendPlayerOnIComponent(int interfaceId, int componentId) {
		OutputStream stream = new OutputStream(6);
		stream.writePacket(player, 150);
		stream.writeIntV2(interfaceId << 16 | componentId);
		stream.writeByte(0);
		session.write(stream);
	}

	public void sendOtherPlayerOnIComponent(int interfaceId, int componentId, Player p2) {
		OutputStream stream = new OutputStream(11);
		stream.writePacket(player, 129);
		stream.writeIntV1(p2.getDisplayName().hashCode());
		stream.writeIntV2(interfaceId << 16 | componentId);
		stream.writeShortLE128(p2.getIndex());
		session.write(stream);
	}

	public void sendNPCHeadOnIComponent(int interfaceId, int componentId, int npcId) {
		OutputStream stream = new OutputStream(9);
		stream.writePacket(player, 104);
		stream.writeInt(npcId);
		stream.writeIntLE(interfaceId << 16 | componentId);
		session.write(stream);
	}

	public OutputStream startFriendsChatPacket() {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 128);
		return stream;
	}

	public void sendEmptyFriendsChatChannel() {
		endFriendsChatChannel(startFriendsChatPacket());
	}

	public OutputStream startFriendsChatChannel(String owner, String name, int kickReq, int membersCount) {
		OutputStream stream = startFriendsChatPacket();
		stream.writeString(owner);
		stream.writeByte(0);
		stream.writeString(name);
		stream.writeByte(kickReq);
		stream.writeByte(membersCount);
		return stream;
	}

	public void appendFriendsChatMember(OutputStream stream, String displayName, int worldId, int rank,
			String worldName) {
		stream.writeString(displayName);
		stream.writeByte(0);
		stream.writeShort(worldId);
		stream.writeByte(rank);
		stream.writeString(worldName);
	}

	public void endFriendsChatChannel(OutputStream stream) {
		stream.endPacketVarShort();
		session.write(stream);
	}

	public void sendClanChannel(ClansManager manager, boolean myClan) {
		OutputStream stream = new OutputStream(manager == null ? 4 : manager.getClanChannelDataBlock().length + 4);
		stream.writePacketVarShort(player, 164);
		stream.writeByte(myClan ? 1 : 0);
		if (manager != null)
			stream.writeBytes(manager.getClanChannelDataBlock());
		stream.endPacketVarShort();
		session.write(stream);
	}

	public void sendClanSettings(ClansManager manager, boolean myClan) {
		OutputStream stream = new OutputStream(manager == null ? 4 : manager.getClanSettingsDataBlock().length + 4);
		stream.writePacketVarShort(player, 40);
		stream.writeByte(myClan ? 1 : 0);
		if (manager != null)
			stream.writeBytes(manager.getClanSettingsDataBlock());
		stream.endPacketVarShort();
		session.write(stream);
	}

	public void sendPlainIgnore(boolean isUpdate, String displayName, String previousDisplayName) {
		OutputStream stream = startIgnoresPacket();
		appendIgnore(stream, isUpdate, displayName, previousDisplayName);
		endIgnoresPacket(stream);
	}

	public OutputStream startIgnoresPacket() {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 127);
		return stream;
	}

	public void appendIgnore(OutputStream stream, boolean isUpdate, String displayName, String previousDisplayName) {
		stream.writeByte(isUpdate ? 0x1 : 0x0);
		stream.writeString(displayName);
		stream.writeString(previousDisplayName == null ? "" : previousDisplayName);
		stream.writeString(""); // TODO note here
	}

	public void endIgnoresPacket(OutputStream stream) {
		stream.endPacketVarShort();
		session.write(stream);
	}

	public OutputStream startFriendsPacket() {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 158);
		return stream;
	}

	public void appendFriend(OutputStream stream, boolean isStatusUpdate, String displayName,
			String previousDisplayName, int world, int fcRank, String worldName) {
		stream.writeByte(isStatusUpdate ? 0 : 1);
		stream.writeString(displayName);
		stream.writeString(previousDisplayName == null ? "" : previousDisplayName);
		stream.writeShort(world);
		stream.writeByte(fcRank);
		stream.writeByte(0); // also has a new flag here.
		if (world > 0) {
			stream.writeString(worldName);
			stream.writeByte(0);
			stream.writeInt(0); // idk. new
		}
		stream.writeString(""); // TODO note here
	}

	public void endFriendsPacket(OutputStream stream) {
		stream.endPacketVarShort();
		session.write(stream);
	}

	public void sendPrivateMessage(String target, String message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 19);
		stream.writeString(target);
		Huffman.encodeString(stream, message);
		stream.endPacketVarShort();
		session.write(stream);
	}

	public void sendPrivateQuickChatMessage(String target, int qcFileId, byte[] qcData) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 124);
		stream.writeString(target);
		stream.writeShort(qcFileId);
		if (qcData != null)
			stream.writeBytes(qcData);
		stream.endPacketVarByte();
		session.write(stream);
	}

	public void receivePrivateMessage(String target, long messageUid, int iconId, String message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 11);
		stream.writeByte(0);
		stream.writeString(target);
		for (int bitpos = 0; bitpos < 40; bitpos += 8)
			stream.writeByte((int) (messageUid >> bitpos));
		stream.writeByte(iconId > 2 ? 0 : iconId);
		Huffman.encodeString(stream, message);
		stream.endPacketVarShort();
		session.write(stream);
	}

	public void receivePrivateMessage(String target, long messageUid, int iconId, int qcFileId, byte[] qcData) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 10);
		stream.writeByte(0);
		stream.writeString(target);
		for (int bitpos = 0; bitpos < 40; bitpos += 8)
			stream.writeByte((int) (messageUid >> bitpos));
		stream.writeByte(iconId > 2 ? 0 : iconId);
		stream.writeShort(qcFileId);
		if (qcData != null)
			stream.writeBytes(qcData);
		stream.endPacketVarByte();
		// session.write(stream);
	}

	public void sendGameBarStages() {// TODO Change this when we do all tabs.
		boolean isGameOn = player.getGameStatus() != 2;
		player.getVarsManager().sendVarBit(18805, player.getGameStatus());
		player.getVarsManager().sendVarBit(18797, isGameOn ? 1 : 0);

		boolean isTradeOn = player.getTradeStatus() != 2;
		player.getVarsManager().sendVarBit(18806, player.getTradeStatus());
		player.getVarsManager().sendVarBit(18798, isTradeOn ? 1 : 0);

		boolean isAssistOn = player.getAssistStatus() != 2;
		player.getVarsManager().sendVarBit(18807, player.getAssistStatus());
		player.getVarsManager().sendVarBit(18799, isAssistOn ? 1 : 0);

		boolean isPublicOn = player.getPublicStatus() != 2;
		player.getVarsManager().sendVarBit(18808, player.getPublicStatus());
		player.getVarsManager().sendVarBit(18800, isPublicOn ? 1 : 0);

		boolean isPersonalOn = player.getPersonalStatus() != 2;
		player.getVarsManager().sendVarBit(18809, player.getPersonalStatus());
		player.getVarsManager().sendVarBit(18801, isPersonalOn ? 1 : 0);

		boolean isFriendsOn = player.getFriendsChatStatus() != 2;
		player.getVarsManager().sendVarBit(18810, player.getFriendsChatStatus());
		player.getVarsManager().sendVarBit(18802, isFriendsOn ? 1 : 0);

		boolean isClanOn = player.getClanStatus() != 2;
		player.getVarsManager().sendVarBit(18811, player.getClanStatus());
		player.getVarsManager().sendVarBit(18803, isClanOn ? 1 : 0);
		player.getVarsManager().sendVarBit(18804, isClanOn ? 1 : 0);

		// TODO announcement 20828
		// TODO CHATBADGE 21020 on ? 1 : 0
		sendOtherGameBarStages();
	}

	public void sendOtherGameBarStages() {
		OutputStream stream = new OutputStream(3);
		stream.writePacket(player, 31);
		stream.writeByteC(player.getPublicStatus());
		stream.write128Byte(player.getTradeStatus());
		session.write(stream);
	}

	public void sendPmStatus() {
		OutputStream stream = new OutputStream(2);
		stream.writePacket(player, 176);
		stream.writeByte(player.getFriendsIgnores().getPmStatus());
		session.write(stream);
	}

	public void receiveClanChatMessage(boolean myClan, String display, int rights, ChatMessage message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 69);//138, 11, 69
		stream.writeByte(myClan ? 1 : 0);
		stream.writeString(display);
		for (int i = 0; i < 5; i++)
			stream.writeByte(Utils.random(256));
		stream.writeByte(rights);
		Huffman.encodeString(stream, message.getMessage(player.isFilteringProfanity()));
		stream.endPacketVarByte();
		session.write(stream);
	}

	public void receiveClanChatQuickChatMessage(boolean myClan, String display, int rights, QuickChatMessage message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 66);//14, 66
		stream.writeByte(myClan ? 1 : 0);
		stream.writeString(display);
		for (int i = 0; i < 5; i++)
			stream.writeByte(Utils.random(256));
		stream.writeByte(rights);
		stream.writeShort(message.getDefinition().id);
		stream.endPacketVarByte();
		session.write(stream);
	}

	public void receiveFriendChatMessage(String name, String chatName, long messageUid, int iconId, String message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 72);
		stream.writeByte(0);
		stream.writeString(name);
		stream.writeString(chatName);
		for (int bitpos = 0; bitpos < 40; bitpos += 8)
			stream.writeByte((int) (messageUid >> bitpos));
		stream.writeByte(iconId > 2 ? 0 : iconId);
		Huffman.encodeString(stream, message);
		stream.endPacketVarByte();
		session.write(stream);
	}

	public void receiveFriendsChatQuickChatMessage(String name, String chatName, long messageUid, int iconId,
			int qcFileId, byte[] qcData) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 186);//14, 81, 66
		stream.writeByte(0);
		stream.writeString(name);
		stream.writeString(chatName);
		for (int bitpos = 0; bitpos < 40; bitpos += 8)
			stream.writeByte((int) (messageUid >> bitpos));
		stream.writeByte(iconId > 2 ? 0 : iconId);
		stream.writeShort(qcFileId);
		if (qcData != null)
			stream.writeBytes(qcData);
		stream.endPacketVarByte();
		session.write(stream);
	}

	public void sendDynamicGameScene(boolean sendLswp) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 92);
		if (sendLswp)
			player.getLocalPlayerUpdate().init(stream);
		int middleChunkX = player.getChunkX();
		int middleChunkY = player.getChunkY();
		stream.writeShortLE128(middleChunkY);
		stream.writeByteC(2);
		stream.writeByte128(player.getMapSize());
		stream.writeByte128(5);
		stream.writeByte128(player.isForceNextMapLoadRefresh() ? 1 : 0);
		stream.writeShortLE128(middleChunkX);
		stream.initBitAccess();
		int sceneLength = Settings.MAP_SIZES[player.getMapSize()] >> 4;
		// the regionids(maps files) that will be used to load this scene
		int[] regionIds = new int[4 * sceneLength * sceneLength];
		int newRegionIdsCount = 0;
		for (int plane = 0; plane < 4; plane++) {
			for (int realChunkX = (middleChunkX - sceneLength); realChunkX <= ((middleChunkX
					+ sceneLength)); realChunkX++) {
				int regionX = realChunkX / 8;
				y: for (int realChunkY = (middleChunkY - sceneLength); realChunkY <= ((middleChunkY
						+ sceneLength)); realChunkY++) {
					int regionY = realChunkY / 8;
					// rcx / 8 = rx, rcy / 8 = ry, regionid is encoded region x
					// and y
					int regionId = (regionX << 8) + regionY;
					Region region = World.getRegions().get(regionId);
					int newChunkX;
					int newChunkY;
					int newPlane;
					int rotation;
					if (region instanceof DynamicRegion) { // generated map
						DynamicRegion dynamicRegion = (DynamicRegion) region;
						int[] pallete = dynamicRegion.getRegionCoords()[plane][realChunkX - (regionX * 8)][realChunkY
								- (regionY * 8)];
						newChunkX = pallete[0];
						newChunkY = pallete[1];
						newPlane = pallete[2];
						rotation = pallete[3];
					} else { // real map
						newChunkX = realChunkX;
						newChunkY = realChunkY;
						newPlane = plane;
						rotation = 0;// no rotation
					}
					// invalid chunk, not built chunk
					if (newChunkX == 0 || newChunkY == 0)
						stream.writeBits(1, 0);
					else {
						stream.writeBits(1, 1);
						// chunk encoding = (x << 14) | (y << 3) | (plane <<
						// 24), theres addition of two more bits for rotation
						stream.writeBits(26, (rotation << 1) | (newPlane << 24) | (newChunkX << 14) | (newChunkY << 3));
						int newRegionId = (((newChunkX / 8) << 8) + (newChunkY / 8));
						for (int index = 0; index < newRegionIdsCount; index++)
							if (regionIds[index] == newRegionId)
								continue y;
						regionIds[newRegionIdsCount++] = newRegionId;
					}

				}
			}

		}
		stream.finishBitAccess();
		stream.writeByte(newRegionIdsCount);
		stream.endPacketVarShort();
		session.write(stream);
	}

	/*
	 * normal map region
	 */
	public void sendGameScene(boolean sendLswp) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 149);
		if (sendLswp)
			player.getLocalPlayerUpdate().init(stream);
		stream.writeShort128(player.getChunkX());
		stream.writeByte(player.isForceNextMapLoadRefresh() ? 1 : 0);
		stream.writeByte128(player.getMapSize());
		stream.writeByte((1 << 65 + 1) + 1);
		stream.writeByteC(player.getMapRegionsIds().size());
		stream.writeShortLE(player.getChunkY());
		stream.endPacketVarShort();
		session.write(stream);
	}

	public void sendCutscene(int id) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 94);
		stream.writeShort(id);
		stream.writeShort(20); // xteas count
		/*
		 * for (int count = 0; count < 20; count++) // xteas for (int i = 0; i <
		 * 4; i++) stream.writeInt(0);
		 */
		byte[] appearence = player.getAppearence().getAppeareanceData();
		stream.writeByte(appearence.length);
		stream.writeBytes(appearence);
		stream.endPacketVarShort();
		session.write(stream);
	}

	/*
	 * sets the pane interface
	 */
	public void sendRootInterface(int id, int type) {
		int[] xteas = new int[4];
		player.getInterfaceManager().setWindowsPane(id);
		OutputStream stream = new OutputStream(20);
		stream.writePacket(player, 137);
		stream.writeByte128(type);
		stream.writeIntLE(xteas[0]);
		stream.writeIntV2(xteas[2]);
		stream.writeIntV2(xteas[1]);
		stream.writeShort128(id);
		stream.writeIntV1(xteas[3]);
		session.write(stream);
	}

	public void sendPlayerOption(String option, int slot, boolean top) {
		sendPlayerOption(option, slot, top, -1);
	}

	public void sendPublicMessage(Player p, PublicChatMessage message) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 85);
		stream.writeShort(p.getIndex());
		stream.writeShort(message.getEffects());
		stream.writeByte(p.getMessageIcon() > 2 ? 0 : p.getMessageIcon());
		if (message instanceof QuickChatMessage) {
			QuickChatMessage qcMessage = (QuickChatMessage) message;
			stream.writeShort(qcMessage.getDefinition().id);
			stream.writeBytes(qcMessage.getEncoded());
		} else {
			Huffman.encodeString(stream, message.getMessage(player.isFilteringProfanity()));
		}
		stream.endPacketVarByte();
		session.write(stream);
	}

	public void sendPlayerOption(String option, int slot, boolean top, int cursor) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 42);
		stream.writeShortLE(cursor);
		stream.writeString(option);
		stream.writeByteC(slot);
		stream.writeByte(top ? 1 : 0);
		stream.endPacketVarByte();
		session.write(stream);
	}

	/*
	 * sends local players update
	 */
	public void sendLocalPlayersUpdate() {
		session.write(player.getLocalPlayerUpdate().createPacketAndProcess());
	}

	/*
	 * sends local npcs update
	 */
	public void sendLocalNPCsUpdate() {
		session.write(player.getLocalNPCUpdate().createPacketAndProcess());
	}

	public void sendGraphics(Graphics graphics, Object target) {
		OutputStream stream = new OutputStream(13);
		int hash = 0;
		if (target instanceof Player) {
			Player p = (Player) target;
			hash = p.getIndex() & 0xffff | 1 << 28;
		} else if (target instanceof NPC) {
			NPC n = (NPC) target;
			hash = n.getIndex() & 0xffff | 1 << 29;
		} else {
			WorldTile tile = (WorldTile) target;
			hash = tile.getPlane() << 28 | tile.getX() << 14 | tile.getY() & 0x3fff | 1 << 30;
		}
		stream.writePacket(player, 121);
		stream.writeShortLE128(graphics.getSpeed());
		stream.write128Byte(0);
		stream.writeShort128(graphics.getId());
		stream.write128Byte(graphics.getSettings2Hash());
		stream.writeShort(graphics.getHeight());
		stream.writeInt(hash);
		session.write(stream);
	}

	public void sendEntityInterface(Entity entity, boolean clickThrought, int windowId, int windowComponentId,
			int interfaceId) {
		if (entity instanceof NPC)
			sendNPCInterface((NPC) entity, clickThrought, windowId, windowComponentId, interfaceId);
		else
			sendPlayerInterface((Player) entity, clickThrought, windowId, windowComponentId, interfaceId);
	}

	public void sendPlayerInterface(Player p, boolean clickThrought, int windowId, int windowComponentId,
			int interfaceId) {
		int[] xteas = new int[4];
		OutputStream stream = new OutputStream(26);
		stream.writePacket(player, 54);
		stream.writeIntV2(xteas[2]);
		stream.writeByte128(clickThrought ? 1 : 0);
		stream.writeShortLE(interfaceId);
		stream.writeIntLE(xteas[3]);
		stream.writeShortLE128(p.getIndex());
		stream.writeIntV2(xteas[0]);
		stream.writeIntLE(windowId << 16 | windowComponentId);
		stream.writeIntLE(xteas[1]);
		session.write(stream);
	}

	public void sendNPCInterface(NPC npc, boolean clickThrought, int windowId, int windowComponentId, int interfaceId) {
		int[] xteas = new int[4];
		OutputStream stream = new OutputStream(26);
		stream.writePacket(player, 109);
		stream.writeIntV2(xteas[0]);
		stream.writeShort(npc.getIndex());
		stream.writeIntV2(windowId << 16 | windowComponentId);
		stream.writeIntLE(xteas[1]);
		stream.writeByteC(clickThrought ? 1 : 0);
		stream.writeShort(interfaceId);
		stream.writeIntLE(xteas[3]);
		stream.writeIntV2(xteas[2]);
		session.write(stream);
	}

	public void sendObjectInterface(WorldObject object, boolean clickThrought, int windowId, int windowComponentId,
			int interfaceId) {
		int[] xteas = new int[4];
		OutputStream stream = new OutputStream(33);
		stream.writePacket(player, 27);
		stream.writeIntLE(xteas[2]);
		stream.writeIntV2(object.getTileHash());
		stream.writeByte128((object.getType() << 2) | (object.getRotation() & 0x3));
		stream.writeIntV2((windowId << 16) | windowComponentId);
		stream.writeInt(xteas[0]);
		stream.writeIntV2(xteas[3]);
		stream.writeShortLE128(interfaceId);
		stream.writeInt(xteas[1]);
		stream.writeByte128(clickThrought ? 1 : 0);
		stream.writeIntV2(object.getId());
		session.write(stream);
	}

	public void sendConfig(int id, int value) {
		player.getVarsManager().sendVar(id, value);
	}

	public void sendInterface(boolean clickThrough, int parentUID, int interfaceId) {
		int[] xteas = new int[4];
		OutputStream stream = new OutputStream(24);
		stream.writePacket(player, 167);
		stream.writeInt(xteas[3]);
		stream.writeIntLE(xteas[2]);
		stream.writeInt(xteas[0]);
		stream.writeInt(parentUID);
		stream.writeShort128(interfaceId);
		stream.write128Byte(clickThrough ? 1 : 0);
		stream.writeIntV2(xteas[1]);
		session.write(stream);
	}

	public void closeInterface(int parentUID) {
		OutputStream stream = new OutputStream(5);
		stream.writePacket(player, 180);
		stream.writeIntV2(parentUID);
		session.write(stream);
	}

	public void moveInterface(int fromParentUID, int toParentUID) {
		OutputStream stream = new OutputStream(9);
		stream.writePacket(player, 112);
		stream.writeInt(fromParentUID);
		stream.writeIntV2(toParentUID);
		session.write(stream);
	}

	public void sendSystemUpdate(int delay, boolean isLobby) {
		OutputStream stream = new OutputStream(3);
		stream.writePacket(player, 156);
		if (isLobby)
			stream.writeShort(delay * 20);
		else
			stream.writeShort((int) (delay * 1.6)); // x2 correct.
		session.write(stream);
	}

	public void sendCurrentTarget(Entity target) {
		OutputStream stream = new OutputStream(3);
		stream.writePacket(player, 3);
		stream.writeShortLE128(
				target == null ? 0 : (target instanceof Player ? -(target.getIndex() + 1) : target.getIndex() + 1));
		session.write(stream);
	}

	public void sendUpdateItems(int key, ItemsContainer<Item> items, int... slots) {
		sendUpdateItems(key, items.getItems(), slots);
	}

	public void sendUpdateItems(int key, ItemsContainer<Item> items, boolean nis, int... slots) {
		sendUpdateItems(key, items.getItems(), nis, slots);
	}

	public void sendUpdateItems(int key, Item[] items, boolean nis, int... slots) {
		sendUpdateItems(key, key < 0, items, nis, slots);
	}

	public void sendUpdateItems(int key, Item[] items, int... slots) {
		sendUpdateItems(key, key < 0, items, false, slots);
	}

	public void sendUpdateItems(int key, boolean negativeKey, Item[] items, boolean nis, int... slots) {// 138
		int mask = 0x0;
		if (negativeKey) {
			mask |= 0x1;
		}
		if (nis) {
			mask |= 0x2;
		}
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 95);
		stream.writeShort(key);
		stream.writeByte(mask);
		for (int slotId : slots) {
			if (slotId >= items.length) {
				continue;
			}
			stream.writeSmart(slotId);
			int id = -1;
			int amount = 0;
			Item item = items[slotId];
			if (item != null) {
				id = item.getId();
				amount = item.getAmount();
			}
			stream.writeShort(id + 1);
			if (id != -1) {
				stream.writeByte(amount >= 255 ? 255 : amount);
				if (amount >= 255) {
					stream.writeInt(amount);
				}
				if (nis) {// extra boolean in client
					int var = 0;// sends as 0
					stream.writeByte(var);
					if (var > 0) {
						int nisId = 0;
						Object value = 0;
						while (var-- > 0) {
							stream.writeShort(nisId);
							if (value instanceof Integer)
								stream.writeInt((int) value);
							else if (value instanceof Long)
								stream.writeLong((long) value);
							else if (value instanceof String)
								stream.writeVersionedString((String) value);
							else {
								// TODO last type
							}
						}
					}
				}
			}
		}
		stream.endPacketVarShort();
		session.write(stream);
	}

	public void sendCSVarString(int id, String string) {
		OutputStream stream = new OutputStream();
		if (string.length() >= 253) {
			stream.writePacketVarShort(player, 22);
			stream.writeShortLE(id);
			stream.writeString(string);
			stream.endPacketVarShort();
		} else {
			stream.writePacketVarByte(player, 143);
			stream.writeShortLE(id);
			stream.writeString(string);
			stream.endPacketVarByte();
		}
		session.write(stream);
	}

	public void sendItems(int key, ItemsContainer<Item> items) {
		sendItems(key, key < 0, items, false);
	}

	public void sendItems(int key, ItemsContainer<Item> items, boolean nis) {
		sendItems(key, key < 0, items, nis);
	}

	public void sendItems(int key, boolean negativeKey, ItemsContainer<Item> items) {
		sendItems(key, negativeKey, items.getItems(), false);
	}

	public void sendItems(int key, Item[] items) {
		sendItems(key, key < 0, items, false);
	}

	public void sendItems(int key, boolean negativeKey, ItemsContainer<Item> items, boolean nis) {
		sendItems(key, negativeKey, items.getItems(), nis);
	}

	public void sendItems(int key, Item[] items, boolean nis) {
		sendItems(key, key < 0, items, nis);
	}

	public void sendItems(int key, boolean negativeKey, Item[] items, boolean nis) {// 77
		int mask = 0x0;
		if (negativeKey) {
			mask |= 0x1;
		}
		if (nis) {
			mask |= 0x2;
		}
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 6);
		stream.writeShort(key); // negativeKey ? -key : key
		stream.writeByte(mask);
		stream.writeShort(items.length);
		for (int index = 0; index < items.length; index++) {
			Item item = items[index];
			int id = -1;
			int amount = 0;
			if (item != null) {
				id = item.getId();
				amount = item.getAmount();
			}
			stream.writeShort(id + 1);
			stream.writeByte(amount >= 255 ? 255 : amount);
			if (amount >= 255) {
				stream.writeInt(amount);
			}
			if (nis) {// extra boolean in client
				int var = 0;// sends as 0
				stream.writeByte(var);
				if (var > 0) {
					int nisId = 0;
					Object value = 0;
					while (var-- > 0) {
						stream.writeShort(nisId);
						if (value instanceof Integer)
							stream.writeInt((int) value);
						else if (value instanceof Long)
							stream.writeLong((long) value);
						else if (value instanceof String)
							stream.writeVersionedString((String) value);
						else {
							// TODO last type
						}
					}
				}
			}
		}
		stream.endPacketVarShort();
		session.write(stream);
	}

	public ChannelFuture sendLogout(boolean lobby) {
		OutputStream stream = new OutputStream();
		stream.writePacket(player, lobby ? 61 : 105);
		return session.write(stream);
	}

	public void sendInventoryMessage(int border, int slotId, String message) {
		sendInterfaceMessage(Inventory.INVENTORY_INTERFACE, 34, border, slotId, message);
	}

	public void sendInterfaceMessage(int interfaceId, int componentId, int border, int slotId, String message) {
		sendGameMessage(message);
		sendExecuteScript(7774, message, interfaceId << 16 | componentId, slotId, border);
	}

	public void sendEntityMessage(int border, int color, Entity entity, String message) {
		sendGameMessage(message);
		sendCSVarString(2251, message);
		sendCSVarInteger(1699, color);
		sendCSVarInteger(1700, border);
		sendCSVarInteger(1695, 1);
		sendEntityInterface(entity, true, InterfaceManager.RESIZABLE_WINDOW_ID, 19, 1177);
	}

	public void sendObjectMessage(int border, int color, WorldObject object, String message, boolean sendGameMessage) {
		if (sendGameMessage)
			sendGameMessage(message);
		sendCSVarString(2251, message);
		sendCSVarInteger(1699, color);
		sendCSVarInteger(1700, border);
		sendCSVarInteger(1695, 1);
		sendObjectInterface(object, true, InterfaceManager.RESIZABLE_WINDOW_ID, 19, 1177);
	}

	public void sendTileMessage(int border, int color, FloorItem item, String message, boolean sendGameMessage) {
		if (sendGameMessage)
			sendGameMessage(message);
		sendCSVarString(2251, message);
		sendCSVarInteger(1699, color);
		sendCSVarInteger(1700, border);
		sendCSVarInteger(1695, 1);
		sendTileInterface(item, true, InterfaceManager.RESIZABLE_WINDOW_ID, 19, 1177);
	}

	public void sendForceGameMessage(String text) {
		sendMessage(11, text, null);
	}

	public void sendForceGameMessage(int color, String text) {
		sendMessage(11, color + text, null);
	}

	public void sendGameMessage(int color, String text) {
		sendGameMessage(color + text, false);
	}

	public void sendGameMessage(int color, String text, boolean filter) {
		sendMessage(filter ? 109 : 0, color + text, null);
	}

	public void sendGameMessage(String text) {
		sendGameMessage(text, false);
	}

	public void sendGameMessage(String text, boolean filter) {
		sendMessage(filter ? 109 : 0, text, null);
	}

	public void sendGoblinRaidMessage(String text) {
		sendMessage(121, text, null);
	}

	public void sendDemonRaidMessage(String text) {
		sendMessage(122, text, null);
	}

	public void sendSinkholeMessage(String text) {
		sendMessage(123, text, null);
	}

	public void sendWarbandsMessage(String text) {
		sendMessage(124, text, null);
	}

	public void sendWorldEventMessage(String text) {
		sendMessage(126, text, null);
	}

	public void sendPanelBoxMessage(String text) {
		sendMessage(99, text, null); // panel
		sendMessage(0, text, null); // normal
	}

	public void sendTradeRequestMessage(Player p) {
		sendMessage(100, "wishes to trade with you.", p);
	}

	public void sendClanWarsRequestMessage(Player p) {
		sendMessage(101, "wishes to challenge your clan to a clan war.", p);
	}

	public void sendClanInviteMessage(Player p) {
		sendMessage(117, p.getDisplayName() + " is inviting you to join their clan.", p);
	}

	public void sendDuelChallengeRequestMessage(Player p, boolean friendly) {
		sendMessage(101, "wishes to duel with you(" + (friendly ? "friendly" : "stake") + ").", p);
	}

	public void sendDungeonneringRequestMessage(Player p) {
		sendMessage(111, "has invited you to a dungeon party.", p);
	}

	public void sendMessage(int type, String text, Player p) {
		int maskData = 0;
		if (p != null) {
			maskData |= 0x1;
			maskData |= 0x2;
		}
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 110);
		stream.writeSmart(type);
		stream.writeInt(player.getTileHash()); // junk, not used by client
		stream.writeByte(maskData);
		if ((maskData & 0x1) != 0) {
			stream.writeString(Utils.formatPlayerNameForDisplay(p.getUsername()));
			stream.writeString(p.getDisplayName());
		}
		stream.writeString(text);
		stream.endPacketVarByte();
		session.write(stream);
	}

	public void sendSoundEffect(int id) {
		sendSoundEffect(id, 0, 255);
	}

	public void sendSoundEffect(int id, int delay, int volume) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 155);
		stream.writeShort(id);
		stream.writeByte(1);
		stream.writeShort(delay);
		stream.writeByte(volume);
		session.write(stream);
	}

	public void sendVoice(int id) {
		resetSoundEffects();
		sendSoundEffect(id, 0, 255);
	}

	public void resetSoundEffects() {
		OutputStream stream = new OutputStream(1);
		stream.writePacket(player, 103);
		session.write(stream);
	}

	public void sendMusicEffect(int archiveId, int volume) {
		OutputStream stream = new OutputStream(4);
		stream.writePacket(player, 89);
		stream.writeShortLE(archiveId);
		stream.write128Byte(volume);
		session.write(stream);
	}

	public void sendMusicEffect(int archiveId) {
		sendMusicEffect(archiveId, 0);
	}

	public void sendMusic(int archiveId, int volume) {
		OutputStream stream = new OutputStream(4);
		stream.writePacket(player, 134);
		stream.writeShortLE(archiveId);
		stream.writeByte(volume);
		session.write(stream);
	}

	/*public void resetMusic(int archiveId) {
		OutputStream stream = new OutputStream(3);
		stream.writePacket(player, 108);
		stream.writeShort(archiveId); 
		////// session.write(stream); }
	}*/

	public void sendSkillLevel(int skill) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 4);
		stream.writeByte128(skill);
		stream.writeByteC(player.getSkills().getLevel(skill));
		stream.writeIntLE((int) player.getSkills().getXp(skill));
		session.write(stream);
	}

	public void sendBlackOut(int area) {
		OutputStream stream = new OutputStream(2);
		stream.writePacket(player, 147);
		stream.writeByte(area);
		session.write(stream);
	}

	public void sendCameraLook(int viewLocalX, int viewLocalY, int viewZ) {
		sendCameraLook(viewLocalX, viewLocalY, viewZ, -1, -1);
	}

	public void sendCameraLook(int viewLocalX, int viewLocalY, int viewZ, int speed1, int speed2) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 17);
		stream.writeByteC(viewLocalY);
		stream.writeByteC(viewLocalX);
		stream.writeByteC(speed2);
		stream.writeShort(viewZ >> 2);
		stream.writeByteC(speed1);
		session.write(stream);
	}

	public void sendCameraPosition(int moveLocalX, int moveLocalY, int moveZ, int speed1, int speed2) {
		OutputStream stream = new OutputStream(7);
		stream.writePacket(player, 64);
		stream.writeByte128(moveLocalY);
		stream.writeByte(speed1);
		stream.writeShortLE128(moveZ >> 2);
		stream.write128Byte(speed2);
		stream.write128Byte(moveLocalX);
		session.write(stream);
	}

	public void sendResetCamera() {
		OutputStream stream = new OutputStream(1);
		stream.writePacket(player, 189);
		session.write(stream);
	}

	public void sendCameraRotation(int localX, int localY) {
		OutputStream stream = new OutputStream(5);
		stream.writePacket(player, 84);
		stream.writeShortLE128(localX);
		stream.write128Byte(localY);
		session.write(stream);
	}

	public void sendCameraPos(int moveLocalX, int moveLocalY, int moveZ) {
		sendCameraPosition(moveLocalX, moveLocalY, moveZ, -1, -1);
	}

	public void sendClientConsoleCommand(String command) {//not used
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 89);
		stream.writeString(command);
		stream.endPacketVarByte();
		//// session.write(stream);
	}

	public void sendOpenURL(String url) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 162);
		stream.writeByte(0);
		stream.writeString(url);
		stream.endPacketVarShort();
		session.write(stream);
	}

	public void sendSetMouse(String walkHereReplace, int cursor) {
		OutputStream stream = new OutputStream();
		stream.writePacketVarByte(player, 159);
		stream.writeString(walkHereReplace);
		stream.writeShort(cursor);
		stream.endPacketVarByte();
		session.write(stream);
	}

	public void sendItemsLook() {
		// currently disabled
		OutputStream stream = new OutputStream(2);
		stream.writePacket(player, 159);
		stream.writeByte(player.isOldItemsLook() ? 1 : 0);
		// //////session.write(stream);
	}

	public void sendLogReq(String file) {
		// currently disabled
		OutputStream stream = new OutputStream();
		stream.writePacketVarShort(player, 132);
		stream.writeString(file);
		stream.endPacketVarShort();
		// //// //////session.write(stream);
	}

	public void sendConfigByFile(int id, int value) {
		player.getVarsManager().sendVarBit(id, value);
	}
	
	public void sendSkyBox(int id) {
        OutputStream stream = new OutputStream();
        stream.writePacketVarShort(player, 10);

        stream.writeShort(511); // Skybox Enabling 511
        stream.writeShort(-1610678017);
        stream.writeFloat(-9.664266E33f);
        stream.writeFloat(2.2665E-41f);
        stream.writeFloat(2.2435E-41f);
        stream.writeInt(64);
        stream.writeShort(18298);
        stream.writeShort(2641);
        stream.writeFloat(3.3009536E-31f);

        stream.endPacketVarShort();
        session.write(stream);
    }
}