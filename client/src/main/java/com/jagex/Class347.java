/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.jagex.twitchtv.TwitchEventResult;

public abstract class Class347
{
    Class298 aClass298_3589;
    static int anInt3590;
    
    public abstract Class438 method6129();
    
    public abstract double[] method6130(int i);
    
    public abstract boolean method6131(int i);
    
    Class347(Class298 class298) {
	aClass298_3589 = class298;
    }
    
    public abstract void method6132(float f, int[][][] is, Class468 class468,
				    int i, int i_0_);
    
    public abstract Class534_Sub36 method6133(byte i);
    
    public abstract float method6134(int i);
    
    public abstract Class534_Sub36 method6135();
    
    public abstract void method6136(float f, int[][][] is, Class468 class468,
				    int i, int i_1_, byte i_2_);
    
    public abstract Class438 method6137(int i);
    
    public abstract void method6138(float f, int[][][] is, Class468 class468,
				    int i, int i_3_);
    
    public abstract void method6139(float f, int[][][] is, Class468 class468,
				    int i, int i_4_);
    
    public abstract boolean method6140();
    
    public abstract boolean method6141();
    
    public abstract void method6142(Class287 class287, int i, int i_5_);
    
    public abstract Class438 method6143();
    
    public abstract double[] method6144();
    
    public abstract Class438 method6145();
    
    public abstract Class438 method6146();
    
    public abstract boolean method6147();
    
    public abstract void method6148(Class534_Sub40 class534_sub40, byte i);
    
    public abstract void method6149(Class287 class287, int i, int i_6_,
				    short i_7_);
    
    public abstract void method6150(Class287 class287, int i, int i_8_);
    
    public abstract void method6151(Class534_Sub40 class534_sub40);
    
    public abstract void method6152(Class534_Sub40 class534_sub40);
    
    public abstract float method6153();
    
    public abstract float method6154();
    
