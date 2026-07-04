/* AbstractQueue_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AbstractQueue_Sub1 extends AbstractQueue
{
    Map aMap11911;
    Comparator aComparator11912;
    int anInt11913;
    Class415[] aClass415Array11914;
    int anInt11915 = 0;
    
    public Iterator method18493() {
	return new Class412(this);
    }
    
    public boolean method18494(Object object) {
	Class415 class415 = (Class415) aMap11911.remove(object);
	if (null == class415)
	    return false;
	anInt11915 += -1418102489;
	anInt11913 -= 743829295;
	if (-926875073 * class415.anInt4664 == 633845711 * anInt11913) {
	    aClass415Array11914[633845711 * anInt11913] = null;
	    return true;
	}
	Class415 class415_0_ = aClass415Array11914[anInt11913 * 633845711];
	aClass415Array11914[633845711 * anInt11913] = null;
	aClass415Array11914[class415.anInt4664 * -926875073] = class415_0_;
	aClass415Array11914[class415.anInt4664 * -926875073].anInt4664
	    = 1 * class415.anInt4664;
	method18499(-926875073 * class415.anInt4664, (byte) 83);
	if (aClass415Array11914[-926875073 * class415.anInt4664]
	    == class415_0_)
	    method18516(-926875073 * class415.anInt4664, 1809150343);
	return true;
    }
    
    public boolean method18495(Object object) {
	if (aMap11911.containsKey(object))
	    throw new IllegalArgumentException("");
	anInt11915 += -1418102489;
	int i = 633845711 * anInt11913;
	if (i >= aClass415Array11914.length)
	    method18507(-1516355184);
	anInt11913 += 743829295;
	if (0 == i) {
	    aClass415Array11914[0] = new Class415(object, 0);
	    aMap11911.put(object, aClass415Array11914[0]);
	} else {
	    aClass415Array11914[i] = new Class415(object, i);
	    aMap11911.put(object, aClass415Array11914[i]);
	    method18516(i, 1585500374);
	}
	return true;
    }
    
    public int size() {
	return anInt11913 * 633845711;
    }
    
    public Object method18496() {
	if (0 == anInt11913 * 633845711)
	    return null;
	return aClass415Array11914[0].anObject4665;
    }
    
    void method18497(int i) {
	Class415 class415 = aClass415Array11914[i];
	int i_1_;
	for (/**/; i > 0; i = i_1_) {
	    i_1_ = i - 1 >>> 1;
	    Class415 class415_2_ = aClass415Array11914[i_1_];
	    if (null != aComparator11912) {
		if (aComparator11912.compare(class415.anObject4665,
					     class415_2_.anObject4665)
		    >= 0)
		    break;
	    } else if (((Comparable) class415.anObject4665)
			   .compareTo(class415_2_.anObject4665)
		       >= 0)
		break;
	    aClass415Array11914[i] = class415_2_;
	    aClass415Array11914[i].anInt4664 = -1235882561 * i;
	}
	aClass415Array11914[i] = class415;
	aClass415Array11914[i].anInt4664 = -1235882561 * i;
    }
    
    public Object poll() {
	if (633845711 * anInt11913 == 0)
	    return null;
	anInt11915 += -1418102489;
	Object object = aClass415Array11914[0].anObject4665;
	aMap11911.remove(object);
	anInt11913 -= 743829295;
	if (0 == 633845711 * anInt11913)
	    aClass415Array11914[633845711 * anInt11913] = null;
	else {
	    aClass415Array11914[0]
		= aClass415Array11914[633845711 * anInt11913];
	    aClass415Array11914[0].anInt4664 = 0;
	    aClass415Array11914[633845711 * anInt11913] = null;
	    method18499(0, (byte) 15);
	}
	return object;
    }
    
    public boolean remove(Object object) {
	Class415 class415 = (Class415) aMap11911.remove(object);
	if (null == class415)
	    return false;
	anInt11915 += -1418102489;
	anInt11913 -= 743829295;
	if (-926875073 * class415.anInt4664 == 633845711 * anInt11913) {
	    aClass415Array11914[633845711 * anInt11913] = null;
	    return true;
	}
	Class415 class415_3_ = aClass415Array11914[anInt11913 * 633845711];
	aClass415Array11914[633845711 * anInt11913] = null;
	aClass415Array11914[class415.anInt4664 * -926875073] = class415_3_;
	aClass415Array11914[class415.anInt4664 * -926875073].anInt4664
	    = 1 * class415.anInt4664;
	method18499(-926875073 * class415.anInt4664, (byte) -65);
	if (aClass415Array11914[-926875073 * class415.anInt4664]
	    == class415_3_)
	    method18516(-926875073 * class415.anInt4664, 1626436899);
	return true;
    }
    
    public boolean method18498(Object object) {
	if (aMap11911.containsKey(object))
	    throw new IllegalArgumentException("");
	anInt11915 += -1418102489;
	int i = 633845711 * anInt11913;
	if (i >= aClass415Array11914.length)
	    method18507(-64388178);
	anInt11913 += 743829295;
	if (0 == i) {
	    aClass415Array11914[0] = new Class415(object, 0);
	    aMap11911.put(object, aClass415Array11914[0]);
	} else {
	    aClass415Array11914[i] = new Class415(object, i);
	    aMap11911.put(object, aClass415Array11914[i]);
	    method18516(i, 2001792477);
	}
	return true;
    }
    
    void method18499(int i, byte i_4_) {
	Class415 class415 = aClass415Array11914[i];
	int i_5_;
	for (int i_6_ = 633845711 * anInt11913 >>> 1; i < i_6_; i = i_5_) {
	    int i_7_ = 1 + (i << 1);
	    Class415 class415_8_ = aClass415Array11914[i_7_];
	    int i_9_ = (i << 1) + 2;
	    Class415 class415_10_ = aClass415Array11914[i_9_];
	    if (aComparator11912 != null) {
		if (i_9_ < 633845711 * anInt11913
		    && aComparator11912.compare(class415_8_.anObject4665,
						class415_10_.anObject4665) > 0)
		    i_5_ = i_9_;
		else
		    i_5_ = i_7_;
	    } else if (i_9_ < 633845711 * anInt11913
		       && ((Comparable) class415_8_.anObject4665)
			      .compareTo(class415_10_.anObject4665) > 0)
		i_5_ = i_9_;
	    else
		i_5_ = i_7_;
	    if (null != aComparator11912) {
		if (aComparator11912.compare(class415.anObject4665,
					     (aClass415Array11914[i_5_]
					      .anObject4665))
		    <= 0)
		    break;
	    } else if (((Comparable) class415.anObject4665)
			   .compareTo(aClass415Array11914[i_5_].anObject4665)
		       <= 0)
		break;
	    aClass415Array11914[i] = aClass415Array11914[i_5_];
	    aClass415Array11914[i].anInt4664 = i * -1235882561;
	}
	aClass415Array11914[i] = class415;
	aClass415Array11914[i].anInt4664 = i * -1235882561;
    }
    
    public boolean contains(Object object) {
	return aMap11911.containsKey(object);
    }
    
    public Object[] toArray() {
	Object[] objects = super.toArray();
	if (aComparator11912 != null)
	    Arrays.sort(objects, aComparator11912);
	else
	    Arrays.sort(objects);
	return objects;
    }
    
    public Iterator iterator() {
	return new Class412(this);
    }
    
    public boolean offer(Object object) {
	if (aMap11911.containsKey(object))
	    throw new IllegalArgumentException("");
	anInt11915 += -1418102489;
	int i = 633845711 * anInt11913;
	if (i >= aClass415Array11914.length)
	    method18507(-93347948);
	anInt11913 += 743829295;
	if (0 == i) {
	    aClass415Array11914[0] = new Class415(object, 0);
	    aMap11911.put(object, aClass415Array11914[0]);
	} else {
	    aClass415Array11914[i] = new Class415(object, i);
	    aMap11911.put(object, aClass415Array11914[i]);
	    method18516(i, 1552387488);
	}
	return true;
    }
    
    public Iterator method18500() {
	return new Class412(this);
    }
    
    public Object method18501() {
	if (633845711 * anInt11913 == 0)
	    return null;
	anInt11915 += -1418102489;
	Object object = aClass415Array11914[0].anObject4665;
	aMap11911.remove(object);
	anInt11913 -= 743829295;
	if (0 == 633845711 * anInt11913)
	    aClass415Array11914[633845711 * anInt11913] = null;
	else {
	    aClass415Array11914[0]
		= aClass415Array11914[633845711 * anInt11913];
	    aClass415Array11914[0].anInt4664 = 0;
	    aClass415Array11914[633845711 * anInt11913] = null;
	    method18499(0, (byte) -62);
	}
	return object;
    }
    
    public int method18502() {
	return anInt11913 * 633845711;
    }
    
    public Object[] method18503() {
	Object[] objects = super.toArray();
	if (aComparator11912 != null)
	    Arrays.sort(objects, aComparator11912);
	else
	    Arrays.sort(objects);
	return objects;
    }
    
    void method18504(int i) {
	Class415 class415 = aClass415Array11914[i];
	int i_11_;
	for (int i_12_ = 633845711 * anInt11913 >>> 1; i < i_12_; i = i_11_) {
	    int i_13_ = 1 + (i << 1);
	    Class415 class415_14_ = aClass415Array11914[i_13_];
	    int i_15_ = (i << 1) + 2;
	    Class415 class415_16_ = aClass415Array11914[i_15_];
	    if (aComparator11912 != null) {
		if (i_15_ < 633845711 * anInt11913
		    && aComparator11912.compare(class415_14_.anObject4665,
						class415_16_.anObject4665) > 0)
		    i_11_ = i_15_;
		else
		    i_11_ = i_13_;
	    } else if (i_15_ < 633845711 * anInt11913
		       && ((Comparable) class415_14_.anObject4665)
			      .compareTo(class415_16_.anObject4665) > 0)
		i_11_ = i_15_;
	    else
		i_11_ = i_13_;
	    if (null != aComparator11912) {
		if (aComparator11912.compare(class415.anObject4665,
					     (aClass415Array11914[i_11_]
					      .anObject4665))
		    <= 0)
		    break;
	    } else if (((Comparable) class415.anObject4665)
			   .compareTo(aClass415Array11914[i_11_].anObject4665)
		       <= 0)
		break;
	    aClass415Array11914[i] = aClass415Array11914[i_11_];
	    aClass415Array11914[i].anInt4664 = i * -1235882561;
	}
	aClass415Array11914[i] = class415;
	aClass415Array11914[i].anInt4664 = i * -1235882561;
    }
    
    public boolean method18505(Object object) {
	if (aMap11911.containsKey(object))
	    throw new IllegalArgumentException("");
	anInt11915 += -1418102489;
	int i = 633845711 * anInt11913;
	if (i >= aClass415Array11914.length)
	    method18507(2039788129);
	anInt11913 += 743829295;
	if (0 == i) {
	    aClass415Array11914[0] = new Class415(object, 0);
	    aMap11911.put(object, aClass415Array11914[0]);
	} else {
	    aClass415Array11914[i] = new Class415(object, i);
	    aMap11911.put(object, aClass415Array11914[i]);
	    method18516(i, 684319771);
	}
	return true;
    }
    
    public Object method18506() {
	if (0 == anInt11913 * 633845711)
	    return null;
	return aClass415Array11914[0].anObject4665;
    }
    
    void method18507(int i) {
	int i_17_ = (aClass415Array11914.length << 1) + 1;
	aClass415Array11914
	    = (Class415[]) Arrays.copyOf(aClass415Array11914, i_17_);
    }
    
    public Object method18508() {
	if (633845711 * anInt11913 == 0)
	    return null;
	anInt11915 += -1418102489;
	Object object = aClass415Array11914[0].anObject4665;
	aMap11911.remove(object);
	anInt11913 -= 743829295;
	if (0 == 633845711 * anInt11913)
	    aClass415Array11914[633845711 * anInt11913] = null;
	else {
	    aClass415Array11914[0]
		= aClass415Array11914[633845711 * anInt11913];
	    aClass415Array11914[0].anInt4664 = 0;
	    aClass415Array11914[633845711 * anInt11913] = null;
	    method18499(0, (byte) -14);
	}
	return object;
    }
    
    public Object method18509() {
	if (0 == anInt11913 * 633845711)
	    return null;
	return aClass415Array11914[0].anObject4665;
    }
    
    public AbstractQueue_Sub1(int i, Comparator comparator) {
	aClass415Array11914 = new Class415[i];
	aMap11911 = new HashMap();
	aComparator11912 = comparator;
    }
    
    public Object peek() {
	if (0 == anInt11913 * 633845711)
	    return null;
	return aClass415Array11914[0].anObject4665;
    }
    
    public int method18510() {
	return anInt11913 * 633845711;
    }
    
    public boolean method18511(Object object) {
	Class415 class415 = (Class415) aMap11911.remove(object);
	if (null == class415)
	    return false;
	anInt11915 += -1418102489;
	anInt11913 -= 743829295;
	if (-926875073 * class415.anInt4664 == 633845711 * anInt11913) {
	    aClass415Array11914[633845711 * anInt11913] = null;
	    return true;
	}
	Class415 class415_18_ = aClass415Array11914[anInt11913 * 633845711];
	aClass415Array11914[633845711 * anInt11913] = null;
	aClass415Array11914[class415.anInt4664 * -926875073] = class415_18_;
	aClass415Array11914[class415.anInt4664 * -926875073].anInt4664
	    = 1 * class415.anInt4664;
	method18499(-926875073 * class415.anInt4664, (byte) -75);
	if (aClass415Array11914[-926875073 * class415.anInt4664]
	    == class415_18_)
	    method18516(-926875073 * class415.anInt4664, 1764830163);
	return true;
    }
    
    public boolean method18512(Object object) {
	Class415 class415 = (Class415) aMap11911.remove(object);
	if (null == class415)
	    return false;
	anInt11915 += -1418102489;
	anInt11913 -= 743829295;
	if (-926875073 * class415.anInt4664 == 633845711 * anInt11913) {
	    aClass415Array11914[633845711 * anInt11913] = null;
	    return true;
	}
	Class415 class415_19_ = aClass415Array11914[anInt11913 * 633845711];
	aClass415Array11914[633845711 * anInt11913] = null;
	aClass415Array11914[class415.anInt4664 * -926875073] = class415_19_;
	aClass415Array11914[class415.anInt4664 * -926875073].anInt4664
	    = 1 * class415.anInt4664;
	method18499(-926875073 * class415.anInt4664, (byte) 48);
	if (aClass415Array11914[-926875073 * class415.anInt4664]
	    == class415_19_)
	    method18516(-926875073 * class415.anInt4664, 1395171509);
	return true;
    }
    
    public Object method18513() {
	if (633845711 * anInt11913 == 0)
	    return null;
	anInt11915 += -1418102489;
	Object object = aClass415Array11914[0].anObject4665;
	aMap11911.remove(object);
	anInt11913 -= 743829295;
	if (0 == 633845711 * anInt11913)
	    aClass415Array11914[633845711 * anInt11913] = null;
	else {
	    aClass415Array11914[0]
		= aClass415Array11914[633845711 * anInt11913];
	    aClass415Array11914[0].anInt4664 = 0;
	    aClass415Array11914[633845711 * anInt11913] = null;
	    method18499(0, (byte) 15);
	}
	return object;
    }
    
    public AbstractQueue_Sub1(int i) {
	this(i, null);
    }
    
    void method18514(int i) {
	Class415 class415 = aClass415Array11914[i];
	int i_20_;
	for (/**/; i > 0; i = i_20_) {
	    i_20_ = i - 1 >>> 1;
	    Class415 class415_21_ = aClass415Array11914[i_20_];
	    if (null != aComparator11912) {
		if (aComparator11912.compare(class415.anObject4665,
					     class415_21_.anObject4665)
		    >= 0)
		    break;
	    } else if (((Comparable) class415.anObject4665)
			   .compareTo(class415_21_.anObject4665)
		       >= 0)
		break;
	    aClass415Array11914[i] = class415_21_;
	    aClass415Array11914[i].anInt4664 = -1235882561 * i;
	}
	aClass415Array11914[i] = class415;
	aClass415Array11914[i].anInt4664 = -1235882561 * i;
    }
    
    void method18515(int i) {
	Class415 class415 = aClass415Array11914[i];
	int i_22_;
	for (/**/; i > 0; i = i_22_) {
	    i_22_ = i - 1 >>> 1;
	    Class415 class415_23_ = aClass415Array11914[i_22_];
	    if (null != aComparator11912) {
		if (aComparator11912.compare(class415.anObject4665,
					     class415_23_.anObject4665)
		    >= 0)
		    break;
	    } else if (((Comparable) class415.anObject4665)
			   .compareTo(class415_23_.anObject4665)
		       >= 0)
		break;
	    aClass415Array11914[i] = class415_23_;
	    aClass415Array11914[i].anInt4664 = -1235882561 * i;
	}
	aClass415Array11914[i] = class415;
	aClass415Array11914[i].anInt4664 = -1235882561 * i;
    }
    
    void method18516(int i, int i_24_) {
	Class415 class415 = aClass415Array11914[i];
	int i_25_;
	for (/**/; i > 0; i = i_25_) {
	    i_25_ = i - 1 >>> 1;
	    Class415 class415_26_ = aClass415Array11914[i_25_];
	    if (null != aComparator11912) {
		if (aComparator11912.compare(class415.anObject4665,
					     class415_26_.anObject4665)
		    >= 0)
		    break;
	    } else if (((Comparable) class415.anObject4665)
			   .compareTo(class415_26_.anObject4665)
		       >= 0)
		break;
	    aClass415Array11914[i] = class415_26_;
	    aClass415Array11914[i].anInt4664 = -1235882561 * i;
	}
	aClass415Array11914[i] = class415;
	aClass415Array11914[i].anInt4664 = -1235882561 * i;
    }
    
    void method18517(int i) {
	Class415 class415 = aClass415Array11914[i];
	int i_27_;
	for (int i_28_ = 633845711 * anInt11913 >>> 1; i < i_28_; i = i_27_) {
	    int i_29_ = 1 + (i << 1);
	    Class415 class415_30_ = aClass415Array11914[i_29_];
	    int i_31_ = (i << 1) + 2;
	    Class415 class415_32_ = aClass415Array11914[i_31_];
	    if (aComparator11912 != null) {
		if (i_31_ < 633845711 * anInt11913
		    && aComparator11912.compare(class415_30_.anObject4665,
						class415_32_.anObject4665) > 0)
		    i_27_ = i_31_;
		else
		    i_27_ = i_29_;
	    } else if (i_31_ < 633845711 * anInt11913
		       && ((Comparable) class415_30_.anObject4665)
			      .compareTo(class415_32_.anObject4665) > 0)
		i_27_ = i_31_;
	    else
		i_27_ = i_29_;
	    if (null != aComparator11912) {
		if (aComparator11912.compare(class415.anObject4665,
					     (aClass415Array11914[i_27_]
					      .anObject4665))
		    <= 0)
		    break;
	    } else if (((Comparable) class415.anObject4665)
			   .compareTo(aClass415Array11914[i_27_].anObject4665)
		       <= 0)
		break;
	    aClass415Array11914[i] = aClass415Array11914[i_27_];
	    aClass415Array11914[i].anInt4664 = i * -1235882561;
	}
	aClass415Array11914[i] = class415;
	aClass415Array11914[i].anInt4664 = i * -1235882561;
    }
    
    public boolean method18518(Object object) {
	return aMap11911.containsKey(object);
    }
    
    public boolean method18519(Object object) {
	return aMap11911.containsKey(object);
    }
    
    void method18520(int i) {
	Class415 class415 = aClass415Array11914[i];
	int i_33_;
	for (/**/; i > 0; i = i_33_) {
	    i_33_ = i - 1 >>> 1;
	    Class415 class415_34_ = aClass415Array11914[i_33_];
	    if (null != aComparator11912) {
		if (aComparator11912.compare(class415.anObject4665,
					     class415_34_.anObject4665)
		    >= 0)
		    break;
	    } else if (((Comparable) class415.anObject4665)
			   .compareTo(class415_34_.anObject4665)
		       >= 0)
		break;
	    aClass415Array11914[i] = class415_34_;
	    aClass415Array11914[i].anInt4664 = -1235882561 * i;
	}
	aClass415Array11914[i] = class415;
	aClass415Array11914[i].anInt4664 = -1235882561 * i;
    }
}
