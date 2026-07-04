/* Class536_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub2 extends Class536
{
    public Class536_Sub2 aClass536_Sub2_10348;
    public Class536_Sub2 aClass536_Sub2_10349;
    
    public void method15973(int i) {
	if (aClass536_Sub2_10348 != null) {
	    aClass536_Sub2_10348.aClass536_Sub2_10349 = aClass536_Sub2_10349;
	    aClass536_Sub2_10349.aClass536_Sub2_10348 = aClass536_Sub2_10348;
	    aClass536_Sub2_10349 = null;
	    aClass536_Sub2_10348 = null;
	}
    }
    
    public void method15974() {
	if (aClass536_Sub2_10348 != null) {
	    aClass536_Sub2_10348.aClass536_Sub2_10349 = aClass536_Sub2_10349;
	    aClass536_Sub2_10349.aClass536_Sub2_10348 = aClass536_Sub2_10348;
	    aClass536_Sub2_10349 = null;
	    aClass536_Sub2_10348 = null;
	}
    }
    
    public void method15975() {
	if (aClass536_Sub2_10348 != null) {
	    aClass536_Sub2_10348.aClass536_Sub2_10349 = aClass536_Sub2_10349;
	    aClass536_Sub2_10349.aClass536_Sub2_10348 = aClass536_Sub2_10348;
	    aClass536_Sub2_10349 = null;
	    aClass536_Sub2_10348 = null;
	}
    }
    
    public static Class394 method15976(Class534_Sub40 class534_sub40, byte i) {
	Class394_Sub1 class394_sub1
	    = (Class394_Sub1) Class44.method1100(class534_sub40, 2071378111);
	int i_0_ = class534_sub40.method16530((byte) -96);
	return new Class394_Sub1_Sub1(class394_sub1.aClass401_4096,
				      class394_sub1.aClass391_4095,
				      -2127596367 * class394_sub1.anInt4101,
				      class394_sub1.anInt4093 * -1055236307,
				      class394_sub1.anInt4097 * -1607607997,
				      -228886179 * class394_sub1.anInt4098,
				      class394_sub1.anInt4099 * -81046249,
				      class394_sub1.anInt4100 * -120853723,
				      class394_sub1.anInt4094 * 1210620409,
				      1333388775 * class394_sub1.anInt10143,
				      class394_sub1.anInt10142 * -2081665769,
				      class394_sub1.anInt10147 * 845449995,
				      class394_sub1.anInt10145 * -773478983,
				      -1674677163 * class394_sub1.anInt10146,
				      2123496001 * class394_sub1.anInt10144,
				      i_0_);
    }
    
    static void method15977(Class185 class185, int i, int i_1_,
			    Class247 class247, Class145 class145, int i_2_,
			    int i_3_, int i_4_) {
	for (int i_5_ = 0; i_5_ < client.anInt11321 * -1125820437; i_5_++) {
	    Class534_Sub6 class534_sub6
		= ((Class534_Sub6)
		   client.aClass9_11331
		       .method579((long) client.anIntArray11088[i_5_]));
	    if (class534_sub6 != null) {
		Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		    = ((Class654_Sub1_Sub5_Sub1_Sub1)
		       class534_sub6.anObject10417);
		if (class654_sub1_sub5_sub1_sub1.method18840(2000020721)
		    && (class654_sub1_sub5_sub1_sub1.aByte10854
			== (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			    .aByte10854))) {
		    Class307 class307
			= class654_sub1_sub5_sub1_sub1.aClass307_12204;
		    if (class307 != null && null != class307.anIntArray3284)
			class307 = class307.method5615(Class78.aClass103_825,
						       Class78.aClass103_825,
						       -1466068515);
		    if (null != class307 && class307.aBool3300
			&& class307.aBool3313) {
			Class438 class438
			    = (class654_sub1_sub5_sub1_sub1.method10807()
			       .aClass438_4885);
			int i_6_ = (int) class438.aFloat4864 / 128 - i / 128;
			int i_7_
			    = (int) class438.aFloat4865 / 128 - i_1_ / 128;
			if (-1 != class307.anInt3338 * -161851867)
			    Class181.method2983(class185, class145, class247,
						i_2_, i_3_, i_6_, i_7_,
						(-161851867
						 * class307.anInt3338),
						(byte) -1);
			else
			    Class246.method4509(class247, class145, i_2_, i_3_,
						i_6_, i_7_,
						Class67.aClass163Array721[1],
						1313730702);
		    }
		}
	    }
	}
    }
    
    static final void method15978(Class669 class669, byte i) {
	client.aBool11232
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) == 1;
	if (client.aBool11232)
	    Class505.method8357(2077060571);
    }
}
