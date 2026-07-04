/* Class486 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public abstract class Class486 implements Interface43
{
    Class173 aClass173_5291;
    Class181 aClass181_5292;
    static final int anInt5293 = 34067;
    static final int anInt5294 = 32879;
    Class185_Sub1_Sub2 aClass185_Sub1_Sub2_5295;
    int anInt5296;
    static final int anInt5297 = 3553;
    static final int anInt5298 = 0;
    int anInt5299;
    boolean aBool5300;
    static int[] anIntArray5301 = new int[1];
    Class372 aClass372_5302 = Class372.aClass372_3888;
    int anInt5303;
    
    void method7964(int i, int i_0_, int i_1_, int[] is) {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	if (i_0_ > 0 && !Class562.method9467(i_0_, -1320547643))
	    throw new IllegalArgumentException("");
	if (i_1_ > 0 && !Class562.method9467(i_1_, 883717843))
	    throw new IllegalArgumentException("");
	if (aClass181_5292 != Class181.aClass181_1952)
	    throw new IllegalArgumentException("");
	int i_2_ = 0;
	int i_3_ = i_0_ < i_1_ ? i_0_ : i_1_;
	int i_4_ = i_0_ >> 1;
	int i_5_ = i_1_ >> 1;
	int[] is_6_ = is;
	int[] is_7_ = new int[i_4_ * i_5_];
	for (;;) {
	    OpenGL.glTexImage2Di
		(i, i_2_,
		 Class185_Sub1_Sub2.method18075(aClass181_5292,
						aClass173_5291),
		 i_0_, i_1_, 0, 32993, aClass185_Sub1_Sub2_5295.anInt11590,
		 is_6_, 0);
	    if (i_3_ <= 1)
		break;
	    int i_8_ = 0;
	    int i_9_ = 0;
	    int i_10_ = i_9_ + i_0_;
	    for (int i_11_ = 0; i_11_ < i_5_; i_11_++) {
		for (int i_12_ = 0; i_12_ < i_4_; i_12_++) {
		    int i_13_ = is_6_[i_9_++];
		    int i_14_ = is_6_[i_9_++];
		    int i_15_ = is_6_[i_10_++];
		    int i_16_ = is_6_[i_10_++];
		    int i_17_ = i_13_ >> 24 & 0xff;
		    int i_18_ = i_13_ >> 16 & 0xff;
		    int i_19_ = i_13_ >> 8 & 0xff;
		    int i_20_ = i_13_ & 0xff;
		    i_17_ += i_14_ >> 24 & 0xff;
		    i_18_ += i_14_ >> 16 & 0xff;
		    i_19_ += i_14_ >> 8 & 0xff;
		    i_20_ += i_14_ & 0xff;
		    i_17_ += i_15_ >> 24 & 0xff;
		    i_18_ += i_15_ >> 16 & 0xff;
		    i_19_ += i_15_ >> 8 & 0xff;
		    i_20_ += i_15_ & 0xff;
		    i_17_ += i_16_ >> 24 & 0xff;
		    i_18_ += i_16_ >> 16 & 0xff;
		    i_19_ += i_16_ >> 8 & 0xff;
		    i_20_ += i_16_ & 0xff;
		    is_7_[i_8_++]
			= ((i_17_ & 0x3fc) << 22 | (i_18_ & 0x3fc) << 14
			   | (i_19_ & 0x3fc) << 6 | (i_20_ & 0x3fc) >> 2);
		}
		i_9_ += i_0_;
		i_10_ += i_0_;
	    }
	    int[] is_21_ = is_7_;
	    is_7_ = is_6_;
	    is_6_ = is_21_;
	    i_0_ = i_4_;
	    i_1_ = i_5_;
	    i_4_ >>= 1;
	    i_5_ >>= 1;
	    i_3_ >>= 1;
	    i_2_++;
	}
    }
    
    public void finalize() throws Throwable {
	method7969();
	super.finalize();
    }
    
    public void method339(Class372 class372) {
	if (aClass372_5302 != class372) {
	    aClass372_5302 = class372;
	    method7965();
	}
    }
    
    void method7965() {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	aClass185_Sub1_Sub2_5295.method14669(this);
	if (aClass372_5302 == Class372.aClass372_3888) {
	    OpenGL.glTexParameteri(anInt5303, 10241, aBool5300 ? 9987 : 9729);
	    OpenGL.glTexParameteri(anInt5303, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(anInt5303, 10241, aBool5300 ? 9984 : 9728);
	    OpenGL.glTexParameteri(anInt5303, 10240, 9728);
	}
    }
    
    void method7966(int i, int i_22_, int i_23_, float[] fs) {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	if (i_22_ > 0 && !Class562.method9467(i_22_, 43549116))
	    throw new IllegalArgumentException("");
	if (i_23_ > 0 && !Class562.method9467(i_23_, 1876292953))
	    throw new IllegalArgumentException("");
	int i_24_ = aClass181_5292.anInt1962 * 1676120375;
	int i_25_ = 0;
	int i_26_ = i_22_ < i_23_ ? i_22_ : i_23_;
	int i_27_ = i_22_ >> 1;
	int i_28_ = i_23_ >> 1;
	float[] fs_29_ = fs;
	float[] fs_30_ = new float[i_27_ * i_28_ * i_24_];
	for (;;) {
	    OpenGL.glTexImage2Df
		(i, i_25_,
		 Class185_Sub1_Sub2.method18075(aClass181_5292,
						aClass173_5291),
		 i_22_, i_23_, 0,
		 Class185_Sub1_Sub2.method18097(aClass181_5292), 5126, fs_29_,
		 0);
	    if (i_26_ <= 1)
		break;
	    int i_31_ = i_22_ * i_24_;
	    for (int i_32_ = 0; i_32_ < i_24_; i_32_++) {
		int i_33_ = i_32_;
		int i_34_ = i_32_;
		int i_35_ = i_34_ + i_31_;
		for (int i_36_ = 0; i_36_ < i_28_; i_36_++) {
		    for (int i_37_ = 0; i_37_ < i_27_; i_37_++) {
			float f = fs_29_[i_34_];
			i_34_ += i_24_;
			f += fs_29_[i_34_];
			i_34_ += i_24_;
			f += fs_29_[i_35_];
			i_35_ += i_24_;
			f += fs_29_[i_35_];
			i_35_ += i_24_;
			fs_30_[i_33_] = f * 0.25F;
			i_33_ += i_24_;
		    }
		    i_34_ += i_31_;
		    i_35_ += i_31_;
		}
	    }
	    float[] fs_38_ = fs_30_;
	    fs_30_ = fs_29_;
	    fs_29_ = fs_38_;
	    i_22_ = i_27_;
	    i_23_ = i_28_;
	    i_27_ >>= 1;
	    i_28_ >>= 1;
	    i_26_ >>= 1;
	    i_25_++;
	}
    }
    
    public void method336() {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	int i = aClass185_Sub1_Sub2_5295.method14749();
	int i_39_ = aClass185_Sub1_Sub2_5295.anIntArray11601[i];
	if (i_39_ != anInt5303) {
	    if (i_39_ != 0) {
		OpenGL.glBindTexture(i_39_, 0);
		OpenGL.glDisable(i_39_);
	    }
	    OpenGL.glEnable(anInt5303);
	    aClass185_Sub1_Sub2_5295.anIntArray11601[i] = anInt5303;
	}
	OpenGL.glBindTexture(anInt5303, anInt5296);
    }
    
    boolean method275() {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	int i = method7968();
	aClass185_Sub1_Sub2_5295.method14669(this);
	if (aClass185_Sub1_Sub2_5295.aBool11584)
	    OpenGL.glEnable(anInt5303);
	OpenGL.glGenerateMipmapEXT(anInt5303);
	if (aClass185_Sub1_Sub2_5295.aBool11584)
	    OpenGL.glDisable(anInt5303);
	aBool5300 = true;
	method7965();
	method7967(i);
	return true;
    }
    
    public void method143() {
	if (anInt5296 != 0) {
	    aClass185_Sub1_Sub2_5295.anInt9135 -= method7968();
	    int[] is = new int[1];
	    is[0] = anInt5296;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt5296 = 0;
	}
    }
    
    void method7967(int i) {
	aClass185_Sub1_Sub2_5295.anInt9135 -= i;
	aClass185_Sub1_Sub2_5295.anInt9135 += method7968();
    }
    
    int method7968() {
	int i = (aClass181_5292.anInt1962 * 1676120375
		 * (aClass173_5291.anInt1825 * 1899960707) * anInt5299);
	return aBool5300 ? i * 4 / 3 : i;
    }
    
    public void method142() {
	if (anInt5296 != 0) {
	    aClass185_Sub1_Sub2_5295.anInt9135 -= method7968();
	    int[] is = new int[1];
	    is[0] = anInt5296;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt5296 = 0;
	}
    }
    
    void method7969() {
	if (anInt5296 != 0) {
	    aClass185_Sub1_Sub2_5295.method18070(anInt5296, method7968());
	    anInt5296 = 0;
	}
    }
    
    boolean method270() {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	int i = method7968();
	aClass185_Sub1_Sub2_5295.method14669(this);
	if (aClass185_Sub1_Sub2_5295.aBool11584)
	    OpenGL.glEnable(anInt5303);
	OpenGL.glGenerateMipmapEXT(anInt5303);
	if (aClass185_Sub1_Sub2_5295.aBool11584)
	    OpenGL.glDisable(anInt5303);
	aBool5300 = true;
	method7965();
	method7967(i);
	return true;
    }
    
    int method7970() {
	int i = (aClass181_5292.anInt1962 * 1676120375
		 * (aClass173_5291.anInt1825 * 1899960707) * anInt5299);
	return aBool5300 ? i * 4 / 3 : i;
    }
    
    public void method141() {
	if (anInt5296 != 0) {
	    aClass185_Sub1_Sub2_5295.anInt9135 -= method7968();
	    int[] is = new int[1];
	    is[0] = anInt5296;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt5296 = 0;
	}
    }
    
    void method7971() {
	if (anInt5296 != 0) {
	    aClass185_Sub1_Sub2_5295.method18070(anInt5296, method7968());
	    anInt5296 = 0;
	}
    }
    
    void method7972() throws Throwable {
	method7969();
	super.finalize();
    }
    
    void method7973() throws Throwable {
	method7969();
	super.finalize();
    }
    
    void method7974() throws Throwable {
	method7969();
	super.finalize();
    }
    
    boolean method273() {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	int i = method7968();
	aClass185_Sub1_Sub2_5295.method14669(this);
	if (aClass185_Sub1_Sub2_5295.aBool11584)
	    OpenGL.glEnable(anInt5303);
	OpenGL.glGenerateMipmapEXT(anInt5303);
	if (aClass185_Sub1_Sub2_5295.aBool11584)
	    OpenGL.glDisable(anInt5303);
	aBool5300 = true;
	method7965();
	method7967(i);
	return true;
    }
    
    boolean method271() {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	int i = method7968();
	aClass185_Sub1_Sub2_5295.method14669(this);
	if (aClass185_Sub1_Sub2_5295.aBool11584)
	    OpenGL.glEnable(anInt5303);
	OpenGL.glGenerateMipmapEXT(anInt5303);
	if (aClass185_Sub1_Sub2_5295.aBool11584)
	    OpenGL.glDisable(anInt5303);
	aBool5300 = true;
	method7965();
	method7967(i);
	return true;
    }
    
    void method7975(int i) {
	aClass185_Sub1_Sub2_5295.anInt9135 -= i;
	aClass185_Sub1_Sub2_5295.anInt9135 += method7968();
    }
    
    public void method335() {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	int i = aClass185_Sub1_Sub2_5295.method14749();
	int i_40_ = aClass185_Sub1_Sub2_5295.anIntArray11601[i];
	if (i_40_ != anInt5303) {
	    if (i_40_ != 0) {
		OpenGL.glBindTexture(i_40_, 0);
		OpenGL.glDisable(i_40_);
	    }
	    OpenGL.glEnable(anInt5303);
	    aClass185_Sub1_Sub2_5295.anIntArray11601[i] = anInt5303;
	}
	OpenGL.glBindTexture(anInt5303, anInt5296);
    }
    
    public void method332() {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	int i = aClass185_Sub1_Sub2_5295.method14749();
	int i_41_ = aClass185_Sub1_Sub2_5295.anIntArray11601[i];
	if (i_41_ != anInt5303) {
	    if (i_41_ != 0) {
		OpenGL.glBindTexture(i_41_, 0);
		OpenGL.glDisable(i_41_);
	    }
	    OpenGL.glEnable(anInt5303);
	    aClass185_Sub1_Sub2_5295.anIntArray11601[i] = anInt5303;
	}
	OpenGL.glBindTexture(anInt5303, anInt5296);
    }
    
    void method7976() {
	if (anInt5296 != 0) {
	    aClass185_Sub1_Sub2_5295.method18070(anInt5296, method7968());
	    anInt5296 = 0;
	}
    }
    
    public void method334() {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	int i = aClass185_Sub1_Sub2_5295.method14749();
	int i_42_ = aClass185_Sub1_Sub2_5295.anIntArray11601[i];
	if (i_42_ != anInt5303) {
	    if (i_42_ != 0) {
		OpenGL.glBindTexture(i_42_, 0);
		OpenGL.glDisable(i_42_);
	    }
	    OpenGL.glEnable(anInt5303);
	    aClass185_Sub1_Sub2_5295.anIntArray11601[i] = anInt5303;
	}
	OpenGL.glBindTexture(anInt5303, anInt5296);
    }
    
    public void method144() {
	if (anInt5296 != 0) {
	    aClass185_Sub1_Sub2_5295.anInt9135 -= method7968();
	    int[] is = new int[1];
	    is[0] = anInt5296;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt5296 = 0;
	}
    }
    
    public void method337(Class372 class372) {
	if (aClass372_5302 != class372) {
	    aClass372_5302 = class372;
	    method7965();
	}
    }
    
    void method7977() {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	aClass185_Sub1_Sub2_5295.method14669(this);
	if (aClass372_5302 == Class372.aClass372_3888) {
	    OpenGL.glTexParameteri(anInt5303, 10241, aBool5300 ? 9987 : 9729);
	    OpenGL.glTexParameteri(anInt5303, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(anInt5303, 10241, aBool5300 ? 9984 : 9728);
	    OpenGL.glTexParameteri(anInt5303, 10240, 9728);
	}
    }
    
    void method7978() {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	aClass185_Sub1_Sub2_5295.method14669(this);
	if (aClass372_5302 == Class372.aClass372_3888) {
	    OpenGL.glTexParameteri(anInt5303, 10241, aBool5300 ? 9987 : 9729);
	    OpenGL.glTexParameteri(anInt5303, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(anInt5303, 10241, aBool5300 ? 9984 : 9728);
	    OpenGL.glTexParameteri(anInt5303, 10240, 9728);
	}
    }
    
    int method7979() {
	int i = (aClass181_5292.anInt1962 * 1676120375
		 * (aClass173_5291.anInt1825 * 1899960707) * anInt5299);
	return aBool5300 ? i * 4 / 3 : i;
    }
    
    void method7980(int i, int i_43_, int i_44_, int[] is) {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	if (i_43_ > 0 && !Class562.method9467(i_43_, 523803681))
	    throw new IllegalArgumentException("");
	if (i_44_ > 0 && !Class562.method9467(i_44_, -1406792392))
	    throw new IllegalArgumentException("");
	if (aClass181_5292 != Class181.aClass181_1952)
	    throw new IllegalArgumentException("");
	int i_45_ = 0;
	int i_46_ = i_43_ < i_44_ ? i_43_ : i_44_;
	int i_47_ = i_43_ >> 1;
	int i_48_ = i_44_ >> 1;
	int[] is_49_ = is;
	int[] is_50_ = new int[i_47_ * i_48_];
	for (;;) {
	    OpenGL.glTexImage2Di
		(i, i_45_,
		 Class185_Sub1_Sub2.method18075(aClass181_5292,
						aClass173_5291),
		 i_43_, i_44_, 0, 32993, aClass185_Sub1_Sub2_5295.anInt11590,
		 is_49_, 0);
	    if (i_46_ <= 1)
		break;
	    int i_51_ = 0;
	    int i_52_ = 0;
	    int i_53_ = i_52_ + i_43_;
	    for (int i_54_ = 0; i_54_ < i_48_; i_54_++) {
		for (int i_55_ = 0; i_55_ < i_47_; i_55_++) {
		    int i_56_ = is_49_[i_52_++];
		    int i_57_ = is_49_[i_52_++];
		    int i_58_ = is_49_[i_53_++];
		    int i_59_ = is_49_[i_53_++];
		    int i_60_ = i_56_ >> 24 & 0xff;
		    int i_61_ = i_56_ >> 16 & 0xff;
		    int i_62_ = i_56_ >> 8 & 0xff;
		    int i_63_ = i_56_ & 0xff;
		    i_60_ += i_57_ >> 24 & 0xff;
		    i_61_ += i_57_ >> 16 & 0xff;
		    i_62_ += i_57_ >> 8 & 0xff;
		    i_63_ += i_57_ & 0xff;
		    i_60_ += i_58_ >> 24 & 0xff;
		    i_61_ += i_58_ >> 16 & 0xff;
		    i_62_ += i_58_ >> 8 & 0xff;
		    i_63_ += i_58_ & 0xff;
		    i_60_ += i_59_ >> 24 & 0xff;
		    i_61_ += i_59_ >> 16 & 0xff;
		    i_62_ += i_59_ >> 8 & 0xff;
		    i_63_ += i_59_ & 0xff;
		    is_50_[i_51_++]
			= ((i_60_ & 0x3fc) << 22 | (i_61_ & 0x3fc) << 14
			   | (i_62_ & 0x3fc) << 6 | (i_63_ & 0x3fc) >> 2);
		}
		i_52_ += i_43_;
		i_53_ += i_43_;
	    }
	    int[] is_64_ = is_50_;
	    is_50_ = is_49_;
	    is_49_ = is_64_;
	    i_43_ = i_47_;
	    i_44_ = i_48_;
	    i_47_ >>= 1;
	    i_48_ >>= 1;
	    i_46_ >>= 1;
	    i_45_++;
	}
    }
    
    void method7981(int i, int i_65_, int i_66_, byte[] is) {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	if (i_65_ > 0 && !Class562.method9467(i_65_, -1086730862))
	    throw new IllegalArgumentException("");
	if (i_66_ > 0 && !Class562.method9467(i_66_, 1045010185))
	    throw new IllegalArgumentException("");
	int i_67_ = aClass181_5292.anInt1962 * 1676120375;
	int i_68_ = 0;
	int i_69_ = i_65_ < i_66_ ? i_65_ : i_66_;
	int i_70_ = i_65_ >> 1;
	int i_71_ = i_66_ >> 1;
	byte[] is_72_ = is;
	byte[] is_73_ = new byte[i_70_ * i_71_ * i_67_];
	for (;;) {
	    OpenGL.glTexImage2Dub
		(i, i_68_,
		 Class185_Sub1_Sub2.method18075(aClass181_5292,
						aClass173_5291),
		 i_65_, i_66_, 0,
		 Class185_Sub1_Sub2.method18097(aClass181_5292), 5121, is_72_,
		 0);
	    if (i_69_ <= 1)
		break;
	    int i_74_ = i_65_ * i_67_;
	    for (int i_75_ = 0; i_75_ < i_67_; i_75_++) {
		int i_76_ = i_75_;
		int i_77_ = i_75_;
		int i_78_ = i_77_ + i_74_;
		for (int i_79_ = 0; i_79_ < i_71_; i_79_++) {
		    for (int i_80_ = 0; i_80_ < i_70_; i_80_++) {
			int i_81_ = is_72_[i_77_];
			i_77_ += i_67_;
			i_81_ += is_72_[i_77_];
			i_77_ += i_67_;
			i_81_ += is_72_[i_78_];
			i_78_ += i_67_;
			i_81_ += is_72_[i_78_];
			i_78_ += i_67_;
			is_73_[i_76_] = (byte) (i_81_ >> 2);
			i_76_ += i_67_;
		    }
		    i_77_ += i_74_;
		    i_78_ += i_74_;
		}
	    }
	    byte[] is_82_ = is_73_;
	    is_73_ = is_72_;
	    is_72_ = is_82_;
	    i_65_ = i_70_;
	    i_66_ = i_71_;
	    i_70_ >>= 1;
	    i_71_ >>= 1;
	    i_69_ >>= 1;
	    i_68_++;
	}
    }
    
    void method7982(int i, int i_83_, int i_84_, byte[] is) {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	if (i_83_ > 0 && !Class562.method9467(i_83_, 764986177))
	    throw new IllegalArgumentException("");
	if (i_84_ > 0 && !Class562.method9467(i_84_, -436889454))
	    throw new IllegalArgumentException("");
	int i_85_ = aClass181_5292.anInt1962 * 1676120375;
	int i_86_ = 0;
	int i_87_ = i_83_ < i_84_ ? i_83_ : i_84_;
	int i_88_ = i_83_ >> 1;
	int i_89_ = i_84_ >> 1;
	byte[] is_90_ = is;
	byte[] is_91_ = new byte[i_88_ * i_89_ * i_85_];
	for (;;) {
	    OpenGL.glTexImage2Dub
		(i, i_86_,
		 Class185_Sub1_Sub2.method18075(aClass181_5292,
						aClass173_5291),
		 i_83_, i_84_, 0,
		 Class185_Sub1_Sub2.method18097(aClass181_5292), 5121, is_90_,
		 0);
	    if (i_87_ <= 1)
		break;
	    int i_92_ = i_83_ * i_85_;
	    for (int i_93_ = 0; i_93_ < i_85_; i_93_++) {
		int i_94_ = i_93_;
		int i_95_ = i_93_;
		int i_96_ = i_95_ + i_92_;
		for (int i_97_ = 0; i_97_ < i_89_; i_97_++) {
		    for (int i_98_ = 0; i_98_ < i_88_; i_98_++) {
			int i_99_ = is_90_[i_95_];
			i_95_ += i_85_;
			i_99_ += is_90_[i_95_];
			i_95_ += i_85_;
			i_99_ += is_90_[i_96_];
			i_96_ += i_85_;
			i_99_ += is_90_[i_96_];
			i_96_ += i_85_;
			is_91_[i_94_] = (byte) (i_99_ >> 2);
			i_94_ += i_85_;
		    }
		    i_95_ += i_92_;
		    i_96_ += i_92_;
		}
	    }
	    byte[] is_100_ = is_91_;
	    is_91_ = is_90_;
	    is_90_ = is_100_;
	    i_83_ = i_88_;
	    i_84_ = i_89_;
	    i_88_ >>= 1;
	    i_89_ >>= 1;
	    i_87_ >>= 1;
	    i_86_++;
	}
    }
    
    void method7983(int i, int i_101_, int i_102_, byte[] is) {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	if (i_101_ > 0 && !Class562.method9467(i_101_, 365425979))
	    throw new IllegalArgumentException("");
	if (i_102_ > 0 && !Class562.method9467(i_102_, 942292468))
	    throw new IllegalArgumentException("");
	int i_103_ = aClass181_5292.anInt1962 * 1676120375;
	int i_104_ = 0;
	int i_105_ = i_101_ < i_102_ ? i_101_ : i_102_;
	int i_106_ = i_101_ >> 1;
	int i_107_ = i_102_ >> 1;
	byte[] is_108_ = is;
	byte[] is_109_ = new byte[i_106_ * i_107_ * i_103_];
	for (;;) {
	    OpenGL.glTexImage2Dub
		(i, i_104_,
		 Class185_Sub1_Sub2.method18075(aClass181_5292,
						aClass173_5291),
		 i_101_, i_102_, 0,
		 Class185_Sub1_Sub2.method18097(aClass181_5292), 5121, is_108_,
		 0);
	    if (i_105_ <= 1)
		break;
	    int i_110_ = i_101_ * i_103_;
	    for (int i_111_ = 0; i_111_ < i_103_; i_111_++) {
		int i_112_ = i_111_;
		int i_113_ = i_111_;
		int i_114_ = i_113_ + i_110_;
		for (int i_115_ = 0; i_115_ < i_107_; i_115_++) {
		    for (int i_116_ = 0; i_116_ < i_106_; i_116_++) {
			int i_117_ = is_108_[i_113_];
			i_113_ += i_103_;
			i_117_ += is_108_[i_113_];
			i_113_ += i_103_;
			i_117_ += is_108_[i_114_];
			i_114_ += i_103_;
			i_117_ += is_108_[i_114_];
			i_114_ += i_103_;
			is_109_[i_112_] = (byte) (i_117_ >> 2);
			i_112_ += i_103_;
		    }
		    i_113_ += i_110_;
		    i_114_ += i_110_;
		}
	    }
	    byte[] is_118_ = is_109_;
	    is_109_ = is_108_;
	    is_108_ = is_118_;
	    i_101_ = i_106_;
	    i_102_ = i_107_;
	    i_106_ >>= 1;
	    i_107_ >>= 1;
	    i_105_ >>= 1;
	    i_104_++;
	}
    }
    
    void method7984(int i, int i_119_, int i_120_, float[] fs) {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	if (i_119_ > 0 && !Class562.method9467(i_119_, 104048312))
	    throw new IllegalArgumentException("");
	if (i_120_ > 0 && !Class562.method9467(i_120_, -835594696))
	    throw new IllegalArgumentException("");
	int i_121_ = aClass181_5292.anInt1962 * 1676120375;
	int i_122_ = 0;
	int i_123_ = i_119_ < i_120_ ? i_119_ : i_120_;
	int i_124_ = i_119_ >> 1;
	int i_125_ = i_120_ >> 1;
	float[] fs_126_ = fs;
	float[] fs_127_ = new float[i_124_ * i_125_ * i_121_];
	for (;;) {
	    OpenGL.glTexImage2Df
		(i, i_122_,
		 Class185_Sub1_Sub2.method18075(aClass181_5292,
						aClass173_5291),
		 i_119_, i_120_, 0,
		 Class185_Sub1_Sub2.method18097(aClass181_5292), 5126, fs_126_,
		 0);
	    if (i_123_ <= 1)
		break;
	    int i_128_ = i_119_ * i_121_;
	    for (int i_129_ = 0; i_129_ < i_121_; i_129_++) {
		int i_130_ = i_129_;
		int i_131_ = i_129_;
		int i_132_ = i_131_ + i_128_;
		for (int i_133_ = 0; i_133_ < i_125_; i_133_++) {
		    for (int i_134_ = 0; i_134_ < i_124_; i_134_++) {
			float f = fs_126_[i_131_];
			i_131_ += i_121_;
			f += fs_126_[i_131_];
			i_131_ += i_121_;
			f += fs_126_[i_132_];
			i_132_ += i_121_;
			f += fs_126_[i_132_];
			i_132_ += i_121_;
			fs_127_[i_130_] = f * 0.25F;
			i_130_ += i_121_;
		    }
		    i_131_ += i_128_;
		    i_132_ += i_128_;
		}
	    }
	    float[] fs_135_ = fs_127_;
	    fs_127_ = fs_126_;
	    fs_126_ = fs_135_;
	    i_119_ = i_124_;
	    i_120_ = i_125_;
	    i_124_ >>= 1;
	    i_125_ >>= 1;
	    i_123_ >>= 1;
	    i_122_++;
	}
    }
    
    public void method338(Class372 class372) {
	if (aClass372_5302 != class372) {
	    aClass372_5302 = class372;
	    method7965();
	}
    }
    
    void method7985(int i) {
	aClass185_Sub1_Sub2_5295.anInt9135 -= i;
	aClass185_Sub1_Sub2_5295.anInt9135 += method7968();
    }
    
    void method7986(int i, int i_136_, int i_137_, float[] fs) {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	if (i_136_ > 0 && !Class562.method9467(i_136_, 290818975))
	    throw new IllegalArgumentException("");
	if (i_137_ > 0 && !Class562.method9467(i_137_, 1484127276))
	    throw new IllegalArgumentException("");
	int i_138_ = aClass181_5292.anInt1962 * 1676120375;
	int i_139_ = 0;
	int i_140_ = i_136_ < i_137_ ? i_136_ : i_137_;
	int i_141_ = i_136_ >> 1;
	int i_142_ = i_137_ >> 1;
	float[] fs_143_ = fs;
	float[] fs_144_ = new float[i_141_ * i_142_ * i_138_];
	for (;;) {
	    OpenGL.glTexImage2Df
		(i, i_139_,
		 Class185_Sub1_Sub2.method18075(aClass181_5292,
						aClass173_5291),
		 i_136_, i_137_, 0,
		 Class185_Sub1_Sub2.method18097(aClass181_5292), 5126, fs_143_,
		 0);
	    if (i_140_ <= 1)
		break;
	    int i_145_ = i_136_ * i_138_;
	    for (int i_146_ = 0; i_146_ < i_138_; i_146_++) {
		int i_147_ = i_146_;
		int i_148_ = i_146_;
		int i_149_ = i_148_ + i_145_;
		for (int i_150_ = 0; i_150_ < i_142_; i_150_++) {
		    for (int i_151_ = 0; i_151_ < i_141_; i_151_++) {
			float f = fs_143_[i_148_];
			i_148_ += i_138_;
			f += fs_143_[i_148_];
			i_148_ += i_138_;
			f += fs_143_[i_149_];
			i_149_ += i_138_;
			f += fs_143_[i_149_];
			i_149_ += i_138_;
			fs_144_[i_147_] = f * 0.25F;
			i_147_ += i_138_;
		    }
		    i_148_ += i_145_;
		    i_149_ += i_145_;
		}
	    }
	    float[] fs_152_ = fs_144_;
	    fs_144_ = fs_143_;
	    fs_143_ = fs_152_;
	    i_136_ = i_141_;
	    i_137_ = i_142_;
	    i_141_ >>= 1;
	    i_142_ >>= 1;
	    i_140_ >>= 1;
	    i_139_++;
	}
    }
    
    Class486(Class185_Sub1_Sub2 class185_sub1_sub2, int i, Class181 class181,
	     Class173 class173, int i_153_, boolean bool) {
	aClass185_Sub1_Sub2_5295 = class185_sub1_sub2;
	anInt5303 = i;
	aClass181_5292 = class181;
	aClass173_5291 = class173;
	aBool5300 = bool;
	anInt5299 = i_153_;
	OpenGL.glGenTextures(1, anIntArray5301, 0);
	anInt5296 = anIntArray5301[0];
	method7965();
	method7967(0);
    }
    
    void method7987(int i, int i_154_, int i_155_, int[] is) {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	if (i_154_ > 0 && !Class562.method9467(i_154_, 140887905))
	    throw new IllegalArgumentException("");
	if (i_155_ > 0 && !Class562.method9467(i_155_, 2117471620))
	    throw new IllegalArgumentException("");
	if (aClass181_5292 != Class181.aClass181_1952)
	    throw new IllegalArgumentException("");
	int i_156_ = 0;
	int i_157_ = i_154_ < i_155_ ? i_154_ : i_155_;
	int i_158_ = i_154_ >> 1;
	int i_159_ = i_155_ >> 1;
	int[] is_160_ = is;
	int[] is_161_ = new int[i_158_ * i_159_];
	for (;;) {
	    OpenGL.glTexImage2Di
		(i, i_156_,
		 Class185_Sub1_Sub2.method18075(aClass181_5292,
						aClass173_5291),
		 i_154_, i_155_, 0, 32993, aClass185_Sub1_Sub2_5295.anInt11590,
		 is_160_, 0);
	    if (i_157_ <= 1)
		break;
	    int i_162_ = 0;
	    int i_163_ = 0;
	    int i_164_ = i_163_ + i_154_;
	    for (int i_165_ = 0; i_165_ < i_159_; i_165_++) {
		for (int i_166_ = 0; i_166_ < i_158_; i_166_++) {
		    int i_167_ = is_160_[i_163_++];
		    int i_168_ = is_160_[i_163_++];
		    int i_169_ = is_160_[i_164_++];
		    int i_170_ = is_160_[i_164_++];
		    int i_171_ = i_167_ >> 24 & 0xff;
		    int i_172_ = i_167_ >> 16 & 0xff;
		    int i_173_ = i_167_ >> 8 & 0xff;
		    int i_174_ = i_167_ & 0xff;
		    i_171_ += i_168_ >> 24 & 0xff;
		    i_172_ += i_168_ >> 16 & 0xff;
		    i_173_ += i_168_ >> 8 & 0xff;
		    i_174_ += i_168_ & 0xff;
		    i_171_ += i_169_ >> 24 & 0xff;
		    i_172_ += i_169_ >> 16 & 0xff;
		    i_173_ += i_169_ >> 8 & 0xff;
		    i_174_ += i_169_ & 0xff;
		    i_171_ += i_170_ >> 24 & 0xff;
		    i_172_ += i_170_ >> 16 & 0xff;
		    i_173_ += i_170_ >> 8 & 0xff;
		    i_174_ += i_170_ & 0xff;
		    is_161_[i_162_++]
			= ((i_171_ & 0x3fc) << 22 | (i_172_ & 0x3fc) << 14
			   | (i_173_ & 0x3fc) << 6 | (i_174_ & 0x3fc) >> 2);
		}
		i_163_ += i_154_;
		i_164_ += i_154_;
	    }
	    int[] is_175_ = is_161_;
	    is_161_ = is_160_;
	    is_160_ = is_175_;
	    i_154_ = i_158_;
	    i_155_ = i_159_;
	    i_158_ >>= 1;
	    i_159_ >>= 1;
	    i_157_ >>= 1;
	    i_156_++;
	}
    }
    
    public void method333() {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	int i = aClass185_Sub1_Sub2_5295.method14749();
	int i_176_ = aClass185_Sub1_Sub2_5295.anIntArray11601[i];
	if (i_176_ != anInt5303) {
	    if (i_176_ != 0) {
		OpenGL.glBindTexture(i_176_, 0);
		OpenGL.glDisable(i_176_);
	    }
	    OpenGL.glEnable(anInt5303);
	    aClass185_Sub1_Sub2_5295.anIntArray11601[i] = anInt5303;
	}
	OpenGL.glBindTexture(anInt5303, anInt5296);
    }
    
    void method7988(int i, int i_177_, int i_178_, byte[] is) {
	if (anInt5296 == 0)
	    throw new IllegalStateException("");
	if (i_177_ > 0 && !Class562.method9467(i_177_, 830920541))
	    throw new IllegalArgumentException("");
	if (i_178_ > 0 && !Class562.method9467(i_178_, 142676126))
	    throw new IllegalArgumentException("");
	int i_179_ = aClass181_5292.anInt1962 * 1676120375;
	int i_180_ = 0;
	int i_181_ = i_177_ < i_178_ ? i_177_ : i_178_;
	int i_182_ = i_177_ >> 1;
	int i_183_ = i_178_ >> 1;
	byte[] is_184_ = is;
	byte[] is_185_ = new byte[i_182_ * i_183_ * i_179_];
	for (;;) {
	    OpenGL.glTexImage2Dub
		(i, i_180_,
		 Class185_Sub1_Sub2.method18075(aClass181_5292,
						aClass173_5291),
		 i_177_, i_178_, 0,
		 Class185_Sub1_Sub2.method18097(aClass181_5292), 5121, is_184_,
		 0);
	    if (i_181_ <= 1)
		break;
	    int i_186_ = i_177_ * i_179_;
	    for (int i_187_ = 0; i_187_ < i_179_; i_187_++) {
		int i_188_ = i_187_;
		int i_189_ = i_187_;
		int i_190_ = i_189_ + i_186_;
		for (int i_191_ = 0; i_191_ < i_183_; i_191_++) {
		    for (int i_192_ = 0; i_192_ < i_182_; i_192_++) {
			int i_193_ = is_184_[i_189_];
			i_189_ += i_179_;
			i_193_ += is_184_[i_189_];
			i_189_ += i_179_;
			i_193_ += is_184_[i_190_];
			i_190_ += i_179_;
			i_193_ += is_184_[i_190_];
			i_190_ += i_179_;
			is_185_[i_188_] = (byte) (i_193_ >> 2);
			i_188_ += i_179_;
		    }
		    i_189_ += i_186_;
		    i_190_ += i_186_;
		}
	    }
	    byte[] is_194_ = is_185_;
	    is_185_ = is_184_;
	    is_184_ = is_194_;
	    i_177_ = i_182_;
	    i_178_ = i_183_;
	    i_182_ >>= 1;
	    i_183_ >>= 1;
	    i_181_ >>= 1;
	    i_180_++;
	}
    }
    
    void method7989() {
	if (anInt5296 != 0) {
	    aClass185_Sub1_Sub2_5295.method18070(anInt5296, method7968());
	    anInt5296 = 0;
	}
    }
}
