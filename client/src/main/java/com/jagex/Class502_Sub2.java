/* Class502_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class502_Sub2 extends Class502
{
    int anInt10350;
    long[] aLongArray10351;
    long aLong10352 = 0L;
    long aLong10353;
    long aLong10354 = 0L;
    int anInt10355;
    
    long method15979() {
	long l = System.nanoTime();
	long l_0_ = l - aLong10353 * 7085173481284529683L;
	aLong10353 = 6978492438888549403L * l;
	if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
	    aLongArray10351[1927387759 * anInt10350] = l_0_;
	    anInt10350 = -1744894833 * ((1 + anInt10350 * 1927387759) % 10);
	    if (anInt10355 * -1793929459 < 1)
		anInt10355 += 1753126853;
	}
	long l_1_ = 0L;
	for (int i = 1; i <= -1793929459 * anInt10355; i++)
	    l_1_ += aLongArray10351[(10 + (1927387759 * anInt10350 - i)) % 10];
	return l_1_ / (long) (-1793929459 * anInt10355);
    }
    
    void method8281(int i) {
	aLong10353 = 0L;
	if (aLong10354 * 5700793523570564387L
	    > -3744195550137832823L * aLong10352)
	    aLong10352 += aLong10354 * 4749623441952698187L - 1L * aLong10352;
    }
    
    long method8292() {
	return -3744195550137832823L * aLong10352;
    }
    
    int method8298(long l) {
	if (aLong10354 * 5700793523570564387L
	    > aLong10352 * -3744195550137832823L) {
	    aLong10353 += (aLong10354 * -3571938639842052431L
			   - 5303944491593689203L * aLong10352);
	    aLong10352 += 4749623441952698187L * aLong10354 - 1L * aLong10352;
	    aLong10354 += -3136186946630862197L * l;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    aLong10354 += -3136186946630862197L * l;
	} while (i < 10 && (aLong10354 * 5700793523570564387L
			    < aLong10352 * -3744195550137832823L));
	if (5700793523570564387L * aLong10354
	    < -3744195550137832823L * aLong10352)
	    aLong10354 = 8728455264336487011L * aLong10352;
	return i;
    }
    
    long method8297(int i) {
	return -3744195550137832823L * aLong10352;
    }
    
    long method15980(int i) {
	long l = System.nanoTime();
	long l_2_ = l - aLong10353 * 7085173481284529683L;
	aLong10353 = 6978492438888549403L * l;
	if (l_2_ > -5000000000L && l_2_ < 5000000000L) {
	    aLongArray10351[1927387759 * anInt10350] = l_2_;
	    anInt10350 = -1744894833 * ((1 + anInt10350 * 1927387759) % 10);
	    if (anInt10355 * -1793929459 < 1)
		anInt10355 += 1753126853;
	}
	long l_3_ = 0L;
	for (int i_4_ = 1; i_4_ <= -1793929459 * anInt10355; i_4_++)
	    l_3_ += (aLongArray10351
		     [(10 + (1927387759 * anInt10350 - i_4_)) % 10]);
	return l_3_ / (long) (-1793929459 * anInt10355);
    }
    
    Class502_Sub2() {
	aLong10353 = 0L;
	aLongArray10351 = new long[10];
	anInt10350 = 0;
	anInt10355 = 1753126853;
	aLong10352 = System.nanoTime() * -6277576690521412679L;
	aLong10354 = System.nanoTime() * -3136186946630862197L;
    }
    
    long method8284() {
	aLong10352 += method15980(1377638037) * -6277576690521412679L;
	if (5700793523570564387L * aLong10354
	    > aLong10352 * -3744195550137832823L)
	    return ((aLong10354 * 5700793523570564387L
		     - aLong10352 * -3744195550137832823L)
		    / 1000000L);
	return 0L;
    }
    
    long method8287() {
	aLong10352 += method15980(1264555641) * -6277576690521412679L;
	if (5700793523570564387L * aLong10354
	    > aLong10352 * -3744195550137832823L)
	    return ((aLong10354 * 5700793523570564387L
		     - aLong10352 * -3744195550137832823L)
		    / 1000000L);
	return 0L;
    }
    
    long method8291() {
	return -3744195550137832823L * aLong10352;
    }
    
    long method8286() {
	aLong10352 += method15980(-1489369543) * -6277576690521412679L;
	if (5700793523570564387L * aLong10354
	    > aLong10352 * -3744195550137832823L)
	    return ((aLong10354 * 5700793523570564387L
		     - aLong10352 * -3744195550137832823L)
		    / 1000000L);
	return 0L;
    }
    
    int method8289(long l) {
	if (aLong10354 * 5700793523570564387L
	    > aLong10352 * -3744195550137832823L) {
	    aLong10353 += (aLong10354 * -3571938639842052431L
			   - 5303944491593689203L * aLong10352);
	    aLong10352 += 4749623441952698187L * aLong10354 - 1L * aLong10352;
	    aLong10354 += -3136186946630862197L * l;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    aLong10354 += -3136186946630862197L * l;
	} while (i < 10 && (aLong10354 * 5700793523570564387L
			    < aLong10352 * -3744195550137832823L));
	if (5700793523570564387L * aLong10354
	    < -3744195550137832823L * aLong10352)
	    aLong10354 = 8728455264336487011L * aLong10352;
	return i;
    }
    
    int method8279(long l) {
	if (aLong10354 * 5700793523570564387L
	    > aLong10352 * -3744195550137832823L) {
	    aLong10353 += (aLong10354 * -3571938639842052431L
			   - 5303944491593689203L * aLong10352);
	    aLong10352 += 4749623441952698187L * aLong10354 - 1L * aLong10352;
	    aLong10354 += -3136186946630862197L * l;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    aLong10354 += -3136186946630862197L * l;
	} while (i < 10 && (aLong10354 * 5700793523570564387L
			    < aLong10352 * -3744195550137832823L));
	if (5700793523570564387L * aLong10354
	    < -3744195550137832823L * aLong10352)
	    aLong10354 = 8728455264336487011L * aLong10352;
	return i;
    }
    
    void method8285() {
	aLong10353 = 0L;
	if (aLong10354 * 5700793523570564387L
	    > -3744195550137832823L * aLong10352)
	    aLong10352 += aLong10354 * 4749623441952698187L - 1L * aLong10352;
    }
    
    long method8296() {
	return -3744195550137832823L * aLong10352;
    }
    
    long method8288() {
	aLong10352 += method15980(965186986) * -6277576690521412679L;
	if (5700793523570564387L * aLong10354
	    > aLong10352 * -3744195550137832823L)
	    return ((aLong10354 * 5700793523570564387L
		     - aLong10352 * -3744195550137832823L)
		    / 1000000L);
	return 0L;
    }
    
    long method8293() {
	return -3744195550137832823L * aLong10352;
    }
    
    long method8301() {
	return -3744195550137832823L * aLong10352;
    }
    
    long method15981() {
	long l = System.nanoTime();
	long l_5_ = l - aLong10353 * 7085173481284529683L;
	aLong10353 = 6978492438888549403L * l;
	if (l_5_ > -5000000000L && l_5_ < 5000000000L) {
	    aLongArray10351[1927387759 * anInt10350] = l_5_;
	    anInt10350 = -1744894833 * ((1 + anInt10350 * 1927387759) % 10);
	    if (anInt10355 * -1793929459 < 1)
		anInt10355 += 1753126853;
	}
	long l_6_ = 0L;
	for (int i = 1; i <= -1793929459 * anInt10355; i++)
	    l_6_ += aLongArray10351[(10 + (1927387759 * anInt10350 - i)) % 10];
	return l_6_ / (long) (-1793929459 * anInt10355);
    }
    
    long method8282(int i) {
	aLong10352 += method15980(703290959) * -6277576690521412679L;
	if (5700793523570564387L * aLong10354
	    > aLong10352 * -3744195550137832823L)
	    return ((aLong10354 * 5700793523570564387L
		     - aLong10352 * -3744195550137832823L)
		    / 1000000L);
	return 0L;
    }
    
    public static Class534_Sub29 method15982(byte i) {
	if (null == Class554_Sub1.aClass700_7413
	    || null == Class554_Sub1.aClass710_10688)
	    return null;
	Class554_Sub1.aClass710_10688.method14307(Class554_Sub1.aClass700_7413,
						  -347494133);
	Class534_Sub29 class534_sub29
	    = ((Class534_Sub29)
	       Class554_Sub1.aClass710_10688.method14308((byte) 66));
	if (null == class534_sub29)
	    return null;
	Class272 class272
	    = ((Class272)
	       Class554_Sub1.aClass44_Sub9_7349.method91(((class534_sub29
							   .anInt10652)
							  * 1592054281),
							 1274335356));
	if (null == class272 || !class272.aBool2971
	    || !class272.method5063(Class554_Sub1.anInterface18_7352,
				    Class554_Sub1.anInterface20_7351,
				    (short) 3203))
	    return Class324_Sub2.method15700(1647029865);
	return class534_sub29;
    }
    
    public static char method15983(byte i, int i_7_) {
	int i_8_ = i & 0xff;
	if (i_8_ == 0)
	    throw new IllegalArgumentException(new StringBuilder().append
						   ("").append
						   (Integer.toString(i_8_, 16))
						   .toString());
	if (i_8_ >= 128 && i_8_ < 160) {
	    int i_9_ = Class685.aCharArray8697[i_8_ - 128];
	    if (0 == i_9_)
		i_9_ = 63;
	    i_8_ = i_9_;
	}
	return (char) i_8_;
    }
    
    static final void method15984(Class669 class669, short i) {
	int i_10_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_10_, -494450851);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2467 * -612037017;
    }
}
