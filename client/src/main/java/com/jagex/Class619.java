/* Class619 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class619
{
    static final int anInt8103 = 2;
    static final int anInt8104 = 1;
    static final int anInt8105 = -1;
    static boolean aBool8106 = false;
    static Class606_Sub1[] aClass606_Sub1Array8107;
    public static int anInt8108;
    public static int anInt8109;
    public static int anInt8110;
    
    public static boolean method10249(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i = class534_sub40.method16527(-744166477);
	if (2 != i)
	    return false;
	boolean bool = class534_sub40.method16527(844524246) == 1;
	if (bool)
	    Class72.method1562(class534_sub40, 972926763);
	Class685.method13961(class534_sub40, (byte) 8);
	return true;
    }
    
    public static Class606_Sub1 method10250(int i) {
	if (!aBool8106 || i < 206492647 * anInt8108
	    || i > anInt8109 * -1664594981)
	    return null;
	return aClass606_Sub1Array8107[i - anInt8108 * 206492647];
    }
    
    public static Class606_Sub1 method10251(int i) {
	if (!aBool8106 || i < 206492647 * anInt8108
	    || i > anInt8109 * -1664594981)
	    return null;
	return aClass606_Sub1Array8107[i - anInt8108 * 206492647];
    }
    
    Class619() throws Throwable {
	throw new Error();
    }
    
    public static boolean method10252(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i = class534_sub40.method16527(771672070);
	if (2 != i)
	    return false;
	boolean bool = class534_sub40.method16527(447984654) == 1;
	if (bool)
	    Class72.method1562(class534_sub40, 821492210);
	Class685.method13961(class534_sub40, (byte) 8);
	return true;
    }
    
    public static boolean method10253(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i = class534_sub40.method16527(143091402);
	if (2 != i)
	    return false;
	boolean bool = class534_sub40.method16527(1523844826) == 1;
	if (bool)
	    Class72.method1562(class534_sub40, -710531480);
	Class685.method13961(class534_sub40, (byte) 8);
	return true;
    }
    
    static void method10254(Class534_Sub40 class534_sub40) {
	int i = class534_sub40.method16546(-1706829710);
	Class311.aClass610Array3363 = new Class610[i];
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    Class311.aClass610Array3363[i_0_] = new Class610();
	    Class311.aClass610Array3363[i_0_].anInt8008
		= class534_sub40.method16546(-1706829710) * -1175230789;
	    Class311.aClass610Array3363[i_0_].aString8009
		= class534_sub40.method16523(-1314499843);
	}
	anInt8108 = class534_sub40.method16546(-1706829710) * 90345431;
	anInt8109 = class534_sub40.method16546(-1706829710) * 952023123;
	Class542.anInt7183
	    = class534_sub40.method16546(-1706829710) * -377175777;
	aClass606_Sub1Array8107
	    = new Class606_Sub1[1 + (-1664594981 * anInt8109
				     - anInt8108 * 206492647)];
	for (int i_1_ = 0; i_1_ < Class542.anInt7183 * 1699576543; i_1_++) {
	    int i_2_ = class534_sub40.method16546(-1706829710);
	    Class606_Sub1 class606_sub1
		= aClass606_Sub1Array8107[i_2_] = new Class606_Sub1();
	    class606_sub1.anInt7986
		= class534_sub40.method16527(954635008) * -1901546263;
	    class606_sub1.anInt7985
		= class534_sub40.method16533(-258848859) * -410670017;
	    class606_sub1.anInt10859
		= class534_sub40.method16546(-1706829710) * 75958393;
	    if (231268809 * class606_sub1.anInt10859 != 0)
		class606_sub1.aString10860
		    = class534_sub40.method16523(-1799862275);
	    class606_sub1.anInt10861
		= -446830881 * (i_2_ + 206492647 * anInt8108);
	    class606_sub1.aString10858
		= class534_sub40.method16523(-2047857451);
	    class606_sub1.aString10857
		= class534_sub40.method16523(-1912793842);
	}
	anInt8110 = class534_sub40.method16533(-258848859) * 482540011;
	aBool8106 = true;
    }
    
    static void method10255(Class534_Sub40 class534_sub40) {
	for (int i = 0; i < Class542.anInt7183 * 1699576543; i++) {
	    int i_3_ = class534_sub40.method16546(-1706829710);
	    int i_4_ = class534_sub40.method16529((byte) 1);
	    if (i_4_ == 65535)
		i_4_ = -1;
	    if (aClass606_Sub1Array8107[i_3_] != null)
		aClass606_Sub1Array8107[i_3_].anInt7981 = 734920847 * i_4_;
	}
    }
    
    static final void method10256(Class247 class247, Class243 class243,
				  Class669 class669, int i) {
	int i_5_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class90 class90 = (Class90) Class534_Sub11_Sub13
					.aClass44_Sub22_11730
					.method91(i_5_, -2038102164);
	if (!class90.aString889.equals(string))
	    class247.method4579(i_5_, string, (byte) 84);
	else
	    class247.method4549(i_5_, 1917159450);
    }
    
    static final void method10257(Class669 class669, short i) {
	int i_6_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (i_6_ > 255 || i_6_ < 0)
	    i_6_ = 0;
	if (i_6_ != Class44_Sub6.aClass534_Sub35_10989
			.aClass690_Sub43_10780.method17236(1459879885)) {
	    Class44_Sub6.aClass534_Sub35_10989.method16438
		(Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub43_10780,
		 i_6_, 1159131249);
	    Class672.method11096((byte) 1);
	    client.aBool11048 = false;
	}
    }
    
    public static int method10258(byte i) {
	Class52_Sub1 class52_sub1 = Class609.method10070(-1213435377);
	Class545.method8964(class52_sub1, -1566726514);
	return class52_sub1.method1182((short) 14825);
    }
    
    static void method10259(byte i) {
	if (Class574.aClass163_7706 == null
	    || (Class574.aClass163_7706.method2647()
		!= Class574.aTwitchWebcamFrameData7700.width)
	    || (Class574.aClass163_7706.method2649()
		!= Class574.aTwitchWebcamFrameData7700.height))
	    Class574.aClass163_7706
		= (Class254.aClass185_2683.method3316
		   (Class574.aTwitchWebcamFrameData7700.buffer, 0,
		    Class574.aTwitchWebcamFrameData7700.width,
		    Class574.aTwitchWebcamFrameData7700.width,
		    Class574.aTwitchWebcamFrameData7700.height, false));
	else
	    Class574.aClass163_7706.method2652
		(0, 0, Class574.aTwitchWebcamFrameData7700.width,
		 Class574.aTwitchWebcamFrameData7700.height,
		 Class574.aTwitchWebcamFrameData7700.buffer, 0,
		 Class574.aTwitchWebcamFrameData7700.width);
    }
    
    static final void method10260(Class669 class669, int i) {
	int i_7_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4213,
				  client.aClass100_11264.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16507(i_7_,
							      1825080980);
	client.aClass100_11264.method1863(class534_sub19, (byte) 86);
    }
    
    static final void method10261(Class669 class669, byte i) {
	class669.anInt8600 -= 308999563;
	int i_8_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class90.method1725(i_8_, -1650763909);
    }
}
