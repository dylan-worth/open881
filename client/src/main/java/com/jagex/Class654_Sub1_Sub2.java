/* Class654_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class654_Sub1_Sub2 extends Class654_Sub1
{
    public short aShort11864;
    int anInt11865 = 0;
    Class534_Sub21[] aClass534_Sub21Array11866 = new Class534_Sub21[4];
    
    boolean method16890(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aClass552_7427.method9062
		(aByte10853,
		 ((int) class438.aFloat4864
		  >> aClass556_10855.anInt7422 * 941710601),
		 ((int) class438.aFloat4865
		  >> aClass556_10855.anInt7422 * 941710601)));
    }
    
    int method16856(Class534_Sub21[] class534_sub21s, int i) {
	if (aBool8514) {
	    Class438 class438 = method10807().aClass438_4885;
	    anInt11865
		= (method16860(((int) class438.aFloat4864
				>> 941710601 * aClass556_10855.anInt7422),
			       ((int) class438.aFloat4865
				>> 941710601 * aClass556_10855.anInt7422),
			       aClass534_Sub21Array11866, -651448671)
		   * -2139099123);
	    aBool8514 = false;
	}
	for (int i_0_ = 0; i_0_ < anInt11865 * 2141576901; i_0_++)
	    class534_sub21s[i_0_] = aClass534_Sub21Array11866[i_0_];
	return anInt11865 * 2141576901;
    }
    
    boolean method16857(Class185 class185, int i) {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aClass552_7427.method9062
		(aByte10853,
		 ((int) class438.aFloat4864
		  >> aClass556_10855.anInt7422 * 941710601),
		 ((int) class438.aFloat4865
		  >> aClass556_10855.anInt7422 * 941710601)));
    }
    
    int method16888(Class534_Sub21[] class534_sub21s) {
	if (aBool8514) {
	    Class438 class438 = method10807().aClass438_4885;
	    anInt11865
		= (method16860(((int) class438.aFloat4864
				>> 941710601 * aClass556_10855.anInt7422),
			       ((int) class438.aFloat4865
				>> 941710601 * aClass556_10855.anInt7422),
			       aClass534_Sub21Array11866, -514246172)
		   * -2139099123);
	    aBool8514 = false;
	}
	for (int i = 0; i < anInt11865 * 2141576901; i++)
	    class534_sub21s[i] = aClass534_Sub21Array11866[i];
	return anInt11865 * 2141576901;
    }
    
    boolean method16893() {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aBoolArrayArray7481
		[(-1213435377 * aClass556_10855.anInt7461
		  + (((int) class438.aFloat4864
		      >> 941710601 * aClass556_10855.anInt7422)
		     - -380604831 * aClass556_10855.anInt7455))]
		[(((int) class438.aFloat4865
		   >> aClass556_10855.anInt7422 * 941710601)
		  - aClass556_10855.anInt7459 * -1709472547
		  + -1213435377 * aClass556_10855.anInt7461)]);
    }
    
    boolean method16889(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aClass552_7427.method9062
		(aByte10853,
		 ((int) class438.aFloat4864
		  >> aClass556_10855.anInt7422 * 941710601),
		 ((int) class438.aFloat4865
		  >> aClass556_10855.anInt7422 * 941710601)));
    }
    
    boolean method16858(byte i) {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aBoolArrayArray7481
		[(-1213435377 * aClass556_10855.anInt7461
		  + (((int) class438.aFloat4864
		      >> 941710601 * aClass556_10855.anInt7422)
		     - -380604831 * aClass556_10855.anInt7455))]
		[(((int) class438.aFloat4865
		   >> aClass556_10855.anInt7422 * 941710601)
		  - aClass556_10855.anInt7459 * -1709472547
		  + -1213435377 * aClass556_10855.anInt7461)]);
    }
    
    boolean method16891(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aClass552_7427.method9062
		(aByte10853,
		 ((int) class438.aFloat4864
		  >> aClass556_10855.anInt7422 * 941710601),
		 ((int) class438.aFloat4865
		  >> aClass556_10855.anInt7422 * 941710601)));
    }
    
    boolean method16885() {
	Class438 class438 = method10807().aClass438_4885;
	return (aClass556_10855.aBoolArrayArray7481
		[(-1213435377 * aClass556_10855.anInt7461
		  + (((int) class438.aFloat4864
		      >> 941710601 * aClass556_10855.anInt7422)
		     - -380604831 * aClass556_10855.anInt7455))]
		[(((int) class438.aFloat4865
		   >> aClass556_10855.anInt7422 * 941710601)
		  - aClass556_10855.anInt7459 * -1709472547
		  + -1213435377 * aClass556_10855.anInt7461)]);
    }
    
    Class654_Sub1_Sub2(Class556 class556, int i, int i_1_, int i_2_, int i_3_,
		       int i_4_, int i_5_) {
	super(class556);
	aByte10854 = (byte) i_3_;
	aByte10853 = (byte) i_4_;
	aShort11864 = (short) i_5_;
	method10809(new Class438((float) i, (float) i_1_, (float) i_2_));
	for (int i_6_ = 0; i_6_ < 4; i_6_++)
	    aClass534_Sub21Array11866[i_6_] = null;
    }
}
