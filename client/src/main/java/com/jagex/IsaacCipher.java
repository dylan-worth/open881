/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.RS3Applet;

public final class IsaacCipher {
	int[] anIntArray93 = new int[256];
	int anInt94;
	static final int anInt95 = 1020;
	int anInt96;
	int[] anIntArray97 = new int[256];
	static final int anInt98 = 256;
	int anInt99;
	static final int anInt100 = 8;
	int anInt101;

	final void method638() {
		anInt94 += (anInt101 += 629326429) * -804342311;
		for (int i = 0; i < 256; i++) {
			int i_0_ = anIntArray93[i];
			if (0 == (i & 0x2)) {
				if ((i & 0x1) == 0)
					anInt99 = 1697736921 * (anInt99 * 1518638953 ^ 1518638953 * anInt99 << 13);
				else
					anInt99 = 1697736921 * (anInt99 * 1518638953 ^ anInt99 * 1518638953 >>> 6);
			} else if (0 == (i & 0x1))
				anInt99 = 1697736921 * (1518638953 * anInt99 ^ 1518638953 * anInt99 << 2);
			else
				anInt99 = 1697736921 * (1518638953 * anInt99 ^ 1518638953 * anInt99 >>> 16);
			anInt99 += 1697736921 * anIntArray93[i + 128 & 0xff];
			int i_1_;
			anIntArray93[i] = i_1_ = anInt94 * -1880576131 + (anIntArray93[(i_0_ & 0x3fc) >> 2] + 1518638953 * anInt99);
			anIntArray97[i] = (anInt94 = ((i_0_ + anIntArray93[(i_1_ >> 8 & 0x3fc) >> 2]) * 1884848597)) * -1880576131;
		}
	}

	public final int method639(byte i) {
		if (RS3Applet.RSPS) {
			return 0;
		}
		if (anInt96 * -1006007953 == 0) {
			method645((byte) 0);
			anInt96 = -1409970432;
		}
		return anIntArray97[(anInt96 -= -5507697) * -1006007953];
	}

	public final int method640(int i) {
		if (RS3Applet.RSPS) {
			return 0;
		}
		if (0 == -1006007953 * anInt96) {
			method645((byte) 0);
			anInt96 = -1409970432;
		}
		return anIntArray97[anInt96 * -1006007953 - 1];
	}

	final void method641() {
		anInt94 += (anInt101 += 629326429) * -804342311;
		for (int i = 0; i < 256; i++) {
			int i_2_ = anIntArray93[i];
			if (0 == (i & 0x2)) {
				if ((i & 0x1) == 0)
					anInt99 = 1697736921 * (anInt99 * 1518638953 ^ 1518638953 * anInt99 << 13);
				else
					anInt99 = 1697736921 * (anInt99 * 1518638953 ^ anInt99 * 1518638953 >>> 6);
			} else if (0 == (i & 0x1))
				anInt99 = 1697736921 * (1518638953 * anInt99 ^ 1518638953 * anInt99 << 2);
			else
				anInt99 = 1697736921 * (1518638953 * anInt99 ^ 1518638953 * anInt99 >>> 16);
			anInt99 += 1697736921 * anIntArray93[i + 128 & 0xff];
			int i_3_;
			anIntArray93[i] = i_3_ = anInt94 * -1880576131 + (anIntArray93[(i_2_ & 0x3fc) >> 2] + 1518638953 * anInt99);
			anIntArray97[i] = (anInt94 = ((i_2_ + anIntArray93[(i_3_ >> 8 & 0x3fc) >> 2]) * 1884848597)) * -1880576131;
		}
	}

