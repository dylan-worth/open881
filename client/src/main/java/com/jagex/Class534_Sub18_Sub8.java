/* Class534_Sub18_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub18_Sub8 extends Class534_Sub18
{
    public int anInt11749;
    public Class583 aClass583_11750;
    public String aString11751;
    public int[] anIntArray11752;
    public Object[] anObjectArray11753;
    public int anInt11754;
    public int anInt11755;
    public int anInt11756;
    public int anInt11757;
    public int anInt11758;
    public Class9[] aClass9Array11759;
    public Class515[] aClass515Array11760;
    Interface18 anInterface18_11761;
    
    int method18253(Class534_Sub40 class534_sub40) {
	class534_sub40.anInt10811
	    = -1387468933 * (class534_sub40.aByteArray10810.length - 2);
	int i = class534_sub40.method16529((byte) 1);
	int i_0_ = class534_sub40.aByteArray10810.length - 2 - i - 16;
	class534_sub40.anInt10811 = i_0_ * -1387468933;
	int i_1_ = class534_sub40.method16533(-258848859);
	anInt11754 = class534_sub40.method16529((byte) 1) * 1732062005;
	anInt11755 = class534_sub40.method16529((byte) 1) * -796098427;
	anInt11757 = class534_sub40.method16529((byte) 1) * 1635198705;
	anInt11756 = class534_sub40.method16529((byte) 1) * -771796907;
	anInt11758 = class534_sub40.method16529((byte) 1) * -1000336465;
	anInt11749 = class534_sub40.method16529((byte) 1) * -666423281;
	int i_2_ = class534_sub40.method16527(-508025140);
	if (i_2_ > 0) {
	    aClass9Array11759 = new Class9[i_2_];
	    for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
		int i_4_ = class534_sub40.method16529((byte) 1);
		Class9 class9
		    = new Class9(Class162.method2640(i_4_, (byte) 9));
		aClass9Array11759[i_3_] = class9;
		while (i_4_-- > 0) {
		    int i_5_ = class534_sub40.method16533(-258848859);
		    int i_6_ = class534_sub40.method16533(-258848859);
		    class9.method581(new Class534_Sub39(i_6_), (long) i_5_);
		}
	    }
	}
	class534_sub40.anInt10811 = 0;
	aString11751 = class534_sub40.method16540(76978635);
	aClass515Array11760 = new Class515[i_1_];
	return i_0_;
    }
    
    Class515 method18254(Class534_Sub40 class534_sub40, Class515[] class515s) {
	int i = class534_sub40.method16529((byte) 1);
	if (i < 0 || i >= class515s.length)
	    throw new RuntimeException("");
	Class515 class515 = class515s[i];
	return class515;
    }
    
    int method18255(Class534_Sub40 class534_sub40, int i) {
	class534_sub40.anInt10811
	    = -1387468933 * (class534_sub40.aByteArray10810.length - 2);
	int i_7_ = class534_sub40.method16529((byte) 1);
	int i_8_ = class534_sub40.aByteArray10810.length - 2 - i_7_ - 16;
	class534_sub40.anInt10811 = i_8_ * -1387468933;
	int i_9_ = class534_sub40.method16533(-258848859);
	anInt11754 = class534_sub40.method16529((byte) 1) * 1732062005;
	anInt11755 = class534_sub40.method16529((byte) 1) * -796098427;
	anInt11757 = class534_sub40.method16529((byte) 1) * 1635198705;
	anInt11756 = class534_sub40.method16529((byte) 1) * -771796907;
	anInt11758 = class534_sub40.method16529((byte) 1) * -1000336465;
	anInt11749 = class534_sub40.method16529((byte) 1) * -666423281;
	int i_10_ = class534_sub40.method16527(-122503162);
	if (i_10_ > 0) {
	    aClass9Array11759 = new Class9[i_10_];
	    for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
		int i_12_ = class534_sub40.method16529((byte) 1);
		Class9 class9
		    = new Class9(Class162.method2640(i_12_, (byte) 71));
		aClass9Array11759[i_11_] = class9;
		while (i_12_-- > 0) {
		    int i_13_ = class534_sub40.method16533(-258848859);
		    int i_14_ = class534_sub40.method16533(-258848859);
		    class9.method581(new Class534_Sub39(i_14_), (long) i_13_);
		}
	    }
	}
	class534_sub40.anInt10811 = 0;
	aString11751 = class534_sub40.method16540(76978635);
	aClass515Array11760 = new Class515[i_9_];
	return i_8_;
    }
    
    void method18256(Class534_Sub40 class534_sub40, int i, Class515 class515,
		     int i_15_) {
	int i_16_ = aClass515Array11760.length;
	if (class515 == Class515.aClass515_5733
	    || class515 == Class515.aClass515_6864) {
	    Class453 class453
		= ((Class453)
		   Class448.method7319(Class453.method7393(-1596638109),
				       class534_sub40.method16527(-1000958148),
				       2088438307));
	    int i_17_ = class534_sub40.method16529((byte) 1);
	    if (anObjectArray11753 == null)
		anObjectArray11753 = new Object[i_16_];
	    anObjectArray11753[i]
		= anInterface18_11761.method108(class453, i_17_, 2055829527);
	    if (anIntArray11752 == null)
		anIntArray11752 = new int[i_16_];
	    anIntArray11752[i] = class534_sub40.method16527(1797682880);
	} else if (class515 == Class515.aClass515_5737) {
	    Class483 class483
		= ((Class483)
		   Class448.method7319(Class483.method7942(-88965010),
				       class534_sub40.method16527(-2128251260),
				       2088438307));
	    switch (class483.anInt5276 * 973874463) {
	    case 4:
		if (null == anIntArray11752)
		    anIntArray11752 = new int[i_16_];
		class515 = Class515.aClass515_6826;
		anIntArray11752[i] = class534_sub40.method16533(-258848859);
		break;
	    case 3:
		if (null == anObjectArray11753)
		    anObjectArray11753 = new Object[i_16_];
		class515 = Class515.aClass515_5757;
		anObjectArray11753[i]
		    = Long.valueOf(class534_sub40.method16537(1359621443));
		break;
	    default:
		throw new RuntimeException();
	    case 0:
		if (null == anObjectArray11753)
		    anObjectArray11753 = new Object[i_16_];
		anObjectArray11753[i]
		    = class534_sub40.method16541((byte) -23).intern();
	    }
	} else if (Class515.aClass515_5735 == class515
		   || class515 == Class515.aClass515_5736) {
	    int i_18_ = class534_sub40.method16529((byte) 1);
	    if (null == anObjectArray11753)
		anObjectArray11753 = new Object[i_16_];
	    anObjectArray11753[i]
		= anInterface18_11761.method107(i_18_, 1504047109);
	    if (null == anIntArray11752)
		anIntArray11752 = new int[i_16_];
	    anIntArray11752[i] = class534_sub40.method16527(350398780);
	} else {
	    if (null == anIntArray11752)
		anIntArray11752 = new int[i_16_];
	    if (null != class515 && class515.aBool7013)
		anIntArray11752[i] = class534_sub40.method16533(-258848859);
	    else
		anIntArray11752[i] = class534_sub40.method16527(813727132);
	}
	aClass515Array11760[i] = class515;
    }
    
    public Class534_Sub18_Sub8(Class534_Sub40 class534_sub40,
			       Interface18 interface18) {
	anInterface18_11761 = interface18;
	int i = method18255(class534_sub40, -2056207392);
	int i_19_ = 0;
	Class515[] class515s = Class42.method1067((byte) 16);
	while (31645619 * class534_sub40.anInt10811 < i) {
	    Class515 class515
		= method18257(class534_sub40, class515s, (short) 13434);
	    method18256(class534_sub40, i_19_, class515, 612116995);
	    i_19_++;
	}
    }
    
    Class515 method18257(Class534_Sub40 class534_sub40, Class515[] class515s,
			 short i) {
	int i_20_ = class534_sub40.method16529((byte) 1);
	if (i_20_ < 0 || i_20_ >= class515s.length)
	    throw new RuntimeException("");
	Class515 class515 = class515s[i_20_];
	return class515;
    }
    
    int method18258(Class534_Sub40 class534_sub40) {
	class534_sub40.anInt10811
	    = -1387468933 * (class534_sub40.aByteArray10810.length - 2);
	int i = class534_sub40.method16529((byte) 1);
	int i_21_ = class534_sub40.aByteArray10810.length - 2 - i - 16;
	class534_sub40.anInt10811 = i_21_ * -1387468933;
	int i_22_ = class534_sub40.method16533(-258848859);
	anInt11754 = class534_sub40.method16529((byte) 1) * 1732062005;
	anInt11755 = class534_sub40.method16529((byte) 1) * -796098427;
	anInt11757 = class534_sub40.method16529((byte) 1) * 1635198705;
	anInt11756 = class534_sub40.method16529((byte) 1) * -771796907;
	anInt11758 = class534_sub40.method16529((byte) 1) * -1000336465;
	anInt11749 = class534_sub40.method16529((byte) 1) * -666423281;
	int i_23_ = class534_sub40.method16527(-1157365450);
	if (i_23_ > 0) {
	    aClass9Array11759 = new Class9[i_23_];
	    for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
		int i_25_ = class534_sub40.method16529((byte) 1);
		Class9 class9
		    = new Class9(Class162.method2640(i_25_, (byte) 12));
		aClass9Array11759[i_24_] = class9;
		while (i_25_-- > 0) {
		    int i_26_ = class534_sub40.method16533(-258848859);
		    int i_27_ = class534_sub40.method16533(-258848859);
		    class9.method581(new Class534_Sub39(i_27_), (long) i_26_);
		}
	    }
	}
	class534_sub40.anInt10811 = 0;
	aString11751 = class534_sub40.method16540(76978635);
	aClass515Array11760 = new Class515[i_22_];
	return i_21_;
    }
    
    void method18259(Class534_Sub40 class534_sub40, int i, Class515 class515) {
	int i_28_ = aClass515Array11760.length;
	if (class515 == Class515.aClass515_5733
	    || class515 == Class515.aClass515_6864) {
	    Class453 class453
		= ((Class453)
		   Class448.method7319(Class453.method7393(-1835563594),
				       class534_sub40.method16527(992132539),
				       2088438307));
	    int i_29_ = class534_sub40.method16529((byte) 1);
	    if (anObjectArray11753 == null)
		anObjectArray11753 = new Object[i_28_];
	    anObjectArray11753[i]
		= anInterface18_11761.method108(class453, i_29_, 1731593620);
	    if (anIntArray11752 == null)
		anIntArray11752 = new int[i_28_];
	    anIntArray11752[i] = class534_sub40.method16527(574913159);
	} else if (class515 == Class515.aClass515_5737) {
	    Class483 class483
		= ((Class483)
		   Class448.method7319(Class483.method7942(-88965010),
				       class534_sub40.method16527(212997526),
				       2088438307));
	    switch (class483.anInt5276 * 973874463) {
	    case 4:
		if (null == anIntArray11752)
		    anIntArray11752 = new int[i_28_];
		class515 = Class515.aClass515_6826;
		anIntArray11752[i] = class534_sub40.method16533(-258848859);
		break;
	    case 3:
		if (null == anObjectArray11753)
		    anObjectArray11753 = new Object[i_28_];
		class515 = Class515.aClass515_5757;
		anObjectArray11753[i]
		    = Long.valueOf(class534_sub40.method16537(1359621443));
		break;
	    default:
		throw new RuntimeException();
	    case 0:
		if (null == anObjectArray11753)
		    anObjectArray11753 = new Object[i_28_];
		anObjectArray11753[i]
		    = class534_sub40.method16541((byte) -93).intern();
	    }
	} else if (Class515.aClass515_5735 == class515
		   || class515 == Class515.aClass515_5736) {
	    int i_30_ = class534_sub40.method16529((byte) 1);
	    if (null == anObjectArray11753)
		anObjectArray11753 = new Object[i_28_];
	    anObjectArray11753[i]
		= anInterface18_11761.method107(i_30_, 1504047109);
	    if (null == anIntArray11752)
		anIntArray11752 = new int[i_28_];
	    anIntArray11752[i] = class534_sub40.method16527(-2041105907);
	} else {
	    if (null == anIntArray11752)
		anIntArray11752 = new int[i_28_];
	    if (null != class515 && class515.aBool7013)
		anIntArray11752[i] = class534_sub40.method16533(-258848859);
	    else
		anIntArray11752[i] = class534_sub40.method16527(-1379672447);
	}
	aClass515Array11760[i] = class515;
    }
}
