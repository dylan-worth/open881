/* Class200_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;

public class Class200_Sub13 extends Class200
{
    int anInt9935;
    long aLong9936;
    public static int anInt9937;
    
    Class200_Sub13(Class534_Sub40 class534_sub40, boolean bool) {
	super(class534_sub40);
	int i = class534_sub40.method16529((byte) 1);
	if (bool)
	    aLong9936 = -3385536648515296051L * (0x100000000L | (long) i);
	else
	    aLong9936 = (long) i * -3385536648515296051L;
	anInt9935 = class534_sub40.method16533(-258848859) * -862810263;
    }
    
    public void method3846() {
	Class534_Sub39 class534_sub39
	    = ((Class534_Sub39)
	       Class201.aClass9_2180
		   .method579(aLong9936 * 2577283044914538501L));
	if (null != class534_sub39)
	    class534_sub39.anInt10807 = anInt9935 * -1121957905;
	else
	    Class201.aClass9_2180.method581(new Class534_Sub39(anInt9935
							       * -1367150375),
					    aLong9936 * 2577283044914538501L);
    }
    
    public void method3845(int i) {
	Class534_Sub39 class534_sub39
	    = ((Class534_Sub39)
	       Class201.aClass9_2180
		   .method579(aLong9936 * 2577283044914538501L));
	if (null != class534_sub39)
	    class534_sub39.anInt10807 = anInt9935 * -1121957905;
	else
	    Class201.aClass9_2180.method581(new Class534_Sub39(anInt9935
							       * -1367150375),
					    aLong9936 * 2577283044914538501L);
    }
    
    public void method3847() {
	Class534_Sub39 class534_sub39
	    = ((Class534_Sub39)
	       Class201.aClass9_2180
		   .method579(aLong9936 * 2577283044914538501L));
	if (null != class534_sub39)
	    class534_sub39.anInt10807 = anInt9935 * -1121957905;
	else
	    Class201.aClass9_2180.method581(new Class534_Sub39(anInt9935
							       * -1367150375),
					    aLong9936 * 2577283044914538501L);
    }
    
    public static int method15588(String string, boolean bool, byte i) {
	string = string.toLowerCase();
	Class703.anIntArray8823 = null;
	Class70.anInt743 = 0;
	LinkedList linkedlist = new LinkedList();
	LinkedList linkedlist_0_ = new LinkedList();
	int i_1_ = bool ? 32768 : 0;
	int i_2_
	    = ((bool ? 64767945 * RuntimeException_Sub4.aClass56_12127.anInt448
		: RuntimeException_Sub4.aClass56_12127.anInt450 * -1840898795)
	       + i_1_);
	for (int i_3_ = i_1_; i_3_ < i_2_; i_3_++) {
	    Class534_Sub18_Sub12 class534_sub18_sub12
		= RuntimeException_Sub4.aClass56_12127.method1218(i_3_,
								  -1581069180);
	    if (class534_sub18_sub12.aBool11799
		&& class534_sub18_sub12.method18359((short) 255).toLowerCase
		       ().indexOf(string) != -1) {
		if (linkedlist.size() >= 50)
		    return -1;
		linkedlist.add(Integer.valueOf(i_3_));
		linkedlist_0_
		    .add(class534_sub18_sub12.method18359((short) 255));
	    }
	}
	Class703.anIntArray8823 = new int[linkedlist.size()];
	int i_4_ = 0;
	Iterator iterator = linkedlist.iterator();
	while (iterator.hasNext()) {
	    Integer integer = (Integer) iterator.next();
	    Class703.anIntArray8823[i_4_++] = integer.intValue();
	}
	String[] strings
	    = ((String[])
	       linkedlist_0_
		   .toArray(new String[Class703.anIntArray8823.length]));
	Class588.method9869(strings, Class703.anIntArray8823, (byte) 6);
	return linkedlist.size();
    }
}
