/* Class546_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.net.Socket;

public class Class546_Sub1 extends Class546
{
    Socket aSocket10791;
    Class562 aClass562_10792;
    Class566 aClass566_10793;
    
    void method16460() {
	method8975(-380203915);
    }
    
    public boolean method8977(int i, byte i_0_) throws IOException {
	return aClass562_10792.method9452(i, 1629666145);
    }
    
    Class546_Sub1(Socket socket, int i) throws IOException {
	aSocket10791 = socket;
	aSocket10791.setSoTimeout(30000);
	aSocket10791.setTcpNoDelay(true);
	aSocket10791.setReceiveBufferSize(65536);
	aSocket10791.setSendBufferSize(65536);
	aClass562_10792 = new Class562(aSocket10791.getInputStream(), i);
	aClass566_10793 = new Class566(aSocket10791.getOutputStream(), i);
    }
    
    public int method8984(byte[] is, int i, int i_1_) throws IOException {
	return aClass562_10792.method9454(is, i, i_1_, (short) 255);
    }
    
    public void method8971(byte[] is, int i, int i_2_, int i_3_)
	throws IOException {
	aClass566_10793.method9532(is, i, i_2_, 1215113591);
    }
    
    public void method8975(int i) {
	aClass566_10793.method9538(31645619);
	try {
	    aSocket10791.close();
	} catch (IOException ioexception) {
	    /* empty */
	}
	aClass562_10792.method9455(315805703);
    }
    
    public void method8973(byte i) {
	aClass562_10792.method9456((byte) -50);
	aClass566_10793.method9533((byte) 3);
    }
    
    public int method8976(byte[] is, int i, int i_4_) throws IOException {
	return aClass562_10792.method9454(is, i, i_4_, (short) 255);
    }
    
    void method16461() {
	method8975(1474013644);
    }
    
    public void method8980() {
	aClass566_10793.method9538(31645619);
	try {
	    aSocket10791.close();
	} catch (IOException ioexception) {
	    /* empty */
	}
	aClass562_10792.method9455(1979905081);
    }
    
    void method16462() {
	method8975(1500022383);
    }
    
    public boolean method8985(int i) throws IOException {
	return aClass562_10792.method9452(i, 1112037925);
    }
    
    public int method8969(byte[] is, int i, int i_5_, byte i_6_)
	throws IOException {
	return aClass562_10792.method9454(is, i, i_5_, (short) 255);
    }
    
    public int method8970(int i) throws IOException {
	return aClass562_10792.method9453((byte) -80);
    }
    
    public void method8974() {
	aClass562_10792.method9456((byte) -60);
	aClass566_10793.method9533((byte) 35);
    }
    
    public void method8978(byte[] is, int i, int i_7_) throws IOException {
	aClass566_10793.method9532(is, i, i_7_, 1249810387);
    }
    
    public int method8968(byte[] is, int i, int i_8_) throws IOException {
	return aClass562_10792.method9454(is, i, i_8_, (short) 255);
    }
    
    public void finalize() {
	method8975(75577042);
    }
    
    public void method8981() {
	aClass566_10793.method9538(31645619);
	try {
	    aSocket10791.close();
	} catch (IOException ioexception) {
	    /* empty */
	}
	aClass562_10792.method9455(970439347);
    }
    
    public void method8982() {
	aClass566_10793.method9538(31645619);
	try {
	    aSocket10791.close();
	} catch (IOException ioexception) {
	    /* empty */
	}
	aClass562_10792.method9455(970570363);
    }
    
    public void method8983() {
	aClass562_10792.method9456((byte) -96);
	aClass566_10793.method9533((byte) 123);
    }
    
    public void method8972() {
	aClass562_10792.method9456((byte) -94);
	aClass566_10793.method9533((byte) 29);
    }
    
    public void method8979() {
	aClass566_10793.method9538(31645619);
	try {
	    aSocket10791.close();
	} catch (IOException ioexception) {
	    /* empty */
	}
	aClass562_10792.method9455(1285392580);
    }
    
    public int method8988() throws IOException {
	return aClass562_10792.method9453((byte) 91);
    }
}
