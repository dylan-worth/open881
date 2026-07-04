/* Class534_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class534_Sub12_Sub1 extends Class534_Sub12
{
    String aString11744;
    String aString11745;
    Class264 aClass264_11746;
    int anInt11747;
    Class264 aClass264_11748;
    
    public Class264 method18234() {
	return aClass264_11748;
    }
    
    public abstract boolean method18235(int i);
    
    public String toString() {
	String string
	    = new StringBuilder().append(aClass264_11748.toString()).append
		  (" ").append
		  (aString11745).toString();
	if (null != aString11744 && !"".equals(aString11744))
	    string = new StringBuilder().append(string).append(" : ").append
			 (aString11744).toString();
	return string;
    }
    
    String method18236(byte i) {
	return aString11745;
    }
    
    public Class264 method18237(int i) {
	return aClass264_11748;
    }
    
    String method18238() {
	return aString11745;
    }
    
    public Class264 method18239() {
	return aClass264_11746;
    }
    
    public abstract int method18240(int i);
    
    public int method18241(int i) {
	if (aClass264_11748 != Class264.aClass264_2806)
	    throw new IllegalArgumentException_Sub1(this,
						    aClass264_11748.toString
							().toLowerCase());
	return -2082238865 * anInt11747;
    }
    
    public String method18242() {
	String string
	    = new StringBuilder().append(aClass264_11748.toString()).append
		  (" ").append
		  (aString11745).toString();
	if (null != aString11744 && !"".equals(aString11744))
	    string = new StringBuilder().append(string).append(" : ").append
			 (aString11744).toString();
	return string;
    }
    
    public String method18243() {
	String string
	    = new StringBuilder().append(aClass264_11748.toString()).append
		  (" ").append
		  (aString11745).toString();
	if (null != aString11744 && !"".equals(aString11744))
	    string = new StringBuilder().append(string).append(" : ").append
			 (aString11744).toString();
	return string;
    }
    
    String method18244() {
	return aString11745;
    }
    
    Class534_Sub12_Sub1(Class266 class266) {
	aClass264_11748 = class266.aClass264_2937;
	aString11745 = class266.aString2939;
	aString11744 = class266.aString2933;
	anInt11747 = -392650771 * class266.anInt2935;
	aClass264_11746 = class266.aClass264_2934;
    }
    
    public abstract boolean method18245(int i);
    
    public Class264 method18246() {
	return aClass264_11746;
    }
    
    public Class264 method18247(int i) {
	return aClass264_11746;
    }
    
    public int method18248() {
	if (aClass264_11748 != Class264.aClass264_2806)
	    throw new IllegalArgumentException_Sub1(this,
						    aClass264_11748.toString
							().toLowerCase());
	return -2082238865 * anInt11747;
    }
    
    public int method18249() {
	if (aClass264_11748 != Class264.aClass264_2806)
	    throw new IllegalArgumentException_Sub1(this,
						    aClass264_11748.toString
							().toLowerCase());
	return -2082238865 * anInt11747;
    }
    
    public int method18250() {
	if (aClass264_11748 != Class264.aClass264_2806)
	    throw new IllegalArgumentException_Sub1(this,
						    aClass264_11748.toString
							().toLowerCase());
	return -2082238865 * anInt11747;
    }
    
    public abstract int method18251(int i);
    
    static final void method18252(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, 105324268);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_0_ >> 16];
	Class186.method3705(class247, class243, class669, -663647264);
    }
}
