/* Class534_Sub18_Sub18_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Class534_Sub18_Sub18_Sub1 extends Class534_Sub18_Sub18
{
    Future aFuture12129;
    int anInt12130;
    
    void method18762(Future future, byte i) {
	aFuture12129 = future;
    }
    
    void method18763(Future future) {
	aFuture12129 = future;
    }
    
    byte[] method18464() {
	do {
	    if (aFuture12129.isDone()) {
		byte[] is;
		try {
		    is = ((Class474) aFuture12129.get())
			     .method7758(-286281678);
		} catch (InterruptedException interruptedexception) {
		    interruptedexception.printStackTrace();
		    break;
		} catch (ExecutionException executionexception) {
		    executionexception.printStackTrace();
		    break;
		}
		return is;
	    }
	} while (false);
	return null;
    }
    
    Class534_Sub18_Sub18_Sub1(int i) {
	anInt12130 = i * 1493378277;
    }
    
    byte[] method18459() {
	do {
	    if (aFuture12129.isDone()) {
		byte[] is;
		try {
		    is = ((Class474) aFuture12129.get()).method7758(647550727);
		} catch (InterruptedException interruptedexception) {
		    interruptedexception.printStackTrace();
		    break;
		} catch (ExecutionException executionexception) {
		    executionexception.printStackTrace();
		    break;
		}
		return is;
	    }
	} while (false);
	return null;
    }
    
    byte[] method18463() {
	do {
	    if (aFuture12129.isDone()) {
		byte[] is;
		try {
		    is = ((Class474) aFuture12129.get())
			     .method7758(1997371490);
		} catch (InterruptedException interruptedexception) {
		    interruptedexception.printStackTrace();
		    break;
		} catch (ExecutionException executionexception) {
		    executionexception.printStackTrace();
		    break;
		}
		return is;
	    }
	} while (false);
	return null;
    }
    
    int method18461(int i) {
	if (null == aFuture12129)
	    return 0;
	return aFuture12129.isDone() ? 100 : 0;
    }
    
    int method18462() {
	if (null == aFuture12129)
	    return 0;
	return aFuture12129.isDone() ? 100 : 0;
    }
    
    int method18465() {
	if (null == aFuture12129)
	    return 0;
	return aFuture12129.isDone() ? 100 : 0;
    }
    
    byte[] method18460(short i) {
	do {
	    if (aFuture12129.isDone()) {
		byte[] is;
		try {
		    is = ((Class474) aFuture12129.get())
			     .method7758(1995430679);
		} catch (InterruptedException interruptedexception) {
		    interruptedexception.printStackTrace();
		    break;
		} catch (ExecutionException executionexception) {
		    executionexception.printStackTrace();
		    break;
		}
		return is;
	    }
	} while (false);
	return null;
    }
    
    void method18764(Future future) {
	aFuture12129 = future;
    }
    
    void method18765(Future future) {
	aFuture12129 = future;
    }
    
    void method18766(Future future) {
	aFuture12129 = future;
    }
    
    int method18466() {
	if (null == aFuture12129)
	    return 0;
	return aFuture12129.isDone() ? 100 : 0;
    }
    
    static final void method18767(Class669 class669, int i) {
	class669.anInt8600 -= 308999563;
	int i_0_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	Class171_Sub4.aClass232_9944.method4216(i_0_, -534788644);
    }
}