	final void method642(byte i) {
		int i_4_ = -1640531527;
		int i_5_ = -1640531527;
		int i_6_ = -1640531527;
		int i_7_ = -1640531527;
		int i_8_ = -1640531527;
		int i_9_ = -1640531527;
		int i_10_ = -1640531527;
		int i_11_ = -1640531527;
		for (int i_12_ = 0; i_12_ < 4; i_12_++) {
			i_11_ ^= i_10_ << 11;
			i_8_ += i_11_;
			i_10_ += i_9_;
			i_10_ ^= i_9_ >>> 2;
			i_7_ += i_10_;
			i_9_ += i_8_;
			i_9_ ^= i_8_ << 8;
			i_6_ += i_9_;
			i_8_ += i_7_;
			i_8_ ^= i_7_ >>> 16;
			i_5_ += i_8_;
			i_7_ += i_6_;
			i_7_ ^= i_6_ << 10;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 4;
			i_11_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 8;
			i_10_ += i_5_;
			i_4_ += i_11_;
			i_4_ ^= i_11_ >>> 9;
			i_9_ += i_4_;
			i_11_ += i_10_;
		}
		for (int i_13_ = 0; i_13_ < 256; i_13_ += 8) {
			i_11_ += anIntArray97[i_13_];
			i_10_ += anIntArray97[i_13_ + 1];
			i_9_ += anIntArray97[i_13_ + 2];
			i_8_ += anIntArray97[i_13_ + 3];
			i_7_ += anIntArray97[4 + i_13_];
			i_6_ += anIntArray97[i_13_ + 5];
			i_5_ += anIntArray97[i_13_ + 6];
			i_4_ += anIntArray97[i_13_ + 7];
			i_11_ ^= i_10_ << 11;
			i_8_ += i_11_;
			i_10_ += i_9_;
			i_10_ ^= i_9_ >>> 2;
			i_7_ += i_10_;
			i_9_ += i_8_;
			i_9_ ^= i_8_ << 8;
			i_6_ += i_9_;
			i_8_ += i_7_;
			i_8_ ^= i_7_ >>> 16;
			i_5_ += i_8_;
			i_7_ += i_6_;
			i_7_ ^= i_6_ << 10;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 4;
			i_11_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 8;
			i_10_ += i_5_;
			i_4_ += i_11_;
			i_4_ ^= i_11_ >>> 9;
			i_9_ += i_4_;
			i_11_ += i_10_;
			anIntArray93[i_13_] = i_11_;
			anIntArray93[1 + i_13_] = i_10_;
			anIntArray93[i_13_ + 2] = i_9_;
			anIntArray93[3 + i_13_] = i_8_;
			anIntArray93[i_13_ + 4] = i_7_;
			anIntArray93[i_13_ + 5] = i_6_;
			anIntArray93[6 + i_13_] = i_5_;
			anIntArray93[7 + i_13_] = i_4_;
		}
		for (int i_14_ = 0; i_14_ < 256; i_14_ += 8) {
			i_11_ += anIntArray93[i_14_];
			i_10_ += anIntArray93[1 + i_14_];
			i_9_ += anIntArray93[2 + i_14_];
			i_8_ += anIntArray93[i_14_ + 3];
			i_7_ += anIntArray93[i_14_ + 4];
			i_6_ += anIntArray93[i_14_ + 5];
			i_5_ += anIntArray93[6 + i_14_];
			i_4_ += anIntArray93[7 + i_14_];
			i_11_ ^= i_10_ << 11;
			i_8_ += i_11_;
			i_10_ += i_9_;
			i_10_ ^= i_9_ >>> 2;
			i_7_ += i_10_;
			i_9_ += i_8_;
			i_9_ ^= i_8_ << 8;
			i_6_ += i_9_;
			i_8_ += i_7_;
			i_8_ ^= i_7_ >>> 16;
			i_5_ += i_8_;
			i_7_ += i_6_;
			i_7_ ^= i_6_ << 10;
			i_4_ += i_7_;
			i_6_ += i_5_;
			i_6_ ^= i_5_ >>> 4;
			i_11_ += i_6_;
			i_5_ += i_4_;
			i_5_ ^= i_4_ << 8;
			i_10_ += i_5_;
			i_4_ += i_11_;
			i_4_ ^= i_11_ >>> 9;
			i_9_ += i_4_;
			i_11_ += i_10_;
			anIntArray93[i_14_] = i_11_;
			anIntArray93[1 + i_14_] = i_10_;
			anIntArray93[i_14_ + 2] = i_9_;
			anIntArray93[3 + i_14_] = i_8_;
			anIntArray93[i_14_ + 4] = i_7_;
			anIntArray93[5 + i_14_] = i_6_;
			anIntArray93[6 + i_14_] = i_5_;
			anIntArray93[i_14_ + 7] = i_4_;
		}
		method645((byte) 0);
		anInt96 = -1409970432;
	}

