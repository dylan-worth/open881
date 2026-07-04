/* Class644 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class644
{
    static Class644 aClass644_8348;
    public static Class644 aClass644_8349;
    public static Class644 aClass644_8350;
    public static Class644 aClass644_8351;
    public static Class644 aClass644_8352;
    public static Class644 aClass644_8353 = new Class644(1);
    public int anInt8354;
    public static Class644 aClass644_8355;
    static Class644 aClass644_8356;
    static Class644 aClass644_8357;
    static Class644 aClass644_8358;
    public static Class644 aClass644_8359;
    public static Class644 aClass644_8360;
    static Class644 aClass644_8361;
    static Class644 aClass644_8362;
    static Class644 aClass644_8363;
    static Class644 aClass644_8364;
    static Class644 aClass644_8365;
    static Class644 aClass644_8366;
    static Class644 aClass644_8367;
    static Class644 aClass644_8368;
    static Class644 aClass644_8369;
    static Class644 aClass644_8370;
    static Class644 aClass644_8371;
    static Class644 aClass644_8372;
    static Class644 aClass644_8373;
    
    static {
	aClass644_8349 = new Class644(2);
	aClass644_8350 = new Class644(4);
	aClass644_8351 = new Class644(8);
	aClass644_8352 = new Class644(16);
	aClass644_8360 = new Class644(32);
	aClass644_8359 = new Class644(64);
	aClass644_8355 = new Class644(128);
	aClass644_8356 = new Class644(256);
	aClass644_8357 = new Class644(512);
	aClass644_8369 = new Class644(1024);
	aClass644_8366 = new Class644(2048);
	aClass644_8372 = new Class644(4096);
	aClass644_8361 = new Class644(8192);
	aClass644_8373 = new Class644(16384);
	aClass644_8363 = new Class644(32768);
	aClass644_8364 = new Class644(65536);
	aClass644_8365 = new Class644(131072);
	aClass644_8371 = new Class644(262144);
	aClass644_8367 = new Class644(524288);
	aClass644_8348 = new Class644(1048576);
	aClass644_8368 = new Class644(2097152);
	aClass644_8370 = new Class644(4194304);
	aClass644_8358 = new Class644(8388608);
	aClass644_8362 = new Class644(16777216);
    }
    
    Class644(int i) {
	anInt8354 = 1955350893 * i;
    }
    
    public static Class6[] method10680(Class14 class14, int i) {
	int[] is = class14.method652(2088438307);
	Class6[] class6s = new Class6[is.length >> 2];
	for (int i_0_ = 0; i_0_ < class6s.length; i_0_++) {
	    Class6 class6 = new Class6();
	    class6s[i_0_] = class6;
	    class6.anInt52 = is[i_0_ << 2] * 1773936893;
	    class6.anInt53 = 1510603849 * is[(i_0_ << 2) + 1];
	    class6.anInt54 = is[2 + (i_0_ << 2)] * 1739643887;
	    class6.anInt55 = 791594069 * is[3 + (i_0_ << 2)];
	}
	return class6s;
    }
    
    public static int method10681(int i, int i_1_, int i_2_, byte i_3_) {
	i_2_ &= 0x3;
	if (0 == i_2_)
	    return i;
	if (i_2_ == 1)
	    return i_1_;
	if (2 == i_2_)
	    return 7 - i;
	return 7 - i_1_;
    }
}
