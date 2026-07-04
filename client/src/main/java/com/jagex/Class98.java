/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class98
{
    String aString1161;
    public String aString1162;
    public byte aByte1163;
    public int anInt1164;
    public String aString1165;
    public String aString1166;
    
    Class98() {
	/* empty */
    }
    
    static Class413[] method1833(int i) {
	return (new Class413[]
		{ Class413.aClass413_4650, Class413.aClass413_4651,
		  Class413.aClass413_4647, Class413.aClass413_4652,
		  Class413.aClass413_4646, Class413.aClass413_4649,
		  Class413.aClass413_4656, Class413.aClass413_4653,
		  Class413.aClass413_4655, Class413.aClass413_4654,
		  Class413.aClass413_4645, Class413.aClass413_4644 });
    }
    
    static void method1834(Class669 class669, Class515 class515,
			   Exception exception, String string, int i) {
	StringBuilder stringbuilder = new StringBuilder(30);
	stringbuilder.append
	    (new StringBuilder().append(string).append(" ").toString()).append
	    (class669.aClass534_Sub18_Sub8_8614.aLong7158
	     * 8258869577519436579L)
	    .append(" ");
	for (int i_0_ = -1712769137 * class669.anInt8597 - 1; i_0_ >= 0;
	     i_0_--)
	    stringbuilder.append("").append
		(8258869577519436579L * (class669.aClass659Array8598[i_0_]
					 .aClass534_Sub18_Sub8_8542.aLong7158))
		.append(" ");
	stringbuilder.append("")
	    .append(Integer.valueOf(1391779877 * class515.anInt6326));
	Class262.method4824(stringbuilder.toString(), exception, (byte) -61);
    }
    
    static final void method1835(Class669 class669, int i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (client.aString11300 != null
	    && i_1_ < -217094943 * Class455.anInt4963)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= Class168.aClass98Array1792[i_1_].aString1166;
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
    }
    
    static final void method1836(Class669 class669, int i) {
	Class403.aClass403_4142.method6601(421734097);
    }
    
    static void method1837(boolean bool, int i) {
	Class597 class597 = Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				.method18603(1862409252);
	Class534_Sub18_Sub9 class534_sub18_sub9
	    = Class554_Sub1.method9113(-424199969 * class597.anInt7859,
				       class597.anInt7861 * -1166289421);
	if (null == class534_sub18_sub9)
	    class534_sub18_sub9
		= Class554_Sub1.method9114(-1604882349 * (Class554_Sub1
							  .aClass622_7353
							  .anInt8133));
	if (class534_sub18_sub9 != Class519.aClass534_Sub18_Sub9_7057
	    || bool) {
	    Class519.aClass534_Sub18_Sub9_7057 = class534_sub18_sub9;
	    boolean bool_2_ = Class554_Sub1.method9197(class534_sub18_sub9);
	    if (bool_2_) {
		Class554_Sub1.aBool7355 = true;
		Class176.method2929(-2024655746);
	    }
	}
    }
    
    static final void method1838(Class669 class669, byte i) {
	int i_3_ = (client.anIntArrayArrayArray11151
		    [class669.anIntArray8595[((class669.anInt8600 -= 308999563)
					      * 2088438307)]]).length >> 1;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_3_;
    }
}
