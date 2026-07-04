/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class24
{
    long aLong228;
    long aLong229;
    RandomAccessFile aRandomAccessFile230;
    
    public final int method828(byte[] is, int i, int i_0_) throws IOException {
	int i_1_ = aRandomAccessFile230.read(is, i, i_0_);
	if (i_1_ > 0)
	    aLong228 += 8498401344032027077L * (long) i_1_;
	return i_1_;
    }
    
    final void method829(long l) throws IOException {
	aRandomAccessFile230.seek(l);
	aLong228 = 8498401344032027077L * l;
    }
    
    public final int method830(byte[] is, int i, int i_2_) throws IOException {
	int i_3_ = aRandomAccessFile230.read(is, i, i_2_);
	if (i_3_ > 0)
	    aLong228 += 8498401344032027077L * (long) i_3_;
	return i_3_;
    }
    
    public Class24(File file, String string, long l) throws IOException {
	if (l == -1L)
	    l = 9223372036854775807L;
	if (file.length() > l)
	    file.delete();
	aRandomAccessFile230 = new RandomAccessFile(file, string);
	aLong229 = l * -5599458437878436289L;
	aLong228 = 0L;
	int i = aRandomAccessFile230.read();
	if (-1 != i && !string.equals("r")) {
	    aRandomAccessFile230.seek(0L);
	    aRandomAccessFile230.write(i);
	}
	aRandomAccessFile230.seek(0L);
    }
    
    public final long method831(int i) throws IOException {
	return aRandomAccessFile230.length();
    }
    
    public final void method832(int i) throws IOException {
	if (aRandomAccessFile230 != null) {
	    aRandomAccessFile230.close();
	    aRandomAccessFile230 = null;
	}
    }
    
    public final void method833() throws IOException {
	if (aRandomAccessFile230 != null) {
	    aRandomAccessFile230.close();
	    aRandomAccessFile230 = null;
	}
    }
    
    public final long method834() throws IOException {
	return aRandomAccessFile230.length();
    }
    
    void method835() throws Throwable {
	if (aRandomAccessFile230 != null) {
	    System.out.println("");
	    method832(387460523);
	}
    }
    
    void method836() throws Throwable {
	if (aRandomAccessFile230 != null) {
	    System.out.println("");
	    method832(1714680976);
	}
    }
    
    final void method837(long l) throws IOException {
	aRandomAccessFile230.seek(l);
	aLong228 = 8498401344032027077L * l;
    }
    
    final void method838(long l) throws IOException {
	aRandomAccessFile230.seek(l);
	aLong228 = 8498401344032027077L * l;
    }
    
    public final void method839(byte[] is, int i, int i_4_)
	throws IOException {
	if (aLong228 * 2690672414746551565L + (long) i_4_
	    > -8787716330816028225L * aLong229) {
	    aRandomAccessFile230.seek(aLong229 * -8787716330816028225L);
	    aRandomAccessFile230.write(1);
	    throw new EOFException();
	}
	aRandomAccessFile230.write(is, i, i_4_);
	aLong228 += (long) i_4_ * 8498401344032027077L;
    }
    
    public final long method840() throws IOException {
	return aRandomAccessFile230.length();
    }
    
    public final long method841() throws IOException {
	return aRandomAccessFile230.length();
    }
    
    public final long method842() throws IOException {
	return aRandomAccessFile230.length();
    }
    
    public void finalize() throws Throwable {
	if (aRandomAccessFile230 != null) {
	    System.out.println("");
	    method832(308993706);
	}
    }
    
    public final int method843(byte[] is, int i, int i_5_, int i_6_)
	throws IOException {
	int i_7_ = aRandomAccessFile230.read(is, i, i_5_);
	if (i_7_ > 0)
	    aLong228 += 8498401344032027077L * (long) i_7_;
	return i_7_;
    }
    
    public final void method844(byte[] is, int i, int i_8_, int i_9_)
	throws IOException {
	if (aLong228 * 2690672414746551565L + (long) i_8_
	    > -8787716330816028225L * aLong229) {
	    aRandomAccessFile230.seek(aLong229 * -8787716330816028225L);
	    aRandomAccessFile230.write(1);
	    throw new EOFException();
	}
	aRandomAccessFile230.write(is, i, i_8_);
	aLong228 += (long) i_8_ * 8498401344032027077L;
    }
    
    void method845() throws Throwable {
	if (aRandomAccessFile230 != null) {
	    System.out.println("");
	    method832(1968170419);
	}
    }
    
    public final int method846(byte[] is, int i, int i_10_)
	throws IOException {
	int i_11_ = aRandomAccessFile230.read(is, i, i_10_);
	if (i_11_ > 0)
	    aLong228 += 8498401344032027077L * (long) i_11_;
	return i_11_;
    }
    
    public final int method847(byte[] is, int i, int i_12_)
	throws IOException {
	int i_13_ = aRandomAccessFile230.read(is, i, i_12_);
	if (i_13_ > 0)
	    aLong228 += 8498401344032027077L * (long) i_13_;
	return i_13_;
    }
    
    public final int method848(byte[] is, int i, int i_14_)
	throws IOException {
	int i_15_ = aRandomAccessFile230.read(is, i, i_14_);
	if (i_15_ > 0)
	    aLong228 += 8498401344032027077L * (long) i_15_;
	return i_15_;
    }
    
    public final int method849(byte[] is, int i, int i_16_)
	throws IOException {
	int i_17_ = aRandomAccessFile230.read(is, i, i_16_);
	if (i_17_ > 0)
	    aLong228 += 8498401344032027077L * (long) i_17_;
	return i_17_;
    }
    
    public final int method850(byte[] is, int i, int i_18_)
	throws IOException {
	int i_19_ = aRandomAccessFile230.read(is, i, i_18_);
	if (i_19_ > 0)
	    aLong228 += 8498401344032027077L * (long) i_19_;
	return i_19_;
    }
    
    public final int method851(byte[] is, int i, int i_20_)
	throws IOException {
	int i_21_ = aRandomAccessFile230.read(is, i, i_20_);
	if (i_21_ > 0)
	    aLong228 += 8498401344032027077L * (long) i_21_;
	return i_21_;
    }
    
    public final long method852() throws IOException {
	return aRandomAccessFile230.length();
    }
    
    public static Class50[] method853(int i) {
	return new Class50[] { Class50.aClass50_378, Class50.aClass50_367,
			       Class50.aClass50_368, Class50.aClass50_369,
			       Class50.aClass50_370, Class50.aClass50_371,
			       Class50.aClass50_389, Class50.aClass50_403,
			       Class50.aClass50_374, Class50.aClass50_376,
			       Class50.aClass50_375, Class50.aClass50_377,
			       Class50.aClass50_382, Class50.aClass50_366,
			       Class50.aClass50_380, Class50.aClass50_381,
			       Class50.aClass50_392, Class50.aClass50_390,
			       Class50.aClass50_384, Class50.aClass50_385,
			       Class50.aClass50_386, Class50.aClass50_387,
			       Class50.aClass50_388, Class50.aClass50_405,
			       Class50.aClass50_396, Class50.aClass50_391,
			       Class50.aClass50_408, Class50.aClass50_393,
			       Class50.aClass50_394, Class50.aClass50_395,
			       Class50.aClass50_400, Class50.aClass50_397,
			       Class50.aClass50_398, Class50.aClass50_399,
			       Class50.aClass50_407, Class50.aClass50_401,
			       Class50.aClass50_402, Class50.aClass50_379,
			       Class50.aClass50_372, Class50.aClass50_404,
			       Class50.aClass50_406, Class50.aClass50_383,
			       Class50.aClass50_373 };
    }
    
    static void method854(byte i) {
	/* empty */
    }
}
