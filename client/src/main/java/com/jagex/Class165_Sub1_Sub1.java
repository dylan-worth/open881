/* Class165_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class165_Sub1_Sub1 extends Class165_Sub1
{
    static int[] anIntArray11424 = new int[4];
    Class141_Sub1 aClass141_Sub1_11425;
    static int[] anIntArray11426 = new int[4];
    Class185_Sub3 aClass185_Sub3_11427;
    
    boolean method17960(Class141_Sub1 class141_sub1,
			Class141_Sub1 class141_sub1_0_, float f) {
	boolean bool = true;
	Class175_Sub1_Sub2 class175_sub1_sub2
	    = aClass185_Sub3_11427.aClass175_Sub1_Sub2_9710;
	aClass185_Sub3_11427.method3360(anIntArray11424);
	aClass185_Sub3_11427.method3537();
	aClass185_Sub3_11427.method3283(anIntArray11426);
	aClass185_Sub3_11427.method15203();
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glViewport(0, 0, aClass141_Sub1_11425.anInt8917,
			  aClass141_Sub1_11425.anInt8917);
	aClass185_Sub3_11427.method15344(false);
	aClass185_Sub3_11427.method15432(false);
	aClass185_Sub3_11427.method15242(false);
	aClass185_Sub3_11427.method15193(false);
	aClass185_Sub3_11427.method15227(-2);
	aClass185_Sub3_11427.method15230(1);
	aClass185_Sub3_11427.method15236(0.0F, 0.0F, 0.0F, f);
	aClass185_Sub3_11427.method15232(34165, 34165);
	aClass185_Sub3_11427.method15231(class141_sub1_0_);
	aClass185_Sub3_11427.method15230(0);
	aClass185_Sub3_11427.method15214(1);
	aClass185_Sub3_11427.method15231(class141_sub1);
	aClass185_Sub3_11427.method3260(class175_sub1_sub2, 815736521);
	for (int i = 0; i < 6; i++) {
	    int i_1_ = 34069 + i;
	    class175_sub1_sub2
		.method15075(0, aClass141_Sub1_11425.method14444(i_1_, 0));
	    class175_sub1_sub2.method17914(0);
	    if (class175_sub1_sub2.method15076()) {
		OpenGL.glBegin(7);
		switch (i_1_) {
		case 34073:
		    OpenGL.glTexCoord3i(-65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34072:
		    OpenGL.glTexCoord3i(-65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34069:
		    OpenGL.glTexCoord3i(65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34071:
		    OpenGL.glTexCoord3i(-65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34074:
		    OpenGL.glTexCoord3i(65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34070:
		    OpenGL.glTexCoord3i(-65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		}
		OpenGL.glEnd();
	    } else {
		bool = false;
		break;
	    }
	}
	class175_sub1_sub2.method15075(0, null);
	aClass185_Sub3_11427.method3261(class175_sub1_sub2, -11578496);
	aClass185_Sub3_11427.method15230(1);
	aClass185_Sub3_11427.method15231(null);
	aClass185_Sub3_11427.method15232(8448, 8448);
	aClass185_Sub3_11427.method15230(0);
	aClass185_Sub3_11427.method15231(null);
	aClass185_Sub3_11427.method3373(anIntArray11424[0], anIntArray11424[1],
					anIntArray11424[2],
					anIntArray11424[3]);
	aClass185_Sub3_11427.method3318(anIntArray11426[0], anIntArray11426[1],
					anIntArray11426[2],
					anIntArray11426[3]);
	if (bool && !aClass185_Sub3_11427.aBool9631)
	    aClass141_Sub1_11425.method2366();
	return bool;
    }
    
    int method17961() {
	return aClass141_Sub1_11425.anInt8917;
    }
    
    Class141_Sub1 method15068() {
	return aClass141_Sub1_11425;
    }
    
    boolean method17962(Class141_Sub1 class141_sub1,
			Class141_Sub1 class141_sub1_2_, float f) {
	boolean bool = true;
	Class175_Sub1_Sub2 class175_sub1_sub2
	    = aClass185_Sub3_11427.aClass175_Sub1_Sub2_9710;
	aClass185_Sub3_11427.method3360(anIntArray11424);
	aClass185_Sub3_11427.method3537();
	aClass185_Sub3_11427.method3283(anIntArray11426);
	aClass185_Sub3_11427.method15203();
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glViewport(0, 0, aClass141_Sub1_11425.anInt8917,
			  aClass141_Sub1_11425.anInt8917);
	aClass185_Sub3_11427.method15344(false);
	aClass185_Sub3_11427.method15432(false);
	aClass185_Sub3_11427.method15242(false);
	aClass185_Sub3_11427.method15193(false);
	aClass185_Sub3_11427.method15227(-2);
	aClass185_Sub3_11427.method15230(1);
	aClass185_Sub3_11427.method15236(0.0F, 0.0F, 0.0F, f);
	aClass185_Sub3_11427.method15232(34165, 34165);
	aClass185_Sub3_11427.method15231(class141_sub1_2_);
	aClass185_Sub3_11427.method15230(0);
	aClass185_Sub3_11427.method15214(1);
	aClass185_Sub3_11427.method15231(class141_sub1);
	aClass185_Sub3_11427.method3260(class175_sub1_sub2, -677895858);
	for (int i = 0; i < 6; i++) {
	    int i_3_ = 34069 + i;
	    class175_sub1_sub2
		.method15075(0, aClass141_Sub1_11425.method14444(i_3_, 0));
	    class175_sub1_sub2.method17914(0);
	    if (class175_sub1_sub2.method15076()) {
		OpenGL.glBegin(7);
		switch (i_3_) {
		case 34073:
		    OpenGL.glTexCoord3i(-65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34072:
		    OpenGL.glTexCoord3i(-65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34069:
		    OpenGL.glTexCoord3i(65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34071:
		    OpenGL.glTexCoord3i(-65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34074:
		    OpenGL.glTexCoord3i(65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34070:
		    OpenGL.glTexCoord3i(-65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		}
		OpenGL.glEnd();
	    } else {
		bool = false;
		break;
	    }
	}
	class175_sub1_sub2.method15075(0, null);
	aClass185_Sub3_11427.method3261(class175_sub1_sub2, -11578496);
	aClass185_Sub3_11427.method15230(1);
	aClass185_Sub3_11427.method15231(null);
	aClass185_Sub3_11427.method15232(8448, 8448);
	aClass185_Sub3_11427.method15230(0);
	aClass185_Sub3_11427.method15231(null);
	aClass185_Sub3_11427.method3373(anIntArray11424[0], anIntArray11424[1],
					anIntArray11424[2],
					anIntArray11424[3]);
	aClass185_Sub3_11427.method3318(anIntArray11426[0], anIntArray11426[1],
					anIntArray11426[2],
					anIntArray11426[3]);
	if (bool && !aClass185_Sub3_11427.aBool9631)
	    aClass141_Sub1_11425.method2366();
	return bool;
    }
    
    int method17963() {
	return aClass141_Sub1_11425.anInt8917;
    }
    
    Class165_Sub1_Sub1(Class185_Sub3 class185_sub3, int i) {
	aClass185_Sub3_11427 = class185_sub3;
	aClass141_Sub1_11425
	    = new Class141_Sub1(class185_sub3, Class181.aClass181_1952,
				Class173.aClass173_1830, i);
    }
    
    Class141_Sub1 method15071() {
	return aClass141_Sub1_11425;
    }
    
    Class141_Sub1 method15070() {
	return aClass141_Sub1_11425;
    }
    
    int method17964() {
	return aClass141_Sub1_11425.anInt8917;
    }
    
    int method17965() {
	return aClass141_Sub1_11425.anInt8917;
    }
    
    Class141_Sub1 method15069() {
	return aClass141_Sub1_11425;
    }
    
    int method17966() {
	return aClass141_Sub1_11425.anInt8917;
    }
    
    boolean method17967(Class141_Sub1 class141_sub1,
			Class141_Sub1 class141_sub1_4_, float f) {
	boolean bool = true;
	Class175_Sub1_Sub2 class175_sub1_sub2
	    = aClass185_Sub3_11427.aClass175_Sub1_Sub2_9710;
	aClass185_Sub3_11427.method3360(anIntArray11424);
	aClass185_Sub3_11427.method3537();
	aClass185_Sub3_11427.method3283(anIntArray11426);
	aClass185_Sub3_11427.method15203();
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glViewport(0, 0, aClass141_Sub1_11425.anInt8917,
			  aClass141_Sub1_11425.anInt8917);
	aClass185_Sub3_11427.method15344(false);
	aClass185_Sub3_11427.method15432(false);
	aClass185_Sub3_11427.method15242(false);
	aClass185_Sub3_11427.method15193(false);
	aClass185_Sub3_11427.method15227(-2);
	aClass185_Sub3_11427.method15230(1);
	aClass185_Sub3_11427.method15236(0.0F, 0.0F, 0.0F, f);
	aClass185_Sub3_11427.method15232(34165, 34165);
	aClass185_Sub3_11427.method15231(class141_sub1_4_);
	aClass185_Sub3_11427.method15230(0);
	aClass185_Sub3_11427.method15214(1);
	aClass185_Sub3_11427.method15231(class141_sub1);
	aClass185_Sub3_11427.method3260(class175_sub1_sub2, 553204617);
	for (int i = 0; i < 6; i++) {
	    int i_5_ = 34069 + i;
	    class175_sub1_sub2
		.method15075(0, aClass141_Sub1_11425.method14444(i_5_, 0));
	    class175_sub1_sub2.method17914(0);
	    if (class175_sub1_sub2.method15076()) {
		OpenGL.glBegin(7);
		switch (i_5_) {
		case 34073:
		    OpenGL.glTexCoord3i(-65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34072:
		    OpenGL.glTexCoord3i(-65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34069:
		    OpenGL.glTexCoord3i(65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34071:
		    OpenGL.glTexCoord3i(-65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34074:
		    OpenGL.glTexCoord3i(65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34070:
		    OpenGL.glTexCoord3i(-65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		}
		OpenGL.glEnd();
	    } else {
		bool = false;
		break;
	    }
	}
	class175_sub1_sub2.method15075(0, null);
	aClass185_Sub3_11427.method3261(class175_sub1_sub2, -11578496);
	aClass185_Sub3_11427.method15230(1);
	aClass185_Sub3_11427.method15231(null);
	aClass185_Sub3_11427.method15232(8448, 8448);
	aClass185_Sub3_11427.method15230(0);
	aClass185_Sub3_11427.method15231(null);
	aClass185_Sub3_11427.method3373(anIntArray11424[0], anIntArray11424[1],
					anIntArray11424[2],
					anIntArray11424[3]);
	aClass185_Sub3_11427.method3318(anIntArray11426[0], anIntArray11426[1],
					anIntArray11426[2],
					anIntArray11426[3]);
	if (bool && !aClass185_Sub3_11427.aBool9631)
	    aClass141_Sub1_11425.method2366();
	return bool;
    }
    
    boolean method17968(Class141_Sub1 class141_sub1,
			Class141_Sub1 class141_sub1_6_, float f) {
	boolean bool = true;
	Class175_Sub1_Sub2 class175_sub1_sub2
	    = aClass185_Sub3_11427.aClass175_Sub1_Sub2_9710;
	aClass185_Sub3_11427.method3360(anIntArray11424);
	aClass185_Sub3_11427.method3537();
	aClass185_Sub3_11427.method3283(anIntArray11426);
	aClass185_Sub3_11427.method15203();
	OpenGL.glMatrixMode(5889);
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	OpenGL.glMatrixMode(5888);
	OpenGL.glLoadIdentity();
	OpenGL.glViewport(0, 0, aClass141_Sub1_11425.anInt8917,
			  aClass141_Sub1_11425.anInt8917);
	aClass185_Sub3_11427.method15344(false);
	aClass185_Sub3_11427.method15432(false);
	aClass185_Sub3_11427.method15242(false);
	aClass185_Sub3_11427.method15193(false);
	aClass185_Sub3_11427.method15227(-2);
	aClass185_Sub3_11427.method15230(1);
	aClass185_Sub3_11427.method15236(0.0F, 0.0F, 0.0F, f);
	aClass185_Sub3_11427.method15232(34165, 34165);
	aClass185_Sub3_11427.method15231(class141_sub1_6_);
	aClass185_Sub3_11427.method15230(0);
	aClass185_Sub3_11427.method15214(1);
	aClass185_Sub3_11427.method15231(class141_sub1);
	aClass185_Sub3_11427.method3260(class175_sub1_sub2, 1320534452);
	for (int i = 0; i < 6; i++) {
	    int i_7_ = 34069 + i;
	    class175_sub1_sub2
		.method15075(0, aClass141_Sub1_11425.method14444(i_7_, 0));
	    class175_sub1_sub2.method17914(0);
	    if (class175_sub1_sub2.method15076()) {
		OpenGL.glBegin(7);
		switch (i_7_) {
		case 34073:
		    OpenGL.glTexCoord3i(-65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, 65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34072:
		    OpenGL.glTexCoord3i(-65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, -65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34069:
		    OpenGL.glTexCoord3i(65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34071:
		    OpenGL.glTexCoord3i(-65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, -65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65534, 65535, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34074:
		    OpenGL.glTexCoord3i(65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, 65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(65534, -65534, -65535);
		    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		case 34070:
		    OpenGL.glTexCoord3i(-65535, 65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
		    OpenGL.glVertex2f(0.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, 65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
		    OpenGL.glVertex2f(1.0F, 0.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, 65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
		    OpenGL.glVertex2f(1.0F, 1.0F);
		    OpenGL.glTexCoord3i(-65535, -65534, -65534);
		    OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
		    OpenGL.glVertex2f(0.0F, 1.0F);
		    break;
		}
		OpenGL.glEnd();
	    } else {
		bool = false;
		break;
	    }
	}
	class175_sub1_sub2.method15075(0, null);
	aClass185_Sub3_11427.method3261(class175_sub1_sub2, -11578496);
	aClass185_Sub3_11427.method15230(1);
	aClass185_Sub3_11427.method15231(null);
	aClass185_Sub3_11427.method15232(8448, 8448);
	aClass185_Sub3_11427.method15230(0);
	aClass185_Sub3_11427.method15231(null);
	aClass185_Sub3_11427.method3373(anIntArray11424[0], anIntArray11424[1],
					anIntArray11424[2],
					anIntArray11424[3]);
	aClass185_Sub3_11427.method3318(anIntArray11426[0], anIntArray11426[1],
					anIntArray11426[2],
					anIntArray11426[3]);
	if (bool && !aClass185_Sub3_11427.aBool9631)
	    aClass141_Sub1_11425.method2366();
	return bool;
    }
    
    Class141_Sub1 method15067() {
	return aClass141_Sub1_11425;
    }
}
