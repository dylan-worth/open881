/* Class271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class271
{
    int anInt2960;
    static Class271 aClass271_2961;
    static Class271 aClass271_2962 = new Class271(0);
    static Class534_Sub18_Sub7 aClass534_Sub18_Sub7_2963;
    
    static {
	aClass271_2961 = new Class271(1);
    }
    
    Class271(int i) {
	anInt2960 = i * 98680741;
    }
    
    public static Class271 method5037(int i) {
	if (aClass271_2962.anInt2960 * -28635091 == i)
	    return aClass271_2962;
	if (-28635091 * aClass271_2961.anInt2960 == i)
	    return aClass271_2961;
	return null;
    }
    
    public static Class271 method5038(int i) {
	if (aClass271_2962.anInt2960 * -28635091 == i)
	    return aClass271_2962;
	if (-28635091 * aClass271_2961.anInt2960 == i)
	    return aClass271_2961;
	return null;
    }
    
    static final void method5039(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, 1686121915);
	Class12_Sub1.method17321(class247, class669, -1881803956);
    }
    
    public static Class695[] method5040(int i) {
	return (new Class695[]
		{ Class695.aClass695_8776, Class695.aClass695_8777,
		  Class695.aClass695_8775, Class695.aClass695_8779,
		  Class695.aClass695_8778, Class695.aClass695_8784,
		  Class695.aClass695_8782, Class695.aClass695_8780,
		  Class695.aClass695_8781, Class695.aClass695_8774 });
    }
    
    static final void method5041(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aBool11223 && !client.aBool11196 ? 1 : 0;
    }
    
    static void method5042(int i, boolean bool, byte i_1_) {
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) -18);
	if (null != class534_sub5)
	    class534_sub5.method8892((byte) 1);
    }
}
