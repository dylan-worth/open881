/* Class534_Sub18_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class534_Sub18_Sub10 extends Class534_Sub18
{
    int anInt11774;
    
    abstract Object method18279();
    
    abstract Object method18280(int i);
    
    abstract boolean method18281(short i);
    
    Class534_Sub18_Sub10(int i) {
	anInt11774 = 1514714877 * i;
    }
    
    abstract Object method18282();
    
    abstract Object method18283();
    
    abstract boolean method18284();
    
    abstract boolean method18285();
    
    static final void method18286(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (0 == i_0_)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= Class554_Sub1.aBool10689 ? 1 : 0;
	else if (1 == i_0_)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= Class554_Sub1.aBool10690 ? 1 : 0;
	else if (i_0_ == 2)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= Class554_Sub1.aBool10693 ? 1 : 0;
	else
	    throw new RuntimeException();
    }
}
