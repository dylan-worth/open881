/* Class654_Sub1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class654_Sub1_Sub5 extends Class654_Sub1
{
    int anInt11895 = 0;
    public short aShort11896;
    Class534_Sub21[] aClass534_Sub21Array11897 = new Class534_Sub21[4];
    public short aShort11898;
    byte aByte11899;
    public short aShort11900;
    public short aShort11901;
    public boolean aBool11902;
    
    Class654_Sub1_Sub5(Class556 class556, int i, int i_0_, int i_1_, int i_2_,
		       int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
		       boolean bool, byte i_8_) {
	super(class556);
	aByte10854 = (byte) i;
	aByte10853 = (byte) i_0_;
	method10809(new Class438((float) i_1_, (float) i_2_, (float) i_3_));
	aShort11900 = (short) i_4_;
	aShort11896 = (short) i_5_;
	aShort11901 = (short) i_6_;
	aShort11898 = (short) i_7_;
	aBool11902 = bool;
	aByte11899 = i_8_;
	for (int i_9_ = 0; i_9_ < 4; i_9_++)
	    aClass534_Sub21Array11897[i_9_] = null;
    }
    
    boolean method16891(Class185 class185) {
	return (aClass556_10855.aClass552_7427.method9065
		(aByte10853, aShort11900, aShort11896, aShort11901,
		 aShort11898, method16855(class185, (short) 6088)));
    }
    
    void method18482() {
	/* empty */
    }
    
    boolean method16857(Class185 class185, int i) {
	return (aClass556_10855.aClass552_7427.method9065
		(aByte10853, aShort11900, aShort11896, aShort11901,
		 aShort11898, method16855(class185, (short) 8762)));
    }
    
    int method16856(Class534_Sub21[] class534_sub21s, int i) {
	if (aBool8514) {
	    anInt11895 = 0;
	    int i_10_ = Math.max(0, aShort11900);
	    int i_11_ = Math.min((aClass556_10855.aLongArrayArrayArray7473
				  [aByte10854]).length - 1,
				 aShort11896);
	    int i_12_ = Math.max(0, aShort11901);
	    int i_13_ = Math.min((aClass556_10855.aLongArrayArrayArray7473
				  [aByte10854][i_10_]).length - 1,
				 aShort11898);
	while_136_:
	    for (/**/; i_10_ <= i_11_; i_10_++) {
		for (/**/; i_12_ <= i_13_; i_12_++) {
		    long l = (aClass556_10855.aLongArrayArrayArray7473
			      [aByte10854][i_10_][i_12_]);
		    long l_14_ = 0L;
		while_135_:
		    while (l_14_ <= 48L) {
			int i_15_ = (int) (l >>> (int) l_14_ & 0xffffL);
			if (i_15_ <= 0)
			    break;
			Class561 class561
			    = aClass556_10855.aClass561Array7439[i_15_ - 1];
			for (int i_16_ = 0; i_16_ < anInt11895 * 1409643337;
			     i_16_++) {
			    if (aClass534_Sub21Array11897[i_16_]
				== class561.aClass534_Sub21_7541) {
				l_14_ += 16L;
				continue while_135_;
			    }
			}
			aClass534_Sub21Array11897
			    [(anInt11895 += -1268912391) * 1409643337 - 1]
			    = class561.aClass534_Sub21_7541;
			if (anInt11895 * 1409643337 == 4)
			    break while_136_;
			l_14_ += 16L;
		    }
		}
	    }
	    for (int i_17_ = anInt11895 * 1409643337; i_17_ < 4; i_17_++)
		aClass534_Sub21Array11897[i_17_] = null;
	    if (aByte11899 != 0) {
		int i_18_
		    = aShort11900 - -380604831 * aClass556_10855.anInt7455;
		int i_19_
		    = aShort11901 - aClass556_10855.anInt7459 * -1709472547;
		short i_20_;
		int i_21_;
		int i_22_;
		short i_23_;
		if (1 == aByte11899) {
		    if (i_19_ > i_18_) {
			i_20_ = aShort11900;
			i_21_ = aShort11901 - 1;
			i_22_ = 1 + aShort11900;
			i_23_ = aShort11901;
		    } else {
			i_20_ = aShort11900;
			i_21_ = 1 + aShort11901;
			i_22_ = aShort11900 - 1;
			i_23_ = aShort11901;
		    }
		} else if (i_19_ > -i_18_) {
		    i_20_ = aShort11900;
		    i_21_ = aShort11901 - 1;
		    i_22_ = aShort11900 - 1;
		    i_23_ = aShort11901;
		} else {
		    i_20_ = aShort11900;
		    i_21_ = aShort11901 + 1;
		    i_22_ = aShort11900 + 1;
		    i_23_ = aShort11901;
		}
		int i_24_ = 0;
	    while_138_:
		for (/**/; i_24_ < anInt11895 * 1409643337; i_24_++) {
		    long l = (aClass556_10855.aLongArrayArrayArray7473
			      [aByte10854][i_20_][i_21_]);
		    while (l != 0L) {
			Class561 class561 = (aClass556_10855.aClass561Array7439
					     [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if (class561.aClass534_Sub21_7541
			    == aClass534_Sub21Array11897[i_24_])
			    continue while_138_;
		    }
		    l = (aClass556_10855.aLongArrayArrayArray7473[aByte10854]
			 [i_22_][i_23_]);
		    while (l != 0L) {
			Class561 class561 = (aClass556_10855.aClass561Array7439
					     [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if (aClass534_Sub21Array11897[i_24_]
			    == class561.aClass534_Sub21_7541)
			    continue while_138_;
		    }
		    for (int i_25_ = i_24_;
			 i_25_ < 1409643337 * anInt11895 - 1; i_25_++)
			aClass534_Sub21Array11897[i_25_]
			    = aClass534_Sub21Array11897[1 + i_25_];
		    anInt11895 -= -1268912391;
		}
	    }
	    aBool8514 = false;
	}
	for (int i_26_ = 0; i_26_ < anInt11895 * 1409643337; i_26_++)
	    class534_sub21s[i_26_] = aClass534_Sub21Array11897[i_26_];
	return anInt11895 * 1409643337;
    }
    
    void method18483() {
	/* empty */
    }
    
    void method18484() {
	/* empty */
    }
    
    void method18485() {
	/* empty */
    }
    
    void method18486() {
	/* empty */
    }
    
    boolean method16858(byte i) {
	for (int i_27_ = aShort11900; i_27_ <= aShort11896; i_27_++) {
	    for (int i_28_ = aShort11901; i_28_ <= aShort11898; i_28_++) {
		int i_29_ = (i_27_ - -380604831 * aClass556_10855.anInt7455
			     + aClass556_10855.anInt7461 * -1213435377);
		if (i_29_ >= 0
		    && i_29_ < aClass556_10855.aBoolArrayArray7481.length) {
		    int i_30_
			= (aClass556_10855.anInt7461 * -1213435377
			   + (i_28_
			      - -1709472547 * aClass556_10855.anInt7459));
		    if (i_30_ >= 0
			&& i_30_ < aClass556_10855.aBoolArrayArray7481.length
			&& aClass556_10855.aBoolArrayArray7481[i_29_][i_30_])
			return true;
		}
	    }
	}
	return false;
    }
    
    int method16888(Class534_Sub21[] class534_sub21s) {
	if (aBool8514) {
	    anInt11895 = 0;
	    int i = Math.max(0, aShort11900);
	    int i_31_ = Math.min((aClass556_10855.aLongArrayArrayArray7473
				  [aByte10854]).length - 1,
				 aShort11896);
	    int i_32_ = Math.max(0, aShort11901);
	    int i_33_ = Math.min((aClass556_10855.aLongArrayArrayArray7473
				  [aByte10854][i]).length - 1,
				 aShort11898);
	while_140_:
	    for (/**/; i <= i_31_; i++) {
		for (/**/; i_32_ <= i_33_; i_32_++) {
		    long l = (aClass556_10855.aLongArrayArrayArray7473
			      [aByte10854][i][i_32_]);
		    long l_34_ = 0L;
		while_139_:
		    while (l_34_ <= 48L) {
			int i_35_ = (int) (l >>> (int) l_34_ & 0xffffL);
			if (i_35_ <= 0)
			    break;
			Class561 class561
			    = aClass556_10855.aClass561Array7439[i_35_ - 1];
			for (int i_36_ = 0; i_36_ < anInt11895 * 1409643337;
			     i_36_++) {
			    if (aClass534_Sub21Array11897[i_36_]
				== class561.aClass534_Sub21_7541) {
				l_34_ += 16L;
				continue while_139_;
			    }
			}
			aClass534_Sub21Array11897
			    [(anInt11895 += -1268912391) * 1409643337 - 1]
			    = class561.aClass534_Sub21_7541;
			if (anInt11895 * 1409643337 == 4)
			    break while_140_;
			l_34_ += 16L;
		    }
		}
	    }
	    for (int i_37_ = anInt11895 * 1409643337; i_37_ < 4; i_37_++)
		aClass534_Sub21Array11897[i_37_] = null;
	    if (aByte11899 != 0) {
		int i_38_
		    = aShort11900 - -380604831 * aClass556_10855.anInt7455;
		int i_39_
		    = aShort11901 - aClass556_10855.anInt7459 * -1709472547;
		short i_40_;
		int i_41_;
		int i_42_;
		short i_43_;
		if (1 == aByte11899) {
		    if (i_39_ > i_38_) {
			i_40_ = aShort11900;
			i_41_ = aShort11901 - 1;
			i_42_ = 1 + aShort11900;
			i_43_ = aShort11901;
		    } else {
			i_40_ = aShort11900;
			i_41_ = 1 + aShort11901;
			i_42_ = aShort11900 - 1;
			i_43_ = aShort11901;
		    }
		} else if (i_39_ > -i_38_) {
		    i_40_ = aShort11900;
		    i_41_ = aShort11901 - 1;
		    i_42_ = aShort11900 - 1;
		    i_43_ = aShort11901;
		} else {
		    i_40_ = aShort11900;
		    i_41_ = aShort11901 + 1;
		    i_42_ = aShort11900 + 1;
		    i_43_ = aShort11901;
		}
		int i_44_ = 0;
	    while_142_:
		for (/**/; i_44_ < anInt11895 * 1409643337; i_44_++) {
		    long l = (aClass556_10855.aLongArrayArrayArray7473
			      [aByte10854][i_40_][i_41_]);
		    while (l != 0L) {
			Class561 class561 = (aClass556_10855.aClass561Array7439
					     [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if (class561.aClass534_Sub21_7541
			    == aClass534_Sub21Array11897[i_44_])
			    continue while_142_;
		    }
		    l = (aClass556_10855.aLongArrayArrayArray7473[aByte10854]
			 [i_42_][i_43_]);
		    while (l != 0L) {
			Class561 class561 = (aClass556_10855.aClass561Array7439
					     [(int) ((l & 0xffffL) - 1L)]);
			l >>>= 16;
			if (aClass534_Sub21Array11897[i_44_]
			    == class561.aClass534_Sub21_7541)
			    continue while_142_;
		    }
		    for (int i_45_ = i_44_;
			 i_45_ < 1409643337 * anInt11895 - 1; i_45_++)
			aClass534_Sub21Array11897[i_45_]
			    = aClass534_Sub21Array11897[1 + i_45_];
		    anInt11895 -= -1268912391;
		}
	    }
	    aBool8514 = false;
	}
	for (int i = 0; i < anInt11895 * 1409643337; i++)
	    class534_sub21s[i] = aClass534_Sub21Array11897[i];
	return anInt11895 * 1409643337;
    }
    
    boolean method16889(Class185 class185) {
	return (aClass556_10855.aClass552_7427.method9065
		(aByte10853, aShort11900, aShort11896, aShort11901,
		 aShort11898, method16855(class185, (short) 9715)));
    }
    
    void method18487(int i) {
	/* empty */
    }
    
    boolean method16890(Class185 class185) {
	return (aClass556_10855.aClass552_7427.method9065
		(aByte10853, aShort11900, aShort11896, aShort11901,
		 aShort11898, method16855(class185, (short) 3446)));
    }
    
    boolean method16885() {
	for (int i = aShort11900; i <= aShort11896; i++) {
	    for (int i_46_ = aShort11901; i_46_ <= aShort11898; i_46_++) {
		int i_47_ = (i - -380604831 * aClass556_10855.anInt7455
			     + aClass556_10855.anInt7461 * -1213435377);
		if (i_47_ >= 0
		    && i_47_ < aClass556_10855.aBoolArrayArray7481.length) {
		    int i_48_
			= (aClass556_10855.anInt7461 * -1213435377
			   + (i_46_
			      - -1709472547 * aClass556_10855.anInt7459));
		    if (i_48_ >= 0
			&& i_48_ < aClass556_10855.aBoolArrayArray7481.length
			&& aClass556_10855.aBoolArrayArray7481[i_47_][i_48_])
			return true;
		}
	    }
	}
	return false;
    }
    
    boolean method16893() {
	for (int i = aShort11900; i <= aShort11896; i++) {
	    for (int i_49_ = aShort11901; i_49_ <= aShort11898; i_49_++) {
		int i_50_ = (i - -380604831 * aClass556_10855.anInt7455
			     + aClass556_10855.anInt7461 * -1213435377);
		if (i_50_ >= 0
		    && i_50_ < aClass556_10855.aBoolArrayArray7481.length) {
		    int i_51_
			= (aClass556_10855.anInt7461 * -1213435377
			   + (i_49_
			      - -1709472547 * aClass556_10855.anInt7459));
		    if (i_51_ >= 0
			&& i_51_ < aClass556_10855.aBoolArrayArray7481.length
			&& aClass556_10855.aBoolArrayArray7481[i_50_][i_51_])
			return true;
		}
	    }
	}
	return false;
    }
    
    static final void method18488(Class669 class669, int i) {
	int i_52_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (((Class15)
		Class531.aClass44_Sub7_7135.method91(i_52_, -1104697735))
	       .anInt127) * 1112381535;
    }
}
