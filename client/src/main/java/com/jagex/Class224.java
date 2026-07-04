/* Class224 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class224 implements Interface28
{
    Class213 this$0;
    
    public void method173(Class214 class214, int i) {
	class214.method4090(1854943022);
    }
    
    public void method174(Class214 class214) {
	class214.method4090(-605076042);
    }
    
    Class224(Class213 class213) {
	this$0 = class213;
    }
    
    public void method172(Class214 class214) {
	class214.method4090(704910682);
    }
    
    static final int method4161(int i, int i_0_, int i_1_) {
	int i_2_
	    = (Class419.method6770(45365 + i, 91923 + i_0_, 4, 1748207138)
	       - 128
	       + ((Class419.method6770(10294 + i, 37821 + i_0_, 2, 1748207138)
		   - 128)
		  >> 1)
	       + (Class419.method6770(i, i_0_, 1, 1748207138) - 128 >> 2));
	i_2_ = 35 + (int) (0.3 * (double) i_2_);
	if (i_2_ < 10)
	    i_2_ = 10;
	else if (i_2_ > 60)
	    i_2_ = 60;
	return i_2_;
    }
    
    static void method4162(Class669 class669, int i) {
	Class99.method1857((byte) -6);
	Class483.method7950(class669, -1205155286);
    }
    
    static final void method4163(Class669 class669, int i) {
	if ((Class599.aClass298_Sub1_7871.method5388((byte) 33)
	     != Class305.aClass305_3265)
	    || (Class599.aClass298_Sub1_7871.method5425(941132994)
		!= Class293.aClass293_3125))
	    throw new RuntimeException();
	Class438 class438
	    = ((Class347_Sub1)
	       Class599.aClass298_Sub1_7871.method5380((byte) -63))
		  .method15760(-1488097877);
	Class438 class438_3_
	    = ((Class706_Sub4)
	       Class599.aClass298_Sub1_7871.method5381(1721268405))
		  .method17300((byte) -5);
	Class438 class438_4_ = Class438.method6994(class438);
	class438_4_.method7006(class438_3_);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) class438_4_.method7012();
    }
    
    static final void method4164(Class669 class669, int i) {
	Class321.method5774((byte) 0);
    }
    
    static final void method4165(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 104457713 * class669.aClass352_8602.anInt3642;
    }
    
    public static boolean method4166(int i) {
	Class534_Sub30 class534_sub30
	    = (Class534_Sub30) Class86.aClass700_846.method14135((byte) -1);
	if (class534_sub30 == null)
	    return false;
	return true;
    }
    
    public static int method4167(byte i) {
	if (Class574.anInt7680 * -504964405 == 3)
	    return -1;
	if (-504964405 * Class574.anInt7680 != 0)
	    return Class574.anInt7688 * 1879685621;
	if (Class574.aStringArray7690 == null) {
	    if (Class503.aString5626.startsWith("mac ")) {
		if (Class503.aString5627.startsWith("ppc")) {
		    Class574.anInt7680 = 214610089;
		    return -1;
		}
		Class574.aStringArray7690 = new String[3];
		Class574.aStringArray7690[0] = "sdk-mac-dynamic";
		Class574.aStringArray7690[1] = "twitchsdk";
		Class574.aStringArray7690[2] = "twitchtv";
		Class574.aBoolArray7689 = new boolean[3];
		Class574.aBoolArray7689[0] = false;
		Class574.aBoolArray7689[1] = false;
		Class574.aBoolArray7689[2] = true;
	    } else if (Class503.aString5626.startsWith("win")) {
		Class574.aStringArray7690 = new String[6];
		Class574.aStringArray7690[0] = "avutil-ttv-51";
		Class574.aStringArray7690[1] = "libmp3lame-ttv";
		Class574.aStringArray7690[2] = "swresample-ttv-0";
		Class574.aStringArray7690[5] = "twitchtv";
		if (Class503.aString5627.startsWith("amd64")
		    || Class503.aString5627.startsWith("x86_64")) {
		    Class574.aStringArray7690[3] = "libmfxsw64";
		    Class574.aStringArray7690[4] = "twitchsdk_64_release";
		} else if (Class503.aString5627.startsWith("i386")
			   || Class503.aString5627.startsWith("i486")
			   || Class503.aString5627.startsWith("i586")
			   || Class503.aString5627.startsWith("x86")) {
		    Class574.aStringArray7690[3] = "libmfxsw32";
		    Class574.aStringArray7690[4] = "twitchsdk_32_release";
		} else {
		    Class574.anInt7680 = 214610089;
		    return -1;
		}
		Class574.aBoolArray7689 = new boolean[6];
		Class574.aBoolArray7689[0] = true;
		Class574.aBoolArray7689[1] = true;
		Class574.aBoolArray7689[2] = true;
		Class574.aBoolArray7689[3] = false;
		Class574.aBoolArray7689[4] = true;
		Class574.aBoolArray7689[5] = true;
	    } else {
		Class574.anInt7680 = 214610089;
		return -1;
	    }
	}
	Class574.anInt7680 = -1360119069;
	return 0;
    }
}
