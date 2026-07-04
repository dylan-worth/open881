/* Class538 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Class538 implements Interface60
{
    Class472 aClass472_7165;
    Hashtable aHashtable7166 = new Hashtable();
    String aString7167;
    Hashtable aHashtable7168 = new Hashtable();
    
    void method8914(String string, File file) {
	aHashtable7166.put(string, file);
    }
    
    public int method8915(String string, boolean bool, int i)
	throws Exception_Sub1 {
	if (aHashtable7166.containsKey(string))
	    return 100;
	String string_0_ = null;
	Object object = null;
	String string_1_;
	if (bool) {
	    string_0_ = string;
	    string_1_ = string;
	} else {
	    string_1_ = Class481.method7926(string, 1348765414);
	    if (null == string_1_)
		throw new Exception_Sub1(1, string);
	    if (string_0_ == null) {
		string_0_ = new StringBuilder().append(aString7167).append
				(string_1_).toString();
		if (aClass472_7165 == null
		    || !aClass472_7165.method7686(string_0_, "", -1945137323))
		    throw new Exception_Sub1(2, string);
	    }
	}
	if (!aClass472_7165.method7705(string_0_, -307126151))
	    return aClass472_7165.method7667(string_0_, 683277494);
	byte[] is = aClass472_7165.method7687(string_0_, "", 1403505582);
	if (null == is)
	    throw new Exception_Sub1(3, string);
	Object object_2_ = null;
	File file;
	try {
	    file = Class286.method5264(string_1_, (byte) -58);
	} catch (RuntimeException runtimeexception) {
	    throw new Exception_Sub1(4, string, runtimeexception);
	}
	if (null == file)
	    throw new Exception_Sub1(5, string);
	boolean bool_3_ = true;
	byte[] is_4_ = Class690_Sub24.method17099(file, -2030638055);
	if (null != is_4_ && is.length == is_4_.length) {
	    for (int i_5_ = 0; i_5_ < is_4_.length; i_5_++) {
		if (is[i_5_] != is_4_[i_5_]) {
		    bool_3_ = false;
		    break;
		}
	    }
	} else
	    bool_3_ = false;
	if (!bool_3_) {
	    try {
		FileOutputStream fileoutputstream = new FileOutputStream(file);
		fileoutputstream.write(is, 0, is.length);
		fileoutputstream.close();
	    } catch (Throwable throwable) {
		throw new Exception_Sub1(6, string, throwable);
	    }
	}
	method8916(string, file, (byte) 44);
	return 100;
    }
    
    void method8916(String string, File file, byte i) {
	aHashtable7166.put(string, file);
    }
    
    public boolean method397(String string, int i) {
	return aHashtable7166.containsKey(string);
    }
    
    public Class538(Class472 class472) {
	aClass472_7165 = class472;
	String string = "";
	if (Class503.aString5626.startsWith("win")
	    || Class503.aString5626.startsWith("windows 7"))
	    string = new StringBuilder().append(string).append("windows/")
			 .toString();
	else if (Class503.aString5626.startsWith("linux"))
	    string = new StringBuilder().append(string).append("linux/")
			 .toString();
	else if (Class503.aString5626.startsWith("mac"))
	    string = new StringBuilder().append(string).append("macos/")
			 .toString();
	if (Class503.aString5627.startsWith("amd64")
	    || Class503.aString5627.startsWith("x86_64"))
	    string = new StringBuilder().append(string).append("x86_64/")
			 .toString();
	else if (Class503.aString5627.startsWith("i386")
		 || Class503.aString5627.startsWith("i486")
		 || Class503.aString5627.startsWith("i586")
		 || Class503.aString5627.startsWith("x86"))
	    string
		= new StringBuilder().append(string).append("x86/").toString();
	else if (Class503.aString5627.startsWith("ppc"))
	    string
		= new StringBuilder().append(string).append("ppc/").toString();
	else
	    string = new StringBuilder().append(string).append
			 ("universal/").toString();
	aString7167 = string;
    }
    
    void method8917(String string, Class var_class, short i)
	throws Exception_Sub3 {
	Class var_class_6_ = (Class) aHashtable7168.get(string);
	if (null != var_class_6_
	    && var_class_6_.getClassLoader() != var_class.getClassLoader())
	    throw new Exception_Sub3(1, string);
	File file = null;
	if (null == file)
	    file = (File) aHashtable7166.get(string);
	if (null != file) {
	    try {
		file = new File(file.getCanonicalPath());
		Class var_class_7_ = Class.forName("java.lang.Runtime");
		Class var_class_8_
		    = Class.forName("java.lang.reflect.AccessibleObject");
		Method method
		    = var_class_8_.getDeclaredMethod("setAccessible",
						     (new Class[]
						      { Boolean.TYPE }));
		Method method_9_
		    = (var_class_7_.getDeclaredMethod
		       ("load0",
			new Class[] { Class.forName("java.lang.Class"),
				      Class.forName("java.lang.String") }));
		method.invoke(method_9_, new Object[] { Boolean.TRUE });
		method_9_.invoke(Runtime.getRuntime(),
				 new Object[] { var_class, file.getPath() });
		method.invoke(method_9_, new Object[] { Boolean.FALSE });
		aHashtable7168.put(string, var_class);
	    } catch (NoSuchMethodException nosuchmethodexception) {
		System.load(file.getPath());
		aHashtable7168.put(string, com.jagex.Class545.class);
	    } catch (Throwable throwable) {
		throw new Exception_Sub3(3, string, throwable);
	    }
	} else
	    throw new Exception_Sub3(4, string);
    }
    
    public boolean method402(short i) {
	Hashtable hashtable = new Hashtable();
	Enumeration enumeration = aHashtable7168.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string, aHashtable7168.get(string));
	}
	try {
	    Class var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class var_class_10_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_10_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = aHashtable7168.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file = (File) aHashtable7166.get(string);
			Class var_class_11_
			    = (Class) aHashtable7168.get(string);
			Vector vector
			    = ((Vector)
			       field.get(var_class_11_.getClassLoader()));
			for (int i_12_ = 0; i_12_ < vector.size(); i_12_++) {
			    try {
				Object object = vector.elementAt(i_12_);
				Field field_13_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_13_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_14_
					= (String) field_13_.get(object);
				    if (null != string_14_
					&& (string_14_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_15_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_16_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_15_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_16_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_16_.invoke(object,
							      new Object[0]);
					    field_15_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_16_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_15_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_13_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	aHashtable7168 = hashtable;
	return aHashtable7168.isEmpty();
    }
    
    public boolean method403(String string) {
	return aHashtable7166.containsKey(string);
    }
    
    public void method399(String string) throws Exception_Sub3 {
	method8917(string, com.jagex.Class545.class, (short) 8192);
    }
    
    public boolean method204() {
	Hashtable hashtable = new Hashtable();
	Enumeration enumeration = aHashtable7168.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string, aHashtable7168.get(string));
	}
	try {
	    Class var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class var_class_17_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_17_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = aHashtable7168.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file = (File) aHashtable7166.get(string);
			Class var_class_18_
			    = (Class) aHashtable7168.get(string);
			Vector vector
			    = ((Vector)
			       field.get(var_class_18_.getClassLoader()));
			for (int i = 0; i < vector.size(); i++) {
			    try {
				Object object = vector.elementAt(i);
				Field field_19_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_19_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_20_
					= (String) field_19_.get(object);
				    if (null != string_20_
					&& (string_20_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_21_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_22_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_21_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_22_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_22_.invoke(object,
							      new Object[0]);
					    field_21_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_22_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_21_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_19_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	aHashtable7168 = hashtable;
	return aHashtable7168.isEmpty();
    }
    
    public void method400(String string, int i) throws Exception_Sub3 {
	method8917(string, com.jagex.Class545.class, (short) 8192);
    }
    
    static String method8918(String string) {
	if (Class503.aString5626.startsWith("win"))
	    return new StringBuilder().append(string).append(".dll")
		       .toString();
	if (Class503.aString5626.startsWith("linux"))
	    return new StringBuilder().append("lib").append(string).append
		       (".so").toString();
	if (Class503.aString5626.startsWith("mac"))
	    return new StringBuilder().append("lib").append(string).append
		       (".dylib").toString();
	return null;
    }
    
    public int method8919(String string, boolean bool) throws Exception_Sub1 {
	if (aHashtable7166.containsKey(string))
	    return 100;
	String string_23_ = null;
	Object object = null;
	String string_24_;
	if (bool) {
	    string_23_ = string;
	    string_24_ = string;
	} else {
	    string_24_ = Class481.method7926(string, -2091654723);
	    if (null == string_24_)
		throw new Exception_Sub1(1, string);
	    if (string_23_ == null) {
		string_23_ = new StringBuilder().append(aString7167).append
				 (string_24_).toString();
		if (aClass472_7165 == null
		    || !aClass472_7165.method7686(string_23_, "", -1914577062))
		    throw new Exception_Sub1(2, string);
	    }
	}
	if (!aClass472_7165.method7705(string_23_, -1929473268))
	    return aClass472_7165.method7667(string_23_, 411198571);
	byte[] is = aClass472_7165.method7687(string_23_, "", 1856077543);
	if (null == is)
	    throw new Exception_Sub1(3, string);
	Object object_25_ = null;
	File file;
	try {
	    file = Class286.method5264(string_24_, (byte) -57);
	} catch (RuntimeException runtimeexception) {
	    throw new Exception_Sub1(4, string, runtimeexception);
	}
	if (null == file)
	    throw new Exception_Sub1(5, string);
	boolean bool_26_ = true;
	byte[] is_27_ = Class690_Sub24.method17099(file, -1900531793);
	if (null != is_27_ && is.length == is_27_.length) {
	    for (int i = 0; i < is_27_.length; i++) {
		if (is[i] != is_27_[i]) {
		    bool_26_ = false;
		    break;
		}
	    }
	} else
	    bool_26_ = false;
	if (!bool_26_) {
	    try {
		FileOutputStream fileoutputstream = new FileOutputStream(file);
		fileoutputstream.write(is, 0, is.length);
		fileoutputstream.close();
	    } catch (Throwable throwable) {
		throw new Exception_Sub1(6, string, throwable);
	    }
	}
	method8916(string, file, (byte) 13);
	return 100;
    }
    
    void method8920(String string, File file) {
	aHashtable7166.put(string, file);
    }
    
    void method8921(String string, File file) {
	aHashtable7166.put(string, file);
    }
    
    public void method398(String string) throws Exception_Sub3 {
	method8917(string, com.jagex.Class545.class, (short) 8192);
    }
    
    public boolean method401(String string) {
	return aHashtable7166.containsKey(string);
    }
    
    public boolean method208() {
	Hashtable hashtable = new Hashtable();
	Enumeration enumeration = aHashtable7168.keys();
	while (enumeration.hasMoreElements()) {
	    String string = (String) enumeration.nextElement();
	    hashtable.put(string, aHashtable7168.get(string));
	}
	try {
	    Class var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class var_class_28_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_28_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = aHashtable7168.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file = (File) aHashtable7166.get(string);
			Class var_class_29_
			    = (Class) aHashtable7168.get(string);
			Vector vector
			    = ((Vector)
			       field.get(var_class_29_.getClassLoader()));
			for (int i = 0; i < vector.size(); i++) {
			    try {
				Object object = vector.elementAt(i);
				Field field_30_
				    = object.getClass()
					  .getDeclaredField("name");
				method.invoke(field_30_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_31_
					= (String) field_30_.get(object);
				    if (null != string_31_
					&& (string_31_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_32_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_33_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_32_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_33_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_33_.invoke(object,
							      new Object[0]);
					    field_32_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_33_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_32_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_30_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	aHashtable7168 = hashtable;
	return aHashtable7168.isEmpty();
    }
    
    static void method8922(int i) {
	Class219.aClass171_2307 = null;
	Class539_Sub1.aClass171_10327 = null;
	Class231.aClass171_2325 = null;
	Class510.aClass163Array5678 = null;
	Class530.aClass163Array7133 = null;
	Class19.aClass163Array209 = null;
	Class79.aClass163Array829 = null;
	Class67.aClass163Array721 = null;
	Class658.aClass163Array8541 = null;
	Class581_Sub1.aClass163_10593 = null;
	Class657.aClass163_8538 = null;
	Class310.aClass163Array3359 = null;
    }
    
    public static int method8923(String string, boolean bool, int i) {
	string = string.toLowerCase();
	Class211.anIntArray2260 = null;
	Class352.anInt3653 = 0;
	LinkedList linkedlist = new LinkedList();
	LinkedList linkedlist_34_ = new LinkedList();
	for (int i_35_ = 0;
	     i_35_ < Class531.aClass44_Sub7_7135.anInt327 * 888398261;
	     i_35_++) {
	    Class15 class15
		= ((Class15)
		   Class531.aClass44_Sub7_7135.method91(i_35_, 1456515621));
	    if ((!bool || class15.aBool172)
		&& -1 == class15.anInt158 * 368739509
		&& class15.anInt161 * -160842243 == -1
		&& class15.anInt180 * 25758581 == -1
		&& 0 == -221335179 * class15.anInt167
		&& class15.aString122.toLowerCase().indexOf(string) != -1) {
		if (linkedlist.size() >= 250)
		    return -1;
		linkedlist.add(Integer.valueOf(i_35_));
		linkedlist_34_.add(class15.aString122);
	    }
	}
	Class211.anIntArray2260 = new int[linkedlist.size()];
	int i_36_ = 0;
	Iterator iterator = linkedlist.iterator();
	while (iterator.hasNext()) {
	    Integer integer = (Integer) iterator.next();
	    Class211.anIntArray2260[i_36_++] = integer.intValue();
	}
	String[] strings
	    = ((String[])
	       linkedlist_34_
		   .toArray(new String[Class211.anIntArray2260.length]));
	Class588.method9869(strings, Class211.anIntArray2260, (byte) 12);
	return linkedlist.size();
    }
    
    static final void method8924(Class669 class669, byte i) {
	int i_37_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (null != Class168.aClass98Array1792
	    && i_37_ < -217094943 * Class455.anInt4963
	    && (Class168.aClass98Array1792[i_37_].aString1162.equalsIgnoreCase
		(Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aString12211)))
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
}
