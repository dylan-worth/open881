/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.net.Socket;

public class Class106
{
    static Class106 aClass106_1306 = new Class106(0);
    int anInt1307;
    static Class106 aClass106_1308;
    static Class106 aClass106_1309;
    static Class106 aClass106_1310 = new Class106(1);
    static String aString1311;
    public static int anInt1312;
    
    Class106(int i) {
	anInt1307 = i * 802664471;
    }
    
    static {
	aClass106_1308 = new Class106(2);
	aClass106_1309 = new Class106(3);
    }
    
    static final void method1943(long l) {
	try {
	    Thread.sleep(l);
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public static void method1944(int i) {
	Class247.aClass203_2552.method3877(1743936778);
	Class247.aClass203_2504.method3877(-1775594352);
	Class247.aClass203_2523.method3877(464158149);
	Class247.aClass203_2449.method3877(1748191726);
    }
    
    public static Class546 method1945(Socket socket, int i, byte i_0_)
	throws IOException {
	return new Class546_Sub1(socket, i);
    }
    
    static final void method1946(int i) {
	client.aBool11340 = false;
	if (Class674.anInt8633 * -878424575 != 3) {
	    Class438 class438
		= (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807()
		   .aClass438_4885);
	    Class468 class468 = client.aClass512_11100.method8552((byte) 0);
	    if (2 == -891094135 * Class10.anInt75
		|| 3 == Class10.anInt75 * -891094135
		|| 8737185 * Class93.anInt901 != -1) {
		Class597 class597
		    = client.aClass512_11100.method8416((byte) 58);
		int i_1_;
		int i_2_;
		if (-891094135 * Class10.anInt75 == 3) {
		    Class438 class438_3_
			= Class599.aClass298_Sub1_7871.method5381
			      (1517804454).method14248(1850454727);
		    if (Float.isNaN(class438_3_.aFloat4864))
			return;
		    i_1_ = ((int) class438_3_.aFloat4864
			    - (class597.anInt7859 * -424199969 << 9));
		    i_2_ = ((int) class438_3_.aFloat4865
			    - (class597.anInt7861 * -1166289421 << 9));
		    if (i_1_ < 0 || i_2_ < 0
			|| (i_1_ >> 9
			    >= (class468.aByteArrayArrayArray5145
				[-878424575 * Class674.anInt8633]).length)
			|| i_2_ >> 9 >= (class468.aByteArrayArrayArray5145
					 [Class674.anInt8633 * -878424575]
					 [i_1_ >> 9]).length)
			return;
		} else if (Class10.anInt75 * -891094135 == 2) {
		    i_1_ = (int) class438.aFloat4864;
		    i_2_ = (int) class438.aFloat4865;
		} else {
		    i_1_ = Class93.anInt901 * 8737185;
		    i_2_ = anInt1312 * 133182057;
		}
		if (0 != ((class468.aByteArrayArrayArray5145
			   [Class674.anInt8633 * -878424575][i_1_ >> 9]
			   [i_2_ >> 9])
			  & 0x4))
		    client.aBool11340 = true;
		else {
		    int i_4_;
		    int i_5_;
		    if (-891094135 * Class10.anInt75 == 3) {
			Class438 class438_6_
			    = Class599.aClass298_Sub1_7871.method5380
				  ((byte) -93).method6137(550877255);
			i_4_ = (((int) class438_6_.aFloat4864 >> 9)
				- -424199969 * class597.anInt7859);
			i_5_ = (((int) class438_6_.aFloat4865 >> 9)
				- -1166289421 * class597.anInt7861);
			if (i_4_ < 0 || i_5_ < 0
			    || (i_4_
				>= (class468.aByteArrayArrayArray5145
				    [Class674.anInt8633 * -878424575]).length)
			    || i_5_ >= (class468.aByteArrayArrayArray5145
					[Class674.anInt8633 * -878424575]
					[i_4_]).length)
			    return;
		    } else {
			i_4_ = -116109187 * Class200_Sub13.anInt9937 >> 9;
			i_5_ = Class636.anInt8305 * -1098179003 >> 9;
		    }
		    int i_7_ = i_1_ >> 9;
		    int i_8_ = i_2_ >> 9;
		    if (class468.method7608(i_4_, i_5_, -973347126)) {
			int i_9_
			    = Class247.method4595((-116109187
						   * Class200_Sub13.anInt9937),
						  (Class636.anInt8305
						   * -1098179003),
						  3, 583517138);
			if (1529694271 * Class677.anInt8654 >= i_9_)
			    client.aBool11340 = true;
		    } else {
		    while_39_:
			do {
			    if (-864938791 * Class566.anInt7589 < 2560) {
				int i_10_;
				if (i_7_ > i_4_)
				    i_10_ = i_7_ - i_4_;
				else
				    i_10_ = i_4_ - i_7_;
				int i_11_;
				if (i_8_ > i_5_)
				    i_11_ = i_8_ - i_5_;
				else
				    i_11_ = i_5_ - i_8_;
				if (0 == i_10_ && 0 == i_11_
				    || i_10_ <= -client.aClass512_11100
						     .method8417(966358317)
				    || i_10_ >= client.aClass512_11100
						    .method8417(711222585)
				    || i_11_ <= -client.aClass512_11100
						     .method8418(-1533611049)
				    || i_11_ >= client.aClass512_11100
						    .method8418(-1533611049)) {
				    if (Class10.anInt75 * -891094135 != 3)
					Class262.method4824
					    (new StringBuilder().append
						 (i_4_).append
						 (Class29.aString260).append
						 (i_5_).append
						 (" ").append
						 (i_7_).append
						 (Class29.aString260).append
						 (i_8_).append
						 (" ").append
						 (class597.anInt7859
						  * -424199969)
						 .append
						 (Class29.aString260).append
						 (-1166289421
						  * class597.anInt7861)
						 .toString(),
					     new RuntimeException(), (byte) 8);
				    break;
				}
				if (i_10_ > i_11_) {
				    int i_12_ = 65536 * i_11_ / i_10_;
				    int i_13_ = 32768;
				while_38_:
				    do {
					for (;;) {
					    if (i_7_ == i_4_)
						break while_38_;
					    if (i_4_ < i_7_)
						i_4_++;
					    else if (i_4_ > i_7_)
						i_4_--;
					    if (((class468
						  .aByteArrayArrayArray5145
						  [(-878424575
						    * Class674.anInt8633)]
						  [i_4_][i_5_])
						 & 0x4)
						!= 0) {
						client.aBool11340 = true;
						return;
					    }
					    if ((i_5_ + 1
						 < (class468
						    .aByteArrayArrayArray5145
						    [(Class674.anInt8633
						      * -878424575)]
						    [i_4_]).length)
						&& (0
						    != ((class468
							 .aByteArrayArrayArray5145
							 [(-878424575
							   * (Class674
							      .anInt8633))]
							 [i_4_][1 + i_5_])
							& 0x4))) {
						client.aBool11340 = true;
						return;
					    }
					    if (i_5_ > 0
						&& (0
						    != ((class468
							 .aByteArrayArrayArray5145
							 [(-878424575
							   * (Class674
							      .anInt8633))]
							 [i_4_][i_5_ - 1])
							& 0x4))) {
						client.aBool11340 = true;
						return;
					    }
					    i_13_ += i_12_;
					    if (i_13_ >= 65536) {
						i_13_ -= 65536;
						if (i_5_ < i_8_) {
						    if ((++i_5_ + 1
							 < (class468
							    .aByteArrayArrayArray5145
							    [((Class674
							       .anInt8633)
							      * -878424575)]
							    [i_4_]).length)
							&& ((class468
							     .aByteArrayArrayArray5145
							     [((Class674
								.anInt8633)
							       * -878424575)]
							     [i_4_][i_5_ + 1])
							    & 0x4) != 0) {
							client.aBool11340
							    = true;
							return;
						    }
						} else if (i_5_ > i_8_
							   && --i_5_ > 0
							   && ((class468
								.aByteArrayArrayArray5145
								[(-878424575
								  * (Class674
								     .anInt8633))]
								[i_4_]
								[i_5_ - 1])
							       & 0x4) != 0)
						    break;
					    }
					}
					client.aBool11340 = true;
					return;
				    } while (false);
				} else {
				    int i_14_ = 65536 * i_10_ / i_11_;
				    int i_15_ = 32768;
				    for (;;) {
					if (i_8_ == i_5_)
					    break while_39_;
					if (i_5_ < i_8_)
					    i_5_++;
					else if (i_5_ > i_8_)
					    i_5_--;
					if (0 != ((class468
						   .aByteArrayArrayArray5145
						   [(Class674.anInt8633
						     * -878424575)]
						   [i_4_][i_5_])
						  & 0x4)) {
					    client.aBool11340 = true;
					    return;
					}
					if ((i_4_ + 1
					     < (class468
						.aByteArrayArrayArray5145
						[(-878424575
						  * (Class674
						     .anInt8633))]).length)
					    && 0 != ((class468
						      .aByteArrayArrayArray5145
						      [(-878424575
							* Class674.anInt8633)]
						      [i_4_ + 1][i_5_])
						     & 0x4)) {
					    client.aBool11340 = true;
					    return;
					}
					if (i_4_ > 0
					    && 0 != ((class468
						      .aByteArrayArrayArray5145
						      [(Class674.anInt8633
							* -878424575)]
						      [i_4_ - 1][i_5_])
						     & 0x4)) {
					    client.aBool11340 = true;
					    return;
					}
					i_15_ += i_14_;
					if (i_15_ >= 65536) {
					    i_15_ -= 65536;
					    if (i_4_ < i_7_) {
						i_4_++;
						if ((1 + i_4_
						     < (class468
							.aByteArrayArrayArray5145
							[(Class674.anInt8633
							  * -878424575)]).length)
						    && ((class468
							 .aByteArrayArrayArray5145
							 [(-878424575
							   * (Class674
							      .anInt8633))]
							 [1 + i_4_][i_5_])
							& 0x4) != 0) {
						    client.aBool11340 = true;
						    return;
						}
					    } else if (i_4_ > i_7_
						       && --i_4_ > 0
						       && (0
							   != ((class468
								.aByteArrayArrayArray5145
								[(-878424575
								  * (Class674
								     .anInt8633))]
								[i_4_ - 1]
								[i_5_])
							       & 0x4)))
						break;
					}
				    }
				    client.aBool11340 = true;
				    break;
				}
			    }
			} while (false);
		    }
		}
	    } else {
		int i_16_
		    = Class247.method4595((-116109187
					   * Class200_Sub13.anInt9937),
					  -1098179003 * Class636.anInt8305,
					  Class674.anInt8633 * -878424575,
					  558821757);
		if (i_16_ - 1529694271 * Class677.anInt8654 < 3200
		    && ((class468.aByteArrayArrayArray5145
			 [Class674.anInt8633 * -878424575]
			 [-116109187 * Class200_Sub13.anInt9937 >> 9]
			 [-1098179003 * Class636.anInt8305 >> 9])
			& 0x4) != 0)
		    client.aBool11340 = true;
	    }
	}
    }
    
    static final void method1947(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_17_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_18_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass219_11338.method4120(i_17_, (byte) 12)
		  .method4371(i_18_, 415593905);
    }
    
    static final void method1948(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = ((Class654_Sub1) class669.anInterface62_8603)
		  .method16897(-1527522767);
    }
    
    public static boolean method1949(char c, byte i) {
	return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
}
