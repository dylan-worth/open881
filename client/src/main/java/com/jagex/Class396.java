/* Class396 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class396 implements Interface48
{
    Class472 aClass472_4105;
    Class203 aClass203_4106 = new Class203(64);
    public static int anInt4107;
    
    public void method6567() {
	aClass203_4106.method3877(-1389598567);
    }
    
    public synchronized Class385 method352(int i) {
	Class385 class385 = (Class385) aClass203_4106.method3871((long) i);
	if (null != class385)
	    return class385;
	byte[] is = aClass472_4105.method7743(0, i, -1641017091);
	class385 = new Class385();
	if (null != is)
	    class385.method6480(new Class534_Sub40(is), (byte) -105);
	class385.method6488((byte) 67);
	aClass203_4106.method3893(class385, (long) i);
	return class385;
    }
    
    public void method6568(byte i) {
	aClass203_4106.method3877(460785804);
    }
    
    public void method6569() {
	aClass203_4106.method3877(500801779);
    }
    
    public synchronized Class385 method355(int i) {
	Class385 class385 = (Class385) aClass203_4106.method3871((long) i);
	if (null != class385)
	    return class385;
	byte[] is = aClass472_4105.method7743(0, i, -414232309);
	class385 = new Class385();
	if (null != is)
	    class385.method6480(new Class534_Sub40(is), (byte) -122);
	class385.method6488((byte) -45);
	aClass203_4106.method3893(class385, (long) i);
	return class385;
    }
    
    public Class396(Class472 class472) {
	aClass472_4105 = class472;
    }
    
    public synchronized Class385 method353(int i) {
	Class385 class385 = (Class385) aClass203_4106.method3871((long) i);
	if (null != class385)
	    return class385;
	byte[] is = aClass472_4105.method7743(0, i, -1539507364);
	class385 = new Class385();
	if (null != is)
	    class385.method6480(new Class534_Sub40(is), (byte) -24);
	class385.method6488((byte) 73);
	aClass203_4106.method3893(class385, (long) i);
	return class385;
    }
    
    public synchronized Class385 method354(int i, int i_0_) {
	Class385 class385 = (Class385) aClass203_4106.method3871((long) i);
	if (null != class385)
	    return class385;
	byte[] is = aClass472_4105.method7743(0, i, -457075910);
	class385 = new Class385();
	if (null != is)
	    class385.method6480(new Class534_Sub40(is), (byte) -117);
	class385.method6488((byte) 67);
	aClass203_4106.method3893(class385, (long) i);
	return class385;
    }
    
    static boolean method6570(Class185 class185, int i, byte i_1_) {
	class185.method3581();
	Class250.method4604((byte) -38);
	if (!class185.method3669(1819862316))
	    return false;
	int i_2_ = client.aClass512_11100.method8417(1757595029);
	int i_3_ = client.aClass512_11100.method8418(-1533611049);
	Class468 class468 = client.aClass512_11100.method8552((byte) 0);
	Class556 class556 = client.aClass512_11100.method8424((byte) 120);
	int i_4_ = i;
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null) {
	    int i_5_ = ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			 .anIntArray11977[0])
			>> 3);
	    int i_6_ = ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			 .anIntArray11978[0])
			>> 3);
	    if (i_5_ >= 0 && i_5_ < Class113.aBoolArrayArray1374.length
		&& i_6_ >= 0
		&& i_6_ < Class113.aBoolArrayArray1374[i_5_].length
		&& Class113.aBoolArrayArray1374[i_5_][i_6_])
		i_4_ = 0;
	}
	int i_7_ = i_2_ / 2;
	int i_8_ = 0;
	int i_9_ = 0;
	boolean bool = true;
	for (int i_10_ = i_8_; i_10_ < i_8_ + i_2_; i_10_++) {
	    for (int i_11_ = i_9_; i_11_ < i_3_ + i_9_; i_11_++) {
		for (int i_12_ = i_4_; i_12_ <= 3; i_12_++) {
		    if (i_12_ < i || class468.method7609(i, i_12_, i_10_,
							 i_11_, 2138415711)) {
			int i_13_ = i_12_;
			if (class468.method7612(i_10_, i_11_, (byte) 0))
			    i_13_--;
			if (i_13_ >= 0)
			    bool &= Class260.method4806(i_13_, i_10_, i_11_,
							-957230013);
		    }
		}
	    }
	}
	if (!bool)
	    return false;
	int i_14_ = i_2_ * 4 + 48 + 48;
	int[] is = new int[i_14_ * i_14_];
	for (int i_15_ = 0; i_15_ < is.length; i_15_++)
	    is[i_15_] = 0;
	Class175_Sub1 class175_sub1 = null;
	int i_16_ = 0;
	int i_17_ = 0;
	if (Class113.aBool1367) {
	    Class613.aClass163_8025
		= class185.method3315(i_14_, i_14_, false, true);
	    class175_sub1 = class185.method3263();
	    class175_sub1.method15075(0, Class613.aClass163_8025.method2651());
	    Interface21 interface21 = class185.method3265(i_14_, i_14_);
	    class175_sub1.method15074(interface21);
	    class185.method3260(class175_sub1, 1319856503);
	    i_7_ = i_2_;
	    i_16_ = 48;
	    i_17_ = 48;
	    class185.method3340(1, 0);
	} else
	    Class613.aClass163_8025
		= class185.method3317(is, 0, i_14_, i_14_, i_14_, (byte) 43);
	client.aClass512_11100.method8501((byte) -44).method10176((byte) 1);
	int i_18_
	    = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16)
			   + (238 + (int) (Math.random() * 20.0) - 10 << 8)
			   + (238 + (int) (Math.random() * 20.0) - 10));
	int i_19_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
	int i_20_ = ((int) (Math.random() * 8.0) << 16
		     | (int) (Math.random() * 8.0) << 8
		     | (int) (Math.random() * 8.0));
	boolean[][] bools = new boolean[2 + (1 + i_7_)][2 + (i_7_ + 1)];
	class185.method3283(Class113.anIntArray1368);
	class185.method3281();
	for (int i_21_ = i_8_; i_21_ < i_8_ + i_2_; i_21_ += i_7_) {
	    for (int i_22_ = i_9_; i_22_ < i_3_ + i_9_; i_22_ += i_7_) {
		int i_23_ = i_16_;
		int i_24_ = i_17_;
		int i_25_ = i_21_;
		if (i_25_ > 0) {
		    i_25_--;
		    i_23_ += 4;
		}
		int i_26_ = i_22_;
		if (i_26_ > 0)
		    i_26_--;
		int i_27_ = i_21_ + i_7_;
		if (i_27_ < i_2_)
		    i_27_++;
		int i_28_ = i_22_ + i_7_;
		if (i_28_ < i_3_) {
		    i_28_++;
		    i_24_ += 4;
		}
		if (Class113.aBool1366)
		    class185.method3537();
		else
		    class185.method3373(0, 0, i_23_ + 4 * i_7_,
					4 * i_7_ + i_24_);
		class185.method3340(3, -16777216);
		int i_29_ = i_7_;
		if (i_29_ > i_2_ - 1)
		    i_29_ = i_2_ - 1;
		for (int i_30_ = i_4_; i_30_ <= 3; i_30_++) {
		    for (int i_31_ = 0; i_31_ <= i_29_; i_31_++) {
			for (int i_32_ = 0; i_32_ <= i_29_; i_32_++)
			    bools[i_31_][i_32_]
				= (i_30_ < i
				   || class468.method7609(i, i_30_,
							  i_25_ + i_31_,
							  i_32_ + i_26_,
							  2033135355));
		    }
		    class556.aClass151Array7434[i_30_].method2527(i_16_, i_17_,
								  1024, i_25_,
								  i_26_, i_27_,
								  i_28_,
								  bools);
		    for (int i_33_ = -4; i_33_ < i_7_; i_33_++) {
			for (int i_34_ = -4; i_34_ < i_7_; i_34_++) {
			    int i_35_ = i_33_ + i_21_;
			    int i_36_ = i_34_ + i_22_;
			    if (i_35_ >= i_8_ && i_36_ >= i_9_
				&& (i_30_ < i
				    || class468.method7609(i, i_30_, i_35_,
							   i_36_,
							   1957323163))) {
				int i_37_ = i_30_;
				if (class468.method7612(i_35_, i_36_,
							(byte) 0))
				    i_37_--;
				if (i_37_ >= 0)
				    Class369.method6377(class185, i_37_, i_35_,
							i_36_,
							4 * i_33_ + i_23_,
							(i_24_
							 + 4 * (i_7_ - i_34_)
							 - 4),
							i_18_, i_19_,
							-528529294);
			    }
			}
		    }
		}
		class185.method3298(i_23_, i_24_, i_7_ * 4, 4 * i_7_, i_20_,
				    2);
		class185.method3581();
		if (!Class113.aBool1367) {
		    Class613.aClass163_8025.method2717(4 * (i_21_ - i_8_) + 48,
						       (48 + i_3_ * 4
							- (i_22_ - i_9_) * 4
							- 4 * i_7_),
						       4 * i_7_, i_7_ * 4,
						       i_23_, i_24_);
		    if (Class113.aBool1366) {
			Class613.aClass163_8025.method2656(256, 0);
			try {
			    class185.method3289(1998398707);
			    Class251.method4622(2000L);
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		}
	    }
	}
	if (Class113.aBool1367) {
	    class185.method3261(class175_sub1, -11578496);
	    if (Class113.aBool1366) {
		Class613.aClass163_8025.method2656(256, 0);
		try {
		    class185.method3289(1606635506);
		    Class251.method4622(2000L);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	class185.method3537();
	class185.method3318(Class113.anIntArray1368[0],
			    Class113.anIntArray1368[1],
			    Class113.anIntArray1368[2],
			    Class113.anIntArray1368[3]);
	class185.method3340(1, 1);
	Class422.method6785((byte) -112);
	Class113.anInt1380 = 0;
	Class113.aClass700_1369.method14152(-1041853042);
	if (!Class113.aBool1378) {
	    Class690_Sub27.method17128(i, 706316241);
	    Class523 class523 = client.aClass512_11100.method8419(-592488228);
	    if (null != class523) {
		Class222.aClass44_Sub9_2313.method17322(1024, 64, 1394263127);
		Class597 class597
		    = client.aClass512_11100.method8416((byte) 70);
		for (int i_38_ = 0; i_38_ < -942354647 * class523.anInt7086;
		     i_38_++) {
		    int i_39_ = class523.anIntArray7085[i_38_];
		    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854
			== i_39_ >> 28) {
			int i_40_ = ((i_39_ >> 14 & 0x3fff)
				     - -424199969 * class597.anInt7859);
			int i_41_ = ((i_39_ & 0x3fff)
				     - class597.anInt7861 * -1166289421);
			if (i_40_ >= 0 && i_40_ < i_2_ && i_41_ >= 0
			    && i_41_ < i_3_)
			    Class113.aClass700_1369.method14131
				(new Class534_Sub39(i_38_), (short) 789);
			else {
			    Class272 class272
				= ((Class272)
				   (Class222.aClass44_Sub9_2313.method91
				    (class523.anIntArray7084[i_38_],
				     -1317704041)));
			    if (class272.anIntArray2992 != null
				&& i_40_ + class272.anInt3005 * -321707117 >= 0
				&& (i_40_ + 1863424643 * class272.anInt2993
				    < i_2_)
				&& i_41_ + -967887583 * class272.anInt2996 >= 0
				&& (i_41_ + class272.anInt2989 * 148212907
				    < i_3_))
				Class113.aClass700_1369.method14131
				    (new Class534_Sub39(i_38_), (short) 789);
			}
		    }
		}
		Class222.aClass44_Sub9_2313.method17322(128, 64, 1440385882);
	    }
	}
	return true;
    }
    
    public static Class712 method6571(int i, int i_42_) {
	Class712[] class712s = Class130.method2306(367202879);
	for (int i_43_ = 0; i_43_ < class712s.length; i_43_++) {
	    Class712 class712 = class712s[i_43_];
	    if (class712.anInt8877 * -1439134429 == i)
		return class712;
	}
	return null;
    }
    
    static final void method6572(Class669 class669, byte i) {
	class669.anInt8600 -= 926998689;
	int i_44_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_45_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	int i_46_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2];
	Class534_Sub18_Sub12 class534_sub18_sub12
	    = RuntimeException_Sub4.aClass56_12127.method1218(i_44_,
							      -1581069180);
	if ((class534_sub18_sub12.method18361(i_45_, -1923608425).anInt8333
	     * 41641943)
	    != 0)
	    throw new RuntimeException("");
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class534_sub18_sub12.method18372(i_45_, i_46_, 1957897995);
    }
    
    static final void method6573(Class669 class669, int i) {
	class669.anInt8600 -= 308999563;
    }
}
