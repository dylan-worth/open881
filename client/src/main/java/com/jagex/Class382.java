/* Class382 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class382
{
    public int anInt3929;
    public static Class382 aClass382_3930;
    public static Class382 aClass382_3931 = new Class382(8);
    public static Class382 aClass382_3932;
    public static Class382 aClass382_3933;
    static Class382 aClass382_3934;
    
    static {
	aClass382_3930 = new Class382(16);
	aClass382_3933 = new Class382(8);
	aClass382_3932 = new Class382(16);
	aClass382_3934 = new Class382(32);
    }
    
    Class382(int i) {
	anInt3929 = i * 1711651991;
    }
    
    static final void method6446(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aClass492ArrayArray11027[i_1_][i_0_]
		  .method8087(-732610905);
    }
    
    static final void method6447(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class654_Sub1_Sub1_Sub1.method18620(class247, class243, class669,
					    (byte) 13);
    }
    
    static final void method6448(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aBool11157 ? 1 : 0;
    }
    
    public static Class400 method6449(Class534_Sub40 class534_sub40, int i) {
	int i_2_ = class534_sub40.method16527(-1024986982);
	Class401 class401 = (Class72.method1560(1990499454)
			     [class534_sub40.method16527(399397886)]);
	Class391 class391 = (Class705.method14234(-1167414191)
			     [class534_sub40.method16527(-726226389)]);
	int i_3_ = class534_sub40.method16530((byte) -36);
	int i_4_ = class534_sub40.method16530((byte) 0);
	int i_5_ = class534_sub40.method16529((byte) 1);
	int i_6_ = class534_sub40.method16529((byte) 1);
	int i_7_ = class534_sub40.method16533(-258848859);
	int i_8_ = class534_sub40.method16533(-258848859);
	int i_9_ = class534_sub40.method16533(-258848859);
	boolean bool = class534_sub40.method16527(23042702) == 1;
	return new Class400(i_2_, class401, class391, i_3_, i_4_, i_5_, i_6_,
			    i_7_, i_8_, i_9_, bool);
    }
    
    public static final int method6450(long l, String string, int i) {
	Random random = new Random();
	Class534_Sub40 class534_sub40 = new Class534_Sub40(128);
	Class534_Sub40 class534_sub40_10_ = new Class534_Sub40(128);
	int[] is = new int[4];
	is[0] = random.nextInt();
	is[1] = random.nextInt();
	is[2] = (int) (l >> 32);
	is[3] = (int) l;
	class534_sub40.method16506(10, 332765718);
	for (int i_11_ = 0; i_11_ < 4; i_11_++)
	    class534_sub40.method16510(random.nextInt(), -1936359546);
	class534_sub40.method16510(is[0], -1774150190);
	class534_sub40.method16510(is[1], -502892530);
	class534_sub40.method16505(l);
	class534_sub40.method16505(0L);
	for (int i_12_ = 0; i_12_ < 4; i_12_++)
	    class534_sub40.method16510(random.nextInt(), -478665145);
	class534_sub40.method16556(Class70.aBigInteger734,
				   Class70.aBigInteger735, -1798763192);
	class534_sub40_10_.method16506(10, 1774994484);
	for (int i_13_ = 0; i_13_ < 3; i_13_++)
	    class534_sub40_10_.method16510(random.nextInt(), -565966745);
	class534_sub40_10_.method16505(random.nextLong());
	class534_sub40_10_.method16564(random.nextLong());
	Class646.method10690(class534_sub40_10_, (byte) 100);
	class534_sub40_10_.method16505(random.nextLong());
	class534_sub40_10_.method16556(Class70.aBigInteger734,
				       Class70.aBigInteger735, -997650509);
	int i_14_ = Class668.method11029(string, (byte) 0);
	if (0 != i_14_ % 8)
	    i_14_ += 8 - i_14_ % 8;
	Class534_Sub40 class534_sub40_15_ = new Class534_Sub40(i_14_);
	class534_sub40_15_.method16713(string, -1020959265);
	class534_sub40_15_.anInt10811 = -1387468933 * i_14_;
	class534_sub40_15_.method16552(is, 1263787473);
	Class534_Sub40 class534_sub40_16_
	    = new Class534_Sub40(31645619 * class534_sub40_10_.anInt10811
				 + (31645619 * class534_sub40.anInt10811 + 5)
				 + 31645619 * class534_sub40_15_.anInt10811);
	class534_sub40_16_.method16506(2, 1921307012);
	class534_sub40_16_.method16506(31645619 * class534_sub40.anInt10811,
				       1609755988);
	class534_sub40_16_.method16519(class534_sub40.aByteArray10810, 0,
				       class534_sub40.anInt10811 * 31645619,
				       -1015597912);
	class534_sub40_16_
	    .method16506(class534_sub40_10_.anInt10811 * 31645619, 1541696720);
	class534_sub40_16_.method16519(class534_sub40_10_.aByteArray10810, 0,
				       (class534_sub40_10_.anInt10811
					* 31645619),
				       -1567169943);
	class534_sub40_16_
	    .method16507(31645619 * class534_sub40_15_.anInt10811, 1457367786);
	class534_sub40_16_.method16519(class534_sub40_15_.aByteArray10810, 0,
				       (class534_sub40_15_.anInt10811
					* 31645619),
				       575342929);
	String string_17_
	    = Class493.method8120(class534_sub40_16_.aByteArray10810,
				  (byte) -3);
	int i_18_;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class217.method4116("services", false,
						       (byte) 0))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write
		(new StringBuilder().append("data2=").append
		     (Class253.method4635(string_17_, 1742460029)).append
		     ("&dest=").append
		     (Class253.method4635("passwordchoice.ws", -164432829))
		     .toString());
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    class534_sub40_16_ = new Class534_Sub40(new byte[1000]);
	    for (;;) {
		int i_19_
		    = inputstream.read(class534_sub40_16_.aByteArray10810,
				       (class534_sub40_16_.anInt10811
					* 31645619),
				       1000 - (class534_sub40_16_.anInt10811
					       * 31645619));
		if (i_19_ == -1)
		    break;
		class534_sub40_16_.anInt10811 += -1387468933 * i_19_;
		if (31645619 * class534_sub40_16_.anInt10811 >= 1000)
		    return 5;
	    }
	    outputstreamwriter.close();
	    inputstream.close();
	    String string_20_ = new String(class534_sub40_16_.aByteArray10810);
	    if (string_20_.startsWith("OFFLINE"))
		return 4;
	    if (string_20_.startsWith("WRONG"))
		return 7;
	    if (string_20_.startsWith("RELOAD"))
		return 3;
	    if (string_20_
		    .startsWith("Not permitted for social network accounts."))
		return 6;
	    class534_sub40_16_.method16553(is, (byte) 103);
	    for (/**/;
		 (class534_sub40_16_.anInt10811 * 31645619 > 0
		  && 0 == (class534_sub40_16_.aByteArray10810
			   [31645619 * class534_sub40_16_.anInt10811 - 1]));
		 class534_sub40_16_.anInt10811 -= -1387468933) {
		/* empty */
	    }
	    string_20_ = new String(class534_sub40_16_.aByteArray10810, 0,
				    class534_sub40_16_.anInt10811 * 31645619);
	    if (Class665.method11007(string_20_, 474271995)) {
		Class468.method7622(string_20_, true, client.aBool11032,
				    1411490484);
		return 2;
	    }
	    i_18_ = 5;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return 5;
	}
	return i_18_;
    }
}
