/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Class214
{
    boolean aBool2281;
    static final int anInt2282 = 1;
    static final int anInt2283 = 2;
    String aString2284;
    long aLong2285;
    long aLong2286;
    int anInt2287;
    boolean aBool2288;
    static final int anInt2289 = 4;
    Class8 aClass8_2290;
    ArrayList anArrayList2291;
    boolean aBool2292;
    int anInt2293;
    ArrayList anArrayList2294;
    int anInt2295 = 1671172763;
    static final int anInt2296 = 1;
    
    void method4025(int i, int i_0_) {
	Class212 class212 = (Class212) anArrayList2291.get(i);
	class212.method3989(false, (byte) 117);
    }
    
    public List method4026(int i) {
	return Collections.unmodifiableList(anArrayList2291);
    }
    
    void method4027(int i, boolean bool) {
	Class212 class212 = (Class212) anArrayList2291.get(i);
	class212.method3972((bool ? Class260.aClass260_2784
			     : Class260.aClass260_2787),
			    1910819261);
    }
    
    int method4028(byte i) {
	return anInt2293 * 1394928829;
    }
    
    public int method4029(int i) {
	return -1330938771 * anInt2295;
    }
    
    public boolean method4030(int i) {
	return aBool2288;
    }
    
    public int method4031(int i) {
	return -1948842141 * anInt2287;
    }
    
    public long method4032(byte i) {
	return aLong2286 * 338886626505790529L;
    }
    
    public int hashCode() {
	return (int) (aLong2285 * -7721770475843032135L);
    }
    
    void method4033(int i) {
	int i_1_ = -1;
	int i_2_ = -1;
	for (int i_3_ = 0; i_3_ < anArrayList2291.size(); i_3_++) {
	    Class212 class212 = (Class212) anArrayList2291.get(i_3_);
	    int i_4_ = class212.method3962((byte) -18);
	    if (i_4_ > i_1_) {
		i_1_ = i_4_;
		i_2_ = i_3_;
	    }
	}
	anInt2295 = -1671172763 * i_2_;
    }
    
    void method4034(byte i) {
	anInt2293 += -738365803;
    }
    
    public Class260 method4035(int i) {
	if (anArrayList2291.isEmpty())
	    return Class260.aClass260_2787;
	Class260 class260
	    = ((Class212) anArrayList2291.get(0)).method3968(-1879455296);
	switch (-1208833837 * class260.anInt2788) {
	case 1:
	case 3:
	    return class260;
	default: {
	    Iterator iterator = anArrayList2291.iterator();
	    while (iterator.hasNext()) {
		Class212 class212 = (Class212) iterator.next();
		if (class212.method3968(-824705832) == Class260.aClass260_2787)
		    return Class260.aClass260_2787;
	    }
	    return Class260.aClass260_2784;
	}
	}
    }
    
    void method4036() {
	int i = -1;
	int i_5_ = -1;
	for (int i_6_ = 0; i_6_ < anArrayList2291.size(); i_6_++) {
	    Class212 class212 = (Class212) anArrayList2291.get(i_6_);
	    int i_7_ = class212.method3962((byte) -115);
	    if (i_7_ > i) {
		i = i_7_;
		i_5_ = i_6_;
	    }
	}
	anInt2295 = -1671172763 * i_5_;
    }
    
    public long method4037() {
	return aLong2286 * 338886626505790529L;
    }
    
    void method4038(int i, Class212 class212) {
	Class212 class212_8_ = (Class212) anArrayList2291.get(i);
	class212_8_.method3975(class212, 1246876460);
    }
    
    public Class214(long l, Class534_Sub40 class534_sub40, boolean bool,
		    Interface27 interface27) {
	aLong2285 = 3517310916911409801L * l;
	int i = class534_sub40.method16527(643354241);
	if (i == 1) {
	    int i_9_ = class534_sub40.method16527(-352973537);
	    aBool2288 = (i_9_ & 0x1) != 0;
	    aBool2292 = (i_9_ & 0x2) != 0;
	    aBool2281 = (i_9_ & 0x4) != 0;
	    anInt2293 = class534_sub40.method16533(-258848859) * -738365803;
	    aLong2286 = (class534_sub40.method16537(1359621443)
			 * -7781335585505674303L);
	    aString2284 = class534_sub40.method16541((byte) -30);
	    anInt2287 = class534_sub40.method16530((byte) -71) * 1225437771;
	    class534_sub40.method16533(-258848859);
	    class534_sub40.method16537(1359621443);
	    int i_10_ = class534_sub40.method16529((byte) 1);
	    anArrayList2291 = new ArrayList(i_10_);
	    for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
		anArrayList2291.add(new Class212(class534_sub40, aBool2292,
						 aBool2281, interface27));
	    int i_12_ = class534_sub40.method16529((byte) 1);
	    anArrayList2294 = new ArrayList(i_12_);
	    for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
		anArrayList2294.add(new Class225(class534_sub40, aBool2292,
						 aBool2281));
	    aClass8_2290 = new Class8(interface27.method160(1938137291));
	    int i_14_ = class534_sub40.method16529((byte) 1);
	    for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
		Class429 class429
		    = interface27.method160(-1270389227)
			  .method14495(class534_sub40, (byte) -24);
		aClass8_2290.method29(-608978823 * class429.anInt4820,
				      class429.anObject4819, (short) -7541);
	    }
	    if (!bool) {
		class534_sub40.method16529((byte) 1);
		class534_sub40.method16529((byte) 1);
		class534_sub40.method16529((byte) 1);
		class534_sub40.method16529((byte) 1);
		class534_sub40.method16529((byte) 1);
	    }
	    method4033(1920359350);
	}
    }
    
    void method4039(int i, byte i_16_) {
	anArrayList2291.remove(i);
	method4033(1936468697);
    }
    
    void method4040(Class225 class225, byte i) {
	anArrayList2294.add(class225);
    }
    
    void method4041(int i, byte i_17_) {
	anArrayList2294.remove(i);
    }
    
    public Interface19 method4042(int i) {
	return new Class155(Class453.aClass453_4950, aClass8_2290);
    }
    
    void method4043(int i, int i_18_, int i_19_) {
	Class212 class212 = (Class212) anArrayList2291.get(i);
	class212.method3965(i_18_, -1924246800);
	class212.method3989(true, (byte) 85);
    }
    
    public Class212 method4044(int i, int i_20_) {
	if (i == -1)
	    return null;
	return (Class212) anArrayList2291.get(i);
    }
    
    void method4045(int i, boolean bool, int i_21_) {
	Class212 class212 = (Class212) anArrayList2291.get(i);
	class212.method3972((bool ? Class260.aClass260_2784
			     : Class260.aClass260_2787),
			    1915097080);
    }
    
    void method4046(Class212 class212) {
	anArrayList2291.add(class212);
	method4033(2049538343);
    }
    
    void method4047(byte i) {
	Iterator iterator = anArrayList2291.iterator();
	while (iterator.hasNext()) {
	    Class212 class212 = (Class212) iterator.next();
	    class212.method3972(Class260.aClass260_2786, 2010374714);
	}
    }
    
    void method4048(int i, int i_22_, byte i_23_) {
	((Class212) anArrayList2291.get(i)).method3971(i_22_, (short) 128);
    }
    
    void method4049(int i, Class212 class212, byte i_24_) {
	Class212 class212_25_ = (Class212) anArrayList2291.get(i);
	class212_25_.method3975(class212, 1257076378);
    }
    
    void method4050() {
	Iterator iterator = anArrayList2291.iterator();
	while (iterator.hasNext()) {
	    Class212 class212 = (Class212) iterator.next();
	    class212.method3972(Class260.aClass260_2786, 2054128170);
	}
    }
    
    public List method4051() {
	return Collections.unmodifiableList(anArrayList2294);
    }
    
    void method4052() {
	anInt2293 += -738365803;
    }
    
    void method4053() {
	anInt2293 += -738365803;
    }
    
    void method4054() {
	anInt2293 += -738365803;
    }
    
    public boolean method4055() {
	return aBool2288;
    }
    
    void method4056(int i) {
	Class212 class212 = (Class212) anArrayList2291.get(i);
	class212.method3989(false, (byte) 66);
    }
    
    void method4057() {
	Iterator iterator = anArrayList2291.iterator();
	while (iterator.hasNext()) {
	    Class212 class212 = (Class212) iterator.next();
	    class212.method3972(Class260.aClass260_2789, 2070838114);
	}
    }
    
    public boolean method4058() {
	return aBool2288;
    }
    
    public int method4059() {
	return -1948842141 * anInt2287;
    }
    
    public Interface19 method4060() {
	return new Class155(Class453.aClass453_4950, aClass8_2290);
    }
    
    public long method4061() {
	return aLong2286 * 338886626505790529L;
    }
    
    public boolean method4062() {
	return aBool2288;
    }
    
    void method4063(Class225 class225) {
	anArrayList2294.add(class225);
    }
    
    void method4064() {
	int i = -1;
	int i_26_ = -1;
	for (int i_27_ = 0; i_27_ < anArrayList2291.size(); i_27_++) {
	    Class212 class212 = (Class212) anArrayList2291.get(i_27_);
	    int i_28_ = class212.method3962((byte) -96);
	    if (i_28_ > i) {
		i = i_28_;
		i_26_ = i_27_;
	    }
	}
	anInt2295 = -1671172763 * i_26_;
    }
    
    void method4065() {
	int i = -1;
	int i_29_ = -1;
	for (int i_30_ = 0; i_30_ < anArrayList2291.size(); i_30_++) {
	    Class212 class212 = (Class212) anArrayList2291.get(i_30_);
	    int i_31_ = class212.method3962((byte) -120);
	    if (i_31_ > i) {
		i = i_31_;
		i_29_ = i_30_;
	    }
	}
	anInt2295 = -1671172763 * i_29_;
    }
    
    public int method4066() {
	return -1330938771 * anInt2295;
    }
    
    public Class212 method4067(int i) {
	if (i == -1)
	    return null;
	return (Class212) anArrayList2291.get(i);
    }
    
    public int method4068() {
	return -1330938771 * anInt2295;
    }
    
    public Class260 method4069() {
	if (anArrayList2291.isEmpty())
	    return Class260.aClass260_2787;
	Class260 class260
	    = ((Class212) anArrayList2291.get(0)).method3968(-1674760156);
	switch (-1208833837 * class260.anInt2788) {
	case 1:
	case 3:
	    return class260;
	default: {
	    Iterator iterator = anArrayList2291.iterator();
	    while (iterator.hasNext()) {
		Class212 class212 = (Class212) iterator.next();
		if (class212.method3968(-1198599301)
		    == Class260.aClass260_2787)
		    return Class260.aClass260_2787;
	    }
	    return Class260.aClass260_2784;
	}
	}
    }
    
    public boolean method4070() {
	return aBool2288;
    }
    
    public Class212 method4071(int i) {
	if (i == -1)
	    return null;
	return (Class212) anArrayList2291.get(i);
    }
    
    public Class212 method4072(int i) {
	if (i == -1)
	    return null;
	return (Class212) anArrayList2291.get(i);
    }
    
    public Interface19 method4073() {
	return new Class155(Class453.aClass453_4950, aClass8_2290);
    }
    
    public List method4074(int i) {
	return Collections.unmodifiableList(anArrayList2294);
    }
    
    public Interface19 method4075() {
	return new Class155(Class453.aClass453_4950, aClass8_2290);
    }
    
    void method4076(int i, int i_32_, int i_33_) {
	((Class212) anArrayList2291.get(i)).method3963(i_32_, -1850530127);
	method4033(2071636815);
    }
    
    void method4077(Class225 class225) {
	anArrayList2294.add(class225);
    }
    
    void method4078(int i) {
	anArrayList2291.remove(i);
	method4033(2013196782);
    }
    
    void method4079(int i) {
	anArrayList2291.remove(i);
	method4033(1975132821);
    }
    
    public List method4080() {
	return Collections.unmodifiableList(anArrayList2291);
    }
    
    void method4081(int i) {
	anArrayList2291.remove(i);
	method4033(1970314595);
    }
    
    void method4082(int i, int i_34_) {
	((Class212) anArrayList2291.get(i)).method3963(i_34_, -1850530127);
	method4033(2092059194);
    }
    
    void method4083(int i) {
	anArrayList2291.remove(i);
	method4033(2013171312);
    }
    
    public String method4084(int i) {
	return aString2284;
    }
    
    void method4085(int i, int i_35_) {
	((Class212) anArrayList2291.get(i)).method3963(i_35_, -1850530127);
	method4033(2000304200);
    }
    
    void method4086(int i, int i_36_) {
	Class212 class212 = (Class212) anArrayList2291.get(i);
	class212.method3965(i_36_, 1693201711);
	class212.method3989(true, (byte) 93);
    }
    
    void method4087(int i, int i_37_) {
	Class212 class212 = (Class212) anArrayList2291.get(i);
	class212.method3965(i_37_, 290403863);
	class212.method3989(true, (byte) 57);
    }
    
    public Interface19 method4088() {
	return new Class155(Class453.aClass453_4950, aClass8_2290);
    }
    
    void method4089(int i, boolean bool) {
	Class212 class212 = (Class212) anArrayList2291.get(i);
	class212.method3972((bool ? Class260.aClass260_2784
			     : Class260.aClass260_2787),
			    1874509030);
    }
    
    void method4090(int i) {
	Iterator iterator = anArrayList2291.iterator();
	while (iterator.hasNext()) {
	    Class212 class212 = (Class212) iterator.next();
	    class212.method3972(Class260.aClass260_2789, 1906803235);
	}
    }
    
    public int method4091() {
	return (int) (aLong2285 * -7721770475843032135L);
    }
    
    void method4092() {
	Iterator iterator = anArrayList2291.iterator();
	while (iterator.hasNext()) {
	    Class212 class212 = (Class212) iterator.next();
	    class212.method3972(Class260.aClass260_2789, 1947146885);
	}
    }
    
    void method4093() {
	Iterator iterator = anArrayList2291.iterator();
	while (iterator.hasNext()) {
	    Class212 class212 = (Class212) iterator.next();
	    class212.method3972(Class260.aClass260_2789, 1903094293);
	}
    }
    
    void method4094(Class212 class212, int i) {
	anArrayList2291.add(class212);
	method4033(2057598344);
    }
    
    void method4095() {
	Iterator iterator = anArrayList2291.iterator();
	while (iterator.hasNext()) {
	    Class212 class212 = (Class212) iterator.next();
	    class212.method3972(Class260.aClass260_2789, 1971869110);
	}
    }
    
    void method4096(int i, Class212 class212) {
	Class212 class212_38_ = (Class212) anArrayList2291.get(i);
	class212_38_.method3975(class212, -128395420);
    }
    
    void method4097(int i, Class212 class212) {
	Class212 class212_39_ = (Class212) anArrayList2291.get(i);
	class212_39_.method3975(class212, 1635711602);
    }
    
    public Class260 method4098() {
	if (anArrayList2291.isEmpty())
	    return Class260.aClass260_2787;
	Class260 class260
	    = ((Class212) anArrayList2291.get(0)).method3968(-1148674221);
	switch (-1208833837 * class260.anInt2788) {
	case 1:
	case 3:
	    return class260;
	default: {
	    Iterator iterator = anArrayList2291.iterator();
	    while (iterator.hasNext()) {
		Class212 class212 = (Class212) iterator.next();
		if (class212.method3968(-1447703659)
		    == Class260.aClass260_2787)
		    return Class260.aClass260_2787;
	    }
	    return Class260.aClass260_2784;
	}
	}
    }
    
    static void method4099(Class185 class185, int i, int i_40_, int i_41_,
			   int i_42_, int i_43_, int i_44_, byte i_45_) {
	class185.method3292(i, i_40_, i_41_, i_42_, i_43_, -1772161864);
	class185.method3292(i + 1, i_40_ + 1, i_41_ - 2, 16, i_44_,
			    -1595807420);
	class185.method3425(i + 1, 18 + i_40_, i_41_ - 2, i_42_ - 19, i_44_,
			    16821800);
    }
    
    static final void method4100(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (string.startsWith(Class108.method1965(0, 696334431))
	    || string.startsWith(Class108.method1965(1, 1241856051)))
	    string = string.substring(7);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class431.method6837(string, 1053102402);
    }
    
    static final void method4101(Class669 class669, int i) {
	int i_46_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (((Class15)
		Class531.aClass44_Sub7_7135.method91(i_46_, 20604449)).anInt130
	       * 1996490023);
    }
    
    static final void method4102(Class669 class669, int i) {
	int i_47_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub25_10750
		  .method14026(i_47_, -2024064741);
    }
    
    static final void method4103(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    static final int method4104(int i, byte i_48_) {
	return i < 7 ? 7 : 10;
    }
    
    public static void method4105(int i, int i_49_, int i_50_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(17, (long) i_49_ << 32 | (long) i);
	class534_sub18_sub6.method18182(-1052637456);
    }
}