    static void method6155(int i, int i_9_, byte i_10_) {
	TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_9_);
	Class590 class590 = twitcheventresult.method6700();
	if (class590 != null)
	    Class269.method5022(class590.method93(), twitcheventresult,
				(byte) 1);
    }
    
    public static void method6156(int i) {
	Class468.method7623((byte) 33);
	Class642.aClass656_Sub2_8342.method10859(8388608);
	Class642.aClass656_Sub1_8346.method10859(8388608);
	if (client.anInt11199 * -2064179505 > 0) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4230,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16507(333216572 * client.anInt11199, 2035807060);
	    for (int i_11_ = 0; i_11_ < client.anInt11199 * -2064179505;
		 i_11_++) {
		Interface63 interface63
		    = client.anInterface63Array11070[i_11_];
		long l = (interface63.method425(-881668872)
			  - 3448347234370012423L * Class642.aLong8345);
		if (l > 16777215L)
		    l = 16777215L;
		Class642.aLong8345 = (interface63.method425(-881668872)
				      * -2887650411480147785L);
		class534_sub19.aClass534_Sub40_Sub1_10513.method16506
		    (interface63.method431((byte) -116), 685744693);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16509((int) l, -1089679336);
	    }
	    client.aClass100_11264.method1863(class534_sub19, (byte) 47);
	}
	if (Class642.anInt8343 * -152420315 > 0)
	    Class642.anInt8343 -= 1972886445;
	if (client.aBool11147 && Class642.anInt8343 * -152420315 <= 0) {
	    Class642.anInt8343 = 803023236;
	    client.aBool11147 = false;
	    int i_12_;
	    int i_13_;
	    if (3 == Class10.anInt75 * -891094135) {
		if (Class599.aClass298_Sub1_7871.method5388((byte) 55)
		    == Class305.aClass305_3265) {
		    Class347_Sub1 class347_sub1
			= (Class347_Sub1) Class599.aClass298_Sub1_7871
					      .method5380((byte) -105);
		    i_12_ = Class545.method8967(class347_sub1.aClass443_10134,
						574797866) >> 3;
		    int i_14_ = 1024;
		    i_13_
			= (i_14_ * 3 - (Class579.method9811((class347_sub1
							     .aClass443_10134),
							    1972499688)
					>> 3)) % (i_14_ * 2);
		} else {
		    i_12_ = 0;
		    i_13_ = 0;
		}
	    } else {
		i_12_ = (int) client.aFloat11302 >> 3;
		i_13_ = (int) client.aFloat11140 >> 3;
	    }
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4187,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16569(i_12_,
								  -1744558245);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16507(i_13_,
								  1302480486);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 77);
	}
	if (Class534_Sub36.aBool10800 != Class642.aBool8344) {
	    Class642.aBool8344 = Class534_Sub36.aBool10800;
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4182,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16506(Class534_Sub36.aBool10800 ? 1 : 0, 1648760500);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 28);
	}
	if (!client.aBool11048) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4265,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16506(0,
								  1265493676);
	    int i_15_ = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			 * 31645619);
	    Class534_Sub40 class534_sub40
		= Class44_Sub6.aClass534_Sub35_10989.method16436(2034170167);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16519
		(class534_sub40.aByteArray10810, 0,
		 class534_sub40.anInt10811 * 31645619, -1294918473);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16528
		(31645619 * (class534_sub19.aClass534_Sub40_Sub1_10513
			     .anInt10811) - i_15_,
		 2139885465);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 15);
	    client.aBool11048 = true;
	}
	if (!client.aBool11049
	    && Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
		   .method16935(-1807368365) == 1) {
	    int[] is = Class254.aClass185_2683.method3251();
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4225,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16507(0,
								  1266319043);
	    int i_16_ = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			 * 31645619);
	    if (is != null && 0 != is.length) {
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(1, 1004708918);
		Class131[] class131s = Class131.method2307(1192123446);
		HashSet hashset = new HashSet();
		ArrayList arraylist = new ArrayList();
		for (int i_17_ = 0; i_17_ < is.length; i_17_++) {
		    boolean bool = false;
		    for (int i_18_ = 0; i_18_ < class131s.length; i_18_++) {
			if (class131s[i_18_].anInt1576 == is[i_17_]) {
			    hashset.add(class131s[i_18_]);
			    bool = true;
			    break;
			}
		    }
		    if (!bool)
			arraylist.add(Integer.valueOf(is[i_17_]));
		}
		Class227.method4185(hashset,
				    class534_sub19.aClass534_Sub40_Sub1_10513,
				    (byte) 0);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16642(arraylist.size(), -237713687);
		if (arraylist.size() > 0) {
		    int i_19_ = 2147483647;
		    Iterator iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() < i_19_)
			    i_19_ = integer.intValue();
		    }
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16712(i_19_, (byte) 0);
		    iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() != i_19_)
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16712
				(integer.intValue() - i_19_, (byte) 0);
		    }
		}
	    } else
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(0, 2078530404);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16733
		(31645619 * (class534_sub19.aClass534_Sub40_Sub1_10513
			     .anInt10811) - i_16_,
		 -425254746);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 109);
	    client.aBool11049 = true;
	}
    }
    
    static final void method6157(int i, int i_20_, int i_21_, int i_22_,
				 int i_23_, int i_24_, byte i_25_) {
	int i_26_ = Class108.anInt1321 * -1843550713;
	int[] is = Class108.anIntArray1322;
	client.anInt11310 = 0;
	int i_27_;
	if (3 == client.anInt11155 * -1468443459)
	    i_27_ = Class65.aClass192Array712.length;
	else
	    i_27_ = -1125820437 * client.anInt11321 + i_26_;
	for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
	    Class307 class307 = null;
	    Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1;
	    if (3 == client.anInt11155 * -1468443459) {
		Class192 class192 = Class65.aClass192Array712[i_28_];
		if (!class192.aBool2142)
		    continue;
		class654_sub1_sub5_sub1 = class192.method3775(2088438307);
		if (-1527295759 * class654_sub1_sub5_sub1.anInt11940
		    != 1373322351 * client.anInt11161)
		    continue;
		if (-849492911 * class192.anInt2141 >= 0) {
		    class307 = ((Class654_Sub1_Sub5_Sub1_Sub1)
				class654_sub1_sub5_sub1).aClass307_12204;
		    if (class307.anIntArray3284 != null) {
			class307 = class307.method5615(Class78.aClass103_825,
						       Class78.aClass103_825,
						       -1466068515);
			if (class307 == null)
			    continue;
		    }
		}
	    } else {
		if (i_28_ < i_26_)
		    class654_sub1_sub5_sub1
			= (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			   [is[i_28_]]);
		else {
		    class654_sub1_sub5_sub1
			= ((Class654_Sub1_Sub5_Sub1)
			   (((Class534_Sub6)
			     (client.aClass9_11331.method579
			      ((long) client.anIntArray11088[i_28_ - i_26_])))
			    .anObject10417));
		    class307 = ((Class654_Sub1_Sub5_Sub1_Sub1)
				class654_sub1_sub5_sub1).aClass307_12204;
		    if (class307.anIntArray3284 != null) {
			class307 = class307.method5615(Class78.aClass103_825,
						       Class78.aClass103_825,
						       -1466068515);
			if (class307 == null)
			    continue;
		    }
		}
		if (class654_sub1_sub5_sub1.anInt11931 * -1547173311 < 0
		    || ((client.anInt11161 * 1373322351
			 != -1527295759 * class654_sub1_sub5_sub1.anInt11940)
			&& ((Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			     .aByte10854)
			    != class654_sub1_sub5_sub1.aByte10854)))
		    continue;
	    }
	    Class62.method1264(class654_sub1_sub5_sub1,
			       class654_sub1_sub5_sub1
				   .method16897(-1527522767),
			       false, (short) -5233);
	    if (!(client.aFloatArray11167[0] < 0.0F)) {
		if (class654_sub1_sub5_sub1.method18543(1357556674)) {
		    Class526 class526
			= class654_sub1_sub5_sub1.method18544(1809929368);
		    if (null != class526
			&& (client.anInt11310 * -156893177
			    < 1281230471 * client.anInt11289)) {
			String string = class526.method8743((byte) 6);
			if (Class172.aClass268_1824.method4882((short) 256))
			    string = Class172.aClass268_1824
					 .method4902(string, (byte) -1);
			client.anIntArray11269[-156893177 * client.anInt11310]
			    = Class322.aClass16_3420.method728(string,
							       -403116225) / 2;
			client.anIntArray11290[client.anInt11310 * -156893177]
			    = (int) client.aFloatArray11167[0];
			client.anIntArray11291[-156893177 * client.anInt11310]
			    = (int) client.aFloatArray11167[1];
			client.aClass526Array11293[(client.anInt11310
						    * -156893177)]
			    = class526;
			client.anInt11310 += 1230335415;
		    }
		}
		int i_29_ = (int) (client.aFloatArray11167[1] + (float) i_20_);
		i_29_ -= Class322.aClass16_3420.anInt190 * 102396103;
		boolean bool = false;
		if (!class654_sub1_sub5_sub1.aBool11989
		    && !class654_sub1_sub5_sub1.aClass709_11941
			    .method14288(1042580144)) {
		    for (Class536_Sub5 class536_sub5
			     = (Class536_Sub5) class654_sub1_sub5_sub1
						   .aClass709_11941
						   .method14301(764908544);
			 null != class536_sub5;
			 class536_sub5
			     = (Class536_Sub5) class654_sub1_sub5_sub1
						   .aClass709_11941
						   .method14282(-126266284)) {
			Class536_Sub1 class536_sub1
			    = class536_sub5.method15997(client.anInt11101,
							2126675351);
			if (class536_sub1 != null) {
			    Class579 class579 = class536_sub5.aClass579_10368;
			    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
				= (client
				   .aClass654_Sub1_Sub5_Sub1_Sub2Array11279
				   [is[i_28_]]);
			    Class163 class163;
			    Class163 class163_30_;
			    if (null != class654_sub1_sub5_sub1_sub2
				&& (Class252.aClass252_2658
				    != (class654_sub1_sub5_sub1_sub2
					.aClass252_12232))) {
				if (Class252.aClass252_2655
				    == (class654_sub1_sub5_sub1_sub2
					.aClass252_12232)) {
				    class163
					= (class579.method9802
					   (Class254.aClass185_2683,
					    class579.anInt7755 * 1463849337,
					    (byte) -54));
				    class163_30_
					= (class579.method9802
					   (Class254.aClass185_2683,
					    62974025 * class579.anInt7754,
					    (byte) -26));
				} else {
				    class163
					= (class579.method9802
					   (Class254.aClass185_2683,
					    1417005703 * class579.anInt7757,
					    (byte) -127));
				    class163_30_
					= (class579.method9802
					   (Class254.aClass185_2683,
					    class579.anInt7745 * -1550459521,
					    (byte) -7));
				}
			    } else {
				class163
				    = class579.method9802((Class254
							   .aClass185_2683),
							  (930052789
							   * (class579
							      .anInt7756)),
							  (byte) -86);
				class163_30_
				    = class579.method9802((Class254
							   .aClass185_2683),
							  (-1494517865
							   * (class579
							      .anInt7752)),
							  (byte) -108);
			    }
			    if (null != class163 && class163_30_ != null) {
				int i_31_ = 255;
				int i_32_ = -1;
				int i_33_ = (client.anInt11101
					     - (class536_sub1.anInt10330
						* 1770939769));
				int i_34_ = (class163_30_.method2647()
					     * (1415440011
						* class536_sub1.anInt10331)
					     / 255);
				if (class536_sub1.anInt10332 * -1162579465
				    > i_33_) {
				    int i_35_
					= ((-1314075657 * class579.anInt7750
					    == 0)
					   ? 0
					   : (i_33_
					      / (class579.anInt7750
						 * -1314075657)
					      * (class579.anInt7750
						 * -1314075657)));
				    int i_36_ = (class163_30_.method2647()
						 * (class536_sub1.anInt10329
						    * -1206299323)
						 / 255);
				    i_32_ = ((i_35_ * (i_34_ - i_36_)
					      / (-1162579465
						 * class536_sub1.anInt10332))
					     + i_36_);
				} else {
				    i_32_ = i_34_;
				    int i_37_
					= ((class536_sub1.anInt10332
					    * -1162579465)
					   + class579.anInt7751 * 1929647207
					   - i_33_);
				    if (class579.anInt7749 * 2041880747 >= 0)
					i_31_ = ((i_37_ << 8)
						 / ((class579.anInt7751
						     * 1929647207)
						    - (class579.anInt7749
						       * 2041880747)));
				}
				if (class536_sub1.anInt10331 * 1415440011 > 0
				    && i_32_ < 2)
				    i_32_ = 2;
				int i_38_ = class163.method2649();
				int i_39_
				    = (int) ((float) i
					     + client.aFloatArray11167[0]
					     - (float) (class163.method2647()
							>> 1));
				i_29_ -= i_38_;
				if (i_31_ >= 0 && i_31_ < 255) {
				    int i_40_ = i_31_ << 24;
				    int i_41_ = i_40_ | 0xffffff;
				    class163.method2657(i_39_, i_29_, 0, i_41_,
							1);
				    Class254.aClass185_2683.method3282
					(i_39_, i_29_, i_32_ + i_39_,
					 i_29_ + i_38_);
				    class163_30_.method2657(i_39_, i_29_, 0,
							    i_41_, 1);
				} else {
				    class163.method2656(i_39_, i_29_);
				    Class254.aClass185_2683.method3282
					(i_39_, i_29_, i_32_ + i_39_,
					 i_38_ + i_29_);
				    class163_30_.method2656(i_39_, i_29_);
				}
				Class254.aClass185_2683.method3373(i, i_20_,
								   i_21_ + i,
								   (i_20_
								    + i_22_));
				i_29_ -= 2;
				bool = true;
			    }
			} else if (class536_sub5.method15998((byte) 29))
			    class536_sub5.method8900(-216276369);
		    }
		}
		if (!bool)
		    i_29_
			-= Class620.aClass632_8113.anInt8255 * 1453520235 + 2;
		if (!class654_sub1_sub5_sub1.aBool11989) {
		    if (class307 == null) {
			Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
			    = ((Class654_Sub1_Sub5_Sub1_Sub2)
			       class654_sub1_sub5_sub1);
			for (int i_42_ = 0;
			     i_42_ < (class654_sub1_sub5_sub1_sub2
				      .anIntArray12233).length;
			     i_42_++) {
			    if ((class654_sub1_sub5_sub1_sub2.anIntArray12233
				 [i_42_])
				>= 0) {
				Object object = null;
				int i_43_ = (class654_sub1_sub5_sub1_sub2
					     .anIntArray12233[i_42_]);
				int i_44_ = (class654_sub1_sub5_sub1_sub2
					     .anIntArray12217[i_42_]);
				long l = (long) (i_44_ << 8 | i_43_);
				Class163 class163
				    = ((Class163)
				       client.aClass203_11079.method3871(l));
				if (null == class163) {
				    Class169[] class169s
					= (Class178.method2939
					   (Class464.aClass472_5113, i_44_,
					    0));
				    if (class169s == null)
					continue;
				    class163
					= (Class254.aClass185_2683.method3279
					   (class169s[i_43_], true));
				    client.aClass203_11079.method3893(class163,
								      l);
				}
				if (class163 != null) {
				    i_29_ -= class163.method2649();
				    class163.method2656
					((int) ((float) i
						+ client.aFloatArray11167[0]
						- 12.0F),
					 i_29_);
				    i_29_ -= 2;
				}
			    }
			}
		    } else {
			Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			    = ((Class654_Sub1_Sub5_Sub1_Sub1)
			       class654_sub1_sub5_sub1);
			int[] is_45_
			    = ((class654_sub1_sub5_sub1_sub1.aClass295_12199
				!= null)
			       ? (class654_sub1_sub5_sub1_sub1.aClass295_12199
				  .anIntArray3159)
			       : (class654_sub1_sub5_sub1_sub1.aClass307_12204
				  .anIntArray3309));
			short[] is_46_
			    = ((class654_sub1_sub5_sub1_sub1.aClass295_12199
				!= null)
			       ? (class654_sub1_sub5_sub1_sub1.aClass295_12199
				  .aShortArray3160)
			       : (class654_sub1_sub5_sub1_sub1.aClass307_12204
				  .aShortArray3318));
			if (is_46_ != null && null != is_45_) {
			    int i_47_ = 0;
			    for (/**/; i_47_ < is_46_.length; i_47_++) {
				if (is_46_[i_47_] >= 0 && is_45_[i_47_] >= 0) {
				    Object object = null;
				    long l = (long) (is_45_[i_47_] << 8
						     | is_46_[i_47_]);
				    Class163 class163
					= (Class163) client.aClass203_11079
							 .method3871(l);
				    if (null == class163) {
					Class169[] class169s
					    = (Class178.method2939
					       (Class464.aClass472_5113,
						is_45_[i_47_], 0));
					if (class169s == null)
					    continue;
					class163 = (Class254.aClass185_2683
							.method3279
						    (class169s[is_46_[i_47_]],
						     true));
					client.aClass203_11079
					    .method3893(class163, l);
				    }
				    if (null != class163) {
					i_29_ -= class163.method2649();
					class163.method2656
					    ((int) (client.aFloatArray11167[0]
						    + (float) i
						    - (float) ((class163
								    .method2647
								())
							       >> 1)),
					     i_29_);
					i_29_ -= 2;
				    }
				}
			    }
			}
		    }
		}
		if (class654_sub1_sub5_sub1
		    instanceof Class654_Sub1_Sub5_Sub1_Sub2) {
		    if (i_28_ >= 0) {
			int i_48_ = 0;
			Class99[] class99s = client.aClass99Array11053;
			for (int i_49_ = 0; i_49_ < class99s.length; i_49_++) {
			    Class99 class99 = class99s[i_49_];
			    if (class99 != null
				&& 10 == class99.anInt1176 * 652406965
				&& (class99.anInt1169 * -879249997
				    == is[i_28_])) {
				Class163 class163
				    = (Class510.aClass163Array5678
				       [-1562758755 * class99.anInt1177]);
				if (class163.method2649() > i_48_)
				    i_48_ = class163.method2649();
				class163.method2656((int) ((float) i
							   + (client
							      .aFloatArray11167
							      [0])
							   - 12.0F),
						    (i_29_
						     - class163.method2649()));
			    }
			}
			if (i_48_ > 0)
			    i_29_ -= i_48_ + 2;
		    }
		} else {
		    int i_50_ = 0;
		    Class99[] class99s = client.aClass99Array11053;
		    for (int i_51_ = 0; i_51_ < class99s.length; i_51_++) {
			Class99 class99 = class99s[i_51_];
			if (class99 != null
			    && 1 == class99.anInt1176 * 652406965
			    && (client.anIntArray11088[i_28_ - i_26_]
				== class99.anInt1169 * -879249997)) {
			    Class163 class163
				= (Class510.aClass163Array5678
				   [class99.anInt1177 * -1562758755]);
			    if (class163.method2649() > i_50_)
				i_50_ = class163.method2649();
			    boolean bool_52_;
			    if (class99.anInt1167 * 1818534715 == 0)
				bool_52_ = true;
			    else {
				int i_53_
				    = (Class469.method7641((byte) -7) * 1000
				       / (class99.anInt1167 * 1818534715) / 2);
				bool_52_
				    = client.anInt11101 % (2 * i_53_) < i_53_;
			    }
			    if (bool_52_)
				class163.method2656((int) ((float) i
							   + (client
							      .aFloatArray11167
							      [0])
							   - 12.0F),
						    (i_29_
						     - class163.method2649()));
			}
		    }
		    if (i_50_ > 0)
			i_29_ -= 2 + i_50_;
		}
		int i_54_ = 0;
		for (/**/;
		     i_54_ < 521612365 * Class620.aClass632_8113.anInt8257;
		     i_54_++) {
		    int i_55_ = class654_sub1_sub5_sub1.anIntArray11925[i_54_];
		    int i_56_ = class654_sub1_sub5_sub1.anIntArray11938[i_54_];
		    Class578 class578 = null;
		    int i_57_ = 0;
		    if (i_56_ >= 0) {
			if (i_55_ <= client.anInt11101)
			    continue;
			class578
			    = (Class578) (Class632.aClass44_Sub2_8270.method91
					  ((class654_sub1_sub5_sub1
					    .anIntArray11938[i_54_]),
					   -455679927));
			i_57_ = 1049226697 * class578.anInt7724;
			if (null != class578
			    && null != class578.anIntArray7716) {
			    class578
				= class578.method9781(Class78.aClass103_825,
						      Class78.aClass103_825,
						      (byte) -47);
			    if (class578 == null) {
				class654_sub1_sub5_sub1.anIntArray11925[i_54_]
				    = -1;
				continue;
			    }
			}
		    } else if (i_55_ < 0)
			continue;
		    int i_58_ = class654_sub1_sub5_sub1.anIntArray11952[i_54_];
		    Class578 class578_59_ = null;
		    if (i_58_ >= 0) {
			class578_59_
			    = (Class578) Class632.aClass44_Sub2_8270
					     .method91(i_58_, 97886436);
			if (null != class578_59_
			    && null != class578_59_.anIntArray7716)
			    class578_59_
				= class578_59_.method9781((Class78
							   .aClass103_825),
							  (Class78
							   .aClass103_825),
							  (byte) -95);
		    }
		    if (i_55_ - i_57_ <= client.anInt11101) {
			if (class578 == null)
			    class654_sub1_sub5_sub1.anIntArray11925[i_54_]
				= -1;
			else {
			    int i_60_ = (class654_sub1_sub5_sub1
					     .method16897(-1527522767)
					 / 2);
			    Class62.method1264(class654_sub1_sub5_sub1, i_60_,
					       false, (short) -20680);
			    if (client.aFloatArray11167[0] > -1.0F) {
				client.aFloatArray11167[0]
				    += (float) (Class620.aClass632_8113
						.anIntArray8233[i_54_]);
				client.aFloatArray11167[1]
				    += (float) (Class620.aClass632_8113
						.anIntArray8226[i_54_]);
				Object object = null;
				Object object_61_ = null;
				Object object_62_ = null;
				Object object_63_ = null;
				int i_64_ = 0;
				int i_65_ = 0;
				int i_66_ = 0;
				int i_67_ = 0;
				int i_68_ = 0;
				int i_69_ = 0;
				int i_70_ = 0;
				int i_71_ = 0;
				Class163 class163 = null;
				Class163 class163_72_ = null;
				Class163 class163_73_ = null;
				Class163 class163_74_ = null;
				int i_75_ = 0;
				int i_76_ = 0;
				int i_77_ = 0;
				int i_78_ = 0;
				int i_79_ = 0;
				int i_80_ = 0;
				int i_81_ = 0;
				int i_82_ = 0;
				Class163 class163_83_
				    = class578.method9778((Class254
							   .aClass185_2683),
							  -847145627);
				if (null != class163_83_) {
				    i_64_ = class163_83_.method2647();
				    class163_83_
					.method2646(client.anIntArray11357);
				    i_68_ = client.anIntArray11357[0];
				}
				Class163 class163_84_
				    = class578.method9775((Class254
							   .aClass185_2683),
							  -1837730879);
				if (class163_84_ != null) {
				    i_65_ = class163_84_.method2647();
				    class163_84_
					.method2646(client.anIntArray11357);
				    i_69_ = client.anIntArray11357[0];
				}
				Class163 class163_85_
				    = class578.method9779((Class254
							   .aClass185_2683),
							  -1795008377);
				if (class163_85_ != null) {
				    i_66_ = class163_85_.method2647();
				    class163_85_
					.method2646(client.anIntArray11357);
				    i_70_ = client.anIntArray11357[0];
				}
				Class163 class163_86_
				    = class578.method9782((Class254
							   .aClass185_2683),
							  1068842532);
				if (null != class163_86_) {
				    i_67_ = class163_86_.method2647();
				    class163_86_
					.method2646(client.anIntArray11357);
				    i_71_ = client.anIntArray11357[0];
				}
				if (class578_59_ != null) {
				    class163 = (class578_59_.method9778
						(Class254.aClass185_2683,
						 -847145627));
				    if (class163 != null) {
					i_75_ = class163.method2647();
					class163.method2646(client
							    .anIntArray11357);
					i_79_ = client.anIntArray11357[0];
				    }
				    class163_72_ = (class578_59_.method9775
						    (Class254.aClass185_2683,
						     -1697940862));
				    if (null != class163_72_) {
					i_76_ = class163_72_.method2647();
					class163_72_.method2646
					    (client.anIntArray11357);
					i_80_ = client.anIntArray11357[0];
				    }
				    class163_73_ = (class578_59_.method9779
						    (Class254.aClass185_2683,
						     -1413742024));
				    if (class163_73_ != null) {
					i_77_ = class163_73_.method2647();
					class163_73_.method2646
					    (client.anIntArray11357);
					i_81_ = client.anIntArray11357[0];
				    }
				    class163_74_ = (class578_59_.method9782
						    (Class254.aClass185_2683,
						     1068842532));
				    if (null != class163_74_) {
					i_78_ = class163_74_.method2647();
					class163_74_.method2646
					    (client.anIntArray11357);
					i_82_ = client.anIntArray11357[0];
				    }
				}
				Class171 class171 = Class219.aClass171_2307;
				Class171 class171_87_
				    = Class219.aClass171_2307;
				Class16 class16 = Class690_Sub9.aClass16_10875;
				Class16 class16_88_
				    = Class690_Sub9.aClass16_10875;
				int i_89_ = -648026785 * class578.anInt7735;
				if (i_89_ >= 0) {
				    Class171 class171_90_
					= ((Class171)
					   (Class351.aClass406_3620.method6650
					    (client.anInterface52_11081, i_89_,
					     true, class578.aBool7721,
					     (byte) 0)));
				    Class16 class16_91_
					= (Class351.aClass406_3620.method6666
					   (client.anInterface52_11081, i_89_,
					    (byte) 106));
				    if (null != class171_90_
					&& null != class16_91_) {
					class171 = class171_90_;
					class16 = class16_91_;
				    }
				}
				if (null != class578_59_) {
				    i_89_
					= -648026785 * class578_59_.anInt7735;
				    if (i_89_ >= 0) {
					Class171 class171_92_
					    = ((Class171)
					       (Class351.aClass406_3620
						    .method6650
						(client.anInterface52_11081,
						 i_89_, true,
						 class578_59_.aBool7721,
						 (byte) 0)));
					Class16 class16_93_
					    = (Class351.aClass406_3620
						   .method6666
					       (client.anInterface52_11081,
						i_89_, (byte) 66));
					if (class171_92_ != null
					    && class16_93_ != null) {
					    class171_87_ = class171_92_;
					    class16_88_ = class16_93_;
					}
				    }
				}
				Object object_94_ = null;
				String string = null;
				boolean bool_95_ = false;
				int i_96_ = 0;
				String string_97_
				    = (class578.method9777
				       ((class654_sub1_sub5_sub1
					 .anIntArray11939[i_54_]),
					(byte) -20));
				int i_98_ = class16.method728(string_97_,
							      1144245434);
				if (null != class578_59_) {
				    string = (class578_59_.method9777
					      ((class654_sub1_sub5_sub1
						.anIntArray11942[i_54_]),
					       (byte) -67));
				    i_96_ = class16_88_.method728(string,
								  454084676);
				}
				int i_99_ = 0;
				int i_100_ = 0;
				if (i_65_ > 0)
				    i_99_ = i_98_ / i_65_ + 1;
				if (null != class578_59_ && i_76_ > 0)
				    i_100_ = 1 + i_96_ / i_76_;
				int i_101_ = 0;
				int i_102_ = i_101_;
				if (i_64_ > 0)
				    i_101_ += i_64_;
				i_101_ += 2;
				int i_103_ = i_101_;
				if (i_66_ > 0)
				    i_101_ += i_66_;
				int i_104_ = i_101_;
				int i_105_ = i_101_;
				if (i_65_ > 0) {
				    int i_106_ = i_65_ * i_99_;
				    i_101_ += i_106_;
				    i_105_ += (i_106_ - i_98_) / 2;
				} else
				    i_101_ += i_98_;
				int i_107_ = i_101_;
				if (i_67_ > 0)
				    i_101_ += i_67_;
				int i_108_ = 0;
				int i_109_ = 0;
				int i_110_ = 0;
				int i_111_ = 0;
				int i_112_ = 0;
				if (null != class578_59_) {
				    i_101_ += 2;
				    i_108_ = i_101_;
				    if (i_75_ > 0)
					i_101_ += i_75_;
				    i_101_ += 2;
				    i_109_ = i_101_;
				    if (i_77_ > 0)
					i_101_ += i_77_;
				    i_110_ = i_101_;
				    i_112_ = i_101_;
				    if (i_76_ > 0) {
					int i_113_ = i_76_ * i_100_;
					i_101_ += i_113_;
					i_112_ += (i_113_ - i_96_) / 2;
				    } else
					i_101_ += i_96_;
				    i_111_ = i_101_;
				    if (i_78_ > 0)
					i_101_ += i_78_;
				}
				int i_114_ = ((class654_sub1_sub5_sub1
					       .anIntArray11925[i_54_])
					      - client.anInt11101);
				int i_115_ = (-2060756059 * class578.anInt7729
					      - (class578.anInt7729
						 * -2060756059 * i_114_
						 / (1049226697
						    * class578.anInt7724)));
				int i_116_
				    = (-(class578.anInt7715 * -809297399)
				       + (i_114_
					  * (-809297399 * class578.anInt7715)
					  / (class578.anInt7724
					     * 1049226697)));
				int i_117_
				    = (int) ((float) i_115_
					     + ((float) i
						+ client.aFloatArray11167[0]
						- (float) (i_101_ >> 1)));
				int i_118_ = (int) (client.aFloatArray11167[1]
						    + (float) i_20_ - 12.0F
						    + (float) i_116_);
				int i_119_
				    = (15 + i_118_
				       + 848869245 * class578.anInt7734);
				int i_120_ = 0;
				if (null != class578_59_)
				    i_120_ = (i_118_ + 15
					      + (848869245
						 * class578_59_.anInt7734));
				int i_121_ = 255;
				if (-681467477 * class578.anInt7731 >= 0)
				    i_121_
					= ((i_114_ << 8)
					   / (1049226697 * class578.anInt7724
					      - (-681467477
						 * class578.anInt7731)));
				if (i_121_ >= 0 && i_121_ < 255) {
				    int i_122_ = i_121_ << 24;
				    int i_123_ = i_122_ | 0xffffff;
				    if (class163_83_ != null)
					class163_83_.method2657((i_117_
								 + i_102_
								 - i_68_),
								i_118_, 0,
								i_123_, 1);
				    if (class163_85_ != null)
					class163_85_.method2657
					    ((i_103_ + i_117_ - i_70_
					      + (class578.anInt7737
						 * 1481307617)),
					     i_118_ + (-1588685693
						       * class578.anInt7736),
					     0, i_123_, 1);
				    if (null != class163_84_) {
					for (int i_124_ = 0; i_124_ < i_99_;
					     i_124_++)
					    class163_84_.method2657
						(((1481307617
						   * class578.anInt7737)
						  + (i_124_ * i_65_
						     + (i_104_ + i_117_
							- i_69_))),
						 (class578.anInt7736
						  * -1588685693) + i_118_,
						 0, i_123_, 1);
				    }
				    if (class163_86_ != null)
					class163_86_.method2657
					    ((class578.anInt7737 * 1481307617
					      + (i_117_ + i_107_ - i_71_)),
					     i_118_ + (class578.anInt7736
						       * -1588685693),
					     0, i_123_, 1);
				    class171.method2828(string_97_,
							i_105_ + i_117_,
							i_119_,
							((1499836569
							  * class578.anInt7723)
							 | i_122_),
							0, (byte) 124);
				    if (null != class578_59_) {
					if (null != class163)
					    class163.method2657((i_108_
								 + i_117_
								 - i_79_),
								i_118_, 0,
								i_123_, 1);
					if (class163_73_ != null)
					    class163_73_.method2657
						(((1481307617
						   * class578_59_.anInt7737)
						  + (i_117_ + i_109_ - i_81_)),
						 (class578_59_.anInt7736
						  * -1588685693) + i_118_,
						 0, i_123_, 1);
					if (class163_72_ != null) {
					    for (int i_125_ = 0;
						 i_125_ < i_100_; i_125_++)
						class163_72_.method2657
						    ((i_76_ * i_125_
						      + (i_110_ + i_117_
							 - i_80_)
						      + (1481307617
							 * (class578_59_
							    .anInt7737))),
						     (class578_59_.anInt7736
						      * -1588685693) + i_118_,
						     0, i_123_, 1);
					}
					if (class163_74_ != null)
					    class163_74_.method2657
						(((class578_59_.anInt7737
						   * 1481307617)
						  + (i_117_ + i_111_ - i_82_)),
						 ((-1588685693
						   * class578_59_.anInt7736)
						  + i_118_),
						 0, i_123_, 1);
					class171_87_.method2828
					    (string, i_112_ + i_117_, i_120_,
					     (class578_59_.anInt7723
					      * 1499836569) | i_122_,
					     0, (byte) 57);
				    }
				} else {
				    if (null != class163_83_)
					class163_83_.method2656((i_117_
								 + i_102_
								 - i_68_),
								i_118_);
				    if (class163_85_ != null)
					class163_85_.method2656
					    ((i_103_ + i_117_ - i_70_
					      + (1481307617
						 * class578.anInt7737)),
					     (class578.anInt7736 * -1588685693
					      + i_118_));
				    if (class163_84_ != null) {
					for (int i_126_ = 0; i_126_ < i_99_;
					     i_126_++)
					    class163_84_.method2656
						(((class578.anInt7737
						   * 1481307617)
						  + (i_65_ * i_126_
						     + (i_104_ + i_117_
							- i_69_))),
						 i_118_ + (class578.anInt7736
							   * -1588685693));
				    }
				    if (class163_86_ != null)
					class163_86_.method2656
					    ((1481307617 * class578.anInt7737
					      + (i_117_ + i_107_ - i_71_)),
					     (-1588685693 * class578.anInt7736
					      + i_118_));
				    class171.method2828(string_97_,
							i_117_ + i_105_,
							i_119_,
							((class578.anInt7723
							  * 1499836569)
							 | ~0xffffff),
							0, (byte) 44);
				    if (class578_59_ != null) {
					if (null != class163)
					    class163.method2656((i_108_
								 + i_117_
								 - i_79_),
								i_118_);
					if (class163_73_ != null)
					    class163_73_.method2656
						(((class578_59_.anInt7737
						   * 1481307617)
						  + (i_117_ + i_109_ - i_81_)),
						 (class578_59_.anInt7736
						  * -1588685693) + i_118_);
					if (class163_72_ != null) {
					    for (int i_127_ = 0;
						 i_127_ < i_100_; i_127_++)
						class163_72_.method2656
						    (((1481307617
						       * (class578_59_
							  .anInt7737))
						      + (i_76_ * i_127_
							 + (i_117_ + i_110_
							    - i_80_))),
						     ((-1588685693
						       * (class578_59_
							  .anInt7736))
						      + i_118_));
					}
					if (null != class163_74_)
					    class163_74_.method2656
						((i_111_ + i_117_ - i_82_
						  + (class578_59_.anInt7737
						     * 1481307617)),
						 (class578_59_.anInt7736
						  * -1588685693) + i_118_);
					class171_87_.method2828
					    (string, i_117_ + i_112_, i_120_,
					     ((1499836569
					       * class578_59_.anInt7723)
					      | ~0xffffff),
					     0, (byte) 18);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
	for (int i_128_ = 0; i_128_ < client.anInt11164 * 937787657;
	     i_128_++) {
	    int i_129_ = client.anIntArray11162[i_128_];
	    Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1;
	    if (i_129_ < 2048)
		class654_sub1_sub5_sub1
		    = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_129_];
	    else
		class654_sub1_sub5_sub1
		    = ((Class654_Sub1_Sub5_Sub1)
		       (((Class534_Sub6)
			 client.aClass9_11331.method579((long) (i_129_
								- 2048)))
			.anObject10417));
	    int i_130_ = client.anIntArray11163[i_128_];
	    Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1_131_;
	    if (i_130_ < 2048)
		class654_sub1_sub5_sub1_131_
		    = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_130_];
	    else
		class654_sub1_sub5_sub1_131_
		    = ((Class654_Sub1_Sub5_Sub1)
		       (((Class534_Sub6)
			 client.aClass9_11331.method579((long) (i_130_
								- 2048)))
			.anObject10417));
	    Class469.method7639(class654_sub1_sub5_sub1,
				class654_sub1_sub5_sub1_131_,
				(class654_sub1_sub5_sub1.anInt11929
				 -= 503147987) * -122260901,
				i, i_20_, i_21_, i_22_, i_23_, i_24_,
				-1752464357);
	}
	int i_132_ = (102396103 * Class322.aClass16_3420.anInt190
		      + Class322.aClass16_3420.anInt189 * 728893755 + 2);
	for (int i_133_ = 0; i_133_ < client.anInt11310 * -156893177;
	     i_133_++) {
	    int i_134_ = client.anIntArray11290[i_133_];
	    int i_135_ = client.anIntArray11291[i_133_];
	    int i_136_ = client.anIntArray11269[i_133_];
	    boolean bool = true;
	    while (bool) {
		bool = false;
		for (int i_137_ = 0; i_137_ < i_133_; i_137_++) {
		    if (i_135_ + 2 > client.anIntArray11291[i_137_] - i_132_
			&& i_135_ - i_132_ < client.anIntArray11291[i_137_] + 2
			&& i_134_ - i_136_ < (client.anIntArray11269[i_137_]
					      + client.anIntArray11290[i_137_])
			&& i_136_ + i_134_ > (client.anIntArray11290[i_137_]
					      - client.anIntArray11269[i_137_])
			&& client.anIntArray11291[i_137_] - i_132_ < i_135_) {
			i_135_ = client.anIntArray11291[i_137_] - i_132_;
			bool = true;
		    }
		}
	    }
	    client.anIntArray11291[i_133_] = i_135_;
	    String string
		= client.aClass526Array11293[i_133_].method8743((byte) 19);
	    if (Class172.aClass268_1824.method4882((short) 256))
		string = Class172.aClass268_1824.method4902(string, (byte) 61);
	    if (717910271 * client.anInt11225 == 0) {
		int i_138_ = 16776960;
		int i_139_
		    = client.aClass526Array11293[i_133_].method8744(691191252);
		if (i_139_ < 6)
		    i_138_ = client.anIntArray11056[i_139_];
		if (i_139_ == 6)
		    i_138_ = (1373322351 * client.anInt11161 % 20 < 10
			      ? 16711680 : 16776960);
		if (i_139_ == 7)
		    i_138_ = (1373322351 * client.anInt11161 % 20 < 10 ? 255
			      : 65535);
		if (8 == i_139_)
		    i_138_ = (client.anInt11161 * 1373322351 % 20 < 10 ? 45056
			      : 8454016);
		if (i_139_ == 9) {
		    int i_140_ = 150 - (client.aClass526Array11293[i_133_]
					    .method8746((byte) 93)
					* 150
					/ client.aClass526Array11293
					      [i_133_].method8749(825166877));
		    if (i_140_ < 50)
			i_138_ = i_140_ * 1280 + 16711680;
		    else if (i_140_ < 100)
			i_138_ = 16776960 - 327680 * (i_140_ - 50);
		    else if (i_140_ < 150)
			i_138_ = 5 * (i_140_ - 100) + 65280;
		}
		if (i_139_ == 10) {
		    int i_141_ = 150 - (client.aClass526Array11293[i_133_]
					    .method8746((byte) 98)
					* 150
					/ client.aClass526Array11293
					      [i_133_].method8749(825166877));
		    if (i_141_ < 50)
			i_138_ = 5 * i_141_ + 16711680;
		    else if (i_141_ < 100)
			i_138_ = 16711935 - 327680 * (i_141_ - 50);
		    else if (i_141_ < 150)
			i_138_ = ((i_141_ - 100) * 327680 + 255
				  - (i_141_ - 100) * 5);
		}
		if (i_139_ == 11) {
		    int i_142_ = 150 - (client.aClass526Array11293[i_133_]
					    .method8746((byte) 109)
					* 150
					/ client.aClass526Array11293
					      [i_133_].method8749(825166877));
		    if (i_142_ < 50)
			i_138_ = 16777215 - i_142_ * 327685;
		    else if (i_142_ < 100)
			i_138_ = (i_142_ - 50) * 327685 + 65280;
		    else if (i_142_ < 150)
			i_138_ = 16777215 - 327680 * (i_142_ - 100);
		}
		int i_143_ = i_138_ | ~0xffffff;
		int i_144_ = client.aClass526Array11293[i_133_]
				 .method8751(1805970952);
		if (i_144_ == 0)
		    Class231.aClass171_2325.method2830(string, i_134_ + i,
						       i_135_ + i_20_, i_143_,
						       -16777216, 65535);
		if (i_144_ == 1)
		    Class231.aClass171_2325.method2832(string, i + i_134_,
						       i_20_ + i_135_, i_143_,
						       -16777216,
						       (1373322351
							* client.anInt11161),
						       -1736884657);
		if (2 == i_144_)
		    Class231.aClass171_2325.method2833(string, i_134_ + i,
						       i_20_ + i_135_, i_143_,
						       -16777216,
						       (1373322351
							* client.anInt11161),
						       1574443371);
		if (i_144_ == 3) {
		    int i_145_ = 150 - (client.aClass526Array11293[i_133_]
					    .method8746((byte) 101)
					* 150
					/ client.aClass526Array11293
					      [i_133_].method8749(825166877));
		    Class231.aClass171_2325.method2834(string, i_134_ + i,
						       i_20_ + i_135_, i_143_,
						       -16777216,
						       (1373322351
							* client.anInt11161),
						       i_145_, 770995397);
		}
		if (4 == i_144_) {
		    int i_146_ = 150 - (client.aClass526Array11293[i_133_]
					    .method8746((byte) 16)
					* 150
					/ client.aClass526Array11293
					      [i_133_].method8749(825166877));
		    int i_147_ = i_146_ * (Class322.aClass16_3420
					       .method728(string, 1479781883)
					   + 100) / 150;
		    Class254.aClass185_2683.method3282(i + i_134_ - 50, i_20_,
						       i_134_ + i + 50,
						       i_22_ + i_20_);
		    Class231.aClass171_2325.method2828(string,
						       (50 + (i + i_134_)
							- i_147_),
						       i_135_ + i_20_, i_143_,
						       -16777216, (byte) 117);
		    Class254.aClass185_2683.method3373(i, i_20_, i_21_ + i,
						       i_20_ + i_22_);
		}
		if (5 == i_144_) {
		    int i_148_ = 150 - (client.aClass526Array11293[i_133_]
					    .method8746((byte) 46)
					* 150
					/ client.aClass526Array11293
					      [i_133_].method8749(825166877));
		    int i_149_ = 0;
		    if (i_148_ < 25)
			i_149_ = i_148_ - 25;
		    else if (i_148_ > 125)
			i_149_ = i_148_ - 125;
		    int i_150_
			= (Class322.aClass16_3420.anInt190 * 102396103
			   + Class322.aClass16_3420.anInt189 * 728893755);
		    Class254.aClass185_2683.method3282(i,
						       (i_20_ + i_135_ - i_150_
							- 1),
						       i + i_21_,
						       i_20_ + i_135_ + 5);
		    Class231.aClass171_2325.method2830(string, i + i_134_,
						       i_149_ + (i_135_
								 + i_20_),
						       i_143_, -16777216,
						       65535);
		    Class254.aClass185_2683.method3373(i, i_20_, i_21_ + i,
						       i_22_ + i_20_);
		}
	    } else
		Class231.aClass171_2325.method2830(string, i + i_134_,
						   i_135_ + i_20_, -256,
						   -16777216, 65535);
	}
    }
}
