/* Exception_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Exception_Sub3 extends Exception
{
    public String aString11405;
    public int anInt11406;
    
    public Exception_Sub3(int i, String string) {
	this(i, string, null);
    }
    
    public Exception_Sub3(int i, String string, Throwable throwable) {
	super(throwable);
	aString11405 = string;
	anInt11406 = i * -1985666287;
    }
    
    public static void method17943(byte i) {
	if (client.aBool11218) {
	    Class247 class247
		= Class81.method1637(-1808298539 * Class130.anInt1525,
				     -985352023 * client.anInt11219,
				     1261389090);
	    if (null != class247 && class247.anObjectArray2440 != null) {
		Class534_Sub41 class534_sub41 = new Class534_Sub41();
		class534_sub41.aClass247_10818 = class247;
		class534_sub41.anObjectArray10819 = class247.anObjectArray2440;
		Class94.method1764(class534_sub41, 1550369059);
	    }
	    client.anInt11215 = 411567433;
	    client.anInt11170 = -391845725;
	    client.aBool11218 = false;
	    if (class247 != null)
		Class454.method7416(class247, -1486681545);
	}
    }
}
