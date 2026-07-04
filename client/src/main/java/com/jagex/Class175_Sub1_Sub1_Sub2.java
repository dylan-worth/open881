/* Class175_Sub1_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class175_Sub1_Sub1_Sub2 extends Class175_Sub1_Sub1
{
    Interface57 anInterface57_12111;
    Class185_Sub1_Sub2 aClass185_Sub1_Sub2_12112;
    int anInt12113;
    int anInt12114;
    int anInt12115;
    static final int anInt12116 = 16;
    int anInt12117;
    int anInt12118;
    Interface57[] anInterface57Array12119 = new Interface57[4];
    
    public void method15073(Interface21 interface21) {
	Interface57 interface57 = (Interface57) interface21;
	if (interface21 != null) {
	    if (anInt12118 != 0) {
		if (anInt12114 != interface57.method1()
		    || anInt12113 != interface57.method93())
		    throw new RuntimeException();
	    } else {
		anInt12113 = interface57.method93();
		anInt12114 = interface57.method1();
		method17909();
	    }
	    anInt12118 |= 0x10;
	    anInterface57_12111 = interface57;
	} else {
	    anInt12118 &= ~0x10;
	    anInterface57_12111 = null;
	    if (anInt12118 == 0) {
		anInt12113 = 0;
		anInt12114 = 0;
	    }
	}
	if (this == aClass185_Sub1_Sub2_12112.method3253(-2110839176))
	    method18743();
	else
	    anInt12117 |= 0x10;
    }
    
    public int method2910() {
	return anInt12114;
    }
    
    public int method2911() {
	return anInt12113;
    }
    
    void method18740() throws Throwable {
	super.finalize();
	method142();
    }
    
    public int method2913() {
	return anInt12114;
    }
    
    void method18741(int i) {
	Interface57 interface57 = anInterface57Array12119[i];
	if (interface57 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface57.method65(36064 + i);
    }
    
    boolean method360() {
	OpenGL.glBindFramebufferEXT(36160, anInt12115);
	for (int i = 0; i < 4; i++) {
	    if ((anInt12117 & 1 << i) != 0)
		method18741(i);
	}
	if ((anInt12117 & 0x10) != 0)
	    method18743();
	anInt12117 = 0;
	return super.method358();
    }
    
    public boolean method15076() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    boolean method358() {
	OpenGL.glBindFramebufferEXT(36160, anInt12115);
	for (int i = 0; i < 4; i++) {
	    if ((anInt12117 & 1 << i) != 0)
		method18741(i);
	}
	if ((anInt12117 & 0x10) != 0)
	    method18743();
	anInt12117 = 0;
	return super.method358();
    }
    
    void method18742() throws Throwable {
	super.finalize();
	method142();
    }
    
    public void method15077(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			    int i_4_, boolean bool, boolean bool_5_) {
	if (bool | bool_5_) {
	    int i_6_ = anInt12113;
	    int i_7_
		= aClass185_Sub1_Sub2_12112.method3253(-35693871).method2911();
	    int i_8_ = 0;
	    if (bool_5_)
		i_8_ |= 0x100;
	    if (bool)
		i_8_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, anInt12115);
	    OpenGL.glBlitFramebufferEXT(i, i_6_ - i_0_ - i_2_, i + i_1_,
					i_6_ - i_0_, i_3_, i_7_ - i_4_ - i_2_,
					i_3_ + i_1_, i_7_ - i_4_, i_8_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method142() {
	if (anInt12115 != 0) {
	    aClass185_Sub1_Sub2_12112.method18071(anInt12115);
	    anInt12115 = 0;
	}
    }
    
    public void finalize() throws Throwable {
	super.finalize();
	method142();
    }
    
    boolean method2916() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    public int method2914() {
	return anInt12113;
    }
    
    public int method2915() {
	return anInt12113;
    }
    
    public void method15078(int i, Interface22 interface22) {
	int i_9_ = 1 << i;
	Interface57 interface57 = (Interface57) interface22;
	if (interface22 != null) {
	    if (anInt12118 != 0) {
		if (anInt12114 != interface57.method1()
		    || anInt12113 != interface57.method93())
		    throw new RuntimeException();
	    } else {
		anInt12113 = interface57.method93();
		anInt12114 = interface57.method1();
		method17909();
	    }
	    anInt12118 |= i_9_;
	    anInterface57Array12119[i] = interface57;
	} else {
	    anInt12118 &= i_9_ ^ 0xffffffff;
	    anInterface57Array12119[i] = null;
	    if (anInt12118 == 0) {
		anInt12113 = 0;
		anInt12114 = 0;
	    }
	}
	if (this == aClass185_Sub1_Sub2_12112.method3253(-1841264610))
	    method18741(i);
	else
	    anInt12117 |= i_9_;
    }
    
    public void method15079(int i, Interface22 interface22) {
	int i_10_ = 1 << i;
	Interface57 interface57 = (Interface57) interface22;
	if (interface22 != null) {
	    if (anInt12118 != 0) {
		if (anInt12114 != interface57.method1()
		    || anInt12113 != interface57.method93())
		    throw new RuntimeException();
	    } else {
		anInt12113 = interface57.method93();
		anInt12114 = interface57.method1();
		method17909();
	    }
	    anInt12118 |= i_10_;
	    anInterface57Array12119[i] = interface57;
	} else {
	    anInt12118 &= i_10_ ^ 0xffffffff;
	    anInterface57Array12119[i] = null;
	    if (anInt12118 == 0) {
		anInt12113 = 0;
		anInt12114 = 0;
	    }
	}
	if (this == aClass185_Sub1_Sub2_12112.method3253(-835369582))
	    method18741(i);
	else
	    anInt12117 |= i_10_;
    }
    
    void method18743() {
	if (anInterface57_12111 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    anInterface57_12111.method65(36096);
    }
    
    public void method15081(Interface21 interface21) {
	Interface57 interface57 = (Interface57) interface21;
	if (interface21 != null) {
	    if (anInt12118 != 0) {
		if (anInt12114 != interface57.method1()
		    || anInt12113 != interface57.method93())
		    throw new RuntimeException();
	    } else {
		anInt12113 = interface57.method93();
		anInt12114 = interface57.method1();
		method17909();
	    }
	    anInt12118 |= 0x10;
	    anInterface57_12111 = interface57;
	} else {
	    anInt12118 &= ~0x10;
	    anInterface57_12111 = null;
	    if (anInt12118 == 0) {
		anInt12113 = 0;
		anInt12114 = 0;
	    }
	}
	if (this == aClass185_Sub1_Sub2_12112.method3253(-247065955))
	    method18743();
	else
	    anInt12117 |= 0x10;
    }
    
    public void method15075(int i, Interface22 interface22) {
	int i_11_ = 1 << i;
	Interface57 interface57 = (Interface57) interface22;
	if (interface22 != null) {
	    if (anInt12118 != 0) {
		if (anInt12114 != interface57.method1()
		    || anInt12113 != interface57.method93())
		    throw new RuntimeException();
	    } else {
		anInt12113 = interface57.method93();
		anInt12114 = interface57.method1();
		method17909();
	    }
	    anInt12118 |= i_11_;
	    anInterface57Array12119[i] = interface57;
	} else {
	    anInt12118 &= i_11_ ^ 0xffffffff;
	    anInterface57Array12119[i] = null;
	    if (anInt12118 == 0) {
		anInt12113 = 0;
		anInt12114 = 0;
	    }
	}
	if (this == aClass185_Sub1_Sub2_12112.method3253(-2056233292))
	    method18741(i);
	else
	    anInt12117 |= i_11_;
    }
    
    public void method15080(int i, Interface22 interface22) {
	int i_12_ = 1 << i;
	Interface57 interface57 = (Interface57) interface22;
	if (interface22 != null) {
	    if (anInt12118 != 0) {
		if (anInt12114 != interface57.method1()
		    || anInt12113 != interface57.method93())
		    throw new RuntimeException();
	    } else {
		anInt12113 = interface57.method93();
		anInt12114 = interface57.method1();
		method17909();
	    }
	    anInt12118 |= i_12_;
	    anInterface57Array12119[i] = interface57;
	} else {
	    anInt12118 &= i_12_ ^ 0xffffffff;
	    anInterface57Array12119[i] = null;
	    if (anInt12118 == 0) {
		anInt12113 = 0;
		anInt12114 = 0;
	    }
	}
	if (this == aClass185_Sub1_Sub2_12112.method3253(-522677707))
	    method18741(i);
	else
	    anInt12117 |= i_12_;
    }
    
    boolean method2912() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    Class175_Sub1_Sub1_Sub2(Class185_Sub1_Sub2 class185_sub1_sub2) {
	super((Class185_Sub1) class185_sub1_sub2);
	aClass185_Sub1_Sub2_12112 = class185_sub1_sub2;
	int[] is = new int[1];
	if (!aClass185_Sub1_Sub2_12112.aBool9271)
	    throw new RuntimeException("");
	OpenGL.glGenFramebuffersEXT(1, is, 0);
	anInt12115 = is[0];
    }
    
    public boolean method15085() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    boolean method207() {
	OpenGL.glBindFramebufferEXT(36160, anInt12115);
	for (int i = 0; i < 4; i++) {
	    if ((anInt12117 & 1 << i) != 0)
		method18741(i);
	}
	if ((anInt12117 & 0x10) != 0)
	    method18743();
	anInt12117 = 0;
	return super.method358();
    }
    
    boolean method206() {
	OpenGL.glBindFramebufferEXT(36160, anInt12115);
	for (int i = 0; i < 4; i++) {
	    if ((anInt12117 & 1 << i) != 0)
		method18741(i);
	}
	if ((anInt12117 & 0x10) != 0)
	    method18743();
	anInt12117 = 0;
	return super.method358();
    }
    
    public boolean method15084() {
	int i = OpenGL.glCheckFramebufferStatusEXT(36160);
	if (i != 36053)
	    return false;
	return true;
    }
    
    boolean method357() {
	OpenGL.glBindFramebufferEXT(36160, anInt12115);
	for (int i = 0; i < 4; i++) {
	    if ((anInt12117 & 1 << i) != 0)
		method18741(i);
	}
	if ((anInt12117 & 0x10) != 0)
	    method18743();
	anInt12117 = 0;
	return super.method358();
    }
    
    void method18744(int i) {
	Interface57 interface57 = anInterface57Array12119[i];
	if (interface57 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface57.method65(36064 + i);
    }
    
    boolean method2917() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    boolean method2918() {
	OpenGL.glBindFramebufferEXT(36160, 0);
	return true;
    }
    
    public void method361() {
	if (anInt12115 != 0) {
	    aClass185_Sub1_Sub2_12112.method18071(anInt12115);
	    anInt12115 = 0;
	}
    }
    
    public void method362() {
	if (anInt12115 != 0) {
	    aClass185_Sub1_Sub2_12112.method18071(anInt12115);
	    anInt12115 = 0;
	}
    }
    
    public void method364() {
	if (anInt12115 != 0) {
	    aClass185_Sub1_Sub2_12112.method18071(anInt12115);
	    anInt12115 = 0;
	}
    }
    
    void method18745() throws Throwable {
	super.finalize();
	method142();
    }
    
    public void method15083(Interface21 interface21) {
	Interface57 interface57 = (Interface57) interface21;
	if (interface21 != null) {
	    if (anInt12118 != 0) {
		if (anInt12114 != interface57.method1()
		    || anInt12113 != interface57.method93())
		    throw new RuntimeException();
	    } else {
		anInt12113 = interface57.method93();
		anInt12114 = interface57.method1();
		method17909();
	    }
	    anInt12118 |= 0x10;
	    anInterface57_12111 = interface57;
	} else {
	    anInt12118 &= ~0x10;
	    anInterface57_12111 = null;
	    if (anInt12118 == 0) {
		anInt12113 = 0;
		anInt12114 = 0;
	    }
	}
	if (this == aClass185_Sub1_Sub2_12112.method3253(-1494175395))
	    method18743();
	else
	    anInt12117 |= 0x10;
    }
    
    void method18746(int i) {
	Interface57 interface57 = anInterface57Array12119[i];
	if (interface57 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface57.method65(36064 + i);
    }
    
    public void method15086(int i, int i_13_, int i_14_, int i_15_, int i_16_,
			    int i_17_, boolean bool, boolean bool_18_) {
	if (bool | bool_18_) {
	    int i_19_ = anInt12113;
	    int i_20_ = aClass185_Sub1_Sub2_12112.method3253(-741920007)
			    .method2911();
	    int i_21_ = 0;
	    if (bool_18_)
		i_21_ |= 0x100;
	    if (bool)
		i_21_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, anInt12115);
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
	    int i_28_ = anInt12113;
	    int i_29_ = aClass185_Sub1_Sub2_12112.method3253(-1818866418)
			    .method2911();
	    int i_30_ = 0;
	    if (bool_27_)
		i_30_ |= 0x100;
	    if (bool)
		i_30_ |= 0x4000;
	    OpenGL.glBindFramebufferEXT(36008, anInt12115);
	    OpenGL.glBlitFramebufferEXT(i, i_28_ - i_22_ - i_24_, i + i_23_,
					i_28_ - i_22_, i_25_,
					i_29_ - i_26_ - i_24_, i_25_ + i_23_,
					i_29_ - i_26_, i_30_, 9728);
	    OpenGL.glBindFramebufferEXT(36008, 0);
	}
    }
    
    public void method15082(Interface21 interface21) {
	Interface57 interface57 = (Interface57) interface21;
	if (interface21 != null) {
	    if (anInt12118 != 0) {
		if (anInt12114 != interface57.method1()
		    || anInt12113 != interface57.method93())
		    throw new RuntimeException();
	    } else {
		anInt12113 = interface57.method93();
		anInt12114 = interface57.method1();
		method17909();
	    }
	    anInt12118 |= 0x10;
	    anInterface57_12111 = interface57;
	} else {
	    anInt12118 &= ~0x10;
	    anInterface57_12111 = null;
	    if (anInt12118 == 0) {
		anInt12113 = 0;
		anInt12114 = 0;
	    }
	}
	if (this == aClass185_Sub1_Sub2_12112.method3253(-461008781))
	    method18743();
	else
	    anInt12117 |= 0x10;
    }
    
    void method18747(int i) {
	Interface57 interface57 = anInterface57Array12119[i];
	if (interface57 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface57.method65(36064 + i);
    }
    
    void method18748(int i) {
	Interface57 interface57 = anInterface57Array12119[i];
	if (interface57 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36064 + i, 36161, 0);
	else
	    interface57.method65(36064 + i);
    }
    
    public void method15074(Interface21 interface21) {
	Interface57 interface57 = (Interface57) interface21;
	if (interface21 != null) {
	    if (anInt12118 != 0) {
		if (anInt12114 != interface57.method1()
		    || anInt12113 != interface57.method93())
		    throw new RuntimeException();
	    } else {
		anInt12113 = interface57.method93();
		anInt12114 = interface57.method1();
		method17909();
	    }
	    anInt12118 |= 0x10;
	    anInterface57_12111 = interface57;
	} else {
	    anInt12118 &= ~0x10;
	    anInterface57_12111 = null;
	    if (anInt12118 == 0) {
		anInt12113 = 0;
		anInt12114 = 0;
	    }
	}
	if (this == aClass185_Sub1_Sub2_12112.method3253(-217880845))
	    method18743();
	else
	    anInt12117 |= 0x10;
    }
    
    void method18749() {
	if (anInterface57_12111 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    anInterface57_12111.method65(36096);
    }
    
    void method18750() {
	if (anInterface57_12111 == null)
	    OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
	else
	    anInterface57_12111.method65(36096);
    }
}
