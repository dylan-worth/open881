/* Class306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class306 implements Interface18
{
    public static int anInt3273;
    
    public Class318 method110(int i) {
	return (Class318) Class84.aClass44_Sub11_840.method91(i, 443370219);
    }
    
    public Class150 method108(Class453 class453, int i, int i_0_) {
	return (Class150) ((Interface14) Class179_Sub1.aMap9331.get(class453))
			      .method91(i, -1219029215);
    }
    
    public Class318 method107(int i, int i_1_) {
	return (Class318) Class84.aClass44_Sub11_840.method91(i, -299841278);
    }
    
    public Class150 method109(Class453 class453, int i) {
	return (Class150) ((Interface14) Class179_Sub1.aMap9331.get(class453))
			      .method91(i, -1470027397);
    }
    
    public Class318 method111(int i) {
	return (Class318) Class84.aClass44_Sub11_840.method91(i, 1073474830);
    }
    
    public Class318 method112(int i) {
	return (Class318) Class84.aClass44_Sub11_840.method91(i, -1107914286);
    }
    
    public static void method5607(byte i) {
	if (Class309.method5657((byte) 24) != Class508.aClass508_5669) {
	    try {
		String string
		    = Class305.anApplet3271
			  .getParameter(Class408.aClass408_4338.aString4365);
		int i_2_
		    = ((int) (Class250.method4604((byte) -104) / 86400000L)
		       - 11745);
		String string_3_
		    = new StringBuilder().append("usrdob=").append(i_2_).append
			  ("; version=1; path=/; domain=").append
			  (string).toString();
		Class31.method888(Class305.anApplet3271,
				  new StringBuilder().append
				      ("document.cookie=\"").append
				      (string_3_).append
				      ("\"").toString(),
				  (byte) 93);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
}
