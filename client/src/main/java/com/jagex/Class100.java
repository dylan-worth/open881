/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Class100
{
    Class534_Sub40_Sub1 aClass534_Sub40_Sub1_1179;
    Class700 aClass700_1180 = new Class700();
    public int anInt1181 = 0;
    Class534_Sub40 aClass534_Sub40_1182 = new Class534_Sub40(1700);
    public IsaacCipher aClass13_1183;
    Class546 aClass546_1184;
    int anInt1185;
    Class409 aClass409_1186;
    public int anInt1187;
    boolean aBool1188;
    int anInt1189;
    IsaacCipher aClass13_1190;
    int anInt1191;
    int anInt1192;
    int anInt1193;
    Class54 aClass54_1194;
    Class409 aClass409_1195;
    Class409 aClass409_1196;
    int anInt1197;
    public boolean aBool1198;
    Class409 aClass409_1199;
    
    void method1860() {
	if (0 == client.anInt11101 % 50) {
	    anInt1193 = -543443321 * anInt1191;
	    anInt1191 = 0;
	    anInt1185 = -960782787 * anInt1192;
	    anInt1192 = 0;
	}
    }
    
    public final void method1861(Class534_Sub19 class534_sub19) {
	aClass700_1180.method14131(class534_sub19, (short) 789);
	class534_sub19.anInt10511
	    = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
	       * -1802238991);
	class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811 = 0;
	anInt1181 += class534_sub19.anInt10511 * 1748003629;
    }
    
    public Class546 method1862() {
	return aClass546_1184;
    }
    
    public final void method1863(Class534_Sub19 class534_sub19, byte i) {
	aClass700_1180.method14131(class534_sub19, (short) 789);
	class534_sub19.anInt10511
	    = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
	       * -1802238991);
	class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811 = 0;
	anInt1181 += class534_sub19.anInt10511 * 1748003629;
    }
    
    void method1864(int i) {
	if (0 == client.anInt11101 % 50) {
	    anInt1193 = -543443321 * anInt1191;
	    anInt1191 = 0;
	    anInt1185 = -960782787 * anInt1192;
	    anInt1192 = 0;
	}
    }
    
    public Class546 method1865() {
	return aClass546_1184;
    }
    
    void method1866(byte i) {
	if (aClass546_1184 != null) {
	    aClass546_1184.method8975(808221786);
	    aClass546_1184 = null;
	}
	aClass54_1194.method1195(null, (byte) -44);
    }
    
    public Class546 method1867(int i) {
	return aClass546_1184;
    }
    
    public final void method1868(int i) throws IOException {
	if (null != aClass546_1184 && anInt1181 * 1030372175 > 0) {
	    aClass534_Sub40_1182.anInt10811 = 0;
	    for (;;) {
		Class534_Sub19 class534_sub19
		    = (Class534_Sub19) aClass700_1180.method14135((byte) -1);
		if (null == class534_sub19
		    || (class534_sub19.anInt10511 * 1766224355
			> (aClass534_Sub40_1182.aByteArray10810.length
			   - aClass534_Sub40_1182.anInt10811 * 31645619)))
		    break;
		aClass534_Sub40_1182.method16519
		    (class534_sub19.aClass534_Sub40_Sub1_10513.aByteArray10810,
		     0, 1766224355 * class534_sub19.anInt10511, 727004539);
		anInt1181 -= class534_sub19.anInt10511 * 1748003629;
		class534_sub19.method8892((byte) 1);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16538((byte) 85);
		class534_sub19.method16184(1065169562);
	    }
	    aClass546_1184.method8971(aClass534_Sub40_1182.aByteArray10810, 0,
				      (aClass534_Sub40_1182.anInt10811
				       * 31645619),
				      1552062594);
	    anInt1191 += aClass534_Sub40_1182.anInt10811 * -1007092627;
	    anInt1187 = 0;
	}
    }
    
    public final void method1869() throws IOException {
	if (null != aClass546_1184 && anInt1181 * 1030372175 > 0) {
	    aClass534_Sub40_1182.anInt10811 = 0;
	    for (;;) {
		Class534_Sub19 class534_sub19
		    = (Class534_Sub19) aClass700_1180.method14135((byte) -1);
		if (null == class534_sub19
		    || (class534_sub19.anInt10511 * 1766224355
			> (aClass534_Sub40_1182.aByteArray10810.length
			   - aClass534_Sub40_1182.anInt10811 * 31645619)))
		    break;
		aClass534_Sub40_1182.method16519
		    (class534_sub19.aClass534_Sub40_Sub1_10513.aByteArray10810,
		     0, 1766224355 * class534_sub19.anInt10511, 315497064);
		anInt1181 -= class534_sub19.anInt10511 * 1748003629;
		class534_sub19.method8892((byte) 1);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16538((byte) 85);
		class534_sub19.method16184(-981626);
	    }
	    aClass546_1184.method8971(aClass534_Sub40_1182.aByteArray10810, 0,
				      (aClass534_Sub40_1182.anInt10811
				       * 31645619),
				      1552062594);
	    anInt1191 += aClass534_Sub40_1182.anInt10811 * -1007092627;
	    anInt1187 = 0;
	}
    }
    
    void method1870(int i) {
	aClass546_1184 = null;
	aClass54_1194.method1195(null, (byte) -102);
    }
    
    public final void method1871(Class534_Sub19 class534_sub19) {
	aClass700_1180.method14131(class534_sub19, (short) 789);
	class534_sub19.anInt10511
	    = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
	       * -1802238991);
	class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811 = 0;
	anInt1181 += class534_sub19.anInt10511 * 1748003629;
    }
    
    public final void method1872() throws IOException {
	if (null != aClass546_1184 && anInt1181 * 1030372175 > 0) {
	    aClass534_Sub40_1182.anInt10811 = 0;
	    for (;;) {
		Class534_Sub19 class534_sub19
		    = (Class534_Sub19) aClass700_1180.method14135((byte) -1);
		if (null == class534_sub19
		    || (class534_sub19.anInt10511 * 1766224355
			> (aClass534_Sub40_1182.aByteArray10810.length
			   - aClass534_Sub40_1182.anInt10811 * 31645619)))
		    break;
		aClass534_Sub40_1182.method16519
		    (class534_sub19.aClass534_Sub40_Sub1_10513.aByteArray10810,
		     0, 1766224355 * class534_sub19.anInt10511, 1481139485);
		anInt1181 -= class534_sub19.anInt10511 * 1748003629;
		class534_sub19.method8892((byte) 1);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16538((byte) 39);
		class534_sub19.method16184(95944922);
	    }
	    aClass546_1184.method8971(aClass534_Sub40_1182.aByteArray10810, 0,
				      (aClass534_Sub40_1182.anInt10811
				       * 31645619),
				      1552062594);
	    anInt1191 += aClass534_Sub40_1182.anInt10811 * -1007092627;
	    anInt1187 = 0;
	}
    }
    
    public final void method1873(Class534_Sub19 class534_sub19) {
	aClass700_1180.method14131(class534_sub19, (short) 789);
	class534_sub19.anInt10511
	    = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
	       * -1802238991);
	class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811 = 0;
	anInt1181 += class534_sub19.anInt10511 * 1748003629;
    }
    
    final void method1874(int i) {
	aClass700_1180.method14152(-888250324);
	anInt1181 = 0;
    }
    
    Class100() {
	aClass534_Sub40_Sub1_1179 = new Class534_Sub40_Sub1(40000);
	aClass409_1186 = null;
	anInt1197 = 0;
	aBool1188 = true;
	anInt1189 = 0;
	anInt1187 = 0;
	aBool1198 = false;
	aClass54_1194 = new Class54();
	Thread thread = new Thread(aClass54_1194);
	thread.setDaemon(true);
	thread.setPriority(1);
	thread.start();
    }
    
    void method1875(Class546 class546, String string) {
	aClass546_1184 = class546;
	aClass54_1194.method1195(string, (byte) -49);
    }
    
    void method1876(Class546 class546, String string) {
	aClass546_1184 = class546;
	aClass54_1194.method1195(string, (byte) -82);
    }
    
    void method1877() {
	if (aClass546_1184 != null) {
	    aClass546_1184.method8975(952500325);
	    aClass546_1184 = null;
	}
	aClass54_1194.method1195(null, (byte) -4);
    }
    
    void method1878() {
	aClass546_1184 = null;
	aClass54_1194.method1195(null, (byte) -73);
    }
    
    void method1879() {
	aClass546_1184 = null;
	aClass54_1194.method1195(null, (byte) -104);
    }
    
    void method1880(Class546 class546, String string, int i) {
	aClass546_1184 = class546;
	aClass54_1194.method1195(string, (byte) -67);
    }
    
    void method1881() {
	aClass546_1184 = null;
	aClass54_1194.method1195(null, (byte) -62);
    }
    
    void method1882(Class546 class546, String string) {
	aClass546_1184 = class546;
	aClass54_1194.method1195(string, (byte) -85);
    }
    
    static boolean method1883(int i, int i_0_) {
	return (i == 44 || 45 == i || i == 46 || i == 47 || i == 48 || i == 49
		|| i == 50 || i == 51 || i == 52 || i == 53 || i == 15);
    }
    
    static byte[] method1884(InputStream inputstream, int i, byte i_1_)
	throws IOException {
	byte[] is = new byte[5];
	if (inputstream.read(is, 0, 5) != 5)
	    throw new IOException("2");
	ByteArrayOutputStream bytearrayoutputstream
	    = new ByteArrayOutputStream(i);
	synchronized (Class540.aClass522_7173) {
	    if (!Class540.aClass522_7173.method8698(is, (byte) -11))
		throw new IOException("3");
	    Class540.aClass522_7173
		.method8704(inputstream, bytearrayoutputstream, (long) i);
	}
	bytearrayoutputstream.flush();
	return bytearrayoutputstream.toByteArray();
    }
    
    public static Class640 method1885(int i, int i_2_) {
	Class640[] class640s = Class284.method5255((byte) 1);
	for (int i_3_ = 0; i_3_ < class640s.length; i_3_++) {
	    if (class640s[i_3_].anInt8333 * 41641943 == i)
		return class640s[i_3_];
	}
	return null;
    }
    
    static final void method1886(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	class247.anInt2478
	    = (class669.anIntArray8595[2088438307 * class669.anInt8600]
	       * 1647781287);
	if (class247.anInt2478 * -488164841
	    > (1500908359 * class247.anInt2480
	       - class247.anInt2468 * -881188269))
	    class247.anInt2478 = (98803281 * class247.anInt2480
				  - class247.anInt2468 * -1988664539);
	if (class247.anInt2478 * -488164841 < 0)
	    class247.anInt2478 = 0;
	class247.anInt2479
	    = (170726965
	       * class669.anIntArray8595[2088438307 * class669.anInt8600 + 1]);
	if (class247.anInt2479 * 2142374941
	    > (class247.anInt2481 * -166726847
	       - -1279656873 * class247.anInt2469))
	    class247.anInt2479 = (-1667108235 * class247.anInt2481
				  - class247.anInt2469 * -226772989);
	if (2142374941 * class247.anInt2479 < 0)
	    class247.anInt2479 = 0;
	Class454.method7416(class247, -1079555080);
	if (-1 == class247.anInt2580 * 1365669833 && !class243.aBool2413)
	    Class638.method10569(-1278450723 * class247.anInt2454, (byte) 52);
    }
    
    static final void method1887(Class669 class669, int i) {
	int i_4_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_4_, 1614985906);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_4_ >> 16];
	Class253.method4632(class247, class243, class669, -593192058);
    }
    
    static final void method1888(Class669 class669, int i) {
	int i_5_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class78.aClass103_825.method1907(i_5_, 769896672);
    }
    
    static final void method1889(Class669 class669, int i) {
	if (Class599.aClass298_Sub1_7871.method5388((byte) -7)
	    != Class305.aClass305_3266)
	    throw new RuntimeException();
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = Class599.aClass298_Sub1_7871.method5387((byte) 23);
    }
    
    static void method1890(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class478.method7799((byte) -39);
    }
}
