/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Dimension;
import java.util.Iterator;

class Class46 implements Iterator
{
    Class44 this$0;
    int anInt331;
    
    public boolean hasNext() {
	return anInt331 * -2079474101 < this$0.anInt327 * 888398261;
    }
    
    public void method1104() {
	throw new UnsupportedOperationException();
    }
    
    public Object next() {
	int i = (anInt331 += 711498595) * -2079474101 - 1;
	synchronized (this$0.aClass203_325) {
	    Interface13 interface13
		= (Interface13) this$0.aClass203_325.method3871((long) i);
	    if (null != interface13) {
		Interface13 interface13_0_ = interface13;
		return interface13_0_;
	    }
	}
	return this$0.method1086(i, 1084702550);
    }
    
    public boolean method1105() {
	return anInt331 * -2079474101 < this$0.anInt327 * 888398261;
    }
    
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method1106() {
	return anInt331 * -2079474101 < this$0.anInt327 * 888398261;
    }
    
    public boolean method1107() {
	return anInt331 * -2079474101 < this$0.anInt327 * 888398261;
    }
    
    Class46(Class44 class44) {
	this$0 = class44;
    }
    
    public Object method1108() {
	int i = (anInt331 += 711498595) * -2079474101 - 1;
	synchronized (this$0.aClass203_325) {
	    Interface13 interface13
		= (Interface13) this$0.aClass203_325.method3871((long) i);
	    if (null != interface13) {
		Interface13 interface13_1_ = interface13;
		return interface13_1_;
	    }
	}
	return this$0.method1086(i, 324711248);
    }
    
    public Object method1109() {
	int i = (anInt331 += 711498595) * -2079474101 - 1;
	synchronized (this$0.aClass203_325) {
	    Interface13 interface13
		= (Interface13) this$0.aClass203_325.method3871((long) i);
	    if (null != interface13) {
		Interface13 interface13_2_ = interface13;
		return interface13_2_;
	    }
	}
	return this$0.method1086(i, -1207129046);
    }
    
    public void method1110() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method1111() {
	return anInt331 * -2079474101 < this$0.anInt327 * 888398261;
    }
    
    public static boolean method1112(String string, byte i) {
	if (null == string)
	    return false;
	for (int i_3_ = 0; i_3_ < -1979292205 * client.anInt11324; i_3_++) {
	    if (string.equalsIgnoreCase(client.aClass28Array11327[i_3_]
					.aString257))
		return true;
	}
	if (string.equalsIgnoreCase(Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				    .aString12211))
	    return true;
	return false;
    }
    
    static final void method1113(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_4_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_5_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	Class171_Sub4.aClass232_9944.method4226(i_4_, i_5_, -1271597999);
    }
    
    public static int method1114(int i, int i_6_, int i_7_) {
	if (-1085389923 * Class620.aClass632_8113.anInt8259 == -1)
	    return 1;
	if (i != Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10733
		     .method16935(-1807368365)) {
	    Class277.method5164
		(i,
		 Class58.aClass58_559.method1245(Class539.aClass672_7171,
						 (byte) -92),
		 true, (byte) 1);
	    if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10733
		    .method16935(-1807368365)
		!= i)
		return -1;
	}
	int i_8_;
	try {
	    Dimension dimension = Class464.aCanvas5111.getSize();
	    Class689.method14015
		(Class58.aClass58_559.method1245(Class539.aClass672_7171,
						 (byte) -84),
		 true, Class254.aClass185_2683, Class539_Sub1.aClass171_10327,
		 Class67.aClass16_720, (byte) -106);
	    Class187 class187
		= Class187.method3709(Class130.aClass472_1524,
				      (Class620.aClass632_8113.anInt8259
				       * -1085389923),
				      0);
	    long l = Class250.method4604((byte) -77);
	    Class254.aClass185_2683.method3537();
	    client.aClass446_11041.method7250(0.0F, 256.0F, 0.0F);
	    Class254.aClass185_2683.method3335(client.aClass446_11041);
	    Class433 class433 = Class254.aClass185_2683.method3518();
	    class433.method6857((float) (dimension.width / 2),
				(float) (dimension.height / 2), 512.0F, 512.0F,
				(float) client.aClass512_11100
					    .method8443(-2051669792),
				(float) client.aClass512_11100
					    .method8456((byte) -67),
				(float) dimension.width,
				(float) dimension.height);
	    Class254.aClass185_2683.method3338(class433);
	    Class254.aClass185_2683.method3489(1.0F);
	    Class254.aClass185_2683.method3341(16777215, 0.5F, 0.5F, 20.0F,
					       -50.0F, 30.0F);
	    Class183 class183
		= Class254.aClass185_2683.method3329(class187, 2048, 64, 64,
						     768);
	    int i_9_ = 0;
	while_155_:
	    for (int i_10_ = 0; i_10_ < 500; i_10_++) {
		Class254.aClass185_2683.method3340(3, 0);
		for (int i_11_ = 15; i_11_ >= 0; i_11_--) {
		    for (int i_12_ = 0; i_12_ <= i_11_; i_12_++) {
			client.aClass446_11358.method7250
			    ((float) (int) (((float) i_12_
					     - (float) i_11_ / 2.0F)
					    * 512.0F),
			     0.0F, (float) ((1 + i_11_) * 512));
			class183.method3034(client.aClass446_11358, null, 0);
			i_9_++;
			if (Class250.method4604((byte) -43) - l >= (long) i_6_)
			    break while_155_;
		    }
		}
	    }
	    Class254.aClass185_2683.method3575();
	    long l_13_ = ((long) (1000 * i_9_)
			  / (Class250.method4604((byte) -124) - l));
	    Class254.aClass185_2683.method3340(3, 0);
	    i_8_ = (int) l_13_;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return -1;
	}
	return i_8_;
    }
}
