/* Class295 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class295
{
    public int[] anIntArray3159;
    public short[] aShortArray3160;
    public static Class472 aClass472_3161;
    
    public Class295(int[] is, short[] is_0_) {
	anIntArray3159 = is;
	aShortArray3160 = is_0_;
    }
    
    public Class295(Class307 class307) {
	anIntArray3159 = new int[8];
	aShortArray3160 = new short[8];
	int i = 0;
	if (null != class307.anIntArray3309
	    && class307.aShortArray3318 != null) {
	    i = class307.anIntArray3309.length;
	    System.arraycopy(class307.anIntArray3309, 0, anIntArray3159, 0, i);
	    System.arraycopy(class307.aShortArray3318, 0, aShortArray3160, 0,
			     i);
	}
	for (int i_1_ = i; i_1_ < 8; i_1_++) {
	    anIntArray3159[i_1_] = -1;
	    aShortArray3160[i_1_] = (short) -1;
	}
    }
    
    public static void method5323(int i) {
	if (null == Class334.aClass294Array3506) {
	    Class334.aClass294Array3506 = Class294.method5317((byte) -111);
	    Class110.aClass294_1344 = Class334.aClass294Array3506[0];
	    Class334.aLong3509
		= Class250.method4604((byte) -62) * -3214781987892434315L;
	}
	if (Class277.aClass300_3049 == null)
	    Class502.method8302(898758840);
	Class294 class294 = Class110.aClass294_1344;
	int i_2_ = Class661.method10976(-749199293);
	if (class294 == Class110.aClass294_1344) {
	    Class274.aString3039
		= Class110.aClass294_1344.aClass58_3152
		      .method1245(Class539.aClass672_7171, (byte) -65);
	    Class154.aString1740 = Class274.aString3039;
	    if (Class110.aClass294_1344.aBool3157)
		Class210.anInt2246
		    = (255476555 * Class110.aClass294_1344.anInt3149
		       + ((Class110.aClass294_1344.anInt3155 * 1646981573
			   - Class110.aClass294_1344.anInt3149 * 255476555)
			  * i_2_ / 100)) * 310636191;
	    if (Class110.aClass294_1344.aBool3156)
		Class154.aString1740
		    = new StringBuilder().append(Class154.aString1740).append
			  (" - ").append
			  (Class210.anInt2246 * 664251743).append
			  ("%").toString();
	} else if (Class110.aClass294_1344 == Class294.aClass294_3150) {
	    Class277.aClass300_3049 = null;
	    Class673.method11110(15, -2009393170);
	    if (Class334.aBool3511) {
		Class334.aBool3511 = false;
		Class200_Sub6.method15576(Class534_Sub21.aString10536,
					  Class367.aString3856, "", false,
					  -1758971010);
	    }
	} else {
	    Class274.aString3039
		= class294.aClass58_3151.method1245(Class539.aClass672_7171,
						    (byte) -49);
	    Class154.aString1740 = Class274.aString3039;
	    if (Class110.aClass294_1344.aBool3156)
		Class154.aString1740
		    = new StringBuilder().append(Class154.aString1740).append
			  (" - ").append
			  (class294.anInt3155 * 1646981573).append
			  ("%").toString();
	    Class210.anInt2246 = 2000703323 * class294.anInt3155;
	    if (Class110.aClass294_1344.aBool3157 || class294.aBool3157)
		Class334.aLong3509
		    = Class250.method4604((byte) -39) * -3214781987892434315L;
	}
	if (Class277.aClass300_3049 != null) {
	    Class277.aClass300_3049.method5539((-8730536087753452067L
						* Class334.aLong3509),
					       Class274.aString3039,
					       Class154.aString1740,
					       664251743 * Class210.anInt2246,
					       Class110.aClass294_1344,
					       (byte) 0);
	    if (Class334.anInterface33Array3502 != null) {
		for (int i_3_ = 1 + Class334.anInt3504 * 1101456325;
		     i_3_ < Class334.anInterface33Array3502.length; i_3_++) {
		    if (Class334.anInterface33Array3502[i_3_]
			    .method217((byte) 7) >= 100
			&& Class334.anInt3504 * 1101456325 == i_3_ - 1
			&& 8 != -1850530127 * client.anInt11039
			&& Class277.aClass300_3049.method5518((byte) 52)) {
			try {
			    Class334.anInterface33Array3502[i_3_]
				.method210((byte) 1);
			} catch (Exception exception) {
			    Class334.anInterface33Array3502 = null;
			    break;
			}
			Class277.aClass300_3049.method5528
			    (Class334.anInterface33Array3502[i_3_], 740457751);
			Class334.anInt3504 += -1048534259;
			if ((1101456325 * Class334.anInt3504
			     >= Class334.anInterface33Array3502.length - 1)
			    && Class334.anInterface33Array3502.length > 1)
			    Class334.anInt3504
				= (Class334.aClass87_3505.method1701((byte) 26)
				   ? 0 : -1) * -1048534259;
		    }
		}
	    }
	}
    }
    
    static final void method5324(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	if (class669.anIntArray8595[class669.anInt8600 * 2088438307]
	    > class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1])
	    class669.anInt8613
		+= (class669.anIntArray8591[class669.anInt8613 * 662605117]
		    * -793595371);
    }
    
    static boolean method5325(int i) {
	return Class592.aClass62_7815 != null;
    }
    
    static final void method5326(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class63.method1280(1128191898);
    }
    
    static final void method5327(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class567.method9561(class247, class243, class669, 1864514563);
    }
}
