/* Class499 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class499
{
    boolean aBool5593;
    public static Class499 aClass499_5594;
    public static Class499 aClass499_5595;
    static Class499 aClass499_5596;
    public static Class499 aClass499_5597 = new Class499(false, false);
    public static Class499 aClass499_5598;
    static Class499 aClass499_5599;
    public static Class499 aClass499_5600;
    boolean aBool5601;
    static Class499 aClass499_5602;
    static boolean aBool5603;
    
    public boolean method8263() {
	return aBool5593;
    }
    
    boolean method8264(int i) {
	return aBool5601;
    }
    
    public boolean method8265(byte i) {
	return aBool5593;
    }
    
    static {
	aClass499_5594 = new Class499(true, false);
	aClass499_5595 = new Class499(false, false);
	aClass499_5598 = new Class499(true, false);
	aClass499_5596 = new Class499(true, false);
	aClass499_5602 = new Class499(true, true);
	aClass499_5599 = new Class499(true, true);
	aClass499_5600 = new Class499(false, false);
    }
    
    boolean method8266() {
	return aBool5601;
    }
    
    boolean method8267() {
	return aBool5601;
    }
    
    boolean method8268() {
	return aBool5601;
    }
    
    Class499(boolean bool, boolean bool_0_) {
	aBool5601 = bool;
	aBool5593 = bool_0_;
    }
    
    public boolean method8269() {
	return aBool5593;
    }
    
    static final void method8270(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2569
	    = Class99.method1859(string, class669, 931424388);
	class247.aBool2561 = true;
    }
    
    static final void method8271(Class669 class669, short i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_1_, 1923623100);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_1_ >> 16];
	Class105.method1938(class247, class243, class669, (byte) 91);
    }
    
    static final void method8272(int i) {
	Iterator iterator = client.aClass9_11322.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub18_Sub5 class534_sub18_sub5
		= (Class534_Sub18_Sub5) iterator.next();
	    Class654_Sub1_Sub5_Sub5 class654_sub1_sub5_sub5
		= class534_sub18_sub5.aClass654_Sub1_Sub5_Sub5_11651;
	    if (client.aClass512_11100.method8424((byte) 75) != null
		&& class654_sub1_sub5_sub5.method18787(-1882073015))
		client.aClass512_11100.method8424((byte) 113)
		    .method9246(class654_sub1_sub5_sub5, true, (byte) 8);
	}
    }
    
    static boolean method8273(int i) {
	if (-1 != Class65.anInt662 * 1832109523)
	    return Class649.method10717(-860072295);
	return Class285.method5258(Class65.aString694, Class65.aString665,
				   (byte) 1);
    }
}
