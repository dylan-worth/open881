/* Class698 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class698
{
    Class698() throws Throwable {
	throw new Error();
    }
    
    public static int method14119(Class665 class665, Class668 class668,
				  int i) {
	if (Class665.aClass665_8561 == class665)
	    return 43594;
	return i + 40000;
    }
    
    public static int method14120(Class665 class665, Class668 class668,
				  int i) {
	if (Class665.aClass665_8561 == class665)
	    return 43594;
	return i + 40000;
    }
    
    public static int method14121(Class665 class665, Class668 class668,
				  int i) {
	if (Class665.aClass665_8561 == class665)
	    return 80;
	if (class668 == Class668.aClass668_8584)
	    return i + 12000;
	return 7000 + i;
    }
    
    static final void method14122(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (null != client.aString11300
	    && i_0_ < Class455.anInt4963 * -217094943)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= Class168.aClass98Array1792[i_0_].aByte1163;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static void method14123(Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1,
			    int i, int i_1_, int i_2_, byte i_3_) {
	Class570 class570 = class654_sub1_sub5_sub1.method18531((byte) 3);
	Class711_Sub1 class711_sub1
	    = class654_sub1_sub5_sub1.aClass711_Sub1_11965;
	int i_4_
	    = ((class654_sub1_sub5_sub1.anInt11972 * 1306061223
		- 949937137 * class654_sub1_sub5_sub1.aClass57_11973.anInt457)
	       & 0x3fff);
	if (i == Class676.aClass676_8646.aByte8648) {
	    if (i_4_ != 0
		|| -358869573 * class654_sub1_sub5_sub1.anInt11970 > 25) {
		if (i_2_ < 0 && -1 != class570.anInt7663 * -958760913) {
		    class711_sub1.method14386(-958760913 * class570.anInt7663,
					      false, true, -754240085);
		    class711_sub1.aBool10971 = false;
		} else if (i_2_ > 0 && -1 != class570.anInt7625 * -435773465) {
		    class711_sub1.method14386(class570.anInt7625 * -435773465,
					      false, true, -1279651251);
		    class711_sub1.aBool10971 = false;
		} else if (!class711_sub1.aBool10971
			   || !class570.method9613(class711_sub1
						       .method14329(826205960),
						   -622301414)) {
		    class711_sub1.method14386(class570.method9600(308999563),
					      false, true, 448376405);
		    class711_sub1.aBool10971
			= class654_sub1_sub5_sub1.aClass711_Sub1_11965
			      .method14338((byte) 0);
		}
	    } else if (!class711_sub1.aBool10971
		       || !class570.method9613(class711_sub1
						   .method14329(2104508992),
					       -622301414)) {
		class711_sub1.method14386(class570.method9600(308999563),
					  false, true, -853177214);
		class711_sub1.aBool10971 = class711_sub1.method14338((byte) 0);
	    }
	} else if (1409535459 * class654_sub1_sub5_sub1.anInt11944 != -1
		   && (i_4_ >= 10240 || i_4_ <= 2048)) {
	    int i_5_ = ((client.anIntArray11122[i_1_]
			 - (class654_sub1_sub5_sub1.aClass57_11973.anInt457
			    * 949937137))
			& 0x3fff);
	    if (i == Class676.aClass676_8650.aByte8648
		&& -1 != class570.anInt7642 * 1074876801) {
		if (i_5_ > 2048 && i_5_ <= 6144
		    && -1 != class570.anInt7633 * 541177679)
		    class711_sub1.method14386(class570.anInt7633 * 541177679,
					      false, true, 831812347);
		else if (i_5_ >= 10240 && i_5_ < 14336
			 && -1 != -921167219 * class570.anInt7632)
		    class711_sub1.method14386(class570.anInt7632 * -921167219,
					      false, true, -1024723548);
		else if (i_5_ > 6144 && i_5_ < 10240
			 && 421310407 * class570.anInt7631 != -1)
		    class711_sub1.method14386(class570.anInt7631 * 421310407,
					      false, true, -457484771);
		else
		    class711_sub1.method14386(class570.anInt7642 * 1074876801,
					      false, true, -1259236702);
	    } else if (i == Class676.aClass676_8644.aByte8648
		       && -1 != class570.anInt7634 * 1846476627) {
		if (i_5_ > 2048 && i_5_ <= 6144
		    && -1 != -1045334803 * class570.anInt7647)
		    class711_sub1.method14386(-1045334803 * class570.anInt7647,
					      false, true, -145886770);
		else if (i_5_ >= 10240 && i_5_ < 14336
			 && class570.anInt7636 * 630970333 != -1)
		    class711_sub1.method14386(class570.anInt7636 * 630970333,
					      false, true, 1118787207);
		else if (i_5_ > 6144 && i_5_ < 10240
			 && -63558043 * class570.anInt7638 != -1)
		    class711_sub1.method14386(class570.anInt7638 * -63558043,
					      false, true, -32216057);
		else
		    class711_sub1.method14386(1846476627 * class570.anInt7634,
					      false, true, 420906828);
	    } else if (i_5_ > 2048 && i_5_ <= 6144
		       && -1 != -550586123 * class570.anInt7629)
		class711_sub1.method14386(class570.anInt7629 * -550586123,
					  false, true, -2075250701);
	    else if (i_5_ >= 10240 && i_5_ < 14336
		     && class570.anInt7628 * -450790695 != -1)
		class711_sub1.method14386(-450790695 * class570.anInt7628,
					  false, true, -594026584);
	    else if (i_5_ > 6144 && i_5_ < 10240
		     && class570.anInt7627 * 1439321197 != -1)
		class711_sub1.method14386(class570.anInt7627 * 1439321197,
					  false, true, 1039199303);
	    else
		class711_sub1.method14386(-162238255 * class570.anInt7644,
					  false, true, -655819300);
	    class711_sub1.aBool10971 = false;
	} else if (0 != i_4_
		   || -358869573 * class654_sub1_sub5_sub1.anInt11970 > 25) {
	    if (Class676.aClass676_8650.aByte8648 == i
		&& -1 != 1074876801 * class570.anInt7642) {
		if (i_2_ < 0 && -2118591313 * class570.anInt7640 != -1)
		    class711_sub1.method14386(class570.anInt7640 * -2118591313,
					      false, true, -1544083832);
		else if (i_2_ > 0 && -1 != 738882867 * class570.anInt7626)
		    class711_sub1.method14386(738882867 * class570.anInt7626,
					      false, true, -1392513144);
		else
		    class711_sub1.method14386(1074876801 * class570.anInt7642,
					      false, true, 176996);
	    } else if (i == Class676.aClass676_8644.aByte8648
		       && 1846476627 * class570.anInt7634 != -1) {
		if (i_2_ < 0 && -1143184565 * class570.anInt7620 != -1)
		    class711_sub1.method14386(-1143184565 * class570.anInt7620,
					      false, true, -949376390);
		else if (i_2_ > 0 && -1927386945 * class570.anInt7655 != -1)
		    class711_sub1.method14386(-1927386945 * class570.anInt7655,
					      false, true, 1519150075);
		else
		    class711_sub1.method14386(class570.anInt7634 * 1846476627,
					      false, true, 849166972);
	    } else if (i_2_ < 0 && 1492387563 * class570.anInt7624 != -1)
		class711_sub1.method14386(1492387563 * class570.anInt7624,
					  false, true, -148948939);
	    else if (i_2_ > 0 && -208702779 * class570.anInt7637 != -1)
		class711_sub1.method14386(class570.anInt7637 * -208702779,
					  false, true, -147149788);
	    else
		class711_sub1.method14386(-162238255 * class570.anInt7644,
					  false, true, 1639081484);
	    class711_sub1.aBool10971 = false;
	} else {
	    if (i == Class676.aClass676_8650.aByte8648
		&& -1 != 1074876801 * class570.anInt7642)
		class711_sub1.method14386(class570.anInt7642 * 1074876801,
					  false, true, 406903973);
	    else if (Class676.aClass676_8644.aByte8648 == i
		     && -1 != class570.anInt7634 * 1846476627)
		class711_sub1.method14386(class570.anInt7634 * 1846476627,
					  false, true, 739935713);
	    else
		class711_sub1.method14386(class570.anInt7644 * -162238255,
					  false, true, -1875634527);
	    class711_sub1.aBool10971 = false;
	}
    }
    
    static boolean method14124(int i, int i_6_) {
	if (18 == i || i == 19 || 20 == i || 21 == i || 22 == i || i == 1004)
	    return true;
	if (17 == i)
	    return true;
	return false;
    }
}
