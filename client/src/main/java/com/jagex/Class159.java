/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Comparator;

class Class159 implements Comparator
{
    Class367_Sub2 this$0;
    public static Class509 aClass509_1754;
    
    public boolean method2596(Object object) {
	return super.equals(object);
    }
    
    public int method2597(Object object, Object object_0_) {
	return method2606((Class479) object, (Class479) object_0_, 1976010050);
    }
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    public boolean method2598(Object object) {
	return super.equals(object);
    }
    
    int method2599(Class479 class479, Class479 class479_1_) {
	float f = class479.method7819(854683786);
	float f_2_ = class479_1_.method7819(926877134);
	if (f_2_ > f)
	    return 1;
	if (f_2_ < f)
	    return -1;
	return 0;
    }
    
    int method2600(Class479 class479, Class479 class479_3_) {
	float f = class479.method7819(-28713452);
	float f_4_ = class479_3_.method7819(1417371379);
	if (f_4_ > f)
	    return 1;
	if (f_4_ < f)
	    return -1;
	return 0;
    }
    
    public int method2601(Object object, Object object_5_) {
	return method2606((Class479) object, (Class479) object_5_, 1882277444);
    }
    
    public int method2602(Object object, Object object_6_) {
	return method2606((Class479) object, (Class479) object_6_, 1857254802);
    }
    
    public int method2603(Object object, Object object_7_) {
	return method2606((Class479) object, (Class479) object_7_, 1951323022);
    }
    
    public int compare(Object object, Object object_8_) {
	return method2606((Class479) object, (Class479) object_8_, 2134579339);
    }
    
    public boolean method2604(Object object) {
	return super.equals(object);
    }
    
    public boolean method2605(Object object) {
	return super.equals(object);
    }
    
    Class159(Class367_Sub2 class367_sub2) {
	this$0 = class367_sub2;
    }
    
    int method2606(Class479 class479, Class479 class479_9_, int i) {
	float f = class479.method7819(1133438664);
	float f_10_ = class479_9_.method7819(1104399879);
	if (f_10_ > f)
	    return 1;
	if (f_10_ < f)
	    return -1;
	return 0;
    }
    
    static void method2607(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class82.method1649(-1481419436) ? 1 : 0;
    }
    
    static final void method2608(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	int i_11_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (Class247.anInt2578 * 1098206671 == i_11_
	    || i_11_ == -1863691869 * Class247.anInt2427
	    || i_11_ == 1319143699 * Class247.anInt2455
	    || 2113390179 * Class247.anInt2429 == i_11_)
	    class247.anInt2566 = 417212025 * i_11_;
    }
    
    static final void method2609(Class669 class669, byte i) {
	class669.anInt8600 -= 926998689;
	byte[] is = { (byte) class669.anIntArray8595
			     [class669.anInt8600 * 2088438307] };
	byte[] is_12_ = { (byte) class669.anIntArray8595
				 [1 + 2088438307 * class669.anInt8600] };
	int i_13_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 2];
	Class247 class247 = Class112.method2017(i_13_, 1207409958);
	Class634.method10531(class247, is, is_12_, class669, (byte) 46);
    }
    
    static final void method2610(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class669.aClass534_Sub26_8606.aByte10583;
    }
    
    public static void method2611(int i, int i_14_, int i_15_, boolean bool,
				  int i_16_) {
	client.aLong11182 = 0L;
	int i_17_ = Class63.method1280(1681662799);
	if (i == 3 || 3 == i_17_)
	    bool = true;
	if (!Class254.aClass185_2683.method3242())
	    bool = true;
	Class478.method7801(i_17_, i, i_14_, i_15_, bool, 1629129834);
    }
    
    static final void method2612(int i, int i_18_, int i_19_, int i_20_,
				 int i_21_, boolean bool, boolean bool_22_,
				 int i_23_) {
	if (!bool
	    && (i_18_ < 512 || i_19_ < 512
		|| i_18_ > ((client.aClass512_11100.method8417(1713204688) - 2)
			    * 512)
		|| i_19_ > (client.aClass512_11100.method8418(-1533611049)
			    - 2) * 512)) {
	    float[] fs = client.aFloatArray11167;
	    client.aFloatArray11167[1] = -1.0F;
	    fs[0] = -1.0F;
	} else {
	    int i_24_
		= Class247.method4595(i_18_, i_19_, i, 237943479) - i_21_;
	    client.aClass446_11041
		.method7236(Class254.aClass185_2683.method3532());
	    client.aClass446_11041.method7287((float) i_20_, 0.0F, 0.0F);
	    Class254.aClass185_2683.method3335(client.aClass446_11041);
	    if (bool)
		Class254.aClass185_2683.method3367((float) i_18_,
						   (float) i_24_,
						   (float) i_19_,
						   client.aFloatArray11167);
	    else
		Class254.aClass185_2683.method3366((float) i_18_,
						   (float) i_24_,
						   (float) i_19_,
						   client.aFloatArray11167);
	    client.aClass446_11041.method7287((float) -i_20_, 0.0F, 0.0F);
	    Class254.aClass185_2683.method3335(client.aClass446_11041);
	    if (!bool_22_) {
		client.aFloatArray11167[0]
		    -= (float) (client.anInt11319 * -288443379);
		client.aFloatArray11167[1]
		    -= (float) (1082702717 * client.anInt11320);
	    }
	}
    }
    
    static boolean method2613(Class247 class247, int i) {
	Class534_Sub25 class534_sub25 = client.method17392(class247);
	if (class534_sub25.method16265((short) 256) > 0)
	    return true;
	if (class534_sub25.method16268(-1615950998))
	    return true;
	if (null != class247.aClass247_2556)
	    return true;
	return false;
    }
    
    static final void method2614(Class669 class669, int i) {
	int i_25_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_25_, 832352253);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_25_ >> 16];
	Class603.method10026(class247, class243, class669, 951316307);
    }
}
