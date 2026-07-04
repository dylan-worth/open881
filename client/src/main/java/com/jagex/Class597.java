/* Class597 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class597
{
    public int anInt7859;
    public int anInt7860;
    public int anInt7861;
    static int anInt7862;
    static String[] aStringArray7863;
    
    public Class597() {
	anInt7860 = -1658782973;
    }
    
    public int method9918() {
	return (anInt7860 * -217302955 << 28 | anInt7859 * -424199969 << 14
		| anInt7861 * -1166289421);
    }
    
    public String method9919() {
	return new StringBuilder().append(-217302955 * anInt7860).append
		   (",").append
		   (anInt7859 * -424199969 >> 6).append
		   (",").append
		   (-1166289421 * anInt7861 >> 6).append
		   (",").append
		   (anInt7859 * -424199969 & 0x3f).append
		   (",").append
		   (-1166289421 * anInt7861 & 0x3f).toString();
    }
    
    public void method9920(Class534_Sub36 class534_sub36, byte i) {
	anInt7860 = class534_sub36.anInt10796 * 603752099;
	anInt7859 = (599803149 * class534_sub36.anInt10797 >> 9) * -1962245345;
	anInt7861 = -277165253 * (33298755 * class534_sub36.anInt10799 >> 9);
    }
    
    public int method9921(byte i) {
	return (anInt7860 * -217302955 << 28 | anInt7859 * -424199969 << 14
		| anInt7861 * -1166289421);
    }
    
    public boolean equals(Object object) {
	if (object == this)
	    return true;
	if (!(object instanceof Class597))
	    return false;
	return method9922((Class597) object, (byte) -32);
    }
    
    boolean method9922(Class597 class597_0_, byte i) {
	if (class597_0_.anInt7860 * -217302955 != -217302955 * anInt7860)
	    return false;
	if (-424199969 * class597_0_.anInt7859 != anInt7859 * -424199969)
	    return false;
	if (-1166289421 * class597_0_.anInt7861 != anInt7861 * -1166289421)
	    return false;
	return true;
    }
    
    public int hashCode() {
	return method9921((byte) -51);
    }
    
    public String toString() {
	return new StringBuilder().append(-217302955 * anInt7860).append
		   (",").append
		   (anInt7859 * -424199969 >> 6).append
		   (",").append
		   (-1166289421 * anInt7861 >> 6).append
		   (",").append
		   (anInt7859 * -424199969 & 0x3f).append
		   (",").append
		   (-1166289421 * anInt7861 & 0x3f).toString();
    }
    
    public boolean method9923(Object object) {
	if (object == this)
	    return true;
	if (!(object instanceof Class597))
	    return false;
	return method9922((Class597) object, (byte) -103);
    }
    
    public boolean method9924(Object object) {
	if (object == this)
	    return true;
	if (!(object instanceof Class597))
	    return false;
	return method9922((Class597) object, (byte) -35);
    }
    
    public boolean method9925(Object object) {
	if (object == this)
	    return true;
	if (!(object instanceof Class597))
	    return false;
	return method9922((Class597) object, (byte) -6);
    }
    
    public Class597(int i) {
	if (i == -1)
	    anInt7860 = -1658782973;
	else {
	    anInt7860 = 1658782973 * (i >> 28 & 0x3);
	    anInt7859 = (i >> 14 & 0x3fff) * -1962245345;
	    anInt7861 = -277165253 * (i & 0x3fff);
	}
    }
    
    public int method9926() {
	return method9921((byte) -74);
    }
    
    public int method9927() {
	return (anInt7860 * -217302955 << 28 | anInt7859 * -424199969 << 14
		| anInt7861 * -1166289421);
    }
    
    public String method9928() {
	return new StringBuilder().append(-217302955 * anInt7860).append
		   (",").append
		   (anInt7859 * -424199969 >> 6).append
		   (",").append
		   (-1166289421 * anInt7861 >> 6).append
		   (",").append
		   (anInt7859 * -424199969 & 0x3f).append
		   (",").append
		   (-1166289421 * anInt7861 & 0x3f).toString();
    }
    
    public void method9929(Class534_Sub36 class534_sub36) {
	anInt7860 = class534_sub36.anInt10796 * 603752099;
	anInt7859 = (599803149 * class534_sub36.anInt10797 >> 9) * -1962245345;
	anInt7861 = -277165253 * (33298755 * class534_sub36.anInt10799 >> 9);
    }
    
    public Class597(int i, int i_1_, int i_2_) {
	anInt7860 = 1658782973 * i;
	anInt7859 = i_1_ * -1962245345;
	anInt7861 = i_2_ * -277165253;
    }
    
    public int method9930() {
	return (anInt7860 * -217302955 << 28 | anInt7859 * -424199969 << 14
		| anInt7861 * -1166289421);
    }
    
    public boolean method9931(Object object) {
	if (object == this)
	    return true;
	if (!(object instanceof Class597))
	    return false;
	return method9922((Class597) object, (byte) -81);
    }
    
    boolean method9932(Class597 class597_3_) {
	if (class597_3_.anInt7860 * -217302955 != -217302955 * anInt7860)
	    return false;
	if (-424199969 * class597_3_.anInt7859 != anInt7859 * -424199969)
	    return false;
	if (-1166289421 * class597_3_.anInt7861 != anInt7861 * -1166289421)
	    return false;
	return true;
    }
    
    static final void method9933(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_4_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_5_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class690_Sub38.method17206(class666.aClass247_8574, i_4_, i_5_,
				   415322710);
    }
    
    static final void method9934(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4255,
				  client.aClass100_11094.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513
	    .method16506(Class668.method11029(string, (byte) 0), 1454120067);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string,
							      391976021);
	client.aClass100_11094.method1863(class534_sub19, (byte) 107);
    }
    
    static final void method9935(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_6_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_7_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class200_Sub23.method15659(i_6_, i_7_, false, -54084995);
    }
    
    static final void method9936(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2567
	    = Class99.method1859(string, class669, -1521657691);
	class247.aBool2561 = true;
    }
    
    static final void method9937(Class669 class669, byte i) {
	int i_8_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_8_, 1173119319);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_8_ >> 16];
	Class316.method5722(class247, class243, class669, (byte) 114);
    }
}
