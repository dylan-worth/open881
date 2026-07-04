/* Class326 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class326 implements Interface32
{
    Class472 aClass472_3456;
    Class389 aClass389_3457;
    Class163 aClass163_3458;
    
    public boolean method206() {
	return aClass472_3456.method7670(aClass389_3457.anInt4059 * 632315143,
					 (byte) -31);
    }
    
    public void method203() {
	aClass163_3458
	    = Class243.method4480(aClass472_3456,
				  632315143 * aClass389_3457.anInt4059,
				  1182751385);
    }
    
    public void method205(boolean bool, byte i) {
	if (bool) {
	    int i_0_ = ((1771907305 * Class706_Sub4.anInt10994
			 > -321474631 * client.anInt11047)
			? 1771907305 * Class706_Sub4.anInt10994
			: -321474631 * client.anInt11047);
	    int i_1_ = ((Class18.anInt205 * -1091172141
			 > 43072843 * client.anInt11192)
			? -1091172141 * Class18.anInt205
			: client.anInt11192 * 43072843);
	    int i_2_ = aClass163_3458.method22();
	    int i_3_ = aClass163_3458.method2692();
	    int i_4_ = 0;
	    int i_5_ = i_0_;
	    int i_6_ = i_0_ * i_3_ / i_2_;
	    int i_7_ = (i_1_ - i_6_) / 2;
	    if (i_6_ > i_1_) {
		i_7_ = 0;
		i_6_ = i_1_;
		i_5_ = i_1_ * i_2_ / i_3_;
		i_4_ = (i_0_ - i_5_) / 2;
	    }
	    aClass163_3458.method2659(i_4_, i_7_, i_5_, i_6_);
	}
    }
    
    public boolean method199(int i) {
	return aClass472_3456.method7670(aClass389_3457.anInt4059 * 632315143,
					 (byte) -67);
    }
    
    public boolean method200() {
	return aClass472_3456.method7670(aClass389_3457.anInt4059 * 632315143,
					 (byte) -26);
    }
    
    Class326(Class472 class472, Class389 class389) {
	aClass472_3456 = class472;
	aClass389_3457 = class389;
    }
    
    public boolean method204() {
	return aClass472_3456.method7670(aClass389_3457.anInt4059 * 632315143,
					 (byte) -49);
    }
    
    public boolean method208() {
	return aClass472_3456.method7670(aClass389_3457.anInt4059 * 632315143,
					 (byte) -102);
    }
    
    public void method201(short i) {
	aClass163_3458
	    = Class243.method4480(aClass472_3456,
				  632315143 * aClass389_3457.anInt4059,
				  224154686);
    }
    
    public void method202(boolean bool) {
	if (bool) {
	    int i = ((1771907305 * Class706_Sub4.anInt10994
		      > -321474631 * client.anInt11047)
		     ? 1771907305 * Class706_Sub4.anInt10994
		     : -321474631 * client.anInt11047);
	    int i_8_ = ((Class18.anInt205 * -1091172141
			 > 43072843 * client.anInt11192)
			? -1091172141 * Class18.anInt205
			: client.anInt11192 * 43072843);
	    int i_9_ = aClass163_3458.method22();
	    int i_10_ = aClass163_3458.method2692();
	    int i_11_ = 0;
	    int i_12_ = i;
	    int i_13_ = i * i_10_ / i_9_;
	    int i_14_ = (i_8_ - i_13_) / 2;
	    if (i_13_ > i_8_) {
		i_14_ = 0;
		i_13_ = i_8_;
		i_12_ = i_8_ * i_9_ / i_10_;
		i_11_ = (i - i_12_) / 2;
	    }
	    aClass163_3458.method2659(i_11_, i_14_, i_12_, i_13_);
	}
    }
    
    public boolean method207() {
	return aClass472_3456.method7670(aClass389_3457.anInt4059 * 632315143,
					 (byte) -72);
    }
    
    static final void method5819(int i) {
	if (client.aFloat11302 < 1083.0F)
	    client.aFloat11302 = 1083.0F;
	if (client.aFloat11302 > 2987.0F)
	    client.aFloat11302 = 2987.0F;
	for (/**/; client.aFloat11140 >= 16384.0F;
	     client.aFloat11140 -= 16384.0F) {
	    /* empty */
	}
	for (/**/; client.aFloat11140 < 0.0F; client.aFloat11140 += 16384.0F) {
	    /* empty */
	}
	Class468 class468 = client.aClass512_11100.method8552((byte) 0);
	Class556 class556 = client.aClass512_11100.method8424((byte) 43);
	int i_15_ = Class588.anInt7808 * 1490134939 >> 9;
	int i_16_ = Class453.anInt4958 * -1293868227 >> 9;
	int i_17_
	    = Class247.method4595(1490134939 * Class588.anInt7808,
				  -1293868227 * Class453.anInt4958,
				  Class674.anInt8633 * -878424575, -528232915);
	int i_18_ = 0;
	if (i_15_ > 3 && i_16_ > 3
	    && i_15_ < client.aClass512_11100.method8417(512757731) - 4
	    && i_16_ < client.aClass512_11100.method8418(-1533611049) - 4) {
	    for (int i_19_ = i_15_ - 4; i_19_ <= i_15_ + 4; i_19_++) {
		for (int i_20_ = i_16_ - 4; i_20_ <= 4 + i_16_; i_20_++) {
		    int i_21_ = Class674.anInt8633 * -878424575;
		    if (i_21_ < 3
			&& class468.method7612(i_19_, i_20_, (byte) 0))
			i_21_++;
		    int i_22_ = 0;
		    byte[][] is
			= client.aClass512_11100.method8450(i_21_,
							    -2125889453);
		    if (null != is)
			i_22_ = (is[i_19_][i_20_] & 0xff) * 8 << 2;
		    if (null != class556.aClass151Array7432
			&& class556.aClass151Array7432[i_21_] != null) {
			int i_23_
			    = (i_17_
			       - (class556.aClass151Array7432[i_21_]
				      .method2491(i_19_, i_20_, -266544224)
				  - i_22_));
			if (i_23_ > i_18_)
			    i_18_ = i_23_;
		    }
		}
	    }
	}
	int i_24_ = 1536 * (i_18_ >> 2);
	if (i_24_ > 786432)
	    i_24_ = 786432;
	if (i_24_ < 262144)
	    i_24_ = 262144;
	if (i_24_ > client.anInt11019 * 544044433)
	    client.anInt11019
		+= 1259596657 * ((i_24_ - client.anInt11019 * 544044433) / 24);
	else if (i_24_ < client.anInt11019 * 544044433)
	    client.anInt11019
		+= 1259596657 * ((i_24_ - 544044433 * client.anInt11019) / 80);
    }
}
