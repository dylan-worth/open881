/* TwitchEventChatMessage - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;
import com.jagex.Class590;

public class TwitchEventChatMessage extends TwitchEvent
{
    public String name;
    public String message;
    public int nameColourARGB;
    public int modes;
    public int subscriptions;
    public boolean isAction;
    
    public TwitchEventChatMessage(int i, String string, String string_0_,
				  int i_1_, int i_2_, int i_3_, boolean bool) {
	super(i);
	name = string;
	message = string_0_;
	nameColourARGB = i_1_;
	modes = i_2_;
	subscriptions = i_3_;
	isAction = bool;
    }
    
    public void method6699(int[] is, long[] ls, Object[] objects) {
	objects[0] = name;
	objects[1] = message;
    }
    
    public Class590 method6700() {
	return Class590.aClass590_7813;
    }
    
    public Class590 method6701() {
	return Class590.aClass590_7813;
    }
    
    public Class590 method6702() {
	return Class590.aClass590_7813;
    }
    
    public void method6703(int[] is, long[] ls, Object[] objects) {
	objects[0] = name;
	objects[1] = message;
    }
    
    public void method6704(int[] is, long[] ls, Object[] objects) {
	objects[0] = name;
	objects[1] = message;
    }
    
    public void method6705(int[] is, long[] ls, Object[] objects) {
	objects[0] = name;
	objects[1] = message;
    }
}
