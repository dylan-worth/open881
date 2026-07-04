/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public abstract class Class298
{
    float aFloat3173;
    Class308 aClass308_3174;
    Class310 aClass310_3175;
    boolean aBool3176;
    Class706 aClass706_3177;
    Class309 aClass309_3178;
    Class347 aClass347_3179;
    float aFloat3180;
    Class303 aClass303_3181;
    int anInt3182;
    float aFloat3183;
    Class438 aClass438_3184 = new Class438();
    boolean aBool3185;
    public static final float aFloat3186 = Float.POSITIVE_INFINITY;
    float aFloat3187;
    Class438 aClass438_3188;
    Class9 aClass9_3189;
    float aFloat3190 = 10.0F;
    Class293 aClass293_3191;
    float aFloat3192;
    float aFloat3193;
    float aFloat3194;
    Class438 aClass438_3195 = new Class438();
    Class305 aClass305_3196;
    float aFloat3197;
    float aFloat3198;
    float aFloat3199;
    Class438 aClass438_3200 = new Class438();
    static final int anInt3201 = 50;
    static final int anInt3202 = 10000;
    float aFloat3203 = 1.0F;
    float aFloat3204;
    Interface30 anInterface30_3205;
    Class438 aClass438_3206;
    int anInt3207;
    Class438 aClass438_3208;
    float aFloat3209 = 5120.0F;
    
    public Class438 method5349() {
	return aClass438_3184;
    }
    
    public void method5350(Class287 class287, Class446 class446,
			   Class433 class433, int i, int i_0_, int i_1_) {
	if (method5435(-1918474611)) {
	    aClass706_3177.method14240(class287, class446, i, i_0_,
				       aClass347_3179.method6134(-422566459),
				       -1356576125);
	    aClass347_3179.method6149(class287, i, i_0_, (short) 8192);
	    if (Class310.aClass310_3356 == aClass310_3175)
		class433.method6854(aFloat3199, aFloat3173, aFloat3180,
				    aFloat3204);
	    else
		class433.method6855(aFloat3199, aFloat3173,
				    (float) (-503383027 * anInt3182));
	    Iterator iterator = aClass9_3189.iterator();
	    while (iterator.hasNext()) {
		Class534_Sub18_Sub13 class534_sub18_sub13
		    = (Class534_Sub18_Sub13) iterator.next();
		class534_sub18_sub13.method18382(class287, class446, class433,
						 -1283200940);
	    }
	}
    }
    
    public void method5351(float f, int[][][] is, Class468 class468, int i,
			   int i_2_, int i_3_) {
	if (null != aClass706_3177)
	    aClass706_3177.method14239(f, 1966734952);
	if (null != aClass347_3179)
	    aClass347_3179.method6136(f, is, class468, i, i_2_, (byte) 2);
	Iterator iterator = aClass9_3189.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub18_Sub13 class534_sub18_sub13
		= (Class534_Sub18_Sub13) iterator.next();
	    class534_sub18_sub13.method18381(f, (byte) 58);
	}
    }
    
    public void method5352(boolean bool, float f, Class438 class438,
			   Class443 class443, Class438 class438_4_,
			   Class438 class438_5_, byte i) {
	if (aClass303_3181 == Class303.aClass303_3251)
	    Class571.method9634(f, class438, class438_4_, class438_5_,
				bool ? aClass438_3188 : aClass438_3200,
				bool ? aClass438_3195 : aClass438_3184,
				(float) (-1492160789 * anInt3207), aFloat3192,
				aFloat3187, aFloat3193, -2081731460);
	else if (aClass303_3181 == Class303.aClass303_3247)
	    Class614.method10128(f, class438, class443, class438_4_,
				 class438_5_,
				 bool ? aClass438_3188 : aClass438_3200,
				 bool ? aClass438_3195 : aClass438_3184,
				 (float) (anInt3207 * -1492160789), aFloat3192,
				 aFloat3187, aFloat3193, (byte) 0);
	else if (aClass303_3181 == Class303.aClass303_3249)
	    Class21.method812(f, class438, class443, class438_4_, class438_5_,
			      bool ? aClass438_3208 : aClass438_3206,
			      bool ? aFloat3198 : aFloat3197, aFloat3187,
			      aFloat3194, -644454731);
    }
    
    public void method5353(Class308 class308, byte i) {
	aClass308_3174 = class308;
    }
    
    public void method5354(Class438 class438, float f, byte i)
	throws Exception_Sub2 {
	if (!method5356((short) 8249) || aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3206.method6992(class438);
	aFloat3197 = f;
    }
    
    public Class347 method5355(Class305 class305, boolean bool, int i)
	throws Exception_Sub2 {
	if (aClass308_3174 == Class308.aClass308_3350 && !bool)
	    throw new Exception_Sub2();
	aClass305_3196 = class305;
	if (Class305.aClass305_3265 == class305)
	    aClass347_3179 = new Class347_Sub1(this);
	else if (class305 == Class305.aClass305_3266)
	    aClass347_3179 = new Class347_Sub2(this);
	else if (class305 == Class305.aClass305_3268)
	    aClass347_3179 = new Class347_Sub3_Sub2(this);
	else if (Class305.aClass305_3267 == class305)
	    aClass347_3179 = new Class347_Sub3_Sub3(this);
	else if (Class305.aClass305_3264 == class305)
	    aClass347_3179 = new Class347_Sub3_Sub1(this);
	return aClass347_3179;
    }
    
    boolean method5356(short i) {
	if (aClass309_3178 == Class309.aClass309_3354
	    && aClass308_3174 == Class308.aClass308_3350)
	    return true;
	if (Class309.aClass309_3353 == aClass309_3178
	    && aClass308_3174 == Class308.aClass308_3351)
	    return true;
	return false;
    }
    
    public void method5357(float f, int i) throws Exception_Sub2 {
	if (!method5356((short) 14991))
	    throw new Exception_Sub2();
    }
    
    public Class438 method5358() {
	return aClass438_3200;
    }
    
    public void method5359(Class303 class303, byte i) throws Exception_Sub2 {
	if (!method5356((short) 7112))
	    throw new Exception_Sub2();
	aClass303_3181 = class303;
    }
    
    public float method5360() {
	Class438 class438 = method5385((byte) 114);
	Class438 class438_6_ = method5456(1052219255);
	float f = 0.0F;
	if (class438 != null && class438_6_ != null) {
	    Class438 class438_7_ = Class438.method7055(class438, class438_6_);
	    class438_7_.aFloat4863 = 0.0F;
	    f = (float) Math.atan2((double) class438_7_.aFloat4864,
				   (double) class438_7_.aFloat4865);
	    class438.method7074();
	    class438_6_.method7074();
	}
	return (float) (3.141592653589793 - (double) f);
    }
    
    public boolean method5361() {
	if (null == aClass706_3177 || null == aClass347_3179)
	    return false;
	if (!aClass706_3177.method14237((byte) -1))
	    return false;
	if (!aClass347_3179.method6131(387501407))
	    return false;
	return true;
    }
    
    public void method5362() {
	aClass9_3189.method578((byte) -119);
    }
    
    public void method5363(int i) throws Exception_Sub2 {
	if (!method5356((short) 26218))
	    throw new Exception_Sub2();
	aFloat3187 = 5120.0F;
	aFloat3193 = 10.0F;
	aFloat3194 = 1.0F;
    }
    
    public void method5364(Class438 class438, int i) throws Exception_Sub2 {
	if (!method5356((short) 30103) || !aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3184.method6992(class438);
    }
    
    public void method5365(float f, int i) throws Exception_Sub2 {
	if (!method5356((short) 11827))
	    throw new Exception_Sub2();
	aFloat3183 = f;
    }
    
    public void method5366(Class438 class438, float f, byte i)
	throws Exception_Sub2 {
	if (!method5356((short) 4779) || aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3206.method6992(class438);
	aClass438_3208.method6992(class438);
	aFloat3197 = f;
	aFloat3198 = f;
    }
    
    public void method5367(Class438 class438) throws Exception_Sub2 {
	if (!method5356((short) 18778) || !aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3188.method6992(class438);
    }
    
    public void method5368(Class438 class438, float f, int i)
	throws Exception_Sub2 {
	if (!method5356((short) 515) || aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3208.method6992(class438);
	aFloat3198 = f;
    }
    
    public void method5369(float f, float f_8_, int i) throws Exception_Sub2 {
	if (!method5356((short) 15662))
	    throw new Exception_Sub2();
	if (f < 1.0F)
	    f = 50.0F;
	if (f_8_ < 1.0F)
	    f_8_ = 10000.0F;
	if (f >= f_8_)
	    throw new Exception_Sub2();
	aFloat3199 = f;
	aFloat3173 = f_8_;
    }
    
    public void method5370(float f, float f_9_, byte i) throws Exception_Sub2 {
	if (!method5356((short) 22299))
	    throw new Exception_Sub2();
	aFloat3180 = f;
	aFloat3204 = f_9_;
    }
    
    public void method5371(boolean bool, boolean bool_10_, int i)
	throws Exception_Sub2 {
	if (!method5356((short) 13250))
	    throw new Exception_Sub2();
	aBool3176 = bool;
	aBool3185 = bool_10_;
    }
    
    public void method5372(int i, float f, int i_11_) throws Exception_Sub2 {
	if (!method5356((short) 21935) || !aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	anInt3207 = i * 695781827;
	aFloat3192 = f;
    }
    
    public void method5373(Class534_Sub18_Sub13 class534_sub18_sub13, int i) {
	aClass9_3189.method581(class534_sub18_sub13,
			       (long) (class534_sub18_sub13.anInt11802
				       * -997430305));
    }
    
    public void method5374(int i, byte i_12_) {
	Class534_Sub18_Sub13 class534_sub18_sub13
	    = (Class534_Sub18_Sub13) aClass9_3189.method579((long) i);
	if (null != class534_sub18_sub13)
	    class534_sub18_sub13.method8892((byte) 1);
    }
    
    public Class534_Sub18_Sub13 method5375(int i, int i_13_) {
	return (Class534_Sub18_Sub13) aClass9_3189.method579((long) i);
    }
    
    public void method5376(byte i) {
	aClass9_3189.method578((byte) -31);
    }
    
    public void method5377() throws Exception_Sub2 {
	if (!method5356((short) 10341))
	    throw new Exception_Sub2();
	aFloat3187 = 5120.0F;
	aFloat3193 = 10.0F;
	aFloat3194 = 1.0F;
    }
    
    public void method5378(boolean bool, boolean bool_14_)
	throws Exception_Sub2 {
	if (!method5356((short) 12501))
	    throw new Exception_Sub2();
	aBool3176 = bool;
	aBool3185 = bool_14_;
    }
    
    public Class308 method5379() {
	return aClass308_3174;
    }
    
    public Class347 method5380(byte i) {
	return aClass347_3179;
    }
    
    public Class706 method5381(int i) {
	return aClass706_3177;
    }
    
    public Interface30 method5382(int i) {
	return anInterface30_3205;
    }
    
    public Class308 method5383() {
	return aClass308_3174;
    }
    
    public float method5384() {
	return aFloat3183;
    }
    
    public Class438 method5385(byte i) {
	if (aClass347_3179 == null || !aClass347_3179.method6131(-630113367))
	    return null;
	return aClass347_3179.method6137(-2004076001);
    }
    
    public double[] method5386(int i) {
	if (null == aClass347_3179 || !aClass347_3179.method6131(-2031707252))
	    return null;
	return aClass347_3179.method6130(-1818663359);
    }
    
    Class298(Class309 class309, Interface30 interface30) {
	aClass438_3188 = new Class438();
	aFloat3209 = 5120.0F;
	aFloat3190 = 10.0F;
	aFloat3203 = 1.0F;
	aFloat3187 = 5120.0F;
	aFloat3193 = 10.0F;
	aFloat3194 = 1.0F;
	aClass438_3206 = new Class438();
	aClass438_3208 = new Class438();
	anInt3207 = 0;
	aFloat3192 = 1.0F;
	aClass9_3189 = new Class9(8);
	aClass309_3178 = class309;
	anInterface30_3205 = interface30;
	method5466(true, 1467416058);
    }
    
    public Class534_Sub36 method5387(byte i) {
	if (aClass347_3179 == null || !aClass347_3179.method6131(-372353386))
	    return null;
	return aClass347_3179.method6133((byte) 14);
    }
    
    public Class305 method5388(byte i) {
	return aClass305_3196;
    }
    
    public float method5389(int i) {
	Class438 class438 = method5385((byte) 126);
	Class438 class438_15_ = method5456(-198252083);
	float f = 0.0F;
	if (class438 != null && class438_15_ != null) {
	    Class438 class438_16_
		= Class438.method7055(class438, class438_15_);
	    class438_16_.aFloat4863 = 0.0F;
	    f = (float) Math.atan2((double) class438_16_.aFloat4864,
				   (double) class438_16_.aFloat4865);
	    class438.method7074();
	    class438_15_.method7074();
	}
	return (float) (3.141592653589793 - (double) f);
    }
    
    float method5390(byte i) {
	return 0.0F;
    }
    
    public Class443 method5391(byte i) {
	Class443 class443 = Class443.method7137();
	class443.method7148(method5389(-505848168), method5399(687018003),
			    method5390((byte) 90));
	return class443;
    }
    
    public Class438 method5392(byte i) {
	return aClass438_3200;
    }
    
    public Class438 method5393(int i) {
	return aClass438_3188;
    }
    
    public float method5394(int i) {
	return aFloat3183;
    }
    
    public Class438 method5395(int i) {
	return aClass438_3184;
    }
    
    public Class438 method5396(int i) {
	return aClass438_3195;
    }
    
    public float method5397(int i) {
	return aFloat3199;
    }
    
    public float method5398(int i) {
	return aFloat3173;
    }
    
    public float method5399(int i) {
	Class438 class438 = method5385((byte) 116);
	Class438 class438_17_ = method5456(-230607533);
	float f = 0.0F;
	if (class438 != null && null != class438_17_) {
	    Class438 class438_18_
		= Class438.method7055(class438_17_, class438);
	    float f_19_
		= (float) Math.sqrt((double) ((class438_18_.aFloat4865
					       * class438_18_.aFloat4865)
					      + (class438_18_.aFloat4864
						 * class438_18_.aFloat4864)));
	    f = (float) Math.atan2((double) -class438_18_.aFloat4863,
				   (double) f_19_);
	    class438.method7074();
	    class438_17_.method7074();
	}
	return f;
    }
    
    public boolean method5400(int i) {
	return aBool3176;
    }
    
    public Class308 method5401(int i) {
	return aClass308_3174;
    }
    
    public void method5402(boolean bool) {
	aClass310_3175 = Class310.aClass310_3356;
	aClass293_3191 = null;
	aClass706_3177 = null;
	aClass305_3196 = null;
	aClass347_3179 = null;
	if (Class309.aClass309_3354 == aClass309_3178 || !bool)
	    aClass308_3174 = Class308.aClass308_3350;
	else
	    aClass308_3174 = Class308.aClass308_3351;
	aClass303_3181 = Class303.aClass303_3247;
	aClass438_3184.method6997(100.0F, 100.0F, 100.0F);
	aClass438_3195.method6997(100.0F, 100.0F, 100.0F);
	aFloat3183 = 0.05F;
	aClass438_3200.method6997(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass438_3188.method6997(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass438_3206.method6997(1.0F, 1.0F, 1.0F);
	aClass438_3208.method6997(1.0F, 1.0F, 1.0F);
	aFloat3197 = 1.1F;
	aFloat3198 = 1.1F;
	aFloat3199 = 50.0F;
	aFloat3173 = 10000.0F;
	aFloat3204 = 1.5707964F;
	aFloat3180 = 1.5707964F;
	anInt3182 = 1886551513;
	aBool3176 = true;
	aBool3185 = true;
	anInt3207 = 0;
	aFloat3192 = 1.0F;
	aClass9_3189.method578((byte) 61);
    }
    
    public void method5403(boolean bool) {
	aClass310_3175 = Class310.aClass310_3356;
	aClass293_3191 = null;
	aClass706_3177 = null;
	aClass305_3196 = null;
	aClass347_3179 = null;
	if (Class309.aClass309_3354 == aClass309_3178 || !bool)
	    aClass308_3174 = Class308.aClass308_3350;
	else
	    aClass308_3174 = Class308.aClass308_3351;
	aClass303_3181 = Class303.aClass303_3247;
	aClass438_3184.method6997(100.0F, 100.0F, 100.0F);
	aClass438_3195.method6997(100.0F, 100.0F, 100.0F);
	aFloat3183 = 0.05F;
	aClass438_3200.method6997(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass438_3188.method6997(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass438_3206.method6997(1.0F, 1.0F, 1.0F);
	aClass438_3208.method6997(1.0F, 1.0F, 1.0F);
	aFloat3197 = 1.1F;
	aFloat3198 = 1.1F;
	aFloat3199 = 50.0F;
	aFloat3173 = 10000.0F;
	aFloat3204 = 1.5707964F;
	aFloat3180 = 1.5707964F;
	anInt3182 = 1886551513;
	aBool3176 = true;
	aBool3185 = true;
	anInt3207 = 0;
	aFloat3192 = 1.0F;
	aClass9_3189.method578((byte) -41);
    }
    
    public void method5404(float f, int[][][] is, Class468 class468, int i,
			   int i_20_) {
	if (null != aClass706_3177)
	    aClass706_3177.method14239(f, 511024177);
	if (null != aClass347_3179)
	    aClass347_3179.method6136(f, is, class468, i, i_20_, (byte) 2);
	Iterator iterator = aClass9_3189.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub18_Sub13 class534_sub18_sub13
		= (Class534_Sub18_Sub13) iterator.next();
	    class534_sub18_sub13.method18381(f, (byte) 125);
	}
    }
    
    public void method5405(float f, float f_21_, float f_22_, short i)
	throws Exception_Sub2 {
	if (!method5356((short) 3463))
	    throw new Exception_Sub2();
	aFloat3187 = f;
	aFloat3193 = f_21_;
	aFloat3194 = f_22_;
    }
    
    public void method5406(boolean bool, float f, Class438 class438,
			   Class443 class443, Class438 class438_23_,
			   Class438 class438_24_) {
	if (aClass303_3181 == Class303.aClass303_3251)
	    Class571.method9634(f, class438, class438_23_, class438_24_,
				bool ? aClass438_3188 : aClass438_3200,
				bool ? aClass438_3195 : aClass438_3184,
				(float) (-1492160789 * anInt3207), aFloat3192,
				aFloat3187, aFloat3193, -2025038066);
	else if (aClass303_3181 == Class303.aClass303_3247)
	    Class614.method10128(f, class438, class443, class438_23_,
				 class438_24_,
				 bool ? aClass438_3188 : aClass438_3200,
				 bool ? aClass438_3195 : aClass438_3184,
				 (float) (anInt3207 * -1492160789), aFloat3192,
				 aFloat3187, aFloat3193, (byte) 0);
	else if (aClass303_3181 == Class303.aClass303_3249)
	    Class21.method812(f, class438, class443, class438_23_,
			      class438_24_,
			      bool ? aClass438_3208 : aClass438_3206,
			      bool ? aFloat3198 : aFloat3197, aFloat3187,
			      aFloat3194, -644454731);
    }
    
    public void method5407(boolean bool, float f, Class438 class438,
			   Class443 class443, Class438 class438_25_,
			   Class438 class438_26_) {
	if (aClass303_3181 == Class303.aClass303_3251)
	    Class571.method9634(f, class438, class438_25_, class438_26_,
				bool ? aClass438_3188 : aClass438_3200,
				bool ? aClass438_3195 : aClass438_3184,
				(float) (-1492160789 * anInt3207), aFloat3192,
				aFloat3187, aFloat3193, -385955044);
	else if (aClass303_3181 == Class303.aClass303_3247)
	    Class614.method10128(f, class438, class443, class438_25_,
				 class438_26_,
				 bool ? aClass438_3188 : aClass438_3200,
				 bool ? aClass438_3195 : aClass438_3184,
				 (float) (anInt3207 * -1492160789), aFloat3192,
				 aFloat3187, aFloat3193, (byte) 0);
	else if (aClass303_3181 == Class303.aClass303_3249)
	    Class21.method812(f, class438, class443, class438_25_,
			      class438_26_,
			      bool ? aClass438_3208 : aClass438_3206,
			      bool ? aFloat3198 : aFloat3197, aFloat3187,
			      aFloat3194, -644454731);
    }
    
    public void method5408(Class308 class308) {
	aClass308_3174 = class308;
    }
    
    public void method5409(Class308 class308) {
	aClass308_3174 = class308;
    }
    
    public void method5410(Class438 class438, int i) throws Exception_Sub2 {
	if (!method5356((short) 12375) || !aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3195.method6992(class438);
    }
    
    public Class347 method5411(Class305 class305, boolean bool)
	throws Exception_Sub2 {
	if (aClass308_3174 == Class308.aClass308_3350 && !bool)
	    throw new Exception_Sub2();
	aClass305_3196 = class305;
	if (Class305.aClass305_3265 == class305)
	    aClass347_3179 = new Class347_Sub1(this);
	else if (class305 == Class305.aClass305_3266)
	    aClass347_3179 = new Class347_Sub2(this);
	else if (class305 == Class305.aClass305_3268)
	    aClass347_3179 = new Class347_Sub3_Sub2(this);
	else if (Class305.aClass305_3267 == class305)
	    aClass347_3179 = new Class347_Sub3_Sub3(this);
	else if (Class305.aClass305_3264 == class305)
	    aClass347_3179 = new Class347_Sub3_Sub1(this);
	return aClass347_3179;
    }
    
    public Class347 method5412(Class305 class305, boolean bool)
	throws Exception_Sub2 {
	if (aClass308_3174 == Class308.aClass308_3350 && !bool)
	    throw new Exception_Sub2();
	aClass305_3196 = class305;
	if (Class305.aClass305_3265 == class305)
	    aClass347_3179 = new Class347_Sub1(this);
	else if (class305 == Class305.aClass305_3266)
	    aClass347_3179 = new Class347_Sub2(this);
	else if (class305 == Class305.aClass305_3268)
	    aClass347_3179 = new Class347_Sub3_Sub2(this);
	else if (Class305.aClass305_3267 == class305)
	    aClass347_3179 = new Class347_Sub3_Sub3(this);
	else if (Class305.aClass305_3264 == class305)
	    aClass347_3179 = new Class347_Sub3_Sub1(this);
	return aClass347_3179;
    }
    
    public Class347 method5413(Class305 class305, boolean bool)
	throws Exception_Sub2 {
	if (aClass308_3174 == Class308.aClass308_3350 && !bool)
	    throw new Exception_Sub2();
	aClass305_3196 = class305;
	if (Class305.aClass305_3265 == class305)
	    aClass347_3179 = new Class347_Sub1(this);
	else if (class305 == Class305.aClass305_3266)
	    aClass347_3179 = new Class347_Sub2(this);
	else if (class305 == Class305.aClass305_3268)
	    aClass347_3179 = new Class347_Sub3_Sub2(this);
	else if (Class305.aClass305_3267 == class305)
	    aClass347_3179 = new Class347_Sub3_Sub3(this);
	else if (Class305.aClass305_3264 == class305)
	    aClass347_3179 = new Class347_Sub3_Sub1(this);
	return aClass347_3179;
    }
    
    public Class706 method5414() {
	return aClass706_3177;
    }
    
    boolean method5415() {
	if (aClass309_3178 == Class309.aClass309_3354
	    && aClass308_3174 == Class308.aClass308_3350)
	    return true;
	if (Class309.aClass309_3353 == aClass309_3178
	    && aClass308_3174 == Class308.aClass308_3351)
	    return true;
	return false;
    }
    
    boolean method5416() {
	if (aClass309_3178 == Class309.aClass309_3354
	    && aClass308_3174 == Class308.aClass308_3350)
	    return true;
	if (Class309.aClass309_3353 == aClass309_3178
	    && aClass308_3174 == Class308.aClass308_3351)
	    return true;
	return false;
    }
    
    public Class706 method5417() {
	return aClass706_3177;
    }
    
    public void method5418() throws Exception_Sub2 {
	if (!method5356((short) 6251))
	    throw new Exception_Sub2();
	aFloat3187 = 5120.0F;
	aFloat3193 = 10.0F;
	aFloat3194 = 1.0F;
    }
    
    public void method5419(float f) throws Exception_Sub2 {
	if (!method5356((short) 8821))
	    throw new Exception_Sub2();
	aFloat3183 = f;
    }
    
    public void method5420(float f) throws Exception_Sub2 {
	if (!method5356((short) 10080))
	    throw new Exception_Sub2();
	aFloat3183 = f;
    }
    
    public void method5421(Class303 class303) throws Exception_Sub2 {
	if (!method5356((short) 20386))
	    throw new Exception_Sub2();
	aClass303_3181 = class303;
    }
    
    public void method5422(Class303 class303) throws Exception_Sub2 {
	if (!method5356((short) 6154))
	    throw new Exception_Sub2();
	aClass303_3181 = class303;
    }
    
    public void method5423(Class303 class303) throws Exception_Sub2 {
	if (!method5356((short) 32297))
	    throw new Exception_Sub2();
	aClass303_3181 = class303;
    }
    
    public Class438 method5424() {
	if (null == aClass706_3177 || !aClass706_3177.method14237((byte) -1))
	    return null;
	return aClass706_3177.method14236(308999563);
    }
    
    public Class293 method5425(int i) {
	return aClass293_3191;
    }
    
    public void method5426(Class438 class438) throws Exception_Sub2 {
	if (!method5356((short) 21278) || !aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3200.method6992(class438);
    }
    
    public void method5427(float f) throws Exception_Sub2 {
	if (!method5356((short) 16082))
	    throw new Exception_Sub2();
	aFloat3183 = f;
    }
    
    public void method5428(Class438 class438) throws Exception_Sub2 {
	if (!method5356((short) 24191) || !aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3188.method6992(class438);
    }
    
    public void method5429(Class438 class438) throws Exception_Sub2 {
	if (!method5356((short) 7173) || !aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3188.method6992(class438);
    }
    
    public void method5430(Class303 class303) throws Exception_Sub2 {
	if (!method5356((short) 4141))
	    throw new Exception_Sub2();
	aClass303_3181 = class303;
    }
    
    public void method5431(Class438 class438, float f) throws Exception_Sub2 {
	if (!method5356((short) 8146) || aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3206.method6992(class438);
	aFloat3197 = f;
    }
    
    public void method5432() throws Exception_Sub2 {
	if (!method5356((short) 9772))
	    throw new Exception_Sub2();
	aFloat3187 = 5120.0F;
	aFloat3193 = 10.0F;
	aFloat3194 = 1.0F;
    }
    
    public void method5433() throws Exception_Sub2 {
	if (!method5356((short) 28197))
	    throw new Exception_Sub2();
	aFloat3187 = 5120.0F;
	aFloat3193 = 10.0F;
	aFloat3194 = 1.0F;
    }
    
    public Class534_Sub18_Sub13 method5434(int i) {
	return (Class534_Sub18_Sub13) aClass9_3189.method579((long) i);
    }
    
    public boolean method5435(int i) {
	if (null == aClass706_3177 || null == aClass347_3179)
	    return false;
	if (!aClass706_3177.method14237((byte) -1))
	    return false;
	if (!aClass347_3179.method6131(-1754023987))
	    return false;
	return true;
    }
    
    public void method5436() throws Exception_Sub2 {
	if (!method5356((short) 21814))
	    throw new Exception_Sub2();
	aFloat3187 = 5120.0F;
	aFloat3193 = 10.0F;
	aFloat3194 = 1.0F;
    }
    
    public void method5437(Class438 class438) throws Exception_Sub2 {
	if (!method5356((short) 1708) || !aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3184.method6992(class438);
    }
    
    public void method5438(Class438 class438) throws Exception_Sub2 {
	if (!method5356((short) 22225) || !aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3184.method6992(class438);
    }
    
    public void method5439(Class438 class438, float f) throws Exception_Sub2 {
	if (!method5356((short) 12711) || aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3206.method6992(class438);
	aClass438_3208.method6992(class438);
	aFloat3197 = f;
	aFloat3198 = f;
    }
    
    public void method5440(Class438 class438, float f) throws Exception_Sub2 {
	if (!method5356((short) 18492) || aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3206.method6992(class438);
	aClass438_3208.method6992(class438);
	aFloat3197 = f;
	aFloat3198 = f;
    }
    
    public float method5441() {
	Class438 class438 = method5385((byte) 116);
	Class438 class438_27_ = method5456(765258559);
	float f = 0.0F;
	if (class438 != null && null != class438_27_) {
	    Class438 class438_28_
		= Class438.method7055(class438_27_, class438);
	    float f_29_
		= (float) Math.sqrt((double) ((class438_28_.aFloat4865
					       * class438_28_.aFloat4865)
					      + (class438_28_.aFloat4864
						 * class438_28_.aFloat4864)));
	    f = (float) Math.atan2((double) -class438_28_.aFloat4863,
				   (double) f_29_);
	    class438.method7074();
	    class438_27_.method7074();
	}
	return f;
    }
    
    public double[] method5442() {
	if (null == aClass347_3179 || !aClass347_3179.method6131(-997220388))
	    return null;
	return aClass347_3179.method6130(-2056297985);
    }
    
    public void method5443(Class438 class438, float f) throws Exception_Sub2 {
	if (!method5356((short) 13363) || aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3208.method6992(class438);
	aFloat3198 = f;
    }
    
    public void method5444(Class438 class438, float f) throws Exception_Sub2 {
	if (!method5356((short) 14363) || aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3208.method6992(class438);
	aFloat3198 = f;
    }
    
    public void method5445(float f) throws Exception_Sub2 {
	if (!method5356((short) 689))
	    throw new Exception_Sub2();
    }
    
    public void method5446(Class534_Sub18_Sub13 class534_sub18_sub13) {
	aClass9_3189.method581(class534_sub18_sub13,
			       (long) (class534_sub18_sub13.anInt11802
				       * -997430305));
    }
    
    public void method5447(float f, float f_30_) throws Exception_Sub2 {
	if (!method5356((short) 11269))
	    throw new Exception_Sub2();
	if (f < 1.0F)
	    f = 50.0F;
	if (f_30_ < 1.0F)
	    f_30_ = 10000.0F;
	if (f >= f_30_)
	    throw new Exception_Sub2();
	aFloat3199 = f;
	aFloat3173 = f_30_;
    }
    
    public void method5448(float f, float f_31_) throws Exception_Sub2 {
	if (!method5356((short) 1766))
	    throw new Exception_Sub2();
	if (f < 1.0F)
	    f = 50.0F;
	if (f_31_ < 1.0F)
	    f_31_ = 10000.0F;
	if (f >= f_31_)
	    throw new Exception_Sub2();
	aFloat3199 = f;
	aFloat3173 = f_31_;
    }
    
    public void method5449() throws Exception_Sub2 {
	if (!method5356((short) 26663))
	    throw new Exception_Sub2();
	aFloat3187 = 5120.0F;
	aFloat3193 = 10.0F;
	aFloat3194 = 1.0F;
    }
    
    public Class438 method5450() {
	return aClass438_3195;
    }
    
    public void method5451(Class534_Sub18_Sub13 class534_sub18_sub13) {
	aClass9_3189.method581(class534_sub18_sub13,
			       (long) (class534_sub18_sub13.anInt11802
				       * -997430305));
    }
    
    public void method5452(float f, float f_32_, float f_33_)
	throws Exception_Sub2 {
	if (!method5356((short) 14437))
	    throw new Exception_Sub2();
	aFloat3187 = f;
	aFloat3193 = f_32_;
	aFloat3194 = f_33_;
    }
    
    public void method5453(boolean bool, float f, Class438 class438,
			   Class443 class443, Class438 class438_34_,
			   Class438 class438_35_) {
	if (aClass303_3181 == Class303.aClass303_3251)
	    Class571.method9634(f, class438, class438_34_, class438_35_,
				bool ? aClass438_3188 : aClass438_3200,
				bool ? aClass438_3195 : aClass438_3184,
				(float) (-1492160789 * anInt3207), aFloat3192,
				aFloat3187, aFloat3193, -1019861759);
	else if (aClass303_3181 == Class303.aClass303_3247)
	    Class614.method10128(f, class438, class443, class438_34_,
				 class438_35_,
				 bool ? aClass438_3188 : aClass438_3200,
				 bool ? aClass438_3195 : aClass438_3184,
				 (float) (anInt3207 * -1492160789), aFloat3192,
				 aFloat3187, aFloat3193, (byte) 0);
	else if (aClass303_3181 == Class303.aClass303_3249)
	    Class21.method812(f, class438, class443, class438_34_,
			      class438_35_,
			      bool ? aClass438_3208 : aClass438_3206,
			      bool ? aFloat3198 : aFloat3197, aFloat3187,
			      aFloat3194, -644454731);
    }
    
    public void method5454(Class438 class438, int i) throws Exception_Sub2 {
	if (!method5356((short) 18094) || !aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3188.method6992(class438);
    }
    
    public Class706 method5455(Class293 class293, boolean bool, byte i)
	throws Exception_Sub2 {
	if (Class308.aClass308_3350 == aClass308_3174 && !bool)
	    throw new Exception_Sub2();
	aClass293_3191 = class293;
	if (Class293.aClass293_3125 == class293)
	    aClass706_3177 = new Class706_Sub4(this);
	else if (class293 == Class293.aClass293_3124)
	    aClass706_3177 = new Class706_Sub3(this);
	else if (class293 == Class293.aClass293_3131)
	    aClass706_3177 = new Class706_Sub1(this);
	else if (Class293.aClass293_3128 == class293)
	    aClass706_3177 = new Class706_Sub5_Sub1(this);
	else if (class293 == Class293.aClass293_3127)
	    aClass706_3177 = new Class706_Sub5_Sub3(this);
	else if (class293 == Class293.aClass293_3129)
	    aClass706_3177 = new Class706_Sub2(this);
	else if (Class293.aClass293_3130 == class293)
	    aClass706_3177 = new Class706_Sub5_Sub2(this);
	return aClass706_3177;
    }
    
    public Class438 method5456(int i) {
	if (null == aClass706_3177 || !aClass706_3177.method14237((byte) -1))
	    return null;
	return aClass706_3177.method14236(308999563);
    }
    
    public void method5457(int i) {
	Class534_Sub18_Sub13 class534_sub18_sub13
	    = (Class534_Sub18_Sub13) aClass9_3189.method579((long) i);
	if (null != class534_sub18_sub13)
	    class534_sub18_sub13.method8892((byte) 1);
    }
    
    public void method5458(Class534_Sub18_Sub13 class534_sub18_sub13) {
	aClass9_3189.method581(class534_sub18_sub13,
			       (long) (class534_sub18_sub13.anInt11802
				       * -997430305));
    }
    
    public Class534_Sub18_Sub13 method5459(int i) {
	return (Class534_Sub18_Sub13) aClass9_3189.method579((long) i);
    }
    
    public void method5460(Class303 class303) throws Exception_Sub2 {
	if (!method5356((short) 264))
	    throw new Exception_Sub2();
	aClass303_3181 = class303;
    }
    
    public void method5461() {
	aClass9_3189.method578((byte) -76);
    }
    
    public void method5462() {
	aClass9_3189.method578((byte) 10);
    }
    
    public boolean method5463() {
	if (null == aClass706_3177 || null == aClass347_3179)
	    return false;
	if (!aClass706_3177.method14237((byte) -1))
	    return false;
	if (!aClass347_3179.method6131(-1202339913))
	    return false;
	return true;
    }
    
    public Class534_Sub36 method5464() {
	if (aClass347_3179 == null || !aClass347_3179.method6131(-1564081321))
	    return null;
	return aClass347_3179.method6133((byte) -6);
    }
    
    public boolean method5465() {
	if (null == aClass706_3177 || null == aClass347_3179)
	    return false;
	if (!aClass706_3177.method14237((byte) -1))
	    return false;
	if (!aClass347_3179.method6131(-1649601178))
	    return false;
	return true;
    }
    
    public void method5466(boolean bool, int i) {
	aClass310_3175 = Class310.aClass310_3356;
	aClass293_3191 = null;
	aClass706_3177 = null;
	aClass305_3196 = null;
	aClass347_3179 = null;
	if (Class309.aClass309_3354 == aClass309_3178 || !bool)
	    aClass308_3174 = Class308.aClass308_3350;
	else
	    aClass308_3174 = Class308.aClass308_3351;
	aClass303_3181 = Class303.aClass303_3247;
	aClass438_3184.method6997(100.0F, 100.0F, 100.0F);
	aClass438_3195.method6997(100.0F, 100.0F, 100.0F);
	aFloat3183 = 0.05F;
	aClass438_3200.method6997(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass438_3188.method6997(Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY,
				  Float.POSITIVE_INFINITY);
	aClass438_3206.method6997(1.0F, 1.0F, 1.0F);
	aClass438_3208.method6997(1.0F, 1.0F, 1.0F);
	aFloat3197 = 1.1F;
	aFloat3198 = 1.1F;
	aFloat3199 = 50.0F;
	aFloat3173 = 10000.0F;
	aFloat3204 = 1.5707964F;
	aFloat3180 = 1.5707964F;
	anInt3182 = 1886551513;
	aBool3176 = true;
	aBool3185 = true;
	anInt3207 = 0;
	aFloat3192 = 1.0F;
	aClass9_3189.method578((byte) -46);
    }
    
    public void method5467(int i) {
	Class534_Sub18_Sub13 class534_sub18_sub13
	    = (Class534_Sub18_Sub13) aClass9_3189.method579((long) i);
	if (null != class534_sub18_sub13)
	    class534_sub18_sub13.method8892((byte) 1);
    }
    
    public Class347 method5468(Class305 class305, boolean bool)
	throws Exception_Sub2 {
	if (aClass308_3174 == Class308.aClass308_3350 && !bool)
	    throw new Exception_Sub2();
	aClass305_3196 = class305;
	if (Class305.aClass305_3265 == class305)
	    aClass347_3179 = new Class347_Sub1(this);
	else if (class305 == Class305.aClass305_3266)
	    aClass347_3179 = new Class347_Sub2(this);
	else if (class305 == Class305.aClass305_3268)
	    aClass347_3179 = new Class347_Sub3_Sub2(this);
	else if (Class305.aClass305_3267 == class305)
	    aClass347_3179 = new Class347_Sub3_Sub3(this);
	else if (Class305.aClass305_3264 == class305)
	    aClass347_3179 = new Class347_Sub3_Sub1(this);
	return aClass347_3179;
    }
    
    public Class706 method5469() {
	return aClass706_3177;
    }
    
    public void method5470(Class438 class438, int i) throws Exception_Sub2 {
	if (!method5356((short) 11733) || !aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3200.method6992(class438);
    }
    
    public void method5471(Class438 class438, float f) throws Exception_Sub2 {
	if (!method5356((short) 1362) || aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3208.method6992(class438);
	aFloat3198 = f;
    }
    
    public Interface30 method5472() {
	return anInterface30_3205;
    }
    
    public void method5473(Class438 class438, float f) throws Exception_Sub2 {
	if (!method5356((short) 20110) || aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3206.method6992(class438);
	aClass438_3208.method6992(class438);
	aFloat3197 = f;
	aFloat3198 = f;
    }
    
    public Class305 method5474() {
	return aClass305_3196;
    }
    
    boolean method5475() {
	if (aClass309_3178 == Class309.aClass309_3354
	    && aClass308_3174 == Class308.aClass308_3350)
	    return true;
	if (Class309.aClass309_3353 == aClass309_3178
	    && aClass308_3174 == Class308.aClass308_3351)
	    return true;
	return false;
    }
    
    public double[] method5476() {
	if (null == aClass347_3179 || !aClass347_3179.method6131(-2048276522))
	    return null;
	return aClass347_3179.method6130(-1887042185);
    }
    
    public void method5477(Class534_Sub18_Sub13 class534_sub18_sub13) {
	aClass9_3189.method581(class534_sub18_sub13,
			       (long) (class534_sub18_sub13.anInt11802
				       * -997430305));
    }
    
    public Class438 method5478() {
	if (null == aClass706_3177 || !aClass706_3177.method14237((byte) -1))
	    return null;
	return aClass706_3177.method14236(308999563);
    }
    
    public Class347 method5479() {
	return aClass347_3179;
    }
    
    public float method5480(byte i) {
	return aFloat3180;
    }
    
    public void method5481(Class534_Sub18_Sub13 class534_sub18_sub13) {
	aClass9_3189.method581(class534_sub18_sub13,
			       (long) (class534_sub18_sub13.anInt11802
				       * -997430305));
    }
    
    public Class438 method5482() {
	if (aClass347_3179 == null || !aClass347_3179.method6131(-813208324))
	    return null;
	return aClass347_3179.method6137(1508215969);
    }
    
    public float method5483() {
	Class438 class438 = method5385((byte) 124);
	Class438 class438_36_ = method5456(-803997413);
	float f = 0.0F;
	if (class438 != null && null != class438_36_) {
	    Class438 class438_37_
		= Class438.method7055(class438_36_, class438);
	    float f_38_
		= (float) Math.sqrt((double) ((class438_37_.aFloat4865
					       * class438_37_.aFloat4865)
					      + (class438_37_.aFloat4864
						 * class438_37_.aFloat4864)));
	    f = (float) Math.atan2((double) -class438_37_.aFloat4863,
				   (double) f_38_);
	    class438.method7074();
	    class438_36_.method7074();
	}
	return f;
    }
    
    public float method5484() {
	Class438 class438 = method5385((byte) 120);
	Class438 class438_39_ = method5456(1895027869);
	float f = 0.0F;
	if (class438 != null && null != class438_39_) {
	    Class438 class438_40_
		= Class438.method7055(class438_39_, class438);
	    float f_41_
		= (float) Math.sqrt((double) ((class438_40_.aFloat4865
					       * class438_40_.aFloat4865)
					      + (class438_40_.aFloat4864
						 * class438_40_.aFloat4864)));
	    f = (float) Math.atan2((double) -class438_40_.aFloat4863,
				   (double) f_41_);
	    class438.method7074();
	    class438_39_.method7074();
	}
	return f;
    }
    
    public boolean method5485(byte i) {
	return aBool3185;
    }
    
    float method5486() {
	return 0.0F;
    }
    
    public Class443 method5487() {
	Class443 class443 = Class443.method7137();
	class443.method7148(method5389(-587015541), method5399(1153329551),
			    method5390((byte) 81));
	return class443;
    }
    
    public Class443 method5488() {
	Class443 class443 = Class443.method7137();
	class443.method7148(method5389(187204320), method5399(598362753),
			    method5390((byte) 79));
	return class443;
    }
    
    public Class438 method5489() {
	return aClass438_3200;
    }
    
    public Class438 method5490() {
	return aClass438_3200;
    }
    
    public Class534_Sub36 method5491() {
	if (aClass347_3179 == null || !aClass347_3179.method6131(368443942))
	    return null;
	return aClass347_3179.method6133((byte) -39);
    }
    
    public Class438 method5492() {
	return aClass438_3200;
    }
    
    public Class438 method5493() {
	return aClass438_3188;
    }
    
    public Class438 method5494() {
	return aClass438_3188;
    }
    
    public Class305 method5495() {
	return aClass305_3196;
    }
    
    public float method5496() {
	return aFloat3183;
    }
    
    public void method5497(Class534_Sub18_Sub13 class534_sub18_sub13) {
	aClass9_3189.method581(class534_sub18_sub13,
			       (long) (class534_sub18_sub13.anInt11802
				       * -997430305));
    }
    
    public Class438 method5498() {
	return aClass438_3195;
    }
    
    public void method5499(Class438 class438, float f) throws Exception_Sub2 {
	if (!method5356((short) 19336) || aClass303_3181.aBool3248)
	    throw new Exception_Sub2();
	aClass438_3208.method6992(class438);
	aFloat3198 = f;
    }
    
    public Class438 method5500() {
	return aClass438_3195;
    }
    
    public float method5501() {
	return aFloat3199;
    }
    
    public boolean method5502() {
	return aBool3176;
    }
    
    public boolean method5503() {
	return aBool3176;
    }
    
    public boolean method5504() {
	return aBool3185;
    }
    
    public boolean method5505() {
	return aBool3185;
    }
    
    public boolean method5506() {
	return aBool3185;
    }
    
    static final void method5507(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class81.aClass563_834.method9477(890151513);
    }
    
    static Class292[] method5508(int i) {
	return (new Class292[]
		{ Class292.aClass292_3121, Class292.aClass292_3123,
		  Class292.aClass292_3120 });
    }
}
