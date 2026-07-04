/* Class690_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class690_Sub14 extends Class690
{
    static final int anInt10887 = 1;
    static final int anInt10888 = 4;
    static final int anInt10889 = 0;
    
    void method14023(int i) {
	anInt8753 = 1823770475 * i;
    }
    
    public int method14028(int i) {
	return 1;
    }
    
    public void method16999(int i) {
	if (anInt8753 * 189295939 < 0 || anInt8753 * 189295939 > 4)
	    anInt8753 = method14017(2118124478) * 1823770475;
    }
    
    public int method17000() {
	return anInt8753 * 189295939;
    }
    
    int method14018() {
	return 1;
    }
    
    public int method14026(int i, int i_0_) {
	return 1;
    }
    
    void method14020(int i, int i_1_) {
	anInt8753 = 1823770475 * i;
    }
    
    public int method17001(int i) {
	return anInt8753 * 189295939;
    }
    
    int method14021() {
	return 1;
    }
    
    int method14022() {
	return 1;
    }
    
    int method14017(int i) {
	return 1;
    }
    
    void method14024(int i) {
	anInt8753 = 1823770475 * i;
    }
    
    void method14025(int i) {
	anInt8753 = 1823770475 * i;
    }
    
    public Class690_Sub14(int i, Class534_Sub35 class534_sub35) {
	super(i, class534_sub35);
    }
    
    public int method14027(int i) {
	return 1;
    }
    
    public boolean method17002(int i) {
	return true;
    }
    
    public int method14029(int i) {
	return 1;
    }
    
    public int method14030(int i) {
	return 1;
    }
    
    public void method17003() {
	if (anInt8753 * 189295939 < 0 || anInt8753 * 189295939 > 4)
	    anInt8753 = method14017(2109690599) * 1823770475;
    }
    
    public boolean method17004() {
	return true;
    }
    
    public boolean method17005() {
	return true;
    }
    
    public int method17006() {
	return anInt8753 * 189295939;
    }
    
    public int method17007() {
	return anInt8753 * 189295939;
    }
    
    public int method17008() {
	return anInt8753 * 189295939;
    }
    
    public Class690_Sub14(Class534_Sub35 class534_sub35) {
	super(class534_sub35);
    }
    
    static final void method17009(Class669 class669, int i) {
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = new StringBuilder().append
		  (Class203.method3905(((long) (class669.anIntArray8595
						[(class669.anInt8600
						  -= 308999563) * 2088438307])
					* 60000L),
				       Class539.aClass672_7171.method93(),
				       true, -541945195))
		  .append
		  (" UTC").toString();
    }
    
    static void method17010(Class534_Sub41 class534_sub41, int i, int i_2_) {
	Object[] objects = class534_sub41.anObjectArray10819;
	int i_3_ = ((Integer) objects[0]).intValue();
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = Class228.method4190(i_3_, 2002135261);
	if (class534_sub18_sub8 != null) {
	    Class669 class669 = Class567.method9559((byte) -28);
	    class669.anIntArray8605
		= new int[-39710947 * class534_sub18_sub8.anInt11754];
	    int i_4_ = 0;
	    class669.anObjectArray8611
		= new String[class534_sub18_sub8.anInt11755 * 1127446605];
	    int i_5_ = 0;
	    class669.aLongArray8586
		= new long[-2103375343 * class534_sub18_sub8.anInt11757];
	    int i_6_ = 0;
	    for (int i_7_ = 1; i_7_ < objects.length; i_7_++) {
		if (objects[i_7_] instanceof Integer) {
		    int i_8_ = ((Integer) objects[i_7_]).intValue();
		    if (i_8_ == -2147483647)
			i_8_ = class534_sub41.anInt10822 * -406505557;
		    if (i_8_ == -2147483646)
			i_8_ = -1708547577 * class534_sub41.anInt10816;
		    if (i_8_ == -2147483645)
			i_8_ = (class534_sub41.aClass247_10818 != null
				? (class534_sub41.aClass247_10818.anInt2454
				   * -1278450723)
				: -1);
		    if (-2147483644 == i_8_)
			i_8_ = class534_sub41.anInt10821 * 1297952613;
		    if (-2147483643 == i_8_)
			i_8_ = (class534_sub41.aClass247_10818 != null
				? (class534_sub41.aClass247_10818.anInt2580
				   * 1365669833)
				: -1);
		    if (-2147483642 == i_8_)
			i_8_ = (null != class534_sub41.aClass247_10824
				? (-1278450723
				   * class534_sub41.aClass247_10824.anInt2454)
				: -1);
		    if (-2147483641 == i_8_)
			i_8_ = (class534_sub41.aClass247_10824 != null
				? (class534_sub41.aClass247_10824.anInt2580
				   * 1365669833)
				: -1);
		    if (i_8_ == -2147483640)
			i_8_ = class534_sub41.anInt10823 * 2103033019;
		    if (i_8_ == -2147483639)
			i_8_ = 1550982069 * class534_sub41.anInt10820;
		    class669.anIntArray8605[i_4_++] = i_8_;
		} else if (objects[i_7_] instanceof String) {
		    String string = (String) objects[i_7_];
		    if (string.equals("event_opbase"))
			string = class534_sub41.aString10825;
		    class669.anObjectArray8611[i_5_++] = string;
		} else if (objects[i_7_] instanceof Long) {
		    long l = ((Long) objects[i_7_]).longValue();
		    class669.aLongArray8586[i_6_++] = l;
		}
	    }
	    class669.anInt8588 = class534_sub41.anInt10826 * -864422403;
	    Class292.method5307(class534_sub18_sub8, i, class669, 1913270164);
	    class669.anInt8588 = 0;
	}
    }
}
