/* Class616 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class616
{
    Class185 aClass185_8056;
    static Class165 aClass165_8057;
    static Class505 aClass505_8058;
    static int anInt8059;
    float aFloat8060;
    Class634 aClass634_8061;
    int anInt8062 = 0;
    int anInt8063 = -838136551;
    long aLong8064 = 0L;
    boolean aBool8065 = false;
    Class634 aClass634_8066;
    float aFloat8067;
    float[] aFloatArray8068;
    Class634 aClass634_8069;
    float aFloat8070;
    Class653 aClass653_8071;
    Class438 aClass438_8072 = new Class438(-50.0F, -60.0F, -50.0F);
    Class203 aClass203_8073 = new Class203(8);
    public static int anInt8074 = 1285368653;
    Class203 aClass203_8075;
    Class472 aClass472_8076;
    Class634[][] aClass634ArrayArray8077;
    float aFloat8078;
    Class634 aClass634_8079;
    boolean aBool8080;
    Class634 aClass634_8081;
    boolean aBool8082;
    int[] anIntArray8083;
    Class203 aClass203_8084 = new Class203(9);
    float aFloat8085;
    
    public void method10140(int i) {
	for (int i_0_ = 0; i_0_ < aClass634ArrayArray8077.length; i_0_++) {
	    for (int i_1_ = 0; i_1_ < aClass634ArrayArray8077[i_0_].length;
		 i_1_++)
		aClass634ArrayArray8077[i_0_][i_1_] = aClass634_8066;
	}
    }
    
    public void method10141(Class512 class512, byte i) {
	Class634 class634 = method10154(class512, (byte) 1);
	if (null != aClass653_8071) {
	    aClass634_8061.method10502(class634, (byte) 38);
	    aClass634_8061.method10525(this, aClass653_8071, -2006099165);
	    method10193(aClass634_8061, aClass653_8071.method10760((byte) 110),
			-1832178541);
	} else
	    method10193(class634, anInt8059 * -1326181739, -1834580369);
	method10156(1996270185);
	method10196(-965609844);
	method10162(1371676034);
    }
    
    void method10142() {
	aBool8082 = false;
	aFloat8067 = 1.0F;
	aFloat8078 = 0.0F;
	aFloat8070 = 1.0F;
	aFloat8060 = 0.0F;
	aFloat8085 = 1.0F;
    }
    
    Class170 method10143(int i) {
	Class170 class170 = (Class170) aClass203_8075.method3871((long) i);
	if (class170 != null)
	    return class170;
	Class169 class169 = Class178.method2945(aClass472_8076, i);
	if (null != class169 && class169.method2762() == 256
	    && class169.method2763() == 16) {
	    int[] is = class169.method2766(false);
	    class170 = aClass185_8056.method3605(is);
	    if (null != class170)
		aClass203_8075.method3893(class170, (long) i);
	}
	return class170;
    }
    
    public Class653 method10144(int i) {
	return aClass653_8071;
    }
    
    public Class634 method10145(byte i) {
	return aClass634_8079;
    }
    
    public void method10146(Class616 class616_2_, int i) {
	aClass634_8079.method10502(class616_2_.aClass634_8079, (byte) 67);
	aClass634_8081.method10502(class616_2_.aClass634_8081, (byte) 79);
	aClass634_8069.method10502(class616_2_.aClass634_8069, (byte) 73);
	aLong8064 = class616_2_.aLong8064 * 1L;
	anInt8062 = 1 * class616_2_.anInt8062;
	anInt8063 = 1 * class616_2_.anInt8063;
    }
    
    public void method10147(int i) {
	aClass203_8073.method3877(-822689164);
	aClass203_8084.method3877(-75215484);
	aClass203_8075.method3877(1181656032);
    }
    
    Class165 method10148(int i, int i_3_) {
	Class165 class165 = (Class165) aClass203_8073.method3871((long) i);
	if (class165 != null)
	    return class165;
	class165 = aClass185_8056.method3485(i);
	aClass203_8073.method3893(class165, (long) i);
	return class165;
    }
    
    Class505 method10149(int i, int i_4_, int i_5_, int i_6_, byte i_7_) {
	long l = (((long) i_4_ & 0xffffL) << 48 | ((long) i_5_ & 0xffffL) << 32
		  | ((long) i_6_ & 0xffffL) << 16 | (long) i & 0xffffL);
	Class505 class505 = (Class505) aClass203_8084.method3871(l);
	if (class505 == null) {
	    class505 = Class171.method2881(i, i_4_, i_5_, i_6_,
					   Class184.aClass44_Sub6_1988,
					   Class492.aClass44_Sub10_5341,
					   1369528590);
	    aClass203_8084.method3893(class505, l);
	}
	return class505;
    }
    
    Class170 method10150(int i, byte i_8_) {
	Class170 class170 = (Class170) aClass203_8075.method3871((long) i);
	if (class170 != null)
	    return class170;
	Class169 class169 = Class178.method2945(aClass472_8076, i);
	if (null != class169 && class169.method2762() == 256
	    && class169.method2763() == 16) {
	    int[] is = class169.method2766(false);
	    class170 = aClass185_8056.method3605(is);
	    if (null != class170)
		aClass203_8075.method3893(class170, (long) i);
	}
	return class170;
    }
    
    public void method10151(int i, int i_9_, Class634 class634, byte i_10_) {
	aClass634ArrayArray8077[i][i_9_] = class634;
    }
    
    public void method10152(Class512 class512, int i) {
	Class634 class634 = method10154(class512, (byte) 1);
	if (null != aClass653_8071) {
	    aClass634_8061.method10502(class634, (byte) 100);
	    aClass634_8061.method10525(this, aClass653_8071, -1758166722);
	    method10193(aClass634_8061, aClass653_8071.method10760((byte) 5),
			-1696756340);
	} else
	    method10193(class634, -1326181739 * anInt8059, 569179073);
	method10156(2087585125);
	method10172(424735432);
	method10202(1185675251);
	method10164(-639685980);
    }
    
    public void method10153(int i, int i_11_, int i_12_) {
	Class634 class634 = aClass634ArrayArray8077[i][i_11_];
	if (null != class634)
	    aClass438_8072.method6992(class634.aClass438_8285);
	method10196(-1295539334);
    }
    
    Class634 method10154(Class512 class512, byte i) {
	Object object = null;
	int i_13_ = -1;
	int i_14_ = -1;
	if (Class250.method4611(client.anInt11039 * -1850530127, (byte) -1)
	    || Class192.method3789(-1850530127 * client.anInt11039,
				   -1919071415)) {
	    i_13_ = Class200_Sub13.anInt9937 * -116109187 >> 12;
	    i_14_ = Class636.anInt8305 * -1098179003 >> 12;
	} else {
	    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null) {
		i_13_ = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			 .anIntArray11977[0]) >> 3;
		i_14_ = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			 .anIntArray11978[0]) >> 3;
	    }
	    if (i_13_ < 0 || i_13_ >= class512.method8417(1535070203) >> 3
		|| i_14_ < 0
		|| i_14_ >= class512.method8418(-1533611049) >> 3) {
		i_13_ = class512.method8417(-163589153) >> 4;
		i_14_ = class512.method8418(-1533611049) >> 4;
	    }
	}
	Class634 class634 = aClass634ArrayArray8077[i_13_][i_14_];
	if (class634 == null)
	    class634 = aClass634_8066;
	return class634;
    }
    
    public void method10155() {
	aClass203_8073.method3877(-910852341);
	aClass203_8084.method3877(651698524);
	aClass203_8075.method3877(-705118734);
    }
    
    void method10156(int i) {
	if (2037907671 * anInt8063 >= 0) {
	    long l = Class250.method4604((byte) -106);
	    anInt8063 -= 838136551L * (l - -4379495624962204331L * aLong8064);
	    if (anInt8063 * 2037907671 > 0)
		aClass634_8079.method10504(aClass185_8056, aClass634_8081,
					   aClass634_8069,
					   ((float) (anInt8062 * -940151697
						     - anInt8063 * 2037907671)
					    / (float) (anInt8062
						       * -940151697)),
					   -268658180);
	    else {
		aClass634_8079.method10502(aClass634_8069, (byte) 42);
		if (null != aClass634_8079.aClass505_8290)
		    aClass634_8079.aClass505_8290.method8331(-1977547019);
		anInt8063 = -838136551;
	    }
	    aLong8064 = 2463174759983020029L * l;
	}
    }
    
    public void method10157(int i) {
	aBool8065 = true;
    }
    
    public void method10158(int i, int i_15_) {
	Class634 class634 = aClass634ArrayArray8077[i][i_15_];
	if (null != class634)
	    aClass438_8072.method6992(class634.aClass438_8285);
	method10196(1999615227);
    }
    
    public void method10159(float f, float f_16_, float f_17_, int i,
			    int i_18_, int i_19_, int i_20_, int i_21_,
			    int i_22_) {
	aClass185_8056.method3489((0.7F
				   + ((float) Class44_Sub6
						  .aClass534_Sub35_10989
						  .aClass690_Sub2_10744
						  .method16833(-441280418)
				      * 0.1F)
				   + client.aClass512_11100
					 .method8432((byte) -32)) * f);
	aClass185_8056.method3341(i, f_16_, f_17_, (float) (i_18_ << 2),
				  (float) (i_19_ << 2), (float) (i_20_ << 2));
	aClass185_8056.method3349(method10148(i_21_, -1184375659));
    }
    
    public void method10160(float f, float f_23_, float f_24_, int i,
			    int i_25_, int i_26_, int i_27_, int i_28_) {
	aClass185_8056.method3489((0.7F
				   + ((float) Class44_Sub6
						  .aClass534_Sub35_10989
						  .aClass690_Sub2_10744
						  .method16833(-441280418)
				      * 0.1F)
				   + client.aClass512_11100
					 .method8432((byte) -4)) * f);
	aClass185_8056.method3341(i, f_23_, f_24_, (float) (i_25_ << 2),
				  (float) (i_26_ << 2), (float) (i_27_ << 2));
	aClass185_8056.method3349(method10148(i_28_, -1166666098));
    }
    
    public Class634 method10161() {
	return aClass634_8079;
    }
    
    public void method10162(int i) {
	int i_29_ = 0;
	int i_30_ = i_29_ + (256 + aClass634_8079.anInt8292 * -563441071 << 2);
	aClass185_8056.method3463(1102104287 * aClass634_8079.anInt8284,
				  (Class44_Sub6.aClass534_Sub35_10989
				       .aClass690_Sub11_10749
				       .method16976(2088438307) == 1
				   ? i_30_ : -1),
				  0);
    }
    
    void method10163(int i) {
	aBool8082 = false;
	aFloat8067 = 1.0F;
	aFloat8078 = 0.0F;
	aFloat8070 = 1.0F;
	aFloat8060 = 0.0F;
	aFloat8085 = 1.0F;
    }
    
    void method10164(int i) {
	if (aClass185_8056.method3304()) {
	    Class170 class170 = null;
	    Class170 class170_31_ = null;
	    Class170 class170_32_ = null;
	    if (aBool8080) {
		if (anIntArray8083[0] > -1)
		    class170 = method10150(anIntArray8083[0], (byte) -110);
		if (anIntArray8083[1] > -1)
		    class170_31_ = method10150(anIntArray8083[1], (byte) -108);
		if (anIntArray8083[2] > -1)
		    class170_32_ = method10150(anIntArray8083[2], (byte) -113);
		aClass185_8056.method3357(class170, aFloatArray8068[0],
					  class170_31_, aFloatArray8068[1],
					  class170_32_, aFloatArray8068[2]);
	    } else {
		if (aClass634_8079.anIntArray8283[0] > -1)
		    class170 = method10150(aClass634_8079.anIntArray8283[0],
					   (byte) -93);
		if (aClass634_8079.anIntArray8283[1] > -1)
		    class170_31_
			= method10150(aClass634_8079.anIntArray8283[1],
				      (byte) -111);
		if (aClass634_8079.anIntArray8283[2] > -1)
		    class170_32_
			= method10150(aClass634_8079.anIntArray8283[2],
				      (byte) -101);
		aClass185_8056.method3357(class170,
					  aClass634_8079.aFloatArray8297[0],
					  class170_31_,
					  aClass634_8079.aFloatArray8297[1],
					  class170_32_,
					  aClass634_8079.aFloatArray8297[2]);
	    }
	}
    }
    
    void method10165(int i) {
	aBool8080 = false;
	int[] is = anIntArray8083;
	int[] is_33_ = anIntArray8083;
	anIntArray8083[2] = -1;
	is_33_[1] = -1;
	is[0] = -1;
	float[] fs = aFloatArray8068;
	float[] fs_34_ = aFloatArray8068;
	aFloatArray8068[2] = 0.0F;
	fs_34_[1] = 0.0F;
	fs[0] = 0.0F;
    }
    
    public Class616(Class185 class185, Class472 class472, int i, int i_35_) {
	aClass203_8075 = new Class203(9);
	aBool8080 = false;
	anIntArray8083 = new int[] { -1, -1, -1 };
	aFloatArray8068 = new float[] { 0.0F, 0.0F, 0.0F };
	aBool8082 = false;
	aClass185_8056 = class185;
	aClass472_8076 = class472;
	aClass634ArrayArray8077 = new Class634[i][i_35_];
	if (anInt8074 * -1652557189 != -1)
	    aClass165_8057 = method10148(-1652557189 * anInt8074, 1985103910);
	aClass505_8058 = null;
	aClass634_8066 = new Class634();
	aClass634_8079 = new Class634();
	aClass634_8081 = new Class634();
	aClass634_8069 = new Class634();
	method10157(905850323);
	method10165(-2089241958);
	method10163(328035656);
    }
    
    public Class653 method10166() {
	return aClass653_8071;
    }
    
    public void method10167(Class512 class512) {
	Class634 class634 = method10154(class512, (byte) 1);
	if (null != aClass653_8071) {
	    aClass634_8061.method10502(class634, (byte) 95);
	    aClass634_8061.method10525(this, aClass653_8071, -1845370552);
	    method10193(aClass634_8061, aClass653_8071.method10760((byte) 2),
			-342488864);
	} else
	    method10193(class634, anInt8059 * -1326181739, -1110198328);
	method10156(2040566745);
	method10196(150388824);
	method10162(1510512231);
    }
    
    Class165 method10168(int i) {
	Class165 class165 = (Class165) aClass203_8073.method3871((long) i);
	if (class165 != null)
	    return class165;
	class165 = aClass185_8056.method3485(i);
	aClass203_8073.method3893(class165, (long) i);
	return class165;
    }
    
    public void method10169(int i, int i_36_, Class634 class634) {
	aClass634ArrayArray8077[i][i_36_] = class634;
    }
    
    public void method10170(Class512 class512) {
	Class634 class634 = method10154(class512, (byte) 1);
	if (null != aClass653_8071) {
	    aClass634_8061.method10502(class634, (byte) 113);
	    aClass634_8061.method10525(this, aClass653_8071, -1690518562);
	    method10193(aClass634_8061, aClass653_8071.method10760((byte) 68),
			-1922411130);
	} else
	    method10193(class634, -1326181739 * anInt8059, 326832533);
	method10156(1837800288);
	method10172(1726125299);
	method10202(604749992);
	method10164(-639685980);
    }
    
    public void method10171(Class512 class512) {
	Class634 class634 = method10154(class512, (byte) 1);
	if (null != aClass653_8071) {
	    aClass634_8061.method10502(class634, (byte) 100);
	    aClass634_8061.method10525(this, aClass653_8071, -1834109369);
	    method10193(aClass634_8061, aClass653_8071.method10760((byte) 45),
			875205051);
	} else
	    method10193(class634, -1326181739 * anInt8059, 560115524);
	method10156(1901390322);
	method10172(1518585692);
	method10202(-1039118617);
	method10164(-639685980);
    }
    
    void method10172(int i) {
	aClass185_8056.method3613(aClass634_8079.aFloat8296,
				  aClass634_8079.aFloat8287,
				  aClass634_8079.aFloat8288, -698280084);
    }
    
    public Class653 method10173() {
	return aClass653_8071;
    }
    
    void method10174() {
	aBool8082 = false;
	aFloat8067 = 1.0F;
	aFloat8078 = 0.0F;
	aFloat8070 = 1.0F;
	aFloat8060 = 0.0F;
	aFloat8085 = 1.0F;
    }
    
    Class505 method10175(int i, int i_37_, int i_38_, int i_39_) {
	long l
	    = (((long) i_37_ & 0xffffL) << 48 | ((long) i_38_ & 0xffffL) << 32
	       | ((long) i_39_ & 0xffffL) << 16 | (long) i & 0xffffL);
	Class505 class505 = (Class505) aClass203_8084.method3871(l);
	if (class505 == null) {
	    class505
		= Class171.method2881(i, i_37_, i_38_, i_39_,
				      Class184.aClass44_Sub6_1988,
				      Class492.aClass44_Sub10_5341, 549587938);
	    aClass203_8084.method3893(class505, l);
	}
	return class505;
    }
    
    public void method10176(byte i) {
	aClass185_8056.method3489
	    ((0.7F
	      + (float) Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub2_10744
			    .method16833(-441280418) * 0.1F
	      + client.aClass512_11100.method8432((byte) -100)) * 1.1523438F);
	aClass185_8056.method3341(16777215, 0.69921875F, 1.2F, -200.0F,
				  -240.0F, -200.0F);
	aClass185_8056.method3463(13156520, -1, 0);
	aClass185_8056.method3349(aClass165_8057);
    }
    
    public void method10177(Class512 class512) {
	Class634 class634 = method10154(class512, (byte) 1);
	if (null != aClass653_8071) {
	    aClass634_8061.method10502(class634, (byte) 31);
	    aClass634_8061.method10525(this, aClass653_8071, -1608297731);
	    method10193(aClass634_8061, aClass653_8071.method10760((byte) 50),
			-759057115);
	} else
	    method10193(class634, anInt8059 * -1326181739, -1045518894);
	method10156(2144156567);
	method10196(-894719291);
	method10162(2065822917);
    }
    
    public void method10178(Class616 class616_40_) {
	aClass634_8079.method10502(class616_40_.aClass634_8079, (byte) 27);
	aClass634_8081.method10502(class616_40_.aClass634_8081, (byte) 50);
	aClass634_8069.method10502(class616_40_.aClass634_8069, (byte) 29);
	aLong8064 = class616_40_.aLong8064 * 1L;
	anInt8062 = 1 * class616_40_.anInt8062;
	anInt8063 = 1 * class616_40_.anInt8063;
    }
    
    public void method10179() {
	aClass203_8073.method3877(1125395861);
	aClass203_8084.method3877(-11250948);
	aClass203_8075.method3877(1883809681);
    }
    
    public void method10180(Class512 class512, Class653 class653, int i) {
	aClass653_8071 = class653;
	Class634 class634 = method10154(class512, (byte) 1);
	if (null != aClass653_8071) {
	    if (aClass634_8061 == null)
		aClass634_8061 = new Class634();
	    aClass634_8061.method10502(class634, (byte) 10);
	    aClass634_8061.method10525(this, aClass653_8071, -2011123024);
	    method10193(aClass634_8061, i, -189002239);
	} else {
	    method10193(class634, i, 564341847);
	    aClass634_8061 = null;
	}
    }
    
    Class165 method10181(int i) {
	Class165 class165 = (Class165) aClass203_8073.method3871((long) i);
	if (class165 != null)
	    return class165;
	class165 = aClass185_8056.method3485(i);
	aClass203_8073.method3893(class165, (long) i);
	return class165;
    }
    
    public Class634 method10182() {
	return aClass634_8079;
    }
    
    Class505 method10183(int i, int i_41_, int i_42_, int i_43_) {
	long l
	    = (((long) i_41_ & 0xffffL) << 48 | ((long) i_42_ & 0xffffL) << 32
	       | ((long) i_43_ & 0xffffL) << 16 | (long) i & 0xffffL);
	Class505 class505 = (Class505) aClass203_8084.method3871(l);
	if (class505 == null) {
	    class505 = Class171.method2881(i, i_41_, i_42_, i_43_,
					   Class184.aClass44_Sub6_1988,
					   Class492.aClass44_Sub10_5341,
					   2115585320);
	    aClass203_8084.method3893(class505, l);
	}
	return class505;
    }
    
    Class505 method10184(int i, int i_44_, int i_45_, int i_46_) {
	long l
	    = (((long) i_44_ & 0xffffL) << 48 | ((long) i_45_ & 0xffffL) << 32
	       | ((long) i_46_ & 0xffffL) << 16 | (long) i & 0xffffL);
	Class505 class505 = (Class505) aClass203_8084.method3871(l);
	if (class505 == null) {
	    class505 = Class171.method2881(i, i_44_, i_45_, i_46_,
					   Class184.aClass44_Sub6_1988,
					   Class492.aClass44_Sub10_5341,
					   2078149514);
	    aClass203_8084.method3893(class505, l);
	}
	return class505;
    }
    
    public Class634 method10185() {
	return aClass634_8079;
    }
    
    static {
	anInt8059 = -510663234;
    }
    
    Class170 method10186(int i) {
	Class170 class170 = (Class170) aClass203_8075.method3871((long) i);
	if (class170 != null)
	    return class170;
	Class169 class169 = Class178.method2945(aClass472_8076, i);
	if (null != class169 && class169.method2762() == 256
	    && class169.method2763() == 16) {
	    int[] is = class169.method2766(false);
	    class170 = aClass185_8056.method3605(is);
	    if (null != class170)
		aClass203_8075.method3893(class170, (long) i);
	}
	return class170;
    }
    
    public void method10187(float f, float f_47_, float f_48_, int i,
			    int i_49_, int i_50_, int i_51_, int i_52_) {
	aClass185_8056.method3489((0.7F
				   + ((float) Class44_Sub6
						  .aClass534_Sub35_10989
						  .aClass690_Sub2_10744
						  .method16833(-441280418)
				      * 0.1F)
				   + client.aClass512_11100
					 .method8432((byte) -83)) * f);
	aClass185_8056.method3341(i, f_47_, f_48_, (float) (i_49_ << 2),
				  (float) (i_50_ << 2), (float) (i_51_ << 2));
	aClass185_8056.method3349(method10148(i_52_, -1525640570));
    }
    
    public void method10188(Class512 class512) {
	Class634 class634 = method10154(class512, (byte) 1);
	if (null != aClass653_8071) {
	    aClass634_8061.method10502(class634, (byte) 2);
	    aClass634_8061.method10525(this, aClass653_8071, -1252382897);
	    method10193(aClass634_8061, aClass653_8071.method10760((byte) 43),
			-461408025);
	} else
	    method10193(class634, -1326181739 * anInt8059, 914403573);
	method10156(1938062635);
	method10172(1318151127);
	method10202(456403881);
	method10164(-639685980);
    }
    
    public void method10189() {
	aBool8065 = true;
    }
    
    public void method10190() {
	for (int i = 0; i < aClass634ArrayArray8077.length; i++) {
	    for (int i_53_ = 0; i_53_ < aClass634ArrayArray8077[i].length;
		 i_53_++)
		aClass634ArrayArray8077[i][i_53_] = aClass634_8066;
	}
    }
    
    public void method10191() {
	for (int i = 0; i < aClass634ArrayArray8077.length; i++) {
	    for (int i_54_ = 0; i_54_ < aClass634ArrayArray8077[i].length;
		 i_54_++)
		aClass634ArrayArray8077[i][i_54_] = aClass634_8066;
	}
    }
    
    public void method10192(int i, int i_55_) {
	Class634 class634 = aClass634ArrayArray8077[i][i_55_];
	if (null != class634)
	    aClass438_8072.method6992(class634.aClass438_8285);
	method10196(177054794);
    }
    
    void method10193(Class634 class634, int i, int i_56_) {
	if (aBool8065) {
	    aBool8065 = false;
	    i = 0;
	}
	if (!aClass634_8069.method10509(class634, (byte) 4)) {
	    aClass634_8069.method10502(class634, (byte) 8);
	    aLong8064 = Class250.method4604((byte) -73) * 2463174759983020029L;
	    anInt8062 = (anInt8063 = i * 838136551) * -721930727;
	    if (0 != -940151697 * anInt8062) {
		aClass634_8081.method10502(aClass634_8079, (byte) 116);
		if (null != aClass634_8079.aClass505_8290) {
		    if (aClass634_8079.aClass505_8290.method8332(330326944))
			aClass634_8079.aClass505_8290
			    = aClass634_8081.aClass505_8290
			    = aClass634_8079.aClass505_8290.method8333(65536);
		    if (aClass634_8079.aClass505_8290 != null
			&& (aClass634_8079.aClass505_8290
			    != aClass634_8069.aClass505_8290))
			aClass634_8079.aClass505_8290.method8330
			    (aClass634_8069.aClass505_8290, 1048964532);
		}
	    }
	}
    }
    
    public void method10194(int i, int i_57_) {
	Class634 class634 = aClass634ArrayArray8077[i][i_57_];
	if (null != class634)
	    aClass438_8072.method6992(class634.aClass438_8285);
	method10196(-442670878);
    }
    
    Class634 method10195(Class512 class512) {
	Object object = null;
	int i = -1;
	int i_58_ = -1;
	if (Class250.method4611(client.anInt11039 * -1850530127, (byte) -1)
	    || Class192.method3789(-1850530127 * client.anInt11039,
				   -2088273292)) {
	    i = Class200_Sub13.anInt9937 * -116109187 >> 12;
	    i_58_ = Class636.anInt8305 * -1098179003 >> 12;
	} else {
	    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null) {
		i = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
		     .anIntArray11977[0]) >> 3;
		i_58_ = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			 .anIntArray11978[0]) >> 3;
	    }
	    if (i < 0 || i >= class512.method8417(-454534698) >> 3 || i_58_ < 0
		|| i_58_ >= class512.method8418(-1533611049) >> 3) {
		i = class512.method8417(1284618410) >> 4;
		i_58_ = class512.method8418(-1533611049) >> 4;
	    }
	}
	Class634 class634 = aClass634ArrayArray8077[i][i_58_];
	if (class634 == null)
	    class634 = aClass634_8066;
	return class634;
    }
    
    void method10196(int i) {
	aClass185_8056.method3489((0.7F
				   + ((float) Class44_Sub6
						  .aClass534_Sub35_10989
						  .aClass690_Sub2_10744
						  .method16833(-441280418)
				      * 0.1F)
				   + client.aClass512_11100
					 .method8432((byte) -80))
				  * aClass634_8079.aFloat8280);
	aClass185_8056.method3341(-1201354137 * aClass634_8079.anInt8289,
				  aClass634_8079.aFloat8281,
				  aClass634_8079.aFloat8282,
				  (float) ((int) aClass438_8072.aFloat4864
					   << 2),
				  (float) ((int) aClass438_8072.aFloat4863
					   << 2),
				  (float) ((int) aClass438_8072.aFloat4865
					   << 2));
	aClass185_8056.method3349(aClass634_8079.aClass165_8286);
    }
    
    void method10197(Class634 class634, int i) {
	if (aBool8065) {
	    aBool8065 = false;
	    i = 0;
	}
	if (!aClass634_8069.method10509(class634, (byte) 4)) {
	    aClass634_8069.method10502(class634, (byte) 56);
	    aLong8064 = Class250.method4604((byte) -51) * 2463174759983020029L;
	    anInt8062 = (anInt8063 = i * 838136551) * -721930727;
	    if (0 != -940151697 * anInt8062) {
		aClass634_8081.method10502(aClass634_8079, (byte) 6);
		if (null != aClass634_8079.aClass505_8290) {
		    if (aClass634_8079.aClass505_8290.method8332(330326944))
			aClass634_8079.aClass505_8290
			    = aClass634_8081.aClass505_8290
			    = aClass634_8079.aClass505_8290.method8333(65536);
		    if (aClass634_8079.aClass505_8290 != null
			&& (aClass634_8079.aClass505_8290
			    != aClass634_8069.aClass505_8290))
			aClass634_8079.aClass505_8290.method8330
			    (aClass634_8069.aClass505_8290, 1744965566);
		}
	    }
	}
    }
    
    void method10198() {
	if (2037907671 * anInt8063 >= 0) {
	    long l = Class250.method4604((byte) -85);
	    anInt8063 -= 838136551L * (l - -4379495624962204331L * aLong8064);
	    if (anInt8063 * 2037907671 > 0)
		aClass634_8079.method10504(aClass185_8056, aClass634_8081,
					   aClass634_8069,
					   ((float) (anInt8062 * -940151697
						     - anInt8063 * 2037907671)
					    / (float) (anInt8062
						       * -940151697)),
					   -1597269692);
	    else {
		aClass634_8079.method10502(aClass634_8069, (byte) 92);
		if (null != aClass634_8079.aClass505_8290)
		    aClass634_8079.aClass505_8290.method8331(-1977547019);
		anInt8063 = -838136551;
	    }
	    aLong8064 = 2463174759983020029L * l;
	}
    }
    
    public void method10199() {
	aBool8065 = true;
    }
    
    public void method10200() {
	aBool8065 = true;
    }
    
    void method10201(Class634 class634, int i) {
	if (aBool8065) {
	    aBool8065 = false;
	    i = 0;
	}
	if (!aClass634_8069.method10509(class634, (byte) 4)) {
	    aClass634_8069.method10502(class634, (byte) 110);
	    aLong8064
		= Class250.method4604((byte) -113) * 2463174759983020029L;
	    anInt8062 = (anInt8063 = i * 838136551) * -721930727;
	    if (0 != -940151697 * anInt8062) {
		aClass634_8081.method10502(aClass634_8079, (byte) 6);
		if (null != aClass634_8079.aClass505_8290) {
		    if (aClass634_8079.aClass505_8290.method8332(330326944))
			aClass634_8079.aClass505_8290
			    = aClass634_8081.aClass505_8290
			    = aClass634_8079.aClass505_8290.method8333(65536);
		    if (aClass634_8079.aClass505_8290 != null
			&& (aClass634_8079.aClass505_8290
			    != aClass634_8069.aClass505_8290))
			aClass634_8079.aClass505_8290.method8330
			    (aClass634_8069.aClass505_8290, 1623893832);
		}
	    }
	}
    }
    
    void method10202(int i) {
	if (aClass185_8056.method3443()) {
	    if (aBool8082)
		aClass185_8056.method3590(aFloat8067, aFloat8078, aFloat8070,
					  aFloat8060, aFloat8085);
	    else
		aClass185_8056.method3590(aClass634_8079.aFloat8291,
					  aClass634_8079.aFloat8279,
					  aClass634_8079.aFloat8293,
					  aClass634_8079.aFloat8294,
					  aClass634_8079.aFloat8295);
	}
    }
    
    void method10203() {
	aClass185_8056.method3489((0.7F
				   + ((float) Class44_Sub6
						  .aClass534_Sub35_10989
						  .aClass690_Sub2_10744
						  .method16833(-441280418)
				      * 0.1F)
				   + client.aClass512_11100
					 .method8432((byte) -82))
				  * aClass634_8079.aFloat8280);
	aClass185_8056.method3341(-1201354137 * aClass634_8079.anInt8289,
				  aClass634_8079.aFloat8281,
				  aClass634_8079.aFloat8282,
				  (float) ((int) aClass438_8072.aFloat4864
					   << 2),
				  (float) ((int) aClass438_8072.aFloat4863
					   << 2),
				  (float) ((int) aClass438_8072.aFloat4865
					   << 2));
	aClass185_8056.method3349(aClass634_8079.aClass165_8286);
    }
    
    public void method10204(float f, float f_59_, float f_60_, int i,
			    int i_61_, int i_62_, int i_63_, int i_64_) {
	aClass185_8056.method3489((0.7F
				   + ((float) Class44_Sub6
						  .aClass534_Sub35_10989
						  .aClass690_Sub2_10744
						  .method16833(-441280418)
				      * 0.1F)
				   + client.aClass512_11100
					 .method8432((byte) -106)) * f);
	aClass185_8056.method3341(i, f_59_, f_60_, (float) (i_61_ << 2),
				  (float) (i_62_ << 2), (float) (i_63_ << 2));
	aClass185_8056.method3349(method10148(i_64_, 63963128));
    }
    
    public void method10205(int i, int i_65_, Class634 class634) {
	aClass634ArrayArray8077[i][i_65_] = class634;
    }
    
    public void method10206() {
	aBool8065 = true;
    }
    
    public void method10207() {
	int i = 0;
	int i_66_ = i + (256 + aClass634_8079.anInt8292 * -563441071 << 2);
	aClass185_8056.method3463(1102104287 * aClass634_8079.anInt8284,
				  (Class44_Sub6.aClass534_Sub35_10989
				       .aClass690_Sub11_10749
				       .method16976(2088438307) == 1
				   ? i_66_ : -1),
				  0);
    }
    
    public void method10208() {
	int i = 0;
	int i_67_ = i + (256 + aClass634_8079.anInt8292 * -563441071 << 2);
	aClass185_8056.method3463(1102104287 * aClass634_8079.anInt8284,
				  (Class44_Sub6.aClass534_Sub35_10989
				       .aClass690_Sub11_10749
				       .method16976(2088438307) == 1
				   ? i_67_ : -1),
				  0);
    }
    
    void method10209() {
	aClass185_8056.method3613(aClass634_8079.aFloat8296,
				  aClass634_8079.aFloat8287,
				  aClass634_8079.aFloat8288, 1654298442);
    }
    
    void method10210() {
	aClass185_8056.method3613(aClass634_8079.aFloat8296,
				  aClass634_8079.aFloat8287,
				  aClass634_8079.aFloat8288, -1535469828);
    }
    
    void method10211() {
	aClass185_8056.method3613(aClass634_8079.aFloat8296,
				  aClass634_8079.aFloat8287,
				  aClass634_8079.aFloat8288, -1241367619);
    }
    
    void method10212() {
	if (aClass185_8056.method3443()) {
	    if (aBool8082)
		aClass185_8056.method3590(aFloat8067, aFloat8078, aFloat8070,
					  aFloat8060, aFloat8085);
	    else
		aClass185_8056.method3590(aClass634_8079.aFloat8291,
					  aClass634_8079.aFloat8279,
					  aClass634_8079.aFloat8293,
					  aClass634_8079.aFloat8294,
					  aClass634_8079.aFloat8295);
	}
    }
    
    void method10213() {
	if (aClass185_8056.method3443()) {
	    if (aBool8082)
		aClass185_8056.method3590(aFloat8067, aFloat8078, aFloat8070,
					  aFloat8060, aFloat8085);
	    else
		aClass185_8056.method3590(aClass634_8079.aFloat8291,
					  aClass634_8079.aFloat8279,
					  aClass634_8079.aFloat8293,
					  aClass634_8079.aFloat8294,
					  aClass634_8079.aFloat8295);
	}
    }
    
    void method10214() {
	if (aClass185_8056.method3443()) {
	    if (aBool8082)
		aClass185_8056.method3590(aFloat8067, aFloat8078, aFloat8070,
					  aFloat8060, aFloat8085);
	    else
		aClass185_8056.method3590(aClass634_8079.aFloat8291,
					  aClass634_8079.aFloat8279,
					  aClass634_8079.aFloat8293,
					  aClass634_8079.aFloat8294,
					  aClass634_8079.aFloat8295);
	}
    }
    
    public void method10215(int i, int i_68_, Class634 class634) {
	aClass634ArrayArray8077[i][i_68_] = class634;
    }
    
    public void method10216(Class512 class512, Class653 class653, int i,
			    byte i_69_) {
	aClass653_8071 = class653;
	Class634 class634 = method10154(class512, (byte) 1);
	if (null != aClass653_8071) {
	    if (aClass634_8061 == null)
		aClass634_8061 = new Class634();
	    aClass634_8061.method10502(class634, (byte) 11);
	    aClass634_8061.method10525(this, aClass653_8071, -1299764406);
	    method10193(aClass634_8061, i, 1268135192);
	} else {
	    method10193(class634, i, -640587525);
	    aClass634_8061 = null;
	}
    }
    
    void method10217() {
	aBool8082 = false;
	aFloat8067 = 1.0F;
	aFloat8078 = 0.0F;
	aFloat8070 = 1.0F;
	aFloat8060 = 0.0F;
	aFloat8085 = 1.0F;
    }
    
    void method10218() {
	if (aClass185_8056.method3304()) {
	    Class170 class170 = null;
	    Class170 class170_70_ = null;
	    Class170 class170_71_ = null;
	    if (aBool8080) {
		if (anIntArray8083[0] > -1)
		    class170 = method10150(anIntArray8083[0], (byte) -68);
		if (anIntArray8083[1] > -1)
		    class170_70_ = method10150(anIntArray8083[1], (byte) -50);
		if (anIntArray8083[2] > -1)
		    class170_71_ = method10150(anIntArray8083[2], (byte) -58);
		aClass185_8056.method3357(class170, aFloatArray8068[0],
					  class170_70_, aFloatArray8068[1],
					  class170_71_, aFloatArray8068[2]);
	    } else {
		if (aClass634_8079.anIntArray8283[0] > -1)
		    class170 = method10150(aClass634_8079.anIntArray8283[0],
					   (byte) -50);
		if (aClass634_8079.anIntArray8283[1] > -1)
		    class170_70_
			= method10150(aClass634_8079.anIntArray8283[1],
				      (byte) -128);
		if (aClass634_8079.anIntArray8283[2] > -1)
		    class170_71_
			= method10150(aClass634_8079.anIntArray8283[2],
				      (byte) -63);
		aClass185_8056.method3357(class170,
					  aClass634_8079.aFloatArray8297[0],
					  class170_70_,
					  aClass634_8079.aFloatArray8297[1],
					  class170_71_,
					  aClass634_8079.aFloatArray8297[2]);
	    }
	}
    }
    
    void method10219() {
	if (aClass185_8056.method3304()) {
	    Class170 class170 = null;
	    Class170 class170_72_ = null;
	    Class170 class170_73_ = null;
	    if (aBool8080) {
		if (anIntArray8083[0] > -1)
		    class170 = method10150(anIntArray8083[0], (byte) -127);
		if (anIntArray8083[1] > -1)
		    class170_72_ = method10150(anIntArray8083[1], (byte) -40);
		if (anIntArray8083[2] > -1)
		    class170_73_ = method10150(anIntArray8083[2], (byte) -126);
		aClass185_8056.method3357(class170, aFloatArray8068[0],
					  class170_72_, aFloatArray8068[1],
					  class170_73_, aFloatArray8068[2]);
	    } else {
		if (aClass634_8079.anIntArray8283[0] > -1)
		    class170 = method10150(aClass634_8079.anIntArray8283[0],
					   (byte) -7);
		if (aClass634_8079.anIntArray8283[1] > -1)
		    class170_72_
			= method10150(aClass634_8079.anIntArray8283[1],
				      (byte) -46);
		if (aClass634_8079.anIntArray8283[2] > -1)
		    class170_73_
			= method10150(aClass634_8079.anIntArray8283[2],
				      (byte) -76);
		aClass185_8056.method3357(class170,
					  aClass634_8079.aFloatArray8297[0],
					  class170_72_,
					  aClass634_8079.aFloatArray8297[1],
					  class170_73_,
					  aClass634_8079.aFloatArray8297[2]);
	    }
	}
    }
    
    void method10220() {
	aBool8080 = false;
	int[] is = anIntArray8083;
	int[] is_74_ = anIntArray8083;
	anIntArray8083[2] = -1;
	is_74_[1] = -1;
	is[0] = -1;
	float[] fs = aFloatArray8068;
	float[] fs_75_ = aFloatArray8068;
	aFloatArray8068[2] = 0.0F;
	fs_75_[1] = 0.0F;
	fs[0] = 0.0F;
    }
    
    public void method10221() {
	aClass185_8056.method3489
	    ((0.7F
	      + (float) Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub2_10744
			    .method16833(-441280418) * 0.1F
	      + client.aClass512_11100.method8432((byte) -127)) * 1.1523438F);
	aClass185_8056.method3341(16777215, 0.69921875F, 1.2F, -200.0F,
				  -240.0F, -200.0F);
	aClass185_8056.method3463(13156520, -1, 0);
	aClass185_8056.method3349(aClass165_8057);
    }
    
    public void method10222() {
	aClass185_8056.method3489
	    ((0.7F
	      + (float) Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub2_10744
			    .method16833(-441280418) * 0.1F
	      + client.aClass512_11100.method8432((byte) -26)) * 1.1523438F);
	aClass185_8056.method3341(16777215, 0.69921875F, 1.2F, -200.0F,
				  -240.0F, -200.0F);
	aClass185_8056.method3463(13156520, -1, 0);
	aClass185_8056.method3349(aClass165_8057);
    }
    
    public void method10223() {
	aClass185_8056.method3489
	    ((0.7F
	      + (float) Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub2_10744
			    .method16833(-441280418) * 0.1F
	      + client.aClass512_11100.method8432((byte) -81)) * 1.1523438F);
	aClass185_8056.method3341(16777215, 0.69921875F, 1.2F, -200.0F,
				  -240.0F, -200.0F);
	aClass185_8056.method3463(13156520, -1, 0);
	aClass185_8056.method3349(aClass165_8057);
    }
    
    static final void method10224(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class675.method11126(class247, class243, class669, -1614624954);
    }
    
    static final void method10225(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class283.method5248(class247, class243, class669, (byte) 0);
    }
    
    static final void method10226(Class669 class669, int i) {
	int i_76_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_76_, 918889975);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = class247.aString2533;
    }
    
    static final void method10227(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 828996383 * client.anInt11231;
    }
    
    static final void method10228(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    static final void method10229(Class669 class669, byte i) {
	int i_77_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_77_, 426296672);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_77_ >> 16];
	Class567.method9561(class247, class243, class669, -668924584);
    }
    
    static final void method10230(Class669 class669, byte i) {
	Class263.method4833(-1911457545);
    }
}
