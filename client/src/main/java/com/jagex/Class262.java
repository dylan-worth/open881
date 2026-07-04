/* Class262 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.DataInputStream;
import java.net.URL;

public class Class262
{
    String aString2797;
    int anInt2798;
    int anInt2799;
    static Class703 aClass703_2800;
    public static String aString2801;
    
    Class262(String string, int i, int i_0_) {
	aString2797 = string;
	anInt2798 = i * -602776789;
	anInt2799 = i_0_ * -1165466785;
    }
    
    static final void method4820(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_2_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	class669.aClass395_8601.anIntArray4102[i_1_] = i_2_;
    }
    
    static final void method4821(Class669 class669, byte i) {
	int i_3_ = client.aClass9_11224.method600(-1459185176);
	if (-1 != client.anInt11185 * -993629849)
	    i_3_++;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_3_;
    }
    
    static final void method4822(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub33_10765
		  .method17165(-150025605) ? 1 : 0;
    }
    
    public static void method4823
	(Class583 class583, int i, int i_4_, Class677 class677,
	 Class654_Sub1_Sub4_Sub1 class654_sub1_sub4_sub1, int i_5_) {
	Class669 class669 = Class567.method9559((byte) -31);
	class669.aClass654_Sub1_Sub4_Sub1_8609 = class654_sub1_sub4_sub1;
	Class244.method4484(class583, i, i_4_, class669, 514294534);
	class669.aClass654_Sub1_Sub4_Sub1_8609 = null;
    }
    
    public static void method4824(String string, Throwable throwable, byte i) {
	try {
	    String string_6_ = "";
	    if (throwable != null)
		string_6_ = Class469.method7640(throwable, -2092907623);
	    if (string != null) {
		if (throwable != null)
		    string_6_ = new StringBuilder().append(string_6_).append
				    (" | ").toString();
		string_6_ = new StringBuilder().append(string_6_).append
				(string).toString();
	    }
	    Class332.method5863(string_6_, (byte) 98);
	    string_6_ = Class253.method4635(string_6_, -1736902414);
	    URL url = null;
	    if (null != RuntimeException_Sub1.anApplet12087)
		url = RuntimeException_Sub1.anApplet12087.getCodeBase();
	    else if (null != RuntimeException_Sub1.anInterface61_12086)
		url = RuntimeException_Sub1.anInterface61_12086
			  .method404(2040728216);
	    if (null != url) {
		String string_7_ = "Unknown";
		String string_8_ = "1.1";
		try {
		    string_7_ = System.getProperty("java.vendor");
		    string_8_ = System.getProperty("java.version");
		} catch (Exception exception) {
		    /* empty */
		}
		URL url_9_
		    = new URL(url,
			      new StringBuilder().append
				  ("clienterror.ws?c=").append
				  (1141119879
				   * RuntimeException_Sub1.anInt12084)
				  .append
				  ("&cs=").append
				  (Class97.anInt1160 * 855690843).append
				  ("&u=").append
				  (RuntimeException_Sub1.aString12085 != null
				   ? Class253.method4635((RuntimeException_Sub1
							  .aString12085),
							 -887432933)
				   : new StringBuilder().append("").append
					 (RuntimeException_Sub1.aLong12088
					  * 2640931341331960365L)
					 .toString())
				  .append
				  ("&v1=").append
				  (Class253.method4635(string_7_, -1373522105))
				  .append
				  ("&v2=").append
				  (Class253.method4635(string_8_, 313981867))
				  .append
				  ("&e=").append
				  (string_6_).toString());
		DataInputStream datainputstream
		    = new DataInputStream(url_9_.openStream());
		datainputstream.read();
		datainputstream.close();
	    }
	} catch (Exception exception) {
	    exception.printStackTrace();
	}
    }
}
