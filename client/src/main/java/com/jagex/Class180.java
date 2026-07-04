/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Component;

public class Class180
{
    public static final int anInt1856 = 2;
    public static final int anInt1857 = 2;
    public static final int anInt1858 = 4;
    public static final int anInt1859 = 16;
    public static final int anInt1860 = 1;
    public static final int anInt1861 = 32;
    public static final int anInt1862 = 1;
    public static final float aFloat1863 = 1.0F;
    public static final int anInt1864 = 3;
    public static final int anInt1865 = 7;
    public static final int anInt1866 = 8;
    public static final int anInt1867 = 16;
    public static final float aFloat1868 = 1.0F;
    public static final int anInt1869 = 128;
    public static final int anInt1870 = 256;
    public static final int anInt1871 = 1;
    public static final int anInt1872 = 4;
    public static final int anInt1873 = 2048;
    public static final int anInt1874 = 4096;
    public static final int anInt1875 = 8192;
    public static final int anInt1876 = 4;
    public static final int anInt1877 = 32768;
    public static final int anInt1878 = 65536;
    public static final int anInt1879 = 1;
    public static final int anInt1880 = 262144;
    public static final int anInt1881 = 524288;
    public static final int anInt1882 = 1048576;
    public static final int anInt1883 = 1;
    public static final int anInt1884 = 2;
    public static final int anInt1885 = 4;
    public static final int anInt1886 = 1;
    public static final int anInt1887 = 3;
    public static final int anInt1888 = 2;
    public static final int anInt1889 = 512;
    public static final int anInt1890 = 8;
    public static final int anInt1891 = 16;
    public static final int anInt1892 = 1;
    public static final int anInt1893 = 1;
    public static final float aFloat1894 = 0.0F;
    public static final int anInt1895 = 0;
    public static final int anInt1896 = 4;
    public static final int anInt1897 = 2;
    public static final int anInt1898 = 3;
    public static final int anInt1899 = 4;
    public static final int anInt1900 = 0;
    public static final int anInt1901 = 1;
    public static final int anInt1902 = 2;
    public static final int anInt1903 = 2;
    public static final int anInt1904 = 32;
    public static final int anInt1905 = 1;
    public static final int anInt1906 = 0;
    public static final int anInt1907 = 32;
    public static final int anInt1908 = 0;
    public static final int anInt1909 = 1;
    public static final int anInt1910 = 16384;
    public static final int anInt1911 = 3;
    public static final int anInt1912 = 0;
    public static final int anInt1913 = 2;
    public static final int anInt1914 = 2;
    static final float aFloat1915 = 1.0F;
    public static final int anInt1916 = 4;
    public static final int anInt1917 = 5;
    public static final int anInt1918 = 0;
    public static final int anInt1919 = 1;
    public static final int anInt1920 = 8;
    public static final int anInt1921 = 3;
    public static final int anInt1922 = 4;
    public static final int anInt1923 = 5;
    public static final int anInt1924 = 0;
    public static final int anInt1925 = 1;
    public static final int anInt1926 = 2;
    public static final int anInt1927 = 64;
    public static final float aFloat1928 = 0.25F;
    public static final float aFloat1929 = 1.0F;
    static final float aFloat1930 = 0.0F;
    public static final float aFloat1931 = 1.0F;
    public static final int anInt1932 = 3;
    public static final float aFloat1933 = 1.0F;
    public static final float aFloat1934 = 0.0F;
    public static final int anInt1935 = 2;
    public static final int anInt1936 = 1024;
    public static final int anInt1937 = 131072;
    public static final float aFloat1938 = 1.0F;
    public static final int anInt1939 = 2;
    public static final int anInt1940 = 4;
    public static final int anInt1941 = 1;
    public static final int anInt1942 = 2;
    public static final int anInt1943 = 1;
    public static final int anInt1944 = 2;
    public static final int anInt1945 = 15;
    public static final int anInt1946 = 1;
    public static final int anInt1947 = 2;
    public static final int anInt1948 = 3;
    public static final int anInt1949 = 8;
    public static Class472 aClass472_1950;
    
    Class180() throws Throwable {
	throw new Error();
    }
    
    public static Class547 method2976(Component component, int i) {
	return new Class547_Sub1(component);
    }
    
    static final void method2977(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	int i_2_ = 0;
	int i_3_ = i_1_ >>> 8;
	int i_4_ = i_1_ & 0xff;
	Class21 class21
	    = (Class21) Class150_Sub1.aClass44_8902.method91(i_0_, 1311929066);
	Class74 class74
	    = (Class74) Class706.aClass44_8845.method91(i_3_, 840996814);
	Class493[] class493s = class74.aClass493ArrayArray798[i_4_];
	Object[] objects = class21.method806(i_4_, -239667638);
	if (objects == null && class74.anObjectArrayArray799 != null)
	    objects = class74.anObjectArrayArray799[i_4_];
	if (objects != null)
	    i_2_ = objects.length / class493s.length;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_2_;
    }
    
    public static boolean method2978(int i, int[] is, int i_5_) {
	if (Class250.aBoolArray2652[i])
	    return true;
	Class44_Sub11.aClass243Array11006[i]
	    = Class498.method8262(i, is, Class44_Sub11.aClass243Array11006[i],
				  false, (byte) 34);
	if (null == Class44_Sub11.aClass243Array11006[i])
	    return false;
	Class250.aBoolArray2652[i] = true;
	return true;
    }
}
