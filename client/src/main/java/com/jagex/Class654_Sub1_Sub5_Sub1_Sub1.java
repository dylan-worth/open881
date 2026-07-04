/* Class654_Sub1_Sub5_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;
import java.util.LinkedList;

public class Class654_Sub1_Sub5_Sub1_Sub1 extends Class654_Sub1_Sub5_Sub1
{
    public int anInt12192;
    public int anInt12193 = 433401485;
    public int anInt12194 = -140700719;
    public Class301 aClass301_12195;
    public static int anInt12196 = 1863082793;
    int[] anIntArray12197;
    int[] anIntArray12198;
    public Class295 aClass295_12199;
    public static int anInt12200 = 751626731;
    public String aString12201;
    int anInt12202;
    int anInt12203;
    public Class307 aClass307_12204;
    public int anInt12205 = 523484721;
    int anInt12206;
    int anInt12207;
    public int anInt12208;
    boolean aBool12209;
    
    public boolean method16886() {
	if (null != aClass307_12204.anIntArray3284
	    && (aClass307_12204.method5615(Class78.aClass103_825,
					   Class78.aClass103_825, -1466068515)
		== null))
	    return false;
	return true;
    }
    
    public Class654_Sub1_Sub5_Sub1_Sub1(Class556 class556, int i) {
	super(class556, i, Class535.aClass110_Sub1_Sub2_7162);
	anIntArray12198 = new int[6];
	anIntArray12197 = new int[6];
	method18826(1738672141);
    }
    
    public void method18825(int i) {
	anInt11953 = -1943600329;
	anInt11926 = -2084571495 * client.anInt11101;
    }
    
    void method18826(int i) {
	anInt12203 = (32 + (int) (Math.random() * 4.0)) * 1239966387;
	anInt12202 = (3 + (int) (Math.random() * 2.0)) * -1241642795;
	anInt12206 = (16 + (int) (Math.random() * 3.0)) * 1736248605;
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		.method17030((byte) 38)
	    == 1)
	    anInt12207 = (int) (Math.random() * 6.0) * -917439363;
	else
	    anInt12207 = (int) (Math.random() * 12.0) * -917439363;
    }
    
    public void method18827(Class307 class307, byte i) {
	method18828(class307, true, true, true, -1134100561);
    }
    
    public void method18828(Class307 class307, boolean bool, boolean bool_0_,
			    boolean bool_1_, int i) {
	if (class307 != aClass307_12204 && Class72.aBool758
	    && Class410.method6714(1126388985 * anInt11922, 1841000263))
	    Class44_Sub16.method17357((byte) 88);
	aClass307_12204 = class307;
	if (null != aClass307_12204) {
	    if (bool)
		aString12201 = aClass307_12204.aString3337;
	    if (bool_0_)
		anInt12192 = -423106977 * aClass307_12204.anInt3301;
	    if (bool_1_)
		aClass295_12199 = null;
	}
	if (aClass629_11983 != null)
	    aClass629_11983.method10384();
    }
    
    public Class564 method16855(Class185 class185, short i) {
	return null;
    }
    
    public void method18829(String string, int i, int i_2_) {
	int i_3_ = (Class469.method7641((byte) -7)
		    * (708187909 * Class620.aClass632_8113.anInt8245));
	method18563(string, i, i_2_, i_3_, (short) 353);
    }
    
    boolean method18830(Class185 class185, int i, byte i_4_) {
	int i_5_ = i;
	Class570 class570 = method18531((byte) -99);
	Class711 class711 = ((aClass711_11948.method14338((byte) 0)
			      && !aClass711_11948.method14336(1630854064))
			     ? aClass711_11948 : null);
	Class711_Sub1 class711_sub1
	    = ((aClass711_Sub1_11965.method14338((byte) 0)
		&& (!aClass711_Sub1_11965.aBool10971 || null == class711))
	       ? aClass711_Sub1_11965 : null);
	int i_6_ = class570.anInt7630 * 680391951;
	int i_7_ = class570.anInt7645 * 1366655921;
	if (i_6_ != 0 || i_7_ != 0 || 0 != class570.anInt7657 * 2079472619
	    || 0 != class570.anInt7660 * -97068925)
	    i |= 0x7;
	boolean bool
	    = (0 != aByte11964 && client.anInt11101 >= anInt11959 * 569195869
	       && client.anInt11101 < -507783033 * anInt11960);
	if (bool)
	    i |= 0x80000;
	boolean bool_8_ = false;
	if (0 != 555902073 * anInt11953) {
	    Class307 class307
		= (aClass307_12204.anIntArray3284 != null
		   ? aClass307_12204.method5615(Class78.aClass103_825,
						Class78.aClass103_825,
						-1466068515)
		   : aClass307_12204);
	    if (class307 == null
		|| client.anInt11101 >= (-2003184395 * class307.anInt3347
					 + -742785623 * anInt11926))
		anInt11953 = 0;
	    else {
		anInt11953
		    = ((255 - ((client.anInt11101 - anInt11926 * -742785623)
			       * 255 / (-2003184395 * class307.anInt3347)))
		       * 312395209);
		bool_8_ = true;
	    }
	}
	if (bool_8_)
	    i |= 0x100;
	int i_9_ = aClass57_11973.method1231(2043199810);
	Class183 class183
	    = (aClass183Array11986[0]
	       = (aClass307_12204.method5622
		  (class185, i, Class200_Sub23.aClass44_Sub14_10041,
		   Class78.aClass103_825, Class78.aClass103_825, class711,
		   class711_sub1, aClass711_Sub3_Sub1Array11968,
		   anIntArray11920, i_9_, aClass301_12195,
		   method18529((byte) 63), false, -909295235)));
	if (class183 == null)
	    return false;
	anInt11927 = class183.method3045() * -4362271;
	anInt11981 = class183.method3049() * 2001645007;
	class183.method3042();
	method18537(class183, -2038764413);
	if (i_6_ != 0 || 0 != i_7_) {
	    method18539(i_9_, i_6_, i_7_, 1532427929 * class570.anInt7654,
			class570.anInt7643 * 26013715, (byte) 36);
	    if (0 != 1177236321 * anInt11950)
		aClass183Array11986[0].method3017(1177236321 * anInt11950);
	    if (-1556313745 * anInt11933 != 0)
		aClass183Array11986[0].method3018(anInt11933 * -1556313745);
	    if (0 != anInt11934 * 956485751)
		aClass183Array11986[0].method3098(0, 956485751 * anInt11934,
						  0);
	} else
	    method18539(i_9_, method18545((byte) 1) << 9,
			method18545((byte) 1) << 9, 0, 0, (byte) 40);
	if (bool)
	    class183.method3058(aByte11928, aByte11962, aByte11963,
				aByte11964 & 0xff);
	if (bool_8_)
	    class183.method3088((byte) (anInt11953 * 555902073), null);
	method18538(class185, class570, i_5_, i_6_, i_7_, i_9_, 2088438307);
	return true;
    }
    
    void method16868(Class185 class185, int i) {
	if (null != aClass307_12204
	    && (aBool11984 || method18830(class185, 0, (byte) 8))) {
	    Class446 class446 = class185.method3665();
	    class446.method7236(method10834());
	    class446.method7287(0.0F, -5.0F, 0.0F);
	    method18528(class185, aClass183Array11986, class446, aBool11984,
			705200749);
	    for (int i_10_ = 0; i_10_ < aClass183Array11986.length; i_10_++)
		aClass183Array11986[i_10_] = null;
	}
    }
    
    public final void method18831(Class686 class686, int i, int i_11_) {
	int i_12_ = anIntArray11977[0];
	int i_13_ = anIntArray11978[0];
	switch (class686.anInt8707 * -1846013213) {
	case 5:
	    i_12_--;
	    break;
	case 1:
	    i_12_++;
	    i_13_++;
	    break;
	case 3:
	    i_13_--;
	    break;
	case 2:
	    i_12_++;
	    break;
	case 4:
	    i_12_--;
	    i_13_++;
	    break;
	case 6:
	    i_12_--;
	    i_13_--;
	    break;
	case 7:
	    i_13_++;
	    break;
	case 0:
	    i_12_++;
	    i_13_--;
	    break;
	}
	if (aClass711_11948.method14338((byte) 0)
	    && (aClass711_11948.method14382(-2112626081).anInt2218 * -492433165
		== 1)) {
	    anIntArray11946 = null;
	    aClass711_11948.method14330(-1, 1293340062);
	}
	for (int i_14_ = 0; i_14_ < aClass529Array11949.length; i_14_++) {
	    if (-1 != aClass529Array11949[i_14_].anInt7123 * -1183861629) {
		Class684 class684
		    = ((Class684)
		       Class55.aClass44_Sub4_447.method91(((aClass529Array11949
							    [i_14_].anInt7123)
							   * -1183861629),
							  1263593721));
		if (class684.aBool8691 && class684.anInt8688 * -811043807 != -1
		    && (((Class205) (Class200_Sub12.aClass44_Sub1_9934.method91
				     (class684.anInt8688 * -811043807,
				      -1239155847))).anInt2218 * -492433165
			== 1)) {
		    aClass529Array11949[i_14_].aClass711_7121
			.method14330(-1, 1993021713);
		    aClass529Array11949[i_14_].anInt7123 = -496843307;
		}
	    }
	}
	if (anInt11980 * -1763707177 < anIntArray11977.length - 1)
	    anInt11980 += 990207207;
	for (int i_15_ = -1763707177 * anInt11980; i_15_ > 0; i_15_--) {
	    anIntArray11977[i_15_] = anIntArray11977[i_15_ - 1];
	    anIntArray11978[i_15_] = anIntArray11978[i_15_ - 1];
	    aByteArray11979[i_15_] = aByteArray11979[i_15_ - 1];
	}
	anIntArray11977[0] = i_12_;
	anIntArray11978[0] = i_13_;
	aByteArray11979[0] = (byte) i;
    }
    
    public void method18832(int i, int i_16_, int i_17_, boolean bool,
			    int i_18_, int i_19_) {
	aByte10854 = aByte10853 = (byte) i;
	if (client.aClass512_11100.method8552((byte) 0)
		.method7612(i_16_, i_17_, (byte) 0))
	    aByte10853++;
	if (aClass711_11948.method14338((byte) 0)
	    && (aClass711_11948.method14382(-1835196564).anInt2218 * -492433165
		== 1)) {
	    anIntArray11946 = null;
	    aClass711_11948.method14330(-1, 1836395747);
	}
	for (int i_20_ = 0; i_20_ < aClass529Array11949.length; i_20_++) {
	    if (-1183861629 * aClass529Array11949[i_20_].anInt7123 != -1) {
		Class684 class684
		    = ((Class684)
		       (Class55.aClass44_Sub4_447.method91
			(-1183861629 * aClass529Array11949[i_20_].anInt7123,
			 836042558)));
		if (class684.aBool8691 && -1 != class684.anInt8688 * -811043807
		    && (((Class205) (Class200_Sub12.aClass44_Sub1_9934.method91
				     (-811043807 * class684.anInt8688,
				      896273882))).anInt2218 * -492433165
			== 1)) {
		    aClass529Array11949[i_20_].aClass711_7121
			.method14330(-1, 1100644580);
		    aClass529Array11949[i_20_].anInt7123 = -496843307;
		}
	    }
	}
	if (!bool) {
	    int i_21_ = i_16_ - anIntArray11977[0];
	    int i_22_ = i_17_ - anIntArray11978[0];
	    if (i_21_ >= -8 && i_21_ <= 8 && i_22_ >= -8 && i_22_ <= 8) {
		if (anInt11980 * -1763707177 < anIntArray11977.length - 1)
		    anInt11980 += 990207207;
		for (int i_23_ = anInt11980 * -1763707177; i_23_ > 0;
		     i_23_--) {
		    anIntArray11977[i_23_] = anIntArray11977[i_23_ - 1];
		    anIntArray11978[i_23_] = anIntArray11978[i_23_ - 1];
		    aByteArray11979[i_23_] = aByteArray11979[i_23_ - 1];
		}
		anIntArray11977[0] = i_16_;
		anIntArray11978[0] = i_17_;
		aByteArray11979[0] = Class676.aClass676_8649.aByte8648;
		return;
	    }
	}
	anInt11980 = 0;
	anInt11937 = 0;
	anInt11947 = 0;
	anIntArray11977[0] = i_16_;
	anIntArray11978[0] = i_17_;
	Class438 class438 = Class438.method6994(method10807().aClass438_4885);
	class438.aFloat4864
	    = (float) ((i_18_ << 8) + (anIntArray11977[0] << 9));
	class438.aFloat4865
	    = (float) ((anIntArray11978[0] << 9) + (i_18_ << 8));
	method10809(class438);
	class438.method7074();
	if (null != aClass629_11983)
	    aClass629_11983.method10384();
    }
    
    public int method190() {
	return anInt11922 * 1126388985;
    }
    
    int method18529(byte i) {
	if (-1 != 1265837359 * anInt12205)
	    return 1265837359 * anInt12205;
	if (aClass307_12204.anIntArray3284 != null) {
	    Class307 class307
		= aClass307_12204.method5615(Class78.aClass103_825,
					     Class78.aClass103_825,
					     -1466068515);
	    if (class307 != null && class307.anInt3310 * 1789154529 != -1)
		return class307.anInt3310 * 1789154529;
	}
	return aClass307_12204.anInt3310 * 1789154529;
    }
    
    public void method18833(Class307 class307, boolean bool, boolean bool_24_,
			    boolean bool_25_) {
	if (class307 != aClass307_12204 && Class72.aBool758
	    && Class410.method6714(1126388985 * anInt11922, -986337623))
	    Class44_Sub16.method17357((byte) 57);
	aClass307_12204 = class307;
	if (null != aClass307_12204) {
	    if (bool)
		aString12201 = aClass307_12204.aString3337;
	    if (bool_24_)
		anInt12192 = -423106977 * aClass307_12204.anInt3301;
	    if (bool_25_)
		aClass295_12199 = null;
	}
	if (aClass629_11983 != null)
	    aClass629_11983.method10384();
    }
    
    public boolean method18588() {
	return Class620.aClass632_8113.aBool8244;
    }
    
    boolean method18834(byte i) {
	return aBool12209 || aClass307_12204.aBool3313;
    }
    
    int method16847(int i) {
	if (null == aClass307_12204)
	    return 0;
	return aClass307_12204.anInt3345 * -1882113335;
    }
    
    public int method18560() {
	return anInt11922 * 1126388985 + 1;
    }
    
    final boolean method16848(byte i) {
	return false;
    }
    
    final void method16851(Class185 class185, Class654_Sub1 class654_sub1,
			   int i, int i_26_, int i_27_, boolean bool,
			   int i_28_) {
	throw new IllegalStateException();
    }
    
    final void method16852(int i) {
	throw new IllegalStateException();
    }
    
    public int method18835(int i, byte i_29_) {
	return anIntArray12198[i];
    }
    
    boolean method18836(Class185 class185, int i) {
	int i_30_ = i;
	Class570 class570 = method18531((byte) -127);
	Class711 class711 = ((aClass711_11948.method14338((byte) 0)
			      && !aClass711_11948.method14336(1580365343))
			     ? aClass711_11948 : null);
	Class711_Sub1 class711_sub1
	    = ((aClass711_Sub1_11965.method14338((byte) 0)
		&& (!aClass711_Sub1_11965.aBool10971 || null == class711))
	       ? aClass711_Sub1_11965 : null);
	int i_31_ = class570.anInt7630 * 680391951;
	int i_32_ = class570.anInt7645 * 1366655921;
	if (i_31_ != 0 || i_32_ != 0 || 0 != class570.anInt7657 * 2079472619
	    || 0 != class570.anInt7660 * -97068925)
	    i |= 0x7;
	boolean bool
	    = (0 != aByte11964 && client.anInt11101 >= anInt11959 * 569195869
	       && client.anInt11101 < -507783033 * anInt11960);
	if (bool)
	    i |= 0x80000;
	boolean bool_33_ = false;
	if (0 != 555902073 * anInt11953) {
	    Class307 class307
		= (aClass307_12204.anIntArray3284 != null
		   ? aClass307_12204.method5615(Class78.aClass103_825,
						Class78.aClass103_825,
						-1466068515)
		   : aClass307_12204);
	    if (class307 == null
		|| client.anInt11101 >= (-2003184395 * class307.anInt3347
					 + -742785623 * anInt11926))
		anInt11953 = 0;
	    else {
		anInt11953
		    = ((255 - ((client.anInt11101 - anInt11926 * -742785623)
			       * 255 / (-2003184395 * class307.anInt3347)))
		       * 312395209);
		bool_33_ = true;
	    }
	}
	if (bool_33_)
	    i |= 0x100;
	int i_34_ = aClass57_11973.method1231(614275948);
	Class183 class183
	    = (aClass183Array11986[0]
	       = (aClass307_12204.method5622
		  (class185, i, Class200_Sub23.aClass44_Sub14_10041,
		   Class78.aClass103_825, Class78.aClass103_825, class711,
		   class711_sub1, aClass711_Sub3_Sub1Array11968,
		   anIntArray11920, i_34_, aClass301_12195,
		   method18529((byte) 95), false, -909295235)));
	if (class183 == null)
	    return false;
	anInt11927 = class183.method3045() * -4362271;
	anInt11981 = class183.method3049() * 2001645007;
	class183.method3042();
	method18537(class183, 236512507);
	if (i_31_ != 0 || 0 != i_32_) {
	    method18539(i_34_, i_31_, i_32_, 1532427929 * class570.anInt7654,
			class570.anInt7643 * 26013715, (byte) 99);
	    if (0 != 1177236321 * anInt11950)
		aClass183Array11986[0].method3017(1177236321 * anInt11950);
	    if (-1556313745 * anInt11933 != 0)
		aClass183Array11986[0].method3018(anInt11933 * -1556313745);
	    if (0 != anInt11934 * 956485751)
		aClass183Array11986[0].method3098(0, 956485751 * anInt11934,
						  0);
	} else
	    method18539(i_34_, method18545((byte) 1) << 9,
			method18545((byte) 1) << 9, 0, 0, (byte) 65);
	if (bool)
	    class183.method3058(aByte11928, aByte11962, aByte11963,
				aByte11964 & 0xff);
	if (bool_33_)
	    class183.method3088((byte) (anInt11953 * 555902073), null);
	method18538(class185, class570, i_30_, i_31_, i_32_, i_34_,
		    2088438307);
	return true;
    }
    
    final void method16845() {
	throw new IllegalStateException();
    }
    
    public boolean method18543(int i) {
	return Class620.aClass632_8113.aBool8244;
    }
    
    public Class526 method18544(int i) {
	if (aClass526_11935 != null && null == aClass526_11935.aString7094)
	    return null;
	return aClass526_11935;
    }
    
    public int method18837(int i, byte i_35_) {
	return anIntArray12197[i];
    }
    
    public int method18549(byte i) {
	return anInt11922 * 1126388985 + 1;
    }
    
    int method18581() {
	if (-1 != 1265837359 * anInt12205)
	    return 1265837359 * anInt12205;
	if (aClass307_12204.anIntArray3284 != null) {
	    Class307 class307
		= aClass307_12204.method5615(Class78.aClass103_825,
					     Class78.aClass103_825,
					     -1466068515);
	    if (class307 != null && class307.anInt3310 * 1789154529 != -1)
		return class307.anInt3310 * 1789154529;
	}
	return aClass307_12204.anInt3310 * 1789154529;
    }
    
    public int method90(byte i) {
	return anInt11922 * 1126388985;
    }
    
    Class550 method16884(Class185 class185) {
	if (aClass307_12204 == null
	    || !method18830(class185, 526336, (byte) 8))
	    return null;
	Class446 class446 = method10834();
	Class444 class444 = method10807();
	Class446 class446_36_ = class185.method3665();
	int i = aClass57_11973.method1231(1939845593);
	Class568 class568
	    = (aClass556_10855.aClass568ArrayArrayArray7431[aByte10854]
	       [(int) class444.aClass438_4885.aFloat4864 >> 9]
	       [(int) class444.aClass438_4885.aFloat4865 >> 9]);
	if (class568 != null && null != class568.aClass654_Sub1_Sub2_7607) {
	    int i_37_ = (-996512449 * anInt11930
			 - class568.aClass654_Sub1_Sub2_7607.aShort11864);
	    anInt11930 = (int) ((float) (-996512449 * anInt11930)
				- (float) i_37_ / 10.0F) * -1299053889;
	} else
	    anInt11930 = ((int) ((float) (anInt11930 * -996512449)
				 - (float) (anInt11930 * -996512449) / 10.0F)
			  * -1299053889);
	class446_36_.method7236(class446);
	class446_36_.method7287(0.0F, (float) (-20 - -996512449 * anInt11930),
				0.0F);
	Class570 class570 = method18531((byte) -126);
	Class307 class307
	    = (aClass307_12204.anIntArray3284 != null
	       ? aClass307_12204.method5615(Class78.aClass103_825,
					    Class78.aClass103_825, -1466068515)
	       : aClass307_12204);
	boolean bool = class307.aClass432_3342 != null;
	aBool11961 = false;
	Class550 class550 = null;
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub1_10762
		.method16828(62926167) == 1
	    && class307.aBool3281 && class570.aBool7639) {
	    Class711 class711 = ((aClass711_11948.method14338((byte) 0)
				  && aClass711_11948.method14336(2128032354))
				 ? aClass711_11948 : null);
	    Class711_Sub1 class711_sub1
		= ((aClass711_Sub1_11965.method14338((byte) 0)
		    && (!aClass711_Sub1_11965.aBool10971 || class711 == null))
		   ? aClass711_Sub1_11965 : null);
	    short i_38_ = Class620.aClass632_8113.aShort8237;
	    byte i_39_ = Class620.aClass632_8113.aByte8238;
	    if (aClass307_12204.aShort3323 > -1) {
		i_38_ = aClass307_12204.aShort3323;
		i_39_ = aClass307_12204.aByte3324;
	    }
	    Class183 class183;
	    if (i_38_ > -1
		&& Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		       .method17030((byte) -39) == 1)
		class183
		    = Class690_Sub35.method17182(class185, i,
						 1177236321 * anInt11950,
						 -1556313745 * anInt11933,
						 anInt11934 * 956485751,
						 aClass183Array11986[0], i_38_,
						 i_39_,
						 (class711_sub1 != null
						  ? (Class711) class711_sub1
						  : class711),
						 (byte) 64);
	    else
		class183 = (Class200_Sub3.method15570
			    (class185, i, 1177236321 * anInt11950,
			     -1556313745 * anInt11933, 956485751 * anInt11934,
			     aClass307_12204.anInt3328 * -1821838479,
			     aClass183Array11986[0],
			     aClass307_12204.aShort3319 & 0xffff,
			     aClass307_12204.aShort3306 & 0xffff,
			     aClass307_12204.aByte3315 & 0xff,
			     aClass307_12204.aByte3322 & 0xff,
			     (class711_sub1 != null ? (Class711) class711_sub1
			      : class711),
			     -1420479419));
	    if (null != class183) {
		class550
		    = Class322.method5779(method18834((byte) -124), 851062672);
		aBool11961 = true;
		class185.method3461(false);
		if (bool)
		    class183.method3034(class446_36_, null, 0);
		else {
		    if (null == aClass194Array10852
			|| (aClass194Array10852.length
			    < 1 + aClass183Array11986.length))
			method16862(1 + aClass183Array11986.length,
				    -1953765654);
		    class183.method3034(class446_36_,
					(aClass194Array10852
					 [aClass183Array11986.length]),
					0);
		}
		class185.method3461(true);
	    }
	}
	if (bool) {
	    if (aClass194Array10852 == null || aClass194Array10852.length > 1)
		method16862(1, -1450817953);
	    class185.method3311(class446_36_, aClass194Array10852[0],
				class307.aClass432_3342);
	} else if (aClass194Array10852 == null
		   || aClass194Array10852.length < aClass183Array11986.length)
	    method16862(aClass183Array11986.length, -833394667);
	if (null == class550)
	    class550
		= Class322.method5779(method18834((byte) -109), 450035061);
	method18528(class185, aClass183Array11986, class446_36_, false,
		    -1074523711);
	for (int i_40_ = 0; i_40_ < aClass183Array11986.length; i_40_++) {
	    if (aClass183Array11986[i_40_] != null) {
		if (aClass307_12204.aBool3346)
		    aClass183Array11986[i_40_].method3058
			(anInt12203 * 1438588027, anInt12202 * -2030636931,
			 anInt12206 * -920642251, -885695275 * anInt12207);
		if (bool)
		    aClass183Array11986[i_40_].method3034(class446_36_, null,
							  0);
		else
		    aClass183Array11986[i_40_].method3034(class446_36_,
							  (aClass194Array10852
							   [i_40_]),
							  0);
	    } else if (!bool)
		aClass194Array10852[i_40_].aBool2150 = false;
	}
	if (null != aClass629_11983) {
	    Class174 class174 = aClass629_11983.method10405();
	    class185.method3334(class174);
	}
	for (int i_41_ = 0; i_41_ < aClass183Array11986.length; i_41_++) {
	    if (null != aClass183Array11986[i_41_])
		aBool11961 |= aClass183Array11986[i_41_].method3027();
	    aClass183Array11986[i_41_] = null;
	}
	anInt11940 = client.anInt11161 * 842490719;
	return class550;
    }
    
    public Class296 method184(int i) {
	return Class296.aClass296_3164;
    }
    
    public Class438 method186(int i) {
	return Class438.method7061();
    }
    
    public boolean method16859(int i) {
	if (null != aClass307_12204.anIntArray3284
	    && (aClass307_12204.method5615(Class78.aClass103_825,
					   Class78.aClass103_825, -1466068515)
		== null))
	    return false;
	return true;
    }
    
    public Class296 method185() {
	return Class296.aClass296_3164;
    }
    
    public Class296 method187() {
	return Class296.aClass296_3164;
    }
    
    public int method18838(int i) {
	return anIntArray12198[i];
    }
    
    public Class296 method192() {
	return Class296.aClass296_3164;
    }
    
    public Class534_Sub36 method195() {
	Class597 class597 = client.aClass512_11100.method8416((byte) 93);
	return (Class534_Sub33.method16405
		(aByte10854,
		 ((int) method10807().aClass438_4885.aFloat4864
		  + class597.anInt7859 * 1852947968),
		 -(int) method10807().aClass438_4885.aFloat4863,
		 ((int) method10807().aClass438_4885.aFloat4865
		  + class597.anInt7861 * -139729408),
		 1104938557));
    }
    
    public int method181() {
	return anInt11922 * 1126388985;
    }
    
    public boolean method18585() {
	return Class620.aClass632_8113.aBool8244;
    }
    
    public Class534_Sub36 method191() {
	Class597 class597 = client.aClass512_11100.method8416((byte) 82);
	return (Class534_Sub33.method16405
		(aByte10854,
		 ((int) method10807().aClass438_4885.aFloat4864
		  + class597.anInt7859 * 1852947968),
		 -(int) method10807().aClass438_4885.aFloat4863,
		 ((int) method10807().aClass438_4885.aFloat4865
		  + class597.anInt7861 * -139729408),
		 1104938557));
    }
    
    void method16871(Class185 class185) {
	if (null != aClass307_12204
	    && (aBool11984 || method18830(class185, 0, (byte) 8))) {
	    Class446 class446 = class185.method3665();
	    class446.method7236(method10834());
	    class446.method7287(0.0F, -5.0F, 0.0F);
	    method18528(class185, aClass183Array11986, class446, aBool11984,
			-63339546);
	    for (int i = 0; i < aClass183Array11986.length; i++)
		aClass183Array11986[i] = null;
	}
    }
    
    public Class534_Sub36 method193() {
	Class597 class597 = client.aClass512_11100.method8416((byte) 38);
	return (Class534_Sub33.method16405
		(aByte10854,
		 ((int) method10807().aClass438_4885.aFloat4864
		  + class597.anInt7859 * 1852947968),
		 -(int) method10807().aClass438_4885.aFloat4863,
		 ((int) method10807().aClass438_4885.aFloat4865
		  + class597.anInt7861 * -139729408),
		 1104938557));
    }
    
    boolean method16846(Class185 class185, int i, int i_42_, byte i_43_) {
	if (null == aClass307_12204)
	    return false;
	if (null != aClass307_12204.aClass432_3342)
	    return class185.method3309(i, i_42_, method10834(),
				       aClass307_12204.aClass432_3342,
				       1554530302);
	if (!method18830(class185, 131072, (byte) 8))
	    return false;
	Class446 class446 = method10834();
	boolean bool = false;
	for (int i_44_ = 0; i_44_ < aClass183Array11986.length; i_44_++) {
	    if (aClass183Array11986[i_44_] != null
		&& aClass183Array11986[i_44_].aBool1971) {
		boolean bool_45_;
	    while_12_:
		do {
		    do {
			if (-1882113335 * aClass307_12204.anInt3345 <= 0) {
			    if (-1 == 1972007119 * aClass307_12204.anInt3341) {
				if (1
				    != aClass307_12204.anInt3328 * -1821838479)
				    break;
			    } else if (1972007119 * aClass307_12204.anInt3341
				       != 1)
				break;
			}
			bool_45_ = true;
			break while_12_;
		    } while (false);
		    bool_45_ = false;
		} while (false);
		boolean bool_46_ = bool_45_;
		boolean bool_47_
		    = aClass183Array11986[i_44_].method3039(i, i_42_, class446,
							    bool_46_,
							    (-1882113335
							     * (aClass307_12204
								.anInt3345)));
		if (bool_47_) {
		    bool = true;
		    break;
		}
	    }
	}
	for (int i_48_ = 0; i_48_ < aClass183Array11986.length; i_48_++)
	    aClass183Array11986[i_48_] = null;
	return bool;
    }
    
    public Class443 method197() {
	Class443 class443 = Class443.method7137();
	class443.method7148(Class427.method6799(949937137
						* aClass57_11973.anInt457),
			    0.0F, 0.0F);
	return class443;
    }
    
    public Class443 method196() {
	Class443 class443 = Class443.method7137();
	class443.method7148(Class427.method6799(949937137
						* aClass57_11973.anInt457),
			    0.0F, 0.0F);
	return class443;
    }
    
    public Class443 method189() {
	Class443 class443 = Class443.method7137();
	class443.method7148(Class427.method6799(949937137
						* aClass57_11973.anInt457),
			    0.0F, 0.0F);
	return class443;
    }
    
    public Class438 method198() {
	return Class438.method7061();
    }
    
    public Class564 method16872(Class185 class185) {
	return null;
    }
    
    public void method18839(int i, int i_49_, int i_50_) {
	anIntArray12198[i] = i_49_;
	anIntArray12197[i] = i_50_;
    }
    
    public final boolean method18840(int i) {
	if (aClass307_12204 == null)
	    return false;
	return true;
    }
    
    boolean method16880(Class185 class185, int i, int i_51_) {
	if (null == aClass307_12204)
	    return false;
	if (null != aClass307_12204.aClass432_3342)
	    return class185.method3309(i, i_51_, method10834(),
				       aClass307_12204.aClass432_3342,
				       1554530302);
	if (!method18830(class185, 131072, (byte) 8))
	    return false;
	Class446 class446 = method10834();
	boolean bool = false;
	for (int i_52_ = 0; i_52_ < aClass183Array11986.length; i_52_++) {
	    if (aClass183Array11986[i_52_] != null
		&& aClass183Array11986[i_52_].aBool1971) {
		boolean bool_53_;
	    while_13_:
		do {
		    do {
			if (-1882113335 * aClass307_12204.anInt3345 <= 0) {
			    if (-1 == 1972007119 * aClass307_12204.anInt3341) {
				if (1
				    != aClass307_12204.anInt3328 * -1821838479)
				    break;
			    } else if (1972007119 * aClass307_12204.anInt3341
				       != 1)
				break;
			}
			bool_53_ = true;
			break while_13_;
		    } while (false);
		    bool_53_ = false;
		} while (false);
		boolean bool_54_ = bool_53_;
		boolean bool_55_
		    = aClass183Array11986[i_52_].method3039(i, i_51_, class446,
							    bool_54_,
							    (-1882113335
							     * (aClass307_12204
								.anInt3345)));
		if (bool_55_) {
		    bool = true;
		    break;
		}
	    }
	}
	for (int i_56_ = 0; i_56_ < aClass183Array11986.length; i_56_++)
	    aClass183Array11986[i_56_] = null;
	return bool;
    }
    
    boolean method16873(Class185 class185, int i, int i_57_) {
	if (null == aClass307_12204)
	    return false;
	if (null != aClass307_12204.aClass432_3342)
	    return class185.method3309(i, i_57_, method10834(),
				       aClass307_12204.aClass432_3342,
				       1554530302);
	if (!method18830(class185, 131072, (byte) 8))
	    return false;
	Class446 class446 = method10834();
	boolean bool = false;
	for (int i_58_ = 0; i_58_ < aClass183Array11986.length; i_58_++) {
	    if (aClass183Array11986[i_58_] != null
		&& aClass183Array11986[i_58_].aBool1971) {
		boolean bool_59_;
	    while_14_:
		do {
		    do {
			if (-1882113335 * aClass307_12204.anInt3345 <= 0) {
			    if (-1 == 1972007119 * aClass307_12204.anInt3341) {
				if (1
				    != aClass307_12204.anInt3328 * -1821838479)
				    break;
			    } else if (1972007119 * aClass307_12204.anInt3341
				       != 1)
				break;
			}
			bool_59_ = true;
			break while_14_;
		    } while (false);
		    bool_59_ = false;
		} while (false);
		boolean bool_60_ = bool_59_;
		boolean bool_61_
		    = aClass183Array11986[i_58_].method3039(i, i_57_, class446,
							    bool_60_,
							    (-1882113335
							     * (aClass307_12204
								.anInt3345)));
		if (bool_61_) {
		    bool = true;
		    break;
		}
	    }
	}
	for (int i_62_ = 0; i_62_ < aClass183Array11986.length; i_62_++)
	    aClass183Array11986[i_62_] = null;
	return bool;
    }
    
    boolean method16874(Class185 class185, int i, int i_63_) {
	if (null == aClass307_12204)
	    return false;
	if (null != aClass307_12204.aClass432_3342)
	    return class185.method3309(i, i_63_, method10834(),
				       aClass307_12204.aClass432_3342,
				       1554530302);
	if (!method18830(class185, 131072, (byte) 8))
	    return false;
	Class446 class446 = method10834();
	boolean bool = false;
	for (int i_64_ = 0; i_64_ < aClass183Array11986.length; i_64_++) {
	    if (aClass183Array11986[i_64_] != null
		&& aClass183Array11986[i_64_].aBool1971) {
		boolean bool_65_;
	    while_15_:
		do {
		    do {
			if (-1882113335 * aClass307_12204.anInt3345 <= 0) {
			    if (-1 == 1972007119 * aClass307_12204.anInt3341) {
				if (1
				    != aClass307_12204.anInt3328 * -1821838479)
				    break;
			    } else if (1972007119 * aClass307_12204.anInt3341
				       != 1)
				break;
			}
			bool_65_ = true;
			break while_15_;
		    } while (false);
		    bool_65_ = false;
		} while (false);
		boolean bool_66_ = bool_65_;
		boolean bool_67_
		    = aClass183Array11986[i_64_].method3039(i, i_63_, class446,
							    bool_66_,
							    (-1882113335
							     * (aClass307_12204
								.anInt3345)));
		if (bool_67_) {
		    bool = true;
		    break;
		}
	    }
	}
	for (int i_68_ = 0; i_68_ < aClass183Array11986.length; i_68_++)
	    aClass183Array11986[i_68_] = null;
	return bool;
    }
    
    boolean method16882(Class185 class185, int i, int i_69_) {
	if (null == aClass307_12204)
	    return false;
	if (null != aClass307_12204.aClass432_3342)
	    return class185.method3309(i, i_69_, method10834(),
				       aClass307_12204.aClass432_3342,
				       1554530302);
	if (!method18830(class185, 131072, (byte) 8))
	    return false;
	Class446 class446 = method10834();
	boolean bool = false;
	for (int i_70_ = 0; i_70_ < aClass183Array11986.length; i_70_++) {
	    if (aClass183Array11986[i_70_] != null
		&& aClass183Array11986[i_70_].aBool1971) {
		boolean bool_71_;
	    while_16_:
		do {
		    do {
			if (-1882113335 * aClass307_12204.anInt3345 <= 0) {
			    if (-1 == 1972007119 * aClass307_12204.anInt3341) {
				if (1
				    != aClass307_12204.anInt3328 * -1821838479)
				    break;
			    } else if (1972007119 * aClass307_12204.anInt3341
				       != 1)
				break;
			}
			bool_71_ = true;
			break while_16_;
		    } while (false);
		    bool_71_ = false;
		} while (false);
		boolean bool_72_ = bool_71_;
		boolean bool_73_
		    = aClass183Array11986[i_70_].method3039(i, i_69_, class446,
							    bool_72_,
							    (-1882113335
							     * (aClass307_12204
								.anInt3345)));
		if (bool_73_) {
		    bool = true;
		    break;
		}
	    }
	}
	for (int i_74_ = 0; i_74_ < aClass183Array11986.length; i_74_++)
	    aClass183Array11986[i_74_] = null;
	return bool;
    }
    
    final boolean method16861() {
	return false;
    }
    
    final void method16877(Class185 class185, Class654_Sub1 class654_sub1,
			   int i, int i_75_, int i_76_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method16883(Class185 class185, Class654_Sub1 class654_sub1,
			   int i, int i_77_, int i_78_, boolean bool) {
	throw new IllegalStateException();
    }
    
    public final boolean method18841() {
	if (aClass307_12204 == null)
	    return false;
	return true;
    }
    
    public void method18842() {
	anInt11953 = -1943600329;
	anInt11926 = -2084571495 * client.anInt11101;
    }
    
    final void method16881() {
	throw new IllegalStateException();
    }
    
    public int method16854() {
	if (null != aClass307_12204.anIntArray3284) {
	    Class307 class307
		= aClass307_12204.method5615(Class78.aClass103_825,
					     Class78.aClass103_825,
					     -1466068515);
	    if (class307 != null && 312424701 * class307.anInt3316 != -1)
		return class307.anInt3316 * 312424701;
	}
	return (-1 != 312424701 * aClass307_12204.anInt3316
		? aClass307_12204.anInt3316 * 312424701
		: super.method16897(-1527522767));
    }
    
    public int method16875() {
	if (null != aClass307_12204.anIntArray3284) {
	    Class307 class307
		= aClass307_12204.method5615(Class78.aClass103_825,
					     Class78.aClass103_825,
					     -1466068515);
	    if (class307 != null && 312424701 * class307.anInt3316 != -1)
		return class307.anInt3316 * 312424701;
	}
	return (-1 != 312424701 * aClass307_12204.anInt3316
		? aClass307_12204.anInt3316 * 312424701
		: super.method16897(-1527522767));
    }
    
    final void method16865() {
	throw new IllegalStateException();
    }
    
    int method18551() {
	if (-1 != 1265837359 * anInt12205)
	    return 1265837359 * anInt12205;
	if (aClass307_12204.anIntArray3284 != null) {
	    Class307 class307
		= aClass307_12204.method5615(Class78.aClass103_825,
					     Class78.aClass103_825,
					     -1466068515);
	    if (class307 != null && class307.anInt3310 * 1789154529 != -1)
		return class307.anInt3310 * 1789154529;
	}
	return aClass307_12204.anInt3310 * 1789154529;
    }
    
    public Class526 method18598() {
	if (aClass526_11935 != null && null == aClass526_11935.aString7094)
	    return null;
	return aClass526_11935;
    }
    
    public int method18573() {
	if (null != aClass307_12204.anIntArray3284) {
	    Class307 class307
		= aClass307_12204.method5615(Class78.aClass103_825,
					     Class78.aClass103_825,
					     -1466068515);
	    if (class307 != null && -1 != class307.anInt3320 * 194352473)
		return 194352473 * class307.anInt3320;
	}
	return aClass307_12204.anInt3320 * 194352473;
    }
    
    public Class296 method188() {
	return Class296.aClass296_3164;
    }
    
    public boolean method18586() {
	return Class620.aClass632_8113.aBool8244;
    }
    
    public boolean method18587() {
	return Class620.aClass632_8113.aBool8244;
    }
    
    public Class526 method18541() {
	if (aClass526_11935 != null && null == aClass526_11935.aString7094)
	    return null;
	return aClass526_11935;
    }
    
    public int method16897(int i) {
	if (null != aClass307_12204.anIntArray3284) {
	    Class307 class307
		= aClass307_12204.method5615(Class78.aClass103_825,
					     Class78.aClass103_825,
					     -1466068515);
	    if (class307 != null && 312424701 * class307.anInt3316 != -1)
		return class307.anInt3316 * 312424701;
	}
	return (-1 != 312424701 * aClass307_12204.anInt3316
		? aClass307_12204.anInt3316 * 312424701
		: super.method16897(-1527522767));
    }
    
    public void method18843(Class307 class307) {
	method18828(class307, true, true, true, 331969153);
    }
    
    public Class526 method18590() {
	if (aClass526_11935 != null && null == aClass526_11935.aString7094)
	    return null;
	return aClass526_11935;
    }
    
    public int method18602() {
	return anInt11922 * 1126388985 + 1;
    }
    
    public boolean method16887() {
	if (null != aClass307_12204.anIntArray3284
	    && (aClass307_12204.method5615(Class78.aClass103_825,
					   Class78.aClass103_825, -1466068515)
		== null))
	    return false;
	return true;
    }
    
    public int method18604() {
	return anInt11922 * 1126388985 + 1;
    }
    
    public int method18605() {
	return anInt11922 * 1126388985 + 1;
    }
    
    public Class443 method183(int i) {
	Class443 class443 = Class443.method7137();
	class443.method7148(Class427.method6799(949937137
						* aClass57_11973.anInt457),
			    0.0F, 0.0F);
	return class443;
    }
    
    public Class654_Sub1_Sub5_Sub1_Sub1(Class556 class556) {
	super(class556, Class535.aClass110_Sub1_Sub2_7162);
	anIntArray12198 = new int[6];
	anIntArray12197 = new int[6];
	method18826(1040970898);
    }
    
    public void method18844() {
	anInt11953 = -1943600329;
	anInt11926 = -2084571495 * client.anInt11101;
    }
    
    int method18579() {
	if (-1 != 1265837359 * anInt12205)
	    return 1265837359 * anInt12205;
	if (aClass307_12204.anIntArray3284 != null) {
	    Class307 class307
		= aClass307_12204.method5615(Class78.aClass103_825,
					     Class78.aClass103_825,
					     -1466068515);
	    if (class307 != null && class307.anInt3310 * 1789154529 != -1)
		return class307.anInt3310 * 1789154529;
	}
	return aClass307_12204.anInt3310 * 1789154529;
    }
    
    public void method18845() {
	anInt11953 = -1943600329;
	anInt11926 = -2084571495 * client.anInt11101;
    }
    
    public void method18846(int i, int i_79_, int i_80_, int i_81_) {
	anIntArray12198[i] = i_79_;
	anIntArray12197[i] = i_80_;
    }
    
    boolean method18847() {
	return aBool12209 || aClass307_12204.aBool3313;
    }
    
    public void method18848(Class307 class307, boolean bool, boolean bool_82_,
			    boolean bool_83_) {
	if (class307 != aClass307_12204 && Class72.aBool758
	    && Class410.method6714(1126388985 * anInt11922, -50326853))
	    Class44_Sub16.method17357((byte) 17);
	aClass307_12204 = class307;
	if (null != aClass307_12204) {
	    if (bool)
		aString12201 = aClass307_12204.aString3337;
	    if (bool_82_)
		anInt12192 = -423106977 * aClass307_12204.anInt3301;
	    if (bool_83_)
		aClass295_12199 = null;
	}
	if (aClass629_11983 != null)
	    aClass629_11983.method10384();
    }
    
    public void method18849(String string, int i, int i_84_, int i_85_) {
	int i_86_ = (Class469.method7641((byte) -7)
		     * (708187909 * Class620.aClass632_8113.anInt8245));
	method18563(string, i, i_84_, i_86_, (short) 353);
    }
    
    boolean method18850(Class185 class185, int i) {
	int i_87_ = i;
	Class570 class570 = method18531((byte) -65);
	Class711 class711 = ((aClass711_11948.method14338((byte) 0)
			      && !aClass711_11948.method14336(1832872507))
			     ? aClass711_11948 : null);
	Class711_Sub1 class711_sub1
	    = ((aClass711_Sub1_11965.method14338((byte) 0)
		&& (!aClass711_Sub1_11965.aBool10971 || null == class711))
	       ? aClass711_Sub1_11965 : null);
	int i_88_ = class570.anInt7630 * 680391951;
	int i_89_ = class570.anInt7645 * 1366655921;
	if (i_88_ != 0 || i_89_ != 0 || 0 != class570.anInt7657 * 2079472619
	    || 0 != class570.anInt7660 * -97068925)
	    i |= 0x7;
	boolean bool
	    = (0 != aByte11964 && client.anInt11101 >= anInt11959 * 569195869
	       && client.anInt11101 < -507783033 * anInt11960);
	if (bool)
	    i |= 0x80000;
	boolean bool_90_ = false;
	if (0 != 555902073 * anInt11953) {
	    Class307 class307
		= (aClass307_12204.anIntArray3284 != null
		   ? aClass307_12204.method5615(Class78.aClass103_825,
						Class78.aClass103_825,
						-1466068515)
		   : aClass307_12204);
	    if (class307 == null
		|| client.anInt11101 >= (-2003184395 * class307.anInt3347
					 + -742785623 * anInt11926))
		anInt11953 = 0;
	    else {
		anInt11953
		    = ((255 - ((client.anInt11101 - anInt11926 * -742785623)
			       * 255 / (-2003184395 * class307.anInt3347)))
		       * 312395209);
		bool_90_ = true;
	    }
	}
	if (bool_90_)
	    i |= 0x100;
	int i_91_ = aClass57_11973.method1231(625617766);
	Class183 class183
	    = (aClass183Array11986[0]
	       = (aClass307_12204.method5622
		  (class185, i, Class200_Sub23.aClass44_Sub14_10041,
		   Class78.aClass103_825, Class78.aClass103_825, class711,
		   class711_sub1, aClass711_Sub3_Sub1Array11968,
		   anIntArray11920, i_91_, aClass301_12195,
		   method18529((byte) 71), false, -909295235)));
	if (class183 == null)
	    return false;
	anInt11927 = class183.method3045() * -4362271;
	anInt11981 = class183.method3049() * 2001645007;
	class183.method3042();
	method18537(class183, 1230998601);
	if (i_88_ != 0 || 0 != i_89_) {
	    method18539(i_91_, i_88_, i_89_, 1532427929 * class570.anInt7654,
			class570.anInt7643 * 26013715, (byte) 35);
	    if (0 != 1177236321 * anInt11950)
		aClass183Array11986[0].method3017(1177236321 * anInt11950);
	    if (-1556313745 * anInt11933 != 0)
		aClass183Array11986[0].method3018(anInt11933 * -1556313745);
	    if (0 != anInt11934 * 956485751)
		aClass183Array11986[0].method3098(0, 956485751 * anInt11934,
						  0);
	} else
	    method18539(i_91_, method18545((byte) 1) << 9,
			method18545((byte) 1) << 9, 0, 0, (byte) 112);
	if (bool)
	    class183.method3058(aByte11928, aByte11962, aByte11963,
				aByte11964 & 0xff);
	if (bool_90_)
	    class183.method3088((byte) (anInt11953 * 555902073), null);
	method18538(class185, class570, i_87_, i_88_, i_89_, i_91_,
		    2088438307);
	return true;
    }
    
    boolean method18851(Class185 class185, int i) {
	int i_92_ = i;
	Class570 class570 = method18531((byte) -14);
	Class711 class711 = ((aClass711_11948.method14338((byte) 0)
			      && !aClass711_11948.method14336(1621500345))
			     ? aClass711_11948 : null);
	Class711_Sub1 class711_sub1
	    = ((aClass711_Sub1_11965.method14338((byte) 0)
		&& (!aClass711_Sub1_11965.aBool10971 || null == class711))
	       ? aClass711_Sub1_11965 : null);
	int i_93_ = class570.anInt7630 * 680391951;
	int i_94_ = class570.anInt7645 * 1366655921;
	if (i_93_ != 0 || i_94_ != 0 || 0 != class570.anInt7657 * 2079472619
	    || 0 != class570.anInt7660 * -97068925)
	    i |= 0x7;
	boolean bool
	    = (0 != aByte11964 && client.anInt11101 >= anInt11959 * 569195869
	       && client.anInt11101 < -507783033 * anInt11960);
	if (bool)
	    i |= 0x80000;
	boolean bool_95_ = false;
	if (0 != 555902073 * anInt11953) {
	    Class307 class307
		= (aClass307_12204.anIntArray3284 != null
		   ? aClass307_12204.method5615(Class78.aClass103_825,
						Class78.aClass103_825,
						-1466068515)
		   : aClass307_12204);
	    if (class307 == null
		|| client.anInt11101 >= (-2003184395 * class307.anInt3347
					 + -742785623 * anInt11926))
		anInt11953 = 0;
	    else {
		anInt11953
		    = ((255 - ((client.anInt11101 - anInt11926 * -742785623)
			       * 255 / (-2003184395 * class307.anInt3347)))
		       * 312395209);
		bool_95_ = true;
	    }
	}
	if (bool_95_)
	    i |= 0x100;
	int i_96_ = aClass57_11973.method1231(1787701213);
	Class183 class183
	    = (aClass183Array11986[0]
	       = (aClass307_12204.method5622
		  (class185, i, Class200_Sub23.aClass44_Sub14_10041,
		   Class78.aClass103_825, Class78.aClass103_825, class711,
		   class711_sub1, aClass711_Sub3_Sub1Array11968,
		   anIntArray11920, i_96_, aClass301_12195,
		   method18529((byte) 77), false, -909295235)));
	if (class183 == null)
	    return false;
	anInt11927 = class183.method3045() * -4362271;
	anInt11981 = class183.method3049() * 2001645007;
	class183.method3042();
	method18537(class183, -1746290508);
	if (i_93_ != 0 || 0 != i_94_) {
	    method18539(i_96_, i_93_, i_94_, 1532427929 * class570.anInt7654,
			class570.anInt7643 * 26013715, (byte) 47);
	    if (0 != 1177236321 * anInt11950)
		aClass183Array11986[0].method3017(1177236321 * anInt11950);
	    if (-1556313745 * anInt11933 != 0)
		aClass183Array11986[0].method3018(anInt11933 * -1556313745);
	    if (0 != anInt11934 * 956485751)
		aClass183Array11986[0].method3098(0, 956485751 * anInt11934,
						  0);
	} else
	    method18539(i_96_, method18545((byte) 1) << 9,
			method18545((byte) 1) << 9, 0, 0, (byte) 26);
	if (bool)
	    class183.method3058(aByte11928, aByte11962, aByte11963,
				aByte11964 & 0xff);
	if (bool_95_)
	    class183.method3088((byte) (anInt11953 * 555902073), null);
	method18538(class185, class570, i_92_, i_93_, i_94_, i_96_,
		    2088438307);
	return true;
    }
    
    boolean method18852() {
	return aBool12209 || aClass307_12204.aBool3313;
    }
    
    boolean method18853(Class185 class185, int i) {
	int i_97_ = i;
	Class570 class570 = method18531((byte) -113);
	Class711 class711 = ((aClass711_11948.method14338((byte) 0)
			      && !aClass711_11948.method14336(2117273158))
			     ? aClass711_11948 : null);
	Class711_Sub1 class711_sub1
	    = ((aClass711_Sub1_11965.method14338((byte) 0)
		&& (!aClass711_Sub1_11965.aBool10971 || null == class711))
	       ? aClass711_Sub1_11965 : null);
	int i_98_ = class570.anInt7630 * 680391951;
	int i_99_ = class570.anInt7645 * 1366655921;
	if (i_98_ != 0 || i_99_ != 0 || 0 != class570.anInt7657 * 2079472619
	    || 0 != class570.anInt7660 * -97068925)
	    i |= 0x7;
	boolean bool
	    = (0 != aByte11964 && client.anInt11101 >= anInt11959 * 569195869
	       && client.anInt11101 < -507783033 * anInt11960);
	if (bool)
	    i |= 0x80000;
	boolean bool_100_ = false;
	if (0 != 555902073 * anInt11953) {
	    Class307 class307
		= (aClass307_12204.anIntArray3284 != null
		   ? aClass307_12204.method5615(Class78.aClass103_825,
						Class78.aClass103_825,
						-1466068515)
		   : aClass307_12204);
	    if (class307 == null
		|| client.anInt11101 >= (-2003184395 * class307.anInt3347
					 + -742785623 * anInt11926))
		anInt11953 = 0;
	    else {
		anInt11953
		    = ((255 - ((client.anInt11101 - anInt11926 * -742785623)
			       * 255 / (-2003184395 * class307.anInt3347)))
		       * 312395209);
		bool_100_ = true;
	    }
	}
	if (bool_100_)
	    i |= 0x100;
	int i_101_ = aClass57_11973.method1231(1589162715);
	Class183 class183
	    = (aClass183Array11986[0]
	       = (aClass307_12204.method5622
		  (class185, i, Class200_Sub23.aClass44_Sub14_10041,
		   Class78.aClass103_825, Class78.aClass103_825, class711,
		   class711_sub1, aClass711_Sub3_Sub1Array11968,
		   anIntArray11920, i_101_, aClass301_12195,
		   method18529((byte) 97), false, -909295235)));
	if (class183 == null)
	    return false;
	anInt11927 = class183.method3045() * -4362271;
	anInt11981 = class183.method3049() * 2001645007;
	class183.method3042();
	method18537(class183, 1127742723);
	if (i_98_ != 0 || 0 != i_99_) {
	    method18539(i_101_, i_98_, i_99_, 1532427929 * class570.anInt7654,
			class570.anInt7643 * 26013715, (byte) 56);
	    if (0 != 1177236321 * anInt11950)
		aClass183Array11986[0].method3017(1177236321 * anInt11950);
	    if (-1556313745 * anInt11933 != 0)
		aClass183Array11986[0].method3018(anInt11933 * -1556313745);
	    if (0 != anInt11934 * 956485751)
		aClass183Array11986[0].method3098(0, 956485751 * anInt11934,
						  0);
	} else
	    method18539(i_101_, method18545((byte) 1) << 9,
			method18545((byte) 1) << 9, 0, 0, (byte) 80);
	if (bool)
	    class183.method3058(aByte11928, aByte11962, aByte11963,
				aByte11964 & 0xff);
	if (bool_100_)
	    class183.method3088((byte) (anInt11953 * 555902073), null);
	method18538(class185, class570, i_97_, i_98_, i_99_, i_101_,
		    2088438307);
	return true;
    }
    
    public void method18854(int i, int i_102_, int i_103_, boolean bool,
			    int i_104_) {
	aByte10854 = aByte10853 = (byte) i;
	if (client.aClass512_11100.method8552((byte) 0)
		.method7612(i_102_, i_103_, (byte) 0))
	    aByte10853++;
	if (aClass711_11948.method14338((byte) 0)
	    && (aClass711_11948.method14382(-475537685).anInt2218 * -492433165
		== 1)) {
	    anIntArray11946 = null;
	    aClass711_11948.method14330(-1, 1709352523);
	}
	for (int i_105_ = 0; i_105_ < aClass529Array11949.length; i_105_++) {
	    if (-1183861629 * aClass529Array11949[i_105_].anInt7123 != -1) {
		Class684 class684
		    = ((Class684)
		       (Class55.aClass44_Sub4_447.method91
			(-1183861629 * aClass529Array11949[i_105_].anInt7123,
			 -1513405083)));
		if (class684.aBool8691 && -1 != class684.anInt8688 * -811043807
		    && (((Class205) (Class200_Sub12.aClass44_Sub1_9934.method91
				     (-811043807 * class684.anInt8688,
				      139910099))).anInt2218 * -492433165
			== 1)) {
		    aClass529Array11949[i_105_].aClass711_7121
			.method14330(-1, 1907904356);
		    aClass529Array11949[i_105_].anInt7123 = -496843307;
		}
	    }
	}
	if (!bool) {
	    int i_106_ = i_102_ - anIntArray11977[0];
	    int i_107_ = i_103_ - anIntArray11978[0];
	    if (i_106_ >= -8 && i_106_ <= 8 && i_107_ >= -8 && i_107_ <= 8) {
		if (anInt11980 * -1763707177 < anIntArray11977.length - 1)
		    anInt11980 += 990207207;
		for (int i_108_ = anInt11980 * -1763707177; i_108_ > 0;
		     i_108_--) {
		    anIntArray11977[i_108_] = anIntArray11977[i_108_ - 1];
		    anIntArray11978[i_108_] = anIntArray11978[i_108_ - 1];
		    aByteArray11979[i_108_] = aByteArray11979[i_108_ - 1];
		}
		anIntArray11977[0] = i_102_;
		anIntArray11978[0] = i_103_;
		aByteArray11979[0] = Class676.aClass676_8649.aByte8648;
		return;
	    }
	}
	anInt11980 = 0;
	anInt11937 = 0;
	anInt11947 = 0;
	anIntArray11977[0] = i_102_;
	anIntArray11978[0] = i_103_;
	Class438 class438 = Class438.method6994(method10807().aClass438_4885);
	class438.aFloat4864
	    = (float) ((i_104_ << 8) + (anIntArray11977[0] << 9));
	class438.aFloat4865
	    = (float) ((anIntArray11978[0] << 9) + (i_104_ << 8));
	method10809(class438);
	class438.method7074();
	if (null != aClass629_11983)
	    aClass629_11983.method10384();
    }
    
    public Class534_Sub36 method182(int i) {
	Class597 class597 = client.aClass512_11100.method8416((byte) 3);
	return (Class534_Sub33.method16405
		(aByte10854,
		 ((int) method10807().aClass438_4885.aFloat4864
		  + class597.anInt7859 * 1852947968),
		 -(int) method10807().aClass438_4885.aFloat4863,
		 ((int) method10807().aClass438_4885.aFloat4865
		  + class597.anInt7861 * -139729408),
		 1104938557));
    }
    
    boolean method18855() {
	return aBool12209 || aClass307_12204.aBool3313;
    }
    
    public int method18600(byte i) {
	if (null != aClass307_12204.anIntArray3284) {
	    Class307 class307
		= aClass307_12204.method5615(Class78.aClass103_825,
					     Class78.aClass103_825,
					     -1466068515);
	    if (class307 != null && -1 != class307.anInt3320 * 194352473)
		return 194352473 * class307.anInt3320;
	}
	return aClass307_12204.anInt3320 * 194352473;
    }
    
    public Class534_Sub36 method194() {
	Class597 class597 = client.aClass512_11100.method8416((byte) 103);
	return (Class534_Sub33.method16405
		(aByte10854,
		 ((int) method10807().aClass438_4885.aFloat4864
		  + class597.anInt7859 * 1852947968),
		 -(int) method10807().aClass438_4885.aFloat4863,
		 ((int) method10807().aClass438_4885.aFloat4865
		  + class597.anInt7861 * -139729408),
		 1104938557));
    }
    
    Class550 method16853(Class185 class185, int i) {
	if (aClass307_12204 == null
	    || !method18830(class185, 526336, (byte) 8))
	    return null;
	Class446 class446 = method10834();
	Class444 class444 = method10807();
	Class446 class446_109_ = class185.method3665();
	int i_110_ = aClass57_11973.method1231(1193261791);
	Class568 class568
	    = (aClass556_10855.aClass568ArrayArrayArray7431[aByte10854]
	       [(int) class444.aClass438_4885.aFloat4864 >> 9]
	       [(int) class444.aClass438_4885.aFloat4865 >> 9]);
	if (class568 != null && null != class568.aClass654_Sub1_Sub2_7607) {
	    int i_111_ = (-996512449 * anInt11930
			  - class568.aClass654_Sub1_Sub2_7607.aShort11864);
	    anInt11930 = (int) ((float) (-996512449 * anInt11930)
				- (float) i_111_ / 10.0F) * -1299053889;
	} else
	    anInt11930 = ((int) ((float) (anInt11930 * -996512449)
				 - (float) (anInt11930 * -996512449) / 10.0F)
			  * -1299053889);
	class446_109_.method7236(class446);
	class446_109_.method7287(0.0F, (float) (-20 - -996512449 * anInt11930),
				 0.0F);
	Class570 class570 = method18531((byte) -122);
	Class307 class307
	    = (aClass307_12204.anIntArray3284 != null
	       ? aClass307_12204.method5615(Class78.aClass103_825,
					    Class78.aClass103_825, -1466068515)
	       : aClass307_12204);
	boolean bool = class307.aClass432_3342 != null;
	aBool11961 = false;
	Class550 class550 = null;
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub1_10762
		.method16828(62926167) == 1
	    && class307.aBool3281 && class570.aBool7639) {
	    Class711 class711 = ((aClass711_11948.method14338((byte) 0)
				  && aClass711_11948.method14336(1344955038))
				 ? aClass711_11948 : null);
	    Class711_Sub1 class711_sub1
		= ((aClass711_Sub1_11965.method14338((byte) 0)
		    && (!aClass711_Sub1_11965.aBool10971 || class711 == null))
		   ? aClass711_Sub1_11965 : null);
	    short i_112_ = Class620.aClass632_8113.aShort8237;
	    byte i_113_ = Class620.aClass632_8113.aByte8238;
	    if (aClass307_12204.aShort3323 > -1) {
		i_112_ = aClass307_12204.aShort3323;
		i_113_ = aClass307_12204.aByte3324;
	    }
	    Class183 class183;
	    if (i_112_ > -1
		&& Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		       .method17030((byte) -54) == 1)
		class183
		    = Class690_Sub35.method17182(class185, i_110_,
						 1177236321 * anInt11950,
						 -1556313745 * anInt11933,
						 anInt11934 * 956485751,
						 aClass183Array11986[0],
						 i_112_, i_113_,
						 (class711_sub1 != null
						  ? (Class711) class711_sub1
						  : class711),
						 (byte) 64);
	    else
		class183 = (Class200_Sub3.method15570
			    (class185, i_110_, 1177236321 * anInt11950,
			     -1556313745 * anInt11933, 956485751 * anInt11934,
			     aClass307_12204.anInt3328 * -1821838479,
			     aClass183Array11986[0],
			     aClass307_12204.aShort3319 & 0xffff,
			     aClass307_12204.aShort3306 & 0xffff,
			     aClass307_12204.aByte3315 & 0xff,
			     aClass307_12204.aByte3322 & 0xff,
			     (class711_sub1 != null ? (Class711) class711_sub1
			      : class711),
			     -437639383));
	    if (null != class183) {
		class550
		    = Class322.method5779(method18834((byte) -50), 1380690009);
		aBool11961 = true;
		class185.method3461(false);
		if (bool)
		    class183.method3034(class446_109_, null, 0);
		else {
		    if (null == aClass194Array10852
			|| (aClass194Array10852.length
			    < 1 + aClass183Array11986.length))
			method16862(1 + aClass183Array11986.length,
				    -1902065289);
		    class183.method3034(class446_109_,
					(aClass194Array10852
					 [aClass183Array11986.length]),
					0);
		}
		class185.method3461(true);
	    }
	}
	if (bool) {
	    if (aClass194Array10852 == null || aClass194Array10852.length > 1)
		method16862(1, -1947151035);
	    class185.method3311(class446_109_, aClass194Array10852[0],
				class307.aClass432_3342);
	} else if (aClass194Array10852 == null
		   || aClass194Array10852.length < aClass183Array11986.length)
	    method16862(aClass183Array11986.length, -826980960);
	if (null == class550)
	    class550 = Class322.method5779(method18834((byte) -8), 2039352491);
	method18528(class185, aClass183Array11986, class446_109_, false,
		    191454627);
	for (int i_114_ = 0; i_114_ < aClass183Array11986.length; i_114_++) {
	    if (aClass183Array11986[i_114_] != null) {
		if (aClass307_12204.aBool3346)
		    aClass183Array11986[i_114_].method3058
			(anInt12203 * 1438588027, anInt12202 * -2030636931,
			 anInt12206 * -920642251, -885695275 * anInt12207);
		if (bool)
		    aClass183Array11986[i_114_].method3034(class446_109_, null,
							   0);
		else
		    aClass183Array11986[i_114_].method3034(class446_109_,
							   (aClass194Array10852
							    [i_114_]),
							   0);
	    } else if (!bool)
		aClass194Array10852[i_114_].aBool2150 = false;
	}
	if (null != aClass629_11983) {
	    Class174 class174 = aClass629_11983.method10405();
	    class185.method3334(class174);
	}
	for (int i_115_ = 0; i_115_ < aClass183Array11986.length; i_115_++) {
	    if (null != aClass183Array11986[i_115_])
		aBool11961 |= aClass183Array11986[i_115_].method3027();
	    aClass183Array11986[i_115_] = null;
	}
	anInt11940 = client.anInt11161 * 842490719;
	return class550;
    }
    
    public int method18856(int i) {
	return anIntArray12197[i];
    }
    
    public int method18857(int i) {
	return anIntArray12197[i];
    }
    
    public void method18858(int i, int i_116_, int i_117_) {
	anIntArray12198[i] = i_116_;
	anIntArray12197[i] = i_117_;
    }
    
    public int method145() {
	return anInt11922 * 1126388985;
    }
    
    public Class564 method16870(Class185 class185) {
	return null;
    }
    
    public void method18859(String string, int i, int i_118_) {
	int i_119_ = (Class469.method7641((byte) -7)
		      * (708187909 * Class620.aClass632_8113.anInt8245));
	method18563(string, i, i_118_, i_119_, (short) 353);
    }
    
    int method16863() {
	if (null == aClass307_12204)
	    return 0;
	return aClass307_12204.anInt3345 * -1882113335;
    }
    
    public void method18860(Class307 class307) {
	method18828(class307, true, true, true, -1037108157);
    }
    
    static final void method18861(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aShort11313;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aShort11314;
    }
    
    static void method18862(int[] is, LinkedList linkedlist, int i, int i_120_,
			    float f, int i_121_) {
	if (!linkedlist.isEmpty()) {
	    for (int i_122_ = 0; i_122_ < linkedlist.size(); i_122_++) {
		Class588 class588 = (Class588) linkedlist.get(i_122_);
		int i_123_
		    = i + (int) ((float) (class588.anInt7803 * -1690294733)
				 * f);
		int i_124_
		    = ((int) ((float) (1291235515 * class588.anInt7805) * f)
		       + i_120_);
		int i_125_
		    = (int) (f * (float) (-319890445 * class588.anInt7804));
		int i_126_
		    = (int) (f * (float) (300807017 * class588.anInt7806));
		if (i_123_ < -777198511 * Class387.anInt4050
		    && i_124_ < 1445010517 * Class503.anInt5629) {
		    if (i_125_ + i_123_ > Class387.anInt4050 * -777198511)
			i_125_ = -777198511 * Class387.anInt4050 - i_123_;
		    if (i_124_ + i_126_ > Class503.anInt5629 * 1445010517)
			i_126_ = 1445010517 * Class503.anInt5629 - i_124_;
		    for (int i_127_ = i_124_; i_127_ < i_124_ + i_126_;
			 i_127_++) {
			int i_128_ = i_123_ + i_127_ * (-777198511
							* Class387.anInt4050);
			Arrays.fill(is, i_128_, i_128_ + i_125_, -16777216);
		    }
		}
	    }
	}
    }
}
