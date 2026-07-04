/* Class348_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class348_Sub1 extends Class348
{
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10193;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10194;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10195;
    Class433[] aClass433Array10196;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10197;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10198;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10199;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10200;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10201;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10202;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10203;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10204;
    protected Class269 aClass269_10205;
    int[] anIntArray10206;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10207;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10208;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10209;
    static final int anInt10210 = 1;
    static final int anInt10211 = 2;
    static final int anInt10212 = 4;
    static final int anInt10213 = 8;
    static final int anInt10214 = 16;
    static final int anInt10215 = 32;
    static final int anInt10216 = 64;
    static final int anInt10217 = 128;
    int anInt10218;
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10219;
    static Class433 aClass433_10220 = new Class433();
    Class534_Sub12_Sub1 aClass534_Sub12_Sub1_10221;
    float[] aFloatArray10222 = new float[3];
    
    void method15803() {
	if (aClass269_10205 != null && aClass269_10205.method4911()) {
	    int i = aClass269_10205.method4921(-383017826);
	    int i_0_ = anIntArray10206[i];
	    if ((i_0_ & 0x1) != 0 && aClass534_Sub12_Sub1_10221 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10221,
					   aClass185_Sub1_3591.method14628(),
					   -1733937485);
	    if ((i_0_ & 0x2) != 0) {
		if (aClass534_Sub12_Sub1_10203 != null)
		    aClass269_10205.method4932(aClass534_Sub12_Sub1_10203,
					       aClass185_Sub1_3591
						   .method14623(),
					       -201498749);
		if (aClass534_Sub12_Sub1_10202 != null) {
		    aFloatArray10222[0] = 0.0F;
		    aFloatArray10222[1] = 0.0F;
		    aFloatArray10222[2] = 0.0F;
		    aClass185_Sub1_3591.method3532().method7256
			(aFloatArray10222[0], aFloatArray10222[1],
			 aFloatArray10222[2], aFloatArray10222);
		    aClass269_10205.method4925(aClass534_Sub12_Sub1_10202,
					       aFloatArray10222[0],
					       aFloatArray10222[1],
					       aFloatArray10222[2], 417479047);
		}
	    }
	    if ((i_0_ & 0x10) != 0 && aClass534_Sub12_Sub1_10199 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10199,
					   aClass185_Sub1_3591.method14630(),
					   -1880086693);
	    if ((i_0_ & 0x8) != 0 && aClass534_Sub12_Sub1_10198 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10198,
					   aClass185_Sub1_3591.method14624(),
					   1949604673);
	    if ((i_0_ & 0x4) != 0 && aClass534_Sub12_Sub1_10197 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10197,
					   aClass185_Sub1_3591.method14632(),
					   -355861786);
	    if ((i_0_ & 0x20) != 0 && aClass534_Sub12_Sub1_10200 != null) {
		aClass433_10220.method6844(aClass185_Sub1_3591.method14630(),
					   aClass185_Sub1_3591.method14632());
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10200,
					   aClass433_10220, 140910903);
	    }
	    if ((i_0_ & 0x40) != 0 && aClass534_Sub12_Sub1_10201 != null) {
		aClass433_10220.method6844(aClass185_Sub1_3591.method14623(),
					   aClass185_Sub1_3591.method14632());
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10201,
					   aClass433_10220, 2103103014);
	    }
	    if (aClass185_Sub1_3591.method14749() == 0
		&& (anIntArray10206[i] & 0x80) != 0
		&& aClass534_Sub12_Sub1_10193 != null) {
		aClass269_10205.method4931(aClass534_Sub12_Sub1_10193,
					   aClass185_Sub1_3591.method14678(),
					   1900764840);
		anIntArray10206[i] &= ~0x80;
	    }
	    anIntArray10206[i] = 0;
	}
    }
    
    void method15804(int i, Class446 class446) {
	if (aClass534_Sub12_Sub1_10195 != null) {
	    float[] fs = { aClass185_Sub1_3591.aFloatArray9197[0],
			   aClass185_Sub1_3591.aFloatArray9197[1],
			   aClass185_Sub1_3591.aFloatArray9197[2] };
	    class446.method7268(fs);
	    aClass269_10205.method4925(aClass534_Sub12_Sub1_10195, fs[0],
				       fs[1], fs[2], 417479047);
	}
    }
    
    void method15805(Class446 class446) {
	Class433 class433 = aClass185_Sub1_3591.aClass433_9194;
	class433.method6916(class446);
	int i = aClass269_10205.method4921(1879141054);
	if (aClass534_Sub12_Sub1_10221 != null) {
	    aClass269_10205.method4932(aClass534_Sub12_Sub1_10221, class433,
				       -426348222);
	    anIntArray10206[i] &= ~0x1;
	}
	if (aClass534_Sub12_Sub1_10199 != null) {
	    aClass433_10220.method6844(class433,
				       aClass185_Sub1_3591.method14623());
	    aClass269_10205.method4932(aClass534_Sub12_Sub1_10199,
				       aClass433_10220, -1982756255);
	    anIntArray10206[i] &= ~0x10;
	}
	if (aClass534_Sub12_Sub1_10200 != null) {
	    aClass433_10220.method6844(class433,
				       aClass185_Sub1_3591.method14631());
	    aClass269_10205.method4932(aClass534_Sub12_Sub1_10200,
				       aClass433_10220, -2072438843);
	    anIntArray10206[i] &= ~0x20;
	}
	method15811(i, class446);
	method15809(i, class446);
    }
    
    void method6162() {
	aClass269_10205.method4913();
	anIntArray10206[aClass269_10205.method4921(729168274)] = -1;
	method15807(0);
	method15808();
    }
    
    void method6167() {
	if (aClass269_10205 != null)
	    aClass269_10205.method4910();
    }
    
    void method6159() {
	if (aClass269_10205 != null)
	    aClass269_10205.method4910();
    }
    
    void method15806(Class433 class433) {
	if (aClass269_10205 != null && aClass269_10205.method4911()
	    && aClass185_Sub1_3591.method14749() == 0) {
	    int i = aClass269_10205.method4921(-222036180);
	    if ((anIntArray10206[i] & 0x80) != 0
		&& aClass534_Sub12_Sub1_10193 != null) {
		aClass269_10205.method4931(aClass534_Sub12_Sub1_10193,
					   class433, 2018789597);
		anIntArray10206[i] &= ~0x80;
	    }
	}
    }
    
    void method15807(int i) {
	aClass433Array10196[0].method6840();
	method15822(i);
    }
    
    void method15808() {
	method15810(aClass185_Sub1_3591.aBool9146);
	method15806(aClass185_Sub1_3591.method14678());
	method15824();
	method6170();
    }
    
    void method15809(int i, Class446 class446) {
	if (aClass534_Sub12_Sub1_10195 != null) {
	    float[] fs = { aClass185_Sub1_3591.aFloatArray9197[0],
			   aClass185_Sub1_3591.aFloatArray9197[1],
			   aClass185_Sub1_3591.aFloatArray9197[2] };
	    class446.method7268(fs);
	    aClass269_10205.method4925(aClass534_Sub12_Sub1_10195, fs[0],
				       fs[1], fs[2], 417479047);
	}
    }
    
    void method15810(boolean bool) {
	if (aClass269_10205 != null && aClass269_10205.method4911()) {
	    if (aClass534_Sub12_Sub1_10219 != null)
		aClass269_10205.method4925(aClass534_Sub12_Sub1_10219,
					   (aClass185_Sub1_3591.aFloat9159
					    * aClass185_Sub1_3591.aFloat9205),
					   (aClass185_Sub1_3591.aFloat9292
					    * aClass185_Sub1_3591.aFloat9205),
					   (aClass185_Sub1_3591.aFloat9163
					    * aClass185_Sub1_3591.aFloat9205),
					   417479047);
	    if (aClass534_Sub12_Sub1_10208 != null)
		aClass269_10205.method4925
		    (aClass534_Sub12_Sub1_10208,
		     aClass185_Sub1_3591.aFloatArray9197[0],
		     aClass185_Sub1_3591.aFloatArray9197[1],
		     aClass185_Sub1_3591.aFloatArray9197[2], 417479047);
	    if (aClass534_Sub12_Sub1_10194 != null)
		aClass269_10205.method4925(aClass534_Sub12_Sub1_10194,
					   (aClass185_Sub1_3591.aFloat9159
					    * aClass185_Sub1_3591.aFloat9206),
					   (aClass185_Sub1_3591.aFloat9292
					    * aClass185_Sub1_3591.aFloat9206),
					   (aClass185_Sub1_3591.aFloat9163
					    * aClass185_Sub1_3591.aFloat9206),
					   417479047);
	    if (aClass534_Sub12_Sub1_10207 != null)
		aClass269_10205.method4925(aClass534_Sub12_Sub1_10207,
					   (-aClass185_Sub1_3591.aFloat9159
					    * aClass185_Sub1_3591.aFloat9267),
					   (-aClass185_Sub1_3591.aFloat9292
					    * aClass185_Sub1_3591.aFloat9267),
					   (-aClass185_Sub1_3591.aFloat9163
					    * aClass185_Sub1_3591.aFloat9267),
					   417479047);
	    if (aClass534_Sub12_Sub1_10209 != null)
		aClass269_10205.method4923(aClass534_Sub12_Sub1_10209,
					   64.0F + Math.abs(aClass185_Sub1_3591
							    .aFloatArray9197
							    [1]) * 928.0F,
					   (byte) -13);
	}
    }
    
    void method6170() {
	/* empty */
    }
    
    void method15811(int i, Class446 class446) {
	if (aClass534_Sub12_Sub1_10204 != null) {
	    Class433 class433 = aClass185_Sub1_3591.method14624();
	    float[] fs
		= { class433.aFloatArray4853[12], class433.aFloatArray4853[13],
		    class433.aFloatArray4853[14] };
	    float[] fs_1_ = { 0.0F, 0.0F, 0.0F };
	    class433.method6851(fs_1_);
	    float[] fs_2_ = { 0.0F, 0.0F, 0.0F };
	    aClass185_Sub1_3591.method3532().method7255(0.0F, 0.0F, 0.0F,
							fs_2_);
	    class446.method7257(fs);
	    aClass269_10205.method4925(aClass534_Sub12_Sub1_10204, fs[0],
				       fs[1], fs[2], 417479047);
	}
    }
    
    void method15812(Class446 class446) {
	Class433 class433 = aClass185_Sub1_3591.aClass433_9194;
	class433.method6916(class446);
	int i = aClass269_10205.method4921(588891675);
	if (aClass534_Sub12_Sub1_10221 != null) {
	    aClass269_10205.method4932(aClass534_Sub12_Sub1_10221, class433,
				       -1288141025);
	    anIntArray10206[i] &= ~0x1;
	}
	if (aClass534_Sub12_Sub1_10199 != null) {
	    aClass433_10220.method6844(class433,
				       aClass185_Sub1_3591.method14623());
	    aClass269_10205.method4932(aClass534_Sub12_Sub1_10199,
				       aClass433_10220, 1170658596);
	    anIntArray10206[i] &= ~0x10;
	}
	if (aClass534_Sub12_Sub1_10200 != null) {
	    aClass433_10220.method6844(class433,
				       aClass185_Sub1_3591.method14631());
	    aClass269_10205.method4932(aClass534_Sub12_Sub1_10200,
				       aClass433_10220, -2024460111);
	    anIntArray10206[i] &= ~0x20;
	}
	method15811(i, class446);
	method15809(i, class446);
    }
    
    void method6164() {
	method15812(Class446.aClass446_4905);
    }
    
    void method15813() {
	if (aClass269_10205 != null && aClass269_10205.method4911()) {
	    int i = aClass269_10205.method4921(1701636422);
	    int i_3_ = anIntArray10206[i];
	    if ((i_3_ & 0x1) != 0 && aClass534_Sub12_Sub1_10221 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10221,
					   aClass185_Sub1_3591.method14628(),
					   -2066581398);
	    if ((i_3_ & 0x2) != 0) {
		if (aClass534_Sub12_Sub1_10203 != null)
		    aClass269_10205.method4932(aClass534_Sub12_Sub1_10203,
					       aClass185_Sub1_3591
						   .method14623(),
					       1672940951);
		if (aClass534_Sub12_Sub1_10202 != null) {
		    aFloatArray10222[0] = 0.0F;
		    aFloatArray10222[1] = 0.0F;
		    aFloatArray10222[2] = 0.0F;
		    aClass185_Sub1_3591.method3532().method7256
			(aFloatArray10222[0], aFloatArray10222[1],
			 aFloatArray10222[2], aFloatArray10222);
		    aClass269_10205.method4925(aClass534_Sub12_Sub1_10202,
					       aFloatArray10222[0],
					       aFloatArray10222[1],
					       aFloatArray10222[2], 417479047);
		}
	    }
	    if ((i_3_ & 0x10) != 0 && aClass534_Sub12_Sub1_10199 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10199,
					   aClass185_Sub1_3591.method14630(),
					   -1550745562);
	    if ((i_3_ & 0x8) != 0 && aClass534_Sub12_Sub1_10198 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10198,
					   aClass185_Sub1_3591.method14624(),
					   639313713);
	    if ((i_3_ & 0x4) != 0 && aClass534_Sub12_Sub1_10197 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10197,
					   aClass185_Sub1_3591.method14632(),
					   -103444541);
	    if ((i_3_ & 0x20) != 0 && aClass534_Sub12_Sub1_10200 != null) {
		aClass433_10220.method6844(aClass185_Sub1_3591.method14630(),
					   aClass185_Sub1_3591.method14632());
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10200,
					   aClass433_10220, -1613648652);
	    }
	    if ((i_3_ & 0x40) != 0 && aClass534_Sub12_Sub1_10201 != null) {
		aClass433_10220.method6844(aClass185_Sub1_3591.method14623(),
					   aClass185_Sub1_3591.method14632());
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10201,
					   aClass433_10220, -1053561068);
	    }
	    if (aClass185_Sub1_3591.method14749() == 0
		&& (anIntArray10206[i] & 0x80) != 0
		&& aClass534_Sub12_Sub1_10193 != null) {
		aClass269_10205.method4931(aClass534_Sub12_Sub1_10193,
					   aClass185_Sub1_3591.method14678(),
					   832635450);
		anIntArray10206[i] &= ~0x80;
	    }
	    anIntArray10206[i] = 0;
	}
    }
    
    void method15814(int i, Class446 class446) {
	if (aClass534_Sub12_Sub1_10195 != null) {
	    float[] fs = { aClass185_Sub1_3591.aFloatArray9197[0],
			   aClass185_Sub1_3591.aFloatArray9197[1],
			   aClass185_Sub1_3591.aFloatArray9197[2] };
	    class446.method7268(fs);
	    aClass269_10205.method4925(aClass534_Sub12_Sub1_10195, fs[0],
				       fs[1], fs[2], 417479047);
	}
    }
    
    void method6166() {
	if (aClass269_10205 != null)
	    aClass269_10205.method4910();
    }
    
    abstract boolean method15815() throws Exception_Sub4;
    
    void method6165() {
	/* empty */
    }
    
    void method6169() {
	/* empty */
    }
    
    void method6175() {
	method15812(Class446.aClass446_4905);
    }
    
    void method6163() {
	aClass269_10205.method4913();
	anIntArray10206[aClass269_10205.method4921(229607178)] = -1;
	method15807(0);
	method15808();
    }
    
    boolean method15816(String string) throws Exception_Sub4 {
	aClass269_10205 = aClass185_Sub1_3591.method14589(string);
	if (aClass269_10205 == null)
	    throw new Exception_Sub4("");
	aClass534_Sub12_Sub1_10193
	    = aClass269_10205.method4975("textureMatrix", -2136211102);
	aClass534_Sub12_Sub1_10221
	    = aClass269_10205.method4975("modelMatrix", -1820480638);
	aClass534_Sub12_Sub1_10203
	    = aClass269_10205.method4975("viewMatrix", -1662321403);
	aClass534_Sub12_Sub1_10197
	    = aClass269_10205.method4975("projectionMatrix", -1080157073);
	aClass534_Sub12_Sub1_10199
	    = aClass269_10205.method4975("modelViewMatrix", -1088961843);
	aClass534_Sub12_Sub1_10200
	    = aClass269_10205.method4975("modelViewProjectionMatrix",
					 -2060952734);
	aClass534_Sub12_Sub1_10201
	    = aClass269_10205.method4975("viewProjectionMatrix", -1111253652);
	aClass534_Sub12_Sub1_10219
	    = aClass269_10205.method4975("ambientColour", -1965839357);
	aClass534_Sub12_Sub1_10208
	    = aClass269_10205.method4975("sunDirection", -853953079);
	aClass534_Sub12_Sub1_10194
	    = aClass269_10205.method4975("sunColour", -979114835);
	aClass534_Sub12_Sub1_10207
	    = aClass269_10205.method4975("antiSunColour", -1759173327);
	aClass534_Sub12_Sub1_10209
	    = aClass269_10205.method4975("sunExponent", -1794977763);
	aClass534_Sub12_Sub1_10202
	    = aClass269_10205.method4975("eyePosition", -1667446366);
	aClass534_Sub12_Sub1_10204
	    = aClass269_10205.method4975("eyePositionOS", -1799852121);
	aClass534_Sub12_Sub1_10195
	    = aClass269_10205.method4975("sunDirectionOS", -1207536605);
	if (!method15815()) {
	    aClass269_10205 = null;
	    aClass534_Sub12_Sub1_10193 = null;
	    aClass534_Sub12_Sub1_10221 = null;
	    aClass534_Sub12_Sub1_10203 = null;
	    aClass534_Sub12_Sub1_10197 = null;
	    aClass534_Sub12_Sub1_10199 = null;
	    aClass534_Sub12_Sub1_10200 = null;
	    aClass534_Sub12_Sub1_10201 = null;
	    aClass534_Sub12_Sub1_10219 = null;
	    aClass534_Sub12_Sub1_10208 = null;
	    aClass534_Sub12_Sub1_10194 = null;
	    aClass534_Sub12_Sub1_10207 = null;
	    aClass534_Sub12_Sub1_10209 = null;
	    aClass534_Sub12_Sub1_10202 = null;
	    aClass534_Sub12_Sub1_10204 = null;
	    aClass534_Sub12_Sub1_10195 = null;
	    return false;
	}
	if (aClass269_10205.method4920(1154360466) == null) {
	    Class278 class278 = aClass269_10205.method4918(-275805503);
	    if (class278 == null)
		throw new Exception_Sub4(new StringBuilder().append
					     (aClass269_10205
						  .method4912((byte) 25))
					     .append
					     ("").toString());
	    aClass269_10205.method4919(class278);
	}
	anInt10218 = aClass269_10205.method4984((byte) 81);
	anIntArray10206 = new int[anInt10218];
	return true;
    }
    
    boolean method15817(String string) throws Exception_Sub4 {
	aClass269_10205 = aClass185_Sub1_3591.method14589(string);
	if (aClass269_10205 == null)
	    throw new Exception_Sub4("");
	aClass534_Sub12_Sub1_10193
	    = aClass269_10205.method4975("textureMatrix", -1002750575);
	aClass534_Sub12_Sub1_10221
	    = aClass269_10205.method4975("modelMatrix", -1158746520);
	aClass534_Sub12_Sub1_10203
	    = aClass269_10205.method4975("viewMatrix", -922080562);
	aClass534_Sub12_Sub1_10197
	    = aClass269_10205.method4975("projectionMatrix", -838267875);
	aClass534_Sub12_Sub1_10199
	    = aClass269_10205.method4975("modelViewMatrix", -1714192627);
	aClass534_Sub12_Sub1_10200
	    = aClass269_10205.method4975("modelViewProjectionMatrix",
					 -1351093216);
	aClass534_Sub12_Sub1_10201
	    = aClass269_10205.method4975("viewProjectionMatrix", -1214141402);
	aClass534_Sub12_Sub1_10219
	    = aClass269_10205.method4975("ambientColour", -1478041862);
	aClass534_Sub12_Sub1_10208
	    = aClass269_10205.method4975("sunDirection", -1701432544);
	aClass534_Sub12_Sub1_10194
	    = aClass269_10205.method4975("sunColour", -1486324690);
	aClass534_Sub12_Sub1_10207
	    = aClass269_10205.method4975("antiSunColour", -1338595937);
	aClass534_Sub12_Sub1_10209
	    = aClass269_10205.method4975("sunExponent", -1438505496);
	aClass534_Sub12_Sub1_10202
	    = aClass269_10205.method4975("eyePosition", -1789711759);
	aClass534_Sub12_Sub1_10204
	    = aClass269_10205.method4975("eyePositionOS", -2030106308);
	aClass534_Sub12_Sub1_10195
	    = aClass269_10205.method4975("sunDirectionOS", -2082975497);
	if (!method15815()) {
	    aClass269_10205 = null;
	    aClass534_Sub12_Sub1_10193 = null;
	    aClass534_Sub12_Sub1_10221 = null;
	    aClass534_Sub12_Sub1_10203 = null;
	    aClass534_Sub12_Sub1_10197 = null;
	    aClass534_Sub12_Sub1_10199 = null;
	    aClass534_Sub12_Sub1_10200 = null;
	    aClass534_Sub12_Sub1_10201 = null;
	    aClass534_Sub12_Sub1_10219 = null;
	    aClass534_Sub12_Sub1_10208 = null;
	    aClass534_Sub12_Sub1_10194 = null;
	    aClass534_Sub12_Sub1_10207 = null;
	    aClass534_Sub12_Sub1_10209 = null;
	    aClass534_Sub12_Sub1_10202 = null;
	    aClass534_Sub12_Sub1_10204 = null;
	    aClass534_Sub12_Sub1_10195 = null;
	    return false;
	}
	if (aClass269_10205.method4920(1584690342) == null) {
	    Class278 class278 = aClass269_10205.method4918(-167146404);
	    if (class278 == null)
		throw new Exception_Sub4(new StringBuilder().append
					     (aClass269_10205
						  .method4912((byte) 49))
					     .append
					     ("").toString());
	    aClass269_10205.method4919(class278);
	}
	anInt10218 = aClass269_10205.method4984((byte) 60);
	anIntArray10206 = new int[anInt10218];
	return true;
    }
    
    abstract boolean method15818() throws Exception_Sub4;
    
    void method15819(Class446 class446) {
	Class433 class433 = aClass185_Sub1_3591.aClass433_9194;
	class433.method6916(class446);
	int i = aClass269_10205.method4921(1842575086);
	if (aClass534_Sub12_Sub1_10221 != null) {
	    aClass269_10205.method4932(aClass534_Sub12_Sub1_10221, class433,
				       2061184542);
	    anIntArray10206[i] &= ~0x1;
	}
	if (aClass534_Sub12_Sub1_10199 != null) {
	    aClass433_10220.method6844(class433,
				       aClass185_Sub1_3591.method14623());
	    aClass269_10205.method4932(aClass534_Sub12_Sub1_10199,
				       aClass433_10220, 1743177939);
	    anIntArray10206[i] &= ~0x10;
	}
	if (aClass534_Sub12_Sub1_10200 != null) {
	    aClass433_10220.method6844(class433,
				       aClass185_Sub1_3591.method14631());
	    aClass269_10205.method4932(aClass534_Sub12_Sub1_10200,
				       aClass433_10220, 864216132);
	    anIntArray10206[i] &= ~0x20;
	}
	method15811(i, class446);
	method15809(i, class446);
    }
    
    void method15820() {
	method15810(aClass185_Sub1_3591.aBool9146);
	method15806(aClass185_Sub1_3591.method14678());
	method15824();
	method6170();
    }
    
    void method15821(Class433 class433) {
	if (aClass269_10205 != null && aClass269_10205.method4911()
	    && aClass185_Sub1_3591.method14749() == 0) {
	    int i = aClass269_10205.method4921(247469783);
	    if ((anIntArray10206[i] & 0x80) != 0
		&& aClass534_Sub12_Sub1_10193 != null) {
		aClass269_10205.method4931(aClass534_Sub12_Sub1_10193,
					   class433, 1043833909);
		anIntArray10206[i] &= ~0x80;
	    }
	}
    }
    
    void method15822(int i) {
	for (int i_4_ = 0; i_4_ < anInt10218; i_4_++)
	    anIntArray10206[i_4_] |= 128 << i;
    }
    
    void method15823(Class433 class433) {
	if (aClass269_10205 != null && aClass269_10205.method4911()
	    && aClass185_Sub1_3591.method14749() == 0) {
	    int i = aClass269_10205.method4921(1894877341);
	    if ((anIntArray10206[i] & 0x80) != 0
		&& aClass534_Sub12_Sub1_10193 != null) {
		aClass269_10205.method4931(aClass534_Sub12_Sub1_10193,
					   class433, 843712151);
		anIntArray10206[i] &= ~0x80;
	    }
	}
    }
    
    void method15824() {
	if (aClass269_10205 != null && aClass269_10205.method4911()) {
	    int i = aClass269_10205.method4921(1753639678);
	    int i_5_ = anIntArray10206[i];
	    if ((i_5_ & 0x1) != 0 && aClass534_Sub12_Sub1_10221 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10221,
					   aClass185_Sub1_3591.method14628(),
					   -204332320);
	    if ((i_5_ & 0x2) != 0) {
		if (aClass534_Sub12_Sub1_10203 != null)
		    aClass269_10205.method4932(aClass534_Sub12_Sub1_10203,
					       aClass185_Sub1_3591
						   .method14623(),
					       774164319);
		if (aClass534_Sub12_Sub1_10202 != null) {
		    aFloatArray10222[0] = 0.0F;
		    aFloatArray10222[1] = 0.0F;
		    aFloatArray10222[2] = 0.0F;
		    aClass185_Sub1_3591.method3532().method7256
			(aFloatArray10222[0], aFloatArray10222[1],
			 aFloatArray10222[2], aFloatArray10222);
		    aClass269_10205.method4925(aClass534_Sub12_Sub1_10202,
					       aFloatArray10222[0],
					       aFloatArray10222[1],
					       aFloatArray10222[2], 417479047);
		}
	    }
	    if ((i_5_ & 0x10) != 0 && aClass534_Sub12_Sub1_10199 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10199,
					   aClass185_Sub1_3591.method14630(),
					   462866918);
	    if ((i_5_ & 0x8) != 0 && aClass534_Sub12_Sub1_10198 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10198,
					   aClass185_Sub1_3591.method14624(),
					   391881175);
	    if ((i_5_ & 0x4) != 0 && aClass534_Sub12_Sub1_10197 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10197,
					   aClass185_Sub1_3591.method14632(),
					   -562508039);
	    if ((i_5_ & 0x20) != 0 && aClass534_Sub12_Sub1_10200 != null) {
		aClass433_10220.method6844(aClass185_Sub1_3591.method14630(),
					   aClass185_Sub1_3591.method14632());
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10200,
					   aClass433_10220, 1039526069);
	    }
	    if ((i_5_ & 0x40) != 0 && aClass534_Sub12_Sub1_10201 != null) {
		aClass433_10220.method6844(aClass185_Sub1_3591.method14623(),
					   aClass185_Sub1_3591.method14632());
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10201,
					   aClass433_10220, -507778722);
	    }
	    if (aClass185_Sub1_3591.method14749() == 0
		&& (anIntArray10206[i] & 0x80) != 0
		&& aClass534_Sub12_Sub1_10193 != null) {
		aClass269_10205.method4931(aClass534_Sub12_Sub1_10193,
					   aClass185_Sub1_3591.method14678(),
					   505615053);
		anIntArray10206[i] &= ~0x80;
	    }
	    anIntArray10206[i] = 0;
	}
    }
    
    void method6174() {
	method15812(Class446.aClass446_4905);
    }
    
    boolean method15825(String string) throws Exception_Sub4 {
	aClass269_10205 = aClass185_Sub1_3591.method14589(string);
	if (aClass269_10205 == null)
	    throw new Exception_Sub4("");
	aClass534_Sub12_Sub1_10193
	    = aClass269_10205.method4975("textureMatrix", -1538000614);
	aClass534_Sub12_Sub1_10221
	    = aClass269_10205.method4975("modelMatrix", -1317061129);
	aClass534_Sub12_Sub1_10203
	    = aClass269_10205.method4975("viewMatrix", -987940482);
	aClass534_Sub12_Sub1_10197
	    = aClass269_10205.method4975("projectionMatrix", -1700836137);
	aClass534_Sub12_Sub1_10199
	    = aClass269_10205.method4975("modelViewMatrix", -1862273225);
	aClass534_Sub12_Sub1_10200
	    = aClass269_10205.method4975("modelViewProjectionMatrix",
					 -1126961242);
	aClass534_Sub12_Sub1_10201
	    = aClass269_10205.method4975("viewProjectionMatrix", -1598550324);
	aClass534_Sub12_Sub1_10219
	    = aClass269_10205.method4975("ambientColour", -1357663361);
	aClass534_Sub12_Sub1_10208
	    = aClass269_10205.method4975("sunDirection", -1761044318);
	aClass534_Sub12_Sub1_10194
	    = aClass269_10205.method4975("sunColour", -1619056412);
	aClass534_Sub12_Sub1_10207
	    = aClass269_10205.method4975("antiSunColour", -862566824);
	aClass534_Sub12_Sub1_10209
	    = aClass269_10205.method4975("sunExponent", -1595480011);
	aClass534_Sub12_Sub1_10202
	    = aClass269_10205.method4975("eyePosition", -1022097184);
	aClass534_Sub12_Sub1_10204
	    = aClass269_10205.method4975("eyePositionOS", -1445323238);
	aClass534_Sub12_Sub1_10195
	    = aClass269_10205.method4975("sunDirectionOS", -1872990951);
	if (!method15815()) {
	    aClass269_10205 = null;
	    aClass534_Sub12_Sub1_10193 = null;
	    aClass534_Sub12_Sub1_10221 = null;
	    aClass534_Sub12_Sub1_10203 = null;
	    aClass534_Sub12_Sub1_10197 = null;
	    aClass534_Sub12_Sub1_10199 = null;
	    aClass534_Sub12_Sub1_10200 = null;
	    aClass534_Sub12_Sub1_10201 = null;
	    aClass534_Sub12_Sub1_10219 = null;
	    aClass534_Sub12_Sub1_10208 = null;
	    aClass534_Sub12_Sub1_10194 = null;
	    aClass534_Sub12_Sub1_10207 = null;
	    aClass534_Sub12_Sub1_10209 = null;
	    aClass534_Sub12_Sub1_10202 = null;
	    aClass534_Sub12_Sub1_10204 = null;
	    aClass534_Sub12_Sub1_10195 = null;
	    return false;
	}
	if (aClass269_10205.method4920(1647852796) == null) {
	    Class278 class278 = aClass269_10205.method4918(791373849);
	    if (class278 == null)
		throw new Exception_Sub4(new StringBuilder().append
					     (aClass269_10205
						  .method4912((byte) 62))
					     .append
					     ("").toString());
	    aClass269_10205.method4919(class278);
	}
	anInt10218 = aClass269_10205.method4984((byte) 101);
	anIntArray10206 = new int[anInt10218];
	return true;
    }
    
    void method15826() {
	if (aClass269_10205 != null && aClass269_10205.method4911()) {
	    int i = aClass269_10205.method4921(1381565699);
	    int i_6_ = anIntArray10206[i];
	    if ((i_6_ & 0x1) != 0 && aClass534_Sub12_Sub1_10221 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10221,
					   aClass185_Sub1_3591.method14628(),
					   -1950792845);
	    if ((i_6_ & 0x2) != 0) {
		if (aClass534_Sub12_Sub1_10203 != null)
		    aClass269_10205.method4932(aClass534_Sub12_Sub1_10203,
					       aClass185_Sub1_3591
						   .method14623(),
					       607250290);
		if (aClass534_Sub12_Sub1_10202 != null) {
		    aFloatArray10222[0] = 0.0F;
		    aFloatArray10222[1] = 0.0F;
		    aFloatArray10222[2] = 0.0F;
		    aClass185_Sub1_3591.method3532().method7256
			(aFloatArray10222[0], aFloatArray10222[1],
			 aFloatArray10222[2], aFloatArray10222);
		    aClass269_10205.method4925(aClass534_Sub12_Sub1_10202,
					       aFloatArray10222[0],
					       aFloatArray10222[1],
					       aFloatArray10222[2], 417479047);
		}
	    }
	    if ((i_6_ & 0x10) != 0 && aClass534_Sub12_Sub1_10199 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10199,
					   aClass185_Sub1_3591.method14630(),
					   -1097823628);
	    if ((i_6_ & 0x8) != 0 && aClass534_Sub12_Sub1_10198 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10198,
					   aClass185_Sub1_3591.method14624(),
					   1348645715);
	    if ((i_6_ & 0x4) != 0 && aClass534_Sub12_Sub1_10197 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10197,
					   aClass185_Sub1_3591.method14632(),
					   -694616324);
	    if ((i_6_ & 0x20) != 0 && aClass534_Sub12_Sub1_10200 != null) {
		aClass433_10220.method6844(aClass185_Sub1_3591.method14630(),
					   aClass185_Sub1_3591.method14632());
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10200,
					   aClass433_10220, -485828912);
	    }
	    if ((i_6_ & 0x40) != 0 && aClass534_Sub12_Sub1_10201 != null) {
		aClass433_10220.method6844(aClass185_Sub1_3591.method14623(),
					   aClass185_Sub1_3591.method14632());
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10201,
					   aClass433_10220, -1576276381);
	    }
	    if (aClass185_Sub1_3591.method14749() == 0
		&& (anIntArray10206[i] & 0x80) != 0
		&& aClass534_Sub12_Sub1_10193 != null) {
		aClass269_10205.method4931(aClass534_Sub12_Sub1_10193,
					   aClass185_Sub1_3591.method14678(),
					   258323241);
		anIntArray10206[i] &= ~0x80;
	    }
	    anIntArray10206[i] = 0;
	}
    }
    
    void method15827(int i, Class446 class446) {
	if (aClass534_Sub12_Sub1_10204 != null) {
	    Class433 class433 = aClass185_Sub1_3591.method14624();
	    float[] fs
		= { class433.aFloatArray4853[12], class433.aFloatArray4853[13],
		    class433.aFloatArray4853[14] };
	    float[] fs_7_ = { 0.0F, 0.0F, 0.0F };
	    class433.method6851(fs_7_);
	    float[] fs_8_ = { 0.0F, 0.0F, 0.0F };
	    aClass185_Sub1_3591.method3532().method7255(0.0F, 0.0F, 0.0F,
							fs_8_);
	    class446.method7257(fs);
	    aClass269_10205.method4925(aClass534_Sub12_Sub1_10204, fs[0],
				       fs[1], fs[2], 417479047);
	}
    }
    
    void method15828(int i, Class446 class446) {
	if (aClass534_Sub12_Sub1_10204 != null) {
	    Class433 class433 = aClass185_Sub1_3591.method14624();
	    float[] fs
		= { class433.aFloatArray4853[12], class433.aFloatArray4853[13],
		    class433.aFloatArray4853[14] };
	    float[] fs_9_ = { 0.0F, 0.0F, 0.0F };
	    class433.method6851(fs_9_);
	    float[] fs_10_ = { 0.0F, 0.0F, 0.0F };
	    aClass185_Sub1_3591.method3532().method7255(0.0F, 0.0F, 0.0F,
							fs_10_);
	    class446.method7257(fs);
	    aClass269_10205.method4925(aClass534_Sub12_Sub1_10204, fs[0],
				       fs[1], fs[2], 417479047);
	}
    }
    
    void method15829() {
	method15810(aClass185_Sub1_3591.aBool9146);
	method15806(aClass185_Sub1_3591.method14678());
	method15824();
	method6170();
    }
    
    void method15830(Class433 class433) {
	if (aClass269_10205 != null && aClass269_10205.method4911()
	    && aClass185_Sub1_3591.method14749() == 0) {
	    int i = aClass269_10205.method4921(577656785);
	    if ((anIntArray10206[i] & 0x80) != 0
		&& aClass534_Sub12_Sub1_10193 != null) {
		aClass269_10205.method4931(aClass534_Sub12_Sub1_10193,
					   class433, 1568476801);
		anIntArray10206[i] &= ~0x80;
	    }
	}
    }
    
    void method15831(int i, Class446 class446) {
	if (aClass534_Sub12_Sub1_10195 != null) {
	    float[] fs = { aClass185_Sub1_3591.aFloatArray9197[0],
			   aClass185_Sub1_3591.aFloatArray9197[1],
			   aClass185_Sub1_3591.aFloatArray9197[2] };
	    class446.method7268(fs);
	    aClass269_10205.method4925(aClass534_Sub12_Sub1_10195, fs[0],
				       fs[1], fs[2], 417479047);
	}
    }
    
    void method15832(boolean bool) {
	if (aClass269_10205 != null && aClass269_10205.method4911()) {
	    if (aClass534_Sub12_Sub1_10219 != null)
		aClass269_10205.method4925(aClass534_Sub12_Sub1_10219,
					   (aClass185_Sub1_3591.aFloat9159
					    * aClass185_Sub1_3591.aFloat9205),
					   (aClass185_Sub1_3591.aFloat9292
					    * aClass185_Sub1_3591.aFloat9205),
					   (aClass185_Sub1_3591.aFloat9163
					    * aClass185_Sub1_3591.aFloat9205),
					   417479047);
	    if (aClass534_Sub12_Sub1_10208 != null)
		aClass269_10205.method4925
		    (aClass534_Sub12_Sub1_10208,
		     aClass185_Sub1_3591.aFloatArray9197[0],
		     aClass185_Sub1_3591.aFloatArray9197[1],
		     aClass185_Sub1_3591.aFloatArray9197[2], 417479047);
	    if (aClass534_Sub12_Sub1_10194 != null)
		aClass269_10205.method4925(aClass534_Sub12_Sub1_10194,
					   (aClass185_Sub1_3591.aFloat9159
					    * aClass185_Sub1_3591.aFloat9206),
					   (aClass185_Sub1_3591.aFloat9292
					    * aClass185_Sub1_3591.aFloat9206),
					   (aClass185_Sub1_3591.aFloat9163
					    * aClass185_Sub1_3591.aFloat9206),
					   417479047);
	    if (aClass534_Sub12_Sub1_10207 != null)
		aClass269_10205.method4925(aClass534_Sub12_Sub1_10207,
					   (-aClass185_Sub1_3591.aFloat9159
					    * aClass185_Sub1_3591.aFloat9267),
					   (-aClass185_Sub1_3591.aFloat9292
					    * aClass185_Sub1_3591.aFloat9267),
					   (-aClass185_Sub1_3591.aFloat9163
					    * aClass185_Sub1_3591.aFloat9267),
					   417479047);
	    if (aClass534_Sub12_Sub1_10209 != null)
		aClass269_10205.method4923(aClass534_Sub12_Sub1_10209,
					   64.0F + Math.abs(aClass185_Sub1_3591
							    .aFloatArray9197
							    [1]) * 928.0F,
					   (byte) -40);
	}
    }
    
    void method15833(int i) {
	for (int i_11_ = 0; i_11_ < anInt10218; i_11_++)
	    anIntArray10206[i_11_] |= 128 << i;
    }
    
    void method15834(int i) {
	for (int i_12_ = 0; i_12_ < anInt10218; i_12_++)
	    anIntArray10206[i_12_] |= 128 << i;
    }
    
    Class348_Sub1(Class185_Sub1 class185_sub1) {
	super(class185_sub1);
	new Class446();
	aClass433Array10196 = new Class433[aClass185_Sub1_3591.anInt9269];
	for (int i = 0; i < aClass185_Sub1_3591.anInt9269; i++)
	    aClass433Array10196[i] = new Class433();
    }
    
    void method15835() {
	if (aClass269_10205 != null && aClass269_10205.method4911()) {
	    int i = aClass269_10205.method4921(771846095);
	    int i_13_ = anIntArray10206[i];
	    if ((i_13_ & 0x1) != 0 && aClass534_Sub12_Sub1_10221 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10221,
					   aClass185_Sub1_3591.method14628(),
					   401800546);
	    if ((i_13_ & 0x2) != 0) {
		if (aClass534_Sub12_Sub1_10203 != null)
		    aClass269_10205.method4932(aClass534_Sub12_Sub1_10203,
					       aClass185_Sub1_3591
						   .method14623(),
					       -418484601);
		if (aClass534_Sub12_Sub1_10202 != null) {
		    aFloatArray10222[0] = 0.0F;
		    aFloatArray10222[1] = 0.0F;
		    aFloatArray10222[2] = 0.0F;
		    aClass185_Sub1_3591.method3532().method7256
			(aFloatArray10222[0], aFloatArray10222[1],
			 aFloatArray10222[2], aFloatArray10222);
		    aClass269_10205.method4925(aClass534_Sub12_Sub1_10202,
					       aFloatArray10222[0],
					       aFloatArray10222[1],
					       aFloatArray10222[2], 417479047);
		}
	    }
	    if ((i_13_ & 0x10) != 0 && aClass534_Sub12_Sub1_10199 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10199,
					   aClass185_Sub1_3591.method14630(),
					   -441539457);
	    if ((i_13_ & 0x8) != 0 && aClass534_Sub12_Sub1_10198 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10198,
					   aClass185_Sub1_3591.method14624(),
					   1035283101);
	    if ((i_13_ & 0x4) != 0 && aClass534_Sub12_Sub1_10197 != null)
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10197,
					   aClass185_Sub1_3591.method14632(),
					   1947279135);
	    if ((i_13_ & 0x20) != 0 && aClass534_Sub12_Sub1_10200 != null) {
		aClass433_10220.method6844(aClass185_Sub1_3591.method14630(),
					   aClass185_Sub1_3591.method14632());
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10200,
					   aClass433_10220, 29760438);
	    }
	    if ((i_13_ & 0x40) != 0 && aClass534_Sub12_Sub1_10201 != null) {
		aClass433_10220.method6844(aClass185_Sub1_3591.method14623(),
					   aClass185_Sub1_3591.method14632());
		aClass269_10205.method4932(aClass534_Sub12_Sub1_10201,
					   aClass433_10220, 558290354);
	    }
	    if (aClass185_Sub1_3591.method14749() == 0
		&& (anIntArray10206[i] & 0x80) != 0
		&& aClass534_Sub12_Sub1_10193 != null) {
		aClass269_10205.method4931(aClass534_Sub12_Sub1_10193,
					   aClass185_Sub1_3591.method14678(),
					   972253568);
		anIntArray10206[i] &= ~0x80;
	    }
	    anIntArray10206[i] = 0;
	}
    }
}
