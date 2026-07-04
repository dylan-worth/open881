/* Class563 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Component;

public abstract class Class563
{
    public abstract void method9470();
    
    public abstract int method9471();
    
    public abstract boolean method9472(byte i);
    
    public abstract boolean method9473();
    
    public abstract void method9474();
    
    public boolean method9475(short i) {
	return (method9472((byte) -13) || method9501((byte) -2)
		|| method9494((byte) -45));
    }
    
    public static void method9476(int i) {
	Class175.method2925(i, 371690473);
    }
    
    public abstract int method9477(int i);
    
    public abstract Class534_Sub42 method9478(byte i);
    
    public abstract void method9479(int i);
    
    public static Class563 method9480(Component component, boolean bool) {
	return new Class563_Sub1(component, bool);
    }
    
    public abstract void method9481(int i);
    
    public static Class563 method9482(Component component, boolean bool) {
	return new Class563_Sub1(component, bool);
    }
    
    public static Class563 method9483(Component component, boolean bool) {
	return new Class563_Sub1(component, bool);
    }
    
    public abstract boolean method9484();
    
    public abstract boolean method9485();
    
    public abstract boolean method9486();
    
    public abstract boolean method9487();
    
    public abstract boolean method9488();
    
    Class563() {
	/* empty */
    }
    
    public boolean method9489() {
	return (method9472((byte) -14) || method9501((byte) -37)
		|| method9494((byte) -45));
    }
    
    public boolean method9490() {
	return (method9472((byte) -44) || method9501((byte) -4)
		|| method9494((byte) -48));
    }
    
    public boolean method9491() {
	return (method9472((byte) -123) || method9501((byte) -96)
		|| method9494((byte) -100));
    }
    
    public boolean method9492() {
	return (method9472((byte) -114) || method9501((byte) -55)
		|| method9494((byte) -107));
    }
    
    public abstract int method9493(int i);
    
    public abstract boolean method9494(byte i);
    
    public abstract int method9495();
    
    public abstract int method9496();
    
    public abstract int method9497();
    
    public abstract int method9498();
    
    public abstract int method9499();
    
    public abstract void method9500();
    
    public abstract boolean method9501(byte i);
    
    public abstract Class534_Sub42 method9502();
    
    public boolean method9503() {
	return (method9472((byte) -106) || method9501((byte) -26)
		|| method9494((byte) -114));
    }
    
    public abstract Class534_Sub42 method9504();
    
    public abstract int method9505();
    
    public abstract boolean method9506();
    
    public abstract boolean method9507();
    
    static void method9508(String string, String string_0_, String string_1_,
			   boolean bool, boolean bool_2_, int i) {
	Class100 class100 = Class201.method3864(2095398292);
	if (class100.method1867(-755433183) != null) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4178,
				      class100.aClass13_1183, 1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16507
		((Class668.method11029(string, (byte) 0)
		  + Class668.method11029(string_0_, (byte) 0)
		  + Class668.method11029(string_1_, (byte) 0) + 1),
		 1646722622);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string,
								  -581660560);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string_0_,
								  998691621);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string_1_,
								  2101675593);
	    int i_3_ = 0;
	    if (bool)
		i_3_ |= 0x1;
	    if (bool_2_)
		i_3_ |= 0x2;
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16506(i_3_,
								  1041106490);
	    class100.method1863(class534_sub19, (byte) 122);
	}
    }
    
    static final void method9509(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass57_11973
		  .method1231(1583001141) >> 3;
    }
    
    public static void method9510(int i, int i_4_, int i_5_, short i_6_) {
	Class597 class597 = client.aClass512_11100.method8416((byte) 79);
	int i_7_ = i_4_ + class597.anInt7859 * -424199969;
	int i_8_ = i_5_ + class597.anInt7861 * -1166289421;
	if (client.aClass512_11100.method8424((byte) 13) != null
	    && (client.aClass512_11100.method8412(-1358267655)
		!= Class499.aClass499_5594)
	    && i_4_ >= 0 && i_5_ >= 0
	    && i_4_ < client.aClass512_11100.method8417(777083420)
	    && i_5_ < client.aClass512_11100.method8418(-1533611049)) {
	    long l = (long) (i << 28 | i_8_ << 14 | i_7_);
	    Class534_Sub7 class534_sub7
		= (Class534_Sub7) client.aClass9_11209.method579(l);
	    if (null == class534_sub7)
		client.aClass512_11100.method8424((byte) 78)
		    .method9254(i, i_4_, i_5_, 1789933039);
	    else {
		Class534_Sub23 class534_sub23
		    = ((Class534_Sub23)
		       class534_sub7.aClass700_10418.method14135((byte) -1));
		if (class534_sub23 == null)
		    client.aClass512_11100.method8424((byte) 71)
			.method9254(i, i_4_, i_5_, 1917926644);
		else {
		    int i_9_ = -1;
		    int i_10_ = -1;
		    int i_11_ = -1;
		    Class446 class446 = null;
		    Class446 class446_12_ = null;
		    Class446 class446_13_ = null;
		    Class654_Sub1_Sub4_Sub1 class654_sub1_sub4_sub1
			= ((Class654_Sub1_Sub4_Sub1)
			   client.aClass512_11100.method8424((byte) 85)
			       .method9254(i, i_4_, i_5_, 1740634169));
		    if (class654_sub1_sub4_sub1 == null)
			class654_sub1_sub4_sub1
			    = (new Class654_Sub1_Sub4_Sub1
			       (client.aClass512_11100.method8424((byte) 51),
				i_4_ << 9,
				client.aClass512_11100.method8424
				    ((byte) 12).aClass151Array7432[i]
				    .method2491(i_4_, i_5_, 2018265664),
				i_5_ << 9, i, i));
		    else {
			i_9_ = 1392959229 * class654_sub1_sub4_sub1.anInt12141;
			i_10_ = class654_sub1_sub4_sub1.anInt12135 * 382442283;
			i_11_
			    = -866036587 * class654_sub1_sub4_sub1.anInt12139;
			class446 = class654_sub1_sub4_sub1.aClass446_12143;
			class446_12_ = class654_sub1_sub4_sub1.aClass446_12148;
			class446_13_ = class654_sub1_sub4_sub1.aClass446_12134;
			Class654_Sub1_Sub4_Sub1 class654_sub1_sub4_sub1_14_
			    = class654_sub1_sub4_sub1;
			class654_sub1_sub4_sub1.anInt12139 = 172960067;
			class654_sub1_sub4_sub1_14_.anInt12135 = -420367235;
			class654_sub1_sub4_sub1.aClass556_10855
			    = client.aClass512_11100.method8424((byte) 66);
		    }
		    class654_sub1_sub4_sub1.anInt12141
			= -639905027 * class534_sub23.anInt10548;
		    class654_sub1_sub4_sub1.anInt12136
			= -2062721087 * class534_sub23.anInt10547;
		while_57_:
		    do {
			Class534_Sub23 class534_sub23_15_;
			do {
			    class534_sub23_15_
				= ((Class534_Sub23)
				   class534_sub7.aClass700_10418
				       .method14139(1972847077));
			    if (null == class534_sub23_15_)
				break while_57_;
			} while (class534_sub23_15_.anInt10548 * -400233975
				 == (1392959229
				     * class654_sub1_sub4_sub1.anInt12141));
			class654_sub1_sub4_sub1.anInt12135
			    = 1223845275 * class534_sub23_15_.anInt10548;
			class654_sub1_sub4_sub1.anInt12138
			    = class534_sub23_15_.anInt10547 * -1513271133;
			for (;;) {
			    Class534_Sub23 class534_sub23_16_
				= ((Class534_Sub23)
				   class534_sub7.aClass700_10418
				       .method14139(797363935));
			    if (class534_sub23_16_ == null)
				break;
			    if (((class654_sub1_sub4_sub1.anInt12141
				  * 1392959229)
				 != class534_sub23_16_.anInt10548 * -400233975)
				&& (class534_sub23_16_.anInt10548 * -400233975
				    != 382442283 * (class654_sub1_sub4_sub1
						    .anInt12135))) {
				class654_sub1_sub4_sub1.anInt12139
				    = (-1038856539
				       * class534_sub23_16_.anInt10548);
				class654_sub1_sub4_sub1.anInt12140
				    = (class534_sub23_16_.anInt10547
				       * -404094617);
			    }
			}
		    } while (false);
		    int i_17_
			= Class247.method4595((i_4_ << 9) + 256,
					      256 + (i_5_ << 9), i, 271681585);
		    class654_sub1_sub4_sub1.method10815((float) (i_4_ << 9),
							(float) i_17_,
							(float) (i_5_ << 9));
		    if (1392959229 * class654_sub1_sub4_sub1.anInt12141
			!= i_9_) {
			if (i_10_
			    == class654_sub1_sub4_sub1.anInt12141 * 1392959229)
			    class654_sub1_sub4_sub1.aClass446_12143
				= class446_12_;
			else if ((class654_sub1_sub4_sub1.anInt12141
				  * 1392959229)
				 == i_11_)
			    class654_sub1_sub4_sub1.aClass446_12143
				= class446_13_;
			else if (((Class15)
				  (Class531.aClass44_Sub7_7135.method91
				   ((1392959229
				     * class654_sub1_sub4_sub1.anInt12141),
				    -1389109246)))
				 .aBool183)
			    class654_sub1_sub4_sub1.aClass446_12143
				= Class30.method886(-735741956);
			else
			    class654_sub1_sub4_sub1.aClass446_12143 = null;
		    }
		    if (-1 == class654_sub1_sub4_sub1.anInt12135 * 382442283)
			class654_sub1_sub4_sub1.aClass446_12148 = null;
		    else if (i_10_ != (class654_sub1_sub4_sub1.anInt12135
				       * 382442283)) {
			if (class654_sub1_sub4_sub1.anInt12135 * 382442283
			    == i_9_)
			    class654_sub1_sub4_sub1.aClass446_12148 = class446;
			else if (class654_sub1_sub4_sub1.anInt12135 * 382442283
				 == i_11_)
			    class654_sub1_sub4_sub1.aClass446_12148
				= class446_13_;
			else if (((Class15)
				  (Class531.aClass44_Sub7_7135.method91
				   ((382442283
				     * class654_sub1_sub4_sub1.anInt12135),
				    -500425108)))
				 .aBool183)
			    class654_sub1_sub4_sub1.aClass446_12148
				= Class30.method886(-531787762);
			else
			    class654_sub1_sub4_sub1.aClass446_12148 = null;
		    }
		    if (class654_sub1_sub4_sub1.anInt12139 * -866036587 == -1)
			class654_sub1_sub4_sub1.aClass446_12134 = null;
		    else if (i_11_ != (class654_sub1_sub4_sub1.anInt12139
				       * -866036587)) {
			if (-866036587 * class654_sub1_sub4_sub1.anInt12139
			    == i_9_)
			    class654_sub1_sub4_sub1.aClass446_12134 = class446;
			else if (i_10_ == (class654_sub1_sub4_sub1.anInt12139
					   * -866036587))
			    class654_sub1_sub4_sub1.aClass446_12134
				= class446_12_;
			else if (((Class15)
				  (Class531.aClass44_Sub7_7135.method91
				   ((class654_sub1_sub4_sub1.anInt12139
				     * -866036587),
				    -455285948)))
				 .aBool183)
			    class654_sub1_sub4_sub1.aClass446_12134
				= Class30.method886(106173419);
			else
			    class654_sub1_sub4_sub1.aClass446_12134 = null;
		    }
		    class654_sub1_sub4_sub1.anInt12144 = 0;
		    class654_sub1_sub4_sub1.aByte10854 = (byte) i;
		    class654_sub1_sub4_sub1.aByte10853 = (byte) i;
		    if (client.aClass512_11100.method8552((byte) 0)
			    .method7612(i_4_, i_5_, (byte) 0))
			class654_sub1_sub4_sub1.aByte10853++;
		    client.aClass512_11100.method8424((byte) 90).method9243
			(i, i_4_, i_5_, i_17_, class654_sub1_sub4_sub1,
			 -299568007);
		}
	    }
	}
    }
    
    static final void method9511(Class669 class669, int i) {
	class669.anInt8600 -= 308999563;
    }
    
    public static String method9512(byte[] is, byte i) {
	return Class376.method6418(is, 0, is.length, -1735815017);
    }
    
    public static final void method9513(int i) {
	Class498.aClass502_5556.method8281(-2135279753);
	for (int i_18_ = 0; i_18_ < 32; i_18_++)
	    Class498.aLongArray5558[i_18_] = 0L;
	for (int i_19_ = 0; i_19_ < 32; i_19_++)
	    Class498.aLongArray5572[i_19_] = 0L;
	Class498.anInt5571 = 0;
    }
}
