/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Class179 implements Interface25
{
    static double aDouble1854 = -1.0;
    static int[] anIntArray1855 = new int[256];
    
    float[] method2954(Class598 class598, int i, double d) {
	if (Class598.aClass598_7865 != class598)
	    return null;
	int[] is = method2957(class598, i, d);
	if (is == null)
	    return null;
	int[] is_0_ = null;
	byte[] is_1_ = method2955(Class598.aClass598_7866, i, 1957420989);
	if (null != is_1_) {
	    try {
		byte i_2_ = (byte) (is_1_[0] & 0xff);
		if (1 != i_2_)
		    return null;
		byte[] is_3_ = new byte[is_1_.length - 5];
		System.arraycopy(is_1_, 5, is_3_, 0, is_1_.length - 5);
		is_0_ = method2959(is_3_, false, 1084073177);
		for (int i_4_ = 0; i_4_ < is_0_.length; i_4_++)
		    is_0_[i_4_] = is_0_[i_4_] & 0xff;
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (null == is_0_)
	    is_0_ = new int[is.length];
	float[] fs = new float[is.length * 4];
	int i_5_ = 0;
	for (int i_6_ = 0; i_6_ < is.length; i_6_++) {
	    int i_7_ = is[i_6_];
	    int i_8_ = i_7_ >>> 24;
	    int i_9_ = (i_7_ & 0xff0000) >> 16;
	    int i_10_ = (i_7_ & 0xff00) >> 8;
	    int i_11_ = i_7_ & 0xff;
	    float f = 1.0F + 31.0F * (float) is_0_[i_6_] / 255.0F;
	    fs[i_5_++] = f * (float) i_9_ / 255.0F;
	    fs[i_5_++] = (float) i_10_ * f / 255.0F;
	    fs[i_5_++] = (float) i_11_ * f / 255.0F;
	    fs[i_5_++] = (float) i_8_ / 255.0F;
	}
	return fs;
    }
    
    abstract byte[] method2955(Class598 class598, int i, int i_12_);
    
    public int[] method150(Class598 class598, int i, float f, int i_13_,
			   int i_14_, boolean bool, int i_15_) {
	return method2957(class598, i, (double) f);
    }
    
    int[] method2956(Class598 class598, int i, double d) {
	int[] is = method2957(class598, i, d);
	if (null == is)
	    return null;
	for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
	    if (0 != (is[i_16_] & 0xffffff))
		is[i_16_] = is[i_16_] | ~0xffffff;
	    else
		is[i_16_] = is[i_16_] & 0xffffff;
	}
	return is;
    }
    
    int[] method2957(Class598 class598, int i, double d) {
	byte[] is = method2955(class598, i, 555631023);
	if (null == is)
	    return null;
	int[] is_17_;
	try {
	    byte i_18_ = (byte) (is[0] & 0xff);
	    if (Class598.aClass598_7864 == class598) {
		if (i_18_ != 6)
		    return null;
		int[] is_19_ = null;
		int i_20_ = 1;
		for (int i_21_ = 0; i_21_ < 6; i_21_++) {
		    int i_22_ = ((is[i_20_] & 0xff) << 24
				 | (is[1 + i_20_] & 0xff) << 16
				 | (is[2 + i_20_] & 0xff) << 8
				 | is[i_20_ + 3] & 0xff);
		    byte[] is_23_ = new byte[i_22_];
		    System.arraycopy(is, i_20_ + 4, is_23_, 0, i_22_);
		    int[] is_24_ = method2959(is_23_, false, 406559866);
		    if (0 == i_21_)
			is_19_ = new int[is_24_.length * 6];
		    System.arraycopy(is_24_, 0, is_19_, i_21_ * is_24_.length,
				     is_24_.length);
		    i_20_ += i_22_ + 4;
		}
		if (1.0 != d)
		    Class313.method5688(is_19_, d);
		return is_19_;
	    }
	    if (i_18_ != 1)
		return null;
	    byte[] is_25_ = new byte[is.length - 5];
	    System.arraycopy(is, 5, is_25_, 0, is.length - 5);
	    int[] is_26_ = method2959(is_25_, false, -617963596);
	    if (is_26_ == null)
		return null;
	    if (d != 1.0)
		Class313.method5688(is_26_, d);
	    is_17_ = is_26_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is_17_;
    }
    
    Class179() {
	/* empty */
    }
    
    public void method33(int i) {
	/* empty */
    }
    
    public int[] method149(Class598 class598, int i, float f, int i_27_,
			   int i_28_, boolean bool, int i_29_) {
	return method2956(class598, i, (double) f);
    }
    
    public static int[] method2958(BufferedImage bufferedimage) {
	if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
	    int[] is = null;
	    is = bufferedimage.getRaster().getPixels(0, 0,
						     bufferedimage.getWidth(),
						     bufferedimage.getHeight(),
						     is);
	    int[] is_30_
		= (new int
		   [bufferedimage.getWidth() * bufferedimage.getHeight()]);
	    if (bufferedimage.getType() == 10) {
		for (int i = 0; i < is_30_.length; i++)
		    is_30_[i]
			= (is[i] << 16) + (is[i] << 8) + is[i] + -16777216;
	    } else {
		for (int i = 0; i < is_30_.length; i++) {
		    int i_31_ = 2 * i;
		    is_30_[i] = ((is[i_31_] << 8) + (is[i_31_] << 16)
				 + ((is[1 + i_31_] << 24) + is[i_31_]));
		}
	    }
	    return is_30_;
	}
	return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(),
				    bufferedimage.getHeight(), null, 0,
				    bufferedimage.getWidth());
    }
    
    public float[] method151(Class598 class598, int i, float f, int i_32_,
			     int i_33_, boolean bool, int i_34_) {
	return method2954(class598, i, (double) f);
    }
    
    int[] method2959(byte[] is, boolean bool, int i) throws IOException {
	BufferedImage bufferedimage
	    = ImageIO.read(new ByteArrayInputStream(is));
	if (bufferedimage == null)
	    return null;
	int[] is_35_ = Class668.method11030(bufferedimage, (short) 896);
	if (bool) {
	    for (int i_36_ = bufferedimage.getHeight() - 1; i_36_ >= 0;
		 i_36_--) {
		int i_37_ = i_36_ * bufferedimage.getWidth();
		for (int i_38_ = (i_36_ + 1) * bufferedimage.getWidth();
		     i_37_ < i_38_; i_37_++) {
		    i_38_--;
		    int i_39_ = is_35_[i_37_];
		    is_35_[i_37_] = is_35_[i_38_];
		    is_35_[i_38_] = i_39_;
		}
	    }
	}
	return is_35_;
    }
    
    float[] method2960(Class598 class598, int i, double d) {
	if (Class598.aClass598_7865 != class598)
	    return null;
	int[] is = method2957(class598, i, d);
	if (is == null)
	    return null;
	int[] is_40_ = null;
	byte[] is_41_ = method2955(Class598.aClass598_7866, i, 1325710682);
	if (null != is_41_) {
	    try {
		byte i_42_ = (byte) (is_41_[0] & 0xff);
		if (1 != i_42_)
		    return null;
		byte[] is_43_ = new byte[is_41_.length - 5];
		System.arraycopy(is_41_, 5, is_43_, 0, is_41_.length - 5);
		is_40_ = method2959(is_43_, false, -115948739);
		for (int i_44_ = 0; i_44_ < is_40_.length; i_44_++)
		    is_40_[i_44_] = is_40_[i_44_] & 0xff;
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (null == is_40_)
	    is_40_ = new int[is.length];
	float[] fs = new float[is.length * 4];
	int i_45_ = 0;
	for (int i_46_ = 0; i_46_ < is.length; i_46_++) {
	    int i_47_ = is[i_46_];
	    int i_48_ = i_47_ >>> 24;
	    int i_49_ = (i_47_ & 0xff0000) >> 16;
	    int i_50_ = (i_47_ & 0xff00) >> 8;
	    int i_51_ = i_47_ & 0xff;
	    float f = 1.0F + 31.0F * (float) is_40_[i_46_] / 255.0F;
	    fs[i_45_++] = f * (float) i_49_ / 255.0F;
	    fs[i_45_++] = (float) i_50_ * f / 255.0F;
	    fs[i_45_++] = (float) i_51_ * f / 255.0F;
	    fs[i_45_++] = (float) i_48_ / 255.0F;
	}
	return fs;
    }
    
    public abstract boolean method152(Class598 class598, int i,
				      Class613 class613, float f, int i_52_,
				      int i_53_, boolean bool);
    
    public abstract boolean method157(Class598 class598, int i,
				      Class613 class613, float f, int i_54_,
				      int i_55_, boolean bool);
    
    abstract byte[] method2961(Class598 class598, int i);
    
    public int[] method154(Class598 class598, int i, float f, int i_56_,
			   int i_57_, boolean bool) {
	return method2957(class598, i, (double) f);
    }
    
    public void method159() {
	/* empty */
    }
    
    public static int[] method2962(BufferedImage bufferedimage) {
	if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
	    int[] is = null;
	    is = bufferedimage.getRaster().getPixels(0, 0,
						     bufferedimage.getWidth(),
						     bufferedimage.getHeight(),
						     is);
	    int[] is_58_
		= (new int
		   [bufferedimage.getWidth() * bufferedimage.getHeight()]);
	    if (bufferedimage.getType() == 10) {
		for (int i = 0; i < is_58_.length; i++)
		    is_58_[i]
			= (is[i] << 16) + (is[i] << 8) + is[i] + -16777216;
	    } else {
		for (int i = 0; i < is_58_.length; i++) {
		    int i_59_ = 2 * i;
		    is_58_[i] = ((is[i_59_] << 8) + (is[i_59_] << 16)
				 + ((is[1 + i_59_] << 24) + is[i_59_]));
		}
	    }
	    return is_58_;
	}
	return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(),
				    bufferedimage.getHeight(), null, 0,
				    bufferedimage.getWidth());
    }
    
    static void method2963(int[] is, double d) {
	if (d != aDouble1854) {
	    for (int i = 0; i < 256; i++) {
		int i_60_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
		anIntArray1855[i] = i_60_ > 255 ? 255 : i_60_;
	    }
	    aDouble1854 = d;
	}
	for (int i = 0; i < is.length; i++) {
	    int i_61_ = anIntArray1855[is[i] >> 16 & 0xff];
	    int i_62_ = anIntArray1855[is[i] >> 8 & 0xff];
	    int i_63_ = anIntArray1855[is[i] >> 0 & 0xff];
	    is[i] = is[i] & ~0xffffff | i_61_ << 16 | i_62_ << 8 | i_63_;
	}
    }
    
    int[] method2964(Class598 class598, int i, double d) {
	int[] is = method2957(class598, i, d);
	if (null == is)
	    return null;
	for (int i_64_ = 0; i_64_ < is.length; i_64_++) {
	    if (0 != (is[i_64_] & 0xffffff))
		is[i_64_] = is[i_64_] | ~0xffffff;
	    else
		is[i_64_] = is[i_64_] & 0xffffff;
	}
	return is;
    }
    
    int[] method2965(Class598 class598, int i, double d) {
	int[] is = method2957(class598, i, d);
	if (null == is)
	    return null;
	for (int i_65_ = 0; i_65_ < is.length; i_65_++) {
	    if (0 != (is[i_65_] & 0xffffff))
		is[i_65_] = is[i_65_] | ~0xffffff;
	    else
		is[i_65_] = is[i_65_] & 0xffffff;
	}
	return is;
    }
    
    int[] method2966(Class598 class598, int i, double d) {
	byte[] is = method2955(class598, i, 1927506870);
	if (null == is)
	    return null;
	int[] is_66_;
	try {
	    byte i_67_ = (byte) (is[0] & 0xff);
	    if (Class598.aClass598_7864 == class598) {
		if (i_67_ != 6)
		    return null;
		int[] is_68_ = null;
		int i_69_ = 1;
		for (int i_70_ = 0; i_70_ < 6; i_70_++) {
		    int i_71_ = ((is[i_69_] & 0xff) << 24
				 | (is[1 + i_69_] & 0xff) << 16
				 | (is[2 + i_69_] & 0xff) << 8
				 | is[i_69_ + 3] & 0xff);
		    byte[] is_72_ = new byte[i_71_];
		    System.arraycopy(is, i_69_ + 4, is_72_, 0, i_71_);
		    int[] is_73_ = method2959(is_72_, false, -1037740838);
		    if (0 == i_70_)
			is_68_ = new int[is_73_.length * 6];
		    System.arraycopy(is_73_, 0, is_68_, i_70_ * is_73_.length,
				     is_73_.length);
		    i_69_ += i_71_ + 4;
		}
		if (1.0 != d)
		    Class313.method5688(is_68_, d);
		return is_68_;
	    }
	    if (i_67_ != 1)
		return null;
	    byte[] is_74_ = new byte[is.length - 5];
	    System.arraycopy(is, 5, is_74_, 0, is.length - 5);
	    int[] is_75_ = method2959(is_74_, false, 1966283121);
	    if (is_75_ == null)
		return null;
	    if (d != 1.0)
		Class313.method5688(is_75_, d);
	    is_66_ = is_75_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is_66_;
    }
    
    int[] method2967(Class598 class598, int i, double d) {
	byte[] is = method2955(class598, i, -1414301135);
	if (null == is)
	    return null;
	int[] is_76_;
	try {
	    byte i_77_ = (byte) (is[0] & 0xff);
	    if (Class598.aClass598_7864 == class598) {
		if (i_77_ != 6)
		    return null;
		int[] is_78_ = null;
		int i_79_ = 1;
		for (int i_80_ = 0; i_80_ < 6; i_80_++) {
		    int i_81_ = ((is[i_79_] & 0xff) << 24
				 | (is[1 + i_79_] & 0xff) << 16
				 | (is[2 + i_79_] & 0xff) << 8
				 | is[i_79_ + 3] & 0xff);
		    byte[] is_82_ = new byte[i_81_];
		    System.arraycopy(is, i_79_ + 4, is_82_, 0, i_81_);
		    int[] is_83_ = method2959(is_82_, false, -677018572);
		    if (0 == i_80_)
			is_78_ = new int[is_83_.length * 6];
		    System.arraycopy(is_83_, 0, is_78_, i_80_ * is_83_.length,
				     is_83_.length);
		    i_79_ += i_81_ + 4;
		}
		if (1.0 != d)
		    Class313.method5688(is_78_, d);
		return is_78_;
	    }
	    if (i_77_ != 1)
		return null;
	    byte[] is_84_ = new byte[is.length - 5];
	    System.arraycopy(is, 5, is_84_, 0, is.length - 5);
	    int[] is_85_ = method2959(is_84_, false, 605562958);
	    if (is_85_ == null)
		return null;
	    if (d != 1.0)
		Class313.method5688(is_85_, d);
	    is_76_ = is_85_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is_76_;
    }
    
    float[] method2968(Class598 class598, int i, double d) {
	if (Class598.aClass598_7865 != class598)
	    return null;
	int[] is = method2957(class598, i, d);
	if (is == null)
	    return null;
	int[] is_86_ = null;
	byte[] is_87_ = method2955(Class598.aClass598_7866, i, 466594397);
	if (null != is_87_) {
	    try {
		byte i_88_ = (byte) (is_87_[0] & 0xff);
		if (1 != i_88_)
		    return null;
		byte[] is_89_ = new byte[is_87_.length - 5];
		System.arraycopy(is_87_, 5, is_89_, 0, is_87_.length - 5);
		is_86_ = method2959(is_89_, false, 2119052333);
		for (int i_90_ = 0; i_90_ < is_86_.length; i_90_++)
		    is_86_[i_90_] = is_86_[i_90_] & 0xff;
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (null == is_86_)
	    is_86_ = new int[is.length];
	float[] fs = new float[is.length * 4];
	int i_91_ = 0;
	for (int i_92_ = 0; i_92_ < is.length; i_92_++) {
	    int i_93_ = is[i_92_];
	    int i_94_ = i_93_ >>> 24;
	    int i_95_ = (i_93_ & 0xff0000) >> 16;
	    int i_96_ = (i_93_ & 0xff00) >> 8;
	    int i_97_ = i_93_ & 0xff;
	    float f = 1.0F + 31.0F * (float) is_86_[i_92_] / 255.0F;
	    fs[i_91_++] = f * (float) i_95_ / 255.0F;
	    fs[i_91_++] = (float) i_96_ * f / 255.0F;
	    fs[i_91_++] = (float) i_97_ * f / 255.0F;
	    fs[i_91_++] = (float) i_94_ / 255.0F;
	}
	return fs;
    }
    
    static void method2969(int[] is, double d) {
	if (d != aDouble1854) {
	    for (int i = 0; i < 256; i++) {
		int i_98_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
		anIntArray1855[i] = i_98_ > 255 ? 255 : i_98_;
	    }
	    aDouble1854 = d;
	}
	for (int i = 0; i < is.length; i++) {
	    int i_99_ = anIntArray1855[is[i] >> 16 & 0xff];
	    int i_100_ = anIntArray1855[is[i] >> 8 & 0xff];
	    int i_101_ = anIntArray1855[is[i] >> 0 & 0xff];
	    is[i] = is[i] & ~0xffffff | i_99_ << 16 | i_100_ << 8 | i_101_;
	}
    }
    
    public float[] method148(Class598 class598, int i, float f, int i_102_,
			     int i_103_, boolean bool) {
	return method2954(class598, i, (double) f);
    }
    
    public int[] method153(Class598 class598, int i, float f, int i_104_,
			   int i_105_, boolean bool) {
	return method2956(class598, i, (double) f);
    }
    
    public int[] method156(Class598 class598, int i, float f, int i_106_,
			   int i_107_, boolean bool) {
	return method2956(class598, i, (double) f);
    }
    
    public int[] method158(Class598 class598, int i, float f, int i_108_,
			   int i_109_, boolean bool) {
	return method2957(class598, i, (double) f);
    }
    
    static void method2970(int[] is, double d) {
	if (d != aDouble1854) {
	    for (int i = 0; i < 256; i++) {
		int i_110_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
		anIntArray1855[i] = i_110_ > 255 ? 255 : i_110_;
	    }
	    aDouble1854 = d;
	}
	for (int i = 0; i < is.length; i++) {
	    int i_111_ = anIntArray1855[is[i] >> 16 & 0xff];
	    int i_112_ = anIntArray1855[is[i] >> 8 & 0xff];
	    int i_113_ = anIntArray1855[is[i] >> 0 & 0xff];
	    is[i] = is[i] & ~0xffffff | i_111_ << 16 | i_112_ << 8 | i_113_;
	}
    }
    
    public abstract boolean method155(Class598 class598, int i,
				      Class613 class613, float f, int i_114_,
				      int i_115_, boolean bool, int i_116_);
    
    abstract byte[] method2971(Class598 class598, int i);
    
    int[] method2972(byte[] is, boolean bool) throws IOException {
	BufferedImage bufferedimage
	    = ImageIO.read(new ByteArrayInputStream(is));
	if (bufferedimage == null)
	    return null;
	int[] is_117_ = Class668.method11030(bufferedimage, (short) 896);
	if (bool) {
	    for (int i = bufferedimage.getHeight() - 1; i >= 0; i--) {
		int i_118_ = i * bufferedimage.getWidth();
		for (int i_119_ = (i + 1) * bufferedimage.getWidth();
		     i_118_ < i_119_; i_118_++) {
		    i_119_--;
		    int i_120_ = is_117_[i_118_];
		    is_117_[i_118_] = is_117_[i_119_];
		    is_117_[i_119_] = i_120_;
		}
	    }
	}
	return is_117_;
    }
    
    int[] method2973(byte[] is, boolean bool) throws IOException {
	BufferedImage bufferedimage
	    = ImageIO.read(new ByteArrayInputStream(is));
	if (bufferedimage == null)
	    return null;
	int[] is_121_ = Class668.method11030(bufferedimage, (short) 896);
	if (bool) {
	    for (int i = bufferedimage.getHeight() - 1; i >= 0; i--) {
		int i_122_ = i * bufferedimage.getWidth();
		for (int i_123_ = (i + 1) * bufferedimage.getWidth();
		     i_122_ < i_123_; i_122_++) {
		    i_123_--;
		    int i_124_ = is_121_[i_122_];
		    is_121_[i_122_] = is_121_[i_123_];
		    is_121_[i_123_] = i_124_;
		}
	    }
	}
	return is_121_;
    }
    
    static final void method2974(Class669 class669, byte i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub12_10753,
	     (class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]) == 1 ? 1 : 0,
	     -409305499);
	Class635.method10538(-1957920360);
	client.aClass512_11100.method8501((byte) 10).method10157(760891231);
	Class672.method11096((byte) 1);
	client.aBool11048 = false;
    }
    
    public static final void method2975(int i, int i_125_, int i_126_,
					int i_127_, int i_128_, boolean bool,
					int i_129_) {
	Class200_Sub8.anInt9909 = i * -827897067;
	Class200_Sub9.anInt9916 = i_125_ * 1775664559;
	Class453_Sub2.anInt10347 = -180780363 * i_126_;
	Class42.anInt321 = -2035229685 * i_127_;
	Class110.anInt1345 = i_128_ * -161837411;
	if (Class10.anInt75 * -891094135 == 3)
	    Class79.method1621(1420018753);
	if (bool && Class110.anInt1345 * -579311691 >= 100) {
	    Class200_Sub13.anInt9937
		= Class200_Sub8.anInt9909 * 514687488 + 329831680;
	    Class636.anInt8305
		= 1581550848 + -392624640 * Class200_Sub9.anInt9916;
	    Class677.anInt8654
		= (Class247.method4595(-116109187 * Class200_Sub13.anInt9937,
				       -1098179003 * Class636.anInt8305,
				       Class674.anInt8633 * -878424575,
				       -306083300)
		   - -2055021667 * Class453_Sub2.anInt10347) * 996845503;
	}
	Class10.anInt75 = 1301785316;
	Class106.anInt1312 = 309821991;
	Class93.anInt901 = 1899572639;
    }
}
