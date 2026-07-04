/* Class567 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;
import java.io.IOException;

public final class Class567
{
    int anInt7590;
    Class38 aClass38_7591 = null;
    Class38 aClass38_7592 = null;
    int anInt7593 = -350737752;
    static byte[] aByteArray7594 = new byte[520];
    public static int anInt7595;
    
    public boolean method9546(int i, byte[] is, int i_0_) {
	synchronized (aClass38_7591) {
	    if (i_0_ < 0 || i_0_ > anInt7593 * 456995017)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("").append
						       (-1673477361
							* anInt7590)
						       .append
						       (',').append
						       (i).append
						       (',').append
						       (i_0_).toString());
	    boolean bool = method9548(i, is, i_0_, true, 1891606247);
	    if (!bool)
		bool = method9548(i, is, i_0_, false, 303198982);
	    boolean bool_1_ = bool;
	    return bool_1_;
	}
    }
    
    public byte[] method9547(int i, int i_2_) {
	synchronized (aClass38_7591) {
	    byte[] is;
	    try {
		if (aClass38_7592.method964((byte) -125)
		    < (long) (6 + 6 * i)) {
		    byte[] is_3_ = null;
		    return is_3_;
		}
		aClass38_7592.method947((long) (6 * i));
		aClass38_7592.method949(aByteArray7594, 0, 6, -648000292);
		int i_4_ = (((aByteArray7594[0] & 0xff) << 16)
			    + ((aByteArray7594[1] & 0xff) << 8)
			    + (aByteArray7594[2] & 0xff));
		int i_5_ = ((aByteArray7594[5] & 0xff)
			    + (((aByteArray7594[3] & 0xff) << 16)
			       + ((aByteArray7594[4] & 0xff) << 8)));
		if (i_4_ < 0 || i_4_ > 456995017 * anInt7593) {
		    byte[] is_6_ = null;
		    return is_6_;
		}
		if (i_5_ <= 0
		    || ((long) i_5_
			> aClass38_7591.method964((byte) -127) / 520L)) {
		    byte[] is_7_ = null;
		    return is_7_;
		}
		byte[] is_8_ = new byte[i_4_];
		int i_9_ = 0;
		int i_10_ = 0;
		while (i_9_ < i_4_) {
		    if (0 == i_5_) {
			byte[] is_11_ = null;
			return is_11_;
		    }
		    aClass38_7591.method947(520L * (long) i_5_);
		    int i_12_ = i_4_ - i_9_;
		    int i_13_;
		    int i_14_;
		    int i_15_;
		    int i_16_;
		    int i_17_;
		    if (i > 65535) {
			if (i_12_ > 510)
			    i_12_ = 510;
			i_13_ = 10;
			aClass38_7591.method949(aByteArray7594, 0,
						i_12_ + i_13_, -648000292);
			i_14_ = (((aByteArray7594[0] & 0xff) << 24)
				 + ((aByteArray7594[1] & 0xff) << 16)
				 + ((aByteArray7594[2] & 0xff) << 8)
				 + (aByteArray7594[3] & 0xff));
			i_15_ = (((aByteArray7594[4] & 0xff) << 8)
				 + (aByteArray7594[5] & 0xff));
			i_16_ = (((aByteArray7594[7] & 0xff) << 8)
				 + ((aByteArray7594[6] & 0xff) << 16)
				 + (aByteArray7594[8] & 0xff));
			i_17_ = aByteArray7594[9] & 0xff;
		    } else {
			if (i_12_ > 512)
			    i_12_ = 512;
			i_13_ = 8;
			aClass38_7591.method949(aByteArray7594, 0,
						i_12_ + i_13_, -648000292);
			i_14_ = ((aByteArray7594[1] & 0xff)
				 + ((aByteArray7594[0] & 0xff) << 8));
			i_15_ = ((aByteArray7594[3] & 0xff)
				 + ((aByteArray7594[2] & 0xff) << 8));
			i_16_ = (((aByteArray7594[4] & 0xff) << 16)
				 + ((aByteArray7594[5] & 0xff) << 8)
				 + (aByteArray7594[6] & 0xff));
			i_17_ = aByteArray7594[7] & 0xff;
		    }
		    if (i_14_ != i || i_15_ != i_10_
			|| anInt7590 * -1673477361 != i_17_) {
			byte[] is_18_ = null;
			return is_18_;
		    }
		    if (i_16_ < 0
			|| ((long) i_16_
			    > aClass38_7591.method964((byte) -128) / 520L)) {
			byte[] is_19_ = null;
			return is_19_;
		    }
		    int i_20_ = i_12_ + i_13_;
		    for (int i_21_ = i_13_; i_21_ < i_20_; i_21_++)
			is_8_[i_9_++] = aByteArray7594[i_21_];
		    i_5_ = i_16_;
		    i_10_++;
		}
		is = is_8_;
	    } catch (IOException ioexception) {
		byte[] is_22_ = null;
		return is_22_;
	    }
	    return is;
	}
    }
    
    public Class567(int i, Class38 class38, Class38 class38_23_, int i_24_) {
	anInt7590 = i * 156486639;
	aClass38_7591 = class38;
	aClass38_7592 = class38_23_;
	anInt7593 = -993662599 * i_24_;
    }
    
    boolean method9548(int i, byte[] is, int i_25_, boolean bool, int i_26_) {
	synchronized (aClass38_7591) {
	    boolean bool_27_;
	    try {
		int i_28_;
		if (bool) {
		    if (aClass38_7592.method964((byte) -127)
			< (long) (i * 6 + 6)) {
			boolean bool_29_ = false;
			return bool_29_;
		    }
		    aClass38_7592.method947((long) (i * 6));
		    aClass38_7592.method949(aByteArray7594, 0, 6, -648000292);
		    i_28_ = ((aByteArray7594[5] & 0xff)
			     + (((aByteArray7594[4] & 0xff) << 8)
				+ ((aByteArray7594[3] & 0xff) << 16)));
		    if (i_28_ <= 0
			|| ((long) i_28_
			    > aClass38_7591.method964((byte) -128) / 520L)) {
			boolean bool_30_ = false;
			return bool_30_;
		    }
		} else {
		    i_28_
			= (int) ((aClass38_7591.method964((byte) -126) + 519L)
				 / 520L);
		    if (0 == i_28_)
			i_28_ = 1;
		}
		aByteArray7594[0] = (byte) (i_25_ >> 16);
		aByteArray7594[1] = (byte) (i_25_ >> 8);
		aByteArray7594[2] = (byte) i_25_;
		aByteArray7594[3] = (byte) (i_28_ >> 16);
		aByteArray7594[4] = (byte) (i_28_ >> 8);
		aByteArray7594[5] = (byte) i_28_;
		aClass38_7592.method947((long) (i * 6));
		aClass38_7592.method951(aByteArray7594, 0, 6, -1324680858);
		int i_31_ = 0;
		int i_32_ = 0;
		while (i_31_ < i_25_) {
		    int i_33_ = 0;
		    if (bool) {
			aClass38_7591.method947((long) i_28_ * 520L);
			int i_34_;
			int i_35_;
			int i_36_;
			if (i > 65535) {
			    try {
				aClass38_7591.method949(aByteArray7594, 0, 10,
							-648000292);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_34_ = (((aByteArray7594[2] & 0xff) << 8)
				     + (((aByteArray7594[1] & 0xff) << 16)
					+ ((aByteArray7594[0] & 0xff) << 24))
				     + (aByteArray7594[3] & 0xff));
			    i_35_ = (((aByteArray7594[4] & 0xff) << 8)
				     + (aByteArray7594[5] & 0xff));
			    i_33_ = ((aByteArray7594[8] & 0xff)
				     + (((aByteArray7594[6] & 0xff) << 16)
					+ ((aByteArray7594[7] & 0xff) << 8)));
			    i_36_ = aByteArray7594[9] & 0xff;
			} else {
			    try {
				aClass38_7591.method949(aByteArray7594, 0, 8,
							-648000292);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_34_ = (((aByteArray7594[0] & 0xff) << 8)
				     + (aByteArray7594[1] & 0xff));
			    i_35_ = ((aByteArray7594[3] & 0xff)
				     + ((aByteArray7594[2] & 0xff) << 8));
			    i_33_ = ((aByteArray7594[6] & 0xff)
				     + (((aByteArray7594[4] & 0xff) << 16)
					+ ((aByteArray7594[5] & 0xff) << 8)));
			    i_36_ = aByteArray7594[7] & 0xff;
			}
			if (i != i_34_ || i_32_ != i_35_
			    || -1673477361 * anInt7590 != i_36_) {
			    boolean bool_37_ = false;
			    return bool_37_;
			}
			if (i_33_ < 0
			    || ((long) i_33_
				> (aClass38_7591.method964((byte) -127)
				   / 520L))) {
			    boolean bool_38_ = false;
			    return bool_38_;
			}
		    }
		    if (i_33_ == 0) {
			bool = false;
			i_33_ = (int) ((aClass38_7591.method964((byte) -123)
					+ 519L)
				       / 520L);
			if (0 == i_33_)
			    i_33_++;
			if (i_28_ == i_33_)
			    i_33_++;
		    }
		    if (i > 65535) {
			if (i_25_ - i_31_ <= 510)
			    i_33_ = 0;
			aByteArray7594[0] = (byte) (i >> 24);
			aByteArray7594[1] = (byte) (i >> 16);
			aByteArray7594[2] = (byte) (i >> 8);
			aByteArray7594[3] = (byte) i;
			aByteArray7594[4] = (byte) (i_32_ >> 8);
			aByteArray7594[5] = (byte) i_32_;
			aByteArray7594[6] = (byte) (i_33_ >> 16);
			aByteArray7594[7] = (byte) (i_33_ >> 8);
			aByteArray7594[8] = (byte) i_33_;
			aByteArray7594[9] = (byte) (-1673477361 * anInt7590);
			aClass38_7591.method947(520L * (long) i_28_);
			aClass38_7591.method951(aByteArray7594, 0, 10,
						-1669754525);
			int i_39_ = i_25_ - i_31_;
			if (i_39_ > 510)
			    i_39_ = 510;
			aClass38_7591.method951(is, i_31_, i_39_, -1682824293);
			i_31_ += i_39_;
		    } else {
			if (i_25_ - i_31_ <= 512)
			    i_33_ = 0;
			aByteArray7594[0] = (byte) (i >> 8);
			aByteArray7594[1] = (byte) i;
			aByteArray7594[2] = (byte) (i_32_ >> 8);
			aByteArray7594[3] = (byte) i_32_;
			aByteArray7594[4] = (byte) (i_33_ >> 16);
			aByteArray7594[5] = (byte) (i_33_ >> 8);
			aByteArray7594[6] = (byte) i_33_;
			aByteArray7594[7] = (byte) (-1673477361 * anInt7590);
			aClass38_7591.method947((long) i_28_ * 520L);
			aClass38_7591.method951(aByteArray7594, 0, 8,
						-867453131);
			int i_40_ = i_25_ - i_31_;
			if (i_40_ > 512)
			    i_40_ = 512;
			aClass38_7591.method951(is, i_31_, i_40_, -354548656);
			i_31_ += i_40_;
		    }
		    i_28_ = i_33_;
		    i_32_++;
		}
		bool_27_ = true;
	    } catch (IOException ioexception) {
		boolean bool_41_ = false;
		return bool_41_;
	    }
	    return bool_27_;
	}
    }
    
    public String toString() {
	return new StringBuilder().append("").append
		   (anInt7590 * -1673477361).toString();
    }
    
    public String method9549() {
	return new StringBuilder().append("").append
		   (anInt7590 * -1673477361).toString();
    }
    
    public boolean method9550(int i, byte[] is, int i_42_) {
	synchronized (aClass38_7591) {
	    if (i_42_ < 0 || i_42_ > anInt7593 * 456995017)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("").append
						       (-1673477361
							* anInt7590)
						       .append
						       (',').append
						       (i).append
						       (',').append
						       (i_42_).toString());
	    boolean bool = method9548(i, is, i_42_, true, -467827784);
	    if (!bool)
		bool = method9548(i, is, i_42_, false, 626404684);
	    boolean bool_43_ = bool;
	    return bool_43_;
	}
    }
    
    public boolean method9551(int i, byte[] is, int i_44_) {
	synchronized (aClass38_7591) {
	    if (i_44_ < 0 || i_44_ > anInt7593 * 456995017)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("").append
						       (-1673477361
							* anInt7590)
						       .append
						       (',').append
						       (i).append
						       (',').append
						       (i_44_).toString());
	    boolean bool = method9548(i, is, i_44_, true, 2055781200);
	    if (!bool)
		bool = method9548(i, is, i_44_, false, 1871301743);
	    boolean bool_45_ = bool;
	    return bool_45_;
	}
    }
    
    boolean method9552(int i, byte[] is, int i_46_, boolean bool) {
	synchronized (aClass38_7591) {
	    boolean bool_47_;
	    try {
		int i_48_;
		if (bool) {
		    if (aClass38_7592.method964((byte) -123)
			< (long) (i * 6 + 6)) {
			boolean bool_49_ = false;
			return bool_49_;
		    }
		    aClass38_7592.method947((long) (i * 6));
		    aClass38_7592.method949(aByteArray7594, 0, 6, -648000292);
		    i_48_ = ((aByteArray7594[5] & 0xff)
			     + (((aByteArray7594[4] & 0xff) << 8)
				+ ((aByteArray7594[3] & 0xff) << 16)));
		    if (i_48_ <= 0
			|| ((long) i_48_
			    > aClass38_7591.method964((byte) -127) / 520L)) {
			boolean bool_50_ = false;
			return bool_50_;
		    }
		} else {
		    i_48_
			= (int) ((aClass38_7591.method964((byte) -128) + 519L)
				 / 520L);
		    if (0 == i_48_)
			i_48_ = 1;
		}
		aByteArray7594[0] = (byte) (i_46_ >> 16);
		aByteArray7594[1] = (byte) (i_46_ >> 8);
		aByteArray7594[2] = (byte) i_46_;
		aByteArray7594[3] = (byte) (i_48_ >> 16);
		aByteArray7594[4] = (byte) (i_48_ >> 8);
		aByteArray7594[5] = (byte) i_48_;
		aClass38_7592.method947((long) (i * 6));
		aClass38_7592.method951(aByteArray7594, 0, 6, -126854795);
		int i_51_ = 0;
		int i_52_ = 0;
		while (i_51_ < i_46_) {
		    int i_53_ = 0;
		    if (bool) {
			aClass38_7591.method947((long) i_48_ * 520L);
			int i_54_;
			int i_55_;
			int i_56_;
			if (i > 65535) {
			    try {
				aClass38_7591.method949(aByteArray7594, 0, 10,
							-648000292);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_54_ = (((aByteArray7594[2] & 0xff) << 8)
				     + (((aByteArray7594[1] & 0xff) << 16)
					+ ((aByteArray7594[0] & 0xff) << 24))
				     + (aByteArray7594[3] & 0xff));
			    i_55_ = (((aByteArray7594[4] & 0xff) << 8)
				     + (aByteArray7594[5] & 0xff));
			    i_53_ = ((aByteArray7594[8] & 0xff)
				     + (((aByteArray7594[6] & 0xff) << 16)
					+ ((aByteArray7594[7] & 0xff) << 8)));
			    i_56_ = aByteArray7594[9] & 0xff;
			} else {
			    try {
				aClass38_7591.method949(aByteArray7594, 0, 8,
							-648000292);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_54_ = (((aByteArray7594[0] & 0xff) << 8)
				     + (aByteArray7594[1] & 0xff));
			    i_55_ = ((aByteArray7594[3] & 0xff)
				     + ((aByteArray7594[2] & 0xff) << 8));
			    i_53_ = ((aByteArray7594[6] & 0xff)
				     + (((aByteArray7594[4] & 0xff) << 16)
					+ ((aByteArray7594[5] & 0xff) << 8)));
			    i_56_ = aByteArray7594[7] & 0xff;
			}
			if (i != i_54_ || i_52_ != i_55_
			    || -1673477361 * anInt7590 != i_56_) {
			    boolean bool_57_ = false;
			    return bool_57_;
			}
			if (i_53_ < 0
			    || ((long) i_53_
				> (aClass38_7591.method964((byte) -122)
				   / 520L))) {
			    boolean bool_58_ = false;
			    return bool_58_;
			}
		    }
		    if (i_53_ == 0) {
			bool = false;
			i_53_ = (int) ((aClass38_7591.method964((byte) -123)
					+ 519L)
				       / 520L);
			if (0 == i_53_)
			    i_53_++;
			if (i_48_ == i_53_)
			    i_53_++;
		    }
		    if (i > 65535) {
			if (i_46_ - i_51_ <= 510)
			    i_53_ = 0;
			aByteArray7594[0] = (byte) (i >> 24);
			aByteArray7594[1] = (byte) (i >> 16);
			aByteArray7594[2] = (byte) (i >> 8);
			aByteArray7594[3] = (byte) i;
			aByteArray7594[4] = (byte) (i_52_ >> 8);
			aByteArray7594[5] = (byte) i_52_;
			aByteArray7594[6] = (byte) (i_53_ >> 16);
			aByteArray7594[7] = (byte) (i_53_ >> 8);
			aByteArray7594[8] = (byte) i_53_;
			aByteArray7594[9] = (byte) (-1673477361 * anInt7590);
			aClass38_7591.method947(520L * (long) i_48_);
			aClass38_7591.method951(aByteArray7594, 0, 10,
						-802446933);
			int i_59_ = i_46_ - i_51_;
			if (i_59_ > 510)
			    i_59_ = 510;
			aClass38_7591.method951(is, i_51_, i_59_, -789523935);
			i_51_ += i_59_;
		    } else {
			if (i_46_ - i_51_ <= 512)
			    i_53_ = 0;
			aByteArray7594[0] = (byte) (i >> 8);
			aByteArray7594[1] = (byte) i;
			aByteArray7594[2] = (byte) (i_52_ >> 8);
			aByteArray7594[3] = (byte) i_52_;
			aByteArray7594[4] = (byte) (i_53_ >> 16);
			aByteArray7594[5] = (byte) (i_53_ >> 8);
			aByteArray7594[6] = (byte) i_53_;
			aByteArray7594[7] = (byte) (-1673477361 * anInt7590);
			aClass38_7591.method947((long) i_48_ * 520L);
			aClass38_7591.method951(aByteArray7594, 0, 8,
						-1735531947);
			int i_60_ = i_46_ - i_51_;
			if (i_60_ > 512)
			    i_60_ = 512;
			aClass38_7591.method951(is, i_51_, i_60_, -1265747578);
			i_51_ += i_60_;
		    }
		    i_48_ = i_53_;
		    i_52_++;
		}
		bool_47_ = true;
	    } catch (IOException ioexception) {
		boolean bool_61_ = false;
		return bool_61_;
	    }
	    return bool_47_;
	}
    }
    
    public boolean method9553(int i, byte[] is, int i_62_, int i_63_) {
	synchronized (aClass38_7591) {
	    if (i_62_ < 0 || i_62_ > anInt7593 * 456995017)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("").append
						       (-1673477361
							* anInt7590)
						       .append
						       (',').append
						       (i).append
						       (',').append
						       (i_62_).toString());
	    boolean bool = method9548(i, is, i_62_, true, 345196172);
	    if (!bool)
		bool = method9548(i, is, i_62_, false, 424289635);
	    boolean bool_64_ = bool;
	    return bool_64_;
	}
    }
    
    public boolean method9554(int i, byte[] is, int i_65_) {
	synchronized (aClass38_7591) {
	    if (i_65_ < 0 || i_65_ > anInt7593 * 456995017)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("").append
						       (-1673477361
							* anInt7590)
						       .append
						       (',').append
						       (i).append
						       (',').append
						       (i_65_).toString());
	    boolean bool = method9548(i, is, i_65_, true, 340326629);
	    if (!bool)
		bool = method9548(i, is, i_65_, false, 491953885);
	    boolean bool_66_ = bool;
	    return bool_66_;
	}
    }
    
    public boolean method9555(int i, byte[] is, int i_67_) {
	synchronized (aClass38_7591) {
	    if (i_67_ < 0 || i_67_ > anInt7593 * 456995017)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("").append
						       (-1673477361
							* anInt7590)
						       .append
						       (',').append
						       (i).append
						       (',').append
						       (i_67_).toString());
	    boolean bool = method9548(i, is, i_67_, true, -1837516088);
	    if (!bool)
		bool = method9548(i, is, i_67_, false, 1862683216);
	    boolean bool_68_ = bool;
	    return bool_68_;
	}
    }
    
    boolean method9556(int i, byte[] is, int i_69_, boolean bool) {
	synchronized (aClass38_7591) {
	    boolean bool_70_;
	    try {
		int i_71_;
		if (bool) {
		    if (aClass38_7592.method964((byte) -128)
			< (long) (i * 6 + 6)) {
			boolean bool_72_ = false;
			return bool_72_;
		    }
		    aClass38_7592.method947((long) (i * 6));
		    aClass38_7592.method949(aByteArray7594, 0, 6, -648000292);
		    i_71_ = ((aByteArray7594[5] & 0xff)
			     + (((aByteArray7594[4] & 0xff) << 8)
				+ ((aByteArray7594[3] & 0xff) << 16)));
		    if (i_71_ <= 0
			|| ((long) i_71_
			    > aClass38_7591.method964((byte) -126) / 520L)) {
			boolean bool_73_ = false;
			return bool_73_;
		    }
		} else {
		    i_71_
			= (int) ((aClass38_7591.method964((byte) -125) + 519L)
				 / 520L);
		    if (0 == i_71_)
			i_71_ = 1;
		}
		aByteArray7594[0] = (byte) (i_69_ >> 16);
		aByteArray7594[1] = (byte) (i_69_ >> 8);
		aByteArray7594[2] = (byte) i_69_;
		aByteArray7594[3] = (byte) (i_71_ >> 16);
		aByteArray7594[4] = (byte) (i_71_ >> 8);
		aByteArray7594[5] = (byte) i_71_;
		aClass38_7592.method947((long) (i * 6));
		aClass38_7592.method951(aByteArray7594, 0, 6, -1629510244);
		int i_74_ = 0;
		int i_75_ = 0;
		while (i_74_ < i_69_) {
		    int i_76_ = 0;
		    if (bool) {
			aClass38_7591.method947((long) i_71_ * 520L);
			int i_77_;
			int i_78_;
			int i_79_;
			if (i > 65535) {
			    try {
				aClass38_7591.method949(aByteArray7594, 0, 10,
							-648000292);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_77_ = (((aByteArray7594[2] & 0xff) << 8)
				     + (((aByteArray7594[1] & 0xff) << 16)
					+ ((aByteArray7594[0] & 0xff) << 24))
				     + (aByteArray7594[3] & 0xff));
			    i_78_ = (((aByteArray7594[4] & 0xff) << 8)
				     + (aByteArray7594[5] & 0xff));
			    i_76_ = ((aByteArray7594[8] & 0xff)
				     + (((aByteArray7594[6] & 0xff) << 16)
					+ ((aByteArray7594[7] & 0xff) << 8)));
			    i_79_ = aByteArray7594[9] & 0xff;
			} else {
			    try {
				aClass38_7591.method949(aByteArray7594, 0, 8,
							-648000292);
			    } catch (EOFException eofexception) {
				break;
			    }
			    i_77_ = (((aByteArray7594[0] & 0xff) << 8)
				     + (aByteArray7594[1] & 0xff));
			    i_78_ = ((aByteArray7594[3] & 0xff)
				     + ((aByteArray7594[2] & 0xff) << 8));
			    i_76_ = ((aByteArray7594[6] & 0xff)
				     + (((aByteArray7594[4] & 0xff) << 16)
					+ ((aByteArray7594[5] & 0xff) << 8)));
			    i_79_ = aByteArray7594[7] & 0xff;
			}
			if (i != i_77_ || i_75_ != i_78_
			    || -1673477361 * anInt7590 != i_79_) {
			    boolean bool_80_ = false;
			    return bool_80_;
			}
			if (i_76_ < 0
			    || ((long) i_76_
				> (aClass38_7591.method964((byte) -122)
				   / 520L))) {
			    boolean bool_81_ = false;
			    return bool_81_;
			}
		    }
		    if (i_76_ == 0) {
			bool = false;
			i_76_ = (int) ((aClass38_7591.method964((byte) -126)
					+ 519L)
				       / 520L);
			if (0 == i_76_)
			    i_76_++;
			if (i_71_ == i_76_)
			    i_76_++;
		    }
		    if (i > 65535) {
			if (i_69_ - i_74_ <= 510)
			    i_76_ = 0;
			aByteArray7594[0] = (byte) (i >> 24);
			aByteArray7594[1] = (byte) (i >> 16);
			aByteArray7594[2] = (byte) (i >> 8);
			aByteArray7594[3] = (byte) i;
			aByteArray7594[4] = (byte) (i_75_ >> 8);
			aByteArray7594[5] = (byte) i_75_;
			aByteArray7594[6] = (byte) (i_76_ >> 16);
			aByteArray7594[7] = (byte) (i_76_ >> 8);
			aByteArray7594[8] = (byte) i_76_;
			aByteArray7594[9] = (byte) (-1673477361 * anInt7590);
			aClass38_7591.method947(520L * (long) i_71_);
			aClass38_7591.method951(aByteArray7594, 0, 10,
						-1985255178);
			int i_82_ = i_69_ - i_74_;
			if (i_82_ > 510)
			    i_82_ = 510;
			aClass38_7591.method951(is, i_74_, i_82_, -2090546141);
			i_74_ += i_82_;
		    } else {
			if (i_69_ - i_74_ <= 512)
			    i_76_ = 0;
			aByteArray7594[0] = (byte) (i >> 8);
			aByteArray7594[1] = (byte) i;
			aByteArray7594[2] = (byte) (i_75_ >> 8);
			aByteArray7594[3] = (byte) i_75_;
			aByteArray7594[4] = (byte) (i_76_ >> 16);
			aByteArray7594[5] = (byte) (i_76_ >> 8);
			aByteArray7594[6] = (byte) i_76_;
			aByteArray7594[7] = (byte) (-1673477361 * anInt7590);
			aClass38_7591.method947((long) i_71_ * 520L);
			aClass38_7591.method951(aByteArray7594, 0, 8,
						-1281228741);
			int i_83_ = i_69_ - i_74_;
			if (i_83_ > 512)
			    i_83_ = 512;
			aClass38_7591.method951(is, i_74_, i_83_, -1555638555);
			i_74_ += i_83_;
		    }
		    i_71_ = i_76_;
		    i_75_++;
		}
		bool_70_ = true;
	    } catch (IOException ioexception) {
		boolean bool_84_ = false;
		return bool_84_;
	    }
	    return bool_70_;
	}
    }
    
    public String method9557() {
	return new StringBuilder().append("").append
		   (anInt7590 * -1673477361).toString();
    }
    
    static void method9558(Class669 class669, int i) {
	int i_85_
	    = Class91.method1728(class669.anIntArray8595[((class669.anInt8600
							   -= 308999563)
							  * 2088438307)],
				 (byte) -104);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_85_;
    }
    
    static final Class669 method9559(byte i) {
	if (-1038070683 * Class679.anInt8657
	    == Class679.anArrayList8664.size())
	    Class679.anArrayList8664.add(new Class669());
	Class669 class669
	    = ((Class669)
	       Class679.anArrayList8664.get(-1038070683 * Class679.anInt8657));
	Class679.anInt8657 += -672955027;
	return class669;
    }
    
    static final void method9560(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	class247.anInt2488
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * 1610564069;
	Class454.method7416(class247, -395122503);
    }
    
    static final void method9561(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class247.aBool2492
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) == 1;
	Class454.method7416(class247, -1863254896);
    }
    
    static final void method9562(Class669 class669, int i) {
	int i_86_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class44_Sub6.aClass534_Sub35_10989.method16438((Class44_Sub6
							.aClass534_Sub35_10989
							.aClass690_Sub2_10744),
						       i_86_, -493092428);
	client.aClass512_11100.method8441(-267080254);
	Class672.method11096((byte) 1);
	client.aBool11048 = false;
    }
    
    static final void method9563(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub5_10737
		  .method16912((short) -5044) ? 1 : 0;
    }
    
    static final void method9564(Class669 class669, byte i) {
	int i_87_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class78.aClass103_825.method1906(i_87_, 1911728104);
    }
    
    static final void method9565(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub33_10765
		  .method17166(455420264);
    }
    
    static final void method9566(Class669 class669, int i) {
	int i_88_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (((Class534_Sub18_Sub2)
		Class219.aClass44_Sub19_2306.method91(i_88_, 397439543))
	       .anInt11371) * 1857484701;
    }
    
    static final void method9567(int i, int i_89_, int i_90_, int i_91_,
				 int i_92_, int i_93_, int i_94_, int i_95_,
				 int i_96_, byte i_97_) {
	if (i_90_ >= 1 && i_91_ >= 1
	    && i_90_ <= client.aClass512_11100.method8417(516603086) - 2
	    && i_91_ <= client.aClass512_11100.method8418(-1533611049) - 2) {
	    int i_98_ = i;
	    if (i_98_ < 3 && client.aClass512_11100.method8552((byte) 0)
				 .method7612(i_90_, i_91_, (byte) 0))
		i_98_++;
	    if (client.aClass512_11100.method8424((byte) 84) != null) {
		client.aClass512_11100.method8493(-484997895).method15968
		    (Class254.aClass185_2683, i, i_89_, i_90_, i_91_,
		     -585571845);
		if (i_92_ >= 0) {
		    int i_99_
			= Class44_Sub6.aClass534_Sub35_10989
			      .aClass690_Sub10_10751.method16970((byte) 12);
		    Class44_Sub6.aClass534_Sub35_10989.method16438
			((Class44_Sub6.aClass534_Sub35_10989
			  .aClass690_Sub10_10751),
			 1, 1340279592);
		    client.aClass512_11100.method8493(-1215736125).method15942
			(Class254.aClass185_2683, i_98_, i, i_90_, i_91_,
			 i_92_, i_93_, i_94_, i_95_, i_96_, 1263402515);
		    Class44_Sub6.aClass534_Sub35_10989.method16438
			((Class44_Sub6.aClass534_Sub35_10989
			  .aClass690_Sub10_10751),
			 i_99_, 727629167);
		}
		Class690_Sub27.method17128((Class322
					    .aClass654_Sub1_Sub5_Sub1_Sub2_3419
					    .aByte10854),
					   2012113038);
	    }
	}
    }
}
