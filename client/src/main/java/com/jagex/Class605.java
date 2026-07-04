/* Class605 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class605 implements Interface76
{
    int anInt7976;
    static Class605 aClass605_7977 = new Class605(0);
    static Class605 aClass605_7978;
    static Class605 aClass605_7979 = new Class605(1);
    static int anInt7980;
    
    static {
	aClass605_7978 = new Class605(2);
    }
    
    public int method93() {
	return 301997043 * anInt7976;
    }
    
    public static Class605[] method10032() {
	return (new Class605[]
		{ aClass605_7979, aClass605_7977, aClass605_7978 });
    }
    
    public int method22() {
	return 301997043 * anInt7976;
    }
    
    public int method53() {
	return 301997043 * anInt7976;
    }
    
    Class605(int i) {
	anInt7976 = i * -1805716165;
    }
    
    public static Class605[] method10033() {
	return (new Class605[]
		{ aClass605_7979, aClass605_7977, aClass605_7978 });
    }
    
    static void method10034(long[] ls, Object[] objects, int i, int i_0_,
			    int i_1_) {
	if (i < i_0_) {
	    int i_2_ = (i_0_ + i) / 2;
	    int i_3_ = i;
	    long l = ls[i_2_];
	    ls[i_2_] = ls[i_0_];
	    ls[i_0_] = l;
	    Object object = objects[i_2_];
	    objects[i_2_] = objects[i_0_];
	    objects[i_0_] = object;
	    int i_4_ = 9223372036854775807L == l ? 0 : 1;
	    for (int i_5_ = i; i_5_ < i_0_; i_5_++) {
		if (ls[i_5_] < l + (long) (i_5_ & i_4_)) {
		    long l_6_ = ls[i_5_];
		    ls[i_5_] = ls[i_3_];
		    ls[i_3_] = l_6_;
		    Object object_7_ = objects[i_5_];
		    objects[i_5_] = objects[i_3_];
		    objects[i_3_++] = object_7_;
		}
	    }
	    ls[i_0_] = ls[i_3_];
	    ls[i_3_] = l;
	    objects[i_0_] = objects[i_3_];
	    objects[i_3_] = object;
	    method10034(ls, objects, i, i_3_ - 1, 1861648409);
	    method10034(ls, objects, 1 + i_3_, i_0_, 1946022655);
	}
    }
    
    static final void method10035(Class669 class669, int i) {
	Class702 class702 = Class625.method10331(-585651824);
	String string = Class393.method6555((byte) 11);
	if (string == null)
	    string = "";
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class702.method93();
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = string;
    }
    
    static final void method10036(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.anInt11026 * 655301323;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -1383240089 * client.anInt11025;
    }
    
    public static void method10037(int i, int i_8_, int i_9_,
				   Class602 class602, byte i_10_) {
	for (Class534_Sub16 class534_sub16
		 = ((Class534_Sub16)
		    Class534_Sub16.aClass700_10468.method14135((byte) -1));
	     null != class534_sub16;
	     class534_sub16 = (Class534_Sub16) Class534_Sub16
						   .aClass700_10468
						   .method14139(1912329841)) {
	    if (class534_sub16.anInt10471 * 377042463 == i
		&& i_8_ << 9 == class534_sub16.anInt10472 * 1285097747
		&& i_9_ << 9 == -1700987663 * class534_sub16.anInt10473
		&& (-1562722583 * class602.anInt7887
		    == (class534_sub16.aClass602_10481.anInt7887
			* -1562722583))) {
		if (null != class534_sub16.aClass491_10492) {
		    class534_sub16.aClass491_10492.method8014(100, 1962988118);
		    Class171_Sub4.aClass232_9944.method4234((class534_sub16
							     .aClass491_10492),
							    -654169156);
		    class534_sub16.aClass491_10492 = null;
		}
		class534_sub16.method8892((byte) 1);
		break;
	    }
	}
    }
}
