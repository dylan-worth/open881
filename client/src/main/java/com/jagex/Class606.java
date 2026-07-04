/* Class606 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.IOException;

public abstract class Class606
{
    public int anInt7981;
    static final int anInt7982 = 2;
    static final int anInt7983 = 1;
    static final int anInt7984 = 8;
    public int anInt7985;
    int anInt7986;
    static final int anInt7987 = 4;
    public static Class472 aClass472_7988;
    
    public boolean method10038() {
	return 0 != (anInt7985 * -1395637313 & 0x1);
    }
    
    public boolean method10039(byte i) {
	return 0 != (anInt7985 * -1395637313 & 0x8);
    }
    
    public boolean method10040(int i) {
	return 0 != (anInt7985 * -1395637313 & 0x4);
    }
    
    public boolean method10041() {
	return 0 != (anInt7985 * -1395637313 & 0x1);
    }
    
    Class606() {
	/* empty */
    }
    
    public boolean method10042(int i) {
	return 0 != (anInt7985 * -1395637313 & 0x1);
    }
    
    public boolean method10043(int i) {
	return 0 != (anInt7985 * -1395637313 & 0x2);
    }
    
    public boolean method10044() {
	return 0 != (anInt7985 * -1395637313 & 0x1);
    }
    
    public boolean method10045() {
	return 0 != (anInt7985 * -1395637313 & 0x1);
    }
    
    public boolean method10046() {
	return 0 != (anInt7985 * -1395637313 & 0x2);
    }
    
    public boolean method10047() {
	return 0 != (anInt7985 * -1395637313 & 0x4);
    }
    
    public boolean method10048() {
	return 0 != (anInt7985 * -1395637313 & 0x8);
    }
    
    static final void method10049(Class669 class669, int i) {
	class669.anInt8600 -= 308999563;
    }
    
    public static Class24 method10050(String string, String string_0_,
				      boolean bool, int i) {
	File file = new File(Class228.aFile2322,
			     new StringBuilder().append("preferences").append
				 (string).append
				 (".dat").toString());
	do {
	    if (file.exists()) {
		Class24 class24;
		try {
		    Class24 class24_1_ = new Class24(file, "rw", 10000L);
		    class24 = class24_1_;
		} catch (IOException ioexception) {
		    break;
		}
		return class24;
	    }
	} while (false);
	String string_2_ = "";
	if (-225897511 * Class208.anInt2241 == 33)
	    string_2_ = "_rc";
	else if (34 == Class208.anInt2241 * -225897511)
	    string_2_ = "_wip";
	File file_3_ = new File(Class534_Sub42_Sub2.aString11882,
				new StringBuilder().append("jagex_").append
				    (string_0_).append
				    ("_preferences").append
				    (string).append
				    (string_2_).append
				    (".dat").toString());
	do {
	    if (!bool && file_3_.exists()) {
		Class24 class24;
		try {
		    Class24 class24_4_ = new Class24(file_3_, "rw", 10000L);
		    class24 = class24_4_;
		} catch (IOException ioexception) {
		    break;
		}
		return class24;
	    }
	} while (false);
	Class24 class24;
	try {
	    Class24 class24_5_ = new Class24(file, "rw", 10000L);
	    class24 = class24_5_;
	} catch (IOException ioexception) {
	    throw new RuntimeException();
	}
	return class24;
    }
    
    public static void method10051(int i) {
	int i_6_ = client.aClass512_11100.method8417(-493380976);
	int i_7_ = client.aClass512_11100.method8418(-1533611049);
	Class113.aBoolArrayArray1374 = new boolean[i_6_ >> 3][i_7_ >> 3];
    }
    
    public static void method10052(Class150 class150, int i) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(2,
				  (long) (class150.anInt1694 * -1270946121));
	class534_sub18_sub6.method18182(-1052637456);
    }
    
    public static void method10053(int i, int i_8_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(21, (long) i);
	class534_sub18_sub6.method18182(-1052637456);
    }
    
    public static void method10054(Class243 class243, Class247 class247,
				   boolean bool, int i) {
	Class662.method10991(class243.aClass247Array2412, class247, bool,
			     -895735094);
    }
}
