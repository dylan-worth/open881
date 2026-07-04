/* Class136_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class136_Sub1 extends Class136
{
    static final String aString8904
	= "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
    boolean aBool8905;
    static final String aString8906
	= "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
    boolean aBool8907 = false;
    Class124 aClass124_8908;
    Class122 aClass122_8909;
    
    void method2343(Class141 class141, int i) {
	if (!aBool8907) {
	    aClass185_Sub3_1600.method15231(class141);
	    aClass185_Sub3_1600.method15214(i);
	}
    }
    
    boolean method2334() {
	return aBool8905;
    }
    
    void method2328(boolean bool) {
	Class141_Sub1 class141_sub1 = aClass185_Sub3_1600.method15314();
	if (aBool8905 && class141_sub1 != null) {
	    float f = 1.0F + (1.0F - Math.abs(aClass185_Sub3_1600
					      .aFloatArray9640[1])) * 2.0F;
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(class141_sub1);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600
		.method15231(aClass124_8908.aClass141_Sub4_1498);
	    int i = aClass122_8909.anInt1485;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"),
			       -aClass185_Sub3_1600.aFloatArray9640[0],
			       -aClass185_Sub3_1600.aFloatArray9640[1],
			       -aClass185_Sub3_1600.aFloatArray9640[2]);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"),
			       aClass185_Sub3_1600.aFloat9643 * f,
			       aClass185_Sub3_1600.aFloat9644 * f,
			       aClass185_Sub3_1600.aFloat9645 * f, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       64.0F + Math.abs(aClass185_Sub3_1600
						.aFloatArray9640[1]) * 928.0F);
	    aBool8907 = true;
	}
    }
    
    Class136_Sub1(Class185_Sub3 class185_sub3, Class124 class124) {
	super(class185_sub3);
	aBool8905 = false;
	aClass124_8908 = class124;
	if (aClass124_8908.aClass141_Sub4_1498 != null
	    && aClass185_Sub3_1600.aBool9700
	    && aClass185_Sub3_1600.aBool9680) {
	    Class140 class140
		= (Class140.method2357
		   (aClass185_Sub3_1600, 35633,
		    "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
	    Class140 class140_0_
		= (Class140.method2357
		   (aClass185_Sub3_1600, 35632,
		    "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
	    aClass122_8909
		= Class122.method2175(aClass185_Sub3_1600,
				      new Class140[] { class140,
						       class140_0_ });
	    aBool8905 = aClass122_8909 != null;
	}
    }
    
    void method2327() {
	if (aBool8907) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600.method15231(null);
	    OpenGL.glUseProgram(0);
	    aBool8907 = false;
	}
    }
    
    void method2331(int i, int i_1_) {
	if (aBool8907) {
	    int i_2_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_3_ = i_1_ & 0xffff;
	    float f_4_ = (float) (i_1_ >> 16 & 0x3) / 8.0F;
	    float f_5_ = (float) (i_1_ >> 19 & 0xf) / 16.0F;
	    float f_6_ = (float) (i_1_ >> 23 & 0xf) / 16.0F;
	    int i_7_ = i_1_ >> 27 & 0xf;
	    int i_8_ = aClass122_8909.anInt1485;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "time"),
			       (float) (i_2_ * aClass185_Sub3_1600.anInt9696
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_,
							   "breakWaterDepth"),
			       (float) i_3_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_,
							   "breakWaterOffset"),
			       f_4_);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_8_,
							   "waveIntensity"),
			       f_6_, f_5_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_8_,
							   "waveExponent"),
			       (float) i_7_);
	}
    }
    
    void method2330(int i, int i_9_) {
	if (aBool8907) {
	    int i_10_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_11_ = i_9_ & 0xffff;
	    float f_12_ = (float) (i_9_ >> 16 & 0x3) / 8.0F;
	    float f_13_ = (float) (i_9_ >> 19 & 0xf) / 16.0F;
	    float f_14_ = (float) (i_9_ >> 23 & 0xf) / 16.0F;
	    int i_15_ = i_9_ >> 27 & 0xf;
	    int i_16_ = aClass122_8909.anInt1485;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "time"),
			       (float) (i_10_ * aClass185_Sub3_1600.anInt9696
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_,
							   "breakWaterDepth"),
			       (float) i_11_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_,
							   "breakWaterOffset"),
			       f_12_);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_16_,
							   "waveIntensity"),
			       f_14_, f_13_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_,
							   "waveExponent"),
			       (float) i_15_);
	}
    }
    
    boolean method2347() {
	return aBool8905;
    }
    
    boolean method2333() {
	return aBool8905;
    }
    
    void method2341() {
	if (aBool8907) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600.method15231(null);
	    OpenGL.glUseProgram(0);
	    aBool8907 = false;
	}
    }
    
    void method2335(boolean bool) {
	Class141_Sub1 class141_sub1 = aClass185_Sub3_1600.method15314();
	if (aBool8905 && class141_sub1 != null) {
	    float f = 1.0F + (1.0F - Math.abs(aClass185_Sub3_1600
					      .aFloatArray9640[1])) * 2.0F;
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(class141_sub1);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600
		.method15231(aClass124_8908.aClass141_Sub4_1498);
	    int i = aClass122_8909.anInt1485;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"),
			       -aClass185_Sub3_1600.aFloatArray9640[0],
			       -aClass185_Sub3_1600.aFloatArray9640[1],
			       -aClass185_Sub3_1600.aFloatArray9640[2]);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"),
			       aClass185_Sub3_1600.aFloat9643 * f,
			       aClass185_Sub3_1600.aFloat9644 * f,
			       aClass185_Sub3_1600.aFloat9645 * f, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       64.0F + Math.abs(aClass185_Sub3_1600
						.aFloatArray9640[1]) * 928.0F);
	    aBool8907 = true;
	}
    }
    
    void method2344(boolean bool) {
	Class141_Sub1 class141_sub1 = aClass185_Sub3_1600.method15314();
	if (aBool8905 && class141_sub1 != null) {
	    float f = 1.0F + (1.0F - Math.abs(aClass185_Sub3_1600
					      .aFloatArray9640[1])) * 2.0F;
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(class141_sub1);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600
		.method15231(aClass124_8908.aClass141_Sub4_1498);
	    int i = aClass122_8909.anInt1485;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"),
			       -aClass185_Sub3_1600.aFloatArray9640[0],
			       -aClass185_Sub3_1600.aFloatArray9640[1],
			       -aClass185_Sub3_1600.aFloatArray9640[2]);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"),
			       aClass185_Sub3_1600.aFloat9643 * f,
			       aClass185_Sub3_1600.aFloat9644 * f,
			       aClass185_Sub3_1600.aFloat9645 * f, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       64.0F + Math.abs(aClass185_Sub3_1600
						.aFloatArray9640[1]) * 928.0F);
	    aBool8907 = true;
	}
    }
    
    void method2337(boolean bool) {
	Class141_Sub1 class141_sub1 = aClass185_Sub3_1600.method15314();
	if (aBool8905 && class141_sub1 != null) {
	    float f = 1.0F + (1.0F - Math.abs(aClass185_Sub3_1600
					      .aFloatArray9640[1])) * 2.0F;
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(class141_sub1);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600
		.method15231(aClass124_8908.aClass141_Sub4_1498);
	    int i = aClass122_8909.anInt1485;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"),
			       -aClass185_Sub3_1600.aFloatArray9640[0],
			       -aClass185_Sub3_1600.aFloatArray9640[1],
			       -aClass185_Sub3_1600.aFloatArray9640[2]);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"),
			       aClass185_Sub3_1600.aFloat9643 * f,
			       aClass185_Sub3_1600.aFloat9644 * f,
			       aClass185_Sub3_1600.aFloat9645 * f, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       64.0F + Math.abs(aClass185_Sub3_1600
						.aFloatArray9640[1]) * 928.0F);
	    aBool8907 = true;
	}
    }
    
    void method2338(boolean bool) {
	Class141_Sub1 class141_sub1 = aClass185_Sub3_1600.method15314();
	if (aBool8905 && class141_sub1 != null) {
	    float f = 1.0F + (1.0F - Math.abs(aClass185_Sub3_1600
					      .aFloatArray9640[1])) * 2.0F;
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(class141_sub1);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600
		.method15231(aClass124_8908.aClass141_Sub4_1498);
	    int i = aClass122_8909.anInt1485;
	    OpenGL.glUseProgram(i);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"),
			       0);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"),
			       1);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"),
			       -aClass185_Sub3_1600.aFloatArray9640[0],
			       -aClass185_Sub3_1600.aFloatArray9640[1],
			       -aClass185_Sub3_1600.aFloatArray9640[2]);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"),
			       aClass185_Sub3_1600.aFloat9643 * f,
			       aClass185_Sub3_1600.aFloat9644 * f,
			       aClass185_Sub3_1600.aFloat9645 * f, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       64.0F + Math.abs(aClass185_Sub3_1600
						.aFloatArray9640[1]) * 928.0F);
	    aBool8907 = true;
	}
    }
    
    void method2339(boolean bool) {
	/* empty */
    }
    
    void method2340(boolean bool) {
	/* empty */
    }
    
    void method2336(boolean bool) {
	/* empty */
    }
    
    void method2332(boolean bool) {
	/* empty */
    }
    
    void method2326() {
	if (aBool8907) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600.method15231(null);
	    OpenGL.glUseProgram(0);
	    aBool8907 = false;
	}
    }
    
    boolean method2342() {
	return aBool8905;
    }
    
    void method2345() {
	if (aBool8907) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600.method15231(null);
	    OpenGL.glUseProgram(0);
	    aBool8907 = false;
	}
    }
    
    void method2346(int i, int i_17_) {
	if (aBool8907) {
	    int i_18_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_19_ = i_17_ & 0xffff;
	    float f_20_ = (float) (i_17_ >> 16 & 0x3) / 8.0F;
	    float f_21_ = (float) (i_17_ >> 19 & 0xf) / 16.0F;
	    float f_22_ = (float) (i_17_ >> 23 & 0xf) / 16.0F;
	    int i_23_ = i_17_ >> 27 & 0xf;
	    int i_24_ = aClass122_8909.anInt1485;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "time"),
			       (float) (i_18_ * aClass185_Sub3_1600.anInt9696
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_,
							   "breakWaterDepth"),
			       (float) i_19_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_,
							   "breakWaterOffset"),
			       f_20_);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_24_,
							   "waveIntensity"),
			       f_22_, f_21_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_,
							   "waveExponent"),
			       (float) i_23_);
	}
    }
    
    void method2329(boolean bool) {
	/* empty */
    }
    
    void method2348(Class141 class141, int i) {
	if (!aBool8907) {
	    aClass185_Sub3_1600.method15231(class141);
	    aClass185_Sub3_1600.method15214(i);
	}
    }
}
