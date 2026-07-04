/* Class136_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class136_Sub2 extends Class136
{
    float[] aFloatArray8920;
    static final char aChar8921 = '\0';
    int anInt8922;
    Class125 aClass125_8923;
    float aFloat8924;
    static final char aChar8925 = '\001';
    static final String aString8926
	= "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
    Class137 aClass137_8927;
    Class124 aClass124_8928;
    static float[] aFloatArray8929 = new float[4];
    
    void method2328(boolean bool) {
	if (aClass125_8923 != null) {
	    aClass125_8923.method2184('\0');
	    aClass185_Sub3_1600.method15230(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((aClass185_Sub3_1600.aClass433_9604
				  .aFloatArray4853),
				 0);
	    OpenGL.glMatrixMode(5888);
	    aClass185_Sub3_1600.method15230(0);
	    if (anInt8922 != aClass185_Sub3_1600.anInt9696) {
		int i = aClass185_Sub3_1600.anInt9696 % 5000 * 128 / 5000;
		for (int i_0_ = 0; i_0_ < 64; i_0_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_0_,
							 aFloatArray8920, i);
		    i += 2;
		}
		if (aClass124_8928.aBool1496)
		    aFloat8924 = (float) (aClass185_Sub3_1600.anInt9696
					  % 4000) / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		anInt8922 = aClass185_Sub3_1600.anInt9696;
	    }
	}
    }
    
    boolean method2347() {
	return true;
    }
    
    void method2345() {
	if (aClass125_8923 != null) {
	    aClass125_8923.method2184('\001');
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    void method2344(boolean bool) {
	if (aClass125_8923 != null) {
	    aClass125_8923.method2184('\0');
	    aClass185_Sub3_1600.method15230(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((aClass185_Sub3_1600.aClass433_9604
				  .aFloatArray4853),
				 0);
	    OpenGL.glMatrixMode(5888);
	    aClass185_Sub3_1600.method15230(0);
	    if (anInt8922 != aClass185_Sub3_1600.anInt9696) {
		int i = aClass185_Sub3_1600.anInt9696 % 5000 * 128 / 5000;
		for (int i_1_ = 0; i_1_ < 64; i_1_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_1_,
							 aFloatArray8920, i);
		    i += 2;
		}
		if (aClass124_8928.aBool1496)
		    aFloat8924 = (float) (aClass185_Sub3_1600.anInt9696
					  % 4000) / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		anInt8922 = aClass185_Sub3_1600.anInt9696;
	    }
	}
    }
    
    void method2329(boolean bool) {
	/* empty */
    }
    
    void method2327() {
	if (aClass125_8923 != null) {
	    aClass125_8923.method2184('\001');
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    void method2331(int i, int i_2_) {
	if (aClass125_8923 != null) {
	    aClass185_Sub3_1600.method15230(1);
	    if ((i & 0x80) == 0) {
		if ((i_2_ & 0x1) == 1) {
		    if (!aClass124_8928.aBool1496) {
			int i_3_
			    = aClass185_Sub3_1600.anInt9696 % 4000 * 16 / 4000;
			aClass185_Sub3_1600.method15231
			    (aClass124_8928.aClass141_Sub2Array1494[i_3_]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else {
			aClass185_Sub3_1600
			    .method15231(aClass124_8928.aClass141_Sub4_1495);
			OpenGL.glProgramLocalParameter4fARB(34336, 65,
							    aFloat8924, 0.0F,
							    0.0F, 1.0F);
		    }
		} else {
		    if (aClass124_8928.aBool1496)
			aClass185_Sub3_1600
			    .method15231(aClass124_8928.aClass141_Sub4_1495);
		    else
			aClass185_Sub3_1600.method15231
			    (aClass124_8928.aClass141_Sub2Array1494[0]);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		}
	    } else
		aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    if ((i & 0x40) == 0) {
		aFloatArray8929[0] = (aClass185_Sub3_1600.aFloat9646
				      * aClass185_Sub3_1600.aFloat9643);
		aFloatArray8929[1] = (aClass185_Sub3_1600.aFloat9646
				      * aClass185_Sub3_1600.aFloat9644);
		aFloatArray8929[2] = (aClass185_Sub3_1600.aFloat9646
				      * aClass185_Sub3_1600.aFloat9645);
		OpenGL.glProgramLocalParameter4fvARB(34336, 66,
						     aFloatArray8929, 0);
	    } else
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    int i_4_ = i & 0x3;
	    if (i_4_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_4_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    void method2343(Class141 class141, int i) {
	aClass185_Sub3_1600.method15231(class141);
	aClass185_Sub3_1600.method15214(i);
    }
    
    Class136_Sub2(Class185_Sub3 class185_sub3, Class124 class124) {
	super(class185_sub3);
	aClass124_8928 = class124;
	if (aClass185_Sub3_1600.aBool9656
	    && aClass185_Sub3_1600.anInt9682 >= 2) {
	    aClass137_8927
		= (Class137.method2351
		   (aClass185_Sub3_1600, 34336,
		    "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
	    if (aClass137_8927 != null) {
		int[][] is = Class502.method8306(64, 256, 0, 4, 4, 3, 0.4F,
						 false, (byte) -110);
		int[][] is_5_ = Class502.method8306(64, 256, 8, 4, 4, 3, 0.4F,
						    false, (byte) -43);
		int i = 0;
		aFloatArray8920 = new float[32768];
		for (int i_6_ = 0; i_6_ < 256; i_6_++) {
		    int[] is_7_ = is[i_6_];
		    int[] is_8_ = is_5_[i_6_];
		    for (int i_9_ = 0; i_9_ < 64; i_9_++) {
			aFloatArray8920[i++] = (float) is_7_[i_9_] / 4096.0F;
			aFloatArray8920[i++] = (float) is_8_[i_9_] / 4096.0F;
		    }
		}
		method14476();
	    }
	}
    }
    
    boolean method2342() {
	return true;
    }
    
    boolean method2333() {
	return true;
    }
    
    boolean method2334() {
	return true;
    }
    
    void method14471() {
	aClass125_8923 = new Class125(aClass185_Sub3_1600, 2);
	aClass125_8923.method2185(0);
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15235(-16777216);
	aClass185_Sub3_1600.method15232(260, 7681);
	aClass185_Sub3_1600.method15239(0, 34166, 770);
	aClass185_Sub3_1600.method15230(0);
	OpenGL.glBindProgramARB(34336, aClass137_8927.anInt1602);
	OpenGL.glEnable(34336);
	aClass125_8923.method2186();
	aClass125_8923.method2185(1);
	aClass185_Sub3_1600.method15230(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	aClass185_Sub3_1600.method15214(0);
	aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15230(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	aClass125_8923.method2186();
    }
    
    void method14472() {
	aClass125_8923 = new Class125(aClass185_Sub3_1600, 2);
	aClass125_8923.method2185(0);
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15235(-16777216);
	aClass185_Sub3_1600.method15232(260, 7681);
	aClass185_Sub3_1600.method15239(0, 34166, 770);
	aClass185_Sub3_1600.method15230(0);
	OpenGL.glBindProgramARB(34336, aClass137_8927.anInt1602);
	OpenGL.glEnable(34336);
	aClass125_8923.method2186();
	aClass125_8923.method2185(1);
	aClass185_Sub3_1600.method15230(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	aClass185_Sub3_1600.method15214(0);
	aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15230(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	aClass125_8923.method2186();
    }
    
    void method2332(boolean bool) {
	/* empty */
    }
    
    void method2330(int i, int i_10_) {
	if (aClass125_8923 != null) {
	    aClass185_Sub3_1600.method15230(1);
	    if ((i & 0x80) == 0) {
		if ((i_10_ & 0x1) == 1) {
		    if (!aClass124_8928.aBool1496) {
			int i_11_
			    = aClass185_Sub3_1600.anInt9696 % 4000 * 16 / 4000;
			aClass185_Sub3_1600.method15231
			    (aClass124_8928.aClass141_Sub2Array1494[i_11_]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else {
			aClass185_Sub3_1600
			    .method15231(aClass124_8928.aClass141_Sub4_1495);
			OpenGL.glProgramLocalParameter4fARB(34336, 65,
							    aFloat8924, 0.0F,
							    0.0F, 1.0F);
		    }
		} else {
		    if (aClass124_8928.aBool1496)
			aClass185_Sub3_1600
			    .method15231(aClass124_8928.aClass141_Sub4_1495);
		    else
			aClass185_Sub3_1600.method15231
			    (aClass124_8928.aClass141_Sub2Array1494[0]);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		}
	    } else
		aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    if ((i & 0x40) == 0) {
		aFloatArray8929[0] = (aClass185_Sub3_1600.aFloat9646
				      * aClass185_Sub3_1600.aFloat9643);
		aFloatArray8929[1] = (aClass185_Sub3_1600.aFloat9646
				      * aClass185_Sub3_1600.aFloat9644);
		aFloatArray8929[2] = (aClass185_Sub3_1600.aFloat9646
				      * aClass185_Sub3_1600.aFloat9645);
		OpenGL.glProgramLocalParameter4fvARB(34336, 66,
						     aFloatArray8929, 0);
	    } else
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    int i_12_ = i & 0x3;
	    if (i_12_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_12_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    void method14473() {
	aClass125_8923 = new Class125(aClass185_Sub3_1600, 2);
	aClass125_8923.method2185(0);
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15235(-16777216);
	aClass185_Sub3_1600.method15232(260, 7681);
	aClass185_Sub3_1600.method15239(0, 34166, 770);
	aClass185_Sub3_1600.method15230(0);
	OpenGL.glBindProgramARB(34336, aClass137_8927.anInt1602);
	OpenGL.glEnable(34336);
	aClass125_8923.method2186();
	aClass125_8923.method2185(1);
	aClass185_Sub3_1600.method15230(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	aClass185_Sub3_1600.method15214(0);
	aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15230(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	aClass125_8923.method2186();
    }
    
    void method14474() {
	aClass125_8923 = new Class125(aClass185_Sub3_1600, 2);
	aClass125_8923.method2185(0);
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15235(-16777216);
	aClass185_Sub3_1600.method15232(260, 7681);
	aClass185_Sub3_1600.method15239(0, 34166, 770);
	aClass185_Sub3_1600.method15230(0);
	OpenGL.glBindProgramARB(34336, aClass137_8927.anInt1602);
	OpenGL.glEnable(34336);
	aClass125_8923.method2186();
	aClass125_8923.method2185(1);
	aClass185_Sub3_1600.method15230(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	aClass185_Sub3_1600.method15214(0);
	aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15230(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	aClass125_8923.method2186();
    }
    
    void method14475() {
	aClass125_8923 = new Class125(aClass185_Sub3_1600, 2);
	aClass125_8923.method2185(0);
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15235(-16777216);
	aClass185_Sub3_1600.method15232(260, 7681);
	aClass185_Sub3_1600.method15239(0, 34166, 770);
	aClass185_Sub3_1600.method15230(0);
	OpenGL.glBindProgramARB(34336, aClass137_8927.anInt1602);
	OpenGL.glEnable(34336);
	aClass125_8923.method2186();
	aClass125_8923.method2185(1);
	aClass185_Sub3_1600.method15230(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	aClass185_Sub3_1600.method15214(0);
	aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15230(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	aClass125_8923.method2186();
    }
    
    void method2337(boolean bool) {
	if (aClass125_8923 != null) {
	    aClass125_8923.method2184('\0');
	    aClass185_Sub3_1600.method15230(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((aClass185_Sub3_1600.aClass433_9604
				  .aFloatArray4853),
				 0);
	    OpenGL.glMatrixMode(5888);
	    aClass185_Sub3_1600.method15230(0);
	    if (anInt8922 != aClass185_Sub3_1600.anInt9696) {
		int i = aClass185_Sub3_1600.anInt9696 % 5000 * 128 / 5000;
		for (int i_13_ = 0; i_13_ < 64; i_13_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_13_,
							 aFloatArray8920, i);
		    i += 2;
		}
		if (aClass124_8928.aBool1496)
		    aFloat8924 = (float) (aClass185_Sub3_1600.anInt9696
					  % 4000) / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		anInt8922 = aClass185_Sub3_1600.anInt9696;
	    }
	}
    }
    
    void method2338(boolean bool) {
	if (aClass125_8923 != null) {
	    aClass125_8923.method2184('\0');
	    aClass185_Sub3_1600.method15230(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((aClass185_Sub3_1600.aClass433_9604
				  .aFloatArray4853),
				 0);
	    OpenGL.glMatrixMode(5888);
	    aClass185_Sub3_1600.method15230(0);
	    if (anInt8922 != aClass185_Sub3_1600.anInt9696) {
		int i = aClass185_Sub3_1600.anInt9696 % 5000 * 128 / 5000;
		for (int i_14_ = 0; i_14_ < 64; i_14_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_14_,
							 aFloatArray8920, i);
		    i += 2;
		}
		if (aClass124_8928.aBool1496)
		    aFloat8924 = (float) (aClass185_Sub3_1600.anInt9696
					  % 4000) / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		anInt8922 = aClass185_Sub3_1600.anInt9696;
	    }
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
    
    void method2341() {
	if (aClass125_8923 != null) {
	    aClass125_8923.method2184('\001');
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    void method2326() {
	if (aClass125_8923 != null) {
	    aClass125_8923.method2184('\001');
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    void method2335(boolean bool) {
	if (aClass125_8923 != null) {
	    aClass125_8923.method2184('\0');
	    aClass185_Sub3_1600.method15230(1);
	    OpenGL.glMatrixMode(5890);
	    OpenGL.glLoadMatrixf((aClass185_Sub3_1600.aClass433_9604
				  .aFloatArray4853),
				 0);
	    OpenGL.glMatrixMode(5888);
	    aClass185_Sub3_1600.method15230(0);
	    if (anInt8922 != aClass185_Sub3_1600.anInt9696) {
		int i = aClass185_Sub3_1600.anInt9696 % 5000 * 128 / 5000;
		for (int i_15_ = 0; i_15_ < 64; i_15_++) {
		    OpenGL.glProgramLocalParameter4fvARB(34336, i_15_,
							 aFloatArray8920, i);
		    i += 2;
		}
		if (aClass124_8928.aBool1496)
		    aFloat8924 = (float) (aClass185_Sub3_1600.anInt9696
					  % 4000) / 4000.0F;
		else
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		anInt8922 = aClass185_Sub3_1600.anInt9696;
	    }
	}
    }
    
    void method2346(int i, int i_16_) {
	if (aClass125_8923 != null) {
	    aClass185_Sub3_1600.method15230(1);
	    if ((i & 0x80) == 0) {
		if ((i_16_ & 0x1) == 1) {
		    if (!aClass124_8928.aBool1496) {
			int i_17_
			    = aClass185_Sub3_1600.anInt9696 % 4000 * 16 / 4000;
			aClass185_Sub3_1600.method15231
			    (aClass124_8928.aClass141_Sub2Array1494[i_17_]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F,
							    0.0F, 0.0F, 1.0F);
		    } else {
			aClass185_Sub3_1600
			    .method15231(aClass124_8928.aClass141_Sub4_1495);
			OpenGL.glProgramLocalParameter4fARB(34336, 65,
							    aFloat8924, 0.0F,
							    0.0F, 1.0F);
		    }
		} else {
		    if (aClass124_8928.aBool1496)
			aClass185_Sub3_1600
			    .method15231(aClass124_8928.aClass141_Sub4_1495);
		    else
			aClass185_Sub3_1600.method15231
			    (aClass124_8928.aClass141_Sub2Array1494[0]);
		    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F,
							0.0F, 1.0F);
		}
	    } else
		aClass185_Sub3_1600.method15231(null);
	    aClass185_Sub3_1600.method15230(0);
	    if ((i & 0x40) == 0) {
		aFloatArray8929[0] = (aClass185_Sub3_1600.aFloat9646
				      * aClass185_Sub3_1600.aFloat9643);
		aFloatArray8929[1] = (aClass185_Sub3_1600.aFloat9646
				      * aClass185_Sub3_1600.aFloat9644);
		aFloatArray8929[2] = (aClass185_Sub3_1600.aFloat9646
				      * aClass185_Sub3_1600.aFloat9645);
		OpenGL.glProgramLocalParameter4fvARB(34336, 66,
						     aFloatArray8929, 0);
	    } else
		OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F,
						    1.0F, 1.0F);
	    int i_18_ = i & 0x3;
	    if (i_18_ == 2)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F,
						    1.0F, 1.0F);
	    else if (i_18_ == 3)
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F,
						    1.0F, 1.0F);
	    else
		OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F,
						    1.0F, 1.0F);
	}
    }
    
    void method14476() {
	aClass125_8923 = new Class125(aClass185_Sub3_1600, 2);
	aClass125_8923.method2185(0);
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15235(-16777216);
	aClass185_Sub3_1600.method15232(260, 7681);
	aClass185_Sub3_1600.method15239(0, 34166, 770);
	aClass185_Sub3_1600.method15230(0);
	OpenGL.glBindProgramARB(34336, aClass137_8927.anInt1602);
	OpenGL.glEnable(34336);
	aClass125_8923.method2186();
	aClass125_8923.method2185(1);
	aClass185_Sub3_1600.method15230(1);
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
	aClass185_Sub3_1600.method15214(0);
	aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15230(0);
	OpenGL.glBindProgramARB(34336, 0);
	OpenGL.glDisable(34336);
	aClass125_8923.method2186();
    }
    
    void method2348(Class141 class141, int i) {
	aClass185_Sub3_1600.method15231(class141);
	aClass185_Sub3_1600.method15214(i);
    }
}
