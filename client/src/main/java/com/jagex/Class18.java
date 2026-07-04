/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class18 implements Iterator
{
    int anInt203;
    Class9 aClass9_204;
    public static int anInt205;
    Class534 aClass534_206 = null;
    Class534 aClass534_207;
    static int anInt208;
    
    public Object next() {
	if (aClass9_204.aClass534Array63[anInt203 * 2120112625 - 1]
	    != aClass534_207) {
	    Class534 class534 = aClass534_207;
	    aClass534_207 = class534.aClass534_7159;
	    aClass534_206 = class534;
	    return class534;
	}
	while (2120112625 * anInt203 < -393701507 * aClass9_204.anInt64) {
	    Class534 class534
		= (aClass9_204.aClass534Array63
		   [(anInt203 += -373459183) * 2120112625 - 1].aClass534_7159);
	    if (class534
		!= aClass9_204.aClass534Array63[anInt203 * 2120112625 - 1]) {
		aClass534_207 = class534.aClass534_7159;
		aClass534_206 = class534;
		return class534;
	    }
	}
	return null;
    }
    
    void method777(byte i) {
	aClass534_207 = aClass9_204.aClass534Array63[0].aClass534_7159;
	anInt203 = -373459183;
	aClass534_206 = null;
    }
    
    void method778() {
	aClass534_207 = aClass9_204.aClass534Array63[0].aClass534_7159;
	anInt203 = -373459183;
	aClass534_206 = null;
    }
    
    public Object method779() {
	if (aClass9_204.aClass534Array63[anInt203 * 2120112625 - 1]
	    != aClass534_207) {
	    Class534 class534 = aClass534_207;
	    aClass534_207 = class534.aClass534_7159;
	    aClass534_206 = class534;
	    return class534;
	}
	while (2120112625 * anInt203 < -393701507 * aClass9_204.anInt64) {
	    Class534 class534
		= (aClass9_204.aClass534Array63
		   [(anInt203 += -373459183) * 2120112625 - 1].aClass534_7159);
	    if (class534
		!= aClass9_204.aClass534Array63[anInt203 * 2120112625 - 1]) {
		aClass534_207 = class534.aClass534_7159;
		aClass534_206 = class534;
		return class534;
	    }
	}
	return null;
    }
    
    public boolean hasNext() {
	if (aClass534_207
	    != aClass9_204.aClass534Array63[2120112625 * anInt203 - 1])
	    return true;
	while (2120112625 * anInt203 < -393701507 * aClass9_204.anInt64) {
	    if ((aClass9_204.aClass534Array63
		 [(anInt203 += -373459183) * 2120112625 - 1].aClass534_7159)
		!= aClass9_204.aClass534Array63[anInt203 * 2120112625 - 1]) {
		aClass534_207 = (aClass9_204.aClass534Array63
				 [2120112625 * anInt203 - 1].aClass534_7159);
		return true;
	    }
	    aClass534_207
		= aClass9_204.aClass534Array63[2120112625 * anInt203 - 1];
	}
	return false;
    }
    
    public Class18(Class9 class9) {
	aClass9_204 = class9;
	method777((byte) 14);
    }
    
    public boolean method780() {
	if (aClass534_207
	    != aClass9_204.aClass534Array63[2120112625 * anInt203 - 1])
	    return true;
	while (2120112625 * anInt203 < -393701507 * aClass9_204.anInt64) {
	    if ((aClass9_204.aClass534Array63
		 [(anInt203 += -373459183) * 2120112625 - 1].aClass534_7159)
		!= aClass9_204.aClass534Array63[anInt203 * 2120112625 - 1]) {
		aClass534_207 = (aClass9_204.aClass534Array63
				 [2120112625 * anInt203 - 1].aClass534_7159);
		return true;
	    }
	    aClass534_207
		= aClass9_204.aClass534Array63[2120112625 * anInt203 - 1];
	}
	return false;
    }
    
    public boolean method781() {
	if (aClass534_207
	    != aClass9_204.aClass534Array63[2120112625 * anInt203 - 1])
	    return true;
	while (2120112625 * anInt203 < -393701507 * aClass9_204.anInt64) {
	    if ((aClass9_204.aClass534Array63
		 [(anInt203 += -373459183) * 2120112625 - 1].aClass534_7159)
		!= aClass9_204.aClass534Array63[anInt203 * 2120112625 - 1]) {
		aClass534_207 = (aClass9_204.aClass534Array63
				 [2120112625 * anInt203 - 1].aClass534_7159);
		return true;
	    }
	    aClass534_207
		= aClass9_204.aClass534Array63[2120112625 * anInt203 - 1];
	}
	return false;
    }
    
    public void remove() {
	if (aClass534_206 == null)
	    throw new IllegalStateException();
	aClass534_206.method8892((byte) 1);
	aClass534_206 = null;
    }
    
    public boolean method782() {
	if (aClass534_207
	    != aClass9_204.aClass534Array63[2120112625 * anInt203 - 1])
	    return true;
	while (2120112625 * anInt203 < -393701507 * aClass9_204.anInt64) {
	    if ((aClass9_204.aClass534Array63
		 [(anInt203 += -373459183) * 2120112625 - 1].aClass534_7159)
		!= aClass9_204.aClass534Array63[anInt203 * 2120112625 - 1]) {
		aClass534_207 = (aClass9_204.aClass534Array63
				 [2120112625 * anInt203 - 1].aClass534_7159);
		return true;
	    }
	    aClass534_207
		= aClass9_204.aClass534Array63[2120112625 * anInt203 - 1];
	}
	return false;
    }
    
    public Object method783() {
	if (aClass9_204.aClass534Array63[anInt203 * 2120112625 - 1]
	    != aClass534_207) {
	    Class534 class534 = aClass534_207;
	    aClass534_207 = class534.aClass534_7159;
	    aClass534_206 = class534;
	    return class534;
	}
	while (2120112625 * anInt203 < -393701507 * aClass9_204.anInt64) {
	    Class534 class534
		= (aClass9_204.aClass534Array63
		   [(anInt203 += -373459183) * 2120112625 - 1].aClass534_7159);
	    if (class534
		!= aClass9_204.aClass534Array63[anInt203 * 2120112625 - 1]) {
		aClass534_207 = class534.aClass534_7159;
		aClass534_206 = class534;
		return class534;
	    }
	}
	return null;
    }
    
    void method784() {
	aClass534_207 = aClass9_204.aClass534Array63[0].aClass534_7159;
	anInt203 = -373459183;
	aClass534_206 = null;
    }
    
    public void method785() {
	if (aClass534_206 == null)
	    throw new IllegalStateException();
	aClass534_206.method8892((byte) 1);
	aClass534_206 = null;
    }
    
    public void method786() {
	if (aClass534_206 == null)
	    throw new IllegalStateException();
	aClass534_206.method8892((byte) 1);
	aClass534_206 = null;
    }
    
    public Class534 method787() {
	method777((byte) 14);
	return (Class534) next();
    }
    
    public boolean method788() {
	if (aClass534_207
	    != aClass9_204.aClass534Array63[2120112625 * anInt203 - 1])
	    return true;
	while (2120112625 * anInt203 < -393701507 * aClass9_204.anInt64) {
	    if ((aClass9_204.aClass534Array63
		 [(anInt203 += -373459183) * 2120112625 - 1].aClass534_7159)
		!= aClass9_204.aClass534Array63[anInt203 * 2120112625 - 1]) {
		aClass534_207 = (aClass9_204.aClass534Array63
				 [2120112625 * anInt203 - 1].aClass534_7159);
		return true;
	    }
	    aClass534_207
		= aClass9_204.aClass534Array63[2120112625 * anInt203 - 1];
	}
	return false;
    }
    
    void method789() {
	aClass534_207 = aClass9_204.aClass534Array63[0].aClass534_7159;
	anInt203 = -373459183;
	aClass534_206 = null;
    }
    
    void method790() {
	aClass534_207 = aClass9_204.aClass534Array63[0].aClass534_7159;
	anInt203 = -373459183;
	aClass534_206 = null;
    }
    
    public Class534 method791() {
	method777((byte) 14);
	return (Class534) next();
    }
    
    public Class534 method792() {
	method777((byte) 14);
	return (Class534) next();
    }
    
    public Class534 method793(int i) {
	method777((byte) 14);
	return (Class534) next();
    }
    
    static Class method794(String string, int i)
	throws ClassNotFoundException {
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("D"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	if (string.equals("void"))
	    return Void.TYPE;
	return Class.forName(string);
    }
    
    static final void method795(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 324852453 * Class72.anInt765;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class72.anInt789 * 1965634793;
    }
    
    public static boolean method796(String string, int i) {
	if (null == string)
	    return false;
	for (int i_0_ = 0; i_0_ < 2103713403 * client.anInt11329; i_0_++) {
	    Class33 class33 = client.aClass33Array11299[i_0_];
	    if (string.equalsIgnoreCase(class33.aString273))
		return true;
	    if (string.equalsIgnoreCase(class33.aString275))
		return true;
	}
	return false;
    }
}
