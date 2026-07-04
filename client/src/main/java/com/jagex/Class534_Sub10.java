/* Class534_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

public class Class534_Sub10 extends Class534
{
    int anInt10428;
    Class151_Sub2 aClass151_Sub2_10429;
    Class166 aClass166_10430;
    Class185_Sub1 aClass185_Sub1_10431;
    float aFloat10432;
    Interface37 anInterface37_10433;
    int anInt10434 = 0;
    int[] anIntArray10435;
    int anInt10436 = 0;
    int anInt10437 = 0;
    int anInt10438 = 0;
    long aLong10439;
    ByteBuffer aByteBuffer10440;
    
    void method16115(int i) {
	anInterface37_10433 = aClass185_Sub1_10431.method14698(false);
	anInterface37_10433.method236(i * 4, 4);
	anInterface37_10433.method235(0, i * 4, aLong10439);
	aByteBuffer10440.clear();
	aByteBuffer10440 = null;
	aLong10439 = 0L;
    }
    
    void method16116(int i) {
	aByteBuffer10440 = aClass185_Sub1_10431.method14587(i * 4);
	aLong10439 = aClass185_Sub1_10431.method14588(aByteBuffer10440);
	for (int i_0_ = 3; i_0_ < i * 4; i_0_ += 4)
	    aClass185_Sub1_10431.anUnsafe9127.putByte(aLong10439 + (long) i_0_,
						      (byte) 0);
    }
    
    void method16117(int i) {
	aClass185_Sub1_10431.anUnsafe9127
	    .putByte(aLong10439 + (long) (i * 4) + 3L, (byte) -1);
    }
    
    void method16118(int i) {
	anInterface37_10433 = aClass185_Sub1_10431.method14698(false);
	anInterface37_10433.method236(i * 4, 4);
	anInterface37_10433.method235(0, i * 4, aLong10439);
	aByteBuffer10440.clear();
	aByteBuffer10440 = null;
	aLong10439 = 0L;
    }
    
    void method16119(int i, int i_1_, int i_2_, float f) {
	if (anInt10428 != -1) {
	    Class186 class186
		= aClass185_Sub1_10431.aClass177_2012.method2931(anInt10428,
								 (byte) 1);
	    int i_3_ = class186.aByte2074 & 0xff;
	    if (i_3_ != 0 && class186.aByte2067 != 4) {
		int i_4_;
		if (i_2_ < 0)
		    i_4_ = 0;
		else if (i_2_ > 127)
		    i_4_ = 16777215;
		else
		    i_4_ = 131586 * i_2_;
		if (i_3_ == 256)
		    i_1_ = i_4_;
		else {
		    int i_5_ = i_3_;
		    int i_6_ = 256 - i_3_;
		    i_1_
			= (((i_4_ & 0xff00ff) * i_5_ + (i_1_ & 0xff00ff) * i_6_
			    & ~0xff00ff)
			   + ((i_4_ & 0xff00) * i_5_ + (i_1_ & 0xff00) * i_6_
			      & 0xff0000)) >> 8;
		}
	    }
	    int i_7_ = class186.aByte2059 & 0xff;
	    if (i_7_ != 0) {
		i_7_ += 256;
		int i_8_ = ((i_1_ & 0xff0000) >> 16) * i_7_;
		if (i_8_ > 65535)
		    i_8_ = 65535;
		int i_9_ = ((i_1_ & 0xff00) >> 8) * i_7_;
		if (i_9_ > 65535)
		    i_9_ = 65535;
		int i_10_ = (i_1_ & 0xff) * i_7_;
		if (i_10_ > 65535)
		    i_10_ = 65535;
		i_1_ = (i_8_ << 8 & 0xff0000) + (i_9_ & 0xff00) + (i_10_ >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_11_ = i_1_ >> 16 & 0xff;
	    int i_12_ = i_1_ >> 8 & 0xff;
	    int i_13_ = i_1_ & 0xff;
	    i_11_ *= f;
	    if (i_11_ < 0)
		i_11_ = 0;
	    else if (i_11_ > 255)
		i_11_ = 255;
	    i_12_ *= f;
	    if (i_12_ < 0)
		i_12_ = 0;
	    else if (i_12_ > 255)
		i_12_ = 255;
	    i_13_ *= f;
	    if (i_13_ < 0)
		i_13_ = 0;
	    else if (i_13_ > 255)
		i_13_ = 255;
	    i_1_ = i_11_ << 16 | i_12_ << 8 | i_13_;
	}
	if (aClass185_Sub1_10431.anInt9268 == 0) {
	    aByteBuffer10440.put(i * 4 + 0, (byte) (i_1_ >> 16));
	    aByteBuffer10440.put(i * 4 + 1, (byte) (i_1_ >> 8));
	    aByteBuffer10440.put(i * 4 + 2, (byte) (i_1_ >> 0));
	} else {
	    aByteBuffer10440.put(i * 4 + 0, (byte) (i_1_ >> 0));
	    aByteBuffer10440.put(i * 4 + 1, (byte) (i_1_ >> 8));
	    aByteBuffer10440.put(i * 4 + 2, (byte) (i_1_ >> 16));
	}
    }
    
    void method16120(int i) {
	anInterface37_10433 = aClass185_Sub1_10431.method14698(false);
	anInterface37_10433.method236(i * 4, 4);
	anInterface37_10433.method235(0, i * 4, aLong10439);
	aByteBuffer10440.clear();
	aByteBuffer10440 = null;
	aLong10439 = 0L;
    }
    
    void method16121(int[] is, int i) {
	anInt10436 = 0;
	anInt10437 = 32767;
	anInt10438 = -32768;
	ByteBuffer bytebuffer = aClass185_Sub1_10431.aByteBuffer9266;
	for (int i_14_ = 0; i_14_ < i; i_14_++) {
	    int i_15_ = is[i_14_];
	    short[] is_16_ = aClass151_Sub2_10429.aShortArrayArray9409[i_15_];
	    int i_17_ = anIntArray10435[i_15_];
	    if (i_17_ != 0 && is_16_ != null) {
		int i_18_ = 0;
		int i_19_ = 0;
		while (i_19_ < is_16_.length) {
		    if ((i_17_ & 1 << i_18_++) != 0) {
			for (int i_20_ = 0; i_20_ < 3; i_20_++) {
			    int i_21_ = is_16_[i_19_++] & 0xffff;
			    if (i_21_ > anInt10438)
				anInt10438 = i_21_;
			    if (i_21_ < anInt10437)
				anInt10437 = i_21_;
			    bytebuffer.putShort((short) i_21_);
			}
			anInt10436 += 3;
		    } else
			i_19_ += 3;
		}
	    }
	}
    }
    
    void method16122(int i, int i_22_, int i_23_, float f) {
	if (anInt10428 != -1) {
	    Class186 class186
		= aClass185_Sub1_10431.aClass177_2012.method2931(anInt10428,
								 (byte) 1);
	    int i_24_ = class186.aByte2074 & 0xff;
	    if (i_24_ != 0 && class186.aByte2067 != 4) {
		int i_25_;
		if (i_23_ < 0)
		    i_25_ = 0;
		else if (i_23_ > 127)
		    i_25_ = 16777215;
		else
		    i_25_ = 131586 * i_23_;
		if (i_24_ == 256)
		    i_22_ = i_25_;
		else {
		    int i_26_ = i_24_;
		    int i_27_ = 256 - i_24_;
		    i_22_ = ((((i_25_ & 0xff00ff) * i_26_
			       + (i_22_ & 0xff00ff) * i_27_)
			      & ~0xff00ff)
			     + (((i_25_ & 0xff00) * i_26_
				 + (i_22_ & 0xff00) * i_27_)
				& 0xff0000)) >> 8;
		}
	    }
	    int i_28_ = class186.aByte2059 & 0xff;
	    if (i_28_ != 0) {
		i_28_ += 256;
		int i_29_ = ((i_22_ & 0xff0000) >> 16) * i_28_;
		if (i_29_ > 65535)
		    i_29_ = 65535;
		int i_30_ = ((i_22_ & 0xff00) >> 8) * i_28_;
		if (i_30_ > 65535)
		    i_30_ = 65535;
		int i_31_ = (i_22_ & 0xff) * i_28_;
		if (i_31_ > 65535)
		    i_31_ = 65535;
		i_22_ = (i_29_ << 8 & 0xff0000) + (i_30_ & 0xff00) + (i_31_
								      >> 8);
	    }
	}
	if (f != 1.0F) {
	    int i_32_ = i_22_ >> 16 & 0xff;
	    int i_33_ = i_22_ >> 8 & 0xff;
	    int i_34_ = i_22_ & 0xff;
	    i_32_ *= f;
	    if (i_32_ < 0)
		i_32_ = 0;
	    else if (i_32_ > 255)
		i_32_ = 255;
	    i_33_ *= f;
	    if (i_33_ < 0)
		i_33_ = 0;
	    else if (i_33_ > 255)
		i_33_ = 255;
	    i_34_ *= f;
	    if (i_34_ < 0)
		i_34_ = 0;
	    else if (i_34_ > 255)
		i_34_ = 255;
	    i_22_ = i_32_ << 16 | i_33_ << 8 | i_34_;
	}
	if (aClass185_Sub1_10431.anInt9268 == 0) {
	    aByteBuffer10440.put(i * 4 + 0, (byte) (i_22_ >> 16));
	    aByteBuffer10440.put(i * 4 + 1, (byte) (i_22_ >> 8));
	    aByteBuffer10440.put(i * 4 + 2, (byte) (i_22_ >> 0));
	} else {
	    aByteBuffer10440.put(i * 4 + 0, (byte) (i_22_ >> 0));
	    aByteBuffer10440.put(i * 4 + 1, (byte) (i_22_ >> 8));
	    aByteBuffer10440.put(i * 4 + 2, (byte) (i_22_ >> 16));
	}
    }
    
    void method16123(int i, int i_35_, int i_36_) {
	anIntArray10435[(i_35_ * (aClass151_Sub2_10429.anInt1701 * -1924295585)
			 + i)]
	    |= 1 << i_36_;
	anInt10434++;
    }
    
    Class534_Sub10(Class151_Sub2 class151_sub2, int i, int i_37_,
		   Class166 class166) {
	aClass151_Sub2_10429 = class151_sub2;
	aClass185_Sub1_10431 = aClass151_Sub2_10429.aClass185_Sub1_9377;
	anInt10428 = i;
	aFloat10432 = (float) i_37_;
	aClass166_10430 = class166;
	anIntArray10435
	    = new int[(aClass151_Sub2_10429.anInt1701 * -1924295585
		       * (aClass151_Sub2_10429.anInt1700 * -1466328823))];
    }
    
    void method16124(int i) {
	anInterface37_10433 = aClass185_Sub1_10431.method14698(false);
	anInterface37_10433.method236(i * 4, 4);
	anInterface37_10433.method235(0, i * 4, aLong10439);
	aByteBuffer10440.clear();
	aByteBuffer10440 = null;
	aLong10439 = 0L;
    }
    
    void method16125(int[] is, int i) {
	anInt10436 = 0;
	anInt10437 = 32767;
	anInt10438 = -32768;
	ByteBuffer bytebuffer = aClass185_Sub1_10431.aByteBuffer9266;
	for (int i_38_ = 0; i_38_ < i; i_38_++) {
	    int i_39_ = is[i_38_];
	    short[] is_40_ = aClass151_Sub2_10429.aShortArrayArray9409[i_39_];
	    int i_41_ = anIntArray10435[i_39_];
	    if (i_41_ != 0 && is_40_ != null) {
		int i_42_ = 0;
		int i_43_ = 0;
		while (i_43_ < is_40_.length) {
		    if ((i_41_ & 1 << i_42_++) != 0) {
			for (int i_44_ = 0; i_44_ < 3; i_44_++) {
			    int i_45_ = is_40_[i_43_++] & 0xffff;
			    if (i_45_ > anInt10438)
				anInt10438 = i_45_;
			    if (i_45_ < anInt10437)
				anInt10437 = i_45_;
			    bytebuffer.putShort((short) i_45_);
			}
			anInt10436 += 3;
		    } else
			i_43_ += 3;
		}
	    }
	}
    }
    
    void method16126(int[] is, int i) {
	anInt10436 = 0;
	anInt10437 = 32767;
	anInt10438 = -32768;
	ByteBuffer bytebuffer = aClass185_Sub1_10431.aByteBuffer9266;
	for (int i_46_ = 0; i_46_ < i; i_46_++) {
	    int i_47_ = is[i_46_];
	    short[] is_48_ = aClass151_Sub2_10429.aShortArrayArray9409[i_47_];
	    int i_49_ = anIntArray10435[i_47_];
	    if (i_49_ != 0 && is_48_ != null) {
		int i_50_ = 0;
		int i_51_ = 0;
		while (i_51_ < is_48_.length) {
		    if ((i_49_ & 1 << i_50_++) != 0) {
			for (int i_52_ = 0; i_52_ < 3; i_52_++) {
			    int i_53_ = is_48_[i_51_++] & 0xffff;
			    if (i_53_ > anInt10438)
				anInt10438 = i_53_;
			    if (i_53_ < anInt10437)
				anInt10437 = i_53_;
			    bytebuffer.putShort((short) i_53_);
			}
			anInt10436 += 3;
		    } else
			i_51_ += 3;
		}
	    }
	}
    }
}
