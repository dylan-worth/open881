/* Class200_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class200_Sub6 extends Class200
{
    String aString9904;
    int anInt9905;
    public static Class472 aClass472_9906;
    
    public void method3847() {
	if (client.anInt11023 * -1450626137 != -1)
	    Class522.method8715(client.anInt11023 * -1450626137, aString9904,
				1323283095 * anInt9905, -1456814371);
    }
    
    public void method3846() {
	if (client.anInt11023 * -1450626137 != -1)
	    Class522.method8715(client.anInt11023 * -1450626137, aString9904,
				1323283095 * anInt9905, 1885804729);
    }
    
    Class200_Sub6(Class534_Sub40 class534_sub40) {
	super(class534_sub40);
	aString9904 = class534_sub40.method16541((byte) -40);
	anInt9905 = class534_sub40.method16529((byte) 1) * -1982141145;
    }
    
    public void method3845(int i) {
	if (client.anInt11023 * -1450626137 != -1)
	    Class522.method8715(client.anInt11023 * -1450626137, aString9904,
				1323283095 * anInt9905, -512079222);
    }
    
    static final void method15574(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class661.method10972(class247, class243, class669, (byte) 1);
    }
    
    public static void method15575
	(Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1, int[] is, int i,
	 boolean bool, byte i_0_) {
	if (null != class654_sub1_sub5_sub1.anIntArray11946) {
	    boolean bool_1_ = true;
	    for (int i_2_ = 0;
		 i_2_ < class654_sub1_sub5_sub1.anIntArray11946.length;
		 i_2_++) {
		if (class654_sub1_sub5_sub1.anIntArray11946[i_2_]
		    != is[i_2_]) {
		    bool_1_ = false;
		    break;
		}
	    }
	    Class711 class711 = class654_sub1_sub5_sub1.aClass711_11948;
	    if (bool_1_ && class711.method14338((byte) 0)) {
		Class205 class205 = class654_sub1_sub5_sub1.aClass711_11948
					.method14382(-1943684181);
		int i_3_ = class205.anInt2223 * 629077835;
		if (i_3_ == 1)
		    class711.method14346(i, -1707913451);
		if (2 == i_3_)
		    class711.method14366((byte) 1);
	    }
	}
	boolean bool_4_ = true;
	for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
	    if (is[i_5_] != -1)
		bool_4_ = false;
	    if (null == class654_sub1_sub5_sub1.anIntArray11946
		|| class654_sub1_sub5_sub1.anIntArray11946[i_5_] == -1
		|| ((((Class205) Class200_Sub12.aClass44_Sub1_9934
				     .method91(is[i_5_], -639620890)).anInt2217
		     * 995056269)
		    >= ((Class205)
			(Class200_Sub12.aClass44_Sub1_9934.method91
			 (class654_sub1_sub5_sub1.anIntArray11946[i_5_],
			  803751193))).anInt2217 * 995056269)) {
		class654_sub1_sub5_sub1.anIntArray11946 = is;
		class654_sub1_sub5_sub1.aClass711_11948.method14333(i,
								    (byte) 45);
		if (bool)
		    class654_sub1_sub5_sub1.anInt11937
			= -1267839587 * class654_sub1_sub5_sub1.anInt11980;
	    }
	}
	if (bool_4_) {
	    class654_sub1_sub5_sub1.anIntArray11946 = is;
	    class654_sub1_sub5_sub1.aClass711_11948.method14333(i, (byte) 102);
	    if (bool)
		class654_sub1_sub5_sub1.anInt11937
		    = class654_sub1_sub5_sub1.anInt11980 * -1267839587;
	}
    }
    
    public static void method15576(String string, String string_6_,
				   String string_7_, boolean bool, int i) {
	if (string.length() <= 320 && Class535.method8895((byte) 3)) {
	    Class305.method5604(400692199);
	    Class65.aString694 = string;
	    Class65.aString665 = string_6_;
	    Class65.aString696 = string_7_;
	    Class65.aBool697 = bool;
	    Class673.method11110(12, 131389577);
	}
    }
}
