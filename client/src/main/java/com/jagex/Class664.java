/* Class664 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class664
{
    static Class664 aClass664_8554;
    public static Class664 aClass664_8555;
    static Class664 aClass664_8556 = new Class664();
    
    Class664() {
	/* empty */
    }
    
    static {
	aClass664_8555 = new Class664();
	aClass664_8554 = new Class664();
    }
    
    public static String method10998(Object[] objects, int i, int i_0_,
				     byte i_1_) {
	if (0 == i_0_)
	    return "";
	if (i_0_ == 1) {
	    CharSequence charsequence = (CharSequence) objects[i];
	    if (null == charsequence)
		return "null";
	    return charsequence.toString();
	}
	int i_2_ = i + i_0_;
	int i_3_ = 0;
	for (int i_4_ = i; i_4_ < i_2_; i_4_++) {
	    CharSequence charsequence = (CharSequence) objects[i_4_];
	    if (charsequence == null)
		i_3_ += 4;
	    else
		i_3_ += charsequence.length();
	}
	StringBuilder stringbuilder = new StringBuilder(i_3_);
	for (int i_5_ = i; i_5_ < i_2_; i_5_++) {
	    CharSequence charsequence = (CharSequence) objects[i_5_];
	    if (null == charsequence)
		stringbuilder.append("null");
	    else
		stringbuilder.append(charsequence);
	}
	return stringbuilder.toString();
    }
    
    public static void method10999(int i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10758, 1,
	     -1504479450);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10759, 1,
	     -993048637);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub10_10751, 1,
	     2122219799);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub25_10750, 1,
	     634892237);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub24_10756, 0,
	     2048976414);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub9_10748),
						       0, 211528037);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub1_10762),
						       0, -1103039857);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub6_10743),
						       0, 1456592400);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763, 0,
	     1873545473);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub12_10753, 0,
	     -1642626566);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub3_10767),
						       0, -1697241766);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub11_10749, 0,
	     1941702025);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub27_10781, 0,
	     -2112585501);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub27_10757, 0,
	     -2026459158);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub5_10737),
						       0, 891578197);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub22_10745,
	     1453209707 * Class302.aClass302_3246.anInt3244, 918997670);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub19_10741, 0,
	     -1192211223);
	if (Class254.aClass185_2683 != null
	    && Class254.aClass185_2683.method3534()
	    && Class254.aClass185_2683.method3409())
	    Class254.aClass185_2683.method3359();
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub33_10765, 0,
	     405161518);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub30_10739, 0,
	     160839020);
	Class480.method7924(165353041);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub20_10742, 2,
	     -214917270);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub37_10760, 2,
	     -1009550265);
	Class635.method10538(1889319419);
	client.aClass512_11100.method8501((byte) 56).method10157(1383155261);
	client.aBool11059 = true;
    }
}
