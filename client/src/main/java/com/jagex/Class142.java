/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class142
{
    int anInt1635;
    Class126_Sub2 aClass126_Sub2_1636;
    Class185_Sub3 aClass185_Sub3_1637;
    Class144 aClass144_1638;
    int anInt1639;
    int anInt1640;
    boolean aBool1641 = true;
    static final int anInt1642 = 128;
    static final int anInt1643 = 7;
    Interface16 anInterface16_1644;
    int anInt1645;
    Class141_Sub2 aClass141_Sub2_1646;
    
    void method2404(byte[] is, int i) {
	aClass126_Sub2_1636.method101(5123, is, i * 2);
	method2407(aClass126_Sub2_1636, i);
    }
    
    void method2405() {
	method2407(anInterface16_1644, anInt1645);
    }
    
    void method2406(byte[] is, int i) {
	aClass126_Sub2_1636.method101(5123, is, i * 2);
	method2407(aClass126_Sub2_1636, i);
    }
    
    void method2407(Interface16 interface16, int i) {
	if (i != 0) {
	    method2408();
	    aClass185_Sub3_1637.method15231(aClass141_Sub2_1646);
	    aClass185_Sub3_1637.method15222(interface16, 4, 0, i);
	}
    }
    
    void method2408() {
	if (aBool1641) {
	    aBool1641 = false;
	    byte[] is = aClass144_1638.aByteArray1654;
	    byte[] is_0_ = aClass185_Sub3_1637.aByteArray9720;
	    int i = 0;
	    int i_1_ = aClass144_1638.anInt1658;
	    int i_2_ = anInt1639 + anInt1635 * aClass144_1638.anInt1658;
	    for (int i_3_ = -128; i_3_ < 0; i_3_++) {
		i = (i << 8) - i;
		for (int i_4_ = -128; i_4_ < 0; i_4_++) {
		    if (is[i_2_++] != 0)
			i++;
		}
		i_2_ += i_1_ - 128;
	    }
	    if (aClass141_Sub2_1646 != null && anInt1640 == i)
		aBool1641 = false;
	    else {
		anInt1640 = i;
		int i_5_ = 0;
		i_2_ = anInt1639 + anInt1635 * i_1_;
		for (int i_6_ = -128; i_6_ < 0; i_6_++) {
		    for (int i_7_ = -128; i_7_ < 0; i_7_++) {
			if (is[i_2_] != 0)
			    is_0_[i_5_++] = (byte) 68;
			else {
			    int i_8_ = 0;
			    if (is[i_2_ - 1] != 0)
				i_8_++;
			    if (is[i_2_ + 1] != 0)
				i_8_++;
			    if (is[i_2_ - i_1_] != 0)
				i_8_++;
			    if (is[i_2_ + i_1_] != 0)
				i_8_++;
			    is_0_[i_5_++] = (byte) (17 * i_8_);
			}
			i_2_++;
		    }
		    i_2_ += aClass144_1638.anInt1658 - 128;
		}
		if (aClass141_Sub2_1646 == null) {
		    aClass141_Sub2_1646
			= new Class141_Sub2(aClass185_Sub3_1637, 3553,
					    Class181.aClass181_1951,
					    Class173.aClass173_1830, 128, 128,
					    false,
					    aClass185_Sub3_1637.aByteArray9720,
					    Class181.aClass181_1951, false);
		    aClass141_Sub2_1646.method14454(false, false);
		    aClass141_Sub2_1646.method2382(true);
		} else
		    aClass141_Sub2_1646.method14450(0, 0, 128, 128,
						    (aClass185_Sub3_1637
						     .aByteArray9720),
						    Class181.aClass181_1951, 0,
						    0, false);
	    }
	}
    }
    
    void method2409() {
	if (aBool1641) {
	    aBool1641 = false;
	    byte[] is = aClass144_1638.aByteArray1654;
	    byte[] is_9_ = aClass185_Sub3_1637.aByteArray9720;
	    int i = 0;
	    int i_10_ = aClass144_1638.anInt1658;
	    int i_11_ = anInt1639 + anInt1635 * aClass144_1638.anInt1658;
	    for (int i_12_ = -128; i_12_ < 0; i_12_++) {
		i = (i << 8) - i;
		for (int i_13_ = -128; i_13_ < 0; i_13_++) {
		    if (is[i_11_++] != 0)
			i++;
		}
		i_11_ += i_10_ - 128;
	    }
	    if (aClass141_Sub2_1646 != null && anInt1640 == i)
		aBool1641 = false;
	    else {
		anInt1640 = i;
		int i_14_ = 0;
		i_11_ = anInt1639 + anInt1635 * i_10_;
		for (int i_15_ = -128; i_15_ < 0; i_15_++) {
		    for (int i_16_ = -128; i_16_ < 0; i_16_++) {
			if (is[i_11_] != 0)
			    is_9_[i_14_++] = (byte) 68;
			else {
			    int i_17_ = 0;
			    if (is[i_11_ - 1] != 0)
				i_17_++;
			    if (is[i_11_ + 1] != 0)
				i_17_++;
			    if (is[i_11_ - i_10_] != 0)
				i_17_++;
			    if (is[i_11_ + i_10_] != 0)
				i_17_++;
			    is_9_[i_14_++] = (byte) (17 * i_17_);
			}
			i_11_++;
		    }
		    i_11_ += aClass144_1638.anInt1658 - 128;
		}
		if (aClass141_Sub2_1646 == null) {
		    aClass141_Sub2_1646
			= new Class141_Sub2(aClass185_Sub3_1637, 3553,
					    Class181.aClass181_1951,
					    Class173.aClass173_1830, 128, 128,
					    false,
					    aClass185_Sub3_1637.aByteArray9720,
					    Class181.aClass181_1951, false);
		    aClass141_Sub2_1646.method14454(false, false);
		    aClass141_Sub2_1646.method2382(true);
		} else
		    aClass141_Sub2_1646.method14450(0, 0, 128, 128,
						    (aClass185_Sub3_1637
						     .aByteArray9720),
						    Class181.aClass181_1951, 0,
						    0, false);
	    }
	}
    }
    
    void method2410() {
	method2407(anInterface16_1644, anInt1645);
    }
    
    void method2411(Interface16 interface16, int i) {
	if (i != 0) {
	    method2408();
	    aClass185_Sub3_1637.method15231(aClass141_Sub2_1646);
	    aClass185_Sub3_1637.method15222(interface16, 4, 0, i);
	}
    }
    
    void method2412(byte[] is, int i) {
	aClass126_Sub2_1636.method101(5123, is, i * 2);
	method2407(aClass126_Sub2_1636, i);
    }
    
    void method2413() {
	method2407(anInterface16_1644, anInt1645);
    }
    
    void method2414() {
	if (aBool1641) {
	    aBool1641 = false;
	    byte[] is = aClass144_1638.aByteArray1654;
	    byte[] is_18_ = aClass185_Sub3_1637.aByteArray9720;
	    int i = 0;
	    int i_19_ = aClass144_1638.anInt1658;
	    int i_20_ = anInt1639 + anInt1635 * aClass144_1638.anInt1658;
	    for (int i_21_ = -128; i_21_ < 0; i_21_++) {
		i = (i << 8) - i;
		for (int i_22_ = -128; i_22_ < 0; i_22_++) {
		    if (is[i_20_++] != 0)
			i++;
		}
		i_20_ += i_19_ - 128;
	    }
	    if (aClass141_Sub2_1646 != null && anInt1640 == i)
		aBool1641 = false;
	    else {
		anInt1640 = i;
		int i_23_ = 0;
		i_20_ = anInt1639 + anInt1635 * i_19_;
		for (int i_24_ = -128; i_24_ < 0; i_24_++) {
		    for (int i_25_ = -128; i_25_ < 0; i_25_++) {
			if (is[i_20_] != 0)
			    is_18_[i_23_++] = (byte) 68;
			else {
			    int i_26_ = 0;
			    if (is[i_20_ - 1] != 0)
				i_26_++;
			    if (is[i_20_ + 1] != 0)
				i_26_++;
			    if (is[i_20_ - i_19_] != 0)
				i_26_++;
			    if (is[i_20_ + i_19_] != 0)
				i_26_++;
			    is_18_[i_23_++] = (byte) (17 * i_26_);
			}
			i_20_++;
		    }
		    i_20_ += aClass144_1638.anInt1658 - 128;
		}
		if (aClass141_Sub2_1646 == null) {
		    aClass141_Sub2_1646
			= new Class141_Sub2(aClass185_Sub3_1637, 3553,
					    Class181.aClass181_1951,
					    Class173.aClass173_1830, 128, 128,
					    false,
					    aClass185_Sub3_1637.aByteArray9720,
					    Class181.aClass181_1951, false);
		    aClass141_Sub2_1646.method14454(false, false);
		    aClass141_Sub2_1646.method2382(true);
		} else
		    aClass141_Sub2_1646.method14450(0, 0, 128, 128,
						    (aClass185_Sub3_1637
						     .aByteArray9720),
						    Class181.aClass181_1951, 0,
						    0, false);
	    }
	}
    }
    
    void method2415() {
	if (aBool1641) {
	    aBool1641 = false;
	    byte[] is = aClass144_1638.aByteArray1654;
	    byte[] is_27_ = aClass185_Sub3_1637.aByteArray9720;
	    int i = 0;
	    int i_28_ = aClass144_1638.anInt1658;
	    int i_29_ = anInt1639 + anInt1635 * aClass144_1638.anInt1658;
	    for (int i_30_ = -128; i_30_ < 0; i_30_++) {
		i = (i << 8) - i;
		for (int i_31_ = -128; i_31_ < 0; i_31_++) {
		    if (is[i_29_++] != 0)
			i++;
		}
		i_29_ += i_28_ - 128;
	    }
	    if (aClass141_Sub2_1646 != null && anInt1640 == i)
		aBool1641 = false;
	    else {
		anInt1640 = i;
		int i_32_ = 0;
		i_29_ = anInt1639 + anInt1635 * i_28_;
		for (int i_33_ = -128; i_33_ < 0; i_33_++) {
		    for (int i_34_ = -128; i_34_ < 0; i_34_++) {
			if (is[i_29_] != 0)
			    is_27_[i_32_++] = (byte) 68;
			else {
			    int i_35_ = 0;
			    if (is[i_29_ - 1] != 0)
				i_35_++;
			    if (is[i_29_ + 1] != 0)
				i_35_++;
			    if (is[i_29_ - i_28_] != 0)
				i_35_++;
			    if (is[i_29_ + i_28_] != 0)
				i_35_++;
			    is_27_[i_32_++] = (byte) (17 * i_35_);
			}
			i_29_++;
		    }
		    i_29_ += aClass144_1638.anInt1658 - 128;
		}
		if (aClass141_Sub2_1646 == null) {
		    aClass141_Sub2_1646
			= new Class141_Sub2(aClass185_Sub3_1637, 3553,
					    Class181.aClass181_1951,
					    Class173.aClass173_1830, 128, 128,
					    false,
					    aClass185_Sub3_1637.aByteArray9720,
					    Class181.aClass181_1951, false);
		    aClass141_Sub2_1646.method14454(false, false);
		    aClass141_Sub2_1646.method2382(true);
		} else
		    aClass141_Sub2_1646.method14450(0, 0, 128, 128,
						    (aClass185_Sub3_1637
						     .aByteArray9720),
						    Class181.aClass181_1951, 0,
						    0, false);
	    }
	}
    }
    
    Class142(Class185_Sub3 class185_sub3, Class144 class144,
	     Class151_Sub1 class151_sub1, int i, int i_36_, int i_37_,
	     int i_38_, int i_39_) {
	anInt1640 = -1;
	aClass185_Sub3_1637 = class185_sub3;
	aClass144_1638 = class144;
	anInt1639 = i_38_;
	anInt1635 = i_39_;
	int i_40_ = 1 << i_37_;
	int i_41_ = 0;
	int i_42_ = i << i_37_;
	int i_43_ = i_36_ << i_37_;
	for (int i_44_ = 0; i_44_ < i_40_; i_44_++) {
	    int i_45_
		= ((i_43_ + i_44_) * (class151_sub1.anInt1701 * -1924295585)
		   + i_42_);
	    for (int i_46_ = 0; i_46_ < i_40_; i_46_++) {
		short[] is = class151_sub1.aShortArrayArray9304[i_45_++];
		if (is != null)
		    i_41_ += is.length;
	    }
	}
	anInt1645 = i_41_;
	if (i_41_ > 0) {
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(i_41_ * 2);
	    if (aClass185_Sub3_1637.aBool9566) {
		for (int i_47_ = 0; i_47_ < i_40_; i_47_++) {
		    int i_48_ = ((i_43_ + i_47_) * (class151_sub1.anInt1701
						    * -1924295585)
				 + i_42_);
		    for (int i_49_ = 0; i_49_ < i_40_; i_49_++) {
			short[] is
			    = class151_sub1.aShortArrayArray9304[i_48_++];
			if (is != null) {
			    for (int i_50_ = 0; i_50_ < is.length; i_50_++)
				class534_sub40.method16507(is[i_50_] & 0xffff,
							   655579431);
			}
		    }
		}
	    } else {
		for (int i_51_ = 0; i_51_ < i_40_; i_51_++) {
		    int i_52_ = ((i_43_ + i_51_) * (class151_sub1.anInt1701
						    * -1924295585)
				 + i_42_);
		    for (int i_53_ = 0; i_53_ < i_40_; i_53_++) {
			short[] is
			    = class151_sub1.aShortArrayArray9304[i_52_++];
			if (is != null) {
			    for (int i_54_ = 0; i_54_ < is.length; i_54_++)
				class534_sub40.method16721(is[i_54_] & 0xffff,
							   1203548667);
			}
		    }
		}
	    }
	    anInterface16_1644
		= aClass185_Sub3_1637.method15217(5123,
						  (class534_sub40
						   .aByteArray10810),
						  (class534_sub40.anInt10811
						   * 31645619),
						  false);
	    aClass126_Sub2_1636
		= new Class126_Sub2(aClass185_Sub3_1637, 5123, null, 1);
	} else
	    aClass141_Sub2_1646 = null;
    }
}
