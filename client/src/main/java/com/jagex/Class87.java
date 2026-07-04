/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Random;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;

public class Class87
{
    Class89[] aClass89Array847;
    static final int anInt848 = 0;
    Class472 aClass472_849;
    int anInt850;
    
    public Class94[] method1700(int i) {
	if (i < 0 || i >= aClass89Array847.length)
	    return method1704(0, 0, 1786796379).aClass94Array886;
	Class89 class89 = aClass89Array847[i];
	if (!class89.aBool885 || class89.aClass94Array886.length <= 1)
	    return class89.aClass94Array886;
	int i_0_ = -308310523 * anInt850 == -1 ? 0 : 1;
	Random random = new Random();
	Class94[] class94s = new Class94[class89.aClass94Array886.length];
	System.arraycopy(class89.aClass94Array886, 0, class94s, 0,
			 class94s.length);
	for (int i_1_ = i_0_; i_1_ < class94s.length; i_1_++) {
	    int i_2_
		= (Class200_Sub21.method15637(random, class94s.length - i_0_,
					      1902134044)
		   + i_0_);
	    Class94 class94 = class89.aClass94Array886[i_1_];
	    class94s[i_1_] = class94s[i_2_];
	    class94s[i_2_] = class94;
	}
	return class94s;
    }
    
    public boolean method1701(byte i) {
	return -1 != anInt850 * -308310523;
    }
    
    public Class82 method1702(int i, int i_3_) {
	byte[] is = aClass472_849.method7743(i, 0, -976186294);
	Class82 class82 = new Class82();
	class82.method1640(new Class534_Sub40(is), (byte) 18);
	return class82;
    }
    
    public Class94[] method1703(int i, byte i_4_) {
	if (i < 0 || i >= aClass89Array847.length)
	    return method1704(0, 0, 2045175706).aClass94Array886;
	Class89 class89 = aClass89Array847[i];
	if (!class89.aBool885 || class89.aClass94Array886.length <= 1)
	    return class89.aClass94Array886;
	int i_5_ = -308310523 * anInt850 == -1 ? 0 : 1;
	Random random = new Random();
	Class94[] class94s = new Class94[class89.aClass94Array886.length];
	System.arraycopy(class89.aClass94Array886, 0, class94s, 0,
			 class94s.length);
	for (int i_6_ = i_5_; i_6_ < class94s.length; i_6_++) {
	    int i_7_
		= (Class200_Sub21.method15637(random, class94s.length - i_5_,
					      1902134044)
		   + i_5_);
	    Class94 class94 = class89.aClass94Array886[i_6_];
	    class94s[i_6_] = class94s[i_7_];
	    class94s[i_7_] = class94;
	}
	return class94s;
    }
    
    Class89 method1704(int i, int i_8_, int i_9_) {
	if (anInt850 * -308310523 == -1)
	    return new Class89(false, new Class94[0]);
	Class94 class94 = new Class94(anInt850 * -308310523, i, i_8_);
	return new Class89(false, new Class94[] { class94 });
    }
    
