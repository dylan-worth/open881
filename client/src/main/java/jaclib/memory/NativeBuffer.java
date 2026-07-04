/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source
{
    private int anInt2275 = -869010697;
    private long aLong2276;
    
    protected NativeBuffer() {
	/* empty */
    }
    
    public final int method1() {
	return anInt2275 * 1836552505;
    }
    
    public final long method2() {
	return -3156321065228414913L * aLong2276;
    }
    
    public void method3(byte[] is, int i, int i_0_, int i_1_) {
	if (0L == -3156321065228414913L * aLong2276 | null == is | i < 0
	    | i_1_ + i > is.length | i_0_ < 0
	    | i_1_ + i_0_ > 1836552505 * anInt2275)
	    throw new RuntimeException();
	put(-3156321065228414913L * aLong2276, is, i, i_0_, i_1_);
    }
    
    private final native void get(long l, byte[] is, int i, int i_2_,
				  int i_3_);
    
    private final native void put(long l, byte[] is, int i, int i_4_,
				  int i_5_);
    
    public void method4(byte[] is, int i, int i_6_, int i_7_) {
	if (0L == -3156321065228414913L * aLong2276 | null == is | i < 0
	    | i_7_ + i > is.length | i_6_ < 0
	    | i_7_ + i_6_ > 1836552505 * anInt2275)
	    throw new RuntimeException();
	put(-3156321065228414913L * aLong2276, is, i, i_6_, i_7_);
    }
    
    public void method5(byte[] is, int i, int i_8_, int i_9_) {
	if (0L == -3156321065228414913L * aLong2276 | null == is | i < 0
	    | i_9_ + i > is.length | i_8_ < 0
	    | i_9_ + i_8_ > 1836552505 * anInt2275)
	    throw new RuntimeException();
	put(-3156321065228414913L * aLong2276, is, i, i_8_, i_9_);
    }
    
    public void method6(byte[] is, int i, int i_10_, int i_11_) {
	if (0L == -3156321065228414913L * aLong2276 | null == is | i < 0
	    | i_11_ + i > is.length | i_10_ < 0
	    | i_11_ + i_10_ > 1836552505 * anInt2275)
	    throw new RuntimeException();
	put(-3156321065228414913L * aLong2276, is, i, i_10_, i_11_);
    }
    
    public void method7(byte[] is, int i, int i_12_, int i_13_) {
	if (0L == -3156321065228414913L * aLong2276 | null == is | i < 0
	    | i_13_ + i > is.length | i_12_ < 0
	    | i_13_ + i_12_ > 1836552505 * anInt2275)
	    throw new RuntimeException();
	put(-3156321065228414913L * aLong2276, is, i, i_12_, i_13_);
    }
    
    public final int method8() {
	return anInt2275 * 1836552505;
    }
    
    public final int method9() {
	return anInt2275 * 1836552505;
    }
    
    public final long method10() {
	return -3156321065228414913L * aLong2276;
    }
    
    public final long method11() {
	return -3156321065228414913L * aLong2276;
    }
    
    public final long method12() {
	return -3156321065228414913L * aLong2276;
    }
    
    public final long method13() {
	return -3156321065228414913L * aLong2276;
    }
}
