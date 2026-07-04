/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public abstract class Class141
{
    static final int anInt1620 = 32879;
    static final int anInt1621 = 3553;
    static int[] anIntArray1622 = new int[1];
    int anInt1623;
    boolean aBool1624;
    static final int anInt1625 = 3552;
    Class185_Sub3 aClass185_Sub3_1626;
    static final int anInt1627 = 34037;
    int anInt1628;
    Class181 aClass181_1629;
    Class173 aClass173_1630;
    static final int anInt1631 = 34067;
    boolean aBool1632 = false;
    int anInt1633;
    static final int anInt1634 = 5121;
    
    boolean method2364() {
	if (aClass185_Sub3_1626.aBool9685) {
	    int i = method2390();
	    aClass185_Sub3_1626.method15231(this);
	    OpenGL.glGenerateMipmapEXT(anInt1628);
	    aBool1624 = true;
	    method2365();
	    method2370(i);
	    return true;
	}
	return false;
    }
    
    Class141(Class185_Sub3 class185_sub3, int i, Class181 class181,
	     Class173 class173, int i_0_, boolean bool) {
	aClass185_Sub3_1626 = class185_sub3;
	anInt1628 = i;
	aClass181_1629 = class181;
	aClass173_1630 = class173;
	aBool1624 = bool;
	anInt1623 = i_0_;
	OpenGL.glGenTextures(1, anIntArray1622, 0);
	anInt1633 = anIntArray1622[0];
	method2370(0);
    }
    
    void method2365() {
	aClass185_Sub3_1626.method15231(this);
	if (aBool1632) {
	    OpenGL.glTexParameteri(anInt1628, 10241, aBool1624 ? 9987 : 9729);
	    OpenGL.glTexParameteri(anInt1628, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(anInt1628, 10241, aBool1624 ? 9984 : 9728);
	    OpenGL.glTexParameteri(anInt1628, 10240, 9728);
	}
    }
    
    boolean method2366() {
	if (aClass185_Sub3_1626.aBool9685) {
	    int i = method2390();
	    aClass185_Sub3_1626.method15231(this);
	    OpenGL.glGenerateMipmapEXT(anInt1628);
	    aBool1624 = true;
	    method2365();
	    method2370(i);
	    return true;
	}
	return false;
    }
    
    void method2367(boolean bool) {
	if (aBool1624 != bool) {
	    int i = method2390();
	    aBool1624 = true;
	    method2365();
	    method2370(i);
	}
    }
    
    void method2368() {
	if (anInt1633 != 0) {
	    aClass185_Sub3_1626.anInt9699 -= method2390();
	    int[] is = new int[1];
	    is[0] = anInt1633;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt1633 = 0;
	}
    }
    
    void method2369() {
	if (anInt1633 != 0) {
	    aClass185_Sub3_1626.method15360(anInt1633, method2390());
	    anInt1633 = 0;
	}
    }
    
    public void finalize() throws Throwable {
	method2369();
	super.finalize();
    }
    
    void method2370(int i) {
	aClass185_Sub3_1626.anInt9699 -= i;
	aClass185_Sub3_1626.anInt9699 += method2390();
    }
    
    void method2371() {
	aClass185_Sub3_1626.method15231(this);
	if (aBool1632) {
	    OpenGL.glTexParameteri(anInt1628, 10241, aBool1624 ? 9987 : 9729);
	    OpenGL.glTexParameteri(anInt1628, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(anInt1628, 10241, aBool1624 ? 9984 : 9728);
	    OpenGL.glTexParameteri(anInt1628, 10240, 9728);
	}
    }
    
    static void method2372(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			   int i_5_, int[] is) {
	if (i_2_ > 0 && !Class562.method9467(i_2_, 1545168809))
	    throw new IllegalArgumentException("");
	if (i_3_ > 0 && !Class562.method9467(i_3_, -297197288))
	    throw new IllegalArgumentException("");
	if (i_4_ != 32993)
	    throw new IllegalArgumentException("");
	int i_6_ = 0;
	int i_7_ = i_2_ < i_3_ ? i_2_ : i_3_;
	int i_8_ = i_2_ >> 1;
	int i_9_ = i_3_ >> 1;
	int[] is_10_ = is;
	int[] is_11_ = new int[i_8_ * i_9_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_6_, i_1_, i_2_, i_3_, 0, i_4_, i_5_,
				 is_10_, 0);
	    if (i_7_ <= 1)
		break;
	    int i_12_ = 0;
	    int i_13_ = 0;
	    int i_14_ = i_13_ + i_2_;
	    for (int i_15_ = 0; i_15_ < i_9_; i_15_++) {
		for (int i_16_ = 0; i_16_ < i_8_; i_16_++) {
		    int i_17_ = is_10_[i_13_++];
		    int i_18_ = is_10_[i_13_++];
		    int i_19_ = is_10_[i_14_++];
		    int i_20_ = is_10_[i_14_++];
		    int i_21_ = i_17_ >> 24 & 0xff;
		    int i_22_ = i_17_ >> 16 & 0xff;
		    int i_23_ = i_17_ >> 8 & 0xff;
		    int i_24_ = i_17_ & 0xff;
		    i_21_ += i_18_ >> 24 & 0xff;
		    i_22_ += i_18_ >> 16 & 0xff;
		    i_23_ += i_18_ >> 8 & 0xff;
		    i_24_ += i_18_ & 0xff;
		    i_21_ += i_19_ >> 24 & 0xff;
		    i_22_ += i_19_ >> 16 & 0xff;
		    i_23_ += i_19_ >> 8 & 0xff;
		    i_24_ += i_19_ & 0xff;
		    i_21_ += i_20_ >> 24 & 0xff;
		    i_22_ += i_20_ >> 16 & 0xff;
		    i_23_ += i_20_ >> 8 & 0xff;
		    i_24_ += i_20_ & 0xff;
		    is_11_[i_12_++]
			= ((i_21_ & 0x3fc) << 22 | (i_22_ & 0x3fc) << 14
			   | (i_23_ & 0x3fc) << 6 | (i_24_ & 0x3fc) >> 2);
		}
		i_13_ += i_2_;
		i_14_ += i_2_;
	    }
	    int[] is_25_ = is_11_;
	    is_11_ = is_10_;
	    is_10_ = is_25_;
	    i_2_ = i_8_;
	    i_3_ = i_9_;
	    i_8_ >>= 1;
	    i_9_ >>= 1;
	    i_7_ >>= 1;
	    i_6_++;
	}
    }
    
    static void method2373(int i, int i_26_, int i_27_, int i_28_,
			   Class181 class181, byte[] is) {
	if (i_27_ > 0 && !Class562.method9467(i_27_, 2045796052))
	    throw new IllegalArgumentException("");
	if (i_28_ > 0 && !Class562.method9467(i_28_, 1342657670))
	    throw new IllegalArgumentException("");
	int i_29_ = class181.anInt1962 * 1676120375;
	int i_30_ = 0;
	int i_31_ = i_27_ < i_28_ ? i_27_ : i_28_;
	int i_32_ = i_27_ >> 1;
	int i_33_ = i_28_ >> 1;
	byte[] is_34_ = is;
	byte[] is_35_ = new byte[i_32_ * i_33_ * i_29_];
	for (;;) {
	    OpenGL.glTexImage2Dub(i, i_30_, i_26_, i_27_, i_28_, 0,
				  Class185_Sub3.method15256(class181), 5121,
				  is_34_, 0);
	    if (i_31_ <= 1)
		break;
	    int i_36_ = i_27_ * i_29_;
	    for (int i_37_ = 0; i_37_ < i_29_; i_37_++) {
		int i_38_ = i_37_;
		int i_39_ = i_37_;
		int i_40_ = i_39_ + i_36_;
		for (int i_41_ = 0; i_41_ < i_33_; i_41_++) {
		    for (int i_42_ = 0; i_42_ < i_32_; i_42_++) {
			int i_43_ = is_34_[i_39_];
			i_39_ += i_29_;
			i_43_ += is_34_[i_39_];
			i_39_ += i_29_;
			i_43_ += is_34_[i_40_];
			i_40_ += i_29_;
			i_43_ += is_34_[i_40_];
			i_40_ += i_29_;
			is_35_[i_38_] = (byte) (i_43_ >> 2);
			i_38_ += i_29_;
		    }
		    i_39_ += i_36_;
		    i_40_ += i_36_;
		}
	    }
	    byte[] is_44_ = is_35_;
	    is_35_ = is_34_;
	    is_34_ = is_44_;
	    i_27_ = i_32_;
	    i_28_ = i_33_;
	    i_32_ >>= 1;
	    i_33_ >>= 1;
	    i_31_ >>= 1;
	    i_30_++;
	}
    }
    
    static void method2374(int i, int i_45_, int i_46_, int i_47_,
			   Class181 class181, float[] fs) {
	if (i_46_ > 0 && !Class562.method9467(i_46_, 1813952197))
	    throw new IllegalArgumentException("");
	if (i_47_ > 0 && !Class562.method9467(i_47_, 55243189))
	    throw new IllegalArgumentException("");
	int i_48_ = class181.anInt1962 * 1676120375;
	int i_49_ = 0;
	int i_50_ = i_46_ < i_47_ ? i_46_ : i_47_;
	int i_51_ = i_46_ >> 1;
	int i_52_ = i_47_ >> 1;
	float[] fs_53_ = fs;
	float[] fs_54_ = new float[i_51_ * i_52_ * i_48_];
	for (;;) {
	    OpenGL.glTexImage2Df(i, i_49_, i_45_, i_46_, i_47_, 0,
				 Class185_Sub3.method15256(class181), 5126,
				 fs_53_, 0);
	    if (i_50_ <= 1)
		break;
	    int i_55_ = i_46_ * i_48_;
	    for (int i_56_ = 0; i_56_ < i_48_; i_56_++) {
		int i_57_ = i_56_;
		int i_58_ = i_56_;
		int i_59_ = i_58_ + i_55_;
		for (int i_60_ = 0; i_60_ < i_52_; i_60_++) {
		    for (int i_61_ = 0; i_61_ < i_51_; i_61_++) {
			float f = fs_53_[i_58_];
			i_58_ += i_48_;
			f += fs_53_[i_58_];
			i_58_ += i_48_;
			f += fs_53_[i_59_];
			i_59_ += i_48_;
			f += fs_53_[i_59_];
			i_59_ += i_48_;
			fs_54_[i_57_] = f * 0.25F;
			i_57_ += i_48_;
		    }
		    i_58_ += i_55_;
		    i_59_ += i_55_;
		}
	    }
	    float[] fs_62_ = fs_54_;
	    fs_54_ = fs_53_;
	    fs_53_ = fs_62_;
	    i_46_ = i_51_;
	    i_47_ = i_52_;
	    i_51_ >>= 1;
	    i_52_ >>= 1;
	    i_50_ >>= 1;
	    i_49_++;
	}
    }
    
    void method2375() throws Throwable {
	method2369();
	super.finalize();
    }
    
    void method2376() throws Throwable {
	method2369();
	super.finalize();
    }
    
    void method2377() throws Throwable {
	method2369();
	super.finalize();
    }
    
    boolean method2378() {
	if (aClass185_Sub3_1626.aBool9685) {
	    int i = method2390();
	    aClass185_Sub3_1626.method15231(this);
	    OpenGL.glGenerateMipmapEXT(anInt1628);
	    aBool1624 = true;
	    method2365();
	    method2370(i);
	    return true;
	}
	return false;
    }
    
    void method2379() {
	aClass185_Sub3_1626.method15231(this);
	if (aBool1632) {
	    OpenGL.glTexParameteri(anInt1628, 10241, aBool1624 ? 9987 : 9729);
	    OpenGL.glTexParameteri(anInt1628, 10240, 9729);
	} else {
	    OpenGL.glTexParameteri(anInt1628, 10241, aBool1624 ? 9984 : 9728);
	    OpenGL.glTexParameteri(anInt1628, 10240, 9728);
	}
    }
    
    void method2380() {
	if (anInt1633 != 0) {
	    aClass185_Sub3_1626.anInt9699 -= method2390();
	    int[] is = new int[1];
	    is[0] = anInt1633;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt1633 = 0;
	}
    }
    
    static void method2381(int i, int i_63_, int i_64_, int i_65_, int i_66_,
			   int i_67_, int[] is) {
	if (i_64_ > 0 && !Class562.method9467(i_64_, 922795418))
	    throw new IllegalArgumentException("");
	if (i_65_ > 0 && !Class562.method9467(i_65_, -928807310))
	    throw new IllegalArgumentException("");
	if (i_66_ != 32993)
	    throw new IllegalArgumentException("");
	int i_68_ = 0;
	int i_69_ = i_64_ < i_65_ ? i_64_ : i_65_;
	int i_70_ = i_64_ >> 1;
	int i_71_ = i_65_ >> 1;
	int[] is_72_ = is;
	int[] is_73_ = new int[i_70_ * i_71_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_68_, i_63_, i_64_, i_65_, 0, i_66_,
				 i_67_, is_72_, 0);
	    if (i_69_ <= 1)
		break;
	    int i_74_ = 0;
	    int i_75_ = 0;
	    int i_76_ = i_75_ + i_64_;
	    for (int i_77_ = 0; i_77_ < i_71_; i_77_++) {
		for (int i_78_ = 0; i_78_ < i_70_; i_78_++) {
		    int i_79_ = is_72_[i_75_++];
		    int i_80_ = is_72_[i_75_++];
		    int i_81_ = is_72_[i_76_++];
		    int i_82_ = is_72_[i_76_++];
		    int i_83_ = i_79_ >> 24 & 0xff;
		    int i_84_ = i_79_ >> 16 & 0xff;
		    int i_85_ = i_79_ >> 8 & 0xff;
		    int i_86_ = i_79_ & 0xff;
		    i_83_ += i_80_ >> 24 & 0xff;
		    i_84_ += i_80_ >> 16 & 0xff;
		    i_85_ += i_80_ >> 8 & 0xff;
		    i_86_ += i_80_ & 0xff;
		    i_83_ += i_81_ >> 24 & 0xff;
		    i_84_ += i_81_ >> 16 & 0xff;
		    i_85_ += i_81_ >> 8 & 0xff;
		    i_86_ += i_81_ & 0xff;
		    i_83_ += i_82_ >> 24 & 0xff;
		    i_84_ += i_82_ >> 16 & 0xff;
		    i_85_ += i_82_ >> 8 & 0xff;
		    i_86_ += i_82_ & 0xff;
		    is_73_[i_74_++]
			= ((i_83_ & 0x3fc) << 22 | (i_84_ & 0x3fc) << 14
			   | (i_85_ & 0x3fc) << 6 | (i_86_ & 0x3fc) >> 2);
		}
		i_75_ += i_64_;
		i_76_ += i_64_;
	    }
	    int[] is_87_ = is_73_;
	    is_73_ = is_72_;
	    is_72_ = is_87_;
	    i_64_ = i_70_;
	    i_65_ = i_71_;
	    i_70_ >>= 1;
	    i_71_ >>= 1;
	    i_69_ >>= 1;
	    i_68_++;
	}
    }
    
    void method2382(boolean bool) {
	if (aBool1632 != bool) {
	    aBool1632 = bool;
	    method2365();
	}
    }
    
    boolean method2383() {
	if (aClass185_Sub3_1626.aBool9685) {
	    int i = method2390();
	    aClass185_Sub3_1626.method15231(this);
	    OpenGL.glGenerateMipmapEXT(anInt1628);
	    aBool1624 = true;
	    method2365();
	    method2370(i);
	    return true;
	}
	return false;
    }
    
    void method2384(boolean bool) {
	if (aBool1624 != bool) {
	    int i = method2390();
	    aBool1624 = true;
	    method2365();
	    method2370(i);
	}
    }
    
    void method2385(boolean bool) {
	if (aBool1632 != bool) {
	    aBool1632 = bool;
	    method2365();
	}
    }
    
    void method2386(boolean bool) {
	if (aBool1624 != bool) {
	    int i = method2390();
	    aBool1624 = true;
	    method2365();
	    method2370(i);
	}
    }
    
    void method2387(boolean bool) {
	if (aBool1624 != bool) {
	    int i = method2390();
	    aBool1624 = true;
	    method2365();
	    method2370(i);
	}
    }
    
    static void method2388(int i, int i_88_, int i_89_, int i_90_,
			   Class181 class181, float[] fs) {
	if (i_89_ > 0 && !Class562.method9467(i_89_, 874615035))
	    throw new IllegalArgumentException("");
	if (i_90_ > 0 && !Class562.method9467(i_90_, 158435867))
	    throw new IllegalArgumentException("");
	int i_91_ = class181.anInt1962 * 1676120375;
	int i_92_ = 0;
	int i_93_ = i_89_ < i_90_ ? i_89_ : i_90_;
	int i_94_ = i_89_ >> 1;
	int i_95_ = i_90_ >> 1;
	float[] fs_96_ = fs;
	float[] fs_97_ = new float[i_94_ * i_95_ * i_91_];
	for (;;) {
	    OpenGL.glTexImage2Df(i, i_92_, i_88_, i_89_, i_90_, 0,
				 Class185_Sub3.method15256(class181), 5126,
				 fs_96_, 0);
	    if (i_93_ <= 1)
		break;
	    int i_98_ = i_89_ * i_91_;
	    for (int i_99_ = 0; i_99_ < i_91_; i_99_++) {
		int i_100_ = i_99_;
		int i_101_ = i_99_;
		int i_102_ = i_101_ + i_98_;
		for (int i_103_ = 0; i_103_ < i_95_; i_103_++) {
		    for (int i_104_ = 0; i_104_ < i_94_; i_104_++) {
			float f = fs_96_[i_101_];
			i_101_ += i_91_;
			f += fs_96_[i_101_];
			i_101_ += i_91_;
			f += fs_96_[i_102_];
			i_102_ += i_91_;
			f += fs_96_[i_102_];
			i_102_ += i_91_;
			fs_97_[i_100_] = f * 0.25F;
			i_100_ += i_91_;
		    }
		    i_101_ += i_98_;
		    i_102_ += i_98_;
		}
	    }
	    float[] fs_105_ = fs_97_;
	    fs_97_ = fs_96_;
	    fs_96_ = fs_105_;
	    i_89_ = i_94_;
	    i_90_ = i_95_;
	    i_94_ >>= 1;
	    i_95_ >>= 1;
	    i_93_ >>= 1;
	    i_92_++;
	}
    }
    
    static void method2389(int i, int i_106_, int i_107_, int i_108_,
			   Class181 class181, byte[] is) {
	if (i_107_ > 0 && !Class562.method9467(i_107_, -1306088253))
	    throw new IllegalArgumentException("");
	if (i_108_ > 0 && !Class562.method9467(i_108_, 1609338559))
	    throw new IllegalArgumentException("");
	int i_109_ = class181.anInt1962 * 1676120375;
	int i_110_ = 0;
	int i_111_ = i_107_ < i_108_ ? i_107_ : i_108_;
	int i_112_ = i_107_ >> 1;
	int i_113_ = i_108_ >> 1;
	byte[] is_114_ = is;
	byte[] is_115_ = new byte[i_112_ * i_113_ * i_109_];
	for (;;) {
	    OpenGL.glTexImage2Dub(i, i_110_, i_106_, i_107_, i_108_, 0,
				  Class185_Sub3.method15256(class181), 5121,
				  is_114_, 0);
	    if (i_111_ <= 1)
		break;
	    int i_116_ = i_107_ * i_109_;
	    for (int i_117_ = 0; i_117_ < i_109_; i_117_++) {
		int i_118_ = i_117_;
		int i_119_ = i_117_;
		int i_120_ = i_119_ + i_116_;
		for (int i_121_ = 0; i_121_ < i_113_; i_121_++) {
		    for (int i_122_ = 0; i_122_ < i_112_; i_122_++) {
			int i_123_ = is_114_[i_119_];
			i_119_ += i_109_;
			i_123_ += is_114_[i_119_];
			i_119_ += i_109_;
			i_123_ += is_114_[i_120_];
			i_120_ += i_109_;
			i_123_ += is_114_[i_120_];
			i_120_ += i_109_;
			is_115_[i_118_] = (byte) (i_123_ >> 2);
			i_118_ += i_109_;
		    }
		    i_119_ += i_116_;
		    i_120_ += i_116_;
		}
	    }
	    byte[] is_124_ = is_115_;
	    is_115_ = is_114_;
	    is_114_ = is_124_;
	    i_107_ = i_112_;
	    i_108_ = i_113_;
	    i_112_ >>= 1;
	    i_113_ >>= 1;
	    i_111_ >>= 1;
	    i_110_++;
	}
    }
    
    int method2390() {
	int i = (aClass181_1629.anInt1962 * 1676120375
		 * (aClass173_1630.anInt1825 * 1899960707) * anInt1623);
	return aBool1624 ? i * 4 / 3 : i;
    }
    
    void method2391() {
	if (anInt1633 != 0) {
	    aClass185_Sub3_1626.anInt9699 -= method2390();
	    int[] is = new int[1];
	    is[0] = anInt1633;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt1633 = 0;
	}
    }
    
    void method2392(int i) {
	aClass185_Sub3_1626.anInt9699 -= i;
	aClass185_Sub3_1626.anInt9699 += method2390();
    }
    
    void method2393(int i) {
	aClass185_Sub3_1626.anInt9699 -= i;
	aClass185_Sub3_1626.anInt9699 += method2390();
    }
    
    void method2394(int i) {
	aClass185_Sub3_1626.anInt9699 -= i;
	aClass185_Sub3_1626.anInt9699 += method2390();
    }
    
    int method2395() {
	int i = (aClass181_1629.anInt1962 * 1676120375
		 * (aClass173_1630.anInt1825 * 1899960707) * anInt1623);
	return aBool1624 ? i * 4 / 3 : i;
    }
    
    int method2396() {
	int i = (aClass181_1629.anInt1962 * 1676120375
		 * (aClass173_1630.anInt1825 * 1899960707) * anInt1623);
	return aBool1624 ? i * 4 / 3 : i;
    }
    
    void method2397() {
	if (anInt1633 != 0) {
	    aClass185_Sub3_1626.method15360(anInt1633, method2390());
	    anInt1633 = 0;
	}
    }
    
    void method2398() {
	if (anInt1633 != 0) {
	    aClass185_Sub3_1626.anInt9699 -= method2390();
	    int[] is = new int[1];
	    is[0] = anInt1633;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt1633 = 0;
	}
    }
    
    static void method2399(int i, int i_125_, int i_126_, int i_127_,
			   Class181 class181, byte[] is) {
	if (i_126_ > 0 && !Class562.method9467(i_126_, -785997436))
	    throw new IllegalArgumentException("");
	if (i_127_ > 0 && !Class562.method9467(i_127_, 1934243405))
	    throw new IllegalArgumentException("");
	int i_128_ = class181.anInt1962 * 1676120375;
	int i_129_ = 0;
	int i_130_ = i_126_ < i_127_ ? i_126_ : i_127_;
	int i_131_ = i_126_ >> 1;
	int i_132_ = i_127_ >> 1;
	byte[] is_133_ = is;
	byte[] is_134_ = new byte[i_131_ * i_132_ * i_128_];
	for (;;) {
	    OpenGL.glTexImage2Dub(i, i_129_, i_125_, i_126_, i_127_, 0,
				  Class185_Sub3.method15256(class181), 5121,
				  is_133_, 0);
	    if (i_130_ <= 1)
		break;
	    int i_135_ = i_126_ * i_128_;
	    for (int i_136_ = 0; i_136_ < i_128_; i_136_++) {
		int i_137_ = i_136_;
		int i_138_ = i_136_;
		int i_139_ = i_138_ + i_135_;
		for (int i_140_ = 0; i_140_ < i_132_; i_140_++) {
		    for (int i_141_ = 0; i_141_ < i_131_; i_141_++) {
			int i_142_ = is_133_[i_138_];
			i_138_ += i_128_;
			i_142_ += is_133_[i_138_];
			i_138_ += i_128_;
			i_142_ += is_133_[i_139_];
			i_139_ += i_128_;
			i_142_ += is_133_[i_139_];
			i_139_ += i_128_;
			is_134_[i_137_] = (byte) (i_142_ >> 2);
			i_137_ += i_128_;
		    }
		    i_138_ += i_135_;
		    i_139_ += i_135_;
		}
	    }
	    byte[] is_143_ = is_134_;
	    is_134_ = is_133_;
	    is_133_ = is_143_;
	    i_126_ = i_131_;
	    i_127_ = i_132_;
	    i_131_ >>= 1;
	    i_132_ >>= 1;
	    i_130_ >>= 1;
	    i_129_++;
	}
    }
    
    static void method2400(int i, int i_144_, int i_145_, int i_146_,
			   int i_147_, int i_148_, int[] is) {
	if (i_145_ > 0 && !Class562.method9467(i_145_, 1693641463))
	    throw new IllegalArgumentException("");
	if (i_146_ > 0 && !Class562.method9467(i_146_, 1403196430))
	    throw new IllegalArgumentException("");
	if (i_147_ != 32993)
	    throw new IllegalArgumentException("");
	int i_149_ = 0;
	int i_150_ = i_145_ < i_146_ ? i_145_ : i_146_;
	int i_151_ = i_145_ >> 1;
	int i_152_ = i_146_ >> 1;
	int[] is_153_ = is;
	int[] is_154_ = new int[i_151_ * i_152_];
	for (;;) {
	    OpenGL.glTexImage2Di(i, i_149_, i_144_, i_145_, i_146_, 0, i_147_,
				 i_148_, is_153_, 0);
	    if (i_150_ <= 1)
		break;
	    int i_155_ = 0;
	    int i_156_ = 0;
	    int i_157_ = i_156_ + i_145_;
	    for (int i_158_ = 0; i_158_ < i_152_; i_158_++) {
		for (int i_159_ = 0; i_159_ < i_151_; i_159_++) {
		    int i_160_ = is_153_[i_156_++];
		    int i_161_ = is_153_[i_156_++];
		    int i_162_ = is_153_[i_157_++];
		    int i_163_ = is_153_[i_157_++];
		    int i_164_ = i_160_ >> 24 & 0xff;
		    int i_165_ = i_160_ >> 16 & 0xff;
		    int i_166_ = i_160_ >> 8 & 0xff;
		    int i_167_ = i_160_ & 0xff;
		    i_164_ += i_161_ >> 24 & 0xff;
		    i_165_ += i_161_ >> 16 & 0xff;
		    i_166_ += i_161_ >> 8 & 0xff;
		    i_167_ += i_161_ & 0xff;
		    i_164_ += i_162_ >> 24 & 0xff;
		    i_165_ += i_162_ >> 16 & 0xff;
		    i_166_ += i_162_ >> 8 & 0xff;
		    i_167_ += i_162_ & 0xff;
		    i_164_ += i_163_ >> 24 & 0xff;
		    i_165_ += i_163_ >> 16 & 0xff;
		    i_166_ += i_163_ >> 8 & 0xff;
		    i_167_ += i_163_ & 0xff;
		    is_154_[i_155_++]
			= ((i_164_ & 0x3fc) << 22 | (i_165_ & 0x3fc) << 14
			   | (i_166_ & 0x3fc) << 6 | (i_167_ & 0x3fc) >> 2);
		}
		i_156_ += i_145_;
		i_157_ += i_145_;
	    }
	    int[] is_168_ = is_154_;
	    is_154_ = is_153_;
	    is_153_ = is_168_;
	    i_145_ = i_151_;
	    i_146_ = i_152_;
	    i_151_ >>= 1;
	    i_152_ >>= 1;
	    i_150_ >>= 1;
	    i_149_++;
	}
    }
    
    void method2401() {
	if (anInt1633 != 0) {
	    aClass185_Sub3_1626.anInt9699 -= method2390();
	    int[] is = new int[1];
	    is[0] = anInt1633;
	    OpenGL.glDeleteTextures(1, is, 0);
	    anInt1633 = 0;
	}
    }
    
    static void method2402(int i, int i_169_, int i_170_, int i_171_,
			   Class181 class181, float[] fs) {
	if (i_170_ > 0 && !Class562.method9467(i_170_, -702058767))
	    throw new IllegalArgumentException("");
	if (i_171_ > 0 && !Class562.method9467(i_171_, -1148131366))
	    throw new IllegalArgumentException("");
	int i_172_ = class181.anInt1962 * 1676120375;
	int i_173_ = 0;
	int i_174_ = i_170_ < i_171_ ? i_170_ : i_171_;
	int i_175_ = i_170_ >> 1;
	int i_176_ = i_171_ >> 1;
	float[] fs_177_ = fs;
	float[] fs_178_ = new float[i_175_ * i_176_ * i_172_];
	for (;;) {
	    OpenGL.glTexImage2Df(i, i_173_, i_169_, i_170_, i_171_, 0,
				 Class185_Sub3.method15256(class181), 5126,
				 fs_177_, 0);
	    if (i_174_ <= 1)
		break;
	    int i_179_ = i_170_ * i_172_;
	    for (int i_180_ = 0; i_180_ < i_172_; i_180_++) {
		int i_181_ = i_180_;
		int i_182_ = i_180_;
		int i_183_ = i_182_ + i_179_;
		for (int i_184_ = 0; i_184_ < i_176_; i_184_++) {
		    for (int i_185_ = 0; i_185_ < i_175_; i_185_++) {
			float f = fs_177_[i_182_];
			i_182_ += i_172_;
			f += fs_177_[i_182_];
			i_182_ += i_172_;
			f += fs_177_[i_183_];
			i_183_ += i_172_;
			f += fs_177_[i_183_];
			i_183_ += i_172_;
			fs_178_[i_181_] = f * 0.25F;
			i_181_ += i_172_;
		    }
		    i_182_ += i_179_;
		    i_183_ += i_179_;
		}
	    }
	    float[] fs_186_ = fs_178_;
	    fs_178_ = fs_177_;
	    fs_177_ = fs_186_;
	    i_170_ = i_175_;
	    i_171_ = i_176_;
	    i_175_ >>= 1;
	    i_176_ >>= 1;
	    i_174_ >>= 1;
	    i_173_++;
	}
    }
    
    static void method2403(int i, int i_187_, int i_188_, int i_189_,
			   Class181 class181, float[] fs) {
	if (i_188_ > 0 && !Class562.method9467(i_188_, 2042441531))
	    throw new IllegalArgumentException("");
	if (i_189_ > 0 && !Class562.method9467(i_189_, 2117548375))
	    throw new IllegalArgumentException("");
	int i_190_ = class181.anInt1962 * 1676120375;
	int i_191_ = 0;
	int i_192_ = i_188_ < i_189_ ? i_188_ : i_189_;
	int i_193_ = i_188_ >> 1;
	int i_194_ = i_189_ >> 1;
	float[] fs_195_ = fs;
	float[] fs_196_ = new float[i_193_ * i_194_ * i_190_];
	for (;;) {
	    OpenGL.glTexImage2Df(i, i_191_, i_187_, i_188_, i_189_, 0,
				 Class185_Sub3.method15256(class181), 5126,
				 fs_195_, 0);
	    if (i_192_ <= 1)
		break;
	    int i_197_ = i_188_ * i_190_;
	    for (int i_198_ = 0; i_198_ < i_190_; i_198_++) {
		int i_199_ = i_198_;
		int i_200_ = i_198_;
		int i_201_ = i_200_ + i_197_;
		for (int i_202_ = 0; i_202_ < i_194_; i_202_++) {
		    for (int i_203_ = 0; i_203_ < i_193_; i_203_++) {
			float f = fs_195_[i_200_];
			i_200_ += i_190_;
			f += fs_195_[i_200_];
			i_200_ += i_190_;
			f += fs_195_[i_201_];
			i_201_ += i_190_;
			f += fs_195_[i_201_];
			i_201_ += i_190_;
			fs_196_[i_199_] = f * 0.25F;
			i_199_ += i_190_;
		    }
		    i_200_ += i_197_;
		    i_201_ += i_197_;
		}
	    }
	    float[] fs_204_ = fs_196_;
	    fs_196_ = fs_195_;
	    fs_195_ = fs_204_;
	    i_188_ = i_193_;
	    i_189_ = i_194_;
	    i_193_ >>= 1;
	    i_194_ >>= 1;
	    i_192_ >>= 1;
	    i_191_++;
	}
    }
}
