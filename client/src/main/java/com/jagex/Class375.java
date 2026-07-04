/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class375
{
    public static Class375 aClass375_3902;
    public static Class375 aClass375_3903;
    public static Class375 aClass375_3904;
    public static Class375 aClass375_3905;
    public static Class375 aClass375_3906;
    public static Class375 aClass375_3907;
    public static Class375 aClass375_3908 = new Class375();
    
    Class375() {
	/* empty */
    }
    
    static {
	aClass375_3905 = new Class375();
	aClass375_3904 = new Class375();
	aClass375_3906 = new Class375();
	aClass375_3902 = new Class375();
	aClass375_3907 = new Class375();
	aClass375_3903 = new Class375();
    }
    
    static final void method6411(Class247 class247, Class243 class243,
				 Class669 class669, short i) {
	class247.anInt2496 = -1070830455;
	class247.anInt2497
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * 931070365;
	if (1365669833 * class247.anInt2580 == -1 && !class243.aBool2413)
	    Class626.method10366(class247.anInt2454 * -1278450723, 928915750);
    }
    
    static final void method6412(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) (Math.random() * (double) i_0_);
    }
    
    static final void method6413(Class669 class669, short i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class556.method9394(class247, class243, class669, 370369769);
    }
    
    static void method6414(int i, int i_1_, Class247 class247, byte i_2_) {
	int i_3_ = i + class247.anInt2468 * -881188269;
	int i_4_ = 15 + i_1_;
	if (client.aBool11262) {
	    int i_5_ = -256;
	    if (client.anInt5554 * 1720947399 < 20)
		i_5_ = -65536;
	    Class539_Sub1.aClass171_10327.method2829
		(new StringBuilder().append("Fps:").append
		     (client.anInt5554 * 1720947399).append
		     (" (").append
		     (client.anInt5555 * -482787859).append
		     (" ms)").toString(),
		 i_3_, i_4_, i_5_, -1, 1800464650);
	    i_4_ += 15;
	    Runtime runtime = Runtime.getRuntime();
	    long l = runtime.totalMemory() / 1024L;
	    long l_6_ = l - runtime.freeMemory() / 1024L;
	    int i_7_ = -256;
	    if (l_6_ > 262144L)
		i_7_ = -65536;
	    Class539_Sub1.aClass171_10327.method2829(new StringBuilder().append
							 ("Mem:").append
							 (l_6_).append
							 ("/").append
							 (l).append
							 ("k").toString(),
						     i_3_, i_4_, i_7_, -1,
						     -278177621);
	    i_4_ += 15;
	    long l_8_
		= client.aClass100_11264.aClass54_1194.method1196((byte) -91);
	    String string = "N/A";
	    if (-1L != l_8_) {
		string
		    = new StringBuilder().append(l_8_).append("ms").toString();
		if (l_8_ > 500L)
		    string = new StringBuilder().append
				 (Class154.method2575(16711680, -314523249))
				 .append
				 (string).append
				 (Class154.method2575(16776960, 809687520))
				 .toString();
	    }
	    Class539_Sub1.aClass171_10327.method2829
		(new StringBuilder().append("Game: In:").append
		     (client.aClass100_11264.anInt1185 * 749941029).append
		     ("B/s ").append
		     ("Out:").append
		     (client.aClass100_11264.anInt1193 * -939451607).append
		     ("B/s ").append
		     ("Ping:").append
		     (string).toString(),
		 i_3_, i_4_, -256, -1, -179582699);
	    i_4_ += 15;
	    long l_9_
		= client.aClass100_11094.aClass54_1194.method1196((byte) -66);
	    String string_10_ = "N/A";
	    if (l_9_ != -1L) {
		string_10_
		    = new StringBuilder().append(l_9_).append("ms").toString();
		if (l_9_ > 500L)
		    string_10_
			= new StringBuilder().append
			      (Class154.method2575(16711680, -498487086))
			      .append
			      (string_10_).append
			      (Class154.method2575(16776960, -1742072011))
			      .toString();
	    }
	    Class539_Sub1.aClass171_10327.method2829
		(new StringBuilder().append("Lobby: In:").append
		     (749941029 * client.aClass100_11094.anInt1185).append
		     ("B/s ").append
		     ("Out:").append
		     (client.aClass100_11094.anInt1193 * -939451607).append
		     ("B/s ").append
		     ("Ping:").append
		     (string_10_).toString(),
		 i_3_, i_4_, -256, -1, 1132087242);
	    i_4_ += 15;
	    int i_11_ = Class254.aClass185_2683.method3239() / 1024;
	    Class539_Sub1.aClass171_10327.method2829
		(new StringBuilder().append("Offheap:").append(i_11_).append
		     ("k").toString(),
		 i_3_, i_4_, i_11_ > 65536 ? -65536 : -256, -1, -1926551603);
	    i_4_ += 15;
	    int i_12_ = 0;
	    int i_13_ = 0;
	    int i_14_ = 0;
	    for (int i_15_ = 0; i_15_ < Class57.aClass451_Sub1Array459.length;
		 i_15_++) {
		if (Class57.aClass451_Sub1Array459[i_15_] != null
		    && Class57.aClass451_Sub1Array459[i_15_]
			   .method15892((byte) 5)) {
		    i_12_ += Class57.aClass451_Sub1Array459[i_15_]
				 .method15901((byte) 24);
		    i_13_ += Class57.aClass451_Sub1Array459[i_15_]
				 .method15913(1573362588);
		    i_14_ += Class57.aClass451_Sub1Array459[i_15_]
				 .method15907((byte) -21);
		}
	    }
	    long l_16_ = i_12_ == 0 ? 0L : 100L * (long) i_14_ / (long) i_12_;
	    long l_17_
		= 0 == i_12_ ? 0L : (long) i_13_ * 10000L / (long) i_12_;
	    String string_18_
		= new StringBuilder().append("Cache:").append
		      (Class281.method5235(l_17_, 2, true,
					   Class672.aClass672_8621,
					   -2143397670))
		      .append
		      ("% (").append
		      (l_16_).append
		      ("%)").toString();
	    Class219.aClass171_2307.method2829(string_18_, i_3_, i_4_, -256,
					       -1, -1957143163);
	    i_4_ += 12;
	}
    }
}
