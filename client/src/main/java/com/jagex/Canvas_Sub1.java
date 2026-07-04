/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas
{
    Component aComponent11906;
    
    public final void method18489(Graphics graphics) {
	aComponent11906.paint(graphics);
    }
    
    Canvas_Sub1(Component component) {
	aComponent11906 = component;
    }
    
    public final void paint(Graphics graphics) {
	aComponent11906.paint(graphics);
    }
    
    public final void method18490(Graphics graphics) {
	aComponent11906.paint(graphics);
    }
    
    public final void method18491(Graphics graphics) {
	aComponent11906.paint(graphics);
    }
    
    public final void update(Graphics graphics) {
	aComponent11906.update(graphics);
    }
    
    static final void method18492(Class669 class669, int i) {
	class669.anInt8600 -= 926998689;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	int i_2_
	    = class669.anIntArray8595[2 + class669.anInt8600 * 2088438307];
	if (-1 == i_1_)
	    throw new RuntimeException();
	Class41 class41
	    = ((Class41)
	       Class667.aClass44_Sub21_8582.method91(i_1_, 1363539270));
	if (class41.aClass493_314.method93() != i_0_)
	    throw new RuntimeException();
	int[] is = class41.method1042(Integer.valueOf(i_2_), (short) -25175);
	int i_3_ = 0;
	if (null != is)
	    i_3_ = is.length;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_3_;
    }
}
