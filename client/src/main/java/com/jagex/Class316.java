/* Class316 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Rectangle;
import java.io.IOException;

public class Class316
{
    short[] aShortArray3380;
    int anInt3381;
    
    public int method5707(Class317 class317, int i) throws IOException {
	int i_0_ = 1;
	for (int i_1_ = anInt3381 * -1203237219; i_1_ != 0; i_1_--)
	    i_0_ = (i_0_ << 1) + class317.method5740(aShortArray3380, i_0_,
						     61180739);
	return i_0_ - (1 << anInt3381 * -1203237219);
    }
    
    public void method5708(int i) {
	Class329.method5834(aShortArray3380, 1082791348);
    }
    
    public int method5709(Class317 class317) throws IOException {
	int i = 1;
	for (int i_2_ = anInt3381 * -1203237219; i_2_ != 0; i_2_--)
	    i = (i << 1) + class317.method5740(aShortArray3380, i, 2016712411);
	return i - (1 << anInt3381 * -1203237219);
    }
    
    public int method5710(Class317 class317) throws IOException {
	int i = 1;
	for (int i_3_ = anInt3381 * -1203237219; i_3_ != 0; i_3_--)
	    i = (i << 1) + class317.method5740(aShortArray3380, i,
					       -1627635584);
	return i - (1 << anInt3381 * -1203237219);
    }
    
    public void method5711() {
	Class329.method5834(aShortArray3380, -1021126337);
    }
    
    public int method5712(Class317 class317, byte i) throws IOException {
	int i_4_ = 1;
	int i_5_ = 0;
	for (int i_6_ = 0; i_6_ < -1203237219 * anInt3381; i_6_++) {
	    int i_7_ = class317.method5740(aShortArray3380, i_4_, -300110468);
	    i_4_ <<= 1;
	    i_4_ += i_7_;
	    i_5_ |= i_7_ << i_6_;
	}
	return i_5_;
    }
    
    public void method5713() {
	Class329.method5834(aShortArray3380, -300935644);
    }
    
    public static int method5714
	(short[] is, int i, Class317 class317, int i_8_) throws IOException {
	int i_9_ = 1;
	int i_10_ = 0;
	for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
	    int i_12_ = class317.method5740(is, i_9_ + i, -1553051679);
	    i_9_ <<= 1;
	    i_9_ += i_12_;
	    i_10_ |= i_12_ << i_11_;
	}
	return i_10_;
    }
    
    public Class316(int i) {
	anInt3381 = i * -1443436619;
	aShortArray3380 = new short[1 << i];
    }
    
    public int method5715(Class317 class317) throws IOException {
	int i = 1;
	int i_13_ = 0;
	for (int i_14_ = 0; i_14_ < -1203237219 * anInt3381; i_14_++) {
	    int i_15_ = class317.method5740(aShortArray3380, i, 1073172294);
	    i <<= 1;
	    i += i_15_;
	    i_13_ |= i_15_ << i_14_;
	}
	return i_13_;
    }
    
    public static int method5716
	(short[] is, int i, Class317 class317, int i_16_) throws IOException {
	int i_17_ = 1;
	int i_18_ = 0;
	for (int i_19_ = 0; i_19_ < i_16_; i_19_++) {
	    int i_20_ = class317.method5740(is, i_17_ + i, 1306503721);
	    i_17_ <<= 1;
	    i_17_ += i_20_;
	    i_18_ |= i_20_ << i_19_;
	}
	return i_18_;
    }
    
    public static int method5717
	(short[] is, int i, Class317 class317, int i_21_) throws IOException {
	int i_22_ = 1;
	int i_23_ = 0;
	for (int i_24_ = 0; i_24_ < i_21_; i_24_++) {
	    int i_25_ = class317.method5740(is, i_22_ + i, 1731248206);
	    i_22_ <<= 1;
	    i_22_ += i_25_;
	    i_23_ |= i_25_ << i_24_;
	}
	return i_23_;
    }
    
    public void method5718() {
	Class329.method5834(aShortArray3380, 1638710827);
    }
    
    public static Class395 method5719(Class534_Sub40 class534_sub40, int i) {
	Class395 class395 = new Class395();
	class395.anInt4103 = class534_sub40.method16529((byte) 1) * 167533425;
	class395.aClass534_Sub18_Sub12_4104
	    = RuntimeException_Sub4.aClass56_12127
		  .method1218(class395.anInt4103 * -1791556207, -1581069180);
	return class395;
    }
    
    public static int method5720(CharSequence charsequence, int i) {
	int i_26_ = charsequence.length();
	int i_27_ = 0;
	for (int i_28_ = 0; i_28_ < i_26_; i_28_++) {
	    char c = charsequence.charAt(i_28_);
	    if (c <= '\u007f')
		i_27_++;
	    else if (c <= '\u07ff')
		i_27_ += 2;
	    else
		i_27_ += 3;
	}
	return i_27_;
    }
    
    static final void method5721(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class686.method13970(class247, class243, class669, 16474966);
    }
    
    static final void method5722(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2474
	    = Class99.method1859(string, class669, 807922973);
	class247.aBool2561 = true;
    }
    
    public static String method5723(int i, boolean bool, byte i_29_) {
	if (!bool || i < 0)
	    return Integer.toString(i);
	return Class272.method5068(i, 10, bool, 1274827702);
    }
    
    static final void method5724(int i, int i_30_, int i_31_, int i_32_,
				 byte i_33_) {
	for (int i_34_ = 0; i_34_ < 1372795039 * client.anInt11249; i_34_++) {
	    Rectangle rectangle = client.aRectangleArray11285[i_34_];
	    if (rectangle.width + rectangle.x > i && rectangle.x < i_31_ + i
		&& rectangle.y + rectangle.height > i_30_
		&& rectangle.y < i_32_ + i_30_)
		client.aBoolArray11180[i_34_] = true;
	}
    }
    
    static void method5725(byte i) {
	int i_35_ = -1;
	if (Class554_Sub1.aClass534_Sub18_Sub9_7354 != null)
	    i_35_ = (848546455
		     * Class554_Sub1.aClass534_Sub18_Sub9_7354.anInt11766);
	Class176.method2929(-2024655746);
	for (int i_36_ = 0; i_36_ < 3; i_36_++) {
	    for (int i_37_ = 0; i_37_ < 5; i_37_++) {
		Class554_Sub1.aClass171ArrayArray10678[i_36_][i_37_] = null;
		Class554_Sub1.aClass16ArrayArray10679[i_36_][i_37_] = null;
	    }
	}
	Class554_Sub1.aClass534_Sub18_Sub9_7354 = null;
	if (-1 != i_35_)
	    Class536_Sub1.method15934(i_35_, -1, -1, false, 1909499025);
    }
}
