/* Class477 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.List;

final class Class477 implements Interface11
{
    public static List aList5190;
    public static String aString5191;
    
    public Object method74(Class534_Sub40 class534_sub40) {
	return Integer.valueOf(class534_sub40.method16533(-258848859));
    }
    
    public Object method76(Class534_Sub40 class534_sub40) {
	return Integer.valueOf(class534_sub40.method16533(-258848859));
    }
    
    public Object method75(Class534_Sub40 class534_sub40, int i) {
	return Integer.valueOf(class534_sub40.method16533(-258848859));
    }
    
    public Object method77(Class534_Sub40 class534_sub40) {
	return Integer.valueOf(class534_sub40.method16533(-258848859));
    }
    
    public static void method7780(Class185 class185, long l) {
	class185.method3280();
	Class574.aLinkedList7701.clear();
	Class574.aLinkedList7702.clear();
	Class574.aLong7707
	    = -6716390560235218895L * ((long) (1895832897 * Class574.anInt7691)
				       + l);
    }
    
    static final void method7781(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	Class534_Sub18_Sub2 class534_sub18_sub2
	    = ((Class534_Sub18_Sub2)
	       Class219.aClass44_Sub19_2306.method91((class669.anIntArray8595
						      [(2088438307
							* (class669
							   .anInt8600))]),
						     -2081988667));
	int i_0_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	int i_1_ = -1;
	for (int i_2_ = 0; i_2_ < 440511809 * class534_sub18_sub2.anInt11369;
	     i_2_++) {
	    if (i_0_ == class534_sub18_sub2.anIntArray11370[i_2_]) {
		i_1_ = class534_sub18_sub2.anIntArray11368[i_2_];
		break;
	    }
	}
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_1_;
    }
    
    public static String method7782(byte[] is, int i, int i_3_, byte i_4_) {
	char[] cs = new char[i_3_];
	int i_5_ = 0;
	int i_6_ = i;
	int i_7_ = i + i_3_;
	while (i_6_ < i_7_) {
	    int i_8_ = is[i_6_++] & 0xff;
	    int i_9_;
	    if (i_8_ < 128) {
		if (0 == i_8_)
		    i_9_ = 65533;
		else
		    i_9_ = i_8_;
	    } else if (i_8_ < 192)
		i_9_ = 65533;
	    else if (i_8_ < 224) {
		if (i_6_ < i_7_ && (is[i_6_] & 0xc0) == 128) {
		    i_9_ = (i_8_ & 0x1f) << 6 | is[i_6_++] & 0x3f;
		    if (i_9_ < 128)
			i_9_ = 65533;
		} else
		    i_9_ = 65533;
	    } else if (i_8_ < 240) {
		if (i_6_ + 1 < i_7_ && (is[i_6_] & 0xc0) == 128
		    && (is[i_6_ + 1] & 0xc0) == 128) {
		    i_9_ = ((i_8_ & 0xf) << 12 | (is[i_6_++] & 0x3f) << 6
			    | is[i_6_++] & 0x3f);
		    if (i_9_ < 2048)
			i_9_ = 65533;
		} else
		    i_9_ = 65533;
	    } else if (i_8_ < 248) {
		if (2 + i_6_ < i_7_ && 128 == (is[i_6_] & 0xc0)
		    && (is[1 + i_6_] & 0xc0) == 128
		    && 128 == (is[i_6_ + 2] & 0xc0)) {
		    i_9_ = ((i_8_ & 0x7) << 18 | (is[i_6_++] & 0x3f) << 12
			    | (is[i_6_++] & 0x3f) << 6 | is[i_6_++] & 0x3f);
		    if (i_9_ < 65536 || i_9_ > 1114111)
			i_9_ = 65533;
		    else
			i_9_ = 65533;
		} else
		    i_9_ = 65533;
	    } else
		i_9_ = 65533;
	    cs[i_5_++] = (char) i_9_;
	}
	return new String(cs, 0, i_5_);
    }
}
