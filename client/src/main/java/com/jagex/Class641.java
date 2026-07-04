/* Class641 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class641
{
    public volatile int anInt8338 = -1659133145;
    volatile String aString8339;
    static int anInt8340;
    public static int anInt8341;
    
    Class641(String string) {
	aString8339 = string;
    }
    
    static final void method10600(Class247 class247, Class243 class243,
				  Class669 class669, byte i) {
	class247.aString2551
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
    }
    
    public static final void method10601(String string, boolean bool, int i) {
	int i_0_ = client.aBool11296 ? 400 : 100;
	if (string != null) {
	    if (client.anInt11329 * 2103713403 >= i_0_)
		Class553.method9105
		    (4,
		     (client.aBool11296
		      ? Class58.aClass58_608
			    .method1245(Class539.aClass672_7171, (byte) -3)
		      : Class58.aClass58_500
			    .method1245(Class539.aClass672_7171, (byte) -49)),
		     -2122168838);
	    else {
		String string_1_
		    = Class465.method7570(string, Class39.aClass76_307,
					  (byte) 50);
		if (string_1_ != null) {
		    for (int i_2_ = 0; i_2_ < 2103713403 * client.anInt11329;
			 i_2_++) {
			Class33 class33 = client.aClass33Array11299[i_2_];
			String string_3_
			    = Class465.method7570(class33.aString273,
						  Class39.aClass76_307,
						  (byte) -21);
			if (null != string_3_ && string_3_.equals(string_1_)) {
			    Class553.method9105(4,
						new StringBuilder().append
						    (string).append
						    (Class58.aClass58_610
							 .method1245
						     (Class539.aClass672_7171,
						      (byte) -40))
						    .toString(),
						-2122168838);
			    return;
			}
			if (class33.aString275 != null) {
			    String string_4_
				= Class465.method7570(class33.aString275,
						      Class39.aClass76_307,
						      (byte) -62);
			    if (string_4_ != null
				&& string_4_.equals(string_1_)) {
				Class553.method9105(4,
						    new StringBuilder().append
							(string).append
							(Class58
							     .aClass58_610
							     .method1245
							 ((Class539
							   .aClass672_7171),
							  (byte) -1))
							.toString(),
						    -2122168838);
				return;
			    }
			}
		    }
		    for (int i_5_ = 0; i_5_ < client.anInt11324 * -1979292205;
			 i_5_++) {
			Class28 class28 = client.aClass28Array11327[i_5_];
			String string_6_
			    = Class465.method7570(class28.aString257,
						  Class39.aClass76_307,
						  (byte) 4);
			if (null != string_6_ && string_6_.equals(string_1_)) {
			    Class553.method9105(4,
						new StringBuilder().append
						    (Class58.aClass58_616
							 .method1245
						     (Class539.aClass672_7171,
						      (byte) -118))
						    .append
						    (string).append
						    (Class58.aClass58_617
							 .method1245
						     (Class539.aClass672_7171,
						      (byte) -119))
						    .toString(),
						-2122168838);
			    return;
			}
			if (class28.aString250 != null) {
			    String string_7_
				= Class465.method7570(class28.aString250,
						      Class39.aClass76_307,
						      (byte) -112);
			    if (string_7_ != null
				&& string_7_.equals(string_1_)) {
				Class553.method9105
				    (4, new StringBuilder().append
					    (Class58.aClass58_616.method1245
					     (Class539.aClass672_7171,
					      (byte) -21))
					    .append
					    (string).append
					    (Class58.aClass58_617.method1245
					     (Class539.aClass672_7171,
					      (byte) -33))
					    .toString(), -2122168838);
				return;
			    }
			}
		    }
		    if (Class465.method7570
			    ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			      .aString12211),
			     Class39.aClass76_307, (byte) 5)
			    .equals(string_1_))
			Class553.method9105(4, (Class58.aClass58_612.method1245
						(Class539.aClass672_7171,
						 (byte) -120)), -2122168838);
		    else {
			Class100 class100 = Class201.method3864(2095398292);
			Class534_Sub19 class534_sub19
			    = Class346.method6128(Class404.aClass404_4257,
						  class100.aClass13_1183,
						  1341391005);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16506
			    (Class668.method11029(string, (byte) 0) + 1,
			     2023560317);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16713(string, 600182643);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16506(bool ? 1 : 0, 959897813);
			class100.method1863(class534_sub19, (byte) 44);
		    }
		}
	    }
	}
    }
    
    static void method10602(Class534_Sub40 class534_sub40, int i, byte i_8_) {
	if (Class498.aClass38_5580 != null) {
	    try {
		Class498.aClass38_5580.method947(0L);
		Class498.aClass38_5580.method951((class534_sub40
						  .aByteArray10810),
						 i, 24, -1218153483);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public static Class534_Sub18_Sub7 method10603(byte i) {
	return Class251.aClass534_Sub18_Sub7_2653;
    }
}
