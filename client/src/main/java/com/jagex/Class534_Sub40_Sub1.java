/* Class534_Sub40_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub40_Sub1 extends Class534_Sub40
{
    static int[] anIntArray11775
	= { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191,
	    16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151,
	    4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
	    268435455, 536870911, 1073741823, 2147483647, -1 };
    IsaacCipher aClass13_11776;
    int anInt11777;
    
    public int method18287(int i, int i_0_) {
	return 8 * i - anInt11777 * 69684831;
    }
    
    public void method18288() {
	anInt11777 = 1221867880 * anInt10811;
    }
    
    public int method18289() {
	return ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		 - aClass13_11776.method639((byte) 1))
		& 0xff);
    }
    
    public int method18290(int i) {
	return ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		 - aClass13_11776.method639((byte) 1))
		& 0xff);
    }
    
    public void method18291(byte[] is, int i, int i_1_, byte i_2_) {
	for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
	    is[i + i_3_]
		= (byte) ((aByteArray10810
			   [(anInt10811 += -1387468933) * 31645619 - 1])
			  - aClass13_11776.method639((byte) 1));
    }
    
    public int method18292(int i) {
	return 8 * i - anInt11777 * 69684831;
    }
    
    public int method18293() {
	int i = ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		  - aClass13_11776.method639((byte) 1))
		 & 0xff);
	if (i < 128)
	    return i;
	return ((i - 128 << 8)
		+ ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		    - aClass13_11776.method639((byte) 1))
		   & 0xff));
    }
    
    public void method18294(int i) {
	anInt11777 = 1221867880 * anInt10811;
    }
    
    public int method18295(int i, int i_4_) {
	int i_5_ = anInt11777 * 69684831 >> 3;
	int i_6_ = 8 - (69684831 * anInt11777 & 0x7);
	int i_7_ = 0;
	anInt11777 += 437554591 * i;
	for (/**/; i > i_6_; i_6_ = 8) {
	    i_7_ += ((aByteArray10810[i_5_++] & anIntArray11775[i_6_])
		     << i - i_6_);
	    i -= i_6_;
	}
	if (i == i_6_)
	    i_7_ += aByteArray10810[i_5_] & anIntArray11775[i_6_];
	else
	    i_7_ += aByteArray10810[i_5_] >> i_6_ - i & anIntArray11775[i];
	return i_7_;
    }
    
    public void method18296(int i) {
	anInt10811 = -1387468933 * ((7 + 69684831 * anInt11777) / 8);
    }
    
    public int method18297(int i) {
	int i_8_ = anInt11777 * 69684831 >> 3;
	int i_9_ = 8 - (69684831 * anInt11777 & 0x7);
	int i_10_ = 0;
	anInt11777 += 437554591 * i;
	for (/**/; i > i_9_; i_9_ = 8) {
	    i_10_ += ((aByteArray10810[i_8_++] & anIntArray11775[i_9_])
		      << i - i_9_);
	    i -= i_9_;
	}
	if (i == i_9_)
	    i_10_ += aByteArray10810[i_8_] & anIntArray11775[i_9_];
	else
	    i_10_ += aByteArray10810[i_8_] >> i_9_ - i & anIntArray11775[i];
	return i_10_;
    }
    
    public void method18298(IsaacCipher class13) {
	aClass13_11776 = class13;
    }
    
    public boolean method18299() {
	int i = ((aByteArray10810[anInt10811 * 31645619]
		  - aClass13_11776.method640(-609498134))
		 & 0xff);
	if (i < 128)
	    return false;
	return true;
    }
    
    public void method18300(int i) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i + aClass13_11776.method639((byte) 1));
    }
    
    public void method18301() {
	anInt10811 = -1387468933 * ((7 + 69684831 * anInt11777) / 8);
    }
    
    public boolean method18302(int i) {
	int i_11_ = ((aByteArray10810[anInt10811 * 31645619]
		      - aClass13_11776.method640(800541140))
		     & 0xff);
	if (i_11_ < 128)
	    return false;
	return true;
    }
    
    public int method18303() {
	return ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		 - aClass13_11776.method639((byte) 1))
		& 0xff);
    }
    
    public boolean method18304() {
	int i = ((aByteArray10810[anInt10811 * 31645619]
		  - aClass13_11776.method640(-985409171))
		 & 0xff);
	if (i < 128)
	    return false;
	return true;
    }
    
    public boolean method18305() {
	int i = ((aByteArray10810[anInt10811 * 31645619]
		  - aClass13_11776.method640(103407470))
		 & 0xff);
	if (i < 128)
	    return false;
	return true;
    }
    
    public void method18306(int i, int i_12_) {
	aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
	    = (byte) (i + aClass13_11776.method639((byte) 1));
    }
    
    public int method18307() {
	int i = ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		  - aClass13_11776.method639((byte) 1))
		 & 0xff);
	if (i < 128)
	    return i;
	return ((i - 128 << 8)
		+ ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		    - aClass13_11776.method639((byte) 1))
		   & 0xff));
    }
    
    public void method18308(IsaacCipher class13) {
	aClass13_11776 = class13;
    }
    
    public int method18309() {
	int i = ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		  - aClass13_11776.method639((byte) 1))
		 & 0xff);
	if (i < 128)
	    return i;
	return ((i - 128 << 8)
		+ ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		    - aClass13_11776.method639((byte) 1))
		   & 0xff));
    }
    
    public void method18310(byte[] is, int i, int i_13_) {
	for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
	    is[i + i_14_]
		= (byte) ((aByteArray10810
			   [(anInt10811 += -1387468933) * 31645619 - 1])
			  - aClass13_11776.method639((byte) 1));
    }
    
    public void method18311(byte[] is, int i, int i_15_) {
	for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
	    is[i + i_16_]
		= (byte) ((aByteArray10810
			   [(anInt10811 += -1387468933) * 31645619 - 1])
			  - aClass13_11776.method639((byte) 1));
    }
    
    public void method18312(byte[] is, int i, int i_17_) {
	for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
	    is[i + i_18_]
		= (byte) ((aByteArray10810
			   [(anInt10811 += -1387468933) * 31645619 - 1])
			  - aClass13_11776.method639((byte) 1));
    }
    
    public int method18313(int i) {
	int i_19_
	    = ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		- aClass13_11776.method639((byte) 1))
	       & 0xff);
	if (i_19_ < 128)
	    return i_19_;
	return ((i_19_ - 128 << 8)
		+ ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		    - aClass13_11776.method639((byte) 1))
		   & 0xff));
    }
    
    public void method18314() {
	anInt11777 = 1221867880 * anInt10811;
    }
    
    public int method18315(int i) {
	int i_20_ = anInt11777 * 69684831 >> 3;
	int i_21_ = 8 - (69684831 * anInt11777 & 0x7);
	int i_22_ = 0;
	anInt11777 += 437554591 * i;
	for (/**/; i > i_21_; i_21_ = 8) {
	    i_22_ += ((aByteArray10810[i_20_++] & anIntArray11775[i_21_])
		      << i - i_21_);
	    i -= i_21_;
	}
	if (i == i_21_)
	    i_22_ += aByteArray10810[i_20_] & anIntArray11775[i_21_];
	else
	    i_22_ += aByteArray10810[i_20_] >> i_21_ - i & anIntArray11775[i];
	return i_22_;
    }
    
    public void method18316(IsaacCipher class13, int i) {
	aClass13_11776 = class13;
    }
    
    public void method18317() {
	anInt10811 = -1387468933 * ((7 + 69684831 * anInt11777) / 8);
    }
    
    public int method18318() {
	return ((aByteArray10810[(anInt10811 += -1387468933) * 31645619 - 1]
		 - aClass13_11776.method639((byte) 1))
		& 0xff);
    }
    
    public Class534_Sub40_Sub1(int i) {
	super(i);
    }
}
