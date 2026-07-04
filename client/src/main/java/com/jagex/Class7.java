/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class7
{
    public Object anObject58;
    public Object anObject59;
    
    public String method567() {
	return new StringBuilder().append(anObject58).append(", ").append
		   (anObject59).toString();
    }
    
    public String toString() {
	return new StringBuilder().append(anObject58).append(", ").append
		   (anObject59).toString();
    }
    
    public Class7(Object object, Object object_0_) {
	anObject58 = object;
	anObject59 = object_0_;
    }
    
    public int hashCode() {
	int i = 0;
	if (anObject58 != null)
	    i += anObject58.hashCode();
	if (anObject59 != null)
	    i += 31 * anObject59.hashCode();
	return i;
    }
    
    public boolean method568(Object object) {
	if (object == null || !(object instanceof Class7))
	    return false;
	Class7 class7_1_ = (Class7) object;
	if (anObject58 == null) {
	    if (class7_1_.anObject58 != null)
		return false;
	} else if (!anObject58.equals(class7_1_.anObject58))
	    return false;
	if (anObject59 == null) {
	    if (class7_1_.anObject59 != null)
		return false;
	} else if (!anObject59.equals(class7_1_.anObject59))
	    return false;
	return true;
    }
    
    public boolean method569(Object object) {
	if (object == null || !(object instanceof Class7))
	    return false;
	Class7 class7_2_ = (Class7) object;
	if (anObject58 == null) {
	    if (class7_2_.anObject58 != null)
		return false;
	} else if (!anObject58.equals(class7_2_.anObject58))
	    return false;
	if (anObject59 == null) {
	    if (class7_2_.anObject59 != null)
		return false;
	} else if (!anObject59.equals(class7_2_.anObject59))
	    return false;
	return true;
    }
    
    public boolean equals(Object object) {
	if (object == null || !(object instanceof Class7))
	    return false;
	Class7 class7_3_ = (Class7) object;
	if (anObject58 == null) {
	    if (class7_3_.anObject58 != null)
		return false;
	} else if (!anObject58.equals(class7_3_.anObject58))
	    return false;
	if (anObject59 == null) {
	    if (class7_3_.anObject59 != null)
		return false;
	} else if (!anObject59.equals(class7_3_.anObject59))
	    return false;
	return true;
    }
    
    public boolean method570(Object object) {
	if (object == null || !(object instanceof Class7))
	    return false;
	Class7 class7_4_ = (Class7) object;
	if (anObject58 == null) {
	    if (class7_4_.anObject58 != null)
		return false;
	} else if (!anObject58.equals(class7_4_.anObject58))
	    return false;
	if (anObject59 == null) {
	    if (class7_4_.anObject59 != null)
		return false;
	} else if (!anObject59.equals(class7_4_.anObject59))
	    return false;
	return true;
    }
    
    public int method571() {
	int i = 0;
	if (anObject58 != null)
	    i += anObject58.hashCode();
	if (anObject59 != null)
	    i += 31 * anObject59.hashCode();
	return i;
    }
    
    public boolean method572(Object object) {
	if (object == null || !(object instanceof Class7))
	    return false;
	Class7 class7_5_ = (Class7) object;
	if (anObject58 == null) {
	    if (class7_5_.anObject58 != null)
		return false;
	} else if (!anObject58.equals(class7_5_.anObject58))
	    return false;
	if (anObject59 == null) {
	    if (class7_5_.anObject59 != null)
		return false;
	} else if (!anObject59.equals(class7_5_.anObject59))
	    return false;
	return true;
    }
    
    public String method573() {
	return new StringBuilder().append(anObject58).append(", ").append
		   (anObject59).toString();
    }
}
