/* Class534_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.BitSet;

public class Class534_Sub26 extends Class534
{
    boolean aBool10577 = true;
    public String aString10578;
    public Class337[] aClass337Array10579;
    public int anInt10580 = 0;
    int[] anIntArray10581;
    public byte aByte10582;
    public byte aByte10583;
    long aLong10584;
    boolean aBool10585;
    
    void method16282(int i, byte i_0_) {
	if (aClass337Array10579 != null)
	    System.arraycopy(aClass337Array10579, 0,
			     aClass337Array10579 = new Class337[i], 0,
			     anInt10580 * -1406046755);
	else
	    aClass337Array10579 = new Class337[i];
    }
    
    public Class534_Sub26(Class534_Sub40 class534_sub40) {
	aString10578 = null;
	method16286(class534_sub40, -1268077550);
    }
    
    public int[] method16283(int i) {
	if (null == anIntArray10581) {
	    String[] strings = new String[-1406046755 * anInt10580];
	    anIntArray10581 = new int[anInt10580 * -1406046755];
	    for (int i_1_ = 0; i_1_ < -1406046755 * anInt10580; i_1_++) {
		strings[i_1_] = aClass337Array10579[i_1_].aString3523;
		anIntArray10581[i_1_] = i_1_;
	    }
	    Class588.method9869(strings, anIntArray10581, (byte) 87);
	}
	return anIntArray10581;
    }
    
    public int method16284(String string) {
	for (int i = 0; i < -1406046755 * anInt10580; i++) {
	    if (aClass337Array10579[i].aString3523.equalsIgnoreCase(string))
		return i;
	}
	return -1;
    }
    
    public int[] method16285() {
	if (null == anIntArray10581) {
	    String[] strings = new String[-1406046755 * anInt10580];
	    anIntArray10581 = new int[anInt10580 * -1406046755];
	    for (int i = 0; i < -1406046755 * anInt10580; i++) {
		strings[i] = aClass337Array10579[i].aString3523;
		anIntArray10581[i] = i;
	    }
	    Class588.method9869(strings, anIntArray10581, (byte) 112);
	}
	return anIntArray10581;
    }
    
    static {
	new BitSet(65536);
    }
    
    void method16286(Class534_Sub40 class534_sub40, int i) {
	int i_2_ = class534_sub40.method16527(-1988761100);
	if (0 != (i_2_ & 0x1))
	    aBool10585 = true;
	if (0 != (i_2_ & 0x2))
	    aBool10577 = true;
	int i_3_ = 2;
	if ((i_2_ & 0x4) != 0)
	    i_3_ = class534_sub40.method16527(-906830426);
	aLong7158
	    = class534_sub40.method16537(1359621443) * 936217890172187787L;
	aLong10584
	    = class534_sub40.method16537(1359621443) * 2175811687201928859L;
	aString10578 = class534_sub40.method16541((byte) -39);
	class534_sub40.method16527(1613215443);
	aByte10582 = class534_sub40.method16586((byte) 1);
	aByte10583 = class534_sub40.method16586((byte) 1);
	anInt10580 = class534_sub40.method16529((byte) 1) * -510111115;
	if (-1406046755 * anInt10580 > 0) {
	    aClass337Array10579 = new Class337[-1406046755 * anInt10580];
	    for (int i_4_ = 0; i_4_ < anInt10580 * -1406046755; i_4_++) {
		Class337 class337 = new Class337();
		if (aBool10585)
		    class534_sub40.method16537(1359621443);
		if (aBool10577)
		    class337.aString3523
			= class534_sub40.method16541((byte) -54);
		class337.aByte3521 = class534_sub40.method16586((byte) 1);
		class337.anInt3522
		    = class534_sub40.method16529((byte) 1) * -1645165713;
		if (i_3_ >= 3)
		    class534_sub40.method16527(1661765187);
		aClass337Array10579[i_4_] = class337;
	    }
	}
    }
    
    void method16287(int i, int i_5_) {
	anInt10580 -= -510111115;
	if (0 == -1406046755 * anInt10580)
	    aClass337Array10579 = null;
	else
	    System.arraycopy(aClass337Array10579, 1 + i, aClass337Array10579,
			     i, -1406046755 * anInt10580 - i);
	anIntArray10581 = null;
    }
    
    void method16288(int i) {
	if (aClass337Array10579 != null)
	    System.arraycopy(aClass337Array10579, 0,
			     aClass337Array10579 = new Class337[i], 0,
			     anInt10580 * -1406046755);
	else
	    aClass337Array10579 = new Class337[i];
    }
    
    public int[] method16289() {
	if (null == anIntArray10581) {
	    String[] strings = new String[-1406046755 * anInt10580];
	    anIntArray10581 = new int[anInt10580 * -1406046755];
	    for (int i = 0; i < -1406046755 * anInt10580; i++) {
		strings[i] = aClass337Array10579[i].aString3523;
		anIntArray10581[i] = i;
	    }
	    Class588.method9869(strings, anIntArray10581, (byte) 105);
	}
	return anIntArray10581;
    }
    
    public int[] method16290() {
	if (null == anIntArray10581) {
	    String[] strings = new String[-1406046755 * anInt10580];
	    anIntArray10581 = new int[anInt10580 * -1406046755];
	    for (int i = 0; i < -1406046755 * anInt10580; i++) {
		strings[i] = aClass337Array10579[i].aString3523;
		anIntArray10581[i] = i;
	    }
	    Class588.method9869(strings, anIntArray10581, (byte) 118);
	}
	return anIntArray10581;
    }
    
    void method16291(Class337 class337) {
	if (aClass337Array10579 == null
	    || anInt10580 * -1406046755 >= aClass337Array10579.length)
	    method16282(anInt10580 * -1406046755 + 5, (byte) 53);
	aClass337Array10579[(anInt10580 += -510111115) * -1406046755 - 1]
	    = class337;
	anIntArray10581 = null;
    }
    
    void method16292(Class337 class337) {
	if (aClass337Array10579 == null
	    || anInt10580 * -1406046755 >= aClass337Array10579.length)
	    method16282(anInt10580 * -1406046755 + 5, (byte) 30);
	aClass337Array10579[(anInt10580 += -510111115) * -1406046755 - 1]
	    = class337;
	anIntArray10581 = null;
    }
    
    void method16293(Class337 class337) {
	if (aClass337Array10579 == null
	    || anInt10580 * -1406046755 >= aClass337Array10579.length)
	    method16282(anInt10580 * -1406046755 + 5, (byte) 118);
	aClass337Array10579[(anInt10580 += -510111115) * -1406046755 - 1]
	    = class337;
	anIntArray10581 = null;
    }
    
    void method16294(Class337 class337) {
	if (aClass337Array10579 == null
	    || anInt10580 * -1406046755 >= aClass337Array10579.length)
	    method16282(anInt10580 * -1406046755 + 5, (byte) 79);
	aClass337Array10579[(anInt10580 += -510111115) * -1406046755 - 1]
	    = class337;
	anIntArray10581 = null;
    }
    
    void method16295(Class337 class337, int i) {
	if (aClass337Array10579 == null
	    || anInt10580 * -1406046755 >= aClass337Array10579.length)
	    method16282(anInt10580 * -1406046755 + 5, (byte) 39);
	aClass337Array10579[(anInt10580 += -510111115) * -1406046755 - 1]
	    = class337;
	anIntArray10581 = null;
    }
    
    void method16296(int i) {
	anInt10580 -= -510111115;
	if (0 == -1406046755 * anInt10580)
	    aClass337Array10579 = null;
	else
	    System.arraycopy(aClass337Array10579, 1 + i, aClass337Array10579,
			     i, -1406046755 * anInt10580 - i);
	anIntArray10581 = null;
    }
    
    void method16297(int i) {
	anInt10580 -= -510111115;
	if (0 == -1406046755 * anInt10580)
	    aClass337Array10579 = null;
	else
	    System.arraycopy(aClass337Array10579, 1 + i, aClass337Array10579,
			     i, -1406046755 * anInt10580 - i);
	anIntArray10581 = null;
    }
    
    void method16298(int i) {
	anInt10580 -= -510111115;
	if (0 == -1406046755 * anInt10580)
	    aClass337Array10579 = null;
	else
	    System.arraycopy(aClass337Array10579, 1 + i, aClass337Array10579,
			     i, -1406046755 * anInt10580 - i);
	anIntArray10581 = null;
    }
    
    void method16299(int i) {
	anInt10580 -= -510111115;
	if (0 == -1406046755 * anInt10580)
	    aClass337Array10579 = null;
	else
	    System.arraycopy(aClass337Array10579, 1 + i, aClass337Array10579,
			     i, -1406046755 * anInt10580 - i);
	anIntArray10581 = null;
    }
    
    public int method16300(String string, int i) {
	for (int i_6_ = 0; i_6_ < -1406046755 * anInt10580; i_6_++) {
	    if (aClass337Array10579[i_6_].aString3523.equalsIgnoreCase(string))
		return i_6_;
	}
	return -1;
    }
    
    public int method16301(String string) {
	for (int i = 0; i < -1406046755 * anInt10580; i++) {
	    if (aClass337Array10579[i].aString3523.equalsIgnoreCase(string))
		return i;
	}
	return -1;
    }
    
    void method16302(Class534_Sub40 class534_sub40) {
	int i = class534_sub40.method16527(-1919641518);
	if (0 != (i & 0x1))
	    aBool10585 = true;
	if (0 != (i & 0x2))
	    aBool10577 = true;
	int i_7_ = 2;
	if ((i & 0x4) != 0)
	    i_7_ = class534_sub40.method16527(-1782529429);
	aLong7158
	    = class534_sub40.method16537(1359621443) * 936217890172187787L;
	aLong10584
	    = class534_sub40.method16537(1359621443) * 2175811687201928859L;
	aString10578 = class534_sub40.method16541((byte) -9);
	class534_sub40.method16527(-321429120);
	aByte10582 = class534_sub40.method16586((byte) 1);
	aByte10583 = class534_sub40.method16586((byte) 1);
	anInt10580 = class534_sub40.method16529((byte) 1) * -510111115;
	if (-1406046755 * anInt10580 > 0) {
	    aClass337Array10579 = new Class337[-1406046755 * anInt10580];
	    for (int i_8_ = 0; i_8_ < anInt10580 * -1406046755; i_8_++) {
		Class337 class337 = new Class337();
		if (aBool10585)
		    class534_sub40.method16537(1359621443);
		if (aBool10577)
		    class337.aString3523
			= class534_sub40.method16541((byte) -125);
		class337.aByte3521 = class534_sub40.method16586((byte) 1);
		class337.anInt3522
		    = class534_sub40.method16529((byte) 1) * -1645165713;
		if (i_7_ >= 3)
		    class534_sub40.method16527(-1870872129);
		aClass337Array10579[i_8_] = class337;
	    }
	}
    }
    
    static void method16303(Class185 class185, byte i) {
	if (Class72.aBool758)
	    Class596.method9917(class185, (byte) -86);
	else
	    Class620.method10275(class185, 197239580);
    }
}
