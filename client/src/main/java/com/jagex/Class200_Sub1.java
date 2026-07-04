/* Class200_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class200_Sub1 extends Class200
{
    int anInt9877;
    int anInt9878;
    int anInt9879;
    int anInt9880;
    int anInt9881;
    
    public void method3845(int i) {
	Class179.method2975(anInt9881 * -987187147, anInt9879 * 387515333,
			    1901389299 * anInt9880, 100, 100, false,
			    -1321752672);
	Class347_Sub3.method15868(anInt9877 * 492284687,
				  anInt9878 * -2106967015, 0, 1419387123);
	client.aBool11109 = true;
    }
    
    public void method3846() {
	Class179.method2975(anInt9881 * -987187147, anInt9879 * 387515333,
			    1901389299 * anInt9880, 100, 100, false,
			    424095215);
	Class347_Sub3.method15868(anInt9877 * 492284687,
				  anInt9878 * -2106967015, 0, 1935629724);
	client.aBool11109 = true;
    }
    
    Class200_Sub1(Class534_Sub40 class534_sub40) {
	super(class534_sub40);
	anInt9881 = class534_sub40.method16529((byte) 1) * -735127011;
	anInt9880 = class534_sub40.method16529((byte) 1) * 1506818875;
	anInt9879 = class534_sub40.method16529((byte) 1) * 1063879437;
	anInt9877 = class534_sub40.method16529((byte) 1) * -34085905;
	anInt9878 = class534_sub40.method16529((byte) 1) * 1751867433;
    }
    
    public void method3847() {
	Class179.method2975(anInt9881 * -987187147, anInt9879 * 387515333,
			    1901389299 * anInt9880, 100, 100, false,
			    739745382);
	Class347_Sub3.method15868(anInt9877 * 492284687,
				  anInt9878 * -2106967015, 0, 431379268);
	client.aBool11109 = true;
    }
    
    static void method15566(Class669 class669, short i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	TwitchWebcamDevice twitchwebcamdevice
	    = Class562.method9468(i_0_, 168606963);
	if (twitchwebcamdevice == null)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= twitchwebcamdevice.method1795();
    }
    
    public static int[] method15567(int i, int i_1_, int i_2_, int i_3_,
				    int i_4_, float f, boolean bool,
				    int i_5_) {
	int[] is = new int[i];
	Class534_Sub27_Sub1 class534_sub27_sub1 = new Class534_Sub27_Sub1();
	class534_sub27_sub1.anInt11786 = i_1_ * -334914933;
	class534_sub27_sub1.aBool11778 = bool;
	class534_sub27_sub1.anInt11791 = i_2_ * -855596815;
	class534_sub27_sub1.anInt11787 = i_3_ * 477403563;
	class534_sub27_sub1.anInt11789 = i_4_ * 1909898403;
	class534_sub27_sub1.anInt11790 = -1869573391 * (int) (f * 4096.0F);
	class534_sub27_sub1.method18322(2120252853);
	Class35.method928(i, 1, (byte) -26);
	class534_sub27_sub1.method18320(0, is, 2007067714);
	return is;
    }
}
