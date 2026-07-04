/* Class175_Sub2_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class175_Sub2_Sub1_Sub1 extends Class175_Sub2_Sub1
{
    Image anImage12099;
    
    void method17932(int i) {
	super.method17932(1313711519);
	DataBufferInt databufferint
	    = new DataBufferInt(anIntArray11400, anIntArray11400.length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = Raster.createWritableRaster((directcolormodel
					       .createCompatibleSampleModel
					   (anInt11399 * -150461501,
					    787243643 * anInt11402)),
					  databufferint, null);
	anImage12099 = new BufferedImage(directcolormodel, writableraster,
					 false, new Hashtable());
    }
    
    public int method15479() {
	return method15476(0, 0);
    }
    
    public int method15481() {
	return method15476(0, 0);
    }
    
    public final int method15476(int i, int i_0_) {
	Graphics graphics = aCanvas11398.getGraphics();
	if (null == graphics)
	    return 0;
	graphics.drawImage(anImage12099, i, i_0_, aCanvas11398);
	return 0;
    }
    
    public void method142() {
	/* empty */
    }
    
    public void method361() {
	/* empty */
    }
    
    public void method362() {
	/* empty */
    }
    
    void method17931() {
	super.method17932(1313711519);
	DataBufferInt databufferint
	    = new DataBufferInt(anIntArray11400, anIntArray11400.length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = Raster.createWritableRaster((directcolormodel
					       .createCompatibleSampleModel
					   (anInt11399 * -150461501,
					    787243643 * anInt11402)),
					  databufferint, null);
	anImage12099 = new BufferedImage(directcolormodel, writableraster,
					 false, new Hashtable());
    }
    
    void method17930() {
	super.method17932(1313711519);
	DataBufferInt databufferint
	    = new DataBufferInt(anIntArray11400, anIntArray11400.length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = Raster.createWritableRaster((directcolormodel
					       .createCompatibleSampleModel
					   (anInt11399 * -150461501,
					    787243643 * anInt11402)),
					  databufferint, null);
	anImage12099 = new BufferedImage(directcolormodel, writableraster,
					 false, new Hashtable());
    }
    
    public int method15475() {
	return method15476(0, 0);
    }
    
    public int method15482() {
	return method15476(0, 0);
    }
    
    void method17933() {
	super.method17932(1313711519);
	DataBufferInt databufferint
	    = new DataBufferInt(anIntArray11400, anIntArray11400.length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = Raster.createWritableRaster((directcolormodel
					       .createCompatibleSampleModel
					   (anInt11399 * -150461501,
					    787243643 * anInt11402)),
					  databufferint, null);
	anImage12099 = new BufferedImage(directcolormodel, writableraster,
					 false, new Hashtable());
    }
    
    public void method364() {
	/* empty */
    }
    
    public int method15474() {
	return method15476(0, 0);
    }
    
    void method17929() {
	super.method17932(1313711519);
	DataBufferInt databufferint
	    = new DataBufferInt(anIntArray11400, anIntArray11400.length);
	DirectColorModel directcolormodel
	    = new DirectColorModel(32, 16711680, 65280, 255);
	WritableRaster writableraster
	    = Raster.createWritableRaster((directcolormodel
					       .createCompatibleSampleModel
					   (anInt11399 * -150461501,
					    787243643 * anInt11402)),
					  databufferint, null);
	anImage12099 = new BufferedImage(directcolormodel, writableraster,
					 false, new Hashtable());
    }
    
    Class175_Sub2_Sub1_Sub1(Class185_Sub2 class185_sub2, Canvas canvas, int i,
			    int i_1_) {
	super(class185_sub2, canvas, i, i_1_);
	new Rectangle();
	method17932(1313711519);
    }
    
    public final int method15480(int i, int i_2_) {
	Graphics graphics = aCanvas11398.getGraphics();
	if (null == graphics)
	    return 0;
	graphics.drawImage(anImage12099, i, i_2_, aCanvas11398);
	return 0;
    }
}
