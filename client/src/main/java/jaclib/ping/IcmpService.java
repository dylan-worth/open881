/* IcmpService - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.ping;

public abstract class IcmpService implements Runnable
{
    protected IcmpService() {
	/* empty */
    }
    
    protected abstract void notify(int i);
    
    protected abstract void notify(int i, int i_0_, int i_1_);
    
    public native void run();
    
    public native void quit();
    
    public static native boolean available();
    
    public native void r();
    
    public native void g();
    
    protected abstract void method1789(int i);
    
    protected abstract void method1790(int i);
    
    protected abstract void method1791(int i, int i_2_, int i_3_);
    
    protected abstract void method1792(int i, int i_4_, int i_5_);
}
