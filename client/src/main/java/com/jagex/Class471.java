/* Class471 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Comparator;

class Class471 implements Comparator
{
    Class478 this$0;
    
    public boolean method7646(Object object) {
	return super.equals(object);
    }
    
    int method7647(Class469 class469, Class469 class469_0_, short i) {
	if (class469.aLong5149 * -4949530321911881879L
	    > class469_0_.aLong5149 * -4949530321911881879L)
	    return 1;
	if (-4949530321911881879L * class469.aLong5149
	    < class469_0_.aLong5149 * -4949530321911881879L)
	    return -1;
	return 0;
    }
    
    public int compare(Object object, Object object_1_) {
	return method7647((Class469) object, (Class469) object_1_,
			  (short) -19448);
    }
    
    public boolean method7648(Object object) {
	return super.equals(object);
    }
    
    public int method7649(Object object, Object object_2_) {
	return method7647((Class469) object, (Class469) object_2_,
			  (short) -10074);
    }
    
    public int method7650(Object object, Object object_3_) {
	return method7647((Class469) object, (Class469) object_3_,
			  (short) 438);
    }
    
    public int method7651(Object object, Object object_4_) {
	return method7647((Class469) object, (Class469) object_4_,
			  (short) -8101);
    }
    
    public int method7652(Object object, Object object_5_) {
	return method7647((Class469) object, (Class469) object_5_,
			  (short) -19803);
    }
    
    public boolean method7653(Object object) {
	return super.equals(object);
    }
    
    int method7654(Class469 class469, Class469 class469_6_) {
	if (class469.aLong5149 * -4949530321911881879L
	    > class469_6_.aLong5149 * -4949530321911881879L)
	    return 1;
	if (-4949530321911881879L * class469.aLong5149
	    < class469_6_.aLong5149 * -4949530321911881879L)
	    return -1;
	return 0;
    }
    
    public boolean method7655(Object object) {
	return super.equals(object);
    }
    
    Class471(Class478 class478) {
	this$0 = class478;
    }
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    static final void method7656(Class669 class669, byte i) {
	int i_7_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_7_, 421767413);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_7_ >> 16];
	Class321.method5775(class247, class243, class669, 652212518);
    }
    
    static int method7657(char c, Class672 class672, int i) {
	int i_8_ = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i_8_ = 1 + (c << 4);
	}
	if (c == 241 && class672 == Class672.aClass672_8625)
	    i_8_ = 1762;
	return i_8_;
    }
    
    static final void method7658(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass57_11973
		  .method1231(1783730227);
    }
    
    static final void method7659(int i) {
	Class534_Sub40_Sub1 class534_sub40_sub1
	    = client.aClass100_11264.aClass534_Sub40_Sub1_1179;
	class534_sub40_sub1.method18294(-921276659);
	int i_9_ = class534_sub40_sub1.method18295(8, -761815447);
	if (i_9_ < -1125820437 * client.anInt11321) {
	    for (int i_10_ = i_9_; i_10_ < client.anInt11321 * -1125820437;
		 i_10_++)
		client.anIntArray11093
		    [(client.anInt11092 += -1796285973) * 289244867 - 1]
		    = client.anIntArray11088[i_10_];
	}
	if (i_9_ > -1125820437 * client.anInt11321)
	    throw new RuntimeException();
	client.anInt11321 = 0;
	for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
	    int i_12_ = client.anIntArray11088[i_11_];
	    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		= ((Class654_Sub1_Sub5_Sub1_Sub1)
		   (((Class534_Sub6)
		     client.aClass9_11331.method579((long) i_12_))
		    .anObject10417));
	    int i_13_ = class534_sub40_sub1.method18295(1, -761815447);
	    if (i_13_ == 0) {
		client.anIntArray11088
		    [(client.anInt11321 += 590354627) * -1125820437 - 1]
		    = i_12_;
		class654_sub1_sub5_sub1_sub1.anInt11967
		    = -526016129 * client.anInt11091;
	    } else {
		int i_14_ = class534_sub40_sub1.method18295(2, -761815447);
		if (0 == i_14_) {
		    client.anIntArray11088
			[(client.anInt11321 += 590354627) * -1125820437 - 1]
			= i_12_;
		    class654_sub1_sub5_sub1_sub1.anInt11967
			= -526016129 * client.anInt11091;
		    client.anIntArray11298
			[(client.anInt11089 += 382245089) * 1422306081 - 1]
			= i_12_;
		} else if (i_14_ == 1) {
		    client.anIntArray11088
			[(client.anInt11321 += 590354627) * -1125820437 - 1]
			= i_12_;
		    class654_sub1_sub5_sub1_sub1.anInt11967
			= -526016129 * client.anInt11091;
		    Class686 class686
			= ((Class686)
			   Class448.method7319(Class225
						   .method4173(-1506893836),
					       class534_sub40_sub1
						   .method18295(3, -761815447),
					       2088438307));
		    class654_sub1_sub5_sub1_sub1.method18831(class686,
							     (Class676
							      .aClass676_8649
							      .aByte8648),
							     -1215602901);
		    int i_15_ = class534_sub40_sub1.method18295(1, -761815447);
		    if (i_15_ == 1)
			client.anIntArray11298
			    [(client.anInt11089 += 382245089) * 1422306081 - 1]
			    = i_12_;
		} else if (i_14_ == 2) {
		    client.anIntArray11088
			[(client.anInt11321 += 590354627) * -1125820437 - 1]
			= i_12_;
		    class654_sub1_sub5_sub1_sub1.anInt11967
			= -526016129 * client.anInt11091;
		    if (class534_sub40_sub1.method18295(1, -761815447) == 1) {
			Class686 class686
			    = ((Class686)
			       (Class448.method7319
				(Class225.method4173(-1506893836),
				 class534_sub40_sub1.method18295(3,
								 -761815447),
				 2088438307)));
			class654_sub1_sub5_sub1_sub1.method18831
			    (class686, Class676.aClass676_8650.aByte8648,
			     -1292992964);
			Class686 class686_16_
			    = ((Class686)
			       (Class448.method7319
				(Class225.method4173(-1506893836),
				 class534_sub40_sub1.method18295(3,
								 -761815447),
				 2088438307)));
			class654_sub1_sub5_sub1_sub1.method18831
			    (class686_16_, Class676.aClass676_8650.aByte8648,
			     -1927009178);
		    } else {
			Class686 class686
			    = ((Class686)
			       (Class448.method7319
				(Class225.method4173(-1506893836),
				 class534_sub40_sub1.method18295(3,
								 -761815447),
				 2088438307)));
			class654_sub1_sub5_sub1_sub1.method18831
			    (class686, Class676.aClass676_8644.aByte8648,
			     -1257231657);
		    }
		    int i_17_ = class534_sub40_sub1.method18295(1, -761815447);
		    if (1 == i_17_)
			client.anIntArray11298
			    [(client.anInt11089 += 382245089) * 1422306081 - 1]
			    = i_12_;
		} else if (i_14_ == 3)
		    client.anIntArray11093
			[(client.anInt11092 += -1796285973) * 289244867 - 1]
			= i_12_;
	    }
	}
    }
}
