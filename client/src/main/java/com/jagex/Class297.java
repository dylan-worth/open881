/* Class297 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class297 implements Interface33
{
    String aString3165;
    boolean aBool3166;
    List aList3167 = new ArrayList();
    String aString3168;
    boolean aBool3169;
    boolean aBool3170;
    boolean aBool3171;
    AffineTransform anAffineTransform3172 = new AffineTransform();
    
    public void method214(boolean bool) {
	if (!aBool3170 && !aBool3166) {
	    aBool3166 = true;
	    try {
		String[] strings = Class387.method6504(client.aString11154,
						       '|', -699108089);
		if (strings.length < 3)
		    aBool3170 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class464.aCanvas5111);
		    int i = 0;
		    for (int i_0_ = 0; i_0_ < strings.length; i_0_++) {
			String[] strings_1_
			    = Class387.method6504(strings[i_0_].trim(), '=',
						  -870906773);
			if (strings_1_[0].equals("halign"))
			    aBool3169 = Boolean.parseBoolean(strings_1_[1]);
			else if (strings_1_[0].equals("valign"))
			    aBool3171 = Boolean.parseBoolean(strings_1_[1]);
			else if (strings_1_[0].equals("image")) {
			    String[] strings_2_
				= Class387.method6504(strings_1_[1], ',',
						      -890058049);
			    Image image;
			    try {
				image = method5334(strings_2_[0], (byte) -97);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i++);
				aList3167.add
				    (new Class327_Sub2
				     (this, image,
				      Class684.method13949(strings_2_[1],
							   (byte) 93),
				      Class684.method13949(strings_2_[2],
							   (byte) 127)));
			    }
			} else if (strings_1_[0].equals("rotatingimage")) {
			    String[] strings_3_
				= Class387.method6504(strings_1_[1], ',',
						      503534195);
			    Image image;
			    try {
				image = method5334(strings_3_[0], (byte) -65);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i++);
				aList3167.add
				    (new Class327_Sub2_Sub1
				     (this, image,
				      Class684.method13949(strings_3_[1],
							   (byte) 6),
				      Class684.method13949(strings_3_[2],
							   (byte) 60),
				      Float.parseFloat(strings_3_[3])));
			    }
			} else if (strings_1_[0].equals("progress")) {
			    String[] strings_4_
				= Class387.method6504(strings_1_[1], ',',
						      -1704330067);
			    aList3167.add(new Class327_Sub1
					  (this,
					   Boolean.parseBoolean(strings_4_[0]),
					   strings_4_[1],
					   Class684.method13949(strings_4_[2],
								(byte) 95),
					   Integer.decode(strings_4_[3])
					       .intValue(),
					   Class684.method13949(strings_4_[4],
								(byte) 119),
					   Class684.method13949(strings_4_[5],
								(byte) 18)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		aBool3170 = true;
	    }
	}
	if (aBool3170)
	    method5335((byte) -26);
	else {
	    Graphics graphics = Class464.aCanvas5111.getGraphics();
	    if (null != graphics) {
		try {
		    aString3165
			= new StringBuilder().append("").append
			      (Class277.aClass300_3049.method5525(1746374566))
			      .append
			      ("%").toString();
		    aString3168
			= Class277.aClass300_3049.method5526((byte) -41);
		    if (null == Class237.anImage2376)
			Class237.anImage2376
			    = (Class464.aCanvas5111.createImage
			       (1771907305 * Class706_Sub4.anInt10994,
				-1091172141 * Class18.anInt205));
		    Graphics graphics_5_ = Class237.anImage2376.getGraphics();
		    graphics_5_.setColor(Color.BLACK);
		    graphics_5_.fillRect(0, 0,
					 1771907305 * Class706_Sub4.anInt10994,
					 -1091172141 * Class18.anInt205);
		    Iterator iterator = aList3167.iterator();
		    while (iterator.hasNext()) {
			Class327 class327 = (Class327) iterator.next();
			class327.method5821(graphics_5_, (byte) -81);
		    }
		    graphics.drawImage(Class237.anImage2376, 0, 0, null);
		} catch (Exception exception) {
		    aBool3170 = true;
		}
	    } else
		Class464.aCanvas5111.repaint();
	}
    }
    
    Image method5331(String string) throws IOException {
	InputStream inputstream = null;
	try {
	    Image image;
	    try {
		inputstream = Class305.anApplet3271.getClass().getClassLoader
				  ().getResourceAsStream(string);
		byte[] is = new byte[12000];
		int i = 0;
		int i_6_;
		while ((i_6_ = inputstream.read()) != -1)
		    is[i++] = (byte) i_6_;
		Image image_7_ = Toolkit.getDefaultToolkit().createImage(is);
		inputstream.close();
		image = image_7_;
	    } catch (Exception exception) {
		throw new IOException();
	    }
	    if (inputstream != null)
		inputstream.close();
	    return image;
	} catch (Exception object) {
	    if (inputstream != null)
		inputstream.close();
	    throw object;
	}
    }
    
    final int method5332(int i, int i_8_) {
	if (aBool3171)
	    return (-1091172141 * Class18.anInt205 - i) / 2;
	return 0;
    }
    
    void method5333() {
	Class705.method14233
	    (Class277.aClass300_3049.method5525(-1056976188),
	     Class277.aClass300_3049.method5526((byte) -19),
	     client.aColorArray11071[client.anInt11021 * -859311063],
	     client.aColorArray11072[client.anInt11021 * -859311063],
	     client.aColorArray11073[-859311063 * client.anInt11021],
	     -37733329);
    }
    
    Image method5334(String string, byte i) throws IOException {
	InputStream inputstream = null;
	try {
	    Image image;
	    try {
		inputstream = Class305.anApplet3271.getClass().getClassLoader
				  ().getResourceAsStream(string);
		byte[] is = new byte[12000];
		int i_9_ = 0;
		int i_10_;
		while ((i_10_ = inputstream.read()) != -1)
		    is[i_9_++] = (byte) i_10_;
		Image image_11_ = Toolkit.getDefaultToolkit().createImage(is);
		inputstream.close();
		image = image_11_;
	    } catch (Exception exception) {
		throw new IOException();
	    }
	    if (inputstream != null)
		inputstream.close();
	    return image;
	} catch (Exception object) {
	    if (inputstream != null)
		inputstream.close();
	    throw object;
	}
    }
    
    void method5335(byte i) {
	Class705.method14233
	    (Class277.aClass300_3049.method5525(-1729577768),
	     Class277.aClass300_3049.method5526((byte) -62),
	     client.aColorArray11071[client.anInt11021 * -859311063],
	     client.aColorArray11072[client.anInt11021 * -859311063],
	     client.aColorArray11073[-859311063 * client.anInt11021],
	     -366196139);
    }
    
    public void method218(byte i) {
	Class212.method4011(-1698837823);
    }
    
    final int method5336(int i, byte i_12_) {
	if (aBool3169)
	    return (Class706_Sub4.anInt10994 * 1771907305 - i) / 2;
	return 0;
    }
    
    final int method5337(int i) {
	if (aBool3169)
	    return (Class706_Sub4.anInt10994 * 1771907305 - i) / 2;
	return 0;
    }
    
    public int method211() {
	return 100;
    }
    
    public int method24(int i) {
	return 0;
    }
    
    final int method5338(int i) {
	if (aBool3169)
	    return (Class706_Sub4.anInt10994 * 1771907305 - i) / 2;
	return 0;
    }
    
    public void method210(byte i) {
	/* empty */
    }
    
    public boolean method221(long l) {
	return true;
    }
    
    public boolean method213(long l) {
	return true;
    }
    
    Image method5339(String string) throws IOException {
	InputStream inputstream = null;
	try {
	    Image image;
	    try {
		inputstream = Class305.anApplet3271.getClass().getClassLoader
				  ().getResourceAsStream(string);
		byte[] is = new byte[12000];
		int i = 0;
		int i_13_;
		while ((i_13_ = inputstream.read()) != -1)
		    is[i++] = (byte) i_13_;
		Image image_14_ = Toolkit.getDefaultToolkit().createImage(is);
		inputstream.close();
		image = image_14_;
	    } catch (Exception exception) {
		throw new IOException();
	    }
	    if (inputstream != null)
		inputstream.close();
	    return image;
	} catch (Exception object) {
	    if (inputstream != null)
		inputstream.close();
	    throw object;
	}
    }
    
    Image method5340(String string) throws IOException {
	InputStream inputstream = null;
	try {
	    Image image;
	    try {
		inputstream = Class305.anApplet3271.getClass().getClassLoader
				  ().getResourceAsStream(string);
		byte[] is = new byte[12000];
		int i = 0;
		int i_15_;
		while ((i_15_ = inputstream.read()) != -1)
		    is[i++] = (byte) i_15_;
		Image image_16_ = Toolkit.getDefaultToolkit().createImage(is);
		inputstream.close();
		image = image_16_;
	    } catch (Exception exception) {
		throw new IOException();
	    }
	    if (inputstream != null)
		inputstream.close();
	    return image;
	} catch (Exception object) {
	    if (inputstream != null)
		inputstream.close();
	    throw object;
	}
    }
    
    public void method216(boolean bool, short i) {
	if (!aBool3170 && !aBool3166) {
	    aBool3166 = true;
	    try {
		String[] strings
		    = Class387.method6504(client.aString11154, '|', 345236075);
		if (strings.length < 3)
		    aBool3170 = true;
		else {
		    MediaTracker mediatracker
			= new MediaTracker(Class464.aCanvas5111);
		    int i_17_ = 0;
		    for (int i_18_ = 0; i_18_ < strings.length; i_18_++) {
			String[] strings_19_
			    = Class387.method6504(strings[i_18_].trim(), '=',
						  -1821636426);
			if (strings_19_[0].equals("halign"))
			    aBool3169 = Boolean.parseBoolean(strings_19_[1]);
			else if (strings_19_[0].equals("valign"))
			    aBool3171 = Boolean.parseBoolean(strings_19_[1]);
			else if (strings_19_[0].equals("image")) {
			    String[] strings_20_
				= Class387.method6504(strings_19_[1], ',',
						      -15839877);
			    Image image;
			    try {
				image = method5334(strings_20_[0], (byte) -74);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i_17_++);
				aList3167.add
				    (new Class327_Sub2
				     (this, image,
				      Class684.method13949(strings_20_[1],
							   (byte) 54),
				      Class684.method13949(strings_20_[2],
							   (byte) 104)));
			    }
			} else if (strings_19_[0].equals("rotatingimage")) {
			    String[] strings_21_
				= Class387.method6504(strings_19_[1], ',',
						      113181660);
			    Image image;
			    try {
				image = method5334(strings_21_[0], (byte) -65);
			    } catch (Exception exception) {
				image = null;
			    }
			    if (null != image) {
				mediatracker.addImage(image, i_17_++);
				aList3167.add
				    (new Class327_Sub2_Sub1
				     (this, image,
				      Class684.method13949(strings_21_[1],
							   (byte) 21),
				      Class684.method13949(strings_21_[2],
							   (byte) 102),
				      Float.parseFloat(strings_21_[3])));
			    }
			} else if (strings_19_[0].equals("progress")) {
			    String[] strings_22_
				= Class387.method6504(strings_19_[1], ',',
						      -1266532682);
			    aList3167.add(new Class327_Sub1
					  (this,
					   Boolean
					       .parseBoolean(strings_22_[0]),
					   strings_22_[1],
					   Class684.method13949(strings_22_[2],
								(byte) 102),
					   Integer.decode(strings_22_[3])
					       .intValue(),
					   Class684.method13949(strings_22_[4],
								(byte) 87),
					   Class684.method13949(strings_22_[5],
								(byte) 43)));
			}
		    }
		    mediatracker.waitForAll();
		}
	    } catch (Exception exception) {
		aBool3170 = true;
	    }
	}
	if (aBool3170)
	    method5335((byte) -96);
	else {
	    Graphics graphics = Class464.aCanvas5111.getGraphics();
	    if (null != graphics) {
		try {
		    aString3165
			= new StringBuilder().append("").append
			      (Class277.aClass300_3049.method5525(-1082413017))
			      .append
			      ("%").toString();
		    aString3168
			= Class277.aClass300_3049.method5526((byte) -51);
		    if (null == Class237.anImage2376)
			Class237.anImage2376
			    = (Class464.aCanvas5111.createImage
			       (1771907305 * Class706_Sub4.anInt10994,
				-1091172141 * Class18.anInt205));
		    Graphics graphics_23_ = Class237.anImage2376.getGraphics();
		    graphics_23_.setColor(Color.BLACK);
		    graphics_23_.fillRect(0, 0,
					  (1771907305
					   * Class706_Sub4.anInt10994),
					  -1091172141 * Class18.anInt205);
		    Iterator iterator = aList3167.iterator();
		    while (iterator.hasNext()) {
			Class327 class327 = (Class327) iterator.next();
			class327.method5821(graphics_23_, (byte) 30);
		    }
		    graphics.drawImage(Class237.anImage2376, 0, 0, null);
		} catch (Exception exception) {
		    aBool3170 = true;
		}
	    } else
		Class464.aCanvas5111.repaint();
	}
    }
    
    public int method225() {
	return 0;
    }
    
    void method5341() {
	Class705.method14233
	    (Class277.aClass300_3049.method5525(1269087693),
	     Class277.aClass300_3049.method5526((byte) -70),
	     client.aColorArray11071[client.anInt11021 * -859311063],
	     client.aColorArray11072[client.anInt11021 * -859311063],
	     client.aColorArray11073[-859311063 * client.anInt11021],
	     1449216339);
    }
    
    void method5342() {
	Class705.method14233
	    (Class277.aClass300_3049.method5525(-1837310953),
	     Class277.aClass300_3049.method5526((byte) -29),
	     client.aColorArray11071[client.anInt11021 * -859311063],
	     client.aColorArray11072[client.anInt11021 * -859311063],
	     client.aColorArray11073[-859311063 * client.anInt11021],
	     1929701162);
    }
    
    void method5343() {
	Class705.method14233
	    (Class277.aClass300_3049.method5525(2092911312),
	     Class277.aClass300_3049.method5526((byte) -21),
	     client.aColorArray11071[client.anInt11021 * -859311063],
	     client.aColorArray11072[client.anInt11021 * -859311063],
	     client.aColorArray11073[-859311063 * client.anInt11021],
	     311455425);
    }
    
    void method5344() {
	Class705.method14233
	    (Class277.aClass300_3049.method5525(-1308708931),
	     Class277.aClass300_3049.method5526((byte) -85),
	     client.aColorArray11071[client.anInt11021 * -859311063],
	     client.aColorArray11072[client.anInt11021 * -859311063],
	     client.aColorArray11073[-859311063 * client.anInt11021],
	     1823885220);
    }
    
    public void method44() {
	Class212.method4011(645752234);
    }
    
    final int method5345(int i) {
	if (aBool3171)
	    return (-1091172141 * Class18.anInt205 - i) / 2;
	return 0;
    }
    
    public void method212() {
	Class212.method4011(781643679);
    }
    
    public void method159() {
	Class212.method4011(-1636043272);
    }
    
    public void method209() {
	/* empty */
    }
    
    public int method217(byte i) {
	return 100;
    }
    
    public boolean method219(long l) {
	return true;
    }
    
    public boolean method220(long l) {
	return true;
    }
    
    public void method215() {
	Class212.method4011(-116474113);
    }
    
    public int method222() {
	return 0;
    }
    
    public int method223() {
	return 0;
    }
    
    public int method224() {
	return 0;
    }
    
    Class297() {
	/* empty */
    }
    
    static boolean method5346(Interface62 interface62,
			      Class44_Sub13 class44_sub13, int i, int i_24_,
			      int i_25_) {
	if (null == interface62)
	    return false;
	Class602 class602
	    = ((Class602)
	       class44_sub13.method91(interface62.method56(790495118),
				      1285212988));
	if (class602.aBool7964 && !client.aBool11157)
	    return false;
	int i_26_ = class602.anInt7949 * 196422211;
	if (class602.anIntArray7943 != null) {
	    for (int i_27_ = 0; i_27_ < class602.anIntArray7943.length;
		 i_27_++) {
		if (-1 != class602.anIntArray7943[i_27_]) {
		    Class602 class602_28_
			= ((Class602)
			   class44_sub13.method91((class602.anIntArray7943
						   [i_27_]),
						  -1214037319));
		    if (class602_28_.anInt7949 * 196422211 >= 0)
			i_26_ = class602_28_.anInt7949 * 196422211;
		}
	    }
	}
	if (i_26_ >= 0) {
	    Class113.anIntArray1377[-463245253 * Class113.anInt1380]
		= -1562722583 * class602.anInt7887;
	    Class113.anIntArray1371[-463245253 * Class113.anInt1380] = i;
	    Class113.anIntArray1372[Class113.anInt1380 * -463245253] = i_24_;
	    Class113.anInt1380 += 138799347;
	    return true;
	}
	return false;
    }
    
    static final void method5347(int i, Class9 class9, byte i_29_) {
	if (i != -1 && class9.method579((long) i) == null)
	    class9.method581(new Class534(), (long) i);
    }
    
    static final void method5348(Class669 class669, byte i) {
	int i_30_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (((Class15)
		Class531.aClass44_Sub7_7135.method91(i_30_, -508334358))
	       .anInt138) * -273654379;
    }
}
