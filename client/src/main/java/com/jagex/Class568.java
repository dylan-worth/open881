/* Class568 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Class568
{
    short aShort7596;
    public Class654_Sub1_Sub1 aClass654_Sub1_Sub1_7597;
    public Class654_Sub1_Sub1 aClass654_Sub1_Sub1_7598;
    public byte aByte7599;
    public Class654_Sub1_Sub3 aClass654_Sub1_Sub3_7600;
    public Class654_Sub1_Sub3 aClass654_Sub1_Sub3_7601;
    Class654_Sub1_Sub4 aClass654_Sub1_Sub4_7602;
    short aShort7603;
    public Class559 aClass559_7604;
    public Class568 aClass568_7605;
    short aShort7606;
    public Class654_Sub1_Sub2 aClass654_Sub1_Sub2_7607;
    short aShort7608;
    
    public Class568(int i) {
	aByte7599 = (byte) i;
    }
    
    public static int method9568(int i) {
	return Class523.aTwitchTV7088.GetLoginState();
    }
    
    static final void method9569(Class247 class247, int i, int i_0_,
				 Class669 class669, int i_1_) {
	if (null == class247.anIntArray2546) {
	    if (i_0_ > 0) {
		class247.aByteArrayArray2585 = new byte[11][];
		class247.aByteArrayArray2543 = new byte[11][];
		class247.anIntArray2544 = new int[11];
		class247.anIntArray2545 = new int[11];
		class247.anIntArray2546 = new int[11];
	    } else
		return;
	}
	class247.anIntArray2546[i] = i_0_;
	if (i_0_ > 0)
	    class247.aBool2541 = true;
	else {
	    class247.aBool2541 = false;
	    for (int i_2_ = 0; i_2_ < class247.aByteArrayArray2585.length;
		 i_2_++) {
		if (null != class247.aByteArrayArray2585[i_2_]
		    || class247.anIntArray2546[i_2_] > 0) {
		    class247.aBool2541 = true;
		    break;
		}
	    }
	}
    }
    
    static final void method9570(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2481 * -166726847;
    }
    
    static final void method9571(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class669.aClass352_8602.method6230(((String)
						  (class669.anObjectArray8593
						   [((class669.anInt8594
						      -= 1460193483)
						     * 1485266147)])),
						 (short) 8886);
    }
    
    static final void method9572(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		  .method17028(-760673419) ? 1 : 0;
    }
    
    static void method9573(File file, byte[] is, int i, int i_3_)
	throws IOException {
	DataInputStream datainputstream
	    = (new DataInputStream
	       (new BufferedInputStream(new FileInputStream(file))));
	try {
	    datainputstream.readFully(is, 0, i);
	} catch (EOFException eofexception) {
	    /* empty */
	}
	datainputstream.close();
    }
    
    public static void method9574(int i) {
	Class24 class24
	    = Class606.method10050("2", client.aClass675_11016.aString8640,
				   true, 2123732462);
	Class77.aClass155_Sub1_819.method15462(class24, 1214323047);
    }
}
