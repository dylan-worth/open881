/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class3
{
    static long[][] aLongArrayArray24 = new long[8][256];
    public static final int anInt25 = 64;
    static final int anInt26 = 10;
    static final String aString27
	= "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886";
    byte[] aByteArray28 = new byte[32];
    static long[] aLongArray29 = new long[11];
    long[] aLongArray30;
    byte[] aByteArray31 = new byte[64];
    int anInt32 = 0;
    int anInt33 = 0;
    long[] aLongArray34;
    static final int anInt35 = 512;
    long[] aLongArray36;
    long[] aLongArray37;
    long[] aLongArray38;
    
    public static byte[] method512(byte[] is, int i, int i_0_) {
	byte[] is_1_;
	if (i > 0) {
	    is_1_ = new byte[i_0_];
	    for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
		is_1_[i_2_] = is[i + i_2_];
	} else
	    is_1_ = is;
	Class3 class3 = new Class3();
	class3.method515(-1474211813);
	class3.method527(is_1_, (long) (i_0_ * 8));
	byte[] is_3_ = new byte[64];
	class3.method516(is_3_, 0, 846178074);
	return is_3_;
    }
    
    void method513(byte i) {
	int i_4_ = 0;
	int i_5_ = 0;
	while (i_4_ < 8) {
	    aLongArray37[i_4_]
		= ((long) aByteArray31[i_5_] << 56
		   ^ ((long) aByteArray31[1 + i_5_] & 0xffL) << 48
		   ^ ((long) aByteArray31[2 + i_5_] & 0xffL) << 40
		   ^ ((long) aByteArray31[3 + i_5_] & 0xffL) << 32
		   ^ ((long) aByteArray31[i_5_ + 4] & 0xffL) << 24
		   ^ ((long) aByteArray31[i_5_ + 5] & 0xffL) << 16
		   ^ ((long) aByteArray31[i_5_ + 6] & 0xffL) << 8
		   ^ (long) aByteArray31[i_5_ + 7] & 0xffL);
	    i_4_++;
	    i_5_ += 8;
	}
	for (i_4_ = 0; i_4_ < 8; i_4_++)
	    aLongArray38[i_4_] = aLongArray37[i_4_] ^ (aLongArray34[i_4_]
						       = aLongArray30[i_4_]);
	for (i_4_ = 1; i_4_ <= 10; i_4_++) {
	    for (i_5_ = 0; i_5_ < 8; i_5_++) {
		aLongArray36[i_5_] = 0L;
		int i_6_ = 0;
		int i_7_ = 56;
		while (i_6_ < 8) {
		    aLongArray36[i_5_]
			^= (aLongArrayArray24[i_6_]
			    [((int) (aLongArray34[i_5_ - i_6_ & 0x7] >>> i_7_)
			      & 0xff)]);
		    i_6_++;
		    i_7_ -= 8;
		}
	    }
	    for (i_5_ = 0; i_5_ < 8; i_5_++)
		aLongArray34[i_5_] = aLongArray36[i_5_];
	    aLongArray34[0] ^= aLongArray29[i_4_];
	    for (i_5_ = 0; i_5_ < 8; i_5_++) {
		aLongArray36[i_5_] = aLongArray34[i_5_];
		int i_8_ = 0;
		int i_9_ = 56;
		while (i_8_ < 8) {
		    aLongArray36[i_5_]
			^= (aLongArrayArray24[i_8_]
			    [((int) (aLongArray38[i_5_ - i_8_ & 0x7] >>> i_9_)
			      & 0xff)]);
		    i_8_++;
		    i_9_ -= 8;
		}
	    }
	    for (i_5_ = 0; i_5_ < 8; i_5_++)
		aLongArray38[i_5_] = aLongArray36[i_5_];
	}
	for (i_4_ = 0; i_4_ < 8; i_4_++)
	    aLongArray30[i_4_] ^= aLongArray38[i_4_] ^ aLongArray37[i_4_];
    }
    
    void method514(byte[] is, int i) {
	aByteArray31[anInt33 * 1087971693]
	    |= 128 >>> (anInt32 * 25032895 & 0x7);
	anInt33 += 1088098405;
	if (anInt33 * 1087971693 > 32) {
	    while (1087971693 * anInt33 < 64)
		aByteArray31[(anInt33 += 1088098405) * 1087971693 - 1]
		    = (byte) 0;
	    method513((byte) -109);
	    anInt33 = 0;
	}
	while (1087971693 * anInt33 < 32)
	    aByteArray31[(anInt33 += 1088098405) * 1087971693 - 1] = (byte) 0;
	System.arraycopy(aByteArray28, 0, aByteArray31, 32, 32);
	method513((byte) -58);
	int i_10_ = 0;
	int i_11_ = i;
	while (i_10_ < 8) {
	    long l = aLongArray30[i_10_];
	    is[i_11_] = (byte) (int) (l >>> 56);
	    is[1 + i_11_] = (byte) (int) (l >>> 48);
	    is[i_11_ + 2] = (byte) (int) (l >>> 40);
	    is[3 + i_11_] = (byte) (int) (l >>> 32);
	    is[i_11_ + 4] = (byte) (int) (l >>> 24);
	    is[i_11_ + 5] = (byte) (int) (l >>> 16);
	    is[6 + i_11_] = (byte) (int) (l >>> 8);
	    is[i_11_ + 7] = (byte) (int) l;
	    i_10_++;
	    i_11_ += 8;
	}
    }
    
    void method515(int i) {
	for (int i_12_ = 0; i_12_ < 32; i_12_++)
	    aByteArray28[i_12_] = (byte) 0;
	anInt33 = 0;
	anInt32 = 0;
	aByteArray31[0] = (byte) 0;
	for (int i_13_ = 0; i_13_ < 8; i_13_++)
	    aLongArray30[i_13_] = 0L;
    }
    
    void method516(byte[] is, int i, int i_14_) {
	aByteArray31[anInt33 * 1087971693]
	    |= 128 >>> (anInt32 * 25032895 & 0x7);
	anInt33 += 1088098405;
	if (anInt33 * 1087971693 > 32) {
	    while (1087971693 * anInt33 < 64)
		aByteArray31[(anInt33 += 1088098405) * 1087971693 - 1]
		    = (byte) 0;
	    method513((byte) -34);
	    anInt33 = 0;
	}
	while (1087971693 * anInt33 < 32)
	    aByteArray31[(anInt33 += 1088098405) * 1087971693 - 1] = (byte) 0;
	System.arraycopy(aByteArray28, 0, aByteArray31, 32, 32);
	method513((byte) -50);
	int i_15_ = 0;
	int i_16_ = i;
	while (i_15_ < 8) {
	    long l = aLongArray30[i_15_];
	    is[i_16_] = (byte) (int) (l >>> 56);
	    is[1 + i_16_] = (byte) (int) (l >>> 48);
	    is[i_16_ + 2] = (byte) (int) (l >>> 40);
	    is[3 + i_16_] = (byte) (int) (l >>> 32);
	    is[i_16_ + 4] = (byte) (int) (l >>> 24);
	    is[i_16_ + 5] = (byte) (int) (l >>> 16);
	    is[6 + i_16_] = (byte) (int) (l >>> 8);
	    is[i_16_ + 7] = (byte) (int) l;
	    i_15_++;
	    i_16_ += 8;
	}
    }
    
    static {
	for (int i = 0; i < 256; i++) {
	    int i_17_
		= "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
		      .charAt(i / 2);
	    long l = (0 == (i & 0x1) ? (long) (i_17_ >>> 8)
		      : (long) (i_17_ & 0xff));
	    long l_18_ = l << 1;
	    if (l_18_ >= 256L)
		l_18_ ^= 0x11dL;
	    long l_19_ = l_18_ << 1;
	    if (l_19_ >= 256L)
		l_19_ ^= 0x11dL;
	    long l_20_ = l_19_ ^ l;
	    long l_21_ = l_19_ << 1;
	    if (l_21_ >= 256L)
		l_21_ ^= 0x11dL;
	    long l_22_ = l_21_ ^ l;
	    aLongArrayArray24[0][i]
		= (l << 56 | l << 48 | l_19_ << 40 | l << 32 | l_21_ << 24
		   | l_20_ << 16 | l_18_ << 8 | l_22_);
	    for (int i_23_ = 1; i_23_ < 8; i_23_++)
		aLongArrayArray24[i_23_][i]
		    = (aLongArrayArray24[i_23_ - 1][i] >>> 8
		       | aLongArrayArray24[i_23_ - 1][i] << 56);
	}
	aLongArray29[0] = 0L;
	for (int i = 1; i <= 10; i++) {
	    int i_24_ = (i - 1) * 8;
	    aLongArray29[i]
		= (aLongArrayArray24[0][i_24_] & ~0xffffffffffffffL
		   ^ aLongArrayArray24[1][i_24_ + 1] & 0xff000000000000L
		   ^ aLongArrayArray24[2][2 + i_24_] & 0xff0000000000L
		   ^ aLongArrayArray24[3][i_24_ + 3] & 0xff00000000L
		   ^ aLongArrayArray24[4][i_24_ + 4] & 0xff000000L
		   ^ aLongArrayArray24[5][5 + i_24_] & 0xff0000L
		   ^ aLongArrayArray24[6][6 + i_24_] & 0xff00L
		   ^ aLongArrayArray24[7][i_24_ + 7] & 0xffL);
	}
    }
    
    void method517() {
	int i = 0;
	int i_25_ = 0;
	while (i < 8) {
	    aLongArray37[i] = ((long) aByteArray31[i_25_] << 56
			       ^ ((long) aByteArray31[1 + i_25_] & 0xffL) << 48
			       ^ ((long) aByteArray31[2 + i_25_] & 0xffL) << 40
			       ^ ((long) aByteArray31[3 + i_25_] & 0xffL) << 32
			       ^ ((long) aByteArray31[i_25_ + 4] & 0xffL) << 24
			       ^ ((long) aByteArray31[i_25_ + 5] & 0xffL) << 16
			       ^ ((long) aByteArray31[i_25_ + 6] & 0xffL) << 8
			       ^ (long) aByteArray31[i_25_ + 7] & 0xffL);
	    i++;
	    i_25_ += 8;
	}
	for (i = 0; i < 8; i++)
	    aLongArray38[i]
		= aLongArray37[i] ^ (aLongArray34[i] = aLongArray30[i]);
	for (i = 1; i <= 10; i++) {
	    for (i_25_ = 0; i_25_ < 8; i_25_++) {
		aLongArray36[i_25_] = 0L;
		int i_26_ = 0;
		int i_27_ = 56;
		while (i_26_ < 8) {
		    aLongArray36[i_25_]
			^= (aLongArrayArray24[i_26_]
			    [(int) (aLongArray34[i_25_ - i_26_ & 0x7]
				    >>> i_27_) & 0xff]);
		    i_26_++;
		    i_27_ -= 8;
		}
	    }
	    for (i_25_ = 0; i_25_ < 8; i_25_++)
		aLongArray34[i_25_] = aLongArray36[i_25_];
	    aLongArray34[0] ^= aLongArray29[i];
	    for (i_25_ = 0; i_25_ < 8; i_25_++) {
		aLongArray36[i_25_] = aLongArray34[i_25_];
		int i_28_ = 0;
		int i_29_ = 56;
		while (i_28_ < 8) {
		    aLongArray36[i_25_]
			^= (aLongArrayArray24[i_28_]
			    [(int) (aLongArray38[i_25_ - i_28_ & 0x7]
				    >>> i_29_) & 0xff]);
		    i_28_++;
		    i_29_ -= 8;
		}
	    }
	    for (i_25_ = 0; i_25_ < 8; i_25_++)
		aLongArray38[i_25_] = aLongArray36[i_25_];
	}
	for (i = 0; i < 8; i++)
	    aLongArray30[i] ^= aLongArray38[i] ^ aLongArray37[i];
    }
    
    void method518() {
	int i = 0;
	int i_30_ = 0;
	while (i < 8) {
	    aLongArray37[i] = ((long) aByteArray31[i_30_] << 56
			       ^ ((long) aByteArray31[1 + i_30_] & 0xffL) << 48
			       ^ ((long) aByteArray31[2 + i_30_] & 0xffL) << 40
			       ^ ((long) aByteArray31[3 + i_30_] & 0xffL) << 32
			       ^ ((long) aByteArray31[i_30_ + 4] & 0xffL) << 24
			       ^ ((long) aByteArray31[i_30_ + 5] & 0xffL) << 16
			       ^ ((long) aByteArray31[i_30_ + 6] & 0xffL) << 8
			       ^ (long) aByteArray31[i_30_ + 7] & 0xffL);
	    i++;
	    i_30_ += 8;
	}
	for (i = 0; i < 8; i++)
	    aLongArray38[i]
		= aLongArray37[i] ^ (aLongArray34[i] = aLongArray30[i]);
	for (i = 1; i <= 10; i++) {
	    for (i_30_ = 0; i_30_ < 8; i_30_++) {
		aLongArray36[i_30_] = 0L;
		int i_31_ = 0;
		int i_32_ = 56;
		while (i_31_ < 8) {
		    aLongArray36[i_30_]
			^= (aLongArrayArray24[i_31_]
			    [(int) (aLongArray34[i_30_ - i_31_ & 0x7]
				    >>> i_32_) & 0xff]);
		    i_31_++;
		    i_32_ -= 8;
		}
	    }
	    for (i_30_ = 0; i_30_ < 8; i_30_++)
		aLongArray34[i_30_] = aLongArray36[i_30_];
	    aLongArray34[0] ^= aLongArray29[i];
	    for (i_30_ = 0; i_30_ < 8; i_30_++) {
		aLongArray36[i_30_] = aLongArray34[i_30_];
		int i_33_ = 0;
		int i_34_ = 56;
		while (i_33_ < 8) {
		    aLongArray36[i_30_]
			^= (aLongArrayArray24[i_33_]
			    [(int) (aLongArray38[i_30_ - i_33_ & 0x7]
				    >>> i_34_) & 0xff]);
		    i_33_++;
		    i_34_ -= 8;
		}
	    }
	    for (i_30_ = 0; i_30_ < 8; i_30_++)
		aLongArray38[i_30_] = aLongArray36[i_30_];
	}
	for (i = 0; i < 8; i++)
	    aLongArray30[i] ^= aLongArray38[i] ^ aLongArray37[i];
    }
    
    void method519() {
	int i = 0;
	int i_35_ = 0;
	while (i < 8) {
	    aLongArray37[i] = ((long) aByteArray31[i_35_] << 56
			       ^ ((long) aByteArray31[1 + i_35_] & 0xffL) << 48
			       ^ ((long) aByteArray31[2 + i_35_] & 0xffL) << 40
			       ^ ((long) aByteArray31[3 + i_35_] & 0xffL) << 32
			       ^ ((long) aByteArray31[i_35_ + 4] & 0xffL) << 24
			       ^ ((long) aByteArray31[i_35_ + 5] & 0xffL) << 16
			       ^ ((long) aByteArray31[i_35_ + 6] & 0xffL) << 8
			       ^ (long) aByteArray31[i_35_ + 7] & 0xffL);
	    i++;
	    i_35_ += 8;
	}
	for (i = 0; i < 8; i++)
	    aLongArray38[i]
		= aLongArray37[i] ^ (aLongArray34[i] = aLongArray30[i]);
	for (i = 1; i <= 10; i++) {
	    for (i_35_ = 0; i_35_ < 8; i_35_++) {
		aLongArray36[i_35_] = 0L;
		int i_36_ = 0;
		int i_37_ = 56;
		while (i_36_ < 8) {
		    aLongArray36[i_35_]
			^= (aLongArrayArray24[i_36_]
			    [(int) (aLongArray34[i_35_ - i_36_ & 0x7]
				    >>> i_37_) & 0xff]);
		    i_36_++;
		    i_37_ -= 8;
		}
	    }
	    for (i_35_ = 0; i_35_ < 8; i_35_++)
		aLongArray34[i_35_] = aLongArray36[i_35_];
	    aLongArray34[0] ^= aLongArray29[i];
	    for (i_35_ = 0; i_35_ < 8; i_35_++) {
		aLongArray36[i_35_] = aLongArray34[i_35_];
		int i_38_ = 0;
		int i_39_ = 56;
		while (i_38_ < 8) {
		    aLongArray36[i_35_]
			^= (aLongArrayArray24[i_38_]
			    [(int) (aLongArray38[i_35_ - i_38_ & 0x7]
				    >>> i_39_) & 0xff]);
		    i_38_++;
		    i_39_ -= 8;
		}
	    }
	    for (i_35_ = 0; i_35_ < 8; i_35_++)
		aLongArray38[i_35_] = aLongArray36[i_35_];
	}
	for (i = 0; i < 8; i++)
	    aLongArray30[i] ^= aLongArray38[i] ^ aLongArray37[i];
    }
    
    void method520() {
	for (int i = 0; i < 32; i++)
	    aByteArray28[i] = (byte) 0;
	anInt33 = 0;
	anInt32 = 0;
	aByteArray31[0] = (byte) 0;
	for (int i = 0; i < 8; i++)
	    aLongArray30[i] = 0L;
    }
    
    void method521() {
	int i = 0;
	int i_40_ = 0;
	while (i < 8) {
	    aLongArray37[i] = ((long) aByteArray31[i_40_] << 56
			       ^ ((long) aByteArray31[1 + i_40_] & 0xffL) << 48
			       ^ ((long) aByteArray31[2 + i_40_] & 0xffL) << 40
			       ^ ((long) aByteArray31[3 + i_40_] & 0xffL) << 32
			       ^ ((long) aByteArray31[i_40_ + 4] & 0xffL) << 24
			       ^ ((long) aByteArray31[i_40_ + 5] & 0xffL) << 16
			       ^ ((long) aByteArray31[i_40_ + 6] & 0xffL) << 8
			       ^ (long) aByteArray31[i_40_ + 7] & 0xffL);
	    i++;
	    i_40_ += 8;
	}
	for (i = 0; i < 8; i++)
	    aLongArray38[i]
		= aLongArray37[i] ^ (aLongArray34[i] = aLongArray30[i]);
	for (i = 1; i <= 10; i++) {
	    for (i_40_ = 0; i_40_ < 8; i_40_++) {
		aLongArray36[i_40_] = 0L;
		int i_41_ = 0;
		int i_42_ = 56;
		while (i_41_ < 8) {
		    aLongArray36[i_40_]
			^= (aLongArrayArray24[i_41_]
			    [(int) (aLongArray34[i_40_ - i_41_ & 0x7]
				    >>> i_42_) & 0xff]);
		    i_41_++;
		    i_42_ -= 8;
		}
	    }
	    for (i_40_ = 0; i_40_ < 8; i_40_++)
		aLongArray34[i_40_] = aLongArray36[i_40_];
	    aLongArray34[0] ^= aLongArray29[i];
	    for (i_40_ = 0; i_40_ < 8; i_40_++) {
		aLongArray36[i_40_] = aLongArray34[i_40_];
		int i_43_ = 0;
		int i_44_ = 56;
		while (i_43_ < 8) {
		    aLongArray36[i_40_]
			^= (aLongArrayArray24[i_43_]
			    [(int) (aLongArray38[i_40_ - i_43_ & 0x7]
				    >>> i_44_) & 0xff]);
		    i_43_++;
		    i_44_ -= 8;
		}
	    }
	    for (i_40_ = 0; i_40_ < 8; i_40_++)
		aLongArray38[i_40_] = aLongArray36[i_40_];
	}
	for (i = 0; i < 8; i++)
	    aLongArray30[i] ^= aLongArray38[i] ^ aLongArray37[i];
    }
    
    Class3() {
	aLongArray30 = new long[8];
	aLongArray34 = new long[8];
	aLongArray36 = new long[8];
	aLongArray37 = new long[8];
	aLongArray38 = new long[8];
    }
    
    void method522() {
	for (int i = 0; i < 32; i++)
	    aByteArray28[i] = (byte) 0;
	anInt33 = 0;
	anInt32 = 0;
	aByteArray31[0] = (byte) 0;
	for (int i = 0; i < 8; i++)
	    aLongArray30[i] = 0L;
    }
    
    void method523() {
	for (int i = 0; i < 32; i++)
	    aByteArray28[i] = (byte) 0;
	anInt33 = 0;
	anInt32 = 0;
	aByteArray31[0] = (byte) 0;
	for (int i = 0; i < 8; i++)
	    aLongArray30[i] = 0L;
    }
    
    void method524(byte[] is, long l) {
	int i = 0;
	int i_45_ = 8 - ((int) l & 0x7) & 0x7;
	int i_46_ = anInt32 * 25032895 & 0x7;
	long l_47_ = l;
	int i_48_ = 31;
	int i_49_ = 0;
	for (/**/; i_48_ >= 0; i_48_--) {
	    i_49_ += ((int) l_47_ & 0xff) + (aByteArray28[i_48_] & 0xff);
	    aByteArray28[i_48_] = (byte) i_49_;
	    i_49_ >>>= 8;
	    l_47_ >>>= 8;
	}
	while (l > 8L) {
	    int i_50_
		= is[i] << i_45_ & 0xff | (is[1 + i] & 0xff) >>> 8 - i_45_;
	    if (i_50_ < 0 || i_50_ >= 256)
		throw new RuntimeException();
	    aByteArray31[anInt33 * 1087971693] |= i_50_ >>> i_46_;
	    anInt33 += 1088098405;
	    anInt32 += -312379585 * (8 - i_46_);
	    if (anInt32 * 25032895 == 512) {
		method513((byte) -42);
		anInt33 = 0;
		anInt32 = 0;
	    }
	    aByteArray31[1087971693 * anInt33]
		= (byte) (i_50_ << 8 - i_46_ & 0xff);
	    anInt32 += i_46_ * -312379585;
	    l -= 8L;
	    i++;
	}
	int i_51_;
	if (l > 0L) {
	    i_51_ = is[i] << i_45_ & 0xff;
	    aByteArray31[anInt33 * 1087971693] |= i_51_ >>> i_46_;
	} else
	    i_51_ = 0;
	if ((long) i_46_ + l < 8L)
	    anInt32 += l * -312379585L;
	else {
	    anInt33 += 1088098405;
	    anInt32 += -312379585 * (8 - i_46_);
	    l -= (long) (8 - i_46_);
	    if (anInt32 * 25032895 == 512) {
		method513((byte) -10);
		anInt33 = 0;
		anInt32 = 0;
	    }
	    aByteArray31[1087971693 * anInt33]
		= (byte) (i_51_ << 8 - i_46_ & 0xff);
	    anInt32 += (int) l * -312379585;
	}
    }
    
    void method525(byte[] is, long l) {
	int i = 0;
	int i_52_ = 8 - ((int) l & 0x7) & 0x7;
	int i_53_ = anInt32 * 25032895 & 0x7;
	long l_54_ = l;
	int i_55_ = 31;
	int i_56_ = 0;
	for (/**/; i_55_ >= 0; i_55_--) {
	    i_56_ += ((int) l_54_ & 0xff) + (aByteArray28[i_55_] & 0xff);
	    aByteArray28[i_55_] = (byte) i_56_;
	    i_56_ >>>= 8;
	    l_54_ >>>= 8;
	}
	while (l > 8L) {
	    int i_57_
		= is[i] << i_52_ & 0xff | (is[1 + i] & 0xff) >>> 8 - i_52_;
	    if (i_57_ < 0 || i_57_ >= 256)
		throw new RuntimeException();
	    aByteArray31[anInt33 * 1087971693] |= i_57_ >>> i_53_;
	    anInt33 += 1088098405;
	    anInt32 += -312379585 * (8 - i_53_);
	    if (anInt32 * 25032895 == 512) {
		method513((byte) -119);
		anInt33 = 0;
		anInt32 = 0;
	    }
	    aByteArray31[1087971693 * anInt33]
		= (byte) (i_57_ << 8 - i_53_ & 0xff);
	    anInt32 += i_53_ * -312379585;
	    l -= 8L;
	    i++;
	}
	int i_58_;
	if (l > 0L) {
	    i_58_ = is[i] << i_52_ & 0xff;
	    aByteArray31[anInt33 * 1087971693] |= i_58_ >>> i_53_;
	} else
	    i_58_ = 0;
	if ((long) i_53_ + l < 8L)
	    anInt32 += l * -312379585L;
	else {
	    anInt33 += 1088098405;
	    anInt32 += -312379585 * (8 - i_53_);
	    l -= (long) (8 - i_53_);
	    if (anInt32 * 25032895 == 512) {
		method513((byte) -14);
		anInt33 = 0;
		anInt32 = 0;
	    }
	    aByteArray31[1087971693 * anInt33]
		= (byte) (i_58_ << 8 - i_53_ & 0xff);
	    anInt32 += (int) l * -312379585;
	}
    }
    
    void method526(byte[] is, int i) {
	aByteArray31[anInt33 * 1087971693]
	    |= 128 >>> (anInt32 * 25032895 & 0x7);
	anInt33 += 1088098405;
	if (anInt33 * 1087971693 > 32) {
	    while (1087971693 * anInt33 < 64)
		aByteArray31[(anInt33 += 1088098405) * 1087971693 - 1]
		    = (byte) 0;
	    method513((byte) -101);
	    anInt33 = 0;
	}
	while (1087971693 * anInt33 < 32)
	    aByteArray31[(anInt33 += 1088098405) * 1087971693 - 1] = (byte) 0;
	System.arraycopy(aByteArray28, 0, aByteArray31, 32, 32);
	method513((byte) -14);
	int i_59_ = 0;
	int i_60_ = i;
	while (i_59_ < 8) {
	    long l = aLongArray30[i_59_];
	    is[i_60_] = (byte) (int) (l >>> 56);
	    is[1 + i_60_] = (byte) (int) (l >>> 48);
	    is[i_60_ + 2] = (byte) (int) (l >>> 40);
	    is[3 + i_60_] = (byte) (int) (l >>> 32);
	    is[i_60_ + 4] = (byte) (int) (l >>> 24);
	    is[i_60_ + 5] = (byte) (int) (l >>> 16);
	    is[6 + i_60_] = (byte) (int) (l >>> 8);
	    is[i_60_ + 7] = (byte) (int) l;
	    i_59_++;
	    i_60_ += 8;
	}
    }
    
    void method527(byte[] is, long l) {
	int i = 0;
	int i_61_ = 8 - ((int) l & 0x7) & 0x7;
	int i_62_ = anInt32 * 25032895 & 0x7;
	long l_63_ = l;
	int i_64_ = 31;
	int i_65_ = 0;
	for (/**/; i_64_ >= 0; i_64_--) {
	    i_65_ += ((int) l_63_ & 0xff) + (aByteArray28[i_64_] & 0xff);
	    aByteArray28[i_64_] = (byte) i_65_;
	    i_65_ >>>= 8;
	    l_63_ >>>= 8;
	}
	while (l > 8L) {
	    int i_66_
		= is[i] << i_61_ & 0xff | (is[1 + i] & 0xff) >>> 8 - i_61_;
	    if (i_66_ < 0 || i_66_ >= 256)
		throw new RuntimeException();
	    aByteArray31[anInt33 * 1087971693] |= i_66_ >>> i_62_;
	    anInt33 += 1088098405;
	    anInt32 += -312379585 * (8 - i_62_);
	    if (anInt32 * 25032895 == 512) {
		method513((byte) -82);
		anInt33 = 0;
		anInt32 = 0;
	    }
	    aByteArray31[1087971693 * anInt33]
		= (byte) (i_66_ << 8 - i_62_ & 0xff);
	    anInt32 += i_62_ * -312379585;
	    l -= 8L;
	    i++;
	}
	int i_67_;
	if (l > 0L) {
	    i_67_ = is[i] << i_61_ & 0xff;
	    aByteArray31[anInt33 * 1087971693] |= i_67_ >>> i_62_;
	} else
	    i_67_ = 0;
	if ((long) i_62_ + l < 8L)
	    anInt32 += l * -312379585L;
	else {
	    anInt33 += 1088098405;
	    anInt32 += -312379585 * (8 - i_62_);
	    l -= (long) (8 - i_62_);
	    if (anInt32 * 25032895 == 512) {
		method513((byte) -35);
		anInt33 = 0;
		anInt32 = 0;
	    }
	    aByteArray31[1087971693 * anInt33]
		= (byte) (i_67_ << 8 - i_62_ & 0xff);
	    anInt32 += (int) l * -312379585;
	}
    }
    
    void method528() {
	int i = 0;
	int i_68_ = 0;
	while (i < 8) {
	    aLongArray37[i] = ((long) aByteArray31[i_68_] << 56
			       ^ ((long) aByteArray31[1 + i_68_] & 0xffL) << 48
			       ^ ((long) aByteArray31[2 + i_68_] & 0xffL) << 40
			       ^ ((long) aByteArray31[3 + i_68_] & 0xffL) << 32
			       ^ ((long) aByteArray31[i_68_ + 4] & 0xffL) << 24
			       ^ ((long) aByteArray31[i_68_ + 5] & 0xffL) << 16
			       ^ ((long) aByteArray31[i_68_ + 6] & 0xffL) << 8
			       ^ (long) aByteArray31[i_68_ + 7] & 0xffL);
	    i++;
	    i_68_ += 8;
	}
	for (i = 0; i < 8; i++)
	    aLongArray38[i]
		= aLongArray37[i] ^ (aLongArray34[i] = aLongArray30[i]);
	for (i = 1; i <= 10; i++) {
	    for (i_68_ = 0; i_68_ < 8; i_68_++) {
		aLongArray36[i_68_] = 0L;
		int i_69_ = 0;
		int i_70_ = 56;
		while (i_69_ < 8) {
		    aLongArray36[i_68_]
			^= (aLongArrayArray24[i_69_]
			    [(int) (aLongArray34[i_68_ - i_69_ & 0x7]
				    >>> i_70_) & 0xff]);
		    i_69_++;
		    i_70_ -= 8;
		}
	    }
	    for (i_68_ = 0; i_68_ < 8; i_68_++)
		aLongArray34[i_68_] = aLongArray36[i_68_];
	    aLongArray34[0] ^= aLongArray29[i];
	    for (i_68_ = 0; i_68_ < 8; i_68_++) {
		aLongArray36[i_68_] = aLongArray34[i_68_];
		int i_71_ = 0;
		int i_72_ = 56;
		while (i_71_ < 8) {
		    aLongArray36[i_68_]
			^= (aLongArrayArray24[i_71_]
			    [(int) (aLongArray38[i_68_ - i_71_ & 0x7]
				    >>> i_72_) & 0xff]);
		    i_71_++;
		    i_72_ -= 8;
		}
	    }
	    for (i_68_ = 0; i_68_ < 8; i_68_++)
		aLongArray38[i_68_] = aLongArray36[i_68_];
	}
	for (i = 0; i < 8; i++)
	    aLongArray30[i] ^= aLongArray38[i] ^ aLongArray37[i];
    }
}
