/* Class572 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class572 implements Interface68
{
    Class26 aClass26_7667;
    
    public void method286() {
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4158,
				  client.aClass100_11264.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16559(aClass26_7667.method93(), 312038777);
	client.aClass100_11264.method1863(class534_sub19, (byte) 109);
    }
    
    public void method203() {
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4158,
				  client.aClass100_11264.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16559(aClass26_7667.method93(), 531266172);
	client.aClass100_11264.method1863(class534_sub19, (byte) 85);
    }
    
    Class572(Class26 class26) {
	aClass26_7667 = class26;
    }
    
    public void method142() {
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4158,
				  client.aClass100_11264.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16559(aClass26_7667.method93(), 848603441);
	client.aClass100_11264.method1863(class534_sub19, (byte) 37);
    }
    
    public void method439() {
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4158,
				  client.aClass100_11264.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16559(aClass26_7667.method93(), 1427599620);
	client.aClass100_11264.method1863(class534_sub19, (byte) 96);
    }
    
    public void method356(int i) {
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4158,
				  client.aClass100_11264.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16559(aClass26_7667.method93(), 1348946791);
	client.aClass100_11264.method1863(class534_sub19, (byte) 61);
    }
    
    static final void method9635(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class663.method10996(class247, class243, class669, 756164357);
    }
    
    static final void method9636(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, -81480517);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_0_ >> 16];
	Class467.method7604(class247, class243, class669, -1182450631);
    }
    
    static final void method9637(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) client.aFloat11302 >> 3;
    }
    
    static final void method9638(Class669 class669, byte i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub22_10745,
	     (class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]),
	     839840028);
	Class672.method11096((byte) 1);
	client.aBool11048 = false;
    }
    
    static final void method9639(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_2_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_3_ = client.aClass492ArrayArray11027[i_2_][i_1_]
		       .method8086((byte) 62);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 2 == i_3_ ? 1 : 0;
    }
}
