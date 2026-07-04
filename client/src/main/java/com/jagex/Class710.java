/* Class710 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class710 implements Iterator
{
    Class700 aClass700_8858;
    Class534 aClass534_8859;
    Class534 aClass534_8860 = null;
    
    public Object method14306() {
	Class534 class534 = aClass534_8859;
	if (class534 == aClass700_8858.aClass534_8803) {
	    class534 = null;
	    aClass534_8859 = null;
	} else
	    aClass534_8859 = class534.aClass534_7159;
	aClass534_8860 = class534;
	return class534;
    }
    
    public void method14307(Class700 class700, int i) {
	aClass700_8858 = class700;
	aClass534_8859 = aClass700_8858.aClass534_8803.aClass534_7159;
	aClass534_8860 = null;
    }
    
    public Class534 method14308(byte i) {
	method14321((short) 25789);
	return (Class534) next();
    }
    
    public void method14309() {
	if (null == aClass534_8860)
	    throw new IllegalStateException();
	aClass534_8860.method8892((byte) 1);
	aClass534_8860 = null;
    }
    
    public Object next() {
	Class534 class534 = aClass534_8859;
	if (class534 == aClass700_8858.aClass534_8803) {
	    class534 = null;
	    aClass534_8859 = null;
	} else
	    aClass534_8859 = class534.aClass534_7159;
	aClass534_8860 = class534;
	return class534;
    }
    
    public boolean hasNext() {
	return aClass534_8859 != aClass700_8858.aClass534_8803;
    }
    
    public void remove() {
	if (null == aClass534_8860)
	    throw new IllegalStateException();
	aClass534_8860.method8892((byte) 1);
	aClass534_8860 = null;
    }
    
    public boolean method14310() {
	return aClass534_8859 != aClass700_8858.aClass534_8803;
    }
    
    public Class710(Class700 class700) {
	aClass700_8858 = class700;
	aClass534_8859 = aClass700_8858.aClass534_8803.aClass534_7159;
	aClass534_8860 = null;
    }
    
    public boolean method14311() {
	return aClass534_8859 != aClass700_8858.aClass534_8803;
    }
    
    public boolean method14312() {
	return aClass534_8859 != aClass700_8858.aClass534_8803;
    }
    
    public boolean method14313() {
	return aClass534_8859 != aClass700_8858.aClass534_8803;
    }
    
    public Object method14314() {
	Class534 class534 = aClass534_8859;
	if (class534 == aClass700_8858.aClass534_8803) {
	    class534 = null;
	    aClass534_8859 = null;
	} else
	    aClass534_8859 = class534.aClass534_7159;
	aClass534_8860 = class534;
	return class534;
    }
    
    public void method14315() {
	if (null == aClass534_8860)
	    throw new IllegalStateException();
	aClass534_8860.method8892((byte) 1);
	aClass534_8860 = null;
    }
    
    public Class534 method14316() {
	method14321((short) 10832);
	return (Class534) next();
    }
    
    public void method14317(Class700 class700) {
	aClass700_8858 = class700;
	aClass534_8859 = aClass700_8858.aClass534_8803.aClass534_7159;
	aClass534_8860 = null;
    }
    
    public void method14318(Class700 class700) {
	aClass700_8858 = class700;
	aClass534_8859 = aClass700_8858.aClass534_8803.aClass534_7159;
	aClass534_8860 = null;
    }
    
    public void method14319(Class700 class700) {
	aClass700_8858 = class700;
	aClass534_8859 = aClass700_8858.aClass534_8803.aClass534_7159;
	aClass534_8860 = null;
    }
    
    void method14320() {
	aClass534_8859 = aClass700_8858.aClass534_8803.aClass534_7159;
	aClass534_8860 = null;
    }
    
    void method14321(short i) {
	aClass534_8859 = aClass700_8858.aClass534_8803.aClass534_7159;
	aClass534_8860 = null;
    }
    
    static void method14322(int i) {
	Class108.anInt1321 = 0;
	for (int i_0_ = 0; i_0_ < 2048; i_0_++) {
	    Class108.aClass534_Sub40Array1319[i_0_] = null;
	    Class108.aClass534_Sub40Array1316[i_0_] = null;
	    Class108.aByteArray1325[i_0_] = Class676.aClass676_8649.aByte8648;
	    Class108.aClass60Array1320[i_0_] = null;
	}
    }
    
    static void method14323(byte i) {
	for (Class534_Sub18_Sub11 class534_sub18_sub11
		 = ((Class534_Sub18_Sub11)
		    Class72.aClass696_772.method14078(1221951837));
	     null != class534_sub18_sub11;
	     class534_sub18_sub11
		 = ((Class534_Sub18_Sub11)
		    Class72.aClass696_772.method14080((byte) 116))) {
	    if (class534_sub18_sub11.anInt11795 * -475442105 > 1) {
		class534_sub18_sub11.anInt11795 = 0;
		Class72.aClass203_794.method3893(class534_sub18_sub11,
						 ((((Class534_Sub18_Sub7)
						    (class534_sub18_sub11
						     .aClass696_11794
						     .aClass534_Sub18_8785
						     .aClass534_Sub18_10510))
						   .aLong11709)
						  * -6387465159951953483L));
		class534_sub18_sub11.aClass696_11794.method14075(958896847);
	    }
	}
	Class72.anInt789 = 0;
	Class72.anInt765 = 0;
	Class72.aClass700_771.method14152(-1151037152);
	Class72.aClass9_768.method578((byte) -86);
	Class72.aClass696_772.method14075(958896847);
	Class517.method8636(Class62.aClass534_Sub18_Sub7_650, (byte) 0);
    }
    
    static final void method14324(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class213.method4020(string, i_1_, -1879200197);
    }
}