	public final int method643() {
		if (0 == -1006007953 * anInt96) {
			method645((byte) 0);
			anInt96 = -1409970432;
		}
		return anIntArray97[anInt96 * -1006007953 - 1];
	}

	public final int method644() {
		if (0 == -1006007953 * anInt96) {
			method645((byte) 0);
			anInt96 = -1409970432;
		}
		return anIntArray97[anInt96 * -1006007953 - 1];
	}

	final void method645(byte i) {
		anInt94 += (anInt101 += 629326429) * -804342311;
		for (int i_15_ = 0; i_15_ < 256; i_15_++) {
			int i_16_ = anIntArray93[i_15_];
			if (0 == (i_15_ & 0x2)) {
				if ((i_15_ & 0x1) == 0)
					anInt99 = 1697736921 * (anInt99 * 1518638953 ^ 1518638953 * anInt99 << 13);
				else
					anInt99 = 1697736921 * (anInt99 * 1518638953 ^ anInt99 * 1518638953 >>> 6);
			} else if (0 == (i_15_ & 0x1))
				anInt99 = 1697736921 * (1518638953 * anInt99 ^ 1518638953 * anInt99 << 2);
			else
				anInt99 = 1697736921 * (1518638953 * anInt99 ^ 1518638953 * anInt99 >>> 16);
			anInt99 += 1697736921 * anIntArray93[i_15_ + 128 & 0xff];
			int i_17_;
			anIntArray93[i_15_] = i_17_ = anInt94 * -1880576131
					+ (anIntArray93[(i_16_ & 0x3fc) >> 2] + 1518638953 * anInt99);
			anIntArray97[i_15_] = (anInt94 = ((i_16_ + anIntArray93[(i_17_ >> 8 & 0x3fc) >> 2]) * 1884848597))
					* -1880576131;
		}
	}

	public IsaacCipher(int[] is) {
		for (int i = 0; i < is.length; i++)
			anIntArray97[i] = is[i];
		method642((byte) 126);
	}

	final void method646() {
		anInt94 += (anInt101 += 629326429) * -804342311;
		for (int i = 0; i < 256; i++) {
			int i_18_ = anIntArray93[i];
			if (0 == (i & 0x2)) {
				if ((i & 0x1) == 0)
					anInt99 = 1697736921 * (anInt99 * 1518638953 ^ 1518638953 * anInt99 << 13);
				else
					anInt99 = 1697736921 * (anInt99 * 1518638953 ^ anInt99 * 1518638953 >>> 6);
			} else if (0 == (i & 0x1))
				anInt99 = 1697736921 * (1518638953 * anInt99 ^ 1518638953 * anInt99 << 2);
			else
				anInt99 = 1697736921 * (1518638953 * anInt99 ^ 1518638953 * anInt99 >>> 16);
			anInt99 += 1697736921 * anIntArray93[i + 128 & 0xff];
			int i_19_;
			anIntArray93[i] = i_19_ = anInt94 * -1880576131
					+ (anIntArray93[(i_18_ & 0x3fc) >> 2] + 1518638953 * anInt99);
			anIntArray97[i] = (anInt94 = ((i_18_ + anIntArray93[(i_19_ >> 8 & 0x3fc) >> 2]) * 1884848597))
					* -1880576131;
		}
	}

