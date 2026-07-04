/* Class176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class176
{
    public static final int anInt1839 = 4318;
    public static final int anInt1840 = 32902;
    public static final int anInt1841 = 4098;
    public String aString1842;
    public static final int anInt1843 = -1;
    public int anInt1844;
    public String aString1845;
    public int anInt1846;
    public static final int anInt1847 = 0;
    public long aLong1848;
    
    public Class176(int i, String string, int i_0_, String string_1_, long l,
		    boolean bool) {
	anInt1844 = i * 348799961;
	aString1845 = string;
	anInt1846 = -28778987 * i_0_;
	aString1842 = string_1_;
	aLong1848 = 954233077441941561L * l;
    }
    
    public static boolean method2926(int i, byte i_2_) {
	return ((i >= Class595.aClass595_7851.anInt7852 * 847393323
		 && i <= Class595.aClass595_7832.anInt7852 * 847393323)
		|| 847393323 * Class595.aClass595_7833.anInt7852 == i);
    }
    
    static final void method2927(Class669 class669, int i) {
	class669.anInt8600 -= 1235998252;
	client.aShort11315
	    = (short) class669.anIntArray8595[2088438307 * class669.anInt8600];
	if (client.aShort11315 <= 0)
	    client.aShort11315 = (short) 1;
	client.aShort11316 = (short) (class669.anIntArray8595
				      [class669.anInt8600 * 2088438307 + 1]);
	if (client.aShort11316 <= 0)
	    client.aShort11316 = (short) 32767;
	else if (client.aShort11316 < client.aShort11315)
	    client.aShort11316 = client.aShort11315;
	client.aShort11317 = (short) (class669.anIntArray8595
				      [2088438307 * class669.anInt8600 + 2]);
	if (client.aShort11317 <= 0)
	    client.aShort11317 = (short) 1;
	client.aShort11318 = (short) (class669.anIntArray8595
				      [2088438307 * class669.anInt8600 + 3]);
	if (client.aShort11318 <= 0)
	    client.aShort11318 = (short) 32767;
	else if (client.aShort11318 < client.aShort11317)
	    client.aShort11318 = client.aShort11317;
    }
    
    static void method2928(int i) {
	Class113.anInt1365 = 0;
	Class113.anInt1375 = 1660827629;
	Class113.anInt1376 = -517634255;
    }
    
    static void method2929(int i) {
	Class615.aClass700_8055 = null;
	Class554_Sub1.anInt10671 = 0;
	Class554_Sub1.anInt7399 = 0;
	Class237.aClass247_2377 = null;
	Class554_Sub1.method9117();
	Class554_Sub1.aClass700_7413.method14152(-1111655310);
	Class554_Sub1.aClass523_7366 = null;
	Class554_Sub1.aClass203_7392.method3877(-1284109352);
	Class554_Sub1.aClass203_7393.method3877(-511576757);
	Class204.aClass163_2205 = null;
	Class554_Sub1.anInt10672 = 1421361991;
	Class554_Sub1.anInt10673 = -2017528667;
	if (null != Class554_Sub1.aClass44_Sub9_7349) {
	    Class554_Sub1.aClass44_Sub9_7349.method1080(65280);
	    Class554_Sub1.aClass44_Sub9_7349.method17322(128, 64, 1668621386);
	}
	if (null != Class554_Sub1.aClass44_Sub18_7416)
	    Class554_Sub1.aClass44_Sub18_7416.method17359(64, 64, 2144267681);
	if (Class554_Sub1.aClass44_Sub13_7348 != null)
	    Class554_Sub1.aClass44_Sub13_7348.method1079(256, 684971109);
	Class84.aClass44_Sub11_840.method1079(64, 682606992);
    }
}
