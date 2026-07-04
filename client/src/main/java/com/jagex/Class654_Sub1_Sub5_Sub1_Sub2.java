/* Class654_Sub1_Sub5_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class654_Sub1_Sub5_Sub1_Sub2 extends Class654_Sub1_Sub5_Sub1
{
    public int anInt12210;
    public String aString12211;
    String aString12212;
    String aString12213;
    public byte aByte12214 = 0;
    public int anInt12215;
    public Class618 aClass618_12216;
    public int[] anIntArray12217;
    public boolean aBool12218;
    public int anInt12219;
    public int anInt12220;
    public int anInt12221;
    public int anInt12222;
    public int anInt12223;
    public int anInt12224;
    int anInt12225;
    public Class631 aClass631_12226;
    public int anInt12227;
    public String aString12228;
    public int anInt12229;
    public int anInt12230;
    public int anInt12231;
    public Class252 aClass252_12232;
    public int[] anIntArray12233;
    public boolean aBool12234;
    
    void method18863(int i) {
	for (int i_0_ = 0; i_0_ < anIntArray12233.length; i_0_++)
	    anIntArray12233[i_0_] = -1;
	for (int i_1_ = 0; i_1_ < anIntArray12217.length; i_1_++)
	    anIntArray12217[i_1_] = -1;
    }
    
    final void method16851(Class185 class185, Class654_Sub1 class654_sub1,
			   int i, int i_2_, int i_3_, boolean bool, int i_4_) {
	throw new IllegalStateException();
    }
    
    public void method18864(Class534_Sub40 class534_sub40, byte i, int i_5_) {
	aByte12214 = i;
	int i_6_ = -1;
	anInt12224 = 0;
	int[] is = new int[Class69.aClass630_728.anIntArray8196.length];
	Class17[] class17s
	    = new Class17[Class69.aClass630_728.anIntArray8196.length];
	Class15[] class15s
	    = new Class15[Class69.aClass630_728.anIntArray8196.length];
	for (int i_7_ = 0; i_7_ < Class69.aClass630_728.anIntArray8196.length;
	     i_7_++) {
	    if (1 != Class69.aClass630_728.anIntArray8196[i_7_]) {
		int i_8_ = class534_sub40.method16527(-323879975);
		if (i_8_ == 0)
		    is[i_7_] = 0;
		else {
		    int i_9_ = class534_sub40.method16527(-111213818);
		    int i_10_ = (i_8_ << 8) + i_9_;
		    if (i_7_ == 0 && 65535 == i_10_) {
			i_6_ = class534_sub40.method16550((byte) 80);
			anInt12224 = (class534_sub40.method16527(-874818150)
				      * -569974883);
			break;
		    }
		    if (i_10_ >= 16384) {
			i_10_ -= 16384;
			is[i_7_] = i_10_ | 0x40000000;
			class15s[i_7_]
			    = (Class15) Class531.aClass44_Sub7_7135
					    .method91(i_10_, -1006850137);
			int i_11_ = -1277070211 * class15s[i_7_].anInt104;
			if (i_11_ != 0)
			    anInt12224 = -569974883 * i_11_;
		    } else
			is[i_7_] = i_10_ - 256 | ~0x7fffffff;
		}
	    }
	}
	if (-1 == i_6_) {
	    int i_12_ = class534_sub40.method16529((byte) 1);
	    int i_13_ = 0;
	    for (int i_14_ = 0;
		 i_14_ < Class69.aClass630_728.anIntArray8196.length;
		 i_14_++) {
		if (Class69.aClass630_728.anIntArray8196[i_14_] == 0) {
		    if (0 != (i_12_ & 1 << i_13_))
			class17s[i_14_]
			    = Class475.method7766(class15s[i_14_],
						  class534_sub40, -605262442);
		    i_13_++;
		}
	    }
	}
	int[] is_15_ = new int[10];
	for (int i_16_ = 0; i_16_ < 10; i_16_++) {
	    int i_17_ = class534_sub40.method16527(939296916);
	    if (Class312.aShortArrayArrayArray3371.length < 1 || i_17_ < 0
		|| (i_17_
		    >= Class312.aShortArrayArrayArray3371[i_16_][0].length))
		i_17_ = 0;
	    is_15_[i_16_] = i_17_;
	}
	int[] is_18_ = new int[10];
	for (int i_19_ = 0; i_19_ < 10; i_19_++) {
	    int i_20_ = class534_sub40.method16527(-1339852204);
	    if (Class473.aShortArrayArrayArray5173.length < 1 || i_20_ < 0
		|| (i_20_
		    >= Class473.aShortArrayArrayArray5173[i_19_][0].length))
		i_20_ = 0;
	    is_18_[i_19_] = i_20_;
	}
	anInt12225 = class534_sub40.method16529((byte) 1) * -522485945;
	if (null == aClass631_12226)
	    aClass631_12226 = new Class631();
	int i_21_ = aClass631_12226.anInt8212 * 1568742735;
	int[] is_22_ = aClass631_12226.anIntArray8208;
	aClass631_12226.method10435(method18529((byte) 100), is, class17s,
				    is_15_, is_18_, 1 == aByte12214, i_6_,
				    (short) 18585);
	if (i_21_ != i_6_) {
	    Class438 class438
		= Class438.method6994(method10807().aClass438_4885);
	    class438.aFloat4864 = (float) ((anIntArray11977[0] << 9)
					   + (method18545((byte) 1) << 8));
	    class438.aFloat4865 = (float) ((anIntArray11978[0] << 9)
					   + (method18545((byte) 1) << 8));
	    method10809(class438);
	    class438.method7074();
	}
	if (client.anInt11037 * -643758853 == anInt11922 * 1126388985
	    && null != is_22_) {
	    for (int i_23_ = 0; i_23_ < is_15_.length; i_23_++) {
		if (is_15_[i_23_] != is_22_[i_23_]) {
		    Class531.aClass44_Sub7_7135.method17316(144137441);
		    break;
		}
	    }
	}
	if (aClass629_11983 != null)
	    aClass629_11983.method10384();
	if (aClass711_Sub1_11965.method14338((byte) 0)
	    && aClass711_Sub1_11965.aBool10971) {
	    Class570 class570 = method18531((byte) -3);
	    if (!class570.method9613(aClass711_Sub1_11965
					 .method14329(2058451167),
				     -622301414)) {
		aClass711_Sub1_11965.method14330(-1, 1189907985);
		aClass711_Sub1_11965.aBool10971 = false;
	    }
	}
    }
    
    public final void method18865(Class534_Sub40 class534_sub40, byte i) {
	class534_sub40.anInt10811 = 0;
	int i_24_ = class534_sub40.method16527(1771959423);
	byte i_25_ = (byte) (i_24_ & 0x1);
	boolean bool = (i_24_ & 0x4) != 0;
	int i_26_ = super.method18545((byte) 1);
	method18535((i_24_ >> 3 & 0x7) + 1, 439861706);
	boolean bool_27_ = 0 != (i_24_ & 0x40);
	boolean bool_28_ = (i_24_ & 0x80) != 0;
	Class438 class438 = Class438.method6994(method10807().aClass438_4885);
	class438.aFloat4864 += (float) (method18545((byte) 1) - i_26_ << 8);
	class438.aFloat4865 += (float) (method18545((byte) 1) - i_26_ << 8);
	method10809(class438);
	class438.method7074();
	if (bool_27_)
	    aString12212 = class534_sub40.method16523(-1294929173);
	else
	    aString12212 = null;
	if (bool_28_)
	    aString12213 = class534_sub40.method16523(-1919250875);
	else
	    aString12213 = null;
	aClass618_12216
	    = ((Class618)
	       Class448.method7319(Class618.method10239(1820077913),
				   class534_sub40.method16586((byte) 1),
				   2088438307));
	if (Class665.aClass665_8561 == client.aClass665_11211
	    && client.anInt11194 * 365872613 >= 2)
	    aClass618_12216 = Class618.aClass618_8099;
	method18864(class534_sub40, i_25_, 1190434333);
	aString12228 = class534_sub40.method16541((byte) -91);
	aString12211 = aString12228;
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 == this)
	    RuntimeException_Sub1.aString12085 = aString12228;
	anInt12210 = class534_sub40.method16527(-709579681) * 1539382797;
	if (bool) {
	    anInt12221 = class534_sub40.method16529((byte) 1) * -1240813047;
	    if (-825066439 * anInt12221 == 65535)
		anInt12221 = 1240813047;
	    anInt12219 = -1924340515 * anInt12210;
	    anInt12220 = -810466567;
	} else {
	    anInt12221 = 0;
	    anInt12219 = class534_sub40.method16527(412997147) * 1230406969;
	    anInt12220 = class534_sub40.method16527(610986910) * 810466567;
	    if (anInt12220 * 800727223 == 255)
		anInt12220 = -810466567;
	}
	int i_29_ = -785793877 * anInt12229;
	anInt12229 = class534_sub40.method16527(1703214478) * -1280025085;
	if (0 != anInt12229 * -785793877) {
	    int i_30_ = -729876395 * anInt12230;
	    int i_31_ = -2046269725 * anInt12222;
	    int i_32_ = 1734964233 * anInt12227;
	    int i_33_ = anInt12231 * -510526957;
	    int i_34_ = anInt12215 * 18694435;
	    anInt12230 = class534_sub40.method16529((byte) 1) * 2018919677;
	    anInt12222 = class534_sub40.method16529((byte) 1) * 257035979;
	    anInt12227 = class534_sub40.method16529((byte) 1) * -1016440263;
	    anInt12231 = class534_sub40.method16529((byte) 1) * -1286676453;
	    anInt12215 = class534_sub40.method16527(-8183474) * 616756875;
	    if (anInt12229 * -785793877 != i_29_
		|| anInt12230 * -729876395 != i_30_
		|| i_31_ != -2046269725 * anInt12222
		|| i_32_ != anInt12227 * 1734964233
		|| i_33_ != -510526957 * anInt12231
		|| i_34_ != 18694435 * anInt12215)
		Class612.method10107(this, -249678862);
	} else
	    Class576.method9763(this, -1946926483);
    }
    
    public void method18866(Class534_Sub40 class534_sub40, byte i) {
	class534_sub40.anInt10811 = 0;
	int i_35_ = class534_sub40.method16527(-1147562968);
	for (int i_36_ = 0; i_36_ < anIntArray12233.length; i_36_++) {
	    if ((i_35_ & 1 << i_36_) != 0) {
		int i_37_ = class534_sub40.method16527(1228880093);
		int i_38_ = class534_sub40.method16529((byte) 1);
		anIntArray12233[i_36_] = i_37_;
		anIntArray12217[i_36_] = i_38_;
	    } else {
		anIntArray12233[i_36_] = -1;
		anIntArray12217[i_36_] = -1;
	    }
	}
    }
    
    final void method18867(int i, int i_39_, byte i_40_, int i_41_) {
	if (anInt11980 * -1763707177 < anIntArray11977.length - 1)
	    anInt11980 += 990207207;
	for (int i_42_ = anInt11980 * -1763707177; i_42_ > 0; i_42_--) {
	    anIntArray11977[i_42_] = anIntArray11977[i_42_ - 1];
	    anIntArray11978[i_42_] = anIntArray11978[i_42_ - 1];
	    aByteArray11979[i_42_] = aByteArray11979[i_42_ - 1];
	}
	anIntArray11977[0] = i;
	anIntArray11978[0] = i_39_;
	aByteArray11979[0] = i_40_;
    }
    
    final void method16852(int i) {
	throw new IllegalStateException();
    }
    
    public boolean method18585() {
	return Class620.aClass632_8113.aBool8239;
    }
    
    void method16868(Class185 class185, int i) {
	if (aClass631_12226 != null
	    && (aBool11984 || method18869(class185, 0, (byte) -90))) {
	    Class446 class446 = class185.method3665();
	    class446.method7237(method10807());
	    class446.method7287(0.0F, -5.0F, 0.0F);
	    method18528(class185, aClass183Array11986, class446, aBool11984,
			1308356484);
	    for (int i_43_ = 0; i_43_ < aClass183Array11986.length; i_43_++)
		aClass183Array11986[i_43_] = null;
	}
    }
    
    void method18868(Class185 class185, Class446 class446, Class183 class183,
		     long l, long l_44_, int i, long l_45_) {
	long l_46_ = l_44_ * l_44_ + l * l;
	if (l_46_ >= 262144L && l_46_ <= l_45_) {
	    int i_47_
		= ((int) ((Math.atan2((double) l, (double) l_44_)
			   * 2607.5945876176133)
			  - (double) aClass57_11973.method1231(1110599084))
		   & 0x3fff);
	    Class183 class183_48_
		= Class253.method4631(class185, i_47_, 1177236321 * anInt11950,
				      anInt11933 * -1556313745,
				      anInt11934 * 956485751, i, -1828509815);
	    if (null != class183_48_) {
		class185.method3461(false);
		class183_48_.method3034(class446, null, 0);
		class185.method3461(true);
	    }
	}
    }
    
    boolean method18869(Class185 class185, int i, byte i_49_) {
	int i_50_ = i;
	Class570 class570 = method18531((byte) -100);
	Class711 class711 = ((aClass711_11948.method14338((byte) 0)
			      && !aClass711_11948.method14336(1882984066))
			     ? aClass711_11948 : null);
	Class711_Sub1 class711_sub1
	    = ((aClass711_Sub1_11965.method14338((byte) 0) && !aBool12218
		&& (!aClass711_Sub1_11965.aBool10971 || class711 == null))
	       ? aClass711_Sub1_11965 : null);
	int i_51_ = class570.anInt7630 * 680391951;
	int i_52_ = 1366655921 * class570.anInt7645;
	if (i_51_ != 0 || i_52_ != 0 || 0 != class570.anInt7657 * 2079472619
	    || class570.anInt7660 * -97068925 != 0)
	    i |= 0x7;
	int i_53_ = aClass57_11973.method1231(1512675687);
	boolean bool
	    = (0 != aByte11964 && client.anInt11101 >= anInt11959 * 569195869
	       && client.anInt11101 < anInt11960 * -507783033);
	if (bool)
	    i |= 0x80000;
	Class183 class183
	    = (aClass183Array11986[0]
	       = (aClass631_12226.method10434
		  (class185, i, Class200_Sub23.aClass44_Sub14_10041,
		   Class307.aClass44_Sub15_3349, Class578.aClass44_Sub3_7743,
		   Class531.aClass44_Sub7_7135, Class78.aClass103_825,
		   Class78.aClass103_825, class711, class711_sub1,
		   aClass711_Sub3_Sub1Array11968, anIntArray11920, i_53_, true,
		   Class69.aClass630_728, -2144734109)));
	int i_54_ = Class536.method8904(881833381);
	if (Class498.anInt5589 * 721369631 < 96 && i_54_ > 50)
	    Class151.method2544((byte) 72);
	if (client.aClass665_11211 != Class665.aClass665_8561 && i_54_ < 50) {
	    int i_55_;
	    for (i_55_ = 50 - i_54_; i_55_ > client.anInt11046 * -65833181;
		 client.anInt11046 += -102403957)
		Class305.aByteArrayArray3272[-65833181 * client.anInt11046]
		    = new byte[102400];
	    while (i_55_ < -65833181 * client.anInt11046) {
		client.anInt11046 -= -102403957;
		Class305.aByteArrayArray3272[client.anInt11046 * -65833181]
		    = null;
	    }
	} else if (Class665.aClass665_8561 != client.aClass665_11211) {
	    Class305.aByteArrayArray3272 = new byte[50][];
	    client.anInt11046 = 0;
	}
	if (class183 == null)
	    return false;
	anInt11927 = class183.method3045() * -4362271;
	anInt11981 = class183.method3049() * 2001645007;
	class183.method3042();
	method18537(class183, 487759238);
	if (i_51_ != 0 || i_52_ != 0) {
	    method18539(i_53_, i_51_, i_52_, class570.anInt7654 * 1532427929,
			class570.anInt7643 * 26013715, (byte) 52);
	    if (anInt11950 * 1177236321 != 0)
		class183.method3017(1177236321 * anInt11950);
	    if (0 != anInt11933 * -1556313745)
		class183.method3018(anInt11933 * -1556313745);
	    if (956485751 * anInt11934 != 0)
		class183.method3098(0, 956485751 * anInt11934, 0);
	} else
	    method18539(i_53_, method18545((byte) 1) << 9,
			method18545((byte) 1) << 9, 0, 0, (byte) 118);
	if (bool)
	    class183.method3058(aByte11928, aByte11962, aByte11963,
				aByte11964 & 0xff);
	if (!aBool12218)
	    method18538(class185, class570, i_50_, i_51_, i_52_, i_53_,
			2088438307);
	return true;
    }
    
    public String method18870(boolean bool) {
	if (bool)
	    return aString12228;
	return aString12211;
    }
    
    public void method18871(int i, int i_56_, int i_57_) {
	anInt11980 = 0;
	anInt11937 = 0;
	anInt11947 = 0;
	anIntArray11977[0] = i;
	anIntArray11978[0] = i_56_;
	int i_58_ = method18545((byte) 1);
	Class438 class438 = Class438.method6994(method10807().aClass438_4885);
	class438.aFloat4864 = (float) (256 * i_58_ + 512 * anIntArray11977[0]);
	class438.aFloat4865 = (float) (i_58_ * 256 + anIntArray11978[0] * 512);
	method10809(class438);
	class438.method7074();
	if (this == Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419)
	    client.aClass512_11100.method8501((byte) 24)
		.method10157(1386175202);
	if (aClass629_11983 != null)
	    aClass629_11983.method10384();
    }
    
    public final void method18872(int i, int i_59_, byte i_60_, byte i_61_) {
	if (aClass711_11948.method14338((byte) 0)
	    && (aClass711_11948.method14382(-1045096200).anInt2218 * -492433165
		== 1)) {
	    anIntArray11946 = null;
	    aClass711_11948.method14330(-1, 1130689539);
	}
	for (int i_62_ = 0; i_62_ < aClass529Array11949.length; i_62_++) {
	    if (aClass529Array11949[i_62_].anInt7123 * -1183861629 != -1) {
		Class684 class684
		    = ((Class684)
		       Class55.aClass44_Sub4_447.method91(((aClass529Array11949
							    [i_62_].anInt7123)
							   * -1183861629),
							  -349152295));
		if (class684.aBool8691 && class684.anInt8688 * -811043807 != -1
		    && (((Class205) (Class200_Sub12.aClass44_Sub1_9934.method91
				     (class684.anInt8688 * -811043807,
				      -1860797398))).anInt2218 * -492433165
			== 1)) {
		    aClass529Array11949[i_62_].aClass711_7121
			.method14330(-1, 2000829296);
		    aClass529Array11949[i_62_].anInt7123 = -496843307;
		}
	    }
	}
	anInt12223 = 1021477997;
	if (i < 0 || i >= client.aClass512_11100.method8417(-57253552)
	    || i_59_ < 0
	    || i_59_ >= client.aClass512_11100.method8418(-1533611049))
	    method18871(i, i_59_, -1867817063);
	else if (anIntArray11977[0] < 0
		 || (anIntArray11977[0]
		     >= client.aClass512_11100.method8417(2055090618))
		 || anIntArray11978[0] < 0
		 || (anIntArray11978[0]
		     >= client.aClass512_11100.method8418(-1533611049)))
	    method18871(i, i_59_, -1765025552);
	else
	    method18867(i, i_59_, i_60_, -1218221135);
    }
    
    public Class564 method16855(Class185 class185, short i) {
	return null;
    }
    
    public boolean method18588() {
	return Class620.aClass632_8113.aBool8239;
    }
    
    public int method145() {
	return 1126388985 * anInt11922;
    }
    
    public int method18545(byte i) {
	if (null != aClass631_12226
	    && 1568742735 * aClass631_12226.anInt8212 != -1)
	    return ((((Class307)
		      Class578.aClass44_Sub3_7743.method91((1568742735
							    * (aClass631_12226
							       .anInt8212)),
							   -2106365066))
		     .anInt3328)
		    * -1821838479);
	return super.method18545((byte) 1);
    }
    
    int method18529(byte i) {
	return anInt12225 * -298812809;
    }
    
    public boolean method18543(int i) {
	return Class620.aClass632_8113.aBool8239;
    }
    
    boolean method16846(Class185 class185, int i, int i_63_, byte i_64_) {
	if (aClass631_12226 == null
	    || !method18869(class185, 131072, (byte) -28))
	    return false;
	Class446 class446 = method10834();
	boolean bool = false;
	for (int i_65_ = 0; i_65_ < aClass183Array11986.length; i_65_++) {
	    if (aClass183Array11986[i_65_] != null
		&& aClass183Array11986[i_65_].aBool1971
		&& aClass183Array11986[i_65_].method3039(i, i_63_, class446,
							 true, 0)) {
		bool = true;
		break;
	    }
	}
	for (int i_66_ = 0; i_66_ < aClass183Array11986.length; i_66_++)
	    aClass183Array11986[i_66_] = null;
	return bool;
    }
    
    public Class443 method196() {
	Class443 class443 = Class443.method7137();
	class443.method7148(Class427.method6799(aClass57_11973.anInt457
						* 949937137),
			    0.0F, 0.0F);
	return class443;
    }
    
    public Class654_Sub1_Sub5_Sub1_Sub2(Class556 class556) {
	super(class556, Class562.aClass110_Sub1_Sub1_7560);
	anIntArray12233 = new int[8];
	anIntArray12217 = new int[8];
	anInt12210 = 0;
	anInt12219 = 0;
	anInt12220 = -810466567;
	anInt12221 = 0;
	anInt12223 = 1021477997;
	aBool12218 = false;
	anInt12224 = 0;
	anInt12230 = -2018919677;
	anInt12222 = -257035979;
	anInt12227 = 1016440263;
	anInt12231 = 1286676453;
	anInt12229 = 0;
	anInt12215 = -1640786827;
	aClass252_12232 = Class252.aClass252_2658;
	aClass618_12216 = Class618.aClass618_8099;
	aBool12234 = false;
	method18863(412240431);
    }
    
    public Class296 method185() {
	return Class296.aClass296_3163;
    }
    
    final void method18873(int i, int i_67_, byte i_68_) {
	if (anInt11980 * -1763707177 < anIntArray11977.length - 1)
	    anInt11980 += 990207207;
	for (int i_69_ = anInt11980 * -1763707177; i_69_ > 0; i_69_--) {
	    anIntArray11977[i_69_] = anIntArray11977[i_69_ - 1];
	    anIntArray11978[i_69_] = anIntArray11978[i_69_ - 1];
	    aByteArray11979[i_69_] = aByteArray11979[i_69_ - 1];
	}
	anIntArray11977[0] = i;
	anIntArray11978[0] = i_67_;
	aByteArray11979[0] = i_68_;
    }
    
    boolean method16882(Class185 class185, int i, int i_70_) {
	if (aClass631_12226 == null
	    || !method18869(class185, 131072, (byte) 40))
	    return false;
	Class446 class446 = method10834();
	boolean bool = false;
	for (int i_71_ = 0; i_71_ < aClass183Array11986.length; i_71_++) {
	    if (aClass183Array11986[i_71_] != null
		&& aClass183Array11986[i_71_].aBool1971
		&& aClass183Array11986[i_71_].method3039(i, i_70_, class446,
							 true, 0)) {
		bool = true;
		break;
	    }
	}
	for (int i_72_ = 0; i_72_ < aClass183Array11986.length; i_72_++)
	    aClass183Array11986[i_72_] = null;
	return bool;
    }
    
    public int method18549(byte i) {
	return -(1126388985 * anInt11922) - 1;
    }
    
    public Class296 method184(int i) {
	return Class296.aClass296_3163;
    }
    
    public int method90(byte i) {
	return 1126388985 * anInt11922;
    }
    
    public Class534_Sub36 method182(int i) {
	Class597 class597 = client.aClass512_11100.method8416((byte) 49);
	return (Class534_Sub33.method16405
		(aByte10854,
		 ((int) method10807().aClass438_4885.aFloat4864
		  + 1852947968 * class597.anInt7859),
		 -(int) method10807().aClass438_4885.aFloat4863,
		 ((int) method10807().aClass438_4885.aFloat4865
		  + class597.anInt7861 * -139729408),
		 1104938557));
    }
    
    public Class443 method183(int i) {
	Class443 class443 = Class443.method7137();
	class443.method7148(Class427.method6799(aClass57_11973.anInt457
						* 949937137),
			    0.0F, 0.0F);
	return class443;
    }
    
    public Class438 method186(int i) {
	return Class438.method7061();
    }
    
    public Class526 method18590() {
	if (null != aClass526_11935) {
	    if (null == aClass526_11935.aString7094)
		return null;
	    if (-700159681 * client.anInt11295 == 0
		|| -700159681 * client.anInt11295 == 3
		|| (-700159681 * client.anInt11295 == 1
		    && Class46.method1112(aString12211, (byte) 58)))
		return aClass526_11935;
	}
	return null;
    }
    
    public String method18874(boolean bool) {
	String string = "";
	if (null != aString12212)
	    string = aString12212;
	if (bool)
	    string = new StringBuilder().append(string).append
			 (aString12228).toString();
	else
	    string = new StringBuilder().append(string).append
			 (aString12211).toString();
	if (null != aString12213)
	    string = new StringBuilder().append(string).append
			 (aString12213).toString();
	return string;
    }
    
    public Class564 method16872(Class185 class185) {
	return null;
    }
    
    public Class296 method188() {
	return Class296.aClass296_3163;
    }
    
    boolean method16873(Class185 class185, int i, int i_73_) {
	if (aClass631_12226 == null
	    || !method18869(class185, 131072, (byte) 67))
	    return false;
	Class446 class446 = method10834();
	boolean bool = false;
	for (int i_74_ = 0; i_74_ < aClass183Array11986.length; i_74_++) {
	    if (aClass183Array11986[i_74_] != null
		&& aClass183Array11986[i_74_].aBool1971
		&& aClass183Array11986[i_74_].method3039(i, i_73_, class446,
							 true, 0)) {
		bool = true;
		break;
	    }
	}
	for (int i_75_ = 0; i_75_ < aClass183Array11986.length; i_75_++)
	    aClass183Array11986[i_75_] = null;
	return bool;
    }
    
    Class550 method16853(Class185 class185, int i) {
	if (null == aClass631_12226 || !method18869(class185, 2048, (byte) -3))
	    return null;
	Class446 class446 = class185.method3665();
	Class446 class446_76_ = method10834();
	Class444 class444 = method10807();
	int i_77_ = aClass57_11973.method1231(200433315);
	Class568 class568
	    = (aClass556_10855.aClass568ArrayArrayArray7431[aByte10854]
	       [(int) class444.aClass438_4885.aFloat4864 >> 9]
	       [(int) class444.aClass438_4885.aFloat4865 >> 9]);
	if (class568 != null && null != class568.aClass654_Sub1_Sub2_7607) {
	    int i_78_ = (anInt11930 * -996512449
			 - class568.aClass654_Sub1_Sub2_7607.aShort11864);
	    anInt11930 = (int) ((float) (anInt11930 * -996512449)
				- (float) i_78_ / 10.0F) * -1299053889;
	} else
	    anInt11930 = ((int) ((float) (anInt11930 * -996512449)
				 - (float) (anInt11930 * -996512449) / 10.0F)
			  * -1299053889);
	class446.method7236(class446_76_);
	class446.method7287(0.0F, (float) (-20 - -996512449 * anInt11930),
			    0.0F);
	Class550 class550 = null;
	aBool11961 = false;
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub1_10762
		.method16828(62926167)
	    == 1) {
	    Class570 class570 = method18531((byte) -70);
	    if (class570.aBool7639
		&& (-1 == 1568742735 * aClass631_12226.anInt8212
		    || (((Class307)
			 Class578.aClass44_Sub3_7743.method91(((aClass631_12226
								.anInt8212)
							       * 1568742735),
							      -506090392))
			.aBool3281))) {
		Class711 class711
		    = ((aClass711_11948.method14338((byte) 0)
			&& aClass711_11948.method14336(1404858623))
		       ? aClass711_11948 : null);
		Class711_Sub1 class711_sub1
		    = ((aClass711_Sub1_11965.method14338((byte) 0)
			&& (!aClass711_Sub1_11965.aBool10971
			    || null == class711))
		       ? aClass711_Sub1_11965 : null);
		short i_79_ = Class620.aClass632_8113.aShort8237;
		byte i_80_ = Class620.aClass632_8113.aByte8238;
		if (-1 != 1568742735 * aClass631_12226.anInt8212) {
		    i_79_
			= ((Class307) (Class578.aClass44_Sub3_7743.method91
				       (aClass631_12226.anInt8212 * 1568742735,
					808872751))).aShort3323;
		    i_80_
			= ((Class307) (Class578.aClass44_Sub3_7743.method91
				       (1568742735 * aClass631_12226.anInt8212,
					-1447198737))).aByte3324;
		}
		Object object = null;
		Class183 class183;
		if (i_79_ > -1
		    && Class44_Sub6.aClass534_Sub35_10989
			   .aClass690_Sub16_10763.method17030((byte) -7) == 1)
		    class183
			= (Class690_Sub35.method17182
			   (class185, i_77_, anInt11950 * 1177236321,
			    anInt11933 * -1556313745, anInt11934 * 956485751,
			    aClass183Array11986[0], i_79_, i_80_,
			    (null != class711_sub1 ? (Class711) class711_sub1
			     : class711),
			    (byte) 64));
		else
		    class183
			= Class200_Sub3.method15570(class185, i_77_,
						    anInt11950 * 1177236321,
						    anInt11933 * -1556313745,
						    anInt11934 * 956485751, 1,
						    aClass183Array11986[0], 0,
						    0, 160, 240,
						    (null != class711_sub1
						     ? (Class711) class711_sub1
						     : class711),
						    -1902730223);
		if (class183 != null) {
		    if (aClass194Array10852 == null
			|| (aClass194Array10852.length
			    < 1 + aClass183Array11986.length))
			method16862(aClass183Array11986.length + 1,
				    -1657220444);
		    class550 = Class322.method5779(true, -154879610);
		    aBool11961 = true;
		    class185.method3461(false);
		    class183.method3034(class446,
					(aClass194Array10852
					 [aClass183Array11986.length]),
					0);
		    class185.method3461(true);
		}
	    }
	}
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 == this) {
	    for (int i_81_ = client.aClass99Array11053.length - 1; i_81_ >= 0;
		 i_81_--) {
		Class99 class99 = client.aClass99Array11053[i_81_];
		if (null != class99 && class99.anInt1174 * 645502113 != -1) {
		    if (1 == class99.anInt1176 * 652406965) {
			Class534_Sub6 class534_sub6
			    = ((Class534_Sub6)
			       (client.aClass9_11331.method579
				((long) (class99.anInt1169 * -879249997))));
			if (class534_sub6 != null) {
			    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
				= ((Class654_Sub1_Sub5_Sub1_Sub1)
				   class534_sub6.anObject10417);
			    Class438 class438
				= (Class438.method7055
				   ((class654_sub1_sub5_sub1_sub1.method10807()
				     .aClass438_4885),
				    Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.method10807().aClass438_4885));
			    int i_82_ = (int) class438.aFloat4864;
			    int i_83_ = (int) class438.aFloat4865;
			    method18868(class185, class446,
					aClass183Array11986[0], (long) i_82_,
					(long) i_83_,
					645502113 * class99.anInt1174,
					92160000L);
			}
		    }
		    if (652406965 * class99.anInt1176 == 2) {
			Class438 class438
			    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				   .method10807
			       ().aClass438_4885);
			long l = (long) (487170425 * class99.anInt1171
					 - (int) class438.aFloat4864);
			long l_84_ = (long) (class99.anInt1172 * 631467137
					     - (int) class438.aFloat4865);
			long l_85_
			    = (long) (class99.anInt1175 * -41335265 << 9);
			l_85_ *= l_85_;
			method18868(class185, class446, aClass183Array11986[0],
				    l, l_84_, class99.anInt1174 * 645502113,
				    l_85_);
		    }
		    if (10 == 652406965 * class99.anInt1176
			&& -879249997 * class99.anInt1169 >= 0
			&& (-879249997 * class99.anInt1169
			    < (client
			       .aClass654_Sub1_Sub5_Sub1_Sub2Array11279).length)) {
			Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2_86_
			    = (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			       [-879249997 * class99.anInt1169]);
			if (class654_sub1_sub5_sub1_sub2_86_ != null) {
			    Class438 class438
				= (Class438.method7055
				   (class654_sub1_sub5_sub1_sub2_86_
					.method10807().aClass438_4885,
				    Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.method10807().aClass438_4885));
			    int i_87_ = (int) class438.aFloat4864;
			    int i_88_ = (int) class438.aFloat4865;
			    method18868(class185, class446,
					aClass183Array11986[0], (long) i_87_,
					(long) i_88_,
					645502113 * class99.anInt1174,
					92160000L);
			}
		    }
		}
	    }
	}
	class446.method7236(class446_76_);
	class446.method7287(0.0F, (float) (-5 - anInt11930 * -996512449),
			    0.0F);
	if (aClass194Array10852 == null
	    || aClass194Array10852.length < aClass183Array11986.length)
	    method16862(aClass183Array11986.length, -316977562);
	if (null == class550)
	    class550 = Class322.method5779(true, 8565837);
	method18528(class185, aClass183Array11986, class446, false, 741181619);
	for (int i_89_ = 0; i_89_ < aClass183Array11986.length; i_89_++) {
	    if (aClass183Array11986[i_89_] != null)
		aClass183Array11986[i_89_].method3034
		    (class446, aClass194Array10852[i_89_],
		     (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 == this ? 1
		      : 0));
	    else
		aClass194Array10852[i_89_].aBool2150 = false;
	}
	if (aClass629_11983 != null) {
	    Class174 class174 = aClass629_11983.method10405();
	    class185.method3334(class174);
	}
	for (int i_90_ = 0; i_90_ < aClass183Array11986.length; i_90_++) {
	    if (null != aClass183Array11986[i_90_])
		aBool11961 |= aClass183Array11986[i_90_].method3027();
	    aClass183Array11986[i_90_] = null;
	}
	anInt11940 = client.anInt11161 * 842490719;
	return class550;
    }
    
    public int method181() {
	return 1126388985 * anInt11922;
    }
    
    public int method190() {
	return 1126388985 * anInt11922;
    }
    
    public Class534_Sub36 method191() {
	Class597 class597 = client.aClass512_11100.method8416((byte) 51);
	return (Class534_Sub33.method16405
		(aByte10854,
		 ((int) method10807().aClass438_4885.aFloat4864
		  + 1852947968 * class597.anInt7859),
		 -(int) method10807().aClass438_4885.aFloat4863,
		 ((int) method10807().aClass438_4885.aFloat4865
		  + class597.anInt7861 * -139729408),
		 1104938557));
    }
    
    public Class534_Sub36 method195() {
	Class597 class597 = client.aClass512_11100.method8416((byte) 74);
	return (Class534_Sub33.method16405
		(aByte10854,
		 ((int) method10807().aClass438_4885.aFloat4864
		  + 1852947968 * class597.anInt7859),
		 -(int) method10807().aClass438_4885.aFloat4863,
		 ((int) method10807().aClass438_4885.aFloat4865
		  + class597.anInt7861 * -139729408),
		 1104938557));
    }
    
    public Class534_Sub36 method193() {
	Class597 class597 = client.aClass512_11100.method8416((byte) 33);
	return (Class534_Sub33.method16405
		(aByte10854,
		 ((int) method10807().aClass438_4885.aFloat4864
		  + 1852947968 * class597.anInt7859),
		 -(int) method10807().aClass438_4885.aFloat4863,
		 ((int) method10807().aClass438_4885.aFloat4865
		  + class597.anInt7861 * -139729408),
		 1104938557));
    }
    
    public Class534_Sub36 method194() {
	Class597 class597 = client.aClass512_11100.method8416((byte) 84);
	return (Class534_Sub33.method16405
		(aByte10854,
		 ((int) method10807().aClass438_4885.aFloat4864
		  + 1852947968 * class597.anInt7859),
		 -(int) method10807().aClass438_4885.aFloat4863,
		 ((int) method10807().aClass438_4885.aFloat4865
		  + class597.anInt7861 * -139729408),
		 1104938557));
    }
    
    public Class443 method197() {
	Class443 class443 = Class443.method7137();
	class443.method7148(Class427.method6799(aClass57_11973.anInt457
						* 949937137),
			    0.0F, 0.0F);
	return class443;
    }
    
    public Class296 method192() {
	return Class296.aClass296_3163;
    }
    
    public int method18602() {
	return -(1126388985 * anInt11922) - 1;
    }
    
    public void method18875(String string, int i, int i_91_, int i_92_) {
	method18563(string, i, i_91_,
		    (Class469.method7641((byte) -7)
		     * (Class620.aClass632_8113.anInt8247 * 2023048963)),
		    (short) 353);
    }
    
    public Class438 method198() {
	return Class438.method7061();
    }
    
    public Class564 method16870(Class185 class185) {
	return null;
    }
    
    void method16871(Class185 class185) {
	if (aClass631_12226 != null
	    && (aBool11984 || method18869(class185, 0, (byte) 2))) {
	    Class446 class446 = class185.method3665();
	    class446.method7237(method10807());
	    class446.method7287(0.0F, -5.0F, 0.0F);
	    method18528(class185, aClass183Array11986, class446, aBool11984,
			-625873883);
	    for (int i = 0; i < aClass183Array11986.length; i++)
		aClass183Array11986[i] = null;
	}
    }
    
    boolean method16880(Class185 class185, int i, int i_93_) {
	if (aClass631_12226 == null
	    || !method18869(class185, 131072, (byte) -42))
	    return false;
	Class446 class446 = method10834();
	boolean bool = false;
	for (int i_94_ = 0; i_94_ < aClass183Array11986.length; i_94_++) {
	    if (aClass183Array11986[i_94_] != null
		&& aClass183Array11986[i_94_].aBool1971
		&& aClass183Array11986[i_94_].method3039(i, i_93_, class446,
							 true, 0)) {
		bool = true;
		break;
	    }
	}
	for (int i_95_ = 0; i_95_ < aClass183Array11986.length; i_95_++)
	    aClass183Array11986[i_95_] = null;
	return bool;
    }
    
    public final boolean method18876(int i) {
	if (aClass631_12226 == null)
	    return false;
	return true;
    }
    
    boolean method16874(Class185 class185, int i, int i_96_) {
	if (aClass631_12226 == null
	    || !method18869(class185, 131072, (byte) -8))
	    return false;
	Class446 class446 = method10834();
	boolean bool = false;
	for (int i_97_ = 0; i_97_ < aClass183Array11986.length; i_97_++) {
	    if (aClass183Array11986[i_97_] != null
		&& aClass183Array11986[i_97_].aBool1971
		&& aClass183Array11986[i_97_].method3039(i, i_96_, class446,
							 true, 0)) {
		bool = true;
		break;
	    }
	}
	for (int i_98_ = 0; i_98_ < aClass183Array11986.length; i_98_++)
	    aClass183Array11986[i_98_] = null;
	return bool;
    }
    
    public Class443 method189() {
	Class443 class443 = Class443.method7137();
	class443.method7148(Class427.method6799(aClass57_11973.anInt457
						* 949937137),
			    0.0F, 0.0F);
	return class443;
    }
    
    public String method18877(boolean bool, int i) {
	String string = "";
	if (null != aString12212)
	    string = aString12212;
	if (bool)
	    string = new StringBuilder().append(string).append
			 (aString12228).toString();
	else
	    string = new StringBuilder().append(string).append
			 (aString12211).toString();
	if (null != aString12213)
	    string = new StringBuilder().append(string).append
			 (aString12213).toString();
	return string;
    }
    
    final void method16877(Class185 class185, Class654_Sub1 class654_sub1,
			   int i, int i_99_, int i_100_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method16883(Class185 class185, Class654_Sub1 class654_sub1,
			   int i, int i_101_, int i_102_, boolean bool) {
	throw new IllegalStateException();
    }
    
    public String method18878(boolean bool) {
	if (bool)
	    return aString12228;
	return aString12211;
    }
    
    final void method16865() {
	throw new IllegalStateException();
    }
    
    void method18879(Class185 class185, Class446 class446, Class183 class183,
		     long l, long l_103_, int i, long l_104_) {
	long l_105_ = l_103_ * l_103_ + l * l;
	if (l_105_ >= 262144L && l_105_ <= l_104_) {
	    int i_106_
		= ((int) ((Math.atan2((double) l, (double) l_103_)
			   * 2607.5945876176133)
			  - (double) aClass57_11973.method1231(922263138))
		   & 0x3fff);
	    Class183 class183_107_
		= Class253.method4631(class185, i_106_,
				      1177236321 * anInt11950,
				      anInt11933 * -1556313745,
				      anInt11934 * 956485751, i, 1859957369);
	    if (null != class183_107_) {
		class185.method3461(false);
		class183_107_.method3034(class446, null, 0);
		class185.method3461(true);
	    }
	}
    }
    
    int method18579() {
	return anInt12225 * -298812809;
    }
    
    int method18551() {
	return anInt12225 * -298812809;
    }
    
    int method18581() {
	return anInt12225 * -298812809;
    }
    
    public int method18573() {
	return -1;
    }
    
    public int method18600(byte i) {
	return -1;
    }
    
    public boolean method18586() {
	return Class620.aClass632_8113.aBool8239;
    }
    
    public boolean method18587() {
	return Class620.aClass632_8113.aBool8239;
    }
    
    final boolean method16861() {
	return false;
    }
    
    public Class526 method18598() {
	if (null != aClass526_11935) {
	    if (null == aClass526_11935.aString7094)
		return null;
	    if (-700159681 * client.anInt11295 == 0
		|| -700159681 * client.anInt11295 == 3
		|| (-700159681 * client.anInt11295 == 1
		    && Class46.method1112(aString12211, (byte) 3)))
		return aClass526_11935;
	}
	return null;
    }
    
    public Class526 method18541() {
	if (null != aClass526_11935) {
	    if (null == aClass526_11935.aString7094)
		return null;
	    if (-700159681 * client.anInt11295 == 0
		|| -700159681 * client.anInt11295 == 3
		|| (-700159681 * client.anInt11295 == 1
		    && Class46.method1112(aString12211, (byte) 28)))
		return aClass526_11935;
	}
	return null;
    }
    
    public Class296 method187() {
	return Class296.aClass296_3163;
    }
    
    public final void method18880(Class534_Sub40 class534_sub40) {
	class534_sub40.anInt10811 = 0;
	int i = class534_sub40.method16527(-2128357538);
	byte i_108_ = (byte) (i & 0x1);
	boolean bool = (i & 0x4) != 0;
	int i_109_ = super.method18545((byte) 1);
	method18535((i >> 3 & 0x7) + 1, -451743309);
	boolean bool_110_ = 0 != (i & 0x40);
	boolean bool_111_ = (i & 0x80) != 0;
	Class438 class438 = Class438.method6994(method10807().aClass438_4885);
	class438.aFloat4864 += (float) (method18545((byte) 1) - i_109_ << 8);
	class438.aFloat4865 += (float) (method18545((byte) 1) - i_109_ << 8);
	method10809(class438);
	class438.method7074();
	if (bool_110_)
	    aString12212 = class534_sub40.method16523(-1912744988);
	else
	    aString12212 = null;
	if (bool_111_)
	    aString12213 = class534_sub40.method16523(-1971370016);
	else
	    aString12213 = null;
	aClass618_12216
	    = ((Class618)
	       Class448.method7319(Class618.method10239(1834247536),
				   class534_sub40.method16586((byte) 1),
				   2088438307));
	if (Class665.aClass665_8561 == client.aClass665_11211
	    && client.anInt11194 * 365872613 >= 2)
	    aClass618_12216 = Class618.aClass618_8099;
	method18864(class534_sub40, i_108_, 9737188);
	aString12228 = class534_sub40.method16541((byte) -70);
	aString12211 = aString12228;
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 == this)
	    RuntimeException_Sub1.aString12085 = aString12228;
	anInt12210 = class534_sub40.method16527(1824948803) * 1539382797;
	if (bool) {
	    anInt12221 = class534_sub40.method16529((byte) 1) * -1240813047;
	    if (-825066439 * anInt12221 == 65535)
		anInt12221 = 1240813047;
	    anInt12219 = -1924340515 * anInt12210;
	    anInt12220 = -810466567;
	} else {
	    anInt12221 = 0;
	    anInt12219 = class534_sub40.method16527(-1264700398) * 1230406969;
	    anInt12220 = class534_sub40.method16527(-2123690438) * 810466567;
	    if (anInt12220 * 800727223 == 255)
		anInt12220 = -810466567;
	}
	int i_112_ = -785793877 * anInt12229;
	anInt12229 = class534_sub40.method16527(-821040383) * -1280025085;
	if (0 != anInt12229 * -785793877) {
	    int i_113_ = -729876395 * anInt12230;
	    int i_114_ = -2046269725 * anInt12222;
	    int i_115_ = 1734964233 * anInt12227;
	    int i_116_ = anInt12231 * -510526957;
	    int i_117_ = anInt12215 * 18694435;
	    anInt12230 = class534_sub40.method16529((byte) 1) * 2018919677;
	    anInt12222 = class534_sub40.method16529((byte) 1) * 257035979;
	    anInt12227 = class534_sub40.method16529((byte) 1) * -1016440263;
	    anInt12231 = class534_sub40.method16529((byte) 1) * -1286676453;
	    anInt12215 = class534_sub40.method16527(-635188918) * 616756875;
	    if (anInt12229 * -785793877 != i_112_
		|| anInt12230 * -729876395 != i_113_
		|| i_114_ != -2046269725 * anInt12222
		|| i_115_ != anInt12227 * 1734964233
		|| i_116_ != -510526957 * anInt12231
		|| i_117_ != 18694435 * anInt12215)
		Class612.method10107(this, 1531739761);
	} else
	    Class576.method9763(this, -311458662);
    }
    
    public int method18560() {
	return -(1126388985 * anInt11922) - 1;
    }
    
    public int method18604() {
	return -(1126388985 * anInt11922) - 1;
    }
    
    public int method18605() {
	return -(1126388985 * anInt11922) - 1;
    }
    
    Class550 method16884(Class185 class185) {
	if (null == aClass631_12226
	    || !method18869(class185, 2048, (byte) -45))
	    return null;
	Class446 class446 = class185.method3665();
	Class446 class446_118_ = method10834();
	Class444 class444 = method10807();
	int i = aClass57_11973.method1231(163630841);
	Class568 class568
	    = (aClass556_10855.aClass568ArrayArrayArray7431[aByte10854]
	       [(int) class444.aClass438_4885.aFloat4864 >> 9]
	       [(int) class444.aClass438_4885.aFloat4865 >> 9]);
	if (class568 != null && null != class568.aClass654_Sub1_Sub2_7607) {
	    int i_119_ = (anInt11930 * -996512449
			  - class568.aClass654_Sub1_Sub2_7607.aShort11864);
	    anInt11930 = (int) ((float) (anInt11930 * -996512449)
				- (float) i_119_ / 10.0F) * -1299053889;
	} else
	    anInt11930 = ((int) ((float) (anInt11930 * -996512449)
				 - (float) (anInt11930 * -996512449) / 10.0F)
			  * -1299053889);
	class446.method7236(class446_118_);
	class446.method7287(0.0F, (float) (-20 - -996512449 * anInt11930),
			    0.0F);
	Class550 class550 = null;
	aBool11961 = false;
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub1_10762
		.method16828(62926167)
	    == 1) {
	    Class570 class570 = method18531((byte) -73);
	    if (class570.aBool7639
		&& (-1 == 1568742735 * aClass631_12226.anInt8212
		    || (((Class307)
			 Class578.aClass44_Sub3_7743.method91(((aClass631_12226
								.anInt8212)
							       * 1568742735),
							      -420760308))
			.aBool3281))) {
		Class711 class711
		    = ((aClass711_11948.method14338((byte) 0)
			&& aClass711_11948.method14336(1413392858))
		       ? aClass711_11948 : null);
		Class711_Sub1 class711_sub1
		    = ((aClass711_Sub1_11965.method14338((byte) 0)
			&& (!aClass711_Sub1_11965.aBool10971
			    || null == class711))
		       ? aClass711_Sub1_11965 : null);
		short i_120_ = Class620.aClass632_8113.aShort8237;
		byte i_121_ = Class620.aClass632_8113.aByte8238;
		if (-1 != 1568742735 * aClass631_12226.anInt8212) {
		    i_120_
			= ((Class307) (Class578.aClass44_Sub3_7743.method91
				       (aClass631_12226.anInt8212 * 1568742735,
					836724914))).aShort3323;
		    i_121_
			= ((Class307) (Class578.aClass44_Sub3_7743.method91
				       (1568742735 * aClass631_12226.anInt8212,
					187340162))).aByte3324;
		}
		Object object = null;
		Class183 class183;
		if (i_120_ > -1
		    && Class44_Sub6.aClass534_Sub35_10989
			   .aClass690_Sub16_10763.method17030((byte) 17) == 1)
		    class183
			= (Class690_Sub35.method17182
			   (class185, i, anInt11950 * 1177236321,
			    anInt11933 * -1556313745, anInt11934 * 956485751,
			    aClass183Array11986[0], i_120_, i_121_,
			    (null != class711_sub1 ? (Class711) class711_sub1
			     : class711),
			    (byte) 64));
		else
		    class183
			= Class200_Sub3.method15570(class185, i,
						    anInt11950 * 1177236321,
						    anInt11933 * -1556313745,
						    anInt11934 * 956485751, 1,
						    aClass183Array11986[0], 0,
						    0, 160, 240,
						    (null != class711_sub1
						     ? (Class711) class711_sub1
						     : class711),
						    -1444647010);
		if (class183 != null) {
		    if (aClass194Array10852 == null
			|| (aClass194Array10852.length
			    < 1 + aClass183Array11986.length))
			method16862(aClass183Array11986.length + 1,
				    -1478521413);
		    class550 = Class322.method5779(true, 1820640595);
		    aBool11961 = true;
		    class185.method3461(false);
		    class183.method3034(class446,
					(aClass194Array10852
					 [aClass183Array11986.length]),
					0);
		    class185.method3461(true);
		}
	    }
	}
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 == this) {
	    for (int i_122_ = client.aClass99Array11053.length - 1;
		 i_122_ >= 0; i_122_--) {
		Class99 class99 = client.aClass99Array11053[i_122_];
		if (null != class99 && class99.anInt1174 * 645502113 != -1) {
		    if (1 == class99.anInt1176 * 652406965) {
			Class534_Sub6 class534_sub6
			    = ((Class534_Sub6)
			       (client.aClass9_11331.method579
				((long) (class99.anInt1169 * -879249997))));
			if (class534_sub6 != null) {
			    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
				= ((Class654_Sub1_Sub5_Sub1_Sub1)
				   class534_sub6.anObject10417);
			    Class438 class438
				= (Class438.method7055
				   ((class654_sub1_sub5_sub1_sub1.method10807()
				     .aClass438_4885),
				    Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.method10807().aClass438_4885));
			    int i_123_ = (int) class438.aFloat4864;
			    int i_124_ = (int) class438.aFloat4865;
			    method18868(class185, class446,
					aClass183Array11986[0], (long) i_123_,
					(long) i_124_,
					645502113 * class99.anInt1174,
					92160000L);
			}
		    }
		    if (652406965 * class99.anInt1176 == 2) {
			Class438 class438
			    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				   .method10807
			       ().aClass438_4885);
			long l = (long) (487170425 * class99.anInt1171
					 - (int) class438.aFloat4864);
			long l_125_ = (long) (class99.anInt1172 * 631467137
					      - (int) class438.aFloat4865);
			long l_126_
			    = (long) (class99.anInt1175 * -41335265 << 9);
			l_126_ *= l_126_;
			method18868(class185, class446, aClass183Array11986[0],
				    l, l_125_, class99.anInt1174 * 645502113,
				    l_126_);
		    }
		    if (10 == 652406965 * class99.anInt1176
			&& -879249997 * class99.anInt1169 >= 0
			&& (-879249997 * class99.anInt1169
			    < (client
			       .aClass654_Sub1_Sub5_Sub1_Sub2Array11279).length)) {
			Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2_127_
			    = (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			       [-879249997 * class99.anInt1169]);
			if (class654_sub1_sub5_sub1_sub2_127_ != null) {
			    Class438 class438
				= (Class438.method7055
				   (class654_sub1_sub5_sub1_sub2_127_
					.method10807().aClass438_4885,
				    Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.method10807().aClass438_4885));
			    int i_128_ = (int) class438.aFloat4864;
			    int i_129_ = (int) class438.aFloat4865;
			    method18868(class185, class446,
					aClass183Array11986[0], (long) i_128_,
					(long) i_129_,
					645502113 * class99.anInt1174,
					92160000L);
			}
		    }
		}
	    }
	}
	class446.method7236(class446_118_);
	class446.method7287(0.0F, (float) (-5 - anInt11930 * -996512449),
			    0.0F);
	if (aClass194Array10852 == null
	    || aClass194Array10852.length < aClass183Array11986.length)
	    method16862(aClass183Array11986.length, -1432468641);
	if (null == class550)
	    class550 = Class322.method5779(true, 1578051599);
	method18528(class185, aClass183Array11986, class446, false,
		    1753656335);
	for (int i_130_ = 0; i_130_ < aClass183Array11986.length; i_130_++) {
	    if (aClass183Array11986[i_130_] != null)
		aClass183Array11986[i_130_].method3034
		    (class446, aClass194Array10852[i_130_],
		     (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 == this ? 1
		      : 0));
	    else
		aClass194Array10852[i_130_].aBool2150 = false;
	}
	if (aClass629_11983 != null) {
	    Class174 class174 = aClass629_11983.method10405();
	    class185.method3334(class174);
	}
	for (int i_131_ = 0; i_131_ < aClass183Array11986.length; i_131_++) {
	    if (null != aClass183Array11986[i_131_])
		aBool11961 |= aClass183Array11986[i_131_].method3027();
	    aClass183Array11986[i_131_] = null;
	}
	anInt11940 = client.anInt11161 * 842490719;
	return class550;
    }
    
    final boolean method16848(byte i) {
	return false;
    }
    
    public void method18881(Class534_Sub40 class534_sub40, byte i) {
	aByte12214 = i;
	int i_132_ = -1;
	anInt12224 = 0;
	int[] is = new int[Class69.aClass630_728.anIntArray8196.length];
	Class17[] class17s
	    = new Class17[Class69.aClass630_728.anIntArray8196.length];
	Class15[] class15s
	    = new Class15[Class69.aClass630_728.anIntArray8196.length];
	for (int i_133_ = 0;
	     i_133_ < Class69.aClass630_728.anIntArray8196.length; i_133_++) {
	    if (1 != Class69.aClass630_728.anIntArray8196[i_133_]) {
		int i_134_ = class534_sub40.method16527(556749501);
		if (i_134_ == 0)
		    is[i_133_] = 0;
		else {
		    int i_135_ = class534_sub40.method16527(-1957976709);
		    int i_136_ = (i_134_ << 8) + i_135_;
		    if (i_133_ == 0 && 65535 == i_136_) {
			i_132_ = class534_sub40.method16550((byte) 87);
			anInt12224 = (class534_sub40.method16527(-1791898626)
				      * -569974883);
			break;
		    }
		    if (i_136_ >= 16384) {
			i_136_ -= 16384;
			is[i_133_] = i_136_ | 0x40000000;
			class15s[i_133_]
			    = (Class15) Class531.aClass44_Sub7_7135
					    .method91(i_136_, 735634820);
			int i_137_ = -1277070211 * class15s[i_133_].anInt104;
			if (i_137_ != 0)
			    anInt12224 = -569974883 * i_137_;
		    } else
			is[i_133_] = i_136_ - 256 | ~0x7fffffff;
		}
	    }
	}
	if (-1 == i_132_) {
	    int i_138_ = class534_sub40.method16529((byte) 1);
	    int i_139_ = 0;
	    for (int i_140_ = 0;
		 i_140_ < Class69.aClass630_728.anIntArray8196.length;
		 i_140_++) {
		if (Class69.aClass630_728.anIntArray8196[i_140_] == 0) {
		    if (0 != (i_138_ & 1 << i_139_))
			class17s[i_140_]
			    = Class475.method7766(class15s[i_140_],
						  class534_sub40, -163898500);
		    i_139_++;
		}
	    }
	}
	int[] is_141_ = new int[10];
	for (int i_142_ = 0; i_142_ < 10; i_142_++) {
	    int i_143_ = class534_sub40.method16527(1480982321);
	    if (Class312.aShortArrayArrayArray3371.length < 1 || i_143_ < 0
		|| (i_143_
		    >= Class312.aShortArrayArrayArray3371[i_142_][0].length))
		i_143_ = 0;
	    is_141_[i_142_] = i_143_;
	}
	int[] is_144_ = new int[10];
	for (int i_145_ = 0; i_145_ < 10; i_145_++) {
	    int i_146_ = class534_sub40.method16527(-1027771566);
	    if (Class473.aShortArrayArrayArray5173.length < 1 || i_146_ < 0
		|| (i_146_
		    >= Class473.aShortArrayArrayArray5173[i_145_][0].length))
		i_146_ = 0;
	    is_144_[i_145_] = i_146_;
	}
	anInt12225 = class534_sub40.method16529((byte) 1) * -522485945;
	if (null == aClass631_12226)
	    aClass631_12226 = new Class631();
	int i_147_ = aClass631_12226.anInt8212 * 1568742735;
	int[] is_148_ = aClass631_12226.anIntArray8208;
	aClass631_12226.method10435(method18529((byte) 102), is, class17s,
				    is_141_, is_144_, 1 == aByte12214, i_132_,
				    (short) 21565);
	if (i_147_ != i_132_) {
	    Class438 class438
		= Class438.method6994(method10807().aClass438_4885);
	    class438.aFloat4864 = (float) ((anIntArray11977[0] << 9)
					   + (method18545((byte) 1) << 8));
	    class438.aFloat4865 = (float) ((anIntArray11978[0] << 9)
					   + (method18545((byte) 1) << 8));
	    method10809(class438);
	    class438.method7074();
	}
	if (client.anInt11037 * -643758853 == anInt11922 * 1126388985
	    && null != is_148_) {
	    for (int i_149_ = 0; i_149_ < is_141_.length; i_149_++) {
		if (is_141_[i_149_] != is_148_[i_149_]) {
		    Class531.aClass44_Sub7_7135.method17316(-1556099612);
		    break;
		}
	    }
	}
	if (aClass629_11983 != null)
	    aClass629_11983.method10384();
	if (aClass711_Sub1_11965.method14338((byte) 0)
	    && aClass711_Sub1_11965.aBool10971) {
	    Class570 class570 = method18531((byte) -25);
	    if (!class570.method9613(aClass711_Sub1_11965
					 .method14329(1254438224),
				     -622301414)) {
		aClass711_Sub1_11965.method14330(-1, 1434885982);
		aClass711_Sub1_11965.aBool10971 = false;
	    }
	}
    }
    
    public String method18882(boolean bool, int i) {
	if (bool)
	    return aString12228;
	return aString12211;
    }
    
    public final void method18883(Class534_Sub40 class534_sub40) {
	class534_sub40.anInt10811 = 0;
	int i = class534_sub40.method16527(603772628);
	byte i_150_ = (byte) (i & 0x1);
	boolean bool = (i & 0x4) != 0;
	int i_151_ = super.method18545((byte) 1);
	method18535((i >> 3 & 0x7) + 1, -2006796388);
	boolean bool_152_ = 0 != (i & 0x40);
	boolean bool_153_ = (i & 0x80) != 0;
	Class438 class438 = Class438.method6994(method10807().aClass438_4885);
	class438.aFloat4864 += (float) (method18545((byte) 1) - i_151_ << 8);
	class438.aFloat4865 += (float) (method18545((byte) 1) - i_151_ << 8);
	method10809(class438);
	class438.method7074();
	if (bool_152_)
	    aString12212 = class534_sub40.method16523(-1409705149);
	else
	    aString12212 = null;
	if (bool_153_)
	    aString12213 = class534_sub40.method16523(-1377011130);
	else
	    aString12213 = null;
	aClass618_12216
	    = ((Class618)
	       Class448.method7319(Class618.method10239(2028976809),
				   class534_sub40.method16586((byte) 1),
				   2088438307));
	if (Class665.aClass665_8561 == client.aClass665_11211
	    && client.anInt11194 * 365872613 >= 2)
	    aClass618_12216 = Class618.aClass618_8099;
	method18864(class534_sub40, i_150_, -1964594635);
	aString12228 = class534_sub40.method16541((byte) -75);
	aString12211 = aString12228;
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 == this)
	    RuntimeException_Sub1.aString12085 = aString12228;
	anInt12210 = class534_sub40.method16527(-363986937) * 1539382797;
	if (bool) {
	    anInt12221 = class534_sub40.method16529((byte) 1) * -1240813047;
	    if (-825066439 * anInt12221 == 65535)
		anInt12221 = 1240813047;
	    anInt12219 = -1924340515 * anInt12210;
	    anInt12220 = -810466567;
	} else {
	    anInt12221 = 0;
	    anInt12219 = class534_sub40.method16527(-426438278) * 1230406969;
	    anInt12220 = class534_sub40.method16527(-616192947) * 810466567;
	    if (anInt12220 * 800727223 == 255)
		anInt12220 = -810466567;
	}
	int i_154_ = -785793877 * anInt12229;
	anInt12229 = class534_sub40.method16527(47154037) * -1280025085;
	if (0 != anInt12229 * -785793877) {
	    int i_155_ = -729876395 * anInt12230;
	    int i_156_ = -2046269725 * anInt12222;
	    int i_157_ = 1734964233 * anInt12227;
	    int i_158_ = anInt12231 * -510526957;
	    int i_159_ = anInt12215 * 18694435;
	    anInt12230 = class534_sub40.method16529((byte) 1) * 2018919677;
	    anInt12222 = class534_sub40.method16529((byte) 1) * 257035979;
	    anInt12227 = class534_sub40.method16529((byte) 1) * -1016440263;
	    anInt12231 = class534_sub40.method16529((byte) 1) * -1286676453;
	    anInt12215 = class534_sub40.method16527(-1612499686) * 616756875;
	    if (anInt12229 * -785793877 != i_154_
		|| anInt12230 * -729876395 != i_155_
		|| i_156_ != -2046269725 * anInt12222
		|| i_157_ != anInt12227 * 1734964233
		|| i_158_ != -510526957 * anInt12231
		|| i_159_ != 18694435 * anInt12215)
		Class612.method10107(this, 822059621);
	} else
	    Class576.method9763(this, -900297338);
    }
    
    public void method18884(Class534_Sub40 class534_sub40) {
	class534_sub40.anInt10811 = 0;
	int i = class534_sub40.method16527(891033647);
	for (int i_160_ = 0; i_160_ < anIntArray12233.length; i_160_++) {
	    if ((i & 1 << i_160_) != 0) {
		int i_161_ = class534_sub40.method16527(-2137107625);
		int i_162_ = class534_sub40.method16529((byte) 1);
		anIntArray12233[i_160_] = i_161_;
		anIntArray12217[i_160_] = i_162_;
	    } else {
		anIntArray12233[i_160_] = -1;
		anIntArray12217[i_160_] = -1;
	    }
	}
    }
    
    public void method18885(Class534_Sub40 class534_sub40) {
	class534_sub40.anInt10811 = 0;
	int i = class534_sub40.method16527(-329062588);
	for (int i_163_ = 0; i_163_ < anIntArray12233.length; i_163_++) {
	    if ((i & 1 << i_163_) != 0) {
		int i_164_ = class534_sub40.method16527(-2100112472);
		int i_165_ = class534_sub40.method16529((byte) 1);
		anIntArray12233[i_163_] = i_164_;
		anIntArray12217[i_163_] = i_165_;
	    } else {
		anIntArray12233[i_163_] = -1;
		anIntArray12217[i_163_] = -1;
	    }
	}
    }
    
    public void method18886(Class534_Sub40 class534_sub40, byte i) {
	aByte12214 = i;
	int i_166_ = -1;
	anInt12224 = 0;
	int[] is = new int[Class69.aClass630_728.anIntArray8196.length];
	Class17[] class17s
	    = new Class17[Class69.aClass630_728.anIntArray8196.length];
	Class15[] class15s
	    = new Class15[Class69.aClass630_728.anIntArray8196.length];
	for (int i_167_ = 0;
	     i_167_ < Class69.aClass630_728.anIntArray8196.length; i_167_++) {
	    if (1 != Class69.aClass630_728.anIntArray8196[i_167_]) {
		int i_168_ = class534_sub40.method16527(1176856997);
		if (i_168_ == 0)
		    is[i_167_] = 0;
		else {
		    int i_169_ = class534_sub40.method16527(2042688951);
		    int i_170_ = (i_168_ << 8) + i_169_;
		    if (i_167_ == 0 && 65535 == i_170_) {
			i_166_ = class534_sub40.method16550((byte) -8);
			anInt12224 = (class534_sub40.method16527(1251067536)
				      * -569974883);
			break;
		    }
		    if (i_170_ >= 16384) {
			i_170_ -= 16384;
			is[i_167_] = i_170_ | 0x40000000;
			class15s[i_167_]
			    = (Class15) Class531.aClass44_Sub7_7135
					    .method91(i_170_, -944484659);
			int i_171_ = -1277070211 * class15s[i_167_].anInt104;
			if (i_171_ != 0)
			    anInt12224 = -569974883 * i_171_;
		    } else
			is[i_167_] = i_170_ - 256 | ~0x7fffffff;
		}
	    }
	}
	if (-1 == i_166_) {
	    int i_172_ = class534_sub40.method16529((byte) 1);
	    int i_173_ = 0;
	    for (int i_174_ = 0;
		 i_174_ < Class69.aClass630_728.anIntArray8196.length;
		 i_174_++) {
		if (Class69.aClass630_728.anIntArray8196[i_174_] == 0) {
		    if (0 != (i_172_ & 1 << i_173_))
			class17s[i_174_]
			    = Class475.method7766(class15s[i_174_],
						  class534_sub40, -538364615);
		    i_173_++;
		}
	    }
	}
	int[] is_175_ = new int[10];
	for (int i_176_ = 0; i_176_ < 10; i_176_++) {
	    int i_177_ = class534_sub40.method16527(-928360944);
	    if (Class312.aShortArrayArrayArray3371.length < 1 || i_177_ < 0
		|| (i_177_
		    >= Class312.aShortArrayArrayArray3371[i_176_][0].length))
		i_177_ = 0;
	    is_175_[i_176_] = i_177_;
	}
	int[] is_178_ = new int[10];
	for (int i_179_ = 0; i_179_ < 10; i_179_++) {
	    int i_180_ = class534_sub40.method16527(-854846591);
	    if (Class473.aShortArrayArrayArray5173.length < 1 || i_180_ < 0
		|| (i_180_
		    >= Class473.aShortArrayArrayArray5173[i_179_][0].length))
		i_180_ = 0;
	    is_178_[i_179_] = i_180_;
	}
	anInt12225 = class534_sub40.method16529((byte) 1) * -522485945;
	if (null == aClass631_12226)
	    aClass631_12226 = new Class631();
	int i_181_ = aClass631_12226.anInt8212 * 1568742735;
	int[] is_182_ = aClass631_12226.anIntArray8208;
	aClass631_12226.method10435(method18529((byte) 127), is, class17s,
				    is_175_, is_178_, 1 == aByte12214, i_166_,
				    (short) 4690);
	if (i_181_ != i_166_) {
	    Class438 class438
		= Class438.method6994(method10807().aClass438_4885);
	    class438.aFloat4864 = (float) ((anIntArray11977[0] << 9)
					   + (method18545((byte) 1) << 8));
	    class438.aFloat4865 = (float) ((anIntArray11978[0] << 9)
					   + (method18545((byte) 1) << 8));
	    method10809(class438);
	    class438.method7074();
	}
	if (client.anInt11037 * -643758853 == anInt11922 * 1126388985
	    && null != is_182_) {
	    for (int i_183_ = 0; i_183_ < is_175_.length; i_183_++) {
		if (is_175_[i_183_] != is_182_[i_183_]) {
		    Class531.aClass44_Sub7_7135.method17316(-1366464976);
		    break;
		}
	    }
	}
	if (aClass629_11983 != null)
	    aClass629_11983.method10384();
	if (aClass711_Sub1_11965.method14338((byte) 0)
	    && aClass711_Sub1_11965.aBool10971) {
	    Class570 class570 = method18531((byte) -16);
	    if (!class570.method9613(aClass711_Sub1_11965
					 .method14329(867591708),
				     -622301414)) {
		aClass711_Sub1_11965.method14330(-1, 1328040561);
		aClass711_Sub1_11965.aBool10971 = false;
	    }
	}
    }
    
    boolean method18887(Class185 class185, int i) {
	int i_184_ = i;
	Class570 class570 = method18531((byte) 3);
	Class711 class711 = ((aClass711_11948.method14338((byte) 0)
			      && !aClass711_11948.method14336(1494173336))
			     ? aClass711_11948 : null);
	Class711_Sub1 class711_sub1
	    = ((aClass711_Sub1_11965.method14338((byte) 0) && !aBool12218
		&& (!aClass711_Sub1_11965.aBool10971 || class711 == null))
	       ? aClass711_Sub1_11965 : null);
	int i_185_ = class570.anInt7630 * 680391951;
	int i_186_ = 1366655921 * class570.anInt7645;
	if (i_185_ != 0 || i_186_ != 0 || 0 != class570.anInt7657 * 2079472619
	    || class570.anInt7660 * -97068925 != 0)
	    i |= 0x7;
	int i_187_ = aClass57_11973.method1231(1537504991);
	boolean bool
	    = (0 != aByte11964 && client.anInt11101 >= anInt11959 * 569195869
	       && client.anInt11101 < anInt11960 * -507783033);
	if (bool)
	    i |= 0x80000;
	Class183 class183
	    = (aClass183Array11986[0]
	       = (aClass631_12226.method10434
		  (class185, i, Class200_Sub23.aClass44_Sub14_10041,
		   Class307.aClass44_Sub15_3349, Class578.aClass44_Sub3_7743,
		   Class531.aClass44_Sub7_7135, Class78.aClass103_825,
		   Class78.aClass103_825, class711, class711_sub1,
		   aClass711_Sub3_Sub1Array11968, anIntArray11920, i_187_,
		   true, Class69.aClass630_728, -2146646183)));
	int i_188_ = Class536.method8904(881833381);
	if (Class498.anInt5589 * 721369631 < 96 && i_188_ > 50)
	    Class151.method2544((byte) 42);
	if (client.aClass665_11211 != Class665.aClass665_8561 && i_188_ < 50) {
	    int i_189_;
	    for (i_189_ = 50 - i_188_; i_189_ > client.anInt11046 * -65833181;
		 client.anInt11046 += -102403957)
		Class305.aByteArrayArray3272[-65833181 * client.anInt11046]
		    = new byte[102400];
	    while (i_189_ < -65833181 * client.anInt11046) {
		client.anInt11046 -= -102403957;
		Class305.aByteArrayArray3272[client.anInt11046 * -65833181]
		    = null;
	    }
	} else if (Class665.aClass665_8561 != client.aClass665_11211) {
	    Class305.aByteArrayArray3272 = new byte[50][];
	    client.anInt11046 = 0;
	}
	if (class183 == null)
	    return false;
	anInt11927 = class183.method3045() * -4362271;
	anInt11981 = class183.method3049() * 2001645007;
	class183.method3042();
	method18537(class183, -614023246);
	if (i_185_ != 0 || i_186_ != 0) {
	    method18539(i_187_, i_185_, i_186_,
			class570.anInt7654 * 1532427929,
			class570.anInt7643 * 26013715, (byte) 69);
	    if (anInt11950 * 1177236321 != 0)
		class183.method3017(1177236321 * anInt11950);
	    if (0 != anInt11933 * -1556313745)
		class183.method3018(anInt11933 * -1556313745);
	    if (956485751 * anInt11934 != 0)
		class183.method3098(0, 956485751 * anInt11934, 0);
	} else
	    method18539(i_187_, method18545((byte) 1) << 9,
			method18545((byte) 1) << 9, 0, 0, (byte) 125);
	if (bool)
	    class183.method3058(aByte11928, aByte11962, aByte11963,
				aByte11964 & 0xff);
	if (!aBool12218)
	    method18538(class185, class570, i_184_, i_185_, i_186_, i_187_,
			2088438307);
	return true;
    }
    
    boolean method18888(Class185 class185, int i) {
	int i_190_ = i;
	Class570 class570 = method18531((byte) -5);
	Class711 class711 = ((aClass711_11948.method14338((byte) 0)
			      && !aClass711_11948.method14336(1335937164))
			     ? aClass711_11948 : null);
	Class711_Sub1 class711_sub1
	    = ((aClass711_Sub1_11965.method14338((byte) 0) && !aBool12218
		&& (!aClass711_Sub1_11965.aBool10971 || class711 == null))
	       ? aClass711_Sub1_11965 : null);
	int i_191_ = class570.anInt7630 * 680391951;
	int i_192_ = 1366655921 * class570.anInt7645;
	if (i_191_ != 0 || i_192_ != 0 || 0 != class570.anInt7657 * 2079472619
	    || class570.anInt7660 * -97068925 != 0)
	    i |= 0x7;
	int i_193_ = aClass57_11973.method1231(425747391);
	boolean bool
	    = (0 != aByte11964 && client.anInt11101 >= anInt11959 * 569195869
	       && client.anInt11101 < anInt11960 * -507783033);
	if (bool)
	    i |= 0x80000;
	Class183 class183
	    = (aClass183Array11986[0]
	       = (aClass631_12226.method10434
		  (class185, i, Class200_Sub23.aClass44_Sub14_10041,
		   Class307.aClass44_Sub15_3349, Class578.aClass44_Sub3_7743,
		   Class531.aClass44_Sub7_7135, Class78.aClass103_825,
		   Class78.aClass103_825, class711, class711_sub1,
		   aClass711_Sub3_Sub1Array11968, anIntArray11920, i_193_,
		   true, Class69.aClass630_728, -2144892169)));
	int i_194_ = Class536.method8904(881833381);
	if (Class498.anInt5589 * 721369631 < 96 && i_194_ > 50)
	    Class151.method2544((byte) 89);
	if (client.aClass665_11211 != Class665.aClass665_8561 && i_194_ < 50) {
	    int i_195_;
	    for (i_195_ = 50 - i_194_; i_195_ > client.anInt11046 * -65833181;
		 client.anInt11046 += -102403957)
		Class305.aByteArrayArray3272[-65833181 * client.anInt11046]
		    = new byte[102400];
	    while (i_195_ < -65833181 * client.anInt11046) {
		client.anInt11046 -= -102403957;
		Class305.aByteArrayArray3272[client.anInt11046 * -65833181]
		    = null;
	    }
	} else if (Class665.aClass665_8561 != client.aClass665_11211) {
	    Class305.aByteArrayArray3272 = new byte[50][];
	    client.anInt11046 = 0;
	}
	if (class183 == null)
	    return false;
	anInt11927 = class183.method3045() * -4362271;
	anInt11981 = class183.method3049() * 2001645007;
	class183.method3042();
	method18537(class183, 448953693);
	if (i_191_ != 0 || i_192_ != 0) {
	    method18539(i_193_, i_191_, i_192_,
			class570.anInt7654 * 1532427929,
			class570.anInt7643 * 26013715, (byte) 116);
	    if (anInt11950 * 1177236321 != 0)
		class183.method3017(1177236321 * anInt11950);
	    if (0 != anInt11933 * -1556313745)
		class183.method3018(anInt11933 * -1556313745);
	    if (956485751 * anInt11934 != 0)
		class183.method3098(0, 956485751 * anInt11934, 0);
	} else
	    method18539(i_193_, method18545((byte) 1) << 9,
			method18545((byte) 1) << 9, 0, 0, (byte) 112);
	if (bool)
	    class183.method3058(aByte11928, aByte11962, aByte11963,
				aByte11964 & 0xff);
	if (!aBool12218)
	    method18538(class185, class570, i_190_, i_191_, i_192_, i_193_,
			2088438307);
	return true;
    }
    
    public String method18889(boolean bool) {
	String string = "";
	if (null != aString12212)
	    string = aString12212;
	if (bool)
	    string = new StringBuilder().append(string).append
			 (aString12228).toString();
	else
	    string = new StringBuilder().append(string).append
			 (aString12211).toString();
	if (null != aString12213)
	    string = new StringBuilder().append(string).append
			 (aString12213).toString();
	return string;
    }
    
    public Class526 method18544(int i) {
	if (null != aClass526_11935) {
	    if (null == aClass526_11935.aString7094)
		return null;
	    if (-700159681 * client.anInt11295 == 0
		|| -700159681 * client.anInt11295 == 3
		|| (-700159681 * client.anInt11295 == 1
		    && Class46.method1112(aString12211, (byte) 63)))
		return aClass526_11935;
	}
	return null;
    }
    
    public String method18890(boolean bool) {
	String string = "";
	if (null != aString12212)
	    string = aString12212;
	if (bool)
	    string = new StringBuilder().append(string).append
			 (aString12228).toString();
	else
	    string = new StringBuilder().append(string).append
			 (aString12211).toString();
	if (null != aString12213)
	    string = new StringBuilder().append(string).append
			 (aString12213).toString();
	return string;
    }
    
    final void method16845() {
	throw new IllegalStateException();
    }
    
    public Class654_Sub1_Sub5_Sub1_Sub2(Class556 class556, int i) {
	super(class556, i, Class562.aClass110_Sub1_Sub1_7560);
	anIntArray12233 = new int[8];
	anIntArray12217 = new int[8];
	anInt12210 = 0;
	anInt12219 = 0;
	anInt12220 = -810466567;
	anInt12221 = 0;
	anInt12223 = 1021477997;
	aBool12218 = false;
	anInt12224 = 0;
	anInt12230 = -2018919677;
	anInt12222 = -257035979;
	anInt12227 = 1016440263;
	anInt12231 = 1286676453;
	anInt12229 = 0;
	anInt12215 = -1640786827;
	aClass252_12232 = Class252.aClass252_2658;
	aClass618_12216 = Class618.aClass618_8099;
	aBool12234 = false;
	method18863(412240431);
    }
    
    public final void method18891(int i, int i_196_, byte i_197_) {
	if (aClass711_11948.method14338((byte) 0)
	    && (aClass711_11948.method14382(-875844730).anInt2218 * -492433165
		== 1)) {
	    anIntArray11946 = null;
	    aClass711_11948.method14330(-1, 1281974404);
	}
	for (int i_198_ = 0; i_198_ < aClass529Array11949.length; i_198_++) {
	    if (aClass529Array11949[i_198_].anInt7123 * -1183861629 != -1) {
		Class684 class684
		    = ((Class684)
		       Class55.aClass44_Sub4_447.method91(((aClass529Array11949
							    [i_198_].anInt7123)
							   * -1183861629),
							  -1101618970));
		if (class684.aBool8691 && class684.anInt8688 * -811043807 != -1
		    && (((Class205) (Class200_Sub12.aClass44_Sub1_9934.method91
				     (class684.anInt8688 * -811043807,
				      1552539423))).anInt2218 * -492433165
			== 1)) {
		    aClass529Array11949[i_198_].aClass711_7121
			.method14330(-1, 1670904892);
		    aClass529Array11949[i_198_].anInt7123 = -496843307;
		}
	    }
	}
	anInt12223 = 1021477997;
	if (i < 0 || i >= client.aClass512_11100.method8417(1911641043)
	    || i_196_ < 0
	    || i_196_ >= client.aClass512_11100.method8418(-1533611049))
	    method18871(i, i_196_, -1763071740);
	else if (anIntArray11977[0] < 0
		 || (anIntArray11977[0]
		     >= client.aClass512_11100.method8417(-178336263))
		 || anIntArray11978[0] < 0
		 || (anIntArray11978[0]
		     >= client.aClass512_11100.method8418(-1533611049)))
	    method18871(i, i_196_, -1621498899);
	else
	    method18867(i, i_196_, i_197_, -1362759734);
    }
    
    public final void method18892(int i, int i_199_, byte i_200_) {
	if (aClass711_11948.method14338((byte) 0)
	    && (aClass711_11948.method14382(-712233796).anInt2218 * -492433165
		== 1)) {
	    anIntArray11946 = null;
	    aClass711_11948.method14330(-1, 2100391745);
	}
	for (int i_201_ = 0; i_201_ < aClass529Array11949.length; i_201_++) {
	    if (aClass529Array11949[i_201_].anInt7123 * -1183861629 != -1) {
		Class684 class684
		    = ((Class684)
		       Class55.aClass44_Sub4_447.method91(((aClass529Array11949
							    [i_201_].anInt7123)
							   * -1183861629),
							  -308198497));
		if (class684.aBool8691 && class684.anInt8688 * -811043807 != -1
		    && ((Class205) (Class200_Sub12.aClass44_Sub1_9934.method91
				    (class684.anInt8688 * -811043807,
				     30120330))).anInt2218 * -492433165 == 1) {
		    aClass529Array11949[i_201_].aClass711_7121
			.method14330(-1, 1986475877);
		    aClass529Array11949[i_201_].anInt7123 = -496843307;
		}
	    }
	}
	anInt12223 = 1021477997;
	if (i < 0 || i >= client.aClass512_11100.method8417(-190186328)
	    || i_199_ < 0
	    || i_199_ >= client.aClass512_11100.method8418(-1533611049))
	    method18871(i, i_199_, -1972123340);
	else if (anIntArray11977[0] < 0
		 || (anIntArray11977[0]
		     >= client.aClass512_11100.method8417(-645555431))
		 || anIntArray11978[0] < 0
		 || (anIntArray11978[0]
		     >= client.aClass512_11100.method8418(-1533611049)))
	    method18871(i, i_199_, -1697218263);
	else
	    method18867(i, i_199_, i_200_, -1441642091);
    }
    
    public final void method18893(int i, int i_202_, byte i_203_) {
	if (aClass711_11948.method14338((byte) 0)
	    && (aClass711_11948.method14382(-1206546751).anInt2218 * -492433165
		== 1)) {
	    anIntArray11946 = null;
	    aClass711_11948.method14330(-1, 2027016148);
	}
	for (int i_204_ = 0; i_204_ < aClass529Array11949.length; i_204_++) {
	    if (aClass529Array11949[i_204_].anInt7123 * -1183861629 != -1) {
		Class684 class684
		    = ((Class684)
		       Class55.aClass44_Sub4_447.method91(((aClass529Array11949
							    [i_204_].anInt7123)
							   * -1183861629),
							  -883110261));
		if (class684.aBool8691 && class684.anInt8688 * -811043807 != -1
		    && (((Class205) (Class200_Sub12.aClass44_Sub1_9934.method91
				     (class684.anInt8688 * -811043807,
				      1270848285))).anInt2218 * -492433165
			== 1)) {
		    aClass529Array11949[i_204_].aClass711_7121
			.method14330(-1, 1090634893);
		    aClass529Array11949[i_204_].anInt7123 = -496843307;
		}
	    }
	}
	anInt12223 = 1021477997;
	if (i < 0 || i >= client.aClass512_11100.method8417(-117979018)
	    || i_202_ < 0
	    || i_202_ >= client.aClass512_11100.method8418(-1533611049))
	    method18871(i, i_202_, -1505883584);
	else if (anIntArray11977[0] < 0
		 || (anIntArray11977[0]
		     >= client.aClass512_11100.method8417(803271708))
		 || anIntArray11978[0] < 0
		 || (anIntArray11978[0]
		     >= client.aClass512_11100.method8418(-1533611049)))
	    method18871(i, i_202_, -1639715017);
	else
	    method18867(i, i_202_, i_203_, -865586653);
    }
    
    public void method18894(int i, int i_205_) {
	anInt11980 = 0;
	anInt11937 = 0;
	anInt11947 = 0;
	anIntArray11977[0] = i;
	anIntArray11978[0] = i_205_;
	int i_206_ = method18545((byte) 1);
	Class438 class438 = Class438.method6994(method10807().aClass438_4885);
	class438.aFloat4864
	    = (float) (256 * i_206_ + 512 * anIntArray11977[0]);
	class438.aFloat4865
	    = (float) (i_206_ * 256 + anIntArray11978[0] * 512);
	method10809(class438);
	class438.method7074();
	if (this == Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419)
	    client.aClass512_11100.method8501((byte) 82)
		.method10157(2021283569);
	if (aClass629_11983 != null)
	    aClass629_11983.method10384();
    }
    
    final void method16881() {
	throw new IllegalStateException();
    }
    
    final void method18895(int i, int i_207_, byte i_208_) {
	if (anInt11980 * -1763707177 < anIntArray11977.length - 1)
	    anInt11980 += 990207207;
	for (int i_209_ = anInt11980 * -1763707177; i_209_ > 0; i_209_--) {
	    anIntArray11977[i_209_] = anIntArray11977[i_209_ - 1];
	    anIntArray11978[i_209_] = anIntArray11978[i_209_ - 1];
	    aByteArray11979[i_209_] = aByteArray11979[i_209_ - 1];
	}
	anIntArray11977[0] = i;
	anIntArray11978[0] = i_207_;
	aByteArray11979[0] = i_208_;
    }
    
    public final boolean method18896() {
	if (aClass631_12226 == null)
	    return false;
	return true;
    }
    
    public final boolean method18897() {
	if (aClass631_12226 == null)
	    return false;
	return true;
    }
    
    public final boolean method18898() {
	if (aClass631_12226 == null)
	    return false;
	return true;
    }
    
    public int method18610() {
	if (null != aClass631_12226
	    && 1568742735 * aClass631_12226.anInt8212 != -1)
	    return (((Class307)
		     Class578.aClass44_Sub3_7743.method91((1568742735
							   * (aClass631_12226
							      .anInt8212)),
							  656944053)).anInt3328
		    * -1821838479);
	return super.method18545((byte) 1);
    }
    
    public int method18611() {
	if (null != aClass631_12226
	    && 1568742735 * aClass631_12226.anInt8212 != -1)
	    return ((((Class307)
		      Class578.aClass44_Sub3_7743.method91((1568742735
							    * (aClass631_12226
							       .anInt8212)),
							   1056530868))
		     .anInt3328)
		    * -1821838479);
	return super.method18545((byte) 1);
    }
    
    public void method18899(String string, int i, int i_210_) {
	method18563(string, i, i_210_,
		    (Class469.method7641((byte) -7)
		     * (Class620.aClass632_8113.anInt8247 * 2023048963)),
		    (short) 353);
    }
    
    public void method18900(String string, int i, int i_211_) {
	method18563(string, i, i_211_,
		    (Class469.method7641((byte) -7)
		     * (Class620.aClass632_8113.anInt8247 * 2023048963)),
		    (short) 353);
    }
    
    public void method18901(String string, int i, int i_212_) {
	method18563(string, i, i_212_,
		    (Class469.method7641((byte) -7)
		     * (Class620.aClass632_8113.anInt8247 * 2023048963)),
		    (short) 353);
    }
    
    public void method18902(String string, int i, int i_213_) {
	method18563(string, i, i_213_,
		    (Class469.method7641((byte) -7)
		     * (Class620.aClass632_8113.anInt8247 * 2023048963)),
		    (short) 353);
    }
    
    public void method18903(String string, int i, int i_214_) {
	method18563(string, i, i_214_,
		    (Class469.method7641((byte) -7)
		     * (Class620.aClass632_8113.anInt8247 * 2023048963)),
		    (short) 353);
    }
    
    public void method18904(String string, int i, int i_215_) {
	method18563(string, i, i_215_,
		    (Class469.method7641((byte) -7)
		     * (Class620.aClass632_8113.anInt8247 * 2023048963)),
		    (short) 353);
    }
}
