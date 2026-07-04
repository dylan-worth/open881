/* Class570 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;
import java.util.Iterator;

public class Class570 implements Interface7, Interface13
{
    public int anInt7620;
    public int[] anIntArray7621;
    public int[] anIntArray7622;
    int anInt7623;
    public int anInt7624;
    public int anInt7625;
    public int anInt7626;
    public int anInt7627;
    public int anInt7628;
    public int anInt7629;
    public int anInt7630;
    public int anInt7631;
    public int anInt7632;
    public int anInt7633;
    public int anInt7634;
    Class446[] aClass446Array7635;
    public int anInt7636;
    public int anInt7637;
    public int anInt7638;
    public boolean aBool7639;
    public int anInt7640;
    public int anInt7641;
    public int anInt7642;
    public int anInt7643;
    public int anInt7644;
    public int anInt7645;
    public int anInt7646;
    public int anInt7647;
    public int[][] anIntArrayArray7648;
    public int[][] anIntArrayArray7649;
    public int anInt7650 = -901817801;
    public int[] anIntArray7651;
    public int[] anIntArray7652;
    public int anInt7653;
    public int anInt7654;
    public int anInt7655;
    public int anInt7656;
    public int anInt7657;
    public int anInt7658;
    public int anInt7659;
    public int anInt7660;
    public int anInt7661;
    public int anInt7662;
    public int anInt7663;
    
    public void method81(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-850299939);
	    if (i == 0)
		break;
	    method9621(class534_sub40, i, -682639382);
	}
    }
    
    Class570(int i) {
	anIntArray7621 = null;
	anIntArray7622 = null;
	anInt7623 = 0;
	anInt7663 = 976367921;
	anInt7625 = -217056215;
	anInt7644 = 1471551439;
	anInt7627 = -2062916965;
	anInt7628 = -471164265;
	anInt7629 = -1136014173;
	anInt7642 = -1568730753;
	anInt7631 = -1401446903;
	anInt7632 = -1039808581;
	anInt7633 = -1271201711;
	anInt7634 = -578264283;
	anInt7638 = -308138861;
	anInt7636 = -1759918197;
	anInt7647 = -1386678501;
	anInt7620 = -248942179;
	anInt7655 = -1243154239;
	anInt7640 = -216005199;
	anInt7626 = -1879477755;
	anInt7624 = -1660121539;
	anInt7637 = -547175437;
	anInt7630 = 0;
	anInt7645 = 0;
	anInt7654 = 0;
	anInt7643 = 0;
	anInt7653 = 0;
	anInt7641 = 0;
	anInt7646 = 0;
	anInt7656 = 0;
	anInt7657 = 0;
	anInt7658 = 0;
	anInt7659 = 0;
	anInt7660 = 0;
	anInt7661 = -2046572415;
	anInt7662 = -1060452851;
	aBool7639 = true;
    }
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_0_ = class534_sub40.method16527(-1135314481);
	    if (i_0_ == 0)
		break;
	    method9621(class534_sub40, i_0_, -513261766);
	}
    }
    
    void method9599(Class534_Sub40 class534_sub40, int i) {
	if (1 == i) {
	    anInt7650 = class534_sub40.method16550((byte) 9) * 901817801;
	    anInt7644 = class534_sub40.method16550((byte) -21) * -1471551439;
	} else if (i == 2)
	    anInt7634 = class534_sub40.method16550((byte) 2) * 578264283;
	else if (3 == i)
	    anInt7638 = class534_sub40.method16550((byte) 89) * 308138861;
	else if (i == 4)
	    anInt7636 = class534_sub40.method16550((byte) -17) * 1759918197;
	else if (i == 5)
	    anInt7647 = class534_sub40.method16550((byte) 5) * 1386678501;
	else if (6 == i)
	    anInt7642 = class534_sub40.method16550((byte) 84) * 1568730753;
	else if (i == 7)
	    anInt7631 = class534_sub40.method16550((byte) 2) * 1401446903;
	else if (8 == i)
	    anInt7632 = class534_sub40.method16550((byte) -3) * 1039808581;
	else if (9 == i)
	    anInt7633 = class534_sub40.method16550((byte) 3) * 1271201711;
	else if (26 == i) {
	    anInt7630 = ((short) (class534_sub40.method16527(886775795) * 4)
			 * 1046108655);
	    anInt7645 = ((short) (class534_sub40.method16527(1051538258) * 4)
			 * 541386065);
	} else if (27 == i) {
	    int i_1_ = class534_sub40.method16527(1475902883);
	    if (null == anIntArrayArray7648)
		anIntArrayArray7648 = new int[i_1_ + 1][];
	    else if (i_1_ >= anIntArrayArray7648.length)
		anIntArrayArray7648
		    = (int[][]) Arrays.copyOf(anIntArrayArray7648, 1 + i_1_);
	    anIntArrayArray7648[i_1_] = new int[6];
	    for (int i_2_ = 0; i_2_ < 6; i_2_++)
		anIntArrayArray7648[i_1_][i_2_]
		    = class534_sub40.method16530((byte) -48);
	} else if (28 == i) {
	    int i_3_ = class534_sub40.method16527(1364786019);
	    anIntArray7652 = new int[i_3_];
	    for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
		anIntArray7652[i_4_] = class534_sub40.method16527(-1817384040);
		if (255 == anIntArray7652[i_4_])
		    anIntArray7652[i_4_] = -1;
	    }
	} else if (29 == i)
	    anInt7653 = class534_sub40.method16527(1071057681) * -1616629835;
	else if (30 == i)
	    anInt7641 = class534_sub40.method16529((byte) 1) * 274236715;
	else if (31 == i)
	    anInt7646 = class534_sub40.method16527(15317549) * 2008073541;
	else if (i == 32)
	    anInt7656 = class534_sub40.method16529((byte) 1) * -711654453;
	else if (33 == i)
	    anInt7657 = class534_sub40.method16530((byte) -74) * 1877611715;
	else if (i == 34)
	    anInt7658 = class534_sub40.method16527(-1610427361) * 120822835;
	else if (i == 35)
	    anInt7659 = class534_sub40.method16529((byte) 1) * -825879347;
	else if (36 == i)
	    anInt7660 = class534_sub40.method16530((byte) -115) * -1509280213;
	else if (i == 37)
	    anInt7661 = class534_sub40.method16527(-1743772673) * 2046572415;
	else if (i == 38)
	    anInt7663 = class534_sub40.method16550((byte) 25) * -976367921;
	else if (i == 39)
	    anInt7625 = class534_sub40.method16550((byte) -13) * 217056215;
	else if (i == 40)
	    anInt7627 = class534_sub40.method16550((byte) -12) * 2062916965;
	else if (i == 41)
	    anInt7628 = class534_sub40.method16550((byte) 57) * 471164265;
	else if (i == 42)
	    anInt7629 = class534_sub40.method16550((byte) 46) * 1136014173;
	else if (43 == i)
	    class534_sub40.method16529((byte) 1);
	else if (i == 44)
	    class534_sub40.method16529((byte) 1);
	else if (45 == i)
	    anInt7662 = class534_sub40.method16529((byte) 1) * 1060452851;
	else if (i == 46)
	    anInt7620 = class534_sub40.method16550((byte) -74) * 248942179;
	else if (47 == i)
	    anInt7655 = class534_sub40.method16550((byte) 28) * 1243154239;
	else if (i == 48)
	    anInt7640 = class534_sub40.method16550((byte) -12) * 216005199;
	else if (49 == i)
	    anInt7626 = class534_sub40.method16550((byte) -47) * 1879477755;
	else if (i == 50)
	    anInt7624 = class534_sub40.method16550((byte) -14) * 1660121539;
	else if (51 == i)
	    anInt7637 = class534_sub40.method16550((byte) -45) * 547175437;
	else if (52 == i) {
	    int i_5_ = class534_sub40.method16527(1772458138);
	    anIntArray7621 = new int[i_5_];
	    anIntArray7622 = new int[i_5_];
	    for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
		anIntArray7621[i_6_] = class534_sub40.method16550((byte) 15);
		int i_7_ = class534_sub40.method16527(112954690);
		anIntArray7622[i_6_] = i_7_;
		anInt7623 += i_7_ * -495343391;
	    }
	} else if (53 == i)
	    aBool7639 = false;
	else if (54 == i) {
	    anInt7654
		= (class534_sub40.method16527(-1964811601) << 6) * -358189655;
	    anInt7643
		= (class534_sub40.method16527(24012815) << 6) * -556508645;
	} else if (i == 55) {
	    int i_8_ = class534_sub40.method16527(118485365);
	    if (null == anIntArray7651)
		anIntArray7651 = new int[1 + i_8_];
	    else if (i_8_ >= anIntArray7651.length)
		anIntArray7651 = Arrays.copyOf(anIntArray7651, i_8_ + 1);
	    anIntArray7651[i_8_] = class534_sub40.method16529((byte) 1);
	} else if (56 == i) {
	    int i_9_ = class534_sub40.method16527(1183255985);
	    if (anIntArrayArray7649 == null)
		anIntArrayArray7649 = new int[1 + i_9_][];
	    else if (i_9_ >= anIntArrayArray7649.length)
		anIntArrayArray7649
		    = (int[][]) Arrays.copyOf(anIntArrayArray7649, 1 + i_9_);
	    anIntArrayArray7649[i_9_] = new int[3];
	    for (int i_10_ = 0; i_10_ < 3; i_10_++)
		anIntArrayArray7649[i_9_][i_10_]
		    = class534_sub40.method16530((byte) -28);
	}
    }
    
    public void method82(int i) {
	/* empty */
    }
    
    public int method9600(int i) {
	if (anInt7650 * 1103529081 != -1)
	    return anInt7650 * 1103529081;
	if (null != anIntArray7621) {
	    int i_11_
		= (int) (Math.random() * (double) (305240865 * anInt7623));
	    int i_12_;
	    for (i_12_ = 0; i_11_ >= anIntArray7622[i_12_]; i_12_++)
		i_11_ -= anIntArray7622[i_12_];
	    return anIntArray7621[i_12_];
	}
	return -1;
    }
    
    public int method9601() {
	if (anInt7650 * 1103529081 != -1)
	    return anInt7650 * 1103529081;
	if (null != anIntArray7621) {
	    int i = (int) (Math.random() * (double) (305240865 * anInt7623));
	    int i_13_;
	    for (i_13_ = 0; i >= anIntArray7622[i_13_]; i_13_++)
		i -= anIntArray7622[i_13_];
	    return anIntArray7621[i_13_];
	}
	return -1;
    }
    
    public int[] method9602() {
	Class9 class9 = new Class9(16);
	Class297.method5347(anInt7650 * 1103529081, class9, (byte) 60);
	if (anIntArray7621 != null) {
	    int[] is = anIntArray7621;
	    for (int i = 0; i < is.length; i++) {
		int i_14_ = is[i];
		Class297.method5347(i_14_, class9, (byte) 48);
	    }
	}
	Class297.method5347(anInt7663 * -958760913, class9, (byte) 86);
	Class297.method5347(anInt7625 * -435773465, class9, (byte) 118);
	Class297.method5347(-162238255 * anInt7644, class9, (byte) 93);
	Class297.method5347(1439321197 * anInt7627, class9, (byte) 122);
	Class297.method5347(-450790695 * anInt7628, class9, (byte) 79);
	Class297.method5347(-550586123 * anInt7629, class9, (byte) 83);
	Class297.method5347(anInt7642 * 1074876801, class9, (byte) 19);
	Class297.method5347(anInt7631 * 421310407, class9, (byte) 30);
	Class297.method5347(-921167219 * anInt7632, class9, (byte) 123);
	Class297.method5347(anInt7633 * 541177679, class9, (byte) 122);
	Class297.method5347(1846476627 * anInt7634, class9, (byte) 52);
	Class297.method5347(anInt7638 * -63558043, class9, (byte) 91);
	Class297.method5347(anInt7636 * 630970333, class9, (byte) 81);
	Class297.method5347(anInt7647 * -1045334803, class9, (byte) 104);
	Class297.method5347(-1143184565 * anInt7620, class9, (byte) 34);
	Class297.method5347(-1927386945 * anInt7655, class9, (byte) 90);
	Class297.method5347(-2118591313 * anInt7640, class9, (byte) 38);
	Class297.method5347(anInt7626 * 738882867, class9, (byte) 23);
	Class297.method5347(anInt7624 * 1492387563, class9, (byte) 118);
	Class297.method5347(-208702779 * anInt7637, class9, (byte) 108);
	int[] is = new int[class9.method600(-1652330381)];
	int i = 0;
	Iterator iterator = class9.iterator();
	while (iterator.hasNext()) {
	    Class534 class534 = (Class534) iterator.next();
	    is[i++] = (int) (class534.aLong7158 * 8258869577519436579L);
	}
	return is;
    }
    
    public int[] method9603() {
	Class9 class9 = new Class9(16);
	Class297.method5347(anInt7650 * 1103529081, class9, (byte) 89);
	if (anIntArray7621 != null) {
	    int[] is = anIntArray7621;
	    for (int i = 0; i < is.length; i++) {
		int i_15_ = is[i];
		Class297.method5347(i_15_, class9, (byte) 70);
	    }
	}
	Class297.method5347(anInt7663 * -958760913, class9, (byte) 55);
	Class297.method5347(anInt7625 * -435773465, class9, (byte) 13);
	Class297.method5347(-162238255 * anInt7644, class9, (byte) 71);
	Class297.method5347(1439321197 * anInt7627, class9, (byte) 78);
	Class297.method5347(-450790695 * anInt7628, class9, (byte) 94);
	Class297.method5347(-550586123 * anInt7629, class9, (byte) 83);
	Class297.method5347(anInt7642 * 1074876801, class9, (byte) 122);
	Class297.method5347(anInt7631 * 421310407, class9, (byte) 115);
	Class297.method5347(-921167219 * anInt7632, class9, (byte) 115);
	Class297.method5347(anInt7633 * 541177679, class9, (byte) 22);
	Class297.method5347(1846476627 * anInt7634, class9, (byte) 98);
	Class297.method5347(anInt7638 * -63558043, class9, (byte) 101);
	Class297.method5347(anInt7636 * 630970333, class9, (byte) 48);
	Class297.method5347(anInt7647 * -1045334803, class9, (byte) 72);
	Class297.method5347(-1143184565 * anInt7620, class9, (byte) 19);
	Class297.method5347(-1927386945 * anInt7655, class9, (byte) 12);
	Class297.method5347(-2118591313 * anInt7640, class9, (byte) 61);
	Class297.method5347(anInt7626 * 738882867, class9, (byte) 55);
	Class297.method5347(anInt7624 * 1492387563, class9, (byte) 15);
	Class297.method5347(-208702779 * anInt7637, class9, (byte) 58);
	int[] is = new int[class9.method600(-572680159)];
	int i = 0;
	Iterator iterator = class9.iterator();
	while (iterator.hasNext()) {
	    Class534 class534 = (Class534) iterator.next();
	    is[i++] = (int) (class534.aLong7158 * 8258869577519436579L);
	}
	return is;
    }
    
    public void method67(int i, int i_16_) {
	/* empty */
    }
    
    public void method80(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(468922041);
	    if (i == 0)
		break;
	    method9621(class534_sub40, i, 1626541473);
	}
    }
    
    public void method78(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(1984033936);
	    if (i == 0)
		break;
	    method9621(class534_sub40, i, 603670565);
	}
    }
    
    public int method9604() {
	if (anInt7650 * 1103529081 != -1)
	    return anInt7650 * 1103529081;
	if (null != anIntArray7621) {
	    int i = (int) (Math.random() * (double) (305240865 * anInt7623));
	    int i_17_;
	    for (i_17_ = 0; i >= anIntArray7622[i_17_]; i_17_++)
		i -= anIntArray7622[i_17_];
	    return anIntArray7621[i_17_];
	}
	return -1;
    }
    
    public void method83() {
	/* empty */
    }
    
    public void method84() {
	/* empty */
    }
    
    public int[] method9605() {
	Class9 class9 = new Class9(16);
	Class297.method5347(anInt7650 * 1103529081, class9, (byte) 6);
	if (anIntArray7621 != null) {
	    int[] is = anIntArray7621;
	    for (int i = 0; i < is.length; i++) {
		int i_18_ = is[i];
		Class297.method5347(i_18_, class9, (byte) 110);
	    }
	}
	Class297.method5347(anInt7663 * -958760913, class9, (byte) 63);
	Class297.method5347(anInt7625 * -435773465, class9, (byte) 40);
	Class297.method5347(-162238255 * anInt7644, class9, (byte) 114);
	Class297.method5347(1439321197 * anInt7627, class9, (byte) 59);
	Class297.method5347(-450790695 * anInt7628, class9, (byte) 62);
	Class297.method5347(-550586123 * anInt7629, class9, (byte) 29);
	Class297.method5347(anInt7642 * 1074876801, class9, (byte) 112);
	Class297.method5347(anInt7631 * 421310407, class9, (byte) 91);
	Class297.method5347(-921167219 * anInt7632, class9, (byte) 126);
	Class297.method5347(anInt7633 * 541177679, class9, (byte) 77);
	Class297.method5347(1846476627 * anInt7634, class9, (byte) 43);
	Class297.method5347(anInt7638 * -63558043, class9, (byte) 13);
	Class297.method5347(anInt7636 * 630970333, class9, (byte) 121);
	Class297.method5347(anInt7647 * -1045334803, class9, (byte) 120);
	Class297.method5347(-1143184565 * anInt7620, class9, (byte) 120);
	Class297.method5347(-1927386945 * anInt7655, class9, (byte) 70);
	Class297.method5347(-2118591313 * anInt7640, class9, (byte) 125);
	Class297.method5347(anInt7626 * 738882867, class9, (byte) 44);
	Class297.method5347(anInt7624 * 1492387563, class9, (byte) 92);
	Class297.method5347(-208702779 * anInt7637, class9, (byte) 114);
	int[] is = new int[class9.method600(967546263)];
	int i = 0;
	Iterator iterator = class9.iterator();
	while (iterator.hasNext()) {
	    Class534 class534 = (Class534) iterator.next();
	    is[i++] = (int) (class534.aLong7158 * 8258869577519436579L);
	}
	return is;
    }
    
    public void method65(int i) {
	/* empty */
    }
    
    void method9606(Class534_Sub40 class534_sub40, int i) {
	if (1 == i) {
	    anInt7650 = class534_sub40.method16550((byte) 39) * 901817801;
	    anInt7644 = class534_sub40.method16550((byte) 83) * -1471551439;
	} else if (i == 2)
	    anInt7634 = class534_sub40.method16550((byte) 42) * 578264283;
	else if (3 == i)
	    anInt7638 = class534_sub40.method16550((byte) 62) * 308138861;
	else if (i == 4)
	    anInt7636 = class534_sub40.method16550((byte) 5) * 1759918197;
	else if (i == 5)
	    anInt7647 = class534_sub40.method16550((byte) -4) * 1386678501;
	else if (6 == i)
	    anInt7642 = class534_sub40.method16550((byte) -73) * 1568730753;
	else if (i == 7)
	    anInt7631 = class534_sub40.method16550((byte) -1) * 1401446903;
	else if (8 == i)
	    anInt7632 = class534_sub40.method16550((byte) -9) * 1039808581;
	else if (9 == i)
	    anInt7633 = class534_sub40.method16550((byte) -35) * 1271201711;
	else if (26 == i) {
	    anInt7630 = ((short) (class534_sub40.method16527(-594256451) * 4)
			 * 1046108655);
	    anInt7645 = ((short) (class534_sub40.method16527(2126196918) * 4)
			 * 541386065);
	} else if (27 == i) {
	    int i_19_ = class534_sub40.method16527(674479665);
	    if (null == anIntArrayArray7648)
		anIntArrayArray7648 = new int[i_19_ + 1][];
	    else if (i_19_ >= anIntArrayArray7648.length)
		anIntArrayArray7648
		    = (int[][]) Arrays.copyOf(anIntArrayArray7648, 1 + i_19_);
	    anIntArrayArray7648[i_19_] = new int[6];
	    for (int i_20_ = 0; i_20_ < 6; i_20_++)
		anIntArrayArray7648[i_19_][i_20_]
		    = class534_sub40.method16530((byte) -98);
	} else if (28 == i) {
	    int i_21_ = class534_sub40.method16527(-1965166276);
	    anIntArray7652 = new int[i_21_];
	    for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
		anIntArray7652[i_22_] = class534_sub40.method16527(950295431);
		if (255 == anIntArray7652[i_22_])
		    anIntArray7652[i_22_] = -1;
	    }
	} else if (29 == i)
	    anInt7653 = class534_sub40.method16527(650142437) * -1616629835;
	else if (30 == i)
	    anInt7641 = class534_sub40.method16529((byte) 1) * 274236715;
	else if (31 == i)
	    anInt7646 = class534_sub40.method16527(-953694631) * 2008073541;
	else if (i == 32)
	    anInt7656 = class534_sub40.method16529((byte) 1) * -711654453;
	else if (33 == i)
	    anInt7657 = class534_sub40.method16530((byte) -7) * 1877611715;
	else if (i == 34)
	    anInt7658 = class534_sub40.method16527(1037752035) * 120822835;
	else if (i == 35)
	    anInt7659 = class534_sub40.method16529((byte) 1) * -825879347;
	else if (36 == i)
	    anInt7660 = class534_sub40.method16530((byte) -68) * -1509280213;
	else if (i == 37)
	    anInt7661 = class534_sub40.method16527(-1075745522) * 2046572415;
	else if (i == 38)
	    anInt7663 = class534_sub40.method16550((byte) -43) * -976367921;
	else if (i == 39)
	    anInt7625 = class534_sub40.method16550((byte) 7) * 217056215;
	else if (i == 40)
	    anInt7627 = class534_sub40.method16550((byte) -62) * 2062916965;
	else if (i == 41)
	    anInt7628 = class534_sub40.method16550((byte) 49) * 471164265;
	else if (i == 42)
	    anInt7629 = class534_sub40.method16550((byte) 21) * 1136014173;
	else if (43 == i)
	    class534_sub40.method16529((byte) 1);
	else if (i == 44)
	    class534_sub40.method16529((byte) 1);
	else if (45 == i)
	    anInt7662 = class534_sub40.method16529((byte) 1) * 1060452851;
	else if (i == 46)
	    anInt7620 = class534_sub40.method16550((byte) 30) * 248942179;
	else if (47 == i)
	    anInt7655 = class534_sub40.method16550((byte) 10) * 1243154239;
	else if (i == 48)
	    anInt7640 = class534_sub40.method16550((byte) -37) * 216005199;
	else if (49 == i)
	    anInt7626 = class534_sub40.method16550((byte) -3) * 1879477755;
	else if (i == 50)
	    anInt7624 = class534_sub40.method16550((byte) 6) * 1660121539;
	else if (51 == i)
	    anInt7637 = class534_sub40.method16550((byte) 20) * 547175437;
	else if (52 == i) {
	    int i_23_ = class534_sub40.method16527(-1110206075);
	    anIntArray7621 = new int[i_23_];
	    anIntArray7622 = new int[i_23_];
	    for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
		anIntArray7621[i_24_]
		    = class534_sub40.method16550((byte) -117);
		int i_25_ = class534_sub40.method16527(-1417704533);
		anIntArray7622[i_24_] = i_25_;
		anInt7623 += i_25_ * -495343391;
	    }
	} else if (53 == i)
	    aBool7639 = false;
	else if (54 == i) {
	    anInt7654
		= (class534_sub40.method16527(-1272484231) << 6) * -358189655;
	    anInt7643
		= (class534_sub40.method16527(1278298271) << 6) * -556508645;
	} else if (i == 55) {
	    int i_26_ = class534_sub40.method16527(1513849380);
	    if (null == anIntArray7651)
		anIntArray7651 = new int[1 + i_26_];
	    else if (i_26_ >= anIntArray7651.length)
		anIntArray7651 = Arrays.copyOf(anIntArray7651, i_26_ + 1);
	    anIntArray7651[i_26_] = class534_sub40.method16529((byte) 1);
	} else if (56 == i) {
	    int i_27_ = class534_sub40.method16527(40881816);
	    if (anIntArrayArray7649 == null)
		anIntArrayArray7649 = new int[1 + i_27_][];
	    else if (i_27_ >= anIntArrayArray7649.length)
		anIntArrayArray7649
		    = (int[][]) Arrays.copyOf(anIntArrayArray7649, 1 + i_27_);
	    anIntArrayArray7649[i_27_] = new int[3];
	    for (int i_28_ = 0; i_28_ < 3; i_28_++)
		anIntArrayArray7649[i_27_][i_28_]
		    = class534_sub40.method16530((byte) -2);
	}
    }
    
    static final void method9607(int i, Class9 class9) {
	if (i != -1 && class9.method579((long) i) == null)
	    class9.method581(new Class534(), (long) i);
    }
    
    void method9608(Class534_Sub40 class534_sub40, int i) {
	if (1 == i) {
	    anInt7650 = class534_sub40.method16550((byte) -111) * 901817801;
	    anInt7644 = class534_sub40.method16550((byte) -55) * -1471551439;
	} else if (i == 2)
	    anInt7634 = class534_sub40.method16550((byte) 84) * 578264283;
	else if (3 == i)
	    anInt7638 = class534_sub40.method16550((byte) 52) * 308138861;
	else if (i == 4)
	    anInt7636 = class534_sub40.method16550((byte) -4) * 1759918197;
	else if (i == 5)
	    anInt7647 = class534_sub40.method16550((byte) -100) * 1386678501;
	else if (6 == i)
	    anInt7642 = class534_sub40.method16550((byte) -75) * 1568730753;
	else if (i == 7)
	    anInt7631 = class534_sub40.method16550((byte) 31) * 1401446903;
	else if (8 == i)
	    anInt7632 = class534_sub40.method16550((byte) -52) * 1039808581;
	else if (9 == i)
	    anInt7633 = class534_sub40.method16550((byte) -36) * 1271201711;
	else if (26 == i) {
	    anInt7630 = ((short) (class534_sub40.method16527(2073623235) * 4)
			 * 1046108655);
	    anInt7645 = ((short) (class534_sub40.method16527(921099516) * 4)
			 * 541386065);
	} else if (27 == i) {
	    int i_29_ = class534_sub40.method16527(-507473412);
	    if (null == anIntArrayArray7648)
		anIntArrayArray7648 = new int[i_29_ + 1][];
	    else if (i_29_ >= anIntArrayArray7648.length)
		anIntArrayArray7648
		    = (int[][]) Arrays.copyOf(anIntArrayArray7648, 1 + i_29_);
	    anIntArrayArray7648[i_29_] = new int[6];
	    for (int i_30_ = 0; i_30_ < 6; i_30_++)
		anIntArrayArray7648[i_29_][i_30_]
		    = class534_sub40.method16530((byte) -107);
	} else if (28 == i) {
	    int i_31_ = class534_sub40.method16527(1661660568);
	    anIntArray7652 = new int[i_31_];
	    for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
		anIntArray7652[i_32_] = class534_sub40.method16527(-490736672);
		if (255 == anIntArray7652[i_32_])
		    anIntArray7652[i_32_] = -1;
	    }
	} else if (29 == i)
	    anInt7653 = class534_sub40.method16527(368748624) * -1616629835;
	else if (30 == i)
	    anInt7641 = class534_sub40.method16529((byte) 1) * 274236715;
	else if (31 == i)
	    anInt7646 = class534_sub40.method16527(-2087250085) * 2008073541;
	else if (i == 32)
	    anInt7656 = class534_sub40.method16529((byte) 1) * -711654453;
	else if (33 == i)
	    anInt7657 = class534_sub40.method16530((byte) -8) * 1877611715;
	else if (i == 34)
	    anInt7658 = class534_sub40.method16527(2003145830) * 120822835;
	else if (i == 35)
	    anInt7659 = class534_sub40.method16529((byte) 1) * -825879347;
	else if (36 == i)
	    anInt7660 = class534_sub40.method16530((byte) -101) * -1509280213;
	else if (i == 37)
	    anInt7661 = class534_sub40.method16527(-1958018216) * 2046572415;
	else if (i == 38)
	    anInt7663 = class534_sub40.method16550((byte) -6) * -976367921;
	else if (i == 39)
	    anInt7625 = class534_sub40.method16550((byte) -99) * 217056215;
	else if (i == 40)
	    anInt7627 = class534_sub40.method16550((byte) 75) * 2062916965;
	else if (i == 41)
	    anInt7628 = class534_sub40.method16550((byte) 54) * 471164265;
	else if (i == 42)
	    anInt7629 = class534_sub40.method16550((byte) 41) * 1136014173;
	else if (43 == i)
	    class534_sub40.method16529((byte) 1);
	else if (i == 44)
	    class534_sub40.method16529((byte) 1);
	else if (45 == i)
	    anInt7662 = class534_sub40.method16529((byte) 1) * 1060452851;
	else if (i == 46)
	    anInt7620 = class534_sub40.method16550((byte) 69) * 248942179;
	else if (47 == i)
	    anInt7655 = class534_sub40.method16550((byte) -66) * 1243154239;
	else if (i == 48)
	    anInt7640 = class534_sub40.method16550((byte) 11) * 216005199;
	else if (49 == i)
	    anInt7626 = class534_sub40.method16550((byte) 35) * 1879477755;
	else if (i == 50)
	    anInt7624 = class534_sub40.method16550((byte) -73) * 1660121539;
	else if (51 == i)
	    anInt7637 = class534_sub40.method16550((byte) 89) * 547175437;
	else if (52 == i) {
	    int i_33_ = class534_sub40.method16527(1485744607);
	    anIntArray7621 = new int[i_33_];
	    anIntArray7622 = new int[i_33_];
	    for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
		anIntArray7621[i_34_] = class534_sub40.method16550((byte) -5);
		int i_35_ = class534_sub40.method16527(-559828596);
		anIntArray7622[i_34_] = i_35_;
		anInt7623 += i_35_ * -495343391;
	    }
	} else if (53 == i)
	    aBool7639 = false;
	else if (54 == i) {
	    anInt7654
		= (class534_sub40.method16527(2033744089) << 6) * -358189655;
	    anInt7643
		= (class534_sub40.method16527(-58241459) << 6) * -556508645;
	} else if (i == 55) {
	    int i_36_ = class534_sub40.method16527(-1347783214);
	    if (null == anIntArray7651)
		anIntArray7651 = new int[1 + i_36_];
	    else if (i_36_ >= anIntArray7651.length)
		anIntArray7651 = Arrays.copyOf(anIntArray7651, i_36_ + 1);
	    anIntArray7651[i_36_] = class534_sub40.method16529((byte) 1);
	} else if (56 == i) {
	    int i_37_ = class534_sub40.method16527(2067113306);
	    if (anIntArrayArray7649 == null)
		anIntArrayArray7649 = new int[1 + i_37_][];
	    else if (i_37_ >= anIntArrayArray7649.length)
		anIntArrayArray7649
		    = (int[][]) Arrays.copyOf(anIntArrayArray7649, 1 + i_37_);
	    anIntArrayArray7649[i_37_] = new int[3];
	    for (int i_38_ = 0; i_38_ < 3; i_38_++)
		anIntArrayArray7649[i_37_][i_38_]
		    = class534_sub40.method16530((byte) -11);
	}
    }
    
    void method9609(Class534_Sub40 class534_sub40, int i) {
	if (1 == i) {
	    anInt7650 = class534_sub40.method16550((byte) 7) * 901817801;
	    anInt7644 = class534_sub40.method16550((byte) -28) * -1471551439;
	} else if (i == 2)
	    anInt7634 = class534_sub40.method16550((byte) 96) * 578264283;
	else if (3 == i)
	    anInt7638 = class534_sub40.method16550((byte) -16) * 308138861;
	else if (i == 4)
	    anInt7636 = class534_sub40.method16550((byte) -21) * 1759918197;
	else if (i == 5)
	    anInt7647 = class534_sub40.method16550((byte) 68) * 1386678501;
	else if (6 == i)
	    anInt7642 = class534_sub40.method16550((byte) 47) * 1568730753;
	else if (i == 7)
	    anInt7631 = class534_sub40.method16550((byte) -12) * 1401446903;
	else if (8 == i)
	    anInt7632 = class534_sub40.method16550((byte) -26) * 1039808581;
	else if (9 == i)
	    anInt7633 = class534_sub40.method16550((byte) -19) * 1271201711;
	else if (26 == i) {
	    anInt7630 = ((short) (class534_sub40.method16527(-702760193) * 4)
			 * 1046108655);
	    anInt7645 = ((short) (class534_sub40.method16527(1559464881) * 4)
			 * 541386065);
	} else if (27 == i) {
	    int i_39_ = class534_sub40.method16527(-178483556);
	    if (null == anIntArrayArray7648)
		anIntArrayArray7648 = new int[i_39_ + 1][];
	    else if (i_39_ >= anIntArrayArray7648.length)
		anIntArrayArray7648
		    = (int[][]) Arrays.copyOf(anIntArrayArray7648, 1 + i_39_);
	    anIntArrayArray7648[i_39_] = new int[6];
	    for (int i_40_ = 0; i_40_ < 6; i_40_++)
		anIntArrayArray7648[i_39_][i_40_]
		    = class534_sub40.method16530((byte) -82);
	} else if (28 == i) {
	    int i_41_ = class534_sub40.method16527(-1731258786);
	    anIntArray7652 = new int[i_41_];
	    for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
		anIntArray7652[i_42_] = class534_sub40.method16527(1834024503);
		if (255 == anIntArray7652[i_42_])
		    anIntArray7652[i_42_] = -1;
	    }
	} else if (29 == i)
	    anInt7653 = class534_sub40.method16527(1695706697) * -1616629835;
	else if (30 == i)
	    anInt7641 = class534_sub40.method16529((byte) 1) * 274236715;
	else if (31 == i)
	    anInt7646 = class534_sub40.method16527(-1121198330) * 2008073541;
	else if (i == 32)
	    anInt7656 = class534_sub40.method16529((byte) 1) * -711654453;
	else if (33 == i)
	    anInt7657 = class534_sub40.method16530((byte) -119) * 1877611715;
	else if (i == 34)
	    anInt7658 = class534_sub40.method16527(-1688203004) * 120822835;
	else if (i == 35)
	    anInt7659 = class534_sub40.method16529((byte) 1) * -825879347;
	else if (36 == i)
	    anInt7660 = class534_sub40.method16530((byte) -94) * -1509280213;
	else if (i == 37)
	    anInt7661 = class534_sub40.method16527(998802224) * 2046572415;
	else if (i == 38)
	    anInt7663 = class534_sub40.method16550((byte) -15) * -976367921;
	else if (i == 39)
	    anInt7625 = class534_sub40.method16550((byte) 7) * 217056215;
	else if (i == 40)
	    anInt7627 = class534_sub40.method16550((byte) 26) * 2062916965;
	else if (i == 41)
	    anInt7628 = class534_sub40.method16550((byte) -35) * 471164265;
	else if (i == 42)
	    anInt7629 = class534_sub40.method16550((byte) -48) * 1136014173;
	else if (43 == i)
	    class534_sub40.method16529((byte) 1);
	else if (i == 44)
	    class534_sub40.method16529((byte) 1);
	else if (45 == i)
	    anInt7662 = class534_sub40.method16529((byte) 1) * 1060452851;
	else if (i == 46)
	    anInt7620 = class534_sub40.method16550((byte) -14) * 248942179;
	else if (47 == i)
	    anInt7655 = class534_sub40.method16550((byte) 82) * 1243154239;
	else if (i == 48)
	    anInt7640 = class534_sub40.method16550((byte) -24) * 216005199;
	else if (49 == i)
	    anInt7626 = class534_sub40.method16550((byte) 28) * 1879477755;
	else if (i == 50)
	    anInt7624 = class534_sub40.method16550((byte) 5) * 1660121539;
	else if (51 == i)
	    anInt7637 = class534_sub40.method16550((byte) -14) * 547175437;
	else if (52 == i) {
	    int i_43_ = class534_sub40.method16527(-1369420124);
	    anIntArray7621 = new int[i_43_];
	    anIntArray7622 = new int[i_43_];
	    for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
		anIntArray7621[i_44_] = class534_sub40.method16550((byte) 51);
		int i_45_ = class534_sub40.method16527(259945509);
		anIntArray7622[i_44_] = i_45_;
		anInt7623 += i_45_ * -495343391;
	    }
	} else if (53 == i)
	    aBool7639 = false;
	else if (54 == i) {
	    anInt7654
		= (class534_sub40.method16527(-1414081402) << 6) * -358189655;
	    anInt7643
		= (class534_sub40.method16527(-473726487) << 6) * -556508645;
	} else if (i == 55) {
	    int i_46_ = class534_sub40.method16527(127145254);
	    if (null == anIntArray7651)
		anIntArray7651 = new int[1 + i_46_];
	    else if (i_46_ >= anIntArray7651.length)
		anIntArray7651 = Arrays.copyOf(anIntArray7651, i_46_ + 1);
	    anIntArray7651[i_46_] = class534_sub40.method16529((byte) 1);
	} else if (56 == i) {
	    int i_47_ = class534_sub40.method16527(1096644450);
	    if (anIntArrayArray7649 == null)
		anIntArrayArray7649 = new int[1 + i_47_][];
	    else if (i_47_ >= anIntArrayArray7649.length)
		anIntArrayArray7649
		    = (int[][]) Arrays.copyOf(anIntArrayArray7649, 1 + i_47_);
	    anIntArrayArray7649[i_47_] = new int[3];
	    for (int i_48_ = 0; i_48_ < 3; i_48_++)
		anIntArrayArray7649[i_47_][i_48_]
		    = class534_sub40.method16530((byte) -126);
	}
    }
    
    public int method9610() {
	if (anInt7650 * 1103529081 != -1)
	    return anInt7650 * 1103529081;
	if (null != anIntArray7621) {
	    int i = (int) (Math.random() * (double) (305240865 * anInt7623));
	    int i_49_;
	    for (i_49_ = 0; i >= anIntArray7622[i_49_]; i_49_++)
		i -= anIntArray7622[i_49_];
	    return anIntArray7621[i_49_];
	}
	return -1;
    }
    
    public int method9611() {
	if (anInt7650 * 1103529081 != -1)
	    return anInt7650 * 1103529081;
	if (null != anIntArray7621) {
	    int i = (int) (Math.random() * (double) (305240865 * anInt7623));
	    int i_50_;
	    for (i_50_ = 0; i >= anIntArray7622[i_50_]; i_50_++)
		i -= anIntArray7622[i_50_];
	    return anIntArray7621[i_50_];
	}
	return -1;
    }
    
    public void method66(int i) {
	/* empty */
    }
    
    public int method9612() {
	if (anInt7650 * 1103529081 != -1)
	    return anInt7650 * 1103529081;
	if (null != anIntArray7621) {
	    int i = (int) (Math.random() * (double) (305240865 * anInt7623));
	    int i_51_;
	    for (i_51_ = 0; i >= anIntArray7622[i_51_]; i_51_++)
		i -= anIntArray7622[i_51_];
	    return anIntArray7621[i_51_];
	}
	return -1;
    }
    
    public boolean method9613(int i, int i_52_) {
	if (i == -1)
	    return false;
	if (anInt7650 * 1103529081 == i)
	    return true;
	if (anIntArray7621 != null) {
	    for (int i_53_ = 0; i_53_ < anIntArray7621.length; i_53_++) {
		if (anIntArray7621[i_53_] == i)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method9614(int i) {
	if (i == -1)
	    return false;
	if (anInt7650 * 1103529081 == i)
	    return true;
	if (anIntArray7621 != null) {
	    for (int i_54_ = 0; i_54_ < anIntArray7621.length; i_54_++) {
		if (anIntArray7621[i_54_] == i)
		    return true;
	    }
	}
	return false;
    }
    
    public boolean method9615(int i) {
	if (i == -1)
	    return false;
	if (anInt7650 * 1103529081 == i)
	    return true;
	if (anIntArray7621 != null) {
	    for (int i_55_ = 0; i_55_ < anIntArray7621.length; i_55_++) {
		if (anIntArray7621[i_55_] == i)
		    return true;
	    }
	}
	return false;
    }
    
    public Class446[] method9616(byte i) {
	if (null != aClass446Array7635)
	    return aClass446Array7635;
	if (anIntArrayArray7648 == null)
	    return null;
	aClass446Array7635 = new Class446[anIntArrayArray7648.length];
	for (int i_56_ = 0; i_56_ < anIntArrayArray7648.length; i_56_++) {
	    int i_57_ = 0;
	    int i_58_ = 0;
	    int i_59_ = 0;
	    int i_60_ = 0;
	    int i_61_ = 0;
	    int i_62_ = 0;
	    if (anIntArrayArray7648[i_56_] != null) {
		i_57_ = anIntArrayArray7648[i_56_][0];
		i_58_ = anIntArrayArray7648[i_56_][1];
		i_59_ = anIntArrayArray7648[i_56_][2];
		i_60_ = anIntArrayArray7648[i_56_][3] << 3;
		i_61_ = anIntArrayArray7648[i_56_][4] << 3;
		i_62_ = anIntArrayArray7648[i_56_][5] << 3;
	    }
	    if (i_57_ != 0 || i_58_ != 0 || 0 != i_59_ || i_60_ != 0
		|| i_61_ != 0 || 0 != i_62_) {
		Class446 class446 = aClass446Array7635[i_56_] = new Class446();
		if (i_62_ != 0)
		    class446.method7245(0.0F, 0.0F, 1.0F,
					Class427.method6799(i_62_));
		if (i_60_ != 0)
		    class446.method7245(1.0F, 0.0F, 0.0F,
					Class427.method6799(i_60_));
		if (i_61_ != 0)
		    class446.method7245(0.0F, 1.0F, 0.0F,
					Class427.method6799(i_61_));
		class446.method7287((float) i_57_, (float) i_58_,
				    (float) i_59_);
	    }
	}
	return aClass446Array7635;
    }
    
    public Class446[] method9617() {
	if (null != aClass446Array7635)
	    return aClass446Array7635;
	if (anIntArrayArray7648 == null)
	    return null;
	aClass446Array7635 = new Class446[anIntArrayArray7648.length];
	for (int i = 0; i < anIntArrayArray7648.length; i++) {
	    int i_63_ = 0;
	    int i_64_ = 0;
	    int i_65_ = 0;
	    int i_66_ = 0;
	    int i_67_ = 0;
	    int i_68_ = 0;
	    if (anIntArrayArray7648[i] != null) {
		i_63_ = anIntArrayArray7648[i][0];
		i_64_ = anIntArrayArray7648[i][1];
		i_65_ = anIntArrayArray7648[i][2];
		i_66_ = anIntArrayArray7648[i][3] << 3;
		i_67_ = anIntArrayArray7648[i][4] << 3;
		i_68_ = anIntArrayArray7648[i][5] << 3;
	    }
	    if (i_63_ != 0 || i_64_ != 0 || 0 != i_65_ || i_66_ != 0
		|| i_67_ != 0 || 0 != i_68_) {
		Class446 class446 = aClass446Array7635[i] = new Class446();
		if (i_68_ != 0)
		    class446.method7245(0.0F, 0.0F, 1.0F,
					Class427.method6799(i_68_));
		if (i_66_ != 0)
		    class446.method7245(1.0F, 0.0F, 0.0F,
					Class427.method6799(i_66_));
		if (i_67_ != 0)
		    class446.method7245(0.0F, 1.0F, 0.0F,
					Class427.method6799(i_67_));
		class446.method7287((float) i_63_, (float) i_64_,
				    (float) i_65_);
	    }
	}
	return aClass446Array7635;
    }
    
    public Class446[] method9618() {
	if (null != aClass446Array7635)
	    return aClass446Array7635;
	if (anIntArrayArray7648 == null)
	    return null;
	aClass446Array7635 = new Class446[anIntArrayArray7648.length];
	for (int i = 0; i < anIntArrayArray7648.length; i++) {
	    int i_69_ = 0;
	    int i_70_ = 0;
	    int i_71_ = 0;
	    int i_72_ = 0;
	    int i_73_ = 0;
	    int i_74_ = 0;
	    if (anIntArrayArray7648[i] != null) {
		i_69_ = anIntArrayArray7648[i][0];
		i_70_ = anIntArrayArray7648[i][1];
		i_71_ = anIntArrayArray7648[i][2];
		i_72_ = anIntArrayArray7648[i][3] << 3;
		i_73_ = anIntArrayArray7648[i][4] << 3;
		i_74_ = anIntArrayArray7648[i][5] << 3;
	    }
	    if (i_69_ != 0 || i_70_ != 0 || 0 != i_71_ || i_72_ != 0
		|| i_73_ != 0 || 0 != i_74_) {
		Class446 class446 = aClass446Array7635[i] = new Class446();
		if (i_74_ != 0)
		    class446.method7245(0.0F, 0.0F, 1.0F,
					Class427.method6799(i_74_));
		if (i_72_ != 0)
		    class446.method7245(1.0F, 0.0F, 0.0F,
					Class427.method6799(i_72_));
		if (i_73_ != 0)
		    class446.method7245(0.0F, 1.0F, 0.0F,
					Class427.method6799(i_73_));
		class446.method7287((float) i_69_, (float) i_70_,
				    (float) i_71_);
	    }
	}
	return aClass446Array7635;
    }
    
    public Class446[] method9619() {
	if (null != aClass446Array7635)
	    return aClass446Array7635;
	if (anIntArrayArray7648 == null)
	    return null;
	aClass446Array7635 = new Class446[anIntArrayArray7648.length];
	for (int i = 0; i < anIntArrayArray7648.length; i++) {
	    int i_75_ = 0;
	    int i_76_ = 0;
	    int i_77_ = 0;
	    int i_78_ = 0;
	    int i_79_ = 0;
	    int i_80_ = 0;
	    if (anIntArrayArray7648[i] != null) {
		i_75_ = anIntArrayArray7648[i][0];
		i_76_ = anIntArrayArray7648[i][1];
		i_77_ = anIntArrayArray7648[i][2];
		i_78_ = anIntArrayArray7648[i][3] << 3;
		i_79_ = anIntArrayArray7648[i][4] << 3;
		i_80_ = anIntArrayArray7648[i][5] << 3;
	    }
	    if (i_75_ != 0 || i_76_ != 0 || 0 != i_77_ || i_78_ != 0
		|| i_79_ != 0 || 0 != i_80_) {
		Class446 class446 = aClass446Array7635[i] = new Class446();
		if (i_80_ != 0)
		    class446.method7245(0.0F, 0.0F, 1.0F,
					Class427.method6799(i_80_));
		if (i_78_ != 0)
		    class446.method7245(1.0F, 0.0F, 0.0F,
					Class427.method6799(i_78_));
		if (i_79_ != 0)
		    class446.method7245(0.0F, 1.0F, 0.0F,
					Class427.method6799(i_79_));
		class446.method7287((float) i_75_, (float) i_76_,
				    (float) i_77_);
	    }
	}
	return aClass446Array7635;
    }
    
    public int[] method9620() {
	Class9 class9 = new Class9(16);
	Class297.method5347(anInt7650 * 1103529081, class9, (byte) 46);
	if (anIntArray7621 != null) {
	    int[] is = anIntArray7621;
	    for (int i = 0; i < is.length; i++) {
		int i_81_ = is[i];
		Class297.method5347(i_81_, class9, (byte) 31);
	    }
	}
	Class297.method5347(anInt7663 * -958760913, class9, (byte) 30);
	Class297.method5347(anInt7625 * -435773465, class9, (byte) 74);
	Class297.method5347(-162238255 * anInt7644, class9, (byte) 10);
	Class297.method5347(1439321197 * anInt7627, class9, (byte) 93);
	Class297.method5347(-450790695 * anInt7628, class9, (byte) 86);
	Class297.method5347(-550586123 * anInt7629, class9, (byte) 37);
	Class297.method5347(anInt7642 * 1074876801, class9, (byte) 122);
	Class297.method5347(anInt7631 * 421310407, class9, (byte) 35);
	Class297.method5347(-921167219 * anInt7632, class9, (byte) 79);
	Class297.method5347(anInt7633 * 541177679, class9, (byte) 68);
	Class297.method5347(1846476627 * anInt7634, class9, (byte) 19);
	Class297.method5347(anInt7638 * -63558043, class9, (byte) 114);
	Class297.method5347(anInt7636 * 630970333, class9, (byte) 29);
	Class297.method5347(anInt7647 * -1045334803, class9, (byte) 40);
	Class297.method5347(-1143184565 * anInt7620, class9, (byte) 78);
	Class297.method5347(-1927386945 * anInt7655, class9, (byte) 96);
	Class297.method5347(-2118591313 * anInt7640, class9, (byte) 82);
	Class297.method5347(anInt7626 * 738882867, class9, (byte) 66);
	Class297.method5347(anInt7624 * 1492387563, class9, (byte) 33);
	Class297.method5347(-208702779 * anInt7637, class9, (byte) 72);
	int[] is = new int[class9.method600(-167285008)];
	int i = 0;
	Iterator iterator = class9.iterator();
	while (iterator.hasNext()) {
	    Class534 class534 = (Class534) iterator.next();
	    is[i++] = (int) (class534.aLong7158 * 8258869577519436579L);
	}
	return is;
    }
    
    void method9621(Class534_Sub40 class534_sub40, int i, int i_82_) {
	if (1 == i) {
	    anInt7650 = class534_sub40.method16550((byte) 28) * 901817801;
	    anInt7644 = class534_sub40.method16550((byte) -29) * -1471551439;
	} else if (i == 2)
	    anInt7634 = class534_sub40.method16550((byte) -8) * 578264283;
	else if (3 == i)
	    anInt7638 = class534_sub40.method16550((byte) -71) * 308138861;
	else if (i == 4)
	    anInt7636 = class534_sub40.method16550((byte) 3) * 1759918197;
	else if (i == 5)
	    anInt7647 = class534_sub40.method16550((byte) -116) * 1386678501;
	else if (6 == i)
	    anInt7642 = class534_sub40.method16550((byte) -11) * 1568730753;
	else if (i == 7)
	    anInt7631 = class534_sub40.method16550((byte) 68) * 1401446903;
	else if (8 == i)
	    anInt7632 = class534_sub40.method16550((byte) -49) * 1039808581;
	else if (9 == i)
	    anInt7633 = class534_sub40.method16550((byte) -4) * 1271201711;
	else if (26 == i) {
	    anInt7630 = ((short) (class534_sub40.method16527(793717259) * 4)
			 * 1046108655);
	    anInt7645 = ((short) (class534_sub40.method16527(869549342) * 4)
			 * 541386065);
	} else if (27 == i) {
	    int i_83_ = class534_sub40.method16527(1803044002);
	    if (null == anIntArrayArray7648)
		anIntArrayArray7648 = new int[i_83_ + 1][];
	    else if (i_83_ >= anIntArrayArray7648.length)
		anIntArrayArray7648
		    = (int[][]) Arrays.copyOf(anIntArrayArray7648, 1 + i_83_);
	    anIntArrayArray7648[i_83_] = new int[6];
	    for (int i_84_ = 0; i_84_ < 6; i_84_++)
		anIntArrayArray7648[i_83_][i_84_]
		    = class534_sub40.method16530((byte) -57);
	} else if (28 == i) {
	    int i_85_ = class534_sub40.method16527(-499394254);
	    anIntArray7652 = new int[i_85_];
	    for (int i_86_ = 0; i_86_ < i_85_; i_86_++) {
		anIntArray7652[i_86_] = class534_sub40.method16527(1560692139);
		if (255 == anIntArray7652[i_86_])
		    anIntArray7652[i_86_] = -1;
	    }
	} else if (29 == i)
	    anInt7653 = class534_sub40.method16527(-476753505) * -1616629835;
	else if (30 == i)
	    anInt7641 = class534_sub40.method16529((byte) 1) * 274236715;
	else if (31 == i)
	    anInt7646 = class534_sub40.method16527(-1995421668) * 2008073541;
	else if (i == 32)
	    anInt7656 = class534_sub40.method16529((byte) 1) * -711654453;
	else if (33 == i)
	    anInt7657 = class534_sub40.method16530((byte) -51) * 1877611715;
	else if (i == 34)
	    anInt7658 = class534_sub40.method16527(-210350866) * 120822835;
	else if (i == 35)
	    anInt7659 = class534_sub40.method16529((byte) 1) * -825879347;
	else if (36 == i)
	    anInt7660 = class534_sub40.method16530((byte) -28) * -1509280213;
	else if (i == 37)
	    anInt7661 = class534_sub40.method16527(-1209815193) * 2046572415;
	else if (i == 38)
	    anInt7663 = class534_sub40.method16550((byte) -60) * -976367921;
	else if (i == 39)
	    anInt7625 = class534_sub40.method16550((byte) -59) * 217056215;
	else if (i == 40)
	    anInt7627 = class534_sub40.method16550((byte) 35) * 2062916965;
	else if (i == 41)
	    anInt7628 = class534_sub40.method16550((byte) -54) * 471164265;
	else if (i == 42)
	    anInt7629 = class534_sub40.method16550((byte) -2) * 1136014173;
	else if (43 == i)
	    class534_sub40.method16529((byte) 1);
	else if (i == 44)
	    class534_sub40.method16529((byte) 1);
	else if (45 == i)
	    anInt7662 = class534_sub40.method16529((byte) 1) * 1060452851;
	else if (i == 46)
	    anInt7620 = class534_sub40.method16550((byte) 46) * 248942179;
	else if (47 == i)
	    anInt7655 = class534_sub40.method16550((byte) -67) * 1243154239;
	else if (i == 48)
	    anInt7640 = class534_sub40.method16550((byte) 29) * 216005199;
	else if (49 == i)
	    anInt7626 = class534_sub40.method16550((byte) -3) * 1879477755;
	else if (i == 50)
	    anInt7624 = class534_sub40.method16550((byte) -21) * 1660121539;
	else if (51 == i)
	    anInt7637 = class534_sub40.method16550((byte) -90) * 547175437;
	else if (52 == i) {
	    int i_87_ = class534_sub40.method16527(-1871902995);
	    anIntArray7621 = new int[i_87_];
	    anIntArray7622 = new int[i_87_];
	    for (int i_88_ = 0; i_88_ < i_87_; i_88_++) {
		anIntArray7621[i_88_] = class534_sub40.method16550((byte) 14);
		int i_89_ = class534_sub40.method16527(-573894069);
		anIntArray7622[i_88_] = i_89_;
		anInt7623 += i_89_ * -495343391;
	    }
	} else if (53 == i)
	    aBool7639 = false;
	else if (54 == i) {
	    anInt7654
		= (class534_sub40.method16527(-2000500736) << 6) * -358189655;
	    anInt7643
		= (class534_sub40.method16527(1831273122) << 6) * -556508645;
	} else if (i == 55) {
	    int i_90_ = class534_sub40.method16527(-864814736);
	    if (null == anIntArray7651)
		anIntArray7651 = new int[1 + i_90_];
	    else if (i_90_ >= anIntArray7651.length)
		anIntArray7651 = Arrays.copyOf(anIntArray7651, i_90_ + 1);
	    anIntArray7651[i_90_] = class534_sub40.method16529((byte) 1);
	} else if (56 == i) {
	    int i_91_ = class534_sub40.method16527(66683448);
	    if (anIntArrayArray7649 == null)
		anIntArrayArray7649 = new int[1 + i_91_][];
	    else if (i_91_ >= anIntArrayArray7649.length)
		anIntArrayArray7649
		    = (int[][]) Arrays.copyOf(anIntArrayArray7649, 1 + i_91_);
	    anIntArrayArray7649[i_91_] = new int[3];
	    for (int i_92_ = 0; i_92_ < 3; i_92_++)
		anIntArrayArray7649[i_91_][i_92_]
		    = class534_sub40.method16530((byte) -57);
	}
    }
    
    Class570() {
	anIntArray7621 = null;
	anIntArray7622 = null;
	anInt7623 = 0;
	anInt7663 = 976367921;
	anInt7625 = -217056215;
	anInt7644 = 1471551439;
	anInt7627 = -2062916965;
	anInt7628 = -471164265;
	anInt7629 = -1136014173;
	anInt7642 = -1568730753;
	anInt7631 = -1401446903;
	anInt7632 = -1039808581;
	anInt7633 = -1271201711;
	anInt7634 = -578264283;
	anInt7638 = -308138861;
	anInt7636 = -1759918197;
	anInt7647 = -1386678501;
	anInt7620 = -248942179;
	anInt7655 = -1243154239;
	anInt7640 = -216005199;
	anInt7626 = -1879477755;
	anInt7624 = -1660121539;
	anInt7637 = -547175437;
	anInt7630 = 0;
	anInt7645 = 0;
	anInt7654 = 0;
	anInt7643 = 0;
	anInt7653 = 0;
	anInt7641 = 0;
	anInt7646 = 0;
	anInt7656 = 0;
	anInt7657 = 0;
	anInt7658 = 0;
	anInt7659 = 0;
	anInt7660 = 0;
	anInt7661 = -2046572415;
	anInt7662 = -1060452851;
	aBool7639 = true;
    }
    
    public int[] method9622(byte i) {
	Class9 class9 = new Class9(16);
	Class297.method5347(anInt7650 * 1103529081, class9, (byte) 106);
	if (anIntArray7621 != null) {
	    int[] is = anIntArray7621;
	    for (int i_93_ = 0; i_93_ < is.length; i_93_++) {
		int i_94_ = is[i_93_];
		Class297.method5347(i_94_, class9, (byte) 46);
	    }
	}
	Class297.method5347(anInt7663 * -958760913, class9, (byte) 43);
	Class297.method5347(anInt7625 * -435773465, class9, (byte) 119);
	Class297.method5347(-162238255 * anInt7644, class9, (byte) 49);
	Class297.method5347(1439321197 * anInt7627, class9, (byte) 63);
	Class297.method5347(-450790695 * anInt7628, class9, (byte) 68);
	Class297.method5347(-550586123 * anInt7629, class9, (byte) 19);
	Class297.method5347(anInt7642 * 1074876801, class9, (byte) 23);
	Class297.method5347(anInt7631 * 421310407, class9, (byte) 91);
	Class297.method5347(-921167219 * anInt7632, class9, (byte) 124);
	Class297.method5347(anInt7633 * 541177679, class9, (byte) 46);
	Class297.method5347(1846476627 * anInt7634, class9, (byte) 23);
	Class297.method5347(anInt7638 * -63558043, class9, (byte) 70);
	Class297.method5347(anInt7636 * 630970333, class9, (byte) 113);
	Class297.method5347(anInt7647 * -1045334803, class9, (byte) 49);
	Class297.method5347(-1143184565 * anInt7620, class9, (byte) 15);
	Class297.method5347(-1927386945 * anInt7655, class9, (byte) 86);
	Class297.method5347(-2118591313 * anInt7640, class9, (byte) 67);
	Class297.method5347(anInt7626 * 738882867, class9, (byte) 12);
	Class297.method5347(anInt7624 * 1492387563, class9, (byte) 110);
	Class297.method5347(-208702779 * anInt7637, class9, (byte) 12);
	int[] is = new int[class9.method600(-834855623)];
	int i_95_ = 0;
	Iterator iterator = class9.iterator();
	while (iterator.hasNext()) {
	    Class534 class534 = (Class534) iterator.next();
	    is[i_95_++] = (int) (class534.aLong7158 * 8258869577519436579L);
	}
	return is;
    }
    
    static final void method9623(int i, Class9 class9) {
	if (i != -1 && class9.method579((long) i) == null)
	    class9.method581(new Class534(), (long) i);
    }
    
    static final void method9624(int i) {
	int i_96_ = Class108.anInt1321 * -1843550713;
	int[] is = Class108.anIntArray1322;
	for (int i_97_ = 0; i_97_ < i_96_; i_97_++) {
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[is[i_97_]];
	    if (class654_sub1_sub5_sub1_sub2 != null)
		Class40.method1034(class654_sub1_sub5_sub1_sub2, false,
				   -1347354288);
	}
    }
    
    static final void method9625(short i) {
	Iterator iterator = client.aClass9_11322.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub18_Sub5 class534_sub18_sub5
		= (Class534_Sub18_Sub5) iterator.next();
	    Class654_Sub1_Sub5_Sub5 class654_sub1_sub5_sub5
		= class534_sub18_sub5.aClass654_Sub1_Sub5_Sub5_11651;
	    class654_sub1_sub5_sub5.method18776(1, (byte) 0);
	    if (class654_sub1_sub5_sub5.method18778(1885007458)) {
		class534_sub18_sub5.method8892((byte) 1);
		class654_sub1_sub5_sub5.method18781((byte) 67);
	    }
	}
    }
}
