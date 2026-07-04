/* Class534_Sub9_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class534_Sub9_Sub3 extends Class534_Sub9
{
    Class122 aClass122_11639;
    static float aFloat11640;
    static float aFloat11641;
    static float aFloat11642 = 1.0F;
    static float aFloat11643;
    static final String aString11644
	= "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";
    static float aFloat11645 = 0.0F;
    
    void method16090() {
	aClass122_11639 = null;
    }
    
    boolean method18111() {
	return aClass185_Sub3_10427.aBool9680;
    }
    
    boolean method16070() {
	return aClass122_11639 != null;
    }
    
    boolean method16069() {
	if (aClass185_Sub3_10427.aBool9680) {
	    aClass122_11639
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
	    return aClass122_11639 != null;
	}
	return false;
    }
    
    void method16105(int i, Class141_Sub2 class141_sub2,
		     Class141_Sub2 class141_sub2_0_, int i_1_, int i_2_) {
	int i_3_ = aClass122_11639.anInt1485;
	OpenGL.glUseProgram(i_3_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_3_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_3_, "paramsGamma"),
			   aFloat11642);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_3_, "paramsRanges"),
			   aFloat11645, aFloat11641, aFloat11640, aFloat11643);
	aClass185_Sub3_10427.method15230(0);
	aClass185_Sub3_10427.method15231(class141_sub2);
    }
    
    void method16104() {
	aClass122_11639 = null;
    }
    
    void method16112(int i, Class141_Sub2 class141_sub2,
		     Class141_Sub2 class141_sub2_4_, int i_5_, int i_6_) {
	int i_7_ = aClass122_11639.anInt1485;
	OpenGL.glUseProgram(i_7_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_7_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "paramsGamma"),
			   aFloat11642);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_7_, "paramsRanges"),
			   aFloat11645, aFloat11641, aFloat11640, aFloat11643);
	aClass185_Sub3_10427.method15230(0);
	aClass185_Sub3_10427.method15231(class141_sub2);
    }
    
    boolean method16083() {
	return aClass122_11639 != null;
    }
    
    Class173 method16079() {
	return Class173.aClass173_1830;
    }
    
    void method16072(int i, int i_8_) {
	/* empty */
    }
    
    boolean method16081() {
	return (aFloat11642 == 1.0F && aFloat11645 == 0.0F
		&& aFloat11641 == 1.0F && aFloat11640 == 0.0F
		&& aFloat11643 == 1.0F);
    }
    
    static {
	aFloat11641 = 1.0F;
	aFloat11640 = 0.0F;
	aFloat11643 = 1.0F;
    }
    
    boolean method16082() {
	return aClass122_11639 != null;
    }
    
    boolean method16110() {
	return (aFloat11642 == 1.0F && aFloat11645 == 0.0F
		&& aFloat11641 == 1.0F && aFloat11640 == 0.0F
		&& aFloat11643 == 1.0F);
    }
    
    boolean method16084() {
	return aClass122_11639 != null;
    }
    
    boolean method16071() {
	return aClass122_11639 != null;
    }
    
    boolean method16085() {
	return aClass122_11639 != null;
    }
    
    boolean method16086() {
	if (aClass185_Sub3_10427.aBool9680) {
	    aClass122_11639
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
	    return aClass122_11639 != null;
	}
	return false;
    }
    
    int method16099() {
	return 1;
    }
    
    boolean method16088() {
	if (aClass185_Sub3_10427.aBool9680) {
	    aClass122_11639
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
	    return aClass122_11639 != null;
	}
	return false;
    }
    
    void method16089() {
	aClass122_11639 = null;
    }
    
    boolean method16113() {
	if (aClass185_Sub3_10427.aBool9680) {
	    aClass122_11639
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
	    return aClass122_11639 != null;
	}
	return false;
    }
    
    void method16091(int i, int i_9_) {
	/* empty */
    }
    
    int method16080() {
	return 1;
    }
    
    void method16093(int i, int i_10_) {
	/* empty */
    }
    
    void method16094(int i, int i_11_) {
	/* empty */
    }
    
    void method16095(int i) {
	OpenGL.glUseProgram(0);
	aClass185_Sub3_10427.method15230(0);
	aClass185_Sub3_10427.method15231(null);
    }
    
    int method16097() {
	return 1;
    }
    
    Class173 method16106() {
	return Class173.aClass173_1830;
    }
    
    void method16098(int i, int i_12_) {
	/* empty */
    }
    
    int method16100() {
	return 1;
    }
    
    boolean method18112() {
	return aClass185_Sub3_10427.aBool9680;
    }
    
    void method16075(int i, Class141_Sub2 class141_sub2,
		     Class141_Sub2 class141_sub2_13_, int i_14_, int i_15_) {
	int i_16_ = aClass122_11639.anInt1485;
	OpenGL.glUseProgram(i_16_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_16_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "paramsGamma"),
			   aFloat11642);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_16_, "paramsRanges"),
			   aFloat11645, aFloat11641, aFloat11640, aFloat11643);
	aClass185_Sub3_10427.method15230(0);
	aClass185_Sub3_10427.method15231(class141_sub2);
    }
    
    Class534_Sub9_Sub3(Class185_Sub3 class185_sub3) {
	super(class185_sub3);
    }
    
    Class173 method16107() {
	return Class173.aClass173_1830;
    }
    
    boolean method16074() {
	return (aFloat11642 == 1.0F && aFloat11645 == 0.0F
		&& aFloat11641 == 1.0F && aFloat11640 == 0.0F
		&& aFloat11643 == 1.0F);
    }
    
    Class173 method16096() {
	return Class173.aClass173_1830;
    }
    
    boolean method16111() {
	return (aFloat11642 == 1.0F && aFloat11645 == 0.0F
		&& aFloat11641 == 1.0F && aFloat11640 == 0.0F
		&& aFloat11643 == 1.0F);
    }
    
    void method16073(int i) {
	OpenGL.glUseProgram(0);
	aClass185_Sub3_10427.method15230(0);
	aClass185_Sub3_10427.method15231(null);
    }
    
    boolean method18113() {
	return aClass185_Sub3_10427.aBool9680;
    }
    
    boolean method18114() {
	return aClass185_Sub3_10427.aBool9680;
    }
    
    Class173 method16092() {
	return Class173.aClass173_1830;
    }
    
    int method16077() {
	return 1;
    }
    
    void method16114(int i, Class141_Sub2 class141_sub2,
		     Class141_Sub2 class141_sub2_17_, int i_18_, int i_19_) {
	int i_20_ = aClass122_11639.anInt1485;
	OpenGL.glUseProgram(i_20_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_20_, "sceneTex"), 0);
	OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_20_, "paramsGamma"),
			   aFloat11642);
	OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_20_, "paramsRanges"),
			   aFloat11645, aFloat11641, aFloat11640, aFloat11643);
	aClass185_Sub3_10427.method15230(0);
	aClass185_Sub3_10427.method15231(class141_sub2);
    }
}
