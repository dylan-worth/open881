/* Class268 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;

public class Class268
{
    static final int anInt2944 = 10;
    boolean aBool2945 = false;
    String aString2946;
    LinkedList aLinkedList2947 = new LinkedList();
    
    public final String method4874(String string) {
	if (aLinkedList2947.isEmpty())
	    return string;
	StringBuilder stringbuilder = new StringBuilder(string.length());
	int i = string.length();
	boolean bool = false;
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    boolean bool_1_ = false;
	    char c = string.charAt(i_0_);
	    if (bool) {
		if ('>' == c)
		    bool = false;
	    } else if (c == '<')
		bool = true;
	    else if (aString2946.indexOf(c) != -1) {
		for (int i_2_ = 0; i_2_ < aLinkedList2947.size(); i_2_++) {
		    Class262 class262 = (Class262) aLinkedList2947.get(i_2_);
		    int i_3_ = class262.aString2797.length();
		    if (i_0_ <= i - i_3_
			&& string.substring(i_0_, i_3_ + i_0_)
			       .equals(class262.aString2797)) {
			String string_4_;
			if (484620447 * class262.anInt2799 > 0)
			    string_4_
				= (String.format
				   ("<sprite=%d,%d>",
				    (new Object[]
				     { Integer.valueOf(2010221443
						       * class262.anInt2798),
				       Integer.valueOf(484620447
						       * (class262
							  .anInt2799)) })));
			else
			    string_4_
				= String.format("<sprite=%d>",
						(new Object[]
						 { Integer.valueOf
						   (2010221443
						    * class262.anInt2798) }));
			stringbuilder.append(string_4_);
			bool_1_ = true;
			i_0_ += i_3_ - 1;
			break;
		    }
		}
	    }
	    if (!bool_1_)
		stringbuilder.append(c);
	}
	return stringbuilder.toString();
    }
    
    public final boolean method4875(String string, int i, int i_5_) {
	if (!string.isEmpty() && string.length() <= 10
	    && Class303.method5577(string.charAt(0), (byte) 15)) {
	    Class262 class262 = method4879(string, 832914222);
	    if (class262 != null)
		aLinkedList2947.remove(class262);
	    aLinkedList2947.add(new Class262(string, i, i_5_));
	    method4883(-975967231);
	    return true;
	}
	return false;
    }
    
    public void method4876(boolean bool, byte i) {
	aBool2945 = bool;
    }
    
    public int method4877(int i) {
	return aLinkedList2947.size();
    }
    
    public final boolean method4878(String string, int i, int i_6_, int i_7_) {
	if (!string.isEmpty() && string.length() <= 10
	    && Class303.method5577(string.charAt(0), (byte) 122)) {
	    Class262 class262 = method4879(string, -891136656);
	    if (class262 != null)
		aLinkedList2947.remove(class262);
	    aLinkedList2947.add(new Class262(string, i, i_6_));
	    method4883(1947348225);
	    return true;
	}
	return false;
    }
    
    final Class262 method4879(String string, int i) {
	Iterator iterator = aLinkedList2947.iterator();
	while (iterator.hasNext()) {
	    Class262 class262 = (Class262) iterator.next();
	    if (class262.aString2797.equals(string))
		return class262;
	}
	return null;
    }
    
    public final void method4880(String string, int i) {
	Iterator iterator = aLinkedList2947.iterator();
	while (iterator.hasNext()) {
	    Class262 class262 = (Class262) iterator.next();
	    if (class262.aString2797.equals(string)) {
		iterator.remove();
		break;
	    }
	}
    }
    
    final Class262 method4881(String string) {
	Iterator iterator = aLinkedList2947.iterator();
	while (iterator.hasNext()) {
	    Class262 class262 = (Class262) iterator.next();
	    if (class262.aString2797.equals(string))
		return class262;
	}
	return null;
    }
    
    public boolean method4882(short i) {
	return aBool2945;
    }
    
    final void method4883(int i) {
	aString2946 = "";
	for (int i_8_ = 0; i_8_ < aLinkedList2947.size(); i_8_++) {
	    Class262 class262 = (Class262) aLinkedList2947.get(i_8_);
	    char c = class262.aString2797.charAt(0);
	    if (aString2946.indexOf(c) < 0) {
		StringBuilder stringbuilder = new StringBuilder();
		Class268 class268_9_ = this;
		class268_9_.aString2946
		    = stringbuilder.append(class268_9_.aString2946).append
			  (c).toString();
	    }
	}
    }
    
    public boolean method4884() {
	return aBool2945;
    }
    
    public boolean method4885() {
	return aBool2945;
    }
    
    public boolean method4886() {
	return aBool2945;
    }
    
    public void method4887(boolean bool) {
	aBool2945 = bool;
    }
    
    public void method4888(boolean bool) {
	aBool2945 = bool;
    }
    
    public void method4889(boolean bool) {
	aBool2945 = bool;
    }
    
    public final void method4890(String string) {
	Iterator iterator = aLinkedList2947.iterator();
	while (iterator.hasNext()) {
	    Class262 class262 = (Class262) iterator.next();
	    if (class262.aString2797.equals(string)) {
		iterator.remove();
		break;
	    }
	}
    }
    
    public int method4891() {
	return aLinkedList2947.size();
    }
    
    public int method4892() {
	return aLinkedList2947.size();
    }
    
    public int method4893() {
	return aLinkedList2947.size();
    }
    
    public final void method4894(byte i) {
	aLinkedList2947.clear();
	aString2946 = "";
    }
    
    public final boolean method4895(String string, int i, int i_10_) {
	if (!string.isEmpty() && string.length() <= 10
	    && Class303.method5577(string.charAt(0), (byte) 108)) {
	    Class262 class262 = method4879(string, 453635568);
	    if (class262 != null)
		aLinkedList2947.remove(class262);
	    aLinkedList2947.add(new Class262(string, i, i_10_));
	    method4883(-1386921242);
	    return true;
	}
	return false;
    }
    
    public final boolean method4896(String string, int i, int i_11_) {
	if (!string.isEmpty() && string.length() <= 10
	    && Class303.method5577(string.charAt(0), (byte) 103)) {
	    Class262 class262 = method4879(string, -536970536);
	    if (class262 != null)
		aLinkedList2947.remove(class262);
	    aLinkedList2947.add(new Class262(string, i, i_11_));
	    method4883(207803713);
	    return true;
	}
	return false;
    }
    
    public final void method4897(String string) {
	Iterator iterator = aLinkedList2947.iterator();
	while (iterator.hasNext()) {
	    Class262 class262 = (Class262) iterator.next();
	    if (class262.aString2797.equals(string)) {
		iterator.remove();
		break;
	    }
	}
    }
    
    public void method4898(boolean bool) {
	aBool2945 = bool;
    }
    
    public static final boolean method4899(char c) {
	return (c >= '!' && c < '0' || c >= ':' && c <= '@' && c != '<'
		|| c >= '[' && c <= '_' || c >= '{');
    }
    
    public final void method4900(String string) {
	Iterator iterator = aLinkedList2947.iterator();
	while (iterator.hasNext()) {
	    Class262 class262 = (Class262) iterator.next();
	    if (class262.aString2797.equals(string)) {
		iterator.remove();
		break;
	    }
	}
    }
    
    public final void method4901() {
	aLinkedList2947.clear();
	aString2946 = "";
    }
    
    public final String method4902(String string, byte i) {
	if (aLinkedList2947.isEmpty())
	    return string;
	StringBuilder stringbuilder = new StringBuilder(string.length());
	int i_12_ = string.length();
	boolean bool = false;
	for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
	    boolean bool_14_ = false;
	    char c = string.charAt(i_13_);
	    if (bool) {
		if ('>' == c)
		    bool = false;
	    } else if (c == '<')
		bool = true;
	    else if (aString2946.indexOf(c) != -1) {
		for (int i_15_ = 0; i_15_ < aLinkedList2947.size(); i_15_++) {
		    Class262 class262 = (Class262) aLinkedList2947.get(i_15_);
		    int i_16_ = class262.aString2797.length();
		    if (i_13_ <= i_12_ - i_16_
			&& string.substring(i_13_, i_16_ + i_13_)
			       .equals(class262.aString2797)) {
			String string_17_;
			if (484620447 * class262.anInt2799 > 0)
			    string_17_
				= (String.format
				   ("<sprite=%d,%d>",
				    (new Object[]
				     { Integer.valueOf(2010221443
						       * class262.anInt2798),
				       Integer.valueOf(484620447
						       * (class262
							  .anInt2799)) })));
			else
			    string_17_
				= String.format("<sprite=%d>",
						(new Object[]
						 { Integer.valueOf
						   (2010221443
						    * class262.anInt2798) }));
			stringbuilder.append(string_17_);
			bool_14_ = true;
			i_13_ += i_16_ - 1;
			break;
		    }
		}
	    }
	    if (!bool_14_)
		stringbuilder.append(c);
	}
	return stringbuilder.toString();
    }
    
    public final String method4903(String string) {
	if (aLinkedList2947.isEmpty())
	    return string;
	StringBuilder stringbuilder = new StringBuilder(string.length());
	int i = string.length();
	boolean bool = false;
	for (int i_18_ = 0; i_18_ < i; i_18_++) {
	    boolean bool_19_ = false;
	    char c = string.charAt(i_18_);
	    if (bool) {
		if ('>' == c)
		    bool = false;
	    } else if (c == '<')
		bool = true;
	    else if (aString2946.indexOf(c) != -1) {
		for (int i_20_ = 0; i_20_ < aLinkedList2947.size(); i_20_++) {
		    Class262 class262 = (Class262) aLinkedList2947.get(i_20_);
		    int i_21_ = class262.aString2797.length();
		    if (i_18_ <= i - i_21_
			&& string.substring(i_18_, i_21_ + i_18_)
			       .equals(class262.aString2797)) {
			String string_22_;
			if (484620447 * class262.anInt2799 > 0)
			    string_22_
				= (String.format
				   ("<sprite=%d,%d>",
				    (new Object[]
				     { Integer.valueOf(2010221443
						       * class262.anInt2798),
				       Integer.valueOf(484620447
						       * (class262
							  .anInt2799)) })));
			else
			    string_22_
				= String.format("<sprite=%d>",
						(new Object[]
						 { Integer.valueOf
						   (2010221443
						    * class262.anInt2798) }));
			stringbuilder.append(string_22_);
			bool_19_ = true;
			i_18_ += i_21_ - 1;
			break;
		    }
		}
	    }
	    if (!bool_19_)
		stringbuilder.append(c);
	}
	return stringbuilder.toString();
    }
    
    final void method4904() {
	aString2946 = "";
	for (int i = 0; i < aLinkedList2947.size(); i++) {
	    Class262 class262 = (Class262) aLinkedList2947.get(i);
	    char c = class262.aString2797.charAt(0);
	    if (aString2946.indexOf(c) < 0) {
		StringBuilder stringbuilder = new StringBuilder();
		Class268 class268_23_ = this;
		class268_23_.aString2946
		    = stringbuilder.append(class268_23_.aString2946).append
			  (c).toString();
	    }
	}
    }
    
    final void method4905() {
	aString2946 = "";
	for (int i = 0; i < aLinkedList2947.size(); i++) {
	    Class262 class262 = (Class262) aLinkedList2947.get(i);
	    char c = class262.aString2797.charAt(0);
	    if (aString2946.indexOf(c) < 0) {
		StringBuilder stringbuilder = new StringBuilder();
		Class268 class268_24_ = this;
		class268_24_.aString2946
		    = stringbuilder.append(class268_24_.aString2946).append
			  (c).toString();
	    }
	}
    }
    
    static final void method4906(Class669 class669, byte i) {
	Class534_Sub18_Sub9 class534_sub18_sub9
	    = Class554.method9114(class669.anIntArray8595[((class669.anInt8600
							    -= 308999563)
							   * 2088438307)]);
	if (class534_sub18_sub9 == null
	    || class534_sub18_sub9.aString11764 == null)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= class534_sub18_sub9.aString11764;
    }
    
    static void method4907(Class669 class669, int i) {
	class669.anIntArray8595[class669.anInt8600 * 2088438307 - 1]
	    = (((Class273)
		Class223.aClass53_Sub2_2316.method91((class669.anIntArray8595
						      [((2088438307
							 * class669.anInt8600)
							- 1)]),
						     -538577829)).anInt3020
	       * -1628667329);
    }
}
