/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.RandomAccessFile;

final class Class286 implements Interface29
{
    public long method177(String string, short i) {
	return Class197.method3821(string, -1898575002);
    }
    
    public long method176(String string) {
	return Class197.method3821(string, -1898575002);
    }
    
    public long method175(String string) {
	return Class197.method3821(string, -1898575002);
    }
    
    public long method178(String string) {
	return Class197.method3821(string, -1898575002);
    }
    
    public static File method5264(String string, byte i) {
	if (!Class504.aBool5630)
	    throw new RuntimeException("");
	File file = (File) Class504.aHashtable5632.get(string);
	if (file != null)
	    return file;
	File file_0_ = new File(Class504.aFile5631, string);
	RandomAccessFile randomaccessfile = null;
	File file_1_;
	try {
	    File file_2_ = new File(file_0_.getParent());
	    if (!file_2_.exists())
		throw new RuntimeException("");
	    randomaccessfile = new RandomAccessFile(file_0_, "rw");
	    int i_3_ = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i_3_);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    Class504.aHashtable5632.put(string, file_0_);
	    file_1_ = file_0_;
	} catch (Exception exception) {
	    try {
		if (randomaccessfile != null) {
		    randomaccessfile.close();
		    Object object = null;
		}
	    } catch (Exception exception_4_) {
		/* empty */
	    }
	    throw new RuntimeException();
	}
	return file_1_;
    }
    
    static void method5265(int i, int i_5_, boolean bool, short i_6_) {
	Class113.aBoolArrayArray1374[i][i_5_] = bool;
    }
    
    public static String method5266(int i) {
	return Class217.method4116("www", false, (byte) 0);
    }
    
    static final void method5267(Class669 class669, byte i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub27_10781,
	     (class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]),
	     -553859576);
	Class672.method11096((byte) 1);
    }
}
