/* Class327_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Graphics;
import java.awt.Image;

public class Class327_Sub2 extends Class327
{
    Image anImage10108;
    Class297 this$0;
    
    void method5820(Graphics graphics) {
	int i = (this$0.method5336(anImage10108.getWidth(null), (byte) 77)
		 + anInt3460 * 1573756589);
	int i_0_
	    = (this$0.method5332(anImage10108.getHeight(null), -1132232952)
	       + anInt3459 * -1031843439);
	graphics.drawImage(anImage10108, i, i_0_, null);
    }
    
    Class327_Sub2(Class297 class297, Image image, int i, int i_1_) {
	super(class297, i, i_1_);
	this$0 = class297;
	anImage10108 = image;
    }
    
    void method5824(Graphics graphics) {
	int i = (this$0.method5336(anImage10108.getWidth(null), (byte) 56)
		 + anInt3460 * 1573756589);
	int i_2_
	    = (this$0.method5332(anImage10108.getHeight(null), -1132232952)
	       + anInt3459 * -1031843439);
	graphics.drawImage(anImage10108, i, i_2_, null);
    }
    
    void method5823(Graphics graphics) {
	int i = (this$0.method5336(anImage10108.getWidth(null), (byte) 92)
		 + anInt3460 * 1573756589);
	int i_3_
	    = (this$0.method5332(anImage10108.getHeight(null), -1132232952)
	       + anInt3459 * -1031843439);
	graphics.drawImage(anImage10108, i, i_3_, null);
    }
    
    void method5822(Graphics graphics) {
	int i = (this$0.method5336(anImage10108.getWidth(null), (byte) 7)
		 + anInt3460 * 1573756589);
	int i_4_
	    = (this$0.method5332(anImage10108.getHeight(null), -1132232952)
	       + anInt3459 * -1031843439);
	graphics.drawImage(anImage10108, i, i_4_, null);
    }
    
    void method5825(Graphics graphics) {
	int i = (this$0.method5336(anImage10108.getWidth(null), (byte) 103)
		 + anInt3460 * 1573756589);
	int i_5_
	    = (this$0.method5332(anImage10108.getHeight(null), -1132232952)
	       + anInt3459 * -1031843439);
	graphics.drawImage(anImage10108, i, i_5_, null);
    }
    
    void method5821(Graphics graphics, byte i) {
	int i_6_ = (this$0.method5336(anImage10108.getWidth(null), (byte) 58)
		    + anInt3460 * 1573756589);
	int i_7_
	    = (this$0.method5332(anImage10108.getHeight(null), -1132232952)
	       + anInt3459 * -1031843439);
	graphics.drawImage(anImage10108, i_6_, i_7_, null);
    }
    
    static final void method15703(Class669 class669, byte i) {
	int i_8_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class15 class15
	    = (Class15) Class531.aClass44_Sub7_7135.method91(i_8_, 1092494171);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 2 == class15.anInt174 * 1113844363 ? 1 : 0;
    }
    
    static final void method15704(Class669 class669, int i) {
	int i_9_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_9_, 1250891866);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_9_ >> 16];
	Class429.method6812(class247, class243, class669, 1278611887);
    }
}
