/* Class276 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class276
{
    public String aString3042;
    public String aString3043;
    
    void method5152(Class263 class263) {
	aString3042 = class263.method4826(-1557086004);
	aString3043 = class263.method4826(1921957664);
    }
    
    void method5153(Class263 class263, short i) {
	aString3042 = class263.method4826(-932554061);
	aString3043 = class263.method4826(-432334855);
    }
    
    Class276() {
	/* empty */
    }
    
    void method5154(Class263 class263) {
	aString3042 = class263.method4826(1944504837);
	aString3043 = class263.method4826(1775151423);
    }
    
    static void method5155
	(Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1,
	 boolean bool, int i) {
	if (324852453 * Class72.anInt765 < 407) {
	    Class307 class307 = class654_sub1_sub5_sub1_sub1.aClass307_12204;
	    String string = class654_sub1_sub5_sub1_sub1.aString12201;
	    if (null != class307.anIntArray3284) {
		class307
		    = class307.method5615(Class78.aClass103_825,
					  Class78.aClass103_825, -1466068515);
		if (class307 == null)
		    return;
		string = class307.aString3337;
	    }
	    if (class307.aBool3313) {
		if (class654_sub1_sub5_sub1_sub1.anInt12192 * 1691897137
		    != 0) {
		    String string_0_
			= (client.aClass675_11016 == Class675.aClass675_8635
			   ? Class58.aClass58_597.method1245((Class539
							      .aClass672_7171),
							     (byte) -1)
			   : Class58.aClass58_595.method1245((Class539
							      .aClass672_7171),
							     (byte) -44));
		    string = new StringBuilder().append(string).append
				 (Class292.method5304
				  ((class654_sub1_sub5_sub1_sub1.anInt12192
				    * 1691897137),
				   (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				    .anInt12210) * 1423663301,
				   -1919841344))
				 .append
				 (Class29.aString261).append
				 (string_0_).append
				 (1691897137
				  * class654_sub1_sub5_sub1_sub1.anInt12192)
				 .append
				 (Class29.aString259).toString();
		}
		if (client.aBool11218 && !bool) {
		    Class90 class90
			= (Class90) (-1 != 410979031 * Class392_Sub1.anInt10224
				     ? (Class534_Sub11_Sub13
					    .aClass44_Sub22_11730.method91
					(Class392_Sub1.anInt10224 * 410979031,
					 -1979113053))
				     : null);
		    if (0 != (Class200_Sub14.anInt9950 * 460977285 & 0x2)
			&& (class90 == null
			    || (class307.method5613((Class392_Sub1.anInt10224
						     * 410979031),
						    (class90.anInt888
						     * 263946597),
						    -1606188338)
				!= class90.anInt888 * 263946597)))
			Class112.method2016
			    (client.aString11221,
			     new StringBuilder().append
				 (client.aString11222).append
				 (" ").append
				 (Class29.aString263).append
				 (" ").append
				 (Class154.method2575(16776960, -1444960514))
				 .append
				 (string).toString(),
			     Class460.anInt5069 * -731032933, 8, -1,
			     (long) (1126388985 * (class654_sub1_sub5_sub1_sub1
						   .anInt11922)),
			     0, 0, true, false,
			     (long) (1126388985 * (class654_sub1_sub5_sub1_sub1
						   .anInt11922)),
			     false, (short) 29787);
		}
		if (!bool) {
		    String[] strings = class307.aStringArray3286;
		    boolean bool_1_ = false;
		    if (client.aBool11230)
			strings = Class200.method3857(strings, (byte) 84);
		    if (strings != null) {
		    while_154_:
			for (int i_2_ = strings.length - 1; i_2_ >= 0;
			     i_2_--) {
			    if (strings[i_2_] != null
				&& 0 == ((-1134759455
					  * (class654_sub1_sub5_sub1_sub1
					     .anInt12208))
					 & 1 << i_2_)) {
				short i_3_ = client.aShortArray11286[i_2_];
				int i_4_ = client.anInt11216 * 2068410197;
				int i_5_
				    = class307.method5617(i_2_, -1065329916);
				if (i_5_ != -1)
				    i_4_ = i_5_;
				boolean bool_6_
				    = (strings[i_2_].equalsIgnoreCase
				       (Class58.aClass58_590.method1245
					(Class539.aClass672_7171,
					 (byte) -103)));
				boolean bool_7_
				    = (strings[i_2_].equalsIgnoreCase
				       (Class58.aClass58_589.method1245
					(Class539.aClass672_7171,
					 (byte) -53)));
				if (bool_6_ || bool_7_) {
				    if (bool_1_)
					continue;
				    switch (client.aClass635_11328.anInt8301
					    * 294429925) {
				    case 1:
					bool_1_ = true;
					continue while_154_;
				    case 2:
				    case 3:
					if (1 == class307.aByte3340)
					    bool_1_ = true;
					else
					    break;
					continue while_154_;
				    case 0:
					if (!bool_6_)
					    break;
					continue while_154_;
				    }
				    if (bool_6_)
					i_4_ = 235545833 * class307.anInt3299;
				}
				Class112.method2016
				    (strings[i_2_],
				     new StringBuilder().append
					 (Class154.method2575(16776960,
							      -1920310756))
					 .append
					 (string).toString(),
				     i_4_, i_3_, -1,
				     (long) (1126388985
					     * (class654_sub1_sub5_sub1_sub1
						.anInt11922)),
				     0, 0, true, false,
				     (long) (1126388985
					     * (class654_sub1_sub5_sub1_sub1
						.anInt11922)),
				     false, (short) 30361);
			    }
			}
			if (bool_1_) {
			    for (int i_8_ = 0; i_8_ < strings.length; i_8_++) {
				if (null != strings[i_8_]
				    && ((class654_sub1_sub5_sub1_sub1
					 .anInt12208) * -1134759455
					& 1 << i_8_) == 0) {
				    boolean bool_9_
					= (strings[i_8_].equalsIgnoreCase
					   (Class58.aClass58_590.method1245
					    (Class539.aClass672_7171,
					     (byte) -3)));
				    boolean bool_10_
					= (strings[i_8_].equalsIgnoreCase
					   (Class58.aClass58_589.method1245
					    (Class539.aClass672_7171,
					     (byte) -107)));
				    if (bool_9_ || bool_10_) {
					short i_11_
					    = client.aShortArray11286[i_8_];
					int i_12_
					    = client.anInt11216 * 2068410197;
					int i_13_
					    = class307.method5617(i_8_,
								  -477858280);
					if (i_13_ != -1)
					    i_12_ = i_13_;
					if ((Class635.aClass635_8302
					     == client.aClass635_11328)
					    || ((Class635.aClass635_8298
						 == client.aClass635_11328)
						&& ((1691897137
						     * (class654_sub1_sub5_sub1_sub1
							.anInt12192))
						    > ((Class322
							.aClass654_Sub1_Sub5_Sub1_Sub2_3419
							.anInt12210)
						       * 1423663301))))
					    i_11_ += 2000;
					if (bool_9_)
					    i_12_ = (235545833
						     * class307.anInt3299);
					Class112.method2016
					    (strings[i_8_],
					     new StringBuilder().append
						 (Class154.method2575
						  (16776960, -1262061936))
						 .append
						 (string).toString(),
					     i_12_, i_11_, -1,
					     (long) (1126388985
						     * (class654_sub1_sub5_sub1_sub1
							.anInt11922)),
					     0, 0, true, false,
					     (long) ((class654_sub1_sub5_sub1_sub1
						      .anInt11922)
						     * 1126388985),
					     false, (short) 10407);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    static final void method5156(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass214_11359.method4029(175298632);
    }
    
    static final void method5157(Class669 class669, int i) {
	Class531.method8860(1910954824);
    }
    
    static final void method5158(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class499.method8270(class247, class243, class669, -268365645);
    }
}
