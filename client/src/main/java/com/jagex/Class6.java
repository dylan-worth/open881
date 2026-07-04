/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class6
{
    public int anInt52;
    public int anInt53;
    public int anInt54;
    int anInt55;
    public static Class450 aClass450_56;
    public static Class472 aClass472_57;
    
    Class6() {
	/* empty */
    }
    
    static final void method564
	(Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1, int i) {
	int i_0_ = (-1626386689 * class654_sub1_sub5_sub1.anInt11956
		    - client.anInt11101);
	int i_1_ = (class654_sub1_sub5_sub1.anInt11943 * 1791130112
		    + class654_sub1_sub5_sub1.method18545((byte) 1) * 256);
	int i_2_ = (class654_sub1_sub5_sub1.anInt11945 * 660825600
		    + class654_sub1_sub5_sub1.method18545((byte) 1) * 256);
	int i_3_ = Class247.method4595(i_1_, i_2_,
				       (-2033865703
					* class654_sub1_sub5_sub1.anInt11954),
				       -1095249441);
	Class438 class438
	    = class654_sub1_sub5_sub1.method10807().aClass438_4885;
	class654_sub1_sub5_sub1.method10815
	    ((float) ((int) class438.aFloat4864
		      + (i_1_ - (int) class438.aFloat4864) / i_0_),
	     (float) ((i_3_ - (int) class438.aFloat4863) / i_0_
		      + (int) class438.aFloat4863),
	     (float) ((i_2_ - (int) class438.aFloat4865) / i_0_
		      + (int) class438.aFloat4865));
	class654_sub1_sub5_sub1.anInt11947 = 0;
	class654_sub1_sub5_sub1.method18524((class654_sub1_sub5_sub1.anInt11958
					     * -565919971),
					    -262340681);
    }
    
    static final String method565(int i, int i_4_) {
	String string = Integer.toString(i);
	for (int i_5_ = string.length() - 3; i_5_ > 0; i_5_ -= 3)
	    string
		= new StringBuilder().append(string.substring(0, i_5_)).append
		      (Class29.aString260).append
		      (string.substring(i_5_)).toString();
	if (string.length() > 9)
	    return new StringBuilder().append(" ").append
		       (Class154.method2575(65408, -405301090)).append
		       (string.substring(0, string.length() - 8)).append
		       (Class58.aClass58_489
			    .method1245(Class539.aClass672_7171, (byte) -31))
		       .append
		       (" (").append
		       (string).append
		       (")").append
		       (Class29.aString262).toString();
	if (string.length() > 6)
	    return new StringBuilder().append(" ").append
		       (Class154.method2575(16777215, -429788150)).append
		       (string.substring(0, string.length() - 4)).append
		       (Class58.aClass58_603
			    .method1245(Class539.aClass672_7171, (byte) -87))
		       .append
		       (" (").append
		       (string).append
		       (")").append
		       (Class29.aString262).toString();
	return new StringBuilder().append(" ").append
		   (Class154.method2575(16776960, -577617193)).append
		   (string).append
		   (Class29.aString262).toString();
    }
    
    public static boolean method566(byte[] is, byte i) {
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i_6_ = class534_sub40.method16527(-144438611);
	if (2 != i_6_)
	    return false;
	boolean bool = class534_sub40.method16527(206612556) == 1;
	if (bool)
	    Class72.method1562(class534_sub40, -1536766546);
	Class685.method13961(class534_sub40, (byte) 8);
	return true;
    }
}
