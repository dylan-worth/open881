/* Class155_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class Class155_Sub1 extends Class155
{
    public boolean aBool9763 = false;
    static final int anInt9764 = 1;
    public long aLong9765 = -3766959635688985561L;
    boolean aBool9766 = false;
    Set aSet9767;
    long aLong9768 = 894520806653522477L;
    Class429[] aClass429Array9769;
    Class455[] aClass455Array9770;
    int anInt9771 = 0;
    
    public void method15458(Class24 class24) {
	do {
	    try {
		try {
		    byte[] is = new byte[(int) class24.method831(-1529424298)];
		    int i;
		    for (int i_0_ = 0; i_0_ < is.length; i_0_ += i) {
			i = class24.method843(is, i_0_, is.length - i_0_,
					      1751167349);
			if (-1 == i)
			    throw new EOFException();
		    }
		    Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
		    if ((class534_sub40.aByteArray10810.length
			 - class534_sub40.anInt10811 * 31645619)
			< 1) {
			try {
			    class24.method832(817186526);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_1_ = class534_sub40.method16527(-1342250383);
		    if (i_1_ < 0 || i_1_ > 1) {
			try {
			    class24.method832(1425166858);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class534_sub40.aByteArray10810.length
			 - 31645619 * class534_sub40.anInt10811)
			< 2) {
			try {
			    class24.method832(380767519);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_2_ = class534_sub40.method16529((byte) 1);
		    if ((class534_sub40.aByteArray10810.length
			 - class534_sub40.anInt10811 * 31645619)
			< i_2_ * 6) {
			try {
			    class24.method832(308560076);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
			Class429 class429
			    = Class407.aClass110_Sub1_Sub2_4312
				  .method14495(class534_sub40, (byte) -102);
			if (((aClass455Array9770
			      [class429.anInt4820 * -608978823])
			     == Class455.aClass455_4959)
			    && (((Class150)
				 (Class407.aClass110_Sub1_Sub2_4312.method91
				  (-608978823 * class429.anInt4820,
				   -344258655)))
				    .aClass493_1696.method8102
				    (1252939052).aClass5278.isAssignableFrom
				(class429.anObject4819.getClass())))
			    anInterface4_1742.method29((class429.anInt4820
							* -608978823),
						       class429.anObject4819,
						       (short) -9583);
		    }
		} catch (Exception exception) {
		    try {
			class24.method832(680533396);
		    } catch (Exception exception_4_) {
			exception = exception_4_;
		    }
		    break;
		}
		try {
		    class24.method832(1797968821);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Exception object) {
		try {
		    class24.method832(593639538);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void method15459() {
	if (null != aClass429Array9769
	    && anInt9771 * 375813299 >= aClass429Array9769.length) {
	    aClass429Array9769 = null;
	    anInt9771 = 0;
	}
    }
    
    public void method116(Class150 class150, long l) {
	if (aClass455Array9770[class150.anInt1694 * -1270946121]
	    == Class455.aClass455_4959)
	    aBool9763 = true;
	else if ((aClass455Array9770[class150.anInt1694 * -1270946121]
		  == Class455.aClass455_4960)
		 && method127(class150, (byte) -69) != l) {
	    aBool9766 = true;
	    aSet9767.add(Integer.valueOf(-1270946121 * class150.anInt1694));
	}
	super.method116(class150, l);
    }
    
    public void method15460(Class24 class24, byte i) {
	do {
	    try {
		try {
		    byte[] is = new byte[(int) class24.method831(-930651440)];
		    int i_5_;
		    for (int i_6_ = 0; i_6_ < is.length; i_6_ += i_5_) {
			i_5_ = class24.method843(is, i_6_, is.length - i_6_,
						 1482638256);
			if (-1 == i_5_)
			    throw new EOFException();
		    }
		    Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
		    if ((class534_sub40.aByteArray10810.length
			 - class534_sub40.anInt10811 * 31645619)
			< 1) {
			try {
			    class24.method832(960339727);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_7_ = class534_sub40.method16527(455304830);
		    if (i_7_ < 0 || i_7_ > 1) {
			try {
			    class24.method832(1116084831);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class534_sub40.aByteArray10810.length
			 - 31645619 * class534_sub40.anInt10811)
			< 2) {
			try {
			    class24.method832(975375696);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_8_ = class534_sub40.method16529((byte) 1);
		    if ((class534_sub40.aByteArray10810.length
			 - class534_sub40.anInt10811 * 31645619)
			< i_8_ * 6) {
			try {
			    class24.method832(695889732);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
			Class429 class429
			    = Class407.aClass110_Sub1_Sub2_4312
				  .method14495(class534_sub40, (byte) -56);
			if (((aClass455Array9770
			      [class429.anInt4820 * -608978823])
			     == Class455.aClass455_4959)
			    && (((Class150)
				 (Class407.aClass110_Sub1_Sub2_4312.method91
				  (-608978823 * class429.anInt4820,
				   -1533545088)))
				    .aClass493_1696.method8102
				    (2125137141).aClass5278.isAssignableFrom
				(class429.anObject4819.getClass())))
			    anInterface4_1742.method29((class429.anInt4820
							* -608978823),
						       class429.anObject4819,
						       (short) -26951);
		    }
		} catch (Exception exception) {
		    try {
			class24.method832(2114319797);
		    } catch (Exception exception_10_) {
			exception = exception_10_;
		    }
		    break;
		}
		try {
		    class24.method832(1234955809);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Exception object) {
		try {
		    class24.method832(1421666992);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void method118(Class150 class150, Object object, byte i) {
	if (Class455.aClass455_4959
	    == aClass455Array9770[-1270946121 * class150.anInt1694])
	    aBool9763 = true;
	else if (aClass455Array9770[-1270946121 * class150.anInt1694]
		 == Class455.aClass455_4960) {
	    if (object instanceof String) {
		String string = (String) object;
		if (string.length() > 80)
		    object = string.substring(0, 80);
	    }
	    Object object_11_ = method124(class150, -1443940134);
	    if (object != null && object_11_ != null
		&& !object.equals(object_11_)) {
		aBool9766 = true;
		aSet9767
		    .add(Integer.valueOf(-1270946121 * class150.anInt1694));
	    } else if ((object == null) != (null == object_11_)) {
		aBool9766 = true;
		aSet9767
		    .add(Integer.valueOf(-1270946121 * class150.anInt1694));
	    }
	}
	super.method118(class150, object, (byte) 5);
    }
    
    public void method15461(byte i) {
	for (int i_12_ = 0; i_12_ < aClass455Array9770.length; i_12_++) {
	    if (aClass455Array9770[i_12_] == Class455.aClass455_4961
		|| aClass455Array9770[i_12_] == Class455.aClass455_4960)
		anInterface4_1742.method31(i_12_, -271737171);
	}
	aSet9767.clear();
	aBool9766 = false;
	aClass429Array9769 = null;
	aLong9768 = 894520806653522477L;
    }
    
    public Class155_Sub1(Class110_Sub1 class110_sub1) {
	super(class110_sub1);
	aClass455Array9770 = new Class455[class110_sub1.method90((byte) 103)];
	for (int i = 0; i < class110_sub1.method90((byte) 78); i++)
	    aClass455Array9770[i]
		= (((Class150) class110_sub1.method91(i, -662756047))
		   .aClass455_1697);
	aSet9767 = new HashSet(class110_sub1.method90((byte) 29));
    }
    
    public void method15462(Class24 class24, int i) {
	do {
	    try {
		try {
		    int i_13_ = 3;
		    int i_14_ = 0;
		    Iterator iterator = anInterface4_1742.iterator();
		    while (iterator.hasNext()) {
			Class429 class429 = (Class429) iterator.next();
			if (aClass455Array9770[-608978823 * class429.anInt4820]
			    == Class455.aClass455_4959) {
			    i_13_ += Class407.aClass110_Sub1_Sub2_4312
					 .method14493(class429, (byte) 42);
			    i_14_++;
			}
		    }
		    Class534_Sub40 class534_sub40 = new Class534_Sub40(i_13_);
		    class534_sub40.method16506(1, 574493517);
		    class534_sub40.method16507(i_14_, 1187188984);
		    Iterator iterator_15_ = anInterface4_1742.iterator();
		    while (iterator_15_.hasNext()) {
			Class429 class429 = (Class429) iterator_15_.next();
			if (aClass455Array9770[class429.anInt4820 * -608978823]
			    == Class455.aClass455_4959)
			    Class407.aClass110_Sub1_Sub2_4312.method14494
				(class534_sub40, class429, (byte) -15);
		    }
		    class24.method844(class534_sub40.aByteArray10810, 0,
				      31645619 * class534_sub40.anInt10811,
				      454464553);
		} catch (Exception exception) {
		    try {
			class24.method832(2123087825);
		    } catch (Exception exception_16_) {
			exception = exception_16_;
		    }
		    break;
		}
		try {
		    class24.method832(1144251125);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Exception object) {
		try {
		    class24.method832(872054829);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
	aLong9765 = Class250.method4604((byte) -120) * 3766959635688985561L;
	aBool9763 = false;
    }
    
    public void method115(Class150 class150, long l) {
	if (aClass455Array9770[class150.anInt1694 * -1270946121]
	    == Class455.aClass455_4959)
	    aBool9763 = true;
	else if ((aClass455Array9770[class150.anInt1694 * -1270946121]
		  == Class455.aClass455_4960)
		 && method127(class150, (byte) -11) != l) {
	    aBool9766 = true;
	    aSet9767.add(Integer.valueOf(-1270946121 * class150.anInt1694));
	}
	super.method116(class150, l);
    }
    
    public void method15463(byte i) {
	if (null != aClass429Array9769
	    && anInt9771 * 375813299 >= aClass429Array9769.length) {
	    aClass429Array9769 = null;
	    anInt9771 = 0;
	}
    }
    
    public void method121(Class150 class150, int i) {
	if (aClass455Array9770[-1270946121 * class150.anInt1694]
	    == Class455.aClass455_4959)
	    aBool9763 = true;
	else if ((aClass455Array9770[class150.anInt1694 * -1270946121]
		  == Class455.aClass455_4960)
		 && method120(class150, (byte) -7) != i) {
	    aBool9766 = true;
	    aSet9767.add(Integer.valueOf(class150.anInt1694 * -1270946121));
	}
	super.method114(class150, i, -1996591727);
    }
    
    public void method128(Class150 class150, int i) {
	if (aClass455Array9770[-1270946121 * class150.anInt1694]
	    == Class455.aClass455_4959)
	    aBool9763 = true;
	else if ((aClass455Array9770[class150.anInt1694 * -1270946121]
		  == Class455.aClass455_4960)
		 && method120(class150, (byte) -47) != i) {
	    aBool9766 = true;
	    aSet9767.add(Integer.valueOf(class150.anInt1694 * -1270946121));
	}
	super.method114(class150, i, 207368720);
    }
    
    public void method15464(byte i) {
	anInt9771 = 0;
    }
    
    public void method113(Class150 class150, long l) {
	if (aClass455Array9770[class150.anInt1694 * -1270946121]
	    == Class455.aClass455_4959)
	    aBool9763 = true;
	else if ((aClass455Array9770[class150.anInt1694 * -1270946121]
		  == Class455.aClass455_4960)
		 && method127(class150, (byte) 42) != l) {
	    aBool9766 = true;
	    aSet9767.add(Integer.valueOf(-1270946121 * class150.anInt1694));
	}
	super.method116(class150, l);
    }
    
    public void method130(Class150 class150, long l) {
	if (aClass455Array9770[class150.anInt1694 * -1270946121]
	    == Class455.aClass455_4959)
	    aBool9763 = true;
	else if ((aClass455Array9770[class150.anInt1694 * -1270946121]
		  == Class455.aClass455_4960)
		 && method127(class150, (byte) 31) != l) {
	    aBool9766 = true;
	    aSet9767.add(Integer.valueOf(-1270946121 * class150.anInt1694));
	}
	super.method116(class150, l);
    }
    
    public void method138(Class150 class150, Object object) {
	if (Class455.aClass455_4959
	    == aClass455Array9770[-1270946121 * class150.anInt1694])
	    aBool9763 = true;
	else if (aClass455Array9770[-1270946121 * class150.anInt1694]
		 == Class455.aClass455_4960) {
	    if (object instanceof String) {
		String string = (String) object;
		if (string.length() > 80)
		    object = string.substring(0, 80);
	    }
	    Object object_17_ = method124(class150, 2008115778);
	    if (object != null && object_17_ != null
		&& !object.equals(object_17_)) {
		aBool9766 = true;
		aSet9767
		    .add(Integer.valueOf(-1270946121 * class150.anInt1694));
	    } else if ((object == null) != (null == object_17_)) {
		aBool9766 = true;
		aSet9767
		    .add(Integer.valueOf(-1270946121 * class150.anInt1694));
	    }
	}
	super.method118(class150, object, (byte) -89);
    }
    
    public void method15465() {
	anInt9771 = 0;
    }
    
    public void method15466() {
	anInt9771 = 0;
    }
    
    public void method15467(Class24 class24) {
	do {
	    try {
		try {
		    byte[] is = new byte[(int) class24.method831(-1913392651)];
		    int i;
		    for (int i_18_ = 0; i_18_ < is.length; i_18_ += i) {
			i = class24.method843(is, i_18_, is.length - i_18_,
					      1676481145);
			if (-1 == i)
			    throw new EOFException();
		    }
		    Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
		    if ((class534_sub40.aByteArray10810.length
			 - class534_sub40.anInt10811 * 31645619)
			< 1) {
			try {
			    class24.method832(1686478304);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_19_ = class534_sub40.method16527(-1182192638);
		    if (i_19_ < 0 || i_19_ > 1) {
			try {
			    class24.method832(1739011708);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class534_sub40.aByteArray10810.length
			 - 31645619 * class534_sub40.anInt10811)
			< 2) {
			try {
			    class24.method832(836327930);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_20_ = class534_sub40.method16529((byte) 1);
		    if ((class534_sub40.aByteArray10810.length
			 - class534_sub40.anInt10811 * 31645619)
			< i_20_ * 6) {
			try {
			    class24.method832(1774509414);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
			Class429 class429
			    = Class407.aClass110_Sub1_Sub2_4312
				  .method14495(class534_sub40, (byte) -110);
			if (((aClass455Array9770
			      [class429.anInt4820 * -608978823])
			     == Class455.aClass455_4959)
			    && (((Class150)
				 (Class407.aClass110_Sub1_Sub2_4312.method91
				  (-608978823 * class429.anInt4820,
				   -2000381309)))
				    .aClass493_1696.method8102
				    (1973589604).aClass5278.isAssignableFrom
				(class429.anObject4819.getClass())))
			    anInterface4_1742.method29((class429.anInt4820
							* -608978823),
						       class429.anObject4819,
						       (short) -15499);
		    }
		} catch (Exception exception) {
		    try {
			class24.method832(2042142655);
		    } catch (Exception exception_22_) {
			exception = exception_22_;
		    }
		    break;
		}
		try {
		    class24.method832(533848855);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Exception object) {
		try {
		    class24.method832(776747163);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void method15468(byte i) {
	if (Class250.method4604((byte) -41)
	    >= aLong9768 * 1272730396758921819L) {
	    if (null == aClass429Array9769) {
		if (!aBool9766)
		    return;
		aClass429Array9769 = new Class429[aSet9767.size()];
		int i_23_ = 0;
		Iterator iterator = aSet9767.iterator();
		while (iterator.hasNext()) {
		    int i_24_ = ((Integer) iterator.next()).intValue();
		    aClass429Array9769[i_23_++]
			= new Class429(i_24_,
				       anInterface4_1742
					   .method45(i_24_, -2128615502));
		}
		anInt9771 = 0;
		aBool9766 = false;
		aSet9767.clear();
	    }
	    if (aClass429Array9769 != null
		&& anInt9771 * 375813299 < aClass429Array9769.length) {
		Class100 class100 = Class201.method3864(2095398292);
		if (1030372175 * class100.anInt1181 <= 1200) {
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4183,
					      class100.aClass13_1183,
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16507(0, 2098943393);
		    int i_25_
			= (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			   * 31645619);
		    class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			+= -1387468933;
		    for (/**/;
			 anInt9771 * 375813299 < aClass429Array9769.length;
			 anInt9771 += -289056133) {
			Class429 class429
			    = aClass429Array9769[anInt9771 * 375813299];
			if ((class100.anInt1181 * 1030372175
			     + (class534_sub19.aClass534_Sub40_Sub1_10513
				.anInt10811) * 31645619
			     + Class407.aClass110_Sub1_Sub2_4312
				   .method14493(class429, (byte) -104))
			    > 1500)
			    break;
			Class407.aClass110_Sub1_Sub2_4312.method14494
			    (class534_sub19.aClass534_Sub40_Sub1_10513,
			     class429, (byte) -66);
		    }
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16733
			((class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			  * 31645619) - i_25_,
			 -743522337);
		    if (anInt9771 * 375813299 >= aClass429Array9769.length)
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .aByteArray10810[i_25_]
			    = (byte) 1;
		    else
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .aByteArray10810[i_25_]
			    = (byte) 0;
		    class100.method1863(class534_sub19, (byte) 78);
		    aLong9768 = ((Class250.method4604((byte) -27) + 1000L)
				 * -894520806653522477L);
		}
	    }
	}
    }
    
    public void method15469(Class24 class24) {
	do {
	    try {
		try {
		    byte[] is = new byte[(int) class24.method831(-677084105)];
		    int i;
		    for (int i_26_ = 0; i_26_ < is.length; i_26_ += i) {
			i = class24.method843(is, i_26_, is.length - i_26_,
					      1618679601);
			if (-1 == i)
			    throw new EOFException();
		    }
		    Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
		    if ((class534_sub40.aByteArray10810.length
			 - class534_sub40.anInt10811 * 31645619)
			< 1) {
			try {
			    class24.method832(1853637867);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_27_ = class534_sub40.method16527(-1839112903);
		    if (i_27_ < 0 || i_27_ > 1) {
			try {
			    class24.method832(1174528034);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    if ((class534_sub40.aByteArray10810.length
			 - 31645619 * class534_sub40.anInt10811)
			< 2) {
			try {
			    class24.method832(1116814808);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    int i_28_ = class534_sub40.method16529((byte) 1);
		    if ((class534_sub40.aByteArray10810.length
			 - class534_sub40.anInt10811 * 31645619)
			< i_28_ * 6) {
			try {
			    class24.method832(2054949244);
			} catch (Exception exception) {
			    /* empty */
			}
			break;
		    }
		    for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
			Class429 class429
			    = Class407.aClass110_Sub1_Sub2_4312
				  .method14495(class534_sub40, (byte) -89);
			if (((aClass455Array9770
			      [class429.anInt4820 * -608978823])
			     == Class455.aClass455_4959)
			    && (((Class150)
				 (Class407.aClass110_Sub1_Sub2_4312.method91
				  (-608978823 * class429.anInt4820,
				   167373567)))
				    .aClass493_1696.method8102
				    (1961011360).aClass5278.isAssignableFrom
				(class429.anObject4819.getClass())))
			    anInterface4_1742.method29((class429.anInt4820
							* -608978823),
						       class429.anObject4819,
						       (short) 1162);
		    }
		} catch (Exception exception) {
		    try {
			class24.method832(1529752313);
		    } catch (Exception exception_30_) {
			exception = exception_30_;
		    }
		    break;
		}
		try {
		    class24.method832(1115001178);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Exception object) {
		try {
		    class24.method832(498900344);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public void method15470() {
	if (Class250.method4604((byte) -117)
	    >= aLong9768 * 1272730396758921819L) {
	    if (null == aClass429Array9769) {
		if (!aBool9766)
		    return;
		aClass429Array9769 = new Class429[aSet9767.size()];
		int i = 0;
		Iterator iterator = aSet9767.iterator();
		while (iterator.hasNext()) {
		    int i_31_ = ((Integer) iterator.next()).intValue();
		    aClass429Array9769[i++]
			= new Class429(i_31_,
				       anInterface4_1742
					   .method45(i_31_, -1990905986));
		}
		anInt9771 = 0;
		aBool9766 = false;
		aSet9767.clear();
	    }
	    if (aClass429Array9769 != null
		&& anInt9771 * 375813299 < aClass429Array9769.length) {
		Class100 class100 = Class201.method3864(2095398292);
		if (1030372175 * class100.anInt1181 <= 1200) {
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4183,
					      class100.aClass13_1183,
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16507(0, 854435080);
		    int i
			= (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			   * 31645619);
		    class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			+= -1387468933;
		    for (/**/;
			 anInt9771 * 375813299 < aClass429Array9769.length;
			 anInt9771 += -289056133) {
			Class429 class429
			    = aClass429Array9769[anInt9771 * 375813299];
			if ((class100.anInt1181 * 1030372175
			     + (class534_sub19.aClass534_Sub40_Sub1_10513
				.anInt10811) * 31645619
			     + Class407.aClass110_Sub1_Sub2_4312
				   .method14493(class429, (byte) 9))
			    > 1500)
			    break;
			Class407.aClass110_Sub1_Sub2_4312.method14494
			    (class534_sub19.aClass534_Sub40_Sub1_10513,
			     class429, (byte) -123);
		    }
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16733
			((class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			  * 31645619) - i,
			 -541826445);
		    if (anInt9771 * 375813299 >= aClass429Array9769.length)
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .aByteArray10810[i]
			    = (byte) 1;
		    else
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .aByteArray10810[i]
			    = (byte) 0;
		    class100.method1863(class534_sub19, (byte) 6);
		    aLong9768 = ((Class250.method4604((byte) -22) + 1000L)
				 * -894520806653522477L);
		}
	    }
	}
    }
    
    public void method15471() {
	if (Class250.method4604((byte) -66)
	    >= aLong9768 * 1272730396758921819L) {
	    if (null == aClass429Array9769) {
		if (!aBool9766)
		    return;
		aClass429Array9769 = new Class429[aSet9767.size()];
		int i = 0;
		Iterator iterator = aSet9767.iterator();
		while (iterator.hasNext()) {
		    int i_32_ = ((Integer) iterator.next()).intValue();
		    aClass429Array9769[i++]
			= new Class429(i_32_,
				       anInterface4_1742
					   .method45(i_32_, -2061240495));
		}
		anInt9771 = 0;
		aBool9766 = false;
		aSet9767.clear();
	    }
	    if (aClass429Array9769 != null
		&& anInt9771 * 375813299 < aClass429Array9769.length) {
		Class100 class100 = Class201.method3864(2095398292);
		if (1030372175 * class100.anInt1181 <= 1200) {
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4183,
					      class100.aClass13_1183,
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16507(0, 1835199461);
		    int i
			= (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			   * 31645619);
		    class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			+= -1387468933;
		    for (/**/;
			 anInt9771 * 375813299 < aClass429Array9769.length;
			 anInt9771 += -289056133) {
			Class429 class429
			    = aClass429Array9769[anInt9771 * 375813299];
			if ((class100.anInt1181 * 1030372175
			     + (class534_sub19.aClass534_Sub40_Sub1_10513
				.anInt10811) * 31645619
			     + Class407.aClass110_Sub1_Sub2_4312
				   .method14493(class429, (byte) -38))
			    > 1500)
			    break;
			Class407.aClass110_Sub1_Sub2_4312.method14494
			    (class534_sub19.aClass534_Sub40_Sub1_10513,
			     class429, (byte) -73);
		    }
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16733
			((class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			  * 31645619) - i,
			 1088649786);
		    if (anInt9771 * 375813299 >= aClass429Array9769.length)
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .aByteArray10810[i]
			    = (byte) 1;
		    else
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .aByteArray10810[i]
			    = (byte) 0;
		    class100.method1863(class534_sub19, (byte) 117);
		    aLong9768 = ((Class250.method4604((byte) -85) + 1000L)
				 * -894520806653522477L);
		}
	    }
	}
    }
    
    public void method114(Class150 class150, int i, int i_33_) {
	if (aClass455Array9770[-1270946121 * class150.anInt1694]
	    == Class455.aClass455_4959)
	    aBool9763 = true;
	else if ((aClass455Array9770[class150.anInt1694 * -1270946121]
		  == Class455.aClass455_4960)
		 && method120(class150, (byte) -106) != i) {
	    aBool9766 = true;
	    aSet9767.add(Integer.valueOf(class150.anInt1694 * -1270946121));
	}
	super.method114(class150, i, 637600584);
    }
    
    static final void method15472(Class669 class669, int i) {
	boolean bool = ((class669.anIntArray8595
			 [(class669.anInt8600 -= 308999563) * 2088438307])
			!= 0);
	int i_34_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = Class281.method5235((long) i_34_, 0, bool,
				  Class539.aClass672_7171, -2099096999);
    }
    
    public static void method15473(int i) {
	Class201.aClass9_2180.method578((byte) -30);
	Class201.aClass700_2183.method14152(-1901088462);
	Class201.aClass204Array2178 = null;
	Class65.aClass192Array712 = null;
	Class539_Sub1.aClass195Array10326 = null;
	Class45.aClass209Array330 = null;
	Class700.aClass200Array8807 = null;
	Class201.anInt2187 = -213444879;
	Class201.anInt2182 = 0;
	Class201.anInt2179 = 0;
	Class665.aClass202_8557 = null;
	Class201.anInt2185 = -2070289217;
	Class201.anInt2186 = -683420367;
	if (Class201.aBool2184) {
	    client.aShort11317 = Class34.aShort279;
	    client.aShort11318 = Class170.aShort1793;
	    client.aShort11315 = Class200_Sub10.aShort9927;
	    client.aShort11316 = Class201.aShort2181;
	    Class201.aBool2184 = false;
	}
    }
}
