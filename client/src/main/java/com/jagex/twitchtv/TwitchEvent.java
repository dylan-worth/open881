/* TwitchEvent - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;
import com.jagex.Class590;

public abstract class TwitchEvent
{
    public int eventType;
    
    public TwitchEvent(int i) {
	eventType = i;
    }
    
    public abstract void method6699(int[] is, long[] ls, Object[] objects);
    
    public abstract Class590 method6700();
    
    public abstract Class590 method6701();
    
    public abstract Class590 method6702();
    
    public abstract void method6703(int[] is, long[] ls, Object[] objects);
    
    public abstract void method6704(int[] is, long[] ls, Object[] objects);
    
    public abstract void method6705(int[] is, long[] ls, Object[] objects);
}
