/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.lang.reflect.Array;
import java.util.Iterator;

public class Class53 implements Interface14
{
    protected int anInt437;
    Class649 aClass649_438;
    Interface13[] anInterface13Array439;
    Interface6 anInterface6_440;
    Interface13 anInterface13_441;
    Class472 aClass472_442;
    
    public int method88() {
	return anInterface13Array439.length;
    }
    
    public Interface13 method87(int i) {
	if (i < 0) {
	    if (anInterface13_441 == null)
		anInterface13_441
		    = anInterface6_440.method58(-1, this, (byte) -1);
	    return anInterface13_441;
	}
	if (anInterface13Array439[i] == null)
	    method1187(i, (byte) 7);
	return anInterface13Array439[i];
    }
    
    void method1187(int i, byte i_0_) {
	if (null == anInterface13Array439[i]) {
	    try {
		anInterface13Array439[i]
		    = anInterface6_440.method58(i, this, (byte) -1);
	    } catch (Exception exception) {
		exception.printStackTrace();
		return;
	    }
	    Object object = null;
	    byte[] is = Class600.method9950(aClass472_442, aClass649_438, i,
					    (short) -28020);
	    if (null != is)
		anInterface13Array439[i].method79(new Class534_Sub40(is),
						  (byte) 3);
	    anInterface13Array439[i].method82(-1757440304);
	}
    }
    
    public Interface13 method91(int i, int i_1_) {
	if (i < 0) {
	    if (anInterface13_441 == null)
		anInterface13_441
		    = anInterface6_440.method58(-1, this, (byte) -1);
	    return anInterface13_441;
	}
	if (anInterface13Array439[i] == null)
	    method1187(i, (byte) 7);
	return anInterface13Array439[i];
    }
    
    public Iterator iterator() {
	return new Class64(this);
    }
    
    public int method85() {
	return anInterface13Array439.length;
    }
    
    public Interface13 method86(int i) {
	if (i < 0) {
	    if (anInterface13_441 == null)
		anInterface13_441
		    = anInterface6_440.method58(-1, this, (byte) -1);
	    return anInterface13_441;
	}
	if (anInterface13Array439[i] == null)
	    method1187(i, (byte) 7);
	return anInterface13Array439[i];
    }
    
    public Interface13 method89(int i) {
	if (i < 0) {
	    if (anInterface13_441 == null)
		anInterface13_441
		    = anInterface6_440.method58(-1, this, (byte) -1);
	    return anInterface13_441;
	}
	if (anInterface13Array439[i] == null)
	    method1187(i, (byte) 7);
	return anInterface13Array439[i];
    }
    
    public Iterator method1188() {
	return new Class64(this);
    }
    
    void method1189(int i) {
	if (null == anInterface13Array439[i]) {
	    try {
		anInterface13Array439[i]
		    = anInterface6_440.method58(i, this, (byte) -1);
	    } catch (Exception exception) {
		exception.printStackTrace();
		return;
	    }
	    Object object = null;
	    byte[] is = Class600.method9950(aClass472_442, aClass649_438, i,
					    (short) -8799);
	    if (null != is)
		anInterface13Array439[i].method79(new Class534_Sub40(is),
						  (byte) 3);
	    anInterface13Array439[i].method82(-1757440304);
	}
    }
    
    public Iterator method1190() {
	return new Class64(this);
    }
    
    public int method90(byte i) {
	return anInterface13Array439.length;
    }
    
    void method1191(int i) {
	if (null == anInterface13Array439[i]) {
	    try {
		anInterface13Array439[i]
		    = anInterface6_440.method58(i, this, (byte) -1);
	    } catch (Exception exception) {
		exception.printStackTrace();
		return;
	    }
	    Object object = null;
	    byte[] is = Class600.method9950(aClass472_442, aClass649_438, i,
					    (short) -24588);
	    if (null != is)
		anInterface13Array439[i].method79(new Class534_Sub40(is),
						  (byte) 3);
	    anInterface13Array439[i].method82(-1757440304);
	}
    }
    
    Class53(Class675 class675, Class672 class672, Class649 class649,
	    Class472 class472, Interface6 interface6, boolean bool) {
	anInterface6_440 = interface6;
	aClass649_438 = class649;
	aClass472_442 = class472;
	anInt437 = Class26.method858(aClass472_442, aClass649_438,
				     -1433259541) * 166922659;
	anInterface13Array439
	    = ((Interface13[])
	       Array.newInstance(anInterface6_440.method59((short) 5183),
				 anInt437 * 317485579));
	if (bool) {
	    for (int i = 0; i < anInt437 * 317485579; i++)
		method1187(i, (byte) 7);
	}
    }
    
    static final void method1192(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4191,
				  client.aClass100_11264.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16506(string.length() + 1, 792500043);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string,
							      -622066171);
	client.aClass100_11264.method1863(class534_sub19, (byte) 67);
    }
    
    static void method1193(byte i) {
	client.anInt11255 = 0;
	client.anInt11257 = 0;
	client.anInt11306 = 0;
	client.anInt11062 = 0;
	client.anInt11240 = 0;
	client.anInt11030 = 0;
	client.anInt11045 = 0;
	client.anInt11261 = 0;
	client.anInt11268 = 0;
	client.anInt11235 = 0;
	client.anInt11270 = 0;
	client.anInt11271 = 0;
	client.anInt11272 = 0;
	client.anInt11273 = 0;
	client.anInt11274 = 0;
    }
}
