/* Class450_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.util.Iterator;

public class Class450_Sub1 extends Class450
{
    Class546 aClass546_10328;
    
    public boolean method7337(int i) {
	if (aClass546_10328 != null) {
	    long l = Class250.method4604((byte) -49);
	    int i_0_ = (int) (l - -8040290761580816281L * aLong4926);
	    aLong4926 = -1928393657558056105L * l;
	    if (i_0_ > 200)
		i_0_ = 200;
	    anInt4925 += 1431766545 * i_0_;
	    if (anInt4925 * -229856527 > 30000) {
		try {
		    aClass546_10328.method8975(2097154275);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
	    }
	}
	if (null == aClass546_10328) {
	    if (method7336(-518544099) == 0 && method7344(-1718556955) == 0)
		return true;
	    return false;
	}
	boolean bool;
	try {
	    for (Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
		     = ((Class534_Sub18_Sub18_Sub2)
			aClass696_4920.method14078(1221951837));
		 class534_sub18_sub18_sub2 != null;
		 class534_sub18_sub18_sub2
		     = ((Class534_Sub18_Sub18_Sub2)
			aClass696_4920.method14080((byte) 41))) {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(1, 687792256);
		aClass534_Sub40_4935.method16692((class534_sub18_sub18_sub2
						  .aLong10509)
						 * -753566336061658369L);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
		aClass696_4914.method14076(class534_sub18_sub18_sub2,
					   (byte) 28);
	    }
	    for (Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
		     = ((Class534_Sub18_Sub18_Sub2)
			aClass696_4922.method14078(1221951837));
		 null != class534_sub18_sub18_sub2;
		 class534_sub18_sub18_sub2
		     = ((Class534_Sub18_Sub18_Sub2)
			aClass696_4922.method14080((byte) 117))) {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(0, 1200168421);
		aClass534_Sub40_4935.method16692((class534_sub18_sub18_sub2
						  .aLong10509)
						 * -753566336061658369L);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
		aClass696_4923.method14076(class534_sub18_sub18_sub2,
					   (byte) 19);
	    }
	    for (int i_1_ = 0; i_1_ < 100; i_1_++) {
		int i_2_ = aClass546_10328.method8970(-129276299);
		if (i_2_ < 0)
		    throw new IOException();
		if (i_2_ == 0)
		    break;
		anInt4925 = 0;
		if (aClass534_Sub18_Sub18_Sub2_4931 == null) {
		    int i_3_ = 5 - 31645619 * aClass534_Sub40_4932.anInt10811;
		    if (i_3_ > i_2_)
			i_3_ = i_2_;
		    aClass546_10328.method8969((aClass534_Sub40_4932
						.aByteArray10810),
					       31645619 * (aClass534_Sub40_4932
							   .anInt10811),
					       i_3_, (byte) 82);
		    if (aByte4927 != 0) {
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
			    aClass534_Sub40_4932.aByteArray10810
				[i_4_ + (31645619
					 * aClass534_Sub40_4932.anInt10811)]
				^= aByte4927;
		    }
		    aClass534_Sub40_4932.anInt10811 += i_3_ * -1387468933;
		    if (31645619 * aClass534_Sub40_4932.anInt10811 >= 5) {
			aClass534_Sub40_4932.anInt10811 = 0;
			int i_5_
			    = aClass534_Sub40_4932.method16527(1648870259);
			int i_6_
			    = aClass534_Sub40_4932.method16533(-258848859);
			boolean bool_7_ = 0 != (i_6_ & ~0x7fffffff);
			int i_8_ = i_6_ & 0x7fffffff;
			long l = (long) i_8_ + ((long) i_5_ << 32);
			if (bool_7_) {
			    Iterator iterator = aClass696_4923.iterator();
			    while (iterator.hasNext()) {
				Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
				    = ((Class534_Sub18_Sub18_Sub2)
				       iterator.next());
				if (l == (class534_sub18_sub18_sub2.aLong10509
					  * -753566336061658369L)) {
				    aClass534_Sub18_Sub18_Sub2_4931
					= class534_sub18_sub18_sub2;
				    break;
				}
			    }
			} else {
			    Iterator iterator = aClass696_4914.iterator();
			    while (iterator.hasNext()) {
				Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
				    = ((Class534_Sub18_Sub18_Sub2)
				       iterator.next());
				if (l == (-753566336061658369L
					  * (class534_sub18_sub18_sub2
					     .aLong10509))) {
				    aClass534_Sub18_Sub18_Sub2_4931
					= class534_sub18_sub18_sub2;
				    break;
				}
			    }
			}
			if (null == aClass534_Sub18_Sub18_Sub2_4931)
			    throw new IOException();
			anInt4934 = -708365043;
			aClass534_Sub40_4932.anInt10811 = 0;
			aClass534_Sub40_4933.anInt10811 = 0;
		    }
		} else {
		    Class534_Sub40 class534_sub40
			= (aClass534_Sub18_Sub18_Sub2_4931
			   .aClass534_Sub40_12132);
		    if (null == class534_sub40) {
			int i_9_
			    = 5 - 31645619 * aClass534_Sub40_4933.anInt10811;
			if (i_9_ > i_2_)
			    i_9_ = i_2_;
			aClass546_10328.method8969
			    (aClass534_Sub40_4933.aByteArray10810,
			     31645619 * aClass534_Sub40_4933.anInt10811, i_9_,
			     (byte) 100);
			if (0 != aByte4927) {
			    for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
				aClass534_Sub40_4933.aByteArray10810
				    [(aClass534_Sub40_4933.anInt10811
				      * 31645619) + i_10_]
				    ^= aByte4927;
			}
			aClass534_Sub40_4933.anInt10811 += -1387468933 * i_9_;
			if (31645619 * aClass534_Sub40_4933.anInt10811 >= 5) {
			    aClass534_Sub40_4933.anInt10811 = 0;
			    int i_11_
				= aClass534_Sub40_4933.method16527(661821041);
			    int i_12_
				= aClass534_Sub40_4933.method16533(-258848859);
			    int i_13_ = 5;
			    if (i_11_ != Class473.aClass473_5172.method93())
				i_13_ = 9;
			    class534_sub40
				= aClass534_Sub18_Sub18_Sub2_4931
				      .aClass534_Sub40_12132
				= (new Class534_Sub40
				   (aClass534_Sub18_Sub18_Sub2_4931.aByte12133
				    + (i_12_ + i_13_)));
			    class534_sub40.method16506(i_11_, 695096977);
			    class534_sub40.method16510(i_12_, -69634719);
			    anInt4934 += -708365043;
			}
		    } else {
			int i_14_
			    = (class534_sub40.aByteArray10810.length
			       - aClass534_Sub18_Sub18_Sub2_4931.aByte12133);
			int i_15_ = 102400 - -826136359 * anInt4934;
			if (i_15_
			    > i_14_ - class534_sub40.anInt10811 * 31645619)
			    i_15_
				= i_14_ - class534_sub40.anInt10811 * 31645619;
			if (i_15_ > i_2_)
			    i_15_ = i_2_;
			aClass546_10328.method8969((class534_sub40
						    .aByteArray10810),
						   31645619 * (class534_sub40
							       .anInt10811),
						   i_15_, (byte) 75);
			if (0 != aByte4927) {
			    for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
				class534_sub40.aByteArray10810
				    [(i_16_
				      + 31645619 * class534_sub40.anInt10811)]
				    ^= aByte4927;
			}
			class534_sub40.anInt10811 += i_15_ * -1387468933;
			anInt4934 += -1859659927 * i_15_;
			if (class534_sub40.anInt10811 * 31645619 == i_14_) {
			    aClass534_Sub18_Sub18_Sub2_4931
				.method16180(-421776830);
			    aClass534_Sub18_Sub18_Sub2_4931.aBool11888 = false;
			    aClass534_Sub18_Sub18_Sub2_4931 = null;
			} else if (102400 == -826136359 * anInt4934) {
			    anInt4934 = 0;
			    aClass534_Sub18_Sub18_Sub2_4931 = null;
			}
		    }
		}
	    }
	    bool = true;
	} catch (IOException ioexception) {
	    try {
		aClass546_10328.method8975(1710894775);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass546_10328 = null;
	    anInt4928 += 1323405863;
	    anInt4929 = -1672934554;
	    if (method7336(850661004) == 0 && method7344(-622360179) == 0)
		return true;
	    return false;
	}
	return bool;
    }
    
    void method7354(int i, int i_17_, byte i_18_) {
	try {
	    aClass546_10328.method8975(-347311694);
	} catch (Exception exception) {
	    /* empty */
	}
	aClass546_10328 = null;
	anInt4928 += 1323405863;
	anInt4929 = -836467277;
	aByte4927 = (byte) (int) (Math.random() * 255.0 + 1.0);
	anInt4930 = 624355545 * i;
	anInt4924 = -1826868259 * i_17_;
    }
    
    public void method7360() {
	if (null != aClass546_10328) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(7, 947412355);
		aClass534_Sub40_4935.method16692(0L);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(1557189603);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
    }
    
    public void method7335(Object object, boolean bool, byte i) {
	if (aClass546_10328 != null) {
	    try {
		aClass546_10328.method8975(-864253634);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass546_10328 = null;
	}
	aClass546_10328 = (Class546) object;
	method15926(2078568777);
	method7338(bool, 712879138);
	aClass534_Sub40_4932.anInt10811 = 0;
	aClass534_Sub40_4933.anInt10811 = 0;
	aClass534_Sub18_Sub18_Sub2_4931 = null;
	for (;;) {
	    Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
		= ((Class534_Sub18_Sub18_Sub2)
		   aClass696_4914.method14077((byte) -30));
	    if (null == class534_sub18_sub18_sub2)
		break;
	    class534_sub18_sub18_sub2.aClass534_Sub40_12132 = null;
	    aClass696_4920.method14076(class534_sub18_sub18_sub2, (byte) 85);
	}
	for (;;) {
	    Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
		= ((Class534_Sub18_Sub18_Sub2)
		   aClass696_4923.method14077((byte) -81));
	    if (class534_sub18_sub18_sub2 == null)
		break;
	    class534_sub18_sub18_sub2.aClass534_Sub40_12132 = null;
	    aClass696_4922.method14076(class534_sub18_sub18_sub2, (byte) 121);
	}
	if (aByte4927 != 0) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(4, 1739356670);
		aClass534_Sub40_4935.method16506(aByte4927, 349811950);
		aClass534_Sub40_4935.method16510(0, -626683185);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(-1082221101);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
	anInt4925 = 0;
	aLong4926 = Class250.method4604((byte) -86) * -1928393657558056105L;
    }
    
    void method15926(int i) {
	if (aClass546_10328 != null) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(6, 1471248197);
		aClass534_Sub40_4935.method16509(4, 570098473);
		aClass534_Sub40_4935.method16507(0, 1001696626);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(1989638598);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
    }
    
    public void method7356(Object object, boolean bool) {
	if (aClass546_10328 != null) {
	    try {
		aClass546_10328.method8975(-1239154854);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass546_10328 = null;
	}
	aClass546_10328 = (Class546) object;
	method15926(1250555508);
	method7338(bool, -612597753);
	aClass534_Sub40_4932.anInt10811 = 0;
	aClass534_Sub40_4933.anInt10811 = 0;
	aClass534_Sub18_Sub18_Sub2_4931 = null;
	for (;;) {
	    Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
		= ((Class534_Sub18_Sub18_Sub2)
		   aClass696_4914.method14077((byte) -3));
	    if (null == class534_sub18_sub18_sub2)
		break;
	    class534_sub18_sub18_sub2.aClass534_Sub40_12132 = null;
	    aClass696_4920.method14076(class534_sub18_sub18_sub2, (byte) 84);
	}
	for (;;) {
	    Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
		= ((Class534_Sub18_Sub18_Sub2)
		   aClass696_4923.method14077((byte) -1));
	    if (class534_sub18_sub18_sub2 == null)
		break;
	    class534_sub18_sub18_sub2.aClass534_Sub40_12132 = null;
	    aClass696_4922.method14076(class534_sub18_sub18_sub2, (byte) 114);
	}
	if (aByte4927 != 0) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(4, 1839845509);
		aClass534_Sub40_4935.method16506(aByte4927, 1329550030);
		aClass534_Sub40_4935.method16510(0, -522815354);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(-695050339);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
	anInt4925 = 0;
	aLong4926 = Class250.method4604((byte) -19) * -1928393657558056105L;
    }
    
    public void method7341(int i) {
	if (aClass546_10328 != null)
	    aClass546_10328.method8975(1697460113);
    }
    
    public void method7342(byte i) {
	if (aClass546_10328 != null)
	    aClass546_10328.method8973((byte) 28);
    }
    
    public void method7358() {
	if (null != aClass546_10328) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(7, 360655988);
		aClass534_Sub40_4935.method16692(0L);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(-366872015);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
    }
    
    public boolean method7350() {
	if (aClass546_10328 != null) {
	    long l = Class250.method4604((byte) -54);
	    int i = (int) (l - -8040290761580816281L * aLong4926);
	    aLong4926 = -1928393657558056105L * l;
	    if (i > 200)
		i = 200;
	    anInt4925 += 1431766545 * i;
	    if (anInt4925 * -229856527 > 30000) {
		try {
		    aClass546_10328.method8975(-438428642);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
	    }
	}
	if (null == aClass546_10328) {
	    if (method7336(730613401) == 0 && method7344(-426631671) == 0)
		return true;
	    return false;
	}
	boolean bool;
	try {
	    for (Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
		     = ((Class534_Sub18_Sub18_Sub2)
			aClass696_4920.method14078(1221951837));
		 class534_sub18_sub18_sub2 != null;
		 class534_sub18_sub18_sub2
		     = ((Class534_Sub18_Sub18_Sub2)
			aClass696_4920.method14080((byte) 39))) {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(1, 316196020);
		aClass534_Sub40_4935.method16692((class534_sub18_sub18_sub2
						  .aLong10509)
						 * -753566336061658369L);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
		aClass696_4914.method14076(class534_sub18_sub18_sub2,
					   (byte) 120);
	    }
	    for (Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
		     = ((Class534_Sub18_Sub18_Sub2)
			aClass696_4922.method14078(1221951837));
		 null != class534_sub18_sub18_sub2;
		 class534_sub18_sub18_sub2
		     = ((Class534_Sub18_Sub18_Sub2)
			aClass696_4922.method14080((byte) 26))) {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(0, 1516019399);
		aClass534_Sub40_4935.method16692((class534_sub18_sub18_sub2
						  .aLong10509)
						 * -753566336061658369L);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
		aClass696_4923.method14076(class534_sub18_sub18_sub2,
					   (byte) 14);
	    }
	    for (int i = 0; i < 100; i++) {
		int i_19_ = aClass546_10328.method8970(-129276299);
		if (i_19_ < 0)
		    throw new IOException();
		if (i_19_ == 0)
		    break;
		anInt4925 = 0;
		if (aClass534_Sub18_Sub18_Sub2_4931 == null) {
		    int i_20_ = 5 - 31645619 * aClass534_Sub40_4932.anInt10811;
		    if (i_20_ > i_19_)
			i_20_ = i_19_;
		    aClass546_10328.method8969((aClass534_Sub40_4932
						.aByteArray10810),
					       31645619 * (aClass534_Sub40_4932
							   .anInt10811),
					       i_20_, (byte) 62);
		    if (aByte4927 != 0) {
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
			    aClass534_Sub40_4932.aByteArray10810
				[i_21_ + (31645619
					  * aClass534_Sub40_4932.anInt10811)]
				^= aByte4927;
		    }
		    aClass534_Sub40_4932.anInt10811 += i_20_ * -1387468933;
		    if (31645619 * aClass534_Sub40_4932.anInt10811 >= 5) {
			aClass534_Sub40_4932.anInt10811 = 0;
			int i_22_
			    = aClass534_Sub40_4932.method16527(-1495816146);
			int i_23_
			    = aClass534_Sub40_4932.method16533(-258848859);
			boolean bool_24_ = 0 != (i_23_ & ~0x7fffffff);
			int i_25_ = i_23_ & 0x7fffffff;
			long l = (long) i_25_ + ((long) i_22_ << 32);
			if (bool_24_) {
			    Iterator iterator = aClass696_4923.iterator();
			    while (iterator.hasNext()) {
				Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
				    = ((Class534_Sub18_Sub18_Sub2)
				       iterator.next());
				if (l == (class534_sub18_sub18_sub2.aLong10509
					  * -753566336061658369L)) {
				    aClass534_Sub18_Sub18_Sub2_4931
					= class534_sub18_sub18_sub2;
				    break;
				}
			    }
			} else {
			    Iterator iterator = aClass696_4914.iterator();
			    while (iterator.hasNext()) {
				Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
				    = ((Class534_Sub18_Sub18_Sub2)
				       iterator.next());
				if (l == (-753566336061658369L
					  * (class534_sub18_sub18_sub2
					     .aLong10509))) {
				    aClass534_Sub18_Sub18_Sub2_4931
					= class534_sub18_sub18_sub2;
				    break;
				}
			    }
			}
			if (null == aClass534_Sub18_Sub18_Sub2_4931)
			    throw new IOException();
			anInt4934 = -708365043;
			aClass534_Sub40_4932.anInt10811 = 0;
			aClass534_Sub40_4933.anInt10811 = 0;
		    }
		} else {
		    Class534_Sub40 class534_sub40
			= (aClass534_Sub18_Sub18_Sub2_4931
			   .aClass534_Sub40_12132);
		    if (null == class534_sub40) {
			int i_26_
			    = 5 - 31645619 * aClass534_Sub40_4933.anInt10811;
			if (i_26_ > i_19_)
			    i_26_ = i_19_;
			aClass546_10328.method8969
			    (aClass534_Sub40_4933.aByteArray10810,
			     31645619 * aClass534_Sub40_4933.anInt10811, i_26_,
			     (byte) 6);
			if (0 != aByte4927) {
			    for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
				aClass534_Sub40_4933.aByteArray10810
				    [(aClass534_Sub40_4933.anInt10811
				      * 31645619) + i_27_]
				    ^= aByte4927;
			}
			aClass534_Sub40_4933.anInt10811 += -1387468933 * i_26_;
			if (31645619 * aClass534_Sub40_4933.anInt10811 >= 5) {
			    aClass534_Sub40_4933.anInt10811 = 0;
			    int i_28_
				= aClass534_Sub40_4933.method16527(763208347);
			    int i_29_
				= aClass534_Sub40_4933.method16533(-258848859);
			    int i_30_ = 5;
			    if (i_28_ != Class473.aClass473_5172.method93())
				i_30_ = 9;
			    class534_sub40
				= aClass534_Sub18_Sub18_Sub2_4931
				      .aClass534_Sub40_12132
				= (new Class534_Sub40
				   (aClass534_Sub18_Sub18_Sub2_4931.aByte12133
				    + (i_29_ + i_30_)));
			    class534_sub40.method16506(i_28_, 1262138157);
			    class534_sub40.method16510(i_29_, -1232338005);
			    anInt4934 += -708365043;
			}
		    } else {
			int i_31_
			    = (class534_sub40.aByteArray10810.length
			       - aClass534_Sub18_Sub18_Sub2_4931.aByte12133);
			int i_32_ = 102400 - -826136359 * anInt4934;
			if (i_32_
			    > i_31_ - class534_sub40.anInt10811 * 31645619)
			    i_32_
				= i_31_ - class534_sub40.anInt10811 * 31645619;
			if (i_32_ > i_19_)
			    i_32_ = i_19_;
			aClass546_10328.method8969((class534_sub40
						    .aByteArray10810),
						   31645619 * (class534_sub40
							       .anInt10811),
						   i_32_, (byte) 124);
			if (0 != aByte4927) {
			    for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
				class534_sub40.aByteArray10810
				    [(i_33_
				      + 31645619 * class534_sub40.anInt10811)]
				    ^= aByte4927;
			}
			class534_sub40.anInt10811 += i_32_ * -1387468933;
			anInt4934 += -1859659927 * i_32_;
			if (class534_sub40.anInt10811 * 31645619 == i_31_) {
			    aClass534_Sub18_Sub18_Sub2_4931
				.method16180(-421776830);
			    aClass534_Sub18_Sub18_Sub2_4931.aBool11888 = false;
			    aClass534_Sub18_Sub18_Sub2_4931 = null;
			} else if (102400 == -826136359 * anInt4934) {
			    anInt4934 = 0;
			    aClass534_Sub18_Sub18_Sub2_4931 = null;
			}
		    }
		}
	    }
	    bool = true;
	} catch (IOException ioexception) {
	    try {
		aClass546_10328.method8975(786027697);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass546_10328 = null;
	    anInt4928 += 1323405863;
	    anInt4929 = -1672934554;
	    if (method7336(-546197969) == 0 && method7344(-1458388441) == 0)
		return true;
	    return false;
	}
	return bool;
    }
    
    public void method7365(Object object, boolean bool) {
	if (aClass546_10328 != null) {
	    try {
		aClass546_10328.method8975(928958124);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass546_10328 = null;
	}
	aClass546_10328 = (Class546) object;
	method15926(-913906500);
	method7338(bool, -2025042220);
	aClass534_Sub40_4932.anInt10811 = 0;
	aClass534_Sub40_4933.anInt10811 = 0;
	aClass534_Sub18_Sub18_Sub2_4931 = null;
	for (;;) {
	    Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
		= ((Class534_Sub18_Sub18_Sub2)
		   aClass696_4914.method14077((byte) -56));
	    if (null == class534_sub18_sub18_sub2)
		break;
	    class534_sub18_sub18_sub2.aClass534_Sub40_12132 = null;
	    aClass696_4920.method14076(class534_sub18_sub18_sub2, (byte) 69);
	}
	for (;;) {
	    Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
		= ((Class534_Sub18_Sub18_Sub2)
		   aClass696_4923.method14077((byte) -27));
	    if (class534_sub18_sub18_sub2 == null)
		break;
	    class534_sub18_sub18_sub2.aClass534_Sub40_12132 = null;
	    aClass696_4922.method14076(class534_sub18_sub18_sub2, (byte) 71);
	}
	if (aByte4927 != 0) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(4, 1017990751);
		aClass534_Sub40_4935.method16506(aByte4927, 2055127858);
		aClass534_Sub40_4935.method16510(0, -1368682448);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(1817511471);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
	anInt4925 = 0;
	aLong4926 = Class250.method4604((byte) -120) * -1928393657558056105L;
    }
    
    public void method7353(boolean bool) {
	if (null != aClass546_10328) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(bool ? 2 : 3, 666412083);
		aClass534_Sub40_4935.method16692(0L);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(-495398860);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
    }
    
    public void method7355(Object object, boolean bool) {
	if (aClass546_10328 != null) {
	    try {
		aClass546_10328.method8975(618893181);
	    } catch (Exception exception) {
		/* empty */
	    }
	    aClass546_10328 = null;
	}
	aClass546_10328 = (Class546) object;
	method15926(-1290935598);
	method7338(bool, -488501338);
	aClass534_Sub40_4932.anInt10811 = 0;
	aClass534_Sub40_4933.anInt10811 = 0;
	aClass534_Sub18_Sub18_Sub2_4931 = null;
	for (;;) {
	    Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
		= ((Class534_Sub18_Sub18_Sub2)
		   aClass696_4914.method14077((byte) -127));
	    if (null == class534_sub18_sub18_sub2)
		break;
	    class534_sub18_sub18_sub2.aClass534_Sub40_12132 = null;
	    aClass696_4920.method14076(class534_sub18_sub18_sub2, (byte) 13);
	}
	for (;;) {
	    Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
		= ((Class534_Sub18_Sub18_Sub2)
		   aClass696_4923.method14077((byte) -115));
	    if (class534_sub18_sub18_sub2 == null)
		break;
	    class534_sub18_sub18_sub2.aClass534_Sub40_12132 = null;
	    aClass696_4922.method14076(class534_sub18_sub18_sub2, (byte) 23);
	}
	if (aByte4927 != 0) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(4, 1836757001);
		aClass534_Sub40_4935.method16506(aByte4927, 830499926);
		aClass534_Sub40_4935.method16510(0, -614354610);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(43240853);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
	anInt4925 = 0;
	aLong4926 = Class250.method4604((byte) -31) * -1928393657558056105L;
    }
    
    void method15927() {
	if (aClass546_10328 != null) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(6, 459826456);
		aClass534_Sub40_4935.method16509(4, -2017082267);
		aClass534_Sub40_4935.method16507(0, 530495857);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(-1264138477);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
    }
    
    void method7333(int i, int i_34_) {
	try {
	    aClass546_10328.method8975(407850482);
	} catch (Exception exception) {
	    /* empty */
	}
	aClass546_10328 = null;
	anInt4928 += 1323405863;
	anInt4929 = -836467277;
	aByte4927 = (byte) (int) (Math.random() * 255.0 + 1.0);
	anInt4930 = 624355545 * i;
	anInt4924 = -1826868259 * i_34_;
    }
    
    public void method7359() {
	if (null != aClass546_10328) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(7, 1364556015);
		aClass534_Sub40_4935.method16692(0L);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(-628099195);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
    }
    
    public void method7367() {
	if (aClass546_10328 != null)
	    aClass546_10328.method8973((byte) -24);
    }
    
    public void method7361() {
	if (aClass546_10328 != null)
	    aClass546_10328.method8975(1008112235);
    }
    
    public void method7331() {
	if (aClass546_10328 != null)
	    aClass546_10328.method8975(617120076);
    }
    
    public void method7363() {
	if (aClass546_10328 != null)
	    aClass546_10328.method8975(-675506517);
    }
    
    public void method7338(boolean bool, int i) {
	if (null != aClass546_10328) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(bool ? 2 : 3, 1900700412);
		aClass534_Sub40_4935.method16692(0L);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(-867976093);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
    }
    
    public void method7362() {
	if (aClass546_10328 != null)
	    aClass546_10328.method8973((byte) -24);
    }
    
    public void method7366() {
	if (aClass546_10328 != null)
	    aClass546_10328.method8973((byte) -68);
    }
    
    void method15928() {
	if (aClass546_10328 != null) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(6, 1957070752);
		aClass534_Sub40_4935.method16509(4, -1878585477);
		aClass534_Sub40_4935.method16507(0, 1232078997);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(-858695362);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
    }
    
    public void method7368() {
	if (aClass546_10328 != null)
	    aClass546_10328.method8973((byte) -25);
    }
    
    void method15929() {
	if (aClass546_10328 != null) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(6, 1988932763);
		aClass534_Sub40_4935.method16509(4, -315873560);
		aClass534_Sub40_4935.method16507(0, 2086131318);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(-685094392);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
    }
    
    public void method7352() {
	if (aClass546_10328 != null)
	    aClass546_10328.method8975(251197722);
    }
    
    public void method7357(int i) {
	if (null != aClass546_10328) {
	    try {
		aClass534_Sub40_4935.anInt10811 = 0;
		aClass534_Sub40_4935.method16506(7, 1008441980);
		aClass534_Sub40_4935.method16692(0L);
		aClass546_10328.method8971
		    (aClass534_Sub40_4935.aByteArray10810, 0,
		     aClass534_Sub40_4935.aByteArray10810.length, 1552062594);
	    } catch (IOException ioexception) {
		try {
		    aClass546_10328.method8975(-67714725);
		} catch (Exception exception) {
		    /* empty */
		}
		aClass546_10328 = null;
		anInt4928 += 1323405863;
		anInt4929 = -1672934554;
	    }
	}
    }
    
    static final void method15930(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class29.method877(class247, class243, class669, (byte) 76);
    }
}
