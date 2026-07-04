/* Class347_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class347_Sub1 extends Class347
{
    boolean aBool10132;
    Class438 aClass438_10133;
    public Class443 aClass443_10134;
    int anInt10135;
    int anInt10136;
    Class438 aClass438_10137;
    Interface31 anInterface31_10138;
    Class438 aClass438_10139;
    Class438 aClass438_10140 = new Class438();
    Class443 aClass443_10141;
    
    public float method6153() {
	return 0.0F;
    }
    
    Class443 method15744() {
	Class443 class443 = Class443.method7197(aClass443_10134);
	if (aBool10132) {
	    Class438 class438 = anInterface31_10138.method186(709702990);
	    if (class438.method7012() < (float) (anInt10136 * -79670585)) {
		class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
		Class443 class443_0_
		    = anInterface31_10138.method183(2115427856);
		class438.method7021(class443_0_);
	    }
	    class438.aFloat4863 = 0.0F;
	    float f = (float) Math.atan2((double) class438.aFloat4864,
					 (double) class438.aFloat4865);
	    class438.method7074();
	    Class443 class443_1_ = new Class443();
	    class443_1_.method7147(0.0F, 1.0F, 0.0F, f);
	    class443.method7158(class443_1_);
	}
	return class443;
    }
    
    public void method15745(byte i) {
	if (anInterface31_10138 != null)
	    anInterface31_10138
		= (aClass298_3589.method5382(1898932982).method180
		   (anInterface31_10138.method184(1807070169),
		    anInterface31_10138.method90((byte) 5), (byte) 67));
    }
    
    public void method6136(float f, int[][][] is, Class468 class468, int i,
			   int i_2_, byte i_3_) {
	if (null != anInterface31_10138) {
	    method15746(is, class468, i, i_2_, 384352190);
	    Class443 class443 = method15761((byte) 1);
	    aClass443_10141.method7162(class443,
				       aClass298_3589.method5394(-1910060272));
	    if (Float.isNaN(aClass443_10141.aFloat4881))
		aClass443_10141.method7145(class443);
	    class443.method7140();
	    aClass438_10139.method6992(anInterface31_10138.method182
					   (-976379334)
					   .method16483(1085315771));
	    aClass298_3589.method5352(true, f, aClass438_10133,
				      aClass298_3589.method5391((byte) 50),
				      aClass438_10139, aClass438_10137,
				      (byte) 9);
	}
    }
    
    public Class347_Sub1(Class298 class298) {
	super(class298);
	aClass443_10134 = new Class443();
	anInt10136 = -2113818376;
	aClass438_10133 = new Class438(Float.NaN, Float.NaN, Float.NaN);
	aClass438_10139 = new Class438(Float.NaN, Float.NaN, Float.NaN);
	aClass438_10137 = new Class438();
	aClass443_10141 = new Class443();
    }
    
    void method15746(int[][][] is, Class468 class468, int i, int i_4_,
		     int i_5_) {
	if (method6131(763070403)
	    && (aClass298_3589.method5400(-1510023147)
		|| aClass298_3589.method5485((byte) 127))) {
	    Class534_Sub36 class534_sub36
		= anInterface31_10138.method182(-976379334);
	    anInt10135 = class534_sub36.anInt10796 * -1386163307;
	    int i_6_ = 1286734819 * anInt10135;
	    boolean bool = true;
	    if (3 == anInt10135 * 1286734819)
		bool = false;
	    else if (class468 != null
		     && (class468.method7612
			 (599803149 * class534_sub36.anInt10797 - i >> 9,
			  class534_sub36.anInt10799 * 33298755 - i_4_ >> 9,
			  (byte) 0))) {
		i_6_ = anInt10135 * 1286734819 + 1;
		bool = false;
	    }
	    if (aClass298_3589.method5485((byte) 25) && is != null) {
		float f = method15747(is, class468, i, i_4_, i_6_, bool,
				      -115173942);
		if (!Float.isNaN(f)) {
		    if (f > 0.0F) {
			float f_7_ = 3.1415927F;
			Class438 class438
			    = Class438.method6996(0.0F, 0.0F, 1.0F);
			class438.method7021(aClass443_10134);
			Class438 class438_8_
			    = Class438.method6996(class438.aFloat4864, 0.0F,
						  class438.aFloat4865);
			class438_8_.method7002();
			float f_9_
			    = Class438.method7027(class438, class438_8_);
			for (int i_10_ = 0; i_10_ < 10; i_10_++) {
			    float f_11_ = (f_7_ + f_9_) / 2.0F - f_9_;
			    float f_12_ = f_11_;
			    if (f > 0.0F)
				f_12_ *= -1.0F;
			    Class438 class438_13_
				= Class438.method6996(1.0F, 0.0F, 0.0F);
			    class438_13_.method7021(aClass443_10134);
			    Class443 class443 = Class443.method7137();
			    class443.method7146(class438_13_, f_12_);
			    aClass443_10134.method7158(class443);
			    aClass443_10134.method7153();
			    class438_13_.method7074();
			    class443.method7140();
			    f = method15747(is, class468, i, i_4_, i_6_, bool,
					    -1358527158);
			    if (Float.isNaN(f))
				break;
			    if (f > 0.0F)
				f_9_ += f_11_;
			    else
				f_7_ -= f_11_;
			}
		    }
		}
	    }
	}
    }
    
    float method15747(int[][][] is, Class468 class468, int i, int i_14_,
		      int i_15_, boolean bool, int i_16_) {
	Class443 class443 = method15761((byte) 1);
	Class438 class438 = method15748(class443, 1559928883);
	class443.method7140();
	int i_17_ = (int) class438.aFloat4864 - i >> 9;
	int i_18_ = (int) class438.aFloat4865 - i_14_ >> 9;
	if (i_17_ >= 0 && i_18_ >= 0 && 1 + i_17_ < is[0].length
	    && 1 + i_18_ < is[0][0].length) {
	    int i_19_ = i_15_;
	    if (bool && class468.method7612(i_17_, i_18_, (byte) 0))
		i_19_ = 1 + i_15_;
	    long l = (long) class438.aFloat4864 % 512L;
	    long l_20_ = (long) class438.aFloat4865 % 512L;
	    long l_21_
		= (512L - l) * (long) is[i_19_][i_17_][i_18_] * (512L - l_20_);
	    l_21_ += (512L - l_20_) * (l * (long) is[i_19_][i_17_ + 1][i_18_]);
	    l_21_ += (long) is[i_19_][i_17_][1 + i_18_] * (512L - l) * l_20_;
	    l_21_ += l_20_ * ((long) is[i_19_][i_17_ + 1][i_18_ + 1] * l);
	    l_21_ /= 262144L;
	    l_21_ -= 1024L;
	    float f = (float) -l_21_ - class438.aFloat4863;
	    class438.method7074();
	    return f;
	}
	class438.method7074();
	return Float.NaN;
    }
    
    Class438 method15748(Class443 class443, int i) {
	Class438 class438 = Class438.method6994(aClass438_10140);
	class438.method7021(class443);
	Class438 class438_22_ = Class438.method7005(aClass438_10139, class438);
	class438.method7074();
	return class438_22_;
    }
    
    public boolean method6131(int i) {
	return !Float.isNaN(aClass438_10133.aFloat4864);
    }
    
    Class443 method15749() {
	Class443 class443 = Class443.method7197(aClass443_10134);
	if (aBool10132) {
	    Class438 class438 = anInterface31_10138.method186(540356738);
	    if (class438.method7012() < (float) (anInt10136 * -79670585)) {
		class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
		Class443 class443_23_
		    = anInterface31_10138.method183(1985839668);
		class438.method7021(class443_23_);
	    }
	    class438.aFloat4863 = 0.0F;
	    float f = (float) Math.atan2((double) class438.aFloat4864,
					 (double) class438.aFloat4865);
	    class438.method7074();
	    Class443 class443_24_ = new Class443();
	    class443_24_.method7147(0.0F, 1.0F, 0.0F, f);
	    class443.method7158(class443_24_);
	}
	return class443;
    }
    
    public double[] method6130(int i) {
	double[] ds = new double[3];
	Class438 class438 = method6137(-766104715);
	ds[0] = (double) class438.aFloat4864;
	ds[1] = (double) class438.aFloat4863;
	ds[2] = (double) class438.aFloat4865;
	return ds;
    }
    
    public Class534_Sub36 method6133(byte i) {
	Class438 class438 = method6137(-1373940810);
	Class534_Sub36 class534_sub36
	    = new Class534_Sub36(1286734819 * anInt10135,
				 (int) class438.aFloat4864,
				 (int) class438.aFloat4863,
				 (int) class438.aFloat4865);
	class438.method7074();
	return class534_sub36;
    }
    
    void method15750(int[][][] is, Class468 class468, int i, int i_25_) {
	if (method6131(686204524)
	    && (aClass298_3589.method5400(-410038517)
		|| aClass298_3589.method5485((byte) 99))) {
	    Class534_Sub36 class534_sub36
		= anInterface31_10138.method182(-976379334);
	    anInt10135 = class534_sub36.anInt10796 * -1386163307;
	    int i_26_ = 1286734819 * anInt10135;
	    boolean bool = true;
	    if (3 == anInt10135 * 1286734819)
		bool = false;
	    else if (class468 != null
		     && (class468.method7612
			 (599803149 * class534_sub36.anInt10797 - i >> 9,
			  class534_sub36.anInt10799 * 33298755 - i_25_ >> 9,
			  (byte) 0))) {
		i_26_ = anInt10135 * 1286734819 + 1;
		bool = false;
	    }
	    if (aClass298_3589.method5485((byte) 120) && is != null) {
		float f = method15747(is, class468, i, i_25_, i_26_, bool,
				      -2114610938);
		if (!Float.isNaN(f)) {
		    if (f > 0.0F) {
			float f_27_ = 3.1415927F;
			Class438 class438
			    = Class438.method6996(0.0F, 0.0F, 1.0F);
			class438.method7021(aClass443_10134);
			Class438 class438_28_
			    = Class438.method6996(class438.aFloat4864, 0.0F,
						  class438.aFloat4865);
			class438_28_.method7002();
			float f_29_
			    = Class438.method7027(class438, class438_28_);
			for (int i_30_ = 0; i_30_ < 10; i_30_++) {
			    float f_31_ = (f_27_ + f_29_) / 2.0F - f_29_;
			    float f_32_ = f_31_;
			    if (f > 0.0F)
				f_32_ *= -1.0F;
			    Class438 class438_33_
				= Class438.method6996(1.0F, 0.0F, 0.0F);
			    class438_33_.method7021(aClass443_10134);
			    Class443 class443 = Class443.method7137();
			    class443.method7146(class438_33_, f_32_);
			    aClass443_10134.method7158(class443);
			    aClass443_10134.method7153();
			    class438_33_.method7074();
			    class443.method7140();
			    f = method15747(is, class468, i, i_25_, i_26_,
					    bool, -1546006564);
			    if (Float.isNaN(f))
				break;
			    if (f > 0.0F)
				f_29_ += f_31_;
			    else
				f_27_ -= f_31_;
			}
		    }
		}
	    }
	}
    }
    
    public Class438 method15751(byte i) {
	return aClass438_10140;
    }
    
    public float method15752(int i) {
	return Class238.method4426(aClass443_10134, 982400940);
    }
    
    public Class438 method6137(int i) {
	Class438 class438 = Class438.method6994(aClass438_10140);
	class438.method7021(aClass443_10141);
	Class438 class438_34_ = Class438.method7005(aClass438_10133, class438);
	class438.method7074();
	return class438_34_;
    }
    
    public void method15753(Interface31 interface31, Class438 class438,
			    Class443 class443, boolean bool, int i,
			    int[][][] is, Class468 class468, int i_35_,
			    int i_36_, int i_37_) {
	anInterface31_10138 = interface31;
	aClass438_10140.method6992(class438);
	aClass443_10134.method7145(class443);
	aBool10132 = bool;
	anInt10136 = i * -2029203721;
	anInt10135 = (anInterface31_10138.method182(-976379334).anInt10796
		      * -1386163307);
	method15746(is, class468, i_35_, i_36_, -724425941);
    }
    
    public void method6149(Class287 class287, int i, int i_38_, short i_39_) {
	Class438 class438 = method6137(289348995);
	class287.anInt3082 = -1803517691 * ((int) class438.aFloat4864 - i);
	class287.anInt3083 = (int) -class438.aFloat4863 * -1390317707;
	class287.anInt3081 = ((int) class438.aFloat4865 - i_38_) * 1552704101;
	class438.method7074();
    }
    
    public float method15754(int i) {
	return InputStream_Sub1.method17363(aClass443_10134, (byte) -13);
    }
    
    public double[] method6144() {
	double[] ds = new double[3];
	Class438 class438 = method6137(313190590);
	ds[0] = (double) class438.aFloat4864;
	ds[1] = (double) class438.aFloat4863;
	ds[2] = (double) class438.aFloat4865;
	return ds;
    }
    
    public void method15755() {
	if (anInterface31_10138 != null)
	    anInterface31_10138
		= (aClass298_3589.method5382(1851862326).method180
		   (anInterface31_10138.method184(1282789138),
		    anInterface31_10138.method90((byte) 5), (byte) 26));
    }
    
    public void method6132(float f, int[][][] is, Class468 class468, int i,
			   int i_40_) {
	if (null != anInterface31_10138) {
	    method15746(is, class468, i, i_40_, -835831777);
	    Class443 class443 = method15761((byte) 1);
	    aClass443_10141.method7162(class443,
				       aClass298_3589.method5394(-1910060272));
	    if (Float.isNaN(aClass443_10141.aFloat4881))
		aClass443_10141.method7145(class443);
	    class443.method7140();
	    aClass438_10139.method6992(anInterface31_10138.method182
					   (-976379334)
					   .method16483(479201672));
	    aClass298_3589.method5352(true, f, aClass438_10133,
				      aClass298_3589.method5391((byte) 41),
				      aClass438_10139, aClass438_10137,
				      (byte) 3);
	}
    }
    
    public boolean method6140() {
	return !Float.isNaN(aClass438_10133.aFloat4864);
    }
    
    public float method15756() {
	return Class238.method4426(aClass443_10134, -1101773695);
    }
    
    public boolean method6147() {
	return !Float.isNaN(aClass438_10133.aFloat4864);
    }
    
    public Class438 method6143() {
	Class438 class438 = Class438.method6994(aClass438_10140);
	class438.method7021(aClass443_10141);
	Class438 class438_41_ = Class438.method7005(aClass438_10133, class438);
	class438.method7074();
	return class438_41_;
    }
    
    public Class438 method6129() {
	Class438 class438 = Class438.method6994(aClass438_10140);
	class438.method7021(aClass443_10141);
	Class438 class438_42_ = Class438.method7005(aClass438_10133, class438);
	class438.method7074();
	return class438_42_;
    }
    
    public Class438 method6145() {
	Class438 class438 = Class438.method6994(aClass438_10140);
	class438.method7021(aClass443_10141);
	Class438 class438_43_ = Class438.method7005(aClass438_10133, class438);
	class438.method7074();
	return class438_43_;
    }
    
    Class443 method15757() {
	Class443 class443 = Class443.method7197(aClass443_10134);
	if (aBool10132) {
	    Class438 class438 = anInterface31_10138.method186(-1778938671);
	    if (class438.method7012() < (float) (anInt10136 * -79670585)) {
		class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
		Class443 class443_44_
		    = anInterface31_10138.method183(1923867181);
		class438.method7021(class443_44_);
	    }
	    class438.aFloat4863 = 0.0F;
	    float f = (float) Math.atan2((double) class438.aFloat4864,
					 (double) class438.aFloat4865);
	    class438.method7074();
	    Class443 class443_45_ = new Class443();
	    class443_45_.method7147(0.0F, 1.0F, 0.0F, f);
	    class443.method7158(class443_45_);
	}
	return class443;
    }
    
    public Class438 method15758() {
	return aClass438_10133;
    }
    
    public Class534_Sub36 method6135() {
	Class438 class438 = method6137(1235860003);
	Class534_Sub36 class534_sub36
	    = new Class534_Sub36(1286734819 * anInt10135,
				 (int) class438.aFloat4864,
				 (int) class438.aFloat4863,
				 (int) class438.aFloat4865);
	class438.method7074();
	return class534_sub36;
    }
    
    public void method6138(float f, int[][][] is, Class468 class468, int i,
			   int i_46_) {
	if (null != anInterface31_10138) {
	    method15746(is, class468, i, i_46_, -1345789142);
	    Class443 class443 = method15761((byte) 1);
	    aClass443_10141.method7162(class443,
				       aClass298_3589.method5394(-1910060272));
	    if (Float.isNaN(aClass443_10141.aFloat4881))
		aClass443_10141.method7145(class443);
	    class443.method7140();
	    aClass438_10139.method6992(anInterface31_10138.method182
					   (-976379334)
					   .method16483(620174663));
	    aClass298_3589.method5352(true, f, aClass438_10133,
				      aClass298_3589.method5391((byte) 51),
				      aClass438_10139, aClass438_10137,
				      (byte) -51);
	}
    }
    
    public void method6150(Class287 class287, int i, int i_47_) {
	Class438 class438 = method6137(779781679);
	class287.anInt3082 = -1803517691 * ((int) class438.aFloat4864 - i);
	class287.anInt3083 = (int) -class438.aFloat4863 * -1390317707;
	class287.anInt3081 = ((int) class438.aFloat4865 - i_47_) * 1552704101;
	class438.method7074();
    }
    
    public void method6151(Class534_Sub40 class534_sub40) {
	Class296 class296
	    = Class530.method8850(class534_sub40.method16527(2004237893),
				  -70982030);
	int i = class534_sub40.method16529((byte) 1);
	aClass438_10140.method7080(class534_sub40);
	aClass443_10134.method7143(class534_sub40);
	if (class534_sub40.method16527(-715763703) == 1)
	    aBool10132 = true;
	else
	    aBool10132 = false;
	anInt10136 = class534_sub40.method16529((byte) 1) * -2029203721;
	anInterface31_10138
	    = aClass298_3589.method5382(2087583539).method180(class296, i,
							      (byte) 28);
    }
    
    public Class438 method6146() {
	Class438 class438 = Class438.method6994(aClass438_10140);
	class438.method7021(aClass443_10141);
	Class438 class438_48_ = Class438.method7005(aClass438_10133, class438);
	class438.method7074();
	return class438_48_;
    }
    
    public void method6152(Class534_Sub40 class534_sub40) {
	Class296 class296
	    = Class530.method8850(class534_sub40.method16527(-1116287477),
				  -453876165);
	int i = class534_sub40.method16529((byte) 1);
	aClass438_10140.method7080(class534_sub40);
	aClass443_10134.method7143(class534_sub40);
	if (class534_sub40.method16527(-256076490) == 1)
	    aBool10132 = true;
	else
	    aBool10132 = false;
	anInt10136 = class534_sub40.method16529((byte) 1) * -2029203721;
	anInterface31_10138
	    = aClass298_3589.method5382(1740448359).method180(class296, i,
							      (byte) 79);
    }
    
    public float method6154() {
	return 0.0F;
    }
    
    public void method15759() {
	if (anInterface31_10138 != null)
	    anInterface31_10138
		= (aClass298_3589.method5382(1962765024).method180
		   (anInterface31_10138.method184(-583489985),
		    anInterface31_10138.method90((byte) 5), (byte) 91));
    }
    
    public Class438 method15760(int i) {
	return aClass438_10133;
    }
    
    Class443 method15761(byte i) {
	Class443 class443 = Class443.method7197(aClass443_10134);
	if (aBool10132) {
	    Class438 class438 = anInterface31_10138.method186(-671858059);
	    if (class438.method7012() < (float) (anInt10136 * -79670585)) {
		class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
		Class443 class443_49_
		    = anInterface31_10138.method183(1917016027);
		class438.method7021(class443_49_);
	    }
	    class438.aFloat4863 = 0.0F;
	    float f = (float) Math.atan2((double) class438.aFloat4864,
					 (double) class438.aFloat4865);
	    class438.method7074();
	    Class443 class443_50_ = new Class443();
	    class443_50_.method7147(0.0F, 1.0F, 0.0F, f);
	    class443.method7158(class443_50_);
	}
	return class443;
    }
    
    Class443 method15762() {
	Class443 class443 = Class443.method7197(aClass443_10134);
	if (aBool10132) {
	    Class438 class438 = anInterface31_10138.method186(-815931737);
	    if (class438.method7012() < (float) (anInt10136 * -79670585)) {
		class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
		Class443 class443_51_
		    = anInterface31_10138.method183(1677803928);
		class438.method7021(class443_51_);
	    }
	    class438.aFloat4863 = 0.0F;
	    float f = (float) Math.atan2((double) class438.aFloat4864,
					 (double) class438.aFloat4865);
	    class438.method7074();
	    Class443 class443_52_ = new Class443();
	    class443_52_.method7147(0.0F, 1.0F, 0.0F, f);
	    class443.method7158(class443_52_);
	}
	return class443;
    }
    
    public void method6148(Class534_Sub40 class534_sub40, byte i) {
	Class296 class296
	    = Class530.method8850(class534_sub40.method16527(1511435062),
				  1218982700);
	int i_53_ = class534_sub40.method16529((byte) 1);
	aClass438_10140.method7080(class534_sub40);
	aClass443_10134.method7143(class534_sub40);
	if (class534_sub40.method16527(1702085007) == 1)
	    aBool10132 = true;
	else
	    aBool10132 = false;
	anInt10136 = class534_sub40.method16529((byte) 1) * -2029203721;
	anInterface31_10138
	    = aClass298_3589.method5382(2009529855).method180(class296, i_53_,
							      (byte) 40);
    }
    
    public void method6142(Class287 class287, int i, int i_54_) {
	Class438 class438 = method6137(428445402);
	class287.anInt3082 = -1803517691 * ((int) class438.aFloat4864 - i);
	class287.anInt3083 = (int) -class438.aFloat4863 * -1390317707;
	class287.anInt3081 = ((int) class438.aFloat4865 - i_54_) * 1552704101;
	class438.method7074();
    }
    
    public float method6134(int i) {
	return 0.0F;
    }
    
    public void method15763() {
	if (anInterface31_10138 != null)
	    anInterface31_10138
		= (aClass298_3589.method5382(1795087468).method180
		   (anInterface31_10138.method184(1389795929),
		    anInterface31_10138.method90((byte) 5), (byte) 39));
    }
    
    void method15764(int[][][] is, Class468 class468, int i, int i_55_) {
	if (method6131(191458282)
	    && (aClass298_3589.method5400(789619027)
		|| aClass298_3589.method5485((byte) 21))) {
	    Class534_Sub36 class534_sub36
		= anInterface31_10138.method182(-976379334);
	    anInt10135 = class534_sub36.anInt10796 * -1386163307;
	    int i_56_ = 1286734819 * anInt10135;
	    boolean bool = true;
	    if (3 == anInt10135 * 1286734819)
		bool = false;
	    else if (class468 != null
		     && (class468.method7612
			 (599803149 * class534_sub36.anInt10797 - i >> 9,
			  class534_sub36.anInt10799 * 33298755 - i_55_ >> 9,
			  (byte) 0))) {
		i_56_ = anInt10135 * 1286734819 + 1;
		bool = false;
	    }
	    if (aClass298_3589.method5485((byte) 123) && is != null) {
		float f = method15747(is, class468, i, i_55_, i_56_, bool,
				      -167487075);
		if (!Float.isNaN(f)) {
		    if (f > 0.0F) {
			float f_57_ = 3.1415927F;
			Class438 class438
			    = Class438.method6996(0.0F, 0.0F, 1.0F);
			class438.method7021(aClass443_10134);
			Class438 class438_58_
			    = Class438.method6996(class438.aFloat4864, 0.0F,
						  class438.aFloat4865);
			class438_58_.method7002();
			float f_59_
			    = Class438.method7027(class438, class438_58_);
			for (int i_60_ = 0; i_60_ < 10; i_60_++) {
			    float f_61_ = (f_57_ + f_59_) / 2.0F - f_59_;
			    float f_62_ = f_61_;
			    if (f > 0.0F)
				f_62_ *= -1.0F;
			    Class438 class438_63_
				= Class438.method6996(1.0F, 0.0F, 0.0F);
			    class438_63_.method7021(aClass443_10134);
			    Class443 class443 = Class443.method7137();
			    class443.method7146(class438_63_, f_62_);
			    aClass443_10134.method7158(class443);
			    aClass443_10134.method7153();
			    class438_63_.method7074();
			    class443.method7140();
			    f = method15747(is, class468, i, i_55_, i_56_,
					    bool, -272176430);
			    if (Float.isNaN(f))
				break;
			    if (f > 0.0F)
				f_59_ += f_61_;
			    else
				f_57_ -= f_61_;
			}
		    }
		}
	    }
	}
    }
    
    Class443 method15765() {
	Class443 class443 = Class443.method7197(aClass443_10134);
	if (aBool10132) {
	    Class438 class438 = anInterface31_10138.method186(-1603177278);
	    if (class438.method7012() < (float) (anInt10136 * -79670585)) {
		class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
		Class443 class443_64_
		    = anInterface31_10138.method183(1955190765);
		class438.method7021(class443_64_);
	    }
	    class438.aFloat4863 = 0.0F;
	    float f = (float) Math.atan2((double) class438.aFloat4864,
					 (double) class438.aFloat4865);
	    class438.method7074();
	    Class443 class443_65_ = new Class443();
	    class443_65_.method7147(0.0F, 1.0F, 0.0F, f);
	    class443.method7158(class443_65_);
	}
	return class443;
    }
    
    float method15766(int[][][] is, Class468 class468, int i, int i_66_,
		      int i_67_, boolean bool) {
	Class443 class443 = method15761((byte) 1);
	Class438 class438 = method15748(class443, 1559928883);
	class443.method7140();
	int i_68_ = (int) class438.aFloat4864 - i >> 9;
	int i_69_ = (int) class438.aFloat4865 - i_66_ >> 9;
	if (i_68_ >= 0 && i_69_ >= 0 && 1 + i_68_ < is[0].length
	    && 1 + i_69_ < is[0][0].length) {
	    int i_70_ = i_67_;
	    if (bool && class468.method7612(i_68_, i_69_, (byte) 0))
		i_70_ = 1 + i_67_;
	    long l = (long) class438.aFloat4864 % 512L;
	    long l_71_ = (long) class438.aFloat4865 % 512L;
	    long l_72_
		= (512L - l) * (long) is[i_70_][i_68_][i_69_] * (512L - l_71_);
	    l_72_ += (512L - l_71_) * (l * (long) is[i_70_][i_68_ + 1][i_69_]);
	    l_72_ += (long) is[i_70_][i_68_][1 + i_69_] * (512L - l) * l_71_;
	    l_72_ += l_71_ * ((long) is[i_70_][i_68_ + 1][i_69_ + 1] * l);
	    l_72_ /= 262144L;
	    l_72_ -= 1024L;
	    float f = (float) -l_72_ - class438.aFloat4863;
	    class438.method7074();
	    return f;
	}
	class438.method7074();
	return Float.NaN;
    }
    
    Class438 method15767(Class443 class443) {
	Class438 class438 = Class438.method6994(aClass438_10140);
	class438.method7021(class443);
	Class438 class438_73_ = Class438.method7005(aClass438_10139, class438);
	class438.method7074();
	return class438_73_;
    }
    
    Class438 method15768(Class443 class443) {
	Class438 class438 = Class438.method6994(aClass438_10140);
	class438.method7021(class443);
	Class438 class438_74_ = Class438.method7005(aClass438_10139, class438);
	class438.method7074();
	return class438_74_;
    }
    
    public boolean method6141() {
	return !Float.isNaN(aClass438_10133.aFloat4864);
    }
    
    public Class438 method15769() {
	return aClass438_10133;
    }
    
    public Class438 method15770() {
	return aClass438_10133;
    }
    
    public void method6139(float f, int[][][] is, Class468 class468, int i,
			   int i_75_) {
	if (null != anInterface31_10138) {
	    method15746(is, class468, i, i_75_, -587218870);
	    Class443 class443 = method15761((byte) 1);
	    aClass443_10141.method7162(class443,
				       aClass298_3589.method5394(-1910060272));
	    if (Float.isNaN(aClass443_10141.aFloat4881))
		aClass443_10141.method7145(class443);
	    class443.method7140();
	    aClass438_10139.method6992(anInterface31_10138.method182
					   (-976379334)
					   .method16483(-124506016));
	    aClass298_3589.method5352(true, f, aClass438_10133,
				      aClass298_3589.method5391((byte) 59),
				      aClass438_10139, aClass438_10137,
				      (byte) -3);
	}
    }
    
    public float method15771() {
	return InputStream_Sub1.method17363(aClass443_10134, (byte) -75);
    }
    
    static final void method15772(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub28_10786
		  .method17131(-1175450571);
    }
    
    static void method15773(short i) {
	Class547_Sub1.anIntArray10834[44] = 71;
	Class547_Sub1.anIntArray10834[45] = 26;
	Class547_Sub1.anIntArray10834[46] = 72;
	Class547_Sub1.anIntArray10834[47] = 73;
	Class547_Sub1.anIntArray10834[59] = 57;
	Class547_Sub1.anIntArray10834[61] = 27;
	Class547_Sub1.anIntArray10834[91] = 42;
	Class547_Sub1.anIntArray10834[92] = 74;
	Class547_Sub1.anIntArray10834[93] = 43;
	Class547_Sub1.anIntArray10834[192] = 28;
	Class547_Sub1.anIntArray10834[222] = 58;
	Class547_Sub1.anIntArray10834[520] = 59;
    }
}
