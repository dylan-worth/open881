/* TwitchWebcamDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;
import java.util.LinkedList;

public class TwitchWebcamDevice
{
    public String aString1139;
    public String aString1140;
    public int anInt1141;
    public int anInt1142;
    private LinkedList aLinkedList1143 = new LinkedList();
    
    public TwitchWebcamDevice(int i, int i_0_, String string,
			      String string_1_) {
	anInt1141 = i * 457149671;
	anInt1142 = 900858265 * i_0_;
	aString1139 = string;
	aString1140 = string_1_;
    }
    
    public void AddCapability(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
	aLinkedList1143.add(new TwitchWebcamDeviceCapability(i, i_2_, i_3_,
							     i_4_, i_5_));
    }
    
    public TwitchWebcamDeviceCapability method1793(int i) {
	if (i < 0 || i >= aLinkedList1143.size())
	    return null;
	return (TwitchWebcamDeviceCapability) aLinkedList1143.get(i);
    }
    
    public TwitchWebcamDeviceCapability method1794(int i) {
	for (int i_6_ = 0; i_6_ < aLinkedList1143.size(); i_6_++) {
	    if ((((TwitchWebcamDeviceCapability) aLinkedList1143.get(i_6_))
		 .anInt1151) * -1356474957
		== i)
		return ((TwitchWebcamDeviceCapability)
			aLinkedList1143.get(i_6_));
	}
	return null;
    }
    
    public int method1795() {
	return aLinkedList1143.size();
    }
    
    public TwitchWebcamDeviceCapability method1796(int i) {
	if (i < 0 || i >= aLinkedList1143.size())
	    return null;
	return (TwitchWebcamDeviceCapability) aLinkedList1143.get(i);
    }
    
    public TwitchWebcamDeviceCapability method1797(int i) {
	if (i < 0 || i >= aLinkedList1143.size())
	    return null;
	return (TwitchWebcamDeviceCapability) aLinkedList1143.get(i);
    }
    
    public TwitchWebcamDeviceCapability method1798(int i) {
	for (int i_7_ = 0; i_7_ < aLinkedList1143.size(); i_7_++) {
	    if ((((TwitchWebcamDeviceCapability) aLinkedList1143.get(i_7_))
		 .anInt1151) * -1356474957
		== i)
		return ((TwitchWebcamDeviceCapability)
			aLinkedList1143.get(i_7_));
	}
	return null;
    }
    
    public TwitchWebcamDeviceCapability method1799(int i) {
	for (int i_8_ = 0; i_8_ < aLinkedList1143.size(); i_8_++) {
	    if ((((TwitchWebcamDeviceCapability) aLinkedList1143.get(i_8_))
		 .anInt1151) * -1356474957
		== i)
		return ((TwitchWebcamDeviceCapability)
			aLinkedList1143.get(i_8_));
	}
	return null;
    }
}
