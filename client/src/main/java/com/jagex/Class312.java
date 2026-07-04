/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public abstract class Class312 implements Interface32
{
    Class472 aClass472_3365;
    Class394 aClass394_3366;
    Class472 aClass472_3367;
    Class171 aClass171_3368;
    int anInt3369;
    long aLong3370;
    public static short[][][] aShortArrayArrayArray3371;
    
    abstract void method5671(boolean bool, int i, int i_0_);
    
    public void method205(boolean bool, byte i) {
	int i_1_ = ((aClass394_3366.aClass401_4096.method6586
		     (-1607607997 * aClass394_3366.anInt4097,
		      -321474631 * client.anInt11047, -1313184699))
		    + aClass394_3366.anInt4101 * -2127596367);
	int i_2_ = ((aClass394_3366.aClass391_4095.method6544
		     (aClass394_3366.anInt4098 * -228886179,
		      client.anInt11192 * 43072843, (byte) 59))
		    + -1055236307 * aClass394_3366.anInt4093);
	method5672(bool, i_1_, i_2_, (short) -19840);
	method5673(bool, i_1_, i_2_, (byte) 3);
	String string = Class277.aClass300_3049.method5526((byte) -5);
	if (Class250.method4604((byte) -20) - aLong3370 * -7109297695834388303L
	    > 10000L)
	    string
		= new StringBuilder().append(string).append(" (").append
		      (Class277.aClass300_3049.method5529((byte) 123).anInt3148
		       * -1262216053)
		      .append
		      (")").toString();
	aClass171_3368.method2830
	    (string, i_1_ + -1607607997 * aClass394_3366.anInt4097 / 2,
	     (-81046249 * aClass394_3366.anInt4099
	      + (4 + (i_2_ + aClass394_3366.anInt4098 * -228886179 / 2))),
	     aClass394_3366.anInt4094 * 1210620409, -1, 65535);
    }
    
    public void method203() {
	Class16 class16
	    = Class20.method804(aClass472_3365,
				-120853723 * aClass394_3366.anInt4100,
				Class351.aClass406_3620, -103210469);
	aClass171_3368
	    = (Class254.aClass185_2683.method3325
	       (class16,
		Class178.method2942(aClass472_3367,
				    aClass394_3366.anInt4100 * -120853723),
		true));
    }
    
    public boolean method207() {
	boolean bool = true;
	if (!aClass472_3367.method7670(aClass394_3366.anInt4100 * -120853723,
				       (byte) -37))
	    bool = false;
	if (!aClass472_3365.method7670(aClass394_3366.anInt4100 * -120853723,
				       (byte) -64))
	    bool = false;
	return bool;
    }
    
    abstract void method5672(boolean bool, int i, int i_3_, short i_4_);
    
    abstract void method5673(boolean bool, int i, int i_5_, byte i_6_);
    
    int method5674(byte i) {
	int i_7_ = Class277.aClass300_3049.method5525(1130125338);
	int i_8_ = 100 * i_7_;
	if (2118526551 * anInt3369 == i_7_ && 0 != i_7_) {
	    int i_9_ = Class277.aClass300_3049.method5524(2100750320);
	    if (i_9_ > i_7_) {
		long l = (-7109297695834388303L * aLong3370
			  - Class277.aClass300_3049.method5550(-435498526));
		if (l > 0L) {
		    long l_10_
			= 10000L * l / (long) i_7_ * (long) (i_9_ - i_7_);
		    long l_11_ = ((Class250.method4604((byte) -82)
				   - aLong3370 * -7109297695834388303L)
				  * 10000L);
		    if (l_11_ < l_10_)
			i_8_ = (int) ((100L * (l_11_ * (long) (i_9_ - i_7_))
				       / l_10_)
				      + (long) (i_7_ * 100));
		    else
			i_8_ = 100 * i_9_;
		}
	    }
	} else {
	    anInt3369 = i_7_ * 1713644903;
	    aLong3370 = Class250.method4604((byte) -60) * 8000396240611147857L;
	}
	return i_8_;
    }
    
    public void method202(boolean bool) {
	int i = ((aClass394_3366.aClass401_4096.method6586
		  (-1607607997 * aClass394_3366.anInt4097,
		   -321474631 * client.anInt11047, -910436052))
		 + aClass394_3366.anInt4101 * -2127596367);
	int i_12_ = ((aClass394_3366.aClass391_4095.method6544
		      (aClass394_3366.anInt4098 * -228886179,
		       client.anInt11192 * 43072843, (byte) 102))
		     + -1055236307 * aClass394_3366.anInt4093);
	method5672(bool, i, i_12_, (short) -5807);
	method5673(bool, i, i_12_, (byte) 3);
	String string = Class277.aClass300_3049.method5526((byte) -45);
	if (Class250.method4604((byte) -51) - aLong3370 * -7109297695834388303L
	    > 10000L)
	    string
		= new StringBuilder().append(string).append(" (").append
		      (Class277.aClass300_3049.method5529((byte) 13).anInt3148
		       * -1262216053)
		      .append
		      (")").toString();
	aClass171_3368.method2830
	    (string, i + -1607607997 * aClass394_3366.anInt4097 / 2,
	     (-81046249 * aClass394_3366.anInt4099
	      + (4 + (i_12_ + aClass394_3366.anInt4098 * -228886179 / 2))),
	     aClass394_3366.anInt4094 * 1210620409, -1, 65535);
    }
    
    abstract void method5675(boolean bool, int i, int i_13_);
    
    public void method201(short i) {
	Class16 class16
	    = Class20.method804(aClass472_3365,
				-120853723 * aClass394_3366.anInt4100,
				Class351.aClass406_3620, -103210469);
	aClass171_3368
	    = (Class254.aClass185_2683.method3325
	       (class16,
		Class178.method2942(aClass472_3367,
				    aClass394_3366.anInt4100 * -120853723),
		true));
    }
    
    public boolean method208() {
	boolean bool = true;
	if (!aClass472_3367.method7670(aClass394_3366.anInt4100 * -120853723,
				       (byte) -73))
	    bool = false;
	if (!aClass472_3365.method7670(aClass394_3366.anInt4100 * -120853723,
				       (byte) -70))
	    bool = false;
	return bool;
    }
    
    public boolean method200() {
	boolean bool = true;
	if (!aClass472_3367.method7670(aClass394_3366.anInt4100 * -120853723,
				       (byte) -109))
	    bool = false;
	if (!aClass472_3365.method7670(aClass394_3366.anInt4100 * -120853723,
				       (byte) -127))
	    bool = false;
	return bool;
    }
    
    public boolean method206() {
	boolean bool = true;
	if (!aClass472_3367.method7670(aClass394_3366.anInt4100 * -120853723,
				       (byte) -35))
	    bool = false;
	if (!aClass472_3365.method7670(aClass394_3366.anInt4100 * -120853723,
				       (byte) -24))
	    bool = false;
	return bool;
    }
    
    public boolean method199(int i) {
	boolean bool = true;
	if (!aClass472_3367.method7670(aClass394_3366.anInt4100 * -120853723,
				       (byte) -34))
	    bool = false;
	if (!aClass472_3365.method7670(aClass394_3366.anInt4100 * -120853723,
				       (byte) -81))
	    bool = false;
	return bool;
    }
    
    Class312(Class472 class472, Class472 class472_14_, Class394 class394) {
	aClass472_3367 = class472;
	aClass472_3365 = class472_14_;
	aClass394_3366 = class394;
    }
    
    abstract void method5676(boolean bool, int i, int i_15_);
    
    abstract void method5677(boolean bool, int i, int i_16_);
    
    abstract void method5678(boolean bool, int i, int i_17_);
    
    public boolean method204() {
	boolean bool = true;
	if (!aClass472_3367.method7670(aClass394_3366.anInt4100 * -120853723,
				       (byte) -6))
	    bool = false;
	if (!aClass472_3365.method7670(aClass394_3366.anInt4100 * -120853723,
				       (byte) -1))
	    bool = false;
	return bool;
    }
    
    int method5679() {
	int i = Class277.aClass300_3049.method5525(-508875758);
	int i_18_ = 100 * i;
	if (2118526551 * anInt3369 == i && 0 != i) {
	    int i_19_ = Class277.aClass300_3049.method5524(541001363);
	    if (i_19_ > i) {
		long l = (-7109297695834388303L * aLong3370
			  - Class277.aClass300_3049.method5550(-435498526));
		if (l > 0L) {
		    long l_20_ = 10000L * l / (long) i * (long) (i_19_ - i);
		    long l_21_ = ((Class250.method4604((byte) -83)
				   - aLong3370 * -7109297695834388303L)
				  * 10000L);
		    if (l_21_ < l_20_)
			i_18_ = (int) ((100L * (l_21_ * (long) (i_19_ - i))
					/ l_20_)
				       + (long) (i * 100));
		    else
			i_18_ = 100 * i_19_;
		}
	    }
	} else {
	    anInt3369 = i * 1713644903;
	    aLong3370 = Class250.method4604((byte) -59) * 8000396240611147857L;
	}
	return i_18_;
    }
    
    int method5680() {
	int i = Class277.aClass300_3049.method5525(1456091056);
	int i_22_ = 100 * i;
	if (2118526551 * anInt3369 == i && 0 != i) {
	    int i_23_ = Class277.aClass300_3049.method5524(641513001);
	    if (i_23_ > i) {
		long l = (-7109297695834388303L * aLong3370
			  - Class277.aClass300_3049.method5550(-435498526));
		if (l > 0L) {
		    long l_24_ = 10000L * l / (long) i * (long) (i_23_ - i);
		    long l_25_ = ((Class250.method4604((byte) -20)
				   - aLong3370 * -7109297695834388303L)
				  * 10000L);
		    if (l_25_ < l_24_)
			i_22_ = (int) ((100L * (l_25_ * (long) (i_23_ - i))
					/ l_24_)
				       + (long) (i * 100));
		    else
			i_22_ = 100 * i_23_;
		}
	    }
	} else {
	    anInt3369 = i * 1713644903;
	    aLong3370
		= Class250.method4604((byte) -127) * 8000396240611147857L;
	}
	return i_22_;
    }
    
    static final void method5681(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class536.method8907(class247, class243, class669, (short) -256);
    }
    
    static final boolean method5682(Class100 class100, int i) {
	boolean bool;
	try {
	    bool = Class160.method2619(class100, 856868269);
	} catch (IOException ioexception) {
	    if (-1850530127 * client.anInt11039 == 7) {
		class100.method1870(-1695646946);
		return false;
	    }
	    Class515.method8589(-1663178506);
	    return true;
	} catch (Exception exception) {
	    Class597 class597 = client.aClass512_11100.method8416((byte) 17);
	    String string
		= new StringBuilder().append
		      (class100.aClass409_1186 != null
		       ? -1228959953 * class100.aClass409_1186.anInt4511 : -1)
		      .append
		      (Class29.aString260).append
		      (class100.aClass409_1196 != null
		       ? -1228959953 * class100.aClass409_1196.anInt4511 : -1)
		      .append
		      (Class29.aString260).append
		      (class100.aClass409_1195 != null
		       ? -1228959953 * class100.aClass409_1195.anInt4511 : -1)
		      .append
		      (" ").append
		      (class100.anInt1197 * -1013636781).append
		      (Class29.aString260).append
		      (-424199969 * class597.anInt7859
		       + (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			  .anIntArray11977[0]))
		      .append
		      (Class29.aString260).append
		      (-1166289421 * class597.anInt7861
		       + (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			  .anIntArray11978[0]))
		      .append
		      (" ").toString();
	    for (int i_26_ = 0;
		 i_26_ < class100.anInt1197 * -1013636781 && i_26_ < 50;
		 i_26_++)
		string = new StringBuilder().append(string).append
			     (class100.aClass534_Sub40_Sub1_1179
			      .aByteArray10810[i_26_])
			     .append
			     (Class29.aString260).toString();
	    Class262.method4824(string, exception, (byte) 107);
	    Class622.method10291(false, -292381061);
	    return true;
	}
	return bool;
    }
}
