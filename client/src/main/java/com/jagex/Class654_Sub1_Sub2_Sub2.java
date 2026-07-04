/* Class654_Sub1_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class654_Sub1_Sub2_Sub2 extends Class654_Sub1_Sub2
    implements Interface62
{
    public Class528 aClass528_12062;
    boolean aBool12063;
    boolean aBool12064 = true;
    Class564 aClass564_12065;
    
    boolean method16879() {
	return aBool12064;
    }
    
    boolean method16849(int i) {
	return false;
    }
    
    boolean method16850(int i) {
	return aBool12064;
    }
    
    public Class564 method16855(Class185 class185, short i) {
	return aClass564_12065;
    }
    
    public int method16876(int i) {
	return aClass528_12062.method8805((byte) 38);
    }
    
    public int method16897(int i) {
	return aClass528_12062.method8789((byte) 1);
    }
    
    Class550 method16853(Class185 class185, int i) {
	Class183 class183 = aClass528_12062.method8787(class185, 2048, false,
						       true, 1346847613);
	if (null == class183)
	    return null;
	Class446 class446 = method10834();
	Class444 class444 = method10807();
	Class550 class550 = Class322.method5779(aBool12063, -1213318715);
	int i_0_ = (int) class444.aClass438_4885.aFloat4864 >> 9;
	int i_1_ = (int) class444.aClass438_4885.aFloat4865 >> 9;
	aClass528_12062.method8788(class185, class183, class446, i_0_, i_0_,
				   i_1_, i_1_, true, (byte) -104);
	Class602 class602 = aClass528_12062.method8786(1460193483);
	if (class602.aClass432_7956 != null) {
	    class183.method3034(class446, null, 0);
	    class185.method3311(class446, aClass194Array10852[0],
				class602.aClass432_7956);
	} else
	    class183.method3034(class446, aClass194Array10852[0], 0);
	if (null != aClass528_12062.aClass629_7105) {
	    Class174 class174 = aClass528_12062.aClass629_7105.method10405();
	    class185.method3334(class174);
	}
	aBool12064
	    = class183.method3027() || null != aClass528_12062.aClass629_7105;
	if (null == aClass564_12065)
	    aClass564_12065
		= Class528.method8820((int) class444.aClass438_4885.aFloat4864,
				      (int) class444.aClass438_4885.aFloat4863,
				      (int) class444.aClass438_4885.aFloat4865,
				      class183, (byte) 19);
	else
	    Class274.method5144(aClass564_12065,
				(int) class444.aClass438_4885.aFloat4864,
				(int) class444.aClass438_4885.aFloat4863,
				(int) class444.aClass438_4885.aFloat4865,
				class183, 905197611);
	return class550;
    }
    
    void method16868(Class185 class185, int i) {
	Class183 class183 = aClass528_12062.method8787(class185, 262144, true,
						       true, 1335952698);
	if (class183 != null) {
	    Class438 class438 = method10807().aClass438_4885;
	    int i_2_ = (int) class438.aFloat4864 >> 9;
	    int i_3_ = (int) class438.aFloat4865 >> 9;
	    aClass528_12062.method8788(class185, class183, method10834(), i_2_,
				       i_2_, i_3_, i_3_, false, (byte) -28);
	}
    }
    
    boolean method16846(Class185 class185, int i, int i_4_, byte i_5_) {
	Class602 class602 = aClass528_12062.method8786(1460193483);
	if (class602.aClass432_7956 != null)
	    return class185.method3309(i, i_4_, method10834(),
				       class602.aClass432_7956, 1554530302);
	Class183 class183 = aClass528_12062.method8787(class185, 131072, false,
						       false, 2030644440);
	if (class183 == null)
	    return false;
	return class183.method3039(i, i_4_, method10834(), false, 0);
    }
    
    public int method16875() {
	return aClass528_12062.method8789((byte) 1);
    }
    
    final void method16851(Class185 class185, Class654_Sub1 class654_sub1,
			   int i, int i_6_, int i_7_, boolean bool, int i_8_) {
	throw new IllegalStateException();
    }
    
    public int method252() {
	return 1626333597 * aClass528_12062.anInt7103;
    }
    
    public int method56(int i) {
	return 1626333597 * aClass528_12062.anInt7103;
    }
    
    public int method409(int i) {
	return -1932952217 * aClass528_12062.anInt7104;
    }
    
    public int method410(int i) {
	return -2129482149 * aClass528_12062.anInt7111;
    }
    
    public Class654_Sub1_Sub2_Sub2
	(Class556 class556, Class185 class185, Class44_Sub13 class44_sub13,
	 Class602 class602, int i, int i_9_, int i_10_, int i_11_, int i_12_,
	 boolean bool, int i_13_, int i_14_, int i_15_) {
	super(class556, i_10_, i_11_, i_12_, i, i_9_,
	      -1303202133 * class602.anInt7941);
	aClass528_12062
	    = new Class528(class185, class44_sub13, class602,
			   847393323 * Class595.aClass595_7846.anInt7852,
			   i_13_, i_9_, this, bool, i_14_, i_15_);
	aBool12063 = 0 != class602.anInt7907 * -2134171963 && !bool;
	method16862(1, -545833926);
    }
    
    public void method411(int i) {
	/* empty */
    }
    
    Class550 method16884(Class185 class185) {
	Class183 class183 = aClass528_12062.method8787(class185, 2048, false,
						       true, 2121566610);
	if (null == class183)
	    return null;
	Class446 class446 = method10834();
	Class444 class444 = method10807();
	Class550 class550 = Class322.method5779(aBool12063, -1081871089);
	int i = (int) class444.aClass438_4885.aFloat4864 >> 9;
	int i_16_ = (int) class444.aClass438_4885.aFloat4865 >> 9;
	aClass528_12062.method8788(class185, class183, class446, i, i, i_16_,
				   i_16_, true, (byte) -77);
	Class602 class602 = aClass528_12062.method8786(1460193483);
	if (class602.aClass432_7956 != null) {
	    class183.method3034(class446, null, 0);
	    class185.method3311(class446, aClass194Array10852[0],
				class602.aClass432_7956);
	} else
	    class183.method3034(class446, aClass194Array10852[0], 0);
	if (null != aClass528_12062.aClass629_7105) {
	    Class174 class174 = aClass528_12062.aClass629_7105.method10405();
	    class185.method3334(class174);
	}
	aBool12064
	    = class183.method3027() || null != aClass528_12062.aClass629_7105;
	if (null == aClass564_12065)
	    aClass564_12065
		= Class528.method8820((int) class444.aClass438_4885.aFloat4864,
				      (int) class444.aClass438_4885.aFloat4863,
				      (int) class444.aClass438_4885.aFloat4865,
				      class183, (byte) 85);
	else
	    Class274.method5144(aClass564_12065,
				(int) class444.aClass438_4885.aFloat4864,
				(int) class444.aClass438_4885.aFloat4863,
				(int) class444.aClass438_4885.aFloat4865,
				class183, 341531823);
	return class550;
    }
    
    boolean method16895() {
	return false;
    }
    
    public void method18664(Class596 class596) {
	aClass528_12062.method8783(class596, (byte) -58);
    }
    
    public void method414(Class185 class185, int i) {
	aClass528_12062.method8791(class185, 198005613);
    }
    
    public void method141() {
	/* empty */
    }
    
    public void method18665(Class596 class596, int i) {
	aClass528_12062.method8783(class596, (byte) -34);
    }
    
    public boolean method419(byte i) {
	return aClass528_12062.method8809((byte) 77);
    }
    
    public boolean method423() {
	return true;
    }
    
    public void method144() {
	/* empty */
    }
    
    public boolean method416() {
	return aClass528_12062.method8809((byte) 77);
    }
    
    public void method417(Class185 class185) {
	aClass528_12062.method8790(class185, -260497953);
    }
    
    public void method422(Class185 class185) {
	aClass528_12062.method8790(class185, -1663355197);
    }
    
    public void method418(Class185 class185) {
	aClass528_12062.method8790(class185, -1356684804);
    }
    
    final void method16852(int i) {
	throw new IllegalStateException();
    }
    
    public void method420(Class185 class185) {
	aClass528_12062.method8791(class185, 198005613);
    }
    
    public int method9() {
	return -1932952217 * aClass528_12062.anInt7104;
    }
    
    boolean method16864() {
	return false;
    }
    
    boolean method16880(Class185 class185, int i, int i_17_) {
	Class602 class602 = aClass528_12062.method8786(1460193483);
	if (class602.aClass432_7956 != null)
	    return class185.method3309(i, i_17_, method10834(),
				       class602.aClass432_7956, 1554530302);
	Class183 class183 = aClass528_12062.method8787(class185, 131072, false,
						       false, 2037809013);
	if (class183 == null)
	    return false;
	return class183.method3039(i, i_17_, method10834(), false, 0);
    }
    
    boolean method16869() {
	return aBool12064;
    }
    
    public int method16867() {
	return aClass528_12062.method8805((byte) 119);
    }
    
    public int method16866() {
	return aClass528_12062.method8805((byte) 116);
    }
    
    public Class564 method16872(Class185 class185) {
	return aClass564_12065;
    }
    
    public Class564 method16870(Class185 class185) {
	return aClass564_12065;
    }
    
    public void method18666(Class596 class596) {
	aClass528_12062.method8783(class596, (byte) -29);
    }
    
    public void method421(Class185 class185) {
	aClass528_12062.method8791(class185, 198005613);
    }
    
    boolean method16873(Class185 class185, int i, int i_18_) {
	Class602 class602 = aClass528_12062.method8786(1460193483);
	if (class602.aClass432_7956 != null)
	    return class185.method3309(i, i_18_, method10834(),
				       class602.aClass432_7956, 1554530302);
	Class183 class183 = aClass528_12062.method8787(class185, 131072, false,
						       false, 1368376612);
	if (class183 == null)
	    return false;
	return class183.method3039(i, i_18_, method10834(), false, 0);
    }
    
    public boolean method413(byte i) {
	return true;
    }
    
    boolean method16882(Class185 class185, int i, int i_19_) {
	Class602 class602 = aClass528_12062.method8786(1460193483);
	if (class602.aClass432_7956 != null)
	    return class185.method3309(i, i_19_, method10834(),
				       class602.aClass432_7956, 1554530302);
	Class183 class183 = aClass528_12062.method8787(class185, 131072, false,
						       false, 1480218394);
	if (class183 == null)
	    return false;
	return class183.method3039(i, i_19_, method10834(), false, 0);
    }
    
    final boolean method16861() {
	return false;
    }
    
    public int method145() {
	return -2129482149 * aClass528_12062.anInt7111;
    }
    
    final void method16883(Class185 class185, Class654_Sub1 class654_sub1,
			   int i, int i_20_, int i_21_, boolean bool) {
	throw new IllegalStateException();
    }
    
    final void method16845() {
	throw new IllegalStateException();
    }
    
    final void method16865() {
	throw new IllegalStateException();
    }
    
    final void method16881() {
	throw new IllegalStateException();
    }
    
    void method16871(Class185 class185) {
	Class183 class183 = aClass528_12062.method8787(class185, 262144, true,
						       true, 1891082042);
	if (class183 != null) {
	    Class438 class438 = method10807().aClass438_4885;
	    int i = (int) class438.aFloat4864 >> 9;
	    int i_22_ = (int) class438.aFloat4865 >> 9;
	    aClass528_12062.method8788(class185, class183, method10834(), i, i,
				       i_22_, i_22_, false, (byte) -28);
	}
    }
    
    public int method253() {
	return 1626333597 * aClass528_12062.anInt7103;
    }
    
    public int method254() {
	return 1626333597 * aClass528_12062.anInt7103;
    }
    
    public boolean method412() {
	return true;
    }
    
    public boolean method415() {
	return true;
    }
    
    public boolean method260() {
	return true;
    }
    
    boolean method16874(Class185 class185, int i, int i_23_) {
	Class602 class602 = aClass528_12062.method8786(1460193483);
	if (class602.aClass432_7956 != null)
	    return class185.method3309(i, i_23_, method10834(),
				       class602.aClass432_7956, 1554530302);
	Class183 class183 = aClass528_12062.method8787(class185, 131072, false,
						       false, 1912533883);
	if (class183 == null)
	    return false;
	return class183.method3039(i, i_23_, method10834(), false, 0);
    }
    
    public int method16854() {
	return aClass528_12062.method8789((byte) 1);
    }
    
    public void method408(Class185 class185, byte i) {
	aClass528_12062.method8790(class185, -1471555799);
    }
    
    final boolean method16848(byte i) {
	return false;
    }
    
    public int method181() {
	return -2129482149 * aClass528_12062.anInt7111;
    }
    
    final void method16877(Class185 class185, Class654_Sub1 class654_sub1,
			   int i, int i_24_, int i_25_, boolean bool) {
	throw new IllegalStateException();
    }
}
