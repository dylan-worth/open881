/* Class530 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;

public class Class530
{
    boolean aBool7125;
    int anInt7126;
    public Class183 aClass183_7127;
    int anInt7128;
    int[] anIntArray7129;
    static int anInt7130 = 0;
    LinkedList aLinkedList7131;
    int[] anIntArray7132;
    static Class163[] aClass163Array7133;
    static int anInt7134;
    
    public static void method8823(int i) {
	anInt7130 = i * 1372860039;
    }
    
    Class183 method8824(Class185 class185, byte i) {
	Class187 class187 = Class187.method3709(Class130.aClass472_1524,
						anInt7126 * 1610177479, 0);
	if (null == class187)
	    return null;
	if (class187.anInt2082 < 13)
	    class187.method3723(2);
	return class185.method3329(class187, 2048, anInt7130 * -688048329, 64,
				   768);
    }
    
    public void method8825(Class556 class556, int i) {
	if (class556 != null && anInt7128 * -419568743 > 0) {
	    method8831(class556, (short) 1183);
	    Iterator iterator = aLinkedList7131.iterator();
	    while (iterator.hasNext()) {
		Class654_Sub1_Sub5_Sub4 class654_sub1_sub5_sub4
		    = (Class654_Sub1_Sub5_Sub4) iterator.next();
		class556.method9246(class654_sub1_sub5_sub4, false, (byte) 8);
	    }
	    aBool7125 = true;
	}
    }
    
    public boolean method8826() {
	return aBool7125;
    }
    
    public void method8827(Class556 class556, byte i) {
	if (class556 != null && null != aLinkedList7131) {
	    Iterator iterator = aLinkedList7131.iterator();
	    while (iterator.hasNext()) {
		Class654_Sub1_Sub5_Sub4 class654_sub1_sub5_sub4
		    = (Class654_Sub1_Sub5_Sub4) iterator.next();
		class556.method9255(class654_sub1_sub5_sub4.aByte10854,
				    class654_sub1_sub5_sub4.aShort11900,
				    class654_sub1_sub5_sub4.aShort11901,
				    new Class524(class654_sub1_sub5_sub4),
				    (byte) 69);
	    }
	}
    }
    
    public Class530(Class185 class185, Class534_Sub40 class534_sub40, int i) {
	anInt7126 = i * 1943401975;
	anInt7128 = class534_sub40.method16545((byte) -95) * 612548777;
	anIntArray7129 = new int[anInt7128 * -419568743];
	anIntArray7132 = new int[anInt7128 * -419568743];
	int i_0_ = class534_sub40.method16529((byte) 1);
	int i_1_ = class534_sub40.method16529((byte) 1);
	for (int i_2_ = 0; i_2_ < anInt7128 * -419568743; i_2_++) {
	    anIntArray7129[i_2_] = i_0_ + class534_sub40.method16586((byte) 1);
	    anIntArray7132[i_2_] = i_1_ + class534_sub40.method16586((byte) 1);
	}
	aClass183_7127 = method8824(class185, (byte) 63);
    }
    
    public boolean method8828(int i) {
	return aBool7125;
    }
    
    public boolean method8829(Class185 class185) {
	aClass183_7127 = method8824(class185, (byte) 63);
	return null != aClass183_7127;
    }
    
    public boolean method8830(Class185 class185, byte i) {
	aClass183_7127 = method8824(class185, (byte) 63);
	return null != aClass183_7127;
    }
    
    void method8831(Class556 class556, short i) {
	aLinkedList7131 = new LinkedList();
	Class468 class468 = client.aClass512_11100.method8552((byte) 0);
	Class597 class597 = client.aClass512_11100.method8416((byte) 76);
	Class597 class597_3_
	    = new Class597(Class674.anInt8633 * -878424575, anIntArray7129[0],
			   anIntArray7132[0]);
	for (int i_4_ = 1; i_4_ < anInt7128 * -419568743; i_4_++) {
	    Class597 class597_5_
		= new Class597(Class674.anInt8633 * -878424575,
			       anIntArray7129[i_4_], anIntArray7132[i_4_]);
	    while ((class597_3_.anInt7859 * -424199969
		    != class597_5_.anInt7859 * -424199969)
		   || (class597_5_.anInt7861 * -1166289421
		       != -1166289421 * class597_3_.anInt7861)) {
		if (class597_3_.anInt7859 * -424199969
		    < -424199969 * class597_5_.anInt7859)
		    class597_3_.anInt7859 += -1962245345;
		else if (-424199969 * class597_3_.anInt7859
			 > class597_5_.anInt7859 * -424199969)
		    class597_3_.anInt7859 -= -1962245345;
		if (-1166289421 * class597_3_.anInt7861
		    < class597_5_.anInt7861 * -1166289421)
		    class597_3_.anInt7861 += -277165253;
		else if (-1166289421 * class597_3_.anInt7861
			 > -1166289421 * class597_5_.anInt7861)
		    class597_3_.anInt7861 -= -277165253;
		int i_6_ = -878424575 * Class674.anInt8633;
		int i_7_ = (-424199969 * class597_3_.anInt7859
			    - class597.anInt7859 * -424199969);
		int i_8_ = (class597_3_.anInt7861 * -1166289421
			    - class597.anInt7861 * -1166289421);
		if (i_7_ >= 0 && i_7_ < 1183912005 * class556.anInt7435
		    && i_8_ >= 0 && i_8_ < class556.anInt7470 * 60330541) {
		    int i_9_ = 256 + (i_7_ << 9);
		    int i_10_ = (i_8_ << 9) + 256;
		    if (class468.method7612(i_7_, i_8_, (byte) 0))
			i_6_++;
		    aLinkedList7131.add(new Class654_Sub1_Sub5_Sub4
					(class556, this,
					 -878424575 * Class674.anInt8633, i_6_,
					 i_9_,
					 Class247.method4595(i_9_, i_10_,
							     ((Class674
							       .anInt8633)
							      * -878424575),
							     -460037094),
					 i_10_));
		}
	    }
	    class597_3_ = class597_5_;
	}
    }
    
    Class183 method8832(Class185 class185) {
	Class187 class187 = Class187.method3709(Class130.aClass472_1524,
						anInt7126 * 1610177479, 0);
	if (null == class187)
	    return null;
	if (class187.anInt2082 < 13)
	    class187.method3723(2);
	return class185.method3329(class187, 2048, anInt7130 * -688048329, 64,
				   768);
    }
    
    public void method8833(Class556 class556) {
	if (class556 != null && anInt7128 * -419568743 > 0) {
	    method8831(class556, (short) 1183);
	    Iterator iterator = aLinkedList7131.iterator();
	    while (iterator.hasNext()) {
		Class654_Sub1_Sub5_Sub4 class654_sub1_sub5_sub4
		    = (Class654_Sub1_Sub5_Sub4) iterator.next();
		class556.method9246(class654_sub1_sub5_sub4, false, (byte) 8);
	    }
	    aBool7125 = true;
	}
    }
    
    public void method8834(Class556 class556) {
	if (class556 != null && anInt7128 * -419568743 > 0) {
	    method8831(class556, (short) 1183);
	    Iterator iterator = aLinkedList7131.iterator();
	    while (iterator.hasNext()) {
		Class654_Sub1_Sub5_Sub4 class654_sub1_sub5_sub4
		    = (Class654_Sub1_Sub5_Sub4) iterator.next();
		class556.method9246(class654_sub1_sub5_sub4, false, (byte) 8);
	    }
	    aBool7125 = true;
	}
    }
    
    public void method8835(Class556 class556) {
	if (class556 != null && anInt7128 * -419568743 > 0) {
	    method8831(class556, (short) 1183);
	    Iterator iterator = aLinkedList7131.iterator();
	    while (iterator.hasNext()) {
		Class654_Sub1_Sub5_Sub4 class654_sub1_sub5_sub4
		    = (Class654_Sub1_Sub5_Sub4) iterator.next();
		class556.method9246(class654_sub1_sub5_sub4, false, (byte) 8);
	    }
	    aBool7125 = true;
	}
    }
    
    public void method8836(Class556 class556) {
	if (class556 != null && anInt7128 * -419568743 > 0) {
	    method8831(class556, (short) 1183);
	    Iterator iterator = aLinkedList7131.iterator();
	    while (iterator.hasNext()) {
		Class654_Sub1_Sub5_Sub4 class654_sub1_sub5_sub4
		    = (Class654_Sub1_Sub5_Sub4) iterator.next();
		class556.method9246(class654_sub1_sub5_sub4, false, (byte) 8);
	    }
	    aBool7125 = true;
	}
    }
    
    public void method8837(Class556 class556) {
	if (class556 != null && null != aLinkedList7131) {
	    Iterator iterator = aLinkedList7131.iterator();
	    while (iterator.hasNext()) {
		Class654_Sub1_Sub5_Sub4 class654_sub1_sub5_sub4
		    = (Class654_Sub1_Sub5_Sub4) iterator.next();
		class556.method9255(class654_sub1_sub5_sub4.aByte10854,
				    class654_sub1_sub5_sub4.aShort11900,
				    class654_sub1_sub5_sub4.aShort11901,
				    new Class524(class654_sub1_sub5_sub4),
				    (byte) -16);
	    }
	}
    }
    
    void method8838(Class556 class556) {
	aLinkedList7131 = new LinkedList();
	Class468 class468 = client.aClass512_11100.method8552((byte) 0);
	Class597 class597 = client.aClass512_11100.method8416((byte) 10);
	Class597 class597_11_
	    = new Class597(Class674.anInt8633 * -878424575, anIntArray7129[0],
			   anIntArray7132[0]);
	for (int i = 1; i < anInt7128 * -419568743; i++) {
	    Class597 class597_12_
		= new Class597(Class674.anInt8633 * -878424575,
			       anIntArray7129[i], anIntArray7132[i]);
	    while ((class597_11_.anInt7859 * -424199969
		    != class597_12_.anInt7859 * -424199969)
		   || (class597_12_.anInt7861 * -1166289421
		       != -1166289421 * class597_11_.anInt7861)) {
		if (class597_11_.anInt7859 * -424199969
		    < -424199969 * class597_12_.anInt7859)
		    class597_11_.anInt7859 += -1962245345;
		else if (-424199969 * class597_11_.anInt7859
			 > class597_12_.anInt7859 * -424199969)
		    class597_11_.anInt7859 -= -1962245345;
		if (-1166289421 * class597_11_.anInt7861
		    < class597_12_.anInt7861 * -1166289421)
		    class597_11_.anInt7861 += -277165253;
		else if (-1166289421 * class597_11_.anInt7861
			 > -1166289421 * class597_12_.anInt7861)
		    class597_11_.anInt7861 -= -277165253;
		int i_13_ = -878424575 * Class674.anInt8633;
		int i_14_ = (-424199969 * class597_11_.anInt7859
			     - class597.anInt7859 * -424199969);
		int i_15_ = (class597_11_.anInt7861 * -1166289421
			     - class597.anInt7861 * -1166289421);
		if (i_14_ >= 0 && i_14_ < 1183912005 * class556.anInt7435
		    && i_15_ >= 0 && i_15_ < class556.anInt7470 * 60330541) {
		    int i_16_ = 256 + (i_14_ << 9);
		    int i_17_ = (i_15_ << 9) + 256;
		    if (class468.method7612(i_14_, i_15_, (byte) 0))
			i_13_++;
		    aLinkedList7131.add(new Class654_Sub1_Sub5_Sub4
					(class556, this,
					 -878424575 * Class674.anInt8633,
					 i_13_, i_16_,
					 Class247.method4595(i_16_, i_17_,
							     ((Class674
							       .anInt8633)
							      * -878424575),
							     -90539163),
					 i_17_));
		}
	    }
	    class597_11_ = class597_12_;
	}
    }
    
    public static void method8839(int i) {
	anInt7130 = i * 1372860039;
    }
    
    Class183 method8840(Class185 class185) {
	Class187 class187 = Class187.method3709(Class130.aClass472_1524,
						anInt7126 * 1610177479, 0);
	if (null == class187)
	    return null;
	if (class187.anInt2082 < 13)
	    class187.method3723(2);
	return class185.method3329(class187, 2048, anInt7130 * -688048329, 64,
				   768);
    }
    
    public void method8841() {
	aBool7125 = false;
	aClass183_7127 = null;
    }
    
    public void method8842(int i) {
	aBool7125 = false;
	aClass183_7127 = null;
    }
    
    public boolean method8843() {
	return aBool7125;
    }
    
    public boolean method8844() {
	return aBool7125;
    }
    
    public boolean method8845() {
	return aBool7125;
    }
    
    static void method8846(Class669 class669, int i) {
	Class273 class273
	    = ((Class273)
	       Class223.aClass53_Sub2_2316.method91((class669.anIntArray8595
						     [((class669.anInt8600
							-= 308999563)
						       * 2088438307)]),
						    1259856684));
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (null == class273.anIntArray3024 ? 0
	       : class273.anIntArray3024.length);
    }
    
    static final void method8847(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_18_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_19_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	Class534_Sub37 class534_sub37
	    = (Class534_Sub37) client.aClass9_11224.method579((long) i_18_);
	if (class534_sub37 != null
	    && 1225863589 * class534_sub37.anInt10803 == i_19_)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method8848(Class669 class669, byte i)
	throws Exception_Sub2 {
	class669.anInt8600 -= 617999126;
	int i_20_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	Class438 class438
	    = Class438.method6996((float) i_20_, (float) i_20_, (float) i_20_);
	Class599.aClass298_Sub1_7871.method5364(class438, 313919366);
	class438.method7074();
    }
    
    static void method8849(Class247 class247, int i, int i_21_, int i_22_) {
	if (class247.aByte2458 == 0)
	    class247.anInt2466 = class247.anInt2462 * -1394902803;
	else if (1 == class247.aByte2458)
	    class247.anInt2466
		= ((i - -881188269 * class247.anInt2468) / 2
		   + class247.anInt2462 * 646601207) * -1745491141;
	else if (2 == class247.aByte2458)
	    class247.anInt2466
		= (i - class247.anInt2468 * -881188269
		   - 646601207 * class247.anInt2462) * -1745491141;
	else if (class247.aByte2458 == 3)
	    class247.anInt2466
		= -1745491141 * (i * (646601207 * class247.anInt2462) >> 14);
	else if (class247.aByte2458 == 4)
	    class247.anInt2466
		= ((i * (646601207 * class247.anInt2462) >> 14)
		   + (i - -881188269 * class247.anInt2468) / 2) * -1745491141;
	else
	    class247.anInt2466
		= -1745491141 * (i - class247.anInt2468 * -881188269
				 - (i * (646601207 * class247.anInt2462)
				    >> 14));
	if (0 == class247.aByte2562)
	    class247.anInt2467 = 1048318347 * class247.anInt2463;
	else if (1 == class247.aByte2562)
	    class247.anInt2467
		= (62926167
		   * (-216553235 * class247.anInt2463
		      + (i_21_ - -1279656873 * class247.anInt2469) / 2));
	else if (class247.aByte2562 == 2)
	    class247.anInt2467
		= 62926167 * (i_21_ - class247.anInt2469 * -1279656873
			      - -216553235 * class247.anInt2463);
	else if (class247.aByte2562 == 3)
	    class247.anInt2467
		= 62926167 * (i_21_ * (-216553235 * class247.anInt2463) >> 14);
	else if (class247.aByte2562 == 4)
	    class247.anInt2467
		= 62926167 * ((i_21_ - class247.anInt2469 * -1279656873) / 2
			      + (i_21_ * (class247.anInt2463 * -216553235)
				 >> 14));
	else
	    class247.anInt2467 = (i_21_ - class247.anInt2469 * -1279656873
				  - (i_21_ * (-216553235 * class247.anInt2463)
				     >> 14)) * 62926167;
	if (client.aBool11087
	    && (client.method17392(class247).anInt10574 * 1837782131 != 0
		|| class247.anInt2438 * -1960530827 == 0)) {
	    if (class247.anInt2466 * -1196182029 < 0)
		class247.anInt2466 = 0;
	    else if ((-881188269 * class247.anInt2468
		      + class247.anInt2466 * -1196182029)
		     > i)
		class247.anInt2466
		    = (i - -881188269 * class247.anInt2468) * -1745491141;
	    if (-612037017 * class247.anInt2467 < 0)
		class247.anInt2467 = 0;
	    else if ((class247.anInt2467 * -612037017
		      + class247.anInt2469 * -1279656873)
		     > i_21_)
		class247.anInt2467
		    = 62926167 * (i_21_ - class247.anInt2469 * -1279656873);
	}
    }
    
    public static Class296 method8850(int i, int i_23_) {
	if (Class296.aClass296_3163.anInt3162 * -855837543 == i)
	    return Class296.aClass296_3163;
	if (Class296.aClass296_3164.anInt3162 * -855837543 == i)
	    return Class296.aClass296_3164;
	return null;
    }
    
    public static void method8851(int i, byte i_24_) {
	if (i < 1)
	    Class554_Sub1.anInt10691 = Class554_Sub1.anInt10670 * -1435674875;
	else
	    Class554_Sub1.anInt10691 = i * 1444927003;
    }
    
    public static void method8852(Class68 class68, String string, int i,
				  Throwable throwable, byte i_25_) {
	Class185.method3694(new Class584(class68, string, i, throwable),
			    -1600474947);
    }
    
    static final void method8853(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass219_11338.method4119(-1494149921);
    }
}
