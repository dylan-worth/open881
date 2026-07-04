/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.net.Socket;

public abstract class Class39
{
    String aString305;
    int anInt306;
    static Class76 aClass76_307;
    
    public abstract Socket method976(byte i) throws IOException;
    
    Socket method977(byte i) throws IOException {
	return new Socket(aString305, -766038025 * anInt306);
    }
    
    Class39() {
	/* empty */
    }
    
    public abstract Socket method978() throws IOException;
    
    Socket method979() throws IOException {
	return new Socket(aString305, -766038025 * anInt306);
    }
    
    Socket method980() throws IOException {
	return new Socket(aString305, -766038025 * anInt306);
    }
    
    Socket method981() throws IOException {
	return new Socket(aString305, -766038025 * anInt306);
    }
    
    static void method982(Class185 class185, Class534_Sub29 class534_sub29,
			  Class272 class272, int i, int i_0_, int i_1_,
			  int i_2_, int i_3_) {
	int i_4_ = i - 5;
	int i_5_ = i_0_ + 2;
	if (class272.anInt2976 * 1313711519 != 0)
	    class185.method3292(i_4_, i_5_, 10 + i_2_,
				1 + (i_0_ + i_1_ - i_5_),
				class272.anInt2976 * 1313711519, -1904610757);
	if (class272.anInt3009 * -2045123201 != 0)
	    class185.method3425(i_4_, i_5_, i_2_ + 10,
				1 + (i_1_ + i_0_ - i_5_),
				class272.anInt3009 * -2045123201, -724157993);
	int i_6_ = class272.anInt2970 * -1512587879;
	if (class534_sub29.aBool10656 && -1 != 261637687 * class272.anInt2995)
	    i_6_ = 261637687 * class272.anInt2995;
	Class582.aClass171_7771.method2844(class272.aString2969, i, i_0_, i_2_,
					   i_1_, ~0xffffff | i_6_,
					   (Class554_Sub1.aClass622_7353
					    .anInt8145) * 335392643,
					   1, 0, 0, null, null, null, 0, 0,
					   202025040);
    }
}
