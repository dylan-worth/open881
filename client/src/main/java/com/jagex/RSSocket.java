/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

import com.RS3Applet;

public class RSSocket
{
    public int anInt222;
    public String aString223;
    boolean aBool224;
    public int anInt225;
    boolean aBool226 = true;
    public int anInt227;
    
    public boolean method816(RSSocket class23_0_) {
	if (class23_0_ == null)
	    return false;
	return (-1664252895 * anInt227 == -1664252895 * class23_0_.anInt227
		&& aString223.equals(class23_0_.aString223)
		&& anInt222 * 606493275 == class23_0_.anInt222 * 606493275
		&& class23_0_.anInt225 * 1001670253 == 1001670253 * anInt225);
    }
    
	public Socket method817(int i) throws IOException {
		if (RS3Applet.RSPS) {
			return new Socket(InetAddress.getByName(aString223), 43594);
		}
		return Class673.method11108(aString223, aBool226 ? anInt225 * 1001670253 : anInt222 * 606493275, 150103646)
				.method976((byte) 1);
	}
    
    public void method818(byte i) {
	if (!aBool226) {
	    aBool226 = true;
	    aBool224 = true;
	} else if (aBool224)
	    aBool224 = false;
	else
	    aBool226 = false;
    }
    
    public boolean method819(RSSocket class23_1_, int i) {
	if (class23_1_ == null)
	    return false;
	return (-1664252895 * anInt227 == -1664252895 * class23_1_.anInt227
		&& aString223.equals(class23_1_.aString223)
		&& anInt222 * 606493275 == class23_1_.anInt222 * 606493275
		&& class23_1_.anInt225 * 1001670253 == 1001670253 * anInt225);
    }
    
    public Socket method820() throws IOException {
	if (!aBool224)
	    return new Socket(InetAddress.getByName(aString223),
			      (aBool226 ? anInt225 * 1001670253
			       : anInt222 * 606493275));
	return Class673.method11108
		   (aString223,
		    aBool226 ? anInt225 * 1001670253 : anInt222 * 606493275,
		    150103646)
		   .method976((byte) 1);
    }
    
    public Socket method821() throws IOException {
	if (!aBool224)
	    return new Socket(InetAddress.getByName(aString223),
			      (aBool226 ? anInt225 * 1001670253
			       : anInt222 * 606493275));
	return Class673.method11108
		   (aString223,
		    aBool226 ? anInt225 * 1001670253 : anInt222 * 606493275,
		    150103646)
		   .method976((byte) 1);
    }
    
    public Socket method822() throws IOException {
	if (!aBool224)
	    return new Socket(InetAddress.getByName(aString223),
			      (aBool226 ? anInt225 * 1001670253
			       : anInt222 * 606493275));
	return Class673.method11108
		   (aString223,
		    aBool226 ? anInt225 * 1001670253 : anInt222 * 606493275,
		    150103646)
		   .method976((byte) 1);
    }
    
    public boolean method823(RSSocket class23_2_) {
	if (class23_2_ == null)
	    return false;
	return (-1664252895 * anInt227 == -1664252895 * class23_2_.anInt227
		&& aString223.equals(class23_2_.aString223)
		&& anInt222 * 606493275 == class23_2_.anInt222 * 606493275
		&& class23_2_.anInt225 * 1001670253 == 1001670253 * anInt225);
    }
    
    public boolean method824(RSSocket class23_3_) {
	if (class23_3_ == null)
	    return false;
	return (-1664252895 * anInt227 == -1664252895 * class23_3_.anInt227
		&& aString223.equals(class23_3_.aString223)
		&& anInt222 * 606493275 == class23_3_.anInt222 * 606493275
		&& class23_3_.anInt225 * 1001670253 == 1001670253 * anInt225);
    }
    
    public RSSocket() {
	aBool224 = false;
    }
    
    public boolean method825(RSSocket class23_4_) {
	if (class23_4_ == null)
	    return false;
	return (-1664252895 * anInt227 == -1664252895 * class23_4_.anInt227
		&& aString223.equals(class23_4_.aString223)
		&& anInt222 * 606493275 == class23_4_.anInt222 * 606493275
		&& class23_4_.anInt225 * 1001670253 == 1001670253 * anInt225);
    }
    
    static final void method826(Class247 class247, Class243 class243,
				Class669 class669, byte i) {
	class247.aString2495 = null;
	class247.aClass253_2609 = null;
    }
    
    static void method827(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(4, (long) i);
	class534_sub18_sub6.method18121(965565002);
	class534_sub18_sub6.anInt11666 = 517206857 * i_5_;
	class534_sub18_sub6.anInt11660 = i_6_ * -1621355885;
	class534_sub18_sub6.anInt11661 = i_7_ * -105177451;
    }
}
