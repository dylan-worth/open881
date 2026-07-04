/* Class544 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class544
{
    static final int anInt7189 = 4096;
    static byte[] aByteArray7190 = new byte[2048];
    Class537[] aClass537Array7191;
    Class332[] aClass332Array7192;
    
    static {
	int i = 22;
	int i_0_ = 2;
	aByteArray7190[0] = (byte) 0;
	aByteArray7190[1] = (byte) 1;
	for (int i_1_ = 2; i_1_ < i; i_1_++) {
	    int i_2_ = 1 << (i_1_ >> 1) - 1;
	    int i_3_ = 0;
	    while (i_3_ < i_2_) {
		aByteArray7190[i_0_] = (byte) i_1_;
		i_3_++;
		i_0_++;
	    }
	}
    }
    
    Class544() {
	Class275.method5147((byte) 3);
	aClass537Array7191 = new Class537[4096];
	new Class325();
	aClass332Array7192 = new Class332[4];
	new Class332(4);
	new Class539_Sub1(this);
	new Class539_Sub1(this);
	new Class521(this);
	for (int i = 0; i < 4096; i++)
	    aClass537Array7191[i] = new Class537(this);
	for (int i = 0; i < 4; i++)
	    aClass332Array7192[i] = new Class332(6);
    }
    
    static final void method8962(int i, int i_4_, int i_5_, int i_6_, int i_7_,
				 int i_8_, int i_9_) {
	for (Class536_Sub6 class536_sub6
		 = ((Class536_Sub6)
		    client.aClass709_11212.method14301(764908544));
	     class536_sub6 != null;
	     class536_sub6 = (Class536_Sub6) client.aClass709_11212
						 .method14282(-1313291077)) {
	    if (client.anInt11101 >= class536_sub6.anInt10371 * 1004685289)
		class536_sub6.method8900(984996359);
	    else {
		Class159.method2612(class536_sub6.anInt10370 * -1138498011,
				    256 + (767377511 * class536_sub6.anInt10369
					   << 9),
				    256 + (81079743 * class536_sub6.anInt10373
					   << 9),
				    0, -1833865366 * class536_sub6.anInt10372,
				    false, false, 762441224);
		Class231.aClass171_2325.method2830
		    (class536_sub6.aString10375,
		     (int) ((float) i + client.aFloatArray11167[0]),
		     (int) ((float) i_4_ + client.aFloatArray11167[1]),
		     ~0xffffff | class536_sub6.anInt10374 * 1294543369, 0,
		     65535);
	    }
	}
    }
}
