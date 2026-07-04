/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.memory.Buffer;

public class Class126
{
    Buffer aBuffer1503;
    Class185_Sub3 aClass185_Sub3_1504;
    
    Class126(Class185_Sub3 class185_sub3, byte[] is, int i) {
	aClass185_Sub3_1504 = class185_sub3;
	aBuffer1503 = aClass185_Sub3_1504.aNativeHeap9639.method1975(i, false);
	if (is != null)
	    aBuffer1503.method3(is, 0, 0, i);
    }
    
    Class126(Class185_Sub3 class185_sub3, Buffer buffer) {
	aClass185_Sub3_1504 = class185_sub3;
	aBuffer1503 = buffer;
    }
    
    void method2191(byte[] is, int i) {
	if (aBuffer1503 == null || aBuffer1503.method1() < i)
	    aBuffer1503
		= aClass185_Sub3_1504.aNativeHeap9639.method1975(i, false);
	aBuffer1503.method3(is, 0, 0, i);
    }
    
    void method2192(byte[] is, int i) {
	if (aBuffer1503 == null || aBuffer1503.method1() < i)
	    aBuffer1503
		= aClass185_Sub3_1504.aNativeHeap9639.method1975(i, false);
	aBuffer1503.method3(is, 0, 0, i);
    }
    
    void method2193(byte[] is, int i) {
	if (aBuffer1503 == null || aBuffer1503.method1() < i)
	    aBuffer1503
		= aClass185_Sub3_1504.aNativeHeap9639.method1975(i, false);
	aBuffer1503.method3(is, 0, 0, i);
    }
}
