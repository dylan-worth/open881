/* Class145_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class145_Sub1 extends Class145
{
    Interface38 anInterface38_9425;
    
    Class145_Sub1(Class185_Sub1 class185_sub1, int i, int i_0_, byte[] is) {
	anInterface38_9425 = class185_sub1.method14659(Class181.aClass181_1951,
						       i, i_0_, false, is);
	anInterface38_9425.method257(false, false);
    }
    
    Class145_Sub1(Class185_Sub1 class185_sub1, int i, int i_1_, int[] is) {
	anInterface38_9425 = class185_sub1.method14658(i, i_1_, false, is);
	anInterface38_9425.method257(false, false);
    }
    
    static Class145_Sub1 method15072(Class185_Sub1 class185_sub1, int i,
				     int i_2_, int[] is, int[] is_3_) {
	if (class185_sub1.method14741(Class181.aClass181_1951,
				      Class173.aClass173_1830)) {
	    byte[] is_4_ = new byte[i * i_2_];
	    for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
		int i_6_ = i_5_ * i + is[i_5_];
		for (int i_7_ = 0; i_7_ < is_3_[i_5_]; i_7_++)
		    is_4_[i_6_++] = (byte) -1;
	    }
	    return new Class145_Sub1(class185_sub1, i, i_2_, is_4_);
	}
	int[] is_8_ = new int[i * i_2_];
	for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
	    int i_10_ = i_9_ * i + is[i_9_];
	    for (int i_11_ = 0; i_11_ < is_3_[i_9_]; i_11_++)
		is_8_[i_10_++] = -16777216;
	}
	return new Class145_Sub1(class185_sub1, i, i_2_, is_8_);
    }
}