	final void method647() {
		anInt94 += (anInt101 += 629326429) * -804342311;
		for (int i = 0; i < 256; i++) {
			int i_20_ = anIntArray93[i];
			if (0 == (i & 0x2)) {
				if ((i & 0x1) == 0)
					anInt99 = 1697736921 * (anInt99 * 1518638953 ^ 1518638953 * anInt99 << 13);
				else
					anInt99 = 1697736921 * (anInt99 * 1518638953 ^ anInt99 * 1518638953 >>> 6);
			} else if (0 == (i & 0x1))
				anInt99 = 1697736921 * (1518638953 * anInt99 ^ 1518638953 * anInt99 << 2);
			else
				anInt99 = 1697736921 * (1518638953 * anInt99 ^ 1518638953 * anInt99 >>> 16);
			anInt99 += 1697736921 * anIntArray93[i + 128 & 0xff];
			int i_21_;
			anIntArray93[i] = i_21_ = anInt94 * -1880576131
					+ (anIntArray93[(i_20_ & 0x3fc) >> 2] + 1518638953 * anInt99);
			anIntArray97[i] = (anInt94 = ((i_20_ + anIntArray93[(i_21_ >> 8 & 0x3fc) >> 2]) * 1884848597))
					* -1880576131;
		}
	}

	final void method648() {
		int i = -1640531527;
		int i_22_ = -1640531527;
		int i_23_ = -1640531527;
		int i_24_ = -1640531527;
		int i_25_ = -1640531527;
		int i_26_ = -1640531527;
		int i_27_ = -1640531527;
		int i_28_ = -1640531527;
		for (int i_29_ = 0; i_29_ < 4; i_29_++) {
			i_28_ ^= i_27_ << 11;
			i_25_ += i_28_;
			i_27_ += i_26_;
			i_27_ ^= i_26_ >>> 2;
			i_24_ += i_27_;
			i_26_ += i_25_;
			i_26_ ^= i_25_ << 8;
			i_23_ += i_26_;
			i_25_ += i_24_;
			i_25_ ^= i_24_ >>> 16;
			i_22_ += i_25_;
			i_24_ += i_23_;
			i_24_ ^= i_23_ << 10;
			i += i_24_;
			i_23_ += i_22_;
			i_23_ ^= i_22_ >>> 4;
			i_28_ += i_23_;
			i_22_ += i;
			i_22_ ^= i << 8;
			i_27_ += i_22_;
			i += i_28_;
			i ^= i_28_ >>> 9;
			i_26_ += i;
			i_28_ += i_27_;
		}
		for (int i_30_ = 0; i_30_ < 256; i_30_ += 8) {
			i_28_ += anIntArray97[i_30_];
			i_27_ += anIntArray97[i_30_ + 1];
			i_26_ += anIntArray97[i_30_ + 2];
			i_25_ += anIntArray97[i_30_ + 3];
			i_24_ += anIntArray97[4 + i_30_];
			i_23_ += anIntArray97[i_30_ + 5];
			i_22_ += anIntArray97[i_30_ + 6];
			i += anIntArray97[i_30_ + 7];
			i_28_ ^= i_27_ << 11;
			i_25_ += i_28_;
			i_27_ += i_26_;
			i_27_ ^= i_26_ >>> 2;
			i_24_ += i_27_;
			i_26_ += i_25_;
			i_26_ ^= i_25_ << 8;
			i_23_ += i_26_;
			i_25_ += i_24_;
			i_25_ ^= i_24_ >>> 16;
			i_22_ += i_25_;
			i_24_ += i_23_;
			i_24_ ^= i_23_ << 10;
			i += i_24_;
			i_23_ += i_22_;
			i_23_ ^= i_22_ >>> 4;
			i_28_ += i_23_;
			i_22_ += i;
			i_22_ ^= i << 8;
			i_27_ += i_22_;
			i += i_28_;
			i ^= i_28_ >>> 9;
			i_26_ += i;
			i_28_ += i_27_;
			anIntArray93[i_30_] = i_28_;
			anIntArray93[1 + i_30_] = i_27_;
			anIntArray93[i_30_ + 2] = i_26_;
			anIntArray93[3 + i_30_] = i_25_;
			anIntArray93[i_30_ + 4] = i_24_;
			anIntArray93[i_30_ + 5] = i_23_;
			anIntArray93[6 + i_30_] = i_22_;
			anIntArray93[7 + i_30_] = i;
		}
		for (int i_31_ = 0; i_31_ < 256; i_31_ += 8) {
			i_28_ += anIntArray93[i_31_];
			i_27_ += anIntArray93[1 + i_31_];
			i_26_ += anIntArray93[2 + i_31_];
			i_25_ += anIntArray93[i_31_ + 3];
			i_24_ += anIntArray93[i_31_ + 4];
			i_23_ += anIntArray93[i_31_ + 5];
			i_22_ += anIntArray93[6 + i_31_];
			i += anIntArray93[7 + i_31_];
			i_28_ ^= i_27_ << 11;
			i_25_ += i_28_;
			i_27_ += i_26_;
			i_27_ ^= i_26_ >>> 2;
			i_24_ += i_27_;
			i_26_ += i_25_;
			i_26_ ^= i_25_ << 8;
			i_23_ += i_26_;
			i_25_ += i_24_;
			i_25_ ^= i_24_ >>> 16;
			i_22_ += i_25_;
			i_24_ += i_23_;
			i_24_ ^= i_23_ << 10;
			i += i_24_;
			i_23_ += i_22_;
			i_23_ ^= i_22_ >>> 4;
			i_28_ += i_23_;
			i_22_ += i;
			i_22_ ^= i << 8;
			i_27_ += i_22_;
			i += i_28_;
			i ^= i_28_ >>> 9;
			i_26_ += i;
			i_28_ += i_27_;
			anIntArray93[i_31_] = i_28_;
			anIntArray93[1 + i_31_] = i_27_;
			anIntArray93[i_31_ + 2] = i_26_;
			anIntArray93[3 + i_31_] = i_25_;
			anIntArray93[i_31_ + 4] = i_24_;
			anIntArray93[5 + i_31_] = i_23_;
			anIntArray93[6 + i_31_] = i_22_;
			anIntArray93[i_31_ + 7] = i;
		}
		method645((byte) 0);
		anInt96 = -1409970432;
	}

