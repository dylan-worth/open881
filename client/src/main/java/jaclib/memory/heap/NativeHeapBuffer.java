/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;
import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source
{
    private int anInt1118;
    public NativeHeap aNativeHeap1119;
    private int anInt1120;
    private boolean aBool1121 = true;
    
    NativeHeapBuffer(NativeHeap nativeheap, int i, int i_0_) {
	aNativeHeap1119 = nativeheap;
	anInt1120 = 1330967921 * i;
	anInt1118 = -1464090437 * i_0_;
    }
    
    private final synchronized boolean method1780() {
	return aNativeHeap1119.method1974() && aBool1121;
    }
    
    public final long method2() {
	return aNativeHeap1119.getBufferAddress(1721183121 * anInt1120);
    }
    
    public final int method1() {
	return anInt1118 * 743998579;
    }
    
    public final synchronized void method3(byte[] is, int i, int i_1_,
					   int i_2_) {
	if (!method1780() | null == is | i < 0 | i_2_ + i > is.length
	    | i_1_ < 0 | i_2_ + i_1_ > anInt1118 * 743998579)
	    throw new RuntimeException();
	aNativeHeap1119.put(anInt1120 * 1721183121, is, i, i_1_, i_2_);
    }
    
    public final synchronized void method1781() {
	if (method1780())
	    aNativeHeap1119.deallocateBuffer(1721183121 * anInt1120);
	aBool1121 = false;
    }
    
    protected final synchronized void finalize() throws Throwable {
	super.finalize();
	method1781();
    }
    
    public final synchronized void method4(byte[] is, int i, int i_3_,
					   int i_4_) {
	if (!method1780() | null == is | i < 0 | i_4_ + i > is.length
	    | i_3_ < 0 | i_4_ + i_3_ > anInt1118 * 743998579)
	    throw new RuntimeException();
	aNativeHeap1119.put(anInt1120 * 1721183121, is, i, i_3_, i_4_);
    }
    
    public final synchronized void method5(byte[] is, int i, int i_5_,
					   int i_6_) {
	if (!method1780() | null == is | i < 0 | i_6_ + i > is.length
	    | i_5_ < 0 | i_6_ + i_5_ > anInt1118 * 743998579)
	    throw new RuntimeException();
	aNativeHeap1119.put(anInt1120 * 1721183121, is, i, i_5_, i_6_);
    }
    
    public final synchronized void method6(byte[] is, int i, int i_7_,
					   int i_8_) {
	if (!method1780() | null == is | i < 0 | i_8_ + i > is.length
	    | i_7_ < 0 | i_8_ + i_7_ > anInt1118 * 743998579)
	    throw new RuntimeException();
	aNativeHeap1119.put(anInt1120 * 1721183121, is, i, i_7_, i_8_);
    }
    
    public final synchronized void method7(byte[] is, int i, int i_9_,
					   int i_10_) {
	if (!method1780() | null == is | i < 0 | i_10_ + i > is.length
	    | i_9_ < 0 | i_10_ + i_9_ > anInt1118 * 743998579)
	    throw new RuntimeException();
	aNativeHeap1119.put(anInt1120 * 1721183121, is, i, i_9_, i_10_);
    }
    
    protected final synchronized void method1782() throws Throwable {
	super.finalize();
	method1781();
    }
    
    protected final synchronized void method1783() throws Throwable {
	super.finalize();
	method1781();
    }
    
    protected final synchronized void method1784() throws Throwable {
	super.finalize();
	method1781();
    }
    
    public final int method8() {
	return anInt1118 * 743998579;
    }
    
    public final int method9() {
	return anInt1118 * 743998579;
    }
    
    public final long method10() {
	return aNativeHeap1119.getBufferAddress(1721183121 * anInt1120);
    }
    
    public final long method11() {
	return aNativeHeap1119.getBufferAddress(1721183121 * anInt1120);
    }
    
    public final long method12() {
	return aNativeHeap1119.getBufferAddress(1721183121 * anInt1120);
    }
    
    public final long method13() {
	return aNativeHeap1119.getBufferAddress(1721183121 * anInt1120);
    }
    
    private final synchronized boolean method1785() {
	return aNativeHeap1119.method1974() && aBool1121;
    }
    
    private final synchronized boolean method1786() {
	return aNativeHeap1119.method1974() && aBool1121;
    }
    
    public final synchronized void method1787() {
	if (method1780())
	    aNativeHeap1119.deallocateBuffer(1721183121 * anInt1120);
	aBool1121 = false;
    }
    
    public final synchronized void method1788() {
	if (method1780())
	    aNativeHeap1119.deallocateBuffer(1721183121 * anInt1120);
	aBool1121 = false;
    }
}
