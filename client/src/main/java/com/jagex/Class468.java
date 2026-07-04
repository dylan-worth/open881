/* Class468 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Point;

public class Class468
{
    static final int anInt5139 = 16;
    static final int anInt5140 = 2;
    public static final int anInt5141 = 4;
    public static final int anInt5142 = 2;
    public static final int anInt5143 = 8;
    static final int anInt5144 = 2;
    public byte[][][] aByteArrayArrayArray5145;
    static Class44_Sub1 aClass44_Sub1_5146;
    
    public void method7605() {
	for (int i = 0; i < aByteArrayArrayArray5145.length; i++) {
	    for (int i_0_ = 0; i_0_ < aByteArrayArrayArray5145[0].length;
		 i_0_++) {
		for (int i_1_ = 0;
		     i_1_ < aByteArrayArrayArray5145[0][0].length; i_1_++)
		    aByteArrayArrayArray5145[i][i_0_][i_1_] = (byte) 0;
	    }
	}
    }
    
    public boolean method7606(int i, int i_2_) {
	if (i < 0 || i_2_ < 0 || i >= aByteArrayArrayArray5145[1].length
	    || i_2_ >= aByteArrayArrayArray5145[1][i].length)
	    return false;
	if ((aByteArrayArrayArray5145[1][i][i_2_] & 0x2) != 0)
	    return true;
	return false;
    }
    
    public void method7607(int i) {
	for (int i_3_ = 0; i_3_ < aByteArrayArrayArray5145.length; i_3_++) {
	    for (int i_4_ = 0; i_4_ < aByteArrayArrayArray5145[0].length;
		 i_4_++) {
		for (int i_5_ = 0;
		     i_5_ < aByteArrayArrayArray5145[0][0].length; i_5_++)
		    aByteArrayArrayArray5145[i_3_][i_4_][i_5_] = (byte) 0;
	    }
	}
    }
    
    public boolean method7608(int i, int i_6_, int i_7_) {
	if (i < 0 || i_6_ < 0 || i >= aByteArrayArrayArray5145[3].length
	    || i_6_ >= aByteArrayArrayArray5145[3][i].length)
	    return false;
	return (aByteArrayArrayArray5145[3][i][i_6_] & 0x2) != 0;
    }
    
    public boolean method7609(int i, int i_8_, int i_9_, int i_10_,
			      int i_11_) {
	if ((aByteArrayArrayArray5145[0][i_9_][i_10_] & 0x2) != 0)
	    return true;
	if (0 != (aByteArrayArrayArray5145[i_8_][i_9_][i_10_] & 0x10))
	    return false;
	if (method7610(i_8_, i_9_, i_10_, (byte) 1) == i)
	    return true;
	return false;
    }
    
    int method7610(int i, int i_12_, int i_13_, byte i_14_) {
	if ((aByteArrayArrayArray5145[i][i_12_][i_13_] & 0x8) != 0)
	    return 0;
	if (i > 0 && 0 != (aByteArrayArrayArray5145[1][i_12_][i_13_] & 0x2))
	    return i - 1;
	return i;
    }
    
    public void method7611() {
	for (int i = 0; i < aByteArrayArrayArray5145.length; i++) {
	    for (int i_15_ = 0; i_15_ < aByteArrayArrayArray5145[0].length;
		 i_15_++) {
		for (int i_16_ = 0;
		     i_16_ < aByteArrayArrayArray5145[0][0].length; i_16_++)
		    aByteArrayArrayArray5145[i][i_15_][i_16_] = (byte) 0;
	    }
	}
    }
    
    public boolean method7612(int i, int i_17_, byte i_18_) {
	if (i < 0 || i_17_ < 0 || i >= aByteArrayArrayArray5145[1].length
	    || i_17_ >= aByteArrayArrayArray5145[1][i].length)
	    return false;
	if ((aByteArrayArrayArray5145[1][i][i_17_] & 0x2) != 0)
	    return true;
	return false;
    }
    
    public boolean method7613(int i, int i_19_) {
	if (i < 0 || i_19_ < 0 || i >= aByteArrayArrayArray5145[3].length
	    || i_19_ >= aByteArrayArrayArray5145[3][i].length)
	    return false;
	return (aByteArrayArrayArray5145[3][i][i_19_] & 0x2) != 0;
    }
    
    public boolean method7614(int i, int i_20_) {
	if (i < 0 || i_20_ < 0 || i >= aByteArrayArrayArray5145[3].length
	    || i_20_ >= aByteArrayArrayArray5145[3][i].length)
	    return false;
	return (aByteArrayArrayArray5145[3][i][i_20_] & 0x2) != 0;
    }
    
    public boolean method7615(int i, int i_21_) {
	if (i < 0 || i_21_ < 0 || i >= aByteArrayArrayArray5145[1].length
	    || i_21_ >= aByteArrayArrayArray5145[1][i].length)
	    return false;
	if ((aByteArrayArrayArray5145[1][i][i_21_] & 0x2) != 0)
	    return true;
	return false;
    }
    
    public Class468(int i, int i_22_, int i_23_) {
	aByteArrayArrayArray5145 = new byte[i][i_22_][i_23_];
    }
    
    public boolean method7616(int i, int i_24_) {
	if (i < 0 || i_24_ < 0 || i >= aByteArrayArrayArray5145[1].length
	    || i_24_ >= aByteArrayArrayArray5145[1][i].length)
	    return false;
	if ((aByteArrayArrayArray5145[1][i][i_24_] & 0x2) != 0)
	    return true;
	return false;
    }
    
    public boolean method7617(int i, int i_25_) {
	if (i < 0 || i_25_ < 0 || i >= aByteArrayArrayArray5145[1].length
	    || i_25_ >= aByteArrayArrayArray5145[1][i].length)
	    return false;
	if ((aByteArrayArrayArray5145[1][i][i_25_] & 0x2) != 0)
	    return true;
	return false;
    }
    
    public boolean method7618(int i, int i_26_) {
	if (i < 0 || i_26_ < 0 || i >= aByteArrayArrayArray5145[1].length
	    || i_26_ >= aByteArrayArrayArray5145[1][i].length)
	    return false;
	if ((aByteArrayArrayArray5145[1][i][i_26_] & 0x2) != 0)
	    return true;
	return false;
    }
    
    public boolean method7619(int i, int i_27_) {
	if (i < 0 || i_27_ < 0 || i >= aByteArrayArrayArray5145[1].length
	    || i_27_ >= aByteArrayArrayArray5145[1][i].length)
	    return false;
	if ((aByteArrayArrayArray5145[1][i][i_27_] & 0x2) != 0)
	    return true;
	return false;
    }
    
    int method7620(int i, int i_28_, int i_29_) {
	if ((aByteArrayArrayArray5145[i][i_28_][i_29_] & 0x8) != 0)
	    return 0;
	if (i > 0 && 0 != (aByteArrayArrayArray5145[1][i_28_][i_29_] & 0x2))
	    return i - 1;
	return i;
    }
    
    int method7621(int i, int i_30_, int i_31_) {
	if ((aByteArrayArrayArray5145[i][i_30_][i_31_] & 0x8) != 0)
	    return 0;
	if (i > 0 && 0 != (aByteArrayArrayArray5145[1][i_30_][i_31_] & 0x2))
	    return i - 1;
	return i;
    }
    
    public static void method7622(String string, boolean bool,
				  boolean bool_32_, int i) {
	Class403.method6611(string, bool, "openjs", bool_32_, -908420807);
    }
    
    static void method7623(byte i) {
	synchronized (Class642.aQueue8347) {
	    Point point;
	    if (Class464.aCanvas5111.isShowing())
		point = Class464.aCanvas5111.getLocationOnScreen();
	    else
		point = null;
	    for (;;) {
		Class534_Sub42_Sub1 class534_sub42_sub1
		    = (Class534_Sub42_Sub1) Class642.aQueue8347.poll();
		if (null == class534_sub42_sub1)
		    break;
		if (null == point || !Class464.aCanvas5111.isShowing()
		    || !Class534_Sub36.aBool10800)
		    class534_sub42_sub1.method16803((byte) -84);
		else {
		    class534_sub42_sub1.method18409(point, 796825704);
		    if (!class534_sub42_sub1.method18413(1297218654)
			&& (class534_sub42_sub1.method16799((byte) 70)
			    < Class706_Sub4.anInt10994 * 1771907305)
			&& (class534_sub42_sub1.method16800(-269489173)
			    < -1091172141 * Class18.anInt205)
			&& class534_sub42_sub1.method16799((byte) 104) >= 0
			&& class534_sub42_sub1.method16800(-565719975) >= 0) {
			int i_33_ = class534_sub42_sub1.method16798((byte) 77);
			if (class534_sub42_sub1.method16798((byte) 87) == -1)
			    Class642.aClass656_Sub1_8346
				.method10869(class534_sub42_sub1, -1607607997);
			else if (Class49.method1153(i_33_, -158677905))
			    Class642.aClass656_Sub1_8346
				.method17040(class534_sub42_sub1, (byte) 1);
		    }
		}
	    }
	}
    }
    
    public static void method7624(int[] is, int[] is_34_, int i, int i_35_,
				  int i_36_) {
	if (i < i_35_) {
	    int i_37_ = (i_35_ + i) / 2;
	    int i_38_ = i;
	    int i_39_ = is[i_37_];
	    is[i_37_] = is[i_35_];
	    is[i_35_] = i_39_;
	    int i_40_ = is_34_[i_37_];
	    is_34_[i_37_] = is_34_[i_35_];
	    is_34_[i_35_] = i_40_;
	    int i_41_ = 2147483647 == i_39_ ? 0 : 1;
	    for (int i_42_ = i; i_42_ < i_35_; i_42_++) {
		if (is[i_42_] < (i_42_ & i_41_) + i_39_) {
		    int i_43_ = is[i_42_];
		    is[i_42_] = is[i_38_];
		    is[i_38_] = i_43_;
		    int i_44_ = is_34_[i_42_];
		    is_34_[i_42_] = is_34_[i_38_];
		    is_34_[i_38_++] = i_44_;
		}
	    }
	    is[i_35_] = is[i_38_];
	    is[i_38_] = i_39_;
	    is_34_[i_35_] = is_34_[i_38_];
	    is_34_[i_38_] = i_40_;
	    method7624(is, is_34_, i, i_38_ - 1, -261353559);
	    method7624(is, is_34_, 1 + i_38_, i_35_, -138457315);
	}
    }
    
    static final void method7625(Class669 class669, int i) {
	/* empty */
    }
    
    static final void method7626(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    static final void method7627(byte i) {
	Class534_Sub40_Sub1 class534_sub40_sub1
	    = client.aClass100_11264.aClass534_Sub40_Sub1_1179;
	for (int i_45_ = 0; i_45_ < 1422306081 * client.anInt11089; i_45_++) {
	    int i_46_ = client.anIntArray11298[i_45_];
	    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		= ((Class654_Sub1_Sub5_Sub1_Sub1)
		   (((Class534_Sub6)
		     client.aClass9_11331.method579((long) i_46_))
		    .anObject10417));
	    class534_sub40_sub1.method16529((byte) 1);
	    int i_47_ = class534_sub40_sub1.method16527(-738359464);
	    if ((i_47_ & 0x8) != 0)
		i_47_ += class534_sub40_sub1.method16527(1728100035) << 8;
	    if ((i_47_ & 0x800) != 0)
		i_47_ += class534_sub40_sub1.method16527(507328176) << 16;
	    if (0 != (i_47_ & 0x20000))
		i_47_ += class534_sub40_sub1.method16527(1421852425) << 24;
	    if ((i_47_ & 0x80) != 0)
		class654_sub1_sub5_sub1_sub1.method18849
		    (class534_sub40_sub1.method16541((byte) -9), 0, 0,
		     1081939);
	    if (0 != (i_47_ & 0x80000)) {
		class534_sub40_sub1.anInt10811 += 1520029430;
		int i_48_ = ((class534_sub40_sub1.aByteArray10810
			      [((class534_sub40_sub1.anInt10811 += -1387468933)
				* 31645619) - 1])
			     & 0xff);
		for (int i_49_ = 0; i_49_ < i_48_; i_49_++) {
		    int i_50_ = class534_sub40_sub1.method16527(-936135735);
		    Class483 class483
			= ((Class483)
			   Class448.method7319(Class483.method7942(-88965010),
					       i_50_, 2088438307));
		    Class429 class429
			= (Class535.aClass110_Sub1_Sub2_7162.method14492
			   (class534_sub40_sub1, class483, -2072771757));
		    class654_sub1_sub5_sub1_sub1.anInterface4_11987.method29
			(class429.anInt4820 * -608978823,
			 class429.anObject4819, (short) -31103);
		}
	    }
	    if ((i_47_ & 0x100) != 0) {
		class654_sub1_sub5_sub1_sub1.anInt11943
		    = class534_sub40_sub1.method16567((byte) 2) * -1191215595;
		class654_sub1_sub5_sub1_sub1.anInt11945
		    = class534_sub40_sub1.method16565(563952963) * 668624251;
		class654_sub1_sub5_sub1_sub1.anInt11951
		    = class534_sub40_sub1.method16566(1199159719) * 97139519;
		class654_sub1_sub5_sub1_sub1.anInt11976
		    = class534_sub40_sub1.method16586((byte) 1) * 554036703;
		class654_sub1_sub5_sub1_sub1.anInt11954
		    = class534_sub40_sub1.method16566(1199159719) * 16838697;
		class654_sub1_sub5_sub1_sub1.anInt11955
		    = (class534_sub40_sub1.method16565(1432894382)
		       * -2088816671);
		class654_sub1_sub5_sub1_sub1.anInt11956
		    = (class534_sub40_sub1.method16573(-1982766353)
		       + client.anInt11101) * 395292927;
		class654_sub1_sub5_sub1_sub1.anInt11957
		    = (class534_sub40_sub1.method16572((byte) 98)
		       + client.anInt11101) * 1497408113;
		class654_sub1_sub5_sub1_sub1.anInt11958
		    = class534_sub40_sub1.method16572((byte) 119) * -914359499;
		class654_sub1_sub5_sub1_sub1.anInt11980 = 990207207;
		class654_sub1_sub5_sub1_sub1.anInt11937 = 0;
		class654_sub1_sub5_sub1_sub1.anInt11943
		    += (-1191215595
			* class654_sub1_sub5_sub1_sub1.anIntArray11977[0]);
		class654_sub1_sub5_sub1_sub1.anInt11945
		    += (668624251
			* class654_sub1_sub5_sub1_sub1.anIntArray11978[0]);
		class654_sub1_sub5_sub1_sub1.anInt11951
		    += (97139519
			* class654_sub1_sub5_sub1_sub1.anIntArray11977[0]);
		class654_sub1_sub5_sub1_sub1.anInt11976
		    += (554036703
			* class654_sub1_sub5_sub1_sub1.anIntArray11978[0]);
		class654_sub1_sub5_sub1_sub1.anInt11954
		    += class654_sub1_sub5_sub1_sub1.aByte10854 * 16838697;
		class654_sub1_sub5_sub1_sub1.anInt11955
		    += -2088816671 * class654_sub1_sub5_sub1_sub1.aByte10854;
	    }
	    if (0 != (i_47_ & 0x40)) {
		class654_sub1_sub5_sub1_sub1.anInt12193
		    = class534_sub40_sub1.method16572((byte) 125) * -433401485;
		class654_sub1_sub5_sub1_sub1.anInt12194
		    = class534_sub40_sub1.method16529((byte) 1) * 140700719;
	    }
	    if ((i_47_ & 0x10) != 0) {
		int i_51_ = class534_sub40_sub1.method16745(-891094135);
		if (i_51_ > 0) {
		    for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
			int i_53_ = -1;
			int i_54_ = -1;
			int i_55_ = -1;
			int i_56_
			    = class534_sub40_sub1.method16546(-1706829710);
			if (32767 == i_56_) {
			    i_56_
				= class534_sub40_sub1.method16546(-1706829710);
			    i_54_
				= class534_sub40_sub1.method16546(-1706829710);
			    i_53_
				= class534_sub40_sub1.method16546(-1706829710);
			    i_55_
				= class534_sub40_sub1.method16546(-1706829710);
			} else if (32766 != i_56_)
			    i_54_
				= class534_sub40_sub1.method16546(-1706829710);
			else {
			    i_56_ = -1;
			    i_54_ = class534_sub40_sub1.method16527(394237106);
			}
			int i_57_
			    = class534_sub40_sub1.method16546(-1706829710);
			class654_sub1_sub5_sub1_sub1.method18565(i_56_, i_54_,
								 i_53_, i_55_,
								 (client
								  .anInt11101),
								 i_57_,
								 441360029);
		    }
		}
		int i_58_ = class534_sub40_sub1.method16745(-891094135);
		if (i_58_ > 0) {
		    for (int i_59_ = 0; i_59_ < i_58_; i_59_++) {
			int i_60_
			    = class534_sub40_sub1.method16546(-1706829710);
			int i_61_
			    = class534_sub40_sub1.method16546(-1706829710);
			if (i_61_ != 32767) {
			    int i_62_
				= class534_sub40_sub1.method16546(-1706829710);
			    int i_63_
				= class534_sub40_sub1.method16563((byte) -110);
			    int i_64_ = (i_61_ > 0
					 ? class534_sub40_sub1
					       .method16527(1039937188)
					 : i_63_);
			    class654_sub1_sub5_sub1_sub1.method18532
				(i_60_, client.anInt11101, i_61_, i_62_, i_63_,
				 i_64_, 1846476627);
			} else
			    class654_sub1_sub5_sub1_sub1
				.method18533(i_60_, -2079832935);
		    }
		}
	    }
	    if (0 != (i_47_ & 0x1000)) {
		int i_65_ = (class654_sub1_sub5_sub1_sub1.aClass307_12204
			     .anIntArray3282).length;
		int i_66_ = 0;
		if ((class654_sub1_sub5_sub1_sub1.aClass307_12204
		     .aShortArray3287)
		    != null)
		    i_66_ = (class654_sub1_sub5_sub1_sub1.aClass307_12204
			     .aShortArray3287).length;
		int i_67_ = 0;
		if (null != (class654_sub1_sub5_sub1_sub1.aClass307_12204
			     .aShortArray3290))
		    i_67_ = (class654_sub1_sub5_sub1_sub1.aClass307_12204
			     .aShortArray3290).length;
		int i_68_ = class534_sub40_sub1.method16563((byte) -49);
		if (1 == (i_68_ & 0x1))
		    class654_sub1_sub5_sub1_sub1.aClass301_12195 = null;
		else {
		    class534_sub40_sub1.anInt10811 += 1520029430;
		    int[] is = null;
		    float[] fs = null;
		    int[][] is_69_ = null;
		    int[][] is_70_ = null;
		    if ((i_68_ & 0x2) == 2) {
			is = new int[i_65_];
			if (16 == (i_68_ & 0x10)) {
			    fs = new float[i_65_];
			    is_69_ = new int[i_65_][3];
			    is_70_ = new int[i_65_][3];
			}
			for (int i_71_ = 0; i_71_ < i_65_; i_71_++) {
			    is[i_71_]
				= class534_sub40_sub1.method16550((byte) 17);
			    if (16 == (i_68_ & 0x10) && -1 != is[i_71_]) {
				fs[i_71_] = class534_sub40_sub1
						.method16539(-1569623324);
				for (int i_72_ = 0; i_72_ < 3; i_72_++)
				    is_69_[i_71_][i_72_]
					= class534_sub40_sub1
					      .method16530((byte) -20);
				for (int i_73_ = 0; i_73_ < 3; i_73_++)
				    is_70_[i_71_][i_73_]
					= class534_sub40_sub1
					      .method16602((byte) -61);
			    }
			}
		    }
		    short[] is_74_ = null;
		    if (4 == (i_68_ & 0x4)) {
			is_74_ = new short[i_66_];
			for (int i_75_ = 0; i_75_ < i_66_; i_75_++)
			    is_74_[i_75_]
				= (short) class534_sub40_sub1
					      .method16573(-1982766353);
		    }
		    short[] is_76_ = null;
		    if ((i_68_ & 0x8) == 8) {
			is_76_ = new short[i_67_];
			for (int i_77_ = 0; i_77_ < i_67_; i_77_++)
			    is_76_[i_77_]
				= (short) class534_sub40_sub1
					      .method16573(-1982766353);
		    }
		    long l = (long) ((Class654_Sub1_Sub5_Sub1_Sub1.anInt12196
				      += 1863082793) * -1602557671
				     - 1);
		    class654_sub1_sub5_sub1_sub1.aClass301_12195
			= new Class301(l, is, fs, is_69_, is_70_, is_74_,
				       is_76_);
		}
	    }
	    if (0 != (i_47_ & 0x2)) {
		class654_sub1_sub5_sub1_sub1.anInt11944
		    = class534_sub40_sub1.method16573(-1982766353) * 776069067;
		if (class654_sub1_sub5_sub1_sub1.anInt11944 * 1409535459
		    == 65535)
		    class654_sub1_sub5_sub1_sub1.anInt11944 = -776069067;
	    }
	    if (0 != (i_47_ & 0x8000)) {
		int i_78_ = class534_sub40_sub1.method16745(-891094135);
		int[] is = new int[i_78_];
		int[] is_79_ = new int[i_78_];
		for (int i_80_ = 0; i_80_ < i_78_; i_80_++) {
		    int i_81_ = class534_sub40_sub1.method16572((byte) 114);
		    if ((i_81_ & 0xc000) == 49152) {
			int i_82_
			    = class534_sub40_sub1.method16573(-1982766353);
			is[i_80_] = i_81_ << 16 | i_82_;
		    } else
			is[i_80_] = i_81_;
		    is_79_[i_80_] = class534_sub40_sub1.method16529((byte) 1);
		}
		class654_sub1_sub5_sub1_sub1.method18557(is, is_79_,
							 (byte) 107);
	    }
	    if (0 != (i_47_ & 0x1)) {
		int[] is = new int[4];
		for (int i_83_ = 0; i_83_ < 4; i_83_++)
		    is[i_83_] = class534_sub40_sub1.method16550((byte) -12);
		int i_84_ = class534_sub40_sub1.method16563((byte) -46);
		Class200_Sub6.method15575(class654_sub1_sub5_sub1_sub1, is,
					  i_84_, true, (byte) -123);
	    }
	    if ((i_47_ & 0x200) != 0) {
		int i_85_ = class534_sub40_sub1.method16563((byte) -10);
		int[] is = new int[i_85_];
		int[] is_86_ = new int[i_85_];
		int[] is_87_ = new int[i_85_];
		for (int i_88_ = 0; i_88_ < i_85_; i_88_++) {
		    int i_89_ = class534_sub40_sub1.method16550((byte) -4);
		    is[i_88_] = i_89_;
		    is_86_[i_88_]
			= class534_sub40_sub1.method16563((byte) -47);
		    is_87_[i_88_] = class534_sub40_sub1.method16572((byte) 32);
		}
		Class640.method10598(class654_sub1_sub5_sub1_sub1, is, is_86_,
				     is_87_, (byte) -49);
	    }
	    if (0 != (i_47_ & 0x200000)) {
		class654_sub1_sub5_sub1_sub1.anInterface4_11987
		    .method33(-906602116);
		class534_sub40_sub1.anInt10811 += 1520029430;
		int i_90_ = ((class534_sub40_sub1.aByteArray10810
			      [((class534_sub40_sub1.anInt10811 += -1387468933)
				* 31645619) - 1])
			     & 0xff);
		for (int i_91_ = 0; i_91_ < i_90_; i_91_++) {
		    int i_92_ = class534_sub40_sub1.method16745(-891094135);
		    Class483 class483
			= ((Class483)
			   Class448.method7319(Class483.method7942(-88965010),
					       i_92_, 2088438307));
		    Class429 class429
			= (Class535.aClass110_Sub1_Sub2_7162.method14492
			   (class534_sub40_sub1, class483, -1761139026));
		    class654_sub1_sub5_sub1_sub1.anInterface4_11987.method29
			(-608978823 * class429.anInt4820,
			 class429.anObject4819, (short) -15561);
		}
	    }
	    if ((i_47_ & 0x20) != 0) {
		int i_93_ = class534_sub40_sub1.method16572((byte) 37);
		int i_94_ = class534_sub40_sub1.method16581(1649842718);
		if (65535 == i_93_)
		    i_93_ = -1;
		int i_95_ = class534_sub40_sub1.method16643(-2116058562);
		int i_96_ = i_95_ & 0x7;
		int i_97_ = i_95_ >> 3 & 0xf;
		if (i_97_ == 15)
		    i_97_ = -1;
		boolean bool = 1 == (i_95_ >> 7 & 0x1);
		class654_sub1_sub5_sub1_sub1.method18540(i_93_, i_94_, i_96_,
							 i_97_, bool, 0,
							 (byte) 0);
	    }
	    if ((i_47_ & 0x1000000) != 0) {
		class654_sub1_sub5_sub1_sub1.aByte11928
		    = class534_sub40_sub1.method16565(-1974247364);
		class654_sub1_sub5_sub1_sub1.aByte11962
		    = class534_sub40_sub1.method16586((byte) 1);
		class654_sub1_sub5_sub1_sub1.aByte11963
		    = class534_sub40_sub1.method16586((byte) 1);
		class654_sub1_sub5_sub1_sub1.aByte11964
		    = (byte) class534_sub40_sub1.method16643(-2095656834);
		class654_sub1_sub5_sub1_sub1.anInt11959
		    = ((client.anInt11101
			+ class534_sub40_sub1.method16573(-1982766353))
		       * 1446706933);
		class654_sub1_sub5_sub1_sub1.anInt11960
		    = ((client.anInt11101
			+ class534_sub40_sub1.method16529((byte) 1))
		       * -1565168329);
	    }
	    if (0 != (i_47_ & 0x20000000))
		class654_sub1_sub5_sub1_sub1.aBool11936
		    = class534_sub40_sub1.method16563((byte) -71) == 1;
	    if ((i_47_ & 0x4000000) != 0) {
		int i_98_ = class534_sub40_sub1.method16529((byte) 1);
		int i_99_ = class534_sub40_sub1.method16582(1522423460);
		if (i_98_ == 65535)
		    i_98_ = -1;
		int i_100_ = class534_sub40_sub1.method16643(-2089803942);
		int i_101_ = i_100_ & 0x7;
		int i_102_ = i_100_ >> 3 & 0xf;
		if (i_102_ == 15)
		    i_102_ = -1;
		boolean bool = 1 == (i_100_ >> 7 & 0x1);
		class654_sub1_sub5_sub1_sub1.method18540(i_98_, i_99_, i_101_,
							 i_102_, bool, 4,
							 (byte) 0);
	    }
	    if ((i_47_ & 0x10000) != 0) {
		int i_103_ = ((class534_sub40_sub1.aByteArray10810
			       [(class534_sub40_sub1.anInt10811
				 += -1387468933) * 31645619 - 1])
			      & 0xff);
		for (int i_104_ = 0; i_104_ < i_103_; i_104_++) {
		    int i_105_ = class534_sub40_sub1.method16643(-2044568891);
		    int i_106_ = class534_sub40_sub1.method16533(-258848859);
		    int i_107_ = class534_sub40_sub1.method16576(1750479542);
		    class654_sub1_sub5_sub1_sub1.method18846(i_105_, i_106_,
							     i_107_, 31645619);
		}
	    }
	    if ((i_47_ & 0x400) != 0) {
		class654_sub1_sub5_sub1_sub1.anInt12205
		    = (class534_sub40_sub1.method16573(-1982766353)
		       * -523484721);
		if (1265837359 * class654_sub1_sub5_sub1_sub1.anInt12205
		    == 65535)
		    class654_sub1_sub5_sub1_sub1.anInt12205 = 523484721;
	    }
	    if ((i_47_ & 0x2000000) != 0) {
		int i_108_ = class534_sub40_sub1.method16529((byte) 1);
		int i_109_ = class534_sub40_sub1.method16533(-258848859);
		if (65535 == i_108_)
		    i_108_ = -1;
		int i_110_ = class534_sub40_sub1.method16643(-2111708123);
		int i_111_ = i_110_ & 0x7;
		int i_112_ = i_110_ >> 3 & 0xf;
		if (15 == i_112_)
		    i_112_ = -1;
		boolean bool = 1 == (i_110_ >> 7 & 0x1);
		class654_sub1_sub5_sub1_sub1.method18540(i_108_, i_109_,
							 i_111_, i_112_, bool,
							 2, (byte) 0);
	    }
	    if (0 != (i_47_ & 0x800000)) {
		int i_113_ = class534_sub40_sub1.method16527(1563753117);
		int[] is = new int[8];
		short[] is_114_ = new short[8];
		for (int i_115_ = 0; i_115_ < 8; i_115_++) {
		    if (0 != (i_113_ & 1 << i_115_)) {
			is[i_115_]
			    = class534_sub40_sub1.method16550((byte) 50);
			is_114_[i_115_]
			    = (short) class534_sub40_sub1
					  .method16547(-1641213930);
		    } else {
			is[i_115_] = -1;
			is_114_[i_115_] = (short) -1;
		    }
		}
		class654_sub1_sub5_sub1_sub1.aClass295_12199
		    = new Class295(is, is_114_);
	    }
	    if (0 != (i_47_ & 0x100000)) {
		class654_sub1_sub5_sub1_sub1.aString12201
		    = class534_sub40_sub1.method16541((byte) -82);
		if ("".equals(class654_sub1_sub5_sub1_sub1.aString12201)
		    || (class654_sub1_sub5_sub1_sub1.aString12201.equals
			(class654_sub1_sub5_sub1_sub1.aClass307_12204
			 .aString3337)))
		    class654_sub1_sub5_sub1_sub1.aString12201
			= (class654_sub1_sub5_sub1_sub1.aClass307_12204
			   .aString3337);
	    }
	    if (0 != (i_47_ & 0x2000)) {
		int i_116_ = class534_sub40_sub1.method16572((byte) 123);
		int i_117_ = class534_sub40_sub1.method16582(1522423460);
		if (65535 == i_116_)
		    i_116_ = -1;
		int i_118_ = class534_sub40_sub1.method16527(-868924526);
		int i_119_ = i_118_ & 0x7;
		int i_120_ = i_118_ >> 3 & 0xf;
		if (i_120_ == 15)
		    i_120_ = -1;
		boolean bool = 1 == (i_118_ >> 7 & 0x1);
		class654_sub1_sub5_sub1_sub1.method18540(i_116_, i_117_,
							 i_119_, i_120_, bool,
							 1, (byte) 0);
	    }
	    if (0 != (i_47_ & 0x400000)) {
		class654_sub1_sub5_sub1_sub1.anInt12192
		    = (class534_sub40_sub1.method16571(-1693595762)
		       * -1105335343);
		if (65535
		    == 1691897137 * class654_sub1_sub5_sub1_sub1.anInt12192)
		    class654_sub1_sub5_sub1_sub1.anInt12192
			= -423106977 * (class654_sub1_sub5_sub1_sub1
					.aClass307_12204.anInt3301);
	    }
	    if ((i_47_ & 0x4) != 0) {
		if (class654_sub1_sub5_sub1_sub1.aClass307_12204
			.method5638(9633020))
		    Class694.method14069(class654_sub1_sub5_sub1_sub1,
					 -836779145);
		class654_sub1_sub5_sub1_sub1.method18828
		    ((Class307) (Class578.aClass44_Sub3_7743.method91
				 (class534_sub40_sub1.method16550((byte) -9),
				  -1626615499)),
		     (i_47_ & 0x100000) == 0, 0 == (i_47_ & 0x400000), true,
		     -1593730561);
		class654_sub1_sub5_sub1_sub1.method18535
		    (-1821838479 * (class654_sub1_sub5_sub1_sub1
				    .aClass307_12204.anInt3328),
		     1778318280);
		class654_sub1_sub5_sub1_sub1.anInt11971
		    = 1883849079 * ((class654_sub1_sub5_sub1_sub1
				     .aClass307_12204.anInt3312) * -1373680215
				    << 3);
		if (class654_sub1_sub5_sub1_sub1.aClass307_12204
			.method5638(2062340286))
		    Class449.method7330
			(class654_sub1_sub5_sub1_sub1.aByte10854,
			 class654_sub1_sub5_sub1_sub1.anIntArray11977[0],
			 class654_sub1_sub5_sub1_sub1.anIntArray11978[0], 0,
			 null, class654_sub1_sub5_sub1_sub1, null, 383817806);
	    }
	    if (0 != (i_47_ & 0x40000)) {
		int i_121_ = (class654_sub1_sub5_sub1_sub1.aClass307_12204
			      .anIntArray3283).length;
		int i_122_ = 0;
		if ((class654_sub1_sub5_sub1_sub1.aClass307_12204
		     .aShortArray3287)
		    != null)
		    i_122_ = (class654_sub1_sub5_sub1_sub1.aClass307_12204
			      .aShortArray3287).length;
		int i_123_ = 0;
		if (null != (class654_sub1_sub5_sub1_sub1.aClass307_12204
			     .aShortArray3290))
		    i_122_ = (class654_sub1_sub5_sub1_sub1.aClass307_12204
			      .aShortArray3290).length;
		int i_124_ = class534_sub40_sub1.method16527(-858316483);
		if (1 != (i_124_ & 0x1)) {
		    class534_sub40_sub1.anInt10811 += 1520029430;
		    int[] is = null;
		    if (2 == (i_124_ & 0x2)) {
			is = new int[i_121_];
			for (int i_125_ = 0; i_125_ < i_121_; i_125_++)
			    is[i_125_]
				= class534_sub40_sub1.method16550((byte) 27);
		    }
		    short[] is_126_ = null;
		    if (4 == (i_124_ & 0x4)) {
			is_126_ = new short[i_122_];
			for (int i_127_ = 0; i_127_ < i_122_; i_127_++)
			    is_126_[i_127_]
				= (short) class534_sub40_sub1
					      .method16572((byte) 99);
		    }
		    short[] is_128_ = null;
		    if ((i_124_ & 0x8) == 8) {
			is_128_ = new short[i_123_];
			for (int i_129_ = 0; i_129_ < i_123_; i_129_++)
			    is_128_[i_129_]
				= (short) class534_sub40_sub1
					      .method16529((byte) 1);
		    }
		    long l = (long) ((Class654_Sub1_Sub5_Sub1_Sub1.anInt12200
				      += 751626731) * -353962301
				     - 1);
		    new Class301(l, is, null, null, null, is_126_, is_128_);
		}
	    }
	    if (0 != (i_47_ & 0x10000000))
		class654_sub1_sub5_sub1_sub1.anInt12208
		    = class534_sub40_sub1.method16527(-710651140) * 1164120609;
	    if (0 != (i_47_ & 0x8000000)) {
		int i_130_ = class534_sub40_sub1.method16529((byte) 1);
		int i_131_ = class534_sub40_sub1.method16514((short) -32580);
		if (65535 == i_130_)
		    i_130_ = -1;
		int i_132_ = class534_sub40_sub1.method16527(-1781740823);
		int i_133_ = i_132_ & 0x7;
		int i_134_ = i_132_ >> 3 & 0xf;
		if (i_134_ == 15)
		    i_134_ = -1;
		boolean bool = 1 == (i_132_ >> 7 & 0x1);
		class654_sub1_sub5_sub1_sub1.method18540(i_130_, i_131_,
							 i_133_, i_134_, bool,
							 3, (byte) 0);
	    }
	}
    }
    
    static final String method7628(String string, String string_135_,
				   String string_136_, byte i) {
	for (int i_137_ = string.indexOf(string_135_); -1 != i_137_;
	     i_137_
		 = string.indexOf(string_135_, i_137_ + string_136_.length()))
	    string = new StringBuilder().append
			 (string.substring(0, i_137_)).append
			 (string_136_).append
			 (string.substring(i_137_ + string_135_.length()))
			 .toString();
	return string;
    }
}
