/* Class508 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class508
{
    static Class508 aClass508_5668;
    public static Class508 aClass508_5669 = new Class508();
    static Class508 aClass508_5670;
    
    static {
	aClass508_5668 = new Class508();
	aClass508_5670 = new Class508();
    }
    
    Class508() {
	/* empty */
    }
    
    static final void method8369(Class669 class669, byte i) {
	Class597 class597 = new Class597();
	class597.method9920((Class534_Sub36) (class669.anObjectArray8593
					      [(class669.anInt8594
						-= 1460193483) * 1485266147]),
			    (byte) 0);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class597.method9921((byte) -103);
    }
    
    static final void method8370(Class669 class669, int i) {
	Class534_Sub36 class534_sub36
	    = ((Class534_Sub36)
	       (class669.anObjectArray8593
		[(class669.anInt8594 -= 1460193483) * 1485266147]));
	if (Class599.aClass298_Sub1_7871.method5425(1353041802)
	    != Class293.aClass293_3131)
	    throw new RuntimeException();
	Class706_Sub1 class706_sub1
	    = ((Class706_Sub1)
	       Class599.aClass298_Sub1_7871.method5381(1576457299));
	class706_sub1.method17090(class534_sub36, -1851683363);
	client.aBool11147 = true;
    }
}
