/* Class640 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class640
{
    public static Class640 aClass640_8318;
    static Class640 aClass640_8319;
    public static Class640 aClass640_8320 = new Class640(0, 2, 2, 1);
    static Class640 aClass640_8321;
    static Class640 aClass640_8322;
    public static Class640 aClass640_8323 = new Class640(1, 2, 2, 0);
    static Class640 aClass640_8324;
    public static Class640 aClass640_8325;
    public static Class640 aClass640_8326;
    public static Class640 aClass640_8327;
    static Class640 aClass640_8328;
    static Class640 aClass640_8329;
    static Class640 aClass640_8330;
    static Class640 aClass640_8331 = new Class640(2, 4, 4, 0);
    public static Class640 aClass640_8332;
    public int anInt8333;
    public int anInt8334;
    public int anInt8335;
    public int anInt8336;
    public static Class34 aClass34_8337;
    
    static {
	aClass640_8321 = new Class640(4, 1, 1, 1);
	aClass640_8318 = new Class640(6, 0, 4, 2);
	aClass640_8327 = new Class640(7, 0, 1, 1);
	aClass640_8324 = new Class640(8, 0, 4, 1);
	aClass640_8319 = new Class640(9, 0, 4, 1);
	aClass640_8326 = new Class640(10, 2, 2, 0);
	aClass640_8325 = new Class640(11, 0, 1, 2);
	aClass640_8328 = new Class640(12, 0, 1, 0);
	aClass640_8329 = new Class640(13, 0, 1, 0);
	aClass640_8330 = new Class640(14, 0, 4, 1);
	aClass640_8322 = new Class640(15, 0, 1, 0);
	aClass640_8332 = new Class640(16, 0, 4, 2);
    }
    
    Class640(int i, int i_0_, int i_1_, int i_2_) {
	anInt8333 = i * -903382041;
	anInt8334 = -1993371159 * i_0_;
	anInt8335 = -1939226833 * i_1_;
	anInt8336 = i_2_ * -1403162539;
    }
    
    static Class640[] method10591() {
	return (new Class640[]
		{ aClass640_8319, aClass640_8326, aClass640_8321,
		  aClass640_8328, aClass640_8329, aClass640_8320,
		  aClass640_8332, aClass640_8324, aClass640_8322,
		  aClass640_8331, aClass640_8327, aClass640_8330,
		  aClass640_8323, aClass640_8325, aClass640_8318 });
    }
    
    static Class640[] method10592() {
	return (new Class640[]
		{ aClass640_8319, aClass640_8326, aClass640_8321,
		  aClass640_8328, aClass640_8329, aClass640_8320,
		  aClass640_8332, aClass640_8324, aClass640_8322,
		  aClass640_8331, aClass640_8327, aClass640_8330,
		  aClass640_8323, aClass640_8325, aClass640_8318 });
    }
    
    public static Class640 method10593(int i) {
	Class640[] class640s = Class284.method5255((byte) 1);
	for (int i_3_ = 0; i_3_ < class640s.length; i_3_++) {
	    if (class640s[i_3_].anInt8333 * 41641943 == i)
		return class640s[i_3_];
	}
	return null;
    }
    
    static final void method10594(Class669 class669, int i) {
	int i_4_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_4_, 356211363);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2598 * 1797197351;
    }
    
    static final void method10595(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4205,
				  client.aClass100_11264.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16506(string.length() + 1, 193928517);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string,
							      610435626);
	client.aClass100_11264.method1863(class534_sub19, (byte) 54);
    }
    
    static final void method10596(Class669 class669, byte i) {
	Class711.method14418(class669.anIntArray8595[((class669.anInt8600
						       -= 308999563)
						      * 2088438307)],
			     (byte) 43);
    }
    
    public static final void method10597(int i) {
	for (int i_5_ = 0; i_5_ < 5; i_5_++)
	    client.aBoolArray11172[i_5_] = false;
	client.anInt11152 = 1871523627;
	client.anInt11153 = -378787251;
	Class77.anInt820 = 0;
	Class221.anInt2311 = 0;
	Class10.anInt75 = 1952677974;
	if (Class200_Sub5.method15573((byte) 37) == 3) {
	    Class597 class597 = client.aClass512_11100.method8416((byte) 22);
	    int i_6_ = -424199969 * class597.anInt7859 << 9;
	    int i_7_ = class597.anInt7861 * -1166289421 << 9;
	    int i_8_ = 1000 / Class469.method7641((byte) -7);
	    Class599.aClass298_Sub1_7871.method5351
		((float) i_8_ / 1000.0F,
		 (client.aClass512_11100.method8493(-1299046182)
		  .anIntArrayArrayArray4995),
		 client.aClass512_11100.method8552((byte) 0), i_6_, i_7_,
		 -351279669);
	}
	Class106.anInt1312 = 309821991;
	Class93.anInt901 = 1899572639;
	client.anInt11303 = -1427605517 * client.anInt11101;
	Class559.anInt7501 = 1813674585 * Class200_Sub13.anInt9937;
	Class18.anInt208 = -410893275 * Class677.anInt8654;
	Class226.anInt2318 = Class636.anInt8305 * -1314647103;
	Class479.anInt5250 = -196476289 * Class566.anInt7589;
	Class78.anInt827 = -2138584449 * Class641.anInt8341;
	Class26.anInt248 = client.anInt11323 * 368642879;
    }
    
    public static void method10598
	(Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1, int[] is,
	 int[] is_9_, int[] is_10_, byte i) {
	for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
	    int i_12_ = is[i_11_];
	    int i_13_ = is_10_[i_11_];
	    int i_14_ = is_9_[i_11_];
	    for (int i_15_ = 0;
		 i_13_ != 0 && i_15_ < (class654_sub1_sub5_sub1
					.aClass711_Sub3_Sub1Array11968).length;
		 i_13_ >>>= 1) {
		if ((i_13_ & 0x1) != 0) {
		    if (i_12_ == -1)
			class654_sub1_sub5_sub1
			    .aClass711_Sub3_Sub1Array11968[i_15_]
			    = null;
		    else {
			Class205 class205
			    = (Class205) Class200_Sub12.aClass44_Sub1_9934
					     .method91(i_12_, -1465977706);
			int i_16_ = class205.anInt2223 * 629077835;
			Class711_Sub3_Sub1 class711_sub3_sub1
			    = (class654_sub1_sub5_sub1
			       .aClass711_Sub3_Sub1Array11968[i_15_]);
			if (class711_sub3_sub1 != null
			    && class711_sub3_sub1.method14338((byte) 0)) {
			    if (i_12_ == class711_sub3_sub1
					     .method14329(1456571262)) {
				if (0 == i_16_) {
				    class654_sub1_sub5_sub1
					.aClass711_Sub3_Sub1Array11968[i_15_]
					= null;
				    class711_sub3_sub1 = null;
				} else if (i_16_ == 1) {
				    class711_sub3_sub1
					.method14374(-1672221306);
				    class711_sub3_sub1.anInt11918
					= i_14_ * -1464312229;
				} else if (i_16_ == 2)
				    class711_sub3_sub1.method14366((byte) 1);
			    } else if (995056269 * class205.anInt2217
				       >= ((class711_sub3_sub1.method14382
					    (-2124599712).anInt2217)
					   * 995056269)) {
				class654_sub1_sub5_sub1
				    .aClass711_Sub3_Sub1Array11968[i_15_]
				    = null;
				class711_sub3_sub1 = null;
			    }
			}
			if (null == class711_sub3_sub1
			    || !class711_sub3_sub1.method14338((byte) 0)) {
			    class711_sub3_sub1
				= class654_sub1_sub5_sub1
				      .aClass711_Sub3_Sub1Array11968[i_15_]
				= (new Class711_Sub3_Sub1
				   (class654_sub1_sub5_sub1));
			    class711_sub3_sub1.method14330(i_12_, 1204683537);
			    class711_sub3_sub1.anInt11918
				= i_14_ * -1464312229;
			}
		    }
		}
		i_15_++;
	    }
	}
    }
    
    public static void method10599(int i, boolean bool, int i_17_,
				   boolean bool_18_, byte i_19_) {
	Class9.method602(0, Class5.aClass606_Sub1Array42.length - 1, i, bool,
			 i_17_, bool_18_, (byte) 36);
	Class5.anInt40 = 0;
	Class5.aClass641_44 = null;
    }
}
