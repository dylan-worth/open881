/* Class534_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub41 extends Class534
{
    public int anInt10816;
    public boolean aBool10817;
    public Class247 aClass247_10818;
    public Object[] anObjectArray10819;
    public int anInt10820;
    public int anInt10821;
    public int anInt10822;
    public int anInt10823;
    public Class247 aClass247_10824;
    public String aString10825;
    int anInt10826;
    static int anInt10827;
    
    static final void method16765(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (-1050164879 * client.anInt11171 == 2
	    && i_0_ < client.anInt11324 * -1979292205)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= client.aClass28Array11327[i_0_].anInt258 * 1940141833;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    public static final void method16766
	(Class534_Sub37 class534_sub37, boolean bool, boolean bool_1_, int i) {
	int i_2_ = 1225863589 * class534_sub37.anInt10803;
	int i_3_ = (int) (8258869577519436579L * class534_sub37.aLong7158);
	class534_sub37.method8892((byte) 1);
	if (bool)
	    Class219.method4143(i_2_, -186192622);
	Class495.method8130(i_2_, -778219822);
	Class247 class247 = Class112.method2017(i_3_, 1741237480);
	if (null != class247)
	    Class454.method7416(class247, -2102859297);
	Class225.method4175(i_2_, 1506641933);
	if (!bool_1_ && client.anInt11185 * -993629849 != -1)
	    Class67.method1385(-993629849 * client.anInt11185, 1, 743051080);
	Class18 class18 = new Class18(client.aClass9_11224);
	for (Class534_Sub37 class534_sub37_4_
		 = (Class534_Sub37) class18.method793(2079574981);
	     null != class534_sub37_4_;
	     class534_sub37_4_ = (Class534_Sub37) class18.next()) {
	    if (!class534_sub37_4_.method8889(1739693107)) {
		class534_sub37_4_
		    = (Class534_Sub37) class18.method793(1314923677);
		if (null == class534_sub37_4_)
		    break;
	    }
	    if (3 == 410447 * class534_sub37_4_.anInt10804) {
		int i_5_ = (int) (8258869577519436579L
				  * class534_sub37_4_.aLong7158);
		if (i_2_ == i_5_ >>> 16)
		    method16766(class534_sub37_4_, true, bool_1_, -501970604);
	    }
	}
    }
    
    static final void method16767(Class669 class669, int i) {
	int i_6_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_6_, -60541639);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_6_ >> 16];
	Class375.method6411(class247, class243, class669, (short) 212);
    }
}
