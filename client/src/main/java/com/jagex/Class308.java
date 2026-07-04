/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class308
{
    static Class308 aClass308_3350 = new Class308(0);
    public static Class308 aClass308_3351 = new Class308(1);
    public int anInt3352;
    
    static Class308 method5650(int i) {
	if (964723235 * aClass308_3350.anInt3352 == i)
	    return aClass308_3350;
	if (964723235 * aClass308_3351.anInt3352 == i)
	    return aClass308_3351;
	return null;
    }
    
    Class308(int i) {
	anInt3352 = -253936245 * i;
    }
    
    static Class308 method5651(int i) {
	if (964723235 * aClass308_3350.anInt3352 == i)
	    return aClass308_3350;
	if (964723235 * aClass308_3351.anInt3352 == i)
	    return aClass308_3351;
	return null;
    }
    
    static Class308 method5652(int i) {
	if (964723235 * aClass308_3350.anInt3352 == i)
	    return aClass308_3350;
	if (964723235 * aClass308_3351.anInt3352 == i)
	    return aClass308_3351;
	return null;
    }
    
    static Class308 method5653(int i) {
	if (964723235 * aClass308_3350.anInt3352 == i)
	    return aClass308_3350;
	if (964723235 * aClass308_3351.anInt3352 == i)
	    return aClass308_3351;
	return null;
    }
    
    public static int method5654(int i, int i_0_, byte i_1_) {
	int i_2_ = i_0_ >>> 24;
	int i_3_ = 255 - i_2_;
	i_0_ = (i_2_ * (i_0_ & 0xff00ff) & ~0xff00ff
		| i_2_ * (i_0_ & 0xff00) & 0xff0000) >>> 8;
	return ((((i & 0xff00ff) * i_3_ & ~0xff00ff
		  | i_3_ * (i & 0xff00) & 0xff0000)
		 >>> 8)
		+ i_0_);
    }
    
    static String method5655(int i, byte i_4_) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    static int method5656
	(Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1, int i) {
	Class307 class307 = class654_sub1_sub5_sub1_sub1.aClass307_12204;
	if (class307.anIntArray3284 != null) {
	    class307 = class307.method5615(Class78.aClass103_825,
					   Class78.aClass103_825, -1466068515);
	    if (class307 == null)
		return -1;
	}
	int i_5_ = 1144816973 * class307.anInt3330;
	Class570 class570
	    = class654_sub1_sub5_sub1_sub1.method18531((byte) -23);
	int i_6_ = class654_sub1_sub5_sub1_sub1.aClass711_Sub1_11965
		       .method14329(1519275247);
	if (-1 == i_6_
	    || class654_sub1_sub5_sub1_sub1.aClass711_Sub1_11965.aBool10971)
	    i_5_ = class307.anInt3304 * 1315529581;
	else if (i_6_ == class570.anInt7642 * 1074876801
		 || class570.anInt7631 * 421310407 == i_6_
		 || i_6_ == class570.anInt7633 * 541177679
		 || -921167219 * class570.anInt7632 == i_6_)
	    i_5_ = class307.anInt3331 * -306882215;
	else if (class570.anInt7634 * 1846476627 == i_6_
		 || i_6_ == class570.anInt7638 * -63558043
		 || class570.anInt7647 * -1045334803 == i_6_
		 || i_6_ == 630970333 * class570.anInt7636)
	    i_5_ = 1912925203 * class307.anInt3329;
	return i_5_;
    }
}
