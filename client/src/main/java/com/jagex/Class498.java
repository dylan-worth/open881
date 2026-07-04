/* Class498 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

import jaclib.nanotime.QueryPerformanceCounter;

public abstract class Class498
    implements Interface59, Runnable, FocusListener, WindowListener
{
    protected static volatile boolean aBool5552;
    static long aLong5553 = -1844158459144707328L;
    public static int anInt5554 = 0;
    public static int anInt5555 = 0;
    public static Class502 aClass502_5556;
    static final int anInt5557 = 32;
    static long[] aLongArray5558 = new long[32];
    static final String aString5559 = "main_file_cache.dat2";
    static volatile long aLong5560;
    protected static int anInt5561;
    public static int anInt5562;
    public static int anInt5563;
    protected static boolean aBool5564;
    protected static volatile boolean aBool5565;
    boolean aBool5566;
    static final String aString5567 = "main_file_cache.idx";
    static final String aString5568 = "rw";
    static int anInt5569;
    static final long aLong5570 = 3221225472L;
    static int anInt5571;
    static long[] aLongArray5572 = new long[32];
    static final int anInt5573 = 1048576;
    boolean aBool5574 = false;
    static int anInt5575;
    public static int anInt5576;
    static final String aString5577 = "main_file_cache.idx255";
    static int anInt5578;
    static final String aString5579 = "random.dat";
    static Class38 aClass38_5580;
    protected static Class38 aClass38_5581;
    protected static Class38 aClass38_5582;
    static final int anInt5583 = 0;
    static final int anInt5584 = 1;
    static Class508 aClass508_5585;
    static long aLong5586;
    static boolean aBool5587;
    protected static String aString5588;
    public static int anInt5589;
    static volatile boolean aBool5590;
    protected static Class14 aClass14_5591;
    public static String aString5592;
    
    public final void method8143(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void method8144(WindowEvent windowevent) {
	/* empty */
    }
    
    final void method8145(Class517 class517, String string, String string_0_,
			  int i, int i_1_, int i_2_, int i_3_, boolean bool,
			  byte i_4_) {
	try {
	    method8171(Class508.aClass508_5668, bool, (short) -1752);
	    Class391.anInt4076
		= (Class706_Sub4.anInt10994
		   = class517.method8632(1108899968) * 919220057) * 298502761;
	    anInt5561
		= (Class18.anInt205
		   = class517.method8618(-2032774198) * 533696347) * -98449983;
	    anInt5562 = 0;
	    anInt5563 = 0;
	    if (Class309.method5657((byte) 91) == Class508.aClass508_5670) {
		Class391.anInt4076
		    += -1895347454 * class517.method8616((byte) -1);
		anInt5561 += 453915958 * class517.method8619(-2140044775);
		method8149(class517.method8621(-1729998935), (byte) 83);
	    }
	    RuntimeException_Sub1.anApplet12087 = Class305.anApplet3271;
	    method8146(string, string_0_, i, i_1_, i_2_, i_3_, -702788681);
	} catch (Throwable throwable) {
	    Class262.method4824(null, throwable, (byte) 37);
	    method8168("crash", -1673246953);
	}
    }
    
    final void method8146(String string, String string_5_, int i, int i_6_,
			  int i_7_, int i_8_, int i_9_) throws Exception {
	anInt5575 = i_6_ * -1007477835;
	Class208.anInt2241 = -98550679 * i;
	RuntimeException_Sub1.anInt12084 = i_7_ * -210585033;
	Class97.anInt1160 = 1229697491 * i_8_;
	Class461.aString5073 = "Unknown";
	Class690_Sub2.aString10846 = "1.1";
	try {
	    Class461.aString5073 = System.getProperty("java.vendor");
	    Class690_Sub2.aString10846 = System.getProperty("java.version");
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    Class509.aString5674 = System.getProperty("os.name");
	} catch (Exception exception) {
	    Class509.aString5674 = "Unknown";
	}
	Class262.aString2801 = Class509.aString5674.toLowerCase();
	try {
	    aString5592 = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    aString5592 = "";
	}
	try {
	    Class477.aString5191
		= System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    Class477.aString5191 = "";
	}
	try {
	    Class534_Sub42_Sub2.aString11882 = System.getProperty("user.home");
	    if (Class534_Sub42_Sub2.aString11882 != null)
		Class534_Sub42_Sub2.aString11882
		    = new StringBuilder().append
			  (Class534_Sub42_Sub2.aString11882).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (Class262.aString2801.startsWith("win")) {
		if (null == Class534_Sub42_Sub2.aString11882)
		    Class534_Sub42_Sub2.aString11882
			= System.getenv("USERPROFILE");
	    } else if (null == Class534_Sub42_Sub2.aString11882)
		Class534_Sub42_Sub2.aString11882 = System.getenv("HOME");
	    if (null != Class534_Sub42_Sub2.aString11882)
		Class534_Sub42_Sub2.aString11882
		    = new StringBuilder().append
			  (Class534_Sub42_Sub2.aString11882).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	if (Class534_Sub42_Sub2.aString11882 == null)
	    Class534_Sub42_Sub2.aString11882 = "~/";
	try {
	    Class72.anEventQueue797
		= Toolkit.getDefaultToolkit().getSystemEventQueue();
	} catch (Throwable throwable) {
	    /* empty */
	}
	Class206.aStringArray2233
	    = new String[] { "c:/rscache/", "/rscache/", "c:/windows/",
			     "c:/winnt/", "c:/",
			     Class534_Sub42_Sub2.aString11882, "/tmp/", "" };
	Class597.aStringArray7863
	    = new String[] { new StringBuilder().append(".jagex_cache_").append
				 (Class208.anInt2241 * -225897511).toString(),
			     new StringBuilder().append(".file_store_").append
				 (Class208.anInt2241 * -225897511)
				 .toString() };
    while_161_:
	for (int i_10_ = 0; i_10_ < 4; i_10_++) {
	    Class228.aFile2322
		= method8155(string, string_5_, i_10_, (short) -32606);
	    if (!Class228.aFile2322.exists())
		Class228.aFile2322.mkdirs();
	    File[] files = Class228.aFile2322.listFiles();
	    if (files != null) {
		File[] files_11_ = files;
		for (int i_12_ = 0; i_12_ < files_11_.length; i_12_++) {
		    File file = files_11_[i_12_];
		    if (!method8148(file, false, (byte) -65))
			continue while_161_;
		}
	    }
	    break;
	}
	Class89.method1716(Class228.aFile2322, 778269392);
	Class333.method5866((byte) 48);
	aClass38_5581
	    = new Class38(new Class24((Class286.method5264
				       ("main_file_cache.dat2", (byte) -36)),
				      "rw", 3221225472L),
			  5200, 0);
	aClass38_5582
	    = new Class38(new Class24((Class286.method5264
				       ("main_file_cache.idx255", (byte) -36)),
				      "rw", 1048576L),
			  6000, 0);
	Class314_Sub1.aClass38Array9995 = new Class38[-4375907 * anInt5575];
	for (int i_13_ = 0; i_13_ < anInt5575 * -4375907; i_13_++)
	    Class314_Sub1.aClass38Array9995[i_13_]
		= new Class38(new Class24((Class286.method5264
					   (new StringBuilder().append
						("main_file_cache.idx").append
						(i_13_).toString(),
					    (byte) -6)),
					  "rw", 1048576L),
			      6000, 0);
	try {
	    aClass14_5591 = new Class14();
	} catch (Exception exception) {
	    Class713.aBool8884 = false;
	}
	Class592.aClass518_7819 = new Class518();
	ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
	for (ThreadGroup threadgroup_14_ = threadgroup.getParent();
	     threadgroup_14_ != null;
	     threadgroup_14_ = threadgroup.getParent())
	    threadgroup = threadgroup_14_;
	Thread[] threads = new Thread[1000];
	threadgroup.enumerate(threads);
	for (int i_15_ = 0; i_15_ < threads.length; i_15_++) {
	    if (threads[i_15_] != null
		&& threads[i_15_].getName().startsWith("AWT"))
		threads[i_15_].setPriority(1);
	}
	Thread thread = new Thread(this);
	thread.setDaemon(true);
	thread.start();
	thread.setPriority(1);
    }
    
    abstract void method8147(byte i);
    
    public void method386() {
	if (!aBool5587)
	    aLong5586 = 0L;
    }
    
    boolean method8148(File file, boolean bool, byte i) {
	boolean bool_16_;
	try {
	    RandomAccessFile randomaccessfile
		= new RandomAccessFile(file, "rw");
	    int i_17_ = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i_17_);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    if (bool)
		file.delete();
	    bool_16_ = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool_16_;
    }
    
    synchronized void method8149(String string, byte i) {
	Class452.aFrame4943 = new Frame();
	Class452.aFrame4943.setTitle(string);
	Class452.aFrame4943.setResizable(true);
	Class452.aFrame4943.addWindowListener(this);
	Class452.aFrame4943.setBackground(Color.black);
	Class452.aFrame4943.setVisible(true);
	Class452.aFrame4943.toFront();
	Insets insets = Class452.aFrame4943.getInsets();
	Class452.aFrame4943.setSize((-166028671 * Class391.anInt4076
				     + insets.left + insets.right),
				    (8272787 * anInt5561 + insets.top
				     + insets.bottom));
    }
    
    public static final void method8150(int i, String string, Color color,
					Color color_18_, Color color_19_) {
	try {
	    Graphics graphics = Class464.aCanvas5111.getGraphics();
	    if (null == Class464.aFont5112)
		Class464.aFont5112 = new Font("Helvetica", 1, 13);
	    if (null == color)
		color = new Color(140, 17, 17);
	    if (null == color_18_)
		color_18_ = new Color(140, 17, 17);
	    if (color_19_ == null)
		color_19_ = new Color(255, 255, 255);
	    try {
		if (null == Class237.anImage2376)
		    Class237.anImage2376
			= Class464.aCanvas5111.createImage((1771907305
							    * (Class706_Sub4
							       .anInt10994)),
							   (Class18.anInt205
							    * -1091172141));
		Graphics graphics_20_ = Class237.anImage2376.getGraphics();
		graphics_20_.setColor(Color.black);
		graphics_20_.fillRect(0, 0,
				      1771907305 * Class706_Sub4.anInt10994,
				      Class18.anInt205 * -1091172141);
		int i_21_ = Class706_Sub4.anInt10994 * 1771907305 / 2 - 152;
		int i_22_ = Class18.anInt205 * -1091172141 / 2 - 18;
		graphics_20_.setColor(color_18_);
		graphics_20_.drawRect(i_21_, i_22_, 303, 33);
		graphics_20_.setColor(color);
		graphics_20_.fillRect(2 + i_21_, i_22_ + 2, i * 3, 30);
		graphics_20_.setColor(Color.black);
		graphics_20_.drawRect(i_21_ + 1, 1 + i_22_, 301, 31);
		graphics_20_.fillRect(i_21_ + 2 + 3 * i, i_22_ + 2,
				      300 - i * 3, 30);
		graphics_20_.setFont(Class464.aFont5112);
		graphics_20_.setColor(color_19_);
		graphics_20_.drawString(string,
					(i_21_
					 + (304 - string.length() * 6) / 2),
					22 + i_22_);
		if (aString5588 != null) {
		    graphics_20_.setFont(Class464.aFont5112);
		    graphics_20_.setColor(color_19_);
		    graphics_20_.drawString(aString5588,
					    ((1771907305
					      * Class706_Sub4.anInt10994 / 2)
					     - aString5588.length() * 6 / 2),
					    (Class18.anInt205 * -1091172141 / 2
					     - 26));
		}
		graphics.drawImage(Class237.anImage2376, 0, 0, null);
	    } catch (Exception exception) {
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, Class706_Sub4.anInt10994 * 1771907305,
				  -1091172141 * Class18.anInt205);
		int i_23_ = Class706_Sub4.anInt10994 * 1771907305 / 2 - 152;
		int i_24_ = Class18.anInt205 * -1091172141 / 2 - 18;
		graphics.setColor(color_18_);
		graphics.drawRect(i_23_, i_24_, 303, 33);
		graphics.setColor(color);
		graphics.fillRect(i_23_ + 2, 2 + i_24_, i * 3, 30);
		graphics.setColor(Color.black);
		graphics.drawRect(1 + i_23_, i_24_ + 1, 301, 31);
		graphics.fillRect(i_23_ + 2 + i * 3, i_24_ + 2, 300 - 3 * i,
				  30);
		graphics.setFont(Class464.aFont5112);
		graphics.setColor(color_19_);
		if (aString5588 != null) {
		    graphics.setFont(Class464.aFont5112);
		    graphics.setColor(color_19_);
		    graphics.drawString(aString5588,
					(Class706_Sub4.anInt10994 * 1771907305
					 / 2) - aString5588.length() * 6 / 2,
					(-1091172141 * Class18.anInt205 / 2
					 - 26));
		}
		graphics.drawString(string,
				    i_23_ + (304 - string.length() * 6) / 2,
				    i_24_ + 22);
	    }
	} catch (Exception exception) {
	    Class464.aCanvas5111.repaint();
	}
    }
    
    void method8151(Container container, byte i) {
	container.setBackground(Color.black);
	container.setLayout(null);
	container.add(Class464.aCanvas5111);
	Class464.aCanvas5111.setSize(Class706_Sub4.anInt10994 * 1771907305,
				     -1091172141 * Class18.anInt205);
	Class464.aCanvas5111.setVisible(true);
	if (container == Class452.aFrame4943) {
	    Insets insets = Class452.aFrame4943.getInsets();
	    Class464.aCanvas5111.setLocation((anInt5562 * -721302779
					      + insets.left),
					     (insets.top
					      + -350211099 * anInt5563));
	} else
	    Class464.aCanvas5111.setLocation(-721302779 * anInt5562,
					     -350211099 * anInt5563);
	Class464.aCanvas5111.addFocusListener(this);
	Class464.aCanvas5111.requestFocus();
	Class534_Sub36.aBool10800 = true;
	aBool5590 = true;
	Class464.aCanvas5111.setFocusTraversalKeysEnabled(false);
	aBool5565 = true;
	aBool5552 = false;
	aLong5560 = Class250.method4604((byte) -121) * -10386718407137179L;
    }
    
    void method8152(int i) {
	if (Class464.aCanvas5111 != null) {
	    Class464.aCanvas5111.removeFocusListener(this);
	    Class464.aCanvas5111.getParent().setBackground(Color.black);
	    Class464.aCanvas5111.getParent().remove(Class464.aCanvas5111);
	}
    }
    
    final boolean method8153(int i) {
	String string
	    = Class305.anApplet3271.getDocumentBase().getHost().toLowerCase();
	if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
	    return true;
	if (string.equals("runescape.com")
	    || string.endsWith(".runescape.com"))
	    return true;
	if (string.equals("stellardawn.com")
	    || string.endsWith(".stellardawn.com"))
	    return true;
	if (string.endsWith("127.0.0.1"))
	    return true;
	for (/**/;
	     (string.length() > 0 && string.charAt(string.length() - 1) >= '0'
	      && string.charAt(string.length() - 1) <= '9');
	     string = string.substring(0, string.length() - 1)) {
	    /* empty */
	}
	if (string.endsWith("192.168.1."))
	    return true;
	method8168("invalidhost", -1870505216);
	return false;
    }
    
    public void method394(Applet applet) {
	Class305.anApplet3271 = applet;
    }
    
    void method8154(int i) {
	if (null != Class461.aString5073) {
	    String string = Class461.aString5073.toLowerCase();
	    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
		String string_25_ = Class690_Sub2.aString10846;
		if (string_25_.equals("1.1") || string_25_.startsWith("1.1.")
		    || string_25_.equals("1.2")
		    || string_25_.startsWith("1.2.")
		    || string_25_.equals("1.3")
		    || string_25_.startsWith("1.3.")
		    || string_25_.equals("1.4")
		    || string_25_.startsWith("1.4.")
		    || string_25_.equals("1.5")
		    || string_25_.startsWith("1.5.")
		    || string_25_.equals("1.6.0")) {
		    method8168("wrongjava", -348924066);
		    return;
		}
		if (string_25_.startsWith("1.6.0_")) {
		    int i_26_;
		    for (i_26_ = 6;
			 (i_26_ < string_25_.length()
			  && Class458.method7436(string_25_.charAt(i_26_),
						 -74576591));
			 i_26_++) {
			/* empty */
		    }
		    String string_27_ = string_25_.substring(6, i_26_);
		    if (Class545.method8965(string_27_, 408758916)
			&& Class684.method13949(string_27_, (byte) 96) < 10) {
			method8168("wrongjava", 986984156);
			return;
		    }
		}
	    }
	}
	Class171.method2880((short) 17969).setFocusCycleRoot(true);
	anInt5589 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1)
		     * -1178222113);
	anInt5576 = Runtime.getRuntime().availableProcessors() * -1640072939;
	method8167((byte) 68);
	method8164((short) -18078);
	aClass502_5556 = Class348_Sub1_Sub2.method17995(-727628658);
	while (0L == aLong5586 * -7263425836568356405L
	       || (Class250.method4604((byte) -33)
		   < -7263425836568356405L * aLong5586)) {
	    anInt5571
		= (aClass502_5556.method8280(aLong5553 * 435371756202260911L)
		   * -962773997);
	    for (int i_28_ = 0; i_28_ < anInt5571 * 1649143323; i_28_++)
		method8178(630883175);
	    method8156(2102842341);
	    Class423.method6789(Class464.aCanvas5111, (byte) -88);
	}
    }
    
    File method8155(String string, String string_29_, int i, short i_30_) {
	String string_31_
	    = (i == 0 ? ""
	       : new StringBuilder().append("").append(i).toString());
	Class195.aFile2159
	    = new File(Class534_Sub42_Sub2.aString11882,
		       new StringBuilder().append("jagex_cl_").append
			   (string).append
			   ("_").append
			   (string_29_).append
			   (string_31_).append
			   (".dat").toString());
	String string_32_ = null;
	String string_33_ = null;
	boolean bool = false;
	if (Class195.aFile2159.exists()) {
	    try {
		Class24 class24
		    = new Class24(Class195.aFile2159, "rw", 10000L);
		int i_34_;
		Class534_Sub40 class534_sub40;
		for (class534_sub40 = (new Class534_Sub40
				       ((int) class24.method831(-1129380415)));
		     (class534_sub40.anInt10811 * 31645619
		      < class534_sub40.aByteArray10810.length);
		     class534_sub40.anInt10811 += -1387468933 * i_34_) {
		    i_34_ = class24.method843(class534_sub40.aByteArray10810,
					      (31645619
					       * class534_sub40.anInt10811),
					      ((class534_sub40
						.aByteArray10810).length
					       - 31645619 * (class534_sub40
							     .anInt10811)),
					      1654943015);
		    if (-1 == i_34_)
			throw new IOException();
		}
		class534_sub40.anInt10811 = 0;
		i_34_ = class534_sub40.method16527(1151571705);
		if (i_34_ < 1 || i_34_ > 3)
		    throw new IOException(new StringBuilder().append("").append
					      (i_34_).toString());
		int i_35_ = 0;
		if (i_34_ > 1)
		    i_35_ = class534_sub40.method16527(-1262315010);
		if (i_34_ <= 2) {
		    string_32_ = class534_sub40.method16523(-1637309661);
		    if (i_35_ == 1)
			string_33_ = class534_sub40.method16523(-1404551109);
		} else {
		    string_32_ = class534_sub40.method16543(1657955477);
		    if (i_35_ == 1)
			string_33_ = class534_sub40.method16543(1901428354);
		}
		class24.method832(2076492886);
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	    if (string_32_ != null) {
		File file = new File(string_32_);
		if (!file.exists())
		    string_32_ = null;
	    }
	    if (string_32_ != null) {
		File file = new File(string_32_, "test.dat");
		if (!method8148(file, true, (byte) 0))
		    string_32_ = null;
	    }
	}
	if (null == string_32_ && 0 == i) {
	while_162_:
	    for (int i_36_ = 0; i_36_ < Class597.aStringArray7863.length;
		 i_36_++) {
		for (int i_37_ = 0; i_37_ < Class206.aStringArray2233.length;
		     i_37_++) {
		    File file = new File(new StringBuilder().append
					     (Class206.aStringArray2233[i_37_])
					     .append
					     (Class597.aStringArray7863[i_36_])
					     .append
					     (File.separatorChar).append
					     (string).append
					     (File.separatorChar).toString());
		    if (file.exists() && method8148(new File(file, "test.dat"),
						    true, (byte) 7)) {
			string_32_ = file.toString();
			bool = true;
			break while_162_;
		    }
		}
	    }
	}
	if (null == string_32_) {
	    string_32_ = new StringBuilder().append
			     (Class534_Sub42_Sub2.aString11882).append
			     (File.separatorChar).append
			     ("jagexcache").append
			     (string_31_).append
			     (File.separatorChar).append
			     (string).append
			     (File.separatorChar).append
			     (string_29_).append
			     (File.separatorChar).toString();
	    bool = true;
	}
	if (string_33_ != null) {
	    File file = new File(string_33_);
	    File file_38_ = new File(string_32_);
	    try {
		File[] files = file.listFiles();
		File[] files_39_ = files;
		for (int i_40_ = 0; i_40_ < files_39_.length; i_40_++) {
		    File file_41_ = files_39_[i_40_];
		    File file_42_ = new File(file_38_, file_41_.getName());
		    boolean bool_43_ = file_41_.renameTo(file_42_);
		    if (!bool_43_)
			throw new IOException();
		}
	    } catch (Exception exception) {
		exception.printStackTrace();
	    }
	    bool = true;
	}
	if (bool)
	    method8240(new File(string_32_), null, -1178809314);
	return new File(string_32_);
    }
    
    void method8156(int i) {
	long l = Class250.method4604((byte) -106);
	long l_44_
	    = aLongArray5558[850712361 * Class690_Sub13.anInt10884 - 1 & 0x1f];
	long l_45_ = aLongArray5558[850712361 * Class690_Sub13.anInt10884];
	aLongArray5558[850712361 * Class690_Sub13.anInt10884] = l;
	Class690_Sub13.anInt10884
	    = (850712361 * Class690_Sub13.anInt10884 + 1 & 0x1f) * -1738558183;
	if (l_45_ != 0L && l > l_45_) {
	    int i_46_ = (int) (l - l_45_);
	    anInt5555 = (int) (l - l_44_) * 591308773;
	    anInt5554 = -281702665 * (((i_46_ >> 1) + 32000) / i_46_);
	}
	if ((anInt5578 += -545995735) * -1070786535 - 1 > 50) {
	    anInt5578 -= -1529982974;
	    aBool5565 = true;
	    Class464.aCanvas5111.setSize(1771907305 * Class706_Sub4.anInt10994,
					 Class18.anInt205 * -1091172141);
	    Class464.aCanvas5111.setVisible(true);
	    if (null != Class452.aFrame4943 && null == Class29.aFrame266) {
		Insets insets = Class452.aFrame4943.getInsets();
		Class464.aCanvas5111.setLocation((-721302779 * anInt5562
						  + insets.left),
						 (insets.top
						  + anInt5563 * -350211099));
	    } else
		Class464.aCanvas5111.setLocation(anInt5562 * -721302779,
						 -350211099 * anInt5563);
	}
	method8166(-369732674);
    }
    
    String method8157(byte i) {
	return null;
    }
    
    final void method8158(boolean bool, int i) {
	synchronized (this) {
	    if (aBool5587)
		return;
	    aBool5587 = true;
	}
	try {
	    method8147((byte) 28);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    aClass38_5581.method945(-1026847694);
	    for (int i_47_ = 0; i_47_ < anInt5575 * -4375907; i_47_++)
		Class314_Sub1.aClass38Array9995[i_47_].method945(-1671232776);
	    aClass38_5582.method945(-1538791688);
	    aClass38_5580.method945(-741719002);
	} catch (Exception exception) {
	    /* empty */
	}
	if (aBool5566) {
	    try {
		QueryPerformanceCounter.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	if (Class615.method10139(-1938847988))
	    Class112.method2018(-1327590673).method402((short) 1322);
	if (null != Class464.aCanvas5111) {
	    try {
		Class464.aCanvas5111.removeFocusListener(this);
		Class464.aCanvas5111.getParent().remove(Class464.aCanvas5111);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	if (null != Class452.aFrame4943) {
	    Class452.aFrame4943.setVisible(false);
	    Class452.aFrame4943.dispose();
	    Class452.aFrame4943 = null;
	}
    }
    
    public void start() {
	if (!aBool5587)
	    aLong5586 = 0L;
    }
    
    public static Class24 method8159(String string, String string_48_,
				     boolean bool) {
	File file = new File(Class228.aFile2322,
			     new StringBuilder().append("preferences").append
				 (string).append
				 (".dat").toString());
	do {
	    if (file.exists()) {
		Class24 class24;
		try {
		    Class24 class24_49_ = new Class24(file, "rw", 10000L);
		    class24 = class24_49_;
		} catch (IOException ioexception) {
		    break;
		}
		return class24;
	    }
	} while (false);
	String string_50_ = "";
	if (-225897511 * Class208.anInt2241 == 33)
	    string_50_ = "_rc";
	else if (34 == Class208.anInt2241 * -225897511)
	    string_50_ = "_wip";
	File file_51_ = new File(Class534_Sub42_Sub2.aString11882,
				 new StringBuilder().append("jagex_").append
				     (string_48_).append
				     ("_preferences").append
				     (string).append
				     (string_50_).append
				     (".dat").toString());
	do {
	    if (!bool && file_51_.exists()) {
		Class24 class24;
		try {
		    Class24 class24_52_ = new Class24(file_51_, "rw", 10000L);
		    class24 = class24_52_;
		} catch (IOException ioexception) {
		    break;
		}
		return class24;
	    }
	} while (false);
	Class24 class24;
	try {
	    Class24 class24_53_ = new Class24(file, "rw", 10000L);
	    class24 = class24_53_;
	} catch (IOException ioexception) {
	    throw new RuntimeException();
	}
	return class24;
    }
    
    public void destroy() {
	if (!aBool5587) {
	    aLong5586 = Class250.method4604((byte) -9) * 7393495441865868259L;
	    Class251.method4622(5000L);
	    method8158(false, 819287246);
	}
    }
    
    public final void update(Graphics graphics) {
	paint(graphics);
    }
    
    public final synchronized void paint(Graphics graphics) {
	if (!aBool5587) {
	    aBool5565 = true;
	    if ((Class250.method4604((byte) -93)
		 - 3099711367168821613L * aLong5560)
		> 1000L) {
		Rectangle rectangle = graphics.getClipBounds();
		if (null == rectangle
		    || (rectangle.width >= -166028671 * Class391.anInt4076
			&& rectangle.height >= 8272787 * anInt5561))
		    aBool5552 = true;
	    }
	}
    }
    
    public final void focusGained(FocusEvent focusevent) {
	aBool5590 = true;
	aBool5565 = true;
    }
    
    public final void focusLost(FocusEvent focusevent) {
	aBool5590 = false;
    }
    
    public final void windowActivated(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void windowClosed(WindowEvent windowevent) {
	/* empty */
    }
    
    void method8160(String string, String string_54_, int i) {
	if (!aBool5574) {
	    aBool5574 = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class31.method887(Class305.anApplet3271, "loggedout",
				  592978690);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class305.anApplet3271.getAppletContext().showDocument
		    (new URL(Class305.anApplet3271.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws?").append
				 (string_54_).toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    void method8161(Class508 class508, boolean bool) {
	if (null == class508)
	    throw new NullPointerException();
	if (Class508.aClass508_5668 != class508
	    && class508 != Class508.aClass508_5669)
	    throw new IllegalStateException();
	aClass508_5585 = class508;
	if (Class508.aClass508_5669 != aClass508_5585) {
	    if (bool)
		aClass508_5585 = Class508.aClass508_5670;
	}
    }
    
    public final void windowDeiconified(WindowEvent windowevent) {
	/* empty */
    }
    
    final void method8162(String string, String string_55_, int i, int i_56_,
			  int i_57_, int i_58_) throws Exception {
	anInt5575 = i_56_ * -1007477835;
	Class208.anInt2241 = -98550679 * i;
	RuntimeException_Sub1.anInt12084 = i_57_ * -210585033;
	Class97.anInt1160 = 1229697491 * i_58_;
	Class461.aString5073 = "Unknown";
	Class690_Sub2.aString10846 = "1.1";
	try {
	    Class461.aString5073 = System.getProperty("java.vendor");
	    Class690_Sub2.aString10846 = System.getProperty("java.version");
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    Class509.aString5674 = System.getProperty("os.name");
	} catch (Exception exception) {
	    Class509.aString5674 = "Unknown";
	}
	Class262.aString2801 = Class509.aString5674.toLowerCase();
	try {
	    aString5592 = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    aString5592 = "";
	}
	try {
	    Class477.aString5191
		= System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    Class477.aString5191 = "";
	}
	try {
	    Class534_Sub42_Sub2.aString11882 = System.getProperty("user.home");
	    if (Class534_Sub42_Sub2.aString11882 != null)
		Class534_Sub42_Sub2.aString11882
		    = new StringBuilder().append
			  (Class534_Sub42_Sub2.aString11882).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (Class262.aString2801.startsWith("win")) {
		if (null == Class534_Sub42_Sub2.aString11882)
		    Class534_Sub42_Sub2.aString11882
			= System.getenv("USERPROFILE");
	    } else if (null == Class534_Sub42_Sub2.aString11882)
		Class534_Sub42_Sub2.aString11882 = System.getenv("HOME");
	    if (null != Class534_Sub42_Sub2.aString11882)
		Class534_Sub42_Sub2.aString11882
		    = new StringBuilder().append
			  (Class534_Sub42_Sub2.aString11882).append
			  ("/").toString();
	} catch (Exception exception) {
	    /* empty */
	}
	if (Class534_Sub42_Sub2.aString11882 == null)
	    Class534_Sub42_Sub2.aString11882 = "~/";
	try {
	    Class72.anEventQueue797
		= Toolkit.getDefaultToolkit().getSystemEventQueue();
	} catch (Throwable throwable) {
	    /* empty */
	}
	Class206.aStringArray2233
	    = new String[] { "c:/rscache/", "/rscache/", "c:/windows/",
			     "c:/winnt/", "c:/",
			     Class534_Sub42_Sub2.aString11882, "/tmp/", "" };
	Class597.aStringArray7863
	    = new String[] { new StringBuilder().append(".jagex_cache_").append
				 (Class208.anInt2241 * -225897511).toString(),
			     new StringBuilder().append(".file_store_").append
				 (Class208.anInt2241 * -225897511)
				 .toString() };
    while_164_:
	for (int i_59_ = 0; i_59_ < 4; i_59_++) {
	    Class228.aFile2322
		= method8155(string, string_55_, i_59_, (short) -22816);
	    if (!Class228.aFile2322.exists())
		Class228.aFile2322.mkdirs();
	    File[] files = Class228.aFile2322.listFiles();
	    if (files != null) {
		File[] files_60_ = files;
		for (int i_61_ = 0; i_61_ < files_60_.length; i_61_++) {
		    File file = files_60_[i_61_];
		    if (!method8148(file, false, (byte) -68))
			continue while_164_;
		}
	    }
	    break;
	}
	Class89.method1716(Class228.aFile2322, -772644309);
	Class333.method5866((byte) -62);
	aClass38_5581
	    = new Class38(new Class24((Class286.method5264
				       ("main_file_cache.dat2", (byte) -40)),
				      "rw", 3221225472L),
			  5200, 0);
	aClass38_5582 = new Class38(new Class24((Class286.method5264
						 ("main_file_cache.idx255",
						  (byte) -102)),
						"rw", 1048576L),
				    6000, 0);
	Class314_Sub1.aClass38Array9995 = new Class38[-4375907 * anInt5575];
	for (int i_62_ = 0; i_62_ < anInt5575 * -4375907; i_62_++)
	    Class314_Sub1.aClass38Array9995[i_62_]
		= new Class38(new Class24((Class286.method5264
					   (new StringBuilder().append
						("main_file_cache.idx").append
						(i_62_).toString(),
					    (byte) -99)),
					  "rw", 1048576L),
			      6000, 0);
	try {
	    aClass14_5591 = new Class14();
	} catch (Exception exception) {
	    Class713.aBool8884 = false;
	}
	Class592.aClass518_7819 = new Class518();
	ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
	for (ThreadGroup threadgroup_63_ = threadgroup.getParent();
	     threadgroup_63_ != null;
	     threadgroup_63_ = threadgroup.getParent())
	    threadgroup = threadgroup_63_;
	Thread[] threads = new Thread[1000];
	threadgroup.enumerate(threads);
	for (int i_64_ = 0; i_64_ < threads.length; i_64_++) {
	    if (threads[i_64_] != null
		&& threads[i_64_].getName().startsWith("AWT"))
		threads[i_64_].setPriority(1);
	}
	Thread thread = new Thread(this);
	thread.setDaemon(true);
	thread.start();
	thread.setPriority(1);
    }
    
    public void method389() {
	if (!aBool5587)
	    aLong5586 = ((Class250.method4604((byte) -85) + 4000L)
			 * 7393495441865868259L);
    }
    
    static void method8163(Object object) {
	if (Class72.anEventQueue797 != null) {
	    for (int i = 0;
		 i < 50 && Class72.anEventQueue797.peekEvent() != null; i++)
		Class251.method4622(1L);
	    try {
		if (object != null)
		    Class72.anEventQueue797
			.postEvent(new ActionEvent(object, 1001, "dummy"));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    abstract void method8164(short i);
    
    abstract void method8165(int i);
    
    abstract void method8166(int i);
    
    synchronized void method8167(byte i) {
	method8152(-182915437);
	Container container = Class171.method2880((short) 23856);
	Class464.aCanvas5111 = new Canvas_Sub1(container);
	method8151(container, (byte) 1);
    }
    
    void method8168(String string, int i) {
	if (!aBool5574) {
	    aBool5574 = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class31.method887(Class305.anApplet3271, "loggedout",
				  141088513);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class305.anApplet3271.getAppletContext().showDocument
		    (new URL(Class305.anApplet3271.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws").toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    void method8169(Container container) {
	container.setBackground(Color.black);
	container.setLayout(null);
	container.add(Class464.aCanvas5111);
	Class464.aCanvas5111.setSize(Class706_Sub4.anInt10994 * 1771907305,
				     -1091172141 * Class18.anInt205);
	Class464.aCanvas5111.setVisible(true);
	if (container == Class452.aFrame4943) {
	    Insets insets = Class452.aFrame4943.getInsets();
	    Class464.aCanvas5111.setLocation((anInt5562 * -721302779
					      + insets.left),
					     (insets.top
					      + -350211099 * anInt5563));
	} else
	    Class464.aCanvas5111.setLocation(-721302779 * anInt5562,
					     -350211099 * anInt5563);
	Class464.aCanvas5111.addFocusListener(this);
	Class464.aCanvas5111.requestFocus();
	Class534_Sub36.aBool10800 = true;
	aBool5590 = true;
	Class464.aCanvas5111.setFocusTraversalKeysEnabled(false);
	aBool5565 = true;
	aBool5552 = false;
	aLong5560 = Class250.method4604((byte) -79) * -10386718407137179L;
    }
    
    public void method8170(int i) throws Exception_Sub3 {
	if (!aBool5566) {
	    Class112.method2018(-1327590673).method400("jaclib", -532903572);
	    try {
		QueryPerformanceCounter.init();
	    } catch (Throwable throwable) {
		if (Class262.aString2801.startsWith("win"))
		    throw new Exception_Sub3(128, "jaclib");
	    }
	    aBool5566 = true;
	}
    }
    
    void method8171(Class508 class508, boolean bool, short i) {
	if (null == class508)
	    throw new NullPointerException();
	if (Class508.aClass508_5668 != class508
	    && class508 != Class508.aClass508_5669)
	    throw new IllegalStateException();
	aClass508_5585 = class508;
	if (Class508.aClass508_5669 != aClass508_5585) {
	    if (bool)
		aClass508_5585 = Class508.aClass508_5670;
	}
    }
    
    static long method8172() {
	return aClass502_5556.method8297(760176363);
    }
    
    public void method8173() {
	do {
	    try {
		try {
		    method8154(-611550974);
		} catch (ThreadDeath threaddeath) {
		    throw threaddeath;
		} catch (Throwable throwable) {
		    Class262.method4824(method8157((byte) -2), throwable,
					(byte) -76);
		    method8168("crash", 573983749);
		    method8158(true, -753137298);
		    break;
		}
		method8158(true, 1403850877);
	    } catch (Exception object) {
		method8158(true, 1075673066);
		throw object;
	    }
	} while (false);
    }
    
    abstract void method8174();
    
    public final void windowClosing(WindowEvent windowevent) {
	aBool5564 = true;
	destroy();
    }
    
    abstract void method8175();
    
    abstract void method8176();
    
    public abstract void method396();
    
    abstract void method8177();
    
    void method8178(int i) {
	long l = Class250.method4604((byte) -49);
	long l_65_ = aLongArray5572[anInt5569 * -896611215];
	aLongArray5572[anInt5569 * -896611215] = l;
	anInt5569 = -1851034479 * (-896611215 * anInt5569 + 1 & 0x1f);
	if (0L != l_65_ && l <= l_65_) {
	    /* empty */
	}
	synchronized (this) {
	    Class534_Sub36.aBool10800 = aBool5590;
	}
	method8165(-1985318899);
    }
    
    abstract void method8179();
    
    abstract void method8180();
    
    abstract void method8181();
    
    String method8182() {
	return null;
    }
    
    String method8183() {
	return null;
    }
    
    public void method385(Applet applet) {
	Class305.anApplet3271 = applet;
    }
    
    public abstract void init();
    
    final void method8184(Class517 class517, String string, String string_66_,
			  int i, int i_67_, int i_68_, int i_69_,
			  boolean bool) {
	try {
	    method8171(Class508.aClass508_5668, bool, (short) -391);
	    Class391.anInt4076
		= (Class706_Sub4.anInt10994
		   = class517.method8632(573648604) * 919220057) * 298502761;
	    anInt5561
		= (Class18.anInt205
		   = class517.method8618(-2069248301) * 533696347) * -98449983;
	    anInt5562 = 0;
	    anInt5563 = 0;
	    if (Class309.method5657((byte) 112) == Class508.aClass508_5670) {
		Class391.anInt4076
		    += -1895347454 * class517.method8616((byte) -1);
		anInt5561 += 453915958 * class517.method8619(-2140044775);
		method8149(class517.method8621(-1729998935), (byte) 113);
	    }
	    RuntimeException_Sub1.anApplet12087 = Class305.anApplet3271;
	    method8146(string, string_66_, i, i_67_, i_68_, i_69_, 1287278256);
	} catch (Throwable throwable) {
	    Class262.method4824(null, throwable, (byte) 47);
	    method8168("crash", -1803457274);
	}
    }
    
    final void method8185(Class517 class517, String string, String string_70_,
			  int i, int i_71_, int i_72_, int i_73_,
			  boolean bool) {
	try {
	    method8171(Class508.aClass508_5668, bool, (short) -23243);
	    Class391.anInt4076
		= (Class706_Sub4.anInt10994
		   = class517.method8632(1147070125) * 919220057) * 298502761;
	    anInt5561
		= (Class18.anInt205
		   = class517.method8618(-2078284183) * 533696347) * -98449983;
	    anInt5562 = 0;
	    anInt5563 = 0;
	    if (Class309.method5657((byte) 74) == Class508.aClass508_5670) {
		Class391.anInt4076
		    += -1895347454 * class517.method8616((byte) -1);
		anInt5561 += 453915958 * class517.method8619(-2140044775);
		method8149(class517.method8621(-1729998935), (byte) 75);
	    }
	    RuntimeException_Sub1.anApplet12087 = Class305.anApplet3271;
	    method8146(string, string_70_, i, i_71_, i_72_, i_73_, -821575483);
	} catch (Throwable throwable) {
	    Class262.method4824(null, throwable, (byte) 23);
	    method8168("crash", -117576944);
	}
    }
    
    static long method8186() {
	return aClass502_5556.method8297(-750027310);
    }
    
    static void method8187(Class534_Sub40 class534_sub40, int i) {
	if (aClass38_5580 != null) {
	    try {
		aClass38_5580.method947(0L);
		aClass38_5580.method951(class534_sub40.aByteArray10810, i, 24,
					-974969331);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    File method8188(String string, String string_74_, int i) {
	String string_75_
	    = (i == 0 ? ""
	       : new StringBuilder().append("").append(i).toString());
	Class195.aFile2159
	    = new File(Class534_Sub42_Sub2.aString11882,
		       new StringBuilder().append("jagex_cl_").append
			   (string).append
			   ("_").append
			   (string_74_).append
			   (string_75_).append
			   (".dat").toString());
	String string_76_ = null;
	String string_77_ = null;
	boolean bool = false;
	if (Class195.aFile2159.exists()) {
	    try {
		Class24 class24
		    = new Class24(Class195.aFile2159, "rw", 10000L);
		int i_78_;
		Class534_Sub40 class534_sub40;
		for (class534_sub40 = (new Class534_Sub40
				       ((int) class24.method831(-1755133809)));
		     (class534_sub40.anInt10811 * 31645619
		      < class534_sub40.aByteArray10810.length);
		     class534_sub40.anInt10811 += -1387468933 * i_78_) {
		    i_78_ = class24.method843(class534_sub40.aByteArray10810,
					      (31645619
					       * class534_sub40.anInt10811),
					      ((class534_sub40
						.aByteArray10810).length
					       - 31645619 * (class534_sub40
							     .anInt10811)),
					      1472478793);
		    if (-1 == i_78_)
			throw new IOException();
		}
		class534_sub40.anInt10811 = 0;
		i_78_ = class534_sub40.method16527(-635519187);
		if (i_78_ < 1 || i_78_ > 3)
		    throw new IOException(new StringBuilder().append("").append
					      (i_78_).toString());
		int i_79_ = 0;
		if (i_78_ > 1)
		    i_79_ = class534_sub40.method16527(-1736080019);
		if (i_78_ <= 2) {
		    string_76_ = class534_sub40.method16523(-1452562159);
		    if (i_79_ == 1)
			string_77_ = class534_sub40.method16523(-2044107732);
		} else {
		    string_76_ = class534_sub40.method16543(2018589874);
		    if (i_79_ == 1)
			string_77_ = class534_sub40.method16543(1872644928);
		}
		class24.method832(150387205);
	    } catch (IOException ioexception) {
		ioexception.printStackTrace();
	    }
	    if (string_76_ != null) {
		File file = new File(string_76_);
		if (!file.exists())
		    string_76_ = null;
	    }
	    if (string_76_ != null) {
		File file = new File(string_76_, "test.dat");
		if (!method8148(file, true, (byte) -18))
		    string_76_ = null;
	    }
	}
	if (null == string_76_ && 0 == i) {
	while_165_:
	    for (int i_80_ = 0; i_80_ < Class597.aStringArray7863.length;
		 i_80_++) {
		for (int i_81_ = 0; i_81_ < Class206.aStringArray2233.length;
		     i_81_++) {
		    File file = new File(new StringBuilder().append
					     (Class206.aStringArray2233[i_81_])
					     .append
					     (Class597.aStringArray7863[i_80_])
					     .append
					     (File.separatorChar).append
					     (string).append
					     (File.separatorChar).toString());
		    if (file.exists() && method8148(new File(file, "test.dat"),
						    true, (byte) -35)) {
			string_76_ = file.toString();
			bool = true;
			break while_165_;
		    }
		}
	    }
	}
	if (null == string_76_) {
	    string_76_ = new StringBuilder().append
			     (Class534_Sub42_Sub2.aString11882).append
			     (File.separatorChar).append
			     ("jagexcache").append
			     (string_75_).append
			     (File.separatorChar).append
			     (string).append
			     (File.separatorChar).append
			     (string_74_).append
			     (File.separatorChar).toString();
	    bool = true;
	}
	if (string_77_ != null) {
	    File file = new File(string_77_);
	    File file_82_ = new File(string_76_);
	    try {
		File[] files = file.listFiles();
		File[] files_83_ = files;
		for (int i_84_ = 0; i_84_ < files_83_.length; i_84_++) {
		    File file_85_ = files_83_[i_84_];
		    File file_86_ = new File(file_82_, file_85_.getName());
		    boolean bool_87_ = file_85_.renameTo(file_86_);
		    if (!bool_87_)
			throw new IOException();
		}
	    } catch (Exception exception) {
		exception.printStackTrace();
	    }
	    bool = true;
	}
	if (bool)
	    method8240(new File(string_76_), null, -1178809314);
	return new File(string_76_);
    }
    
    public final void method8189(WindowEvent windowevent) {
	/* empty */
    }
    
    public static File method8190() {
	return Class228.aFile2322;
    }
    
    public static File method8191() {
	return Class228.aFile2322;
    }
    
    public static File method8192() {
	return Class228.aFile2322;
    }
    
    public static File method8193() {
	return Class228.aFile2322;
    }
    
    public final void method8194(WindowEvent windowevent) {
	aBool5564 = true;
	destroy();
    }
    
    static void method8195(Object object) {
	if (Class72.anEventQueue797 != null) {
	    for (int i = 0;
		 i < 50 && Class72.anEventQueue797.peekEvent() != null; i++)
		Class251.method4622(1L);
	    try {
		if (object != null)
		    Class72.anEventQueue797
			.postEvent(new ActionEvent(object, 1001, "dummy"));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public static Class24 method8196(String string, String string_88_,
				     boolean bool) {
	File file = new File(Class228.aFile2322,
			     new StringBuilder().append("preferences").append
				 (string).append
				 (".dat").toString());
	do {
	    if (file.exists()) {
		Class24 class24;
		try {
		    Class24 class24_89_ = new Class24(file, "rw", 10000L);
		    class24 = class24_89_;
		} catch (IOException ioexception) {
		    break;
		}
		return class24;
	    }
	} while (false);
	String string_90_ = "";
	if (-225897511 * Class208.anInt2241 == 33)
	    string_90_ = "_rc";
	else if (34 == Class208.anInt2241 * -225897511)
	    string_90_ = "_wip";
	File file_91_ = new File(Class534_Sub42_Sub2.aString11882,
				 new StringBuilder().append("jagex_").append
				     (string_88_).append
				     ("_preferences").append
				     (string).append
				     (string_90_).append
				     (".dat").toString());
	do {
	    if (!bool && file_91_.exists()) {
		Class24 class24;
		try {
		    Class24 class24_92_ = new Class24(file_91_, "rw", 10000L);
		    class24 = class24_92_;
		} catch (IOException ioexception) {
		    break;
		}
		return class24;
	    }
	} while (false);
	Class24 class24;
	try {
	    Class24 class24_93_ = new Class24(file, "rw", 10000L);
	    class24 = class24_93_;
	} catch (IOException ioexception) {
	    throw new RuntimeException();
	}
	return class24;
    }
    
    static void method8197() {
	try {
	    File file
		= new File(Class534_Sub42_Sub2.aString11882, "random.dat");
	    if (file.exists())
		aClass38_5580
		    = new Class38(new Class24(file, "rw", 25L), 24, 0);
	    else {
	    while_166_:
		for (int i = 0; i < Class597.aStringArray7863.length; i++) {
		    for (int i_94_ = 0;
			 i_94_ < Class206.aStringArray2233.length; i_94_++) {
			File file_95_
			    = new File(new StringBuilder().append
					   (Class206.aStringArray2233[i_94_])
					   .append
					   (Class597.aStringArray7863[i])
					   .append
					   (File.separatorChar).append
					   ("random.dat").toString());
			if (file_95_.exists()) {
			    aClass38_5580
				= new Class38(new Class24(file_95_, "rw", 25L),
					      24, 0);
			    break while_166_;
			}
		    }
		}
	    }
	    if (null == aClass38_5580) {
		RandomAccessFile randomaccessfile
		    = new RandomAccessFile(file, "rw");
		int i = randomaccessfile.read();
		randomaccessfile.seek(0L);
		randomaccessfile.write(i);
		randomaccessfile.seek(0L);
		randomaccessfile.close();
		aClass38_5580
		    = new Class38(new Class24(file, "rw", 25L), 24, 0);
	    }
	} catch (IOException ioexception) {
	    /* empty */
	}
    }
    
    void method8198() {
	long l = Class250.method4604((byte) -112);
	long l_96_
	    = aLongArray5558[850712361 * Class690_Sub13.anInt10884 - 1 & 0x1f];
	long l_97_ = aLongArray5558[850712361 * Class690_Sub13.anInt10884];
	aLongArray5558[850712361 * Class690_Sub13.anInt10884] = l;
	Class690_Sub13.anInt10884
	    = (850712361 * Class690_Sub13.anInt10884 + 1 & 0x1f) * -1738558183;
	if (l_97_ != 0L && l > l_97_) {
	    int i = (int) (l - l_97_);
	    anInt5555 = (int) (l - l_96_) * 591308773;
	    anInt5554 = -281702665 * (((i >> 1) + 32000) / i);
	}
	if ((anInt5578 += -545995735) * -1070786535 - 1 > 50) {
	    anInt5578 -= -1529982974;
	    aBool5565 = true;
	    Class464.aCanvas5111.setSize(1771907305 * Class706_Sub4.anInt10994,
					 Class18.anInt205 * -1091172141);
	    Class464.aCanvas5111.setVisible(true);
	    if (null != Class452.aFrame4943 && null == Class29.aFrame266) {
		Insets insets = Class452.aFrame4943.getInsets();
		Class464.aCanvas5111.setLocation((-721302779 * anInt5562
						  + insets.left),
						 (insets.top
						  + anInt5563 * -350211099));
	    } else
		Class464.aCanvas5111.setLocation(anInt5562 * -721302779,
						 -350211099 * anInt5563);
	}
	method8166(426232632);
    }
    
    static void method8199() {
	try {
	    File file
		= new File(Class534_Sub42_Sub2.aString11882, "random.dat");
	    if (file.exists())
		aClass38_5580
		    = new Class38(new Class24(file, "rw", 25L), 24, 0);
	    else {
	    while_167_:
		for (int i = 0; i < Class597.aStringArray7863.length; i++) {
		    for (int i_98_ = 0;
			 i_98_ < Class206.aStringArray2233.length; i_98_++) {
			File file_99_
			    = new File(new StringBuilder().append
					   (Class206.aStringArray2233[i_98_])
					   .append
					   (Class597.aStringArray7863[i])
					   .append
					   (File.separatorChar).append
					   ("random.dat").toString());
			if (file_99_.exists()) {
			    aClass38_5580
				= new Class38(new Class24(file_99_, "rw", 25L),
					      24, 0);
			    break while_167_;
			}
		    }
		}
	    }
	    if (null == aClass38_5580) {
		RandomAccessFile randomaccessfile
		    = new RandomAccessFile(file, "rw");
		int i = randomaccessfile.read();
		randomaccessfile.seek(0L);
		randomaccessfile.write(i);
		randomaccessfile.seek(0L);
		randomaccessfile.close();
		aClass38_5580
		    = new Class38(new Class24(file, "rw", 25L), 24, 0);
	    }
	} catch (IOException ioexception) {
	    /* empty */
	}
    }
    
    public static void method8200(Class534_Sub40 class534_sub40) {
	byte[] is = new byte[24];
	try {
	    aClass38_5580.method947(0L);
	    aClass38_5580.method948(is, (byte) 14);
	    int i;
	    for (i = 0; i < 24 && 0 == is[i]; i++) {
		/* empty */
	    }
	    if (i >= 24)
		throw new IOException();
	} catch (Exception exception) {
	    for (int i = 0; i < 24; i++)
		is[i] = (byte) -1;
	}
	class534_sub40.method16519(is, 0, 24, 1132726058);
    }
    
    public static void method8201(Class534_Sub40 class534_sub40) {
	byte[] is = new byte[24];
	try {
	    aClass38_5580.method947(0L);
	    aClass38_5580.method948(is, (byte) -50);
	    int i;
	    for (i = 0; i < 24 && 0 == is[i]; i++) {
		/* empty */
	    }
	    if (i >= 24)
		throw new IOException();
	} catch (Exception exception) {
	    for (int i = 0; i < 24; i++)
		is[i] = (byte) -1;
	}
	class534_sub40.method16519(is, 0, 24, 441779499);
    }
    
    public static void method8202(Class534_Sub40 class534_sub40) {
	byte[] is = new byte[24];
	try {
	    aClass38_5580.method947(0L);
	    aClass38_5580.method948(is, (byte) 71);
	    int i;
	    for (i = 0; i < 24 && 0 == is[i]; i++) {
		/* empty */
	    }
	    if (i >= 24)
		throw new IOException();
	} catch (Exception exception) {
	    for (int i = 0; i < 24; i++)
		is[i] = (byte) -1;
	}
	class534_sub40.method16519(is, 0, 24, 589670756);
    }
    
    static void method8203(Class534_Sub40 class534_sub40, int i) {
	if (aClass38_5580 != null) {
	    try {
		aClass38_5580.method947(0L);
		aClass38_5580.method951(class534_sub40.aByteArray10810, i, 24,
					-1304002715);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    static {
	anInt5562 = 0;
	anInt5563 = 0;
	aString5588 = null;
	aBool5565 = true;
	anInt5578 = 1880039444;
	aBool5552 = false;
	aLong5560 = 0L;
	aBool5564 = false;
	aBool5590 = true;
	aClass38_5580 = null;
	aClass38_5581 = null;
	aClass38_5582 = null;
	aClass508_5585 = null;
	aLong5586 = 0L;
	aBool5587 = false;
	anInt5589 = 1178222113;
	anInt5576 = -1640072939;
    }
    
    Class498() {
	aBool5566 = false;
    }
    
    public void stop() {
	if (!aBool5587)
	    aLong5586 = ((Class250.method4604((byte) -68) + 4000L)
			 * 7393495441865868259L);
    }
    
    static long method8204() {
	return aClass502_5556.method8297(1172859702);
    }
    
    synchronized void method8205() {
	method8152(-1698776620);
	Container container = Class171.method2880((short) -12658);
	Class464.aCanvas5111 = new Canvas_Sub1(container);
	method8151(container, (byte) 1);
    }
    
    public static Container method8206() {
	if (null != Class29.aFrame266)
	    return Class29.aFrame266;
	if (null != Class452.aFrame4943)
	    return Class452.aFrame4943;
	return Class305.anApplet3271;
    }
    
    abstract void method8207();
    
    public final void method8208(FocusEvent focusevent) {
	aBool5590 = true;
	aBool5565 = true;
    }
    
    void method8209(Container container) {
	container.setBackground(Color.black);
	container.setLayout(null);
	container.add(Class464.aCanvas5111);
	Class464.aCanvas5111.setSize(Class706_Sub4.anInt10994 * 1771907305,
				     -1091172141 * Class18.anInt205);
	Class464.aCanvas5111.setVisible(true);
	if (container == Class452.aFrame4943) {
	    Insets insets = Class452.aFrame4943.getInsets();
	    Class464.aCanvas5111.setLocation((anInt5562 * -721302779
					      + insets.left),
					     (insets.top
					      + -350211099 * anInt5563));
	} else
	    Class464.aCanvas5111.setLocation(-721302779 * anInt5562,
					     -350211099 * anInt5563);
	Class464.aCanvas5111.addFocusListener(this);
	Class464.aCanvas5111.requestFocus();
	Class534_Sub36.aBool10800 = true;
	aBool5590 = true;
	Class464.aCanvas5111.setFocusTraversalKeysEnabled(false);
	aBool5565 = true;
	aBool5552 = false;
	aLong5560 = Class250.method4604((byte) -120) * -10386718407137179L;
    }
    
    void method8210() {
	if (Class464.aCanvas5111 != null) {
	    Class464.aCanvas5111.removeFocusListener(this);
	    Class464.aCanvas5111.getParent().setBackground(Color.black);
	    Class464.aCanvas5111.getParent().remove(Class464.aCanvas5111);
	}
    }
    
    final void method8211(Class517 class517, String string, String string_100_,
			  int i, int i_101_, int i_102_, int i_103_,
			  boolean bool) {
	try {
	    method8171(Class508.aClass508_5668, bool, (short) -26778);
	    Class391.anInt4076
		= (Class706_Sub4.anInt10994
		   = class517.method8632(514172546) * 919220057) * 298502761;
	    anInt5561
		= (Class18.anInt205
		   = class517.method8618(-2140497715) * 533696347) * -98449983;
	    anInt5562 = 0;
	    anInt5563 = 0;
	    if (Class309.method5657((byte) 30) == Class508.aClass508_5670) {
		Class391.anInt4076
		    += -1895347454 * class517.method8616((byte) -1);
		anInt5561 += 453915958 * class517.method8619(-2140044775);
		method8149(class517.method8621(-1729998935), (byte) 81);
	    }
	    RuntimeException_Sub1.anApplet12087 = Class305.anApplet3271;
	    method8146(string, string_100_, i, i_101_, i_102_, i_103_,
		       -946091240);
	} catch (Throwable throwable) {
	    Class262.method4824(null, throwable, (byte) -80);
	    method8168("crash", -1213713888);
	}
    }
    
    abstract void method8212();
    
    synchronized void method8213() {
	method8152(-42814829);
	Container container = Class171.method2880((short) -7972);
	Class464.aCanvas5111 = new Canvas_Sub1(container);
	method8151(container, (byte) 1);
    }
    
    void method8214() {
	if (null != Class461.aString5073) {
	    String string = Class461.aString5073.toLowerCase();
	    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
		String string_104_ = Class690_Sub2.aString10846;
		if (string_104_.equals("1.1") || string_104_.startsWith("1.1.")
		    || string_104_.equals("1.2")
		    || string_104_.startsWith("1.2.")
		    || string_104_.equals("1.3")
		    || string_104_.startsWith("1.3.")
		    || string_104_.equals("1.4")
		    || string_104_.startsWith("1.4.")
		    || string_104_.equals("1.5")
		    || string_104_.startsWith("1.5.")
		    || string_104_.equals("1.6.0")) {
		    method8168("wrongjava", 942148666);
		    return;
		}
		if (string_104_.startsWith("1.6.0_")) {
		    int i;
		    for (i = 6; (i < string_104_.length()
				 && Class458.method7436(string_104_.charAt(i),
							-644655366)); i++) {
			/* empty */
		    }
		    String string_105_ = string_104_.substring(6, i);
		    if (Class545.method8965(string_105_, 992171940)
			&& Class684.method13949(string_105_, (byte) 97) < 10) {
			method8168("wrongjava", -1484276722);
			return;
		    }
		}
	    }
	}
	Class171.method2880((short) -9534).setFocusCycleRoot(true);
	anInt5589 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1)
		     * -1178222113);
	anInt5576 = Runtime.getRuntime().availableProcessors() * -1640072939;
	method8167((byte) 48);
	method8164((short) -29460);
	aClass502_5556 = Class348_Sub1_Sub2.method17995(51388624);
	while (0L == aLong5586 * -7263425836568356405L
	       || (Class250.method4604((byte) -96)
		   < -7263425836568356405L * aLong5586)) {
	    anInt5571
		= (aClass502_5556.method8280(aLong5553 * 435371756202260911L)
		   * -962773997);
	    for (int i = 0; i < anInt5571 * 1649143323; i++)
		method8178(630883175);
	    method8156(2134545037);
	    Class423.method6789(Class464.aCanvas5111, (byte) -41);
	}
    }
    
    boolean method8215(File file, boolean bool) {
	boolean bool_106_;
	try {
	    RandomAccessFile randomaccessfile
		= new RandomAccessFile(file, "rw");
	    int i = randomaccessfile.read();
	    randomaccessfile.seek(0L);
	    randomaccessfile.write(i);
	    randomaccessfile.seek(0L);
	    randomaccessfile.close();
	    if (bool)
		file.delete();
	    bool_106_ = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool_106_;
    }
    
    public final void method8216(WindowEvent windowevent) {
	/* empty */
    }
    
    void method8217(Container container) {
	container.setBackground(Color.black);
	container.setLayout(null);
	container.add(Class464.aCanvas5111);
	Class464.aCanvas5111.setSize(Class706_Sub4.anInt10994 * 1771907305,
				     -1091172141 * Class18.anInt205);
	Class464.aCanvas5111.setVisible(true);
	if (container == Class452.aFrame4943) {
	    Insets insets = Class452.aFrame4943.getInsets();
	    Class464.aCanvas5111.setLocation((anInt5562 * -721302779
					      + insets.left),
					     (insets.top
					      + -350211099 * anInt5563));
	} else
	    Class464.aCanvas5111.setLocation(-721302779 * anInt5562,
					     -350211099 * anInt5563);
	Class464.aCanvas5111.addFocusListener(this);
	Class464.aCanvas5111.requestFocus();
	Class534_Sub36.aBool10800 = true;
	aBool5590 = true;
	Class464.aCanvas5111.setFocusTraversalKeysEnabled(false);
	aBool5565 = true;
	aBool5552 = false;
	aLong5560 = Class250.method4604((byte) -115) * -10386718407137179L;
    }
    
    void method8218() {
	long l = Class250.method4604((byte) -72);
	long l_107_
	    = aLongArray5558[850712361 * Class690_Sub13.anInt10884 - 1 & 0x1f];
	long l_108_ = aLongArray5558[850712361 * Class690_Sub13.anInt10884];
	aLongArray5558[850712361 * Class690_Sub13.anInt10884] = l;
	Class690_Sub13.anInt10884
	    = (850712361 * Class690_Sub13.anInt10884 + 1 & 0x1f) * -1738558183;
	if (l_108_ != 0L && l > l_108_) {
	    int i = (int) (l - l_108_);
	    anInt5555 = (int) (l - l_107_) * 591308773;
	    anInt5554 = -281702665 * (((i >> 1) + 32000) / i);
	}
	if ((anInt5578 += -545995735) * -1070786535 - 1 > 50) {
	    anInt5578 -= -1529982974;
	    aBool5565 = true;
	    Class464.aCanvas5111.setSize(1771907305 * Class706_Sub4.anInt10994,
					 Class18.anInt205 * -1091172141);
	    Class464.aCanvas5111.setVisible(true);
	    if (null != Class452.aFrame4943 && null == Class29.aFrame266) {
		Insets insets = Class452.aFrame4943.getInsets();
		Class464.aCanvas5111.setLocation((-721302779 * anInt5562
						  + insets.left),
						 (insets.top
						  + anInt5563 * -350211099));
	    } else
		Class464.aCanvas5111.setLocation(anInt5562 * -721302779,
						 -350211099 * anInt5563);
	}
	method8166(1699139394);
    }
    
    public static final void method8219(int i, String string, Color color,
					Color color_109_, Color color_110_) {
	try {
	    Graphics graphics = Class464.aCanvas5111.getGraphics();
	    if (null == Class464.aFont5112)
		Class464.aFont5112 = new Font("Helvetica", 1, 13);
	    if (null == color)
		color = new Color(140, 17, 17);
	    if (null == color_109_)
		color_109_ = new Color(140, 17, 17);
	    if (color_110_ == null)
		color_110_ = new Color(255, 255, 255);
	    try {
		if (null == Class237.anImage2376)
		    Class237.anImage2376
			= Class464.aCanvas5111.createImage((1771907305
							    * (Class706_Sub4
							       .anInt10994)),
							   (Class18.anInt205
							    * -1091172141));
		Graphics graphics_111_ = Class237.anImage2376.getGraphics();
		graphics_111_.setColor(Color.black);
		graphics_111_.fillRect(0, 0,
				       1771907305 * Class706_Sub4.anInt10994,
				       Class18.anInt205 * -1091172141);
		int i_112_ = Class706_Sub4.anInt10994 * 1771907305 / 2 - 152;
		int i_113_ = Class18.anInt205 * -1091172141 / 2 - 18;
		graphics_111_.setColor(color_109_);
		graphics_111_.drawRect(i_112_, i_113_, 303, 33);
		graphics_111_.setColor(color);
		graphics_111_.fillRect(2 + i_112_, i_113_ + 2, i * 3, 30);
		graphics_111_.setColor(Color.black);
		graphics_111_.drawRect(i_112_ + 1, 1 + i_113_, 301, 31);
		graphics_111_.fillRect(i_112_ + 2 + 3 * i, i_113_ + 2,
				       300 - i * 3, 30);
		graphics_111_.setFont(Class464.aFont5112);
		graphics_111_.setColor(color_110_);
		graphics_111_.drawString(string,
					 (i_112_
					  + (304 - string.length() * 6) / 2),
					 22 + i_113_);
		if (aString5588 != null) {
		    graphics_111_.setFont(Class464.aFont5112);
		    graphics_111_.setColor(color_110_);
		    graphics_111_.drawString(aString5588,
					     ((1771907305
					       * Class706_Sub4.anInt10994 / 2)
					      - aString5588.length() * 6 / 2),
					     (Class18.anInt205 * -1091172141
					      / 2) - 26);
		}
		graphics.drawImage(Class237.anImage2376, 0, 0, null);
	    } catch (Exception exception) {
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, Class706_Sub4.anInt10994 * 1771907305,
				  -1091172141 * Class18.anInt205);
		int i_114_ = Class706_Sub4.anInt10994 * 1771907305 / 2 - 152;
		int i_115_ = Class18.anInt205 * -1091172141 / 2 - 18;
		graphics.setColor(color_109_);
		graphics.drawRect(i_114_, i_115_, 303, 33);
		graphics.setColor(color);
		graphics.fillRect(i_114_ + 2, 2 + i_115_, i * 3, 30);
		graphics.setColor(Color.black);
		graphics.drawRect(1 + i_114_, i_115_ + 1, 301, 31);
		graphics.fillRect(i_114_ + 2 + i * 3, i_115_ + 2, 300 - 3 * i,
				  30);
		graphics.setFont(Class464.aFont5112);
		graphics.setColor(color_110_);
		if (aString5588 != null) {
		    graphics.setFont(Class464.aFont5112);
		    graphics.setColor(color_110_);
		    graphics.drawString(aString5588,
					(Class706_Sub4.anInt10994 * 1771907305
					 / 2) - aString5588.length() * 6 / 2,
					(-1091172141 * Class18.anInt205 / 2
					 - 26));
		}
		graphics.drawString(string,
				    i_114_ + (304 - string.length() * 6) / 2,
				    i_115_ + 22);
	    }
	} catch (Exception exception) {
	    Class464.aCanvas5111.repaint();
	}
    }
    
    final void method8220(boolean bool) {
	synchronized (this) {
	    if (aBool5587)
		return;
	    aBool5587 = true;
	}
	try {
	    method8147((byte) 123);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    aClass38_5581.method945(-1829142575);
	    for (int i = 0; i < anInt5575 * -4375907; i++)
		Class314_Sub1.aClass38Array9995[i].method945(-2075986612);
	    aClass38_5582.method945(-1401900533);
	    aClass38_5580.method945(-1795261965);
	} catch (Exception exception) {
	    /* empty */
	}
	if (aBool5566) {
	    try {
		QueryPerformanceCounter.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	if (Class615.method10139(-1968953154))
	    Class112.method2018(-1327590673).method402((short) -12742);
	if (null != Class464.aCanvas5111) {
	    try {
		Class464.aCanvas5111.removeFocusListener(this);
		Class464.aCanvas5111.getParent().remove(Class464.aCanvas5111);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	if (null != Class452.aFrame4943) {
	    Class452.aFrame4943.setVisible(false);
	    Class452.aFrame4943.dispose();
	    Class452.aFrame4943 = null;
	}
    }
    
    public final void windowDeactivated(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void method8221(WindowEvent windowevent) {
	/* empty */
    }
    
    public static final int method8222() {
	return (int) (1000000000L / (435371756202260911L * aLong5553));
    }
    
    public static final int method8223() {
	return (int) (1000000000L / (435371756202260911L * aLong5553));
    }
    
    public static final void method8224() {
	aClass502_5556.method8281(-1862161781);
	for (int i = 0; i < 32; i++)
	    aLongArray5558[i] = 0L;
	for (int i = 0; i < 32; i++)
	    aLongArray5572[i] = 0L;
	anInt5571 = 0;
    }
    
    public static final int method8225() {
	return (int) (1000000000L / (435371756202260911L * aLong5553));
    }
    
    public final void windowIconified(WindowEvent windowevent) {
	/* empty */
    }
    
    static long method8226() {
	return aClass502_5556.method8297(-66470142);
    }
    
    public void method8227() {
	do {
	    try {
		try {
		    method8154(-561742196);
		} catch (ThreadDeath threaddeath) {
		    throw threaddeath;
		} catch (Throwable throwable) {
		    Class262.method4824(method8157((byte) -47), throwable,
					(byte) -30);
		    method8168("crash", -2017903746);
		    method8158(true, 1406270686);
		    break;
		}
		method8158(true, -234474723);
	    } catch (Exception object) {
		method8158(true, 293632318);
		throw object;
	    }
	} while (false);
    }
    
    public void method387() {
	if (!aBool5587)
	    aLong5586 = 0L;
    }
    
    static void method8228(Class534_Sub40 class534_sub40, int i) {
	if (aClass38_5580 != null) {
	    try {
		aClass38_5580.method947(0L);
		aClass38_5580.method951(class534_sub40.aByteArray10810, i, 24,
					-782803958);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public final void method8229(FocusEvent focusevent) {
	aBool5590 = false;
    }
    
    public void method383() {
	if (!aBool5587) {
	    aLong5586 = Class250.method4604((byte) -77) * 7393495441865868259L;
	    Class251.method4622(5000L);
	    method8158(false, 553136104);
	}
    }
    
    public void method390() {
	if (!aBool5587) {
	    aLong5586 = Class250.method4604((byte) -85) * 7393495441865868259L;
	    Class251.method4622(5000L);
	    method8158(false, -616242955);
	}
    }
    
    public void method391() {
	if (!aBool5587) {
	    aLong5586 = Class250.method4604((byte) -14) * 7393495441865868259L;
	    Class251.method4622(5000L);
	    method8158(false, -227803155);
	}
    }
    
    public void method392() {
	if (!aBool5587) {
	    aLong5586 = Class250.method4604((byte) -75) * 7393495441865868259L;
	    Class251.method4622(5000L);
	    method8158(false, 9892772);
	}
    }
    
    public final void method393(Graphics graphics) {
	paint(graphics);
    }
    
    public final void method384(Graphics graphics) {
	paint(graphics);
    }
    
    public final synchronized void method382(Graphics graphics) {
	if (!aBool5587) {
	    aBool5565 = true;
	    if ((Class250.method4604((byte) -27)
		 - 3099711367168821613L * aLong5560)
		> 1000L) {
		Rectangle rectangle = graphics.getClipBounds();
		if (null == rectangle
		    || (rectangle.width >= -166028671 * Class391.anInt4076
			&& rectangle.height >= 8272787 * anInt5561))
		    aBool5552 = true;
	    }
	}
    }
    
    public final synchronized void method395(Graphics graphics) {
	if (!aBool5587) {
	    aBool5565 = true;
	    if ((Class250.method4604((byte) -115)
		 - 3099711367168821613L * aLong5560)
		> 1000L) {
		Rectangle rectangle = graphics.getClipBounds();
		if (null == rectangle
		    || (rectangle.width >= -166028671 * Class391.anInt4076
			&& rectangle.height >= 8272787 * anInt5561))
		    aBool5552 = true;
	    }
	}
    }
    
    public final void method8230(FocusEvent focusevent) {
	aBool5590 = true;
	aBool5565 = true;
    }
    
    public void supplyApplet(Applet applet) {
	Class305.anApplet3271 = applet;
    }
    
    public final void method8231(FocusEvent focusevent) {
	aBool5590 = true;
	aBool5565 = true;
    }
    
    final boolean method8232() {
	String string
	    = Class305.anApplet3271.getDocumentBase().getHost().toLowerCase();
	if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
	    return true;
	if (string.equals("runescape.com")
	    || string.endsWith(".runescape.com"))
	    return true;
	if (string.equals("stellardawn.com")
	    || string.endsWith(".stellardawn.com"))
	    return true;
	if (string.endsWith("127.0.0.1"))
	    return true;
	for (/**/;
	     (string.length() > 0 && string.charAt(string.length() - 1) >= '0'
	      && string.charAt(string.length() - 1) <= '9');
	     string = string.substring(0, string.length() - 1)) {
	    /* empty */
	}
	if (string.endsWith("192.168.1."))
	    return true;
	method8168("invalidhost", -190109369);
	return false;
    }
    
    public final void method8233(FocusEvent focusevent) {
	aBool5590 = false;
    }
    
    final boolean method8234() {
	String string
	    = Class305.anApplet3271.getDocumentBase().getHost().toLowerCase();
	if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
	    return true;
	if (string.equals("runescape.com")
	    || string.endsWith(".runescape.com"))
	    return true;
	if (string.equals("stellardawn.com")
	    || string.endsWith(".stellardawn.com"))
	    return true;
	if (string.endsWith("127.0.0.1"))
	    return true;
	for (/**/;
	     (string.length() > 0 && string.charAt(string.length() - 1) >= '0'
	      && string.charAt(string.length() - 1) <= '9');
	     string = string.substring(0, string.length() - 1)) {
	    /* empty */
	}
	if (string.endsWith("192.168.1."))
	    return true;
	method8168("invalidhost", 26032012);
	return false;
    }
    
    public final void method8235(FocusEvent focusevent) {
	aBool5590 = false;
    }
    
    public final void method8236(WindowEvent windowevent) {
	/* empty */
    }
    
    void method8237(String string) {
	if (!aBool5574) {
	    aBool5574 = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class31.method887(Class305.anApplet3271, "loggedout",
				  126273939);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class305.anApplet3271.getAppletContext().showDocument
		    (new URL(Class305.anApplet3271.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws").toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public final void method8238(WindowEvent windowevent) {
	/* empty */
    }
    
    final boolean method8239() {
	String string
	    = Class305.anApplet3271.getDocumentBase().getHost().toLowerCase();
	if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
	    return true;
	if (string.equals("runescape.com")
	    || string.endsWith(".runescape.com"))
	    return true;
	if (string.equals("stellardawn.com")
	    || string.endsWith(".stellardawn.com"))
	    return true;
	if (string.endsWith("127.0.0.1"))
	    return true;
	for (/**/;
	     (string.length() > 0 && string.charAt(string.length() - 1) >= '0'
	      && string.charAt(string.length() - 1) <= '9');
	     string = string.substring(0, string.length() - 1)) {
	    /* empty */
	}
	if (string.endsWith("192.168.1."))
	    return true;
	method8168("invalidhost", 1337247814);
	return false;
    }
    
    void method8240(File file, File file_116_, int i) {
	try {
	    Class24 class24 = new Class24(Class195.aFile2159, "rw", 10000L);
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(500);
	    class534_sub40.method16506(3, 1558378156);
	    class534_sub40.method16506(file_116_ != null ? 1 : 0, 490204372);
	    class534_sub40.method16518(file.getPath(), -346226253);
	    if (null != file_116_)
		class534_sub40.method16518(file_116_.getPath(), 407271395);
	    class24.method844(class534_sub40.aByteArray10810, 0,
			      31645619 * class534_sub40.anInt10811, 454464553);
	    class24.method832(453396365);
	} catch (IOException ioexception) {
	    ioexception.printStackTrace();
	}
    }
    
    public final void method8241(WindowEvent windowevent) {
	/* empty */
    }
    
    synchronized void method8242(String string) {
	Class452.aFrame4943 = new Frame();
	Class452.aFrame4943.setTitle(string);
	Class452.aFrame4943.setResizable(true);
	Class452.aFrame4943.addWindowListener(this);
	Class452.aFrame4943.setBackground(Color.black);
	Class452.aFrame4943.setVisible(true);
	Class452.aFrame4943.toFront();
	Insets insets = Class452.aFrame4943.getInsets();
	Class452.aFrame4943.setSize((-166028671 * Class391.anInt4076
				     + insets.left + insets.right),
				    (8272787 * anInt5561 + insets.top
				     + insets.bottom));
    }
    
    public static Class24 method8243(String string, String string_117_,
				     boolean bool) {
	File file = new File(Class228.aFile2322,
			     new StringBuilder().append("preferences").append
				 (string).append
				 (".dat").toString());
	do {
	    if (file.exists()) {
		Class24 class24;
		try {
		    Class24 class24_118_ = new Class24(file, "rw", 10000L);
		    class24 = class24_118_;
		} catch (IOException ioexception) {
		    break;
		}
		return class24;
	    }
	} while (false);
	String string_119_ = "";
	if (-225897511 * Class208.anInt2241 == 33)
	    string_119_ = "_rc";
	else if (34 == Class208.anInt2241 * -225897511)
	    string_119_ = "_wip";
	File file_120_ = new File(Class534_Sub42_Sub2.aString11882,
				  new StringBuilder().append("jagex_").append
				      (string_117_).append
				      ("_preferences").append
				      (string).append
				      (string_119_).append
				      (".dat").toString());
	do {
	    if (!bool && file_120_.exists()) {
		Class24 class24;
		try {
		    Class24 class24_121_
			= new Class24(file_120_, "rw", 10000L);
		    class24 = class24_121_;
		} catch (IOException ioexception) {
		    break;
		}
		return class24;
	    }
	} while (false);
	Class24 class24;
	try {
	    Class24 class24_122_ = new Class24(file, "rw", 10000L);
	    class24 = class24_122_;
	} catch (IOException ioexception) {
	    throw new RuntimeException();
	}
	return class24;
    }
    
    public final void method8244(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void windowOpened(WindowEvent windowevent) {
	/* empty */
    }
    
    public void run() {
	do {
	    try {
		try {
		    method8154(-1995496142);
		} catch (ThreadDeath threaddeath) {
		    throw threaddeath;
		} catch (Throwable throwable) {
		    Class262.method4824(method8157((byte) 1), throwable,
					(byte) -45);
		    method8168("crash", 689382790);
		    method8158(true, 348950497);
		    break;
		}
		method8158(true, 19393424);
	    } catch (Exception object) {
		method8158(true, -1884012375);
		throw object;
	    }
	} while (false);
    }
    
    public final void method8245(WindowEvent windowevent) {
	/* empty */
    }
    
    public final void method8246(WindowEvent windowevent) {
	/* empty */
    }
    
    public abstract void method388();
    
    abstract void method8247();
    
    public static final int method8248() {
	return (int) (1000000000L / (435371756202260911L * aLong5553));
    }
    
    void method8249() {
	long l = Class250.method4604((byte) -116);
	long l_123_ = aLongArray5572[anInt5569 * -896611215];
	aLongArray5572[anInt5569 * -896611215] = l;
	anInt5569 = -1851034479 * (-896611215 * anInt5569 + 1 & 0x1f);
	if (0L != l_123_ && l <= l_123_) {
	    /* empty */
	}
	synchronized (this) {
	    Class534_Sub36.aBool10800 = aBool5590;
	}
	method8165(-1947863451);
    }
    
    static void method8250() {
	try {
	    File file
		= new File(Class534_Sub42_Sub2.aString11882, "random.dat");
	    if (file.exists())
		aClass38_5580
		    = new Class38(new Class24(file, "rw", 25L), 24, 0);
	    else {
	    while_168_:
		for (int i = 0; i < Class597.aStringArray7863.length; i++) {
		    for (int i_124_ = 0;
			 i_124_ < Class206.aStringArray2233.length; i_124_++) {
			File file_125_
			    = new File(new StringBuilder().append
					   (Class206.aStringArray2233[i_124_])
					   .append
					   (Class597.aStringArray7863[i])
					   .append
					   (File.separatorChar).append
					   ("random.dat").toString());
			if (file_125_.exists()) {
			    aClass38_5580 = new Class38(new Class24(file_125_,
								    "rw", 25L),
							24, 0);
			    break while_168_;
			}
		    }
		}
	    }
	    if (null == aClass38_5580) {
		RandomAccessFile randomaccessfile
		    = new RandomAccessFile(file, "rw");
		int i = randomaccessfile.read();
		randomaccessfile.seek(0L);
		randomaccessfile.write(i);
		randomaccessfile.seek(0L);
		randomaccessfile.close();
		aClass38_5580
		    = new Class38(new Class24(file, "rw", 25L), 24, 0);
	    }
	} catch (IOException ioexception) {
	    /* empty */
	}
    }
    
    void method8251(String string) {
	if (!aBool5574) {
	    aBool5574 = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class31.method887(Class305.anApplet3271, "loggedout",
				  828388356);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class305.anApplet3271.getAppletContext().showDocument
		    (new URL(Class305.anApplet3271.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws").toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    void method8252(String string) {
	if (!aBool5574) {
	    aBool5574 = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class31.method887(Class305.anApplet3271, "loggedout",
				  -1203402374);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class305.anApplet3271.getAppletContext().showDocument
		    (new URL(Class305.anApplet3271.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws").toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public final void method8253(FocusEvent focusevent) {
	aBool5590 = true;
	aBool5565 = true;
    }
    
    public final void method8254(WindowEvent windowevent) {
	/* empty */
    }
    
    public void method8255() throws Exception_Sub3 {
	if (!aBool5566) {
	    Class112.method2018(-1327590673).method400("jaclib", 9922409);
	    try {
		QueryPerformanceCounter.init();
	    } catch (Throwable throwable) {
		if (Class262.aString2801.startsWith("win"))
		    throw new Exception_Sub3(128, "jaclib");
	    }
	    aBool5566 = true;
	}
    }
    
    public void method8256() throws Exception_Sub3 {
	if (!aBool5566) {
	    Class112.method2018(-1327590673).method400("jaclib", -1534771893);
	    try {
		QueryPerformanceCounter.init();
	    } catch (Throwable throwable) {
		if (Class262.aString2801.startsWith("win"))
		    throw new Exception_Sub3(128, "jaclib");
	    }
	    aBool5566 = true;
	}
    }
    
    void method8257(String string, String string_126_) {
	if (!aBool5574) {
	    aBool5574 = true;
	    System.out.println(new StringBuilder().append("error_game_").append
				   (string).toString());
	    try {
		Class31.method887(Class305.anApplet3271, "loggedout",
				  672538514);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Class305.anApplet3271.getAppletContext().showDocument
		    (new URL(Class305.anApplet3271.getCodeBase(),
			     new StringBuilder().append("error_game_").append
				 (string).append
				 (".ws?").append
				 (string_126_).toString()),
		     "_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public static Class508 method8258() {
	return aClass508_5585;
    }
    
    static final void method8259(Class669 class669, int i) {
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = client.aClass214_11359.method4084(1887702907);
    }
    
    static final void method8260(Class669 class669, int i) {
	int i_127_ = (class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
	    = ((Class654_Sub1_Sub5_Sub1_Sub1)
	       class669.aClass654_Sub1_Sub5_Sub1_8604);
	int i_128_
	    = class654_sub1_sub5_sub1_sub1.method18835(i_127_, (byte) -34);
	int i_129_
	    = class654_sub1_sub5_sub1_sub1.method18837(i_127_, (byte) 3);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_128_;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_129_;
    }
    
    public static Class606_Sub1 method8261(int i) {
	if (Class5.anInt48 * -120407133 < Class5.aClass606_Sub1Array42.length)
	    return (Class5.aClass606_Sub1Array42
		    [(Class5.anInt48 += -1352314869) * -120407133 - 1]);
	return null;
    }
    
    public static Class243 method8262(int i, int[] is, Class243 class243,
				      boolean bool, byte i_130_) {
	if (!Class247.aClass472_2446.method7681(i, 1085660687))
	    return null;
	int i_131_ = Class247.aClass472_2446.method7726(i, (byte) 59);
	Class247[] class247s;
	if (i_131_ == 0)
	    class247s = new Class247[0];
	else if (null == class243)
	    class247s = new Class247[i_131_];
	else
	    class247s = class243.aClass247Array2412;
	if (null == class243)
	    class243 = new Class243(bool, class247s);
	else {
	    class243.aClass247Array2412 = class247s;
	    class243.aBool2413 = bool;
	}
	for (int i_132_ = 0; i_132_ < i_131_; i_132_++) {
	    if (null == class243.aClass247Array2412[i_132_]) {
		byte[] is_133_
		    = Class247.aClass472_2446.method7676(i, i_132_, is,
							 -1964965394);
		if (is_133_ != null) {
		    Class247 class247
			= class243.aClass247Array2412[i_132_] = new Class247();
		    class247.anInt2454 = -1610085259 * (i_132_ + (i << 16));
		    class247.method4517(new Class534_Sub40(is_133_),
					-1289051461);
		}
	    }
	}
	return class243;
    }
}
