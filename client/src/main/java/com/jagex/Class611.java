/* Class611 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class611
{
    int anInt8011;
    int anInt8012;
    Class9 aClass9_8013;
    Class696 aClass696_8014 = new Class696();
    
    public final void method10074(int i) {
	for (Class534_Sub18_Sub15 class534_sub18_sub15
		 = ((Class534_Sub18_Sub15)
		    aClass696_8014.method14078(1221951837));
	     class534_sub18_sub15 != null;
	     class534_sub18_sub15 = ((Class534_Sub18_Sub15)
				     aClass696_8014.method14080((byte) 17))) {
	    if (class534_sub18_sub15.method18432()) {
		if (class534_sub18_sub15.method18425() == null) {
		    class534_sub18_sub15.method8892((byte) 1);
		    class534_sub18_sub15.method16180(-421776830);
		    anInt8012 += class534_sub18_sub15.anInt11862;
		}
	    } else if (((class534_sub18_sub15.aLong10509 += 84410810002887935L)
			* -753566336061658369L)
		       > (long) i) {
		Class534_Sub18_Sub15_Sub2 class534_sub18_sub15_sub2
		    = (new Class534_Sub18_Sub15_Sub2
		       (class534_sub18_sub15.anInterface71_11863,
			class534_sub18_sub15.method18425(),
			class534_sub18_sub15.anInt11862));
		aClass9_8013.method581(class534_sub18_sub15_sub2,
				       (class534_sub18_sub15.aLong7158
					* 8258869577519436579L));
		Class51.method1180(class534_sub18_sub15_sub2,
				   class534_sub18_sub15, (byte) -105);
		class534_sub18_sub15.method8892((byte) 1);
		class534_sub18_sub15.method16180(-421776830);
	    }
	}
    }
    
    final void method10075(Interface71 interface71) {
	long l = interface71.method484();
	for (Class534_Sub18_Sub15 class534_sub18_sub15
		 = (Class534_Sub18_Sub15) aClass9_8013.method579(l);
	     class534_sub18_sub15 != null;
	     class534_sub18_sub15
		 = (Class534_Sub18_Sub15) aClass9_8013.method582(1871647756)) {
	    if (class534_sub18_sub15.anInterface71_11863
		    .method483(interface71)) {
		method10091(class534_sub18_sub15);
		break;
	    }
	}
    }
    
    public final void method10076() {
	for (Class534_Sub18_Sub15 class534_sub18_sub15
		 = ((Class534_Sub18_Sub15)
		    aClass696_8014.method14078(1221951837));
	     class534_sub18_sub15 != null;
	     class534_sub18_sub15 = ((Class534_Sub18_Sub15)
				     aClass696_8014.method14080((byte) 112))) {
	    if (class534_sub18_sub15.method18432()) {
		class534_sub18_sub15.method8892((byte) 1);
		class534_sub18_sub15.method16180(-421776830);
		anInt8012 += class534_sub18_sub15.anInt11862;
	    }
	}
    }
    
    public final Object method10077(Interface71 interface71) {
	long l = interface71.method484();
	for (Class534_Sub18_Sub15 class534_sub18_sub15
		 = (Class534_Sub18_Sub15) aClass9_8013.method579(l);
	     class534_sub18_sub15 != null;
	     class534_sub18_sub15
		 = (Class534_Sub18_Sub15) aClass9_8013.method582(1710821760)) {
	    if (class534_sub18_sub15.anInterface71_11863
		    .method483(interface71)) {
		Object object = class534_sub18_sub15.method18425();
		if (object == null) {
		    class534_sub18_sub15.method8892((byte) 1);
		    class534_sub18_sub15.method16180(-421776830);
		    anInt8012 += class534_sub18_sub15.anInt11862;
		} else {
		    if (class534_sub18_sub15.method18432()) {
			Class534_Sub18_Sub15_Sub1 class534_sub18_sub15_sub1
			    = (new Class534_Sub18_Sub15_Sub1
			       (interface71, object,
				class534_sub18_sub15.anInt11862));
			aClass9_8013.method581(class534_sub18_sub15_sub1,
					       (class534_sub18_sub15.aLong7158
						* 8258869577519436579L));
			aClass696_8014.method14076(class534_sub18_sub15_sub1,
						   (byte) 35);
			class534_sub18_sub15_sub1.aLong10509 = 0L;
			class534_sub18_sub15.method8892((byte) 1);
			class534_sub18_sub15.method16180(-421776830);
		    } else {
			aClass696_8014.method14076(class534_sub18_sub15,
						   (byte) 26);
			class534_sub18_sub15.aLong10509 = 0L;
		    }
		    return object;
		}
	    }
	}
	return null;
    }
    
    public final void method10078(Object object, Interface71 interface71) {
	method10079(object, interface71, 1);
    }
    
    final void method10079(Object object, Interface71 interface71, int i) {
	if (i > anInt8011)
	    throw new IllegalStateException();
	method10075(interface71);
	anInt8012 -= i;
	while (anInt8012 < 0) {
	    Class534_Sub18_Sub15 class534_sub18_sub15
		= ((Class534_Sub18_Sub15)
		   aClass696_8014.method14077((byte) -29));
	    method10091(class534_sub18_sub15);
	}
	Class534_Sub18_Sub15_Sub1 class534_sub18_sub15_sub1
	    = new Class534_Sub18_Sub15_Sub1(interface71, object, i);
	aClass9_8013.method581(class534_sub18_sub15_sub1,
			       interface71.method484());
	aClass696_8014.method14076(class534_sub18_sub15_sub1, (byte) 75);
	class534_sub18_sub15_sub1.aLong10509 = 0L;
    }
    
    public final void method10080(int i) {
	for (Class534_Sub18_Sub15 class534_sub18_sub15
		 = ((Class534_Sub18_Sub15)
		    aClass696_8014.method14078(1221951837));
	     class534_sub18_sub15 != null;
	     class534_sub18_sub15 = ((Class534_Sub18_Sub15)
				     aClass696_8014.method14080((byte) 10))) {
	    if (class534_sub18_sub15.method18432()) {
		if (class534_sub18_sub15.method18425() == null) {
		    class534_sub18_sub15.method8892((byte) 1);
		    class534_sub18_sub15.method16180(-421776830);
		    anInt8012 += class534_sub18_sub15.anInt11862;
		}
	    } else if (((class534_sub18_sub15.aLong10509 += 84410810002887935L)
			* -753566336061658369L)
		       > (long) i) {
		Class534_Sub18_Sub15_Sub2 class534_sub18_sub15_sub2
		    = (new Class534_Sub18_Sub15_Sub2
		       (class534_sub18_sub15.anInterface71_11863,
			class534_sub18_sub15.method18425(),
			class534_sub18_sub15.anInt11862));
		aClass9_8013.method581(class534_sub18_sub15_sub2,
				       (class534_sub18_sub15.aLong7158
					* 8258869577519436579L));
		Class51.method1180(class534_sub18_sub15_sub2,
				   class534_sub18_sub15, (byte) -77);
		class534_sub18_sub15.method8892((byte) 1);
		class534_sub18_sub15.method16180(-421776830);
	    }
	}
    }
    
    public final void method10081() {
	aClass696_8014.method14075(958896847);
	aClass9_8013.method578((byte) -29);
	anInt8012 = anInt8011;
    }
    
    public Class611(int i) {
	anInt8011 = i;
	anInt8012 = i;
	int i_0_;
	for (i_0_ = 1; i_0_ + i_0_ < i; i_0_ += i_0_) {
	    /* empty */
	}
	aClass9_8013 = new Class9(i_0_);
    }
    
    public final Object method10082(Interface71 interface71) {
	long l = interface71.method484();
	for (Class534_Sub18_Sub15 class534_sub18_sub15
		 = (Class534_Sub18_Sub15) aClass9_8013.method579(l);
	     class534_sub18_sub15 != null;
	     class534_sub18_sub15
		 = (Class534_Sub18_Sub15) aClass9_8013.method582(422635899)) {
	    if (class534_sub18_sub15.anInterface71_11863
		    .method483(interface71)) {
		Object object = class534_sub18_sub15.method18425();
		if (object == null) {
		    class534_sub18_sub15.method8892((byte) 1);
		    class534_sub18_sub15.method16180(-421776830);
		    anInt8012 += class534_sub18_sub15.anInt11862;
		} else {
		    if (class534_sub18_sub15.method18432()) {
			Class534_Sub18_Sub15_Sub1 class534_sub18_sub15_sub1
			    = (new Class534_Sub18_Sub15_Sub1
			       (interface71, object,
				class534_sub18_sub15.anInt11862));
			aClass9_8013.method581(class534_sub18_sub15_sub1,
					       (class534_sub18_sub15.aLong7158
						* 8258869577519436579L));
			aClass696_8014.method14076(class534_sub18_sub15_sub1,
						   (byte) 26);
			class534_sub18_sub15_sub1.aLong10509 = 0L;
			class534_sub18_sub15.method8892((byte) 1);
			class534_sub18_sub15.method16180(-421776830);
		    } else {
			aClass696_8014.method14076(class534_sub18_sub15,
						   (byte) 35);
			class534_sub18_sub15.aLong10509 = 0L;
		    }
		    return object;
		}
	    }
	}
	return null;
    }
    
    final void method10083(Interface71 interface71) {
	long l = interface71.method484();
	for (Class534_Sub18_Sub15 class534_sub18_sub15
		 = (Class534_Sub18_Sub15) aClass9_8013.method579(l);
	     class534_sub18_sub15 != null;
	     class534_sub18_sub15
		 = (Class534_Sub18_Sub15) aClass9_8013.method582(1531913109)) {
	    if (class534_sub18_sub15.anInterface71_11863
		    .method483(interface71)) {
		method10091(class534_sub18_sub15);
		break;
	    }
	}
    }
    
    final void method10084(Class534_Sub18_Sub15 class534_sub18_sub15) {
	if (class534_sub18_sub15 != null) {
	    class534_sub18_sub15.method8892((byte) 1);
	    class534_sub18_sub15.method16180(-421776830);
	    anInt8012 += class534_sub18_sub15.anInt11862;
	}
    }
    
    final void method10085(Object object, Interface71 interface71, int i) {
	if (i > anInt8011)
	    throw new IllegalStateException();
	method10075(interface71);
	anInt8012 -= i;
	while (anInt8012 < 0) {
	    Class534_Sub18_Sub15 class534_sub18_sub15
		= ((Class534_Sub18_Sub15)
		   aClass696_8014.method14077((byte) -84));
	    method10091(class534_sub18_sub15);
	}
	Class534_Sub18_Sub15_Sub1 class534_sub18_sub15_sub1
	    = new Class534_Sub18_Sub15_Sub1(interface71, object, i);
	aClass9_8013.method581(class534_sub18_sub15_sub1,
			       interface71.method484());
	aClass696_8014.method14076(class534_sub18_sub15_sub1, (byte) 26);
	class534_sub18_sub15_sub1.aLong10509 = 0L;
    }
    
    public final void method10086(Object object, Interface71 interface71) {
	method10079(object, interface71, 1);
    }
    
    public final void method10087(Object object, Interface71 interface71) {
	method10079(object, interface71, 1);
    }
    
    final void method10088(Class534_Sub18_Sub15 class534_sub18_sub15) {
	if (class534_sub18_sub15 != null) {
	    class534_sub18_sub15.method8892((byte) 1);
	    class534_sub18_sub15.method16180(-421776830);
	    anInt8012 += class534_sub18_sub15.anInt11862;
	}
    }
    
    final void method10089(Object object, Interface71 interface71, int i) {
	if (i > anInt8011)
	    throw new IllegalStateException();
	method10075(interface71);
	anInt8012 -= i;
	while (anInt8012 < 0) {
	    Class534_Sub18_Sub15 class534_sub18_sub15
		= ((Class534_Sub18_Sub15)
		   aClass696_8014.method14077((byte) -66));
	    method10091(class534_sub18_sub15);
	}
	Class534_Sub18_Sub15_Sub1 class534_sub18_sub15_sub1
	    = new Class534_Sub18_Sub15_Sub1(interface71, object, i);
	aClass9_8013.method581(class534_sub18_sub15_sub1,
			       interface71.method484());
	aClass696_8014.method14076(class534_sub18_sub15_sub1, (byte) 124);
	class534_sub18_sub15_sub1.aLong10509 = 0L;
    }
    
    final void method10090(Object object, Interface71 interface71, int i) {
	if (i > anInt8011)
	    throw new IllegalStateException();
	method10075(interface71);
	anInt8012 -= i;
	while (anInt8012 < 0) {
	    Class534_Sub18_Sub15 class534_sub18_sub15
		= ((Class534_Sub18_Sub15)
		   aClass696_8014.method14077((byte) -23));
	    method10091(class534_sub18_sub15);
	}
	Class534_Sub18_Sub15_Sub1 class534_sub18_sub15_sub1
	    = new Class534_Sub18_Sub15_Sub1(interface71, object, i);
	aClass9_8013.method581(class534_sub18_sub15_sub1,
			       interface71.method484());
	aClass696_8014.method14076(class534_sub18_sub15_sub1, (byte) 96);
	class534_sub18_sub15_sub1.aLong10509 = 0L;
    }
    
    final void method10091(Class534_Sub18_Sub15 class534_sub18_sub15) {
	if (class534_sub18_sub15 != null) {
	    class534_sub18_sub15.method8892((byte) 1);
	    class534_sub18_sub15.method16180(-421776830);
	    anInt8012 += class534_sub18_sub15.anInt11862;
	}
    }
    
    public final void method10092(int i) {
	for (Class534_Sub18_Sub15 class534_sub18_sub15
		 = ((Class534_Sub18_Sub15)
		    aClass696_8014.method14078(1221951837));
	     class534_sub18_sub15 != null;
	     class534_sub18_sub15 = ((Class534_Sub18_Sub15)
				     aClass696_8014.method14080((byte) 47))) {
	    if (class534_sub18_sub15.method18432()) {
		if (class534_sub18_sub15.method18425() == null) {
		    class534_sub18_sub15.method8892((byte) 1);
		    class534_sub18_sub15.method16180(-421776830);
		    anInt8012 += class534_sub18_sub15.anInt11862;
		}
	    } else if (((class534_sub18_sub15.aLong10509 += 84410810002887935L)
			* -753566336061658369L)
		       > (long) i) {
		Class534_Sub18_Sub15_Sub2 class534_sub18_sub15_sub2
		    = (new Class534_Sub18_Sub15_Sub2
		       (class534_sub18_sub15.anInterface71_11863,
			class534_sub18_sub15.method18425(),
			class534_sub18_sub15.anInt11862));
		aClass9_8013.method581(class534_sub18_sub15_sub2,
				       (class534_sub18_sub15.aLong7158
					* 8258869577519436579L));
		Class51.method1180(class534_sub18_sub15_sub2,
				   class534_sub18_sub15, (byte) -113);
		class534_sub18_sub15.method8892((byte) 1);
		class534_sub18_sub15.method16180(-421776830);
	    }
	}
    }
    
    public final void method10093(int i) {
	for (Class534_Sub18_Sub15 class534_sub18_sub15
		 = ((Class534_Sub18_Sub15)
		    aClass696_8014.method14078(1221951837));
	     class534_sub18_sub15 != null;
	     class534_sub18_sub15 = ((Class534_Sub18_Sub15)
				     aClass696_8014.method14080((byte) 105))) {
	    if (class534_sub18_sub15.method18432()) {
		if (class534_sub18_sub15.method18425() == null) {
		    class534_sub18_sub15.method8892((byte) 1);
		    class534_sub18_sub15.method16180(-421776830);
		    anInt8012 += class534_sub18_sub15.anInt11862;
		}
	    } else if (((class534_sub18_sub15.aLong10509 += 84410810002887935L)
			* -753566336061658369L)
		       > (long) i) {
		Class534_Sub18_Sub15_Sub2 class534_sub18_sub15_sub2
		    = (new Class534_Sub18_Sub15_Sub2
		       (class534_sub18_sub15.anInterface71_11863,
			class534_sub18_sub15.method18425(),
			class534_sub18_sub15.anInt11862));
		aClass9_8013.method581(class534_sub18_sub15_sub2,
				       (class534_sub18_sub15.aLong7158
					* 8258869577519436579L));
		Class51.method1180(class534_sub18_sub15_sub2,
				   class534_sub18_sub15, (byte) -69);
		class534_sub18_sub15.method8892((byte) 1);
		class534_sub18_sub15.method16180(-421776830);
	    }
	}
    }
    
    public final void method10094() {
	aClass696_8014.method14075(958896847);
	aClass9_8013.method578((byte) -41);
	anInt8012 = anInt8011;
    }
    
    public final void method10095() {
	aClass696_8014.method14075(958896847);
	aClass9_8013.method578((byte) -76);
	anInt8012 = anInt8011;
    }
    
    public final void method10096() {
	for (Class534_Sub18_Sub15 class534_sub18_sub15
		 = ((Class534_Sub18_Sub15)
		    aClass696_8014.method14078(1221951837));
	     class534_sub18_sub15 != null;
	     class534_sub18_sub15 = ((Class534_Sub18_Sub15)
				     aClass696_8014.method14080((byte) 117))) {
	    if (class534_sub18_sub15.method18432()) {
		class534_sub18_sub15.method8892((byte) 1);
		class534_sub18_sub15.method16180(-421776830);
		anInt8012 += class534_sub18_sub15.anInt11862;
	    }
	}
    }
}
