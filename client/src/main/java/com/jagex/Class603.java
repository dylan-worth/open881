/* Class603 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class603 implements Interface65
{
    int[] anIntArray7966;
    
    public static Class603 method10025(Class534_Sub40 class534_sub40) {
	int i = class534_sub40.method16527(-86970854);
	int[] is = new int[i];
	for (int i_0_ = 0; i_0_ < i; i_0_++)
	    is[i_0_] = class534_sub40.method16527(-874638648);
	return new Class603(is);
    }
    
    Class603(int[] is) {
	anIntArray7966 = is;
    }
    
    public boolean method438(Class534_Sub42 class534_sub42,
			     Interface63[] interface63s, int i,
			     Class547 class547) {
	int[] is = anIntArray7966;
	for (int i_1_ = 0; i_1_ < is.length; i_1_++) {
	    int i_2_ = is[i_1_];
	    if (!class547.method8995(i_2_, (byte) -50))
		return false;
	}
	return true;
    }
    
    public boolean method437(Class534_Sub42 class534_sub42,
			     Interface63[] interface63s, int i,
			     Class547 class547, int i_3_) {
	int[] is = anIntArray7966;
	for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
	    int i_5_ = is[i_4_];
	    if (!class547.method8995(i_5_, (byte) -37))
		return false;
	}
	return true;
    }
    
    static final void method10026(Class247 class247, Class243 class243,
				  Class669 class669, int i) {
	class247.aBool2539
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) == 1;
	Class454.method7416(class247, -556259162);
	if (-1 == class247.anInt2580 * 1365669833 && !class243.aBool2413)
	    Class475.method7767(class247.anInt2454 * -1278450723, -1936882300);
    }
    
    public static final void method10027(int i, int i_6_, int i_7_, int i_8_,
					 int i_9_, int i_10_) {
	Class652.anInt8484 = i * 1442265799;
	Class609.anInt8007 = i_6_ * -1322167097;
	Class341.anInt3554 = i_7_ * -1723648975;
	Class77.anInt820 = -1354061297 * i_8_;
	Class221.anInt2311 = 845815569 * i_9_;
	if (3 == Class10.anInt75 * -891094135)
	    Class79.method1621(-1336575600);
	if (Class221.anInt2311 * 1556001265 >= 100) {
	    int i_11_ = 256 + 986574336 * Class652.anInt8484;
	    int i_12_ = 256 + Class609.anInt8007 * 106556928;
	    int i_13_ = (Class247.method4595(i_11_, i_12_,
					     -878424575 * Class674.anInt8633,
					     -562253255)
			 - -1339841327 * Class341.anInt3554);
	    int i_14_ = i_11_ - -116109187 * Class200_Sub13.anInt9937;
	    int i_15_ = i_13_ - 1529694271 * Class677.anInt8654;
	    int i_16_ = i_12_ - Class636.anInt8305 * -1098179003;
	    int i_17_
		= (int) Math.sqrt((double) (i_16_ * i_16_ + i_14_ * i_14_));
	    Class566.anInt7589
		= ((int) (Math.atan2((double) i_15_, (double) i_17_)
			  * 2607.5945876176133)
		   & 0x3fff) * -1539495063;
	    Class641.anInt8341
		= ((int) (Math.atan2((double) i_14_, (double) i_16_)
			  * -2607.5945876176133)
		   & 0x3fff) * 486346273;
	    Class2.anInt22 = 0;
	    if (-864938791 * Class566.anInt7589 < 1024)
		Class566.anInt7589 = -189946880;
	    if (-864938791 * Class566.anInt7589 > 3072)
		Class566.anInt7589 = -569840640;
	}
	Class10.anInt75 = 1301785316;
	Class106.anInt1312 = 309821991;
	Class93.anInt901 = 1899572639;
    }
    
    public static void method10028(Class185 class185, Class472 class472,
				   int i) {
	Class169[] class169s
	    = Class178.method2939(class472, Class202.anInt2192 * 149327611, 0);
	Class510.aClass163Array5678 = new Class163[class169s.length];
	for (int i_18_ = 0; i_18_ < class169s.length; i_18_++)
	    Class510.aClass163Array5678[i_18_]
		= class185.method3279(class169s[i_18_], true);
	class169s
	    = Class178.method2939(class472, Class67.anInt718 * -1795683815, 0);
	Class530.aClass163Array7133 = new Class163[class169s.length];
	for (int i_19_ = 0; i_19_ < class169s.length; i_19_++)
	    Class530.aClass163Array7133[i_19_]
		= class185.method3279(class169s[i_19_], true);
	class169s
	    = Class178.method2939(class472, 1750510521 * Class68.anInt722, 0);
	Class19.aClass163Array209 = new Class163[class169s.length];
	int i_20_ = 25;
	for (int i_21_ = 0; i_21_ < class169s.length; i_21_++) {
	    class169s[i_21_].method2778
		(-i_20_ + (int) (Math.random() * (double) i_20_ * 2.0),
		 -i_20_ + (int) (Math.random() * (double) i_20_ * 2.0),
		 -i_20_ + (int) (Math.random() * (double) i_20_ * 2.0));
	    Class19.aClass163Array209[i_21_]
		= class185.method3279(class169s[i_21_], true);
	}
	class169s = Class178.method2939(class472,
					Class523.anInt7087 * 1069313081, 0);
	Class79.aClass163Array829 = new Class163[class169s.length];
	for (int i_22_ = 0; i_22_ < class169s.length; i_22_++)
	    Class79.aClass163Array829[i_22_]
		= class185.method3279(class169s[i_22_], true);
	class169s = Class178.method2939(class472,
					Class216.anInt2299 * -1687969609, 0);
	Class67.aClass163Array721 = new Class163[class169s.length];
	i_20_ = 12;
	for (int i_23_ = 0; i_23_ < class169s.length; i_23_++) {
	    class169s[i_23_].method2778
		(-i_20_ + (int) (Math.random() * (double) i_20_ * 2.0),
		 -i_20_ + (int) (Math.random() * (double) i_20_ * 2.0),
		 -i_20_ + (int) (Math.random() * (double) i_20_ * 2.0));
	    Class67.aClass163Array721[i_23_]
		= class185.method3279(class169s[i_23_], true);
	}
	class169s
	    = Class178.method2939(class472, 140074605 * Class67.anInt719, 0);
	Class658.aClass163Array8541 = new Class163[class169s.length];
	i_20_ = 12;
	for (int i_24_ = 0; i_24_ < class169s.length; i_24_++) {
	    class169s[i_24_].method2778
		(-i_20_ + (int) (Math.random() * (double) i_20_ * 2.0),
		 -i_20_ + (int) (Math.random() * (double) i_20_ * 2.0),
		 -i_20_ + (int) (Math.random() * (double) i_20_ * 2.0));
	    Class658.aClass163Array8541[i_24_]
		= class185.method3279(class169s[i_24_], true);
	}
	Class581_Sub1.aClass163_10593
	    = class185.method3279(Class178.method2949(class472,
						      (2006108777
						       * Class215.anInt2297),
						      0),
				  true);
	Class657.aClass163_8538
	    = class185.method3279(Class178.method2949(class472,
						      (2116470397
						       * Class610.anInt8010),
						      0),
				  true);
	class169s = Class178.method2939(class472,
					Class406.anInt4298 * 1474934323, 0);
	Class310.aClass163Array3359 = new Class163[class169s.length];
	for (int i_25_ = 0; i_25_ < class169s.length; i_25_++)
	    Class310.aClass163Array3359[i_25_]
		= class185.method3279(class169s[i_25_], true);
    }
}
