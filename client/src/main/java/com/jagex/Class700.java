/* Class700 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Collection;
import java.util.Iterator;

public class Class700 implements Iterable, Collection
{
    public Class534 aClass534_8803 = new Class534();
    Class534 aClass534_8804;
    public static client aclient8805;
    public static Class638 aClass638_8806;
    public static Class200[] aClass200Array8807;
    
    public boolean method14129(Object object) {
	return super.equals(object);
    }
    
    public Object[] method14130(Object[] objects) {
	int i = 0;
	for (Class534 class534 = aClass534_8803.aClass534_7159;
	     class534 != aClass534_8803; class534 = class534.aClass534_7159)
	    objects[i++] = class534;
	return objects;
    }
    
    public void method14131(Class534 class534, short i) {
	if (null != class534.aClass534_7157)
	    class534.method8892((byte) 1);
	class534.aClass534_7157 = aClass534_8803.aClass534_7157;
	class534.aClass534_7159 = aClass534_8803;
	class534.aClass534_7157.aClass534_7159 = class534;
	class534.aClass534_7159.aClass534_7157 = class534;
    }
    
    public Class534 method14132(byte i) {
	Class534 class534 = aClass534_8803.aClass534_7159;
	if (aClass534_8803 == class534)
	    return null;
	class534.method8892((byte) 1);
	return class534;
    }
    
    void method14133(Class700 class700_0_, Class534 class534, byte i) {
	Class534 class534_1_ = aClass534_8803.aClass534_7157;
	aClass534_8803.aClass534_7157 = class534.aClass534_7157;
	class534.aClass534_7157.aClass534_7159 = aClass534_8803;
	if (class534 != aClass534_8803) {
	    class534.aClass534_7157
		= class700_0_.aClass534_8803.aClass534_7157;
	    class534.aClass534_7157.aClass534_7159 = class534;
	    class534_1_.aClass534_7159 = class700_0_.aClass534_8803;
	    class700_0_.aClass534_8803.aClass534_7157 = class534_1_;
	}
    }
    
    public void method14134(Class700 class700_2_, short i) {
	if (aClass534_8803.aClass534_7159 != aClass534_8803)
	    method14133(class700_2_, aClass534_8803.aClass534_7159, (byte) 9);
    }
    
    public Class534 method14135(byte i) {
	return method14136(null, (byte) -35);
    }
    
    Class534 method14136(Class534 class534, byte i) {
	Class534 class534_3_;
	if (class534 == null)
	    class534_3_ = aClass534_8803.aClass534_7159;
	else
	    class534_3_ = class534;
	if (class534_3_ == aClass534_8803) {
	    aClass534_8804 = null;
	    return null;
	}
	aClass534_8804 = class534_3_.aClass534_7159;
	return class534_3_;
    }
    
    public Class534 method14137(byte i) {
	return method14138(null, 13709105);
    }
    
    Class534 method14138(Class534 class534, int i) {
	Class534 class534_4_;
	if (null == class534)
	    class534_4_ = aClass534_8803.aClass534_7157;
	else
	    class534_4_ = class534;
	if (aClass534_8803 == class534_4_) {
	    aClass534_8804 = null;
	    return null;
	}
	aClass534_8804 = class534_4_.aClass534_7157;
	return class534_4_;
    }
    
    public Class534 method14139(int i) {
	Class534 class534 = aClass534_8804;
	if (class534 == aClass534_8803) {
	    aClass534_8804 = null;
	    return null;
	}
	aClass534_8804 = class534.aClass534_7159;
	return class534;
    }
    
    public Class534 method14140(byte i) {
	Class534 class534 = aClass534_8804;
	if (class534 == aClass534_8803) {
	    aClass534_8804 = null;
	    return null;
	}
	aClass534_8804 = class534.aClass534_7157;
	return class534;
    }
    
    public int method14141(byte i) {
	int i_5_ = 0;
	for (Class534 class534 = aClass534_8803.aClass534_7159;
	     class534 != aClass534_8803; class534 = class534.aClass534_7159)
	    i_5_++;
	return i_5_;
    }
    
    public boolean method14142(int i) {
	return aClass534_8803 == aClass534_8803.aClass534_7159;
    }
    
    Class534 method14143(Class534 class534) {
	Class534 class534_6_;
	if (null == class534)
	    class534_6_ = aClass534_8803.aClass534_7157;
	else
	    class534_6_ = class534;
	if (aClass534_8803 == class534_6_) {
	    aClass534_8804 = null;
	    return null;
	}
	aClass534_8804 = class534_6_.aClass534_7157;
	return class534_6_;
    }
    
    public Object[] toArray(Object[] objects) {
	int i = 0;
	for (Class534 class534 = aClass534_8803.aClass534_7159;
	     class534 != aClass534_8803; class534 = class534.aClass534_7159)
	    objects[i++] = class534;
	return objects;
    }
    
    public boolean equals(Object object) {
	return super.equals(object);
    }
    
    public boolean isEmpty() {
	return method14142(1440175883);
    }
    
    public boolean contains(Object object) {
	throw new RuntimeException();
    }
    
    public Object[] toArray() {
	return method14199(-1948580707);
    }
    
    public int method14144() {
	int i = 0;
	for (Class534 class534 = aClass534_8803.aClass534_7159;
	     class534 != aClass534_8803; class534 = class534.aClass534_7159)
	    i++;
	return i;
    }
    
    public Object[] method14145() {
	return method14199(-371841353);
    }
    
    public boolean remove(Object object) {
	throw new RuntimeException();
    }
    
    public boolean containsAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean addAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public int method14146() {
	return method14141((byte) 6);
    }
    
    public boolean retainAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public void clear() {
	method14152(-1000544950);
    }
    
    public void method14147() {
	while (aClass534_8803.aClass534_7159 != aClass534_8803)
	    aClass534_8803.aClass534_7159.method8892((byte) 1);
    }
    
    public Class534 method14148() {
	Class534 class534 = aClass534_8804;
	if (class534 == aClass534_8803) {
	    aClass534_8804 = null;
	    return null;
	}
	aClass534_8804 = class534.aClass534_7159;
	return class534;
    }
    
    public int hashCode() {
	return super.hashCode();
    }
    
    public boolean method14149(Object object) {
	return super.equals(object);
    }
    
    public Class534 method14150() {
	Class534 class534 = aClass534_8804;
	if (class534 == aClass534_8803) {
	    aClass534_8804 = null;
	    return null;
	}
	aClass534_8804 = class534.aClass534_7157;
	return class534;
    }
    
    public boolean method14151(Object object) {
	return super.equals(object);
    }
    
    public Iterator iterator() {
	return new Class710(this);
    }
    
    public void method14152(int i) {
	while (aClass534_8803.aClass534_7159 != aClass534_8803)
	    aClass534_8803.aClass534_7159.method8892((byte) 1);
    }
    
    public Iterator method14153() {
	return new Class710(this);
    }
    
    public Iterator method14154() {
	return new Class710(this);
    }
    
    Class534[] method14155() {
	Class534[] class534s = new Class534[method14141((byte) 6)];
	int i = 0;
	for (Class534 class534 = aClass534_8803.aClass534_7159;
	     aClass534_8803 != class534; class534 = class534.aClass534_7159)
	    class534s[i++] = class534;
	return class534s;
    }
    
    public int method14156() {
	return method14141((byte) 6);
    }
    
    public boolean method14157(Object object) {
	throw new RuntimeException();
    }
    
    public boolean method14158(Object object) {
	throw new RuntimeException();
    }
    
    public boolean method14159(Object object) {
	return method14176((Class534) object, -186533125);
    }
    
    public boolean method14160(Object object) {
	throw new RuntimeException();
    }
    
    public boolean method14161(Object object) {
	throw new RuntimeException();
    }
    
    public boolean method14162(Collection collection) {
	throw new RuntimeException();
    }
    
    public void method14163() {
	while (aClass534_8803.aClass534_7159 != aClass534_8803)
	    aClass534_8803.aClass534_7159.method8892((byte) 1);
    }
    
    public boolean method14164(Object object) {
	return super.equals(object);
    }
    
    public boolean method14165() {
	return aClass534_8803 == aClass534_8803.aClass534_7159;
    }
    
    public void method14166(Class534 class534) {
	if (null != class534.aClass534_7157)
	    class534.method8892((byte) 1);
	class534.aClass534_7157 = aClass534_8803.aClass534_7157;
	class534.aClass534_7159 = aClass534_8803;
	class534.aClass534_7157.aClass534_7159 = class534;
	class534.aClass534_7159.aClass534_7157 = class534;
    }
    
    public boolean method14167(Collection collection) {
	throw new RuntimeException();
    }
    
    public static void method14168(Class534 class534, Class534 class534_7_) {
	if (null != class534.aClass534_7157)
	    class534.method8892((byte) 1);
	class534.aClass534_7157 = class534_7_.aClass534_7157;
	class534.aClass534_7159 = class534_7_;
	class534.aClass534_7157.aClass534_7159 = class534;
	class534.aClass534_7159.aClass534_7157 = class534;
    }
    
    public static void method14169(Class534 class534, Class534 class534_8_) {
	if (null != class534.aClass534_7157)
	    class534.method8892((byte) 1);
	class534.aClass534_7157 = class534_8_.aClass534_7157;
	class534.aClass534_7159 = class534_8_;
	class534.aClass534_7157.aClass534_7159 = class534;
	class534.aClass534_7159.aClass534_7157 = class534;
    }
    
    public Class534 method14170() {
	Class534 class534 = aClass534_8803.aClass534_7159;
	if (aClass534_8803 == class534)
	    return null;
	class534.method8892((byte) 1);
	return class534;
    }
    
    public boolean add(Object object) {
	return method14176((Class534) object, -553955872);
    }
    
    void method14171(Class700 class700_9_, Class534 class534) {
	Class534 class534_10_ = aClass534_8803.aClass534_7157;
	aClass534_8803.aClass534_7157 = class534.aClass534_7157;
	class534.aClass534_7157.aClass534_7159 = aClass534_8803;
	if (class534 != aClass534_8803) {
	    class534.aClass534_7157
		= class700_9_.aClass534_8803.aClass534_7157;
	    class534.aClass534_7157.aClass534_7159 = class534;
	    class534_10_.aClass534_7159 = class700_9_.aClass534_8803;
	    class700_9_.aClass534_8803.aClass534_7157 = class534_10_;
	}
    }
    
    public void method14172(Class700 class700_11_) {
	if (aClass534_8803.aClass534_7159 != aClass534_8803)
	    method14133(class700_11_, aClass534_8803.aClass534_7159,
			(byte) -84);
    }
    
    public Object[] method14173(Object[] objects) {
	int i = 0;
	for (Class534 class534 = aClass534_8803.aClass534_7159;
	     class534 != aClass534_8803; class534 = class534.aClass534_7159)
	    objects[i++] = class534;
	return objects;
    }
    
    Class534[] method14174() {
	Class534[] class534s = new Class534[method14141((byte) 6)];
	int i = 0;
	for (Class534 class534 = aClass534_8803.aClass534_7159;
	     aClass534_8803 != class534; class534 = class534.aClass534_7159)
	    class534s[i++] = class534;
	return class534s;
    }
    
    Class534 method14175(Class534 class534) {
	Class534 class534_12_;
	if (class534 == null)
	    class534_12_ = aClass534_8803.aClass534_7159;
	else
	    class534_12_ = class534;
	if (class534_12_ == aClass534_8803) {
	    aClass534_8804 = null;
	    return null;
	}
	aClass534_8804 = class534_12_.aClass534_7159;
	return class534_12_;
    }
    
    boolean method14176(Class534 class534, int i) {
	method14131(class534, (short) 789);
	return true;
    }
    
    public Class534 method14177() {
	return method14138(null, 465697246);
    }
    
    Class534 method14178(Class534 class534) {
	Class534 class534_13_;
	if (null == class534)
	    class534_13_ = aClass534_8803.aClass534_7157;
	else
	    class534_13_ = class534;
	if (aClass534_8803 == class534_13_) {
	    aClass534_8804 = null;
	    return null;
	}
	aClass534_8804 = class534_13_.aClass534_7157;
	return class534_13_;
    }
    
    public Class534 method14179() {
	return method14136(null, (byte) -42);
    }
    
    public Class534 method14180() {
	Class534 class534 = aClass534_8804;
	if (class534 == aClass534_8803) {
	    aClass534_8804 = null;
	    return null;
	}
	aClass534_8804 = class534.aClass534_7159;
	return class534;
    }
    
    public Class534 method14181() {
	Class534 class534 = aClass534_8804;
	if (class534 == aClass534_8803) {
	    aClass534_8804 = null;
	    return null;
	}
	aClass534_8804 = class534.aClass534_7159;
	return class534;
    }
    
    void method14182(Class700 class700_14_, Class534 class534) {
	Class534 class534_15_ = aClass534_8803.aClass534_7157;
	aClass534_8803.aClass534_7157 = class534.aClass534_7157;
	class534.aClass534_7157.aClass534_7159 = aClass534_8803;
	if (class534 != aClass534_8803) {
	    class534.aClass534_7157
		= class700_14_.aClass534_8803.aClass534_7157;
	    class534.aClass534_7157.aClass534_7159 = class534;
	    class534_15_.aClass534_7159 = class700_14_.aClass534_8803;
	    class700_14_.aClass534_8803.aClass534_7157 = class534_15_;
	}
    }
    
    public Class534 method14183() {
	Class534 class534 = aClass534_8804;
	if (class534 == aClass534_8803) {
	    aClass534_8804 = null;
	    return null;
	}
	aClass534_8804 = class534.aClass534_7157;
	return class534;
    }
    
    public Class534 method14184() {
	return method14138(null, 729540173);
    }
    
    public int size() {
	return method14141((byte) 6);
    }
    
    public int method14185() {
	int i = 0;
	for (Class534 class534 = aClass534_8803.aClass534_7159;
	     class534 != aClass534_8803; class534 = class534.aClass534_7159)
	    i++;
	return i;
    }
    
    public void method14186(Class534 class534) {
	if (null != class534.aClass534_7157)
	    class534.method8892((byte) 1);
	class534.aClass534_7157 = aClass534_8803.aClass534_7157;
	class534.aClass534_7159 = aClass534_8803;
	class534.aClass534_7157.aClass534_7159 = class534;
	class534.aClass534_7159.aClass534_7157 = class534;
    }
    
    public boolean method14187() {
	return aClass534_8803 == aClass534_8803.aClass534_7159;
    }
    
    Class534[] method14188() {
	Class534[] class534s = new Class534[method14141((byte) 6)];
	int i = 0;
	for (Class534 class534 = aClass534_8803.aClass534_7159;
	     aClass534_8803 != class534; class534 = class534.aClass534_7159)
	    class534s[i++] = class534;
	return class534s;
    }
    
    public Class700() {
	aClass534_8803.aClass534_7159 = aClass534_8803;
	aClass534_8803.aClass534_7157 = aClass534_8803;
    }
    
    Class534[] method14189() {
	Class534[] class534s = new Class534[method14141((byte) 6)];
	int i = 0;
	for (Class534 class534 = aClass534_8803.aClass534_7159;
	     aClass534_8803 != class534; class534 = class534.aClass534_7159)
	    class534s[i++] = class534;
	return class534s;
    }
    
    Class534[] method14190() {
	Class534[] class534s = new Class534[method14141((byte) 6)];
	int i = 0;
	for (Class534 class534 = aClass534_8803.aClass534_7159;
	     aClass534_8803 != class534; class534 = class534.aClass534_7159)
	    class534s[i++] = class534;
	return class534s;
    }
    
    public boolean removeAll(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean method14191() {
	return method14142(500447058);
    }
    
    public int method14192() {
	return super.hashCode();
    }
    
    Class534 method14193(Class534 class534) {
	Class534 class534_16_;
	if (class534 == null)
	    class534_16_ = aClass534_8803.aClass534_7159;
	else
	    class534_16_ = class534;
	if (class534_16_ == aClass534_8803) {
	    aClass534_8804 = null;
	    return null;
	}
	aClass534_8804 = class534_16_.aClass534_7159;
	return class534_16_;
    }
    
    public Object[] method14194(Object[] objects) {
	int i = 0;
	for (Class534 class534 = aClass534_8803.aClass534_7159;
	     class534 != aClass534_8803; class534 = class534.aClass534_7159)
	    objects[i++] = class534;
	return objects;
    }
    
    public void method14195() {
	while (aClass534_8803.aClass534_7159 != aClass534_8803)
	    aClass534_8803.aClass534_7159.method8892((byte) 1);
    }
    
    public boolean method14196(Collection collection) {
	throw new RuntimeException();
    }
    
    public boolean method14197(Object object) {
	throw new RuntimeException();
    }
    
    public void method14198() {
	method14152(-1182512642);
    }
    
    Class534[] method14199(int i) {
	Class534[] class534s = new Class534[method14141((byte) 6)];
	int i_17_ = 0;
	for (Class534 class534 = aClass534_8803.aClass534_7159;
	     aClass534_8803 != class534; class534 = class534.aClass534_7159)
	    class534s[i_17_++] = class534;
	return class534s;
    }
    
    static final void method14200(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) (client.aClass214_11359.method4032((byte) -111) / 60000L);
    }
    
    static final void method14201(Class669 class669, int i) {
	class669.anInt8600 -= 1544997815;
	int i_18_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_19_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	int i_20_
	    = class669.anIntArray8595[2 + class669.anInt8600 * 2088438307];
	int i_21_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 3];
	int i_22_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 4];
	Class171_Sub4.aClass232_9944.method4237(Class211.aClass211_2255, i_18_,
						i_19_, i_21_,
						Class190.aClass190_2134
						    .method3763(-905013997),
						Class207.aClass207_2235, 0.0F,
						0.0F, null, 0, i_22_, i_20_,
						(byte) 18);
    }
}
