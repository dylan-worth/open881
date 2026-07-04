/* Class560 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Point;

public class Class560
{
    int[] anIntArray7502;
    public static final int anInt7503 = 2;
    int[] anIntArray7504;
    public static final int anInt7505 = 8;
    public static final int anInt7506 = 16;
    byte aByte7507;
    byte aByte7508;
    short aShort7509;
    short aShort7510;
    short aShort7511;
    short aShort7512;
    int[] anIntArray7513;
    short[] aShortArray7514;
    short[] aShortArray7515;
    public static final int anInt7516 = 1;
    short[] aShortArray7517;
    public static final int anInt7518 = 4;
    
    Class560(Class556 class556, int i, int i_0_, int i_1_, int i_2_, int i_3_,
	     int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
	     int i_10_, int i_11_, int i_12_) {
	aByte7507 = (byte) i;
	aByte7508 = (byte) i_0_;
	anIntArray7513 = new int[4];
	anIntArray7502 = new int[4];
	anIntArray7504 = new int[4];
	anIntArray7513[0] = i_1_;
	anIntArray7513[1] = i_2_;
	anIntArray7513[2] = i_3_;
	anIntArray7513[3] = i_4_;
	anIntArray7502[0] = i_5_;
	anIntArray7502[1] = i_6_;
	anIntArray7502[2] = i_7_;
	anIntArray7502[3] = i_8_;
	anIntArray7504[0] = i_9_;
	anIntArray7504[1] = i_10_;
	anIntArray7504[2] = i_11_;
	anIntArray7504[3] = i_12_;
	aShort7509 = (short) (i_1_ >> class556.anInt7422 * 941710601);
	aShort7510 = (short) (i_3_ >> 941710601 * class556.anInt7422);
	aShort7511 = (short) (i_9_ >> 941710601 * class556.anInt7422);
	aShort7512 = (short) (i_11_ >> 941710601 * class556.anInt7422);
	aShortArray7514 = new short[4];
	aShortArray7517 = new short[4];
	aShortArray7515 = new short[4];
    }
    
    static final void method9429(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class118.method2132(class247, class243, class669, 1783243704);
    }
    
    static final void method9430(Class669 class669, int i) {
	if (Class599.aClass298_Sub1_7871.method5425(2066100994)
	    != Class293.aClass293_3124)
	    throw new RuntimeException();
	((Class706_Sub3) Class599.aClass298_Sub1_7871.method5381(2094502872))
	    .method17268
	    ((class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]),
	     -554000568);
    }
    
    static void method9431(int i) {
	Class99.aClass203_1168.method3877(-91652100);
    }
    
    static void method9432(int i, int i_13_) {
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub38_10768
		.method17197(1193433338)
	    == 0)
	    i = -1;
	if (i != client.anInt11217 * 851750459) {
	    if (i != -1) {
		Class655 class655
		    = ((Class655)
		       Class650.aClass44_Sub5_8464.method91(i, 1466304306));
		Class169 class169 = class655.method10847((byte) -110);
		if (null != class169) {
		    Class592.aClass518_7819.setcustomcursor
			(Class464.aCanvas5111, class169.method2766(true),
			 class169.method2804(), class169.method2770(),
			 new Point(-74444691 * class655.anInt8517,
				   458684327 * class655.anInt8515));
		    client.anInt11217 = -1746142477 * i;
		} else
		    i = -1;
	    }
	    if (-1 == i && -1 != 851750459 * client.anInt11217) {
		Class592.aClass518_7819.setcustomcursor(Class464.aCanvas5111,
							null, -1, -1,
							new Point());
		client.anInt11217 = 1746142477;
	    }
	}
    }
    
    static void method9433(Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1,
			   int i, int i_14_) {
	if (class654_sub1_sub5_sub1.anIntArray11946 != null) {
	    Class676 class676
		= ((Class676)
		   Class448.method7319(Class676.method11130((byte) -70), i,
				       2088438307));
	    int i_15_ = (class654_sub1_sub5_sub1.anIntArray11946
			 [class676.method11131((byte) 0)]);
	    if (i_15_ != class654_sub1_sub5_sub1.aClass711_11948
			     .method14329(835547688)) {
		class654_sub1_sub5_sub1.aClass711_11948.method14331
		    (i_15_, class654_sub1_sub5_sub1.aClass711_11948
				.method14337(-589084822), -821799861);
		class654_sub1_sub5_sub1.anInt11937
		    = -1267839587 * class654_sub1_sub5_sub1.anInt11980;
	    }
	}
    }
    
    static void method9434(int i) {
	Class534_Sub5.aClass203_10412.method3877(-715329988);
    }
}
