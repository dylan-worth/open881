/* Class472 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public final class Class472
{
    int anInt5154;
    Object[] anObjectArray5155;
    Object[][] anObjectArrayArray5156;
    static Class80 aClass80_5157 = new Class80();
    boolean aBool5158;
    static final int anInt5159 = 0;
    public static final int anInt5160 = 1;
    static final int anInt5161 = 2;
    Class451 aClass451_5162;
    static boolean aBool5163 = false;
    static int anInt5164 = 0;
    Class462 aClass462_5165 = null;
    static int anInt5166;
    
    synchronized boolean method7660() {
	if (aClass462_5165 == null) {
	    aClass462_5165 = aClass451_5162.method7385(-1597312807);
	    if (aClass462_5165 == null)
		return false;
	    anObjectArray5155
		= new Object[-540639821 * aClass462_5165.anInt5082];
	    anObjectArrayArray5156
		= new Object[aClass462_5165.anInt5082 * -540639821][];
	}
	return true;
    }
    
    static final byte[] method7661(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	Class466 class466 = new Class466(class534_sub40);
	Class473 class473 = class466.method7578(-1031924294);
	int i = class466.method7576((byte) 7);
	if (i < 0 || 852448745 * anInt5164 != 0 && i > 852448745 * anInt5164)
	    throw new RuntimeException();
	if (class473 == Class473.aClass473_5172) {
	    byte[] is_0_ = new byte[i];
	    class534_sub40.method16735(is_0_, 0, i, (short) -22866);
	    return is_0_;
	}
	int i_1_ = class466.method7577(1971173011);
	if (i_1_ < 0
	    || 0 != 852448745 * anInt5164 && i_1_ > 852448745 * anInt5164)
	    throw new RuntimeException();
	byte[] is_2_;
	if (class473 == Class473.aClass473_5169) {
	    is_2_ = new byte[i_1_];
	    Class708.method14261(is_2_, i_1_, is, i, 9);
	} else if (class473 == Class473.aClass473_5167) {
	    is_2_ = new byte[i_1_];
	    synchronized (aClass80_5157) {
		aClass80_5157.method1625(class534_sub40, is_2_, 1514644255);
	    }
	} else if (Class473.aClass473_5168 == class473) {
	    try {
		is_2_ = Class666.method11020(class534_sub40, i_1_, 1006195966);
	    } catch (IOException ioexception) {
		throw new RuntimeException(ioexception);
	    }
	} else
	    throw new RuntimeException();
	return is_2_;
    }
    
    public int method7662(byte i) {
	if (!method7729(708842220))
	    throw new IllegalStateException("");
	return -461160727 * aClass462_5165.anInt5075;
    }
    
    boolean method7663(String string, String string_3_, byte i) {
	if (!method7729(1302301725))
	    return false;
	string = string.toLowerCase();
	string_3_ = string_3_.toLowerCase();
	int i_4_ = (aClass462_5165.aClass275_5081.method5145
		    (Class403.method6615(string, -721302779), (byte) 98));
	if (!method7704(i_4_, (byte) -115))
	    return false;
	int i_5_ = (aClass462_5165.aClass275Array5092[i_4_].method5145
		    (Class403.method6615(string_3_, -721302779), (byte) 90));
	return method7669(i_4_, i_5_, 1804616883);
    }
    
    public synchronized boolean method7664(int i, int i_6_, int i_7_) {
	if (!method7729(1323641872))
	    return false;
	if (i < 0 || i_6_ < 0 || i >= aClass462_5165.anIntArray5085.length
	    || i_6_ >= aClass462_5165.anIntArray5085[i]) {
	    if (aBool5163)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_6_).toString());
	    return false;
	}
	return true;
    }
    
    synchronized void method7665(int i, int i_8_) {
	if (aBool5158)
	    anObjectArray5155[i] = aClass451_5162.method7373(i, 211534120);
	else
	    anObjectArray5155[i]
		= Class30.method882(aClass451_5162.method7373(i, 211534120),
				    false, 1111281270);
    }
    
    public void method7666(int i, int i_9_) {
	aClass451_5162.method7374(i, -6013978);
    }
    
    public int method7667(String string, int i) {
	if (!method7729(149543814))
	    return 0;
	string = string.toLowerCase();
	int i_10_ = (aClass462_5165.aClass275_5081.method5145
		     (Class403.method6615(string, -721302779), (byte) 116));
	return method7684(i_10_, (short) 920);
    }
    
    public int method7668(int i, int i_11_) {
	if (!method7729(1262021757))
	    return -1;
	int i_12_ = aClass462_5165.aClass275_5081.method5145(i, (byte) 31);
	if (!method7704(i_12_, (byte) -83))
	    return -1;
	return i_12_;
    }
    
    public synchronized boolean method7669(int i, int i_13_, int i_14_) {
	if (!method7664(i, i_13_, 1122693873))
	    return false;
	if (null != anObjectArrayArray5156[i]
	    && anObjectArrayArray5156[i][i_13_] != null)
	    return true;
	if (null != anObjectArray5155[i])
	    return true;
	method7665(i, 139890559);
	if (null != anObjectArray5155[i])
	    return true;
	return false;
    }
    
    public synchronized boolean method7670(int i, byte i_15_) {
	if (!method7729(371983829))
	    return false;
	if (aClass462_5165.anIntArray5085.length == 1)
	    return method7669(0, i, 1804616883);
	if (!method7704(i, (byte) -123))
	    return false;
	if (aClass462_5165.anIntArray5085[i] == 1)
	    return method7669(i, 0, 1804616883);
	throw new RuntimeException();
    }
    
    boolean method7671(String string, String string_16_) {
	if (!method7729(1314076869))
	    return false;
	string = string.toLowerCase();
	string_16_ = string_16_.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 63));
	if (!method7704(i, (byte) -11))
	    return false;
	int i_17_ = (aClass462_5165.aClass275Array5092[i].method5145
		     (Class403.method6615(string_16_, -721302779), (byte) 10));
	return method7669(i, i_17_, 1804616883);
    }
    
    public synchronized boolean method7672(int i) {
	if (!method7729(1855701235))
	    return false;
	boolean bool = true;
	for (int i_18_ = 0; i_18_ < aClass462_5165.anIntArray5086.length;
	     i_18_++) {
	    int i_19_ = aClass462_5165.anIntArray5086[i_18_];
	    if (null == anObjectArray5155[i_19_]) {
		method7665(i_19_, 2013858776);
		if (null == anObjectArray5155[i_19_])
		    bool = false;
	    }
	}
	return bool;
    }
    
    public boolean method7673(String string, String string_20_) {
	if (!method7729(1557356487))
	    return false;
	string = string.toLowerCase();
	string_20_ = string_20_.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 20));
	if (i < 0)
	    return false;
	int i_21_
	    = (aClass462_5165.aClass275Array5092[i].method5145
	       (Class403.method6615(string_20_, -721302779), (byte) 101));
	if (i_21_ < 0)
	    return false;
	return true;
    }
    
    public synchronized int method7674(int i) {
	if (!method7729(2075862652))
	    return 0;
	int i_22_ = 0;
	int i_23_ = 0;
	for (int i_24_ = 0; i_24_ < anObjectArray5155.length; i_24_++) {
	    if (aClass462_5165.anIntArray5074[i_24_] > 0) {
		i_22_ += 100;
		i_23_ += method7684(i_24_, (short) 920);
	    }
	}
	if (i_22_ == 0)
	    return 100;
	int i_25_ = i_23_ * 100 / i_22_;
	return i_25_;
    }
    
    public boolean method7675(String string) {
	int i = method7683("", (byte) 1);
	if (i != -1)
	    return method7663("", string, (byte) 103);
	return method7663(string, "", (byte) -101);
    }
    
    public synchronized byte[] method7676(int i, int i_26_, int[] is,
					  int i_27_) {
	if (!method7664(i, i_26_, -1665161286))
	    return null;
	byte[] is_28_ = null;
	if (anObjectArrayArray5156[i] == null
	    || anObjectArrayArray5156[i][i_26_] == null) {
	    boolean bool = method7682(i, i_26_, is, (byte) 25);
	    if (!bool) {
		method7665(i, -436087361);
		bool = method7682(i, i_26_, is, (byte) -78);
		if (!bool)
		    return null;
	    }
	}
	if (anObjectArrayArray5156[i] == null)
	    throw new RuntimeException("");
	if (null != anObjectArrayArray5156[i][i_26_]) {
	    is_28_ = Class20.method803(anObjectArrayArray5156[i][i_26_], false,
				       (byte) 3);
	    if (is_28_ == null)
		throw new RuntimeException("");
	}
	if (null != is_28_) {
	    if (1348122519 * anInt5154 == 1) {
		anObjectArrayArray5156[i][i_26_] = null;
		if (aClass462_5165.anIntArray5085[i] == 1)
		    anObjectArrayArray5156[i] = null;
	    } else if (2 == 1348122519 * anInt5154)
		anObjectArrayArray5156[i] = null;
	}
	return is_28_;
    }
    
    public boolean method7677(int i, byte i_29_) {
	if (!method7729(2047075600))
	    return false;
	if (1 == aClass462_5165.anIntArray5085.length)
	    return method7664(0, i, -2077260288);
	if (!method7704(i, (byte) -63))
	    return false;
	if (aClass462_5165.anIntArray5085[i] == 1)
	    return method7664(i, 0, -598556036);
	throw new RuntimeException();
    }
    
    public synchronized int[] method7678(int i, byte i_30_) {
	if (!method7704(i, (byte) -71))
	    return null;
	int[] is = aClass462_5165.anIntArrayArray5090[i];
	if (is == null) {
	    is = new int[aClass462_5165.anIntArray5074[i]];
	    for (int i_31_ = 0; i_31_ < is.length; i_31_++)
		is[i_31_] = i_31_;
	}
	return is;
    }
    
    public int method7679(int i) {
	if (!method7729(1688116229))
	    return -1;
	return aClass462_5165.anIntArray5085.length;
    }
    
    public boolean method7680(String string) {
	if (!method7729(1810211715))
	    return false;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 102));
	if (i < 0)
	    return false;
	return true;
    }
    
    public synchronized boolean method7681(int i, int i_32_) {
	if (!method7704(i, (byte) -122))
	    return false;
	if (null != anObjectArray5155[i])
	    return true;
	method7665(i, 1532936373);
	if (anObjectArray5155[i] != null)
	    return true;
	return false;
    }
    
    synchronized boolean method7682(int i, int i_33_, int[] is, byte i_34_) {
	if (!method7704(i, (byte) -15))
	    return false;
	if (null == anObjectArray5155[i])
	    return false;
	int i_35_ = aClass462_5165.anIntArray5074[i];
	int[] is_36_ = aClass462_5165.anIntArrayArray5090[i];
	if (anObjectArrayArray5156[i] == null)
	    anObjectArrayArray5156[i]
		= new Object[aClass462_5165.anIntArray5085[i]];
	Object[] objects = anObjectArrayArray5156[i];
	boolean bool = true;
	for (int i_37_ = 0; i_37_ < i_35_; i_37_++) {
	    int i_38_;
	    if (is_36_ == null)
		i_38_ = i_37_;
	    else
		i_38_ = is_36_[i_37_];
	    if (null == objects[i_38_]) {
		bool = false;
		break;
	    }
	}
	if (bool)
	    return true;
	byte[] is_39_;
	if (is != null
	    && (0 != is[0] || is[1] != 0 || 0 != is[2] || is[3] != 0)) {
	    is_39_ = Class20.method803(anObjectArray5155[i], true, (byte) 3);
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is_39_);
	    int i_40_ = class534_sub40.method16527(-986371677);
	    int i_41_ = class534_sub40.method16533(-258848859);
	    int i_42_ = ((i_40_ == Class473.aClass473_5172.method93() ? 5 : 9)
			 + i_41_);
	    class534_sub40.method16555(is, 5, i_42_, 1781931159);
	} else
	    is_39_ = Class20.method803(anObjectArray5155[i], false, (byte) 3);
	byte[] is_43_;
	try {
	    is_43_ = Class465.method7572(is_39_, (byte) -3);
	} catch (RuntimeException runtimeexception) {
	    throw Class48.method1140
		      (runtimeexception,
		       new StringBuilder().append(is != null).append(" ")
			   .append
			   (i).append
			   (" ").append
			   (is_39_.length).append
			   (" ").append
			   (Class317.method5744(is_39_, is_39_.length,
						701600119))
			   .append
			   (" ").append
			   (Class317.method5744(is_39_, is_39_.length - 2,
						-654310277))
			   .append
			   (" ").append
			   (aClass462_5165.anIntArray5083[i]).append
			   (" ").append
			   (aClass462_5165.anInt5075 * -461160727).toString());
	}
	if (aBool5158)
	    anObjectArray5155[i] = null;
	if (i_35_ > 1) {
	    if (anInt5154 * 1348122519 != 2) {
		int i_44_ = is_43_.length;
		int i_45_ = is_43_[--i_44_] & 0xff;
		i_44_ -= i_45_ * i_35_ * 4;
		Class534_Sub40 class534_sub40 = new Class534_Sub40(is_43_);
		int[] is_46_ = new int[i_35_];
		class534_sub40.anInt10811 = i_44_ * -1387468933;
		for (int i_47_ = 0; i_47_ < i_45_; i_47_++) {
		    int i_48_ = 0;
		    for (int i_49_ = 0; i_49_ < i_35_; i_49_++) {
			i_48_ += class534_sub40.method16533(-258848859);
			is_46_[i_49_] += i_48_;
		    }
		}
		byte[][] is_50_ = new byte[i_35_][];
		for (int i_51_ = 0; i_51_ < i_35_; i_51_++) {
		    is_50_[i_51_] = new byte[is_46_[i_51_]];
		    is_46_[i_51_] = 0;
		}
		class534_sub40.anInt10811 = i_44_ * -1387468933;
		int i_52_ = 0;
		for (int i_53_ = 0; i_53_ < i_45_; i_53_++) {
		    int i_54_ = 0;
		    for (int i_55_ = 0; i_55_ < i_35_; i_55_++) {
			i_54_ += class534_sub40.method16533(-258848859);
			System.arraycopy(is_43_, i_52_, is_50_[i_55_],
					 is_46_[i_55_], i_54_);
			is_46_[i_55_] += i_54_;
			i_52_ += i_54_;
		    }
		}
		for (int i_56_ = 0; i_56_ < i_35_; i_56_++) {
		    int i_57_;
		    if (is_36_ == null)
			i_57_ = i_56_;
		    else
			i_57_ = is_36_[i_56_];
		    if (anInt5154 * 1348122519 == 0)
			objects[i_57_] = Class30.method882(is_50_[i_56_],
							   false, 1111281270);
		    else
			objects[i_57_] = is_50_[i_56_];
		}
	    } else {
		int i_58_ = is_43_.length;
		int i_59_ = is_43_[--i_58_] & 0xff;
		i_58_ -= i_59_ * i_35_ * 4;
		Class534_Sub40 class534_sub40 = new Class534_Sub40(is_43_);
		int i_60_ = 0;
		int i_61_ = 0;
		class534_sub40.anInt10811 = -1387468933 * i_58_;
		for (int i_62_ = 0; i_62_ < i_59_; i_62_++) {
		    int i_63_ = 0;
		    for (int i_64_ = 0; i_64_ < i_35_; i_64_++) {
			i_63_ += class534_sub40.method16533(-258848859);
			int i_65_;
			if (null == is_36_)
			    i_65_ = i_64_;
			else
			    i_65_ = is_36_[i_64_];
			if (i_33_ == i_65_) {
			    i_60_ += i_63_;
			    i_61_ = i_65_;
			}
		    }
		}
		if (i_60_ == 0)
		    return true;
		byte[] is_66_ = new byte[i_60_];
		i_60_ = 0;
		class534_sub40.anInt10811 = -1387468933 * i_58_;
		int i_67_ = 0;
		for (int i_68_ = 0; i_68_ < i_59_; i_68_++) {
		    int i_69_ = 0;
		    for (int i_70_ = 0; i_70_ < i_35_; i_70_++) {
			i_69_ += class534_sub40.method16533(-258848859);
			int i_71_;
			if (null == is_36_)
			    i_71_ = i_70_;
			else
			    i_71_ = is_36_[i_70_];
			if (i_71_ == i_33_) {
			    System.arraycopy(is_43_, i_67_, is_66_, i_60_,
					     i_69_);
			    i_60_ += i_69_;
			}
			i_67_ += i_69_;
		    }
		}
		objects[i_61_] = is_66_;
	    }
	} else {
	    int i_72_;
	    if (is_36_ == null)
		i_72_ = 0;
	    else
		i_72_ = is_36_[0];
	    if (anInt5154 * 1348122519 == 0)
		objects[i_72_] = Class30.method882(is_43_, false, 1111281270);
	    else
		objects[i_72_] = is_43_;
	}
	return true;
    }
    
    public int method7683(String string, byte i) {
	if (!method7729(1243035372))
	    return -1;
	string = string.toLowerCase();
	int i_73_ = (aClass462_5165.aClass275_5081.method5145
		     (Class403.method6615(string, -721302779), (byte) 60));
	if (!method7704(i_73_, (byte) -27))
	    return -1;
	return i_73_;
    }
    
    public synchronized int method7684(int i, short i_74_) {
	if (!method7704(i, (byte) -113))
	    return 0;
	if (null != anObjectArray5155[i])
	    return 100;
	return aClass451_5162.method7375(i, 700230136);
    }
    
    public boolean method7685(String string, short i) {
	if (!method7729(1435261678))
	    return false;
	string = string.toLowerCase();
	int i_75_ = (aClass462_5165.aClass275_5081.method5145
		     (Class403.method6615(string, -721302779), (byte) 88));
	if (i_75_ < 0)
	    return false;
	return true;
    }
    
    public boolean method7686(String string, String string_76_, int i) {
	if (!method7729(1937939290))
	    return false;
	string = string.toLowerCase();
	string_76_ = string_76_.toLowerCase();
	int i_77_ = (aClass462_5165.aClass275_5081.method5145
		     (Class403.method6615(string, -721302779), (byte) 95));
	if (i_77_ < 0)
	    return false;
	int i_78_ = (aClass462_5165.aClass275Array5092[i_77_].method5145
		     (Class403.method6615(string_76_, -721302779), (byte) 88));
	if (i_78_ < 0)
	    return false;
	return true;
    }
    
    public synchronized byte[] method7687(String string, String string_79_,
					  int i) {
	if (!method7729(1096173723))
	    return null;
	string = string.toLowerCase();
	string_79_ = string_79_.toLowerCase();
	int i_80_ = (aClass462_5165.aClass275_5081.method5145
		     (Class403.method6615(string, -721302779), (byte) 74));
	if (!method7704(i_80_, (byte) -51))
	    return null;
	int i_81_ = (aClass462_5165.aClass275Array5092[i_80_].method5145
		     (Class403.method6615(string_79_, -721302779), (byte) 64));
	return method7743(i_80_, i_81_, -1112385651);
    }
    
    static final byte[] method7688(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	Class466 class466 = new Class466(class534_sub40);
	Class473 class473 = class466.method7578(-32219933);
	int i = class466.method7576((byte) 7);
	if (i < 0 || 852448745 * anInt5164 != 0 && i > 852448745 * anInt5164)
	    throw new RuntimeException();
	if (class473 == Class473.aClass473_5172) {
	    byte[] is_82_ = new byte[i];
	    class534_sub40.method16735(is_82_, 0, i, (short) -10859);
	    return is_82_;
	}
	int i_83_ = class466.method7577(1971173011);
	if (i_83_ < 0
	    || 0 != 852448745 * anInt5164 && i_83_ > 852448745 * anInt5164)
	    throw new RuntimeException();
	byte[] is_84_;
	if (class473 == Class473.aClass473_5169) {
	    is_84_ = new byte[i_83_];
	    Class708.method14261(is_84_, i_83_, is, i, 9);
	} else if (class473 == Class473.aClass473_5167) {
	    is_84_ = new byte[i_83_];
	    synchronized (aClass80_5157) {
		aClass80_5157.method1625(class534_sub40, is_84_, -448427585);
	    }
	} else if (Class473.aClass473_5168 == class473) {
	    try {
		is_84_
		    = Class666.method11020(class534_sub40, i_83_, 1289858381);
	    } catch (IOException ioexception) {
		throw new RuntimeException(ioexception);
	    }
	} else
	    throw new RuntimeException();
	return is_84_;
    }
    
    public boolean method7689(String string, int i) {
	int i_85_ = method7683("", (byte) 1);
	if (i_85_ != -1)
	    return method7663("", string, (byte) 75);
	return method7663(string, "", (byte) -29);
    }
    
    public synchronized boolean method7690(int i, int i_86_) {
	if (!method7664(i, i_86_, 704282504))
	    return false;
	if (null != anObjectArrayArray5156[i]
	    && anObjectArrayArray5156[i][i_86_] != null)
	    return true;
	if (null != anObjectArray5155[i])
	    return true;
	method7665(i, -558799076);
	if (null != anObjectArray5155[i])
	    return true;
	return false;
    }
    
    public synchronized boolean method7691(int i) {
	if (!method7704(i, (byte) -16))
	    return false;
	if (null != anObjectArray5155[i])
	    return true;
	method7665(i, 1424919986);
	if (anObjectArray5155[i] != null)
	    return true;
	return false;
    }
    
    public void method7692(boolean bool, boolean bool_87_, int i) {
	if (method7729(780270386)) {
	    if (bool) {
		aClass462_5165.anIntArray5080 = null;
		aClass462_5165.aClass275_5081 = null;
	    }
	    if (bool_87_) {
		aClass462_5165.anIntArrayArray5091 = null;
		aClass462_5165.aClass275Array5092 = null;
	    }
	}
    }
    
    synchronized boolean method7693(int i, int i_88_, int[] is) {
	if (!method7704(i, (byte) -32))
	    return false;
	if (null == anObjectArray5155[i])
	    return false;
	int i_89_ = aClass462_5165.anIntArray5074[i];
	int[] is_90_ = aClass462_5165.anIntArrayArray5090[i];
	if (anObjectArrayArray5156[i] == null)
	    anObjectArrayArray5156[i]
		= new Object[aClass462_5165.anIntArray5085[i]];
	Object[] objects = anObjectArrayArray5156[i];
	boolean bool = true;
	for (int i_91_ = 0; i_91_ < i_89_; i_91_++) {
	    int i_92_;
	    if (is_90_ == null)
		i_92_ = i_91_;
	    else
		i_92_ = is_90_[i_91_];
	    if (null == objects[i_92_]) {
		bool = false;
		break;
	    }
	}
	if (bool)
	    return true;
	byte[] is_93_;
	if (is != null
	    && (0 != is[0] || is[1] != 0 || 0 != is[2] || is[3] != 0)) {
	    is_93_ = Class20.method803(anObjectArray5155[i], true, (byte) 3);
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is_93_);
	    int i_94_ = class534_sub40.method16527(-2098729680);
	    int i_95_ = class534_sub40.method16533(-258848859);
	    int i_96_ = ((i_94_ == Class473.aClass473_5172.method93() ? 5 : 9)
			 + i_95_);
	    class534_sub40.method16555(is, 5, i_96_, 1781931159);
	} else
	    is_93_ = Class20.method803(anObjectArray5155[i], false, (byte) 3);
	byte[] is_97_;
	try {
	    is_97_ = Class465.method7572(is_93_, (byte) -23);
	} catch (RuntimeException runtimeexception) {
	    throw Class48.method1140
		      (runtimeexception,
		       new StringBuilder().append(is != null).append(" ")
			   .append
			   (i).append
			   (" ").append
			   (is_93_.length).append
			   (" ").append
			   (Class317.method5744(is_93_, is_93_.length,
						1300836378))
			   .append
			   (" ").append
			   (Class317.method5744(is_93_, is_93_.length - 2,
						-445137064))
			   .append
			   (" ").append
			   (aClass462_5165.anIntArray5083[i]).append
			   (" ").append
			   (aClass462_5165.anInt5075 * -461160727).toString());
	}
	if (aBool5158)
	    anObjectArray5155[i] = null;
	if (i_89_ > 1) {
	    if (anInt5154 * 1348122519 != 2) {
		int i_98_ = is_97_.length;
		int i_99_ = is_97_[--i_98_] & 0xff;
		i_98_ -= i_99_ * i_89_ * 4;
		Class534_Sub40 class534_sub40 = new Class534_Sub40(is_97_);
		int[] is_100_ = new int[i_89_];
		class534_sub40.anInt10811 = i_98_ * -1387468933;
		for (int i_101_ = 0; i_101_ < i_99_; i_101_++) {
		    int i_102_ = 0;
		    for (int i_103_ = 0; i_103_ < i_89_; i_103_++) {
			i_102_ += class534_sub40.method16533(-258848859);
			is_100_[i_103_] += i_102_;
		    }
		}
		byte[][] is_104_ = new byte[i_89_][];
		for (int i_105_ = 0; i_105_ < i_89_; i_105_++) {
		    is_104_[i_105_] = new byte[is_100_[i_105_]];
		    is_100_[i_105_] = 0;
		}
		class534_sub40.anInt10811 = i_98_ * -1387468933;
		int i_106_ = 0;
		for (int i_107_ = 0; i_107_ < i_99_; i_107_++) {
		    int i_108_ = 0;
		    for (int i_109_ = 0; i_109_ < i_89_; i_109_++) {
			i_108_ += class534_sub40.method16533(-258848859);
			System.arraycopy(is_97_, i_106_, is_104_[i_109_],
					 is_100_[i_109_], i_108_);
			is_100_[i_109_] += i_108_;
			i_106_ += i_108_;
		    }
		}
		for (int i_110_ = 0; i_110_ < i_89_; i_110_++) {
		    int i_111_;
		    if (is_90_ == null)
			i_111_ = i_110_;
		    else
			i_111_ = is_90_[i_110_];
		    if (anInt5154 * 1348122519 == 0)
			objects[i_111_] = Class30.method882(is_104_[i_110_],
							    false, 1111281270);
		    else
			objects[i_111_] = is_104_[i_110_];
		}
	    } else {
		int i_112_ = is_97_.length;
		int i_113_ = is_97_[--i_112_] & 0xff;
		i_112_ -= i_113_ * i_89_ * 4;
		Class534_Sub40 class534_sub40 = new Class534_Sub40(is_97_);
		int i_114_ = 0;
		int i_115_ = 0;
		class534_sub40.anInt10811 = -1387468933 * i_112_;
		for (int i_116_ = 0; i_116_ < i_113_; i_116_++) {
		    int i_117_ = 0;
		    for (int i_118_ = 0; i_118_ < i_89_; i_118_++) {
			i_117_ += class534_sub40.method16533(-258848859);
			int i_119_;
			if (null == is_90_)
			    i_119_ = i_118_;
			else
			    i_119_ = is_90_[i_118_];
			if (i_88_ == i_119_) {
			    i_114_ += i_117_;
			    i_115_ = i_119_;
			}
		    }
		}
		if (i_114_ == 0)
		    return true;
		byte[] is_120_ = new byte[i_114_];
		i_114_ = 0;
		class534_sub40.anInt10811 = -1387468933 * i_112_;
		int i_121_ = 0;
		for (int i_122_ = 0; i_122_ < i_113_; i_122_++) {
		    int i_123_ = 0;
		    for (int i_124_ = 0; i_124_ < i_89_; i_124_++) {
			i_123_ += class534_sub40.method16533(-258848859);
			int i_125_;
			if (null == is_90_)
			    i_125_ = i_124_;
			else
			    i_125_ = is_90_[i_124_];
			if (i_125_ == i_88_) {
			    System.arraycopy(is_97_, i_121_, is_120_, i_114_,
					     i_123_);
			    i_114_ += i_123_;
			}
			i_121_ += i_123_;
		    }
		}
		objects[i_115_] = is_120_;
	    }
	} else {
	    int i_126_;
	    if (is_90_ == null)
		i_126_ = 0;
	    else
		i_126_ = is_90_[0];
	    if (anInt5154 * 1348122519 == 0)
		objects[i_126_] = Class30.method882(is_97_, false, 1111281270);
	    else
		objects[i_126_] = is_97_;
	}
	return true;
    }
    
    public int method7694() {
	if (!method7729(849783508))
	    throw new IllegalStateException("");
	return -461160727 * aClass462_5165.anInt5075;
    }
    
    public int method7695() {
	if (!method7729(1734603344))
	    throw new IllegalStateException("");
	return -461160727 * aClass462_5165.anInt5075;
    }
    
    public int method7696() {
	if (!method7729(563553429))
	    throw new IllegalStateException("");
	return -461160727 * aClass462_5165.anInt5075;
    }
    
    public synchronized boolean method7697(int i, int i_127_) {
	if (!method7729(864611778))
	    return false;
	if (i < 0 || i_127_ < 0 || i >= aClass462_5165.anIntArray5085.length
	    || i_127_ >= aClass462_5165.anIntArray5085[i]) {
	    if (aBool5163)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_127_).toString());
	    return false;
	}
	return true;
    }
    
    public synchronized boolean method7698(int i, int i_128_) {
	if (!method7729(275152117))
	    return false;
	if (i < 0 || i_128_ < 0 || i >= aClass462_5165.anIntArray5085.length
	    || i_128_ >= aClass462_5165.anIntArray5085[i]) {
	    if (aBool5163)
		throw new IllegalArgumentException(new StringBuilder().append
						       (i).append
						       (" ").append
						       (i_128_).toString());
	    return false;
	}
	return true;
    }
    
    public void method7699(int i) {
	aClass451_5162.method7374(i, 2144619450);
    }
    
    public synchronized boolean method7700(int i) {
	if (!method7704(i, (byte) -98))
	    return false;
	if (null != anObjectArray5155[i])
	    return true;
	method7665(i, 310504727);
	if (anObjectArray5155[i] != null)
	    return true;
	return false;
    }
    
    public synchronized boolean method7701(int i, int i_129_) {
	if (!method7664(i, i_129_, -1218520780))
	    return false;
	if (null != anObjectArrayArray5156[i]
	    && anObjectArrayArray5156[i][i_129_] != null)
	    return true;
	if (null != anObjectArray5155[i])
	    return true;
	method7665(i, 1037315150);
	if (null != anObjectArray5155[i])
	    return true;
	return false;
    }
    
    public synchronized boolean method7702(int i) {
	if (!method7729(457261910))
	    return false;
	if (aClass462_5165.anIntArray5085.length == 1)
	    return method7669(0, i, 1804616883);
	if (!method7704(i, (byte) -91))
	    return false;
	if (aClass462_5165.anIntArray5085[i] == 1)
	    return method7669(i, 0, 1804616883);
	throw new RuntimeException();
    }
    
    public boolean method7703(String string) {
	if (!method7729(330423414))
	    return false;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 82));
	return method7681(i, 1811515016);
    }
    
    synchronized boolean method7704(int i, byte i_130_) {
	if (!method7729(1555509874))
	    return false;
	if (i < 0 || i >= aClass462_5165.anIntArray5085.length
	    || aClass462_5165.anIntArray5085[i] == 0) {
	    if (aBool5163)
		throw new IllegalArgumentException(Integer.toString(i));
	    return false;
	}
	return true;
    }
    
    public boolean method7705(String string, int i) {
	if (!method7729(829628123))
	    return false;
	string = string.toLowerCase();
	int i_131_ = (aClass462_5165.aClass275_5081.method5145
		      (Class403.method6615(string, -721302779), (byte) 52));
	return method7681(i_131_, -1003043606);
    }
    
    public synchronized boolean method7706() {
	if (!method7729(1671802281))
	    return false;
	boolean bool = true;
	for (int i = 0; i < aClass462_5165.anIntArray5086.length; i++) {
	    int i_132_ = aClass462_5165.anIntArray5086[i];
	    if (null == anObjectArray5155[i_132_]) {
		method7665(i_132_, 1758498567);
		if (null == anObjectArray5155[i_132_])
		    bool = false;
	    }
	}
	return bool;
    }
    
    public synchronized boolean method7707(int i) {
	if (!method7729(321776531))
	    return false;
	if (aClass462_5165.anIntArray5085.length == 1)
	    return method7669(0, i, 1804616883);
	if (!method7704(i, (byte) -95))
	    return false;
	if (aClass462_5165.anIntArray5085[i] == 1)
	    return method7669(i, 0, 1804616883);
	throw new RuntimeException();
    }
    
    public synchronized int method7708(int i) {
	if (!method7704(i, (byte) -22))
	    return 0;
	if (null != anObjectArray5155[i])
	    return 100;
	return aClass451_5162.method7375(i, 1967342710);
    }
    
    public synchronized int method7709(int i) {
	if (!method7704(i, (byte) -78))
	    return 0;
	if (null != anObjectArray5155[i])
	    return 100;
	return aClass451_5162.method7375(i, 929746694);
    }
    
    public synchronized byte[] method7710(int i) {
	if (!method7729(1144729998))
	    return null;
	if (1 == aClass462_5165.anIntArray5085.length)
	    return method7743(0, i, -1420626208);
	if (!method7704(i, (byte) -46))
	    return null;
	if (1 == aClass462_5165.anIntArray5085[i])
	    return method7743(i, 0, -1889165628);
	throw new RuntimeException();
    }
    
    public synchronized int[] method7711(int i) {
	if (!method7704(i, (byte) -104))
	    return null;
	int[] is = aClass462_5165.anIntArrayArray5090[i];
	if (is == null) {
	    is = new int[aClass462_5165.anIntArray5074[i]];
	    for (int i_133_ = 0; i_133_ < is.length; i_133_++)
		is[i_133_] = i_133_;
	}
	return is;
    }
    
    public synchronized int[] method7712(int i) {
	if (!method7704(i, (byte) -114))
	    return null;
	int[] is = aClass462_5165.anIntArrayArray5090[i];
	if (is == null) {
	    is = new int[aClass462_5165.anIntArray5074[i]];
	    for (int i_134_ = 0; i_134_ < is.length; i_134_++)
		is[i_134_] = i_134_;
	}
	return is;
    }
    
    public boolean method7713(int i) {
	if (!method7729(752396179))
	    return false;
	if (1 == aClass462_5165.anIntArray5085.length)
	    return method7664(0, i, 991140109);
	if (!method7704(i, (byte) -31))
	    return false;
	if (aClass462_5165.anIntArray5085[i] == 1)
	    return method7664(i, 0, -413303948);
	throw new RuntimeException();
    }
    
    public int method7714(int i) {
	if (!method7704(i, (byte) -30))
	    return 0;
	return aClass462_5165.anIntArray5085[i];
    }
    
    public int method7715() {
	if (!method7729(1604946992))
	    return -1;
	return aClass462_5165.anIntArray5085.length;
    }
    
    public int method7716() {
	if (!method7729(853209235))
	    return -1;
	return aClass462_5165.anIntArray5085.length;
    }
    
    public void method7717(boolean bool, boolean bool_135_) {
	if (method7729(1954396686)) {
	    if (bool) {
		aClass462_5165.anIntArray5080 = null;
		aClass462_5165.aClass275_5081 = null;
	    }
	    if (bool_135_) {
		aClass462_5165.anIntArrayArray5091 = null;
		aClass462_5165.aClass275Array5092 = null;
	    }
	}
    }
    
    synchronized boolean method7718(int i, int i_136_, int[] is) {
	if (!method7704(i, (byte) -27))
	    return false;
	if (null == anObjectArray5155[i])
	    return false;
	int i_137_ = aClass462_5165.anIntArray5074[i];
	int[] is_138_ = aClass462_5165.anIntArrayArray5090[i];
	if (anObjectArrayArray5156[i] == null)
	    anObjectArrayArray5156[i]
		= new Object[aClass462_5165.anIntArray5085[i]];
	Object[] objects = anObjectArrayArray5156[i];
	boolean bool = true;
	for (int i_139_ = 0; i_139_ < i_137_; i_139_++) {
	    int i_140_;
	    if (is_138_ == null)
		i_140_ = i_139_;
	    else
		i_140_ = is_138_[i_139_];
	    if (null == objects[i_140_]) {
		bool = false;
		break;
	    }
	}
	if (bool)
	    return true;
	byte[] is_141_;
	if (is != null
	    && (0 != is[0] || is[1] != 0 || 0 != is[2] || is[3] != 0)) {
	    is_141_ = Class20.method803(anObjectArray5155[i], true, (byte) 3);
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is_141_);
	    int i_142_ = class534_sub40.method16527(2021642891);
	    int i_143_ = class534_sub40.method16533(-258848859);
	    int i_144_
		= ((i_142_ == Class473.aClass473_5172.method93() ? 5 : 9)
		   + i_143_);
	    class534_sub40.method16555(is, 5, i_144_, 1781931159);
	} else
	    is_141_ = Class20.method803(anObjectArray5155[i], false, (byte) 3);
	byte[] is_145_;
	try {
	    is_145_ = Class465.method7572(is_141_, (byte) 28);
	} catch (RuntimeException runtimeexception) {
	    throw Class48.method1140
		      (runtimeexception,
		       new StringBuilder().append(is != null).append(" ")
			   .append
			   (i).append
			   (" ").append
			   (is_141_.length).append
			   (" ").append
			   (Class317.method5744(is_141_, is_141_.length,
						733208296))
			   .append
			   (" ").append
			   (Class317.method5744(is_141_, is_141_.length - 2,
						-871383825))
			   .append
			   (" ").append
			   (aClass462_5165.anIntArray5083[i]).append
			   (" ").append
			   (aClass462_5165.anInt5075 * -461160727).toString());
	}
	if (aBool5158)
	    anObjectArray5155[i] = null;
	if (i_137_ > 1) {
	    if (anInt5154 * 1348122519 != 2) {
		int i_146_ = is_145_.length;
		int i_147_ = is_145_[--i_146_] & 0xff;
		i_146_ -= i_147_ * i_137_ * 4;
		Class534_Sub40 class534_sub40 = new Class534_Sub40(is_145_);
		int[] is_148_ = new int[i_137_];
		class534_sub40.anInt10811 = i_146_ * -1387468933;
		for (int i_149_ = 0; i_149_ < i_147_; i_149_++) {
		    int i_150_ = 0;
		    for (int i_151_ = 0; i_151_ < i_137_; i_151_++) {
			i_150_ += class534_sub40.method16533(-258848859);
			is_148_[i_151_] += i_150_;
		    }
		}
		byte[][] is_152_ = new byte[i_137_][];
		for (int i_153_ = 0; i_153_ < i_137_; i_153_++) {
		    is_152_[i_153_] = new byte[is_148_[i_153_]];
		    is_148_[i_153_] = 0;
		}
		class534_sub40.anInt10811 = i_146_ * -1387468933;
		int i_154_ = 0;
		for (int i_155_ = 0; i_155_ < i_147_; i_155_++) {
		    int i_156_ = 0;
		    for (int i_157_ = 0; i_157_ < i_137_; i_157_++) {
			i_156_ += class534_sub40.method16533(-258848859);
			System.arraycopy(is_145_, i_154_, is_152_[i_157_],
					 is_148_[i_157_], i_156_);
			is_148_[i_157_] += i_156_;
			i_154_ += i_156_;
		    }
		}
		for (int i_158_ = 0; i_158_ < i_137_; i_158_++) {
		    int i_159_;
		    if (is_138_ == null)
			i_159_ = i_158_;
		    else
			i_159_ = is_138_[i_158_];
		    if (anInt5154 * 1348122519 == 0)
			objects[i_159_] = Class30.method882(is_152_[i_158_],
							    false, 1111281270);
		    else
			objects[i_159_] = is_152_[i_158_];
		}
	    } else {
		int i_160_ = is_145_.length;
		int i_161_ = is_145_[--i_160_] & 0xff;
		i_160_ -= i_161_ * i_137_ * 4;
		Class534_Sub40 class534_sub40 = new Class534_Sub40(is_145_);
		int i_162_ = 0;
		int i_163_ = 0;
		class534_sub40.anInt10811 = -1387468933 * i_160_;
		for (int i_164_ = 0; i_164_ < i_161_; i_164_++) {
		    int i_165_ = 0;
		    for (int i_166_ = 0; i_166_ < i_137_; i_166_++) {
			i_165_ += class534_sub40.method16533(-258848859);
			int i_167_;
			if (null == is_138_)
			    i_167_ = i_166_;
			else
			    i_167_ = is_138_[i_166_];
			if (i_136_ == i_167_) {
			    i_162_ += i_165_;
			    i_163_ = i_167_;
			}
		    }
		}
		if (i_162_ == 0)
		    return true;
		byte[] is_168_ = new byte[i_162_];
		i_162_ = 0;
		class534_sub40.anInt10811 = -1387468933 * i_160_;
		int i_169_ = 0;
		for (int i_170_ = 0; i_170_ < i_161_; i_170_++) {
		    int i_171_ = 0;
		    for (int i_172_ = 0; i_172_ < i_137_; i_172_++) {
			i_171_ += class534_sub40.method16533(-258848859);
			int i_173_;
			if (null == is_138_)
			    i_173_ = i_172_;
			else
			    i_173_ = is_138_[i_172_];
			if (i_173_ == i_136_) {
			    System.arraycopy(is_145_, i_169_, is_168_, i_162_,
					     i_171_);
			    i_162_ += i_171_;
			}
			i_169_ += i_171_;
		    }
		}
		objects[i_163_] = is_168_;
	    }
	} else {
	    int i_174_;
	    if (is_138_ == null)
		i_174_ = 0;
	    else
		i_174_ = is_138_[0];
	    if (anInt5154 * 1348122519 == 0)
		objects[i_174_]
		    = Class30.method882(is_145_, false, 1111281270);
	    else
		objects[i_174_] = is_145_;
	}
	return true;
    }
    
    synchronized boolean method7719(int i, int i_175_, int[] is) {
	if (!method7704(i, (byte) -18))
	    return false;
	if (null == anObjectArray5155[i])
	    return false;
	int i_176_ = aClass462_5165.anIntArray5074[i];
	int[] is_177_ = aClass462_5165.anIntArrayArray5090[i];
	if (anObjectArrayArray5156[i] == null)
	    anObjectArrayArray5156[i]
		= new Object[aClass462_5165.anIntArray5085[i]];
	Object[] objects = anObjectArrayArray5156[i];
	boolean bool = true;
	for (int i_178_ = 0; i_178_ < i_176_; i_178_++) {
	    int i_179_;
	    if (is_177_ == null)
		i_179_ = i_178_;
	    else
		i_179_ = is_177_[i_178_];
	    if (null == objects[i_179_]) {
		bool = false;
		break;
	    }
	}
	if (bool)
	    return true;
	byte[] is_180_;
	if (is != null
	    && (0 != is[0] || is[1] != 0 || 0 != is[2] || is[3] != 0)) {
	    is_180_ = Class20.method803(anObjectArray5155[i], true, (byte) 3);
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is_180_);
	    int i_181_ = class534_sub40.method16527(-455127688);
	    int i_182_ = class534_sub40.method16533(-258848859);
	    int i_183_
		= ((i_181_ == Class473.aClass473_5172.method93() ? 5 : 9)
		   + i_182_);
	    class534_sub40.method16555(is, 5, i_183_, 1781931159);
	} else
	    is_180_ = Class20.method803(anObjectArray5155[i], false, (byte) 3);
	byte[] is_184_;
	try {
	    is_184_ = Class465.method7572(is_180_, (byte) -22);
	} catch (RuntimeException runtimeexception) {
	    throw Class48.method1140
		      (runtimeexception,
		       new StringBuilder().append(is != null).append(" ")
			   .append
			   (i).append
			   (" ").append
			   (is_180_.length).append
			   (" ").append
			   (Class317.method5744(is_180_, is_180_.length,
						1118849977))
			   .append
			   (" ").append
			   (Class317.method5744(is_180_, is_180_.length - 2,
						-717554830))
			   .append
			   (" ").append
			   (aClass462_5165.anIntArray5083[i]).append
			   (" ").append
			   (aClass462_5165.anInt5075 * -461160727).toString());
	}
	if (aBool5158)
	    anObjectArray5155[i] = null;
	if (i_176_ > 1) {
	    if (anInt5154 * 1348122519 != 2) {
		int i_185_ = is_184_.length;
		int i_186_ = is_184_[--i_185_] & 0xff;
		i_185_ -= i_186_ * i_176_ * 4;
		Class534_Sub40 class534_sub40 = new Class534_Sub40(is_184_);
		int[] is_187_ = new int[i_176_];
		class534_sub40.anInt10811 = i_185_ * -1387468933;
		for (int i_188_ = 0; i_188_ < i_186_; i_188_++) {
		    int i_189_ = 0;
		    for (int i_190_ = 0; i_190_ < i_176_; i_190_++) {
			i_189_ += class534_sub40.method16533(-258848859);
			is_187_[i_190_] += i_189_;
		    }
		}
		byte[][] is_191_ = new byte[i_176_][];
		for (int i_192_ = 0; i_192_ < i_176_; i_192_++) {
		    is_191_[i_192_] = new byte[is_187_[i_192_]];
		    is_187_[i_192_] = 0;
		}
		class534_sub40.anInt10811 = i_185_ * -1387468933;
		int i_193_ = 0;
		for (int i_194_ = 0; i_194_ < i_186_; i_194_++) {
		    int i_195_ = 0;
		    for (int i_196_ = 0; i_196_ < i_176_; i_196_++) {
			i_195_ += class534_sub40.method16533(-258848859);
			System.arraycopy(is_184_, i_193_, is_191_[i_196_],
					 is_187_[i_196_], i_195_);
			is_187_[i_196_] += i_195_;
			i_193_ += i_195_;
		    }
		}
		for (int i_197_ = 0; i_197_ < i_176_; i_197_++) {
		    int i_198_;
		    if (is_177_ == null)
			i_198_ = i_197_;
		    else
			i_198_ = is_177_[i_197_];
		    if (anInt5154 * 1348122519 == 0)
			objects[i_198_] = Class30.method882(is_191_[i_197_],
							    false, 1111281270);
		    else
			objects[i_198_] = is_191_[i_197_];
		}
	    } else {
		int i_199_ = is_184_.length;
		int i_200_ = is_184_[--i_199_] & 0xff;
		i_199_ -= i_200_ * i_176_ * 4;
		Class534_Sub40 class534_sub40 = new Class534_Sub40(is_184_);
		int i_201_ = 0;
		int i_202_ = 0;
		class534_sub40.anInt10811 = -1387468933 * i_199_;
		for (int i_203_ = 0; i_203_ < i_200_; i_203_++) {
		    int i_204_ = 0;
		    for (int i_205_ = 0; i_205_ < i_176_; i_205_++) {
			i_204_ += class534_sub40.method16533(-258848859);
			int i_206_;
			if (null == is_177_)
			    i_206_ = i_205_;
			else
			    i_206_ = is_177_[i_205_];
			if (i_175_ == i_206_) {
			    i_201_ += i_204_;
			    i_202_ = i_206_;
			}
		    }
		}
		if (i_201_ == 0)
		    return true;
		byte[] is_207_ = new byte[i_201_];
		i_201_ = 0;
		class534_sub40.anInt10811 = -1387468933 * i_199_;
		int i_208_ = 0;
		for (int i_209_ = 0; i_209_ < i_200_; i_209_++) {
		    int i_210_ = 0;
		    for (int i_211_ = 0; i_211_ < i_176_; i_211_++) {
			i_210_ += class534_sub40.method16533(-258848859);
			int i_212_;
			if (null == is_177_)
			    i_212_ = i_211_;
			else
			    i_212_ = is_177_[i_211_];
			if (i_212_ == i_175_) {
			    System.arraycopy(is_184_, i_208_, is_207_, i_201_,
					     i_210_);
			    i_201_ += i_210_;
			}
			i_208_ += i_210_;
		    }
		}
		objects[i_202_] = is_207_;
	    }
	} else {
	    int i_213_;
	    if (is_177_ == null)
		i_213_ = 0;
	    else
		i_213_ = is_177_[0];
	    if (anInt5154 * 1348122519 == 0)
		objects[i_213_]
		    = Class30.method882(is_184_, false, 1111281270);
	    else
		objects[i_213_] = is_184_;
	}
	return true;
    }
    
    public synchronized int method7720(int i) {
	if (!method7704(i, (byte) -70))
	    return 0;
	if (null != anObjectArray5155[i])
	    return 100;
	return aClass451_5162.method7375(i, 1750138226);
    }
    
    public synchronized boolean method7721(int i) {
	if (!method7704(i, (byte) -48))
	    return false;
	if (null != anObjectArray5155[i])
	    return true;
	method7665(i, 1411630187);
	if (anObjectArray5155[i] != null)
	    return true;
	return false;
    }
    
    public int method7722(String string) {
	if (!method7729(998237085))
	    return -1;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 29));
	if (!method7704(i, (byte) -5))
	    return -1;
	return i;
    }
    
    public int method7723(int i) {
	if (!method7729(1929664698))
	    return -1;
	int i_214_ = aClass462_5165.aClass275_5081.method5145(i, (byte) 11);
	if (!method7704(i_214_, (byte) -92))
	    return -1;
	return i_214_;
    }
    
    public boolean method7724(String string) {
	if (!method7729(656991226))
	    return false;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 79));
	if (i < 0)
	    return false;
	return true;
    }
    
    public boolean method7725(String string) {
	if (!method7729(1021465248))
	    return false;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 90));
	if (i < 0)
	    return false;
	return true;
    }
    
    public int method7726(int i, byte i_215_) {
	if (!method7704(i, (byte) -24))
	    return 0;
	return aClass462_5165.anIntArray5085[i];
    }
    
    public boolean method7727(String string) {
	if (!method7729(919131512))
	    return false;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 42));
	if (i < 0)
	    return false;
	return true;
    }
    
    public boolean method7728(String string) {
	if (!method7729(639703760))
	    return false;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 19));
	if (i < 0)
	    return false;
	return true;
    }
    
    synchronized boolean method7729(int i) {
	if (aClass462_5165 == null) {
	    aClass462_5165 = aClass451_5162.method7385(-727244791);
	    if (aClass462_5165 == null)
		return false;
	    anObjectArray5155
		= new Object[-540639821 * aClass462_5165.anInt5082];
	    anObjectArrayArray5156
		= new Object[aClass462_5165.anInt5082 * -540639821][];
	}
	return true;
    }
    
    public boolean method7730(String string, String string_216_) {
	if (!method7729(1874188169))
	    return false;
	string = string.toLowerCase();
	string_216_ = string_216_.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 100));
	if (i < 0)
	    return false;
	int i_217_
	    = (aClass462_5165.aClass275Array5092[i].method5145
	       (Class403.method6615(string_216_, -721302779), (byte) 74));
	if (i_217_ < 0)
	    return false;
	return true;
    }
    
    boolean method7731(String string, String string_218_) {
	if (!method7729(1625017146))
	    return false;
	string = string.toLowerCase();
	string_218_ = string_218_.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 87));
	if (!method7704(i, (byte) -54))
	    return false;
	int i_219_
	    = (aClass462_5165.aClass275Array5092[i].method5145
	       (Class403.method6615(string_218_, -721302779), (byte) 62));
	return method7669(i, i_219_, 1804616883);
    }
    
    public int method7732(String string) {
	if (!method7729(844078631))
	    return -1;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 6));
	if (!method7704(i, (byte) -50))
	    return -1;
	return i;
    }
    
    public int method7733(String string) {
	if (!method7729(1286759981))
	    return 0;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 12));
	return method7684(i, (short) 920);
    }
    
    public Class472(Class451 class451, boolean bool, int i) {
	if (i < 0 || i > 2)
	    throw new IllegalArgumentException("");
	aClass451_5162 = class451;
	aBool5158 = bool;
	anInt5154 = i * -1094502361;
    }
    
    public boolean method7734(String string) {
	int i = method7683("", (byte) 1);
	if (i != -1)
	    return method7663("", string, (byte) 42);
	return method7663(string, "", (byte) -37);
    }
    
    public boolean method7735(String string) {
	int i = method7683("", (byte) 1);
	if (i != -1)
	    return method7663("", string, (byte) 2);
	return method7663(string, "", (byte) 60);
    }
    
    public boolean method7736(String string) {
	if (!method7729(1194761956))
	    return false;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 38));
	return method7681(i, 1466613424);
    }
    
    public int method7737(String string) {
	if (!method7729(1608285329))
	    return 0;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 60));
	return method7684(i, (short) 920);
    }
    
    public synchronized byte[] method7738(int i, byte i_220_) {
	if (!method7729(935004836))
	    return null;
	if (1 == aClass462_5165.anIntArray5085.length)
	    return method7743(0, i, -1361475249);
	if (!method7704(i, (byte) -61))
	    return null;
	if (1 == aClass462_5165.anIntArray5085[i])
	    return method7743(i, 0, -1757850012);
	throw new RuntimeException();
    }
    
    public int method7739(String string) {
	if (!method7729(1250791140))
	    return 0;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 13));
	return method7684(i, (short) 920);
    }
    
    public int method7740(String string) {
	if (!method7729(1512901907))
	    return 0;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 66));
	return method7684(i, (short) 920);
    }
    
    public int method7741(String string) {
	if (!method7729(1227384836))
	    return 0;
	string = string.toLowerCase();
	int i = (aClass462_5165.aClass275_5081.method5145
		 (Class403.method6615(string, -721302779), (byte) 62));
	return method7684(i, (short) 920);
    }
    
    public synchronized void method7742(int i, int i_221_) {
	if (method7704(i, (byte) -16)) {
	    if (anObjectArrayArray5156 != null)
		anObjectArrayArray5156[i] = null;
	}
    }
    
    public byte[] method7743(int i, int i_222_, int i_223_) {
	return method7676(i, i_222_, null, -1975313199);
    }
    
    static final byte[] method7744(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	Class466 class466 = new Class466(class534_sub40);
	Class473 class473 = class466.method7578(-1786906566);
	int i = class466.method7576((byte) 7);
	if (i < 0 || 852448745 * anInt5164 != 0 && i > 852448745 * anInt5164)
	    throw new RuntimeException();
	if (class473 == Class473.aClass473_5172) {
	    byte[] is_224_ = new byte[i];
	    class534_sub40.method16735(is_224_, 0, i, (short) -10514);
	    return is_224_;
	}
	int i_225_ = class466.method7577(1971173011);
	if (i_225_ < 0
	    || 0 != 852448745 * anInt5164 && i_225_ > 852448745 * anInt5164)
	    throw new RuntimeException();
	byte[] is_226_;
	if (class473 == Class473.aClass473_5169) {
	    is_226_ = new byte[i_225_];
	    Class708.method14261(is_226_, i_225_, is, i, 9);
	} else if (class473 == Class473.aClass473_5167) {
	    is_226_ = new byte[i_225_];
	    synchronized (aClass80_5157) {
		aClass80_5157.method1625(class534_sub40, is_226_, -19519334);
	    }
	} else if (Class473.aClass473_5168 == class473) {
	    try {
		is_226_
		    = Class666.method11020(class534_sub40, i_225_, -658151167);
	    } catch (IOException ioexception) {
		throw new RuntimeException(ioexception);
	    }
	} else
	    throw new RuntimeException();
	return is_226_;
    }
    
    public static final int method7745
	(Class44_Sub13 class44_sub13, byte[] is, int i, int i_227_, int i_228_,
	 int i_229_, Class647 class647, Class647 class647_230_, byte i_231_) {
	int i_232_ = 0;
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i_233_ = -1;
	for (;;) {
	    int i_234_ = class534_sub40.method16598((byte) 8);
	    if (0 == i_234_)
		break;
	    i_233_ += i_234_;
	    int i_235_ = 0;
	    boolean bool = false;
	    for (;;) {
		if (bool) {
		    int i_236_ = class534_sub40.method16546(-1706829710);
		    if (0 == i_236_)
			break;
		    class534_sub40.method16527(17312827);
		} else {
		    int i_237_ = class534_sub40.method16546(-1706829710);
		    if (i_237_ == 0)
			break;
		    i_235_ += i_237_ - 1;
		    int i_238_ = i_235_ & 0x3f;
		    int i_239_ = i_235_ >> 6 & 0x3f;
		    int i_240_ = class534_sub40.method16527(67641907) >> 2;
		    int i_241_ = i_240_ & 0x3;
		    i_240_ >>= 2;
		    int i_242_ = i_239_ + i;
		    int i_243_ = i_227_ + i_238_;
		    Class602 class602
			= (Class602) class44_sub13.method91(i_233_, 283787349);
		    int i_244_;
		    int i_245_;
		    if (0 == (i_241_ & 0x1)) {
			i_244_ = class602.anInt7904 * -1082258489;
			i_245_ = class602.anInt7928 * -1990374967;
		    } else {
			i_244_ = -1990374967 * class602.anInt7928;
			i_245_ = class602.anInt7904 * -1082258489;
		    }
		    if (i_242_ < i_228_ && i_243_ < i_229_
			&& i_242_ + i_244_ >= 0 && i_245_ + i_243_ >= 0) {
			if ((i_240_
			     != Class595.aClass595_7846.anInt7852 * 847393323)
			    || Class44_Sub6.aClass534_Sub35_10989
				   .aClass690_Sub10_10751
				   .method16970((byte) 12) != 0
			    || 0 != -2134171963 * class602.anInt7907
			    || 1 == class602.anInt7923 * -499459421
			    || class602.aBool7938) {
			    if (!class602.method9984(class647_230_,
						     -2131344096)) {
				class647.anInt8375 = i_233_ * 511701673;
				i_232_++;
			    }
			    bool = true;
			}
		    }
		}
	    }
	}
	return i_232_;
    }
}
