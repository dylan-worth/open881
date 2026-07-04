package com.rs.tools;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.rs.cache.Cache;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.utils.Utils;

public class NPCListDumper {

	public static final void main(String[] args) throws IOException {
		Cache.init();
		BufferedWriter writer = new BufferedWriter(new FileWriter("lists/npcList881.txt"));
		for (int i = 0; i < Utils.getNPCDefinitionsSize(); i++) {
			NPCDefinitions defs = NPCDefinitions.getNPCDefinitions(i);
			if (defs != null && defs.getName() != null) {
				writer.flush();
				writer.newLine();
				writer.write(i + " - " + defs.name);
			}
		}
	}
}