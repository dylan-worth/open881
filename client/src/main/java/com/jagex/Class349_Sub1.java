/* Class349_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class349_Sub1 extends Class349
{
    Class185_Sub1_Sub1 aClass185_Sub1_Sub1_10130;
    long aLong10131 = 0L;
    
    void method15735() {
	method15740();
    }
    
    void method15736(ByteBuffer bytebuffer, short i, short i_0_, byte i_1_,
		     byte i_2_, byte i_3_, byte i_4_) {
	bytebuffer.putShort(i);
	bytebuffer.putShort(i_0_);
	bytebuffer.put(i_1_);
	bytebuffer.put(i_2_);
	bytebuffer.put(i_3_);
	bytebuffer.put(i_4_);
    }
    
    public void method142() {
	if (aLong10131 != 0L) {
	    IUnknown.Release(aLong10131);
	    aLong10131 = 0L;
	}
	aClass185_Sub1_Sub1_10130.method14582(this);
    }
    
    Class349_Sub1(Class185_Sub1_Sub1 class185_sub1_sub1,
		  Class381[] class381s) {
	super(class381s);
	aClass185_Sub1_Sub1_10130 = class185_sub1_sub1;
	byte i = 0;
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_10130.aByteBuffer9266;
	bytebuffer.clear();
	for (short i_5_ = 0; i_5_ < aClass381Array3592.length; i_5_++) {
	    short i_6_ = 0;
	    Class381 class381 = aClass381Array3592[i_5_];
	    for (int i_7_ = 0; i_7_ < class381.method6434(); i_7_++) {
		Class350 class350 = class381.method6441(i_7_);
		if (class350 == Class350.aClass350_3610)
		    method15736(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0,
				(byte) 0, (byte) 0);
		else if (class350 == Class350.aClass350_3594)
		    method15736(bytebuffer, i_5_, i_6_, (byte) 2, (byte) 0,
				(byte) 3, (byte) 0);
		else if (class350 == Class350.aClass350_3595)
		    method15736(bytebuffer, i_5_, i_6_, (byte) 4, (byte) 0,
				(byte) 10, (byte) 0);
		else if (class350 == Class350.aClass350_3596) {
		    Class349_Sub1 class349_sub1_8_ = this;
		    ByteBuffer bytebuffer_9_ = bytebuffer;
		    short i_10_ = i_5_;
		    short i_11_ = i_6_;
		    byte i_12_ = 0;
		    byte i_13_ = 0;
		    byte i_14_ = 5;
		    byte i_15_ = i;
		    i++;
		    class349_sub1_8_.method15736(bytebuffer_9_, i_10_, i_11_,
						 i_12_, i_13_, i_14_, i_15_);
		} else if (class350 == Class350.aClass350_3597) {
		    Class349_Sub1 class349_sub1_16_ = this;
		    ByteBuffer bytebuffer_17_ = bytebuffer;
		    short i_18_ = i_5_;
		    short i_19_ = i_6_;
		    byte i_20_ = 1;
		    byte i_21_ = 0;
		    byte i_22_ = 5;
		    byte i_23_ = i;
		    i++;
		    class349_sub1_16_.method15736(bytebuffer_17_, i_18_, i_19_,
						  i_20_, i_21_, i_22_, i_23_);
		} else if (class350 == Class350.aClass350_3604) {
		    Class349_Sub1 class349_sub1_24_ = this;
		    ByteBuffer bytebuffer_25_ = bytebuffer;
		    short i_26_ = i_5_;
		    short i_27_ = i_6_;
		    byte i_28_ = 2;
		    byte i_29_ = 0;
		    byte i_30_ = 5;
		    byte i_31_ = i;
		    i++;
		    class349_sub1_24_.method15736(bytebuffer_25_, i_26_, i_27_,
						  i_28_, i_29_, i_30_, i_31_);
		} else if (class350 == Class350.aClass350_3599) {
		    Class349_Sub1 class349_sub1_32_ = this;
		    ByteBuffer bytebuffer_33_ = bytebuffer;
		    short i_34_ = i_5_;
		    short i_35_ = i_6_;
		    byte i_36_ = 3;
		    byte i_37_ = 0;
		    byte i_38_ = 5;
		    byte i_39_ = i;
		    i++;
		    class349_sub1_32_.method15736(bytebuffer_33_, i_34_, i_35_,
						  i_36_, i_37_, i_38_, i_39_);
		}
		i_6_ += class350.anInt3608;
	    }
	}
	method15736(bytebuffer, (short) 255, (short) 0, (byte) 17, (byte) 0,
		    (byte) 0, (byte) 0);
	aLong10131 = (IDirect3DDevice.CreateVertexDeclaration
		      (aClass185_Sub1_Sub1_10130.aLong11541,
		       aClass185_Sub1_Sub1_10130.aLong9139));
	aClass185_Sub1_Sub1_10130.method14617(this);
    }
    
    public void method143() {
	if (aLong10131 != 0L) {
	    IUnknown.Release(aLong10131);
	    aLong10131 = 0L;
	}
	aClass185_Sub1_Sub1_10130.method14582(this);
    }
    
    void method15737(ByteBuffer bytebuffer, short i, short i_40_, byte i_41_,
		     byte i_42_, byte i_43_, byte i_44_) {
	bytebuffer.putShort(i);
	bytebuffer.putShort(i_40_);
	bytebuffer.put(i_41_);
	bytebuffer.put(i_42_);
	bytebuffer.put(i_43_);
	bytebuffer.put(i_44_);
    }
    
    public void finalize() {
	method15740();
    }
    
    public void method144() {
	if (aLong10131 != 0L) {
	    IUnknown.Release(aLong10131);
	    aLong10131 = 0L;
	}
	aClass185_Sub1_Sub1_10130.method14582(this);
    }
    
    void method15738() {
	method15740();
    }
    
    void method15739() {
	method15740();
    }
    
    public void method141() {
	if (aLong10131 != 0L) {
	    IUnknown.Release(aLong10131);
	    aLong10131 = 0L;
	}
	aClass185_Sub1_Sub1_10130.method14582(this);
    }
    
    void method15740() {
	if (aLong10131 != 0L) {
	    aClass185_Sub1_Sub1_10130.method18018(aLong10131);
	    aLong10131 = 0L;
	}
    }
    
    void method15741() {
	if (aLong10131 != 0L) {
	    aClass185_Sub1_Sub1_10130.method18018(aLong10131);
	    aLong10131 = 0L;
	}
    }
    
    void method15742() {
	if (aLong10131 != 0L) {
	    aClass185_Sub1_Sub1_10130.method18018(aLong10131);
	    aLong10131 = 0L;
	}
    }
    
    void method15743() {
	if (aLong10131 != 0L) {
	    aClass185_Sub1_Sub1_10130.method18018(aLong10131);
	    aLong10131 = 0L;
	}
    }
}
