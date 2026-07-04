/* Class609 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class609 implements Interface76
{
    int anInt8003;
    static Class609 aClass609_8004 = new Class609(0);
    static Class609 aClass609_8005;
    static Class609 aClass609_8006 = new Class609(1);
    public static int anInt8007;
    
    Class609(int i) {
	anInt8003 = i * -231322099;
    }
    
    public int method53() {
	return anInt8003 * 981577925;
    }
    
    static {
	aClass609_8005 = new Class609(2);
    }
    
    public int method22() {
	return anInt8003 * 981577925;
    }
    
    public int method93() {
	return anInt8003 * 981577925;
    }
    
    static Class52_Sub1 method10070(int i) {
	Class52_Sub1 class52_sub1 = new Class52_Sub1();
	boolean bool = false;
	boolean bool_0_ = false;
	boolean bool_1_ = false;
	if (Class262.aString2801.startsWith("win")) {
	    bool_0_ = true;
	    bool = true;
	    bool_1_ = true;
	} else {
	    bool = true;
	    bool_1_ = true;
	}
	if (Class112.aBool1354) {
	    class52_sub1.method16407(16, -1688766455);
	    bool = false;
	}
	if (Class112.aBool1361) {
	    class52_sub1.method16407(32, 1438908227);
	    bool_0_ = false;
	}
	if (Class112.aBool1362) {
	    class52_sub1.method16407(16384, -2077739451);
	    bool_1_ = false;
	}
	if (!bool && !bool_0_) {
	    Class536_Sub3.method15992(class52_sub1, (byte) 83);
	    return class52_sub1;
	}
	int i_2_ = -1;
	int i_3_ = -1;
	int i_4_ = -1;
	if (bool_0_) {
	    try {
		Class44_Sub6.aClass534_Sub35_10989.method16438
		    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777,
		     3, 1481799477);
		Class672.method11096((byte) 1);
		i_3_ = Class46.method1114(3, 1000, 1821718470);
		if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10733
			.method16935(-1807368365)
		    == 3) {
		    class52_sub1.method16407(4, 1391130270);
		    Class176 class176 = Class254.aClass185_2683.method3232();
		    long l = (class176.aLong1848 * -1920893184504226295L
			      & 0xffffffffffffL);
		    switch (class176.anInt1844 * 1866206313) {
		    case 4098: {
			boolean bool_5_ = l >= 60129613779L;
			bool &= bool_5_;
			if (!bool_5_)
			    class52_sub1.method16407(512, 1267778072);
			break;
		    }
		    case 4318: {
			boolean bool_6_ = l >= 64425238954L;
			bool &= bool_6_;
			if (!bool_6_)
			    class52_sub1.method16407(256, -1313832098);
			break;
		    }
		    }
		}
	    } catch (Exception exception) {
		class52_sub1.method16407(4096, -1311970909);
	    }
	}
	if (bool_1_) {
	    try {
		Class44_Sub6.aClass534_Sub35_10989.method16438
		    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777,
		     5, 2046417208);
		Class672.method11096((byte) 1);
		i_4_ = Class46.method1114(5, 1000, 1677955870);
		if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10733
			.method16935(-1807368365)
		    == 5)
		    class52_sub1.method16407(8192, -2038464279);
	    } catch (Exception exception) {
		class52_sub1.method16407(32768, -469200495);
	    }
	}
	if (bool) {
	    try {
		Class44_Sub6.aClass534_Sub35_10989.method16438
		    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777,
		     4, -179883635);
		Class672.method11096((byte) 1);
		i_2_ = Class46.method1114(1, 1000, 1162782958);
		if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10733
			.method16935(-1807368365)
		    == 1)
		    class52_sub1.method16407(2, -1132633391);
	    } catch (Exception exception) {
		class52_sub1.method16407(2048, -230034266);
	    }
	}
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub42_10777, 0,
	     316576644);
	if (-1 == i_2_ && i_3_ == -1) {
	    Class536_Sub3.method15992(class52_sub1, (byte) 21);
	    return class52_sub1;
	}
	class52_sub1.method16409(3, i_3_, -1758953398);
	class52_sub1.method16409(1, i_2_, -1855389004);
	class52_sub1.method16409(5, i_4_, -1788108210);
	i_3_ *= 1.3F;
	if (i_3_ > 100000 && i_2_ > 100000 || i_3_ > i_2_)
	    Class245.method4491(class52_sub1, 3, -1 == i_2_ ? i_3_ : i_2_,
				-258992654);
	else
	    Class245.method4491(class52_sub1, 1, i_3_ == -1 ? i_2_ : i_3_,
				-301180446);
	return class52_sub1;
    }
    
    static boolean method10071(int i) {
	client.anInt11144 += -1982766353;
	client.aBool11098 = true;
	return true;
    }
}
