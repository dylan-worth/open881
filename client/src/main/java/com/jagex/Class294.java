/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class294
{
    static Class294 aClass294_3133;
    static Class294 aClass294_3134;
    static Class294 aClass294_3135;
    static Class294 aClass294_3136;
    static Class294 aClass294_3137;
    static Class294 aClass294_3138;
    static Class294 aClass294_3139;
    static Class294 aClass294_3140;
    static Class294 aClass294_3141;
    static Class294 aClass294_3142 = new Class294(0, Class58.aClass58_474, 2);
    static Class294 aClass294_3143;
    static Class294 aClass294_3144;
    static Class294 aClass294_3145;
    static Class294 aClass294_3146;
    static Class294 aClass294_3147;
    public int anInt3148;
    int anInt3149;
    static Class294 aClass294_3150;
    Class58 aClass58_3151;
    Class58 aClass58_3152;
    static Class294 aClass294_3153;
    static Class294 aClass294_3154;
    int anInt3155;
    boolean aBool3156;
    boolean aBool3157;
    public static Class472 aClass472_3158;
    
    Class294(int i, Class58 class58, Class58 class58_0_, int i_1_, int i_2_,
	     boolean bool, boolean bool_3_) {
	anInt3148 = -1308202205 * i;
	aClass58_3152 = class58;
	aClass58_3151 = class58_0_;
	anInt3149 = i_1_ * -1471041949;
	anInt3155 = -1163696883 * i_2_;
	aBool3156 = bool;
	aBool3157 = bool_3_;
    }
    
    Class294(int i, Class58 class58, int i_4_) {
	this(i, class58, class58, i_4_, i_4_, true, false);
    }
    
    Class294(int i, Class58 class58, Class58 class58_5_, int i_6_, int i_7_) {
	this(i, class58, class58_5_, i_6_, i_7_, true, false);
    }
    
    static Class294[] method5317(byte i) {
	return (new Class294[]
		{ aClass294_3142, aClass294_3140, aClass294_3136,
		  aClass294_3139, aClass294_3137, aClass294_3133,
		  aClass294_3153, aClass294_3146, aClass294_3141,
		  aClass294_3135, aClass294_3143, aClass294_3144,
		  aClass294_3145, aClass294_3138, aClass294_3147,
		  aClass294_3154, aClass294_3134, aClass294_3150 });
    }
    
    static {
	aClass294_3140 = new Class294(1, Class58.aClass58_474,
				      Class58.aClass58_474, 2, 3);
	aClass294_3136 = new Class294(2, Class58.aClass58_474, 3);
	aClass294_3139 = new Class294(3, Class58.aClass58_474,
				      Class58.aClass58_474, 3, 4);
	aClass294_3137 = new Class294(4, Class58.aClass58_474, 4);
	aClass294_3133 = new Class294(5, Class58.aClass58_474,
				      Class58.aClass58_474, 4, 5);
	aClass294_3153 = new Class294(6, Class58.aClass58_474,
				      Class58.aClass58_474, 5, 98, true, true);
	aClass294_3146 = new Class294(7, Class58.aClass58_474, 99);
	aClass294_3141 = new Class294(8, Class58.aClass58_474, 100);
	aClass294_3135 = new Class294(9, Class58.aClass58_563,
				      Class58.aClass58_563, 0, 92, true, true);
	aClass294_3143 = new Class294(10, Class58.aClass58_563,
				      Class58.aClass58_563, 92, 93);
	aClass294_3144 = new Class294(11, Class58.aClass58_563,
				      Class58.aClass58_563, 94, 95);
	aClass294_3145 = new Class294(12, Class58.aClass58_563,
				      Class58.aClass58_563, 96, 97);
	aClass294_3138 = new Class294(13, Class58.aClass58_563, 97);
	aClass294_3147 = new Class294(14, Class58.aClass58_563, 97);
	aClass294_3154 = new Class294(15, Class58.aClass58_563, 100);
	aClass294_3134 = new Class294(16, Class58.aClass58_563, 100);
	aClass294_3150 = new Class294(17, Class58.aClass58_563, 100);
    }
    
    static void method5318(short i) {
	Class347_Sub2 class347_sub2
	    = ((Class347_Sub2)
	       Class51.aClass298_Sub1_412.method5380((byte) -90));
	Class706_Sub3 class706_sub3
	    = ((Class706_Sub3)
	       Class51.aClass298_Sub1_412.method5381(1414052951));
	Class438 class438 = class347_sub2.method6137(-1968989372);
	Class443 class443 = class706_sub3.method17272(1532776405);
	if (null != client.aClass247_11226) {
	    int i_8_ = client.aClass247_11226.anInt2468 * -881188269;
	    int i_9_ = client.aClass247_11226.anInt2469 * -1279656873;
	    float f = 1000.0F;
	    float f_10_ = (float) (2.0 * Math.atan((double) ((float) i_8_
							     / 2.0F / f)));
	    float f_11_ = (float) (2.0 * Math.atan((double) ((float) i_9_
							     / 2.0F / f)));
	    try {
		Class51.aClass298_Sub1_412.method5370(f_10_, f_11_,
						      (byte) -43);
	    } catch (Exception_Sub2 exception_sub2) {
		/* empty */
	    }
	}
	if (Class81.aClass563_834.method9501((byte) -31)) {
	    Class443 class443_12_ = Class443.method7137();
	    class443_12_.method7147(1.0F, 0.0F, 0.0F,
				    ((float) (Class81.aClass563_834
						  .method9477(1361395564)
					      - (RuntimeException_Sub4
						 .anInt12126) * -230736199)
				     / 200.0F));
	    class443.method7158(class443_12_);
	    Class438 class438_13_ = Class438.method6996(0.0F, 1.0F, 0.0F);
	    class438_13_.method7021(class443);
	    Class443 class443_14_ = Class443.method7137();
	    class443_14_.method7146(class438_13_,
				    ((float) (1453851069 * Class51.anInt413
					      - Class81.aClass563_834
						    .method9493(-1844010179))
				     / 200.0F));
	    class443.method7158(class443_14_);
	    class706_sub3.method17278(class443, (byte) 1);
	}
	Class51.anInt413
	    = Class81.aClass563_834.method9493(-1140756520) * 742277525;
	RuntimeException_Sub4.anInt12126
	    = Class81.aClass563_834.method9477(1088993516) * -1144821879;
	class443.method7182();
	if (Class666.aClass547_8577.method8995(98, (byte) -55)) {
	    Class438 class438_15_ = Class438.method6996(0.0F, 0.0F, 25.0F);
	    class438_15_.method7021(class443);
	    class438_15_.aFloat4863 *= -1.0F;
	    class438.method7026(class438_15_);
	}
	if (Class666.aClass547_8577.method8995(99, (byte) -71)) {
	    Class438 class438_16_ = Class438.method6996(0.0F, 0.0F, -25.0F);
	    class438_16_.method7021(class443);
	    class438_16_.aFloat4863 *= -1.0F;
	    class438.method7026(class438_16_);
	}
	if (Class666.aClass547_8577.method8995(96, (byte) -47)) {
	    Class438 class438_17_ = Class438.method6996(-25.0F, 0.0F, 0.0F);
	    class438_17_.method7021(class443);
	    class438_17_.aFloat4863 *= -1.0F;
	    class438.method7026(class438_17_);
	}
	if (Class666.aClass547_8577.method8995(97, (byte) -82)) {
	    Class438 class438_18_ = Class438.method6996(25.0F, 0.0F, 0.0F);
	    class438_18_.method7021(class443);
	    class438_18_.aFloat4863 *= -1.0F;
	    class438.method7026(class438_18_);
	}
	Class534_Sub36 class534_sub36
	    = new Class534_Sub36(0, (int) class438.aFloat4864,
				 (int) class438.aFloat4863,
				 (int) class438.aFloat4865);
	class347_sub2.method15787(class534_sub36, -1062631237);
	Class597 class597 = client.aClass512_11100.method8416((byte) 122);
	int i_19_ = class597.anInt7859 * -424199969 << 9;
	int i_20_ = class597.anInt7861 * -1166289421 << 9;
	Class51.aClass298_Sub1_412.method5351(0.02F,
					      (client.aClass512_11100
						   .method8493
					       (-568127574)
					       .anIntArrayArrayArray4995),
					      client.aClass512_11100
						  .method8552((byte) 0),
					      i_19_, i_20_, 1315681551);
    }
    
    static void method5319
	(Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2,
	 boolean bool, byte i) {
	if (Class72.anInt765 * 324852453 < 407) {
	    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
		== class654_sub1_sub5_sub1_sub2) {
		if (client.aBool11218
		    && (Class200_Sub14.anInt9950 * 460977285 & 0x10) != 0)
		    Class112.method2016
			(client.aString11221,
			 new StringBuilder().append(client.aString11222).append
			     (" ").append
			     (Class29.aString263).append
			     (" ").append
			     (Class154.method2575(16777215, -881414397)).append
			     (Class58.aClass58_568.method1245
			      (Class539.aClass672_7171, (byte) -75))
			     .toString(),
			 Class460.anInt5069 * -731032933, 16, -1, 0L, 0, 0,
			 true, false,
			 (long) (class654_sub1_sub5_sub1_sub2.anInt11922
				 * 1126388985),
			 false, (short) 17854);
	    } else {
		String string;
		if (0
		    == class654_sub1_sub5_sub1_sub2.anInt12221 * -825066439) {
		    boolean bool_21_ = true;
		    if ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.anInt12220
			 * 800727223) != -1
			&& (800727223 * class654_sub1_sub5_sub1_sub2.anInt12220
			    != -1)) {
			int i_22_
			    = (((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				 .anInt12220) * 800727223
				< (class654_sub1_sub5_sub1_sub2.anInt12220
				   * 800727223))
			       ? (800727223
				  * (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .anInt12220))
			       : (class654_sub1_sub5_sub1_sub2.anInt12220
				  * 800727223));
			int i_23_
			    = ((1423663301
				* (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				   .anInt12210))
			       - (1423663301
				  * class654_sub1_sub5_sub1_sub2.anInt12210));
			if (i_23_ < 0)
			    i_23_ = -i_23_;
			if (i_23_ > i_22_)
			    bool_21_ = false;
		    }
		    String string_24_
			= (client.aClass675_11016 == Class675.aClass675_8635
			   ? Class58.aClass58_597.method1245((Class539
							      .aClass672_7171),
							     (byte) -89)
			   : Class58.aClass58_595.method1245((Class539
							      .aClass672_7171),
							     (byte) -102));
		    if (class654_sub1_sub5_sub1_sub2.anInt12210 * 1423663301
			>= (class654_sub1_sub5_sub1_sub2.anInt12219
			    * -2058823415))
			string
			    = new StringBuilder().append
				  (class654_sub1_sub5_sub1_sub2
				       .method18877(true, 1566170862))
				  .append
				  (bool_21_
				   ? (Class292.method5304
				      ((1423663301
					* (class654_sub1_sub5_sub1_sub2
					   .anInt12210)),
				       (Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.anInt12210) * 1423663301,
				       -956553032))
				   : Class154.method2575(16777215, 1152153143))
				  .append
				  (Class29.aString261).append
				  (string_24_).append
				  (class654_sub1_sub5_sub1_sub2.anInt12210
				   * 1423663301)
				  .append
				  (Class29.aString259).toString();
		    else
			string
			    = new StringBuilder().append
				  (class654_sub1_sub5_sub1_sub2
				       .method18877(true, 1458809714))
				  .append
				  (bool_21_
				   ? (Class292.method5304
				      ((1423663301
					* (class654_sub1_sub5_sub1_sub2
					   .anInt12210)),
				       (Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.anInt12210) * 1423663301,
				       -1630904637))
				   : Class154.method2575(16777215, -821040268))
				  .append
				  (Class29.aString261).append
				  (string_24_).append
				  (class654_sub1_sub5_sub1_sub2.anInt12210
				   * 1423663301)
				  .append
				  ("+").append
				  ((-2058823415
				    * class654_sub1_sub5_sub1_sub2.anInt12219)
				   - 1423663301 * (class654_sub1_sub5_sub1_sub2
						   .anInt12210))
				  .append
				  (Class29.aString259).toString();
		} else if (-825066439 * class654_sub1_sub5_sub1_sub2.anInt12221
			   == -1)
		    string
			= class654_sub1_sub5_sub1_sub2.method18877(true,
								   844892420);
		else
		    string = new StringBuilder().append
				 (class654_sub1_sub5_sub1_sub2
				      .method18877(true, 2007886619))
				 .append
				 (Class29.aString261).append
				 (Class58.aClass58_596.method1245
				  (Class539.aClass672_7171, (byte) -62))
				 .append
				 (-825066439
				  * class654_sub1_sub5_sub1_sub2.anInt12221)
				 .append
				 (Class29.aString259).toString();
		boolean bool_25_ = false;
		if (null != class654_sub1_sub5_sub1_sub2.aClass631_12226
		    && (class654_sub1_sub5_sub1_sub2.aClass631_12226.anInt8212
			* 1568742735) != -1) {
		    Class307 class307
			= ((Class307)
			   (Class578.aClass44_Sub3_7743.method91
			    ((class654_sub1_sub5_sub1_sub2.aClass631_12226
			      .anInt8212) * 1568742735,
			     1058732568)));
		    if (class307.aBool3348) {
			bool_25_ = true;
			string = ((Class307)
				  (Class578.aClass44_Sub3_7743.method91
				   ((class654_sub1_sub5_sub1_sub2
				     .aClass631_12226.anInt8212) * 1568742735,
				    1158849240))).aString3337;
			if (0 != class307.anInt3301 * -927618257) {
			    String string_26_
				= ((Class675.aClass675_8635
				    == client.aClass675_11016)
				   ? (Class58.aClass58_597.method1245
				      (Class539.aClass672_7171, (byte) -6))
				   : (Class58.aClass58_595.method1245
				      (Class539.aClass672_7171, (byte) -103)));
			    string
				= new StringBuilder().append(string).append
				      (Class292.method5304
				       (class307.anInt3301 * -927618257,
					(1423663301
					 * (Class322
					    .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					    .anInt12210)),
					-1503454550))
				      .append
				      (Class29.aString261).append
				      (string_26_).append
				      (class307.anInt3301 * -927618257).append
				      (Class29.aString259).toString();
			}
		    }
		}
		if (client.aBool11218 && !bool
		    && (Class200_Sub14.anInt9950 * 460977285 & 0x8) != 0)
		    Class112.method2016
			(client.aString11221,
			 new StringBuilder().append(client.aString11222).append
			     (" ").append
			     (Class29.aString263).append
			     (" ").append
			     (Class154.method2575(16777215, -1370723533))
			     .append
			     (string).toString(),
			 Class460.anInt5069 * -731032933, 15, -1,
			 (long) (class654_sub1_sub5_sub1_sub2.anInt11922
				 * 1126388985),
			 0, 0, true, false,
			 (long) (1126388985
				 * class654_sub1_sub5_sub1_sub2.anInt11922),
			 false, (short) 11495);
		if (!bool) {
		    for (int i_27_ = 7; i_27_ >= 0; i_27_--) {
			if (null != client.aStringArray11206[i_27_]) {
			    short i_28_ = 0;
			    if (client.aStringArray11206[i_27_]
				    .equalsIgnoreCase
				(Class58.aClass58_590.method1245
				 (Class539.aClass672_7171, (byte) -128))) {
				if (Class635.aClass635_8299
				    == client.aClass635_11117)
				    continue;
				if (client.aClass635_11117
				    == Class635.aClass635_8302)
				    i_28_ = (short) 2000;
				else if ((Class635.aClass635_8298
					  == client.aClass635_11117)
					 && ((class654_sub1_sub5_sub1_sub2
					      .anInt12210) * 1423663301
					     > (Class322
						.aClass654_Sub1_Sub5_Sub1_Sub2_3419
						.anInt12210) * 1423663301))
				    i_28_ = (short) 2000;
				if ((Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .anInt12224) * 676699829 != 0
				    && 0 != (676699829
					     * (class654_sub1_sub5_sub1_sub2
						.anInt12224))) {
				    if ((Class322
					 .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					 .anInt12224) * 676699829
					== (class654_sub1_sub5_sub1_sub2
					    .anInt12224) * 676699829)
					i_28_ = (short) 2000;
				    else
					i_28_ = (short) 0;
				} else if (class654_sub1_sub5_sub1_sub2
					   .aBool12234)
				    i_28_ = (short) 2000;
			    } else if (client.aBoolArray11207[i_27_])
				i_28_ = (short) 2000;
			    short i_29_
				= (short) (i_28_
					   + client.aShortArray11203[i_27_]);
			    int i_30_ = (-1 != client.anIntArray11205[i_27_]
					 ? client.anIntArray11205[i_27_]
					 : client.anInt11216 * 2068410197);
			    int i_31_ = bool_25_ ? 16776960 : 16777215;
			    Class112.method2016
				(client.aStringArray11206[i_27_],
				 new StringBuilder().append
				     (Class154.method2575(i_31_, -1722060874))
				     .append
				     (string).toString(),
				 i_30_, i_29_, -1,
				 (long) ((class654_sub1_sub5_sub1_sub2
					  .anInt11922)
					 * 1126388985),
				 0, 0, true, false,
				 (long) ((class654_sub1_sub5_sub1_sub2
					  .anInt11922)
					 * 1126388985),
				 false, (short) 16942);
			}
		    }
		} else if (!bool_25_)
		    Class112.method2016(new StringBuilder().append
					    (Class154.method2575(13421772,
								 217081370))
					    .append
					    (string).toString(),
					"", -1, -1, 0, 0L, 0, 0, false, true,
					(long) ((class654_sub1_sub5_sub1_sub2
						 .anInt11922)
						* 1126388985),
					false, (short) 6168);
		if (!bool && !bool_25_) {
		    for (Class534_Sub18_Sub7 class534_sub18_sub7
			     = ((Class534_Sub18_Sub7)
				Class72.aClass700_771.method14135((byte) -1));
			 class534_sub18_sub7 != null;
			 class534_sub18_sub7
			     = ((Class534_Sub18_Sub7)
				Class72.aClass700_771
				    .method14139(1258128591))) {
			if (23
			    == -1986934021 * class534_sub18_sub7.anInt11706) {
			    class534_sub18_sub7.aString11710
				= new StringBuilder().append
				      (Class154.method2575(16777215,
							   175502740))
				      .append
				      (string).toString();
			    break;
			}
		    }
		}
	    }
	}
    }
    
    static final void method5320(Class669 class669, byte i) {
	int i_32_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (null != Class554_Sub1.aClass9_10687) {
	    Class534 class534
		= Class554_Sub1.aClass9_10687.method579((long) i_32_);
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= null != class534 ? 1 : 0;
	} else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method5321(Class669 class669, short i) {
	if (Class599.aClass298_Sub1_7871.method5388((byte) -75)
	    != Class305.aClass305_3266)
	    throw new RuntimeException();
	((Class347_Sub2) Class599.aClass298_Sub1_7871.method5380((byte) -109))
	    .method15789
	    ((class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]) == 1,
	     -1651497048);
    }
    
    static final void method5322(Class669 class669, int i) {
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = class669.aClass352_8602.aString3634;
    }
}
