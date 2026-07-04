/* Class200_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class200_Sub16 extends Class200
{
    int anInt9960;
    int anInt9961;
    int anInt9962;
    int anInt9963;
    int anInt9964;
    public static Class628 aClass628_9965;
    
    Class200_Sub16(Class534_Sub40 class534_sub40) {
	super(class534_sub40);
	anInt9964 = class534_sub40.method16529((byte) 1) * 1773019115;
	int i = class534_sub40.method16527(-1501668103);
	if (0 != (i & 0x1)) {
	    anInt9963 = class534_sub40.method16529((byte) 1) * 152065885;
	    anInt9962 = class534_sub40.method16529((byte) 1) * 422393943;
	} else {
	    anInt9963 = -152065885;
	    anInt9962 = -422393943;
	}
	if (0 != (i & 0x2)) {
	    anInt9960 = class534_sub40.method16529((byte) 1) * -838380475;
	    anInt9961 = class534_sub40.method16529((byte) 1) * 1758895609;
	} else {
	    anInt9960 = 838380475;
	    anInt9961 = -1758895609;
	}
	if ((i & 0x4) != 0) {
	    int i_0_ = class534_sub40.method16529((byte) 1);
	    int i_1_ = class534_sub40.method16529((byte) 1);
	    int i_2_ = 255 * i_0_ / i_1_;
	    if (i_0_ > 0 && i_2_ < 1) {
		boolean bool = true;
	    }
	}
    }
    
    public void method3845(int i) {
	Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1
	    = Class65.aClass192Array712[-1839394621 * anInt9964]
		  .method3775(2088438307);
	class654_sub1_sub5_sub1.method18565(anInt9963 * -910445323,
					    1861432167 * anInt9962,
					    anInt9960 * -1855676787,
					    anInt9961 * 360813641,
					    client.anInt11101, 0, -1640566714);
    }
    
    public void method3846() {
	Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1
	    = Class65.aClass192Array712[-1839394621 * anInt9964]
		  .method3775(2088438307);
	class654_sub1_sub5_sub1.method18565(anInt9963 * -910445323,
					    1861432167 * anInt9962,
					    anInt9960 * -1855676787,
					    anInt9961 * 360813641,
					    client.anInt11101, 0, -2073307239);
    }
    
    public void method3847() {
	Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1
	    = Class65.aClass192Array712[-1839394621 * anInt9964]
		  .method3775(2088438307);
	class654_sub1_sub5_sub1.method18565(anInt9963 * -910445323,
					    1861432167 * anInt9962,
					    anInt9960 * -1855676787,
					    anInt9961 * 360813641,
					    client.anInt11101, 0, 143584257);
    }
    
    public static int method15615(byte i) {
	if (2.0 == (double) Class554_Sub1.aFloat7409)
	    return 25;
	if ((double) Class554_Sub1.aFloat7409 == 3.0)
	    return 37;
	if ((double) Class554_Sub1.aFloat7409 == 4.0)
	    return 50;
	if ((double) Class554_Sub1.aFloat7409 == 6.0)
	    return 75;
	if (8.0 == (double) Class554_Sub1.aFloat7409)
	    return 100;
	return 200;
    }
}
