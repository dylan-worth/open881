/* Class491 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class491
{
    Object anObject5316;
    Interface70 anInterface70_5317;
    Class480 aClass480_5318 = Class480.aClass480_5252;
    int anInt5319;
    List aList5320;
    Class367 aClass367_5321;
    Class438 aClass438_5322;
    int anInt5323;
    boolean aBool5324;
    boolean aBool5325 = false;
    int anInt5326;
    Interface58 anInterface58_5327;
    float aFloat5328;
    float aFloat5329;
    int anInt5330;
    boolean aBool5331;
    Object anObject5332;
    float aFloat5333;
    float aFloat5334;
    
    public void method8008(Object object, int i) {
	anObject5316 = object;
    }
    
    public Class438 method8009() {
	return aClass438_5322;
    }
    
    public void method8010(Interface70 interface70, int i) {
	anInterface70_5317 = interface70;
	aFloat5333 = 0.0F;
	aClass480_5318 = Class480.aClass480_5256;
    }
    
    public void method8011(Interface58 interface58) {
	anInterface58_5327 = interface58;
    }
    
    public void method8012(int i) {
	if (!aBool5325
	    && (aClass480_5318 != Class480.aClass480_5259
		&& aClass480_5318 != Class480.aClass480_5260
		&& aClass480_5318 != Class480.aClass480_5252
		&& Class480.aClass480_5258 != aClass480_5318)
	    && ((112577419 * aClass480_5318.anInt5261
		 <= Class480.aClass480_5256.anInt5261 * 112577419)
		|| (aClass480_5318.anInt5261 * 112577419
		    >= Class480.aClass480_5257.anInt5261 * 112577419)))
	    aClass480_5318 = Class480.aClass480_5251;
    }
    
    public void method8013() {
	if (!aBool5325
	    && (aClass480_5318 != Class480.aClass480_5259
		&& aClass480_5318 != Class480.aClass480_5260
		&& aClass480_5318 != Class480.aClass480_5252
		&& Class480.aClass480_5258 != aClass480_5318)
	    && ((112577419 * aClass480_5318.anInt5261
		 <= Class480.aClass480_5256.anInt5261 * 112577419)
		|| (aClass480_5318.anInt5261 * 112577419
		    >= Class480.aClass480_5257.anInt5261 * 112577419)))
	    aClass480_5318 = Class480.aClass480_5251;
    }
    
    public void method8014(int i, int i_0_) {
	if (112577419 * aClass480_5318.anInt5261
	    < 112577419 * Class480.aClass480_5257.anInt5261) {
	    if (aClass480_5318.anInt5261 * 112577419
		< Class480.aClass480_5255.anInt5261 * 112577419) {
		aClass480_5318 = Class480.aClass480_5257;
		aBool5325 = false;
	    } else if (i <= 0) {
		Iterator iterator = aList5320.iterator();
		while (iterator.hasNext()) {
		    Class479 class479 = (Class479) iterator.next();
		    if (class479.method7851((byte) 57) != this)
			iterator.remove();
		    else
			class479.method7862((byte) -20);
		}
		aClass480_5318 = Class480.aClass480_5257;
		aBool5325 = false;
	    } else {
		aClass480_5318 = Class480.aClass480_5258;
		Iterator iterator = aList5320.iterator();
		while (iterator.hasNext()) {
		    Class479 class479 = (Class479) iterator.next();
		    if (class479.method7851((byte) 71) != this)
			iterator.remove();
		    else
			class479.method7811(0.0F, i, 59713917);
		}
	    }
	}
    }
    
    public void method8015(byte i) {
	Iterator iterator = aList5320.iterator();
	aClass480_5318 = Class480.aClass480_5257;
	while (iterator.hasNext()) {
	    Class479 class479 = (Class479) iterator.next();
	    if (class479.method7851((byte) -20) == this)
		class479.method7828((byte) 14);
	}
    }
    
    public void method8016(int i) {
	Iterator iterator = aList5320.iterator();
	aClass480_5318 = Class480.aClass480_5251;
	while (iterator.hasNext()) {
	    Class479 class479 = (Class479) iterator.next();
	    if (class479.method7851((byte) -8) == this)
		class479.method7829(811048855);
	}
    }
    
    public void method8017(Interface58 interface58, int i) {
	anInterface58_5327 = interface58;
    }
    
    public void method8018(int i, boolean bool, byte i_1_) {
	aBool5331 = bool;
	anInt5330 = -1873863177 * i;
    }
    
    public Class438 method8019() {
	return aClass438_5322;
    }
    
    public float method8020(short i) {
	return aFloat5328;
    }
    
    public Object method8021(int i) {
	return anObject5316;
    }
    
    public void method8022(Object object, byte i) {
	anObject5332 = object;
    }
    
    public Object method8023(byte i) {
	return anObject5332;
    }
    
    public Interface70 method8024() {
	return anInterface70_5317;
    }
    
    public void method8025(int i, byte i_2_) {
	anInt5323 = 1589381643 * i;
    }
    
    public void method8026(boolean bool, byte i) {
	/* empty */
    }
    
    public Class480 method8027(byte i) {
	return aClass480_5318;
    }
    
    public void method8028(Class438 class438, byte i) {
	aClass438_5322 = class438;
    }
    
    public Class438 method8029(byte i) {
	return aClass438_5322;
    }
    
    public void method8030(byte i) {
	if (aClass480_5318 != Class480.aClass480_5257
	    && Class480.aClass480_5253 != aClass480_5318)
	    method8014(0, 1962988118);
	Iterator iterator = aList5320.iterator();
	while (iterator.hasNext()) {
	    Class479 class479 = (Class479) iterator.next();
	    if (class479.method7851((byte) -100) != this)
		iterator.remove();
	    else
		class479.method7810(840925237);
	}
	method8057((byte) -1);
	aClass480_5318 = Class480.aClass480_5260;
    }
    
    public float method8031(int i) {
	return aFloat5329;
    }
    
    public void method8032(float f, int i) {
	aFloat5328 = f;
    }
    
    public void method8033(float f, byte i) {
	aFloat5329 = f;
    }
    
    public int method8034(int i) {
	return anInt5323 * 712815011;
    }
    
    public boolean method8035(int i) {
	aBool5331 = false;
	return anInt5330 * -791366713 != 0;
    }
    
    public void method8036(int i) {
	if (anInt5330 * -791366713 > -1 && !aBool5331)
	    anInt5330 -= -1873863177;
	if (anInt5330 * -791366713 == 0)
	    method8069(2094896047);
    }
    
    public void method8037(float f, int i, int i_3_) {
	aFloat5333 = f;
	int i_4_ = 0;
	Iterator iterator = aList5320.iterator();
	while (iterator.hasNext()) {
	    Class479 class479 = (Class479) iterator.next();
	    if (class479.method7851((byte) -72) != this)
		aList5320.remove(class479);
	    else {
		class479.method7811(aFloat5333, i, 59713917);
		i_4_++;
	    }
	}
	if (i_4_ == 0)
	    anInt5319 = i * 1356422045;
    }
    
    public void method8038(boolean bool, int i, int i_5_) {
	aBool5324 = bool;
	anInt5326 = 688825405 * i;
    }
    
    public void method8039(float f, byte i) {
	if (!(f < 0.0F))
	    aFloat5334 = f;
    }
    
    public Interface70 method8040(byte i) {
	return anInterface70_5317;
    }
    
    public void method8041(Class438 class438) {
	aClass438_5322 = class438;
    }
    
    public void method8042() {
	if (Class480.aClass480_5259 != aClass480_5318
	    && Class480.aClass480_5260 != aClass480_5318
	    && aClass480_5318 != Class480.aClass480_5252
	    && aClass480_5318 != Class480.aClass480_5258) {
	    if ((Class480.aClass480_5251 == aClass480_5318
		 || Class480.aClass480_5254 == aClass480_5318)
		&& !aBool5325)
		aBool5325 = true;
	    else if ((112577419 * aClass480_5318.anInt5261
		      < 112577419 * Class480.aClass480_5251.anInt5261)
		     || (112577419 * aClass480_5318.anInt5261
			 >= Class480.aClass480_5257.anInt5261 * 112577419)) {
		aClass480_5318 = Class480.aClass480_5251;
		aBool5325 = true;
	    }
	}
    }
    
    public void method8043() {
	if (!aBool5325
	    && (aClass480_5318 != Class480.aClass480_5259
		&& aClass480_5318 != Class480.aClass480_5260
		&& aClass480_5318 != Class480.aClass480_5252
		&& Class480.aClass480_5258 != aClass480_5318)
	    && ((112577419 * aClass480_5318.anInt5261
		 <= Class480.aClass480_5256.anInt5261 * 112577419)
		|| (aClass480_5318.anInt5261 * 112577419
		    >= Class480.aClass480_5257.anInt5261 * 112577419)))
	    aClass480_5318 = Class480.aClass480_5251;
    }
    
    public void method8044(Interface70 interface70) {
	anInterface70_5317 = interface70;
	aFloat5333 = 0.0F;
	aClass480_5318 = Class480.aClass480_5256;
    }
    
    public void method8045(float f) {
	if (!(f < 0.0F))
	    aFloat5334 = f;
    }
    
    public void method8046(int i) {
	if (112577419 * aClass480_5318.anInt5261
	    < 112577419 * Class480.aClass480_5257.anInt5261) {
	    if (aClass480_5318.anInt5261 * 112577419
		< Class480.aClass480_5255.anInt5261 * 112577419) {
		aClass480_5318 = Class480.aClass480_5257;
		aBool5325 = false;
	    } else if (i <= 0) {
		Iterator iterator = aList5320.iterator();
		while (iterator.hasNext()) {
		    Class479 class479 = (Class479) iterator.next();
		    if (class479.method7851((byte) -32) != this)
			iterator.remove();
		    else
			class479.method7862((byte) 61);
		}
		aClass480_5318 = Class480.aClass480_5257;
		aBool5325 = false;
	    } else {
		aClass480_5318 = Class480.aClass480_5258;
		Iterator iterator = aList5320.iterator();
		while (iterator.hasNext()) {
		    Class479 class479 = (Class479) iterator.next();
		    if (class479.method7851((byte) 8) != this)
			iterator.remove();
		    else
			class479.method7811(0.0F, i, 59713917);
		}
	    }
	}
    }
    
    public void method8047(float f) {
	aFloat5329 = f;
    }
    
    public void method8048(float f) {
	aFloat5329 = f;
    }
    
    public void method8049() {
	if (!aBool5325
	    && (aClass480_5318 != Class480.aClass480_5259
		&& aClass480_5318 != Class480.aClass480_5260
		&& aClass480_5318 != Class480.aClass480_5252
		&& Class480.aClass480_5258 != aClass480_5318)
	    && ((112577419 * aClass480_5318.anInt5261
		 <= Class480.aClass480_5256.anInt5261 * 112577419)
		|| (aClass480_5318.anInt5261 * 112577419
		    >= Class480.aClass480_5257.anInt5261 * 112577419)))
	    aClass480_5318 = Class480.aClass480_5251;
    }
    
    public void method8050(Interface58 interface58) {
	anInterface58_5327 = interface58;
    }
    
    public int method8051() {
	return anInt5323 * 712815011;
    }
    
    public void method8052(Object object) {
	anObject5316 = object;
    }
    
    public Object method8053() {
	return anObject5316;
    }
    
    public Object method8054() {
	return anObject5316;
    }
    
    public Object method8055() {
	return anObject5332;
    }
    
    public int method8056() {
	return anInt5323 * 712815011;
    }
    
    void method8057(byte i) {
	anInterface70_5317 = null;
	aClass480_5318 = Class480.aClass480_5252;
	aBool5325 = false;
	aList5320.clear();
	anObject5316 = null;
	aClass438_5322 = null;
	anInt5323 = -1589381643;
	aBool5324 = false;
	anInt5326 = 0;
	aFloat5333 = 0.0F;
	anInterface58_5327 = null;
	aFloat5328 = 0.0F;
	aFloat5329 = 0.0F;
	anInt5330 = 0;
	aBool5331 = false;
	anObject5332 = null;
	anInt5319 = 0;
	aFloat5334 = 1.0F;
    }
    
    public void method8058(int i) {
	anInt5323 = 1589381643 * i;
    }
    
    public void method8059(int i) {
	anInt5323 = 1589381643 * i;
    }
    
    public void method8060(boolean bool) {
	/* empty */
    }
    
    public Interface70 method8061() {
	return anInterface70_5317;
    }
    
    public Class491(Class367 class367) {
	anInt5319 = 0;
	aClass367_5321 = class367;
	aList5320 = new ArrayList();
    }
    
    public void method8062(Class438 class438) {
	aClass438_5322 = class438;
    }
    
    public Class480 method8063() {
	return aClass480_5318;
    }
    
    public void method8064(int i) {
	if (Class480.aClass480_5251 == aClass480_5318) {
	    Class592 class592 = anInterface70_5317.method470(-1416156032);
	    if (Class592.aClass592_7816 == class592)
		aClass480_5318 = Class480.aClass480_5254;
	}
	if (Class480.aClass480_5254 == aClass480_5318 && aBool5325 == true) {
	    Class479 class479
		= aClass367_5321.method6340(anInterface70_5317
						.method463(-1866410413),
					    1777010367);
	    if (class479 != null) {
		boolean bool = anInterface70_5317.method445((byte) 84);
		Class484 class484 = new Class484(this);
		boolean bool_6_
		    = (class479.method7813
		       ((bool ? null
			 : anInterface70_5317.method447(0, (byte) -103)),
			bool ? class484 : null, anInt5323 * 712815011,
			1654063797 * anInt5319 > 0 ? 0.0F : aFloat5333, false,
			aBool5324, 130814741 * anInt5326, aFloat5334, this,
			912686160));
		if (true == bool_6_) {
		    aClass480_5318 = Class480.aClass480_5255;
		    class479.method7816(anInterface58_5327, (byte) 2);
		    class479.method7811(aFloat5333, anInt5319 * 1654063797,
					59713917);
		    class479.method7814((byte) 119);
		    aList5320.add(class479);
		    aBool5325 = false;
		} else {
		    if (class479.method7853((byte) -66)
			== Class485.aClass485_5288)
			aClass480_5318 = Class480.aClass480_5253;
		    class479.method7810(-1817824158);
		}
	    }
	}
	Iterator iterator = aList5320.iterator();
	boolean bool = true;
	while (iterator.hasNext()) {
	    Class479 class479 = (Class479) iterator.next();
	    if (class479.method7851((byte) -3) != this)
		iterator.remove();
	    else {
		if (aClass480_5318 == Class480.aClass480_5258) {
		    if (class479.method7830(-1540258148) == 0.0F)
			class479.method7862((byte) 74);
		    else
			bool = false;
		}
		if (class479.method7908(246626426) == true
		    || class479.method7807(-1129140015) == true) {
		    class479.method7810(-1261125909);
		    iterator.remove();
		} else
		    bool = false;
	    }
	}
	if (bool
	    && (112577419 * aClass480_5318.anInt5261
		>= Class480.aClass480_5255.anInt5261 * 112577419)
	    && (112577419 * aClass480_5318.anInt5261
		< 112577419 * Class480.aClass480_5257.anInt5261)) {
	    if (aClass480_5318 == Class480.aClass480_5258)
		aClass480_5318 = Class480.aClass480_5257;
	    else
		aClass480_5318 = Class480.aClass480_5253;
	}
    }
    
    public Class438 method8065() {
	return aClass438_5322;
    }
    
    public void method8066() {
	if (!aBool5325
	    && (aClass480_5318 != Class480.aClass480_5259
		&& aClass480_5318 != Class480.aClass480_5260
		&& aClass480_5318 != Class480.aClass480_5252
		&& Class480.aClass480_5258 != aClass480_5318)
	    && ((112577419 * aClass480_5318.anInt5261
		 <= Class480.aClass480_5256.anInt5261 * 112577419)
		|| (aClass480_5318.anInt5261 * 112577419
		    >= Class480.aClass480_5257.anInt5261 * 112577419)))
	    aClass480_5318 = Class480.aClass480_5251;
    }
    
    public float method8067() {
	return aFloat5328;
    }
    
    public float method8068() {
	return aFloat5328;
    }
    
    public void method8069(int i) {
	if (Class480.aClass480_5259 != aClass480_5318
	    && Class480.aClass480_5260 != aClass480_5318
	    && aClass480_5318 != Class480.aClass480_5252
	    && aClass480_5318 != Class480.aClass480_5258) {
	    if ((Class480.aClass480_5251 == aClass480_5318
		 || Class480.aClass480_5254 == aClass480_5318)
		&& !aBool5325)
		aBool5325 = true;
	    else if ((112577419 * aClass480_5318.anInt5261
		      < 112577419 * Class480.aClass480_5251.anInt5261)
		     || (112577419 * aClass480_5318.anInt5261
			 >= Class480.aClass480_5257.anInt5261 * 112577419)) {
		aClass480_5318 = Class480.aClass480_5251;
		aBool5325 = true;
	    }
	}
    }
    
    public void method8070(float f) {
	aFloat5329 = f;
    }
    
    public float method8071() {
	return aFloat5329;
    }
    
    public void method8072() {
	Iterator iterator = aList5320.iterator();
	aClass480_5318 = Class480.aClass480_5257;
	while (iterator.hasNext()) {
	    Class479 class479 = (Class479) iterator.next();
	    if (class479.method7851((byte) 59) == this)
		class479.method7828((byte) -13);
	}
    }
    
    public void method8073(int i, boolean bool) {
	aBool5331 = bool;
	anInt5330 = -1873863177 * i;
    }
    
    public void method8074() {
	Iterator iterator = aList5320.iterator();
	aClass480_5318 = Class480.aClass480_5257;
	while (iterator.hasNext()) {
	    Class479 class479 = (Class479) iterator.next();
	    if (class479.method7851((byte) -86) == this)
		class479.method7828((byte) 13);
	}
    }
    
    public void method8075() {
	if (anInt5330 * -791366713 > -1 && !aBool5331)
	    anInt5330 -= -1873863177;
	if (anInt5330 * -791366713 == 0)
	    method8069(2080004880);
    }
    
    public void method8076() {
	if (anInt5330 * -791366713 > -1 && !aBool5331)
	    anInt5330 -= -1873863177;
	if (anInt5330 * -791366713 == 0)
	    method8069(2037905041);
    }
    
    public void method8077(float f, int i) {
	aFloat5333 = f;
	int i_7_ = 0;
	Iterator iterator = aList5320.iterator();
	while (iterator.hasNext()) {
	    Class479 class479 = (Class479) iterator.next();
	    if (class479.method7851((byte) 41) != this)
		aList5320.remove(class479);
	    else {
		class479.method7811(aFloat5333, i, 59713917);
		i_7_++;
	    }
	}
	if (i_7_ == 0)
	    anInt5319 = i * 1356422045;
    }
    
    public void method8078(float f, int i) {
	aFloat5333 = f;
	int i_8_ = 0;
	Iterator iterator = aList5320.iterator();
	while (iterator.hasNext()) {
	    Class479 class479 = (Class479) iterator.next();
	    if (class479.method7851((byte) 40) != this)
		aList5320.remove(class479);
	    else {
		class479.method7811(aFloat5333, i, 59713917);
		i_8_++;
	    }
	}
	if (i_8_ == 0)
	    anInt5319 = i * 1356422045;
    }
    
    public void method8079(boolean bool, int i) {
	aBool5324 = bool;
	anInt5326 = 688825405 * i;
    }
    
    public boolean method8080() {
	aBool5331 = false;
	return anInt5330 * -791366713 != 0;
    }
    
    static final void method8081(Class669 class669, int i) {
	int i_9_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (client.anInt11171 * -1050164879 == 2
	    && i_9_ < client.anInt11324 * -1979292205)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 557433037 * client.aClass28Array11327[i_9_].anInt253;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method8082(int i, Class247 class247, Class669 class669,
				 byte i_10_) {
	if (i < 1 || i > 10)
	    throw new RuntimeException();
	Class273.method5102(i, class247.anInt2454 * -1278450723,
			    class247.anInt2580 * 1365669833, "", (byte) -4);
    }
    
    static final void method8083(Class669 class669, int i) {
	Class534_Sub29 class534_sub29 = Class324_Sub2.method15700(1525269932);
	if (null == class534_sub29) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1592054281 * class534_sub29.anInt10652;
	    int i_11_ = (197477433 * class534_sub29.anInt10650 << 28
			 | (1412374331 * class534_sub29.anInt10655
			    + Class554.anInt7368) << 14
			 | (Class554.anInt7369
			    + -958626707 * class534_sub29.anInt10653));
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= i_11_;
	}
    }
}
