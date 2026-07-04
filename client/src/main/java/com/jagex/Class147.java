/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class147
{
    static float[] aFloatArray1664 = new float[16384];
    static float[] aFloatArray1665 = new float[16384];
    
    static {
	double d = 3.834951969714103E-4;
	for (int i = 0; i < 16384; i++) {
	    aFloatArray1664[i] = (float) Math.sin((double) i * d);
	    aFloatArray1665[i] = (float) Math.cos((double) i * d);
	}
    }
    
    Class147() throws Throwable {
	throw new Error();
    }
}
