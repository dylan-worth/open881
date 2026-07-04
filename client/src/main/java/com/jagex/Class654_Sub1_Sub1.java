/* Class654_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class654_Sub1_Sub1 extends Class654_Sub1
{
    public static final int anInt11814 = 4;
    public static final int anInt11815 = 128;
    public static final int anInt11816 = 2;
    public static final int anInt11817 = 8;
    public static final int anInt11818 = 16;
    public static final int anInt11819 = 1;
    public static final int anInt11820 = 64;
    public static final int anInt11821 = 32;
    static int[] anIntArray11822 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
    public short aShort11823;
    int anInt11824 = 0;
    Class534_Sub21[] aClass534_Sub21Array11825 = new Class534_Sub21[4];
    
    boolean method16857(Class185 class185, int i) {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aClass552_7427.method9080
		(this, aByte10853,
		 ((int) class438.aFloat4864
		  >> 941710601 * aClass556_10855.anInt7422),
		 ((int) class438.aFloat4865
		  >> 941710601 * aClass556_10855.anInt7422)));
    }
    
    int method16856(Class534_Sub21[] class534_sub21s, int i) {
	if (aBool8514) {
	    Class438 class438 = method10807().aClass438_4885;
	    int i_0_ = ((int) class438.aFloat4864
			>> 941710601 * aClass556_10855.anInt7422);
	    int i_1_ = ((int) class438.aFloat4865
			>> aClass556_10855.anInt7422 * 941710601);
	    int i_2_ = 0;
	    if (aClass556_10855.anInt7455 * -380604831 == i_0_)
		i_2_++;
	    else if (aClass556_10855.anInt7455 * -380604831 < i_0_)
		i_2_ += 2;
	    if (aClass556_10855.anInt7459 * -1709472547 == i_1_)
		i_2_ += 3;
	    else if (-1709472547 * aClass556_10855.anInt7459 > i_1_)
		i_2_ += 6;
	    int i_3_ = anIntArray11822[i_2_];
	    if (0 == (aShort11823 & i_3_)) {
		if (1 == aShort11823 && i_0_ > 0)
		    i_0_--;
		else if (aShort11823 == 4
			 && i_0_ <= aClass556_10855.anInt7435 * 1183912005)
		    i_0_++;
		else if (aShort11823 == 8 && i_1_ > 0)
		    i_1_--;
		else if (aShort11823 == 2
			 && i_1_ <= 60330541 * aClass556_10855.anInt7470)
		    i_1_++;
		else if (16 == aShort11823 && i_0_ > 0
			 && i_1_ <= aClass556_10855.anInt7470 * 60330541) {
		    i_0_--;
		    i_1_++;
		} else if (32 == aShort11823
			   && i_0_ <= aClass556_10855.anInt7435 * 1183912005
			   && i_1_ <= 60330541 * aClass556_10855.anInt7470) {
		    i_0_++;
		    i_1_++;
		} else if (128 == aShort11823 && i_0_ > 0 && i_1_ > 0) {
		    i_0_--;
		    i_1_--;
		} else if (aShort11823 == 64
			   && i_0_ <= 1183912005 * aClass556_10855.anInt7435
			   && i_1_ > 0) {
		    i_0_++;
		    i_1_--;
		} else
		    throw new RuntimeException("");
	    }
	    anInt11824 = method16860(i_0_, i_1_, aClass534_Sub21Array11825,
				     -1161496226) * -891850863;
	    aBool8514 = false;
	}
	for (int i_4_ = 0; i_4_ < -717409935 * anInt11824; i_4_++)
	    class534_sub21s[i_4_] = aClass534_Sub21Array11825[i_4_];
	return anInt11824 * -717409935;
    }
    
    Class654_Sub1_Sub1(Class556 class556, int i, int i_5_, int i_6_, int i_7_,
		       int i_8_, int i_9_) {
	super(class556);
	aByte10854 = (byte) i_7_;
	aByte10853 = (byte) i_8_;
	aShort11823 = (short) i_9_;
	method10809(new Class438((float) i, (float) i_5_, (float) i_6_));
	for (int i_10_ = 0; i_10_ < 4; i_10_++)
	    aClass534_Sub21Array11825[i_10_] = null;
    }
    
    boolean method16858(byte i) {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aBoolArrayArray7481
		[(((int) class438.aFloat4864
		   >> 941710601 * aClass556_10855.anInt7422)
		  - -380604831 * aClass556_10855.anInt7455
		  + -1213435377 * aClass556_10855.anInt7461)]
		[(-1213435377 * aClass556_10855.anInt7461
		  + (((int) class438.aFloat4865
		      >> 941710601 * aClass556_10855.anInt7422)
		     - -1709472547 * aClass556_10855.anInt7459))]);
    }
    
    int method16888(Class534_Sub21[] class534_sub21s) {
	if (aBool8514) {
	    Class438 class438 = method10807().aClass438_4885;
	    int i = ((int) class438.aFloat4864
		     >> 941710601 * aClass556_10855.anInt7422);
	    int i_11_ = ((int) class438.aFloat4865
			 >> aClass556_10855.anInt7422 * 941710601);
	    int i_12_ = 0;
	    if (aClass556_10855.anInt7455 * -380604831 == i)
		i_12_++;
	    else if (aClass556_10855.anInt7455 * -380604831 < i)
		i_12_ += 2;
	    if (aClass556_10855.anInt7459 * -1709472547 == i_11_)
		i_12_ += 3;
	    else if (-1709472547 * aClass556_10855.anInt7459 > i_11_)
		i_12_ += 6;
	    int i_13_ = anIntArray11822[i_12_];
	    if (0 == (aShort11823 & i_13_)) {
		if (1 == aShort11823 && i > 0)
		    i--;
		else if (aShort11823 == 4
			 && i <= aClass556_10855.anInt7435 * 1183912005)
		    i++;
		else if (aShort11823 == 8 && i_11_ > 0)
		    i_11_--;
		else if (aShort11823 == 2
			 && i_11_ <= 60330541 * aClass556_10855.anInt7470)
		    i_11_++;
		else if (16 == aShort11823 && i > 0
			 && i_11_ <= aClass556_10855.anInt7470 * 60330541) {
		    i--;
		    i_11_++;
		} else if (32 == aShort11823
			   && i <= aClass556_10855.anInt7435 * 1183912005
			   && i_11_ <= 60330541 * aClass556_10855.anInt7470) {
		    i++;
		    i_11_++;
		} else if (128 == aShort11823 && i > 0 && i_11_ > 0) {
		    i--;
		    i_11_--;
		} else if (aShort11823 == 64
			   && i <= 1183912005 * aClass556_10855.anInt7435
			   && i_11_ > 0) {
		    i++;
		    i_11_--;
		} else
		    throw new RuntimeException("");
	    }
	    anInt11824 = method16860(i, i_11_, aClass534_Sub21Array11825,
				     -1278573472) * -891850863;
	    aBool8514 = false;
	}
	for (int i = 0; i < -717409935 * anInt11824; i++)
	    class534_sub21s[i] = aClass534_Sub21Array11825[i];
	return anInt11824 * -717409935;
    }
    
    boolean method16889(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aClass552_7427.method9080
		(this, aByte10853,
		 ((int) class438.aFloat4864
		  >> 941710601 * aClass556_10855.anInt7422),
		 ((int) class438.aFloat4865
		  >> 941710601 * aClass556_10855.anInt7422)));
    }
    
    boolean method16890(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aClass552_7427.method9080
		(this, aByte10853,
		 ((int) class438.aFloat4864
		  >> 941710601 * aClass556_10855.anInt7422),
		 ((int) class438.aFloat4865
		  >> 941710601 * aClass556_10855.anInt7422)));
    }
    
    boolean method16891(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aClass552_7427.method9080
		(this, aByte10853,
		 ((int) class438.aFloat4864
		  >> 941710601 * aClass556_10855.anInt7422),
		 ((int) class438.aFloat4865
		  >> 941710601 * aClass556_10855.anInt7422)));
    }
    
    boolean method16885() {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aBoolArrayArray7481
		[(((int) class438.aFloat4864
		   >> 941710601 * aClass556_10855.anInt7422)
		  - -380604831 * aClass556_10855.anInt7455
		  + -1213435377 * aClass556_10855.anInt7461)]
		[(-1213435377 * aClass556_10855.anInt7461
		  + (((int) class438.aFloat4865
		      >> 941710601 * aClass556_10855.anInt7422)
		     - -1709472547 * aClass556_10855.anInt7459))]);
    }
    
    boolean method16893() {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aBoolArrayArray7481
		[(((int) class438.aFloat4864
		   >> 941710601 * aClass556_10855.anInt7422)
		  - -380604831 * aClass556_10855.anInt7455
		  + -1213435377 * aClass556_10855.anInt7461)]
		[(-1213435377 * aClass556_10855.anInt7461
		  + (((int) class438.aFloat4865
		      >> 941710601 * aClass556_10855.anInt7422)
		     - -1709472547 * aClass556_10855.anInt7459))]);
    }
}
