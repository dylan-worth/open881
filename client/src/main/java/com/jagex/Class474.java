/* Class474 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Class474
{
    byte[] aByteArray5175;
    Class464 this$0;
    
    byte[] method7757() {
	return aByteArray5175;
    }
    
    byte[] method7758(int i) {
	return aByteArray5175;
    }
    
    Class474(Class464 class464, InputStream inputstream,
	     Class534_Sub18_Sub18_Sub1 class534_sub18_sub18_sub1, URL url) {
	this$0 = class464;
	aByteArray5175 = null;
	if (inputstream != null) {
	    int i = 10240;
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(i, true);
	    int i_0_ = 0;
	    byte[] is = Class691.method14036(1024, -1385047722);
	    while (i_0_ >= 0) {
		try {
		    i_0_ = inputstream.read(is);
		} catch (IOException ioexception) {
		    ioexception.printStackTrace();
		    i_0_ = -1;
		}
		if (i_0_ > 0) {
		    if (class534_sub40.anInt10811 * 31645619 + i_0_
			>= class534_sub40.aByteArray10810.length) {
			int i_1_
			    = 10240 + class534_sub40.aByteArray10810.length;
			byte[] is_2_
			    = Class691.method14034(i_1_, true, 2140011147);
			System.arraycopy(class534_sub40.aByteArray10810, 0,
					 is_2_, 0,
					 class534_sub40.anInt10811 * 31645619);
			Class691.method14033(class534_sub40.aByteArray10810,
					     (short) -21011);
			class534_sub40.aByteArray10810 = is_2_;
		    }
		    class534_sub40.method16519(is, 0, i_0_, -393400816);
		}
	    }
	    for (int i_3_ = 0;
		 i_3_ < 644217069 * class534_sub18_sub18_sub1.anInt12130;
		 i_3_++)
		class534_sub40.method16506(0, 1225075861);
	    byte[] is_4_ = new byte[31645619 * class534_sub40.anInt10811];
	    System.arraycopy(class534_sub40.aByteArray10810, 0, is_4_, 0,
			     31645619 * class534_sub40.anInt10811);
	    class534_sub40.method16538((byte) 106);
	    Object object = null;
	    Class691.method14033(is, (short) -6426);
	    Object object_5_ = null;
	    aByteArray5175 = is_4_;
	    try {
		inputstream.close();
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	}
	class534_sub18_sub18_sub1.aBool11888 = false;
	class464.method7548((byte) 1);
    }
    
    byte[] method7759() {
	return aByteArray5175;
    }
    
    static final void method7760(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aBool11028 ? 1 : 0;
    }
    
    static final void method7761(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_6_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_7_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	Class247 class247 = Class81.method1637(i_6_, i_7_, 1176172265);
	Exception_Sub3.method17943((byte) 1);
	Class534_Sub25 class534_sub25 = client.method17392(class247);
	Class208.method3945(class247, class534_sub25.method16271((byte) 79),
			    class534_sub25.anInt10575 * -1799641075,
			    -1719108884);
    }
    
    public static int method7762(int i, int i_8_) {
	return i >>> 8;
    }
    
    static final void method7763(Class247 class247, Class669 class669, int i) {
	int i_9_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	int i_10_ = ((class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307])
		     - 1);
	if (2 != class247.anInt2496 * -1866862435)
	    throw new RuntimeException("");
	Class307 class307
	    = ((Class307)
	       Class578.aClass44_Sub3_7743
		   .method91(class247.anInt2497 * 939166901, 1312831511));
	if (null == class247.aClass301_2635)
	    class247.aClass301_2635 = new Class301(class307, false);
	class247.aClass301_2635.aLong3238
	    = Class215.method4107(-148424092) * 8855449811293583851L;
	if (i_10_ < 0 || i_10_ >= class307.anIntArray3283.length)
	    throw new RuntimeException("");
	class247.aClass301_2635.anIntArray3233[i_10_] = i_9_;
	Class454.method7416(class247, -641405646);
    }
}
