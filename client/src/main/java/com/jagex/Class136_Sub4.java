/* Class136_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import jaggl.OpenGL;

public class Class136_Sub4 extends Class136
{
    static float[] aFloatArray8936 = { 0.0F, -1.0F, 0.0F, 0.0F };
    Class137 aClass137_8937;
    static final String aString8938
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
    boolean aBool8939 = false;
    boolean aBool8940;
    static final String aString8941
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
    boolean aBool8942;
    static final String aString8943
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
    Class141_Sub2 aClass141_Sub2_8944;
    Class137 aClass137_8945;
    Class137 aClass137_8946;
    static final String aString8947
	= "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
    boolean aBool8948;
    Class137 aClass137_8949;
    
    void method2331(int i, int i_0_) {
	/* empty */
    }
    
    boolean method2347() {
	return aBool8940;
    }
    
    void method2340(boolean bool) {
	/* empty */
    }
    
    boolean method2342() {
	return aBool8940;
    }
    
    void method2327() {
	if (aBool8948) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    aBool8948 = false;
	}
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15231(null);
	aClass185_Sub3_1600.method15232(8448, 8448);
	aClass185_Sub3_1600.method15325(0, 5890, 768);
	aClass185_Sub3_1600.method15325(2, 34166, 770);
	aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15230(0);
	if (aBool8939) {
	    aClass185_Sub3_1600.method15325(0, 5890, 768);
	    aClass185_Sub3_1600.method15239(0, 5890, 770);
	    aBool8939 = false;
	}
    }
    
    void method2344(boolean bool) {
	aBool8942 = bool;
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15231(aClass141_Sub2_8944);
	aClass185_Sub3_1600.method15232(34165, 7681);
	aClass185_Sub3_1600.method15325(0, 34166, 768);
	aClass185_Sub3_1600.method15325(2, 5890, 770);
	aClass185_Sub3_1600.method15239(0, 34168, 770);
	aClass185_Sub3_1600.method15230(0);
	method14478();
    }
    
    void method14477() {
	if (aBool8948) {
	    float f = aClass185_Sub3_1600.aFloat9617;
	    float f_1_ = aClass185_Sub3_1600.aFloat9616;
	    float f_2_ = f - (f - f_1_) * 0.125F;
	    float f_3_ = f - (f - f_1_) * 0.25F;
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_3_, f_2_,
		 256.0F / (float) (aClass185_Sub3_1600.aClass166_9665.anInt1762
				   * -1095140607),
		 (float) (aClass185_Sub3_1600.aClass166_9665.anInt1764
			  * 1446227271) / 255.0F);
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15235((aClass185_Sub3_1600.aClass166_9665
					     .anInt1763) * 2113275141);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    Class136_Sub4(Class185_Sub3 class185_sub3) {
	super(class185_sub3);
	if (aClass185_Sub3_1600.aBool9656) {
	    aClass137_8949
		= (Class137.method2351
		   (aClass185_Sub3_1600, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
	    aClass137_8937
		= (Class137.method2351
		   (aClass185_Sub3_1600, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
	    aClass137_8946
		= (Class137.method2351
		   (aClass185_Sub3_1600, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
	    aClass137_8945
		= (Class137.method2351
		   (aClass185_Sub3_1600, 34336,
		    "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
	    if (aClass137_8949 != null & aClass137_8937 != null
		& aClass137_8946 != null & aClass137_8945 != null) {
		aClass141_Sub2_8944
		    = new Class141_Sub2(class185_sub3, 3553,
					Class181.aClass181_1951,
					Class173.aClass173_1830, 2, 1, false,
					new byte[] { 0, -1 },
					Class181.aClass181_1951, false);
		aClass141_Sub2_8944.method14454(false, false);
		aBool8940 = true;
	    } else
		aBool8940 = false;
	} else
	    aBool8940 = false;
    }
    
    void method2329(boolean bool) {
	/* empty */
    }
    
    void method2328(boolean bool) {
	aBool8942 = bool;
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15231(aClass141_Sub2_8944);
	aClass185_Sub3_1600.method15232(34165, 7681);
	aClass185_Sub3_1600.method15325(0, 34166, 768);
	aClass185_Sub3_1600.method15325(2, 5890, 770);
	aClass185_Sub3_1600.method15239(0, 34168, 770);
	aClass185_Sub3_1600.method15230(0);
	method14478();
    }
    
    boolean method2333() {
	return aBool8940;
    }
    
    void method14478() {
	Class433 class433 = aClass185_Sub3_1600.aClass433_9533;
	if (aBool8942)
	    OpenGL.glBindProgramARB(34336, ((aClass185_Sub3_1600.anInt9664
					     == 2147483647)
					    ? aClass137_8937.anInt1602
					    : aClass137_8945.anInt1602));
	else
	    OpenGL.glBindProgramARB(34336, ((aClass185_Sub3_1600.anInt9664
					     == 2147483647)
					    ? aClass137_8949.anInt1602
					    : aClass137_8946.anInt1602));
	float f = (float) aClass185_Sub3_1600.anInt9664;
	float f_4_
	    = class433.aFloatArray4853[4] * f + class433.aFloatArray4853[12];
	float f_5_
	    = class433.aFloatArray4853[5] * f + class433.aFloatArray4853[13];
	float f_6_
	    = class433.aFloatArray4853[6] * f + class433.aFloatArray4853[14];
	aFloatArray8936[0] = -class433.aFloatArray4853[4];
	aFloatArray8936[1] = -class433.aFloatArray4853[5];
	aFloatArray8936[2] = -class433.aFloatArray4853[6];
	aFloatArray8936[3]
	    = -(aFloatArray8936[0] * f_4_ + aFloatArray8936[1] * f_5_
		+ aFloatArray8936[2] * f_6_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8936[0],
					    aFloatArray8936[1],
					    aFloatArray8936[2],
					    aFloatArray8936[3]);
	OpenGL.glEnable(34336);
	aBool8948 = true;
	method14477();
    }
    
    void method2335(boolean bool) {
	aBool8942 = bool;
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15231(aClass141_Sub2_8944);
	aClass185_Sub3_1600.method15232(34165, 7681);
	aClass185_Sub3_1600.method15325(0, 34166, 768);
	aClass185_Sub3_1600.method15325(2, 5890, 770);
	aClass185_Sub3_1600.method15239(0, 34168, 770);
	aClass185_Sub3_1600.method15230(0);
	method14478();
    }
    
    void method14479() {
	Class433 class433 = aClass185_Sub3_1600.aClass433_9533;
	if (aBool8942)
	    OpenGL.glBindProgramARB(34336, ((aClass185_Sub3_1600.anInt9664
					     == 2147483647)
					    ? aClass137_8937.anInt1602
					    : aClass137_8945.anInt1602));
	else
	    OpenGL.glBindProgramARB(34336, ((aClass185_Sub3_1600.anInt9664
					     == 2147483647)
					    ? aClass137_8949.anInt1602
					    : aClass137_8946.anInt1602));
	float f = (float) aClass185_Sub3_1600.anInt9664;
	float f_7_
	    = class433.aFloatArray4853[4] * f + class433.aFloatArray4853[12];
	float f_8_
	    = class433.aFloatArray4853[5] * f + class433.aFloatArray4853[13];
	float f_9_
	    = class433.aFloatArray4853[6] * f + class433.aFloatArray4853[14];
	aFloatArray8936[0] = -class433.aFloatArray4853[4];
	aFloatArray8936[1] = -class433.aFloatArray4853[5];
	aFloatArray8936[2] = -class433.aFloatArray4853[6];
	aFloatArray8936[3]
	    = -(aFloatArray8936[0] * f_7_ + aFloatArray8936[1] * f_8_
		+ aFloatArray8936[2] * f_9_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8936[0],
					    aFloatArray8936[1],
					    aFloatArray8936[2],
					    aFloatArray8936[3]);
	OpenGL.glEnable(34336);
	aBool8948 = true;
	method14477();
    }
    
    void method2337(boolean bool) {
	aBool8942 = bool;
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15231(aClass141_Sub2_8944);
	aClass185_Sub3_1600.method15232(34165, 7681);
	aClass185_Sub3_1600.method15325(0, 34166, 768);
	aClass185_Sub3_1600.method15325(2, 5890, 770);
	aClass185_Sub3_1600.method15239(0, 34168, 770);
	aClass185_Sub3_1600.method15230(0);
	method14478();
    }
    
    void method2338(boolean bool) {
	aBool8942 = bool;
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15231(aClass141_Sub2_8944);
	aClass185_Sub3_1600.method15232(34165, 7681);
	aClass185_Sub3_1600.method15325(0, 34166, 768);
	aClass185_Sub3_1600.method15325(2, 5890, 770);
	aClass185_Sub3_1600.method15239(0, 34168, 770);
	aClass185_Sub3_1600.method15230(0);
	method14478();
    }
    
    boolean method2334() {
	return aBool8940;
    }
    
    void method2330(int i, int i_10_) {
	/* empty */
    }
    
    void method2336(boolean bool) {
	/* empty */
    }
    
    void method2332(boolean bool) {
	/* empty */
    }
    
    void method2341() {
	if (aBool8948) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    aBool8948 = false;
	}
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15231(null);
	aClass185_Sub3_1600.method15232(8448, 8448);
	aClass185_Sub3_1600.method15325(0, 5890, 768);
	aClass185_Sub3_1600.method15325(2, 34166, 770);
	aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15230(0);
	if (aBool8939) {
	    aClass185_Sub3_1600.method15325(0, 5890, 768);
	    aClass185_Sub3_1600.method15239(0, 5890, 770);
	    aBool8939 = false;
	}
    }
    
    void method2326() {
	if (aBool8948) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    aBool8948 = false;
	}
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15231(null);
	aClass185_Sub3_1600.method15232(8448, 8448);
	aClass185_Sub3_1600.method15325(0, 5890, 768);
	aClass185_Sub3_1600.method15325(2, 34166, 770);
	aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15230(0);
	if (aBool8939) {
	    aClass185_Sub3_1600.method15325(0, 5890, 768);
	    aClass185_Sub3_1600.method15239(0, 5890, 770);
	    aBool8939 = false;
	}
    }
    
    void method2345() {
	if (aBool8948) {
	    OpenGL.glBindProgramARB(34336, 0);
	    OpenGL.glDisable(34820);
	    OpenGL.glDisable(34336);
	    aBool8948 = false;
	}
	aClass185_Sub3_1600.method15230(1);
	aClass185_Sub3_1600.method15231(null);
	aClass185_Sub3_1600.method15232(8448, 8448);
	aClass185_Sub3_1600.method15325(0, 5890, 768);
	aClass185_Sub3_1600.method15325(2, 34166, 770);
	aClass185_Sub3_1600.method15239(0, 5890, 770);
	aClass185_Sub3_1600.method15230(0);
	if (aBool8939) {
	    aClass185_Sub3_1600.method15325(0, 5890, 768);
	    aClass185_Sub3_1600.method15239(0, 5890, 770);
	    aBool8939 = false;
	}
    }
    
    void method2346(int i, int i_11_) {
	/* empty */
    }
    
    void method2343(Class141 class141, int i) {
	if (class141 == null) {
	    if (!aBool8939) {
		aClass185_Sub3_1600
		    .method15231(aClass185_Sub3_1600.aClass141_Sub2_9528);
		aClass185_Sub3_1600.method15214(1);
		aClass185_Sub3_1600.method15325(0, 34168, 768);
		aClass185_Sub3_1600.method15239(0, 34168, 770);
		aBool8939 = true;
	    }
	} else {
	    if (aBool8939) {
		aClass185_Sub3_1600.method15325(0, 5890, 768);
		aClass185_Sub3_1600.method15239(0, 5890, 770);
		aBool8939 = false;
	    }
	    aClass185_Sub3_1600.method15231(class141);
	    aClass185_Sub3_1600.method15214(i);
	}
    }
    
    void method2348(Class141 class141, int i) {
	if (class141 == null) {
	    if (!aBool8939) {
		aClass185_Sub3_1600
		    .method15231(aClass185_Sub3_1600.aClass141_Sub2_9528);
		aClass185_Sub3_1600.method15214(1);
		aClass185_Sub3_1600.method15325(0, 34168, 768);
		aClass185_Sub3_1600.method15239(0, 34168, 770);
		aBool8939 = true;
	    }
	} else {
	    if (aBool8939) {
		aClass185_Sub3_1600.method15325(0, 5890, 768);
		aClass185_Sub3_1600.method15239(0, 5890, 770);
		aBool8939 = false;
	    }
	    aClass185_Sub3_1600.method15231(class141);
	    aClass185_Sub3_1600.method15214(i);
	}
    }
    
    void method14480() {
	Class433 class433 = aClass185_Sub3_1600.aClass433_9533;
	if (aBool8942)
	    OpenGL.glBindProgramARB(34336, ((aClass185_Sub3_1600.anInt9664
					     == 2147483647)
					    ? aClass137_8937.anInt1602
					    : aClass137_8945.anInt1602));
	else
	    OpenGL.glBindProgramARB(34336, ((aClass185_Sub3_1600.anInt9664
					     == 2147483647)
					    ? aClass137_8949.anInt1602
					    : aClass137_8946.anInt1602));
	float f = (float) aClass185_Sub3_1600.anInt9664;
	float f_12_
	    = class433.aFloatArray4853[4] * f + class433.aFloatArray4853[12];
	float f_13_
	    = class433.aFloatArray4853[5] * f + class433.aFloatArray4853[13];
	float f_14_
	    = class433.aFloatArray4853[6] * f + class433.aFloatArray4853[14];
	aFloatArray8936[0] = -class433.aFloatArray4853[4];
	aFloatArray8936[1] = -class433.aFloatArray4853[5];
	aFloatArray8936[2] = -class433.aFloatArray4853[6];
	aFloatArray8936[3]
	    = -(aFloatArray8936[0] * f_12_ + aFloatArray8936[1] * f_13_
		+ aFloatArray8936[2] * f_14_);
	OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray8936[0],
					    aFloatArray8936[1],
					    aFloatArray8936[2],
					    aFloatArray8936[3]);
	OpenGL.glEnable(34336);
	aBool8948 = true;
	method14477();
    }
    
    void method2339(boolean bool) {
	/* empty */
    }
    
    void method14481() {
	if (aBool8948) {
	    float f = aClass185_Sub3_1600.aFloat9617;
	    float f_15_ = aClass185_Sub3_1600.aFloat9616;
	    float f_16_ = f - (f - f_15_) * 0.125F;
	    float f_17_ = f - (f - f_15_) * 0.25F;
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_17_, f_16_,
		 256.0F / (float) (aClass185_Sub3_1600.aClass166_9665.anInt1762
				   * -1095140607),
		 (float) (aClass185_Sub3_1600.aClass166_9665.anInt1764
			  * 1446227271) / 255.0F);
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15235((aClass185_Sub3_1600.aClass166_9665
					     .anInt1763) * 2113275141);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
    
    void method14482() {
	if (aBool8948) {
	    float f = aClass185_Sub3_1600.aFloat9617;
	    float f_18_ = aClass185_Sub3_1600.aFloat9616;
	    float f_19_ = f - (f - f_18_) * 0.125F;
	    float f_20_ = f - (f - f_18_) * 0.25F;
	    OpenGL.glProgramLocalParameter4fARB
		(34336, 0, f_20_, f_19_,
		 256.0F / (float) (aClass185_Sub3_1600.aClass166_9665.anInt1762
				   * -1095140607),
		 (float) (aClass185_Sub3_1600.aClass166_9665.anInt1764
			  * 1446227271) / 255.0F);
	    aClass185_Sub3_1600.method15230(1);
	    aClass185_Sub3_1600.method15235((aClass185_Sub3_1600.aClass166_9665
					     .anInt1763) * 2113275141);
	    aClass185_Sub3_1600.method15230(0);
	}
    }
}
