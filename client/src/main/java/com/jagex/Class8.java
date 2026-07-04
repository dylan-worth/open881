/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class8 implements Interface4
{
    Interface54 anInterface54_60;
    Map aMap61;
    
    public void method46(int i) {
	if (aMap61 != null)
	    aMap61.remove(Integer.valueOf(i));
    }
    
    public int method32(int i, int i_0_) {
	if (aMap61 != null) {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 != null)
		return ((Integer) class429.anObject4819).intValue();
	}
	return ((Integer) anInterface54_60.method373(i, -1812062755))
		   .intValue();
    }
    
    public void method27(int i, long l) {
	if (aMap61 == null) {
	    aMap61 = new HashMap();
	    aMap61.put(Integer.valueOf(i), new Class429(i, Long.valueOf(l)));
	} else {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 == null)
		aMap61.put(Integer.valueOf(i),
			   new Class429(i, Long.valueOf(l)));
	    else
		class429.anObject4819 = Long.valueOf(l);
	}
    }
    
    public void method28(int i, int i_1_, byte i_2_) {
	if (null == aMap61) {
	    aMap61 = new HashMap();
	    aMap61.put(Integer.valueOf(i),
		       new Class429(i, Integer.valueOf(i_1_)));
	} else {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 == null)
		aMap61.put(Integer.valueOf(i),
			   new Class429(i, Integer.valueOf(i_1_)));
	    else
		class429.anObject4819 = Integer.valueOf(i_1_);
	}
    }
    
    public void method48(int i) {
	if (aMap61 != null)
	    aMap61.remove(Integer.valueOf(i));
    }
    
    public long method26(int i, int i_3_) {
	if (aMap61 != null) {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 != null)
		return ((Long) class429.anObject4819).longValue();
	}
	return ((Long) anInterface54_60.method373(i, -1859503274)).longValue();
    }
    
    public Iterator method574() {
	if (null == aMap61)
	    return Collections.emptyList().iterator();
	return aMap61.values().iterator();
    }
    
    public void method33(int i) {
	if (aMap61 != null)
	    aMap61.clear();
    }
    
    public void method31(int i, int i_4_) {
	if (aMap61 != null)
	    aMap61.remove(Integer.valueOf(i));
    }
    
    public Iterator iterator() {
	if (null == aMap61)
	    return Collections.emptyList().iterator();
	return aMap61.values().iterator();
    }
    
    public Iterator method575() {
	if (null == aMap61)
	    return Collections.emptyList().iterator();
	return aMap61.values().iterator();
    }
    
    public void method29(int i, Object object, short i_5_) {
	if (null == aMap61) {
	    aMap61 = new HashMap();
	    aMap61.put(Integer.valueOf(i), new Class429(i, object));
	} else {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 == null)
		aMap61.put(Integer.valueOf(i), new Class429(i, object));
	    else
		class429.anObject4819 = object;
	}
    }
    
    public int method30(int i) {
	if (aMap61 != null) {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 != null)
		return ((Integer) class429.anObject4819).intValue();
	}
	return ((Integer) anInterface54_60.method373(i, -1989831521))
		   .intValue();
    }
    
    public int method24(int i) {
	if (aMap61 != null) {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 != null)
		return ((Integer) class429.anObject4819).intValue();
	}
	return ((Integer) anInterface54_60.method373(i, -1831659558))
		   .intValue();
    }
    
    public int method34(int i) {
	if (aMap61 != null) {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 != null)
		return ((Integer) class429.anObject4819).intValue();
	}
	return ((Integer) anInterface54_60.method373(i, -2070071860))
		   .intValue();
    }
    
    public void method35(int i, int i_6_) {
	if (null == aMap61) {
	    aMap61 = new HashMap();
	    aMap61.put(Integer.valueOf(i),
		       new Class429(i, Integer.valueOf(i_6_)));
	} else {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 == null)
		aMap61.put(Integer.valueOf(i),
			   new Class429(i, Integer.valueOf(i_6_)));
	    else
		class429.anObject4819 = Integer.valueOf(i_6_);
	}
    }
    
    public void method36(int i, int i_7_) {
	if (null == aMap61) {
	    aMap61 = new HashMap();
	    aMap61.put(Integer.valueOf(i),
		       new Class429(i, Integer.valueOf(i_7_)));
	} else {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 == null)
		aMap61.put(Integer.valueOf(i),
			   new Class429(i, Integer.valueOf(i_7_)));
	    else
		class429.anObject4819 = Integer.valueOf(i_7_);
	}
    }
    
    public long method37(int i) {
	if (aMap61 != null) {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 != null)
		return ((Long) class429.anObject4819).longValue();
	}
	return ((Long) anInterface54_60.method373(i, -2096769300)).longValue();
    }
    
    public void method38(int i, long l) {
	if (aMap61 == null) {
	    aMap61 = new HashMap();
	    aMap61.put(Integer.valueOf(i), new Class429(i, Long.valueOf(l)));
	} else {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 == null)
		aMap61.put(Integer.valueOf(i),
			   new Class429(i, Long.valueOf(l)));
	    else
		class429.anObject4819 = Long.valueOf(l);
	}
    }
    
    public void method39(int i, long l) {
	if (aMap61 == null) {
	    aMap61 = new HashMap();
	    aMap61.put(Integer.valueOf(i), new Class429(i, Long.valueOf(l)));
	} else {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 == null)
		aMap61.put(Integer.valueOf(i),
			   new Class429(i, Long.valueOf(l)));
	    else
		class429.anObject4819 = Long.valueOf(l);
	}
    }
    
    public void method40(int i, long l) {
	if (aMap61 == null) {
	    aMap61 = new HashMap();
	    aMap61.put(Integer.valueOf(i), new Class429(i, Long.valueOf(l)));
	} else {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 == null)
		aMap61.put(Integer.valueOf(i),
			   new Class429(i, Long.valueOf(l)));
	    else
		class429.anObject4819 = Long.valueOf(l);
	}
    }
    
    public Object method41(int i) {
	if (aMap61 != null) {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 != null)
		return class429.anObject4819;
	}
	return anInterface54_60.method373(i, -1812761563);
    }
    
    public void method42(int i, Object object) {
	if (null == aMap61) {
	    aMap61 = new HashMap();
	    aMap61.put(Integer.valueOf(i), new Class429(i, object));
	} else {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 == null)
		aMap61.put(Integer.valueOf(i), new Class429(i, object));
	    else
		class429.anObject4819 = object;
	}
    }
    
    public void method43(int i, Object object) {
	if (null == aMap61) {
	    aMap61 = new HashMap();
	    aMap61.put(Integer.valueOf(i), new Class429(i, object));
	} else {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 == null)
		aMap61.put(Integer.valueOf(i), new Class429(i, object));
	    else
		class429.anObject4819 = object;
	}
    }
    
    public void method44() {
	if (aMap61 != null)
	    aMap61.clear();
    }
    
    public void method25(int i) {
	if (aMap61 != null)
	    aMap61.remove(Integer.valueOf(i));
    }
    
    public Class8(Interface54 interface54) {
	anInterface54_60 = interface54;
    }
    
    public void method47(int i) {
	if (aMap61 != null)
	    aMap61.remove(Integer.valueOf(i));
    }
    
    public Object method45(int i, int i_8_) {
	if (aMap61 != null) {
	    Class429 class429 = (Class429) aMap61.get(Integer.valueOf(i));
	    if (class429 != null)
		return class429.anObject4819;
	}
	return anInterface54_60.method373(i, -1944543051);
    }
    
    public void method49(int i) {
	if (aMap61 != null)
	    aMap61.remove(Integer.valueOf(i));
    }
    
    static final void method576(Class669 class669, byte i) {
	int i_9_ = class669.anIntArray8591[662605117 * class669.anInt8613];
	class669.anInt8594 -= i_9_ * 1460193483;
	String string = Class664.method10998(class669.anObjectArray8593,
					     1485266147 * class669.anInt8594,
					     i_9_, (byte) -61);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = string;
    }
}
