/* Class674 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class674
{
    public static int anInt8633;
    
    static int method11112(char c, Class672 class672) {
	int i = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i = 1 + (c << 4);
	}
	if (c == 241 && class672 == Class672.aClass672_8625)
	    i = 1762;
	return i;
    }
    
    public static int method11113(CharSequence charsequence,
				  CharSequence charsequence_0_,
				  Class672 class672) {
	int i = charsequence.length();
	int i_1_ = charsequence_0_.length();
	int i_2_ = 0;
	int i_3_ = 0;
	char c = '\0';
	char c_4_ = '\0';
	while (i_2_ - c < i || i_3_ - c_4_ < i_1_) {
	    if (i_2_ - c >= i)
		return -1;
	    if (i_3_ - c_4_ >= i_1_)
		return 1;
	    char c_5_;
	    if (0 != c) {
		c_5_ = c;
		boolean bool = false;
	    } else
		c_5_ = charsequence.charAt(i_2_++);
	    char c_6_;
	    if (0 != c_4_) {
		c_6_ = c_4_;
		boolean bool = false;
	    } else
		c_6_ = charsequence_0_.charAt(i_3_++);
	    c = Class287.method5269(c_5_, -1093488945);
	    c_4_ = Class287.method5269(c_6_, -180678018);
	    c_5_ = Class631.method10469(c_5_, class672, -1034749752);
	    c_6_ = Class631.method10469(c_6_, class672, -1548262650);
	    if (c_5_ != c_6_ && (Character.toUpperCase(c_5_)
				 != Character.toUpperCase(c_6_))) {
		c_5_ = Character.toLowerCase(c_5_);
		c_6_ = Character.toLowerCase(c_6_);
		if (c_5_ != c_6_)
		    return (Class471.method7657(c_5_, class672, 1112097313)
			    - Class471.method7657(c_6_, class672, 1738089712));
	    }
	}
	int i_7_ = Math.min(i, i_1_);
	for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
	    if (Class672.aClass672_8631 == class672) {
		i_2_ = i - 1 - i_8_;
		i_3_ = i_1_ - 1 - i_8_;
	    } else
		i_2_ = i_3_ = i_8_;
	    char c_9_ = charsequence.charAt(i_2_);
	    char c_10_ = charsequence_0_.charAt(i_3_);
	    if (c_9_ != c_10_ && (Character.toUpperCase(c_9_)
				  != Character.toUpperCase(c_10_))) {
		c_9_ = Character.toLowerCase(c_9_);
		c_10_ = Character.toLowerCase(c_10_);
		if (c_9_ != c_10_)
		    return (Class471.method7657(c_9_, class672, 1560695619)
			    - Class471.method7657(c_10_, class672,
						  2006193459));
	    }
	}
	int i_11_ = i - i_1_;
	if (i_11_ != 0)
	    return i_11_;
	for (int i_12_ = 0; i_12_ < i_7_; i_12_++) {
	    char c_13_ = charsequence.charAt(i_12_);
	    char c_14_ = charsequence_0_.charAt(i_12_);
	    if (c_14_ != c_13_)
		return (Class471.method7657(c_13_, class672, 1463910541)
			- Class471.method7657(c_14_, class672, 743687007));
	}
	return 0;
    }
    
    public static int method11114(CharSequence charsequence,
				  CharSequence charsequence_15_,
				  Class672 class672) {
	int i = charsequence.length();
	int i_16_ = charsequence_15_.length();
	int i_17_ = 0;
	int i_18_ = 0;
	char c = '\0';
	char c_19_ = '\0';
	while (i_17_ - c < i || i_18_ - c_19_ < i_16_) {
	    if (i_17_ - c >= i)
		return -1;
	    if (i_18_ - c_19_ >= i_16_)
		return 1;
	    char c_20_;
	    if (0 != c) {
		c_20_ = c;
		boolean bool = false;
	    } else
		c_20_ = charsequence.charAt(i_17_++);
	    char c_21_;
	    if (0 != c_19_) {
		c_21_ = c_19_;
		boolean bool = false;
	    } else
		c_21_ = charsequence_15_.charAt(i_18_++);
	    c = Class287.method5269(c_20_, 1805929916);
	    c_19_ = Class287.method5269(c_21_, 998836786);
	    c_20_ = Class631.method10469(c_20_, class672, -1716747658);
	    c_21_ = Class631.method10469(c_21_, class672, -1582573840);
	    if (c_20_ != c_21_ && (Character.toUpperCase(c_20_)
				   != Character.toUpperCase(c_21_))) {
		c_20_ = Character.toLowerCase(c_20_);
		c_21_ = Character.toLowerCase(c_21_);
		if (c_20_ != c_21_)
		    return (Class471.method7657(c_20_, class672, 1508675774)
			    - Class471.method7657(c_21_, class672,
						  1082604743));
	    }
	}
	int i_22_ = Math.min(i, i_16_);
	for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
	    if (Class672.aClass672_8631 == class672) {
		i_17_ = i - 1 - i_23_;
		i_18_ = i_16_ - 1 - i_23_;
	    } else
		i_17_ = i_18_ = i_23_;
	    char c_24_ = charsequence.charAt(i_17_);
	    char c_25_ = charsequence_15_.charAt(i_18_);
	    if (c_24_ != c_25_ && (Character.toUpperCase(c_24_)
				   != Character.toUpperCase(c_25_))) {
		c_24_ = Character.toLowerCase(c_24_);
		c_25_ = Character.toLowerCase(c_25_);
		if (c_24_ != c_25_)
		    return (Class471.method7657(c_24_, class672, 1076591024)
			    - Class471.method7657(c_25_, class672,
						  1858360903));
	    }
	}
	int i_26_ = i - i_16_;
	if (i_26_ != 0)
	    return i_26_;
	for (int i_27_ = 0; i_27_ < i_22_; i_27_++) {
	    char c_28_ = charsequence.charAt(i_27_);
	    char c_29_ = charsequence_15_.charAt(i_27_);
	    if (c_29_ != c_28_)
		return (Class471.method7657(c_28_, class672, 788370950)
			- Class471.method7657(c_29_, class672, 1303132441));
	}
	return 0;
    }
    
    public static int method11115(CharSequence charsequence,
				  CharSequence charsequence_30_,
				  Class672 class672) {
	int i = charsequence.length();
	int i_31_ = charsequence_30_.length();
	int i_32_ = 0;
	int i_33_ = 0;
	char c = '\0';
	char c_34_ = '\0';
	while (i_32_ - c < i || i_33_ - c_34_ < i_31_) {
	    if (i_32_ - c >= i)
		return -1;
	    if (i_33_ - c_34_ >= i_31_)
		return 1;
	    char c_35_;
	    if (0 != c) {
		c_35_ = c;
		boolean bool = false;
	    } else
		c_35_ = charsequence.charAt(i_32_++);
	    char c_36_;
	    if (0 != c_34_) {
		c_36_ = c_34_;
		boolean bool = false;
	    } else
		c_36_ = charsequence_30_.charAt(i_33_++);
	    c = Class287.method5269(c_35_, 882564262);
	    c_34_ = Class287.method5269(c_36_, -674489282);
	    c_35_ = Class631.method10469(c_35_, class672, -1183274036);
	    c_36_ = Class631.method10469(c_36_, class672, -1752746774);
	    if (c_35_ != c_36_ && (Character.toUpperCase(c_35_)
				   != Character.toUpperCase(c_36_))) {
		c_35_ = Character.toLowerCase(c_35_);
		c_36_ = Character.toLowerCase(c_36_);
		if (c_35_ != c_36_)
		    return (Class471.method7657(c_35_, class672, 715004641)
			    - Class471.method7657(c_36_, class672,
						  1325419739));
	    }
	}
	int i_37_ = Math.min(i, i_31_);
	for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
	    if (Class672.aClass672_8631 == class672) {
		i_32_ = i - 1 - i_38_;
		i_33_ = i_31_ - 1 - i_38_;
	    } else
		i_32_ = i_33_ = i_38_;
	    char c_39_ = charsequence.charAt(i_32_);
	    char c_40_ = charsequence_30_.charAt(i_33_);
	    if (c_39_ != c_40_ && (Character.toUpperCase(c_39_)
				   != Character.toUpperCase(c_40_))) {
		c_39_ = Character.toLowerCase(c_39_);
		c_40_ = Character.toLowerCase(c_40_);
		if (c_39_ != c_40_)
		    return (Class471.method7657(c_39_, class672, 1875085911)
			    - Class471.method7657(c_40_, class672,
						  1370425416));
	    }
	}
	int i_41_ = i - i_31_;
	if (i_41_ != 0)
	    return i_41_;
	for (int i_42_ = 0; i_42_ < i_37_; i_42_++) {
	    char c_43_ = charsequence.charAt(i_42_);
	    char c_44_ = charsequence_30_.charAt(i_42_);
	    if (c_44_ != c_43_)
		return (Class471.method7657(c_43_, class672, 1744875849)
			- Class471.method7657(c_44_, class672, 1191065619));
	}
	return 0;
    }
    
    Class674() throws Throwable {
	throw new Error();
    }
    
    static char method11116(char c, Class672 class672) {
	if (c >= '\u00c0' && c <= '\u00ff') {
	    if (c >= '\u00c0' && c <= '\u00c6')
		return 'A';
	    if (c == '\u00c7')
		return 'C';
	    if (c >= '\u00c8' && c <= '\u00cb')
		return 'E';
	    if (c >= '\u00cc' && c <= '\u00cf')
		return 'I';
	    if ('\u00d1' == c && class672 != Class672.aClass672_8625)
		return 'N';
	    if (c >= '\u00d2' && c <= '\u00d6')
		return 'O';
	    if (c >= '\u00d9' && c <= '\u00dc')
		return 'U';
	    if ('\u00dd' == c)
		return 'Y';
	    if ('\u00df' == c)
		return 's';
	    if (c >= '\u00e0' && c <= '\u00e6')
		return 'a';
	    if (c == '\u00e7')
		return 'c';
	    if (c >= '\u00e8' && c <= '\u00eb')
		return 'e';
	    if (c >= '\u00ec' && c <= '\u00ef')
		return 'i';
	    if (c == '\u00f1' && class672 != Class672.aClass672_8625)
		return 'n';
	    if (c >= '\u00f2' && c <= '\u00f6')
		return 'o';
	    if (c >= '\u00f9' && c <= '\u00fc')
		return 'u';
	    if (c == '\u00fd' || c == '\u00ff')
		return 'y';
	}
	if (c == '\u0152')
	    return 'O';
	if ('\u0153' == c)
	    return 'o';
	if (c == '\u0178')
	    return 'Y';
	return c;
    }
    
    static char method11117(char c) {
	if (c == '\u00c6')
	    return 'E';
	if ('\u00e6' == c)
	    return 'e';
	if ('\u00df' == c)
	    return 's';
	if ('\u0152' == c)
	    return 'E';
	if ('\u0153' == c)
	    return 'e';
	return '\0';
    }
    
    public static int method11118(CharSequence charsequence,
				  CharSequence charsequence_45_,
				  Class672 class672) {
	int i = charsequence.length();
	int i_46_ = charsequence_45_.length();
	int i_47_ = 0;
	int i_48_ = 0;
	char c = '\0';
	char c_49_ = '\0';
	while (i_47_ - c < i || i_48_ - c_49_ < i_46_) {
	    if (i_47_ - c >= i)
		return -1;
	    if (i_48_ - c_49_ >= i_46_)
		return 1;
	    char c_50_;
	    if (0 != c) {
		c_50_ = c;
		boolean bool = false;
	    } else
		c_50_ = charsequence.charAt(i_47_++);
	    char c_51_;
	    if (0 != c_49_) {
		c_51_ = c_49_;
		boolean bool = false;
	    } else
		c_51_ = charsequence_45_.charAt(i_48_++);
	    c = Class287.method5269(c_50_, 1994327957);
	    c_49_ = Class287.method5269(c_51_, 1215121781);
	    c_50_ = Class631.method10469(c_50_, class672, -1535855758);
	    c_51_ = Class631.method10469(c_51_, class672, -1656992178);
	    if (c_50_ != c_51_ && (Character.toUpperCase(c_50_)
				   != Character.toUpperCase(c_51_))) {
		c_50_ = Character.toLowerCase(c_50_);
		c_51_ = Character.toLowerCase(c_51_);
		if (c_50_ != c_51_)
		    return (Class471.method7657(c_50_, class672, 758616188)
			    - Class471.method7657(c_51_, class672,
						  1389589857));
	    }
	}
	int i_52_ = Math.min(i, i_46_);
	for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
	    if (Class672.aClass672_8631 == class672) {
		i_47_ = i - 1 - i_53_;
		i_48_ = i_46_ - 1 - i_53_;
	    } else
		i_47_ = i_48_ = i_53_;
	    char c_54_ = charsequence.charAt(i_47_);
	    char c_55_ = charsequence_45_.charAt(i_48_);
	    if (c_54_ != c_55_ && (Character.toUpperCase(c_54_)
				   != Character.toUpperCase(c_55_))) {
		c_54_ = Character.toLowerCase(c_54_);
		c_55_ = Character.toLowerCase(c_55_);
		if (c_54_ != c_55_)
		    return (Class471.method7657(c_54_, class672, 1551072603)
			    - Class471.method7657(c_55_, class672,
						  1771770577));
	    }
	}
	int i_56_ = i - i_46_;
	if (i_56_ != 0)
	    return i_56_;
	for (int i_57_ = 0; i_57_ < i_52_; i_57_++) {
	    char c_58_ = charsequence.charAt(i_57_);
	    char c_59_ = charsequence_45_.charAt(i_57_);
	    if (c_59_ != c_58_)
		return (Class471.method7657(c_58_, class672, 1597215409)
			- Class471.method7657(c_59_, class672, 1014046431));
	}
	return 0;
    }
    
    static int method11119(char c, Class672 class672) {
	int i = c << 4;
	if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
	    c = Character.toLowerCase(c);
	    i = 1 + (c << 4);
	}
	if (c == 241 && class672 == Class672.aClass672_8625)
	    i = 1762;
	return i;
    }
    
    public static String method11120(long l, int i, boolean bool,
				     Class672 class672) {
	char c = ',';
	char c_60_ = '.';
	if (class672 == Class672.aClass672_8621) {
	    c = '.';
	    c_60_ = ',';
	}
	if (class672 == Class672.aClass672_8631)
	    c_60_ = '\u00a0';
	boolean bool_61_ = false;
	if (l < 0L) {
	    bool_61_ = true;
	    l = -l;
	}
	StringBuilder stringbuilder = new StringBuilder(26);
	if (i > 0) {
	    for (int i_62_ = 0; i_62_ < i; i_62_++) {
		int i_63_ = (int) l;
		l /= 10L;
		stringbuilder.append((char) (i_63_ + 48 - (int) l * 10));
	    }
	    stringbuilder.append(c);
	}
	int i_64_ = 0;
	for (;;) {
	    int i_65_ = (int) l;
	    l /= 10L;
	    stringbuilder.append((char) (i_65_ + 48 - 10 * (int) l));
	    if (l == 0L)
		break;
	    if (bool) {
		i_64_++;
		if (0 == i_64_ % 3)
		    stringbuilder.append(c_60_);
	    }
	}
	if (bool_61_)
	    stringbuilder.append('-');
	return stringbuilder.reverse().toString();
    }
    
    static final void method11121(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub13_10761
		  .method16993((byte) 54);
    }
}
