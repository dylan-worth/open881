/* Class671 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class671
{
    public static long method11044(CharSequence charsequence) {
	int i = charsequence.length();
	long l = 0L;
	for (int i_0_ = 0; i_0_ < i; i_0_++)
	    l = (l << 5) - l + (long) charsequence.charAt(i_0_);
	return l;
    }
    
    public static int method11045(CharSequence charsequence, int i) {
	return Class60.method1257(charsequence, i, true, -2090575278);
    }
    
    public static String method11046(Object[] objects, int i, int i_1_) {
	if (0 == i_1_)
	    return "";
	if (i_1_ == 1) {
	    CharSequence charsequence = (CharSequence) objects[i];
	    if (null == charsequence)
		return "null";
	    return charsequence.toString();
	}
	int i_2_ = i + i_1_;
	int i_3_ = 0;
	for (int i_4_ = i; i_4_ < i_2_; i_4_++) {
	    CharSequence charsequence = (CharSequence) objects[i_4_];
	    if (charsequence == null)
		i_3_ += 4;
	    else
		i_3_ += charsequence.length();
	}
	StringBuilder stringbuilder = new StringBuilder(i_3_);
	for (int i_5_ = i; i_5_ < i_2_; i_5_++) {
	    CharSequence charsequence = (CharSequence) objects[i_5_];
	    if (null == charsequence)
		stringbuilder.append("null");
	    else
		stringbuilder.append(charsequence);
	}
	return stringbuilder.toString();
    }
    
    public static String method11047(Object[] objects, int i, int i_6_) {
	if (0 == i_6_)
	    return "";
	if (i_6_ == 1) {
	    CharSequence charsequence = (CharSequence) objects[i];
	    if (null == charsequence)
		return "null";
	    return charsequence.toString();
	}
	int i_7_ = i + i_6_;
	int i_8_ = 0;
	for (int i_9_ = i; i_9_ < i_7_; i_9_++) {
	    CharSequence charsequence = (CharSequence) objects[i_9_];
	    if (charsequence == null)
		i_8_ += 4;
	    else
		i_8_ += charsequence.length();
	}
	StringBuilder stringbuilder = new StringBuilder(i_8_);
	for (int i_10_ = i; i_10_ < i_7_; i_10_++) {
	    CharSequence charsequence = (CharSequence) objects[i_10_];
	    if (null == charsequence)
		stringbuilder.append("null");
	    else
		stringbuilder.append(charsequence);
	}
	return stringbuilder.toString();
    }
    
    public static String method11048(Object[] objects, int i, int i_11_) {
	if (0 == i_11_)
	    return "";
	if (i_11_ == 1) {
	    CharSequence charsequence = (CharSequence) objects[i];
	    if (null == charsequence)
		return "null";
	    return charsequence.toString();
	}
	int i_12_ = i + i_11_;
	int i_13_ = 0;
	for (int i_14_ = i; i_14_ < i_12_; i_14_++) {
	    CharSequence charsequence = (CharSequence) objects[i_14_];
	    if (charsequence == null)
		i_13_ += 4;
	    else
		i_13_ += charsequence.length();
	}
	StringBuilder stringbuilder = new StringBuilder(i_13_);
	for (int i_15_ = i; i_15_ < i_12_; i_15_++) {
	    CharSequence charsequence = (CharSequence) objects[i_15_];
	    if (null == charsequence)
		stringbuilder.append("null");
	    else
		stringbuilder.append(charsequence);
	}
	return stringbuilder.toString();
    }
    
    public static boolean method11049(CharSequence charsequence) {
	return Class520.method8685(charsequence, 10, true, 146584510);
    }
    
    static boolean method11050(CharSequence charsequence, int i,
			       boolean bool) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_16_ = false;
	boolean bool_17_ = false;
	int i_18_ = 0;
	int i_19_ = charsequence.length();
	for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
	    int i_21_ = charsequence.charAt(i_20_);
	    if (0 == i_20_) {
		if (45 == i_21_) {
		    bool_16_ = true;
		    continue;
		}
		if (i_21_ == 43 && bool)
		    continue;
	    }
	    if (i_21_ >= 48 && i_21_ <= 57)
		i_21_ -= 48;
	    else if (i_21_ >= 65 && i_21_ <= 90)
		i_21_ -= 55;
	    else if (i_21_ >= 97 && i_21_ <= 122)
		i_21_ -= 87;
	    else
		return false;
	    if (i_21_ >= i)
		return false;
	    if (bool_16_)
		i_21_ = -i_21_;
	    int i_22_ = i_18_ * i + i_21_;
	    if (i_22_ / i != i_18_)
		return false;
	    i_18_ = i_22_;
	    bool_17_ = true;
	}
	return bool_17_;
    }
    
    static boolean method11051(CharSequence charsequence, int i,
			       boolean bool) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_23_ = false;
	boolean bool_24_ = false;
	int i_25_ = 0;
	int i_26_ = charsequence.length();
	for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
	    int i_28_ = charsequence.charAt(i_27_);
	    if (0 == i_27_) {
		if (45 == i_28_) {
		    bool_23_ = true;
		    continue;
		}
		if (i_28_ == 43 && bool)
		    continue;
	    }
	    if (i_28_ >= 48 && i_28_ <= 57)
		i_28_ -= 48;
	    else if (i_28_ >= 65 && i_28_ <= 90)
		i_28_ -= 55;
	    else if (i_28_ >= 97 && i_28_ <= 122)
		i_28_ -= 87;
	    else
		return false;
	    if (i_28_ >= i)
		return false;
	    if (bool_23_)
		i_28_ = -i_28_;
	    int i_29_ = i_25_ * i + i_28_;
	    if (i_29_ / i != i_25_)
		return false;
	    i_25_ = i_29_;
	    bool_24_ = true;
	}
	return bool_24_;
    }
    
    public static boolean method11052(char c) {
	return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
    
    public static int method11053(CharSequence charsequence) {
	return Class60.method1257(charsequence, 10, true, -2055615833);
    }
    
    public static String method11054(String string, char c,
				     String string_30_) {
	int i = string.length();
	int i_31_ = string_30_.length();
	int i_32_ = i;
	int i_33_ = i_31_ - 1;
	if (i_33_ != 0) {
	    int i_34_ = 0;
	    for (;;) {
		i_34_ = string.indexOf(c, i_34_);
		if (i_34_ < 0)
		    break;
		i_34_++;
		i_32_ += i_33_;
	    }
	}
	StringBuilder stringbuilder = new StringBuilder(i_32_);
	int i_35_ = 0;
	for (;;) {
	    int i_36_ = string.indexOf(c, i_35_);
	    if (i_36_ < 0)
		break;
	    stringbuilder.append(string.substring(i_35_, i_36_));
	    stringbuilder.append(string_30_);
	    i_35_ = i_36_ + 1;
	}
	stringbuilder.append(string.substring(i_35_));
	return stringbuilder.toString();
    }
    
    public static int method11055(CharSequence charsequence, int i) {
	return Class60.method1257(charsequence, i, true, -2069737960);
    }
    
    static int method11056(CharSequence charsequence, int i, boolean bool) {
	if (i < 2 || i > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i).toString());
	boolean bool_37_ = false;
	boolean bool_38_ = false;
	int i_39_ = 0;
	int i_40_ = charsequence.length();
	for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
	    int i_42_ = charsequence.charAt(i_41_);
	    if (0 == i_41_) {
		if (45 == i_42_) {
		    bool_37_ = true;
		    continue;
		}
		if (43 == i_42_ && bool)
		    continue;
	    }
	    if (i_42_ >= 48 && i_42_ <= 57)
		i_42_ -= 48;
	    else if (i_42_ >= 65 && i_42_ <= 90)
		i_42_ -= 55;
	    else if (i_42_ >= 97 && i_42_ <= 122)
		i_42_ -= 87;
	    else
		throw new NumberFormatException();
	    if (i_42_ >= i)
		throw new NumberFormatException();
	    if (bool_37_)
		i_42_ = -i_42_;
	    int i_43_ = i_42_ + i * i_39_;
	    if (i_39_ != i_43_ / i)
		throw new NumberFormatException();
	    i_39_ = i_43_;
	    bool_38_ = true;
	}
	if (!bool_38_)
	    throw new NumberFormatException();
	return i_39_;
    }
    
    public static String method11057(int i, boolean bool) {
	if (!bool || i < 0)
	    return Integer.toString(i);
	return Class272.method5068(i, 10, bool, 1743924184);
    }
    
    static String method11058(int i, int i_44_, boolean bool) {
	if (i_44_ < 2 || i_44_ > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i_44_).toString());
	if (!bool || i < 0)
	    return Integer.toString(i, i_44_);
	int i_45_ = 2;
	int i_46_ = i / i_44_;
	while (0 != i_46_) {
	    i_46_ /= i_44_;
	    i_45_++;
	}
	char[] cs = new char[i_45_];
	cs[0] = '+';
	for (int i_47_ = i_45_ - 1; i_47_ > 0; i_47_--) {
	    int i_48_ = i;
	    i /= i_44_;
	    int i_49_ = i_48_ - i * i_44_;
	    if (i_49_ >= 10)
		cs[i_47_] = (char) (87 + i_49_);
	    else
		cs[i_47_] = (char) (i_49_ + 48);
	}
	return new String(cs);
    }
    
    static String method11059(int i, int i_50_, boolean bool) {
	if (i_50_ < 2 || i_50_ > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i_50_).toString());
	if (!bool || i < 0)
	    return Integer.toString(i, i_50_);
	int i_51_ = 2;
	int i_52_ = i / i_50_;
	while (0 != i_52_) {
	    i_52_ /= i_50_;
	    i_51_++;
	}
	char[] cs = new char[i_51_];
	cs[0] = '+';
	for (int i_53_ = i_51_ - 1; i_53_ > 0; i_53_--) {
	    int i_54_ = i;
	    i /= i_50_;
	    int i_55_ = i_54_ - i * i_50_;
	    if (i_55_ >= 10)
		cs[i_53_] = (char) (87 + i_55_);
	    else
		cs[i_53_] = (char) (i_55_ + 48);
	}
	return new String(cs);
    }
    
    static String method11060(int i, int i_56_, boolean bool) {
	if (i_56_ < 2 || i_56_ > 36)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (i_56_).toString());
	if (!bool || i < 0)
	    return Integer.toString(i, i_56_);
	int i_57_ = 2;
	int i_58_ = i / i_56_;
	while (0 != i_58_) {
	    i_58_ /= i_56_;
	    i_57_++;
	}
	char[] cs = new char[i_57_];
	cs[0] = '+';
	for (int i_59_ = i_57_ - 1; i_59_ > 0; i_59_--) {
	    int i_60_ = i;
	    i /= i_56_;
	    int i_61_ = i_60_ - i * i_56_;
	    if (i_61_ >= 10)
		cs[i_59_] = (char) (87 + i_61_);
	    else
		cs[i_59_] = (char) (i_61_ + 48);
	}
	return new String(cs);
    }
    
    public static int method11061(CharSequence charsequence) {
	int i = charsequence.length();
	int i_62_ = 0;
	for (int i_63_ = 0; i_63_ < i; i_63_++)
	    i_62_ = ((i_62_ << 5) - i_62_
		     + Class542.method8950(charsequence.charAt(i_63_),
					   -1504433483));
	return i_62_;
    }
    
    public static int method11062(CharSequence charsequence) {
	int i = charsequence.length();
	int i_64_ = 0;
	for (int i_65_ = 0; i_65_ < i; i_65_++)
	    i_64_ = (i_64_ << 5) - i_64_ + charsequence.charAt(i_65_);
	return i_64_;
    }
    
    public static long method11063(CharSequence charsequence) {
	int i = charsequence.length();
	long l = 0L;
	for (int i_66_ = 0; i_66_ < i; i_66_++)
	    l = (l << 5) - l + (long) charsequence.charAt(i_66_);
	return l;
    }
    
    public static String method11064(String string, char c,
				     String string_67_) {
	int i = string.length();
	int i_68_ = string_67_.length();
	int i_69_ = i;
	int i_70_ = i_68_ - 1;
	if (i_70_ != 0) {
	    int i_71_ = 0;
	    for (;;) {
		i_71_ = string.indexOf(c, i_71_);
		if (i_71_ < 0)
		    break;
		i_71_++;
		i_69_ += i_70_;
	    }
	}
	StringBuilder stringbuilder = new StringBuilder(i_69_);
	int i_72_ = 0;
	for (;;) {
	    int i_73_ = string.indexOf(c, i_72_);
	    if (i_73_ < 0)
		break;
	    stringbuilder.append(string.substring(i_72_, i_73_));
	    stringbuilder.append(string_67_);
	    i_72_ = i_73_ + 1;
	}
	stringbuilder.append(string.substring(i_72_));
	return stringbuilder.toString();
    }
    
    Class671() throws Throwable {
	throw new Error();
    }
    
    public static int method11065(CharSequence charsequence,
				  CharSequence charsequence_74_) {
	int i = charsequence.length();
	int i_75_ = charsequence_74_.length();
	if (0 == i)
	    return i_75_;
	if (0 == i_75_)
	    return i;
	int[] is = new int[i + 1];
	int[] is_76_ = new int[i + 1];
	for (int i_77_ = 0; i_77_ <= i; i_77_++)
	    is[i_77_] = i_77_;
	for (int i_78_ = 1; i_78_ <= i_75_; i_78_++) {
	    is_76_[0] = i_78_;
	    char c = charsequence_74_.charAt(i_78_ - 1);
	    for (int i_79_ = 1; i_79_ <= i; i_79_++)
		is_76_[i_79_]
		    = Math.min(Math.min(1 + is_76_[i_79_ - 1], 1 + is[i_79_]),
			       (is[i_79_ - 1]
				+ (charsequence.charAt(i_79_ - 1) == c ? 0
				   : 1)));
	    int[] is_80_ = is;
	    is = is_76_;
	    is_76_ = is_80_;
	}
	return is[i];
    }
    
    public static String method11066(Object[] objects, int i, int i_81_) {
	if (0 == i_81_)
	    return "";
	if (i_81_ == 1) {
	    CharSequence charsequence = (CharSequence) objects[i];
	    if (null == charsequence)
		return "null";
	    return charsequence.toString();
	}
	int i_82_ = i + i_81_;
	int i_83_ = 0;
	for (int i_84_ = i; i_84_ < i_82_; i_84_++) {
	    CharSequence charsequence = (CharSequence) objects[i_84_];
	    if (charsequence == null)
		i_83_ += 4;
	    else
		i_83_ += charsequence.length();
	}
	StringBuilder stringbuilder = new StringBuilder(i_83_);
	for (int i_85_ = i; i_85_ < i_82_; i_85_++) {
	    CharSequence charsequence = (CharSequence) objects[i_85_];
	    if (null == charsequence)
		stringbuilder.append("null");
	    else
		stringbuilder.append(charsequence);
	}
	return stringbuilder.toString();
    }
    
    public static long method11067(CharSequence charsequence) {
	int i = charsequence.length();
	long l = 0L;
	for (int i_86_ = 0; i_86_ < i; i_86_++)
	    l = (l << 5) - l + (long) charsequence.charAt(i_86_);
	return l;
    }
    
    public static boolean method11068(char c) {
	return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
    
    public static int method11069(CharSequence charsequence,
				  CharSequence charsequence_87_) {
	int i = charsequence.length();
	int i_88_ = charsequence_87_.length();
	if (0 == i)
	    return i_88_;
	if (0 == i_88_)
	    return i;
	int[] is = new int[i + 1];
	int[] is_89_ = new int[i + 1];
	for (int i_90_ = 0; i_90_ <= i; i_90_++)
	    is[i_90_] = i_90_;
	for (int i_91_ = 1; i_91_ <= i_88_; i_91_++) {
	    is_89_[0] = i_91_;
	    char c = charsequence_87_.charAt(i_91_ - 1);
	    for (int i_92_ = 1; i_92_ <= i; i_92_++)
		is_89_[i_92_]
		    = Math.min(Math.min(1 + is_89_[i_92_ - 1], 1 + is[i_92_]),
			       (is[i_92_ - 1]
				+ (charsequence.charAt(i_92_ - 1) == c ? 0
				   : 1)));
	    int[] is_93_ = is;
	    is = is_89_;
	    is_89_ = is_93_;
	}
	return is[i];
    }
    
    public static String method11070(String string, char c,
				     String string_94_) {
	int i = string.length();
	int i_95_ = string_94_.length();
	int i_96_ = i;
	int i_97_ = i_95_ - 1;
	if (i_97_ != 0) {
	    int i_98_ = 0;
	    for (;;) {
		i_98_ = string.indexOf(c, i_98_);
		if (i_98_ < 0)
		    break;
		i_98_++;
		i_96_ += i_97_;
	    }
	}
	StringBuilder stringbuilder = new StringBuilder(i_96_);
	int i_99_ = 0;
	for (;;) {
	    int i_100_ = string.indexOf(c, i_99_);
	    if (i_100_ < 0)
		break;
	    stringbuilder.append(string.substring(i_99_, i_100_));
	    stringbuilder.append(string_94_);
	    i_99_ = i_100_ + 1;
	}
	stringbuilder.append(string.substring(i_99_));
	return stringbuilder.toString();
    }
    
    public static boolean method11071(char c) {
	return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z'
		|| c >= 'a' && c <= 'z');
    }
    
    public static String method11072(String string, char c,
				     String string_101_) {
	int i = string.length();
	int i_102_ = string_101_.length();
	int i_103_ = i;
	int i_104_ = i_102_ - 1;
	if (i_104_ != 0) {
	    int i_105_ = 0;
	    for (;;) {
		i_105_ = string.indexOf(c, i_105_);
		if (i_105_ < 0)
		    break;
		i_105_++;
		i_103_ += i_104_;
	    }
	}
	StringBuilder stringbuilder = new StringBuilder(i_103_);
	int i_106_ = 0;
	for (;;) {
	    int i_107_ = string.indexOf(c, i_106_);
	    if (i_107_ < 0)
		break;
	    stringbuilder.append(string.substring(i_106_, i_107_));
	    stringbuilder.append(string_101_);
	    i_106_ = i_107_ + 1;
	}
	stringbuilder.append(string.substring(i_106_));
	return stringbuilder.toString();
    }
    
    public static boolean method11073(char c) {
	if (c >= ' ' && c <= '~')
	    return true;
	if (c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c == '\u20ac' || c == '\u0152' || '\u2014' == c || '\u0153' == c
	    || c == '\u0178')
	    return true;
	return false;
    }
    
    public static String[] method11074(String string, char c) {
	int i = Class399.method6581(string, c, 1760284098);
	String[] strings = new String[1 + i];
	int i_108_ = 0;
	int i_109_ = 0;
	for (int i_110_ = 0; i_110_ < i; i_110_++) {
	    int i_111_;
	    for (i_111_ = i_109_; string.charAt(i_111_) != c; i_111_++) {
		/* empty */
	    }
	    strings[i_108_++] = string.substring(i_109_, i_111_);
	    i_109_ = 1 + i_111_;
	}
	strings[i] = string.substring(i_109_);
	return strings;
    }
    
    public static int method11075(CharSequence charsequence) {
	return Class60.method1257(charsequence, 10, true, -2143776041);
    }
}
