/* Class44_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Map;

public class Class44_Sub11 extends Class44
{
    public static Class243[] aClass243Array11006;
    public static final int anInt11007 = 64;
    
    public Class44_Sub11(Class675 class675, Class672 class672,
			 Class472 class472, Map map) {
	super(class675, class672, class472, Class649.aClass649_8441, 64,
	      new Class341_Sub1(map));
    }
    
    public static final int method17348(int i, int i_0_, int i_1_) {
	if (i == -2)
	    return 12345678;
	if (-1 == i) {
	    if (i_0_ < 2)
		i_0_ = 2;
	    else if (i_0_ > 126)
		i_0_ = 126;
	    return i_0_;
	}
	i_0_ = i_0_ * (i & 0x7f) >> 7;
	if (i_0_ < 2)
	    i_0_ = 2;
	else if (i_0_ > 126)
	    i_0_ = 126;
	return i_0_ + (i & 0xff80);
    }
}
