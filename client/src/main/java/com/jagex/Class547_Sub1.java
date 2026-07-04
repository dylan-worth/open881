/* Class547_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class547_Sub1 extends Class547
    implements KeyListener, FocusListener
{
    Component aComponent10828;
    static final int anInt10829 = 128;
    Class700 aClass700_10830;
    Class700 aClass700_10831 = new Class700();
    boolean[] aBoolArray10832;
    static final int anInt10833 = 112;
    static int[] anIntArray10834
	= { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0,
	    0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96,
	    98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22,
	    23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39,
	    54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64,
	    0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0,
	    88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101,
	    128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140,
	    141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0,
	    0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
	    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    
    public synchronized void keyPressed(KeyEvent keyevent) {
	method16774(keyevent, 0, (byte) 17);
    }
    
    void method16768(Component component, int i) {
	method16769((byte) 1);
	aComponent10828 = component;
	aComponent10828.addKeyListener(this);
	aComponent10828.addFocusListener(this);
    }
    
    void method16769(byte i) {
	if (null != aComponent10828) {
	    aComponent10828.removeKeyListener(this);
	    aComponent10828.removeFocusListener(this);
	    aComponent10828 = null;
	    for (int i_0_ = 0; i_0_ < 112; i_0_++)
		aBoolArray10832[i_0_] = false;
	    aClass700_10831.method14152(-845583965);
	    aClass700_10830.method14152(-1095492834);
	}
    }
    
    int method16770() {
	int i = 0;
	if (aBoolArray10832[81])
	    i |= 0x1;
	if (aBoolArray10832[82])
	    i |= 0x4;
	if (aBoolArray10832[86])
	    i |= 0x2;
	return i;
    }
    
    public Interface63 method8996(int i) {
	return (Interface63) aClass700_10831.method14132((byte) -118);
    }
    
    public boolean method8995(int i, byte i_1_) {
	if (i < 0 || i >= 112)
	    return false;
	return aBoolArray10832[i];
    }
    
    void method16771(KeyEvent keyevent, int i) {
	int i_2_ = keyevent.getKeyCode();
	if (0 != i_2_) {
	    if (i_2_ >= 0 && i_2_ < anIntArray10834.length) {
		i_2_ = anIntArray10834[i_2_];
		if (0 == i && 0 != (i_2_ & 0x80))
		    i_2_ = 0;
		else
		    i_2_ &= ~0x80;
	    } else
		i_2_ = 0;
	} else
	    i_2_ = 0;
	if (i_2_ != 0) {
	    method16790(i, '\uffff', i_2_, -117799250);
	    keyevent.consume();
	}
    }
    
    int method16772(int i) {
	int i_3_ = 0;
	if (aBoolArray10832[81])
	    i_3_ |= 0x1;
	if (aBoolArray10832[82])
	    i_3_ |= 0x4;
	if (aBoolArray10832[86])
	    i_3_ |= 0x2;
	return i_3_;
    }
    
    public void method16773(FocusEvent focusevent) {
	/* empty */
    }
    
    void method16774(KeyEvent keyevent, int i, byte i_4_) {
	int i_5_ = keyevent.getKeyCode();
	if (0 != i_5_) {
	    if (i_5_ >= 0 && i_5_ < anIntArray10834.length) {
		i_5_ = anIntArray10834[i_5_];
		if (0 == i && 0 != (i_5_ & 0x80))
		    i_5_ = 0;
		else
		    i_5_ &= ~0x80;
	    } else
		i_5_ = 0;
	} else
	    i_5_ = 0;
	if (i_5_ != 0) {
	    method16790(i, '\uffff', i_5_, -517941813);
	    keyevent.consume();
	}
    }
    
    public void method8998() {
	method16769((byte) 1);
    }
    
    public synchronized void keyTyped(KeyEvent keyevent) {
	char c = keyevent.getKeyChar();
	if (c != '\uffff' && Class691.method14040(c, -1833363213)) {
	    method16790(3, c, -1, -506559992);
	    keyevent.consume();
	}
    }
    
    public boolean method9004(int i) {
	if (i < 0 || i >= 112)
	    return false;
	return aBoolArray10832[i];
    }
    
    public void focusGained(FocusEvent focusevent) {
	/* empty */
    }
    
    public synchronized void focusLost(FocusEvent focusevent) {
	method16790(-1, '\0', 0, -582439376);
    }
    
    public void method16775(FocusEvent focusevent) {
	/* empty */
    }
    
    public void method16776(FocusEvent focusevent) {
	/* empty */
    }
    
    public synchronized void method9005() {
	aClass700_10831.method14152(-1473013360);
	for (Class534_Sub33 class534_sub33
		 = (Class534_Sub33) aClass700_10830.method14132((byte) -113);
	     class534_sub33 != null;
	     class534_sub33
		 = (Class534_Sub33) aClass700_10830.method14132((byte) -36)) {
	    class534_sub33.anInt10722 = method16772(-308507135) * -1778146473;
	    if (class534_sub33.anInt10719 * 1926402485 == 0) {
		if (!aBoolArray10832[class534_sub33.anInt10720 * -387225769]) {
		    Class534_Sub33 class534_sub33_6_ = new Class534_Sub33();
		    class534_sub33_6_.anInt10719 = 0;
		    class534_sub33_6_.aChar10717 = '\uffff';
		    class534_sub33_6_.anInt10720
			= 1 * class534_sub33.anInt10720;
		    class534_sub33_6_.aLong10721
			= 1L * class534_sub33.aLong10721;
		    class534_sub33_6_.anInt10722
			= 1 * class534_sub33.anInt10722;
		    aClass700_10831.method14131(class534_sub33_6_,
						(short) 789);
		    aBoolArray10832[class534_sub33.anInt10720 * -387225769]
			= true;
		}
		class534_sub33.anInt10719 = -1270798022;
		aClass700_10831.method14131(class534_sub33, (short) 789);
	    } else if (1 == class534_sub33.anInt10719 * 1926402485) {
		if (aBoolArray10832[class534_sub33.anInt10720 * -387225769]) {
		    aClass700_10831.method14131(class534_sub33, (short) 789);
		    aBoolArray10832[class534_sub33.anInt10720 * -387225769]
			= false;
		}
	    } else if (class534_sub33.anInt10719 * 1926402485 == -1) {
		for (int i = 0; i < 112; i++) {
		    if (aBoolArray10832[i]) {
			Class534_Sub33 class534_sub33_7_
			    = new Class534_Sub33();
			class534_sub33_7_.anInt10719 = 1512084637;
			class534_sub33_7_.aChar10717 = '\uffff';
			class534_sub33_7_.anInt10720 = 964326503 * i;
			class534_sub33_7_.aLong10721
			    = class534_sub33.aLong10721 * 1L;
			class534_sub33_7_.anInt10722
			    = 1 * class534_sub33.anInt10722;
			aClass700_10831.method14131(class534_sub33_7_,
						    (short) 789);
			aBoolArray10832[i] = false;
		    }
		}
	    } else if (3 == class534_sub33.anInt10719 * 1926402485)
		aClass700_10831.method14131(class534_sub33, (short) 789);
	}
    }
    
    public Interface63 method9000() {
	return (Interface63) aClass700_10831.method14132((byte) -112);
    }
    
    public synchronized void method16777(FocusEvent focusevent) {
	method16790(-1, '\0', 0, -1436848593);
    }
    
    public synchronized void method16778(FocusEvent focusevent) {
	method16790(-1, '\0', 0, -799608419);
    }
    
    void method16779() {
	if (null != aComponent10828) {
	    aComponent10828.removeKeyListener(this);
	    aComponent10828.removeFocusListener(this);
	    aComponent10828 = null;
	    for (int i = 0; i < 112; i++)
		aBoolArray10832[i] = false;
	    aClass700_10831.method14152(-1659866213);
	    aClass700_10830.method14152(-1059911097);
	}
    }
    
    public void method8997(byte i) {
	method16769((byte) 1);
    }
    
    static void method16780() {
	anIntArray10834[44] = 71;
	anIntArray10834[45] = 26;
	anIntArray10834[46] = 72;
	anIntArray10834[47] = 73;
	anIntArray10834[59] = 57;
	anIntArray10834[61] = 27;
	anIntArray10834[91] = 42;
	anIntArray10834[92] = 74;
	anIntArray10834[93] = 43;
	anIntArray10834[192] = 28;
	anIntArray10834[222] = 58;
	anIntArray10834[520] = 59;
    }
    
    static void method16781() {
	anIntArray10834[44] = 71;
	anIntArray10834[45] = 26;
	anIntArray10834[46] = 72;
	anIntArray10834[47] = 73;
	anIntArray10834[59] = 57;
	anIntArray10834[61] = 27;
	anIntArray10834[91] = 42;
	anIntArray10834[92] = 74;
	anIntArray10834[93] = 43;
	anIntArray10834[192] = 28;
	anIntArray10834[222] = 58;
	anIntArray10834[520] = 59;
    }
    
    public synchronized void keyReleased(KeyEvent keyevent) {
	method16774(keyevent, 1, (byte) 17);
    }
    
    void method16782(Component component) {
	method16769((byte) 1);
	aComponent10828 = component;
	aComponent10828.addKeyListener(this);
	aComponent10828.addFocusListener(this);
    }
    
    void method16783(Component component) {
	method16769((byte) 1);
	aComponent10828 = component;
	aComponent10828.addKeyListener(this);
	aComponent10828.addFocusListener(this);
    }
    
    public void method9009() {
	method16769((byte) 1);
    }
    
    public synchronized void method16784(FocusEvent focusevent) {
	method16790(-1, '\0', 0, 733831894);
    }
    
    int method16785() {
	int i = 0;
	if (aBoolArray10832[81])
	    i |= 0x1;
	if (aBoolArray10832[82])
	    i |= 0x4;
	if (aBoolArray10832[86])
	    i |= 0x2;
	return i;
    }
    
    void method16786(Component component) {
	method16769((byte) 1);
	aComponent10828 = component;
	aComponent10828.addKeyListener(this);
	aComponent10828.addFocusListener(this);
    }
    
    void method16787(int i, char c, int i_8_) {
	Class534_Sub33 class534_sub33 = new Class534_Sub33();
	class534_sub33.anInt10719 = 1512084637 * i;
	class534_sub33.aChar10717 = c;
	class534_sub33.anInt10720 = 964326503 * i_8_;
	class534_sub33.aLong10721
	    = Class250.method4604((byte) -17) * 8265134375462934379L;
	aClass700_10830.method14131(class534_sub33, (short) 789);
    }
    
    Class547_Sub1(Component component) {
	aClass700_10830 = new Class700();
	aBoolArray10832 = new boolean[112];
	Class347_Sub1.method15773((short) 2903);
	method16768(component, -1585631909);
    }
    
    public Interface63 method8994() {
	return (Interface63) aClass700_10831.method14132((byte) -75);
    }
    
    public Interface63 method8999() {
	return (Interface63) aClass700_10831.method14132((byte) -29);
    }
    
    void method16788(int i, char c, int i_9_) {
	Class534_Sub33 class534_sub33 = new Class534_Sub33();
	class534_sub33.anInt10719 = 1512084637 * i;
	class534_sub33.aChar10717 = c;
	class534_sub33.anInt10720 = 964326503 * i_9_;
	class534_sub33.aLong10721
	    = Class250.method4604((byte) -51) * 8265134375462934379L;
	aClass700_10830.method14131(class534_sub33, (short) 789);
    }
    
    public Interface63 method9001() {
	return (Interface63) aClass700_10831.method14132((byte) -127);
    }
    
    public boolean method9008(int i) {
	if (i < 0 || i >= 112)
	    return false;
	return aBoolArray10832[i];
    }
    
    public boolean method9003(int i) {
	if (i < 0 || i >= 112)
	    return false;
	return aBoolArray10832[i];
    }
    
    void method16789(int i, char c, int i_10_) {
	Class534_Sub33 class534_sub33 = new Class534_Sub33();
	class534_sub33.anInt10719 = 1512084637 * i;
	class534_sub33.aChar10717 = c;
	class534_sub33.anInt10720 = 964326503 * i_10_;
	class534_sub33.aLong10721
	    = Class250.method4604((byte) -23) * 8265134375462934379L;
	aClass700_10830.method14131(class534_sub33, (short) 789);
    }
    
    void method16790(int i, char c, int i_11_, int i_12_) {
	Class534_Sub33 class534_sub33 = new Class534_Sub33();
	class534_sub33.anInt10719 = 1512084637 * i;
	class534_sub33.aChar10717 = c;
	class534_sub33.anInt10720 = 964326503 * i_11_;
	class534_sub33.aLong10721
	    = Class250.method4604((byte) -61) * 8265134375462934379L;
	aClass700_10830.method14131(class534_sub33, (short) 789);
    }
    
    public synchronized void method9006() {
	aClass700_10831.method14152(-1263638066);
	for (Class534_Sub33 class534_sub33
		 = (Class534_Sub33) aClass700_10830.method14132((byte) -49);
	     class534_sub33 != null;
	     class534_sub33
		 = (Class534_Sub33) aClass700_10830.method14132((byte) -44)) {
	    class534_sub33.anInt10722 = method16772(273227820) * -1778146473;
	    if (class534_sub33.anInt10719 * 1926402485 == 0) {
		if (!aBoolArray10832[class534_sub33.anInt10720 * -387225769]) {
		    Class534_Sub33 class534_sub33_13_ = new Class534_Sub33();
		    class534_sub33_13_.anInt10719 = 0;
		    class534_sub33_13_.aChar10717 = '\uffff';
		    class534_sub33_13_.anInt10720
			= 1 * class534_sub33.anInt10720;
		    class534_sub33_13_.aLong10721
			= 1L * class534_sub33.aLong10721;
		    class534_sub33_13_.anInt10722
			= 1 * class534_sub33.anInt10722;
		    aClass700_10831.method14131(class534_sub33_13_,
						(short) 789);
		    aBoolArray10832[class534_sub33.anInt10720 * -387225769]
			= true;
		}
		class534_sub33.anInt10719 = -1270798022;
		aClass700_10831.method14131(class534_sub33, (short) 789);
	    } else if (1 == class534_sub33.anInt10719 * 1926402485) {
		if (aBoolArray10832[class534_sub33.anInt10720 * -387225769]) {
		    aClass700_10831.method14131(class534_sub33, (short) 789);
		    aBoolArray10832[class534_sub33.anInt10720 * -387225769]
			= false;
		}
	    } else if (class534_sub33.anInt10719 * 1926402485 == -1) {
		for (int i = 0; i < 112; i++) {
		    if (aBoolArray10832[i]) {
			Class534_Sub33 class534_sub33_14_
			    = new Class534_Sub33();
			class534_sub33_14_.anInt10719 = 1512084637;
			class534_sub33_14_.aChar10717 = '\uffff';
			class534_sub33_14_.anInt10720 = 964326503 * i;
			class534_sub33_14_.aLong10721
			    = class534_sub33.aLong10721 * 1L;
			class534_sub33_14_.anInt10722
			    = 1 * class534_sub33.anInt10722;
			aClass700_10831.method14131(class534_sub33_14_,
						    (short) 789);
			aBoolArray10832[i] = false;
		    }
		}
	    } else if (3 == class534_sub33.anInt10719 * 1926402485)
		aClass700_10831.method14131(class534_sub33, (short) 789);
	}
    }
    
    static void method16791() {
	anIntArray10834[44] = 71;
	anIntArray10834[45] = 26;
	anIntArray10834[46] = 72;
	anIntArray10834[47] = 73;
	anIntArray10834[59] = 57;
	anIntArray10834[61] = 27;
	anIntArray10834[91] = 42;
	anIntArray10834[92] = 74;
	anIntArray10834[93] = 43;
	anIntArray10834[192] = 28;
	anIntArray10834[222] = 58;
	anIntArray10834[520] = 59;
    }
    
    void method16792(Component component) {
	method16769((byte) 1);
	aComponent10828 = component;
	aComponent10828.addKeyListener(this);
	aComponent10828.addFocusListener(this);
    }
    
    int method16793() {
	int i = 0;
	if (aBoolArray10832[81])
	    i |= 0x1;
	if (aBoolArray10832[82])
	    i |= 0x4;
	if (aBoolArray10832[86])
	    i |= 0x2;
	return i;
    }
    
    void method16794(Component component) {
	method16769((byte) 1);
	aComponent10828 = component;
	aComponent10828.addKeyListener(this);
	aComponent10828.addFocusListener(this);
    }
    
    public synchronized void method16795(KeyEvent keyevent) {
	method16774(keyevent, 0, (byte) 17);
    }
    
    public void method9007() {
	method16769((byte) 1);
    }
    
    public void method16796(FocusEvent focusevent) {
	/* empty */
    }
    
    public synchronized void method9002(int i) {
	aClass700_10831.method14152(-1139582837);
	for (Class534_Sub33 class534_sub33
		 = (Class534_Sub33) aClass700_10830.method14132((byte) -47);
	     class534_sub33 != null;
	     class534_sub33
		 = (Class534_Sub33) aClass700_10830.method14132((byte) -19)) {
	    class534_sub33.anInt10722 = method16772(-25735627) * -1778146473;
	    if (class534_sub33.anInt10719 * 1926402485 == 0) {
		if (!aBoolArray10832[class534_sub33.anInt10720 * -387225769]) {
		    Class534_Sub33 class534_sub33_15_ = new Class534_Sub33();
		    class534_sub33_15_.anInt10719 = 0;
		    class534_sub33_15_.aChar10717 = '\uffff';
		    class534_sub33_15_.anInt10720
			= 1 * class534_sub33.anInt10720;
		    class534_sub33_15_.aLong10721
			= 1L * class534_sub33.aLong10721;
		    class534_sub33_15_.anInt10722
			= 1 * class534_sub33.anInt10722;
		    aClass700_10831.method14131(class534_sub33_15_,
						(short) 789);
		    aBoolArray10832[class534_sub33.anInt10720 * -387225769]
			= true;
		}
		class534_sub33.anInt10719 = -1270798022;
		aClass700_10831.method14131(class534_sub33, (short) 789);
	    } else if (1 == class534_sub33.anInt10719 * 1926402485) {
		if (aBoolArray10832[class534_sub33.anInt10720 * -387225769]) {
		    aClass700_10831.method14131(class534_sub33, (short) 789);
		    aBoolArray10832[class534_sub33.anInt10720 * -387225769]
			= false;
		}
	    } else if (class534_sub33.anInt10719 * 1926402485 == -1) {
		for (int i_16_ = 0; i_16_ < 112; i_16_++) {
		    if (aBoolArray10832[i_16_]) {
			Class534_Sub33 class534_sub33_17_
			    = new Class534_Sub33();
			class534_sub33_17_.anInt10719 = 1512084637;
			class534_sub33_17_.aChar10717 = '\uffff';
			class534_sub33_17_.anInt10720 = 964326503 * i_16_;
			class534_sub33_17_.aLong10721
			    = class534_sub33.aLong10721 * 1L;
			class534_sub33_17_.anInt10722
			    = 1 * class534_sub33.anInt10722;
			aClass700_10831.method14131(class534_sub33_17_,
						    (short) 789);
			aBoolArray10832[i_16_] = false;
		    }
		}
	    } else if (3 == class534_sub33.anInt10719 * 1926402485)
		aClass700_10831.method14131(class534_sub33, (short) 789);
	}
    }
}
