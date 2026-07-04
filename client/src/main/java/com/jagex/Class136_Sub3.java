/* Class136_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class136_Sub3 extends Class136
{
    boolean aBool8930;
    static final String aString8931
	= "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
    Class122 aClass122_8932;
    boolean aBool8933 = false;
    static final String aString8934
	= "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
    Class124 aClass124_8935;
    
    void method2346(int i, int i_0_) {
	if (aBool8933) {
	    int i_1_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_2_ = i_0_ & 0xffff;
	    float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
	    int i_4_ = aClass122_8932.anInt1485;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "time"),
			       (float) (i_1_ * aClass185_Sub3_1600.anInt9696
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_,
							   "breakWaterDepth"),
			       (float) i_2_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_,
							   "breakWaterOffset"),
			       f_3_);
	}
    }
    
    boolean method2347() {
	return aBool8930;
    }
    
    void method2343(Class141 class141, int i) {
	if (!aBool8933) {
	    aClass185_Sub3_1600.method15231(class141);
	    aClass185_Sub3_1600.method15214(i);
	}
    }
    
    void method2329(boolean bool) {
	/* empty */
    }
    
    void method2337(boolean bool) {
	Class141_Sub1 class141_sub1 = aClass185_Sub3_1600.method15314();
	if (aBool8930 && class141_sub1 != null) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(class141_sub1);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600
		.method15231(aClass124_8935.aClass141_Sub4_1498);
	    int i = aClass122_8932.anInt1485;
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
			       aClass185_Sub3_1600.aFloat9643,
			       aClass185_Sub3_1600.aFloat9644,
			       aClass185_Sub3_1600.aFloat9645, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(aClass185_Sub3_1600
						.aFloatArray9640[1]) * 928.0F);
	    aBool8933 = true;
	}
    }
    
    void method2331(int i, int i_5_) {
	if (aBool8933) {
	    int i_6_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_7_ = i_5_ & 0xffff;
	    float f_8_ = (float) (i_5_ >> 16 & 0x3) / 8.0F;
	    int i_9_ = aClass122_8932.anInt1485;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "time"),
			       (float) (i_6_ * aClass185_Sub3_1600.anInt9696
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_,
							   "breakWaterDepth"),
			       (float) i_7_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_9_,
							   "breakWaterOffset"),
			       f_8_);
	}
    }
    
    Class136_Sub3(Class185_Sub3 class185_sub3, Class124 class124) {
	super(class185_sub3);
	aBool8930 = false;
	aClass124_8935 = class124;
	if (aClass124_8935.aClass141_Sub4_1498 != null
	    && aClass185_Sub3_1600.aBool9700
	    && aClass185_Sub3_1600.aBool9680) {
	    Class140 class140
		= (Class140.method2357
		   (aClass185_Sub3_1600, 35633,
		    "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
	    Class140 class140_10_
		= (Class140.method2357
		   (aClass185_Sub3_1600, 35632,
		    "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
	    aClass122_8932
		= Class122.method2175(aClass185_Sub3_1600,
				      new Class140[] { class140,
						       class140_10_ });
	    aBool8930 = aClass122_8932 != null;
	}
    }
    
    boolean method2334() {
	return aBool8930;
    }
    
    void method2328(boolean bool) {
	Class141_Sub1 class141_sub1 = aClass185_Sub3_1600.method15314();
	if (aBool8930 && class141_sub1 != null) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(class141_sub1);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600
		.method15231(aClass124_8935.aClass141_Sub4_1498);
	    int i = aClass122_8932.anInt1485;
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
			       aClass185_Sub3_1600.aFloat9643,
			       aClass185_Sub3_1600.aFloat9644,
			       aClass185_Sub3_1600.aFloat9645, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(aClass185_Sub3_1600
						.aFloatArray9640[1]) * 928.0F);
	    aBool8933 = true;
	}
    }
    
    void method2341() {
	if (aBool8933) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600.method15231(null);
	    OpenGL.glUseProgram(0);
	    aBool8933 = false;
	}
    }
    
    void method2335(boolean bool) {
	Class141_Sub1 class141_sub1 = aClass185_Sub3_1600.method15314();
	if (aBool8930 && class141_sub1 != null) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(class141_sub1);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600
		.method15231(aClass124_8935.aClass141_Sub4_1498);
	    int i = aClass122_8932.anInt1485;
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
			       aClass185_Sub3_1600.aFloat9643,
			       aClass185_Sub3_1600.aFloat9644,
			       aClass185_Sub3_1600.aFloat9645, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(aClass185_Sub3_1600
						.aFloatArray9640[1]) * 928.0F);
	    aBool8933 = true;
	}
    }
    
    void method2344(boolean bool) {
	Class141_Sub1 class141_sub1 = aClass185_Sub3_1600.method15314();
	if (aBool8930 && class141_sub1 != null) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(class141_sub1);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600
		.method15231(aClass124_8935.aClass141_Sub4_1498);
	    int i = aClass122_8932.anInt1485;
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
			       aClass185_Sub3_1600.aFloat9643,
			       aClass185_Sub3_1600.aFloat9644,
			       aClass185_Sub3_1600.aFloat9645, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(aClass185_Sub3_1600
						.aFloatArray9640[1]) * 928.0F);
	    aBool8933 = true;
	}
    }
    
    boolean method2333() {
	return aBool8930;
    }
    
    void method2338(boolean bool) {
	Class141_Sub1 class141_sub1 = aClass185_Sub3_1600.method15314();
	if (aBool8930 && class141_sub1 != null) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(class141_sub1);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600
		.method15231(aClass124_8935.aClass141_Sub4_1498);
	    int i = aClass122_8932.anInt1485;
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
			       aClass185_Sub3_1600.aFloat9643,
			       aClass185_Sub3_1600.aFloat9644,
			       aClass185_Sub3_1600.aFloat9645, 1.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"),
			       96.0F + Math.abs(aClass185_Sub3_1600
						.aFloatArray9640[1]) * 928.0F);
	    aBool8933 = true;
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
    
    void method2327() {
	if (aBool8933) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600.method15231(null);
	    OpenGL.glUseProgram(0);
	    aBool8933 = false;
	}
    }
    
    void method2326() {
	if (aBool8933) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600.method15231(null);
	    OpenGL.glUseProgram(0);
	    aBool8933 = false;
	}
    }
    
    void method2345() {
	if (aBool8933) {
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    aClass185_Sub3_1600.method15231(null);
	    OpenGL.glUseProgram(0);
	    aBool8933 = false;
	}
    }
    
    boolean method2342() {
	return aBool8930;
    }
    
    void method2330(int i, int i_11_) {
	if (aBool8933) {
	    int i_12_ = 1 << (i & 0x3);
	    float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
	    int i_13_ = i_11_ & 0xffff;
	    float f_14_ = (float) (i_11_ >> 16 & 0x3) / 8.0F;
	    int i_15_ = aClass122_8932.anInt1485;
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "time"),
			       (float) (i_12_ * aClass185_Sub3_1600.anInt9696
					% 40000) / 40000.0F);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "scale"), f);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_,
							   "breakWaterDepth"),
			       (float) i_13_);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_,
							   "breakWaterOffset"),
			       f_14_);
	}
    }
    
    void method2348(Class141 class141, int i) {
	if (!aBool8933) {
	    aClass185_Sub3_1600.method15231(class141);
	    aClass185_Sub3_1600.method15214(i);
	}
    }
}
