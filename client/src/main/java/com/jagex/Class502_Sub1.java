/* Class502_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaclib.nanotime.QueryPerformanceCounter;

public class Class502_Sub1 extends Class502
{
    long[] aLongArray10289;
    long aLong10290 = 0L;
    long aLong10291;
    long aLong10292 = 0L;
    int anInt10293;
    int anInt10294;
    
    long method8286() {
	aLong10290 += method15881(-2122643257) * -8396852095198586839L;
	if (aLong10292 * -5232400543391940879L
	    > aLong10290 * 4878586447268643865L)
	    return ((aLong10292 * -5232400543391940879L
		     - aLong10290 * 4878586447268643865L)
		    / 1000000L);
	return 0L;
    }
    
    long method8291() {
	return 4878586447268643865L * aLong10290;
    }
    
    long method8282(int i) {
	aLong10290 += method15881(-1381010942) * -8396852095198586839L;
	if (aLong10292 * -5232400543391940879L
	    > aLong10290 * 4878586447268643865L)
	    return ((aLong10292 * -5232400543391940879L
		     - aLong10290 * 4878586447268643865L)
		    / 1000000L);
	return 0L;
    }
    
    long method8293() {
	return 4878586447268643865L * aLong10290;
    }
    
    long method8297(int i) {
	return 4878586447268643865L * aLong10290;
    }
    
    int method8279(long l) {
	if (-5232400543391940879L * aLong10292
	    > aLong10290 * 4878586447268643865L) {
	    aLong10291 += (6047529913974516993L * aLong10292
			   - -6892798999334740823L * aLong10290);
	    aLong10290 += -6834620542787523431L * aLong10292 - 1L * aLong10290;
	    aLong10292 += 2549510955859259921L * l;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    aLong10292 += 2549510955859259921L * l;
	} while (i < 10 && (aLong10292 * -5232400543391940879L
			    < 4878586447268643865L * aLong10290));
	if (aLong10292 * -5232400543391940879L
	    < 4878586447268643865L * aLong10290)
	    aLong10292 = -3373600579297368151L * aLong10290;
	return i;
    }
    
    void method8285() {
	aLong10291 = 0L;
	if (aLong10292 * -5232400543391940879L
	    > aLong10290 * 4878586447268643865L)
	    aLong10290 += aLong10292 * -6834620542787523431L - aLong10290 * 1L;
    }
    
    long method8292() {
	return 4878586447268643865L * aLong10290;
    }
    
    Class502_Sub1() {
	aLong10291 = 0L;
	aLongArray10289 = new long[10];
	anInt10293 = 0;
	anInt10294 = -1377951317;
	aLong10292
	    = ((aLong10290
		= QueryPerformanceCounter.nanoTime() * -8396852095198586839L)
	       * -3373600579297368151L);
	if (0L == 4878586447268643865L * aLong10290)
	    throw new RuntimeException();
    }
    
    long method8288() {
	aLong10290 += method15881(-2013223856) * -8396852095198586839L;
	if (aLong10292 * -5232400543391940879L
	    > aLong10290 * 4878586447268643865L)
	    return ((aLong10292 * -5232400543391940879L
		     - aLong10290 * 4878586447268643865L)
		    / 1000000L);
	return 0L;
    }
    
    long method15881(int i) {
	long l = QueryPerformanceCounter.nanoTime();
	long l_0_ = l - aLong10291 * 3273066997404197361L;
	aLong10291 = l * -3069990554298355951L;
	if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
	    aLongArray10289[1068011795 * anInt10293] = l_0_;
	    anInt10293 = 1699602715 * ((1068011795 * anInt10293 + 1) % 10);
	    if (263966979 * anInt10294 < 1)
		anInt10294 += -1377951317;
	}
	long l_1_ = 0L;
	for (int i_2_ = 1; i_2_ <= 263966979 * anInt10294; i_2_++)
	    l_1_ += (aLongArray10289
		     [(10 + (1068011795 * anInt10293 - i_2_)) % 10]);
	return l_1_ / (long) (anInt10294 * 263966979);
    }
    
    int method8289(long l) {
	if (-5232400543391940879L * aLong10292
	    > aLong10290 * 4878586447268643865L) {
	    aLong10291 += (6047529913974516993L * aLong10292
			   - -6892798999334740823L * aLong10290);
	    aLong10290 += -6834620542787523431L * aLong10292 - 1L * aLong10290;
	    aLong10292 += 2549510955859259921L * l;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    aLong10292 += 2549510955859259921L * l;
	} while (i < 10 && (aLong10292 * -5232400543391940879L
			    < 4878586447268643865L * aLong10290));
	if (aLong10292 * -5232400543391940879L
	    < 4878586447268643865L * aLong10290)
	    aLong10292 = -3373600579297368151L * aLong10290;
	return i;
    }
    
    long method8284() {
	aLong10290 += method15881(-1195711263) * -8396852095198586839L;
	if (aLong10292 * -5232400543391940879L
	    > aLong10290 * 4878586447268643865L)
	    return ((aLong10292 * -5232400543391940879L
		     - aLong10290 * 4878586447268643865L)
		    / 1000000L);
	return 0L;
    }
    
    int method8298(long l) {
	if (-5232400543391940879L * aLong10292
	    > aLong10290 * 4878586447268643865L) {
	    aLong10291 += (6047529913974516993L * aLong10292
			   - -6892798999334740823L * aLong10290);
	    aLong10290 += -6834620542787523431L * aLong10292 - 1L * aLong10290;
	    aLong10292 += 2549510955859259921L * l;
	    return 1;
	}
	int i = 0;
	do {
	    i++;
	    aLong10292 += 2549510955859259921L * l;
	} while (i < 10 && (aLong10292 * -5232400543391940879L
			    < 4878586447268643865L * aLong10290));
	if (aLong10292 * -5232400543391940879L
	    < 4878586447268643865L * aLong10290)
	    aLong10292 = -3373600579297368151L * aLong10290;
	return i;
    }
    
    void method8281(int i) {
	aLong10291 = 0L;
	if (aLong10292 * -5232400543391940879L
	    > aLong10290 * 4878586447268643865L)
	    aLong10290 += aLong10292 * -6834620542787523431L - aLong10290 * 1L;
    }
    
    long method8287() {
	aLong10290 += method15881(-741200758) * -8396852095198586839L;
	if (aLong10292 * -5232400543391940879L
	    > aLong10290 * 4878586447268643865L)
	    return ((aLong10292 * -5232400543391940879L
		     - aLong10290 * 4878586447268643865L)
		    / 1000000L);
	return 0L;
    }
    
    long method8296() {
	return 4878586447268643865L * aLong10290;
    }
    
    long method8301() {
	return 4878586447268643865L * aLong10290;
    }
}
