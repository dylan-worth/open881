/* Class688 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class688
{
    public static void method13981(float[] fs, int i, float[] fs_0_, int i_1_,
				   int i_2_) {
	if (fs == fs_0_) {
	    if (i == i_1_)
		return;
	    if (i_1_ > i && i_1_ < i + i_2_) {
		i_2_--;
		i += i_2_;
		i_1_ += i_2_;
		i_2_ = i - i_2_;
		i_2_ += 7;
		while (i >= i_2_) {
		    fs_0_[i_1_--] = fs[i--];
		    fs_0_[i_1_--] = fs[i--];
		    fs_0_[i_1_--] = fs[i--];
		    fs_0_[i_1_--] = fs[i--];
		    fs_0_[i_1_--] = fs[i--];
		    fs_0_[i_1_--] = fs[i--];
		    fs_0_[i_1_--] = fs[i--];
		    fs_0_[i_1_--] = fs[i--];
		}
		i_2_ -= 7;
		while (i >= i_2_)
		    fs_0_[i_1_--] = fs[i--];
		return;
	    }
	}
	i_2_ += i;
	i_2_ -= 7;
	while (i < i_2_) {
	    fs_0_[i_1_++] = fs[i++];
	    fs_0_[i_1_++] = fs[i++];
	    fs_0_[i_1_++] = fs[i++];
	    fs_0_[i_1_++] = fs[i++];
	    fs_0_[i_1_++] = fs[i++];
	    fs_0_[i_1_++] = fs[i++];
	    fs_0_[i_1_++] = fs[i++];
	    fs_0_[i_1_++] = fs[i++];
	}
	i_2_ += 7;
	while (i < i_2_)
	    fs_0_[i_1_++] = fs[i++];
    }
    
    static void method13982(byte[] is, int i, byte[] is_3_, int i_4_,
			    int i_5_) {
	if (is == is_3_) {
	    if (i == i_4_)
		return;
	    if (i_4_ > i && i_4_ < i + i_5_) {
		i_5_--;
		i += i_5_;
		i_4_ += i_5_;
		i_5_ = i - i_5_;
		i_5_ += 7;
		while (i >= i_5_) {
		    is_3_[i_4_--] = is[i--];
		    is_3_[i_4_--] = is[i--];
		    is_3_[i_4_--] = is[i--];
		    is_3_[i_4_--] = is[i--];
		    is_3_[i_4_--] = is[i--];
		    is_3_[i_4_--] = is[i--];
		    is_3_[i_4_--] = is[i--];
		    is_3_[i_4_--] = is[i--];
		}
		i_5_ -= 7;
		while (i >= i_5_)
		    is_3_[i_4_--] = is[i--];
		return;
	    }
	}
	i_5_ += i;
	i_5_ -= 7;
	while (i < i_5_) {
	    is_3_[i_4_++] = is[i++];
	    is_3_[i_4_++] = is[i++];
	    is_3_[i_4_++] = is[i++];
	    is_3_[i_4_++] = is[i++];
	    is_3_[i_4_++] = is[i++];
	    is_3_[i_4_++] = is[i++];
	    is_3_[i_4_++] = is[i++];
	    is_3_[i_4_++] = is[i++];
	}
	i_5_ += 7;
	while (i < i_5_)
	    is_3_[i_4_++] = is[i++];
    }
    
    static void method13983(short[] is, int i, short[] is_6_, int i_7_,
			    int i_8_) {
	if (is == is_6_) {
	    if (i == i_7_)
		return;
	    if (i_7_ > i && i_7_ < i + i_8_) {
		i_8_--;
		i += i_8_;
		i_7_ += i_8_;
		i_8_ = i - i_8_;
		i_8_ += 7;
		while (i >= i_8_) {
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		    is_6_[i_7_--] = is[i--];
		}
		i_8_ -= 7;
		while (i >= i_8_)
		    is_6_[i_7_--] = is[i--];
		return;
	    }
	}
	i_8_ += i;
	i_8_ -= 7;
	while (i < i_8_) {
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	    is_6_[i_7_++] = is[i++];
	}
	i_8_ += 7;
	while (i < i_8_)
	    is_6_[i_7_++] = is[i++];
    }
    
    static void method13984(char[] cs, int i, char[] cs_9_, int i_10_,
			    int i_11_) {
	if (cs == cs_9_) {
	    if (i == i_10_)
		return;
	    if (i_10_ > i && i_10_ < i + i_11_) {
		i_11_--;
		i += i_11_;
		i_10_ += i_11_;
		i_11_ = i - i_11_;
		i_11_ += 7;
		while (i >= i_11_) {
		    cs_9_[i_10_--] = cs[i--];
		    cs_9_[i_10_--] = cs[i--];
		    cs_9_[i_10_--] = cs[i--];
		    cs_9_[i_10_--] = cs[i--];
		    cs_9_[i_10_--] = cs[i--];
		    cs_9_[i_10_--] = cs[i--];
		    cs_9_[i_10_--] = cs[i--];
		    cs_9_[i_10_--] = cs[i--];
		}
		i_11_ -= 7;
		while (i >= i_11_)
		    cs_9_[i_10_--] = cs[i--];
		return;
	    }
	}
	i_11_ += i;
	i_11_ -= 7;
	while (i < i_11_) {
	    cs_9_[i_10_++] = cs[i++];
	    cs_9_[i_10_++] = cs[i++];
	    cs_9_[i_10_++] = cs[i++];
	    cs_9_[i_10_++] = cs[i++];
	    cs_9_[i_10_++] = cs[i++];
	    cs_9_[i_10_++] = cs[i++];
	    cs_9_[i_10_++] = cs[i++];
	    cs_9_[i_10_++] = cs[i++];
	}
	i_11_ += 7;
	while (i < i_11_)
	    cs_9_[i_10_++] = cs[i++];
    }
    
    Class688() throws Throwable {
	throw new Error();
    }
    
    static void method13985(long[] ls, int i, long[] ls_12_, int i_13_,
			    int i_14_) {
	if (ls == ls_12_) {
	    if (i == i_13_)
		return;
	    if (i_13_ > i && i_13_ < i + i_14_) {
		i_14_--;
		i += i_14_;
		i_13_ += i_14_;
		i_14_ = i - i_14_;
		i_14_ += 3;
		while (i >= i_14_) {
		    ls_12_[i_13_--] = ls[i--];
		    ls_12_[i_13_--] = ls[i--];
		    ls_12_[i_13_--] = ls[i--];
		    ls_12_[i_13_--] = ls[i--];
		}
		i_14_ -= 3;
		while (i >= i_14_)
		    ls_12_[i_13_--] = ls[i--];
		return;
	    }
	}
	i_14_ += i;
	i_14_ -= 3;
	while (i < i_14_) {
	    ls_12_[i_13_++] = ls[i++];
	    ls_12_[i_13_++] = ls[i++];
	    ls_12_[i_13_++] = ls[i++];
	    ls_12_[i_13_++] = ls[i++];
	}
	i_14_ += 3;
	while (i < i_14_)
	    ls_12_[i_13_++] = ls[i++];
    }
    
    public static void method13986(float[] fs, int i, float[] fs_15_,
				   int i_16_, int i_17_) {
	if (fs == fs_15_) {
	    if (i == i_16_)
		return;
	    if (i_16_ > i && i_16_ < i + i_17_) {
		i_17_--;
		i += i_17_;
		i_16_ += i_17_;
		i_17_ = i - i_17_;
		i_17_ += 7;
		while (i >= i_17_) {
		    fs_15_[i_16_--] = fs[i--];
		    fs_15_[i_16_--] = fs[i--];
		    fs_15_[i_16_--] = fs[i--];
		    fs_15_[i_16_--] = fs[i--];
		    fs_15_[i_16_--] = fs[i--];
		    fs_15_[i_16_--] = fs[i--];
		    fs_15_[i_16_--] = fs[i--];
		    fs_15_[i_16_--] = fs[i--];
		}
		i_17_ -= 7;
		while (i >= i_17_)
		    fs_15_[i_16_--] = fs[i--];
		return;
	    }
	}
	i_17_ += i;
	i_17_ -= 7;
	while (i < i_17_) {
	    fs_15_[i_16_++] = fs[i++];
	    fs_15_[i_16_++] = fs[i++];
	    fs_15_[i_16_++] = fs[i++];
	    fs_15_[i_16_++] = fs[i++];
	    fs_15_[i_16_++] = fs[i++];
	    fs_15_[i_16_++] = fs[i++];
	    fs_15_[i_16_++] = fs[i++];
	    fs_15_[i_16_++] = fs[i++];
	}
	i_17_ += 7;
	while (i < i_17_)
	    fs_15_[i_16_++] = fs[i++];
    }
    
    static void method13987(double[] ds, int i, double[] ds_18_, int i_19_,
			    int i_20_) {
	if (ds == ds_18_) {
	    if (i == i_19_)
		return;
	    if (i_19_ > i && i_19_ < i + i_20_) {
		i_20_--;
		i += i_20_;
		i_19_ += i_20_;
		i_20_ = i - i_20_;
		i_20_ += 3;
		while (i >= i_20_) {
		    ds_18_[i_19_--] = ds[i--];
		    ds_18_[i_19_--] = ds[i--];
		    ds_18_[i_19_--] = ds[i--];
		    ds_18_[i_19_--] = ds[i--];
		}
		i_20_ -= 3;
		while (i >= i_20_)
		    ds_18_[i_19_--] = ds[i--];
		return;
	    }
	}
	i_20_ += i;
	i_20_ -= 3;
	while (i < i_20_) {
	    ds_18_[i_19_++] = ds[i++];
	    ds_18_[i_19_++] = ds[i++];
	    ds_18_[i_19_++] = ds[i++];
	    ds_18_[i_19_++] = ds[i++];
	}
	i_20_ += 3;
	while (i < i_20_)
	    ds_18_[i_19_++] = ds[i++];
    }
    
    static void method13988(boolean[] bools, int i, boolean[] bools_21_,
			    int i_22_, int i_23_) {
	if (bools == bools_21_) {
	    if (i == i_22_)
		return;
	    if (i_22_ > i && i_22_ < i + i_23_) {
		i_23_--;
		i += i_23_;
		i_22_ += i_23_;
		i_23_ = i - i_23_;
		i_23_ += 7;
		while (i >= i_23_) {
		    bools_21_[i_22_--] = bools[i--];
		    bools_21_[i_22_--] = bools[i--];
		    bools_21_[i_22_--] = bools[i--];
		    bools_21_[i_22_--] = bools[i--];
		    bools_21_[i_22_--] = bools[i--];
		    bools_21_[i_22_--] = bools[i--];
		    bools_21_[i_22_--] = bools[i--];
		    bools_21_[i_22_--] = bools[i--];
		}
		i_23_ -= 7;
		while (i >= i_23_)
		    bools_21_[i_22_--] = bools[i--];
		return;
	    }
	}
	i_23_ += i;
	i_23_ -= 7;
	while (i < i_23_) {
	    bools_21_[i_22_++] = bools[i++];
	    bools_21_[i_22_++] = bools[i++];
	    bools_21_[i_22_++] = bools[i++];
	    bools_21_[i_22_++] = bools[i++];
	    bools_21_[i_22_++] = bools[i++];
	    bools_21_[i_22_++] = bools[i++];
	    bools_21_[i_22_++] = bools[i++];
	    bools_21_[i_22_++] = bools[i++];
	}
	i_23_ += 7;
	while (i < i_23_)
	    bools_21_[i_22_++] = bools[i++];
    }
    
    public static void method13989
	(Object[] objects, int i, Object[] objects_24_, int i_25_, int i_26_) {
	if (objects == objects_24_) {
	    if (i == i_25_)
		return;
	    if (i_25_ > i && i_25_ < i + i_26_) {
		i_26_--;
		i += i_26_;
		i_25_ += i_26_;
		i_26_ = i - i_26_;
		i_26_ += 7;
		while (i >= i_26_) {
		    objects_24_[i_25_--] = objects[i--];
		    objects_24_[i_25_--] = objects[i--];
		    objects_24_[i_25_--] = objects[i--];
		    objects_24_[i_25_--] = objects[i--];
		    objects_24_[i_25_--] = objects[i--];
		    objects_24_[i_25_--] = objects[i--];
		    objects_24_[i_25_--] = objects[i--];
		    objects_24_[i_25_--] = objects[i--];
		}
		i_26_ -= 7;
		while (i >= i_26_)
		    objects_24_[i_25_--] = objects[i--];
		return;
	    }
	}
	i_26_ += i;
	i_26_ -= 7;
	while (i < i_26_) {
	    objects_24_[i_25_++] = objects[i++];
	    objects_24_[i_25_++] = objects[i++];
	    objects_24_[i_25_++] = objects[i++];
	    objects_24_[i_25_++] = objects[i++];
	    objects_24_[i_25_++] = objects[i++];
	    objects_24_[i_25_++] = objects[i++];
	    objects_24_[i_25_++] = objects[i++];
	    objects_24_[i_25_++] = objects[i++];
	}
	i_26_ += 7;
	while (i < i_26_)
	    objects_24_[i_25_++] = objects[i++];
    }
    
    public static void method13990(int[] is, int i, int i_27_, int i_28_) {
	i_27_ = i + i_27_ - 7;
	while (i < i_27_) {
	    is[i++] = i_28_;
	    is[i++] = i_28_;
	    is[i++] = i_28_;
	    is[i++] = i_28_;
	    is[i++] = i_28_;
	    is[i++] = i_28_;
	    is[i++] = i_28_;
	    is[i++] = i_28_;
	}
	i_27_ += 7;
	while (i < i_27_)
	    is[i++] = i_28_;
    }
    
    public static void method13991(int[] is, int i, int[] is_29_, int i_30_,
				   int i_31_) {
	if (is == is_29_) {
	    if (i == i_30_)
		return;
	    if (i_30_ > i && i_30_ < i + i_31_) {
		i_31_--;
		i += i_31_;
		i_30_ += i_31_;
		i_31_ = i - i_31_;
		i_31_ += 7;
		while (i >= i_31_) {
		    is_29_[i_30_--] = is[i--];
		    is_29_[i_30_--] = is[i--];
		    is_29_[i_30_--] = is[i--];
		    is_29_[i_30_--] = is[i--];
		    is_29_[i_30_--] = is[i--];
		    is_29_[i_30_--] = is[i--];
		    is_29_[i_30_--] = is[i--];
		    is_29_[i_30_--] = is[i--];
		}
		i_31_ -= 7;
		while (i >= i_31_)
		    is_29_[i_30_--] = is[i--];
		return;
	    }
	}
	i_31_ += i;
	i_31_ -= 7;
	while (i < i_31_) {
	    is_29_[i_30_++] = is[i++];
	    is_29_[i_30_++] = is[i++];
	    is_29_[i_30_++] = is[i++];
	    is_29_[i_30_++] = is[i++];
	    is_29_[i_30_++] = is[i++];
	    is_29_[i_30_++] = is[i++];
	    is_29_[i_30_++] = is[i++];
	    is_29_[i_30_++] = is[i++];
	}
	i_31_ += 7;
	while (i < i_31_)
	    is_29_[i_30_++] = is[i++];
    }
    
    static void method13992(boolean[] bools, int i, boolean[] bools_32_,
			    int i_33_, int i_34_) {
	if (bools == bools_32_) {
	    if (i == i_33_)
		return;
	    if (i_33_ > i && i_33_ < i + i_34_) {
		i_34_--;
		i += i_34_;
		i_33_ += i_34_;
		i_34_ = i - i_34_;
		i_34_ += 7;
		while (i >= i_34_) {
		    bools_32_[i_33_--] = bools[i--];
		    bools_32_[i_33_--] = bools[i--];
		    bools_32_[i_33_--] = bools[i--];
		    bools_32_[i_33_--] = bools[i--];
		    bools_32_[i_33_--] = bools[i--];
		    bools_32_[i_33_--] = bools[i--];
		    bools_32_[i_33_--] = bools[i--];
		    bools_32_[i_33_--] = bools[i--];
		}
		i_34_ -= 7;
		while (i >= i_34_)
		    bools_32_[i_33_--] = bools[i--];
		return;
	    }
	}
	i_34_ += i;
	i_34_ -= 7;
	while (i < i_34_) {
	    bools_32_[i_33_++] = bools[i++];
	    bools_32_[i_33_++] = bools[i++];
	    bools_32_[i_33_++] = bools[i++];
	    bools_32_[i_33_++] = bools[i++];
	    bools_32_[i_33_++] = bools[i++];
	    bools_32_[i_33_++] = bools[i++];
	    bools_32_[i_33_++] = bools[i++];
	    bools_32_[i_33_++] = bools[i++];
	}
	i_34_ += 7;
	while (i < i_34_)
	    bools_32_[i_33_++] = bools[i++];
    }
    
    static void method13993(short[] is, int i, short[] is_35_, int i_36_,
			    int i_37_) {
	if (is == is_35_) {
	    if (i == i_36_)
		return;
	    if (i_36_ > i && i_36_ < i + i_37_) {
		i_37_--;
		i += i_37_;
		i_36_ += i_37_;
		i_37_ = i - i_37_;
		i_37_ += 7;
		while (i >= i_37_) {
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		    is_35_[i_36_--] = is[i--];
		}
		i_37_ -= 7;
		while (i >= i_37_)
		    is_35_[i_36_--] = is[i--];
		return;
	    }
	}
	i_37_ += i;
	i_37_ -= 7;
	while (i < i_37_) {
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	    is_35_[i_36_++] = is[i++];
	}
	i_37_ += 7;
	while (i < i_37_)
	    is_35_[i_36_++] = is[i++];
    }
    
    static void method13994(byte[] is, int i, byte[] is_38_, int i_39_,
			    int i_40_) {
	if (is == is_38_) {
	    if (i == i_39_)
		return;
	    if (i_39_ > i && i_39_ < i + i_40_) {
		i_40_--;
		i += i_40_;
		i_39_ += i_40_;
		i_40_ = i - i_40_;
		i_40_ += 7;
		while (i >= i_40_) {
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		    is_38_[i_39_--] = is[i--];
		}
		i_40_ -= 7;
		while (i >= i_40_)
		    is_38_[i_39_--] = is[i--];
		return;
	    }
	}
	i_40_ += i;
	i_40_ -= 7;
	while (i < i_40_) {
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	    is_38_[i_39_++] = is[i++];
	}
	i_40_ += 7;
	while (i < i_40_)
	    is_38_[i_39_++] = is[i++];
    }
    
    static void method13995(short[] is, int i, short[] is_41_, int i_42_,
			    int i_43_) {
	if (is == is_41_) {
	    if (i == i_42_)
		return;
	    if (i_42_ > i && i_42_ < i + i_43_) {
		i_43_--;
		i += i_43_;
		i_42_ += i_43_;
		i_43_ = i - i_43_;
		i_43_ += 7;
		while (i >= i_43_) {
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		    is_41_[i_42_--] = is[i--];
		}
		i_43_ -= 7;
		while (i >= i_43_)
		    is_41_[i_42_--] = is[i--];
		return;
	    }
	}
	i_43_ += i;
	i_43_ -= 7;
	while (i < i_43_) {
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	    is_41_[i_42_++] = is[i++];
	}
	i_43_ += 7;
	while (i < i_43_)
	    is_41_[i_42_++] = is[i++];
    }
    
    static void method13996(char[] cs, int i, char[] cs_44_, int i_45_,
			    int i_46_) {
	if (cs == cs_44_) {
	    if (i == i_45_)
		return;
	    if (i_45_ > i && i_45_ < i + i_46_) {
		i_46_--;
		i += i_46_;
		i_45_ += i_46_;
		i_46_ = i - i_46_;
		i_46_ += 7;
		while (i >= i_46_) {
		    cs_44_[i_45_--] = cs[i--];
		    cs_44_[i_45_--] = cs[i--];
		    cs_44_[i_45_--] = cs[i--];
		    cs_44_[i_45_--] = cs[i--];
		    cs_44_[i_45_--] = cs[i--];
		    cs_44_[i_45_--] = cs[i--];
		    cs_44_[i_45_--] = cs[i--];
		    cs_44_[i_45_--] = cs[i--];
		}
		i_46_ -= 7;
		while (i >= i_46_)
		    cs_44_[i_45_--] = cs[i--];
		return;
	    }
	}
	i_46_ += i;
	i_46_ -= 7;
	while (i < i_46_) {
	    cs_44_[i_45_++] = cs[i++];
	    cs_44_[i_45_++] = cs[i++];
	    cs_44_[i_45_++] = cs[i++];
	    cs_44_[i_45_++] = cs[i++];
	    cs_44_[i_45_++] = cs[i++];
	    cs_44_[i_45_++] = cs[i++];
	    cs_44_[i_45_++] = cs[i++];
	    cs_44_[i_45_++] = cs[i++];
	}
	i_46_ += 7;
	while (i < i_46_)
	    cs_44_[i_45_++] = cs[i++];
    }
    
    static void method13997(char[] cs, int i, char[] cs_47_, int i_48_,
			    int i_49_) {
	if (cs == cs_47_) {
	    if (i == i_48_)
		return;
	    if (i_48_ > i && i_48_ < i + i_49_) {
		i_49_--;
		i += i_49_;
		i_48_ += i_49_;
		i_49_ = i - i_49_;
		i_49_ += 7;
		while (i >= i_49_) {
		    cs_47_[i_48_--] = cs[i--];
		    cs_47_[i_48_--] = cs[i--];
		    cs_47_[i_48_--] = cs[i--];
		    cs_47_[i_48_--] = cs[i--];
		    cs_47_[i_48_--] = cs[i--];
		    cs_47_[i_48_--] = cs[i--];
		    cs_47_[i_48_--] = cs[i--];
		    cs_47_[i_48_--] = cs[i--];
		}
		i_49_ -= 7;
		while (i >= i_49_)
		    cs_47_[i_48_--] = cs[i--];
		return;
	    }
	}
	i_49_ += i;
	i_49_ -= 7;
	while (i < i_49_) {
	    cs_47_[i_48_++] = cs[i++];
	    cs_47_[i_48_++] = cs[i++];
	    cs_47_[i_48_++] = cs[i++];
	    cs_47_[i_48_++] = cs[i++];
	    cs_47_[i_48_++] = cs[i++];
	    cs_47_[i_48_++] = cs[i++];
	    cs_47_[i_48_++] = cs[i++];
	    cs_47_[i_48_++] = cs[i++];
	}
	i_49_ += 7;
	while (i < i_49_)
	    cs_47_[i_48_++] = cs[i++];
    }
    
    static void method13998(char[] cs, int i, char[] cs_50_, int i_51_,
			    int i_52_) {
	if (cs == cs_50_) {
	    if (i == i_51_)
		return;
	    if (i_51_ > i && i_51_ < i + i_52_) {
		i_52_--;
		i += i_52_;
		i_51_ += i_52_;
		i_52_ = i - i_52_;
		i_52_ += 7;
		while (i >= i_52_) {
		    cs_50_[i_51_--] = cs[i--];
		    cs_50_[i_51_--] = cs[i--];
		    cs_50_[i_51_--] = cs[i--];
		    cs_50_[i_51_--] = cs[i--];
		    cs_50_[i_51_--] = cs[i--];
		    cs_50_[i_51_--] = cs[i--];
		    cs_50_[i_51_--] = cs[i--];
		    cs_50_[i_51_--] = cs[i--];
		}
		i_52_ -= 7;
		while (i >= i_52_)
		    cs_50_[i_51_--] = cs[i--];
		return;
	    }
	}
	i_52_ += i;
	i_52_ -= 7;
	while (i < i_52_) {
	    cs_50_[i_51_++] = cs[i++];
	    cs_50_[i_51_++] = cs[i++];
	    cs_50_[i_51_++] = cs[i++];
	    cs_50_[i_51_++] = cs[i++];
	    cs_50_[i_51_++] = cs[i++];
	    cs_50_[i_51_++] = cs[i++];
	    cs_50_[i_51_++] = cs[i++];
	    cs_50_[i_51_++] = cs[i++];
	}
	i_52_ += 7;
	while (i < i_52_)
	    cs_50_[i_51_++] = cs[i++];
    }
    
    public static void method13999(int[] is, int i, int[] is_53_, int i_54_,
				   int i_55_) {
	if (is == is_53_) {
	    if (i == i_54_)
		return;
	    if (i_54_ > i && i_54_ < i + i_55_) {
		i_55_--;
		i += i_55_;
		i_54_ += i_55_;
		i_55_ = i - i_55_;
		i_55_ += 7;
		while (i >= i_55_) {
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		    is_53_[i_54_--] = is[i--];
		}
		i_55_ -= 7;
		while (i >= i_55_)
		    is_53_[i_54_--] = is[i--];
		return;
	    }
	}
	i_55_ += i;
	i_55_ -= 7;
	while (i < i_55_) {
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	    is_53_[i_54_++] = is[i++];
	}
	i_55_ += 7;
	while (i < i_55_)
	    is_53_[i_54_++] = is[i++];
    }
    
    static void method14000(long[] ls, int i, long[] ls_56_, int i_57_,
			    int i_58_) {
	if (ls == ls_56_) {
	    if (i == i_57_)
		return;
	    if (i_57_ > i && i_57_ < i + i_58_) {
		i_58_--;
		i += i_58_;
		i_57_ += i_58_;
		i_58_ = i - i_58_;
		i_58_ += 3;
		while (i >= i_58_) {
		    ls_56_[i_57_--] = ls[i--];
		    ls_56_[i_57_--] = ls[i--];
		    ls_56_[i_57_--] = ls[i--];
		    ls_56_[i_57_--] = ls[i--];
		}
		i_58_ -= 3;
		while (i >= i_58_)
		    ls_56_[i_57_--] = ls[i--];
		return;
	    }
	}
	i_58_ += i;
	i_58_ -= 3;
	while (i < i_58_) {
	    ls_56_[i_57_++] = ls[i++];
	    ls_56_[i_57_++] = ls[i++];
	    ls_56_[i_57_++] = ls[i++];
	    ls_56_[i_57_++] = ls[i++];
	}
	i_58_ += 3;
	while (i < i_58_)
	    ls_56_[i_57_++] = ls[i++];
    }
    
    static void method14001(long[] ls, int i, long[] ls_59_, int i_60_,
			    int i_61_) {
	if (ls == ls_59_) {
	    if (i == i_60_)
		return;
	    if (i_60_ > i && i_60_ < i + i_61_) {
		i_61_--;
		i += i_61_;
		i_60_ += i_61_;
		i_61_ = i - i_61_;
		i_61_ += 3;
		while (i >= i_61_) {
		    ls_59_[i_60_--] = ls[i--];
		    ls_59_[i_60_--] = ls[i--];
		    ls_59_[i_60_--] = ls[i--];
		    ls_59_[i_60_--] = ls[i--];
		}
		i_61_ -= 3;
		while (i >= i_61_)
		    ls_59_[i_60_--] = ls[i--];
		return;
	    }
	}
	i_61_ += i;
	i_61_ -= 3;
	while (i < i_61_) {
	    ls_59_[i_60_++] = ls[i++];
	    ls_59_[i_60_++] = ls[i++];
	    ls_59_[i_60_++] = ls[i++];
	    ls_59_[i_60_++] = ls[i++];
	}
	i_61_ += 3;
	while (i < i_61_)
	    ls_59_[i_60_++] = ls[i++];
    }
    
    public static void method14002(float[] fs, int i, float[] fs_62_,
				   int i_63_, int i_64_) {
	if (fs == fs_62_) {
	    if (i == i_63_)
		return;
	    if (i_63_ > i && i_63_ < i + i_64_) {
		i_64_--;
		i += i_64_;
		i_63_ += i_64_;
		i_64_ = i - i_64_;
		i_64_ += 7;
		while (i >= i_64_) {
		    fs_62_[i_63_--] = fs[i--];
		    fs_62_[i_63_--] = fs[i--];
		    fs_62_[i_63_--] = fs[i--];
		    fs_62_[i_63_--] = fs[i--];
		    fs_62_[i_63_--] = fs[i--];
		    fs_62_[i_63_--] = fs[i--];
		    fs_62_[i_63_--] = fs[i--];
		    fs_62_[i_63_--] = fs[i--];
		}
		i_64_ -= 7;
		while (i >= i_64_)
		    fs_62_[i_63_--] = fs[i--];
		return;
	    }
	}
	i_64_ += i;
	i_64_ -= 7;
	while (i < i_64_) {
	    fs_62_[i_63_++] = fs[i++];
	    fs_62_[i_63_++] = fs[i++];
	    fs_62_[i_63_++] = fs[i++];
	    fs_62_[i_63_++] = fs[i++];
	    fs_62_[i_63_++] = fs[i++];
	    fs_62_[i_63_++] = fs[i++];
	    fs_62_[i_63_++] = fs[i++];
	    fs_62_[i_63_++] = fs[i++];
	}
	i_64_ += 7;
	while (i < i_64_)
	    fs_62_[i_63_++] = fs[i++];
    }
    
    public static void method14003(int[] is, int i, int i_65_, int i_66_) {
	i_65_ = i + i_65_ - 7;
	while (i < i_65_) {
	    is[i++] = i_66_;
	    is[i++] = i_66_;
	    is[i++] = i_66_;
	    is[i++] = i_66_;
	    is[i++] = i_66_;
	    is[i++] = i_66_;
	    is[i++] = i_66_;
	    is[i++] = i_66_;
	}
	i_65_ += 7;
	while (i < i_65_)
	    is[i++] = i_66_;
    }
    
    public static void method14004(float[] fs, int i, float[] fs_67_,
				   int i_68_, int i_69_) {
	if (fs == fs_67_) {
	    if (i == i_68_)
		return;
	    if (i_68_ > i && i_68_ < i + i_69_) {
		i_69_--;
		i += i_69_;
		i_68_ += i_69_;
		i_69_ = i - i_69_;
		i_69_ += 7;
		while (i >= i_69_) {
		    fs_67_[i_68_--] = fs[i--];
		    fs_67_[i_68_--] = fs[i--];
		    fs_67_[i_68_--] = fs[i--];
		    fs_67_[i_68_--] = fs[i--];
		    fs_67_[i_68_--] = fs[i--];
		    fs_67_[i_68_--] = fs[i--];
		    fs_67_[i_68_--] = fs[i--];
		    fs_67_[i_68_--] = fs[i--];
		}
		i_69_ -= 7;
		while (i >= i_69_)
		    fs_67_[i_68_--] = fs[i--];
		return;
	    }
	}
	i_69_ += i;
	i_69_ -= 7;
	while (i < i_69_) {
	    fs_67_[i_68_++] = fs[i++];
	    fs_67_[i_68_++] = fs[i++];
	    fs_67_[i_68_++] = fs[i++];
	    fs_67_[i_68_++] = fs[i++];
	    fs_67_[i_68_++] = fs[i++];
	    fs_67_[i_68_++] = fs[i++];
	    fs_67_[i_68_++] = fs[i++];
	    fs_67_[i_68_++] = fs[i++];
	}
	i_69_ += 7;
	while (i < i_69_)
	    fs_67_[i_68_++] = fs[i++];
    }
    
    static void method14005(short[] is, int i, short[] is_70_, int i_71_,
			    int i_72_) {
	if (is == is_70_) {
	    if (i == i_71_)
		return;
	    if (i_71_ > i && i_71_ < i + i_72_) {
		i_72_--;
		i += i_72_;
		i_71_ += i_72_;
		i_72_ = i - i_72_;
		i_72_ += 7;
		while (i >= i_72_) {
		    is_70_[i_71_--] = is[i--];
		    is_70_[i_71_--] = is[i--];
		    is_70_[i_71_--] = is[i--];
		    is_70_[i_71_--] = is[i--];
		    is_70_[i_71_--] = is[i--];
		    is_70_[i_71_--] = is[i--];
		    is_70_[i_71_--] = is[i--];
		    is_70_[i_71_--] = is[i--];
		}
		i_72_ -= 7;
		while (i >= i_72_)
		    is_70_[i_71_--] = is[i--];
		return;
	    }
	}
	i_72_ += i;
	i_72_ -= 7;
	while (i < i_72_) {
	    is_70_[i_71_++] = is[i++];
	    is_70_[i_71_++] = is[i++];
	    is_70_[i_71_++] = is[i++];
	    is_70_[i_71_++] = is[i++];
	    is_70_[i_71_++] = is[i++];
	    is_70_[i_71_++] = is[i++];
	    is_70_[i_71_++] = is[i++];
	    is_70_[i_71_++] = is[i++];
	}
	i_72_ += 7;
	while (i < i_72_)
	    is_70_[i_71_++] = is[i++];
    }
    
    static void method14006(double[] ds, int i, double[] ds_73_, int i_74_,
			    int i_75_) {
	if (ds == ds_73_) {
	    if (i == i_74_)
		return;
	    if (i_74_ > i && i_74_ < i + i_75_) {
		i_75_--;
		i += i_75_;
		i_74_ += i_75_;
		i_75_ = i - i_75_;
		i_75_ += 3;
		while (i >= i_75_) {
		    ds_73_[i_74_--] = ds[i--];
		    ds_73_[i_74_--] = ds[i--];
		    ds_73_[i_74_--] = ds[i--];
		    ds_73_[i_74_--] = ds[i--];
		}
		i_75_ -= 3;
		while (i >= i_75_)
		    ds_73_[i_74_--] = ds[i--];
		return;
	    }
	}
	i_75_ += i;
	i_75_ -= 3;
	while (i < i_75_) {
	    ds_73_[i_74_++] = ds[i++];
	    ds_73_[i_74_++] = ds[i++];
	    ds_73_[i_74_++] = ds[i++];
	    ds_73_[i_74_++] = ds[i++];
	}
	i_75_ += 3;
	while (i < i_75_)
	    ds_73_[i_74_++] = ds[i++];
    }
    
    static void method14007(byte[] is, int i, byte[] is_76_, int i_77_,
			    int i_78_) {
	if (is == is_76_) {
	    if (i == i_77_)
		return;
	    if (i_77_ > i && i_77_ < i + i_78_) {
		i_78_--;
		i += i_78_;
		i_77_ += i_78_;
		i_78_ = i - i_78_;
		i_78_ += 7;
		while (i >= i_78_) {
		    is_76_[i_77_--] = is[i--];
		    is_76_[i_77_--] = is[i--];
		    is_76_[i_77_--] = is[i--];
		    is_76_[i_77_--] = is[i--];
		    is_76_[i_77_--] = is[i--];
		    is_76_[i_77_--] = is[i--];
		    is_76_[i_77_--] = is[i--];
		    is_76_[i_77_--] = is[i--];
		}
		i_78_ -= 7;
		while (i >= i_78_)
		    is_76_[i_77_--] = is[i--];
		return;
	    }
	}
	i_78_ += i;
	i_78_ -= 7;
	while (i < i_78_) {
	    is_76_[i_77_++] = is[i++];
	    is_76_[i_77_++] = is[i++];
	    is_76_[i_77_++] = is[i++];
	    is_76_[i_77_++] = is[i++];
	    is_76_[i_77_++] = is[i++];
	    is_76_[i_77_++] = is[i++];
	    is_76_[i_77_++] = is[i++];
	    is_76_[i_77_++] = is[i++];
	}
	i_78_ += 7;
	while (i < i_78_)
	    is_76_[i_77_++] = is[i++];
    }
    
    static void method14008(boolean[] bools, int i, boolean[] bools_79_,
			    int i_80_, int i_81_) {
	if (bools == bools_79_) {
	    if (i == i_80_)
		return;
	    if (i_80_ > i && i_80_ < i + i_81_) {
		i_81_--;
		i += i_81_;
		i_80_ += i_81_;
		i_81_ = i - i_81_;
		i_81_ += 7;
		while (i >= i_81_) {
		    bools_79_[i_80_--] = bools[i--];
		    bools_79_[i_80_--] = bools[i--];
		    bools_79_[i_80_--] = bools[i--];
		    bools_79_[i_80_--] = bools[i--];
		    bools_79_[i_80_--] = bools[i--];
		    bools_79_[i_80_--] = bools[i--];
		    bools_79_[i_80_--] = bools[i--];
		    bools_79_[i_80_--] = bools[i--];
		}
		i_81_ -= 7;
		while (i >= i_81_)
		    bools_79_[i_80_--] = bools[i--];
		return;
	    }
	}
	i_81_ += i;
	i_81_ -= 7;
	while (i < i_81_) {
	    bools_79_[i_80_++] = bools[i++];
	    bools_79_[i_80_++] = bools[i++];
	    bools_79_[i_80_++] = bools[i++];
	    bools_79_[i_80_++] = bools[i++];
	    bools_79_[i_80_++] = bools[i++];
	    bools_79_[i_80_++] = bools[i++];
	    bools_79_[i_80_++] = bools[i++];
	    bools_79_[i_80_++] = bools[i++];
	}
	i_81_ += 7;
	while (i < i_81_)
	    bools_79_[i_80_++] = bools[i++];
    }
    
    public static void method14009
	(Object[] objects, int i, Object[] objects_82_, int i_83_, int i_84_) {
	if (objects == objects_82_) {
	    if (i == i_83_)
		return;
	    if (i_83_ > i && i_83_ < i + i_84_) {
		i_84_--;
		i += i_84_;
		i_83_ += i_84_;
		i_84_ = i - i_84_;
		i_84_ += 7;
		while (i >= i_84_) {
		    objects_82_[i_83_--] = objects[i--];
		    objects_82_[i_83_--] = objects[i--];
		    objects_82_[i_83_--] = objects[i--];
		    objects_82_[i_83_--] = objects[i--];
		    objects_82_[i_83_--] = objects[i--];
		    objects_82_[i_83_--] = objects[i--];
		    objects_82_[i_83_--] = objects[i--];
		    objects_82_[i_83_--] = objects[i--];
		}
		i_84_ -= 7;
		while (i >= i_84_)
		    objects_82_[i_83_--] = objects[i--];
		return;
	    }
	}
	i_84_ += i;
	i_84_ -= 7;
	while (i < i_84_) {
	    objects_82_[i_83_++] = objects[i++];
	    objects_82_[i_83_++] = objects[i++];
	    objects_82_[i_83_++] = objects[i++];
	    objects_82_[i_83_++] = objects[i++];
	    objects_82_[i_83_++] = objects[i++];
	    objects_82_[i_83_++] = objects[i++];
	    objects_82_[i_83_++] = objects[i++];
	    objects_82_[i_83_++] = objects[i++];
	}
	i_84_ += 7;
	while (i < i_84_)
	    objects_82_[i_83_++] = objects[i++];
    }
    
    public static void method14010(int[] is, int i, int i_85_, int i_86_) {
	i_85_ = i + i_85_ - 7;
	while (i < i_85_) {
	    is[i++] = i_86_;
	    is[i++] = i_86_;
	    is[i++] = i_86_;
	    is[i++] = i_86_;
	    is[i++] = i_86_;
	    is[i++] = i_86_;
	    is[i++] = i_86_;
	    is[i++] = i_86_;
	}
	i_85_ += 7;
	while (i < i_85_)
	    is[i++] = i_86_;
    }
    
    public static void method14011(int[] is, int i, int i_87_, int i_88_) {
	i_87_ = i + i_87_ - 7;
	while (i < i_87_) {
	    is[i++] = i_88_;
	    is[i++] = i_88_;
	    is[i++] = i_88_;
	    is[i++] = i_88_;
	    is[i++] = i_88_;
	    is[i++] = i_88_;
	    is[i++] = i_88_;
	    is[i++] = i_88_;
	}
	i_87_ += 7;
	while (i < i_87_)
	    is[i++] = i_88_;
    }
    
    public static void method14012(int[] is, int i, int i_89_, int i_90_) {
	i_89_ = i + i_89_ - 7;
	while (i < i_89_) {
	    is[i++] = i_90_;
	    is[i++] = i_90_;
	    is[i++] = i_90_;
	    is[i++] = i_90_;
	    is[i++] = i_90_;
	    is[i++] = i_90_;
	    is[i++] = i_90_;
	    is[i++] = i_90_;
	}
	i_89_ += 7;
	while (i < i_89_)
	    is[i++] = i_90_;
    }
    
    static void method14013(double[] ds, int i, double[] ds_91_, int i_92_,
			    int i_93_) {
	if (ds == ds_91_) {
	    if (i == i_92_)
		return;
	    if (i_92_ > i && i_92_ < i + i_93_) {
		i_93_--;
		i += i_93_;
		i_92_ += i_93_;
		i_93_ = i - i_93_;
		i_93_ += 3;
		while (i >= i_93_) {
		    ds_91_[i_92_--] = ds[i--];
		    ds_91_[i_92_--] = ds[i--];
		    ds_91_[i_92_--] = ds[i--];
		    ds_91_[i_92_--] = ds[i--];
		}
		i_93_ -= 3;
		while (i >= i_93_)
		    ds_91_[i_92_--] = ds[i--];
		return;
	    }
	}
	i_93_ += i;
	i_93_ -= 3;
	while (i < i_93_) {
	    ds_91_[i_92_++] = ds[i++];
	    ds_91_[i_92_++] = ds[i++];
	    ds_91_[i_92_++] = ds[i++];
	    ds_91_[i_92_++] = ds[i++];
	}
	i_93_ += 3;
	while (i < i_93_)
	    ds_91_[i_92_++] = ds[i++];
    }
}
