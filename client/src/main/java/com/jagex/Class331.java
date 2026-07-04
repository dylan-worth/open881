/* Class331 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class331 implements Interface32
{
    Class392 aClass392_3492;
    Class472 aClass472_3493;
    Class163 aClass163_3494;
    static Class702 aClass702_3495;
    static Class534_Sub18_Sub7 aClass534_Sub18_Sub7_3496;
    static int[] anIntArray3497;
    public static RSSocket aClass23_3498;
    public static int anInt3499;
    
    public boolean method199(int i) {
	return aClass472_3493.method7670(1909682011 * aClass392_3492.anInt4077,
					 (byte) -70);
    }
    
    public void method201(short i) {
	aClass163_3494
	    = Class243.method4480(aClass472_3493,
				  1909682011 * aClass392_3492.anInt4077,
				  1092454170);
    }
    
    public boolean method206() {
	return aClass472_3493.method7670(1909682011 * aClass392_3492.anInt4077,
					 (byte) -36);
    }
    
    Class331(Class472 class472, Class392 class392) {
	aClass472_3493 = class472;
	aClass392_3492 = class392;
    }
    
    public void method202(boolean bool) {
	if (bool) {
	    int i = ((aClass392_3492.aClass401_4078.method6586
		      (aClass163_3494.method22(),
		       -321474631 * client.anInt11047, -1810063214))
		     + -1151439181 * aClass392_3492.anInt4079);
	    int i_0_ = ((aClass392_3492.aClass391_4080.method6544
			 (aClass163_3494.method2692(),
			  43072843 * client.anInt11192, (byte) 63))
			+ aClass392_3492.anInt4081 * -963484815);
	    aClass163_3494.method2656(i, i_0_);
	}
    }
    
    public void method203() {
	aClass163_3494
	    = Class243.method4480(aClass472_3493,
				  1909682011 * aClass392_3492.anInt4077,
				  -457434460);
    }
    
    public boolean method204() {
	return aClass472_3493.method7670(1909682011 * aClass392_3492.anInt4077,
					 (byte) -49);
    }
    
    public boolean method208() {
	return aClass472_3493.method7670(1909682011 * aClass392_3492.anInt4077,
					 (byte) -106);
    }
    
    public void method205(boolean bool, byte i) {
	if (bool) {
	    int i_1_ = ((aClass392_3492.aClass401_4078.method6586
			 (aClass163_3494.method22(),
			  -321474631 * client.anInt11047, -637464120))
			+ -1151439181 * aClass392_3492.anInt4079);
	    int i_2_ = ((aClass392_3492.aClass391_4080.method6544
			 (aClass163_3494.method2692(),
			  43072843 * client.anInt11192, (byte) 73))
			+ aClass392_3492.anInt4081 * -963484815);
	    aClass163_3494.method2656(i_1_, i_2_);
	}
    }
    
    public boolean method207() {
	return aClass472_3493.method7670(1909682011 * aClass392_3492.anInt4077,
					 (byte) -124);
    }
    
    public boolean method200() {
	return aClass472_3493.method7670(1909682011 * aClass392_3492.anInt4077,
					 (byte) -23);
    }
    
    static boolean method5856(byte i) {
	if (null == aClass534_Sub18_Sub7_3496)
	    return false;
	if (-1986934021 * aClass534_Sub18_Sub7_3496.anInt11706 >= 2000)
	    aClass534_Sub18_Sub7_3496.anInt11706 -= 585141872;
	if (1007 == aClass534_Sub18_Sub7_3496.anInt11706 * -1986934021)
	    return true;
	return false;
    }
    
    static final void method5857(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_3_ = 10;
	byte[] is = { (byte) class669.anIntArray8595
			     [2088438307 * class669.anInt8600] };
	byte[] is_4_ = { (byte) class669.anIntArray8595
				[1 + 2088438307 * class669.anInt8600] };
	Class337.method5903(class247, i_3_, is, is_4_, class669, -1444386474);
    }
    
    static final void method5858(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_5_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_6_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (RuntimeException_Sub4.aClass56_12127.method1218
	       (i_5_, -1581069180).anIntArray11800[i_6_]);
    }
    
    public static boolean method5859(int i) {
	return Class334.aBool3511;
    }
}
