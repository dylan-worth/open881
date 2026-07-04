/* Class389 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class389 implements Interface47
{
    public int anInt4059;
    
    Class389(int i) {
	anInt4059 = i * 1808171191;
    }
    
    public Class397 method349() {
	return Class397.aClass397_4115;
    }
    
    public Class397 method348(int i) {
	return Class397.aClass397_4115;
    }
    
    public Class397 method350() {
	return Class397.aClass397_4115;
    }
    
    public Class397 method351() {
	return Class397.aClass397_4115;
    }
    
    static final void method6530(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class332.method5861(class247, class243, class669, (byte) 40);
    }
    
    public static void method6531(Class534_Sub40 class534_sub40, int i,
				  short i_0_) {
	Class534_Sub30 class534_sub30 = new Class534_Sub30();
	class534_sub30.anInt10657
	    = class534_sub40.method16527(73285330) * 420604151;
	class534_sub30.anInt10658
	    = class534_sub40.method16533(-258848859) * -1554062617;
	class534_sub30.anIntArray10659
	    = new int[1681479879 * class534_sub30.anInt10657];
	class534_sub30.anIntArray10660
	    = new int[1681479879 * class534_sub30.anInt10657];
	class534_sub30.aFieldArray10661
	    = new Field[class534_sub30.anInt10657 * 1681479879];
	class534_sub30.anIntArray10662
	    = new int[class534_sub30.anInt10657 * 1681479879];
	class534_sub30.aMethodArray10663
	    = new Method[1681479879 * class534_sub30.anInt10657];
	class534_sub30.aByteArrayArrayArray10664
	    = new byte[1681479879 * class534_sub30.anInt10657][][];
	for (int i_1_ = 0; i_1_ < 1681479879 * class534_sub30.anInt10657;
	     i_1_++) {
	    try {
		int i_2_ = class534_sub40.method16527(-527462467);
		if (i_2_ == 0 || 1 == i_2_ || 2 == i_2_) {
		    String string = class534_sub40.method16541((byte) -30);
		    String string_3_ = class534_sub40.method16541((byte) -9);
		    int i_4_ = 0;
		    if (i_2_ == 1)
			i_4_ = class534_sub40.method16533(-258848859);
		    class534_sub30.anIntArray10659[i_1_] = i_2_;
		    class534_sub30.anIntArray10662[i_1_] = i_4_;
		    if (Class18.method794(string, 1937785561).getClassLoader()
			== null)
			throw new SecurityException();
		    class534_sub30.aFieldArray10661[i_1_]
			= Class18.method794(string, 564632049)
			      .getDeclaredField(string_3_);
		} else if (3 == i_2_ || 4 == i_2_) {
		    String string = class534_sub40.method16541((byte) -66);
		    String string_5_ = class534_sub40.method16541((byte) -29);
		    int i_6_ = class534_sub40.method16527(1017341359);
		    String[] strings = new String[i_6_];
		    for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
			strings[i_7_] = class534_sub40.method16541((byte) -48);
		    String string_8_ = class534_sub40.method16541((byte) -55);
		    byte[][] is = new byte[i_6_][];
		    if (i_2_ == 3) {
			for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
			    int i_10_ = class534_sub40.method16533(-258848859);
			    is[i_9_] = new byte[i_10_];
			    class534_sub40.method16735(is[i_9_], 0, i_10_,
						       (short) -3818);
			}
		    }
		    class534_sub30.anIntArray10659[i_1_] = i_2_;
		    Class[] var_classes = new Class[i_6_];
		    for (int i_11_ = 0; i_11_ < i_6_; i_11_++)
			var_classes[i_11_]
			    = Class18.method794(strings[i_11_], -279271220);
		    Class var_class = Class18.method794(string_8_, -516430270);
		    if (Class18.method794(string, 1373194613).getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods = Class18.method794
					   (string, 1522615482)
					   .getDeclaredMethods();
		    Method[] methods_12_ = methods;
		    for (int i_13_ = 0; i_13_ < methods_12_.length; i_13_++) {
			Method method = methods_12_[i_13_];
			if (method.getName().equals(string_5_)) {
			    Class[] var_classes_14_
				= method.getParameterTypes();
			    if (var_classes.length == var_classes_14_.length) {
				boolean bool = true;
				for (int i_15_ = 0; i_15_ < var_classes.length;
				     i_15_++) {
				    if (var_classes_14_[i_15_]
					!= var_classes[i_15_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    class534_sub30.aMethodArray10663[i_1_]
					= method;
			    }
			}
		    }
		    class534_sub30.aByteArrayArrayArray10664[i_1_] = is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		class534_sub30.anIntArray10660[i_1_] = -1;
	    } catch (SecurityException securityexception) {
		class534_sub30.anIntArray10660[i_1_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		class534_sub30.anIntArray10660[i_1_] = -3;
	    } catch (Exception exception) {
		class534_sub30.anIntArray10660[i_1_] = -4;
	    } catch (Throwable throwable) {
		class534_sub30.anIntArray10660[i_1_] = -5;
	    }
	}
	Class86.aClass700_846.method14131(class534_sub30, (short) 789);
    }
    
    static final void method6532(Class669 class669, int i) {
	long l = (class669.aLongArray8587
		  [(class669.anInt8596 -= 1091885681) * 1572578961]);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = l == -1L ? "" : Long.toString(l, 36).toUpperCase();
    }
    
    static final void method6533(Class669 class669, int i) {
	int i_16_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (((Class15)
		Class531.aClass44_Sub7_7135.method91(i_16_, -481996494))
	       .aBool106) ? 1 : 0;
    }
    
    static void method6534(Class669 class669, short i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class568.method9568(2088438307);
    }
}
