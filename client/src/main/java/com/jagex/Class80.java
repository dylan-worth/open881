/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.zip.Inflater;

public class Class80
{
    Inflater anInflater831;
    
    public byte[] method1622(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	class534_sub40.anInt10811 = -1387468933 * (is.length - 4);
	int i = class534_sub40.method16534(-710940109);
	byte[] is_0_ = new byte[i];
	class534_sub40.anInt10811 = 0;
	method1625(class534_sub40, is_0_, 1478780959);
	return is_0_;
    }
    
    public byte[] method1623(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	class534_sub40.anInt10811 = -1387468933 * (is.length - 4);
	int i = class534_sub40.method16534(-601072481);
	byte[] is_1_ = new byte[i];
	class534_sub40.anInt10811 = 0;
	method1625(class534_sub40, is_1_, 1404644971);
	return is_1_;
    }
    
    public byte[] method1624(byte[] is, int i) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	class534_sub40.anInt10811 = -1387468933 * (is.length - 4);
	int i_2_ = class534_sub40.method16534(-1560029343);
	byte[] is_3_ = new byte[i_2_];
	class534_sub40.anInt10811 = 0;
	method1625(class534_sub40, is_3_, 955522622);
	return is_3_;
    }
    
    public void method1625(Class534_Sub40 class534_sub40, byte[] is, int i) {
	if ((class534_sub40.aByteArray10810
	     [class534_sub40.anInt10811 * 31645619]) != 31
	    || (class534_sub40.aByteArray10810
		[1 + 31645619 * class534_sub40.anInt10811]) != -117)
	    throw new RuntimeException("");
	if (null == anInflater831)
	    anInflater831 = new Inflater(true);
	try {
	    anInflater831.setInput(class534_sub40.aByteArray10810,
				   10 + 31645619 * class534_sub40.anInt10811,
				   (class534_sub40.aByteArray10810.length
				    - (8
				       + (class534_sub40.anInt10811 * 31645619
					  + 10))));
	    anInflater831.inflate(is);
	} catch (Exception exception) {
	    anInflater831.reset();
	    throw new RuntimeException("");
	}
	anInflater831.reset();
    }
    
    public byte[] method1626(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	class534_sub40.anInt10811 = -1387468933 * (is.length - 4);
	int i = class534_sub40.method16534(-1838590196);
	byte[] is_4_ = new byte[i];
	class534_sub40.anInt10811 = 0;
	method1625(class534_sub40, is_4_, 1170103515);
	return is_4_;
    }
    
    public Class80() {
	this(-1, 1000000, 1000000);
    }
    
    Class80(int i, int i_5_, int i_6_) {
	/* empty */
    }
    
    public byte[] method1627(byte[] is) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	class534_sub40.anInt10811 = -1387468933 * (is.length - 4);
	int i = class534_sub40.method16534(248820062);
	byte[] is_7_ = new byte[i];
	class534_sub40.anInt10811 = 0;
	method1625(class534_sub40, is_7_, 501389898);
	return is_7_;
    }
    
    static final void method1628(int i) {
	if (client.anInt11185 * -993629849 != -1) {
	    int i_8_ = Class81.aClass563_834.method9493(-1454427402);
	    int i_9_ = Class81.aClass563_834.method9477(936542780);
	    Class534_Sub42 class534_sub42
		= ((Class534_Sub42)
		   client.aClass700_11063.method14135((byte) -1));
	    if (class534_sub42 != null) {
		i_8_ = class534_sub42.method16799((byte) 76);
		i_9_ = class534_sub42.method16800(-493112662);
	    }
	    if (null != client.aClass247_11044
		&& Class79.aClass247_830 == client.aClass247_11342) {
		client.aBool11103 = true;
		client.anInt11236 = 0;
		client.anInt11158 = 0;
		client.anInt11239 = 1772500323 * Class706_Sub4.anInt10994;
		client.anInt11243 = Class18.anInt205 * 1038288957;
	    }
	    Class621.method10282(null, client.anInt11185 * -993629849, 0, 0,
				 Class706_Sub4.anInt10994 * 1771907305,
				 -1091172141 * Class18.anInt205, 0, 0, i_8_,
				 i_9_, (byte) 97);
	    if (null != Class237.aClass247_2377)
		Class691.method14041(i_8_, i_9_, 1271437950);
	}
    }
    
    public static final void method1629(String string, byte i) {
	if (null != string) {
	    String string_10_
		= Class465.method7570(string, Class39.aClass76_307, (byte) 13);
	    if (null != string_10_) {
		for (int i_11_ = 0; i_11_ < -1979292205 * client.anInt11324;
		     i_11_++) {
		    Class28 class28 = client.aClass28Array11327[i_11_];
		    String string_12_ = class28.aString257;
		    String string_13_
			= Class465.method7570(string_12_, Class39.aClass76_307,
					      (byte) -26);
		    if (Class470.method7644(string, string_10_, string_12_,
					    string_13_, 1742588481)) {
			client.anInt11324 -= 1605909083;
			for (int i_14_ = i_11_;
			     i_14_ < client.anInt11324 * -1979292205; i_14_++)
			    client.aClass28Array11327[i_14_]
				= client.aClass28Array11327[1 + i_14_];
			client.anInt11261 = -664271315 * client.anInt11095;
			Class100 class100 = Class201.method3864(2095398292);
			Class534_Sub19 class534_sub19
			    = Class346.method6128(Class404.aClass404_4242,
						  class100.aClass13_1183,
						  1341391005);
			class534_sub19.aClass534_Sub40_Sub1_10513.method16506
			    (Class668.method11029(string, (byte) 0),
			     402964191);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16713(string, 1134754924);
			class100.method1863(class534_sub19, (byte) 13);
			break;
		    }
		}
	    }
	}
    }
    
    static final void method1630(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	class247.anInt2482
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * -1996628585;
	Class454.method7416(class247, -786792807);
	if (1365669833 * class247.anInt2580 == -1 && !class243.aBool2413)
	    Class534_Sub20.method16194(-1278450723 * class247.anInt2454,
				       (byte) 6);
    }
}
