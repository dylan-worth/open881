/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class5
{
    static int anInt40;
    public static RSSocket aClass23_41;
    static Class606_Sub1[] aClass606_Sub1Array42;
    public static RSSocket aClass23_43;
    static Class641 aClass641_44;
    public static boolean aBool45 = false;
    public static long aLong46;
    public static RSSocket aClass23_47;
    static int anInt48;
    public static RSSocket aClass23_49;
    public static RSSocket aClass23_50;
    public static boolean aBool51;
    
    public static Class606_Sub1 method536() {
	if (anInt48 * -120407133 < aClass606_Sub1Array42.length)
	    return (aClass606_Sub1Array42
		    [(anInt48 += -1352314869) * -120407133 - 1]);
	return null;
    }
    
    static {
	aClass606_Sub1Array42 = new Class606_Sub1[0];
	anInt48 = 2084950114;
	anInt40 = 0;
	aClass641_44 = null;
	aBool51 = false;
    }
    
    public static void method537() {
	if (aBool51) {
	    if (anInt40 * 2045011039 < 206492647 * Class619.anInt8108)
		anInt40 = Class619.anInt8108 * 1816624505;
	    while (2045011039 * anInt40 < -1664594981 * Class619.anInt8109) {
		Class606_Sub1 class606_sub1
		    = Class521.method8688(anInt40 * 2045011039, -1714193597);
		if (null == class606_sub1
		    || -1 != class606_sub1.anInt10856 * -663639827)
		    anInt40 += 1148385183;
		else {
		    if (null == aClass641_44)
			aClass641_44
			    = (client.aClass648_11259.method10695
			       (class606_sub1.aString10857, -1923752677));
		    int i = -685874327 * aClass641_44.anInt8338;
		    if (-1 == i)
			break;
		    class606_sub1.anInt10856 = i * 307950821;
		    anInt40 += 1148385183;
		    aClass641_44 = null;
		}
	    }
	}
    }
    
    public static void method538() {
	if (aBool51) {
	    if (anInt40 * 2045011039 < 206492647 * Class619.anInt8108)
		anInt40 = Class619.anInt8108 * 1816624505;
	    while (2045011039 * anInt40 < -1664594981 * Class619.anInt8109) {
		Class606_Sub1 class606_sub1
		    = Class521.method8688(anInt40 * 2045011039, 51007419);
		if (null == class606_sub1
		    || -1 != class606_sub1.anInt10856 * -663639827)
		    anInt40 += 1148385183;
		else {
		    if (null == aClass641_44)
			aClass641_44
			    = (client.aClass648_11259.method10695
			       (class606_sub1.aString10857, -1823866271));
		    int i = -685874327 * aClass641_44.anInt8338;
		    if (-1 == i)
			break;
		    class606_sub1.anInt10856 = i * 307950821;
		    anInt40 += 1148385183;
		    aClass641_44 = null;
		}
	    }
	}
    }
    
    static void method539(int i, int i_0_, int i_1_, boolean bool, int i_2_,
			  boolean bool_3_) {
	if (i < i_0_) {
	    int i_4_ = (i_0_ + i) / 2;
	    int i_5_ = i;
	    Class606_Sub1 class606_sub1 = aClass606_Sub1Array42[i_4_];
	    aClass606_Sub1Array42[i_4_] = aClass606_Sub1Array42[i_0_];
	    aClass606_Sub1Array42[i_0_] = class606_sub1;
	    for (int i_6_ = i; i_6_ < i_0_; i_6_++) {
		if (Class12.method637(aClass606_Sub1Array42[i_6_],
				      class606_sub1, i_1_, bool, i_2_, bool_3_,
				      (byte) 40)
		    <= 0) {
		    Class606_Sub1 class606_sub1_7_
			= aClass606_Sub1Array42[i_6_];
		    aClass606_Sub1Array42[i_6_] = aClass606_Sub1Array42[i_5_];
		    aClass606_Sub1Array42[i_5_++] = class606_sub1_7_;
		}
	    }
	    aClass606_Sub1Array42[i_0_] = aClass606_Sub1Array42[i_5_];
	    aClass606_Sub1Array42[i_5_] = class606_sub1;
	    Class9.method602(i, i_5_ - 1, i_1_, bool, i_2_, bool_3_,
			     (byte) 98);
	    Class9.method602(i_5_ + 1, i_0_, i_1_, bool, i_2_, bool_3_,
			     (byte) 22);
	}
    }
    
    public static void method540() {
	if (-1664252895 * aClass23_43.anInt227 != -1)
	    Class312_Sub1_Sub1.method18102(-1664252895 * aClass23_43.anInt227,
					   aClass23_43.aString223,
					   aClass23_43.anInt222 * 606493275,
					   1001670253 * aClass23_43.anInt225,
					   (byte) -33);
    }
    
    public static void method541(String string, int i) {
	if (aClass23_49 == null)
	    aClass23_49 = new RSSocket();
	aClass23_49.aString223 = string;
	aClass23_49.anInt227 = 1619197921 * (1099 + i);
	aClass23_49.anInt222
	    = Class11.method612(client.aClass665_11211,
				Class668.aClass668_8584,
				aClass23_49.anInt227 * -1664252895,
				(byte) -25) * 1852523987;
	aClass23_49.anInt225
	    = Class488.method7999(client.aClass665_11211,
				  Class668.aClass668_8584,
				  -1664252895 * aClass23_49.anInt227,
				  353134756) * -102059163;
    }
    
    public static void method542(String string, int i) {
	if (aClass23_49 == null)
	    aClass23_49 = new RSSocket();
	aClass23_49.aString223 = string;
	aClass23_49.anInt227 = 1619197921 * (1099 + i);
	aClass23_49.anInt222
	    = (Class11.method612(client.aClass665_11211,
				 Class668.aClass668_8584,
				 aClass23_49.anInt227 * -1664252895, (byte) 57)
	       * 1852523987);
	aClass23_49.anInt225
	    = Class488.method7999(client.aClass665_11211,
				  Class668.aClass668_8584,
				  -1664252895 * aClass23_49.anInt227,
				  353134756) * -102059163;
    }
    
    public static Class606_Sub1 method543() {
	if (anInt48 * -120407133 < aClass606_Sub1Array42.length)
	    return (aClass606_Sub1Array42
		    [(anInt48 += -1352314869) * -120407133 - 1]);
	return null;
    }
    
    public static void method544(String string, int i) {
	if (aClass23_49 == null)
	    aClass23_49 = new RSSocket();
	aClass23_49.aString223 = string;
	aClass23_49.anInt227 = 1619197921 * (1099 + i);
	aClass23_49.anInt222
	    = (Class11.method612(client.aClass665_11211,
				 Class668.aClass668_8584,
				 aClass23_49.anInt227 * -1664252895, (byte) 77)
	       * 1852523987);
	aClass23_49.anInt225
	    = Class488.method7999(client.aClass665_11211,
				  Class668.aClass668_8584,
				  -1664252895 * aClass23_49.anInt227,
				  353134756) * -102059163;
    }
    
    public static void method545() {
	if (-1664252895 * aClass23_43.anInt227 != -1)
	    Class312_Sub1_Sub1.method18102(-1664252895 * aClass23_43.anInt227,
					   aClass23_43.aString223,
					   aClass23_43.anInt222 * 606493275,
					   1001670253 * aClass23_43.anInt225,
					   (byte) 105);
    }
    
    public static boolean method546(int i, String string, int i_8_, int i_9_) {
	Class685.aClass23_8698 = new RSSocket();
	Class685.aClass23_8698.anInt227 = 1619197921 * i;
	Class685.aClass23_8698.aString223 = string;
	Class685.aClass23_8698.anInt222 = i_8_ * 1852523987;
	Class685.aClass23_8698.anInt225 = -102059163 * i_9_;
	return true;
    }
    
    public static void method547(boolean bool, byte[] is) {
	if (Class534_Sub8.aClass534_Sub40_10425 == null)
	    Class534_Sub8.aClass534_Sub40_10425 = new Class534_Sub40(20000);
	Class534_Sub8.aClass534_Sub40_10425.method16519(is, 0, is.length,
							-1781219940);
	if (bool) {
	    Class6.method566((Class534_Sub8.aClass534_Sub40_10425
			      .aByteArray10810),
			     (byte) 42);
	    aClass606_Sub1Array42
		= new Class606_Sub1[Class542.anInt7183 * 1699576543];
	    int i = 0;
	    for (int i_10_ = 206492647 * Class619.anInt8108;
		 i_10_ <= -1664594981 * Class619.anInt8109; i_10_++) {
		Class606_Sub1 class606_sub1
		    = Class521.method8688(i_10_, -1188771954);
		if (class606_sub1 != null)
		    aClass606_Sub1Array42[i++] = class606_sub1;
	    }
	    aBool45 = false;
	    aLong46 = Class250.method4604((byte) -24) * -7774518681047063557L;
	    Class534_Sub8.aClass534_Sub40_10425 = null;
	}
    }
    
    Class5() throws Throwable {
	throw new Error();
    }
    
    public static void method548(boolean bool, byte[] is) {
	if (Class534_Sub8.aClass534_Sub40_10425 == null)
	    Class534_Sub8.aClass534_Sub40_10425 = new Class534_Sub40(20000);
	Class534_Sub8.aClass534_Sub40_10425.method16519(is, 0, is.length,
							-448848550);
	if (bool) {
	    Class6.method566((Class534_Sub8.aClass534_Sub40_10425
			      .aByteArray10810),
			     (byte) 45);
	    aClass606_Sub1Array42
		= new Class606_Sub1[Class542.anInt7183 * 1699576543];
	    int i = 0;
	    for (int i_11_ = 206492647 * Class619.anInt8108;
		 i_11_ <= -1664594981 * Class619.anInt8109; i_11_++) {
		Class606_Sub1 class606_sub1
		    = Class521.method8688(i_11_, 278517602);
		if (class606_sub1 != null)
		    aClass606_Sub1Array42[i++] = class606_sub1;
	    }
	    aBool45 = false;
	    aLong46 = Class250.method4604((byte) -40) * -7774518681047063557L;
	    Class534_Sub8.aClass534_Sub40_10425 = null;
	}
    }
    
    public static void method549(boolean bool, byte[] is) {
	if (Class534_Sub8.aClass534_Sub40_10425 == null)
	    Class534_Sub8.aClass534_Sub40_10425 = new Class534_Sub40(20000);
	Class534_Sub8.aClass534_Sub40_10425.method16519(is, 0, is.length,
							-1039525856);
	if (bool) {
	    Class6.method566((Class534_Sub8.aClass534_Sub40_10425
			      .aByteArray10810),
			     (byte) 110);
	    aClass606_Sub1Array42
		= new Class606_Sub1[Class542.anInt7183 * 1699576543];
	    int i = 0;
	    for (int i_12_ = 206492647 * Class619.anInt8108;
		 i_12_ <= -1664594981 * Class619.anInt8109; i_12_++) {
		Class606_Sub1 class606_sub1
		    = Class521.method8688(i_12_, -805411692);
		if (class606_sub1 != null)
		    aClass606_Sub1Array42[i++] = class606_sub1;
	    }
	    aBool45 = false;
	    aLong46 = Class250.method4604((byte) -54) * -7774518681047063557L;
	    Class534_Sub8.aClass534_Sub40_10425 = null;
	}
    }
    
    public static Class606_Sub1 method550() {
	anInt48 = 0;
	return Class498.method8261(-740942725);
    }
    
    public static Class606_Sub1 method551() {
	anInt48 = 0;
	return Class498.method8261(-526246034);
    }
    
    static int method552(Class606_Sub1 class606_sub1,
			 Class606_Sub1 class606_sub1_13_, int i,
			 boolean bool) {
	if (i == 1) {
	    int i_14_ = class606_sub1.anInt7981 * 2098404975;
	    int i_15_ = 2098404975 * class606_sub1_13_.anInt7981;
	    if (!bool) {
		if (-1 == i_14_)
		    i_14_ = 2001;
		if (i_15_ == -1)
		    i_15_ = 2001;
	    }
	    return i_14_ - i_15_;
	}
	if (2 == i)
	    return Class310.method5664(class606_sub1.method16906(-235233219),
				       class606_sub1_13_
					   .method16906(128359891),
				       Class539.aClass672_7171, -509153604);
	if (3 == i) {
	    if (class606_sub1.aString10858.equals("-")) {
		if (class606_sub1_13_.aString10858.equals("-"))
		    return 0;
		return bool ? -1 : 1;
	    }
	    if (class606_sub1_13_.aString10858.equals("-"))
		return bool ? 1 : -1;
	    return Class310.method5664(class606_sub1.aString10858,
				       class606_sub1_13_.aString10858,
				       Class539.aClass672_7171, 2052488589);
	}
	if (4 == i)
	    return (class606_sub1.method10039((byte) 0)
		    ? class606_sub1_13_.method10039((byte) 0) ? 0 : 1
		    : class606_sub1_13_.method10039((byte) 0) ? -1 : 0);
	if (5 == i)
	    return (class606_sub1.method10043(1056553202)
		    ? class606_sub1_13_.method10043(246753581) ? 0 : 1
		    : class606_sub1_13_.method10043(-832507662) ? -1 : 0);
	if (6 == i)
	    return (class606_sub1.method10040(-2145236628)
		    ? class606_sub1_13_.method10040(-1131336099) ? 0 : 1
		    : class606_sub1_13_.method10040(-182629812) ? -1 : 0);
	if (i == 7)
	    return (class606_sub1.method10042(1129917750)
		    ? class606_sub1_13_.method10042(2071711001) ? 0 : 1
		    : class606_sub1_13_.method10042(999580473) ? -1 : 0);
	if (8 == i) {
	    int i_16_ = -663639827 * class606_sub1.anInt10856;
	    int i_17_ = -663639827 * class606_sub1_13_.anInt10856;
	    if (bool) {
		if (1000 == i_16_)
		    i_16_ = -1;
		if (1000 == i_17_)
		    i_17_ = -1;
	    } else {
		if (i_16_ == -1)
		    i_16_ = 1000;
		if (-1 == i_17_)
		    i_17_ = 1000;
	    }
	    return i_16_ - i_17_;
	}
	return (class606_sub1.anInt10861 * 539448607
		- 539448607 * class606_sub1_13_.anInt10861);
    }
    
    public static boolean method553(int i, String string, int i_18_,
				    int i_19_) {
	Class685.aClass23_8698 = new RSSocket();
	Class685.aClass23_8698.anInt227 = 1619197921 * i;
	Class685.aClass23_8698.aString223 = string;
	Class685.aClass23_8698.anInt222 = i_18_ * 1852523987;
	Class685.aClass23_8698.anInt225 = -102059163 * i_19_;
	return true;
    }
    
    public static void method554(boolean bool, byte[] is) {
	if (Class534_Sub8.aClass534_Sub40_10425 == null)
	    Class534_Sub8.aClass534_Sub40_10425 = new Class534_Sub40(20000);
	Class534_Sub8.aClass534_Sub40_10425.method16519(is, 0, is.length,
							-1172941602);
	if (bool) {
	    Class6.method566((Class534_Sub8.aClass534_Sub40_10425
			      .aByteArray10810),
			     (byte) 69);
	    aClass606_Sub1Array42
		= new Class606_Sub1[Class542.anInt7183 * 1699576543];
	    int i = 0;
	    for (int i_20_ = 206492647 * Class619.anInt8108;
		 i_20_ <= -1664594981 * Class619.anInt8109; i_20_++) {
		Class606_Sub1 class606_sub1
		    = Class521.method8688(i_20_, -284725592);
		if (class606_sub1 != null)
		    aClass606_Sub1Array42[i++] = class606_sub1;
	    }
	    aBool45 = false;
	    aLong46 = Class250.method4604((byte) -79) * -7774518681047063557L;
	    Class534_Sub8.aClass534_Sub40_10425 = null;
	}
    }
    
    public static Class606_Sub1 method555() {
	if (anInt48 * -120407133 < aClass606_Sub1Array42.length)
	    return (aClass606_Sub1Array42
		    [(anInt48 += -1352314869) * -120407133 - 1]);
	return null;
    }
    
    public static Class606_Sub1 method556() {
	return Class521.method8688((-1664252895
				    * Class685.aClass23_8698.anInt227),
				   -1771822848);
    }
    
    public static void method557() {
	if (-1664252895 * aClass23_43.anInt227 != -1)
	    Class312_Sub1_Sub1.method18102(-1664252895 * aClass23_43.anInt227,
					   aClass23_43.aString223,
					   aClass23_43.anInt222 * 606493275,
					   1001670253 * aClass23_43.anInt225,
					   (byte) 58);
    }
    
    static void method558(int i, int i_21_, int i_22_, boolean bool, int i_23_,
			  boolean bool_24_) {
	if (i < i_21_) {
	    int i_25_ = (i_21_ + i) / 2;
	    int i_26_ = i;
	    Class606_Sub1 class606_sub1 = aClass606_Sub1Array42[i_25_];
	    aClass606_Sub1Array42[i_25_] = aClass606_Sub1Array42[i_21_];
	    aClass606_Sub1Array42[i_21_] = class606_sub1;
	    for (int i_27_ = i; i_27_ < i_21_; i_27_++) {
		if (Class12.method637(aClass606_Sub1Array42[i_27_],
				      class606_sub1, i_22_, bool, i_23_,
				      bool_24_, (byte) 119)
		    <= 0) {
		    Class606_Sub1 class606_sub1_28_
			= aClass606_Sub1Array42[i_27_];
		    aClass606_Sub1Array42[i_27_]
			= aClass606_Sub1Array42[i_26_];
		    aClass606_Sub1Array42[i_26_++] = class606_sub1_28_;
		}
	    }
	    aClass606_Sub1Array42[i_21_] = aClass606_Sub1Array42[i_26_];
	    aClass606_Sub1Array42[i_26_] = class606_sub1;
	    Class9.method602(i, i_26_ - 1, i_22_, bool, i_23_, bool_24_,
			     (byte) 73);
	    Class9.method602(i_26_ + 1, i_21_, i_22_, bool, i_23_, bool_24_,
			     (byte) 74);
	}
    }
    
    public static void method559(int i, boolean bool, int i_29_,
				 boolean bool_30_) {
	Class9.method602(0, aClass606_Sub1Array42.length - 1, i, bool, i_29_,
			 bool_30_, (byte) 61);
	anInt40 = 0;
	aClass641_44 = null;
    }
    
    public static Class606_Sub1 method560() {
	if (anInt48 * -120407133 < aClass606_Sub1Array42.length)
	    return (aClass606_Sub1Array42
		    [(anInt48 += -1352314869) * -120407133 - 1]);
	return null;
    }
    
    static int method561(Class606_Sub1 class606_sub1,
			 Class606_Sub1 class606_sub1_31_, int i,
			 boolean bool) {
	if (i == 1) {
	    int i_32_ = class606_sub1.anInt7981 * 2098404975;
	    int i_33_ = 2098404975 * class606_sub1_31_.anInt7981;
	    if (!bool) {
		if (-1 == i_32_)
		    i_32_ = 2001;
		if (i_33_ == -1)
		    i_33_ = 2001;
	    }
	    return i_32_ - i_33_;
	}
	if (2 == i)
	    return Class310.method5664(class606_sub1.method16906(780148030),
				       class606_sub1_31_
					   .method16906(1443849927),
				       Class539.aClass672_7171, 1242401833);
	if (3 == i) {
	    if (class606_sub1.aString10858.equals("-")) {
		if (class606_sub1_31_.aString10858.equals("-"))
		    return 0;
		return bool ? -1 : 1;
	    }
	    if (class606_sub1_31_.aString10858.equals("-"))
		return bool ? 1 : -1;
	    return Class310.method5664(class606_sub1.aString10858,
				       class606_sub1_31_.aString10858,
				       Class539.aClass672_7171, -1846480115);
	}
	if (4 == i)
	    return (class606_sub1.method10039((byte) 0)
		    ? class606_sub1_31_.method10039((byte) 0) ? 0 : 1
		    : class606_sub1_31_.method10039((byte) 0) ? -1 : 0);
	if (5 == i)
	    return (class606_sub1.method10043(610364283)
		    ? class606_sub1_31_.method10043(-1397689939) ? 0 : 1
		    : class606_sub1_31_.method10043(-1241883538) ? -1 : 0);
	if (6 == i)
	    return (class606_sub1.method10040(705801334)
		    ? class606_sub1_31_.method10040(-905458327) ? 0 : 1
		    : class606_sub1_31_.method10040(1040537835) ? -1 : 0);
	if (i == 7)
	    return (class606_sub1.method10042(27349148)
		    ? class606_sub1_31_.method10042(444384267) ? 0 : 1
		    : class606_sub1_31_.method10042(103226112) ? -1 : 0);
	if (8 == i) {
	    int i_34_ = -663639827 * class606_sub1.anInt10856;
	    int i_35_ = -663639827 * class606_sub1_31_.anInt10856;
	    if (bool) {
		if (1000 == i_34_)
		    i_34_ = -1;
		if (1000 == i_35_)
		    i_35_ = -1;
	    } else {
		if (i_34_ == -1)
		    i_34_ = 1000;
		if (-1 == i_35_)
		    i_35_ = 1000;
	    }
	    return i_34_ - i_35_;
	}
	return (class606_sub1.anInt10861 * 539448607
		- 539448607 * class606_sub1_31_.anInt10861);
    }
    
    static void method562(byte i) {
	Class62.aClass534_Sub18_Sub7_650
	    = new Class534_Sub18_Sub7((Class58.aClass58_554.method1245
				       (Class539.aClass672_7171, (byte) -41)),
				      "", 846725895 * client.anInt11215, 1006,
				      -1, 0L, 0, 0, true, false, 0L, true);
    }
    
    static final void method563(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
}
