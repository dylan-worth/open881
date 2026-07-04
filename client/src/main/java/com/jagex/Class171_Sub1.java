/* Class171_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class171_Sub1 extends Class171
{
    Class185_Sub2 aClass185_Sub2_9781;
    int[] anIntArray9782;
    Class163[] aClass163Array9783;
    int[] anIntArray9784;
    int[] anIntArray9785;
    int[] anIntArray9786;
    Class163[] aClass163Array9787;
    
    void method2860(char c, int i, int i_0_, int i_1_, boolean bool) {
	if (aClass185_Sub2_9781.anIntArray9338 != null) {
	    i += anIntArray9786[c];
	    i_0_ += anIntArray9782[c];
	    if (bool)
		aClass163Array9783[c].method2657(i, i_0_, 1, i_1_, 1);
	    else
		aClass163Array9787[c].method2657(i, i_0_, 1, i_1_, 1);
	}
    }
    
    Class171_Sub1(Class185_Sub2 class185_sub2, Class16 class16,
		  Class169_Sub1[] class169_sub1s, int[] is, int[] is_2_) {
	super(class185_sub2, class16);
	aClass185_Sub2_9781 = class185_sub2;
	aClass185_Sub2_9781 = class185_sub2;
	anIntArray9784 = is;
	anIntArray9785 = is_2_;
	aClass163Array9787 = new Class163[class169_sub1s.length];
	aClass163Array9783 = new Class163[class169_sub1s.length];
	anIntArray9782 = new int[class169_sub1s.length];
	anIntArray9786 = new int[class169_sub1s.length];
	for (int i = 0; i < class169_sub1s.length; i++) {
	    aClass163Array9787[i]
		= aClass185_Sub2_9781.method3279(class169_sub1s[i], false);
	    int[] is_3_ = (int[]) class169_sub1s[i].method2766(false).clone();
	    for (int i_4_ = 0; i_4_ < is_3_.length; i_4_++) {
		int i_5_ = is_3_[i_4_];
		int i_6_ = (byte) ((i_5_ & 0xff) + ((i_5_ >> 8 & 0xff) * 4
						    + 3 * (i_5_ >> 16 & 0xff))
				   >> 3);
		is_3_[i_4_]
		    = is_3_[i_4_] & ~0xffffff | i_6_ << 16 | i_6_ << 8 | i_6_;
	    }
	    aClass163Array9783[i]
		= aClass185_Sub2_9781.method3316(is_3_, 0, anIntArray9784[i],
						 anIntArray9784[i],
						 anIntArray9785[i], false);
	    anIntArray9782[i] = class169_sub1s[i].method2781();
	    anIntArray9786[i] = class169_sub1s[i].method2764();
	}
    }
    
    void method2877(char c, int i, int i_7_, int i_8_, boolean bool,
		    Class145 class145, int i_9_, int i_10_) {
	/* empty */
    }
    
    void method2845(char c, int i, int i_11_, int i_12_, boolean bool) {
	if (aClass185_Sub2_9781.anIntArray9338 != null) {
	    i += anIntArray9786[c];
	    i_11_ += anIntArray9782[c];
	    if (bool)
		aClass163Array9783[c].method2657(i, i_11_, 1, i_12_, 1);
	    else
		aClass163Array9787[c].method2657(i, i_11_, 1, i_12_, 1);
	}
    }
    
    void method2846(char c, int i, int i_13_, int i_14_, boolean bool) {
	if (aClass185_Sub2_9781.anIntArray9338 != null) {
	    i += anIntArray9786[c];
	    i_13_ += anIntArray9782[c];
	    if (bool)
		aClass163Array9783[c].method2657(i, i_13_, 1, i_14_, 1);
	    else
		aClass163Array9787[c].method2657(i, i_13_, 1, i_14_, 1);
	}
    }
    
    void method2847(char c, int i, int i_15_, int i_16_, boolean bool,
		    Class145 class145, int i_17_, int i_18_) {
	/* empty */
    }
    
    void method2848(char c, int i, int i_19_, int i_20_, boolean bool,
		    Class145 class145, int i_21_, int i_22_) {
	/* empty */
    }
    
    public static int method15495(int i) {
	return Class625.anInt8164 * -1429983313;
    }
}
