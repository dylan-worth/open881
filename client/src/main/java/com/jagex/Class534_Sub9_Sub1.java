/* Class534_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class534_Sub9_Sub1 extends Class534_Sub9
{
    static final String aString11553
	= "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static float aFloat11554;
    static int anInt11555;
    static final String aString11556
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n";
    static final String aString11557
	= "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11558
	= "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11559
	= "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static float[] aFloatArray11560 = { 0.0F, 0.0F, 0.0F };
    static Class170_Sub2[] aClass170_Sub2Array11561;
    static final String aString11562
	= "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11563
	= "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
    static final String aString11564
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n";
    Class122[] aClass122Array11565 = null;
    
    void method16095(int i) {
	OpenGL.glUseProgram(0);
	for (int i_0_ = anInt11555; i_0_ >= 0; i_0_--) {
	    aClass185_Sub3_10427.method15230(i_0_);
	    aClass185_Sub3_10427.method15231(null);
	}
    }
    
    boolean method16081() {
	return (aFloat11554 == 1.0F
		|| (aFloatArray11560[0] + aFloatArray11560[1]
		    + aFloatArray11560[2]) == 0.0F
		|| (aClass170_Sub2Array11561[0] == null
		    && aClass170_Sub2Array11561[1] == null
		    && aClass170_Sub2Array11561[2] == null));
    }
    
    boolean method16070() {
	return aClass122Array11565 != null;
    }
    
    boolean method16083() {
	return aClass122Array11565 != null;
    }
    
    void method16072(int i, int i_1_) {
	/* empty */
    }
    
    void method16104() {
	if (aClass122Array11565 != null) {
	    for (int i = 0; i < aClass122Array11565.length; i++)
		aClass122Array11565[i] = null;
	    aClass122Array11565 = null;
	}
    }
    
    void method16105(int i, Class141_Sub2 class141_sub2,
		     Class141_Sub2 class141_sub2_2_, int i_3_, int i_4_) {
	if (anInt11555 >= 1 && anInt11555 <= 3) {
	    int i_5_ = aClass122Array11565[anInt11555 - 1].anInt1485;
	    OpenGL.glUseProgram(i_5_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_5_,
							   "paramsWeightings"),
			       aFloat11554, aFloatArray11560[0],
			       aFloatArray11560[1], aFloatArray11560[2]);
	    aClass185_Sub3_10427.method15230(0);
	    aClass185_Sub3_10427.method15231(class141_sub2);
	    for (int i_6_ = anInt11555 - 1; i_6_ >= 0; i_6_--) {
		if (aClass170_Sub2Array11561[i_6_] != null) {
		    if (i_6_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_5_, "remap_1"), 1);
		    if (i_6_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_5_, "remap_2"), 2);
		    if (i_6_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_5_, "remap_3"), 3);
		    aClass185_Sub3_10427.method15230(i_6_ + 1);
		    Class141 class141
			= aClass170_Sub2Array11561[i_6_].method14984();
		    if (class141 != null)
			aClass185_Sub3_10427.method15231(class141);
		}
	    }
	}
    }
    
    void method16073(int i) {
	OpenGL.glUseProgram(0);
	for (int i_7_ = anInt11555; i_7_ >= 0; i_7_--) {
	    aClass185_Sub3_10427.method15230(i_7_);
	    aClass185_Sub3_10427.method15231(null);
	}
    }
    
    Class173 method16079() {
	return Class173.aClass173_1830;
    }
    
    int method16077() {
	return 2;
    }
    
    Class173 method16096() {
	return Class173.aClass173_1830;
    }
    
    boolean method16088() {
	if (aClass185_Sub3_10427.aBool9680) {
	    aClass122Array11565 = new Class122[3];
	    if (aClass185_Sub3_10427.aBool9693) {
		aClass122Array11565[0]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[1]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[2]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (aClass122Array11565[i] == null)
			return false;
		}
	    } else {
		aClass122Array11565[0]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[1]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[2]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (aClass122Array11565[i] == null)
			return false;
		}
	    }
	    return aClass122Array11565 != null;
	}
	return false;
    }
    
    boolean method16082() {
	return aClass122Array11565 != null;
    }
    
    void method16093(int i, int i_8_) {
	/* empty */
    }
    
    boolean method16084() {
	return aClass122Array11565 != null;
    }
    
    void method16090() {
	if (aClass122Array11565 != null) {
	    for (int i = 0; i < aClass122Array11565.length; i++)
		aClass122Array11565[i] = null;
	    aClass122Array11565 = null;
	}
    }
    
    boolean method16085() {
	return aClass122Array11565 != null;
    }
    
    boolean method16086() {
	if (aClass185_Sub3_10427.aBool9680) {
	    aClass122Array11565 = new Class122[3];
	    if (aClass185_Sub3_10427.aBool9693) {
		aClass122Array11565[0]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[1]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[2]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (aClass122Array11565[i] == null)
			return false;
		}
	    } else {
		aClass122Array11565[0]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[1]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[2]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (aClass122Array11565[i] == null)
			return false;
		}
	    }
	    return aClass122Array11565 != null;
	}
	return false;
    }
    
    boolean method16113() {
	if (aClass185_Sub3_10427.aBool9680) {
	    aClass122Array11565 = new Class122[3];
	    if (aClass185_Sub3_10427.aBool9693) {
		aClass122Array11565[0]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[1]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[2]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (aClass122Array11565[i] == null)
			return false;
		}
	    } else {
		aClass122Array11565[0]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[1]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[2]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (aClass122Array11565[i] == null)
			return false;
		}
	    }
	    return aClass122Array11565 != null;
	}
	return false;
    }
    
    void method16089() {
	if (aClass122Array11565 != null) {
	    for (int i = 0; i < aClass122Array11565.length; i++)
		aClass122Array11565[i] = null;
	    aClass122Array11565 = null;
	}
    }
    
    int method16080() {
	return 2;
    }
    
    Class534_Sub9_Sub1(Class185_Sub3 class185_sub3) {
	super(class185_sub3);
    }
    
    boolean method16071() {
	return aClass122Array11565 != null;
    }
    
    void method16098(int i, int i_9_) {
	/* empty */
    }
    
    static {
	aFloat11554 = 1.0F;
	anInt11555 = 1;
	aClass170_Sub2Array11561 = new Class170_Sub2[] { null, null, null };
    }
    
    void method16094(int i, int i_10_) {
	/* empty */
    }
    
    boolean method16069() {
	if (aClass185_Sub3_10427.aBool9680) {
	    aClass122Array11565 = new Class122[3];
	    if (aClass185_Sub3_10427.aBool9693) {
		aClass122Array11565[0]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[1]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[2]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n"
				 .concat
			     ("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (aClass122Array11565[i] == null)
			return false;
		}
	    } else {
		aClass122Array11565[0]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[1]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		aClass122Array11565[2]
		    = (Class122.method2175
		       (aClass185_Sub3_10427,
			(new Class140[]
			 { Class140.method2357
			   (aClass185_Sub3_10427, 35632,
			    ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n"
				 .concat
			     ("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
		for (int i = 0; i < 3; i++) {
		    if (aClass122Array11565[i] == null)
			return false;
		}
	    }
	    return aClass122Array11565 != null;
	}
	return false;
    }
    
    int method16097() {
	return 2;
    }
    
    void method16091(int i, int i_11_) {
	/* empty */
    }
    
    int method16099() {
	return 2;
    }
    
    int method16100() {
	return 2;
    }
    
    Class173 method16107() {
	return Class173.aClass173_1830;
    }
    
    Class173 method16092() {
	return Class173.aClass173_1830;
    }
    
    Class173 method16106() {
	return Class173.aClass173_1830;
    }
    
    boolean method18061() {
	return aClass185_Sub3_10427.aBool9680;
    }
    
    boolean method16074() {
	return (aFloat11554 == 1.0F
		|| (aFloatArray11560[0] + aFloatArray11560[1]
		    + aFloatArray11560[2]) == 0.0F
		|| (aClass170_Sub2Array11561[0] == null
		    && aClass170_Sub2Array11561[1] == null
		    && aClass170_Sub2Array11561[2] == null));
    }
    
    boolean method16110() {
	return (aFloat11554 == 1.0F
		|| (aFloatArray11560[0] + aFloatArray11560[1]
		    + aFloatArray11560[2]) == 0.0F
		|| (aClass170_Sub2Array11561[0] == null
		    && aClass170_Sub2Array11561[1] == null
		    && aClass170_Sub2Array11561[2] == null));
    }
    
    boolean method16111() {
	return (aFloat11554 == 1.0F
		|| (aFloatArray11560[0] + aFloatArray11560[1]
		    + aFloatArray11560[2]) == 0.0F
		|| (aClass170_Sub2Array11561[0] == null
		    && aClass170_Sub2Array11561[1] == null
		    && aClass170_Sub2Array11561[2] == null));
    }
    
    void method16112(int i, Class141_Sub2 class141_sub2,
		     Class141_Sub2 class141_sub2_12_, int i_13_, int i_14_) {
	if (anInt11555 >= 1 && anInt11555 <= 3) {
	    int i_15_ = aClass122Array11565[anInt11555 - 1].anInt1485;
	    OpenGL.glUseProgram(i_15_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_15_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_15_,
							   "paramsWeightings"),
			       aFloat11554, aFloatArray11560[0],
			       aFloatArray11560[1], aFloatArray11560[2]);
	    aClass185_Sub3_10427.method15230(0);
	    aClass185_Sub3_10427.method15231(class141_sub2);
	    for (int i_16_ = anInt11555 - 1; i_16_ >= 0; i_16_--) {
		if (aClass170_Sub2Array11561[i_16_] != null) {
		    if (i_16_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_15_, "remap_1"), 1);
		    if (i_16_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_15_, "remap_2"), 2);
		    if (i_16_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_15_, "remap_3"), 3);
		    aClass185_Sub3_10427.method15230(i_16_ + 1);
		    Class141 class141
			= aClass170_Sub2Array11561[i_16_].method14984();
		    if (class141 != null)
			aClass185_Sub3_10427.method15231(class141);
		}
	    }
	}
    }
    
    void method16075(int i, Class141_Sub2 class141_sub2,
		     Class141_Sub2 class141_sub2_17_, int i_18_, int i_19_) {
	if (anInt11555 >= 1 && anInt11555 <= 3) {
	    int i_20_ = aClass122Array11565[anInt11555 - 1].anInt1485;
	    OpenGL.glUseProgram(i_20_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_20_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_20_,
							   "paramsWeightings"),
			       aFloat11554, aFloatArray11560[0],
			       aFloatArray11560[1], aFloatArray11560[2]);
	    aClass185_Sub3_10427.method15230(0);
	    aClass185_Sub3_10427.method15231(class141_sub2);
	    for (int i_21_ = anInt11555 - 1; i_21_ >= 0; i_21_--) {
		if (aClass170_Sub2Array11561[i_21_] != null) {
		    if (i_21_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_20_, "remap_1"), 1);
		    if (i_21_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_20_, "remap_2"), 2);
		    if (i_21_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_20_, "remap_3"), 3);
		    aClass185_Sub3_10427.method15230(i_21_ + 1);
		    Class141 class141
			= aClass170_Sub2Array11561[i_21_].method14984();
		    if (class141 != null)
			aClass185_Sub3_10427.method15231(class141);
		}
	    }
	}
    }
    
    void method16114(int i, Class141_Sub2 class141_sub2,
		     Class141_Sub2 class141_sub2_22_, int i_23_, int i_24_) {
	if (anInt11555 >= 1 && anInt11555 <= 3) {
	    int i_25_ = aClass122Array11565[anInt11555 - 1].anInt1485;
	    OpenGL.glUseProgram(i_25_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_25_, "sceneTex"),
			       0);
	    OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_25_,
							   "paramsWeightings"),
			       aFloat11554, aFloatArray11560[0],
			       aFloatArray11560[1], aFloatArray11560[2]);
	    aClass185_Sub3_10427.method15230(0);
	    aClass185_Sub3_10427.method15231(class141_sub2);
	    for (int i_26_ = anInt11555 - 1; i_26_ >= 0; i_26_--) {
		if (aClass170_Sub2Array11561[i_26_] != null) {
		    if (i_26_ == 0)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_25_, "remap_1"), 1);
		    if (i_26_ == 1)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_25_, "remap_2"), 2);
		    if (i_26_ == 2)
			OpenGL.glUniform1i
			    (OpenGL.glGetUniformLocation(i_25_, "remap_3"), 3);
		    aClass185_Sub3_10427.method15230(i_26_ + 1);
		    Class141 class141
			= aClass170_Sub2Array11561[i_26_].method14984();
		    if (class141 != null)
			aClass185_Sub3_10427.method15231(class141);
		}
	    }
	}
    }
}
