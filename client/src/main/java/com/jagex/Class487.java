/* Class487 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class487 implements Interface11
{
    public Object method76(Class534_Sub40 class534_sub40) {
	return class534_sub40.method16541((byte) -102);
    }
    
    public Object method75(Class534_Sub40 class534_sub40, int i) {
	return class534_sub40.method16541((byte) -5);
    }
    
    public Object method77(Class534_Sub40 class534_sub40) {
	return class534_sub40.method16541((byte) -73);
    }
    
    public Object method74(Class534_Sub40 class534_sub40) {
	return class534_sub40.method16541((byte) -48);
    }
    
    static final void method7990(Class669 class669, int i) {
	Class150 class150
	    = (Class150) (class669.aClass534_Sub18_Sub8_8614.anObjectArray11753
			  [class669.anInt8613 * 662605117]);
	Interface19 interface19
	    = ((Interface19)
	       (class669.anIntArray8591[class669.anInt8613 * 662605117] == 0
		? class669.aMap8607.get(class150.aClass453_1695)
		: class669.aMap8608.get(class150.aClass453_1695)));
	Class483 class483 = class150.aClass493_1696.method8102(605514360);
	if (class483 == Class483.aClass483_5271)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= interface19.method120(class150, (byte) -53);
	else if (Class483.aClass483_5272 == class483)
	    class669.aLongArray8587
		[(class669.anInt8596 += 1091885681) * 1572578961 - 1]
		= interface19.method127(class150, (byte) 24);
	else if (class483 == Class483.aClass483_5279) {
	    try {
		String string
		    = (String) interface19.method124(class150, 1160934688);
		if (null == string)
		    string = "null";
		class669.anObjectArray8593
		    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		    = string;
	    } catch (Exception exception) {
		throw new RuntimeException(exception);
	    }
	} else
	    throw new RuntimeException();
    }
    
    static final void method7991(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aBool11218 ? 1 : 0;
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = null == client.aString11222 ? "" : client.aString11222;
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = client.aString11221 == null ? "" : client.aString11221;
    }
    
    public static final void method7992(int i) {
	if (!client.aBool11132) {
	    client.aFloat11141 += (24.0F - client.aFloat11141) / 2.0F;
	    client.aBool11147 = true;
	    client.aBool11132 = true;
	}
    }
    
    static final void method7993(int i) {
	for (Class534_Sub4 class534_sub4
		 = ((Class534_Sub4)
		    Class534_Sub4.aClass700_10408.method14135((byte) -1));
	     class534_sub4 != null;
	     class534_sub4 = (Class534_Sub4) Class534_Sub4.aClass700_10408
						 .method14139(686979573))
	    Class403.method6616(class534_sub4, false, 634151784);
	for (Class534_Sub4 class534_sub4
		 = ((Class534_Sub4)
		    Class534_Sub4.aClass700_10409.method14135((byte) -1));
	     null != class534_sub4;
	     class534_sub4 = (Class534_Sub4) Class534_Sub4.aClass700_10409
						 .method14139(1977043287))
	    Class403.method6616(class534_sub4, true, -631974383);
    }
    
    static final void method7994(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub13_10761
		  .method14026(i_0_, -2024064741);
    }
    
    static final void method7995(Class669 class669, int i) {
	if (Class713.aBool8884 && null != Class29.aFrame266)
	    Class159.method2611(Class44_Sub6.aClass534_Sub35_10989
				    .aClass690_Sub8_10775
				    .method16947(1538559073),
				-1, -1, false, -265852813);
    }
}
