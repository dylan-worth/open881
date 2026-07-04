/* Class200_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class200_Sub4 extends Class200
{
    int anInt9892;
    int anInt9893;
    String aString9894;
    int anInt9895;
    int anInt9896;
    public static int anInt9897;
    
    public void method3846() {
	Class386.method6496(-878424575 * Class674.anInt8633,
			    -1462189161 * anInt9893, anInt9892 * 816452999,
			    Class247.method4595(-1462189161 * anInt9893,
						816452999 * anInt9892,
						(-878424575
						 * Class674.anInt8633),
						-275876585),
			    anInt9896 * -1499371935, anInt9895 * 469877989,
			    aString9894, 1567399823);
    }
    
    public void method3845(int i) {
	Class386.method6496(-878424575 * Class674.anInt8633,
			    -1462189161 * anInt9893, anInt9892 * 816452999,
			    Class247.method4595(-1462189161 * anInt9893,
						816452999 * anInt9892,
						(-878424575
						 * Class674.anInt8633),
						-902270120),
			    anInt9896 * -1499371935, anInt9895 * 469877989,
			    aString9894, 1567399823);
    }
    
    Class200_Sub4(Class534_Sub40 class534_sub40) {
	super(class534_sub40);
	anInt9893 = class534_sub40.method16529((byte) 1) * 470674471;
	anInt9892 = class534_sub40.method16529((byte) 1) * -231235529;
	aString9894 = class534_sub40.method16541((byte) -71);
	anInt9895 = class534_sub40.method16533(-258848859) * -1357489939;
	anInt9896 = class534_sub40.method16529((byte) 1) * -2104902239;
    }
    
    public void method3847() {
	Class386.method6496(-878424575 * Class674.anInt8633,
			    -1462189161 * anInt9893, anInt9892 * 816452999,
			    Class247.method4595(-1462189161 * anInt9893,
						816452999 * anInt9892,
						(-878424575
						 * Class674.anInt8633),
						1233723267),
			    anInt9896 * -1499371935, anInt9895 * 469877989,
			    aString9894, 1567399823);
    }
    
    static void method15571(Class243 class243, int i, int i_0_, int i_1_,
			    boolean bool, Class669 class669, int i_2_) {
	if (i_0_ == 0)
	    throw new RuntimeException();
	Class247 class247 = class243.aClass247Array2412[i];
	if (class247.aClass247Array2620 == null) {
	    class247.aClass247Array2620 = new Class247[1 + i_1_];
	    class247.aClass247Array2621 = class247.aClass247Array2620;
	}
	if (class247.aClass247Array2620.length <= i_1_) {
	    if (class247.aClass247Array2620 == class247.aClass247Array2621) {
		Class247[] class247s = new Class247[1 + i_1_];
		for (int i_3_ = 0; i_3_ < class247.aClass247Array2620.length;
		     i_3_++)
		    class247s[i_3_] = class247.aClass247Array2620[i_3_];
		class247.aClass247Array2620 = class247.aClass247Array2621
		    = class247s;
	    } else {
		Class247[] class247s = new Class247[1 + i_1_];
		Class247[] class247s_4_ = new Class247[i_1_ + 1];
		for (int i_5_ = 0; i_5_ < class247.aClass247Array2620.length;
		     i_5_++) {
		    class247s[i_5_] = class247.aClass247Array2620[i_5_];
		    class247s_4_[i_5_] = class247.aClass247Array2621[i_5_];
		}
		class247.aClass247Array2620 = class247s;
		class247.aClass247Array2621 = class247s_4_;
	    }
	}
	if (i_1_ > 0 && class247.aClass247Array2620[i_1_ - 1] == null)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (i_1_ - 1).toString());
	Class247 class247_6_ = new Class247();
	class247_6_.anInt2438 = 1389544413 * i_0_;
	class247_6_.anInt2472
	    = (class247_6_.anInt2454 = 1 * class247.anInt2454) * 584462367;
	class247_6_.anInt2580 = -2112138631 * i_1_;
	class247.aClass247Array2620[i_1_] = class247_6_;
	if (class247.aClass247Array2620 != class247.aClass247Array2621)
	    class247.aClass247Array2621[i_1_] = class247_6_;
	Class666 class666;
	if (bool)
	    class666 = class669.aClass666_8592;
	else
	    class666 = class669.aClass666_8599;
	class666.aClass243_8575 = class243;
	class666.aClass247_8574 = class247_6_;
	Class454.method7416(class247, -961846367);
    }
    
    static final void method15572(Class669 class669, short i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class110_Sub1_Sub1.method17865(class247, class243, class669,
				       1306206844);
    }
}
