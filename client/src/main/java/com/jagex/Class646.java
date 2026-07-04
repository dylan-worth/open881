/* Class646 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

final class Class646 implements Interface74
{
    public void method496(int i, int i_0_, int i_1_) {
	int i_2_ = i >> 16;
	int i_3_ = i & 0xffff;
	synchronized (Class642.aQueue8347) {
	    Class642.aQueue8347.add(Class451_Sub1.method15923(i_2_, i_3_, i_0_,
							      i_1_,
							      957602694));
	}
    }
    
    public void method499(boolean bool, int i) {
	/* empty */
    }
    
    public void method494(int i, int i_4_, int i_5_, int i_6_) {
	int i_7_ = i >> 16;
	int i_8_ = i & 0xffff;
	synchronized (Class642.aQueue8347) {
	    Class642.aQueue8347.add(Class451_Sub1.method15923(i_7_, i_8_, i_4_,
							      i_5_,
							      1316408974));
	}
    }
    
    public void method495(int i, int i_9_, int i_10_) {
	int i_11_ = i >> 16;
	int i_12_ = i & 0xffff;
	synchronized (Class642.aQueue8347) {
	    Class642.aQueue8347.add(Class451_Sub1.method15923(i_11_, i_12_,
							      i_9_, i_10_,
							      1286051212));
	}
    }
    
    public void method497(boolean bool) {
	/* empty */
    }
    
    public void method498(boolean bool) {
	/* empty */
    }
    
    public void method493(boolean bool) {
	/* empty */
    }
    
    static final void method10688(Class669 class669, int i) {
	if (Class599.aClass298_Sub1_7871.method5425(944028451)
	    != Class293.aClass293_3124)
	    throw new RuntimeException();
	((Class706_Sub3) Class599.aClass298_Sub1_7871.method5381(1872505063))
	    .method17270
	    ((class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]),
	     -1078721498);
    }
    
    static final void method10689(Class669 class669, int i) {
	int i_13_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (i_13_ < 0 || i_13_ > 5 || 2 == i_13_)
	    i_13_ = 3;
	Class527.method8778(i_13_, false, -280695882);
    }
    
    public static void method10690(Class534_Sub40 class534_sub40, byte i) {
	byte[] is = new byte[24];
	try {
	    Class498.aClass38_5580.method947(0L);
	    Class498.aClass38_5580.method948(is, (byte) 47);
	    int i_14_;
	    for (i_14_ = 0; i_14_ < 24 && 0 == is[i_14_]; i_14_++) {
		/* empty */
	    }
	    if (i_14_ >= 24)
		throw new IOException();
	} catch (Exception exception) {
	    for (int i_15_ = 0; i_15_ < 24; i_15_++)
		is[i_15_] = (byte) -1;
	}
	class534_sub40.method16519(is, 0, 24, -2018466580);
    }
}
