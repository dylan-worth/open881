/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream
{
    private Buffer aBuffer1144;
    private int anInt1145;
    private int anInt1146;
    private int anInt1147;
    private byte[] aByteArray1148;
    private static boolean aBool1149 = getLSB(-65536) == -1;
    
    public Stream() {
	this(4096);
    }
    
    private Stream(int i) {
	aByteArray1148 = new byte[i];
    }
    
    public Stream(Buffer buffer) {
	this(buffer, 0, buffer.method1());
    }
    
    private Stream(Buffer buffer, int i, int i_0_) {
	this(buffer.method1() < 4096 ? buffer.method1() : 4096);
	method1800(buffer, i, i_0_);
    }
    
    private void method1800(Buffer buffer, int i, int i_1_) {
	method1806();
	aBuffer1144 = buffer;
	anInt1146 = i * 1013405667;
	anInt1145 = (i_1_ + i) * 211248213;
	if (anInt1145 * -1007519491 > buffer.method1())
	    throw new RuntimeException();
    }
    
    public int method1801() {
	return 1148757451 * anInt1146 + 1868891865 * anInt1147;
    }
    
    public void method1802(int i) {
	method1806();
	anInt1146 = 1013405667 * i;
    }
    
    public void method1803(int i) {
	if (1868891865 * anInt1147 >= aByteArray1148.length)
	    method1806();
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1] = (byte) i;
    }
    
    public void method1804(float f) {
	if (anInt1147 * 1868891865 + 3 >= aByteArray1148.length)
	    method1806();
	int i = floatToRawIntBits(f);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1]
	    = (byte) (i >> 24);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1]
	    = (byte) (i >> 16);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1]
	    = (byte) (i >> 8);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1] = (byte) i;
    }
    
    public void method1805(float f) {
	if (anInt1147 * 1868891865 + 3 >= aByteArray1148.length)
	    method1806();
	int i = floatToRawIntBits(f);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1] = (byte) i;
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1]
	    = (byte) (i >> 8);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1]
	    = (byte) (i >> 16);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1]
	    = (byte) (i >> 24);
    }
    
    public void method1806() {
	if (1868891865 * anInt1147 > 0) {
	    if (1868891865 * anInt1147 + 1148757451 * anInt1146
		> -1007519491 * anInt1145)
		throw new RuntimeException();
	    aBuffer1144.method3(aByteArray1148, 0, 1148757451 * anInt1146,
				1868891865 * anInt1147);
	    anInt1146 += anInt1147 * -1187524245;
	    anInt1147 = 0;
	}
    }
    
    public static final boolean method1807() {
	return aBool1149;
    }
    
    public static native int floatToRawIntBits(float f);
    
    private static final native byte getLSB(int i);
    
    private void method1808(Buffer buffer, int i, int i_2_) {
	method1806();
	aBuffer1144 = buffer;
	anInt1146 = i * 1013405667;
	anInt1145 = (i_2_ + i) * 211248213;
	if (anInt1145 * -1007519491 > buffer.method1())
	    throw new RuntimeException();
    }
    
    private void method1809(Buffer buffer, int i, int i_3_) {
	method1806();
	aBuffer1144 = buffer;
	anInt1146 = i * 1013405667;
	anInt1145 = (i_3_ + i) * 211248213;
	if (anInt1145 * -1007519491 > buffer.method1())
	    throw new RuntimeException();
    }
    
    private void method1810(Buffer buffer, int i, int i_4_) {
	method1806();
	aBuffer1144 = buffer;
	anInt1146 = i * 1013405667;
	anInt1145 = (i_4_ + i) * 211248213;
	if (anInt1145 * -1007519491 > buffer.method1())
	    throw new RuntimeException();
    }
    
    public int method1811() {
	return 1148757451 * anInt1146 + 1868891865 * anInt1147;
    }
    
    public int method1812() {
	return 1148757451 * anInt1146 + 1868891865 * anInt1147;
    }
    
    public void method1813(int i) {
	method1806();
	anInt1146 = 1013405667 * i;
    }
    
    public void method1814(int i) {
	method1806();
	anInt1146 = 1013405667 * i;
    }
    
    public void method1815(int i) {
	if (1868891865 * anInt1147 >= aByteArray1148.length)
	    method1806();
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1] = (byte) i;
    }
    
    public void method1816(int i) {
	if (1868891865 * anInt1147 >= aByteArray1148.length)
	    method1806();
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1] = (byte) i;
    }
    
    public void method1817(int i) {
	if (1868891865 * anInt1147 >= aByteArray1148.length)
	    method1806();
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1] = (byte) i;
    }
    
    public void method1818(int i) {
	if (1868891865 * anInt1147 >= aByteArray1148.length)
	    method1806();
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1] = (byte) i;
    }
    
    public void method1819(float f) {
	if (anInt1147 * 1868891865 + 3 >= aByteArray1148.length)
	    method1806();
	int i = floatToRawIntBits(f);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1]
	    = (byte) (i >> 24);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1]
	    = (byte) (i >> 16);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1]
	    = (byte) (i >> 8);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1] = (byte) i;
    }
    
    public void method1820(float f) {
	if (anInt1147 * 1868891865 + 3 >= aByteArray1148.length)
	    method1806();
	int i = floatToRawIntBits(f);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1] = (byte) i;
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1]
	    = (byte) (i >> 8);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1]
	    = (byte) (i >> 16);
	aByteArray1148[(anInt1147 += 334305641) * 1868891865 - 1]
	    = (byte) (i >> 24);
    }
    
    public static final boolean method1821() {
	return aBool1149;
    }
    
    public static final boolean method1822() {
	return aBool1149;
    }
    
    public static final boolean method1823() {
	return aBool1149;
    }
}
