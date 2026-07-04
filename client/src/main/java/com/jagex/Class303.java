/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class303
{
    static Class303 aClass303_3247;
    boolean aBool3248;
    static Class303 aClass303_3249;
    int anInt3250;
    static Class303 aClass303_3251 = new Class303(0, true);
    static long aLong3252;
    public static int anInt3253;
    
    public static Class303 method5571(int i) {
	if (aClass303_3251.anInt3250 * 1266327829 == i)
	    return aClass303_3251;
	if (i == 1266327829 * aClass303_3247.anInt3250)
	    return aClass303_3247;
	if (i == aClass303_3249.anInt3250 * 1266327829)
	    return aClass303_3249;
	return null;
    }
    
    static {
	aClass303_3247 = new Class303(1, true);
	aClass303_3249 = new Class303(2, false);
    }
    
    public static Class303 method5572(int i) {
	if (aClass303_3251.anInt3250 * 1266327829 == i)
	    return aClass303_3251;
	if (i == 1266327829 * aClass303_3247.anInt3250)
	    return aClass303_3247;
	if (i == aClass303_3249.anInt3250 * 1266327829)
	    return aClass303_3249;
	return null;
    }
    
    Class303(int i, boolean bool) {
	anInt3250 = -821778883 * i;
	aBool3248 = bool;
    }
    
    static final void method5573(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, 1594770204);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_0_ >> 16];
	Class206_Sub1.method15707(class247, class243, class669, (byte) -51);
    }
    
    static final void method5574(Class669 class669, int i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub5_10737),
						       i_1_, 2009150101);
	Class672.method11096((byte) 1);
	client.aBool11048 = false;
    }
    
    static final void method5575(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub22_10745
		  .method17077(-1654816606) ? 1 : 0;
    }
    
    static final void method5576(Class247 class247, Class243 class243,
				 Class669 class669, short i) {
	class669.anInt8600 -= 926998689;
	int i_2_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	short i_3_ = (short) (class669.anIntArray8595
			      [class669.anInt8600 * 2088438307 + 1]);
	short i_4_ = (short) (class669.anIntArray8595
			      [class669.anInt8600 * 2088438307 + 2]);
	if (i_2_ >= 0 && i_2_ < 5) {
	    class247.method4513(i_2_, i_3_, i_4_, (byte) -78);
	    Class454.method7416(class247, -1737397567);
	    if (-1 == class247.anInt2580 * 1365669833 && !class243.aBool2413)
		Class214.method4105(class247.anInt2454 * -1278450723, i_2_,
				    1974737684);
	}
    }
    
    public static final boolean method5577(char c, byte i) {
	return (c >= '!' && c < '0' || c >= ':' && c <= '@' && c != '<'
		|| c >= '[' && c <= '_' || c >= '{');
    }
}
