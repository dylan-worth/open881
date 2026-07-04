/* Class352 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class352
{
    public int anInt3622;
    public byte aByte3623;
    boolean aBool3624;
    Class9 aClass9_3625;
    int anInt3626 = 0;
    public byte[] aByteArray3627;
    int anInt3628;
    boolean aBool3629;
    public byte aByte3630;
    public byte aByte3631;
    public boolean[] aBoolArray3632;
    public byte aByte3633;
    public String aString3634 = null;
    long[] aLongArray3635;
    static final byte aByte3636 = 126;
    public int anInt3637;
    int[] anIntArray3638;
    public int[] anIntArray3639;
    long aLong3640;
    public boolean aBool3641;
    public int anInt3642;
    public int anInt3643;
    long[] aLongArray3644;
    public String[] aStringArray3645;
    public String[] aStringArray3646;
    int[] anIntArray3647;
    static final int anInt3648 = 6;
    static final byte aByte3649 = 127;
    static final byte aByte3650 = 125;
    static final byte aByte3651 = 0;
    public static final byte aByte3652 = -1;
    public static int anInt3653;
    
    boolean method6189(int i, String string) {
	if (null == string)
	    string = "";
	else if (string.length() > 80)
	    string = string.substring(0, 80);
	if (aClass9_3625 != null) {
	    Class534 class534 = aClass9_3625.method579((long) i);
	    if (class534 != null) {
		if (class534 instanceof Class534_Sub6) {
		    Class534_Sub6 class534_sub6 = (Class534_Sub6) class534;
		    if (class534_sub6.anObject10417 instanceof String) {
			if (string.equals(class534_sub6.anObject10417))
			    return false;
			class534_sub6.method8892((byte) 1);
			aClass9_3625.method581(new Class534_Sub6(string),
					       (8258869577519436579L
						* class534_sub6.aLong7158));
			return true;
		    }
		}
		class534.method8892((byte) 1);
	    }
	} else
	    aClass9_3625 = new Class9(4);
	aClass9_3625.method581(new Class534_Sub6(string), (long) i);
	return true;
    }
    
    void method6190(int i, int i_0_) {
	if (aBool3629) {
	    if (null != aLongArray3635)
		System.arraycopy(aLongArray3635, 0,
				 aLongArray3635 = new long[i], 0,
				 anInt3637 * 35375019);
	    else
		aLongArray3635 = new long[i];
	}
	if (aBool3624) {
	    if (aStringArray3645 != null)
		System.arraycopy(aStringArray3645, 0,
				 aStringArray3645 = new String[i], 0,
				 35375019 * anInt3637);
	    else
		aStringArray3645 = new String[i];
	}
	if (aByteArray3627 != null)
	    System.arraycopy(aByteArray3627, 0, aByteArray3627 = new byte[i],
			     0, anInt3637 * 35375019);
	else
	    aByteArray3627 = new byte[i];
	if (anIntArray3638 != null)
	    System.arraycopy(anIntArray3638, 0, anIntArray3638 = new int[i], 0,
			     anInt3637 * 35375019);
	else
	    anIntArray3638 = new int[i];
	if (anIntArray3639 != null)
	    System.arraycopy(anIntArray3639, 0, anIntArray3639 = new int[i], 0,
			     35375019 * anInt3637);
	else
	    anIntArray3639 = new int[i];
	if (null != aBoolArray3632)
	    System.arraycopy(aBoolArray3632, 0,
			     aBoolArray3632 = new boolean[i], 0,
			     35375019 * anInt3637);
	else
	    aBoolArray3632 = new boolean[i];
    }
    
    void method6191(int i, int i_1_) {
	if (aBool3629) {
	    if (aLongArray3644 != null)
		System.arraycopy(aLongArray3644, 0,
				 aLongArray3644 = new long[i], 0,
				 -1394878511 * anInt3643);
	    else
		aLongArray3644 = new long[i];
	}
	if (aBool3624) {
	    if (null != aStringArray3646)
		System.arraycopy(aStringArray3646, 0,
				 aStringArray3646 = new String[i], 0,
				 anInt3643 * -1394878511);
	    else
		aStringArray3646 = new String[i];
	}
    }
    
    int method6192(int i, byte i_2_) {
	if (126 == i_2_ || i_2_ == 127)
	    return -1;
	if (i == -1507311497 * anInt3622
	    && (-1 == anInt3642 * 104457713
		|| aByteArray3627[anInt3642 * 104457713] < 125))
	    return -1;
	if (i_2_ == aByteArray3627[i])
	    return -1;
	aByteArray3627[i] = i_2_;
	method6240(-6743402);
	return i;
    }
    
    void method6193(int i) {
	if (aBool3629) {
	    if (null != aLongArray3635)
		System.arraycopy(aLongArray3635, 0,
				 aLongArray3635 = new long[i], 0,
				 anInt3637 * 35375019);
	    else
		aLongArray3635 = new long[i];
	}
	if (aBool3624) {
	    if (aStringArray3645 != null)
		System.arraycopy(aStringArray3645, 0,
				 aStringArray3645 = new String[i], 0,
				 35375019 * anInt3637);
	    else
		aStringArray3645 = new String[i];
	}
	if (aByteArray3627 != null)
	    System.arraycopy(aByteArray3627, 0, aByteArray3627 = new byte[i],
			     0, anInt3637 * 35375019);
	else
	    aByteArray3627 = new byte[i];
	if (anIntArray3638 != null)
	    System.arraycopy(anIntArray3638, 0, anIntArray3638 = new int[i], 0,
			     anInt3637 * 35375019);
	else
	    anIntArray3638 = new int[i];
	if (anIntArray3639 != null)
	    System.arraycopy(anIntArray3639, 0, anIntArray3639 = new int[i], 0,
			     35375019 * anInt3637);
	else
	    anIntArray3639 = new int[i];
	if (null != aBoolArray3632)
	    System.arraycopy(aBoolArray3632, 0,
			     aBoolArray3632 = new boolean[i], 0,
			     35375019 * anInt3637);
	else
	    aBoolArray3632 = new boolean[i];
    }
    
    public Integer method6194(int i, byte i_3_) {
	if (null == aClass9_3625)
	    return null;
	Class534 class534 = aClass9_3625.method579((long) i);
	if (null == class534 || !(class534 instanceof Class534_Sub39))
	    return null;
	return new Integer(-705967177
			   * ((Class534_Sub39) class534).anInt10807);
    }
    
    public Long method6195(int i, byte i_4_) {
	if (null == aClass9_3625)
	    return null;
	Class534 class534 = aClass9_3625.method579((long) i);
	if (null == class534 || !(class534 instanceof Class534_Sub31))
	    return null;
	return new Long(((Class534_Sub31) class534).aLong10695
			* -4291396730769792553L);
    }
    
    int method6196(int i, byte i_5_) {
	if (126 == i_5_ || i_5_ == 127)
	    return -1;
	if (i == -1507311497 * anInt3622
	    && (-1 == anInt3642 * 104457713
		|| aByteArray3627[anInt3642 * 104457713] < 125))
	    return -1;
	if (i_5_ == aByteArray3627[i])
	    return -1;
	aByteArray3627[i] = i_5_;
	method6240(-439559636);
	return i;
    }
    
    public int[] method6197(byte i) {
	if (anIntArray3647 == null) {
	    String[] strings = new String[35375019 * anInt3637];
	    anIntArray3647 = new int[anInt3637 * 35375019];
	    for (int i_6_ = 0; i_6_ < 35375019 * anInt3637; i_6_++) {
		strings[i_6_] = aStringArray3645[i_6_];
		if (strings[i_6_] != null)
		    strings[i_6_] = strings[i_6_].toLowerCase();
		anIntArray3647[i_6_] = i_6_;
	    }
	    Class588.method9869(strings, anIntArray3647, (byte) 83);
	}
	return anIntArray3647;
    }
    
    void method6198(long l, String string, int i, int i_7_) {
	if (null != string && string.length() == 0)
	    string = null;
	if (aBool3629 != l > 0L)
	    throw new RuntimeException("");
	if ((string != null) != aBool3624)
	    throw new RuntimeException("");
	if (l > 0L && (aLongArray3635 == null
		       || anInt3637 * 35375019 >= aLongArray3635.length)
	    || (string != null
		&& (null == aStringArray3645
		    || anInt3637 * 35375019 >= aStringArray3645.length)))
	    method6190(5 + 35375019 * anInt3637, -1871516328);
	if (null != aLongArray3635)
	    aLongArray3635[35375019 * anInt3637] = l;
	if (null != aStringArray3645)
	    aStringArray3645[35375019 * anInt3637] = string;
	if (-1 == -1507311497 * anInt3622) {
	    anInt3622 = 1521259373 * anInt3637;
	    aByteArray3627[anInt3637 * 35375019] = (byte) 126;
	} else
	    aByteArray3627[anInt3637 * 35375019] = (byte) 0;
	anIntArray3638[35375019 * anInt3637] = 0;
	anIntArray3639[anInt3637 * 35375019] = i;
	aBoolArray3632[anInt3637 * 35375019] = false;
	anInt3637 += -1363608829;
	anIntArray3647 = null;
    }
    
    void method6199(int i, byte i_8_) {
	if (i < 0 || i >= anInt3637 * 35375019)
	    throw new RuntimeException("");
	anInt3637 -= -1363608829;
	anIntArray3647 = null;
	if (0 == anInt3637 * 35375019) {
	    aLongArray3635 = null;
	    aStringArray3645 = null;
	    aByteArray3627 = null;
	    anIntArray3638 = null;
	    anIntArray3639 = null;
	    aBoolArray3632 = null;
	    anInt3622 = -1357486407;
	    anInt3642 = 1748210927;
	} else {
	    System.arraycopy(aByteArray3627, 1 + i, aByteArray3627, i,
			     anInt3637 * 35375019 - i);
	    System.arraycopy(anIntArray3638, i + 1, anIntArray3638, i,
			     35375019 * anInt3637 - i);
	    System.arraycopy(anIntArray3639, i + 1, anIntArray3639, i,
			     anInt3637 * 35375019 - i);
	    System.arraycopy(aBoolArray3632, 1 + i, aBoolArray3632, i,
			     anInt3637 * 35375019 - i);
	    if (null != aLongArray3635)
		System.arraycopy(aLongArray3635, i + 1, aLongArray3635, i,
				 anInt3637 * 35375019 - i);
	    if (aStringArray3645 != null)
		System.arraycopy(aStringArray3645, i + 1, aStringArray3645, i,
				 anInt3637 * 35375019 - i);
	    method6240(-127832873);
	}
    }
    
    void method6200(long l, String string, int i) {
	if (null != string && string.length() == 0)
	    string = null;
	if (aBool3629 != l > 0L)
	    throw new RuntimeException("");
	if ((string != null) != aBool3624)
	    throw new RuntimeException("");
	if (l > 0L && (aLongArray3635 == null
		       || anInt3637 * 35375019 >= aLongArray3635.length)
	    || (string != null
		&& (null == aStringArray3645
		    || anInt3637 * 35375019 >= aStringArray3645.length)))
	    method6190(5 + 35375019 * anInt3637, -1861329265);
	if (null != aLongArray3635)
	    aLongArray3635[35375019 * anInt3637] = l;
	if (null != aStringArray3645)
	    aStringArray3645[35375019 * anInt3637] = string;
	if (-1 == -1507311497 * anInt3622) {
	    anInt3622 = 1521259373 * anInt3637;
	    aByteArray3627[anInt3637 * 35375019] = (byte) 126;
	} else
	    aByteArray3627[anInt3637 * 35375019] = (byte) 0;
	anIntArray3638[35375019 * anInt3637] = 0;
	anIntArray3639[anInt3637 * 35375019] = i;
	aBoolArray3632[anInt3637 * 35375019] = false;
	anInt3637 += -1363608829;
	anIntArray3647 = null;
    }
    
    void method6201() {
	if (35375019 * anInt3637 == 0) {
	    anInt3622 = -1357486407;
	    anInt3642 = 1748210927;
	} else {
	    anInt3622 = -1357486407;
	    anInt3642 = 1748210927;
	    int i = 0;
	    byte i_9_ = aByteArray3627[0];
	    for (int i_10_ = 1; i_10_ < anInt3637 * 35375019; i_10_++) {
		if (aByteArray3627[i_10_] > i_9_) {
		    if (i_9_ == 125)
			anInt3642 = i * -1748210927;
		    i = i_10_;
		    i_9_ = aByteArray3627[i_10_];
		} else if (-1 == 104457713 * anInt3642
			   && aByteArray3627[i_10_] == 125)
		    anInt3642 = i_10_ * -1748210927;
	    }
	    anInt3622 = i * 1357486407;
	    if (-1 != anInt3622 * -1507311497)
		aByteArray3627[anInt3622 * -1507311497] = (byte) 126;
	}
    }
    
    void method6202(int i, int i_11_) {
	anInt3643 -= -1985093327;
	if (-1394878511 * anInt3643 == 0) {
	    aLongArray3644 = null;
	    aStringArray3646 = null;
	} else {
	    if (null != aLongArray3644)
		System.arraycopy(aLongArray3644, 1 + i, aLongArray3644, i,
				 -1394878511 * anInt3643 - i);
	    if (null != aStringArray3646)
		System.arraycopy(aStringArray3646, 1 + i, aStringArray3646, i,
				 anInt3643 * -1394878511 - i);
	}
    }
    
    int method6203(int i, byte i_12_, int i_13_) {
	if (126 == i_12_ || i_12_ == 127)
	    return -1;
	if (i == -1507311497 * anInt3622
	    && (-1 == anInt3642 * 104457713
		|| aByteArray3627[anInt3642 * 104457713] < 125))
	    return -1;
	if (i_12_ == aByteArray3627[i])
	    return -1;
	aByteArray3627[i] = i_12_;
	method6240(-817143576);
	return i;
    }
    
    int method6204(int i, boolean bool, int i_14_) {
	if (aBoolArray3632[i] == bool)
	    return -1;
	aBoolArray3632[i] = bool;
	return i;
    }
    
    int method6205(int i, int i_15_, int i_16_, int i_17_, int i_18_) {
	int i_19_ = (1 << i_16_) - 1;
	int i_20_ = 31 == i_17_ ? -1 : (1 << 1 + i_17_) - 1;
	int i_21_ = i_20_ ^ i_19_;
	i_15_ <<= i_16_;
	i_15_ &= i_21_;
	int i_22_ = anIntArray3638[i];
	if (i_15_ == (i_22_ & i_21_))
	    return -1;
	i_22_ &= i_21_ ^ 0xffffffff;
	anIntArray3638[i] = i_22_ | i_15_;
	return i;
    }
    
    boolean method6206(int i, int i_23_, int i_24_) {
	if (aClass9_3625 != null) {
	    Class534 class534 = aClass9_3625.method579((long) i);
	    if (class534 != null) {
		if (class534 instanceof Class534_Sub39) {
		    Class534_Sub39 class534_sub39 = (Class534_Sub39) class534;
		    if (i_23_ == class534_sub39.anInt10807 * -705967177)
			return false;
		    class534_sub39.anInt10807 = i_23_ * 347734535;
		    return true;
		}
		class534.method8892((byte) 1);
	    }
	} else
	    aClass9_3625 = new Class9(4);
	aClass9_3625.method581(new Class534_Sub39(i_23_), (long) i);
	return true;
    }
    
    boolean method6207(int i, int i_25_, int i_26_, int i_27_, byte i_28_) {
	int i_29_ = (1 << i_26_) - 1;
	int i_30_ = i_27_ == 31 ? -1 : (1 << 1 + i_27_) - 1;
	int i_31_ = i_30_ ^ i_29_;
	i_25_ <<= i_26_;
	i_25_ &= i_31_;
	if (null != aClass9_3625) {
	    Class534 class534 = aClass9_3625.method579((long) i);
	    if (class534 != null) {
		if (class534 instanceof Class534_Sub39) {
		    Class534_Sub39 class534_sub39 = (Class534_Sub39) class534;
		    if (i_25_
			== (class534_sub39.anInt10807 * -705967177 & i_31_))
			return false;
		    Class534_Sub39 class534_sub39_32_;
		    (class534_sub39_32_ = class534_sub39).anInt10807
			= (347734535
			   * (-705967177 * class534_sub39_32_.anInt10807
			      & (i_31_ ^ 0xffffffff)));
		    Class534_Sub39 class534_sub39_33_;
		    (class534_sub39_33_ = class534_sub39).anInt10807
			= ((-705967177 * class534_sub39_33_.anInt10807 | i_25_)
			   * 347734535);
		    return true;
		}
		class534.method8892((byte) 1);
	    }
	} else
	    aClass9_3625 = new Class9(4);
	aClass9_3625.method581(new Class534_Sub39(i_25_), (long) i);
	return true;
    }
    
    boolean method6208(int i, long l) {
	if (null != aClass9_3625) {
	    Class534 class534 = aClass9_3625.method579((long) i);
	    if (null != class534) {
		if (class534 instanceof Class534_Sub31) {
		    Class534_Sub31 class534_sub31 = (Class534_Sub31) class534;
		    if (l == class534_sub31.aLong10695 * -4291396730769792553L)
			return false;
		    class534_sub31.aLong10695 = 1934962372971061735L * l;
		    return true;
		}
		class534.method8892((byte) 1);
	    }
	} else
	    aClass9_3625 = new Class9(4);
	aClass9_3625.method581(new Class534_Sub31(l), (long) i);
	return true;
    }
    
    void method6209(long l, String string, byte i) {
	if (null != string && string.length() == 0)
	    string = null;
	if (aBool3629 != l > 0L)
	    throw new RuntimeException("");
	if (aBool3624 != (string != null))
	    throw new RuntimeException("");
	if (l > 0L && (null == aLongArray3644
		       || -1394878511 * anInt3643 >= aLongArray3644.length)
	    || (null != string
		&& (null == aStringArray3646
		    || -1394878511 * anInt3643 >= aStringArray3646.length)))
	    method6191(5 + -1394878511 * anInt3643, -594499048);
	if (aLongArray3644 != null)
	    aLongArray3644[anInt3643 * -1394878511] = l;
	if (null != aStringArray3646)
	    aStringArray3646[anInt3643 * -1394878511] = string;
	anInt3643 += -1985093327;
    }
    
    void method6210(Class534_Sub40 class534_sub40, byte i) {
	int i_34_ = class534_sub40.method16527(8995844);
	if (i_34_ < 1 || i_34_ > 6)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (i_34_).toString());
	int i_35_ = class534_sub40.method16527(-2098351447);
	if (0 != (i_35_ & 0x1))
	    aBool3629 = true;
	if (0 != (i_35_ & 0x2))
	    aBool3624 = true;
	if (!aBool3629) {
	    aLongArray3635 = null;
	    aLongArray3644 = null;
	}
	if (!aBool3624) {
	    aStringArray3645 = null;
	    aStringArray3646 = null;
	}
	anInt3626 = class534_sub40.method16533(-258848859) * 50360833;
	anInt3628 = class534_sub40.method16533(-258848859) * -1182450631;
	if (i_34_ <= 3 && 0 != anInt3628 * 1484517897)
	    anInt3628 += 2109172896;
	anInt3637 = class534_sub40.method16529((byte) 1) * -1363608829;
	anInt3643 = class534_sub40.method16527(-1589722499) * -1985093327;
	aString3634 = class534_sub40.method16541((byte) -81);
	if (i_34_ >= 4)
	    class534_sub40.method16533(-258848859);
	aBool3641 = class534_sub40.method16527(1503114579) == 1;
	aByte3630 = class534_sub40.method16586((byte) 1);
	aByte3631 = class534_sub40.method16586((byte) 1);
	aByte3623 = class534_sub40.method16586((byte) 1);
	aByte3633 = class534_sub40.method16586((byte) 1);
	if (anInt3637 * 35375019 > 0) {
	    if (aBool3629 && (null == aLongArray3635
			      || aLongArray3635.length < anInt3637 * 35375019))
		aLongArray3635 = new long[anInt3637 * 35375019];
	    if (aBool3624
		&& (null == aStringArray3645
		    || aStringArray3645.length < 35375019 * anInt3637))
		aStringArray3645 = new String[anInt3637 * 35375019];
	    if (aByteArray3627 == null
		|| aByteArray3627.length < anInt3637 * 35375019)
		aByteArray3627 = new byte[anInt3637 * 35375019];
	    if (null == anIntArray3638
		|| anIntArray3638.length < anInt3637 * 35375019)
		anIntArray3638 = new int[anInt3637 * 35375019];
	    if (anIntArray3639 == null
		|| anIntArray3639.length < anInt3637 * 35375019)
		anIntArray3639 = new int[35375019 * anInt3637];
	    if (null == aBoolArray3632
		|| aBoolArray3632.length < anInt3637 * 35375019)
		aBoolArray3632 = new boolean[anInt3637 * 35375019];
	    for (int i_36_ = 0; i_36_ < anInt3637 * 35375019; i_36_++) {
		if (aBool3629)
		    aLongArray3635[i_36_]
			= class534_sub40.method16537(1359621443);
		if (aBool3624)
		    aStringArray3645[i_36_]
			= class534_sub40.method16540(76978635);
		aByteArray3627[i_36_] = class534_sub40.method16586((byte) 1);
		if (i_34_ >= 2)
		    anIntArray3638[i_36_]
			= class534_sub40.method16533(-258848859);
		if (i_34_ >= 5)
		    anIntArray3639[i_36_]
			= class534_sub40.method16529((byte) 1);
		else
		    anIntArray3639[i_36_] = 0;
		if (i_34_ >= 6)
		    aBoolArray3632[i_36_]
			= class534_sub40.method16527(-535457306) == 1;
		else
		    aBoolArray3632[i_36_] = false;
	    }
	    method6240(230598870);
	}
	if (anInt3643 * -1394878511 > 0) {
	    if (aBool3629
		&& (aLongArray3644 == null
		    || aLongArray3644.length < -1394878511 * anInt3643))
		aLongArray3644 = new long[-1394878511 * anInt3643];
	    if (aBool3624
		&& (aStringArray3646 == null
		    || aStringArray3646.length < anInt3643 * -1394878511))
		aStringArray3646 = new String[anInt3643 * -1394878511];
	    for (int i_37_ = 0; i_37_ < anInt3643 * -1394878511; i_37_++) {
		if (aBool3629)
		    aLongArray3644[i_37_]
			= class534_sub40.method16537(1359621443);
		if (aBool3624)
		    aStringArray3646[i_37_]
			= class534_sub40.method16540(76978635);
	    }
	}
	if (i_34_ >= 3) {
	    int i_38_ = class534_sub40.method16529((byte) 1);
	    if (i_38_ > 0) {
		aClass9_3625
		    = new Class9(i_38_ < 16
				 ? Class162.method2640(i_38_, (byte) 60) : 16);
		while (i_38_-- > 0) {
		    int i_39_ = class534_sub40.method16533(-258848859);
		    int i_40_ = i_39_ & 0x3fffffff;
		    int i_41_ = i_39_ >>> 30;
		    if (i_41_ == 0) {
			int i_42_ = class534_sub40.method16533(-258848859);
			aClass9_3625.method581(new Class534_Sub39(i_42_),
					       (long) i_40_);
		    } else if (1 == i_41_) {
			long l = class534_sub40.method16537(1359621443);
			aClass9_3625.method581(new Class534_Sub31(l),
					       (long) i_40_);
		    } else if (2 == i_41_) {
			String string = class534_sub40.method16541((byte) -5);
			aClass9_3625.method581(new Class534_Sub6(string),
					       (long) i_40_);
		    }
		}
	    }
	}
    }
    
    void method6211(long l, String string) {
	if (null != string && string.length() == 0)
	    string = null;
	if (aBool3629 != l > 0L)
	    throw new RuntimeException("");
	if (aBool3624 != (string != null))
	    throw new RuntimeException("");
	if (l > 0L && (null == aLongArray3644
		       || -1394878511 * anInt3643 >= aLongArray3644.length)
	    || (null != string
		&& (null == aStringArray3646
		    || -1394878511 * anInt3643 >= aStringArray3646.length)))
	    method6191(5 + -1394878511 * anInt3643, -2389329);
	if (aLongArray3644 != null)
	    aLongArray3644[anInt3643 * -1394878511] = l;
	if (null != aStringArray3646)
	    aStringArray3646[anInt3643 * -1394878511] = string;
	anInt3643 += -1985093327;
    }
    
    int method6212(int i, byte i_43_) {
	if (126 == i_43_ || i_43_ == 127)
	    return -1;
	if (i == -1507311497 * anInt3622
	    && (-1 == anInt3642 * 104457713
		|| aByteArray3627[anInt3642 * 104457713] < 125))
	    return -1;
	if (i_43_ == aByteArray3627[i])
	    return -1;
	aByteArray3627[i] = i_43_;
	method6240(-1722797355);
	return i;
    }
    
    void method6213(int i) {
	if (aBool3629) {
	    if (null != aLongArray3635)
		System.arraycopy(aLongArray3635, 0,
				 aLongArray3635 = new long[i], 0,
				 anInt3637 * 35375019);
	    else
		aLongArray3635 = new long[i];
	}
	if (aBool3624) {
	    if (aStringArray3645 != null)
		System.arraycopy(aStringArray3645, 0,
				 aStringArray3645 = new String[i], 0,
				 35375019 * anInt3637);
	    else
		aStringArray3645 = new String[i];
	}
	if (aByteArray3627 != null)
	    System.arraycopy(aByteArray3627, 0, aByteArray3627 = new byte[i],
			     0, anInt3637 * 35375019);
	else
	    aByteArray3627 = new byte[i];
	if (anIntArray3638 != null)
	    System.arraycopy(anIntArray3638, 0, anIntArray3638 = new int[i], 0,
			     anInt3637 * 35375019);
	else
	    anIntArray3638 = new int[i];
	if (anIntArray3639 != null)
	    System.arraycopy(anIntArray3639, 0, anIntArray3639 = new int[i], 0,
			     35375019 * anInt3637);
	else
	    anIntArray3639 = new int[i];
	if (null != aBoolArray3632)
	    System.arraycopy(aBoolArray3632, 0,
			     aBoolArray3632 = new boolean[i], 0,
			     35375019 * anInt3637);
	else
	    aBoolArray3632 = new boolean[i];
    }
    
    void method6214(int i) {
	if (aBool3629) {
	    if (null != aLongArray3635)
		System.arraycopy(aLongArray3635, 0,
				 aLongArray3635 = new long[i], 0,
				 anInt3637 * 35375019);
	    else
		aLongArray3635 = new long[i];
	}
	if (aBool3624) {
	    if (aStringArray3645 != null)
		System.arraycopy(aStringArray3645, 0,
				 aStringArray3645 = new String[i], 0,
				 35375019 * anInt3637);
	    else
		aStringArray3645 = new String[i];
	}
	if (aByteArray3627 != null)
	    System.arraycopy(aByteArray3627, 0, aByteArray3627 = new byte[i],
			     0, anInt3637 * 35375019);
	else
	    aByteArray3627 = new byte[i];
	if (anIntArray3638 != null)
	    System.arraycopy(anIntArray3638, 0, anIntArray3638 = new int[i], 0,
			     anInt3637 * 35375019);
	else
	    anIntArray3638 = new int[i];
	if (anIntArray3639 != null)
	    System.arraycopy(anIntArray3639, 0, anIntArray3639 = new int[i], 0,
			     35375019 * anInt3637);
	else
	    anIntArray3639 = new int[i];
	if (null != aBoolArray3632)
	    System.arraycopy(aBoolArray3632, 0,
			     aBoolArray3632 = new boolean[i], 0,
			     35375019 * anInt3637);
	else
	    aBoolArray3632 = new boolean[i];
    }
    
    void method6215(int i) {
	if (aBool3629) {
	    if (null != aLongArray3635)
		System.arraycopy(aLongArray3635, 0,
				 aLongArray3635 = new long[i], 0,
				 anInt3637 * 35375019);
	    else
		aLongArray3635 = new long[i];
	}
	if (aBool3624) {
	    if (aStringArray3645 != null)
		System.arraycopy(aStringArray3645, 0,
				 aStringArray3645 = new String[i], 0,
				 35375019 * anInt3637);
	    else
		aStringArray3645 = new String[i];
	}
	if (aByteArray3627 != null)
	    System.arraycopy(aByteArray3627, 0, aByteArray3627 = new byte[i],
			     0, anInt3637 * 35375019);
	else
	    aByteArray3627 = new byte[i];
	if (anIntArray3638 != null)
	    System.arraycopy(anIntArray3638, 0, anIntArray3638 = new int[i], 0,
			     anInt3637 * 35375019);
	else
	    anIntArray3638 = new int[i];
	if (anIntArray3639 != null)
	    System.arraycopy(anIntArray3639, 0, anIntArray3639 = new int[i], 0,
			     35375019 * anInt3637);
	else
	    anIntArray3639 = new int[i];
	if (null != aBoolArray3632)
	    System.arraycopy(aBoolArray3632, 0,
			     aBoolArray3632 = new boolean[i], 0,
			     35375019 * anInt3637);
	else
	    aBoolArray3632 = new boolean[i];
    }
    
    void method6216(int i) {
	if (aBool3629) {
	    if (null != aLongArray3635)
		System.arraycopy(aLongArray3635, 0,
				 aLongArray3635 = new long[i], 0,
				 anInt3637 * 35375019);
	    else
		aLongArray3635 = new long[i];
	}
	if (aBool3624) {
	    if (aStringArray3645 != null)
		System.arraycopy(aStringArray3645, 0,
				 aStringArray3645 = new String[i], 0,
				 35375019 * anInt3637);
	    else
		aStringArray3645 = new String[i];
	}
	if (aByteArray3627 != null)
	    System.arraycopy(aByteArray3627, 0, aByteArray3627 = new byte[i],
			     0, anInt3637 * 35375019);
	else
	    aByteArray3627 = new byte[i];
	if (anIntArray3638 != null)
	    System.arraycopy(anIntArray3638, 0, anIntArray3638 = new int[i], 0,
			     anInt3637 * 35375019);
	else
	    anIntArray3638 = new int[i];
	if (anIntArray3639 != null)
	    System.arraycopy(anIntArray3639, 0, anIntArray3639 = new int[i], 0,
			     35375019 * anInt3637);
	else
	    anIntArray3639 = new int[i];
	if (null != aBoolArray3632)
	    System.arraycopy(aBoolArray3632, 0,
			     aBoolArray3632 = new boolean[i], 0,
			     35375019 * anInt3637);
	else
	    aBoolArray3632 = new boolean[i];
    }
    
    public int method6217(String string) {
	if (null == string || string.length() == 0)
	    return -1;
	for (int i = 0; i < anInt3637 * 35375019; i++) {
	    if (aStringArray3645[i].equals(string))
		return i;
	}
	return -1;
    }
    
    public int method6218(String string) {
	if (null == string || string.length() == 0)
	    return -1;
	for (int i = 0; i < anInt3637 * 35375019; i++) {
	    if (aStringArray3645[i].equals(string))
		return i;
	}
	return -1;
    }
    
    public int method6219(String string) {
	if (null == string || string.length() == 0)
	    return -1;
	for (int i = 0; i < anInt3637 * 35375019; i++) {
	    if (aStringArray3645[i].equals(string))
		return i;
	}
	return -1;
    }
    
    public int method6220(String string) {
	if (null == string || string.length() == 0)
	    return -1;
	for (int i = 0; i < anInt3637 * 35375019; i++) {
	    if (aStringArray3645[i].equals(string))
		return i;
	}
	return -1;
    }
    
    public int method6221(int i, int i_44_, int i_45_) {
	int i_46_ = i_45_ == 31 ? -1 : (1 << 1 + i_45_) - 1;
	return (anIntArray3638[i] & i_46_) >>> i_44_;
    }
    
    void method6222(int i) {
	if (aBool3629) {
	    if (null != aLongArray3635)
		System.arraycopy(aLongArray3635, 0,
				 aLongArray3635 = new long[i], 0,
				 anInt3637 * 35375019);
	    else
		aLongArray3635 = new long[i];
	}
	if (aBool3624) {
	    if (aStringArray3645 != null)
		System.arraycopy(aStringArray3645, 0,
				 aStringArray3645 = new String[i], 0,
				 35375019 * anInt3637);
	    else
		aStringArray3645 = new String[i];
	}
	if (aByteArray3627 != null)
	    System.arraycopy(aByteArray3627, 0, aByteArray3627 = new byte[i],
			     0, anInt3637 * 35375019);
	else
	    aByteArray3627 = new byte[i];
	if (anIntArray3638 != null)
	    System.arraycopy(anIntArray3638, 0, anIntArray3638 = new int[i], 0,
			     anInt3637 * 35375019);
	else
	    anIntArray3638 = new int[i];
	if (anIntArray3639 != null)
	    System.arraycopy(anIntArray3639, 0, anIntArray3639 = new int[i], 0,
			     35375019 * anInt3637);
	else
	    anIntArray3639 = new int[i];
	if (null != aBoolArray3632)
	    System.arraycopy(aBoolArray3632, 0,
			     aBoolArray3632 = new boolean[i], 0,
			     35375019 * anInt3637);
	else
	    aBoolArray3632 = new boolean[i];
    }
    
    public Integer method6223(int i) {
	if (null == aClass9_3625)
	    return null;
	Class534 class534 = aClass9_3625.method579((long) i);
	if (null == class534 || !(class534 instanceof Class534_Sub39))
	    return null;
	return new Integer(-705967177
			   * ((Class534_Sub39) class534).anInt10807);
    }
    
    boolean method6224(int i, int i_47_) {
	if (aClass9_3625 != null) {
	    Class534 class534 = aClass9_3625.method579((long) i);
	    if (class534 != null) {
		if (class534 instanceof Class534_Sub39) {
		    Class534_Sub39 class534_sub39 = (Class534_Sub39) class534;
		    if (i_47_ == class534_sub39.anInt10807 * -705967177)
			return false;
		    class534_sub39.anInt10807 = i_47_ * 347734535;
		    return true;
		}
		class534.method8892((byte) 1);
	    }
	} else
	    aClass9_3625 = new Class9(4);
	aClass9_3625.method581(new Class534_Sub39(i_47_), (long) i);
	return true;
    }
    
    public Long method6225(int i) {
	if (null == aClass9_3625)
	    return null;
	Class534 class534 = aClass9_3625.method579((long) i);
	if (null == class534 || !(class534 instanceof Class534_Sub31))
	    return null;
	return new Long(((Class534_Sub31) class534).aLong10695
			* -4291396730769792553L);
    }
    
    public String method6226(int i) {
	if (aClass9_3625 == null)
	    return null;
	Class534 class534 = aClass9_3625.method579((long) i);
	if (null == class534 || !(class534 instanceof Class534_Sub6))
	    return null;
	return (String) ((Class534_Sub6) class534).anObject10417;
    }
    
    public String method6227(int i) {
	if (aClass9_3625 == null)
	    return null;
	Class534 class534 = aClass9_3625.method579((long) i);
	if (null == class534 || !(class534 instanceof Class534_Sub6))
	    return null;
	return (String) ((Class534_Sub6) class534).anObject10417;
    }
    
    void method6228(long l, String string, int i) {
	if (null != string && string.length() == 0)
	    string = null;
	if (aBool3629 != l > 0L)
	    throw new RuntimeException("");
	if ((string != null) != aBool3624)
	    throw new RuntimeException("");
	if (l > 0L && (aLongArray3635 == null
		       || anInt3637 * 35375019 >= aLongArray3635.length)
	    || (string != null
		&& (null == aStringArray3645
		    || anInt3637 * 35375019 >= aStringArray3645.length)))
	    method6190(5 + 35375019 * anInt3637, -2023796061);
	if (null != aLongArray3635)
	    aLongArray3635[35375019 * anInt3637] = l;
	if (null != aStringArray3645)
	    aStringArray3645[35375019 * anInt3637] = string;
	if (-1 == -1507311497 * anInt3622) {
	    anInt3622 = 1521259373 * anInt3637;
	    aByteArray3627[anInt3637 * 35375019] = (byte) 126;
	} else
	    aByteArray3627[anInt3637 * 35375019] = (byte) 0;
	anIntArray3638[35375019 * anInt3637] = 0;
	anIntArray3639[anInt3637 * 35375019] = i;
	aBoolArray3632[anInt3637 * 35375019] = false;
	anInt3637 += -1363608829;
	anIntArray3647 = null;
    }
    
    public Long method6229(int i) {
	if (null == aClass9_3625)
	    return null;
	Class534 class534 = aClass9_3625.method579((long) i);
	if (null == class534 || !(class534 instanceof Class534_Sub31))
	    return null;
	return new Long(((Class534_Sub31) class534).aLong10695
			* -4291396730769792553L);
    }
    
    public int method6230(String string, short i) {
	if (null == string || string.length() == 0)
	    return -1;
	for (int i_48_ = 0; i_48_ < anInt3637 * 35375019; i_48_++) {
	    if (aStringArray3645[i_48_].equals(string))
		return i_48_;
	}
	return -1;
    }
    
    void method6231(int i) {
	if (i < 0 || i >= anInt3637 * 35375019)
	    throw new RuntimeException("");
	anInt3637 -= -1363608829;
	anIntArray3647 = null;
	if (0 == anInt3637 * 35375019) {
	    aLongArray3635 = null;
	    aStringArray3645 = null;
	    aByteArray3627 = null;
	    anIntArray3638 = null;
	    anIntArray3639 = null;
	    aBoolArray3632 = null;
	    anInt3622 = -1357486407;
	    anInt3642 = 1748210927;
	} else {
	    System.arraycopy(aByteArray3627, 1 + i, aByteArray3627, i,
			     anInt3637 * 35375019 - i);
	    System.arraycopy(anIntArray3638, i + 1, anIntArray3638, i,
			     35375019 * anInt3637 - i);
	    System.arraycopy(anIntArray3639, i + 1, anIntArray3639, i,
			     anInt3637 * 35375019 - i);
	    System.arraycopy(aBoolArray3632, 1 + i, aBoolArray3632, i,
			     anInt3637 * 35375019 - i);
	    if (null != aLongArray3635)
		System.arraycopy(aLongArray3635, i + 1, aLongArray3635, i,
				 anInt3637 * 35375019 - i);
	    if (aStringArray3645 != null)
		System.arraycopy(aStringArray3645, i + 1, aStringArray3645, i,
				 anInt3637 * 35375019 - i);
	    method6240(-1401843108);
	}
    }
    
    void method6232(int i) {
	if (i < 0 || i >= anInt3637 * 35375019)
	    throw new RuntimeException("");
	anInt3637 -= -1363608829;
	anIntArray3647 = null;
	if (0 == anInt3637 * 35375019) {
	    aLongArray3635 = null;
	    aStringArray3645 = null;
	    aByteArray3627 = null;
	    anIntArray3638 = null;
	    anIntArray3639 = null;
	    aBoolArray3632 = null;
	    anInt3622 = -1357486407;
	    anInt3642 = 1748210927;
	} else {
	    System.arraycopy(aByteArray3627, 1 + i, aByteArray3627, i,
			     anInt3637 * 35375019 - i);
	    System.arraycopy(anIntArray3638, i + 1, anIntArray3638, i,
			     35375019 * anInt3637 - i);
	    System.arraycopy(anIntArray3639, i + 1, anIntArray3639, i,
			     anInt3637 * 35375019 - i);
	    System.arraycopy(aBoolArray3632, 1 + i, aBoolArray3632, i,
			     anInt3637 * 35375019 - i);
	    if (null != aLongArray3635)
		System.arraycopy(aLongArray3635, i + 1, aLongArray3635, i,
				 anInt3637 * 35375019 - i);
	    if (aStringArray3645 != null)
		System.arraycopy(aStringArray3645, i + 1, aStringArray3645, i,
				 anInt3637 * 35375019 - i);
	    method6240(-294009938);
	}
    }
    
    boolean method6233(int i, String string, byte i_49_) {
	if (null == string)
	    string = "";
	else if (string.length() > 80)
	    string = string.substring(0, 80);
	if (aClass9_3625 != null) {
	    Class534 class534 = aClass9_3625.method579((long) i);
	    if (class534 != null) {
		if (class534 instanceof Class534_Sub6) {
		    Class534_Sub6 class534_sub6 = (Class534_Sub6) class534;
		    if (class534_sub6.anObject10417 instanceof String) {
			if (string.equals(class534_sub6.anObject10417))
			    return false;
			class534_sub6.method8892((byte) 1);
			aClass9_3625.method581(new Class534_Sub6(string),
					       (8258869577519436579L
						* class534_sub6.aLong7158));
			return true;
		    }
		}
		class534.method8892((byte) 1);
	    }
	} else
	    aClass9_3625 = new Class9(4);
	aClass9_3625.method581(new Class534_Sub6(string), (long) i);
	return true;
    }
    
    void method6234() {
	if (35375019 * anInt3637 == 0) {
	    anInt3622 = -1357486407;
	    anInt3642 = 1748210927;
	} else {
	    anInt3622 = -1357486407;
	    anInt3642 = 1748210927;
	    int i = 0;
	    byte i_50_ = aByteArray3627[0];
	    for (int i_51_ = 1; i_51_ < anInt3637 * 35375019; i_51_++) {
		if (aByteArray3627[i_51_] > i_50_) {
		    if (i_50_ == 125)
			anInt3642 = i * -1748210927;
		    i = i_51_;
		    i_50_ = aByteArray3627[i_51_];
		} else if (-1 == 104457713 * anInt3642
			   && aByteArray3627[i_51_] == 125)
		    anInt3642 = i_51_ * -1748210927;
	    }
	    anInt3622 = i * 1357486407;
	    if (-1 != anInt3622 * -1507311497)
		aByteArray3627[anInt3622 * -1507311497] = (byte) 126;
	}
    }
    
    void method6235() {
	if (35375019 * anInt3637 == 0) {
	    anInt3622 = -1357486407;
	    anInt3642 = 1748210927;
	} else {
	    anInt3622 = -1357486407;
	    anInt3642 = 1748210927;
	    int i = 0;
	    byte i_52_ = aByteArray3627[0];
	    for (int i_53_ = 1; i_53_ < anInt3637 * 35375019; i_53_++) {
		if (aByteArray3627[i_53_] > i_52_) {
		    if (i_52_ == 125)
			anInt3642 = i * -1748210927;
		    i = i_53_;
		    i_52_ = aByteArray3627[i_53_];
		} else if (-1 == 104457713 * anInt3642
			   && aByteArray3627[i_53_] == 125)
		    anInt3642 = i_53_ * -1748210927;
	    }
	    anInt3622 = i * 1357486407;
	    if (-1 != anInt3622 * -1507311497)
		aByteArray3627[anInt3622 * -1507311497] = (byte) 126;
	}
    }
    
    void method6236(long l, String string) {
	if (null != string && string.length() == 0)
	    string = null;
	if (aBool3629 != l > 0L)
	    throw new RuntimeException("");
	if (aBool3624 != (string != null))
	    throw new RuntimeException("");
	if (l > 0L && (null == aLongArray3644
		       || -1394878511 * anInt3643 >= aLongArray3644.length)
	    || (null != string
		&& (null == aStringArray3646
		    || -1394878511 * anInt3643 >= aStringArray3646.length)))
	    method6191(5 + -1394878511 * anInt3643, -97314715);
	if (aLongArray3644 != null)
	    aLongArray3644[anInt3643 * -1394878511] = l;
	if (null != aStringArray3646)
	    aStringArray3646[anInt3643 * -1394878511] = string;
	anInt3643 += -1985093327;
    }
    
    public int method6237(int i, int i_54_, int i_55_, int i_56_) {
	int i_57_ = i_55_ == 31 ? -1 : (1 << 1 + i_55_) - 1;
	return (anIntArray3638[i] & i_57_) >>> i_54_;
    }
    
    boolean method6238(int i, int i_58_, int i_59_, int i_60_) {
	int i_61_ = (1 << i_59_) - 1;
	int i_62_ = i_60_ == 31 ? -1 : (1 << 1 + i_60_) - 1;
	int i_63_ = i_62_ ^ i_61_;
	i_58_ <<= i_59_;
	i_58_ &= i_63_;
	if (null != aClass9_3625) {
	    Class534 class534 = aClass9_3625.method579((long) i);
	    if (class534 != null) {
		if (class534 instanceof Class534_Sub39) {
		    Class534_Sub39 class534_sub39 = (Class534_Sub39) class534;
		    if (i_58_
			== (class534_sub39.anInt10807 * -705967177 & i_63_))
			return false;
		    Class534_Sub39 class534_sub39_64_;
		    (class534_sub39_64_ = class534_sub39).anInt10807
			= (347734535
			   * (-705967177 * class534_sub39_64_.anInt10807
			      & (i_63_ ^ 0xffffffff)));
		    Class534_Sub39 class534_sub39_65_;
		    (class534_sub39_65_ = class534_sub39).anInt10807
			= ((-705967177 * class534_sub39_65_.anInt10807 | i_58_)
			   * 347734535);
		    return true;
		}
		class534.method8892((byte) 1);
	    }
	} else
	    aClass9_3625 = new Class9(4);
	aClass9_3625.method581(new Class534_Sub39(i_58_), (long) i);
	return true;
    }
    
    int method6239(int i, byte i_66_) {
	if (126 == i_66_ || i_66_ == 127)
	    return -1;
	if (i == -1507311497 * anInt3622
	    && (-1 == anInt3642 * 104457713
		|| aByteArray3627[anInt3642 * 104457713] < 125))
	    return -1;
	if (i_66_ == aByteArray3627[i])
	    return -1;
	aByteArray3627[i] = i_66_;
	method6240(-544489443);
	return i;
    }
    
    void method6240(int i) {
	if (35375019 * anInt3637 == 0) {
	    anInt3622 = -1357486407;
	    anInt3642 = 1748210927;
	} else {
	    anInt3622 = -1357486407;
	    anInt3642 = 1748210927;
	    int i_67_ = 0;
	    byte i_68_ = aByteArray3627[0];
	    for (int i_69_ = 1; i_69_ < anInt3637 * 35375019; i_69_++) {
		if (aByteArray3627[i_69_] > i_68_) {
		    if (i_68_ == 125)
			anInt3642 = i_67_ * -1748210927;
		    i_67_ = i_69_;
		    i_68_ = aByteArray3627[i_69_];
		} else if (-1 == 104457713 * anInt3642
			   && aByteArray3627[i_69_] == 125)
		    anInt3642 = i_69_ * -1748210927;
	    }
	    anInt3622 = i_67_ * 1357486407;
	    if (-1 != anInt3622 * -1507311497)
		aByteArray3627[anInt3622 * -1507311497] = (byte) 126;
	}
    }
    
    int method6241(int i, byte i_70_) {
	if (126 == i_70_ || i_70_ == 127)
	    return -1;
	if (i == -1507311497 * anInt3622
	    && (-1 == anInt3642 * 104457713
		|| aByteArray3627[anInt3642 * 104457713] < 125))
	    return -1;
	if (i_70_ == aByteArray3627[i])
	    return -1;
	aByteArray3627[i] = i_70_;
	method6240(-425910649);
	return i;
    }
    
    int method6242(int i, boolean bool) {
	if (aBoolArray3632[i] == bool)
	    return -1;
	aBoolArray3632[i] = bool;
	return i;
    }
    
    int method6243(int i, boolean bool) {
	if (aBoolArray3632[i] == bool)
	    return -1;
	aBoolArray3632[i] = bool;
	return i;
    }
    
    public int method6244(int i, int i_71_, int i_72_) {
	int i_73_ = i_72_ == 31 ? -1 : (1 << 1 + i_72_) - 1;
	return (anIntArray3638[i] & i_73_) >>> i_71_;
    }
    
    boolean method6245(int i, int i_74_) {
	if (aClass9_3625 != null) {
	    Class534 class534 = aClass9_3625.method579((long) i);
	    if (class534 != null) {
		if (class534 instanceof Class534_Sub39) {
		    Class534_Sub39 class534_sub39 = (Class534_Sub39) class534;
		    if (i_74_ == class534_sub39.anInt10807 * -705967177)
			return false;
		    class534_sub39.anInt10807 = i_74_ * 347734535;
		    return true;
		}
		class534.method8892((byte) 1);
	    }
	} else
	    aClass9_3625 = new Class9(4);
	aClass9_3625.method581(new Class534_Sub39(i_74_), (long) i);
	return true;
    }
    
    boolean method6246(int i, int i_75_) {
	if (aClass9_3625 != null) {
	    Class534 class534 = aClass9_3625.method579((long) i);
	    if (class534 != null) {
		if (class534 instanceof Class534_Sub39) {
		    Class534_Sub39 class534_sub39 = (Class534_Sub39) class534;
		    if (i_75_ == class534_sub39.anInt10807 * -705967177)
			return false;
		    class534_sub39.anInt10807 = i_75_ * 347734535;
		    return true;
		}
		class534.method8892((byte) 1);
	    }
	} else
	    aClass9_3625 = new Class9(4);
	aClass9_3625.method581(new Class534_Sub39(i_75_), (long) i);
	return true;
    }
    
    int method6247(int i, int i_76_, int i_77_, int i_78_) {
	int i_79_ = (1 << i_77_) - 1;
	int i_80_ = 31 == i_78_ ? -1 : (1 << 1 + i_78_) - 1;
	int i_81_ = i_80_ ^ i_79_;
	i_76_ <<= i_77_;
	i_76_ &= i_81_;
	int i_82_ = anIntArray3638[i];
	if (i_76_ == (i_82_ & i_81_))
	    return -1;
	i_82_ &= i_81_ ^ 0xffffffff;
	anIntArray3638[i] = i_82_ | i_76_;
	return i;
    }
    
    int method6248(int i, int i_83_, int i_84_, int i_85_) {
	int i_86_ = (1 << i_84_) - 1;
	int i_87_ = 31 == i_85_ ? -1 : (1 << 1 + i_85_) - 1;
	int i_88_ = i_87_ ^ i_86_;
	i_83_ <<= i_84_;
	i_83_ &= i_88_;
	int i_89_ = anIntArray3638[i];
	if (i_83_ == (i_89_ & i_88_))
	    return -1;
	i_89_ &= i_88_ ^ 0xffffffff;
	anIntArray3638[i] = i_89_ | i_83_;
	return i;
    }
    
    boolean method6249(int i, String string) {
	if (null == string)
	    string = "";
	else if (string.length() > 80)
	    string = string.substring(0, 80);
	if (aClass9_3625 != null) {
	    Class534 class534 = aClass9_3625.method579((long) i);
	    if (class534 != null) {
		if (class534 instanceof Class534_Sub6) {
		    Class534_Sub6 class534_sub6 = (Class534_Sub6) class534;
		    if (class534_sub6.anObject10417 instanceof String) {
			if (string.equals(class534_sub6.anObject10417))
			    return false;
			class534_sub6.method8892((byte) 1);
			aClass9_3625.method581(new Class534_Sub6(string),
					       (8258869577519436579L
						* class534_sub6.aLong7158));
			return true;
		    }
		}
		class534.method8892((byte) 1);
	    }
	} else
	    aClass9_3625 = new Class9(4);
	aClass9_3625.method581(new Class534_Sub6(string), (long) i);
	return true;
    }
    
    int method6250(int i, boolean bool) {
	if (aBoolArray3632[i] == bool)
	    return -1;
	aBoolArray3632[i] = bool;
	return i;
    }
    
    public Class352(Class534_Sub40 class534_sub40) {
	anInt3628 = 0;
	anInt3622 = -1357486407;
	anInt3642 = 1748210927;
	method6210(class534_sub40, (byte) -124);
    }
    
    int method6251(int i, boolean bool) {
	if (aBoolArray3632[i] == bool)
	    return -1;
	aBoolArray3632[i] = bool;
	return i;
    }
    
    void method6252(long l, String string, int i) {
	if (null != string && string.length() == 0)
	    string = null;
	if (aBool3629 != l > 0L)
	    throw new RuntimeException("");
	if ((string != null) != aBool3624)
	    throw new RuntimeException("");
	if (l > 0L && (aLongArray3635 == null
		       || anInt3637 * 35375019 >= aLongArray3635.length)
	    || (string != null
		&& (null == aStringArray3645
		    || anInt3637 * 35375019 >= aStringArray3645.length)))
	    method6190(5 + 35375019 * anInt3637, -2123918727);
	if (null != aLongArray3635)
	    aLongArray3635[35375019 * anInt3637] = l;
	if (null != aStringArray3645)
	    aStringArray3645[35375019 * anInt3637] = string;
	if (-1 == -1507311497 * anInt3622) {
	    anInt3622 = 1521259373 * anInt3637;
	    aByteArray3627[anInt3637 * 35375019] = (byte) 126;
	} else
	    aByteArray3627[anInt3637 * 35375019] = (byte) 0;
	anIntArray3638[35375019 * anInt3637] = 0;
	anIntArray3639[anInt3637 * 35375019] = i;
	aBoolArray3632[anInt3637 * 35375019] = false;
	anInt3637 += -1363608829;
	anIntArray3647 = null;
    }
    
    public String method6253(int i, byte i_90_) {
	if (aClass9_3625 == null)
	    return null;
	Class534 class534 = aClass9_3625.method579((long) i);
	if (null == class534 || !(class534 instanceof Class534_Sub6))
	    return null;
	return (String) ((Class534_Sub6) class534).anObject10417;
    }
    
    boolean method6254(int i, String string) {
	if (null == string)
	    string = "";
	else if (string.length() > 80)
	    string = string.substring(0, 80);
	if (aClass9_3625 != null) {
	    Class534 class534 = aClass9_3625.method579((long) i);
	    if (class534 != null) {
		if (class534 instanceof Class534_Sub6) {
		    Class534_Sub6 class534_sub6 = (Class534_Sub6) class534;
		    if (class534_sub6.anObject10417 instanceof String) {
			if (string.equals(class534_sub6.anObject10417))
			    return false;
			class534_sub6.method8892((byte) 1);
			aClass9_3625.method581(new Class534_Sub6(string),
					       (8258869577519436579L
						* class534_sub6.aLong7158));
			return true;
		    }
		}
		class534.method8892((byte) 1);
	    }
	} else
	    aClass9_3625 = new Class9(4);
	aClass9_3625.method581(new Class534_Sub6(string), (long) i);
	return true;
    }
    
    void method6255(Class534_Sub40 class534_sub40) {
	int i = class534_sub40.method16527(1986932776);
	if (i < 1 || i > 6)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (i).toString());
	int i_91_ = class534_sub40.method16527(638534043);
	if (0 != (i_91_ & 0x1))
	    aBool3629 = true;
	if (0 != (i_91_ & 0x2))
	    aBool3624 = true;
	if (!aBool3629) {
	    aLongArray3635 = null;
	    aLongArray3644 = null;
	}
	if (!aBool3624) {
	    aStringArray3645 = null;
	    aStringArray3646 = null;
	}
	anInt3626 = class534_sub40.method16533(-258848859) * 50360833;
	anInt3628 = class534_sub40.method16533(-258848859) * -1182450631;
	if (i <= 3 && 0 != anInt3628 * 1484517897)
	    anInt3628 += 2109172896;
	anInt3637 = class534_sub40.method16529((byte) 1) * -1363608829;
	anInt3643 = class534_sub40.method16527(1264354800) * -1985093327;
	aString3634 = class534_sub40.method16541((byte) -126);
	if (i >= 4)
	    class534_sub40.method16533(-258848859);
	aBool3641 = class534_sub40.method16527(1106323687) == 1;
	aByte3630 = class534_sub40.method16586((byte) 1);
	aByte3631 = class534_sub40.method16586((byte) 1);
	aByte3623 = class534_sub40.method16586((byte) 1);
	aByte3633 = class534_sub40.method16586((byte) 1);
	if (anInt3637 * 35375019 > 0) {
	    if (aBool3629 && (null == aLongArray3635
			      || aLongArray3635.length < anInt3637 * 35375019))
		aLongArray3635 = new long[anInt3637 * 35375019];
	    if (aBool3624
		&& (null == aStringArray3645
		    || aStringArray3645.length < 35375019 * anInt3637))
		aStringArray3645 = new String[anInt3637 * 35375019];
	    if (aByteArray3627 == null
		|| aByteArray3627.length < anInt3637 * 35375019)
		aByteArray3627 = new byte[anInt3637 * 35375019];
	    if (null == anIntArray3638
		|| anIntArray3638.length < anInt3637 * 35375019)
		anIntArray3638 = new int[anInt3637 * 35375019];
	    if (anIntArray3639 == null
		|| anIntArray3639.length < anInt3637 * 35375019)
		anIntArray3639 = new int[35375019 * anInt3637];
	    if (null == aBoolArray3632
		|| aBoolArray3632.length < anInt3637 * 35375019)
		aBoolArray3632 = new boolean[anInt3637 * 35375019];
	    for (int i_92_ = 0; i_92_ < anInt3637 * 35375019; i_92_++) {
		if (aBool3629)
		    aLongArray3635[i_92_]
			= class534_sub40.method16537(1359621443);
		if (aBool3624)
		    aStringArray3645[i_92_]
			= class534_sub40.method16540(76978635);
		aByteArray3627[i_92_] = class534_sub40.method16586((byte) 1);
		if (i >= 2)
		    anIntArray3638[i_92_]
			= class534_sub40.method16533(-258848859);
		if (i >= 5)
		    anIntArray3639[i_92_]
			= class534_sub40.method16529((byte) 1);
		else
		    anIntArray3639[i_92_] = 0;
		if (i >= 6)
		    aBoolArray3632[i_92_]
			= class534_sub40.method16527(1246387115) == 1;
		else
		    aBoolArray3632[i_92_] = false;
	    }
	    method6240(-1645628991);
	}
	if (anInt3643 * -1394878511 > 0) {
	    if (aBool3629
		&& (aLongArray3644 == null
		    || aLongArray3644.length < -1394878511 * anInt3643))
		aLongArray3644 = new long[-1394878511 * anInt3643];
	    if (aBool3624
		&& (aStringArray3646 == null
		    || aStringArray3646.length < anInt3643 * -1394878511))
		aStringArray3646 = new String[anInt3643 * -1394878511];
	    for (int i_93_ = 0; i_93_ < anInt3643 * -1394878511; i_93_++) {
		if (aBool3629)
		    aLongArray3644[i_93_]
			= class534_sub40.method16537(1359621443);
		if (aBool3624)
		    aStringArray3646[i_93_]
			= class534_sub40.method16540(76978635);
	    }
	}
	if (i >= 3) {
	    int i_94_ = class534_sub40.method16529((byte) 1);
	    if (i_94_ > 0) {
		aClass9_3625
		    = new Class9(i_94_ < 16
				 ? Class162.method2640(i_94_, (byte) 42) : 16);
		while (i_94_-- > 0) {
		    int i_95_ = class534_sub40.method16533(-258848859);
		    int i_96_ = i_95_ & 0x3fffffff;
		    int i_97_ = i_95_ >>> 30;
		    if (i_97_ == 0) {
			int i_98_ = class534_sub40.method16533(-258848859);
			aClass9_3625.method581(new Class534_Sub39(i_98_),
					       (long) i_96_);
		    } else if (1 == i_97_) {
			long l = class534_sub40.method16537(1359621443);
			aClass9_3625.method581(new Class534_Sub31(l),
					       (long) i_96_);
		    } else if (2 == i_97_) {
			String string = class534_sub40.method16541((byte) -94);
			aClass9_3625.method581(new Class534_Sub6(string),
					       (long) i_96_);
		    }
		}
	    }
	}
    }
    
    void method6256(Class534_Sub40 class534_sub40) {
	int i = class534_sub40.method16527(-210904884);
	if (i < 1 || i > 6)
	    throw new RuntimeException(new StringBuilder().append("").append
					   (i).toString());
	int i_99_ = class534_sub40.method16527(-2054330663);
	if (0 != (i_99_ & 0x1))
	    aBool3629 = true;
	if (0 != (i_99_ & 0x2))
	    aBool3624 = true;
	if (!aBool3629) {
	    aLongArray3635 = null;
	    aLongArray3644 = null;
	}
	if (!aBool3624) {
	    aStringArray3645 = null;
	    aStringArray3646 = null;
	}
	anInt3626 = class534_sub40.method16533(-258848859) * 50360833;
	anInt3628 = class534_sub40.method16533(-258848859) * -1182450631;
	if (i <= 3 && 0 != anInt3628 * 1484517897)
	    anInt3628 += 2109172896;
	anInt3637 = class534_sub40.method16529((byte) 1) * -1363608829;
	anInt3643 = class534_sub40.method16527(-907945249) * -1985093327;
	aString3634 = class534_sub40.method16541((byte) -61);
	if (i >= 4)
	    class534_sub40.method16533(-258848859);
	aBool3641 = class534_sub40.method16527(952619218) == 1;
	aByte3630 = class534_sub40.method16586((byte) 1);
	aByte3631 = class534_sub40.method16586((byte) 1);
	aByte3623 = class534_sub40.method16586((byte) 1);
	aByte3633 = class534_sub40.method16586((byte) 1);
	if (anInt3637 * 35375019 > 0) {
	    if (aBool3629 && (null == aLongArray3635
			      || aLongArray3635.length < anInt3637 * 35375019))
		aLongArray3635 = new long[anInt3637 * 35375019];
	    if (aBool3624
		&& (null == aStringArray3645
		    || aStringArray3645.length < 35375019 * anInt3637))
		aStringArray3645 = new String[anInt3637 * 35375019];
	    if (aByteArray3627 == null
		|| aByteArray3627.length < anInt3637 * 35375019)
		aByteArray3627 = new byte[anInt3637 * 35375019];
	    if (null == anIntArray3638
		|| anIntArray3638.length < anInt3637 * 35375019)
		anIntArray3638 = new int[anInt3637 * 35375019];
	    if (anIntArray3639 == null
		|| anIntArray3639.length < anInt3637 * 35375019)
		anIntArray3639 = new int[35375019 * anInt3637];
	    if (null == aBoolArray3632
		|| aBoolArray3632.length < anInt3637 * 35375019)
		aBoolArray3632 = new boolean[anInt3637 * 35375019];
	    for (int i_100_ = 0; i_100_ < anInt3637 * 35375019; i_100_++) {
		if (aBool3629)
		    aLongArray3635[i_100_]
			= class534_sub40.method16537(1359621443);
		if (aBool3624)
		    aStringArray3645[i_100_]
			= class534_sub40.method16540(76978635);
		aByteArray3627[i_100_] = class534_sub40.method16586((byte) 1);
		if (i >= 2)
		    anIntArray3638[i_100_]
			= class534_sub40.method16533(-258848859);
		if (i >= 5)
		    anIntArray3639[i_100_]
			= class534_sub40.method16529((byte) 1);
		else
		    anIntArray3639[i_100_] = 0;
		if (i >= 6)
		    aBoolArray3632[i_100_]
			= class534_sub40.method16527(1969982736) == 1;
		else
		    aBoolArray3632[i_100_] = false;
	    }
	    method6240(-476172847);
	}
	if (anInt3643 * -1394878511 > 0) {
	    if (aBool3629
		&& (aLongArray3644 == null
		    || aLongArray3644.length < -1394878511 * anInt3643))
		aLongArray3644 = new long[-1394878511 * anInt3643];
	    if (aBool3624
		&& (aStringArray3646 == null
		    || aStringArray3646.length < anInt3643 * -1394878511))
		aStringArray3646 = new String[anInt3643 * -1394878511];
	    for (int i_101_ = 0; i_101_ < anInt3643 * -1394878511; i_101_++) {
		if (aBool3629)
		    aLongArray3644[i_101_]
			= class534_sub40.method16537(1359621443);
		if (aBool3624)
		    aStringArray3646[i_101_]
			= class534_sub40.method16540(76978635);
	    }
	}
	if (i >= 3) {
	    int i_102_ = class534_sub40.method16529((byte) 1);
	    if (i_102_ > 0) {
		aClass9_3625
		    = new Class9(i_102_ < 16
				 ? Class162.method2640(i_102_, (byte) 46)
				 : 16);
		while (i_102_-- > 0) {
		    int i_103_ = class534_sub40.method16533(-258848859);
		    int i_104_ = i_103_ & 0x3fffffff;
		    int i_105_ = i_103_ >>> 30;
		    if (i_105_ == 0) {
			int i_106_ = class534_sub40.method16533(-258848859);
			aClass9_3625.method581(new Class534_Sub39(i_106_),
					       (long) i_104_);
		    } else if (1 == i_105_) {
			long l = class534_sub40.method16537(1359621443);
			aClass9_3625.method581(new Class534_Sub31(l),
					       (long) i_104_);
		    } else if (2 == i_105_) {
			String string = class534_sub40.method16541((byte) -57);
			aClass9_3625.method581(new Class534_Sub6(string),
					       (long) i_104_);
		    }
		}
	    }
	}
    }
    
    public static void method6257(int i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10758, 2,
	     1846352783);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10759, 2,
	     -1756850473);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub10_10751, 1,
	     -597537290);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub25_10750, 1,
	     1538936286);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub24_10756, 1,
	     -281862289);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub9_10748),
						       1, -439265287);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub1_10762),
						       1, 641933674);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763, 1,
	     -1783055172);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub6_10743),
						       2, 1463439945);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub12_10753, 1,
	     1089313946);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub3_10767),
						       2, -1866114196);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub11_10749, 1,
	     585450856);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub27_10781, 0,
	     1099014216);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub27_10757, 0,
	     -227147782);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub5_10737),
						       2, 1845571184);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub22_10745,
	     Class302.aClass302_3246.anInt3244 * 1453209707, 1993680554);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub19_10741, 0,
	     1877188266);
	if (null != Class254.aClass185_2683
	    && Class254.aClass185_2683.method3534()
	    && Class254.aClass185_2683.method3409())
	    Class254.aClass185_2683.method3359();
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub33_10765, 1,
	     -2020207381);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub30_10739, 1,
	     12711675);
	Class480.method7924(926620920);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub20_10742, 0,
	     -1002536999);
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub37_10760, 4,
	     -948134469);
	Class635.method10538(-265506666);
	client.aClass512_11100.method8501((byte) 20).method10157(1051457569);
	client.aBool11059 = true;
    }
    
    static final void method6258(Class669 class669, byte i) {
	int i_107_ = (class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class662.method10992(i_107_, false, (byte) 26);
    }
    
    static final void method6259(Class669 class669, byte i) {
	int i_108_ = (class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (2 == -1050164879 * client.anInt11171
	    && i_108_ < client.anInt11324 * -1979292205) {
	    Class28 class28 = client.aClass28Array11327[i_108_];
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= class28.aString257;
	    if (class28.aString250 != null)
		class669.anObjectArray8593
		    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		    = class28.aString250;
	    else
		class669.anObjectArray8593
		    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		    = "";
	} else {
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	}
    }
    
    static final void method6260(int i) {
	byte[][][] is = client.aClass512_11100.method8411((byte) -114);
	byte i_109_ = (byte) (1373322351 * client.anInt11161 - 4 & 0xff);
	int i_110_ = (1373322351 * client.anInt11161
		      % client.aClass512_11100.method8417(1697631805));
	for (int i_111_ = 0; i_111_ < 4; i_111_++) {
	    for (int i_112_ = 0;
		 i_112_ < client.aClass512_11100.method8418(-1533611049);
		 i_112_++)
		is[i_111_][i_110_][i_112_] = i_109_;
	}
	if (Class674.anInt8633 * -878424575 != 3) {
	    for (int i_113_ = 0; i_113_ < 2; i_113_++) {
		client.anIntArray11177[i_113_] = -1000000;
		client.anIntArray11123[i_113_] = 1000000;
		client.anIntArray11179[i_113_] = 0;
		client.anIntArray11181[i_113_] = 1000000;
		client.anIntArray11135[i_113_] = 0;
	    }
	    Class438 class438
		= (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807()
		   .aClass438_4885);
	    Class468 class468 = client.aClass512_11100.method8552((byte) 0);
	    Class556 class556 = client.aClass512_11100.method8424((byte) 28);
	    if (2 == Class10.anInt75 * -891094135
		|| 3 == Class10.anInt75 * -891094135
		|| Class93.anInt901 * 8737185 != -1) {
		Class597 class597
		    = client.aClass512_11100.method8416((byte) 37);
		int i_114_;
		int i_115_;
		if (3 == -891094135 * Class10.anInt75) {
		    Class438 class438_116_
			= Class599.aClass298_Sub1_7871.method5381
			      (2118407735).method14248(2060234392);
		    if (Float.isNaN(class438_116_.aFloat4864))
			return;
		    i_114_ = ((int) class438_116_.aFloat4864
			      - (class597.anInt7859 * -424199969 << 9));
		    i_115_ = ((int) class438_116_.aFloat4865
			      - (class597.anInt7861 * -1166289421 << 9));
		    if (i_114_ < 0 || i_115_ < 0
			|| (i_114_ >> 9
			    >= (class468.aByteArrayArrayArray5145
				[-878424575 * Class674.anInt8633]).length)
			|| i_115_ >> 9 >= (class468.aByteArrayArrayArray5145
					   [Class674.anInt8633 * -878424575]
					   [i_114_ >> 9]).length)
			return;
		} else if (Class10.anInt75 * -891094135 == 2) {
		    i_114_ = (int) class438.aFloat4864;
		    i_115_ = (int) class438.aFloat4865;
		} else {
		    i_114_ = 8737185 * Class93.anInt901;
		    i_115_ = Class106.anInt1312 * 133182057;
		}
		if (((class468.aByteArrayArrayArray5145
		      [-878424575 * Class674.anInt8633][i_114_ >> 9]
		      [i_115_ >> 9])
		     & 0x4)
		    != 0)
		    Class537.method8911(class556.aClass568ArrayArrayArray7431,
					0, i_114_ >> 9, i_115_ >> 9, false,
					(byte) -44);
		else {
		    int i_117_;
		    int i_118_;
		    if (3 == -891094135 * Class10.anInt75) {
			Class438 class438_119_
			    = Class599.aClass298_Sub1_7871.method5380
				  ((byte) -67).method6137(1297255640);
			i_117_ = (((int) class438_119_.aFloat4864 >> 9)
				  - -424199969 * class597.anInt7859);
			i_118_ = (((int) class438_119_.aFloat4865 >> 9)
				  - class597.anInt7861 * -1166289421);
			if (i_117_ < 0 || i_118_ < 0
			    || (i_117_
				>= (class468.aByteArrayArrayArray5145
				    [-878424575 * Class674.anInt8633]).length)
			    || i_118_ >= (class468.aByteArrayArrayArray5145
					  [Class674.anInt8633 * -878424575]
					  [i_117_]).length)
			    return;
		    } else {
			i_117_ = Class200_Sub13.anInt9937 * -116109187 >> 9;
			i_118_ = Class636.anInt8305 * -1098179003 >> 9;
		    }
		    int i_120_ = i_114_ >> 9;
		    int i_121_ = i_115_ >> 9;
		    if (class468.method7608(i_117_, i_118_, -1705467380)) {
			int i_122_
			    = Class247.method4595((-116109187
						   * Class200_Sub13.anInt9937),
						  (-1098179003
						   * Class636.anInt8305),
						  3, -1684689580);
			if (Class677.anInt8654 * 1529694271 >= i_122_)
			    Class537.method8911
				(class556.aClass568ArrayArrayArray7431, 1,
				 i_117_, i_118_, false, (byte) 3);
		    } else {
		    while_32_:
			do {
			    if (Class566.anInt7589 * -864938791 < 2560) {
				int i_123_;
				if (i_120_ > i_117_)
				    i_123_ = i_120_ - i_117_;
				else
				    i_123_ = i_117_ - i_120_;
				int i_124_;
				if (i_121_ > i_118_)
				    i_124_ = i_121_ - i_118_;
				else
				    i_124_ = i_118_ - i_121_;
				if (0 == i_123_ && i_124_ == 0
				    || i_123_ <= -client.aClass512_11100
						      .method8417(903626222)
				    || i_123_ >= client.aClass512_11100
						     .method8417(16366105)
				    || i_124_ <= -client.aClass512_11100
						      .method8418(-1533611049)
				    || (i_124_
					>= client.aClass512_11100
					       .method8418(-1533611049))) {
				    if (3 != Class10.anInt75 * -891094135)
					Class262.method4824
					    (new StringBuilder().append
						 (i_117_).append
						 (Class29.aString260).append
						 (i_118_).append
						 (" ").append
						 (i_120_).append
						 (Class29.aString260).append
						 (i_121_).append
						 (" ").append
						 (class597.anInt7859
						  * -424199969)
						 .append
						 (Class29.aString260).append
						 (-1166289421
						  * class597.anInt7861)
						 .toString(),
					     new RuntimeException(),
					     (byte) 34);
				    break;
				}
				if (i_123_ > i_124_) {
				    int i_125_ = i_124_ * 65536 / i_123_;
				    int i_126_ = 32768;
				while_31_:
				    do {
					for (;;) {
					    if (i_117_ == i_120_)
						break while_31_;
					    if (i_117_ < i_120_)
						i_117_++;
					    else if (i_117_ > i_120_)
						i_117_--;
					    if (((class468
						  .aByteArrayArrayArray5145
						  [(-878424575
						    * Class674.anInt8633)]
						  [i_117_][i_118_])
						 & 0x4)
						!= 0) {
						Class537.method8911
						    ((class556
						      .aClass568ArrayArrayArray7431),
						     1, i_117_, i_118_, false,
						     (byte) 58);
						break while_31_;
					    }
					    if ((i_118_ + 1
						 < (class468
						    .aByteArrayArrayArray5145
						    [(-878424575
						      * Class674.anInt8633)]
						    [i_117_]).length)
						&& ((class468
						     .aByteArrayArrayArray5145
						     [(Class674.anInt8633
						       * -878424575)]
						     [i_117_][i_118_ + 1])
						    & 0x4) != 0) {
						Class537.method8911
						    ((class556
						      .aClass568ArrayArrayArray7431),
						     1, i_117_, 1 + i_118_,
						     false, (byte) 40);
						break while_31_;
					    }
					    if (i_118_ > 0
						&& ((class468
						     .aByteArrayArrayArray5145
						     [(-878424575
						       * Class674.anInt8633)]
						     [i_117_][i_118_ - 1])
						    & 0x4) != 0) {
						Class537.method8911
						    ((class556
						      .aClass568ArrayArrayArray7431),
						     1, i_117_, i_118_ - 1,
						     false, (byte) -23);
						break while_31_;
					    }
					    i_126_ += i_125_;
					    if (i_126_ >= 65536) {
						i_126_ -= 65536;
						if (i_118_ < i_121_) {
						    i_118_++;
						    if ((1 + i_118_
							 < (class468
							    .aByteArrayArrayArray5145
							    [(-878424575
							      * (Class674
								 .anInt8633))]
							    [i_117_]).length)
							&& (0
							    != ((class468
								 .aByteArrayArrayArray5145
								 [(-878424575
								   * (Class674
								      .anInt8633))]
								 [i_117_]
								 [i_118_ + 1])
								& 0x4))) {
							Class537.method8911
							    ((class556
							      .aClass568ArrayArrayArray7431),
							     1, i_117_,
							     1 + i_118_, false,
							     (byte) 93);
							break while_31_;
						    }
						} else if (i_118_ > i_121_
							   && --i_118_ > 0
							   && (0
							       != ((class468
								    .aByteArrayArrayArray5145
								    [(-878424575
								      * (Class674
									 .anInt8633))]
								    [i_117_]
								    [(i_118_
								      - 1)])
								   & 0x4)))
						    break;
					    }
					}
					Class537.method8911
					    ((class556
					      .aClass568ArrayArrayArray7431),
					     1, i_117_, i_118_ - 1, false,
					     (byte) -106);
				    } while (false);
				} else {
				    int i_127_ = i_123_ * 65536 / i_124_;
				    int i_128_ = 32768;
				    for (;;) {
					if (i_121_ == i_118_)
					    break while_32_;
					if (i_118_ < i_121_)
					    i_118_++;
					else if (i_118_ > i_121_)
					    i_118_--;
					if (((class468.aByteArrayArrayArray5145
					      [Class674.anInt8633 * -878424575]
					      [i_117_][i_118_])
					     & 0x4)
					    != 0) {
					    Class537.method8911
						((class556
						  .aClass568ArrayArrayArray7431),
						 1, i_117_, i_118_, false,
						 (byte) -104);
					    break while_32_;
					}
					if ((i_117_ + 1
					     < (class468
						.aByteArrayArrayArray5145
						[(-878424575
						  * (Class674
						     .anInt8633))]).length)
					    && ((class468
						 .aByteArrayArrayArray5145
						 [(Class674.anInt8633
						   * -878424575)]
						 [1 + i_117_][i_118_])
						& 0x4) != 0) {
					    Class537.method8911
						((class556
						  .aClass568ArrayArrayArray7431),
						 1, i_117_ + 1, i_118_, false,
						 (byte) 30);
					    break while_32_;
					}
					if (i_117_ > 0
					    && 0 != ((class468
						      .aByteArrayArrayArray5145
						      [(-878424575
							* Class674.anInt8633)]
						      [i_117_ - 1][i_118_])
						     & 0x4)) {
					    Class537.method8911
						((class556
						  .aClass568ArrayArrayArray7431),
						 1, i_117_ - 1, i_118_, false,
						 (byte) -41);
					    break while_32_;
					}
					i_128_ += i_127_;
					if (i_128_ >= 65536) {
					    i_128_ -= 65536;
					    if (i_117_ < i_120_) {
						i_117_++;
						if ((1 + i_117_
						     < (class468
							.aByteArrayArrayArray5145
							[(Class674.anInt8633
							  * -878424575)]).length)
						    && (0
							!= ((class468
							     .aByteArrayArrayArray5145
							     [(-878424575
							       * (Class674
								  .anInt8633))]
							     [i_117_ + 1]
							     [i_118_])
							    & 0x4))) {
						    Class537.method8911
							((class556
							  .aClass568ArrayArrayArray7431),
							 1, 1 + i_117_, i_118_,
							 false, (byte) 33);
						    break while_32_;
						}
					    } else if (i_117_ > i_120_
						       && --i_117_ > 0
						       && ((class468
							    .aByteArrayArrayArray5145
							    [((Class674
							       .anInt8633)
							      * -878424575)]
							    [i_117_ - 1]
							    [i_118_])
							   & 0x4) != 0)
						break;
					}
				    }
				    Class537.method8911
					(class556.aClass568ArrayArrayArray7431,
					 1, i_117_ - 1, i_118_, false,
					 (byte) 64);
				}
			    }
			} while (false);
		    }
		}
	    } else {
		int i_129_
		    = Class247.method4595((-116109187
					   * Class200_Sub13.anInt9937),
					  -1098179003 * Class636.anInt8305,
					  Class674.anInt8633 * -878424575,
					  -1233632671);
		if (i_129_ - Class677.anInt8654 * 1529694271 < 3200
		    && 0 != ((class468.aByteArrayArrayArray5145
			      [Class674.anInt8633 * -878424575]
			      [-116109187 * Class200_Sub13.anInt9937 >> 9]
			      [Class636.anInt8305 * -1098179003 >> 9])
			     & 0x4))
		    Class537.method8911(class556.aClass568ArrayArrayArray7431,
					1,
					(Class200_Sub13.anInt9937 * -116109187
					 >> 9),
					Class636.anInt8305 * -1098179003 >> 9,
					false, (byte) -32);
	    }
	}
    }
    
    static Class302[] method6261(int i) {
	return (new Class302[]
		{ Class302.aClass302_3245, Class302.aClass302_3240,
		  Class302.aClass302_3243, Class302.aClass302_3242,
		  Class302.aClass302_3246, Class302.aClass302_3239 });
    }
}
