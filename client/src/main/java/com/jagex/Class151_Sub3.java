/* Class151_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class151_Sub3 extends Class151
{
    static final int anInt9730 = -1694498816;
    static final int anInt9731 = 2;
    static final int anInt9732 = 1;
    static final boolean aBool9733 = true;
    static final int anInt9734 = 4;
    Class185_Sub2 aClass185_Sub2_9735;
    int anInt9736;
    Class139[][] aClass139ArrayArray9737;
    Class109[][] aClass109ArrayArray9738;
    Class121[][] aClass121ArrayArray9739;
    Class128[][] aClass128ArrayArray9740;
    Class120[][] aClass120ArrayArray9741;
    float aFloat9742;
    byte[][] aByteArrayArray9743;
    float aFloat9744;
    float aFloat9745;
    float aFloat9746;
    float aFloat9747;
    float aFloat9748;
    float aFloat9749;
    float aFloat9750;
    static final int anInt9751 = 64;
    float aFloat9752;
    float aFloat9753;
    float aFloat9754;
    float aFloat9755;
    float aFloat9756;
    float aFloat9757;
    float aFloat9758;
    byte[][] aByteArrayArray9759;
    float aFloat9760;
    static final boolean aBool9761 = true;
    static final boolean aBool9762 = false;
    
    public void method2493(int i, int i_0_, int[] is, int[] is_1_, int[] is_2_,
			   int[] is_3_, int[] is_4_, int[] is_5_, int[] is_6_,
			   int[] is_7_, Class166 class166, boolean bool) {
	boolean bool_8_ = (anInt9736 & 0x20) == 0;
	if (aClass121ArrayArray9739 == null && !bool_8_) {
	    aClass121ArrayArray9739 = (new Class121[anInt1701 * -1924295585]
				       [anInt1700 * -1466328823]);
	    aClass128ArrayArray9740 = (new Class128[anInt1701 * -1924295585]
				       [anInt1700 * -1466328823]);
	} else if (aClass120ArrayArray9741 == null && bool_8_)
	    aClass120ArrayArray9741 = (new Class120[anInt1701 * -1924295585]
				       [anInt1700 * -1466328823]);
	else if (aClass139ArrayArray9737 != null)
	    throw new IllegalStateException();
	if (is != null && is.length != 0) {
	    for (int i_9_ = 0; i_9_ < is_4_.length; i_9_++) {
		if (is_4_[i_9_] == -1)
		    is_4_[i_9_] = 0;
		else
		    is_4_[i_9_]
			= (Class415.anIntArray4666
			   [(Class315.method5705(is_4_[i_9_], 1696831721)
			     & 0xffff)]) << 8 | 0xff;
	    }
	    if (is_5_ != null) {
		for (int i_10_ = 0; i_10_ < is_5_.length; i_10_++) {
		    if (is_5_[i_10_] == -1)
			is_5_[i_10_] = 0;
		    else
			is_5_[i_10_]
			    = (Class415.anIntArray4666
			       [(Class315.method5705(is_5_[i_10_], 1669987689)
				 & 0xffff)]) << 8 | 0xff;
		}
	    }
	    if (bool_8_) {
		Class120 class120 = new Class120();
		class120.aShort1462 = (short) is.length;
		class120.aShort1464 = (short) (is.length / 3);
		class120.aShortArray1463 = new short[class120.aShort1462];
		class120.aShortArray1470 = new short[class120.aShort1462];
		class120.aShortArray1465 = new short[class120.aShort1462];
		class120.anIntArray1466 = new int[class120.aShort1462];
		class120.aShortArray1467 = new short[class120.aShort1462];
		class120.aShortArray1468 = new short[class120.aShort1462];
		class120.aByteArray1469 = new byte[class120.aShort1462];
		if (is_3_ != null)
		    class120.aShortArray1461 = new short[class120.aShort1462];
		for (int i_11_ = 0; i_11_ < class120.aShort1462; i_11_++) {
		    int i_12_ = is[i_11_];
		    int i_13_ = is_2_[i_11_];
		    boolean bool_14_ = false;
		    int i_15_;
		    if (i_12_ == 0 && i_13_ == 0)
			i_15_ = (aByteArrayArray9743[i][i_0_]
				 - aByteArrayArray9759[i][i_0_]);
		    else if (i_12_ == 0 && i_13_ == anInt1702 * 127780559)
			i_15_ = (aByteArrayArray9743[i][i_0_ + 1]
				 - aByteArrayArray9759[i][i_0_ + 1]);
		    else if (i_12_ == anInt1702 * 127780559
			     && i_13_ == anInt1702 * 127780559)
			i_15_ = (aByteArrayArray9743[i + 1][i_0_ + 1]
				 - aByteArrayArray9759[i + 1][i_0_ + 1]);
		    else if (i_12_ == anInt1702 * 127780559 && i_13_ == 0)
			i_15_ = (aByteArrayArray9743[i + 1][i_0_]
				 - aByteArrayArray9759[i + 1][i_0_]);
		    else {
			int i_16_
			    = (((aByteArrayArray9743[i][i_0_]
				 - aByteArrayArray9759[i][i_0_])
				* (anInt1702 * 127780559 - i_12_))
			       + (aByteArrayArray9743[i + 1][i_0_]
				  - aByteArrayArray9759[i + 1][i_0_]) * i_12_);
			int i_17_
			    = (((aByteArrayArray9743[i][i_0_ + 1]
				 - aByteArrayArray9759[i][i_0_ + 1])
				* (anInt1702 * 127780559 - i_12_))
			       + ((aByteArrayArray9743[i + 1][i_0_ + 1]
				   - aByteArrayArray9759[i + 1][i_0_ + 1])
				  * i_12_));
			i_15_ = (i_16_ * (anInt1702 * 127780559 - i_13_)
				 + i_17_ * i_13_) >> anInt1703 * 1304764278;
		    }
		    int i_18_ = (i << anInt1703 * -1495101509) + i_12_;
		    int i_19_ = (i_0_ << anInt1703 * -1495101509) + i_13_;
		    class120.aShortArray1463[i_11_] = (short) i_12_;
		    class120.aShortArray1465[i_11_] = (short) i_13_;
		    class120.aShortArray1470[i_11_]
			= (short) (method2498(i_18_, i_19_, -798232402)
				   + (is_1_ != null ? is_1_[i_11_] : 0));
		    if (i_15_ < 0)
			i_15_ = 0;
		    if (is_4_[i_11_] == 0) {
			class120.anIntArray1466[i_11_] = 0;
			if (is_5_ != null)
			    class120.aByteArray1469[i_11_] = (byte) i_15_;
		    } else {
			int i_20_ = 0;
			if (is_3_ != null) {
			    int i_21_ = (class120.aShortArray1461[i_11_]
					 = (short) is_3_[i_11_]);
			    if (class166.anInt1762 * -1095140607 != 0) {
				i_20_ = 255 * i_21_ / (class166.anInt1762
						       * -1095140607);
				if (i_20_ < 0)
				    i_20_ = 0;
				else if (i_20_ > 255)
				    i_20_ = 255;
			    }
			}
			int i_22_ = -16777216;
			if (is_6_[i_11_] != -1) {
			    Class186 class186
				= aClass185_Sub2_9735.aClass177_2012
				      .method2931(is_6_[i_11_], (byte) 1);
			    if (class186.aBool2043
				&& method15439(class186.aByte2067))
				i_22_ = -1694498816;
			}
			class120.anIntArray1466[i_11_]
			    = (i_22_
			       | Class197.method3817(method15454((is_4_[i_11_]
								  >> 8),
								 i_15_),
						     (class166.anInt1763
						      * 2113275141),
						     i_20_, -2136866394));
			if (is_5_ != null)
			    class120.aByteArray1469[i_11_] = (byte) i_15_;
		    }
		    class120.aShortArray1467[i_11_] = (short) is_6_[i_11_];
		    class120.aShortArray1468[i_11_] = (short) is_7_[i_11_];
		}
		if (is_5_ != null) {
		    class120.anIntArray1471 = new int[class120.aShort1464];
		    for (int i_23_ = 0; i_23_ < class120.aShort1464; i_23_++) {
			int i_24_ = i_23_ * 3;
			if (is_5_[i_24_] != 0)
			    class120.anIntArray1471[i_23_]
				= ~0xffffff | is_5_[i_24_] >> 8;
		    }
		}
		aClass120ArrayArray9741[i][i_0_] = class120;
	    } else {
		boolean bool_25_ = true;
		int i_26_ = -1;
		int i_27_ = -1;
		int i_28_ = -1;
		int i_29_ = -1;
		if (is.length == 6) {
		    for (int i_30_ = 0; i_30_ < 6; i_30_++) {
			if (is[i_30_] == 0 && is_2_[i_30_] == 0) {
			    if (i_26_ != -1 && is_4_[i_26_] != is_4_[i_30_]) {
				bool_25_ = false;
				break;
			    }
			    i_26_ = i_30_;
			} else if (is[i_30_] == anInt1702 * 127780559
				   && is_2_[i_30_] == 0) {
			    if (i_27_ != -1 && is_4_[i_27_] != is_4_[i_30_]) {
				bool_25_ = false;
				break;
			    }
			    i_27_ = i_30_;
			} else if (is[i_30_] == anInt1702 * 127780559
				   && is_2_[i_30_] == anInt1702 * 127780559) {
			    if (i_28_ != -1 && is_4_[i_28_] != is_4_[i_30_]) {
				bool_25_ = false;
				break;
			    }
			    i_28_ = i_30_;
			} else if (is[i_30_] == 0
				   && is_2_[i_30_] == anInt1702 * 127780559) {
			    if (i_29_ != -1 && is_4_[i_29_] != is_4_[i_30_]) {
				bool_25_ = false;
				break;
			    }
			    i_29_ = i_30_;
			}
		    }
		    if (i_26_ == -1 || i_27_ == -1 || i_28_ == -1
			|| i_29_ == -1)
			bool_25_ = false;
		    if (bool_25_) {
			if (is_1_ != null) {
			    for (int i_31_ = 0; i_31_ < 4; i_31_++) {
				if (is_1_[i_31_] != 0) {
				    bool_25_ = false;
				    break;
				}
			    }
			}
			if (bool_25_) {
			    for (int i_32_ = 1; i_32_ < 4; i_32_++) {
				if (is[i_32_] != is[0]
				    && (is[i_32_]
					!= is[0] + anInt1702 * 127780559)
				    && (is[i_32_]
					!= is[0] - anInt1702 * 127780559)) {
				    bool_25_ = false;
				    break;
				}
				if (is_2_[i_32_] != is_2_[0]
				    && (is_2_[i_32_]
					!= is_2_[0] + anInt1702 * 127780559)
				    && (is_2_[i_32_]
					!= is_2_[0] - anInt1702 * 127780559)) {
				    bool_25_ = false;
				    break;
				}
			    }
			}
		    }
		} else
		    bool_25_ = false;
		if (bool_25_) {
		    Class121 class121 = new Class121();
		    int i_33_ = is_4_[0];
		    int i_34_ = is_6_[0];
		    if (is_5_ != null) {
			class121.anInt1481 = is_5_[0] >> 8;
			if (i_33_ == 0)
			    class121.aByte1475 |= 0x2;
		    } else if (i_33_ == 0)
			return;
		    if ((anIntArrayArray1704[i][i_0_]
			 == anIntArrayArray1704[i + 1][i_0_])
			&& (anIntArrayArray1704[i][i_0_]
			    == anIntArrayArray1704[i + 1][i_0_ + 1])
			&& (anIntArrayArray1704[i][i_0_]
			    == anIntArrayArray1704[i][i_0_ + 1]))
			class121.aByte1475 |= 0x1;
		    if (i_34_ != -1 && (class121.aByte1475 & 0x2) == 0
			&& !(aClass185_Sub2_9735.aClass177_2012.method2931
			     (i_34_, (byte) 1).aBool2072)) {
			int i_35_;
			if (is_3_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_35_ = 255 * is_3_[i_26_] / (class166.anInt1762
							  * -1095140607);
			    if (i_35_ < 0)
				i_35_ = 0;
			    else if (i_35_ > 255)
				i_35_ = 255;
			} else
			    i_35_ = 0;
			class121.anInt1478
			    = (Class197.method3817
			       (method15454(is_4_[i_26_] >> 8,
					    (aByteArrayArray9743[i][i_0_]
					     - aByteArrayArray9759[i][i_0_])),
				class166.anInt1763 * 2113275141, i_35_,
				95520364));
			if (class121.anInt1481 != 0)
			    class121.anInt1478
				|= (255 - (aByteArrayArray9743[i][i_0_]
					   - aByteArrayArray9759[i][i_0_])
				    << 25);
			if (is_3_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_35_ = 255 * is_3_[i_27_] / (class166.anInt1762
							  * -1095140607);
			    if (i_35_ < 0)
				i_35_ = 0;
			    else if (i_35_ > 255)
				i_35_ = 255;
			} else
			    i_35_ = 0;
			class121.anInt1474
			    = (Class197.method3817
			       (method15454(is_4_[i_27_] >> 8,
					    (aByteArrayArray9743[i + 1][i_0_]
					     - (aByteArrayArray9759[i + 1]
						[i_0_]))),
				class166.anInt1763 * 2113275141, i_35_,
				-496216056));
			if (class121.anInt1481 != 0)
			    class121.anInt1474
				|= (255 - (aByteArrayArray9743[i + 1][i_0_]
					   - aByteArrayArray9759[i + 1][i_0_])
				    << 25);
			if (is_3_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_35_ = 255 * is_3_[i_28_] / (class166.anInt1762
							  * -1095140607);
			    if (i_35_ < 0)
				i_35_ = 0;
			    else if (i_35_ > 255)
				i_35_ = 255;
			} else
			    i_35_ = 0;
			class121.anInt1480
			    = (Class197.method3817
			       (method15454(is_4_[i_28_] >> 8,
					    ((aByteArrayArray9743[i + 1]
					      [i_0_ + 1])
					     - (aByteArrayArray9759[i + 1]
						[i_0_ + 1]))),
				class166.anInt1763 * 2113275141, i_35_,
				273827021));
			if (class121.anInt1481 != 0)
			    class121.anInt1480
				|= 255 - (aByteArrayArray9743[i + 1][i_0_ + 1]
					  - (aByteArrayArray9759[i + 1]
					     [i_0_ + 1])) << 25;
			if (is_3_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_35_ = 255 * is_3_[i_29_] / (class166.anInt1762
							  * -1095140607);
			    if (i_35_ < 0)
				i_35_ = 0;
			    else if (i_35_ > 255)
				i_35_ = 255;
			} else
			    i_35_ = 0;
			class121.anInt1476
			    = (Class197.method3817
			       (method15454(is_4_[i_29_] >> 8,
					    (aByteArrayArray9743[i][i_0_ + 1]
					     - (aByteArrayArray9759[i]
						[i_0_ + 1]))),
				class166.anInt1763 * 2113275141, i_35_,
				1667556273));
			class121.aShort1482 = (short) i_34_;
		    } else {
			int i_36_;
			if (is_3_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_36_ = 255 * is_3_[i_26_] / (class166.anInt1762
							  * -1095140607);
			    if (i_36_ < 0)
				i_36_ = 0;
			    else if (i_36_ > 255)
				i_36_ = 255;
			} else
			    i_36_ = 0;
			class121.anInt1478
			    = (Class197.method3817
			       (method15454(is_4_[i_26_] >> 8,
					    (aByteArrayArray9743[i][i_0_]
					     - aByteArrayArray9759[i][i_0_])),
				class166.anInt1763 * 2113275141, i_36_,
				-621441892));
			if (class121.anInt1481 != 0)
			    class121.anInt1478
				|= (255 - (aByteArrayArray9743[i][i_0_]
					   - aByteArrayArray9759[i][i_0_])
				    << 25);
			if (is_3_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_36_ = 255 * is_3_[i_27_] / (class166.anInt1762
							  * -1095140607);
			    if (i_36_ < 0)
				i_36_ = 0;
			    else if (i_36_ > 255)
				i_36_ = 255;
			} else
			    i_36_ = 0;
			class121.anInt1474
			    = (Class197.method3817
			       (method15454(is_4_[i_27_] >> 8,
					    (aByteArrayArray9743[i + 1][i_0_]
					     - (aByteArrayArray9759[i + 1]
						[i_0_]))),
				class166.anInt1763 * 2113275141, i_36_,
				-419232996));
			if (class121.anInt1481 != 0)
			    class121.anInt1474
				|= (255 - (aByteArrayArray9743[i + 1][i_0_]
					   - aByteArrayArray9759[i + 1][i_0_])
				    << 25);
			if (is_3_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_36_ = 255 * is_3_[i_28_] / (class166.anInt1762
							  * -1095140607);
			    if (i_36_ < 0)
				i_36_ = 0;
			    else if (i_36_ > 255)
				i_36_ = 255;
			} else
			    i_36_ = 0;
			class121.anInt1480
			    = (Class197.method3817
			       (method15454(is_4_[i_28_] >> 8,
					    ((aByteArrayArray9743[i + 1]
					      [i_0_ + 1])
					     - (aByteArrayArray9759[i + 1]
						[i_0_ + 1]))),
				class166.anInt1763 * 2113275141, i_36_,
				352311996));
			if (class121.anInt1481 != 0)
			    class121.anInt1480
				|= 255 - (aByteArrayArray9743[i + 1][i_0_ + 1]
					  - (aByteArrayArray9759[i + 1]
					     [i_0_ + 1])) << 25;
			if (is_3_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_36_ = 255 * is_3_[i_29_] / (class166.anInt1762
							  * -1095140607);
			    if (i_36_ < 0)
				i_36_ = 0;
			    else if (i_36_ > 255)
				i_36_ = 255;
			} else
			    i_36_ = 0;
			class121.anInt1476
			    = (Class197.method3817
			       (method15454(is_4_[i_29_] >> 8,
					    (aByteArrayArray9743[i][i_0_ + 1]
					     - (aByteArrayArray9759[i]
						[i_0_ + 1]))),
				class166.anInt1763 * 2113275141, i_36_,
				-447954681));
			if (class121.anInt1481 != 0)
			    class121.anInt1476
				|= (255 - (aByteArrayArray9743[i][i_0_ + 1]
					   - aByteArrayArray9759[i][i_0_ + 1])
				    << 25);
			class121.aShort1482 = (short) -1;
		    }
		    if (is_3_ != null) {
			class121.aShort1479 = (short) is_3_[i_28_];
			class121.aShort1472 = (short) is_3_[i_29_];
			class121.aShort1473 = (short) is_3_[i_27_];
			class121.aShort1477 = (short) is_3_[i_26_];
		    }
		    aClass121ArrayArray9739[i][i_0_] = class121;
		} else {
		    Class128 class128 = new Class128();
		    class128.aShort1505 = (short) is.length;
		    class128.aShort1511 = (short) (is.length / 3);
		    class128.aShortArray1506 = new short[class128.aShort1505];
		    class128.aShortArray1509 = new short[class128.aShort1505];
		    class128.aShortArray1510 = new short[class128.aShort1505];
		    class128.anIntArray1507 = new int[class128.aShort1505];
		    if (is_3_ != null)
			class128.aShortArray1508
			    = new short[class128.aShort1505];
		    for (int i_37_ = 0; i_37_ < class128.aShort1505; i_37_++) {
			int i_38_ = is[i_37_];
			int i_39_ = is_2_[i_37_];
			boolean bool_40_ = false;
			int i_41_;
			if (i_38_ == 0 && i_39_ == 0)
			    i_41_ = (aByteArrayArray9743[i][i_0_]
				     - aByteArrayArray9759[i][i_0_]);
			else if (i_38_ == 0 && i_39_ == anInt1702 * 127780559)
			    i_41_ = (aByteArrayArray9743[i][i_0_ + 1]
				     - aByteArrayArray9759[i][i_0_ + 1]);
			else if (i_38_ == anInt1702 * 127780559
				 && i_39_ == anInt1702 * 127780559)
			    i_41_ = (aByteArrayArray9743[i + 1][i_0_ + 1]
				     - aByteArrayArray9759[i + 1][i_0_ + 1]);
			else if (i_38_ == anInt1702 * 127780559 && i_39_ == 0)
			    i_41_ = (aByteArrayArray9743[i + 1][i_0_]
				     - aByteArrayArray9759[i + 1][i_0_]);
			else {
			    int i_42_
				= (((aByteArrayArray9743[i][i_0_]
				     - aByteArrayArray9759[i][i_0_])
				    * (anInt1702 * 127780559 - i_38_))
				   + ((aByteArrayArray9743[i + 1][i_0_]
				       - aByteArrayArray9759[i + 1][i_0_])
				      * i_38_));
			    int i_43_
				= (((aByteArrayArray9743[i][i_0_ + 1]
				     - aByteArrayArray9759[i][i_0_ + 1])
				    * (anInt1702 * 127780559 - i_38_))
				   + ((aByteArrayArray9743[i + 1][i_0_ + 1]
				       - aByteArrayArray9759[i + 1][i_0_ + 1])
				      * i_38_));
			    i_41_
				= (i_42_ * (anInt1702 * 127780559 - i_39_)
				   + i_43_ * i_39_) >> anInt1703 * 1304764278;
			}
			int i_44_ = (i << anInt1703 * -1495101509) + i_38_;
			int i_45_ = (i_0_ << anInt1703 * -1495101509) + i_39_;
			class128.aShortArray1506[i_37_] = (short) i_38_;
			class128.aShortArray1510[i_37_] = (short) i_39_;
			class128.aShortArray1509[i_37_]
			    = (short) (method2498(i_44_, i_45_, -1608044862)
				       + (is_1_ != null ? is_1_[i_37_] : 0));
			if (i_41_ < 0)
			    i_41_ = 0;
			if (is_4_[i_37_] == 0) {
			    if (is_5_ != null)
				class128.anIntArray1507[i_37_] = i_41_ << 25;
			    else
				class128.anIntArray1507[i_37_] = 0;
			} else {
			    int i_46_ = 0;
			    if (is_3_ != null) {
				int i_47_ = (class128.aShortArray1508[i_37_]
					     = (short) is_3_[i_37_]);
				if (class166.anInt1762 * -1095140607 != 0) {
				    i_46_ = 255 * i_47_ / (class166.anInt1762
							   * -1095140607);
				    if (i_46_ < 0)
					i_46_ = 0;
				    else if (i_46_ > 255)
					i_46_ = 255;
				}
			    }
			    class128.anIntArray1507[i_37_]
				= Class197.method3817(method15454((is_4_[i_37_]
								   >> 8),
								  i_41_),
						      (class166.anInt1763
						       * 2113275141),
						      i_46_, 217384540);
			    if (is_5_ != null)
				class128.anIntArray1507[i_37_] |= i_41_ << 25;
			}
		    }
		    boolean bool_48_ = false;
		    for (int i_49_ = 0; i_49_ < class128.aShort1511; i_49_++) {
			if (is_6_[i_49_ * 3] != -1
			    && !(aClass185_Sub2_9735.aClass177_2012.method2931
				 (is_6_[i_49_ * 3], (byte) 1).aBool2072))
			    bool_48_ = true;
		    }
		    if (is_5_ != null)
			class128.anIntArray1515 = new int[class128.aShort1511];
		    if (bool_48_) {
			class128.aShortArray1513
			    = new short[class128.aShort1511];
			class128.aShortArray1514
			    = new short[class128.aShort1511];
		    }
		    for (int i_50_ = 0; i_50_ < class128.aShort1511; i_50_++) {
			int i_51_ = i_50_ * 3;
			if (is_5_ != null && is_5_[i_51_] != 0)
			    class128.anIntArray1515[i_50_] = is_5_[i_51_] >> 8;
			if (bool_48_) {
			    int i_52_ = i_51_ + 1;
			    int i_53_ = i_52_ + 1;
			    boolean bool_54_ = false;
			    boolean bool_55_ = true;
			    int i_56_ = is_6_[i_51_];
			    if (i_56_ == -1
				|| aClass185_Sub2_9735.aClass177_2012
				       .method2931(i_56_, (byte) 1).aBool2072)
				bool_55_ = false;
			    else
				bool_54_ = true;
			    i_56_ = is_6_[i_52_];
			    if (i_56_ == -1
				|| aClass185_Sub2_9735.aClass177_2012
				       .method2931(i_56_, (byte) 1).aBool2072)
				bool_55_ = false;
			    else
				bool_54_ = true;
			    i_56_ = is_6_[i_53_];
			    if (i_56_ == -1
				|| aClass185_Sub2_9735.aClass177_2012
				       .method2931(i_56_, (byte) 1).aBool2072)
				bool_55_ = false;
			    else
				bool_54_ = true;
			    if (bool_55_) {
				class128.aShortArray1513[i_50_]
				    = (short) i_56_;
				class128.aShortArray1514[i_50_]
				    = (short) is_7_[i_51_];
			    } else {
				if (bool_54_) {
				    i_56_ = is_6_[i_51_];
				    if (i_56_ != -1
					&& !(aClass185_Sub2_9735
						 .aClass177_2012.method2931
					     (i_56_, (byte) 1).aBool2072))
					class128.anIntArray1507[i_51_]
					    = (Class415.anIntArray4666
					       [(Class315.method5705
						 ((aClass185_Sub2_9735
						       .aClass177_2012
						       .method2931
						   (i_56_, (byte) 1)
						   .aShort2060) & 0xffff,
						  1217407430)) & 0xffff]);
				    i_56_ = is_6_[i_52_];
				    if (i_56_ != -1
					&& !(aClass185_Sub2_9735
						 .aClass177_2012.method2931
					     (i_56_, (byte) 1).aBool2072))
					class128.anIntArray1507[i_52_]
					    = (Class415.anIntArray4666
					       [(Class315.method5705
						 ((aClass185_Sub2_9735
						       .aClass177_2012
						       .method2931
						   (i_56_, (byte) 1)
						   .aShort2060) & 0xffff,
						  614825321)) & 0xffff]);
				    i_56_ = is_6_[i_53_];
				    if (i_56_ != -1
					&& !(aClass185_Sub2_9735
						 .aClass177_2012.method2931
					     (i_56_, (byte) 1).aBool2072))
					class128.anIntArray1507[i_53_]
					    = (Class415.anIntArray4666
					       [(Class315.method5705
						 ((aClass185_Sub2_9735
						       .aClass177_2012
						       .method2931
						   (i_56_, (byte) 1)
						   .aShort2060) & 0xffff,
						  1053447433)) & 0xffff]);
				}
				class128.aShortArray1513[i_50_] = (short) -1;
			    }
			}
		    }
		    aClass128ArrayArray9740[i][i_0_] = class128;
		}
	    }
	}
    }
    
    public Class534_Sub18_Sub16 method2501
	(int i, int i_57_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	return null;
    }
    
    public Class534_Sub18_Sub16 method2528
	(int i, int i_58_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	return null;
    }
    
    public void method2492(int i, int i_59_, int i_60_) {
	i = Math.min(aByteArrayArray9759.length - 1, Math.max(0, i));
	i_59_
	    = Math.min(aByteArrayArray9759[i].length - 1, Math.max(0, i_59_));
	if (aByteArrayArray9759[i][i_59_] < i_60_)
	    aByteArrayArray9759[i][i_59_] = (byte) i_60_;
    }
    
    public boolean method2497(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			      int i_61_, int i_62_, int i_63_, boolean bool) {
	return false;
    }
    
    public void method2496(Class534_Sub21 class534_sub21, int[] is) {
	/* empty */
    }
    
    public void method2506(int i, int i_64_, int i_65_, boolean[][] bools,
			   boolean bool, int i_66_) {
	if (aClass185_Sub2_9735.anIntArray9338 == null
	    || aClass185_Sub2_9735.aFloatArray9341 == null)
	    throw new IllegalStateException("");
	Class433 class433 = aClass185_Sub2_9735.aClass433_9346;
	aFloat9742 = class433.aFloatArray4853[0];
	aFloat9760 = class433.aFloatArray4853[1];
	aFloat9744 = class433.aFloatArray4853[2];
	aFloat9745 = class433.aFloatArray4853[3];
	aFloat9746 = class433.aFloatArray4853[4];
	aFloat9747 = class433.aFloatArray4853[5];
	aFloat9756 = class433.aFloatArray4853[6];
	aFloat9757 = class433.aFloatArray4853[7];
	aFloat9750 = class433.aFloatArray4853[8];
	aFloat9749 = class433.aFloatArray4853[9];
	aFloat9752 = class433.aFloatArray4853[10];
	aFloat9753 = class433.aFloatArray4853[11];
	aFloat9754 = class433.aFloatArray4853[12];
	aFloat9755 = class433.aFloatArray4853[13];
	aFloat9758 = class433.aFloatArray4853[14];
	aFloat9748 = class433.aFloatArray4853[15];
	for (int i_67_ = 0; i_67_ < i_65_ + i_65_; i_67_++) {
	    for (int i_68_ = 0; i_68_ < i_65_ + i_65_; i_68_++) {
		if (bools[i_67_][i_68_]) {
		    int i_69_ = i - i_65_ + i_67_;
		    int i_70_ = i_64_ - i_65_ + i_68_;
		    if (i_69_ >= 0 && i_69_ < anInt1701 * -1924295585
			&& i_70_ >= 0 && i_70_ < anInt1700 * -1466328823)
			method15441(i_69_, i_70_, i_66_);
		}
	    }
	}
    }
    
    public void method2516(int i, int i_71_, int i_72_, boolean[][] bools,
			   boolean bool, int i_73_) {
	if (aClass185_Sub2_9735.anIntArray9338 == null
	    || aClass185_Sub2_9735.aFloatArray9341 == null)
	    throw new IllegalStateException("");
	Class433 class433 = aClass185_Sub2_9735.aClass433_9346;
	aFloat9742 = class433.aFloatArray4853[0];
	aFloat9760 = class433.aFloatArray4853[1];
	aFloat9744 = class433.aFloatArray4853[2];
	aFloat9745 = class433.aFloatArray4853[3];
	aFloat9746 = class433.aFloatArray4853[4];
	aFloat9747 = class433.aFloatArray4853[5];
	aFloat9756 = class433.aFloatArray4853[6];
	aFloat9757 = class433.aFloatArray4853[7];
	aFloat9750 = class433.aFloatArray4853[8];
	aFloat9749 = class433.aFloatArray4853[9];
	aFloat9752 = class433.aFloatArray4853[10];
	aFloat9753 = class433.aFloatArray4853[11];
	aFloat9754 = class433.aFloatArray4853[12];
	aFloat9755 = class433.aFloatArray4853[13];
	aFloat9758 = class433.aFloatArray4853[14];
	aFloat9748 = class433.aFloatArray4853[15];
	for (int i_74_ = 0; i_74_ < i_72_ + i_72_; i_74_++) {
	    for (int i_75_ = 0; i_75_ < i_72_ + i_72_; i_75_++) {
		if (bools[i_74_][i_75_]) {
		    int i_76_ = i - i_72_ + i_74_;
		    int i_77_ = i_71_ - i_72_ + i_75_;
		    if (i_76_ >= 0 && i_76_ < anInt1701 * -1924295585
			&& i_77_ >= 0 && i_77_ < anInt1700 * -1466328823)
			method15441(i_76_, i_77_, i_73_);
		}
	    }
	}
    }
    
    void method15437(int i, int i_78_, Class119 class119, float[] fs,
		     float[] fs_79_, float[] fs_80_, float[] fs_81_,
		     float[] fs_82_, int i_83_) {
	Class139 class139 = aClass139ArrayArray9737[i][i_78_];
	if (class139 != null) {
	    if ((class139.aByte1614 & 0x2) == 0) {
		if (i_83_ != 0) {
		    if ((class139.aByte1614 & 0x4) != 0) {
			if ((i_83_ & 0x1) != 0)
			    return;
		    } else if ((i_83_ & 0x2) != 0)
			return;
		}
		int i_84_ = i * (anInt1702 * 127780559);
		int i_85_ = i_84_ + anInt1702 * 127780559;
		int i_86_ = i_78_ * (anInt1702 * 127780559);
		int i_87_ = i_86_ + anInt1702 * 127780559;
		float f;
		float f_88_;
		float f_89_;
		float f_90_;
		float f_91_;
		float f_92_;
		float f_93_;
		float f_94_;
		float f_95_;
		float f_96_;
		float f_97_;
		float f_98_;
		float f_99_;
		float f_100_;
		float f_101_;
		float f_102_;
		if ((class139.aByte1614 & 0x1) != 0) {
		    int i_103_ = anIntArrayArray1704[i][i_78_];
		    float f_104_ = aFloat9756 * (float) i_103_;
		    float f_105_ = aFloat9757 * (float) i_103_;
		    float f_106_
			= aFloat9758 + (aFloat9744 * (float) i_84_ + f_104_
					+ aFloat9752 * (float) i_86_);
		    f = aFloat9748 + (aFloat9745 * (float) i_84_ + f_105_
				      + aFloat9753 * (float) i_86_);
		    if (f_106_ < -f)
			return;
		    float f_107_
			= aFloat9758 + (aFloat9744 * (float) i_85_ + f_104_
					+ aFloat9752 * (float) i_86_);
		    f_88_ = aFloat9748 + (aFloat9745 * (float) i_85_ + f_105_
					  + aFloat9753 * (float) i_86_);
		    if (f_107_ < -f_88_)
			return;
		    float f_108_
			= aFloat9758 + (aFloat9744 * (float) i_85_ + f_104_
					+ aFloat9752 * (float) i_87_);
		    f_89_ = aFloat9748 + (aFloat9745 * (float) i_85_ + f_105_
					  + aFloat9753 * (float) i_87_);
		    if (f_108_ < -f_89_)
			return;
		    float f_109_
			= aFloat9758 + (aFloat9744 * (float) i_84_ + f_104_
					+ aFloat9752 * (float) i_87_);
		    f_90_ = aFloat9748 + (aFloat9745 * (float) i_84_ + f_105_
					  + aFloat9753 * (float) i_87_);
		    if (f_109_ < -f_90_)
			return;
		    float f_110_ = aFloat9746 * (float) i_103_;
		    float f_111_ = aFloat9747 * (float) i_103_;
		    float f_112_
			= aFloat9754 + (aFloat9742 * (float) i_84_ + f_110_
					+ aFloat9750 * (float) i_86_);
		    f_91_ = (class119.aFloat1429
			     + class119.aFloat1430 * f_112_ / f);
		    float f_113_
			= aFloat9755 + (aFloat9760 * (float) i_84_ + f_111_
					+ aFloat9749 * (float) i_86_);
		    f_92_ = (class119.aFloat1431
			     + class119.aFloat1432 * f_113_ / f);
		    f_93_ = (class119.aFloat1433
			     + class119.aFloat1434 * f_106_ / f);
		    float f_114_
			= aFloat9754 + (aFloat9742 * (float) i_85_ + f_110_
					+ aFloat9750 * (float) i_86_);
		    f_94_ = (class119.aFloat1429
			     + class119.aFloat1430 * f_114_ / f_88_);
		    float f_115_
			= aFloat9755 + (aFloat9760 * (float) i_85_ + f_111_
					+ aFloat9749 * (float) i_86_);
		    f_95_ = (class119.aFloat1431
			     + class119.aFloat1432 * f_115_ / f_88_);
		    f_96_ = (class119.aFloat1433
			     + class119.aFloat1434 * f_107_ / f_88_);
		    float f_116_
			= aFloat9754 + (aFloat9742 * (float) i_85_ + f_110_
					+ aFloat9750 * (float) i_87_);
		    f_97_ = (class119.aFloat1429
			     + class119.aFloat1430 * f_116_ / f_89_);
		    float f_117_
			= aFloat9755 + (aFloat9760 * (float) i_85_ + f_111_
					+ aFloat9749 * (float) i_87_);
		    f_98_ = (class119.aFloat1431
			     + class119.aFloat1432 * f_117_ / f_89_);
		    f_99_ = (class119.aFloat1433
			     + class119.aFloat1434 * f_108_ / f_89_);
		    float f_118_
			= aFloat9754 + (aFloat9742 * (float) i_84_ + f_110_
					+ aFloat9750 * (float) i_87_);
		    f_100_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_118_ / f_90_);
		    float f_119_
			= aFloat9755 + (aFloat9760 * (float) i_84_ + f_111_
					+ aFloat9749 * (float) i_87_);
		    f_101_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_119_ / f_90_);
		    f_102_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_109_ / f_90_);
		} else {
		    int i_120_ = anIntArrayArray1704[i][i_78_];
		    int i_121_ = anIntArrayArray1704[i + 1][i_78_];
		    int i_122_ = anIntArrayArray1704[i + 1][i_78_ + 1];
		    int i_123_ = anIntArrayArray1704[i][i_78_ + 1];
		    float f_124_ = aFloat9758 + (aFloat9744 * (float) i_84_
						 + aFloat9756 * (float) i_120_
						 + aFloat9752 * (float) i_86_);
		    f = aFloat9748 + (aFloat9745 * (float) i_84_
				      + aFloat9757 * (float) i_120_
				      + aFloat9753 * (float) i_86_);
		    if (f_124_ < -f)
			return;
		    float f_125_ = aFloat9758 + (aFloat9744 * (float) i_85_
						 + aFloat9756 * (float) i_121_
						 + aFloat9752 * (float) i_86_);
		    f_88_ = aFloat9748 + (aFloat9745 * (float) i_85_
					  + aFloat9757 * (float) i_121_
					  + aFloat9753 * (float) i_86_);
		    if (f_125_ < -f_88_)
			return;
		    float f_126_ = aFloat9758 + (aFloat9744 * (float) i_85_
						 + aFloat9756 * (float) i_122_
						 + aFloat9752 * (float) i_87_);
		    f_89_ = aFloat9748 + (aFloat9745 * (float) i_85_
					  + aFloat9757 * (float) i_122_
					  + aFloat9753 * (float) i_87_);
		    if (f_126_ < -f_89_)
			return;
		    float f_127_ = aFloat9758 + (aFloat9744 * (float) i_84_
						 + aFloat9756 * (float) i_123_
						 + aFloat9752 * (float) i_87_);
		    f_90_ = aFloat9748 + (aFloat9745 * (float) i_84_
					  + aFloat9757 * (float) i_123_
					  + aFloat9753 * (float) i_87_);
		    if (f_127_ < -f_90_)
			return;
		    float f_128_ = aFloat9754 + (aFloat9742 * (float) i_84_
						 + aFloat9746 * (float) i_120_
						 + aFloat9750 * (float) i_86_);
		    f_91_ = (class119.aFloat1429
			     + class119.aFloat1430 * f_128_ / f);
		    float f_129_ = aFloat9755 + (aFloat9760 * (float) i_84_
						 + aFloat9747 * (float) i_120_
						 + aFloat9749 * (float) i_86_);
		    f_92_ = (class119.aFloat1431
			     + class119.aFloat1432 * f_129_ / f);
		    f_93_ = (class119.aFloat1433
			     + class119.aFloat1434 * f_124_ / f);
		    float f_130_ = aFloat9754 + (aFloat9742 * (float) i_85_
						 + aFloat9746 * (float) i_121_
						 + aFloat9750 * (float) i_86_);
		    f_94_ = (class119.aFloat1429
			     + class119.aFloat1430 * f_130_ / f_88_);
		    float f_131_ = aFloat9755 + (aFloat9760 * (float) i_85_
						 + aFloat9747 * (float) i_121_
						 + aFloat9749 * (float) i_86_);
		    f_95_ = (class119.aFloat1431
			     + class119.aFloat1432 * f_131_ / f_88_);
		    f_96_ = (class119.aFloat1433
			     + class119.aFloat1434 * f_125_ / f_88_);
		    float f_132_ = aFloat9754 + (aFloat9742 * (float) i_85_
						 + aFloat9746 * (float) i_122_
						 + aFloat9750 * (float) i_87_);
		    f_97_ = (class119.aFloat1429
			     + class119.aFloat1430 * f_132_ / f_89_);
		    float f_133_ = aFloat9755 + (aFloat9760 * (float) i_85_
						 + aFloat9747 * (float) i_122_
						 + aFloat9749 * (float) i_87_);
		    f_98_ = (class119.aFloat1431
			     + class119.aFloat1432 * f_133_ / f_89_);
		    f_99_ = (class119.aFloat1433
			     + class119.aFloat1434 * f_126_ / f_89_);
		    float f_134_ = aFloat9754 + (aFloat9742 * (float) i_84_
						 + aFloat9746 * (float) i_123_
						 + aFloat9750 * (float) i_87_);
		    f_100_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_134_ / f_90_);
		    float f_135_ = aFloat9755 + (aFloat9760 * (float) i_84_
						 + aFloat9747 * (float) i_123_
						 + aFloat9749 * (float) i_87_);
		    f_101_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_135_ / f_90_);
		    f_102_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_127_ / f_90_);
		}
		boolean bool = false;
		if (class139.aShort1610 != -1) {
		    Class186 class186
			= (aClass185_Sub2_9735.aClass177_2012.method2931
			   (class139.aShort1610 & 0xffff, (byte) 1));
		    bool = class186.aBool2043;
		}
		if (((f_97_ - f_100_) * (f_95_ - f_101_)
		     - (f_98_ - f_101_) * (f_94_ - f_100_))
		    > 0.0F) {
		    class119.aBool1422
			= (f_97_ < 0.0F || f_100_ < 0.0F || f_94_ < 0.0F
			   || f_97_ > (float) class119.anInt1448
			   || f_100_ > (float) class119.anInt1448
			   || f_94_ > (float) class119.anInt1448);
		    if (bool)
			class119.method2166
			    (true, true, false, f_98_, f_101_, f_95_, f_97_,
			     f_100_, f_94_, f_99_, f_102_, f_96_, f_89_, f_90_,
			     f_88_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1611 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1612 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1613 & 0xffff])
					  & 0xffffff),
			     0, 0.0F, 0.0F, 0.0F,
			     class139.aShort1610 & 0xffff);
		    else
			class119.method2139(true, true, false, f_98_, f_101_,
					    f_95_, f_97_, f_100_, f_94_, f_99_,
					    f_102_, f_96_,
					    (float) (class139.aShort1611
						     & 0xffff),
					    (float) (class139.aShort1612
						     & 0xffff),
					    (float) (class139.aShort1613
						     & 0xffff));
		}
		if (((f_91_ - f_94_) * (f_101_ - f_95_)
		     - (f_92_ - f_95_) * (f_100_ - f_94_))
		    > 0.0F) {
		    class119.aBool1422
			= (f_91_ < 0.0F || f_94_ < 0.0F || f_100_ < 0.0F
			   || f_91_ > (float) class119.anInt1448
			   || f_94_ > (float) class119.anInt1448
			   || f_100_ > (float) class119.anInt1448);
		    if (bool)
			class119.method2166
			    (true, true, false, f_92_, f_95_, f_101_, f_91_,
			     f_94_, f_100_, f_93_, f_96_, f_102_, f, f_88_,
			     f_90_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1609 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1613 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1612 & 0xffff])
					  & 0xffffff),
			     0, 0.0F, 0.0F, 0.0F,
			     class139.aShort1610 & 0xffff);
		    else
			class119.method2139(true, true, false, f_92_, f_95_,
					    f_101_, f_91_, f_94_, f_100_,
					    f_93_, f_96_, f_102_,
					    (float) (class139.aShort1609
						     & 0xffff),
					    (float) (class139.aShort1613
						     & 0xffff),
					    (float) (class139.aShort1612
						     & 0xffff));
		}
	    }
	} else {
	    Class109 class109 = aClass109ArrayArray9738[i][i_78_];
	    if (class109 != null) {
		if (i_83_ != 0) {
		    if ((class109.aByte1331 & 0x4) != 0) {
			if ((i_83_ & 0x1) != 0)
			    return;
		    } else if ((i_83_ & 0x2) != 0)
			return;
		}
		for (int i_136_ = 0; i_136_ < class109.aShort1330; i_136_++) {
		    int i_137_ = (class109.aShortArray1332[i_136_]
				  + (i << anInt1703 * -1495101509));
		    short i_138_ = class109.aShortArray1333[i_136_];
		    int i_139_ = (class109.aShortArray1334[i_136_]
				  + (i_78_ << anInt1703 * -1495101509));
		    float f = aFloat9758 + (aFloat9744 * (float) i_137_
					    + aFloat9756 * (float) i_138_
					    + aFloat9752 * (float) i_139_);
		    float f_140_
			= aFloat9748 + (aFloat9745 * (float) i_137_
					+ aFloat9757 * (float) i_138_
					+ aFloat9753 * (float) i_139_);
		    if (f < -f_140_)
			return;
		    float f_141_
			= aFloat9754 + (aFloat9742 * (float) i_137_
					+ aFloat9746 * (float) i_138_
					+ aFloat9750 * (float) i_139_);
		    float f_142_
			= aFloat9755 + (aFloat9760 * (float) i_137_
					+ aFloat9747 * (float) i_138_
					+ aFloat9749 * (float) i_139_);
		    fs[i_136_] = (class119.aFloat1429
				  + class119.aFloat1430 * f_141_ / f_140_);
		    fs_79_[i_136_] = (class119.aFloat1431
				      + class119.aFloat1432 * f_142_ / f_140_);
		    fs_80_[i_136_] = (class119.aFloat1433
				      + class119.aFloat1434 * f / f_140_);
		    fs_81_[i_136_] = f_140_;
		}
		if (class109.aShortArray1329 != null) {
		    for (int i_143_ = 0; i_143_ < class109.aShort1342;
			 i_143_++) {
			short i_144_ = class109.aShortArray1336[i_143_];
			short i_145_ = class109.aShortArray1337[i_143_];
			short i_146_ = class109.aShortArray1338[i_143_];
			float f = fs[i_144_];
			float f_147_ = fs[i_145_];
			float f_148_ = fs[i_146_];
			float f_149_ = fs_79_[i_144_];
			float f_150_ = fs_79_[i_145_];
			float f_151_ = fs_79_[i_146_];
			if (((f - f_147_) * (f_151_ - f_150_)
			     - (f_149_ - f_150_) * (f_148_ - f_147_))
			    > 0.0F) {
			    class119.aBool1422
				= (f < 0.0F || f_147_ < 0.0F || f_148_ < 0.0F
				   || f > (float) class119.anInt1448
				   || f_147_ > (float) class119.anInt1448
				   || f_148_ > (float) class119.anInt1448);
			    boolean bool = false;
			    if (class109.aShortArray1329[i_143_] != -1) {
				Class186 class186
				    = (aClass185_Sub2_9735.aClass177_2012
					   .method2931
				       ((class109.aShortArray1329[i_143_]
					 & 0xffff),
					(byte) 1));
				bool = class186.aBool2043;
			    }
			    if (bool)
				class119.method2166
				    (true, true, false, f_149_, f_150_, f_151_,
				     f, f_147_, f_148_, fs_80_[i_144_],
				     fs_80_[i_145_], fs_80_[i_146_],
				     fs_81_[i_144_], fs_81_[i_145_],
				     fs_81_[i_146_],
				     ((float) class109.aShortArray1332[i_144_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1332[i_145_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1332[i_146_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1334[i_144_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1334[i_145_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1334[i_146_]
				      / (float) (anInt1702 * 127780559)),
				     (~0xffffff
				      | (Class415.anIntArray4666
					 [(class109.aShortArray1339[i_144_]
					   & 0xffff)]) & 0xffffff),
				     (~0xffffff
				      | (Class415.anIntArray4666
					 [(class109.aShortArray1339[i_145_]
					   & 0xffff)]) & 0xffffff),
				     (~0xffffff
				      | (Class415.anIntArray4666
					 [(class109.aShortArray1339[i_146_]
					   & 0xffff)]) & 0xffffff),
				     0, 0.0F, 0.0F, 0.0F,
				     (class109.aShortArray1329[i_143_]
				      & 0xffff));
			    else {
				int i_152_ = class109.anIntArray1341[i_143_];
				if (i_152_ != -1)
				    class119.method2139
					(true, true, false, f_149_, f_150_,
					 f_151_, f, f_147_, f_148_,
					 fs_80_[i_144_], fs_80_[i_145_],
					 fs_80_[i_146_],
					 (float) (Class146.method2452
						  (i_152_,
						   (class109.aShortArray1339
						    [i_144_]),
						   -1589484557)),
					 (float) (Class146.method2452
						  (i_152_,
						   (class109.aShortArray1339
						    [i_145_]),
						   -1779474954)),
					 (float) (Class146.method2452
						  (i_152_,
						   (class109.aShortArray1339
						    [i_146_]),
						   -158008344)));
			    }
			}
		    }
		} else {
		    for (int i_153_ = 0; i_153_ < class109.aShort1342;
			 i_153_++) {
			short i_154_ = class109.aShortArray1336[i_153_];
			short i_155_ = class109.aShortArray1337[i_153_];
			short i_156_ = class109.aShortArray1338[i_153_];
			float f = fs[i_154_];
			float f_157_ = fs[i_155_];
			float f_158_ = fs[i_156_];
			float f_159_ = fs_79_[i_154_];
			float f_160_ = fs_79_[i_155_];
			float f_161_ = fs_79_[i_156_];
			if (((f - f_157_) * (f_161_ - f_160_)
			     - (f_159_ - f_160_) * (f_158_ - f_157_))
			    > 0.0F) {
			    int i_162_ = class109.anIntArray1341[i_153_];
			    if (i_162_ != -1) {
				class119.aBool1422
				    = (f < 0.0F || f_157_ < 0.0F
				       || f_158_ < 0.0F
				       || f > (float) class119.anInt1448
				       || f_157_ > (float) class119.anInt1448
				       || f_158_ > (float) class119.anInt1448);
				class119.method2139
				    (true, true, false, f_159_, f_160_, f_161_,
				     f, f_157_, f_158_, fs_80_[i_154_],
				     fs_80_[i_155_], fs_80_[i_156_],
				     (float) (Class146.method2452
					      (i_162_,
					       (class109.aShortArray1339
						[i_154_]),
					       -158284833)),
				     (float) (Class146.method2452
					      (i_162_,
					       (class109.aShortArray1339
						[i_155_]),
					       -713255167)),
				     (float) (Class146.method2452
					      (i_162_,
					       (class109.aShortArray1339
						[i_156_]),
					       -1373121862)));
			    }
			}
		    }
		}
	    }
	}
    }
    
    public Class534_Sub18_Sub16 method2526
	(int i, int i_163_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	return null;
    }
    
    void method15438(int i, int i_164_, boolean bool, Class101 class101,
		     Class119 class119, float[] fs, float[] fs_165_,
		     float[] fs_166_, float[] fs_167_, float[] fs_168_,
		     int i_169_) {
	Class120 class120 = aClass120ArrayArray9741[i][i_164_];
	if (i_169_ == 0 || (i_169_ & 0x2) == 0) {
	    if (class120 != null) {
		for (int i_170_ = 0; i_170_ < class120.aShort1462; i_170_++) {
		    int i_171_ = (class120.aShortArray1463[i_170_]
				  + (i << anInt1703 * -1495101509));
		    int i_172_ = class120.aShortArray1470[i_170_];
		    int i_173_ = (class120.aShortArray1465[i_170_]
				  + (i_164_ << anInt1703 * -1495101509));
		    float f = aFloat9758 + (aFloat9744 * (float) i_171_
					    + aFloat9756 * (float) i_172_
					    + aFloat9752 * (float) i_173_);
		    float f_174_
			= aFloat9748 + (aFloat9745 * (float) i_171_
					+ aFloat9757 * (float) i_172_
					+ aFloat9753 * (float) i_173_);
		    if (f < -f_174_)
			return;
		    fs_168_[i_170_] = 0.0F;
		    if (bool) {
			float f_175_ = f - class101.aFloat1204;
			if (f_175_ > 0.0F) {
			    f_175_ /= class101.aFloat1205;
			    if (f_175_ > 1.0F)
				f_175_ = 1.0F;
			    fs_168_[i_170_] = f_175_;
			    int i_176_
				= (int) ((float) (class120.aShortArray1461
						  [i_170_])
					 * f_175_);
			    if (i_176_ > 0)
				i_172_ -= i_176_;
			}
		    } else if (class101.aBool1203) {
			float f_177_ = f - class101.aFloat1204;
			if (f_177_ > 0.0F) {
			    fs_168_[i_170_] = f_177_ / class101.aFloat1205;
			    if (fs_168_[i_170_] > 1.0F)
				fs_168_[i_170_] = 1.0F;
			}
		    }
		    float f_178_
			= aFloat9754 + (aFloat9742 * (float) i_171_
					+ aFloat9746 * (float) i_172_
					+ aFloat9750 * (float) i_173_);
		    float f_179_
			= aFloat9755 + (aFloat9760 * (float) i_171_
					+ aFloat9747 * (float) i_172_
					+ aFloat9749 * (float) i_173_);
		    fs[i_170_] = (class119.aFloat1429
				  + class119.aFloat1430 * f_178_ / f_174_);
		    fs_165_[i_170_]
			= (class119.aFloat1431
			   + class119.aFloat1432 * f_179_ / f_174_);
		    fs_166_[i_170_] = (class119.aFloat1433
				       + class119.aFloat1434 * f / f_174_);
		    fs_167_[i_170_] = f_174_;
		}
		float f = (float) (anInt1702 * 127780559);
		for (int i_180_ = 0; i_180_ < class120.aShort1464; i_180_++) {
		    int i_181_ = i_180_ * 3;
		    int i_182_ = i_181_ + 1;
		    int i_183_ = i_182_ + 1;
		    float f_184_ = fs[i_181_];
		    float f_185_ = fs[i_182_];
		    float f_186_ = fs[i_183_];
		    float f_187_ = fs_165_[i_181_];
		    float f_188_ = fs_165_[i_182_];
		    float f_189_ = fs_165_[i_183_];
		    if (((f_184_ - f_185_) * (f_189_ - f_188_)
			 - (f_187_ - f_188_) * (f_186_ - f_185_))
			> 0.0F) {
			class119.aBool1422
			    = (f_184_ < 0.0F || f_185_ < 0.0F || f_186_ < 0.0F
			       || f_184_ > (float) class119.anInt1448
			       || f_185_ > (float) class119.anInt1448
			       || f_186_ > (float) class119.anInt1448);
			if (fs_168_[i_181_] + fs_168_[i_182_] + fs_168_[i_183_]
			    < 3.0F) {
			    int i_190_ = i << anInt1703 * -1495101509;
			    int i_191_ = i_164_ << anInt1703 * -1495101509;
			    if ((class120.anIntArray1466[i_181_] & 0xffffff)
				!= 0) {
				if (class120.aShortArray1467[i_181_] != -1
				    && class120.aShortArray1467[i_182_] != -1
				    && (class120.aShortArray1467[i_183_]
					!= -1)) {
				    if ((class120.aShortArray1467[i_181_]
					 == class120.aShortArray1467[i_182_])
					&& (class120.aShortArray1467[i_181_]
					    == (class120.aShortArray1467
						[i_183_]))
					&& (class120.aShortArray1468[i_181_]
					    == (class120.aShortArray1468
						[i_182_]))
					&& (class120.aShortArray1468[i_181_]
					    == (class120.aShortArray1468
						[i_183_])))
					class119.method2166
					    (true, true, false, f_187_, f_188_,
					     f_189_, f_184_, f_185_, f_186_,
					     fs_166_[i_181_], fs_166_[i_182_],
					     fs_166_[i_183_], fs_167_[i_181_],
					     fs_167_[i_182_], fs_167_[i_183_],
					     ((float) (i_190_
						       + (class120
							  .aShortArray1463
							  [i_181_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_181_])),
					     ((float) (i_190_
						       + (class120
							  .aShortArray1463
							  [i_182_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_182_])),
					     ((float) (i_190_
						       + (class120
							  .aShortArray1463
							  [i_183_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_183_])),
					     ((float) (i_191_
						       + (class120
							  .aShortArray1465
							  [i_181_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_181_])),
					     ((float) (i_191_
						       + (class120
							  .aShortArray1465
							  [i_182_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_182_])),
					     ((float) (i_191_
						       + (class120
							  .aShortArray1465
							  [i_183_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_183_])),
					     class120.anIntArray1466[i_181_],
					     class120.anIntArray1466[i_182_],
					     class120.anIntArray1466[i_183_],
					     class101.anInt1206 * 1046269871,
					     fs_168_[i_181_] * 255.0F,
					     fs_168_[i_182_] * 255.0F,
					     fs_168_[i_183_] * 255.0F,
					     (class120.aShortArray1467[i_181_]
					      & 0xffff));
				    else
					class119.method2147
					    (true, true, false, f_187_, f_188_,
					     f_189_, f_184_, f_185_, f_186_,
					     fs_166_[i_181_], fs_166_[i_182_],
					     fs_166_[i_183_], fs_167_[i_181_],
					     fs_167_[i_182_], fs_167_[i_183_],
					     (float) (i_190_
						      + (class120
							 .aShortArray1463
							 [i_181_])) / f,
					     (float) (i_190_
						      + (class120
							 .aShortArray1463
							 [i_182_])) / f,
					     (float) (i_190_
						      + (class120
							 .aShortArray1463
							 [i_183_])) / f,
					     (float) (i_191_
						      + (class120
							 .aShortArray1465
							 [i_181_])) / f,
					     (float) (i_191_
						      + (class120
							 .aShortArray1465
							 [i_182_])) / f,
					     (float) (i_191_
						      + (class120
							 .aShortArray1465
							 [i_183_])) / f,
					     class120.anIntArray1466[i_181_],
					     class120.anIntArray1466[i_182_],
					     class120.anIntArray1466[i_183_],
					     class101.anInt1206 * 1046269871,
					     fs_168_[i_181_] * 255.0F,
					     fs_168_[i_182_] * 255.0F,
					     fs_168_[i_183_] * 255.0F,
					     (class120.aShortArray1467[i_181_]
					      & 0xffff),
					     f / (float) (class120
							  .aShortArray1468
							  [i_181_]),
					     (class120.aShortArray1467[i_182_]
					      & 0xffff),
					     f / (float) (class120
							  .aShortArray1468
							  [i_182_]),
					     (class120.aShortArray1467[i_183_]
					      & 0xffff),
					     f / (float) (class120
							  .aShortArray1468
							  [i_183_]));
				} else if ((fs_168_[i_181_] + fs_168_[i_182_]
					    + fs_168_[i_183_])
					   > 0.0F)
				    class119.method2141
					(true, true, false, f_187_, f_188_,
					 f_189_, f_184_, f_185_, f_186_,
					 fs_166_[i_181_], fs_166_[i_182_],
					 fs_166_[i_183_],
					 (Class69.method1396
					  (class120.anIntArray1466[i_181_],
					   class101.anInt1206 * 1046269871,
					   fs_168_[i_181_] * 255.0F,
					   (byte) -48)),
					 (Class69.method1396
					  (class120.anIntArray1466[i_182_],
					   class101.anInt1206 * 1046269871,
					   fs_168_[i_182_] * 255.0F,
					   (byte) -14)),
					 (Class69.method1396
					  (class120.anIntArray1466[i_183_],
					   class101.anInt1206 * 1046269871,
					   fs_168_[i_183_] * 255.0F,
					   (byte) 42)));
				else
				    class119.method2141
					(true, true, false, f_187_, f_188_,
					 f_189_, f_184_, f_185_, f_186_,
					 fs_166_[i_181_], fs_166_[i_182_],
					 fs_166_[i_183_],
					 class120.anIntArray1466[i_181_],
					 class120.anIntArray1466[i_182_],
					 class120.anIntArray1466[i_183_]);
			    }
			} else
			    class119.method2137(true, true, false, f_187_,
						f_188_, f_189_, f_184_, f_185_,
						f_186_, fs_166_[i_181_],
						fs_166_[i_182_],
						fs_166_[i_183_],
						(class101.anInt1206
						 * 1046269871));
		    }
		}
	    }
	}
    }
    
    boolean method15439(int i) {
	if ((anInt9736 & 0x8) == 0)
	    return false;
	if (i == 4)
	    return true;
	if (i == 8)
	    return true;
	if (i == 9)
	    return true;
	return false;
    }
    
    public void method2527(int i, int i_192_, int i_193_, int i_194_,
			   int i_195_, int i_196_, int i_197_,
			   boolean[][] bools) {
	Class101 class101
	    = aClass185_Sub2_9735.method15011(Thread.currentThread());
	Class119 class119 = class101.aClass119_1233;
	class119.anInt1447 = 0;
	class119.aBool1422 = true;
	aClass185_Sub2_9735.method15003();
	if (aClass121ArrayArray9739 != null || aClass120ArrayArray9741 != null)
	    method15440(i, i_192_, i_193_, i_194_, i_195_, i_196_, i_197_,
			bools, class101, class119, class101.aFloatArray1226,
			class101.aFloatArray1241);
	else if (aClass139ArrayArray9737 != null)
	    method15453(i, i_192_, i_193_, i_194_, i_195_, i_196_, i_197_,
			bools, class101, class119, class101.aFloatArray1226,
			class101.aFloatArray1241);
    }
    
    public void method2531(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_198_, int i_199_, int i_200_, boolean bool) {
	/* empty */
    }
    
    void method15440(int i, int i_201_, int i_202_, int i_203_, int i_204_,
		     int i_205_, int i_206_, boolean[][] bools,
		     Class101 class101, Class119 class119, float[] fs,
		     float[] fs_207_) {
	int i_208_ = (i_206_ - i_204_) * i_202_ / 256;
	int i_209_ = i_202_ >> 8;
	boolean bool = class101.aBool1211;
	aClass185_Sub2_9735.method3461(false);
	class119.aBool1423 = false;
	class119.aBool1424 = false;
	int i_210_ = i;
	int i_211_ = i_201_ + i_208_;
	for (int i_212_ = i_203_; i_212_ < i_205_; i_212_++) {
	    for (int i_213_ = i_204_; i_213_ < i_206_; i_213_++) {
		if (bools[i_212_ - i_203_][i_213_ - i_204_]) {
		    if (aClass121ArrayArray9739 != null) {
			if (aClass121ArrayArray9739[i_212_][i_213_] != null) {
			    Class121 class121
				= aClass121ArrayArray9739[i_212_][i_213_];
			    if (class121.aShort1482 != -1
				&& (class121.aByte1475 & 0x2) == 0
				&& class121.anInt1481 == 0) {
				int i_214_ = (aClass185_Sub2_9735.method14997
					      (class121.aShort1482 & 0xffff));
				class119.method2139
				    (true, true, false,
				     (float) (i_211_ - i_209_),
				     (float) (i_211_ - i_209_), (float) i_211_,
				     (float) (i_210_ + i_209_), (float) i_210_,
				     (float) (i_210_ + i_209_), 100.0F, 100.0F,
				     100.0F,
				     (float) Class146.method2452(i_214_,
								 (class121
								  .anInt1480),
								 -1595206168),
				     (float) Class146.method2452(i_214_,
								 (class121
								  .anInt1476),
								 -1300774158),
				     (float) Class146.method2452(i_214_,
								 (class121
								  .anInt1474),
								 -405949985));
				class119.method2139
				    (true, true, false, (float) i_211_,
				     (float) i_211_, (float) (i_211_ - i_209_),
				     (float) i_210_, (float) (i_210_ + i_209_),
				     (float) i_210_, 100.0F, 100.0F, 100.0F,
				     (float) Class146.method2452(i_214_,
								 (class121
								  .anInt1478),
								 -403264488),
				     (float) Class146.method2452(i_214_,
								 (class121
								  .anInt1474),
								 164243225),
				     (float) Class146.method2452(i_214_,
								 (class121
								  .anInt1476),
								 -687166592));
			    } else if (class121.anInt1481 == 0) {
				class119.method2141(true, true, false,
						    (float) (i_211_ - i_209_),
						    (float) (i_211_ - i_209_),
						    (float) i_211_,
						    (float) (i_210_ + i_209_),
						    (float) i_210_,
						    (float) (i_210_ + i_209_),
						    100.0F, 100.0F, 100.0F,
						    class121.anInt1480,
						    class121.anInt1476,
						    class121.anInt1474);
				class119.method2141(true, true, false,
						    (float) i_211_,
						    (float) i_211_,
						    (float) (i_211_ - i_209_),
						    (float) i_210_,
						    (float) (i_210_ + i_209_),
						    (float) i_210_, 100.0F,
						    100.0F, 100.0F,
						    class121.anInt1478,
						    class121.anInt1474,
						    class121.anInt1476);
			    } else {
				int i_215_ = class121.anInt1481;
				class119.method2141
				    (true, true, false,
				     (float) (i_211_ - i_209_),
				     (float) (i_211_ - i_209_), (float) i_211_,
				     (float) (i_210_ + i_209_), (float) i_210_,
				     (float) (i_210_ + i_209_), 100.0F, 100.0F,
				     100.0F,
				     Class308.method5654(i_215_,
							 (class121.anInt1480
							  & ~0xffffff),
							 (byte) 73),
				     Class308.method5654(i_215_,
							 (class121.anInt1476
							  & ~0xffffff),
							 (byte) 117),
				     Class308.method5654(i_215_,
							 (class121.anInt1474
							  & ~0xffffff),
							 (byte) 49));
				class119.method2141
				    (true, true, false, (float) i_211_,
				     (float) i_211_, (float) (i_211_ - i_209_),
				     (float) i_210_, (float) (i_210_ + i_209_),
				     (float) i_210_, 100.0F, 100.0F, 100.0F,
				     Class308.method5654(i_215_,
							 (class121.anInt1478
							  & ~0xffffff),
							 (byte) 71),
				     Class308.method5654(i_215_,
							 (class121.anInt1474
							  & ~0xffffff),
							 (byte) 43),
				     Class308.method5654(i_215_,
							 (class121.anInt1476
							  & ~0xffffff),
							 (byte) 20));
			    }
			} else if (aClass128ArrayArray9740[i_212_][i_213_]
				   != null) {
			    Class128 class128
				= aClass128ArrayArray9740[i_212_][i_213_];
			    for (int i_216_ = 0; i_216_ < class128.aShort1505;
				 i_216_++) {
				fs[i_216_]
				    = (float) (i_210_
					       + ((class128.aShortArray1506
						   [i_216_])
						  * i_209_
						  / (anInt1702 * 127780559)));
				fs_207_[i_216_]
				    = (float) (i_211_
					       - ((class128.aShortArray1510
						   [i_216_])
						  * i_209_
						  / (anInt1702 * 127780559)));
			    }
			    for (int i_217_ = 0; i_217_ < class128.aShort1511;
				 i_217_++) {
				int i_218_ = i_217_ * 3;
				int i_219_ = i_218_ + 1;
				int i_220_ = i_219_ + 1;
				float f = fs[i_218_];
				float f_221_ = fs[i_219_];
				float f_222_ = fs[i_220_];
				float f_223_ = fs_207_[i_218_];
				float f_224_ = fs_207_[i_219_];
				float f_225_ = fs_207_[i_220_];
				if (class128.anIntArray1515 != null
				    && class128.anIntArray1515[i_217_] != 0
				    && (class128.aShortArray1513 == null
					|| (class128.aShortArray1513 != null
					    && (class128.aShortArray1513
						[i_217_]) == -1))) {
				    int i_226_
					= class128.anIntArray1515[i_217_];
				    class119.method2141
					(true, true, false, f_223_, f_224_,
					 f_225_, f, f_221_, f_222_, 100.0F,
					 100.0F, 100.0F,
					 (Class308.method5654
					  (i_226_,
					   (-16777216
					    - (class128.anIntArray1507[i_218_]
					       & ~0xffffff)),
					   (byte) 1)),
					 (Class308.method5654
					  (i_226_,
					   (-16777216
					    - (class128.anIntArray1507[i_219_]
					       & ~0xffffff)),
					   (byte) 73)),
					 (Class308.method5654
					  (i_226_,
					   (-16777216
					    - (class128.anIntArray1507[i_220_]
					       & ~0xffffff)),
					   (byte) 89)));
				} else if (class128.aShortArray1513 != null
					   && (class128.aShortArray1513[i_217_]
					       != -1)) {
				    int i_227_
					= (aClass185_Sub2_9735.method14997
					   (class128.aShortArray1513[i_217_]
					    & 0xffff));
				    class119.method2139(true, true, false,
							f_223_, f_224_, f_225_,
							f, f_221_, f_222_,
							100.0F, 100.0F, 100.0F,
							(float) i_227_,
							(float) i_227_,
							(float) i_227_);
				} else
				    class119.method2141
					(true, true, false, f_223_, f_224_,
					 f_225_, f, f_221_, f_222_, 100.0F,
					 100.0F, 100.0F,
					 class128.anIntArray1507[i_218_],
					 class128.anIntArray1507[i_219_],
					 class128.anIntArray1507[i_220_]);
			    }
			}
		    } else if (aClass120ArrayArray9741[i_212_][i_213_]
			       != null) {
			Class120 class120
			    = aClass120ArrayArray9741[i_212_][i_213_];
			for (int i_228_ = 0; i_228_ < class120.aShort1462;
			     i_228_++) {
			    fs[i_228_]
				= (float) (i_210_
					   + (class120.aShortArray1463[i_228_]
					      * i_209_
					      / (anInt1702 * 127780559)));
			    fs_207_[i_228_]
				= (float) (i_211_
					   - (class120.aShortArray1465[i_228_]
					      * i_209_
					      / (anInt1702 * 127780559)));
			}
			for (int i_229_ = 0; i_229_ < class120.aShort1464;
			     i_229_++) {
			    int i_230_ = i_229_ * 3;
			    int i_231_ = i_230_ + 1;
			    int i_232_ = i_231_ + 1;
			    float f = fs[i_230_];
			    float f_233_ = fs[i_231_];
			    float f_234_ = fs[i_232_];
			    float f_235_ = fs_207_[i_230_];
			    float f_236_ = fs_207_[i_231_];
			    float f_237_ = fs_207_[i_232_];
			    if (class120.anIntArray1471 != null
				&& class120.anIntArray1471[i_229_] != 0) {
				int i_238_ = class120.anIntArray1471[i_229_];
				class119.method2141(true, true, false, f_235_,
						    f_236_, f_237_, f, f_233_,
						    f_234_, 100.0F, 100.0F,
						    100.0F, i_238_, i_238_,
						    i_238_);
			    } else
				class119.method2141
				    (true, true, false, f_235_, f_236_, f_237_,
				     f, f_233_, f_234_, 100.0F, 100.0F, 100.0F,
				     class120.anIntArray1466[i_230_],
				     class120.anIntArray1466[i_231_],
				     class120.anIntArray1466[i_232_]);
			}
		    }
		}
		i_211_ -= i_209_;
	    }
	    i_211_ = i_201_ + i_208_;
	    i_210_ += i_209_;
	}
	class119.aBool1423 = true;
	aClass185_Sub2_9735.method3461(bool);
    }
    
    void method15441(int i, int i_239_, int i_240_) {
	Class101 class101
	    = aClass185_Sub2_9735.method15011(Thread.currentThread());
	class101.aClass119_1233.anInt1447 = 0;
	if (aClass121ArrayArray9739 != null)
	    method15455(i, i_239_, class101.aBool1245, class101,
			class101.aClass119_1233, class101.aFloatArray1226,
			class101.aFloatArray1241, class101.aFloatArray1242,
			class101.aFloatArray1243, class101.aFloatArray1244,
			i_240_);
	else if (aClass139ArrayArray9737 != null)
	    method15446(i, i_239_, class101.aClass119_1233,
			class101.aFloatArray1226, class101.aFloatArray1241,
			class101.aFloatArray1242, class101.aFloatArray1243,
			class101.aFloatArray1244, i_240_);
	else if (aClass120ArrayArray9741 != null)
	    method15438(i, i_239_, class101.aBool1245, class101,
			class101.aClass119_1233, class101.aFloatArray1226,
			class101.aFloatArray1241, class101.aFloatArray1242,
			class101.aFloatArray1243, class101.aFloatArray1244,
			i_240_);
    }
    
    public void method2502(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_241_, int i_242_, int i_243_, boolean bool) {
	/* empty */
    }
    
    public boolean method2504(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			      int i_244_, int i_245_, int i_246_,
			      boolean bool) {
	return false;
    }
    
    public void method2503(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_247_, int i_248_, int i_249_, boolean bool) {
	/* empty */
    }
    
    public void method2530(Class534_Sub21 class534_sub21, int[] is) {
	/* empty */
    }
    
    public Class534_Sub18_Sub16 method2520
	(int i, int i_250_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	return null;
    }
    
    public void method2507(int i, int i_251_, int i_252_) {
	i = Math.min(aByteArrayArray9759.length - 1, Math.max(0, i));
	i_251_
	    = Math.min(aByteArrayArray9759[i].length - 1, Math.max(0, i_251_));
	if (aByteArrayArray9759[i][i_251_] < i_252_)
	    aByteArrayArray9759[i][i_251_] = (byte) i_252_;
    }
    
    public void method2508(int i, int i_253_, int i_254_) {
	i = Math.min(aByteArrayArray9759.length - 1, Math.max(0, i));
	i_253_
	    = Math.min(aByteArrayArray9759[i].length - 1, Math.max(0, i_253_));
	if (aByteArrayArray9759[i][i_253_] < i_254_)
	    aByteArrayArray9759[i][i_253_] = (byte) i_254_;
    }
    
    public void method2509(int i, int i_255_, int i_256_) {
	i = Math.min(aByteArrayArray9759.length - 1, Math.max(0, i));
	i_255_
	    = Math.min(aByteArrayArray9759[i].length - 1, Math.max(0, i_255_));
	if (aByteArrayArray9759[i][i_255_] < i_256_)
	    aByteArrayArray9759[i][i_255_] = (byte) i_256_;
    }
    
    public void method2510(int i, int i_257_, int[] is, int[] is_258_,
			   int[] is_259_, int[] is_260_, int[] is_261_,
			   int[] is_262_, int[] is_263_, int[] is_264_,
			   int[] is_265_, int[] is_266_, int[] is_267_,
			   Class166 class166, boolean bool) {
	if (aClass139ArrayArray9737 == null) {
	    aClass139ArrayArray9737 = (new Class139[anInt1701 * -1924295585]
				       [anInt1700 * -1466328823]);
	    aClass109ArrayArray9738 = (new Class109[anInt1701 * -1924295585]
				       [anInt1700 * -1466328823]);
	} else if (aClass121ArrayArray9739 != null
		   || aClass120ArrayArray9741 != null)
	    throw new IllegalStateException();
	boolean bool_268_ = false;
	if (is_264_.length == 2 && is_261_.length == 2
	    && (is_264_[0] == is_264_[1]
		|| is_266_[0] != -1 && is_266_[0] == is_266_[1])) {
	    bool_268_ = true;
	    for (int i_269_ = 1; i_269_ < 2; i_269_++) {
		int i_270_ = is[is_261_[i_269_]];
		int i_271_ = is_259_[is_261_[i_269_]];
		if (i_270_ != 0 && i_270_ != anInt1702 * 127780559
		    || i_271_ != 0 && i_271_ != anInt1702 * 127780559) {
		    bool_268_ = false;
		    break;
		}
	    }
	}
	if (!bool_268_) {
	    Class109 class109 = new Class109();
	    short i_272_ = (short) is.length;
	    int i_273_ = (short) is_264_.length;
	    class109.aShort1330 = i_272_;
	    class109.aShortArray1339 = new short[i_272_];
	    class109.aShortArray1332 = new short[i_272_];
	    class109.aShortArray1333 = new short[i_272_];
	    class109.aShortArray1334 = new short[i_272_];
	    for (int i_274_ = 0; i_274_ < i_272_; i_274_++) {
		int i_275_ = is[i_274_];
		int i_276_ = is_259_[i_274_];
		if (i_275_ == 0 && i_276_ == 0)
		    class109.aShortArray1339[i_274_]
			= (short) (aByteArrayArray9743[i][i_257_]
				   - aByteArrayArray9759[i][i_257_]);
		else if (i_275_ == 0 && i_276_ == anInt1702 * 127780559)
		    class109.aShortArray1339[i_274_]
			= (short) (aByteArrayArray9743[i][i_257_ + 1]
				   - aByteArrayArray9759[i][i_257_ + 1]);
		else if (i_275_ == anInt1702 * 127780559
			 && i_276_ == anInt1702 * 127780559)
		    class109.aShortArray1339[i_274_]
			= (short) (aByteArrayArray9743[i + 1][i_257_ + 1]
				   - aByteArrayArray9759[i + 1][i_257_ + 1]);
		else if (i_275_ == anInt1702 * 127780559 && i_276_ == 0)
		    class109.aShortArray1339[i_274_]
			= (short) (aByteArrayArray9743[i + 1][i_257_]
				   - aByteArrayArray9759[i + 1][i_257_]);
		else {
		    int i_277_
			= (((aByteArrayArray9743[i][i_257_]
			     - aByteArrayArray9759[i][i_257_])
			    * (anInt1702 * 127780559 - i_275_))
			   + (aByteArrayArray9743[i + 1][i_257_]
			      - aByteArrayArray9759[i + 1][i_257_]) * i_275_);
		    int i_278_ = (((aByteArrayArray9743[i][i_257_ + 1]
				    - aByteArrayArray9759[i][i_257_ + 1])
				   * (anInt1702 * 127780559 - i_275_))
				  + ((aByteArrayArray9743[i + 1][i_257_ + 1]
				      - aByteArrayArray9759[i + 1][i_257_ + 1])
				     * i_275_));
		    class109.aShortArray1339[i_274_]
			= (short) ((i_277_ * (anInt1702 * 127780559 - i_276_)
				    + i_278_ * i_276_)
				   >> anInt1703 * 1304764278);
		}
		int i_279_ = (i << anInt1703 * -1495101509) + i_275_;
		int i_280_ = (i_257_ << anInt1703 * -1495101509) + i_276_;
		class109.aShortArray1332[i_274_] = (short) i_275_;
		class109.aShortArray1334[i_274_] = (short) i_276_;
		class109.aShortArray1333[i_274_]
		    = (short) (method2498(i_279_, i_280_, 875671533)
			       + (is_258_ != null ? is_258_[i_274_] : 0));
		if (class109.aShortArray1339[i_274_] < 2)
		    class109.aShortArray1339[i_274_] = (short) 2;
	    }
	    boolean bool_281_ = false;
	    int i_282_ = 0;
	    for (int i_283_ = 0; i_283_ < i_273_; i_283_++) {
		if (is_264_[i_283_] >= 0
		    || is_265_ != null && is_265_[i_283_] >= 0)
		    i_282_++;
		int i_284_ = is_266_[i_283_];
		if (i_284_ != -1) {
		    Class186 class186 = aClass185_Sub2_9735.aClass177_2012
					    .method2931(i_284_, (byte) 1);
		    if (!class186.aBool2072) {
			bool_281_ = true;
			if (method15439(class186.aByte2067)
			    || class186.aByte2047 != 0
			    || class186.aByte2048 != 0)
			    class109.aByte1331 |= 0x4;
		    }
		}
	    }
	    class109.anIntArray1341 = new int[i_282_];
	    if (is_265_ != null)
		class109.anIntArray1335 = new int[i_282_];
	    class109.aShortArray1336 = new short[i_282_];
	    class109.aShortArray1337 = new short[i_282_];
	    class109.aShortArray1338 = new short[i_282_];
	    if (bool_281_) {
		class109.aShortArray1329 = new short[i_282_];
		class109.aShortArray1340 = new short[i_282_];
	    }
	    for (int i_285_ = 0; i_285_ < i_273_; i_285_++) {
		if (is_264_[i_285_] >= 0
		    || is_265_ != null && is_265_[i_285_] >= 0) {
		    if (is_264_[i_285_] >= 0)
			class109.anIntArray1341[class109.aShort1342]
			    = Class315.method5705(is_264_[i_285_], 712701655);
		    else
			class109.anIntArray1341[class109.aShort1342] = -1;
		    if (is_265_ != null) {
			if (is_265_[i_285_] != -1)
			    class109.anIntArray1335[class109.aShort1342]
				= Class315.method5705(is_265_[i_285_],
						      447033543);
			else
			    class109.anIntArray1335[class109.aShort1342] = -1;
		    }
		    class109.aShortArray1336[class109.aShort1342]
			= (short) is_261_[i_285_];
		    class109.aShortArray1337[class109.aShort1342]
			= (short) is_262_[i_285_];
		    class109.aShortArray1338[class109.aShort1342]
			= (short) is_263_[i_285_];
		    if (bool_281_) {
			if (is_266_[i_285_] != -1
			    && !(aClass185_Sub2_9735.aClass177_2012.method2931
				 (is_266_[i_285_], (byte) 1).aBool2072)) {
			    class109.aShortArray1329[class109.aShort1342]
				= (short) is_266_[i_285_];
			    class109.aShortArray1340[class109.aShort1342]
				= (short) is_267_[i_285_];
			} else
			    class109.aShortArray1329[class109.aShort1342]
				= (short) -1;
		    }
		    class109.aShort1342++;
		}
	    }
	    aClass109ArrayArray9738[i][i_257_] = class109;
	} else if (is_264_[0] >= 0 || is_265_ != null && is_265_[0] >= 0) {
	    Class139 class139 = new Class139();
	    int i_286_ = is_264_[0];
	    int i_287_ = is_266_[0];
	    if (is_265_ != null) {
		class139.anInt1608
		    = Class146.method2452(Class315.method5705(is_265_[0],
							      -310921421),
					  (aByteArrayArray9743[i][i_257_]
					   - aByteArrayArray9759[i][i_257_]),
					  -1631246233);
		if (i_286_ == -1)
		    class139.aByte1614 |= 0x2;
	    }
	    if ((anIntArrayArray1704[i][i_257_]
		 == anIntArrayArray1704[i + 1][i_257_])
		&& (anIntArrayArray1704[i][i_257_]
		    == anIntArrayArray1704[i + 1][i_257_ + 1])
		&& (anIntArrayArray1704[i][i_257_]
		    == anIntArrayArray1704[i][i_257_ + 1]))
		class139.aByte1614 |= 0x1;
	    Class186 class186 = null;
	    if (i_287_ != -1)
		class186
		    = aClass185_Sub2_9735.aClass177_2012.method2931(i_287_,
								    (byte) 1);
	    if (class186 != null && (class139.aByte1614 & 0x2) == 0
		&& !class186.aBool2072) {
		class139.aShort1609
		    = (short) (aByteArrayArray9743[i][i_257_]
			       - aByteArrayArray9759[i][i_257_]);
		class139.aShort1613
		    = (short) (aByteArrayArray9743[i + 1][i_257_]
			       - aByteArrayArray9759[i + 1][i_257_]);
		class139.aShort1611
		    = (short) (aByteArrayArray9743[i + 1][i_257_ + 1]
			       - aByteArrayArray9759[i + 1][i_257_ + 1]);
		class139.aShort1612
		    = (short) (aByteArrayArray9743[i][i_257_ + 1]
			       - aByteArrayArray9759[i][i_257_ + 1]);
		class139.aShort1610 = (short) i_287_;
		if (method15439(class186.aByte2067) || class186.aByte2047 != 0
		    || class186.aByte2048 != 0)
		    class139.aByte1614 |= 0x4;
	    } else {
		short i_288_ = Class315.method5705(i_286_, 880764892);
		class139.aShort1609
		    = (short) Class146.method2452(i_288_,
						  ((aByteArrayArray9743[i]
						    [i_257_])
						   - (aByteArrayArray9759[i]
						      [i_257_])),
						  -2085652425);
		class139.aShort1613
		    = (short) Class146.method2452(i_288_,
						  ((aByteArrayArray9743[i + 1]
						    [i_257_])
						   - (aByteArrayArray9759
						      [i + 1][i_257_])),
						  -950247096);
		class139.aShort1611
		    = (short) Class146.method2452(i_288_,
						  ((aByteArrayArray9743[i + 1]
						    [i_257_ + 1])
						   - (aByteArrayArray9759
						      [i + 1][i_257_ + 1])),
						  -605354910);
		class139.aShort1612
		    = (short) Class146.method2452(i_288_,
						  ((aByteArrayArray9743[i]
						    [i_257_ + 1])
						   - (aByteArrayArray9759[i]
						      [i_257_ + 1])),
						  315254217);
		class139.aShort1610 = (short) -1;
	    }
	    aClass139ArrayArray9737[i][i_257_] = class139;
	}
    }
    
    public void method2523(int i, int i_289_, int[] is, int[] is_290_,
			   int[] is_291_, int[] is_292_, int[] is_293_,
			   int[] is_294_, int[] is_295_, int[] is_296_,
			   Class166 class166, boolean bool) {
	boolean bool_297_ = (anInt9736 & 0x20) == 0;
	if (aClass121ArrayArray9739 == null && !bool_297_) {
	    aClass121ArrayArray9739 = (new Class121[anInt1701 * -1924295585]
				       [anInt1700 * -1466328823]);
	    aClass128ArrayArray9740 = (new Class128[anInt1701 * -1924295585]
				       [anInt1700 * -1466328823]);
	} else if (aClass120ArrayArray9741 == null && bool_297_)
	    aClass120ArrayArray9741 = (new Class120[anInt1701 * -1924295585]
				       [anInt1700 * -1466328823]);
	else if (aClass139ArrayArray9737 != null)
	    throw new IllegalStateException();
	if (is != null && is.length != 0) {
	    for (int i_298_ = 0; i_298_ < is_293_.length; i_298_++) {
		if (is_293_[i_298_] == -1)
		    is_293_[i_298_] = 0;
		else
		    is_293_[i_298_]
			= (Class415.anIntArray4666
			   [(Class315.method5705(is_293_[i_298_], 264054861)
			     & 0xffff)]) << 8 | 0xff;
	    }
	    if (is_294_ != null) {
		for (int i_299_ = 0; i_299_ < is_294_.length; i_299_++) {
		    if (is_294_[i_299_] == -1)
			is_294_[i_299_] = 0;
		    else
			is_294_[i_299_]
			    = (Class415.anIntArray4666
			       [(Class315.method5705(is_294_[i_299_], 4586275)
				 & 0xffff)]) << 8 | 0xff;
		}
	    }
	    if (bool_297_) {
		Class120 class120 = new Class120();
		class120.aShort1462 = (short) is.length;
		class120.aShort1464 = (short) (is.length / 3);
		class120.aShortArray1463 = new short[class120.aShort1462];
		class120.aShortArray1470 = new short[class120.aShort1462];
		class120.aShortArray1465 = new short[class120.aShort1462];
		class120.anIntArray1466 = new int[class120.aShort1462];
		class120.aShortArray1467 = new short[class120.aShort1462];
		class120.aShortArray1468 = new short[class120.aShort1462];
		class120.aByteArray1469 = new byte[class120.aShort1462];
		if (is_292_ != null)
		    class120.aShortArray1461 = new short[class120.aShort1462];
		for (int i_300_ = 0; i_300_ < class120.aShort1462; i_300_++) {
		    int i_301_ = is[i_300_];
		    int i_302_ = is_291_[i_300_];
		    boolean bool_303_ = false;
		    int i_304_;
		    if (i_301_ == 0 && i_302_ == 0)
			i_304_ = (aByteArrayArray9743[i][i_289_]
				  - aByteArrayArray9759[i][i_289_]);
		    else if (i_301_ == 0 && i_302_ == anInt1702 * 127780559)
			i_304_ = (aByteArrayArray9743[i][i_289_ + 1]
				  - aByteArrayArray9759[i][i_289_ + 1]);
		    else if (i_301_ == anInt1702 * 127780559
			     && i_302_ == anInt1702 * 127780559)
			i_304_ = (aByteArrayArray9743[i + 1][i_289_ + 1]
				  - aByteArrayArray9759[i + 1][i_289_ + 1]);
		    else if (i_301_ == anInt1702 * 127780559 && i_302_ == 0)
			i_304_ = (aByteArrayArray9743[i + 1][i_289_]
				  - aByteArrayArray9759[i + 1][i_289_]);
		    else {
			int i_305_ = (((aByteArrayArray9743[i][i_289_]
					- aByteArrayArray9759[i][i_289_])
				       * (anInt1702 * 127780559 - i_301_))
				      + ((aByteArrayArray9743[i + 1][i_289_]
					  - aByteArrayArray9759[i + 1][i_289_])
					 * i_301_));
			int i_306_
			    = (((aByteArrayArray9743[i][i_289_ + 1]
				 - aByteArrayArray9759[i][i_289_ + 1])
				* (anInt1702 * 127780559 - i_301_))
			       + ((aByteArrayArray9743[i + 1][i_289_ + 1]
				   - aByteArrayArray9759[i + 1][i_289_ + 1])
				  * i_301_));
			i_304_ = (i_305_ * (anInt1702 * 127780559 - i_302_)
				  + i_306_ * i_302_) >> anInt1703 * 1304764278;
		    }
		    int i_307_ = (i << anInt1703 * -1495101509) + i_301_;
		    int i_308_ = (i_289_ << anInt1703 * -1495101509) + i_302_;
		    class120.aShortArray1463[i_300_] = (short) i_301_;
		    class120.aShortArray1465[i_300_] = (short) i_302_;
		    class120.aShortArray1470[i_300_]
			= (short) (method2498(i_307_, i_308_, 520013893)
				   + (is_290_ != null ? is_290_[i_300_] : 0));
		    if (i_304_ < 0)
			i_304_ = 0;
		    if (is_293_[i_300_] == 0) {
			class120.anIntArray1466[i_300_] = 0;
			if (is_294_ != null)
			    class120.aByteArray1469[i_300_] = (byte) i_304_;
		    } else {
			int i_309_ = 0;
			if (is_292_ != null) {
			    int i_310_ = (class120.aShortArray1461[i_300_]
					  = (short) is_292_[i_300_]);
			    if (class166.anInt1762 * -1095140607 != 0) {
				i_309_ = 255 * i_310_ / (class166.anInt1762
							 * -1095140607);
				if (i_309_ < 0)
				    i_309_ = 0;
				else if (i_309_ > 255)
				    i_309_ = 255;
			    }
			}
			int i_311_ = -16777216;
			if (is_295_[i_300_] != -1) {
			    Class186 class186
				= aClass185_Sub2_9735.aClass177_2012
				      .method2931(is_295_[i_300_], (byte) 1);
			    if (class186.aBool2043
				&& method15439(class186.aByte2067))
				i_311_ = -1694498816;
			}
			class120.anIntArray1466[i_300_]
			    = i_311_ | (Class197.method3817
					(method15454(is_293_[i_300_] >> 8,
						     i_304_),
					 class166.anInt1763 * 2113275141,
					 i_309_, 1418408900));
			if (is_294_ != null)
			    class120.aByteArray1469[i_300_] = (byte) i_304_;
		    }
		    class120.aShortArray1467[i_300_] = (short) is_295_[i_300_];
		    class120.aShortArray1468[i_300_] = (short) is_296_[i_300_];
		}
		if (is_294_ != null) {
		    class120.anIntArray1471 = new int[class120.aShort1464];
		    for (int i_312_ = 0; i_312_ < class120.aShort1464;
			 i_312_++) {
			int i_313_ = i_312_ * 3;
			if (is_294_[i_313_] != 0)
			    class120.anIntArray1471[i_312_]
				= ~0xffffff | is_294_[i_313_] >> 8;
		    }
		}
		aClass120ArrayArray9741[i][i_289_] = class120;
	    } else {
		boolean bool_314_ = true;
		int i_315_ = -1;
		int i_316_ = -1;
		int i_317_ = -1;
		int i_318_ = -1;
		if (is.length == 6) {
		    for (int i_319_ = 0; i_319_ < 6; i_319_++) {
			if (is[i_319_] == 0 && is_291_[i_319_] == 0) {
			    if (i_315_ != -1
				&& is_293_[i_315_] != is_293_[i_319_]) {
				bool_314_ = false;
				break;
			    }
			    i_315_ = i_319_;
			} else if (is[i_319_] == anInt1702 * 127780559
				   && is_291_[i_319_] == 0) {
			    if (i_316_ != -1
				&& is_293_[i_316_] != is_293_[i_319_]) {
				bool_314_ = false;
				break;
			    }
			    i_316_ = i_319_;
			} else if (is[i_319_] == anInt1702 * 127780559
				   && (is_291_[i_319_]
				       == anInt1702 * 127780559)) {
			    if (i_317_ != -1
				&& is_293_[i_317_] != is_293_[i_319_]) {
				bool_314_ = false;
				break;
			    }
			    i_317_ = i_319_;
			} else if (is[i_319_] == 0
				   && (is_291_[i_319_]
				       == anInt1702 * 127780559)) {
			    if (i_318_ != -1
				&& is_293_[i_318_] != is_293_[i_319_]) {
				bool_314_ = false;
				break;
			    }
			    i_318_ = i_319_;
			}
		    }
		    if (i_315_ == -1 || i_316_ == -1 || i_317_ == -1
			|| i_318_ == -1)
			bool_314_ = false;
		    if (bool_314_) {
			if (is_290_ != null) {
			    for (int i_320_ = 0; i_320_ < 4; i_320_++) {
				if (is_290_[i_320_] != 0) {
				    bool_314_ = false;
				    break;
				}
			    }
			}
			if (bool_314_) {
			    for (int i_321_ = 1; i_321_ < 4; i_321_++) {
				if (is[i_321_] != is[0]
				    && (is[i_321_]
					!= is[0] + anInt1702 * 127780559)
				    && (is[i_321_]
					!= is[0] - anInt1702 * 127780559)) {
				    bool_314_ = false;
				    break;
				}
				if (is_291_[i_321_] != is_291_[0]
				    && (is_291_[i_321_]
					!= is_291_[0] + anInt1702 * 127780559)
				    && (is_291_[i_321_]
					!= (is_291_[0]
					    - anInt1702 * 127780559))) {
				    bool_314_ = false;
				    break;
				}
			    }
			}
		    }
		} else
		    bool_314_ = false;
		if (bool_314_) {
		    Class121 class121 = new Class121();
		    int i_322_ = is_293_[0];
		    int i_323_ = is_295_[0];
		    if (is_294_ != null) {
			class121.anInt1481 = is_294_[0] >> 8;
			if (i_322_ == 0)
			    class121.aByte1475 |= 0x2;
		    } else if (i_322_ == 0)
			return;
		    if ((anIntArrayArray1704[i][i_289_]
			 == anIntArrayArray1704[i + 1][i_289_])
			&& (anIntArrayArray1704[i][i_289_]
			    == anIntArrayArray1704[i + 1][i_289_ + 1])
			&& (anIntArrayArray1704[i][i_289_]
			    == anIntArrayArray1704[i][i_289_ + 1]))
			class121.aByte1475 |= 0x1;
		    if (i_323_ != -1 && (class121.aByte1475 & 0x2) == 0
			&& !(aClass185_Sub2_9735.aClass177_2012.method2931
			     (i_323_, (byte) 1).aBool2072)) {
			int i_324_;
			if (is_292_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_324_
				= 255 * is_292_[i_315_] / (class166.anInt1762
							   * -1095140607);
			    if (i_324_ < 0)
				i_324_ = 0;
			    else if (i_324_ > 255)
				i_324_ = 255;
			} else
			    i_324_ = 0;
			class121.anInt1478
			    = (Class197.method3817
			       (method15454(is_293_[i_315_] >> 8,
					    (aByteArrayArray9743[i][i_289_]
					     - (aByteArrayArray9759[i]
						[i_289_]))),
				class166.anInt1763 * 2113275141, i_324_,
				-1792247608));
			if (class121.anInt1481 != 0)
			    class121.anInt1478
				|= (255 - (aByteArrayArray9743[i][i_289_]
					   - aByteArrayArray9759[i][i_289_])
				    << 25);
			if (is_292_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_324_
				= 255 * is_292_[i_316_] / (class166.anInt1762
							   * -1095140607);
			    if (i_324_ < 0)
				i_324_ = 0;
			    else if (i_324_ > 255)
				i_324_ = 255;
			} else
			    i_324_ = 0;
			class121.anInt1474
			    = (Class197.method3817
			       (method15454(is_293_[i_316_] >> 8,
					    (aByteArrayArray9743[i + 1][i_289_]
					     - (aByteArrayArray9759[i + 1]
						[i_289_]))),
				class166.anInt1763 * 2113275141, i_324_,
				-1352433268));
			if (class121.anInt1481 != 0)
			    class121.anInt1474
				|= 255 - (aByteArrayArray9743[i + 1][i_289_]
					  - (aByteArrayArray9759[i + 1]
					     [i_289_])) << 25;
			if (is_292_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_324_
				= 255 * is_292_[i_317_] / (class166.anInt1762
							   * -1095140607);
			    if (i_324_ < 0)
				i_324_ = 0;
			    else if (i_324_ > 255)
				i_324_ = 255;
			} else
			    i_324_ = 0;
			class121.anInt1480
			    = (Class197.method3817
			       (method15454(is_293_[i_317_] >> 8,
					    ((aByteArrayArray9743[i + 1]
					      [i_289_ + 1])
					     - (aByteArrayArray9759[i + 1]
						[i_289_ + 1]))),
				class166.anInt1763 * 2113275141, i_324_,
				1547637303));
			if (class121.anInt1481 != 0)
			    class121.anInt1480
				|= (255
				    - (aByteArrayArray9743[i + 1][i_289_ + 1]
				       - (aByteArrayArray9759[i + 1]
					  [i_289_ + 1]))) << 25;
			if (is_292_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_324_
				= 255 * is_292_[i_318_] / (class166.anInt1762
							   * -1095140607);
			    if (i_324_ < 0)
				i_324_ = 0;
			    else if (i_324_ > 255)
				i_324_ = 255;
			} else
			    i_324_ = 0;
			class121.anInt1476
			    = (Class197.method3817
			       (method15454(is_293_[i_318_] >> 8,
					    (aByteArrayArray9743[i][i_289_ + 1]
					     - (aByteArrayArray9759[i]
						[i_289_ + 1]))),
				class166.anInt1763 * 2113275141, i_324_,
				-1831216691));
			class121.aShort1482 = (short) i_323_;
		    } else {
			int i_325_;
			if (is_292_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_325_
				= 255 * is_292_[i_315_] / (class166.anInt1762
							   * -1095140607);
			    if (i_325_ < 0)
				i_325_ = 0;
			    else if (i_325_ > 255)
				i_325_ = 255;
			} else
			    i_325_ = 0;
			class121.anInt1478
			    = (Class197.method3817
			       (method15454(is_293_[i_315_] >> 8,
					    (aByteArrayArray9743[i][i_289_]
					     - (aByteArrayArray9759[i]
						[i_289_]))),
				class166.anInt1763 * 2113275141, i_325_,
				-1745056863));
			if (class121.anInt1481 != 0)
			    class121.anInt1478
				|= (255 - (aByteArrayArray9743[i][i_289_]
					   - aByteArrayArray9759[i][i_289_])
				    << 25);
			if (is_292_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_325_
				= 255 * is_292_[i_316_] / (class166.anInt1762
							   * -1095140607);
			    if (i_325_ < 0)
				i_325_ = 0;
			    else if (i_325_ > 255)
				i_325_ = 255;
			} else
			    i_325_ = 0;
			class121.anInt1474
			    = (Class197.method3817
			       (method15454(is_293_[i_316_] >> 8,
					    (aByteArrayArray9743[i + 1][i_289_]
					     - (aByteArrayArray9759[i + 1]
						[i_289_]))),
				class166.anInt1763 * 2113275141, i_325_,
				1623765881));
			if (class121.anInt1481 != 0)
			    class121.anInt1474
				|= 255 - (aByteArrayArray9743[i + 1][i_289_]
					  - (aByteArrayArray9759[i + 1]
					     [i_289_])) << 25;
			if (is_292_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_325_
				= 255 * is_292_[i_317_] / (class166.anInt1762
							   * -1095140607);
			    if (i_325_ < 0)
				i_325_ = 0;
			    else if (i_325_ > 255)
				i_325_ = 255;
			} else
			    i_325_ = 0;
			class121.anInt1480
			    = (Class197.method3817
			       (method15454(is_293_[i_317_] >> 8,
					    ((aByteArrayArray9743[i + 1]
					      [i_289_ + 1])
					     - (aByteArrayArray9759[i + 1]
						[i_289_ + 1]))),
				class166.anInt1763 * 2113275141, i_325_,
				-289200761));
			if (class121.anInt1481 != 0)
			    class121.anInt1480
				|= (255
				    - (aByteArrayArray9743[i + 1][i_289_ + 1]
				       - (aByteArrayArray9759[i + 1]
					  [i_289_ + 1]))) << 25;
			if (is_292_ != null
			    && class166.anInt1762 * -1095140607 != 0) {
			    i_325_
				= 255 * is_292_[i_318_] / (class166.anInt1762
							   * -1095140607);
			    if (i_325_ < 0)
				i_325_ = 0;
			    else if (i_325_ > 255)
				i_325_ = 255;
			} else
			    i_325_ = 0;
			class121.anInt1476
			    = (Class197.method3817
			       (method15454(is_293_[i_318_] >> 8,
					    (aByteArrayArray9743[i][i_289_ + 1]
					     - (aByteArrayArray9759[i]
						[i_289_ + 1]))),
				class166.anInt1763 * 2113275141, i_325_,
				799776855));
			if (class121.anInt1481 != 0)
			    class121.anInt1476
				|= 255 - (aByteArrayArray9743[i][i_289_ + 1]
					  - (aByteArrayArray9759[i]
					     [i_289_ + 1])) << 25;
			class121.aShort1482 = (short) -1;
		    }
		    if (is_292_ != null) {
			class121.aShort1479 = (short) is_292_[i_317_];
			class121.aShort1472 = (short) is_292_[i_318_];
			class121.aShort1473 = (short) is_292_[i_316_];
			class121.aShort1477 = (short) is_292_[i_315_];
		    }
		    aClass121ArrayArray9739[i][i_289_] = class121;
		} else {
		    Class128 class128 = new Class128();
		    class128.aShort1505 = (short) is.length;
		    class128.aShort1511 = (short) (is.length / 3);
		    class128.aShortArray1506 = new short[class128.aShort1505];
		    class128.aShortArray1509 = new short[class128.aShort1505];
		    class128.aShortArray1510 = new short[class128.aShort1505];
		    class128.anIntArray1507 = new int[class128.aShort1505];
		    if (is_292_ != null)
			class128.aShortArray1508
			    = new short[class128.aShort1505];
		    for (int i_326_ = 0; i_326_ < class128.aShort1505;
			 i_326_++) {
			int i_327_ = is[i_326_];
			int i_328_ = is_291_[i_326_];
			boolean bool_329_ = false;
			int i_330_;
			if (i_327_ == 0 && i_328_ == 0)
			    i_330_ = (aByteArrayArray9743[i][i_289_]
				      - aByteArrayArray9759[i][i_289_]);
			else if (i_327_ == 0
				 && i_328_ == anInt1702 * 127780559)
			    i_330_ = (aByteArrayArray9743[i][i_289_ + 1]
				      - aByteArrayArray9759[i][i_289_ + 1]);
			else if (i_327_ == anInt1702 * 127780559
				 && i_328_ == anInt1702 * 127780559)
			    i_330_
				= (aByteArrayArray9743[i + 1][i_289_ + 1]
				   - aByteArrayArray9759[i + 1][i_289_ + 1]);
			else if (i_327_ == anInt1702 * 127780559
				 && i_328_ == 0)
			    i_330_ = (aByteArrayArray9743[i + 1][i_289_]
				      - aByteArrayArray9759[i + 1][i_289_]);
			else {
			    int i_331_
				= (((aByteArrayArray9743[i][i_289_]
				     - aByteArrayArray9759[i][i_289_])
				    * (anInt1702 * 127780559 - i_327_))
				   + ((aByteArrayArray9743[i + 1][i_289_]
				       - aByteArrayArray9759[i + 1][i_289_])
				      * i_327_));
			    int i_332_
				= (((aByteArrayArray9743[i][i_289_ + 1]
				     - aByteArrayArray9759[i][i_289_ + 1])
				    * (anInt1702 * 127780559 - i_327_))
				   + (aByteArrayArray9743[i + 1][i_289_ + 1]
				      - (aByteArrayArray9759[i + 1]
					 [i_289_ + 1])) * i_327_);
			    i_330_ = (i_331_ * (anInt1702 * 127780559
						- i_328_) + i_332_ * i_328_
				      >> anInt1703 * 1304764278);
			}
			int i_333_ = (i << anInt1703 * -1495101509) + i_327_;
			int i_334_
			    = (i_289_ << anInt1703 * -1495101509) + i_328_;
			class128.aShortArray1506[i_326_] = (short) i_327_;
			class128.aShortArray1510[i_326_] = (short) i_328_;
			class128.aShortArray1509[i_326_]
			    = (short) (method2498(i_333_, i_334_, -1462524322)
				       + (is_290_ != null ? is_290_[i_326_]
					  : 0));
			if (i_330_ < 0)
			    i_330_ = 0;
			if (is_293_[i_326_] == 0) {
			    if (is_294_ != null)
				class128.anIntArray1507[i_326_] = i_330_ << 25;
			    else
				class128.anIntArray1507[i_326_] = 0;
			} else {
			    int i_335_ = 0;
			    if (is_292_ != null) {
				int i_336_ = (class128.aShortArray1508[i_326_]
					      = (short) is_292_[i_326_]);
				if (class166.anInt1762 * -1095140607 != 0) {
				    i_335_ = 255 * i_336_ / (class166.anInt1762
							     * -1095140607);
				    if (i_335_ < 0)
					i_335_ = 0;
				    else if (i_335_ > 255)
					i_335_ = 255;
				}
			    }
			    class128.anIntArray1507[i_326_]
				= (Class197.method3817
				   (method15454(is_293_[i_326_] >> 8, i_330_),
				    class166.anInt1763 * 2113275141, i_335_,
				    1005679563));
			    if (is_294_ != null)
				class128.anIntArray1507[i_326_]
				    |= i_330_ << 25;
			}
		    }
		    boolean bool_337_ = false;
		    for (int i_338_ = 0; i_338_ < class128.aShort1511;
			 i_338_++) {
			if (is_295_[i_338_ * 3] != -1
			    && !(aClass185_Sub2_9735.aClass177_2012.method2931
				 (is_295_[i_338_ * 3], (byte) 1).aBool2072))
			    bool_337_ = true;
		    }
		    if (is_294_ != null)
			class128.anIntArray1515 = new int[class128.aShort1511];
		    if (bool_337_) {
			class128.aShortArray1513
			    = new short[class128.aShort1511];
			class128.aShortArray1514
			    = new short[class128.aShort1511];
		    }
		    for (int i_339_ = 0; i_339_ < class128.aShort1511;
			 i_339_++) {
			int i_340_ = i_339_ * 3;
			if (is_294_ != null && is_294_[i_340_] != 0)
			    class128.anIntArray1515[i_339_]
				= is_294_[i_340_] >> 8;
			if (bool_337_) {
			    int i_341_ = i_340_ + 1;
			    int i_342_ = i_341_ + 1;
			    boolean bool_343_ = false;
			    boolean bool_344_ = true;
			    int i_345_ = is_295_[i_340_];
			    if (i_345_ == -1
				|| aClass185_Sub2_9735.aClass177_2012
				       .method2931(i_345_, (byte) 1).aBool2072)
				bool_344_ = false;
			    else
				bool_343_ = true;
			    i_345_ = is_295_[i_341_];
			    if (i_345_ == -1
				|| aClass185_Sub2_9735.aClass177_2012
				       .method2931(i_345_, (byte) 1).aBool2072)
				bool_344_ = false;
			    else
				bool_343_ = true;
			    i_345_ = is_295_[i_342_];
			    if (i_345_ == -1
				|| aClass185_Sub2_9735.aClass177_2012
				       .method2931(i_345_, (byte) 1).aBool2072)
				bool_344_ = false;
			    else
				bool_343_ = true;
			    if (bool_344_) {
				class128.aShortArray1513[i_339_]
				    = (short) i_345_;
				class128.aShortArray1514[i_339_]
				    = (short) is_296_[i_340_];
			    } else {
				if (bool_343_) {
				    i_345_ = is_295_[i_340_];
				    if (i_345_ != -1
					&& !(aClass185_Sub2_9735
						 .aClass177_2012.method2931
					     (i_345_, (byte) 1).aBool2072))
					class128.anIntArray1507[i_340_]
					    = (Class415.anIntArray4666
					       [(Class315.method5705
						 ((aClass185_Sub2_9735
						       .aClass177_2012
						       .method2931
						   (i_345_, (byte) 1)
						   .aShort2060) & 0xffff,
						  -337862951)) & 0xffff]);
				    i_345_ = is_295_[i_341_];
				    if (i_345_ != -1
					&& !(aClass185_Sub2_9735
						 .aClass177_2012.method2931
					     (i_345_, (byte) 1).aBool2072))
					class128.anIntArray1507[i_341_]
					    = (Class415.anIntArray4666
					       [(Class315.method5705
						 ((aClass185_Sub2_9735
						       .aClass177_2012
						       .method2931
						   (i_345_, (byte) 1)
						   .aShort2060) & 0xffff,
						  324687658)) & 0xffff]);
				    i_345_ = is_295_[i_342_];
				    if (i_345_ != -1
					&& !(aClass185_Sub2_9735
						 .aClass177_2012.method2931
					     (i_345_, (byte) 1).aBool2072))
					class128.anIntArray1507[i_342_]
					    = (Class415.anIntArray4666
					       [(Class315.method5705
						 ((aClass185_Sub2_9735
						       .aClass177_2012
						       .method2931
						   (i_345_, (byte) 1)
						   .aShort2060) & 0xffff,
						  1955797689)) & 0xffff]);
				}
				class128.aShortArray1513[i_339_] = (short) -1;
			    }
			}
		    }
		    aClass128ArrayArray9740[i][i_289_] = class128;
		}
	    }
	}
    }
    
    static int method15442(int i, int i_346_) {
	int i_347_ = (i & 0xff0000) * i_346_ >> 23;
	if (i_347_ < 2)
	    i_347_ = 2;
	else if (i_347_ > 253)
	    i_347_ = 253;
	int i_348_ = (i & 0xff00) * i_346_ >> 15;
	if (i_348_ < 2)
	    i_348_ = 2;
	else if (i_348_ > 253)
	    i_348_ = 253;
	int i_349_ = (i & 0xff) * i_346_ >> 7;
	if (i_349_ < 2)
	    i_349_ = 2;
	else if (i_349_ > 253)
	    i_349_ = 253;
	return i_347_ << 16 | i_348_ << 8 | i_349_;
    }
    
    public void method2512() {
	aByteArrayArray9743 = null;
	aByteArrayArray9759 = null;
    }
    
    public void method2500(int i, int i_350_, int i_351_, boolean[][] bools,
			   boolean bool, int i_352_) {
	if (aClass185_Sub2_9735.anIntArray9338 == null
	    || aClass185_Sub2_9735.aFloatArray9341 == null)
	    throw new IllegalStateException("");
	Class433 class433 = aClass185_Sub2_9735.aClass433_9346;
	aFloat9742 = class433.aFloatArray4853[0];
	aFloat9760 = class433.aFloatArray4853[1];
	aFloat9744 = class433.aFloatArray4853[2];
	aFloat9745 = class433.aFloatArray4853[3];
	aFloat9746 = class433.aFloatArray4853[4];
	aFloat9747 = class433.aFloatArray4853[5];
	aFloat9756 = class433.aFloatArray4853[6];
	aFloat9757 = class433.aFloatArray4853[7];
	aFloat9750 = class433.aFloatArray4853[8];
	aFloat9749 = class433.aFloatArray4853[9];
	aFloat9752 = class433.aFloatArray4853[10];
	aFloat9753 = class433.aFloatArray4853[11];
	aFloat9754 = class433.aFloatArray4853[12];
	aFloat9755 = class433.aFloatArray4853[13];
	aFloat9758 = class433.aFloatArray4853[14];
	aFloat9748 = class433.aFloatArray4853[15];
	for (int i_353_ = 0; i_353_ < i_351_ + i_351_; i_353_++) {
	    for (int i_354_ = 0; i_354_ < i_351_ + i_351_; i_354_++) {
		if (bools[i_353_][i_354_]) {
		    int i_355_ = i - i_351_ + i_353_;
		    int i_356_ = i_350_ - i_351_ + i_354_;
		    if (i_355_ >= 0 && i_355_ < anInt1701 * -1924295585
			&& i_356_ >= 0 && i_356_ < anInt1700 * -1466328823)
			method15441(i_355_, i_356_, i_352_);
		}
	    }
	}
    }
    
    public void method2514(int i, int i_357_, int i_358_, boolean[][] bools,
			   boolean bool, int i_359_) {
	if (aClass185_Sub2_9735.anIntArray9338 == null
	    || aClass185_Sub2_9735.aFloatArray9341 == null)
	    throw new IllegalStateException("");
	Class433 class433 = aClass185_Sub2_9735.aClass433_9346;
	aFloat9742 = class433.aFloatArray4853[0];
	aFloat9760 = class433.aFloatArray4853[1];
	aFloat9744 = class433.aFloatArray4853[2];
	aFloat9745 = class433.aFloatArray4853[3];
	aFloat9746 = class433.aFloatArray4853[4];
	aFloat9747 = class433.aFloatArray4853[5];
	aFloat9756 = class433.aFloatArray4853[6];
	aFloat9757 = class433.aFloatArray4853[7];
	aFloat9750 = class433.aFloatArray4853[8];
	aFloat9749 = class433.aFloatArray4853[9];
	aFloat9752 = class433.aFloatArray4853[10];
	aFloat9753 = class433.aFloatArray4853[11];
	aFloat9754 = class433.aFloatArray4853[12];
	aFloat9755 = class433.aFloatArray4853[13];
	aFloat9758 = class433.aFloatArray4853[14];
	aFloat9748 = class433.aFloatArray4853[15];
	for (int i_360_ = 0; i_360_ < i_358_ + i_358_; i_360_++) {
	    for (int i_361_ = 0; i_361_ < i_358_ + i_358_; i_361_++) {
		if (bools[i_360_][i_361_]) {
		    int i_362_ = i - i_358_ + i_360_;
		    int i_363_ = i_357_ - i_358_ + i_361_;
		    if (i_362_ >= 0 && i_362_ < anInt1701 * -1924295585
			&& i_363_ >= 0 && i_363_ < anInt1700 * -1466328823)
			method15441(i_362_, i_363_, i_359_);
		}
	    }
	}
    }
    
    public void method2515(int i, int i_364_, int i_365_, boolean[][] bools,
			   boolean bool, int i_366_) {
	if (aClass185_Sub2_9735.anIntArray9338 == null
	    || aClass185_Sub2_9735.aFloatArray9341 == null)
	    throw new IllegalStateException("");
	Class433 class433 = aClass185_Sub2_9735.aClass433_9346;
	aFloat9742 = class433.aFloatArray4853[0];
	aFloat9760 = class433.aFloatArray4853[1];
	aFloat9744 = class433.aFloatArray4853[2];
	aFloat9745 = class433.aFloatArray4853[3];
	aFloat9746 = class433.aFloatArray4853[4];
	aFloat9747 = class433.aFloatArray4853[5];
	aFloat9756 = class433.aFloatArray4853[6];
	aFloat9757 = class433.aFloatArray4853[7];
	aFloat9750 = class433.aFloatArray4853[8];
	aFloat9749 = class433.aFloatArray4853[9];
	aFloat9752 = class433.aFloatArray4853[10];
	aFloat9753 = class433.aFloatArray4853[11];
	aFloat9754 = class433.aFloatArray4853[12];
	aFloat9755 = class433.aFloatArray4853[13];
	aFloat9758 = class433.aFloatArray4853[14];
	aFloat9748 = class433.aFloatArray4853[15];
	for (int i_367_ = 0; i_367_ < i_365_ + i_365_; i_367_++) {
	    for (int i_368_ = 0; i_368_ < i_365_ + i_365_; i_368_++) {
		if (bools[i_367_][i_368_]) {
		    int i_369_ = i - i_365_ + i_367_;
		    int i_370_ = i_364_ - i_365_ + i_368_;
		    if (i_369_ >= 0 && i_369_ < anInt1701 * -1924295585
			&& i_370_ >= 0 && i_370_ < anInt1700 * -1466328823)
			method15441(i_369_, i_370_, i_366_);
		}
	    }
	}
    }
    
    void method15443(int i, int i_371_, int i_372_, int i_373_, int i_374_,
		     int i_375_, int i_376_, boolean[][] bools,
		     Class101 class101, Class119 class119, float[] fs,
		     float[] fs_377_) {
	int i_378_ = (i_376_ - i_374_) * i_372_ / 256;
	int i_379_ = i_372_ >> 8;
	boolean bool = class101.aBool1211;
	aClass185_Sub2_9735.method3461(false);
	class119.aBool1423 = false;
	class119.aBool1424 = false;
	int i_380_ = i;
	int i_381_ = i_371_ + i_378_;
	for (int i_382_ = i_373_; i_382_ < i_375_; i_382_++) {
	    for (int i_383_ = i_374_; i_383_ < i_376_; i_383_++) {
		if (bools[i_382_ - i_373_][i_383_ - i_374_]) {
		    if (aClass139ArrayArray9737[i_382_][i_383_] != null) {
			Class139 class139
			    = aClass139ArrayArray9737[i_382_][i_383_];
			if (class139.aShort1610 != -1
			    && (class139.aByte1614 & 0x2) == 0
			    && class139.anInt1608 == -1) {
			    int i_384_
				= aClass185_Sub2_9735.method14997((class139
								   .aShort1610)
								  & 0xffff);
			    class119.method2139
				(true, true, false, (float) (i_381_ - i_379_),
				 (float) (i_381_ - i_379_), (float) i_381_,
				 (float) (i_380_ + i_379_), (float) i_380_,
				 (float) (i_380_ + i_379_), 100.0F, 100.0F,
				 100.0F,
				 (float) Class146.method2452(i_384_,
							     ((class139
							       .aShort1611)
							      & 0xffff),
							     -900635763),
				 (float) Class146.method2452(i_384_,
							     ((class139
							       .aShort1612)
							      & 0xffff),
							     -813427981),
				 (float) Class146.method2452(i_384_,
							     ((class139
							       .aShort1613)
							      & 0xffff),
							     -686759121));
			    class119.method2139
				(true, true, false, (float) i_381_,
				 (float) i_381_, (float) (i_381_ - i_379_),
				 (float) i_380_, (float) (i_380_ + i_379_),
				 (float) i_380_, 100.0F, 100.0F, 100.0F,
				 (float) Class146.method2452(i_384_,
							     ((class139
							       .aShort1609)
							      & 0xffff),
							     -2058040332),
				 (float) Class146.method2452(i_384_,
							     ((class139
							       .aShort1613)
							      & 0xffff),
							     -2134426197),
				 (float) Class146.method2452(i_384_,
							     ((class139
							       .aShort1612)
							      & 0xffff),
							     -1874751972));
			} else if (class139.anInt1608 == -1) {
			    class119.method2139
				(true, true, false, (float) (i_381_ - i_379_),
				 (float) (i_381_ - i_379_), (float) i_381_,
				 (float) (i_380_ + i_379_), (float) i_380_,
				 (float) (i_380_ + i_379_), 100.0F, 100.0F,
				 100.0F,
				 (float) (class139.aShort1611 & 0xffff),
				 (float) (class139.aShort1612 & 0xffff),
				 (float) (class139.aShort1613 & 0xffff));
			    class119.method2139
				(true, true, false, (float) i_381_,
				 (float) i_381_, (float) (i_381_ - i_379_),
				 (float) i_380_, (float) (i_380_ + i_379_),
				 (float) i_380_, 100.0F, 100.0F, 100.0F,
				 (float) (class139.aShort1609 & 0xffff),
				 (float) (class139.aShort1613 & 0xffff),
				 (float) (class139.aShort1612 & 0xffff));
			} else {
			    int i_385_ = class139.anInt1608;
			    class119.method2139(true, true, false,
						(float) (i_381_ - i_379_),
						(float) (i_381_ - i_379_),
						(float) i_381_,
						(float) (i_380_ + i_379_),
						(float) i_380_,
						(float) (i_380_ + i_379_),
						100.0F, 100.0F, 100.0F,
						(float) i_385_, (float) i_385_,
						(float) i_385_);
			    class119.method2139(true, true, false,
						(float) i_381_, (float) i_381_,
						(float) (i_381_ - i_379_),
						(float) i_380_,
						(float) (i_380_ + i_379_),
						(float) i_380_, 100.0F, 100.0F,
						100.0F, (float) i_385_,
						(float) i_385_,
						(float) i_385_);
			}
		    } else if (aClass109ArrayArray9738[i_382_][i_383_]
			       != null) {
			Class109 class109
			    = aClass109ArrayArray9738[i_382_][i_383_];
			for (int i_386_ = 0; i_386_ < class109.aShort1330;
			     i_386_++) {
			    fs[i_386_]
				= (float) (i_380_
					   + (class109.aShortArray1332[i_386_]
					      * i_379_
					      / (anInt1702 * 127780559)));
			    fs_377_[i_386_]
				= (float) (i_381_
					   - (class109.aShortArray1334[i_386_]
					      * i_379_
					      / (anInt1702 * 127780559)));
			}
			for (int i_387_ = 0; i_387_ < class109.aShort1342;
			     i_387_++) {
			    short i_388_ = class109.aShortArray1336[i_387_];
			    short i_389_ = class109.aShortArray1337[i_387_];
			    short i_390_ = class109.aShortArray1338[i_387_];
			    float f = fs[i_388_];
			    float f_391_ = fs[i_389_];
			    float f_392_ = fs[i_390_];
			    float f_393_ = fs_377_[i_388_];
			    float f_394_ = fs_377_[i_389_];
			    float f_395_ = fs_377_[i_390_];
			    if (class109.anIntArray1335 != null
				&& class109.anIntArray1335[i_387_] != -1) {
				int i_396_ = class109.anIntArray1335[i_387_];
				class119.method2139
				    (true, true, false, f_393_, f_394_, f_395_,
				     f, f_391_, f_392_, 100.0F, 100.0F, 100.0F,
				     (float) (Class146.method2452
					      (i_396_,
					       (class109.aShortArray1339
						[i_388_]),
					       -1187199619)),
				     (float) (Class146.method2452
					      (i_396_,
					       (class109.aShortArray1339
						[i_389_]),
					       -692341003)),
				     (float) (Class146.method2452
					      (i_396_,
					       (class109.aShortArray1339
						[i_390_]),
					       -1027060775)));
			    } else if (class109.aShortArray1329 != null
				       && (class109.aShortArray1329[i_387_]
					   != -1)) {
				int i_397_ = (aClass185_Sub2_9735.method14997
					      (class109.aShortArray1329[i_387_]
					       & 0xffff));
				class119.method2139
				    (true, true, false, f_393_, f_394_, f_395_,
				     f, f_391_, f_392_, 100.0F, 100.0F, 100.0F,
				     (float) (Class146.method2452
					      (i_397_,
					       (class109.aShortArray1339
						[i_388_]),
					       -769136374)),
				     (float) (Class146.method2452
					      (i_397_,
					       (class109.aShortArray1339
						[i_389_]),
					       -807199071)),
				     (float) (Class146.method2452
					      (i_397_,
					       (class109.aShortArray1339
						[i_390_]),
					       -375346218)));
			    } else {
				int i_398_ = class109.anIntArray1341[i_387_];
				class119.method2139
				    (true, true, false, f_393_, f_394_, f_395_,
				     f, f_391_, f_392_, 100.0F, 100.0F, 100.0F,
				     (float) (Class146.method2452
					      (i_398_,
					       (class109.aShortArray1339
						[i_388_]),
					       152686348)),
				     (float) (Class146.method2452
					      (i_398_,
					       (class109.aShortArray1339
						[i_389_]),
					       -123719530)),
				     (float) (Class146.method2452
					      (i_398_,
					       (class109.aShortArray1339
						[i_390_]),
					       -1023131065)));
			    }
			}
		    }
		}
		i_381_ -= i_379_;
	    }
	    i_381_ = i_371_ + i_378_;
	    i_380_ += i_379_;
	}
	class119.aBool1423 = true;
	aClass185_Sub2_9735.method3461(bool);
    }
    
    public void method2517(int i, int i_399_, int i_400_, boolean[][] bools,
			   boolean bool, int i_401_) {
	if (aClass185_Sub2_9735.anIntArray9338 == null
	    || aClass185_Sub2_9735.aFloatArray9341 == null)
	    throw new IllegalStateException("");
	Class433 class433 = aClass185_Sub2_9735.aClass433_9346;
	aFloat9742 = class433.aFloatArray4853[0];
	aFloat9760 = class433.aFloatArray4853[1];
	aFloat9744 = class433.aFloatArray4853[2];
	aFloat9745 = class433.aFloatArray4853[3];
	aFloat9746 = class433.aFloatArray4853[4];
	aFloat9747 = class433.aFloatArray4853[5];
	aFloat9756 = class433.aFloatArray4853[6];
	aFloat9757 = class433.aFloatArray4853[7];
	aFloat9750 = class433.aFloatArray4853[8];
	aFloat9749 = class433.aFloatArray4853[9];
	aFloat9752 = class433.aFloatArray4853[10];
	aFloat9753 = class433.aFloatArray4853[11];
	aFloat9754 = class433.aFloatArray4853[12];
	aFloat9755 = class433.aFloatArray4853[13];
	aFloat9758 = class433.aFloatArray4853[14];
	aFloat9748 = class433.aFloatArray4853[15];
	for (int i_402_ = 0; i_402_ < i_400_ + i_400_; i_402_++) {
	    for (int i_403_ = 0; i_403_ < i_400_ + i_400_; i_403_++) {
		if (bools[i_402_][i_403_]) {
		    int i_404_ = i - i_400_ + i_402_;
		    int i_405_ = i_399_ - i_400_ + i_403_;
		    if (i_404_ >= 0 && i_404_ < anInt1701 * -1924295585
			&& i_405_ >= 0 && i_405_ < anInt1700 * -1466328823)
			method15441(i_404_, i_405_, i_401_);
		}
	    }
	}
    }
    
    public void method2533(int i, int i_406_, int i_407_, boolean[][] bools,
			   boolean bool, int i_408_) {
	if (aClass185_Sub2_9735.anIntArray9338 == null
	    || aClass185_Sub2_9735.aFloatArray9341 == null)
	    throw new IllegalStateException("");
	Class433 class433 = aClass185_Sub2_9735.aClass433_9346;
	aFloat9742 = class433.aFloatArray4853[0];
	aFloat9760 = class433.aFloatArray4853[1];
	aFloat9744 = class433.aFloatArray4853[2];
	aFloat9745 = class433.aFloatArray4853[3];
	aFloat9746 = class433.aFloatArray4853[4];
	aFloat9747 = class433.aFloatArray4853[5];
	aFloat9756 = class433.aFloatArray4853[6];
	aFloat9757 = class433.aFloatArray4853[7];
	aFloat9750 = class433.aFloatArray4853[8];
	aFloat9749 = class433.aFloatArray4853[9];
	aFloat9752 = class433.aFloatArray4853[10];
	aFloat9753 = class433.aFloatArray4853[11];
	aFloat9754 = class433.aFloatArray4853[12];
	aFloat9755 = class433.aFloatArray4853[13];
	aFloat9758 = class433.aFloatArray4853[14];
	aFloat9748 = class433.aFloatArray4853[15];
	for (int i_409_ = 0; i_409_ < i_407_ + i_407_; i_409_++) {
	    for (int i_410_ = 0; i_410_ < i_407_ + i_407_; i_410_++) {
		if (bools[i_409_][i_410_]) {
		    int i_411_ = i - i_407_ + i_409_;
		    int i_412_ = i_406_ - i_407_ + i_410_;
		    if (i_411_ >= 0 && i_411_ < anInt1701 * -1924295585
			&& i_412_ >= 0 && i_412_ < anInt1700 * -1466328823)
			method15441(i_411_, i_412_, i_408_);
		}
	    }
	}
    }
    
    void method15444(int i, int i_413_, int i_414_) {
	Class101 class101
	    = aClass185_Sub2_9735.method15011(Thread.currentThread());
	class101.aClass119_1233.anInt1447 = 0;
	if (aClass121ArrayArray9739 != null)
	    method15455(i, i_413_, class101.aBool1245, class101,
			class101.aClass119_1233, class101.aFloatArray1226,
			class101.aFloatArray1241, class101.aFloatArray1242,
			class101.aFloatArray1243, class101.aFloatArray1244,
			i_414_);
	else if (aClass139ArrayArray9737 != null)
	    method15446(i, i_413_, class101.aClass119_1233,
			class101.aFloatArray1226, class101.aFloatArray1241,
			class101.aFloatArray1242, class101.aFloatArray1243,
			class101.aFloatArray1244, i_414_);
	else if (aClass120ArrayArray9741 != null)
	    method15438(i, i_413_, class101.aBool1245, class101,
			class101.aClass119_1233, class101.aFloatArray1226,
			class101.aFloatArray1241, class101.aFloatArray1242,
			class101.aFloatArray1243, class101.aFloatArray1244,
			i_414_);
    }
    
    void method15445(int i, int i_415_, Class119 class119, float[] fs,
		     float[] fs_416_, float[] fs_417_, float[] fs_418_,
		     float[] fs_419_, int i_420_) {
	Class139 class139 = aClass139ArrayArray9737[i][i_415_];
	if (class139 != null) {
	    if ((class139.aByte1614 & 0x2) == 0) {
		if (i_420_ != 0) {
		    if ((class139.aByte1614 & 0x4) != 0) {
			if ((i_420_ & 0x1) != 0)
			    return;
		    } else if ((i_420_ & 0x2) != 0)
			return;
		}
		int i_421_ = i * (anInt1702 * 127780559);
		int i_422_ = i_421_ + anInt1702 * 127780559;
		int i_423_ = i_415_ * (anInt1702 * 127780559);
		int i_424_ = i_423_ + anInt1702 * 127780559;
		float f;
		float f_425_;
		float f_426_;
		float f_427_;
		float f_428_;
		float f_429_;
		float f_430_;
		float f_431_;
		float f_432_;
		float f_433_;
		float f_434_;
		float f_435_;
		float f_436_;
		float f_437_;
		float f_438_;
		float f_439_;
		if ((class139.aByte1614 & 0x1) != 0) {
		    int i_440_ = anIntArrayArray1704[i][i_415_];
		    float f_441_ = aFloat9756 * (float) i_440_;
		    float f_442_ = aFloat9757 * (float) i_440_;
		    float f_443_
			= aFloat9758 + (aFloat9744 * (float) i_421_ + f_441_
					+ aFloat9752 * (float) i_423_);
		    f = aFloat9748 + (aFloat9745 * (float) i_421_ + f_442_
				      + aFloat9753 * (float) i_423_);
		    if (f_443_ < -f)
			return;
		    float f_444_
			= aFloat9758 + (aFloat9744 * (float) i_422_ + f_441_
					+ aFloat9752 * (float) i_423_);
		    f_425_ = aFloat9748 + (aFloat9745 * (float) i_422_ + f_442_
					   + aFloat9753 * (float) i_423_);
		    if (f_444_ < -f_425_)
			return;
		    float f_445_
			= aFloat9758 + (aFloat9744 * (float) i_422_ + f_441_
					+ aFloat9752 * (float) i_424_);
		    f_426_ = aFloat9748 + (aFloat9745 * (float) i_422_ + f_442_
					   + aFloat9753 * (float) i_424_);
		    if (f_445_ < -f_426_)
			return;
		    float f_446_
			= aFloat9758 + (aFloat9744 * (float) i_421_ + f_441_
					+ aFloat9752 * (float) i_424_);
		    f_427_ = aFloat9748 + (aFloat9745 * (float) i_421_ + f_442_
					   + aFloat9753 * (float) i_424_);
		    if (f_446_ < -f_427_)
			return;
		    float f_447_ = aFloat9746 * (float) i_440_;
		    float f_448_ = aFloat9747 * (float) i_440_;
		    float f_449_
			= aFloat9754 + (aFloat9742 * (float) i_421_ + f_447_
					+ aFloat9750 * (float) i_423_);
		    f_428_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_449_ / f);
		    float f_450_
			= aFloat9755 + (aFloat9760 * (float) i_421_ + f_448_
					+ aFloat9749 * (float) i_423_);
		    f_429_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_450_ / f);
		    f_430_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_443_ / f);
		    float f_451_
			= aFloat9754 + (aFloat9742 * (float) i_422_ + f_447_
					+ aFloat9750 * (float) i_423_);
		    f_431_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_451_ / f_425_);
		    float f_452_
			= aFloat9755 + (aFloat9760 * (float) i_422_ + f_448_
					+ aFloat9749 * (float) i_423_);
		    f_432_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_452_ / f_425_);
		    f_433_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_444_ / f_425_);
		    float f_453_
			= aFloat9754 + (aFloat9742 * (float) i_422_ + f_447_
					+ aFloat9750 * (float) i_424_);
		    f_434_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_453_ / f_426_);
		    float f_454_
			= aFloat9755 + (aFloat9760 * (float) i_422_ + f_448_
					+ aFloat9749 * (float) i_424_);
		    f_435_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_454_ / f_426_);
		    f_436_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_445_ / f_426_);
		    float f_455_
			= aFloat9754 + (aFloat9742 * (float) i_421_ + f_447_
					+ aFloat9750 * (float) i_424_);
		    f_437_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_455_ / f_427_);
		    float f_456_
			= aFloat9755 + (aFloat9760 * (float) i_421_ + f_448_
					+ aFloat9749 * (float) i_424_);
		    f_438_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_456_ / f_427_);
		    f_439_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_446_ / f_427_);
		} else {
		    int i_457_ = anIntArrayArray1704[i][i_415_];
		    int i_458_ = anIntArrayArray1704[i + 1][i_415_];
		    int i_459_ = anIntArrayArray1704[i + 1][i_415_ + 1];
		    int i_460_ = anIntArrayArray1704[i][i_415_ + 1];
		    float f_461_
			= aFloat9758 + (aFloat9744 * (float) i_421_
					+ aFloat9756 * (float) i_457_
					+ aFloat9752 * (float) i_423_);
		    f = aFloat9748 + (aFloat9745 * (float) i_421_
				      + aFloat9757 * (float) i_457_
				      + aFloat9753 * (float) i_423_);
		    if (f_461_ < -f)
			return;
		    float f_462_
			= aFloat9758 + (aFloat9744 * (float) i_422_
					+ aFloat9756 * (float) i_458_
					+ aFloat9752 * (float) i_423_);
		    f_425_ = aFloat9748 + (aFloat9745 * (float) i_422_
					   + aFloat9757 * (float) i_458_
					   + aFloat9753 * (float) i_423_);
		    if (f_462_ < -f_425_)
			return;
		    float f_463_
			= aFloat9758 + (aFloat9744 * (float) i_422_
					+ aFloat9756 * (float) i_459_
					+ aFloat9752 * (float) i_424_);
		    f_426_ = aFloat9748 + (aFloat9745 * (float) i_422_
					   + aFloat9757 * (float) i_459_
					   + aFloat9753 * (float) i_424_);
		    if (f_463_ < -f_426_)
			return;
		    float f_464_
			= aFloat9758 + (aFloat9744 * (float) i_421_
					+ aFloat9756 * (float) i_460_
					+ aFloat9752 * (float) i_424_);
		    f_427_ = aFloat9748 + (aFloat9745 * (float) i_421_
					   + aFloat9757 * (float) i_460_
					   + aFloat9753 * (float) i_424_);
		    if (f_464_ < -f_427_)
			return;
		    float f_465_
			= aFloat9754 + (aFloat9742 * (float) i_421_
					+ aFloat9746 * (float) i_457_
					+ aFloat9750 * (float) i_423_);
		    f_428_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_465_ / f);
		    float f_466_
			= aFloat9755 + (aFloat9760 * (float) i_421_
					+ aFloat9747 * (float) i_457_
					+ aFloat9749 * (float) i_423_);
		    f_429_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_466_ / f);
		    f_430_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_461_ / f);
		    float f_467_
			= aFloat9754 + (aFloat9742 * (float) i_422_
					+ aFloat9746 * (float) i_458_
					+ aFloat9750 * (float) i_423_);
		    f_431_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_467_ / f_425_);
		    float f_468_
			= aFloat9755 + (aFloat9760 * (float) i_422_
					+ aFloat9747 * (float) i_458_
					+ aFloat9749 * (float) i_423_);
		    f_432_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_468_ / f_425_);
		    f_433_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_462_ / f_425_);
		    float f_469_
			= aFloat9754 + (aFloat9742 * (float) i_422_
					+ aFloat9746 * (float) i_459_
					+ aFloat9750 * (float) i_424_);
		    f_434_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_469_ / f_426_);
		    float f_470_
			= aFloat9755 + (aFloat9760 * (float) i_422_
					+ aFloat9747 * (float) i_459_
					+ aFloat9749 * (float) i_424_);
		    f_435_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_470_ / f_426_);
		    f_436_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_463_ / f_426_);
		    float f_471_
			= aFloat9754 + (aFloat9742 * (float) i_421_
					+ aFloat9746 * (float) i_460_
					+ aFloat9750 * (float) i_424_);
		    f_437_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_471_ / f_427_);
		    float f_472_
			= aFloat9755 + (aFloat9760 * (float) i_421_
					+ aFloat9747 * (float) i_460_
					+ aFloat9749 * (float) i_424_);
		    f_438_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_472_ / f_427_);
		    f_439_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_464_ / f_427_);
		}
		boolean bool = false;
		if (class139.aShort1610 != -1) {
		    Class186 class186
			= (aClass185_Sub2_9735.aClass177_2012.method2931
			   (class139.aShort1610 & 0xffff, (byte) 1));
		    bool = class186.aBool2043;
		}
		if (((f_434_ - f_437_) * (f_432_ - f_438_)
		     - (f_435_ - f_438_) * (f_431_ - f_437_))
		    > 0.0F) {
		    class119.aBool1422
			= (f_434_ < 0.0F || f_437_ < 0.0F || f_431_ < 0.0F
			   || f_434_ > (float) class119.anInt1448
			   || f_437_ > (float) class119.anInt1448
			   || f_431_ > (float) class119.anInt1448);
		    if (bool)
			class119.method2166
			    (true, true, false, f_435_, f_438_, f_432_, f_434_,
			     f_437_, f_431_, f_436_, f_439_, f_433_, f_426_,
			     f_427_, f_425_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
			     0.0F,
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1611 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1612 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1613 & 0xffff])
					  & 0xffffff),
			     0, 0.0F, 0.0F, 0.0F,
			     class139.aShort1610 & 0xffff);
		    else
			class119.method2139(true, true, false, f_435_, f_438_,
					    f_432_, f_434_, f_437_, f_431_,
					    f_436_, f_439_, f_433_,
					    (float) (class139.aShort1611
						     & 0xffff),
					    (float) (class139.aShort1612
						     & 0xffff),
					    (float) (class139.aShort1613
						     & 0xffff));
		}
		if (((f_428_ - f_431_) * (f_438_ - f_432_)
		     - (f_429_ - f_432_) * (f_437_ - f_431_))
		    > 0.0F) {
		    class119.aBool1422
			= (f_428_ < 0.0F || f_431_ < 0.0F || f_437_ < 0.0F
			   || f_428_ > (float) class119.anInt1448
			   || f_431_ > (float) class119.anInt1448
			   || f_437_ > (float) class119.anInt1448);
		    if (bool)
			class119.method2166
			    (true, true, false, f_429_, f_432_, f_438_, f_428_,
			     f_431_, f_437_, f_430_, f_433_, f_439_, f, f_425_,
			     f_427_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1609 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1613 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1612 & 0xffff])
					  & 0xffffff),
			     0, 0.0F, 0.0F, 0.0F,
			     class139.aShort1610 & 0xffff);
		    else
			class119.method2139(true, true, false, f_429_, f_432_,
					    f_438_, f_428_, f_431_, f_437_,
					    f_430_, f_433_, f_439_,
					    (float) (class139.aShort1609
						     & 0xffff),
					    (float) (class139.aShort1613
						     & 0xffff),
					    (float) (class139.aShort1612
						     & 0xffff));
		}
	    }
	} else {
	    Class109 class109 = aClass109ArrayArray9738[i][i_415_];
	    if (class109 != null) {
		if (i_420_ != 0) {
		    if ((class109.aByte1331 & 0x4) != 0) {
			if ((i_420_ & 0x1) != 0)
			    return;
		    } else if ((i_420_ & 0x2) != 0)
			return;
		}
		for (int i_473_ = 0; i_473_ < class109.aShort1330; i_473_++) {
		    int i_474_ = (class109.aShortArray1332[i_473_]
				  + (i << anInt1703 * -1495101509));
		    short i_475_ = class109.aShortArray1333[i_473_];
		    int i_476_ = (class109.aShortArray1334[i_473_]
				  + (i_415_ << anInt1703 * -1495101509));
		    float f = aFloat9758 + (aFloat9744 * (float) i_474_
					    + aFloat9756 * (float) i_475_
					    + aFloat9752 * (float) i_476_);
		    float f_477_
			= aFloat9748 + (aFloat9745 * (float) i_474_
					+ aFloat9757 * (float) i_475_
					+ aFloat9753 * (float) i_476_);
		    if (f < -f_477_)
			return;
		    float f_478_
			= aFloat9754 + (aFloat9742 * (float) i_474_
					+ aFloat9746 * (float) i_475_
					+ aFloat9750 * (float) i_476_);
		    float f_479_
			= aFloat9755 + (aFloat9760 * (float) i_474_
					+ aFloat9747 * (float) i_475_
					+ aFloat9749 * (float) i_476_);
		    fs[i_473_] = (class119.aFloat1429
				  + class119.aFloat1430 * f_478_ / f_477_);
		    fs_416_[i_473_]
			= (class119.aFloat1431
			   + class119.aFloat1432 * f_479_ / f_477_);
		    fs_417_[i_473_] = (class119.aFloat1433
				       + class119.aFloat1434 * f / f_477_);
		    fs_418_[i_473_] = f_477_;
		}
		if (class109.aShortArray1329 != null) {
		    for (int i_480_ = 0; i_480_ < class109.aShort1342;
			 i_480_++) {
			short i_481_ = class109.aShortArray1336[i_480_];
			short i_482_ = class109.aShortArray1337[i_480_];
			short i_483_ = class109.aShortArray1338[i_480_];
			float f = fs[i_481_];
			float f_484_ = fs[i_482_];
			float f_485_ = fs[i_483_];
			float f_486_ = fs_416_[i_481_];
			float f_487_ = fs_416_[i_482_];
			float f_488_ = fs_416_[i_483_];
			if (((f - f_484_) * (f_488_ - f_487_)
			     - (f_486_ - f_487_) * (f_485_ - f_484_))
			    > 0.0F) {
			    class119.aBool1422
				= (f < 0.0F || f_484_ < 0.0F || f_485_ < 0.0F
				   || f > (float) class119.anInt1448
				   || f_484_ > (float) class119.anInt1448
				   || f_485_ > (float) class119.anInt1448);
			    boolean bool = false;
			    if (class109.aShortArray1329[i_480_] != -1) {
				Class186 class186
				    = (aClass185_Sub2_9735.aClass177_2012
					   .method2931
				       ((class109.aShortArray1329[i_480_]
					 & 0xffff),
					(byte) 1));
				bool = class186.aBool2043;
			    }
			    if (bool)
				class119.method2166
				    (true, true, false, f_486_, f_487_, f_488_,
				     f, f_484_, f_485_, fs_417_[i_481_],
				     fs_417_[i_482_], fs_417_[i_483_],
				     fs_418_[i_481_], fs_418_[i_482_],
				     fs_418_[i_483_],
				     ((float) class109.aShortArray1332[i_481_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1332[i_482_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1332[i_483_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1334[i_481_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1334[i_482_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1334[i_483_]
				      / (float) (anInt1702 * 127780559)),
				     (~0xffffff
				      | (Class415.anIntArray4666
					 [(class109.aShortArray1339[i_481_]
					   & 0xffff)]) & 0xffffff),
				     (~0xffffff
				      | (Class415.anIntArray4666
					 [(class109.aShortArray1339[i_482_]
					   & 0xffff)]) & 0xffffff),
				     (~0xffffff
				      | (Class415.anIntArray4666
					 [(class109.aShortArray1339[i_483_]
					   & 0xffff)]) & 0xffffff),
				     0, 0.0F, 0.0F, 0.0F,
				     (class109.aShortArray1329[i_480_]
				      & 0xffff));
			    else {
				int i_489_ = class109.anIntArray1341[i_480_];
				if (i_489_ != -1)
				    class119.method2139
					(true, true, false, f_486_, f_487_,
					 f_488_, f, f_484_, f_485_,
					 fs_417_[i_481_], fs_417_[i_482_],
					 fs_417_[i_483_],
					 (float) (Class146.method2452
						  (i_489_,
						   (class109.aShortArray1339
						    [i_481_]),
						   -421239223)),
					 (float) (Class146.method2452
						  (i_489_,
						   (class109.aShortArray1339
						    [i_482_]),
						   293682571)),
					 (float) (Class146.method2452
						  (i_489_,
						   (class109.aShortArray1339
						    [i_483_]),
						   -707010221)));
			    }
			}
		    }
		} else {
		    for (int i_490_ = 0; i_490_ < class109.aShort1342;
			 i_490_++) {
			short i_491_ = class109.aShortArray1336[i_490_];
			short i_492_ = class109.aShortArray1337[i_490_];
			short i_493_ = class109.aShortArray1338[i_490_];
			float f = fs[i_491_];
			float f_494_ = fs[i_492_];
			float f_495_ = fs[i_493_];
			float f_496_ = fs_416_[i_491_];
			float f_497_ = fs_416_[i_492_];
			float f_498_ = fs_416_[i_493_];
			if (((f - f_494_) * (f_498_ - f_497_)
			     - (f_496_ - f_497_) * (f_495_ - f_494_))
			    > 0.0F) {
			    int i_499_ = class109.anIntArray1341[i_490_];
			    if (i_499_ != -1) {
				class119.aBool1422
				    = (f < 0.0F || f_494_ < 0.0F
				       || f_495_ < 0.0F
				       || f > (float) class119.anInt1448
				       || f_494_ > (float) class119.anInt1448
				       || f_495_ > (float) class119.anInt1448);
				class119.method2139
				    (true, true, false, f_496_, f_497_, f_498_,
				     f, f_494_, f_495_, fs_417_[i_491_],
				     fs_417_[i_492_], fs_417_[i_493_],
				     (float) (Class146.method2452
					      (i_499_,
					       (class109.aShortArray1339
						[i_491_]),
					       -1149524032)),
				     (float) (Class146.method2452
					      (i_499_,
					       (class109.aShortArray1339
						[i_492_]),
					       -1978922031)),
				     (float) (Class146.method2452
					      (i_499_,
					       (class109.aShortArray1339
						[i_493_]),
					       73995164)));
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method2519(int i, int i_500_, int i_501_, int i_502_,
			   int i_503_, int i_504_, int i_505_,
			   boolean[][] bools) {
	Class101 class101
	    = aClass185_Sub2_9735.method15011(Thread.currentThread());
	Class119 class119 = class101.aClass119_1233;
	class119.anInt1447 = 0;
	class119.aBool1422 = true;
	aClass185_Sub2_9735.method15003();
	if (aClass121ArrayArray9739 != null || aClass120ArrayArray9741 != null)
	    method15440(i, i_500_, i_501_, i_502_, i_503_, i_504_, i_505_,
			bools, class101, class119, class101.aFloatArray1226,
			class101.aFloatArray1241);
	else if (aClass139ArrayArray9737 != null)
	    method15453(i, i_500_, i_501_, i_502_, i_503_, i_504_, i_505_,
			bools, class101, class119, class101.aFloatArray1226,
			class101.aFloatArray1241);
    }
    
    void method15446(int i, int i_506_, Class119 class119, float[] fs,
		     float[] fs_507_, float[] fs_508_, float[] fs_509_,
		     float[] fs_510_, int i_511_) {
	Class139 class139 = aClass139ArrayArray9737[i][i_506_];
	if (class139 != null) {
	    if ((class139.aByte1614 & 0x2) == 0) {
		if (i_511_ != 0) {
		    if ((class139.aByte1614 & 0x4) != 0) {
			if ((i_511_ & 0x1) != 0)
			    return;
		    } else if ((i_511_ & 0x2) != 0)
			return;
		}
		int i_512_ = i * (anInt1702 * 127780559);
		int i_513_ = i_512_ + anInt1702 * 127780559;
		int i_514_ = i_506_ * (anInt1702 * 127780559);
		int i_515_ = i_514_ + anInt1702 * 127780559;
		float f;
		float f_516_;
		float f_517_;
		float f_518_;
		float f_519_;
		float f_520_;
		float f_521_;
		float f_522_;
		float f_523_;
		float f_524_;
		float f_525_;
		float f_526_;
		float f_527_;
		float f_528_;
		float f_529_;
		float f_530_;
		if ((class139.aByte1614 & 0x1) != 0) {
		    int i_531_ = anIntArrayArray1704[i][i_506_];
		    float f_532_ = aFloat9756 * (float) i_531_;
		    float f_533_ = aFloat9757 * (float) i_531_;
		    float f_534_
			= aFloat9758 + (aFloat9744 * (float) i_512_ + f_532_
					+ aFloat9752 * (float) i_514_);
		    f = aFloat9748 + (aFloat9745 * (float) i_512_ + f_533_
				      + aFloat9753 * (float) i_514_);
		    if (f_534_ < -f)
			return;
		    float f_535_
			= aFloat9758 + (aFloat9744 * (float) i_513_ + f_532_
					+ aFloat9752 * (float) i_514_);
		    f_516_ = aFloat9748 + (aFloat9745 * (float) i_513_ + f_533_
					   + aFloat9753 * (float) i_514_);
		    if (f_535_ < -f_516_)
			return;
		    float f_536_
			= aFloat9758 + (aFloat9744 * (float) i_513_ + f_532_
					+ aFloat9752 * (float) i_515_);
		    f_517_ = aFloat9748 + (aFloat9745 * (float) i_513_ + f_533_
					   + aFloat9753 * (float) i_515_);
		    if (f_536_ < -f_517_)
			return;
		    float f_537_
			= aFloat9758 + (aFloat9744 * (float) i_512_ + f_532_
					+ aFloat9752 * (float) i_515_);
		    f_518_ = aFloat9748 + (aFloat9745 * (float) i_512_ + f_533_
					   + aFloat9753 * (float) i_515_);
		    if (f_537_ < -f_518_)
			return;
		    float f_538_ = aFloat9746 * (float) i_531_;
		    float f_539_ = aFloat9747 * (float) i_531_;
		    float f_540_
			= aFloat9754 + (aFloat9742 * (float) i_512_ + f_538_
					+ aFloat9750 * (float) i_514_);
		    f_519_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_540_ / f);
		    float f_541_
			= aFloat9755 + (aFloat9760 * (float) i_512_ + f_539_
					+ aFloat9749 * (float) i_514_);
		    f_520_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_541_ / f);
		    f_521_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_534_ / f);
		    float f_542_
			= aFloat9754 + (aFloat9742 * (float) i_513_ + f_538_
					+ aFloat9750 * (float) i_514_);
		    f_522_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_542_ / f_516_);
		    float f_543_
			= aFloat9755 + (aFloat9760 * (float) i_513_ + f_539_
					+ aFloat9749 * (float) i_514_);
		    f_523_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_543_ / f_516_);
		    f_524_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_535_ / f_516_);
		    float f_544_
			= aFloat9754 + (aFloat9742 * (float) i_513_ + f_538_
					+ aFloat9750 * (float) i_515_);
		    f_525_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_544_ / f_517_);
		    float f_545_
			= aFloat9755 + (aFloat9760 * (float) i_513_ + f_539_
					+ aFloat9749 * (float) i_515_);
		    f_526_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_545_ / f_517_);
		    f_527_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_536_ / f_517_);
		    float f_546_
			= aFloat9754 + (aFloat9742 * (float) i_512_ + f_538_
					+ aFloat9750 * (float) i_515_);
		    f_528_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_546_ / f_518_);
		    float f_547_
			= aFloat9755 + (aFloat9760 * (float) i_512_ + f_539_
					+ aFloat9749 * (float) i_515_);
		    f_529_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_547_ / f_518_);
		    f_530_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_537_ / f_518_);
		} else {
		    int i_548_ = anIntArrayArray1704[i][i_506_];
		    int i_549_ = anIntArrayArray1704[i + 1][i_506_];
		    int i_550_ = anIntArrayArray1704[i + 1][i_506_ + 1];
		    int i_551_ = anIntArrayArray1704[i][i_506_ + 1];
		    float f_552_
			= aFloat9758 + (aFloat9744 * (float) i_512_
					+ aFloat9756 * (float) i_548_
					+ aFloat9752 * (float) i_514_);
		    f = aFloat9748 + (aFloat9745 * (float) i_512_
				      + aFloat9757 * (float) i_548_
				      + aFloat9753 * (float) i_514_);
		    if (f_552_ < -f)
			return;
		    float f_553_
			= aFloat9758 + (aFloat9744 * (float) i_513_
					+ aFloat9756 * (float) i_549_
					+ aFloat9752 * (float) i_514_);
		    f_516_ = aFloat9748 + (aFloat9745 * (float) i_513_
					   + aFloat9757 * (float) i_549_
					   + aFloat9753 * (float) i_514_);
		    if (f_553_ < -f_516_)
			return;
		    float f_554_
			= aFloat9758 + (aFloat9744 * (float) i_513_
					+ aFloat9756 * (float) i_550_
					+ aFloat9752 * (float) i_515_);
		    f_517_ = aFloat9748 + (aFloat9745 * (float) i_513_
					   + aFloat9757 * (float) i_550_
					   + aFloat9753 * (float) i_515_);
		    if (f_554_ < -f_517_)
			return;
		    float f_555_
			= aFloat9758 + (aFloat9744 * (float) i_512_
					+ aFloat9756 * (float) i_551_
					+ aFloat9752 * (float) i_515_);
		    f_518_ = aFloat9748 + (aFloat9745 * (float) i_512_
					   + aFloat9757 * (float) i_551_
					   + aFloat9753 * (float) i_515_);
		    if (f_555_ < -f_518_)
			return;
		    float f_556_
			= aFloat9754 + (aFloat9742 * (float) i_512_
					+ aFloat9746 * (float) i_548_
					+ aFloat9750 * (float) i_514_);
		    f_519_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_556_ / f);
		    float f_557_
			= aFloat9755 + (aFloat9760 * (float) i_512_
					+ aFloat9747 * (float) i_548_
					+ aFloat9749 * (float) i_514_);
		    f_520_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_557_ / f);
		    f_521_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_552_ / f);
		    float f_558_
			= aFloat9754 + (aFloat9742 * (float) i_513_
					+ aFloat9746 * (float) i_549_
					+ aFloat9750 * (float) i_514_);
		    f_522_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_558_ / f_516_);
		    float f_559_
			= aFloat9755 + (aFloat9760 * (float) i_513_
					+ aFloat9747 * (float) i_549_
					+ aFloat9749 * (float) i_514_);
		    f_523_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_559_ / f_516_);
		    f_524_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_553_ / f_516_);
		    float f_560_
			= aFloat9754 + (aFloat9742 * (float) i_513_
					+ aFloat9746 * (float) i_550_
					+ aFloat9750 * (float) i_515_);
		    f_525_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_560_ / f_517_);
		    float f_561_
			= aFloat9755 + (aFloat9760 * (float) i_513_
					+ aFloat9747 * (float) i_550_
					+ aFloat9749 * (float) i_515_);
		    f_526_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_561_ / f_517_);
		    f_527_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_554_ / f_517_);
		    float f_562_
			= aFloat9754 + (aFloat9742 * (float) i_512_
					+ aFloat9746 * (float) i_551_
					+ aFloat9750 * (float) i_515_);
		    f_528_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_562_ / f_518_);
		    float f_563_
			= aFloat9755 + (aFloat9760 * (float) i_512_
					+ aFloat9747 * (float) i_551_
					+ aFloat9749 * (float) i_515_);
		    f_529_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_563_ / f_518_);
		    f_530_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_555_ / f_518_);
		}
		boolean bool = false;
		if (class139.aShort1610 != -1) {
		    Class186 class186
			= (aClass185_Sub2_9735.aClass177_2012.method2931
			   (class139.aShort1610 & 0xffff, (byte) 1));
		    bool = class186.aBool2043;
		}
		if (((f_525_ - f_528_) * (f_523_ - f_529_)
		     - (f_526_ - f_529_) * (f_522_ - f_528_))
		    > 0.0F) {
		    class119.aBool1422
			= (f_525_ < 0.0F || f_528_ < 0.0F || f_522_ < 0.0F
			   || f_525_ > (float) class119.anInt1448
			   || f_528_ > (float) class119.anInt1448
			   || f_522_ > (float) class119.anInt1448);
		    if (bool)
			class119.method2166
			    (true, true, false, f_526_, f_529_, f_523_, f_525_,
			     f_528_, f_522_, f_527_, f_530_, f_524_, f_517_,
			     f_518_, f_516_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
			     0.0F,
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1611 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1612 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1613 & 0xffff])
					  & 0xffffff),
			     0, 0.0F, 0.0F, 0.0F,
			     class139.aShort1610 & 0xffff);
		    else
			class119.method2139(true, true, false, f_526_, f_529_,
					    f_523_, f_525_, f_528_, f_522_,
					    f_527_, f_530_, f_524_,
					    (float) (class139.aShort1611
						     & 0xffff),
					    (float) (class139.aShort1612
						     & 0xffff),
					    (float) (class139.aShort1613
						     & 0xffff));
		}
		if (((f_519_ - f_522_) * (f_529_ - f_523_)
		     - (f_520_ - f_523_) * (f_528_ - f_522_))
		    > 0.0F) {
		    class119.aBool1422
			= (f_519_ < 0.0F || f_522_ < 0.0F || f_528_ < 0.0F
			   || f_519_ > (float) class119.anInt1448
			   || f_522_ > (float) class119.anInt1448
			   || f_528_ > (float) class119.anInt1448);
		    if (bool)
			class119.method2166
			    (true, true, false, f_520_, f_523_, f_529_, f_519_,
			     f_522_, f_528_, f_521_, f_524_, f_530_, f, f_516_,
			     f_518_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1609 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1613 & 0xffff])
					  & 0xffffff),
			     ~0xffffff | ((Class415.anIntArray4666
					   [class139.aShort1612 & 0xffff])
					  & 0xffffff),
			     0, 0.0F, 0.0F, 0.0F,
			     class139.aShort1610 & 0xffff);
		    else
			class119.method2139(true, true, false, f_520_, f_523_,
					    f_529_, f_519_, f_522_, f_528_,
					    f_521_, f_524_, f_530_,
					    (float) (class139.aShort1609
						     & 0xffff),
					    (float) (class139.aShort1613
						     & 0xffff),
					    (float) (class139.aShort1612
						     & 0xffff));
		}
	    }
	} else {
	    Class109 class109 = aClass109ArrayArray9738[i][i_506_];
	    if (class109 != null) {
		if (i_511_ != 0) {
		    if ((class109.aByte1331 & 0x4) != 0) {
			if ((i_511_ & 0x1) != 0)
			    return;
		    } else if ((i_511_ & 0x2) != 0)
			return;
		}
		for (int i_564_ = 0; i_564_ < class109.aShort1330; i_564_++) {
		    int i_565_ = (class109.aShortArray1332[i_564_]
				  + (i << anInt1703 * -1495101509));
		    short i_566_ = class109.aShortArray1333[i_564_];
		    int i_567_ = (class109.aShortArray1334[i_564_]
				  + (i_506_ << anInt1703 * -1495101509));
		    float f = aFloat9758 + (aFloat9744 * (float) i_565_
					    + aFloat9756 * (float) i_566_
					    + aFloat9752 * (float) i_567_);
		    float f_568_
			= aFloat9748 + (aFloat9745 * (float) i_565_
					+ aFloat9757 * (float) i_566_
					+ aFloat9753 * (float) i_567_);
		    if (f < -f_568_)
			return;
		    float f_569_
			= aFloat9754 + (aFloat9742 * (float) i_565_
					+ aFloat9746 * (float) i_566_
					+ aFloat9750 * (float) i_567_);
		    float f_570_
			= aFloat9755 + (aFloat9760 * (float) i_565_
					+ aFloat9747 * (float) i_566_
					+ aFloat9749 * (float) i_567_);
		    fs[i_564_] = (class119.aFloat1429
				  + class119.aFloat1430 * f_569_ / f_568_);
		    fs_507_[i_564_]
			= (class119.aFloat1431
			   + class119.aFloat1432 * f_570_ / f_568_);
		    fs_508_[i_564_] = (class119.aFloat1433
				       + class119.aFloat1434 * f / f_568_);
		    fs_509_[i_564_] = f_568_;
		}
		if (class109.aShortArray1329 != null) {
		    for (int i_571_ = 0; i_571_ < class109.aShort1342;
			 i_571_++) {
			short i_572_ = class109.aShortArray1336[i_571_];
			short i_573_ = class109.aShortArray1337[i_571_];
			short i_574_ = class109.aShortArray1338[i_571_];
			float f = fs[i_572_];
			float f_575_ = fs[i_573_];
			float f_576_ = fs[i_574_];
			float f_577_ = fs_507_[i_572_];
			float f_578_ = fs_507_[i_573_];
			float f_579_ = fs_507_[i_574_];
			if (((f - f_575_) * (f_579_ - f_578_)
			     - (f_577_ - f_578_) * (f_576_ - f_575_))
			    > 0.0F) {
			    class119.aBool1422
				= (f < 0.0F || f_575_ < 0.0F || f_576_ < 0.0F
				   || f > (float) class119.anInt1448
				   || f_575_ > (float) class119.anInt1448
				   || f_576_ > (float) class119.anInt1448);
			    boolean bool = false;
			    if (class109.aShortArray1329[i_571_] != -1) {
				Class186 class186
				    = (aClass185_Sub2_9735.aClass177_2012
					   .method2931
				       ((class109.aShortArray1329[i_571_]
					 & 0xffff),
					(byte) 1));
				bool = class186.aBool2043;
			    }
			    if (bool)
				class119.method2166
				    (true, true, false, f_577_, f_578_, f_579_,
				     f, f_575_, f_576_, fs_508_[i_572_],
				     fs_508_[i_573_], fs_508_[i_574_],
				     fs_509_[i_572_], fs_509_[i_573_],
				     fs_509_[i_574_],
				     ((float) class109.aShortArray1332[i_572_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1332[i_573_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1332[i_574_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1334[i_572_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1334[i_573_]
				      / (float) (anInt1702 * 127780559)),
				     ((float) class109.aShortArray1334[i_574_]
				      / (float) (anInt1702 * 127780559)),
				     (~0xffffff
				      | (Class415.anIntArray4666
					 [(class109.aShortArray1339[i_572_]
					   & 0xffff)]) & 0xffffff),
				     (~0xffffff
				      | (Class415.anIntArray4666
					 [(class109.aShortArray1339[i_573_]
					   & 0xffff)]) & 0xffffff),
				     (~0xffffff
				      | (Class415.anIntArray4666
					 [(class109.aShortArray1339[i_574_]
					   & 0xffff)]) & 0xffffff),
				     0, 0.0F, 0.0F, 0.0F,
				     (class109.aShortArray1329[i_571_]
				      & 0xffff));
			    else {
				int i_580_ = class109.anIntArray1341[i_571_];
				if (i_580_ != -1)
				    class119.method2139
					(true, true, false, f_577_, f_578_,
					 f_579_, f, f_575_, f_576_,
					 fs_508_[i_572_], fs_508_[i_573_],
					 fs_508_[i_574_],
					 (float) (Class146.method2452
						  (i_580_,
						   (class109.aShortArray1339
						    [i_572_]),
						   -404054573)),
					 (float) (Class146.method2452
						  (i_580_,
						   (class109.aShortArray1339
						    [i_573_]),
						   -984565518)),
					 (float) (Class146.method2452
						  (i_580_,
						   (class109.aShortArray1339
						    [i_574_]),
						   116359534)));
			    }
			}
		    }
		} else {
		    for (int i_581_ = 0; i_581_ < class109.aShort1342;
			 i_581_++) {
			short i_582_ = class109.aShortArray1336[i_581_];
			short i_583_ = class109.aShortArray1337[i_581_];
			short i_584_ = class109.aShortArray1338[i_581_];
			float f = fs[i_582_];
			float f_585_ = fs[i_583_];
			float f_586_ = fs[i_584_];
			float f_587_ = fs_507_[i_582_];
			float f_588_ = fs_507_[i_583_];
			float f_589_ = fs_507_[i_584_];
			if (((f - f_585_) * (f_589_ - f_588_)
			     - (f_587_ - f_588_) * (f_586_ - f_585_))
			    > 0.0F) {
			    int i_590_ = class109.anIntArray1341[i_581_];
			    if (i_590_ != -1) {
				class119.aBool1422
				    = (f < 0.0F || f_585_ < 0.0F
				       || f_586_ < 0.0F
				       || f > (float) class119.anInt1448
				       || f_585_ > (float) class119.anInt1448
				       || f_586_ > (float) class119.anInt1448);
				class119.method2139
				    (true, true, false, f_587_, f_588_, f_589_,
				     f, f_585_, f_586_, fs_508_[i_582_],
				     fs_508_[i_583_], fs_508_[i_584_],
				     (float) (Class146.method2452
					      (i_590_,
					       (class109.aShortArray1339
						[i_582_]),
					       -1683539196)),
				     (float) (Class146.method2452
					      (i_590_,
					       (class109.aShortArray1339
						[i_583_]),
					       -856279760)),
				     (float) (Class146.method2452
					      (i_590_,
					       (class109.aShortArray1339
						[i_584_]),
					       -683644543)));
			    }
			}
		    }
		}
	    }
	}
    }
    
    void method15447(int i, int i_591_, boolean bool, Class101 class101,
		     Class119 class119, float[] fs, float[] fs_592_,
		     float[] fs_593_, float[] fs_594_, float[] fs_595_,
		     int i_596_) {
	Class121 class121 = aClass121ArrayArray9739[i][i_591_];
	if (class121 != null) {
	    if ((class121.aByte1475 & 0x2) == 0) {
		if (i_596_ != 0) {
		    if ((class121.aByte1475 & 0x4) != 0) {
			if ((i_596_ & 0x1) != 0)
			    return;
		    } else if ((i_596_ & 0x2) != 0)
			return;
		}
		int i_597_ = i * (anInt1702 * 127780559);
		int i_598_ = i_597_ + anInt1702 * 127780559;
		int i_599_ = i_591_ * (anInt1702 * 127780559);
		int i_600_ = i_599_ + anInt1702 * 127780559;
		float f = 0.0F;
		float f_601_ = 0.0F;
		float f_602_ = 0.0F;
		float f_603_ = 0.0F;
		float f_604_;
		float f_605_;
		float f_606_;
		float f_607_;
		float f_608_;
		float f_609_;
		float f_610_;
		float f_611_;
		float f_612_;
		float f_613_;
		float f_614_;
		float f_615_;
		float f_616_;
		float f_617_;
		float f_618_;
		float f_619_;
		if ((class121.aByte1475 & 0x1) != 0 && !bool) {
		    int i_620_ = anIntArrayArray1704[i][i_591_];
		    float f_621_ = aFloat9756 * (float) i_620_;
		    float f_622_ = aFloat9757 * (float) i_620_;
		    float f_623_
			= aFloat9758 + (aFloat9744 * (float) i_597_ + f_621_
					+ aFloat9752 * (float) i_599_);
		    f_604_ = aFloat9748 + (aFloat9745 * (float) i_597_ + f_622_
					   + aFloat9753 * (float) i_599_);
		    if (f_623_ < -f_604_)
			return;
		    float f_624_
			= aFloat9758 + (aFloat9744 * (float) i_598_ + f_621_
					+ aFloat9752 * (float) i_599_);
		    f_605_ = aFloat9748 + (aFloat9745 * (float) i_598_ + f_622_
					   + aFloat9753 * (float) i_599_);
		    if (f_624_ < -f_605_)
			return;
		    float f_625_
			= aFloat9758 + (aFloat9744 * (float) i_598_ + f_621_
					+ aFloat9752 * (float) i_600_);
		    f_606_ = aFloat9748 + (aFloat9745 * (float) i_598_ + f_622_
					   + aFloat9753 * (float) i_600_);
		    if (f_625_ < -f_606_)
			return;
		    float f_626_
			= aFloat9758 + (aFloat9744 * (float) i_597_ + f_621_
					+ aFloat9752 * (float) i_600_);
		    f_607_ = aFloat9748 + (aFloat9745 * (float) i_597_ + f_622_
					   + aFloat9753 * (float) i_600_);
		    if (f_626_ < -f_607_)
			return;
		    f_608_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_623_ / f_604_);
		    f_609_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_624_ / f_605_);
		    f_610_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_625_ / f_606_);
		    f_611_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_626_ / f_607_);
		    if (class101.aBool1203) {
			float f_627_ = f_623_ - class101.aFloat1204;
			if (f_627_ > 0.0F) {
			    f = f_627_ / class101.aFloat1205;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_627_ = f_624_ - class101.aFloat1204;
			if (f_627_ > 0.0F) {
			    f_601_ = f_627_ / class101.aFloat1205;
			    if (f_601_ > 1.0F)
				f_601_ = 1.0F;
			}
			f_627_ = f_625_ - class101.aFloat1204;
			if (f_627_ > 0.0F) {
			    f_602_ = f_627_ / class101.aFloat1205;
			    if (f_602_ > 1.0F)
				f_602_ = 1.0F;
			}
			f_627_ = f_626_ - class101.aFloat1204;
			if (f_627_ > 0.0F) {
			    f_603_ = f_627_ / class101.aFloat1205;
			    if (f_603_ > 1.0F)
				f_603_ = 1.0F;
			}
		    }
		    float f_628_ = aFloat9746 * (float) i_620_;
		    float f_629_ = aFloat9747 * (float) i_620_;
		    float f_630_
			= aFloat9754 + (aFloat9742 * (float) i_597_ + f_628_
					+ aFloat9750 * (float) i_599_);
		    f_612_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_630_ / f_604_);
		    float f_631_
			= aFloat9755 + (aFloat9760 * (float) i_597_ + f_629_
					+ aFloat9749 * (float) i_599_);
		    f_613_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_631_ / f_604_);
		    float f_632_
			= aFloat9754 + (aFloat9742 * (float) i_598_ + f_628_
					+ aFloat9750 * (float) i_599_);
		    f_614_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_632_ / f_605_);
		    float f_633_
			= aFloat9755 + (aFloat9760 * (float) i_598_ + f_629_
					+ aFloat9749 * (float) i_599_);
		    f_615_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_633_ / f_605_);
		    float f_634_
			= aFloat9754 + (aFloat9742 * (float) i_598_ + f_628_
					+ aFloat9750 * (float) i_600_);
		    f_616_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_634_ / f_606_);
		    float f_635_
			= aFloat9755 + (aFloat9760 * (float) i_598_ + f_629_
					+ aFloat9749 * (float) i_600_);
		    f_617_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_635_ / f_606_);
		    float f_636_
			= aFloat9754 + (aFloat9742 * (float) i_597_ + f_628_
					+ aFloat9750 * (float) i_600_);
		    f_618_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_636_ / f_607_);
		    float f_637_
			= aFloat9755 + (aFloat9760 * (float) i_597_ + f_629_
					+ aFloat9749 * (float) i_600_);
		    f_619_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_637_ / f_607_);
		} else {
		    int i_638_ = anIntArrayArray1704[i][i_591_];
		    int i_639_ = anIntArrayArray1704[i + 1][i_591_];
		    int i_640_ = anIntArrayArray1704[i + 1][i_591_ + 1];
		    int i_641_ = anIntArrayArray1704[i][i_591_ + 1];
		    float f_642_
			= aFloat9758 + (aFloat9744 * (float) i_597_
					+ aFloat9756 * (float) i_638_
					+ aFloat9752 * (float) i_599_);
		    f_604_ = aFloat9748 + (aFloat9745 * (float) i_597_
					   + aFloat9757 * (float) i_638_
					   + aFloat9753 * (float) i_599_);
		    if (f_642_ < -f_604_)
			return;
		    float f_643_
			= aFloat9758 + (aFloat9744 * (float) i_598_
					+ aFloat9756 * (float) i_639_
					+ aFloat9752 * (float) i_599_);
		    f_605_ = aFloat9748 + (aFloat9745 * (float) i_598_
					   + aFloat9757 * (float) i_639_
					   + aFloat9753 * (float) i_599_);
		    if (f_643_ < -f_605_)
			return;
		    float f_644_
			= aFloat9758 + (aFloat9744 * (float) i_598_
					+ aFloat9756 * (float) i_640_
					+ aFloat9752 * (float) i_600_);
		    f_606_ = aFloat9748 + (aFloat9745 * (float) i_598_
					   + aFloat9757 * (float) i_640_
					   + aFloat9753 * (float) i_600_);
		    if (f_644_ < -f_606_)
			return;
		    float f_645_
			= aFloat9758 + (aFloat9744 * (float) i_597_
					+ aFloat9756 * (float) i_641_
					+ aFloat9752 * (float) i_600_);
		    f_607_ = aFloat9748 + (aFloat9745 * (float) i_597_
					   + aFloat9757 * (float) i_641_
					   + aFloat9753 * (float) i_600_);
		    if (f_645_ < -f_607_)
			return;
		    f_608_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_642_ / f_604_);
		    f_609_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_643_ / f_605_);
		    f_610_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_644_ / f_606_);
		    f_611_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_645_ / f_607_);
		    if (bool) {
			float f_646_ = f_642_ - class101.aFloat1204;
			if (f_646_ > 0.0F) {
			    f_646_ /= class101.aFloat1205;
			    if (f_646_ > 1.0F)
				f_646_ = 1.0F;
			    f = f_646_;
			    int i_647_
				= (int) ((float) class121.aShort1477 * f_646_);
			    if (i_647_ > 0)
				i_638_ -= i_647_;
			}
			f_646_ = f_643_ - class101.aFloat1204;
			if (f_646_ > 0.0F) {
			    f_646_ /= class101.aFloat1205;
			    if (f_646_ > 1.0F)
				f_646_ = 1.0F;
			    f_601_ = f_646_;
			    int i_648_
				= (int) ((float) class121.aShort1473 * f_646_);
			    if (i_648_ > 0)
				i_639_ -= i_648_;
			}
			f_646_ = f_644_ - class101.aFloat1204;
			if (f_646_ > 0.0F) {
			    f_646_ /= class101.aFloat1205;
			    if (f_646_ > 1.0F)
				f_646_ = 1.0F;
			    f_602_ = f_646_;
			    int i_649_
				= (int) ((float) class121.aShort1479 * f_646_);
			    if (i_649_ > 0)
				i_640_ -= i_649_;
			}
			f_646_ = f_645_ - class101.aFloat1204;
			if (f_646_ > 0.0F) {
			    f_646_ /= class101.aFloat1205;
			    if (f_646_ > 1.0F)
				f_646_ = 1.0F;
			    f_603_ = f_646_;
			    int i_650_
				= (int) ((float) class121.aShort1472 * f_646_);
			    if (i_650_ > 0)
				i_641_ -= i_650_;
			}
		    } else if (class101.aBool1203) {
			float f_651_ = f_642_ - class101.aFloat1204;
			if (f_651_ > 0.0F) {
			    f = f_651_ / class101.aFloat1205;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_651_ = f_643_ - class101.aFloat1204;
			if (f_651_ > 0.0F) {
			    f_601_ = f_651_ / class101.aFloat1205;
			    if (f_601_ > 1.0F)
				f_601_ = 1.0F;
			}
			f_651_ = f_644_ - class101.aFloat1204;
			if (f_651_ > 0.0F) {
			    f_602_ = f_651_ / class101.aFloat1205;
			    if (f_602_ > 1.0F)
				f_602_ = 1.0F;
			}
			f_651_ = f_645_ - class101.aFloat1204;
			if (f_651_ > 0.0F) {
			    f_603_ = f_651_ / class101.aFloat1205;
			    if (f_603_ > 1.0F)
				f_603_ = 1.0F;
			}
		    }
		    float f_652_
			= aFloat9754 + (aFloat9742 * (float) i_597_
					+ aFloat9746 * (float) i_638_
					+ aFloat9750 * (float) i_599_);
		    f_612_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_652_ / f_604_);
		    float f_653_
			= aFloat9755 + (aFloat9760 * (float) i_597_
					+ aFloat9747 * (float) i_638_
					+ aFloat9749 * (float) i_599_);
		    f_613_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_653_ / f_604_);
		    float f_654_
			= aFloat9754 + (aFloat9742 * (float) i_598_
					+ aFloat9746 * (float) i_639_
					+ aFloat9750 * (float) i_599_);
		    f_614_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_654_ / f_605_);
		    float f_655_
			= aFloat9755 + (aFloat9760 * (float) i_598_
					+ aFloat9747 * (float) i_639_
					+ aFloat9749 * (float) i_599_);
		    f_615_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_655_ / f_605_);
		    float f_656_
			= aFloat9754 + (aFloat9742 * (float) i_598_
					+ aFloat9746 * (float) i_640_
					+ aFloat9750 * (float) i_600_);
		    f_616_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_656_ / f_606_);
		    float f_657_
			= aFloat9755 + (aFloat9760 * (float) i_598_
					+ aFloat9747 * (float) i_640_
					+ aFloat9749 * (float) i_600_);
		    f_617_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_657_ / f_606_);
		    float f_658_
			= aFloat9754 + (aFloat9742 * (float) i_597_
					+ aFloat9746 * (float) i_641_
					+ aFloat9750 * (float) i_600_);
		    f_618_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_658_ / f_607_);
		    float f_659_
			= aFloat9755 + (aFloat9760 * (float) i_597_
					+ aFloat9747 * (float) i_641_
					+ aFloat9749 * (float) i_600_);
		    f_619_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_659_ / f_607_);
		}
		Class186 class186 = null;
		boolean bool_660_ = false;
		if (class121.aShort1482 != -1) {
		    class186 = (aClass185_Sub2_9735.aClass177_2012.method2931
				(class121.aShort1482 & 0xffff, (byte) 1));
		    bool_660_ = class186.aBool2043;
		}
		boolean bool_661_
		    = class186 != null && method15439(class186.aByte2067);
		float f_662_ = f_601_ + f_602_ + f_603_;
		if (((f_616_ - f_618_) * (f_615_ - f_619_)
		     - (f_617_ - f_619_) * (f_614_ - f_618_))
		    > 0.0F) {
		    class119.aBool1422
			= (f_616_ < 0.0F || f_618_ < 0.0F || f_614_ < 0.0F
			   || f_616_ > (float) class119.anInt1448
			   || f_618_ > (float) class119.anInt1448
			   || f_614_ > (float) class119.anInt1448);
		    if (f_662_ < 3.0F) {
			if (f_662_ > 0.0F) {
			    if (bool_660_) {
				int i_663_ = -16777216;
				if (bool_661_)
				    i_663_ = -1694498816;
				class119.method2166
				    (true, true, false, f_617_, f_619_, f_615_,
				     f_616_, f_618_, f_614_, f_610_, f_611_,
				     f_609_, f_606_, f_607_, f_605_, 1.0F,
				     0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
				     i_663_ | class121.anInt1480 & 0xffffff,
				     i_663_ | class121.anInt1476 & 0xffffff,
				     i_663_ | class121.anInt1474 & 0xffffff,
				     class101.anInt1206 * 1046269871,
				     f_602_ * 255.0F, f_603_ * 255.0F,
				     f_601_ * 255.0F,
				     class121.aShort1482 & 0xffff);
			    } else {
				if (bool_661_)
				    class119.anInt1447 = 100;
				class119.method2141
				    (true, true, false, f_617_, f_619_, f_615_,
				     f_616_, f_618_, f_614_, f_610_, f_611_,
				     f_609_,
				     Class308.method5654(class121.anInt1480,
							 (((int) (f_602_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 101),
				     Class308.method5654(class121.anInt1476,
							 (((int) (f_603_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 124),
				     Class308.method5654(class121.anInt1474,
							 (((int) (f_601_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 35));
				class119.anInt1447 = 0;
			    }
			} else if (bool_660_) {
			    int i_664_ = -16777216;
			    if (bool_661_)
				i_664_ = -1694498816;
			    class119.method2166
				(true, true, false, f_617_, f_619_, f_615_,
				 f_616_, f_618_, f_614_, f_610_, f_611_,
				 f_609_, f_606_, f_607_, f_605_, 1.0F, 0.0F,
				 1.0F, 1.0F, 1.0F, 0.0F,
				 i_664_ | class121.anInt1480 & 0xffffff,
				 i_664_ | class121.anInt1476 & 0xffffff,
				 i_664_ | class121.anInt1474 & 0xffffff, 0,
				 0.0F, 0.0F, 0.0F,
				 class121.aShort1482 & 0xffff);
			} else {
			    if (bool_661_)
				class119.anInt1447 = 100;
			    class119.method2141(true, true, false, f_617_,
						f_619_, f_615_, f_616_, f_618_,
						f_614_, f_610_, f_611_, f_609_,
						class121.anInt1480,
						class121.anInt1476,
						class121.anInt1474);
			    class119.anInt1447 = 0;
			}
		    } else
			class119.method2137(true, true, false, f_617_, f_619_,
					    f_615_, f_616_, f_618_, f_614_,
					    f_610_, f_611_, f_609_,
					    class101.anInt1206 * 1046269871);
		}
		f_662_ = f + f_601_ + f_603_;
		if (((f_612_ - f_614_) * (f_619_ - f_615_)
		     - (f_613_ - f_615_) * (f_618_ - f_614_))
		    > 0.0F) {
		    class119.aBool1422
			= (f_612_ < 0.0F || f_614_ < 0.0F || f_618_ < 0.0F
			   || f_612_ > (float) class119.anInt1448
			   || f_614_ > (float) class119.anInt1448
			   || f_618_ > (float) class119.anInt1448);
		    if (f_662_ < 3.0F) {
			if (bool_661_)
			    class119.anInt1447 = -1694498816;
			if (f_662_ > 0.0F) {
			    if (bool_660_) {
				int i_665_ = -16777216;
				if (bool_661_)
				    i_665_ = -1694498816;
				class119.method2166
				    (true, true, false, f_613_, f_615_, f_619_,
				     f_612_, f_614_, f_618_, f_608_, f_609_,
				     f_611_, f_604_, f_605_, f_607_, 0.0F,
				     1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				     i_665_ | class121.anInt1478 & 0xffffff,
				     i_665_ | class121.anInt1474 & 0xffffff,
				     i_665_ | class121.anInt1476 & 0xffffff,
				     class101.anInt1206 * 1046269871,
				     f * 255.0F, f_601_ * 255.0F,
				     f_603_ * 255.0F,
				     class121.aShort1482 & 0xffff);
			    } else {
				if (bool_661_)
				    class119.anInt1447 = 100;
				class119.method2141
				    (true, true, false, f_613_, f_615_, f_619_,
				     f_612_, f_614_, f_618_, f_608_, f_609_,
				     f_611_,
				     Class308.method5654(class121.anInt1478,
							 (((int) (f * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 24),
				     Class308.method5654(class121.anInt1474,
							 (((int) (f_601_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 23),
				     Class308.method5654(class121.anInt1476,
							 (((int) (f_603_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 46));
				class119.anInt1447 = 0;
			    }
			} else if (bool_660_) {
			    int i_666_ = -16777216;
			    if (bool_661_)
				i_666_ = -1694498816;
			    class119.method2166
				(true, true, false, f_613_, f_615_, f_619_,
				 f_612_, f_614_, f_618_, f_608_, f_609_,
				 f_611_, f_604_, f_605_, f_607_, 0.0F, 1.0F,
				 1.0F, 0.0F, 0.0F, 1.0F,
				 i_666_ | class121.anInt1478 & 0xffffff,
				 i_666_ | class121.anInt1474 & 0xffffff,
				 i_666_ | class121.anInt1476 & 0xffffff, 0,
				 0.0F, 0.0F, 0.0F,
				 class121.aShort1482 & 0xffff);
			} else {
			    if (bool_661_)
				class119.anInt1447 = 100;
			    class119.method2141(true, true, false, f_613_,
						f_615_, f_619_, f_612_, f_614_,
						f_618_, f_608_, f_609_, f_611_,
						class121.anInt1478,
						class121.anInt1474,
						class121.anInt1476);
			    class119.anInt1447 = 0;
			}
		    } else
			class119.method2137(true, true, false, f_613_, f_615_,
					    f_619_, f_612_, f_614_, f_618_,
					    f_608_, f_609_, f_611_,
					    class101.anInt1206 * 1046269871);
		}
	    }
	} else {
	    Class128 class128 = aClass128ArrayArray9740[i][i_591_];
	    if (class128 != null) {
		if (i_596_ != 0) {
		    if ((class128.aByte1512 & 0x4) != 0) {
			if ((i_596_ & 0x1) != 0)
			    return;
		    } else if ((i_596_ & 0x2) != 0)
			return;
		}
		for (int i_667_ = 0; i_667_ < class128.aShort1505; i_667_++) {
		    int i_668_ = (class128.aShortArray1506[i_667_]
				  + (i << anInt1703 * -1495101509));
		    int i_669_ = class128.aShortArray1509[i_667_];
		    int i_670_ = (class128.aShortArray1510[i_667_]
				  + (i_591_ << anInt1703 * -1495101509));
		    float f = aFloat9758 + (aFloat9744 * (float) i_668_
					    + aFloat9756 * (float) i_669_
					    + aFloat9752 * (float) i_670_);
		    float f_671_
			= aFloat9748 + (aFloat9745 * (float) i_668_
					+ aFloat9757 * (float) i_669_
					+ aFloat9753 * (float) i_670_);
		    if (f < -f_671_)
			return;
		    float f_672_ = (class119.aFloat1433
				    + class119.aFloat1434 * f / f_671_);
		    fs_595_[i_667_] = 0.0F;
		    if (bool) {
			float f_673_ = f - class101.aFloat1204;
			if (f_673_ > 0.0F) {
			    f_673_ /= class101.aFloat1205;
			    if (f_673_ > 1.0F)
				f_673_ = 1.0F;
			    fs_595_[i_667_] = f_673_;
			    int i_674_
				= (int) ((float) (class128.aShortArray1508
						  [i_667_])
					 * f_673_);
			    if (i_674_ > 0)
				i_669_ -= i_674_;
			}
		    } else if (class101.aBool1203) {
			float f_675_ = f - class101.aFloat1204;
			if (f_675_ > 0.0F) {
			    fs_595_[i_667_] = f_675_ / class101.aFloat1205;
			    if (fs_595_[i_667_] > 1.0F)
				fs_595_[i_667_] = 1.0F;
			}
		    }
		    float f_676_
			= aFloat9754 + (aFloat9742 * (float) i_668_
					+ aFloat9746 * (float) i_669_
					+ aFloat9750 * (float) i_670_);
		    float f_677_
			= aFloat9755 + (aFloat9760 * (float) i_668_
					+ aFloat9747 * (float) i_669_
					+ aFloat9749 * (float) i_670_);
		    fs[i_667_] = (class119.aFloat1429
				  + class119.aFloat1430 * f_676_ / f_671_);
		    fs_592_[i_667_]
			= (class119.aFloat1431
			   + class119.aFloat1432 * f_677_ / f_671_);
		    fs_593_[i_667_] = f_672_;
		    fs_594_[i_667_] = f_671_;
		}
		if (class128.aShortArray1513 != null) {
		    for (int i_678_ = 0; i_678_ < class128.aShort1511;
			 i_678_++) {
			int i_679_ = i_678_ * 3;
			int i_680_ = i_679_ + 1;
			int i_681_ = i_680_ + 1;
			float f = fs[i_679_];
			float f_682_ = fs[i_680_];
			float f_683_ = fs[i_681_];
			float f_684_ = fs_592_[i_679_];
			float f_685_ = fs_592_[i_680_];
			float f_686_ = fs_592_[i_681_];
			float f_687_ = (fs_595_[i_679_] + fs_595_[i_680_]
					+ fs_595_[i_681_]);
			if (((f - f_682_) * (f_686_ - f_685_)
			     - (f_684_ - f_685_) * (f_683_ - f_682_))
			    > 0.0F) {
			    class119.aBool1422
				= (f < 0.0F || f_682_ < 0.0F || f_683_ < 0.0F
				   || f > (float) class119.anInt1448
				   || f_682_ > (float) class119.anInt1448
				   || f_683_ > (float) class119.anInt1448);
			    Class186 class186 = null;
			    boolean bool_688_ = false;
			    if (class128.aShortArray1513[i_678_] != -1) {
				class186 = (aClass185_Sub2_9735
						.aClass177_2012.method2931
					    ((class128.aShortArray1513[i_678_]
					      & 0xffff),
					     (byte) 1));
				bool_688_ = class186.aBool2043;
			    }
			    if (f_687_ < 3.0F) {
				if (f_687_ > 0.0F) {
				    if (bool_688_) {
					int i_689_ = -16777216;
					if (method15439(class186.aByte2067))
					    i_689_ = -1694498816;
					class119.method2166
					    (true, true, false, f_684_, f_685_,
					     f_686_, f, f_682_, f_683_,
					     fs_593_[i_679_], fs_593_[i_680_],
					     fs_593_[i_681_], fs_594_[i_679_],
					     fs_594_[i_680_], fs_594_[i_681_],
					     ((float) (class128.aShortArray1506
						       [i_679_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1506
						       [i_680_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1506
						       [i_681_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1510
						       [i_679_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1510
						       [i_680_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1510
						       [i_681_])
					      / (float) (anInt1702
							 * 127780559)),
					     i_689_ | (class128.anIntArray1507
						       [i_679_]) & 0xffffff,
					     i_689_ | (class128.anIntArray1507
						       [i_680_]) & 0xffffff,
					     i_689_ | (class128.anIntArray1507
						       [i_681_]) & 0xffffff,
					     class101.anInt1206 * 1046269871,
					     fs_595_[i_679_] * 255.0F,
					     fs_595_[i_680_] * 255.0F,
					     fs_595_[i_681_] * 255.0F,
					     (class128.aShortArray1513[i_678_]
					      & 0xffff));
				    } else if ((class128.anIntArray1507[i_679_]
						& 0xffffff)
					       != 0) {
					class119.method2141
					    (true, true, false, f_684_, f_685_,
					     f_686_, f, f_682_, f_683_,
					     fs_593_[i_679_], fs_593_[i_680_],
					     fs_593_[i_681_],
					     (Class308.method5654
					      (class128.anIntArray1507[i_679_],
					       ((int) (fs_595_[i_679_]
						       * 255.0F) << 24
						| (class101.anInt1206
						   * 1046269871)),
					       (byte) 116)),
					     (Class308.method5654
					      (class128.anIntArray1507[i_680_],
					       ((int) (fs_595_[i_680_]
						       * 255.0F) << 24
						| (class101.anInt1206
						   * 1046269871)),
					       (byte) 6)),
					     (Class308.method5654
					      (class128.anIntArray1507[i_681_],
					       ((int) (fs_595_[i_681_]
						       * 255.0F) << 24
						| (class101.anInt1206
						   * 1046269871)),
					       (byte) 92)));
					class119.anInt1447 = 0;
				    }
				} else if (bool_688_) {
				    int i_690_ = -16777216;
				    if (method15439(class186.aByte2067))
					i_690_ = -1694498816;
				    class119.method2166
					(true, true, false, f_684_, f_685_,
					 f_686_, f, f_682_, f_683_,
					 fs_593_[i_679_], fs_593_[i_680_],
					 fs_593_[i_681_], fs_594_[i_679_],
					 fs_594_[i_680_], fs_594_[i_681_],
					 ((float) (class128.aShortArray1506
						   [i_679_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1506
						   [i_680_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1506
						   [i_681_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1510
						   [i_679_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1510
						   [i_680_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1510
						   [i_681_])
					  / (float) (anInt1702 * 127780559)),
					 i_690_ | (class128.anIntArray1507
						   [i_679_]) & 0xffffff,
					 i_690_ | (class128.anIntArray1507
						   [i_680_]) & 0xffffff,
					 i_690_ | (class128.anIntArray1507
						   [i_681_]) & 0xffffff,
					 0, 0.0F, 0.0F, 0.0F,
					 (class128.aShortArray1513[i_678_]
					  & 0xffff));
				} else if ((class128.anIntArray1507[i_679_]
					    & 0xffffff)
					   != 0) {
				    class119.method2141
					(true, true, false, f_684_, f_685_,
					 f_686_, f, f_682_, f_683_,
					 fs_593_[i_679_], fs_593_[i_680_],
					 fs_593_[i_681_],
					 class128.anIntArray1507[i_679_],
					 class128.anIntArray1507[i_680_],
					 class128.anIntArray1507[i_681_]);
				    class119.anInt1447 = 0;
				}
			    } else
				class119.method2137(true, true, false, f_684_,
						    f_685_, f_686_, f, f_682_,
						    f_683_, fs_593_[i_679_],
						    fs_593_[i_680_],
						    fs_593_[i_681_],
						    (class101.anInt1206
						     * 1046269871));
			}
		    }
		} else {
		    for (int i_691_ = 0; i_691_ < class128.aShort1511;
			 i_691_++) {
			int i_692_ = i_691_ * 3;
			int i_693_ = i_692_ + 1;
			int i_694_ = i_693_ + 1;
			float f = fs[i_692_];
			float f_695_ = fs[i_693_];
			float f_696_ = fs[i_694_];
			float f_697_ = fs_592_[i_692_];
			float f_698_ = fs_592_[i_693_];
			float f_699_ = fs_592_[i_694_];
			float f_700_ = (fs_595_[i_692_] + fs_595_[i_693_]
					+ fs_595_[i_694_]);
			if (((f - f_695_) * (f_699_ - f_698_)
			     - (f_697_ - f_698_) * (f_696_ - f_695_))
			    > 0.0F) {
			    class119.aBool1422
				= (f < 0.0F || f_695_ < 0.0F || f_696_ < 0.0F
				   || f > (float) class119.anInt1448
				   || f_695_ > (float) class119.anInt1448
				   || f_696_ > (float) class119.anInt1448);
			    if (f_700_ < 3.0F) {
				if (f_700_ > 0.0F) {
				    if ((class128.anIntArray1507[i_692_]
					 & 0xffffff)
					!= 0)
					class119.method2141
					    (true, true, false, f_697_, f_698_,
					     f_699_, f, f_695_, f_696_,
					     fs_593_[i_692_], fs_593_[i_693_],
					     fs_593_[i_694_],
					     (Class69.method1396
					      (class128.anIntArray1507[i_692_],
					       class101.anInt1206 * 1046269871,
					       fs_595_[i_692_] * 255.0F,
					       (byte) -43)),
					     (Class69.method1396
					      (class128.anIntArray1507[i_693_],
					       class101.anInt1206 * 1046269871,
					       fs_595_[i_693_] * 255.0F,
					       (byte) 45)),
					     (Class69.method1396
					      (class128.anIntArray1507[i_694_],
					       class101.anInt1206 * 1046269871,
					       fs_595_[i_694_] * 255.0F,
					       (byte) 44)));
				} else if ((class128.anIntArray1507[i_692_]
					    & 0xffffff)
					   != 0)
				    class119.method2141
					(true, true, false, f_697_, f_698_,
					 f_699_, f, f_695_, f_696_,
					 fs_593_[i_692_], fs_593_[i_693_],
					 fs_593_[i_694_],
					 class128.anIntArray1507[i_692_],
					 class128.anIntArray1507[i_693_],
					 class128.anIntArray1507[i_694_]);
			    } else
				class119.method2137(true, true, false, f_697_,
						    f_698_, f_699_, f, f_695_,
						    f_696_, fs_593_[i_692_],
						    fs_593_[i_693_],
						    fs_593_[i_694_],
						    (class101.anInt1206
						     * 1046269871));
			}
		    }
		}
	    }
	}
    }
    
    void method15448(int i, int i_701_, boolean bool, Class101 class101,
		     Class119 class119, float[] fs, float[] fs_702_,
		     float[] fs_703_, float[] fs_704_, float[] fs_705_,
		     int i_706_) {
	Class120 class120 = aClass120ArrayArray9741[i][i_701_];
	if (i_706_ == 0 || (i_706_ & 0x2) == 0) {
	    if (class120 != null) {
		for (int i_707_ = 0; i_707_ < class120.aShort1462; i_707_++) {
		    int i_708_ = (class120.aShortArray1463[i_707_]
				  + (i << anInt1703 * -1495101509));
		    int i_709_ = class120.aShortArray1470[i_707_];
		    int i_710_ = (class120.aShortArray1465[i_707_]
				  + (i_701_ << anInt1703 * -1495101509));
		    float f = aFloat9758 + (aFloat9744 * (float) i_708_
					    + aFloat9756 * (float) i_709_
					    + aFloat9752 * (float) i_710_);
		    float f_711_
			= aFloat9748 + (aFloat9745 * (float) i_708_
					+ aFloat9757 * (float) i_709_
					+ aFloat9753 * (float) i_710_);
		    if (f < -f_711_)
			return;
		    fs_705_[i_707_] = 0.0F;
		    if (bool) {
			float f_712_ = f - class101.aFloat1204;
			if (f_712_ > 0.0F) {
			    f_712_ /= class101.aFloat1205;
			    if (f_712_ > 1.0F)
				f_712_ = 1.0F;
			    fs_705_[i_707_] = f_712_;
			    int i_713_
				= (int) ((float) (class120.aShortArray1461
						  [i_707_])
					 * f_712_);
			    if (i_713_ > 0)
				i_709_ -= i_713_;
			}
		    } else if (class101.aBool1203) {
			float f_714_ = f - class101.aFloat1204;
			if (f_714_ > 0.0F) {
			    fs_705_[i_707_] = f_714_ / class101.aFloat1205;
			    if (fs_705_[i_707_] > 1.0F)
				fs_705_[i_707_] = 1.0F;
			}
		    }
		    float f_715_
			= aFloat9754 + (aFloat9742 * (float) i_708_
					+ aFloat9746 * (float) i_709_
					+ aFloat9750 * (float) i_710_);
		    float f_716_
			= aFloat9755 + (aFloat9760 * (float) i_708_
					+ aFloat9747 * (float) i_709_
					+ aFloat9749 * (float) i_710_);
		    fs[i_707_] = (class119.aFloat1429
				  + class119.aFloat1430 * f_715_ / f_711_);
		    fs_702_[i_707_]
			= (class119.aFloat1431
			   + class119.aFloat1432 * f_716_ / f_711_);
		    fs_703_[i_707_] = (class119.aFloat1433
				       + class119.aFloat1434 * f / f_711_);
		    fs_704_[i_707_] = f_711_;
		}
		float f = (float) (anInt1702 * 127780559);
		for (int i_717_ = 0; i_717_ < class120.aShort1464; i_717_++) {
		    int i_718_ = i_717_ * 3;
		    int i_719_ = i_718_ + 1;
		    int i_720_ = i_719_ + 1;
		    float f_721_ = fs[i_718_];
		    float f_722_ = fs[i_719_];
		    float f_723_ = fs[i_720_];
		    float f_724_ = fs_702_[i_718_];
		    float f_725_ = fs_702_[i_719_];
		    float f_726_ = fs_702_[i_720_];
		    if (((f_721_ - f_722_) * (f_726_ - f_725_)
			 - (f_724_ - f_725_) * (f_723_ - f_722_))
			> 0.0F) {
			class119.aBool1422
			    = (f_721_ < 0.0F || f_722_ < 0.0F || f_723_ < 0.0F
			       || f_721_ > (float) class119.anInt1448
			       || f_722_ > (float) class119.anInt1448
			       || f_723_ > (float) class119.anInt1448);
			if (fs_705_[i_718_] + fs_705_[i_719_] + fs_705_[i_720_]
			    < 3.0F) {
			    int i_727_ = i << anInt1703 * -1495101509;
			    int i_728_ = i_701_ << anInt1703 * -1495101509;
			    if ((class120.anIntArray1466[i_718_] & 0xffffff)
				!= 0) {
				if (class120.aShortArray1467[i_718_] != -1
				    && class120.aShortArray1467[i_719_] != -1
				    && (class120.aShortArray1467[i_720_]
					!= -1)) {
				    if ((class120.aShortArray1467[i_718_]
					 == class120.aShortArray1467[i_719_])
					&& (class120.aShortArray1467[i_718_]
					    == (class120.aShortArray1467
						[i_720_]))
					&& (class120.aShortArray1468[i_718_]
					    == (class120.aShortArray1468
						[i_719_]))
					&& (class120.aShortArray1468[i_718_]
					    == (class120.aShortArray1468
						[i_720_])))
					class119.method2166
					    (true, true, false, f_724_, f_725_,
					     f_726_, f_721_, f_722_, f_723_,
					     fs_703_[i_718_], fs_703_[i_719_],
					     fs_703_[i_720_], fs_704_[i_718_],
					     fs_704_[i_719_], fs_704_[i_720_],
					     ((float) (i_727_
						       + (class120
							  .aShortArray1463
							  [i_718_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_718_])),
					     ((float) (i_727_
						       + (class120
							  .aShortArray1463
							  [i_719_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_719_])),
					     ((float) (i_727_
						       + (class120
							  .aShortArray1463
							  [i_720_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_720_])),
					     ((float) (i_728_
						       + (class120
							  .aShortArray1465
							  [i_718_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_718_])),
					     ((float) (i_728_
						       + (class120
							  .aShortArray1465
							  [i_719_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_719_])),
					     ((float) (i_728_
						       + (class120
							  .aShortArray1465
							  [i_720_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_720_])),
					     class120.anIntArray1466[i_718_],
					     class120.anIntArray1466[i_719_],
					     class120.anIntArray1466[i_720_],
					     class101.anInt1206 * 1046269871,
					     fs_705_[i_718_] * 255.0F,
					     fs_705_[i_719_] * 255.0F,
					     fs_705_[i_720_] * 255.0F,
					     (class120.aShortArray1467[i_718_]
					      & 0xffff));
				    else
					class119.method2147
					    (true, true, false, f_724_, f_725_,
					     f_726_, f_721_, f_722_, f_723_,
					     fs_703_[i_718_], fs_703_[i_719_],
					     fs_703_[i_720_], fs_704_[i_718_],
					     fs_704_[i_719_], fs_704_[i_720_],
					     (float) (i_727_
						      + (class120
							 .aShortArray1463
							 [i_718_])) / f,
					     (float) (i_727_
						      + (class120
							 .aShortArray1463
							 [i_719_])) / f,
					     (float) (i_727_
						      + (class120
							 .aShortArray1463
							 [i_720_])) / f,
					     (float) (i_728_
						      + (class120
							 .aShortArray1465
							 [i_718_])) / f,
					     (float) (i_728_
						      + (class120
							 .aShortArray1465
							 [i_719_])) / f,
					     (float) (i_728_
						      + (class120
							 .aShortArray1465
							 [i_720_])) / f,
					     class120.anIntArray1466[i_718_],
					     class120.anIntArray1466[i_719_],
					     class120.anIntArray1466[i_720_],
					     class101.anInt1206 * 1046269871,
					     fs_705_[i_718_] * 255.0F,
					     fs_705_[i_719_] * 255.0F,
					     fs_705_[i_720_] * 255.0F,
					     (class120.aShortArray1467[i_718_]
					      & 0xffff),
					     f / (float) (class120
							  .aShortArray1468
							  [i_718_]),
					     (class120.aShortArray1467[i_719_]
					      & 0xffff),
					     f / (float) (class120
							  .aShortArray1468
							  [i_719_]),
					     (class120.aShortArray1467[i_720_]
					      & 0xffff),
					     f / (float) (class120
							  .aShortArray1468
							  [i_720_]));
				} else if ((fs_705_[i_718_] + fs_705_[i_719_]
					    + fs_705_[i_720_])
					   > 0.0F)
				    class119.method2141
					(true, true, false, f_724_, f_725_,
					 f_726_, f_721_, f_722_, f_723_,
					 fs_703_[i_718_], fs_703_[i_719_],
					 fs_703_[i_720_],
					 (Class69.method1396
					  (class120.anIntArray1466[i_718_],
					   class101.anInt1206 * 1046269871,
					   fs_705_[i_718_] * 255.0F,
					   (byte) 40)),
					 (Class69.method1396
					  (class120.anIntArray1466[i_719_],
					   class101.anInt1206 * 1046269871,
					   fs_705_[i_719_] * 255.0F,
					   (byte) -37)),
					 (Class69.method1396
					  (class120.anIntArray1466[i_720_],
					   class101.anInt1206 * 1046269871,
					   fs_705_[i_720_] * 255.0F,
					   (byte) -20)));
				else
				    class119.method2141
					(true, true, false, f_724_, f_725_,
					 f_726_, f_721_, f_722_, f_723_,
					 fs_703_[i_718_], fs_703_[i_719_],
					 fs_703_[i_720_],
					 class120.anIntArray1466[i_718_],
					 class120.anIntArray1466[i_719_],
					 class120.anIntArray1466[i_720_]);
			    }
			} else
			    class119.method2137(true, true, false, f_724_,
						f_725_, f_726_, f_721_, f_722_,
						f_723_, fs_703_[i_718_],
						fs_703_[i_719_],
						fs_703_[i_720_],
						(class101.anInt1206
						 * 1046269871));
		    }
		}
	    }
	}
    }
    
    void method15449(int i, int i_729_, boolean bool, Class101 class101,
		     Class119 class119, float[] fs, float[] fs_730_,
		     float[] fs_731_, float[] fs_732_, float[] fs_733_,
		     int i_734_) {
	Class120 class120 = aClass120ArrayArray9741[i][i_729_];
	if (i_734_ == 0 || (i_734_ & 0x2) == 0) {
	    if (class120 != null) {
		for (int i_735_ = 0; i_735_ < class120.aShort1462; i_735_++) {
		    int i_736_ = (class120.aShortArray1463[i_735_]
				  + (i << anInt1703 * -1495101509));
		    int i_737_ = class120.aShortArray1470[i_735_];
		    int i_738_ = (class120.aShortArray1465[i_735_]
				  + (i_729_ << anInt1703 * -1495101509));
		    float f = aFloat9758 + (aFloat9744 * (float) i_736_
					    + aFloat9756 * (float) i_737_
					    + aFloat9752 * (float) i_738_);
		    float f_739_
			= aFloat9748 + (aFloat9745 * (float) i_736_
					+ aFloat9757 * (float) i_737_
					+ aFloat9753 * (float) i_738_);
		    if (f < -f_739_)
			return;
		    fs_733_[i_735_] = 0.0F;
		    if (bool) {
			float f_740_ = f - class101.aFloat1204;
			if (f_740_ > 0.0F) {
			    f_740_ /= class101.aFloat1205;
			    if (f_740_ > 1.0F)
				f_740_ = 1.0F;
			    fs_733_[i_735_] = f_740_;
			    int i_741_
				= (int) ((float) (class120.aShortArray1461
						  [i_735_])
					 * f_740_);
			    if (i_741_ > 0)
				i_737_ -= i_741_;
			}
		    } else if (class101.aBool1203) {
			float f_742_ = f - class101.aFloat1204;
			if (f_742_ > 0.0F) {
			    fs_733_[i_735_] = f_742_ / class101.aFloat1205;
			    if (fs_733_[i_735_] > 1.0F)
				fs_733_[i_735_] = 1.0F;
			}
		    }
		    float f_743_
			= aFloat9754 + (aFloat9742 * (float) i_736_
					+ aFloat9746 * (float) i_737_
					+ aFloat9750 * (float) i_738_);
		    float f_744_
			= aFloat9755 + (aFloat9760 * (float) i_736_
					+ aFloat9747 * (float) i_737_
					+ aFloat9749 * (float) i_738_);
		    fs[i_735_] = (class119.aFloat1429
				  + class119.aFloat1430 * f_743_ / f_739_);
		    fs_730_[i_735_]
			= (class119.aFloat1431
			   + class119.aFloat1432 * f_744_ / f_739_);
		    fs_731_[i_735_] = (class119.aFloat1433
				       + class119.aFloat1434 * f / f_739_);
		    fs_732_[i_735_] = f_739_;
		}
		float f = (float) (anInt1702 * 127780559);
		for (int i_745_ = 0; i_745_ < class120.aShort1464; i_745_++) {
		    int i_746_ = i_745_ * 3;
		    int i_747_ = i_746_ + 1;
		    int i_748_ = i_747_ + 1;
		    float f_749_ = fs[i_746_];
		    float f_750_ = fs[i_747_];
		    float f_751_ = fs[i_748_];
		    float f_752_ = fs_730_[i_746_];
		    float f_753_ = fs_730_[i_747_];
		    float f_754_ = fs_730_[i_748_];
		    if (((f_749_ - f_750_) * (f_754_ - f_753_)
			 - (f_752_ - f_753_) * (f_751_ - f_750_))
			> 0.0F) {
			class119.aBool1422
			    = (f_749_ < 0.0F || f_750_ < 0.0F || f_751_ < 0.0F
			       || f_749_ > (float) class119.anInt1448
			       || f_750_ > (float) class119.anInt1448
			       || f_751_ > (float) class119.anInt1448);
			if (fs_733_[i_746_] + fs_733_[i_747_] + fs_733_[i_748_]
			    < 3.0F) {
			    int i_755_ = i << anInt1703 * -1495101509;
			    int i_756_ = i_729_ << anInt1703 * -1495101509;
			    if ((class120.anIntArray1466[i_746_] & 0xffffff)
				!= 0) {
				if (class120.aShortArray1467[i_746_] != -1
				    && class120.aShortArray1467[i_747_] != -1
				    && (class120.aShortArray1467[i_748_]
					!= -1)) {
				    if ((class120.aShortArray1467[i_746_]
					 == class120.aShortArray1467[i_747_])
					&& (class120.aShortArray1467[i_746_]
					    == (class120.aShortArray1467
						[i_748_]))
					&& (class120.aShortArray1468[i_746_]
					    == (class120.aShortArray1468
						[i_747_]))
					&& (class120.aShortArray1468[i_746_]
					    == (class120.aShortArray1468
						[i_748_])))
					class119.method2166
					    (true, true, false, f_752_, f_753_,
					     f_754_, f_749_, f_750_, f_751_,
					     fs_731_[i_746_], fs_731_[i_747_],
					     fs_731_[i_748_], fs_732_[i_746_],
					     fs_732_[i_747_], fs_732_[i_748_],
					     ((float) (i_755_
						       + (class120
							  .aShortArray1463
							  [i_746_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_746_])),
					     ((float) (i_755_
						       + (class120
							  .aShortArray1463
							  [i_747_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_747_])),
					     ((float) (i_755_
						       + (class120
							  .aShortArray1463
							  [i_748_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_748_])),
					     ((float) (i_756_
						       + (class120
							  .aShortArray1465
							  [i_746_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_746_])),
					     ((float) (i_756_
						       + (class120
							  .aShortArray1465
							  [i_747_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_747_])),
					     ((float) (i_756_
						       + (class120
							  .aShortArray1465
							  [i_748_]))
					      / (float) (class120
							 .aShortArray1468
							 [i_748_])),
					     class120.anIntArray1466[i_746_],
					     class120.anIntArray1466[i_747_],
					     class120.anIntArray1466[i_748_],
					     class101.anInt1206 * 1046269871,
					     fs_733_[i_746_] * 255.0F,
					     fs_733_[i_747_] * 255.0F,
					     fs_733_[i_748_] * 255.0F,
					     (class120.aShortArray1467[i_746_]
					      & 0xffff));
				    else
					class119.method2147
					    (true, true, false, f_752_, f_753_,
					     f_754_, f_749_, f_750_, f_751_,
					     fs_731_[i_746_], fs_731_[i_747_],
					     fs_731_[i_748_], fs_732_[i_746_],
					     fs_732_[i_747_], fs_732_[i_748_],
					     (float) (i_755_
						      + (class120
							 .aShortArray1463
							 [i_746_])) / f,
					     (float) (i_755_
						      + (class120
							 .aShortArray1463
							 [i_747_])) / f,
					     (float) (i_755_
						      + (class120
							 .aShortArray1463
							 [i_748_])) / f,
					     (float) (i_756_
						      + (class120
							 .aShortArray1465
							 [i_746_])) / f,
					     (float) (i_756_
						      + (class120
							 .aShortArray1465
							 [i_747_])) / f,
					     (float) (i_756_
						      + (class120
							 .aShortArray1465
							 [i_748_])) / f,
					     class120.anIntArray1466[i_746_],
					     class120.anIntArray1466[i_747_],
					     class120.anIntArray1466[i_748_],
					     class101.anInt1206 * 1046269871,
					     fs_733_[i_746_] * 255.0F,
					     fs_733_[i_747_] * 255.0F,
					     fs_733_[i_748_] * 255.0F,
					     (class120.aShortArray1467[i_746_]
					      & 0xffff),
					     f / (float) (class120
							  .aShortArray1468
							  [i_746_]),
					     (class120.aShortArray1467[i_747_]
					      & 0xffff),
					     f / (float) (class120
							  .aShortArray1468
							  [i_747_]),
					     (class120.aShortArray1467[i_748_]
					      & 0xffff),
					     f / (float) (class120
							  .aShortArray1468
							  [i_748_]));
				} else if ((fs_733_[i_746_] + fs_733_[i_747_]
					    + fs_733_[i_748_])
					   > 0.0F)
				    class119.method2141
					(true, true, false, f_752_, f_753_,
					 f_754_, f_749_, f_750_, f_751_,
					 fs_731_[i_746_], fs_731_[i_747_],
					 fs_731_[i_748_],
					 (Class69.method1396
					  (class120.anIntArray1466[i_746_],
					   class101.anInt1206 * 1046269871,
					   fs_733_[i_746_] * 255.0F,
					   (byte) -45)),
					 (Class69.method1396
					  (class120.anIntArray1466[i_747_],
					   class101.anInt1206 * 1046269871,
					   fs_733_[i_747_] * 255.0F,
					   (byte) -8)),
					 (Class69.method1396
					  (class120.anIntArray1466[i_748_],
					   class101.anInt1206 * 1046269871,
					   fs_733_[i_748_] * 255.0F,
					   (byte) 60)));
				else
				    class119.method2141
					(true, true, false, f_752_, f_753_,
					 f_754_, f_749_, f_750_, f_751_,
					 fs_731_[i_746_], fs_731_[i_747_],
					 fs_731_[i_748_],
					 class120.anIntArray1466[i_746_],
					 class120.anIntArray1466[i_747_],
					 class120.anIntArray1466[i_748_]);
			    }
			} else
			    class119.method2137(true, true, false, f_752_,
						f_753_, f_754_, f_749_, f_750_,
						f_751_, fs_731_[i_746_],
						fs_731_[i_747_],
						fs_731_[i_748_],
						(class101.anInt1206
						 * 1046269871));
		    }
		}
	    }
	}
    }
    
    boolean method15450(int i) {
	if ((anInt9736 & 0x8) == 0)
	    return false;
	if (i == 4)
	    return true;
	if (i == 8)
	    return true;
	if (i == 9)
	    return true;
	return false;
    }
    
    public void method2513(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_757_, int i_758_, int i_759_, boolean bool) {
	/* empty */
    }
    
    void method15451(int i, int i_760_, boolean bool, Class101 class101,
		     Class119 class119, float[] fs, float[] fs_761_,
		     float[] fs_762_, float[] fs_763_, float[] fs_764_,
		     int i_765_) {
	Class121 class121 = aClass121ArrayArray9739[i][i_760_];
	if (class121 != null) {
	    if ((class121.aByte1475 & 0x2) == 0) {
		if (i_765_ != 0) {
		    if ((class121.aByte1475 & 0x4) != 0) {
			if ((i_765_ & 0x1) != 0)
			    return;
		    } else if ((i_765_ & 0x2) != 0)
			return;
		}
		int i_766_ = i * (anInt1702 * 127780559);
		int i_767_ = i_766_ + anInt1702 * 127780559;
		int i_768_ = i_760_ * (anInt1702 * 127780559);
		int i_769_ = i_768_ + anInt1702 * 127780559;
		float f = 0.0F;
		float f_770_ = 0.0F;
		float f_771_ = 0.0F;
		float f_772_ = 0.0F;
		float f_773_;
		float f_774_;
		float f_775_;
		float f_776_;
		float f_777_;
		float f_778_;
		float f_779_;
		float f_780_;
		float f_781_;
		float f_782_;
		float f_783_;
		float f_784_;
		float f_785_;
		float f_786_;
		float f_787_;
		float f_788_;
		if ((class121.aByte1475 & 0x1) != 0 && !bool) {
		    int i_789_ = anIntArrayArray1704[i][i_760_];
		    float f_790_ = aFloat9756 * (float) i_789_;
		    float f_791_ = aFloat9757 * (float) i_789_;
		    float f_792_
			= aFloat9758 + (aFloat9744 * (float) i_766_ + f_790_
					+ aFloat9752 * (float) i_768_);
		    f_773_ = aFloat9748 + (aFloat9745 * (float) i_766_ + f_791_
					   + aFloat9753 * (float) i_768_);
		    if (f_792_ < -f_773_)
			return;
		    float f_793_
			= aFloat9758 + (aFloat9744 * (float) i_767_ + f_790_
					+ aFloat9752 * (float) i_768_);
		    f_774_ = aFloat9748 + (aFloat9745 * (float) i_767_ + f_791_
					   + aFloat9753 * (float) i_768_);
		    if (f_793_ < -f_774_)
			return;
		    float f_794_
			= aFloat9758 + (aFloat9744 * (float) i_767_ + f_790_
					+ aFloat9752 * (float) i_769_);
		    f_775_ = aFloat9748 + (aFloat9745 * (float) i_767_ + f_791_
					   + aFloat9753 * (float) i_769_);
		    if (f_794_ < -f_775_)
			return;
		    float f_795_
			= aFloat9758 + (aFloat9744 * (float) i_766_ + f_790_
					+ aFloat9752 * (float) i_769_);
		    f_776_ = aFloat9748 + (aFloat9745 * (float) i_766_ + f_791_
					   + aFloat9753 * (float) i_769_);
		    if (f_795_ < -f_776_)
			return;
		    f_777_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_792_ / f_773_);
		    f_778_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_793_ / f_774_);
		    f_779_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_794_ / f_775_);
		    f_780_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_795_ / f_776_);
		    if (class101.aBool1203) {
			float f_796_ = f_792_ - class101.aFloat1204;
			if (f_796_ > 0.0F) {
			    f = f_796_ / class101.aFloat1205;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_796_ = f_793_ - class101.aFloat1204;
			if (f_796_ > 0.0F) {
			    f_770_ = f_796_ / class101.aFloat1205;
			    if (f_770_ > 1.0F)
				f_770_ = 1.0F;
			}
			f_796_ = f_794_ - class101.aFloat1204;
			if (f_796_ > 0.0F) {
			    f_771_ = f_796_ / class101.aFloat1205;
			    if (f_771_ > 1.0F)
				f_771_ = 1.0F;
			}
			f_796_ = f_795_ - class101.aFloat1204;
			if (f_796_ > 0.0F) {
			    f_772_ = f_796_ / class101.aFloat1205;
			    if (f_772_ > 1.0F)
				f_772_ = 1.0F;
			}
		    }
		    float f_797_ = aFloat9746 * (float) i_789_;
		    float f_798_ = aFloat9747 * (float) i_789_;
		    float f_799_
			= aFloat9754 + (aFloat9742 * (float) i_766_ + f_797_
					+ aFloat9750 * (float) i_768_);
		    f_781_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_799_ / f_773_);
		    float f_800_
			= aFloat9755 + (aFloat9760 * (float) i_766_ + f_798_
					+ aFloat9749 * (float) i_768_);
		    f_782_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_800_ / f_773_);
		    float f_801_
			= aFloat9754 + (aFloat9742 * (float) i_767_ + f_797_
					+ aFloat9750 * (float) i_768_);
		    f_783_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_801_ / f_774_);
		    float f_802_
			= aFloat9755 + (aFloat9760 * (float) i_767_ + f_798_
					+ aFloat9749 * (float) i_768_);
		    f_784_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_802_ / f_774_);
		    float f_803_
			= aFloat9754 + (aFloat9742 * (float) i_767_ + f_797_
					+ aFloat9750 * (float) i_769_);
		    f_785_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_803_ / f_775_);
		    float f_804_
			= aFloat9755 + (aFloat9760 * (float) i_767_ + f_798_
					+ aFloat9749 * (float) i_769_);
		    f_786_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_804_ / f_775_);
		    float f_805_
			= aFloat9754 + (aFloat9742 * (float) i_766_ + f_797_
					+ aFloat9750 * (float) i_769_);
		    f_787_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_805_ / f_776_);
		    float f_806_
			= aFloat9755 + (aFloat9760 * (float) i_766_ + f_798_
					+ aFloat9749 * (float) i_769_);
		    f_788_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_806_ / f_776_);
		} else {
		    int i_807_ = anIntArrayArray1704[i][i_760_];
		    int i_808_ = anIntArrayArray1704[i + 1][i_760_];
		    int i_809_ = anIntArrayArray1704[i + 1][i_760_ + 1];
		    int i_810_ = anIntArrayArray1704[i][i_760_ + 1];
		    float f_811_
			= aFloat9758 + (aFloat9744 * (float) i_766_
					+ aFloat9756 * (float) i_807_
					+ aFloat9752 * (float) i_768_);
		    f_773_ = aFloat9748 + (aFloat9745 * (float) i_766_
					   + aFloat9757 * (float) i_807_
					   + aFloat9753 * (float) i_768_);
		    if (f_811_ < -f_773_)
			return;
		    float f_812_
			= aFloat9758 + (aFloat9744 * (float) i_767_
					+ aFloat9756 * (float) i_808_
					+ aFloat9752 * (float) i_768_);
		    f_774_ = aFloat9748 + (aFloat9745 * (float) i_767_
					   + aFloat9757 * (float) i_808_
					   + aFloat9753 * (float) i_768_);
		    if (f_812_ < -f_774_)
			return;
		    float f_813_
			= aFloat9758 + (aFloat9744 * (float) i_767_
					+ aFloat9756 * (float) i_809_
					+ aFloat9752 * (float) i_769_);
		    f_775_ = aFloat9748 + (aFloat9745 * (float) i_767_
					   + aFloat9757 * (float) i_809_
					   + aFloat9753 * (float) i_769_);
		    if (f_813_ < -f_775_)
			return;
		    float f_814_
			= aFloat9758 + (aFloat9744 * (float) i_766_
					+ aFloat9756 * (float) i_810_
					+ aFloat9752 * (float) i_769_);
		    f_776_ = aFloat9748 + (aFloat9745 * (float) i_766_
					   + aFloat9757 * (float) i_810_
					   + aFloat9753 * (float) i_769_);
		    if (f_814_ < -f_776_)
			return;
		    f_777_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_811_ / f_773_);
		    f_778_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_812_ / f_774_);
		    f_779_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_813_ / f_775_);
		    f_780_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_814_ / f_776_);
		    if (bool) {
			float f_815_ = f_811_ - class101.aFloat1204;
			if (f_815_ > 0.0F) {
			    f_815_ /= class101.aFloat1205;
			    if (f_815_ > 1.0F)
				f_815_ = 1.0F;
			    f = f_815_;
			    int i_816_
				= (int) ((float) class121.aShort1477 * f_815_);
			    if (i_816_ > 0)
				i_807_ -= i_816_;
			}
			f_815_ = f_812_ - class101.aFloat1204;
			if (f_815_ > 0.0F) {
			    f_815_ /= class101.aFloat1205;
			    if (f_815_ > 1.0F)
				f_815_ = 1.0F;
			    f_770_ = f_815_;
			    int i_817_
				= (int) ((float) class121.aShort1473 * f_815_);
			    if (i_817_ > 0)
				i_808_ -= i_817_;
			}
			f_815_ = f_813_ - class101.aFloat1204;
			if (f_815_ > 0.0F) {
			    f_815_ /= class101.aFloat1205;
			    if (f_815_ > 1.0F)
				f_815_ = 1.0F;
			    f_771_ = f_815_;
			    int i_818_
				= (int) ((float) class121.aShort1479 * f_815_);
			    if (i_818_ > 0)
				i_809_ -= i_818_;
			}
			f_815_ = f_814_ - class101.aFloat1204;
			if (f_815_ > 0.0F) {
			    f_815_ /= class101.aFloat1205;
			    if (f_815_ > 1.0F)
				f_815_ = 1.0F;
			    f_772_ = f_815_;
			    int i_819_
				= (int) ((float) class121.aShort1472 * f_815_);
			    if (i_819_ > 0)
				i_810_ -= i_819_;
			}
		    } else if (class101.aBool1203) {
			float f_820_ = f_811_ - class101.aFloat1204;
			if (f_820_ > 0.0F) {
			    f = f_820_ / class101.aFloat1205;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_820_ = f_812_ - class101.aFloat1204;
			if (f_820_ > 0.0F) {
			    f_770_ = f_820_ / class101.aFloat1205;
			    if (f_770_ > 1.0F)
				f_770_ = 1.0F;
			}
			f_820_ = f_813_ - class101.aFloat1204;
			if (f_820_ > 0.0F) {
			    f_771_ = f_820_ / class101.aFloat1205;
			    if (f_771_ > 1.0F)
				f_771_ = 1.0F;
			}
			f_820_ = f_814_ - class101.aFloat1204;
			if (f_820_ > 0.0F) {
			    f_772_ = f_820_ / class101.aFloat1205;
			    if (f_772_ > 1.0F)
				f_772_ = 1.0F;
			}
		    }
		    float f_821_
			= aFloat9754 + (aFloat9742 * (float) i_766_
					+ aFloat9746 * (float) i_807_
					+ aFloat9750 * (float) i_768_);
		    f_781_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_821_ / f_773_);
		    float f_822_
			= aFloat9755 + (aFloat9760 * (float) i_766_
					+ aFloat9747 * (float) i_807_
					+ aFloat9749 * (float) i_768_);
		    f_782_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_822_ / f_773_);
		    float f_823_
			= aFloat9754 + (aFloat9742 * (float) i_767_
					+ aFloat9746 * (float) i_808_
					+ aFloat9750 * (float) i_768_);
		    f_783_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_823_ / f_774_);
		    float f_824_
			= aFloat9755 + (aFloat9760 * (float) i_767_
					+ aFloat9747 * (float) i_808_
					+ aFloat9749 * (float) i_768_);
		    f_784_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_824_ / f_774_);
		    float f_825_
			= aFloat9754 + (aFloat9742 * (float) i_767_
					+ aFloat9746 * (float) i_809_
					+ aFloat9750 * (float) i_769_);
		    f_785_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_825_ / f_775_);
		    float f_826_
			= aFloat9755 + (aFloat9760 * (float) i_767_
					+ aFloat9747 * (float) i_809_
					+ aFloat9749 * (float) i_769_);
		    f_786_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_826_ / f_775_);
		    float f_827_
			= aFloat9754 + (aFloat9742 * (float) i_766_
					+ aFloat9746 * (float) i_810_
					+ aFloat9750 * (float) i_769_);
		    f_787_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_827_ / f_776_);
		    float f_828_
			= aFloat9755 + (aFloat9760 * (float) i_766_
					+ aFloat9747 * (float) i_810_
					+ aFloat9749 * (float) i_769_);
		    f_788_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_828_ / f_776_);
		}
		Class186 class186 = null;
		boolean bool_829_ = false;
		if (class121.aShort1482 != -1) {
		    class186 = (aClass185_Sub2_9735.aClass177_2012.method2931
				(class121.aShort1482 & 0xffff, (byte) 1));
		    bool_829_ = class186.aBool2043;
		}
		boolean bool_830_
		    = class186 != null && method15439(class186.aByte2067);
		float f_831_ = f_770_ + f_771_ + f_772_;
		if (((f_785_ - f_787_) * (f_784_ - f_788_)
		     - (f_786_ - f_788_) * (f_783_ - f_787_))
		    > 0.0F) {
		    class119.aBool1422
			= (f_785_ < 0.0F || f_787_ < 0.0F || f_783_ < 0.0F
			   || f_785_ > (float) class119.anInt1448
			   || f_787_ > (float) class119.anInt1448
			   || f_783_ > (float) class119.anInt1448);
		    if (f_831_ < 3.0F) {
			if (f_831_ > 0.0F) {
			    if (bool_829_) {
				int i_832_ = -16777216;
				if (bool_830_)
				    i_832_ = -1694498816;
				class119.method2166
				    (true, true, false, f_786_, f_788_, f_784_,
				     f_785_, f_787_, f_783_, f_779_, f_780_,
				     f_778_, f_775_, f_776_, f_774_, 1.0F,
				     0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
				     i_832_ | class121.anInt1480 & 0xffffff,
				     i_832_ | class121.anInt1476 & 0xffffff,
				     i_832_ | class121.anInt1474 & 0xffffff,
				     class101.anInt1206 * 1046269871,
				     f_771_ * 255.0F, f_772_ * 255.0F,
				     f_770_ * 255.0F,
				     class121.aShort1482 & 0xffff);
			    } else {
				if (bool_830_)
				    class119.anInt1447 = 100;
				class119.method2141
				    (true, true, false, f_786_, f_788_, f_784_,
				     f_785_, f_787_, f_783_, f_779_, f_780_,
				     f_778_,
				     Class308.method5654(class121.anInt1480,
							 (((int) (f_771_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 36),
				     Class308.method5654(class121.anInt1476,
							 (((int) (f_772_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 33),
				     Class308.method5654(class121.anInt1474,
							 (((int) (f_770_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 72));
				class119.anInt1447 = 0;
			    }
			} else if (bool_829_) {
			    int i_833_ = -16777216;
			    if (bool_830_)
				i_833_ = -1694498816;
			    class119.method2166
				(true, true, false, f_786_, f_788_, f_784_,
				 f_785_, f_787_, f_783_, f_779_, f_780_,
				 f_778_, f_775_, f_776_, f_774_, 1.0F, 0.0F,
				 1.0F, 1.0F, 1.0F, 0.0F,
				 i_833_ | class121.anInt1480 & 0xffffff,
				 i_833_ | class121.anInt1476 & 0xffffff,
				 i_833_ | class121.anInt1474 & 0xffffff, 0,
				 0.0F, 0.0F, 0.0F,
				 class121.aShort1482 & 0xffff);
			} else {
			    if (bool_830_)
				class119.anInt1447 = 100;
			    class119.method2141(true, true, false, f_786_,
						f_788_, f_784_, f_785_, f_787_,
						f_783_, f_779_, f_780_, f_778_,
						class121.anInt1480,
						class121.anInt1476,
						class121.anInt1474);
			    class119.anInt1447 = 0;
			}
		    } else
			class119.method2137(true, true, false, f_786_, f_788_,
					    f_784_, f_785_, f_787_, f_783_,
					    f_779_, f_780_, f_778_,
					    class101.anInt1206 * 1046269871);
		}
		f_831_ = f + f_770_ + f_772_;
		if (((f_781_ - f_783_) * (f_788_ - f_784_)
		     - (f_782_ - f_784_) * (f_787_ - f_783_))
		    > 0.0F) {
		    class119.aBool1422
			= (f_781_ < 0.0F || f_783_ < 0.0F || f_787_ < 0.0F
			   || f_781_ > (float) class119.anInt1448
			   || f_783_ > (float) class119.anInt1448
			   || f_787_ > (float) class119.anInt1448);
		    if (f_831_ < 3.0F) {
			if (bool_830_)
			    class119.anInt1447 = -1694498816;
			if (f_831_ > 0.0F) {
			    if (bool_829_) {
				int i_834_ = -16777216;
				if (bool_830_)
				    i_834_ = -1694498816;
				class119.method2166
				    (true, true, false, f_782_, f_784_, f_788_,
				     f_781_, f_783_, f_787_, f_777_, f_778_,
				     f_780_, f_773_, f_774_, f_776_, 0.0F,
				     1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				     i_834_ | class121.anInt1478 & 0xffffff,
				     i_834_ | class121.anInt1474 & 0xffffff,
				     i_834_ | class121.anInt1476 & 0xffffff,
				     class101.anInt1206 * 1046269871,
				     f * 255.0F, f_770_ * 255.0F,
				     f_772_ * 255.0F,
				     class121.aShort1482 & 0xffff);
			    } else {
				if (bool_830_)
				    class119.anInt1447 = 100;
				class119.method2141
				    (true, true, false, f_782_, f_784_, f_788_,
				     f_781_, f_783_, f_787_, f_777_, f_778_,
				     f_780_,
				     Class308.method5654(class121.anInt1478,
							 (((int) (f * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 94),
				     Class308.method5654(class121.anInt1474,
							 (((int) (f_770_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 120),
				     Class308.method5654(class121.anInt1476,
							 (((int) (f_772_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 3));
				class119.anInt1447 = 0;
			    }
			} else if (bool_829_) {
			    int i_835_ = -16777216;
			    if (bool_830_)
				i_835_ = -1694498816;
			    class119.method2166
				(true, true, false, f_782_, f_784_, f_788_,
				 f_781_, f_783_, f_787_, f_777_, f_778_,
				 f_780_, f_773_, f_774_, f_776_, 0.0F, 1.0F,
				 1.0F, 0.0F, 0.0F, 1.0F,
				 i_835_ | class121.anInt1478 & 0xffffff,
				 i_835_ | class121.anInt1474 & 0xffffff,
				 i_835_ | class121.anInt1476 & 0xffffff, 0,
				 0.0F, 0.0F, 0.0F,
				 class121.aShort1482 & 0xffff);
			} else {
			    if (bool_830_)
				class119.anInt1447 = 100;
			    class119.method2141(true, true, false, f_782_,
						f_784_, f_788_, f_781_, f_783_,
						f_787_, f_777_, f_778_, f_780_,
						class121.anInt1478,
						class121.anInt1474,
						class121.anInt1476);
			    class119.anInt1447 = 0;
			}
		    } else
			class119.method2137(true, true, false, f_782_, f_784_,
					    f_788_, f_781_, f_783_, f_787_,
					    f_777_, f_778_, f_780_,
					    class101.anInt1206 * 1046269871);
		}
	    }
	} else {
	    Class128 class128 = aClass128ArrayArray9740[i][i_760_];
	    if (class128 != null) {
		if (i_765_ != 0) {
		    if ((class128.aByte1512 & 0x4) != 0) {
			if ((i_765_ & 0x1) != 0)
			    return;
		    } else if ((i_765_ & 0x2) != 0)
			return;
		}
		for (int i_836_ = 0; i_836_ < class128.aShort1505; i_836_++) {
		    int i_837_ = (class128.aShortArray1506[i_836_]
				  + (i << anInt1703 * -1495101509));
		    int i_838_ = class128.aShortArray1509[i_836_];
		    int i_839_ = (class128.aShortArray1510[i_836_]
				  + (i_760_ << anInt1703 * -1495101509));
		    float f = aFloat9758 + (aFloat9744 * (float) i_837_
					    + aFloat9756 * (float) i_838_
					    + aFloat9752 * (float) i_839_);
		    float f_840_
			= aFloat9748 + (aFloat9745 * (float) i_837_
					+ aFloat9757 * (float) i_838_
					+ aFloat9753 * (float) i_839_);
		    if (f < -f_840_)
			return;
		    float f_841_ = (class119.aFloat1433
				    + class119.aFloat1434 * f / f_840_);
		    fs_764_[i_836_] = 0.0F;
		    if (bool) {
			float f_842_ = f - class101.aFloat1204;
			if (f_842_ > 0.0F) {
			    f_842_ /= class101.aFloat1205;
			    if (f_842_ > 1.0F)
				f_842_ = 1.0F;
			    fs_764_[i_836_] = f_842_;
			    int i_843_
				= (int) ((float) (class128.aShortArray1508
						  [i_836_])
					 * f_842_);
			    if (i_843_ > 0)
				i_838_ -= i_843_;
			}
		    } else if (class101.aBool1203) {
			float f_844_ = f - class101.aFloat1204;
			if (f_844_ > 0.0F) {
			    fs_764_[i_836_] = f_844_ / class101.aFloat1205;
			    if (fs_764_[i_836_] > 1.0F)
				fs_764_[i_836_] = 1.0F;
			}
		    }
		    float f_845_
			= aFloat9754 + (aFloat9742 * (float) i_837_
					+ aFloat9746 * (float) i_838_
					+ aFloat9750 * (float) i_839_);
		    float f_846_
			= aFloat9755 + (aFloat9760 * (float) i_837_
					+ aFloat9747 * (float) i_838_
					+ aFloat9749 * (float) i_839_);
		    fs[i_836_] = (class119.aFloat1429
				  + class119.aFloat1430 * f_845_ / f_840_);
		    fs_761_[i_836_]
			= (class119.aFloat1431
			   + class119.aFloat1432 * f_846_ / f_840_);
		    fs_762_[i_836_] = f_841_;
		    fs_763_[i_836_] = f_840_;
		}
		if (class128.aShortArray1513 != null) {
		    for (int i_847_ = 0; i_847_ < class128.aShort1511;
			 i_847_++) {
			int i_848_ = i_847_ * 3;
			int i_849_ = i_848_ + 1;
			int i_850_ = i_849_ + 1;
			float f = fs[i_848_];
			float f_851_ = fs[i_849_];
			float f_852_ = fs[i_850_];
			float f_853_ = fs_761_[i_848_];
			float f_854_ = fs_761_[i_849_];
			float f_855_ = fs_761_[i_850_];
			float f_856_ = (fs_764_[i_848_] + fs_764_[i_849_]
					+ fs_764_[i_850_]);
			if (((f - f_851_) * (f_855_ - f_854_)
			     - (f_853_ - f_854_) * (f_852_ - f_851_))
			    > 0.0F) {
			    class119.aBool1422
				= (f < 0.0F || f_851_ < 0.0F || f_852_ < 0.0F
				   || f > (float) class119.anInt1448
				   || f_851_ > (float) class119.anInt1448
				   || f_852_ > (float) class119.anInt1448);
			    Class186 class186 = null;
			    boolean bool_857_ = false;
			    if (class128.aShortArray1513[i_847_] != -1) {
				class186 = (aClass185_Sub2_9735
						.aClass177_2012.method2931
					    ((class128.aShortArray1513[i_847_]
					      & 0xffff),
					     (byte) 1));
				bool_857_ = class186.aBool2043;
			    }
			    if (f_856_ < 3.0F) {
				if (f_856_ > 0.0F) {
				    if (bool_857_) {
					int i_858_ = -16777216;
					if (method15439(class186.aByte2067))
					    i_858_ = -1694498816;
					class119.method2166
					    (true, true, false, f_853_, f_854_,
					     f_855_, f, f_851_, f_852_,
					     fs_762_[i_848_], fs_762_[i_849_],
					     fs_762_[i_850_], fs_763_[i_848_],
					     fs_763_[i_849_], fs_763_[i_850_],
					     ((float) (class128.aShortArray1506
						       [i_848_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1506
						       [i_849_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1506
						       [i_850_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1510
						       [i_848_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1510
						       [i_849_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1510
						       [i_850_])
					      / (float) (anInt1702
							 * 127780559)),
					     i_858_ | (class128.anIntArray1507
						       [i_848_]) & 0xffffff,
					     i_858_ | (class128.anIntArray1507
						       [i_849_]) & 0xffffff,
					     i_858_ | (class128.anIntArray1507
						       [i_850_]) & 0xffffff,
					     class101.anInt1206 * 1046269871,
					     fs_764_[i_848_] * 255.0F,
					     fs_764_[i_849_] * 255.0F,
					     fs_764_[i_850_] * 255.0F,
					     (class128.aShortArray1513[i_847_]
					      & 0xffff));
				    } else if ((class128.anIntArray1507[i_848_]
						& 0xffffff)
					       != 0) {
					class119.method2141
					    (true, true, false, f_853_, f_854_,
					     f_855_, f, f_851_, f_852_,
					     fs_762_[i_848_], fs_762_[i_849_],
					     fs_762_[i_850_],
					     (Class308.method5654
					      (class128.anIntArray1507[i_848_],
					       ((int) (fs_764_[i_848_]
						       * 255.0F) << 24
						| (class101.anInt1206
						   * 1046269871)),
					       (byte) 73)),
					     (Class308.method5654
					      (class128.anIntArray1507[i_849_],
					       ((int) (fs_764_[i_849_]
						       * 255.0F) << 24
						| (class101.anInt1206
						   * 1046269871)),
					       (byte) 94)),
					     (Class308.method5654
					      (class128.anIntArray1507[i_850_],
					       ((int) (fs_764_[i_850_]
						       * 255.0F) << 24
						| (class101.anInt1206
						   * 1046269871)),
					       (byte) 36)));
					class119.anInt1447 = 0;
				    }
				} else if (bool_857_) {
				    int i_859_ = -16777216;
				    if (method15439(class186.aByte2067))
					i_859_ = -1694498816;
				    class119.method2166
					(true, true, false, f_853_, f_854_,
					 f_855_, f, f_851_, f_852_,
					 fs_762_[i_848_], fs_762_[i_849_],
					 fs_762_[i_850_], fs_763_[i_848_],
					 fs_763_[i_849_], fs_763_[i_850_],
					 ((float) (class128.aShortArray1506
						   [i_848_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1506
						   [i_849_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1506
						   [i_850_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1510
						   [i_848_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1510
						   [i_849_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1510
						   [i_850_])
					  / (float) (anInt1702 * 127780559)),
					 i_859_ | (class128.anIntArray1507
						   [i_848_]) & 0xffffff,
					 i_859_ | (class128.anIntArray1507
						   [i_849_]) & 0xffffff,
					 i_859_ | (class128.anIntArray1507
						   [i_850_]) & 0xffffff,
					 0, 0.0F, 0.0F, 0.0F,
					 (class128.aShortArray1513[i_847_]
					  & 0xffff));
				} else if ((class128.anIntArray1507[i_848_]
					    & 0xffffff)
					   != 0) {
				    class119.method2141
					(true, true, false, f_853_, f_854_,
					 f_855_, f, f_851_, f_852_,
					 fs_762_[i_848_], fs_762_[i_849_],
					 fs_762_[i_850_],
					 class128.anIntArray1507[i_848_],
					 class128.anIntArray1507[i_849_],
					 class128.anIntArray1507[i_850_]);
				    class119.anInt1447 = 0;
				}
			    } else
				class119.method2137(true, true, false, f_853_,
						    f_854_, f_855_, f, f_851_,
						    f_852_, fs_762_[i_848_],
						    fs_762_[i_849_],
						    fs_762_[i_850_],
						    (class101.anInt1206
						     * 1046269871));
			}
		    }
		} else {
		    for (int i_860_ = 0; i_860_ < class128.aShort1511;
			 i_860_++) {
			int i_861_ = i_860_ * 3;
			int i_862_ = i_861_ + 1;
			int i_863_ = i_862_ + 1;
			float f = fs[i_861_];
			float f_864_ = fs[i_862_];
			float f_865_ = fs[i_863_];
			float f_866_ = fs_761_[i_861_];
			float f_867_ = fs_761_[i_862_];
			float f_868_ = fs_761_[i_863_];
			float f_869_ = (fs_764_[i_861_] + fs_764_[i_862_]
					+ fs_764_[i_863_]);
			if (((f - f_864_) * (f_868_ - f_867_)
			     - (f_866_ - f_867_) * (f_865_ - f_864_))
			    > 0.0F) {
			    class119.aBool1422
				= (f < 0.0F || f_864_ < 0.0F || f_865_ < 0.0F
				   || f > (float) class119.anInt1448
				   || f_864_ > (float) class119.anInt1448
				   || f_865_ > (float) class119.anInt1448);
			    if (f_869_ < 3.0F) {
				if (f_869_ > 0.0F) {
				    if ((class128.anIntArray1507[i_861_]
					 & 0xffffff)
					!= 0)
					class119.method2141
					    (true, true, false, f_866_, f_867_,
					     f_868_, f, f_864_, f_865_,
					     fs_762_[i_861_], fs_762_[i_862_],
					     fs_762_[i_863_],
					     (Class69.method1396
					      (class128.anIntArray1507[i_861_],
					       class101.anInt1206 * 1046269871,
					       fs_764_[i_861_] * 255.0F,
					       (byte) -81)),
					     (Class69.method1396
					      (class128.anIntArray1507[i_862_],
					       class101.anInt1206 * 1046269871,
					       fs_764_[i_862_] * 255.0F,
					       (byte) 14)),
					     (Class69.method1396
					      (class128.anIntArray1507[i_863_],
					       class101.anInt1206 * 1046269871,
					       fs_764_[i_863_] * 255.0F,
					       (byte) 85)));
				} else if ((class128.anIntArray1507[i_861_]
					    & 0xffffff)
					   != 0)
				    class119.method2141
					(true, true, false, f_866_, f_867_,
					 f_868_, f, f_864_, f_865_,
					 fs_762_[i_861_], fs_762_[i_862_],
					 fs_762_[i_863_],
					 class128.anIntArray1507[i_861_],
					 class128.anIntArray1507[i_862_],
					 class128.anIntArray1507[i_863_]);
			    } else
				class119.method2137(true, true, false, f_866_,
						    f_867_, f_868_, f, f_864_,
						    f_865_, fs_762_[i_861_],
						    fs_762_[i_862_],
						    fs_762_[i_863_],
						    (class101.anInt1206
						     * 1046269871));
			}
		    }
		}
	    }
	}
    }
    
    public void method2494(int i, int i_870_, int[] is, int[] is_871_,
			   int[] is_872_, int[] is_873_, int[] is_874_,
			   int[] is_875_, int[] is_876_, int[] is_877_,
			   int[] is_878_, int[] is_879_, int[] is_880_,
			   Class166 class166, boolean bool) {
	if (aClass139ArrayArray9737 == null) {
	    aClass139ArrayArray9737 = (new Class139[anInt1701 * -1924295585]
				       [anInt1700 * -1466328823]);
	    aClass109ArrayArray9738 = (new Class109[anInt1701 * -1924295585]
				       [anInt1700 * -1466328823]);
	} else if (aClass121ArrayArray9739 != null
		   || aClass120ArrayArray9741 != null)
	    throw new IllegalStateException();
	boolean bool_881_ = false;
	if (is_877_.length == 2 && is_874_.length == 2
	    && (is_877_[0] == is_877_[1]
		|| is_879_[0] != -1 && is_879_[0] == is_879_[1])) {
	    bool_881_ = true;
	    for (int i_882_ = 1; i_882_ < 2; i_882_++) {
		int i_883_ = is[is_874_[i_882_]];
		int i_884_ = is_872_[is_874_[i_882_]];
		if (i_883_ != 0 && i_883_ != anInt1702 * 127780559
		    || i_884_ != 0 && i_884_ != anInt1702 * 127780559) {
		    bool_881_ = false;
		    break;
		}
	    }
	}
	if (!bool_881_) {
	    Class109 class109 = new Class109();
	    short i_885_ = (short) is.length;
	    int i_886_ = (short) is_877_.length;
	    class109.aShort1330 = i_885_;
	    class109.aShortArray1339 = new short[i_885_];
	    class109.aShortArray1332 = new short[i_885_];
	    class109.aShortArray1333 = new short[i_885_];
	    class109.aShortArray1334 = new short[i_885_];
	    for (int i_887_ = 0; i_887_ < i_885_; i_887_++) {
		int i_888_ = is[i_887_];
		int i_889_ = is_872_[i_887_];
		if (i_888_ == 0 && i_889_ == 0)
		    class109.aShortArray1339[i_887_]
			= (short) (aByteArrayArray9743[i][i_870_]
				   - aByteArrayArray9759[i][i_870_]);
		else if (i_888_ == 0 && i_889_ == anInt1702 * 127780559)
		    class109.aShortArray1339[i_887_]
			= (short) (aByteArrayArray9743[i][i_870_ + 1]
				   - aByteArrayArray9759[i][i_870_ + 1]);
		else if (i_888_ == anInt1702 * 127780559
			 && i_889_ == anInt1702 * 127780559)
		    class109.aShortArray1339[i_887_]
			= (short) (aByteArrayArray9743[i + 1][i_870_ + 1]
				   - aByteArrayArray9759[i + 1][i_870_ + 1]);
		else if (i_888_ == anInt1702 * 127780559 && i_889_ == 0)
		    class109.aShortArray1339[i_887_]
			= (short) (aByteArrayArray9743[i + 1][i_870_]
				   - aByteArrayArray9759[i + 1][i_870_]);
		else {
		    int i_890_
			= (((aByteArrayArray9743[i][i_870_]
			     - aByteArrayArray9759[i][i_870_])
			    * (anInt1702 * 127780559 - i_888_))
			   + (aByteArrayArray9743[i + 1][i_870_]
			      - aByteArrayArray9759[i + 1][i_870_]) * i_888_);
		    int i_891_ = (((aByteArrayArray9743[i][i_870_ + 1]
				    - aByteArrayArray9759[i][i_870_ + 1])
				   * (anInt1702 * 127780559 - i_888_))
				  + ((aByteArrayArray9743[i + 1][i_870_ + 1]
				      - aByteArrayArray9759[i + 1][i_870_ + 1])
				     * i_888_));
		    class109.aShortArray1339[i_887_]
			= (short) ((i_890_ * (anInt1702 * 127780559 - i_889_)
				    + i_891_ * i_889_)
				   >> anInt1703 * 1304764278);
		}
		int i_892_ = (i << anInt1703 * -1495101509) + i_888_;
		int i_893_ = (i_870_ << anInt1703 * -1495101509) + i_889_;
		class109.aShortArray1332[i_887_] = (short) i_888_;
		class109.aShortArray1334[i_887_] = (short) i_889_;
		class109.aShortArray1333[i_887_]
		    = (short) (method2498(i_892_, i_893_, 2051573424)
			       + (is_871_ != null ? is_871_[i_887_] : 0));
		if (class109.aShortArray1339[i_887_] < 2)
		    class109.aShortArray1339[i_887_] = (short) 2;
	    }
	    boolean bool_894_ = false;
	    int i_895_ = 0;
	    for (int i_896_ = 0; i_896_ < i_886_; i_896_++) {
		if (is_877_[i_896_] >= 0
		    || is_878_ != null && is_878_[i_896_] >= 0)
		    i_895_++;
		int i_897_ = is_879_[i_896_];
		if (i_897_ != -1) {
		    Class186 class186 = aClass185_Sub2_9735.aClass177_2012
					    .method2931(i_897_, (byte) 1);
		    if (!class186.aBool2072) {
			bool_894_ = true;
			if (method15439(class186.aByte2067)
			    || class186.aByte2047 != 0
			    || class186.aByte2048 != 0)
			    class109.aByte1331 |= 0x4;
		    }
		}
	    }
	    class109.anIntArray1341 = new int[i_895_];
	    if (is_878_ != null)
		class109.anIntArray1335 = new int[i_895_];
	    class109.aShortArray1336 = new short[i_895_];
	    class109.aShortArray1337 = new short[i_895_];
	    class109.aShortArray1338 = new short[i_895_];
	    if (bool_894_) {
		class109.aShortArray1329 = new short[i_895_];
		class109.aShortArray1340 = new short[i_895_];
	    }
	    for (int i_898_ = 0; i_898_ < i_886_; i_898_++) {
		if (is_877_[i_898_] >= 0
		    || is_878_ != null && is_878_[i_898_] >= 0) {
		    if (is_877_[i_898_] >= 0)
			class109.anIntArray1341[class109.aShort1342]
			    = Class315.method5705(is_877_[i_898_], -358861540);
		    else
			class109.anIntArray1341[class109.aShort1342] = -1;
		    if (is_878_ != null) {
			if (is_878_[i_898_] != -1)
			    class109.anIntArray1335[class109.aShort1342]
				= Class315.method5705(is_878_[i_898_],
						      1383176476);
			else
			    class109.anIntArray1335[class109.aShort1342] = -1;
		    }
		    class109.aShortArray1336[class109.aShort1342]
			= (short) is_874_[i_898_];
		    class109.aShortArray1337[class109.aShort1342]
			= (short) is_875_[i_898_];
		    class109.aShortArray1338[class109.aShort1342]
			= (short) is_876_[i_898_];
		    if (bool_894_) {
			if (is_879_[i_898_] != -1
			    && !(aClass185_Sub2_9735.aClass177_2012.method2931
				 (is_879_[i_898_], (byte) 1).aBool2072)) {
			    class109.aShortArray1329[class109.aShort1342]
				= (short) is_879_[i_898_];
			    class109.aShortArray1340[class109.aShort1342]
				= (short) is_880_[i_898_];
			} else
			    class109.aShortArray1329[class109.aShort1342]
				= (short) -1;
		    }
		    class109.aShort1342++;
		}
	    }
	    aClass109ArrayArray9738[i][i_870_] = class109;
	} else if (is_877_[0] >= 0 || is_878_ != null && is_878_[0] >= 0) {
	    Class139 class139 = new Class139();
	    int i_899_ = is_877_[0];
	    int i_900_ = is_879_[0];
	    if (is_878_ != null) {
		class139.anInt1608
		    = Class146.method2452(Class315.method5705(is_878_[0],
							      1847565347),
					  (aByteArrayArray9743[i][i_870_]
					   - aByteArrayArray9759[i][i_870_]),
					  344602903);
		if (i_899_ == -1)
		    class139.aByte1614 |= 0x2;
	    }
	    if ((anIntArrayArray1704[i][i_870_]
		 == anIntArrayArray1704[i + 1][i_870_])
		&& (anIntArrayArray1704[i][i_870_]
		    == anIntArrayArray1704[i + 1][i_870_ + 1])
		&& (anIntArrayArray1704[i][i_870_]
		    == anIntArrayArray1704[i][i_870_ + 1]))
		class139.aByte1614 |= 0x1;
	    Class186 class186 = null;
	    if (i_900_ != -1)
		class186
		    = aClass185_Sub2_9735.aClass177_2012.method2931(i_900_,
								    (byte) 1);
	    if (class186 != null && (class139.aByte1614 & 0x2) == 0
		&& !class186.aBool2072) {
		class139.aShort1609
		    = (short) (aByteArrayArray9743[i][i_870_]
			       - aByteArrayArray9759[i][i_870_]);
		class139.aShort1613
		    = (short) (aByteArrayArray9743[i + 1][i_870_]
			       - aByteArrayArray9759[i + 1][i_870_]);
		class139.aShort1611
		    = (short) (aByteArrayArray9743[i + 1][i_870_ + 1]
			       - aByteArrayArray9759[i + 1][i_870_ + 1]);
		class139.aShort1612
		    = (short) (aByteArrayArray9743[i][i_870_ + 1]
			       - aByteArrayArray9759[i][i_870_ + 1]);
		class139.aShort1610 = (short) i_900_;
		if (method15439(class186.aByte2067) || class186.aByte2047 != 0
		    || class186.aByte2048 != 0)
		    class139.aByte1614 |= 0x4;
	    } else {
		short i_901_ = Class315.method5705(i_899_, -269847065);
		class139.aShort1609
		    = (short) Class146.method2452(i_901_,
						  ((aByteArrayArray9743[i]
						    [i_870_])
						   - (aByteArrayArray9759[i]
						      [i_870_])),
						  -1064115044);
		class139.aShort1613
		    = (short) Class146.method2452(i_901_,
						  ((aByteArrayArray9743[i + 1]
						    [i_870_])
						   - (aByteArrayArray9759
						      [i + 1][i_870_])),
						  -2013709280);
		class139.aShort1611
		    = (short) Class146.method2452(i_901_,
						  ((aByteArrayArray9743[i + 1]
						    [i_870_ + 1])
						   - (aByteArrayArray9759
						      [i + 1][i_870_ + 1])),
						  -1399870171);
		class139.aShort1612
		    = (short) Class146.method2452(i_901_,
						  ((aByteArrayArray9743[i]
						    [i_870_ + 1])
						   - (aByteArrayArray9759[i]
						      [i_870_ + 1])),
						  -808878377);
		class139.aShort1610 = (short) -1;
	    }
	    aClass139ArrayArray9737[i][i_870_] = class139;
	}
    }
    
    public void method2495() {
	aByteArrayArray9743 = null;
	aByteArrayArray9759 = null;
    }
    
    void method15452(int i, int i_902_, int i_903_, int i_904_, int i_905_,
		     int i_906_, int i_907_, boolean[][] bools,
		     Class101 class101, Class119 class119, float[] fs,
		     float[] fs_908_) {
	int i_909_ = (i_907_ - i_905_) * i_903_ / 256;
	int i_910_ = i_903_ >> 8;
	boolean bool = class101.aBool1211;
	aClass185_Sub2_9735.method3461(false);
	class119.aBool1423 = false;
	class119.aBool1424 = false;
	int i_911_ = i;
	int i_912_ = i_902_ + i_909_;
	for (int i_913_ = i_904_; i_913_ < i_906_; i_913_++) {
	    for (int i_914_ = i_905_; i_914_ < i_907_; i_914_++) {
		if (bools[i_913_ - i_904_][i_914_ - i_905_]) {
		    if (aClass121ArrayArray9739 != null) {
			if (aClass121ArrayArray9739[i_913_][i_914_] != null) {
			    Class121 class121
				= aClass121ArrayArray9739[i_913_][i_914_];
			    if (class121.aShort1482 != -1
				&& (class121.aByte1475 & 0x2) == 0
				&& class121.anInt1481 == 0) {
				int i_915_ = (aClass185_Sub2_9735.method14997
					      (class121.aShort1482 & 0xffff));
				class119.method2139
				    (true, true, false,
				     (float) (i_912_ - i_910_),
				     (float) (i_912_ - i_910_), (float) i_912_,
				     (float) (i_911_ + i_910_), (float) i_911_,
				     (float) (i_911_ + i_910_), 100.0F, 100.0F,
				     100.0F,
				     (float) Class146.method2452(i_915_,
								 (class121
								  .anInt1480),
								 -1238907959),
				     (float) Class146.method2452(i_915_,
								 (class121
								  .anInt1476),
								 30305952),
				     (float) Class146.method2452(i_915_,
								 (class121
								  .anInt1474),
								 -1074221156));
				class119.method2139
				    (true, true, false, (float) i_912_,
				     (float) i_912_, (float) (i_912_ - i_910_),
				     (float) i_911_, (float) (i_911_ + i_910_),
				     (float) i_911_, 100.0F, 100.0F, 100.0F,
				     (float) Class146.method2452(i_915_,
								 (class121
								  .anInt1478),
								 124783748),
				     (float) Class146.method2452(i_915_,
								 (class121
								  .anInt1474),
								 -2066547976),
				     (float) Class146.method2452(i_915_,
								 (class121
								  .anInt1476),
								 -163486581));
			    } else if (class121.anInt1481 == 0) {
				class119.method2141(true, true, false,
						    (float) (i_912_ - i_910_),
						    (float) (i_912_ - i_910_),
						    (float) i_912_,
						    (float) (i_911_ + i_910_),
						    (float) i_911_,
						    (float) (i_911_ + i_910_),
						    100.0F, 100.0F, 100.0F,
						    class121.anInt1480,
						    class121.anInt1476,
						    class121.anInt1474);
				class119.method2141(true, true, false,
						    (float) i_912_,
						    (float) i_912_,
						    (float) (i_912_ - i_910_),
						    (float) i_911_,
						    (float) (i_911_ + i_910_),
						    (float) i_911_, 100.0F,
						    100.0F, 100.0F,
						    class121.anInt1478,
						    class121.anInt1474,
						    class121.anInt1476);
			    } else {
				int i_916_ = class121.anInt1481;
				class119.method2141
				    (true, true, false,
				     (float) (i_912_ - i_910_),
				     (float) (i_912_ - i_910_), (float) i_912_,
				     (float) (i_911_ + i_910_), (float) i_911_,
				     (float) (i_911_ + i_910_), 100.0F, 100.0F,
				     100.0F,
				     Class308.method5654(i_916_,
							 (class121.anInt1480
							  & ~0xffffff),
							 (byte) 81),
				     Class308.method5654(i_916_,
							 (class121.anInt1476
							  & ~0xffffff),
							 (byte) 4),
				     Class308.method5654(i_916_,
							 (class121.anInt1474
							  & ~0xffffff),
							 (byte) 25));
				class119.method2141
				    (true, true, false, (float) i_912_,
				     (float) i_912_, (float) (i_912_ - i_910_),
				     (float) i_911_, (float) (i_911_ + i_910_),
				     (float) i_911_, 100.0F, 100.0F, 100.0F,
				     Class308.method5654(i_916_,
							 (class121.anInt1478
							  & ~0xffffff),
							 (byte) 56),
				     Class308.method5654(i_916_,
							 (class121.anInt1474
							  & ~0xffffff),
							 (byte) 56),
				     Class308.method5654(i_916_,
							 (class121.anInt1476
							  & ~0xffffff),
							 (byte) 90));
			    }
			} else if (aClass128ArrayArray9740[i_913_][i_914_]
				   != null) {
			    Class128 class128
				= aClass128ArrayArray9740[i_913_][i_914_];
			    for (int i_917_ = 0; i_917_ < class128.aShort1505;
				 i_917_++) {
				fs[i_917_]
				    = (float) (i_911_
					       + ((class128.aShortArray1506
						   [i_917_])
						  * i_910_
						  / (anInt1702 * 127780559)));
				fs_908_[i_917_]
				    = (float) (i_912_
					       - ((class128.aShortArray1510
						   [i_917_])
						  * i_910_
						  / (anInt1702 * 127780559)));
			    }
			    for (int i_918_ = 0; i_918_ < class128.aShort1511;
				 i_918_++) {
				int i_919_ = i_918_ * 3;
				int i_920_ = i_919_ + 1;
				int i_921_ = i_920_ + 1;
				float f = fs[i_919_];
				float f_922_ = fs[i_920_];
				float f_923_ = fs[i_921_];
				float f_924_ = fs_908_[i_919_];
				float f_925_ = fs_908_[i_920_];
				float f_926_ = fs_908_[i_921_];
				if (class128.anIntArray1515 != null
				    && class128.anIntArray1515[i_918_] != 0
				    && (class128.aShortArray1513 == null
					|| (class128.aShortArray1513 != null
					    && (class128.aShortArray1513
						[i_918_]) == -1))) {
				    int i_927_
					= class128.anIntArray1515[i_918_];
				    class119.method2141
					(true, true, false, f_924_, f_925_,
					 f_926_, f, f_922_, f_923_, 100.0F,
					 100.0F, 100.0F,
					 (Class308.method5654
					  (i_927_,
					   (-16777216
					    - (class128.anIntArray1507[i_919_]
					       & ~0xffffff)),
					   (byte) 67)),
					 (Class308.method5654
					  (i_927_,
					   (-16777216
					    - (class128.anIntArray1507[i_920_]
					       & ~0xffffff)),
					   (byte) 15)),
					 (Class308.method5654
					  (i_927_,
					   (-16777216
					    - (class128.anIntArray1507[i_921_]
					       & ~0xffffff)),
					   (byte) 116)));
				} else if (class128.aShortArray1513 != null
					   && (class128.aShortArray1513[i_918_]
					       != -1)) {
				    int i_928_
					= (aClass185_Sub2_9735.method14997
					   (class128.aShortArray1513[i_918_]
					    & 0xffff));
				    class119.method2139(true, true, false,
							f_924_, f_925_, f_926_,
							f, f_922_, f_923_,
							100.0F, 100.0F, 100.0F,
							(float) i_928_,
							(float) i_928_,
							(float) i_928_);
				} else
				    class119.method2141
					(true, true, false, f_924_, f_925_,
					 f_926_, f, f_922_, f_923_, 100.0F,
					 100.0F, 100.0F,
					 class128.anIntArray1507[i_919_],
					 class128.anIntArray1507[i_920_],
					 class128.anIntArray1507[i_921_]);
			    }
			}
		    } else if (aClass120ArrayArray9741[i_913_][i_914_]
			       != null) {
			Class120 class120
			    = aClass120ArrayArray9741[i_913_][i_914_];
			for (int i_929_ = 0; i_929_ < class120.aShort1462;
			     i_929_++) {
			    fs[i_929_]
				= (float) (i_911_
					   + (class120.aShortArray1463[i_929_]
					      * i_910_
					      / (anInt1702 * 127780559)));
			    fs_908_[i_929_]
				= (float) (i_912_
					   - (class120.aShortArray1465[i_929_]
					      * i_910_
					      / (anInt1702 * 127780559)));
			}
			for (int i_930_ = 0; i_930_ < class120.aShort1464;
			     i_930_++) {
			    int i_931_ = i_930_ * 3;
			    int i_932_ = i_931_ + 1;
			    int i_933_ = i_932_ + 1;
			    float f = fs[i_931_];
			    float f_934_ = fs[i_932_];
			    float f_935_ = fs[i_933_];
			    float f_936_ = fs_908_[i_931_];
			    float f_937_ = fs_908_[i_932_];
			    float f_938_ = fs_908_[i_933_];
			    if (class120.anIntArray1471 != null
				&& class120.anIntArray1471[i_930_] != 0) {
				int i_939_ = class120.anIntArray1471[i_930_];
				class119.method2141(true, true, false, f_936_,
						    f_937_, f_938_, f, f_934_,
						    f_935_, 100.0F, 100.0F,
						    100.0F, i_939_, i_939_,
						    i_939_);
			    } else
				class119.method2141
				    (true, true, false, f_936_, f_937_, f_938_,
				     f, f_934_, f_935_, 100.0F, 100.0F, 100.0F,
				     class120.anIntArray1466[i_931_],
				     class120.anIntArray1466[i_932_],
				     class120.anIntArray1466[i_933_]);
			}
		    }
		}
		i_912_ -= i_910_;
	    }
	    i_912_ = i_902_ + i_909_;
	    i_911_ += i_910_;
	}
	class119.aBool1423 = true;
	aClass185_Sub2_9735.method3461(bool);
    }
    
    public Class534_Sub18_Sub16 method2522
	(int i, int i_940_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	return null;
    }
    
    public void method2511(int i, int i_941_, int i_942_) {
	i = Math.min(aByteArrayArray9759.length - 1, Math.max(0, i));
	i_941_
	    = Math.min(aByteArrayArray9759[i].length - 1, Math.max(0, i_941_));
	if (aByteArrayArray9759[i][i_941_] < i_942_)
	    aByteArrayArray9759[i][i_941_] = (byte) i_942_;
    }
    
    void method15453(int i, int i_943_, int i_944_, int i_945_, int i_946_,
		     int i_947_, int i_948_, boolean[][] bools,
		     Class101 class101, Class119 class119, float[] fs,
		     float[] fs_949_) {
	int i_950_ = (i_948_ - i_946_) * i_944_ / 256;
	int i_951_ = i_944_ >> 8;
	boolean bool = class101.aBool1211;
	aClass185_Sub2_9735.method3461(false);
	class119.aBool1423 = false;
	class119.aBool1424 = false;
	int i_952_ = i;
	int i_953_ = i_943_ + i_950_;
	for (int i_954_ = i_945_; i_954_ < i_947_; i_954_++) {
	    for (int i_955_ = i_946_; i_955_ < i_948_; i_955_++) {
		if (bools[i_954_ - i_945_][i_955_ - i_946_]) {
		    if (aClass139ArrayArray9737[i_954_][i_955_] != null) {
			Class139 class139
			    = aClass139ArrayArray9737[i_954_][i_955_];
			if (class139.aShort1610 != -1
			    && (class139.aByte1614 & 0x2) == 0
			    && class139.anInt1608 == -1) {
			    int i_956_
				= aClass185_Sub2_9735.method14997((class139
								   .aShort1610)
								  & 0xffff);
			    class119.method2139
				(true, true, false, (float) (i_953_ - i_951_),
				 (float) (i_953_ - i_951_), (float) i_953_,
				 (float) (i_952_ + i_951_), (float) i_952_,
				 (float) (i_952_ + i_951_), 100.0F, 100.0F,
				 100.0F,
				 (float) Class146.method2452(i_956_,
							     ((class139
							       .aShort1611)
							      & 0xffff),
							     -1116109134),
				 (float) Class146.method2452(i_956_,
							     ((class139
							       .aShort1612)
							      & 0xffff),
							     -851327783),
				 (float) Class146.method2452(i_956_,
							     ((class139
							       .aShort1613)
							      & 0xffff),
							     -879181978));
			    class119.method2139
				(true, true, false, (float) i_953_,
				 (float) i_953_, (float) (i_953_ - i_951_),
				 (float) i_952_, (float) (i_952_ + i_951_),
				 (float) i_952_, 100.0F, 100.0F, 100.0F,
				 (float) Class146.method2452(i_956_,
							     ((class139
							       .aShort1609)
							      & 0xffff),
							     -869149029),
				 (float) Class146.method2452(i_956_,
							     ((class139
							       .aShort1613)
							      & 0xffff),
							     -797124715),
				 (float) Class146.method2452(i_956_,
							     ((class139
							       .aShort1612)
							      & 0xffff),
							     -1463009471));
			} else if (class139.anInt1608 == -1) {
			    class119.method2139
				(true, true, false, (float) (i_953_ - i_951_),
				 (float) (i_953_ - i_951_), (float) i_953_,
				 (float) (i_952_ + i_951_), (float) i_952_,
				 (float) (i_952_ + i_951_), 100.0F, 100.0F,
				 100.0F,
				 (float) (class139.aShort1611 & 0xffff),
				 (float) (class139.aShort1612 & 0xffff),
				 (float) (class139.aShort1613 & 0xffff));
			    class119.method2139
				(true, true, false, (float) i_953_,
				 (float) i_953_, (float) (i_953_ - i_951_),
				 (float) i_952_, (float) (i_952_ + i_951_),
				 (float) i_952_, 100.0F, 100.0F, 100.0F,
				 (float) (class139.aShort1609 & 0xffff),
				 (float) (class139.aShort1613 & 0xffff),
				 (float) (class139.aShort1612 & 0xffff));
			} else {
			    int i_957_ = class139.anInt1608;
			    class119.method2139(true, true, false,
						(float) (i_953_ - i_951_),
						(float) (i_953_ - i_951_),
						(float) i_953_,
						(float) (i_952_ + i_951_),
						(float) i_952_,
						(float) (i_952_ + i_951_),
						100.0F, 100.0F, 100.0F,
						(float) i_957_, (float) i_957_,
						(float) i_957_);
			    class119.method2139(true, true, false,
						(float) i_953_, (float) i_953_,
						(float) (i_953_ - i_951_),
						(float) i_952_,
						(float) (i_952_ + i_951_),
						(float) i_952_, 100.0F, 100.0F,
						100.0F, (float) i_957_,
						(float) i_957_,
						(float) i_957_);
			}
		    } else if (aClass109ArrayArray9738[i_954_][i_955_]
			       != null) {
			Class109 class109
			    = aClass109ArrayArray9738[i_954_][i_955_];
			for (int i_958_ = 0; i_958_ < class109.aShort1330;
			     i_958_++) {
			    fs[i_958_]
				= (float) (i_952_
					   + (class109.aShortArray1332[i_958_]
					      * i_951_
					      / (anInt1702 * 127780559)));
			    fs_949_[i_958_]
				= (float) (i_953_
					   - (class109.aShortArray1334[i_958_]
					      * i_951_
					      / (anInt1702 * 127780559)));
			}
			for (int i_959_ = 0; i_959_ < class109.aShort1342;
			     i_959_++) {
			    short i_960_ = class109.aShortArray1336[i_959_];
			    short i_961_ = class109.aShortArray1337[i_959_];
			    short i_962_ = class109.aShortArray1338[i_959_];
			    float f = fs[i_960_];
			    float f_963_ = fs[i_961_];
			    float f_964_ = fs[i_962_];
			    float f_965_ = fs_949_[i_960_];
			    float f_966_ = fs_949_[i_961_];
			    float f_967_ = fs_949_[i_962_];
			    if (class109.anIntArray1335 != null
				&& class109.anIntArray1335[i_959_] != -1) {
				int i_968_ = class109.anIntArray1335[i_959_];
				class119.method2139
				    (true, true, false, f_965_, f_966_, f_967_,
				     f, f_963_, f_964_, 100.0F, 100.0F, 100.0F,
				     (float) (Class146.method2452
					      (i_968_,
					       (class109.aShortArray1339
						[i_960_]),
					       -1633471199)),
				     (float) (Class146.method2452
					      (i_968_,
					       (class109.aShortArray1339
						[i_961_]),
					       189362715)),
				     (float) (Class146.method2452
					      (i_968_,
					       (class109.aShortArray1339
						[i_962_]),
					       -1145700940)));
			    } else if (class109.aShortArray1329 != null
				       && (class109.aShortArray1329[i_959_]
					   != -1)) {
				int i_969_ = (aClass185_Sub2_9735.method14997
					      (class109.aShortArray1329[i_959_]
					       & 0xffff));
				class119.method2139
				    (true, true, false, f_965_, f_966_, f_967_,
				     f, f_963_, f_964_, 100.0F, 100.0F, 100.0F,
				     (float) (Class146.method2452
					      (i_969_,
					       (class109.aShortArray1339
						[i_960_]),
					       -1689607661)),
				     (float) (Class146.method2452
					      (i_969_,
					       (class109.aShortArray1339
						[i_961_]),
					       186267626)),
				     (float) (Class146.method2452
					      (i_969_,
					       (class109.aShortArray1339
						[i_962_]),
					       -675382863)));
			    } else {
				int i_970_ = class109.anIntArray1341[i_959_];
				class119.method2139
				    (true, true, false, f_965_, f_966_, f_967_,
				     f, f_963_, f_964_, 100.0F, 100.0F, 100.0F,
				     (float) (Class146.method2452
					      (i_970_,
					       (class109.aShortArray1339
						[i_960_]),
					       -410628432)),
				     (float) (Class146.method2452
					      (i_970_,
					       (class109.aShortArray1339
						[i_961_]),
					       95700984)),
				     (float) (Class146.method2452
					      (i_970_,
					       (class109.aShortArray1339
						[i_962_]),
					       -1710364086)));
			    }
			}
		    }
		}
		i_953_ -= i_951_;
	    }
	    i_953_ = i_943_ + i_950_;
	    i_952_ += i_951_;
	}
	class119.aBool1423 = true;
	aClass185_Sub2_9735.method3461(bool);
    }
    
    static int method15454(int i, int i_971_) {
	int i_972_ = (i & 0xff0000) * i_971_ >> 23;
	if (i_972_ < 2)
	    i_972_ = 2;
	else if (i_972_ > 253)
	    i_972_ = 253;
	int i_973_ = (i & 0xff00) * i_971_ >> 15;
	if (i_973_ < 2)
	    i_973_ = 2;
	else if (i_973_ > 253)
	    i_973_ = 253;
	int i_974_ = (i & 0xff) * i_971_ >> 7;
	if (i_974_ < 2)
	    i_974_ = 2;
	else if (i_974_ > 253)
	    i_974_ = 253;
	return i_972_ << 16 | i_973_ << 8 | i_974_;
    }
    
    public Class534_Sub18_Sub16 method2524
	(int i, int i_975_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	return null;
    }
    
    public Class534_Sub18_Sub16 method2525
	(int i, int i_976_, Class534_Sub18_Sub16 class534_sub18_sub16) {
	return null;
    }
    
    void method15455(int i, int i_977_, boolean bool, Class101 class101,
		     Class119 class119, float[] fs, float[] fs_978_,
		     float[] fs_979_, float[] fs_980_, float[] fs_981_,
		     int i_982_) {
	Class121 class121 = aClass121ArrayArray9739[i][i_977_];
	if (class121 != null) {
	    if ((class121.aByte1475 & 0x2) == 0) {
		if (i_982_ != 0) {
		    if ((class121.aByte1475 & 0x4) != 0) {
			if ((i_982_ & 0x1) != 0)
			    return;
		    } else if ((i_982_ & 0x2) != 0)
			return;
		}
		int i_983_ = i * (anInt1702 * 127780559);
		int i_984_ = i_983_ + anInt1702 * 127780559;
		int i_985_ = i_977_ * (anInt1702 * 127780559);
		int i_986_ = i_985_ + anInt1702 * 127780559;
		float f = 0.0F;
		float f_987_ = 0.0F;
		float f_988_ = 0.0F;
		float f_989_ = 0.0F;
		float f_990_;
		float f_991_;
		float f_992_;
		float f_993_;
		float f_994_;
		float f_995_;
		float f_996_;
		float f_997_;
		float f_998_;
		float f_999_;
		float f_1000_;
		float f_1001_;
		float f_1002_;
		float f_1003_;
		float f_1004_;
		float f_1005_;
		if ((class121.aByte1475 & 0x1) != 0 && !bool) {
		    int i_1006_ = anIntArrayArray1704[i][i_977_];
		    float f_1007_ = aFloat9756 * (float) i_1006_;
		    float f_1008_ = aFloat9757 * (float) i_1006_;
		    float f_1009_
			= aFloat9758 + (aFloat9744 * (float) i_983_ + f_1007_
					+ aFloat9752 * (float) i_985_);
		    f_990_
			= aFloat9748 + (aFloat9745 * (float) i_983_ + f_1008_
					+ aFloat9753 * (float) i_985_);
		    if (f_1009_ < -f_990_)
			return;
		    float f_1010_
			= aFloat9758 + (aFloat9744 * (float) i_984_ + f_1007_
					+ aFloat9752 * (float) i_985_);
		    f_991_
			= aFloat9748 + (aFloat9745 * (float) i_984_ + f_1008_
					+ aFloat9753 * (float) i_985_);
		    if (f_1010_ < -f_991_)
			return;
		    float f_1011_
			= aFloat9758 + (aFloat9744 * (float) i_984_ + f_1007_
					+ aFloat9752 * (float) i_986_);
		    f_992_
			= aFloat9748 + (aFloat9745 * (float) i_984_ + f_1008_
					+ aFloat9753 * (float) i_986_);
		    if (f_1011_ < -f_992_)
			return;
		    float f_1012_
			= aFloat9758 + (aFloat9744 * (float) i_983_ + f_1007_
					+ aFloat9752 * (float) i_986_);
		    f_993_
			= aFloat9748 + (aFloat9745 * (float) i_983_ + f_1008_
					+ aFloat9753 * (float) i_986_);
		    if (f_1012_ < -f_993_)
			return;
		    f_994_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_1009_ / f_990_);
		    f_995_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_1010_ / f_991_);
		    f_996_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_1011_ / f_992_);
		    f_997_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_1012_ / f_993_);
		    if (class101.aBool1203) {
			float f_1013_ = f_1009_ - class101.aFloat1204;
			if (f_1013_ > 0.0F) {
			    f = f_1013_ / class101.aFloat1205;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_1013_ = f_1010_ - class101.aFloat1204;
			if (f_1013_ > 0.0F) {
			    f_987_ = f_1013_ / class101.aFloat1205;
			    if (f_987_ > 1.0F)
				f_987_ = 1.0F;
			}
			f_1013_ = f_1011_ - class101.aFloat1204;
			if (f_1013_ > 0.0F) {
			    f_988_ = f_1013_ / class101.aFloat1205;
			    if (f_988_ > 1.0F)
				f_988_ = 1.0F;
			}
			f_1013_ = f_1012_ - class101.aFloat1204;
			if (f_1013_ > 0.0F) {
			    f_989_ = f_1013_ / class101.aFloat1205;
			    if (f_989_ > 1.0F)
				f_989_ = 1.0F;
			}
		    }
		    float f_1014_ = aFloat9746 * (float) i_1006_;
		    float f_1015_ = aFloat9747 * (float) i_1006_;
		    float f_1016_
			= aFloat9754 + (aFloat9742 * (float) i_983_ + f_1014_
					+ aFloat9750 * (float) i_985_);
		    f_998_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_1016_ / f_990_);
		    float f_1017_
			= aFloat9755 + (aFloat9760 * (float) i_983_ + f_1015_
					+ aFloat9749 * (float) i_985_);
		    f_999_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_1017_ / f_990_);
		    float f_1018_
			= aFloat9754 + (aFloat9742 * (float) i_984_ + f_1014_
					+ aFloat9750 * (float) i_985_);
		    f_1000_ = (class119.aFloat1429
			       + class119.aFloat1430 * f_1018_ / f_991_);
		    float f_1019_
			= aFloat9755 + (aFloat9760 * (float) i_984_ + f_1015_
					+ aFloat9749 * (float) i_985_);
		    f_1001_ = (class119.aFloat1431
			       + class119.aFloat1432 * f_1019_ / f_991_);
		    float f_1020_
			= aFloat9754 + (aFloat9742 * (float) i_984_ + f_1014_
					+ aFloat9750 * (float) i_986_);
		    f_1002_ = (class119.aFloat1429
			       + class119.aFloat1430 * f_1020_ / f_992_);
		    float f_1021_
			= aFloat9755 + (aFloat9760 * (float) i_984_ + f_1015_
					+ aFloat9749 * (float) i_986_);
		    f_1003_ = (class119.aFloat1431
			       + class119.aFloat1432 * f_1021_ / f_992_);
		    float f_1022_
			= aFloat9754 + (aFloat9742 * (float) i_983_ + f_1014_
					+ aFloat9750 * (float) i_986_);
		    f_1004_ = (class119.aFloat1429
			       + class119.aFloat1430 * f_1022_ / f_993_);
		    float f_1023_
			= aFloat9755 + (aFloat9760 * (float) i_983_ + f_1015_
					+ aFloat9749 * (float) i_986_);
		    f_1005_ = (class119.aFloat1431
			       + class119.aFloat1432 * f_1023_ / f_993_);
		} else {
		    int i_1024_ = anIntArrayArray1704[i][i_977_];
		    int i_1025_ = anIntArrayArray1704[i + 1][i_977_];
		    int i_1026_ = anIntArrayArray1704[i + 1][i_977_ + 1];
		    int i_1027_ = anIntArrayArray1704[i][i_977_ + 1];
		    float f_1028_
			= aFloat9758 + (aFloat9744 * (float) i_983_
					+ aFloat9756 * (float) i_1024_
					+ aFloat9752 * (float) i_985_);
		    f_990_ = aFloat9748 + (aFloat9745 * (float) i_983_
					   + aFloat9757 * (float) i_1024_
					   + aFloat9753 * (float) i_985_);
		    if (f_1028_ < -f_990_)
			return;
		    float f_1029_
			= aFloat9758 + (aFloat9744 * (float) i_984_
					+ aFloat9756 * (float) i_1025_
					+ aFloat9752 * (float) i_985_);
		    f_991_ = aFloat9748 + (aFloat9745 * (float) i_984_
					   + aFloat9757 * (float) i_1025_
					   + aFloat9753 * (float) i_985_);
		    if (f_1029_ < -f_991_)
			return;
		    float f_1030_
			= aFloat9758 + (aFloat9744 * (float) i_984_
					+ aFloat9756 * (float) i_1026_
					+ aFloat9752 * (float) i_986_);
		    f_992_ = aFloat9748 + (aFloat9745 * (float) i_984_
					   + aFloat9757 * (float) i_1026_
					   + aFloat9753 * (float) i_986_);
		    if (f_1030_ < -f_992_)
			return;
		    float f_1031_
			= aFloat9758 + (aFloat9744 * (float) i_983_
					+ aFloat9756 * (float) i_1027_
					+ aFloat9752 * (float) i_986_);
		    f_993_ = aFloat9748 + (aFloat9745 * (float) i_983_
					   + aFloat9757 * (float) i_1027_
					   + aFloat9753 * (float) i_986_);
		    if (f_1031_ < -f_993_)
			return;
		    f_994_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_1028_ / f_990_);
		    f_995_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_1029_ / f_991_);
		    f_996_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_1030_ / f_992_);
		    f_997_ = (class119.aFloat1433
			      + class119.aFloat1434 * f_1031_ / f_993_);
		    if (bool) {
			float f_1032_ = f_1028_ - class101.aFloat1204;
			if (f_1032_ > 0.0F) {
			    f_1032_ /= class101.aFloat1205;
			    if (f_1032_ > 1.0F)
				f_1032_ = 1.0F;
			    f = f_1032_;
			    int i_1033_ = (int) ((float) class121.aShort1477
						 * f_1032_);
			    if (i_1033_ > 0)
				i_1024_ -= i_1033_;
			}
			f_1032_ = f_1029_ - class101.aFloat1204;
			if (f_1032_ > 0.0F) {
			    f_1032_ /= class101.aFloat1205;
			    if (f_1032_ > 1.0F)
				f_1032_ = 1.0F;
			    f_987_ = f_1032_;
			    int i_1034_ = (int) ((float) class121.aShort1473
						 * f_1032_);
			    if (i_1034_ > 0)
				i_1025_ -= i_1034_;
			}
			f_1032_ = f_1030_ - class101.aFloat1204;
			if (f_1032_ > 0.0F) {
			    f_1032_ /= class101.aFloat1205;
			    if (f_1032_ > 1.0F)
				f_1032_ = 1.0F;
			    f_988_ = f_1032_;
			    int i_1035_ = (int) ((float) class121.aShort1479
						 * f_1032_);
			    if (i_1035_ > 0)
				i_1026_ -= i_1035_;
			}
			f_1032_ = f_1031_ - class101.aFloat1204;
			if (f_1032_ > 0.0F) {
			    f_1032_ /= class101.aFloat1205;
			    if (f_1032_ > 1.0F)
				f_1032_ = 1.0F;
			    f_989_ = f_1032_;
			    int i_1036_ = (int) ((float) class121.aShort1472
						 * f_1032_);
			    if (i_1036_ > 0)
				i_1027_ -= i_1036_;
			}
		    } else if (class101.aBool1203) {
			float f_1037_ = f_1028_ - class101.aFloat1204;
			if (f_1037_ > 0.0F) {
			    f = f_1037_ / class101.aFloat1205;
			    if (f > 1.0F)
				f = 1.0F;
			}
			f_1037_ = f_1029_ - class101.aFloat1204;
			if (f_1037_ > 0.0F) {
			    f_987_ = f_1037_ / class101.aFloat1205;
			    if (f_987_ > 1.0F)
				f_987_ = 1.0F;
			}
			f_1037_ = f_1030_ - class101.aFloat1204;
			if (f_1037_ > 0.0F) {
			    f_988_ = f_1037_ / class101.aFloat1205;
			    if (f_988_ > 1.0F)
				f_988_ = 1.0F;
			}
			f_1037_ = f_1031_ - class101.aFloat1204;
			if (f_1037_ > 0.0F) {
			    f_989_ = f_1037_ / class101.aFloat1205;
			    if (f_989_ > 1.0F)
				f_989_ = 1.0F;
			}
		    }
		    float f_1038_
			= aFloat9754 + (aFloat9742 * (float) i_983_
					+ aFloat9746 * (float) i_1024_
					+ aFloat9750 * (float) i_985_);
		    f_998_ = (class119.aFloat1429
			      + class119.aFloat1430 * f_1038_ / f_990_);
		    float f_1039_
			= aFloat9755 + (aFloat9760 * (float) i_983_
					+ aFloat9747 * (float) i_1024_
					+ aFloat9749 * (float) i_985_);
		    f_999_ = (class119.aFloat1431
			      + class119.aFloat1432 * f_1039_ / f_990_);
		    float f_1040_
			= aFloat9754 + (aFloat9742 * (float) i_984_
					+ aFloat9746 * (float) i_1025_
					+ aFloat9750 * (float) i_985_);
		    f_1000_ = (class119.aFloat1429
			       + class119.aFloat1430 * f_1040_ / f_991_);
		    float f_1041_
			= aFloat9755 + (aFloat9760 * (float) i_984_
					+ aFloat9747 * (float) i_1025_
					+ aFloat9749 * (float) i_985_);
		    f_1001_ = (class119.aFloat1431
			       + class119.aFloat1432 * f_1041_ / f_991_);
		    float f_1042_
			= aFloat9754 + (aFloat9742 * (float) i_984_
					+ aFloat9746 * (float) i_1026_
					+ aFloat9750 * (float) i_986_);
		    f_1002_ = (class119.aFloat1429
			       + class119.aFloat1430 * f_1042_ / f_992_);
		    float f_1043_
			= aFloat9755 + (aFloat9760 * (float) i_984_
					+ aFloat9747 * (float) i_1026_
					+ aFloat9749 * (float) i_986_);
		    f_1003_ = (class119.aFloat1431
			       + class119.aFloat1432 * f_1043_ / f_992_);
		    float f_1044_
			= aFloat9754 + (aFloat9742 * (float) i_983_
					+ aFloat9746 * (float) i_1027_
					+ aFloat9750 * (float) i_986_);
		    f_1004_ = (class119.aFloat1429
			       + class119.aFloat1430 * f_1044_ / f_993_);
		    float f_1045_
			= aFloat9755 + (aFloat9760 * (float) i_983_
					+ aFloat9747 * (float) i_1027_
					+ aFloat9749 * (float) i_986_);
		    f_1005_ = (class119.aFloat1431
			       + class119.aFloat1432 * f_1045_ / f_993_);
		}
		Class186 class186 = null;
		boolean bool_1046_ = false;
		if (class121.aShort1482 != -1) {
		    class186 = (aClass185_Sub2_9735.aClass177_2012.method2931
				(class121.aShort1482 & 0xffff, (byte) 1));
		    bool_1046_ = class186.aBool2043;
		}
		boolean bool_1047_
		    = class186 != null && method15439(class186.aByte2067);
		float f_1048_ = f_987_ + f_988_ + f_989_;
		if (((f_1002_ - f_1004_) * (f_1001_ - f_1005_)
		     - (f_1003_ - f_1005_) * (f_1000_ - f_1004_))
		    > 0.0F) {
		    class119.aBool1422
			= (f_1002_ < 0.0F || f_1004_ < 0.0F || f_1000_ < 0.0F
			   || f_1002_ > (float) class119.anInt1448
			   || f_1004_ > (float) class119.anInt1448
			   || f_1000_ > (float) class119.anInt1448);
		    if (f_1048_ < 3.0F) {
			if (f_1048_ > 0.0F) {
			    if (bool_1046_) {
				int i_1049_ = -16777216;
				if (bool_1047_)
				    i_1049_ = -1694498816;
				class119.method2166
				    (true, true, false, f_1003_, f_1005_,
				     f_1001_, f_1002_, f_1004_, f_1000_,
				     f_996_, f_997_, f_995_, f_992_, f_993_,
				     f_991_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
				     0.0F,
				     i_1049_ | class121.anInt1480 & 0xffffff,
				     i_1049_ | class121.anInt1476 & 0xffffff,
				     i_1049_ | class121.anInt1474 & 0xffffff,
				     class101.anInt1206 * 1046269871,
				     f_988_ * 255.0F, f_989_ * 255.0F,
				     f_987_ * 255.0F,
				     class121.aShort1482 & 0xffff);
			    } else {
				if (bool_1047_)
				    class119.anInt1447 = 100;
				class119.method2141
				    (true, true, false, f_1003_, f_1005_,
				     f_1001_, f_1002_, f_1004_, f_1000_,
				     f_996_, f_997_, f_995_,
				     Class308.method5654(class121.anInt1480,
							 (((int) (f_988_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 40),
				     Class308.method5654(class121.anInt1476,
							 (((int) (f_989_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 65),
				     Class308.method5654(class121.anInt1474,
							 (((int) (f_987_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 16));
				class119.anInt1447 = 0;
			    }
			} else if (bool_1046_) {
			    int i_1050_ = -16777216;
			    if (bool_1047_)
				i_1050_ = -1694498816;
			    class119.method2166
				(true, true, false, f_1003_, f_1005_, f_1001_,
				 f_1002_, f_1004_, f_1000_, f_996_, f_997_,
				 f_995_, f_992_, f_993_, f_991_, 1.0F, 0.0F,
				 1.0F, 1.0F, 1.0F, 0.0F,
				 i_1050_ | class121.anInt1480 & 0xffffff,
				 i_1050_ | class121.anInt1476 & 0xffffff,
				 i_1050_ | class121.anInt1474 & 0xffffff, 0,
				 0.0F, 0.0F, 0.0F,
				 class121.aShort1482 & 0xffff);
			} else {
			    if (bool_1047_)
				class119.anInt1447 = 100;
			    class119.method2141(true, true, false, f_1003_,
						f_1005_, f_1001_, f_1002_,
						f_1004_, f_1000_, f_996_,
						f_997_, f_995_,
						class121.anInt1480,
						class121.anInt1476,
						class121.anInt1474);
			    class119.anInt1447 = 0;
			}
		    } else
			class119.method2137(true, true, false, f_1003_,
					    f_1005_, f_1001_, f_1002_, f_1004_,
					    f_1000_, f_996_, f_997_, f_995_,
					    class101.anInt1206 * 1046269871);
		}
		f_1048_ = f + f_987_ + f_989_;
		if (((f_998_ - f_1000_) * (f_1005_ - f_1001_)
		     - (f_999_ - f_1001_) * (f_1004_ - f_1000_))
		    > 0.0F) {
		    class119.aBool1422
			= (f_998_ < 0.0F || f_1000_ < 0.0F || f_1004_ < 0.0F
			   || f_998_ > (float) class119.anInt1448
			   || f_1000_ > (float) class119.anInt1448
			   || f_1004_ > (float) class119.anInt1448);
		    if (f_1048_ < 3.0F) {
			if (bool_1047_)
			    class119.anInt1447 = -1694498816;
			if (f_1048_ > 0.0F) {
			    if (bool_1046_) {
				int i_1051_ = -16777216;
				if (bool_1047_)
				    i_1051_ = -1694498816;
				class119.method2166
				    (true, true, false, f_999_, f_1001_,
				     f_1005_, f_998_, f_1000_, f_1004_, f_994_,
				     f_995_, f_997_, f_990_, f_991_, f_993_,
				     0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				     i_1051_ | class121.anInt1478 & 0xffffff,
				     i_1051_ | class121.anInt1474 & 0xffffff,
				     i_1051_ | class121.anInt1476 & 0xffffff,
				     class101.anInt1206 * 1046269871,
				     f * 255.0F, f_987_ * 255.0F,
				     f_989_ * 255.0F,
				     class121.aShort1482 & 0xffff);
			    } else {
				if (bool_1047_)
				    class119.anInt1447 = 100;
				class119.method2141
				    (true, true, false, f_999_, f_1001_,
				     f_1005_, f_998_, f_1000_, f_1004_, f_994_,
				     f_995_, f_997_,
				     Class308.method5654(class121.anInt1478,
							 (((int) (f * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 74),
				     Class308.method5654(class121.anInt1474,
							 (((int) (f_987_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 122),
				     Class308.method5654(class121.anInt1476,
							 (((int) (f_989_
								  * 255.0F)
							   << 24)
							  | (class101.anInt1206
							     * 1046269871)),
							 (byte) 30));
				class119.anInt1447 = 0;
			    }
			} else if (bool_1046_) {
			    int i_1052_ = -16777216;
			    if (bool_1047_)
				i_1052_ = -1694498816;
			    class119.method2166
				(true, true, false, f_999_, f_1001_, f_1005_,
				 f_998_, f_1000_, f_1004_, f_994_, f_995_,
				 f_997_, f_990_, f_991_, f_993_, 0.0F, 1.0F,
				 1.0F, 0.0F, 0.0F, 1.0F,
				 i_1052_ | class121.anInt1478 & 0xffffff,
				 i_1052_ | class121.anInt1474 & 0xffffff,
				 i_1052_ | class121.anInt1476 & 0xffffff, 0,
				 0.0F, 0.0F, 0.0F,
				 class121.aShort1482 & 0xffff);
			} else {
			    if (bool_1047_)
				class119.anInt1447 = 100;
			    class119.method2141(true, true, false, f_999_,
						f_1001_, f_1005_, f_998_,
						f_1000_, f_1004_, f_994_,
						f_995_, f_997_,
						class121.anInt1478,
						class121.anInt1474,
						class121.anInt1476);
			    class119.anInt1447 = 0;
			}
		    } else
			class119.method2137(true, true, false, f_999_, f_1001_,
					    f_1005_, f_998_, f_1000_, f_1004_,
					    f_994_, f_995_, f_997_,
					    class101.anInt1206 * 1046269871);
		}
	    }
	} else {
	    Class128 class128 = aClass128ArrayArray9740[i][i_977_];
	    if (class128 != null) {
		if (i_982_ != 0) {
		    if ((class128.aByte1512 & 0x4) != 0) {
			if ((i_982_ & 0x1) != 0)
			    return;
		    } else if ((i_982_ & 0x2) != 0)
			return;
		}
		for (int i_1053_ = 0; i_1053_ < class128.aShort1505;
		     i_1053_++) {
		    int i_1054_ = (class128.aShortArray1506[i_1053_]
				   + (i << anInt1703 * -1495101509));
		    int i_1055_ = class128.aShortArray1509[i_1053_];
		    int i_1056_ = (class128.aShortArray1510[i_1053_]
				   + (i_977_ << anInt1703 * -1495101509));
		    float f = aFloat9758 + (aFloat9744 * (float) i_1054_
					    + aFloat9756 * (float) i_1055_
					    + aFloat9752 * (float) i_1056_);
		    float f_1057_
			= aFloat9748 + (aFloat9745 * (float) i_1054_
					+ aFloat9757 * (float) i_1055_
					+ aFloat9753 * (float) i_1056_);
		    if (f < -f_1057_)
			return;
		    float f_1058_ = (class119.aFloat1433
				     + class119.aFloat1434 * f / f_1057_);
		    fs_981_[i_1053_] = 0.0F;
		    if (bool) {
			float f_1059_ = f - class101.aFloat1204;
			if (f_1059_ > 0.0F) {
			    f_1059_ /= class101.aFloat1205;
			    if (f_1059_ > 1.0F)
				f_1059_ = 1.0F;
			    fs_981_[i_1053_] = f_1059_;
			    int i_1060_
				= (int) ((float) (class128.aShortArray1508
						  [i_1053_])
					 * f_1059_);
			    if (i_1060_ > 0)
				i_1055_ -= i_1060_;
			}
		    } else if (class101.aBool1203) {
			float f_1061_ = f - class101.aFloat1204;
			if (f_1061_ > 0.0F) {
			    fs_981_[i_1053_] = f_1061_ / class101.aFloat1205;
			    if (fs_981_[i_1053_] > 1.0F)
				fs_981_[i_1053_] = 1.0F;
			}
		    }
		    float f_1062_
			= aFloat9754 + (aFloat9742 * (float) i_1054_
					+ aFloat9746 * (float) i_1055_
					+ aFloat9750 * (float) i_1056_);
		    float f_1063_
			= aFloat9755 + (aFloat9760 * (float) i_1054_
					+ aFloat9747 * (float) i_1055_
					+ aFloat9749 * (float) i_1056_);
		    fs[i_1053_] = (class119.aFloat1429
				   + class119.aFloat1430 * f_1062_ / f_1057_);
		    fs_978_[i_1053_]
			= (class119.aFloat1431
			   + class119.aFloat1432 * f_1063_ / f_1057_);
		    fs_979_[i_1053_] = f_1058_;
		    fs_980_[i_1053_] = f_1057_;
		}
		if (class128.aShortArray1513 != null) {
		    for (int i_1064_ = 0; i_1064_ < class128.aShort1511;
			 i_1064_++) {
			int i_1065_ = i_1064_ * 3;
			int i_1066_ = i_1065_ + 1;
			int i_1067_ = i_1066_ + 1;
			float f = fs[i_1065_];
			float f_1068_ = fs[i_1066_];
			float f_1069_ = fs[i_1067_];
			float f_1070_ = fs_978_[i_1065_];
			float f_1071_ = fs_978_[i_1066_];
			float f_1072_ = fs_978_[i_1067_];
			float f_1073_ = (fs_981_[i_1065_] + fs_981_[i_1066_]
					 + fs_981_[i_1067_]);
			if (((f - f_1068_) * (f_1072_ - f_1071_)
			     - (f_1070_ - f_1071_) * (f_1069_ - f_1068_))
			    > 0.0F) {
			    class119.aBool1422
				= (f < 0.0F || f_1068_ < 0.0F || f_1069_ < 0.0F
				   || f > (float) class119.anInt1448
				   || f_1068_ > (float) class119.anInt1448
				   || f_1069_ > (float) class119.anInt1448);
			    Class186 class186 = null;
			    boolean bool_1074_ = false;
			    if (class128.aShortArray1513[i_1064_] != -1) {
				class186 = (aClass185_Sub2_9735
						.aClass177_2012.method2931
					    ((class128.aShortArray1513[i_1064_]
					      & 0xffff),
					     (byte) 1));
				bool_1074_ = class186.aBool2043;
			    }
			    if (f_1073_ < 3.0F) {
				if (f_1073_ > 0.0F) {
				    if (bool_1074_) {
					int i_1075_ = -16777216;
					if (method15439(class186.aByte2067))
					    i_1075_ = -1694498816;
					class119.method2166
					    (true, true, false, f_1070_,
					     f_1071_, f_1072_, f, f_1068_,
					     f_1069_, fs_979_[i_1065_],
					     fs_979_[i_1066_],
					     fs_979_[i_1067_],
					     fs_980_[i_1065_],
					     fs_980_[i_1066_],
					     fs_980_[i_1067_],
					     ((float) (class128.aShortArray1506
						       [i_1065_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1506
						       [i_1066_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1506
						       [i_1067_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1510
						       [i_1065_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1510
						       [i_1066_])
					      / (float) (anInt1702
							 * 127780559)),
					     ((float) (class128.aShortArray1510
						       [i_1067_])
					      / (float) (anInt1702
							 * 127780559)),
					     i_1075_ | (class128.anIntArray1507
							[i_1065_]) & 0xffffff,
					     i_1075_ | (class128.anIntArray1507
							[i_1066_]) & 0xffffff,
					     i_1075_ | (class128.anIntArray1507
							[i_1067_]) & 0xffffff,
					     class101.anInt1206 * 1046269871,
					     fs_981_[i_1065_] * 255.0F,
					     fs_981_[i_1066_] * 255.0F,
					     fs_981_[i_1067_] * 255.0F,
					     (class128.aShortArray1513[i_1064_]
					      & 0xffff));
				    } else if (((class128.anIntArray1507
						 [i_1065_])
						& 0xffffff)
					       != 0) {
					class119.method2141
					    (true, true, false, f_1070_,
					     f_1071_, f_1072_, f, f_1068_,
					     f_1069_, fs_979_[i_1065_],
					     fs_979_[i_1066_],
					     fs_979_[i_1067_],
					     (Class308.method5654
					      ((class128.anIntArray1507
						[i_1065_]),
					       ((int) (fs_981_[i_1065_]
						       * 255.0F) << 24
						| (class101.anInt1206
						   * 1046269871)),
					       (byte) 36)),
					     (Class308.method5654
					      ((class128.anIntArray1507
						[i_1066_]),
					       ((int) (fs_981_[i_1066_]
						       * 255.0F) << 24
						| (class101.anInt1206
						   * 1046269871)),
					       (byte) 18)),
					     (Class308.method5654
					      ((class128.anIntArray1507
						[i_1067_]),
					       ((int) (fs_981_[i_1067_]
						       * 255.0F) << 24
						| (class101.anInt1206
						   * 1046269871)),
					       (byte) 101)));
					class119.anInt1447 = 0;
				    }
				} else if (bool_1074_) {
				    int i_1076_ = -16777216;
				    if (method15439(class186.aByte2067))
					i_1076_ = -1694498816;
				    class119.method2166
					(true, true, false, f_1070_, f_1071_,
					 f_1072_, f, f_1068_, f_1069_,
					 fs_979_[i_1065_], fs_979_[i_1066_],
					 fs_979_[i_1067_], fs_980_[i_1065_],
					 fs_980_[i_1066_], fs_980_[i_1067_],
					 ((float) (class128.aShortArray1506
						   [i_1065_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1506
						   [i_1066_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1506
						   [i_1067_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1510
						   [i_1065_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1510
						   [i_1066_])
					  / (float) (anInt1702 * 127780559)),
					 ((float) (class128.aShortArray1510
						   [i_1067_])
					  / (float) (anInt1702 * 127780559)),
					 i_1076_ | (class128.anIntArray1507
						    [i_1065_]) & 0xffffff,
					 i_1076_ | (class128.anIntArray1507
						    [i_1066_]) & 0xffffff,
					 i_1076_ | (class128.anIntArray1507
						    [i_1067_]) & 0xffffff,
					 0, 0.0F, 0.0F, 0.0F,
					 (class128.aShortArray1513[i_1064_]
					  & 0xffff));
				} else if ((class128.anIntArray1507[i_1065_]
					    & 0xffffff)
					   != 0) {
				    class119.method2141
					(true, true, false, f_1070_, f_1071_,
					 f_1072_, f, f_1068_, f_1069_,
					 fs_979_[i_1065_], fs_979_[i_1066_],
					 fs_979_[i_1067_],
					 class128.anIntArray1507[i_1065_],
					 class128.anIntArray1507[i_1066_],
					 class128.anIntArray1507[i_1067_]);
				    class119.anInt1447 = 0;
				}
			    } else
				class119.method2137(true, true, false, f_1070_,
						    f_1071_, f_1072_, f,
						    f_1068_, f_1069_,
						    fs_979_[i_1065_],
						    fs_979_[i_1066_],
						    fs_979_[i_1067_],
						    (class101.anInt1206
						     * 1046269871));
			}
		    }
		} else {
		    for (int i_1077_ = 0; i_1077_ < class128.aShort1511;
			 i_1077_++) {
			int i_1078_ = i_1077_ * 3;
			int i_1079_ = i_1078_ + 1;
			int i_1080_ = i_1079_ + 1;
			float f = fs[i_1078_];
			float f_1081_ = fs[i_1079_];
			float f_1082_ = fs[i_1080_];
			float f_1083_ = fs_978_[i_1078_];
			float f_1084_ = fs_978_[i_1079_];
			float f_1085_ = fs_978_[i_1080_];
			float f_1086_ = (fs_981_[i_1078_] + fs_981_[i_1079_]
					 + fs_981_[i_1080_]);
			if (((f - f_1081_) * (f_1085_ - f_1084_)
			     - (f_1083_ - f_1084_) * (f_1082_ - f_1081_))
			    > 0.0F) {
			    class119.aBool1422
				= (f < 0.0F || f_1081_ < 0.0F || f_1082_ < 0.0F
				   || f > (float) class119.anInt1448
				   || f_1081_ > (float) class119.anInt1448
				   || f_1082_ > (float) class119.anInt1448);
			    if (f_1086_ < 3.0F) {
				if (f_1086_ > 0.0F) {
				    if ((class128.anIntArray1507[i_1078_]
					 & 0xffffff)
					!= 0)
					class119.method2141
					    (true, true, false, f_1083_,
					     f_1084_, f_1085_, f, f_1081_,
					     f_1082_, fs_979_[i_1078_],
					     fs_979_[i_1079_],
					     fs_979_[i_1080_],
					     (Class69.method1396
					      ((class128.anIntArray1507
						[i_1078_]),
					       class101.anInt1206 * 1046269871,
					       fs_981_[i_1078_] * 255.0F,
					       (byte) -6)),
					     (Class69.method1396
					      ((class128.anIntArray1507
						[i_1079_]),
					       class101.anInt1206 * 1046269871,
					       fs_981_[i_1079_] * 255.0F,
					       (byte) -105)),
					     (Class69.method1396
					      ((class128.anIntArray1507
						[i_1080_]),
					       class101.anInt1206 * 1046269871,
					       fs_981_[i_1080_] * 255.0F,
					       (byte) 22)));
				} else if ((class128.anIntArray1507[i_1078_]
					    & 0xffffff)
					   != 0)
				    class119.method2141
					(true, true, false, f_1083_, f_1084_,
					 f_1085_, f, f_1081_, f_1082_,
					 fs_979_[i_1078_], fs_979_[i_1079_],
					 fs_979_[i_1080_],
					 class128.anIntArray1507[i_1078_],
					 class128.anIntArray1507[i_1079_],
					 class128.anIntArray1507[i_1080_]);
			    } else
				class119.method2137(true, true, false, f_1083_,
						    f_1084_, f_1085_, f,
						    f_1081_, f_1082_,
						    fs_979_[i_1078_],
						    fs_979_[i_1079_],
						    fs_979_[i_1080_],
						    (class101.anInt1206
						     * 1046269871));
			}
		    }
		}
	    }
	}
    }
    
    public void method2518(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_1087_, int i_1088_, int i_1089_,
			   boolean bool) {
	/* empty */
    }
    
    public void method2505(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_1090_, int i_1091_, int i_1092_,
			   boolean bool) {
	/* empty */
    }
    
    public void method2529(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_1093_, int i_1094_, int i_1095_,
			   boolean bool) {
	/* empty */
    }
    
    void method15456(int i, int i_1096_, int i_1097_, int i_1098_, int i_1099_,
		     int i_1100_, int i_1101_, boolean[][] bools,
		     Class101 class101, Class119 class119, float[] fs,
		     float[] fs_1102_) {
	int i_1103_ = (i_1101_ - i_1099_) * i_1097_ / 256;
	int i_1104_ = i_1097_ >> 8;
	boolean bool = class101.aBool1211;
	aClass185_Sub2_9735.method3461(false);
	class119.aBool1423 = false;
	class119.aBool1424 = false;
	int i_1105_ = i;
	int i_1106_ = i_1096_ + i_1103_;
	for (int i_1107_ = i_1098_; i_1107_ < i_1100_; i_1107_++) {
	    for (int i_1108_ = i_1099_; i_1108_ < i_1101_; i_1108_++) {
		if (bools[i_1107_ - i_1098_][i_1108_ - i_1099_]) {
		    if (aClass121ArrayArray9739 != null) {
			if (aClass121ArrayArray9739[i_1107_][i_1108_]
			    != null) {
			    Class121 class121
				= aClass121ArrayArray9739[i_1107_][i_1108_];
			    if (class121.aShort1482 != -1
				&& (class121.aByte1475 & 0x2) == 0
				&& class121.anInt1481 == 0) {
				int i_1109_ = (aClass185_Sub2_9735.method14997
					       (class121.aShort1482 & 0xffff));
				class119.method2139
				    (true, true, false,
				     (float) (i_1106_ - i_1104_),
				     (float) (i_1106_ - i_1104_),
				     (float) i_1106_,
				     (float) (i_1105_ + i_1104_),
				     (float) i_1105_,
				     (float) (i_1105_ + i_1104_), 100.0F,
				     100.0F, 100.0F,
				     (float) Class146.method2452(i_1109_,
								 (class121
								  .anInt1480),
								 -1090727732),
				     (float) Class146.method2452(i_1109_,
								 (class121
								  .anInt1476),
								 -801980),
				     (float) Class146.method2452(i_1109_,
								 (class121
								  .anInt1474),
								 -272052899));
				class119.method2139
				    (true, true, false, (float) i_1106_,
				     (float) i_1106_,
				     (float) (i_1106_ - i_1104_),
				     (float) i_1105_,
				     (float) (i_1105_ + i_1104_),
				     (float) i_1105_, 100.0F, 100.0F, 100.0F,
				     (float) Class146.method2452(i_1109_,
								 (class121
								  .anInt1478),
								 264211431),
				     (float) Class146.method2452(i_1109_,
								 (class121
								  .anInt1474),
								 -2143098084),
				     (float) Class146.method2452(i_1109_,
								 (class121
								  .anInt1476),
								 -1403497529));
			    } else if (class121.anInt1481 == 0) {
				class119.method2141
				    (true, true, false,
				     (float) (i_1106_ - i_1104_),
				     (float) (i_1106_ - i_1104_),
				     (float) i_1106_,
				     (float) (i_1105_ + i_1104_),
				     (float) i_1105_,
				     (float) (i_1105_ + i_1104_), 100.0F,
				     100.0F, 100.0F, class121.anInt1480,
				     class121.anInt1476, class121.anInt1474);
				class119.method2141(true, true, false,
						    (float) i_1106_,
						    (float) i_1106_,
						    (float) (i_1106_
							     - i_1104_),
						    (float) i_1105_,
						    (float) (i_1105_
							     + i_1104_),
						    (float) i_1105_, 100.0F,
						    100.0F, 100.0F,
						    class121.anInt1478,
						    class121.anInt1474,
						    class121.anInt1476);
			    } else {
				int i_1110_ = class121.anInt1481;
				class119.method2141
				    (true, true, false,
				     (float) (i_1106_ - i_1104_),
				     (float) (i_1106_ - i_1104_),
				     (float) i_1106_,
				     (float) (i_1105_ + i_1104_),
				     (float) i_1105_,
				     (float) (i_1105_ + i_1104_), 100.0F,
				     100.0F, 100.0F,
				     Class308.method5654(i_1110_,
							 (class121.anInt1480
							  & ~0xffffff),
							 (byte) 49),
				     Class308.method5654(i_1110_,
							 (class121.anInt1476
							  & ~0xffffff),
							 (byte) 37),
				     Class308.method5654(i_1110_,
							 (class121.anInt1474
							  & ~0xffffff),
							 (byte) 2));
				class119.method2141
				    (true, true, false, (float) i_1106_,
				     (float) i_1106_,
				     (float) (i_1106_ - i_1104_),
				     (float) i_1105_,
				     (float) (i_1105_ + i_1104_),
				     (float) i_1105_, 100.0F, 100.0F, 100.0F,
				     Class308.method5654(i_1110_,
							 (class121.anInt1478
							  & ~0xffffff),
							 (byte) 126),
				     Class308.method5654(i_1110_,
							 (class121.anInt1474
							  & ~0xffffff),
							 (byte) 102),
				     Class308.method5654(i_1110_,
							 (class121.anInt1476
							  & ~0xffffff),
							 (byte) 32));
			    }
			} else if (aClass128ArrayArray9740[i_1107_][i_1108_]
				   != null) {
			    Class128 class128
				= aClass128ArrayArray9740[i_1107_][i_1108_];
			    for (int i_1111_ = 0;
				 i_1111_ < class128.aShort1505; i_1111_++) {
				fs[i_1111_]
				    = (float) (i_1105_
					       + ((class128.aShortArray1506
						   [i_1111_])
						  * i_1104_
						  / (anInt1702 * 127780559)));
				fs_1102_[i_1111_]
				    = (float) (i_1106_
					       - ((class128.aShortArray1510
						   [i_1111_])
						  * i_1104_
						  / (anInt1702 * 127780559)));
			    }
			    for (int i_1112_ = 0;
				 i_1112_ < class128.aShort1511; i_1112_++) {
				int i_1113_ = i_1112_ * 3;
				int i_1114_ = i_1113_ + 1;
				int i_1115_ = i_1114_ + 1;
				float f = fs[i_1113_];
				float f_1116_ = fs[i_1114_];
				float f_1117_ = fs[i_1115_];
				float f_1118_ = fs_1102_[i_1113_];
				float f_1119_ = fs_1102_[i_1114_];
				float f_1120_ = fs_1102_[i_1115_];
				if (class128.anIntArray1515 != null
				    && class128.anIntArray1515[i_1112_] != 0
				    && (class128.aShortArray1513 == null
					|| (class128.aShortArray1513 != null
					    && (class128.aShortArray1513
						[i_1112_]) == -1))) {
				    int i_1121_
					= class128.anIntArray1515[i_1112_];
				    class119.method2141
					(true, true, false, f_1118_, f_1119_,
					 f_1120_, f, f_1116_, f_1117_, 100.0F,
					 100.0F, 100.0F,
					 (Class308.method5654
					  (i_1121_,
					   (-16777216
					    - (class128.anIntArray1507[i_1113_]
					       & ~0xffffff)),
					   (byte) 39)),
					 (Class308.method5654
					  (i_1121_,
					   (-16777216
					    - (class128.anIntArray1507[i_1114_]
					       & ~0xffffff)),
					   (byte) 63)),
					 (Class308.method5654
					  (i_1121_,
					   (-16777216
					    - (class128.anIntArray1507[i_1115_]
					       & ~0xffffff)),
					   (byte) 28)));
				} else if (class128.aShortArray1513 != null
					   && (class128.aShortArray1513
					       [i_1112_]) != -1) {
				    int i_1122_
					= (aClass185_Sub2_9735.method14997
					   (class128.aShortArray1513[i_1112_]
					    & 0xffff));
				    class119.method2139(true, true, false,
							f_1118_, f_1119_,
							f_1120_, f, f_1116_,
							f_1117_, 100.0F,
							100.0F, 100.0F,
							(float) i_1122_,
							(float) i_1122_,
							(float) i_1122_);
				} else
				    class119.method2141
					(true, true, false, f_1118_, f_1119_,
					 f_1120_, f, f_1116_, f_1117_, 100.0F,
					 100.0F, 100.0F,
					 class128.anIntArray1507[i_1113_],
					 class128.anIntArray1507[i_1114_],
					 class128.anIntArray1507[i_1115_]);
			    }
			}
		    } else if (aClass120ArrayArray9741[i_1107_][i_1108_]
			       != null) {
			Class120 class120
			    = aClass120ArrayArray9741[i_1107_][i_1108_];
			for (int i_1123_ = 0; i_1123_ < class120.aShort1462;
			     i_1123_++) {
			    fs[i_1123_]
				= (float) (i_1105_
					   + (class120.aShortArray1463[i_1123_]
					      * i_1104_
					      / (anInt1702 * 127780559)));
			    fs_1102_[i_1123_]
				= (float) (i_1106_
					   - (class120.aShortArray1465[i_1123_]
					      * i_1104_
					      / (anInt1702 * 127780559)));
			}
			for (int i_1124_ = 0; i_1124_ < class120.aShort1464;
			     i_1124_++) {
			    int i_1125_ = i_1124_ * 3;
			    int i_1126_ = i_1125_ + 1;
			    int i_1127_ = i_1126_ + 1;
			    float f = fs[i_1125_];
			    float f_1128_ = fs[i_1126_];
			    float f_1129_ = fs[i_1127_];
			    float f_1130_ = fs_1102_[i_1125_];
			    float f_1131_ = fs_1102_[i_1126_];
			    float f_1132_ = fs_1102_[i_1127_];
			    if (class120.anIntArray1471 != null
				&& class120.anIntArray1471[i_1124_] != 0) {
				int i_1133_ = class120.anIntArray1471[i_1124_];
				class119.method2141(true, true, false, f_1130_,
						    f_1131_, f_1132_, f,
						    f_1128_, f_1129_, 100.0F,
						    100.0F, 100.0F, i_1133_,
						    i_1133_, i_1133_);
			    } else
				class119.method2141
				    (true, true, false, f_1130_, f_1131_,
				     f_1132_, f, f_1128_, f_1129_, 100.0F,
				     100.0F, 100.0F,
				     class120.anIntArray1466[i_1125_],
				     class120.anIntArray1466[i_1126_],
				     class120.anIntArray1466[i_1127_]);
			}
		    }
		}
		i_1106_ -= i_1104_;
	    }
	    i_1106_ = i_1096_ + i_1103_;
	    i_1105_ += i_1104_;
	}
	class119.aBool1423 = true;
	aClass185_Sub2_9735.method3461(bool);
    }
    
    Class151_Sub3(Class185_Sub2 class185_sub2, int i, int i_1134_, int i_1135_,
		  int i_1136_, int[][] is, int[][] is_1137_, int i_1138_) {
	super(i_1135_, i_1136_, i_1138_, is);
	aClass185_Sub2_9735 = class185_sub2;
	anInt9736 = i_1134_;
	aByteArrayArray9743 = new byte[i_1135_ + 1][i_1136_ + 1];
	int i_1139_ = aClass185_Sub2_9735.anInt9351 * -1021814047 >> 9;
	for (int i_1140_ = 1; i_1140_ < i_1136_; i_1140_++) {
	    for (int i_1141_ = 1; i_1141_ < i_1135_; i_1141_++) {
		int i_1142_ = i_1139_;
		int i_1143_ = (is_1137_[i_1141_ + 1][i_1140_]
			       - is_1137_[i_1141_ - 1][i_1140_]);
		int i_1144_ = (is_1137_[i_1141_][i_1140_ + 1]
			       - is_1137_[i_1141_][i_1140_ - 1]);
		int i_1145_ = (int) Math.sqrt((double) (i_1143_ * i_1143_
							+ 512 * i_1138_
							+ i_1144_ * i_1144_));
		int i_1146_ = (i_1143_ << 8) / i_1145_;
		int i_1147_ = -512 * i_1138_ / i_1145_;
		int i_1148_ = (i_1144_ << 8) / i_1145_;
		i_1142_
		    += ((aClass185_Sub2_9735.anInt9352 * 845036313 * i_1146_
			 + aClass185_Sub2_9735.anInt9347 * 1141856477 * i_1147_
			 + aClass185_Sub2_9735.anInt9348 * 568046319 * i_1148_)
			>> 17);
		i_1142_ >>= 1;
		if (i_1142_ < 2)
		    i_1142_ = 2;
		else if (i_1142_ > 126)
		    i_1142_ = 126;
		aByteArrayArray9743[i_1141_][i_1140_] = (byte) i_1142_;
	    }
	}
	aByteArrayArray9759 = new byte[i_1135_ + 1][i_1136_ + 1];
    }
    
    public void method2532(Class534_Sub18_Sub16 class534_sub18_sub16, int i,
			   int i_1149_, int i_1150_, int i_1151_,
			   boolean bool) {
	/* empty */
    }
    
    void method15457(int i, int i_1152_, int i_1153_, int i_1154_, int i_1155_,
		     int i_1156_, int i_1157_, boolean[][] bools,
		     Class101 class101, Class119 class119, float[] fs,
		     float[] fs_1158_) {
	int i_1159_ = (i_1157_ - i_1155_) * i_1153_ / 256;
	int i_1160_ = i_1153_ >> 8;
	boolean bool = class101.aBool1211;
	aClass185_Sub2_9735.method3461(false);
	class119.aBool1423 = false;
	class119.aBool1424 = false;
	int i_1161_ = i;
	int i_1162_ = i_1152_ + i_1159_;
	for (int i_1163_ = i_1154_; i_1163_ < i_1156_; i_1163_++) {
	    for (int i_1164_ = i_1155_; i_1164_ < i_1157_; i_1164_++) {
		if (bools[i_1163_ - i_1154_][i_1164_ - i_1155_]) {
		    if (aClass139ArrayArray9737[i_1163_][i_1164_] != null) {
			Class139 class139
			    = aClass139ArrayArray9737[i_1163_][i_1164_];
			if (class139.aShort1610 != -1
			    && (class139.aByte1614 & 0x2) == 0
			    && class139.anInt1608 == -1) {
			    int i_1165_
				= aClass185_Sub2_9735.method14997((class139
								   .aShort1610)
								  & 0xffff);
			    class119.method2139
				(true, true, false,
				 (float) (i_1162_ - i_1160_),
				 (float) (i_1162_ - i_1160_), (float) i_1162_,
				 (float) (i_1161_ + i_1160_), (float) i_1161_,
				 (float) (i_1161_ + i_1160_), 100.0F, 100.0F,
				 100.0F,
				 (float) Class146.method2452(i_1165_,
							     ((class139
							       .aShort1611)
							      & 0xffff),
							     -735577045),
				 (float) Class146.method2452(i_1165_,
							     ((class139
							       .aShort1612)
							      & 0xffff),
							     -483419954),
				 (float) Class146.method2452(i_1165_,
							     ((class139
							       .aShort1613)
							      & 0xffff),
							     -32179664));
			    class119.method2139
				(true, true, false, (float) i_1162_,
				 (float) i_1162_, (float) (i_1162_ - i_1160_),
				 (float) i_1161_, (float) (i_1161_ + i_1160_),
				 (float) i_1161_, 100.0F, 100.0F, 100.0F,
				 (float) Class146.method2452(i_1165_,
							     ((class139
							       .aShort1609)
							      & 0xffff),
							     -408889415),
				 (float) Class146.method2452(i_1165_,
							     ((class139
							       .aShort1613)
							      & 0xffff),
							     273635852),
				 (float) Class146.method2452(i_1165_,
							     ((class139
							       .aShort1612)
							      & 0xffff),
							     -332180139));
			} else if (class139.anInt1608 == -1) {
			    class119.method2139(true, true, false,
						(float) (i_1162_ - i_1160_),
						(float) (i_1162_ - i_1160_),
						(float) i_1162_,
						(float) (i_1161_ + i_1160_),
						(float) i_1161_,
						(float) (i_1161_ + i_1160_),
						100.0F, 100.0F, 100.0F,
						(float) (class139.aShort1611
							 & 0xffff),
						(float) (class139.aShort1612
							 & 0xffff),
						(float) (class139.aShort1613
							 & 0xffff));
			    class119.method2139
				(true, true, false, (float) i_1162_,
				 (float) i_1162_, (float) (i_1162_ - i_1160_),
				 (float) i_1161_, (float) (i_1161_ + i_1160_),
				 (float) i_1161_, 100.0F, 100.0F, 100.0F,
				 (float) (class139.aShort1609 & 0xffff),
				 (float) (class139.aShort1613 & 0xffff),
				 (float) (class139.aShort1612 & 0xffff));
			} else {
			    int i_1166_ = class139.anInt1608;
			    class119.method2139(true, true, false,
						(float) (i_1162_ - i_1160_),
						(float) (i_1162_ - i_1160_),
						(float) i_1162_,
						(float) (i_1161_ + i_1160_),
						(float) i_1161_,
						(float) (i_1161_ + i_1160_),
						100.0F, 100.0F, 100.0F,
						(float) i_1166_,
						(float) i_1166_,
						(float) i_1166_);
			    class119.method2139(true, true, false,
						(float) i_1162_,
						(float) i_1162_,
						(float) (i_1162_ - i_1160_),
						(float) i_1161_,
						(float) (i_1161_ + i_1160_),
						(float) i_1161_, 100.0F,
						100.0F, 100.0F,
						(float) i_1166_,
						(float) i_1166_,
						(float) i_1166_);
			}
		    } else if (aClass109ArrayArray9738[i_1163_][i_1164_]
			       != null) {
			Class109 class109
			    = aClass109ArrayArray9738[i_1163_][i_1164_];
			for (int i_1167_ = 0; i_1167_ < class109.aShort1330;
			     i_1167_++) {
			    fs[i_1167_]
				= (float) (i_1161_
					   + (class109.aShortArray1332[i_1167_]
					      * i_1160_
					      / (anInt1702 * 127780559)));
			    fs_1158_[i_1167_]
				= (float) (i_1162_
					   - (class109.aShortArray1334[i_1167_]
					      * i_1160_
					      / (anInt1702 * 127780559)));
			}
			for (int i_1168_ = 0; i_1168_ < class109.aShort1342;
			     i_1168_++) {
			    short i_1169_ = class109.aShortArray1336[i_1168_];
			    short i_1170_ = class109.aShortArray1337[i_1168_];
			    short i_1171_ = class109.aShortArray1338[i_1168_];
			    float f = fs[i_1169_];
			    float f_1172_ = fs[i_1170_];
			    float f_1173_ = fs[i_1171_];
			    float f_1174_ = fs_1158_[i_1169_];
			    float f_1175_ = fs_1158_[i_1170_];
			    float f_1176_ = fs_1158_[i_1171_];
			    if (class109.anIntArray1335 != null
				&& class109.anIntArray1335[i_1168_] != -1) {
				int i_1177_ = class109.anIntArray1335[i_1168_];
				class119.method2139
				    (true, true, false, f_1174_, f_1175_,
				     f_1176_, f, f_1172_, f_1173_, 100.0F,
				     100.0F, 100.0F,
				     (float) (Class146.method2452
					      (i_1177_,
					       (class109.aShortArray1339
						[i_1169_]),
					       -772059021)),
				     (float) (Class146.method2452
					      (i_1177_,
					       (class109.aShortArray1339
						[i_1170_]),
					       -773249348)),
				     (float) (Class146.method2452
					      (i_1177_,
					       (class109.aShortArray1339
						[i_1171_]),
					       -159025318)));
			    } else if (class109.aShortArray1329 != null
				       && (class109.aShortArray1329[i_1168_]
					   != -1)) {
				int i_1178_
				    = (aClass185_Sub2_9735.method14997
				       (class109.aShortArray1329[i_1168_]
					& 0xffff));
				class119.method2139
				    (true, true, false, f_1174_, f_1175_,
				     f_1176_, f, f_1172_, f_1173_, 100.0F,
				     100.0F, 100.0F,
				     (float) (Class146.method2452
					      (i_1178_,
					       (class109.aShortArray1339
						[i_1169_]),
					       -457712845)),
				     (float) (Class146.method2452
					      (i_1178_,
					       (class109.aShortArray1339
						[i_1170_]),
					       318652845)),
				     (float) (Class146.method2452
					      (i_1178_,
					       (class109.aShortArray1339
						[i_1171_]),
					       -1477386834)));
			    } else {
				int i_1179_ = class109.anIntArray1341[i_1168_];
				class119.method2139
				    (true, true, false, f_1174_, f_1175_,
				     f_1176_, f, f_1172_, f_1173_, 100.0F,
				     100.0F, 100.0F,
				     (float) (Class146.method2452
					      (i_1179_,
					       (class109.aShortArray1339
						[i_1169_]),
					       -1556600460)),
				     (float) (Class146.method2452
					      (i_1179_,
					       (class109.aShortArray1339
						[i_1170_]),
					       -487928198)),
				     (float) (Class146.method2452
					      (i_1179_,
					       (class109.aShortArray1339
						[i_1171_]),
					       47976820)));
			    }
			}
		    }
		}
		i_1162_ -= i_1160_;
	    }
	    i_1162_ = i_1152_ + i_1159_;
	    i_1161_ += i_1160_;
	}
	class119.aBool1423 = true;
	aClass185_Sub2_9735.method3461(bool);
    }
}
