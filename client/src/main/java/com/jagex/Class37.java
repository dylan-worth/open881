/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.math.BigInteger;

import com.RS3Applet;

public class Class37
{
    public static BigInteger LOGIN_EXPONENT;
    static BigInteger RSA_UPDATE_EXPONENT = new BigInteger("10001", 16);
    static BigInteger LOGIN_MODULUS
	= (new BigInteger
	   ("e585d168576d0ce0eb2e906c9a65efccbbb9ecb938afcc5948d078fc447f87454fcdfd1f049ad9ae72af13592e82b2e2756385e6cc86d14aef1b9d8eb06e527f7ba32c9edc7a5a6b6a0ea29b021d075637fe7e47a7b80ca6f390689a34e5e541627498eb7fe8b3ee01beae2af2bc2c96be64d4f12691cfb0e18ec0ac160d4f39",
	    16));
    public static BigInteger RSA_UPDATE_MODULUS;
    
    static {
	LOGIN_EXPONENT = new BigInteger("10001", 16);
	RSA_UPDATE_MODULUS
	    = (new BigInteger
	       ("8837144a026b53054ec467c2bf76f829af8c0b7cddb8f73f6f525d5d5ee6e1b1f5256db28a599fe9df1ab167c39bc24ca4885c2baf4000368816ca7635c6cab8a6156fe5e29896a109eb186d788e1cad326d9a5effee958478ece6b9e8572bc29f0b2b1801aef161f557dc7293446bc630959d8ade1b7ab04194fa3668bcf85374a1c23614563b8c2509ff00a3a2c25b67697fa2d0a8bac48c507b0c35db2fe11f13f12c35b03ad8e2da3b6de78bdc9eca18ce03fa96ba4f855b45210f1f5d23023c2502dac8b5aeb2230cfeeb57c65694cf72367ca6dd4aec017ef116340446968b7320fb985c9302f8a1e7cf30d4c68eb87e8832741d8bff109b17f8fab2fd184bfaf13857f11d09841d3c6b186bce05933455e9875aa554964b26d7c03b2d955af57f0bf7751cfa72f435cf70f3d39a887d852d168018744086bd39d892793b79cf6597530a7eac8dfaba0de0c0228bdffb564a6620210d0f6033a6ca049692d0f07a785be81dc4c147844022bcd0e79cd43f1039e30efaebed5ebda63e4f66a47932daee7e8631c56be4ff858b2710b6d6efcddcd0227d255e6dae4fda365714142cc0767fdead60946cbf2988b0e14d69471150553b05203756e91328eb2042f15a83ee748ecc3656c4eac06da2ed63d576c36092c62a7b1e50b906960e8b079966150533f18145835c44f1bb2def5c1e7b5e8b6c3f2f14248a9d6ad9ff",
		16));
	new BigInteger("10001", 16);
	new BigInteger
	    ("831ec4b42c06f50a088c8d60a8fb81e2ffe4f578cf6ceb3110950fc4c186a29498012c4d0a80d249086c6285d59b1bff1db21ec7997436c5e59bafd1cead6d0d",
	     16);
	if (RS3Applet.RSPS) {
		RSA_UPDATE_EXPONENT = LOGIN_EXPONENT = new BigInteger("65537");
		RSA_UPDATE_MODULUS = LOGIN_MODULUS = new BigInteger(
				"95305194767850974840103983940267024795749991579650398593493870931689362760682041822914062053633629193374284299157902994866428208434042199783051419035729574522638505046108197434961442310669515100161855022896204697879642022586791526306610658720167681911962906640708141617279449921344589738448663517044898554277");
	}
    }
    
    Class37() throws Throwable {
	throw new Error();
    }
    
    static final void method939(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
		  .method16935(-1807368365);
    }
    
    static final void method940(Class669 class669, byte i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub1_10762
		  .method14026(i_0_, -2024064741);
    }
    
    static final void method941(Class669 class669, byte i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) (Math.random() * (double) (1 + i_1_));
    }
    
    static final void method942(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    static void method943(int i, int i_2_, byte i_3_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(7, (long) i);
	class534_sub18_sub6.method18121(569569418);
	class534_sub18_sub6.anInt11666 = i_2_ * 517206857;
    }
}
