/* Class574 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;
import com.jagex.twitchtv.TwitchTV;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamFrameData;

public class Class574
{
    static final int anInt7674 = 2000;
    static int anInt7675;
    static final int anInt7676 = 1;
    static final int anInt7677 = 2;
    static final int anInt7678 = 3;
    static final int anInt7679 = 0;
    static int anInt7680;
    static boolean aBool7681;
    static float aFloat7682;
    static final int anInt7683 = 2;
    static int anInt7684;
    static int anInt7685;
    static final int anInt7686 = 1;
    static final int anInt7687 = 0;
    static int anInt7688;
    static boolean[] aBoolArray7689;
    static String[] aStringArray7690;
    static int anInt7691;
    static boolean aBool7692 = false;
    static long aLong7693;
    static long aLong7694;
    static boolean aBool7695;
    static boolean aBool7696;
    static boolean aBool7697;
    static int[] anIntArray7698;
    static int[] anIntArray7699;
    static TwitchWebcamFrameData aTwitchWebcamFrameData7700;
    static LinkedList aLinkedList7701;
    static LinkedList aLinkedList7702;
    static int anInt7703;
    static TwitchWebcamDevice[] aTwitchWebcamDeviceArray7704;
    static long aLong7705;
    static Class163 aClass163_7706;
    static long aLong7707;
    static boolean aBool7708;
    static int anInt7709;
    public static Class534_Sub26 aClass534_Sub26_7710;
    
    public static void method9644() {
	if (aBool7696) {
	    int i = Class523.aTwitchTV7088.ShutdownTTV();
	    if (0 == i) {
		Class523.aTwitchTV7088 = null;
		aBool7696 = false;
	    }
	}
    }
    
    static {
	aFloat7682 = 0.2F;
	anInt7675 = -27164503;
	anInt7684 = 1727014624;
	anInt7691 = 0;
	anInt7685 = 907219056;
	anInt7680 = 0;
	anInt7688 = 0;
	aBoolArray7689 = null;
	aStringArray7690 = null;
	aBool7696 = false;
	aLong7707 = 0L;
	aLong7693 = 0L;
	aLong7694 = 0L;
	anInt7709 = 0;
	aBool7681 = false;
	aBool7697 = false;
	aTwitchWebcamFrameData7700 = null;
	aLinkedList7701 = new LinkedList();
	aLinkedList7702 = new LinkedList();
	anInt7703 = -202745631;
	aTwitchWebcamDeviceArray7704 = null;
	aLong7705 = 0L;
	aClass163_7706 = null;
	aBool7695 = false;
	aBool7708 = false;
    }
    
    public static void method9645() {
	anInt7703 = -202745631;
    }
    
    public static void method9646() {
	anInt7703 = -202745631;
    }
    
    public static int method9647() {
	return Class523.aTwitchTV7088.GetChatState();
    }
    
    public static int method9648() {
	if (Class534_Sub25.aTwitchEventLiveStreams10576 == null
	    || (-297069345 * anInt7703
		>= (Class534_Sub25.aTwitchEventLiveStreams10576.streamCount
		    - 1)))
	    return -1;
	return (anInt7703 += 202745631) * -297069345;
    }
    
    public static int method9649() {
	if (Class534_Sub25.aTwitchEventLiveStreams10576 == null
	    || (-297069345 * anInt7703
		>= (Class534_Sub25.aTwitchEventLiveStreams10576.streamCount
		    - 1)))
	    return -1;
	return (anInt7703 += 202745631) * -297069345;
    }
    
    public static int method9650() {
	if (Class534_Sub25.aTwitchEventLiveStreams10576 == null
	    || (-297069345 * anInt7703
		>= (Class534_Sub25.aTwitchEventLiveStreams10576.streamCount
		    - 1)))
	    return -1;
	return (anInt7703 += 202745631) * -297069345;
    }
    
    public static Class163 method9651() {
	return aClass163_7706;
    }
    
    public static void method9652(boolean bool) {
	/* empty */
    }
    
    public static Class163 method9653() {
	return aClass163_7706;
    }
    
    public static Class163 method9654() {
	return aClass163_7706;
    }
    
    public static void method9655() {
	if (aBool7696) {
	    int i = Class523.aTwitchTV7088.ShutdownTTV();
	    if (0 == i) {
		Class523.aTwitchTV7088 = null;
		aBool7696 = false;
	    }
	}
    }
    
    public static void method9656(boolean bool) {
	/* empty */
    }
    
    public static TwitchWebcamDevice method9657(int i) {
	if (aTwitchWebcamDeviceArray7704 == null)
	    return null;
	for (int i_0_ = 0; i_0_ < aTwitchWebcamDeviceArray7704.length;
	     i_0_++) {
	    if (i
		== -1989490985 * aTwitchWebcamDeviceArray7704[i_0_].anInt1141)
		return aTwitchWebcamDeviceArray7704[i_0_];
	}
	return null;
    }
    
    public static void method9658(boolean bool) {
	/* empty */
    }
    
    public static void method9659(boolean bool) {
	/* empty */
    }
    
    public static int method9660() {
	if (anInt7680 * -504964405 == 3)
	    return -1;
	if (-504964405 * anInt7680 != 0)
	    return anInt7688 * 1879685621;
	if (aStringArray7690 == null) {
	    if (Class503.aString5626.startsWith("mac ")) {
		if (Class503.aString5627.startsWith("ppc")) {
		    anInt7680 = 214610089;
		    return -1;
		}
		aStringArray7690 = new String[3];
		aStringArray7690[0] = "sdk-mac-dynamic";
		aStringArray7690[1] = "twitchsdk";
		aStringArray7690[2] = "twitchtv";
		aBoolArray7689 = new boolean[3];
		aBoolArray7689[0] = false;
		aBoolArray7689[1] = false;
		aBoolArray7689[2] = true;
	    } else if (Class503.aString5626.startsWith("win")) {
		aStringArray7690 = new String[6];
		aStringArray7690[0] = "avutil-ttv-51";
		aStringArray7690[1] = "libmp3lame-ttv";
		aStringArray7690[2] = "swresample-ttv-0";
		aStringArray7690[5] = "twitchtv";
		if (Class503.aString5627.startsWith("amd64")
		    || Class503.aString5627.startsWith("x86_64")) {
		    aStringArray7690[3] = "libmfxsw64";
		    aStringArray7690[4] = "twitchsdk_64_release";
		} else if (Class503.aString5627.startsWith("i386")
			   || Class503.aString5627.startsWith("i486")
			   || Class503.aString5627.startsWith("i586")
			   || Class503.aString5627.startsWith("x86")) {
		    aStringArray7690[3] = "libmfxsw32";
		    aStringArray7690[4] = "twitchsdk_32_release";
		} else {
		    anInt7680 = 214610089;
		    return -1;
		}
		aBoolArray7689 = new boolean[6];
		aBoolArray7689[0] = true;
		aBoolArray7689[1] = true;
		aBoolArray7689[2] = true;
		aBoolArray7689[3] = false;
		aBoolArray7689[4] = true;
		aBoolArray7689[5] = true;
	    } else {
		anInt7680 = 214610089;
		return -1;
	    }
	}
	anInt7680 = -1360119069;
	return 0;
    }
    
    public static int method9661() {
	return Class523.aTwitchTV7088.GetWebcamState();
    }
    
    public static int method9662(Class185 class185) {
	Class535.method8896(99481101);
	return Class523.aTwitchTV7088.StopStreaming();
    }
    
    public static int method9663() {
	return anInt7680 * -504964405;
    }
    
    public static Class163 method9664() {
	return aClass163_7706;
    }
    
    static boolean method9665(TwitchEvent twitchevent, long l) {
	if (!aBool7692) {
	    switch (twitchevent.eventType) {
	    case 7:
	    case 8:
	    case 9:
		return false;
	    }
	}
	if (twitchevent.eventType == 33) {
	    if (aTwitchWebcamFrameData7700 == null)
		return false;
	    int i = ((TwitchEventResult) twitchevent).result;
	    int i_1_ = Class523.aTwitchTV7088
			   .GetWebcamFrameData(i, aTwitchWebcamFrameData7700);
	    if (i_1_ == 0) {
		if (aBool7695)
		    aTwitchWebcamFrameData7700.method14437();
		if (aBool7708)
		    aTwitchWebcamFrameData7700.method14438();
		Class619.method10259((byte) 0);
		aLong7705 = 392372425371390385L * l;
		Class347.method6155(33, 0, (byte) 8);
	    } else
		aClass163_7706 = null;
	    return false;
	}
	if (30 == twitchevent.eventType) {
	    int i = ((TwitchEventResult) twitchevent).result;
	    if (i == 0 || 1 == i)
		Class451.method7388(181933109);
	    else if (2 == i)
		aLong7705 = 392372425371390385L * l;
	}
	if (twitchevent.eventType == 34) {
	    Class534_Sub25.aTwitchEventLiveStreams10576
		= (TwitchEventLiveStreams) twitchevent;
	    Class347.method6155(34, 0, (byte) 8);
	}
	return true;
    }
    
    public static boolean method9666() {
	return aBool7681;
    }
    
    static int method9667() {
	try {
	    for (int i = 0; i < aStringArray7690.length; i++) {
		if (aStringArray7690[i] != null && aBoolArray7689[i])
		    Class112.method2018(-1327590673)
			.method400(aStringArray7690[i], -426540939);
	    }
	} catch (Exception_Sub3 exception_sub3) {
	    return 3;
	}
	Class523.aTwitchTV7088 = new TwitchTV();
	int i = Class523.aTwitchTV7088
		    .InitialiseTTV(Class650.method10722(-1282201971));
	if (i == 0)
	    aBool7696 = true;
	else
	    Class262.method4824(new StringBuilder().append(10).append
				    (Class29.aString260).append
				    (i).toString(),
				new RuntimeException(), (byte) 26);
	return 2;
    }
    
    static int method9668() {
	try {
	    for (int i = 0; i < aStringArray7690.length; i++) {
		if (aStringArray7690[i] != null && aBoolArray7689[i])
		    Class112.method2018(-1327590673)
			.method400(aStringArray7690[i], -1570694473);
	    }
	} catch (Exception_Sub3 exception_sub3) {
	    return 3;
	}
	Class523.aTwitchTV7088 = new TwitchTV();
	int i = Class523.aTwitchTV7088
		    .InitialiseTTV(Class650.method10722(-1282201971));
	if (i == 0)
	    aBool7696 = true;
	else
	    Class262.method4824(new StringBuilder().append(10).append
				    (Class29.aString260).append
				    (i).toString(),
				new RuntimeException(), (byte) -21);
	return 2;
    }
    
    static void method9669(int i, int i_2_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_2_);
	Class590 class590 = twitcheventresult.method6700();
	if (class590 != null)
	    Class269.method5022(class590.method93(), twitcheventresult,
				(byte) 1);
    }
    
    public static int method9670() {
	return anInt7680 * -504964405;
    }
    
    public static void method9671() {
	if (aBool7696) {
	    int i = Class523.aTwitchTV7088.ShutdownTTV();
	    if (0 == i) {
		Class523.aTwitchTV7088 = null;
		aBool7696 = false;
	    }
	}
    }
    
    static void method9672() {
	aBool7681 = false;
	anIntArray7698 = null;
	anIntArray7699 = null;
	aLinkedList7701.clear();
	aLinkedList7702.clear();
	Class254.aClass185_2683.method3280();
    }
    
    public static int method9673() {
	if (!aBool7696)
	    return 12;
	Class711.method14416(Class254.aClass185_2683, 1866738949);
	return Class523.aTwitchTV7088.Logout();
    }
    
    public static int method9674() {
	return (null == aTwitchWebcamDeviceArray7704 ? 0
		: aTwitchWebcamDeviceArray7704.length);
    }
    
    static void method9675(int[] is, LinkedList linkedlist, int i, int i_3_,
			   float f) {
	if (!linkedlist.isEmpty()) {
	    for (int i_4_ = 0; i_4_ < linkedlist.size(); i_4_++) {
		Class588 class588 = (Class588) linkedlist.get(i_4_);
		int i_5_
		    = i + (int) ((float) (class588.anInt7803 * -1690294733)
				 * f);
		int i_6_
		    = ((int) ((float) (1291235515 * class588.anInt7805) * f)
		       + i_3_);
		int i_7_
		    = (int) (f * (float) (-319890445 * class588.anInt7804));
		int i_8_
		    = (int) (f * (float) (300807017 * class588.anInt7806));
		if (i_5_ < -777198511 * Class387.anInt4050
		    && i_6_ < 1445010517 * Class503.anInt5629) {
		    if (i_7_ + i_5_ > Class387.anInt4050 * -777198511)
			i_7_ = -777198511 * Class387.anInt4050 - i_5_;
		    if (i_6_ + i_8_ > Class503.anInt5629 * 1445010517)
			i_8_ = 1445010517 * Class503.anInt5629 - i_6_;
		    for (int i_9_ = i_6_; i_9_ < i_6_ + i_8_; i_9_++) {
			int i_10_
			    = i_5_ + i_9_ * (-777198511 * Class387.anInt4050);
			Arrays.fill(is, i_10_, i_10_ + i_7_, -16777216);
		    }
		}
	    }
	}
    }
    
    public static int method9676() {
	return Class523.aTwitchTV7088.GetLoginState();
    }
    
    public static int method9677() {
	return Class523.aTwitchTV7088.GetLoginState();
    }
    
    public static int method9678() {
	if (!aBool7696)
	    return 12;
	Class711.method14416(Class254.aClass185_2683, 1400550952);
	return Class523.aTwitchTV7088.Logout();
    }
    
    public static int method9679(Class185 class185) {
	Class535.method8896(99481101);
	return Class523.aTwitchTV7088.StopStreaming();
    }
    
    public static void method9680() {
	if (aBool7696) {
	    int i = Class523.aTwitchTV7088.ShutdownTTV();
	    if (0 == i) {
		Class523.aTwitchTV7088 = null;
		aBool7696 = false;
	    }
	}
    }
    
    public static int method9681() {
	if (!aBool7696)
	    return 12;
	Class711.method14416(Class254.aClass185_2683, -142834932);
	return Class523.aTwitchTV7088.Logout();
    }
    
    public static void method9682(boolean bool) {
	/* empty */
    }
    
    public static int method9683() {
	return Class523.aTwitchTV7088.GetStreamState();
    }
    
    public static int method9684() {
	return Class523.aTwitchTV7088.GetStreamState();
    }
    
    public static int method9685() {
	return Class523.aTwitchTV7088.GetLoginState();
    }
    
    public static int method9686(Class185 class185) {
	Class535.method8896(99481101);
	return Class523.aTwitchTV7088.StopStreaming();
    }
    
    public static int method9687() {
	return anInt7680 * -504964405;
    }
    
    public static int method9688(Class185 class185) {
	Class535.method8896(99481101);
	return Class523.aTwitchTV7088.StopStreaming();
    }
    
    static void method9689() {
	aTwitchWebcamDeviceArray7704
	    = Class523.aTwitchTV7088.GetWebcamDevices();
    }
    
    public static int method9690(String string) {
	return Class523.aTwitchTV7088.ChatSendMessage(string);
    }
    
    public static int method9691() {
	if (!Class228.method4188(-747597824))
	    return 0;
	return anInt7709 * 1378653945;
    }
    
    public static int method9692() {
	if (!Class228.method4188(1180923084))
	    return 0;
	return anInt7709 * 1378653945;
    }
    
    public static int method9693(String string) {
	return Class523.aTwitchTV7088
		   .SetStreamTitle(string, client.aClass675_11016.aString8641);
    }
    
    public static void method9694() {
	if (aBool7696) {
	    int i = Class523.aTwitchTV7088.ShutdownTTV();
	    if (0 == i) {
		Class523.aTwitchTV7088 = null;
		aBool7696 = false;
	    }
	}
    }
    
    public static int method9695() {
	return Class523.aTwitchTV7088.GetChatState();
    }
    
    public static int method9696() {
	return anInt7680 * -504964405;
    }
    
    public static int method9697(String string) {
	return Class523.aTwitchTV7088.ChatSendMessage(string);
    }
    
    public static int method9698(String string) {
	return Class523.aTwitchTV7088.ChatSendMessage(string);
    }
    
    public static int method9699(String string) {
	return Class523.aTwitchTV7088.ChatSendMessage(string);
    }
    
    public static int method9700() {
	return anInt7680 * -504964405;
    }
    
    public static int method9701() {
	if (Class534_Sub25.aTwitchEventLiveStreams10576 == null
	    || (-297069345 * anInt7703
		>= (Class534_Sub25.aTwitchEventLiveStreams10576.streamCount
		    - 1)))
	    return -1;
	return (anInt7703 += 202745631) * -297069345;
    }
    
    public static boolean method9702() {
	return aBool7681;
    }
    
    public static int method9703(String string, String string_11_) {
	if (!aBool7696)
	    return 12;
	if (Class201.method3864(2095398292) != client.aClass100_11264)
	    return 42;
	return Class523.aTwitchTV7088.Login(string, string_11_);
    }
    
    public static boolean method9704() {
	return (null != Class523.aTwitchTV7088
		&& Class523.aTwitchTV7088.IsStreaming());
    }
    
    public static boolean method9705() {
	return (null != Class523.aTwitchTV7088
		&& Class523.aTwitchTV7088.IsStreaming());
    }
    
    public static void method9706(Class185 class185, long l) {
	class185.method3280();
	aLinkedList7701.clear();
	aLinkedList7702.clear();
	aLong7707
	    = -6716390560235218895L * ((long) (1895832897 * anInt7691) + l);
    }
    
    static boolean method9707(TwitchEvent twitchevent, long l) {
	if (!aBool7692) {
	    switch (twitchevent.eventType) {
	    case 7:
	    case 8:
	    case 9:
		return false;
	    }
	}
	if (twitchevent.eventType == 33) {
	    if (aTwitchWebcamFrameData7700 == null)
		return false;
	    int i = ((TwitchEventResult) twitchevent).result;
	    int i_12_ = Class523.aTwitchTV7088
			    .GetWebcamFrameData(i, aTwitchWebcamFrameData7700);
	    if (i_12_ == 0) {
		if (aBool7695)
		    aTwitchWebcamFrameData7700.method14437();
		if (aBool7708)
		    aTwitchWebcamFrameData7700.method14438();
		Class619.method10259((byte) 0);
		aLong7705 = 392372425371390385L * l;
		Class347.method6155(33, 0, (byte) 8);
	    } else
		aClass163_7706 = null;
	    return false;
	}
	if (30 == twitchevent.eventType) {
	    int i = ((TwitchEventResult) twitchevent).result;
	    if (i == 0 || 1 == i)
		Class451.method7388(619521284);
	    else if (2 == i)
		aLong7705 = 392372425371390385L * l;
	}
	if (twitchevent.eventType == 34) {
	    Class534_Sub25.aTwitchEventLiveStreams10576
		= (TwitchEventLiveStreams) twitchevent;
	    Class347.method6155(34, 0, (byte) 8);
	}
	return true;
    }
    
    public static void method9708() {
	if (aBool7696) {
	    int i = Class523.aTwitchTV7088.ShutdownTTV();
	    if (0 == i) {
		Class523.aTwitchTV7088 = null;
		aBool7696 = false;
	    }
	}
    }
    
    public static void method9709(boolean bool) {
	if (aBool7697 != bool) {
	    Class535.method8896(99481101);
	    aBool7697 = bool;
	}
    }
    
    Class574() throws Throwable {
	throw new Error();
    }
    
    static void method9710(int i, int i_13_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_13_);
	Class590 class590 = twitcheventresult.method6700();
	if (class590 != null)
	    Class269.method5022(class590.method93(), twitcheventresult,
				(byte) 1);
    }
    
    static void method9711(int i, int i_14_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_14_);
	Class590 class590 = twitcheventresult.method6700();
	if (class590 != null)
	    Class269.method5022(class590.method93(), twitcheventresult,
				(byte) 1);
    }
    
    static void method9712(int i, int i_15_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_15_);
	Class590 class590 = twitcheventresult.method6700();
	if (class590 != null)
	    Class269.method5022(class590.method93(), twitcheventresult,
				(byte) 1);
    }
    
    public static int method9713() {
	if (!aBool7696)
	    return 12;
	Class711.method14416(Class254.aClass185_2683, 1435321253);
	return Class523.aTwitchTV7088.Logout();
    }
    
    public static int method9714(int i, int i_16_) {
	aTwitchWebcamFrameData7700 = new TwitchWebcamFrameData();
	if (i < 0 || i >= aTwitchWebcamDeviceArray7704.length)
	    return -1;
	return (Class523.aTwitchTV7088.StartWebcamDevice
		(-455097687 * aTwitchWebcamDeviceArray7704[i].anInt1142,
		 i_16_));
    }
    
    public static int method9715(int i, int i_17_) {
	aTwitchWebcamFrameData7700 = new TwitchWebcamFrameData();
	if (i < 0 || i >= aTwitchWebcamDeviceArray7704.length)
	    return -1;
	return (Class523.aTwitchTV7088.StartWebcamDevice
		(-455097687 * aTwitchWebcamDeviceArray7704[i].anInt1142,
		 i_17_));
    }
    
    public static int method9716(int i, int i_18_) {
	aTwitchWebcamFrameData7700 = new TwitchWebcamFrameData();
	if (i < 0 || i >= aTwitchWebcamDeviceArray7704.length)
	    return -1;
	return (Class523.aTwitchTV7088.StartWebcamDevice
		(-455097687 * aTwitchWebcamDeviceArray7704[i].anInt1142,
		 i_18_));
    }
    
    public static int method9717(int i) {
	aTwitchWebcamFrameData7700 = null;
	aClass163_7706 = null;
	if (i < 0 || i >= aTwitchWebcamDeviceArray7704.length)
	    return -1;
	return (Class523.aTwitchTV7088.StopWebcamDevice
		(aTwitchWebcamDeviceArray7704[i].anInt1142 * -455097687));
    }
    
    static boolean method9718(TwitchEvent twitchevent, long l) {
	if (!aBool7692) {
	    switch (twitchevent.eventType) {
	    case 7:
	    case 8:
	    case 9:
		return false;
	    }
	}
	if (twitchevent.eventType == 33) {
	    if (aTwitchWebcamFrameData7700 == null)
		return false;
	    int i = ((TwitchEventResult) twitchevent).result;
	    int i_19_ = Class523.aTwitchTV7088
			    .GetWebcamFrameData(i, aTwitchWebcamFrameData7700);
	    if (i_19_ == 0) {
		if (aBool7695)
		    aTwitchWebcamFrameData7700.method14437();
		if (aBool7708)
		    aTwitchWebcamFrameData7700.method14438();
		Class619.method10259((byte) 0);
		aLong7705 = 392372425371390385L * l;
		Class347.method6155(33, 0, (byte) 8);
	    } else
		aClass163_7706 = null;
	    return false;
	}
	if (30 == twitchevent.eventType) {
	    int i = ((TwitchEventResult) twitchevent).result;
	    if (i == 0 || 1 == i)
		Class451.method7388(64998671);
	    else if (2 == i)
		aLong7705 = 392372425371390385L * l;
	}
	if (twitchevent.eventType == 34) {
	    Class534_Sub25.aTwitchEventLiveStreams10576
		= (TwitchEventLiveStreams) twitchevent;
	    Class347.method6155(34, 0, (byte) 8);
	}
	return true;
    }
    
    public static int method9719() {
	if (anInt7680 * -504964405 == 3)
	    return -1;
	if (-504964405 * anInt7680 != 0)
	    return anInt7688 * 1879685621;
	if (aStringArray7690 == null) {
	    if (Class503.aString5626.startsWith("mac ")) {
		if (Class503.aString5627.startsWith("ppc")) {
		    anInt7680 = 214610089;
		    return -1;
		}
		aStringArray7690 = new String[3];
		aStringArray7690[0] = "sdk-mac-dynamic";
		aStringArray7690[1] = "twitchsdk";
		aStringArray7690[2] = "twitchtv";
		aBoolArray7689 = new boolean[3];
		aBoolArray7689[0] = false;
		aBoolArray7689[1] = false;
		aBoolArray7689[2] = true;
	    } else if (Class503.aString5626.startsWith("win")) {
		aStringArray7690 = new String[6];
		aStringArray7690[0] = "avutil-ttv-51";
		aStringArray7690[1] = "libmp3lame-ttv";
		aStringArray7690[2] = "swresample-ttv-0";
		aStringArray7690[5] = "twitchtv";
		if (Class503.aString5627.startsWith("amd64")
		    || Class503.aString5627.startsWith("x86_64")) {
		    aStringArray7690[3] = "libmfxsw64";
		    aStringArray7690[4] = "twitchsdk_64_release";
		} else if (Class503.aString5627.startsWith("i386")
			   || Class503.aString5627.startsWith("i486")
			   || Class503.aString5627.startsWith("i586")
			   || Class503.aString5627.startsWith("x86")) {
		    aStringArray7690[3] = "libmfxsw32";
		    aStringArray7690[4] = "twitchsdk_32_release";
		} else {
		    anInt7680 = 214610089;
		    return -1;
		}
		aBoolArray7689 = new boolean[6];
		aBoolArray7689[0] = true;
		aBoolArray7689[1] = true;
		aBoolArray7689[2] = true;
		aBoolArray7689[3] = false;
		aBoolArray7689[4] = true;
		aBoolArray7689[5] = true;
	    } else {
		anInt7680 = 214610089;
		return -1;
	    }
	}
	anInt7680 = -1360119069;
	return 0;
    }
    
    public static int method9720() {
	return (null == aTwitchWebcamDeviceArray7704 ? 0
		: aTwitchWebcamDeviceArray7704.length);
    }
    
    public static TwitchWebcamDevice method9721(int i) {
	if (aTwitchWebcamDeviceArray7704 == null)
	    return null;
	for (int i_20_ = 0; i_20_ < aTwitchWebcamDeviceArray7704.length;
	     i_20_++) {
	    if (i
		== -1989490985 * aTwitchWebcamDeviceArray7704[i_20_].anInt1141)
		return aTwitchWebcamDeviceArray7704[i_20_];
	}
	return null;
    }
    
    public static void method9722(Class185 class185, long l, int i,
				  int i_21_) {
	do {
	    if (class185.method3269() && class185.method3273() > -1) {
		int i_22_ = class185.method3273();
		Class573 class573 = null;
		if (!aLinkedList7702.isEmpty())
		    class573 = (Class573) aLinkedList7702.getFirst();
		if (class573 == null
		    || i_22_ != 733600403 * class573.anInt7669) {
		    class185.method3656();
		    aLinkedList7702.clear();
		} else {
		    aLinkedList7702.removeFirst();
		    class185.method3559();
		    boolean bool = false;
		    int i_23_;
		    if (class573.aLinkedList7672.isEmpty()
			&& class185.method3396()) {
			long l_24_ = class185.method3355((Class387.anInt4050
							  * -777198511),
							 (Class503.anInt5629
							  * 1445010517));
			i_23_ = (Class523.aTwitchTV7088.SubmitFrame
				 (l_24_, class185.method3666(), aBool7697, i,
				  i_21_));
			class185.method3277(l_24_);
		    } else {
			class185.method3278(-777198511 * Class387.anInt4050,
					    1445010517 * Class503.anInt5629,
					    anIntArray7698, anIntArray7699);
			Class654_Sub1_Sub5_Sub1_Sub1.method18862
			    (anIntArray7698, class573.aLinkedList7672,
			     1644634333 * class573.anInt7670,
			     class573.anInt7668 * -1875063907,
			     class573.aFloat7671, 390302491);
			i_23_ = (Class523.aTwitchTV7088.SubmitFrameRaw
				 (anIntArray7698, aBool7697, i, i_21_));
		    }
		    class185.method3446();
		    if (2072 == i_23_)
			aLong7693 = -3117649911290242775L * l;
		    else if (23 == i_23_)
			aLong7694 = l * 9074349051421350485L;
		    else if (-995 == i_23_ || i_23_ != 0)
			break;
		}
	    }
	} while (false);
	if (aBool7681) {
	    if (anIntArray7698 == null) {
		anIntArray7698
		    = new int[(aBool7697 ? i * i_21_
			       : (1445010517 * Class503.anInt5629
				  * (-777198511 * Class387.anInt4050)))];
		anIntArray7699
		    = new int[(aBool7697 ? i_21_ * i
			       : (Class387.anInt4050 * -777198511
				  * (Class503.anInt5629 * 1445010517)))];
	    }
	    if (!class185.method3269()) {
		class185.method3559();
		class185.method3278(Class387.anInt4050 * -777198511,
				    Class503.anInt5629 * 1445010517,
				    anIntArray7698, anIntArray7699);
		Class654_Sub1_Sub5_Sub1_Sub1.method18862
		    (anIntArray7698, aLinkedList7701,
		     class185.anInt2018 * -1555714981,
		     -385311879 * class185.anInt2019, class185.aFloat2010,
		     -1412802421);
		int i_25_
		    = Class523.aTwitchTV7088
			  .SubmitFrameRaw(anIntArray7698, aBool7697, i, i_21_);
		class185.method3446();
		aLinkedList7701.clear();
		do {
		    if (i_25_ == 2072)
			aLong7693 = -3117649911290242775L * l;
		    else if (i_25_ == 23)
			aLong7694 = 9074349051421350485L * l;
		    else if (i_25_ == -995 || i_25_ != 0)
			break;
		} while (false);
	    } else {
		class185.method3275(client.anInt11101,
				    Class387.anInt4050 * -777198511,
				    Class503.anInt5629 * 1445010517);
		aLinkedList7702.add(new Class573(client.anInt11101,
						 aLinkedList7701,
						 (-1555714981
						  * class185.anInt2018),
						 (-385311879
						  * class185.anInt2019),
						 class185.aFloat2010));
		aLinkedList7701 = new LinkedList();
	    }
	    aBool7681 = false;
	}
    }
    
    public static TwitchWebcamDevice method9723(int i) {
	if (aTwitchWebcamDeviceArray7704 == null)
	    return null;
	for (int i_26_ = 0; i_26_ < aTwitchWebcamDeviceArray7704.length;
	     i_26_++) {
	    if (i
		== -1989490985 * aTwitchWebcamDeviceArray7704[i_26_].anInt1141)
		return aTwitchWebcamDeviceArray7704[i_26_];
	}
	return null;
    }
    
    public static TwitchWebcamDevice method9724(String string) {
	if (aTwitchWebcamDeviceArray7704 == null)
	    return null;
	for (int i = 0; i < aTwitchWebcamDeviceArray7704.length; i++) {
	    if (aTwitchWebcamDeviceArray7704[i].aString1139.equals(string))
		return aTwitchWebcamDeviceArray7704[i];
	}
	return null;
    }
    
    public static void method9725(boolean bool, boolean bool_27_) {
	aBool7695 = bool;
	aBool7708 = bool_27_;
    }
    
    public static void method9726(boolean bool, boolean bool_28_) {
	aBool7695 = bool;
	aBool7708 = bool_28_;
    }
    
    public static void method9727(boolean bool, boolean bool_29_) {
	aBool7695 = bool;
	aBool7708 = bool_29_;
    }
    
    public static void method9728(boolean bool, boolean bool_30_) {
	aBool7695 = bool;
	aBool7708 = bool_30_;
    }
    
    public static int method9729() {
	Class534_Sub25.aTwitchEventLiveStreams10576 = null;
	int i = Class523.aTwitchTV7088
		    .RequestLiveStreams(client.aClass675_11016.aString8641);
	return i;
    }
    
    public static int method9730() {
	Class534_Sub25.aTwitchEventLiveStreams10576 = null;
	int i = Class523.aTwitchTV7088
		    .RequestLiveStreams(client.aClass675_11016.aString8641);
	return i;
    }
    
    public static int method9731() {
	return Class523.aTwitchTV7088.GetViewerCount();
    }
    
    public static void method9732(int i, int i_31_, int i_32_, int i_33_) {
	aLinkedList7701.addLast(new Class588(i, i_31_, i_32_ - i,
					     i_33_ - i_31_));
    }
    
    public static void method9733(int i, int i_34_, int i_35_, int i_36_) {
	aLinkedList7701.addLast(new Class588(i, i_34_, i_35_ - i,
					     i_36_ - i_34_));
    }
    
    static boolean method9734(TwitchEvent twitchevent, long l) {
	if (!aBool7692) {
	    switch (twitchevent.eventType) {
	    case 7:
	    case 8:
	    case 9:
		return false;
	    }
	}
	if (twitchevent.eventType == 33) {
	    if (aTwitchWebcamFrameData7700 == null)
		return false;
	    int i = ((TwitchEventResult) twitchevent).result;
	    int i_37_ = Class523.aTwitchTV7088
			    .GetWebcamFrameData(i, aTwitchWebcamFrameData7700);
	    if (i_37_ == 0) {
		if (aBool7695)
		    aTwitchWebcamFrameData7700.method14437();
		if (aBool7708)
		    aTwitchWebcamFrameData7700.method14438();
		Class619.method10259((byte) 0);
		aLong7705 = 392372425371390385L * l;
		Class347.method6155(33, 0, (byte) 8);
	    } else
		aClass163_7706 = null;
	    return false;
	}
	if (30 == twitchevent.eventType) {
	    int i = ((TwitchEventResult) twitchevent).result;
	    if (i == 0 || 1 == i)
		Class451.method7388(-1992922315);
	    else if (2 == i)
		aLong7705 = 392372425371390385L * l;
	}
	if (twitchevent.eventType == 34) {
	    Class534_Sub25.aTwitchEventLiveStreams10576
		= (TwitchEventLiveStreams) twitchevent;
	    Class347.method6155(34, 0, (byte) 8);
	}
	return true;
    }
    
    static void method9735(int[] is, LinkedList linkedlist, int i, int i_38_,
			   float f) {
	if (!linkedlist.isEmpty()) {
	    for (int i_39_ = 0; i_39_ < linkedlist.size(); i_39_++) {
		Class588 class588 = (Class588) linkedlist.get(i_39_);
		int i_40_
		    = i + (int) ((float) (class588.anInt7803 * -1690294733)
				 * f);
		int i_41_
		    = ((int) ((float) (1291235515 * class588.anInt7805) * f)
		       + i_38_);
		int i_42_
		    = (int) (f * (float) (-319890445 * class588.anInt7804));
		int i_43_
		    = (int) (f * (float) (300807017 * class588.anInt7806));
		if (i_40_ < -777198511 * Class387.anInt4050
		    && i_41_ < 1445010517 * Class503.anInt5629) {
		    if (i_42_ + i_40_ > Class387.anInt4050 * -777198511)
			i_42_ = -777198511 * Class387.anInt4050 - i_40_;
		    if (i_41_ + i_43_ > Class503.anInt5629 * 1445010517)
			i_43_ = 1445010517 * Class503.anInt5629 - i_41_;
		    for (int i_44_ = i_41_; i_44_ < i_41_ + i_43_; i_44_++) {
			int i_45_ = i_40_ + i_44_ * (-777198511
						     * Class387.anInt4050);
			Arrays.fill(is, i_45_, i_45_ + i_42_, -16777216);
		    }
		}
	    }
	}
    }
    
    public static boolean method9736() {
	if (Class503.aString5626.startsWith("win")) {
	    String string = "msvcr110.dll";
	    String string_46_ = "msvcp110.dll";
	    String[] strings = { string, string_46_ };
	    String string_47_ = System.getenv("WINDIR");
	    if (string_47_ == "")
		return false;
	    for (int i = 0; i < strings.length; i++) {
		File file
		    = new File(new StringBuilder().append(string_47_).append
				   ("\\system32\\").append
				   (strings[i]).toString());
		if (!file.exists() || file.isDirectory())
		    return false;
	    }
	    return true;
	}
	if (Class503.aString5626.startsWith("mac")) {
	    boolean bool;
	    try {
		Process process = Runtime.getRuntime().exec("ps -few");
		BufferedReader bufferedreader
		    = (new BufferedReader
		       (new InputStreamReader(process.getInputStream())));
		do {
		    boolean bool_48_;
		    try {
			int i = process.waitFor();
			if (i == 0)
			    break;
			bool_48_ = false;
		    } catch (InterruptedException interruptedexception) {
			return false;
		    }
		    return bool_48_;
		} while (false);
		boolean bool_49_ = false;
	    while_34_:
		do {
		    String string;
		    do {
			if ((string = bufferedreader.readLine()) == null)
			    break while_34_;
		    } while (string.toLowerCase().indexOf("soundflowerbed")
			     == -1);
		    bool_49_ = true;
		} while (false);
		bufferedreader.close();
		bool = bool_49_;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	return false;
    }
    
    public static boolean method9737() {
	if (Class503.aString5626.startsWith("win")) {
	    String string = "msvcr110.dll";
	    String string_50_ = "msvcp110.dll";
	    String[] strings = { string, string_50_ };
	    String string_51_ = System.getenv("WINDIR");
	    if (string_51_ == "")
		return false;
	    for (int i = 0; i < strings.length; i++) {
		File file
		    = new File(new StringBuilder().append(string_51_).append
				   ("\\system32\\").append
				   (strings[i]).toString());
		if (!file.exists() || file.isDirectory())
		    return false;
	    }
	    return true;
	}
	if (Class503.aString5626.startsWith("mac")) {
	    boolean bool;
	    try {
		Process process = Runtime.getRuntime().exec("ps -few");
		BufferedReader bufferedreader
		    = (new BufferedReader
		       (new InputStreamReader(process.getInputStream())));
		do {
		    boolean bool_52_;
		    try {
			int i = process.waitFor();
			if (i == 0)
			    break;
			bool_52_ = false;
		    } catch (InterruptedException interruptedexception) {
			return false;
		    }
		    return bool_52_;
		} while (false);
		boolean bool_53_ = false;
	    while_35_:
		do {
		    String string;
		    do {
			if ((string = bufferedreader.readLine()) == null)
			    break while_35_;
		    } while (string.toLowerCase().indexOf("soundflowerbed")
			     == -1);
		    bool_53_ = true;
		} while (false);
		bufferedreader.close();
		bool = bool_53_;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	return false;
    }
    
    static final boolean method9738(int i, int i_54_) {
	return i < 7;
    }
    
    static void method9739(Class185 class185, int i, int i_55_, int i_56_,
			   int i_57_, byte i_58_) {
	class185.method3373(i, i_55_, i + i_56_, i_55_ + i_57_);
	if (-1857977261 * Class554_Sub1.anInt10671 < 100) {
	    int i_59_ = 20;
	    int i_60_ = i + i_56_ / 2;
	    int i_61_ = i_55_ + i_57_ / 2 - 18 - i_59_;
	    class185.method3298(i, i_55_, i_56_, i_57_, -16777216, 0);
	    class185.method3297(i_60_ - 152, i_61_, 304, 34,
				client.aColorArray11072
				    [client.anInt11021 * -859311063].getRGB(),
				0);
	    class185.method3298(i_60_ - 150, 2 + i_61_,
				-1278964487 * Class554_Sub1.anInt10671, 30,
				client.aColorArray11071
				    [client.anInt11021 * -859311063].getRGB(),
				0);
	    Class231.aClass171_2325.method2830
		(Class58.aClass58_620.method1245(Class539.aClass672_7171,
						 (byte) -105),
		 i_60_, i_61_ + i_59_,
		 client.aColorArray11073[-859311063 * client.anInt11021]
		     .getRGB(),
		 -1, 65535);
	} else {
	    int i_62_ = (Class151.anInt1705 * 204700261
			 - (int) ((float) i_56_ / Class554_Sub1.aFloat7364));
	    int i_63_ = (Class328.anInt3479 * -1636630007
			 + (int) ((float) i_57_ / Class554_Sub1.aFloat7364));
	    int i_64_ = (204700261 * Class151.anInt1705
			 + (int) ((float) i_56_ / Class554_Sub1.aFloat7364));
	    int i_65_ = (-1636630007 * Class328.anInt3479
			 - (int) ((float) i_57_ / Class554_Sub1.aFloat7364));
	    Class662.anInt8553
		= ((204700261 * Class151.anInt1705
		    - (int) ((float) i_56_ / Class554_Sub1.aFloat7364))
		   * 1062791895);
	    Class347.anInt3590
		= ((Class328.anInt3479 * -1636630007
		    - (int) ((float) i_57_ / Class554_Sub1.aFloat7364))
		   * -304732319);
	    Class550.anInt7307
		= ((int) ((float) (i_56_ * 2) / Class554_Sub1.aFloat7364)
		   * 2055893919);
	    Class567.anInt7595
		= -1977075073 * (int) ((float) (i_57_ * 2)
				       / Class554_Sub1.aFloat7364);
	    Class554_Sub1.aClass203_7375 = Class554_Sub1.aClass203_7392;
	    Class554_Sub1.method9124(i_62_ + Class554_Sub1.anInt7368,
				     Class554_Sub1.anInt7369 + i_63_,
				     i_64_ + Class554_Sub1.anInt7368,
				     Class554_Sub1.anInt7369 + i_65_, i, i_55_,
				     i_56_ + i, 1 + (i_57_ + i_55_));
	    Class554_Sub1.method9179(class185, !Class554_Sub1.aBool10667,
				     !Class554_Sub1.aBool10676,
				     client.aBool11157, false);
	    Class700 class700 = Class554_Sub1.method9132(class185);
	    Class347_Sub3.method15869(class185, class700, 0, 0, (byte) -82);
	    if (client.aBool11262) {
		int i_66_ = i + i_56_ - 5;
		int i_67_ = i_55_ + i_57_ - 8;
		Class539_Sub1.aClass171_10327.method2829
		    (new StringBuilder().append("Fps: ").append
			 (Class498.anInt5554 * 1720947399).append
			 (" (").append
			 (Class498.anInt5555 * -482787859).append
			 (" ms)").toString(),
		     i_66_, i_67_, 16776960, -1, -2037021465);
		i_67_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int i_68_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		int i_69_ = 16776960;
		if (i_68_ > 65536)
		    i_69_ = 16711680;
		Class539_Sub1.aClass171_10327.method2829(new StringBuilder
							     ().append
							     ("Mem:").append
							     (i_68_).append
							     ("k").toString(),
							 i_66_, i_67_, i_69_,
							 -1, -262340506);
		i_67_ -= 15;
	    }
	    Class554_Sub1.aClass203_7392.method3876(5, (byte) 0);
	}
    }
}
