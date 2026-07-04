/* Class420_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

public class Class420_Sub2 extends Class420 implements Interface38
{
    boolean aBool10255;
    int anInt10256;
    float aFloat10257;
    float aFloat10258;
    int anInt10259;
    boolean aBool10260;
    
    public int method253() {
	return anInt10256;
    }
    
    Class420_Sub2(Class185_Sub1_Sub1 class185_sub1_sub1, Class181 class181,
		  Class173 class173, int i, int i_0_, int i_1_, int i_2_) {
	super(class185_sub1_sub1, class181, class173, false, i * i_0_);
	if (!aClass185_Sub1_Sub1_4709.aBool11526) {
	    anInt10259 = Class162.method2640(i, (byte) 61);
	    anInt10256 = Class162.method2640(i_0_, (byte) 27);
	    aFloat10257 = (float) i / (float) anInt10259;
	    aFloat10258 = (float) i_0_ / (float) anInt10256;
	} else {
	    anInt10259 = i;
	    anInt10256 = i_0_;
	    aFloat10257 = 1.0F;
	    aFloat10258 = 1.0F;
	}
	aLong4705
	    = (IDirect3DDevice.CreateTexture
	       (aClass185_Sub1_Sub1_4709.aLong11541, anInt10259, anInt10256, 0,
		i_1_,
		Class185_Sub1_Sub1.method18014(aClass181_4706, aClass173_4707),
		i_2_));
    }
    
    Class420_Sub2(Class185_Sub1_Sub1 class185_sub1_sub1, int i, int i_3_,
		  boolean bool, int[] is, int i_4_, int i_5_) {
	super(class185_sub1_sub1, Class181.aClass181_1952,
	      Class173.aClass173_1830, bool && class185_sub1_sub1.aBool11527,
	      i * i_3_);
	if (!aClass185_Sub1_Sub1_4709.aBool11526) {
	    anInt10259 = Class162.method2640(i, (byte) 65);
	    anInt10256 = Class162.method2640(i_3_, (byte) 107);
	    aFloat10257 = (float) i / (float) anInt10259;
	    aFloat10258 = (float) i_3_ / (float) anInt10256;
	    if (i != anInt10259 || i_3_ != anInt10256) {
		is = aClass185_Sub1_Sub1_4709.method3368(i, i_3_, anInt10259,
							 anInt10256, is, i_4_,
							 i_5_, (byte) 126);
		i_4_ = 0;
		i_5_ = anInt10259;
	    }
	} else {
	    anInt10259 = i;
	    anInt10256 = i_3_;
	    aFloat10257 = 1.0F;
	    aFloat10258 = 1.0F;
	}
	if (bool)
	    aLong4705 = IDirect3DDevice.CreateTexture((aClass185_Sub1_Sub1_4709
						       .aLong11541),
						      anInt10259, anInt10256,
						      0, 1024, 21, 1);
	else
	    aLong4705 = IDirect3DDevice.CreateTexture((aClass185_Sub1_Sub1_4709
						       .aLong11541),
						      anInt10259, anInt10256,
						      1, 0, 21, 1);
	if (i_5_ == 0)
	    i_5_ = anInt10259;
	aClass185_Sub1_Sub1_4709.method14586(i_5_ * anInt10256
					     * (aClass181_4706.anInt1962
						* 1676120375));
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_4_, i_5_ * anInt10256);
	IDirect3DTexture.Upload(aLong4705, 0, 0, 0, anInt10259, anInt10256,
				i_5_ * (aClass181_4706.anInt1962 * 1676120375),
				0, aClass185_Sub1_Sub1_4709.aLong9139);
    }
    
    public boolean method260() {
	return true;
    }
    
    Class420_Sub2(Class185_Sub1_Sub1 class185_sub1_sub1, Class181 class181,
		  int i, int i_6_, boolean bool, float[] fs, int i_7_,
		  int i_8_) {
	super(class185_sub1_sub1, class181, Class173.aClass173_1830,
	      bool && class185_sub1_sub1.aBool11527, i * i_6_);
	if (!aClass185_Sub1_Sub1_4709.aBool11526) {
	    anInt10259 = Class162.method2640(i, (byte) 38);
	    anInt10256 = Class162.method2640(i_6_, (byte) 84);
	    aFloat10257 = (float) i / (float) anInt10259;
	    aFloat10258 = (float) i_6_ / (float) anInt10256;
	    if (i != anInt10259 || i_6_ != anInt10256) {
		fs = aClass185_Sub1_Sub1_4709.method3369(i, i_6_, anInt10259,
							 anInt10256, fs, i_7_,
							 i_8_,
							 (class181.anInt1962
							  * 1676120375),
							 639238427);
		i_7_ = 0;
		i_8_ = anInt10259;
	    }
	} else {
	    anInt10259 = i;
	    anInt10256 = i_6_;
	    aFloat10257 = 1.0F;
	    aFloat10258 = 1.0F;
	}
	if (bool)
	    aLong4705
		= (IDirect3DDevice.CreateTexture
		   (aClass185_Sub1_Sub1_4709.aLong11541, anInt10259,
		    anInt10256, 0, 1024,
		    Class185_Sub1_Sub1.method18014(aClass181_4706,
						   Class173.aClass173_1826),
		    1));
	else
	    aLong4705
		= (IDirect3DDevice.CreateTexture
		   (aClass185_Sub1_Sub1_4709.aLong11541, anInt10259,
		    anInt10256, 1, 0,
		    Class185_Sub1_Sub1.method18014(aClass181_4706,
						   Class173.aClass173_1826),
		    1));
	if (i_8_ == 0)
	    i_8_ = anInt10259;
	aClass185_Sub1_Sub1_4709.method14586(i_8_ * anInt10256
					     * (aClass181_4706.anInt1962
						* 1676120375)
					     * 4);
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	bytebuffer.asFloatBuffer().put(fs, i_7_, (i_8_ * anInt10256
						  * (aClass181_4706.anInt1962
						     * 1676120375)));
	IDirect3DTexture.Upload(aLong4705, 0, 0, 0, anInt10259, anInt10256,
				(i_8_ * (aClass181_4706.anInt1962 * 1676120375)
				 * 4),
				0, aClass185_Sub1_Sub1_4709.aLong9139);
    }
    
    public void method264(int i, int i_9_, int i_10_, int i_11_, byte[] is,
			  Class181 class181, int i_12_, int i_13_) {
	if (aClass181_4706 != class181
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	if (i_13_ == 0)
	    i_13_ = i_10_;
	aClass185_Sub1_Sub1_4709.method14586(i_13_ * i_11_
					     * (aClass181_4706.anInt1962
						* 1676120375));
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	bytebuffer.put(is, i_12_, i_13_ * i_11_);
	IDirect3DTexture.Upload(aLong4705, 0, i, i_9_, i_10_, i_11_,
				i_13_ * (aClass181_4706.anInt1962
					 * 1676120375),
				0, aClass185_Sub1_Sub1_4709.aLong9139);
    }
    
    public int method93() {
	return anInt10256;
    }
    
    public int method251() {
	return anInt10259;
    }
    
    public float method272() {
	return aFloat10258;
    }
    
    public float method250() {
	return aFloat10257;
    }
    
    public void method261(int i, int i_14_, int i_15_, int i_16_, byte[] is,
			  Class181 class181, int i_17_, int i_18_) {
	if (aClass181_4706 != class181
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	if (i_18_ == 0)
	    i_18_ = i_15_;
	aClass185_Sub1_Sub1_4709.method14586(i_18_ * i_16_
					     * (aClass181_4706.anInt1962
						* 1676120375));
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	bytebuffer.put(is, i_17_, i_18_ * i_16_);
	IDirect3DTexture.Upload(aLong4705, 0, i, i_14_, i_15_, i_16_,
				i_18_ * (aClass181_4706.anInt1962
					 * 1676120375),
				0, aClass185_Sub1_Sub1_4709.aLong9139);
    }
    
    public boolean method204() {
	return true;
    }
    
    long method6771() {
	return aLong4705;
    }
    
    public void method339(Class372 class372) {
	super.method339(class372);
    }
    
    public void method257(boolean bool, boolean bool_19_) {
	aBool10255 = bool;
	aBool10260 = bool_19_;
    }
    
    public boolean method270() {
	return false;
    }
    
    public void method244(int i, int i_20_, int i_21_, int i_22_, byte[] is,
			  Class181 class181, int i_23_, int i_24_) {
	if (aClass181_4706 != class181
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	if (i_24_ == 0)
	    i_24_ = i_21_;
	aClass185_Sub1_Sub1_4709.method14586(i_24_ * i_22_
					     * (aClass181_4706.anInt1962
						* 1676120375));
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	bytebuffer.put(is, i_23_, i_24_ * i_22_);
	IDirect3DTexture.Upload(aLong4705, 0, i, i_20_, i_21_, i_22_,
				i_24_ * (aClass181_4706.anInt1962
					 * 1676120375),
				0, aClass185_Sub1_Sub1_4709.aLong9139);
    }
    
    public void method335() {
	aClass185_Sub1_Sub1_4709.method18050(this);
    }
    
    public void method262(int i, int i_25_, int i_26_, int i_27_, int[] is,
			  int[] is_28_, int i_29_) {
	if (aClass181_4706 != Class181.aClass181_1952
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	method262(i, i_25_, i_26_, i_27_, is, null, i_29_);
    }
    
    public void method247(int i, int i_30_, int i_31_, int i_32_, int i_33_,
			  int i_34_) {
	int[] is
	    = aClass185_Sub1_Sub1_4709.method3267(i_33_, i_34_, i_31_, i_32_);
	if (is != null) {
	    for (int i_35_ = 0; i_35_ < is.length; i_35_++)
		is[i_35_] |= ~0xffffff;
	    method269(i, i_30_, i_31_, i_32_, is, 0, i_31_);
	}
    }
    
    public void method333() {
	aClass185_Sub1_Sub1_4709.method18050(this);
    }
    
    public void method246(int i, int i_36_, int i_37_, int i_38_, int[] is,
			  int i_39_) {
	if (aClass181_4706 != Class181.aClass181_1952
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	aClass185_Sub1_Sub1_4709.method14586(i_37_ * i_38_ * 4);
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	IDirect3DTexture.Download(aLong4705, 0, i, i_36_, i_37_, i_38_,
				  i_37_ * 4, 0,
				  aClass185_Sub1_Sub1_4709.aLong9139);
	bytebuffer.asIntBuffer().get(is, i_39_, i_37_ * i_38_);
    }
    
    public int method254() {
	return anInt10256;
    }
    
    public void method142() {
	super.method142();
    }
    
    public void method259(int i, int i_40_, int i_41_, int i_42_, int[] is,
			  int i_43_, int i_44_) {
	if (aClass181_4706 != Class181.aClass181_1952
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	if (i_44_ == 0)
	    i_44_ = i_41_;
	aClass185_Sub1_Sub1_4709.method14586(i_44_ * i_42_
					     * (aClass181_4706.anInt1962
						* 1676120375));
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_43_, i_44_ * i_42_);
	IDirect3DTexture.Upload(aLong4705, 0, i, i_40_, i_41_, i_42_,
				i_44_ * (aClass181_4706.anInt1962
					 * 1676120375),
				0, aClass185_Sub1_Sub1_4709.aLong9139);
    }
    
    public void method144() {
	super.method142();
    }
    
    public boolean method271() {
	return false;
    }
    
    public int method252() {
	return anInt10259;
    }
    
    Class420_Sub2(Class185_Sub1_Sub1 class185_sub1_sub1, Class181 class181,
		  int i, int i_45_, boolean bool, byte[] is, int i_46_,
		  int i_47_) {
	super(class185_sub1_sub1, class181, Class173.aClass173_1830,
	      bool && class185_sub1_sub1.aBool11527, i * i_45_);
	if (!aClass185_Sub1_Sub1_4709.aBool11526) {
	    anInt10259 = Class162.method2640(i, (byte) 18);
	    anInt10256 = Class162.method2640(i_45_, (byte) 55);
	    aFloat10257 = (float) i / (float) anInt10259;
	    aFloat10258 = (float) i_45_ / (float) anInt10256;
	    if (i != anInt10259 || i_45_ != anInt10256) {
		is = aClass185_Sub1_Sub1_4709.method3370(i, i_45_, anInt10259,
							 anInt10256, is, i_46_,
							 i_47_,
							 (class181.anInt1962
							  * 1676120375),
							 (byte) 10);
		i_46_ = 0;
		i_47_ = anInt10259;
	    }
	} else {
	    anInt10259 = i;
	    anInt10256 = i_45_;
	    aFloat10257 = 1.0F;
	    aFloat10258 = 1.0F;
	}
	if (bool)
	    aLong4705
		= (IDirect3DDevice.CreateTexture
		   (aClass185_Sub1_Sub1_4709.aLong11541, anInt10259,
		    anInt10256, 0, 1024,
		    Class185_Sub1_Sub1.method18014(aClass181_4706,
						   Class173.aClass173_1830),
		    1));
	else
	    aLong4705
		= (IDirect3DDevice.CreateTexture
		   (aClass185_Sub1_Sub1_4709.aLong11541, anInt10259,
		    anInt10256, 1, 0,
		    Class185_Sub1_Sub1.method18014(aClass181_4706,
						   Class173.aClass173_1830),
		    1));
	if (i_47_ == 0)
	    i_47_ = anInt10259;
	aClass185_Sub1_Sub1_4709.method14586(i_47_ * anInt10256
					     * (aClass181_4706.anInt1962
						* 1676120375));
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	if (aClass181_4706 == Class181.aClass181_1958) {
	    bytebuffer.put(is, i_46_, anInt10256 * anInt10259 / 2);
	    IDirect3DTexture.Upload(aLong4705, 0, 0, 0, anInt10259,
				    anInt10256 / 4, anInt10259 / 4 * 8, 0,
				    aClass185_Sub1_Sub1_4709.aLong9139);
	} else if (aClass181_4706 == Class181.aClass181_1960) {
	    bytebuffer.put(is, i_46_, anInt10256 * anInt10259);
	    IDirect3DTexture.Upload(aLong4705, 0, 0, 0, anInt10259,
				    anInt10256 / 4, anInt10259 / 4 * 16, 0,
				    aClass185_Sub1_Sub1_4709.aLong9139);
	} else {
	    bytebuffer.put(is, i_46_, i_47_ * anInt10256);
	    IDirect3DTexture.Upload(aLong4705, 0, 0, 0, anInt10259, anInt10256,
				    i_47_ * (aClass181_4706.anInt1962
					     * 1676120375),
				    0, aClass185_Sub1_Sub1_4709.aLong9139);
	}
    }
    
    public void method141() {
	super.method142();
    }
    
    public float method255(float f) {
	return f / (float) anInt10259;
    }
    
    public float method256(float f) {
	return f / (float) anInt10256;
    }
    
    public float method249() {
	return aFloat10258;
    }
    
    public void method242(boolean bool, boolean bool_48_) {
	aBool10255 = bool;
	aBool10260 = bool_48_;
    }
    
    Class420_Sub2(Class185_Sub1_Sub1 class185_sub1_sub1, Class181 class181,
		  Class173 class173, int i, int i_49_) {
	this(class185_sub1_sub1, class181, class173, i, i_49_, 0, 1);
    }
    
    public void method265(int i, int i_50_, int i_51_, int i_52_, byte[] is,
			  Class181 class181, int i_53_, int i_54_) {
	if (aClass181_4706 != class181
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	if (i_54_ == 0)
	    i_54_ = i_51_;
	aClass185_Sub1_Sub1_4709.method14586(i_54_ * i_52_
					     * (aClass181_4706.anInt1962
						* 1676120375));
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	bytebuffer.put(is, i_53_, i_54_ * i_52_);
	IDirect3DTexture.Upload(aLong4705, 0, i, i_50_, i_51_, i_52_,
				i_54_ * (aClass181_4706.anInt1962
					 * 1676120375),
				0, aClass185_Sub1_Sub1_4709.aLong9139);
    }
    
    public void method269(int i, int i_55_, int i_56_, int i_57_, int[] is,
			  int i_58_, int i_59_) {
	if (aClass181_4706 != Class181.aClass181_1952
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	if (i_59_ == 0)
	    i_59_ = i_56_;
	aClass185_Sub1_Sub1_4709.method14586(i_59_ * i_57_
					     * (aClass181_4706.anInt1962
						* 1676120375));
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	bytebuffer.asIntBuffer().put(is, i_58_, i_59_ * i_57_);
	IDirect3DTexture.Upload(aLong4705, 0, i, i_55_, i_56_, i_57_,
				i_59_ * (aClass181_4706.anInt1962
					 * 1676120375),
				0, aClass185_Sub1_Sub1_4709.aLong9139);
    }
    
    public void method258(int i, int i_60_, int i_61_, int i_62_, byte[] is,
			  Class181 class181, int i_63_, int i_64_) {
	if (aClass181_4706 != class181
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	if (i_64_ == 0)
	    i_64_ = i_61_;
	aClass185_Sub1_Sub1_4709.method14586(i_64_ * i_62_
					     * (aClass181_4706.anInt1962
						* 1676120375));
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	bytebuffer.put(is, i_63_, i_64_ * i_62_);
	IDirect3DTexture.Upload(aLong4705, 0, i, i_60_, i_61_, i_62_,
				i_64_ * (aClass181_4706.anInt1962
					 * 1676120375),
				0, aClass185_Sub1_Sub1_4709.aLong9139);
    }
    
    public void method263(int i, int i_65_, int i_66_, int i_67_, byte[] is,
			  Class181 class181, int i_68_, int i_69_) {
	if (aClass181_4706 != class181
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	if (i_69_ == 0)
	    i_69_ = i_66_;
	aClass185_Sub1_Sub1_4709.method14586(i_69_ * i_67_
					     * (aClass181_4706.anInt1962
						* 1676120375));
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	bytebuffer.put(is, i_68_, i_69_ * i_67_);
	IDirect3DTexture.Upload(aLong4705, 0, i, i_65_, i_66_, i_67_,
				i_69_ * (aClass181_4706.anInt1962
					 * 1676120375),
				0, aClass185_Sub1_Sub1_4709.aLong9139);
    }
    
    public void method143() {
	super.method142();
    }
    
    public void method243(int i, int i_70_, int i_71_, int i_72_, int[] is,
			  int i_73_) {
	if (aClass181_4706 != Class181.aClass181_1952
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	aClass185_Sub1_Sub1_4709.method14586(i_71_ * i_72_ * 4);
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	IDirect3DTexture.Download(aLong4705, 0, i, i_70_, i_71_, i_72_,
				  i_71_ * 4, 0,
				  aClass185_Sub1_Sub1_4709.aLong9139);
	bytebuffer.asIntBuffer().get(is, i_73_, i_71_ * i_72_);
    }
    
    public void method266(int i, int i_74_, int i_75_, int i_76_, int[] is,
			  int i_77_) {
	if (aClass181_4706 != Class181.aClass181_1952
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	aClass185_Sub1_Sub1_4709.method14586(i_75_ * i_76_ * 4);
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	IDirect3DTexture.Download(aLong4705, 0, i, i_74_, i_75_, i_76_,
				  i_75_ * 4, 0,
				  aClass185_Sub1_Sub1_4709.aLong9139);
	bytebuffer.asIntBuffer().get(is, i_77_, i_75_ * i_76_);
    }
    
    public void method267(int i, int i_78_, int i_79_, int i_80_, int[] is,
			  int i_81_) {
	if (aClass181_4706 != Class181.aClass181_1952
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	aClass185_Sub1_Sub1_4709.method14586(i_79_ * i_80_ * 4);
	ByteBuffer bytebuffer = aClass185_Sub1_Sub1_4709.aByteBuffer9266;
	bytebuffer.clear();
	IDirect3DTexture.Download(aLong4705, 0, i, i_78_, i_79_, i_80_,
				  i_79_ * 4, 0,
				  aClass185_Sub1_Sub1_4709.aLong9139);
	bytebuffer.asIntBuffer().get(is, i_81_, i_79_ * i_80_);
    }
    
    public void method268(int i, int i_82_, int i_83_, int i_84_, int[] is,
			  int[] is_85_, int i_86_) {
	if (aClass181_4706 != Class181.aClass181_1952
	    || aClass173_4707 != Class173.aClass173_1830)
	    throw new RuntimeException();
	method262(i, i_82_, i_83_, i_84_, is, null, i_86_);
    }
    
    public void method274(int i, int i_87_, int i_88_, int i_89_, int i_90_,
			  int i_91_) {
	int[] is
	    = aClass185_Sub1_Sub1_4709.method3267(i_90_, i_91_, i_88_, i_89_);
	if (is != null) {
	    for (int i_92_ = 0; i_92_ < is.length; i_92_++)
		is[i_92_] |= ~0xffffff;
	    method269(i, i_87_, i_88_, i_89_, is, 0, i_88_);
	}
    }
    
    public void method240(int i, int i_93_, int i_94_, int i_95_, int i_96_,
			  int i_97_) {
	int[] is
	    = aClass185_Sub1_Sub1_4709.method3267(i_96_, i_97_, i_94_, i_95_);
	if (is != null) {
	    for (int i_98_ = 0; i_98_ < is.length; i_98_++)
		is[i_98_] |= ~0xffffff;
	    method269(i, i_93_, i_94_, i_95_, is, 0, i_94_);
	}
    }
    
    public float method248() {
	return aFloat10257;
    }
    
    public float method239() {
	return aFloat10258;
    }
    
    public float method241(float f) {
	return f / (float) anInt10259;
    }
    
    public boolean method273() {
	return false;
    }
    
    public int method1() {
	return anInt10259;
    }
    
    public boolean method275() {
	return false;
    }
    
    public float method245(float f) {
	return f / (float) anInt10256;
    }
    
    public void method332() {
	aClass185_Sub1_Sub1_4709.method18050(this);
    }
    
    public void method336() {
	aClass185_Sub1_Sub1_4709.method18050(this);
    }
    
    public void method334() {
	aClass185_Sub1_Sub1_4709.method18050(this);
    }
    
    public void method338(Class372 class372) {
	super.method339(class372);
    }
    
    public void method337(Class372 class372) {
	super.method339(class372);
    }
    
    long method6773() {
	return aLong4705;
    }
}
