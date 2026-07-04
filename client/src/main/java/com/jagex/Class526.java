/* Class526 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class526
{
    int anInt7090;
    int anInt7091;
    int anInt7092;
    int anInt7093;
    String aString7094;
    
    public int method8742() {
	return -1494378647 * anInt7091;
    }
    
    public String method8743(byte i) {
	return aString7094;
    }
    
    Class526() {
	/* empty */
    }
    
    public int method8744(int i) {
	return -1494378647 * anInt7091;
    }
    
    public int method8745() {
	return -635845003 * anInt7092;
    }
    
    public int method8746(byte i) {
	return -474631565 * anInt7090;
    }
    
    public String method8747() {
	return aString7094;
    }
    
    public int method8748() {
	return -1494378647 * anInt7091;
    }
    
    public int method8749(int i) {
	return 300455605 * anInt7093;
    }
    
    public int method8750() {
	return -635845003 * anInt7092;
    }
    
    public int method8751(int i) {
	return -635845003 * anInt7092;
    }
    
    public int method8752() {
	return 300455605 * anInt7093;
    }
    
    public int method8753() {
	return 300455605 * anInt7093;
    }
    
    public int method8754() {
	return -474631565 * anInt7090;
    }
    
    public int method8755() {
	return -474631565 * anInt7090;
    }
    
    public static Class257 method8756(Class534_Sub40 class534_sub40, short i) {
	int i_0_ = class534_sub40.method16527(406842183);
	if (0 == i_0_)
	    return null;
	i_0_--;
	class534_sub40.anInt10811 += -1387468933;
	int i_1_ = class534_sub40.method16533(-258848859);
	Object[] objects = new Object[i_0_];
	for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
	    int i_3_ = class534_sub40.method16527(-1310287589);
	    if (i_3_ == 0)
		objects[i_2_]
		    = Class483.method7937
			  (java.lang.Integer.class, 1445144196)
			  .method75(class534_sub40, -2114971913);
	    else if (i_3_ == 1)
		objects[i_2_]
		    = Class483.method7937
			  (java.lang.String.class, 717817031)
			  .method75(class534_sub40, -1074241018);
	    else
		throw new IllegalStateException
			  (new StringBuilder().append
			       ("Unrecognised type ID in deserialise: ").append
			       (i_3_).toString());
	}
	return new Class257(i_1_, objects);
    }
    
    static final void method8757(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_4_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_5_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	int i_6_ = i_5_ >> 14 & 0x3fff;
	int i_7_ = i_5_ & 0x3fff;
	int i_8_ = Class285.method5262(i_4_, i_6_, i_7_, 1280310329);
	if (i_8_ < 0)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= i_8_;
    }
    
    static final void method8758(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    public static boolean method8759(char c, int i) {
	if (c >= ' ' && c <= '~')
	    return true;
	if (c >= '\u00a0' && c <= '\u00ff')
	    return true;
	if (c == '\u20ac' || c == '\u0152' || '\u2014' == c || '\u0153' == c
	    || c == '\u0178')
	    return true;
	return false;
    }
    
    static final void method8760(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -881188269 * class247.anInt2468;
    }
    
    static void method8761(Class534_Sub18_Sub11 class534_sub18_sub11, int i) {
	boolean bool = false;
	class534_sub18_sub11.method16180(-421776830);
	for (Class534_Sub18_Sub11 class534_sub18_sub11_9_
		 = ((Class534_Sub18_Sub11)
		    Class72.aClass696_772.method14078(1221951837));
	     null != class534_sub18_sub11_9_;
	     class534_sub18_sub11_9_
		 = ((Class534_Sub18_Sub11)
		    Class72.aClass696_772.method14080((byte) 52))) {
	    if (Class260.method4805(class534_sub18_sub11
					.method18342((byte) -62),
				    class534_sub18_sub11_9_
					.method18342((byte) 21),
				    1181791465)) {
		Class51.method1180(class534_sub18_sub11,
				   class534_sub18_sub11_9_, (byte) -46);
		bool = true;
		break;
	    }
	}
	if (!bool)
	    Class72.aClass696_772.method14076(class534_sub18_sub11, (byte) 27);
    }
    
    static boolean method8762(int i, byte i_10_) {
	return i == 9 || 7 == i;
    }
    
    static final void method8763(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class151.anInt1705 * 204700261 + Class554.anInt7368;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class328.anInt3479 * -1636630007 + Class554.anInt7369;
    }
}
