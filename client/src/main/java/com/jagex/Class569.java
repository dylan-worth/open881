/* Class569 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class569
{
    Class367_Sub1 this$0;
    SourceDataLine aSourceDataLine7609;
    boolean aBool7610;
    int anInt7611;
    int anInt7612;
    int anInt7613;
    List aList7614;
    float aFloat7615;
    byte[] aByteArray7616;
    int anInt7617;
    byte[] aByteArray7618;
    int anInt7619;
    
    void method9575(Class565 class565) {
	aList7614.add(class565);
    }
    
    Class569(Class367_Sub1 class367_sub1, float f, int i) {
	this$0 = class367_sub1;
	anInt7611 = -141149584;
	anInt7617 = -859393982;
	aList7614 = new ArrayList();
	if (!aBool7610) {
	    aFloat7615 = f;
	    if (anInt7611 * -1827073001 > 16)
		throw new RuntimeException("");
	    try {
		AudioFormat audioformat
		    = new AudioFormat(aFloat7615, -1827073001 * anInt7611,
				      -828232735 * anInt7617, true, false);
		try {
		    DataLine.Info info
			= (new DataLine.Info
			   (javax.sound.sampled.SourceDataLine.class,
			    audioformat, i));
		    aSourceDataLine7609
			= (SourceDataLine) AudioSystem.getLine(info);
		} catch (IllegalArgumentException illegalargumentexception) {
		    return;
		}
		aSourceDataLine7609.open(audioformat, i);
		aSourceDataLine7609.start();
	    } catch (LineUnavailableException lineunavailableexception) {
		return;
	    }
	    aByteArray7618 = new byte[i];
	    aByteArray7616 = new byte[-1827073001 * anInt7611 / 8];
	    anInt7619 = 0;
	    aBool7610 = true;
	}
    }
    
    void method9576(short i) {
	anInt7613 = 0;
	method9577((byte) 46);
	int i_0_;
	for (/**/; 1338147443 * anInt7613 > 0;
	     anInt7613 -= i_0_ * 1937699515) {
	    i_0_ = anInt7613 * 1338147443;
	    if (i_0_ + anInt7619 * 2045773485 >= aByteArray7618.length)
		i_0_ = aByteArray7618.length - 2045773485 * anInt7619;
	    aSourceDataLine7609.write(aByteArray7618, anInt7619 * 2045773485,
				      i_0_);
	    for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
		aByteArray7618[i_1_ + anInt7619 * 2045773485] = (byte) 0;
	    anInt7619 += -635351771 * i_0_;
	    anInt7619
		= 2045773485 * anInt7619 % aByteArray7618.length * -635351771;
	}
    }
    
    void method9577(byte i) {
	synchronized (this) {
	    int i_2_ = 2147483647;
	    double d = (double) (-1827073001 * anInt7611 / 8
				 * (anInt7617 * -828232735));
	    boolean bool = false;
	    Iterator iterator = aList7614.iterator();
	    while (iterator.hasNext()) {
		Class565 class565 = (Class565) iterator.next();
		int i_3_ = (class565.aByteArray7572.length
			    - 1052763975 * class565.anInt7576);
		if (class565.aFloat7578 != aFloat7615) {
		    i_3_ *= aFloat7615 / class565.aFloat7578;
		    i_3_ = (int) (d * Math.ceil((double) i_3_ / d));
		}
		class565.anInt7577 = -785239911 * i_3_;
		if (i_3_ > 0 && i_3_ < i_2_) {
		    bool = true;
		    i_2_ = i_3_;
		}
	    }
	    if (i_2_ > anInt7612 * 1779292787)
		i_2_ = anInt7612 * 1779292787;
	    if (0 == i_2_ || false == bool) {
		/* empty */
	    } else {
		int i_4_ = -1827073001 * anInt7611 / 8;
		Iterator iterator_5_ = aList7614.iterator();
		while (iterator_5_.hasNext()) {
		    Class565 class565 = (Class565) iterator_5_.next();
		    if (-509533271 * class565.anInt7577 >= i_2_) {
			int i_6_ = 2045773485 * anInt7619;
			int i_7_ = 0;
			int i_8_ = class565.anInt7571 * -1888009577 / 8;
			double d_9_ = 0.0;
			int i_10_ = 0;
			double d_11_ = (double) aFloat7615;
			double d_12_ = (double) class565.aFloat7578;
			int i_13_ = -1790662003 * class565.anInt7579;
			for (/**/; (class565.anInt7577 * -509533271 > 0
				    && i_7_ < i_2_); i_7_ += i_8_) {
			    short i_14_ = 0;
			    short i_15_ = 0;
			    byte[] is = aByteArray7616;
			    for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
				is[i_16_] = aByteArray7618[i_16_ + i_6_];
				i_14_ |= (is[i_16_] & 0xff) << i_16_ * 8;
			    }
			    if (class565.aFloat7578 != aFloat7615) {
				byte[] is_17_ = class565.aByteArray7573;
				float f = (float) (d_12_ * (d_9_ / d_11_));
				float f_18_ = (float) Math.floor((double) f);
				short i_19_ = 0;
				short i_20_ = 0;
				int i_21_ = (int) Math.floor((double) f);
				int i_22_ = (int) Math.ceil((double) f);
				i_21_ = (i_21_ * (is_17_.length
						  * (-1273949407
						     * class565.anInt7580))
					 + i_10_ * is_17_.length);
				i_22_ = (i_10_ * is_17_.length
					 + (-1273949407 * class565.anInt7580
					    * is_17_.length * i_22_));
				i_21_ += i_13_;
				i_22_ += i_13_;
				i_21_ %= class565.aByteArray7572.length;
				i_22_ %= class565.aByteArray7572.length;
				for (int i_23_ = 0; i_23_ < is_17_.length;
				     i_23_++) {
				    is_17_[i_23_] = (class565.aByteArray7572
						     [i_21_ + i_23_]);
				    i_19_
					|= (is_17_[i_23_] & 0xff) << i_23_ * 8;
				}
				for (int i_24_ = 0; i_24_ < is_17_.length;
				     i_24_++) {
				    is_17_[i_24_] = (class565.aByteArray7572
						     [i_22_ + i_24_]);
				    i_20_
					|= (is_17_[i_24_] & 0xff) << i_24_ * 8;
				}
				float f_25_ = f - f_18_;
				if (f_25_ < 0.0F || f_25_ > 1.0F)
				    throw new RuntimeException("");
				float f_26_ = (float) (i_20_ - i_19_);
				i_15_ = (short) (int) ((float) i_19_
						       + f_26_ * f_25_);
				i_10_ = ++i_10_ % (-1273949407
						   * class565.anInt7580);
				if (0 == i_10_)
				    d_9_++;
			    } else {
				byte[] is_27_ = class565.aByteArray7573;
				for (int i_28_ = 0; i_28_ < is_27_.length;
				     i_28_++) {
				    is_27_[i_28_]
					= (class565.aByteArray7572
					   [(-1790662003 * class565.anInt7579
					     + i_28_)]);
				    i_15_
					|= (is_27_[i_28_] & 0xff) << 8 * i_28_;
				}
				class565.anInt7579 += 1731733573 * i_8_;
				Class565 class565_29_;
				(class565_29_ = class565).anInt7579
				    = (-1790662003 * class565_29_.anInt7579
				       % class565.aByteArray7572.length
				       * 1731733573);
				class565.anInt7576 += -1837919625 * i_8_;
			    }
			    i_15_ += i_14_;
			    if (i_15_ > 32767)
				i_15_ = (short) 32767;
			    if (i_15_ < -32768)
				i_15_ = (short) -32768;
			    aByteArray7618[i_6_] = (byte) i_15_;
			    aByteArray7618[i_6_ + 1] = (byte) (i_15_ >> 8);
			    i_6_ += i_4_;
			    i_6_ %= aByteArray7618.length;
			}
			if (class565.aFloat7578 != aFloat7615) {
			    double d_30_ = (double) i_2_ * (d_12_ / d_11_);
			    int i_31_ = (int) (d * Math.ceil(d_30_ / d));
			    class565.anInt7579 += i_31_ * 1731733573;
			    Class565 class565_32_;
			    (class565_32_ = class565).anInt7579
				= (1731733573
				   * (-1790662003 * class565_32_.anInt7579
				      % class565.aByteArray7572.length));
			    class565.anInt7576 += i_31_ * -1837919625;
			}
		    }
		}
		anInt7613 = 1937699515 * i_2_;
	    }
	}
    }
    
    void method9578(Class565 class565, byte i) {
	aList7614.add(class565);
    }
    
    void method9579() {
	anInt7613 = 0;
	method9577((byte) 30);
	int i;
	for (/**/; 1338147443 * anInt7613 > 0; anInt7613 -= i * 1937699515) {
	    i = anInt7613 * 1338147443;
	    if (i + anInt7619 * 2045773485 >= aByteArray7618.length)
		i = aByteArray7618.length - 2045773485 * anInt7619;
	    aSourceDataLine7609.write(aByteArray7618, anInt7619 * 2045773485,
				      i);
	    for (int i_33_ = 0; i_33_ < i; i_33_++)
		aByteArray7618[i_33_ + anInt7619 * 2045773485] = (byte) 0;
	    anInt7619 += -635351771 * i;
	    anInt7619
		= 2045773485 * anInt7619 % aByteArray7618.length * -635351771;
	}
    }
    
    void method9580() {
	anInt7613 = 0;
	method9577((byte) 73);
	int i;
	for (/**/; 1338147443 * anInt7613 > 0; anInt7613 -= i * 1937699515) {
	    i = anInt7613 * 1338147443;
	    if (i + anInt7619 * 2045773485 >= aByteArray7618.length)
		i = aByteArray7618.length - 2045773485 * anInt7619;
	    aSourceDataLine7609.write(aByteArray7618, anInt7619 * 2045773485,
				      i);
	    for (int i_34_ = 0; i_34_ < i; i_34_++)
		aByteArray7618[i_34_ + anInt7619 * 2045773485] = (byte) 0;
	    anInt7619 += -635351771 * i;
	    anInt7619
		= 2045773485 * anInt7619 % aByteArray7618.length * -635351771;
	}
    }
    
    void method9581() {
	if (aBool7610) {
	    if (aSourceDataLine7609 != null)
		anInt7612 = aSourceDataLine7609.available() * -464037189;
	}
    }
    
    void method9582(int i) {
	if (aBool7610) {
	    if (aSourceDataLine7609 != null)
		anInt7612 = aSourceDataLine7609.available() * -464037189;
	}
    }
    
    void method9583() {
	if (aBool7610) {
	    if (aSourceDataLine7609 != null)
		anInt7612 = aSourceDataLine7609.available() * -464037189;
	}
    }
    
    void method9584() {
	if (aBool7610) {
	    if (aSourceDataLine7609 != null)
		anInt7612 = aSourceDataLine7609.available() * -464037189;
	}
    }
    
    void method9585() {
	if (aBool7610) {
	    if (aSourceDataLine7609 != null)
		anInt7612 = aSourceDataLine7609.available() * -464037189;
	}
    }
    
    void method9586() {
	anInt7613 = 0;
	method9577((byte) 10);
	int i;
	for (/**/; 1338147443 * anInt7613 > 0; anInt7613 -= i * 1937699515) {
	    i = anInt7613 * 1338147443;
	    if (i + anInt7619 * 2045773485 >= aByteArray7618.length)
		i = aByteArray7618.length - 2045773485 * anInt7619;
	    aSourceDataLine7609.write(aByteArray7618, anInt7619 * 2045773485,
				      i);
	    for (int i_35_ = 0; i_35_ < i; i_35_++)
		aByteArray7618[i_35_ + anInt7619 * 2045773485] = (byte) 0;
	    anInt7619 += -635351771 * i;
	    anInt7619
		= 2045773485 * anInt7619 % aByteArray7618.length * -635351771;
	}
    }
    
    void method9587(Class565 class565, short i) {
	aList7614.remove(class565);
    }
    
    void method9588() {
	anInt7613 = 0;
	method9577((byte) 35);
	int i;
	for (/**/; 1338147443 * anInt7613 > 0; anInt7613 -= i * 1937699515) {
	    i = anInt7613 * 1338147443;
	    if (i + anInt7619 * 2045773485 >= aByteArray7618.length)
		i = aByteArray7618.length - 2045773485 * anInt7619;
	    aSourceDataLine7609.write(aByteArray7618, anInt7619 * 2045773485,
				      i);
	    for (int i_36_ = 0; i_36_ < i; i_36_++)
		aByteArray7618[i_36_ + anInt7619 * 2045773485] = (byte) 0;
	    anInt7619 += -635351771 * i;
	    anInt7619
		= 2045773485 * anInt7619 % aByteArray7618.length * -635351771;
	}
    }
    
    void method9589() {
	if (aBool7610) {
	    if (aSourceDataLine7609 != null)
		anInt7612 = aSourceDataLine7609.available() * -464037189;
	}
    }
    
    void method9590() {
	synchronized (this) {
	    int i = 2147483647;
	    double d = (double) (-1827073001 * anInt7611 / 8
				 * (anInt7617 * -828232735));
	    boolean bool = false;
	    Iterator iterator = aList7614.iterator();
	    while (iterator.hasNext()) {
		Class565 class565 = (Class565) iterator.next();
		int i_37_ = (class565.aByteArray7572.length
			     - 1052763975 * class565.anInt7576);
		if (class565.aFloat7578 != aFloat7615) {
		    i_37_ *= aFloat7615 / class565.aFloat7578;
		    i_37_ = (int) (d * Math.ceil((double) i_37_ / d));
		}
		class565.anInt7577 = -785239911 * i_37_;
		if (i_37_ > 0 && i_37_ < i) {
		    bool = true;
		    i = i_37_;
		}
	    }
	    if (i > anInt7612 * 1779292787)
		i = anInt7612 * 1779292787;
	    if (0 == i || false == bool) {
		/* empty */
	    } else {
		int i_38_ = -1827073001 * anInt7611 / 8;
		Iterator iterator_39_ = aList7614.iterator();
		while (iterator_39_.hasNext()) {
		    Class565 class565 = (Class565) iterator_39_.next();
		    if (-509533271 * class565.anInt7577 >= i) {
			int i_40_ = 2045773485 * anInt7619;
			int i_41_ = 0;
			int i_42_ = class565.anInt7571 * -1888009577 / 8;
			double d_43_ = 0.0;
			int i_44_ = 0;
			double d_45_ = (double) aFloat7615;
			double d_46_ = (double) class565.aFloat7578;
			int i_47_ = -1790662003 * class565.anInt7579;
			for (/**/;
			     class565.anInt7577 * -509533271 > 0 && i_41_ < i;
			     i_41_ += i_42_) {
			    short i_48_ = 0;
			    short i_49_ = 0;
			    byte[] is = aByteArray7616;
			    for (int i_50_ = 0; i_50_ < is.length; i_50_++) {
				is[i_50_] = aByteArray7618[i_50_ + i_40_];
				i_48_ |= (is[i_50_] & 0xff) << i_50_ * 8;
			    }
			    if (class565.aFloat7578 != aFloat7615) {
				byte[] is_51_ = class565.aByteArray7573;
				float f = (float) (d_46_ * (d_43_ / d_45_));
				float f_52_ = (float) Math.floor((double) f);
				short i_53_ = 0;
				short i_54_ = 0;
				int i_55_ = (int) Math.floor((double) f);
				int i_56_ = (int) Math.ceil((double) f);
				i_55_ = (i_55_ * (is_51_.length
						  * (-1273949407
						     * class565.anInt7580))
					 + i_44_ * is_51_.length);
				i_56_ = (i_44_ * is_51_.length
					 + (-1273949407 * class565.anInt7580
					    * is_51_.length * i_56_));
				i_55_ += i_47_;
				i_56_ += i_47_;
				i_55_ %= class565.aByteArray7572.length;
				i_56_ %= class565.aByteArray7572.length;
				for (int i_57_ = 0; i_57_ < is_51_.length;
				     i_57_++) {
				    is_51_[i_57_] = (class565.aByteArray7572
						     [i_55_ + i_57_]);
				    i_53_
					|= (is_51_[i_57_] & 0xff) << i_57_ * 8;
				}
				for (int i_58_ = 0; i_58_ < is_51_.length;
				     i_58_++) {
				    is_51_[i_58_] = (class565.aByteArray7572
						     [i_56_ + i_58_]);
				    i_54_
					|= (is_51_[i_58_] & 0xff) << i_58_ * 8;
				}
				float f_59_ = f - f_52_;
				if (f_59_ < 0.0F || f_59_ > 1.0F)
				    throw new RuntimeException("");
				float f_60_ = (float) (i_54_ - i_53_);
				i_49_ = (short) (int) ((float) i_53_
						       + f_60_ * f_59_);
				i_44_ = ++i_44_ % (-1273949407
						   * class565.anInt7580);
				if (0 == i_44_)
				    d_43_++;
			    } else {
				byte[] is_61_ = class565.aByteArray7573;
				for (int i_62_ = 0; i_62_ < is_61_.length;
				     i_62_++) {
				    is_61_[i_62_]
					= (class565.aByteArray7572
					   [(-1790662003 * class565.anInt7579
					     + i_62_)]);
				    i_49_
					|= (is_61_[i_62_] & 0xff) << 8 * i_62_;
				}
				class565.anInt7579 += 1731733573 * i_42_;
				Class565 class565_63_;
				(class565_63_ = class565).anInt7579
				    = (-1790662003 * class565_63_.anInt7579
				       % class565.aByteArray7572.length
				       * 1731733573);
				class565.anInt7576 += -1837919625 * i_42_;
			    }
			    i_49_ += i_48_;
			    if (i_49_ > 32767)
				i_49_ = (short) 32767;
			    if (i_49_ < -32768)
				i_49_ = (short) -32768;
			    aByteArray7618[i_40_] = (byte) i_49_;
			    aByteArray7618[i_40_ + 1] = (byte) (i_49_ >> 8);
			    i_40_ += i_38_;
			    i_40_ %= aByteArray7618.length;
			}
			if (class565.aFloat7578 != aFloat7615) {
			    double d_64_ = (double) i * (d_46_ / d_45_);
			    int i_65_ = (int) (d * Math.ceil(d_64_ / d));
			    class565.anInt7579 += i_65_ * 1731733573;
			    Class565 class565_66_;
			    (class565_66_ = class565).anInt7579
				= (1731733573
				   * (-1790662003 * class565_66_.anInt7579
				      % class565.aByteArray7572.length));
			    class565.anInt7576 += i_65_ * -1837919625;
			}
		    }
		}
		anInt7613 = 1937699515 * i;
	    }
	}
    }
    
    void method9591() {
	if (aBool7610) {
	    if (aSourceDataLine7609 != null)
		anInt7612 = aSourceDataLine7609.available() * -464037189;
	}
    }
    
    void method9592(Class565 class565) {
	aList7614.add(class565);
    }
    
    void method9593(Class565 class565) {
	aList7614.remove(class565);
    }
    
    static final void method9594(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class534_Sub20.method16195(class247, class243, false, 0, class669,
				   284320681);
    }
    
    static final void method9595(Class669 class669, int i) {
	int i_67_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_67_, 40856218);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -742015869 * class247.anInt2472;
    }
    
    public static void method9596(int i, int i_68_) {
	Class185.method3694(new Class587(i), -1600474947);
    }
    
    public static void method9597(Class632 class632, byte i) {
	Class67.anInt715 = -5766567 * class632.anInt8241;
	Class67.anInt716 = class632.anInt8250 * -501365457;
	Class67.anInt717 = -2139802421 * class632.anInt8263;
    }
    
    public static void method9598(int i) {
	Class625.aClass9_8155 = new Class9(8);
	Class625.anInt8151 = 0;
	Iterator iterator = Class625.aList8154.iterator();
	while (iterator.hasNext()) {
	    Class629 class629 = (Class629) iterator.next();
	    class629.method10388();
	}
    }
}
