/* Class545 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class545
{
    Class545() throws Throwable {
	throw new Error();
    }
    
    static final void method8963(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    public static void method8964(Class52_Sub1 class52_sub1, int i) {
	Class185.method3694(class52_sub1, -1600474947);
    }
    
    public static boolean method8965(CharSequence charsequence, int i) {
	return Class520.method8685(charsequence, 10, true, -382620464);
    }
    
    static final void method8966(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 1844562269 * client.anInt11020;
    }
    
    public static int method8967(Class443 class443, int i) {
	Class438 class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
	class438.method7021(class443);
	double d
	    = 1.5707963267948966 - Math.acos((double) class438.aFloat4863);
	class438.method7074();
	if (d < 0.0)
	    d = 3.141592653589793 + (3.141592653589793 + d);
	return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
    }
}
