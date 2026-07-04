/* Class564 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class564
{
    int anInt7561;
    int anInt7562;
    int anInt7563;
    int anInt7564;
    int anInt7565;
    int anInt7566;
    int anInt7567;
    int anInt7568;
    int anInt7569;
    int anInt7570;
    
    void method9514(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
		    int i_5_, int i_6_, int i_7_, int i_8_) {
	anInt7563 = i;
	anInt7561 = i_0_;
	anInt7562 = i_1_;
	anInt7564 = i_2_ * i_2_;
	anInt7565 = anInt7563 + i_3_;
	anInt7566 = anInt7563 + i_4_;
	anInt7567 = anInt7561 + i_5_;
	anInt7568 = anInt7561 + i_6_;
	anInt7569 = anInt7562 + i_7_;
	anInt7570 = anInt7562 + i_8_;
    }
    
    void method9515(int i, int i_9_, int i_10_, int i_11_, int i_12_,
		    int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
	anInt7563 = i;
	anInt7561 = i_9_;
	anInt7562 = i_10_;
	anInt7564 = i_11_ * i_11_;
	anInt7565 = anInt7563 + i_12_;
	anInt7566 = anInt7563 + i_13_;
	anInt7567 = anInt7561 + i_14_;
	anInt7568 = anInt7561 + i_15_;
	anInt7569 = anInt7562 + i_16_;
	anInt7570 = anInt7562 + i_17_;
    }
    
    public boolean method9516(int i, int i_18_, int i_19_) {
	if (i < anInt7565 || i > anInt7566)
	    return false;
	if (i_18_ < anInt7567 || i_18_ > anInt7568)
	    return false;
	if (i_19_ < anInt7569 || i_19_ > anInt7570)
	    return false;
	int i_20_ = i - anInt7563;
	int i_21_ = i_19_ - anInt7562;
	return i_20_ * i_20_ + i_21_ * i_21_ < anInt7564;
    }
    
    public boolean method9517(int i, int i_22_, int i_23_) {
	if (i < anInt7565 || i > anInt7566)
	    return false;
	if (i_22_ < anInt7567 || i_22_ > anInt7568)
	    return false;
	if (i_23_ < anInt7569 || i_23_ > anInt7570)
	    return false;
	int i_24_ = i - anInt7563;
	int i_25_ = i_23_ - anInt7562;
	return i_24_ * i_24_ + i_25_ * i_25_ < anInt7564;
    }
    
    void method9518(int i, int i_26_, int i_27_, int i_28_, int i_29_,
		    int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
	anInt7563 = i;
	anInt7561 = i_26_;
	anInt7562 = i_27_;
	anInt7564 = i_28_ * i_28_;
	anInt7565 = anInt7563 + i_29_;
	anInt7566 = anInt7563 + i_30_;
	anInt7567 = anInt7561 + i_31_;
	anInt7568 = anInt7561 + i_32_;
	anInt7569 = anInt7562 + i_33_;
	anInt7570 = anInt7562 + i_34_;
    }
    
    void method9519(int i, int i_35_, int i_36_, int i_37_, int i_38_,
		    int i_39_, int i_40_, int i_41_, int i_42_, int i_43_) {
	anInt7563 = i;
	anInt7561 = i_35_;
	anInt7562 = i_36_;
	anInt7564 = i_37_ * i_37_;
	anInt7565 = anInt7563 + i_38_;
	anInt7566 = anInt7563 + i_39_;
	anInt7567 = anInt7561 + i_40_;
	anInt7568 = anInt7561 + i_41_;
	anInt7569 = anInt7562 + i_42_;
	anInt7570 = anInt7562 + i_43_;
    }
    
    Class564(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_,
	     int i_49_, int i_50_, int i_51_, int i_52_) {
	anInt7563 = i;
	anInt7561 = i_44_;
	anInt7562 = i_45_;
	anInt7564 = i_46_ * i_46_;
	anInt7565 = anInt7563 + i_47_;
	anInt7566 = anInt7563 + i_48_;
	anInt7567 = anInt7561 + i_49_;
	anInt7568 = anInt7561 + i_50_;
	anInt7569 = anInt7562 + i_51_;
	anInt7570 = anInt7562 + i_52_;
    }
    
    public boolean method9520(int i, int i_53_, int i_54_) {
	if (i < anInt7565 || i > anInt7566)
	    return false;
	if (i_53_ < anInt7567 || i_53_ > anInt7568)
	    return false;
	if (i_54_ < anInt7569 || i_54_ > anInt7570)
	    return false;
	int i_55_ = i - anInt7563;
	int i_56_ = i_54_ - anInt7562;
	return i_55_ * i_55_ + i_56_ * i_56_ < anInt7564;
    }
}
