/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

class Class160 implements Runnable
{
    Class367_Sub2 this$0;
    
    public void run() {
	try {
	    while (!this$0.aBool10282) {
		HashMap hashmap = this$0.method15873((byte) 40);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    if (!class496.aBool5547) {
			Class479[] class479s
			    = (Class479[]) hashmap.get(class496);
			for (int i = 0; i < class479s.length; i++)
			    class479s[i].method7833((byte) 7);
		    }
		}
		Class251.method4622(50L);
	    }
	} catch (Exception exception) {
	    Class262.method4824(null, exception, (byte) -37);
	}
    }
    
    public void method2615() {
	try {
	    while (!this$0.aBool10282) {
		HashMap hashmap = this$0.method15873((byte) 49);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    if (!class496.aBool5547) {
			Class479[] class479s
			    = (Class479[]) hashmap.get(class496);
			for (int i = 0; i < class479s.length; i++)
			    class479s[i].method7833((byte) 64);
		    }
		}
		Class251.method4622(50L);
	    }
	} catch (Exception exception) {
	    Class262.method4824(null, exception, (byte) -18);
	}
    }
    
    Class160(Class367_Sub2 class367_sub2) {
	this$0 = class367_sub2;
    }
    
    public void method2616() {
	try {
	    while (!this$0.aBool10282) {
		HashMap hashmap = this$0.method15873((byte) 3);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    if (!class496.aBool5547) {
			Class479[] class479s
			    = (Class479[]) hashmap.get(class496);
			for (int i = 0; i < class479s.length; i++)
			    class479s[i].method7833((byte) -56);
		    }
		}
		Class251.method4622(50L);
	    }
	} catch (Exception exception) {
	    Class262.method4824(null, exception, (byte) 62);
	}
    }
    
    public static void method2617(int[] is, Object[] objects, int i, int i_0_,
				  int i_1_) {
	if (i < i_0_) {
	    int i_2_ = (i_0_ + i) / 2;
	    int i_3_ = i;
	    int i_4_ = is[i_2_];
	    is[i_2_] = is[i_0_];
	    is[i_0_] = i_4_;
	    Object object = objects[i_2_];
	    objects[i_2_] = objects[i_0_];
	    objects[i_0_] = object;
	    int i_5_ = 2147483647 == i_4_ ? 0 : 1;
	    for (int i_6_ = i; i_6_ < i_0_; i_6_++) {
		if (is[i_6_] < i_4_ + (i_6_ & i_5_)) {
		    int i_7_ = is[i_6_];
		    is[i_6_] = is[i_3_];
		    is[i_3_] = i_7_;
		    Object object_8_ = objects[i_6_];
		    objects[i_6_] = objects[i_3_];
		    objects[i_3_++] = object_8_;
		}
	    }
	    is[i_0_] = is[i_3_];
	    is[i_3_] = i_4_;
	    objects[i_0_] = objects[i_3_];
	    objects[i_3_] = object;
	    method2617(is, objects, i, i_3_ - 1, -13349144);
	    method2617(is, objects, i_3_ + 1, i_0_, -1459271012);
	}
    }
    
    static final void method2618(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class97.method1829(class247, class243, class669, 1869008603);
    }
    
    static final boolean method2619(Class100 class100, int i)
	throws IOException {
	Class546 class546 = class100.method1867(-856905412);
	Class534_Sub40_Sub1 class534_sub40_sub1
	    = class100.aClass534_Sub40_Sub1_1179;
	if (null == class546)
	    return false;
	if (class100.aClass409_1186 == null) {
	    if (class100.aBool1188) {
		if (!class546.method8977(1, (byte) 1))
		    return false;
		class546.method8969((class100.aClass534_Sub40_Sub1_1179
				     .aByteArray10810),
				    0, 1, (byte) 99);
		class100.anInt1192 += 1204530481;
		class100.anInt1189 = 0;
		class100.aBool1188 = false;
	    }
	    class534_sub40_sub1.anInt10811 = 0;
	    if (class534_sub40_sub1.method18302(833231188)) {
		if (!class546.method8977(1, (byte) 1))
		    return false;
		class546.method8969((class100.aClass534_Sub40_Sub1_1179
				     .aByteArray10810),
				    1, 1, (byte) 11);
		class100.anInt1192 += 1204530481;
		class100.anInt1189 = 0;
	    }
	    class100.aBool1188 = true;
	    Class409[] class409s = Class617.method10231(-1918480052);
	    int i_9_ = class534_sub40_sub1.method18313(88694050);
	    if (i_9_ < 0 || i_9_ >= class409s.length)
		throw new IOException(new StringBuilder().append(i_9_).append
					  (" ").append
					  (31645619
					   * class534_sub40_sub1.anInt10811)
					  .toString());
	    class100.aClass409_1186 = class409s[i_9_];
	    class100.anInt1197
		= 1109978041 * class100.aClass409_1186.anInt4561;
	}
	if (class100.anInt1197 * -1013636781 == -1) {
	    if (!class546.method8977(1, (byte) 1))
		return false;
	    class546.method8969(class534_sub40_sub1.aByteArray10810, 0, 1,
				(byte) 106);
	    class100.anInt1197
		= -1220818213 * (class534_sub40_sub1.aByteArray10810[0]
				 & 0xff);
	    class100.anInt1192 += 1204530481;
	    class100.anInt1189 = 0;
	}
	if (-2 == -1013636781 * class100.anInt1197) {
	    if (!class546.method8977(2, (byte) 1))
		return false;
	    class546.method8969(class534_sub40_sub1.aByteArray10810, 0, 2,
				(byte) 42);
	    class534_sub40_sub1.anInt10811 = 0;
	    class100.anInt1197
		= class534_sub40_sub1.method16529((byte) 1) * -1220818213;
	    class100.anInt1192 += -1885906334;
	    class100.anInt1189 = 0;
	}
	if (-1013636781 * class100.anInt1197 > 0) {
	    if (!class546.method8977(-1013636781 * class100.anInt1197,
				     (byte) 1))
		return false;
	    class534_sub40_sub1.anInt10811 = 0;
	    class546.method8969(class534_sub40_sub1.aByteArray10810, 0,
				class100.anInt1197 * -1013636781, (byte) 80);
	    class100.anInt1192 += class100.anInt1197 * -1461618717;
	    class100.anInt1189 = 0;
	}
	class100.aClass409_1195 = class100.aClass409_1196;
	class100.aClass409_1196 = class100.aClass409_1199;
	class100.aClass409_1199 = class100.aClass409_1186;
	if (Class409.aClass409_4510 == class100.aClass409_1186) {
	    class100.aClass409_1186 = null;
	    return false;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4376) {
	    int i_10_ = class534_sub40_sub1.method16527(714880951);
	    int i_11_ = i_10_ >> 5;
	    int i_12_ = i_10_ & 0x1f;
	    if (0 == i_12_) {
		client.aClass99Array11053[i_11_] = null;
		class100.aClass409_1186 = null;
		return true;
	    }
	    Class99 class99 = new Class99();
	    class99.anInt1176 = -1436385891 * i_12_;
	    class99.anInt1177
		= class534_sub40_sub1.method16527(1433092176) * -1644634955;
	    if (-1562758755 * class99.anInt1177 >= 0
		&& (-1562758755 * class99.anInt1177
		    < Class510.aClass163Array5678.length)) {
		if (1 == class99.anInt1176 * 652406965
		    || class99.anInt1176 * 652406965 == 10) {
		    class99.anInt1169
			= (class534_sub40_sub1.method16529((byte) 1)
			   * -1459486341);
		    class99.anInt1167
			= (class534_sub40_sub1.method16529((byte) 1)
			   * 595344883);
		    class534_sub40_sub1.anInt10811 += -1254908436;
		} else if (652406965 * class99.anInt1176 >= 2
			   && class99.anInt1176 * 652406965 <= 6) {
		    if (2 == 652406965 * class99.anInt1176) {
			class99.anInt1171 = 1543031040;
			class99.anInt1172 = 953385216;
		    }
		    if (3 == class99.anInt1176 * 652406965) {
			class99.anInt1171 = 0;
			class99.anInt1172 = 953385216;
		    }
		    if (4 == class99.anInt1176 * 652406965) {
			class99.anInt1171 = -1208905216;
			class99.anInt1172 = 953385216;
		    }
		    if (652406965 * class99.anInt1176 == 5) {
			class99.anInt1171 = 1543031040;
			class99.anInt1172 = 0;
		    }
		    if (6 == class99.anInt1176 * 652406965) {
			class99.anInt1171 = 1543031040;
			class99.anInt1172 = 1906770432;
		    }
		    class99.anInt1176 = 1422195514;
		    class99.anInt1170
			= (class534_sub40_sub1.method16527(-126640434)
			   * -57576317);
		    Class597 class597
			= client.aClass512_11100.method8416((byte) 18);
		    class99.anInt1171
			+= ((class534_sub40_sub1.method16529((byte) 1)
			     - -424199969 * class597.anInt7859)
			    << 9) * 22804681;
		    class99.anInt1172
			+= ((class534_sub40_sub1.method16529((byte) 1)
			     - -1166289421 * class597.anInt7861)
			    << 9) * -1707551871;
		    class99.anInt1173
			= ((class534_sub40_sub1.method16527(807016786) << 2)
			   * 1649564799);
		    class99.anInt1175
			= (class534_sub40_sub1.method16529((byte) 1)
			   * -1641499169);
		}
		class99.anInt1174
		    = class534_sub40_sub1.method16533(-258848859) * -864989343;
		client.aClass99Array11053[i_11_] = class99;
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4443 == class100.aClass409_1186) {
	    client.anInt11235 = -771492423 * client.anInt11095;
	    boolean bool = class534_sub40_sub1.method16527(750131409) == 1;
	    Class346 class346 = new Class346(class534_sub40_sub1);
	    Class352 class352;
	    if (bool)
		class352 = Class162.aClass352_1758;
	    else
		class352 = Class19.aClass352_211;
	    class346.method6124(class352, 987776092);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4369 == class100.aClass409_1186) {
	    int i_13_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_14_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_15_ = class534_sub40_sub1.method16745(-891094135);
	    int i_16_ = class534_sub40_sub1.method16581(1757718193);
	    Class609.method10071(2136586002);
	    Class581.method9828(i_16_, i_15_, i_13_, i_14_, 937100572);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4553 == class100.aClass409_1186) {
	    int i_17_ = class534_sub40_sub1.method16571(-1283590816);
	    int i_18_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_19_ = class534_sub40_sub1.method16581(-447835806);
	    int i_20_ = class534_sub40_sub1.method16573(-1982766353);
	    Class609.method10071(2136586002);
	    Class218.method4118(i_19_, i_18_, i_20_, i_17_, (byte) -75);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4448 == class100.aClass409_1186) {
	    boolean bool = class534_sub40_sub1.method16527(-1964124475) == 1;
	    String string = class534_sub40_sub1.method16541((byte) -68);
	    String string_21_ = string;
	    if (bool)
		string_21_ = class534_sub40_sub1.method16541((byte) -100);
	    String string_22_ = class534_sub40_sub1.method16541((byte) -118);
	    long l = (long) class534_sub40_sub1.method16529((byte) 1);
	    long l_23_ = (long) class534_sub40_sub1.method16531(766132099);
	    Class407 class407
		= ((Class407)
		   Class448.method7319(Class407.method6684(-1479043970),
				       class534_sub40_sub1
					   .method16527(-604078973),
				       2088438307));
	    long l_24_ = (l << 32) + l_23_;
	    boolean bool_25_ = false;
	while_63_:
	    do {
		for (int i_26_ = 0; i_26_ < 100; i_26_++) {
		    if (l_24_ == client.aLongArray11113[i_26_]) {
			bool_25_ = true;
			break while_63_;
		    }
		}
		if (class407.aBool4311) {
		    if (client.aBool11223 && !client.aBool11196
			|| client.aBool11076)
			bool_25_ = true;
		    else if (Class18.method796(string_21_, -1730826868))
			bool_25_ = true;
		}
	    } while (false);
	    if (!bool_25_) {
		client.aLongArray11113[client.anInt11126 * 292282647] = l_24_;
		client.anInt11126
		    = (1 + client.anInt11126 * 292282647) % 100 * -315136345;
		String string_27_
		    = (Class47.method1127
		       (Class551.method9045(class534_sub40_sub1, (byte) -48),
			(byte) 9));
		if (class407.anInt4304 * -512635923 != -1)
		    Class216.method4111
			(9, 0,
			 new StringBuilder().append
			     (Class108.method1965((-512635923
						   * class407.anInt4304),
						  -187990964))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class108.method1965((-512635923
						   * class407.anInt4304),
						  1100320647))
			     .append
			     (string_21_).toString(),
			 string, string_27_, string_22_, -1, class407,
			 (byte) 70);
		else
		    Class216.method4111(9, 0, string, string_21_, string,
					string_27_, string_22_, -1, class407,
					(byte) 31);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4389 == class100.aClass409_1186) {
	    Class394_Sub3.aClass692_10247
		= Class44_Sub22.method17373(class534_sub40_sub1
						.method16527(-1262870461),
					    -1818881214);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4505) {
	    Class609.method10071(2136586002);
	    Class235.method4408(Class200_Sub5.method15573((byte) -21),
				(byte) 118);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4540 == class100.aClass409_1186) {
	    int i_28_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_29_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_30_ = class534_sub40_sub1.method16529((byte) 1);
	    Class171_Sub4.aClass232_9944.method4225(i_28_, i_29_, i_30_,
						    2133926925);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4367 == class100.aClass409_1186) {
	    int i_31_ = class534_sub40_sub1.method16529((byte) 1);
	    if (i_31_ == 65535)
		i_31_ = -1;
	    Class171_Sub4.aClass232_9944.method4218(i_31_, 255, (byte) -111);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4491 == class100.aClass409_1186) {
	    int i_32_ = class534_sub40_sub1.method16514((short) -31559);
	    int i_33_ = class534_sub40_sub1.method16529((byte) 1);
	    Class609.method10071(2136586002);
	    Class651.method10732(i_32_, i_33_, 1807897907);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4418 == class100.aClass409_1186) {
	    client.aClass635_11328
		= ((Class635)
		   Class448.method7319(Class635.method10533((byte) -41),
				       class534_sub40_sub1
					   .method16563((byte) -21),
				       2088438307));
	    if (client.aClass635_11328 == null)
		client.aClass635_11328 = Class635.aClass635_8298;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4451 == class100.aClass409_1186) {
	    int i_34_ = class534_sub40_sub1.method16529((byte) 1);
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2;
	    if (i_34_ == client.anInt11037 * -643758853)
		class654_sub1_sub5_sub1_sub2
		    = Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419;
	    else
		class654_sub1_sub5_sub1_sub2
		    = client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_34_];
	    if (class654_sub1_sub5_sub1_sub2 == null) {
		class100.aClass409_1186 = null;
		return true;
	    }
	    int i_35_ = class534_sub40_sub1.method16529((byte) 1);
	    Class407 class407
		= ((Class407)
		   Class448.method7319(Class407.method6684(-1788990309),
				       class534_sub40_sub1
					   .method16527(-884557581),
				       2088438307));
	    boolean bool = (i_35_ & 0x8000) != 0;
	    if (null != class654_sub1_sub5_sub1_sub2.aString12211
		&& class654_sub1_sub5_sub1_sub2.aClass631_12226 != null) {
		boolean bool_36_ = false;
		if (class407.aBool4311) {
		    if (!bool && (client.aBool11223 && !client.aBool11196
				  || client.aBool11076))
			bool_36_ = true;
		    else if (Class18.method796((class654_sub1_sub5_sub1_sub2
						.aString12211),
					       -1827491280))
			bool_36_ = true;
		}
		if (!bool_36_) {
		    int i_37_ = -1;
		    String string;
		    if (bool) {
			i_35_ &= 0x7fff;
			Class395 class395
			    = Class316.method5719(class534_sub40_sub1,
						  1248279334);
			i_37_ = -1791556207 * class395.anInt4103;
			string
			    = class395.aClass534_Sub18_Sub12_4104
				  .method18377(class534_sub40_sub1, 455497535);
		    } else
			string = (Class47.method1127
				  (Class551.method9045(class534_sub40_sub1,
						       (byte) -104),
				   (byte) 80));
		    class654_sub1_sub5_sub1_sub2.method18875(string.trim(),
							     i_35_ >> 8,
							     i_35_ & 0xff,
							     1967983260);
		    int i_38_;
		    if (class407.aBool4310)
			i_38_ = bool ? 17 : 1;
		    else
			i_38_ = bool ? 17 : 2;
		    if (-1 != -512635923 * class407.anInt4304)
			Class216.method4111
			    (i_38_, 0,
			     new StringBuilder().append
				 (Class108.method1965((-512635923
						       * class407.anInt4304),
						      -744215684))
				 .append
				 (class654_sub1_sub5_sub1_sub2
				      .method18877(true, 1261517395))
				 .toString(),
			     new StringBuilder().append
				 (Class108.method1965((class407.anInt4304
						       * -512635923),
						      -724389702))
				 .append
				 (class654_sub1_sub5_sub1_sub2
				      .method18882(false, 450780238))
				 .toString(),
			     class654_sub1_sub5_sub1_sub2.aString12228, string,
			     null, i_37_, class407, (byte) 31);
		    else
			Class216.method4111
			    (i_38_, 0,
			     class654_sub1_sub5_sub1_sub2
				 .method18877(true, 1689108577),
			     class654_sub1_sub5_sub1_sub2
				 .method18882(false, -1501233056),
			     class654_sub1_sub5_sub1_sub2.aString12228, string,
			     null, i_37_, class407, (byte) -77);
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4403) {
	    int i_39_ = class534_sub40_sub1.method16514((short) -31037);
	    if (i_39_ != 846473929 * Class492.anInt5342) {
		Class492.anInt5342 = i_39_ * -1461317767;
		Class680.method13862(Class583.aClass583_7781, -1, -1,
				     (byte) 116);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4514 == class100.aClass409_1186) {
	    byte i_40_ = class534_sub40_sub1.method16566(1199159719);
	    int i_41_ = class534_sub40_sub1.method16572((byte) 27);
	    Class609.method10071(2136586002);
	    Class166.method2753(i_41_, i_40_, (byte) -78);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4401) {
	    client.anInt11204
		= class534_sub40_sub1.method16575((byte) -41) * 1894467917;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4454) {
	    int i_42_ = class534_sub40_sub1.method16582(1522423460);
	    Class609.method10071(2136586002);
	    if (-1 == i_42_) {
		Class93.anInt901 = 1899572639;
		Class106.anInt1312 = 309821991;
	    } else {
		Class597 class597
		    = client.aClass512_11100.method8416((byte) 5);
		int i_43_ = i_42_ >> 14 & 0x3fff;
		int i_44_ = i_42_ & 0x3fff;
		i_43_ -= -424199969 * class597.anInt7859;
		if (i_43_ < 0)
		    i_43_ = 0;
		else if (i_43_ >= client.aClass512_11100.method8417(45921418))
		    i_43_ = client.aClass512_11100.method8417(1488083553);
		i_44_ -= class597.anInt7861 * -1166289421;
		if (i_44_ < 0)
		    i_44_ = 0;
		else if (i_44_
			 >= client.aClass512_11100.method8418(-1533611049))
		    i_44_ = client.aClass512_11100.method8418(-1533611049);
		Class93.anInt901 = (256 + (i_43_ << 9)) * -1899572639;
		Class106.anInt1312 = -309821991 * (256 + (i_44_ << 9));
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4460) {
	    int i_45_ = class534_sub40_sub1.method16529((byte) 1);
	    client.anInt11110 = 1319341991;
	    client.anInt11023 = i_45_ * 1139557399;
	    client.anInt11155 = -287535830;
	    client.aClass472_11237.method7670(client.anInt11023 * -1450626137,
					      (byte) -73);
	    Class44_Sub16.method17357((byte) 75);
	    Class710.method14323((byte) -17);
	    int i_46_ = class534_sub40_sub1.method16529((byte) 1);
	    client.anInt11242 = 824489645 * i_46_;
	    int i_47_ = class534_sub40_sub1.method16527(1260820227);
	    Class712.aClass534_Sub40_8883 = new Class534_Sub40(i_47_);
	    Class712.aClass534_Sub40_8883.method16519
		(class534_sub40_sub1.aByteArray10810,
		 class534_sub40_sub1.anInt10811 * 31645619, i_47_, 361779319);
	    class534_sub40_sub1.anInt10811 += -1387468933 * i_47_;
	    class100.aClass409_1186 = null;
	    return false;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4522) {
	    if (Class192.method3789(client.anInt11039 * -1850530127,
				    -1707268797))
		client.anInt11231
		    = (int) ((float) class534_sub40_sub1.method16529((byte) 1)
			     * 2.5F) * 1961509087;
	    else
		client.anInt11231
		    = class534_sub40_sub1.method16529((byte) 1) * -1284269534;
	    client.anInt11272 = client.anInt11095 * 1022906699;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4433) {
	    client.anInt11268 = 1316164627 * client.anInt11095;
	    if (-1013636781 * class100.anInt1197 == 0) {
		client.aString11300 = null;
		client.aString11251 = null;
		Class455.anInt4963 = 0;
		Class168.aClass98Array1792 = null;
		class100.aClass409_1186 = null;
		return true;
	    }
	    client.aString11251 = class534_sub40_sub1.method16541((byte) -33);
	    boolean bool = class534_sub40_sub1.method16527(-1206260403) == 1;
	    if (bool)
		class534_sub40_sub1.method16541((byte) -125);
	    client.aString11300 = class534_sub40_sub1.method16541((byte) -95);
	    Class625.aByte8166 = class534_sub40_sub1.method16586((byte) 1);
	    int i_48_ = class534_sub40_sub1.method16527(-97994211);
	    if (i_48_ == 255) {
		class100.aClass409_1186 = null;
		return true;
	    }
	    Class455.anInt4963 = i_48_ * -492511455;
	    Class98[] class98s = new Class98[100];
	    for (int i_49_ = 0; i_49_ < -217094943 * Class455.anInt4963;
		 i_49_++) {
		class98s[i_49_] = new Class98();
		class98s[i_49_].aString1165
		    = class534_sub40_sub1.method16541((byte) -24);
		bool = class534_sub40_sub1.method16527(-2105659992) == 1;
		if (bool)
		    class98s[i_49_].aString1162
			= class534_sub40_sub1.method16541((byte) -15);
		else
		    class98s[i_49_].aString1162 = class98s[i_49_].aString1165;
		class98s[i_49_].aString1161
		    = Class465.method7570(class98s[i_49_].aString1162,
					  Class39.aClass76_307, (byte) -113);
		class98s[i_49_].anInt1164
		    = class534_sub40_sub1.method16529((byte) 1) * 2127144567;
		class98s[i_49_].aByte1163
		    = class534_sub40_sub1.method16586((byte) 1);
		class98s[i_49_].aString1166
		    = class534_sub40_sub1.method16541((byte) -82);
		if (class98s[i_49_].aString1162.equals
		    (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aString12211))
		    Class66.aByte714 = class98s[i_49_].aByte1163;
	    }
	    boolean bool_50_ = false;
	    int i_51_ = -217094943 * Class455.anInt4963;
	    do {
		if (i_51_ <= 0)
		    break;
		bool_50_ = true;
		i_51_--;
		for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
		    if (class98s[i_52_].aString1161
			    .compareTo(class98s[1 + i_52_].aString1161)
			> 0) {
			Class98 class98 = class98s[i_52_];
			class98s[i_52_] = class98s[i_52_ + 1];
			class98s[1 + i_52_] = class98;
			bool_50_ = false;
		    }
		}
	    } while (!bool_50_);
	    Class168.aClass98Array1792 = class98s;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4450 == class100.aClass409_1186) {
	    Class171_Sub4.aClass232_9944.method4230(class534_sub40_sub1
							.method16529((byte) 1),
						    -1539148081);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4513 == class100.aClass409_1186) {
	    Class171_Sub4.aClass232_9944.method4247(1359376198);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4463 == class100.aClass409_1186) {
	    int i_53_ = class534_sub40_sub1.method16527(-594165795);
	    Class702 class702
		= ((Class702)
		   Class448.method7319(Class263.method4832(-520606462), i_53_,
				       2088438307));
	    if (null == class702)
		class702 = Class702.aClass702_8813;
	    Class511.method8408(class702, 470895393);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4445) {
	    int i_54_ = class534_sub40_sub1.method16573(-1982766353);
	    if (65535 == i_54_)
		i_54_ = -1;
	    int i_55_ = class534_sub40_sub1.method16571(-1757803702);
	    if (65535 == i_55_)
		i_55_ = -1;
	    int i_56_ = class534_sub40_sub1.method16533(-258848859);
	    int i_57_ = class534_sub40_sub1.method16581(-1884852909);
	    Class609.method10071(2136586002);
	    for (int i_58_ = i_54_; i_58_ <= i_55_; i_58_++) {
		long l = ((long) i_56_ << 32) + (long) i_58_;
		Class534_Sub25 class534_sub25
		    = (Class534_Sub25) client.aClass9_11208.method579(l);
		Class534_Sub25 class534_sub25_59_;
		if (class534_sub25 == null) {
		    if (-1 == i_58_)
			class534_sub25_59_
			    = new Class534_Sub25(i_57_,
						 (Class112.method2017
						  (i_56_, 807519993)
						  .aClass534_Sub25_2428
						  .anInt10575) * -1799641075);
		    else
			class534_sub25_59_ = new Class534_Sub25(i_57_, -1);
		} else {
		    class534_sub25_59_
			= new Class534_Sub25(i_57_, (class534_sub25.anInt10575
						     * -1799641075));
		    class534_sub25.method8892((byte) 1);
		}
		client.aClass9_11208.method581(class534_sub25_59_, l);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4531) {
	    String string = class534_sub40_sub1.method16541((byte) -68);
	    Class259.method4794(string, -1110763222);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4447 == class100.aClass409_1186) {
	    boolean bool = class534_sub40_sub1.method16527(960742620) == 1;
	    String string = class534_sub40_sub1.method16541((byte) -45);
	    String string_60_ = string;
	    if (bool)
		string_60_ = class534_sub40_sub1.method16541((byte) -99);
	    long l = (long) class534_sub40_sub1.method16529((byte) 1);
	    long l_61_ = (long) class534_sub40_sub1.method16531(1856406281);
	    Class407 class407
		= ((Class407)
		   Class448.method7319(Class407.method6684(-1733225234),
				       class534_sub40_sub1
					   .method16527(-1892240363),
				       2088438307));
	    int i_62_ = class534_sub40_sub1.method16529((byte) 1);
	    long l_63_ = (l << 32) + l_61_;
	    boolean bool_64_ = false;
	while_64_:
	    do {
		for (int i_65_ = 0; i_65_ < 100; i_65_++) {
		    if (client.aLongArray11113[i_65_] == l_63_) {
			bool_64_ = true;
			break while_64_;
		    }
		}
		if (class407.aBool4311
		    && Class18.method796(string_60_, -1095971206))
		    bool_64_ = true;
	    } while (false);
	    if (!bool_64_) {
		client.aLongArray11113[292282647 * client.anInt11126] = l_63_;
		client.anInt11126
		    = -315136345 * ((1 + 292282647 * client.anInt11126) % 100);
		String string_66_
		    = RuntimeException_Sub4.aClass56_12127.method1218
			  (i_62_, -1581069180)
			  .method18377(class534_sub40_sub1, 455497535);
		if (-1 != class407.anInt4304 * -512635923)
		    Class216.method4111
			(18, 0,
			 new StringBuilder().append
			     (Class108.method1965((-512635923
						   * class407.anInt4304),
						  -17839798))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class108.method1965((class407.anInt4304
						   * -512635923),
						  590163956))
			     .append
			     (string_60_).toString(),
			 string, string_66_, null, i_62_, class407,
			 (byte) -22);
		else
		    Class216.method4111(18, 0, string, string_60_, string,
					string_66_, null, i_62_, class407,
					(byte) 53);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4509) {
	    int i_67_ = class534_sub40_sub1.method16571(1545617621);
	    String string = class534_sub40_sub1.method16541((byte) -67);
	    Class609.method10071(2136586002);
	    Class706.method14254(i_67_, string, -1814464339);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4428 == class100.aClass409_1186) {
	    if (!client.aBool11339) {
		try {
		    int i_68_ = class534_sub40_sub1.method16745(-891094135);
		    int i_69_ = class534_sub40_sub1.method16527(1416938314);
		    client.aClass219_11338.method4120(i_69_, (byte) 39)
			.method4380(i_68_, (byte) 63);
		} catch (RuntimeException runtimeexception) {
		    Class262.method4824(null, runtimeexception, (byte) -85);
		    Class457.method7432(class100, -271719346);
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4390 == class100.aClass409_1186) {
	    client.anInt11274 = 1382189519 * client.anInt11095;
	    int i_70_ = class534_sub40_sub1.anInt10811 * 31645619;
	    int i_71_ = class534_sub40_sub1.method16529((byte) 1);
	    boolean bool = class534_sub40_sub1.method16527(1377708910) == 1;
	    Class212 class212
		= client.aClass214_11359.method4044(i_71_, 1481307617);
	    Class8 class8 = class212.method3977(2777799);
	    if (class8 == null || bool) {
		class212.method3976(client.anInterface27_11083, 211092642);
		class8 = class212.method3977(-1173701089);
	    }
	    while ((class100.anInt1197 * -1013636781
		    - (31645619 * class534_sub40_sub1.anInt10811 - i_70_))
		   > 0) {
		Class429 class429
		    = Class562.aClass110_Sub1_Sub1_7560
			  .method14495(class534_sub40_sub1, (byte) -61);
		class8.method29(class429.anInt4820 * -608978823,
				class429.anObject4819, (short) -778);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4404 == class100.aClass409_1186) {
	    int i_72_ = class534_sub40_sub1.method16527(947694258);
	    Class704 class704
		= ((Class704)
		   Class448.method7319(Class206.method3934(-979675961), i_72_,
				       2088438307));
	    if (class704 == null)
		class704 = Class704.aClass704_8827;
	    Class280.method5233(class704, -412033936);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4456) {
	    int i_73_ = class534_sub40_sub1.method16581(-408867813);
	    int i_74_ = class534_sub40_sub1.method16571(-759205618);
	    int i_75_ = class534_sub40_sub1.method16581(-1570727331);
	    int i_76_ = class534_sub40_sub1.method16581(-433933450);
	    int i_77_ = class534_sub40_sub1.method16582(1522423460);
	    Class597 class597
		= new Class597(class534_sub40_sub1.method16514((short) -6439));
	    int i_78_ = class534_sub40_sub1.method16572((byte) 23);
	    int i_79_ = class534_sub40_sub1.method16745(-891094135);
	    int i_80_ = class534_sub40_sub1.method16581(-786365557);
	    Class609.method10071(2136586002);
	    Class703.method14219(i_75_,
				 new Class534_Sub37_Sub4(i_78_, i_79_,
							 new Class677(class597,
								      i_74_)),
				 new int[] { i_76_, i_73_, i_80_, i_77_ },
				 false, 1460296620);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4492 == class100.aClass409_1186) {
	    boolean bool = class534_sub40_sub1.method16527(245619635) == 1;
	    long l = (long) class534_sub40_sub1.method16529((byte) 1);
	    long l_81_ = (long) class534_sub40_sub1.method16531(1388959594);
	    long l_82_ = (l << 32) + l_81_;
	    boolean bool_83_ = false;
	    Class534_Sub26 class534_sub26
		= (bool ? Class574.aClass534_Sub26_7710
		   : Class489.aClass534_Sub26_5312);
	    if (null == class534_sub26)
		bool_83_ = true;
	    else {
		for (int i_84_ = 0; i_84_ < 100; i_84_++) {
		    if (client.aLongArray11113[i_84_] == l_82_) {
			bool_83_ = true;
			break;
		    }
		}
	    }
	    if (!bool_83_) {
		client.aLongArray11113[292282647 * client.anInt11126] = l_82_;
		client.anInt11126
		    = (1 + client.anInt11126 * 292282647) % 100 * -315136345;
		String string
		    = Class551.method9045(class534_sub40_sub1, (byte) -16);
		int i_85_ = bool ? 43 : 46;
		Class216.method4111(i_85_, 0, "", "", "", string,
				    class534_sub26.aString10578, -1, null,
				    (byte) -16);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4442) {
	    int i_86_ = class534_sub40_sub1.method16527(-598931710);
	    int i_87_ = class534_sub40_sub1.method16563((byte) -126);
	    int i_88_ = i_87_ >> 2;
	    int i_89_ = i_87_ & 0x3;
	    int i_90_ = client.anIntArray11136[i_88_];
	    int i_91_ = class534_sub40_sub1.method16582(1522423460);
	    int i_92_ = class534_sub40_sub1.method16582(1522423460);
	    int i_93_ = i_92_ >> 28 & 0x3;
	    int i_94_ = i_92_ >> 14 & 0x3fff;
	    int i_95_ = i_92_ & 0x3fff;
	    Class597 class597 = client.aClass512_11100.method8416((byte) 27);
	    i_94_ -= -424199969 * class597.anInt7859;
	    i_95_ -= class597.anInt7861 * -1166289421;
	    Class50.method1163(i_93_, i_94_, i_95_, i_90_, i_88_, i_89_, i_91_,
			       i_86_, (byte) -35);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4391 == class100.aClass409_1186) {
	    Class599.aClass298_Sub1_7871.method15680(class534_sub40_sub1,
						     (-1013636781
						      * class100.anInt1197),
						     714027996);
	    client.anInt11275 = -1756281117 * client.anInt11095;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4519) {
	    client.aClass219_11338.method4125(314563141);
	    int i_96_ = class534_sub40_sub1.method16527(2019518758);
	    for (int i_97_ = 0; i_97_ < i_96_; i_97_++) {
		int i_98_ = class534_sub40_sub1.method16533(-258848859);
		Class235 class235 = new Class235(i_98_);
		client.aClass219_11338.method4122(class235, 1238481978);
		int i_99_ = class534_sub40_sub1.method16527(1514193957);
		for (int i_100_ = 0; i_100_ < i_99_; i_100_++)
		    class235.method4358(class534_sub40_sub1
					    .method16533(-258848859),
					(byte) -14);
		int i_101_ = class534_sub40_sub1.method16527(-910116660);
		for (int i_102_ = 0; i_102_ < i_101_; i_102_++)
		    class235.method4352(class534_sub40_sub1
					    .method16533(-258848859),
					(byte) -51);
		for (int i_103_ = 0; i_103_ < i_99_; i_103_++) {
		    byte i_104_ = class534_sub40_sub1.method16586((byte) 1);
		    class235.method4382(i_103_, i_104_, 1988694403);
		    for (int i_105_ = 0; i_105_ < i_101_; i_105_++) {
			if (class534_sub40_sub1.method16527(1540165838) == 0)
			    class235.method4366(i_103_, i_105_, null,
						1774135335);
			else
			    class235.method4366
				(i_103_, i_105_,
				 Integer.valueOf(class534_sub40_sub1
						     .method16533(-258848859)),
				 -2116886170);
		    }
		}
	    }
	    client.aBool11339 = false;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4453 == class100.aClass409_1186) {
	    Class77.aClass155_Sub1_819.method15463((byte) -38);
	    class100.aClass409_1186 = null;
	    return false;
	}
	if (Class409.aClass409_4556 == class100.aClass409_1186) {
	    int i_106_ = class534_sub40_sub1.method16745(-891094135);
	    int i_107_ = class534_sub40_sub1.method16563((byte) -73);
	    if (255 == i_106_) {
		i_106_ = -1;
		i_107_ = -1;
	    }
	    Class493.method8123(i_106_, i_107_, (byte) -90);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4426) {
	    if (!client.aBool11339) {
		try {
		    int i_108_ = class534_sub40_sub1.method16643(-2095499285);
		    int i_109_ = class534_sub40_sub1.method16745(-891094135);
		    boolean bool
			= class534_sub40_sub1.method16643(-2043358349) == 1;
		    client.aClass219_11338.method4120(i_109_, (byte) 82)
			.method4361(i_108_, bool, -218424621);
		} catch (RuntimeException runtimeexception) {
		    Class262.method4824(null, runtimeexception, (byte) -41);
		    Class457.method7432(class100, -242484752);
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4440) {
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4417) {
	    int i_110_ = class534_sub40_sub1.method16573(-1982766353);
	    int i_111_ = class534_sub40_sub1.method16582(1522423460);
	    Class78.aClass103_825.aClass612_1294.method10099
		((Class318) Class84.aClass44_Sub11_840.method91(i_110_,
								-137385613),
		 i_111_, 236975924);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4481) {
	    client.anInt11273 = client.anInt11095 * -2062176397;
	    Class213 class213 = new Class213(class534_sub40_sub1,
					     client.anInterface27_11083);
	    class213.method4016(client.aClass214_11359, -1260794721);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4437 == class100.aClass409_1186) {
	    Class704.method14222(Class419.aClass419_4698, -1592429273);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4560 == class100.aClass409_1186) {
	    boolean bool = class534_sub40_sub1.method16745(-891094135) == 1;
	    int i_112_ = class534_sub40_sub1.method16581(1984049667);
	    Class609.method10071(2136586002);
	    Class222.method4155(i_112_, bool, 2147296257);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4516) {
	    int i_113_ = class534_sub40_sub1.method16582(1522423460);
	    int i_114_ = class534_sub40_sub1.method16527(645470146);
	    i_114_ = -i_114_ - 2;
	    Class609.method10071(2136586002);
	    RSSocket.method827(i_113_, 5, i_114_, 0, -2090199242);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4446 == class100.aClass409_1186) {
	    int i_115_ = class534_sub40_sub1.method16533(-258848859);
	    Class609.method10071(2136586002);
	    RSSocket.method827(i_115_, 5, -643758853 * client.anInt11037, 0,
			      -941868372);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4521 == class100.aClass409_1186) {
	    int i_116_ = class534_sub40_sub1.method16529((byte) 1);
	    if (i_116_ == 65535)
		i_116_ = -1;
	    int i_117_ = class534_sub40_sub1.method16527(-1876189613);
	    int i_118_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_119_ = class534_sub40_sub1.method16527(466454408);
	    Class171_Sub4.aClass232_9944.method4237
		(Class211.aClass211_2256, i_116_, i_117_, i_119_,
		 Class190.aClass190_2128.method3763(1976188231),
		 Class207.aClass207_2235, 0.0F, 0.0F, null, 0, 256, i_118_,
		 (byte) 12);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4407 == class100.aClass409_1186) {
	    if (!client.aBool11339) {
		try {
		    byte i_120_ = class534_sub40_sub1.method16567((byte) 14);
		    int i_121_
			= class534_sub40_sub1.method16514((short) -22758);
		    int i_122_ = class534_sub40_sub1.method16527(1662455157);
		    client.aClass219_11338.method4120(i_122_, (byte) 76)
			.method4345(i_121_, i_120_, 356397921);
		} catch (RuntimeException runtimeexception) {
		    Class262.method4824(null, runtimeexception, (byte) 21);
		    Class457.method7432(class100, -1996464261);
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4388 == class100.aClass409_1186) {
	    int i_123_ = class534_sub40_sub1.method16571(-1723812424);
	    String string = class534_sub40_sub1.method16541((byte) -28);
	    Class609.method10071(2136586002);
	    Class706.method14254(i_123_, string, 364049197);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4380 == class100.aClass409_1186) {
	    int i_124_ = class534_sub40_sub1.method16546(-1706829710);
	    int i_125_ = class534_sub40_sub1.method16533(-258848859);
	    int i_126_ = class534_sub40_sub1.method16527(-31490221);
	    String string = "";
	    String string_127_ = string;
	    if (0 != (i_126_ & 0x1)) {
		string = class534_sub40_sub1.method16541((byte) -32);
		if (0 != (i_126_ & 0x2))
		    string_127_ = class534_sub40_sub1.method16541((byte) -72);
		else
		    string_127_ = string;
	    }
	    String string_128_ = class534_sub40_sub1.method16541((byte) -96);
	    if (99 == i_124_)
		Class73.method1567(string_128_, -1473450130);
	    else if (98 == i_124_)
		Class654_Sub1_Sub5_Sub2.method18630(string_128_, (byte) -128);
	    else {
		if (!string_127_.equals("")
		    && Class18.method796(string_127_, -1989595358)) {
		    class100.aClass409_1186 = null;
		    return true;
		}
		Class272.method5067(i_124_, i_125_, string, string_127_,
				    string, string_128_, null, (byte) 5);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4455 == class100.aClass409_1186) {
	    int i_129_ = class534_sub40_sub1.method16571(1562509438);
	    if (i_129_ == 65535)
		i_129_ = -1;
	    int i_130_ = class534_sub40_sub1.method16745(-891094135);
	    Class171_Sub4.aClass232_9944.method4248(i_129_, i_130_, (byte) 9);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4432 == class100.aClass409_1186) {
	    boolean bool = class534_sub40_sub1.method16527(1869568050) == 1;
	    String string = class534_sub40_sub1.method16541((byte) -19);
	    long l = (long) class534_sub40_sub1.method16529((byte) 1);
	    long l_131_ = (long) class534_sub40_sub1.method16531(819342402);
	    Class407 class407
		= ((Class407)
		   Class448.method7319(Class407.method6684(-1760325583),
				       class534_sub40_sub1
					   .method16527(1216246365),
				       2088438307));
	    int i_132_ = class534_sub40_sub1.method16529((byte) 1);
	    long l_133_ = l_131_ + (l << 32);
	    boolean bool_134_ = false;
	    Object object = null;
	    Class534_Sub26 class534_sub26
		= (bool ? Class574.aClass534_Sub26_7710
		   : Class489.aClass534_Sub26_5312);
	while_65_:
	    do {
		if (class534_sub26 == null)
		    bool_134_ = true;
		else {
		    for (int i_135_ = 0; i_135_ < 100; i_135_++) {
			if (l_133_ == client.aLongArray11113[i_135_]) {
			    bool_134_ = true;
			    break while_65_;
			}
		    }
		    if (class407.aBool4311
			&& Class18.method796(string, -328543142))
			bool_134_ = true;
		}
	    } while (false);
	    if (!bool_134_) {
		client.aLongArray11113[292282647 * client.anInt11126] = l_133_;
		client.anInt11126
		    = -315136345 * ((1 + 292282647 * client.anInt11126) % 100);
		String string_136_
		    = RuntimeException_Sub4.aClass56_12127.method1218
			  (i_132_, -1581069180)
			  .method18377(class534_sub40_sub1, 455497535);
		int i_137_ = bool ? 42 : 45;
		if (-512635923 * class407.anInt4304 != -1)
		    Class216.method4111
			(i_137_, 0,
			 new StringBuilder().append
			     (Class108.method1965((-512635923
						   * class407.anInt4304),
						  1265282075))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class108.method1965((class407.anInt4304
						   * -512635923),
						  843794584))
			     .append
			     (string).toString(),
			 string, string_136_, class534_sub26.aString10578,
			 i_132_, class407, (byte) -85);
		else
		    Class216.method4111(i_137_, 0, string, string, string,
					string_136_,
					class534_sub26.aString10578, i_132_,
					class407, (byte) -26);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4528 == class100.aClass409_1186) {
	    if (Class713.aBool8884 && null != Class29.aFrame266)
		Class159.method2611(Class44_Sub6.aClass534_Sub35_10989
					.aClass690_Sub8_10775
					.method16947(542712104),
				    -1, -1, false, -1644890812);
	    byte[] is = new byte[class100.anInt1197 * -1013636781 - 1];
	    boolean bool = class534_sub40_sub1.method16527(-14088044) == 1;
	    class534_sub40_sub1.method18291(is, 0,
					    (class100.anInt1197 * -1013636781
					     - 1),
					    (byte) 1);
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	    String string = class534_sub40.method16541((byte) -57);
	    if (bool) {
		String string_138_ = class534_sub40.method16541((byte) -78);
		if (string_138_.length() == 0)
		    string_138_ = string;
		if (!client.aBool11017
		    || Class262.aString2801.startsWith("mac")
		    || !Class215.method4106(string, 1,
					    Class403.aClass403_4146
						.method6597(594995547),
					    (byte) 58))
		    Class468.method7622(string_138_, true, client.aBool11032,
					1411490484);
	    } else
		Class468.method7622(string, true, client.aBool11032,
				    1411490484);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4405 == class100.aClass409_1186) {
	    int i_139_ = class534_sub40_sub1.method16582(1522423460);
	    if (i_139_ != 1816697759 * Class221.anInt2310) {
		Class221.anInt2310 = -2075541409 * i_139_;
		Class680.method13862(Class583.aClass583_7775, -1, -1,
				     (byte) 65);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4527) {
	    int i_140_ = class534_sub40_sub1.method16529((byte) 1);
	    if (65535 == i_140_)
		i_140_ = -1;
	    int i_141_ = class534_sub40_sub1.method16527(1005153078);
	    int i_142_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_143_ = class534_sub40_sub1.method16527(1799818371);
	    int i_144_ = class534_sub40_sub1.method16529((byte) 1);
	    Class171_Sub4.aClass232_9944.method4237
		(Class211.aClass211_2256, i_140_, i_141_, i_143_,
		 Class190.aClass190_2134.method3763(-1070032188),
		 Class207.aClass207_2235, 0.0F, 0.0F, null, 0, i_144_, i_142_,
		 (byte) 72);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4489) {
	    int i_145_ = class534_sub40_sub1.method16529((byte) 1);
	    Class105.method1937(i_145_, -1221225160);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4379) {
	    client.anInt11171 = -1587880047;
	    client.anInt11261 = -664271315 * client.anInt11095;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4425 == class100.aClass409_1186) {
	    Class704.method14222(Class419.aClass419_4692, -2034513091);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4410) {
	    int i_146_ = class534_sub40_sub1.method16514((short) -27196);
	    int i_147_ = class534_sub40_sub1.method16582(1522423460);
	    Class609.method10071(2136586002);
	    Class247 class247 = Class112.method2017(i_146_, -376831173);
	    class247.anInt2441 = 667449465 * i_147_;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4552 == class100.aClass409_1186) {
	    boolean bool = class534_sub40_sub1.method16527(-1391653872) == 1;
	    String string = class534_sub40_sub1.method16541((byte) -119);
	    String string_148_ = string;
	    if (bool)
		string_148_ = class534_sub40_sub1.method16541((byte) -107);
	    String string_149_ = class534_sub40_sub1.method16541((byte) -82);
	    long l = (long) class534_sub40_sub1.method16529((byte) 1);
	    long l_150_ = (long) class534_sub40_sub1.method16531(424212114);
	    Class407 class407
		= ((Class407)
		   Class448.method7319(Class407.method6684(-2103111244),
				       class534_sub40_sub1
					   .method16527(1221326483),
				       2088438307));
	    int i_151_ = class534_sub40_sub1.method16529((byte) 1);
	    long l_152_ = (l << 32) + l_150_;
	    boolean bool_153_ = false;
	while_66_:
	    do {
		for (int i_154_ = 0; i_154_ < 100; i_154_++) {
		    if (client.aLongArray11113[i_154_] == l_152_) {
			bool_153_ = true;
			break while_66_;
		    }
		}
		if (class407.aBool4311
		    && Class18.method796(string_148_, -926291365))
		    bool_153_ = true;
	    } while (false);
	    if (!bool_153_) {
		client.aLongArray11113[client.anInt11126 * 292282647] = l_152_;
		client.anInt11126
		    = -315136345 * ((292282647 * client.anInt11126 + 1) % 100);
		String string_155_
		    = RuntimeException_Sub4.aClass56_12127.method1218
			  (i_151_, -1581069180)
			  .method18377(class534_sub40_sub1, 455497535);
		if (-1 != class407.anInt4304 * -512635923)
		    Class216.method4111
			(20, 0,
			 new StringBuilder().append
			     (Class108.method1965((class407.anInt4304
						   * -512635923),
						  849528916))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class108.method1965((-512635923
						   * class407.anInt4304),
						  -1076546895))
			     .append
			     (string_148_).toString(),
			 string, string_155_, string_149_, i_151_, class407,
			 (byte) -32);
		else
		    Class216.method4111(20, 0, string, string_148_, string,
					string_155_, string_149_, i_151_,
					class407, (byte) 7);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4386) {
	    int i_156_ = class534_sub40_sub1.method16581(-543446121);
	    int i_157_ = class534_sub40_sub1.method16514((short) -7374);
	    int i_158_ = class534_sub40_sub1.method16573(-1982766353);
	    if (i_158_ == 65535)
		i_158_ = -1;
	    Class609.method10071(2136586002);
	    Class653.method10805(i_156_, i_158_, i_157_, (byte) 8);
	    Class15 class15
		= ((Class15)
		   Class531.aClass44_Sub7_7135.method91(i_158_, -532722656));
	    Class218.method4118(i_156_, -993244079 * class15.anInt124,
				class15.anInt125 * 1327637973,
				-528739693 * class15.anInt123, (byte) -64);
	    Class418.method6760(i_156_, class15.anInt139 * -1667459827,
				class15.anInt128 * 610101213,
				class15.anInt126 * 102672307, (byte) 62);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4542) {
	    Class609.method10071(2136586002);
	    Class640.method10597(1899878421);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4434) {
	    Class246.aClass155_2425
		= new Class155(Class78.aClass110_Sub1_Sub2_826);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4414 == class100.aClass409_1186) {
	    Class704.method14222(Class419.aClass419_4690, -1322389096);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4547) {
	    if (!client.aBool11339) {
		try {
		    int i_159_ = class534_sub40_sub1.method16643(-2111311073);
		    int i_160_ = class534_sub40_sub1.method16527(1841251352);
		    int i_161_ = class534_sub40_sub1.method16527(-1081312296);
		    client.aClass219_11338.method4120(i_161_, (byte) 11)
			.method4400(i_159_, i_160_, -773131067);
		} catch (RuntimeException runtimeexception) {
		    Class262.method4824(null, runtimeexception, (byte) -105);
		    Class457.method7432(class100, -1841905533);
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4370) {
	    int i_162_ = class534_sub40_sub1.method16643(-2009539657);
	    Class542.aClass623_7184.method10297(i_162_, -1475330168);
	    int i_163_ = class534_sub40_sub1.method16563((byte) -77);
	    int i_164_ = class534_sub40_sub1.method16514((short) -2834);
	    Class78.aClass103_825.aClass626Array1296[i_162_]
		.method10343(i_164_, -1153843442);
	    Class78.aClass103_825.aClass626Array1296[i_162_]
		.method10338(i_163_, -1095140607);
	    client.anIntArray11258
		[(client.anInt11306 += -1020312221) * 293889099 - 1 & 0x3f]
		= i_162_;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4422 == class100.aClass409_1186) {
	    int i_165_ = class534_sub40_sub1.method16581(-2039150567);
	    int i_166_ = class534_sub40_sub1.method16571(-1494559531);
	    Class609.method10071(2136586002);
	    Class200_Sub7.method15578(i_165_, i_166_, -744808945);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4431) {
	    int i_167_ = class534_sub40_sub1.method16565(-446709184);
	    int i_168_ = class534_sub40_sub1.method16567((byte) -2);
	    int i_169_ = class534_sub40_sub1.method16527(-1874916934);
	    int i_170_ = class534_sub40_sub1.method16573(-1982766353);
	    int i_171_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_172_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_173_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_174_ = class534_sub40_sub1.method16573(-1982766353);
	    int i_175_ = class534_sub40_sub1.method16563((byte) -63);
	    int i_176_ = class534_sub40_sub1.method16643(-1999653897) * 4;
	    int i_177_ = class534_sub40_sub1.method16527(-1164312913);
	    if (255 == i_177_)
		i_177_ = -1;
	    int i_178_ = class534_sub40_sub1.method16530((byte) -116);
	    int i_179_ = class534_sub40_sub1.method16571(-700484684);
	    int i_180_ = class534_sub40_sub1.method16602((byte) -12);
	    boolean bool = 0 != (i_169_ & 0x1);
	    boolean bool_181_ = 0 != (i_169_ & 0x2);
	    int i_182_ = bool_181_ ? i_169_ >> 2 : -1;
	    if (bool_181_)
		i_175_ = (byte) i_175_;
	    else
		i_175_ *= 4;
	    Class597 class597 = client.aClass512_11100.method8416((byte) 60);
	    int i_183_ = i_179_ - -848399938 * class597.anInt7859;
	    int i_184_ = i_173_ - class597.anInt7861 * 1962388454;
	    i_167_ += i_183_;
	    i_168_ += i_184_;
	    if (i_183_ >= 0 && i_184_ >= 0
		&& i_183_ < client.aClass512_11100.method8417(1147697665) * 2
		&& i_184_ < client.aClass512_11100.method8417(1444916293) * 2
		&& i_167_ >= 0 && i_168_ >= 0
		&& i_167_ < client.aClass512_11100.method8418(-1533611049) * 2
		&& i_168_ < client.aClass512_11100.method8418(-1533611049) * 2
		&& 65535 != i_172_) {
		i_183_ *= 256;
		i_184_ = 256 * i_184_;
		i_167_ *= 256;
		i_168_ *= 256;
		i_175_ <<= 2;
		i_176_ <<= 2;
		i_174_ <<= 2;
		Class418.method6759(i_172_, i_178_, i_180_, i_182_, i_175_,
				    i_176_, i_183_, i_184_, i_167_, i_168_,
				    i_171_, i_170_, i_177_, i_174_, bool, 0,
				    (short) 16383);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4381 == class100.aClass409_1186) {
			String string = class534_sub40_sub1.method16541((byte) -117);
			Object[] objects = new Object[string.length() + 1];
			for (int i_185_ = string.length() - 1; i_185_ >= 0; i_185_--) {
				if (string.charAt(i_185_) == 's')
					objects[1 + i_185_] = class534_sub40_sub1.method16541((byte) -40);
				else
					objects[i_185_ + 1] = new Integer(class534_sub40_sub1.method16533(-258848859));
			}
			objects[0] = new Integer(class534_sub40_sub1.method16533(-258848859));
			Class609.method10071(2136586002);
			Class534_Sub41 class534_sub41 = new Class534_Sub41();
			class534_sub41.anObjectArray10819 = objects;
			Class94.method1764(class534_sub41, 630629498);
			class100.aClass409_1186 = null;
//			System.out.print(class534_sub40_sub1.method16533(-258848859) + "\n");
			return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4559) {
	    if (!client.aBool11339) {
		try {
		    int i_186_ = class534_sub40_sub1.method16563((byte) -52);
		    client.aClass219_11338.method4124(i_186_, 1551914315);
		} catch (RuntimeException runtimeexception) {
		    Class262.method4824(null, runtimeexception, (byte) 5);
		    Class457.method7432(class100, -1422743267);
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4525 == class100.aClass409_1186) {
	    Class106.aString1311
		= (class100.anInt1197 * -1013636781 > 2
		   ? class534_sub40_sub1.method16541((byte) -46)
		   : Class58.aClass58_593.method1245(Class539.aClass672_7171,
						     (byte) -32));
	    client.anInt11356 = (-1013636781 * class100.anInt1197 > 0
				 ? class534_sub40_sub1.method16529((byte) 1)
				 : -1) * -490303723;
	    if (65535 == client.anInt11356 * 1361725501)
		client.anInt11356 = 490303723;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4474 == class100.aClass409_1186) {
	    Class704.method14222(Class419.aClass419_4691, -1603767819);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4462) {
	    int i_187_ = class534_sub40_sub1.method16572((byte) 26);
	    int i_188_ = class534_sub40_sub1.method16563((byte) -93);
	    int i_189_ = class534_sub40_sub1.method16563((byte) -39);
	    int i_190_ = class534_sub40_sub1.method16643(-2040950049);
	    int i_191_ = class534_sub40_sub1.method16527(-1168938502);
	    Class609.method10071(2136586002);
	    client.aBoolArray11172[i_189_] = true;
	    client.anIntArray11307[i_189_] = i_190_;
	    client.anIntArray11308[i_189_] = i_191_;
	    client.anIntArray11309[i_189_] = i_188_;
	    client.anIntArray11099[i_189_] = i_187_;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4472 == class100.aClass409_1186) {
	    int i_192_ = class534_sub40_sub1.method16514((short) -21338);
	    int i_193_ = class534_sub40_sub1.method16514((short) -19827);
	    int i_194_ = class534_sub40_sub1.method16571(1688403783);
	    Class609.method10071(2136586002);
	    RSSocket.method827(i_192_, 3, i_194_, i_193_, 2004706255);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4478 == class100.aClass409_1186) {
	    int i_195_ = class534_sub40_sub1.method16533(-258848859);
	    int i_196_ = class534_sub40_sub1.method16582(1522423460);
	    Class609.method10071(2136586002);
	    Class534_Sub37 class534_sub37
		= ((Class534_Sub37)
		   client.aClass9_11224.method579((long) i_195_));
	    Class534_Sub37 class534_sub37_197_
		= ((Class534_Sub37)
		   client.aClass9_11224.method579((long) i_196_));
	    if (null != class534_sub37_197_)
		Class534_Sub41.method16766
		    (class534_sub37_197_,
		     (class534_sub37 == null
		      || (class534_sub37_197_.anInt10803 * 1225863589
			  != 1225863589 * class534_sub37.anInt10803)),
		     false, -501970604);
	    if (null != class534_sub37) {
		class534_sub37.method8892((byte) 1);
		client.aClass9_11224.method581(class534_sub37, (long) i_196_);
	    }
	    Class247 class247 = Class112.method2017(i_195_, 614548426);
	    if (class247 != null)
		Class454.method7416(class247, -1716802987);
	    class247 = Class112.method2017(i_196_, 1898015547);
	    if (class247 != null) {
		Class454.method7416(class247, -1592863055);
		Class606.method10054((Class44_Sub11.aClass243Array11006
				      [(class247.anInt2454 * -1278450723
					>>> 16)]),
				     class247, true, 141225594);
	    }
	    if (-1 != -993629849 * client.anInt11185)
		Class67.method1385(client.anInt11185 * -993629849, 1,
				   743051080);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4558) {
	    client.anInt11228
		= class534_sub40_sub1.method16530((byte) -126) * 11678093;
	    client.anInt11272 = client.anInt11095 * 1022906699;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4535 == class100.aClass409_1186) {
	    int i_198_ = class534_sub40_sub1.method16527(882439829);
	    int i_199_ = class534_sub40_sub1.method16550((byte) -53);
	    if (client.aClass530Array11054[i_198_] != null) {
		client.aClass530Array11054[i_198_].method8827
		    (client.aClass512_11100.method8424((byte) 1), (byte) 83);
		client.aClass530Array11054[i_198_] = null;
	    }
	    if (-1 != i_199_)
		client.aClass530Array11054[i_198_]
		    = new Class530(Class254.aClass185_2683,
				   class534_sub40_sub1, i_199_);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4429 == class100.aClass409_1186) {
	    int i_200_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_201_ = class534_sub40_sub1.method16529((byte) 1);
	    Class171_Sub4.aClass232_9944.method4226(i_200_, i_201_, 836075586);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4461 == class100.aClass409_1186) {
	    boolean bool = class534_sub40_sub1.method16527(46808256) == 1;
	    String string = class534_sub40_sub1.method16541((byte) -10);
	    String string_202_ = string;
	    if (bool)
		string_202_ = class534_sub40_sub1.method16541((byte) -75);
	    long l = (long) class534_sub40_sub1.method16529((byte) 1);
	    long l_203_ = (long) class534_sub40_sub1.method16531(301108180);
	    Class407 class407
		= ((Class407)
		   Class448.method7319(Class407.method6684(-1490409847),
				       class534_sub40_sub1
					   .method16527(-507247375),
				       2088438307));
	    long l_204_ = l_203_ + (l << 32);
	    boolean bool_205_ = false;
	while_67_:
	    do {
		for (int i_206_ = 0; i_206_ < 100; i_206_++) {
		    if (l_204_ == client.aLongArray11113[i_206_]) {
			bool_205_ = true;
			break while_67_;
		    }
		}
		if (class407.aBool4311) {
		    if (client.aBool11223 && !client.aBool11196
			|| client.aBool11076)
			bool_205_ = true;
		    else if (Class18.method796(string_202_, -299120505))
			bool_205_ = true;
		}
	    } while (false);
	    if (!bool_205_) {
		client.aLongArray11113[client.anInt11126 * 292282647] = l_204_;
		client.anInt11126
		    = -315136345 * ((client.anInt11126 * 292282647 + 1) % 100);
		String string_207_
		    = (Class47.method1127
		       (Class551.method9045(class534_sub40_sub1, (byte) -27),
			(byte) 96));
		int i_208_ = class407.aBool4310 ? 7 : 3;
		if (class407.anInt4304 * -512635923 != -1)
		    Class216.method4111
			(i_208_, 0,
			 new StringBuilder().append
			     (Class108.method1965((-512635923
						   * class407.anInt4304),
						  -191197648))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class108.method1965((-512635923
						   * class407.anInt4304),
						  -666177077))
			     .append
			     (string_202_).toString(),
			 string, string_207_, null, -1, class407, (byte) -78);
		else
		    Class216.method4111(i_208_, 0, string, string_202_, string,
					string_207_, null, -1, class407,
					(byte) -120);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4409 == class100.aClass409_1186) {
	    int i_209_ = class534_sub40_sub1.method16533(-258848859);
	    boolean bool = class534_sub40_sub1.method16643(-2105423567) == 1;
	    Class609.method10071(2136586002);
	    Class534_Sub39.method16502(i_209_, bool, 1506403612);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4395 == class100.aClass409_1186) {
	    int i_210_ = class534_sub40_sub1.method16529((byte) 1);
	    if (65535 == i_210_)
		i_210_ = -1;
	    int i_211_ = class534_sub40_sub1.method16527(-645149141);
	    int i_212_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_213_ = class534_sub40_sub1.method16527(-493254933);
	    int i_214_ = class534_sub40_sub1.method16529((byte) 1);
	    Class171_Sub4.aClass232_9944.method4237
		(Class211.aClass211_2256, i_210_, i_211_, i_213_,
		 Class190.aClass190_2134.method3763(-1260943050),
		 Class207.aClass207_2235, 0.0F, 0.0F, null, 0, i_214_, i_212_,
		 (byte) 60);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4498 == class100.aClass409_1186) {
	    if (!client.aBool11339) {
		try {
		    byte i_215_ = class534_sub40_sub1.method16565(795928133);
		    int i_216_ = class534_sub40_sub1.method16533(-258848859);
		    int i_217_ = class534_sub40_sub1.method16563((byte) -7);
		    client.aClass219_11338.method4120(i_217_, (byte) 69)
			.method4356(i_216_, i_215_, 1251411306);
		} catch (RuntimeException runtimeexception) {
		    Class262.method4824(null, runtimeexception, (byte) -22);
		    Class457.method7432(class100, -1027871831);
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4378) {
	    int i_218_ = class534_sub40_sub1.method16533(-258848859);
	    Class609.method10071(2136586002);
	    RSSocket.method827(i_218_, 3, client.anInt11037 * -643758853, 0,
			      1685054085);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4554 == class100.aClass409_1186) {
	    client.anInt11235 = client.anInt11095 * -771492423;
	    boolean bool = class534_sub40_sub1.method16527(108907738) == 1;
	    if (-1013636781 * class100.anInt1197 == 1) {
		if (bool)
		    Class162.aClass352_1758 = null;
		else
		    Class19.aClass352_211 = null;
		class100.aClass409_1186 = null;
		return true;
	    }
	    if (bool)
		Class162.aClass352_1758 = new Class352(class534_sub40_sub1);
	    else
		Class19.aClass352_211 = new Class352(class534_sub40_sub1);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4459 == class100.aClass409_1186) {
	    int i_219_ = class534_sub40_sub1.method16573(-1982766353);
	    int i_220_ = class534_sub40_sub1.method16527(-901876683);
	    int[] is = new int[4];
	    for (int i_221_ = 0; i_221_ < 4; i_221_++)
		is[i_221_] = class534_sub40_sub1.method16582(1522423460);
	    Class534_Sub6 class534_sub6
		= ((Class534_Sub6)
		   client.aClass9_11331.method579((long) i_219_));
	    if (class534_sub6 != null)
		Class200_Sub6.method15575(((Class654_Sub1_Sub5_Sub1)
					   class534_sub6.anObject10417),
					  is, i_220_, true, (byte) -70);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4438 == class100.aClass409_1186) {
	    int i_222_ = class534_sub40_sub1.method16527(-221983418);
	    int i_223_ = class534_sub40_sub1.method16572((byte) 85);
	    boolean bool = (i_222_ & 0x1) == 1;
	    Class271.method5042(i_223_, bool, (byte) 42);
	    client.anIntArray11256
		[(client.anInt11257 += -1459399321) * 816576087 - 1 & 0x3f]
		= i_223_;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4526 == class100.aClass409_1186) {
	    int i_224_ = class534_sub40_sub1.method16514((short) -31583);
	    int i_225_ = class534_sub40_sub1.method16572((byte) 89);
	    Class78.aClass103_825.aClass612_1294.method10097
		((Class150) Class562.aClass110_Sub1_Sub1_7560
				.method91(i_225_, -323005041),
		 i_224_, 680266919);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4419 == class100.aClass409_1186) {
	    int i_226_ = class534_sub40_sub1.method16529((byte) 1);
	    Class171_Sub4.aClass232_9944.method4264(i_226_, -148681804);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4479) {
	    int i_227_ = class534_sub40_sub1.method16529((byte) 1);
	    String string = class534_sub40_sub1.method16541((byte) -26);
	    int i_228_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_229_ = class534_sub40_sub1.method16529((byte) 1);
	    boolean bool = class534_sub40_sub1.method16527(-1216455970) == 1;
	    Class5.aClass23_47 = Class685.aClass23_8698;
	    Exception_Sub1.aBool11394 = bool;
	    Class312_Sub1_Sub1.method18102(i_227_, string, i_228_, i_229_,
					   (byte) 23);
	    Object object = null;
	    Class673.method11110(1, -2036050128);
	    class100.aClass409_1186 = null;
	    return false;
	}
	if (Class409.aClass409_4372 == class100.aClass409_1186) {
	    int i_230_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_231_ = class534_sub40_sub1.method16527(-1751600628);
	    boolean bool = (i_231_ & 0x1) != 0;
	    boolean bool_232_ = 0 != (i_231_ & 0x2);
	    Class686.method13967(i_230_, bool, 1700118283);
	    int i_233_ = class534_sub40_sub1.method16529((byte) 1);
	    for (int i_234_ = 0; i_234_ < i_233_; i_234_++) {
		int i_235_ = class534_sub40_sub1.method16529((byte) 1);
		int i_236_ = class534_sub40_sub1.method16527(-201504732);
		if (i_236_ == 255)
		    i_236_ = class534_sub40_sub1.method16533(-258848859);
		Class8 class8 = null;
		if (bool_232_) {
		    int i_237_ = class534_sub40_sub1.method16527(1255491900);
		    if (i_237_ > 0) {
			class8 = new Class8(Class534_Sub24
					    .aClass110_Sub1_Sub2_10565);
			while (i_237_-- > 0) {
			    Class429 class429
				= (Class534_Sub24.aClass110_Sub1_Sub2_10565
				       .method14495
				   (class534_sub40_sub1, (byte) -64));
			    class8.method29(-608978823 * class429.anInt4820,
					    class429.anObject4819,
					    (short) -13177);
			}
		    }
		}
		Class154.method2577(i_230_, i_234_, i_235_ - 1, i_236_, class8,
				    bool, 1144506231);
	    }
	    client.anIntArray11256
		[(client.anInt11257 += -1459399321) * 816576087 - 1 & 0x3f]
		= i_230_;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4424 == class100.aClass409_1186) {
	    Class704.method14222(Class419.aClass419_4694, -1567846093);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4496) {
	    Class704.method14222(Class419.aClass419_4696, -1962180668);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4503) {
	    class534_sub40_sub1.method16643(-2133451632);
	    int i_238_ = class534_sub40_sub1.method16514((short) -24149);
	    int i_239_ = class534_sub40_sub1.method16582(1522423460);
	    int i_240_ = class534_sub40_sub1.method16582(1522423460);
	    int i_241_ = class534_sub40_sub1.method16572((byte) 83);
	    int i_242_ = class534_sub40_sub1.method16581(39220489);
	    Class609.method10071(2136586002);
	    int[] is = { i_238_, i_240_, i_239_, i_242_ };
	    client.anInt11185 = i_241_ * -1328962985;
	    Class672.method11095(i_241_, is, 2143840779);
	    Class260.method4813(false, (short) -2213);
	    Class463.method7544(client.anInt11185 * -993629849, is,
				1353906199);
	    for (int i_243_ = 0; i_243_ < 108; i_243_++)
		client.aBoolArray11180[i_243_] = true;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4499 == class100.aClass409_1186) {
	    boolean bool = class534_sub40_sub1.method16643(-2046846363) == 1;
	    Class609.method10071(2136586002);
	    Class665.aBool8573 = bool;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4457 == class100.aClass409_1186) {
	    Class171.method2886(class534_sub40_sub1.method16541((byte) -1),
				-840198603);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4467) {
	    int i_244_ = class534_sub40_sub1.method16514((short) -18407);
	    int i_245_ = class534_sub40_sub1.method16514((short) -32441);
	    Class609.method10071(2136586002);
	    Class73.method1569(i_245_, i_244_, -223581533);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4373) {
	    Class394_Sub2.method15785((client.aClass512_11100.anInt5725
				       * -1855809205),
				      -1279492515);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4508 == class100.aClass409_1186) {
	    boolean bool = class534_sub40_sub1.method16527(-1079153089) == 1;
	    if (bool)
		Class235.method4408(3, (byte) 96);
	    else
		Class235.method4408(2, (byte) 72);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4415) {
	    int i_246_ = class534_sub40_sub1.method16581(-1723047133);
	    int i_247_ = class534_sub40_sub1.method16582(1522423460);
	    int i_248_ = class534_sub40_sub1.method16573(-1982766353);
	    Class609.method10071(2136586002);
	    RSSocket.method827(i_247_, 5, i_248_, i_246_, 38021442);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4413 == class100.aClass409_1186) {
	    int i_249_ = class534_sub40_sub1.method16529((byte) 1);
	    if (65535 == i_249_)
		i_249_ = -1;
	    int i_250_ = class534_sub40_sub1.method16527(951414446);
	    int i_251_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_252_ = class534_sub40_sub1.method16527(-1410902216);
	    int i_253_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_254_ = class534_sub40_sub1.method16529((byte) 1);
	    Class491 class491
		= (Class171_Sub4.aClass232_9944.method4229
		   (Class211.aClass211_2256, Class171_Sub4.aClass232_9944,
		    i_249_, i_250_, i_252_,
		    Class190.aClass190_2134.method3763(-1822586981),
		    Class207.aClass207_2235, 0.0F, 0.0F, null, 0, i_253_,
		    false, 1213430460));
	    if (null != class491)
		Class171_Sub4.aClass232_9944.method4220(class491, i_254_,
							i_251_, -1104718719);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4377) {
	    String string = class534_sub40_sub1.method16541((byte) -79);
	    long l = (long) class534_sub40_sub1.method16529((byte) 1);
	    long l_255_ = (long) class534_sub40_sub1.method16531(676218220);
	    Class407 class407
		= ((Class407)
		   Class448.method7319(Class407.method6684(-1899946597),
				       class534_sub40_sub1
					   .method16527(12321611),
				       2088438307));
	    boolean bool = class534_sub40_sub1.method16527(245396658) == 1;
	    int i_256_ = class534_sub40_sub1.method16529((byte) 1);
	    long l_257_ = l_255_ + (l << 32);
	    boolean bool_258_ = false;
	while_68_:
	    do {
		if (null == client.aClass214_11359)
		    bool_258_ = true;
		else {
		    for (int i_259_ = 0; i_259_ < 100; i_259_++) {
			if (client.aLongArray11113[i_259_] == l_257_) {
			    bool_258_ = true;
			    break while_68_;
			}
		    }
		    if (class407.aBool4311
			&& Class18.method796(string, 1033800120))
			bool_258_ = true;
		}
	    } while (false);
	    if (!bool_258_) {
		client.aLongArray11113[client.anInt11126 * 292282647] = l_257_;
		client.anInt11126
		    = (1 + 292282647 * client.anInt11126) % 100 * -315136345;
		String string_260_
		    = RuntimeException_Sub4.aClass56_12127.method1218
			  (i_256_, -1581069180)
			  .method18377(class534_sub40_sub1, 455497535);
		int i_261_ = bool ? 23 : 25;
		if (-512635923 * class407.anInt4304 != -1)
		    Class216.method4111
			(i_261_, 0,
			 new StringBuilder().append
			     (Class108.method1965((class407.anInt4304
						   * -512635923),
						  -1707959977))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class108.method1965((-512635923
						   * class407.anInt4304),
						  -162993862))
			     .append
			     (string).toString(),
			 string, string_260_,
			 client.aClass214_11359.method4084(1966673286), i_256_,
			 class407, (byte) 89);
		else
		    Class216.method4111(i_261_, 0, string, string, string,
					string_260_,
					client.aClass214_11359
					    .method4084(1388278444),
					i_256_, class407, (byte) -36);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4466 == class100.aClass409_1186) {
	    Class704.method14222(Class419.aClass419_4697, -1450467334);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4406) {
	    if (!client.aBool11339) {
		try {
		    int i_262_ = class534_sub40_sub1.method16563((byte) -95);
		    int i_263_ = class534_sub40_sub1.method16527(1186138471);
		    client.aClass219_11338.method4120(i_262_, (byte) 127)
			.method4363(i_263_, 1305853638);
		} catch (RuntimeException runtimeexception) {
		    Class262.method4824(null, runtimeexception, (byte) 52);
		    Class457.method7432(class100, -2005684476);
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4485) {
	    Class653 class653 = new Class653();
	    boolean bool
		= class653.method10740(class534_sub40_sub1, -1695296164);
	    client.aClass512_11100.method8501((byte) 3).method10216
		(client.aClass512_11100, bool ? class653 : null,
		 class653.method10760((byte) 110), (byte) 27);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4421 == class100.aClass409_1186) {
	    int i_264_ = class534_sub40_sub1.method16582(1522423460);
	    int i_265_ = class534_sub40_sub1.method16529((byte) 1);
	    Class609.method10071(2136586002);
	    Class696.method14103(i_265_, i_264_, -116109187);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4427) {
	    Class622.method10291(Class65.aBool709, 2053435414);
	    class100.aClass409_1186 = null;
	    return false;
	}
	if (Class409.aClass409_4523 == class100.aClass409_1186) {
	    Class704.method14222(Class419.aClass419_4700, -1396075858);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4539 == class100.aClass409_1186) {
	    int i_266_ = class534_sub40_sub1.method16572((byte) 37);
	    int i_267_ = class534_sub40_sub1.method16571(-2027103832);
	    int i_268_ = class534_sub40_sub1.method16582(1522423460);
	    int i_269_ = class534_sub40_sub1.method16571(2043676374);
	    Class609.method10071(2136586002);
	    RSSocket.method827(i_268_, 7, i_269_ << 16 | i_266_, i_267_,
			      34500703);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4465 == class100.aClass409_1186) {
	    int i_270_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_271_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_272_ = class534_sub40_sub1.method16529((byte) 1);
	    Class609.method10071(2136586002);
	    if (Class44_Sub11.aClass243Array11006[i_270_] != null) {
		for (int i_273_ = i_271_; i_273_ < i_272_; i_273_++) {
		    int i_274_ = class534_sub40_sub1.method16531(1939714819);
		    if (i_273_ < (Class44_Sub11.aClass243Array11006[i_270_]
				  .aClass247Array2412).length
			&& null != (Class44_Sub11.aClass243Array11006[i_270_]
				    .aClass247Array2412[i_273_]))
			Class44_Sub11.aClass243Array11006[i_270_]
			    .aClass247Array2412[i_273_].anInt2453
			    = 1391502683 * i_274_;
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4402) {
	    int i_275_ = class534_sub40_sub1.method16533(-258848859);
	    int i_276_ = class534_sub40_sub1.method16514((short) -5656);
	    Class609.method10071(2136586002);
	    RSSocket.method827(i_276_, 1, i_275_, -1, -1428673937);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4398) {
	    client.anInt11273 = client.anInt11095 * -2062176397;
	    if (-1013636781 * class100.anInt1197 == 0)
		client.aClass214_11359 = null;
	    else
		client.aClass214_11359
		    = new Class214(0L, class534_sub40_sub1, true,
				   client.anInterface27_11083);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4368 == class100.aClass409_1186) {
	    int i_277_ = class534_sub40_sub1.method16573(-1982766353);
	    int i_278_ = class534_sub40_sub1.method16745(-891094135);
	    Class78.aClass103_825.aClass612_1294.method10099
		((Class318) Class84.aClass44_Sub11_840.method91(i_277_,
								-28737094),
		 i_278_, 236975924);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4533 == class100.aClass409_1186) {
	    int i_279_ = class534_sub40_sub1.method16533(-258848859);
	    int i_280_ = class534_sub40_sub1.method16514((short) -31067);
	    int i_281_ = class534_sub40_sub1.method16533(-258848859);
	    int i_282_ = class534_sub40_sub1.method16533(-258848859);
	    int i_283_ = class534_sub40_sub1.method16572((byte) 96);
	    int i_284_ = class534_sub40_sub1.method16745(-891094135);
	    int i_285_ = class534_sub40_sub1.method16582(1522423460);
	    Class609.method10071(2136586002);
	    Class703.method14219(i_282_, new Class534_Sub37(i_283_, i_284_),
				 new int[] { i_281_, i_285_, i_280_, i_279_ },
				 false, 915583720);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4476) {
	    int i_286_ = class534_sub40_sub1.method16527(1344855230);
	    int i_287_ = class534_sub40_sub1.method16533(-258848859);
	    int i_288_ = class534_sub40_sub1.method16572((byte) 113);
	    int i_289_ = class534_sub40_sub1.method16575((byte) 30);
	    Class534_Sub6 class534_sub6
		= ((Class534_Sub6)
		   client.aClass9_11331.method579((long) i_288_));
	    if (null != class534_sub6) {
		Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		    = ((Class654_Sub1_Sub5_Sub1_Sub1)
		       class534_sub6.anObject10417);
		if (null == class654_sub1_sub5_sub1_sub1.aClass295_12199)
		    class654_sub1_sub5_sub1_sub1.aClass295_12199
			= new Class295(class654_sub1_sub5_sub1_sub1
				       .aClass307_12204);
		class654_sub1_sub5_sub1_sub1.aClass295_12199.anIntArray3159
		    [i_286_]
		    = i_287_;
		class654_sub1_sub5_sub1_sub1.aClass295_12199
		    .aShortArray3160[i_286_]
		    = (short) i_289_;
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4520 == class100.aClass409_1186) {
	    if (null == Class246.aClass155_2425)
		Class246.aClass155_2425
		    = new Class155(Class78.aClass110_Sub1_Sub2_826);
	    Class429 class429
		= Class78.aClass110_Sub1_Sub2_826
		      .method14495(class534_sub40_sub1, (byte) -103);
	    Class246.aClass155_2425.anInterface4_1742.method29
		(class429.anInt4820 * -608978823, class429.anObject4819,
		 (short) -20269);
	    client.anIntArray11347
		[(client.anInt11030 += 882640195) * -1669615765 - 1 & 0x3f]
		= -608978823 * class429.anInt4820;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4408) {
	    Class462.anInt5094 = (class534_sub40_sub1.method16565(-396612325)
				  << 3) * 128230813;
	    Class412.anInt4643
		= class534_sub40_sub1.method16745(-891094135) * -1705392999;
	    Class185.anInt2023 = (class534_sub40_sub1.method16567((byte) 41)
				  << 3) * 1849161643;
	    while (31645619 * class534_sub40_sub1.anInt10811
		   < -1013636781 * class100.anInt1197) {
		Class419 class419
		    = (Class251.method4618(871131490)
		       [class534_sub40_sub1.method16527(215889411)]);
		Class704.method14222(class419, -2072040885);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4512 == class100.aClass409_1186) {
	    Class185.anInt2023 = (class534_sub40_sub1.method16586((byte) 1)
				  << 3) * 1849161643;
	    Class412.anInt4643
		= class534_sub40_sub1.method16527(-1584004184) * -1705392999;
	    Class462.anInt5094 = (class534_sub40_sub1.method16567((byte) -35)
				  << 3) * 128230813;
	    Class597 class597 = client.aClass512_11100.method8416((byte) 72);
	    for (Class534_Sub7 class534_sub7
		     = ((Class534_Sub7)
			client.aClass9_11209.method583(-2138660556));
		 null != class534_sub7;
		 class534_sub7 = (Class534_Sub7) client.aClass9_11209
						     .method584((byte) -93)) {
		int i_290_
		    = (int) ((class534_sub7.aLong7158 * 8258869577519436579L
			      >> 28)
			     & 0x3L);
		int i_291_
		    = (int) (8258869577519436579L * class534_sub7.aLong7158
			     & 0x3fffL);
		int i_292_ = i_291_ - class597.anInt7859 * -424199969;
		int i_293_
		    = (int) ((8258869577519436579L * class534_sub7.aLong7158
			      >> 14)
			     & 0x3fffL);
		int i_294_ = i_293_ - class597.anInt7861 * -1166289421;
		if (i_290_ == -1729998935 * Class412.anInt4643
		    && i_292_ >= -370014027 * Class462.anInt5094
		    && i_292_ < Class462.anInt5094 * -370014027 + 8
		    && i_294_ >= Class185.anInt2023 * -765768957
		    && i_294_ < -765768957 * Class185.anInt2023 + 8) {
		    class534_sub7.method8892((byte) 1);
		    if (i_292_ >= 0 && i_294_ >= 0
			&& (i_292_
			    < client.aClass512_11100.method8417(620336917))
			&& (i_294_
			    < client.aClass512_11100.method8418(-1533611049)))
			Class563.method9510(-1729998935 * Class412.anInt4643,
					    i_292_, i_294_, (short) 9363);
		}
	    }
	    for (Class534_Sub4 class534_sub4
		     = ((Class534_Sub4)
			Class534_Sub4.aClass700_10408.method14135((byte) -1));
		 null != class534_sub4;
		 class534_sub4
		     = (Class534_Sub4) Class534_Sub4.aClass700_10408
					   .method14139(1356263534)) {
		if ((-1522052283 * class534_sub4.anInt10397
		     >= Class462.anInt5094 * -370014027)
		    && (-1522052283 * class534_sub4.anInt10397
			< -370014027 * Class462.anInt5094 + 8)
		    && (-1246362377 * class534_sub4.anInt10400
			>= Class185.anInt2023 * -765768957)
		    && (-1246362377 * class534_sub4.anInt10400
			< Class185.anInt2023 * -765768957 + 8)
		    && (Class412.anInt4643 * -1729998935
			== -511427777 * class534_sub4.anInt10402))
		    class534_sub4.aBool10407 = true;
	    }
	    for (Class534_Sub4 class534_sub4
		     = ((Class534_Sub4)
			Class534_Sub4.aClass700_10409.method14135((byte) -1));
		 null != class534_sub4;
		 class534_sub4
		     = (Class534_Sub4) Class534_Sub4.aClass700_10409
					   .method14139(1978500348)) {
		if ((class534_sub4.anInt10397 * -1522052283
		     >= Class462.anInt5094 * -370014027)
		    && (-1522052283 * class534_sub4.anInt10397
			< 8 + -370014027 * Class462.anInt5094)
		    && (class534_sub4.anInt10400 * -1246362377
			>= -765768957 * Class185.anInt2023)
		    && (-1246362377 * class534_sub4.anInt10400
			< -765768957 * Class185.anInt2023 + 8)
		    && (-1729998935 * Class412.anInt4643
			== -511427777 * class534_sub4.anInt10402))
		    class534_sub4.aBool10407 = true;
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4544) {
	    String string = class534_sub40_sub1.method16541((byte) -53);
	    long l = (long) class534_sub40_sub1.method16529((byte) 1);
	    long l_295_ = (long) class534_sub40_sub1.method16531(1156112086);
	    Class407 class407
		= ((Class407)
		   Class448.method7319(Class407.method6684(-2047685615),
				       class534_sub40_sub1
					   .method16527(-1627175125),
				       2088438307));
	    boolean bool = class534_sub40_sub1.method16527(1418543822) == 1;
	    long l_296_ = l_295_ + (l << 32);
	    boolean bool_297_ = false;
	while_69_:
	    do {
		if (client.aClass214_11359 == null)
		    bool_297_ = true;
		else {
		    for (int i_298_ = 0; i_298_ < 100; i_298_++) {
			if (l_296_ == client.aLongArray11113[i_298_]) {
			    bool_297_ = true;
			    break while_69_;
			}
		    }
		    if (class407.aBool4311) {
			if (client.aBool11223 && !client.aBool11196
			    || client.aBool11076)
			    bool_297_ = true;
			else if (Class18.method796(string, 1114233014))
			    bool_297_ = true;
		    }
		}
	    } while (false);
	    if (!bool_297_) {
		client.aLongArray11113[292282647 * client.anInt11126] = l_296_;
		client.anInt11126
		    = -315136345 * ((1 + client.anInt11126 * 292282647) % 100);
		String string_299_
		    = (Class47.method1127
		       (Class551.method9045(class534_sub40_sub1, (byte) -103),
			(byte) 124));
		int i_300_ = bool ? 22 : 24;
		if (class407.anInt4304 * -512635923 != -1)
		    Class216.method4111
			(i_300_, 0,
			 new StringBuilder().append
			     (Class108.method1965((class407.anInt4304
						   * -512635923),
						  1294218364))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class108.method1965((class407.anInt4304
						   * -512635923),
						  1078562967))
			     .append
			     (string).toString(),
			 string, string_299_,
			 client.aClass214_11359.method4084(244496467), -1,
			 class407, (byte) -73);
		else
		    Class216.method4111(i_300_, 0, string, string, string,
					string_299_,
					client.aClass214_11359
					    .method4084(1888666443),
					-1, class407, (byte) -80);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4382) {
	    Class78.aClass103_825.aClass612_1294.method10098(1970596353);
	    client.anInt11255 += 1330702400;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4374) {
	    int i_301_ = class534_sub40_sub1.method16745(-891094135);
	    int i_302_ = class534_sub40_sub1.method16582(1522423460);
	    Class609.method10071(2136586002);
	    Class37.method943(i_302_, i_301_, (byte) 49);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4420) {
	    int i_303_ = class534_sub40_sub1.method16582(1522423460);
	    int i_304_ = class534_sub40_sub1.method16643(-2052594840);
	    int i_305_ = class534_sub40_sub1.method16571(-819599617);
	    int i_306_ = class534_sub40_sub1.method16514((short) -18929);
	    int i_307_ = class534_sub40_sub1.method16573(-1982766353);
	    int i_308_ = class534_sub40_sub1.method16582(1522423460);
	    int i_309_ = class534_sub40_sub1.method16514((short) 190);
	    int i_310_ = class534_sub40_sub1.method16514((short) -13671);
	    Class609.method10071(2136586002);
	    Class703.method14219(i_309_,
				 new Class534_Sub37_Sub2(i_305_, i_304_,
							 i_307_),
				 new int[] { i_308_, i_310_, i_303_, i_306_ },
				 false, 1910671908);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4477) {
	    client.anInt11227
		= class534_sub40_sub1.method16527(1270837056) * -1948788837;
	    client.anInt11272 = 1022906699 * client.anInt11095;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4371) {
	    int i_311_ = class534_sub40_sub1.method16514((short) -30539);
	    int i_312_ = class534_sub40_sub1.method16514((short) -32458);
	    Class609.method10071(2136586002);
	    Class222.method4154(i_312_, i_311_, -436995716);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4439 == class100.aClass409_1186) {
	    int i_313_ = class534_sub40_sub1.method16582(1522423460);
	    int i_314_ = class534_sub40_sub1.method16571(-351571142);
	    int i_315_ = class534_sub40_sub1.method16573(-1982766353);
	    int i_316_ = class534_sub40_sub1.method16527(-1283589019);
	    Class609.method10071(2136586002);
	    Class206.method3938(i_313_, i_316_, i_315_, i_314_, -1117337014);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4469 == class100.aClass409_1186) {
	    Class171_Sub4.aClass232_9944.method4228
		(Class190.aClass190_2128.method3763(-476629076), (byte) -61);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4501 == class100.aClass409_1186) {
	    int i_317_ = class534_sub40_sub1.method16529((byte) 1);
	    Class171_Sub4.aClass232_9944.method4216(i_317_, 49592914);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4385) {
	    String string = class534_sub40_sub1.method16541((byte) -42);
	    String string_318_
		= Class47.method1127(Class551.method9045(class534_sub40_sub1,
							 (byte) -93),
				     (byte) 78);
	    Class272.method5067(6, 0, string, string, string, string_318_,
				null, (byte) 5);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4393) {
	    int i_319_ = class534_sub40_sub1.method16514((short) -24653);
	    Class597 class597
		= new Class597(class534_sub40_sub1.method16582(1522423460));
	    int i_320_ = class534_sub40_sub1.method16643(-2113614531);
	    int i_321_ = i_320_ >> 2;
	    int i_322_ = i_320_ & 0x3;
	    int i_323_ = class534_sub40_sub1.method16582(1522423460);
	    int i_324_ = class534_sub40_sub1.method16533(-258848859);
	    int i_325_ = class534_sub40_sub1.method16582(1522423460);
	    int i_326_ = class534_sub40_sub1.method16573(-1982766353);
	    int i_327_ = class534_sub40_sub1.method16533(-258848859);
	    int i_328_ = class534_sub40_sub1.method16643(-2043922594);
	    int i_329_ = class534_sub40_sub1.method16582(1522423460);
	    Class609.method10071(2136586002);
	    Class703.method14219(i_323_,
				 new Class534_Sub37_Sub3(i_326_, i_328_,
							 new Class683(class597,
								      i_321_,
								      i_322_,
								      i_329_)),
				 new int[] { i_324_, i_327_, i_319_, i_325_ },
				 false, -1206192438);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4497 == class100.aClass409_1186) {
	    int i_330_ = class534_sub40_sub1.method16573(-1982766353);
	    int i_331_ = class534_sub40_sub1.method16514((short) -1030);
	    Class609.method10071(2136586002);
	    Class166.method2753(i_330_, i_331_, (byte) 69);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4550) {
	    client.aClass635_11117
		= ((Class635)
		   Class448.method7319(Class635.method10533((byte) -86),
				       class534_sub40_sub1
					   .method16563((byte) -52),
				       2088438307));
	    if (client.aClass635_11117 == null)
		client.aClass635_11117 = Class635.aClass635_8298;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4397 == class100.aClass409_1186) {
	    int i_332_ = class534_sub40_sub1.method16527(130426180);
	    i_332_ = -i_332_ - 2;
	    client.aMap11191.remove(Integer.valueOf(i_332_));
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4548 == class100.aClass409_1186) {
	    if (!client.aBool11339) {
		try {
		    int i_333_ = class534_sub40_sub1.method16581(-283037181);
		    byte i_334_ = class534_sub40_sub1.method16567((byte) -116);
		    client.aClass219_11338.method4123(new Class235(i_333_),
						      i_334_, (byte) -7);
		} catch (RuntimeException runtimeexception) {
		    Class262.method4824(null, runtimeexception, (byte) 0);
		    Class457.method7432(class100, -2136193577);
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4480 == class100.aClass409_1186) {
	    for (int i_335_ = 0;
		 (i_335_
		  < client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279.length);
		 i_335_++) {
		if (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_335_]
		    != null) {
		    client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_335_]
			.anIntArray11946
			= null;
		    client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i_335_]
			.aClass711_11948.method14330(-1, 1688236686);
		}
	    }
	    for (int i_336_ = 0; i_336_ < 759971875 * client.anInt11148;
		 i_336_++) {
		((Class654_Sub1_Sub5_Sub1)
		 client.aClass534_Sub6Array11085[i_336_].anObject10417)
		    .anIntArray11946
		    = null;
		((Class654_Sub1_Sub5_Sub1)
		 client.aClass534_Sub6Array11085[i_336_].anObject10417)
		    .aClass711_11948.method14330(-1, 2141121721);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4495 == class100.aClass409_1186) {
	    Class10.method609(-996093318);
	    class100.aClass409_1186 = null;
	    return false;
	}
	if (Class409.aClass409_4458 == class100.aClass409_1186) {
	    Class534_Sub40_Sub1 class534_sub40_sub1_337_
		= new Class534_Sub40_Sub1(-1013636781 * class100.anInt1197);
	    System.arraycopy((class100.aClass534_Sub40_Sub1_1179
			      .aByteArray10810),
			     (class100.aClass534_Sub40_Sub1_1179.anInt10811
			      * 31645619),
			     class534_sub40_sub1_337_.aByteArray10810, 0,
			     class100.anInt1197 * -1013636781);
	    Class200_Sub12.method15586((byte) 120);
	    if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub39_10782
		    .method17209((short) 488)
		== 1)
		Class159.aClass509_1754.method8388
		    (new Class511(Class499.aClass499_5598,
				  class534_sub40_sub1_337_),
		     -350067423);
	    else
		client.aClass512_11100.method8442
		    (new Class511(Class499.aClass499_5598,
				  class534_sub40_sub1_337_),
		     1682460210);
	    class100.aClass409_1186 = null;
	    return false;
	}
	if (Class409.aClass409_4551 == class100.aClass409_1186) {
	    int i_338_ = class534_sub40_sub1.method16643(-2083258696);
	    Class609.method10071(2136586002);
	    client.anInt11241 = i_338_ * -1931733099;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4441) {
	    Class246.aClass155_2425 = null;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4549 == class100.aClass409_1186) {
	    int i_339_ = class534_sub40_sub1.method16573(-1982766353);
	    int i_340_ = class534_sub40_sub1.method16529((byte) 1);
	    Class609.method10071(2136586002);
	    Class347_Sub3.method15868(i_340_, i_339_, 0, 246521929);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4387 == class100.aClass409_1186) {
	    String string = class534_sub40_sub1.method16541((byte) -101);
	    int i_341_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_342_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_343_ = class534_sub40_sub1.method16529((byte) 1);
	    Class5.aClass23_49.aString223 = string;
	    Class5.aClass23_49.anInt227 = i_341_ * 1619197921;
	    Class5.aClass23_49.anInt222 = 1852523987 * i_342_;
	    Class5.aClass23_49.anInt225 = i_343_ * -102059163;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4506) {
	    Class389.method6531(class534_sub40_sub1,
				class100.anInt1197 * -1013636781,
				(short) -2732);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4435 == class100.aClass409_1186) {
	    boolean bool = class534_sub40_sub1.method16527(-930599853) == 1;
	    String string = class534_sub40_sub1.method16541((byte) -102);
	    long l = (long) class534_sub40_sub1.method16529((byte) 1);
	    long l_344_ = (long) class534_sub40_sub1.method16531(349417222);
	    Class407 class407
		= ((Class407)
		   Class448.method7319(Class407.method6684(-1805494493),
				       class534_sub40_sub1
					   .method16527(-1843746254),
				       2088438307));
	    long l_345_ = (l << 32) + l_344_;
	    boolean bool_346_ = false;
	    Object object = null;
	    Class534_Sub26 class534_sub26
		= (bool ? Class574.aClass534_Sub26_7710
		   : Class489.aClass534_Sub26_5312);
	while_70_:
	    do {
		if (null == class534_sub26)
		    bool_346_ = true;
		else {
		    for (int i_347_ = 0; i_347_ < 100; i_347_++) {
			if (client.aLongArray11113[i_347_] == l_345_) {
			    bool_346_ = true;
			    break while_70_;
			}
		    }
		    if (class407.aBool4311) {
			if (client.aBool11223 && !client.aBool11196
			    || client.aBool11076)
			    bool_346_ = true;
			else if (Class18.method796(string, 1912145274))
			    bool_346_ = true;
		    }
		}
	    } while (false);
	    if (!bool_346_) {
		client.aLongArray11113[client.anInt11126 * 292282647] = l_345_;
		client.anInt11126
		    = (client.anInt11126 * 292282647 + 1) % 100 * -315136345;
		String string_348_
		    = (Class47.method1127
		       (Class551.method9045(class534_sub40_sub1, (byte) -105),
			(byte) 25));
		int i_349_ = bool ? 41 : 44;
		if (-1 != class407.anInt4304 * -512635923)
		    Class216.method4111
			(i_349_, 0,
			 new StringBuilder().append
			     (Class108.method1965((class407.anInt4304
						   * -512635923),
						  -832694386))
			     .append
			     (string).toString(),
			 new StringBuilder().append
			     (Class108.method1965((-512635923
						   * class407.anInt4304),
						  -1234410601))
			     .append
			     (string).toString(),
			 string, string_348_, class534_sub26.aString10578, -1,
			 class407, (byte) -25);
		else
		    Class216.method4111(i_349_, 0, string, string, string,
					string_348_,
					class534_sub26.aString10578, -1,
					class407, (byte) 87);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4545) {
	    int i_350_ = class534_sub40_sub1.method16533(-258848859);
	    Class376.aClass43_3911 = new Class43(i_350_);
	    Thread thread = new Thread(Class376.aClass43_3911);
	    thread.setPriority(1);
	    thread.start();
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4468 == class100.aClass409_1186) {
	    Class462.anInt5094
		= (class534_sub40_sub1.method16586((byte) 1) << 3) * 128230813;
	    Class412.anInt4643
		= class534_sub40_sub1.method16745(-891094135) * -1705392999;
	    Class185.anInt2023 = (class534_sub40_sub1.method16586((byte) 1)
				  << 3) * 1849161643;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4504) {
	    int i_351_ = class534_sub40_sub1.method16533(-258848859);
	    int i_352_ = class534_sub40_sub1.method16533(-258848859);
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4267,
				      class100.aClass13_1183, 1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16559(1720947399 * client.anInt5554, 1417267783);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16510(i_351_,
								  -562785115);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16617(i_352_,
								  1122148387);
	    class100.method1863(class534_sub19, (byte) 84);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4555) {
	    int i_353_ = class534_sub40_sub1.method16575((byte) 71);
	    int i_354_ = class534_sub40_sub1.method16514((short) -15424);
	    int i_355_ = class534_sub40_sub1.method16602((byte) -72);
	    Class609.method10071(2136586002);
	    Class514.method8584(i_354_, i_353_, i_355_, 1782177165);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4536) {
	    int i_356_ = class534_sub40_sub1.method16643(-2034974834);
	    int i_357_ = class534_sub40_sub1.method16527(-1236716038);
	    int i_358_ = class534_sub40_sub1.method16573(-1982766353) << 2;
	    int i_359_ = class534_sub40_sub1.method16745(-891094135);
	    int i_360_ = class534_sub40_sub1.method16745(-891094135);
	    Class609.method10071(2136586002);
	    Class179.method2975(i_360_, i_356_, i_358_, i_357_, i_359_, true,
				790354351);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4538) {
	    boolean bool = class534_sub40_sub1.method16527(1310364487) == 1;
	    byte[] is = new byte[class100.anInt1197 * -1013636781 - 1];
	    class534_sub40_sub1.method16735(is, 0,
					    (-1013636781 * class100.anInt1197
					     - 1),
					    (short) -26883);
	    Class367.method6366(bool, is, -16777216);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4500) {
	    String string = class534_sub40_sub1.method16541((byte) -59);
	    boolean bool = class534_sub40_sub1.method16527(-1382695159) == 1;
	    String string_361_;
	    if (bool)
		string_361_ = class534_sub40_sub1.method16541((byte) -5);
	    else
		string_361_ = string;
	    int i_362_ = class534_sub40_sub1.method16529((byte) 1);
	    byte i_363_ = class534_sub40_sub1.method16586((byte) 1);
	    boolean bool_364_ = false;
	    if (-128 == i_363_)
		bool_364_ = true;
	    if (bool_364_) {
		if (0 == -217094943 * Class455.anInt4963) {
		    class100.aClass409_1186 = null;
		    return true;
		}
		boolean bool_365_ = false;
		int i_366_;
		for (i_366_ = 0;
		     (i_366_ < Class455.anInt4963 * -217094943
		      && (!Class168.aClass98Array1792[i_366_].aString1162
			       .equals(string_361_)
			  || 1829245767 * (Class168.aClass98Array1792[i_366_]
					   .anInt1164) != i_362_));
		     i_366_++) {
		    /* empty */
		}
		if (i_366_ < -217094943 * Class455.anInt4963) {
		    for (/**/; i_366_ < -217094943 * Class455.anInt4963 - 1;
			 i_366_++)
			Class168.aClass98Array1792[i_366_]
			    = Class168.aClass98Array1792[i_366_ + 1];
		    Class455.anInt4963 -= -492511455;
		    Class168.aClass98Array1792[-217094943 * Class455.anInt4963]
			= null;
		}
	    } else {
		String string_367_
		    = class534_sub40_sub1.method16541((byte) -80);
		Class98 class98 = new Class98();
		class98.aString1165 = string;
		class98.aString1162 = string_361_;
		class98.aString1161
		    = Class465.method7570(class98.aString1162,
					  Class39.aClass76_307, (byte) -5);
		class98.anInt1164 = i_362_ * 2127144567;
		class98.aByte1163 = i_363_;
		class98.aString1166 = string_367_;
		int i_368_;
		for (i_368_ = Class455.anInt4963 * -217094943 - 1; i_368_ >= 0;
		     i_368_--) {
		    int i_369_ = Class168.aClass98Array1792[i_368_]
				     .aString1161
				     .compareTo(class98.aString1161);
		    if (i_369_ == 0) {
			Class168.aClass98Array1792[i_368_].anInt1164
			    = 2127144567 * i_362_;
			Class168.aClass98Array1792[i_368_].aByte1163 = i_363_;
			Class168.aClass98Array1792[i_368_].aString1166
			    = string_367_;
			if (string_361_.equals
			    (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			     .aString12211))
			    Class66.aByte714 = i_363_;
			client.anInt11268 = 1316164627 * client.anInt11095;
			class100.aClass409_1186 = null;
			return true;
		    }
		    if (i_369_ < 0)
			break;
		}
		if (-217094943 * Class455.anInt4963
		    >= Class168.aClass98Array1792.length) {
		    class100.aClass409_1186 = null;
		    return true;
		}
		for (int i_370_ = -217094943 * Class455.anInt4963 - 1;
		     i_370_ > i_368_; i_370_--)
		    Class168.aClass98Array1792[1 + i_370_]
			= Class168.aClass98Array1792[i_370_];
		if (0 == -217094943 * Class455.anInt4963)
		    Class168.aClass98Array1792 = new Class98[100];
		Class168.aClass98Array1792[i_368_ + 1] = class98;
		Class455.anInt4963 += -492511455;
		if (string_361_.equals(Class322
				       .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				       .aString12211))
		    Class66.aByte714 = i_363_;
	    }
	    client.anInt11268 = 1316164627 * client.anInt11095;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4502 == class100.aClass409_1186) {
	    Class704.method14222(Class419.aClass419_4703, -1375181424);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4384 == class100.aClass409_1186) {
	    while (class534_sub40_sub1.anInt10811 * 31645619
		   < class100.anInt1197 * -1013636781) {
		int i_371_ = class534_sub40_sub1.method16527(-1656444585);
		boolean bool = (i_371_ & 0x1) == 1;
		String string = class534_sub40_sub1.method16541((byte) -22);
		String string_372_
		    = class534_sub40_sub1.method16541((byte) -85);
		String string_373_
		    = class534_sub40_sub1.method16541((byte) -30);
		for (int i_374_ = 0; i_374_ < 2103713403 * client.anInt11329;
		     i_374_++) {
		    Class33 class33 = client.aClass33Array11299[i_374_];
		    if (bool) {
			if (string_372_.equals(class33.aString273)) {
			    class33.aString273 = string;
			    class33.aString275 = string_372_;
			    string = null;
			    break;
			}
		    } else if (string.equals(class33.aString273)) {
			class33.aString273 = string;
			class33.aString275 = string_372_;
			class33.aString274 = string_373_;
			string = null;
			break;
		    }
		}
		if (null != string && 2103713403 * client.anInt11329 < 400) {
		    Class33 class33 = new Class33();
		    client.aClass33Array11299[2103713403 * client.anInt11329]
			= class33;
		    class33.aString273 = string;
		    class33.aString275 = string_372_;
		    class33.aString274 = string_373_;
		    class33.aBool272 = 2 == (i_371_ & 0x2);
		    client.anInt11329 += 1662324915;
		}
	    }
	    client.anInt11261 = -664271315 * client.anInt11095;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4530) {
	    client.anInt11270 = 930325597 * client.anInt11095;
	    boolean bool = class534_sub40_sub1.method16527(-2101057718) == 1;
	    if (1 == -1013636781 * class100.anInt1197) {
		if (bool)
		    Class574.aClass534_Sub26_7710 = null;
		else
		    Class489.aClass534_Sub26_5312 = null;
		class100.aClass409_1186 = null;
		return true;
	    }
	    if (bool)
		Class574.aClass534_Sub26_7710
		    = new Class534_Sub26(class534_sub40_sub1);
	    else
		Class489.aClass534_Sub26_5312
		    = new Class534_Sub26(class534_sub40_sub1);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4541 == class100.aClass409_1186) {
	    int i_375_ = class534_sub40_sub1.method16529((byte) 1);
	    Class171_Sub4.aClass232_9944.method4221(i_375_, (byte) 63);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4532) {
	    byte i_376_ = class534_sub40_sub1.method16567((byte) -48);
	    int i_377_ = class534_sub40_sub1.method16572((byte) 124);
	    Class78.aClass103_825.aClass612_1294.method10097
		((Class150) Class562.aClass110_Sub1_Sub1_7560
				.method91(i_377_, 356390778),
		 i_376_, 175869022);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4484 == class100.aClass409_1186) {
	    int i_378_ = class534_sub40_sub1.method16527(873229593);
	    Class703 class703
		= (Class703) Class448.method7319(Class66.method1362((byte) 54),
						 i_378_, 2088438307);
	    if (null == class703)
		class703 = Class703.aClass703_8819;
	    Class452.method7391(class703, -864717877);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4493 == class100.aClass409_1186) {
	    Class704.method14222(Class419.aClass419_4702, -1658478003);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4423) {
	    client.anInt11295
		= class534_sub40_sub1.method16563((byte) -52) * -905836865;
	    client.anInt11069
		= class534_sub40_sub1.method16745(-891094135) * -81702317;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4543) {
	    byte i_379_ = class534_sub40_sub1.method16586((byte) 1);
	    Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
		.method18864(class534_sub40_sub1, i_379_, 1924541653);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4449 == class100.aClass409_1186) {
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4392) {
	    int i_380_ = class534_sub40_sub1.method16533(-258848859);
	    int i_381_ = class534_sub40_sub1.method16514((short) -29446);
	    Class609.method10071(2136586002);
	    RSSocket.method827(i_381_, 2, i_380_, -1, -178015082);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4524 == class100.aClass409_1186) {
	    while (31645619 * class534_sub40_sub1.anInt10811
		   < -1013636781 * class100.anInt1197) {
		boolean bool
		    = class534_sub40_sub1.method16527(-1717949063) == 1;
		String string = class534_sub40_sub1.method16541((byte) -21);
		String string_382_
		    = class534_sub40_sub1.method16541((byte) -58);
		int i_383_ = class534_sub40_sub1.method16529((byte) 1);
		int i_384_ = class534_sub40_sub1.method16527(666865788);
		int i_385_ = class534_sub40_sub1.method16527(1294356745);
		boolean bool_386_ = 0 != (i_385_ & 0x2);
		boolean bool_387_ = 0 != (i_385_ & 0x1);
		String string_388_ = "";
		int i_389_ = -1;
		int i_390_ = 0;
		if (i_383_ > 0) {
		    string_388_ = class534_sub40_sub1.method16541((byte) -97);
		    i_389_ = class534_sub40_sub1.method16527(210220275);
		    i_390_ = class534_sub40_sub1.method16533(-258848859);
		}
		String string_391_
		    = class534_sub40_sub1.method16541((byte) -114);
		for (int i_392_ = 0; i_392_ < -1979292205 * client.anInt11324;
		     i_392_++) {
		    Class28 class28 = client.aClass28Array11327[i_392_];
		    if (!bool) {
			if (string.equals(class28.aString257)) {
			    if (class28.anInt251 * -721928209 != i_383_) {
				boolean bool_393_ = true;
				for (Class536_Sub4 class536_sub4
					 = ((Class536_Sub4)
					    client.aClass709_11355
						.method14301(764908544));
				     null != class536_sub4;
				     class536_sub4
					 = ((Class536_Sub4)
					    client.aClass709_11355
						.method14282(1314315107))) {
				    if (class536_sub4.aString10365
					    .equals(string)) {
					if (i_383_ != 0
					    && (class536_sub4.aShort10363
						== 0)) {
					    class536_sub4
						.method8900(1096807625);
					    bool_393_ = false;
					} else if (i_383_ == 0
						   && (class536_sub4
						       .aShort10363) != 0) {
					    class536_sub4
						.method8900(-1093030672);
					    bool_393_ = false;
					}
				    }
				}
				if (bool_393_)
				    client.aClass709_11355.method14287
					(new Class536_Sub4(string, i_383_),
					 2111320649);
				class28.anInt251 = -1335963889 * i_383_;
			    }
			    class28.aString250 = string_382_;
			    class28.aString249 = string_388_;
			    class28.anInt253 = i_384_ * 1873554437;
			    class28.anInt252 = i_389_ * -1407318909;
			    class28.aBool255 = bool_386_;
			    class28.aBool256 = bool_387_;
			    class28.aString254 = string_391_;
			    class28.anInt258 = 748324665 * i_390_;
			    string = null;
			    break;
			}
		    } else if (string_382_.equals(class28.aString257)) {
			class28.aString257 = string;
			class28.aString250 = string_382_;
			string = null;
			break;
		    }
		}
		if (string != null && -1979292205 * client.anInt11324 < 400) {
		    Class28 class28 = new Class28();
		    client.aClass28Array11327[client.anInt11324 * -1979292205]
			= class28;
		    class28.aString257 = string;
		    class28.aString250 = string_382_;
		    class28.anInt251 = -1335963889 * i_383_;
		    class28.aString249 = string_388_;
		    class28.anInt253 = 1873554437 * i_384_;
		    class28.anInt252 = i_389_ * -1407318909;
		    class28.aBool255 = bool_386_;
		    class28.aBool256 = bool_387_;
		    class28.aString254 = string_391_;
		    class28.anInt258 = 748324665 * i_390_;
		    client.anInt11324 += 1605909083;
		}
	    }
	    client.anInt11171 = 1119207202;
	    client.anInt11261 = -664271315 * client.anInt11095;
	    boolean bool = false;
	    int i_394_ = client.anInt11324 * -1979292205;
	    do {
		if (i_394_ <= 0)
		    break;
		bool = true;
		i_394_--;
		for (int i_395_ = 0; i_395_ < i_394_; i_395_++) {
		    boolean bool_396_ = false;
		    Class28 class28 = client.aClass28Array11327[i_395_];
		    Class28 class28_397_
			= client.aClass28Array11327[1 + i_395_];
		    if ((-721928209 * class28.anInt251
			 != -1664252895 * Class685.aClass23_8698.anInt227)
			&& (Class685.aClass23_8698.anInt227 * -1664252895
			    == -721928209 * class28_397_.anInt251))
			bool_396_ = true;
		    if (!bool_396_ && -721928209 * class28.anInt251 == 0
			&& 0 != -721928209 * class28_397_.anInt251)
			bool_396_ = true;
		    if (!bool_396_ && !class28.aBool255
			&& class28_397_.aBool255)
			bool_396_ = true;
		    if (!bool_396_ && !class28.aBool256
			&& class28_397_.aBool256)
			bool_396_ = true;
		    if (bool_396_) {
			Class28 class28_398_
			    = client.aClass28Array11327[i_395_];
			client.aClass28Array11327[i_395_]
			    = client.aClass28Array11327[1 + i_395_];
			client.aClass28Array11327[i_395_ + 1] = class28_398_;
			bool = false;
		    }
		}
	    } while (!bool);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4470 == class100.aClass409_1186) {
	    int i_399_ = class534_sub40_sub1.method16527(-303529731);
	    int i_400_ = class534_sub40_sub1.method16527(2129116867);
	    if (class534_sub40_sub1.method16527(-1988548681) == 0)
		client.aClass492ArrayArray11027[i_399_][i_400_]
		    = new Class492();
	    else {
		class534_sub40_sub1.anInt10811 -= -1387468933;
		client.aClass492ArrayArray11027[i_399_][i_400_]
		    = new Class492(class534_sub40_sub1, null);
	    }
	    client.anInt11271 = client.anInt11095 * 1017147843;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4396) {
	    int i_401_ = class534_sub40_sub1.method16572((byte) 110);
	    int i_402_ = class534_sub40_sub1.method16581(1525209586);
	    int i_403_ = class534_sub40_sub1.method16573(-1982766353);
	    client.aClass512_11100.method8424((byte) 89)
		.method9289(i_403_, i_402_, i_401_, 936655523);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4482 == class100.aClass409_1186) {
	    if (!client.aBool11339) {
		try {
		    int i_404_ = class534_sub40_sub1.method16643(-2082363145);
		    int i_405_ = class534_sub40_sub1.method16563((byte) -102);
		    int i_406_ = class534_sub40_sub1.method16745(-891094135);
		    client.aClass219_11338.method4120(i_406_, (byte) 89)
			.method4354(i_405_, i_404_, (byte) 62);
		} catch (RuntimeException runtimeexception) {
		    Class262.method4824(null, runtimeexception, (byte) -120);
		    Class457.method7432(class100, 1005167766);
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4383 == class100.aClass409_1186) {
	    int i_407_ = class534_sub40_sub1.method16563((byte) -64);
	    int i_408_ = class534_sub40_sub1.method16563((byte) -36);
	    int i_409_ = class534_sub40_sub1.method16563((byte) -40);
	    int i_410_ = class534_sub40_sub1.method16529((byte) 1) << 2;
	    int i_411_ = class534_sub40_sub1.method16563((byte) -115);
	    Class609.method10071(2136586002);
	    Class603.method10027(i_408_, i_407_, i_410_, i_411_, i_409_,
				 2144895755);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4400) {
	    int i_412_ = class534_sub40_sub1.method16581(-1952718570);
	    String string = class534_sub40_sub1.method16541((byte) -111);
	    Class609.method10071(2136586002);
	    Class212.method4015(i_412_, string, 1810512457);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4483) {
	    int i_413_ = class534_sub40_sub1.method16563((byte) -17);
	    int i_414_ = class534_sub40_sub1.method16581(-2107015669);
	    int i_415_ = class534_sub40_sub1.method16581(2020730642);
	    int i_416_ = class534_sub40_sub1.method16527(1220087129);
	    int i_417_ = class534_sub40_sub1.method16563((byte) -24);
	    int i_418_ = i_414_ >> 28;
	    int i_419_ = i_414_ >> 14 & 0x3fff;
	    int i_420_ = i_414_ & 0x3fff;
	    Class171_Sub4.aClass232_9944.method4274(i_415_, i_416_, true,
						    i_418_, i_419_ << 9,
						    i_420_ << 9, i_417_ << 9,
						    i_413_ << 9, 1843228320);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4537) {
	    Class200_Sub4.anInt9897
		= class534_sub40_sub1.method16532(-676065872) * -1278504939;
	    client.aBool11223
		= class534_sub40_sub1.method16527(1486398401) == 1;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4534 == class100.aClass409_1186) {
	    if (Class713.aBool8884 && null != Class29.aFrame266)
		Class159.method2611(Class44_Sub6.aClass534_Sub35_10989
					.aClass690_Sub8_10775
					.method16947(228294768),
				    -1, -1, false, 758126306);
	    byte[] is = new byte[-1013636781 * class100.anInt1197];
	    class534_sub40_sub1.method18291(is, 0,
					    -1013636781 * class100.anInt1197,
					    (byte) 1);
	    String string
		= Class376.method6418(is, 0, -1013636781 * class100.anInt1197,
				      -1786457139);
	    Class468.method7622(string, true, client.aBool11032, 1411490484);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4399) {
	    Class704.method14222(Class419.aClass419_4701, -1513594282);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4486 == class100.aClass409_1186) {
	    client.anInt11270 = 930325597 * client.anInt11095;
	    boolean bool = class534_sub40_sub1.method16527(-1415452521) == 1;
	    Class351 class351 = new Class351(class534_sub40_sub1);
	    Class534_Sub26 class534_sub26;
	    if (bool)
		class534_sub26 = Class574.aClass534_Sub26_7710;
	    else
		class534_sub26 = Class489.aClass534_Sub26_5312;
	    class351.method6179(class534_sub26, -1955588587);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4518) {
	    String string = class534_sub40_sub1.method16541((byte) -48);
	    Class504.method8327(string, false, false, 2140979280);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4375) {
	    if (!client.aBool11339) {
		try {
		    int i_421_ = class534_sub40_sub1.method16563((byte) -18);
		    int i_422_ = class534_sub40_sub1.method16527(671563175);
		    int i_423_ = class534_sub40_sub1.method16563((byte) -67);
		    client.aClass219_11338.method4120(i_422_, (byte) 103)
			.method4366(i_423_, i_421_, null, 1499544287);
		} catch (RuntimeException runtimeexception) {
		    Class262.method4824(null, runtimeexception, (byte) -59);
		    Class457.method7432(class100, -757377901);
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4394) {
	    if (client.anInt11185 * -993629849 != -1)
		Class67.method1385(client.anInt11185 * -993629849, 0,
				   743051080);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4430 == class100.aClass409_1186) {
	    int i_424_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_425_ = class534_sub40_sub1.method16527(1061384996);
	    boolean bool = (i_425_ & 0x1) != 0;
	    boolean bool_426_ = 0 != (i_425_ & 0x2);
	    while (31645619 * class534_sub40_sub1.anInt10811
		   < -1013636781 * class100.anInt1197) {
		int i_427_ = class534_sub40_sub1.method16546(-1706829710);
		int i_428_ = class534_sub40_sub1.method16529((byte) 1);
		int i_429_ = 0;
		Class8 class8 = null;
		if (i_428_ != 0) {
		    i_429_ = class534_sub40_sub1.method16527(1658104512);
		    if (255 == i_429_)
			i_429_ = class534_sub40_sub1.method16533(-258848859);
		    if (bool_426_) {
			int i_430_
			    = class534_sub40_sub1.method16527(-1796050502);
			if (i_430_ > 0) {
			    class8 = new Class8(Class534_Sub24
						.aClass110_Sub1_Sub2_10565);
			    while (i_430_-- > 0) {
				Class429 class429
				    = (Class534_Sub24
					   .aClass110_Sub1_Sub2_10565
					   .method14495
				       (class534_sub40_sub1, (byte) -115));
				class8.method29((class429.anInt4820
						 * -608978823),
						class429.anObject4819,
						(short) -18576);
			    }
			}
		    }
		}
		Class154.method2577(i_424_, i_427_, i_428_ - 1, i_429_, class8,
				    bool, 475217490);
	    }
	    client.anIntArray11256
		[(client.anInt11257 += -1459399321) * 816576087 - 1 & 0x3f]
		= i_424_;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4507 == class100.aClass409_1186) {
	    int i_431_ = class534_sub40_sub1.method16573(-1982766353);
	    if (i_431_ == 65535)
		i_431_ = -1;
	    int i_432_ = class534_sub40_sub1.method16581(729330169);
	    int i_433_ = class534_sub40_sub1.method16572((byte) 33);
	    if (i_433_ == 65535)
		i_433_ = -1;
	    int i_434_ = class534_sub40_sub1.method16529((byte) 1);
	    Class609.method10071(2136586002);
	    for (int i_435_ = i_431_; i_435_ <= i_433_; i_435_++) {
		long l = (long) i_435_ + ((long) i_432_ << 32);
		Class534_Sub25 class534_sub25
		    = (Class534_Sub25) client.aClass9_11208.method579(l);
		Class534_Sub25 class534_sub25_436_;
		if (null == class534_sub25) {
		    if (i_435_ == -1)
			class534_sub25_436_
			    = new Class534_Sub25((Class112.method2017
						  (i_432_, 463810711)
						  .aClass534_Sub25_2428
						  .anInt10574) * 1837782131,
						 i_434_);
		    else
			class534_sub25_436_ = new Class534_Sub25(0, i_434_);
		} else {
		    class534_sub25_436_
			= new Class534_Sub25((class534_sub25.anInt10574
					      * 1837782131),
					     i_434_);
		    class534_sub25.method8892((byte) 1);
		}
		client.aClass9_11208.method581(class534_sub25_436_, l);
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4546) {
	    int i_437_ = class534_sub40_sub1.method16582(1522423460);
	    Class609.method10071(2136586002);
	    Class534_Sub37 class534_sub37
		= ((Class534_Sub37)
		   client.aClass9_11224.method579((long) i_437_));
	    if (class534_sub37 != null)
		Class534_Sub41.method16766(class534_sub37, true, false,
					   -501970604);
	    if (null != client.aClass247_11119) {
		Class454.method7416(client.aClass247_11119, -573706311);
		client.aClass247_11119 = null;
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4487 == class100.aClass409_1186) {
	    int i_438_ = class534_sub40_sub1.method16573(-1982766353);
	    int i_439_ = class534_sub40_sub1.method16745(-891094135);
	    int i_440_ = class534_sub40_sub1.method16572((byte) 35);
	    if (65535 == i_440_)
		i_440_ = -1;
	    int i_441_ = class534_sub40_sub1.method16745(-891094135);
	    int i_442_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_443_ = class534_sub40_sub1.method16533(-258848859);
	    int i_444_ = i_441_ & 0x7;
	    int i_445_ = i_441_ >> 3 & 0xf;
	    if (i_445_ == 15)
		i_445_ = -1;
	    boolean bool = 1 == (i_441_ >> 7 & 0x1);
	    if (0 != i_443_ >> 30) {
		Class597 class597
		    = client.aClass512_11100.method8416((byte) 115);
		int i_446_ = i_443_ >> 28 & 0x3;
		int i_447_ = ((i_443_ >> 14 & 0x3fff)
			      - class597.anInt7859 * -424199969);
		int i_448_
		    = (i_443_ & 0x3fff) - -1166289421 * class597.anInt7861;
		if (i_447_ >= 0 && i_448_ >= 0
		    && i_447_ < client.aClass512_11100.method8417(1985369695)
		    && (i_448_
			< client.aClass512_11100.method8418(-1533611049))) {
		    if (-1 == i_440_) {
			Class534_Sub18_Sub5 class534_sub18_sub5
			    = ((Class534_Sub18_Sub5)
			       client.aClass9_11322
				   .method579((long) (i_447_ << 16 | i_448_)));
			if (null != class534_sub18_sub5) {
			    class534_sub18_sub5
				.aClass654_Sub1_Sub5_Sub5_11651
				.method18781((byte) 101);
			    class534_sub18_sub5.method8892((byte) 1);
			}
		    } else {
			int i_449_ = 512 * i_447_ + 256;
			int i_450_ = i_448_ * 512 + 256;
			int i_451_ = i_446_;
			if (i_451_ < 3
			    && client.aClass512_11100.method8552((byte) 0)
				   .method7612(i_447_, i_448_, (byte) 0))
			    i_451_++;
			Class654_Sub1_Sub5_Sub5 class654_sub1_sub5_sub5
			    = (new Class654_Sub1_Sub5_Sub5
			       (client.aClass512_11100.method8424((byte) 44),
				i_440_, i_438_, i_446_, i_451_, i_449_,
				Class247.method4595(i_449_, i_450_, i_446_,
						    33035203) - i_442_,
				i_450_, i_447_, i_447_, i_448_, i_448_, i_444_,
				bool, 0));
			client.aClass9_11322.method581
			    (new Class534_Sub18_Sub5(class654_sub1_sub5_sub5),
			     (long) (i_447_ << 16 | i_448_));
		    }
		}
	    } else if (0 != i_443_ >> 29) {
		int i_452_ = i_443_ & 0xffff;
		Class534_Sub6 class534_sub6
		    = ((Class534_Sub6)
		       client.aClass9_11331.method579((long) i_452_));
		if (null != class534_sub6) {
		    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			= ((Class654_Sub1_Sub5_Sub1_Sub1)
			   class534_sub6.anObject10417);
		    Class529 class529 = (class654_sub1_sub5_sub1_sub1
					 .aClass529Array11949[i_439_]);
		    if (65535 == i_440_)
			i_440_ = -1;
		    boolean bool_453_ = true;
		    int i_454_ = class529.anInt7123 * -1183861629;
		    if (-1 != i_440_ && i_454_ != -1) {
			if (i_440_ == i_454_) {
			    Class684 class684
				= (Class684) Class55.aClass44_Sub4_447
						 .method91(i_440_, -926367093);
			    if (class684.aBool8691
				&& class684.anInt8688 * -811043807 != -1) {
				Class205 class205
				    = ((Class205)
				       (Class200_Sub12.aClass44_Sub1_9934
					    .method91
					(-811043807 * class684.anInt8688,
					 154304926)));
				int i_455_ = class205.anInt2223 * 629077835;
				if (0 == i_455_ || i_455_ == 2)
				    bool_453_ = false;
				else if (i_455_ == 1)
				    bool_453_ = true;
			    }
			} else {
			    Class684 class684
				= (Class684) Class55.aClass44_Sub4_447
						 .method91(i_440_, 199856848);
			    Class684 class684_456_
				= (Class684) Class55.aClass44_Sub4_447
						 .method91(i_454_, 106295806);
			    if (-1 != class684.anInt8688 * -811043807
				&& (-1
				    != -811043807 * class684_456_.anInt8688)) {
				Class205 class205
				    = ((Class205)
				       (Class200_Sub12.aClass44_Sub1_9934
					    .method91
					(class684.anInt8688 * -811043807,
					 -95945533)));
				Class205 class205_457_
				    = ((Class205)
				       (Class200_Sub12.aClass44_Sub1_9934
					    .method91
					(class684_456_.anInt8688 * -811043807,
					 51402586)));
				if (class205.anInt2217 * 995056269
				    < class205_457_.anInt2217 * 995056269)
				    bool_453_ = false;
			    }
			}
		    }
		    if (bool_453_) {
			class529.anInt7123 = 496843307 * i_440_;
			class529.anInt7122 = 1188140141 * i_442_;
			class529.anInt7124 = 1026088823 * i_445_;
			if (-1 != i_440_) {
			    Class684 class684
				= ((Class684)
				   Class55.aClass44_Sub4_447
				       .method91(i_440_, -1789952789));
			    int i_458_ = class684.aBool8691 ? 0 : 2;
			    if (bool)
				i_458_ = 1;
			    class529.aClass711_7121.method14334
				(class684.anInt8688 * -811043807, i_438_,
				 i_458_, false, (byte) -103);
			} else
			    class529.aClass711_7121.method14330(-1,
								2003269218);
		    }
		}
	    } else if (0 != i_443_ >> 28) {
		int i_459_ = i_443_ & 0xffff;
		Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2;
		if (-643758853 * client.anInt11037 == i_459_)
		    class654_sub1_sub5_sub1_sub2
			= Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419;
		else
		    class654_sub1_sub5_sub1_sub2
			= (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			   [i_459_]);
		if (class654_sub1_sub5_sub1_sub2 != null) {
		    Class529 class529 = (class654_sub1_sub5_sub1_sub2
					 .aClass529Array11949[i_439_]);
		    if (i_440_ == 65535)
			i_440_ = -1;
		    boolean bool_460_ = true;
		    int i_461_ = class529.anInt7123 * -1183861629;
		    if (-1 != i_440_ && -1 != i_461_) {
			if (i_461_ == i_440_) {
			    Class684 class684
				= (Class684) Class55.aClass44_Sub4_447
						 .method91(i_440_, 1425325133);
			    if (class684.aBool8691
				&& class684.anInt8688 * -811043807 != -1) {
				Class205 class205
				    = ((Class205)
				       (Class200_Sub12.aClass44_Sub1_9934
					    .method91
					(class684.anInt8688 * -811043807,
					 -247011153)));
				int i_462_ = class205.anInt2223 * 629077835;
				if (0 == i_462_ || i_462_ == 2)
				    bool_460_ = false;
				else if (i_462_ == 1)
				    bool_460_ = true;
			    }
			} else {
			    Class684 class684
				= (Class684) Class55.aClass44_Sub4_447
						 .method91(i_440_, 933410653);
			    Class684 class684_463_
				= (Class684) Class55.aClass44_Sub4_447
						 .method91(i_461_, 1269537506);
			    if (-811043807 * class684.anInt8688 != -1
				&& (-1
				    != -811043807 * class684_463_.anInt8688)) {
				Class205 class205
				    = ((Class205)
				       (Class200_Sub12.aClass44_Sub1_9934
					    .method91
					(-811043807 * class684.anInt8688,
					 1067698652)));
				Class205 class205_464_
				    = ((Class205)
				       (Class200_Sub12.aClass44_Sub1_9934
					    .method91
					(class684_463_.anInt8688 * -811043807,
					 -1078172488)));
				if (995056269 * class205.anInt2217
				    < 995056269 * class205_464_.anInt2217)
				    bool_460_ = false;
			    }
			}
		    }
		    if (bool_460_) {
			class529.anInt7123 = 496843307 * i_440_;
			class529.anInt7122 = 1188140141 * i_442_;
			class529.anInt7124 = 1026088823 * i_445_;
			class529.anInt7120 = -1172805917 * i_444_;
			if (i_440_ != -1) {
			    Class684 class684
				= ((Class684)
				   Class55.aClass44_Sub4_447
				       .method91(i_440_, -1359458400));
			    int i_465_ = class684.aBool8691 ? 0 : 2;
			    if (bool)
				i_465_ = 1;
			    class529.aClass711_7121.method14334
				(-811043807 * class684.anInt8688, i_438_,
				 i_465_, false, (byte) -5);
			} else
			    class529.aClass711_7121.method14330(-1,
								1788816879);
		    }
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4464 == class100.aClass409_1186) {
	    int i_466_ = class534_sub40_sub1.method16581(-360901168);
	    int i_467_ = class534_sub40_sub1.method16581(300815513);
	    Class609.method10071(2136586002);
	    Class452.method7392(i_466_, i_467_, 1131650723);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4416 == class100.aClass409_1186) {
	    Class50.method1164(class534_sub40_sub1,
			       class100.anInt1197 * -1013636781, -1127603552);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4488) {
	    int i_468_ = class534_sub40_sub1.method16571(-1037138982);
	    byte i_469_ = class534_sub40_sub1.method16566(1199159719);
	    Class609.method10071(2136586002);
	    Class696.method14103(i_468_, i_469_, -116109187);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4475) {
	    int i_470_ = class534_sub40_sub1.method16582(1522423460);
	    int i_471_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_472_ = class534_sub40_sub1.method16582(1522423460);
	    int i_473_ = class534_sub40_sub1.method16514((short) -564);
	    int i_474_ = class534_sub40_sub1.method16563((byte) -114);
	    int i_475_ = class534_sub40_sub1.method16529((byte) 1);
	    int i_476_ = class534_sub40_sub1.method16514((short) -13825);
	    int i_477_ = class534_sub40_sub1.method16582(1522423460);
	    Class609.method10071(2136586002);
	    Class703.method14219(i_472_,
				 new Class534_Sub37_Sub1(i_475_, i_474_,
							 i_471_),
				 new int[] { i_470_, i_473_, i_477_, i_476_ },
				 false, -64645438);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4517 == class100.aClass409_1186) {
	    Class704.method14222(Class419.aClass419_4699, -1216070318);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4557 == class100.aClass409_1186) {
	    class534_sub40_sub1.anInt10811 += -194424460;
	    if (class534_sub40_sub1.method16558(146868455))
		Class641.method10602(class534_sub40_sub1,
				     (class534_sub40_sub1.anInt10811 * 31645619
				      - 28),
				     (byte) 99);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4515) {
	    Class534_Sub40_Sub1 class534_sub40_sub1_478_
		= new Class534_Sub40_Sub1(-1013636781 * class100.anInt1197);
	    System.arraycopy((class100.aClass534_Sub40_Sub1_1179
			      .aByteArray10810),
			     (class100.aClass534_Sub40_Sub1_1179.anInt10811
			      * 31645619),
			     class534_sub40_sub1_478_.aByteArray10810, 0,
			     -1013636781 * class100.anInt1197);
	    Class200_Sub12.method15586((byte) 55);
	    if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub39_10782
		    .method17209((short) 11514)
		== 1)
		Class159.aClass509_1754.method8388
		    (new Class511(Class499.aClass499_5595,
				  class534_sub40_sub1_478_),
		     785703857);
	    else
		client.aClass512_11100.method8442
		    (new Class511(Class499.aClass499_5595,
				  class534_sub40_sub1_478_),
		     -818455639);
	    class100.aClass409_1186 = null;
	    return false;
	}
	if (Class409.aClass409_4436 == class100.aClass409_1186) {
	    Class113.anInt1365
		= class534_sub40_sub1.method16527(1861414142) * 1050310007;
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4473 == class100.aClass409_1186) {
	    Class704.method14222(Class419.aClass419_4689, -1806824590);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4452 == class100.aClass409_1186) {
	    int i_479_ = class534_sub40_sub1.method16571(-403780494);
	    if (65535 == i_479_)
		i_479_ = -1;
	    String string = class534_sub40_sub1.method16541((byte) -3);
	    int i_480_ = class534_sub40_sub1.method16563((byte) -2);
	    int i_481_ = class534_sub40_sub1.method16527(447952761);
	    if (i_480_ >= 1 && i_480_ <= 8) {
		if (string.equalsIgnoreCase("null"))
		    string = null;
		client.aStringArray11206[i_480_ - 1] = string;
		client.anIntArray11205[i_480_ - 1] = i_479_;
		client.aBoolArray11207[i_480_ - 1] = 0 == i_481_;
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4490) {
	    String string = class534_sub40_sub1.method16541((byte) -67);
	    int i_482_ = class534_sub40_sub1.method16529((byte) 1);
	    String string_483_
		= RuntimeException_Sub4.aClass56_12127.method1218
		      (i_482_, -1581069180)
		      .method18377(class534_sub40_sub1, 455497535);
	    Class216.method4111(19, 0, string, string, string, string_483_,
				null, i_482_, null, (byte) 87);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4529 == class100.aClass409_1186) {
	    int i_484_ = class534_sub40_sub1.method16527(2076532674);
	    Class699 class699
		= ((Class699)
		   Class448.method7319(Class394.method6562(-2026373201),
				       i_484_, 2088438307));
	    if (class699 == null)
		class699 = Class699.aClass699_8795;
	    Class431.method6835(class699, (byte) -41);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4412 == class100.aClass409_1186) {
	    Class704.method14222(Class419.aClass419_4695, -1956774789);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (class100.aClass409_1186 == Class409.aClass409_4411) {
	    if (!client.aBool11339) {
		try {
		    for (byte i_485_
			     = class534_sub40_sub1.method16586((byte) 1);
			 i_485_ != -1;
			 i_485_ = class534_sub40_sub1.method16586((byte) 1)) {
			for (byte i_486_
				 = class534_sub40_sub1.method16586((byte) 1);
			     i_486_ != -1;
			     i_486_
				 = class534_sub40_sub1.method16586((byte) 1)) {
			    for (byte i_487_ = class534_sub40_sub1
						   .method16586((byte) 1);
				 i_487_ != -1;
				 i_487_ = class534_sub40_sub1
					      .method16586((byte) 1))
				client.aClass219_11338.method4120
				    (i_485_, (byte) 61).method4366
				    (i_486_, i_487_,
				     Integer.valueOf(class534_sub40_sub1
							 .method16533
						     (-258848859)),
				     55036999);
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    Class262.method4824(null, runtimeexception, (byte) -27);
		    Class457.method7432(class100, -963420725);
		}
	    }
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4471 == class100.aClass409_1186) {
	    Class622.method10291(false, 812989822);
	    class100.aClass409_1186 = null;
	    return false;
	}
	if (Class409.aClass409_4494 == class100.aClass409_1186) {
	    int i_488_ = class534_sub40_sub1.method16571(-1255315798);
	    if (i_488_ == 65535)
		i_488_ = -1;
	    int i_489_ = class534_sub40_sub1.method16527(2019952440);
	    Class171_Sub4.aClass232_9944.method4244(i_488_, i_489_, (byte) 77);
	    class100.aClass409_1186 = null;
	    return true;
	}
	if (Class409.aClass409_4444 == class100.aClass409_1186) {
	    int i_490_ = class534_sub40_sub1.method16527(857850284);
	    i_490_ = -i_490_ - 2;
	    byte i_491_ = class534_sub40_sub1.method16586((byte) 1);
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= ((Class654_Sub1_Sub5_Sub1_Sub2)
		   client.aMap11191.get(Integer.valueOf(i_490_)));
	    if (class654_sub1_sub5_sub1_sub2 == null) {
		class654_sub1_sub5_sub1_sub2
		    = new Class654_Sub1_Sub5_Sub1_Sub2(null);
		class654_sub1_sub5_sub1_sub2.anInt11922 = -2061161143 * i_490_;
		client.aMap11191.put(Integer.valueOf(i_490_),
				     class654_sub1_sub5_sub1_sub2);
	    }
	    class654_sub1_sub5_sub1_sub2.method18864(class534_sub40_sub1,
						     i_491_, 1997537891);
	    class100.aClass409_1186 = null;
	    return true;
	}
	Class262.method4824
	    (new StringBuilder().append
		 (class100.aClass409_1186 != null
		  ? class100.aClass409_1186.anInt4511 * -1228959953 : -1)
		 .append
		 (Class29.aString260).append
		 (class100.aClass409_1196 != null
		  ? -1228959953 * class100.aClass409_1196.anInt4511 : -1)
		 .append
		 (Class29.aString260).append
		 (class100.aClass409_1195 != null
		  ? -1228959953 * class100.aClass409_1195.anInt4511 : -1)
		 .append
		 (" ").append
		 (-1013636781 * class100.anInt1197).toString(),
	     new RuntimeException(), (byte) -56);
	Class622.method10291(false, -1382943212);
	return true;
    }
    
    static Class16 method2620(int i) {
	Class16 class16;
	if (Class72.aBool784) {
	    if (null != Class57.aClass171_458
		&& Class287.aClass16_3084 != null)
		class16 = Class287.aClass16_3084;
	    else
		class16 = Class322.aClass16_3420;
	} else
	    class16 = Class322.aClass16_3420;
	Class72.anInt754
	    = 1660152313 * class16.anInt190 + class16.anInt189 * -1129366907;
	return class16;
    }
}
