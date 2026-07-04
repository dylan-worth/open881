/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class235
{
    List aList2362;
    static final int anInt2363 = 8;
    public int anInt2364;
    static final int anInt2365 = 40;
    List aList2366;
    List aList2367;
    List aList2368;
    static Integer anInteger2369 = Integer.valueOf(-1);
    static boolean aBool2370;
    
    public int method4345(int i, int i_0_, int i_1_) {
	if (aList2367.size() == 40)
	    throw new RuntimeException("");
	if (method4348(i, 766336471) != -1)
	    throw new RuntimeException("");
	if (-1 == i_0_)
	    i_0_ = aList2367.size();
	method4362(i, i_0_, 1908858433);
	for (int i_2_ = 1 + i_0_; i_2_ < aList2367.size(); i_2_++) {
	    Integer integer = (Integer) aList2368.get(i_2_);
	    if (!integer.equals(anInteger2369) && integer.intValue() < i_2_)
		method4367(i_2_, i_2_ - 1, (byte) -3);
	}
	return method4348(i, 766336471);
    }
    
    public int method4346(int i) {
	return aList2366.size();
    }
    
    public int method4347(int i) {
	return aList2367.size();
    }
    
    public int method4348(int i, int i_3_) {
	return aList2367.indexOf(Integer.valueOf(i));
    }
    
    public int method4349(int i, byte i_4_) {
	return ((Integer) aList2367.get(i)).intValue();
    }
    
    public int method4350(int i, byte i_5_) {
	return aList2366.indexOf(Integer.valueOf(i));
    }
    
    public int method4351(int i) {
	return ((Integer) aList2367.get(i)).intValue();
    }
    
    public int method4352(int i, byte i_6_) {
	return method4356(i, -1, -487216598);
    }
    
    public void method4353(int i, int i_7_) {
	aList2368.set(i, Integer.valueOf(i_7_));
    }
    
    public void method4354(int i, int i_8_, byte i_9_) {
	method4367(i, i_8_, (byte) -24);
	for (int i_10_ = 0; i_10_ < aList2368.size(); i_10_++) {
	    Integer integer = (Integer) aList2368.get(i_10_);
	    if (!integer.equals(anInteger2369)) {
		Integer integer_11_ = Integer.valueOf(i_10_);
		if (!integer.equals(integer_11_))
		    aList2368.set(i_10_, integer_11_);
	    }
	}
    }
    
    public boolean method4355(int i, int i_12_) {
	return !((Integer) aList2368.get(i)).equals(anInteger2369);
    }
    
    public int method4356(int i, int i_13_, int i_14_) {
	if (aList2366.size() == 8)
	    throw new RuntimeException("");
	if (method4350(i, (byte) -81) != -1)
	    throw new RuntimeException("");
	if (-1 == i_13_)
	    i_13_ = aList2366.size();
	aList2366.add(i_13_, Integer.valueOf(i));
	Iterator iterator = aList2362.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_13_, null);
	}
	return i_13_;
    }
    
    public boolean method4357(int i) {
	return !((Integer) aList2368.get(i)).equals(anInteger2369);
    }
    
    public int method4358(int i, byte i_15_) {
	return method4345(i, -1, 356397921);
    }
    
    public int method4359(int i) {
	return method4345(i, -1, 356397921);
    }
    
    public void method4360(int i, int i_16_) {
	aList2366.add(i_16_, aList2366.remove(i));
	Iterator iterator = aList2362.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_16_, list.remove(i));
	}
    }
    
    public void method4361(int i, boolean bool, int i_17_) {
	aList2368.set(i, bool ? Integer.valueOf(i) : anInteger2369);
    }
    
    void method4362(int i, int i_18_, int i_19_) {
	aList2367.add(i_18_, Integer.valueOf(i));
	aList2368.add(i_18_, anInteger2369);
	ArrayList arraylist = new ArrayList();
	for (int i_20_ = 0; i_20_ < aList2366.size(); i_20_++)
	    arraylist.add(null);
	aList2362.add(i_18_, arraylist);
    }
    
    public void method4363(int i, int i_21_) {
	method4364(i, 2005881051);
	int i_22_ = i;
	for (int i_23_ = i; i_23_ < aList2367.size(); i_23_++) {
	    if (!method4355(i_23_, -1165043158)) {
		if (i_22_ != i_23_)
		    method4367(i_23_, i_22_, (byte) -44);
		i_22_ = i_23_ + 1;
	    }
	}
    }
    
    void method4364(int i, int i_24_) {
	aList2367.remove(i);
	aList2368.remove(i);
	aList2362.remove(i);
    }
    
    public int method4365(int i, int i_25_) {
	if (aList2367.size() == 40)
	    throw new RuntimeException("");
	if (method4348(i, 766336471) != -1)
	    throw new RuntimeException("");
	if (-1 == i_25_)
	    i_25_ = aList2367.size();
	method4362(i, i_25_, 638800639);
	for (int i_26_ = 1 + i_25_; i_26_ < aList2367.size(); i_26_++) {
	    Integer integer = (Integer) aList2368.get(i_26_);
	    if (!integer.equals(anInteger2369) && integer.intValue() < i_26_)
		method4367(i_26_, i_26_ - 1, (byte) -56);
	}
	return method4348(i, 766336471);
    }
    
    public Class235(int i) {
	anInt2364 = 683959903 * i;
	aList2366 = new ArrayList();
	aList2367 = new ArrayList();
	aList2368 = new ArrayList();
	aList2362 = new ArrayList();
    }
    
    public void method4366(int i, int i_27_, Object object, int i_28_) {
	((List) aList2362.get(i)).set(i_27_, object);
    }
    
    void method4367(int i, int i_29_, byte i_30_) {
	aList2367.add(i_29_, aList2367.remove(i));
	aList2368.add(i_29_, aList2368.remove(i));
	aList2362.add(i_29_, aList2362.remove(i));
    }
    
    public int method4368() {
	return aList2367.size();
    }
    
    public int method4369(int i) {
	return ((Integer) aList2367.get(i)).intValue();
    }
    
    public void method4370(int i, boolean bool) {
	aList2368.set(i, bool ? Integer.valueOf(i) : anInteger2369);
    }
    
    public int method4371(int i, int i_31_) {
	return ((Integer) aList2366.get(i)).intValue();
    }
    
    public int method4372(int i) {
	return ((Integer) aList2367.get(i)).intValue();
    }
    
    public int method4373(int i) {
	return aList2366.indexOf(Integer.valueOf(i));
    }
    
    public int method4374(int i) {
	return aList2366.indexOf(Integer.valueOf(i));
    }
    
    public int method4375(int i) {
	return ((Integer) aList2366.get(i)).intValue();
    }
    
    public Object method4376(int i, int i_32_, short i_33_) {
	return ((List) aList2362.get(i)).get(i_32_);
    }
    
    public int method4377(int i) {
	return method4356(i, -1, -1358483133);
    }
    
    public int method4378(int i) {
	return method4356(i, -1, 1090754236);
    }
    
    public int method4379(int i) {
	return method4356(i, -1, 1297468569);
    }
    
    public void method4380(int i, byte i_34_) {
	aList2366.remove(i);
	Iterator iterator = aList2362.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.remove(i);
	}
    }
    
    public void method4381(int i, int i_35_) {
	aList2368.set(i, Integer.valueOf(i_35_));
    }
    
    public void method4382(int i, int i_36_, int i_37_) {
	aList2368.set(i, Integer.valueOf(i_36_));
    }
    
    public void method4383(int i) {
	method4364(i, 473600454);
	int i_38_ = i;
	for (int i_39_ = i; i_39_ < aList2367.size(); i_39_++) {
	    if (!method4355(i_39_, -1522025000)) {
		if (i_38_ != i_39_)
		    method4367(i_39_, i_38_, (byte) -90);
		i_38_ = i_39_ + 1;
	    }
	}
    }
    
    public boolean method4384(int i) {
	return !((Integer) aList2368.get(i)).equals(anInteger2369);
    }
    
    public int method4385(int i, int i_40_) {
	if (aList2366.size() == 8)
	    throw new RuntimeException("");
	if (method4350(i, (byte) -47) != -1)
	    throw new RuntimeException("");
	if (-1 == i_40_)
	    i_40_ = aList2366.size();
	aList2366.add(i_40_, Integer.valueOf(i));
	Iterator iterator = aList2362.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_40_, null);
	}
	return i_40_;
    }
    
    public int method4386(int i, int i_41_) {
	if (aList2366.size() == 8)
	    throw new RuntimeException("");
	if (method4350(i, (byte) -76) != -1)
	    throw new RuntimeException("");
	if (-1 == i_41_)
	    i_41_ = aList2366.size();
	aList2366.add(i_41_, Integer.valueOf(i));
	Iterator iterator = aList2362.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_41_, null);
	}
	return i_41_;
    }
    
    public int method4387(int i, int i_42_) {
	if (aList2366.size() == 8)
	    throw new RuntimeException("");
	if (method4350(i, (byte) -49) != -1)
	    throw new RuntimeException("");
	if (-1 == i_42_)
	    i_42_ = aList2366.size();
	aList2366.add(i_42_, Integer.valueOf(i));
	Iterator iterator = aList2362.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_42_, null);
	}
	return i_42_;
    }
    
    public void method4388(int i, int i_43_) {
	aList2366.add(i_43_, aList2366.remove(i));
	Iterator iterator = aList2362.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_43_, list.remove(i));
	}
    }
    
    public void method4389(int i, int i_44_) {
	method4367(i, i_44_, (byte) -60);
	for (int i_45_ = 0; i_45_ < aList2368.size(); i_45_++) {
	    Integer integer = (Integer) aList2368.get(i_45_);
	    if (!integer.equals(anInteger2369)) {
		Integer integer_46_ = Integer.valueOf(i_45_);
		if (!integer.equals(integer_46_))
		    aList2368.set(i_45_, integer_46_);
	    }
	}
    }
    
    public void method4390(int i, int i_47_) {
	method4367(i, i_47_, (byte) 2);
	for (int i_48_ = 0; i_48_ < aList2368.size(); i_48_++) {
	    Integer integer = (Integer) aList2368.get(i_48_);
	    if (!integer.equals(anInteger2369)) {
		Integer integer_49_ = Integer.valueOf(i_48_);
		if (!integer.equals(integer_49_))
		    aList2368.set(i_48_, integer_49_);
	    }
	}
    }
    
    void method4391(int i, int i_50_) {
	aList2367.add(i_50_, aList2367.remove(i));
	aList2368.add(i_50_, aList2368.remove(i));
	aList2362.add(i_50_, aList2362.remove(i));
    }
    
    public int method4392() {
	return aList2367.size();
    }
    
    public int method4393(int i, int i_51_) {
	if (aList2367.size() == 40)
	    throw new RuntimeException("");
	if (method4348(i, 766336471) != -1)
	    throw new RuntimeException("");
	if (-1 == i_51_)
	    i_51_ = aList2367.size();
	method4362(i, i_51_, 707987348);
	for (int i_52_ = 1 + i_51_; i_52_ < aList2367.size(); i_52_++) {
	    Integer integer = (Integer) aList2368.get(i_52_);
	    if (!integer.equals(anInteger2369) && integer.intValue() < i_52_)
		method4367(i_52_, i_52_ - 1, (byte) -92);
	}
	return method4348(i, 766336471);
    }
    
    public int method4394(int i, int i_53_) {
	if (aList2367.size() == 40)
	    throw new RuntimeException("");
	if (method4348(i, 766336471) != -1)
	    throw new RuntimeException("");
	if (-1 == i_53_)
	    i_53_ = aList2367.size();
	method4362(i, i_53_, 767724602);
	for (int i_54_ = 1 + i_53_; i_54_ < aList2367.size(); i_54_++) {
	    Integer integer = (Integer) aList2368.get(i_54_);
	    if (!integer.equals(anInteger2369) && integer.intValue() < i_54_)
		method4367(i_54_, i_54_ - 1, (byte) -121);
	}
	return method4348(i, 766336471);
    }
    
    void method4395(int i, int i_55_) {
	aList2367.add(i_55_, Integer.valueOf(i));
	aList2368.add(i_55_, anInteger2369);
	ArrayList arraylist = new ArrayList();
	for (int i_56_ = 0; i_56_ < aList2366.size(); i_56_++)
	    arraylist.add(null);
	aList2362.add(i_55_, arraylist);
    }
    
    public int method4396() {
	return aList2366.size();
    }
    
    public void method4397(int i) {
	method4364(i, 1285470465);
	int i_57_ = i;
	for (int i_58_ = i; i_58_ < aList2367.size(); i_58_++) {
	    if (!method4355(i_58_, -1450779945)) {
		if (i_57_ != i_58_)
		    method4367(i_58_, i_57_, (byte) -102);
		i_57_ = i_58_ + 1;
	    }
	}
    }
    
    public void method4398(int i) {
	method4364(i, 1981417846);
	int i_59_ = i;
	for (int i_60_ = i; i_60_ < aList2367.size(); i_60_++) {
	    if (!method4355(i_60_, -1529712420)) {
		if (i_59_ != i_60_)
		    method4367(i_60_, i_59_, (byte) -45);
		i_59_ = i_60_ + 1;
	    }
	}
    }
    
    void method4399(int i) {
	aList2367.remove(i);
	aList2368.remove(i);
	aList2362.remove(i);
    }
    
    public void method4400(int i, int i_61_, int i_62_) {
	aList2366.add(i_61_, aList2366.remove(i));
	Iterator iterator = aList2362.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_61_, list.remove(i));
	}
    }
    
    public int method4401(int i) {
	return ((Integer) aList2366.get(i)).intValue();
    }
    
    public void method4402(int i, int i_63_) {
	aList2366.add(i_63_, aList2366.remove(i));
	Iterator iterator = aList2362.iterator();
	while (iterator.hasNext()) {
	    List list = (List) iterator.next();
	    list.add(i_63_, list.remove(i));
	}
    }
    
    public static void method4403(int i) {
	Class449.anInt4912 = 0;
	Class449.anInt4913 = 0;
    }
    
    static final void method4404(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class206_Sub1.method15706(class247, class243, class669, (byte) 4);
    }
    
    static final void method4405(Class669 class669, byte i) {
	int i_64_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_64_, -7484483);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_64_ >> 16];
	Class489.method8007(class247, class243, class669, -490792390);
    }
    
    static final void method4406(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -742015869 * class247.anInt2472;
    }
    
    static final void method4407(Class669 class669, int i) {
	int i_65_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_65_, 953102952);
	Class504.method8321(class247, class669, 1989806465);
    }
    
    public static final void method4408(int i, byte i_66_) {
	for (int i_67_ = 0; i_67_ < 5; i_67_++)
	    client.aBoolArray11172[i_67_] = false;
	client.anInt11152 = 1871523627;
	client.anInt11153 = -378787251;
	Class77.anInt820 = 0;
	Class221.anInt2311 = 0;
	Class106.anInt1312 = 309821991;
	Class93.anInt901 = 1899572639;
	Class10.anInt75 = i * -1822037319;
	if (3 != -891094135 * Class10.anInt75)
	    Class1.aLong18 = 0L;
    }
}
