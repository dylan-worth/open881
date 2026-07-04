/* Class563_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class563_Sub1 extends Class563
    implements MouseListener, MouseMotionListener, MouseWheelListener
{
    static final int anInt10704 = 1;
    static final int anInt10705 = 2;
    static final int anInt10706 = 4;
    int anInt10707;
    Component aComponent10708;
    int anInt10709;
    Class700 aClass700_10710 = new Class700();
    int anInt10711;
    int anInt10712;
    int anInt10713;
    Class700 aClass700_10714 = new Class700();
    int anInt10715;
    boolean aBool10716;
    
    public synchronized void mouseMoved(MouseEvent mouseevent) {
	method16395(mouseevent.getX(), mouseevent.getY(), (byte) 10);
    }
    
    void method16393(Component component, int i) {
	method16403(1775398159);
	aComponent10708 = component;
	aComponent10708.addMouseListener(this);
	aComponent10708.addMouseMotionListener(this);
	aComponent10708.addMouseWheelListener(this);
    }
    
    public boolean method9472(byte i) {
	return 0 != (anInt10709 * 1159354507 & 0x1);
    }
    
    void method16394(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	Class534_Sub42_Sub2 class534_sub42_sub2
	    = Class622.method10290(i, i_0_, i_1_,
				   Class250.method4604((byte) -95), i_2_,
				   -1643616832);
	aClass700_10714.method14131(class534_sub42_sub2, (short) 789);
    }
    
    void method16395(int i, int i_4_, byte i_5_) {
	anInt10715 = -501098171 * i;
	anInt10712 = i_4_ * -987887771;
	if (aBool10716)
	    method16394(-1, i, i_4_, 0, -1613324494);
    }
    
    public Class534_Sub42 method9478(byte i) {
	return (Class534_Sub42) aClass700_10710.method14132((byte) -6);
    }
    
    public synchronized void method9481(int i) {
	anInt10711 = anInt10715 * -238490711;
	anInt10707 = anInt10712 * -104773981;
	anInt10709 = 1191152557 * anInt10713;
	Class700 class700 = aClass700_10710;
	aClass700_10710 = aClass700_10714;
	aClass700_10714 = class700;
	aClass700_10714.method14152(-1632397959);
    }
    
    public synchronized void mouseClicked(MouseEvent mouseevent) {
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public boolean method9501(byte i) {
	return 0 != (anInt10709 * 1159354507 & 0x2);
    }
    
    public boolean method9507() {
	return 0 != (1159354507 * anInt10709 & 0x4);
    }
    
    public int method9493(int i) {
	return anInt10711 * 453576005;
    }
    
    public int method9477(int i) {
	return anInt10707 * -1028660305;
    }
    
    int method16396(MouseEvent mouseevent, byte i) {
	if (mouseevent.getButton() == 1) {
	    if (mouseevent.isMetaDown())
		return 4;
	    return 1;
	}
	if (mouseevent.getButton() == 2)
	    return 2;
	if (mouseevent.getButton() == 3)
	    return 4;
	return 0;
    }
    
    public synchronized void mouseEntered(MouseEvent mouseevent) {
	method16395(mouseevent.getX(), mouseevent.getY(), (byte) 10);
    }
    
    public int method9471() {
	return anInt10707 * -1028660305;
    }
    
    public synchronized void mouseExited(MouseEvent mouseevent) {
	method16395(mouseevent.getX(), mouseevent.getY(), (byte) 10);
    }
    
    public int method9498() {
	return anInt10707 * -1028660305;
    }
    
    public synchronized void mousePressed(MouseEvent mouseevent) {
	int i = method16396(mouseevent, (byte) -120);
	if (1 == i)
	    method16394(0, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), -1613324494);
	else if (4 == i)
	    method16394(2, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), -1613324494);
	else if (i == 2)
	    method16394(1, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), -1613324494);
	anInt10713 = 2065997839 * (894848751 * anInt10713 | i);
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public synchronized void mouseReleased(MouseEvent mouseevent) {
	int i = method16396(mouseevent, (byte) -35);
	if ((894848751 * anInt10713 & i) == 0)
	    i = 894848751 * anInt10713;
	if (0 != (i & 0x1))
	    method16394(3, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), -1613324494);
	if ((i & 0x4) != 0)
	    method16394(5, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), -1613324494);
	if (0 != (i & 0x2))
	    method16394(4, mouseevent.getX(), mouseevent.getY(),
			mouseevent.getClickCount(), -1613324494);
	anInt10713 = 2065997839 * (anInt10713 * 894848751 & (i ^ 0xffffffff));
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public synchronized void mouseDragged(MouseEvent mouseevent) {
	method16395(mouseevent.getX(), mouseevent.getY(), (byte) 10);
    }
    
    void method16397(int i, int i_6_) {
	anInt10715 = -501098171 * i;
	anInt10712 = i_6_ * -987887771;
	if (aBool10716)
	    method16394(-1, i, i_6_, 0, -1613324494);
    }
    
    public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
	int i = mousewheelevent.getX();
	int i_7_ = mousewheelevent.getY();
	int i_8_ = mousewheelevent.getWheelRotation();
	method16394(6, i, i_7_, i_8_, -1613324494);
	mousewheelevent.consume();
    }
    
    public boolean method9473() {
	return 0 != (anInt10709 * 1159354507 & 0x1);
    }
    
    public boolean method9485() {
	return 0 != (anInt10709 * 1159354507 & 0x2);
    }
    
    public boolean method9486() {
	return 0 != (anInt10709 * 1159354507 & 0x2);
    }
    
    public boolean method9487() {
	return 0 != (anInt10709 * 1159354507 & 0x2);
    }
    
    void method16398(int i, int i_9_, int i_10_, int i_11_) {
	Class534_Sub42_Sub2 class534_sub42_sub2
	    = Class622.method10290(i, i_9_, i_10_,
				   Class250.method4604((byte) -63), i_11_,
				   177750224);
	aClass700_10714.method14131(class534_sub42_sub2, (short) 789);
    }
    
    public boolean method9488() {
	return 0 != (anInt10709 * 1159354507 & 0x2);
    }
    
    public int method9505() {
	return anInt10711 * 453576005;
    }
    
    public Class534_Sub42 method9502() {
	return (Class534_Sub42) aClass700_10710.method14132((byte) -49);
    }
    
    public int method9496() {
	return anInt10711 * 453576005;
    }
    
    void method16399() {
	if (aComponent10708 != null) {
	    aComponent10708.removeMouseWheelListener(this);
	    aComponent10708.removeMouseMotionListener(this);
	    aComponent10708.removeMouseListener(this);
	    aComponent10708 = null;
	    anInt10709 = 0;
	    anInt10707 = 0;
	    anInt10711 = 0;
	    anInt10713 = 0;
	    anInt10712 = 0;
	    anInt10715 = 0;
	    aClass700_10710 = null;
	    aClass700_10714 = null;
	}
    }
    
    public int method9497() {
	return anInt10711 * 453576005;
    }
    
    public int method9499() {
	return anInt10707 * -1028660305;
    }
    
    public int method9495() {
	return anInt10711 * 453576005;
    }
    
    public Class534_Sub42 method9504() {
	return (Class534_Sub42) aClass700_10710.method14132((byte) -66);
    }
    
    Class563_Sub1(Component component, boolean bool) {
	method16393(component, 360719612);
	aBool10716 = bool;
    }
    
    public void method9500() {
	method16403(1665174333);
    }
    
    void method16400(Component component) {
	method16403(2035427136);
	aComponent10708 = component;
	aComponent10708.addMouseListener(this);
	aComponent10708.addMouseMotionListener(this);
	aComponent10708.addMouseWheelListener(this);
    }
    
    void method16401() {
	if (aComponent10708 != null) {
	    aComponent10708.removeMouseWheelListener(this);
	    aComponent10708.removeMouseMotionListener(this);
	    aComponent10708.removeMouseListener(this);
	    aComponent10708 = null;
	    anInt10709 = 0;
	    anInt10707 = 0;
	    anInt10711 = 0;
	    anInt10713 = 0;
	    anInt10712 = 0;
	    anInt10715 = 0;
	    aClass700_10710 = null;
	    aClass700_10714 = null;
	}
    }
    
    void method16402() {
	if (aComponent10708 != null) {
	    aComponent10708.removeMouseWheelListener(this);
	    aComponent10708.removeMouseMotionListener(this);
	    aComponent10708.removeMouseListener(this);
	    aComponent10708 = null;
	    anInt10709 = 0;
	    anInt10707 = 0;
	    anInt10711 = 0;
	    anInt10713 = 0;
	    anInt10712 = 0;
	    anInt10715 = 0;
	    aClass700_10710 = null;
	    aClass700_10714 = null;
	}
    }
    
    public boolean method9484() {
	return 0 != (anInt10709 * 1159354507 & 0x2);
    }
    
    public boolean method9494(byte i) {
	return 0 != (1159354507 * anInt10709 & 0x4);
    }
    
    void method16403(int i) {
	if (aComponent10708 != null) {
	    aComponent10708.removeMouseWheelListener(this);
	    aComponent10708.removeMouseMotionListener(this);
	    aComponent10708.removeMouseListener(this);
	    aComponent10708 = null;
	    anInt10709 = 0;
	    anInt10707 = 0;
	    anInt10711 = 0;
	    anInt10713 = 0;
	    anInt10712 = 0;
	    anInt10715 = 0;
	    aClass700_10710 = null;
	    aClass700_10714 = null;
	}
    }
    
    public synchronized void method9470() {
	anInt10711 = anInt10715 * -238490711;
	anInt10707 = anInt10712 * -104773981;
	anInt10709 = 1191152557 * anInt10713;
	Class700 class700 = aClass700_10710;
	aClass700_10710 = aClass700_10714;
	aClass700_10714 = class700;
	aClass700_10714.method14152(-2075508803);
    }
    
    public synchronized void method9474() {
	anInt10711 = anInt10715 * -238490711;
	anInt10707 = anInt10712 * -104773981;
	anInt10709 = 1191152557 * anInt10713;
	Class700 class700 = aClass700_10710;
	aClass700_10710 = aClass700_10714;
	aClass700_10714 = class700;
	aClass700_10714.method14152(-1245392389);
    }
    
    public void method9479(int i) {
	method16403(867881054);
    }
    
    public boolean method9506() {
	return 0 != (1159354507 * anInt10709 & 0x4);
    }
    
    static final void method16404(Class669 class669, int i) {
	Class493.method8122((String) (class669.anObjectArray8593
				      [((class669.anInt8594 -= 1460193483)
					* 1485266147)]),
			    (byte) 62);
    }
}
