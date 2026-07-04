/* Class691 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.Map;

public class Class691
{
    static byte[][] aByteArrayArray8754;
    static int anInt8755;
    static int anInt8756;
    static byte[][] aByteArrayArray8757;
    static byte[][] aByteArrayArray8758;
    static int anInt8759 = 0;
    
    public static synchronized void method14033(byte[] is, short i) {
	if (100 == is.length && anInt8759 * -1336434345 < 1000)
	    aByteArrayArray8757[(anInt8759 += -1556686233) * -1336434345 - 1]
		= is;
	else if (5000 == is.length && -1246390875 * anInt8755 < 250)
	    aByteArrayArray8754[(anInt8755 += -1609086419) * -1246390875 - 1]
		= is;
	else if (is.length == 30000 && anInt8756 * 2083096697 < 50)
	    aByteArrayArray8758[(anInt8756 += -325164599) * 2083096697 - 1]
		= is;
	else if (Class452.aByteArrayArrayArray4944 != null) {
	    for (int i_0_ = 0; i_0_ < Class331.anIntArray3497.length; i_0_++) {
		if (Class331.anIntArray3497[i_0_] == is.length
		    && (Class174.anIntArray1838[i_0_]
			< Class452.aByteArrayArrayArray4944[i_0_].length)) {
		    Class452.aByteArrayArrayArray4944[i_0_]
			[Class174.anIntArray1838[i_0_]++]
			= is;
		    break;
		}
	    }
	}
    }
    
    public static synchronized byte[] method14034(int i, boolean bool,
						  int i_1_) {
	if ((i == 100 || i < 100 && bool) && anInt8759 * -1336434345 > 0) {
	    byte[] is = (aByteArrayArray8757
			 [(anInt8759 -= -1556686233) * -1336434345]);
	    aByteArrayArray8757[-1336434345 * anInt8759] = null;
	    return is;
	}
	if ((i == 5000 || i < 5000 && bool) && anInt8755 * -1246390875 > 0) {
	    byte[] is = (aByteArrayArray8754
			 [(anInt8755 -= -1609086419) * -1246390875]);
	    aByteArrayArray8754[-1246390875 * anInt8755] = null;
	    return is;
	}
	if ((i == 30000 || i < 30000 && bool) && 2083096697 * anInt8756 > 0) {
	    byte[] is
		= aByteArrayArray8758[(anInt8756 -= -325164599) * 2083096697];
	    aByteArrayArray8758[2083096697 * anInt8756] = null;
	    return is;
	}
	if (Class452.aByteArrayArrayArray4944 != null) {
	    for (int i_2_ = 0; i_2_ < Class331.anIntArray3497.length; i_2_++) {
		if ((i == Class331.anIntArray3497[i_2_]
		     || i < Class331.anIntArray3497[i_2_] && bool)
		    && Class174.anIntArray1838[i_2_] > 0) {
		    byte[] is = (Class452.aByteArrayArrayArray4944[i_2_]
				 [--Class174.anIntArray1838[i_2_]]);
		    Class452.aByteArrayArrayArray4944[i_2_]
			[Class174.anIntArray1838[i_2_]]
			= null;
		    return is;
		}
	    }
	}
	if (bool && null != Class331.anIntArray3497) {
	    for (int i_3_ = 0; i_3_ < Class331.anIntArray3497.length; i_3_++) {
		if (i <= Class331.anIntArray3497[i_3_]
		    && (Class174.anIntArray1838[i_3_]
			< Class452.aByteArrayArrayArray4944[i_3_].length))
		    return new byte[Class331.anIntArray3497[i_3_]];
	    }
	}
	return new byte[i];
    }
    
    public static synchronized void method14035(byte[] is) {
	if (100 == is.length && anInt8759 * -1336434345 < 1000)
	    aByteArrayArray8757[(anInt8759 += -1556686233) * -1336434345 - 1]
		= is;
	else if (5000 == is.length && -1246390875 * anInt8755 < 250)
	    aByteArrayArray8754[(anInt8755 += -1609086419) * -1246390875 - 1]
		= is;
	else if (is.length == 30000 && anInt8756 * 2083096697 < 50)
	    aByteArrayArray8758[(anInt8756 += -325164599) * 2083096697 - 1]
		= is;
	else if (Class452.aByteArrayArrayArray4944 != null) {
	    for (int i = 0; i < Class331.anIntArray3497.length; i++) {
		if (Class331.anIntArray3497[i] == is.length
		    && (Class174.anIntArray1838[i]
			< Class452.aByteArrayArrayArray4944[i].length)) {
		    Class452.aByteArrayArrayArray4944[i]
			[Class174.anIntArray1838[i]++]
			= is;
		    break;
		}
	    }
	}
    }
    
    public static synchronized byte[] method14036(int i, int i_4_) {
	return method14034(i, false, 2143562967);
    }
    
    static {
	anInt8755 = 0;
	anInt8756 = 0;
	aByteArrayArray8757 = new byte[1000][];
	aByteArrayArray8754 = new byte[250][];
	aByteArrayArray8758 = new byte[50][];
    }
    
    public static void method14037(int[] is, int[] is_5_) {
	if (null == is || is_5_ == null) {
	    Class331.anIntArray3497 = null;
	    Class174.anIntArray1838 = null;
	    Class452.aByteArrayArrayArray4944 = null;
	} else {
	    Class331.anIntArray3497 = is;
	    Class174.anIntArray1838 = new int[is.length];
	    Class452.aByteArrayArrayArray4944 = new byte[is.length][][];
	    for (int i = 0; i < Class331.anIntArray3497.length; i++)
		Class452.aByteArrayArrayArray4944[i] = new byte[is_5_[i]][];
	}
    }
    
    Class691() throws Throwable {
	throw new Error();
    }
    
    public static synchronized byte[] method14038(int i, boolean bool) {
	if ((i == 100 || i < 100 && bool) && anInt8759 * -1336434345 > 0) {
	    byte[] is = (aByteArrayArray8757
			 [(anInt8759 -= -1556686233) * -1336434345]);
	    aByteArrayArray8757[-1336434345 * anInt8759] = null;
	    return is;
	}
	if ((i == 5000 || i < 5000 && bool) && anInt8755 * -1246390875 > 0) {
	    byte[] is = (aByteArrayArray8754
			 [(anInt8755 -= -1609086419) * -1246390875]);
	    aByteArrayArray8754[-1246390875 * anInt8755] = null;
	    return is;
	}
	if ((i == 30000 || i < 30000 && bool) && 2083096697 * anInt8756 > 0) {
	    byte[] is
		= aByteArrayArray8758[(anInt8756 -= -325164599) * 2083096697];
	    aByteArrayArray8758[2083096697 * anInt8756] = null;
	    return is;
	}
	if (Class452.aByteArrayArrayArray4944 != null) {
	    for (int i_6_ = 0; i_6_ < Class331.anIntArray3497.length; i_6_++) {
		if ((i == Class331.anIntArray3497[i_6_]
		     || i < Class331.anIntArray3497[i_6_] && bool)
		    && Class174.anIntArray1838[i_6_] > 0) {
		    byte[] is = (Class452.aByteArrayArrayArray4944[i_6_]
				 [--Class174.anIntArray1838[i_6_]]);
		    Class452.aByteArrayArrayArray4944[i_6_]
			[Class174.anIntArray1838[i_6_]]
			= null;
		    return is;
		}
	    }
	}
	if (bool && null != Class331.anIntArray3497) {
	    for (int i_7_ = 0; i_7_ < Class331.anIntArray3497.length; i_7_++) {
		if (i <= Class331.anIntArray3497[i_7_]
		    && (Class174.anIntArray1838[i_7_]
			< Class452.aByteArrayArrayArray4944[i_7_].length))
		    return new byte[Class331.anIntArray3497[i_7_]];
	    }
	}
	return new byte[i];
    }
    
    public static synchronized byte[] method14039(int i, boolean bool) {
	if ((i == 100 || i < 100 && bool) && anInt8759 * -1336434345 > 0) {
	    byte[] is = (aByteArrayArray8757
			 [(anInt8759 -= -1556686233) * -1336434345]);
	    aByteArrayArray8757[-1336434345 * anInt8759] = null;
	    return is;
	}
	if ((i == 5000 || i < 5000 && bool) && anInt8755 * -1246390875 > 0) {
	    byte[] is = (aByteArrayArray8754
			 [(anInt8755 -= -1609086419) * -1246390875]);
	    aByteArrayArray8754[-1246390875 * anInt8755] = null;
	    return is;
	}
	if ((i == 30000 || i < 30000 && bool) && 2083096697 * anInt8756 > 0) {
	    byte[] is
		= aByteArrayArray8758[(anInt8756 -= -325164599) * 2083096697];
	    aByteArrayArray8758[2083096697 * anInt8756] = null;
	    return is;
	}
	if (Class452.aByteArrayArrayArray4944 != null) {
	    for (int i_8_ = 0; i_8_ < Class331.anIntArray3497.length; i_8_++) {
		if ((i == Class331.anIntArray3497[i_8_]
		     || i < Class331.anIntArray3497[i_8_] && bool)
		    && Class174.anIntArray1838[i_8_] > 0) {
		    byte[] is = (Class452.aByteArrayArrayArray4944[i_8_]
				 [--Class174.anIntArray1838[i_8_]]);
		    Class452.aByteArrayArrayArray4944[i_8_]
			[Class174.anIntArray1838[i_8_]]
			= null;
		    return is;
		}
	    }
	}
	if (bool && null != Class331.anIntArray3497) {
	    for (int i_9_ = 0; i_9_ < Class331.anIntArray3497.length; i_9_++) {
		if (i <= Class331.anIntArray3497[i_9_]
		    && (Class174.anIntArray1838[i_9_]
			< Class452.aByteArrayArrayArray4944[i_9_].length))
		    return new byte[Class331.anIntArray3497[i_9_]];
	    }
	}
	return new byte[i];
    }
    
    public static boolean method14040(char c, int i) {
	if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if ('\0' != c) {
	    char[] cs = Class685.aCharArray8697;
	    for (int i_10_ = 0; i_10_ < cs.length; i_10_++) {
		char c_11_ = cs[i_10_];
		if (c == c_11_)
		    return true;
	    }
	}
	return false;
    }
    
    static final void method14041(int i, int i_12_, int i_13_) {
	if (Class554_Sub1.aFloat7364 < Class554_Sub1.aFloat7409) {
	    Class554_Sub1.aFloat7364
		+= (double) Class554_Sub1.aFloat7364 / 30.0;
	    if (Class554_Sub1.aFloat7364 > Class554_Sub1.aFloat7409)
		Class554_Sub1.aFloat7364 = Class554_Sub1.aFloat7409;
	    Class612.method10108(65280);
	    Class554_Sub1.anInt7394 = (int) Class554_Sub1.aFloat7409 >> 1;
	    Class554_Sub1.aByteArrayArrayArray7388
		= Class200_Sub18.method15632(Class554_Sub1.anInt7394,
					     -554979345);
	} else if (Class554_Sub1.aFloat7364 > Class554_Sub1.aFloat7409) {
	    Class554_Sub1.aFloat7364
		-= (double) Class554_Sub1.aFloat7364 / 30.0;
	    if (Class554_Sub1.aFloat7364 < Class554_Sub1.aFloat7409)
		Class554_Sub1.aFloat7364 = Class554_Sub1.aFloat7409;
	    Class612.method10108(65280);
	    Class554_Sub1.anInt7394 = (int) Class554_Sub1.aFloat7409 >> 1;
	    Class554_Sub1.aByteArrayArrayArray7388
		= Class200_Sub18.method15632(Class554_Sub1.anInt7394,
					     -105468748);
	}
	if (-1 != -620394103 * Class554_Sub1.anInt10672
	    && -1 != Class554_Sub1.anInt10673 * -128963373) {
	    int i_14_ = (Class554_Sub1.anInt10672 * -620394103
			 - 204700261 * Class151.anInt1705);
	    if (i_14_ != 0)
		i_14_ /= Math.min(Class554_Sub1.anInt10684 * -1048197681,
				  Math.abs(i_14_));
	    int i_15_ = (-128963373 * Class554_Sub1.anInt10673
			 - Class328.anInt3479 * -1636630007);
	    if (0 != i_15_)
		i_15_ /= Math.min(-1048197681 * Class554_Sub1.anInt10684,
				  Math.abs(i_15_));
	    Class151.anInt1705
		= (i_14_ + 204700261 * Class151.anInt1705) * 704227181;
	    Class328.anInt3479
		= (-1636630007 * Class328.anInt3479 + i_15_) * 980626489;
	    if (i_14_ == 0 && i_15_ == 0) {
		Class554_Sub1.anInt10672 = 1421361991;
		Class554_Sub1.anInt10673 = -2017528667;
	    }
	    Class612.method10108(65280);
	}
	Iterator iterator = Class554_Sub1.aHashMap10682.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class25 class25
		= (Class25) ((Map.Entry) iterator.next()).getValue();
	    class25.anInt231 -= -1425890405;
	    if (0 == -959968621 * class25.anInt231) {
		if (-132330391 * class25.anInt232 <= 1
		    && !Class554_Sub1.aBool10694)
		    iterator.remove();
		else {
		    class25.anInt232 -= 1869972441;
		    class25.anInt231 = Class554_Sub1.anInt10691 * -1184677759;
		}
	    }
	}
	iterator = Class554_Sub1.aHashMap10681.entrySet().iterator();
	while (iterator.hasNext()) {
	    Class25 class25
		= (Class25) ((Map.Entry) iterator.next()).getValue();
	    class25.anInt231 -= -1425890405;
	    if (-959968621 * class25.anInt231 == 0) {
		if (class25.anInt232 * -132330391 <= 1
		    && !Class554_Sub1.aBool10694)
		    iterator.remove();
		else {
		    class25.anInt232 -= 1869972441;
		    class25.anInt231 = Class554_Sub1.anInt10691 * -1184677759;
		}
	    }
	}
	if (Class554_Sub1.aBool10674 && Class615.aClass700_8055 != null) {
	    for (Class534_Sub20 class534_sub20
		     = ((Class534_Sub20)
			Class615.aClass700_8055.method14135((byte) -1));
		 null != class534_sub20;
		 class534_sub20
		     = ((Class534_Sub20)
			Class615.aClass700_8055.method14139(652501752))) {
		Class272 class272
		    = ((Class272)
		       (Class554_Sub1.aClass44_Sub9_7349.method91
			((class534_sub20.aClass534_Sub29_10525.anInt10652
			  * 1592054281),
			 -1576950683)));
		if (class534_sub20.method16192(i, i_12_, (byte) 1)) {
		    if (class272.aStringArray2980 != null) {
			if (null != class272.aStringArray2980[4])
			    Class112.method2016
				(class272.aStringArray2980[4],
				 class272.aString2964, -1, 1012, -1,
				 (long) ((class534_sub20.aClass534_Sub29_10525
					  .anInt10652)
					 * 1592054281),
				 -15128681 * class272.anInt2977, 0, true,
				 false,
				 (long) (1592054281 * (class534_sub20
						       .aClass534_Sub29_10525
						       .anInt10652)),
				 false, (short) 14552);
			if (class272.aStringArray2980[3] != null)
			    Class112.method2016
				(class272.aStringArray2980[3],
				 class272.aString2964, -1, 1011, -1,
				 (long) (1592054281 * (class534_sub20
						       .aClass534_Sub29_10525
						       .anInt10652)),
				 class272.anInt2977 * -15128681, 0, true,
				 false,
				 (long) (1592054281 * (class534_sub20
						       .aClass534_Sub29_10525
						       .anInt10652)),
				 false, (short) 32417);
			if (class272.aStringArray2980[2] != null)
			    Class112.method2016
				(class272.aStringArray2980[2],
				 class272.aString2964, -1, 1010, -1,
				 (long) (1592054281 * (class534_sub20
						       .aClass534_Sub29_10525
						       .anInt10652)),
				 -15128681 * class272.anInt2977, 0, true,
				 false,
				 (long) ((class534_sub20.aClass534_Sub29_10525
					  .anInt10652)
					 * 1592054281),
				 false, (short) 30078);
			if (null != class272.aStringArray2980[1])
			    Class112.method2016(class272.aStringArray2980[1],
						class272.aString2964, -1, 1009,
						-1,
						(long) ((class534_sub20
							 .aClass534_Sub29_10525
							 .anInt10652)
							* 1592054281),
						class272.anInt2977 * -15128681,
						0, true, false,
						(long) ((class534_sub20
							 .aClass534_Sub29_10525
							 .anInt10652)
							* 1592054281),
						false, (short) 16404);
			if (class272.aStringArray2980[0] != null)
			    Class112.method2016
				(class272.aStringArray2980[0],
				 class272.aString2964, -1, 1008, -1,
				 (long) (1592054281 * (class534_sub20
						       .aClass534_Sub29_10525
						       .anInt10652)),
				 -15128681 * class272.anInt2977, 0, true,
				 false,
				 (long) (1592054281 * (class534_sub20
						       .aClass534_Sub29_10525
						       .anInt10652)),
				 false, (short) 14996);
		    }
		    if (!class534_sub20.aClass534_Sub29_10525.aBool10656) {
			class534_sub20.aClass534_Sub29_10525.aBool10656 = true;
			Class680.method13862(Class583.aClass583_7787,
					     (1592054281
					      * (class534_sub20
						 .aClass534_Sub29_10525
						 .anInt10652)),
					     -15128681 * class272.anInt2977,
					     (byte) 11);
		    }
		    if (class534_sub20.aClass534_Sub29_10525.aBool10656)
			Class680.method13862(Class583.aClass583_7779,
					     (class534_sub20
					      .aClass534_Sub29_10525
					      .anInt10652) * 1592054281,
					     class272.anInt2977 * -15128681,
					     (byte) 94);
		} else if (class534_sub20.aClass534_Sub29_10525.aBool10656) {
		    class534_sub20.aClass534_Sub29_10525.aBool10656 = false;
		    Class680.method13862(Class583.aClass583_7778,
					 1592054281 * (class534_sub20
						       .aClass534_Sub29_10525
						       .anInt10652),
					 -15128681 * class272.anInt2977,
					 (byte) 12);
		}
	    }
	}
    }
    
    static final void method14042(Class669 class669, int i) {
	int i_16_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_16_, 125379425);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2508 * -1230478387;
    }
}
