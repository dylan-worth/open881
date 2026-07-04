/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class143
{
    int anInt1647;
    int anInt1648;
    int anInt1649 = 0;
    Class136[] aClass136Array1650;
    Class185_Sub3 aClass185_Sub3_1651;
    Class124 aClass124_1652;
    Class136_Sub4 aClass136_Sub4_1653;
    
    boolean method2416(int i) {
	return aClass136Array1650[i].method2347();
    }
    
    void method2417(int i, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
	bool_2_ &= aClass185_Sub3_1651.method15288();
	if (!bool_2_ && (i == 4 || i == 8 || i == 9)) {
	    if (i == 4)
		i_1_ = i_0_;
	    i = 2;
	}
	if (i != 0 && bool)
	    i |= ~0x7fffffff;
	if (anInt1648 != i) {
	    if (anInt1648 != 0)
		aClass136Array1650[anInt1648 & 0x7fffffff].method2327();
	    if (i != 0) {
		aClass136Array1650[i & 0x7fffffff].method2328(bool);
		aClass136Array1650[i & 0x7fffffff].method2329(bool);
		aClass136Array1650[i & 0x7fffffff].method2331(i_0_, i_1_);
	    }
	    anInt1648 = i;
	    anInt1649 = i_0_;
	    anInt1647 = i_1_;
	} else if (anInt1648 != 0) {
	    aClass136Array1650[anInt1648 & 0x7fffffff].method2329(bool);
	    if (anInt1649 != i_0_ || anInt1647 != i_1_) {
		aClass136Array1650[anInt1648 & 0x7fffffff].method2331(i_0_,
								      i_1_);
		anInt1649 = i_0_;
		anInt1647 = i_1_;
	    }
	}
    }
    
    void method2418(int i, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
	bool_5_ &= aClass185_Sub3_1651.method15288();
	if (!bool_5_ && (i == 4 || i == 8 || i == 9)) {
	    if (i == 4)
		i_4_ = i_3_;
	    i = 2;
	}
	if (i != 0 && bool)
	    i |= ~0x7fffffff;
	if (anInt1648 != i) {
	    if (anInt1648 != 0)
		aClass136Array1650[anInt1648 & 0x7fffffff].method2327();
	    if (i != 0) {
		aClass136Array1650[i & 0x7fffffff].method2328(bool);
		aClass136Array1650[i & 0x7fffffff].method2329(bool);
		aClass136Array1650[i & 0x7fffffff].method2331(i_3_, i_4_);
	    }
	    anInt1648 = i;
	    anInt1649 = i_3_;
	    anInt1647 = i_4_;
	} else if (anInt1648 != 0) {
	    aClass136Array1650[anInt1648 & 0x7fffffff].method2329(bool);
	    if (anInt1649 != i_3_ || anInt1647 != i_4_) {
		aClass136Array1650[anInt1648 & 0x7fffffff].method2331(i_3_,
								      i_4_);
		anInt1649 = i_3_;
		anInt1647 = i_4_;
	    }
	}
    }
    
    Class143(Class185_Sub3 class185_sub3) {
	anInt1647 = 0;
	anInt1648 = 0;
	aClass185_Sub3_1651 = class185_sub3;
	aClass124_1652 = new Class124(class185_sub3);
	aClass136Array1650 = new Class136[16];
	aClass136Array1650[1] = new Class136_Sub6(class185_sub3);
	aClass136Array1650[2]
	    = new Class136_Sub2(class185_sub3, aClass124_1652);
	aClass136Array1650[4]
	    = new Class136_Sub7(class185_sub3, aClass124_1652);
	aClass136Array1650[5]
	    = new Class136_Sub9(class185_sub3, aClass124_1652);
	aClass136Array1650[6] = new Class136_Sub8(class185_sub3);
	aClass136Array1650[7] = new Class136_Sub5(class185_sub3);
	aClass136Array1650[3] = aClass136_Sub4_1653
	    = new Class136_Sub4(class185_sub3);
	aClass136Array1650[8]
	    = new Class136_Sub3(class185_sub3, aClass124_1652);
	aClass136Array1650[9]
	    = new Class136_Sub1(class185_sub3, aClass124_1652);
	if (!aClass136Array1650[8].method2347())
	    aClass136Array1650[8] = aClass136Array1650[4];
	if (!aClass136Array1650[9].method2347())
	    aClass136Array1650[9] = aClass136Array1650[8];
    }
    
    boolean method2419(Class141 class141, int i) {
	if (anInt1648 == 0)
	    return false;
	aClass136Array1650[anInt1648 & 0x7fffffff].method2343(class141, i);
	return true;
    }
    
    boolean method2420(int i) {
	return aClass136Array1650[i].method2347();
    }
    
    boolean method2421(int i) {
	return aClass136Array1650[i].method2347();
    }
    
    void method2422(int i, int i_6_, int i_7_, boolean bool, boolean bool_8_) {
	bool_8_ &= aClass185_Sub3_1651.method15288();
	if (!bool_8_ && (i == 4 || i == 8 || i == 9)) {
	    if (i == 4)
		i_7_ = i_6_;
	    i = 2;
	}
	if (i != 0 && bool)
	    i |= ~0x7fffffff;
	if (anInt1648 != i) {
	    if (anInt1648 != 0)
		aClass136Array1650[anInt1648 & 0x7fffffff].method2327();
	    if (i != 0) {
		aClass136Array1650[i & 0x7fffffff].method2328(bool);
		aClass136Array1650[i & 0x7fffffff].method2329(bool);
		aClass136Array1650[i & 0x7fffffff].method2331(i_6_, i_7_);
	    }
	    anInt1648 = i;
	    anInt1649 = i_6_;
	    anInt1647 = i_7_;
	} else if (anInt1648 != 0) {
	    aClass136Array1650[anInt1648 & 0x7fffffff].method2329(bool);
	    if (anInt1649 != i_6_ || anInt1647 != i_7_) {
		aClass136Array1650[anInt1648 & 0x7fffffff].method2331(i_6_,
								      i_7_);
		anInt1649 = i_6_;
		anInt1647 = i_7_;
	    }
	}
    }
    
    boolean method2423(Class141 class141, int i) {
	if (anInt1648 == 0)
	    return false;
	aClass136Array1650[anInt1648 & 0x7fffffff].method2343(class141, i);
	return true;
    }
    
    boolean method2424(Class141 class141, int i) {
	if (anInt1648 == 0)
	    return false;
	aClass136Array1650[anInt1648 & 0x7fffffff].method2343(class141, i);
	return true;
    }
}
