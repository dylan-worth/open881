/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Point;

public class Class16
{
    static String[] aStringArray185 = new String[100];
    byte[][] aByteArrayArray186;
    public int anInt187;
    public Interface2 anInterface2_188;
    public int anInt189;
    public int anInt190;
    byte[] aByteArray191;
    
    public int method725(int i) {
	return aByteArray191[i] & 0xff;
    }
    
    public int method726(int i, int i_0_) {
	return aByteArray191[i] & 0xff;
    }
    
    int method727(String string, int[] is, String[] strings,
		  Interface3[] interface3s, boolean bool) {
	if (null == string)
	    return 0;
	int i = 0;
	int i_1_ = 0;
	int i_2_ = -1;
	int i_3_ = 0;
	int i_4_ = 0;
	int i_5_ = -1;
	int i_6_ = -1;
	int i_7_ = 0;
	int i_8_ = string.length();
	for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
	    int i_10_
		= Class542.method8950(string.charAt(i_9_), 1995625977) & 0xff;
	    int i_11_ = 0;
	    if (60 == i_10_)
		i_5_ = i_9_;
	    else {
		int i_12_;
		if (i_5_ != -1) {
		    if (i_10_ != 62)
			continue;
		    i_12_ = i_5_;
		    String string_13_ = string.substring(1 + i_5_, i_9_);
		    i_5_ = -1;
		    if (string_13_.equals("br")) {
			strings[i_7_] = string.substring(i_1_, 1 + i_9_);
			if (++i_7_ >= strings.length)
			    return 0;
			i_1_ = 1 + i_9_;
			i = 0;
			i_2_ = -1;
			i_6_ = -1;
			continue;
		    }
		    if (string_13_.equals("lt")) {
			i_11_ += method726(60, -579095097);
			if (aByteArrayArray186 != null && -1 != i_6_)
			    i_11_ += aByteArrayArray186[i_6_][60];
			i_6_ = 60;
		    } else if (string_13_.equals("gt")) {
			i_11_ += method726(62, -222391758);
			if (aByteArrayArray186 != null && -1 != i_6_)
			    i_11_ += aByteArrayArray186[i_6_][62];
			i_6_ = 62;
		    } else if (string_13_.equals("nbsp")) {
			i_11_ += method726(160, -126219111);
			if (aByteArrayArray186 != null && i_6_ != -1)
			    i_11_ += aByteArrayArray186[i_6_][160];
			i_6_ = 160;
		    } else if (string_13_.equals("shy")) {
			i_11_ += method726(173, -1281965109);
			if (aByteArrayArray186 != null && i_6_ != -1)
			    i_11_ += aByteArrayArray186[i_6_][173];
			i_6_ = 173;
		    } else if (string_13_.equals("times")) {
			i_11_ += method726(215, 274082668);
			if (aByteArrayArray186 != null && -1 != i_6_)
			    i_11_ += aByteArrayArray186[i_6_][215];
			i_6_ = 215;
		    } else if (string_13_.equals("euro")) {
			i_11_ += method726(128, -598777567);
			if (aByteArrayArray186 != null && -1 != i_6_)
			    i_11_ += aByteArrayArray186[i_6_][128];
			i_6_ = 128;
		    } else if (string_13_.equals("copy")) {
			i_11_ += method726(169, 410539239);
			if (aByteArrayArray186 != null && -1 != i_6_)
			    i_11_ += aByteArrayArray186[i_6_][169];
			i_6_ = 169;
		    } else if (string_13_.equals("reg")) {
			i_11_ += method726(174, -1550419572);
			if (null != aByteArrayArray186 && i_6_ != -1)
			    i_11_ += aByteArrayArray186[i_6_][174];
			i_6_ = 174;
		    } else if (string_13_.startsWith("img=")
			       && interface3s != null) {
			try {
			    int i_14_
				= Class684.method13949(string_13_.substring(4),
						       (byte) 52);
			    i_11_ += interface3s[i_14_].method22();
			    i_6_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    } else if (string_13_.startsWith("sprite=")
			       && null != anInterface2_188) {
			try {
			    int i_15_ = -1;
			    int i_16_ = string_13_.indexOf(',');
			    if (i_16_ == -1)
				i_15_ = Class684.method13949(string_13_
								 .substring(7),
							     (byte) 92);
			    else
				i_15_ = (Class684.method13949
					 (string_13_.substring(7, i_16_),
					  (byte) 20));
			    i_11_ += anInterface2_188.method15(i_15_,
							       -202387635);
			    i_6_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
			continue;
		    }
		    i_10_ = -1;
		} else {
		    i_12_ = i_9_;
		    i_11_ += method726(i_10_, -206665563);
		    if (null != aByteArrayArray186 && i_6_ != -1)
			i_11_ += aByteArrayArray186[i_6_][i_10_];
		    i_6_ = i_10_;
		}
		if (i_11_ > 0) {
		    i += i_11_;
		    if (null != is) {
			if (i_10_ == 32) {
			    i_2_ = i_9_;
			    i_3_ = i;
			    i_4_ = bool ? 1 : 0;
			}
			if (i > is[i_7_ < is.length ? i_7_ : is.length - 1]) {
			    if (i_2_ >= 0) {
				strings[i_7_]
				    = string.substring(i_1_, i_2_ + 1 - i_4_);
				if (++i_7_ >= strings.length)
				    return 0;
				i_1_ = 1 + i_2_;
				i_2_ = -1;
				i -= i_3_;
				i_6_ = -1;
			    } else {
				strings[i_7_] = string.substring(i_1_, i_12_);
				if (++i_7_ >= strings.length)
				    return 0;
				i_1_ = i_12_;
				i_2_ = -1;
				i = i_11_;
				i_6_ = -1;
			    }
			}
			if (45 == i_10_) {
			    i_2_ = i_9_;
			    i_3_ = i;
			    i_4_ = 0;
			}
		    }
		}
	    }
	}
	if (string.length() > i_1_) {
	    strings[i_7_] = string.substring(i_1_, string.length());
	    i_7_++;
	}
	return i_7_;
    }
    
    public int method728(String string, int i) {
	return method748(string, null, (byte) 24);
    }
    
    public static Class16 method729(Class472 class472, int i,
				    Interface2 interface2) {
	byte[] is = class472.method7738(i, (byte) -4);
	if (is == null)
	    return null;
	return new Class16(is, interface2);
    }
    
    public String method730(String string, int i, Interface3[] interface3s,
			    byte i_17_) {
	if (method748(string, interface3s, (byte) -18) <= i)
	    return string;
	i -= method748("...", null, (byte) 7);
	int i_18_ = -1;
	int i_19_ = -1;
	int i_20_ = 0;
	int i_21_ = string.length();
	String string_22_ = "";
	for (int i_23_ = 0; i_23_ < i_21_; i_23_++) {
	    char c = string.charAt(i_23_);
	    if (60 == c)
		i_18_ = i_23_;
	    else {
		if (62 == c && i_18_ != -1) {
		    String string_24_ = string.substring(i_18_ + 1, i_23_);
		    i_18_ = -1;
		    if (string_24_.equals("lt"))
			c = '<';
		    else if (string_24_.equals("gt"))
			c = '>';
		    else if (string_24_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_24_.equals("shy"))
			c = '\u00ad';
		    else if (string_24_.equals("times"))
			c = '\u00d7';
		    else if (string_24_.equals("euro"))
			c = '\u0080';
		    else if (string_24_.equals("copy"))
			c = '\u00a9';
		    else if (string_24_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_24_.startsWith("img=")
			    && interface3s != null) {
			    try {
				int i_25_
				    = Class684.method13949(string_24_
							       .substring(4),
							   (byte) 37);
				i_20_ += interface3s[i_25_].method22();
				i_19_ = -1;
				if (i_20_ > i)
				    return new StringBuilder().append
					       (string_22_).append
					       ("...").toString();
				string_22_ = string.substring(0, i_23_ + 1);
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_24_.startsWith("sprite=")
				   && anInterface2_188 != null) {
			    try {
				int i_26_ = -1;
				int i_27_ = string_24_.indexOf(',');
				if (-1 == i_27_)
				    i_26_ = (Class684.method13949
					     (string_24_.substring(7),
					      (byte) 98));
				else
				    i_26_ = (Class684.method13949
					     (string_24_.substring(7, i_27_),
					      (byte) 68));
				i_20_ += anInterface2_188.method15(i_26_,
								   1576346715);
				i_19_ = -1;
				if (i_20_ > i)
				    return new StringBuilder().append
					       (string_22_).append
					       ("...").toString();
				string_22_ = string.substring(0, i_23_ + 1);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (-1 == i_18_) {
		    i_20_ += aByteArray191[(Class542.method8950(c, -1413593799)
					    & 0xff)] & 0xff;
		    if (aByteArrayArray186 != null && i_19_ != -1)
			i_20_ += aByteArrayArray186[i_19_][c];
		    i_19_ = c;
		    int i_28_ = i_20_;
		    if (aByteArrayArray186 != null)
			i_28_ += aByteArrayArray186[c][46];
		    if (i_28_ > i)
			return new StringBuilder().append(string_22_).append
				   ("...").toString();
		    string_22_ = string.substring(0, 1 + i_23_);
		}
	    }
	}
	return string;
    }
    
    public int method731(String string, int[] is, String[] strings,
			 Interface3[] interface3s, int i) {
	return method732(string, is, strings, interface3s, true, 207056280);
    }
    
    int method732(String string, int[] is, String[] strings,
		  Interface3[] interface3s, boolean bool, int i) {
	if (null == string)
	    return 0;
	int i_29_ = 0;
	int i_30_ = 0;
	int i_31_ = -1;
	int i_32_ = 0;
	int i_33_ = 0;
	int i_34_ = -1;
	int i_35_ = -1;
	int i_36_ = 0;
	int i_37_ = string.length();
	for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
	    int i_39_ = (Class542.method8950(string.charAt(i_38_), -1127373893)
			 & 0xff);
	    int i_40_ = 0;
	    if (60 == i_39_)
		i_34_ = i_38_;
	    else {
		int i_41_;
		if (i_34_ != -1) {
		    if (i_39_ != 62)
			continue;
		    i_41_ = i_34_;
		    String string_42_ = string.substring(1 + i_34_, i_38_);
		    i_34_ = -1;
		    if (string_42_.equals("br")) {
			strings[i_36_] = string.substring(i_30_, 1 + i_38_);
			if (++i_36_ >= strings.length)
			    return 0;
			i_30_ = 1 + i_38_;
			i_29_ = 0;
			i_31_ = -1;
			i_35_ = -1;
			continue;
		    }
		    if (string_42_.equals("lt")) {
			i_40_ += method726(60, 332629146);
			if (aByteArrayArray186 != null && -1 != i_35_)
			    i_40_ += aByteArrayArray186[i_35_][60];
			i_35_ = 60;
		    } else if (string_42_.equals("gt")) {
			i_40_ += method726(62, -1074629464);
			if (aByteArrayArray186 != null && -1 != i_35_)
			    i_40_ += aByteArrayArray186[i_35_][62];
			i_35_ = 62;
		    } else if (string_42_.equals("nbsp")) {
			i_40_ += method726(160, 382084730);
			if (aByteArrayArray186 != null && i_35_ != -1)
			    i_40_ += aByteArrayArray186[i_35_][160];
			i_35_ = 160;
		    } else if (string_42_.equals("shy")) {
			i_40_ += method726(173, -857577394);
			if (aByteArrayArray186 != null && i_35_ != -1)
			    i_40_ += aByteArrayArray186[i_35_][173];
			i_35_ = 173;
		    } else if (string_42_.equals("times")) {
			i_40_ += method726(215, -900008901);
			if (aByteArrayArray186 != null && -1 != i_35_)
			    i_40_ += aByteArrayArray186[i_35_][215];
			i_35_ = 215;
		    } else if (string_42_.equals("euro")) {
			i_40_ += method726(128, 265891203);
			if (aByteArrayArray186 != null && -1 != i_35_)
			    i_40_ += aByteArrayArray186[i_35_][128];
			i_35_ = 128;
		    } else if (string_42_.equals("copy")) {
			i_40_ += method726(169, -773009245);
			if (aByteArrayArray186 != null && -1 != i_35_)
			    i_40_ += aByteArrayArray186[i_35_][169];
			i_35_ = 169;
		    } else if (string_42_.equals("reg")) {
			i_40_ += method726(174, -969585254);
			if (null != aByteArrayArray186 && i_35_ != -1)
			    i_40_ += aByteArrayArray186[i_35_][174];
			i_35_ = 174;
		    } else if (string_42_.startsWith("img=")
			       && interface3s != null) {
			try {
			    int i_43_
				= Class684.method13949(string_42_.substring(4),
						       (byte) 96);
			    i_40_ += interface3s[i_43_].method22();
			    i_35_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    } else if (string_42_.startsWith("sprite=")
			       && null != anInterface2_188) {
			try {
			    int i_44_ = -1;
			    int i_45_ = string_42_.indexOf(',');
			    if (i_45_ == -1)
				i_44_ = Class684.method13949(string_42_
								 .substring(7),
							     (byte) 24);
			    else
				i_44_ = (Class684.method13949
					 (string_42_.substring(7, i_45_),
					  (byte) 125));
			    i_40_ += anInterface2_188.method15(i_44_,
							       -424452803);
			    i_35_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
			continue;
		    }
		    i_39_ = -1;
		} else {
		    i_41_ = i_38_;
		    i_40_ += method726(i_39_, -1159516614);
		    if (null != aByteArrayArray186 && i_35_ != -1)
			i_40_ += aByteArrayArray186[i_35_][i_39_];
		    i_35_ = i_39_;
		}
		if (i_40_ > 0) {
		    i_29_ += i_40_;
		    if (null != is) {
			if (i_39_ == 32) {
			    i_31_ = i_38_;
			    i_32_ = i_29_;
			    i_33_ = bool ? 1 : 0;
			}
			if (i_29_
			    > is[i_36_ < is.length ? i_36_ : is.length - 1]) {
			    if (i_31_ >= 0) {
				strings[i_36_]
				    = string.substring(i_30_,
						       i_31_ + 1 - i_33_);
				if (++i_36_ >= strings.length)
				    return 0;
				i_30_ = 1 + i_31_;
				i_31_ = -1;
				i_29_ -= i_32_;
				i_35_ = -1;
			    } else {
				strings[i_36_]
				    = string.substring(i_30_, i_41_);
				if (++i_36_ >= strings.length)
				    return 0;
				i_30_ = i_41_;
				i_31_ = -1;
				i_29_ = i_40_;
				i_35_ = -1;
			    }
			}
			if (45 == i_39_) {
			    i_31_ = i_38_;
			    i_32_ = i_29_;
			    i_33_ = 0;
			}
		    }
		}
	    }
	}
	if (string.length() > i_30_) {
	    strings[i_36_] = string.substring(i_30_, string.length());
	    i_36_++;
	}
	return i_36_;
    }
    
    public int method733(String string, int i, Interface3[] interface3s,
			 byte i_46_) {
	return method731(string, new int[] { i }, aStringArray185, interface3s,
			 -1225671498);
    }
    
    public String method734(String string, int i, Interface3[] interface3s,
			    int i_47_, int i_48_) {
	int i_49_ = method731(string, new int[] { i }, aStringArray185,
			      interface3s, 444486913);
	if (i_47_ >= 0 && i_47_ < i_49_)
	    return aStringArray185[i_47_];
	return null;
    }
    
    public int method735(String string, int i, int i_50_, int i_51_, int i_52_,
			 Interface3[] interface3s) {
	if (0 == i_50_)
	    i_50_ = -1062735011 * anInt187;
	int i_53_ = method732(string, new int[] { i }, aStringArray185,
			      interface3s, false, 1129738701);
	if (i_53_ == 0)
	    return 0;
	if (i_52_ < 0)
	    i_52_ = 0;
	i_52_ /= i_50_;
	if (i_52_ >= i_53_)
	    i_52_ = i_53_ - 1;
	String string_54_ = aStringArray185[i_52_];
	int i_55_ = 0;
	int i_56_ = 0;
	int i_57_;
	for (i_57_ = 0; i_57_ < i_51_ && i_55_ < string_54_.length();
	     i_57_ = method748(string_54_.substring(0, ++i_55_), interface3s,
			       (byte) 39))
	    i_56_ = i_57_;
	if (i_55_ == string_54_.length() && string_54_.endsWith("<br>"))
	    i_55_ -= 4;
	if (i_51_ - i_56_ < i_57_ - i_51_)
	    i_55_--;
	for (int i_58_ = 0; i_58_ < i_52_; i_58_++)
	    i_55_ += aStringArray185[i_58_].length();
	return i_55_;
    }
    
    public Point method736(String string, int i, int i_59_, int i_60_,
			   Interface3[] interface3s, int i_61_) {
	if (i_60_ <= 0)
	    return new Point(0, i_59_ + 102396103 * anInt190);
	if (i_60_ > string.length())
	    i_60_ = string.length();
	if (i_59_ == 0)
	    i_59_ = anInt187 * -1062735011;
	int i_62_ = method732(string, new int[] { i }, aStringArray185,
			      interface3s, false, -1608630238);
	int i_63_ = 0;
	for (int i_64_ = 0; i_64_ < i_62_; i_64_++) {
	    int i_65_ = aStringArray185[i_64_].length();
	    if (i_63_ + i_65_ > i_60_
		|| i_64_ == i_62_ - 1 && i_60_ == string.length()) {
		String string_66_ = string.substring(i_63_, i_60_);
		if (string_66_.endsWith("<br>")) {
		    string_66_ = "";
		    i_63_ += i_65_;
		    i_64_++;
		}
		int i_67_ = method748(string_66_, interface3s, (byte) 22);
		int i_68_ = anInt190 * 102396103 + i_64_ * i_59_;
		return new Point(i_67_, i_68_);
	    }
	    i_63_ += i_65_;
	}
	return null;
    }
    
    public int method737(String string, int i, int i_69_,
			 Interface3[] interface3s, int i_70_) {
	if (i_69_ == 0)
	    i_69_ = anInt187 * -1062735011;
	int i_71_ = method731(string, new int[] { i }, aStringArray185,
			      interface3s, 1283975665);
	int i_72_ = i_69_ * (i_71_ - 1);
	return i_72_ + 102396103 * anInt190 + anInt189 * 728893755;
    }
    
    public int method738(int i) {
	return aByteArray191[i] & 0xff;
    }
    
    public static Class16 method739(Class472 class472, int i, int i_73_) {
	return Class288.method5276(class472, i, i_73_, null, -620396210);
    }
    
    public static Class16 method740(Class472 class472, int i, int i_74_) {
	return Class288.method5276(class472, i, i_74_, null, 203563241);
    }
    
    public static Class16 method741(Class472 class472, int i, int i_75_,
				    Interface2 interface2) {
	byte[] is = class472.method7743(i, i_75_, -1042471602);
	if (is == null)
	    return null;
	return new Class16(is, interface2);
    }
    
    public static Class16 method742(Class472 class472, int i, int i_76_,
				    Interface2 interface2) {
	byte[] is = class472.method7743(i, i_76_, -1074001366);
	if (is == null)
	    return null;
	return new Class16(is, interface2);
    }
    
    public static Class16 method743(Class472 class472, int i, int i_77_,
				    Interface2 interface2) {
	byte[] is = class472.method7743(i, i_77_, -1117065205);
	if (is == null)
	    return null;
	return new Class16(is, interface2);
    }
    
    public static Class16 method744(Class472 class472, int i,
				    Interface2 interface2) {
	byte[] is = class472.method7738(i, (byte) -70);
	if (is == null)
	    return null;
	return new Class16(is, interface2);
    }
    
    public static Class16 method745(Class472 class472, int i,
				    Interface2 interface2) {
	byte[] is = class472.method7738(i, (byte) -57);
	if (is == null)
	    return null;
	return new Class16(is, interface2);
    }
    
    public int method746(int i, char c) {
	if (aByteArrayArray186 != null)
	    return aByteArrayArray186[i][c];
	return 0;
    }
    
    public int method747(String string, int i, Interface3[] interface3s,
			 int i_78_) {
	int i_79_ = method731(string, new int[] { i }, aStringArray185,
			      interface3s, 683301756);
	int i_80_ = 0;
	for (int i_81_ = 0; i_81_ < i_79_; i_81_++) {
	    int i_82_
		= method748(aStringArray185[i_81_], interface3s, (byte) 8);
	    if (i_82_ > i_80_)
		i_80_ = i_82_;
	}
	return i_80_;
    }
    
    public int method748(String string, Interface3[] interface3s, byte i) {
	if (string == null)
	    return 0;
	int i_83_ = -1;
	int i_84_ = -1;
	int i_85_ = 0;
	int i_86_ = string.length();
	for (int i_87_ = 0; i_87_ < i_86_; i_87_++) {
	    char c = string.charAt(i_87_);
	    if (c == 60)
		i_83_ = i_87_;
	    else {
		if (62 == c && i_83_ != -1) {
		    String string_88_ = string.substring(1 + i_83_, i_87_);
		    i_83_ = -1;
		    if (string_88_.equals("lt"))
			c = '<';
		    else if (string_88_.equals("gt"))
			c = '>';
		    else if (string_88_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_88_.equals("shy"))
			c = '\u00ad';
		    else if (string_88_.equals("times"))
			c = '\u00d7';
		    else if (string_88_.equals("euro"))
			c = '\u0080';
		    else if (string_88_.equals("copy"))
			c = '\u00a9';
		    else if (string_88_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_88_.startsWith("img=")
			    && null != interface3s) {
			    try {
				int i_89_
				    = Class684.method13949(string_88_
							       .substring(4),
							   (byte) 32);
				i_85_ += interface3s[i_89_].method22();
				i_84_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_88_.startsWith("sprite=")
				   && anInterface2_188 != null) {
			    try {
				int i_90_ = -1;
				int i_91_ = string_88_.indexOf(',');
				if (-1 == i_91_)
				    i_90_ = (Class684.method13949
					     (string_88_.substring(7),
					      (byte) 18));
				else
				    i_90_ = (Class684.method13949
					     (string_88_.substring(7, i_91_),
					      (byte) 67));
				i_85_
				    += anInterface2_188.method15(i_90_,
								 -1016435167);
				i_84_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i_83_ == -1) {
		    i_85_ += aByteArray191[(Class542.method8950(c, 1117675733)
					    & 0xff)] & 0xff;
		    if (null != aByteArrayArray186 && -1 != i_84_)
			i_85_ += aByteArrayArray186[i_84_][c];
		    i_84_ = c;
		}
	    }
	}
	return i_85_;
    }
    
    public String method749(String string, int i, Interface3[] interface3s) {
	if (method748(string, interface3s, (byte) -102) <= i)
	    return string;
	i -= method748("...", null, (byte) 27);
	int i_92_ = -1;
	int i_93_ = -1;
	int i_94_ = 0;
	int i_95_ = string.length();
	String string_96_ = "";
	for (int i_97_ = 0; i_97_ < i_95_; i_97_++) {
	    char c = string.charAt(i_97_);
	    if (60 == c)
		i_92_ = i_97_;
	    else {
		if (62 == c && i_92_ != -1) {
		    String string_98_ = string.substring(i_92_ + 1, i_97_);
		    i_92_ = -1;
		    if (string_98_.equals("lt"))
			c = '<';
		    else if (string_98_.equals("gt"))
			c = '>';
		    else if (string_98_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_98_.equals("shy"))
			c = '\u00ad';
		    else if (string_98_.equals("times"))
			c = '\u00d7';
		    else if (string_98_.equals("euro"))
			c = '\u0080';
		    else if (string_98_.equals("copy"))
			c = '\u00a9';
		    else if (string_98_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_98_.startsWith("img=")
			    && interface3s != null) {
			    try {
				int i_99_
				    = Class684.method13949(string_98_
							       .substring(4),
							   (byte) 31);
				i_94_ += interface3s[i_99_].method22();
				i_93_ = -1;
				if (i_94_ > i)
				    return new StringBuilder().append
					       (string_96_).append
					       ("...").toString();
				string_96_ = string.substring(0, i_97_ + 1);
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_98_.startsWith("sprite=")
				   && anInterface2_188 != null) {
			    try {
				int i_100_ = -1;
				int i_101_ = string_98_.indexOf(',');
				if (-1 == i_101_)
				    i_100_ = (Class684.method13949
					      (string_98_.substring(7),
					       (byte) 47));
				else
				    i_100_ = (Class684.method13949
					      (string_98_.substring(7, i_101_),
					       (byte) 15));
				i_94_ += anInterface2_188.method15(i_100_,
								   1886131817);
				i_93_ = -1;
				if (i_94_ > i)
				    return new StringBuilder().append
					       (string_96_).append
					       ("...").toString();
				string_96_ = string.substring(0, i_97_ + 1);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (-1 == i_92_) {
		    i_94_ += aByteArray191[(Class542.method8950(c, 1318015252)
					    & 0xff)] & 0xff;
		    if (aByteArrayArray186 != null && i_93_ != -1)
			i_94_ += aByteArrayArray186[i_93_][c];
		    i_93_ = c;
		    int i_102_ = i_94_;
		    if (aByteArrayArray186 != null)
			i_102_ += aByteArrayArray186[c][46];
		    if (i_102_ > i)
			return new StringBuilder().append(string_96_).append
				   ("...").toString();
		    string_96_ = string.substring(0, 1 + i_97_);
		}
	    }
	}
	return string;
    }
    
    public int method750(int i, char c) {
	if (aByteArrayArray186 != null)
	    return aByteArrayArray186[i][c];
	return 0;
    }
    
    public int method751(int i, char c) {
	if (aByteArrayArray186 != null)
	    return aByteArrayArray186[i][c];
	return 0;
    }
    
    public int method752(String string, int i, int i_103_, int i_104_,
			 int i_105_, Interface3[] interface3s, byte i_106_) {
	if (0 == i_103_)
	    i_103_ = -1062735011 * anInt187;
	int i_107_ = method732(string, new int[] { i }, aStringArray185,
			       interface3s, false, 1507985186);
	if (i_107_ == 0)
	    return 0;
	if (i_105_ < 0)
	    i_105_ = 0;
	i_105_ /= i_103_;
	if (i_105_ >= i_107_)
	    i_105_ = i_107_ - 1;
	String string_108_ = aStringArray185[i_105_];
	int i_109_ = 0;
	int i_110_ = 0;
	int i_111_;
	for (i_111_ = 0; i_111_ < i_104_ && i_109_ < string_108_.length();
	     i_111_ = method748(string_108_.substring(0, ++i_109_),
				interface3s, (byte) -66))
	    i_110_ = i_111_;
	if (i_109_ == string_108_.length() && string_108_.endsWith("<br>"))
	    i_109_ -= 4;
	if (i_104_ - i_110_ < i_111_ - i_104_)
	    i_109_--;
	for (int i_112_ = 0; i_112_ < i_105_; i_112_++)
	    i_109_ += aStringArray185[i_112_].length();
	return i_109_;
    }
    
    public int method753(int i, char c) {
	if (aByteArrayArray186 != null)
	    return aByteArrayArray186[i][c];
	return 0;
    }
    
    public static Class16 method754(Class472 class472, int i,
				    Interface2 interface2) {
	byte[] is = class472.method7738(i, (byte) -27);
	if (is == null)
	    return null;
	return new Class16(is, interface2);
    }
    
    static int method755(byte[][] is, byte[][] is_113_, int[] is_114_,
			 byte[] is_115_, int[] is_116_, int i, int i_117_) {
	int i_118_ = is_114_[i];
	int i_119_ = is_116_[i] + i_118_;
	int i_120_ = is_114_[i_117_];
	int i_121_ = i_120_ + is_116_[i_117_];
	int i_122_ = i_118_;
	if (i_120_ > i_118_)
	    i_122_ = i_120_;
	int i_123_ = i_119_;
	if (i_121_ < i_119_)
	    i_123_ = i_121_;
	int i_124_ = is_115_[i] & 0xff;
	if ((is_115_[i_117_] & 0xff) < i_124_)
	    i_124_ = is_115_[i_117_] & 0xff;
	byte[] is_125_ = is_113_[i];
	byte[] is_126_ = is[i_117_];
	int i_127_ = i_122_ - i_118_;
	int i_128_ = i_122_ - i_120_;
	for (int i_129_ = i_122_; i_129_ < i_123_; i_129_++) {
	    int i_130_ = is_125_[i_127_++] + is_126_[i_128_++];
	    if (i_130_ < i_124_)
		i_124_ = i_130_;
	}
	return -i_124_;
    }
    
    public int method756(int i, char c, int i_131_) {
	if (aByteArrayArray186 != null)
	    return aByteArrayArray186[i][c];
	return 0;
    }
    
    public String method757(String string, int i, Interface3[] interface3s) {
	if (method748(string, interface3s, (byte) 79) <= i)
	    return string;
	i -= method748("...", null, (byte) 13);
	int i_132_ = -1;
	int i_133_ = -1;
	int i_134_ = 0;
	int i_135_ = string.length();
	String string_136_ = "";
	for (int i_137_ = 0; i_137_ < i_135_; i_137_++) {
	    char c = string.charAt(i_137_);
	    if (60 == c)
		i_132_ = i_137_;
	    else {
		if (62 == c && i_132_ != -1) {
		    String string_138_ = string.substring(i_132_ + 1, i_137_);
		    i_132_ = -1;
		    if (string_138_.equals("lt"))
			c = '<';
		    else if (string_138_.equals("gt"))
			c = '>';
		    else if (string_138_.equals("nbsp"))
			c = '\u00a0';
		    else if (string_138_.equals("shy"))
			c = '\u00ad';
		    else if (string_138_.equals("times"))
			c = '\u00d7';
		    else if (string_138_.equals("euro"))
			c = '\u0080';
		    else if (string_138_.equals("copy"))
			c = '\u00a9';
		    else if (string_138_.equals("reg"))
			c = '\u00ae';
		    else {
			if (string_138_.startsWith("img=")
			    && interface3s != null) {
			    try {
				int i_139_
				    = Class684.method13949(string_138_
							       .substring(4),
							   (byte) 81);
				i_134_ += interface3s[i_139_].method22();
				i_133_ = -1;
				if (i_134_ > i)
				    return new StringBuilder().append
					       (string_136_).append
					       ("...").toString();
				string_136_ = string.substring(0, i_137_ + 1);
			    } catch (Exception exception) {
				/* empty */
			    }
			} else if (string_138_.startsWith("sprite=")
				   && anInterface2_188 != null) {
			    try {
				int i_140_ = -1;
				int i_141_ = string_138_.indexOf(',');
				if (-1 == i_141_)
				    i_140_ = (Class684.method13949
					      (string_138_.substring(7),
					       (byte) 32));
				else
				    i_140_
					= (Class684.method13949
					   (string_138_.substring(7, i_141_),
					    (byte) 110));
				i_134_
				    += anInterface2_188.method15(i_140_,
								 -1215975133);
				i_133_ = -1;
				if (i_134_ > i)
				    return new StringBuilder().append
					       (string_136_).append
					       ("...").toString();
				string_136_ = string.substring(0, i_137_ + 1);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (-1 == i_132_) {
		    i_134_ += aByteArray191[(Class542.method8950(c, 1603766616)
					     & 0xff)] & 0xff;
		    if (aByteArrayArray186 != null && i_133_ != -1)
			i_134_ += aByteArrayArray186[i_133_][c];
		    i_133_ = c;
		    int i_142_ = i_134_;
		    if (aByteArrayArray186 != null)
			i_142_ += aByteArrayArray186[c][46];
		    if (i_142_ > i)
			return new StringBuilder().append(string_136_).append
				   ("...").toString();
		    string_136_ = string.substring(0, 1 + i_137_);
		}
	    }
	}
	return string;
    }
    
    int method758(String string, int[] is, String[] strings,
		  Interface3[] interface3s, boolean bool) {
	if (null == string)
	    return 0;
	int i = 0;
	int i_143_ = 0;
	int i_144_ = -1;
	int i_145_ = 0;
	int i_146_ = 0;
	int i_147_ = -1;
	int i_148_ = -1;
	int i_149_ = 0;
	int i_150_ = string.length();
	for (int i_151_ = 0; i_151_ < i_150_; i_151_++) {
	    int i_152_
		= Class542.method8950(string.charAt(i_151_), 195815606) & 0xff;
	    int i_153_ = 0;
	    if (60 == i_152_)
		i_147_ = i_151_;
	    else {
		int i_154_;
		if (i_147_ != -1) {
		    if (i_152_ != 62)
			continue;
		    i_154_ = i_147_;
		    String string_155_ = string.substring(1 + i_147_, i_151_);
		    i_147_ = -1;
		    if (string_155_.equals("br")) {
			strings[i_149_] = string.substring(i_143_, 1 + i_151_);
			if (++i_149_ >= strings.length)
			    return 0;
			i_143_ = 1 + i_151_;
			i = 0;
			i_144_ = -1;
			i_148_ = -1;
			continue;
		    }
		    if (string_155_.equals("lt")) {
			i_153_ += method726(60, -1910939448);
			if (aByteArrayArray186 != null && -1 != i_148_)
			    i_153_ += aByteArrayArray186[i_148_][60];
			i_148_ = 60;
		    } else if (string_155_.equals("gt")) {
			i_153_ += method726(62, -102436070);
			if (aByteArrayArray186 != null && -1 != i_148_)
			    i_153_ += aByteArrayArray186[i_148_][62];
			i_148_ = 62;
		    } else if (string_155_.equals("nbsp")) {
			i_153_ += method726(160, -100680047);
			if (aByteArrayArray186 != null && i_148_ != -1)
			    i_153_ += aByteArrayArray186[i_148_][160];
			i_148_ = 160;
		    } else if (string_155_.equals("shy")) {
			i_153_ += method726(173, -405242032);
			if (aByteArrayArray186 != null && i_148_ != -1)
			    i_153_ += aByteArrayArray186[i_148_][173];
			i_148_ = 173;
		    } else if (string_155_.equals("times")) {
			i_153_ += method726(215, -628674385);
			if (aByteArrayArray186 != null && -1 != i_148_)
			    i_153_ += aByteArrayArray186[i_148_][215];
			i_148_ = 215;
		    } else if (string_155_.equals("euro")) {
			i_153_ += method726(128, -822888131);
			if (aByteArrayArray186 != null && -1 != i_148_)
			    i_153_ += aByteArrayArray186[i_148_][128];
			i_148_ = 128;
		    } else if (string_155_.equals("copy")) {
			i_153_ += method726(169, -1934201794);
			if (aByteArrayArray186 != null && -1 != i_148_)
			    i_153_ += aByteArrayArray186[i_148_][169];
			i_148_ = 169;
		    } else if (string_155_.equals("reg")) {
			i_153_ += method726(174, 216799313);
			if (null != aByteArrayArray186 && i_148_ != -1)
			    i_153_ += aByteArrayArray186[i_148_][174];
			i_148_ = 174;
		    } else if (string_155_.startsWith("img=")
			       && interface3s != null) {
			try {
			    int i_156_
				= Class684.method13949(string_155_
							   .substring(4),
						       (byte) 127);
			    i_153_ += interface3s[i_156_].method22();
			    i_148_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    } else if (string_155_.startsWith("sprite=")
			       && null != anInterface2_188) {
			try {
			    int i_157_ = -1;
			    int i_158_ = string_155_.indexOf(',');
			    if (i_158_ == -1)
				i_157_
				    = Class684.method13949(string_155_
							       .substring(7),
							   (byte) 69);
			    else
				i_157_ = (Class684.method13949
					  (string_155_.substring(7, i_158_),
					   (byte) 31));
			    i_153_ += anInterface2_188.method15(i_157_,
								446973943);
			    i_148_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
			continue;
		    }
		    i_152_ = -1;
		} else {
		    i_154_ = i_151_;
		    i_153_ += method726(i_152_, -1717313889);
		    if (null != aByteArrayArray186 && i_148_ != -1)
			i_153_ += aByteArrayArray186[i_148_][i_152_];
		    i_148_ = i_152_;
		}
		if (i_153_ > 0) {
		    i += i_153_;
		    if (null != is) {
			if (i_152_ == 32) {
			    i_144_ = i_151_;
			    i_145_ = i;
			    i_146_ = bool ? 1 : 0;
			}
			if (i > is[(i_149_ < is.length ? i_149_
				    : is.length - 1)]) {
			    if (i_144_ >= 0) {
				strings[i_149_]
				    = string.substring(i_143_,
						       i_144_ + 1 - i_146_);
				if (++i_149_ >= strings.length)
				    return 0;
				i_143_ = 1 + i_144_;
				i_144_ = -1;
				i -= i_145_;
				i_148_ = -1;
			    } else {
				strings[i_149_]
				    = string.substring(i_143_, i_154_);
				if (++i_149_ >= strings.length)
				    return 0;
				i_143_ = i_154_;
				i_144_ = -1;
				i = i_153_;
				i_148_ = -1;
			    }
			}
			if (45 == i_152_) {
			    i_144_ = i_151_;
			    i_145_ = i;
			    i_146_ = 0;
			}
		    }
		}
	    }
	}
	if (string.length() > i_143_) {
	    strings[i_149_] = string.substring(i_143_, string.length());
	    i_149_++;
	}
	return i_149_;
    }
    
    int method759(String string, int[] is, String[] strings,
		  Interface3[] interface3s, boolean bool) {
	if (null == string)
	    return 0;
	int i = 0;
	int i_159_ = 0;
	int i_160_ = -1;
	int i_161_ = 0;
	int i_162_ = 0;
	int i_163_ = -1;
	int i_164_ = -1;
	int i_165_ = 0;
	int i_166_ = string.length();
	for (int i_167_ = 0; i_167_ < i_166_; i_167_++) {
	    int i_168_
		= (Class542.method8950(string.charAt(i_167_), -2021395344)
		   & 0xff);
	    int i_169_ = 0;
	    if (60 == i_168_)
		i_163_ = i_167_;
	    else {
		int i_170_;
		if (i_163_ != -1) {
		    if (i_168_ != 62)
			continue;
		    i_170_ = i_163_;
		    String string_171_ = string.substring(1 + i_163_, i_167_);
		    i_163_ = -1;
		    if (string_171_.equals("br")) {
			strings[i_165_] = string.substring(i_159_, 1 + i_167_);
			if (++i_165_ >= strings.length)
			    return 0;
			i_159_ = 1 + i_167_;
			i = 0;
			i_160_ = -1;
			i_164_ = -1;
			continue;
		    }
		    if (string_171_.equals("lt")) {
			i_169_ += method726(60, -1607842045);
			if (aByteArrayArray186 != null && -1 != i_164_)
			    i_169_ += aByteArrayArray186[i_164_][60];
			i_164_ = 60;
		    } else if (string_171_.equals("gt")) {
			i_169_ += method726(62, -2102480795);
			if (aByteArrayArray186 != null && -1 != i_164_)
			    i_169_ += aByteArrayArray186[i_164_][62];
			i_164_ = 62;
		    } else if (string_171_.equals("nbsp")) {
			i_169_ += method726(160, -782049514);
			if (aByteArrayArray186 != null && i_164_ != -1)
			    i_169_ += aByteArrayArray186[i_164_][160];
			i_164_ = 160;
		    } else if (string_171_.equals("shy")) {
			i_169_ += method726(173, -2025712063);
			if (aByteArrayArray186 != null && i_164_ != -1)
			    i_169_ += aByteArrayArray186[i_164_][173];
			i_164_ = 173;
		    } else if (string_171_.equals("times")) {
			i_169_ += method726(215, 323538185);
			if (aByteArrayArray186 != null && -1 != i_164_)
			    i_169_ += aByteArrayArray186[i_164_][215];
			i_164_ = 215;
		    } else if (string_171_.equals("euro")) {
			i_169_ += method726(128, 415780639);
			if (aByteArrayArray186 != null && -1 != i_164_)
			    i_169_ += aByteArrayArray186[i_164_][128];
			i_164_ = 128;
		    } else if (string_171_.equals("copy")) {
			i_169_ += method726(169, -75043190);
			if (aByteArrayArray186 != null && -1 != i_164_)
			    i_169_ += aByteArrayArray186[i_164_][169];
			i_164_ = 169;
		    } else if (string_171_.equals("reg")) {
			i_169_ += method726(174, -2119569270);
			if (null != aByteArrayArray186 && i_164_ != -1)
			    i_169_ += aByteArrayArray186[i_164_][174];
			i_164_ = 174;
		    } else if (string_171_.startsWith("img=")
			       && interface3s != null) {
			try {
			    int i_172_
				= Class684.method13949(string_171_
							   .substring(4),
						       (byte) 74);
			    i_169_ += interface3s[i_172_].method22();
			    i_164_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    } else if (string_171_.startsWith("sprite=")
			       && null != anInterface2_188) {
			try {
			    int i_173_ = -1;
			    int i_174_ = string_171_.indexOf(',');
			    if (i_174_ == -1)
				i_173_
				    = Class684.method13949(string_171_
							       .substring(7),
							   (byte) 14);
			    else
				i_173_ = (Class684.method13949
					  (string_171_.substring(7, i_174_),
					   (byte) 39));
			    i_169_ += anInterface2_188.method15(i_173_,
								1729405476);
			    i_164_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
			continue;
		    }
		    i_168_ = -1;
		} else {
		    i_170_ = i_167_;
		    i_169_ += method726(i_168_, -473699612);
		    if (null != aByteArrayArray186 && i_164_ != -1)
			i_169_ += aByteArrayArray186[i_164_][i_168_];
		    i_164_ = i_168_;
		}
		if (i_169_ > 0) {
		    i += i_169_;
		    if (null != is) {
			if (i_168_ == 32) {
			    i_160_ = i_167_;
			    i_161_ = i;
			    i_162_ = bool ? 1 : 0;
			}
			if (i > is[(i_165_ < is.length ? i_165_
				    : is.length - 1)]) {
			    if (i_160_ >= 0) {
				strings[i_165_]
				    = string.substring(i_159_,
						       i_160_ + 1 - i_162_);
				if (++i_165_ >= strings.length)
				    return 0;
				i_159_ = 1 + i_160_;
				i_160_ = -1;
				i -= i_161_;
				i_164_ = -1;
			    } else {
				strings[i_165_]
				    = string.substring(i_159_, i_170_);
				if (++i_165_ >= strings.length)
				    return 0;
				i_159_ = i_170_;
				i_160_ = -1;
				i = i_169_;
				i_164_ = -1;
			    }
			}
			if (45 == i_168_) {
			    i_160_ = i_167_;
			    i_161_ = i;
			    i_162_ = 0;
			}
		    }
		}
	    }
	}
	if (string.length() > i_159_) {
	    strings[i_165_] = string.substring(i_159_, string.length());
	    i_165_++;
	}
	return i_165_;
    }
    
    Class16(byte[] is, Interface2 interface2) {
	anInterface2_188 = interface2;
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i = class534_sub40.method16527(657132462);
	if (0 != i)
	    throw new RuntimeException("");
	boolean bool = class534_sub40.method16527(-1850156880) == 1;
	aByteArray191 = new byte[256];
	class534_sub40.method16735(aByteArray191, 0, 256, (short) -956);
	if (bool) {
	    int[] is_175_ = new int[256];
	    int[] is_176_ = new int[256];
	    for (int i_177_ = 0; i_177_ < 256; i_177_++)
		is_175_[i_177_] = class534_sub40.method16527(1840453645);
	    for (int i_178_ = 0; i_178_ < 256; i_178_++)
		is_176_[i_178_] = class534_sub40.method16527(1585283527);
	    byte[][] is_179_ = new byte[256][];
	    for (int i_180_ = 0; i_180_ < 256; i_180_++) {
		is_179_[i_180_] = new byte[is_175_[i_180_]];
		byte i_181_ = 0;
		for (int i_182_ = 0; i_182_ < is_179_[i_180_].length;
		     i_182_++) {
		    i_181_ += class534_sub40.method16586((byte) 1);
		    is_179_[i_180_][i_182_] = i_181_;
		}
	    }
	    byte[][] is_183_ = new byte[256][];
	    for (int i_184_ = 0; i_184_ < 256; i_184_++) {
		is_183_[i_184_] = new byte[is_175_[i_184_]];
		byte i_185_ = 0;
		for (int i_186_ = 0; i_186_ < is_183_[i_184_].length;
		     i_186_++) {
		    i_185_ += class534_sub40.method16586((byte) 1);
		    is_183_[i_184_][i_186_] = i_185_;
		}
	    }
	    aByteArrayArray186 = new byte[256][256];
	    for (int i_187_ = 0; i_187_ < 256; i_187_++) {
		if (32 != i_187_ && i_187_ != 160) {
		    for (int i_188_ = 0; i_188_ < 256; i_188_++) {
			if (i_188_ != 32 && i_188_ != 160)
			    aByteArrayArray186[i_187_][i_188_]
				= (byte) Class185.method3695(is_179_, is_183_,
							     is_176_,
							     aByteArray191,
							     is_175_, i_187_,
							     i_188_, (byte) 0);
		    }
		}
	    }
	    anInt187 = 1399519477 * (is_175_[32] + is_176_[32]);
	} else
	    anInt187 = class534_sub40.method16527(-1603179383) * 1399519477;
	class534_sub40.method16527(863420497);
	class534_sub40.method16527(1768580573);
	anInt190 = class534_sub40.method16527(-1104419879) * 1271484663;
	anInt189 = class534_sub40.method16527(-1400434665) * -1770526733;
    }
    
    public int method760(String string, int i, Interface3[] interface3s) {
	return method731(string, new int[] { i }, aStringArray185, interface3s,
			 -1123904572);
    }
    
    public Point method761(String string, int i, int i_189_, int i_190_,
			   Interface3[] interface3s) {
	if (i_190_ <= 0)
	    return new Point(0, i_189_ + 102396103 * anInt190);
	if (i_190_ > string.length())
	    i_190_ = string.length();
	if (i_189_ == 0)
	    i_189_ = anInt187 * -1062735011;
	int i_191_ = method732(string, new int[] { i }, aStringArray185,
			       interface3s, false, 1030457075);
	int i_192_ = 0;
	for (int i_193_ = 0; i_193_ < i_191_; i_193_++) {
	    int i_194_ = aStringArray185[i_193_].length();
	    if (i_192_ + i_194_ > i_190_
		|| i_193_ == i_191_ - 1 && i_190_ == string.length()) {
		String string_195_ = string.substring(i_192_, i_190_);
		if (string_195_.endsWith("<br>")) {
		    string_195_ = "";
		    i_192_ += i_194_;
		    i_193_++;
		}
		int i_196_ = method748(string_195_, interface3s, (byte) -46);
		int i_197_ = anInt190 * 102396103 + i_193_ * i_189_;
		return new Point(i_196_, i_197_);
	    }
	    i_192_ += i_194_;
	}
	return null;
    }
    
    public Point method762(String string, int i, int i_198_, int i_199_,
			   Interface3[] interface3s) {
	if (i_199_ <= 0)
	    return new Point(0, i_198_ + 102396103 * anInt190);
	if (i_199_ > string.length())
	    i_199_ = string.length();
	if (i_198_ == 0)
	    i_198_ = anInt187 * -1062735011;
	int i_200_ = method732(string, new int[] { i }, aStringArray185,
			       interface3s, false, 1363579752);
	int i_201_ = 0;
	for (int i_202_ = 0; i_202_ < i_200_; i_202_++) {
	    int i_203_ = aStringArray185[i_202_].length();
	    if (i_201_ + i_203_ > i_199_
		|| i_202_ == i_200_ - 1 && i_199_ == string.length()) {
		String string_204_ = string.substring(i_201_, i_199_);
		if (string_204_.endsWith("<br>")) {
		    string_204_ = "";
		    i_201_ += i_203_;
		    i_202_++;
		}
		int i_205_ = method748(string_204_, interface3s, (byte) -68);
		int i_206_ = anInt190 * 102396103 + i_202_ * i_198_;
		return new Point(i_205_, i_206_);
	    }
	    i_201_ += i_203_;
	}
	return null;
    }
    
    public int method763(String string, int i, int i_207_, int i_208_,
			 int i_209_, Interface3[] interface3s) {
	if (0 == i_207_)
	    i_207_ = -1062735011 * anInt187;
	int i_210_ = method732(string, new int[] { i }, aStringArray185,
			       interface3s, false, 1229001630);
	if (i_210_ == 0)
	    return 0;
	if (i_209_ < 0)
	    i_209_ = 0;
	i_209_ /= i_207_;
	if (i_209_ >= i_210_)
	    i_209_ = i_210_ - 1;
	String string_211_ = aStringArray185[i_209_];
	int i_212_ = 0;
	int i_213_ = 0;
	int i_214_;
	for (i_214_ = 0; i_214_ < i_208_ && i_212_ < string_211_.length();
	     i_214_ = method748(string_211_.substring(0, ++i_212_),
				interface3s, (byte) -3))
	    i_213_ = i_214_;
	if (i_212_ == string_211_.length() && string_211_.endsWith("<br>"))
	    i_212_ -= 4;
	if (i_208_ - i_213_ < i_214_ - i_208_)
	    i_212_--;
	for (int i_215_ = 0; i_215_ < i_209_; i_215_++)
	    i_212_ += aStringArray185[i_215_].length();
	return i_212_;
    }
    
    public int method764(String string, int i, int i_216_, int i_217_,
			 int i_218_, Interface3[] interface3s) {
	if (0 == i_216_)
	    i_216_ = -1062735011 * anInt187;
	int i_219_ = method732(string, new int[] { i }, aStringArray185,
			       interface3s, false, 169452200);
	if (i_219_ == 0)
	    return 0;
	if (i_218_ < 0)
	    i_218_ = 0;
	i_218_ /= i_216_;
	if (i_218_ >= i_219_)
	    i_218_ = i_219_ - 1;
	String string_220_ = aStringArray185[i_218_];
	int i_221_ = 0;
	int i_222_ = 0;
	int i_223_;
	for (i_223_ = 0; i_223_ < i_217_ && i_221_ < string_220_.length();
	     i_223_ = method748(string_220_.substring(0, ++i_221_),
				interface3s, (byte) 13))
	    i_222_ = i_223_;
	if (i_221_ == string_220_.length() && string_220_.endsWith("<br>"))
	    i_221_ -= 4;
	if (i_217_ - i_222_ < i_223_ - i_217_)
	    i_221_--;
	for (int i_224_ = 0; i_224_ < i_218_; i_224_++)
	    i_221_ += aStringArray185[i_224_].length();
	return i_221_;
    }
    
    public int method765(String string) {
	return method748(string, null, (byte) -22);
    }
    
    static final void method766(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -383096907 * Class328.anInt3478;
    }
    
    static final void method767(Class669 class669, int i) {
	int i_225_ = (class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_225_, 794508992);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_225_ >> 16];
	Class534_Sub11.method16133(class247, class243, class669, (short) 287);
    }
    
    static final void method768(Class669 class669, byte i) {
	int i_226_ = (class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_226_, -16131516);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_226_ >> 16];
	Class159.method2608(class247, class243, class669, -1943364095);
    }
}
