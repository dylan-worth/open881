/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;

class Class226 implements Interface58
{
    Class232 this$0;
    static int anInt2318;
    
    Class226(Class232 class232) {
	this$0 = class232;
    }
    
    public void method379(Object object, float[] fs, Object[] objects, int i) {
	Class491 class491 = (Class491) object;
	Class438 class438 = class491.method8029((byte) -126);
	float f = class491.method8020((short) 1528);
	float f_0_ = class491.method8031(2084297285);
	Class438 class438_1_
	    = Class438.method7055(class438, this$0.method4245(-168591159));
	float f_2_ = 0.0F;
	float f_3_ = class438_1_.method7012();
	if (f_3_ >= f_0_)
	    f_2_ = 0.0F;
	if (f_3_ <= f)
	    f_2_ = 1.0F;
	else {
	    float f_4_ = 1.0F - (f_3_ - f) * (1.0F / (f_0_ - f));
	    if ((double) f_4_ < 0.0 || (double) f_4_ > 1.0)
		f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
	    f_2_ = f_4_;
	}
	fs[0] = f_2_;
	fs[1] = f_2_;
    }
    
    public void method380(Object object, float[] fs, Object[] objects) {
	Class491 class491 = (Class491) object;
	Class438 class438 = class491.method8029((byte) -76);
	float f = class491.method8020((short) -1947);
	float f_5_ = class491.method8031(2031414449);
	Class438 class438_6_
	    = Class438.method7055(class438, this$0.method4245(1272159537));
	float f_7_ = 0.0F;
	float f_8_ = class438_6_.method7012();
	if (f_8_ >= f_5_)
	    f_7_ = 0.0F;
	if (f_8_ <= f)
	    f_7_ = 1.0F;
	else {
	    float f_9_ = 1.0F - (f_8_ - f) * (1.0F / (f_5_ - f));
	    if ((double) f_9_ < 0.0 || (double) f_9_ > 1.0)
		f_9_ = Math.min(Math.max(f_9_, 0.0F), 1.0F);
	    f_7_ = f_9_;
	}
	fs[0] = f_7_;
	fs[1] = f_7_;
    }
    
    public void method381(Object object, float[] fs, Object[] objects) {
	Class491 class491 = (Class491) object;
	Class438 class438 = class491.method8029((byte) 8);
	float f = class491.method8020((short) 30037);
	float f_10_ = class491.method8031(2046452803);
	Class438 class438_11_
	    = Class438.method7055(class438, this$0.method4245(1730876690));
	float f_12_ = 0.0F;
	float f_13_ = class438_11_.method7012();
	if (f_13_ >= f_10_)
	    f_12_ = 0.0F;
	if (f_13_ <= f)
	    f_12_ = 1.0F;
	else {
	    float f_14_ = 1.0F - (f_13_ - f) * (1.0F / (f_10_ - f));
	    if ((double) f_14_ < 0.0 || (double) f_14_ > 1.0)
		f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
	    f_12_ = f_14_;
	}
	fs[0] = f_12_;
	fs[1] = f_12_;
    }
    
    static final void method4176(Class669 class669, int i) {
	class669.anInt8600 -= 308999563;
    }
    
    public static final int method4177(String string, byte i) {
	if (null == string || string.length() == 0)
	    return -1;
	for (int i_15_ = 0; i_15_ < client.anInt11329 * 2103713403; i_15_++) {
	    if (string.equalsIgnoreCase(client.aClass33Array11299[i_15_]
					.aString273))
		return i_15_;
	}
	return -1;
    }
    
    public static File method4178(byte i) {
	return Class228.aFile2322;
    }
}
