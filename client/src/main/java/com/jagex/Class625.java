/* Class625 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class625
{
    static int anInt8151;
    static Class536_Sub2_Sub1_Sub1[] aClass536_Sub2_Sub1_Sub1Array8152;
    static int anInt8153 = 0;
    static List aList8154;
    static Class9 aClass9_8155;
    static int anInt8156;
    static int anInt8157 = 0;
    static int anInt8158;
    static Interface46 anInterface46_8159;
    static Class384[] aClass384Array8160;
    static int anInt8161;
    static Class9 aClass9_8162;
    static int anInt8163;
    static int anInt8164;
    static int anInt8165 = 0;
    public static byte aByte8166;
    
    static {
	anInt8156 = 0;
	anInt8163 = 0;
	anInt8158 = 0;
	aClass384Array8160 = new Class384[16];
	anInt8161 = 0;
	aClass9_8162 = new Class9(16);
	aClass9_8155 = new Class9(8);
	anInt8151 = 0;
	anInt8164 = -513732962;
    }
    
    public static void method10313(int i) {
	if (i < 0 || i > 2)
	    i = 0;
	anInt8164 = -256866481 * i;
	OutputStream_Sub1.aClass629Array11013
	    = (new Class629
	       [Class184.anIntArray1982[anInt8164 * -1429983313] + 1]);
	anInt8165 = 0;
	anInt8156 = 0;
    }
    
    static int method10314(int i) {
	Class534_Sub39 class534_sub39
	    = (Class534_Sub39) aClass9_8162.method579((long) i);
	if (class534_sub39 == null) {
	    Class384 class384 = anInterface46_8159.method345(i, -404064168);
	    if (null == class384 || 2 != class384.anInt3954 * 302557339)
		return -1;
	    class534_sub39 = new Class534_Sub39(1254165885 * anInt8161);
	    aClass9_8162.method581(class534_sub39, (long) i);
	    aClass384Array8160[(anInt8161 += 1391825877) * 1254165885 - 1]
		= class384;
	}
	return class534_sub39.anInt10807 * -705967177;
    }
    
    public static void method10315(Interface48 interface48,
				   Interface46 interface46) {
	anInt8153 = 0;
	anInt8157 = 0;
	aList8154 = new LinkedList();
	aClass536_Sub2_Sub1_Sub1Array8152 = new Class536_Sub2_Sub1_Sub1[1024];
	OutputStream_Sub1.aClass629Array11013
	    = (new Class629
	       [Class184.anIntArray1982[-1429983313 * anInt8164] + 1]);
	anInt8165 = 0;
	anInt8156 = 0;
	anInterface46_8159 = interface46;
    }
    
    public static void method10316(Class185 class185, long l) {
	anInt8158 = 407378687 * anInt8163;
	anInt8163 = 0;
	Class250.method4604((byte) -124);
	Iterator iterator = aList8154.iterator();
	while (iterator.hasNext()) {
	    Class629 class629 = (Class629) iterator.next();
	    boolean bool = class629.method10391(class185, l);
	    if (!bool) {
		iterator.remove();
		OutputStream_Sub1.aClass629Array11013[anInt8156 * -2056179105]
		    = class629;
		anInt8156
		    = ((1 + anInt8156 * -2056179105
			& Class184.anIntArray1982[-1429983313 * anInt8164])
		       * -80762465);
	    }
	}
    }
    
    public static void method10317(int i) {
	if (i < 0 || i > 2)
	    i = 0;
	anInt8164 = -256866481 * i;
	OutputStream_Sub1.aClass629Array11013
	    = (new Class629
	       [Class184.anIntArray1982[anInt8164 * -1429983313] + 1]);
	anInt8165 = 0;
	anInt8156 = 0;
    }
    
    public static void method10318(Class185 class185, long l) {
	anInt8158 = 407378687 * anInt8163;
	anInt8163 = 0;
	Class250.method4604((byte) -52);
	Iterator iterator = aList8154.iterator();
	while (iterator.hasNext()) {
	    Class629 class629 = (Class629) iterator.next();
	    boolean bool = class629.method10391(class185, l);
	    if (!bool) {
		iterator.remove();
		OutputStream_Sub1.aClass629Array11013[anInt8156 * -2056179105]
		    = class629;
		anInt8156
		    = ((1 + anInt8156 * -2056179105
			& Class184.anIntArray1982[-1429983313 * anInt8164])
		       * -80762465);
	    }
	}
    }
    
    public static void method10319(Class556 class556, Class185 class185) {
	Iterator iterator = aList8154.iterator();
	while (iterator.hasNext()) {
	    Class629 class629 = (Class629) iterator.next();
	    if (class629.aBool8188)
		class629.method10397(class556, class185);
	}
    }
    
    public static void method10320() {
	aClass9_8155 = new Class9(8);
	anInt8151 = 0;
	Iterator iterator = aList8154.iterator();
	while (iterator.hasNext()) {
	    Class629 class629 = (Class629) iterator.next();
	    class629.method10388();
	}
    }
    
    public static void method10321(Class185 class185, long l) {
	anInt8158 = 407378687 * anInt8163;
	anInt8163 = 0;
	Class250.method4604((byte) -81);
	Iterator iterator = aList8154.iterator();
	while (iterator.hasNext()) {
	    Class629 class629 = (Class629) iterator.next();
	    boolean bool = class629.method10391(class185, l);
	    if (!bool) {
		iterator.remove();
		OutputStream_Sub1.aClass629Array11013[anInt8156 * -2056179105]
		    = class629;
		anInt8156
		    = ((1 + anInt8156 * -2056179105
			& Class184.anIntArray1982[-1429983313 * anInt8164])
		       * -80762465);
	    }
	}
    }
    
    Class625() throws Throwable {
	throw new Error();
    }
    
    public static int method10322() {
	return anInt8164 * -1429983313;
    }
    
    public static int method10323() {
	return anInt8164 * -1429983313;
    }
    
    public static int method10324() {
	return anInt8164 * -1429983313;
    }
    
    static final void method10325(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    static final void method10326(Class669 class669, byte i) {
	class669.anInt8600 -= 926998689;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	int i_2_
	    = class669.anIntArray8595[2 + 2088438307 * class669.anInt8600];
	Integer integer
	    = (Integer) client.aClass219_11338.method4120(i_0_, (byte) 79)
			    .method4376(i_1_, i_2_, (short) 6811);
	if (integer == null)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= integer.intValue();
    }
    
    static final void method10327(Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (client.anInt11194 * 365872613 != 0
	    || ((!client.aBool11223 || client.aBool11196)
		&& !client.aBool11076)) {
	    String string_3_ = string.toLowerCase();
	    int i_4_ = 0;
	    if (string_3_.startsWith
		(Class58.aClass58_618.method1245(Class672.aClass672_8621,
						 (byte) -6))) {
		i_4_ = 0;
		string = string.substring(Class58.aClass58_618.method1245
					      (Class672.aClass672_8621,
					       (byte) -106)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_619.method1245
					    (Class672.aClass672_8621,
					     (byte) -88))) {
		i_4_ = 1;
		string = string.substring(Class58.aClass58_619.method1245
					      (Class672.aClass672_8621,
					       (byte) -54)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_556.method1245
					    (Class672.aClass672_8621,
					     (byte) -76))) {
		i_4_ = 2;
		string = string.substring(Class58.aClass58_556.method1245
					      (Class672.aClass672_8621,
					       (byte) -16)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_621.method1245
					    (Class672.aClass672_8621,
					     (byte) -35))) {
		i_4_ = 3;
		string = string.substring(Class58.aClass58_621.method1245
					      (Class672.aClass672_8621,
					       (byte) -127)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_622.method1245
					    (Class672.aClass672_8621,
					     (byte) -47))) {
		i_4_ = 4;
		string = string.substring(Class58.aClass58_622.method1245
					      (Class672.aClass672_8621,
					       (byte) -104)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_551.method1245
					    (Class672.aClass672_8621,
					     (byte) -17))) {
		i_4_ = 5;
		string = string.substring(Class58.aClass58_551.method1245
					      (Class672.aClass672_8621,
					       (byte) -20)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_624.method1245
					    (Class672.aClass672_8621,
					     (byte) -43))) {
		i_4_ = 6;
		string = string.substring(Class58.aClass58_624.method1245
					      (Class672.aClass672_8621,
					       (byte) -31)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_625.method1245
					    (Class672.aClass672_8621,
					     (byte) -31))) {
		i_4_ = 7;
		string = string.substring(Class58.aClass58_625.method1245
					      (Class672.aClass672_8621,
					       (byte) -34)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_484.method1245
					    (Class672.aClass672_8621,
					     (byte) -128))) {
		i_4_ = 8;
		string
		    = string.substring(Class58.aClass58_484.method1245
					   (Class672.aClass672_8621, (byte) -7)
					   .length());
	    } else if (string_3_.startsWith
		       (Class58.aClass58_627
			    .method1245(Class672.aClass672_8621, (byte) -4))) {
		i_4_ = 9;
		string = string.substring(Class58.aClass58_627.method1245
					      (Class672.aClass672_8621,
					       (byte) -38)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_628.method1245
					    (Class672.aClass672_8621,
					     (byte) -29))) {
		i_4_ = 10;
		string = string.substring(Class58.aClass58_628.method1245
					      (Class672.aClass672_8621,
					       (byte) -127)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_483.method1245
					    (Class672.aClass672_8621,
					     (byte) -34))) {
		i_4_ = 11;
		string = string.substring(Class58.aClass58_483.method1245
					      (Class672.aClass672_8621,
					       (byte) -33)
					      .length());
	    } else if (Class539.aClass672_7171 != Class672.aClass672_8621) {
		if (string_3_.startsWith
		    (Class58.aClass58_618.method1245(Class539.aClass672_7171,
						     (byte) -12))) {
		    i_4_ = 0;
		    string = string.substring(Class58.aClass58_618.method1245
						  (Class539.aClass672_7171,
						   (byte) -81)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_619.method1245
						(Class539.aClass672_7171,
						 (byte) -79))) {
		    i_4_ = 1;
		    string = string.substring(Class58.aClass58_619.method1245
						  (Class539.aClass672_7171,
						   (byte) -44)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_556.method1245
						(Class539.aClass672_7171,
						 (byte) -29))) {
		    i_4_ = 2;
		    string = string.substring(Class58.aClass58_556.method1245
						  (Class539.aClass672_7171,
						   (byte) -83)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_621.method1245
						(Class539.aClass672_7171,
						 (byte) -19))) {
		    i_4_ = 3;
		    string = string.substring(Class58.aClass58_621.method1245
						  (Class539.aClass672_7171,
						   (byte) -47)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_622.method1245
						(Class539.aClass672_7171,
						 (byte) -102))) {
		    i_4_ = 4;
		    string = string.substring(Class58.aClass58_622.method1245
						  (Class539.aClass672_7171,
						   (byte) -6)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_551.method1245
						(Class539.aClass672_7171,
						 (byte) -30))) {
		    i_4_ = 5;
		    string = string.substring(Class58.aClass58_551.method1245
						  (Class539.aClass672_7171,
						   (byte) -6)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_624.method1245
						(Class539.aClass672_7171,
						 (byte) -72))) {
		    i_4_ = 6;
		    string = string.substring(Class58.aClass58_624.method1245
						  (Class539.aClass672_7171,
						   (byte) -97)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_625.method1245
						(Class539.aClass672_7171,
						 (byte) -34))) {
		    i_4_ = 7;
		    string = string.substring(Class58.aClass58_625.method1245
						  (Class539.aClass672_7171,
						   (byte) -76)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_484.method1245
						(Class539.aClass672_7171,
						 (byte) -20))) {
		    i_4_ = 8;
		    string = string.substring(Class58.aClass58_484.method1245
						  (Class539.aClass672_7171,
						   (byte) -93)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_627.method1245
						(Class539.aClass672_7171,
						 (byte) -22))) {
		    i_4_ = 9;
		    string = string.substring(Class58.aClass58_627.method1245
						  (Class539.aClass672_7171,
						   (byte) -116)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_628.method1245
						(Class539.aClass672_7171,
						 (byte) -40))) {
		    i_4_ = 10;
		    string = string.substring(Class58.aClass58_628.method1245
						  (Class539.aClass672_7171,
						   (byte) -127)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_483.method1245
						(Class539.aClass672_7171,
						 (byte) -76))) {
		    i_4_ = 11;
		    string = string.substring(Class58.aClass58_483.method1245
						  (Class539.aClass672_7171,
						   (byte) -15)
						  .length());
		}
	    }
	    string_3_ = string.toLowerCase();
	    int i_5_ = 0;
	    if (string_3_.startsWith
		(Class58.aClass58_630.method1245(Class672.aClass672_8621,
						 (byte) -64))) {
		i_5_ = 1;
		string = string.substring(Class58.aClass58_630.method1245
					      (Class672.aClass672_8621,
					       (byte) -103)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_561.method1245
					    (Class672.aClass672_8621,
					     (byte) -70))) {
		i_5_ = 2;
		string = string.substring(Class58.aClass58_561.method1245
					      (Class672.aClass672_8621,
					       (byte) -95)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_632.method1245
					    (Class672.aClass672_8621,
					     (byte) -61))) {
		i_5_ = 3;
		string = string.substring(Class58.aClass58_632.method1245
					      (Class672.aClass672_8621,
					       (byte) -119)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_633.method1245
					    (Class672.aClass672_8621,
					     (byte) -45))) {
		i_5_ = 4;
		string = string.substring(Class58.aClass58_633.method1245
					      (Class672.aClass672_8621,
					       (byte) -119)
					      .length());
	    } else if (string_3_.startsWith(Class58.aClass58_626.method1245
					    (Class672.aClass672_8621,
					     (byte) -107))) {
		i_5_ = 5;
		string = string.substring(Class58.aClass58_626.method1245
					      (Class672.aClass672_8621,
					       (byte) -59)
					      .length());
	    } else if (Class539.aClass672_7171 != Class672.aClass672_8621) {
		if (string_3_.startsWith
		    (Class58.aClass58_630.method1245(Class539.aClass672_7171,
						     (byte) -108))) {
		    i_5_ = 1;
		    string = string.substring(Class58.aClass58_630.method1245
						  (Class539.aClass672_7171,
						   (byte) -52)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_561.method1245
						(Class539.aClass672_7171,
						 (byte) -28))) {
		    i_5_ = 2;
		    string = string.substring(Class58.aClass58_561.method1245
						  (Class539.aClass672_7171,
						   (byte) -27)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_632.method1245
						(Class539.aClass672_7171,
						 (byte) -1))) {
		    i_5_ = 3;
		    string = string.substring(Class58.aClass58_632.method1245
						  (Class539.aClass672_7171,
						   (byte) -93)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_633.method1245
						(Class539.aClass672_7171,
						 (byte) -46))) {
		    i_5_ = 4;
		    string = string.substring(Class58.aClass58_633.method1245
						  (Class539.aClass672_7171,
						   (byte) -92)
						  .length());
		} else if (string_3_.startsWith(Class58.aClass58_626.method1245
						(Class539.aClass672_7171,
						 (byte) -57))) {
		    i_5_ = 5;
		    string = string.substring(Class58.aClass58_626.method1245
						  (Class539.aClass672_7171,
						   (byte) -14)
						  .length());
		}
	    }
	    Class100 class100 = Class201.method3864(2095398292);
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4246,
				      class100.aClass13_1183, 1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16506(0,
								  184911001);
	    int i_6_
		= (31645619
		   * class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16506(i_4_,
								  976954345);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16506(i_5_,
								  761702110);
	    Class188.method3753(class534_sub19.aClass534_Sub40_Sub1_10513,
				string, (byte) -9);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16528
		(31645619 * (class534_sub19.aClass534_Sub40_Sub1_10513
			     .anInt10811) - i_6_,
		 1952816963);
	    class100.method1863(class534_sub19, (byte) 120);
	}
    }
    
    static Class247 method10328(Class247 class247, int i) {
	Class247 class247_7_ = client.method17393(class247);
	if (null == class247_7_)
	    class247_7_ = class247.aClass247_2556;
	return class247_7_;
    }
    
    static final void method10329(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	class669.anInt8600 -= 926998689;
	int i_8_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_9_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	int i_10_
	    = class669.anIntArray8595[2 + 2088438307 * class669.anInt8600];
	Class16 class16
	    = Class351.aClass406_3620.method6666(client.anInterface52_11081,
						 i_9_, (byte) 100);
	String string_11_
	    = class16.method734(string, i_8_, Class658.aClass163Array8541,
				i_10_, -1495101509);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = string_11_ != null ? string_11_ : "";
    }
    
    static final void method10330
	(Class669 class669, Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1,
	 int i) {
	class669.anInt8600 -= 1235998252;
	int i_12_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_13_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	int i_14_
	    = class669.anIntArray8595[2 + 2088438307 * class669.anInt8600];
	boolean bool
	    = (class669.anIntArray8595[3 + class669.anInt8600 * 2088438307]
	       == 1);
	if (Class599.aClass298_Sub1_7871.method5425(1728732611)
	    != Class293.aClass293_3125)
	    throw new RuntimeException();
	Class706_Sub4 class706_sub4
	    = ((Class706_Sub4)
	       Class599.aClass298_Sub1_7871.method5381(1916858416));
	if (null != class654_sub1_sub5_sub1)
	    class706_sub4.method17297(class654_sub1_sub5_sub1,
				      new Class438((float) i_12_,
						   (float) i_13_,
						   (float) i_14_),
				      bool, (byte) -15);
	client.aBool11147 = true;
    }
    
    public static Class702 method10331(int i) {
	if (null == Class331.aClass702_3495)
	    return Class702.aClass702_8811;
	return Class331.aClass702_3495;
    }
}
