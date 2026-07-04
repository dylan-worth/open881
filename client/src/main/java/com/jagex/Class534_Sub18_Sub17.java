/* Class534_Sub18_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub18_Sub17 extends Class534_Sub18
{
    int anInt11871;
    byte[][] aByteArrayArray11872;
    static Class472 aClass472_11873;
    static Class472 aClass472_11874;
    Class167[] aClass167Array11875;
    
    public boolean method18435(int i) {
	return aClass167Array11875[i].aBool1783;
    }
    
    public boolean method18436(int i) {
	if (null != aClass167Array11875)
	    return true;
	if (null == aByteArrayArray11872) {
	    synchronized (aClass472_11874) {
		if (!aClass472_11874.method7681(anInt11871 * -403250213,
						-400560248)) {
		    boolean bool = false;
		    return bool;
		}
		int[] is = aClass472_11874.method7678(anInt11871 * -403250213,
						      (byte) 52);
		aByteArrayArray11872 = new byte[is.length][];
		for (int i_0_ = 0; i_0_ < is.length; i_0_++)
		    aByteArrayArray11872[i_0_]
			= aClass472_11874.method7743(anInt11871 * -403250213,
						     is[i_0_], -1164354286);
	    }
	}
	boolean bool = true;
	for (int i_1_ = 0; i_1_ < aByteArrayArray11872.length; i_1_++) {
	    byte[] is = aByteArrayArray11872[i_1_];
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	    class534_sub40.anInt10811 = -1387468933;
	    int i_2_ = class534_sub40.method16529((byte) 1);
	    synchronized (aClass472_11873) {
		bool &= aClass472_11873.method7670(i_2_, (byte) -128);
	    }
	}
	if (!bool)
	    return false;
	Class700 class700 = new Class700();
	int[] is;
	synchronized (aClass472_11874) {
	    int i_3_ = aClass472_11874.method7726(-403250213 * anInt11871,
						  (byte) 108);
	    aClass167Array11875 = new Class167[i_3_];
	    is = aClass472_11874.method7678(-403250213 * anInt11871,
					    (byte) 106);
	}
	for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
	    byte[] is_5_ = aByteArrayArray11872[i_4_];
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is_5_);
	    class534_sub40.anInt10811 = -1387468933;
	    int i_6_ = class534_sub40.method16529((byte) 1);
	    Class534_Sub24 class534_sub24 = null;
	    for (Class534_Sub24 class534_sub24_7_
		     = (Class534_Sub24) class700.method14135((byte) -1);
		 class534_sub24_7_ != null;
		 class534_sub24_7_
		     = (Class534_Sub24) class700.method14139(1144946629)) {
		if (-884140749 * class534_sub24_7_.anInt10562 == i_6_) {
		    class534_sub24 = class534_sub24_7_;
		    break;
		}
	    }
	    if (class534_sub24 == null) {
		synchronized (aClass472_11873) {
		    class534_sub24
			= new Class534_Sub24(i_6_, (aClass472_11873.method7738
						    (i_6_, (byte) -91)));
		}
		class700.method14131(class534_sub24, (short) 789);
	    }
	    aClass167Array11875[is[i_4_]]
		= new Class167(is_5_, class534_sub24);
	}
	aByteArrayArray11872 = null;
	return true;
    }
    
    public boolean method18437(int i, int i_8_) {
	return aClass167Array11875[i].aBool1782;
    }
    
    public boolean method18438(int i, byte i_9_) {
	return aClass167Array11875[i].aBool1783;
    }
    
    public boolean method18439(int i, int i_10_) {
	return aClass167Array11875[i].aBool1775;
    }
    
    public static void method18440(Class472 class472, Class472 class472_11_,
				   int i) {
	aClass472_11874 = class472;
	aClass472_11873 = class472_11_;
    }
    
    public boolean method18441() {
	if (null != aClass167Array11875)
	    return true;
	if (null == aByteArrayArray11872) {
	    synchronized (aClass472_11874) {
		if (!aClass472_11874.method7681(anInt11871 * -403250213,
						-105482866)) {
		    boolean bool = false;
		    return bool;
		}
		int[] is = aClass472_11874.method7678(anInt11871 * -403250213,
						      (byte) 5);
		aByteArrayArray11872 = new byte[is.length][];
		for (int i = 0; i < is.length; i++)
		    aByteArrayArray11872[i]
			= aClass472_11874.method7743(anInt11871 * -403250213,
						     is[i], -1828489032);
	    }
	}
	boolean bool = true;
	for (int i = 0; i < aByteArrayArray11872.length; i++) {
	    byte[] is = aByteArrayArray11872[i];
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	    class534_sub40.anInt10811 = -1387468933;
	    int i_12_ = class534_sub40.method16529((byte) 1);
	    synchronized (aClass472_11873) {
		bool &= aClass472_11873.method7670(i_12_, (byte) -66);
	    }
	}
	if (!bool)
	    return false;
	Class700 class700 = new Class700();
	int[] is;
	synchronized (aClass472_11874) {
	    int i = aClass472_11874.method7726(-403250213 * anInt11871,
					       (byte) 50);
	    aClass167Array11875 = new Class167[i];
	    is = aClass472_11874.method7678(-403250213 * anInt11871,
					    (byte) 25);
	}
	for (int i = 0; i < is.length; i++) {
	    byte[] is_13_ = aByteArrayArray11872[i];
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is_13_);
	    class534_sub40.anInt10811 = -1387468933;
	    int i_14_ = class534_sub40.method16529((byte) 1);
	    Class534_Sub24 class534_sub24 = null;
	    for (Class534_Sub24 class534_sub24_15_
		     = (Class534_Sub24) class700.method14135((byte) -1);
		 class534_sub24_15_ != null;
		 class534_sub24_15_
		     = (Class534_Sub24) class700.method14139(1422383394)) {
		if (-884140749 * class534_sub24_15_.anInt10562 == i_14_) {
		    class534_sub24 = class534_sub24_15_;
		    break;
		}
	    }
	    if (class534_sub24 == null) {
		synchronized (aClass472_11873) {
		    class534_sub24
			= new Class534_Sub24(i_14_, (aClass472_11873.method7738
						     (i_14_, (byte) -55)));
		}
		class700.method14131(class534_sub24, (short) 789);
	    }
	    aClass167Array11875[is[i]] = new Class167(is_13_, class534_sub24);
	}
	aByteArrayArray11872 = null;
	return true;
    }
    
    public boolean method18442(int i) {
	return aClass167Array11875[i].aBool1783;
    }
    
    public boolean method18443() {
	if (null != aClass167Array11875)
	    return true;
	if (null == aByteArrayArray11872) {
	    synchronized (aClass472_11874) {
		if (!aClass472_11874.method7681(anInt11871 * -403250213,
						89107559)) {
		    boolean bool = false;
		    return bool;
		}
		int[] is = aClass472_11874.method7678(anInt11871 * -403250213,
						      (byte) 110);
		aByteArrayArray11872 = new byte[is.length][];
		for (int i = 0; i < is.length; i++)
		    aByteArrayArray11872[i]
			= aClass472_11874.method7743(anInt11871 * -403250213,
						     is[i], -1588073820);
	    }
	}
	boolean bool = true;
	for (int i = 0; i < aByteArrayArray11872.length; i++) {
	    byte[] is = aByteArrayArray11872[i];
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	    class534_sub40.anInt10811 = -1387468933;
	    int i_16_ = class534_sub40.method16529((byte) 1);
	    synchronized (aClass472_11873) {
		bool &= aClass472_11873.method7670(i_16_, (byte) -29);
	    }
	}
	if (!bool)
	    return false;
	Class700 class700 = new Class700();
	int[] is;
	synchronized (aClass472_11874) {
	    int i = aClass472_11874.method7726(-403250213 * anInt11871,
					       (byte) 33);
	    aClass167Array11875 = new Class167[i];
	    is = aClass472_11874.method7678(-403250213 * anInt11871,
					    (byte) 18);
	}
	for (int i = 0; i < is.length; i++) {
	    byte[] is_17_ = aByteArrayArray11872[i];
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is_17_);
	    class534_sub40.anInt10811 = -1387468933;
	    int i_18_ = class534_sub40.method16529((byte) 1);
	    Class534_Sub24 class534_sub24 = null;
	    for (Class534_Sub24 class534_sub24_19_
		     = (Class534_Sub24) class700.method14135((byte) -1);
		 class534_sub24_19_ != null;
		 class534_sub24_19_
		     = (Class534_Sub24) class700.method14139(1348529692)) {
		if (-884140749 * class534_sub24_19_.anInt10562 == i_18_) {
		    class534_sub24 = class534_sub24_19_;
		    break;
		}
	    }
	    if (class534_sub24 == null) {
		synchronized (aClass472_11873) {
		    class534_sub24
			= new Class534_Sub24(i_18_, (aClass472_11873.method7738
						     (i_18_, (byte) -22)));
		}
		class700.method14131(class534_sub24, (short) 789);
	    }
	    aClass167Array11875[is[i]] = new Class167(is_17_, class534_sub24);
	}
	aByteArrayArray11872 = null;
	return true;
    }
    
    public boolean method18444(int i) {
	return aClass167Array11875[i].aBool1783;
    }
    
    public boolean method18445(int i) {
	return aClass167Array11875[i].aBool1782;
    }
    
    public boolean method18446(int i) {
	return aClass167Array11875[i].aBool1782;
    }
    
    public boolean method18447(int i) {
	return aClass167Array11875[i].aBool1782;
    }
    
    public boolean method18448(int i) {
	return aClass167Array11875[i].aBool1775;
    }
    
    public boolean method18449() {
	if (null != aClass167Array11875)
	    return true;
	if (null == aByteArrayArray11872) {
	    synchronized (aClass472_11874) {
		if (!aClass472_11874.method7681(anInt11871 * -403250213,
						1532010024)) {
		    boolean bool = false;
		    return bool;
		}
		int[] is = aClass472_11874.method7678(anInt11871 * -403250213,
						      (byte) 73);
		aByteArrayArray11872 = new byte[is.length][];
		for (int i = 0; i < is.length; i++)
		    aByteArrayArray11872[i]
			= aClass472_11874.method7743(anInt11871 * -403250213,
						     is[i], -1402688888);
	    }
	}
	boolean bool = true;
	for (int i = 0; i < aByteArrayArray11872.length; i++) {
	    byte[] is = aByteArrayArray11872[i];
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	    class534_sub40.anInt10811 = -1387468933;
	    int i_20_ = class534_sub40.method16529((byte) 1);
	    synchronized (aClass472_11873) {
		bool &= aClass472_11873.method7670(i_20_, (byte) -119);
	    }
	}
	if (!bool)
	    return false;
	Class700 class700 = new Class700();
	int[] is;
	synchronized (aClass472_11874) {
	    int i = aClass472_11874.method7726(-403250213 * anInt11871,
					       (byte) 15);
	    aClass167Array11875 = new Class167[i];
	    is = aClass472_11874.method7678(-403250213 * anInt11871,
					    (byte) 52);
	}
	for (int i = 0; i < is.length; i++) {
	    byte[] is_21_ = aByteArrayArray11872[i];
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is_21_);
	    class534_sub40.anInt10811 = -1387468933;
	    int i_22_ = class534_sub40.method16529((byte) 1);
	    Class534_Sub24 class534_sub24 = null;
	    for (Class534_Sub24 class534_sub24_23_
		     = (Class534_Sub24) class700.method14135((byte) -1);
		 class534_sub24_23_ != null;
		 class534_sub24_23_
		     = (Class534_Sub24) class700.method14139(1398514832)) {
		if (-884140749 * class534_sub24_23_.anInt10562 == i_22_) {
		    class534_sub24 = class534_sub24_23_;
		    break;
		}
	    }
	    if (class534_sub24 == null) {
		synchronized (aClass472_11873) {
		    class534_sub24
			= new Class534_Sub24(i_22_, (aClass472_11873.method7738
						     (i_22_, (byte) -14)));
		}
		class700.method14131(class534_sub24, (short) 789);
	    }
	    aClass167Array11875[is[i]] = new Class167(is_21_, class534_sub24);
	}
	aByteArrayArray11872 = null;
	return true;
    }
    
    public boolean method18450(int i) {
	return aClass167Array11875[i].aBool1783;
    }
    
    public boolean method18451(int i) {
	return aClass167Array11875[i].aBool1782;
    }
    
    public Class534_Sub18_Sub17(int i) {
	anInt11871 = 421945427 * i;
    }
    
    public boolean method18452(int i) {
	return aClass167Array11875[i].aBool1775;
    }
    
    public boolean method18453(int i) {
	return aClass167Array11875[i].aBool1775;
    }
}
