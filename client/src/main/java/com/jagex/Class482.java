/* Class482 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class482 implements Interface11
{
    public static int anInt5270;
    
    public Object method76(Class534_Sub40 class534_sub40) {
	return new Class534_Sub36(class534_sub40);
    }
    
    public Object method75(Class534_Sub40 class534_sub40, int i) {
	return new Class534_Sub36(class534_sub40);
    }
    
    public Object method74(Class534_Sub40 class534_sub40) {
	return new Class534_Sub36(class534_sub40);
    }
    
    public Object method77(Class534_Sub40 class534_sub40) {
	return new Class534_Sub36(class534_sub40);
    }
    
    static final void method7929(Class669 class669, int i) {
	class669.anInt8600 -= 308999563;
    }
    
    public static void method7930(int i, int i_0_, int i_1_, int i_2_,
				  int i_3_, int i_4_, int i_5_, int i_6_) {
	Class534_Sub4 class534_sub4 = null;
	for (Class534_Sub4 class534_sub4_7_
		 = ((Class534_Sub4)
		    Class534_Sub4.aClass700_10408.method14135((byte) -1));
	     class534_sub4_7_ != null;
	     class534_sub4_7_ = (Class534_Sub4) Class534_Sub4
						    .aClass700_10408
						    .method14139(749949174)) {
	    if (class534_sub4_7_.anInt10402 * -511427777 == i
		&& class534_sub4_7_.anInt10397 * -1522052283 == i_0_
		&& -1246362377 * class534_sub4_7_.anInt10400 == i_1_
		&& i_2_ == class534_sub4_7_.anInt10405 * -1831835741) {
		class534_sub4 = class534_sub4_7_;
		break;
	    }
	}
	if (class534_sub4 == null) {
	    class534_sub4 = new Class534_Sub4();
	    class534_sub4.anInt10402 = i * -453954369;
	    class534_sub4.anInt10405 = i_2_ * 2108621835;
	    class534_sub4.anInt10397 = i_0_ * 1402161037;
	    class534_sub4.anInt10400 = 2107243719 * i_1_;
	    if (i_0_ >= 0 && i_1_ >= 0
		&& i_0_ < client.aClass512_11100.method8417(1179938067)
		&& i_1_ < client.aClass512_11100.method8418(-1533611049))
		Class229.method4207(class534_sub4, (byte) 0);
	    Class534_Sub4.aClass700_10408.method14131(class534_sub4,
						      (short) 789);
	}
	class534_sub4.anInt10398 = -1796323797 * i_3_;
	class534_sub4.anInt10404 = i_4_ * -804529983;
	class534_sub4.anInt10403 = -917323277 * i_5_;
	class534_sub4.aBool10406 = true;
	class534_sub4.aBool10407 = false;
    }
    
    static final void method7931(Class669 class669, byte i) {
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = ((Class654_Sub1_Sub5_Sub1_Sub2)
	       class669.aClass654_Sub1_Sub5_Sub1_8604)
		  .method18877(true, 1353963339);
    }
    
    public static Class271 method7932(int i, int i_8_) {
	if (Class271.aClass271_2962.anInt2960 * -28635091 == i)
	    return Class271.aClass271_2962;
	if (-28635091 * Class271.aClass271_2961.anInt2960 == i)
	    return Class271.aClass271_2961;
	return null;
    }
    
    static final void method7933(Class669 class669, byte i) {
	if (Class666.aClass547_8577.method8995(82, (byte) -35))
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
}
