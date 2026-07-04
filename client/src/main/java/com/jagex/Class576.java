/* Class576 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Dimension;

public class Class576 implements Interface65
{
    int anInt7712;
    int anInt7713;
    
    static Class576 method9760(Class534_Sub40 class534_sub40) {
	int i = class534_sub40.method16527(-579265006);
	int i_0_ = class534_sub40.method16527(1598959067);
	return new Class576(i, i_0_);
    }
    
    public boolean method437(Class534_Sub42 class534_sub42,
			     Interface63[] interface63s, int i,
			     Class547 class547, int i_1_) {
	for (int i_2_ = 0; i_2_ < i && i_2_ < interface63s.length; i_2_++) {
	    Interface63 interface63 = interface63s[i_2_];
	    if (interface63 != null
		&& interface63.method431((byte) -2) == anInt7712 * -1305255513
		&& interface63.method426((byte) 16) == anInt7713 * 242205005)
		return true;
	}
	return false;
    }
    
    public boolean method438(Class534_Sub42 class534_sub42,
			     Interface63[] interface63s, int i,
			     Class547 class547) {
	for (int i_3_ = 0; i_3_ < i && i_3_ < interface63s.length; i_3_++) {
	    Interface63 interface63 = interface63s[i_3_];
	    if (interface63 != null
		&& interface63.method431((byte) -16) == anInt7712 * -1305255513
		&& interface63.method426((byte) 16) == anInt7713 * 242205005)
		return true;
	}
	return false;
    }
    
    Class576(int i, int i_4_) {
	anInt7712 = -502319593 * i;
	anInt7713 = 1770610565 * i_4_;
    }
    
    static Class576 method9761(Class534_Sub40 class534_sub40) {
	int i = class534_sub40.method16527(-426664865);
	int i_5_ = class534_sub40.method16527(-412950318);
	return new Class576(i, i_5_);
    }
    
    static void method9762(byte i) {
	if (Class254.aClass185_2683.method3249()) {
	    Class254.aClass185_2683.method3633(Class464.aCanvas5111,
					       203260023);
	    Class264.method4840((byte) -30);
	    Dimension dimension = Class464.aCanvas5111.getSize();
	    Class254.aClass185_2683.method3243(Class464.aCanvas5111,
					       dimension.width,
					       dimension.height,
					       (short) 22452);
	    Class254.aClass185_2683.method3258(Class464.aCanvas5111,
					       -1896477508);
	} else
	    Class527.method8778(Class44_Sub6.aClass534_Sub35_10989
				    .aClass690_Sub7_10733
				    .method16935(-1807368365),
				false, -706596636);
	Class422.method6785((byte) -112);
    }
    
    public static void method9763
	(Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2, int i) {
	Class534_Sub16 class534_sub16
	    = ((Class534_Sub16)
	       (Class534_Sub16.aClass9_10470.method579
		((long) (1126388985
			 * class654_sub1_sub5_sub1_sub2.anInt11922))));
	if (class534_sub16 != null) {
	    if (null != class534_sub16.aClass491_10492) {
		class534_sub16.aClass491_10492.method8014(100, 1962988118);
		Class171_Sub4.aClass232_9944
		    .method4234(class534_sub16.aClass491_10492, 951881433);
		class534_sub16.aClass491_10492 = null;
	    }
	    class534_sub16.method8892((byte) 1);
	}
    }
}
