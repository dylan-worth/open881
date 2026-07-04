/* Class659 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class659
{
    Class534_Sub18_Sub8 aClass534_Sub18_Sub8_8542;
    int anInt8543 = 520043783;
    Object[] anObjectArray8544;
    int[] anIntArray8545;
    long[] aLongArray8546;
    
    Class659() {
	/* empty */
    }
    
    static final void method10915(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	boolean bool
	    = (class669.anIntArray8595[2088438307 * class669.anInt8600 + 1]
	       == 1);
	if (null != Class554_Sub1.aClass9_10686) {
	    Class534 class534
		= Class554_Sub1.aClass9_10686.method579((long) i_0_);
	    if (null != class534 && !bool)
		class534.method8892((byte) 1);
	    else if (class534 == null && bool) {
		class534 = new Class534();
		Class554_Sub1.aClass9_10686.method581(class534, (long) i_0_);
	    }
	}
    }
    
    static void method10916(byte i) {
	Class592.aClass62_7815 = Class62.aClass62_649;
	Class40.aClass695_308 = Class695.aClass695_8776;
	Class44_Sub20.aClass704_11014 = Class704.aClass704_8828;
	Class262.aClass703_2800 = Class703.aClass703_8822;
	Class331.aClass702_3495 = Class702.aClass702_8811;
	Class267.aClass699_2940 = Class699.aClass699_8797;
	Class534_Sub1_Sub2.aString11720 = null;
    }
}
