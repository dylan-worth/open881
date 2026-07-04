/* Class522 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Class522
{
    short[] aShortArray7065;
    Class317 aClass317_7066;
    short[] aShortArray7067;
    short[] aShortArray7068;
    Class520 aClass520_7069 = new Class520();
    short[] aShortArray7070;
    Class316 aClass316_7071;
    short[] aShortArray7072;
    Class316[] aClass316Array7073;
    short[] aShortArray7074;
    Class543 aClass543_7075;
    Class527 aClass527_7076;
    short[] aShortArray7077;
    Class527 aClass527_7078;
    int anInt7079;
    int anInt7080;
    int anInt7081;
    public static Class467 aClass467_7082;
    public static Class110_Sub1_Sub2 aClass110_Sub1_Sub2_7083;
    
    void method8693() throws IOException {
	aClass520_7069.method8657(false, (byte) 7);
	Class329.method5834(aShortArray7067, 1481674582);
	Class329.method5834(aShortArray7072, 1131993361);
	Class329.method5834(aShortArray7068, 1658701458);
	Class329.method5834(aShortArray7065, 2046986108);
	Class329.method5834(aShortArray7070, -1187588950);
	Class329.method5834(aShortArray7077, 947439655);
	Class329.method5834(aShortArray7074, -1187622713);
	aClass543_7075.method8956((byte) 13);
	for (int i = 0; i < 4; i++)
	    aClass316Array7073[i].method5708(-653804852);
	aClass527_7076.method8772((short) 255);
	aClass527_7078.method8772((short) 255);
	aClass316_7071.method5708(-2040591206);
	aClass317_7066.method5729((byte) -72);
    }
    
    boolean method8694(int i, byte i_0_) {
	if (i < 0)
	    return false;
	if (i != anInt7079 * 1745032899) {
	    anInt7079 = i * 802802155;
	    anInt7080 = Math.max(anInt7079 * 1745032899, 1) * 1791194049;
	    aClass520_7069.method8654(Math.max(-1487496127 * anInt7080, 4096),
				      877765857);
	}
	return true;
    }
    
    void method8695() throws IOException {
	aClass520_7069.method8657(false, (byte) 97);
	Class329.method5834(aShortArray7067, 1158965699);
	Class329.method5834(aShortArray7072, 1152282913);
	Class329.method5834(aShortArray7068, 1134276846);
	Class329.method5834(aShortArray7065, -847913939);
	Class329.method5834(aShortArray7070, 722879740);
	Class329.method5834(aShortArray7077, 1156811673);
	Class329.method5834(aShortArray7074, -267086790);
	aClass543_7075.method8956((byte) -45);
	for (int i = 0; i < 4; i++)
	    aClass316Array7073[i].method5708(-1815163558);
	aClass527_7076.method8772((short) 255);
	aClass527_7078.method8772((short) 255);
	aClass316_7071.method5708(-1862717646);
	aClass317_7066.method5729((byte) -115);
    }
    
    void method8696() throws IOException {
	aClass520_7069.method8657(false, (byte) 29);
	Class329.method5834(aShortArray7067, 1719783899);
	Class329.method5834(aShortArray7072, -245829353);
	Class329.method5834(aShortArray7068, 1572516681);
	Class329.method5834(aShortArray7065, -828860694);
	Class329.method5834(aShortArray7070, 1943207794);
	Class329.method5834(aShortArray7077, -808047672);
	Class329.method5834(aShortArray7074, -355750040);
	aClass543_7075.method8956((byte) -58);
	for (int i = 0; i < 4; i++)
	    aClass316Array7073[i].method5708(-1584333793);
	aClass527_7076.method8772((short) 255);
	aClass527_7078.method8772((short) 255);
	aClass316_7071.method5708(-2011291934);
	aClass317_7066.method5729((byte) -55);
    }
    
    boolean method8697(InputStream inputstream, OutputStream outputstream,
		       long l) throws IOException {
	aClass317_7066.method5726(inputstream, -1833125305);
	aClass520_7069.method8655(outputstream, 511132469);
	method8701(-2131018200);
	int i = Class275.method5147((byte) 3);
	int i_1_ = 0;
	int i_2_ = 0;
	int i_3_ = 0;
	int i_4_ = 0;
	long l_5_ = 0L;
	byte i_6_ = 0;
	while (l < 0L || l_5_ < l) {
	    int i_7_ = (int) l_5_ & -1311529333 * anInt7081;
	    if (aClass317_7066.method5740(aShortArray7067, i_7_ + (i << 4),
					  174801706)
		== 0) {
		Class542 class542
		    = aClass543_7075.method8953((int) l_5_, i_6_, (byte) 101);
		if (!Class574.method9738(i, 606122340))
		    i_6_ = class542.method8945(aClass317_7066,
					       aClass520_7069
						   .method8661(i_1_, (byte) 3),
					       812196918);
		else
		    i_6_ = class542.method8947(aClass317_7066, 1509197711);
		aClass520_7069.method8677(i_6_, (byte) -62);
		i = Class255.method4647(i, (byte) -100);
		l_5_++;
	    } else {
		int i_8_;
		if (aClass317_7066.method5740(aShortArray7068, i, 2020855449)
		    == 1) {
		    i_8_ = 0;
		    if (aClass317_7066.method5740(aShortArray7065, i,
						  -1979594681)
			== 0) {
			if (aClass317_7066.method5740(aShortArray7072,
						      (i << 4) + i_7_,
						      1521191030)
			    == 0) {
			    i = Exception_Sub6.method17946(i, -917768433);
			    i_8_ = 1;
			}
		    } else {
			int i_9_;
			if (aClass317_7066.method5740(aShortArray7070, i,
						      960466141)
			    == 0)
			    i_9_ = i_2_;
			else {
			    if (aClass317_7066.method5740(aShortArray7077, i,
							  297816692)
				== 0)
				i_9_ = i_3_;
			    else {
				i_9_ = i_4_;
				i_4_ = i_3_;
			    }
			    i_3_ = i_2_;
			}
			i_2_ = i_1_;
			i_1_ = i_9_;
		    }
		    if (0 == i_8_) {
			i_8_ = aClass527_7078.method8775(aClass317_7066, i_7_,
							 (byte) -58) + 2;
			i = Class145_Sub2.method15497(i, 898449368);
		    }
		} else {
		    i_4_ = i_3_;
		    i_3_ = i_2_;
		    i_2_ = i_1_;
		    i_8_ = 2 + aClass527_7076.method8775(aClass317_7066, i_7_,
							 (byte) -106);
		    i = Class214.method4104(i, (byte) 81);
		    int i_10_ = aClass316Array7073
				    [Class34.method925(i_8_, -679201717)]
				    .method5707(aClass317_7066, 418484576);
		    if (i_10_ >= 4) {
			int i_11_ = (i_10_ >> 1) - 1;
			i_1_ = (0x2 | i_10_ & 0x1) << i_11_;
			if (i_10_ < 14)
			    i_1_ += Class261.method4817(aShortArray7074,
							i_1_ - i_10_ - 1,
							aClass317_7066, i_11_,
							1957023944);
			else {
			    i_1_ += aClass317_7066.method5727(i_11_ - 4,
							      8272787) << 4;
			    i_1_ += aClass316_7071.method5712(aClass317_7066,
							      (byte) 15);
			    if (i_1_ < 0) {
				if (i_1_ != -1)
				    return false;
				break;
			    }
			}
		    } else
			i_1_ = i_10_;
		}
		if ((long) i_1_ >= l_5_ || i_1_ >= anInt7080 * -1487496127)
		    return false;
		aClass520_7069.method8659(i_1_, i_8_, -606152855);
		l_5_ += (long) i_8_;
		i_6_ = aClass520_7069.method8661(0, (byte) 3);
	    }
	}
	aClass520_7069.method8658(1102022495);
	aClass520_7069.method8656(-1278215326);
	aClass317_7066.method5728(2024299714);
	return true;
    }
    
    boolean method8698(byte[] is, byte i) {
	if (is.length < 5)
	    return false;
	int i_12_ = is[0] & 0xff;
	int i_13_ = i_12_ % 9;
	int i_14_ = i_12_ / 9;
	int i_15_ = i_14_ % 5;
	int i_16_ = i_14_ / 5;
	int i_17_ = 0;
	for (int i_18_ = 0; i_18_ < 4; i_18_++)
	    i_17_ += (is[i_18_ + 1] & 0xff) << i_18_ * 8;
	if (!method8703(i_13_, i_15_, i_16_, 125525761))
	    return false;
	return method8694(i_17_, (byte) -73);
    }
    
    boolean method8699(int i) {
	if (i < 0)
	    return false;
	if (i != anInt7079 * 1745032899) {
	    anInt7079 = i * 802802155;
	    anInt7080 = Math.max(anInt7079 * 1745032899, 1) * 1791194049;
	    aClass520_7069.method8654(Math.max(-1487496127 * anInt7080, 4096),
				      1514276416);
	}
	return true;
    }
    
    boolean method8700(int i) {
	if (i < 0)
	    return false;
	if (i != anInt7079 * 1745032899) {
	    anInt7079 = i * 802802155;
	    anInt7080 = Math.max(anInt7079 * 1745032899, 1) * 1791194049;
	    aClass520_7069.method8654(Math.max(-1487496127 * anInt7080, 4096),
				      410071628);
	}
	return true;
    }
    
    void method8701(int i) throws IOException {
	aClass520_7069.method8657(false, (byte) 59);
	Class329.method5834(aShortArray7067, 332663538);
	Class329.method5834(aShortArray7072, -372048862);
	Class329.method5834(aShortArray7068, -11891804);
	Class329.method5834(aShortArray7065, -2137773157);
	Class329.method5834(aShortArray7070, 428989950);
	Class329.method5834(aShortArray7077, 653573915);
	Class329.method5834(aShortArray7074, 1816483393);
	aClass543_7075.method8956((byte) -47);
	for (int i_19_ = 0; i_19_ < 4; i_19_++)
	    aClass316Array7073[i_19_].method5708(-832672044);
	aClass527_7076.method8772((short) 255);
	aClass527_7078.method8772((short) 255);
	aClass316_7071.method5708(-1372878395);
	aClass317_7066.method5729((byte) -80);
    }
    
    void method8702() throws IOException {
	aClass520_7069.method8657(false, (byte) 35);
	Class329.method5834(aShortArray7067, 648211601);
	Class329.method5834(aShortArray7072, 810710818);
	Class329.method5834(aShortArray7068, 1957836451);
	Class329.method5834(aShortArray7065, -401454196);
	Class329.method5834(aShortArray7070, 1367565052);
	Class329.method5834(aShortArray7077, -1559458439);
	Class329.method5834(aShortArray7074, -2125232742);
	aClass543_7075.method8956((byte) -111);
	for (int i = 0; i < 4; i++)
	    aClass316Array7073[i].method5708(-2038126477);
	aClass527_7076.method8772((short) 255);
	aClass527_7078.method8772((short) 255);
	aClass316_7071.method5708(-896882978);
	aClass317_7066.method5729((byte) -2);
    }
    
    boolean method8703(int i, int i_20_, int i_21_, int i_22_) {
	if (i > 8 || i_20_ > 4 || i_21_ > 4)
	    return false;
	aClass543_7075.method8952(i_20_, i, 1922259963);
	int i_23_ = 1 << i_21_;
	aClass527_7076.method8765(i_23_, (short) 12625);
	aClass527_7078.method8765(i_23_, (short) 20526);
	anInt7081 = (i_23_ - 1) * 925045027;
	return true;
    }
    
    boolean method8704(InputStream inputstream, OutputStream outputstream,
		       long l) throws IOException {
	aClass317_7066.method5726(inputstream, -290488327);
	aClass520_7069.method8655(outputstream, 2063738905);
	method8701(-2114769875);
	int i = Class275.method5147((byte) 3);
	int i_24_ = 0;
	int i_25_ = 0;
	int i_26_ = 0;
	int i_27_ = 0;
	long l_28_ = 0L;
	byte i_29_ = 0;
	while (l < 0L || l_28_ < l) {
	    int i_30_ = (int) l_28_ & -1311529333 * anInt7081;
	    if (aClass317_7066.method5740(aShortArray7067, i_30_ + (i << 4),
					  1608569341)
		== 0) {
		Class542 class542
		    = aClass543_7075.method8953((int) l_28_, i_29_, (byte) -8);
		if (!Class574.method9738(i, 606122340))
		    i_29_
			= class542.method8945(aClass317_7066,
					      aClass520_7069
						  .method8661(i_24_, (byte) 3),
					      487283628);
		else
		    i_29_ = class542.method8947(aClass317_7066, -891379064);
		aClass520_7069.method8677(i_29_, (byte) -34);
		i = Class255.method4647(i, (byte) -71);
		l_28_++;
	    } else {
		int i_31_;
		if (aClass317_7066.method5740(aShortArray7068, i, 495238453)
		    == 1) {
		    i_31_ = 0;
		    if (aClass317_7066.method5740(aShortArray7065, i,
						  917911909)
			== 0) {
			if (aClass317_7066.method5740(aShortArray7072,
						      (i << 4) + i_30_,
						      -1223430046)
			    == 0) {
			    i = Exception_Sub6.method17946(i, -2144751043);
			    i_31_ = 1;
			}
		    } else {
			int i_32_;
			if (aClass317_7066.method5740(aShortArray7070, i,
						      -2002935758)
			    == 0)
			    i_32_ = i_25_;
			else {
			    if (aClass317_7066.method5740(aShortArray7077, i,
							  1298412646)
				== 0)
				i_32_ = i_26_;
			    else {
				i_32_ = i_27_;
				i_27_ = i_26_;
			    }
			    i_26_ = i_25_;
			}
			i_25_ = i_24_;
			i_24_ = i_32_;
		    }
		    if (0 == i_31_) {
			i_31_
			    = aClass527_7078.method8775(aClass317_7066, i_30_,
							(byte) -7) + 2;
			i = Class145_Sub2.method15497(i, 1723814233);
		    }
		} else {
		    i_27_ = i_26_;
		    i_26_ = i_25_;
		    i_25_ = i_24_;
		    i_31_ = 2 + aClass527_7076.method8775(aClass317_7066,
							  i_30_, (byte) -21);
		    i = Class214.method4104(i, (byte) 19);
		    int i_33_ = aClass316Array7073
				    [Class34.method925(i_31_, -860095039)]
				    .method5707(aClass317_7066, 740053173);
		    if (i_33_ >= 4) {
			int i_34_ = (i_33_ >> 1) - 1;
			i_24_ = (0x2 | i_33_ & 0x1) << i_34_;
			if (i_33_ < 14)
			    i_24_ += Class261.method4817(aShortArray7074,
							 i_24_ - i_33_ - 1,
							 aClass317_7066, i_34_,
							 1989277052);
			else {
			    i_24_ += aClass317_7066.method5727(i_34_ - 4,
							       8272787) << 4;
			    i_24_ += aClass316_7071.method5712(aClass317_7066,
							       (byte) 68);
			    if (i_24_ < 0) {
				if (i_24_ != -1)
				    return false;
				break;
			    }
			}
		    } else
			i_24_ = i_33_;
		}
		if ((long) i_24_ >= l_28_ || i_24_ >= anInt7080 * -1487496127)
		    return false;
		aClass520_7069.method8659(i_24_, i_31_, 157795429);
		l_28_ += (long) i_31_;
		i_29_ = aClass520_7069.method8661(0, (byte) 3);
	    }
	}
	aClass520_7069.method8658(1054278927);
	aClass520_7069.method8656(-1278215326);
	aClass317_7066.method5728(811218045);
	return true;
    }
    
    boolean method8705(byte[] is) {
	if (is.length < 5)
	    return false;
	int i = is[0] & 0xff;
	int i_35_ = i % 9;
	int i_36_ = i / 9;
	int i_37_ = i_36_ % 5;
	int i_38_ = i_36_ / 5;
	int i_39_ = 0;
	for (int i_40_ = 0; i_40_ < 4; i_40_++)
	    i_39_ += (is[i_40_ + 1] & 0xff) << i_40_ * 8;
	if (!method8703(i_35_, i_37_, i_38_, 125525761))
	    return false;
	return method8694(i_39_, (byte) -98);
    }
    
    boolean method8706(InputStream inputstream, OutputStream outputstream,
		       long l) throws IOException {
	aClass317_7066.method5726(inputstream, -561478938);
	aClass520_7069.method8655(outputstream, -375592483);
	method8701(-2113723258);
	int i = Class275.method5147((byte) 3);
	int i_41_ = 0;
	int i_42_ = 0;
	int i_43_ = 0;
	int i_44_ = 0;
	long l_45_ = 0L;
	byte i_46_ = 0;
	while (l < 0L || l_45_ < l) {
	    int i_47_ = (int) l_45_ & -1311529333 * anInt7081;
	    if (aClass317_7066.method5740(aShortArray7067, i_47_ + (i << 4),
					  -1380862663)
		== 0) {
		Class542 class542
		    = aClass543_7075.method8953((int) l_45_, i_46_,
						(byte) -31);
		if (!Class574.method9738(i, 606122340))
		    i_46_
			= class542.method8945(aClass317_7066,
					      aClass520_7069
						  .method8661(i_41_, (byte) 3),
					      1879628909);
		else
		    i_46_ = class542.method8947(aClass317_7066, -1246021250);
		aClass520_7069.method8677(i_46_, (byte) -54);
		i = Class255.method4647(i, (byte) -113);
		l_45_++;
	    } else {
		int i_48_;
		if (aClass317_7066.method5740(aShortArray7068, i, 322014224)
		    == 1) {
		    i_48_ = 0;
		    if (aClass317_7066.method5740(aShortArray7065, i,
						  1913763335)
			== 0) {
			if (aClass317_7066.method5740(aShortArray7072,
						      (i << 4) + i_47_,
						      -1744191983)
			    == 0) {
			    i = Exception_Sub6.method17946(i, -2046242579);
			    i_48_ = 1;
			}
		    } else {
			int i_49_;
			if (aClass317_7066.method5740(aShortArray7070, i,
						      -1913847439)
			    == 0)
			    i_49_ = i_42_;
			else {
			    if (aClass317_7066.method5740(aShortArray7077, i,
							  -1362816503)
				== 0)
				i_49_ = i_43_;
			    else {
				i_49_ = i_44_;
				i_44_ = i_43_;
			    }
			    i_43_ = i_42_;
			}
			i_42_ = i_41_;
			i_41_ = i_49_;
		    }
		    if (0 == i_48_) {
			i_48_
			    = aClass527_7078.method8775(aClass317_7066, i_47_,
							(byte) -19) + 2;
			i = Class145_Sub2.method15497(i, 879429704);
		    }
		} else {
		    i_44_ = i_43_;
		    i_43_ = i_42_;
		    i_42_ = i_41_;
		    i_48_ = 2 + aClass527_7076.method8775(aClass317_7066,
							  i_47_, (byte) -50);
		    i = Class214.method4104(i, (byte) 77);
		    int i_50_ = aClass316Array7073
				    [Class34.method925(i_48_, -1828452322)]
				    .method5707(aClass317_7066, 396112401);
		    if (i_50_ >= 4) {
			int i_51_ = (i_50_ >> 1) - 1;
			i_41_ = (0x2 | i_50_ & 0x1) << i_51_;
			if (i_50_ < 14)
			    i_41_ += Class261.method4817(aShortArray7074,
							 i_41_ - i_50_ - 1,
							 aClass317_7066, i_51_,
							 1842186283);
			else {
			    i_41_ += aClass317_7066.method5727(i_51_ - 4,
							       8272787) << 4;
			    i_41_ += aClass316_7071.method5712(aClass317_7066,
							       (byte) 12);
			    if (i_41_ < 0) {
				if (i_41_ != -1)
				    return false;
				break;
			    }
			}
		    } else
			i_41_ = i_50_;
		}
		if ((long) i_41_ >= l_45_ || i_41_ >= anInt7080 * -1487496127)
		    return false;
		aClass520_7069.method8659(i_41_, i_48_, 905645408);
		l_45_ += (long) i_48_;
		i_46_ = aClass520_7069.method8661(0, (byte) 3);
	    }
	}
	aClass520_7069.method8658(1418845342);
	aClass520_7069.method8656(-1278215326);
	aClass317_7066.method5728(2008652507);
	return true;
    }
    
    boolean method8707(int i) {
	if (i < 0)
	    return false;
	if (i != anInt7079 * 1745032899) {
	    anInt7079 = i * 802802155;
	    anInt7080 = Math.max(anInt7079 * 1745032899, 1) * 1791194049;
	    aClass520_7069.method8654(Math.max(-1487496127 * anInt7080, 4096),
				      1755115662);
	}
	return true;
    }
    
    Class522() {
	aClass317_7066 = new Class317();
	aShortArray7067 = new short[192];
	aShortArray7068 = new short[12];
	aShortArray7065 = new short[12];
	aShortArray7070 = new short[12];
	aShortArray7077 = new short[12];
	aShortArray7072 = new short[192];
	aClass316Array7073 = new Class316[4];
	aShortArray7074 = new short[114];
	aClass316_7071 = new Class316(4);
	aClass527_7076 = new Class527(this);
	aClass527_7078 = new Class527(this);
	aClass543_7075 = new Class543(this);
	anInt7079 = -802802155;
	anInt7080 = -1791194049;
	for (int i = 0; i < 4; i++)
	    aClass316Array7073[i] = new Class316(6);
    }
    
    boolean method8708(byte[] is) {
	if (is.length < 5)
	    return false;
	int i = is[0] & 0xff;
	int i_52_ = i % 9;
	int i_53_ = i / 9;
	int i_54_ = i_53_ % 5;
	int i_55_ = i_53_ / 5;
	int i_56_ = 0;
	for (int i_57_ = 0; i_57_ < 4; i_57_++)
	    i_56_ += (is[i_57_ + 1] & 0xff) << i_57_ * 8;
	if (!method8703(i_52_, i_54_, i_55_, 125525761))
	    return false;
	return method8694(i_56_, (byte) -70);
    }
    
    boolean method8709(byte[] is) {
	if (is.length < 5)
	    return false;
	int i = is[0] & 0xff;
	int i_58_ = i % 9;
	int i_59_ = i / 9;
	int i_60_ = i_59_ % 5;
	int i_61_ = i_59_ / 5;
	int i_62_ = 0;
	for (int i_63_ = 0; i_63_ < 4; i_63_++)
	    i_62_ += (is[i_63_ + 1] & 0xff) << i_63_ * 8;
	if (!method8703(i_58_, i_60_, i_61_, 125525761))
	    return false;
	return method8694(i_62_, (byte) 4);
    }
    
    boolean method8710(byte[] is) {
	if (is.length < 5)
	    return false;
	int i = is[0] & 0xff;
	int i_64_ = i % 9;
	int i_65_ = i / 9;
	int i_66_ = i_65_ % 5;
	int i_67_ = i_65_ / 5;
	int i_68_ = 0;
	for (int i_69_ = 0; i_69_ < 4; i_69_++)
	    i_68_ += (is[i_69_ + 1] & 0xff) << i_69_ * 8;
	if (!method8703(i_64_, i_66_, i_67_, 125525761))
	    return false;
	return method8694(i_68_, (byte) -2);
    }
    
    boolean method8711(byte[] is) {
	if (is.length < 5)
	    return false;
	int i = is[0] & 0xff;
	int i_70_ = i % 9;
	int i_71_ = i / 9;
	int i_72_ = i_71_ % 5;
	int i_73_ = i_71_ / 5;
	int i_74_ = 0;
	for (int i_75_ = 0; i_75_ < 4; i_75_++)
	    i_74_ += (is[i_75_ + 1] & 0xff) << i_75_ * 8;
	if (!method8703(i_70_, i_72_, i_73_, 125525761))
	    return false;
	return method8694(i_74_, (byte) -86);
    }
    
    static final void method8712(Class669 class669, byte i) {
	if (136304939 * client.anInt11195 >= 5
	    && client.anInt11195 * 136304939 <= 9)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= client.anInt11195 * 136304939;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method8713(Class669 class669, short i) {
	if (!Class599.aClass298_Sub1_7871.method5388((byte) 62)
		 .method5600(610319503))
	    throw new RuntimeException();
	Class347_Sub3 class347_sub3
	    = ((Class347_Sub3)
	       Class599.aClass298_Sub1_7871.method5380((byte) -126));
	class347_sub3.method15851(Class492.aClass434_5343, -1, 0.0F,
				  (byte) 109);
	client.aBool11147 = true;
    }
    
    static final void method8714(Class669 class669, byte i) {
	int i_76_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_76_, 211488802);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_76_ >> 16];
	Class497.method8137(class247, class243, class669, (short) 15090);
    }
    
    public static void method8715(int i, String string, int i_77_, int i_78_) {
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = Class429.method6804(Class583.aClass583_7782, i, -1,
				  (short) 2275);
	if (null != class534_sub18_sub8) {
	    Class669 class669 = Class567.method9559((byte) 73);
	    class669.anIntArray8605
		= new int[-39710947 * class534_sub18_sub8.anInt11754];
	    class669.anObjectArray8611
		= new String[class534_sub18_sub8.anInt11755 * 1127446605];
	    class669.anObjectArray8611[0] = string;
	    class669.anIntArray8605[0] = i_77_;
	    Class292.method5307(class534_sub18_sub8, 500000, class669,
				1833417405);
	}
    }
    
    static final void method8716(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_79_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_80_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	int i_81_ = ((RuntimeException_Sub4.aClass56_12127.method1218
			  (i_79_, -1581069180).method18361
		      (i_80_, -1923608425).anInt8333)
		     * 41641943);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_81_;
    }
    
    static void method8717(Class185 class185, int i) {
	if (Class228.method4188(1798544210) && Class302.method5570((byte) 93))
	    Class672.method11091(0, 0, Class706_Sub4.anInt10994 * 1771907305,
				 350, 1076908767);
	class185.method3373(0, 0, 1771907305 * Class706_Sub4.anInt10994, 350);
	class185.method3298(0, 0, Class706_Sub4.anInt10994 * 1771907305, 350,
			    Class114.anInt1390 * 431834035 << 24 | 0x332277,
			    1);
	int i_82_ = 350 / (-103516429 * Class114.anInt1384);
	if (-1716872169 * Class114.anInt1385 > 0) {
	    int i_83_ = 346 - Class114.anInt1384 * -103516429 - 4;
	    int i_84_ = (i_83_ * i_82_
			 / (i_82_ + -1716872169 * Class114.anInt1385 - 1));
	    int i_85_ = 4;
	    if (Class114.anInt1385 * -1716872169 > 1)
		i_85_ += ((-1716872169 * Class114.anInt1385 - 1
			   - Class114.anInt1393 * -596800939)
			  * (i_83_ - i_84_)
			  / (Class114.anInt1385 * -1716872169 - 1));
	    class185.method3298(Class706_Sub4.anInt10994 * 1771907305 - 16,
				i_85_, 12, i_84_,
				(Class114.anInt1390 * 431834035 << 24
				 | 0x332277),
				2);
	    for (int i_86_ = -596800939 * Class114.anInt1393;
		 (i_86_ < i_82_ + -596800939 * Class114.anInt1393
		  && i_86_ < -1716872169 * Class114.anInt1385);
		 i_86_++) {
		String[] strings
		    = Class387.method6504((Class200_Sub11.aStringArray9930
					   [i_86_]),
					  '\010', -818773119);
		int i_87_ = ((Class706_Sub4.anInt10994 * 1771907305 - 8 - 16)
			     / strings.length);
		for (int i_88_ = 0; i_88_ < strings.length; i_88_++) {
		    int i_89_ = i_87_ * i_88_ + 8;
		    class185.method3373(i_89_, 0, i_89_ + i_87_ - 8, 350);
		    Class539_Sub1.aClass171_10327.method2828
			(Class311.method5666(strings[i_88_], 202783357), i_89_,
			 (350 - Class114.anInt1386 * -583687411 - 2
			  - Class67.aClass16_720.anInt189 * 728893755
			  - ((i_86_ - Class114.anInt1393 * -596800939)
			     * (Class114.anInt1384 * -103516429))),
			 -1, -16777216, (byte) 70);
		}
	    }
	}
	Class219.aClass171_2307.method2829("881 1",
					   (Class706_Sub4.anInt10994
					    * 1771907305) - 25,
					   330, -1, -16777216, -1548363462);
	class185.method3373(0, 0, 1771907305 * Class706_Sub4.anInt10994, 350);
	class185.method3294(0, 350 - -583687411 * Class114.anInt1386,
			    1771907305 * Class706_Sub4.anInt10994, -1,
			    587291367);
	Class231.aClass171_2325.method2828
	    (new StringBuilder().append("--> ").append
		 (Class311.method5666(Class114.aString1396, 202783357))
		 .toString(),
	     10, 350 - Class322.aClass16_3420.anInt189 * 728893755 - 1, -1,
	     -16777216, (byte) 91);
	if (Class534_Sub36.aBool10800) {
	    int i_90_ = -1;
	    if (client.anInt11101 % 30 > 15)
		i_90_ = 16777215;
	    class185.method3302
		((10
		  + (Class322.aClass16_3420.method728
		     (new StringBuilder().append("--> ").append
			  (Class311.method5666
			       (Class114.aString1396, 202783357)
			       .substring(0, -1360080309 * Class114.anInt1389))
			  .toString(),
		      2088190309))),
		 350 - Class322.aClass16_3420.anInt189 * 728893755 - 11, 12,
		 i_90_, -289554695);
	}
	class185.method3537();
	Class24.method854((byte) 82);
    }
    
    static void method8718(int i) {
	if (Class212.method4013(1304187262)) {
	    if (null == Class200_Sub11.aStringArray9930)
		Class56.method1226(1811186092);
	    Class114.aBool1383 = true;
	    Class114.anInt1390 = 0;
	}
    }
    
    static final void method8719(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	Class676 class676
	    = ((Class676)
	       Class448.method7319(Class676.method11130((byte) 43),
				   (class669.anIntArray8595
				    [class669.anInt8600 * 2088438307]),
				   2088438307));
	Class597 class597
	    = new Class597(class669.anIntArray8595
			   [class669.anInt8600 * 2088438307 + 1]);
	if (-1 == -217302955 * class597.anInt7860)
	    throw new RuntimeException("");
	if (class676 != Class676.aClass676_8644
	    && class676 != Class676.aClass676_8649
	    && Class676.aClass676_8650 != class676)
	    throw new RuntimeException("");
	if (client.aClass100_11264 != null) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4239,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16687(class597.anInt7859 * -424199969, 1968394612);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16507(-1166289421 * class597.anInt7861, 1412986130);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16559(class676.method93(), 1993919282);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 87);
	}
    }
    
    static void method8720(int i, int i_91_) {
	if (513656689 * Class680.anInt8668 == 131)
	    Class65.anInt671 = -829940197 * i;
	else if (220 == 513656689 * Class680.anInt8668)
	    Class65.anInt701 = i * 1385443459;
    }
}
