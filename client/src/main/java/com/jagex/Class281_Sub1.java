/* Class281_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class281_Sub1 extends Class281
{
    public Class method61() {
	return com.jagex.Class272.class;
    }
    
    public Interface13 method63(int i, Interface14 interface14) {
	return new Class272(i, interface14, this);
    }
    
    public Interface13 method60(int i, Interface14 interface14) {
	return new Class272(i, interface14, this);
    }
    
    public Interface13 method64(int i, Interface14 interface14) {
	return new Class272(i, interface14, this);
    }
    
    public Interface13 method58(int i, Interface14 interface14, byte i_0_) {
	return new Class272(i, interface14, this);
    }
    
    public Interface13 method62(int i, Interface14 interface14) {
	return new Class272(i, interface14, this);
    }
    
    Class281_Sub1(Class472 class472, int i) {
	super(class472, i);
    }
    
    public Class method59(short i) {
	return com.jagex.Class272.class;
    }
    
    static final void method15655(Class669 class669, byte i) {
	class669.anInt8600 -= 308999563;
    }
    
    public static void method15656(int[] is, Object[] objects, byte i) {
	Class160.method2617(is, objects, 0, is.length - 1, -1853500987);
    }
    
    static final void method15657(int i, int i_1_, int i_2_, int i_3_,
				  Class596 class596, int i_4_) {
	if (i_2_ >= 1 && i_3_ >= 1
	    && i_2_ <= client.aClass512_11100.method8417(1566680457) - 2
	    && i_3_ <= client.aClass512_11100.method8418(-1533611049) - 2) {
	    if (client.aClass512_11100.method8424((byte) 103) != null) {
		Interface62 interface62
		    = client.aClass512_11100.method8493(90486492)
			  .method15946(i, i_1_, i_2_, i_3_, (byte) 2);
		if (null != interface62) {
		    if (interface62 instanceof Class654_Sub1_Sub5_Sub3)
			((Class654_Sub1_Sub5_Sub3) interface62)
			    .method18647(class596, (byte) 22);
		    else if (interface62 instanceof Class654_Sub1_Sub2_Sub2)
			((Class654_Sub1_Sub2_Sub2) interface62)
			    .method18665(class596, -1960530827);
		    else if (interface62 instanceof Class654_Sub1_Sub1_Sub2)
			((Class654_Sub1_Sub1_Sub2) interface62)
			    .method18632(class596, (byte) 42);
		    else if (interface62 instanceof Class654_Sub1_Sub3_Sub2)
			((Class654_Sub1_Sub3_Sub2) interface62)
			    .method18644(class596, (byte) 0);
		}
	    }
	}
    }
}
