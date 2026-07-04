/* Class614 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.List;

public class Class614 implements Interface70
{
    Class592 aClass592_8026 = Class592.aClass592_7817;
    boolean aBool8027;
    int anInt8028;
    Class472 aClass472_8029;
    Interface69 anInterface69_8030;
    int anInt8031;
    boolean aBool8032;
    Class367 aClass367_8033;
    Class203 aClass203_8034;
    byte[] aByteArray8035;
    
    public Class614(Class472 class472, int i, Class367 class367,
		    Interface69 interface69, Class203 class203) {
	aClass472_8029 = class472;
	anInt8028 = i * -1757603505;
	aClass367_8033 = class367;
	anInterface69_8030 = interface69;
	aClass203_8034 = class203;
	aBool8032 = aClass203_8034 != null;
	aClass592_8026 = Class592.aClass592_7818;
    }
    
    public Class491 method461() {
	Class491 class491 = new Class491(aClass367_8033);
	class491.method8010(this, 1045939075);
	return class491;
    }
    
    public void method479(Class534_Sub40 class534_sub40) {
	if (aClass203_8034 != null) {
	    if (anInterface69_8030 != null)
		anInterface69_8030.method440(this, 624944314);
	    if (aBool8027)
		throw new RuntimeException("");
	    synchronized (aClass203_8034) {
		List list = method10115(2084839783);
		if (null != list) {
		    list.add(class534_sub40);
		    anInt8031
			+= class534_sub40.aByteArray10810.length * 1028522963;
		    method10114(list, anInt8031 * 1746291803, (byte) -66);
		}
	    }
	}
    }
    
    public void method469(Class534_Sub40 class534_sub40) {
	if (aClass203_8034 != null) {
	    if (anInterface69_8030 != null)
		anInterface69_8030.method440(this, -412186171);
	    if (aBool8027)
		throw new RuntimeException("");
	    synchronized (aClass203_8034) {
		List list = method10115(1887387950);
		if (null != list) {
		    list.add(class534_sub40);
		    anInt8031
			+= class534_sub40.aByteArray10810.length * 1028522963;
		    method10114(list, anInt8031 * 1746291803, (byte) -65);
		}
	    }
	}
    }
    
    public boolean method445(byte i) {
	return false;
    }
    
    void method10113(byte i) {
	/* empty */
    }
    
    public byte[] method447(int i, byte i_0_) {
	if (null != anInterface69_8030)
	    anInterface69_8030.method440(this, 357896766);
	return aByteArray8035;
    }
    
    public int method456(byte i) {
	if (null != aByteArray8035)
	    return aByteArray8035.length;
	return 0;
    }
    
    public Class496 method463(int i) {
	return Class496.aClass496_5540;
    }
    
    public Class592 method457() {
	return aClass592_8026;
    }
    
    public void method451(Class534_Sub40 class534_sub40, int i) {
	if (aClass203_8034 != null) {
	    if (anInterface69_8030 != null)
		anInterface69_8030.method440(this, -808208591);
	    if (aBool8027)
		throw new RuntimeException("");
	    synchronized (aClass203_8034) {
		List list = method10115(1348445260);
		if (null != list) {
		    list.add(class534_sub40);
		    anInt8031
			+= class534_sub40.aByteArray10810.length * 1028522963;
		    method10114(list, anInt8031 * 1746291803, (byte) 45);
		}
	    }
	}
    }
    
    public boolean method467(int i) {
	if (aClass203_8034 == null)
	    return false;
	List list = method10115(2021871564);
	if (list == null || list.size() <= 0)
	    aBool8027 = false;
	return aBool8027;
    }
    
    public Class496 method455() {
	return Class496.aClass496_5540;
    }
    
    public boolean method453(int i) {
	return null != aClass203_8034 && aBool8032;
    }
    
    public int method452(byte i) {
	if (aClass203_8034 == null)
	    return 0;
	int i_1_ = 0;
	synchronized (aClass203_8034) {
	    List list = method10115(2122420133);
	    if (list != null)
		i_1_ = list.size();
	}
	return i_1_;
    }
    
    public void method472(boolean bool, int i) {
	if (null != anInterface69_8030)
	    anInterface69_8030.method440(this, 1917042543);
	aBool8027 = bool;
    }
    
    public boolean method423() {
	return false;
    }
    
    void method10114(List list, int i, byte i_2_) {
	if (null != aClass203_8034 && list != null && i >= 0) {
	    synchronized (aClass203_8034) {
		aClass203_8034.method3872((long) (anInt8028 * -841589329));
		if (i <= aClass203_8034.method3878(-524856526))
		    aClass203_8034.method3881(list,
					      (long) (-841589329 * anInt8028),
					      i, -1014384645);
		else {
		    aBool8032 = false;
		    aBool8027 = false;
		    anInt8031 = 0;
		}
	    }
	}
    }
    
    List method10115(int i) {
	if (null == aClass203_8034 || !aBool8032)
	    return null;
	Object object = null;
	List list;
	synchronized (aClass203_8034) {
	    list = (List) aClass203_8034.method3871((long) (-841589329
							    * anInt8028));
	    if (list == null && aBool8032) {
		list = new ArrayList();
		aClass203_8034.method3881(list,
					  (long) (anInt8028 * -841589329), 0,
					  2038675226);
	    }
	}
	return list;
    }
    
    public Class534_Sub40 method458(int i, int i_3_) {
	if (null == aClass203_8034)
	    return null;
	Class534_Sub40 class534_sub40 = null;
	if (null != anInterface69_8030)
	    anInterface69_8030.method440(this, -354237360);
	synchronized (aClass203_8034) {
	    List list = method10115(1342075732);
	    if (list.size() > i)
		class534_sub40 = (Class534_Sub40) list.get(i);
	}
	return class534_sub40;
    }
    
    public void method226() {
	if (aClass592_8026 == Class592.aClass592_7818) {
	    byte[] is = aClass472_8029.method7738(anInt8028 * -841589329,
						  (byte) -96);
	    if (is != null) {
		aByteArray8035 = is;
		method10113((byte) 67);
		aClass592_8026 = Class592.aClass592_7816;
		if (null != anInterface69_8030)
		    anInterface69_8030.method441(this, is.length,
						 -841589329 * anInt8028, false,
						 -1186343192);
	    }
	}
    }
    
    public Class491 method459() {
	Class491 class491 = new Class491(aClass367_8033);
	class491.method8010(this, 1045939075);
	return class491;
    }
    
    public Class491 method481() {
	Class491 class491 = new Class491(aClass367_8033);
	class491.method8010(this, 1045939075);
	return class491;
    }
    
    public Class491 method460() {
	Class491 class491 = new Class491(aClass367_8033);
	class491.method8010(this, 1045939075);
	return class491;
    }
    
    public boolean method462() {
	return false;
    }
    
    public boolean method471(int i) {
	if (aClass203_8034 == null)
	    return false;
	boolean bool = false;
	synchronized (aClass203_8034) {
	    List list = method10115(1687027115);
	    if (null != list && list.size() > i)
		bool = list.get(i) != null;
	}
	return bool;
    }
    
    public int method222() {
	if (null != aByteArray8035)
	    return aByteArray8035.length;
	return 0;
    }
    
    public boolean method466(int i) {
	if (aClass203_8034 == null)
	    return false;
	boolean bool = false;
	synchronized (aClass203_8034) {
	    List list = method10115(1889231998);
	    if (null != list && list.size() > i)
		bool = list.get(i) != null;
	}
	return bool;
    }
    
    void method10116() {
	/* empty */
    }
    
    public byte[] method464(int i) {
	if (null != anInterface69_8030)
	    anInterface69_8030.method440(this, 1215927448);
	return aByteArray8035;
    }
    
    public byte[] method465(int i) {
	if (null != anInterface69_8030)
	    anInterface69_8030.method440(this, 1768303516);
	return aByteArray8035;
    }
    
    public int method450() {
	if (null != aByteArray8035)
	    return aByteArray8035.length;
	return 0;
    }
    
    public boolean method473() {
	return null != aClass203_8034 && aBool8032;
    }
    
    public int method223() {
	if (null != aByteArray8035)
	    return aByteArray8035.length;
	return 0;
    }
    
    public void method446(byte i) {
	if (aClass592_8026 == Class592.aClass592_7818) {
	    byte[] is = aClass472_8029.method7738(anInt8028 * -841589329,
						  (byte) -72);
	    if (is != null) {
		aByteArray8035 = is;
		method10113((byte) 48);
		aClass592_8026 = Class592.aClass592_7816;
		if (null != anInterface69_8030)
		    anInterface69_8030.method441(this, is.length,
						 -841589329 * anInt8028, false,
						 -1186343192);
	    }
	}
    }
    
    public int method225() {
	return -841589329 * anInt8028;
    }
    
    public int method468() {
	return -841589329 * anInt8028;
    }
    
    public void method229() {
	if (aClass592_8026 == Class592.aClass592_7818) {
	    byte[] is = aClass472_8029.method7738(anInt8028 * -841589329,
						  (byte) -64);
	    if (is != null) {
		aByteArray8035 = is;
		method10113((byte) 12);
		aClass592_8026 = Class592.aClass592_7816;
		if (null != anInterface69_8030)
		    anInterface69_8030.method441(this, is.length,
						 -841589329 * anInt8028, false,
						 -1186343192);
	    }
	}
    }
    
    public Class534_Sub40 method476(int i) {
	if (null == aClass203_8034)
	    return null;
	Class534_Sub40 class534_sub40 = null;
	if (null != anInterface69_8030)
	    anInterface69_8030.method440(this, -428568833);
	synchronized (aClass203_8034) {
	    List list = method10115(1574564116);
	    if (list.size() > i)
		class534_sub40 = (Class534_Sub40) list.get(i);
	}
	return class534_sub40;
    }
    
    public boolean method454(int i, byte i_4_) {
	if (aClass203_8034 == null)
	    return false;
	boolean bool = false;
	synchronized (aClass203_8034) {
	    List list = method10115(2043908194);
	    if (null != list && list.size() > i)
		bool = list.get(i) != null;
	}
	return bool;
    }
    
    public Class592 method470(int i) {
	return aClass592_8026;
    }
    
    public int method449() {
	return -841589329 * anInt8028;
    }
    
    public boolean method273() {
	return null != aClass203_8034 && aBool8032;
    }
    
    public int method448() {
	if (aClass203_8034 == null)
	    return 0;
	int i = 0;
	synchronized (aClass203_8034) {
	    List list = method10115(1550571201);
	    if (list != null)
		i = list.size();
	}
	return i;
    }
    
    public void method475(boolean bool) {
	if (null != anInterface69_8030)
	    anInterface69_8030.method440(this, 177731156);
	aBool8027 = bool;
    }
    
    public boolean method474() {
	if (aClass203_8034 == null)
	    return false;
	List list = method10115(1840828290);
	if (list == null || list.size() <= 0)
	    aBool8027 = false;
	return aBool8027;
    }
    
    public boolean method477() {
	if (aClass203_8034 == null)
	    return false;
	List list = method10115(1773379765);
	if (list == null || list.size() <= 0)
	    aBool8027 = false;
	return aBool8027;
    }
    
    List method10117() {
	if (null == aClass203_8034 || !aBool8032)
	    return null;
	Object object = null;
	List list;
	synchronized (aClass203_8034) {
	    list = (List) aClass203_8034.method3871((long) (-841589329
							    * anInt8028));
	    if (list == null && aBool8032) {
		list = new ArrayList();
		aClass203_8034.method3881(list,
					  (long) (anInt8028 * -841589329), 0,
					  1677497157);
	    }
	}
	return list;
    }
    
    List method10118() {
	if (null == aClass203_8034 || !aBool8032)
	    return null;
	Object object = null;
	List list;
	synchronized (aClass203_8034) {
	    list = (List) aClass203_8034.method3871((long) (-841589329
							    * anInt8028));
	    if (list == null && aBool8032) {
		list = new ArrayList();
		aClass203_8034.method3881(list,
					  (long) (anInt8028 * -841589329), 0,
					  294001826);
	    }
	}
	return list;
    }
    
    public Class491 method444(byte i) {
	Class491 class491 = new Class491(aClass367_8033);
	class491.method8010(this, 1045939075);
	return class491;
    }
    
    List method10119() {
	if (null == aClass203_8034 || !aBool8032)
	    return null;
	Object object = null;
	List list;
	synchronized (aClass203_8034) {
	    list = (List) aClass203_8034.method3871((long) (-841589329
							    * anInt8028));
	    if (list == null && aBool8032) {
		list = new ArrayList();
		aClass203_8034.method3881(list,
					  (long) (anInt8028 * -841589329), 0,
					  -1206693763);
	    }
	}
	return list;
    }
    
    public void method478(Class534_Sub40 class534_sub40) {
	if (aClass203_8034 != null) {
	    if (anInterface69_8030 != null)
		anInterface69_8030.method440(this, 16687915);
	    if (aBool8027)
		throw new RuntimeException("");
	    synchronized (aClass203_8034) {
		List list = method10115(1876470677);
		if (null != list) {
		    list.add(class534_sub40);
		    anInt8031
			+= class534_sub40.aByteArray10810.length * 1028522963;
		    method10114(list, anInt8031 * 1746291803, (byte) 27);
		}
	    }
	}
    }
    
    public int method30(int i) {
	return -841589329 * anInt8028;
    }
    
    public void method480(Class534_Sub40 class534_sub40) {
	if (aClass203_8034 != null) {
	    if (anInterface69_8030 != null)
		anInterface69_8030.method440(this, -1173355697);
	    if (aBool8027)
		throw new RuntimeException("");
	    synchronized (aClass203_8034) {
		List list = method10115(1904545096);
		if (null != list) {
		    list.add(class534_sub40);
		    anInt8031
			+= class534_sub40.aByteArray10810.length * 1028522963;
		    method10114(list, anInt8031 * 1746291803, (byte) 2);
		}
	    }
	}
    }
    
    List method10120() {
	if (null == aClass203_8034 || !aBool8032)
	    return null;
	Object object = null;
	List list;
	synchronized (aClass203_8034) {
	    list = (List) aClass203_8034.method3871((long) (-841589329
							    * anInt8028));
	    if (list == null && aBool8032) {
		list = new ArrayList();
		aClass203_8034.method3881(list,
					  (long) (anInt8028 * -841589329), 0,
					  -883156720);
	    }
	}
	return list;
    }
    
    public void method482(Class534_Sub40 class534_sub40) {
	if (aClass203_8034 != null) {
	    if (anInterface69_8030 != null)
		anInterface69_8030.method440(this, -1657757701);
	    if (aBool8027)
		throw new RuntimeException("");
	    synchronized (aClass203_8034) {
		List list = method10115(1655065786);
		if (null != list) {
		    list.add(class534_sub40);
		    anInt8031
			+= class534_sub40.aByteArray10810.length * 1028522963;
		    method10114(list, anInt8031 * 1746291803, (byte) 94);
		}
	    }
	}
    }
    
    static void method10121(Class185 class185, int i, int i_5_, int i_6_,
			    int i_7_, int i_8_, int i_9_) {
	if ((null == Class43.aClass163_324 || Class579.aClass163_7758 == null
	     || Class495.aClass163_5536 == null)
	    && Class464.aClass472_5113
		   .method7670(-746775241 * Class232.anInt2356, (byte) -89)
	    && Class464.aClass472_5113
		   .method7670(Class304.anInt3261 * -1368137493, (byte) -84)
	    && Class464.aClass472_5113
		   .method7670(Class423.anInt4790 * 842411465, (byte) -78)) {
	    Class169 class169
		= Class178.method2949(Class464.aClass472_5113,
				      -1368137493 * Class304.anInt3261, 0);
	    Class579.aClass163_7758 = class185.method3279(class169, true);
	    class169.method2806();
	    Class245.aClass163_2418 = class185.method3279(class169, true);
	    Class43.aClass163_324
		= (class185.method3279
		   (Class178.method2949(Class464.aClass472_5113,
					-746775241 * Class232.anInt2356, 0),
		    true));
	    Class169 class169_10_
		= Class178.method2949(Class464.aClass472_5113,
				      842411465 * Class423.anInt4790, 0);
	    Class495.aClass163_5536 = class185.method3279(class169_10_, true);
	    class169_10_.method2806();
	    Class573.aClass163_7673 = class185.method3279(class169_10_, true);
	}
	if (null != Class43.aClass163_324 && null != Class579.aClass163_7758
	    && null != Class495.aClass163_5536) {
	    int i_11_ = ((i_6_ - Class495.aClass163_5536.method2647() * 2)
			 / Class43.aClass163_324.method2647());
	    for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
		Class43.aClass163_324.method2656
		    ((i + Class495.aClass163_5536.method2647()
		      + i_12_ * Class43.aClass163_324.method2647()),
		     i_5_ + i_7_ - Class43.aClass163_324.method2649());
	    int i_13_ = ((i_7_ - i_8_ - Class495.aClass163_5536.method2649())
			 / Class579.aClass163_7758.method2649());
	    for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
		Class579.aClass163_7758.method2656
		    (i, (i_8_ + i_5_
			 + i_14_ * Class579.aClass163_7758.method2649()));
		Class245.aClass163_2418.method2656
		    (i_6_ + i - Class245.aClass163_2418.method2647(),
		     (i_8_ + i_5_
		      + i_14_ * Class579.aClass163_7758.method2649()));
	    }
	    Class495.aClass163_5536.method2656(i, (i_7_ + i_5_
						   - Class495
							 .aClass163_5536
							 .method2649()));
	    Class573.aClass163_7673.method2656
		(i + i_6_ - Class495.aClass163_5536.method2647(),
		 i_5_ + i_7_ - Class495.aClass163_5536.method2649());
	}
    }
    
    static void method10122(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class711.method14416(Class254.aClass185_2683, 551129480);
    }
    
    static final void method10123(Class669 class669, int i) {
	class669.anInt8600 -= 926998689;
	int i_15_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_16_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_17_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class200_Sub9.method15582(i_15_, i_16_, i_17_, false,
					(short) 255);
    }
    
    static final void method10124(Class669 class669, int i) {
	class669.anInt8600 -= 308999563;
	int i_18_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	Class534_Sub18_Sub14 class534_sub18_sub14
	    = Class200_Sub20.method15635(i_18_, (short) 19493);
	if (null != class534_sub18_sub14) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class534_sub18_sub14.anInt11805 * -894992131;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= Class690_Sub7.method16946((-1208012376043926345L
					     * (class534_sub18_sub14
						.aLong11813)),
					    (Class539.aClass672_7171.anInt8630
					     * -473969159),
					    -1976386115);
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1988131041 * class534_sub18_sub14.anInt11806;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (class534_sub18_sub14.aString11807 != null
		   ? class534_sub18_sub14.aString11807 : "");
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (null != class534_sub18_sub14.aString11804
		   ? class534_sub18_sub14.aString11804 : "");
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (null != class534_sub18_sub14.aString11809
		   ? class534_sub18_sub14.aString11809 : "");
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (class534_sub18_sub14.aString11803 != null
		   ? class534_sub18_sub14.aString11803 : "");
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class534_sub18_sub14.anInt11811 * 1232973141;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= (class534_sub18_sub14.aString11812 != null
		   ? class534_sub18_sub14.aString11812 : "");
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (null != class534_sub18_sub14.aClass407_11810
		   ? class534_sub18_sub14.aClass407_11810.method93() : -1);
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	}
    }
    
    static final void method10125(Class669 class669, int i) {
	class669.anInt8600 -= 308999563;
	int i_19_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class322.method5778(i_19_, (byte) -60);
    }
    
    static final void method10126(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_20_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_21_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_20_ | 1 << i_21_;
    }
    
    public static void method10127(int i) {
	Class98.method1837(true, 556144233);
    }
    
    public static void method10128
	(float f, Class438 class438, Class443 class443, Class438 class438_22_,
	 Class438 class438_23_, Class438 class438_24_, Class438 class438_25_,
	 float f_26_, float f_27_, float f_28_, float f_29_, byte i) {
	if (!class438_22_.method7056(class438)) {
	    Class438 class438_30_ = Class438.method6996(0.0F, 0.0F, 0.0F);
	    Class438 class438_31_
		= Class438.method6994(Class438.method7055(class438_22_,
							  class438));
	    class438_31_.method7021(class443);
	    Class438 class438_32_
		= Class438.method7055(class438_31_, class438_30_);
	    float f_33_ = class438_32_.method7012();
	    if (f_26_ > 0.0F) {
		class438_24_ = Class438.method6994(class438_24_);
		class438_24_.method7016(f_27_ * (f_33_ / f_26_));
	    }
	    if (class438_24_.aFloat4864 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class438.aFloat4864) || f_33_ > f_28_
		|| f_33_ < f_29_) {
		class438.method6992(class438_22_);
		class438_23_.method6999();
	    } else {
		class443.method7182();
		Class438 class438_34_ = Class438.method6996(1.0F, 0.0F, 0.0F);
		Class438 class438_35_ = Class438.method6996(0.0F, 1.0F, 0.0F);
		Class438 class438_36_ = Class438.method6996(0.0F, 0.0F, 1.0F);
		class438_34_.method7021(class443);
		class438_35_.method7021(class443);
		class438_36_.method7021(class443);
		Class438 class438_37_
		    = Class438.method6996(Class438.method7027(class438_34_,
							      class438_23_),
					  Class438.method7027(class438_35_,
							      class438_23_),
					  Class438.method7027(class438_36_,
							      class438_23_));
		Class438 class438_38_ = Class438.method6994(class438_37_);
		class438_38_.method7013();
		Class438 class438_39_
		    = Class438.method7018(Class438.method7015(class438_38_,
							      class438_38_),
					  Class438.method7020(class438_24_,
							      2.0F));
		Class438 class438_40_ = Class438.method6994(class438_32_);
		class438_40_.method7013();
		Class438 class438_41_ = Class438.method6994(class438_37_);
		if (class438_39_.aFloat4864 > class438_40_.aFloat4864) {
		    if (class438_32_.aFloat4864 < 0.0F) {
			class438_41_.aFloat4864 += f * class438_24_.aFloat4864;
			if (class438_41_.aFloat4864 > 0.0F)
			    class438_41_.aFloat4864 = 0.0F;
		    } else {
			class438_41_.aFloat4864 -= f * class438_24_.aFloat4864;
			if (class438_41_.aFloat4864 < 0.0F)
			    class438_41_.aFloat4864 = 0.0F;
		    }
		} else if (class438_38_.aFloat4864 < class438_25_.aFloat4864) {
		    if (class438_32_.aFloat4864 < 0.0F) {
			class438_41_.aFloat4864 -= class438_24_.aFloat4864 * f;
			if (class438_41_.aFloat4864 < -class438_25_.aFloat4864)
			    class438_41_.aFloat4864 = -class438_25_.aFloat4864;
		    } else {
			class438_41_.aFloat4864 += class438_24_.aFloat4864 * f;
			if (class438_41_.aFloat4864 > class438_25_.aFloat4864)
			    class438_41_.aFloat4864 = class438_25_.aFloat4864;
		    }
		}
		if (class438_39_.aFloat4863 > class438_40_.aFloat4863) {
		    if (class438_32_.aFloat4863 < 0.0F) {
			class438_41_.aFloat4863 += class438_24_.aFloat4863 * f;
			if (class438_41_.aFloat4863 > 0.0F)
			    class438_41_.aFloat4863 = 0.0F;
		    } else {
			class438_41_.aFloat4863 -= class438_24_.aFloat4863 * f;
			if (class438_41_.aFloat4863 < 0.0F)
			    class438_41_.aFloat4863 = 0.0F;
		    }
		} else if (class438_38_.aFloat4863 < class438_25_.aFloat4863) {
		    if (class438_32_.aFloat4863 < 0.0F) {
			class438_41_.aFloat4863 -= f * class438_24_.aFloat4863;
			if (class438_41_.aFloat4863 < -class438_25_.aFloat4863)
			    class438_41_.aFloat4863 = -class438_25_.aFloat4863;
		    } else {
			class438_41_.aFloat4863 += class438_24_.aFloat4863 * f;
			if (class438_41_.aFloat4863 > class438_25_.aFloat4863)
			    class438_41_.aFloat4863 = class438_25_.aFloat4863;
		    }
		}
		if (class438_39_.aFloat4865 > class438_40_.aFloat4865) {
		    if (class438_32_.aFloat4865 < 0.0F) {
			class438_41_.aFloat4865 += class438_24_.aFloat4865 * f;
			if (class438_41_.aFloat4865 > 0.0F)
			    class438_41_.aFloat4865 = 0.0F;
		    } else {
			class438_41_.aFloat4865 -= class438_24_.aFloat4865 * f;
			if (class438_41_.aFloat4865 < 0.0F)
			    class438_41_.aFloat4865 = 0.0F;
		    }
		} else if (class438_38_.aFloat4865 < class438_25_.aFloat4865) {
		    if (class438_32_.aFloat4865 < 0.0F) {
			class438_41_.aFloat4865 -= class438_24_.aFloat4865 * f;
			if (class438_41_.aFloat4865 < -class438_25_.aFloat4865)
			    class438_41_.aFloat4865 = -class438_25_.aFloat4865;
		    } else {
			class438_41_.aFloat4865 += class438_24_.aFloat4865 * f;
			if (class438_41_.aFloat4865 > class438_25_.aFloat4865)
			    class438_41_.aFloat4865 = class438_25_.aFloat4865;
		    }
		}
		Class438 class438_42_
		    = Class438.method7020(class438_34_,
					  class438_41_.aFloat4864);
		class438_42_.method7086(class438_35_, class438_41_.aFloat4863);
		class438_42_.method7086(class438_36_, class438_41_.aFloat4865);
		class438_23_.method7024(class438_42_, 0.8F);
		class438.method7026(Class438.method7020(class438_23_, f));
		class438_38_.method7074();
		class438_41_.method7074();
		class438_40_.method7074();
	    }
	}
    }
    
    static final void method10129(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class10.anInt75 * -891094135 == 2 ? 1 : 0;
    }
}
