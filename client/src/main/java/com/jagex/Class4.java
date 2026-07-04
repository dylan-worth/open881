/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class Class4
{
    static int anInt39;
    
    static void method529(File file, byte[] is, int i) throws IOException {
	DataInputStream datainputstream
	    = (new DataInputStream
	       (new BufferedInputStream(new FileInputStream(file))));
	try {
	    datainputstream.readFully(is, 0, i);
	} catch (EOFException eofexception) {
	    /* empty */
	}
	datainputstream.close();
    }
    
    static void method530(File file, byte[] is, int i) throws IOException {
	DataInputStream datainputstream
	    = (new DataInputStream
	       (new BufferedInputStream(new FileInputStream(file))));
	try {
	    datainputstream.readFully(is, 0, i);
	} catch (EOFException eofexception) {
	    /* empty */
	}
	datainputstream.close();
    }
    
    Class4() throws Throwable {
	throw new Error();
    }
    
    static void method531(File file, byte[] is, int i) throws IOException {
	DataInputStream datainputstream
	    = (new DataInputStream
	       (new BufferedInputStream(new FileInputStream(file))));
	try {
	    datainputstream.readFully(is, 0, i);
	} catch (EOFException eofexception) {
	    /* empty */
	}
	datainputstream.close();
    }
    
    static void method532(File file, byte[] is, int i) throws IOException {
	DataInputStream datainputstream
	    = (new DataInputStream
	       (new BufferedInputStream(new FileInputStream(file))));
	try {
	    datainputstream.readFully(is, 0, i);
	} catch (EOFException eofexception) {
	    /* empty */
	}
	datainputstream.close();
    }
    
    static byte[] method533(File file, int i) {
	byte[] is;
	try {
	    byte[] is_0_ = new byte[i];
	    Class568.method9573(file, is_0_, i, 224460276);
	    is = is_0_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is;
    }
    
    static byte[] method534(File file, int i) {
	byte[] is;
	try {
	    byte[] is_1_ = new byte[i];
	    Class568.method9573(file, is_1_, i, 1206117300);
	    is = is_1_;
	} catch (IOException ioexception) {
	    return null;
	}
	return is;
    }
    
    static final void method535(Class669 class669, int i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_2_, 1423217302);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2466 * -1196182029;
    }
}
