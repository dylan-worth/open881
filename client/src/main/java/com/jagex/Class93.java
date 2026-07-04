/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class93
{
    static char[] aCharArray897
	= { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4',
	    '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3',
	    '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9',
	    '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd',
	    '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6',
	    '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5',
	    '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da',
	    '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178',
	    '\u00f1', '\u00d1', '\u00df' };
    static final int anInt898 = 12;
    static char[] aCharArray899 = { '[', ']', '#' };
    static final int anInt900 = 1;
    public static int anInt901;
    
    static final boolean method1748(char c) {
	return '\u00a0' == c || c == ' ' || '_' == c || c == '-';
    }
    
    static char method1749(char c) {
	switch (c) {
	case '\u00d9':
	case '\u00da':
	case '\u00db':
	case '\u00dc':
	case '\u00f9':
	case '\u00fa':
	case '\u00fb':
	case '\u00fc':
	    return 'u';
	default:
	    return Character.toLowerCase(c);
	case '\u00c7':
	case '\u00e7':
	    return 'c';
	case '\u00df':
	    return 'b';
	case ' ':
	case '-':
	case '_':
	case '\u00a0':
	    return '_';
	case '\u00ff':
	case '\u0178':
	    return 'y';
	case '\u00c0':
	case '\u00c1':
	case '\u00c2':
	case '\u00c3':
	case '\u00c4':
	case '\u00e0':
	case '\u00e1':
	case '\u00e2':
	case '\u00e3':
	case '\u00e4':
	    return 'a';
	case '\u00cd':
	case '\u00ce':
	case '\u00cf':
	case '\u00ed':
	case '\u00ee':
	case '\u00ef':
	    return 'i';
	case '\u00c8':
	case '\u00c9':
	case '\u00ca':
	case '\u00cb':
	case '\u00e8':
	case '\u00e9':
	case '\u00ea':
	case '\u00eb':
	    return 'e';
	case '\u00d1':
	case '\u00f1':
	    return 'n';
	case '\u00d2':
	case '\u00d3':
	case '\u00d4':
	case '\u00d5':
	case '\u00d6':
	case '\u00f2':
	case '\u00f3':
	case '\u00f4':
	case '\u00f5':
	case '\u00f6':
	    return 'o';
	case '#':
	case '[':
	case ']':
	    return c;
	}
    }
    
    static final int method1750(Class76 class76) {
	if (null == class76)
	    return 12;
	switch (-912665199 * class76.anInt813) {
	case 7:
	    return 20;
	default:
	    return 12;
	}
    }
    
    static final boolean method1751(char c) {
	if (Character.isISOControl(c))
	    return false;
	if (Class604.method10031(c, 1879367976))
	    return true;
	char[] cs = aCharArray897;
	for (int i = 0; i < cs.length; i++) {
	    char c_0_ = cs[i];
	    if (c == c_0_)
		return true;
	}
	cs = aCharArray899;
	for (int i = 0; i < cs.length; i++) {
	    char c_1_ = cs[i];
	    if (c_1_ == c)
		return true;
	}
	return false;
    }
    
    static final boolean method1752(char c) {
	if (Character.isISOControl(c))
	    return false;
	if (Class604.method10031(c, 1685476821))
	    return true;
	char[] cs = aCharArray897;
	for (int i = 0; i < cs.length; i++) {
	    char c_2_ = cs[i];
	    if (c == c_2_)
		return true;
	}
	cs = aCharArray899;
	for (int i = 0; i < cs.length; i++) {
	    char c_3_ = cs[i];
	    if (c_3_ == c)
		return true;
	}
	return false;
    }
    
    static final boolean method1753(char c) {
	if (Character.isISOControl(c))
	    return false;
	if (Class604.method10031(c, 1737495220))
	    return true;
	char[] cs = aCharArray897;
	for (int i = 0; i < cs.length; i++) {
	    char c_4_ = cs[i];
	    if (c == c_4_)
		return true;
	}
	cs = aCharArray899;
	for (int i = 0; i < cs.length; i++) {
	    char c_5_ = cs[i];
	    if (c_5_ == c)
		return true;
	}
	return false;
    }
    
    static final boolean method1754(char c) {
	return '\u00a0' == c || c == ' ' || '_' == c || c == '-';
    }
    
    static final boolean method1755(char c) {
	return '\u00a0' == c || c == ' ' || '_' == c || c == '-';
    }
    
    static char method1756(char c) {
	switch (c) {
	case '\u00d9':
	case '\u00da':
	case '\u00db':
	case '\u00dc':
	case '\u00f9':
	case '\u00fa':
	case '\u00fb':
	case '\u00fc':
	    return 'u';
	default:
	    return Character.toLowerCase(c);
	case '\u00c7':
	case '\u00e7':
	    return 'c';
	case '\u00df':
	    return 'b';
	case ' ':
	case '-':
	case '_':
	case '\u00a0':
	    return '_';
	case '\u00ff':
	case '\u0178':
	    return 'y';
	case '\u00c0':
	case '\u00c1':
	case '\u00c2':
	case '\u00c3':
	case '\u00c4':
	case '\u00e0':
	case '\u00e1':
	case '\u00e2':
	case '\u00e3':
	case '\u00e4':
	    return 'a';
	case '\u00cd':
	case '\u00ce':
	case '\u00cf':
	case '\u00ed':
	case '\u00ee':
	case '\u00ef':
	    return 'i';
	case '\u00c8':
	case '\u00c9':
	case '\u00ca':
	case '\u00cb':
	case '\u00e8':
	case '\u00e9':
	case '\u00ea':
	case '\u00eb':
	    return 'e';
	case '\u00d1':
	case '\u00f1':
	    return 'n';
	case '\u00d2':
	case '\u00d3':
	case '\u00d4':
	case '\u00d5':
	case '\u00d6':
	case '\u00f2':
	case '\u00f3':
	case '\u00f4':
	case '\u00f5':
	case '\u00f6':
	    return 'o';
	case '#':
	case '[':
	case ']':
	    return c;
	}
    }
    
    public static String method1757(CharSequence charsequence,
				    Class76 class76) {
	if (null == charsequence)
	    return null;
	int i = 0;
	int i_6_;
	for (i_6_ = charsequence.length();
	     (i < i_6_
	      && Class330.method5855(charsequence.charAt(i), (short) -5683));
	     i++) {
	    /* empty */
	}
	for (/**/;
	     i_6_ > i && Class330.method5855(charsequence.charAt(i_6_ - 1),
					     (short) -1304);
	     i_6_--) {
	    /* empty */
	}
	int i_7_ = i_6_ - i;
	if (i_7_ < 1 || i_7_ > Class465.method7573(class76, -265211019))
	    return null;
	StringBuilder stringbuilder = new StringBuilder(i_7_);
	for (int i_8_ = i; i_8_ < i_6_; i_8_++) {
	    char c = charsequence.charAt(i_8_);
	    if (Class288.method5279(c, (byte) 15)) {
		char c_9_ = Class578.method9798(c, 163921014);
		if (c_9_ != 0)
		    stringbuilder.append(c_9_);
	    }
	}
	if (stringbuilder.length() == 0)
	    return null;
	return stringbuilder.toString();
    }
    
    public static String method1758(CharSequence charsequence,
				    Class76 class76) {
	if (null == charsequence)
	    return null;
	int i = 0;
	int i_10_;
	for (i_10_ = charsequence.length();
	     (i < i_10_
	      && Class330.method5855(charsequence.charAt(i), (short) 23379));
	     i++) {
	    /* empty */
	}
	for (/**/;
	     i_10_ > i && Class330.method5855(charsequence.charAt(i_10_ - 1),
					      (short) -16842);
	     i_10_--) {
	    /* empty */
	}
	int i_11_ = i_10_ - i;
	if (i_11_ < 1 || i_11_ > Class465.method7573(class76, 850410162))
	    return null;
	StringBuilder stringbuilder = new StringBuilder(i_11_);
	for (int i_12_ = i; i_12_ < i_10_; i_12_++) {
	    char c = charsequence.charAt(i_12_);
	    if (Class288.method5279(c, (byte) 2)) {
		char c_13_ = Class578.method9798(c, 1633345933);
		if (c_13_ != 0)
		    stringbuilder.append(c_13_);
	    }
	}
	if (stringbuilder.length() == 0)
	    return null;
	return stringbuilder.toString();
    }
    
    Class93() throws Throwable {
	throw new Error();
    }
    
    static char method1759(char c) {
	switch (c) {
	case '\u00d9':
	case '\u00da':
	case '\u00db':
	case '\u00dc':
	case '\u00f9':
	case '\u00fa':
	case '\u00fb':
	case '\u00fc':
	    return 'u';
	default:
	    return Character.toLowerCase(c);
	case '\u00c7':
	case '\u00e7':
	    return 'c';
	case '\u00df':
	    return 'b';
	case ' ':
	case '-':
	case '_':
	case '\u00a0':
	    return '_';
	case '\u00ff':
	case '\u0178':
	    return 'y';
	case '\u00c0':
	case '\u00c1':
	case '\u00c2':
	case '\u00c3':
	case '\u00c4':
	case '\u00e0':
	case '\u00e1':
	case '\u00e2':
	case '\u00e3':
	case '\u00e4':
	    return 'a';
	case '\u00cd':
	case '\u00ce':
	case '\u00cf':
	case '\u00ed':
	case '\u00ee':
	case '\u00ef':
	    return 'i';
	case '\u00c8':
	case '\u00c9':
	case '\u00ca':
	case '\u00cb':
	case '\u00e8':
	case '\u00e9':
	case '\u00ea':
	case '\u00eb':
	    return 'e';
	case '\u00d1':
	case '\u00f1':
	    return 'n';
	case '\u00d2':
	case '\u00d3':
	case '\u00d4':
	case '\u00d5':
	case '\u00d6':
	case '\u00f2':
	case '\u00f3':
	case '\u00f4':
	case '\u00f5':
	case '\u00f6':
	    return 'o';
	case '#':
	case '[':
	case ']':
	    return c;
	}
    }
    
    static char method1760(char c) {
	switch (c) {
	case '\u00d9':
	case '\u00da':
	case '\u00db':
	case '\u00dc':
	case '\u00f9':
	case '\u00fa':
	case '\u00fb':
	case '\u00fc':
	    return 'u';
	default:
	    return Character.toLowerCase(c);
	case '\u00c7':
	case '\u00e7':
	    return 'c';
	case '\u00df':
	    return 'b';
	case ' ':
	case '-':
	case '_':
	case '\u00a0':
	    return '_';
	case '\u00ff':
	case '\u0178':
	    return 'y';
	case '\u00c0':
	case '\u00c1':
	case '\u00c2':
	case '\u00c3':
	case '\u00c4':
	case '\u00e0':
	case '\u00e1':
	case '\u00e2':
	case '\u00e3':
	case '\u00e4':
	    return 'a';
	case '\u00cd':
	case '\u00ce':
	case '\u00cf':
	case '\u00ed':
	case '\u00ee':
	case '\u00ef':
	    return 'i';
	case '\u00c8':
	case '\u00c9':
	case '\u00ca':
	case '\u00cb':
	case '\u00e8':
	case '\u00e9':
	case '\u00ea':
	case '\u00eb':
	    return 'e';
	case '\u00d1':
	case '\u00f1':
	    return 'n';
	case '\u00d2':
	case '\u00d3':
	case '\u00d4':
	case '\u00d5':
	case '\u00d6':
	case '\u00f2':
	case '\u00f3':
	case '\u00f4':
	case '\u00f5':
	case '\u00f6':
	    return 'o';
	case '#':
	case '[':
	case ']':
	    return c;
	}
    }
    
    static char method1761(char c) {
	switch (c) {
	case '\u00d9':
	case '\u00da':
	case '\u00db':
	case '\u00dc':
	case '\u00f9':
	case '\u00fa':
	case '\u00fb':
	case '\u00fc':
	    return 'u';
	default:
	    return Character.toLowerCase(c);
	case '\u00c7':
	case '\u00e7':
	    return 'c';
	case '\u00df':
	    return 'b';
	case ' ':
	case '-':
	case '_':
	case '\u00a0':
	    return '_';
	case '\u00ff':
	case '\u0178':
	    return 'y';
	case '\u00c0':
	case '\u00c1':
	case '\u00c2':
	case '\u00c3':
	case '\u00c4':
	case '\u00e0':
	case '\u00e1':
	case '\u00e2':
	case '\u00e3':
	case '\u00e4':
	    return 'a';
	case '\u00cd':
	case '\u00ce':
	case '\u00cf':
	case '\u00ed':
	case '\u00ee':
	case '\u00ef':
	    return 'i';
	case '\u00c8':
	case '\u00c9':
	case '\u00ca':
	case '\u00cb':
	case '\u00e8':
	case '\u00e9':
	case '\u00ea':
	case '\u00eb':
	    return 'e';
	case '\u00d1':
	case '\u00f1':
	    return 'n';
	case '\u00d2':
	case '\u00d3':
	case '\u00d4':
	case '\u00d5':
	case '\u00d6':
	case '\u00f2':
	case '\u00f3':
	case '\u00f4':
	case '\u00f5':
	case '\u00f6':
	    return 'o';
	case '#':
	case '[':
	case ']':
	    return c;
	}
    }
    
    static final void method1762(Class669 class669, short i) {
	int i_14_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_14_ >> 28;
    }
}
