/* Class428 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class428
{
    static float[] aFloatArray4817 = new float[16384];
    static float[] aFloatArray4818 = new float[16384];
    
    Class428() throws Throwable {
	throw new Error();
    }
    
    static {
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    aFloatArray4817[i] = (float) Math.sin((double) i * d);
	    aFloatArray4818[i] = (float) Math.cos((double) i * d);
	}
    }
}
