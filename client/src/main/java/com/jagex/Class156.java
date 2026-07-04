/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class156
{
    static final String aString1744
	= "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";
    Class185_Sub3 aClass185_Sub3_1745;
    Class122 aClass122_1746;
    
    boolean method2581(Class141_Sub4 class141_sub4,
		       Class141_Sub4 class141_sub4_0_, float f) {
	if (!method2582())
	    return false;
	Class175_Sub1_Sub2 class175_sub1_sub2
	    = aClass185_Sub3_1745.aClass175_Sub1_Sub2_9710;
	Class534_Sub18_Sub1 class534_sub18_sub1
	    = new Class534_Sub18_Sub1(aClass185_Sub3_1745,
				      Class181.aClass181_1952,
				      Class173.aClass173_1830,
				      class141_sub4.anInt8975,
				      class141_sub4.anInt8976);
	boolean bool = false;
	aClass185_Sub3_1745.method3260(class175_sub1_sub2, -1471890530);
	class175_sub1_sub2.method15075(0, class534_sub18_sub1);
	if (class175_sub1_sub2.method15076()) {
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glPushAttrib(2048);
	    OpenGL.glViewport(0, 0, class141_sub4.anInt8975,
			      class141_sub4.anInt8976);
	    OpenGL.glUseProgram(aClass122_1746.anInt1485);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation((aClass122_1746
							    .anInt1485),
							   "heightMap"),
			       0);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation((aClass122_1746
							    .anInt1485),
							   "rcpRelief"),
			       1.0F / f);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation((aClass122_1746
							    .anInt1485),
							   "sampleSize"),
			       1.0F / (float) class141_sub4_0_.anInt8975,
			       1.0F / (float) class141_sub4_0_.anInt8976);
	    for (int i = 0; i < class141_sub4.anInt8977; i++) {
		float f_1_ = (float) i / (float) class141_sub4.anInt8977;
		aClass185_Sub3_1745.method15231(class141_sub4_0_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord3f(0.0F, 0.0F, f_1_);
		OpenGL.glVertex2f(0.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 0.0F, f_1_);
		OpenGL.glVertex2f(1.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 1.0F, f_1_);
		OpenGL.glVertex2f(1.0F, 1.0F);
		OpenGL.glTexCoord3f(0.0F, 1.0F, f_1_);
		OpenGL.glVertex2f(0.0F, 1.0F);
		OpenGL.glEnd();
		class141_sub4.method14490(0, 0, i, class141_sub4.anInt8975,
					  class141_sub4.anInt8976, 0, 0);
	    }
	    OpenGL.glUseProgram(0);
	    OpenGL.glPopAttrib();
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glPopMatrix();
	    bool = true;
	}
	class175_sub1_sub2.method15075(0, null);
	aClass185_Sub3_1745.method3261(class175_sub1_sub2, -11578496);
	return bool;
    }
    
    boolean method2582() {
	if (aClass185_Sub3_1745.aBool9685 && aClass185_Sub3_1745.aBool9680
	    && aClass122_1746 == null) {
	    Class140 class140
		= (Class140.method2357
		   (aClass185_Sub3_1745, 35632,
		    "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
	    if (class140 != null)
		aClass122_1746
		    = Class122.method2175(aClass185_Sub3_1745,
					  new Class140[] { class140 });
	}
	return aClass122_1746 != null;
    }
    
    boolean method2583(Class141_Sub4 class141_sub4,
		       Class141_Sub4 class141_sub4_2_, float f) {
	if (!method2582())
	    return false;
	Class175_Sub1_Sub2 class175_sub1_sub2
	    = aClass185_Sub3_1745.aClass175_Sub1_Sub2_9710;
	Class534_Sub18_Sub1 class534_sub18_sub1
	    = new Class534_Sub18_Sub1(aClass185_Sub3_1745,
				      Class181.aClass181_1952,
				      Class173.aClass173_1830,
				      class141_sub4.anInt8975,
				      class141_sub4.anInt8976);
	boolean bool = false;
	aClass185_Sub3_1745.method3260(class175_sub1_sub2, -1008398565);
	class175_sub1_sub2.method15075(0, class534_sub18_sub1);
	if (class175_sub1_sub2.method15076()) {
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glPushAttrib(2048);
	    OpenGL.glViewport(0, 0, class141_sub4.anInt8975,
			      class141_sub4.anInt8976);
	    OpenGL.glUseProgram(aClass122_1746.anInt1485);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation((aClass122_1746
							    .anInt1485),
							   "heightMap"),
			       0);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation((aClass122_1746
							    .anInt1485),
							   "rcpRelief"),
			       1.0F / f);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation((aClass122_1746
							    .anInt1485),
							   "sampleSize"),
			       1.0F / (float) class141_sub4_2_.anInt8975,
			       1.0F / (float) class141_sub4_2_.anInt8976);
	    for (int i = 0; i < class141_sub4.anInt8977; i++) {
		float f_3_ = (float) i / (float) class141_sub4.anInt8977;
		aClass185_Sub3_1745.method15231(class141_sub4_2_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord3f(0.0F, 0.0F, f_3_);
		OpenGL.glVertex2f(0.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 0.0F, f_3_);
		OpenGL.glVertex2f(1.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 1.0F, f_3_);
		OpenGL.glVertex2f(1.0F, 1.0F);
		OpenGL.glTexCoord3f(0.0F, 1.0F, f_3_);
		OpenGL.glVertex2f(0.0F, 1.0F);
		OpenGL.glEnd();
		class141_sub4.method14490(0, 0, i, class141_sub4.anInt8975,
					  class141_sub4.anInt8976, 0, 0);
	    }
	    OpenGL.glUseProgram(0);
	    OpenGL.glPopAttrib();
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glPopMatrix();
	    bool = true;
	}
	class175_sub1_sub2.method15075(0, null);
	aClass185_Sub3_1745.method3261(class175_sub1_sub2, -11578496);
	return bool;
    }
    
    Class156(Class185_Sub3 class185_sub3) {
	aClass185_Sub3_1745 = class185_sub3;
    }
    
    boolean method2584(Class141_Sub4 class141_sub4,
		       Class141_Sub4 class141_sub4_4_, float f) {
	if (!method2582())
	    return false;
	Class175_Sub1_Sub2 class175_sub1_sub2
	    = aClass185_Sub3_1745.aClass175_Sub1_Sub2_9710;
	Class534_Sub18_Sub1 class534_sub18_sub1
	    = new Class534_Sub18_Sub1(aClass185_Sub3_1745,
				      Class181.aClass181_1952,
				      Class173.aClass173_1830,
				      class141_sub4.anInt8975,
				      class141_sub4.anInt8976);
	boolean bool = false;
	aClass185_Sub3_1745.method3260(class175_sub1_sub2, 971621213);
	class175_sub1_sub2.method15075(0, class534_sub18_sub1);
	if (class175_sub1_sub2.method15076()) {
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glPushAttrib(2048);
	    OpenGL.glViewport(0, 0, class141_sub4.anInt8975,
			      class141_sub4.anInt8976);
	    OpenGL.glUseProgram(aClass122_1746.anInt1485);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation((aClass122_1746
							    .anInt1485),
							   "heightMap"),
			       0);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation((aClass122_1746
							    .anInt1485),
							   "rcpRelief"),
			       1.0F / f);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation((aClass122_1746
							    .anInt1485),
							   "sampleSize"),
			       1.0F / (float) class141_sub4_4_.anInt8975,
			       1.0F / (float) class141_sub4_4_.anInt8976);
	    for (int i = 0; i < class141_sub4.anInt8977; i++) {
		float f_5_ = (float) i / (float) class141_sub4.anInt8977;
		aClass185_Sub3_1745.method15231(class141_sub4_4_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord3f(0.0F, 0.0F, f_5_);
		OpenGL.glVertex2f(0.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 0.0F, f_5_);
		OpenGL.glVertex2f(1.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 1.0F, f_5_);
		OpenGL.glVertex2f(1.0F, 1.0F);
		OpenGL.glTexCoord3f(0.0F, 1.0F, f_5_);
		OpenGL.glVertex2f(0.0F, 1.0F);
		OpenGL.glEnd();
		class141_sub4.method14490(0, 0, i, class141_sub4.anInt8975,
					  class141_sub4.anInt8976, 0, 0);
	    }
	    OpenGL.glUseProgram(0);
	    OpenGL.glPopAttrib();
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glPopMatrix();
	    bool = true;
	}
	class175_sub1_sub2.method15075(0, null);
	aClass185_Sub3_1745.method3261(class175_sub1_sub2, -11578496);
	return bool;
    }
    
    boolean method2585(Class141_Sub4 class141_sub4,
		       Class141_Sub4 class141_sub4_6_, float f) {
	if (!method2582())
	    return false;
	Class175_Sub1_Sub2 class175_sub1_sub2
	    = aClass185_Sub3_1745.aClass175_Sub1_Sub2_9710;
	Class534_Sub18_Sub1 class534_sub18_sub1
	    = new Class534_Sub18_Sub1(aClass185_Sub3_1745,
				      Class181.aClass181_1952,
				      Class173.aClass173_1830,
				      class141_sub4.anInt8975,
				      class141_sub4.anInt8976);
	boolean bool = false;
	aClass185_Sub3_1745.method3260(class175_sub1_sub2, 522018164);
	class175_sub1_sub2.method15075(0, class534_sub18_sub1);
	if (class175_sub1_sub2.method15076()) {
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glPushMatrix();
	    OpenGL.glLoadIdentity();
	    OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
	    OpenGL.glPushAttrib(2048);
	    OpenGL.glViewport(0, 0, class141_sub4.anInt8975,
			      class141_sub4.anInt8976);
	    OpenGL.glUseProgram(aClass122_1746.anInt1485);
	    OpenGL.glUniform1i(OpenGL.glGetUniformLocation((aClass122_1746
							    .anInt1485),
							   "heightMap"),
			       0);
	    OpenGL.glUniform1f(OpenGL.glGetUniformLocation((aClass122_1746
							    .anInt1485),
							   "rcpRelief"),
			       1.0F / f);
	    OpenGL.glUniform2f(OpenGL.glGetUniformLocation((aClass122_1746
							    .anInt1485),
							   "sampleSize"),
			       1.0F / (float) class141_sub4_6_.anInt8975,
			       1.0F / (float) class141_sub4_6_.anInt8976);
	    for (int i = 0; i < class141_sub4.anInt8977; i++) {
		float f_7_ = (float) i / (float) class141_sub4.anInt8977;
		aClass185_Sub3_1745.method15231(class141_sub4_6_);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord3f(0.0F, 0.0F, f_7_);
		OpenGL.glVertex2f(0.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 0.0F, f_7_);
		OpenGL.glVertex2f(1.0F, 0.0F);
		OpenGL.glTexCoord3f(1.0F, 1.0F, f_7_);
		OpenGL.glVertex2f(1.0F, 1.0F);
		OpenGL.glTexCoord3f(0.0F, 1.0F, f_7_);
		OpenGL.glVertex2f(0.0F, 1.0F);
		OpenGL.glEnd();
		class141_sub4.method14490(0, 0, i, class141_sub4.anInt8975,
					  class141_sub4.anInt8976, 0, 0);
	    }
	    OpenGL.glUseProgram(0);
	    OpenGL.glPopAttrib();
	    OpenGL.glPopMatrix();
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glPopMatrix();
	    bool = true;
	}
	class175_sub1_sub2.method15075(0, null);
	aClass185_Sub3_1745.method3261(class175_sub1_sub2, -11578496);
	return bool;
    }
}
