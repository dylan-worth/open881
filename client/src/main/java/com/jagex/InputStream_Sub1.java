/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.InputStream;

public class InputStream_Sub1 extends InputStream
{
    public int read() {
	Class251.method4622(30000L);
	return -1;
    }
    
    public int method17362() {
	Class251.method4622(30000L);
	return -1;
    }
    
    InputStream_Sub1() {
	/* empty */
    }
    
    public static float method17363(Class443 class443, byte i) {
	Class438 class438 = Class438.method6996(0.0F, 0.0F, 1.0F);
	class438.method7021(class443);
	double d = Math.atan2((double) class438.aFloat4864,
			      (double) class438.aFloat4865);
	class438.method7074();
	if (d < 0.0)
	    d = 3.141592653589793 + (d + 3.141592653589793);
	return (float) d;
    }
}
