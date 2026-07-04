/* Class228 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;

public class Class228 implements Interface28
{
    Class213 this$0;
    int anInt2320;
    static Process aProcess2321;
    static File aFile2322;
    
    Class228(Class213 class213, Class534_Sub40 class534_sub40) {
	this$0 = class213;
	anInt2320 = class534_sub40.method16529((byte) 1) * -1828033981;
    }
    
    public void method172(Class214 class214) {
	Class212 class212
	    = class214.method4044(anInt2320 * -1417563541, 1481307617);
	class212.method3998((byte) -38);
	class212.method3979(995477553);
	class214.method4039(-1417563541 * anInt2320, (byte) 16);
    }
    
    public void method173(Class214 class214, int i) {
	Class212 class212
	    = class214.method4044(anInt2320 * -1417563541, 1481307617);
	class212.method3998((byte) -61);
	class212.method3979(995477553);
	class214.method4039(-1417563541 * anInt2320, (byte) 40);
    }
    
    public void method174(Class214 class214) {
	Class212 class212
	    = class214.method4044(anInt2320 * -1417563541, 1481307617);
	class212.method3998((byte) -108);
	class212.method3979(995477553);
	class214.method4039(-1417563541 * anInt2320, (byte) -12);
    }
    
    public static boolean method4188(int i) {
	return (null != Class523.aTwitchTV7088
		&& Class523.aTwitchTV7088.IsStreaming());
    }
    
    public static int method4189(byte i) {
	return 10;
    }
    
    static Class534_Sub18_Sub8 method4190(int i, int i_0_) {
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = ((Class534_Sub18_Sub8)
	       Class662.aClass199_8552.method3838((long) i));
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	byte[] is = Class294.aClass472_3158.method7743(i, 0, -1730557312);
	if (null == is || is.length <= 1)
	    return null;
	try {
	    class534_sub18_sub8 = Class275.method5148(is, (byte) -104);
	} catch (Exception exception) {
	    throw new RuntimeException(new StringBuilder().append
					   (exception.getMessage()).append
					   (" ").append
					   (i).toString());
	}
	Class662.aClass199_8552.method3834(class534_sub18_sub8, (long) i);
	return class534_sub18_sub8;
    }
    
    public static void method4191(Class472 class472, Class472 class472_1_,
				  int i, byte i_2_) {
	Class534_Sub18_Sub17.aClass472_11874 = class472;
	Class534_Sub18_Sub17.aClass472_11873 = class472_1_;
    }
}
