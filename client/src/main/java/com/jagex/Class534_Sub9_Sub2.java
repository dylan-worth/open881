/* Class534_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class534_Sub9_Sub2 extends Class534_Sub9
{
    static final String aString11612
	= "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
    static float aFloat11613 = 0.25F;
    static float aFloat11614 = 1.0F;
    static float aFloat11615 = 1.0F;
    int anInt11616;
    Class122 aClass122_11617;
    static final String aString11618
	= "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
    static final String aString11619
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";
    static final String aString11620
	= "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
    Class175_Sub1_Sub2 aClass175_Sub1_Sub2_11621;
    Class141_Sub2 aClass141_Sub2_11622;
    Class122 aClass122_11623;
    Class141_Sub2[] aClass141_Sub2Array11624;
    Class141_Sub2 aClass141_Sub2_11625;
    int anInt11626;
    int anInt11627;
    Class175_Sub1_Sub2 aClass175_Sub1_Sub2_11628;
    Class122 aClass122_11629;
    Class122 aClass122_11630;
    static final int anInt11631 = 256;
    int anInt11632;
    
    Class173 method16096() {
	return Class173.aClass173_1832;
    }
    
    boolean method18103() {
	return (aClass185_Sub3_10427.aBool9685
		&& aClass185_Sub3_10427.aBool9680
		&& aClass185_Sub3_10427.aBool9697);
    }
    
    boolean method16113() {
	if (aClass185_Sub3_10427.aBool9685 && aClass185_Sub3_10427.aBool9680
	    && aClass185_Sub3_10427.aBool9697) {
	    aClass175_Sub1_Sub2_11628
		= new Class175_Sub1_Sub2(aClass185_Sub3_10427);
	    aClass141_Sub2_11622
		= new Class141_Sub2(aClass185_Sub3_10427, 3553,
				    Class181.aClass181_1952, method16079(),
				    256, 256);
	    aClass141_Sub2_11622.method14454(false, false);
	    aClass141_Sub2_11625
		= new Class141_Sub2(aClass185_Sub3_10427, 3553,
				    Class181.aClass181_1952, method16079(),
				    256, 256);
	    aClass141_Sub2_11625.method14454(false, false);
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11628,
					    1761696065);
	    aClass175_Sub1_Sub2_11628
		.method15075(0, aClass141_Sub2_11622.method14451(0));
	    aClass175_Sub1_Sub2_11628
		.method15075(1, aClass141_Sub2_11625.method14451(0));
	    aClass175_Sub1_Sub2_11628.method17914(0);
	    if (!aClass175_Sub1_Sub2_11628.method15076()) {
		aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11628,
						-11578496);
		return false;
	    }
	    aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11628,
					    -11578496);
	    aClass122_11617
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass122_11623
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass122_11630
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
	    aClass122_11629
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
	    return (aClass122_11623 != null && aClass122_11617 != null
		    && aClass122_11630 != null && aClass122_11629 != null);
	}
	return false;
    }
    
    boolean method16081() {
	return false;
    }
    
    int method16100() {
	return 0;
    }
    
    void method16104() {
	anInt11632 = -1;
	anInt11627 = -1;
	aClass175_Sub1_Sub2_11621 = null;
	aClass141_Sub2Array11624 = null;
	aClass175_Sub1_Sub2_11628 = null;
	aClass141_Sub2_11622 = null;
	aClass141_Sub2_11625 = null;
	aClass122_11617 = null;
	aClass122_11623 = null;
	aClass122_11630 = null;
	aClass122_11629 = null;
    }
    
    void method16105(int i, Class141_Sub2 class141_sub2,
		     Class141_Sub2 class141_sub2_0_, int i_1_, int i_2_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (aClass141_Sub2Array11624 != null) {
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11621,
					    -521978822);
	    int i_3_ = Class455.method7422(anInt11616, -315738339);
	    int i_4_ = Class455.method7422(anInt11626, -1703282514);
	    int i_5_ = 0;
	    while (i_3_ > 256 || i_4_ > 256) {
		OpenGL.glViewport(0, 0, i_3_, i_4_);
		aClass175_Sub1_Sub2_11621.method15075(0,
						      aClass141_Sub2Array11624
							  [i_5_]
							  .method14451(0));
		if (i_5_ == 0) {
		    aClass185_Sub3_10427.method15231(class141_sub2);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, (float) (anInt11626 - i_1_));
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_2_),
					(float) (anInt11626 - i_1_));
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_2_),
					(float) anInt11626);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, (float) anInt11626);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    aClass185_Sub3_10427
			.method15231(aClass141_Sub2Array11624[i_5_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_3_ > 256)
		    i_3_ >>= 1;
		if (i_4_ > 256)
		    i_4_ >>= 1;
		i_5_++;
	    }
	    aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11621,
					    -11578496);
	    aClass185_Sub3_10427
		.method15231(aClass141_Sub2Array11624[i_5_ - 1]);
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11628,
					    -1820974092);
	    aClass175_Sub1_Sub2_11628.method17914(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_6_ = aClass122_11623.anInt1485;
	    OpenGL.glUseProgram(i_6_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_6_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_6_, "params"),
			       aFloat11615, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    aClass185_Sub3_10427.method15231(class141_sub2);
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11628,
					    1829268474);
	    aClass175_Sub1_Sub2_11628.method17914(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_7_ = aClass122_11617.anInt1485;
	    OpenGL.glUseProgram(i_7_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_7_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_7_, "params"),
			       aFloat11615, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) anInt11616, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) anInt11616, (float) anInt11626);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) anInt11626);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	aClass175_Sub1_Sub2_11628.method17914(1);
	aClass185_Sub3_10427.method15231(aClass141_Sub2_11622);
	int i_8_ = aClass122_11629.anInt1485;
	OpenGL.glUseProgram(i_8_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_8_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_8_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	aClass175_Sub1_Sub2_11628.method17914(0);
	aClass185_Sub3_10427.method15231(aClass141_Sub2_11625);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_8_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11628, -11578496);
	int i_9_ = aClass122_11630.anInt1485;
	OpenGL.glUseProgram(i_9_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_9_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_9_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_9_, "params"),
			   aFloat11613, aFloat11614, 0.0F);
	aClass185_Sub3_10427.method15230(1);
	aClass185_Sub3_10427.method15231(aClass141_Sub2_11622);
	aClass185_Sub3_10427.method15230(0);
	aClass185_Sub3_10427.method15231(class141_sub2);
    }
    
    void method16095(int i) {
	OpenGL.glUseProgram(0);
	aClass185_Sub3_10427.method15230(1);
	aClass185_Sub3_10427.method15231(null);
	aClass185_Sub3_10427.method15230(0);
    }
    
    Class173 method16079() {
	return Class173.aClass173_1832;
    }
    
    int method16077() {
	return 0;
    }
    
    void method16089() {
	anInt11632 = -1;
	anInt11627 = -1;
	aClass175_Sub1_Sub2_11621 = null;
	aClass141_Sub2Array11624 = null;
	aClass175_Sub1_Sub2_11628 = null;
	aClass141_Sub2_11622 = null;
	aClass141_Sub2_11625 = null;
	aClass122_11617 = null;
	aClass122_11623 = null;
	aClass122_11630 = null;
	aClass122_11629 = null;
    }
    
    boolean method16082() {
	return aClass175_Sub1_Sub2_11628 != null;
    }
    
    boolean method16083() {
	return aClass175_Sub1_Sub2_11628 != null;
    }
    
    boolean method16084() {
	return aClass175_Sub1_Sub2_11628 != null;
    }
    
    int method16080() {
	return 0;
    }
    
    boolean method16085() {
	return aClass175_Sub1_Sub2_11628 != null;
    }
    
    boolean method16086() {
	if (aClass185_Sub3_10427.aBool9685 && aClass185_Sub3_10427.aBool9680
	    && aClass185_Sub3_10427.aBool9697) {
	    aClass175_Sub1_Sub2_11628
		= new Class175_Sub1_Sub2(aClass185_Sub3_10427);
	    aClass141_Sub2_11622
		= new Class141_Sub2(aClass185_Sub3_10427, 3553,
				    Class181.aClass181_1952, method16079(),
				    256, 256);
	    aClass141_Sub2_11622.method14454(false, false);
	    aClass141_Sub2_11625
		= new Class141_Sub2(aClass185_Sub3_10427, 3553,
				    Class181.aClass181_1952, method16079(),
				    256, 256);
	    aClass141_Sub2_11625.method14454(false, false);
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11628,
					    -289430634);
	    aClass175_Sub1_Sub2_11628
		.method15075(0, aClass141_Sub2_11622.method14451(0));
	    aClass175_Sub1_Sub2_11628
		.method15075(1, aClass141_Sub2_11625.method14451(0));
	    aClass175_Sub1_Sub2_11628.method17914(0);
	    if (!aClass175_Sub1_Sub2_11628.method15076()) {
		aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11628,
						-11578496);
		return false;
	    }
	    aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11628,
					    -11578496);
	    aClass122_11617
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass122_11623
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass122_11630
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
	    aClass122_11629
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
	    return (aClass122_11623 != null && aClass122_11617 != null
		    && aClass122_11630 != null && aClass122_11629 != null);
	}
	return false;
    }
    
    boolean method16071() {
	return aClass175_Sub1_Sub2_11628 != null;
    }
    
    boolean method16088() {
	if (aClass185_Sub3_10427.aBool9685 && aClass185_Sub3_10427.aBool9680
	    && aClass185_Sub3_10427.aBool9697) {
	    aClass175_Sub1_Sub2_11628
		= new Class175_Sub1_Sub2(aClass185_Sub3_10427);
	    aClass141_Sub2_11622
		= new Class141_Sub2(aClass185_Sub3_10427, 3553,
				    Class181.aClass181_1952, method16079(),
				    256, 256);
	    aClass141_Sub2_11622.method14454(false, false);
	    aClass141_Sub2_11625
		= new Class141_Sub2(aClass185_Sub3_10427, 3553,
				    Class181.aClass181_1952, method16079(),
				    256, 256);
	    aClass141_Sub2_11625.method14454(false, false);
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11628,
					    -817621534);
	    aClass175_Sub1_Sub2_11628
		.method15075(0, aClass141_Sub2_11622.method14451(0));
	    aClass175_Sub1_Sub2_11628
		.method15075(1, aClass141_Sub2_11625.method14451(0));
	    aClass175_Sub1_Sub2_11628.method17914(0);
	    if (!aClass175_Sub1_Sub2_11628.method15076()) {
		aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11628,
						-11578496);
		return false;
	    }
	    aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11628,
					    -11578496);
	    aClass122_11617
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass122_11623
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass122_11630
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
	    aClass122_11629
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
	    return (aClass122_11623 != null && aClass122_11617 != null
		    && aClass122_11630 != null && aClass122_11629 != null);
	}
	return false;
    }
    
    boolean method16110() {
	return false;
    }
    
    void method16091(int i, int i_10_) {
	anInt11616 = i;
	anInt11626 = i_10_;
	int i_11_ = Class455.method7422(anInt11616, -425149036);
	int i_12_ = Class455.method7422(anInt11626, -1919760220);
	if (anInt11627 != i_11_ || anInt11632 != i_12_) {
	    if (aClass141_Sub2Array11624 != null) {
		for (int i_13_ = 0; i_13_ < aClass141_Sub2Array11624.length;
		     i_13_++)
		    aClass141_Sub2Array11624[i_13_].method2368();
		aClass141_Sub2Array11624 = null;
	    }
	    if (i_11_ > 256 || i_12_ > 256) {
		int i_14_ = i_11_;
		int i_15_ = i_12_;
		int i_16_ = 0;
		while (i_14_ > 256 || i_15_ > 256) {
		    if (i_14_ > 256)
			i_14_ >>= 1;
		    if (i_15_ > 256)
			i_15_ >>= 1;
		    i_16_++;
		}
		if (aClass175_Sub1_Sub2_11621 == null)
		    aClass175_Sub1_Sub2_11621
			= new Class175_Sub1_Sub2(aClass185_Sub3_10427);
		aClass141_Sub2Array11624 = new Class141_Sub2[i_16_];
		i_14_ = i_11_;
		i_15_ = i_12_;
		i_16_ = 0;
		while (i_14_ > 256 || i_15_ > 256) {
		    aClass141_Sub2Array11624[i_16_++]
			= new Class141_Sub2(aClass185_Sub3_10427, 3553,
					    Class181.aClass181_1952,
					    method16079(), i_14_, i_15_);
		    if (i_14_ > 256)
			i_14_ >>= 1;
		    if (i_15_ > 256)
			i_15_ >>= 1;
		}
	    } else
		aClass175_Sub1_Sub2_11621 = null;
	    anInt11627 = i_11_;
	    anInt11632 = i_12_;
	}
    }
    
    Class173 method16107() {
	return Class173.aClass173_1832;
    }
    
    void method16098(int i, int i_17_) {
	anInt11616 = i;
	anInt11626 = i_17_;
	int i_18_ = Class455.method7422(anInt11616, -1527270946);
	int i_19_ = Class455.method7422(anInt11626, -826558626);
	if (anInt11627 != i_18_ || anInt11632 != i_19_) {
	    if (aClass141_Sub2Array11624 != null) {
		for (int i_20_ = 0; i_20_ < aClass141_Sub2Array11624.length;
		     i_20_++)
		    aClass141_Sub2Array11624[i_20_].method2368();
		aClass141_Sub2Array11624 = null;
	    }
	    if (i_18_ > 256 || i_19_ > 256) {
		int i_21_ = i_18_;
		int i_22_ = i_19_;
		int i_23_ = 0;
		while (i_21_ > 256 || i_22_ > 256) {
		    if (i_21_ > 256)
			i_21_ >>= 1;
		    if (i_22_ > 256)
			i_22_ >>= 1;
		    i_23_++;
		}
		if (aClass175_Sub1_Sub2_11621 == null)
		    aClass175_Sub1_Sub2_11621
			= new Class175_Sub1_Sub2(aClass185_Sub3_10427);
		aClass141_Sub2Array11624 = new Class141_Sub2[i_23_];
		i_21_ = i_18_;
		i_22_ = i_19_;
		i_23_ = 0;
		while (i_21_ > 256 || i_22_ > 256) {
		    aClass141_Sub2Array11624[i_23_++]
			= new Class141_Sub2(aClass185_Sub3_10427, 3553,
					    Class181.aClass181_1952,
					    method16079(), i_21_, i_22_);
		    if (i_21_ > 256)
			i_21_ >>= 1;
		    if (i_22_ > 256)
			i_22_ >>= 1;
		}
	    } else
		aClass175_Sub1_Sub2_11621 = null;
	    anInt11627 = i_18_;
	    anInt11632 = i_19_;
	}
    }
    
    void method16093(int i, int i_24_) {
	anInt11616 = i;
	anInt11626 = i_24_;
	int i_25_ = Class455.method7422(anInt11616, -380286521);
	int i_26_ = Class455.method7422(anInt11626, -224392241);
	if (anInt11627 != i_25_ || anInt11632 != i_26_) {
	    if (aClass141_Sub2Array11624 != null) {
		for (int i_27_ = 0; i_27_ < aClass141_Sub2Array11624.length;
		     i_27_++)
		    aClass141_Sub2Array11624[i_27_].method2368();
		aClass141_Sub2Array11624 = null;
	    }
	    if (i_25_ > 256 || i_26_ > 256) {
		int i_28_ = i_25_;
		int i_29_ = i_26_;
		int i_30_ = 0;
		while (i_28_ > 256 || i_29_ > 256) {
		    if (i_28_ > 256)
			i_28_ >>= 1;
		    if (i_29_ > 256)
			i_29_ >>= 1;
		    i_30_++;
		}
		if (aClass175_Sub1_Sub2_11621 == null)
		    aClass175_Sub1_Sub2_11621
			= new Class175_Sub1_Sub2(aClass185_Sub3_10427);
		aClass141_Sub2Array11624 = new Class141_Sub2[i_30_];
		i_28_ = i_25_;
		i_29_ = i_26_;
		i_30_ = 0;
		while (i_28_ > 256 || i_29_ > 256) {
		    aClass141_Sub2Array11624[i_30_++]
			= new Class141_Sub2(aClass185_Sub3_10427, 3553,
					    Class181.aClass181_1952,
					    method16079(), i_28_, i_29_);
		    if (i_28_ > 256)
			i_28_ >>= 1;
		    if (i_29_ > 256)
			i_29_ >>= 1;
		}
	    } else
		aClass175_Sub1_Sub2_11621 = null;
	    anInt11627 = i_25_;
	    anInt11632 = i_26_;
	}
    }
    
    Class173 method16106() {
	return Class173.aClass173_1832;
    }
    
    boolean method18104() {
	return (aClass185_Sub3_10427.aBool9685
		&& aClass185_Sub3_10427.aBool9680
		&& aClass185_Sub3_10427.aBool9697);
    }
    
    int method16097() {
	return 0;
    }
    
    void method16112(int i, Class141_Sub2 class141_sub2,
		     Class141_Sub2 class141_sub2_31_, int i_32_, int i_33_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (aClass141_Sub2Array11624 != null) {
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11621,
					    946752902);
	    int i_34_ = Class455.method7422(anInt11616, 246138768);
	    int i_35_ = Class455.method7422(anInt11626, -1987090636);
	    int i_36_ = 0;
	    while (i_34_ > 256 || i_35_ > 256) {
		OpenGL.glViewport(0, 0, i_34_, i_35_);
		aClass175_Sub1_Sub2_11621.method15075(0,
						      aClass141_Sub2Array11624
							  [i_36_]
							  .method14451(0));
		if (i_36_ == 0) {
		    aClass185_Sub3_10427.method15231(class141_sub2);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, (float) (anInt11626 - i_32_));
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_33_),
					(float) (anInt11626 - i_32_));
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_33_),
					(float) anInt11626);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, (float) anInt11626);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    aClass185_Sub3_10427
			.method15231(aClass141_Sub2Array11624[i_36_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_34_ > 256)
		    i_34_ >>= 1;
		if (i_35_ > 256)
		    i_35_ >>= 1;
		i_36_++;
	    }
	    aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11621,
					    -11578496);
	    aClass185_Sub3_10427
		.method15231(aClass141_Sub2Array11624[i_36_ - 1]);
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11628,
					    1000000281);
	    aClass175_Sub1_Sub2_11628.method17914(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_37_ = aClass122_11623.anInt1485;
	    OpenGL.glUseProgram(i_37_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_37_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_37_, "params"),
			       aFloat11615, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    aClass185_Sub3_10427.method15231(class141_sub2);
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11628,
					    -1085908863);
	    aClass175_Sub1_Sub2_11628.method17914(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_38_ = aClass122_11617.anInt1485;
	    OpenGL.glUseProgram(i_38_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_38_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_38_, "params"),
			       aFloat11615, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) anInt11616, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) anInt11616, (float) anInt11626);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) anInt11626);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	aClass175_Sub1_Sub2_11628.method17914(1);
	aClass185_Sub3_10427.method15231(aClass141_Sub2_11622);
	int i_39_ = aClass122_11629.anInt1485;
	OpenGL.glUseProgram(i_39_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_39_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_39_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	aClass175_Sub1_Sub2_11628.method17914(0);
	aClass185_Sub3_10427.method15231(aClass141_Sub2_11625);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_39_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11628, -11578496);
	int i_40_ = aClass122_11630.anInt1485;
	OpenGL.glUseProgram(i_40_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_40_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_40_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_40_, "params"),
			   aFloat11613, aFloat11614, 0.0F);
	aClass185_Sub3_10427.method15230(1);
	aClass185_Sub3_10427.method15231(aClass141_Sub2_11622);
	aClass185_Sub3_10427.method15230(0);
	aClass185_Sub3_10427.method15231(class141_sub2);
    }
    
    int method16099() {
	return 0;
    }
    
    boolean method16070() {
	return aClass175_Sub1_Sub2_11628 != null;
    }
    
    void method16073(int i) {
	OpenGL.glUseProgram(0);
	aClass185_Sub3_10427.method15230(1);
	aClass185_Sub3_10427.method15231(null);
	aClass185_Sub3_10427.method15230(0);
    }
    
    Class173 method16092() {
	return Class173.aClass173_1832;
    }
    
    void method16090() {
	anInt11632 = -1;
	anInt11627 = -1;
	aClass175_Sub1_Sub2_11621 = null;
	aClass141_Sub2Array11624 = null;
	aClass175_Sub1_Sub2_11628 = null;
	aClass141_Sub2_11622 = null;
	aClass141_Sub2_11625 = null;
	aClass122_11617 = null;
	aClass122_11623 = null;
	aClass122_11630 = null;
	aClass122_11629 = null;
    }
    
    boolean method16069() {
	if (aClass185_Sub3_10427.aBool9685 && aClass185_Sub3_10427.aBool9680
	    && aClass185_Sub3_10427.aBool9697) {
	    aClass175_Sub1_Sub2_11628
		= new Class175_Sub1_Sub2(aClass185_Sub3_10427);
	    aClass141_Sub2_11622
		= new Class141_Sub2(aClass185_Sub3_10427, 3553,
				    Class181.aClass181_1952, method16079(),
				    256, 256);
	    aClass141_Sub2_11622.method14454(false, false);
	    aClass141_Sub2_11625
		= new Class141_Sub2(aClass185_Sub3_10427, 3553,
				    Class181.aClass181_1952, method16079(),
				    256, 256);
	    aClass141_Sub2_11625.method14454(false, false);
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11628,
					    -702329999);
	    aClass175_Sub1_Sub2_11628
		.method15075(0, aClass141_Sub2_11622.method14451(0));
	    aClass175_Sub1_Sub2_11628
		.method15075(1, aClass141_Sub2_11625.method14451(0));
	    aClass175_Sub1_Sub2_11628.method17914(0);
	    if (!aClass175_Sub1_Sub2_11628.method15076()) {
		aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11628,
						-11578496);
		return false;
	    }
	    aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11628,
					    -11578496);
	    aClass122_11617
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass122_11623
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
	    aClass122_11630
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
	    aClass122_11629
		= (Class122.method2175
		   (aClass185_Sub3_10427,
		    (new Class140[]
		     { Class140.method2357
		       (aClass185_Sub3_10427, 35632,
			"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
	    return (aClass122_11623 != null && aClass122_11617 != null
		    && aClass122_11630 != null && aClass122_11629 != null);
	}
	return false;
    }
    
    void method16094(int i, int i_41_) {
	anInt11616 = i;
	anInt11626 = i_41_;
	int i_42_ = Class455.method7422(anInt11616, -301729762);
	int i_43_ = Class455.method7422(anInt11626, 51221441);
	if (anInt11627 != i_42_ || anInt11632 != i_43_) {
	    if (aClass141_Sub2Array11624 != null) {
		for (int i_44_ = 0; i_44_ < aClass141_Sub2Array11624.length;
		     i_44_++)
		    aClass141_Sub2Array11624[i_44_].method2368();
		aClass141_Sub2Array11624 = null;
	    }
	    if (i_42_ > 256 || i_43_ > 256) {
		int i_45_ = i_42_;
		int i_46_ = i_43_;
		int i_47_ = 0;
		while (i_45_ > 256 || i_46_ > 256) {
		    if (i_45_ > 256)
			i_45_ >>= 1;
		    if (i_46_ > 256)
			i_46_ >>= 1;
		    i_47_++;
		}
		if (aClass175_Sub1_Sub2_11621 == null)
		    aClass175_Sub1_Sub2_11621
			= new Class175_Sub1_Sub2(aClass185_Sub3_10427);
		aClass141_Sub2Array11624 = new Class141_Sub2[i_47_];
		i_45_ = i_42_;
		i_46_ = i_43_;
		i_47_ = 0;
		while (i_45_ > 256 || i_46_ > 256) {
		    aClass141_Sub2Array11624[i_47_++]
			= new Class141_Sub2(aClass185_Sub3_10427, 3553,
					    Class181.aClass181_1952,
					    method16079(), i_45_, i_46_);
		    if (i_45_ > 256)
			i_45_ >>= 1;
		    if (i_46_ > 256)
			i_46_ >>= 1;
		}
	    } else
		aClass175_Sub1_Sub2_11621 = null;
	    anInt11627 = i_42_;
	    anInt11632 = i_43_;
	}
    }
    
    void method16072(int i, int i_48_) {
	anInt11616 = i;
	anInt11626 = i_48_;
	int i_49_ = Class455.method7422(anInt11616, -807665983);
	int i_50_ = Class455.method7422(anInt11626, 106353548);
	if (anInt11627 != i_49_ || anInt11632 != i_50_) {
	    if (aClass141_Sub2Array11624 != null) {
		for (int i_51_ = 0; i_51_ < aClass141_Sub2Array11624.length;
		     i_51_++)
		    aClass141_Sub2Array11624[i_51_].method2368();
		aClass141_Sub2Array11624 = null;
	    }
	    if (i_49_ > 256 || i_50_ > 256) {
		int i_52_ = i_49_;
		int i_53_ = i_50_;
		int i_54_ = 0;
		while (i_52_ > 256 || i_53_ > 256) {
		    if (i_52_ > 256)
			i_52_ >>= 1;
		    if (i_53_ > 256)
			i_53_ >>= 1;
		    i_54_++;
		}
		if (aClass175_Sub1_Sub2_11621 == null)
		    aClass175_Sub1_Sub2_11621
			= new Class175_Sub1_Sub2(aClass185_Sub3_10427);
		aClass141_Sub2Array11624 = new Class141_Sub2[i_54_];
		i_52_ = i_49_;
		i_53_ = i_50_;
		i_54_ = 0;
		while (i_52_ > 256 || i_53_ > 256) {
		    aClass141_Sub2Array11624[i_54_++]
			= new Class141_Sub2(aClass185_Sub3_10427, 3553,
					    Class181.aClass181_1952,
					    method16079(), i_52_, i_53_);
		    if (i_52_ > 256)
			i_52_ >>= 1;
		    if (i_53_ > 256)
			i_53_ >>= 1;
		}
	    } else
		aClass175_Sub1_Sub2_11621 = null;
	    anInt11627 = i_49_;
	    anInt11632 = i_50_;
	}
    }
    
    boolean method16111() {
	return false;
    }
    
    Class534_Sub9_Sub2(Class185_Sub3 class185_sub3) {
	super(class185_sub3);
    }
    
    void method16075(int i, Class141_Sub2 class141_sub2,
		     Class141_Sub2 class141_sub2_55_, int i_56_, int i_57_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (aClass141_Sub2Array11624 != null) {
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11621,
					    305550688);
	    int i_58_ = Class455.method7422(anInt11616, -1538418766);
	    int i_59_ = Class455.method7422(anInt11626, -148547375);
	    int i_60_ = 0;
	    while (i_58_ > 256 || i_59_ > 256) {
		OpenGL.glViewport(0, 0, i_58_, i_59_);
		aClass175_Sub1_Sub2_11621.method15075(0,
						      aClass141_Sub2Array11624
							  [i_60_]
							  .method14451(0));
		if (i_60_ == 0) {
		    aClass185_Sub3_10427.method15231(class141_sub2);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, (float) (anInt11626 - i_56_));
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_57_),
					(float) (anInt11626 - i_56_));
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_57_),
					(float) anInt11626);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, (float) anInt11626);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    aClass185_Sub3_10427
			.method15231(aClass141_Sub2Array11624[i_60_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_58_ > 256)
		    i_58_ >>= 1;
		if (i_59_ > 256)
		    i_59_ >>= 1;
		i_60_++;
	    }
	    aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11621,
					    -11578496);
	    aClass185_Sub3_10427
		.method15231(aClass141_Sub2Array11624[i_60_ - 1]);
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11628,
					    266762513);
	    aClass175_Sub1_Sub2_11628.method17914(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_61_ = aClass122_11623.anInt1485;
	    OpenGL.glUseProgram(i_61_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_61_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_61_, "params"),
			       aFloat11615, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    aClass185_Sub3_10427.method15231(class141_sub2);
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11628,
					    -1719538959);
	    aClass175_Sub1_Sub2_11628.method17914(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_62_ = aClass122_11617.anInt1485;
	    OpenGL.glUseProgram(i_62_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_62_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_62_, "params"),
			       aFloat11615, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) anInt11616, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) anInt11616, (float) anInt11626);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) anInt11626);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	aClass175_Sub1_Sub2_11628.method17914(1);
	aClass185_Sub3_10427.method15231(aClass141_Sub2_11622);
	int i_63_ = aClass122_11629.anInt1485;
	OpenGL.glUseProgram(i_63_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_63_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_63_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	aClass175_Sub1_Sub2_11628.method17914(0);
	aClass185_Sub3_10427.method15231(aClass141_Sub2_11625);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_63_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11628, -11578496);
	int i_64_ = aClass122_11630.anInt1485;
	OpenGL.glUseProgram(i_64_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_64_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_64_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_64_, "params"),
			   aFloat11613, aFloat11614, 0.0F);
	aClass185_Sub3_10427.method15230(1);
	aClass185_Sub3_10427.method15231(aClass141_Sub2_11622);
	aClass185_Sub3_10427.method15230(0);
	aClass185_Sub3_10427.method15231(class141_sub2);
    }
    
    void method16114(int i, Class141_Sub2 class141_sub2,
		     Class141_Sub2 class141_sub2_65_, int i_66_, int i_67_) {
	OpenGL.glPushAttrib(2048);
	OpenGL.glMatrixMode(5889);
	OpenGL.glPushMatrix();
	OpenGL.glLoadIdentity();
	OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	if (aClass141_Sub2Array11624 != null) {
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11621,
					    -87984824);
	    int i_68_ = Class455.method7422(anInt11616, -577205169);
	    int i_69_ = Class455.method7422(anInt11626, -1558020633);
	    int i_70_ = 0;
	    while (i_68_ > 256 || i_69_ > 256) {
		OpenGL.glViewport(0, 0, i_68_, i_69_);
		aClass175_Sub1_Sub2_11621.method15075(0,
						      aClass141_Sub2Array11624
							  [i_70_]
							  .method14451(0));
		if (i_70_ == 0) {
		    aClass185_Sub3_10427.method15231(class141_sub2);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, (float) (anInt11626 - i_66_));
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_67_),
					(float) (anInt11626 - i_66_));
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f((float) (0 + i_67_),
					(float) anInt11626);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, (float) anInt11626);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		} else {
		    aClass185_Sub3_10427
			.method15231(aClass141_Sub2Array11624[i_70_ - 1]);
		    OpenGL.glBegin(7);
		    OpenGL.glTexCoord2f(0.0F, 0.0F);
		    OpenGL.glVertex2i(0, 0);
		    OpenGL.glTexCoord2f(1.0F, 0.0F);
		    OpenGL.glVertex2i(1, 0);
		    OpenGL.glTexCoord2f(1.0F, 1.0F);
		    OpenGL.glVertex2i(1, 1);
		    OpenGL.glTexCoord2f(0.0F, 1.0F);
		    OpenGL.glVertex2i(0, 1);
		    OpenGL.glEnd();
		}
		if (i_68_ > 256)
		    i_68_ >>= 1;
		if (i_69_ > 256)
		    i_69_ >>= 1;
		i_70_++;
	    }
	    aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11621,
					    -11578496);
	    aClass185_Sub3_10427
		.method15231(aClass141_Sub2Array11624[i_70_ - 1]);
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11628,
					    1036030641);
	    aClass175_Sub1_Sub2_11628.method17914(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_71_ = aClass122_11623.anInt1485;
	    OpenGL.glUseProgram(i_71_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_71_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_71_, "params"),
			       aFloat11615, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f(1.0F, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f(1.0F, 1.0F);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, 1.0F);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	} else {
	    aClass185_Sub3_10427.method15231(class141_sub2);
	    aClass185_Sub3_10427.method3260(aClass175_Sub1_Sub2_11628,
					    -104883602);
	    aClass175_Sub1_Sub2_11628.method17914(0);
	    OpenGL.glViewport(0, 0, 256, 256);
	    int i_72_ = aClass122_11617.anInt1485;
	    OpenGL.glUseProgram(i_72_);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_72_, "sceneTex"),
			       0);
	    OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_72_, "params"),
			       aFloat11615, 0.0F, 0.0F);
	    OpenGL.glBegin(7);
	    OpenGL.glTexCoord2f(0.0F, 0.0F);
	    OpenGL.glVertex2i(0, 0);
	    OpenGL.glTexCoord2f((float) anInt11616, 0.0F);
	    OpenGL.glVertex2i(1, 0);
	    OpenGL.glTexCoord2f((float) anInt11616, (float) anInt11626);
	    OpenGL.glVertex2i(1, 1);
	    OpenGL.glTexCoord2f(0.0F, (float) anInt11626);
	    OpenGL.glVertex2i(0, 1);
	    OpenGL.glEnd();
	}
	aClass175_Sub1_Sub2_11628.method17914(1);
	aClass185_Sub3_10427.method15231(aClass141_Sub2_11622);
	int i_73_ = aClass122_11629.anInt1485;
	OpenGL.glUseProgram(i_73_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_73_, "baseTex"), 0);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_73_, "step"),
			   0.00390625F, 0.0F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	aClass175_Sub1_Sub2_11628.method17914(0);
	aClass185_Sub3_10427.method15231(aClass141_Sub2_11625);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_73_, "step"), 0.0F,
			   0.00390625F, 0.0F);
	OpenGL.glBegin(7);
	OpenGL.glTexCoord2f(0.0F, 0.0F);
	OpenGL.glVertex2i(0, 0);
	OpenGL.glTexCoord2f(1.0F, 0.0F);
	OpenGL.glVertex2i(1, 0);
	OpenGL.glTexCoord2f(1.0F, 1.0F);
	OpenGL.glVertex2i(1, 1);
	OpenGL.glTexCoord2f(0.0F, 1.0F);
	OpenGL.glVertex2i(0, 1);
	OpenGL.glEnd();
	OpenGL.glPopAttrib();
	OpenGL.glPopMatrix();
	OpenGL.glMatrixMode(5888);
	aClass185_Sub3_10427.method3261(aClass175_Sub1_Sub2_11628, -11578496);
	int i_74_ = aClass122_11630.anInt1485;
	OpenGL.glUseProgram(i_74_);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_74_, "sceneTex"), 0);
	OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_74_, "bloomTex"), 1);
	OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_74_, "params"),
			   aFloat11613, aFloat11614, 0.0F);
	aClass185_Sub3_10427.method15230(1);
	aClass185_Sub3_10427.method15231(aClass141_Sub2_11622);
	aClass185_Sub3_10427.method15230(0);
	aClass185_Sub3_10427.method15231(class141_sub2);
    }
    
    boolean method16074() {
	return false;
    }
    
    boolean method18105() {
	return (aClass185_Sub3_10427.aBool9685
		&& aClass185_Sub3_10427.aBool9680
		&& aClass185_Sub3_10427.aBool9697);
    }
    
    boolean method18106() {
	return (aClass185_Sub3_10427.aBool9685
		&& aClass185_Sub3_10427.aBool9680
		&& aClass185_Sub3_10427.aBool9697);
    }
}
