/* Class278_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Map;

import jaggl.OpenGL;

public class Class278_Sub1 extends Class278
{
    boolean aBool10042;
    static final int anInt10043 = 35632;
    Class185_Sub1_Sub2 aClass185_Sub1_Sub2_10044;
    Map aMap10045;
    String aString10046;
    int anInt10047 = 0;
    Map aMap10048;
    static final int anInt10049 = 35633;
    int anInt10050 = 0;
    int[] anIntArray10051;
    static final int anInt10052 = 13;
    static float[] aFloatArray10053;
    static int[] anIntArray10054;
    Map aMap10055;
    Map aMap10056;
    Class269_Sub1 aClass269_Sub1_10057;
    Map aMap10058;
    int anInt10059 = 0;
    String aString10060;
    static boolean $assertionsDisabled
	= !com.jagex.Class278_Sub1.class.desiredAssertionStatus();
    
    void method5191(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_0_) {
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1) {
	    if (aMap10045.get(Integer.valueOf(i)) == null
		|| aMap10055.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10045.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10055.get(Integer.valueOf(i))).floatValue()
		    != f_0_)) {
		aMap10045.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10055.put(Integer.valueOf(i), Float.valueOf(f_0_));
		if (class534_sub12_sub1.method18237(-2028422310)
		    != Class264.aClass264_2829)
		    throw new IllegalArgumentException_Sub1
			      (class534_sub12_sub1, "");
		OpenGL.glUniform2f(i, f, f_0_);
	    }
	}
    }
    
    Class278_Sub1(Class185_Sub1_Sub2 class185_sub1_sub2, Class277 class277) {
	aBool10042 = false;
	anIntArray10051 = new int[13];
	aMap10045 = new HashMap();
	aMap10055 = new HashMap();
	aMap10056 = new HashMap();
	aMap10048 = new HashMap();
	aMap10058 = new HashMap();
	aString3052 = class277.aString3044;
	StringBuilder stringbuilder = new StringBuilder();
	if (class277.aString3048 != null) {
	    aString3051 = class277.aString3048;
	    if (class277.aClass276Array3047 != null) {
		Class276[] class276s = class277.aClass276Array3047;
		for (int i = 0; i < class276s.length; i++) {
		    Class276 class276 = class276s[i];
		    stringbuilder.append(new StringBuilder().append
					     ("#define ").append
					     (class276.aString3042).append
					     (" ").append
					     (class276.aString3043).append
					     ('\n').toString());
		}
	    }
	    stringbuilder.append(new String(class185_sub1_sub2
						.method18084(aString3051)));
	    aString10046 = stringbuilder.toString();
	}
	if (class277.aString3046 != null) {
	    aString3050 = class277.aString3046;
	    stringbuilder.setLength(0);
	    if (class277.aClass276Array3045 != null) {
		Class276[] class276s = class277.aClass276Array3045;
		for (int i = 0; i < class276s.length; i++) {
		    Class276 class276 = class276s[i];
		    stringbuilder.append(new StringBuilder().append
					     ("#define ").append
					     (class276.aString3042).append
					     (" ").append
					     (class276.aString3043).append
					     ('\n').toString());
		}
	    }
	    stringbuilder.append(new String(class185_sub1_sub2
						.method18084(aString3050)));
	    aString10060 = stringbuilder.toString();
	}
	Class688.method13990(anIntArray10051, 0, anIntArray10051.length, -1);
    }
    
    int method15663(int i, String string, String string_1_) {
	if (string == null)
	    return 0;
	int i_2_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_2_, string);
	OpenGL.glCompileShader(i_2_);
	OpenGL.glGetShaderiv(i_2_, 35713, anIntArray10054, 0);
	if (anIntArray10054[0] == 0) {
	    OpenGL.glDeleteShader(i_2_);
	    i_2_ = 0;
	}
	return i_2_;
    }
    
    public void method143() {
	if (anInt10047 != 0) {
	    aClass185_Sub1_Sub2_10044.method18073(anInt10047);
	    if (anInt10050 != 0)
		aClass185_Sub1_Sub2_10044.method18080((long) anInt10050);
	    if (anInt10059 != 0)
		aClass185_Sub1_Sub2_10044.method18080((long) anInt10059);
	    anInt10047 = 0;
	    anInt10050 = 0;
	    anInt10059 = 0;
	}
    }
    
    void method5169(Class534_Sub12_Sub1 class534_sub12_sub1, float f) {
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1) {
	    if (aMap10045.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10045.get(Integer.valueOf(i))).floatValue()
		    != f)) {
		aMap10045.put(Integer.valueOf(i), Float.valueOf(f));
		if ((class534_sub12_sub1.method18237(691499735)
		     != Class264.aClass264_2926)
		    && (class534_sub12_sub1.method18237(1623424322)
			!= Class264.aClass264_2874))
		    throw new IllegalArgumentException_Sub1
			      (class534_sub12_sub1, "");
		OpenGL.glUniform1f(i, f);
	    }
	}
    }
    
    void method5212(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_3_) {
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1) {
	    if (aMap10045.get(Integer.valueOf(i)) == null
		|| aMap10055.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10045.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10055.get(Integer.valueOf(i))).floatValue()
		    != f_3_)) {
		aMap10045.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10055.put(Integer.valueOf(i), Float.valueOf(f_3_));
		if (class534_sub12_sub1.method18237(113965034)
		    != Class264.aClass264_2829)
		    throw new IllegalArgumentException_Sub1
			      (class534_sub12_sub1, "");
		OpenGL.glUniform2f(i, f, f_3_);
	    }
	}
    }
    
    void method15664() {
	method142();
    }
    
    void method5172(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_4_, float f_5_, float f_6_) {
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1) {
	    if (aMap10045.get(Integer.valueOf(i)) == null
		|| aMap10055.get(Integer.valueOf(i)) == null
		|| aMap10056.get(Integer.valueOf(i)) == null
		|| aMap10048.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10045.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10055.get(Integer.valueOf(i))).floatValue()
		    != f_4_)
		|| (((Float) aMap10056.get(Integer.valueOf(i))).floatValue()
		    != f_5_)
		|| (((Float) aMap10048.get(Integer.valueOf(i))).floatValue()
		    != f_6_)) {
		aMap10045.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10055.put(Integer.valueOf(i), Float.valueOf(f_4_));
		aMap10056.put(Integer.valueOf(i), Float.valueOf(f_5_));
		aMap10048.put(Integer.valueOf(i), Float.valueOf(f_6_));
		if (class534_sub12_sub1.method18237(215902434)
		    != Class264.aClass264_2831)
		    throw new IllegalArgumentException_Sub1
			      (class534_sub12_sub1, "");
		OpenGL.glUniform4f(i, f, f_4_, f_5_, f_6_);
	    }
	}
    }
    
    void method5201(Class534_Sub12_Sub1 class534_sub12_sub1, float[] fs,
		    int i) {
	int i_7_
	    = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i_7_ != -1)
	    OpenGL.glUniform4fv(i_7_, i, fs, 0);
    }
    
    void method5202(int i, Class433 class433) {
	OpenGL.glUniform3fv(i, 3, class433.method6870(aFloatArray10053), 0);
    }
    
    void method5175(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	if (!$assertionsDisabled
	    && (class534_sub12_sub1.method18237(-930127513)
		!= Class264.aClass264_2838))
	    throw new AssertionError();
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1)
	    OpenGL.glUniform4fv(i, 4, class433.method6938(aFloatArray10053),
				0);
    }
    
    void method5222(int i, float f, float f_8_, float f_9_) {
	OpenGL.glUniform3f(i, f, f_8_, f_9_);
    }
    
    void method5177(int i, float f, float f_10_, float f_11_) {
	OpenGL.glUniform3f(i, f, f_10_, f_11_);
    }
    
    void method5178(int i, float f, float f_12_, float f_13_, float f_14_) {
	OpenGL.glUniform4f(i, f, f_12_, f_13_, f_14_);
    }
    
    void method5194(int i, float[] fs, int i_15_) {
	OpenGL.glUniform4fv(i, i_15_, fs, 0);
    }
    
    void method5180(int i, Class433 class433) {
	OpenGL.glUniform3fv(i, 3, class433.method6870(aFloatArray10053), 0);
    }
    
    void method5181(int i, Class433 class433) {
	OpenGL.glUniform2fv(i, 4, class433.method6872(aFloatArray10053), 0);
    }
    
    void method5209(int i, float f, float f_16_, float f_17_) {
	OpenGL.glUniform3f(i, f, f_16_, f_17_);
    }
    
    void method5183(int i, int i_18_, Interface43 interface43) {
	aClass185_Sub1_Sub2_10044.method14668(i_18_);
	aClass185_Sub1_Sub2_10044.method14669(interface43);
	OpenGL.glUniform1i(i, i_18_);
    }
    
    public void method142() {
	if (anInt10047 != 0) {
	    aClass185_Sub1_Sub2_10044.method18073(anInt10047);
	    if (anInt10050 != 0)
		aClass185_Sub1_Sub2_10044.method18080((long) anInt10050);
	    if (anInt10059 != 0)
		aClass185_Sub1_Sub2_10044.method18080((long) anInt10059);
	    anInt10047 = 0;
	    anInt10050 = 0;
	    anInt10059 = 0;
	}
    }
    
    public void finalize() {
	method142();
    }
    
    static {
	anIntArray10054 = new int[2];
	aFloatArray10053 = new float[16];
    }
    
    void method5196(int i, float f, float f_19_, float f_20_, float f_21_) {
	OpenGL.glUniform4f(i, f, f_19_, f_20_, f_21_);
    }
    
    public void method141() {
	if (anInt10047 != 0) {
	    aClass185_Sub1_Sub2_10044.method18073(anInt10047);
	    if (anInt10050 != 0)
		aClass185_Sub1_Sub2_10044.method18080((long) anInt10050);
	    if (anInt10059 != 0)
		aClass185_Sub1_Sub2_10044.method18080((long) anInt10059);
	    anInt10047 = 0;
	    anInt10050 = 0;
	    anInt10059 = 0;
	}
    }
    
    public void method144() {
	if (anInt10047 != 0) {
	    aClass185_Sub1_Sub2_10044.method18073(anInt10047);
	    if (anInt10050 != 0)
		aClass185_Sub1_Sub2_10044.method18080((long) anInt10050);
	    if (anInt10059 != 0)
		aClass185_Sub1_Sub2_10044.method18080((long) anInt10059);
	    anInt10047 = 0;
	    anInt10050 = 0;
	    anInt10059 = 0;
	}
    }
    
    void method5210(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_22_, float f_23_) {
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1) {
	    if (aMap10045.get(Integer.valueOf(i)) == null
		|| aMap10055.get(Integer.valueOf(i)) == null
		|| aMap10056.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10045.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10055.get(Integer.valueOf(i))).floatValue()
		    != f_22_)
		|| (((Float) aMap10056.get(Integer.valueOf(i))).floatValue()
		    != f_23_)) {
		aMap10045.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10055.put(Integer.valueOf(i), Float.valueOf(f_22_));
		aMap10056.put(Integer.valueOf(i), Float.valueOf(f_23_));
		if (class534_sub12_sub1.method18237(-1786527721)
		    != Class264.aClass264_2815)
		    throw new IllegalArgumentException_Sub1
			      (class534_sub12_sub1, "");
		OpenGL.glUniform3f(i, f, f_22_, f_23_);
	    }
	}
    }
    
    void method15665() {
	method142();
    }
    
    void method15666() {
	method142();
    }
    
    void method5171(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_24_, float f_25_) {
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1) {
	    if (aMap10045.get(Integer.valueOf(i)) == null
		|| aMap10055.get(Integer.valueOf(i)) == null
		|| aMap10056.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10045.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10055.get(Integer.valueOf(i))).floatValue()
		    != f_24_)
		|| (((Float) aMap10056.get(Integer.valueOf(i))).floatValue()
		    != f_25_)) {
		aMap10045.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10055.put(Integer.valueOf(i), Float.valueOf(f_24_));
		aMap10056.put(Integer.valueOf(i), Float.valueOf(f_25_));
		if (class534_sub12_sub1.method18237(1630977490)
		    != Class264.aClass264_2815)
		    throw new IllegalArgumentException_Sub1
			      (class534_sub12_sub1, "");
		OpenGL.glUniform3f(i, f, f_24_, f_25_);
	    }
	}
    }
    
    public boolean method5186() {
	if (aBool10042)
	    return true;
	aClass185_Sub1_Sub2_10044.aClass278_Sub1_11583 = null;
	anInt10050 = method15663(35633, aString10046, aString3051);
	anInt10059 = method15663(35632, aString10060, aString3050);
	if (anInt10050 == 0 || anInt10059 == 0) {
	    if (anInt10050 != 0)
		OpenGL.glDeleteShader(anInt10050);
	    if (anInt10059 != 0)
		OpenGL.glDeleteShader(anInt10059);
	    return false;
	}
	anInt10047 = OpenGL.glCreateProgram();
	if (anInt10050 != 0)
	    OpenGL.glAttachShader(anInt10047, anInt10050);
	if (anInt10059 != 0)
	    OpenGL.glAttachShader(anInt10047, anInt10059);
	OpenGL.glLinkProgram(anInt10047);
	OpenGL.glGetProgramiv(anInt10047, 35714, anIntArray10054, 0);
	if (anIntArray10054[0] == 0) {
	    if (anInt10050 != 0) {
		OpenGL.glDetachShader(anInt10047, anInt10050);
		OpenGL.glDeleteShader(anInt10050);
	    }
	    if (anInt10059 != 0) {
		OpenGL.glDetachShader(anInt10047, anInt10059);
		OpenGL.glDeleteShader(anInt10059);
	    }
	    OpenGL.glDeleteProgram(anInt10047);
	    return false;
	}
	OpenGL.glUseProgram(anInt10047);
	int i = -1;
	for (int i_26_ = 0;
	     i_26_ < aClass269_Sub1_10057.method4984((byte) 105); i_26_++) {
	    if (aClass269_Sub1_10057.method4916(i_26_, 56453164) == this) {
		i = i_26_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_27_ = 0; i_27_ < aClass269_Sub1_10057.method4946((byte) 14);
	     i_27_++) {
	    Class534_Sub12_Sub1 class534_sub12_sub1
		= aClass269_Sub1_10057.method4947(i_27_, -22408791);
	    if (class534_sub12_sub1 != null)
		class534_sub12_sub1.method18235(i);
	}
	for (int i_28_ = 0; i_28_ < aClass269_Sub1_10057.method4943((byte) 4);
	     i_28_++) {
	    Class534_Sub12_Sub1 class534_sub12_sub1
		= aClass269_Sub1_10057.method4944(i_28_, -288929727);
	    if (class534_sub12_sub1 != null)
		class534_sub12_sub1.method18235(i);
	}
	aString10046 = null;
	aString10060 = null;
	aBool10042 = true;
	return true;
    }
    
    void method5213(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	if (!$assertionsDisabled
	    && (class534_sub12_sub1.method18237(-593800396)
		!= Class264.aClass264_2845))
	    throw new AssertionError();
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class433.method6872(aFloatArray10053),
				0);
    }
    
    void method5199(int i, float[] fs, int i_29_) {
	OpenGL.glUniform4fv(i, i_29_, fs, 0);
    }
    
    void method5170(Class534_Sub12_Sub1 class534_sub12_sub1, float f) {
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1) {
	    if (aMap10045.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10045.get(Integer.valueOf(i))).floatValue()
		    != f)) {
		aMap10045.put(Integer.valueOf(i), Float.valueOf(f));
		if ((class534_sub12_sub1.method18237(-1919081685)
		     != Class264.aClass264_2926)
		    && (class534_sub12_sub1.method18237(838907310)
			!= Class264.aClass264_2874))
		    throw new IllegalArgumentException_Sub1
			      (class534_sub12_sub1, "");
		OpenGL.glUniform1f(i, f);
	    }
	}
    }
    
    void method5190(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_30_) {
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1) {
	    if (aMap10045.get(Integer.valueOf(i)) == null
		|| aMap10055.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10045.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10055.get(Integer.valueOf(i))).floatValue()
		    != f_30_)) {
		aMap10045.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10055.put(Integer.valueOf(i), Float.valueOf(f_30_));
		if (class534_sub12_sub1.method18237(1713434172)
		    != Class264.aClass264_2829)
		    throw new IllegalArgumentException_Sub1
			      (class534_sub12_sub1, "");
		OpenGL.glUniform2f(i, f, f_30_);
	    }
	}
    }
    
    void method5197(int i, float f, float f_31_, float f_32_, float f_33_) {
	OpenGL.glUniform4f(i, f, f_31_, f_32_, f_33_);
    }
    
    void method5221(Class534_Sub12_Sub1 class534_sub12_sub1, float f) {
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1) {
	    if (aMap10045.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10045.get(Integer.valueOf(i))).floatValue()
		    != f)) {
		aMap10045.put(Integer.valueOf(i), Float.valueOf(f));
		if ((class534_sub12_sub1.method18237(-1604201962)
		     != Class264.aClass264_2926)
		    && (class534_sub12_sub1.method18237(2043228396)
			!= Class264.aClass264_2874))
		    throw new IllegalArgumentException_Sub1
			      (class534_sub12_sub1, "");
		OpenGL.glUniform1f(i, f);
	    }
	}
    }
    
    void method5211(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_34_, float f_35_) {
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1) {
	    if (aMap10045.get(Integer.valueOf(i)) == null
		|| aMap10055.get(Integer.valueOf(i)) == null
		|| aMap10056.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10045.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10055.get(Integer.valueOf(i))).floatValue()
		    != f_34_)
		|| (((Float) aMap10056.get(Integer.valueOf(i))).floatValue()
		    != f_35_)) {
		aMap10045.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10055.put(Integer.valueOf(i), Float.valueOf(f_34_));
		aMap10056.put(Integer.valueOf(i), Float.valueOf(f_35_));
		if (class534_sub12_sub1.method18237(-827373355)
		    != Class264.aClass264_2815)
		    throw new IllegalArgumentException_Sub1
			      (class534_sub12_sub1, "");
		OpenGL.glUniform3f(i, f, f_34_, f_35_);
	    }
	}
    }
    
    void method5220(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	if (!$assertionsDisabled
	    && (class534_sub12_sub1.method18237(1926177319)
		!= Class264.aClass264_2838))
	    throw new AssertionError();
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1)
	    OpenGL.glUniform4fv(i, 4, class433.method6938(aFloatArray10053),
				0);
    }
    
    void method5166(int i, float f, float f_36_, float f_37_, float f_38_) {
	OpenGL.glUniform4f(i, f, f_36_, f_37_, f_38_);
    }
    
    void method5187(int i, Class433 class433) {
	OpenGL.glUniform3fv(i, 3, class433.method6870(aFloatArray10053), 0);
    }
    
    public boolean method5185() {
	if (aBool10042)
	    return true;
	aClass185_Sub1_Sub2_10044.aClass278_Sub1_11583 = null;
	anInt10050 = method15663(35633, aString10046, aString3051);
	anInt10059 = method15663(35632, aString10060, aString3050);
	if (anInt10050 == 0 || anInt10059 == 0) {
	    if (anInt10050 != 0)
		OpenGL.glDeleteShader(anInt10050);
	    if (anInt10059 != 0)
		OpenGL.glDeleteShader(anInt10059);
	    return false;
	}
	anInt10047 = OpenGL.glCreateProgram();
	if (anInt10050 != 0)
	    OpenGL.glAttachShader(anInt10047, anInt10050);
	if (anInt10059 != 0)
	    OpenGL.glAttachShader(anInt10047, anInt10059);
	OpenGL.glLinkProgram(anInt10047);
	OpenGL.glGetProgramiv(anInt10047, 35714, anIntArray10054, 0);
	if (anIntArray10054[0] == 0) {
	    if (anInt10050 != 0) {
		OpenGL.glDetachShader(anInt10047, anInt10050);
		OpenGL.glDeleteShader(anInt10050);
	    }
	    if (anInt10059 != 0) {
		OpenGL.glDetachShader(anInt10047, anInt10059);
		OpenGL.glDeleteShader(anInt10059);
	    }
	    OpenGL.glDeleteProgram(anInt10047);
	    return false;
	}
	OpenGL.glUseProgram(anInt10047);
	int i = -1;
	for (int i_39_ = 0; i_39_ < aClass269_Sub1_10057.method4984((byte) 90);
	     i_39_++) {
	    if (aClass269_Sub1_10057.method4916(i_39_, 56453164) == this) {
		i = i_39_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_40_ = 0; i_40_ < aClass269_Sub1_10057.method4946((byte) 14);
	     i_40_++) {
	    Class534_Sub12_Sub1 class534_sub12_sub1
		= aClass269_Sub1_10057.method4947(i_40_, 1963485242);
	    if (class534_sub12_sub1 != null)
		class534_sub12_sub1.method18235(i);
	}
	for (int i_41_ = 0; i_41_ < aClass269_Sub1_10057.method4943((byte) 4);
	     i_41_++) {
	    Class534_Sub12_Sub1 class534_sub12_sub1
		= aClass269_Sub1_10057.method4944(i_41_, 435666735);
	    if (class534_sub12_sub1 != null)
		class534_sub12_sub1.method18235(i);
	}
	aString10046 = null;
	aString10060 = null;
	aBool10042 = true;
	return true;
    }
    
    void method5198(int i, float f, float f_42_, float f_43_, float f_44_) {
	OpenGL.glUniform4f(i, f, f_42_, f_43_, f_44_);
    }
    
    void method5184(int i, Class433 class433) {
	OpenGL.glUniform4fv(i, 4, class433.method6938(aFloatArray10053), 0);
    }
    
    void method5200(int i, float[] fs, int i_45_) {
	OpenGL.glUniform4fv(i, i_45_, fs, 0);
    }
    
    void method5216(int i, float[] fs, int i_46_) {
	OpenGL.glUniform4fv(i, i_46_, fs, 0);
    }
    
    void method5219(Class534_Sub12_Sub1 class534_sub12_sub1, int i,
		    Interface43 interface43) {
	int i_47_
	    = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i_47_ != -1) {
	    if (interface43 == null)
		interface43 = aClass185_Sub1_Sub2_10044.anInterface38_9204;
	    if (i < aClass185_Sub1_Sub2_10044.anInt9269) {
		aClass185_Sub1_Sub2_10044.method14668(i);
		aClass185_Sub1_Sub2_10044.method14669(interface43);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture(((Class486) interface43).anInt5303,
				     ((Class486) interface43).anInt5296);
	    }
	    if (aMap10058.get(Integer.valueOf(i_47_)) == null
		|| ((Integer) aMap10058.get(Integer.valueOf(i_47_)))
		       .intValue() != i) {
		aMap10058.put(Integer.valueOf(i_47_), Integer.valueOf(i));
		OpenGL.glUniform1i(i_47_, i);
	    }
	}
    }
    
    void method5188(Class534_Sub12_Sub1 class534_sub12_sub1, int i,
		    Interface43 interface43) {
	int i_48_
	    = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i_48_ != -1) {
	    if (interface43 == null)
		interface43 = aClass185_Sub1_Sub2_10044.anInterface38_9204;
	    if (i < aClass185_Sub1_Sub2_10044.anInt9269) {
		aClass185_Sub1_Sub2_10044.method14668(i);
		aClass185_Sub1_Sub2_10044.method14669(interface43);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture(((Class486) interface43).anInt5303,
				     ((Class486) interface43).anInt5296);
	    }
	    if (aMap10058.get(Integer.valueOf(i_48_)) == null
		|| ((Integer) aMap10058.get(Integer.valueOf(i_48_)))
		       .intValue() != i) {
		aMap10058.put(Integer.valueOf(i_48_), Integer.valueOf(i));
		OpenGL.glUniform1i(i_48_, i);
	    }
	}
    }
    
    void method5204(int i, Class433 class433) {
	OpenGL.glUniform3fv(i, 3, class433.method6870(aFloatArray10053), 0);
    }
    
    void method5203(int i, Class433 class433) {
	OpenGL.glUniform2fv(i, 4, class433.method6872(aFloatArray10053), 0);
    }
    
    Class278_Sub1(Class185_Sub1_Sub2 class185_sub1_sub2,
		  Class269_Sub1 class269_sub1, Class277 class277) {
	this(class185_sub1_sub2, class277);
	aClass269_Sub1_10057 = class269_sub1;
	aClass185_Sub1_Sub2_10044 = class185_sub1_sub2;
    }
    
    void method5207(int i, Class433 class433) {
	OpenGL.glUniform4fv(i, 4, class433.method6938(aFloatArray10053), 0);
    }
    
    void method5208(int i, int i_49_, Interface43 interface43) {
	aClass185_Sub1_Sub2_10044.method14668(i_49_);
	aClass185_Sub1_Sub2_10044.method14669(interface43);
	OpenGL.glUniform1i(i, i_49_);
    }
    
    void method5173(int i, int i_50_, Interface43 interface43) {
	aClass185_Sub1_Sub2_10044.method14668(i_50_);
	aClass185_Sub1_Sub2_10044.method14669(interface43);
	OpenGL.glUniform1i(i, i_50_);
    }
    
    void method5195(Class534_Sub12_Sub1 class534_sub12_sub1, float[] fs,
		    int i) {
	int i_51_
	    = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i_51_ != -1)
	    OpenGL.glUniform4fv(i_51_, i, fs, 0);
    }
    
    void method5189(Class534_Sub12_Sub1 class534_sub12_sub1, float f) {
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1) {
	    if (aMap10045.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10045.get(Integer.valueOf(i))).floatValue()
		    != f)) {
		aMap10045.put(Integer.valueOf(i), Float.valueOf(f));
		if ((class534_sub12_sub1.method18237(1222020341)
		     != Class264.aClass264_2926)
		    && (class534_sub12_sub1.method18237(-1413949236)
			!= Class264.aClass264_2874))
		    throw new IllegalArgumentException_Sub1
			      (class534_sub12_sub1, "");
		OpenGL.glUniform1f(i, f);
	    }
	}
    }
    
    void method5214(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	if (!$assertionsDisabled
	    && (class534_sub12_sub1.method18237(-987643985)
		!= Class264.aClass264_2845))
	    throw new AssertionError();
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class433.method6872(aFloatArray10053),
				0);
    }
    
    void method5193(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	if (!$assertionsDisabled && (class534_sub12_sub1.method18237(962438247)
				     != Class264.aClass264_2838))
	    throw new AssertionError();
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1)
	    OpenGL.glUniform4fv(i, 4, class433.method6938(aFloatArray10053),
				0);
    }
    
    void method5206(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	if (!$assertionsDisabled
	    && (class534_sub12_sub1.method18237(1109682852)
		!= Class264.aClass264_2845))
	    throw new AssertionError();
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class433.method6872(aFloatArray10053),
				0);
    }
    
    void method5215(Class534_Sub12_Sub1 class534_sub12_sub1, float[] fs,
		    int i) {
	int i_52_
	    = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i_52_ != -1)
	    OpenGL.glUniform4fv(i_52_, i, fs, 0);
    }
    
    void method5217(Class534_Sub12_Sub1 class534_sub12_sub1, float[] fs,
		    int i) {
	int i_53_
	    = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i_53_ != -1)
	    OpenGL.glUniform4fv(i_53_, i, fs, 0);
    }
    
    public boolean method5182() {
	if (aBool10042)
	    return true;
	aClass185_Sub1_Sub2_10044.aClass278_Sub1_11583 = null;
	anInt10050 = method15663(35633, aString10046, aString3051);
	anInt10059 = method15663(35632, aString10060, aString3050);
	if (anInt10050 == 0 || anInt10059 == 0) {
	    if (anInt10050 != 0)
		OpenGL.glDeleteShader(anInt10050);
	    if (anInt10059 != 0)
		OpenGL.glDeleteShader(anInt10059);
	    return false;
	}
	anInt10047 = OpenGL.glCreateProgram();
	if (anInt10050 != 0)
	    OpenGL.glAttachShader(anInt10047, anInt10050);
	if (anInt10059 != 0)
	    OpenGL.glAttachShader(anInt10047, anInt10059);
	OpenGL.glLinkProgram(anInt10047);
	OpenGL.glGetProgramiv(anInt10047, 35714, anIntArray10054, 0);
	if (anIntArray10054[0] == 0) {
	    if (anInt10050 != 0) {
		OpenGL.glDetachShader(anInt10047, anInt10050);
		OpenGL.glDeleteShader(anInt10050);
	    }
	    if (anInt10059 != 0) {
		OpenGL.glDetachShader(anInt10047, anInt10059);
		OpenGL.glDeleteShader(anInt10059);
	    }
	    OpenGL.glDeleteProgram(anInt10047);
	    return false;
	}
	OpenGL.glUseProgram(anInt10047);
	int i = -1;
	for (int i_54_ = 0; i_54_ < aClass269_Sub1_10057.method4984((byte) 54);
	     i_54_++) {
	    if (aClass269_Sub1_10057.method4916(i_54_, 56453164) == this) {
		i = i_54_;
		break;
	    }
	}
	if (i == -1)
	    return false;
	for (int i_55_ = 0; i_55_ < aClass269_Sub1_10057.method4946((byte) 14);
	     i_55_++) {
	    Class534_Sub12_Sub1 class534_sub12_sub1
		= aClass269_Sub1_10057.method4947(i_55_, -265967233);
	    if (class534_sub12_sub1 != null)
		class534_sub12_sub1.method18235(i);
	}
	for (int i_56_ = 0; i_56_ < aClass269_Sub1_10057.method4943((byte) 4);
	     i_56_++) {
	    Class534_Sub12_Sub1 class534_sub12_sub1
		= aClass269_Sub1_10057.method4944(i_56_, -1339538276);
	    if (class534_sub12_sub1 != null)
		class534_sub12_sub1.method18235(i);
	}
	aString10046 = null;
	aString10060 = null;
	aBool10042 = true;
	return true;
    }
    
    void method5192(Class534_Sub12_Sub1 class534_sub12_sub1, float f,
		    float f_57_, float f_58_, float f_59_) {
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1) {
	    if (aMap10045.get(Integer.valueOf(i)) == null
		|| aMap10055.get(Integer.valueOf(i)) == null
		|| aMap10056.get(Integer.valueOf(i)) == null
		|| aMap10048.get(Integer.valueOf(i)) == null
		|| (((Float) aMap10045.get(Integer.valueOf(i))).floatValue()
		    != f)
		|| (((Float) aMap10055.get(Integer.valueOf(i))).floatValue()
		    != f_57_)
		|| (((Float) aMap10056.get(Integer.valueOf(i))).floatValue()
		    != f_58_)
		|| (((Float) aMap10048.get(Integer.valueOf(i))).floatValue()
		    != f_59_)) {
		aMap10045.put(Integer.valueOf(i), Float.valueOf(f));
		aMap10055.put(Integer.valueOf(i), Float.valueOf(f_57_));
		aMap10056.put(Integer.valueOf(i), Float.valueOf(f_58_));
		aMap10048.put(Integer.valueOf(i), Float.valueOf(f_59_));
		if (class534_sub12_sub1.method18237(-2105966177)
		    != Class264.aClass264_2831)
		    throw new IllegalArgumentException_Sub1
			      (class534_sub12_sub1, "");
		OpenGL.glUniform4f(i, f, f_57_, f_58_, f_59_);
	    }
	}
    }
    
    void method5218(Class534_Sub12_Sub1 class534_sub12_sub1, int i,
		    Interface43 interface43) {
	int i_60_
	    = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i_60_ != -1) {
	    if (interface43 == null)
		interface43 = aClass185_Sub1_Sub2_10044.anInterface38_9204;
	    if (i < aClass185_Sub1_Sub2_10044.anInt9269) {
		aClass185_Sub1_Sub2_10044.method14668(i);
		aClass185_Sub1_Sub2_10044.method14669(interface43);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture(((Class486) interface43).anInt5303,
				     ((Class486) interface43).anInt5296);
	    }
	    if (aMap10058.get(Integer.valueOf(i_60_)) == null
		|| ((Integer) aMap10058.get(Integer.valueOf(i_60_)))
		       .intValue() != i) {
		aMap10058.put(Integer.valueOf(i_60_), Integer.valueOf(i));
		OpenGL.glUniform1i(i_60_, i);
	    }
	}
    }
    
    void method5174(Class534_Sub12_Sub1 class534_sub12_sub1,
		    Class433 class433) {
	if (!$assertionsDisabled && (class534_sub12_sub1.method18237(413203258)
				     != Class264.aClass264_2845))
	    throw new AssertionError();
	int i = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i != -1)
	    OpenGL.glUniform2fv(i, 4, class433.method6872(aFloatArray10053),
				0);
    }
    
    void method5176(Class534_Sub12_Sub1 class534_sub12_sub1, int i,
		    Interface43 interface43) {
	int i_61_
	    = ((Class534_Sub12_Sub1_Sub1) class534_sub12_sub1).method18731();
	if (i_61_ != -1) {
	    if (interface43 == null)
		interface43 = aClass185_Sub1_Sub2_10044.anInterface38_9204;
	    if (i < aClass185_Sub1_Sub2_10044.anInt9269) {
		aClass185_Sub1_Sub2_10044.method14668(i);
		aClass185_Sub1_Sub2_10044.method14669(interface43);
	    } else {
		OpenGL.glActiveTexture(33984 + i);
		OpenGL.glBindTexture(((Class486) interface43).anInt5303,
				     ((Class486) interface43).anInt5296);
	    }
	    if (aMap10058.get(Integer.valueOf(i_61_)) == null
		|| ((Integer) aMap10058.get(Integer.valueOf(i_61_)))
		       .intValue() != i) {
		aMap10058.put(Integer.valueOf(i_61_), Integer.valueOf(i));
		OpenGL.glUniform1i(i_61_, i);
	    }
	}
    }
    
    void method5168(int i, float f, float f_62_, float f_63_) {
	OpenGL.glUniform3f(i, f, f_62_, f_63_);
    }
    
    void method5205(int i, Class433 class433) {
	OpenGL.glUniform3fv(i, 3, class433.method6870(aFloatArray10053), 0);
    }
    
    void method5223(int i, float f, float f_64_, float f_65_) {
	OpenGL.glUniform3f(i, f, f_64_, f_65_);
    }
    
    int method15667(int i, String string, String string_66_) {
	if (string == null)
	    return 0;
	int i_67_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_67_, string);
	OpenGL.glCompileShader(i_67_);
	OpenGL.glGetShaderiv(i_67_, 35713, anIntArray10054, 0);
	if (anIntArray10054[0] == 0) {
	    OpenGL.glDeleteShader(i_67_);
	    i_67_ = 0;
	}
	return i_67_;
    }
    
    int method15668(int i, String string, String string_68_) {
	if (string == null)
	    return 0;
	int i_69_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_69_, string);
	OpenGL.glCompileShader(i_69_);
	OpenGL.glGetShaderiv(i_69_, 35713, anIntArray10054, 0);
	if (anIntArray10054[0] == 0) {
	    OpenGL.glDeleteShader(i_69_);
	    i_69_ = 0;
	}
	return i_69_;
    }
    
    int method15669(int i, String string, String string_70_) {
	if (string == null)
	    return 0;
	int i_71_ = OpenGL.glCreateShader(i);
	OpenGL.glShaderSource(i_71_, string);
	OpenGL.glCompileShader(i_71_);
	OpenGL.glGetShaderiv(i_71_, 35713, anIntArray10054, 0);
	if (anIntArray10054[0] == 0) {
	    OpenGL.glDeleteShader(i_71_);
	    i_71_ = 0;
	}
	return i_71_;
    }
}
