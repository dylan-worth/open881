/* Class216 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class216 implements Interface28
{
    boolean aBool2298;
    Class213 this$0;
    static int anInt2299;
    int anInt2300;
    
    Class216(Class213 class213, Class534_Sub40 class534_sub40) {
	this$0 = class213;
	anInt2300 = class534_sub40.method16529((byte) 1) * 1761662661;
	aBool2298 = class534_sub40.method16527(-1020459911) == 1;
    }
    
    public void method173(Class214 class214, int i) {
	class214.method4045(-72206323 * anInt2300, aBool2298, 494159697);
	class214.method4044(anInt2300 * -72206323, 1481307617)
	    .method3998((byte) -33);
    }
    
    public void method172(Class214 class214) {
	class214.method4045(-72206323 * anInt2300, aBool2298, 494159697);
	class214.method4044(anInt2300 * -72206323, 1481307617)
	    .method3998((byte) -7);
    }
    
    public void method174(Class214 class214) {
	class214.method4045(-72206323 * anInt2300, aBool2298, 494159697);
	class214.method4044(anInt2300 * -72206323, 1481307617)
	    .method3998((byte) -124);
    }
    
    public static void method4111(int i, int i_0_, String string,
				  String string_1_, String string_2_,
				  String string_3_, String string_4_, int i_5_,
				  Class407 class407, byte i_6_) {
	Class270 class270
	    = (Class270) Class274.aMap3037.get(Integer.valueOf(i));
	if (class270 == null) {
	    class270 = new Class270();
	    Class274.aMap3037.put(Integer.valueOf(i), class270);
	}
	Class534_Sub18_Sub14 class534_sub18_sub14
	    = class270.method5025(i, i_0_, string, string_1_, string_2_,
				  string_3_, string_4_, i_5_, class407,
				  (byte) -70);
	Class274.aClass9_3036.method581(class534_sub18_sub14,
					(long) (class534_sub18_sub14.anInt11808
						* -759944081));
	Class274.aClass696_3038.method14076(class534_sub18_sub14, (byte) 43);
	client.anInt11045 = -910438199 * client.anInt11095;
    }
    
    static final void method4112(byte i) {
	Class589.method9874(Class254.aClass185_2683, (long) client.anInt11101);
	if (-1 != client.anInt11185 * -993629849)
	    Class210.method3956(client.anInt11185 * -993629849, 1242948374);
	for (int i_7_ = 0; i_7_ < client.anInt11249 * 1372795039; i_7_++) {
	    client.aBoolArray11214[i_7_] = client.aBoolArray11180[i_7_];
	    client.aBoolArray11180[i_7_] = false;
	}
	client.anInt11282 = 200492421 * client.anInt11101;
	if (-993629849 * client.anInt11185 != -1) {
	    client.anInt11249 = 0;
	    Class648.method10704((byte) 0);
	}
	Class254.aClass185_2683.method3537();
	Class534_Sub26.method16303(Class254.aClass185_2683, (byte) 108);
	int i_8_ = Class113.method2072(1237026822);
	if (i_8_ == -1)
	    i_8_ = client.anInt11215 * 846725895;
	if (i_8_ == -1)
	    i_8_ = 965081907 * client.anInt11055;
	Class560.method9432(i_8_, 1259429061);
	client.anInt11111 = 0;
    }
    
    static void method4113(Class568[][][] class568s, int i) {
	for (int i_9_ = 0; i_9_ < class568s.length; i_9_++) {
	    Class568[][] class568s_10_ = class568s[i_9_];
	    for (int i_11_ = 0; i_11_ < class568s_10_.length; i_11_++) {
		for (int i_12_ = 0; i_12_ < class568s_10_[i_11_].length;
		     i_12_++) {
		    Class568 class568 = class568s_10_[i_11_][i_12_];
		    if (null != class568) {
			if (class568.aClass654_Sub1_Sub2_7607
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub2_7607)
				.method411(-2084816632);
			if (class568.aClass654_Sub1_Sub3_7600
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub3_7600)
				.method411(-2084816632);
			if (class568.aClass654_Sub1_Sub3_7601
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub3_7601)
				.method411(-2084816632);
			if (class568.aClass654_Sub1_Sub1_7598
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub1_7598)
				.method411(-2084816632);
			if (class568.aClass654_Sub1_Sub1_7597
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub1_7597)
				.method411(-2084816632);
			for (Class559 class559 = class568.aClass559_7604;
			     null != class559;
			     class559 = class559.aClass559_7497) {
			    Class654_Sub1_Sub5 class654_sub1_sub5
				= class559.aClass654_Sub1_Sub5_7500;
			    if (class654_sub1_sub5 instanceof Interface62)
				((Interface62) class654_sub1_sub5)
				    .method411(-2084816632);
			}
		    }
		}
	    }
	}
    }
}
