/* Class589 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class589
{
    public static Interface65 method9870(Class534_Sub40 class534_sub40) {
	Class594 class594
	    = Class300.method5556(class534_sub40.method16527(-1537965917),
				  -1140755898);
	if (class594 == Class594.aClass594_7826)
	    return Class44_Sub16.method17358(class534_sub40, -181148453);
	if (Class594.aClass594_7825 == class594)
	    return Class534.method8893(class534_sub40, 1749082161);
	if (class594 == Class594.aClass594_7824)
	    return Class550.method9030(class534_sub40, -15132518);
	return null;
    }
    
    Class589() throws Throwable {
	throw new Error();
    }
    
    public static Interface65 method9871(Class534_Sub40 class534_sub40) {
	Class594 class594
	    = Class300.method5556(class534_sub40.method16527(1433430061),
				  -1217948945);
	if (class594 == Class594.aClass594_7826)
	    return Class44_Sub16.method17358(class534_sub40, -2034119704);
	if (Class594.aClass594_7825 == class594)
	    return Class534.method8893(class534_sub40, -1488678005);
	if (class594 == Class594.aClass594_7824)
	    return Class550.method9030(class534_sub40, 1710047795);
	return null;
    }
    
    static final void method9872(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2572
	    = Class99.method1859(string, class669, 90604096);
	class247.aBool2561 = true;
    }
    
    static final void method9873(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub2.method16018(i_0_ >> 14 & 0x3fff, i_0_ & 0x3fff,
				  887572967);
    }
    
    public static void method9874(Class185 class185, long l) {
	Class625.anInt8158 = 407378687 * Class625.anInt8163;
	Class625.anInt8163 = 0;
	Class250.method4604((byte) -109);
	Iterator iterator = Class625.aList8154.iterator();
	while (iterator.hasNext()) {
	    Class629 class629 = (Class629) iterator.next();
	    boolean bool = class629.method10391(class185, l);
	    if (!bool) {
		iterator.remove();
		OutputStream_Sub1.aClass629Array11013[(Class625.anInt8156
						       * -2056179105)]
		    = class629;
		Class625.anInt8156
		    = (1 + Class625.anInt8156 * -2056179105
		       & (Class184.anIntArray1982
			  [-1429983313 * Class625.anInt8164])) * -80762465;
	    }
	}
    }
    
    public static final void method9875(int i) {
	client.aBool11247 = true;
    }
}
