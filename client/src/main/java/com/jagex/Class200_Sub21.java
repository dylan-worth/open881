/* Class200_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Random;

public class Class200_Sub21 extends Class200
{
    int anInt9983;
    int anInt9984;
    int anInt9985;
    
    public void method3846() {
	Class192 class192 = Class65.aClass192Array712[anInt9984 * -306982705];
	Class209 class209 = Class45.aClass209Array330[anInt9983 * 930652481];
	class209.method3947(class192, anInt9985 * -349611721, 2050676153);
    }
    
    public void method3847() {
	Class192 class192 = Class65.aClass192Array712[anInt9984 * -306982705];
	Class209 class209 = Class45.aClass209Array330[anInt9983 * 930652481];
	class209.method3947(class192, anInt9985 * -349611721, -499264726);
    }
    
    public void method3845(int i) {
	Class192 class192 = Class65.aClass192Array712[anInt9984 * -306982705];
	Class209 class209 = Class45.aClass209Array330[anInt9983 * 930652481];
	class209.method3947(class192, anInt9985 * -349611721, -1154085507);
    }
    
    Class200_Sub21(Class534_Sub40 class534_sub40) {
	super(class534_sub40);
	anInt9984 = class534_sub40.method16529((byte) 1) * 88028719;
	anInt9983 = class534_sub40.method16529((byte) 1) * -1692078399;
	anInt9985 = class534_sub40.method16527(322587814) * -1052267385;
    }
    
    public static int method15637(Random random, int i, int i_0_) {
	if (random == null) {
	    random = Class92.aRandom896;
	    if (random == null) {
		synchronized (Class92.anObject895) {
		    if (Class92.aRandom896 == null)
			Class92.aRandom896 = new Random();
		    random = Class92.aRandom896;
		}
	    }
	}
	if (i <= 0)
	    throw new IllegalArgumentException();
	if (Class562.method9467(i, 908131541))
	    return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i
			  >> 32);
	int i_1_ = -2147483648 - (int) (4294967296L % (long) i);
	int i_2_;
	do
	    i_2_ = random.nextInt();
	while (i_2_ >= i_1_);
	return Class536_Sub6.method16007(i_2_, i, (byte) 24);
    }
    
    static void method15638(Class185 class185, Class247 class247, int i,
			    int i_3_, int i_4_) {
	if (null != Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419) {
	    class185.method3581();
	    Class246 class246 = null;
	    Class145 class145 = null;
	    if (-1960530827 * class247.anInt2438 == 5) {
		class246 = class247.method4525(class185, 447549967);
		if (class246 == null)
		    return;
		class145 = class246.aClass145_2423;
		if ((-760407609 * class246.anInt2420
		     != class247.anInt2468 * -881188269)
		    || (class247.anInt2469 * -1279656873
			!= class246.anInt2419 * -976807825))
		    throw new IllegalStateException("");
	    }
	    class185.method3373(i, i_3_, -881188269 * class247.anInt2468 + i,
				-1279656873 * class247.anInt2469 + i_3_);
	    if (1265431623 * Class113.anInt1365 != 2
		&& 5 != Class113.anInt1365 * 1265431623
		&& Class613.aClass163_8025 != null) {
		class185.method3283(Class113.anIntArray1368);
		class185.method3281();
		Class597 class597
		    = client.aClass512_11100.method8416((byte) 116);
		int i_5_;
		int i_6_;
		int i_7_;
		int i_8_;
		if (5 == Class10.anInt75 * -891094135) {
		    i_5_ = 1196989073 * client.anInt11137;
		    i_6_ = client.anInt11138 * -823660049;
		    i_7_ = (int) -client.aFloat11140 & 0x3fff;
		    i_8_ = 4096;
		} else {
		    Class438 class438
			= (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			       .method10807
			   ().aClass438_4885);
		    i_5_ = (int) class438.aFloat4864;
		    i_6_ = (int) class438.aFloat4865;
		    if (3 == Class10.anInt75 * -891094135)
			i_7_ = ((int) -((double) Class599
						     .aClass298_Sub1_7871
						     .method5389(-1325246786)
					* 2607.5945876176133)
				+ client.anInt11189 * -2045337339) & 0x3fff;
		    else
			i_7_ = ((int) -client.aFloat11140
				+ -2045337339 * client.anInt11189) & 0x3fff;
		    i_8_ = 4096 - client.anInt11022 * -1975450384;
		}
		int i_9_ = 48 + i_5_ / 128;
		int i_10_
		    = (48 + client.aClass512_11100.method8418(-1533611049) * 4
		       - i_6_ / 128);
		if (class145 != null)
		    Class613.aClass163_8025.method2704
			(((float) (-881188269 * class247.anInt2468) / 2.0F
			  + (float) i),
			 ((float) i_3_
			  + (float) (-1279656873 * class247.anInt2469) / 2.0F),
			 (float) i_9_, (float) i_10_, i_8_, i_7_ << 2,
			 class145, i, i_3_);
		else
		    Class613.aClass163_8025.method2668
			(((float) i
			  + (float) (-881188269 * class247.anInt2468) / 2.0F),
			 ((float) (class247.anInt2469 * -1279656873) / 2.0F
			  + (float) i_3_),
			 (float) i_9_, (float) i_10_, i_8_, i_7_ << 2, 1, -1,
			 1);
		Class523 class523
		    = client.aClass512_11100.method8419(187382503);
		for (Class534_Sub39 class534_sub39
			 = ((Class534_Sub39)
			    Class113.aClass700_1369.method14135((byte) -1));
		     null != class534_sub39;
		     class534_sub39
			 = ((Class534_Sub39)
			    Class113.aClass700_1369.method14139(2020396944))) {
		    int i_11_ = class534_sub39.anInt10807 * -705967177;
		    int i_12_
			= ((class523.anIntArray7085[i_11_] >> 14 & 0x3fff)
			   - -424199969 * class597.anInt7859);
		    int i_13_ = ((class523.anIntArray7085[i_11_] & 0x3fff)
				 - -1166289421 * class597.anInt7861);
		    int i_14_ = i_12_ * 4 + 2 - i_5_ / 128;
		    int i_15_ = i_13_ * 4 + 2 - i_6_ / 128;
		    Class181.method2983(class185, class145, class247, i, i_3_,
					i_14_, i_15_,
					class523.anIntArray7084[i_11_],
					(byte) -103);
		}
		for (int i_16_ = 0; i_16_ < Class113.anInt1380 * -463245253;
		     i_16_++) {
		    int i_17_
			= 2 + Class113.anIntArray1371[i_16_] * 4 - i_5_ / 128;
		    int i_18_
			= 4 * Class113.anIntArray1372[i_16_] + 2 - i_6_ / 128;
		    Class602 class602
			= ((Class602)
			   (client.aClass512_11100.method8428(-1486655428)
				.method91
			    (Class113.anIntArray1377[i_16_], -1938971940)));
		    if (null != class602.anIntArray7943) {
			class602 = class602.method9988(Class78.aClass103_825,
						       Class78.aClass103_825,
						       -46286258);
			if (null == class602
			    || class602.anInt7949 * 196422211 == -1)
			    continue;
		    }
		    Class181.method2983(class185, class145, class247, i, i_3_,
					i_17_, i_18_,
					class602.anInt7949 * 196422211,
					(byte) -128);
		}
		for (Class534_Sub7 class534_sub7
			 = ((Class534_Sub7)
			    client.aClass9_11209.method583(-2005823980));
		     null != class534_sub7;
		     class534_sub7
			 = ((Class534_Sub7)
			    client.aClass9_11209.method584((byte) -122))) {
		    int i_19_ = (int) ((8258869577519436579L
					* class534_sub7.aLong7158) >> 28
				       & 0x3L);
		    if (1936210931 * Class113.anInt1381 == i_19_) {
			int i_20_ = ((int) ((class534_sub7.aLong7158
					     * 8258869577519436579L)
					    & 0x3fffL)
				     - class597.anInt7859 * -424199969);
			int i_21_ = ((int) ((8258869577519436579L
					     * class534_sub7.aLong7158) >> 14
					    & 0x3fffL)
				     - -1166289421 * class597.anInt7861);
			int i_22_ = 4 * i_20_ + 2 - i_5_ / 128;
			int i_23_ = 2 + i_21_ * 4 - i_6_ / 128;
			Class246.method4509(class247, class145, i, i_3_, i_22_,
					    i_23_,
					    Class67.aClass163Array721[0],
					    1313730702);
		    }
		}
		Class536_Sub2.method15977(class185, i_5_, i_6_, class247,
					  class145, i, i_3_, -1154028516);
		Class534_Sub42_Sub1.method18423(i_5_, i_6_, class247, class145,
						i, i_3_, -941336527);
		Class406.method6681(i_5_, i_6_, class247, class246, i, i_3_,
				    (byte) -121);
		if (5 != Class10.anInt75 * -891094135) {
		    if (-1 != Class113.anInt1375 * -1254538725) {
			int i_24_
			    = (2 + Class113.anInt1375 * -723187604 - i_5_ / 128
			       + (Class322
				      .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				      .method18545((byte) 1)
				  - 1) * 2);
			int i_25_
			    = (2 + Class113.anInt1376 * -985777988 - i_6_ / 128
			       + (Class322
				      .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				      .method18545((byte) 1)
				  - 1) * 2);
			Class30.method879(class247, class145,
					  i - Class623.anInt8149 * 443444551,
					  (i_3_
					   - Class706.anInt8846 * -586110739),
					  i_24_, i_25_,
					  (Class19.aClass163Array209
					   [Class113.aBool1373 ? 1 : 0]),
					  100.0, Class284.aClass284_3070,
					  Class280.aClass280_3055,
					  -1585276833);
		    }
		    if (!Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			     .aClass618_12216.method10242((byte) -69))
			class185.method3292
			    (-881188269 * class247.anInt2468 / 2 + i - 1,
			     -1279656873 * class247.anInt2469 / 2 + i_3_ - 1,
			     3, 3, -1, -1920295796);
		}
		class185.method3318(Class113.anIntArray1368[0],
				    Class113.anIntArray1368[1],
				    Class113.anIntArray1368[2],
				    Class113.anIntArray1368[3]);
	    } else if (null != class145)
		class185.method3324(-16777216, class145, i, i_3_);
	}
    }
}
