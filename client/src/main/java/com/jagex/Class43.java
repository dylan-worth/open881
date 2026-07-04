/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class43 implements Runnable
{
    InetAddress anInetAddress322;
    volatile String aString323;
    public static Class163 aClass163_324;
    
    public void method1069() {
	aString323 = anInetAddress322.getHostName();
    }
    
    Class43(int i) throws UnknownHostException {
	anInetAddress322
	    = InetAddress.getByAddress(new byte[] { (byte) (i >> 24 & 0xff),
						    (byte) (i >> 16 & 0xff),
						    (byte) (i >> 8 & 0xff),
						    (byte) (i & 0xff) });
    }
    
    public void run() {
	aString323 = anInetAddress322.getHostName();
    }
    
    public void method1070() {
	aString323 = anInetAddress322.getHostName();
    }
    
    public String method1071(byte i) {
	return aString323;
    }
    
    public String method1072() {
	return aString323;
    }
    
    static void method1073(int i, int i_0_, int i_1_) {
	if (Class620.aClass632_8113.aBool8236
	    || (1 != 324852453 * Class72.anInt765
		&& (!Class665.aBool8573 || Class72.anInt765 * 324852453 != 2
		    || !(Class331.aClass534_Sub18_Sub7_3496.aString11699.equals
			 (Class58.aClass58_636.method1245((Class539
							   .aClass672_7171),
							  (byte) -128)))))) {
	    Class16 class16 = Class160.method2620(1770101340);
	    int i_2_
		= (class16.method728
		   (Class58.aClass58_468.method1245(Class539.aClass672_7171,
						    (byte) -4),
		    505497010));
	    int i_3_;
	    if (!Class72.aBool766) {
		for (Class534_Sub18_Sub7 class534_sub18_sub7
			 = ((Class534_Sub18_Sub7)
			    Class72.aClass700_771.method14135((byte) -1));
		     null != class534_sub18_sub7;
		     class534_sub18_sub7
			 = ((Class534_Sub18_Sub7)
			    Class72.aClass700_771.method14139(600109664))) {
		    int i_4_ = Class281.method5236(class534_sub18_sub7,
						   class16, -318441750);
		    if (i_4_ > i_2_)
			i_2_ = i_4_;
		}
		i_2_ += 8;
		i_3_
		    = 324852453 * Class72.anInt765 * (-238165825
						      * Class72.anInt754) + 21;
		Class327_Sub1.anInt9991
		    = -441332209 * ((Class72.aBool784 ? 26 : 22)
				    + (Class72.anInt765 * 324852453
				       * (Class72.anInt754 * -238165825)));
	    } else {
		for (Class534_Sub18_Sub11 class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    Class72.aClass696_772.method14078(1221951837));
		     null != class534_sub18_sub11;
		     class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    Class72.aClass696_772.method14080((byte) 61))) {
		    int i_5_;
		    if (1 == class534_sub18_sub11.anInt11795 * -475442105)
			i_5_ = Class281.method5236(((Class534_Sub18_Sub7)
						    (class534_sub18_sub11
						     .aClass696_11794
						     .aClass534_Sub18_8785
						     .aClass534_Sub18_10510)),
						   class16, -809650789);
		    else
			i_5_ = Class583_Sub1.method16304(class534_sub18_sub11,
							 class16, 2088438307);
		    if (i_5_ > i_2_)
			i_2_ = i_5_;
		}
		i_2_ += 8;
		i_3_ = 21 + -238165825 * Class72.anInt754 * (Class72.anInt789
							     * 1965634793);
		Class327_Sub1.anInt9991
		    = -441332209 * ((-238165825 * Class72.anInt754
				     * (1965634793 * Class72.anInt789))
				    + (Class72.aBool784 ? 26 : 22));
	    }
	    i_2_ += 10;
	    int i_6_ = i - i_2_ / 2;
	    if (i_6_ + i_2_ > Class706_Sub4.anInt10994 * 1771907305)
		i_6_ = Class706_Sub4.anInt10994 * 1771907305 - i_2_;
	    if (i_6_ < 0)
		i_6_ = 0;
	    int i_7_ = i_0_;
	    if (i_7_ + i_3_ > -1091172141 * Class18.anInt205)
		i_7_ = Class18.anInt205 * -1091172141 - i_3_;
	    if (i_7_ < 0)
		i_7_ = 0;
	    Class627.anInt8175 = 358840571 * i_6_;
	    Class72.anInt782 = -1495881517 * i_7_;
	    Class641.anInt8340 = 1989742113 * i_2_;
	    Class72.anInt785 = (int) (Math.random() * 24.0) * -894020657;
	    Class72.aBool758 = true;
	}
    }
    
    static final void method1074(Class247 class247, Class669 class669, int i) {
	if (client.method17392(class247).method16272((short) 255)
	    && client.aClass247_11119 == null) {
	    Class536.method8908(class247.anInt2454 * -1278450723,
				1365669833 * class247.anInt2580, -1981600258);
	    client.aClass247_11119
		= Class81.method1637(class247.anInt2454 * -1278450723,
				     class247.anInt2580 * 1365669833,
				     606992618);
	    Class454.method7416(client.aClass247_11119, -2014665459);
	}
    }
    
    static final void method1075(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	class247.aBool2537
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) == 1;
	Class454.method7416(class247, -2037015173);
    }
}
