/* Class694 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class694 implements Iterator
{
    Class696 aClass696_8771;
    Class534_Sub18 aClass534_Sub18_8772;
    Class534_Sub18 aClass534_Sub18_8773 = null;
    
    public void method14055() {
	if (null == aClass534_Sub18_8773)
	    throw new IllegalStateException();
	aClass534_Sub18_8773.method16180(-421776830);
	aClass534_Sub18_8773 = null;
    }
    
    void method14056(byte i) {
	aClass534_Sub18_8772
	    = aClass696_8771.aClass534_Sub18_8785.aClass534_Sub18_10510;
	aClass534_Sub18_8773 = null;
    }
    
    public boolean hasNext() {
	return aClass534_Sub18_8772 != aClass696_8771.aClass534_Sub18_8785;
    }
    
    public Object next() {
	Class534_Sub18 class534_sub18 = aClass534_Sub18_8772;
	if (class534_sub18 == aClass696_8771.aClass534_Sub18_8785) {
	    class534_sub18 = null;
	    aClass534_Sub18_8772 = null;
	} else
	    aClass534_Sub18_8772 = class534_sub18.aClass534_Sub18_10510;
	aClass534_Sub18_8773 = class534_sub18;
	return class534_sub18;
    }
    
    public boolean method14057() {
	return aClass534_Sub18_8772 != aClass696_8771.aClass534_Sub18_8785;
    }
    
    public void remove() {
	if (null == aClass534_Sub18_8773)
	    throw new IllegalStateException();
	aClass534_Sub18_8773.method16180(-421776830);
	aClass534_Sub18_8773 = null;
    }
    
    public Class534_Sub18 method14058() {
	method14056((byte) -10);
	return (Class534_Sub18) next();
    }
    
    public boolean method14059() {
	return aClass534_Sub18_8772 != aClass696_8771.aClass534_Sub18_8785;
    }
    
    public boolean method14060() {
	return aClass534_Sub18_8772 != aClass696_8771.aClass534_Sub18_8785;
    }
    
    public boolean method14061() {
	return aClass534_Sub18_8772 != aClass696_8771.aClass534_Sub18_8785;
    }
    
    public Object method14062() {
	Class534_Sub18 class534_sub18 = aClass534_Sub18_8772;
	if (class534_sub18 == aClass696_8771.aClass534_Sub18_8785) {
	    class534_sub18 = null;
	    aClass534_Sub18_8772 = null;
	} else
	    aClass534_Sub18_8772 = class534_sub18.aClass534_Sub18_10510;
	aClass534_Sub18_8773 = class534_sub18;
	return class534_sub18;
    }
    
    public Object method14063() {
	Class534_Sub18 class534_sub18 = aClass534_Sub18_8772;
	if (class534_sub18 == aClass696_8771.aClass534_Sub18_8785) {
	    class534_sub18 = null;
	    aClass534_Sub18_8772 = null;
	} else
	    aClass534_Sub18_8772 = class534_sub18.aClass534_Sub18_10510;
	aClass534_Sub18_8773 = class534_sub18;
	return class534_sub18;
    }
    
    public Class694(Class696 class696) {
	aClass696_8771 = class696;
	aClass534_Sub18_8772
	    = aClass696_8771.aClass534_Sub18_8785.aClass534_Sub18_10510;
	aClass534_Sub18_8773 = null;
    }
    
    public void method14064() {
	if (null == aClass534_Sub18_8773)
	    throw new IllegalStateException();
	aClass534_Sub18_8773.method16180(-421776830);
	aClass534_Sub18_8773 = null;
    }
    
    public Class534_Sub18 method14065() {
	method14056((byte) -48);
	return (Class534_Sub18) next();
    }
    
    public Class534_Sub18 method14066() {
	method14056((byte) -26);
	return (Class534_Sub18) next();
    }
    
    public Class534_Sub18 method14067() {
	method14056((byte) -116);
	return (Class534_Sub18) next();
    }
    
    public Class534_Sub18 method14068(byte i) {
	method14056((byte) -58);
	return (Class534_Sub18) next();
    }
    
    public static void method14069
	(Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1, int i) {
	for (Class534_Sub16 class534_sub16
		 = ((Class534_Sub16)
		    Class534_Sub16.aClass700_10469.method14135((byte) -1));
	     class534_sub16 != null;
	     class534_sub16 = (Class534_Sub16) Class534_Sub16
						   .aClass700_10469
						   .method14139(1619689777)) {
	    if (class534_sub16.aClass654_Sub1_Sub5_Sub1_Sub1_10482
		== class654_sub1_sub5_sub1_sub1) {
		if (null != class534_sub16.aClass491_10492) {
		    class534_sub16.aClass491_10492.method8014(100, 1962988118);
		    Class171_Sub4.aClass232_9944.method4234((class534_sub16
							     .aClass491_10492),
							    -431411311);
		    class534_sub16.aClass491_10492 = null;
		}
		class534_sub16.method8892((byte) 1);
		break;
	    }
	}
    }
}
