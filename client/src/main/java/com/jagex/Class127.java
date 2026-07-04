/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class127
{
    static final boolean method2194(int i, int i_0_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method2195(int i, int i_1_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method2196(int i, int i_2_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method2197(int i, int i_3_) {
	return (i & 0x34) != 0;
    }
    
    static final boolean method2198(int i, int i_4_) {
	return method2202(i, i_4_) & method2210(i, i_4_);
    }
    
    static final boolean method2199(int i, int i_5_) {
	return (i & 0x70000) != 0 | method2197(i, i_5_) || method2236(i, i_5_);
    }
    
    static final boolean method2200(int i, int i_6_) {
	return method2202(i, i_6_) || method2198(i, i_6_);
    }
    
    static final boolean method2201(int i, int i_7_) {
	return (i & 0x100100) != 0;
    }
    
    static final boolean method2202(int i, int i_8_) {
	return false;
    }
    
    static final boolean method2203(int i, int i_9_) {
	return (i & 0x10) != 0;
    }
    
    static final boolean method2204(int i, int i_10_) {
	return (i & 0x8000) != 0;
    }
    
    static final boolean method2205(int i, int i_11_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method2206(int i, int i_12_) {
	return (i & 0x10000) != 0;
    }
    
    static final boolean method2207(int i, int i_13_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method2208(int i, int i_14_) {
	return ((i & 0x70000) != 0 | method2226(i, i_14_)
		|| method2236(i, i_14_));
    }
    
    static final boolean method2209(int i, int i_15_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method2210(int i, int i_16_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method2211(int i, int i_17_) {
	return (i & 0x800) != 0 | method2204(i, i_17_) || method2212(i, i_17_);
    }
    
    static final boolean method2212(int i, int i_18_) {
	if (!method2270(i, i_18_))
	    return false;
	if ((i & 0xb000) != 0 | method2225(i, i_18_) | method2201(i, i_18_))
	    return true;
	return ((i_18_ & 0x37) == 0
		& (method2241(i, i_18_) | method2206(i, i_18_)));
    }
    
    static final boolean method2213(int i, int i_19_) {
	return (((i & 0x2000) != 0 | method2241(i, i_19_)
		 | method2206(i, i_19_))
		& method2293(i, i_19_));
    }
    
    static final boolean method2214(int i, int i_20_) {
	if ((i & 0x10000) != 0 | method2241(i, i_20_) || method2213(i, i_20_))
	    return true;
	return (i_20_ & 0x37) == 0 && method2212(i, i_20_);
    }
    
    static final boolean method2215(int i, int i_21_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method2216(int i, int i_22_) {
	return method2203(i, i_22_) & method2257(i, i_22_);
    }
    
    static final boolean method2217(int i, int i_23_) {
	return ((i & 0x70000) != 0 | method2226(i, i_23_)
		|| method2236(i, i_23_));
    }
    
    static final boolean method2218(int i, int i_24_) {
	return ((i & 0x70000) != 0 | method2196(i, i_24_)
		|| method2236(i, i_24_));
    }
    
    static final boolean method2219(int i, int i_25_) {
	return ((i & 0x70000) != 0 | method2197(i, i_25_)
		|| method2236(i, i_25_));
    }
    
    static final boolean method2220(int i, int i_26_) {
	return ((i & 0x60000) != 0 | method2203(i, i_26_)
		|| method2212(i, i_26_) || method2216(i, i_26_));
    }
    
    static final boolean method2221(int i, int i_27_) {
	return method2225(i, i_27_) || method2212(i, i_27_);
    }
    
    static final boolean method2222(int i, int i_28_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method2223(int i, int i_29_) {
	return method2202(i, i_29_) || method2198(i, i_29_);
    }
    
    static final boolean method2224(int i, int i_30_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method2225(int i, int i_31_) {
	return (i & 0x84080) != 0;
    }
    
    static final boolean method2226(int i, int i_32_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method2227(int i, int i_33_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method2228(int i, int i_34_) {
	return ((i & 0x60000) != 0 | method2203(i, i_34_)
		|| method2212(i, i_34_) || method2216(i, i_34_));
    }
    
    static final boolean method2229(int i, int i_35_) {
	if (!method2270(i, i_35_))
	    return false;
	if ((i & 0xb000) != 0 | method2225(i, i_35_) | method2201(i, i_35_))
	    return true;
	return ((i_35_ & 0x37) == 0
		& (method2241(i, i_35_) | method2206(i, i_35_)));
    }
    
    static final boolean method2230(int i, int i_36_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method2231(int i, int i_37_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method2232(int i, int i_38_) {
	return method2202(i, i_38_) & method2210(i, i_38_);
    }
    
    static final boolean method2233(int i, int i_39_) {
	return (i & 0x34) != 0;
    }
    
    static final boolean method2234(int i, int i_40_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method2235(int i, int i_41_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method2236(int i, int i_42_) {
	return ((method2226(i, i_42_) | method2196(i, i_42_)
		 | method2197(i, i_42_))
		& method2207(i, i_42_));
    }
    
    static final boolean method2237(int i, int i_43_) {
	return (i & 0x34) != 0;
    }
    
    static final boolean method2238(int i, int i_44_) {
	return (i & 0x34) != 0;
    }
    
    static final boolean method2239(int i, int i_45_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method2240(int i, int i_46_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method2241(int i, int i_47_) {
	return (i & 0x220) == 544 | (i & 0x18) != 0;
    }
    
    static final boolean method2242(int i, int i_48_) {
	return method2202(i, i_48_) || method2198(i, i_48_);
    }
    
    static final boolean method2243(int i, int i_49_) {
	return (i & 0x84080) != 0;
    }
    
    static final boolean method2244(int i, int i_50_) {
	return (i & 0x84080) != 0;
    }
    
    static final boolean method2245(int i, int i_51_) {
	return (i & 0x100100) != 0;
    }
    
    static final boolean method2246(int i, int i_52_) {
	return (i & 0x100100) != 0;
    }
    
    static final boolean method2247(int i, int i_53_) {
	return (i & 0x100100) != 0;
    }
    
    static final boolean method2248(int i, int i_54_) {
	return false;
    }
    
    static final boolean method2249(int i, int i_55_) {
	return (i & 0x10000) != 0;
    }
    
    Class127() throws Throwable {
	throw new Error();
    }
    
    static final boolean method2250(int i, int i_56_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method2251(int i, int i_57_) {
	return (i & 0x37) != 0;
    }
    
    static final boolean method2252(int i, int i_58_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method2253(int i, int i_59_) {
	return (i & 0x20) != 0;
    }
    
    static final boolean method2254(int i, int i_60_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method2255(int i, int i_61_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method2256(int i, int i_62_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method2257(int i, int i_63_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method2258(int i, int i_64_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method2259(int i, int i_65_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method2260(int i, int i_66_) {
	return ((i & 0x70000) != 0 | method2197(i, i_66_)
		|| method2236(i, i_66_));
    }
    
    static final boolean method2261(int i, int i_67_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method2262(int i, int i_68_) {
	return ((method2226(i, i_68_) | method2196(i, i_68_)
		 | method2197(i, i_68_))
		& method2207(i, i_68_));
    }
    
    static final boolean method2263(int i, int i_69_) {
	return ((method2226(i, i_69_) | method2196(i, i_69_)
		 | method2197(i, i_69_))
		& method2207(i, i_69_));
    }
    
    static final boolean method2264(int i, int i_70_) {
	return (((i & 0x2000) != 0 | method2241(i, i_70_)
		 | method2206(i, i_70_))
		& method2293(i, i_70_));
    }
    
    static final boolean method2265(int i, int i_71_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method2266(int i, int i_72_) {
	if (!method2270(i, i_72_))
	    return false;
	if ((i & 0xb000) != 0 | method2225(i, i_72_) | method2201(i, i_72_))
	    return true;
	return ((i_72_ & 0x37) == 0
		& (method2241(i, i_72_) | method2206(i, i_72_)));
    }
    
    static final boolean method2267(int i, int i_73_) {
	if (!method2270(i, i_73_))
	    return false;
	if ((i & 0xb000) != 0 | method2225(i, i_73_) | method2201(i, i_73_))
	    return true;
	return ((i_73_ & 0x37) == 0
		& (method2241(i, i_73_) | method2206(i, i_73_)));
    }
    
    static final boolean method2268(int i, int i_74_) {
	if (!method2270(i, i_74_))
	    return false;
	if ((i & 0xb000) != 0 | method2225(i, i_74_) | method2201(i, i_74_))
	    return true;
	return ((i_74_ & 0x37) == 0
		& (method2241(i, i_74_) | method2206(i, i_74_)));
    }
    
    static final boolean method2269(int i, int i_75_) {
	return ((i & 0x40000) != 0 | method2201(i, i_75_)
		|| method2212(i, i_75_));
    }
    
    static final boolean method2270(int i, int i_76_) {
	return (i & 0x800) != 0;
    }
    
    static final boolean method2271(int i, int i_77_) {
	return method2202(i, i_77_) & method2210(i, i_77_);
    }
    
    static final boolean method2272(int i, int i_78_) {
	return method2203(i, i_78_) & method2257(i, i_78_);
    }
    
    static final boolean method2273(int i, int i_79_) {
	return ((i & 0x70000) != 0 | method2226(i, i_79_)
		|| method2236(i, i_79_));
    }
    
    static final boolean method2274(int i, int i_80_) {
	return ((i & 0x70000) != 0 | method2226(i, i_80_)
		|| method2236(i, i_80_));
    }
    
    static final boolean method2275(int i, int i_81_) {
	return (i & 0x22) != 0;
    }
    
    static final boolean method2276(int i, int i_82_) {
	return (((i & 0x2000) != 0 | method2241(i, i_82_)
		 | method2206(i, i_82_))
		& method2293(i, i_82_));
    }
    
    static final boolean method2277(int i, int i_83_) {
	return method2225(i, i_83_) || method2212(i, i_83_);
    }
    
    static final boolean method2278(int i, int i_84_) {
	return ((i & 0x70000) != 0 | method2197(i, i_84_)
		|| method2236(i, i_84_));
    }
    
    static final boolean method2279(int i, int i_85_) {
	if ((i & 0x10000) != 0 | method2241(i, i_85_) || method2213(i, i_85_))
	    return true;
	return (i_85_ & 0x37) == 0 && method2212(i, i_85_);
    }
    
    static final boolean method2280(int i, int i_86_) {
	return (i & 0x800) != 0 | method2204(i, i_86_) || method2212(i, i_86_);
    }
    
    static final boolean method2281(int i, int i_87_) {
	return method2225(i, i_87_) || method2212(i, i_87_);
    }
    
    static final boolean method2282(int i, int i_88_) {
	return (i & 0x21) != 0;
    }
    
    static final boolean method2283(int i, int i_89_) {
	return ((i & 0x40000) != 0 | method2201(i, i_89_)
		|| method2212(i, i_89_));
    }
    
    static final boolean method2284(int i, int i_90_) {
	return ((i & 0x40000) != 0 | method2201(i, i_90_)
		|| method2212(i, i_90_));
    }
    
    static final boolean method2285(int i, int i_91_) {
	return method2202(i, i_91_) || method2198(i, i_91_);
    }
    
    static final boolean method2286(int i, int i_92_) {
	return (i & 0x10) != 0;
    }
    
    static final boolean method2287(int i, int i_93_) {
	return method2202(i, i_93_) || method2198(i, i_93_);
    }
    
    static final boolean method2288(int i, int i_94_) {
	return method2225(i, i_94_) || method2212(i, i_94_);
    }
    
    static final boolean method2289(int i, int i_95_) {
	return method2202(i, i_95_) || method2198(i, i_95_);
    }
    
    static final boolean method2290(int i, int i_96_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method2291(int i, int i_97_) {
	return (i & 0x180) != 0;
    }
    
    static final boolean method2292(int i, int i_98_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method2293(int i, int i_99_) {
	return (i & 0x800) != 0 && (i_99_ & 0x37) != 0;
    }
    
    static final boolean method2294(int i, int i_100_) {
	return (i & 0x400) != 0;
    }
    
    static final boolean method2295(int i, int i_101_) {
	return ((i & 0x60000) != 0 | method2203(i, i_101_)
		|| method2212(i, i_101_) || method2216(i, i_101_));
    }
    
    static final boolean method2296(int i, int i_102_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method2297(int i, int i_103_) {
	return ((i & 0x800) != 0 | method2204(i, i_103_)
		|| method2212(i, i_103_));
    }
    
    static final boolean method2298(int i, int i_104_) {
	return ((i & 0x800) != 0 | method2204(i, i_104_)
		|| method2212(i, i_104_));
    }
    
    static final boolean method2299(int i, int i_105_) {
	return (i & 0xc580) != 0;
    }
    
    static final boolean method2300(int i, int i_106_) {
	return ((i & 0x800) != 0 | method2204(i, i_106_)
		|| method2212(i, i_106_));
    }
}
