/* TwitchEventChatUserInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;
import com.jagex.Class590;

public class TwitchEventChatUserInfo extends TwitchEvent
{
    public String displayName;
    public int userState;
    public int nameColourARGB;
    public boolean ignore;
    public int modes;
    public int subscriptions;
    
    public TwitchEventChatUserInfo(int i, int i_0_, String string, int i_1_,
				   boolean bool, int i_2_, int i_3_) {
	super(i);
	userState = i_0_;
	displayName = string;
	nameColourARGB = i_1_;
	ignore = bool;
	modes = i_2_;
	subscriptions = i_3_;
    }
    
    public Class590 method6700() {
	return null;
    }
    
    public void method6699(int[] is, long[] ls, Object[] objects) {
	/* empty */
    }
    
    public Class590 method6701() {
	return null;
    }
    
    public Class590 method6702() {
	return null;
    }
    
    public void method6703(int[] is, long[] ls, Object[] objects) {
	/* empty */
    }
    
    public void method6704(int[] is, long[] ls, Object[] objects) {
	/* empty */
    }
    
    public void method6705(int[] is, long[] ls, Object[] objects) {
	/* empty */
    }
}
