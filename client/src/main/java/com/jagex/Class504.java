/* Class504 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class504
{
    static boolean aBool5630 = false;
    static File aFile5631;
    static Hashtable aHashtable5632 = new Hashtable(16);
    static FileOutputStream aFileOutputStream5633;
    
    public static String method8310() {
	return aFile5631.getAbsolutePath();
    }
    
    public static String method8311() {
	return aFile5631.getAbsolutePath();
    }
    
    static void method8312(File file) {
	aFile5631 = file;
	if (!aFile5631.exists())
	    throw new RuntimeException("");
	aBool5630 = true;
    }
    
    Class504() throws Throwable {
	throw new Error();
    }
    
    static void method8313(File file) {
	aFile5631 = file;
	if (!aFile5631.exists())
	    throw new RuntimeException("");
	aBool5630 = true;
    }
    
    static void method8314(File file) {
	aFile5631 = file;
	if (!aFile5631.exists())
	    throw new RuntimeException("");
	aBool5630 = true;
    }
    
    static void method8315(File file) {
	aFile5631 = file;
	if (!aFile5631.exists())
	    throw new RuntimeException("");
	aBool5630 = true;
    }
    
    public static String method8316() {
	return aFile5631.getAbsolutePath();
    }
    
    static void method8317(File file) {
	aFile5631 = file;
	if (!aFile5631.exists())
	    throw new RuntimeException("");
	aBool5630 = true;
    }
    
    public static File method8318(String string) {
	if (!aBool5630)
	    throw new RuntimeException("");
	File file = (File) aHashtable5632.get(string);
	if (file != null)
	    return file;
	File file_0_ = new File(aFile5631, string);
	RandomAccessFile randomaccessfile = null;
	File file_1_;
	try {
	    File file_2_ = new File(file_0_.getParent());
	    if (!file_2_.exists())
		throw new RuntimeException("");
	    randomaccessfile = new RandomAccessFile(file_0_, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    aHashtable5632.put(string, file_0_);
	    file_1_ = file_0_;
	} catch (Exception exception) {
	    try {
		if (randomaccessfile != null) {
		    randomaccessfile.close();
		    Object object = null;
		}
	    } catch (Exception exception_3_) {
		/* empty */
	    }
	    throw new RuntimeException();
	}
	return file_1_;
    }
    
    static void method8319(int i) {
	if (Class415.anIntArray4666 == null)
	    Class415.anIntArray4666 = new int[65536];
	else
	    return;
	double d = 0.7;
	int i_4_ = 0;
	for (int i_5_ = 0; i_5_ < 512; i_5_++) {
	    float f = 360.0F * (0.0078125F + (float) (i_5_ >> 3) / 64.0F);
	    float f_6_ = 0.0625F + (float) (i_5_ & 0x7) / 8.0F;
	    for (int i_7_ = 0; i_7_ < 128; i_7_++) {
		float f_8_ = (float) i_7_ / 128.0F;
		float f_9_ = 0.0F;
		float f_10_ = 0.0F;
		float f_11_ = 0.0F;
		float f_12_ = f / 60.0F;
		int i_13_ = (int) f_12_;
		int i_14_ = i_13_ % 6;
		float f_15_ = f_12_ - (float) i_13_;
		float f_16_ = (1.0F - f_6_) * f_8_;
		float f_17_ = f_8_ * (1.0F - f_15_ * f_6_);
		float f_18_ = f_8_ * (1.0F - f_6_ * (1.0F - f_15_));
		if (0 == i_14_) {
		    f_9_ = f_8_;
		    f_10_ = f_18_;
		    f_11_ = f_16_;
		} else if (1 == i_14_) {
		    f_9_ = f_17_;
		    f_10_ = f_8_;
		    f_11_ = f_16_;
		} else if (i_14_ == 2) {
		    f_9_ = f_16_;
		    f_10_ = f_8_;
		    f_11_ = f_18_;
		} else if (i_14_ == 3) {
		    f_9_ = f_16_;
		    f_10_ = f_17_;
		    f_11_ = f_8_;
		} else if (4 == i_14_) {
		    f_9_ = f_18_;
		    f_10_ = f_16_;
		    f_11_ = f_8_;
		} else if (5 == i_14_) {
		    f_9_ = f_8_;
		    f_10_ = f_16_;
		    f_11_ = f_17_;
		}
		f_9_ = (float) Math.pow((double) f_9_, d);
		f_10_ = (float) Math.pow((double) f_10_, d);
		f_11_ = (float) Math.pow((double) f_11_, d);
		int i_19_ = (int) (256.0F * f_9_);
		int i_20_ = (int) (f_10_ * 256.0F);
		int i_21_ = (int) (256.0F * f_11_);
		int i_22_
		    = i_21_ + ((i_20_ << 8) + (-16777216 + (i_19_ << 16)));
		Class415.anIntArray4666[i_4_++] = i_22_;
	    }
	}
    }
    
    static final void method8320(Class669 class669, int i) {
	int i_23_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_23_, 860141200);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_23_ >> 16];
	Class543.method8958(class247, class243, class669, -2013779594);
    }
    
    static final void method8321(Class247 class247, Class669 class669, int i) {
	int i_24_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	int i_25_ = ((class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307])
		     - 1);
	int i_26_ = i_25_;
	if (6 != class247.anInt2496 * -1866862435
	    && 2 != -1866862435 * class247.anInt2496)
	    throw new RuntimeException("");
	Class307 class307
	    = ((Class307)
	       Class578.aClass44_Sub3_7743
		   .method91(939166901 * class247.anInt2497, -1758032172));
	if (class247.aClass301_2635 == null)
	    class247.aClass301_2635
		= new Class301(class307,
			       class247.anInt2496 * -1866862435 == 6);
	class247.aClass301_2635.aLong3238
	    = Class215.method4107(-148424092) * 8855449811293583851L;
	if (class307.aByteArray3291 != null) {
	    if (i_25_ < 0 || i_25_ >= class307.aByteArray3291.length)
		throw new RuntimeException("");
	    i_26_ = class307.aByteArray3291[i_25_];
	}
	if (null == class307.aShortArray3287 || i_26_ < 0
	    || i_26_ >= class307.aShortArray3287.length)
	    throw new RuntimeException("");
	class247.aClass301_2635.aShortArray3232[i_26_] = (short) i_24_;
	Class454.method7416(class247, -1145366420);
    }
    
    static final void method8322(Class669 class669, byte i) {
	Class247 class247
	    = Class112.method2017(class669.anIntArray8595[((class669.anInt8600
							    -= 308999563)
							   * 2088438307)],
				  1741176827);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 403396513 * class247.anInt2606;
    }
    
    static final void method8323(Class669 class669, int i) {
	int i_27_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class604.method10031((char) i_27_, 1799046898) ? 1 : 0;
    }
    
    static final void method8324(Class669 class669, byte i) {
	int i_28_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (i_28_ != -1) {
	    int i_29_ = i_28_ >> 14 & 0x3fff;
	    int i_30_ = i_28_ & 0x3fff;
	    Class597 class597 = client.aClass512_11100.method8416((byte) 83);
	    i_29_ -= class597.anInt7859 * -424199969;
	    if (i_29_ < 0)
		i_29_ = 0;
	    else if (i_29_ >= client.aClass512_11100.method8417(1932531677))
		i_29_ = client.aClass512_11100.method8417(425743908);
	    i_30_ -= -1166289421 * class597.anInt7861;
	    if (i_30_ < 0)
		i_30_ = 0;
	    else if (i_30_ >= client.aClass512_11100.method8418(-1533611049))
		i_30_ = client.aClass512_11100.method8418(-1533611049);
	    Class93.anInt901 = -1899572639 * ((i_29_ << 9) + 256);
	    Class106.anInt1312 = -309821991 * ((i_30_ << 9) + 256);
	} else {
	    Class93.anInt901 = 1899572639;
	    Class106.anInt1312 = 309821991;
	}
    }
    
    static final void method8325(Class534_Sub40_Sub1 class534_sub40_sub1,
				 byte i) {
	class534_sub40_sub1.method18294(1555889838);
	int i_31_ = -643758853 * client.anInt11037;
	Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
	    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
	       = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_31_]
	       = new Class654_Sub1_Sub5_Sub1_Sub2(client.aClass512_11100
						      .method8424((byte) 86)));
	class654_sub1_sub5_sub1_sub2.anInt11922 = i_31_ * -2061161143;
	int i_32_ = class534_sub40_sub1.method18295(30, -761815447);
	byte i_33_ = (byte) (i_32_ >> 28);
	int i_34_ = i_32_ >> 14 & 0x3fff;
	int i_35_ = i_32_ & 0x3fff;
	Class597 class597 = client.aClass512_11100.method8416((byte) 72);
	class654_sub1_sub5_sub1_sub2.anIntArray11977[0]
	    = i_34_ - -424199969 * class597.anInt7859;
	class654_sub1_sub5_sub1_sub2.anIntArray11978[0]
	    = i_35_ - -1166289421 * class597.anInt7861;
	class654_sub1_sub5_sub1_sub2.method10815
	    ((float) ((class654_sub1_sub5_sub1_sub2.anIntArray11977[0] << 9)
		      + (class654_sub1_sub5_sub1_sub2.method18545((byte) 1)
			 << 8)),
	     (class654_sub1_sub5_sub1_sub2.method10808().aClass438_4885
	      .aFloat4863),
	     (float) ((class654_sub1_sub5_sub1_sub2.anIntArray11978[0] << 9)
		      + (class654_sub1_sub5_sub1_sub2.method18545((byte) 1)
			 << 8)));
	Class674.anInt8633 = (class654_sub1_sub5_sub1_sub2.aByte10854
			      = class654_sub1_sub5_sub1_sub2.aByte10853
			      = i_33_) * -2078297599;
	if (client.aClass512_11100.method8552((byte) 0).method7612
	    (class654_sub1_sub5_sub1_sub2.anIntArray11977[0],
	     class654_sub1_sub5_sub1_sub2.anIntArray11978[0], (byte) 0))
	    class654_sub1_sub5_sub1_sub2.aByte10853++;
	if (null != Class108.aClass534_Sub40Array1319[i_31_])
	    class654_sub1_sub5_sub1_sub2.method18865((Class108
						      .aClass534_Sub40Array1319
						      [i_31_]),
						     (byte) 99);
	if (null != Class108.aClass534_Sub40Array1316[i_31_])
	    class654_sub1_sub5_sub1_sub2.method18866((Class108
						      .aClass534_Sub40Array1316
						      [i_31_]),
						     (byte) 0);
	Class108.anInt1321 = 0;
	Class108.anIntArray1322[((Class108.anInt1321 += 76736439) * -1843550713
				 - 1)]
	    = i_31_;
	Class108.aByteArray1317[i_31_] = (byte) 0;
	Class108.anInt1328 = 0;
	for (int i_36_ = 1; i_36_ < 2048; i_36_++) {
	    if (i_31_ != i_36_) {
		int i_37_ = class534_sub40_sub1.method18295(18, -761815447);
		int i_38_ = i_37_ >> 16 & 0x3;
		int i_39_ = i_37_ >> 8 & 0xff;
		int i_40_ = i_37_ & 0xff;
		Class60 class60
		    = Class108.aClass60Array1320[i_36_] = new Class60();
		class60.anInt646
		    = 186312257 * (i_40_ + ((i_39_ << 14) + (i_38_ << 28)));
		class60.anInt643 = 0;
		class60.anInt644 = -587751205;
		class60.aClass252_645 = Class252.aClass252_2658;
		class60.aBool642 = false;
		Class108.anIntArray1324
		    [(Class108.anInt1328 += -989241915) * 918952205 - 1]
		    = i_36_;
		Class108.aByteArray1317[i_36_] = (byte) 0;
	    }
	}
	class534_sub40_sub1.method18296(1867808746);
	Class305 class305
	    = Class599.aClass298_Sub1_7871.method5388((byte) -52);
	if (class305 == Class305.aClass305_3265) {
	    Class347_Sub1 class347_sub1
		= ((Class347_Sub1)
		   Class599.aClass298_Sub1_7871.method5380((byte) -128));
	    class347_sub1.method15745((byte) 1);
	}
	Class293 class293
	    = Class599.aClass298_Sub1_7871.method5425(1632228389);
	if (Class293.aClass293_3125 == class293) {
	    Class706_Sub4 class706_sub4
		= ((Class706_Sub4)
		   Class599.aClass298_Sub1_7871.method5381(1558550495));
	    class706_sub4.method17298(-1172483249);
	}
    }
    
    public static void method8326(int i) {
	for (Class534_Sub16 class534_sub16
		 = ((Class534_Sub16)
		    Class534_Sub16.aClass700_10468.method14135((byte) -1));
	     class534_sub16 != null;
	     class534_sub16 = (Class534_Sub16) Class534_Sub16
						   .aClass700_10468
						   .method14139(823247005)) {
	    if (class534_sub16.aBool10498)
		class534_sub16.method16151(761928614);
	}
	for (Class534_Sub16 class534_sub16
		 = ((Class534_Sub16)
		    Class534_Sub16.aClass700_10469.method14135((byte) -1));
	     class534_sub16 != null;
	     class534_sub16 = (Class534_Sub16) Class534_Sub16
						   .aClass700_10469
						   .method14139(2053790139)) {
	    if (class534_sub16.aBool10498)
		class534_sub16.method16151(-247198400);
	}
    }
    
    public static void method8327(String string, boolean bool,
				  boolean bool_41_, int i) {
	do {
	    try {
		if (string.equalsIgnoreCase("commands")
		    || string.equalsIgnoreCase("help")) {
		    Class73.method1567("commands - This command", -841168894);
		    Class73.method1567("cls - Clear console", -968198085);
		    Class73.method1567
			("displayfps - Toggle FPS and other information",
			 -1006524298);
		    Class73.method1567
			("renderer - Print graphics renderer information",
			 -1410481250);
		    Class73.method1567("heap - Print java memory information",
				       -1878649086);
		    Class73.method1567
			("getcamerapos - Print location and direction of camera for use in bug reports",
			 -1836843250);
		} else if (string.equalsIgnoreCase("cls")) {
		    Class114.anInt1385 = 0;
		    Class114.anInt1393 = 0;
		} else if (string.equalsIgnoreCase("displayfps")) {
		    client.aBool11262 = !client.aBool11262;
		    if (client.aBool11262)
			Class73.method1567("FPS on", -755542921);
		    else
			Class73.method1567("FPS off", -1333351519);
		} else if (string.equals("renderer")) {
		    Class176 class176 = Class254.aClass185_2683.method3232();
		    Class73.method1567(new StringBuilder().append
					   ("Toolkit ID: ").append
					   (Class44_Sub6
						.aClass534_Sub35_10989
						.aClass690_Sub7_10733
						.method16935(-1807368365))
					   .toString(),
				       -1760402967);
		    Class73.method1567(new StringBuilder().append
					   ("Vendor: ").append
					   (class176.anInt1844 * 1866206313)
					   .toString(),
				       -1118648725);
		    Class73.method1567(new StringBuilder().append("Name: ")
					   .append
					   (class176.aString1845).toString(),
				       -1257588895);
		    Class73.method1567(new StringBuilder().append
					   ("Version: ").append
					   (class176.anInt1846 * 1458635069)
					   .toString(),
				       -1943307711);
		    Class73.method1567(new StringBuilder().append
					   ("Device: ").append
					   (class176.aString1842).toString(),
				       -987259830);
		    Class73.method1567(new StringBuilder().append
					   ("Driver Version: ").append
					   (class176.aLong1848
					    * -1920893184504226295L)
					   .toString(),
				       -798515210);
		    String string_42_ = Class254.aClass185_2683.method3250();
		    if (string_42_.length() > 0)
			Class73.method1567(string_42_, -1451119813);
		} else if (string.equals("heap"))
		    Class73.method1567(new StringBuilder().append("Heap: ")
					   .append
					   (721369631 * Class498.anInt5589)
					   .append
					   ("MB").toString(),
				       -2018338007);
		else {
		    if (!string.equalsIgnoreCase("getcamerapos"))
			break;
		    Class597 class597
			= client.aClass512_11100.method8416((byte) 40);
		    if (Class10.anInt75 * -891094135 == 3) {
			Class438 class438 = Class599.aClass298_Sub1_7871
						.method5385((byte) 119);
			Class438 class438_43_ = Class599
						    .aClass298_Sub1_7871
						    .method5456(534512818);
			Class73.method1567
			    (new StringBuilder().append("Pos: ").append
				 (new Class597
				      ((Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.aByte10854),
				       (int) class438.aFloat4864 >> 9,
				       (int) class438.aFloat4865 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class247.method4595
				   (((int) class438.aFloat4864
				     - (-424199969 * class597.anInt7859 << 9)),
				    ((int) class438.aFloat4865
				     - (class597.anInt7861 * -1166289421
					<< 9)),
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    -1264685363)) + (int) class438.aFloat4863)
				 .toString(),
			     -1451956859);
			Class73.method1567
			    (new StringBuilder().append("Look: ").append
				 (new Class597
				      ((Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.aByte10854),
				       (int) class438_43_.aFloat4864 >> 9,
				       (int) class438_43_.aFloat4865 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class247.method4595
				   (((int) class438_43_.aFloat4864
				     - (-424199969 * class597.anInt7859 << 9)),
				    ((int) class438.aFloat4865
				     - (class597.anInt7861 * -1166289421
					<< 9)),
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    -1016360570)) + (int) class438.aFloat4863)
				 .toString(),
			     -746398734);
		    } else {
			Class73.method1567
			    (new StringBuilder().append("Pos: ").append
				 (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				  .aByte10854)
				 .append
				 (",").append
				 (((Class200_Sub13.anInt9937 * -116109187 >> 9)
				   + class597.anInt7859 * -424199969) >> 6)
				 .append
				 (",").append
				 (((Class636.anInt8305 * -1098179003 >> 9)
				   + class597.anInt7861 * -1166289421) >> 6)
				 .append
				 (",").append
				 (((Class200_Sub13.anInt9937 * -116109187 >> 9)
				   + -424199969 * class597.anInt7859) & 0x3f)
				 .append
				 (",").append
				 (((Class636.anInt8305 * -1098179003 >> 9)
				   + -1166289421 * class597.anInt7861) & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class247.method4595
				   (Class200_Sub13.anInt9937 * -116109187,
				    Class636.anInt8305 * -1098179003,
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    -2138867099))
				  - Class677.anInt8654 * 1529694271)
				 .toString(),
			     -1105607782);
			Class73.method1567
			    (new StringBuilder().append("Look: ").append
				 (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				  .aByte10854)
				 .append
				 (",").append
				 ((Class652.anInt8484 * 2006804215
				   + -424199969 * class597.anInt7859) >> 6)
				 .append
				 (",").append
				 ((1803758839 * Class609.anInt8007
				   + class597.anInt7861 * -1166289421) >> 6)
				 .append
				 (",").append
				 ((Class652.anInt8484 * 2006804215
				   + -424199969 * class597.anInt7859) & 0x3f)
				 .append
				 (",").append
				 ((Class609.anInt8007 * 1803758839
				   + class597.anInt7861 * -1166289421) & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class247.method4595
				   (Class652.anInt8484 * 2006804215,
				    Class609.anInt8007 * 1803758839,
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    -1686493282))
				  - Class341.anInt3554 * -1339841327)
				 .toString(),
			     -829799854);
		    }
		}
	    } catch (Exception exception) {
		Class73.method1567
		    (Class58.aClass58_469.method1245(Class539.aClass672_7171,
						     (byte) -56),
		     -1964581151);
	    }
	    return;
	} while (false);
	if (Class665.aClass665_8561 != client.aClass665_11211
	    || client.anInt11194 * 365872613 >= 2) {
	    try {
		if (string.equalsIgnoreCase("wm1")) {
		    Class159.method2611(1, -1, -1, false, -1098413288);
		    if (Class63.method1280(1346041749) == 1)
			Class73.method1567("Success", -1564546387);
		    else
			Class73.method1567("Failure", -1330413708);
		    return;
		}
		if (string.equalsIgnoreCase("wm2")) {
		    Class159.method2611(2, -1, -1, false, -1922178980);
		    if (Class63.method1280(265543436) == 2)
			Class73.method1567("Success", -1755565292);
		    else
			Class73.method1567("Failure", -1443038893);
		    return;
		}
		if (Class713.aBool8884 && string.equalsIgnoreCase("wm3")) {
		    Class159.method2611(3, 1024, 768, false, -373618052);
		    if (Class63.method1280(799487490) == 3)
			Class73.method1567("Success", -1697200102);
		    else
			Class73.method1567("Failure", -868295321);
		    return;
		}
		if (string.startsWith("setlobby ")) {
		    if (15 != -1850530127 * client.anInt11039)
			Class73.method1567("Failure", -1573798713);
		    else {
			int i_44_ = -1;
			Object object = null;
			string = string.substring(9);
			int i_45_ = string.indexOf(' ');
			if (-1 == i_45_)
			    Class73.method1567("Failure", -1802702468);
			else {
			    try {
				i_44_ = (Integer.parseInt
					 (string.substring(0, i_45_)));
			    } catch (NumberFormatException numberformatexception) {
				/* empty */
			    }
			    if (i_44_ == -1)
				Class73.method1567("Failure", -1788188770);
			    else {
				String string_46_
				    = new StringBuilder().append
					  (string.substring(i_45_ + 1).trim())
					  .append
					  (".runescape.com").toString();
				Class690_Sub21.method17074(string_46_, i_44_,
							   182373766);
				Class73.method1567("Success", -1922831326);
				return;
			    }
			    return;
			}
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tk0")) {
		    Class527.method8778(0, false, 1824152141);
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub7_10733.method16935(-1807368365)
			== 0) {
			Class73.method1567("Success", -1322887972);
			Class44_Sub6.aClass534_Sub35_10989.method16438
			    ((Class44_Sub6.aClass534_Sub35_10989
			      .aClass690_Sub7_10764),
			     0, -1019237005);
			Class672.method11096((byte) 1);
			client.aBool11048 = false;
		    } else
			Class73.method1567("Failure", -1621965353);
		    return;
		}
		if (string.equalsIgnoreCase("tk1")) {
		    Class527.method8778(1, false, -883262371);
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub7_10733.method16935(-1807368365)
			== 1) {
			Class73.method1567("Success", -1283374700);
			Class44_Sub6.aClass534_Sub35_10989.method16438
			    ((Class44_Sub6.aClass534_Sub35_10989
			      .aClass690_Sub7_10764),
			     1, 1966472327);
			Class672.method11096((byte) 1);
			client.aBool11048 = false;
		    } else
			Class73.method1567("Failure", -1377223713);
		    return;
		}
		if (string.equalsIgnoreCase("tk3")) {
		    Class527.method8778(3, false, 1833281171);
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub7_10733.method16935(-1807368365)
			== 3) {
			Class73.method1567("Success", -714197873);
			Class44_Sub6.aClass534_Sub35_10989.method16438
			    ((Class44_Sub6.aClass534_Sub35_10989
			      .aClass690_Sub7_10764),
			     3, 1014995845);
			Class672.method11096((byte) 1);
			client.aBool11048 = false;
		    } else
			Class73.method1567("Failure", -1981619216);
		    return;
		}
		if (string.equalsIgnoreCase("tk5")) {
		    Class527.method8778(5, false, 727235765);
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub7_10733.method16935(-1807368365)
			== 5) {
			Class73.method1567("Success", -1577144765);
			Class44_Sub6.aClass534_Sub35_10989.method16438
			    ((Class44_Sub6.aClass534_Sub35_10989
			      .aClass690_Sub7_10764),
			     5, -2111570706);
			Class672.method11096((byte) 1);
			client.aBool11048 = false;
		    } else
			Class73.method1567("Failure", -1862096981);
		    return;
		}
		if (string.equalsIgnoreCase("clientdrop")) {
		    if (16 == client.anInt11039 * -1850530127)
			Class515.method8589(-1663178506);
		    else if (-1850530127 * client.anInt11039 == 3)
			client.aClass100_11264.aBool1198 = true;
		    return;
		}
		if (string.equalsIgnoreCase("breakcon")) {
		    Class100[] class100s = client.aClass100Array11096;
		    for (int i_47_ = 0; i_47_ < class100s.length; i_47_++) {
			Class100 class100 = class100s[i_47_];
			if (class100.method1867(1360366237) != null)
			    class100.method1867(-1362080349)
				.method8973((byte) -52);
		    }
		    Class6.aClass450_56.method7342((byte) 30);
		    return;
		}
		if (string.startsWith("getclientvarpbit")) {
		    int i_48_ = Integer.parseInt(string.substring(17));
		    Class73.method1567(new StringBuilder().append
					   ("varpbit=").append
					   (Class78.aClass103_825.method119
					    (Class78.aClass103_825
						 .method107(i_48_, 1504047109),
					     -1549877938))
					   .toString(),
				       -1344204862);
		    return;
		}
		if (string.startsWith("getclientvarp")) {
		    int i_49_ = Integer.parseInt(string.substring(14));
		    Class73.method1567(new StringBuilder().append("varp=")
					   .append
					   (Class78.aClass103_825.method120
					    ((Class78.aClass103_825.method108
					      (Class453.aClass453_4946, i_49_,
					       1595078601)),
					     (byte) -52))
					   .toString(),
				       -1961985049);
		    return;
		}
		if (string.startsWith("directlogin")) {
		    String[] strings
			= Class387.method6504(string.substring(12), ' ',
					      270259425);
		    if (strings.length == 2 || strings.length == 3) {
			if (Class202.method3865((byte) 0))
			    Class534_Sub11_Sub10.method18230(1836132862);
			Class200_Sub6.method15576(strings[0], strings[1],
						  (strings.length > 2
						   ? strings[2] : ""),
						  true, -1284821456);
		    }
		    return;
		}
		if (string.startsWith("snlogin ")) {
		    String[] strings = Class387.method6504(string.substring(8),
							   ' ', -1359065468);
		    int i_50_ = Integer.parseInt(strings[0]);
		    String string_51_ = strings.length > 1 ? strings[1] : "";
		    Class89.method1713(i_50_, string_51_, true, -694654803);
		    return;
		}
		if (string.startsWith("setoutput ")) {
		    File file = new File(string.substring(10));
		    if (file.exists()) {
			file = new File(new StringBuilder().append
					    (string.substring(10)).append
					    (".").append
					    (Class250.method4604((byte) -85))
					    .append
					    (".log").toString());
			if (file.exists()) {
			    Class73.method1567("file already exists!",
					       -822988542);
			    return;
			}
		    }
		    if (aFileOutputStream5633 != null) {
			aFileOutputStream5633.close();
			aFileOutputStream5633 = null;
		    }
		    try {
			aFileOutputStream5633 = new FileOutputStream(file);
		    } catch (FileNotFoundException filenotfoundexception) {
			Class73.method1567(new StringBuilder().append
					       ("Could not create ").append
					       (file.getName()).toString(),
					   -2143408151);
		    } catch (SecurityException securityexception) {
			Class73.method1567(new StringBuilder().append
					       ("Cannot write to ").append
					       (file.getName()).toString(),
					   -1103345686);
		    }
		    return;
		}
		if (string.equals("closeoutput")) {
		    if (null != aFileOutputStream5633)
			aFileOutputStream5633.close();
		    aFileOutputStream5633 = null;
		    return;
		}
		if (string.startsWith("runscript ")) {
		    File file = new File(string.substring(10));
		    if (!file.exists()) {
			Class73.method1567("No such file", -1403239441);
			return;
		    }
		    byte[] is = Class690_Sub24.method17099(file, -1896265667);
		    if (null == is) {
			Class73.method1567("Failed to read file", -967081953);
			return;
		    }
		    String[] strings = (Class387.method6504
					((Class656.method10893
					  (Class563.method9512(is, (byte) -12),
					   '\r', "", 539365965)),
					 '\n', 51114273));
		    Class634.method10532(strings, (byte) -120);
		}
		if (16 == -1850530127 * client.anInt11039
		    || client.anInt11039 * -1850530127 == 9) {
		    Class100 class100 = Class201.method3864(2095398292);
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4234,
					      class100.aClass13_1183,
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16506(string.length() + 3, 1546862288);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16506(bool ? 1 : 0, 227984957);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16506(bool_41_ ? 1 : 0, 1518470779);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16713(string, -746849171);
		    class100.method1863(class534_sub19, (byte) 115);
		}
	    } catch (Exception exception) {
		Class73.method1567
		    (Class58.aClass58_469.method1245(Class539.aClass672_7171,
						     (byte) -123),
		     -2029407881);
		return;
	    }
	}
	if (16 != -1850530127 * client.anInt11039
	    && -1850530127 * client.anInt11039 != 9)
	    Class73.method1567
		(new StringBuilder().append
		     (Class58.aClass58_463.method1245(Class539.aClass672_7171,
						      (byte) -114))
		     .append
		     (string).toString(),
		 -800604164);
    }
}
