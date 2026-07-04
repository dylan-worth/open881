/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class243
{
    Class247[] aClass247Array2411;
    public Class247[] aClass247Array2412;
    public boolean aBool2413;
    
    public Class247[] method4473(byte i) {
	return (null == aClass247Array2411 ? aClass247Array2412
		: aClass247Array2411);
    }
    
    public Class247[] method4474() {
	return (null == aClass247Array2411 ? aClass247Array2412
		: aClass247Array2411);
    }
    
    public Class247[] method4475(byte i) {
	if (null == aClass247Array2411) {
	    int i_0_ = aClass247Array2412.length;
	    aClass247Array2411 = new Class247[i_0_];
	    System.arraycopy(aClass247Array2412, 0, aClass247Array2411, 0,
			     aClass247Array2412.length);
	}
	return aClass247Array2411;
    }
    
    public Class247 method4476(int i, int i_1_) {
	if (i >>> 16 != aClass247Array2412[0].anInt2454 * -1278450723 >>> 16)
	    throw new IllegalArgumentException();
	return aClass247Array2412[i & 0xffff];
    }
    
    public Class247[] method4477() {
	return (null == aClass247Array2411 ? aClass247Array2412
		: aClass247Array2411);
    }
    
    public Class247[] method4478() {
	return (null == aClass247Array2411 ? aClass247Array2412
		: aClass247Array2411);
    }
    
    Class243(boolean bool, Class247[] class247s) {
	aClass247Array2412 = class247s;
	aBool2413 = bool;
    }
    
    public Class247 method4479(int i) {
	if (i >>> 16 != aClass247Array2412[0].anInt2454 * -1278450723 >>> 16)
	    throw new IllegalArgumentException();
	return aClass247Array2412[i & 0xffff];
    }
    
    public static Class163 method4480(Class472 class472, int i, int i_2_) {
	Class163 class163
	    = (Class163) Class291.aClass203_3112.method3871((long) i);
	if (null == class163) {
	    if (Class223.aBool2315)
		class163
		    = Class254.aClass185_2683
			  .method3279(Class178.method2945(class472, i), true);
	    else
		class163
		    = Class672.method11076(class472.method7738(i, (byte) -98),
					   339703005);
	    Class291.aClass203_3112.method3893(class163, (long) i);
	}
	return class163;
    }
    
    static final void method4481(Class669 class669, int i) {
	class669.anInt8600 -= 926998689;
	int i_3_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_4_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_5_
	    = class669.anIntArray8595[2 + 2088438307 * class669.anInt8600];
	Class171_Sub4.aClass232_9944.method4225(i_3_, i_4_, i_5_, 2109306869);
    }
    
    static final void method4482(Class669 class669, byte i) {
	class669.anInt8594 -= -1374580330;
	String string
	    = ((String)
	       class669.anObjectArray8593[1485266147 * class669.anInt8594]);
	String string_6_ = (String) (class669.anObjectArray8593
				     [1 + class669.anInt8594 * 1485266147]);
	class669.anInt8600 -= 617999126;
	int i_7_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_8_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	if (null == string_6_)
	    string_6_ = "";
	if (string_6_.length() > 80)
	    string_6_ = string_6_.substring(0, 80);
	Class100 class100 = Class201.method3864(2095398292);
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4203,
				  class100.aClass13_1183, 1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16506
	    ((Class668.method11029(string, (byte) 0) + 2
	      + Class668.method11029(string_6_, (byte) 0)),
	     1791721781);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string,
							      -1729683336);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16506(i_7_ - 1,
							      1118415925);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16506(i_8_,
							      2130365779);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string_6_,
							      1803024565);
	class100.method1863(class534_sub19, (byte) 93);
    }
    
    static void method4483(Class534_Sub16 class534_sub16, int i, int i_9_,
			   int i_10_, int i_11_, int i_12_) {
	if (-1 != -241175639 * class534_sub16.anInt10489
	    || class534_sub16.anIntArray10479 != null) {
	    int i_13_ = class534_sub16.anInt10480 * 63994171;
	    if (0 == 984135565 * class534_sub16.anInt10467
		|| Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub28_10754
		       .method17131(-360702303) == 0
		|| 377042463 * class534_sub16.anInt10471 != i) {
		if (class534_sub16.aClass491_10492 != null) {
		    class534_sub16.aClass491_10492.method8014(100, 1962988118);
		    Class171_Sub4.aClass232_9944.method4234((class534_sub16
							     .aClass491_10492),
							    -1528178890);
		    class534_sub16.aClass491_10492 = null;
		}
	    } else {
		if (null != class534_sub16.aClass491_10492
		    && ((class534_sub16.aClass491_10492.method8027((byte) 2)
			 == Class480.aClass480_5253)
			|| (class534_sub16.aClass491_10492.method8027((byte) 2)
			    == Class480.aClass480_5257))) {
		    Class171_Sub4.aClass232_9944.method4234((class534_sub16
							     .aClass491_10492),
							    -315149156);
		    class534_sub16.aClass491_10492 = null;
		}
		if (class534_sub16.aClass491_10492 == null) {
		    if (-241175639 * class534_sub16.anInt10489 >= 0) {
			int i_14_ = 256;
			int i_15_
			    = (int) ((0.5F
				      * (float) ((37947927
						  * class534_sub16.anInt10474)
						 - (class534_sub16.anInt10472
						    * 1285097747)))
				     + (float) (1285097747
						* class534_sub16.anInt10472));
			int i_16_
			    = (int) ((float) (-1700987663
					      * class534_sub16.anInt10473)
				     + (float) ((class534_sub16.anInt10475
						 * -374666787)
						- (class534_sub16.anInt10473
						   * -1700987663)) * 0.5F);
			class534_sub16.aClass438_10476.aFloat4864
			    = (float) i_15_;
			class534_sub16.aClass438_10476.aFloat4865
			    = (float) i_16_;
			class534_sub16.aClass491_10492
			    = (Class171_Sub4.aClass232_9944.method4229
			       (Class211.aClass211_2248, class534_sub16,
				-241175639 * class534_sub16.anInt10489, -1, 0,
				Class190.aClass190_2136.method3763(-897960874),
				Class207.aClass207_2236,
				(float) (-1081773949
					 * class534_sub16.anInt10491),
				(float) (984135565
					 * class534_sub16.anInt10467),
				class534_sub16.aClass438_10476, 0, i_14_,
				false, 1331388232));
			if (class534_sub16.aClass491_10492 != null) {
			    float f = (float) i_13_ / 255.0F;
			    class534_sub16.aClass491_10492
				.method8037(f, 150, 1363576710);
			    class534_sub16.aClass491_10492
				.method8069(1932259494);
			}
		    }
		} else {
		    int i_17_
			= (int) ((float) (1285097747
					  * class534_sub16.anInt10472)
				 + ((float) ((class534_sub16.anInt10474
					      * 37947927)
					     - (1285097747
						* class534_sub16.anInt10472))
				    * 0.5F));
		    int i_18_
			= (int) (0.5F * (float) ((-374666787
						  * class534_sub16.anInt10475)
						 - (class534_sub16.anInt10473
						    * -1700987663))
				 + (float) (class534_sub16.anInt10473
					    * -1700987663));
		    class534_sub16.aClass438_10476.aFloat4864 = (float) i_17_;
		    class534_sub16.aClass438_10476.aFloat4865 = (float) i_18_;
		}
		if (class534_sub16.aClass491_10494 == null) {
		    if (class534_sub16.anIntArray10479 != null
			&& ((class534_sub16.anInt10488 -= 835810559 * i_11_)
			    * 1102416639) <= 0) {
			int i_19_
			    = ((256 == class534_sub16.anInt10493 * -1536094921
				&& (class534_sub16.anInt10483 * 1762794043
				    == 256))
			       ? 256
			       : ((int) (Math.random()
					 * (double) ((-1536094921
						      * (class534_sub16
							 .anInt10493))
						     - ((class534_sub16
							 .anInt10483)
							* 1762794043)))
				  + 1762794043 * class534_sub16.anInt10483));
			int i_20_
			    = (int) (Math.random()
				     * (double) (class534_sub16
						 .anIntArray10479).length);
			int i_21_
			    = (int) ((float) (class534_sub16.anInt10472
					      * 1285097747)
				     + (float) ((class534_sub16.anInt10474
						 * 37947927)
						- (class534_sub16.anInt10472
						   * 1285097747)) * 0.5F);
			int i_22_
			    = (int) ((float) (class534_sub16.anInt10473
					      * -1700987663)
				     + (0.5F
					* (float) (-374666787 * (class534_sub16
								 .anInt10475)
						   - (-1700987663
						      * (class534_sub16
							 .anInt10473)))));
			class534_sub16.aClass438_10478.aFloat4864
			    = (float) i_21_;
			class534_sub16.aClass438_10478.aFloat4865
			    = (float) i_22_;
			class534_sub16.aClass491_10494
			    = (Class171_Sub4.aClass232_9944.method4229
			       (Class211.aClass211_2249, class534_sub16,
				class534_sub16.anIntArray10479[i_20_], 0,
				i_13_,
				Class190.aClass190_2127.method3763(636183928),
				Class207.aClass207_2236,
				(float) (-1081773949
					 * class534_sub16.anInt10491),
				(float) (class534_sub16.anInt10467 * 984135565
					 + (class534_sub16.anInt10491
					    * -1081773949)),
				class534_sub16.aClass438_10478, 0, i_19_,
				false, -1984538027));
			if (class534_sub16.aClass491_10494 != null)
			    class534_sub16.aClass491_10494
				.method8069(2135247387);
			class534_sub16.anInt10488
			    = ((-1089168257 * class534_sub16.anInt10495
				+ (int) (Math.random()
					 * (double) ((class534_sub16.anInt10496
						      * 1512108791)
						     - (-1089168257
							* (class534_sub16
							   .anInt10495)))))
			       * 835810559);
		    }
		} else {
		    int i_23_
			= (int) (0.5F * (float) ((37947927
						  * class534_sub16.anInt10474)
						 - (class534_sub16.anInt10472
						    * 1285097747))
				 + (float) (1285097747
					    * class534_sub16.anInt10472));
		    int i_24_
			= (int) ((float) (-1700987663
					  * class534_sub16.anInt10473)
				 + 0.5F * (float) ((class534_sub16.anInt10475
						    * -374666787)
						   - (class534_sub16.anInt10473
						      * -1700987663)));
		    class534_sub16.aClass438_10478.aFloat4864 = (float) i_23_;
		    class534_sub16.aClass438_10478.aFloat4865 = (float) i_24_;
		    if ((class534_sub16.aClass491_10494.method8027((byte) 2)
			 == Class480.aClass480_5253)
			|| (class534_sub16.aClass491_10494.method8027((byte) 2)
			    == Class480.aClass480_5257)) {
			Class171_Sub4.aClass232_9944.method4234
			    (class534_sub16.aClass491_10494, -975537273);
			class534_sub16.aClass491_10494 = null;
		    }
		}
	    }
	}
    }
}
