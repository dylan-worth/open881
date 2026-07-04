/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.util.Date;

public class Class73
{
    public static Object[] method1563(Class534_Sub40 class534_sub40,
				      Class493[] class493s) {
	int i = class534_sub40.method16546(-1706829710);
	Object[] objects = new Object[i * class493s.length];
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    for (int i_1_ = 0; i_1_ < class493s.length; i_1_++) {
		int i_2_ = i_1_ + class493s.length * i_0_;
		objects[i_2_]
		    = class493s[i_1_].aClass483_5522.method7947(class534_sub40,
								594043746);
	    }
	}
	return objects;
    }
    
    public static int method1564(int i) {
	return i >>> 8;
    }
    
    public static int method1565(int i) {
	return i >>> 8;
    }
    
    Class73() throws Throwable {
	throw new Error();
    }
    
    public static Object[] method1566(Class534_Sub40 class534_sub40,
				      Class493[] class493s) {
	int i = class534_sub40.method16546(-1706829710);
	Object[] objects = new Object[i * class493s.length];
	for (int i_3_ = 0; i_3_ < i; i_3_++) {
	    for (int i_4_ = 0; i_4_ < class493s.length; i_4_++) {
		int i_5_ = i_4_ + class493s.length * i_3_;
		objects[i_5_]
		    = class493s[i_4_].aClass483_5522.method7947(class534_sub40,
								1456331239);
	    }
	}
	return objects;
    }
    
    public static void method1567(String string, int i) {
	if (null == Class200_Sub11.aStringArray9930)
	    Class56.method1226(-628085426);
	client.aCalendar11332
	    .setTime(new Date(Class250.method4604((byte) -105)));
	int i_6_ = client.aCalendar11332.get(11);
	int i_7_ = client.aCalendar11332.get(12);
	int i_8_ = client.aCalendar11332.get(13);
	String string_9_
	    = new StringBuilder().append(Integer.toString(i_6_ / 10)).append
		  (i_6_ % 10).append
		  (":").append
		  (i_7_ / 10).append
		  (i_7_ % 10).append
		  (":").append
		  (i_8_ / 10).append
		  (i_8_ % 10).toString();
	String[] strings = Class387.method6504(string, '\n', -68051054);
	for (int i_10_ = 0; i_10_ < strings.length; i_10_++) {
	    for (int i_11_ = Class114.anInt1385 * -1716872169; i_11_ > 0;
		 i_11_--)
		Class200_Sub11.aStringArray9930[i_11_]
		    = Class200_Sub11.aStringArray9930[i_11_ - 1];
	    Class200_Sub11.aStringArray9930[0]
		= new StringBuilder().append(string_9_).append(": ").append
		      (strings[i_10_]).toString();
	    if (null != Class504.aFileOutputStream5633) {
		try {
		    Class504.aFileOutputStream5633.write
			(Class387.method6503(new StringBuilder().append
						 (Class200_Sub11
						  .aStringArray9930[0])
						 .append
						 ("\n").toString(),
					     -2013795337));
		} catch (IOException ioexception) {
		    /* empty */
		}
	    }
	    if (-1716872169 * Class114.anInt1385
		< Class200_Sub11.aStringArray9930.length - 1) {
		Class114.anInt1385 += 1351113639;
		if (Class114.anInt1393 * -596800939 > 0)
		    Class114.anInt1393 += 719528701;
	    }
	}
    }
    
    static final void method1568(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aShort11311;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aShort11312;
    }
    
    static void method1569(int i, int i_12_, int i_13_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(5, (long) i);
	class534_sub18_sub6.method18121(920709178);
	class534_sub18_sub6.anInt11666 = 517206857 * i_12_;
    }
}
