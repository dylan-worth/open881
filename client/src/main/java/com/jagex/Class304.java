/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public abstract class Class304 implements Interface6
{
    Class203 aClass203_3254;
    Class203 aClass203_3255 = new Class203(50);
    Class472 aClass472_3256;
    Class675 aClass675_3257;
    boolean aBool3258;
    int anInt3259;
    String[] aStringArray3260;
    public static int anInt3261;
    static Iterator anIterator3262;
    static Interface25 anInterface25_3263;
    
    void method5578(int i) {
	synchronized (aClass203_3255) {
	    aClass203_3255.method3876(i, (byte) 0);
	}
	synchronized (aClass203_3254) {
	    aClass203_3254.method3876(i, (byte) 0);
	}
    }
    
    void method5579(boolean bool, int i) {
	if (aBool3258 != bool) {
	    aBool3258 = bool;
	    method5592(-311465822);
	}
    }
    
    void method5580(int i, byte i_0_) {
	anInt3259 = -880237489 * i;
	synchronized (aClass203_3255) {
	    aClass203_3255.method3877(1867925013);
	}
	synchronized (aClass203_3254) {
	    aClass203_3254.method3877(-798052223);
	}
    }
    
    void method5581(int i) {
	synchronized (aClass203_3255) {
	    aClass203_3255.method3876(i, (byte) 0);
	}
	synchronized (aClass203_3254) {
	    aClass203_3254.method3876(i, (byte) 0);
	}
    }
    
    void method5582(int i, byte i_1_) {
	synchronized (aClass203_3255) {
	    aClass203_3255.method3876(i, (byte) 0);
	}
	synchronized (aClass203_3254) {
	    aClass203_3254.method3876(i, (byte) 0);
	}
    }
    
    void method5583(int i) {
	synchronized (aClass203_3255) {
	    aClass203_3255.method3884((byte) -14);
	}
	synchronized (aClass203_3254) {
	    aClass203_3254.method3884((byte) -88);
	}
    }
    
    void method5584() {
	synchronized (aClass203_3255) {
	    aClass203_3255.method3877(751929500);
	}
	synchronized (aClass203_3254) {
	    aClass203_3254.method3877(849292763);
	}
    }
    
    void method5585(int i) {
	anInt3259 = -880237489 * i;
	synchronized (aClass203_3255) {
	    aClass203_3255.method3877(1405501508);
	}
	synchronized (aClass203_3254) {
	    aClass203_3254.method3877(249471143);
	}
    }
    
    void method5586(int i) {
	anInt3259 = -880237489 * i;
	synchronized (aClass203_3255) {
	    aClass203_3255.method3877(-1465801091);
	}
	synchronized (aClass203_3254) {
	    aClass203_3254.method3877(2078244830);
	}
    }
    
    void method5587(boolean bool) {
	if (aBool3258 != bool) {
	    aBool3258 = bool;
	    method5592(-1679590989);
	}
    }
    
    void method5588() {
	synchronized (aClass203_3255) {
	    aClass203_3255.method3884((byte) -62);
	}
	synchronized (aClass203_3254) {
	    aClass203_3254.method3884((byte) -32);
	}
    }
    
    Class304(boolean bool, Class472 class472, Class672 class672,
	     Class675 class675) {
	aClass203_3254 = new Class203(5);
	aBool3258 = bool;
	aClass472_3256 = class472;
	aClass675_3257 = class675;
	if (Class675.aClass675_8634 == aClass675_3257)
	    aStringArray3260
		= new String[] { null, null, null, null, null,
				 Class58.aClass58_589.method1245(class672,
								 (byte) -90) };
	else
	    aStringArray3260
		= new String[] { null, null, null, null, null, null };
    }
    
    void method5589(int i) {
	synchronized (aClass203_3255) {
	    aClass203_3255.method3876(i, (byte) 0);
	}
	synchronized (aClass203_3254) {
	    aClass203_3254.method3876(i, (byte) 0);
	}
    }
    
    void method5590() {
	synchronized (aClass203_3255) {
	    aClass203_3255.method3884((byte) -14);
	}
	synchronized (aClass203_3254) {
	    aClass203_3254.method3884((byte) -1);
	}
    }
    
    void method5591(int i) {
	synchronized (aClass203_3255) {
	    aClass203_3255.method3876(i, (byte) 0);
	}
	synchronized (aClass203_3254) {
	    aClass203_3254.method3876(i, (byte) 0);
	}
    }
    
    void method5592(int i) {
	synchronized (aClass203_3255) {
	    aClass203_3255.method3877(-589427283);
	}
	synchronized (aClass203_3254) {
	    aClass203_3254.method3877(1854957346);
	}
    }
    
    static void method5593(int i) {
	Class291.aClass203_3112.method3877(-1993301954);
    }
    
    public static boolean method5594(int i, int i_2_, int i_3_) {
	if (Class639.aClass367_8316 == null
	    || Class639.aClass367_8316.method6342((byte) -88) == null)
	    return false;
	if (i_2_ == i)
	    return true;
	Class388 class388 = Class639.aClass367_8316.method6342((byte) -55)
				.method6370(i, -1859407544);
	Class388 class388_4_ = Class639.aClass367_8316.method6342
				   ((byte) -46).method6370(i_2_, -1682493639);
	Class388 class388_5_ = class388;
    while_61_:
	do {
	    do {
		if (null == class388_5_)
		    break while_61_;
		class388_5_ = class388_5_.method6512(-2075814524);
		if (class388_4_ == class388_5_)
		    return true;
	    } while (class388 != class388_5_);
	    return false;
	} while (false);
	class388_5_ = class388_4_;
    while_62_:
	do {
	    do {
		if (null == class388_5_)
		    break while_62_;
		class388_5_ = class388_5_.method6512(-2075814524);
		if (class388_5_ == class388)
		    return true;
	    } while (class388_4_ != class388_5_);
	    return false;
	} while (false);
	return false;
    }
    
    static final void method5595(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = null == client.aClass214_11359 ? 0 : 1;
    }
    
    static final void method5596
	(Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1, byte i) {
	if (null != class654_sub1_sub5_sub1.anIntArray11985
	    || null != class654_sub1_sub5_sub1.anIntArray11920) {
	    boolean bool = true;
	    Class597 class597 = client.aClass512_11100.method8416((byte) 86);
	    for (int i_6_ = 0;
		 i_6_ < class654_sub1_sub5_sub1.anIntArray11985.length;
		 i_6_++) {
		int i_7_ = -1;
		if (class654_sub1_sub5_sub1.anIntArray11985 != null)
		    i_7_ = class654_sub1_sub5_sub1.anIntArray11985[i_6_];
		if (-1 == i_7_) {
		    if (!class654_sub1_sub5_sub1.method18527(i_6_, -1,
							     16711680))
			bool = false;
		} else {
		    bool = false;
		    boolean bool_8_ = false;
		    boolean bool_9_ = false;
		    Class438 class438
			= class654_sub1_sub5_sub1.method10807().aClass438_4885;
		    int i_10_;
		    int i_11_;
		    if ((i_7_ & ~0x3fffffff) == -1073741824) {
			int i_12_ = i_7_ & 0xfffffff;
			int i_13_ = i_12_ >> 14;
			int i_14_ = i_12_ & 0x3fff;
			i_10_ = ((int) class438.aFloat4864
				 - (512 * (i_13_
					   - class597.anInt7859 * -424199969)
				    + 256));
			i_11_ = ((int) class438.aFloat4865
				 - (((i_14_ - -1166289421 * class597.anInt7861)
				     * 512)
				    + 256));
		    } else if (0 != (i_7_ & 0x8000)) {
			int i_15_ = i_7_ & 0x7fff;
			Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
			    = (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			       [i_15_]);
			if (null != class654_sub1_sub5_sub1_sub2) {
			    Class438 class438_16_
				= (class654_sub1_sub5_sub1_sub2.method10807()
				   .aClass438_4885);
			    i_10_ = ((int) class438.aFloat4864
				     - (int) class438_16_.aFloat4864);
			    i_11_ = ((int) class438.aFloat4865
				     - (int) class438_16_.aFloat4865);
			} else {
			    class654_sub1_sub5_sub1.method18527(i_6_, -1,
								16711680);
			    continue;
			}
		    } else {
			Class534_Sub6 class534_sub6
			    = ((Class534_Sub6)
			       client.aClass9_11331.method579((long) i_7_));
			if (null != class534_sub6) {
			    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
				= ((Class654_Sub1_Sub5_Sub1_Sub1)
				   class534_sub6.anObject10417);
			    Class438 class438_17_
				= (class654_sub1_sub5_sub1_sub1.method10807()
				   .aClass438_4885);
			    i_10_ = ((int) class438.aFloat4864
				     - (int) class438_17_.aFloat4864);
			    i_11_ = ((int) class438.aFloat4865
				     - (int) class438_17_.aFloat4865);
			} else {
			    class654_sub1_sub5_sub1.method18527(i_6_, -1,
								16711680);
			    continue;
			}
		    }
		    if (0 != i_10_ || 0 != i_11_)
			class654_sub1_sub5_sub1.method18527
			    (i_6_,
			     (int) (Math.atan2((double) i_10_, (double) i_11_)
				    * 2607.5945876176133) & 0x3fff,
			     16711680);
		}
	    }
	    if (bool) {
		class654_sub1_sub5_sub1.anIntArray11985 = null;
		class654_sub1_sub5_sub1.anIntArray11920 = null;
	    }
	}
    }
    
    static void method5597(int i, int i_18_) {
	Class328.anInt3479 = 980626489 * i;
	Class554_Sub1.anInt10673 = -2017528667;
	Class554_Sub1.anInt10673 = -2017528667;
	Class612.method10108(65280);
    }
    
    static byte method5598(int i, int i_19_, byte i_20_) {
	if (Class595.aClass595_7833.anInt7852 * 847393323 != i)
	    return (byte) 0;
	if (0 == (i_19_ & 0x1))
	    return (byte) 1;
	return (byte) 2;
    }
}
