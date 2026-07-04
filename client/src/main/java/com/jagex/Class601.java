/* Class601 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public abstract class Class601
{
    boolean aBool7877;
    Class203 aClass203_7878 = new Class203(500);
    Class203 aClass203_7879 = new Class203(30);
    int anInt7880;
    Class7 aClass7_7881;
    String[] aStringArray7882;
    Class187[] aClass187Array7883;
    Class203 aClass203_7884 = new Class203(50);
    
    void method9951(int i) {
	anInt7880 = i * -1042593501;
	synchronized (aClass203_7878) {
	    aClass203_7878.method3877(740296438);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3877(1766975021);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3877(-1247310643);
	}
    }
    
    void method9952() {
	synchronized (aClass203_7878) {
	    aClass203_7878.method3877(-1122335675);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3877(1629225018);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3877(1441524942);
	}
	aClass187Array7883 = new Class187[4];
	aClass7_7881 = new Class7(null, null);
    }
    
    abstract byte[] method9953(int i);
    
    void method9954(int i, int i_0_) {
	anInt7880 = i * -1042593501;
	synchronized (aClass203_7878) {
	    aClass203_7878.method3877(1785307239);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3877(-953017582);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3877(-1277236206);
	}
    }
    
    void method9955(boolean bool, byte i) {
	if (aBool7877 != bool) {
	    aBool7877 = bool;
	    method9968((byte) 124);
	}
    }
    
    void method9956(int i) {
	synchronized (aClass203_7878) {
	    aClass203_7878.method3884((byte) -2);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3884((byte) -127);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3884((byte) -17);
	}
    }
    
    Class601(boolean bool, Class672 class672, Class675 class675) {
	aClass187Array7883 = new Class187[4];
	aClass7_7881 = new Class7(null, null);
	aBool7877 = bool;
	if (class675 == Class675.aClass675_8634)
	    aStringArray7882
		= new String[] { null, null, null, null, null,
				 Class58.aClass58_589.method1245(class672,
								 (byte) -77) };
	else
	    aStringArray7882
		= new String[] { null, null, null, null, null, null };
    }
    
    abstract byte[] method9957(int i, int i_1_);
    
    abstract boolean method9958(int i, int i_2_);
    
    abstract byte[] method9959(int i);
    
    void method9960(int i) {
	anInt7880 = i * -1042593501;
	synchronized (aClass203_7878) {
	    aClass203_7878.method3877(-998648906);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3877(-771449019);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3877(1831175986);
	}
    }
    
    abstract boolean method9961(int i);
    
    abstract boolean method9962(int i);
    
    void method9963(boolean bool) {
	if (aBool7877 != bool) {
	    aBool7877 = bool;
	    method9968((byte) 112);
	}
    }
    
    void method9964(boolean bool) {
	if (aBool7877 != bool) {
	    aBool7877 = bool;
	    method9968((byte) 23);
	}
    }
    
    void method9965(int i, byte i_3_) {
	synchronized (aClass203_7878) {
	    aClass203_7878.method3876(i, (byte) 0);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3876(i, (byte) 0);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3876(i, (byte) 0);
	}
    }
    
    abstract byte[] method9966(int i);
    
    void method9967() {
	synchronized (aClass203_7878) {
	    aClass203_7878.method3877(-151203751);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3877(1127866636);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3877(-679836408);
	}
	aClass187Array7883 = new Class187[4];
	aClass7_7881 = new Class7(null, null);
    }
    
    void method9968(byte i) {
	synchronized (aClass203_7878) {
	    aClass203_7878.method3877(581610089);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3877(199557236);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3877(-49893969);
	}
	aClass187Array7883 = new Class187[4];
	aClass7_7881 = new Class7(null, null);
    }
    
    void method9969(int i) {
	synchronized (aClass203_7878) {
	    aClass203_7878.method3876(i, (byte) 0);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3876(i, (byte) 0);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3876(i, (byte) 0);
	}
    }
    
    void method9970(int i) {
	synchronized (aClass203_7878) {
	    aClass203_7878.method3876(i, (byte) 0);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3876(i, (byte) 0);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3876(i, (byte) 0);
	}
    }
    
    void method9971() {
	synchronized (aClass203_7878) {
	    aClass203_7878.method3884((byte) -58);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3884((byte) -115);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3884((byte) -77);
	}
    }
    
    void method9972() {
	synchronized (aClass203_7878) {
	    aClass203_7878.method3884((byte) -32);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3884((byte) -9);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3884((byte) -64);
	}
    }
    
    void method9973() {
	synchronized (aClass203_7878) {
	    aClass203_7878.method3884((byte) -75);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3884((byte) -5);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3884((byte) -25);
	}
    }
    
    void method9974() {
	synchronized (aClass203_7878) {
	    aClass203_7878.method3884((byte) -57);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3884((byte) -122);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3884((byte) -117);
	}
    }
    
    void method9975() {
	synchronized (aClass203_7878) {
	    aClass203_7878.method3884((byte) -121);
	}
	synchronized (aClass203_7879) {
	    aClass203_7879.method3884((byte) -102);
	}
	synchronized (aClass203_7884) {
	    aClass203_7884.method3884((byte) -127);
	}
    }
    
    static final void method9976(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	class247.anInt2476
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * 1984743031;
    }
    
    static final void method9977(Class669 class669, int i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763,
	     (class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]) == 1 ? 1 : 0,
	     1858364918);
	Class672.method11096((byte) 1);
	Class635.method10538(-1394264233);
	Class177.method2934((short) 7325);
	client.aBool11048 = false;
    }
    
    static final void method9978(int i) {
	if (828996383 * client.anInt11231 > 1) {
	    client.anInt11231 -= 1961509087;
	    client.anInt11272 = client.anInt11095 * 1022906699;
	}
	if (client.aClass100_11264.aBool1198) {
	    client.aClass100_11264.aBool1198 = false;
	    Class515.method8589(-1663178506);
	} else {
	    if (!Class72.aBool758)
		Class710.method14323((byte) -104);
	    for (int i_4_ = 0;
		 (i_4_ < 100
		  && Class312.method5682(client.aClass100_11264, 932370079));
		 i_4_++) {
		/* empty */
	    }
	    if (client.anInt11039 * -1850530127 == 16) {
		while (Class224.method4166(-95607927)) {
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4175,
					      (client.aClass100_11264
					       .aClass13_1183),
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16506(0, 1509706311);
		    int i_5_
			= (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			   * 31645619);
		    Class28.method863((class534_sub19
				       .aClass534_Sub40_Sub1_10513),
				      -2061967810);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16528
			((class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			  * 31645619) - i_5_,
			 2124676672);
		    client.aClass100_11264.method1863(class534_sub19,
						      (byte) 71);
		}
		if (null != Class52.aClass641_436) {
		    if (-685874327 * Class52.aClass641_436.anInt8338 != -1) {
			Class534_Sub19 class534_sub19
			    = Class346.method6128(Class404.aClass404_4243,
						  (client.aClass100_11264
						   .aClass13_1183),
						  1341391005);
			if (Class221.aGarbageCollectorMXBean2312 == null
			    || !Class221.aGarbageCollectorMXBean2312
				    .isValid()) {
			    try {
				Iterator iterator
				    = ManagementFactory
					  .getGarbageCollectorMXBeans
					  ().iterator();
				while (iterator.hasNext()) {
				    GarbageCollectorMXBean garbagecollectormxbean
					= ((GarbageCollectorMXBean)
					   iterator.next());
				    if (garbagecollectormxbean.isValid()) {
					Class221.aGarbageCollectorMXBean2312
					    = garbagecollectormxbean;
					client.aLong11335
					    = 6107917562769597983L;
					client.aLong11064
					    = -3354138972766353955L;
				    }
				}
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
			long l = Class250.method4604((byte) -51);
			int i_6_ = -1;
			if (null != Class221.aGarbageCollectorMXBean2312) {
			    long l_7_ = Class221
					    .aGarbageCollectorMXBean2312
					    .getCollectionTime();
			    if (-1L
				!= 4770708281855264139L * client.aLong11064) {
				long l_8_ = l_7_ - (4770708281855264139L
						    * client.aLong11064);
				long l_9_ = l - (6944980406262721057L
						 * client.aLong11335);
				if (l_9_ != 0L)
				    i_6_ = (int) (100L * l_8_ / l_9_);
			    }
			    client.aLong11064 = 3354138972766353955L * l_7_;
			    client.aLong11335 = l * -6107917562769597983L;
			}
			class534_sub19.aClass534_Sub40_Sub1_10513.method16507
			    (Class52.aClass641_436.anInt8338 * -685874327,
			     1741056273);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16506
			    (client.anInt5554 * 1720947399, 1840631216);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16635(i_6_, 1982400496);
			client.aClass100_11264.method1863(class534_sub19,
							  (byte) 61);
			Class52.aClass641_436 = null;
			Class36.aLong288
			    = (30000L + l) * -5729686803417231457L;
		    }
		} else if (Class250.method4604((byte) -91)
			   >= 4786918271021927519L * Class36.aLong288)
		    Class52.aClass641_436
			= client.aClass648_11259.method10695((Class685
							      .aClass23_8698
							      .aString223),
							     -1662796525);
		Class347.method6156(1102588021);
		Class539.method8928(1455000046);
		Class534_Sub42 class534_sub42
		    = ((Class534_Sub42)
		       client.aClass700_11063.method14135((byte) -1));
		if (client.aClass512_11100.method8424((byte) 85) != null) {
		    if (-891094135 * Class10.anInt75 == 4)
			Class488.method8000(1867973715);
		    else if (1 == -891094135 * Class10.anInt75)
			Class84.method1670(669596691);
		}
		if (client.aBool11143)
		    client.aBool11143 = false;
		else
		    client.aFloat11330 /= 2.0F;
		if (client.aBool11132)
		    client.aBool11132 = false;
		else
		    client.aFloat11141 /= 2.0F;
		if (Class242.method4471((byte) -36))
		    Class294.method5318((short) 273);
		else if (-891094135 * Class10.anInt75 == 3) {
		    Class597 class597
			= client.aClass512_11100.method8416((byte) 36);
		    int i_10_ = class597.anInt7859 * -424199969 << 9;
		    int i_11_ = -1166289421 * class597.anInt7861 << 9;
		    if (-6411718903421479171L * Class1.aLong18 <= 0L)
			Class1.aLong18 = (Class250.method4604((byte) -101)
					  * 3164301961959929429L);
		    float f
			= (float) (Class250.method4604((byte) -28)
				   - -6411718903421479171L * Class1.aLong18);
		    int i_12_ = 1000 / Class469.method7641((byte) -7);
		    i_12_ *= 1.25;
		    for (/**/; f > 0.0F; f -= (float) i_12_) {
			float f_13_ = Math.min(f, (float) i_12_);
			Class599.aClass298_Sub1_7871.method5351
			    (f_13_ / 1000.0F,
			     (client.aClass512_11100.method8493(1630304710)
			      .anIntArrayArrayArray4995),
			     client.aClass512_11100.method8552((byte) 0),
			     i_10_, i_11_, 973793312);
		    }
		    Class1.aLong18 = (Class250.method4604((byte) -5)
				      * 3164301961959929429L);
		}
		Class101.method1899(923558304);
		if (16 == -1850530127 * client.anInt11039) {
		    client.aClass512_11100.method8501((byte) -30)
			.method10141(client.aClass512_11100, (byte) 89);
		    Class487.method7993(-1401414453);
		    if (-26534341 * client.anInt11061 > 10)
			client.aClass100_11264.anInt1189 += -1366296397;
		    if (-645171589 * client.aClass100_11264.anInt1189 > 2250)
			Class515.method8589(-1663178506);
		    else {
			if (1 == client.anInt11155 * -1468443459) {
			    Class570.method9624(16711680);
			    Class523.method8729(402194504);
			} else if (Class200_Sub16.aClass628_9965
				       .anInterface65_8176.method437
				   (class534_sub42,
				    client.anInterface63Array11070,
				    -2064179505 * client.anInt11199,
				    Class666.aClass547_8577, -1541233308))
			    Class118.method2128(false, 1685935485);
			else {
			    if (2 == client.anInt11155 * -1468443459
				&& Class208.method3946((-1450626137
							* client.anInt11023),
						       (byte) 77)) {
				client.aClass512_11100.method8442
				    (new Class511(Class499.aClass499_5594,
						  null),
				     -869871964);
				client.anInt11155 = 0;
			    }
			    if (0 == -1468443459 * client.anInt11155
				&& client.anInt11039 * -1850530127 != 3) {
				Class201.aClass9_2180.method578((byte) 47);
				client.anInt11155 = -431303745;
				client.anInt11110
				    = client.anInt11101 * -1319341991;
				client.anInt11174 = 0;
				client.aBool11109 = false;
				Class42.method1066((byte) 8);
			    }
			    if (client.anInt11155 * -1468443459 == 3) {
				int i_14_ = (client.anInt11101
					     - -331622423 * client.anInt11110);
				if (-84392281 * client.anInt11174
				    < Class700.aClass200Array8807.length) {
				    do {
					Class200 class200
					    = (Class700.aClass200Array8807
					       [(-84392281
						 * client.anInt11174)]);
					if (-514943895 * class200.anInt2177
					    > i_14_)
					    break;
					class200.method3845(2088438307);
				    } while ((client.anInt11155 * -1468443459
					      == 3)
					     && ((client.anInt11174
						  += -2120417001) * -84392281
						 < (Class700
						    .aClass200Array8807).length));
				}
				if (3 == -1468443459 * client.anInt11155) {
				    for (int i_15_ = 0;
					 (i_15_
					  < Class65.aClass192Array712.length);
					 i_15_++) {
					Class192 class192
					    = Class65.aClass192Array712[i_15_];
					if (class192.aBool2142) {
					    Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1
						= class192
						      .method3775(2088438307);
					    Class40.method1034
						(class654_sub1_sub5_sub1, true,
						 -1137192580);
					}
				    }
				}
			    }
			}
			Class78.method1618(-1142513453);
			Class570.method9625((short) 7646);
			Class666.method11021((byte) 0);
			Class98.method1837(false, -1515652202);
			Class299.method5516(Class254.aClass185_2683,
					    Class656.aClass177_8524,
					    1282718918);
			client.anInt11111 += -1605310983;
			if (-1370432497 * client.anInt11265 != 0) {
			    client.anInt11188 += -1641068;
			    if (client.anInt11188 * 2143149601 >= 400)
				client.anInt11265 = 0;
			}
			if (null != Class236.aClass247_2372) {
			    client.anInt11084 += 1850677971;
			    if (602951003 * client.anInt11084 >= 15) {
				Class454.method7416(Class236.aClass247_2372,
						    -1434865635);
				Class236.aClass247_2372 = null;
			    }
			}
			client.aClass247_11283 = null;
			client.aBool11244 = false;
			client.aBool11103 = false;
			Class237.aClass247_2377 = null;
			Class213.method4024(null, -1, -1, -1926531653);
			if (!client.aBool11218)
			    client.anInt11215 = 411567433;
			Class80.method1628(911215682);
			client.anInt11095 += 1608039949;
			if (client.aBool11250) {
			    Class534_Sub19 class534_sub19
				= Class346.method6128(Class404.aClass404_4218,
						      (client.aClass100_11264
						       .aClass13_1183),
						      1341391005);
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16578
				((Class669.anInt8616 * -68858417 << 28
				  | Class509.anInt5676 * -1653134817 << 14
				  | -63531439 * Class595.anInt7854),
				 199256436);
			    client.aClass100_11264.method1863(class534_sub19,
							      (byte) 28);
			    client.aBool11250 = false;
			}
			for (;;) {
			    Class534_Sub41 class534_sub41
				= ((Class534_Sub41)
				   client.aClass700_11277
				       .method14132((byte) -28));
			    if (class534_sub41 == null)
				break;
			    Class247 class247 = class534_sub41.aClass247_10818;
			    if (class247.anInt2580 * 1365669833 >= 0) {
				Class247 class247_16_
				    = Class112.method2017((class247.anInt2472
							   * -742015869),
							  1132085597);
				if (null == class247_16_
				    || null == class247_16_.aClass247Array2620
				    || (class247.anInt2580 * 1365669833
					>= (class247_16_
					    .aClass247Array2620).length)
				    || ((class247_16_.aClass247Array2620
					 [class247.anInt2580 * 1365669833])
					!= class247))
				    continue;
			    }
			    Class94.method1764(class534_sub41, 803015308);
			}
			for (;;) {
			    Class534_Sub41 class534_sub41
				= ((Class534_Sub41)
				   client.aClass700_11278
				       .method14132((byte) -86));
			    if (null == class534_sub41)
				break;
			    Class247 class247 = class534_sub41.aClass247_10818;
			    if (class247.anInt2580 * 1365669833 >= 0) {
				Class247 class247_17_
				    = Class112.method2017((-742015869
							   * (class247
							      .anInt2472)),
							  1918765175);
				if (class247_17_ == null
				    || class247_17_.aClass247Array2620 == null
				    || (1365669833 * class247.anInt2580
					>= (class247_17_
					    .aClass247Array2620).length)
				    || ((class247_17_.aClass247Array2620
					 [1365669833 * class247.anInt2580])
					!= class247))
				    continue;
			    }
			    Class94.method1764(class534_sub41, -695037348);
			}
			for (;;) {
			    Class534_Sub41 class534_sub41
				= ((Class534_Sub41)
				   client.aClass700_11351
				       .method14132((byte) -89));
			    if (null == class534_sub41)
				break;
			    Class247 class247 = class534_sub41.aClass247_10818;
			    if (class247.anInt2580 * 1365669833 >= 0) {
				Class247 class247_18_
				    = Class112.method2017((-742015869
							   * (class247
							      .anInt2472)),
							  1921918489);
				if (null == class247_18_
				    || null == class247_18_.aClass247Array2620
				    || (1365669833 * class247.anInt2580
					>= (class247_18_
					    .aClass247Array2620).length)
				    || class247 != (class247_18_
						    .aClass247Array2620
						    [(class247.anInt2580
						      * 1365669833)]))
				    continue;
			    }
			    Class94.method1764(class534_sub41, -621981979);
			}
			if (Class237.aClass247_2377 == null)
			    client.anInt11248 = 0;
			if (null != client.aClass247_11044)
			    Class117.method2126((byte) -61);
			Class146.method2451(-616216678);
			if (client.anInt11194 * 365872613 > 0
			    && Class666.aClass547_8577.method8995(82,
								  (byte) -69)
			    && Class666.aClass547_8577.method8995(81,
								  (byte) -8)
			    && 0 != client.anInt11193 * -1756158727) {
			    int i_19_
				= ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				    .aByte10854)
				   - client.anInt11193 * -1756158727);
			    if (i_19_ < 0)
				i_19_ = 0;
			    else if (i_19_ > 3)
				i_19_ = 3;
			    Class597 class597 = client.aClass512_11100
						    .method8416((byte) 127);
			    Class534_Sub18_Sub2.method17849
				(i_19_,
				 (class597.anInt7859 * -424199969
				  + (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .anIntArray11977[0])),
				 (class597.anInt7861 * -1166289421
				  + (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .anIntArray11978[0])),
				 -1746073522);
			}
			for (int i_20_ = 0; i_20_ < 5; i_20_++)
			    client.anIntArray11099[i_20_]++;
			if (Class77.aClass155_Sub1_819.aBool9763
			    && ((6499740373556870249L
				 * Class77.aClass155_Sub1_819.aLong9765)
				< Class250.method4604((byte) -124) - 60000L))
			    Class568.method9574(-1783993581);
			Class77.aClass155_Sub1_819.method15468((byte) -81);
			for (Class536_Sub4 class536_sub4
				 = (Class536_Sub4) client.aClass709_11355
						       .method14301(764908544);
			     class536_sub4 != null;
			     class536_sub4 = ((Class536_Sub4)
					      client.aClass709_11355
						  .method14282(-448422611))) {
			    if ((long) (class536_sub4.anInt10364 * 110810603)
				< (Class250.method4604((byte) -33) / 1000L
				   - 5L)) {
				if (class536_sub4.aShort10363 > 0)
				    Class272.method5067
					(5, 0, "", "", "",
					 new StringBuilder().append
					     (class536_sub4.aString10365)
					     .append
					     (Class58.aClass58_585.method1245
					      (Class539.aClass672_7171,
					       (byte) -124))
					     .toString(),
					 null, (byte) 5);
				if (0 == class536_sub4.aShort10363)
				    Class272.method5067
					(5, 0, "", "", "",
					 new StringBuilder().append
					     (class536_sub4.aString10365)
					     .append
					     (Class58.aClass58_586.method1245
					      (Class539.aClass672_7171,
					       (byte) -15))
					     .toString(),
					 null, (byte) 5);
				class536_sub4.method8900(-442046619);
			    }
			}
			client.anInt11129 += 4693499;
			if (-1172380365 * client.anInt11129 > 504) {
			    client.anInt11129 = 0;
			    int i_21_ = (int) (Math.random() * 8.0);
			    if (1 == (i_21_ & 0x1))
				client.anInt11042
				    += -756382189 * client.anInt11124;
			    if ((i_21_ & 0x2) == 2)
				client.anInt11125
				    += client.anInt11294 * 1549362745;
			    if ((i_21_ & 0x4) == 4)
				client.anInt11127
				    += 1571117379 * client.anInt11128;
			}
			if (client.anInt11042 * 268721155 < -50)
			    client.anInt11124 = 1636519954;
			if (268721155 * client.anInt11042 > 56)
			    client.anInt11124 = -1636519954;
			if (674672233 * client.anInt11125 < -60)
			    client.anInt11294 = -2061995710;
			if (674672233 * client.anInt11125 > 55)
			    client.anInt11294 = 2061995710;
			if (client.anInt11127 * -61292849 < -41)
			    client.anInt11128 = 705495205;
			if (client.anInt11127 * -61292849 > 41)
			    client.anInt11128 = -705495205;
			client.anInt11134 += 1326257767;
			if (client.anInt11134 * -1881430697 > 500) {
			    client.anInt11134 = 0;
			    int i_22_ = (int) (Math.random() * 8.0);
			    if (1 == (i_22_ & 0x1))
				client.anInt11189
				    += client.anInt11301 * -1997571067;
			    if (2 == (i_22_ & 0x2))
				client.anInt11022
				    += 511380917 * client.anInt11133;
			}
			if (client.anInt11189 * -2045337339 < -65)
			    client.anInt11301 = 1694266962;
			if (-2045337339 * client.anInt11189 > 68)
			    client.anInt11301 = -1694266962;
			if (-2002513841 * client.anInt11022 < -22)
			    client.anInt11133 = 1517969747;
			if (client.anInt11022 * -2002513841 > 12)
			    client.anInt11133 = -1517969747;
			client.aClass100_11264.anInt1187 += -286235183;
			if (-351399119 * client.aClass100_11264.anInt1187
			    > 50) {
			    Class534_Sub19 class534_sub19
				= Class346.method6128(Class404.aClass404_4275,
						      (client.aClass100_11264
						       .aClass13_1183),
						      1341391005);
			    client.aClass100_11264.method1863(class534_sub19,
							      (byte) 33);
			}
			if (client.aBool11098) {
			    Class630.method10433(-1159739909);
			    client.aBool11098 = false;
			}
			try {
			    client.aClass100_11264.method1868(1805858475);
			} catch (IOException ioexception) {
			    Class515.method8589(-1663178506);
			}
		    }
		}
	    }
	}
    }
}
