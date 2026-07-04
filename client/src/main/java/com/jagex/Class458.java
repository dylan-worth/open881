/* Class458 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class458
{
    static final int anInt4971 = 32768;
    Class472 aClass472_4972;
    Class472 aClass472_4973;
    static final int anInt4974 = 0;
    Class203 aClass203_4975 = new Class203(64);
    
    public Class458(Class672 class672, Class472 class472,
		    Class472 class472_0_) {
	aClass472_4973 = class472;
	aClass472_4972 = class472_0_;
	if (null != aClass472_4973)
	    aClass472_4973.method7726(0, (byte) 54);
	if (aClass472_4972 != null)
	    aClass472_4972.method7726(0, (byte) 27);
    }
    
    public Class534_Sub18_Sub19 method7433(int i, int i_1_) {
	Class534_Sub18_Sub19 class534_sub18_sub19
	    = (Class534_Sub18_Sub19) aClass203_4975.method3871((long) i);
	if (null != class534_sub18_sub19)
	    return class534_sub18_sub19;
	byte[] is;
	if (i >= 32768)
	    is = aClass472_4972.method7743(0, i & 0x7fff, -1057408731);
	else
	    is = aClass472_4973.method7743(0, i, -796665920);
	class534_sub18_sub19 = new Class534_Sub18_Sub19();
	if (null != is)
	    class534_sub18_sub19.method18468(new Class534_Sub40(is),
					     (byte) 111);
	if (i >= 32768)
	    class534_sub18_sub19.method18472((byte) 62);
	aClass203_4975.method3893(class534_sub18_sub19, (long) i);
	return class534_sub18_sub19;
    }
    
    public Class534_Sub18_Sub19 method7434(int i) {
	Class534_Sub18_Sub19 class534_sub18_sub19
	    = (Class534_Sub18_Sub19) aClass203_4975.method3871((long) i);
	if (null != class534_sub18_sub19)
	    return class534_sub18_sub19;
	byte[] is;
	if (i >= 32768)
	    is = aClass472_4972.method7743(0, i & 0x7fff, -1625817719);
	else
	    is = aClass472_4973.method7743(0, i, -573084845);
	class534_sub18_sub19 = new Class534_Sub18_Sub19();
	if (null != is)
	    class534_sub18_sub19.method18468(new Class534_Sub40(is),
					     (byte) 40);
	if (i >= 32768)
	    class534_sub18_sub19.method18472((byte) 9);
	aClass203_4975.method3893(class534_sub18_sub19, (long) i);
	return class534_sub18_sub19;
    }
    
    static final void method7435(Class669 class669, byte i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_2_ >> 14 & 0x3fff;
    }
    
    public static boolean method7436(char c, int i) {
	return c >= '0' && c <= '9';
    }
    
    static final void method7437(byte i) {
	for (Class534_Sub18_Sub4 class534_sub18_sub4
		 = ((Class534_Sub18_Sub4)
		    client.aClass700_11210.method14135((byte) -1));
	     null != class534_sub18_sub4;
	     class534_sub18_sub4
		 = ((Class534_Sub18_Sub4)
		    client.aClass700_11210.method14139(916178162))) {
	    Class654_Sub1_Sub5_Sub6 class654_sub1_sub5_sub6
		= class534_sub18_sub4.aClass654_Sub1_Sub5_Sub6_11646;
	    if (client.anInt11101
		> 1150056077 * class654_sub1_sub5_sub6.anInt12170) {
		class534_sub18_sub4.method8892((byte) 1);
		class654_sub1_sub5_sub6.method18802(-469371226);
	    } else if (client.anInt11101
		       >= class654_sub1_sub5_sub6.anInt12173 * -1251788571) {
		class654_sub1_sub5_sub6.method18800((byte) -16);
		if (class654_sub1_sub5_sub6.anInt12178 * -266928339 > 0) {
		    if (client.anInt11155 * -1468443459 == 3) {
			Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1
			    = Class65.aClass192Array712
				  [(-266928339
				    * class654_sub1_sub5_sub6.anInt12178) - 1]
				  .method3775(2088438307);
			if (null != class654_sub1_sub5_sub1) {
			    Class438 class438
				= (class654_sub1_sub5_sub1.method10807()
				   .aClass438_4885);
			    if ((int) class438.aFloat4864 >= 0
				&& ((int) class438.aFloat4864
				    < client.aClass512_11100
					  .method8417(1282794963) * 512)
				&& (int) class438.aFloat4865 >= 0
				&& ((int) class438.aFloat4865
				    < client.aClass512_11100
					  .method8418(-1533611049) * 512))
				class654_sub1_sub5_sub6.method18799
				    ((int) class438.aFloat4864,
				     (int) class438.aFloat4865,
				     ((Class247.method4595
				       ((int) class438.aFloat4864,
					(int) class438.aFloat4865,
					class654_sub1_sub5_sub1.aByte10854,
					-1584946718))
				      - (class654_sub1_sub5_sub6.anInt12190
					 * 710671791)),
				     client.anInt11101, 16711935);
			}
		    } else {
			Class534_Sub6 class534_sub6
			    = ((Class534_Sub6)
			       (client.aClass9_11331.method579
				((long) ((-266928339
					  * class654_sub1_sub5_sub6.anInt12178)
					 - 1))));
			if (null != class534_sub6) {
			    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
				= ((Class654_Sub1_Sub5_Sub1_Sub1)
				   class534_sub6.anObject10417);
			    Class438 class438
				= (class654_sub1_sub5_sub1_sub1.method10807()
				   .aClass438_4885);
			    if ((int) class438.aFloat4864 >= 0
				&& ((int) class438.aFloat4864
				    < client.aClass512_11100
					  .method8417(1091282416) * 512)
				&& (int) class438.aFloat4865 >= 0
				&& ((int) class438.aFloat4865
				    < client.aClass512_11100
					  .method8418(-1533611049) * 512))
				class654_sub1_sub5_sub6.method18799
				    ((int) class438.aFloat4864,
				     (int) class438.aFloat4865,
				     ((Class247.method4595
				       ((int) class438.aFloat4864,
					(int) class438.aFloat4865,
					class654_sub1_sub5_sub6.aByte10854,
					-396241424))
				      - 710671791 * (class654_sub1_sub5_sub6
						     .anInt12190)),
				     client.anInt11101, 16711935);
			}
		    }
		}
		if (-266928339 * class654_sub1_sub5_sub6.anInt12178 < 0) {
		    int i_3_
			= (-(class654_sub1_sub5_sub6.anInt12178 * -266928339)
			   - 1);
		    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2;
		    if (i_3_ == client.anInt11037 * -643758853)
			class654_sub1_sub5_sub1_sub2
			    = Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419;
		    else
			class654_sub1_sub5_sub1_sub2
			    = (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			       [i_3_]);
		    if (null != class654_sub1_sub5_sub1_sub2) {
			Class438 class438
			    = (class654_sub1_sub5_sub1_sub2.method10807()
			       .aClass438_4885);
			if ((int) class438.aFloat4864 >= 0
			    && ((int) class438.aFloat4864
				< (client.aClass512_11100.method8417(963681522)
				   * 512))
			    && (int) class438.aFloat4865 >= 0
			    && ((int) class438.aFloat4865
				< client.aClass512_11100
				      .method8418(-1533611049) * 512))
			    class654_sub1_sub5_sub6.method18799
				((int) class438.aFloat4864,
				 (int) class438.aFloat4865,
				 (Class247.method4595((int) (class438
							     .aFloat4864),
						      (int) (class438
							     .aFloat4865),
						      (class654_sub1_sub5_sub6
						       .aByte10854),
						      -1267286506)
				  - (710671791
				     * class654_sub1_sub5_sub6.anInt12190)),
				 client.anInt11101, 16711935);
		    }
		}
		class654_sub1_sub5_sub6
		    .method18801(-636695479 * client.anInt11111, (byte) -74);
		client.aClass512_11100.method8424((byte) 110)
		    .method9246(class654_sub1_sub5_sub6, true, (byte) 8);
	    }
	}
    }
    
    public static final void method7438(Class654_Sub1 class654_sub1, int i,
					boolean bool, int i_4_) {
	Class17.method774(class654_sub1, i, true, bool, 16711935);
    }
}
