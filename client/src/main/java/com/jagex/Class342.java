/* Class342 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class342
{
    static final boolean method5951(int i, int i_0_) {
	return ((method5952(i, i_0_) | method5969(i, i_0_)
		 | method5954(i, i_0_))
		& method5964(i, i_0_));
    }
    
    static final boolean method5952(int i, int i_1_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method5953(int i, int i_2_) {
	return (i & 0x800) != 0 && (i_2_ & 0x37) != 0;
    }
    
    static final boolean method5954(int i, int i_3_) {
	return (i & 0x34) != 0;
    }
    
    static final boolean method5955(int i, int i_4_) {
	return ((method5952(i, i_4_) | method5969(i, i_4_)
		 | method5954(i, i_4_))
		& method5964(i, i_4_));
    }
    
    static final boolean method5956(int i, int i_5_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method5957(int i, int i_6_) {
	return (i & 0x84080) != 0;
    }
    
    static final boolean method5958(int i, int i_7_) {
	return (i & 0x100) != 0;
    }
    
    static final boolean method5959(int i, int i_8_) {
	return (i & 0x20) != 0;
    }
    
    static final boolean method5960(int i, int i_9_) {
	return (i & 0x10) != 0;
    }
    
    static final boolean method5961(int i, int i_10_) {
	return (i & 0x800) != 0 && (i_10_ & 0x37) != 0;
    }
    
    static final boolean method5962(int i, int i_11_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method5963(int i, int i_12_) {
	return (i & 0x10000) != 0;
    }
    
    static final boolean method5964(int i, int i_13_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method5965(int i, int i_14_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method5966(int i, int i_15_) {
	if (!method6031(i, i_15_))
	    return false;
	if ((i & 0x9000) != 0 | method5957(i, i_15_) | method5958(i, i_15_))
	    return true;
	return (i_15_ & 0x37) == 0 & ((i & 0x2000) != 0 | method6051(i, i_15_)
				      | method5963(i, i_15_));
    }
    
    static final boolean method5967(int i, int i_16_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method5968(int i, int i_17_) {
	return ((i & 0x70000) != 0 || method5969(i, i_17_)
		|| method5991(i, i_17_));
    }
    
    static final boolean method5969(int i, int i_18_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method5970(int i, int i_19_) {
	return method6045(i, i_19_) & ((i & 0x2000) != 0 | method6051(i, i_19_)
				       | method5963(i, i_19_));
    }
    
    static final boolean method5971(int i, int i_20_) {
	return (i & 0x20) != 0;
    }
    
    static final boolean method5972(int i, int i_21_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method5973(int i, int i_22_) {
	return method5960(i, i_22_) & method5965(i, i_22_);
    }
    
    static final boolean method5974(int i, int i_23_) {
	return ((i & 0x70000) != 0 || method5952(i, i_23_)
		|| method5991(i, i_23_));
    }
    
    static final boolean method5975(int i, int i_24_) {
	return ((i & 0x70000) != 0 || method5969(i, i_24_)
		|| method5991(i, i_24_));
    }
    
    static final boolean method5976(int i, int i_25_) {
	return ((i & 0x70000) != 0 || method5954(i, i_25_)
		|| method5991(i, i_25_));
    }
    
    static final boolean method5977(int i, int i_26_) {
	boolean bool = ((i_26_ & 0x37) != 0 ? method5970(i, i_26_)
			: method5966(i, i_26_));
	return (i & 0x10000) != 0 | method6051(i, i_26_) | bool;
    }
    
    static final boolean method5978(int i, int i_27_) {
	return method5957(i, i_27_) || method5966(i, i_27_);
    }
    
    static final boolean method5979(int i, int i_28_) {
	return ((i & 0x40000) != 0 | method5958(i, i_28_)
		|| method5966(i, i_28_));
    }
    
    static final boolean method5980(int i, int i_29_) {
	boolean bool = ((i_29_ & 0x37) != 0 ? method5970(i, i_29_)
			: method5966(i, i_29_));
	return (i & 0x10000) != 0 | method6051(i, i_29_) | bool;
    }
    
    static final boolean method5981(int i, int i_30_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method5982(int i, int i_31_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method5983(int i, int i_32_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method5984(int i, int i_33_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method5985(int i, int i_34_) {
	return (i & 0x800) != 0 | method6030(i, i_34_) || method5966(i, i_34_);
    }
    
    static final boolean method5986(int i, int i_35_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method5987(int i, int i_36_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method5988(int i, int i_37_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method5989(int i, int i_38_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method5990(int i, int i_39_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method5991(int i, int i_40_) {
	return ((method5952(i, i_40_) | method5969(i, i_40_)
		 | method5954(i, i_40_))
		& method5964(i, i_40_));
    }
    
    static final boolean method5992(int i, int i_41_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method5993(int i, int i_42_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method5994(int i, int i_43_) {
	return ((i & 0x70000) != 0 || method5969(i, i_43_)
		|| method5991(i, i_43_));
    }
    
    static final boolean method5995(int i, int i_44_) {
	return method6021(i, i_44_) || method5996(i, i_44_);
    }
    
    static final boolean method5996(int i, int i_45_) {
	return method6021(i, i_45_) & method5967(i, i_45_);
    }
    
    static final boolean method5997(int i, int i_46_) {
	return false;
    }
    
    static final boolean method5998(int i, int i_47_) {
	return false;
    }
    
    static final boolean method5999(int i, int i_48_) {
	return (i & 0x10) != 0;
    }
    
    static final boolean method6000(int i, int i_49_) {
	return (i & 0x10) != 0;
    }
    
    static final boolean method6001(int i, int i_50_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method6002(int i, int i_51_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method6003(int i, int i_52_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method6004(int i, int i_53_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method6005(int i, int i_54_) {
	return method5960(i, i_54_) & method5965(i, i_54_);
    }
    
    static final boolean method6006(int i, int i_55_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method6007(int i, int i_56_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method6008(int i, int i_57_) {
	return (i & 0x10000) != 0;
    }
    
    static final boolean method6009(int i, int i_58_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method6010(int i, int i_59_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method6011(int i, int i_60_) {
	return ((i & 0x40000) != 0 | method5958(i, i_60_)
		|| method5966(i, i_60_));
    }
    
    static final boolean method6012(int i, int i_61_) {
	return ((method5952(i, i_61_) | method5969(i, i_61_)
		 | method5954(i, i_61_))
		& method5964(i, i_61_));
    }
    
    static final boolean method6013(int i, int i_62_) {
	return (i & 0x800) != 0 && (i_62_ & 0x37) != 0;
    }
    
    static final boolean method6014(int i, int i_63_) {
	return (i & 0x84080) != 0;
    }
    
    static final boolean method6015(int i, int i_64_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method6016(int i, int i_65_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method6017(int i, int i_66_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method6018(int i, int i_67_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method6019(int i, int i_68_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method6020(int i, int i_69_) {
	boolean bool = ((i_69_ & 0x37) != 0 ? method5970(i, i_69_)
			: method5966(i, i_69_));
	return (i & 0x10000) != 0 | method6051(i, i_69_) | bool;
    }
    
    static final boolean method6021(int i, int i_70_) {
	return false;
    }
    
    static final boolean method6022(int i, int i_71_) {
	return (i & 0x20) != 0;
    }
    
    static final boolean method6023(int i, int i_72_) {
	return method5957(i, i_72_) || method5966(i, i_72_);
    }
    
    static final boolean method6024(int i, int i_73_) {
	return ((method5952(i, i_73_) | method5969(i, i_73_)
		 | method5954(i, i_73_))
		& method5964(i, i_73_));
    }
    
    static final boolean method6025(int i, int i_74_) {
	return method6045(i, i_74_) & ((i & 0x2000) != 0 | method6051(i, i_74_)
				       | method5963(i, i_74_));
    }
    
    static final boolean method6026(int i, int i_75_) {
	if (!method6031(i, i_75_))
	    return false;
	if ((i & 0x9000) != 0 | method5957(i, i_75_) | method5958(i, i_75_))
	    return true;
	return (i_75_ & 0x37) == 0 & ((i & 0x2000) != 0 | method6051(i, i_75_)
				      | method5963(i, i_75_));
    }
    
    static final boolean method6027(int i, int i_76_) {
	if (!method6031(i, i_76_))
	    return false;
	if ((i & 0x9000) != 0 | method5957(i, i_76_) | method5958(i, i_76_))
	    return true;
	return (i_76_ & 0x37) == 0 & ((i & 0x2000) != 0 | method6051(i, i_76_)
				      | method5963(i, i_76_));
    }
    
    static final boolean method6028(int i, int i_77_) {
	return method6021(i, i_77_) & method5967(i, i_77_);
    }
    
    static final boolean method6029(int i, int i_78_) {
	return method6021(i, i_78_) & method5967(i, i_78_);
    }
    
    static final boolean method6030(int i, int i_79_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method6031(int i, int i_80_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method6032(int i, int i_81_) {
	return ((i & 0x70000) != 0 || method5969(i, i_81_)
		|| method5991(i, i_81_));
    }
    
    static final boolean method6033(int i, int i_82_) {
	return method5960(i, i_82_) & method5965(i, i_82_);
    }
    
    static final boolean method6034(int i, int i_83_) {
	return method5960(i, i_83_) & method5965(i, i_83_);
    }
    
    static final boolean method6035(int i, int i_84_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method6036(int i, int i_85_) {
	return ((i & 0x60000) != 0 | method5960(i, i_85_)
		|| method5973(i, i_85_));
    }
    
    static final boolean method6037(int i, int i_86_) {
	return ((i & 0x70000) != 0 || method5969(i, i_86_)
		|| method5991(i, i_86_));
    }
    
    static final boolean method6038(int i, int i_87_) {
	return method5960(i, i_87_) & method5965(i, i_87_);
    }
    
    static final boolean method6039(int i, int i_88_) {
	return ((i & 0x70000) != 0 || method5954(i, i_88_)
		|| method5991(i, i_88_));
    }
    
    static final boolean method6040(int i, int i_89_) {
	return method5960(i, i_89_) & method5965(i, i_89_);
    }
    
    static final boolean method6041(int i, int i_90_) {
	return (i & 0x84080) != 0;
    }
    
    static final boolean method6042(int i, int i_91_) {
	boolean bool = ((i_91_ & 0x37) != 0 ? method5970(i, i_91_)
			: method5966(i, i_91_));
	return (i & 0x10000) != 0 | method6051(i, i_91_) | bool;
    }
    
    static final boolean method6043(int i, int i_92_) {
	boolean bool = ((i_92_ & 0x37) != 0 ? method5970(i, i_92_)
			: method5966(i, i_92_));
	return (i & 0x10000) != 0 | method6051(i, i_92_) | bool;
    }
    
    static final boolean method6044(int i, int i_93_) {
	return method5957(i, i_93_) || method5966(i, i_93_);
    }
    
    static final boolean method6045(int i, int i_94_) {
	return (i & 0x800) != 0 && (i_94_ & 0x37) != 0;
    }
    
    static final boolean method6046(int i, int i_95_) {
	return method5957(i, i_95_) || method5966(i, i_95_);
    }
    
    static final boolean method6047(int i, int i_96_) {
	return (i & 0x800) != 0 && (i_96_ & 0x37) != 0;
    }
    
    static final boolean method6048(int i, int i_97_) {
	return method6021(i, i_97_) || method5996(i, i_97_);
    }
    
    static final boolean method6049(int i, int i_98_) {
	return method6021(i, i_98_) || method5996(i, i_98_);
    }
    
    static final boolean method6050(int i, int i_99_) {
	return (i & 0x10000) != 0;
    }
    
    static final boolean method6051(int i, int i_100_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    Class342() throws Throwable {
	throw new Error();
    }
    
    static final boolean method6052(int i, int i_101_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method6053(int i, int i_102_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method6054(int i, int i_103_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method6055(int i, int i_104_) {
	return ((i & 0x60000) != 0 | method5960(i, i_104_)
		|| method5973(i, i_104_));
    }
    
    static final boolean method6056(int i, int i_105_) {
	return ((i & 0x800) != 0 | method6030(i, i_105_)
		|| method5966(i, i_105_));
    }
    
    static final boolean method6057(int i, int i_106_) {
	return ((i & 0x800) != 0 | method6030(i, i_106_)
		|| method5966(i, i_106_));
    }
}
