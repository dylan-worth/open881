/* Class333 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class333 implements Interface32
{
    Class400 aClass400_3500;
    Class315 aClass315_3501;
    
    public void method205(boolean bool, byte i) {
	Class311 class311
	    = aClass315_3501.method5698(-644775195 * aClass400_3500.anInt4131,
					-320922841);
	if (null != class311) {
	    int i_0_ = ((aClass400_3500.aClass401_4128.method6586
			 (aClass400_3500.anInt4122 * -1629800665,
			  client.anInt11047 * -321474631, -1197384453))
			+ -940612791 * aClass400_3500.anInt4129);
	    int i_1_ = ((aClass400_3500.aClass391_4123.method6544
			 (-1902641631 * aClass400_3500.anInt4132,
			  43072843 * client.anInt11192, (byte) 94))
			+ aClass400_3500.anInt4125 * -1180497457);
	    if (aClass400_3500.aBool4124)
		Class254.aClass185_2683.method3297
		    (i_0_, i_1_, aClass400_3500.anInt4122 * -1629800665,
		     aClass400_3500.anInt4132 * -1902641631,
		     aClass400_3500.anInt4130 * -89067315, 0);
	    i_1_ += method5864(Class231.aClass171_2325, class311.aString3362,
			       i_0_, i_1_, 5, -1777690217) * 12;
	    i_1_ += 8;
	    if (aClass400_3500.aBool4124)
		Class254.aClass185_2683.method3303
		    (i_0_, i_1_,
		     i_0_ + aClass400_3500.anInt4122 * -1629800665 - 1, i_1_,
		     -89067315 * aClass400_3500.anInt4130, 0);
	    i_1_ = ++i_1_ + method5864(Class231.aClass171_2325,
				       class311.aString3360, i_0_, i_1_, 5,
				       -1394351402) * 12;
	    i_1_ += 5;
	    i_1_ += method5864(Class231.aClass171_2325, class311.aString3361,
			       i_0_, i_1_, 5, -2146936023) * 12;
	}
    }
    
    public boolean method199(int i) {
	return aClass315_3501.method5697((byte) -79);
    }
    
    Class333(Class315 class315, Class400 class400) {
	aClass400_3500 = class400;
	aClass315_3501 = class315;
    }
    
    public void method201(short i) {
	/* empty */
    }
    
    int method5864(Class171 class171, String string, int i, int i_2_, int i_3_,
		   int i_4_) {
	return class171.method2844(string, i + i_3_, i_3_ + i_2_,
				   (aClass400_3500.anInt4122 * -1629800665
				    - 2 * i_3_),
				   (-1902641631 * aClass400_3500.anInt4132
				    - i_3_ * 2),
				   aClass400_3500.anInt4126 * 1537726007,
				   aClass400_3500.anInt4127 * 519044141, 0, 0,
				   0, null, null, null, 0, 0, 202025040);
    }
    
    public void method202(boolean bool) {
	Class311 class311
	    = aClass315_3501.method5698(-644775195 * aClass400_3500.anInt4131,
					-1094358302);
	if (null != class311) {
	    int i = ((aClass400_3500.aClass401_4128.method6586
		      (aClass400_3500.anInt4122 * -1629800665,
		       client.anInt11047 * -321474631, -1684302096))
		     + -940612791 * aClass400_3500.anInt4129);
	    int i_5_ = ((aClass400_3500.aClass391_4123.method6544
			 (-1902641631 * aClass400_3500.anInt4132,
			  43072843 * client.anInt11192, (byte) 5))
			+ aClass400_3500.anInt4125 * -1180497457);
	    if (aClass400_3500.aBool4124)
		Class254.aClass185_2683.method3297
		    (i, i_5_, aClass400_3500.anInt4122 * -1629800665,
		     aClass400_3500.anInt4132 * -1902641631,
		     aClass400_3500.anInt4130 * -89067315, 0);
	    i_5_ += method5864(Class231.aClass171_2325, class311.aString3362,
			       i, i_5_, 5, -1072937370) * 12;
	    i_5_ += 8;
	    if (aClass400_3500.aBool4124)
		Class254.aClass185_2683.method3303
		    (i, i_5_, i + aClass400_3500.anInt4122 * -1629800665 - 1,
		     i_5_, -89067315 * aClass400_3500.anInt4130, 0);
	    i_5_ = ++i_5_ + method5864(Class231.aClass171_2325,
				       class311.aString3360, i, i_5_, 5,
				       -1356835872) * 12;
	    i_5_ += 5;
	    i_5_ += method5864(Class231.aClass171_2325, class311.aString3361,
			       i, i_5_, 5, -1408489795) * 12;
	}
    }
    
    public boolean method206() {
	return aClass315_3501.method5697((byte) -10);
    }
    
    public void method203() {
	/* empty */
    }
    
    public boolean method208() {
	return aClass315_3501.method5697((byte) -14);
    }
    
    public boolean method200() {
	return aClass315_3501.method5697((byte) 20);
    }
    
    public boolean method207() {
	return aClass315_3501.method5697((byte) 44);
    }
    
    public boolean method204() {
	return aClass315_3501.method5697((byte) -4);
    }
    
    int method5865(Class171 class171, String string, int i, int i_6_,
		   int i_7_) {
	return class171.method2844(string, i + i_7_, i_7_ + i_6_,
				   (aClass400_3500.anInt4122 * -1629800665
				    - 2 * i_7_),
				   (-1902641631 * aClass400_3500.anInt4132
				    - i_7_ * 2),
				   aClass400_3500.anInt4126 * 1537726007,
				   aClass400_3500.anInt4127 * 519044141, 0, 0,
				   0, null, null, null, 0, 0, 202025040);
    }
    
    static void method5866(byte i) {
	try {
	    File file
		= new File(Class534_Sub42_Sub2.aString11882, "random.dat");
	    if (file.exists())
		Class498.aClass38_5580
		    = new Class38(new Class24(file, "rw", 25L), 24, 0);
	    else {
	    while_33_:
		for (int i_8_ = 0; i_8_ < Class597.aStringArray7863.length;
		     i_8_++) {
		    for (int i_9_ = 0; i_9_ < Class206.aStringArray2233.length;
			 i_9_++) {
			File file_10_
			    = new File(new StringBuilder().append
					   (Class206.aStringArray2233[i_9_])
					   .append
					   (Class597.aStringArray7863[i_8_])
					   .append
					   (File.separatorChar).append
					   ("random.dat").toString());
			if (file_10_.exists()) {
			    Class498.aClass38_5580
				= new Class38(new Class24(file_10_, "rw", 25L),
					      24, 0);
			    break while_33_;
			}
		    }
		}
	    }
	    if (null == Class498.aClass38_5580) {
		RandomAccessFile randomaccessfile
		    = new RandomAccessFile(file, "rw");
		int i_11_ = randomaccessfile.read();
		randomaccessfile.seek(0L);
		randomaccessfile.write(i_11_);
		randomaccessfile.seek(0L);
		randomaccessfile.close();
		Class498.aClass38_5580
		    = new Class38(new Class24(file, "rw", 25L), 24, 0);
	    }
	} catch (IOException ioexception) {
	    /* empty */
	}
    }
    
    static final void method5867(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class567.method9560(class247, class243, class669, (byte) 1);
    }
    
    static final void method5868(Class669 class669, int i) {
	Class70.anInt743 = 0;
    }
    
    static final void method5869(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
		  .method16923((byte) 126);
    }
    
    static final void method5870(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_12_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_13_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (client.aClass492ArrayArray11027[i_13_][i_12_].anInt5335
	       * 1065325223);
    }
}
