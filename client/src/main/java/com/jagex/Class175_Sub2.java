/* Class175_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class175_Sub2 extends Class175
{
    public abstract int method15474();
    
    public abstract int method15475();
    
    public abstract int method15476(int i, int i_0_);
    
    abstract void method15477(int i, int i_1_);
    
    abstract void method15478(int i, int i_2_);
    
    public abstract int method15479();
    
    public abstract int method15480(int i, int i_3_);
    
    Class175_Sub2() {
	/* empty */
    }
    
    public abstract int method15481();
    
    public abstract int method15482();
    
    static void method15483(Class534_Sub40 class534_sub40, long l) {
	Class11 class11;
	if (Class65.aString696 != null && Class65.aString696.length() == 6) {
	    if (Class65.aBool697)
		class11 = Class11.aClass11_79;
	    else
		class11 = Class11.aClass11_77;
	} else if (Class640.aClass34_8337.method918(l))
	    class11 = Class11.aClass11_80;
	else
	    class11 = Class11.aClass11_78;
	class534_sub40.method16506(class11.method93(), 1935839475);
	switch (-1067252193 * class11.anInt76) {
	case 0:
	case 3:
	    class534_sub40.method16509(Integer.parseInt(Class65.aString696),
				       -1850256018);
	    class534_sub40.anInt10811 += -1387468933;
	    break;
	case 1:
	    class534_sub40.anInt10811 += -1254908436;
	    break;
	case 2:
	    class534_sub40.method16510(Class640.aClass34_8337.method909(l),
				       -1384231765);
	    break;
	}
    }
}
