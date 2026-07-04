/* Class534_Sub18_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class534_Sub18_Sub13 extends Class534_Sub18
{
    public int anInt11802;
    
    Class534_Sub18_Sub13(int i) {
	anInt11802 = 736038943 * i;
    }
    
    public abstract void method18381(float f, byte i);
    
    public abstract void method18382(Class287 class287, Class446 class446,
				     Class433 class433, int i);
    
    public abstract void method18383(Class534_Sub40 class534_sub40, int i);
    
    public abstract void method18384(float f);
    
    public abstract void method18385(float f);
    
    public abstract void method18386(Class534_Sub40 class534_sub40);
    
    public abstract void method18387(Class534_Sub40 class534_sub40);
    
    public abstract void method18388(Class287 class287, Class446 class446,
				     Class433 class433);
    
    public abstract void method18389(Class534_Sub40 class534_sub40);
    
    public abstract void method18390(Class534_Sub40 class534_sub40);
    
    public static Class534_Sub18_Sub13 method18391
	(int i, Class271 class271, Class534_Sub40 class534_sub40) {
	if (Class271.aClass271_2962 == class271)
	    return new Class534_Sub18_Sub13_Sub2(i, class534_sub40);
	if (Class271.aClass271_2961 == class271)
	    return new Class534_Sub18_Sub13_Sub1(i, class534_sub40);
	return null;
    }
}
