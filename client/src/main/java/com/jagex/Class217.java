/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class217 implements Interface28
{
    Class213 this$0;
    int anInt2301;
    Class212 aClass212_2302;
    
    Class217(Class213 class213, Class534_Sub40 class534_sub40) {
	this$0 = class213;
	anInt2301 = class534_sub40.method16529((byte) 1) * 601991867;
	aClass212_2302 = new Class212(class534_sub40, false, false,
				      class213.anInterface27_2280);
    }
    
    public void method173(Class214 class214, int i) {
	class214.method4049(806292083 * anInt2301, aClass212_2302, (byte) -22);
    }
    
    public void method172(Class214 class214) {
	class214.method4049(806292083 * anInt2301, aClass212_2302, (byte) -24);
    }
    
    public void method174(Class214 class214) {
	class214.method4049(806292083 * anInt2301, aClass212_2302, (byte) 11);
    }
    
    public static Class305 method4114(int i, int i_0_) {
	if (-1861794503 * Class305.aClass305_3266.anInt3269 == i)
	    return Class305.aClass305_3266;
	if (i == Class305.aClass305_3265.anInt3269 * -1861794503)
	    return Class305.aClass305_3265;
	if (-1861794503 * Class305.aClass305_3268.anInt3269 == i)
	    return Class305.aClass305_3268;
	if (-1861794503 * Class305.aClass305_3267.anInt3269 == i)
	    return Class305.aClass305_3267;
	if (Class305.aClass305_3264.anInt3269 * -1861794503 == i)
	    return Class305.aClass305_3264;
	return null;
    }
    
    static boolean method4115(int i) {
	Class680.anInt8668 = -663357284;
	Class65.aClass100_658 = client.aClass100_11264;
	return Class593.method9900((5952060205682133295L * Class65.aLong663
				    == -1L),
				   true, "", "",
				   5952060205682133295L * Class65.aLong663);
    }
    
    static String method4116(String string, boolean bool, byte i) {
	String string_1_ = bool ? "https://" : "http://";
	if (client.aClass665_11211 == Class665.aClass665_8558)
	    string = new StringBuilder().append(string).append("-wtrc")
			 .toString();
	else if (client.aClass665_11211 == Class665.aClass665_8572)
	    string = new StringBuilder().append(string).append("-wtqa")
			 .toString();
	else if (client.aClass665_11211 == Class665.aClass665_8570)
	    string = new StringBuilder().append(string).append("-wtwip")
			 .toString();
	else if (Class665.aClass665_8562 == client.aClass665_11211)
	    string
		= new StringBuilder().append(string).append("-wti").toString();
	else if (Class665.aClass665_8566 == client.aClass665_11211)
	    string = new StringBuilder().append(string).append("-demo")
			 .toString();
	else if (Class665.aClass665_8559 == client.aClass665_11211)
	    string = "local";
	String string_2_ = "";
	if (null != client.aString11130)
	    string_2_ = new StringBuilder().append("/p=").append
			    (client.aString11130).toString();
	String string_3_ = new StringBuilder().append
			       (client.aClass675_11016.aString8640).append
			       (".com").toString();
	return new StringBuilder().append(string_1_).append(string).append
		   (".").append
		   (string_3_).append
		   ("/l=").append
		   (-473969159 * Class539.aClass672_7171.anInt8630).append
		   ("/a=").append
		   (client.anInt11020 * 1844562269).append
		   (string_2_).append
		   ("/").toString();
    }
}
