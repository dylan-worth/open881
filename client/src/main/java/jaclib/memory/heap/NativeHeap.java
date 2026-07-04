/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap
{
    long peer;
    private int anInt1346;
    private boolean aBool1347;
    
    public NativeHeap(int i) {
	anInt1346 = i * 755089349;
	allocateHeap(-892508403 * anInt1346);
	aBool1347 = true;
    }
    
    synchronized boolean method1974() {
	return aBool1347;
    }
    
    public NativeHeapBuffer method1975(int i, boolean bool) {
	if (!aBool1347)
	    throw new IllegalStateException();
	return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
    }
    
    public synchronized void method1976() {
	if (aBool1347)
	    deallocateHeap();
	aBool1347 = false;
    }
    
    private native void allocateHeap(int i);
    
    private native void deallocateHeap();
    
    synchronized native int allocateBuffer(int i, boolean bool);
    
    synchronized native long getBufferAddress(int i);
    
    synchronized native void get(int i, byte[] is, int i_0_, int i_1_,
				 int i_2_);
    
    synchronized native void put(int i, byte[] is, int i_3_, int i_4_,
				 int i_5_);
    
    synchronized native void deallocateBuffer(int i);
    
    public synchronized native void copy(long l, long l_6_, int i);
    
    protected synchronized void finalize() throws Throwable {
	super.finalize();
	method1976();
    }
    
    protected synchronized void method1977() throws Throwable {
	super.finalize();
	method1976();
    }
    
    protected synchronized void method1978() throws Throwable {
	super.finalize();
	method1976();
    }
    
    protected synchronized void method1979() throws Throwable {
	super.finalize();
	method1976();
    }
    
    synchronized boolean method1980() {
	return aBool1347;
    }
    
    public NativeHeapBuffer method1981(int i, boolean bool) {
	if (!aBool1347)
	    throw new IllegalStateException();
	return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
    }
    
    public NativeHeapBuffer method1982(int i, boolean bool) {
	if (!aBool1347)
	    throw new IllegalStateException();
	return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
    }
    
    public NativeHeapBuffer method1983(int i, boolean bool) {
	if (!aBool1347)
	    throw new IllegalStateException();
	return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
    }
    
    public synchronized void method1984() {
	if (aBool1347)
	    deallocateHeap();
	aBool1347 = false;
    }
    
    public synchronized void method1985() {
	if (aBool1347)
	    deallocateHeap();
	aBool1347 = false;
    }
}
