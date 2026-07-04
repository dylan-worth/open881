/* Class520 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.io.OutputStream;

public class Class520
{
    int anInt7058 = 0;
    int anInt7059;
    int anInt7060;
    OutputStream anOutputStream7061;
    byte[] aByteArray7062;
    static Class247[] aClass247Array7063;
    
    public void method8653(int i) {
	if (aByteArray7062 == null || -1133431023 * anInt7058 != i)
	    aByteArray7062 = new byte[i];
	anInt7058 = 727882225 * i;
	anInt7059 = 0;
	anInt7060 = 0;
    }
    
    public void method8654(int i, int i_0_) {
	if (aByteArray7062 == null || -1133431023 * anInt7058 != i)
	    aByteArray7062 = new byte[i];
	anInt7058 = 727882225 * i;
	anInt7059 = 0;
	anInt7060 = 0;
    }
    
    public void method8655(OutputStream outputstream, int i)
	throws IOException {
	method8656(-1278215326);
	anOutputStream7061 = outputstream;
    }
    
    public void method8656(int i) throws IOException {
	method8658(1549299368);
	anOutputStream7061 = null;
    }
    
    public void method8657(boolean bool, byte i) {
	if (!bool) {
	    anInt7060 = 0;
	    anInt7059 = 0;
	}
    }
    
    public void method8658(int i) throws IOException {
	int i_1_ = -1463735993 * anInt7059 - -719749665 * anInt7060;
	if (0 != i_1_) {
	    anOutputStream7061.write(aByteArray7062, anInt7060 * -719749665,
				     i_1_);
	    if (-1463735993 * anInt7059 >= anInt7058 * -1133431023)
		anInt7059 = 0;
	    anInt7060 = anInt7059 * 1203433881;
	}
    }
    
    public void method8659(int i, int i_2_, int i_3_) throws IOException {
	int i_4_ = -1463735993 * anInt7059 - i - 1;
	if (i_4_ < 0)
	    i_4_ += -1133431023 * anInt7058;
	for (/**/; 0 != i_2_; i_2_--) {
	    if (i_4_ >= anInt7058 * -1133431023)
		i_4_ = 0;
	    aByteArray7062[(anInt7059 += -1979469705) * -1463735993 - 1]
		= aByteArray7062[i_4_++];
	    if (-1463735993 * anInt7059 >= anInt7058 * -1133431023)
		method8658(-414418979);
	}
    }
    
    public void method8660(OutputStream outputstream) throws IOException {
	method8656(-1278215326);
	anOutputStream7061 = outputstream;
    }
    
    public byte method8661(int i, byte i_5_) {
	int i_6_ = anInt7059 * -1463735993 - i - 1;
	if (i_6_ < 0)
	    i_6_ += -1133431023 * anInt7058;
	return aByteArray7062[i_6_];
    }
    
    public void method8662(int i) {
	if (aByteArray7062 == null || -1133431023 * anInt7058 != i)
	    aByteArray7062 = new byte[i];
	anInt7058 = 727882225 * i;
	anInt7059 = 0;
	anInt7060 = 0;
    }
    
    public void method8663(int i, int i_7_) throws IOException {
	int i_8_ = -1463735993 * anInt7059 - i - 1;
	if (i_8_ < 0)
	    i_8_ += -1133431023 * anInt7058;
	for (/**/; 0 != i_7_; i_7_--) {
	    if (i_8_ >= anInt7058 * -1133431023)
		i_8_ = 0;
	    aByteArray7062[(anInt7059 += -1979469705) * -1463735993 - 1]
		= aByteArray7062[i_8_++];
	    if (-1463735993 * anInt7059 >= anInt7058 * -1133431023)
		method8658(-522665835);
	}
    }
    
    public void method8664(int i) {
	if (aByteArray7062 == null || -1133431023 * anInt7058 != i)
	    aByteArray7062 = new byte[i];
	anInt7058 = 727882225 * i;
	anInt7059 = 0;
	anInt7060 = 0;
    }
    
    public void method8665(int i, int i_9_) throws IOException {
	int i_10_ = -1463735993 * anInt7059 - i - 1;
	if (i_10_ < 0)
	    i_10_ += -1133431023 * anInt7058;
	for (/**/; 0 != i_9_; i_9_--) {
	    if (i_10_ >= anInt7058 * -1133431023)
		i_10_ = 0;
	    aByteArray7062[(anInt7059 += -1979469705) * -1463735993 - 1]
		= aByteArray7062[i_10_++];
	    if (-1463735993 * anInt7059 >= anInt7058 * -1133431023)
		method8658(1046267302);
	}
    }
    
    public void method8666(OutputStream outputstream) throws IOException {
	method8656(-1278215326);
	anOutputStream7061 = outputstream;
    }
    
    public void method8667() throws IOException {
	int i = -1463735993 * anInt7059 - -719749665 * anInt7060;
	if (0 != i) {
	    anOutputStream7061.write(aByteArray7062, anInt7060 * -719749665,
				     i);
	    if (-1463735993 * anInt7059 >= anInt7058 * -1133431023)
		anInt7059 = 0;
	    anInt7060 = anInt7059 * 1203433881;
	}
    }
    
    public void method8668() throws IOException {
	method8658(52706262);
	anOutputStream7061 = null;
    }
    
    public void method8669() throws IOException {
	method8658(1373040708);
	anOutputStream7061 = null;
    }
    
    public void method8670(OutputStream outputstream) throws IOException {
	method8656(-1278215326);
	anOutputStream7061 = outputstream;
    }
    
    public void method8671(boolean bool) {
	if (!bool) {
	    anInt7060 = 0;
	    anInt7059 = 0;
	}
    }
    
    public void method8672() throws IOException {
	int i = -1463735993 * anInt7059 - -719749665 * anInt7060;
	if (0 != i) {
	    anOutputStream7061.write(aByteArray7062, anInt7060 * -719749665,
				     i);
	    if (-1463735993 * anInt7059 >= anInt7058 * -1133431023)
		anInt7059 = 0;
	    anInt7060 = anInt7059 * 1203433881;
	}
    }
    
    public byte method8673(int i) {
	int i_11_ = anInt7059 * -1463735993 - i - 1;
	if (i_11_ < 0)
	    i_11_ += -1133431023 * anInt7058;
	return aByteArray7062[i_11_];
    }
    
    public void method8674() throws IOException {
	int i = -1463735993 * anInt7059 - -719749665 * anInt7060;
	if (0 != i) {
	    anOutputStream7061.write(aByteArray7062, anInt7060 * -719749665,
				     i);
	    if (-1463735993 * anInt7059 >= anInt7058 * -1133431023)
		anInt7059 = 0;
	    anInt7060 = anInt7059 * 1203433881;
	}
    }
    
    public void method8675(int i, int i_12_) throws IOException {
	int i_13_ = -1463735993 * anInt7059 - i - 1;
	if (i_13_ < 0)
	    i_13_ += -1133431023 * anInt7058;
	for (/**/; 0 != i_12_; i_12_--) {
	    if (i_13_ >= anInt7058 * -1133431023)
		i_13_ = 0;
	    aByteArray7062[(anInt7059 += -1979469705) * -1463735993 - 1]
		= aByteArray7062[i_13_++];
	    if (-1463735993 * anInt7059 >= anInt7058 * -1133431023)
		method8658(1649009178);
	}
    }
    
    public void method8676(int i, int i_14_) throws IOException {
	int i_15_ = -1463735993 * anInt7059 - i - 1;
	if (i_15_ < 0)
	    i_15_ += -1133431023 * anInt7058;
	for (/**/; 0 != i_14_; i_14_--) {
	    if (i_15_ >= anInt7058 * -1133431023)
		i_15_ = 0;
	    aByteArray7062[(anInt7059 += -1979469705) * -1463735993 - 1]
		= aByteArray7062[i_15_++];
	    if (-1463735993 * anInt7059 >= anInt7058 * -1133431023)
		method8658(-857396151);
	}
    }
    
    public void method8677(byte i, byte i_16_) throws IOException {
	aByteArray7062[(anInt7059 += -1979469705) * -1463735993 - 1] = i;
	if (anInt7059 * -1463735993 >= anInt7058 * -1133431023)
	    method8658(964443567);
    }
    
    public void method8678(byte i) throws IOException {
	aByteArray7062[(anInt7059 += -1979469705) * -1463735993 - 1] = i;
	if (anInt7059 * -1463735993 >= anInt7058 * -1133431023)
	    method8658(-834429701);
    }
    
    public void method8679(int i, int i_17_) throws IOException {
	int i_18_ = -1463735993 * anInt7059 - i - 1;
	if (i_18_ < 0)
	    i_18_ += -1133431023 * anInt7058;
	for (/**/; 0 != i_17_; i_17_--) {
	    if (i_18_ >= anInt7058 * -1133431023)
		i_18_ = 0;
	    aByteArray7062[(anInt7059 += -1979469705) * -1463735993 - 1]
		= aByteArray7062[i_18_++];
	    if (-1463735993 * anInt7059 >= anInt7058 * -1133431023)
		method8658(1936402849);
	}
    }
    
    public void method8680(byte i) throws IOException {
	aByteArray7062[(anInt7059 += -1979469705) * -1463735993 - 1] = i;
	if (anInt7059 * -1463735993 >= anInt7058 * -1133431023)
	    method8658(883528845);
    }
    
    public void method8681(byte i) throws IOException {
	aByteArray7062[(anInt7059 += -1979469705) * -1463735993 - 1] = i;
	if (anInt7059 * -1463735993 >= anInt7058 * -1133431023)
	    method8658(1775258052);
    }
    
    public byte method8682(int i) {
	int i_19_ = anInt7059 * -1463735993 - i - 1;
	if (i_19_ < 0)
	    i_19_ += -1133431023 * anInt7058;
	return aByteArray7062[i_19_];
    }
    
    public void method8683(boolean bool) {
	if (!bool) {
	    anInt7060 = 0;
	    anInt7059 = 0;
	}
    }
    
    public byte method8684(int i) {
	int i_20_ = anInt7059 * -1463735993 - i - 1;
	if (i_20_ < 0)
	    i_20_ += -1133431023 * anInt7058;
	return aByteArray7062[i_20_];
    }
    
    static boolean method8685(CharSequence charsequence, int i, boolean bool,
			      int i_21_) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_22_ = false;
	boolean bool_23_ = false;
	int i_24_ = 0;
	int i_25_ = charsequence.length();
	for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
	    int i_27_ = charsequence.charAt(i_26_);
	    if (0 == i_26_) {
		if (45 == i_27_) {
		    bool_22_ = true;
		    continue;
		}
		if (i_27_ == 43 && bool)
		    continue;
	    }
	    if (i_27_ >= 48 && i_27_ <= 57)
		i_27_ -= 48;
	    else if (i_27_ >= 65 && i_27_ <= 90)
		i_27_ -= 55;
	    else if (i_27_ >= 97 && i_27_ <= 122)
		i_27_ -= 87;
	    else
		return false;
	    if (i_27_ >= i)
		return false;
	    if (bool_22_)
		i_27_ = -i_27_;
	    int i_28_ = i_24_ * i + i_27_;
	    if (i_28_ / i != i_24_)
		return false;
	    i_24_ = i_28_;
	    bool_23_ = true;
	}
	return bool_23_;
    }
}
