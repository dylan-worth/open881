/* Class381 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class381
{
    long aLong3927;
    int anInt3928;
    
    final void method6433(Class350 class350) {
	aLong3927
	    |= (long) (class350.anInt3593 << Class350.anInt3607 * anInt3928++);
    }
    
    Class381(Class350[] class350s) {
	for (int i = 0; i < class350s.length; i++)
	    method6436(class350s[i]);
    }
    
    public final int method6434() {
	return anInt3928;
    }
    
    Class381(Class350 class350) {
	aLong3927 = (long) class350.anInt3593;
	anInt3928 = 1;
    }
    
    public final Class350 method6435(int i) {
	return Class350.method6176(method6437(i));
    }
    
    final void method6436(Class350 class350) {
	aLong3927
	    |= (long) (class350.anInt3593 << Class350.anInt3607 * anInt3928++);
    }
    
    final int method6437(int i) {
	return (int) (aLong3927 >> Class350.anInt3607 * i) & 0xf;
    }
    
    public final Class350 method6438(int i) {
	return Class350.method6176(method6437(i));
    }
    
    final int method6439(int i) {
	return (int) (aLong3927 >> Class350.anInt3607 * i) & 0xf;
    }
    
    final int method6440(int i) {
	return (int) (aLong3927 >> Class350.anInt3607 * i) & 0xf;
    }
    
    public final Class350 method6441(int i) {
	return Class350.method6176(method6437(i));
    }
    
    final void method6442(Class350 class350) {
	aLong3927
	    |= (long) (class350.anInt3593 << Class350.anInt3607 * anInt3928++);
    }
    
    final void method6443(Class350 class350) {
	aLong3927
	    |= (long) (class350.anInt3593 << Class350.anInt3607 * anInt3928++);
    }
    
    final void method6444(Class350 class350) {
	aLong3927
	    |= (long) (class350.anInt3593 << Class350.anInt3607 * anInt3928++);
    }
    
    final int method6445(int i) {
	return (int) (aLong3927 >> Class350.anInt3607 * i) & 0xf;
    }
}
