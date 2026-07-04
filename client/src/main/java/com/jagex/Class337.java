/* Class337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class337
{
    public byte aByte3521;
    public int anInt3522;
    public String aString3523;
    public static Class44_Sub8 aClass44_Sub8_3524;
    
    Class337() {
	/* empty */
    }
    
    static final void method5903(Class247 class247, int i, byte[] is,
				 byte[] is_0_, Class669 class669, int i_1_) {
	if (class247.aByteArrayArray2585 == null) {
	    if (null != is) {
		class247.aByteArrayArray2585 = new byte[11][];
		class247.aByteArrayArray2543 = new byte[11][];
		class247.anIntArray2544 = new int[11];
		class247.anIntArray2545 = new int[11];
		class247.anIntArray2546 = new int[11];
	    } else
		return;
	}
	class247.aByteArrayArray2585[i] = is;
	if (is != null)
	    class247.aBool2541 = true;
	else {
	    class247.aBool2541 = false;
	    for (int i_2_ = 0; i_2_ < class247.aByteArrayArray2585.length;
		 i_2_++) {
		if (class247.aByteArrayArray2585[i_2_] != null
		    || class247.anIntArray2546[i_2_] > 0) {
		    class247.aBool2541 = true;
		    break;
		}
	    }
	}
	class247.aByteArrayArray2543[i] = is_0_;
    }
    
    static final void method5904(Class669 class669, int i)
	throws Exception_Sub2 {
	class669.anInt8600 -= 926998689;
	Class599.aClass298_Sub1_7871.method5405
	    ((float) class669.anIntArray8595[2088438307 * class669.anInt8600],
	     (float) (class669.anIntArray8595
		      [2088438307 * class669.anInt8600 + 1]),
	     (float) (class669.anIntArray8595
		      [2088438307 * class669.anInt8600 + 2]),
	     (short) -12391);
    }
    
    static final void method5905(Class669 class669, short i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class277.method5163(string, 408110784);
    }
    
    static String method5906(byte[] is, int i, int i_3_, int i_4_) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_5_ = i; i_5_ < i_3_ + i; i_5_ += 3) {
	    int i_6_ = is[i_5_] & 0xff;
	    stringbuilder.append(Class667.aCharArray8581[i_6_ >>> 2]);
	    if (i_5_ < i_3_ - 1) {
		int i_7_ = is[1 + i_5_] & 0xff;
		stringbuilder.append(Class667.aCharArray8581
				     [(i_6_ & 0x3) << 4 | i_7_ >>> 4]);
		if (i_5_ < i_3_ - 2) {
		    int i_8_ = is[i_5_ + 2] & 0xff;
		    stringbuilder.append
			(Class667.aCharArray8581
			 [(i_7_ & 0xf) << 2 | i_8_ >>> 6])
			.append(Class667.aCharArray8581[i_8_ & 0x3f]);
		} else
		    stringbuilder.append
			(Class667.aCharArray8581[(i_7_ & 0xf) << 2])
			.append('=');
	    } else
		stringbuilder.append
		    (Class667.aCharArray8581[(i_6_ & 0x3) << 4]).append
		    ('=').append('=');
	}
	return stringbuilder.toString();
    }
}