    public Class87(Class675 class675, Class672 class672, Class472 class472) {
	aClass472_849 = class472;
	Class534_Sub40 class534_sub40
	    = new Class534_Sub40(aClass472_849.method7743(0, 0, -797704082));
	int i = ((class534_sub40.aByteArray10810 == null
		  || class534_sub40.aByteArray10810.length < 1)
		 ? -1 : class534_sub40.method16527(2059347763));
	if (i < 4) {
	    aClass89Array847 = new Class89[0];
	    anInt850 = -2051739341;
	} else {
	    int i_10_ = class534_sub40.method16527(-671910085);
	    Class397[] class397s = Class675.method11127(1085173643);
	    boolean bool = true;
	    if (class397s.length != i_10_)
		bool = false;
	    else {
		for (int i_11_ = 0; i_11_ < class397s.length; i_11_++) {
		    int i_12_ = class534_sub40.method16527(523077669);
		    if (class397s[i_11_].anInt4119 * 2114643719 != i_12_) {
			bool = false;
			break;
		    }
		}
	    }
	    if (bool) {
		int i_13_ = class534_sub40.method16527(-663092453);
		int i_14_ = class534_sub40.method16527(-1999720851);
		int i_15_;
		int i_16_;
		if (i > 2) {
		    anInt850
			= class534_sub40.method16530((byte) -96) * 2051739341;
		    i_15_ = class534_sub40.method16531(1022270472);
		    i_16_ = class534_sub40.method16529((byte) 1);
		} else {
		    anInt850 = -2051739341;
		    i_15_ = 0;
		    i_16_ = 0;
		}
		aClass89Array847 = new Class89[1 + i_14_];
		for (int i_17_ = 0; i_17_ < i_13_; i_17_++) {
		    int i_18_ = class534_sub40.method16527(1542436001);
		    boolean bool_19_
			= class534_sub40.method16527(-638543645) == 1;
		    int i_20_ = class534_sub40.method16529((byte) 1);
		    Class94[] class94s;
		    if (anInt850 * -308310523 == -1) {
			class94s = new Class94[i_20_];
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
			    int i_22_ = class534_sub40.method16529((byte) 1);
			    int i_23_ = class534_sub40.method16531(1316008144);
			    int i_24_ = class534_sub40.method16529((byte) 1);
			    class94s[i_21_] = new Class94(i_22_, i_23_, i_24_);
			}
			aClass89Array847[i_18_]
			    = new Class89(bool_19_, class94s);
		    } else {
			class94s = new Class94[i_20_ + 1];
			class94s[0]
			    = new Class94(-308310523 * anInt850, i_15_, i_16_);
			for (int i_25_ = 0; i_25_ < i_20_; i_25_++) {
			    int i_26_ = class534_sub40.method16529((byte) 1);
			    int i_27_ = class534_sub40.method16531(625810261);
			    int i_28_ = class534_sub40.method16529((byte) 1);
			    class94s[1 + i_25_]
				= new Class94(i_26_, i_27_, i_28_);
			}
		    }
		    aClass89Array847[i_18_] = new Class89(bool_19_, class94s);
		}
		for (int i_29_ = 0; i_29_ < i_14_ + 1; i_29_++) {
		    if (aClass89Array847[i_29_] == null)
			aClass89Array847[i_29_]
			    = method1704(i_15_, i_16_, 1758360992);
		}
	    } else {
		aClass89Array847 = new Class89[0];
		anInt850 = -2051739341;
	    }
	}
    }
    
    public Class94[] method1705(int i) {
	if (i < 0 || i >= aClass89Array847.length)
	    return method1704(0, 0, 1731536868).aClass94Array886;
	Class89 class89 = aClass89Array847[i];
	if (!class89.aBool885 || class89.aClass94Array886.length <= 1)
	    return class89.aClass94Array886;
	int i_30_ = -308310523 * anInt850 == -1 ? 0 : 1;
	Random random = new Random();
	Class94[] class94s = new Class94[class89.aClass94Array886.length];
	System.arraycopy(class89.aClass94Array886, 0, class94s, 0,
			 class94s.length);
	for (int i_31_ = i_30_; i_31_ < class94s.length; i_31_++) {
	    int i_32_
		= (Class200_Sub21.method15637(random, class94s.length - i_30_,
					      1902134044)
		   + i_30_);
	    Class94 class94 = class89.aClass94Array886[i_31_];
	    class94s[i_31_] = class94s[i_32_];
	    class94s[i_32_] = class94;
	}
	return class94s;
    }
    
    public boolean method1706() {
	return -1 != anInt850 * -308310523;
    }
    
    static boolean method1707(TwitchEvent twitchevent, long l) {
	if (!Class574.aBool7692) {
	    switch (twitchevent.eventType) {
	    case 7:
	    case 8:
	    case 9:
		return false;
	    }
	}
	if (twitchevent.eventType == 33) {
	    if (Class574.aTwitchWebcamFrameData7700 == null)
		return false;
	    int i = ((TwitchEventResult) twitchevent).result;
	    int i_33_ = (Class523.aTwitchTV7088.GetWebcamFrameData
			 (i, Class574.aTwitchWebcamFrameData7700));
	    if (i_33_ == 0) {
		if (Class574.aBool7695)
		    Class574.aTwitchWebcamFrameData7700.method14437();
		if (Class574.aBool7708)
		    Class574.aTwitchWebcamFrameData7700.method14438();
		Class619.method10259((byte) 0);
		Class574.aLong7705 = 392372425371390385L * l;
		Class347.method6155(33, 0, (byte) 8);
	    } else
		Class574.aClass163_7706 = null;
	    return false;
	}
	if (30 == twitchevent.eventType) {
	    int i = ((TwitchEventResult) twitchevent).result;
	    if (i == 0 || 1 == i)
		Class451.method7388(-313613917);
	    else if (2 == i)
		Class574.aLong7705 = 392372425371390385L * l;
	}
	if (twitchevent.eventType == 34) {
	    Class534_Sub25.aTwitchEventLiveStreams10576
		= (TwitchEventLiveStreams) twitchevent;
	    Class347.method6155(34, 0, (byte) 8);
	}
	return true;
    }
    
    static final void method1708(Class669 class669, byte i) {
	int i_34_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub18_Sub9 class534_sub18_sub9
	    = Class554.method9113(i_34_ >> 14 & 0x3fff, i_34_ & 0x3fff);
	if (null == class534_sub18_sub9)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 848546455 * class534_sub18_sub9.anInt11766;
    }
    
    static void method1709
	(int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_,
	 int i_40_, Class534_Sub18_Sub7 class534_sub18_sub7, Class171 class171,
	 Class16 class16, int i_41_, int i_42_, byte i_43_) {
	if (i > i_36_ && i < i_38_ + i_36_
	    && i_35_ > i_40_ - class16.anInt190 * 102396103 - 1
	    && i_35_ < 728893755 * class16.anInt189 + i_40_
	    && class534_sub18_sub7.aBool11705)
	    i_41_ = i_42_;
	int[] is = Class10.method607(class534_sub18_sub7, (short) 4000);
	String string = Class21.method813(class534_sub18_sub7, (byte) 24);
	if (null != is)
	    string
		= new StringBuilder().append(string).append
		      (Class44_Sub21.method17371(is, -701706941)).toString();
	class171.method2835(string, i_36_ + 3, i_40_, i_41_, 0,
			    client.aRandom11178, Class709.anInt8857,
			    Class658.aClass163Array8541, null, (byte) -7);
	if (class534_sub18_sub7.aBool11701)
	    Class657.aClass163_8538.method2656
		(i_36_ + 5 + class16.method748(string,
					       Class658.aClass163Array8541,
					       (byte) 66),
		 i_40_ - class16.anInt190 * 102396103);
    }
}
