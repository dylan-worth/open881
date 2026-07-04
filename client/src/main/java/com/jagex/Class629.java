/* Class629 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class629
{
    static boolean[] aBoolArray8177 = new boolean[64];
    boolean aBool8178;
    Class536_Sub2_Sub1_Sub1[] aClass536_Sub2_Sub1_Sub1Array8179;
    int anInt8180;
    long aLong8181;
    long aLong8182;
    List aList8183;
    int anInt8184;
    List aList8185;
    int anInt8186;
    boolean aBool8187;
    boolean aBool8188;
    public boolean aBool8189 = false;
    Class174 aClass174_8190;
    int anInt8191;
    static boolean[] aBoolArray8192 = new boolean[16];
    
    public void method10384() {
	aBool8187 = true;
    }
    
    void method10385(Class158[] class158s, boolean bool) {
	for (int i = 0; i < 16; i++)
	    aBoolArray8192[i] = false;
	Iterator iterator = aList8185.iterator();
    while_145_:
	while (iterator.hasNext()) {
	    Class534_Sub32 class534_sub32 = (Class534_Sub32) iterator.next();
	    if (class158s != null) {
		for (int i = 0; i < class158s.length; i++) {
		    if (class534_sub32.aClass158_10702 == class158s[i]
			|| (class534_sub32.aClass158_10702
			    == class158s[i].aClass158_1748)) {
			aBoolArray8192[i] = true;
			class534_sub32.method16388(-155818650);
			continue while_145_;
		    }
		}
	    }
	    if (!bool) {
		class534_sub32.method8892((byte) 1);
		anInt8186--;
		if (class534_sub32.method8889(1161547916)) {
		    class534_sub32.method8892((byte) 1);
		    Class625.anInt8151 -= -491876569;
		}
	    }
	}
	if (class158s != null) {
	    for (int i = 0; i < class158s.length && i != 16 && anInt8186 != 16;
		 i++) {
		if (!aBoolArray8192[i]) {
		    Class534_Sub32 class534_sub32 = null;
		    if (((class158s[i].method2590
			  (Class625.anInterface46_8159, (byte) 45).anInt3954)
			 * 302557339) == 1
			&& Class625.anInt8151 * -375132009 < 32) {
			class534_sub32
			    = new Class534_Sub32(class158s[i], this);
			Class625.aClass9_8155.method581(class534_sub32,
							(long) ((class158s[i]
								 .anInt1752)
								* 1218140867));
			Class625.anInt8151 += -491876569;
		    }
		    if (class534_sub32 == null)
			class534_sub32
			    = new Class534_Sub32(class158s[i], this);
		    aList8185.add(class534_sub32);
		    anInt8186++;
		    aBoolArray8192[i] = true;
		}
	    }
	}
    }
    
    void method10386(int i, boolean bool) {
	Class625.aList8154.add(this);
	aLong8182 = (long) i;
	aLong8181 = (long) i;
	aBool8187 = true;
	aBool8188 = bool;
    }
    
    void method10387() {
	aBool8189 = true;
	Iterator iterator = aList8185.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub32 class534_sub32 = (Class534_Sub32) iterator.next();
	    if (class534_sub32.aClass384_10700.anInt3954 * 302557339 == 1)
		class534_sub32.method8892((byte) 1);
	}
	for (int i = 0; i < aClass536_Sub2_Sub1_Sub1Array8179.length; i++) {
	    if (aClass536_Sub2_Sub1_Sub1Array8179[i] != null) {
		aClass536_Sub2_Sub1_Sub1Array8179[i].method18689();
		aClass536_Sub2_Sub1_Sub1Array8179[i] = null;
	    }
	}
	anInt8191 = 0;
	aList8183 = new LinkedList();
	anInt8184 = 0;
	aList8185 = new LinkedList();
	anInt8186 = 0;
    }
    
    void method10388() {
	aBool8189 = true;
	Iterator iterator = aList8185.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub32 class534_sub32 = (Class534_Sub32) iterator.next();
	    if (class534_sub32.aClass384_10700.anInt3954 * 302557339 == 1)
		class534_sub32.method8892((byte) 1);
	}
	for (int i = 0; i < aClass536_Sub2_Sub1_Sub1Array8179.length; i++) {
	    if (aClass536_Sub2_Sub1_Sub1Array8179[i] != null) {
		aClass536_Sub2_Sub1_Sub1Array8179[i].method18689();
		aClass536_Sub2_Sub1_Sub1Array8179[i] = null;
	    }
	}
	anInt8191 = 0;
	aList8183 = new LinkedList();
	anInt8184 = 0;
	aList8185 = new LinkedList();
	anInt8186 = 0;
    }
    
    public void method10389() {
	aBool8178 = true;
    }
    
    public void method10390(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	anInt8180 = i;
    }
    
    boolean method10391(Class185 class185, long l) {
	if (aLong8182 != aLong8181)
	    method10389();
	else
	    method10398();
	if (l - aLong8182 > 750L) {
	    method10388();
	    return false;
	}
	int i = (int) (l - aLong8181);
	if (aBool8187) {
	    Iterator iterator = aList8183.iterator();
	    while (iterator.hasNext()) {
		Class615 class615 = (Class615) iterator.next();
		for (int i_4_ = 0;
		     i_4_ < class615.aClass385_8037.anInt4003 * 2022163495;
		     i_4_++)
		    class615.method10130(class185, l, 1, !aBool8178,
					 -146154366);
	    }
	    aBool8187 = false;
	}
	Iterator iterator = aList8183.iterator();
	while (iterator.hasNext()) {
	    Class615 class615 = (Class615) iterator.next();
	    class615.method10130(class185, l, i, !aBool8178, 963773859);
	}
	aLong8181 = l;
	return true;
    }
    
    public void method10392(long l) {
	aLong8182 = l;
    }
    
    public void method10393(Class185 class185, long l, Class172[] class172s,
			    Class158[] class158s, boolean bool) {
	if (!aBool8189) {
	    method10394(class185, class172s, bool);
	    method10395(class158s, bool);
	    aLong8182 = l;
	}
    }
    
    void method10394(Class185 class185, Class172[] class172s, boolean bool) {
	for (int i = 0; i < 64; i++)
	    aBoolArray8177[i] = false;
	Iterator iterator = aList8183.iterator();
    while_146_:
	while (iterator.hasNext()) {
	    Class615 class615 = (Class615) iterator.next();
	    if (class172s != null) {
		for (int i = 0; i < class172s.length && i != 64; i++) {
		    if (class615.aClass172_8050 == class172s[i]
			|| (class615.aClass172_8050
			    == class172s[i].aClass172_1809)) {
			aBoolArray8177[i] = true;
			class615.method10132(-1345888901);
			class615.aBool8046 = false;
			continue while_146_;
		    }
		}
	    }
	    if (!bool) {
		if (class615.anInt8054 * -2066945729 == 0) {
		    iterator.remove();
		    anInt8184--;
		} else
		    class615.aBool8046 = true;
	    }
	}
	if (class172s != null) {
	    for (int i = 0; i < class172s.length && i != 64 && anInt8184 != 64;
		 i++) {
		if (!aBoolArray8177[i]) {
		    Class615 class615 = new Class615(class185, class172s[i],
						     this, aLong8182);
		    aList8183.add(class615);
		    anInt8184++;
		    aBoolArray8177[i] = true;
		}
	    }
	}
    }
    
    void method10395(Class158[] class158s, boolean bool) {
	for (int i = 0; i < 16; i++)
	    aBoolArray8192[i] = false;
	Iterator iterator = aList8185.iterator();
    while_147_:
	while (iterator.hasNext()) {
	    Class534_Sub32 class534_sub32 = (Class534_Sub32) iterator.next();
	    if (class158s != null) {
		for (int i = 0; i < class158s.length; i++) {
		    if (class534_sub32.aClass158_10702 == class158s[i]
			|| (class534_sub32.aClass158_10702
			    == class158s[i].aClass158_1748)) {
			aBoolArray8192[i] = true;
			class534_sub32.method16388(-155818650);
			continue while_147_;
		    }
		}
	    }
	    if (!bool) {
		class534_sub32.method8892((byte) 1);
		anInt8186--;
		if (class534_sub32.method8889(317864798)) {
		    class534_sub32.method8892((byte) 1);
		    Class625.anInt8151 -= -491876569;
		}
	    }
	}
	if (class158s != null) {
	    for (int i = 0; i < class158s.length && i != 16 && anInt8186 != 16;
		 i++) {
		if (!aBoolArray8192[i]) {
		    Class534_Sub32 class534_sub32 = null;
		    if (((class158s[i].method2590
			  (Class625.anInterface46_8159, (byte) 64).anInt3954)
			 * 302557339) == 1
			&& Class625.anInt8151 * -375132009 < 32) {
			class534_sub32
			    = new Class534_Sub32(class158s[i], this);
			Class625.aClass9_8155.method581(class534_sub32,
							(long) ((class158s[i]
								 .anInt1752)
								* 1218140867));
			Class625.anInt8151 += -491876569;
		    }
		    if (class534_sub32 == null)
			class534_sub32
			    = new Class534_Sub32(class158s[i], this);
		    aList8185.add(class534_sub32);
		    anInt8186++;
		    aBoolArray8192[i] = true;
		}
	    }
	}
    }
    
    Class629(int i, boolean bool) {
	aBool8178 = false;
	anInt8191 = 0;
	aList8183 = new LinkedList();
	anInt8184 = 0;
	aList8185 = new LinkedList();
	anInt8186 = 0;
	aBool8187 = false;
	aBool8188 = false;
	aClass174_8190 = new Class174();
	aClass536_Sub2_Sub1_Sub1Array8179 = new Class536_Sub2_Sub1_Sub1[8192];
	method10386(i, bool);
    }
    
    public void method10396(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
	anInt8180 = i;
    }
    
    void method10397(Class556 class556, Class185 class185) {
	aClass174_8190.aClass701_1837.method14207((byte) 1);
	Iterator iterator = aList8183.iterator();
	while (iterator.hasNext()) {
	    Class615 class615 = (Class615) iterator.next();
	    class615.method10133(class556, class185, aLong8181);
	}
    }
    
    void method10398() {
	aBool8178 = false;
    }
    
    public static Class629 method10399(int i, boolean bool) {
	if (Class625.anInt8156 * -2056179105
	    != Class625.anInt8165 * 837949621) {
	    Class629 class629 = (OutputStream_Sub1.aClass629Array11013
				 [Class625.anInt8165 * 837949621]);
	    Class625.anInt8165
		= (Class625.anInt8165 * 837949621 + 1
		   & (Class184.anIntArray1982
		      [Class625.anInt8164 * -1429983313])) * -2004871779;
	    class629.method10386(i, bool);
	    return class629;
	}
	return new Class629(i, bool);
    }
    
    public static Class629 method10400(int i, boolean bool) {
	if (Class625.anInt8156 * -2056179105
	    != Class625.anInt8165 * 837949621) {
	    Class629 class629 = (OutputStream_Sub1.aClass629Array11013
				 [Class625.anInt8165 * 837949621]);
	    Class625.anInt8165
		= (Class625.anInt8165 * 837949621 + 1
		   & (Class184.anIntArray1982
		      [Class625.anInt8164 * -1429983313])) * -2004871779;
	    class629.method10386(i, bool);
	    return class629;
	}
	return new Class629(i, bool);
    }
    
    public Class174 method10401() {
	aClass174_8190.aClass701_1837.method14207((byte) 1);
	for (int i = 0; i < aClass536_Sub2_Sub1_Sub1Array8179.length; i++) {
	    if (aClass536_Sub2_Sub1_Sub1Array8179[i] != null
		&& (aClass536_Sub2_Sub1_Sub1Array8179[i].aClass615_12076
		    != null))
		aClass174_8190.aClass701_1837.method14203
		    (aClass536_Sub2_Sub1_Sub1Array8179[i], -796088248);
	}
	return aClass174_8190;
    }
    
    void method10402(int i, boolean bool) {
	Class625.aList8154.add(this);
	aLong8182 = (long) i;
	aLong8181 = (long) i;
	aBool8187 = true;
	aBool8188 = bool;
    }
    
    void method10403(int i, boolean bool) {
	Class625.aList8154.add(this);
	aLong8182 = (long) i;
	aLong8181 = (long) i;
	aBool8187 = true;
	aBool8188 = bool;
    }
    
    public void method10404(int i, int i_9_, int i_10_, int i_11_, int i_12_) {
	anInt8180 = i;
    }
    
    public Class174 method10405() {
	return aClass174_8190;
    }
    
    void method10406() {
	aBool8189 = true;
	Iterator iterator = aList8185.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub32 class534_sub32 = (Class534_Sub32) iterator.next();
	    if (class534_sub32.aClass384_10700.anInt3954 * 302557339 == 1)
		class534_sub32.method8892((byte) 1);
	}
	for (int i = 0; i < aClass536_Sub2_Sub1_Sub1Array8179.length; i++) {
	    if (aClass536_Sub2_Sub1_Sub1Array8179[i] != null) {
		aClass536_Sub2_Sub1_Sub1Array8179[i].method18689();
		aClass536_Sub2_Sub1_Sub1Array8179[i] = null;
	    }
	}
	anInt8191 = 0;
	aList8183 = new LinkedList();
	anInt8184 = 0;
	aList8185 = new LinkedList();
	anInt8186 = 0;
    }
    
    void method10407() {
	aBool8189 = true;
	Iterator iterator = aList8185.iterator();
	while (iterator.hasNext()) {
	    Class534_Sub32 class534_sub32 = (Class534_Sub32) iterator.next();
	    if (class534_sub32.aClass384_10700.anInt3954 * 302557339 == 1)
		class534_sub32.method8892((byte) 1);
	}
	for (int i = 0; i < aClass536_Sub2_Sub1_Sub1Array8179.length; i++) {
	    if (aClass536_Sub2_Sub1_Sub1Array8179[i] != null) {
		aClass536_Sub2_Sub1_Sub1Array8179[i].method18689();
		aClass536_Sub2_Sub1_Sub1Array8179[i] = null;
	    }
	}
	anInt8191 = 0;
	aList8183 = new LinkedList();
	anInt8184 = 0;
	aList8185 = new LinkedList();
	anInt8186 = 0;
    }
    
    public void method10408() {
	aBool8178 = true;
    }
    
    void method10409() {
	aBool8178 = false;
    }
    
    public void method10410(int i, int i_13_, int i_14_, int i_15_,
			    int i_16_) {
	anInt8180 = i;
    }
    
    void method10411(Class185 class185, Class172[] class172s, boolean bool) {
	for (int i = 0; i < 64; i++)
	    aBoolArray8177[i] = false;
	Iterator iterator = aList8183.iterator();
    while_148_:
	while (iterator.hasNext()) {
	    Class615 class615 = (Class615) iterator.next();
	    if (class172s != null) {
		for (int i = 0; i < class172s.length && i != 64; i++) {
		    if (class615.aClass172_8050 == class172s[i]
			|| (class615.aClass172_8050
			    == class172s[i].aClass172_1809)) {
			aBoolArray8177[i] = true;
			class615.method10132(-1792290465);
			class615.aBool8046 = false;
			continue while_148_;
		    }
		}
	    }
	    if (!bool) {
		if (class615.anInt8054 * -2066945729 == 0) {
		    iterator.remove();
		    anInt8184--;
		} else
		    class615.aBool8046 = true;
	    }
	}
	if (class172s != null) {
	    for (int i = 0; i < class172s.length && i != 64 && anInt8184 != 64;
		 i++) {
		if (!aBoolArray8177[i]) {
		    Class615 class615 = new Class615(class185, class172s[i],
						     this, aLong8182);
		    aList8183.add(class615);
		    anInt8184++;
		    aBoolArray8177[i] = true;
		}
	    }
	}
    }
    
    boolean method10412(Class185 class185, long l) {
	if (aLong8182 != aLong8181)
	    method10389();
	else
	    method10398();
	if (l - aLong8182 > 750L) {
	    method10388();
	    return false;
	}
	int i = (int) (l - aLong8181);
	if (aBool8187) {
	    Iterator iterator = aList8183.iterator();
	    while (iterator.hasNext()) {
		Class615 class615 = (Class615) iterator.next();
		for (int i_17_ = 0;
		     i_17_ < class615.aClass385_8037.anInt4003 * 2022163495;
		     i_17_++)
		    class615.method10130(class185, l, 1, !aBool8178,
					 520233017);
	    }
	    aBool8187 = false;
	}
	Iterator iterator = aList8183.iterator();
	while (iterator.hasNext()) {
	    Class615 class615 = (Class615) iterator.next();
	    class615.method10130(class185, l, i, !aBool8178, 1333631550);
	}
	aLong8181 = l;
	return true;
    }
    
    public void method10413(long l) {
	aLong8182 = l;
    }
    
    public void method10414(long l) {
	aLong8182 = l;
    }
    
    public void method10415(Class185 class185, long l, Class172[] class172s,
			    Class158[] class158s, boolean bool) {
	if (!aBool8189) {
	    method10394(class185, class172s, bool);
	    method10395(class158s, bool);
	    aLong8182 = l;
	}
    }
    
    public void method10416(Class185 class185, long l, Class172[] class172s,
			    Class158[] class158s, boolean bool) {
	if (!aBool8189) {
	    method10394(class185, class172s, bool);
	    method10395(class158s, bool);
	    aLong8182 = l;
	}
    }
    
    void method10417(Class185 class185, Class172[] class172s, boolean bool) {
	for (int i = 0; i < 64; i++)
	    aBoolArray8177[i] = false;
	Iterator iterator = aList8183.iterator();
    while_149_:
	while (iterator.hasNext()) {
	    Class615 class615 = (Class615) iterator.next();
	    if (class172s != null) {
		for (int i = 0; i < class172s.length && i != 64; i++) {
		    if (class615.aClass172_8050 == class172s[i]
			|| (class615.aClass172_8050
			    == class172s[i].aClass172_1809)) {
			aBoolArray8177[i] = true;
			class615.method10132(-2108358144);
			class615.aBool8046 = false;
			continue while_149_;
		    }
		}
	    }
	    if (!bool) {
		if (class615.anInt8054 * -2066945729 == 0) {
		    iterator.remove();
		    anInt8184--;
		} else
		    class615.aBool8046 = true;
	    }
	}
	if (class172s != null) {
	    for (int i = 0; i < class172s.length && i != 64 && anInt8184 != 64;
		 i++) {
		if (!aBoolArray8177[i]) {
		    Class615 class615 = new Class615(class185, class172s[i],
						     this, aLong8182);
		    aList8183.add(class615);
		    anInt8184++;
		    aBoolArray8177[i] = true;
		}
	    }
	}
    }
    
    void method10418() {
	aBool8178 = false;
    }
    
    public void method10419(int i, int i_18_, int i_19_, int i_20_,
			    int i_21_) {
	anInt8180 = i;
    }
    
    void method10420(Class158[] class158s, boolean bool) {
	for (int i = 0; i < 16; i++)
	    aBoolArray8192[i] = false;
	Iterator iterator = aList8185.iterator();
    while_150_:
	while (iterator.hasNext()) {
	    Class534_Sub32 class534_sub32 = (Class534_Sub32) iterator.next();
	    if (class158s != null) {
		for (int i = 0; i < class158s.length; i++) {
		    if (class534_sub32.aClass158_10702 == class158s[i]
			|| (class534_sub32.aClass158_10702
			    == class158s[i].aClass158_1748)) {
			aBoolArray8192[i] = true;
			class534_sub32.method16388(-155818650);
			continue while_150_;
		    }
		}
	    }
	    if (!bool) {
		class534_sub32.method8892((byte) 1);
		anInt8186--;
		if (class534_sub32.method8889(125017533)) {
		    class534_sub32.method8892((byte) 1);
		    Class625.anInt8151 -= -491876569;
		}
	    }
	}
	if (class158s != null) {
	    for (int i = 0; i < class158s.length && i != 16 && anInt8186 != 16;
		 i++) {
		if (!aBoolArray8192[i]) {
		    Class534_Sub32 class534_sub32 = null;
		    if (((class158s[i].method2590
			  (Class625.anInterface46_8159, (byte) 104).anInt3954)
			 * 302557339) == 1
			&& Class625.anInt8151 * -375132009 < 32) {
			class534_sub32
			    = new Class534_Sub32(class158s[i], this);
			Class625.aClass9_8155.method581(class534_sub32,
							(long) ((class158s[i]
								 .anInt1752)
								* 1218140867));
			Class625.anInt8151 += -491876569;
		    }
		    if (class534_sub32 == null)
			class534_sub32
			    = new Class534_Sub32(class158s[i], this);
		    aList8185.add(class534_sub32);
		    anInt8186++;
		    aBoolArray8192[i] = true;
		}
	    }
	}
    }
    
    boolean method10421(Class185 class185, long l) {
	if (aLong8182 != aLong8181)
	    method10389();
	else
	    method10398();
	if (l - aLong8182 > 750L) {
	    method10388();
	    return false;
	}
	int i = (int) (l - aLong8181);
	if (aBool8187) {
	    Iterator iterator = aList8183.iterator();
	    while (iterator.hasNext()) {
		Class615 class615 = (Class615) iterator.next();
		for (int i_22_ = 0;
		     i_22_ < class615.aClass385_8037.anInt4003 * 2022163495;
		     i_22_++)
		    class615.method10130(class185, l, 1, !aBool8178,
					 -804071717);
	    }
	    aBool8187 = false;
	}
	Iterator iterator = aList8183.iterator();
	while (iterator.hasNext()) {
	    Class615 class615 = (Class615) iterator.next();
	    class615.method10130(class185, l, i, !aBool8178, -362064308);
	}
	aLong8181 = l;
	return true;
    }
    
    public static Class629 method10422(int i, boolean bool) {
	if (Class625.anInt8156 * -2056179105
	    != Class625.anInt8165 * 837949621) {
	    Class629 class629 = (OutputStream_Sub1.aClass629Array11013
				 [Class625.anInt8165 * 837949621]);
	    Class625.anInt8165
		= (Class625.anInt8165 * 837949621 + 1
		   & (Class184.anIntArray1982
		      [Class625.anInt8164 * -1429983313])) * -2004871779;
	    class629.method10386(i, bool);
	    return class629;
	}
	return new Class629(i, bool);
    }
    
    public Class174 method10423() {
	aClass174_8190.aClass701_1837.method14207((byte) 1);
	for (int i = 0; i < aClass536_Sub2_Sub1_Sub1Array8179.length; i++) {
	    if (aClass536_Sub2_Sub1_Sub1Array8179[i] != null
		&& (aClass536_Sub2_Sub1_Sub1Array8179[i].aClass615_12076
		    != null))
		aClass174_8190.aClass701_1837.method14203
		    (aClass536_Sub2_Sub1_Sub1Array8179[i], -1202434554);
	}
	return aClass174_8190;
    }
    
    public static Class629 method10424(int i, boolean bool) {
	if (Class625.anInt8156 * -2056179105
	    != Class625.anInt8165 * 837949621) {
	    Class629 class629 = (OutputStream_Sub1.aClass629Array11013
				 [Class625.anInt8165 * 837949621]);
	    Class625.anInt8165
		= (Class625.anInt8165 * 837949621 + 1
		   & (Class184.anIntArray1982
		      [Class625.anInt8164 * -1429983313])) * -2004871779;
	    class629.method10386(i, bool);
	    return class629;
	}
	return new Class629(i, bool);
    }
    
    public static Class629 method10425(int i, boolean bool) {
	if (Class625.anInt8156 * -2056179105
	    != Class625.anInt8165 * 837949621) {
	    Class629 class629 = (OutputStream_Sub1.aClass629Array11013
				 [Class625.anInt8165 * 837949621]);
	    Class625.anInt8165
		= (Class625.anInt8165 * 837949621 + 1
		   & (Class184.anIntArray1982
		      [Class625.anInt8164 * -1429983313])) * -2004871779;
	    class629.method10386(i, bool);
	    return class629;
	}
	return new Class629(i, bool);
    }
    
    public Class174 method10426() {
	return aClass174_8190;
    }
    
    public Class174 method10427() {
	return aClass174_8190;
    }
}
