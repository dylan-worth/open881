/* Class395 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Map;

public class Class395
{
    public int[] anIntArray4102;
    public int anInt4103;
    public Class534_Sub18_Sub12 aClass534_Sub18_Sub12_4104;
    
    public static Class395 method6563(Class534_Sub40 class534_sub40) {
	Class395 class395 = new Class395();
	class395.anInt4103 = class534_sub40.method16529((byte) 1) * 167533425;
	class395.aClass534_Sub18_Sub12_4104
	    = RuntimeException_Sub4.aClass56_12127
		  .method1218(class395.anInt4103 * -1791556207, -1581069180);
	return class395;
    }
    
    static final void method6564(Class669 class669, int i)
	throws Exception_Sub2 {
	class669.anInt8600 -= 1235998252;
	float f
	    = (float) class669.anIntArray8595[2088438307 * class669.anInt8600];
	float f_0_ = (float) (class669.anIntArray8595
			      [2088438307 * class669.anInt8600 + 1]);
	float f_1_ = (float) (class669.anIntArray8595
			      [class669.anInt8600 * 2088438307 + 2]);
	float f_2_ = ((float) (class669.anIntArray8595
			       [3 + class669.anInt8600 * 2088438307])
		      / 1000.0F);
	Class599.aClass298_Sub1_7871
	    .method5368(Class438.method6996(f, f_0_, f_1_), f_2_, -589065064);
    }
    
    public static Map method6565(Class110_Sub1[] class110_sub1s, byte i) {
	if (class110_sub1s == null || 0 == class110_sub1s.length)
	    return null;
	HashMap hashmap = new HashMap();
	Class110_Sub1[] class110_sub1s_3_ = class110_sub1s;
	for (int i_4_ = 0; i_4_ < class110_sub1s_3_.length; i_4_++) {
	    Class110_Sub1 class110_sub1 = class110_sub1s_3_[i_4_];
	    hashmap.put(class110_sub1.aClass453_8978, class110_sub1);
	}
	return hashmap;
    }
    
    static final void method6566(Class669 class669, byte i) {
	Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
	    = ((Class654_Sub1_Sub5_Sub1_Sub1)
	       class669.aClass654_Sub1_Sub5_Sub1_8604);
	boolean bool = false;
	Class307 class307 = class654_sub1_sub5_sub1_sub1.aClass307_12204;
	if (class307.anIntArray3284 != null)
	    class307 = class307.method5615(Class78.aClass103_825,
					   Class78.aClass103_825, -1466068515);
	if (null != class307)
	    bool = class307.aBool3313;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = bool ? 1 : 0;
    }
}
