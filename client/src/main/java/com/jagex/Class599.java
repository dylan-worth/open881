/* Class599 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class599 implements Interface76
{
    int anInt7867;
    public static Class599 aClass599_7868;
    public static Class599 aClass599_7869 = new Class599(0);
    public static Class599 aClass599_7870;
    public static Class298_Sub1 aClass298_Sub1_7871;
    
    public int method22() {
	return anInt7867 * -1454276099;
    }
    
    static {
	aClass599_7868 = new Class599(1);
	aClass599_7870 = new Class599(2);
    }
    
    Class599(int i) {
	anInt7867 = 1137140565 * i;
    }
    
    public int method53() {
	return anInt7867 * -1454276099;
    }
    
    public int method93() {
	return anInt7867 * -1454276099;
    }
    
    public static Class599[] method9943() {
	return (new Class599[]
		{ aClass599_7868, aClass599_7870, aClass599_7869 });
    }
    
    public static Class599[] method9944() {
	return (new Class599[]
		{ aClass599_7868, aClass599_7870, aClass599_7869 });
    }
    
    static final void method9945(Class669 class669, byte i) {
	if (-1050164879 * client.anInt11171 == 0)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -2;
	else if (1 == -1050164879 * client.anInt11171)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= client.anInt11324 * -1979292205;
    }
    
    static final void method9946(Class669 class669, boolean bool, int i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	Class81 class81 = Class524.method8734(i_0_, (short) -23886);
	if (class81 == null)
	    throw new RuntimeException();
	Class477.aList5190
	    = class81.method1634(Integer.valueOf(i_1_), (byte) -92);
	if (Class477.aList5190 != null) {
	    Class521.anIterator7064 = Class477.aList5190.iterator();
	    if (bool)
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = Class477.aList5190.size();
	} else if (bool)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static void method9947(int i) {
	Class113.anInt1365 = 0;
	Class113.anInt1381 = 1312565957;
	Class113.anInt1375 = 1660827629;
	Class113.anInt1376 = -517634255;
    }
}
