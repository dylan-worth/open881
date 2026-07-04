/* Class536_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub6 extends Class536
{
    int anInt10369;
    int anInt10370;
    int anInt10371;
    int anInt10372;
    int anInt10373;
    int anInt10374;
    String aString10375;
    
    Class536_Sub6() {
	/* empty */
    }
    
    static int method16007(int i, int i_0_, byte i_1_) {
	int i_2_ = i >> 31 & i_0_ - 1;
	return (i + (i >>> 31)) % i_0_ + i_2_;
    }
}
