/* Class469 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Stack;

public final class Class469 implements Comparable
{
    Object anObject5147;
    Object anObject5148;
    long aLong5149;
    long aLong5150;
    
    public int compareTo(Object object) {
	return method7630((Class469) object, -1778495385);
    }
    
    public int method7629() {
	return anObject5148.hashCode();
    }
    
    public boolean equals(Object object) {
	if (object instanceof Class469)
	    return anObject5148.equals(((Class469) object).anObject5148);
	throw new IllegalArgumentException();
    }
    
    public int hashCode() {
	return anObject5148.hashCode();
    }
    
    int method7630(Class469 class469_0_, int i) {
	if (aLong5150 * 2191531479349145851L
	    < class469_0_.aLong5150 * 2191531479349145851L)
	    return -1;
	if (2191531479349145851L * aLong5150
	    > class469_0_.aLong5150 * 2191531479349145851L)
	    return 1;
	return 0;
    }
    
    public boolean method7631(Object object) {
	if (object instanceof Class469)
	    return anObject5148.equals(((Class469) object).anObject5148);
	throw new IllegalArgumentException();
    }
    
    public boolean method7632(Object object) {
	if (object instanceof Class469)
	    return anObject5148.equals(((Class469) object).anObject5148);
	throw new IllegalArgumentException();
    }
    
    public boolean method7633(Object object) {
	if (object instanceof Class469)
	    return anObject5148.equals(((Class469) object).anObject5148);
	throw new IllegalArgumentException();
    }
    
    public boolean method7634(Object object) {
	if (object instanceof Class469)
	    return anObject5148.equals(((Class469) object).anObject5148);
	throw new IllegalArgumentException();
    }
    
    Class469(Object object, Object object_1_) {
	anObject5147 = object;
	anObject5148 = object_1_;
    }
    
    int method7635(Class469 class469_2_) {
	if (aLong5150 * 2191531479349145851L
	    < class469_2_.aLong5150 * 2191531479349145851L)
	    return -1;
	if (2191531479349145851L * aLong5150
	    > class469_2_.aLong5150 * 2191531479349145851L)
	    return 1;
	return 0;
    }
    
    public static void method7636(byte i) {
	synchronized (Class550.aStack7304) {
	    Class550.aStack7304 = new Stack();
	}
    }
    
    static final void method7637(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2597
	    = Class99.method1859(string, class669, 1450400899);
	class247.aBool2561 = true;
    }
    
    static final void method7638(Class669 class669, int i) {
	int i_3_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (-1050164879 * client.anInt11171 == 2 && i_3_ >= 0
	    && i_3_ < -1979292205 * client.anInt11324)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -321033685 * client.aClass28Array11327[i_3_].anInt252;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method7639
	(Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1,
	 Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1_4_, int i, int i_5_,
	 int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
	int i_12_ = class654_sub1_sub5_sub1_4_.method18600((byte) 38);
	if (i_12_ != -1) {
	    Object object = null;
	    Class163 class163
		= (Class163) client.aClass203_11078.method3871((long) i_12_);
	    if (null == class163) {
		Class169[] class169s
		    = Class178.method2939(Class464.aClass472_5113, i_12_, 0);
		if (null == class169s)
		    return;
		class163
		    = Class254.aClass185_2683.method3279(class169s[0], true);
		client.aClass203_11078.method3893(class163, (long) i_12_);
	    }
	    Class438 class438
		= class654_sub1_sub5_sub1.method10807().aClass438_4885;
	    Class159.method2612(class654_sub1_sub5_sub1.aByte10854,
				(int) class438.aFloat4864,
				(int) class438.aFloat4865,
				(class654_sub1_sub5_sub1.method18545((byte) 1)
				 * 256),
				0, false, false, 762441224);
	    int i_13_
		= (int) (client.aFloatArray11167[0] + (float) i_5_ - 18.0F);
	    int i_14_ = (int) (client.aFloatArray11167[1] + (float) i_6_
			       - 16.0F - 54.0F);
	    i_13_ += 18 * (i / 4);
	    i_14_ += i % 4 * 18;
	    class163.method2656(i_13_, i_14_);
	    if (class654_sub1_sub5_sub1 == class654_sub1_sub5_sub1_4_)
		Class254.aClass185_2683.method3425(i_13_ - 1, i_14_ - 1, 18,
						   18, -256, -650724972);
	    Class536_Sub3 class536_sub3 = Class653.method10803(1948284402);
	    class536_sub3.aClass654_Sub1_Sub5_Sub1_10358
		= class654_sub1_sub5_sub1_4_;
	    class536_sub3.anInt10359 = 1862424139 * i_13_;
	    class536_sub3.anInt10360 = -1142642293 * i_14_;
	    class536_sub3.anInt10356 = -558049543 * (i_13_ + 16);
	    class536_sub3.anInt10361 = (i_14_ + 16) * 145620327;
	    client.aClass709_11165.method14287(class536_sub3, 1988117331);
	}
    }
    
    static String method7640(Throwable throwable, int i) throws IOException {
	String string;
	if (throwable instanceof RuntimeException_Sub1) {
	    RuntimeException_Sub1 runtimeexception_sub1
		= (RuntimeException_Sub1) throwable;
	    string = new StringBuilder().append
			 (runtimeexception_sub1.aString12089).append
			 (" | ").toString();
	    throwable = runtimeexception_sub1.aThrowable12090;
	} else
	    string = "";
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_15_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_15_));
	String string_16_ = bufferedreader.readLine();
	for (;;) {
	    String string_17_ = bufferedreader.readLine();
	    if (null == string_17_)
		break;
	    int i_18_ = string_17_.indexOf('(');
	    int i_19_ = string_17_.indexOf(')', 1 + i_18_);
	    String string_20_;
	    if (i_18_ != -1)
		string_20_ = string_17_.substring(0, i_18_);
	    else
		string_20_ = string_17_;
	    string_20_ = string_20_.trim();
	    string_20_ = string_20_.substring(string_20_.lastIndexOf(' ') + 1);
	    string_20_
		= string_20_.substring(string_20_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_20_)
			 .toString();
	    if (i_18_ != -1 && i_19_ != -1) {
		int i_21_ = string_17_.indexOf(".java:", i_18_);
		if (i_21_ >= 0)
		    string = new StringBuilder().append(string).append
				 (string_17_.substring(5 + i_21_, i_19_))
				 .toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_16_).toString();
	return string;
    }
    
    public static final int method7641(byte i) {
	return (int) (1000000000L
		      / (435371756202260911L * Class498.aLong5553));
    }
}
