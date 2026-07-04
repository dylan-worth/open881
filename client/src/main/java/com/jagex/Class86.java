/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class86
{
    static Class700 aClass700_846 = new Class700();
    
    public static void method1683(Class534_Sub40_Sub1 class534_sub40_sub1) {
	Class534_Sub30 class534_sub30
	    = (Class534_Sub30) aClass700_846.method14135((byte) -1);
	if (null != class534_sub30) {
	    int i = class534_sub40_sub1.anInt10811 * 31645619;
	    class534_sub40_sub1.method16510((class534_sub30.anInt10658
					     * -961081129),
					    -751852033);
	    for (int i_0_ = 0; i_0_ < 1681479879 * class534_sub30.anInt10657;
		 i_0_++) {
		if (class534_sub30.anIntArray10660[i_0_] != 0)
		    class534_sub40_sub1.method16506((class534_sub30
						     .anIntArray10660[i_0_]),
						    1960638336);
		else {
		    try {
			int i_1_ = class534_sub30.anIntArray10659[i_0_];
			if (0 == i_1_) {
			    Field field
				= class534_sub30.aFieldArray10661[i_0_];
			    int i_2_ = field.getInt(null);
			    class534_sub40_sub1.method16506(0, 1131089100);
			    class534_sub40_sub1.method16510(i_2_, -1163183807);
			} else if (i_1_ == 1) {
			    Field field
				= class534_sub30.aFieldArray10661[i_0_];
			    field.setInt(null,
					 class534_sub30.anIntArray10662[i_0_]);
			    class534_sub40_sub1.method16506(0, 2128319207);
			} else if (i_1_ == 2) {
			    Field field
				= class534_sub30.aFieldArray10661[i_0_];
			    int i_3_ = field.getModifiers();
			    class534_sub40_sub1.method16506(0, 1792132376);
			    class534_sub40_sub1.method16510(i_3_, -1098678277);
			}
			if (3 == i_1_) {
			    Method method
				= class534_sub30.aMethodArray10663[i_0_];
			    byte[][] is = (class534_sub30
					   .aByteArrayArrayArray10664[i_0_]);
			    Object[] objects = new Object[is.length];
			    for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
				ObjectInputStream objectinputstream
				    = (new ObjectInputStream
				       (new ByteArrayInputStream(is[i_4_])));
				objects[i_4_] = objectinputstream.readObject();
			    }
			    Object object = method.invoke(null, objects);
			    if (null == object)
				class534_sub40_sub1.method16506(0, 784844621);
			    else if (object instanceof Number) {
				class534_sub40_sub1.method16506(1, 1593959167);
				class534_sub40_sub1.method16505
				    (((Number) object).longValue());
			    } else if (object instanceof String) {
				class534_sub40_sub1.method16506(2, 1644629587);
				class534_sub40_sub1
				    .method16713((String) object, 992275491);
			    } else
				class534_sub40_sub1.method16506(4, 417309600);
			} else if (4 == i_1_) {
			    Method method
				= class534_sub30.aMethodArray10663[i_0_];
			    int i_5_ = method.getModifiers();
			    class534_sub40_sub1.method16506(0, 1592352182);
			    class534_sub40_sub1.method16510(i_5_, -2044081551);
			}
		    } catch (ClassNotFoundException classnotfoundexception) {
			class534_sub40_sub1.method16506(-10, 972603498);
		    } catch (InvalidClassException invalidclassexception) {
			class534_sub40_sub1.method16506(-11, 2052798486);
		    } catch (StreamCorruptedException streamcorruptedexception) {
			class534_sub40_sub1.method16506(-12, 320809926);
		    } catch (OptionalDataException optionaldataexception) {
			class534_sub40_sub1.method16506(-13, 2032567888);
		    } catch (IllegalAccessException illegalaccessexception) {
			class534_sub40_sub1.method16506(-14, 906400900);
		    } catch (IllegalArgumentException illegalargumentexception) {
			class534_sub40_sub1.method16506(-15, 2021863715);
		    } catch (InvocationTargetException invocationtargetexception) {
			class534_sub40_sub1.method16506(-16, 1003776327);
		    } catch (SecurityException securityexception) {
			class534_sub40_sub1.method16506(-17, 1498070636);
		    } catch (IOException ioexception) {
			class534_sub40_sub1.method16506(-18, 1792049629);
		    } catch (NullPointerException nullpointerexception) {
			class534_sub40_sub1.method16506(-19, 1649092460);
		    } catch (Exception exception) {
			class534_sub40_sub1.method16506(-20, 2023625512);
		    } catch (Throwable throwable) {
			class534_sub40_sub1.method16506(-21, 1667088595);
		    }
		}
	    }
	    class534_sub40_sub1.method16557(i, -1231017679);
	    class534_sub30.method8892((byte) 1);
	}
    }
    
    public static void method1684(Class534_Sub40 class534_sub40, int i) {
	Class534_Sub30 class534_sub30 = new Class534_Sub30();
	class534_sub30.anInt10657
	    = class534_sub40.method16527(1640355909) * 420604151;
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
	for (int i_6_ = 0; i_6_ < 1681479879 * class534_sub30.anInt10657;
	     i_6_++) {
	    try {
		int i_7_ = class534_sub40.method16527(-1441952738);
		if (i_7_ == 0 || 1 == i_7_ || 2 == i_7_) {
		    String string = class534_sub40.method16541((byte) -28);
		    String string_8_ = class534_sub40.method16541((byte) -65);
		    int i_9_ = 0;
		    if (i_7_ == 1)
			i_9_ = class534_sub40.method16533(-258848859);
		    class534_sub30.anIntArray10659[i_6_] = i_7_;
		    class534_sub30.anIntArray10662[i_6_] = i_9_;
		    if (Class18.method794(string, 2083132460).getClassLoader()
			== null)
			throw new SecurityException();
		    class534_sub30.aFieldArray10661[i_6_]
			= Class18.method794(string, -817510089)
			      .getDeclaredField(string_8_);
		} else if (3 == i_7_ || 4 == i_7_) {
		    String string = class534_sub40.method16541((byte) -78);
		    String string_10_ = class534_sub40.method16541((byte) -47);
		    int i_11_ = class534_sub40.method16527(-1154400005);
		    String[] strings = new String[i_11_];
		    for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
			strings[i_12_]
			    = class534_sub40.method16541((byte) -40);
		    String string_13_ = class534_sub40.method16541((byte) -75);
		    byte[][] is = new byte[i_11_][];
		    if (i_7_ == 3) {
			for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
			    int i_15_ = class534_sub40.method16533(-258848859);
			    is[i_14_] = new byte[i_15_];
			    class534_sub40.method16735(is[i_14_], 0, i_15_,
						       (short) -12577);
			}
		    }
		    class534_sub30.anIntArray10659[i_6_] = i_7_;
		    Class[] var_classes = new Class[i_11_];
		    for (int i_16_ = 0; i_16_ < i_11_; i_16_++)
			var_classes[i_16_]
			    = Class18.method794(strings[i_16_], 1337917231);
		    Class var_class = Class18.method794(string_13_, 496406238);
		    if (Class18.method794(string, -1478753628).getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods = Class18.method794
					   (string, 1519625490)
					   .getDeclaredMethods();
		    Method[] methods_17_ = methods;
		    for (int i_18_ = 0; i_18_ < methods_17_.length; i_18_++) {
			Method method = methods_17_[i_18_];
			if (method.getName().equals(string_10_)) {
			    Class[] var_classes_19_
				= method.getParameterTypes();
			    if (var_classes.length == var_classes_19_.length) {
				boolean bool = true;
				for (int i_20_ = 0; i_20_ < var_classes.length;
				     i_20_++) {
				    if (var_classes_19_[i_20_]
					!= var_classes[i_20_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    class534_sub30.aMethodArray10663[i_6_]
					= method;
			    }
			}
		    }
		    class534_sub30.aByteArrayArrayArray10664[i_6_] = is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		class534_sub30.anIntArray10660[i_6_] = -1;
	    } catch (SecurityException securityexception) {
		class534_sub30.anIntArray10660[i_6_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		class534_sub30.anIntArray10660[i_6_] = -3;
	    } catch (Exception exception) {
		class534_sub30.anIntArray10660[i_6_] = -4;
	    } catch (Throwable throwable) {
		class534_sub30.anIntArray10660[i_6_] = -5;
	    }
	}
	aClass700_846.method14131(class534_sub30, (short) 789);
    }
    
    public static void method1685() {
	aClass700_846 = new Class700();
    }
    
    public static void method1686(Class534_Sub40 class534_sub40, int i) {
	Class534_Sub30 class534_sub30 = new Class534_Sub30();
	class534_sub30.anInt10657
	    = class534_sub40.method16527(1824231423) * 420604151;
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
	for (int i_21_ = 0; i_21_ < 1681479879 * class534_sub30.anInt10657;
	     i_21_++) {
	    try {
		int i_22_ = class534_sub40.method16527(1294811353);
		if (i_22_ == 0 || 1 == i_22_ || 2 == i_22_) {
		    String string = class534_sub40.method16541((byte) -74);
		    String string_23_ = class534_sub40.method16541((byte) -79);
		    int i_24_ = 0;
		    if (i_22_ == 1)
			i_24_ = class534_sub40.method16533(-258848859);
		    class534_sub30.anIntArray10659[i_21_] = i_22_;
		    class534_sub30.anIntArray10662[i_21_] = i_24_;
		    if (Class18.method794(string, -1579912587).getClassLoader()
			== null)
			throw new SecurityException();
		    class534_sub30.aFieldArray10661[i_21_]
			= Class18.method794(string, -1154504585)
			      .getDeclaredField(string_23_);
		} else if (3 == i_22_ || 4 == i_22_) {
		    String string = class534_sub40.method16541((byte) -46);
		    String string_25_ = class534_sub40.method16541((byte) -85);
		    int i_26_ = class534_sub40.method16527(-109052928);
		    String[] strings = new String[i_26_];
		    for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
			strings[i_27_]
			    = class534_sub40.method16541((byte) -126);
		    String string_28_ = class534_sub40.method16541((byte) -42);
		    byte[][] is = new byte[i_26_][];
		    if (i_22_ == 3) {
			for (int i_29_ = 0; i_29_ < i_26_; i_29_++) {
			    int i_30_ = class534_sub40.method16533(-258848859);
			    is[i_29_] = new byte[i_30_];
			    class534_sub40.method16735(is[i_29_], 0, i_30_,
						       (short) -25803);
			}
		    }
		    class534_sub30.anIntArray10659[i_21_] = i_22_;
		    Class[] var_classes = new Class[i_26_];
		    for (int i_31_ = 0; i_31_ < i_26_; i_31_++)
			var_classes[i_31_]
			    = Class18.method794(strings[i_31_], 1526133747);
		    Class var_class
			= Class18.method794(string_28_, -847279587);
		    if (Class18.method794(string, 601034530).getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods = Class18.method794
					   (string, -168801965)
					   .getDeclaredMethods();
		    Method[] methods_32_ = methods;
		    for (int i_33_ = 0; i_33_ < methods_32_.length; i_33_++) {
			Method method = methods_32_[i_33_];
			if (method.getName().equals(string_25_)) {
			    Class[] var_classes_34_
				= method.getParameterTypes();
			    if (var_classes.length == var_classes_34_.length) {
				boolean bool = true;
				for (int i_35_ = 0; i_35_ < var_classes.length;
				     i_35_++) {
				    if (var_classes_34_[i_35_]
					!= var_classes[i_35_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    class534_sub30.aMethodArray10663[i_21_]
					= method;
			    }
			}
		    }
		    class534_sub30.aByteArrayArrayArray10664[i_21_] = is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		class534_sub30.anIntArray10660[i_21_] = -1;
	    } catch (SecurityException securityexception) {
		class534_sub30.anIntArray10660[i_21_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		class534_sub30.anIntArray10660[i_21_] = -3;
	    } catch (Exception exception) {
		class534_sub30.anIntArray10660[i_21_] = -4;
	    } catch (Throwable throwable) {
		class534_sub30.anIntArray10660[i_21_] = -5;
	    }
	}
	aClass700_846.method14131(class534_sub30, (short) 789);
    }
    
    public static void method1687() {
	aClass700_846 = new Class700();
    }
    
    public static boolean method1688() {
	Class534_Sub30 class534_sub30
	    = (Class534_Sub30) aClass700_846.method14135((byte) -1);
	if (class534_sub30 == null)
	    return false;
	return true;
    }
    
    public static boolean method1689() {
	Class534_Sub30 class534_sub30
	    = (Class534_Sub30) aClass700_846.method14135((byte) -1);
	if (class534_sub30 == null)
	    return false;
	return true;
    }
    
    public static boolean method1690() {
	Class534_Sub30 class534_sub30
	    = (Class534_Sub30) aClass700_846.method14135((byte) -1);
	if (class534_sub30 == null)
	    return false;
	return true;
    }
    
    public static boolean method1691() {
	Class534_Sub30 class534_sub30
	    = (Class534_Sub30) aClass700_846.method14135((byte) -1);
	if (class534_sub30 == null)
	    return false;
	return true;
    }
    
    public static void method1692(Class534_Sub40 class534_sub40, int i) {
	Class534_Sub30 class534_sub30 = new Class534_Sub30();
	class534_sub30.anInt10657
	    = class534_sub40.method16527(1638627157) * 420604151;
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
	for (int i_36_ = 0; i_36_ < 1681479879 * class534_sub30.anInt10657;
	     i_36_++) {
	    try {
		int i_37_ = class534_sub40.method16527(-937998197);
		if (i_37_ == 0 || 1 == i_37_ || 2 == i_37_) {
		    String string = class534_sub40.method16541((byte) -52);
		    String string_38_
			= class534_sub40.method16541((byte) -112);
		    int i_39_ = 0;
		    if (i_37_ == 1)
			i_39_ = class534_sub40.method16533(-258848859);
		    class534_sub30.anIntArray10659[i_36_] = i_37_;
		    class534_sub30.anIntArray10662[i_36_] = i_39_;
		    if (Class18.method794(string, -1333083151).getClassLoader()
			== null)
			throw new SecurityException();
		    class534_sub30.aFieldArray10661[i_36_]
			= Class18.method794(string, 1060642174)
			      .getDeclaredField(string_38_);
		} else if (3 == i_37_ || 4 == i_37_) {
		    String string = class534_sub40.method16541((byte) -16);
		    String string_40_ = class534_sub40.method16541((byte) -11);
		    int i_41_ = class534_sub40.method16527(1927365805);
		    String[] strings = new String[i_41_];
		    for (int i_42_ = 0; i_42_ < i_41_; i_42_++)
			strings[i_42_]
			    = class534_sub40.method16541((byte) -20);
		    String string_43_ = class534_sub40.method16541((byte) -48);
		    byte[][] is = new byte[i_41_][];
		    if (i_37_ == 3) {
			for (int i_44_ = 0; i_44_ < i_41_; i_44_++) {
			    int i_45_ = class534_sub40.method16533(-258848859);
			    is[i_44_] = new byte[i_45_];
			    class534_sub40.method16735(is[i_44_], 0, i_45_,
						       (short) -1147);
			}
		    }
		    class534_sub30.anIntArray10659[i_36_] = i_37_;
		    Class[] var_classes = new Class[i_41_];
		    for (int i_46_ = 0; i_46_ < i_41_; i_46_++)
			var_classes[i_46_]
			    = Class18.method794(strings[i_46_], -802338333);
		    Class var_class
			= Class18.method794(string_43_, 1806508866);
		    if (Class18.method794(string, -1058856253).getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods = Class18.method794
					   (string, -2047324393)
					   .getDeclaredMethods();
		    Method[] methods_47_ = methods;
		    for (int i_48_ = 0; i_48_ < methods_47_.length; i_48_++) {
			Method method = methods_47_[i_48_];
			if (method.getName().equals(string_40_)) {
			    Class[] var_classes_49_
				= method.getParameterTypes();
			    if (var_classes.length == var_classes_49_.length) {
				boolean bool = true;
				for (int i_50_ = 0; i_50_ < var_classes.length;
				     i_50_++) {
				    if (var_classes_49_[i_50_]
					!= var_classes[i_50_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    class534_sub30.aMethodArray10663[i_36_]
					= method;
			    }
			}
		    }
		    class534_sub30.aByteArrayArrayArray10664[i_36_] = is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		class534_sub30.anIntArray10660[i_36_] = -1;
	    } catch (SecurityException securityexception) {
		class534_sub30.anIntArray10660[i_36_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		class534_sub30.anIntArray10660[i_36_] = -3;
	    } catch (Exception exception) {
		class534_sub30.anIntArray10660[i_36_] = -4;
	    } catch (Throwable throwable) {
		class534_sub30.anIntArray10660[i_36_] = -5;
	    }
	}
	aClass700_846.method14131(class534_sub30, (short) 789);
    }
    
    static Class method1693(String string) throws ClassNotFoundException {
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("D"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	if (string.equals("void"))
	    return Void.TYPE;
	return Class.forName(string);
    }
    
    public static void method1694() {
	aClass700_846 = new Class700();
    }
    
    public static void method1695(Class534_Sub40 class534_sub40, int i) {
	Class534_Sub30 class534_sub30 = new Class534_Sub30();
	class534_sub30.anInt10657
	    = class534_sub40.method16527(929504231) * 420604151;
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
	for (int i_51_ = 0; i_51_ < 1681479879 * class534_sub30.anInt10657;
	     i_51_++) {
	    try {
		int i_52_ = class534_sub40.method16527(339871095);
		if (i_52_ == 0 || 1 == i_52_ || 2 == i_52_) {
		    String string = class534_sub40.method16541((byte) -87);
		    String string_53_ = class534_sub40.method16541((byte) -37);
		    int i_54_ = 0;
		    if (i_52_ == 1)
			i_54_ = class534_sub40.method16533(-258848859);
		    class534_sub30.anIntArray10659[i_51_] = i_52_;
		    class534_sub30.anIntArray10662[i_51_] = i_54_;
		    if (Class18.method794(string, -494631666).getClassLoader()
			== null)
			throw new SecurityException();
		    class534_sub30.aFieldArray10661[i_51_]
			= Class18.method794(string, 1334606451)
			      .getDeclaredField(string_53_);
		} else if (3 == i_52_ || 4 == i_52_) {
		    String string = class534_sub40.method16541((byte) -38);
		    String string_55_ = class534_sub40.method16541((byte) -90);
		    int i_56_ = class534_sub40.method16527(598146264);
		    String[] strings = new String[i_56_];
		    for (int i_57_ = 0; i_57_ < i_56_; i_57_++)
			strings[i_57_]
			    = class534_sub40.method16541((byte) -52);
		    String string_58_ = class534_sub40.method16541((byte) -27);
		    byte[][] is = new byte[i_56_][];
		    if (i_52_ == 3) {
			for (int i_59_ = 0; i_59_ < i_56_; i_59_++) {
			    int i_60_ = class534_sub40.method16533(-258848859);
			    is[i_59_] = new byte[i_60_];
			    class534_sub40.method16735(is[i_59_], 0, i_60_,
						       (short) -32497);
			}
		    }
		    class534_sub30.anIntArray10659[i_51_] = i_52_;
		    Class[] var_classes = new Class[i_56_];
		    for (int i_61_ = 0; i_61_ < i_56_; i_61_++)
			var_classes[i_61_]
			    = Class18.method794(strings[i_61_], -1803830507);
		    Class var_class = Class18.method794(string_58_, 962685621);
		    if (Class18.method794(string, -295728324).getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods = Class18.method794(string, 440447231)
					   .getDeclaredMethods();
		    Method[] methods_62_ = methods;
		    for (int i_63_ = 0; i_63_ < methods_62_.length; i_63_++) {
			Method method = methods_62_[i_63_];
			if (method.getName().equals(string_55_)) {
			    Class[] var_classes_64_
				= method.getParameterTypes();
			    if (var_classes.length == var_classes_64_.length) {
				boolean bool = true;
				for (int i_65_ = 0; i_65_ < var_classes.length;
				     i_65_++) {
				    if (var_classes_64_[i_65_]
					!= var_classes[i_65_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    class534_sub30.aMethodArray10663[i_51_]
					= method;
			    }
			}
		    }
		    class534_sub30.aByteArrayArrayArray10664[i_51_] = is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		class534_sub30.anIntArray10660[i_51_] = -1;
	    } catch (SecurityException securityexception) {
		class534_sub30.anIntArray10660[i_51_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		class534_sub30.anIntArray10660[i_51_] = -3;
	    } catch (Exception exception) {
		class534_sub30.anIntArray10660[i_51_] = -4;
	    } catch (Throwable throwable) {
		class534_sub30.anIntArray10660[i_51_] = -5;
	    }
	}
	aClass700_846.method14131(class534_sub30, (short) 789);
    }
    
    public static void method1696(Class534_Sub40 class534_sub40, int i) {
	Class534_Sub30 class534_sub30 = new Class534_Sub30();
	class534_sub30.anInt10657
	    = class534_sub40.method16527(1473527979) * 420604151;
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
	for (int i_66_ = 0; i_66_ < 1681479879 * class534_sub30.anInt10657;
	     i_66_++) {
	    try {
		int i_67_ = class534_sub40.method16527(-204172578);
		if (i_67_ == 0 || 1 == i_67_ || 2 == i_67_) {
		    String string = class534_sub40.method16541((byte) -76);
		    String string_68_ = class534_sub40.method16541((byte) -95);
		    int i_69_ = 0;
		    if (i_67_ == 1)
			i_69_ = class534_sub40.method16533(-258848859);
		    class534_sub30.anIntArray10659[i_66_] = i_67_;
		    class534_sub30.anIntArray10662[i_66_] = i_69_;
		    if (Class18.method794(string, -1004942979).getClassLoader()
			== null)
			throw new SecurityException();
		    class534_sub30.aFieldArray10661[i_66_]
			= Class18.method794(string, -921175119)
			      .getDeclaredField(string_68_);
		} else if (3 == i_67_ || 4 == i_67_) {
		    String string = class534_sub40.method16541((byte) -67);
		    String string_70_
			= class534_sub40.method16541((byte) -116);
		    int i_71_ = class534_sub40.method16527(839088941);
		    String[] strings = new String[i_71_];
		    for (int i_72_ = 0; i_72_ < i_71_; i_72_++)
			strings[i_72_]
			    = class534_sub40.method16541((byte) -71);
		    String string_73_ = class534_sub40.method16541((byte) -57);
		    byte[][] is = new byte[i_71_][];
		    if (i_67_ == 3) {
			for (int i_74_ = 0; i_74_ < i_71_; i_74_++) {
			    int i_75_ = class534_sub40.method16533(-258848859);
			    is[i_74_] = new byte[i_75_];
			    class534_sub40.method16735(is[i_74_], 0, i_75_,
						       (short) -11809);
			}
		    }
		    class534_sub30.anIntArray10659[i_66_] = i_67_;
		    Class[] var_classes = new Class[i_71_];
		    for (int i_76_ = 0; i_76_ < i_71_; i_76_++)
			var_classes[i_76_]
			    = Class18.method794(strings[i_76_], -1327182316);
		    Class var_class = Class18.method794(string_73_, 535161722);
		    if (Class18.method794(string, 1011176663).getClassLoader()
			== null)
			throw new SecurityException();
		    Method[] methods = Class18.method794
					   (string, -420492505)
					   .getDeclaredMethods();
		    Method[] methods_77_ = methods;
		    for (int i_78_ = 0; i_78_ < methods_77_.length; i_78_++) {
			Method method = methods_77_[i_78_];
			if (method.getName().equals(string_70_)) {
			    Class[] var_classes_79_
				= method.getParameterTypes();
			    if (var_classes.length == var_classes_79_.length) {
				boolean bool = true;
				for (int i_80_ = 0; i_80_ < var_classes.length;
				     i_80_++) {
				    if (var_classes_79_[i_80_]
					!= var_classes[i_80_]) {
					bool = false;
					break;
				    }
				}
				if (bool
				    && var_class == method.getReturnType())
				    class534_sub30.aMethodArray10663[i_66_]
					= method;
			    }
			}
		    }
		    class534_sub30.aByteArrayArrayArray10664[i_66_] = is;
		}
	    } catch (ClassNotFoundException classnotfoundexception) {
		class534_sub30.anIntArray10660[i_66_] = -1;
	    } catch (SecurityException securityexception) {
		class534_sub30.anIntArray10660[i_66_] = -2;
	    } catch (NullPointerException nullpointerexception) {
		class534_sub30.anIntArray10660[i_66_] = -3;
	    } catch (Exception exception) {
		class534_sub30.anIntArray10660[i_66_] = -4;
	    } catch (Throwable throwable) {
		class534_sub30.anIntArray10660[i_66_] = -5;
	    }
	}
	aClass700_846.method14131(class534_sub30, (short) 789);
    }
    
    static Class method1697(String string) throws ClassNotFoundException {
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("D"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	if (string.equals("void"))
	    return Void.TYPE;
	return Class.forName(string);
    }
    
    static Class method1698(String string) throws ClassNotFoundException {
	if (string.equals("B"))
	    return Byte.TYPE;
	if (string.equals("I"))
	    return Integer.TYPE;
	if (string.equals("S"))
	    return Short.TYPE;
	if (string.equals("J"))
	    return Long.TYPE;
	if (string.equals("Z"))
	    return Boolean.TYPE;
	if (string.equals("F"))
	    return Float.TYPE;
	if (string.equals("D"))
	    return Double.TYPE;
	if (string.equals("C"))
	    return Character.TYPE;
	if (string.equals("void"))
	    return Void.TYPE;
	return Class.forName(string);
    }
    
    Class86() throws Throwable {
	throw new Error();
    }
    
    static final void method1699(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_81_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_82_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_81_ & -1 - (1 << i_82_);
    }
}
