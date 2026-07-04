/* Class413 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class413
{
    static Class413 aClass413_4644;
    public static Class413 aClass413_4645;
    public static Class413 aClass413_4646;
    public static Class413 aClass413_4647;
    public int anInt4648;
    public static Class413 aClass413_4649;
    static Class413 aClass413_4650;
    static Class413 aClass413_4651;
    public static Class413 aClass413_4652;
    public static Class413 aClass413_4653;
    public static Class413 aClass413_4654 = new Class413(14, 0);
    static Class413 aClass413_4655;
    public static Class413 aClass413_4656;
    static Class413[] aClass413Array4657;
    
    Class413(int i, int i_0_) {
	anInt4648 = i * -967005085;
    }
    
    static {
	aClass413_4645 = new Class413(15, -1);
	aClass413_4646 = new Class413(16, -2);
	aClass413_4647 = new Class413(19, -2);
	aClass413_4651 = new Class413(23, 4);
	aClass413_4644 = new Class413(24, -1);
	aClass413_4649 = new Class413(26, 0);
	aClass413_4650 = new Class413(27, 0);
	aClass413_4652 = new Class413(28, -2);
	aClass413_4653 = new Class413(29, -2);
	aClass413_4656 = new Class413(30, -2);
	aClass413_4655 = new Class413(31, 4);
	aClass413Array4657 = new Class413[32];
	Class413[] class413s = Class98.method1833(1451677421);
	for (int i = 0; i < class413s.length; i++)
	    aClass413Array4657[-100453045 * class413s[i].anInt4648]
		= class413s[i];
    }
    
    static Class413[] method6731() {
	return (new Class413[]
		{ aClass413_4650, aClass413_4651, aClass413_4647,
		  aClass413_4652, aClass413_4646, aClass413_4649,
		  aClass413_4656, aClass413_4653, aClass413_4655,
		  aClass413_4654, aClass413_4645, aClass413_4644 });
    }
    
    public static int method6732(int i, int i_1_, int i_2_, byte i_3_) {
	i_2_ &= 0x3;
	if (i_2_ == 0)
	    return i;
	if (i_2_ == 1)
	    return i_1_;
	if (i_2_ == 2)
	    return 4095 - i;
	return 4095 - i_1_;
    }
    
    static void method6733(int i) {
	Class65.aClass100_658.method1874(-937119170);
	Class65.aClass100_658.aClass534_Sub40_Sub1_1179.anInt10811 = 0;
	Class65.aClass100_658.aClass409_1186 = null;
	Class65.aClass100_658.aClass409_1199 = null;
	Class65.aClass100_658.aClass409_1196 = null;
	Class65.aClass100_658.aClass409_1195 = null;
	Class65.aClass100_658.anInt1197 = 0;
	Class65.aClass100_658.anInt1189 = 0;
	client.anInt11231 = 0;
	Class489.method8005(-1899531572);
	Class176.method2928(1835662220);
	for (int i_4_ = 0; i_4_ < 2048; i_4_++)
	    client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_4_] = null;
	Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419 = null;
	for (int i_5_ = 0; i_5_ < 759971875 * client.anInt11148; i_5_++) {
	    Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1
		= ((Class654_Sub1_Sub5_Sub1)
		   client.aClass534_Sub6Array11085[i_5_].anObject10417);
	    if (null != class654_sub1_sub5_sub1)
		class654_sub1_sub5_sub1.anInt11944 = -776069067;
	}
	Class686.method13968(-1171256250);
	Class235.method4408(Class200_Sub5.method15573((byte) -35), (byte) 112);
	Class673.method11110(16, -717051550);
	for (int i_6_ = 0; i_6_ < 108; i_6_++)
	    client.aBoolArray11180[i_6_] = true;
	Class66.method1361(Class65.aClass100_658, 1110010474);
	Class52.aClass641_436 = null;
	Class36.aLong288 = 0L;
	Class200_Sub12.method15586((byte) 34);
	Class77.aClass155_Sub1_819.method15464((byte) 26);
    }
}
