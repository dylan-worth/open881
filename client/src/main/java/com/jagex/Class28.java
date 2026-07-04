/* Class28 - Decompiled by JODE
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

public class Class28
{
    public String aString249;
    public String aString250;
    public int anInt251;
    public int anInt252;
    public int anInt253;
    public String aString254;
    public boolean aBool255;
    public boolean aBool256;
    public String aString257;
    public int anInt258;
    
    Class28() {
	/* empty */
    }
    
    static final void method860(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, -483974268);
	Class321.method5776(class247, class669, 1709065688);
    }
    
    static final void method861(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class485.method7960(class247, class243, class669, 856982529);
    }
    
    public static Class606_Sub1 method862(int i) {
	return Class521.method8688((-1664252895
				    * Class685.aClass23_8698.anInt227),
				   199263179);
    }
    
    public static void method863(Class534_Sub40_Sub1 class534_sub40_sub1,
				 int i) {
	Class534_Sub30 class534_sub30
	    = (Class534_Sub30) Class86.aClass700_846.method14135((byte) -1);
	if (null != class534_sub30) {
	    int i_1_ = class534_sub40_sub1.anInt10811 * 31645619;
	    class534_sub40_sub1.method16510((class534_sub30.anInt10658
					     * -961081129),
					    -31693641);
	    for (int i_2_ = 0; i_2_ < 1681479879 * class534_sub30.anInt10657;
		 i_2_++) {
		if (class534_sub30.anIntArray10660[i_2_] != 0)
		    class534_sub40_sub1.method16506((class534_sub30
						     .anIntArray10660[i_2_]),
						    1572127561);
		else {
		    try {
			int i_3_ = class534_sub30.anIntArray10659[i_2_];
			if (0 == i_3_) {
			    Field field
				= class534_sub30.aFieldArray10661[i_2_];
			    int i_4_ = field.getInt(null);
			    class534_sub40_sub1.method16506(0, 1064663958);
			    class534_sub40_sub1.method16510(i_4_, -1054838604);
			} else if (i_3_ == 1) {
			    Field field
				= class534_sub30.aFieldArray10661[i_2_];
			    field.setInt(null,
					 class534_sub30.anIntArray10662[i_2_]);
			    class534_sub40_sub1.method16506(0, 508495900);
			} else if (i_3_ == 2) {
			    Field field
				= class534_sub30.aFieldArray10661[i_2_];
			    int i_5_ = field.getModifiers();
			    class534_sub40_sub1.method16506(0, 248324731);
			    class534_sub40_sub1.method16510(i_5_, -1601621142);
			}
			if (3 == i_3_) {
			    Method method
				= class534_sub30.aMethodArray10663[i_2_];
			    byte[][] is = (class534_sub30
					   .aByteArrayArrayArray10664[i_2_]);
			    Object[] objects = new Object[is.length];
			    for (int i_6_ = 0; i_6_ < is.length; i_6_++) {
				ObjectInputStream objectinputstream
				    = (new ObjectInputStream
				       (new ByteArrayInputStream(is[i_6_])));
				objects[i_6_] = objectinputstream.readObject();
			    }
			    Object object = method.invoke(null, objects);
			    if (null == object)
				class534_sub40_sub1.method16506(0, 1773200804);
			    else if (object instanceof Number) {
				class534_sub40_sub1.method16506(1, 1638720790);
				class534_sub40_sub1.method16505
				    (((Number) object).longValue());
			    } else if (object instanceof String) {
				class534_sub40_sub1.method16506(2, 1489943807);
				class534_sub40_sub1
				    .method16713((String) object, 866990916);
			    } else
				class534_sub40_sub1.method16506(4, 1124595626);
			} else if (4 == i_3_) {
			    Method method
				= class534_sub30.aMethodArray10663[i_2_];
			    int i_7_ = method.getModifiers();
			    class534_sub40_sub1.method16506(0, 1784123055);
			    class534_sub40_sub1.method16510(i_7_, -2112824923);
			}
		    } catch (ClassNotFoundException classnotfoundexception) {
			class534_sub40_sub1.method16506(-10, 1332374674);
		    } catch (InvalidClassException invalidclassexception) {
			class534_sub40_sub1.method16506(-11, 1112426870);
		    } catch (StreamCorruptedException streamcorruptedexception) {
			class534_sub40_sub1.method16506(-12, 1635116872);
		    } catch (OptionalDataException optionaldataexception) {
			class534_sub40_sub1.method16506(-13, 349147770);
		    } catch (IllegalAccessException illegalaccessexception) {
			class534_sub40_sub1.method16506(-14, 1308866909);
		    } catch (IllegalArgumentException illegalargumentexception) {
			class534_sub40_sub1.method16506(-15, 2090229605);
		    } catch (InvocationTargetException invocationtargetexception) {
			class534_sub40_sub1.method16506(-16, 592848502);
		    } catch (SecurityException securityexception) {
			class534_sub40_sub1.method16506(-17, 916172791);
		    } catch (IOException ioexception) {
			class534_sub40_sub1.method16506(-18, 538536411);
		    } catch (NullPointerException nullpointerexception) {
			class534_sub40_sub1.method16506(-19, 274659362);
		    } catch (Exception exception) {
			class534_sub40_sub1.method16506(-20, 1275949354);
		    } catch (Throwable throwable) {
			class534_sub40_sub1.method16506(-21, 810882073);
		    }
		}
	    }
	    class534_sub40_sub1.method16557(i_1_, -1231017679);
	    class534_sub30.method8892((byte) 1);
	}
    }
    
    static final void method864(Class669 class669, int i) {
	int i_8_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_8_, -117579807);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (1 == -1866862435 * class247.anInt2496
	       ? class247.anInt2497 * 939166901 : -1);
    }
    
    public static final void method865(int i) {
	Class100 class100 = Class201.method3864(2095398292);
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4223,
				  class100.aClass13_1183, 1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16506(0, 611565464);
	class100.method1863(class534_sub19, (byte) 114);
    }
    
    static final void method866(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class669.anIntArray8591[662605117 * class669.anInt8613];
    }
    
    static final void method867(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class30.method884(string, 169448195);
    }
    
    static void method868(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class102.method1903(2099034274);
    }
    
    static final void method869(Class669 class669, byte i) {
	int i_9_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_9_, 1968374838);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2488 * 1994134509;
    }
    
    static final void method870(Class669 class669, int i) {
	long l = Class250.method4604((byte) -46);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) (l / 60000L);
    }
}