	public static final void method649(int i, int i_32_) {
		if (null != Class574.aClass534_Sub26_7710
				&& (i >= 0 && i < (-1406046755 * Class574.aClass534_Sub26_7710.anInt10580))) {
			Class337 class337 = Class574.aClass534_Sub26_7710.aClass337Array10579[i];
			if (-1 == class337.aByte3521) {
				Class100 class100 = Class201.method3864(2095398292);
				Class534_Sub19 class534_sub19 = Class346.method6128(Class404.aClass404_4161, class100.aClass13_1183,
						1341391005);
				class534_sub19.aClass534_Sub40_Sub1_10513
						.method16506(2 + Class668.method11029(class337.aString3523, (byte) 0), 1712319283);
				class534_sub19.aClass534_Sub40_Sub1_10513.method16507(i, 1853584888);
				class534_sub19.aClass534_Sub40_Sub1_10513.method16713(class337.aString3523, 1802244946);
				class100.method1863(class534_sub19, (byte) 19);
			}
		}
	}

	static void method650(long[] ls, int[] is, int i, int i_33_, int i_34_) {
		if (i < i_33_) {
			int i_35_ = (i + i_33_) / 2;
			int i_36_ = i;
			long l = ls[i_35_];
			ls[i_35_] = ls[i_33_];
			ls[i_33_] = l;
			int i_37_ = is[i_35_];
			is[i_35_] = is[i_33_];
			is[i_33_] = i_37_;
			int i_38_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_39_ = i; i_39_ < i_33_; i_39_++) {
				if (ls[i_39_] < (long) (i_39_ & i_38_) + l) {
					long l_40_ = ls[i_39_];
					ls[i_39_] = ls[i_36_];
					ls[i_36_] = l_40_;
					int i_41_ = is[i_39_];
					is[i_39_] = is[i_36_];
					is[i_36_++] = i_41_;
				}
			}
			ls[i_33_] = ls[i_36_];
			ls[i_36_] = l;
			is[i_33_] = is[i_36_];
			is[i_36_] = i_37_;
			method650(ls, is, i, i_36_ - 1, -1548357808);
			method650(ls, is, 1 + i_36_, i_33_, -2100183909);
		}
	}
}
