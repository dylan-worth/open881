/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Class14
{
    GraphicsDevice aGraphicsDevice102;
    DisplayMode aDisplayMode103;
    
    void method651(Frame frame) {
	boolean bool = false;
	try {
	    Field field = Class.forName("sun.awt.Win32GraphicsDevice")
			      .getDeclaredField("valid");
	    field.setAccessible(true);
	    boolean bool_0_
		= ((Boolean) field.get(aGraphicsDevice102)).booleanValue();
	    if (bool_0_) {
		field.set(aGraphicsDevice102, Boolean.FALSE);
		bool = true;
	    }
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    aGraphicsDevice102.setFullScreenWindow(frame);
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice102, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (Exception object) {
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice102, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    throw object;
	}
    }
    
    int[] method652(int i) {
	DisplayMode[] displaymodes = aGraphicsDevice102.getDisplayModes();
	int[] is = new int[displaymodes.length << 2];
	for (int i_1_ = 0; i_1_ < displaymodes.length; i_1_++) {
	    is[i_1_ << 2] = displaymodes[i_1_].getWidth();
	    is[(i_1_ << 2) + 1] = displaymodes[i_1_].getHeight();
	    is[(i_1_ << 2) + 2] = displaymodes[i_1_].getBitDepth();
	    is[3 + (i_1_ << 2)] = displaymodes[i_1_].getRefreshRate();
	}
	return is;
    }
    
    void method653(Frame frame, int i, int i_2_, int i_3_, int i_4_,
		   byte i_5_) {
	aDisplayMode103 = aGraphicsDevice102.getDisplayMode();
	if (null == aDisplayMode103)
	    throw new NullPointerException();
	frame.setUndecorated(true);
	frame.enableInputMethods(false);
	method663(frame, 767305250);
	if (0 == i_4_) {
	    int i_6_ = aDisplayMode103.getRefreshRate();
	    DisplayMode[] displaymodes = aGraphicsDevice102.getDisplayModes();
	    boolean bool = false;
	    for (int i_7_ = 0; i_7_ < displaymodes.length; i_7_++) {
		if (displaymodes[i_7_].getWidth() == i
		    && displaymodes[i_7_].getHeight() == i_2_
		    && displaymodes[i_7_].getBitDepth() == i_3_) {
		    int i_8_ = displaymodes[i_7_].getRefreshRate();
		    if (!bool
			|| Math.abs(i_8_ - i_6_) < Math.abs(i_4_ - i_6_)) {
			i_4_ = i_8_;
			bool = true;
		    }
		}
	    }
	    if (!bool)
		i_4_ = i_6_;
	}
	aGraphicsDevice102.setDisplayMode(new DisplayMode(i, i_2_, i_3_,
							  i_4_));
    }
    
    void method654(byte i) {
	if (null != aDisplayMode103) {
	    DisplayMode[] displaymodes = aGraphicsDevice102.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_9_ = displaymodes;
	    for (int i_10_ = 0; i_10_ < displaymodes_9_.length; i_10_++) {
		DisplayMode displaymode = displaymodes_9_[i_10_];
		if (displaymode.equals(aDisplayMode103)) {
		    aGraphicsDevice102.setDisplayMode(aDisplayMode103);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(aGraphicsDevice102, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    aDisplayMode103 = null;
	}
	method663(null, 1712376810);
    }
    
    void method655() {
	if (null != aDisplayMode103) {
	    DisplayMode[] displaymodes = aGraphicsDevice102.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_11_ = displaymodes;
	    for (int i = 0; i < displaymodes_11_.length; i++) {
		DisplayMode displaymode = displaymodes_11_[i];
		if (displaymode.equals(aDisplayMode103)) {
		    aGraphicsDevice102.setDisplayMode(aDisplayMode103);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(aGraphicsDevice102, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    aDisplayMode103 = null;
	}
	method663(null, 1625579157);
    }
    
    public Class14() throws Exception {
	GraphicsEnvironment graphicsenvironment
	    = GraphicsEnvironment.getLocalGraphicsEnvironment();
	aGraphicsDevice102 = graphicsenvironment.getDefaultScreenDevice();
	if (!aGraphicsDevice102.isFullScreenSupported()) {
	    GraphicsDevice[] graphicsdevices
		= graphicsenvironment.getScreenDevices();
	    GraphicsDevice[] graphicsdevices_12_ = graphicsdevices;
	    for (int i = 0; i < graphicsdevices_12_.length; i++) {
		GraphicsDevice graphicsdevice = graphicsdevices_12_[i];
		if (graphicsdevice != null
		    && graphicsdevice.isFullScreenSupported()) {
		    aGraphicsDevice102 = graphicsdevice;
		    return;
		}
	    }
	    throw new Exception();
	}
    }
    
    int[] method656() {
	DisplayMode[] displaymodes = aGraphicsDevice102.getDisplayModes();
	int[] is = new int[displaymodes.length << 2];
	for (int i = 0; i < displaymodes.length; i++) {
	    is[i << 2] = displaymodes[i].getWidth();
	    is[(i << 2) + 1] = displaymodes[i].getHeight();
	    is[(i << 2) + 2] = displaymodes[i].getBitDepth();
	    is[3 + (i << 2)] = displaymodes[i].getRefreshRate();
	}
	return is;
    }
    
    void method657(Frame frame, int i, int i_13_, int i_14_, int i_15_) {
	aDisplayMode103 = aGraphicsDevice102.getDisplayMode();
	if (null == aDisplayMode103)
	    throw new NullPointerException();
	frame.setUndecorated(true);
	frame.enableInputMethods(false);
	method663(frame, 990488938);
	if (0 == i_15_) {
	    int i_16_ = aDisplayMode103.getRefreshRate();
	    DisplayMode[] displaymodes = aGraphicsDevice102.getDisplayModes();
	    boolean bool = false;
	    for (int i_17_ = 0; i_17_ < displaymodes.length; i_17_++) {
		if (displaymodes[i_17_].getWidth() == i
		    && displaymodes[i_17_].getHeight() == i_13_
		    && displaymodes[i_17_].getBitDepth() == i_14_) {
		    int i_18_ = displaymodes[i_17_].getRefreshRate();
		    if (!bool
			|| Math.abs(i_18_ - i_16_) < Math.abs(i_15_ - i_16_)) {
			i_15_ = i_18_;
			bool = true;
		    }
		}
	    }
	    if (!bool)
		i_15_ = i_16_;
	}
	aGraphicsDevice102.setDisplayMode(new DisplayMode(i, i_13_, i_14_,
							  i_15_));
    }
    
    int[] method658() {
	DisplayMode[] displaymodes = aGraphicsDevice102.getDisplayModes();
	int[] is = new int[displaymodes.length << 2];
	for (int i = 0; i < displaymodes.length; i++) {
	    is[i << 2] = displaymodes[i].getWidth();
	    is[(i << 2) + 1] = displaymodes[i].getHeight();
	    is[(i << 2) + 2] = displaymodes[i].getBitDepth();
	    is[3 + (i << 2)] = displaymodes[i].getRefreshRate();
	}
	return is;
    }
    
    void method659() {
	if (null != aDisplayMode103) {
	    DisplayMode[] displaymodes = aGraphicsDevice102.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_19_ = displaymodes;
	    for (int i = 0; i < displaymodes_19_.length; i++) {
		DisplayMode displaymode = displaymodes_19_[i];
		if (displaymode.equals(aDisplayMode103)) {
		    aGraphicsDevice102.setDisplayMode(aDisplayMode103);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(aGraphicsDevice102, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    aDisplayMode103 = null;
	}
	method663(null, 1316287345);
    }
    
    void method660() {
	if (null != aDisplayMode103) {
	    DisplayMode[] displaymodes = aGraphicsDevice102.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_20_ = displaymodes;
	    for (int i = 0; i < displaymodes_20_.length; i++) {
		DisplayMode displaymode = displaymodes_20_[i];
		if (displaymode.equals(aDisplayMode103)) {
		    aGraphicsDevice102.setDisplayMode(aDisplayMode103);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(aGraphicsDevice102, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    aDisplayMode103 = null;
	}
	method663(null, 615317487);
    }
    
    void method661() {
	if (null != aDisplayMode103) {
	    DisplayMode[] displaymodes = aGraphicsDevice102.getDisplayModes();
	    boolean bool = false;
	    DisplayMode[] displaymodes_21_ = displaymodes;
	    for (int i = 0; i < displaymodes_21_.length; i++) {
		DisplayMode displaymode = displaymodes_21_[i];
		if (displaymode.equals(aDisplayMode103)) {
		    aGraphicsDevice102.setDisplayMode(aDisplayMode103);
		    bool = true;
		    break;
		}
	    }
	    if (!bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("defaultDisplayMode");
		    field.setAccessible(true);
		    field.set(aGraphicsDevice102, null);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    aDisplayMode103 = null;
	}
	method663(null, 1226570030);
    }
    
    void method662(Frame frame) {
	boolean bool = false;
	try {
	    Field field = Class.forName("sun.awt.Win32GraphicsDevice")
			      .getDeclaredField("valid");
	    field.setAccessible(true);
	    boolean bool_22_
		= ((Boolean) field.get(aGraphicsDevice102)).booleanValue();
	    if (bool_22_) {
		field.set(aGraphicsDevice102, Boolean.FALSE);
		bool = true;
	    }
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    aGraphicsDevice102.setFullScreenWindow(frame);
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice102, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (Exception object) {
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice102, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    throw object;
	}
    }
    
    void method663(Frame frame, int i) {
	boolean bool = false;
	try {
	    Field field = Class.forName("sun.awt.Win32GraphicsDevice")
			      .getDeclaredField("valid");
	    field.setAccessible(true);
	    boolean bool_23_
		= ((Boolean) field.get(aGraphicsDevice102)).booleanValue();
	    if (bool_23_) {
		field.set(aGraphicsDevice102, Boolean.FALSE);
		bool = true;
	    }
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    aGraphicsDevice102.setFullScreenWindow(frame);
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice102, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (Exception object) {
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice102, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    throw object;
	}
    }
    
    void method664(Frame frame) {
	boolean bool = false;
	try {
	    Field field = Class.forName("sun.awt.Win32GraphicsDevice")
			      .getDeclaredField("valid");
	    field.setAccessible(true);
	    boolean bool_24_
		= ((Boolean) field.get(aGraphicsDevice102)).booleanValue();
	    if (bool_24_) {
		field.set(aGraphicsDevice102, Boolean.FALSE);
		bool = true;
	    }
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    aGraphicsDevice102.setFullScreenWindow(frame);
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice102, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (Exception object) {
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(aGraphicsDevice102, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    throw object;
	}
    }
    
    static final void method665(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
}
