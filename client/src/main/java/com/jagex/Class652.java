/* Class652 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;

public class Class652
{
    Class376 aClass376_8481;
    public HashMap aHashMap8482;
    static int anInt8483;
    public static int anInt8484;
    
    void method10733() {
	aHashMap8482 = new HashMap();
	aHashMap8482.put(Class496.aClass496_5540, Integer.valueOf(50));
    }
    
    void method10734(short i) {
	aHashMap8482 = new HashMap();
	aHashMap8482.put(Class496.aClass496_5540, Integer.valueOf(50));
    }
    
    void method10735() {
	aHashMap8482 = new HashMap();
	aHashMap8482.put(Class496.aClass496_5540, Integer.valueOf(50));
    }
    
    void method10736() {
	aHashMap8482 = new HashMap();
	aHashMap8482.put(Class496.aClass496_5540, Integer.valueOf(50));
    }
    
    public Class652(Class376 class376) {
	method10734((short) 86);
	aClass376_8481 = class376;
    }
    
    static final void method10737(Class669 class669, short i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4206,
				  client.aClass100_11264.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16507(i_0_,
							      2009564393);
	client.aClass100_11264.method1863(class534_sub19, (byte) 52);
    }
    
    static final void method10738(Class669 class669, int i) {
	if (Class713.aBool8884) {
	    Class6[] class6s = Class264.method4841((byte) -87);
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class6s.length;
	} else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
}
