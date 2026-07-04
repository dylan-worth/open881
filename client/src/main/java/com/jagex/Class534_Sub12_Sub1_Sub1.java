/* Class534_Sub12_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class534_Sub12_Sub1_Sub1 extends Class534_Sub12_Sub1
{
    int[] anIntArray12106 = null;
    Class269_Sub1 aClass269_Sub1_12107;
    
    public boolean method18245(int i) {
	if (anIntArray12106 == null)
	    anIntArray12106
		= new int[aClass269_Sub1_12107.method4984((byte) 78)];
	Class278_Sub1 class278_sub1
	    = (Class278_Sub1) aClass269_Sub1_12107.method4916(i, 56453164);
	anIntArray12106[i]
	    = OpenGL.glGetUniformLocation(class278_sub1.anInt10047,
					  method18236((byte) 2));
	return anIntArray12106[i] != -1;
    }
    
    final int method18731() {
	return anIntArray12106[aClass269_Sub1_12107.method4921(-86607043)];
    }
    
    public boolean method18235(int i) {
	if (anIntArray12106 == null)
	    anIntArray12106
		= new int[aClass269_Sub1_12107.method4984((byte) 85)];
	Class278_Sub1 class278_sub1
	    = (Class278_Sub1) aClass269_Sub1_12107.method4916(i, 56453164);
	anIntArray12106[i]
	    = OpenGL.glGetUniformLocation(class278_sub1.anInt10047,
					  method18236((byte) 2));
	return anIntArray12106[i] != -1;
    }
    
    Class534_Sub12_Sub1_Sub1(Class269_Sub1 class269_sub1, Class266 class266) {
	super(class266);
	aClass269_Sub1_12107 = class269_sub1;
    }
    
    public final int method18240(int i) {
	return anIntArray12106[i];
    }
    
    public final int method18251(int i) {
	return anIntArray12106[i];
    }
    
    final int method18732() {
	return anIntArray12106[aClass269_Sub1_12107.method4921(-261217682)];
    }
}
