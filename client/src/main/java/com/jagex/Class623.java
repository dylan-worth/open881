/* Class623 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;

public class Class623 implements Iterable
{
    Class633[] aClass633Array8147;
    Class620[] aClass620Array8148;
    static int anInt8149;
    
    void method10292(byte[] is, short i) {
	method10293(1536517731);
	if (is == null)
	    aClass633Array8147 = new Class633[0];
	else
	    method10295(new Class534_Sub40(is), (byte) -77);
    }
    
    void method10293(int i) {
	aClass633Array8147 = null;
    }
    
    void method10294() {
	aClass633Array8147 = null;
    }
    
    void method10295(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_0_ = class534_sub40.method16527(-1989822184);
	    if (0 == i_0_)
		break;
	    if (1 == i_0_) {
		int i_1_ = class534_sub40.method16527(-543804424);
		int i_2_ = 0;
		LinkedList linkedlist = new LinkedList();
		for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
		    int i_4_ = class534_sub40.method16527(-482361798);
		    int i_5_ = class534_sub40.method16529((byte) 1);
		    int i_6_ = class534_sub40.method16527(-1245666018);
		    int i_7_ = 0;
		    Class620 class620 = Class620.aClass620_8111;
		    byte i_8_ = 1;
		    boolean bool = 0 != (i_6_ & 0x1);
		    if ((i_6_ & 0x2) != 0)
			i_7_ = class534_sub40.method16527(419548058);
		    if (0 != (i_6_ & 0x4))
			class620 = (aClass620Array8148
				    [class534_sub40.method16527(-2091205943)]);
		    if ((i_6_ & 0x8) != 0)
			i_8_ = class534_sub40.method16586((byte) 1);
		    boolean bool_9_
			= class534_sub40.method16527(-772771388) == 1;
		    linkedlist.add(new Class633(i_4_, i_5_, bool, bool_9_,
						i_7_, class620, i_8_));
		    if (i_4_ > i_2_)
			i_2_ = i_4_;
		}
		aClass633Array8147 = new Class633[1 + i_2_];
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
		    Class633 class633 = (Class633) iterator.next();
		    aClass633Array8147[class633.method10478(-1399762004)]
			= class633;
		}
	    } else if (i_0_ == 2) {
		aClass620Array8148
		    = new Class620[class534_sub40.method16527(577192977)];
		for (int i_10_ = class534_sub40.method16527(-1816692022);
		     255 != i_10_;
		     i_10_ = class534_sub40.method16527(-1017194089)) {
		    int[] is = new int[class534_sub40.method16529((byte) 1)];
		    for (int i_11_ = 0; i_11_ < is.length; i_11_++)
			is[i_11_] = class534_sub40.method16533(-258848859);
		    aClass620Array8148[i_10_] = new Class620(is);
		}
	    }
	}
    }
    
    public int method10296(int i) {
	return aClass633Array8147.length;
    }
    
    public Class633 method10297(int i, int i_12_) {
	return aClass633Array8147[i];
    }
    
    public Iterator iterator() {
	return new Class627(aClass633Array8147);
    }
    
    void method10298() {
	aClass633Array8147 = null;
    }
    
    public Iterator method10299() {
	return new Class627(aClass633Array8147);
    }
    
    public int method10300() {
	return aClass633Array8147.length;
    }
    
    void method10301() {
	aClass633Array8147 = null;
    }
    
    void method10302() {
	aClass633Array8147 = null;
    }
    
    public Class623(Class472 class472) {
	method10292(class472.method7738((-448671533
					 * Class617.aClass617_8094.anInt8096),
					(byte) -38),
		    (short) 9245);
    }
    
    void method10303(byte[] is) {
	method10293(1030051498);
	if (is == null)
	    aClass633Array8147 = new Class633[0];
	else
	    method10295(new Class534_Sub40(is), (byte) -68);
    }
    
    void method10304(byte[] is) {
	method10293(2108935636);
	if (is == null)
	    aClass633Array8147 = new Class633[0];
	else
	    method10295(new Class534_Sub40(is), (byte) -103);
    }
    
    void method10305(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-1391338090);
	    if (0 == i)
		break;
	    if (1 == i) {
		int i_13_ = class534_sub40.method16527(965986653);
		int i_14_ = 0;
		LinkedList linkedlist = new LinkedList();
		for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
		    int i_16_ = class534_sub40.method16527(536581681);
		    int i_17_ = class534_sub40.method16529((byte) 1);
		    int i_18_ = class534_sub40.method16527(1511452557);
		    int i_19_ = 0;
		    Class620 class620 = Class620.aClass620_8111;
		    byte i_20_ = 1;
		    boolean bool = 0 != (i_18_ & 0x1);
		    if ((i_18_ & 0x2) != 0)
			i_19_ = class534_sub40.method16527(201765662);
		    if (0 != (i_18_ & 0x4))
			class620 = (aClass620Array8148
				    [class534_sub40.method16527(689917011)]);
		    if ((i_18_ & 0x8) != 0)
			i_20_ = class534_sub40.method16586((byte) 1);
		    boolean bool_21_
			= class534_sub40.method16527(-944642142) == 1;
		    linkedlist.add(new Class633(i_16_, i_17_, bool, bool_21_,
						i_19_, class620, i_20_));
		    if (i_16_ > i_14_)
			i_14_ = i_16_;
		}
		aClass633Array8147 = new Class633[1 + i_14_];
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
		    Class633 class633 = (Class633) iterator.next();
		    aClass633Array8147[class633.method10478(-813743877)]
			= class633;
		}
	    } else if (i == 2) {
		aClass620Array8148
		    = new Class620[class534_sub40.method16527(-1102895452)];
		for (int i_22_ = class534_sub40.method16527(87290651);
		     255 != i_22_;
		     i_22_ = class534_sub40.method16527(1273924631)) {
		    int[] is = new int[class534_sub40.method16529((byte) 1)];
		    for (int i_23_ = 0; i_23_ < is.length; i_23_++)
			is[i_23_] = class534_sub40.method16533(-258848859);
		    aClass620Array8148[i_22_] = new Class620(is);
		}
	    }
	}
    }
    
    void method10306(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-1324077753);
	    if (0 == i)
		break;
	    if (1 == i) {
		int i_24_ = class534_sub40.method16527(1064304041);
		int i_25_ = 0;
		LinkedList linkedlist = new LinkedList();
		for (int i_26_ = 0; i_26_ < i_24_; i_26_++) {
		    int i_27_ = class534_sub40.method16527(-1541568612);
		    int i_28_ = class534_sub40.method16529((byte) 1);
		    int i_29_ = class534_sub40.method16527(2041649561);
		    int i_30_ = 0;
		    Class620 class620 = Class620.aClass620_8111;
		    byte i_31_ = 1;
		    boolean bool = 0 != (i_29_ & 0x1);
		    if ((i_29_ & 0x2) != 0)
			i_30_ = class534_sub40.method16527(197022612);
		    if (0 != (i_29_ & 0x4))
			class620 = (aClass620Array8148
				    [class534_sub40.method16527(2050888243)]);
		    if ((i_29_ & 0x8) != 0)
			i_31_ = class534_sub40.method16586((byte) 1);
		    boolean bool_32_
			= class534_sub40.method16527(683417087) == 1;
		    linkedlist.add(new Class633(i_27_, i_28_, bool, bool_32_,
						i_30_, class620, i_31_));
		    if (i_27_ > i_25_)
			i_25_ = i_27_;
		}
		aClass633Array8147 = new Class633[1 + i_25_];
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
		    Class633 class633 = (Class633) iterator.next();
		    aClass633Array8147[class633.method10478(887621403)]
			= class633;
		}
	    } else if (i == 2) {
		aClass620Array8148
		    = new Class620[class534_sub40.method16527(463192479)];
		for (int i_33_ = class534_sub40.method16527(-1723338928);
		     255 != i_33_;
		     i_33_ = class534_sub40.method16527(504965808)) {
		    int[] is = new int[class534_sub40.method16529((byte) 1)];
		    for (int i_34_ = 0; i_34_ < is.length; i_34_++)
			is[i_34_] = class534_sub40.method16533(-258848859);
		    aClass620Array8148[i_33_] = new Class620(is);
		}
	    }
	}
    }
    
    public Iterator method10307() {
	return new Class627(aClass633Array8147);
    }
    
    static final void method10308(Class669 class669, byte i) {
	int i_35_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class78.aClass103_825.method1909(i_35_, 1656171964);
    }
    
    static final void method10309(Class669 class669, int i) {
	class669.anInt8600 -= 926998689;
	int i_36_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_37_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_38_
	    = class669.anIntArray8595[2 + class669.anInt8600 * 2088438307];
	if (i_37_ == -1)
	    throw new RuntimeException();
	Class41 class41
	    = ((Class41)
	       Class667.aClass44_Sub21_8582.method91(i_37_, -1932260833));
	if (class41.aClass493_314.method93() != i_36_)
	    throw new RuntimeException();
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class41.method1050(Integer.valueOf(i_38_), (byte) 1) ? 1 : 0;
    }
}
