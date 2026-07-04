/* Class705 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class Class705
{
    public static byte[] method14223(Object object, boolean bool) {
	if (null == object)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    if (bool)
		return Arrays.copyOf(is, is.length);
	    return is;
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[bytebuffer.capacity()];
	    bytebuffer.position(0);
	    bytebuffer.get(is);
	    return is;
	}
	throw new IllegalArgumentException();
    }
    
    public static Object method14224(byte[] is, boolean bool) {
	if (is == null)
	    return null;
	if (is.length > 136) {
	    ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
	    bytebuffer.position(0);
	    bytebuffer.put(is);
	    return bytebuffer;
	}
	if (bool)
	    return Arrays.copyOf(is, is.length);
	return is;
    }
    
    Class705() throws Throwable {
	throw new Error();
    }
    
    public static Object method14225(byte[] is, boolean bool) {
	if (is == null)
	    return null;
	if (is.length > 136) {
	    ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
	    bytebuffer.position(0);
	    bytebuffer.put(is);
	    return bytebuffer;
	}
	if (bool)
	    return Arrays.copyOf(is, is.length);
	return is;
    }
    
    public static byte[] method14226(Object object, boolean bool) {
	if (null == object)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    if (bool)
		return Arrays.copyOf(is, is.length);
	    return is;
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[bytebuffer.capacity()];
	    bytebuffer.position(0);
	    bytebuffer.get(is);
	    return is;
	}
	throw new IllegalArgumentException();
    }
    
    public static byte[] method14227(Object object, int i, int i_0_) {
	if (null == object)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    return Arrays.copyOfRange(is, i, i + i_0_);
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[i_0_];
	    bytebuffer.position(i);
	    bytebuffer.get(is, 0, i_0_);
	    return is;
	}
	throw new IllegalArgumentException();
    }
    
    public static Object method14228(byte[] is, boolean bool) {
	if (is == null)
	    return null;
	if (is.length > 136) {
	    ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
	    bytebuffer.position(0);
	    bytebuffer.put(is);
	    return bytebuffer;
	}
	if (bool)
	    return Arrays.copyOf(is, is.length);
	return is;
    }
    
    public static byte[] method14229(Object object, int i, int i_1_) {
	if (null == object)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    return Arrays.copyOfRange(is, i, i + i_1_);
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[i_1_];
	    bytebuffer.position(i);
	    bytebuffer.get(is, 0, i_1_);
	    return is;
	}
	throw new IllegalArgumentException();
    }
    
    static final void method14230(Class669 class669, int i) {
	class669.anInt8600 -= 308999563;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -1;
    }
    
    static final void method14231(int i, int i_2_, int i_3_, int i_4_,
				  int i_5_, int i_6_, int i_7_, int i_8_,
				  int i_9_) {
	if (!Class180.method2978(i, null, -1690253506)) {
	    if (i_8_ != -1)
		client.aBoolArray11180[i_8_] = true;
	    else {
		for (int i_10_ = 0; i_10_ < 108; i_10_++)
		    client.aBoolArray11180[i_10_] = true;
	    }
	} else
	    Class690_Sub37.method17194(Class44_Sub11.aClass243Array11006[i]
					   .method4473((byte) 0),
				       -1, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_,
				       i_8_, i_8_ < 0, -1794576780);
    }
    
    static final void method14232(Class669 class669, int i) {
	if (Class599.aClass298_Sub1_7871.method5425(1573742668)
	    != Class293.aClass293_3124)
	    throw new RuntimeException();
	((Class706_Sub3) Class599.aClass298_Sub1_7871.method5381(1498107950))
	    .method17271
	    ((class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]),
	     1414038684);
    }
    
    public static final void method14233(int i, String string, Color color,
					 Color color_11_, Color color_12_,
					 int i_13_) {
	try {
	    Graphics graphics = Class464.aCanvas5111.getGraphics();
	    if (null == Class464.aFont5112)
		Class464.aFont5112 = new Font("Helvetica", 1, 13);
	    if (null == color)
		color = new Color(140, 17, 17);
	    if (null == color_11_)
		color_11_ = new Color(140, 17, 17);
	    if (color_12_ == null)
		color_12_ = new Color(255, 255, 255);
	    try {
		if (null == Class237.anImage2376)
		    Class237.anImage2376
			= Class464.aCanvas5111.createImage((1771907305
							    * (Class706_Sub4
							       .anInt10994)),
							   (Class18.anInt205
							    * -1091172141));
		Graphics graphics_14_ = Class237.anImage2376.getGraphics();
		graphics_14_.setColor(Color.black);
		graphics_14_.fillRect(0, 0,
				      1771907305 * Class706_Sub4.anInt10994,
				      Class18.anInt205 * -1091172141);
		int i_15_ = Class706_Sub4.anInt10994 * 1771907305 / 2 - 152;
		int i_16_ = Class18.anInt205 * -1091172141 / 2 - 18;
		graphics_14_.setColor(color_11_);
		graphics_14_.drawRect(i_15_, i_16_, 303, 33);
		graphics_14_.setColor(color);
		graphics_14_.fillRect(2 + i_15_, i_16_ + 2, i * 3, 30);
		graphics_14_.setColor(Color.black);
		graphics_14_.drawRect(i_15_ + 1, 1 + i_16_, 301, 31);
		graphics_14_.fillRect(i_15_ + 2 + 3 * i, i_16_ + 2,
				      300 - i * 3, 30);
		graphics_14_.setFont(Class464.aFont5112);
		graphics_14_.setColor(color_12_);
		graphics_14_.drawString(string,
					(i_15_
					 + (304 - string.length() * 6) / 2),
					22 + i_16_);
		if (Class498.aString5588 != null) {
		    graphics_14_.setFont(Class464.aFont5112);
		    graphics_14_.setColor(color_12_);
		    graphics_14_.drawString
			(Class498.aString5588,
			 (1771907305 * Class706_Sub4.anInt10994 / 2
			  - Class498.aString5588.length() * 6 / 2),
			 Class18.anInt205 * -1091172141 / 2 - 26);
		}
		graphics.drawImage(Class237.anImage2376, 0, 0, null);
	    } catch (Exception exception) {
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, Class706_Sub4.anInt10994 * 1771907305,
				  -1091172141 * Class18.anInt205);
		int i_17_ = Class706_Sub4.anInt10994 * 1771907305 / 2 - 152;
		int i_18_ = Class18.anInt205 * -1091172141 / 2 - 18;
		graphics.setColor(color_11_);
		graphics.drawRect(i_17_, i_18_, 303, 33);
		graphics.setColor(color);
		graphics.fillRect(i_17_ + 2, 2 + i_18_, i * 3, 30);
		graphics.setColor(Color.black);
		graphics.drawRect(1 + i_17_, i_18_ + 1, 301, 31);
		graphics.fillRect(i_17_ + 2 + i * 3, i_18_ + 2, 300 - 3 * i,
				  30);
		graphics.setFont(Class464.aFont5112);
		graphics.setColor(color_12_);
		if (Class498.aString5588 != null) {
		    graphics.setFont(Class464.aFont5112);
		    graphics.setColor(color_12_);
		    graphics.drawString
			(Class498.aString5588,
			 (Class706_Sub4.anInt10994 * 1771907305 / 2
			  - Class498.aString5588.length() * 6 / 2),
			 -1091172141 * Class18.anInt205 / 2 - 26);
		}
		graphics.drawString(string,
				    i_17_ + (304 - string.length() * 6) / 2,
				    i_18_ + 22);
	    }
	} catch (Exception exception) {
	    Class464.aCanvas5111.repaint();
	}
    }
    
    public static Class391[] method14234(int i) {
	return (new Class391[]
		{ Class391.aClass391_4075, Class391.aClass391_4074,
		  Class391.aClass391_4073 });
    }
}
