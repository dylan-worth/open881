/* Class690 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class690
{
    protected static final int anInt8749 = 1;
    protected static final int anInt8750 = 2;
    public static final int anInt8751 = 3;
    protected Class534_Sub35 aClass534_Sub35_8752;
    protected int anInt8753;
    
    abstract int method14017(int i);
    
    Class690(int i, Class534_Sub35 class534_sub35) {
	anInt8753 = 1823770475 * i;
	aClass534_Sub35_8752 = class534_sub35;
    }
    
    Class690(Class534_Sub35 class534_sub35) {
	aClass534_Sub35_8752 = class534_sub35;
	anInt8753 = method14017(2137484010) * 1823770475;
    }
    
    abstract int method14018();
    
    void method14019(int i, int i_0_) {
	if (method14026(i, -2024064741) != 3)
	    method14020(i, 1419528057);
    }
    
    abstract void method14020(int i, int i_1_);
    
    abstract int method14021();
    
    abstract int method14022();
    
    abstract void method14023(int i);
    
    abstract void method14024(int i);
    
    abstract void method14025(int i);
    
    abstract int method14026(int i, int i_2_);
    
    abstract int method14027(int i);
    
    abstract int method14028(int i);
    
    abstract int method14029(int i);
    
    abstract int method14030(int i);
    
    void method14031(int i) {
	if (method14026(i, -2024064741) != 3)
	    method14020(i, -317047689);
    }
    
    static void method14032(int i) {
	client.aClass100_11094.method1866((byte) -120);
	if (Class40.anInt310 * 2039255983 < 2) {
	    Class5.aClass23_49.method818((byte) -83);
	    Class40.anInt312 = 0;
	    Class40.anInt310 += 625648463;
	    Class592.aClass62_7815 = Class62.aClass62_649;
	} else {
	    Class592.aClass62_7815 = null;
	    Class40.aClass695_308 = Class695.aClass695_8778;
	    Class673.method11110(15, 26981567);
	}
    }
}
