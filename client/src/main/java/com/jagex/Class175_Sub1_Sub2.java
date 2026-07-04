/* Class175_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class175_Sub1_Sub2 extends Class175_Sub1
{
    static final int anInt11385 = 16;
    Class185_Sub3 aClass185_Sub3_11386;
    int anInt11387;
    int anInt11388;
    int anInt11389;
    int anInt11390;
    int anInt11391;
    Interface17 anInterface17_11392;
    Interface17[] anInterface17Array11393 = new Interface17[4];
    
    public void method15079(int i, Interface22 interface22) {
	int i_0_ = 1 << i;
	Interface17 interface17 = (Interface17) interface22;
	if (interface22 != null) {
	    if ((anInt11390 | i_0_) != i_0_) {
		if (anInt11388 != interface17.method1()
		    || anInt11389 != interface17.method93())
		    throw new RuntimeException();
	    } else {
		anInt11389 = interface17.method93();
		anInt11388 = interface17.method1();
		if (this == aClass185_Sub3_11386.method3253(-874787498))
		    aClass185_Sub3_11386.method15422();
	    }
	    anInt11390 |= i_0_;
	    anInterface17Array11393[i] = interface17;
	} else {
	    anInt11390 &= i_0_ ^ 0xffffffff;
	    anInterface17Array11393[i] = null;
	    if (anInt11390 == 0) {
		anInt11389 = 0;
		anInt11388 = 0;
	    }
	}
	if (this == aClass185_Sub3_11386.method3253(-1281061525))
	    method17913(i);
	else
	    anInt11391 |= i_0_;
    }
    
    public int method2910() {
	return anInt11388;
    }
    
    public void finalize() throws Throwable {
	super.finalize();
	method142();
    }
    
    public void method15074(Interface21 interface21) {
	Interface17 interface17 = (Interface17) interface21;
	if (interface21 != null) {
	    if ((anInt11390 | 0x10) != 16) {
		if (anInt11388 != interface17.method1()
		    || anInt11389 != interface17.method93())
		    throw new RuntimeException();
	    } else {
		anInt11389 = interface17.method93();
		anInt11388 = interface17.method1();
		if (this == aClass185_Sub3_11386.method3253(-293033669))
		    aClass185_Sub3_11386.method15422();
	    }
	    anInt11390 |= 0x10;
	    anInterface17_11392 = interface17;
	} else {
	    anInt11390 &= ~0x10;
	    anInterface17_11392 = null;
	    if (anInt11390 == 0) {
		anInt11389 = 0;
		anInt11388 = 0;
	    }
	}
	if (this == aClass185_Sub3_11386.method3253(-95394736))
	    method17917();
	else
	    anInt11391 |= 0x10;
    }
    
    Class175_Sub1_Sub2(Class185_Sub3 class185_sub3) {
	if (!class185_sub3.aBool9685)
	    throw new IllegalStateException("");
	aClass185_Sub3_11386 = class185_sub3;
	int[] is = new int[1];
	OpenGL.glGenFramebuffersEXT(1, is, 0);
	anInt11387 = is[0];
    }
    
    void method17913(int i) {
	Interface17 interface17 = anInterface17Array11393[i];
	if (interface17 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface17.method65(36064 + i);
    }
    
    public void method364() {
	if (anInt11387 != 0) {
	    aClass185_Sub3_11386.method15253(anInt11387);
	    anInt11387 = 0;
	}
    }
    
    public boolean method15076() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    boolean method357() {
	OpenGL.glBindFramebufferEXT(36160, anInt11387);
	for (int i = 0; i < 4; i++) {
	    if ((anInt11391 & 1 << i) != 0)
		method17913(i);
	}
	if ((anInt11391 & 0x10) != 0)
	    method17917();
	anInt11391 = 0;
	aClass185_Sub3_11386.method15209();
	return true;
    }
    
    boolean method2912() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    void method17914(int i) {
	OpenGL.glDrawBuffer(36064 + i);
    }
    
    public void method15077(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			    int i_5_, boolean bool, boolean bool_6_) {
	if (bool | bool_6_) {
	    int i_7_ = anInt11389;
	    int i_8_
		= aClass185_Sub3_11386.method3253(-2030259181).method2911();
	    int i_9_ = 0;
	    if (bool_6_)
		i_9_ |= 0x100;
	    if (bool)
		i_9_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, anInt11387);
	    OpenGL.glBlitFramebufferEXT(i, i_7_ - i_1_ - i_3_, i + i_2_,
					i_7_ - i_1_, i_4_, i_8_ - i_5_ - i_3_,
					i_4_ + i_2_, i_8_ - i_5_, i_9_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method142() {
	if (anInt11387 != 0) {
	    aClass185_Sub3_11386.method15253(anInt11387);
	    anInt11387 = 0;
	}
    }
    
    boolean method358() {
	OpenGL.glBindFramebufferEXT(36160, anInt11387);
	for (int i = 0; i < 4; i++) {
	    if ((anInt11391 & 1 << i) != 0)
		method17913(i);
	}
	if ((anInt11391 & 0x10) != 0)
	    method17917();
	anInt11391 = 0;
	aClass185_Sub3_11386.method15209();
	return true;
    }
    
    public int method2913() {
	return anInt11388;
    }
    
    public int method2914() {
	return anInt11389;
    }
    
    boolean method2918() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    public void method15078(int i, Interface22 interface22) {
	int i_10_ = 1 << i;
	Interface17 interface17 = (Interface17) interface22;
	if (interface22 != null) {
	    if ((anInt11390 | i_10_) != i_10_) {
		if (anInt11388 != interface17.method1()
		    || anInt11389 != interface17.method93())
		    throw new RuntimeException();
	    } else {
		anInt11389 = interface17.method93();
		anInt11388 = interface17.method1();
		if (this == aClass185_Sub3_11386.method3253(-507096469))
		    aClass185_Sub3_11386.method15422();
	    }
	    anInt11390 |= i_10_;
	    anInterface17Array11393[i] = interface17;
	} else {
	    anInt11390 &= i_10_ ^ 0xffffffff;
	    anInterface17Array11393[i] = null;
	    if (anInt11390 == 0) {
		anInt11389 = 0;
		anInt11388 = 0;
	    }
	}
	if (this == aClass185_Sub3_11386.method3253(-1139329944))
	    method17913(i);
	else
	    anInt11391 |= i_10_;
    }
    
    void method17915() {
	if (anInterface17_11392 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    anInterface17_11392.method65(36096);
    }
    
    public void method15080(int i, Interface22 interface22) {
	int i_11_ = 1 << i;
	Interface17 interface17 = (Interface17) interface22;
	if (interface22 != null) {
	    if ((anInt11390 | i_11_) != i_11_) {
		if (anInt11388 != interface17.method1()
		    || anInt11389 != interface17.method93())
		    throw new RuntimeException();
	    } else {
		anInt11389 = interface17.method93();
		anInt11388 = interface17.method1();
		if (this == aClass185_Sub3_11386.method3253(-71046195))
		    aClass185_Sub3_11386.method15422();
	    }
	    anInt11390 |= i_11_;
	    anInterface17Array11393[i] = interface17;
	} else {
	    anInt11390 &= i_11_ ^ 0xffffffff;
	    anInterface17Array11393[i] = null;
	    if (anInt11390 == 0) {
		anInt11389 = 0;
		anInt11388 = 0;
	    }
	}
	if (this == aClass185_Sub3_11386.method3253(-1450887675))
	    method17913(i);
	else
	    anInt11391 |= i_11_;
    }
    
    public void method15081(Interface21 interface21) {
	Interface17 interface17 = (Interface17) interface21;
	if (interface21 != null) {
	    if ((anInt11390 | 0x10) != 16) {
		if (anInt11388 != interface17.method1()
		    || anInt11389 != interface17.method93())
		    throw new RuntimeException();
	    } else {
		anInt11389 = interface17.method93();
		anInt11388 = interface17.method1();
		if (this == aClass185_Sub3_11386.method3253(-1677988909))
		    aClass185_Sub3_11386.method15422();
	    }
	    anInt11390 |= 0x10;
	    anInterface17_11392 = interface17;
	} else {
	    anInt11390 &= ~0x10;
	    anInterface17_11392 = null;
	    if (anInt11390 == 0) {
		anInt11389 = 0;
		anInt11388 = 0;
	    }
	}
	if (this == aClass185_Sub3_11386.method3253(-193498572))
	    method17917();
	else
	    anInt11391 |= 0x10;
    }
    
    public void method15073(Interface21 interface21) {
	Interface17 interface17 = (Interface17) interface21;
	if (interface21 != null) {
	    if ((anInt11390 | 0x10) != 16) {
		if (anInt11388 != interface17.method1()
		    || anInt11389 != interface17.method93())
		    throw new RuntimeException();
	    } else {
		anInt11389 = interface17.method93();
		anInt11388 = interface17.method1();
		if (this == aClass185_Sub3_11386.method3253(-551551273))
		    aClass185_Sub3_11386.method15422();
	    }
	    anInt11390 |= 0x10;
	    anInterface17_11392 = interface17;
	} else {
	    anInt11390 &= ~0x10;
	    anInterface17_11392 = null;
	    if (anInt11390 == 0) {
		anInt11389 = 0;
		anInt11388 = 0;
	    }
	}
	if (this == aClass185_Sub3_11386.method3253(-799037697))
	    method17917();
	else
	    anInt11391 |= 0x10;
    }
    
    public void method362() {
	if (anInt11387 != 0) {
	    aClass185_Sub3_11386.method15253(anInt11387);
	    anInt11387 = 0;
	}
    }
    
    public void method15083(Interface21 interface21) {
	Interface17 interface17 = (Interface17) interface21;
	if (interface21 != null) {
	    if ((anInt11390 | 0x10) != 16) {
		if (anInt11388 != interface17.method1()
		    || anInt11389 != interface17.method93())
		    throw new RuntimeException();
	    } else {
		anInt11389 = interface17.method93();
		anInt11388 = interface17.method1();
		if (this == aClass185_Sub3_11386.method3253(-759848719))
		    aClass185_Sub3_11386.method15422();
	    }
	    anInt11390 |= 0x10;
	    anInterface17_11392 = interface17;
	} else {
	    anInt11390 &= ~0x10;
	    anInterface17_11392 = null;
	    if (anInt11390 == 0) {
		anInt11389 = 0;
		anInt11388 = 0;
	    }
	}
	if (this == aClass185_Sub3_11386.method3253(-1184604537))
	    method17917();
	else
	    anInt11391 |= 0x10;
    }
    
    public boolean method15084() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    boolean method207() {
	OpenGL.glBindFramebufferEXT(36160, anInt11387);
	for (int i = 0; i < 4; i++) {
	    if ((anInt11391 & 1 << i) != 0)
		method17913(i);
	}
	if ((anInt11391 & 0x10) != 0)
	    method17917();
	anInt11391 = 0;
	aClass185_Sub3_11386.method15209();
	return true;
    }
    
    public void method15082(Interface21 interface21) {
	Interface17 interface17 = (Interface17) interface21;
	if (interface21 != null) {
	    if ((anInt11390 | 0x10) != 16) {
		if (anInt11388 != interface17.method1()
		    || anInt11389 != interface17.method93())
		    throw new RuntimeException();
	    } else {
		anInt11389 = interface17.method93();
		anInt11388 = interface17.method1();
		if (this == aClass185_Sub3_11386.method3253(-652311797))
		    aClass185_Sub3_11386.method15422();
	    }
	    anInt11390 |= 0x10;
	    anInterface17_11392 = interface17;
	} else {
	    anInt11390 &= ~0x10;
	    anInterface17_11392 = null;
	    if (anInt11390 == 0) {
		anInt11389 = 0;
		anInt11388 = 0;
	    }
	}
	if (this == aClass185_Sub3_11386.method3253(-1009887086))
	    method17917();
	else
	    anInt11391 |= 0x10;
    }
    
    boolean method206() {
	OpenGL.glBindFramebufferEXT(36160, anInt11387);
	for (int i = 0; i < 4; i++) {
	    if ((anInt11391 & 1 << i) != 0)
		method17913(i);
	}
	if ((anInt11391 & 0x10) != 0)
	    method17917();
	anInt11391 = 0;
	aClass185_Sub3_11386.method15209();
	return true;
    }
    
    boolean method360() {
	OpenGL.glBindFramebufferEXT(36160, anInt11387);
	for (int i = 0; i < 4; i++) {
	    if ((anInt11391 & 1 << i) != 0)
		method17913(i);
	}
	if ((anInt11391 & 0x10) != 0)
	    method17917();
	anInt11391 = 0;
	aClass185_Sub3_11386.method15209();
	return true;
    }
    
    public boolean method15085() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    public int method2911() {
	return anInt11389;
    }
    
    boolean method2917() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    public void method15075(int i, Interface22 interface22) {
	int i_12_ = 1 << i;
	Interface17 interface17 = (Interface17) interface22;
	if (interface22 != null) {
	    if ((anInt11390 | i_12_) != i_12_) {
		if (anInt11388 != interface17.method1()
		    || anInt11389 != interface17.method93())
		    throw new RuntimeException();
	    } else {
		anInt11389 = interface17.method93();
		anInt11388 = interface17.method1();
		if (this == aClass185_Sub3_11386.method3253(-952166552))
		    aClass185_Sub3_11386.method15422();
	    }
	    anInt11390 |= i_12_;
	    anInterface17Array11393[i] = interface17;
	} else {
	    anInt11390 &= i_12_ ^ 0xffffffff;
	    anInterface17Array11393[i] = null;
	    if (anInt11390 == 0) {
		anInt11389 = 0;
		anInt11388 = 0;
	    }
	}
	if (this == aClass185_Sub3_11386.method3253(-1882276804))
	    method17913(i);
	else
	    anInt11391 |= i_12_;
    }
    
    public void method361() {
	if (anInt11387 != 0) {
	    aClass185_Sub3_11386.method15253(anInt11387);
	    anInt11387 = 0;
	}
    }
    
    void method17916(int i) {
	Interface17 interface17 = anInterface17Array11393[i];
	if (interface17 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface17.method65(36064 + i);
    }
    
    void method17917() {
	if (anInterface17_11392 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    anInterface17_11392.method65(36096);
    }
    
    void method17918() throws Throwable {
	super.finalize();
	method142();
    }
    
    void method17919() throws Throwable {
	super.finalize();
	method142();
    }
    
    void method17920() throws Throwable {
	super.finalize();
	method142();
    }
    
    public int method2915() {
	return anInt11389;
    }
    
    boolean method2916() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    void method17921() {
	if (anInterface17_11392 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    anInterface17_11392.method65(36096);
    }
    
    void method17922(int i) {
	OpenGL.glDrawBuffer(36064 + i);
    }
    
    void method17923(int i) {
	OpenGL.glDrawBuffer(36064 + i);
    }
    
    void method17924(int i) {
	OpenGL.glDrawBuffer(36064 + i);
    }
    
    public void method15086(int i, int i_13_, int i_14_, int i_15_, int i_16_,
			    int i_17_, boolean bool, boolean bool_18_) {
	if (bool | bool_18_) {
	    int i_19_ = anInt11389;
	    int i_20_
		= aClass185_Sub3_11386.method3253(-2134171926).method2911();
	    int i_21_ = 0;
	    if (bool_18_)
		i_21_ |= 0x100;
	    if (bool)
		i_21_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, anInt11387);
	    OpenGL.glBlitFramebufferEXT(i, i_19_ - i_13_ - i_15_, i + i_14_,
					i_19_ - i_13_, i_16_,
					i_20_ - i_17_ - i_15_, i_16_ + i_14_,
					i_20_ - i_17_, i_21_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method15087(int i, int i_22_, int i_23_, int i_24_, int i_25_,
			    int i_26_, boolean bool, boolean bool_27_) {
	if (bool | bool_27_) {
	    int i_28_ = anInt11389;
	    int i_29_
		= aClass185_Sub3_11386.method3253(-2056571357).method2911();
	    int i_30_ = 0;
	    if (bool_27_)
		i_30_ |= 0x100;
	    if (bool)
		i_30_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, anInt11387);
	    OpenGL.glBlitFramebufferEXT(i, i_28_ - i_22_ - i_24_, i + i_23_,
					i_28_ - i_22_, i_25_,
					i_29_ - i_26_ - i_24_, i_25_ + i_23_,
					i_29_ - i_26_, i_30_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
}
