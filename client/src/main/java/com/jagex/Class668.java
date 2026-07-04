/* Class668 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.image.BufferedImage;

public class Class668
{
    public static Class668 aClass668_8583 = new Class668();
    public static Class668 aClass668_8584 = new Class668();
    static Class668 aClass668_8585 = new Class668();
    
    Class668() {
	/* empty */
    }
    
    public static int method11029(String string, byte i) {
	return string.length() + 1;
    }
    
    public static int[] method11030(BufferedImage bufferedimage, short i) {
	if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
	    int[] is = null;
	    is = bufferedimage.getRaster().getPixels(0, 0,
						     bufferedimage.getWidth(),
						     bufferedimage.getHeight(),
						     is);
	    int[] is_0_
		= (new int
		   [bufferedimage.getWidth() * bufferedimage.getHeight()]);
	    if (bufferedimage.getType() == 10) {
		for (int i_1_ = 0; i_1_ < is_0_.length; i_1_++)
		    is_0_[i_1_] = ((is[i_1_] << 16) + (is[i_1_] << 8)
				   + is[i_1_] + -16777216);
	    } else {
		for (int i_2_ = 0; i_2_ < is_0_.length; i_2_++) {
		    int i_3_ = 2 * i_2_;
		    is_0_[i_2_] = ((is[i_3_] << 8) + (is[i_3_] << 16)
				   + ((is[1 + i_3_] << 24) + is[i_3_]));
		}
	    }
	    return is_0_;
	}
	return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(),
				    bufferedimage.getHeight(), null, 0,
				    bufferedimage.getWidth());
    }
}
