/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Container;
import java.awt.Insets;

public class Class244 implements Interface28
{
    Class213 this$0;
    
    public void method173(Class214 class214, int i) {
	class214.method4047((byte) 1);
    }
    
    public void method174(Class214 class214) {
	class214.method4047((byte) 1);
    }
    
    public void method172(Class214 class214) {
	class214.method4047((byte) 1);
    }
    
    Class244(Class213 class213) {
	this$0 = class213;
    }
    
    static void method4484(Class583 class583, int i, int i_0_,
			   Class669 class669, int i_1_) {
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = Class429.method6804(class583, i, i_0_, (short) -9056);
	if (class534_sub18_sub8 == null)
	    Class532.method8880(1120399608);
	else {
	    class669.anIntArray8605
		= new int[class534_sub18_sub8.anInt11754 * -39710947];
	    class669.anObjectArray8611
		= new Object[1127446605 * class534_sub18_sub8.anInt11755];
	    if (Class583.aClass583_7787 == class534_sub18_sub8.aClass583_11750
		|| (class534_sub18_sub8.aClass583_11750
		    == Class583.aClass583_7779)
		|| (Class583.aClass583_7778
		    == class534_sub18_sub8.aClass583_11750)) {
		class669.anIntArray8605[0] = i;
		class669.anIntArray8605[1]
		    = Class81.aClass563_834.method9493(-1111675967);
		class669.anIntArray8605[2]
		    = Class81.aClass563_834.method9477(1789516825);
	    } else if ((Class583.aClass583_7773
			== class534_sub18_sub8.aClass583_11750)
		       || (class534_sub18_sub8.aClass583_11750
			   == Class583.aClass583_7783)
		       || (Class583.aClass583_7774
			   == class534_sub18_sub8.aClass583_11750)
		       || (Class583.aClass583_7772
			   == class534_sub18_sub8.aClass583_11750)
		       || (Class583.aClass583_7792
			   == class534_sub18_sub8.aClass583_11750))
		class669.anIntArray8605[0] = i;
	    else if (class534_sub18_sub8.aClass583_11750
		     == Class583.aClass583_7785)
		class669.anIntArray8605[0] = class669.anInt8610 * -1668647199;
	    Class292.method5307(class534_sub18_sub8, 500000, class669,
				1907322580);
	}
    }
    
    static void method4485(int i) {
	synchronized (Class700.aclient8805) {
	    if (Class29.aFrame266 != null) {
		/* empty */
	    } else {
		Container container = Class171.method2880((short) -22440);
		if (container == null) {
		    /* empty */
		} else {
		    Class391.anInt4076
			= container.getSize().width * 1199809921;
		    client.anInt5561 = container.getSize().height * 226957979;
		    if (Class452.aFrame4943 == container) {
			Insets insets = Class452.aFrame4943.getInsets();
			Class391.anInt4076
			    -= 1199809921 * (insets.left + insets.right);
			client.anInt5561
			    -= 226957979 * (insets.top + insets.bottom);
		    }
		    if (-166028671 * Class391.anInt4076 <= 0)
			Class391.anInt4076 = 1199809921;
		    if (8272787 * client.anInt5561 <= 0)
			client.anInt5561 = 226957979;
		    if (Class63.method1280(1600733204) != 1)
			Class108.method1971(-1068542084);
		    else {
			Class706_Sub4.anInt10994
			    = client.anInt11047 * 1860177489;
			client.anInt5562
			    = -138655283 * ((Class391.anInt4076 * -166028671
					     - -321474631 * client.anInt11047)
					    / 2);
			Class18.anInt205 = -1350390103 * client.anInt11192;
			client.anInt5563 = 0;
		    }
		    if (Class665.aClass665_8561 != client.aClass665_11211
			&& Class706_Sub4.anInt10994 * 1771907305 < 1024
			&& -1091172141 * Class18.anInt205 >= 768) {
			/* empty */
		    }
		    Class464.aCanvas5111.setSize((Class706_Sub4.anInt10994
						  * 1771907305),
						 (-1091172141
						  * Class18.anInt205));
		    if (null != Class254.aClass185_2683) {
			Class254.aClass185_2683.method3259
			    (Class464.aCanvas5111,
			     1771907305 * Class706_Sub4.anInt10994,
			     -1091172141 * Class18.anInt205, 1936641963);
			Class477.method7780(Class254.aClass185_2683,
					    Class250.method4604((byte) -79));
		    }
		    if (Class452.aFrame4943 == container) {
			Insets insets = Class452.aFrame4943.getInsets();
			Class464.aCanvas5111.setLocation
			    (insets.left + -721302779 * client.anInt5562,
			     client.anInt5563 * -350211099 + insets.top);
		    } else
			Class464.aCanvas5111.setLocation((client.anInt5562
							  * -721302779),
							 (-350211099
							  * client.anInt5563));
		    Class534_Sub28.method16317(-61675715);
		    if (-1 != client.anInt11185 * -993629849)
			Class260.method4813(true, (short) 20987);
		    Class292.method5305(-841564954);
		}
	    }
	}
    }
    
    public static Object[] method4486(Class534_Sub40 class534_sub40,
				      Class493[] class493s, int i) {
	int i_2_ = class534_sub40.method16546(-1706829710);
	Object[] objects = new Object[i_2_ * class493s.length];
	for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
	    for (int i_4_ = 0; i_4_ < class493s.length; i_4_++) {
		int i_5_ = i_4_ + class493s.length * i_3_;
		objects[i_5_]
		    = class493s[i_4_].aClass483_5522.method7947(class534_sub40,
								1782282974);
	    }
	}
	return objects;
    }
    
    static final void method4487(Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class172.aClass268_1824.method4880(string, 1753858128);
    }
}
