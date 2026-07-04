/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class232
{
    Interface58 anInterface58_2326;
    static final int anInt2327 = 8192;
    static final int anInt2328 = 16384;
    static final int anInt2329 = 8192;
    static final int anInt2330 = 0;
    static final int anInt2331 = 4096;
    int anInt2332;
    boolean aBool2333;
    List aList2334 = new ArrayList();
    boolean aBool2335;
    HashMap aHashMap2336;
    HashMap aHashMap2337;
    List aList2338;
    Class203 aClass203_2339;
    Class203 aClass203_2340;
    static final int anInt2341 = 4096;
    int anInt2342;
    Class438 aClass438_2343;
    HashMap aHashMap2344;
    static final int anInt2345 = 16384;
    Class491 aClass491_2346;
    Interface58 anInterface58_2347;
    Class491 aClass491_2348;
    int anInt2349;
    int anInt2350;
    boolean aBool2351;
    List aList2352 = new ArrayList();
    Interface58 anInterface58_2353;
    Interface58 anInterface58_2354;
    Class203 aClass203_2355;
    public static int anInt2356;
    
    public void method4212(Class205 class205, int i,
			   Class654_Sub1 class654_sub1, int i_0_) {
	if (null != class205 && null != class205.anIntArrayArray2215
	    && i < class205.anIntArrayArray2215.length
	    && class205.anIntArrayArray2215[i] != null
	    && (class654_sub1.aByte10854
		== Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854)
	    && class654_sub1.method16859(748374124)) {
	    int i_1_ = class205.anIntArrayArray2215[i][0];
	    int i_2_ = i_1_ >> 8;
	    int i_3_ = i_1_ >> 5 & 0x7;
	    int i_4_ = i_1_ & 0x1f;
	    if (class205.anIntArrayArray2215[i].length > 1) {
		int i_5_ = (int) (Math.random()
				  * (double) (class205.anIntArrayArray2215
					      [i]).length);
		if (i_5_ > 0)
		    i_2_ = class205.anIntArrayArray2215[i][i_5_];
	    }
	    int i_6_ = 256;
	    if (null != class205.anIntArray2227
		&& null != class205.anIntArray2226)
		i_6_ = ((int) (Math.random()
			       * (double) (class205.anIntArray2226[i]
					   - class205.anIntArray2227[i]))
			+ class205.anIntArray2227[i]);
	    int i_7_ = (class205.anIntArray2216 == null ? 255
			: class205.anIntArray2216[i]);
	    if (i_4_ == 0) {
		if (class654_sub1
		    == Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419)
		    method4237(Class211.aClass211_2250, i_2_, i_3_, i_7_,
			       Class190.aClass190_2129.method3763(1368870058),
			       Class207.aClass207_2235, 0.0F, 0.0F, null,
			       class654_sub1.aByte10854, i_6_, 0, (byte) 120);
	    } else {
		if (class654_sub1
		    == Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419) {
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub28_10784.method17131(-639548369)
			== 0)
			return;
		} else if (Class44_Sub6.aClass534_Sub35_10989
			       .aClass690_Sub28_10754.method17131(1031599206)
			   == 0)
		    return;
		if (-1 != class205.anInt2230 * 864647291) {
		    int i_8_ = 0;
		    if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub1)
			i_8_ = ((Class654_Sub1_Sub5_Sub1) class654_sub1)
				   .method18549((byte) 70);
		    else if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub5)
			i_8_ = ((Class654_Sub1_Sub5_Sub5) class654_sub1)
				   .method18783((short) -29554);
		    else if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub6)
			i_8_ = ((Class654_Sub1_Sub5_Sub6) class654_sub1)
				   .method18820((byte) -107);
		    if (0 != i_8_
			&& i_8_ != Class322
				       .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				       .method18549((byte) 16)
			&& i_8_ != 476125061 * client.anInt11204) {
			i_7_ = class205.anInt2230 * 864647291 * i_7_ / 100;
			if (i_7_ < 0)
			    i_7_ = 0;
			else if (i_7_ > 255)
			    i_7_ = 255;
		    }
		}
		Class438 class438 = class654_sub1.method10807().aClass438_4885;
		int i_9_ = (int) class438.aFloat4864 - 256 >> 9;
		int i_10_ = (int) class438.aFloat4865 - 256 >> 9;
		Class438 class438_11_ = new Class438((float) (i_9_ << 9), 0.0F,
						     (float) (i_10_ << 9));
		int i_12_ = class654_sub1.aByte10854 << 24;
		method4237(Class211.aClass211_2253, i_2_, i_3_, i_7_,
			   Class190.aClass190_2130.method3763(-1526991453),
			   ((class654_sub1
			     != Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419)
			    ? Class207.aClass207_2236
			    : Class207.aClass207_2235),
			   0.0F, (float) (i_4_ << 9), class438_11_, i_12_,
			   i_6_, 0, (byte) 4);
	    }
	}
    }
    
    List method4213(int i) {
	return aList2338;
    }
    
    Class203 method4214(byte i) {
	return aClass203_2355;
    }
    
    Class203 method4215(int i) {
	return aClass203_2339;
    }
    
    public void method4216(int i, int i_13_) {
	Class229 class229 = (Class229) aHashMap2344.get(Integer.valueOf(i));
	if (class229 != null) {
	    List list = class229.method4195(-1507514944);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		class491.method8014(50, 1962988118);
	    }
	}
    }
    
    public Class232() {
	aHashMap2336 = new HashMap();
	aHashMap2337 = new HashMap();
	aList2338 = new ArrayList();
	aHashMap2344 = new HashMap();
	aClass491_2348 = null;
	aBool2335 = false;
	anInterface58_2326 = new Class210(this);
	anInterface58_2353 = new Class193(this);
	anInterface58_2354 = new Class226(this);
	anInterface58_2347 = new Class189(this);
    }
    
    public void method4217(int i) {
	method4244(i, 255, (byte) 1);
    }
    
    public void method4218(int i, int i_14_, byte i_15_) {
	if (i != -1966156715 * anInt2332) {
	    if (aClass491_2348 != null) {
		aClass491_2348.method8014(0, 1962988118);
		method4234(aClass491_2348, 434146158);
		aClass491_2348 = null;
	    }
	    Class491 class491
		= method4229(Class211.aClass211_2257, this, i, 0, i_14_,
			     Class190.aClass190_2135.method3763(697209659),
			     Class207.aClass207_2235, 0.0F, 0.0F, null, 0, 255,
			     true, 201099141);
	    if (null != class491) {
		class491.method8012(-1720662844);
		aClass491_2348 = class491;
	    }
	    aBool2335 = false;
	}
    }
    
    public void method4219(int i) {
	Class493.method8118(265131492);
    }
    
    public void method4220(Class491 class491, int i, int i_16_, int i_17_) {
	if (null != class491) {
	    Class229 class229
		= (Class229) aHashMap2344.get(Integer.valueOf(i));
	    if (null == class229) {
		class229 = new Class229(this);
		aHashMap2344.put(Integer.valueOf(i), class229);
	    }
	    if (!class229.method4194(class491, 31645619)) {
		class491.method8018(i_16_, true, (byte) 5);
		class229.method4192(class491, -661714523);
	    }
	}
    }
    
    public void method4221(int i, byte i_18_) {
	Class229 class229 = (Class229) aHashMap2344.get(Integer.valueOf(i));
	if (null != class229) {
	    List list = class229.method4195(-1590074794);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		if (!class491.method8035(-521691877))
		    class491.method8069(1977076402);
	    }
	}
    }
    
    Interface70 method4222(int i, boolean bool) {
	if (!aBool2333)
	    return null;
	Interface70 interface70 = method4324(i, bool, -360053922);
	if (null == interface70) {
	    Class215 class215 = new Class215(this);
	    interface70
		= Class227.method4182((bool ? Class63.aClass472_654
				       : Class601_Sub1.aClass472_10877),
				      i, class215, bool, aClass203_2340,
				      -939473769);
	    if (bool)
		aHashMap2337.put(Integer.valueOf(i), interface70);
	    else
		aHashMap2336.put(Integer.valueOf(i), interface70);
	}
	return interface70;
    }
    
    public void method4223(int i, int i_19_) {
	if (aBool2333 && (!aBool2351 || 1867711623 * anInt2350 != i)) {
	    if (aBool2351 && i != anInt2350 * 1867711623) {
		Iterator iterator = aList2334.iterator();
		while (iterator.hasNext()) {
		    Class491 class491 = (Class491) iterator.next();
		    if (class491.method8023((byte) 62)
			== Class211.aClass211_2247) {
			class491.method8030((byte) -118);
			aList2352.remove(class491);
			aBool2351 = false;
			break;
		    }
		}
	    }
	    if (0 != i_19_ && i != -1) {
		if (!aBool2351 && null != aClass491_2346)
		    aClass491_2346.method8015((byte) 1);
		Class491 class491
		    = method4229(Class211.aClass211_2247, this, i, 0, i_19_,
				 Class190.aClass190_2135
				     .method3763(-1710130479),
				 Class207.aClass207_2235, 0.0F, 0.0F, null, 0,
				 255, true, -385253744);
		if (class491 != null) {
		    class491.method8069(2011686689);
		    method4234(class491, 757701818);
		    aBool2351 = true;
		    anInt2350 = i * -1685159625;
		}
	    }
	}
    }
    
    void method4224(int i) {
	Class197 class197 = new Class197(this);
	Class231 class231 = new Class231(this);
	Class222 class222 = new Class222(this);
	Class221 class221 = new Class221(this);
	Class223 class223 = new Class223(this);
	Class620.method10274(Class198.aClass198_2167.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     0.2F, class197, 2129934165);
	Class620.method10274(Class198.aClass198_2166.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class231, 1985928467);
	Class620.method10274(Class198.aClass198_2164.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class222, 2133697437);
	Class620.method10274(Class198.aClass198_2168.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     0.8F, class221, 2084382467);
	Class620.method10274(Class198.aClass198_2169.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class223, 2066389055);
	Class620.method10274(Class190.aClass190_2135.method3763(1723887600),
			     Class198.aClass198_2166.method3824((byte) 0),
			     1.0F, null, 2140062629);
	Class620.method10274(Class190.aClass190_2128.method3763(-1283960212),
			     Class198.aClass198_2169.method3824((byte) 0),
			     1.0F, null, 2107527426);
	Class620.method10274(Class190.aClass190_2134.method3763(-585175226),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2143003214);
	Class620.method10274(Class190.aClass190_2129.method3763(1251599210),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2017662993);
	Class620.method10274(Class190.aClass190_2130.method3763(273580485),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2136643332);
	Class620.method10274(Class190.aClass190_2131.method3763(-1780625170),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2024411465);
	Class620.method10274(Class190.aClass190_2132.method3763(-2124928444),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2137687295);
	Class620.method10274(Class190.aClass190_2133.method3763(-397370984),
			     Class198.aClass198_2168.method3824((byte) 0),
			     1.0F, null, 2040358794);
	Class620.method10274(Class190.aClass190_2136.method3763(784073115),
			     Class190.aClass190_2133.method3763(2006119953),
			     1.0F, null, 2098130882);
	Class620.method10274(Class190.aClass190_2127.method3763(-1192594949),
			     Class190.aClass190_2133.method3763(-1947972384),
			     1.0F, null, 2081821841);
	Class662.method10994
	    (Class190.aClass190_2135.method3763(756275000), (byte) 1)
	    .method6520(0.75F, (byte) -6);
    }
    
    public void method4225(int i, int i_20_, int i_21_, int i_22_) {
	int i_23_ = Class198.aClass198_2165.method3824((byte) 0);
	if (Class662.method10994(i, (byte) 1) == null
	    && (i_23_ == i_20_
		|| Class662.method10994(i_20_, (byte) 1) != null)) {
	    float f = 1.5258789E-5F * (float) i_21_;
	    Class620.method10274(i, i_20_ == i_23_ ? -1 : i_20_, f, null,
				 2011008094);
	}
    }
    
    public void method4226(int i, int i_24_, int i_25_) {
	Class388 class388 = Class662.method10994(i, (byte) 1);
	if (null != class388) {
	    float f = 1.5258789E-5F * (float) i_24_;
	    class388.method6520(f, (byte) -39);
	}
    }
    
    float method4227(int i, int i_26_) {
	Class388 class388 = Class662.method10994(i, (byte) 1);
	float f = 1.0F;
	for (/**/; null != class388;
	     class388 = class388.method6512(-2075814524))
	    f *= class388.method6511(-1164023876);
	return f;
    }
    
    public void method4228(int i, byte i_27_) {
	Iterator iterator = aList2352.iterator();
	while (iterator.hasNext()) {
	    Class491 class491 = (Class491) iterator.next();
	    int i_28_ = class491.method8034(1259785780);
	    boolean bool = Class304.method5594(i_28_, i, -1527878316);
	    if (bool)
		class491.method8014(50, 1962988118);
	}
    }
    
    public Class491 method4229
	(Class211 class211, Object object, int i, int i_29_, int i_30_,
	 int i_31_, Class207 class207, float f, float f_32_, Class438 class438,
	 int i_33_, int i_34_, boolean bool, int i_35_) {
	if (!aBool2333)
	    return null;
	if (object == null)
	    return null;
	i_30_ = Math.max(0, Math.min(i_30_, 255));
	i_34_ = Math.max(0, i_34_);
	if (Class207.aClass207_2235 != class207
	    && !method4238(aClass438_2343, class438, f_32_, -128296060))
	    return null;
	if (i_34_ <= 0)
	    i_34_ = 255;
	float f_36_ = (float) i_30_ / 255.0F;
	float f_37_ = (float) i_34_ / 255.0F;
	Interface70 interface70 = method4232(i, bool, -1243962438);
	Class491 class491 = method4233(interface70, (byte) -96);
	if (null == class491)
	    return null;
	class491.method8008(object, 1961533934);
	class491.method8025(i_31_, (byte) 33);
	if (Class207.aClass207_2235 != class207) {
	    class491.method8026(true, (byte) -38);
	    class491.method8028(class438, (byte) -4);
	    class491.method8032(f, 1009861768);
	    class491.method8033(f_32_, (byte) 58);
	    if (Class207.aClass207_2234 == class207)
		class491.method8017(anInterface58_2353, -1876114470);
	    else if (class207 == Class207.aClass207_2237)
		class491.method8017(anInterface58_2347, -2085094032);
	    else if (Class207.aClass207_2236 == class207)
		class491.method8017(anInterface58_2326, -982003959);
	    else if (class207 == Class207.aClass207_2238)
		class491.method8017(anInterface58_2354, -268381109);
	    else
		class491.method8026(false, (byte) -26);
	}
	class491.method8037(f_36_, 0, 1385009227);
	class491.method8038(i_29_ > 1 || i_29_ < 0,
			    i_29_ > 0 ? i_29_ - 1 : i_29_, -1565831053);
	class491.method8039(f_37_, (byte) -49);
	class491.method8022(class211, (byte) -9);
	return class491;
    }
    
    public void method4230(int i, int i_38_) {
	if (aBool2333 && i >= 0)
	    method4232(i, false, -951020713);
    }
    
    public void method4231(int i, int i_39_) {
	if (i != -1966156715 * anInt2332) {
	    if (aClass491_2348 != null) {
		aClass491_2348.method8014(0, 1962988118);
		method4234(aClass491_2348, -374049774);
		aClass491_2348 = null;
	    }
	    Class491 class491
		= method4229(Class211.aClass211_2257, this, i, 0, i_39_,
			     Class190.aClass190_2135.method3763(1233848624),
			     Class207.aClass207_2235, 0.0F, 0.0F, null, 0, 255,
			     true, 413626572);
	    if (null != class491) {
		class491.method8012(-1720662844);
		aClass491_2348 = class491;
	    }
	    aBool2335 = false;
	}
    }
    
    Interface70 method4232(int i, boolean bool, int i_40_) {
	if (!aBool2333)
	    return null;
	Interface70 interface70 = method4324(i, bool, -360053922);
	if (null == interface70) {
	    Class215 class215 = new Class215(this);
	    interface70
		= Class227.method4182((bool ? Class63.aClass472_654
				       : Class601_Sub1.aClass472_10877),
				      i, class215, bool, aClass203_2340,
				      304545280);
	    if (bool)
		aHashMap2337.put(Integer.valueOf(i), interface70);
	    else
		aHashMap2336.put(Integer.valueOf(i), interface70);
	}
	return interface70;
    }
    
    Class491 method4233(Interface70 interface70, byte i) {
	if (!aBool2333)
	    return null;
	int i_41_ = 0;
	Iterator iterator = aList2334.iterator();
	while (iterator.hasNext()) {
	    Class491 class491 = (Class491) iterator.next();
	    i_41_++;
	    if (class491.method8027((byte) 2) == Class480.aClass480_5260) {
		class491.method8010(interface70, 1045939075);
		return class491;
	    }
	}
	if (i_41_ >= 834069887 * anInt2342)
	    return null;
	Class491 class491 = interface70.method444((byte) -33);
	aList2334.add(class491);
	return class491;
    }
    
    public void method4234(Class491 class491, int i) {
	class491.method8008(this, 2033733951);
	aList2352.add(class491);
    }
    
    public void method4235(int i, int i_42_) {
	if (aBool2333 && (!aBool2351 || 1867711623 * anInt2350 != i)) {
	    if (aBool2351 && i != anInt2350 * 1867711623) {
		Iterator iterator = aList2334.iterator();
		while (iterator.hasNext()) {
		    Class491 class491 = (Class491) iterator.next();
		    if (class491.method8023((byte) 55)
			== Class211.aClass211_2247) {
			class491.method8030((byte) -16);
			aList2352.remove(class491);
			aBool2351 = false;
			break;
		    }
		}
	    }
	    if (0 != i_42_ && i != -1) {
		if (!aBool2351 && null != aClass491_2346)
		    aClass491_2346.method8015((byte) 1);
		Class491 class491
		    = method4229(Class211.aClass211_2247, this, i, 0, i_42_,
				 Class190.aClass190_2135.method3763(327749716),
				 Class207.aClass207_2235, 0.0F, 0.0F, null, 0,
				 255, true, -1271441137);
		if (class491 != null) {
		    class491.method8069(2093589776);
		    method4234(class491, -14425684);
		    aBool2351 = true;
		    anInt2350 = i * -1685159625;
		}
	    }
	}
    }
    
    void method4236() {
	Class197 class197 = new Class197(this);
	Class231 class231 = new Class231(this);
	Class222 class222 = new Class222(this);
	Class221 class221 = new Class221(this);
	Class223 class223 = new Class223(this);
	Class620.method10274(Class198.aClass198_2167.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     0.2F, class197, 2025251529);
	Class620.method10274(Class198.aClass198_2166.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class231, 2047012421);
	Class620.method10274(Class198.aClass198_2164.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class222, 2147187872);
	Class620.method10274(Class198.aClass198_2168.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     0.8F, class221, 2089429825);
	Class620.method10274(Class198.aClass198_2169.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class223, 2049411389);
	Class620.method10274(Class190.aClass190_2135.method3763(590308512),
			     Class198.aClass198_2166.method3824((byte) 0),
			     1.0F, null, 2119026855);
	Class620.method10274(Class190.aClass190_2128.method3763(-148932310),
			     Class198.aClass198_2169.method3824((byte) 0),
			     1.0F, null, 2108185933);
	Class620.method10274(Class190.aClass190_2134.method3763(548601163),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2065991109);
	Class620.method10274(Class190.aClass190_2129.method3763(227356828),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2093693513);
	Class620.method10274(Class190.aClass190_2130.method3763(1167838418),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2103417038);
	Class620.method10274(Class190.aClass190_2131.method3763(743170257),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2093809931);
	Class620.method10274(Class190.aClass190_2132.method3763(1047930313),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2060419761);
	Class620.method10274(Class190.aClass190_2133.method3763(2043752074),
			     Class198.aClass198_2168.method3824((byte) 0),
			     1.0F, null, 2030096483);
	Class620.method10274(Class190.aClass190_2136.method3763(1783635504),
			     Class190.aClass190_2133.method3763(1380853820),
			     1.0F, null, 2133239582);
	Class620.method10274(Class190.aClass190_2127.method3763(1813461318),
			     Class190.aClass190_2133.method3763(2109475937),
			     1.0F, null, 2133253296);
	Class662.method10994
	    (Class190.aClass190_2135.method3763(1939136085), (byte) 1)
	    .method6520(0.75F, (byte) -44);
    }
    
    public void method4237(Class211 class211, int i, int i_43_, int i_44_,
			   int i_45_, Class207 class207, float f, float f_46_,
			   Class438 class438, int i_47_, int i_48_, int i_49_,
			   byte i_50_) {
	if (aBool2333) {
	    Class491 class491 = method4229(class211, this, i, i_43_, i_44_,
					   i_45_, class207, f, f_46_, class438,
					   i_47_, i_48_, false, 1413127319);
	    if (class491 != null) {
		if (i_49_ == 0)
		    class491.method8069(2020988423);
		else
		    class491.method8018(i_49_, false, (byte) 5);
		method4234(class491, 991746652);
	    }
	}
    }
    
    boolean method4238(Class438 class438, Class438 class438_51_, float f,
		       int i) {
	Class438 class438_52_ = Class438.method7055(class438_51_, class438);
	if (class438_52_.method7012() >= f)
	    return false;
	return true;
    }
    
    public void method4239() {
	Class493.method8118(950384441);
    }
    
    public void method4240(int i, byte i_53_) {
	anInt2349 = i * 244312271;
    }
    
    public void method4241(int i, int i_54_) {
	Class388 class388 = Class662.method10994(i, (byte) 1);
	if (null != class388) {
	    float f = 1.5258789E-5F * (float) i_54_;
	    class388.method6520(f, (byte) -72);
	}
    }
    
    void method4242(int i, int i_55_) {
	if (null != client.aClass100_11264.aClass13_1183
	    && Class44_Sub22.method17372(client.anInt11039 * -1850530127,
					 -718679534)) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4201,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16510(i,
								  -406783032);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 24);
	}
    }
    
    public void method4243(int i, int i_56_) {
	method4244(i, 255, (byte) 5);
    }
    
    public void method4244(int i, int i_57_, byte i_58_) {
	method4274(i, i_57_, false, 0, 0, 0, 0, 0, 1700834363);
    }
    
    Class438 method4245(int i) {
	return aClass438_2343;
    }
    
    Class491 method4246(short i) {
	Iterator iterator = aList2352.iterator();
	while (iterator.hasNext()) {
	    Class491 class491 = (Class491) iterator.next();
	    if (class491.method8023((byte) 125) == Class211.aClass211_2257
		&& class491.method8027((byte) 2) == Class480.aClass480_5255)
		return class491;
	}
	return null;
    }
    
    public void method4247(int i) {
	Iterator iterator = aList2352.iterator();
	while (iterator.hasNext()) {
	    Class491 class491 = (Class491) iterator.next();
	    if (class491.method8023((byte) 77) == Class211.aClass211_2257) {
		class491.method8014(500, 1962988118);
		if (class491.method8040((byte) 121).method30(244247317)
		    == -1966156715 * anInt2332) {
		    method4242(anInt2332 * -1966156715, -1931824308);
		    break;
		}
	    }
	}
	aClass491_2346 = null;
	anInt2332 = 794851075;
    }
    
    public void method4248(int i, int i_59_, byte i_60_) {
	if (aBool2333 && (!aBool2351 || 1867711623 * anInt2350 != i)) {
	    if (aBool2351 && i != anInt2350 * 1867711623) {
		Iterator iterator = aList2334.iterator();
		while (iterator.hasNext()) {
		    Class491 class491 = (Class491) iterator.next();
		    if (class491.method8023((byte) 67)
			== Class211.aClass211_2247) {
			class491.method8030((byte) -90);
			aList2352.remove(class491);
			aBool2351 = false;
			break;
		    }
		}
	    }
	    if (0 != i_59_ && i != -1) {
		if (!aBool2351 && null != aClass491_2346)
		    aClass491_2346.method8015((byte) 1);
		Class491 class491
		    = method4229(Class211.aClass211_2247, this, i, 0, i_59_,
				 Class190.aClass190_2135
				     .method3763(1726131379),
				 Class207.aClass207_2235, 0.0F, 0.0F, null, 0,
				 255, true, -2122381695);
		if (class491 != null) {
		    class491.method8069(2139493863);
		    method4234(class491, -1960134920);
		    aBool2351 = true;
		    anInt2350 = i * -1685159625;
		}
	    }
	}
    }
    
    public void method4249(int i) {
	anInt2349 = i * 244312271;
    }
    
    public void method4250(int i, int i_61_) {
	if (!aBool2333) {
	    anInt2342 = i * 271243903;
	    aClass203_2355 = new Class203(i_61_, 100);
	    aClass203_2339 = new Class203(10);
	    aClass203_2355.method3870(new Class188(this), (byte) -29);
	    Class652 class652 = new Class652(Class376.aClass376_3910);
	    Class580.method9813(class652, 1955344342);
	    method4224(16777472);
	    anInt2332 = 794851075;
	    aBool2333 = true;
	}
    }
    
    List method4251() {
	return aList2352;
    }
    
    List method4252() {
	return aList2352;
    }
    
    List method4253() {
	return aList2352;
    }
    
    List method4254() {
	return aList2352;
    }
    
    Class438 method4255() {
	return aClass438_2343;
    }
    
    List method4256() {
	return aList2338;
    }
    
    List method4257() {
	return aList2338;
    }
    
    List method4258() {
	return aList2338;
    }
    
    Class203 method4259() {
	return aClass203_2355;
    }
    
    Class203 method4260() {
	return aClass203_2355;
    }
    
    Class203 method4261() {
	return aClass203_2355;
    }
    
    public void method4262(Class205 class205, int i, byte i_62_) {
	if (null != class205 && null != class205.anIntArrayArray2215
	    && i < class205.anIntArrayArray2215.length
	    && class205.anIntArrayArray2215[i] != null) {
	    int i_63_ = class205.anIntArrayArray2215[i][0];
	    int i_64_ = i_63_ >> 8;
	    int i_65_ = i_63_ >> 5 & 0x7;
	    if (class205.anIntArrayArray2215[i].length > 1) {
		int i_66_ = (int) (Math.random()
				   * (double) (class205.anIntArrayArray2215
					       [i]).length);
		if (i_66_ > 0)
		    i_64_ = class205.anIntArrayArray2215[i][i_66_];
	    }
	    int i_67_ = 256;
	    if (null != class205.anIntArray2227
		&& class205.anIntArray2226 != null)
		i_67_ = (int) ((double) class205.anIntArray2227[i]
			       + (Math.random()
				  * (double) (class205.anIntArray2226[i]
					      - class205.anIntArray2227[i])));
	    int i_68_ = (class205.anIntArray2216 == null ? 255
			 : class205.anIntArray2216[i]);
	    method4237(Class211.aClass211_2256, i_64_, i_65_, i_68_,
		       Class190.aClass190_2130.method3763(-250834727),
		       Class207.aClass207_2235, 0.0F, 0.0F, null, 0, i_67_, 0,
		       (byte) 12);
	}
    }
    
    public void method4263(int i) {
	if (aBool2333 && i >= 0)
	    method4232(i, false, 1848393628);
    }
    
    public void method4264(int i, int i_69_) {
	Class229 class229 = (Class229) aHashMap2344.get(Integer.valueOf(i));
	if (class229 != null) {
	    List list = class229.method4195(-662556192);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		class491.method8012(-1720662844);
	    }
	}
    }
    
    public void method4265(int i, int i_70_) {
	if (!aBool2333) {
	    anInt2342 = i * 271243903;
	    aClass203_2355 = new Class203(i_70_, 100);
	    aClass203_2339 = new Class203(10);
	    aClass203_2355.method3870(new Class188(this), (byte) -71);
	    Class652 class652 = new Class652(Class376.aClass376_3910);
	    Class580.method9813(class652, 394792010);
	    method4224(16777472);
	    anInt2332 = 794851075;
	    aBool2333 = true;
	}
    }
    
    public Class491 method4266
	(Class211 class211, Object object, int i, int i_71_, int i_72_,
	 int i_73_, Class207 class207, float f, float f_74_, Class438 class438,
	 int i_75_, int i_76_, boolean bool) {
	if (!aBool2333)
	    return null;
	if (object == null)
	    return null;
	i_72_ = Math.max(0, Math.min(i_72_, 255));
	i_76_ = Math.max(0, i_76_);
	if (Class207.aClass207_2235 != class207
	    && !method4238(aClass438_2343, class438, f_74_, 209157995))
	    return null;
	if (i_76_ <= 0)
	    i_76_ = 255;
	float f_77_ = (float) i_72_ / 255.0F;
	float f_78_ = (float) i_76_ / 255.0F;
	Interface70 interface70 = method4232(i, bool, -573998830);
	Class491 class491 = method4233(interface70, (byte) -27);
	if (null == class491)
	    return null;
	class491.method8008(object, 2145275656);
	class491.method8025(i_73_, (byte) 77);
	if (Class207.aClass207_2235 != class207) {
	    class491.method8026(true, (byte) -119);
	    class491.method8028(class438, (byte) 67);
	    class491.method8032(f, 1009861768);
	    class491.method8033(f_74_, (byte) -41);
	    if (Class207.aClass207_2234 == class207)
		class491.method8017(anInterface58_2353, -359487251);
	    else if (class207 == Class207.aClass207_2237)
		class491.method8017(anInterface58_2347, 345091499);
	    else if (Class207.aClass207_2236 == class207)
		class491.method8017(anInterface58_2326, 379574000);
	    else if (class207 == Class207.aClass207_2238)
		class491.method8017(anInterface58_2354, -504898660);
	    else
		class491.method8026(false, (byte) -37);
	}
	class491.method8037(f_77_, 0, 1994656294);
	class491.method8038(i_71_ > 1 || i_71_ < 0,
			    i_71_ > 0 ? i_71_ - 1 : i_71_, -718906463);
	class491.method8039(f_78_, (byte) -116);
	class491.method8022(class211, (byte) -21);
	return class491;
    }
    
    public void method4267() {
	if (aBool2333) {
	    Class213.method4023(-1441650723);
	    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null
		&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807()
		    != null)) {
		if (aClass438_2343 == null)
		    aClass438_2343 = new Class438();
		aClass438_2343.aFloat4864
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885.aFloat4864);
		aClass438_2343.aFloat4863 = 0.0F;
		aClass438_2343.aFloat4865
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885.aFloat4865);
	    }
	    Iterator iterator = aHashMap2336.values().iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		interface70.method446((byte) -118);
	    }
	    iterator = aHashMap2337.values().iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		interface70.method446((byte) -31);
	    }
	    iterator = aList2338.iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		if (interface70.method445((byte) 58))
		    aHashMap2337.remove
			(Integer.valueOf(interface70.method30(2030362463)));
		else
		    aHashMap2336.remove
			(Integer.valueOf(interface70.method30(1616267841)));
	    }
	    aList2338.clear();
	    if (aClass491_2348 != null
		&& (aClass491_2348.method8027((byte) 2)
		    == Class480.aClass480_5254)
		&& false == aBool2335
		&& client.aClass100_11264.aClass13_1183 != null
		&& Class44_Sub22.method17372(-1850530127 * client.anInt11039,
					     -1167727292)) {
		Class534_Sub19 class534_sub19
		    = Class346.method6128(Class404.aClass404_4199,
					  client.aClass100_11264.aClass13_1183,
					  1341391005);
		class534_sub19.aClass534_Sub40_Sub1_10513.method16510
		    (aClass491_2348.method8040((byte) 101)
			 .method30(1727511668),
		     -1003359145);
		client.aClass100_11264.method1863(class534_sub19, (byte) 42);
		aBool2335 = true;
	    }
	    iterator = aList2334.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		class491.method8036(1263045415);
		class491.method8064(1482307257);
		Class480 class480 = class491.method8027((byte) 2);
		if (class491.method8021(-997557625) == this) {
		    if (Class480.aClass480_5257 == class480
			|| Class480.aClass480_5253 == class480) {
			if ((class491.method8023((byte) 82)
			     == Class211.aClass211_2257)
			    || (class491.method8023((byte) 29)
				== Class211.aClass211_2247)) {
			    if (aClass491_2348 == class491) {
				aBool2335 = false;
				aClass491_2348 = null;
				class491.method8030((byte) -47);
				aList2352.remove(class491);
			    } else {
				int i = class491.method8040((byte) 45)
					    .method30(587666589);
				boolean bool
				    = (method4227(Class190.aClass190_2135
						      .method3763(814921246),
						  -457431560)
				       > 0.0F);
				if (false == aBool2351 && bool) {
				    if (i == anInt2332 * -1966156715) {
					method4242(i, -1931824308);
					anInt2332 = 794851075;
				    }
				    class491.method8030((byte) -19);
				    aList2352.remove(class491);
				} else if (1867711623 * anInt2350 == i) {
				    anInt2350 = 1685159625;
				    aBool2351 = false;
				    class491.method8030((byte) -78);
				    aList2352.remove(class491);
				    Iterator iterator_79_
					= aList2334.iterator();
				    while (iterator_79_.hasNext()) {
					Class491 class491_80_
					    = (Class491) iterator_79_.next();
					if (class491_80_.method8023((byte) 120)
					    == Class211.aClass211_2257) {
					    int i_81_
						= class491_80_.method8040
						      ((byte) 15)
						      .method30(1438734934);
					    if (((i_81_
						  == anInt2332 * -1966156715)
						 && (class491_80_
							 .method8027((byte) 2)
						     == (Class480
							 .aClass480_5257)))
						|| (class491_80_
							.method8027((byte) 2)
						    == Class480.aClass480_5256)
						|| (class491_80_
							.method8027((byte) 2)
						    == Class480.aClass480_5251)
						|| (class491_80_
							.method8027((byte) 2)
						    == (Class480
							.aClass480_5254))) {
						if (class491_80_
							.method8027((byte) 2)
						    == Class480.aClass480_5257)
						    class491_80_.method8016
							(1760613600);
						else
						    class491_80_.method8069
							(2123227269);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (false == aBool2351
					|| -1966156715 * anInt2332 != i) {
					class491.method8030((byte) -31);
					aList2352.remove(class491);
				    }
				    if (false == aBool2351
					&& i == anInt2332 * -1966156715) {
					anInt2332 = 794851075;
					aClass491_2346 = null;
				    }
				}
			    }
			} else {
			    Iterator iterator_82_
				= aHashMap2344.keySet().iterator();
			    while (iterator_82_.hasNext()) {
				int i = ((Integer) iterator_82_.next())
					    .intValue();
				Class229 class229
				    = ((Class229)
				       aHashMap2344.get(Integer.valueOf(i)));
				if (class229.method4195(1208860245)
					.contains(class491)) {
				    class229.method4193(class491, 2103371498);
				    break;
				}
			    }
			    class491.method8030((byte) -118);
			    aList2352.remove(class491);
			}
		    } else if ((class491.method8027((byte) 2)
				!= Class480.aClass480_5258)
			       && (class491.method8034(956205949)
				   == Class190.aClass190_2135
					  .method3763(-1816795347))) {
			boolean bool = (method4227(Class190.aClass190_2135
						       .method3763(1958362959),
						   531558563)
					> 1.0E-4F);
			if (!bool)
			    class491.method8014(150, 1962988118);
		    }
		}
	    }
	}
    }
    
    public int method4268(byte i) {
	return anInt2332 * -1966156715;
    }
    
    boolean method4269(Class438 class438, Class438 class438_83_, float f) {
	Class438 class438_84_ = Class438.method7055(class438_83_, class438);
	if (class438_84_.method7012() >= f)
	    return false;
	return true;
    }
    
    public void method4270(byte i) {
	if (aBool2333) {
	    Class213.method4023(-1622806387);
	    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null
		&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807()
		    != null)) {
		if (aClass438_2343 == null)
		    aClass438_2343 = new Class438();
		aClass438_2343.aFloat4864
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885.aFloat4864);
		aClass438_2343.aFloat4863 = 0.0F;
		aClass438_2343.aFloat4865
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885.aFloat4865);
	    }
	    Iterator iterator = aHashMap2336.values().iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		interface70.method446((byte) -58);
	    }
	    iterator = aHashMap2337.values().iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		interface70.method446((byte) -102);
	    }
	    iterator = aList2338.iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		if (interface70.method445((byte) 48))
		    aHashMap2337.remove
			(Integer.valueOf(interface70.method30(599582970)));
		else
		    aHashMap2336.remove
			(Integer.valueOf(interface70.method30(130555354)));
	    }
	    aList2338.clear();
	    if (aClass491_2348 != null
		&& (aClass491_2348.method8027((byte) 2)
		    == Class480.aClass480_5254)
		&& false == aBool2335
		&& client.aClass100_11264.aClass13_1183 != null
		&& Class44_Sub22.method17372(-1850530127 * client.anInt11039,
					     -323870947)) {
		Class534_Sub19 class534_sub19
		    = Class346.method6128(Class404.aClass404_4199,
					  client.aClass100_11264.aClass13_1183,
					  1341391005);
		class534_sub19.aClass534_Sub40_Sub1_10513.method16510
		    (aClass491_2348.method8040((byte) 86).method30(1033508088),
		     -612512610);
		client.aClass100_11264.method1863(class534_sub19, (byte) 57);
		aBool2335 = true;
	    }
	    iterator = aList2334.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		class491.method8036(1920462761);
		class491.method8064(1127996589);
		Class480 class480 = class491.method8027((byte) 2);
		if (class491.method8021(185617658) == this) {
		    if (Class480.aClass480_5257 == class480
			|| Class480.aClass480_5253 == class480) {
			if ((class491.method8023((byte) 115)
			     == Class211.aClass211_2257)
			    || (class491.method8023((byte) 105)
				== Class211.aClass211_2247)) {
			    if (aClass491_2348 == class491) {
				aBool2335 = false;
				aClass491_2348 = null;
				class491.method8030((byte) -124);
				aList2352.remove(class491);
			    } else {
				int i_85_ = class491.method8040((byte) 21)
						.method30(1864243578);
				boolean bool
				    = (method4227(Class190.aClass190_2135
						      .method3763(-75419155),
						  -626629117)
				       > 0.0F);
				if (false == aBool2351 && bool) {
				    if (i_85_ == anInt2332 * -1966156715) {
					method4242(i_85_, -1931824308);
					anInt2332 = 794851075;
				    }
				    class491.method8030((byte) -86);
				    aList2352.remove(class491);
				} else if (1867711623 * anInt2350 == i_85_) {
				    anInt2350 = 1685159625;
				    aBool2351 = false;
				    class491.method8030((byte) -22);
				    aList2352.remove(class491);
				    Iterator iterator_86_
					= aList2334.iterator();
				    while (iterator_86_.hasNext()) {
					Class491 class491_87_
					    = (Class491) iterator_86_.next();
					if (class491_87_.method8023((byte) 50)
					    == Class211.aClass211_2257) {
					    int i_88_
						= class491_87_.method8040
						      ((byte) 70)
						      .method30(1701695544);
					    if (((i_88_
						  == anInt2332 * -1966156715)
						 && (class491_87_
							 .method8027((byte) 2)
						     == (Class480
							 .aClass480_5257)))
						|| (class491_87_
							.method8027((byte) 2)
						    == Class480.aClass480_5256)
						|| (class491_87_
							.method8027((byte) 2)
						    == Class480.aClass480_5251)
						|| (class491_87_
							.method8027((byte) 2)
						    == (Class480
							.aClass480_5254))) {
						if (class491_87_
							.method8027((byte) 2)
						    == Class480.aClass480_5257)
						    class491_87_.method8016
							(1760613600);
						else
						    class491_87_.method8069
							(2111098121);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (false == aBool2351
					|| -1966156715 * anInt2332 != i_85_) {
					class491.method8030((byte) -41);
					aList2352.remove(class491);
				    }
				    if (false == aBool2351
					&& i_85_ == anInt2332 * -1966156715) {
					anInt2332 = 794851075;
					aClass491_2346 = null;
				    }
				}
			    }
			} else {
			    Iterator iterator_89_
				= aHashMap2344.keySet().iterator();
			    while (iterator_89_.hasNext()) {
				int i_90_ = ((Integer) iterator_89_.next())
						.intValue();
				Class229 class229
				    = ((Class229)
				       aHashMap2344
					   .get(Integer.valueOf(i_90_)));
				if (class229.method4195(-690164864)
					.contains(class491)) {
				    class229.method4193(class491, 2141029321);
				    break;
				}
			    }
			    class491.method8030((byte) -26);
			    aList2352.remove(class491);
			}
		    } else if ((class491.method8027((byte) 2)
				!= Class480.aClass480_5258)
			       && (class491.method8034(1946459514)
				   == Class190.aClass190_2135
					  .method3763(-753799005))) {
			boolean bool = (method4227(Class190.aClass190_2135
						       .method3763(701170323),
						   -664345135)
					> 1.0E-4F);
			if (!bool)
			    class491.method8014(150, 1962988118);
		    }
		}
	    }
	}
    }
    
    public void method4271() {
	Class493.method8118(1569071429);
    }
    
    public void method4272() {
	if (aBool2333) {
	    Class213.method4023(-1421203180);
	    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null
		&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807()
		    != null)) {
		if (aClass438_2343 == null)
		    aClass438_2343 = new Class438();
		aClass438_2343.aFloat4864
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885.aFloat4864);
		aClass438_2343.aFloat4863 = 0.0F;
		aClass438_2343.aFloat4865
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885.aFloat4865);
	    }
	    Iterator iterator = aHashMap2336.values().iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		interface70.method446((byte) -19);
	    }
	    iterator = aHashMap2337.values().iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		interface70.method446((byte) -45);
	    }
	    iterator = aList2338.iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		if (interface70.method445((byte) 118))
		    aHashMap2337.remove
			(Integer.valueOf(interface70.method30(109764542)));
		else
		    aHashMap2336.remove
			(Integer.valueOf(interface70.method30(-144103319)));
	    }
	    aList2338.clear();
	    if (aClass491_2348 != null
		&& (aClass491_2348.method8027((byte) 2)
		    == Class480.aClass480_5254)
		&& false == aBool2335
		&& client.aClass100_11264.aClass13_1183 != null
		&& Class44_Sub22.method17372(-1850530127 * client.anInt11039,
					     -1370642413)) {
		Class534_Sub19 class534_sub19
		    = Class346.method6128(Class404.aClass404_4199,
					  client.aClass100_11264.aClass13_1183,
					  1341391005);
		class534_sub19.aClass534_Sub40_Sub1_10513.method16510
		    (aClass491_2348.method8040((byte) 107).method30(-30654115),
		     -1103785402);
		client.aClass100_11264.method1863(class534_sub19, (byte) 18);
		aBool2335 = true;
	    }
	    iterator = aList2334.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		class491.method8036(-1409917906);
		class491.method8064(544600915);
		Class480 class480 = class491.method8027((byte) 2);
		if (class491.method8021(-1373262570) == this) {
		    if (Class480.aClass480_5257 == class480
			|| Class480.aClass480_5253 == class480) {
			if ((class491.method8023((byte) 47)
			     == Class211.aClass211_2257)
			    || (class491.method8023((byte) 20)
				== Class211.aClass211_2247)) {
			    if (aClass491_2348 == class491) {
				aBool2335 = false;
				aClass491_2348 = null;
				class491.method8030((byte) -102);
				aList2352.remove(class491);
			    } else {
				int i = class491.method8040((byte) 41)
					    .method30(1801388762);
				boolean bool
				    = (method4227(Class190.aClass190_2135
						      .method3763(-1783699342),
						  -1811257630)
				       > 0.0F);
				if (false == aBool2351 && bool) {
				    if (i == anInt2332 * -1966156715) {
					method4242(i, -1931824308);
					anInt2332 = 794851075;
				    }
				    class491.method8030((byte) -58);
				    aList2352.remove(class491);
				} else if (1867711623 * anInt2350 == i) {
				    anInt2350 = 1685159625;
				    aBool2351 = false;
				    class491.method8030((byte) -6);
				    aList2352.remove(class491);
				    Iterator iterator_91_
					= aList2334.iterator();
				    while (iterator_91_.hasNext()) {
					Class491 class491_92_
					    = (Class491) iterator_91_.next();
					if (class491_92_.method8023((byte) 120)
					    == Class211.aClass211_2257) {
					    int i_93_
						= class491_92_.method8040
						      ((byte) 116)
						      .method30(-21525687);
					    if (((i_93_
						  == anInt2332 * -1966156715)
						 && (class491_92_
							 .method8027((byte) 2)
						     == (Class480
							 .aClass480_5257)))
						|| (class491_92_
							.method8027((byte) 2)
						    == Class480.aClass480_5256)
						|| (class491_92_
							.method8027((byte) 2)
						    == Class480.aClass480_5251)
						|| (class491_92_
							.method8027((byte) 2)
						    == (Class480
							.aClass480_5254))) {
						if (class491_92_
							.method8027((byte) 2)
						    == Class480.aClass480_5257)
						    class491_92_.method8016
							(1760613600);
						else
						    class491_92_.method8069
							(2146302202);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (false == aBool2351
					|| -1966156715 * anInt2332 != i) {
					class491.method8030((byte) -45);
					aList2352.remove(class491);
				    }
				    if (false == aBool2351
					&& i == anInt2332 * -1966156715) {
					anInt2332 = 794851075;
					aClass491_2346 = null;
				    }
				}
			    }
			} else {
			    Iterator iterator_94_
				= aHashMap2344.keySet().iterator();
			    while (iterator_94_.hasNext()) {
				int i = ((Integer) iterator_94_.next())
					    .intValue();
				Class229 class229
				    = ((Class229)
				       aHashMap2344.get(Integer.valueOf(i)));
				if (class229.method4195(-870577429)
					.contains(class491)) {
				    class229.method4193(class491, 2067726836);
				    break;
				}
			    }
			    class491.method8030((byte) -17);
			    aList2352.remove(class491);
			}
		    } else if ((class491.method8027((byte) 2)
				!= Class480.aClass480_5258)
			       && (class491.method8034(-98238378)
				   == Class190.aClass190_2135
					  .method3763(-1069735064))) {
			boolean bool = method4227(Class190.aClass190_2135
						      .method3763(-1017533217),
						  831121149) > 1.0E-4F;
			if (!bool)
			    class491.method8014(150, 1962988118);
		    }
		}
	    }
	}
    }
    
    public int method4273() {
	return anInt2349 * -1611391441;
    }
    
    public void method4274(int i, int i_95_, boolean bool, int i_96_,
			   int i_97_, int i_98_, int i_99_, int i_100_,
			   int i_101_) {
	if (aBool2333 && i != anInt2332 * -1966156715) {
	    if (aBool2351 && aClass491_2346 != null
		&& i != anInt2332 * -1966156715) {
		aClass491_2346.method8016(1760613600);
		aClass491_2346.method8030((byte) -55);
		aList2352.remove(aClass491_2346);
	    }
	    Class491 class491 = method4246((short) -995);
	    if (class491 != null
		&& class491.method8040((byte) 59).method30(1499433925) == i) {
		aClass491_2346 = class491;
		anInt2332
		    = (class491.method8040((byte) 73).method30(1805552808)
		       * -794851075);
	    } else {
		boolean bool_102_ = false;
		if (-1966156715 * anInt2332 >= 0) {
		    Iterator iterator = aList2352.iterator();
		    while (iterator.hasNext()) {
			Class491 class491_103_ = (Class491) iterator.next();
			if (class491_103_.method8023((byte) 93)
			    == Class211.aClass211_2257) {
			    class491_103_.method8014(2000, 1962988118);
			    bool_102_ = true;
			}
		    }
		}
		aClass491_2346 = null;
		anInt2332 = 794851075;
		Class491 class491_104_ = null;
		if (aClass491_2348 != null
		    && aClass491_2348.method8040((byte) 67) != null
		    && aClass491_2348.method8040((byte) 83)
			   .method30(153592277) == i
		    && (aClass491_2348.method8027((byte) 2)
			== Class480.aClass480_5254)) {
		    class491_104_ = aClass491_2348;
		    aClass491_2348 = null;
		    aBool2335 = false;
		}
		if (class491_104_ == null) {
		    if (bool) {
			float f = (float) i_99_;
			float f_105_ = (float) i_100_;
			Class438 class438
			    = new Class438((float) i_97_, 0.0F, (float) i_98_);
			class491_104_
			    = method4229(Class211.aClass211_2257, this, i, 0,
					 bool_102_ ? 0 : i_95_,
					 (-1611391441 * anInt2349 == i
					  ? Class198.aClass198_2164
						.method3824((byte) 0)
					  : Class190.aClass190_2135
						.method3763(1194316828)),
					 Class207.aClass207_2238, f, f_105_,
					 class438, i_96_, 255, true,
					 245701398);
		    } else
			class491_104_
			    = method4229(Class211.aClass211_2257, this, i, 0,
					 bool_102_ ? 0 : i_95_,
					 (i == anInt2349 * -1611391441
					  ? Class198.aClass198_2164
						.method3824((byte) 0)
					  : Class190.aClass190_2135
						.method3763(-1388483883)),
					 Class207.aClass207_2235, 0.0F, 0.0F,
					 null, 0, 255, true, -365549690);
		}
		if (null != class491_104_) {
		    if (bool_102_) {
			float f = (float) i_95_ / 255.0F;
			class491_104_.method8037(f, 2000, 1699237143);
		    }
		    class491_104_.method8069(1991080711);
		    method4234(class491_104_, -406210760);
		    aClass491_2346 = class491_104_;
		    anInt2332 = -794851075 * i;
		    if (aBool2351)
			aClass491_2346.method8015((byte) 1);
		    if (client.aClass100_11264.aClass13_1183 != null
			&& Class44_Sub22.method17372((-1850530127
						      * client.anInt11039),
						     -535951513)) {
			Class534_Sub19 class534_sub19
			    = Class346.method6128(Class404.aClass404_4199,
						  (client.aClass100_11264
						   .aClass13_1183),
						  1341391005);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16510(anInt2332 * -1966156715, -551679829);
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 107);
		    }
		}
	    }
	}
    }
    
    List method4275() {
	return aList2338;
    }
    
    public void method4276(Class491 class491, int i, int i_106_) {
	if (null != class491) {
	    Class229 class229
		= (Class229) aHashMap2344.get(Integer.valueOf(i));
	    if (null == class229) {
		class229 = new Class229(this);
		aHashMap2344.put(Integer.valueOf(i), class229);
	    }
	    if (!class229.method4194(class491, 31645619)) {
		class491.method8018(i_106_, true, (byte) 5);
		class229.method4192(class491, -661714523);
	    }
	}
    }
    
    public void method4277(int i, int i_107_) {
	if (aBool2333 && (!aBool2351 || 1867711623 * anInt2350 != i)) {
	    if (aBool2351 && i != anInt2350 * 1867711623) {
		Iterator iterator = aList2334.iterator();
		while (iterator.hasNext()) {
		    Class491 class491 = (Class491) iterator.next();
		    if (class491.method8023((byte) 82)
			== Class211.aClass211_2247) {
			class491.method8030((byte) -113);
			aList2352.remove(class491);
			aBool2351 = false;
			break;
		    }
		}
	    }
	    if (0 != i_107_ && i != -1) {
		if (!aBool2351 && null != aClass491_2346)
		    aClass491_2346.method8015((byte) 1);
		Class491 class491
		    = method4229(Class211.aClass211_2247, this, i, 0, i_107_,
				 Class190.aClass190_2135.method3763(15020464),
				 Class207.aClass207_2235, 0.0F, 0.0F, null, 0,
				 255, true, 313587378);
		if (class491 != null) {
		    class491.method8069(1964830385);
		    method4234(class491, 932819250);
		    aBool2351 = true;
		    anInt2350 = i * -1685159625;
		}
	    }
	}
    }
    
    public void method4278(int i) {
	Class229 class229 = (Class229) aHashMap2344.get(Integer.valueOf(i));
	if (null != class229) {
	    List list = class229.method4195(681791243);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		if (!class491.method8035(-521691877))
		    class491.method8069(2116352217);
	    }
	}
    }
    
    public void method4279(Class205 class205, int i) {
	if (null != class205 && null != class205.anIntArrayArray2215
	    && i < class205.anIntArrayArray2215.length
	    && class205.anIntArrayArray2215[i] != null) {
	    int i_108_ = class205.anIntArrayArray2215[i][0];
	    int i_109_ = i_108_ >> 8;
	    int i_110_ = i_108_ >> 5 & 0x7;
	    if (class205.anIntArrayArray2215[i].length > 1) {
		int i_111_ = (int) (Math.random()
				    * (double) (class205.anIntArrayArray2215
						[i]).length);
		if (i_111_ > 0)
		    i_109_ = class205.anIntArrayArray2215[i][i_111_];
	    }
	    int i_112_ = 256;
	    if (null != class205.anIntArray2227
		&& class205.anIntArray2226 != null)
		i_112_ = (int) ((double) class205.anIntArray2227[i]
				+ (Math.random()
				   * (double) (class205.anIntArray2226[i]
					       - class205.anIntArray2227[i])));
	    int i_113_ = (class205.anIntArray2216 == null ? 255
			  : class205.anIntArray2216[i]);
	    method4237(Class211.aClass211_2256, i_109_, i_110_, i_113_,
		       Class190.aClass190_2130.method3763(-1430471677),
		       Class207.aClass207_2235, 0.0F, 0.0F, null, 0, i_112_, 0,
		       (byte) 60);
	}
    }
    
    public void method4280(int i) {
	Class229 class229 = (Class229) aHashMap2344.get(Integer.valueOf(i));
	if (class229 != null) {
	    List list = class229.method4195(-1487161506);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		class491.method8014(50, 1962988118);
	    }
	}
    }
    
    public void method4281(int i) {
	Class229 class229 = (Class229) aHashMap2344.get(Integer.valueOf(i));
	if (class229 != null) {
	    List list = class229.method4195(744758327);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		class491.method8012(-1720662844);
	    }
	}
    }
    
    public void method4282(int i) {
	Class229 class229 = (Class229) aHashMap2344.get(Integer.valueOf(i));
	if (class229 != null) {
	    List list = class229.method4195(501146602);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		class491.method8012(-1720662844);
	    }
	}
    }
    
    List method4283(byte i) {
	return aList2352;
    }
    
    void method4284() {
	Class197 class197 = new Class197(this);
	Class231 class231 = new Class231(this);
	Class222 class222 = new Class222(this);
	Class221 class221 = new Class221(this);
	Class223 class223 = new Class223(this);
	Class620.method10274(Class198.aClass198_2167.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     0.2F, class197, 1990828197);
	Class620.method10274(Class198.aClass198_2166.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class231, 2132043474);
	Class620.method10274(Class198.aClass198_2164.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class222, 2080392513);
	Class620.method10274(Class198.aClass198_2168.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     0.8F, class221, 2010513230);
	Class620.method10274(Class198.aClass198_2169.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class223, 2129016334);
	Class620.method10274(Class190.aClass190_2135.method3763(1764358505),
			     Class198.aClass198_2166.method3824((byte) 0),
			     1.0F, null, 2062904682);
	Class620.method10274(Class190.aClass190_2128.method3763(1109769534),
			     Class198.aClass198_2169.method3824((byte) 0),
			     1.0F, null, 2052968787);
	Class620.method10274(Class190.aClass190_2134.method3763(565821641),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2074273797);
	Class620.method10274(Class190.aClass190_2129.method3763(-984401048),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2029276048);
	Class620.method10274(Class190.aClass190_2130.method3763(-769763531),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2128991539);
	Class620.method10274(Class190.aClass190_2131.method3763(-1043199639),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2055104363);
	Class620.method10274(Class190.aClass190_2132.method3763(-1712330181),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2026760171);
	Class620.method10274(Class190.aClass190_2133.method3763(-1877845163),
			     Class198.aClass198_2168.method3824((byte) 0),
			     1.0F, null, 2101842699);
	Class620.method10274(Class190.aClass190_2136.method3763(-5590801),
			     Class190.aClass190_2133.method3763(-1169457455),
			     1.0F, null, 2106869523);
	Class620.method10274(Class190.aClass190_2127.method3763(1951653687),
			     Class190.aClass190_2133.method3763(-358299941),
			     1.0F, null, 2135659867);
	Class662.method10994
	    (Class190.aClass190_2135.method3763(1232633376), (byte) 1)
	    .method6520(0.75F, (byte) -112);
    }
    
    public void method4285(int i, int i_114_, byte i_115_) {
	if (!aBool2333) {
	    anInt2342 = i * 271243903;
	    aClass203_2355 = new Class203(i_114_, 100);
	    aClass203_2339 = new Class203(10);
	    aClass203_2355.method3870(new Class188(this), (byte) -47);
	    Class652 class652 = new Class652(Class376.aClass376_3910);
	    Class580.method9813(class652, 232142523);
	    method4224(16777472);
	    anInt2332 = 794851075;
	    aBool2333 = true;
	}
    }
    
    void method4286() {
	Class197 class197 = new Class197(this);
	Class231 class231 = new Class231(this);
	Class222 class222 = new Class222(this);
	Class221 class221 = new Class221(this);
	Class223 class223 = new Class223(this);
	Class620.method10274(Class198.aClass198_2167.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     0.2F, class197, 2102646368);
	Class620.method10274(Class198.aClass198_2166.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class231, 1996578536);
	Class620.method10274(Class198.aClass198_2164.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class222, 2142215318);
	Class620.method10274(Class198.aClass198_2168.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     0.8F, class221, 2035054397);
	Class620.method10274(Class198.aClass198_2169.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class223, 2020388867);
	Class620.method10274(Class190.aClass190_2135.method3763(-905108279),
			     Class198.aClass198_2166.method3824((byte) 0),
			     1.0F, null, 2127978699);
	Class620.method10274(Class190.aClass190_2128.method3763(-502698875),
			     Class198.aClass198_2169.method3824((byte) 0),
			     1.0F, null, 1988383288);
	Class620.method10274(Class190.aClass190_2134.method3763(1267599080),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2003095624);
	Class620.method10274(Class190.aClass190_2129.method3763(-594363476),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2014291611);
	Class620.method10274(Class190.aClass190_2130.method3763(-134706906),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2123218500);
	Class620.method10274(Class190.aClass190_2131.method3763(-494413287),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2020442863);
	Class620.method10274(Class190.aClass190_2132.method3763(1434369332),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2081757077);
	Class620.method10274(Class190.aClass190_2133.method3763(616617838),
			     Class198.aClass198_2168.method3824((byte) 0),
			     1.0F, null, 2026081453);
	Class620.method10274(Class190.aClass190_2136.method3763(1663647571),
			     Class190.aClass190_2133.method3763(-2124518299),
			     1.0F, null, 2131450816);
	Class620.method10274(Class190.aClass190_2127.method3763(-666293588),
			     Class190.aClass190_2133.method3763(-619556953),
			     1.0F, null, 2091882973);
	Class662.method10994
	    (Class190.aClass190_2135.method3763(-764214627), (byte) 1)
	    .method6520(0.75F, (byte) -40);
    }
    
    public void method4287(int i, int i_116_, int i_117_) {
	int i_118_ = Class198.aClass198_2165.method3824((byte) 0);
	if (Class662.method10994(i, (byte) 1) == null
	    && (i_118_ == i_116_
		|| Class662.method10994(i_116_, (byte) 1) != null)) {
	    float f = 1.5258789E-5F * (float) i_117_;
	    Class620.method10274(i, i_116_ == i_118_ ? -1 : i_116_, f, null,
				 2057585988);
	}
    }
    
    public void method4288(int i, int i_119_) {
	Class388 class388 = Class662.method10994(i, (byte) 1);
	if (null != class388) {
	    float f = 1.5258789E-5F * (float) i_119_;
	    class388.method6520(f, (byte) 3);
	}
    }
    
    public void method4289(int i, int i_120_) {
	Class388 class388 = Class662.method10994(i, (byte) 1);
	if (null != class388) {
	    float f = 1.5258789E-5F * (float) i_120_;
	    class388.method6520(f, (byte) -30);
	}
    }
    
    public void method4290() {
	Class493.method8118(316835605);
    }
    
    public void method4291(int i, int i_121_) {
	if (aBool2333 && (!aBool2351 || 1867711623 * anInt2350 != i)) {
	    if (aBool2351 && i != anInt2350 * 1867711623) {
		Iterator iterator = aList2334.iterator();
		while (iterator.hasNext()) {
		    Class491 class491 = (Class491) iterator.next();
		    if (class491.method8023((byte) 89)
			== Class211.aClass211_2247) {
			class491.method8030((byte) -90);
			aList2352.remove(class491);
			aBool2351 = false;
			break;
		    }
		}
	    }
	    if (0 != i_121_ && i != -1) {
		if (!aBool2351 && null != aClass491_2346)
		    aClass491_2346.method8015((byte) 1);
		Class491 class491
		    = method4229(Class211.aClass211_2247, this, i, 0, i_121_,
				 Class190.aClass190_2135.method3763(398231194),
				 Class207.aClass207_2235, 0.0F, 0.0F, null, 0,
				 255, true, 1274927453);
		if (class491 != null) {
		    class491.method8069(2114486139);
		    method4234(class491, 513703932);
		    aBool2351 = true;
		    anInt2350 = i * -1685159625;
		}
	    }
	}
    }
    
    float method4292(int i) {
	Class388 class388 = Class662.method10994(i, (byte) 1);
	float f = 1.0F;
	for (/**/; null != class388;
	     class388 = class388.method6512(-2075814524))
	    f *= class388.method6511(-1164023876);
	return f;
    }
    
    void method4293(int[] is) {
	if (aBool2333 && is != null) {
	    int[] is_122_ = is;
	    for (int i = 0; i < is_122_.length; i++) {
		int i_123_ = is_122_[i];
		method4230(i_123_, -1625174626);
	    }
	}
    }
    
    void method4294() {
	Class197 class197 = new Class197(this);
	Class231 class231 = new Class231(this);
	Class222 class222 = new Class222(this);
	Class221 class221 = new Class221(this);
	Class223 class223 = new Class223(this);
	Class620.method10274(Class198.aClass198_2167.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     0.2F, class197, 2089585365);
	Class620.method10274(Class198.aClass198_2166.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class231, 2095392094);
	Class620.method10274(Class198.aClass198_2164.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class222, 2142746225);
	Class620.method10274(Class198.aClass198_2168.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     0.8F, class221, 2121830607);
	Class620.method10274(Class198.aClass198_2169.method3824((byte) 0),
			     Class198.aClass198_2165.method3824((byte) 0),
			     1.0F, class223, 2014478363);
	Class620.method10274(Class190.aClass190_2135.method3763(-1760264542),
			     Class198.aClass198_2166.method3824((byte) 0),
			     1.0F, null, 2064818544);
	Class620.method10274(Class190.aClass190_2128.method3763(251806989),
			     Class198.aClass198_2169.method3824((byte) 0),
			     1.0F, null, 2036473929);
	Class620.method10274(Class190.aClass190_2134.method3763(-2133419856),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2060788498);
	Class620.method10274(Class190.aClass190_2129.method3763(-1354264835),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2094145722);
	Class620.method10274(Class190.aClass190_2130.method3763(402328361),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2036222065);
	Class620.method10274(Class190.aClass190_2131.method3763(935992083),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2072793392);
	Class620.method10274(Class190.aClass190_2132.method3763(-1414332924),
			     Class198.aClass198_2167.method3824((byte) 0),
			     1.0F, null, 2121337668);
	Class620.method10274(Class190.aClass190_2133.method3763(1737562959),
			     Class198.aClass198_2168.method3824((byte) 0),
			     1.0F, null, 2090349466);
	Class620.method10274(Class190.aClass190_2136.method3763(568585244),
			     Class190.aClass190_2133.method3763(1337352277),
			     1.0F, null, 2112005468);
	Class620.method10274(Class190.aClass190_2127.method3763(1177080821),
			     Class190.aClass190_2133.method3763(1422622398),
			     1.0F, null, 2034584805);
	Class662.method10994
	    (Class190.aClass190_2135.method3763(-1916557936), (byte) 1)
	    .method6520(0.75F, (byte) -53);
    }
    
    public void method4295(int i) {
	if (aBool2333 && i >= 0)
	    method4232(i, false, -2041500336);
    }
    
    public void method4296(int i) {
	Class229 class229 = (Class229) aHashMap2344.get(Integer.valueOf(i));
	if (class229 != null) {
	    List list = class229.method4195(-381018388);
	    Iterator iterator = list.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		class491.method8014(50, 1962988118);
	    }
	}
    }
    
    Interface70 method4297(int i, boolean bool) {
	if (!aBool2333)
	    return null;
	Interface70 interface70
	    = (Interface70) (bool ? aClass203_2339.method3871((long) i)
			     : aClass203_2355.method3871((long) i));
	if (null == interface70) {
	    if (bool)
		interface70
		    = (Interface70) aHashMap2337.get(Integer.valueOf(i));
	    else
		interface70
		    = (Interface70) aHashMap2336.get(Integer.valueOf(i));
	}
	return interface70;
    }
    
    Interface70 method4298(int i, boolean bool) {
	if (!aBool2333)
	    return null;
	Interface70 interface70 = method4324(i, bool, -360053922);
	if (null == interface70) {
	    Class215 class215 = new Class215(this);
	    interface70
		= Class227.method4182((bool ? Class63.aClass472_654
				       : Class601_Sub1.aClass472_10877),
				      i, class215, bool, aClass203_2340,
				      862704844);
	    if (bool)
		aHashMap2337.put(Integer.valueOf(i), interface70);
	    else
		aHashMap2336.put(Integer.valueOf(i), interface70);
	}
	return interface70;
    }
    
    public void method4299(Class491 class491, int i, int i_124_) {
	if (null != class491) {
	    Class229 class229
		= (Class229) aHashMap2344.get(Integer.valueOf(i));
	    if (null == class229) {
		class229 = new Class229(this);
		aHashMap2344.put(Integer.valueOf(i), class229);
	    }
	    if (!class229.method4194(class491, 31645619)) {
		class491.method8018(i_124_, true, (byte) 5);
		class229.method4192(class491, -661714523);
	    }
	}
    }
    
    public void method4300(Class491 class491) {
	class491.method8008(this, 1960864274);
	aList2352.add(class491);
    }
    
    public void method4301() {
	if (aBool2333) {
	    Class213.method4023(-834047531);
	    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null
		&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807()
		    != null)) {
		if (aClass438_2343 == null)
		    aClass438_2343 = new Class438();
		aClass438_2343.aFloat4864
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885.aFloat4864);
		aClass438_2343.aFloat4863 = 0.0F;
		aClass438_2343.aFloat4865
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885.aFloat4865);
	    }
	    Iterator iterator = aHashMap2336.values().iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		interface70.method446((byte) -50);
	    }
	    iterator = aHashMap2337.values().iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		interface70.method446((byte) -46);
	    }
	    iterator = aList2338.iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		if (interface70.method445((byte) 35))
		    aHashMap2337.remove
			(Integer.valueOf(interface70.method30(161080900)));
		else
		    aHashMap2336.remove
			(Integer.valueOf(interface70.method30(1882805438)));
	    }
	    aList2338.clear();
	    if (aClass491_2348 != null
		&& (aClass491_2348.method8027((byte) 2)
		    == Class480.aClass480_5254)
		&& false == aBool2335
		&& client.aClass100_11264.aClass13_1183 != null
		&& Class44_Sub22.method17372(-1850530127 * client.anInt11039,
					     -263257824)) {
		Class534_Sub19 class534_sub19
		    = Class346.method6128(Class404.aClass404_4199,
					  client.aClass100_11264.aClass13_1183,
					  1341391005);
		class534_sub19.aClass534_Sub40_Sub1_10513.method16510
		    (aClass491_2348.method8040((byte) 95).method30(2062057073),
		     -2001303060);
		client.aClass100_11264.method1863(class534_sub19, (byte) 111);
		aBool2335 = true;
	    }
	    iterator = aList2334.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		class491.method8036(-1026742683);
		class491.method8064(1833965953);
		Class480 class480 = class491.method8027((byte) 2);
		if (class491.method8021(-978042010) == this) {
		    if (Class480.aClass480_5257 == class480
			|| Class480.aClass480_5253 == class480) {
			if ((class491.method8023((byte) 70)
			     == Class211.aClass211_2257)
			    || (class491.method8023((byte) 95)
				== Class211.aClass211_2247)) {
			    if (aClass491_2348 == class491) {
				aBool2335 = false;
				aClass491_2348 = null;
				class491.method8030((byte) -56);
				aList2352.remove(class491);
			    } else {
				int i = class491.method8040((byte) 17)
					    .method30(711936306);
				boolean bool
				    = (method4227(Class190.aClass190_2135
						      .method3763(1334873084),
						  759637041)
				       > 0.0F);
				if (false == aBool2351 && bool) {
				    if (i == anInt2332 * -1966156715) {
					method4242(i, -1931824308);
					anInt2332 = 794851075;
				    }
				    class491.method8030((byte) -57);
				    aList2352.remove(class491);
				} else if (1867711623 * anInt2350 == i) {
				    anInt2350 = 1685159625;
				    aBool2351 = false;
				    class491.method8030((byte) -82);
				    aList2352.remove(class491);
				    Iterator iterator_125_
					= aList2334.iterator();
				    while (iterator_125_.hasNext()) {
					Class491 class491_126_
					    = (Class491) iterator_125_.next();
					if (class491_126_.method8023((byte) 68)
					    == Class211.aClass211_2257) {
					    int i_127_
						= class491_126_.method8040
						      ((byte) 110)
						      .method30(1911336557);
					    if (((i_127_
						  == anInt2332 * -1966156715)
						 && (class491_126_
							 .method8027((byte) 2)
						     == (Class480
							 .aClass480_5257)))
						|| (class491_126_
							.method8027((byte) 2)
						    == Class480.aClass480_5256)
						|| (class491_126_
							.method8027((byte) 2)
						    == Class480.aClass480_5251)
						|| (class491_126_
							.method8027((byte) 2)
						    == (Class480
							.aClass480_5254))) {
						if (class491_126_
							.method8027((byte) 2)
						    == Class480.aClass480_5257)
						    class491_126_.method8016
							(1760613600);
						else
						    class491_126_.method8069
							(2064504470);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (false == aBool2351
					|| -1966156715 * anInt2332 != i) {
					class491.method8030((byte) -54);
					aList2352.remove(class491);
				    }
				    if (false == aBool2351
					&& i == anInt2332 * -1966156715) {
					anInt2332 = 794851075;
					aClass491_2346 = null;
				    }
				}
			    }
			} else {
			    Iterator iterator_128_
				= aHashMap2344.keySet().iterator();
			    while (iterator_128_.hasNext()) {
				int i = ((Integer) iterator_128_.next())
					    .intValue();
				Class229 class229
				    = ((Class229)
				       aHashMap2344.get(Integer.valueOf(i)));
				if (class229.method4195(144717245)
					.contains(class491)) {
				    class229.method4193(class491, 2126489352);
				    break;
				}
			    }
			    class491.method8030((byte) -45);
			    aList2352.remove(class491);
			}
		    } else if ((class491.method8027((byte) 2)
				!= Class480.aClass480_5258)
			       && (class491.method8034(1003388361)
				   == Class190.aClass190_2135
					  .method3763(1749885968))) {
			boolean bool = (method4227(Class190.aClass190_2135
						       .method3763(1326791065),
						   1782915730)
					> 1.0E-4F);
			if (!bool)
			    class491.method8014(150, 1962988118);
		    }
		}
	    }
	}
    }
    
    boolean method4302(Class438 class438, Class438 class438_129_, float f) {
	Class438 class438_130_ = Class438.method7055(class438_129_, class438);
	if (class438_130_.method7012() >= f)
	    return false;
	return true;
    }
    
    Class203 method4303() {
	return aClass203_2355;
    }
    
    public Class491 method4304
	(Class211 class211, Object object, int i, int i_131_, int i_132_,
	 int i_133_, Class207 class207, float f, float f_134_,
	 Class438 class438, int i_135_, int i_136_, boolean bool) {
	if (!aBool2333)
	    return null;
	if (object == null)
	    return null;
	i_132_ = Math.max(0, Math.min(i_132_, 255));
	i_136_ = Math.max(0, i_136_);
	if (Class207.aClass207_2235 != class207
	    && !method4238(aClass438_2343, class438, f_134_, 1578619545))
	    return null;
	if (i_136_ <= 0)
	    i_136_ = 255;
	float f_137_ = (float) i_132_ / 255.0F;
	float f_138_ = (float) i_136_ / 255.0F;
	Interface70 interface70 = method4232(i, bool, 1651501480);
	Class491 class491 = method4233(interface70, (byte) -63);
	if (null == class491)
	    return null;
	class491.method8008(object, 2054275137);
	class491.method8025(i_133_, (byte) 56);
	if (Class207.aClass207_2235 != class207) {
	    class491.method8026(true, (byte) 1);
	    class491.method8028(class438, (byte) 11);
	    class491.method8032(f, 1009861768);
	    class491.method8033(f_134_, (byte) 32);
	    if (Class207.aClass207_2234 == class207)
		class491.method8017(anInterface58_2353, 586564267);
	    else if (class207 == Class207.aClass207_2237)
		class491.method8017(anInterface58_2347, -1490368593);
	    else if (Class207.aClass207_2236 == class207)
		class491.method8017(anInterface58_2326, -1785915959);
	    else if (class207 == Class207.aClass207_2238)
		class491.method8017(anInterface58_2354, -686479037);
	    else
		class491.method8026(false, (byte) -34);
	}
	class491.method8037(f_137_, 0, 2069762271);
	class491.method8038(i_131_ > 1 || i_131_ < 0,
			    i_131_ > 0 ? i_131_ - 1 : i_131_, -825207625);
	class491.method8039(f_138_, (byte) -111);
	class491.method8022(class211, (byte) -31);
	return class491;
    }
    
    public Class491 method4305
	(Class211 class211, Object object, int i, int i_139_, int i_140_,
	 int i_141_, Class207 class207, float f, float f_142_,
	 Class438 class438, int i_143_, int i_144_, boolean bool) {
	if (!aBool2333)
	    return null;
	if (object == null)
	    return null;
	i_140_ = Math.max(0, Math.min(i_140_, 255));
	i_144_ = Math.max(0, i_144_);
	if (Class207.aClass207_2235 != class207
	    && !method4238(aClass438_2343, class438, f_142_, 1034684783))
	    return null;
	if (i_144_ <= 0)
	    i_144_ = 255;
	float f_145_ = (float) i_140_ / 255.0F;
	float f_146_ = (float) i_144_ / 255.0F;
	Interface70 interface70 = method4232(i, bool, 652262249);
	Class491 class491 = method4233(interface70, (byte) -84);
	if (null == class491)
	    return null;
	class491.method8008(object, 2037017565);
	class491.method8025(i_141_, (byte) 109);
	if (Class207.aClass207_2235 != class207) {
	    class491.method8026(true, (byte) 1);
	    class491.method8028(class438, (byte) 18);
	    class491.method8032(f, 1009861768);
	    class491.method8033(f_142_, (byte) -39);
	    if (Class207.aClass207_2234 == class207)
		class491.method8017(anInterface58_2353, -948970780);
	    else if (class207 == Class207.aClass207_2237)
		class491.method8017(anInterface58_2347, -172717956);
	    else if (Class207.aClass207_2236 == class207)
		class491.method8017(anInterface58_2326, 630554186);
	    else if (class207 == Class207.aClass207_2238)
		class491.method8017(anInterface58_2354, -1600048136);
	    else
		class491.method8026(false, (byte) -56);
	}
	class491.method8037(f_145_, 0, 1685966444);
	class491.method8038(i_139_ > 1 || i_139_ < 0,
			    i_139_ > 0 ? i_139_ - 1 : i_139_, -1355648963);
	class491.method8039(f_146_, (byte) -19);
	class491.method8022(class211, (byte) -60);
	return class491;
    }
    
    public void method4306(Class491 class491, int i, int i_147_) {
	if (null != class491) {
	    Class229 class229
		= (Class229) aHashMap2344.get(Integer.valueOf(i));
	    if (null == class229) {
		class229 = new Class229(this);
		aHashMap2344.put(Integer.valueOf(i), class229);
	    }
	    if (!class229.method4194(class491, 31645619)) {
		class491.method8018(i_147_, true, (byte) 5);
		class229.method4192(class491, -661714523);
	    }
	}
    }
    
    public void method4307(Class211 class211, int i, int i_148_, int i_149_,
			   int i_150_, Class207 class207, float f,
			   float f_151_, Class438 class438, int i_152_,
			   int i_153_, int i_154_) {
	if (aBool2333) {
	    Class491 class491
		= method4229(class211, this, i, i_148_, i_149_, i_150_,
			     class207, f, f_151_, class438, i_152_, i_153_,
			     false, -2076916344);
	    if (class491 != null) {
		if (i_154_ == 0)
		    class491.method8069(2116023247);
		else
		    class491.method8018(i_154_, false, (byte) 5);
		method4234(class491, 404906273);
	    }
	}
    }
    
    public void method4308(int i, int i_155_) {
	if (i != -1966156715 * anInt2332) {
	    if (aClass491_2348 != null) {
		aClass491_2348.method8014(0, 1962988118);
		method4234(aClass491_2348, -145166557);
		aClass491_2348 = null;
	    }
	    Class491 class491
		= method4229(Class211.aClass211_2257, this, i, 0, i_155_,
			     Class190.aClass190_2135.method3763(2492314),
			     Class207.aClass207_2235, 0.0F, 0.0F, null, 0, 255,
			     true, 429193374);
	    if (null != class491) {
		class491.method8012(-1720662844);
		aClass491_2348 = class491;
	    }
	    aBool2335 = false;
	}
    }
    
    public void method4309(int i, int i_156_) {
	if (i != -1966156715 * anInt2332) {
	    if (aClass491_2348 != null) {
		aClass491_2348.method8014(0, 1962988118);
		method4234(aClass491_2348, -421266222);
		aClass491_2348 = null;
	    }
	    Class491 class491
		= method4229(Class211.aClass211_2257, this, i, 0, i_156_,
			     Class190.aClass190_2135.method3763(-914562808),
			     Class207.aClass207_2235, 0.0F, 0.0F, null, 0, 255,
			     true, 672704044);
	    if (null != class491) {
		class491.method8012(-1720662844);
		aClass491_2348 = class491;
	    }
	    aBool2335 = false;
	}
    }
    
    void method4310(int[] is, int i) {
	if (aBool2333 && is != null) {
	    int[] is_157_ = is;
	    for (int i_158_ = 0; i_158_ < is_157_.length; i_158_++) {
		int i_159_ = is_157_[i_158_];
		method4230(i_159_, -1678304844);
	    }
	}
    }
    
    public int method4311() {
	return anInt2332 * -1966156715;
    }
    
    public int method4312() {
	return anInt2332 * -1966156715;
    }
    
    public void method4313(int i) {
	anInt2349 = i * 244312271;
    }
    
    public int method4314(int i) {
	return anInt2349 * -1611391441;
    }
    
    public void method4315() {
	if (aBool2333) {
	    Class213.method4023(-785680842);
	    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null
		&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807()
		    != null)) {
		if (aClass438_2343 == null)
		    aClass438_2343 = new Class438();
		aClass438_2343.aFloat4864
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885.aFloat4864);
		aClass438_2343.aFloat4863 = 0.0F;
		aClass438_2343.aFloat4865
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885.aFloat4865);
	    }
	    Iterator iterator = aHashMap2336.values().iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		interface70.method446((byte) -19);
	    }
	    iterator = aHashMap2337.values().iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		interface70.method446((byte) -112);
	    }
	    iterator = aList2338.iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		if (interface70.method445((byte) 87))
		    aHashMap2337.remove
			(Integer.valueOf(interface70.method30(1052330316)));
		else
		    aHashMap2336.remove
			(Integer.valueOf(interface70.method30(1814408963)));
	    }
	    aList2338.clear();
	    if (aClass491_2348 != null
		&& (aClass491_2348.method8027((byte) 2)
		    == Class480.aClass480_5254)
		&& false == aBool2335
		&& client.aClass100_11264.aClass13_1183 != null
		&& Class44_Sub22.method17372(-1850530127 * client.anInt11039,
					     1275725652)) {
		Class534_Sub19 class534_sub19
		    = Class346.method6128(Class404.aClass404_4199,
					  client.aClass100_11264.aClass13_1183,
					  1341391005);
		class534_sub19.aClass534_Sub40_Sub1_10513.method16510
		    (aClass491_2348.method8040((byte) 59).method30(666520408),
		     -1653715874);
		client.aClass100_11264.method1863(class534_sub19, (byte) 119);
		aBool2335 = true;
	    }
	    iterator = aList2334.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		class491.method8036(-1161259204);
		class491.method8064(1027368147);
		Class480 class480 = class491.method8027((byte) 2);
		if (class491.method8021(-898874825) == this) {
		    if (Class480.aClass480_5257 == class480
			|| Class480.aClass480_5253 == class480) {
			if ((class491.method8023((byte) 117)
			     == Class211.aClass211_2257)
			    || (class491.method8023((byte) 73)
				== Class211.aClass211_2247)) {
			    if (aClass491_2348 == class491) {
				aBool2335 = false;
				aClass491_2348 = null;
				class491.method8030((byte) -69);
				aList2352.remove(class491);
			    } else {
				int i = class491.method8040((byte) 126)
					    .method30(1710394268);
				boolean bool
				    = (method4227(Class190.aClass190_2135
						      .method3763(-329058040),
						  -25937164)
				       > 0.0F);
				if (false == aBool2351 && bool) {
				    if (i == anInt2332 * -1966156715) {
					method4242(i, -1931824308);
					anInt2332 = 794851075;
				    }
				    class491.method8030((byte) -100);
				    aList2352.remove(class491);
				} else if (1867711623 * anInt2350 == i) {
				    anInt2350 = 1685159625;
				    aBool2351 = false;
				    class491.method8030((byte) -31);
				    aList2352.remove(class491);
				    Iterator iterator_160_
					= aList2334.iterator();
				    while (iterator_160_.hasNext()) {
					Class491 class491_161_
					    = (Class491) iterator_160_.next();
					if (class491_161_
						.method8023((byte) 100)
					    == Class211.aClass211_2257) {
					    int i_162_
						= class491_161_.method8040
						      ((byte) 77)
						      .method30(1432026772);
					    if (((i_162_
						  == anInt2332 * -1966156715)
						 && (class491_161_
							 .method8027((byte) 2)
						     == (Class480
							 .aClass480_5257)))
						|| (class491_161_
							.method8027((byte) 2)
						    == Class480.aClass480_5256)
						|| (class491_161_
							.method8027((byte) 2)
						    == Class480.aClass480_5251)
						|| (class491_161_
							.method8027((byte) 2)
						    == (Class480
							.aClass480_5254))) {
						if (class491_161_
							.method8027((byte) 2)
						    == Class480.aClass480_5257)
						    class491_161_.method8016
							(1760613600);
						else
						    class491_161_.method8069
							(1961344774);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (false == aBool2351
					|| -1966156715 * anInt2332 != i) {
					class491.method8030((byte) -61);
					aList2352.remove(class491);
				    }
				    if (false == aBool2351
					&& i == anInt2332 * -1966156715) {
					anInt2332 = 794851075;
					aClass491_2346 = null;
				    }
				}
			    }
			} else {
			    Iterator iterator_163_
				= aHashMap2344.keySet().iterator();
			    while (iterator_163_.hasNext()) {
				int i = ((Integer) iterator_163_.next())
					    .intValue();
				Class229 class229
				    = ((Class229)
				       aHashMap2344.get(Integer.valueOf(i)));
				if (class229.method4195(-1089461576)
					.contains(class491)) {
				    class229.method4193(class491, 2126321811);
				    break;
				}
			    }
			    class491.method8030((byte) -98);
			    aList2352.remove(class491);
			}
		    } else if ((class491.method8027((byte) 2)
				!= Class480.aClass480_5258)
			       && (class491.method8034(-2036308879)
				   == Class190.aClass190_2135
					  .method3763(-1345091516))) {
			boolean bool = method4227(Class190.aClass190_2135
						      .method3763(-1724819383),
						  -935746038) > 1.0E-4F;
			if (!bool)
			    class491.method8014(150, 1962988118);
		    }
		}
	    }
	}
    }
    
    void method4316(int i) {
	if (null != client.aClass100_11264.aClass13_1183
	    && Class44_Sub22.method17372(client.anInt11039 * -1850530127,
					 -1974757106)) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4201,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16510(i,
								  -1466998828);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 34);
	}
    }
    
    public void method4317(int i, int i_164_, boolean bool, int i_165_,
			   int i_166_, int i_167_, int i_168_, int i_169_) {
	if (aBool2333 && i != anInt2332 * -1966156715) {
	    if (aBool2351 && aClass491_2346 != null
		&& i != anInt2332 * -1966156715) {
		aClass491_2346.method8016(1760613600);
		aClass491_2346.method8030((byte) -114);
		aList2352.remove(aClass491_2346);
	    }
	    Class491 class491 = method4246((short) -995);
	    if (class491 != null
		&& class491.method8040((byte) 3).method30(1969877417) == i) {
		aClass491_2346 = class491;
		anInt2332
		    = (class491.method8040((byte) 65).method30(1350954406)
		       * -794851075);
	    } else {
		boolean bool_170_ = false;
		if (-1966156715 * anInt2332 >= 0) {
		    Iterator iterator = aList2352.iterator();
		    while (iterator.hasNext()) {
			Class491 class491_171_ = (Class491) iterator.next();
			if (class491_171_.method8023((byte) 106)
			    == Class211.aClass211_2257) {
			    class491_171_.method8014(2000, 1962988118);
			    bool_170_ = true;
			}
		    }
		}
		aClass491_2346 = null;
		anInt2332 = 794851075;
		Class491 class491_172_ = null;
		if (aClass491_2348 != null
		    && aClass491_2348.method8040((byte) 113) != null
		    && aClass491_2348.method8040((byte) 54)
			   .method30(713073839) == i
		    && (aClass491_2348.method8027((byte) 2)
			== Class480.aClass480_5254)) {
		    class491_172_ = aClass491_2348;
		    aClass491_2348 = null;
		    aBool2335 = false;
		}
		if (class491_172_ == null) {
		    if (bool) {
			float f = (float) i_168_;
			float f_173_ = (float) i_169_;
			Class438 class438 = new Class438((float) i_166_, 0.0F,
							 (float) i_167_);
			class491_172_
			    = method4229(Class211.aClass211_2257, this, i, 0,
					 bool_170_ ? 0 : i_164_,
					 (-1611391441 * anInt2349 == i
					  ? Class198.aClass198_2164
						.method3824((byte) 0)
					  : Class190.aClass190_2135
						.method3763(1011825059)),
					 Class207.aClass207_2238, f, f_173_,
					 class438, i_165_, 255, true,
					 -38279725);
		    } else
			class491_172_
			    = method4229(Class211.aClass211_2257, this, i, 0,
					 bool_170_ ? 0 : i_164_,
					 (i == anInt2349 * -1611391441
					  ? Class198.aClass198_2164
						.method3824((byte) 0)
					  : Class190.aClass190_2135
						.method3763(572257210)),
					 Class207.aClass207_2235, 0.0F, 0.0F,
					 null, 0, 255, true, -1903370211);
		}
		if (null != class491_172_) {
		    if (bool_170_) {
			float f = (float) i_164_ / 255.0F;
			class491_172_.method8037(f, 2000, 1687971937);
		    }
		    class491_172_.method8069(1945925242);
		    method4234(class491_172_, -632223630);
		    aClass491_2346 = class491_172_;
		    anInt2332 = -794851075 * i;
		    if (aBool2351)
			aClass491_2346.method8015((byte) 1);
		    if (client.aClass100_11264.aClass13_1183 != null
			&& Class44_Sub22.method17372((-1850530127
						      * client.anInt11039),
						     -67266740)) {
			Class534_Sub19 class534_sub19
			    = Class346.method6128(Class404.aClass404_4199,
						  (client.aClass100_11264
						   .aClass13_1183),
						  1341391005);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16510(anInt2332 * -1966156715, -657690010);
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 75);
		    }
		}
	    }
	}
    }
    
    public void method4318(int i) {
	method4244(i, 255, (byte) -78);
    }
    
    public void method4319(int i, int i_174_) {
	method4274(i, i_174_, false, 0, 0, 0, 0, 0, 1495000030);
    }
    
    public void method4320(int i, int i_175_) {
	method4274(i, i_175_, false, 0, 0, 0, 0, 0, 1653709740);
    }
    
    public void method4321() {
	Class493.method8118(-1093625626);
    }
    
    public void method4322(int i, int i_176_, boolean bool, int i_177_,
			   int i_178_, int i_179_, int i_180_, int i_181_) {
	if (aBool2333 && i != anInt2332 * -1966156715) {
	    if (aBool2351 && aClass491_2346 != null
		&& i != anInt2332 * -1966156715) {
		aClass491_2346.method8016(1760613600);
		aClass491_2346.method8030((byte) -101);
		aList2352.remove(aClass491_2346);
	    }
	    Class491 class491 = method4246((short) -995);
	    if (class491 != null
		&& class491.method8040((byte) 47).method30(88131143) == i) {
		aClass491_2346 = class491;
		anInt2332
		    = (class491.method8040((byte) 18).method30(1717318490)
		       * -794851075);
	    } else {
		boolean bool_182_ = false;
		if (-1966156715 * anInt2332 >= 0) {
		    Iterator iterator = aList2352.iterator();
		    while (iterator.hasNext()) {
			Class491 class491_183_ = (Class491) iterator.next();
			if (class491_183_.method8023((byte) 107)
			    == Class211.aClass211_2257) {
			    class491_183_.method8014(2000, 1962988118);
			    bool_182_ = true;
			}
		    }
		}
		aClass491_2346 = null;
		anInt2332 = 794851075;
		Class491 class491_184_ = null;
		if (aClass491_2348 != null
		    && aClass491_2348.method8040((byte) 84) != null
		    && aClass491_2348.method8040((byte) 72)
			   .method30(-118515420) == i
		    && (aClass491_2348.method8027((byte) 2)
			== Class480.aClass480_5254)) {
		    class491_184_ = aClass491_2348;
		    aClass491_2348 = null;
		    aBool2335 = false;
		}
		if (class491_184_ == null) {
		    if (bool) {
			float f = (float) i_180_;
			float f_185_ = (float) i_181_;
			Class438 class438 = new Class438((float) i_178_, 0.0F,
							 (float) i_179_);
			class491_184_
			    = method4229(Class211.aClass211_2257, this, i, 0,
					 bool_182_ ? 0 : i_176_,
					 (-1611391441 * anInt2349 == i
					  ? Class198.aClass198_2164
						.method3824((byte) 0)
					  : Class190.aClass190_2135
						.method3763(1694270028)),
					 Class207.aClass207_2238, f, f_185_,
					 class438, i_177_, 255, true,
					 -2101734836);
		    } else
			class491_184_
			    = method4229(Class211.aClass211_2257, this, i, 0,
					 bool_182_ ? 0 : i_176_,
					 (i == anInt2349 * -1611391441
					  ? Class198.aClass198_2164
						.method3824((byte) 0)
					  : Class190.aClass190_2135
						.method3763(786676150)),
					 Class207.aClass207_2235, 0.0F, 0.0F,
					 null, 0, 255, true, -2080752916);
		}
		if (null != class491_184_) {
		    if (bool_182_) {
			float f = (float) i_176_ / 255.0F;
			class491_184_.method8037(f, 2000, 2138685699);
		    }
		    class491_184_.method8069(2012390451);
		    method4234(class491_184_, 991338298);
		    aClass491_2346 = class491_184_;
		    anInt2332 = -794851075 * i;
		    if (aBool2351)
			aClass491_2346.method8015((byte) 1);
		    if (client.aClass100_11264.aClass13_1183 != null
			&& Class44_Sub22.method17372((-1850530127
						      * client.anInt11039),
						     -2066919067)) {
			Class534_Sub19 class534_sub19
			    = Class346.method6128(Class404.aClass404_4199,
						  (client.aClass100_11264
						   .aClass13_1183),
						  1341391005);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16510(anInt2332 * -1966156715, -15969389);
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 48);
		    }
		}
	    }
	}
    }
    
    Class491 method4323() {
	Iterator iterator = aList2352.iterator();
	while (iterator.hasNext()) {
	    Class491 class491 = (Class491) iterator.next();
	    if (class491.method8023((byte) 29) == Class211.aClass211_2257
		&& class491.method8027((byte) 2) == Class480.aClass480_5255)
		return class491;
	}
	return null;
    }
    
    Interface70 method4324(int i, boolean bool, int i_186_) {
	if (!aBool2333)
	    return null;
	Interface70 interface70
	    = (Interface70) (bool ? aClass203_2339.method3871((long) i)
			     : aClass203_2355.method3871((long) i));
	if (null == interface70) {
	    if (bool)
		interface70
		    = (Interface70) aHashMap2337.get(Integer.valueOf(i));
	    else
		interface70
		    = (Interface70) aHashMap2336.get(Integer.valueOf(i));
	}
	return interface70;
    }
    
    public void method4325() {
	Iterator iterator = aList2352.iterator();
	while (iterator.hasNext()) {
	    Class491 class491 = (Class491) iterator.next();
	    if (class491.method8023((byte) 49) == Class211.aClass211_2257) {
		class491.method8014(500, 1962988118);
		if (class491.method8040((byte) 15).method30(-162165897)
		    == -1966156715 * anInt2332) {
		    method4242(anInt2332 * -1966156715, -1931824308);
		    break;
		}
	    }
	}
	aClass491_2346 = null;
	anInt2332 = 794851075;
    }
    
    public void method4326(int i, int i_187_) {
	Class388 class388 = Class662.method10994(i, (byte) 1);
	if (null != class388) {
	    float f = 1.5258789E-5F * (float) i_187_;
	    class388.method6520(f, (byte) -81);
	}
    }
    
    public void method4327(Class205 class205, int i,
			   Class654_Sub1 class654_sub1) {
	if (null != class205 && null != class205.anIntArrayArray2215
	    && i < class205.anIntArrayArray2215.length
	    && class205.anIntArrayArray2215[i] != null
	    && (class654_sub1.aByte10854
		== Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854)
	    && class654_sub1.method16859(-1211040972)) {
	    int i_188_ = class205.anIntArrayArray2215[i][0];
	    int i_189_ = i_188_ >> 8;
	    int i_190_ = i_188_ >> 5 & 0x7;
	    int i_191_ = i_188_ & 0x1f;
	    if (class205.anIntArrayArray2215[i].length > 1) {
		int i_192_ = (int) (Math.random()
				    * (double) (class205.anIntArrayArray2215
						[i]).length);
		if (i_192_ > 0)
		    i_189_ = class205.anIntArrayArray2215[i][i_192_];
	    }
	    int i_193_ = 256;
	    if (null != class205.anIntArray2227
		&& null != class205.anIntArray2226)
		i_193_ = ((int) (Math.random()
				 * (double) (class205.anIntArray2226[i]
					     - class205.anIntArray2227[i]))
			  + class205.anIntArray2227[i]);
	    int i_194_ = (class205.anIntArray2216 == null ? 255
			  : class205.anIntArray2216[i]);
	    if (i_191_ == 0) {
		if (class654_sub1
		    == Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419)
		    method4237(Class211.aClass211_2250, i_189_, i_190_, i_194_,
			       Class190.aClass190_2129.method3763(1031600956),
			       Class207.aClass207_2235, 0.0F, 0.0F, null,
			       class654_sub1.aByte10854, i_193_, 0, (byte) 5);
	    } else {
		if (class654_sub1
		    == Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419) {
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub28_10784.method17131(2049502331)
			== 0)
			return;
		} else if (Class44_Sub6.aClass534_Sub35_10989
			       .aClass690_Sub28_10754.method17131(248694856)
			   == 0)
		    return;
		if (-1 != class205.anInt2230 * 864647291) {
		    int i_195_ = 0;
		    if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub1)
			i_195_ = ((Class654_Sub1_Sub5_Sub1) class654_sub1)
				     .method18549((byte) -67);
		    else if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub5)
			i_195_ = ((Class654_Sub1_Sub5_Sub5) class654_sub1)
				     .method18783((short) -3379);
		    else if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub6)
			i_195_ = ((Class654_Sub1_Sub5_Sub6) class654_sub1)
				     .method18820((byte) -64);
		    if (0 != i_195_
			&& i_195_ != Class322
					 .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					 .method18549((byte) -23)
			&& i_195_ != 476125061 * client.anInt11204) {
			i_194_ = class205.anInt2230 * 864647291 * i_194_ / 100;
			if (i_194_ < 0)
			    i_194_ = 0;
			else if (i_194_ > 255)
			    i_194_ = 255;
		    }
		}
		Class438 class438 = class654_sub1.method10807().aClass438_4885;
		int i_196_ = (int) class438.aFloat4864 - 256 >> 9;
		int i_197_ = (int) class438.aFloat4865 - 256 >> 9;
		Class438 class438_198_
		    = new Class438((float) (i_196_ << 9), 0.0F,
				   (float) (i_197_ << 9));
		int i_199_ = class654_sub1.aByte10854 << 24;
		method4237(Class211.aClass211_2253, i_189_, i_190_, i_194_,
			   Class190.aClass190_2130.method3763(-551360916),
			   ((class654_sub1
			     != Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419)
			    ? Class207.aClass207_2236
			    : Class207.aClass207_2235),
			   0.0F, (float) (i_191_ << 9), class438_198_, i_199_,
			   i_193_, 0, (byte) 55);
	    }
	}
    }
    
    Interface70 method4328(int i, boolean bool) {
	if (!aBool2333)
	    return null;
	Interface70 interface70
	    = (Interface70) (bool ? aClass203_2339.method3871((long) i)
			     : aClass203_2355.method3871((long) i));
	if (null == interface70) {
	    if (bool)
		interface70
		    = (Interface70) aHashMap2337.get(Integer.valueOf(i));
	    else
		interface70
		    = (Interface70) aHashMap2336.get(Integer.valueOf(i));
	}
	return interface70;
    }
    
    public void method4329() {
	if (aBool2333) {
	    Class213.method4023(-1180151200);
	    if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 != null
		&& (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807()
		    != null)) {
		if (aClass438_2343 == null)
		    aClass438_2343 = new Class438();
		aClass438_2343.aFloat4864
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885.aFloat4864);
		aClass438_2343.aFloat4863 = 0.0F;
		aClass438_2343.aFloat4865
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885.aFloat4865);
	    }
	    Iterator iterator = aHashMap2336.values().iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		interface70.method446((byte) -100);
	    }
	    iterator = aHashMap2337.values().iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		interface70.method446((byte) -96);
	    }
	    iterator = aList2338.iterator();
	    while (iterator.hasNext()) {
		Interface70 interface70 = (Interface70) iterator.next();
		if (interface70.method445((byte) 55))
		    aHashMap2337.remove
			(Integer.valueOf(interface70.method30(302954423)));
		else
		    aHashMap2336.remove
			(Integer.valueOf(interface70.method30(1612855977)));
	    }
	    aList2338.clear();
	    if (aClass491_2348 != null
		&& (aClass491_2348.method8027((byte) 2)
		    == Class480.aClass480_5254)
		&& false == aBool2335
		&& client.aClass100_11264.aClass13_1183 != null
		&& Class44_Sub22.method17372(-1850530127 * client.anInt11039,
					     -1377459058)) {
		Class534_Sub19 class534_sub19
		    = Class346.method6128(Class404.aClass404_4199,
					  client.aClass100_11264.aClass13_1183,
					  1341391005);
		class534_sub19.aClass534_Sub40_Sub1_10513.method16510
		    (aClass491_2348.method8040((byte) 103)
			 .method30(1445004190),
		     -1550183073);
		client.aClass100_11264.method1863(class534_sub19, (byte) 40);
		aBool2335 = true;
	    }
	    iterator = aList2334.iterator();
	    while (iterator.hasNext()) {
		Class491 class491 = (Class491) iterator.next();
		class491.method8036(82919940);
		class491.method8064(1059537902);
		Class480 class480 = class491.method8027((byte) 2);
		if (class491.method8021(-1590936996) == this) {
		    if (Class480.aClass480_5257 == class480
			|| Class480.aClass480_5253 == class480) {
			if ((class491.method8023((byte) 105)
			     == Class211.aClass211_2257)
			    || (class491.method8023((byte) 45)
				== Class211.aClass211_2247)) {
			    if (aClass491_2348 == class491) {
				aBool2335 = false;
				aClass491_2348 = null;
				class491.method8030((byte) -117);
				aList2352.remove(class491);
			    } else {
				int i = class491.method8040((byte) 69)
					    .method30(161337419);
				boolean bool
				    = (method4227(Class190.aClass190_2135
						      .method3763(715250545),
						  1961105605)
				       > 0.0F);
				if (false == aBool2351 && bool) {
				    if (i == anInt2332 * -1966156715) {
					method4242(i, -1931824308);
					anInt2332 = 794851075;
				    }
				    class491.method8030((byte) -7);
				    aList2352.remove(class491);
				} else if (1867711623 * anInt2350 == i) {
				    anInt2350 = 1685159625;
				    aBool2351 = false;
				    class491.method8030((byte) -4);
				    aList2352.remove(class491);
				    Iterator iterator_200_
					= aList2334.iterator();
				    while (iterator_200_.hasNext()) {
					Class491 class491_201_
					    = (Class491) iterator_200_.next();
					if (class491_201_.method8023((byte) 83)
					    == Class211.aClass211_2257) {
					    int i_202_
						= class491_201_.method8040
						      ((byte) 2)
						      .method30(1035304556);
					    if (((i_202_
						  == anInt2332 * -1966156715)
						 && (class491_201_
							 .method8027((byte) 2)
						     == (Class480
							 .aClass480_5257)))
						|| (class491_201_
							.method8027((byte) 2)
						    == Class480.aClass480_5256)
						|| (class491_201_
							.method8027((byte) 2)
						    == Class480.aClass480_5251)
						|| (class491_201_
							.method8027((byte) 2)
						    == (Class480
							.aClass480_5254))) {
						if (class491_201_
							.method8027((byte) 2)
						    == Class480.aClass480_5257)
						    class491_201_.method8016
							(1760613600);
						else
						    class491_201_.method8069
							(1975512635);
						break;
					    }
					}
				    }
				} else if (bool) {
				    if (false == aBool2351
					|| -1966156715 * anInt2332 != i) {
					class491.method8030((byte) -107);
					aList2352.remove(class491);
				    }
				    if (false == aBool2351
					&& i == anInt2332 * -1966156715) {
					anInt2332 = 794851075;
					aClass491_2346 = null;
				    }
				}
			    }
			} else {
			    Iterator iterator_203_
				= aHashMap2344.keySet().iterator();
			    while (iterator_203_.hasNext()) {
				int i = ((Integer) iterator_203_.next())
					    .intValue();
				Class229 class229
				    = ((Class229)
				       aHashMap2344.get(Integer.valueOf(i)));
				if (class229.method4195(-1600911813)
					.contains(class491)) {
				    class229.method4193(class491, 2088681542);
				    break;
				}
			    }
			    class491.method8030((byte) -59);
			    aList2352.remove(class491);
			}
		    } else if ((class491.method8027((byte) 2)
				!= Class480.aClass480_5258)
			       && (class491.method8034(-610972286)
				   == Class190.aClass190_2135
					  .method3763(-561736280))) {
			boolean bool = (method4227(Class190.aClass190_2135
						       .method3763(1599501800),
						   506671697)
					> 1.0E-4F);
			if (!bool)
			    class491.method8014(150, 1962988118);
		    }
		}
	    }
	}
    }
    
    public void method4330(Class205 class205, int i,
			   Class654_Sub1 class654_sub1) {
	if (null != class205 && null != class205.anIntArrayArray2215
	    && i < class205.anIntArrayArray2215.length
	    && class205.anIntArrayArray2215[i] != null
	    && (class654_sub1.aByte10854
		== Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aByte10854)
	    && class654_sub1.method16859(1705997641)) {
	    int i_204_ = class205.anIntArrayArray2215[i][0];
	    int i_205_ = i_204_ >> 8;
	    int i_206_ = i_204_ >> 5 & 0x7;
	    int i_207_ = i_204_ & 0x1f;
	    if (class205.anIntArrayArray2215[i].length > 1) {
		int i_208_ = (int) (Math.random()
				    * (double) (class205.anIntArrayArray2215
						[i]).length);
		if (i_208_ > 0)
		    i_205_ = class205.anIntArrayArray2215[i][i_208_];
	    }
	    int i_209_ = 256;
	    if (null != class205.anIntArray2227
		&& null != class205.anIntArray2226)
		i_209_ = ((int) (Math.random()
				 * (double) (class205.anIntArray2226[i]
					     - class205.anIntArray2227[i]))
			  + class205.anIntArray2227[i]);
	    int i_210_ = (class205.anIntArray2216 == null ? 255
			  : class205.anIntArray2216[i]);
	    if (i_207_ == 0) {
		if (class654_sub1
		    == Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419)
		    method4237(Class211.aClass211_2250, i_205_, i_206_, i_210_,
			       Class190.aClass190_2129.method3763(-812461586),
			       Class207.aClass207_2235, 0.0F, 0.0F, null,
			       class654_sub1.aByte10854, i_209_, 0, (byte) 44);
	    } else {
		if (class654_sub1
		    == Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419) {
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub28_10784.method17131(1665514611)
			== 0)
			return;
		} else if (Class44_Sub6.aClass534_Sub35_10989
			       .aClass690_Sub28_10754.method17131(-165040630)
			   == 0)
		    return;
		if (-1 != class205.anInt2230 * 864647291) {
		    int i_211_ = 0;
		    if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub1)
			i_211_ = ((Class654_Sub1_Sub5_Sub1) class654_sub1)
				     .method18549((byte) -13);
		    else if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub5)
			i_211_ = ((Class654_Sub1_Sub5_Sub5) class654_sub1)
				     .method18783((short) -14857);
		    else if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub6)
			i_211_ = ((Class654_Sub1_Sub5_Sub6) class654_sub1)
				     .method18820((byte) -126);
		    if (0 != i_211_
			&& i_211_ != Class322
					 .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					 .method18549((byte) -10)
			&& i_211_ != 476125061 * client.anInt11204) {
			i_210_ = class205.anInt2230 * 864647291 * i_210_ / 100;
			if (i_210_ < 0)
			    i_210_ = 0;
			else if (i_210_ > 255)
			    i_210_ = 255;
		    }
		}
		Class438 class438 = class654_sub1.method10807().aClass438_4885;
		int i_212_ = (int) class438.aFloat4864 - 256 >> 9;
		int i_213_ = (int) class438.aFloat4865 - 256 >> 9;
		Class438 class438_214_
		    = new Class438((float) (i_212_ << 9), 0.0F,
				   (float) (i_213_ << 9));
		int i_215_ = class654_sub1.aByte10854 << 24;
		method4237(Class211.aClass211_2253, i_205_, i_206_, i_210_,
			   Class190.aClass190_2130.method3763(2135494107),
			   ((class654_sub1
			     != Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419)
			    ? Class207.aClass207_2236
			    : Class207.aClass207_2235),
			   0.0F, (float) (i_207_ << 9), class438_214_, i_215_,
			   i_209_, 0, (byte) 73);
	    }
	}
    }
    
    public void method4331(Class491 class491) {
	class491.method8008(this, 2080955538);
	aList2352.add(class491);
    }
    
    public void method4332(Class205 class205, int i) {
	if (null != class205 && null != class205.anIntArrayArray2215
	    && i < class205.anIntArrayArray2215.length
	    && class205.anIntArrayArray2215[i] != null) {
	    int i_216_ = class205.anIntArrayArray2215[i][0];
	    int i_217_ = i_216_ >> 8;
	    int i_218_ = i_216_ >> 5 & 0x7;
	    if (class205.anIntArrayArray2215[i].length > 1) {
		int i_219_ = (int) (Math.random()
				    * (double) (class205.anIntArrayArray2215
						[i]).length);
		if (i_219_ > 0)
		    i_217_ = class205.anIntArrayArray2215[i][i_219_];
	    }
	    int i_220_ = 256;
	    if (null != class205.anIntArray2227
		&& class205.anIntArray2226 != null)
		i_220_ = (int) ((double) class205.anIntArray2227[i]
				+ (Math.random()
				   * (double) (class205.anIntArray2226[i]
					       - class205.anIntArray2227[i])));
	    int i_221_ = (class205.anIntArray2216 == null ? 255
			  : class205.anIntArray2216[i]);
	    method4237(Class211.aClass211_2256, i_217_, i_218_, i_221_,
		       Class190.aClass190_2130.method3763(-2073263360),
		       Class207.aClass207_2235, 0.0F, 0.0F, null, 0, i_220_, 0,
		       (byte) 42);
	}
    }
    
    public void method4333(Class205 class205, int i) {
	if (null != class205 && null != class205.anIntArrayArray2215
	    && i < class205.anIntArrayArray2215.length
	    && class205.anIntArrayArray2215[i] != null) {
	    int i_222_ = class205.anIntArrayArray2215[i][0];
	    int i_223_ = i_222_ >> 8;
	    int i_224_ = i_222_ >> 5 & 0x7;
	    if (class205.anIntArrayArray2215[i].length > 1) {
		int i_225_ = (int) (Math.random()
				    * (double) (class205.anIntArrayArray2215
						[i]).length);
		if (i_225_ > 0)
		    i_223_ = class205.anIntArrayArray2215[i][i_225_];
	    }
	    int i_226_ = 256;
	    if (null != class205.anIntArray2227
		&& class205.anIntArray2226 != null)
		i_226_ = (int) ((double) class205.anIntArray2227[i]
				+ (Math.random()
				   * (double) (class205.anIntArray2226[i]
					       - class205.anIntArray2227[i])));
	    int i_227_ = (class205.anIntArray2216 == null ? 255
			  : class205.anIntArray2216[i]);
	    method4237(Class211.aClass211_2256, i_223_, i_224_, i_227_,
		       Class190.aClass190_2130.method3763(1952512240),
		       Class207.aClass207_2235, 0.0F, 0.0F, null, 0, i_226_, 0,
		       (byte) 53);
	}
    }
    
    public void method4334(Class205 class205, int i) {
	if (null != class205 && null != class205.anIntArrayArray2215
	    && i < class205.anIntArrayArray2215.length
	    && class205.anIntArrayArray2215[i] != null) {
	    int i_228_ = class205.anIntArrayArray2215[i][0];
	    int i_229_ = i_228_ >> 8;
	    int i_230_ = i_228_ >> 5 & 0x7;
	    if (class205.anIntArrayArray2215[i].length > 1) {
		int i_231_ = (int) (Math.random()
				    * (double) (class205.anIntArrayArray2215
						[i]).length);
		if (i_231_ > 0)
		    i_229_ = class205.anIntArrayArray2215[i][i_231_];
	    }
	    int i_232_ = 256;
	    if (null != class205.anIntArray2227
		&& class205.anIntArray2226 != null)
		i_232_ = (int) ((double) class205.anIntArray2227[i]
				+ (Math.random()
				   * (double) (class205.anIntArray2226[i]
					       - class205.anIntArray2227[i])));
	    int i_233_ = (class205.anIntArray2216 == null ? 255
			  : class205.anIntArray2216[i]);
	    method4237(Class211.aClass211_2256, i_229_, i_230_, i_233_,
		       Class190.aClass190_2130.method3763(720253572),
		       Class207.aClass207_2235, 0.0F, 0.0F, null, 0, i_232_, 0,
		       (byte) 42);
	}
    }
    
    public void method4335() {
	Iterator iterator = aList2352.iterator();
	while (iterator.hasNext()) {
	    Class491 class491 = (Class491) iterator.next();
	    if (class491.method8023((byte) 9) == Class211.aClass211_2257) {
		class491.method8014(500, 1962988118);
		if (class491.method8040((byte) 75).method30(2068828265)
		    == -1966156715 * anInt2332) {
		    method4242(anInt2332 * -1966156715, -1931824308);
		    break;
		}
	    }
	}
	aClass491_2346 = null;
	anInt2332 = 794851075;
    }
    
    public void method4336(Class205 class205, int i) {
	if (null != class205 && null != class205.anIntArrayArray2215
	    && i < class205.anIntArrayArray2215.length
	    && class205.anIntArrayArray2215[i] != null) {
	    int i_234_ = class205.anIntArrayArray2215[i][0];
	    int i_235_ = i_234_ >> 8;
	    int i_236_ = i_234_ >> 5 & 0x7;
	    if (class205.anIntArrayArray2215[i].length > 1) {
		int i_237_ = (int) (Math.random()
				    * (double) (class205.anIntArrayArray2215
						[i]).length);
		if (i_237_ > 0)
		    i_235_ = class205.anIntArrayArray2215[i][i_237_];
	    }
	    int i_238_ = 256;
	    if (null != class205.anIntArray2227
		&& class205.anIntArray2226 != null)
		i_238_ = (int) ((double) class205.anIntArray2227[i]
				+ (Math.random()
				   * (double) (class205.anIntArray2226[i]
					       - class205.anIntArray2227[i])));
	    int i_239_ = (class205.anIntArray2216 == null ? 255
			  : class205.anIntArray2216[i]);
	    method4237(Class211.aClass211_2256, i_235_, i_236_, i_239_,
		       Class190.aClass190_2130.method3763(-217859225),
		       Class207.aClass207_2235, 0.0F, 0.0F, null, 0, i_238_, 0,
		       (byte) 25);
	}
    }
    
    public static void method4337(boolean bool, int i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10758, 1,
	     -1159164340);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10759, 1,
	     925568411);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub10_10751, 0,
	     593497443);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub11_10749, 0,
	     140255298);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub25_10750, 0,
	     -307279264);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub24_10756, 0,
	     1964015855);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub9_10748),
						       0, -547352653);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub1_10762),
						       0, -687178193);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub6_10743),
						       0, 561788689);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763, 0,
	     1737196932);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub12_10753, 0,
	     -1916357366);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub3_10767),
						       0, -1137868431);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub27_10781, 0,
	     -410006121);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub27_10757, 0,
	     1442449544);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub5_10737),
						       0, 1510867368);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub22_10745,
	     1453209707 * Class302.aClass302_3246.anInt3244, 1126919549);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub19_10741, 0,
	     -1590803014);
	if (null != Class254.aClass185_2683
	    && Class254.aClass185_2683.method3534()
	    && Class254.aClass185_2683.method3409())
	    Class254.aClass185_2683.method3359();
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub33_10765, 0,
	     -1263222730);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub30_10739, 0,
	     1416040799);
	Class480.method7924(203946753);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub20_10742, 2,
	     57593816);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub37_10760, 1,
	     -834480171);
	Class635.method10538(-1192141584);
	client.aClass512_11100.method8501((byte) 15).method10157(729317809);
	client.aBool11059 = true;
    }
    
    static final void method4338(Class669 class669, short i) {
	if (Class666.aClass547_8577.method8995(81, (byte) -83))
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    public static Class534_Sub18_Sub9 method4339(int i) {
	return Class554_Sub1.aClass534_Sub18_Sub9_7354;
    }
}
