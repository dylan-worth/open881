/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class288 implements Interface76
{
    static Class288 aClass288_3085;
    static Class288 aClass288_3086;
    int anInt3087;
    static Class288 aClass288_3088;
    static Class288 aClass288_3089 = new Class288(0);
    
    static {
	aClass288_3085 = new Class288(1);
	aClass288_3086 = new Class288(2);
	aClass288_3088 = new Class288(3);
    }
    
    public int method93() {
	return anInt3087 * 1733332129;
    }
    
    Class288(int i) {
	anInt3087 = 1286625121 * i;
    }
    
    public int method22() {
	return anInt3087 * 1733332129;
    }
    
    public int method53() {
	return anInt3087 * 1733332129;
    }
    
    public static int method5272(int i) {
	Class534_Sub25.aTwitchEventLiveStreams10576 = null;
	int i_0_ = Class523.aTwitchTV7088
		       .RequestLiveStreams(client.aClass675_11016.aString8641);
	return i_0_;
    }
    
    static final void method5273(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2580 * 1365669833;
    }
    
    static final void method5274(Class669 class669, int i) {
	Class277.method5165((class669.anIntArray8595
			     [(class669.anInt8600 -= 308999563) * 2088438307]),
			    (short) 13633);
    }
    
    static final void method5275(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub28_10787
		  .method17131(-991656244);
    }
    
    public static Class16 method5276(Class472 class472, int i, int i_1_,
				     Interface2 interface2, int i_2_) {
	byte[] is = class472.method7743(i, i_1_, -1121633087);
	if (is == null)
	    return null;
	return new Class16(is, interface2);
    }
    
    static void method5277(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class264.method4839(string, -1465797036);
    }
    
    static final void method5278(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = null != Class246.aClass155_2425 ? 1 : 0;
    }
    
    static final boolean method5279(char c, byte i) {
	if (Character.isISOControl(c))
	    return false;
	if (Class604.method10031(c, 1402558755))
	    return true;
	char[] cs = Class93.aCharArray897;
	for (int i_3_ = 0; i_3_ < cs.length; i_3_++) {
	    char c_4_ = cs[i_3_];
	    if (c == c_4_)
		return true;
	}
	cs = Class93.aCharArray899;
	for (int i_5_ = 0; i_5_ < cs.length; i_5_++) {
	    char c_6_ = cs[i_5_];
	    if (c_6_ == c)
		return true;
	}
	return false;
    }
}
