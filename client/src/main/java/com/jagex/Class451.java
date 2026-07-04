/* Class451 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchWebcamFrameData;

public abstract class Class451
{
    abstract int method7371(int i);
    
    abstract byte[] method7372(int i);
    
    abstract byte[] method7373(int i, int i_0_);
    
    abstract void method7374(int i, int i_1_);
    
    abstract int method7375(int i, int i_2_);
    
    Class451() {
	/* empty */
    }
    
    abstract Class462 method7376();
    
    abstract void method7377(int i);
    
    abstract void method7378(int i);
    
    abstract void method7379(int i);
    
    abstract void method7380(int i);
    
    abstract void method7381(int i);
    
    abstract int method7382(int i);
    
    abstract int method7383(int i);
    
    abstract byte[] method7384(int i);
    
    abstract Class462 method7385(int i);
    
    abstract Class462 method7386();
    
    public static int method7387(int i, int i_3_, int i_4_) {
	Class574.aTwitchWebcamFrameData7700 = new TwitchWebcamFrameData();
	if (i < 0 || i >= Class574.aTwitchWebcamDeviceArray7704.length)
	    return -1;
	return (Class523.aTwitchTV7088.StartWebcamDevice
		((-455097687
		  * Class574.aTwitchWebcamDeviceArray7704[i].anInt1142),
		 i_3_));
    }
    
    static void method7388(int i) {
	Class574.aTwitchWebcamDeviceArray7704
	    = Class523.aTwitchTV7088.GetWebcamDevices();
    }
    
    static final void method7389(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
}
