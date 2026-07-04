/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Class84
{
    static Calendar aCalendar837;
    static Calendar aCalendar838;
    static String[][] aStringArrayArray839
	= { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
	      "Oct", "Nov", "Dec" },
	    { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug",
	      "Sep", "Okt", "Nov", "Dez" },
	    { "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil",
	      "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" },
	    { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set",
	      "out", "nov", "dez" },
	    { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep",
	      "okt", "nov", "dec" },
	    { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
	      "Oct", "Nov", "Dec" },
	    { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep",
	      "oct", "nov", "dic" } };
    public static Class44_Sub11 aClass44_Sub11_840;
    
    static String method1653(long l, int i) {
	Class699.method14128(l);
	int i_0_ = aCalendar838.get(5);
	int i_1_ = aCalendar838.get(2) + 1;
	int i_2_ = aCalendar838.get(1);
	return new StringBuilder().append(Integer.toString(i_0_ / 10)).append
		   (i_0_ % 10).append
		   ("/").append
		   (i_1_ / 10).append
		   (i_1_ % 10).append
		   ("/").append
		   (i_2_ % 100 / 10).append
		   (i_2_ % 10).toString();
    }
    
    public static String method1654(long l, int i) {
	Class699.method14128(l);
	int i_3_ = aCalendar838.get(11);
	int i_4_ = aCalendar838.get(12);
	int i_5_ = aCalendar838.get(13);
	return new StringBuilder().append(Integer.toString(i_3_ / 10)).append
		   (i_3_ % 10).append
		   (":").append
		   (i_4_ / 10).append
		   (i_4_ % 10).append
		   (":").append
		   (i_5_ / 10).append
		   (i_5_ % 10).toString();
    }
    
    public static String method1655(long l, int i) {
	Class699.method14128(l);
	int i_6_ = aCalendar838.get(5);
	int i_7_ = aCalendar838.get(2);
	int i_8_ = aCalendar838.get(1);
	if (i == 3)
	    return Class85.method1682(l, i, (short) 10377);
	return new StringBuilder().append(Integer.toString(i_6_ / 10)).append
		   (i_6_ % 10).append
		   ("-").append
		   (aStringArrayArray839[i][i_7_]).append
		   ("-").append
		   (i_8_).toString();
    }
    
    public static int method1656(long l) {
	Class699.method14128(l);
	return aCalendar838.get(1);
    }
    
    static {
	aCalendar838 = Calendar.getInstance();
	aCalendar837 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
    
    static String method1657(long l, int i, boolean bool) {
	Calendar calendar;
	if (bool) {
	    Class386.method6495(l);
	    calendar = aCalendar837;
	} else {
	    Class699.method14128(l);
	    calendar = aCalendar838;
	}
	int i_9_ = calendar.get(5);
	int i_10_ = calendar.get(2) + 1;
	int i_11_ = calendar.get(1);
	int i_12_ = calendar.get(11);
	int i_13_ = calendar.get(12);
	return new StringBuilder().append(Integer.toString(i_9_ / 10)).append
		   (i_9_ % 10).append
		   ("/").append
		   (i_10_ / 10).append
		   (i_10_ % 10).append
		   ("/").append
		   (i_11_ % 100 / 10).append
		   (i_11_ % 10).append
		   (" ").append
		   (i_12_ / 10).append
		   (i_12_ % 10).append
		   (":").append
		   (i_13_ / 10).append
		   (i_13_ % 10).toString();
    }
    
    static String method1658(long l, int i) {
	Class699.method14128(l);
	int i_14_ = aCalendar838.get(5);
	int i_15_ = aCalendar838.get(2) + 1;
	int i_16_ = aCalendar838.get(1);
	return new StringBuilder().append(Integer.toString(i_14_ / 10)).append
		   (i_14_ % 10).append
		   ("/").append
		   (i_15_ / 10).append
		   (i_15_ % 10).append
		   ("/").append
		   (i_16_ % 100 / 10).append
		   (i_16_ % 10).toString();
    }
    
    public static String method1659(long l, int i, boolean bool) {
	Calendar calendar;
	if (bool) {
	    Class386.method6495(l);
	    calendar = aCalendar837;
	} else {
	    Class699.method14128(l);
	    calendar = aCalendar838;
	}
	int i_17_ = calendar.get(5);
	int i_18_ = calendar.get(2);
	int i_19_ = calendar.get(1);
	int i_20_ = calendar.get(11);
	int i_21_ = calendar.get(12);
	if (i == 3)
	    return Class459.method7442(l, i, bool, (byte) -128);
	return new StringBuilder().append(Integer.toString(i_17_ / 10)).append
		   (i_17_ % 10).append
		   ("-").append
		   (aStringArrayArray839[i][i_18_]).append
		   ("-").append
		   (i_19_).append
		   (" ").append
		   (i_20_ / 10).append
		   (i_20_ % 10).append
		   (":").append
		   (i_21_ / 10).append
		   (i_21_ % 10).toString();
    }
    
    static void method1660(long l) {
	aCalendar838.setTime(new Date(l));
    }
    
    static void method1661(long l) {
	aCalendar837.setTime(new Date(l));
    }
    
    Class84() throws Throwable {
	throw new Error();
    }
    
    public static int[] method1662(int i) {
	int[] is = new int[3];
	Class699.method14128(Class260.method4812(i, (byte) 0));
	is[0] = aCalendar838.get(5);
	is[1] = aCalendar838.get(2);
	is[2] = aCalendar838.get(1);
	return is;
    }
    
    public static String method1663(long l, int i, boolean bool) {
	Calendar calendar;
	if (bool) {
	    Class386.method6495(l);
	    calendar = aCalendar837;
	} else {
	    Class699.method14128(l);
	    calendar = aCalendar838;
	}
	int i_22_ = calendar.get(5);
	int i_23_ = calendar.get(2);
	int i_24_ = calendar.get(1);
	int i_25_ = calendar.get(11);
	int i_26_ = calendar.get(12);
	if (i == 3)
	    return Class459.method7442(l, i, bool, (byte) -49);
	return new StringBuilder().append(Integer.toString(i_22_ / 10)).append
		   (i_22_ % 10).append
		   ("-").append
		   (aStringArrayArray839[i][i_23_]).append
		   ("-").append
		   (i_24_).append
		   (" ").append
		   (i_25_ / 10).append
		   (i_25_ % 10).append
		   (":").append
		   (i_26_ / 10).append
		   (i_26_ % 10).toString();
    }
    
    public static int[] method1664(int i) {
	int[] is = new int[3];
	Class699.method14128(Class260.method4812(i, (byte) 0));
	is[0] = aCalendar838.get(5);
	is[1] = aCalendar838.get(2);
	is[2] = aCalendar838.get(1);
	return is;
    }
    
    public static long method1665(int i, int i_27_, int i_28_, int i_29_,
				  int i_30_, int i_31_) {
	aCalendar837.clear();
	aCalendar837.set(i_31_, i_30_, i_29_, i_28_, i_27_, i);
	return aCalendar837.getTime().getTime();
    }
    
    public static long method1666(int i) {
	return 86400000L * (long) (i + 11745);
    }
    
    public static int method1667(long l) {
	Class699.method14128(l);
	return aCalendar838.get(1);
    }
    
    public static int[] method1668(int i) {
	int[] is = new int[3];
	Class699.method14128(Class260.method4812(i, (byte) 0));
	is[0] = aCalendar838.get(5);
	is[1] = aCalendar838.get(2);
	is[2] = aCalendar838.get(1);
	return is;
    }
    
    static final void method1669(int i, int i_32_, int i_33_) {
	Class113.anInt1375 = i * -1660827629;
	Class113.anInt1376 = i_32_ * 517634255;
	Class113.aBool1373 = false;
	Class453_Sub3.method15985(-466504001);
    }
    
    public static final void method1670(int i) {
	if (client.anInt11152 * -1351358339 != -1
	    && 1614995835 * client.anInt11153 != -1) {
	    int i_34_ = (-444594113 * client.anInt11034
			 + ((-1927250963 * client.anInt11156
			     * (-1698962903 * client.anInt11266
				- -444594113 * client.anInt11034))
			    >> 16));
	    client.anInt11156 += i_34_ * 139663845;
	    if (-1927250963 * client.anInt11156 >= 65535) {
		client.anInt11156 = 294774299;
		if (!client.aBool11106)
		    client.aBool11159 = true;
		else
		    client.aBool11159 = false;
		client.aBool11106 = true;
	    } else {
		client.aBool11159 = false;
		client.aBool11106 = false;
	    }
	    float f = (float) (client.anInt11156 * -1927250963) / 65535.0F;
	    float[] fs = new float[3];
	    int i_35_ = client.anInt11052 * 229109634;
	    for (int i_36_ = 0; i_36_ < 3; i_36_++) {
		int i_37_ = ((client.anIntArrayArrayArray11151
			      [-1351358339 * client.anInt11152][i_35_][i_36_])
			     * 3);
		int i_38_
		    = ((client.anIntArrayArrayArray11151
			[client.anInt11152 * -1351358339][1 + i_35_][i_36_])
		       * 3);
		int i_39_ = 3 * ((client.anIntArrayArrayArray11151
				  [client.anInt11152 * -1351358339][2 + i_35_]
				  [i_36_])
				 - ((client.anIntArrayArrayArray11151
				     [client.anInt11152 * -1351358339]
				     [i_35_ + 3][i_36_])
				    - (client.anIntArrayArrayArray11151
				       [client.anInt11152 * -1351358339]
				       [2 + i_35_][i_36_])));
		int i_40_ = (client.anIntArrayArrayArray11151
			     [-1351358339 * client.anInt11152][i_35_][i_36_]);
		int i_41_ = i_38_ - i_37_;
		int i_42_ = i_39_ + (i_37_ - 2 * i_38_);
		int i_43_
		    = ((client.anIntArrayArrayArray11151
			[client.anInt11152 * -1351358339][2 + i_35_][i_36_])
		       - i_40_ + i_38_ - i_39_);
		fs[i_36_] = ((float) i_40_
			     + f * (((float) i_42_ + f * (float) i_43_) * f
				    + (float) i_41_));
	    }
	    Class597 class597 = client.aClass512_11100.method8416((byte) 8);
	    Class200_Sub13.anInt9937
		= -2079086379 * ((int) fs[0]
				 - 1852947968 * class597.anInt7859);
	    Class677.anInt8654 = (int) fs[1] * -996845503;
	    Class636.anInt8305
		= -866237299 * ((int) fs[2] - class597.anInt7861 * -139729408);
	    float[] fs_44_ = new float[3];
	    int i_45_ = 1980678826 * client.anInt11080;
	    for (int i_46_ = 0; i_46_ < 3; i_46_++) {
		int i_47_
		    = 3 * (client.anIntArrayArrayArray11151
			   [1614995835 * client.anInt11153][i_45_][i_46_]);
		int i_48_
		    = 3 * (client.anIntArrayArrayArray11151
			   [1614995835 * client.anInt11153][1 + i_45_][i_46_]);
		int i_49_
		    = 3 * ((client.anIntArrayArrayArray11151
			    [1614995835 * client.anInt11153][i_45_ + 2][i_46_])
			   - ((client.anIntArrayArrayArray11151
			       [client.anInt11153 * 1614995835][i_45_ + 3]
			       [i_46_])
			      - (client.anIntArrayArrayArray11151
				 [1614995835 * client.anInt11153][2 + i_45_]
				 [i_46_])));
		int i_50_ = (client.anIntArrayArrayArray11151
			     [client.anInt11153 * 1614995835][i_45_][i_46_]);
		int i_51_ = i_48_ - i_47_;
		int i_52_ = i_47_ - i_48_ * 2 + i_49_;
		int i_53_
		    = ((client.anIntArrayArrayArray11151
			[1614995835 * client.anInt11153][2 + i_45_][i_46_])
		       - i_50_ + i_48_ - i_49_);
		fs_44_[i_46_]
		    = (float) i_50_ + ((f * (float) i_53_ + (float) i_52_) * f
				       + (float) i_51_) * f;
	    }
	    float f_54_ = fs_44_[0] - fs[0];
	    float f_55_ = (fs_44_[1] - fs[1]) * -1.0F;
	    float f_56_ = fs_44_[2] - fs[2];
	    double d = Math.sqrt((double) (f_56_ * f_56_ + f_54_ * f_54_));
	    Class566.anInt7589
		= ((int) (Math.atan2((double) f_55_, d) * 2607.5945876176133)
		   & 0x3fff) * -1539495063;
	    Class641.anInt8341
		= ((int) (-Math.atan2((double) f_54_, (double) f_56_)
			  * 2607.5945876176133)
		   & 0x3fff) * 486346273;
	    Class2.anInt22
		= 506655975 * ((client.anIntArrayArrayArray11151
				[-1351358339 * client.anInt11152][i_35_][3])
			       + (((client.anIntArrayArrayArray11151
				    [client.anInt11152 * -1351358339]
				    [2 + i_35_][3])
				   - (client.anIntArrayArrayArray11151
				      [client.anInt11152 * -1351358339][i_35_]
				      [3])) * (-1927250963 * client.anInt11156)
				  >> 16));
	}
    }
}
