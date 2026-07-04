/* Class457 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.math.BigInteger;

public class Class457 {
	Class459[] aClass459Array4970;

	Class457(Class534_Sub40 class534_sub40, BigInteger biginteger, BigInteger biginteger_0_) {
		class534_sub40.anInt10811 = 1652589927;
		int i = class534_sub40.method16527(1606047415);
		class534_sub40.anInt10811 += i * 671635056;
		byte[] is = new byte[(class534_sub40.aByteArray10810.length - class534_sub40.anInt10811 * 31645619)];
		class534_sub40.method16735(is, 0, is.length, (short) -30345);
		byte[] is_1_;
		if (biginteger == null || null == biginteger_0_)
			is_1_ = is;
		else {
			BigInteger biginteger_2_ = new BigInteger(is);
			BigInteger biginteger_3_ = biginteger_2_.modPow(biginteger, biginteger_0_);
			is_1_ = biginteger_3_.toByteArray();
		}
		if (is_1_.length != 65 && is_1_.length != 64)
			throw new RuntimeException();
		byte[] is_4_ = Class70.method1413(class534_sub40.aByteArray10810, 5,
				(class534_sub40.anInt10811 * 31645619 - is.length - 5), 1784565753);
		for (int i_5_ = 0; i_5_ < 64; i_5_++) {
			if (is_1_[(is_1_.length == 65 ? 1 : 0) + i_5_] != is_4_[i_5_])
				throw new RuntimeException();
		}
		aClass459Array4970 = new Class459[i];
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			class534_sub40.anInt10811 = 671635056 * i_6_ + 265120994;
			int i_7_ = class534_sub40.method16533(-258848859);
			int i_8_ = class534_sub40.method16533(-258848859);
			int i_9_ = class534_sub40.method16533(-258848859);
			int i_10_ = class534_sub40.method16533(-258848859);
			byte[] is_11_ = new byte[64];
			class534_sub40.method16735(is_11_, 0, 64, (short) -25085);
			aClass459Array4970[i_6_] = new Class459(i_7_, i_9_, i_8_, i_10_, is_11_);
		}
	}

	static final void method7428(Class669 class669, int i) {
		int i_12_ = (class669.anIntArray8595[(class669.anInt8600 -= 308999563) * 2088438307]);
		Class247 class247 = Class112.method2017(i_12_, -372609800);
		Class243 class243 = Class44_Sub11.aClass243Array11006[i_12_ >> 16];
		Class155.method2578(class247, class243, class669, 2088438307);
	}

	static final void method7429(Class669 class669, int i) {
		int i_13_ = (class669.anIntArray8595[(class669.anInt8600 -= 308999563) * 2088438307]);
		Class247 class247 = Class112.method2017(i_13_, 226233160);
		Class243 class243 = Class44_Sub11.aClass243Array11006[i_13_ >> 16];
		Class556.method9394(class247, class243, class669, 1539114726);
	}

	static final void method7430(Class669 class669, int i) {
		if (Class172.aClass268_1824.method4877(-1743802813) > 0) {
			String string = (String) (class669.anObjectArray8593[(class669.anInt8594 -= 1460193483) * 1485266147]);
			String string_14_ = Class172.aClass268_1824.method4902(string, (byte) 31);
			class669.anObjectArray8593[(class669.anInt8594 += 1460193483) * 1485266147 - 1] = string_14_;
		}
	}

	static final void method7431(Class669 class669, byte i) {
		class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307 - 1)] = Class318.method5758(1963530766);
	}

	static void method7432(Class100 class100, int i) {
		Class534_Sub19 class534_sub19 = Class346.method6128(Class404.aClass404_4263, class100.aClass13_1183,
				1341391005);
		class100.method1863(class534_sub19, (byte) 48);
		client.aBool11339 = true;
	}
}
