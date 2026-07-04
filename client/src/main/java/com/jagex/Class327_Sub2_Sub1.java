/* Class327_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class Class327_Sub2_Sub1 extends Class327_Sub2
{
    float aFloat11428;
    float aFloat11429;
    Class297 this$0;
    
    void method5820(Graphics graphics) {
	aFloat11429 += aFloat11428;
	if (aFloat11429 < 0.0F)
	    aFloat11429 += 360.0F;
	aFloat11429 %= 360.0F;
	double d = Math.toRadians((double) aFloat11429);
	int i = anImage10108.getWidth(null);
	int i_0_ = anImage10108.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate(d,
			  (double) (this$0.method5336(i, (byte) 15) + i / 2
				    + 1573756589 * anInt3460),
			  (double) (this$0.method5332(i_0_, -1132232952)
				    + i_0_ / 2 + -1031843439 * anInt3459));
	graphics2d.translate((this$0.method5336(i, (byte) 23)
			      + anInt3460 * 1573756589),
			     (this$0.method5332(i_0_, -1132232952)
			      + anInt3459 * -1031843439));
	graphics2d.drawImage(anImage10108, null, null);
	graphics2d.setTransform(this$0.anAffineTransform3172);
    }
    
    void method5821(Graphics graphics, byte i) {
	aFloat11429 += aFloat11428;
	if (aFloat11429 < 0.0F)
	    aFloat11429 += 360.0F;
	aFloat11429 %= 360.0F;
	double d = Math.toRadians((double) aFloat11429);
	int i_1_ = anImage10108.getWidth(null);
	int i_2_ = anImage10108.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate(d,
			  (double) (this$0.method5336(i_1_, (byte) 24)
				    + i_1_ / 2 + 1573756589 * anInt3460),
			  (double) (this$0.method5332(i_2_, -1132232952)
				    + i_2_ / 2 + -1031843439 * anInt3459));
	graphics2d.translate((this$0.method5336(i_1_, (byte) 37)
			      + anInt3460 * 1573756589),
			     (this$0.method5332(i_2_, -1132232952)
			      + anInt3459 * -1031843439));
	graphics2d.drawImage(anImage10108, null, null);
	graphics2d.setTransform(this$0.anAffineTransform3172);
    }
    
    void method5824(Graphics graphics) {
	aFloat11429 += aFloat11428;
	if (aFloat11429 < 0.0F)
	    aFloat11429 += 360.0F;
	aFloat11429 %= 360.0F;
	double d = Math.toRadians((double) aFloat11429);
	int i = anImage10108.getWidth(null);
	int i_3_ = anImage10108.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate(d,
			  (double) (this$0.method5336(i, (byte) 10) + i / 2
				    + 1573756589 * anInt3460),
			  (double) (this$0.method5332(i_3_, -1132232952)
				    + i_3_ / 2 + -1031843439 * anInt3459));
	graphics2d.translate((this$0.method5336(i, (byte) 98)
			      + anInt3460 * 1573756589),
			     (this$0.method5332(i_3_, -1132232952)
			      + anInt3459 * -1031843439));
	graphics2d.drawImage(anImage10108, null, null);
	graphics2d.setTransform(this$0.anAffineTransform3172);
    }
    
    void method5823(Graphics graphics) {
	aFloat11429 += aFloat11428;
	if (aFloat11429 < 0.0F)
	    aFloat11429 += 360.0F;
	aFloat11429 %= 360.0F;
	double d = Math.toRadians((double) aFloat11429);
	int i = anImage10108.getWidth(null);
	int i_4_ = anImage10108.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate(d,
			  (double) (this$0.method5336(i, (byte) 65) + i / 2
				    + 1573756589 * anInt3460),
			  (double) (this$0.method5332(i_4_, -1132232952)
				    + i_4_ / 2 + -1031843439 * anInt3459));
	graphics2d.translate((this$0.method5336(i, (byte) 91)
			      + anInt3460 * 1573756589),
			     (this$0.method5332(i_4_, -1132232952)
			      + anInt3459 * -1031843439));
	graphics2d.drawImage(anImage10108, null, null);
	graphics2d.setTransform(this$0.anAffineTransform3172);
    }
    
    Class327_Sub2_Sub1(Class297 class297, Image image, int i, int i_5_,
		       float f) {
	super(class297, image, i, i_5_);
	this$0 = class297;
	aFloat11428 = f;
	aFloat11429 = -aFloat11428;
    }
    
    void method5825(Graphics graphics) {
	aFloat11429 += aFloat11428;
	if (aFloat11429 < 0.0F)
	    aFloat11429 += 360.0F;
	aFloat11429 %= 360.0F;
	double d = Math.toRadians((double) aFloat11429);
	int i = anImage10108.getWidth(null);
	int i_6_ = anImage10108.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate(d,
			  (double) (this$0.method5336(i, (byte) 67) + i / 2
				    + 1573756589 * anInt3460),
			  (double) (this$0.method5332(i_6_, -1132232952)
				    + i_6_ / 2 + -1031843439 * anInt3459));
	graphics2d.translate((this$0.method5336(i, (byte) 84)
			      + anInt3460 * 1573756589),
			     (this$0.method5332(i_6_, -1132232952)
			      + anInt3459 * -1031843439));
	graphics2d.drawImage(anImage10108, null, null);
	graphics2d.setTransform(this$0.anAffineTransform3172);
    }
    
    void method5822(Graphics graphics) {
	aFloat11429 += aFloat11428;
	if (aFloat11429 < 0.0F)
	    aFloat11429 += 360.0F;
	aFloat11429 %= 360.0F;
	double d = Math.toRadians((double) aFloat11429);
	int i = anImage10108.getWidth(null);
	int i_7_ = anImage10108.getHeight(null);
	Graphics2D graphics2d = (Graphics2D) graphics;
	graphics2d.rotate(d,
			  (double) (this$0.method5336(i, (byte) 70) + i / 2
				    + 1573756589 * anInt3460),
			  (double) (this$0.method5332(i_7_, -1132232952)
				    + i_7_ / 2 + -1031843439 * anInt3459));
	graphics2d.translate((this$0.method5336(i, (byte) 73)
			      + anInt3460 * 1573756589),
			     (this$0.method5332(i_7_, -1132232952)
			      + anInt3459 * -1031843439));
	graphics2d.drawImage(anImage10108, null, null);
	graphics2d.setTransform(this$0.anAffineTransform3172);
    }
}
