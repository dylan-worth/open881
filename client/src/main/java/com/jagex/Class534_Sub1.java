/* Class534_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public abstract class Class534_Sub1 extends Class534
{
    abstract void method16011(Class534_Sub26 class534_sub26, int i);
    
    abstract void method16012(Class534_Sub40 class534_sub40, int i);
    
    abstract void method16013(Class534_Sub26 class534_sub26);
    
    abstract void method16014(Class534_Sub40 class534_sub40);
    
    abstract void method16015(Class534_Sub26 class534_sub26);
    
    Class534_Sub1() {
	/* empty */
    }
    
    static final void method16016(Class669 class669, int i) {
	String string = "";
	if (Class118.aClipboard1421 != null) {
	    Transferable transferable
		= Class118.aClipboard1421.getContents(null);
	    if (null != transferable) {
		try {
		    string
			= (String) transferable.getTransferData(DataFlavor
								.stringFlavor);
		    if (string == null)
			string = "";
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	}
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = string;
    }
    
    static final void method16017(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class100.method1886(class247, class243, class669, (byte) -67);
    }
}
