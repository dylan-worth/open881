/* Class467 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.math.BigInteger;
import java.util.HashMap;

public class Class467
{
    Class463 aClass463_5127;
    Class464 aClass464_5128;
    BigInteger aBigInteger5129;
    BigInteger aBigInteger5130;
    Class450 aClass450_5131;
    Class534_Sub18_Sub18_Sub2 aClass534_Sub18_Sub18_Sub2_5132;
    Class534_Sub18_Sub18_Sub1 aClass534_Sub18_Sub18_Sub1_5133;
    Class457 aClass457_5134;
    Class457 aClass457_5135;
    Class451_Sub1[] aClass451_Sub1Array5136;
    boolean aBool5137 = false;
    static Class546 aClass546_5138;
    
    public boolean method7585() {
	if (null != aClass457_5134)
	    return true;
	if (null == aClass534_Sub18_Sub18_Sub2_5132) {
	    if (aClass450_5131.method7334(-556188663))
		return false;
	    aClass534_Sub18_Sub18_Sub2_5132
		= aClass450_5131.method7332(255, 255, (byte) 0, true,
					    1575217889);
	}
	if (aClass534_Sub18_Sub18_Sub2_5132.aBool11888)
	    return false;
	Class534_Sub40 class534_sub40
	    = new Class534_Sub40(aClass534_Sub18_Sub18_Sub2_5132
				     .method18460((short) 28104));
	aClass457_5134
	    = new Class457(class534_sub40, aBigInteger5130, aBigInteger5129);
	if (null == aClass451_Sub1Array5136)
	    aClass451_Sub1Array5136
		= new Class451_Sub1[aClass457_5134.aClass459Array4970.length];
	else {
	    for (int i = 0; i < aClass451_Sub1Array5136.length; i++) {
		if (null != aClass451_Sub1Array5136[i]) {
		    Class459 class459 = aClass457_5134.aClass459Array4970[i];
		    aClass451_Sub1Array5136[i].method15883
			(-1393657873 * class459.anInt4977,
			 class459.aByteArray4979,
			 class459.anInt4978 * 1492181625,
			 class459.anInt4976 * 13321921, 1456622556);
		    if (aClass451_Sub1Array5136[i].method15894(1786498835))
			aClass451_Sub1Array5136[i].method15904(false,
							       1006881513);
		}
	    }
	}
	aBool5137 = false;
	return true;
    }
    
    public boolean method7586(int i) {
	if (null != aClass457_5134)
	    return true;
	if (null == aClass534_Sub18_Sub18_Sub2_5132) {
	    if (aClass450_5131.method7334(1755463994))
		return false;
	    aClass534_Sub18_Sub18_Sub2_5132
		= aClass450_5131.method7332(255, 255, (byte) 0, true,
					    -504275306);
	}
	if (aClass534_Sub18_Sub18_Sub2_5132.aBool11888)
	    return false;
	Class534_Sub40 class534_sub40
	    = new Class534_Sub40(aClass534_Sub18_Sub18_Sub2_5132
				     .method18460((short) -20250));
	aClass457_5134
	    = new Class457(class534_sub40, aBigInteger5130, aBigInteger5129);
	if (null == aClass451_Sub1Array5136)
	    aClass451_Sub1Array5136
		= new Class451_Sub1[aClass457_5134.aClass459Array4970.length];
	else {
	    for (int i_0_ = 0; i_0_ < aClass451_Sub1Array5136.length; i_0_++) {
		if (null != aClass451_Sub1Array5136[i_0_]) {
		    Class459 class459
			= aClass457_5134.aClass459Array4970[i_0_];
		    aClass451_Sub1Array5136[i_0_].method15883
			(-1393657873 * class459.anInt4977,
			 class459.aByteArray4979,
			 class459.anInt4978 * 1492181625,
			 class459.anInt4976 * 13321921, 1488631421);
		    if (aClass451_Sub1Array5136[i_0_].method15894(1786498835))
			aClass451_Sub1Array5136[i_0_].method15904(false,
								  1401222377);
		}
	    }
	}
	aBool5137 = false;
	return true;
    }
    
    public Class451_Sub1 method7587(int i, Class567 class567,
				    Class567 class567_1_, boolean bool,
				    int i_2_) {
	return method7588(i, class567, class567_1_, true, bool, -2134648531);
    }
    
    Class451_Sub1 method7588(int i, Class567 class567, Class567 class567_3_,
			     boolean bool, boolean bool_4_, int i_5_) {
	if (aClass457_5134 == null)
	    throw new RuntimeException();
	if (i < 0 || i >= aClass451_Sub1Array5136.length)
	    throw new RuntimeException();
	if (aClass451_Sub1Array5136[i] != null)
	    return aClass451_Sub1Array5136[i];
	Class459 class459 = aClass457_5134.aClass459Array4970[i];
	Class451_Sub1 class451_sub1
	    = new Class451_Sub1(i, class567, class567_3_, aClass450_5131,
				bool_4_ ? aClass464_5128 : null,
				aClass463_5127,
				-1393657873 * class459.anInt4977,
				class459.aByteArray4979,
				1492181625 * class459.anInt4978, bool,
				13321921 * class459.anInt4976);
	aClass451_Sub1Array5136[i] = class451_sub1;
	if (aClass457_5135 != null && bool_4_) {
	    Class459 class459_6_ = aClass457_5135.aClass459Array4970[i];
	    aClass451_Sub1Array5136[i].method15904
		((aClass451_Sub1Array5136[i].method15884
		  (-1393657873 * class459_6_.anInt4977,
		   class459_6_.aByteArray4979,
		   class459_6_.anInt4978 * 1492181625,
		   13321921 * class459_6_.anInt4976, (byte) 119)),
		 1848367600);
	}
	return class451_sub1;
    }
    
    public void method7589(int i) {
	if (aClass451_Sub1Array5136 != null) {
	    for (int i_7_ = 0; i_7_ < aClass451_Sub1Array5136.length; i_7_++) {
		if (null != aClass451_Sub1Array5136[i_7_])
		    aClass451_Sub1Array5136[i_7_].method15887(623942211);
	    }
	    for (int i_8_ = 0; i_8_ < aClass451_Sub1Array5136.length; i_8_++) {
		if (null != aClass451_Sub1Array5136[i_8_])
		    aClass451_Sub1Array5136[i_8_].method15888(196130080);
	    }
	    if (null == aClass457_5134)
		method7586(1744187436);
	    else if (null != aClass464_5128 && !aBool5137) {
		if (aClass534_Sub18_Sub18_Sub1_5133 == null)
		    aClass534_Sub18_Sub18_Sub1_5133
			= aClass464_5128.method7546(1611431751);
		else if (!aClass534_Sub18_Sub18_Sub1_5133.aBool11888) {
		    byte[] is = aClass534_Sub18_Sub18_Sub1_5133
				    .method18460((short) 19829);
		    try {
			aClass457_5135
			    = new Class457(new Class534_Sub40(is),
					   aBigInteger5130, aBigInteger5129);
			for (int i_9_ = 0;
			     i_9_ < aClass451_Sub1Array5136.length; i_9_++) {
			    if (null != aClass451_Sub1Array5136[i_9_]
				&& aClass451_Sub1Array5136[i_9_]
				       .method15894(1786498835)) {
				Class459 class459
				    = aClass457_5135.aClass459Array4970[i_9_];
				aClass451_Sub1Array5136[i_9_].method15904
				    ((aClass451_Sub1Array5136[i_9_].method15884
				      (-1393657873 * class459.anInt4977,
				       class459.aByteArray4979,
				       class459.anInt4978 * 1492181625,
				       13321921 * class459.anInt4976,
				       (byte) 102)),
				     1097407535);
			    }
			}
		    } catch (Exception exception) {
			for (int i_10_ = 0;
			     i_10_ < aClass451_Sub1Array5136.length; i_10_++) {
			    if (null != aClass451_Sub1Array5136[i_10_]
				&& aClass451_Sub1Array5136[i_10_]
				       .method15894(1786498835))
				aClass451_Sub1Array5136[i_10_]
				    .method15904(false, 1631470714);
			}
		    }
		    aClass534_Sub18_Sub18_Sub1_5133 = null;
		    aBool5137 = true;
		}
	    }
	}
    }
    
    public Class467(Class450 class450, Class464 class464, Class463 class463,
		    BigInteger biginteger, BigInteger biginteger_11_) {
	aClass450_5131 = class450;
	aClass464_5128 = class464;
	aClass463_5127 = class463;
	aBigInteger5130 = biginteger;
	aBigInteger5129 = biginteger_11_;
	if (!aClass450_5131.method7334(1422180268))
	    aClass534_Sub18_Sub18_Sub2_5132
		= aClass450_5131.method7332(255, 255, (byte) 0, true,
					    1679347232);
	if (aClass464_5128 != null)
	    aClass534_Sub18_Sub18_Sub1_5133
		= aClass464_5128.method7546(-1565970654);
    }
    
    Class451_Sub1 method7590(int i, Class567 class567, Class567 class567_12_,
			     boolean bool, boolean bool_13_) {
	if (aClass457_5134 == null)
	    throw new RuntimeException();
	if (i < 0 || i >= aClass451_Sub1Array5136.length)
	    throw new RuntimeException();
	if (aClass451_Sub1Array5136[i] != null)
	    return aClass451_Sub1Array5136[i];
	Class459 class459 = aClass457_5134.aClass459Array4970[i];
	Class451_Sub1 class451_sub1
	    = new Class451_Sub1(i, class567, class567_12_, aClass450_5131,
				bool_13_ ? aClass464_5128 : null,
				aClass463_5127,
				-1393657873 * class459.anInt4977,
				class459.aByteArray4979,
				1492181625 * class459.anInt4978, bool,
				13321921 * class459.anInt4976);
	aClass451_Sub1Array5136[i] = class451_sub1;
	if (aClass457_5135 != null && bool_13_) {
	    Class459 class459_14_ = aClass457_5135.aClass459Array4970[i];
	    aClass451_Sub1Array5136[i].method15904
		((aClass451_Sub1Array5136[i].method15884
		  (-1393657873 * class459_14_.anInt4977,
		   class459_14_.aByteArray4979,
		   class459_14_.anInt4978 * 1492181625,
		   13321921 * class459_14_.anInt4976, (byte) 109)),
		 2086977684);
	}
	return class451_sub1;
    }
    
    public boolean method7591() {
	if (null != aClass457_5134)
	    return true;
	if (null == aClass534_Sub18_Sub18_Sub2_5132) {
	    if (aClass450_5131.method7334(171408278))
		return false;
	    aClass534_Sub18_Sub18_Sub2_5132
		= aClass450_5131.method7332(255, 255, (byte) 0, true,
					    -1861315921);
	}
	if (aClass534_Sub18_Sub18_Sub2_5132.aBool11888)
	    return false;
	Class534_Sub40 class534_sub40
	    = new Class534_Sub40(aClass534_Sub18_Sub18_Sub2_5132
				     .method18460((short) -8587));
	aClass457_5134
	    = new Class457(class534_sub40, aBigInteger5130, aBigInteger5129);
	if (null == aClass451_Sub1Array5136)
	    aClass451_Sub1Array5136
		= new Class451_Sub1[aClass457_5134.aClass459Array4970.length];
	else {
	    for (int i = 0; i < aClass451_Sub1Array5136.length; i++) {
		if (null != aClass451_Sub1Array5136[i]) {
		    Class459 class459 = aClass457_5134.aClass459Array4970[i];
		    aClass451_Sub1Array5136[i].method15883
			(-1393657873 * class459.anInt4977,
			 class459.aByteArray4979,
			 class459.anInt4978 * 1492181625,
			 class459.anInt4976 * 13321921, 267963424);
		    if (aClass451_Sub1Array5136[i].method15894(1786498835))
			aClass451_Sub1Array5136[i].method15904(false,
							       1975365074);
		}
	    }
	}
	aBool5137 = false;
	return true;
    }
    
    public Class451_Sub1 method7592(int i, Class567 class567,
				    Class567 class567_15_, boolean bool) {
	return method7588(i, class567, class567_15_, true, bool, -2134648531);
    }
    
    Class451_Sub1 method7593(int i, Class567 class567, Class567 class567_16_,
			     boolean bool, boolean bool_17_) {
	if (aClass457_5134 == null)
	    throw new RuntimeException();
	if (i < 0 || i >= aClass451_Sub1Array5136.length)
	    throw new RuntimeException();
	if (aClass451_Sub1Array5136[i] != null)
	    return aClass451_Sub1Array5136[i];
	Class459 class459 = aClass457_5134.aClass459Array4970[i];
	Class451_Sub1 class451_sub1
	    = new Class451_Sub1(i, class567, class567_16_, aClass450_5131,
				bool_17_ ? aClass464_5128 : null,
				aClass463_5127,
				-1393657873 * class459.anInt4977,
				class459.aByteArray4979,
				1492181625 * class459.anInt4978, bool,
				13321921 * class459.anInt4976);
	aClass451_Sub1Array5136[i] = class451_sub1;
	if (aClass457_5135 != null && bool_17_) {
	    Class459 class459_18_ = aClass457_5135.aClass459Array4970[i];
	    aClass451_Sub1Array5136[i].method15904
		((aClass451_Sub1Array5136[i].method15884
		  (-1393657873 * class459_18_.anInt4977,
		   class459_18_.aByteArray4979,
		   class459_18_.anInt4978 * 1492181625,
		   13321921 * class459_18_.anInt4976, (byte) 108)),
		 1788888115);
	}
	return class451_sub1;
    }
    
    public Class451_Sub1 method7594(int i, Class567 class567,
				    Class567 class567_19_, boolean bool) {
	return method7588(i, class567, class567_19_, true, bool, -2134648531);
    }
    
    Class451_Sub1 method7595(int i, Class567 class567, Class567 class567_20_,
			     boolean bool, boolean bool_21_) {
	if (aClass457_5134 == null)
	    throw new RuntimeException();
	if (i < 0 || i >= aClass451_Sub1Array5136.length)
	    throw new RuntimeException();
	if (aClass451_Sub1Array5136[i] != null)
	    return aClass451_Sub1Array5136[i];
	Class459 class459 = aClass457_5134.aClass459Array4970[i];
	Class451_Sub1 class451_sub1
	    = new Class451_Sub1(i, class567, class567_20_, aClass450_5131,
				bool_21_ ? aClass464_5128 : null,
				aClass463_5127,
				-1393657873 * class459.anInt4977,
				class459.aByteArray4979,
				1492181625 * class459.anInt4978, bool,
				13321921 * class459.anInt4976);
	aClass451_Sub1Array5136[i] = class451_sub1;
	if (aClass457_5135 != null && bool_21_) {
	    Class459 class459_22_ = aClass457_5135.aClass459Array4970[i];
	    aClass451_Sub1Array5136[i].method15904
		((aClass451_Sub1Array5136[i].method15884
		  (-1393657873 * class459_22_.anInt4977,
		   class459_22_.aByteArray4979,
		   class459_22_.anInt4978 * 1492181625,
		   13321921 * class459_22_.anInt4976, (byte) 103)),
		 1012478522);
	}
	return class451_sub1;
    }
    
    Class451_Sub1 method7596(int i, Class567 class567, Class567 class567_23_,
			     boolean bool, boolean bool_24_) {
	if (aClass457_5134 == null)
	    throw new RuntimeException();
	if (i < 0 || i >= aClass451_Sub1Array5136.length)
	    throw new RuntimeException();
	if (aClass451_Sub1Array5136[i] != null)
	    return aClass451_Sub1Array5136[i];
	Class459 class459 = aClass457_5134.aClass459Array4970[i];
	Class451_Sub1 class451_sub1
	    = new Class451_Sub1(i, class567, class567_23_, aClass450_5131,
				bool_24_ ? aClass464_5128 : null,
				aClass463_5127,
				-1393657873 * class459.anInt4977,
				class459.aByteArray4979,
				1492181625 * class459.anInt4978, bool,
				13321921 * class459.anInt4976);
	aClass451_Sub1Array5136[i] = class451_sub1;
	if (aClass457_5135 != null && bool_24_) {
	    Class459 class459_25_ = aClass457_5135.aClass459Array4970[i];
	    aClass451_Sub1Array5136[i].method15904
		((aClass451_Sub1Array5136[i].method15884
		  (-1393657873 * class459_25_.anInt4977,
		   class459_25_.aByteArray4979,
		   class459_25_.anInt4978 * 1492181625,
		   13321921 * class459_25_.anInt4976, (byte) 105)),
		 951977925);
	}
	return class451_sub1;
    }
    
    public Class451_Sub1 method7597(int i, Class567 class567,
				    Class567 class567_26_, boolean bool) {
	return method7588(i, class567, class567_26_, true, bool, -2134648531);
    }
    
    public boolean method7598() {
	if (null != aClass457_5134)
	    return true;
	if (null == aClass534_Sub18_Sub18_Sub2_5132) {
	    if (aClass450_5131.method7334(124218223))
		return false;
	    aClass534_Sub18_Sub18_Sub2_5132
		= aClass450_5131.method7332(255, 255, (byte) 0, true,
					    1461552149);
	}
	if (aClass534_Sub18_Sub18_Sub2_5132.aBool11888)
	    return false;
	Class534_Sub40 class534_sub40
	    = new Class534_Sub40(aClass534_Sub18_Sub18_Sub2_5132
				     .method18460((short) 12613));
	aClass457_5134
	    = new Class457(class534_sub40, aBigInteger5130, aBigInteger5129);
	if (null == aClass451_Sub1Array5136)
	    aClass451_Sub1Array5136
		= new Class451_Sub1[aClass457_5134.aClass459Array4970.length];
	else {
	    for (int i = 0; i < aClass451_Sub1Array5136.length; i++) {
		if (null != aClass451_Sub1Array5136[i]) {
		    Class459 class459 = aClass457_5134.aClass459Array4970[i];
		    aClass451_Sub1Array5136[i].method15883
			(-1393657873 * class459.anInt4977,
			 class459.aByteArray4979,
			 class459.anInt4978 * 1492181625,
			 class459.anInt4976 * 13321921, -1415461480);
		    if (aClass451_Sub1Array5136[i].method15894(1786498835))
			aClass451_Sub1Array5136[i].method15904(false,
							       1961942736);
		}
	    }
	}
	aBool5137 = false;
	return true;
    }
    
    public void method7599() {
	if (aClass451_Sub1Array5136 != null) {
	    for (int i = 0; i < aClass451_Sub1Array5136.length; i++) {
		if (null != aClass451_Sub1Array5136[i])
		    aClass451_Sub1Array5136[i].method15887(172815181);
	    }
	    for (int i = 0; i < aClass451_Sub1Array5136.length; i++) {
		if (null != aClass451_Sub1Array5136[i])
		    aClass451_Sub1Array5136[i].method15888(1263475091);
	    }
	    if (null == aClass457_5134)
		method7586(1661036813);
	    else if (null != aClass464_5128 && !aBool5137) {
		if (aClass534_Sub18_Sub18_Sub1_5133 == null)
		    aClass534_Sub18_Sub18_Sub1_5133
			= aClass464_5128.method7546(1340908120);
		else if (!aClass534_Sub18_Sub18_Sub1_5133.aBool11888) {
		    byte[] is = aClass534_Sub18_Sub18_Sub1_5133
				    .method18460((short) 17004);
		    try {
			aClass457_5135
			    = new Class457(new Class534_Sub40(is),
					   aBigInteger5130, aBigInteger5129);
			for (int i = 0; i < aClass451_Sub1Array5136.length;
			     i++) {
			    if (null != aClass451_Sub1Array5136[i]
				&& aClass451_Sub1Array5136[i]
				       .method15894(1786498835)) {
				Class459 class459
				    = aClass457_5135.aClass459Array4970[i];
				aClass451_Sub1Array5136[i].method15904
				    ((aClass451_Sub1Array5136[i].method15884
				      (-1393657873 * class459.anInt4977,
				       class459.aByteArray4979,
				       class459.anInt4978 * 1492181625,
				       13321921 * class459.anInt4976,
				       (byte) 125)),
				     2144226998);
			    }
			}
		    } catch (Exception exception) {
			for (int i = 0; i < aClass451_Sub1Array5136.length;
			     i++) {
			    if (null != aClass451_Sub1Array5136[i]
				&& aClass451_Sub1Array5136[i]
				       .method15894(1786498835))
				aClass451_Sub1Array5136[i]
				    .method15904(false, 1491670614);
			}
		    }
		    aClass534_Sub18_Sub18_Sub1_5133 = null;
		    aBool5137 = true;
		}
	    }
	}
    }
    
    public void method7600() {
	if (aClass451_Sub1Array5136 != null) {
	    for (int i = 0; i < aClass451_Sub1Array5136.length; i++) {
		if (null != aClass451_Sub1Array5136[i])
		    aClass451_Sub1Array5136[i].method15887(1138268472);
	    }
	    for (int i = 0; i < aClass451_Sub1Array5136.length; i++) {
		if (null != aClass451_Sub1Array5136[i])
		    aClass451_Sub1Array5136[i].method15888(-1257849995);
	    }
	    if (null == aClass457_5134)
		method7586(1363035353);
	    else if (null != aClass464_5128 && !aBool5137) {
		if (aClass534_Sub18_Sub18_Sub1_5133 == null)
		    aClass534_Sub18_Sub18_Sub1_5133
			= aClass464_5128.method7546(-92889830);
		else if (!aClass534_Sub18_Sub18_Sub1_5133.aBool11888) {
		    byte[] is = aClass534_Sub18_Sub18_Sub1_5133
				    .method18460((short) 21857);
		    try {
			aClass457_5135
			    = new Class457(new Class534_Sub40(is),
					   aBigInteger5130, aBigInteger5129);
			for (int i = 0; i < aClass451_Sub1Array5136.length;
			     i++) {
			    if (null != aClass451_Sub1Array5136[i]
				&& aClass451_Sub1Array5136[i]
				       .method15894(1786498835)) {
				Class459 class459
				    = aClass457_5135.aClass459Array4970[i];
				aClass451_Sub1Array5136[i].method15904
				    ((aClass451_Sub1Array5136[i].method15884
				      (-1393657873 * class459.anInt4977,
				       class459.aByteArray4979,
				       class459.anInt4978 * 1492181625,
				       13321921 * class459.anInt4976,
				       (byte) 104)),
				     1679014911);
			    }
			}
		    } catch (Exception exception) {
			for (int i = 0; i < aClass451_Sub1Array5136.length;
			     i++) {
			    if (null != aClass451_Sub1Array5136[i]
				&& aClass451_Sub1Array5136[i]
				       .method15894(1786498835))
				aClass451_Sub1Array5136[i]
				    .method15904(false, 1708235895);
			}
		    }
		    aClass534_Sub18_Sub18_Sub1_5133 = null;
		    aBool5137 = true;
		}
	    }
	}
    }
    
    static final void method7601(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class299.method5513(class247, class669, -898265868);
    }
    
    public static Class472 method7602(Class50 class50, boolean bool, int i,
				      boolean bool_27_, boolean bool_28_,
				      int i_29_) {
	if (null == Class57.aClass451_Sub1Array459) {
	    Class57.aClass451_Sub1Array459
		= new Class451_Sub1[Class229.method4205(54907948)];
	    Class594.aMap7828 = new HashMap();
	}
	Class567 class567 = null;
	int i_30_ = class50.method1155(1311407359);
	if (client.aClass38_5581 != null && !Class235.aBool2370)
	    class567 = new Class567(i_30_, client.aClass38_5581,
				    Class314_Sub1.aClass38Array9995[i_30_],
				    (i_30_ == Class50.aClass50_391
						  .method1155(1311407359)
				     ? 8000000 : 2500000));
	Class57.aClass451_Sub1Array459[i_30_]
	    = Class522.aClass467_7082.method7587(i_30_, class567,
						 Class191.aClass567_2138,
						 class50
						     .method1154(1860628979),
						 226736532);
	if (bool_28_)
	    Class57.aClass451_Sub1Array459[i_30_].method15890(950810883);
	Class472 class472
	    = new Class472(Class57.aClass451_Sub1Array459[i_30_], bool, i);
	Class594.aMap7828.put(class50, class472);
	return class472;
    }
    
    static final void method7603(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	int i_31_ = 0;
	if (Class545.method8965(string, 1487018132))
	    i_31_ = Class684.method13949(string, (byte) 49);
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4258,
				  client.aClass100_11264.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16510(i_31_,
							      -1410217533);
	client.aClass100_11264.method1863(class534_sub19, (byte) 107);
    }
    
    static final void method7604(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class247.anInt2558
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * 755258967;
    }
}
