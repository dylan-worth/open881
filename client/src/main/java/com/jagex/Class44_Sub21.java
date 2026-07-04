/* Class44_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class44_Sub21 extends Class44
{
    public Class44_Sub21(Class675 class675, Class672 class672,
			 Class472 class472) {
	super(class675, class672, class472, Class649.aClass649_8386, 128,
	      new Class61(com.jagex.Class41.class));
    }
    
    static String method17371(int[] is, int i) {
	StringBuilder stringbuilder = new StringBuilder();
	for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
	    Class273 class273
		= (Class273) Class223.aClass53_Sub2_2316.method91(is[i_0_],
								  -1545895926);
	    if (-1 != 2044266729 * class273.anInt3015)
		stringbuilder.append(" <sprite=").append
		    (class273.anInt3015 * 2044266729).append(">");
	}
	return stringbuilder.toString();
    }
}
