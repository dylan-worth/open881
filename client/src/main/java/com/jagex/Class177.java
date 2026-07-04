/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class177
{
    Class186[] aClass186Array1849;
    int anInt1850;
    
    public Class186 method2930(int i) {
	return aClass186Array1849[i];
    }
    
    public Class177(Class472 class472) {
	anInt1850 = class472.method7726(0, (byte) 72) * 1447972299;
	aClass186Array1849 = new Class186[anInt1850 * -1815973917];
	for (int i = 0; i < anInt1850 * -1815973917; i++) {
	    Class534_Sub40 class534_sub40
		= new Class534_Sub40(class472.method7743(0, i, -735925446));
	    if (class534_sub40.aByteArray10810 == null)
		aClass186Array1849[i] = null;
	    else {
		try {
		    Class186 class186 = new Class186();
		    class186.method3697(i, class534_sub40, (short) 5142);
		    aClass186Array1849[i] = class186;
		} catch (Exception exception) {
		    aClass186Array1849[i] = null;
		}
	    }
	}
    }
    
    public Class186 method2931(int i, byte i_0_) {
	return aClass186Array1849[i];
    }
    
    public Class186 method2932(int i) {
	return aClass186Array1849[i];
    }
    
    static Class154[] method2933(int i) {
	return (new Class154[]
		{ Class154.aClass154_1736, Class154.aClass154_1735,
		  Class154.aClass154_1733, Class154.aClass154_1732,
		  Class154.aClass154_1734, Class154.aClass154_1737,
		  Class154.aClass154_1731 });
    }
    
    public static void method2934(short i) {
	synchronized (Class49.aClass203_364) {
	    Class49.aClass203_364.method3877(-1024312523);
	}
    }
    
    static final void method2935(Class669 class669, int i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (((Class205)
		Class200_Sub12.aClass44_Sub1_9934.method91(i_1_, -1122327537))
	       .anInt2212) * 858677227;
    }
    
    static final void method2936(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class503.aString5626.startsWith("linux") ? 1 : 0;
    }
    
    static final void method2937(Class669 class669, int i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (client.aClass219_11338.method4120(i_2_, (byte) 24).anInt2364
	       * 279279007);
    }
}
