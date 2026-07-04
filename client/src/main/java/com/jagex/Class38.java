/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;
import java.io.IOException;

public class Class38
{
    int anInt293;
    Class24 aClass24_294;
    long aLong295;
    long aLong296 = 4871811050044947503L;
    int anInt297;
    byte[] aByteArray298;
    long aLong299 = -5735858632782862769L;
    byte[] aByteArray300;
    long aLong301;
    long aLong302;
    static final int anInt303 = 200000000;
    long aLong304;
    
    public void method944() throws IOException {
	method952(253400880);
	aClass24_294.method832(608263561);
    }
    
    public void method945(int i) throws IOException {
	method952(253400880);
	aClass24_294.method832(1563734760);
    }
    
    public long method946() {
	return 9104204834373849559L * aLong295;
    }
    
    public void method947(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	aLong301 = l * 3989725537163139883L;
    }
    
    public void method948(byte[] is, byte i) throws IOException {
	method949(is, 0, is.length, -648000292);
    }
    
    public void method949(byte[] is, int i, int i_0_, int i_1_)
	throws IOException {
	try {
	    if (i + i_0_ > is.length)
		throw new ArrayIndexOutOfBoundsException(i_0_ + i - is.length);
	    if (-8118601995883557039L * aLong299 != -1L
		&& (6067788942835321731L * aLong301
		    >= aLong299 * -8118601995883557039L)
		&& ((long) i_0_ + aLong301 * 6067788942835321731L
		    <= ((long) (anInt293 * -688349183)
			+ -8118601995883557039L * aLong299))) {
		System.arraycopy(aByteArray298,
				 (int) (aLong301 * 6067788942835321731L
					- aLong299 * -8118601995883557039L),
				 is, i, i_0_);
		aLong301 += 3989725537163139883L * (long) i_0_;
		return;
	    }
	    long l = aLong301 * 6067788942835321731L;
	    int i_2_ = i;
	    int i_3_ = i_0_;
	    if ((6067788942835321731L * aLong301
		 >= aLong296 * 7235580931784160561L)
		&& (aLong301 * 6067788942835321731L
		    < aLong296 * 7235580931784160561L + (long) (-2034529659
								* anInt297))) {
		int i_4_ = (int) ((long) (-2034529659 * anInt297)
				  - (aLong301 * 6067788942835321731L
				     - aLong296 * 7235580931784160561L));
		if (i_4_ > i_0_)
		    i_4_ = i_0_;
		System.arraycopy(aByteArray300,
				 (int) (6067788942835321731L * aLong301
					- aLong296 * 7235580931784160561L),
				 is, i, i_4_);
		aLong301 += (long) i_4_ * 3989725537163139883L;
		i += i_4_;
		i_0_ -= i_4_;
	    }
	    if (i_0_ > aByteArray300.length) {
		aClass24_294.method829(6067788942835321731L * aLong301);
		aLong304 = aLong301 * -5666985623075236569L;
		int i_5_;
		for (/**/; i_0_ > 0; i_0_ -= i_5_) {
		    i_5_ = aClass24_294.method843(is, i, i_0_, 2113374510);
		    if (i_5_ == -1)
			break;
		    aLong304 += 8113706793027840653L * (long) i_5_;
		    aLong301 += 3989725537163139883L * (long) i_5_;
		    i += i_5_;
		}
	    } else if (i_0_ > 0) {
		method950(-1834753114);
		int i_6_ = i_0_;
		if (i_6_ > -2034529659 * anInt297)
		    i_6_ = anInt297 * -2034529659;
		System.arraycopy(aByteArray300, 0, is, i, i_6_);
		i += i_6_;
		i_0_ -= i_6_;
		aLong301 += 3989725537163139883L * (long) i_6_;
	    }
	    if (-1L != -8118601995883557039L * aLong299) {
		if ((-8118601995883557039L * aLong299
		     > aLong301 * 6067788942835321731L)
		    && i_0_ > 0) {
		    int i_7_ = i + (int) (aLong299 * -8118601995883557039L
					  - aLong301 * 6067788942835321731L);
		    if (i_7_ > i_0_ + i)
			i_7_ = i_0_ + i;
		    while (i < i_7_) {
			is[i++] = (byte) 0;
			i_0_--;
			aLong301 += 3989725537163139883L;
		    }
		}
		long l_8_ = -1L;
		long l_9_ = -1L;
		if (aLong299 * -8118601995883557039L >= l
		    && -8118601995883557039L * aLong299 < (long) i_3_ + l)
		    l_8_ = aLong299 * -8118601995883557039L;
		else if (l >= -8118601995883557039L * aLong299
			 && l < ((long) (anInt293 * -688349183)
				 + aLong299 * -8118601995883557039L))
		    l_8_ = l;
		if (-8118601995883557039L * aLong299 + (long) (-688349183
							       * anInt293) > l
		    && (-8118601995883557039L * aLong299
			+ (long) (anInt293 * -688349183)) <= l + (long) i_3_)
		    l_9_ = (aLong299 * -8118601995883557039L
			    + (long) (-688349183 * anInt293));
		else if ((long) i_3_ + l > aLong299 * -8118601995883557039L
			 && ((long) i_3_ + l
			     <= (-8118601995883557039L * aLong299
				 + (long) (anInt293 * -688349183))))
		    l_9_ = (long) i_3_ + l;
		if (l_8_ > -1L && l_9_ > l_8_) {
		    int i_10_ = (int) (l_9_ - l_8_);
		    System.arraycopy(aByteArray298,
				     (int) (l_8_ - (aLong299
						    * -8118601995883557039L)),
				     is, (int) (l_8_ - l) + i_2_, i_10_);
		    if (l_9_ > aLong301 * 6067788942835321731L) {
			i_0_ -= l_9_ - 6067788942835321731L * aLong301;
			aLong301 = l_9_ * 3989725537163139883L;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    aLong304 = -8113706793027840653L;
	    throw ioexception;
	}
	if (i_0_ > 0)
	    throw new EOFException();
    }
    
    void method950(int i) throws IOException {
	anInt297 = 0;
	if (6067788942835321731L * aLong301
	    != 349747260834687045L * aLong304) {
	    aClass24_294.method829(6067788942835321731L * aLong301);
	    aLong304 = aLong301 * -5666985623075236569L;
	}
	aLong296 = 7026873020493360883L * aLong301;
	int i_11_;
	for (/**/; anInt297 * -2034529659 < aByteArray300.length;
	     anInt297 += i_11_ * -552018355) {
	    int i_12_ = aByteArray300.length - anInt297 * -2034529659;
	    if (i_12_ > 200000000)
		i_12_ = 200000000;
	    i_11_
		= aClass24_294.method843(aByteArray300, -2034529659 * anInt297,
					 i_12_, 1893304515);
	    if (-1 == i_11_)
		break;
	    aLong304 += (long) i_11_ * 8113706793027840653L;
	}
    }
    
    public void method951(byte[] is, int i, int i_13_, int i_14_)
	throws IOException {
	do {
	    try {
		if ((long) i_13_ + 6067788942835321731L * aLong301
		    > aLong295 * 9104204834373849559L)
		    aLong295
			= (((long) i_13_ + aLong301 * 6067788942835321731L)
			   * 1698876887390302695L);
		if (-1L != -8118601995883557039L * aLong299
		    && ((aLong301 * 6067788942835321731L
			 < aLong299 * -8118601995883557039L)
			|| (6067788942835321731L * aLong301
			    > (-8118601995883557039L * aLong299
			       + (long) (anInt293 * -688349183)))))
		    method952(253400880);
		if (-1L != aLong299 * -8118601995883557039L
		    && ((long) i_13_ + 6067788942835321731L * aLong301
			> ((long) aByteArray298.length
			   + -8118601995883557039L * aLong299))) {
		    int i_15_ = (int) ((long) aByteArray298.length
				       - (6067788942835321731L * aLong301
					  - -8118601995883557039L * aLong299));
		    System.arraycopy(is, i, aByteArray298,
				     (int) (aLong301 * 6067788942835321731L
					    - (-8118601995883557039L
					       * aLong299)),
				     i_15_);
		    aLong301 += (long) i_15_ * 3989725537163139883L;
		    i += i_15_;
		    i_13_ -= i_15_;
		    anInt293 = -1928896511 * aByteArray298.length;
		    method952(253400880);
		}
		if (i_13_ > aByteArray298.length) {
		    if (349747260834687045L * aLong304
			!= 6067788942835321731L * aLong301) {
			aClass24_294
			    .method829(aLong301 * 6067788942835321731L);
			aLong304 = aLong301 * -5666985623075236569L;
		    }
		    aClass24_294.method844(is, i, i_13_, 454464553);
		    aLong304 += 8113706793027840653L * (long) i_13_;
		    if (aLong304 * 349747260834687045L
			> aLong302 * 3842458647390277985L)
			aLong302 = aLong304 * 4957939853558459749L;
		    long l = -1L;
		    long l_16_ = -1L;
		    if ((aLong301 * 6067788942835321731L
			 >= aLong296 * 7235580931784160561L)
			&& (aLong301 * 6067788942835321731L
			    < (aLong296 * 7235580931784160561L
			       + (long) (anInt297 * -2034529659))))
			l = aLong301 * 6067788942835321731L;
		    else if ((7235580931784160561L * aLong296
			      >= aLong301 * 6067788942835321731L)
			     && (7235580931784160561L * aLong296
				 < ((long) i_13_
				    + aLong301 * 6067788942835321731L)))
			l = 7235580931784160561L * aLong296;
		    if ((6067788942835321731L * aLong301 + (long) i_13_
			 > aLong296 * 7235580931784160561L)
			&& (6067788942835321731L * aLong301 + (long) i_13_
			    <= (7235580931784160561L * aLong296
				+ (long) (-2034529659 * anInt297))))
			l_16_ = aLong301 * 6067788942835321731L + (long) i_13_;
		    else if ((((long) (anInt297 * -2034529659)
			       + aLong296 * 7235580931784160561L)
			      > aLong301 * 6067788942835321731L)
			     && (((long) (anInt297 * -2034529659)
				  + aLong296 * 7235580931784160561L)
				 <= (6067788942835321731L * aLong301
				     + (long) i_13_)))
			l_16_ = ((long) (-2034529659 * anInt297)
				 + 7235580931784160561L * aLong296);
		    if (l > -1L && l_16_ > l) {
			int i_17_ = (int) (l_16_ - l);
			System.arraycopy(is,
					 (int) (l + (long) i
						- (6067788942835321731L
						   * aLong301)),
					 aByteArray300,
					 (int) (l - (aLong296
						     * 7235580931784160561L)),
					 i_17_);
		    }
		    aLong301 += 3989725537163139883L * (long) i_13_;
		} else {
		    if (i_13_ <= 0)
			break;
		    if (-1L == aLong299 * -8118601995883557039L)
			aLong299 = aLong301 * 5444352448561512595L;
		    System.arraycopy(is, i, aByteArray298,
				     (int) (6067788942835321731L * aLong301
					    - (-8118601995883557039L
					       * aLong299)),
				     i_13_);
		    aLong301 += 3989725537163139883L * (long) i_13_;
		    if ((6067788942835321731L * aLong301
			 - aLong299 * -8118601995883557039L)
			> (long) (anInt293 * -688349183))
			anInt293 = ((int) (aLong301 * 6067788942835321731L
					   - aLong299 * -8118601995883557039L)
				    * -1928896511);
		}
	    } catch (IOException ioexception) {
		aLong304 = -8113706793027840653L;
		throw ioexception;
	    }
	    break;
	} while (false);
    }
    
    void method952(int i) throws IOException {
	if (-1L != -8118601995883557039L * aLong299) {
	    if (349747260834687045L * aLong304
		!= -8118601995883557039L * aLong299) {
		aClass24_294.method829(-8118601995883557039L * aLong299);
		aLong304 = aLong299 * 5722967004091578781L;
	    }
	    aClass24_294.method844(aByteArray298, 0, -688349183 * anInt293,
				   454464553);
	    aLong304 += (long) anInt293 * 2421171938581367437L;
	    if (aLong304 * 349747260834687045L
		> 3842458647390277985L * aLong302)
		aLong302 = 4957939853558459749L * aLong304;
	    long l = -1L;
	    long l_18_ = -1L;
	    if ((aLong299 * -8118601995883557039L
		 >= 7235580931784160561L * aLong296)
		&& (-8118601995883557039L * aLong299
		    < 7235580931784160561L * aLong296 + (long) (-2034529659
								* anInt297)))
		l = aLong299 * -8118601995883557039L;
	    else if ((aLong296 * 7235580931784160561L
		      >= aLong299 * -8118601995883557039L)
		     && (7235580931784160561L * aLong296
			 < ((long) (-688349183 * anInt293)
			    + -8118601995883557039L * aLong299)))
		l = aLong296 * 7235580931784160561L;
	    if ((((long) (anInt293 * -688349183)
		  + -8118601995883557039L * aLong299)
		 > 7235580931784160561L * aLong296)
		&& (((long) (anInt293 * -688349183)
		     + -8118601995883557039L * aLong299)
		    <= ((long) (anInt297 * -2034529659)
			+ 7235580931784160561L * aLong296)))
		l_18_ = aLong299 * -8118601995883557039L + (long) (-688349183
								   * anInt293);
	    else if ((((long) (-2034529659 * anInt297)
		       + aLong296 * 7235580931784160561L)
		      > aLong299 * -8118601995883557039L)
		     && (((long) (anInt297 * -2034529659)
			  + 7235580931784160561L * aLong296)
			 <= (aLong299 * -8118601995883557039L
			     + (long) (anInt293 * -688349183))))
		l_18_ = ((long) (-2034529659 * anInt297)
			 + 7235580931784160561L * aLong296);
	    if (l > -1L && l_18_ > l) {
		int i_19_ = (int) (l_18_ - l);
		System.arraycopy(aByteArray298,
				 (int) (l - aLong299 * -8118601995883557039L),
				 aByteArray300,
				 (int) (l - 7235580931784160561L * aLong296),
				 i_19_);
	    }
	    aLong299 = -5735858632782862769L;
	    anInt293 = 0;
	}
    }
    
    void method953() throws IOException {
	anInt297 = 0;
	if (6067788942835321731L * aLong301
	    != 349747260834687045L * aLong304) {
	    aClass24_294.method829(6067788942835321731L * aLong301);
	    aLong304 = aLong301 * -5666985623075236569L;
	}
	aLong296 = 7026873020493360883L * aLong301;
	int i;
	for (/**/; anInt297 * -2034529659 < aByteArray300.length;
	     anInt297 += i * -552018355) {
	    int i_20_ = aByteArray300.length - anInt297 * -2034529659;
	    if (i_20_ > 200000000)
		i_20_ = 200000000;
	    i = aClass24_294.method843(aByteArray300, -2034529659 * anInt297,
				       i_20_, 2008898993);
	    if (-1 == i)
		break;
	    aLong304 += (long) i * 8113706793027840653L;
	}
    }
    
    public void method954(byte[] is, int i, int i_21_) throws IOException {
	try {
	    if (i + i_21_ > is.length)
		throw new ArrayIndexOutOfBoundsException(i_21_ + i
							 - is.length);
	    if (-8118601995883557039L * aLong299 != -1L
		&& (6067788942835321731L * aLong301
		    >= aLong299 * -8118601995883557039L)
		&& ((long) i_21_ + aLong301 * 6067788942835321731L
		    <= ((long) (anInt293 * -688349183)
			+ -8118601995883557039L * aLong299))) {
		System.arraycopy(aByteArray298,
				 (int) (aLong301 * 6067788942835321731L
					- aLong299 * -8118601995883557039L),
				 is, i, i_21_);
		aLong301 += 3989725537163139883L * (long) i_21_;
		return;
	    }
	    long l = aLong301 * 6067788942835321731L;
	    int i_22_ = i;
	    int i_23_ = i_21_;
	    if ((6067788942835321731L * aLong301
		 >= aLong296 * 7235580931784160561L)
		&& (aLong301 * 6067788942835321731L
		    < aLong296 * 7235580931784160561L + (long) (-2034529659
								* anInt297))) {
		int i_24_ = (int) ((long) (-2034529659 * anInt297)
				   - (aLong301 * 6067788942835321731L
				      - aLong296 * 7235580931784160561L));
		if (i_24_ > i_21_)
		    i_24_ = i_21_;
		System.arraycopy(aByteArray300,
				 (int) (6067788942835321731L * aLong301
					- aLong296 * 7235580931784160561L),
				 is, i, i_24_);
		aLong301 += (long) i_24_ * 3989725537163139883L;
		i += i_24_;
		i_21_ -= i_24_;
	    }
	    if (i_21_ > aByteArray300.length) {
		aClass24_294.method829(6067788942835321731L * aLong301);
		aLong304 = aLong301 * -5666985623075236569L;
		int i_25_;
		for (/**/; i_21_ > 0; i_21_ -= i_25_) {
		    i_25_ = aClass24_294.method843(is, i, i_21_, 1884715975);
		    if (i_25_ == -1)
			break;
		    aLong304 += 8113706793027840653L * (long) i_25_;
		    aLong301 += 3989725537163139883L * (long) i_25_;
		    i += i_25_;
		}
	    } else if (i_21_ > 0) {
		method950(-1834753114);
		int i_26_ = i_21_;
		if (i_26_ > -2034529659 * anInt297)
		    i_26_ = anInt297 * -2034529659;
		System.arraycopy(aByteArray300, 0, is, i, i_26_);
		i += i_26_;
		i_21_ -= i_26_;
		aLong301 += 3989725537163139883L * (long) i_26_;
	    }
	    if (-1L != -8118601995883557039L * aLong299) {
		if ((-8118601995883557039L * aLong299
		     > aLong301 * 6067788942835321731L)
		    && i_21_ > 0) {
		    int i_27_ = i + (int) (aLong299 * -8118601995883557039L
					   - aLong301 * 6067788942835321731L);
		    if (i_27_ > i_21_ + i)
			i_27_ = i_21_ + i;
		    while (i < i_27_) {
			is[i++] = (byte) 0;
			i_21_--;
			aLong301 += 3989725537163139883L;
		    }
		}
		long l_28_ = -1L;
		long l_29_ = -1L;
		if (aLong299 * -8118601995883557039L >= l
		    && -8118601995883557039L * aLong299 < (long) i_23_ + l)
		    l_28_ = aLong299 * -8118601995883557039L;
		else if (l >= -8118601995883557039L * aLong299
			 && l < ((long) (anInt293 * -688349183)
				 + aLong299 * -8118601995883557039L))
		    l_28_ = l;
		if (-8118601995883557039L * aLong299 + (long) (-688349183
							       * anInt293) > l
		    && (-8118601995883557039L * aLong299
			+ (long) (anInt293 * -688349183)) <= l + (long) i_23_)
		    l_29_ = (aLong299 * -8118601995883557039L
			     + (long) (-688349183 * anInt293));
		else if ((long) i_23_ + l > aLong299 * -8118601995883557039L
			 && ((long) i_23_ + l
			     <= (-8118601995883557039L * aLong299
				 + (long) (anInt293 * -688349183))))
		    l_29_ = (long) i_23_ + l;
		if (l_28_ > -1L && l_29_ > l_28_) {
		    int i_30_ = (int) (l_29_ - l_28_);
		    System.arraycopy(aByteArray298,
				     (int) (l_28_ - (aLong299
						     * -8118601995883557039L)),
				     is, (int) (l_28_ - l) + i_22_, i_30_);
		    if (l_29_ > aLong301 * 6067788942835321731L) {
			i_21_ -= l_29_ - 6067788942835321731L * aLong301;
			aLong301 = l_29_ * 3989725537163139883L;
		    }
		}
	    }
	} catch (IOException ioexception) {
	    aLong304 = -8113706793027840653L;
	    throw ioexception;
	}
	if (i_21_ > 0)
	    throw new EOFException();
    }
    
    public void method955() throws IOException {
	method952(253400880);
	aClass24_294.method832(832354869);
    }
    
    public void method956() throws IOException {
	method952(253400880);
	aClass24_294.method832(1772662037);
    }
    
    public long method957() {
	return 9104204834373849559L * aLong295;
    }
    
    public void method958(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	aLong301 = l * 3989725537163139883L;
    }
    
    public void method959(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	aLong301 = l * 3989725537163139883L;
    }
    
    public void method960(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	aLong301 = l * 3989725537163139883L;
    }
    
    void method961() throws IOException {
	anInt297 = 0;
	if (6067788942835321731L * aLong301
	    != 349747260834687045L * aLong304) {
	    aClass24_294.method829(6067788942835321731L * aLong301);
	    aLong304 = aLong301 * -5666985623075236569L;
	}
	aLong296 = 7026873020493360883L * aLong301;
	int i;
	for (/**/; anInt297 * -2034529659 < aByteArray300.length;
	     anInt297 += i * -552018355) {
	    int i_31_ = aByteArray300.length - anInt297 * -2034529659;
	    if (i_31_ > 200000000)
		i_31_ = 200000000;
	    i = aClass24_294.method843(aByteArray300, -2034529659 * anInt297,
				       i_31_, 2129522766);
	    if (-1 == i)
		break;
	    aLong304 += (long) i * 8113706793027840653L;
	}
    }
    
    public long method962() {
	return 9104204834373849559L * aLong295;
    }
    
    public void method963(long l) throws IOException {
	if (l < 0L)
	    throw new IOException();
	aLong301 = l * 3989725537163139883L;
    }
    
    public long method964(byte i) {
	return 9104204834373849559L * aLong295;
    }
    
    public long method965() {
	return 9104204834373849559L * aLong295;
    }
    
    public Class38(Class24 class24, int i, int i_32_) throws IOException {
	anInt293 = 0;
	aClass24_294 = class24;
	aLong295
	    = ((aLong302 = class24.method831(52245399) * -7942155805858393439L)
	       * -637047553155203193L);
	aByteArray300 = new byte[i];
	aByteArray298 = new byte[i_32_];
	aLong301 = 0L;
    }
    
    public void method966() throws IOException {
	method952(253400880);
	aClass24_294.method832(644484990);
    }
    
    void method967() throws IOException {
	anInt297 = 0;
	if (6067788942835321731L * aLong301
	    != 349747260834687045L * aLong304) {
	    aClass24_294.method829(6067788942835321731L * aLong301);
	    aLong304 = aLong301 * -5666985623075236569L;
	}
	aLong296 = 7026873020493360883L * aLong301;
	int i;
	for (/**/; anInt297 * -2034529659 < aByteArray300.length;
	     anInt297 += i * -552018355) {
	    int i_33_ = aByteArray300.length - anInt297 * -2034529659;
	    if (i_33_ > 200000000)
		i_33_ = 200000000;
	    i = aClass24_294.method843(aByteArray300, -2034529659 * anInt297,
				       i_33_, 1691823313);
	    if (-1 == i)
		break;
	    aLong304 += (long) i * 8113706793027840653L;
	}
    }
    
    void method968() throws IOException {
	anInt297 = 0;
	if (6067788942835321731L * aLong301
	    != 349747260834687045L * aLong304) {
	    aClass24_294.method829(6067788942835321731L * aLong301);
	    aLong304 = aLong301 * -5666985623075236569L;
	}
	aLong296 = 7026873020493360883L * aLong301;
	int i;
	for (/**/; anInt297 * -2034529659 < aByteArray300.length;
	     anInt297 += i * -552018355) {
	    int i_34_ = aByteArray300.length - anInt297 * -2034529659;
	    if (i_34_ > 200000000)
		i_34_ = 200000000;
	    i = aClass24_294.method843(aByteArray300, -2034529659 * anInt297,
				       i_34_, 1880753715);
	    if (-1 == i)
		break;
	    aLong304 += (long) i * 8113706793027840653L;
	}
    }
    
    void method969() throws IOException {
	anInt297 = 0;
	if (6067788942835321731L * aLong301
	    != 349747260834687045L * aLong304) {
	    aClass24_294.method829(6067788942835321731L * aLong301);
	    aLong304 = aLong301 * -5666985623075236569L;
	}
	aLong296 = 7026873020493360883L * aLong301;
	int i;
	for (/**/; anInt297 * -2034529659 < aByteArray300.length;
	     anInt297 += i * -552018355) {
	    int i_35_ = aByteArray300.length - anInt297 * -2034529659;
	    if (i_35_ > 200000000)
		i_35_ = 200000000;
	    i = aClass24_294.method843(aByteArray300, -2034529659 * anInt297,
				       i_35_, 2129884793);
	    if (-1 == i)
		break;
	    aLong304 += (long) i * 8113706793027840653L;
	}
    }
    
    public void method970(byte[] is, int i, int i_36_) throws IOException {
	do {
	    try {
		if ((long) i_36_ + 6067788942835321731L * aLong301
		    > aLong295 * 9104204834373849559L)
		    aLong295
			= (((long) i_36_ + aLong301 * 6067788942835321731L)
			   * 1698876887390302695L);
		if (-1L != -8118601995883557039L * aLong299
		    && ((aLong301 * 6067788942835321731L
			 < aLong299 * -8118601995883557039L)
			|| (6067788942835321731L * aLong301
			    > (-8118601995883557039L * aLong299
			       + (long) (anInt293 * -688349183)))))
		    method952(253400880);
		if (-1L != aLong299 * -8118601995883557039L
		    && ((long) i_36_ + 6067788942835321731L * aLong301
			> ((long) aByteArray298.length
			   + -8118601995883557039L * aLong299))) {
		    int i_37_ = (int) ((long) aByteArray298.length
				       - (6067788942835321731L * aLong301
					  - -8118601995883557039L * aLong299));
		    System.arraycopy(is, i, aByteArray298,
				     (int) (aLong301 * 6067788942835321731L
					    - (-8118601995883557039L
					       * aLong299)),
				     i_37_);
		    aLong301 += (long) i_37_ * 3989725537163139883L;
		    i += i_37_;
		    i_36_ -= i_37_;
		    anInt293 = -1928896511 * aByteArray298.length;
		    method952(253400880);
		}
		if (i_36_ > aByteArray298.length) {
		    if (349747260834687045L * aLong304
			!= 6067788942835321731L * aLong301) {
			aClass24_294
			    .method829(aLong301 * 6067788942835321731L);
			aLong304 = aLong301 * -5666985623075236569L;
		    }
		    aClass24_294.method844(is, i, i_36_, 454464553);
		    aLong304 += 8113706793027840653L * (long) i_36_;
		    if (aLong304 * 349747260834687045L
			> aLong302 * 3842458647390277985L)
			aLong302 = aLong304 * 4957939853558459749L;
		    long l = -1L;
		    long l_38_ = -1L;
		    if ((aLong301 * 6067788942835321731L
			 >= aLong296 * 7235580931784160561L)
			&& (aLong301 * 6067788942835321731L
			    < (aLong296 * 7235580931784160561L
			       + (long) (anInt297 * -2034529659))))
			l = aLong301 * 6067788942835321731L;
		    else if ((7235580931784160561L * aLong296
			      >= aLong301 * 6067788942835321731L)
			     && (7235580931784160561L * aLong296
				 < ((long) i_36_
				    + aLong301 * 6067788942835321731L)))
			l = 7235580931784160561L * aLong296;
		    if ((6067788942835321731L * aLong301 + (long) i_36_
			 > aLong296 * 7235580931784160561L)
			&& (6067788942835321731L * aLong301 + (long) i_36_
			    <= (7235580931784160561L * aLong296
				+ (long) (-2034529659 * anInt297))))
			l_38_ = aLong301 * 6067788942835321731L + (long) i_36_;
		    else if ((((long) (anInt297 * -2034529659)
			       + aLong296 * 7235580931784160561L)
			      > aLong301 * 6067788942835321731L)
			     && (((long) (anInt297 * -2034529659)
				  + aLong296 * 7235580931784160561L)
				 <= (6067788942835321731L * aLong301
				     + (long) i_36_)))
			l_38_ = ((long) (-2034529659 * anInt297)
				 + 7235580931784160561L * aLong296);
		    if (l > -1L && l_38_ > l) {
			int i_39_ = (int) (l_38_ - l);
			System.arraycopy(is,
					 (int) (l + (long) i
						- (6067788942835321731L
						   * aLong301)),
					 aByteArray300,
					 (int) (l - (aLong296
						     * 7235580931784160561L)),
					 i_39_);
		    }
		    aLong301 += 3989725537163139883L * (long) i_36_;
		} else {
		    if (i_36_ <= 0)
			break;
		    if (-1L == aLong299 * -8118601995883557039L)
			aLong299 = aLong301 * 5444352448561512595L;
		    System.arraycopy(is, i, aByteArray298,
				     (int) (6067788942835321731L * aLong301
					    - (-8118601995883557039L
					       * aLong299)),
				     i_36_);
		    aLong301 += 3989725537163139883L * (long) i_36_;
		    if ((6067788942835321731L * aLong301
			 - aLong299 * -8118601995883557039L)
			> (long) (anInt293 * -688349183))
			anInt293 = ((int) (aLong301 * 6067788942835321731L
					   - aLong299 * -8118601995883557039L)
				    * -1928896511);
		}
	    } catch (IOException ioexception) {
		aLong304 = -8113706793027840653L;
		throw ioexception;
	    }
	    break;
	} while (false);
    }
    
    public void method971(byte[] is, int i, int i_40_) throws IOException {
	do {
	    try {
		if ((long) i_40_ + 6067788942835321731L * aLong301
		    > aLong295 * 9104204834373849559L)
		    aLong295
			= (((long) i_40_ + aLong301 * 6067788942835321731L)
			   * 1698876887390302695L);
		if (-1L != -8118601995883557039L * aLong299
		    && ((aLong301 * 6067788942835321731L
			 < aLong299 * -8118601995883557039L)
			|| (6067788942835321731L * aLong301
			    > (-8118601995883557039L * aLong299
			       + (long) (anInt293 * -688349183)))))
		    method952(253400880);
		if (-1L != aLong299 * -8118601995883557039L
		    && ((long) i_40_ + 6067788942835321731L * aLong301
			> ((long) aByteArray298.length
			   + -8118601995883557039L * aLong299))) {
		    int i_41_ = (int) ((long) aByteArray298.length
				       - (6067788942835321731L * aLong301
					  - -8118601995883557039L * aLong299));
		    System.arraycopy(is, i, aByteArray298,
				     (int) (aLong301 * 6067788942835321731L
					    - (-8118601995883557039L
					       * aLong299)),
				     i_41_);
		    aLong301 += (long) i_41_ * 3989725537163139883L;
		    i += i_41_;
		    i_40_ -= i_41_;
		    anInt293 = -1928896511 * aByteArray298.length;
		    method952(253400880);
		}
		if (i_40_ > aByteArray298.length) {
		    if (349747260834687045L * aLong304
			!= 6067788942835321731L * aLong301) {
			aClass24_294
			    .method829(aLong301 * 6067788942835321731L);
			aLong304 = aLong301 * -5666985623075236569L;
		    }
		    aClass24_294.method844(is, i, i_40_, 454464553);
		    aLong304 += 8113706793027840653L * (long) i_40_;
		    if (aLong304 * 349747260834687045L
			> aLong302 * 3842458647390277985L)
			aLong302 = aLong304 * 4957939853558459749L;
		    long l = -1L;
		    long l_42_ = -1L;
		    if ((aLong301 * 6067788942835321731L
			 >= aLong296 * 7235580931784160561L)
			&& (aLong301 * 6067788942835321731L
			    < (aLong296 * 7235580931784160561L
			       + (long) (anInt297 * -2034529659))))
			l = aLong301 * 6067788942835321731L;
		    else if ((7235580931784160561L * aLong296
			      >= aLong301 * 6067788942835321731L)
			     && (7235580931784160561L * aLong296
				 < ((long) i_40_
				    + aLong301 * 6067788942835321731L)))
			l = 7235580931784160561L * aLong296;
		    if ((6067788942835321731L * aLong301 + (long) i_40_
			 > aLong296 * 7235580931784160561L)
			&& (6067788942835321731L * aLong301 + (long) i_40_
			    <= (7235580931784160561L * aLong296
				+ (long) (-2034529659 * anInt297))))
			l_42_ = aLong301 * 6067788942835321731L + (long) i_40_;
		    else if ((((long) (anInt297 * -2034529659)
			       + aLong296 * 7235580931784160561L)
			      > aLong301 * 6067788942835321731L)
			     && (((long) (anInt297 * -2034529659)
				  + aLong296 * 7235580931784160561L)
				 <= (6067788942835321731L * aLong301
				     + (long) i_40_)))
			l_42_ = ((long) (-2034529659 * anInt297)
				 + 7235580931784160561L * aLong296);
		    if (l > -1L && l_42_ > l) {
			int i_43_ = (int) (l_42_ - l);
			System.arraycopy(is,
					 (int) (l + (long) i
						- (6067788942835321731L
						   * aLong301)),
					 aByteArray300,
					 (int) (l - (aLong296
						     * 7235580931784160561L)),
					 i_43_);
		    }
		    aLong301 += 3989725537163139883L * (long) i_40_;
		} else {
		    if (i_40_ <= 0)
			break;
		    if (-1L == aLong299 * -8118601995883557039L)
			aLong299 = aLong301 * 5444352448561512595L;
		    System.arraycopy(is, i, aByteArray298,
				     (int) (6067788942835321731L * aLong301
					    - (-8118601995883557039L
					       * aLong299)),
				     i_40_);
		    aLong301 += 3989725537163139883L * (long) i_40_;
		    if ((6067788942835321731L * aLong301
			 - aLong299 * -8118601995883557039L)
			> (long) (anInt293 * -688349183))
			anInt293 = ((int) (aLong301 * 6067788942835321731L
					   - aLong299 * -8118601995883557039L)
				    * -1928896511);
		}
	    } catch (IOException ioexception) {
		aLong304 = -8113706793027840653L;
		throw ioexception;
	    }
	    break;
	} while (false);
    }
    
    void method972() throws IOException {
	if (-1L != -8118601995883557039L * aLong299) {
	    if (349747260834687045L * aLong304
		!= -8118601995883557039L * aLong299) {
		aClass24_294.method829(-8118601995883557039L * aLong299);
		aLong304 = aLong299 * 5722967004091578781L;
	    }
	    aClass24_294.method844(aByteArray298, 0, -688349183 * anInt293,
				   454464553);
	    aLong304 += (long) anInt293 * 2421171938581367437L;
	    if (aLong304 * 349747260834687045L
		> 3842458647390277985L * aLong302)
		aLong302 = 4957939853558459749L * aLong304;
	    long l = -1L;
	    long l_44_ = -1L;
	    if ((aLong299 * -8118601995883557039L
		 >= 7235580931784160561L * aLong296)
		&& (-8118601995883557039L * aLong299
		    < 7235580931784160561L * aLong296 + (long) (-2034529659
								* anInt297)))
		l = aLong299 * -8118601995883557039L;
	    else if ((aLong296 * 7235580931784160561L
		      >= aLong299 * -8118601995883557039L)
		     && (7235580931784160561L * aLong296
			 < ((long) (-688349183 * anInt293)
			    + -8118601995883557039L * aLong299)))
		l = aLong296 * 7235580931784160561L;
	    if ((((long) (anInt293 * -688349183)
		  + -8118601995883557039L * aLong299)
		 > 7235580931784160561L * aLong296)
		&& (((long) (anInt293 * -688349183)
		     + -8118601995883557039L * aLong299)
		    <= ((long) (anInt297 * -2034529659)
			+ 7235580931784160561L * aLong296)))
		l_44_ = aLong299 * -8118601995883557039L + (long) (-688349183
								   * anInt293);
	    else if ((((long) (-2034529659 * anInt297)
		       + aLong296 * 7235580931784160561L)
		      > aLong299 * -8118601995883557039L)
		     && (((long) (anInt297 * -2034529659)
			  + 7235580931784160561L * aLong296)
			 <= (aLong299 * -8118601995883557039L
			     + (long) (anInt293 * -688349183))))
		l_44_ = ((long) (-2034529659 * anInt297)
			 + 7235580931784160561L * aLong296);
	    if (l > -1L && l_44_ > l) {
		int i = (int) (l_44_ - l);
		System.arraycopy(aByteArray298,
				 (int) (l - aLong299 * -8118601995883557039L),
				 aByteArray300,
				 (int) (l - 7235580931784160561L * aLong296),
				 i);
	    }
	    aLong299 = -5735858632782862769L;
	    anInt293 = 0;
	}
    }
    
    static final void method973(Class669 class669, int i) {
	int i_45_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_45_, 1818365702);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_45_ >> 16];
	Class622.method10289(class247, class243, class669, -1794983510);
    }
    
    public static int[] method974(int i, int i_46_) {
	int[] is = new int[3];
	Class699.method14128(Class260.method4812(i, (byte) 0));
	is[0] = Class84.aCalendar838.get(5);
	is[1] = Class84.aCalendar838.get(2);
	is[2] = Class84.aCalendar838.get(1);
	return is;
    }
    
    static final void method975(Class669 class669, byte i) {
	class669.anInt8600 -= 926998689;
	int i_47_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_48_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	int i_49_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 2];
	Class491.method8082(i_49_, Class81.method1637(i_47_, i_48_, 809291972),
			    class669, (byte) 29);
    }
}
