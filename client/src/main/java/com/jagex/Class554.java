/* Class554 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Class554
{
    static int[][] anIntArrayArray7346;
    static int[] anIntArray7347;
    protected static Class44_Sub13 aClass44_Sub13_7348;
    protected static Class44_Sub9 aClass44_Sub9_7349;
    static Interface14 anInterface14_7350;
    protected static Interface20 anInterface20_7351;
    protected static Interface18 anInterface18_7352;
    public static Class622 aClass622_7353;
    public static Class534_Sub18_Sub9 aClass534_Sub18_Sub9_7354;
    protected static boolean aBool7355;
    static int anInt7356;
    static short[] aShortArray7357;
    protected static int anInt7358;
    protected static int anInt7359;
    static int anInt7360;
    static int anInt7361;
    static int anInt7362;
    static int[] anIntArray7363;
    public static float aFloat7364;
    protected static Class472 aClass472_7365;
    protected static Class523 aClass523_7366;
    static Object[] anObjectArray7367;
    public static int anInt7368;
    public static int anInt7369;
    protected static int anInt7370;
    protected static int anInt7371;
    static Class9 aClass9_7372;
    static short[] aShortArray7373;
    static byte[] aByteArray7374;
    protected static Class203 aClass203_7375;
    static short[] aShortArray7376;
    static byte[] aByteArray7377;
    protected static int anInt7378;
    static byte[] aByteArray7379;
    protected static boolean aBool7380;
    protected static int anInt7381;
    static byte[] aByteArray7382;
    static int anInt7383;
    static final int anInt7384 = 64;
    static int anInt7385;
    static int anInt7386;
    static boolean[] aBoolArray7387;
    protected static byte[][][] aByteArrayArrayArray7388;
    static boolean[][] aBoolArrayArray7389;
    static int anInt7390;
    static HashMap[][][] aHashMapArrayArrayArray7391;
    protected static Class203 aClass203_7392;
    protected static Class203 aClass203_7393;
    protected static int anInt7394;
    static int anInt7395;
    static ArrayList anArrayList7396;
    static Class472 aClass472_7397;
    static int[] anIntArray7398;
    protected static int anInt7399;
    static int anInt7400;
    static Class534_Sub40 aClass534_Sub40_7401;
    static Class534_Sub40 aClass534_Sub40_7402;
    static int anInt7403;
    static int[] anIntArray7404;
    static int[] anIntArray7405;
    protected static int anInt7406;
    protected static int anInt7407;
    protected static int anInt7408;
    public static float aFloat7409;
    protected static int anInt7410;
    protected static int anInt7411;
    protected static int anInt7412;
    protected static Class700 aClass700_7413;
    static int anInt7414;
    static Interface14 anInterface14_7415 = null;
    protected static Class44_Sub18 aClass44_Sub18_7416;
    
    static void method9107(short[] is, byte[] is_0_, short[] is_1_, int i,
			   int i_2_) {
	int[] is_3_ = new int[anInt7371];
	int[] is_4_ = new int[anInt7371];
	int[] is_5_ = new int[anInt7371];
	int[] is_6_ = new int[anInt7371];
	int[] is_7_ = new int[anInt7371];
	for (int i_8_ = -5; i_8_ < anInt7370; i_8_++) {
	    int i_9_ = i_8_ + 5;
	    int i_10_ = i_8_ - 5;
	    for (int i_11_ = 0; i_11_ < anInt7371; i_11_++) {
		if (i_9_ < anInt7370) {
		    short i_12_ = is[i_9_ + i_11_ * anInt7370];
		    if (i_12_ > 0) {
			Class1 class1
			    = (Class1) anInterface14_7350.method91(i_12_ - 1,
								   39678083);
			is_3_[i_11_] += class1.anInt11 * 1782063805;
			is_4_[i_11_] += class1.anInt14 * 1312863965;
			is_5_[i_11_] += class1.anInt16 * 1484599057;
			is_6_[i_11_] += class1.anInt17 * -1721639561;
			is_7_[i_11_]++;
		    }
		}
		if (i_10_ >= 0) {
		    short i_13_ = is[i_10_ + i_11_ * anInt7370];
		    if (i_13_ > 0) {
			Class1 class1
			    = (Class1) anInterface14_7350.method91(i_13_ - 1,
								   -617332320);
			is_3_[i_11_] -= class1.anInt11 * 1782063805;
			is_4_[i_11_] -= class1.anInt14 * 1312863965;
			is_5_[i_11_] -= class1.anInt16 * 1484599057;
			is_6_[i_11_] -= class1.anInt17 * -1721639561;
			is_7_[i_11_]--;
		    }
		}
	    }
	    if (i_8_ >= 0) {
		int i_14_ = 0;
		int i_15_ = 0;
		int i_16_ = 0;
		int i_17_ = 0;
		int i_18_ = 0;
		for (int i_19_ = -5; i_19_ < anInt7371; i_19_++) {
		    int i_20_ = i_19_ + 5;
		    if (i_20_ < anInt7371) {
			i_14_ += is_3_[i_20_];
			i_15_ += is_4_[i_20_];
			i_16_ += is_5_[i_20_];
			i_17_ += is_6_[i_20_];
			i_18_ += is_7_[i_20_];
		    }
		    int i_21_ = i_19_ - 5;
		    if (i_21_ >= 0) {
			i_14_ -= is_3_[i_21_];
			i_15_ -= is_4_[i_21_];
			i_16_ -= is_5_[i_21_];
			i_17_ -= is_6_[i_21_];
			i_18_ -= is_7_[i_21_];
		    }
		    if (i_19_ >= 0 && i_18_ > 0) {
			if (is[i_8_ + i_19_ * anInt7370] == 0) {
			    int i_22_ = i_8_ + i_19_ * anInt7370;
			    is_0_[i_22_] = (byte) 0;
			    is_1_[i_22_] = (short) 0;
			} else {
			    int i_23_
				= (i_17_ == 0 ? 0
				   : Class200_Sub23.method15662((i_14_ * 256
								 / i_17_),
								i_15_ / i_18_,
								i_16_ / i_18_,
								(byte) 91));
			    int i_24_ = (i_23_ & 0x7f) + i_2_;
			    if (i_24_ < 0)
				i_24_ = 0;
			    else if (i_24_ > 127)
				i_24_ = 127;
			    int i_25_ = ((i_23_ + i & 0xfc00) + (i_23_ & 0x380)
					 + i_24_);
			    int i_26_ = i_8_ + i_19_ * anInt7370;
			    int i_27_ = (Class415.anIntArray4666
					 [(Class315.method5705
					   (Class68.method1387(i_25_, 96,
							       -594566673),
					    460586295)) & 0xffff]);
			    is_0_[i_26_] = (byte) (i_27_ >> 16 & 0xff);
			    is_1_[i_26_] = (short) (i_27_ & 0xffff);
			}
		    }
		}
	    }
	}
    }
    
    public static void method9108
	(Class472 class472, Class472 class472_28_, Class44_Sub16 class44_sub16,
	 Class44_Sub12 class44_sub12, Class44_Sub13 class44_sub13,
	 Class44_Sub9 class44_sub9, Class44_Sub18 class44_sub18,
	 Interface18 interface18, Interface20 interface20) {
	aClass472_7397 = class472;
	aClass472_7365 = class472_28_;
	anInterface14_7415 = class44_sub16;
	anInterface14_7350 = class44_sub12;
	aClass44_Sub13_7348 = class44_sub13;
	aClass44_Sub9_7349 = class44_sub9;
	aClass44_Sub18_7416 = class44_sub18;
	anInterface18_7352 = interface18;
	anInterface20_7351 = interface20;
	aClass9_7372.method578((byte) -22);
	int[] is
	    = aClass472_7397.method7678(Class650.aClass650_8460.method93(),
					(byte) 75);
	if (is != null) {
	    for (int i = 0; i < is.length; i++) {
		Class534_Sub18_Sub9 class534_sub18_sub9
		    = Class312_Sub1.method15646(aClass472_7397, is[i],
						-444676667);
		aClass9_7372.method581(class534_sub18_sub9,
				       (long) (class534_sub18_sub9.anInt11766
					       * 848546455));
	    }
	}
	Class456.method7426(true, false, 1739452007);
    }
    
    static void method9109() {
	aShortArray7373 = new short[anInt7370 * anInt7371];
	aShortArray7376 = new short[anInt7370 * anInt7371];
	aByteArray7377 = new byte[anInt7370 * anInt7371];
	anObjectArray7367 = new Object[anInt7370 * anInt7371];
	aByteArray7379 = new byte[anInt7370 * anInt7371];
	aHashMapArrayArrayArray7391
	    = new HashMap[3][anInt7370 >> 6][anInt7371 >> 6];
	anIntArray7347 = new int[anInterface14_7415.method90((byte) 23) + 1];
	aBoolArrayArray7389 = new boolean[anInt7370 / 8][anInt7371 / 8];
    }
    
    static void method9110(int[] is, int i, int i_29_, int i_30_, int i_31_,
			   int i_32_, int i_33_, int i_34_, boolean bool,
			   boolean bool_35_, boolean bool_36_,
			   boolean bool_37_) {
	for (int i_38_ = i; i_38_ <= i_29_; i_38_++) {
	    boolean bool_39_
		= bool_35_ ? (aBoolArray7387[anInt7385]
			      && i_29_ - i_38_ < (aClass622_7353.anInt8142
						  * -1804667875)) : false;
	    boolean bool_40_
		= (bool_37_
		   ? (aBoolArray7387[anInt7356]
		      && i_38_ - i < aClass622_7353.anInt8142 * -1804667875)
		   : false);
	    for (int i_41_ = i_30_; i_41_ <= i_31_; i_41_++) {
		if (bool_39_ || bool_40_)
		    is[(i_32_ - i_41_ - 1) * i_32_ + i_38_]
			= aClass622_7353.anInt8141 * 1156690091;
		else {
		    boolean bool_42_
			= bool ? (aBoolArray7387[anInt7383]
				  && i_31_ - i_41_ < (aClass622_7353.anInt8142
						      * -1804667875)) : false;
		    boolean bool_43_
			= (bool_36_
			   ? (aBoolArray7387[anInt7361]
			      && (i_41_ - i_30_
				  < aClass622_7353.anInt8142 * -1804667875))
			   : false);
		    if (bool_42_ || bool_43_)
			is[(i_32_ - i_41_ - 1) * i_32_ + i_38_]
			    = aClass622_7353.anInt8141 * 1156690091;
		    else {
			int i_44_ = is[(i_32_ - i_41_ - 1) * i_32_ + i_38_];
			if (i_44_ != anInt7414) {
			    anInt7414 = i_44_;
			    anInt7360
				= (~0xffffff
				   | ((((aClass622_7353.anInt8127 * -962787217
					 & 0xff00ff) * i_33_
					+ (i_44_ & 0xff00ff) * i_34_)
				       & ~0xff00ff)
				      + ((((aClass622_7353.anInt8127
					    * -962787217)
					   & 0xff00) * i_33_
					  + (i_44_ & 0xff00) * i_34_)
					 & 0xff0000)) >> 8);
			}
			is[(i_32_ - i_41_ - 1) * i_32_ + i_38_] = anInt7360;
		    }
		}
	    }
	}
    }
    
    static void method9111(int[] is, int i, int i_45_, int i_46_, int i_47_,
			   int i_48_, int i_49_, int i_50_, boolean bool,
			   boolean bool_51_, boolean bool_52_,
			   boolean bool_53_) {
	for (int i_54_ = i; i_54_ <= i_45_; i_54_++) {
	    boolean bool_55_
		= bool_51_ ? (aBoolArray7387[anInt7385]
			      && i_45_ - i_54_ < (aClass622_7353.anInt8142
						  * -1804667875)) : false;
	    boolean bool_56_
		= (bool_53_
		   ? (aBoolArray7387[anInt7356]
		      && i_54_ - i < aClass622_7353.anInt8142 * -1804667875)
		   : false);
	    for (int i_57_ = i_46_; i_57_ <= i_47_; i_57_++) {
		if (bool_55_ || bool_56_)
		    is[(i_48_ - i_57_ - 1) * i_48_ + i_54_]
			= aClass622_7353.anInt8141 * 1156690091;
		else {
		    boolean bool_58_
			= bool ? (aBoolArray7387[anInt7383]
				  && i_47_ - i_57_ < (aClass622_7353.anInt8142
						      * -1804667875)) : false;
		    boolean bool_59_
			= (bool_52_
			   ? (aBoolArray7387[anInt7361]
			      && (i_57_ - i_46_
				  < aClass622_7353.anInt8142 * -1804667875))
			   : false);
		    if (bool_58_ || bool_59_)
			is[(i_48_ - i_57_ - 1) * i_48_ + i_54_]
			    = aClass622_7353.anInt8141 * 1156690091;
		    else {
			int i_60_ = is[(i_48_ - i_57_ - 1) * i_48_ + i_54_];
			if (i_60_ != anInt7414) {
			    anInt7414 = i_60_;
			    anInt7360
				= (~0xffffff
				   | ((((aClass622_7353.anInt8127 * -962787217
					 & 0xff00ff) * i_49_
					+ (i_60_ & 0xff00ff) * i_50_)
				       & ~0xff00ff)
				      + ((((aClass622_7353.anInt8127
					    * -962787217)
					   & 0xff00) * i_49_
					  + (i_60_ & 0xff00) * i_50_)
					 & 0xff0000)) >> 8);
			}
			is[(i_48_ - i_57_ - 1) * i_48_ + i_54_] = anInt7360;
		    }
		}
	    }
	}
    }
    
    static int method9112() {
	return (int) (64.0F * aFloat7409 / 2.0F);
    }
    
    public static Class534_Sub18_Sub9 method9113(int i, int i_61_) {
	for (Class534_Sub18_Sub9 class534_sub18_sub9
		 = (Class534_Sub18_Sub9) aClass9_7372.method583(-2100698280);
	     class534_sub18_sub9 != null;
	     class534_sub18_sub9
		 = (Class534_Sub18_Sub9) aClass9_7372.method584((byte) -18)) {
	    if (class534_sub18_sub9.aBool11762
		&& class534_sub18_sub9.method18261(i, i_61_, -202607948))
		return class534_sub18_sub9;
	}
	return null;
    }
    
    public static Class534_Sub18_Sub9 method9114(int i) {
	return (Class534_Sub18_Sub9) aClass9_7372.method579((long) i);
    }
    
    public static Class696 method9115(int i, int i_62_) {
	Class696 class696 = new Class696();
	for (Class534_Sub18_Sub9 class534_sub18_sub9
		 = (Class534_Sub18_Sub9) aClass9_7372.method583(-2066815810);
	     class534_sub18_sub9 != null;
	     class534_sub18_sub9
		 = (Class534_Sub18_Sub9) aClass9_7372.method584((byte) -23)) {
	    if (class534_sub18_sub9.aBool11762
		&& class534_sub18_sub9.method18261(i, i_62_, 1534840480))
		class696.method14076(class534_sub18_sub9, (byte) 8);
	}
	return class696;
    }
    
    static void method9116(Class177 class177, int i, int i_63_) {
	for (int i_64_ = 0; i_64_ < anInterface14_7415.method90((byte) 34);
	     i_64_++)
	    anIntArray7347[i_64_ + 1] = method9171(class177, i_64_, i, i_63_);
    }
    
    static void method9117() {
	aShortArray7373 = null;
	aByteArray7374 = null;
	aShortArray7357 = null;
	aShortArray7376 = null;
	aByteArray7377 = null;
	anObjectArray7367 = null;
	aByteArray7379 = null;
	aHashMapArrayArrayArray7391 = null;
	anIntArray7347 = null;
	aBoolArrayArray7389 = null;
    }
    
    static void method9118(int i) {
	Class534_Sub18_Sub9 class534_sub18_sub9
	    = (Class534_Sub18_Sub9) aClass9_7372.method579((long) i);
	if (class534_sub18_sub9 != null
	    && class534_sub18_sub9 != aClass534_Sub18_Sub9_7354) {
	    aClass534_Sub18_Sub9_7354 = class534_sub18_sub9;
	    aBool7380 = (aClass534_Sub18_Sub9_7354.anInt11766 * 848546455
			 == aClass622_7353.anInt8138 * -359981155);
	}
    }
    
    static boolean method9119(Class185 class185, int i, int i_65_,
			      boolean bool) {
	long l = Class250.method4604((byte) -83);
	if (anInt7399 == 0) {
	    if (aClass534_Sub18_Sub9_7354.anInt11766 * 848546455
		== aClass622_7353.anInt8133 * -1604882349) {
		int i_66_
		    = aClass472_7365.method7683((aClass534_Sub18_Sub9_7354
						 .aString11765),
						(byte) 1);
		if (aClass534_Sub40_7402 == null)
		    aClass534_Sub40_7402
			= (new Class534_Sub40
			   (aClass472_7365.method7743(i_66_, 0, -2137666501)));
		aClass534_Sub40_7401 = aClass534_Sub40_7402;
		aClass534_Sub40_7401.anInt10811 = 0;
	    } else {
		int i_67_
		    = aClass472_7365.method7683((aClass534_Sub18_Sub9_7354
						 .aString11765),
						(byte) 1);
		aClass534_Sub40_7401
		    = (new Class534_Sub40
		       (aClass472_7365.method7743(i_67_, 0, -1718192597)));
	    }
	    int i_68_ = aClass534_Sub40_7401.method16527(-823742037);
	    anIntArray7404 = new int[i_68_];
	    for (int i_69_ = 0; i_69_ < i_68_; i_69_++)
		anIntArray7404[i_69_]
		    = aClass534_Sub40_7401.method16546(-1706829710);
	    int i_70_ = aClass534_Sub40_7401.method16527(344799451);
	    anIntArray7405 = new int[i_70_];
	    for (int i_71_ = 0; i_71_ < i_70_; i_71_++)
		anIntArray7405[i_71_]
		    = aClass534_Sub40_7401.method16546(-1706829710);
	}
	while (aClass534_Sub40_7401 != null
	       && (aClass534_Sub40_7401.anInt10811 * 31645619
		   < aClass534_Sub40_7401.aByteArray10810.length)
	       && (!bool || (Class250.method4604((byte) -46)
			     < l + (long) anInt7400))) {
	    if (aClass534_Sub40_7401.method16527(-903100750) == 0) {
		int i_72_ = aClass534_Sub40_7401.method16527(-718743911);
		int i_73_ = aClass534_Sub40_7401.method16527(17684212);
		for (int i_74_ = 0; i_74_ < 8; i_74_++) {
		    int i_75_ = aClass534_Sub40_7401.method16527(-1380601767);
		    int i_76_ = i_72_ * 8 + i_74_ - anInt7368 / 8;
		    for (int i_77_ = 0; i_77_ < 8; i_77_++) {
			int i_78_ = i_73_ * 8 + i_77_ - anInt7369 / 8;
			aBoolArrayArray7389[i_76_][i_78_]
			    = (i_75_ & 1 << i_77_) != 0;
		    }
		}
		for (int i_79_ = 0; i_79_ < 64; i_79_++) {
		    for (int i_80_ = 0; i_80_ < 64; i_80_++) {
			int i_81_ = i_72_ * 64 + i_79_ - anInt7368;
			int i_82_ = i_73_ * 64 + i_80_ - anInt7369;
			method9120(class185, aClass534_Sub40_7401, i_72_,
				   i_73_, i_81_, i_82_, anIntArray7404,
				   anIntArray7405);
		    }
		}
	    } else {
		int i_83_ = aClass534_Sub40_7401.method16527(-2133167936);
		int i_84_ = aClass534_Sub40_7401.method16527(1016085953);
		int i_85_ = aClass534_Sub40_7401.method16527(-1218890229);
		int i_86_ = aClass534_Sub40_7401.method16527(-657754327);
		aBoolArrayArray7389[i_83_ * 8 + i_85_ - anInt7368 / 8]
		    [i_84_ * 8 + i_86_ - anInt7369 / 8]
		    = aClass534_Sub40_7401.method16527(-619490881) != 0;
		for (int i_87_ = 0; i_87_ < 8; i_87_++) {
		    for (int i_88_ = 0; i_88_ < 8; i_88_++) {
			int i_89_ = i_83_ * 64 + i_85_ * 8 + i_87_ - anInt7368;
			int i_90_ = i_84_ * 64 + i_86_ * 8 + i_88_ - anInt7369;
			method9120(class185, aClass534_Sub40_7401, i_83_,
				   i_84_, i_89_, i_90_, anIntArray7404,
				   anIntArray7405);
		    }
		}
	    }
	}
	if (aClass534_Sub40_7401 != null) {
	    anInt7399 = aClass534_Sub40_7401.anInt10811 * 31645619;
	    if (aClass534_Sub40_7401.anInt10811 * 31645619
		< aClass534_Sub40_7401.aByteArray10810.length)
		return false;
	}
	aClass534_Sub40_7401 = null;
	anIntArray7405 = null;
	anIntArray7404 = null;
	if (aShortArray7373 != null) {
	    aByteArray7374 = new byte[anInt7370 * anInt7371];
	    aShortArray7357 = new short[anInt7370 * anInt7371];
	    for (int i_91_ = 0; i_91_ < 3; i_91_++) {
		short[] is = new short[anInt7370 * anInt7371];
		for (int i_92_ = 0;
		     i_92_ < aHashMapArrayArrayArray7391[i_91_].length;
		     i_92_++) {
		    for (int i_93_ = 0;
			 i_93_ < aHashMapArrayArrayArray7391[i_91_][0].length;
			 i_93_++) {
			HashMap hashmap
			    = aHashMapArrayArrayArray7391[i_91_][i_92_][i_93_];
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class541 class541 = (Class541) iterator.next();
				is[(i_92_ * 64 + class541.aByte7177
				    + ((i_93_ * 64 + class541.aByte7176)
				       * anInt7370))]
				    = (short) class541.anInt7179;
			    }
			}
		    }
		}
		method9107(is, aByteArray7374, aShortArray7357, i, i_65_);
		for (int i_94_ = 0;
		     i_94_ < aHashMapArrayArrayArray7391[i_91_].length;
		     i_94_++) {
		    for (int i_95_ = 0;
			 i_95_ < aHashMapArrayArrayArray7391[i_91_][0].length;
			 i_95_++) {
			HashMap hashmap
			    = aHashMapArrayArrayArray7391[i_91_][i_94_][i_95_];
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class541 class541 = (Class541) iterator.next();
				int i_96_
				    = (i_94_ * 64 + class541.aByte7177
				       + ((i_95_ * 64 + class541.aByte7176)
					  * anInt7370));
				class541.anInt7179
				    = ((aByteArray7374[i_96_] & 0xff) << 16
				       | aShortArray7357[i_96_] & 0xffff);
				if (class541.anInt7179 != 0)
				    class541.anInt7179 |= ~0xffffff;
			    }
			}
		    }
		}
	    }
	    method9107(aShortArray7373, aByteArray7374, aShortArray7357, i,
		       i_65_);
	    aShortArray7373 = null;
	}
	if (!bool || Class250.method4604((byte) -16) < l + (long) anInt7400) {
	    method9121();
	    return true;
	}
	return false;
    }
    
    static void method9120(Class185 class185, Class534_Sub40 class534_sub40,
			   int i, int i_97_, int i_98_, int i_99_, int[] is,
			   int[] is_100_) {
	int i_101_ = class534_sub40.method16527(1611993951);
	if ((i_101_ & 0x1) == 0) {
	    boolean bool = (i_101_ & 0x2) == 0;
	    int i_102_ = i_101_ >> 2 & 0x3f;
	    if (i_102_ != 62) {
		if (i_102_ == 63)
		    i_102_ = class534_sub40.method16546(-1706829710);
		else if (bool)
		    i_102_ = is[i_102_];
		else
		    i_102_ = is_100_[i_102_];
		if (bool) {
		    aShortArray7373[i_98_ + i_99_ * anInt7370]
			= (short) i_102_;
		    aShortArray7376[i_98_ + i_99_ * anInt7370] = (short) 0;
		} else {
		    aShortArray7376[i_98_ + i_99_ * anInt7370]
			= (short) i_102_;
		    aByteArray7377[i_98_ + i_99_ * anInt7370] = (byte) 0;
		    aShortArray7373[i_98_ + i_99_ * anInt7370]
			= (short) class534_sub40.method16546(-1706829710);
		}
	    }
	} else {
	    int i_103_ = (i_101_ >> 1 & 0x3) + 1;
	    boolean bool = (i_101_ & 0x8) != 0;
	    boolean bool_104_ = (i_101_ & 0x10) != 0;
	    for (int i_105_ = 0; i_105_ < i_103_; i_105_++) {
		int i_106_ = class534_sub40.method16546(-1706829710);
		int i_107_ = 0;
		int i_108_ = 0;
		if (bool) {
		    i_107_ = class534_sub40.method16546(-1706829710);
		    i_108_ = class534_sub40.method16527(-1235553784);
		}
		int i_109_ = 0;
		if (bool_104_)
		    i_109_ = class534_sub40.method16527(-443690364);
		if (i_105_ == 0) {
		    aShortArray7373[i_98_ + i_99_ * anInt7370]
			= (short) i_106_;
		    aShortArray7376[i_98_ + i_99_ * anInt7370]
			= (short) i_107_;
		    aByteArray7377[i_98_ + i_99_ * anInt7370] = (byte) i_108_;
		    if (i_109_ == 1) {
			anObjectArray7367[i_98_ + i_99_ * anInt7370]
			    = new Integer(class534_sub40
					      .method16550((byte) 72));
			aByteArray7379[i_98_ + i_99_ * anInt7370]
			    = class534_sub40.method16586((byte) 1);
		    } else if (i_109_ > 1) {
			int[] is_110_ = new int[i_109_];
			byte[] is_111_ = new byte[i_109_];
			for (int i_112_ = 0; i_112_ < i_109_; i_112_++) {
			    is_110_[i_112_]
				= class534_sub40.method16550((byte) -12);
			    is_111_[i_112_]
				= class534_sub40.method16586((byte) 1);
			}
			anObjectArray7367[i_98_ + i_99_ * anInt7370]
			    = new Class534_Sub38(is_110_, is_111_);
		    }
		} else {
		    int[] is_113_ = null;
		    byte[] is_114_ = null;
		    if (i_109_ > 0) {
			is_113_ = new int[i_109_];
			is_114_ = new byte[i_109_];
			for (int i_115_ = 0; i_115_ < i_109_; i_115_++) {
			    is_113_[i_115_]
				= class534_sub40.method16550((byte) 13);
			    is_114_[i_115_]
				= class534_sub40.method16586((byte) 1);
			}
		    }
		    if ((aHashMapArrayArrayArray7391[i_105_ - 1]
			 [i - (anInt7368 >> 6)][i_97_ - (anInt7369 >> 6)])
			== null)
			aHashMapArrayArrayArray7391[i_105_ - 1]
			    [i - (anInt7368 >> 6)][i_97_ - (anInt7369 >> 6)]
			    = new HashMap();
		    int i_116_ = ((i_98_ & 0x3f) << 8) + (i_99_ & 0x3f);
		    Class541 class541
			= new Class541(i_98_ & 0x3f, i_99_ & 0x3f, i_106_,
				       i_107_, i_108_, is_113_, is_114_);
		    aHashMapArrayArrayArray7391[i_105_ - 1]
			[i - (anInt7368 >> 6)][i_97_ - (anInt7369 >> 6)]
			.put(Integer.valueOf(i_116_), class541);
		}
	    }
	}
    }
    
    static void method9121() {
	for (int i = 0; i < anInt7370; i++) {
	    for (int i_117_ = 0; i_117_ < anInt7371; i_117_++) {
		Object object = anObjectArray7367[i + i_117_ * anInt7370];
		if (object != null) {
		    if (object instanceof Class534_Sub38) {
			Class534_Sub38 class534_sub38
			    = (Class534_Sub38) object;
			if (class534_sub38 != null) {
			    for (int i_118_ = 0;
				 (i_118_
				  < class534_sub38.anIntArray10806.length);
				 i_118_++) {
				Class602 class602
				    = (Class602) (aClass44_Sub13_7348.method91
						  ((class534_sub38
						    .anIntArray10806[i_118_]),
						   -1979786669));
				int i_119_ = class602.anInt7949 * 196422211;
				if (class602.anIntArray7943 != null) {
				    class602
					= (class602.method9988
					   (anInterface18_7352,
					    anInterface20_7351, 350750207));
				    if (class602 != null)
					i_119_
					    = class602.anInt7949 * 196422211;
				}
				if (i_119_ != -1) {
				    Class534_Sub29 class534_sub29
					= new Class534_Sub29(i_119_);
				    class534_sub29.anInt10655 = i * -833592845;
				    class534_sub29.anInt10653
					= i_117_ * -1714674331;
				    aClass700_7413.method14131(class534_sub29,
							       (short) 789);
				}
			    }
			}
		    } else {
			Integer integer = (Integer) object;
			Class602 class602
			    = ((Class602)
			       aClass44_Sub13_7348.method91(integer.intValue(),
							    1023572003));
			int i_120_ = class602.anInt7949 * 196422211;
			if (class602.anIntArray7943 != null) {
			    class602 = class602.method9988(anInterface18_7352,
							   anInterface20_7351,
							   1459128754);
			    if (class602 != null)
				i_120_ = class602.anInt7949 * 196422211;
			}
			if (i_120_ != -1) {
			    Class534_Sub29 class534_sub29
				= new Class534_Sub29(i_120_);
			    class534_sub29.anInt10655 = i * -833592845;
			    class534_sub29.anInt10653 = i_117_ * -1714674331;
			    aClass700_7413.method14131(class534_sub29,
						       (short) 789);
			}
		    }
		}
	    }
	}
	for (int i = 0; i < 3; i++) {
	    for (int i_121_ = 0;
		 i_121_ < aHashMapArrayArrayArray7391[0].length; i_121_++) {
		for (int i_122_ = 0;
		     i_122_ < aHashMapArrayArrayArray7391[0][0].length;
		     i_122_++) {
		    HashMap hashmap
			= aHashMapArrayArrayArray7391[i][i_121_][i_122_];
		    if (hashmap != null) {
			Iterator iterator = hashmap.values().iterator();
			while (iterator.hasNext()) {
			    Class541 class541 = (Class541) iterator.next();
			    if (class541.anIntArray7175 != null) {
				for (int i_123_ = 0;
				     i_123_ < class541.anIntArray7175.length;
				     i_123_++) {
				    Class602 class602
					= ((Class602)
					   (aClass44_Sub13_7348.method91
					    (class541.anIntArray7175[i_123_],
					     -2138452702)));
				    int i_124_
					= class602.anInt7949 * 196422211;
				    if (class602.anIntArray7943 != null) {
					class602 = (class602.method9988
						    (anInterface18_7352,
						     anInterface20_7351,
						     -786328073));
					if (class602 != null)
					    i_124_ = (class602.anInt7949
						      * 196422211);
				    }
				    if (i_124_ != -1) {
					Class534_Sub29 class534_sub29
					    = new Class534_Sub29(i_124_);
					class534_sub29.anInt10655
					    = ((i_121_ + (anInt7368 >> 6)) * 64
					       + class541.aByte7177
					       - anInt7368) * -833592845;
					class534_sub29.anInt10653
					    = ((i_122_ + (anInt7369 >> 6)) * 64
					       + class541.aByte7176
					       - anInt7369) * -1714674331;
					aClass700_7413.method14131
					    (class534_sub29, (short) 789);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static int method9122(Class177 class177, int i, int i_125_, int i_126_) {
	return method9126(anInterface14_7415, class177, i, i_125_, i_126_);
    }
    
    static void method9123() {
	int[] is = new int[3];
	for (int i = 0; i < aClass523_7366.anInt7086 * -942354647; i++) {
	    boolean bool
		= (aClass534_Sub18_Sub9_7354.method18260
		   (aClass523_7366.anIntArray7085[i] >> 28 & 0x3,
		    aClass523_7366.anIntArray7085[i] >> 14 & 0x3fff,
		    aClass523_7366.anIntArray7085[i] & 0x3fff, is, 509107670));
	    if (bool) {
		Class534_Sub29 class534_sub29
		    = new Class534_Sub29(aClass523_7366.anIntArray7084[i]);
		class534_sub29.anInt10655 = (is[1] - anInt7368) * -833592845;
		class534_sub29.anInt10653 = (is[2] - anInt7369) * -1714674331;
		aClass700_7413.method14131(class534_sub29, (short) 789);
	    }
	}
    }
    
    static void method9124(int i, int i_127_, int i_128_, int i_129_,
			   int i_130_, int i_131_, int i_132_, int i_133_) {
	anInt7406 = i - anInt7368;
	anInt7407 = i_127_ - anInt7369;
	anInt7381 = i_128_ - anInt7368;
	anInt7408 = i_129_ - anInt7369;
	anInt7410 = i_130_;
	anInt7411 = i_131_;
	anInt7412 = i_132_;
	anInt7378 = i_133_;
    }
    
    static void method9125(Class185 class185, int[] is, int i, int i_134_,
			   int i_135_, int[] is_136_, byte[] is_137_) {
	if (is_136_ != null) {
	    for (int i_138_ = 0; i_138_ < is_136_.length; i_138_++) {
		Class602 class602
		    = (Class602) aClass44_Sub13_7348.method91(is_136_[i_138_],
							      -1960759354);
		int i_139_ = class602.anInt7890 * 350336715;
		if (i_139_ != -1) {
		    Class85 class85
			= ((Class85)
			   aClass44_Sub18_7416.method91(i_139_, 311110131));
		    Class163 class163
			= class85.method1672(class185,
					     (class602.aBool7924
					      ? is_137_[i_138_] >> 6 & 0x3
					      : 0),
					     (class602.aBool7955
					      ? class602.aBool7927 : false),
					     (short) 15364);
		    int[] is_140_
			= class85.method1673(class185,
					     (class602.aBool7924
					      ? is_137_[i_138_] >> 6 & 0x3
					      : 0),
					     (class602.aBool7955
					      ? class602.aBool7927 : false),
					     717602406);
		    if (class163 != null) {
			int i_141_ = class163.method22();
			int i_142_ = class163.method2692();
			int i_143_ = i * i_141_ / 64 >> 2;
			int i_144_ = i * i_142_ / 64 >> 2;
			if (class85.aBool844) {
			    int i_145_ = class602.anInt7904 * -1082258489;
			    int i_146_ = class602.anInt7928 * -1990374967;
			    if ((is_137_[i_138_] >> 6 & 0x1) == 1) {
				int i_147_ = i_145_;
				i_145_ = i_146_;
				i_146_ = i_147_;
			    }
			    i_143_ = i_145_ * i / 64;
			    i_144_ = i_146_ * i / 64;
			}
			if (i_143_ != 0 && i_144_ != 0) {
			    int i_148_ = i_134_ * i / 64;
			    int i_149_ = (64 - i_135_) * i / 64 - i_144_ + 1;
			    for (int i_150_ = 0; i_150_ < i_143_; i_150_++) {
				int i_151_ = i_150_ + i_148_;
				if (i_151_ >= 0) {
				    if (i_151_ >= i)
					break;
				    for (int i_152_ = 0; i_152_ < i_144_;
					 i_152_++) {
					int i_153_ = i_152_ + i_149_;
					if (i_153_ >= 0) {
					    if (i_153_ >= i)
						break;
					    int i_154_
						= (is_140_
						   [(i_150_ * i_141_ / i_143_
						     + i_141_ * (i_152_
								 * i_142_
								 / i_144_))]);
					    int i_155_ = i_154_ >> 24 & 0xff;
					    if (i_155_ != 0)
						is[i_151_ + i * i_153_]
						    = i_154_;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static int method9126(Interface14 interface14, Class177 class177, int i,
			  int i_156_, int i_157_) {
	Class651 class651 = (Class651) interface14.method91(i, -1815010284);
	if (class651 == null)
	    return 0;
	int i_158_ = class651.anInt8468 * 1884378951;
	if (i_158_ >= 0 && class177.method2931(i_158_, (byte) 1).aBool2072)
	    i_158_ = -1;
	int i_159_;
	if (class651.anInt8470 * 33386845 >= 0) {
	    int i_160_ = class651.anInt8470 * 33386845;
	    int i_161_ = (i_160_ & 0x7f) + i_157_;
	    if (i_161_ < 0)
		i_161_ = 0;
	    else if (i_161_ > 127)
		i_161_ = 127;
	    int i_162_
		= (i_160_ + i_156_ & 0xfc00) + (i_160_ & 0x380) + i_161_;
	    i_159_ = ~0xffffff | (Class415.anIntArray4666
				  [(Class315.method5705
				    (Class44_Sub11.method17348(i_162_, 96,
							       -2143947692),
				     1636230909)) & 0xffff]);
	} else if (i_158_ >= 0)
	    i_159_
		= ~0xffffff | (Class415.anIntArray4666
			       [Class315.method5705((Class44_Sub11.method17348
						     ((class177.method2931
						       (i_158_, (byte) 1)
						       .aShort2060),
						      96, -1771102481)),
						    1779866849) & 0xffff]);
	else if (class651.anInt8467 * -2044484027 == -1)
	    i_159_ = 0;
	else {
	    int i_163_ = class651.anInt8467 * -2044484027;
	    int i_164_ = (i_163_ & 0x7f) + i_157_;
	    if (i_164_ < 0)
		i_164_ = 0;
	    else if (i_164_ > 127)
		i_164_ = 127;
	    int i_165_
		= (i_163_ + i_156_ & 0xfc00) + (i_163_ & 0x380) + i_164_;
	    i_159_ = ~0xffffff | (Class415.anIntArray4666
				  [(Class315.method5705
				    (Class44_Sub11.method17348(i_165_, 96,
							       -2095932779),
				     2092838435)) & 0xffff]);
	}
	return i_159_;
    }
    
    static void method9127(Class185 class185, int i, int i_166_, int i_167_,
			   int i_168_) {
	Class163 class163 = (Class163) aClass203_7375.method3871(-1L);
	if (class163 == null || class163.method2647() != i_167_) {
	    int i_169_;
	    if (aClass534_Sub18_Sub9_7354.anInt11767 * 413186021 != -1)
		i_169_ = (~0xffffff
			  | aClass534_Sub18_Sub9_7354.anInt11767 * 413186021);
	    else
		i_169_ = -16777216;
	    if (anIntArray7398 == null
		|| anIntArray7398.length != i_167_ * i_167_)
		anIntArray7398 = new int[i_167_ * i_167_];
	    Arrays.fill(anIntArray7398, i_169_);
	    class163 = class185.method3316(anIntArray7398, 0, i_167_, i_167_,
					   i_167_, true);
	    aClass203_7375.method3893(class163, -1L);
	}
	aClass203_7375.method3893(class163, (long) i_168_);
    }
    
    public static Class534_Sub18_Sub9 method9128(int i, int i_170_) {
	for (Class534_Sub18_Sub9 class534_sub18_sub9
		 = (Class534_Sub18_Sub9) aClass9_7372.method583(-1635971947);
	     class534_sub18_sub9 != null;
	     class534_sub18_sub9
		 = (Class534_Sub18_Sub9) aClass9_7372.method584((byte) -51)) {
	    if (class534_sub18_sub9.aBool11762
		&& class534_sub18_sub9.method18261(i, i_170_, 368644304))
		return class534_sub18_sub9;
	}
	return null;
    }
    
    static void method9129(int[] is, int i, int i_171_, int i_172_, int i_173_,
			   int i_174_, boolean bool, int i_175_, int i_176_,
			   int i_177_, int[] is_178_, byte[] is_179_,
			   boolean bool_180_) {
	if (bool_180_ || i_175_ != 0 || i_176_ > 0) {
	    if (i_176_ == 0)
		method9139(is, i, i_171_, i_172_, i_173_, i_174_, i_174_,
			   i_175_ | ~0xffffff);
	    else {
		int i_181_ = i_177_ & 0x3f;
		if (i_181_ == 0 || anInt7394 == 0) {
		    int i_182_ = anIntArray7347[i_176_];
		    if (bool_180_ || i_182_ != 0)
			method9139(is, i, i_171_, i_172_, i_173_, i_174_,
				   i_174_, i_182_ | ~0xffffff);
		} else {
		    int i_183_ = bool_180_ ? 0 : 1;
		    int i_184_ = Class200.method3852(i_177_ >> 6 & 0x3, i_181_,
						     1858032622);
		    i_181_ = Class415.method6740(i_181_, 154635170);
		    method9144(is, i, i_171_, i_172_, i_173_, i_174_, i_174_,
			       i_175_, anIntArray7347[i_176_],
			       aByteArrayArrayArray7388[i_181_ - 1][i_184_],
			       anInt7394, i_183_);
		}
	    }
	}
	if (bool && is_178_ != null) {
	    int i_185_ = i_171_ - i + 1;
	    int i_186_ = i_173_ - i_172_ + 1;
	    for (int i_187_ = 0; i_187_ < is_178_.length; i_187_++) {
		int i_188_ = is_179_[i_187_] & 0x3f;
		if (i_188_ == Class595.aClass595_7851.anInt7852 * 847393323
		    || i_188_ == Class595.aClass595_7829.anInt7852 * 847393323
		    || i_188_ == Class595.aClass595_7832.anInt7852 * 847393323
		    || (i_188_
			== Class595.aClass595_7833.anInt7852 * 847393323)) {
		    Class602 class602
			= ((Class602)
			   aClass44_Sub13_7348.method91(is_178_[i_187_],
							215065677));
		    if (class602.anInt7890 * 350336715 == -1) {
			int i_189_ = -3355444;
			if (class602.anInt7907 * -2134171963 == 1)
			    i_189_ = -3407872;
			int i_190_ = is_179_[i_187_] >> 6 & 0x3;
			if (i_188_
			    == Class595.aClass595_7851.anInt7852 * 847393323) {
			    if (i_190_ == 0)
				method9131(is, i, i_173_, i_186_, i_174_,
					   i_189_);
			    else if (i_190_ == 1)
				method9145(is, i, i_173_, i_185_, i_174_,
					   i_189_);
			    else if (i_190_ == 2)
				method9131(is, i_171_, i_173_, i_186_, i_174_,
					   i_189_);
			    else
				method9145(is, i, i_172_, i_185_, i_174_,
					   i_189_);
			} else if (i_188_ == (Class595.aClass595_7829.anInt7852
					      * 847393323)) {
			    if (i_190_ == 0) {
				method9131(is, i, i_173_, i_186_, i_174_, -1);
				method9145(is, i, i_173_, i_185_, i_174_,
					   i_189_);
			    } else if (i_190_ == 1) {
				method9131(is, i_171_, i_173_, i_186_, i_174_,
					   -1);
				method9145(is, i, i_173_, i_185_, i_174_,
					   i_189_);
			    } else if (i_190_ == 2) {
				method9131(is, i_171_, i_173_, i_186_, i_174_,
					   -1);
				method9145(is, i, i_172_, i_185_, i_174_,
					   i_189_);
			    } else {
				method9131(is, i, i_173_, i_186_, i_174_, -1);
				method9145(is, i, i_172_, i_185_, i_174_,
					   i_189_);
			    }
			} else if (i_188_ == (Class595.aClass595_7832.anInt7852
					      * 847393323)) {
			    if (i_190_ == 0)
				method9145(is, i, i_173_, 1, i_174_, i_189_);
			    else if (i_190_ == 1)
				method9145(is, i_171_, i_173_, 1, i_174_,
					   i_189_);
			    else if (i_190_ == 2)
				method9145(is, i_171_, i_172_, 1, i_174_,
					   i_189_);
			    else
				method9145(is, i, i_172_, 1, i_174_, i_189_);
			} else if (i_188_ == (Class595.aClass595_7833.anInt7852
					      * 847393323)) {
			    if (i_190_ == 0 || i_190_ == 2) {
				for (int i_191_ = 0; i_191_ < i_186_; i_191_++)
				    method9145(is, i + i_191_, i_172_ + i_191_,
					       1, i_174_, i_189_);
			    } else {
				for (int i_192_ = 0; i_192_ < i_186_; i_192_++)
				    method9145(is, i + i_192_, i_173_ - i_192_,
					       1, i_174_, i_189_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method9130(Class185 class185, int[] is, int i, int i_193_,
			   int i_194_, int i_195_, int i_196_, int i_197_) {
	Object object = anObjectArray7367[i_197_];
	if (object != null) {
	    if (object instanceof Class534_Sub38) {
		Class534_Sub38 class534_sub38 = (Class534_Sub38) object;
		if (class534_sub38 != null)
		    method9189(class185, is, i, i_193_, i_194_,
			       class534_sub38.anIntArray10806,
			       class534_sub38.aByteArray10805);
	    } else {
		Integer integer = (Integer) object;
		anIntArray7363[0] = integer.intValue();
		aByteArray7382[0]
		    = aByteArray7379[i_195_ + i_196_ * anInt7370];
		method9189(class185, is, i, i_193_, i_194_, anIntArray7363,
			   aByteArray7382);
	    }
	}
    }
    
    static void method9131(int[] is, int i, int i_198_, int i_199_, int i_200_,
			   int i_201_) {
	int i_202_ = i + (i_200_ - i_198_ - 1) * i_200_;
	for (int i_203_ = 0; i_203_ < i_199_; i_203_++)
	    is[i_202_ + i_203_ * i_200_] = i_201_;
    }
    
    static Class700 method9132(Class185 class185) {
	int i = anInt7381 - anInt7406;
	int i_204_ = anInt7407 - anInt7408;
	int i_205_ = (anInt7412 - anInt7410 << 16) / i;
	int i_206_ = (anInt7378 - anInt7411 << 16) / i_204_;
	return method9133(class185, i_205_, i_206_, 0, 0);
    }
    
    static Class700 method9133(Class185 class185, int i, int i_207_,
			       int i_208_, int i_209_) {
	for (Class534_Sub29 class534_sub29
		 = (Class534_Sub29) aClass700_7413.method14135((byte) -1);
	     class534_sub29 != null;
	     class534_sub29
		 = (Class534_Sub29) aClass700_7413.method14139(1760019141))
	    method9134(class185, class534_sub29, i, i_207_, i_208_, i_209_);
	return aClass700_7413;
    }
    
    static void method9134(Class185 class185, Class534_Sub29 class534_sub29,
			   int i, int i_210_, int i_211_, int i_212_) {
	class534_sub29.anInt10654
	    = (anInt7410
	       + (i_211_ + i * (class534_sub29.anInt10655 * 1412374331
				- anInt7406)
		  >> 16)) * 1592688797;
	class534_sub29.anInt10651
	    = (anInt7378
	       - (i_212_ + i_210_ * (class534_sub29.anInt10653 * -958626707
				     - anInt7408)
		  >> 16)) * -2020402557;
    }
    
    static void method9135(Class185 class185, Class534_Sub29 class534_sub29,
			   Class272 class272) {
	if (class272.anIntArray2992 != null) {
	    int[] is = new int[class272.anIntArray2992.length];
	    for (int i = 0; i < is.length / 2; i++) {
		int i_213_ = (class272.anIntArray2992[i * 2]
			      + class534_sub29.anInt10655 * 1412374331);
		int i_214_ = (class272.anIntArray2992[i * 2 + 1]
			      + class534_sub29.anInt10653 * -958626707);
		is[i * 2] = anInt7410 + ((anInt7412 - anInt7410)
					 * (i_213_ - anInt7406)
					 / (anInt7381 - anInt7406));
		is[i * 2 + 1] = anInt7378 - ((anInt7378 - anInt7411)
					     * (i_214_ - anInt7408)
					     / (anInt7407 - anInt7408));
	    }
	    Class182.method2985(class185, is, class272.anInt2997 * 1393455813);
	    if (class272.anInt3011 * 685328963 > 0) {
		for (int i = 0; i < is.length / 2 - 1; i++) {
		    int i_215_ = is[i * 2];
		    int i_216_ = is[i * 2 + 1];
		    int i_217_ = is[(i + 1) * 2];
		    int i_218_ = is[(i + 1) * 2 + 1];
		    if (i_217_ < i_215_) {
			int i_219_ = i_215_;
			int i_220_ = i_216_;
			i_215_ = i_217_;
			i_216_ = i_218_;
			i_217_ = i_219_;
			i_218_ = i_220_;
		    } else if (i_217_ == i_215_ && i_218_ < i_216_) {
			int i_221_ = i_216_;
			i_216_ = i_218_;
			i_218_ = i_221_;
		    }
		    class185.method3305(i_215_, i_216_, i_217_, i_218_,
					(class272.anIntArray2986
					 [class272.aByteArray3006[i] & 0xff]),
					1, class272.anInt3011 * 685328963,
					class272.anInt2999 * 1781521033,
					class272.anInt3000 * 290033855);
		}
		int i = is[is.length - 2];
		int i_222_ = is[is.length - 1];
		int i_223_ = is[0];
		int i_224_ = is[1];
		if (i_223_ < i) {
		    int i_225_ = i;
		    int i_226_ = i_222_;
		    i = i_223_;
		    i_222_ = i_224_;
		    i_223_ = i_225_;
		    i_224_ = i_226_;
		} else if (i_223_ == i && i_224_ < i_222_) {
		    int i_227_ = i_222_;
		    i_222_ = i_224_;
		    i_224_ = i_227_;
		}
		class185.method3305(i, i_222_, i_223_, i_224_,
				    (class272.anIntArray2986
				     [((class272.aByteArray3006
					[class272.aByteArray3006.length - 1])
				       & 0xff)]),
				    1, class272.anInt3011 * 685328963,
				    class272.anInt2999 * 1781521033,
				    class272.anInt3000 * 290033855);
	    } else {
		for (int i = 0; i < is.length / 2 - 1; i++)
		    class185.method3567(is[i * 2], is[i * 2 + 1],
					is[(i + 1) * 2], is[(i + 1) * 2 + 1],
					(class272.anIntArray2986
					 [class272.aByteArray3006[i] & 0xff]),
					882924453);
		class185.method3567(is[is.length - 2], is[is.length - 1],
				    is[0], is[1],
				    (class272.anIntArray2986
				     [((class272.aByteArray3006
					[class272.aByteArray3006.length - 1])
				       & 0xff)]),
				    916021315);
	    }
	}
    }
    
    static Class700 method9136(Class185 class185) {
	int i = anInt7381 - anInt7406;
	int i_228_ = anInt7407 - anInt7408;
	int i_229_ = (anInt7412 - anInt7410 << 16) / i;
	int i_230_ = (anInt7378 - anInt7411 << 16) / i_228_;
	return method9133(class185, i_229_, i_230_, 0, 0);
    }
    
    static int method9137() {
	return (int) (64.0F * aFloat7409 / 2.0F);
    }
    
    static void method9138() {
	aShortArray7373 = new short[anInt7370 * anInt7371];
	aShortArray7376 = new short[anInt7370 * anInt7371];
	aByteArray7377 = new byte[anInt7370 * anInt7371];
	anObjectArray7367 = new Object[anInt7370 * anInt7371];
	aByteArray7379 = new byte[anInt7370 * anInt7371];
	aHashMapArrayArrayArray7391
	    = new HashMap[3][anInt7370 >> 6][anInt7371 >> 6];
	anIntArray7347 = new int[anInterface14_7415.method90((byte) 33) + 1];
	aBoolArrayArray7389 = new boolean[anInt7370 / 8][anInt7371 / 8];
    }
    
    static void method9139(int[] is, int i, int i_231_, int i_232_, int i_233_,
			   int i_234_, int i_235_, int i_236_) {
	for (int i_237_ = i; i_237_ <= i_231_; i_237_++) {
	    for (int i_238_ = i_232_; i_238_ <= i_233_; i_238_++)
		is[(i_235_ - i_238_ - 1) * i_234_ + i_237_] = i_236_;
	}
    }
    
    static void method9140(int[] is, int i, int i_239_, int i_240_, int i_241_,
			   int i_242_) {
	int i_243_ = aClass622_7353.anInt8127 * -962787217 >> 24 & 0xff;
	int i_244_ = 255 - i_243_;
	if ((!aBoolArray7387[anInt7383]
	     || !aBoolArray7387[anInt7385] && !aBoolArray7387[anInt7356])
	    && (!aBoolArray7387[anInt7361]
		|| !aBoolArray7387[anInt7385] && !aBoolArray7387[anInt7356])) {
	    method9180(is, i, i_239_, i_240_, i_241_, i_242_, i_243_, i_244_,
		       true, true, true, true);
	    if (aBoolArray7387[anInt7362]) {
		is[(i_242_ - i_241_ - 1) * i_242_ + i_239_]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_242_ - i_241_) * i_242_ + i_239_]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_242_ - i_241_ - 1) * i_242_ + i_239_ - 1]
		    = aClass622_7353.anInt8141 * 1156690091;
	    }
	    if (aBoolArray7387[anInt7386]) {
		is[(i_242_ - i_240_ - 1) * i_242_ + i_239_]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_242_ - i_240_ - 2) * i_242_ + i_239_]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_242_ - i_240_ - 1) * i_242_ + i_239_ - 1]
		    = aClass622_7353.anInt8141 * 1156690091;
	    }
	    if (aBoolArray7387[anInt7403]) {
		is[(i_242_ - i_240_ - 1) * i_242_ + i]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_242_ - i_240_ - 2) * i_242_ + i]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_242_ - i_240_ - 1) * i_242_ + i + 1]
		    = aClass622_7353.anInt8141 * 1156690091;
	    }
	    if (aBoolArray7387[anInt7390]) {
		is[(i_242_ - i_241_ - 1) * i_242_ + i]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_242_ - i_241_) * i_242_ + i]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_242_ - i_241_ - 1) * i_242_ + i + 1]
		    = aClass622_7353.anInt8141 * 1156690091;
	    }
	} else {
	    if (aBoolArray7387[anInt7383] && aBoolArray7387[anInt7385])
		method9143(is,
			   i_239_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_241_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_242_, i_243_, i_244_, anInt7362);
	    else {
		method9180(is,
			   i_239_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_239_,
			   i_241_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_241_, i_242_, i_243_, i_244_, true, true, false,
			   false);
		if (aBoolArray7387[anInt7362]) {
		    is[(i_242_ - i_241_ - 1) * i_242_ + i_239_]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_242_ - i_241_) * i_242_ + i_239_]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_242_ - i_241_ - 1) * i_242_ + i_239_ - 1]
			= aClass622_7353.anInt8141 * 1156690091;
		}
	    }
	    if (aBoolArray7387[anInt7361] && aBoolArray7387[anInt7385])
		method9143(is,
			   i_239_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_240_, i_242_, i_243_, i_244_, anInt7386);
	    else {
		method9180(is,
			   i_239_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_239_, i_240_,
			   i_240_ + aClass622_7353.anInt8143 * -1255575643 - 1,
			   i_242_, i_243_, i_244_, false, true, true, false);
		if (aBoolArray7387[anInt7386]) {
		    is[(i_242_ - i_240_ - 1) * i_242_ + i_239_]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_242_ - i_240_ - 2) * i_242_ + i_239_]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_242_ - i_240_ - 1) * i_242_ + i_239_ - 1]
			= aClass622_7353.anInt8141 * 1156690091;
		}
	    }
	    if (aBoolArray7387[anInt7361] && aBoolArray7387[anInt7356])
		method9143(is, i, i_240_, i_242_, i_243_, i_244_, anInt7403);
	    else {
		method9180(is, i,
			   i + aClass622_7353.anInt8143 * -1255575643 - 1,
			   i_240_,
			   i_240_ + aClass622_7353.anInt8143 * -1255575643 - 1,
			   i_242_, i_243_, i_244_, false, false, true, true);
		if (aBoolArray7387[anInt7403]) {
		    is[(i_242_ - i_240_ - 1) * i_242_ + i]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_242_ - i_240_ - 2) * i_242_ + i]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_242_ - i_240_ - 1) * i_242_ + i + 1]
			= aClass622_7353.anInt8141 * 1156690091;
		}
	    }
	    if (aBoolArray7387[anInt7383] && aBoolArray7387[anInt7356])
		method9143(is, i,
			   i_241_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_242_, i_243_, i_244_, anInt7390);
	    else {
		method9180(is, i,
			   i + aClass622_7353.anInt8143 * -1255575643 - 1,
			   i_241_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_241_, i_242_, i_243_, i_244_, true, false, false,
			   true);
		if (aBoolArray7387[anInt7390]) {
		    is[(i_242_ - i_241_ - 1) * i_242_ + i]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_242_ - i_241_) * i_242_ + i]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_242_ - i_241_ - 1) * i_242_ + i + 1]
			= aClass622_7353.anInt8141 * 1156690091;
		}
	    }
	    if (i + aClass622_7353.anInt8143 * -1255575643
		< i_239_ - aClass622_7353.anInt8143 * -1255575643)
		method9180(is, i + aClass622_7353.anInt8143 * -1255575643,
			   i_239_ - aClass622_7353.anInt8143 * -1255575643,
			   i_240_, i_241_, i_242_, i_243_, i_244_, true, false,
			   true, false);
	    if (i_240_ + aClass622_7353.anInt8143 * -1255575643 + 1
		< i_241_ - aClass622_7353.anInt8143 * -1255575643 - 1) {
		method9180(is, i,
			   i + aClass622_7353.anInt8143 * -1255575643 - 1,
			   i_240_ + aClass622_7353.anInt8143 * -1255575643,
			   i_241_ - aClass622_7353.anInt8143 * -1255575643,
			   i_242_, i_243_, i_244_, false, false, false, true);
		method9180(is,
			   i_239_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_239_,
			   i_240_ + aClass622_7353.anInt8143 * -1255575643,
			   i_241_ - aClass622_7353.anInt8143 * -1255575643,
			   i_242_, i_243_, i_244_, false, true, false, false);
	    }
	}
    }
    
    static void method9141(int[] is, int i, int i_245_, int i_246_, int i_247_,
			   int i_248_) {
	int i_249_ = aClass622_7353.anInt8127 * -962787217 >> 24 & 0xff;
	int i_250_ = 255 - i_249_;
	for (int i_251_ = i; i_251_ <= i_245_; i_251_++) {
	    for (int i_252_ = i_246_; i_252_ <= i_247_; i_252_++) {
		int i_253_ = is[(i_248_ - i_252_ - 1) * i_248_ + i_251_];
		if (i_253_ != anInt7414) {
		    anInt7414 = i_253_;
		    anInt7360 = (~0xffffff
				 | ((((aClass622_7353.anInt8127 * -962787217
				       & 0xff00ff) * i_249_
				      + (i_253_ & 0xff00ff) * i_250_)
				     & ~0xff00ff)
				    + (((aClass622_7353.anInt8127 * -962787217
					 & 0xff00) * i_249_
					+ (i_253_ & 0xff00) * i_250_)
				       & 0xff0000)) >> 8);
		}
		is[(i_248_ - i_252_ - 1) * i_248_ + i_251_] = anInt7360;
	    }
	}
    }
    
    static void method9142(Class185 class185, Class534_Sub29 class534_sub29,
			   int i, int i_254_, int i_255_, int i_256_) {
	class534_sub29.anInt10654
	    = (anInt7410
	       + (i_255_ + i * (class534_sub29.anInt10655 * 1412374331
				- anInt7406)
		  >> 16)) * 1592688797;
	class534_sub29.anInt10651
	    = (anInt7378
	       - (i_256_ + i_254_ * (class534_sub29.anInt10653 * -958626707
				     - anInt7408)
		  >> 16)) * -2020402557;
    }
    
    static void method9143(int[] is, int i, int i_257_, int i_258_, int i_259_,
			   int i_260_, int i_261_) {
	for (int i_262_ = 0; i_262_ < aClass622_7353.anInt8143 * -1255575643;
	     i_262_++) {
	    int i_263_ = i_262_;
	    if (i_261_ == anInt7362 || i_261_ == anInt7386)
		i_263_ = aClass622_7353.anInt8143 * -1255575643 - i_262_ - 1;
	    for (int i_264_ = 0;
		 i_264_ < aClass622_7353.anInt8143 * -1255575643; i_264_++) {
		int i_265_ = i_264_;
		if (i_261_ == anInt7386 || i_261_ == anInt7403)
		    i_265_
			= aClass622_7353.anInt8143 * -1255575643 - i_264_ - 1;
		int i_266_ = anIntArrayArray7346[i_263_][i_265_];
		if (i_266_ != 0) {
		    if (i_266_ == 1) {
			int i_267_
			    = is[((i_258_ - i_257_ - i_264_ - 1) * i_258_ + i
				  + i_262_)];
			if (i_267_ != anInt7414) {
			    anInt7414 = i_267_;
			    anInt7360
				= (~0xffffff
				   | ((((aClass622_7353.anInt8127 * -962787217
					 & 0xff00ff) * i_259_
					+ (i_267_ & 0xff00ff) * i_260_)
				       & ~0xff00ff)
				      + ((((aClass622_7353.anInt8127
					    * -962787217)
					   & 0xff00) * i_259_
					  + (i_267_ & 0xff00) * i_260_)
					 & 0xff0000)) >> 8);
			}
			is[((i_258_ - i_257_ - i_264_ - 1) * i_258_ + i
			    + i_262_)]
			    = anInt7360;
		    } else if (i_266_ == 2)
			is[((i_258_ - i_257_ - i_264_ - 1) * i_258_ + i
			    + i_262_)]
			    = aClass622_7353.anInt8141 * 1156690091;
		}
	    }
	}
    }
    
    static void method9144(int[] is, int i, int i_268_, int i_269_, int i_270_,
			   int i_271_, int i_272_, int i_273_, int i_274_,
			   byte[] is_275_, int i_276_, int i_277_) {
	int i_278_ = 0;
	int i_279_ = 0;
	int i_280_ = i_268_ - i + 1;
	int i_281_ = i_270_ - i_269_ + 1;
	int i_282_ = (i_276_ << 16) / i_280_;
	int i_283_ = (is_275_.length / i_276_ << 16) / i_281_;
	int i_284_ = i + (i_272_ - i_270_ - 1) * i_271_;
	int i_285_ = i_273_ >> 24;
	int i_286_ = i_274_ >> 24;
	if (i_277_ == 0 || i_277_ == 1 && i_285_ == 255 && i_286_ == 255) {
	    int i_287_ = i_278_;
	    for (int i_288_ = -i_281_; i_288_ < 0; i_288_++) {
		int i_289_ = (i_279_ >> 16) * i_276_;
		for (int i_290_ = -i_280_; i_290_ < 0; i_290_++) {
		    if (is_275_[(i_278_ >> 16) + i_289_] != 0)
			is[i_284_++] = i_274_;
		    else
			is[i_284_++] = i_273_;
		    i_278_ += i_282_;
		}
		i_279_ += i_283_;
		i_278_ = i_287_;
		i_284_ += i_271_ - i_280_;
	    }
	} else if (i_277_ == 1) {
	    int i_291_ = i_278_;
	    for (int i_292_ = -i_281_; i_292_ < 0; i_292_++) {
		int i_293_ = (i_279_ >> 16) * i_276_;
		for (int i_294_ = -i_280_; i_294_ < 0; i_294_++) {
		    int i_295_ = i_273_;
		    if (is_275_[(i_278_ >> 16) + i_293_] != 0)
			i_295_ = i_274_;
		    int i_296_ = i_295_ >>> 24;
		    int i_297_ = 255 - i_296_;
		    int i_298_ = is[i_284_];
		    is[i_284_++]
			= ~0xffffff | ((((i_295_ & 0xff00ff) * i_296_
					 + (i_298_ & 0xff00ff) * i_297_)
					& ~0xff00ff)
				       + (((i_295_ & 0xff00) * i_296_
					   + (i_298_ & 0xff00) * i_297_)
					  & 0xff0000)) >> 8;
		    i_278_ += i_282_;
		}
		i_279_ += i_283_;
		i_278_ = i_291_;
		i_284_ += i_271_ - i_280_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    static void method9145(int[] is, int i, int i_299_, int i_300_, int i_301_,
			   int i_302_) {
	int i_303_ = i + (i_301_ - i_299_ - 1) * i_301_;
	for (int i_304_ = 0; i_304_ < i_300_; i_304_++)
	    is[i_303_ + i_304_] = i_302_;
    }
    
    static void method9146() {
	int[] is = new int[3];
	for (int i = 0; i < aClass523_7366.anInt7086 * -942354647; i++) {
	    boolean bool
		= (aClass534_Sub18_Sub9_7354.method18260
		   (aClass523_7366.anIntArray7085[i] >> 28 & 0x3,
		    aClass523_7366.anIntArray7085[i] >> 14 & 0x3fff,
		    aClass523_7366.anIntArray7085[i] & 0x3fff, is, 710924229));
	    if (bool) {
		Class534_Sub29 class534_sub29
		    = new Class534_Sub29(aClass523_7366.anIntArray7084[i]);
		class534_sub29.anInt10655 = (is[1] - anInt7368) * -833592845;
		class534_sub29.anInt10653 = (is[2] - anInt7369) * -1714674331;
		aClass700_7413.method14131(class534_sub29, (short) 789);
	    }
	}
    }
    
    static int method9147() {
	return (int) (64.0F * aFloat7409 / 2.0F);
    }
    
    public static void method9148
	(Class472 class472, Class472 class472_305_,
	 Class44_Sub16 class44_sub16, Class44_Sub12 class44_sub12,
	 Class44_Sub13 class44_sub13, Class44_Sub9 class44_sub9,
	 Class44_Sub18 class44_sub18, Interface18 interface18,
	 Interface20 interface20) {
	aClass472_7397 = class472;
	aClass472_7365 = class472_305_;
	anInterface14_7415 = class44_sub16;
	anInterface14_7350 = class44_sub12;
	aClass44_Sub13_7348 = class44_sub13;
	aClass44_Sub9_7349 = class44_sub9;
	aClass44_Sub18_7416 = class44_sub18;
	anInterface18_7352 = interface18;
	anInterface20_7351 = interface20;
	aClass9_7372.method578((byte) -105);
	int[] is
	    = aClass472_7397.method7678(Class650.aClass650_8460.method93(),
					(byte) 97);
	if (is != null) {
	    for (int i = 0; i < is.length; i++) {
		Class534_Sub18_Sub9 class534_sub18_sub9
		    = Class312_Sub1.method15646(aClass472_7397, is[i],
						387581420);
		aClass9_7372.method581(class534_sub18_sub9,
				       (long) (class534_sub18_sub9.anInt11766
					       * 848546455));
	    }
	}
	Class456.method7426(true, false, 1739452007);
    }
    
    static void method9149(Class185 class185, boolean bool, boolean bool_306_,
			   int i, int i_307_, int i_308_, int i_309_,
			   boolean bool_310_, boolean bool_311_) {
	int i_312_ = anInt7381 - anInt7406;
	int i_313_ = anInt7407 - anInt7408;
	if (anInt7381 < anInt7370)
	    i_312_++;
	if (anInt7407 < anInt7371)
	    i_313_++;
	int i_314_ = anInt7406 / 64;
	int i_315_ = anInt7408 / 64;
	int i_316_ = (anInt7406 + i_312_) / 64;
	int i_317_ = (anInt7408 + i_313_) / 64;
	int i_318_;
	int i_319_;
	if (bool_311_) {
	    i_318_ = (anInt7412 - anInt7410) / ((anInt7381 - anInt7406) / 64);
	    i_319_ = i_318_;
	} else {
	    i_318_ = method9137();
	    i_319_ = (int) Math.ceil((double) (64.0F * aFloat7364 / 2.0F));
	}
	anArrayList7396.clear();
	int i_320_ = 0;
	int i_321_ = i_318_ * i_318_;
	for (int i_322_ = i_314_; i_322_ <= i_316_; i_322_++) {
	    for (int i_323_ = i_315_; i_323_ <= i_317_; i_323_++) {
		int i_324_ = (i_322_ << 16) + i_323_;
		int i_325_ = method9211((long) i_324_);
		if (i_325_ != i_318_) {
		    if (i_322_ < 0 || i_322_ * 64 >= anInt7370 || i_323_ < 0
			|| i_323_ * 64 >= anInt7371)
			method9127(class185, i_322_, i_323_, i_318_, i_324_);
		    else if (i_325_ == -1) {
			method9213(i_322_, i_323_, i_318_, i_324_, bool,
				   bool_306_, bool_310_, class185);
			i_320_ += i_321_;
		    } else
			anArrayList7396.add(Integer.valueOf(i_324_));
		}
	    }
	}
	if (!anArrayList7396.isEmpty() && i_320_ < anInt7395) {
	    for (Iterator iterator = anArrayList7396.iterator();
		 i_320_ < anInt7395 && iterator.hasNext(); i_320_ += i_321_) {
		int i_326_ = ((Integer) iterator.next()).intValue();
		int i_327_ = i_326_ >> 16 & 0xffff;
		int i_328_ = i_326_ & 0xffff;
		method9213(i_327_, i_328_, i_318_, i_326_, bool, bool_306_,
			   bool_310_, class185);
	    }
	}
	for (int i_329_ = i_314_; i_329_ <= i_316_; i_329_++) {
	    int i_330_ = i_329_ * 64;
	    int i_331_ = i_330_ - anInt7406;
	    int i_332_ = i_319_;
	    int i_333_ = (i_308_ + i * i_331_ >> 16) + anInt7410;
	    int i_334_ = (i_308_ + i * (i_331_ + 64) >> 16) + anInt7410;
	    if (i_333_ + i_332_ != i_334_)
		i_332_ = i_334_ - i_333_;
	    for (int i_335_ = i_315_; i_335_ <= i_317_; i_335_++) {
		int i_336_ = i_335_ * 64;
		int i_337_ = i_336_ - anInt7408;
		int i_338_ = (i_329_ << 16) + i_335_;
		int i_339_ = i_319_;
		int i_340_ = anInt7378 - (i_309_ + i_307_ * i_337_ >> 16);
		int i_341_
		    = anInt7378 - (i_309_ + i_307_ * (i_337_ + 64) >> 16);
		if (i_340_ - i_339_ != i_341_)
		    i_339_ = i_340_ - i_341_;
		i_340_ -= i_339_;
		Class163 class163
		    = (Class163) aClass203_7375.method3871((long) i_338_);
		if (class163 == null)
		    throw new RuntimeException();
		if (class163.method2647() == i_332_
		    && class163.method2649() == i_339_)
		    class163.method2656(i_333_, i_340_);
		else
		    class163.method2659(i_333_, i_340_, i_332_, i_339_);
	    }
	}
    }
    
    static void method9150(int[] is, int i, int i_342_, int i_343_, int i_344_,
			   int i_345_, int i_346_, int i_347_, boolean bool,
			   boolean bool_348_, boolean bool_349_,
			   boolean bool_350_) {
	for (int i_351_ = i; i_351_ <= i_342_; i_351_++) {
	    boolean bool_352_
		= bool_348_ ? (aBoolArray7387[anInt7385]
			       && i_342_ - i_351_ < (aClass622_7353.anInt8142
						     * -1804667875)) : false;
	    boolean bool_353_
		= (bool_350_
		   ? (aBoolArray7387[anInt7356]
		      && i_351_ - i < aClass622_7353.anInt8142 * -1804667875)
		   : false);
	    for (int i_354_ = i_343_; i_354_ <= i_344_; i_354_++) {
		if (bool_352_ || bool_353_)
		    is[(i_345_ - i_354_ - 1) * i_345_ + i_351_]
			= aClass622_7353.anInt8141 * 1156690091;
		else {
		    boolean bool_355_
			= (bool
			   ? (aBoolArray7387[anInt7383]
			      && (i_344_ - i_354_
				  < aClass622_7353.anInt8142 * -1804667875))
			   : false);
		    boolean bool_356_
			= (bool_349_
			   ? (aBoolArray7387[anInt7361]
			      && (i_354_ - i_343_
				  < aClass622_7353.anInt8142 * -1804667875))
			   : false);
		    if (bool_355_ || bool_356_)
			is[(i_345_ - i_354_ - 1) * i_345_ + i_351_]
			    = aClass622_7353.anInt8141 * 1156690091;
		    else {
			int i_357_
			    = is[(i_345_ - i_354_ - 1) * i_345_ + i_351_];
			if (i_357_ != anInt7414) {
			    anInt7414 = i_357_;
			    anInt7360
				= (~0xffffff
				   | ((((aClass622_7353.anInt8127 * -962787217
					 & 0xff00ff) * i_346_
					+ (i_357_ & 0xff00ff) * i_347_)
				       & ~0xff00ff)
				      + ((((aClass622_7353.anInt8127
					    * -962787217)
					   & 0xff00) * i_346_
					  + (i_357_ & 0xff00) * i_347_)
					 & 0xff0000)) >> 8);
			}
			is[(i_345_ - i_354_ - 1) * i_345_ + i_351_]
			    = anInt7360;
		    }
		}
	    }
	}
    }
    
    static void method9151() {
	aShortArray7373 = new short[anInt7370 * anInt7371];
	aShortArray7376 = new short[anInt7370 * anInt7371];
	aByteArray7377 = new byte[anInt7370 * anInt7371];
	anObjectArray7367 = new Object[anInt7370 * anInt7371];
	aByteArray7379 = new byte[anInt7370 * anInt7371];
	aHashMapArrayArrayArray7391
	    = new HashMap[3][anInt7370 >> 6][anInt7371 >> 6];
	anIntArray7347 = new int[anInterface14_7415.method90((byte) 26) + 1];
	aBoolArrayArray7389 = new boolean[anInt7370 / 8][anInt7371 / 8];
    }
    
    static void method9152(Class185 class185, boolean bool, boolean bool_358_,
			   boolean bool_359_, boolean bool_360_) {
	int i = anInt7381 - anInt7406;
	int i_361_ = anInt7407 - anInt7408;
	int i_362_ = (anInt7412 - anInt7410 << 16) / i;
	int i_363_ = (anInt7378 - anInt7411 << 16) / i_361_;
	method9154(class185, bool, bool_358_, i_362_, i_363_, 0, 0, bool_359_,
		   bool_360_);
    }
    
    static boolean method9153(Class534_Sub18_Sub9 class534_sub18_sub9) {
	if (class534_sub18_sub9 != null
	    && class534_sub18_sub9 != aClass534_Sub18_Sub9_7354) {
	    aClass534_Sub18_Sub9_7354 = class534_sub18_sub9;
	    aBool7380 = (aClass534_Sub18_Sub9_7354.anInt11766 * 848546455
			 == aClass622_7353.anInt8138 * -359981155);
	    return true;
	}
	return false;
    }
    
    static void method9154(Class185 class185, boolean bool, boolean bool_364_,
			   int i, int i_365_, int i_366_, int i_367_,
			   boolean bool_368_, boolean bool_369_) {
	int i_370_ = anInt7381 - anInt7406;
	int i_371_ = anInt7407 - anInt7408;
	if (anInt7381 < anInt7370)
	    i_370_++;
	if (anInt7407 < anInt7371)
	    i_371_++;
	int i_372_ = anInt7406 / 64;
	int i_373_ = anInt7408 / 64;
	int i_374_ = (anInt7406 + i_370_) / 64;
	int i_375_ = (anInt7408 + i_371_) / 64;
	int i_376_;
	int i_377_;
	if (bool_369_) {
	    i_376_ = (anInt7412 - anInt7410) / ((anInt7381 - anInt7406) / 64);
	    i_377_ = i_376_;
	} else {
	    i_376_ = method9137();
	    i_377_ = (int) Math.ceil((double) (64.0F * aFloat7364 / 2.0F));
	}
	anArrayList7396.clear();
	int i_378_ = 0;
	int i_379_ = i_376_ * i_376_;
	for (int i_380_ = i_372_; i_380_ <= i_374_; i_380_++) {
	    for (int i_381_ = i_373_; i_381_ <= i_375_; i_381_++) {
		int i_382_ = (i_380_ << 16) + i_381_;
		int i_383_ = method9211((long) i_382_);
		if (i_383_ != i_376_) {
		    if (i_380_ < 0 || i_380_ * 64 >= anInt7370 || i_381_ < 0
			|| i_381_ * 64 >= anInt7371)
			method9127(class185, i_380_, i_381_, i_376_, i_382_);
		    else if (i_383_ == -1) {
			method9213(i_380_, i_381_, i_376_, i_382_, bool,
				   bool_364_, bool_368_, class185);
			i_378_ += i_379_;
		    } else
			anArrayList7396.add(Integer.valueOf(i_382_));
		}
	    }
	}
	if (!anArrayList7396.isEmpty() && i_378_ < anInt7395) {
	    for (Iterator iterator = anArrayList7396.iterator();
		 i_378_ < anInt7395 && iterator.hasNext(); i_378_ += i_379_) {
		int i_384_ = ((Integer) iterator.next()).intValue();
		int i_385_ = i_384_ >> 16 & 0xffff;
		int i_386_ = i_384_ & 0xffff;
		method9213(i_385_, i_386_, i_376_, i_384_, bool, bool_364_,
			   bool_368_, class185);
	    }
	}
	for (int i_387_ = i_372_; i_387_ <= i_374_; i_387_++) {
	    int i_388_ = i_387_ * 64;
	    int i_389_ = i_388_ - anInt7406;
	    int i_390_ = i_377_;
	    int i_391_ = (i_366_ + i * i_389_ >> 16) + anInt7410;
	    int i_392_ = (i_366_ + i * (i_389_ + 64) >> 16) + anInt7410;
	    if (i_391_ + i_390_ != i_392_)
		i_390_ = i_392_ - i_391_;
	    for (int i_393_ = i_373_; i_393_ <= i_375_; i_393_++) {
		int i_394_ = i_393_ * 64;
		int i_395_ = i_394_ - anInt7408;
		int i_396_ = (i_387_ << 16) + i_393_;
		int i_397_ = i_377_;
		int i_398_ = anInt7378 - (i_367_ + i_365_ * i_395_ >> 16);
		int i_399_
		    = anInt7378 - (i_367_ + i_365_ * (i_395_ + 64) >> 16);
		if (i_398_ - i_397_ != i_399_)
		    i_397_ = i_398_ - i_399_;
		i_398_ -= i_397_;
		Class163 class163
		    = (Class163) aClass203_7375.method3871((long) i_396_);
		if (class163 == null)
		    throw new RuntimeException();
		if (class163.method2647() == i_390_
		    && class163.method2649() == i_397_)
		    class163.method2656(i_391_, i_398_);
		else
		    class163.method2659(i_391_, i_398_, i_390_, i_397_);
	    }
	}
    }
    
    static void method9155(short[] is, byte[] is_400_, short[] is_401_, int i,
			   int i_402_) {
	int[] is_403_ = new int[anInt7371];
	int[] is_404_ = new int[anInt7371];
	int[] is_405_ = new int[anInt7371];
	int[] is_406_ = new int[anInt7371];
	int[] is_407_ = new int[anInt7371];
	for (int i_408_ = -5; i_408_ < anInt7370; i_408_++) {
	    int i_409_ = i_408_ + 5;
	    int i_410_ = i_408_ - 5;
	    for (int i_411_ = 0; i_411_ < anInt7371; i_411_++) {
		if (i_409_ < anInt7370) {
		    short i_412_ = is[i_409_ + i_411_ * anInt7370];
		    if (i_412_ > 0) {
			Class1 class1
			    = (Class1) anInterface14_7350.method91(i_412_ - 1,
								   636052634);
			is_403_[i_411_] += class1.anInt11 * 1782063805;
			is_404_[i_411_] += class1.anInt14 * 1312863965;
			is_405_[i_411_] += class1.anInt16 * 1484599057;
			is_406_[i_411_] += class1.anInt17 * -1721639561;
			is_407_[i_411_]++;
		    }
		}
		if (i_410_ >= 0) {
		    short i_413_ = is[i_410_ + i_411_ * anInt7370];
		    if (i_413_ > 0) {
			Class1 class1
			    = ((Class1)
			       anInterface14_7350.method91(i_413_ - 1,
							   -2031194610));
			is_403_[i_411_] -= class1.anInt11 * 1782063805;
			is_404_[i_411_] -= class1.anInt14 * 1312863965;
			is_405_[i_411_] -= class1.anInt16 * 1484599057;
			is_406_[i_411_] -= class1.anInt17 * -1721639561;
			is_407_[i_411_]--;
		    }
		}
	    }
	    if (i_408_ >= 0) {
		int i_414_ = 0;
		int i_415_ = 0;
		int i_416_ = 0;
		int i_417_ = 0;
		int i_418_ = 0;
		for (int i_419_ = -5; i_419_ < anInt7371; i_419_++) {
		    int i_420_ = i_419_ + 5;
		    if (i_420_ < anInt7371) {
			i_414_ += is_403_[i_420_];
			i_415_ += is_404_[i_420_];
			i_416_ += is_405_[i_420_];
			i_417_ += is_406_[i_420_];
			i_418_ += is_407_[i_420_];
		    }
		    int i_421_ = i_419_ - 5;
		    if (i_421_ >= 0) {
			i_414_ -= is_403_[i_421_];
			i_415_ -= is_404_[i_421_];
			i_416_ -= is_405_[i_421_];
			i_417_ -= is_406_[i_421_];
			i_418_ -= is_407_[i_421_];
		    }
		    if (i_419_ >= 0 && i_418_ > 0) {
			if (is[i_408_ + i_419_ * anInt7370] == 0) {
			    int i_422_ = i_408_ + i_419_ * anInt7370;
			    is_400_[i_422_] = (byte) 0;
			    is_401_[i_422_] = (short) 0;
			} else {
			    int i_423_
				= (i_417_ == 0 ? 0
				   : (Class200_Sub23.method15662
				      (i_414_ * 256 / i_417_, i_415_ / i_418_,
				       i_416_ / i_418_, (byte) -4)));
			    int i_424_ = (i_423_ & 0x7f) + i_402_;
			    if (i_424_ < 0)
				i_424_ = 0;
			    else if (i_424_ > 127)
				i_424_ = 127;
			    int i_425_ = ((i_423_ + i & 0xfc00)
					  + (i_423_ & 0x380) + i_424_);
			    int i_426_ = i_408_ + i_419_ * anInt7370;
			    int i_427_ = (Class415.anIntArray4666
					  [(Class315.method5705
					    (Class68.method1387(i_425_, 96,
								-594566673),
					     1748370349)) & 0xffff]);
			    is_400_[i_426_] = (byte) (i_427_ >> 16 & 0xff);
			    is_401_[i_426_] = (short) (i_427_ & 0xffff);
			}
		    }
		}
	    }
	}
    }
    
    public static void method9156
	(Class472 class472, Class472 class472_428_,
	 Class44_Sub16 class44_sub16, Class44_Sub12 class44_sub12,
	 Class44_Sub13 class44_sub13, Class44_Sub9 class44_sub9,
	 Class44_Sub18 class44_sub18, Interface18 interface18,
	 Interface20 interface20) {
	aClass472_7397 = class472;
	aClass472_7365 = class472_428_;
	anInterface14_7415 = class44_sub16;
	anInterface14_7350 = class44_sub12;
	aClass44_Sub13_7348 = class44_sub13;
	aClass44_Sub9_7349 = class44_sub9;
	aClass44_Sub18_7416 = class44_sub18;
	anInterface18_7352 = interface18;
	anInterface20_7351 = interface20;
	aClass9_7372.method578((byte) -6);
	int[] is
	    = aClass472_7397.method7678(Class650.aClass650_8460.method93(),
					(byte) 72);
	if (is != null) {
	    for (int i = 0; i < is.length; i++) {
		Class534_Sub18_Sub9 class534_sub18_sub9
		    = Class312_Sub1.method15646(aClass472_7397, is[i],
						-1285707634);
		aClass9_7372.method581(class534_sub18_sub9,
				       (long) (class534_sub18_sub9.anInt11766
					       * 848546455));
	    }
	}
	Class456.method7426(true, false, 1739452007);
    }
    
    public static Class534_Sub18_Sub9 method9157(int i, int i_429_) {
	for (Class534_Sub18_Sub9 class534_sub18_sub9
		 = (Class534_Sub18_Sub9) aClass9_7372.method583(-1750241211);
	     class534_sub18_sub9 != null;
	     class534_sub18_sub9
		 = (Class534_Sub18_Sub9) aClass9_7372.method584((byte) -108)) {
	    if (class534_sub18_sub9.aBool11762
		&& class534_sub18_sub9.method18261(i, i_429_, 523681216))
		return class534_sub18_sub9;
	}
	return null;
    }
    
    public static Class534_Sub18_Sub9 method9158(int i) {
	return (Class534_Sub18_Sub9) aClass9_7372.method579((long) i);
    }
    
    public static Class696 method9159(int i, int i_430_) {
	Class696 class696 = new Class696();
	for (Class534_Sub18_Sub9 class534_sub18_sub9
		 = (Class534_Sub18_Sub9) aClass9_7372.method583(-1874103349);
	     class534_sub18_sub9 != null;
	     class534_sub18_sub9
		 = (Class534_Sub18_Sub9) aClass9_7372.method584((byte) -32)) {
	    if (class534_sub18_sub9.aBool11762
		&& class534_sub18_sub9.method18261(i, i_430_, -625958094))
		class696.method14076(class534_sub18_sub9, (byte) 113);
	}
	return class696;
    }
    
    static void method9160(Class177 class177, int i, int i_431_) {
	for (int i_432_ = 0; i_432_ < anInterface14_7415.method90((byte) 105);
	     i_432_++)
	    anIntArray7347[i_432_ + 1]
		= method9171(class177, i_432_, i, i_431_);
    }
    
    static void method9161(Class177 class177, int i, int i_433_) {
	for (int i_434_ = 0; i_434_ < anInterface14_7415.method90((byte) 40);
	     i_434_++)
	    anIntArray7347[i_434_ + 1]
		= method9171(class177, i_434_, i, i_433_);
    }
    
    static void method9162(Class177 class177, int i, int i_435_) {
	for (int i_436_ = 0; i_436_ < anInterface14_7415.method90((byte) 7);
	     i_436_++)
	    anIntArray7347[i_436_ + 1]
		= method9171(class177, i_436_, i, i_435_);
    }
    
    static void method9163(Class177 class177, int i, int i_437_) {
	for (int i_438_ = 0; i_438_ < anInterface14_7415.method90((byte) 41);
	     i_438_++)
	    anIntArray7347[i_438_ + 1]
		= method9171(class177, i_438_, i, i_437_);
    }
    
    static Class700 method9164(Class185 class185) {
	int i = anInt7381 - anInt7406;
	int i_439_ = anInt7407 - anInt7408;
	int i_440_ = (anInt7412 - anInt7410 << 16) / i;
	int i_441_ = (anInt7378 - anInt7411 << 16) / i_439_;
	return method9133(class185, i_440_, i_441_, 0, 0);
    }
    
    static int method9165(Class177 class177, int i, int i_442_, int i_443_) {
	return method9126(anInterface14_7415, class177, i, i_442_, i_443_);
    }
    
    static int method9166(Class177 class177, int i, int i_444_, int i_445_) {
	return method9126(anInterface14_7415, class177, i, i_444_, i_445_);
    }
    
    static void method9167(int[] is, int i, int i_446_, int i_447_, int i_448_,
			   int i_449_, int i_450_) {
	for (int i_451_ = 0; i_451_ < aClass622_7353.anInt8143 * -1255575643;
	     i_451_++) {
	    int i_452_ = i_451_;
	    if (i_450_ == anInt7362 || i_450_ == anInt7386)
		i_452_ = aClass622_7353.anInt8143 * -1255575643 - i_451_ - 1;
	    for (int i_453_ = 0;
		 i_453_ < aClass622_7353.anInt8143 * -1255575643; i_453_++) {
		int i_454_ = i_453_;
		if (i_450_ == anInt7386 || i_450_ == anInt7403)
		    i_454_
			= aClass622_7353.anInt8143 * -1255575643 - i_453_ - 1;
		int i_455_ = anIntArrayArray7346[i_452_][i_454_];
		if (i_455_ != 0) {
		    if (i_455_ == 1) {
			int i_456_
			    = is[((i_447_ - i_446_ - i_453_ - 1) * i_447_ + i
				  + i_451_)];
			if (i_456_ != anInt7414) {
			    anInt7414 = i_456_;
			    anInt7360
				= (~0xffffff
				   | ((((aClass622_7353.anInt8127 * -962787217
					 & 0xff00ff) * i_448_
					+ (i_456_ & 0xff00ff) * i_449_)
				       & ~0xff00ff)
				      + ((((aClass622_7353.anInt8127
					    * -962787217)
					   & 0xff00) * i_448_
					  + (i_456_ & 0xff00) * i_449_)
					 & 0xff0000)) >> 8);
			}
			is[((i_447_ - i_446_ - i_453_ - 1) * i_447_ + i
			    + i_451_)]
			    = anInt7360;
		    } else if (i_455_ == 2)
			is[((i_447_ - i_446_ - i_453_ - 1) * i_447_ + i
			    + i_451_)]
			    = aClass622_7353.anInt8141 * 1156690091;
		}
	    }
	}
    }
    
    static void method9168(int[] is, int i, int i_457_, int i_458_, int i_459_,
			   int i_460_, int i_461_, int i_462_) {
	for (int i_463_ = i; i_463_ <= i_457_; i_463_++) {
	    for (int i_464_ = i_458_; i_464_ <= i_459_; i_464_++)
		is[(i_461_ - i_464_ - 1) * i_460_ + i_463_] = i_462_;
	}
    }
    
    static int method9169(Interface14 interface14, Class177 class177, int i,
			  int i_465_, int i_466_) {
	Class651 class651 = (Class651) interface14.method91(i, 933163868);
	if (class651 == null)
	    return 0;
	int i_467_ = class651.anInt8468 * 1884378951;
	if (i_467_ >= 0 && class177.method2931(i_467_, (byte) 1).aBool2072)
	    i_467_ = -1;
	int i_468_;
	if (class651.anInt8470 * 33386845 >= 0) {
	    int i_469_ = class651.anInt8470 * 33386845;
	    int i_470_ = (i_469_ & 0x7f) + i_466_;
	    if (i_470_ < 0)
		i_470_ = 0;
	    else if (i_470_ > 127)
		i_470_ = 127;
	    int i_471_
		= (i_469_ + i_465_ & 0xfc00) + (i_469_ & 0x380) + i_470_;
	    i_468_ = ~0xffffff | (Class415.anIntArray4666
				  [(Class315.method5705
				    (Class44_Sub11.method17348(i_471_, 96,
							       -2003577549),
				     -95738546)) & 0xffff]);
	} else if (i_467_ >= 0)
	    i_468_
		= ~0xffffff | (Class415.anIntArray4666
			       [Class315.method5705((Class44_Sub11.method17348
						     ((class177.method2931
						       (i_467_, (byte) 1)
						       .aShort2060),
						      96, -1829638262)),
						    1080737792) & 0xffff]);
	else if (class651.anInt8467 * -2044484027 == -1)
	    i_468_ = 0;
	else {
	    int i_472_ = class651.anInt8467 * -2044484027;
	    int i_473_ = (i_472_ & 0x7f) + i_466_;
	    if (i_473_ < 0)
		i_473_ = 0;
	    else if (i_473_ > 127)
		i_473_ = 127;
	    int i_474_
		= (i_472_ + i_465_ & 0xfc00) + (i_472_ & 0x380) + i_473_;
	    i_468_ = ~0xffffff | (Class415.anIntArray4666
				  [(Class315.method5705
				    (Class44_Sub11.method17348(i_474_, 96,
							       -2072589687),
				     1508082564)) & 0xffff]);
	}
	return i_468_;
    }
    
    static int method9170(Interface14 interface14, Class177 class177, int i,
			  int i_475_, int i_476_) {
	Class651 class651 = (Class651) interface14.method91(i, -1722029091);
	if (class651 == null)
	    return 0;
	int i_477_ = class651.anInt8468 * 1884378951;
	if (i_477_ >= 0 && class177.method2931(i_477_, (byte) 1).aBool2072)
	    i_477_ = -1;
	int i_478_;
	if (class651.anInt8470 * 33386845 >= 0) {
	    int i_479_ = class651.anInt8470 * 33386845;
	    int i_480_ = (i_479_ & 0x7f) + i_476_;
	    if (i_480_ < 0)
		i_480_ = 0;
	    else if (i_480_ > 127)
		i_480_ = 127;
	    int i_481_
		= (i_479_ + i_475_ & 0xfc00) + (i_479_ & 0x380) + i_480_;
	    i_478_ = ~0xffffff | (Class415.anIntArray4666
				  [(Class315.method5705
				    (Class44_Sub11.method17348(i_481_, 96,
							       -2032556887),
				     540814232)) & 0xffff]);
	} else if (i_477_ >= 0)
	    i_478_
		= ~0xffffff | (Class415.anIntArray4666
			       [Class315.method5705((Class44_Sub11.method17348
						     ((class177.method2931
						       (i_477_, (byte) 1)
						       .aShort2060),
						      96, -2019089549)),
						    519985018) & 0xffff]);
	else if (class651.anInt8467 * -2044484027 == -1)
	    i_478_ = 0;
	else {
	    int i_482_ = class651.anInt8467 * -2044484027;
	    int i_483_ = (i_482_ & 0x7f) + i_476_;
	    if (i_483_ < 0)
		i_483_ = 0;
	    else if (i_483_ > 127)
		i_483_ = 127;
	    int i_484_
		= (i_482_ + i_475_ & 0xfc00) + (i_482_ & 0x380) + i_483_;
	    i_478_ = ~0xffffff | (Class415.anIntArray4666
				  [(Class315.method5705
				    (Class44_Sub11.method17348(i_484_, 96,
							       -2141993972),
				     776748688)) & 0xffff]);
	}
	return i_478_;
    }
    
    static int method9171(Class177 class177, int i, int i_485_, int i_486_) {
	return method9126(anInterface14_7415, class177, i, i_485_, i_486_);
    }
    
    static void method9172(Class185 class185, Class534_Sub40 class534_sub40,
			   int i, int i_487_, int i_488_, int i_489_, int[] is,
			   int[] is_490_) {
	int i_491_ = class534_sub40.method16527(556818518);
	if ((i_491_ & 0x1) == 0) {
	    boolean bool = (i_491_ & 0x2) == 0;
	    int i_492_ = i_491_ >> 2 & 0x3f;
	    if (i_492_ != 62) {
		if (i_492_ == 63)
		    i_492_ = class534_sub40.method16546(-1706829710);
		else if (bool)
		    i_492_ = is[i_492_];
		else
		    i_492_ = is_490_[i_492_];
		if (bool) {
		    aShortArray7373[i_488_ + i_489_ * anInt7370]
			= (short) i_492_;
		    aShortArray7376[i_488_ + i_489_ * anInt7370] = (short) 0;
		} else {
		    aShortArray7376[i_488_ + i_489_ * anInt7370]
			= (short) i_492_;
		    aByteArray7377[i_488_ + i_489_ * anInt7370] = (byte) 0;
		    aShortArray7373[i_488_ + i_489_ * anInt7370]
			= (short) class534_sub40.method16546(-1706829710);
		}
	    }
	} else {
	    int i_493_ = (i_491_ >> 1 & 0x3) + 1;
	    boolean bool = (i_491_ & 0x8) != 0;
	    boolean bool_494_ = (i_491_ & 0x10) != 0;
	    for (int i_495_ = 0; i_495_ < i_493_; i_495_++) {
		int i_496_ = class534_sub40.method16546(-1706829710);
		int i_497_ = 0;
		int i_498_ = 0;
		if (bool) {
		    i_497_ = class534_sub40.method16546(-1706829710);
		    i_498_ = class534_sub40.method16527(696169137);
		}
		int i_499_ = 0;
		if (bool_494_)
		    i_499_ = class534_sub40.method16527(1997453636);
		if (i_495_ == 0) {
		    aShortArray7373[i_488_ + i_489_ * anInt7370]
			= (short) i_496_;
		    aShortArray7376[i_488_ + i_489_ * anInt7370]
			= (short) i_497_;
		    aByteArray7377[i_488_ + i_489_ * anInt7370]
			= (byte) i_498_;
		    if (i_499_ == 1) {
			anObjectArray7367[i_488_ + i_489_ * anInt7370]
			    = new Integer(class534_sub40
					      .method16550((byte) -28));
			aByteArray7379[i_488_ + i_489_ * anInt7370]
			    = class534_sub40.method16586((byte) 1);
		    } else if (i_499_ > 1) {
			int[] is_500_ = new int[i_499_];
			byte[] is_501_ = new byte[i_499_];
			for (int i_502_ = 0; i_502_ < i_499_; i_502_++) {
			    is_500_[i_502_]
				= class534_sub40.method16550((byte) 41);
			    is_501_[i_502_]
				= class534_sub40.method16586((byte) 1);
			}
			anObjectArray7367[i_488_ + i_489_ * anInt7370]
			    = new Class534_Sub38(is_500_, is_501_);
		    }
		} else {
		    int[] is_503_ = null;
		    byte[] is_504_ = null;
		    if (i_499_ > 0) {
			is_503_ = new int[i_499_];
			is_504_ = new byte[i_499_];
			for (int i_505_ = 0; i_505_ < i_499_; i_505_++) {
			    is_503_[i_505_]
				= class534_sub40.method16550((byte) -15);
			    is_504_[i_505_]
				= class534_sub40.method16586((byte) 1);
			}
		    }
		    if ((aHashMapArrayArrayArray7391[i_495_ - 1]
			 [i - (anInt7368 >> 6)][i_487_ - (anInt7369 >> 6)])
			== null)
			aHashMapArrayArrayArray7391[i_495_ - 1]
			    [i - (anInt7368 >> 6)][i_487_ - (anInt7369 >> 6)]
			    = new HashMap();
		    int i_506_ = ((i_488_ & 0x3f) << 8) + (i_489_ & 0x3f);
		    Class541 class541
			= new Class541(i_488_ & 0x3f, i_489_ & 0x3f, i_496_,
				       i_497_, i_498_, is_503_, is_504_);
		    aHashMapArrayArrayArray7391[i_495_ - 1]
			[i - (anInt7368 >> 6)][i_487_ - (anInt7369 >> 6)]
			.put(Integer.valueOf(i_506_), class541);
		}
	    }
	}
    }
    
    static void method9173(int[] is, int i, int i_507_, int i_508_, int i_509_,
			   int i_510_, boolean bool, int i_511_, int i_512_,
			   int i_513_, int[] is_514_, byte[] is_515_,
			   boolean bool_516_) {
	if (bool_516_ || i_511_ != 0 || i_512_ > 0) {
	    if (i_512_ == 0)
		method9139(is, i, i_507_, i_508_, i_509_, i_510_, i_510_,
			   i_511_ | ~0xffffff);
	    else {
		int i_517_ = i_513_ & 0x3f;
		if (i_517_ == 0 || anInt7394 == 0) {
		    int i_518_ = anIntArray7347[i_512_];
		    if (bool_516_ || i_518_ != 0)
			method9139(is, i, i_507_, i_508_, i_509_, i_510_,
				   i_510_, i_518_ | ~0xffffff);
		} else {
		    int i_519_ = bool_516_ ? 0 : 1;
		    int i_520_ = Class200.method3852(i_513_ >> 6 & 0x3, i_517_,
						     812713951);
		    i_517_ = Class415.method6740(i_517_, 154635170);
		    method9144(is, i, i_507_, i_508_, i_509_, i_510_, i_510_,
			       i_511_, anIntArray7347[i_512_],
			       aByteArrayArrayArray7388[i_517_ - 1][i_520_],
			       anInt7394, i_519_);
		}
	    }
	}
	if (bool && is_514_ != null) {
	    int i_521_ = i_507_ - i + 1;
	    int i_522_ = i_509_ - i_508_ + 1;
	    for (int i_523_ = 0; i_523_ < is_514_.length; i_523_++) {
		int i_524_ = is_515_[i_523_] & 0x3f;
		if (i_524_ == Class595.aClass595_7851.anInt7852 * 847393323
		    || i_524_ == Class595.aClass595_7829.anInt7852 * 847393323
		    || i_524_ == Class595.aClass595_7832.anInt7852 * 847393323
		    || (i_524_
			== Class595.aClass595_7833.anInt7852 * 847393323)) {
		    Class602 class602
			= ((Class602)
			   aClass44_Sub13_7348.method91(is_514_[i_523_],
							1212111611));
		    if (class602.anInt7890 * 350336715 == -1) {
			int i_525_ = -3355444;
			if (class602.anInt7907 * -2134171963 == 1)
			    i_525_ = -3407872;
			int i_526_ = is_515_[i_523_] >> 6 & 0x3;
			if (i_524_
			    == Class595.aClass595_7851.anInt7852 * 847393323) {
			    if (i_526_ == 0)
				method9131(is, i, i_509_, i_522_, i_510_,
					   i_525_);
			    else if (i_526_ == 1)
				method9145(is, i, i_509_, i_521_, i_510_,
					   i_525_);
			    else if (i_526_ == 2)
				method9131(is, i_507_, i_509_, i_522_, i_510_,
					   i_525_);
			    else
				method9145(is, i, i_508_, i_521_, i_510_,
					   i_525_);
			} else if (i_524_ == (Class595.aClass595_7829.anInt7852
					      * 847393323)) {
			    if (i_526_ == 0) {
				method9131(is, i, i_509_, i_522_, i_510_, -1);
				method9145(is, i, i_509_, i_521_, i_510_,
					   i_525_);
			    } else if (i_526_ == 1) {
				method9131(is, i_507_, i_509_, i_522_, i_510_,
					   -1);
				method9145(is, i, i_509_, i_521_, i_510_,
					   i_525_);
			    } else if (i_526_ == 2) {
				method9131(is, i_507_, i_509_, i_522_, i_510_,
					   -1);
				method9145(is, i, i_508_, i_521_, i_510_,
					   i_525_);
			    } else {
				method9131(is, i, i_509_, i_522_, i_510_, -1);
				method9145(is, i, i_508_, i_521_, i_510_,
					   i_525_);
			    }
			} else if (i_524_ == (Class595.aClass595_7832.anInt7852
					      * 847393323)) {
			    if (i_526_ == 0)
				method9145(is, i, i_509_, 1, i_510_, i_525_);
			    else if (i_526_ == 1)
				method9145(is, i_507_, i_509_, 1, i_510_,
					   i_525_);
			    else if (i_526_ == 2)
				method9145(is, i_507_, i_508_, 1, i_510_,
					   i_525_);
			    else
				method9145(is, i, i_508_, 1, i_510_, i_525_);
			} else if (i_524_ == (Class595.aClass595_7833.anInt7852
					      * 847393323)) {
			    if (i_526_ == 0 || i_526_ == 2) {
				for (int i_527_ = 0; i_527_ < i_522_; i_527_++)
				    method9145(is, i + i_527_, i_508_ + i_527_,
					       1, i_510_, i_525_);
			    } else {
				for (int i_528_ = 0; i_528_ < i_522_; i_528_++)
				    method9145(is, i + i_528_, i_509_ - i_528_,
					       1, i_510_, i_525_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    static boolean method9174(Class534_Sub18_Sub9 class534_sub18_sub9) {
	if (class534_sub18_sub9 != null
	    && class534_sub18_sub9 != aClass534_Sub18_Sub9_7354) {
	    aClass534_Sub18_Sub9_7354 = class534_sub18_sub9;
	    aBool7380 = (aClass534_Sub18_Sub9_7354.anInt11766 * 848546455
			 == aClass622_7353.anInt8138 * -359981155);
	    return true;
	}
	return false;
    }
    
    static void method9175() {
	int[] is = new int[3];
	for (int i = 0; i < aClass523_7366.anInt7086 * -942354647; i++) {
	    boolean bool = (aClass534_Sub18_Sub9_7354.method18260
			    (aClass523_7366.anIntArray7085[i] >> 28 & 0x3,
			     aClass523_7366.anIntArray7085[i] >> 14 & 0x3fff,
			     aClass523_7366.anIntArray7085[i] & 0x3fff, is,
			     -743605079));
	    if (bool) {
		Class534_Sub29 class534_sub29
		    = new Class534_Sub29(aClass523_7366.anIntArray7084[i]);
		class534_sub29.anInt10655 = (is[1] - anInt7368) * -833592845;
		class534_sub29.anInt10653 = (is[2] - anInt7369) * -1714674331;
		aClass700_7413.method14131(class534_sub29, (short) 789);
	    }
	}
    }
    
    static void method9176() {
	int[] is = new int[3];
	for (int i = 0; i < aClass523_7366.anInt7086 * -942354647; i++) {
	    boolean bool
		= (aClass534_Sub18_Sub9_7354.method18260
		   (aClass523_7366.anIntArray7085[i] >> 28 & 0x3,
		    aClass523_7366.anIntArray7085[i] >> 14 & 0x3fff,
		    aClass523_7366.anIntArray7085[i] & 0x3fff, is, 469912698));
	    if (bool) {
		Class534_Sub29 class534_sub29
		    = new Class534_Sub29(aClass523_7366.anIntArray7084[i]);
		class534_sub29.anInt10655 = (is[1] - anInt7368) * -833592845;
		class534_sub29.anInt10653 = (is[2] - anInt7369) * -1714674331;
		aClass700_7413.method14131(class534_sub29, (short) 789);
	    }
	}
    }
    
    static void method9177(short[] is, byte[] is_529_, short[] is_530_, int i,
			   int i_531_) {
	int[] is_532_ = new int[anInt7371];
	int[] is_533_ = new int[anInt7371];
	int[] is_534_ = new int[anInt7371];
	int[] is_535_ = new int[anInt7371];
	int[] is_536_ = new int[anInt7371];
	for (int i_537_ = -5; i_537_ < anInt7370; i_537_++) {
	    int i_538_ = i_537_ + 5;
	    int i_539_ = i_537_ - 5;
	    for (int i_540_ = 0; i_540_ < anInt7371; i_540_++) {
		if (i_538_ < anInt7370) {
		    short i_541_ = is[i_538_ + i_540_ * anInt7370];
		    if (i_541_ > 0) {
			Class1 class1
			    = (Class1) anInterface14_7350.method91(i_541_ - 1,
								   1141421103);
			is_532_[i_540_] += class1.anInt11 * 1782063805;
			is_533_[i_540_] += class1.anInt14 * 1312863965;
			is_534_[i_540_] += class1.anInt16 * 1484599057;
			is_535_[i_540_] += class1.anInt17 * -1721639561;
			is_536_[i_540_]++;
		    }
		}
		if (i_539_ >= 0) {
		    short i_542_ = is[i_539_ + i_540_ * anInt7370];
		    if (i_542_ > 0) {
			Class1 class1
			    = ((Class1)
			       anInterface14_7350.method91(i_542_ - 1,
							   -1933307853));
			is_532_[i_540_] -= class1.anInt11 * 1782063805;
			is_533_[i_540_] -= class1.anInt14 * 1312863965;
			is_534_[i_540_] -= class1.anInt16 * 1484599057;
			is_535_[i_540_] -= class1.anInt17 * -1721639561;
			is_536_[i_540_]--;
		    }
		}
	    }
	    if (i_537_ >= 0) {
		int i_543_ = 0;
		int i_544_ = 0;
		int i_545_ = 0;
		int i_546_ = 0;
		int i_547_ = 0;
		for (int i_548_ = -5; i_548_ < anInt7371; i_548_++) {
		    int i_549_ = i_548_ + 5;
		    if (i_549_ < anInt7371) {
			i_543_ += is_532_[i_549_];
			i_544_ += is_533_[i_549_];
			i_545_ += is_534_[i_549_];
			i_546_ += is_535_[i_549_];
			i_547_ += is_536_[i_549_];
		    }
		    int i_550_ = i_548_ - 5;
		    if (i_550_ >= 0) {
			i_543_ -= is_532_[i_550_];
			i_544_ -= is_533_[i_550_];
			i_545_ -= is_534_[i_550_];
			i_546_ -= is_535_[i_550_];
			i_547_ -= is_536_[i_550_];
		    }
		    if (i_548_ >= 0 && i_547_ > 0) {
			if (is[i_537_ + i_548_ * anInt7370] == 0) {
			    int i_551_ = i_537_ + i_548_ * anInt7370;
			    is_529_[i_551_] = (byte) 0;
			    is_530_[i_551_] = (short) 0;
			} else {
			    int i_552_
				= (i_546_ == 0 ? 0
				   : (Class200_Sub23.method15662
				      (i_543_ * 256 / i_546_, i_544_ / i_547_,
				       i_545_ / i_547_, (byte) -34)));
			    int i_553_ = (i_552_ & 0x7f) + i_531_;
			    if (i_553_ < 0)
				i_553_ = 0;
			    else if (i_553_ > 127)
				i_553_ = 127;
			    int i_554_ = ((i_552_ + i & 0xfc00)
					  + (i_552_ & 0x380) + i_553_);
			    int i_555_ = i_537_ + i_548_ * anInt7370;
			    int i_556_ = (Class415.anIntArray4666
					  [(Class315.method5705
					    (Class68.method1387(i_554_, 96,
								-594566673),
					     811725009)) & 0xffff]);
			    is_529_[i_555_] = (byte) (i_556_ >> 16 & 0xff);
			    is_530_[i_555_] = (short) (i_556_ & 0xffff);
			}
		    }
		}
	    }
	}
    }
    
    static void method9178(int i, int i_557_, int i_558_, int i_559_,
			   int i_560_, int i_561_, int i_562_, int i_563_) {
	anInt7406 = i - anInt7368;
	anInt7407 = i_557_ - anInt7369;
	anInt7381 = i_558_ - anInt7368;
	anInt7408 = i_559_ - anInt7369;
	anInt7410 = i_560_;
	anInt7411 = i_561_;
	anInt7412 = i_562_;
	anInt7378 = i_563_;
    }
    
    static void method9179(Class185 class185, boolean bool, boolean bool_564_,
			   boolean bool_565_, boolean bool_566_) {
	int i = anInt7381 - anInt7406;
	int i_567_ = anInt7407 - anInt7408;
	int i_568_ = (anInt7412 - anInt7410 << 16) / i;
	int i_569_ = (anInt7378 - anInt7411 << 16) / i_567_;
	method9154(class185, bool, bool_564_, i_568_, i_569_, 0, 0, bool_565_,
		   bool_566_);
    }
    
    static void method9180(int[] is, int i, int i_570_, int i_571_, int i_572_,
			   int i_573_, int i_574_, int i_575_, boolean bool,
			   boolean bool_576_, boolean bool_577_,
			   boolean bool_578_) {
	for (int i_579_ = i; i_579_ <= i_570_; i_579_++) {
	    boolean bool_580_
		= bool_576_ ? (aBoolArray7387[anInt7385]
			       && i_570_ - i_579_ < (aClass622_7353.anInt8142
						     * -1804667875)) : false;
	    boolean bool_581_
		= (bool_578_
		   ? (aBoolArray7387[anInt7356]
		      && i_579_ - i < aClass622_7353.anInt8142 * -1804667875)
		   : false);
	    for (int i_582_ = i_571_; i_582_ <= i_572_; i_582_++) {
		if (bool_580_ || bool_581_)
		    is[(i_573_ - i_582_ - 1) * i_573_ + i_579_]
			= aClass622_7353.anInt8141 * 1156690091;
		else {
		    boolean bool_583_
			= (bool
			   ? (aBoolArray7387[anInt7383]
			      && (i_572_ - i_582_
				  < aClass622_7353.anInt8142 * -1804667875))
			   : false);
		    boolean bool_584_
			= (bool_577_
			   ? (aBoolArray7387[anInt7361]
			      && (i_582_ - i_571_
				  < aClass622_7353.anInt8142 * -1804667875))
			   : false);
		    if (bool_583_ || bool_584_)
			is[(i_573_ - i_582_ - 1) * i_573_ + i_579_]
			    = aClass622_7353.anInt8141 * 1156690091;
		    else {
			int i_585_
			    = is[(i_573_ - i_582_ - 1) * i_573_ + i_579_];
			if (i_585_ != anInt7414) {
			    anInt7414 = i_585_;
			    anInt7360
				= (~0xffffff
				   | ((((aClass622_7353.anInt8127 * -962787217
					 & 0xff00ff) * i_574_
					+ (i_585_ & 0xff00ff) * i_575_)
				       & ~0xff00ff)
				      + ((((aClass622_7353.anInt8127
					    * -962787217)
					   & 0xff00) * i_574_
					  + (i_585_ & 0xff00) * i_575_)
					 & 0xff0000)) >> 8);
			}
			is[(i_573_ - i_582_ - 1) * i_573_ + i_579_]
			    = anInt7360;
		    }
		}
	    }
	}
    }
    
    static void method9181(Class185 class185, boolean bool, boolean bool_586_,
			   int i, int i_587_, int i_588_, int i_589_,
			   boolean bool_590_, boolean bool_591_) {
	int i_592_ = anInt7381 - anInt7406;
	int i_593_ = anInt7407 - anInt7408;
	if (anInt7381 < anInt7370)
	    i_592_++;
	if (anInt7407 < anInt7371)
	    i_593_++;
	int i_594_ = anInt7406 / 64;
	int i_595_ = anInt7408 / 64;
	int i_596_ = (anInt7406 + i_592_) / 64;
	int i_597_ = (anInt7408 + i_593_) / 64;
	int i_598_;
	int i_599_;
	if (bool_591_) {
	    i_598_ = (anInt7412 - anInt7410) / ((anInt7381 - anInt7406) / 64);
	    i_599_ = i_598_;
	} else {
	    i_598_ = method9137();
	    i_599_ = (int) Math.ceil((double) (64.0F * aFloat7364 / 2.0F));
	}
	anArrayList7396.clear();
	int i_600_ = 0;
	int i_601_ = i_598_ * i_598_;
	for (int i_602_ = i_594_; i_602_ <= i_596_; i_602_++) {
	    for (int i_603_ = i_595_; i_603_ <= i_597_; i_603_++) {
		int i_604_ = (i_602_ << 16) + i_603_;
		int i_605_ = method9211((long) i_604_);
		if (i_605_ != i_598_) {
		    if (i_602_ < 0 || i_602_ * 64 >= anInt7370 || i_603_ < 0
			|| i_603_ * 64 >= anInt7371)
			method9127(class185, i_602_, i_603_, i_598_, i_604_);
		    else if (i_605_ == -1) {
			method9213(i_602_, i_603_, i_598_, i_604_, bool,
				   bool_586_, bool_590_, class185);
			i_600_ += i_601_;
		    } else
			anArrayList7396.add(Integer.valueOf(i_604_));
		}
	    }
	}
	if (!anArrayList7396.isEmpty() && i_600_ < anInt7395) {
	    for (Iterator iterator = anArrayList7396.iterator();
		 i_600_ < anInt7395 && iterator.hasNext(); i_600_ += i_601_) {
		int i_606_ = ((Integer) iterator.next()).intValue();
		int i_607_ = i_606_ >> 16 & 0xffff;
		int i_608_ = i_606_ & 0xffff;
		method9213(i_607_, i_608_, i_598_, i_606_, bool, bool_586_,
			   bool_590_, class185);
	    }
	}
	for (int i_609_ = i_594_; i_609_ <= i_596_; i_609_++) {
	    int i_610_ = i_609_ * 64;
	    int i_611_ = i_610_ - anInt7406;
	    int i_612_ = i_599_;
	    int i_613_ = (i_588_ + i * i_611_ >> 16) + anInt7410;
	    int i_614_ = (i_588_ + i * (i_611_ + 64) >> 16) + anInt7410;
	    if (i_613_ + i_612_ != i_614_)
		i_612_ = i_614_ - i_613_;
	    for (int i_615_ = i_595_; i_615_ <= i_597_; i_615_++) {
		int i_616_ = i_615_ * 64;
		int i_617_ = i_616_ - anInt7408;
		int i_618_ = (i_609_ << 16) + i_615_;
		int i_619_ = i_599_;
		int i_620_ = anInt7378 - (i_589_ + i_587_ * i_617_ >> 16);
		int i_621_
		    = anInt7378 - (i_589_ + i_587_ * (i_617_ + 64) >> 16);
		if (i_620_ - i_619_ != i_621_)
		    i_619_ = i_620_ - i_621_;
		i_620_ -= i_619_;
		Class163 class163
		    = (Class163) aClass203_7375.method3871((long) i_618_);
		if (class163 == null)
		    throw new RuntimeException();
		if (class163.method2647() == i_612_
		    && class163.method2649() == i_619_)
		    class163.method2656(i_613_, i_620_);
		else
		    class163.method2659(i_613_, i_620_, i_612_, i_619_);
	    }
	}
    }
    
    static void method9182(Class185 class185, boolean bool, boolean bool_622_,
			   int i, int i_623_, int i_624_, int i_625_,
			   boolean bool_626_, boolean bool_627_) {
	int i_628_ = anInt7381 - anInt7406;
	int i_629_ = anInt7407 - anInt7408;
	if (anInt7381 < anInt7370)
	    i_628_++;
	if (anInt7407 < anInt7371)
	    i_629_++;
	int i_630_ = anInt7406 / 64;
	int i_631_ = anInt7408 / 64;
	int i_632_ = (anInt7406 + i_628_) / 64;
	int i_633_ = (anInt7408 + i_629_) / 64;
	int i_634_;
	int i_635_;
	if (bool_627_) {
	    i_634_ = (anInt7412 - anInt7410) / ((anInt7381 - anInt7406) / 64);
	    i_635_ = i_634_;
	} else {
	    i_634_ = method9137();
	    i_635_ = (int) Math.ceil((double) (64.0F * aFloat7364 / 2.0F));
	}
	anArrayList7396.clear();
	int i_636_ = 0;
	int i_637_ = i_634_ * i_634_;
	for (int i_638_ = i_630_; i_638_ <= i_632_; i_638_++) {
	    for (int i_639_ = i_631_; i_639_ <= i_633_; i_639_++) {
		int i_640_ = (i_638_ << 16) + i_639_;
		int i_641_ = method9211((long) i_640_);
		if (i_641_ != i_634_) {
		    if (i_638_ < 0 || i_638_ * 64 >= anInt7370 || i_639_ < 0
			|| i_639_ * 64 >= anInt7371)
			method9127(class185, i_638_, i_639_, i_634_, i_640_);
		    else if (i_641_ == -1) {
			method9213(i_638_, i_639_, i_634_, i_640_, bool,
				   bool_622_, bool_626_, class185);
			i_636_ += i_637_;
		    } else
			anArrayList7396.add(Integer.valueOf(i_640_));
		}
	    }
	}
	if (!anArrayList7396.isEmpty() && i_636_ < anInt7395) {
	    for (Iterator iterator = anArrayList7396.iterator();
		 i_636_ < anInt7395 && iterator.hasNext(); i_636_ += i_637_) {
		int i_642_ = ((Integer) iterator.next()).intValue();
		int i_643_ = i_642_ >> 16 & 0xffff;
		int i_644_ = i_642_ & 0xffff;
		method9213(i_643_, i_644_, i_634_, i_642_, bool, bool_622_,
			   bool_626_, class185);
	    }
	}
	for (int i_645_ = i_630_; i_645_ <= i_632_; i_645_++) {
	    int i_646_ = i_645_ * 64;
	    int i_647_ = i_646_ - anInt7406;
	    int i_648_ = i_635_;
	    int i_649_ = (i_624_ + i * i_647_ >> 16) + anInt7410;
	    int i_650_ = (i_624_ + i * (i_647_ + 64) >> 16) + anInt7410;
	    if (i_649_ + i_648_ != i_650_)
		i_648_ = i_650_ - i_649_;
	    for (int i_651_ = i_631_; i_651_ <= i_633_; i_651_++) {
		int i_652_ = i_651_ * 64;
		int i_653_ = i_652_ - anInt7408;
		int i_654_ = (i_645_ << 16) + i_651_;
		int i_655_ = i_635_;
		int i_656_ = anInt7378 - (i_625_ + i_623_ * i_653_ >> 16);
		int i_657_
		    = anInt7378 - (i_625_ + i_623_ * (i_653_ + 64) >> 16);
		if (i_656_ - i_655_ != i_657_)
		    i_655_ = i_656_ - i_657_;
		i_656_ -= i_655_;
		Class163 class163
		    = (Class163) aClass203_7375.method3871((long) i_654_);
		if (class163 == null)
		    throw new RuntimeException();
		if (class163.method2647() == i_648_
		    && class163.method2649() == i_655_)
		    class163.method2656(i_649_, i_656_);
		else
		    class163.method2659(i_649_, i_656_, i_648_, i_655_);
	    }
	}
    }
    
    static void method9183(Class185 class185, int i, int i_658_, int i_659_,
			   int i_660_) {
	Class163 class163 = (Class163) aClass203_7375.method3871(-1L);
	if (class163 == null || class163.method2647() != i_659_) {
	    int i_661_;
	    if (aClass534_Sub18_Sub9_7354.anInt11767 * 413186021 != -1)
		i_661_ = (~0xffffff
			  | aClass534_Sub18_Sub9_7354.anInt11767 * 413186021);
	    else
		i_661_ = -16777216;
	    if (anIntArray7398 == null
		|| anIntArray7398.length != i_659_ * i_659_)
		anIntArray7398 = new int[i_659_ * i_659_];
	    Arrays.fill(anIntArray7398, i_661_);
	    class163 = class185.method3316(anIntArray7398, 0, i_659_, i_659_,
					   i_659_, true);
	    aClass203_7375.method3893(class163, -1L);
	}
	aClass203_7375.method3893(class163, (long) i_660_);
    }
    
    static void method9184(int i, int i_662_, int i_663_, int i_664_,
			   boolean bool, boolean bool_665_, boolean bool_666_,
			   Class185 class185) {
	int i_667_ = i * 64;
	int i_668_ = i_662_ * 64;
	if (anIntArray7398 == null || anIntArray7398.length != i_663_ * i_663_)
	    anIntArray7398 = new int[i_663_ * i_663_];
	boolean bool_669_ = aBool7380 && !bool_666_;
	for (int i_670_ = 0; i_670_ < 64; i_670_++) {
	    int i_671_ = i_667_ + i_670_;
	    int i_672_ = i_670_ * i_663_ / 64;
	    int i_673_ = (i_670_ + 1) * i_663_ / 64 - 1;
	    if (i_673_ < i_672_)
		i_673_ = i_672_;
	    for (int i_674_ = 0; i_674_ < 64; i_674_++) {
		int i_675_ = i_668_ + i_674_;
		boolean bool_676_ = bool;
		if (bool_669_ && !method9193(i_671_, i_675_))
		    bool_676_ = false;
		int i_677_ = i_671_ + i_675_ * anInt7370;
		boolean bool_678_ = false;
		boolean bool_679_ = false;
		Object object = null;
		int i_680_ = ((aByteArray7374[i_677_] & 0xff) << 16
			      | aShortArray7357[i_677_] & 0xffff);
		if (i_680_ != 0)
		    i_680_ |= ~0xffffff;
		short i_681_ = aShortArray7376[i_677_];
		object = anObjectArray7367[i_677_];
		int i_682_ = i_674_ * i_663_ / 64;
		int i_683_ = (i_674_ + 1) * i_663_ / 64 - 1;
		if (i_683_ < i_682_)
		    i_683_ = i_682_;
		if (object != null) {
		    if (object instanceof Class534_Sub38) {
			Class534_Sub38 class534_sub38
			    = (Class534_Sub38) object;
			if (class534_sub38 != null)
			    method9129(anIntArray7398, i_672_, i_673_, i_682_,
				       i_683_, i_663_, bool_676_, i_680_,
				       i_681_, aByteArray7377[i_677_],
				       class534_sub38.anIntArray10806,
				       class534_sub38.aByteArray10805, true);
		    } else {
			Integer integer = (Integer) object;
			anIntArray7363[0] = integer.intValue();
			aByteArray7382[0] = aByteArray7379[i_677_];
			method9129(anIntArray7398, i_672_, i_673_, i_682_,
				   i_683_, i_663_, bool_676_, i_680_, i_681_,
				   aByteArray7377[i_677_], anIntArray7363,
				   aByteArray7382, true);
		    }
		} else
		    method9129(anIntArray7398, i_672_, i_673_, i_682_, i_683_,
			       i_663_, bool_676_, i_680_, i_681_,
			       aByteArray7377[i_677_], null, null, true);
	    }
	}
	if (bool_665_) {
	    for (int i_684_ = 0; i_684_ < 64; i_684_++) {
		int i_685_ = i_667_ + i_684_;
		boolean bool_686_ = i_684_ == 0 && i_685_ != 0;
		for (int i_687_ = 0; i_687_ < 64; i_687_++) {
		    int i_688_ = i_668_ + i_687_;
		    if (!bool_669_ || method9193(i_685_, i_688_)) {
			boolean bool_689_ = i_687_ == 0 && i_688_ != 0;
			int i_690_ = i_685_ + i_688_ * anInt7370;
			if (bool_686_ && bool_689_)
			    method9130(class185, anIntArray7398, i_663_, -1,
				       -1, i_685_ - 1, i_688_ - 1,
				       i_690_ - 1 - anInt7370);
			if (bool_686_)
			    method9130(class185, anIntArray7398, i_663_, -1,
				       i_687_, i_685_ - 1, i_688_, i_690_ - 1);
			if (bool_689_)
			    method9130(class185, anIntArray7398, i_663_,
				       i_684_, -1, i_685_, i_688_ - 1,
				       i_690_ - anInt7370);
			method9130(class185, anIntArray7398, i_663_, i_684_,
				   i_687_, i_685_, i_688_, i_690_);
		    }
		}
	    }
	}
	int i_691_ = i * 64 / 64;
	int i_692_ = i_662_ * 64 / 64;
	for (int i_693_ = 0; i_693_ < 3; i_693_++) {
	    for (int i_694_ = 0; i_694_ < 64; i_694_++) {
		int i_695_ = i_667_ + i_694_;
		int i_696_ = i_695_ & 0x3f;
		int i_697_ = i_694_ * i_663_ / 64;
		int i_698_ = (i_694_ + 1) * i_663_ / 64 - 1;
		if (i_698_ < i_697_)
		    i_698_ = i_697_;
		for (int i_699_ = 0; i_699_ < 64; i_699_++) {
		    int i_700_ = i_668_ + i_699_;
		    boolean bool_701_ = bool;
		    if (bool_669_ && !method9193(i_695_, i_700_))
			bool_701_ = false;
		    int i_702_ = i_700_ & 0x3f;
		    int i_703_ = i_699_ * i_663_ / 64;
		    int i_704_ = (i_699_ + 1) * i_663_ / 64 - 1;
		    if (i_704_ < i_703_)
			i_704_ = i_703_;
		    HashMap hashmap
			= aHashMapArrayArrayArray7391[i_693_][i_691_][i_692_];
		    if (hashmap != null) {
			Class541 class541
			    = ((Class541)
			       hashmap.get(Integer.valueOf((i_696_ << 8)
							   + i_702_)));
			if (class541 != null)
			    method9129(anIntArray7398, i_697_, i_698_, i_703_,
				       i_704_, i_663_, bool_701_,
				       class541.anInt7179, class541.aShort7178,
				       class541.aByte7180,
				       class541.anIntArray7175,
				       class541.aByteArray7181, false);
		    }
		}
	    }
	    for (int i_705_ = 0; i_705_ < 64; i_705_++) {
		int i_706_ = i_667_ + i_705_;
		int i_707_ = i_706_ & 0x3f;
		for (int i_708_ = 0; i_708_ < 64; i_708_++) {
		    int i_709_ = i_668_ + i_708_;
		    if (!bool_669_ || method9193(i_706_, i_709_)) {
			int i_710_ = i_709_ & 0x3f;
			HashMap hashmap = (aHashMapArrayArrayArray7391[i_693_]
					   [i_691_][i_692_]);
			if (hashmap != null) {
			    Class541 class541
				= ((Class541)
				   hashmap.get(Integer.valueOf((i_707_ << 8)
							       + i_710_)));
			    if (class541 != null)
				method9189(class185, anIntArray7398, i_663_,
					   i_705_, i_708_,
					   class541.anIntArray7175,
					   class541.aByteArray7181);
			}
		    }
		}
	    }
	}
	if (bool_669_) {
	    int i_711_ = 8;
	    for (int i_712_ = 0; i_712_ < i_711_; i_712_++) {
		int i_713_ = i_667_ + i_712_ * 8;
		int i_714_ = i_712_ * i_663_ / i_711_;
		int i_715_ = (i_712_ + 1) * i_663_ / i_711_ - 1;
		for (int i_716_ = 0; i_716_ < i_711_; i_716_++) {
		    int i_717_ = i_668_ + i_716_ * 8;
		    if (!method9193(i_713_, i_717_)) {
			int i_718_ = i_716_ * i_663_ / i_711_;
			int i_719_ = (i_716_ + 1) * i_663_ / i_711_ - 1;
			if (i_663_ < 64)
			    method9141(anIntArray7398, i_714_, i_715_, i_718_,
				       i_719_, i_663_);
			else {
			    aBoolArray7387[anInt7383]
				= method9193(i_713_, i_717_ + 8);
			    aBoolArray7387[anInt7362]
				= method9193(i_713_ + 8, i_717_ + 8);
			    aBoolArray7387[anInt7385]
				= method9193(i_713_ + 8, i_717_);
			    aBoolArray7387[anInt7386]
				= method9193(i_713_ + 8, i_717_ - 8);
			    aBoolArray7387[anInt7361]
				= method9193(i_713_, i_717_ - 8);
			    aBoolArray7387[anInt7403]
				= method9193(i_713_ - 8, i_717_ - 8);
			    aBoolArray7387[anInt7356]
				= method9193(i_713_ - 8, i_717_);
			    aBoolArray7387[anInt7390]
				= method9193(i_713_ - 8, i_717_ + 8);
			    method9140(anIntArray7398, i_714_, i_715_, i_718_,
				       i_719_, i_663_);
			}
		    }
		}
	    }
	}
	aClass203_7375.method3893(class185.method3316(anIntArray7398, 0,
						      i_663_, i_663_, i_663_,
						      true),
				  (long) i_664_);
    }
    
    static void method9185(int i, int i_720_, int i_721_, int i_722_,
			   boolean bool, boolean bool_723_, boolean bool_724_,
			   Class185 class185) {
	int i_725_ = i * 64;
	int i_726_ = i_720_ * 64;
	if (anIntArray7398 == null || anIntArray7398.length != i_721_ * i_721_)
	    anIntArray7398 = new int[i_721_ * i_721_];
	boolean bool_727_ = aBool7380 && !bool_724_;
	for (int i_728_ = 0; i_728_ < 64; i_728_++) {
	    int i_729_ = i_725_ + i_728_;
	    int i_730_ = i_728_ * i_721_ / 64;
	    int i_731_ = (i_728_ + 1) * i_721_ / 64 - 1;
	    if (i_731_ < i_730_)
		i_731_ = i_730_;
	    for (int i_732_ = 0; i_732_ < 64; i_732_++) {
		int i_733_ = i_726_ + i_732_;
		boolean bool_734_ = bool;
		if (bool_727_ && !method9193(i_729_, i_733_))
		    bool_734_ = false;
		int i_735_ = i_729_ + i_733_ * anInt7370;
		boolean bool_736_ = false;
		boolean bool_737_ = false;
		Object object = null;
		int i_738_ = ((aByteArray7374[i_735_] & 0xff) << 16
			      | aShortArray7357[i_735_] & 0xffff);
		if (i_738_ != 0)
		    i_738_ |= ~0xffffff;
		short i_739_ = aShortArray7376[i_735_];
		object = anObjectArray7367[i_735_];
		int i_740_ = i_732_ * i_721_ / 64;
		int i_741_ = (i_732_ + 1) * i_721_ / 64 - 1;
		if (i_741_ < i_740_)
		    i_741_ = i_740_;
		if (object != null) {
		    if (object instanceof Class534_Sub38) {
			Class534_Sub38 class534_sub38
			    = (Class534_Sub38) object;
			if (class534_sub38 != null)
			    method9129(anIntArray7398, i_730_, i_731_, i_740_,
				       i_741_, i_721_, bool_734_, i_738_,
				       i_739_, aByteArray7377[i_735_],
				       class534_sub38.anIntArray10806,
				       class534_sub38.aByteArray10805, true);
		    } else {
			Integer integer = (Integer) object;
			anIntArray7363[0] = integer.intValue();
			aByteArray7382[0] = aByteArray7379[i_735_];
			method9129(anIntArray7398, i_730_, i_731_, i_740_,
				   i_741_, i_721_, bool_734_, i_738_, i_739_,
				   aByteArray7377[i_735_], anIntArray7363,
				   aByteArray7382, true);
		    }
		} else
		    method9129(anIntArray7398, i_730_, i_731_, i_740_, i_741_,
			       i_721_, bool_734_, i_738_, i_739_,
			       aByteArray7377[i_735_], null, null, true);
	    }
	}
	if (bool_723_) {
	    for (int i_742_ = 0; i_742_ < 64; i_742_++) {
		int i_743_ = i_725_ + i_742_;
		boolean bool_744_ = i_742_ == 0 && i_743_ != 0;
		for (int i_745_ = 0; i_745_ < 64; i_745_++) {
		    int i_746_ = i_726_ + i_745_;
		    if (!bool_727_ || method9193(i_743_, i_746_)) {
			boolean bool_747_ = i_745_ == 0 && i_746_ != 0;
			int i_748_ = i_743_ + i_746_ * anInt7370;
			if (bool_744_ && bool_747_)
			    method9130(class185, anIntArray7398, i_721_, -1,
				       -1, i_743_ - 1, i_746_ - 1,
				       i_748_ - 1 - anInt7370);
			if (bool_744_)
			    method9130(class185, anIntArray7398, i_721_, -1,
				       i_745_, i_743_ - 1, i_746_, i_748_ - 1);
			if (bool_747_)
			    method9130(class185, anIntArray7398, i_721_,
				       i_742_, -1, i_743_, i_746_ - 1,
				       i_748_ - anInt7370);
			method9130(class185, anIntArray7398, i_721_, i_742_,
				   i_745_, i_743_, i_746_, i_748_);
		    }
		}
	    }
	}
	int i_749_ = i * 64 / 64;
	int i_750_ = i_720_ * 64 / 64;
	for (int i_751_ = 0; i_751_ < 3; i_751_++) {
	    for (int i_752_ = 0; i_752_ < 64; i_752_++) {
		int i_753_ = i_725_ + i_752_;
		int i_754_ = i_753_ & 0x3f;
		int i_755_ = i_752_ * i_721_ / 64;
		int i_756_ = (i_752_ + 1) * i_721_ / 64 - 1;
		if (i_756_ < i_755_)
		    i_756_ = i_755_;
		for (int i_757_ = 0; i_757_ < 64; i_757_++) {
		    int i_758_ = i_726_ + i_757_;
		    boolean bool_759_ = bool;
		    if (bool_727_ && !method9193(i_753_, i_758_))
			bool_759_ = false;
		    int i_760_ = i_758_ & 0x3f;
		    int i_761_ = i_757_ * i_721_ / 64;
		    int i_762_ = (i_757_ + 1) * i_721_ / 64 - 1;
		    if (i_762_ < i_761_)
			i_762_ = i_761_;
		    HashMap hashmap
			= aHashMapArrayArrayArray7391[i_751_][i_749_][i_750_];
		    if (hashmap != null) {
			Class541 class541
			    = ((Class541)
			       hashmap.get(Integer.valueOf((i_754_ << 8)
							   + i_760_)));
			if (class541 != null)
			    method9129(anIntArray7398, i_755_, i_756_, i_761_,
				       i_762_, i_721_, bool_759_,
				       class541.anInt7179, class541.aShort7178,
				       class541.aByte7180,
				       class541.anIntArray7175,
				       class541.aByteArray7181, false);
		    }
		}
	    }
	    for (int i_763_ = 0; i_763_ < 64; i_763_++) {
		int i_764_ = i_725_ + i_763_;
		int i_765_ = i_764_ & 0x3f;
		for (int i_766_ = 0; i_766_ < 64; i_766_++) {
		    int i_767_ = i_726_ + i_766_;
		    if (!bool_727_ || method9193(i_764_, i_767_)) {
			int i_768_ = i_767_ & 0x3f;
			HashMap hashmap = (aHashMapArrayArrayArray7391[i_751_]
					   [i_749_][i_750_]);
			if (hashmap != null) {
			    Class541 class541
				= ((Class541)
				   hashmap.get(Integer.valueOf((i_765_ << 8)
							       + i_768_)));
			    if (class541 != null)
				method9189(class185, anIntArray7398, i_721_,
					   i_763_, i_766_,
					   class541.anIntArray7175,
					   class541.aByteArray7181);
			}
		    }
		}
	    }
	}
	if (bool_727_) {
	    int i_769_ = 8;
	    for (int i_770_ = 0; i_770_ < i_769_; i_770_++) {
		int i_771_ = i_725_ + i_770_ * 8;
		int i_772_ = i_770_ * i_721_ / i_769_;
		int i_773_ = (i_770_ + 1) * i_721_ / i_769_ - 1;
		for (int i_774_ = 0; i_774_ < i_769_; i_774_++) {
		    int i_775_ = i_726_ + i_774_ * 8;
		    if (!method9193(i_771_, i_775_)) {
			int i_776_ = i_774_ * i_721_ / i_769_;
			int i_777_ = (i_774_ + 1) * i_721_ / i_769_ - 1;
			if (i_721_ < 64)
			    method9141(anIntArray7398, i_772_, i_773_, i_776_,
				       i_777_, i_721_);
			else {
			    aBoolArray7387[anInt7383]
				= method9193(i_771_, i_775_ + 8);
			    aBoolArray7387[anInt7362]
				= method9193(i_771_ + 8, i_775_ + 8);
			    aBoolArray7387[anInt7385]
				= method9193(i_771_ + 8, i_775_);
			    aBoolArray7387[anInt7386]
				= method9193(i_771_ + 8, i_775_ - 8);
			    aBoolArray7387[anInt7361]
				= method9193(i_771_, i_775_ - 8);
			    aBoolArray7387[anInt7403]
				= method9193(i_771_ - 8, i_775_ - 8);
			    aBoolArray7387[anInt7356]
				= method9193(i_771_ - 8, i_775_);
			    aBoolArray7387[anInt7390]
				= method9193(i_771_ - 8, i_775_ + 8);
			    method9140(anIntArray7398, i_772_, i_773_, i_776_,
				       i_777_, i_721_);
			}
		    }
		}
	    }
	}
	aClass203_7375.method3893(class185.method3316(anIntArray7398, 0,
						      i_721_, i_721_, i_721_,
						      true),
				  (long) i_722_);
    }
    
    static void method9186(Class185 class185, int[] is, int i, int i_778_,
			   int i_779_, int i_780_, int i_781_, int i_782_) {
	Object object = anObjectArray7367[i_782_];
	if (object != null) {
	    if (object instanceof Class534_Sub38) {
		Class534_Sub38 class534_sub38 = (Class534_Sub38) object;
		if (class534_sub38 != null)
		    method9189(class185, is, i, i_778_, i_779_,
			       class534_sub38.anIntArray10806,
			       class534_sub38.aByteArray10805);
	    } else {
		Integer integer = (Integer) object;
		anIntArray7363[0] = integer.intValue();
		aByteArray7382[0]
		    = aByteArray7379[i_780_ + i_781_ * anInt7370];
		method9189(class185, is, i, i_778_, i_779_, anIntArray7363,
			   aByteArray7382);
	    }
	}
    }
    
    static void method9187(int[] is, int i, int i_783_, int i_784_, int i_785_,
			   int i_786_, int i_787_, int i_788_) {
	for (int i_789_ = i; i_789_ <= i_783_; i_789_++) {
	    for (int i_790_ = i_784_; i_790_ <= i_785_; i_790_++)
		is[(i_787_ - i_790_ - 1) * i_786_ + i_789_] = i_788_;
	}
    }
    
    static void method9188(Class185 class185, int[] is, int i, int i_791_,
			   int i_792_, int i_793_, int i_794_, int i_795_) {
	Object object = anObjectArray7367[i_795_];
	if (object != null) {
	    if (object instanceof Class534_Sub38) {
		Class534_Sub38 class534_sub38 = (Class534_Sub38) object;
		if (class534_sub38 != null)
		    method9189(class185, is, i, i_791_, i_792_,
			       class534_sub38.anIntArray10806,
			       class534_sub38.aByteArray10805);
	    } else {
		Integer integer = (Integer) object;
		anIntArray7363[0] = integer.intValue();
		aByteArray7382[0]
		    = aByteArray7379[i_793_ + i_794_ * anInt7370];
		method9189(class185, is, i, i_791_, i_792_, anIntArray7363,
			   aByteArray7382);
	    }
	}
    }
    
    static void method9189(Class185 class185, int[] is, int i, int i_796_,
			   int i_797_, int[] is_798_, byte[] is_799_) {
	if (is_798_ != null) {
	    for (int i_800_ = 0; i_800_ < is_798_.length; i_800_++) {
		Class602 class602
		    = (Class602) aClass44_Sub13_7348.method91(is_798_[i_800_],
							      -1074809078);
		int i_801_ = class602.anInt7890 * 350336715;
		if (i_801_ != -1) {
		    Class85 class85
			= ((Class85)
			   aClass44_Sub18_7416.method91(i_801_, -854746099));
		    Class163 class163
			= class85.method1672(class185,
					     (class602.aBool7924
					      ? is_799_[i_800_] >> 6 & 0x3
					      : 0),
					     (class602.aBool7955
					      ? class602.aBool7927 : false),
					     (short) 26233);
		    int[] is_802_
			= class85.method1673(class185,
					     (class602.aBool7924
					      ? is_799_[i_800_] >> 6 & 0x3
					      : 0),
					     (class602.aBool7955
					      ? class602.aBool7927 : false),
					     1215153812);
		    if (class163 != null) {
			int i_803_ = class163.method22();
			int i_804_ = class163.method2692();
			int i_805_ = i * i_803_ / 64 >> 2;
			int i_806_ = i * i_804_ / 64 >> 2;
			if (class85.aBool844) {
			    int i_807_ = class602.anInt7904 * -1082258489;
			    int i_808_ = class602.anInt7928 * -1990374967;
			    if ((is_799_[i_800_] >> 6 & 0x1) == 1) {
				int i_809_ = i_807_;
				i_807_ = i_808_;
				i_808_ = i_809_;
			    }
			    i_805_ = i_807_ * i / 64;
			    i_806_ = i_808_ * i / 64;
			}
			if (i_805_ != 0 && i_806_ != 0) {
			    int i_810_ = i_796_ * i / 64;
			    int i_811_ = (64 - i_797_) * i / 64 - i_806_ + 1;
			    for (int i_812_ = 0; i_812_ < i_805_; i_812_++) {
				int i_813_ = i_812_ + i_810_;
				if (i_813_ >= 0) {
				    if (i_813_ >= i)
					break;
				    for (int i_814_ = 0; i_814_ < i_806_;
					 i_814_++) {
					int i_815_ = i_814_ + i_811_;
					if (i_815_ >= 0) {
					    if (i_815_ >= i)
						break;
					    int i_816_
						= (is_802_
						   [(i_812_ * i_803_ / i_805_
						     + i_803_ * (i_814_
								 * i_804_
								 / i_806_))]);
					    int i_817_ = i_816_ >> 24 & 0xff;
					    if (i_817_ != 0)
						is[i_813_ + i * i_815_]
						    = i_816_;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static void method9190(Class185 class185, int[] is, int i, int i_818_,
			   int i_819_, int i_820_, int i_821_, int i_822_) {
	Object object = anObjectArray7367[i_822_];
	if (object != null) {
	    if (object instanceof Class534_Sub38) {
		Class534_Sub38 class534_sub38 = (Class534_Sub38) object;
		if (class534_sub38 != null)
		    method9189(class185, is, i, i_818_, i_819_,
			       class534_sub38.anIntArray10806,
			       class534_sub38.aByteArray10805);
	    } else {
		Integer integer = (Integer) object;
		anIntArray7363[0] = integer.intValue();
		aByteArray7382[0]
		    = aByteArray7379[i_820_ + i_821_ * anInt7370];
		method9189(class185, is, i, i_818_, i_819_, anIntArray7363,
			   aByteArray7382);
	    }
	}
    }
    
    Class554() throws Throwable {
	throw new Error();
    }
    
    static void method9191(Class185 class185, int[] is, int i, int i_823_,
			   int i_824_, int i_825_, int i_826_, int i_827_) {
	Object object = anObjectArray7367[i_827_];
	if (object != null) {
	    if (object instanceof Class534_Sub38) {
		Class534_Sub38 class534_sub38 = (Class534_Sub38) object;
		if (class534_sub38 != null)
		    method9189(class185, is, i, i_823_, i_824_,
			       class534_sub38.anIntArray10806,
			       class534_sub38.aByteArray10805);
	    } else {
		Integer integer = (Integer) object;
		anIntArray7363[0] = integer.intValue();
		aByteArray7382[0]
		    = aByteArray7379[i_825_ + i_826_ * anInt7370];
		method9189(class185, is, i, i_823_, i_824_, anIntArray7363,
			   aByteArray7382);
	    }
	}
    }
    
    static void method9192(Class185 class185, int[] is, int i, int i_828_,
			   int i_829_, int[] is_830_, byte[] is_831_) {
	if (is_830_ != null) {
	    for (int i_832_ = 0; i_832_ < is_830_.length; i_832_++) {
		Class602 class602
		    = (Class602) aClass44_Sub13_7348.method91(is_830_[i_832_],
							      -567953731);
		int i_833_ = class602.anInt7890 * 350336715;
		if (i_833_ != -1) {
		    Class85 class85
			= ((Class85)
			   aClass44_Sub18_7416.method91(i_833_, 383433073));
		    Class163 class163
			= class85.method1672(class185,
					     (class602.aBool7924
					      ? is_831_[i_832_] >> 6 & 0x3
					      : 0),
					     (class602.aBool7955
					      ? class602.aBool7927 : false),
					     (short) 16550);
		    int[] is_834_
			= class85.method1673(class185,
					     (class602.aBool7924
					      ? is_831_[i_832_] >> 6 & 0x3
					      : 0),
					     (class602.aBool7955
					      ? class602.aBool7927 : false),
					     806318024);
		    if (class163 != null) {
			int i_835_ = class163.method22();
			int i_836_ = class163.method2692();
			int i_837_ = i * i_835_ / 64 >> 2;
			int i_838_ = i * i_836_ / 64 >> 2;
			if (class85.aBool844) {
			    int i_839_ = class602.anInt7904 * -1082258489;
			    int i_840_ = class602.anInt7928 * -1990374967;
			    if ((is_831_[i_832_] >> 6 & 0x1) == 1) {
				int i_841_ = i_839_;
				i_839_ = i_840_;
				i_840_ = i_841_;
			    }
			    i_837_ = i_839_ * i / 64;
			    i_838_ = i_840_ * i / 64;
			}
			if (i_837_ != 0 && i_838_ != 0) {
			    int i_842_ = i_828_ * i / 64;
			    int i_843_ = (64 - i_829_) * i / 64 - i_838_ + 1;
			    for (int i_844_ = 0; i_844_ < i_837_; i_844_++) {
				int i_845_ = i_844_ + i_842_;
				if (i_845_ >= 0) {
				    if (i_845_ >= i)
					break;
				    for (int i_846_ = 0; i_846_ < i_838_;
					 i_846_++) {
					int i_847_ = i_846_ + i_843_;
					if (i_847_ >= 0) {
					    if (i_847_ >= i)
						break;
					    int i_848_
						= (is_834_
						   [(i_844_ * i_835_ / i_837_
						     + i_835_ * (i_846_
								 * i_836_
								 / i_838_))]);
					    int i_849_ = i_848_ >> 24 & 0xff;
					    if (i_849_ != 0)
						is[i_845_ + i * i_847_]
						    = i_848_;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static boolean method9193(int i, int i_850_) {
	int i_851_ = i >> 3;
	int i_852_ = i_850_ >> 3;
	if (i_851_ < 0 || i_852_ < 0 || i_851_ >= aBoolArrayArray7389.length
	    || i_852_ >= aBoolArrayArray7389[i_851_].length)
	    return false;
	return aBoolArrayArray7389[i_851_][i_852_];
    }
    
    static {
	anInterface14_7350 = null;
	aClass9_7372 = new Class9(16);
	anInt7358 = (int) (Math.random() * 11.0) - 5;
	anInt7359 = (int) (Math.random() * 17.0) - 8;
	anIntArray7363 = new int[1];
	aByteArray7382 = new byte[1];
	aClass700_7413 = new Class700();
	aBool7380 = true;
	anIntArrayArray7346
	    = new int[][] { { 2, 2, 0, 0, 0, 0 }, { 2, 2, 2, 0, 0, 0 },
			    { 1, 2, 2, 2, 0, 0 }, { 1, 1, 1, 2, 2, 0 },
			    { 1, 1, 1, 2, 2, 2 }, { 1, 1, 1, 1, 2, 2 } };
	anInt7383 = Class686.aClass686_8708.method93();
	anInt7362 = Class686.aClass686_8700.method93();
	anInt7385 = Class686.aClass686_8705.method93();
	anInt7386 = Class686.aClass686_8699.method93();
	anInt7361 = Class686.aClass686_8701.method93();
	anInt7403 = Class686.aClass686_8704.method93();
	anInt7356 = Class686.aClass686_8706.method93();
	anInt7390 = Class686.aClass686_8702.method93();
	aClass203_7392 = new Class203(4096, 256);
	aClass203_7393 = new Class203(4096, 1024);
	aClass203_7375 = aClass203_7392;
	anArrayList7396 = new ArrayList();
	anInt7395 = 262144;
	anInt7399 = 0;
	anInt7400 = 5;
	aClass534_Sub40_7401 = null;
	aClass534_Sub40_7402 = null;
	aBool7355 = true;
	new Date();
	anInt7414 = 0;
	anInt7360 = 0;
	aBoolArray7387 = new boolean[8];
    }
    
    static int method9194(Class177 class177, int i, int i_853_, int i_854_) {
	return method9126(anInterface14_7415, class177, i, i_853_, i_854_);
    }
    
    static boolean method9195(int i, int i_855_) {
	int i_856_ = i >> 3;
	int i_857_ = i_855_ >> 3;
	if (i_856_ < 0 || i_857_ < 0 || i_856_ >= aBoolArrayArray7389.length
	    || i_857_ >= aBoolArrayArray7389[i_856_].length)
	    return false;
	return aBoolArrayArray7389[i_856_][i_857_];
    }
    
    static boolean method9196(int i, int i_858_) {
	int i_859_ = i >> 3;
	int i_860_ = i_858_ >> 3;
	if (i_859_ < 0 || i_860_ < 0 || i_859_ >= aBoolArrayArray7389.length
	    || i_860_ >= aBoolArrayArray7389[i_859_].length)
	    return false;
	return aBoolArrayArray7389[i_859_][i_860_];
    }
    
    static boolean method9197(Class534_Sub18_Sub9 class534_sub18_sub9) {
	if (class534_sub18_sub9 != null
	    && class534_sub18_sub9 != aClass534_Sub18_Sub9_7354) {
	    aClass534_Sub18_Sub9_7354 = class534_sub18_sub9;
	    aBool7380 = (aClass534_Sub18_Sub9_7354.anInt11766 * 848546455
			 == aClass622_7353.anInt8138 * -359981155);
	    return true;
	}
	return false;
    }
    
    static void method9198(int[] is, int i, int i_861_, int i_862_, int i_863_,
			   int i_864_, boolean bool, int i_865_, int i_866_,
			   int i_867_, int[] is_868_, byte[] is_869_,
			   boolean bool_870_) {
	if (bool_870_ || i_865_ != 0 || i_866_ > 0) {
	    if (i_866_ == 0)
		method9139(is, i, i_861_, i_862_, i_863_, i_864_, i_864_,
			   i_865_ | ~0xffffff);
	    else {
		int i_871_ = i_867_ & 0x3f;
		if (i_871_ == 0 || anInt7394 == 0) {
		    int i_872_ = anIntArray7347[i_866_];
		    if (bool_870_ || i_872_ != 0)
			method9139(is, i, i_861_, i_862_, i_863_, i_864_,
				   i_864_, i_872_ | ~0xffffff);
		} else {
		    int i_873_ = bool_870_ ? 0 : 1;
		    int i_874_ = Class200.method3852(i_867_ >> 6 & 0x3, i_871_,
						     103225859);
		    i_871_ = Class415.method6740(i_871_, 154635170);
		    method9144(is, i, i_861_, i_862_, i_863_, i_864_, i_864_,
			       i_865_, anIntArray7347[i_866_],
			       aByteArrayArrayArray7388[i_871_ - 1][i_874_],
			       anInt7394, i_873_);
		}
	    }
	}
	if (bool && is_868_ != null) {
	    int i_875_ = i_861_ - i + 1;
	    int i_876_ = i_863_ - i_862_ + 1;
	    for (int i_877_ = 0; i_877_ < is_868_.length; i_877_++) {
		int i_878_ = is_869_[i_877_] & 0x3f;
		if (i_878_ == Class595.aClass595_7851.anInt7852 * 847393323
		    || i_878_ == Class595.aClass595_7829.anInt7852 * 847393323
		    || i_878_ == Class595.aClass595_7832.anInt7852 * 847393323
		    || (i_878_
			== Class595.aClass595_7833.anInt7852 * 847393323)) {
		    Class602 class602
			= ((Class602)
			   aClass44_Sub13_7348.method91(is_868_[i_877_],
							1304976173));
		    if (class602.anInt7890 * 350336715 == -1) {
			int i_879_ = -3355444;
			if (class602.anInt7907 * -2134171963 == 1)
			    i_879_ = -3407872;
			int i_880_ = is_869_[i_877_] >> 6 & 0x3;
			if (i_878_
			    == Class595.aClass595_7851.anInt7852 * 847393323) {
			    if (i_880_ == 0)
				method9131(is, i, i_863_, i_876_, i_864_,
					   i_879_);
			    else if (i_880_ == 1)
				method9145(is, i, i_863_, i_875_, i_864_,
					   i_879_);
			    else if (i_880_ == 2)
				method9131(is, i_861_, i_863_, i_876_, i_864_,
					   i_879_);
			    else
				method9145(is, i, i_862_, i_875_, i_864_,
					   i_879_);
			} else if (i_878_ == (Class595.aClass595_7829.anInt7852
					      * 847393323)) {
			    if (i_880_ == 0) {
				method9131(is, i, i_863_, i_876_, i_864_, -1);
				method9145(is, i, i_863_, i_875_, i_864_,
					   i_879_);
			    } else if (i_880_ == 1) {
				method9131(is, i_861_, i_863_, i_876_, i_864_,
					   -1);
				method9145(is, i, i_863_, i_875_, i_864_,
					   i_879_);
			    } else if (i_880_ == 2) {
				method9131(is, i_861_, i_863_, i_876_, i_864_,
					   -1);
				method9145(is, i, i_862_, i_875_, i_864_,
					   i_879_);
			    } else {
				method9131(is, i, i_863_, i_876_, i_864_, -1);
				method9145(is, i, i_862_, i_875_, i_864_,
					   i_879_);
			    }
			} else if (i_878_ == (Class595.aClass595_7832.anInt7852
					      * 847393323)) {
			    if (i_880_ == 0)
				method9145(is, i, i_863_, 1, i_864_, i_879_);
			    else if (i_880_ == 1)
				method9145(is, i_861_, i_863_, 1, i_864_,
					   i_879_);
			    else if (i_880_ == 2)
				method9145(is, i_861_, i_862_, 1, i_864_,
					   i_879_);
			    else
				method9145(is, i, i_862_, 1, i_864_, i_879_);
			} else if (i_878_ == (Class595.aClass595_7833.anInt7852
					      * 847393323)) {
			    if (i_880_ == 0 || i_880_ == 2) {
				for (int i_881_ = 0; i_881_ < i_876_; i_881_++)
				    method9145(is, i + i_881_, i_862_ + i_881_,
					       1, i_864_, i_879_);
			    } else {
				for (int i_882_ = 0; i_882_ < i_876_; i_882_++)
				    method9145(is, i + i_882_, i_863_ - i_882_,
					       1, i_864_, i_879_);
			    }
			}
		    }
		}
	    }
	}
    }
    
    static int method9199() {
	return (int) (64.0F * aFloat7409 / 2.0F);
    }
    
    static void method9200(int[] is, int i, int i_883_, int i_884_, int i_885_,
			   int i_886_, int i_887_, int i_888_) {
	for (int i_889_ = i; i_889_ <= i_883_; i_889_++) {
	    for (int i_890_ = i_884_; i_890_ <= i_885_; i_890_++)
		is[(i_887_ - i_890_ - 1) * i_886_ + i_889_] = i_888_;
	}
    }
    
    static void method9201(int i) {
	Class534_Sub18_Sub9 class534_sub18_sub9
	    = (Class534_Sub18_Sub9) aClass9_7372.method579((long) i);
	if (class534_sub18_sub9 != null
	    && class534_sub18_sub9 != aClass534_Sub18_Sub9_7354) {
	    aClass534_Sub18_Sub9_7354 = class534_sub18_sub9;
	    aBool7380 = (aClass534_Sub18_Sub9_7354.anInt11766 * 848546455
			 == aClass622_7353.anInt8138 * -359981155);
	}
    }
    
    static void method9202(int[] is, int i, int i_891_, int i_892_, int i_893_,
			   int i_894_, int i_895_, int i_896_) {
	for (int i_897_ = i; i_897_ <= i_891_; i_897_++) {
	    for (int i_898_ = i_892_; i_898_ <= i_893_; i_898_++)
		is[(i_895_ - i_898_ - 1) * i_894_ + i_897_] = i_896_;
	}
    }
    
    static void method9203(Class177 class177, int i, int i_899_) {
	for (int i_900_ = 0; i_900_ < anInterface14_7415.method90((byte) 111);
	     i_900_++)
	    anIntArray7347[i_900_ + 1]
		= method9171(class177, i_900_, i, i_899_);
    }
    
    static void method9204(int[] is, int i, int i_901_, int i_902_, int i_903_,
			   int i_904_) {
	int i_905_ = aClass622_7353.anInt8127 * -962787217 >> 24 & 0xff;
	int i_906_ = 255 - i_905_;
	if ((!aBoolArray7387[anInt7383]
	     || !aBoolArray7387[anInt7385] && !aBoolArray7387[anInt7356])
	    && (!aBoolArray7387[anInt7361]
		|| !aBoolArray7387[anInt7385] && !aBoolArray7387[anInt7356])) {
	    method9180(is, i, i_901_, i_902_, i_903_, i_904_, i_905_, i_906_,
		       true, true, true, true);
	    if (aBoolArray7387[anInt7362]) {
		is[(i_904_ - i_903_ - 1) * i_904_ + i_901_]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_904_ - i_903_) * i_904_ + i_901_]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_904_ - i_903_ - 1) * i_904_ + i_901_ - 1]
		    = aClass622_7353.anInt8141 * 1156690091;
	    }
	    if (aBoolArray7387[anInt7386]) {
		is[(i_904_ - i_902_ - 1) * i_904_ + i_901_]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_904_ - i_902_ - 2) * i_904_ + i_901_]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_904_ - i_902_ - 1) * i_904_ + i_901_ - 1]
		    = aClass622_7353.anInt8141 * 1156690091;
	    }
	    if (aBoolArray7387[anInt7403]) {
		is[(i_904_ - i_902_ - 1) * i_904_ + i]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_904_ - i_902_ - 2) * i_904_ + i]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_904_ - i_902_ - 1) * i_904_ + i + 1]
		    = aClass622_7353.anInt8141 * 1156690091;
	    }
	    if (aBoolArray7387[anInt7390]) {
		is[(i_904_ - i_903_ - 1) * i_904_ + i]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_904_ - i_903_) * i_904_ + i]
		    = aClass622_7353.anInt8141 * 1156690091;
		is[(i_904_ - i_903_ - 1) * i_904_ + i + 1]
		    = aClass622_7353.anInt8141 * 1156690091;
	    }
	} else {
	    if (aBoolArray7387[anInt7383] && aBoolArray7387[anInt7385])
		method9143(is,
			   i_901_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_903_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_904_, i_905_, i_906_, anInt7362);
	    else {
		method9180(is,
			   i_901_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_901_,
			   i_903_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_903_, i_904_, i_905_, i_906_, true, true, false,
			   false);
		if (aBoolArray7387[anInt7362]) {
		    is[(i_904_ - i_903_ - 1) * i_904_ + i_901_]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_904_ - i_903_) * i_904_ + i_901_]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_904_ - i_903_ - 1) * i_904_ + i_901_ - 1]
			= aClass622_7353.anInt8141 * 1156690091;
		}
	    }
	    if (aBoolArray7387[anInt7361] && aBoolArray7387[anInt7385])
		method9143(is,
			   i_901_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_902_, i_904_, i_905_, i_906_, anInt7386);
	    else {
		method9180(is,
			   i_901_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_901_, i_902_,
			   i_902_ + aClass622_7353.anInt8143 * -1255575643 - 1,
			   i_904_, i_905_, i_906_, false, true, true, false);
		if (aBoolArray7387[anInt7386]) {
		    is[(i_904_ - i_902_ - 1) * i_904_ + i_901_]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_904_ - i_902_ - 2) * i_904_ + i_901_]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_904_ - i_902_ - 1) * i_904_ + i_901_ - 1]
			= aClass622_7353.anInt8141 * 1156690091;
		}
	    }
	    if (aBoolArray7387[anInt7361] && aBoolArray7387[anInt7356])
		method9143(is, i, i_902_, i_904_, i_905_, i_906_, anInt7403);
	    else {
		method9180(is, i,
			   i + aClass622_7353.anInt8143 * -1255575643 - 1,
			   i_902_,
			   i_902_ + aClass622_7353.anInt8143 * -1255575643 - 1,
			   i_904_, i_905_, i_906_, false, false, true, true);
		if (aBoolArray7387[anInt7403]) {
		    is[(i_904_ - i_902_ - 1) * i_904_ + i]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_904_ - i_902_ - 2) * i_904_ + i]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_904_ - i_902_ - 1) * i_904_ + i + 1]
			= aClass622_7353.anInt8141 * 1156690091;
		}
	    }
	    if (aBoolArray7387[anInt7383] && aBoolArray7387[anInt7356])
		method9143(is, i,
			   i_903_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_904_, i_905_, i_906_, anInt7390);
	    else {
		method9180(is, i,
			   i + aClass622_7353.anInt8143 * -1255575643 - 1,
			   i_903_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_903_, i_904_, i_905_, i_906_, true, false, false,
			   true);
		if (aBoolArray7387[anInt7390]) {
		    is[(i_904_ - i_903_ - 1) * i_904_ + i]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_904_ - i_903_) * i_904_ + i]
			= aClass622_7353.anInt8141 * 1156690091;
		    is[(i_904_ - i_903_ - 1) * i_904_ + i + 1]
			= aClass622_7353.anInt8141 * 1156690091;
		}
	    }
	    if (i + aClass622_7353.anInt8143 * -1255575643
		< i_901_ - aClass622_7353.anInt8143 * -1255575643)
		method9180(is, i + aClass622_7353.anInt8143 * -1255575643,
			   i_901_ - aClass622_7353.anInt8143 * -1255575643,
			   i_902_, i_903_, i_904_, i_905_, i_906_, true, false,
			   true, false);
	    if (i_902_ + aClass622_7353.anInt8143 * -1255575643 + 1
		< i_903_ - aClass622_7353.anInt8143 * -1255575643 - 1) {
		method9180(is, i,
			   i + aClass622_7353.anInt8143 * -1255575643 - 1,
			   i_902_ + aClass622_7353.anInt8143 * -1255575643,
			   i_903_ - aClass622_7353.anInt8143 * -1255575643,
			   i_904_, i_905_, i_906_, false, false, false, true);
		method9180(is,
			   i_901_ - aClass622_7353.anInt8143 * -1255575643 + 1,
			   i_901_,
			   i_902_ + aClass622_7353.anInt8143 * -1255575643,
			   i_903_ - aClass622_7353.anInt8143 * -1255575643,
			   i_904_, i_905_, i_906_, false, true, false, false);
	    }
	}
    }
    
    static void method9205(int[] is, int i, int i_907_, int i_908_, int i_909_,
			   int i_910_, int i_911_) {
	for (int i_912_ = 0; i_912_ < aClass622_7353.anInt8143 * -1255575643;
	     i_912_++) {
	    int i_913_ = i_912_;
	    if (i_911_ == anInt7362 || i_911_ == anInt7386)
		i_913_ = aClass622_7353.anInt8143 * -1255575643 - i_912_ - 1;
	    for (int i_914_ = 0;
		 i_914_ < aClass622_7353.anInt8143 * -1255575643; i_914_++) {
		int i_915_ = i_914_;
		if (i_911_ == anInt7386 || i_911_ == anInt7403)
		    i_915_
			= aClass622_7353.anInt8143 * -1255575643 - i_914_ - 1;
		int i_916_ = anIntArrayArray7346[i_913_][i_915_];
		if (i_916_ != 0) {
		    if (i_916_ == 1) {
			int i_917_
			    = is[((i_908_ - i_907_ - i_914_ - 1) * i_908_ + i
				  + i_912_)];
			if (i_917_ != anInt7414) {
			    anInt7414 = i_917_;
			    anInt7360
				= (~0xffffff
				   | ((((aClass622_7353.anInt8127 * -962787217
					 & 0xff00ff) * i_909_
					+ (i_917_ & 0xff00ff) * i_910_)
				       & ~0xff00ff)
				      + ((((aClass622_7353.anInt8127
					    * -962787217)
					   & 0xff00) * i_909_
					  + (i_917_ & 0xff00) * i_910_)
					 & 0xff0000)) >> 8);
			}
			is[((i_908_ - i_907_ - i_914_ - 1) * i_908_ + i
			    + i_912_)]
			    = anInt7360;
		    } else if (i_916_ == 2)
			is[((i_908_ - i_907_ - i_914_ - 1) * i_908_ + i
			    + i_912_)]
			    = aClass622_7353.anInt8141 * 1156690091;
		}
	    }
	}
    }
    
    static boolean method9206(Class185 class185, int i, int i_918_,
			      boolean bool) {
	long l = Class250.method4604((byte) -92);
	if (anInt7399 == 0) {
	    if (aClass534_Sub18_Sub9_7354.anInt11766 * 848546455
		== aClass622_7353.anInt8133 * -1604882349) {
		int i_919_
		    = aClass472_7365.method7683((aClass534_Sub18_Sub9_7354
						 .aString11765),
						(byte) 1);
		if (aClass534_Sub40_7402 == null)
		    aClass534_Sub40_7402
			= new Class534_Sub40(aClass472_7365.method7743
					     (i_919_, 0, -1361705898));
		aClass534_Sub40_7401 = aClass534_Sub40_7402;
		aClass534_Sub40_7401.anInt10811 = 0;
	    } else {
		int i_920_
		    = aClass472_7365.method7683((aClass534_Sub18_Sub9_7354
						 .aString11765),
						(byte) 1);
		aClass534_Sub40_7401
		    = (new Class534_Sub40
		       (aClass472_7365.method7743(i_920_, 0, -653714182)));
	    }
	    int i_921_ = aClass534_Sub40_7401.method16527(518920109);
	    anIntArray7404 = new int[i_921_];
	    for (int i_922_ = 0; i_922_ < i_921_; i_922_++)
		anIntArray7404[i_922_]
		    = aClass534_Sub40_7401.method16546(-1706829710);
	    int i_923_ = aClass534_Sub40_7401.method16527(497657299);
	    anIntArray7405 = new int[i_923_];
	    for (int i_924_ = 0; i_924_ < i_923_; i_924_++)
		anIntArray7405[i_924_]
		    = aClass534_Sub40_7401.method16546(-1706829710);
	}
	while (aClass534_Sub40_7401 != null
	       && (aClass534_Sub40_7401.anInt10811 * 31645619
		   < aClass534_Sub40_7401.aByteArray10810.length)
	       && (!bool || (Class250.method4604((byte) -49)
			     < l + (long) anInt7400))) {
	    if (aClass534_Sub40_7401.method16527(611650130) == 0) {
		int i_925_ = aClass534_Sub40_7401.method16527(1050182773);
		int i_926_ = aClass534_Sub40_7401.method16527(1104265687);
		for (int i_927_ = 0; i_927_ < 8; i_927_++) {
		    int i_928_ = aClass534_Sub40_7401.method16527(301317457);
		    int i_929_ = i_925_ * 8 + i_927_ - anInt7368 / 8;
		    for (int i_930_ = 0; i_930_ < 8; i_930_++) {
			int i_931_ = i_926_ * 8 + i_930_ - anInt7369 / 8;
			aBoolArrayArray7389[i_929_][i_931_]
			    = (i_928_ & 1 << i_930_) != 0;
		    }
		}
		for (int i_932_ = 0; i_932_ < 64; i_932_++) {
		    for (int i_933_ = 0; i_933_ < 64; i_933_++) {
			int i_934_ = i_925_ * 64 + i_932_ - anInt7368;
			int i_935_ = i_926_ * 64 + i_933_ - anInt7369;
			method9120(class185, aClass534_Sub40_7401, i_925_,
				   i_926_, i_934_, i_935_, anIntArray7404,
				   anIntArray7405);
		    }
		}
	    } else {
		int i_936_ = aClass534_Sub40_7401.method16527(1698337950);
		int i_937_ = aClass534_Sub40_7401.method16527(-259484199);
		int i_938_ = aClass534_Sub40_7401.method16527(-2039514401);
		int i_939_ = aClass534_Sub40_7401.method16527(-255982117);
		aBoolArrayArray7389[i_936_ * 8 + i_938_ - anInt7368 / 8]
		    [i_937_ * 8 + i_939_ - anInt7369 / 8]
		    = aClass534_Sub40_7401.method16527(637417204) != 0;
		for (int i_940_ = 0; i_940_ < 8; i_940_++) {
		    for (int i_941_ = 0; i_941_ < 8; i_941_++) {
			int i_942_
			    = i_936_ * 64 + i_938_ * 8 + i_940_ - anInt7368;
			int i_943_
			    = i_937_ * 64 + i_939_ * 8 + i_941_ - anInt7369;
			method9120(class185, aClass534_Sub40_7401, i_936_,
				   i_937_, i_942_, i_943_, anIntArray7404,
				   anIntArray7405);
		    }
		}
	    }
	}
	if (aClass534_Sub40_7401 != null) {
	    anInt7399 = aClass534_Sub40_7401.anInt10811 * 31645619;
	    if (aClass534_Sub40_7401.anInt10811 * 31645619
		< aClass534_Sub40_7401.aByteArray10810.length)
		return false;
	}
	aClass534_Sub40_7401 = null;
	anIntArray7405 = null;
	anIntArray7404 = null;
	if (aShortArray7373 != null) {
	    aByteArray7374 = new byte[anInt7370 * anInt7371];
	    aShortArray7357 = new short[anInt7370 * anInt7371];
	    for (int i_944_ = 0; i_944_ < 3; i_944_++) {
		short[] is = new short[anInt7370 * anInt7371];
		for (int i_945_ = 0;
		     i_945_ < aHashMapArrayArrayArray7391[i_944_].length;
		     i_945_++) {
		    for (int i_946_ = 0;
			 (i_946_
			  < aHashMapArrayArrayArray7391[i_944_][0].length);
			 i_946_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7391[i_944_]
					   [i_945_][i_946_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class541 class541 = (Class541) iterator.next();
				is[(i_945_ * 64 + class541.aByte7177
				    + ((i_946_ * 64 + class541.aByte7176)
				       * anInt7370))]
				    = (short) class541.anInt7179;
			    }
			}
		    }
		}
		method9107(is, aByteArray7374, aShortArray7357, i, i_918_);
		for (int i_947_ = 0;
		     i_947_ < aHashMapArrayArrayArray7391[i_944_].length;
		     i_947_++) {
		    for (int i_948_ = 0;
			 (i_948_
			  < aHashMapArrayArrayArray7391[i_944_][0].length);
			 i_948_++) {
			HashMap hashmap = (aHashMapArrayArrayArray7391[i_944_]
					   [i_947_][i_948_]);
			if (hashmap != null) {
			    Iterator iterator = hashmap.values().iterator();
			    while (iterator.hasNext()) {
				Class541 class541 = (Class541) iterator.next();
				int i_949_
				    = (i_947_ * 64 + class541.aByte7177
				       + ((i_948_ * 64 + class541.aByte7176)
					  * anInt7370));
				class541.anInt7179
				    = ((aByteArray7374[i_949_] & 0xff) << 16
				       | aShortArray7357[i_949_] & 0xffff);
				if (class541.anInt7179 != 0)
				    class541.anInt7179 |= ~0xffffff;
			    }
			}
		    }
		}
	    }
	    method9107(aShortArray7373, aByteArray7374, aShortArray7357, i,
		       i_918_);
	    aShortArray7373 = null;
	}
	if (!bool || Class250.method4604((byte) -16) < l + (long) anInt7400) {
	    method9121();
	    return true;
	}
	return false;
    }
    
    static void method9207(int[] is, int i, int i_950_, int i_951_, int i_952_,
			   int i_953_, int i_954_, int i_955_, boolean bool,
			   boolean bool_956_, boolean bool_957_,
			   boolean bool_958_) {
	for (int i_959_ = i; i_959_ <= i_950_; i_959_++) {
	    boolean bool_960_
		= bool_956_ ? (aBoolArray7387[anInt7385]
			       && i_950_ - i_959_ < (aClass622_7353.anInt8142
						     * -1804667875)) : false;
	    boolean bool_961_
		= (bool_958_
		   ? (aBoolArray7387[anInt7356]
		      && i_959_ - i < aClass622_7353.anInt8142 * -1804667875)
		   : false);
	    for (int i_962_ = i_951_; i_962_ <= i_952_; i_962_++) {
		if (bool_960_ || bool_961_)
		    is[(i_953_ - i_962_ - 1) * i_953_ + i_959_]
			= aClass622_7353.anInt8141 * 1156690091;
		else {
		    boolean bool_963_
			= (bool
			   ? (aBoolArray7387[anInt7383]
			      && (i_952_ - i_962_
				  < aClass622_7353.anInt8142 * -1804667875))
			   : false);
		    boolean bool_964_
			= (bool_957_
			   ? (aBoolArray7387[anInt7361]
			      && (i_962_ - i_951_
				  < aClass622_7353.anInt8142 * -1804667875))
			   : false);
		    if (bool_963_ || bool_964_)
			is[(i_953_ - i_962_ - 1) * i_953_ + i_959_]
			    = aClass622_7353.anInt8141 * 1156690091;
		    else {
			int i_965_
			    = is[(i_953_ - i_962_ - 1) * i_953_ + i_959_];
			if (i_965_ != anInt7414) {
			    anInt7414 = i_965_;
			    anInt7360
				= (~0xffffff
				   | ((((aClass622_7353.anInt8127 * -962787217
					 & 0xff00ff) * i_954_
					+ (i_965_ & 0xff00ff) * i_955_)
				       & ~0xff00ff)
				      + ((((aClass622_7353.anInt8127
					    * -962787217)
					   & 0xff00) * i_954_
					  + (i_965_ & 0xff00) * i_955_)
					 & 0xff0000)) >> 8);
			}
			is[(i_953_ - i_962_ - 1) * i_953_ + i_959_]
			    = anInt7360;
		    }
		}
	    }
	}
    }
    
    static void method9208(int[] is, int i, int i_966_, int i_967_, int i_968_,
			   int i_969_, int i_970_, int i_971_, boolean bool,
			   boolean bool_972_, boolean bool_973_,
			   boolean bool_974_) {
	for (int i_975_ = i; i_975_ <= i_966_; i_975_++) {
	    boolean bool_976_
		= bool_972_ ? (aBoolArray7387[anInt7385]
			       && i_966_ - i_975_ < (aClass622_7353.anInt8142
						     * -1804667875)) : false;
	    boolean bool_977_
		= (bool_974_
		   ? (aBoolArray7387[anInt7356]
		      && i_975_ - i < aClass622_7353.anInt8142 * -1804667875)
		   : false);
	    for (int i_978_ = i_967_; i_978_ <= i_968_; i_978_++) {
		if (bool_976_ || bool_977_)
		    is[(i_969_ - i_978_ - 1) * i_969_ + i_975_]
			= aClass622_7353.anInt8141 * 1156690091;
		else {
		    boolean bool_979_
			= (bool
			   ? (aBoolArray7387[anInt7383]
			      && (i_968_ - i_978_
				  < aClass622_7353.anInt8142 * -1804667875))
			   : false);
		    boolean bool_980_
			= (bool_973_
			   ? (aBoolArray7387[anInt7361]
			      && (i_978_ - i_967_
				  < aClass622_7353.anInt8142 * -1804667875))
			   : false);
		    if (bool_979_ || bool_980_)
			is[(i_969_ - i_978_ - 1) * i_969_ + i_975_]
			    = aClass622_7353.anInt8141 * 1156690091;
		    else {
			int i_981_
			    = is[(i_969_ - i_978_ - 1) * i_969_ + i_975_];
			if (i_981_ != anInt7414) {
			    anInt7414 = i_981_;
			    anInt7360
				= (~0xffffff
				   | ((((aClass622_7353.anInt8127 * -962787217
					 & 0xff00ff) * i_970_
					+ (i_981_ & 0xff00ff) * i_971_)
				       & ~0xff00ff)
				      + ((((aClass622_7353.anInt8127
					    * -962787217)
					   & 0xff00) * i_970_
					  + (i_981_ & 0xff00) * i_971_)
					 & 0xff0000)) >> 8);
			}
			is[(i_969_ - i_978_ - 1) * i_969_ + i_975_]
			    = anInt7360;
		    }
		}
	    }
	}
    }
    
    static boolean method9209(Class534_Sub18_Sub9 class534_sub18_sub9) {
	if (class534_sub18_sub9 != null
	    && class534_sub18_sub9 != aClass534_Sub18_Sub9_7354) {
	    aClass534_Sub18_Sub9_7354 = class534_sub18_sub9;
	    aBool7380 = (aClass534_Sub18_Sub9_7354.anInt11766 * 848546455
			 == aClass622_7353.anInt8138 * -359981155);
	    return true;
	}
	return false;
    }
    
    static void method9210(int[] is, int i, int i_982_, int i_983_, int i_984_,
			   int i_985_, int i_986_) {
	for (int i_987_ = 0; i_987_ < aClass622_7353.anInt8143 * -1255575643;
	     i_987_++) {
	    int i_988_ = i_987_;
	    if (i_986_ == anInt7362 || i_986_ == anInt7386)
		i_988_ = aClass622_7353.anInt8143 * -1255575643 - i_987_ - 1;
	    for (int i_989_ = 0;
		 i_989_ < aClass622_7353.anInt8143 * -1255575643; i_989_++) {
		int i_990_ = i_989_;
		if (i_986_ == anInt7386 || i_986_ == anInt7403)
		    i_990_
			= aClass622_7353.anInt8143 * -1255575643 - i_989_ - 1;
		int i_991_ = anIntArrayArray7346[i_988_][i_990_];
		if (i_991_ != 0) {
		    if (i_991_ == 1) {
			int i_992_
			    = is[((i_983_ - i_982_ - i_989_ - 1) * i_983_ + i
				  + i_987_)];
			if (i_992_ != anInt7414) {
			    anInt7414 = i_992_;
			    anInt7360
				= (~0xffffff
				   | ((((aClass622_7353.anInt8127 * -962787217
					 & 0xff00ff) * i_984_
					+ (i_992_ & 0xff00ff) * i_985_)
				       & ~0xff00ff)
				      + ((((aClass622_7353.anInt8127
					    * -962787217)
					   & 0xff00) * i_984_
					  + (i_992_ & 0xff00) * i_985_)
					 & 0xff0000)) >> 8);
			}
			is[((i_983_ - i_982_ - i_989_ - 1) * i_983_ + i
			    + i_987_)]
			    = anInt7360;
		    } else if (i_991_ == 2)
			is[((i_983_ - i_982_ - i_989_ - 1) * i_983_ + i
			    + i_987_)]
			    = aClass622_7353.anInt8141 * 1156690091;
		}
	    }
	}
    }
    
    static int method9211(long l) {
	Class163 class163 = (Class163) aClass203_7375.method3871(l);
	if (class163 != null)
	    return class163.method2647();
	return -1;
    }
    
    static void method9212(int[] is, int i, int i_993_, int i_994_, int i_995_,
			   int i_996_, int i_997_) {
	for (int i_998_ = 0; i_998_ < aClass622_7353.anInt8143 * -1255575643;
	     i_998_++) {
	    int i_999_ = i_998_;
	    if (i_997_ == anInt7362 || i_997_ == anInt7386)
		i_999_ = aClass622_7353.anInt8143 * -1255575643 - i_998_ - 1;
	    for (int i_1000_ = 0;
		 i_1000_ < aClass622_7353.anInt8143 * -1255575643; i_1000_++) {
		int i_1001_ = i_1000_;
		if (i_997_ == anInt7386 || i_997_ == anInt7403)
		    i_1001_
			= aClass622_7353.anInt8143 * -1255575643 - i_1000_ - 1;
		int i_1002_ = anIntArrayArray7346[i_999_][i_1001_];
		if (i_1002_ != 0) {
		    if (i_1002_ == 1) {
			int i_1003_
			    = is[((i_994_ - i_993_ - i_1000_ - 1) * i_994_ + i
				  + i_998_)];
			if (i_1003_ != anInt7414) {
			    anInt7414 = i_1003_;
			    anInt7360
				= (~0xffffff
				   | ((((aClass622_7353.anInt8127 * -962787217
					 & 0xff00ff) * i_995_
					+ (i_1003_ & 0xff00ff) * i_996_)
				       & ~0xff00ff)
				      + ((((aClass622_7353.anInt8127
					    * -962787217)
					   & 0xff00) * i_995_
					  + (i_1003_ & 0xff00) * i_996_)
					 & 0xff0000)) >> 8);
			}
			is[((i_994_ - i_993_ - i_1000_ - 1) * i_994_ + i
			    + i_998_)]
			    = anInt7360;
		    } else if (i_1002_ == 2)
			is[((i_994_ - i_993_ - i_1000_ - 1) * i_994_ + i
			    + i_998_)]
			    = aClass622_7353.anInt8141 * 1156690091;
		}
	    }
	}
    }
    
    static void method9213(int i, int i_1004_, int i_1005_, int i_1006_,
			   boolean bool, boolean bool_1007_,
			   boolean bool_1008_, Class185 class185) {
	int i_1009_ = i * 64;
	int i_1010_ = i_1004_ * 64;
	if (anIntArray7398 == null
	    || anIntArray7398.length != i_1005_ * i_1005_)
	    anIntArray7398 = new int[i_1005_ * i_1005_];
	boolean bool_1011_ = aBool7380 && !bool_1008_;
	for (int i_1012_ = 0; i_1012_ < 64; i_1012_++) {
	    int i_1013_ = i_1009_ + i_1012_;
	    int i_1014_ = i_1012_ * i_1005_ / 64;
	    int i_1015_ = (i_1012_ + 1) * i_1005_ / 64 - 1;
	    if (i_1015_ < i_1014_)
		i_1015_ = i_1014_;
	    for (int i_1016_ = 0; i_1016_ < 64; i_1016_++) {
		int i_1017_ = i_1010_ + i_1016_;
		boolean bool_1018_ = bool;
		if (bool_1011_ && !method9193(i_1013_, i_1017_))
		    bool_1018_ = false;
		int i_1019_ = i_1013_ + i_1017_ * anInt7370;
		boolean bool_1020_ = false;
		boolean bool_1021_ = false;
		Object object = null;
		int i_1022_ = ((aByteArray7374[i_1019_] & 0xff) << 16
			       | aShortArray7357[i_1019_] & 0xffff);
		if (i_1022_ != 0)
		    i_1022_ |= ~0xffffff;
		short i_1023_ = aShortArray7376[i_1019_];
		object = anObjectArray7367[i_1019_];
		int i_1024_ = i_1016_ * i_1005_ / 64;
		int i_1025_ = (i_1016_ + 1) * i_1005_ / 64 - 1;
		if (i_1025_ < i_1024_)
		    i_1025_ = i_1024_;
		if (object != null) {
		    if (object instanceof Class534_Sub38) {
			Class534_Sub38 class534_sub38
			    = (Class534_Sub38) object;
			if (class534_sub38 != null)
			    method9129(anIntArray7398, i_1014_, i_1015_,
				       i_1024_, i_1025_, i_1005_, bool_1018_,
				       i_1022_, i_1023_,
				       aByteArray7377[i_1019_],
				       class534_sub38.anIntArray10806,
				       class534_sub38.aByteArray10805, true);
		    } else {
			Integer integer = (Integer) object;
			anIntArray7363[0] = integer.intValue();
			aByteArray7382[0] = aByteArray7379[i_1019_];
			method9129(anIntArray7398, i_1014_, i_1015_, i_1024_,
				   i_1025_, i_1005_, bool_1018_, i_1022_,
				   i_1023_, aByteArray7377[i_1019_],
				   anIntArray7363, aByteArray7382, true);
		    }
		} else
		    method9129(anIntArray7398, i_1014_, i_1015_, i_1024_,
			       i_1025_, i_1005_, bool_1018_, i_1022_, i_1023_,
			       aByteArray7377[i_1019_], null, null, true);
	    }
	}
	if (bool_1007_) {
	    for (int i_1026_ = 0; i_1026_ < 64; i_1026_++) {
		int i_1027_ = i_1009_ + i_1026_;
		boolean bool_1028_ = i_1026_ == 0 && i_1027_ != 0;
		for (int i_1029_ = 0; i_1029_ < 64; i_1029_++) {
		    int i_1030_ = i_1010_ + i_1029_;
		    if (!bool_1011_ || method9193(i_1027_, i_1030_)) {
			boolean bool_1031_ = i_1029_ == 0 && i_1030_ != 0;
			int i_1032_ = i_1027_ + i_1030_ * anInt7370;
			if (bool_1028_ && bool_1031_)
			    method9130(class185, anIntArray7398, i_1005_, -1,
				       -1, i_1027_ - 1, i_1030_ - 1,
				       i_1032_ - 1 - anInt7370);
			if (bool_1028_)
			    method9130(class185, anIntArray7398, i_1005_, -1,
				       i_1029_, i_1027_ - 1, i_1030_,
				       i_1032_ - 1);
			if (bool_1031_)
			    method9130(class185, anIntArray7398, i_1005_,
				       i_1026_, -1, i_1027_, i_1030_ - 1,
				       i_1032_ - anInt7370);
			method9130(class185, anIntArray7398, i_1005_, i_1026_,
				   i_1029_, i_1027_, i_1030_, i_1032_);
		    }
		}
	    }
	}
	int i_1033_ = i * 64 / 64;
	int i_1034_ = i_1004_ * 64 / 64;
	for (int i_1035_ = 0; i_1035_ < 3; i_1035_++) {
	    for (int i_1036_ = 0; i_1036_ < 64; i_1036_++) {
		int i_1037_ = i_1009_ + i_1036_;
		int i_1038_ = i_1037_ & 0x3f;
		int i_1039_ = i_1036_ * i_1005_ / 64;
		int i_1040_ = (i_1036_ + 1) * i_1005_ / 64 - 1;
		if (i_1040_ < i_1039_)
		    i_1040_ = i_1039_;
		for (int i_1041_ = 0; i_1041_ < 64; i_1041_++) {
		    int i_1042_ = i_1010_ + i_1041_;
		    boolean bool_1043_ = bool;
		    if (bool_1011_ && !method9193(i_1037_, i_1042_))
			bool_1043_ = false;
		    int i_1044_ = i_1042_ & 0x3f;
		    int i_1045_ = i_1041_ * i_1005_ / 64;
		    int i_1046_ = (i_1041_ + 1) * i_1005_ / 64 - 1;
		    if (i_1046_ < i_1045_)
			i_1046_ = i_1045_;
		    HashMap hashmap = (aHashMapArrayArrayArray7391[i_1035_]
				       [i_1033_][i_1034_]);
		    if (hashmap != null) {
			Class541 class541
			    = ((Class541)
			       hashmap.get(Integer.valueOf((i_1038_ << 8)
							   + i_1044_)));
			if (class541 != null)
			    method9129(anIntArray7398, i_1039_, i_1040_,
				       i_1045_, i_1046_, i_1005_, bool_1043_,
				       class541.anInt7179, class541.aShort7178,
				       class541.aByte7180,
				       class541.anIntArray7175,
				       class541.aByteArray7181, false);
		    }
		}
	    }
	    for (int i_1047_ = 0; i_1047_ < 64; i_1047_++) {
		int i_1048_ = i_1009_ + i_1047_;
		int i_1049_ = i_1048_ & 0x3f;
		for (int i_1050_ = 0; i_1050_ < 64; i_1050_++) {
		    int i_1051_ = i_1010_ + i_1050_;
		    if (!bool_1011_ || method9193(i_1048_, i_1051_)) {
			int i_1052_ = i_1051_ & 0x3f;
			HashMap hashmap = (aHashMapArrayArrayArray7391[i_1035_]
					   [i_1033_][i_1034_]);
			if (hashmap != null) {
			    Class541 class541
				= ((Class541)
				   hashmap.get(Integer.valueOf((i_1049_ << 8)
							       + i_1052_)));
			    if (class541 != null)
				method9189(class185, anIntArray7398, i_1005_,
					   i_1047_, i_1050_,
					   class541.anIntArray7175,
					   class541.aByteArray7181);
			}
		    }
		}
	    }
	}
	if (bool_1011_) {
	    int i_1053_ = 8;
	    for (int i_1054_ = 0; i_1054_ < i_1053_; i_1054_++) {
		int i_1055_ = i_1009_ + i_1054_ * 8;
		int i_1056_ = i_1054_ * i_1005_ / i_1053_;
		int i_1057_ = (i_1054_ + 1) * i_1005_ / i_1053_ - 1;
		for (int i_1058_ = 0; i_1058_ < i_1053_; i_1058_++) {
		    int i_1059_ = i_1010_ + i_1058_ * 8;
		    if (!method9193(i_1055_, i_1059_)) {
			int i_1060_ = i_1058_ * i_1005_ / i_1053_;
			int i_1061_ = (i_1058_ + 1) * i_1005_ / i_1053_ - 1;
			if (i_1005_ < 64)
			    method9141(anIntArray7398, i_1056_, i_1057_,
				       i_1060_, i_1061_, i_1005_);
			else {
			    aBoolArray7387[anInt7383]
				= method9193(i_1055_, i_1059_ + 8);
			    aBoolArray7387[anInt7362]
				= method9193(i_1055_ + 8, i_1059_ + 8);
			    aBoolArray7387[anInt7385]
				= method9193(i_1055_ + 8, i_1059_);
			    aBoolArray7387[anInt7386]
				= method9193(i_1055_ + 8, i_1059_ - 8);
			    aBoolArray7387[anInt7361]
				= method9193(i_1055_, i_1059_ - 8);
			    aBoolArray7387[anInt7403]
				= method9193(i_1055_ - 8, i_1059_ - 8);
			    aBoolArray7387[anInt7356]
				= method9193(i_1055_ - 8, i_1059_);
			    aBoolArray7387[anInt7390]
				= method9193(i_1055_ - 8, i_1059_ + 8);
			    method9140(anIntArray7398, i_1056_, i_1057_,
				       i_1060_, i_1061_, i_1005_);
			}
		    }
		}
	    }
	}
	aClass203_7375.method3893(class185.method3316(anIntArray7398, 0,
						      i_1005_, i_1005_,
						      i_1005_, true),
				  (long) i_1006_);
    }
    
    static void method9214(int[] is, int i, int i_1062_, int i_1063_,
			   int i_1064_, int i_1065_, int i_1066_, int i_1067_,
			   int i_1068_, byte[] is_1069_, int i_1070_,
			   int i_1071_) {
	int i_1072_ = 0;
	int i_1073_ = 0;
	int i_1074_ = i_1062_ - i + 1;
	int i_1075_ = i_1064_ - i_1063_ + 1;
	int i_1076_ = (i_1070_ << 16) / i_1074_;
	int i_1077_ = (is_1069_.length / i_1070_ << 16) / i_1075_;
	int i_1078_ = i + (i_1066_ - i_1064_ - 1) * i_1065_;
	int i_1079_ = i_1067_ >> 24;
	int i_1080_ = i_1068_ >> 24;
	if (i_1071_ == 0 || i_1071_ == 1 && i_1079_ == 255 && i_1080_ == 255) {
	    int i_1081_ = i_1072_;
	    for (int i_1082_ = -i_1075_; i_1082_ < 0; i_1082_++) {
		int i_1083_ = (i_1073_ >> 16) * i_1070_;
		for (int i_1084_ = -i_1074_; i_1084_ < 0; i_1084_++) {
		    if (is_1069_[(i_1072_ >> 16) + i_1083_] != 0)
			is[i_1078_++] = i_1068_;
		    else
			is[i_1078_++] = i_1067_;
		    i_1072_ += i_1076_;
		}
		i_1073_ += i_1077_;
		i_1072_ = i_1081_;
		i_1078_ += i_1065_ - i_1074_;
	    }
	} else if (i_1071_ == 1) {
	    int i_1085_ = i_1072_;
	    for (int i_1086_ = -i_1075_; i_1086_ < 0; i_1086_++) {
		int i_1087_ = (i_1073_ >> 16) * i_1070_;
		for (int i_1088_ = -i_1074_; i_1088_ < 0; i_1088_++) {
		    int i_1089_ = i_1067_;
		    if (is_1069_[(i_1072_ >> 16) + i_1087_] != 0)
			i_1089_ = i_1068_;
		    int i_1090_ = i_1089_ >>> 24;
		    int i_1091_ = 255 - i_1090_;
		    int i_1092_ = is[i_1078_];
		    is[i_1078_++]
			= ~0xffffff | ((((i_1089_ & 0xff00ff) * i_1090_
					 + (i_1092_ & 0xff00ff) * i_1091_)
					& ~0xff00ff)
				       + (((i_1089_ & 0xff00) * i_1090_
					   + (i_1092_ & 0xff00) * i_1091_)
					  & 0xff0000)) >> 8;
		    i_1072_ += i_1076_;
		}
		i_1073_ += i_1077_;
		i_1072_ = i_1085_;
		i_1078_ += i_1065_ - i_1074_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    static void method9215(int[] is, int i, int i_1093_, int i_1094_,
			   int i_1095_, int i_1096_, int i_1097_, int i_1098_,
			   int i_1099_, byte[] is_1100_, int i_1101_,
			   int i_1102_) {
	int i_1103_ = 0;
	int i_1104_ = 0;
	int i_1105_ = i_1093_ - i + 1;
	int i_1106_ = i_1095_ - i_1094_ + 1;
	int i_1107_ = (i_1101_ << 16) / i_1105_;
	int i_1108_ = (is_1100_.length / i_1101_ << 16) / i_1106_;
	int i_1109_ = i + (i_1097_ - i_1095_ - 1) * i_1096_;
	int i_1110_ = i_1098_ >> 24;
	int i_1111_ = i_1099_ >> 24;
	if (i_1102_ == 0 || i_1102_ == 1 && i_1110_ == 255 && i_1111_ == 255) {
	    int i_1112_ = i_1103_;
	    for (int i_1113_ = -i_1106_; i_1113_ < 0; i_1113_++) {
		int i_1114_ = (i_1104_ >> 16) * i_1101_;
		for (int i_1115_ = -i_1105_; i_1115_ < 0; i_1115_++) {
		    if (is_1100_[(i_1103_ >> 16) + i_1114_] != 0)
			is[i_1109_++] = i_1099_;
		    else
			is[i_1109_++] = i_1098_;
		    i_1103_ += i_1107_;
		}
		i_1104_ += i_1108_;
		i_1103_ = i_1112_;
		i_1109_ += i_1096_ - i_1105_;
	    }
	} else if (i_1102_ == 1) {
	    int i_1116_ = i_1103_;
	    for (int i_1117_ = -i_1106_; i_1117_ < 0; i_1117_++) {
		int i_1118_ = (i_1104_ >> 16) * i_1101_;
		for (int i_1119_ = -i_1105_; i_1119_ < 0; i_1119_++) {
		    int i_1120_ = i_1098_;
		    if (is_1100_[(i_1103_ >> 16) + i_1118_] != 0)
			i_1120_ = i_1099_;
		    int i_1121_ = i_1120_ >>> 24;
		    int i_1122_ = 255 - i_1121_;
		    int i_1123_ = is[i_1109_];
		    is[i_1109_++]
			= ~0xffffff | ((((i_1120_ & 0xff00ff) * i_1121_
					 + (i_1123_ & 0xff00ff) * i_1122_)
					& ~0xff00ff)
				       + (((i_1120_ & 0xff00) * i_1121_
					   + (i_1123_ & 0xff00) * i_1122_)
					  & 0xff0000)) >> 8;
		    i_1103_ += i_1107_;
		}
		i_1104_ += i_1108_;
		i_1103_ = i_1116_;
		i_1109_ += i_1096_ - i_1105_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
    
    static void method9216(int[] is, int i, int i_1124_, int i_1125_,
			   int i_1126_, int i_1127_, int i_1128_, int i_1129_,
			   int i_1130_, byte[] is_1131_, int i_1132_,
			   int i_1133_) {
	int i_1134_ = 0;
	int i_1135_ = 0;
	int i_1136_ = i_1124_ - i + 1;
	int i_1137_ = i_1126_ - i_1125_ + 1;
	int i_1138_ = (i_1132_ << 16) / i_1136_;
	int i_1139_ = (is_1131_.length / i_1132_ << 16) / i_1137_;
	int i_1140_ = i + (i_1128_ - i_1126_ - 1) * i_1127_;
	int i_1141_ = i_1129_ >> 24;
	int i_1142_ = i_1130_ >> 24;
	if (i_1133_ == 0 || i_1133_ == 1 && i_1141_ == 255 && i_1142_ == 255) {
	    int i_1143_ = i_1134_;
	    for (int i_1144_ = -i_1137_; i_1144_ < 0; i_1144_++) {
		int i_1145_ = (i_1135_ >> 16) * i_1132_;
		for (int i_1146_ = -i_1136_; i_1146_ < 0; i_1146_++) {
		    if (is_1131_[(i_1134_ >> 16) + i_1145_] != 0)
			is[i_1140_++] = i_1130_;
		    else
			is[i_1140_++] = i_1129_;
		    i_1134_ += i_1138_;
		}
		i_1135_ += i_1139_;
		i_1134_ = i_1143_;
		i_1140_ += i_1127_ - i_1136_;
	    }
	} else if (i_1133_ == 1) {
	    int i_1147_ = i_1134_;
	    for (int i_1148_ = -i_1137_; i_1148_ < 0; i_1148_++) {
		int i_1149_ = (i_1135_ >> 16) * i_1132_;
		for (int i_1150_ = -i_1136_; i_1150_ < 0; i_1150_++) {
		    int i_1151_ = i_1129_;
		    if (is_1131_[(i_1134_ >> 16) + i_1149_] != 0)
			i_1151_ = i_1130_;
		    int i_1152_ = i_1151_ >>> 24;
		    int i_1153_ = 255 - i_1152_;
		    int i_1154_ = is[i_1140_];
		    is[i_1140_++]
			= ~0xffffff | ((((i_1151_ & 0xff00ff) * i_1152_
					 + (i_1154_ & 0xff00ff) * i_1153_)
					& ~0xff00ff)
				       + (((i_1151_ & 0xff00) * i_1152_
					   + (i_1154_ & 0xff00) * i_1153_)
					  & 0xff0000)) >> 8;
		    i_1134_ += i_1138_;
		}
		i_1135_ += i_1139_;
		i_1134_ = i_1147_;
		i_1140_ += i_1127_ - i_1136_;
	    }
	} else
	    throw new IllegalArgumentException();
    }
}
