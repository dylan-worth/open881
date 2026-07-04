/* Class327_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Class327_Sub1 extends Class327
{
    Font aFont9987;
    Class297 this$0;
    FontMetrics aFontMetrics9988;
    Color aColor9989;
    boolean aBool9990;
    static int anInt9991;
    
    void method5821(Graphics graphics, byte i) {
	String string;
	if (aBool9990)
	    string = this$0.aString3165;
	else
	    string = new StringBuilder().append(this$0.aString3168).append
			 (" ").append
			 (this$0.aString3165).toString();
	graphics.setFont(aFont9987);
	graphics.setColor(aColor9989);
	graphics.drawString(string,
			    (this$0.method5336(aFontMetrics9988
						   .stringWidth(string),
					       (byte) 16)
			     + anInt3460 * 1573756589),
			    (this$0.method5332(0, -1132232952)
			     + anInt3459 * -1031843439));
    }
    
    void method5825(Graphics graphics) {
	String string;
	if (aBool9990)
	    string = this$0.aString3165;
	else
	    string = new StringBuilder().append(this$0.aString3168).append
			 (" ").append
			 (this$0.aString3165).toString();
	graphics.setFont(aFont9987);
	graphics.setColor(aColor9989);
	graphics.drawString(string,
			    (this$0.method5336(aFontMetrics9988
						   .stringWidth(string),
					       (byte) 109)
			     + anInt3460 * 1573756589),
			    (this$0.method5332(0, -1132232952)
			     + anInt3459 * -1031843439));
    }
    
    void method5824(Graphics graphics) {
	String string;
	if (aBool9990)
	    string = this$0.aString3165;
	else
	    string = new StringBuilder().append(this$0.aString3168).append
			 (" ").append
			 (this$0.aString3165).toString();
	graphics.setFont(aFont9987);
	graphics.setColor(aColor9989);
	graphics.drawString(string,
			    (this$0.method5336(aFontMetrics9988
						   .stringWidth(string),
					       (byte) 43)
			     + anInt3460 * 1573756589),
			    (this$0.method5332(0, -1132232952)
			     + anInt3459 * -1031843439));
    }
    
    void method5823(Graphics graphics) {
	String string;
	if (aBool9990)
	    string = this$0.aString3165;
	else
	    string = new StringBuilder().append(this$0.aString3168).append
			 (" ").append
			 (this$0.aString3165).toString();
	graphics.setFont(aFont9987);
	graphics.setColor(aColor9989);
	graphics.drawString(string,
			    (this$0.method5336(aFontMetrics9988
						   .stringWidth(string),
					       (byte) 111)
			     + anInt3460 * 1573756589),
			    (this$0.method5332(0, -1132232952)
			     + anInt3459 * -1031843439));
    }
    
    void method5822(Graphics graphics) {
	String string;
	if (aBool9990)
	    string = this$0.aString3165;
	else
	    string = new StringBuilder().append(this$0.aString3168).append
			 (" ").append
			 (this$0.aString3165).toString();
	graphics.setFont(aFont9987);
	graphics.setColor(aColor9989);
	graphics.drawString(string,
			    (this$0.method5336(aFontMetrics9988
						   .stringWidth(string),
					       (byte) 59)
			     + anInt3460 * 1573756589),
			    (this$0.method5332(0, -1132232952)
			     + anInt3459 * -1031843439));
    }
    
    Class327_Sub1(Class297 class297, boolean bool, String string, int i,
		  int i_0_, int i_1_, int i_2_) {
	super(class297, i_1_, i_2_);
	this$0 = class297;
	aBool9990 = bool;
	aFont9987 = new Font(string, 0, i);
	aFontMetrics9988 = Class464.aCanvas5111.getFontMetrics(aFont9987);
	aColor9989 = new Color(i_0_);
    }
    
    void method5820(Graphics graphics) {
	String string;
	if (aBool9990)
	    string = this$0.aString3165;
	else
	    string = new StringBuilder().append(this$0.aString3168).append
			 (" ").append
			 (this$0.aString3165).toString();
	graphics.setFont(aFont9987);
	graphics.setColor(aColor9989);
	graphics.drawString(string,
			    (this$0.method5336(aFontMetrics9988
						   .stringWidth(string),
					       (byte) 33)
			     + anInt3460 * 1573756589),
			    (this$0.method5332(0, -1132232952)
			     + anInt3459 * -1031843439));
    }
}
