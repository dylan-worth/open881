/* Class39_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class Class39_Sub1 extends Class39
{
    static final String aString10987 = "java.net.useSystemProxies";
    ProxySelector aProxySelector10988 = ProxySelector.getDefault();
    
    Class39_Sub1() {
	/* empty */
    }
    
    public Socket method976(byte i) throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_0_ = -766038025 * anInt306 == 443;
	List list;
	List list_1_;
	try {
	    list
		= aProxySelector10988.select(new URI(new StringBuilder().append
							 (bool_0_ ? "https"
							  : "http")
							 .append
							 ("://").append
							 (aString305)
							 .toString()));
	    list_1_
		= aProxySelector10988.select(new URI(new StringBuilder().append
							 (bool_0_ ? "http"
							  : "https")
							 .append
							 ("://").append
							 (aString305)
							 .toString()));
	} catch (URISyntaxException urisyntaxexception) {
	    return method977((byte) 1);
	}
	list.addAll(list_1_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_2_ = objects;
	for (int i_3_ = 0; i_3_ < objects_2_.length; i_3_++) {
	    Object object = objects_2_[i_3_];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_4_ = method17291(proxy, (byte) 2);
		if (null == socket_4_)
		    continue;
		socket = socket_4_;
	    } catch (IOException_Sub1 ioexception_sub1_5_) {
		ioexception_sub1 = ioexception_sub1_5_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (null != ioexception_sub1)
	    throw ioexception_sub1;
	return method977((byte) 1);
    }
    
    Socket method17291(Proxy proxy, byte i) throws IOException {
	if (proxy.type() == Proxy.Type.DIRECT)
	    return method977((byte) 1);
	java.net.SocketAddress socketaddress = proxy.address();
	if (!(socketaddress instanceof InetSocketAddress))
	    return null;
	InetSocketAddress inetsocketaddress
	    = (InetSocketAddress) socketaddress;
	if (proxy.type() == Proxy.Type.HTTP) {
	    String string = null;
	    try {
		Class var_class
		    = (Class.forName
		       ("sun.net.www.protocol.http.AuthenticationInfo"));
		Method method
		    = var_class.getDeclaredMethod("getProxyAuth",
						  (new Class[]
						   { java.lang.String.class,
						     Integer.TYPE }));
		method.setAccessible(true);
		Object object
		    = method.invoke(null, (new Object[]
					   { inetsocketaddress.getHostName(),
					     new Integer(inetsocketaddress
							     .getPort()) }));
		if (null != object) {
		    Method method_6_
			= (var_class.getDeclaredMethod
			   ("supportsPreemptiveAuthorization", new Class[0]));
		    method_6_.setAccessible(true);
		    if (((Boolean) method_6_.invoke(object, new Object[0]))
			    .booleanValue()) {
			Method method_7_
			    = var_class.getDeclaredMethod("getHeaderName",
							  new Class[0]);
			method_7_.setAccessible(true);
			Method method_8_
			    = (var_class.getDeclaredMethod
			       ("getHeaderValue",
				new Class[] { java.net.URL.class,
					      java.lang.String.class }));
			method_8_.setAccessible(true);
			String string_9_
			    = (String) method_7_.invoke(object, new Object[0]);
			String string_10_
			    = ((String)
			       method_8_.invoke(object,
						(new Object[]
						 { new URL(new StringBuilder
							       ().append
							       ("https://")
							       .append
							       (aString305)
							       .append
							       ("/")
							       .toString()),
						   "https" })));
			string = new StringBuilder().append(string_9_).append
				     (": ").append
				     (string_10_).toString();
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    return method17292(inetsocketaddress.getHostName(),
			       inetsocketaddress.getPort(), string,
			       1881567019);
	}
	if (proxy.type() == Proxy.Type.SOCKS) {
	    Socket socket = new Socket(proxy);
	    socket.connect(new InetSocketAddress(aString305,
						 anInt306 * -766038025));
	    return socket;
	}
	return null;
    }
    
    Socket method17292(String string, int i, String string_11_, int i_12_)
	throws IOException {
	Socket socket = new Socket(string, i);
	socket.setSoTimeout(10000);
	OutputStream outputstream = socket.getOutputStream();
	if (null == string_11_)
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (aString305).append
				   (":").append
				   (anInt306 * -766038025).append
				   (" HTTP/1.0\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	else
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (aString305).append
				   (":").append
				   (-766038025 * anInt306).append
				   (" HTTP/1.0\n").append
				   (string_11_).append
				   ("\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	outputstream.flush();
	BufferedReader bufferedreader
	    = new BufferedReader(new InputStreamReader(socket
							   .getInputStream()));
	String string_13_ = bufferedreader.readLine();
	if (string_13_ != null) {
	    if (string_13_.startsWith("HTTP/1.0 200")
		|| string_13_.startsWith("HTTP/1.1 200"))
		return socket;
	    if (string_13_.startsWith("HTTP/1.0 407")
		|| string_13_.startsWith("HTTP/1.1 407")) {
		int i_14_ = 0;
		String string_15_ = "proxy-authenticate: ";
		for (string_13_ = bufferedreader.readLine();
		     string_13_ != null && i_14_ < 50; i_14_++) {
		    if (string_13_.toLowerCase().startsWith(string_15_)) {
			string_13_
			    = string_13_.substring(string_15_.length()).trim();
			int i_16_ = string_13_.indexOf(' ');
			if (-1 != i_16_)
			    string_13_ = string_13_.substring(0, i_16_);
			throw new IOException_Sub1(string_13_);
		    }
		    string_13_ = bufferedreader.readLine();
		}
		throw new IOException_Sub1("");
	    }
	}
	outputstream.close();
	bufferedreader.close();
	socket.close();
	return null;
    }
    
    Socket method17293(Proxy proxy) throws IOException {
	if (proxy.type() == Proxy.Type.DIRECT)
	    return method977((byte) 1);
	java.net.SocketAddress socketaddress = proxy.address();
	if (!(socketaddress instanceof InetSocketAddress))
	    return null;
	InetSocketAddress inetsocketaddress
	    = (InetSocketAddress) socketaddress;
	if (proxy.type() == Proxy.Type.HTTP) {
	    String string = null;
	    try {
		Class var_class
		    = (Class.forName
		       ("sun.net.www.protocol.http.AuthenticationInfo"));
		Method method
		    = var_class.getDeclaredMethod("getProxyAuth",
						  (new Class[]
						   { java.lang.String.class,
						     Integer.TYPE }));
		method.setAccessible(true);
		Object object
		    = method.invoke(null, (new Object[]
					   { inetsocketaddress.getHostName(),
					     new Integer(inetsocketaddress
							     .getPort()) }));
		if (null != object) {
		    Method method_17_
			= (var_class.getDeclaredMethod
			   ("supportsPreemptiveAuthorization", new Class[0]));
		    method_17_.setAccessible(true);
		    if (((Boolean) method_17_.invoke(object, new Object[0]))
			    .booleanValue()) {
			Method method_18_
			    = var_class.getDeclaredMethod("getHeaderName",
							  new Class[0]);
			method_18_.setAccessible(true);
			Method method_19_
			    = (var_class.getDeclaredMethod
			       ("getHeaderValue",
				new Class[] { java.net.URL.class,
					      java.lang.String.class }));
			method_19_.setAccessible(true);
			String string_20_
			    = ((String)
			       method_18_.invoke(object, new Object[0]));
			String string_21_
			    = ((String)
			       method_19_.invoke(object,
						 (new Object[]
						  { new URL(new StringBuilder
								().append
								("https://")
								.append
								(aString305)
								.append
								("/")
								.toString()),
						    "https" })));
			string = new StringBuilder().append(string_20_).append
				     (": ").append
				     (string_21_).toString();
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    return method17292(inetsocketaddress.getHostName(),
			       inetsocketaddress.getPort(), string,
			       1586537032);
	}
	if (proxy.type() == Proxy.Type.SOCKS) {
	    Socket socket = new Socket(proxy);
	    socket.connect(new InetSocketAddress(aString305,
						 anInt306 * -766038025));
	    return socket;
	}
	return null;
    }
    
    Socket method17294(String string, int i, String string_22_)
	throws IOException {
	Socket socket = new Socket(string, i);
	socket.setSoTimeout(10000);
	OutputStream outputstream = socket.getOutputStream();
	if (null == string_22_)
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (aString305).append
				   (":").append
				   (anInt306 * -766038025).append
				   (" HTTP/1.0\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	else
	    outputstream.write(new StringBuilder().append("CONNECT ").append
				   (aString305).append
				   (":").append
				   (-766038025 * anInt306).append
				   (" HTTP/1.0\n").append
				   (string_22_).append
				   ("\n\n").toString
				   ().getBytes(Charset.forName("ISO-8859-1")));
	outputstream.flush();
	BufferedReader bufferedreader
	    = new BufferedReader(new InputStreamReader(socket
							   .getInputStream()));
	String string_23_ = bufferedreader.readLine();
	if (string_23_ != null) {
	    if (string_23_.startsWith("HTTP/1.0 200")
		|| string_23_.startsWith("HTTP/1.1 200"))
		return socket;
	    if (string_23_.startsWith("HTTP/1.0 407")
		|| string_23_.startsWith("HTTP/1.1 407")) {
		int i_24_ = 0;
		String string_25_ = "proxy-authenticate: ";
		for (string_23_ = bufferedreader.readLine();
		     string_23_ != null && i_24_ < 50; i_24_++) {
		    if (string_23_.toLowerCase().startsWith(string_25_)) {
			string_23_
			    = string_23_.substring(string_25_.length()).trim();
			int i_26_ = string_23_.indexOf(' ');
			if (-1 != i_26_)
			    string_23_ = string_23_.substring(0, i_26_);
			throw new IOException_Sub1(string_23_);
		    }
		    string_23_ = bufferedreader.readLine();
		}
		throw new IOException_Sub1("");
	    }
	}
	outputstream.close();
	bufferedreader.close();
	socket.close();
	return null;
    }
    
    Socket method17295(Proxy proxy) throws IOException {
	if (proxy.type() == Proxy.Type.DIRECT)
	    return method977((byte) 1);
	java.net.SocketAddress socketaddress = proxy.address();
	if (!(socketaddress instanceof InetSocketAddress))
	    return null;
	InetSocketAddress inetsocketaddress
	    = (InetSocketAddress) socketaddress;
	if (proxy.type() == Proxy.Type.HTTP) {
	    String string = null;
	    try {
		Class var_class
		    = (Class.forName
		       ("sun.net.www.protocol.http.AuthenticationInfo"));
		Method method
		    = var_class.getDeclaredMethod("getProxyAuth",
						  (new Class[]
						   { java.lang.String.class,
						     Integer.TYPE }));
		method.setAccessible(true);
		Object object
		    = method.invoke(null, (new Object[]
					   { inetsocketaddress.getHostName(),
					     new Integer(inetsocketaddress
							     .getPort()) }));
		if (null != object) {
		    Method method_27_
			= (var_class.getDeclaredMethod
			   ("supportsPreemptiveAuthorization", new Class[0]));
		    method_27_.setAccessible(true);
		    if (((Boolean) method_27_.invoke(object, new Object[0]))
			    .booleanValue()) {
			Method method_28_
			    = var_class.getDeclaredMethod("getHeaderName",
							  new Class[0]);
			method_28_.setAccessible(true);
			Method method_29_
			    = (var_class.getDeclaredMethod
			       ("getHeaderValue",
				new Class[] { java.net.URL.class,
					      java.lang.String.class }));
			method_29_.setAccessible(true);
			String string_30_
			    = ((String)
			       method_28_.invoke(object, new Object[0]));
			String string_31_
			    = ((String)
			       method_29_.invoke(object,
						 (new Object[]
						  { new URL(new StringBuilder
								().append
								("https://")
								.append
								(aString305)
								.append
								("/")
								.toString()),
						    "https" })));
			string = new StringBuilder().append(string_30_).append
				     (": ").append
				     (string_31_).toString();
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    return method17292(inetsocketaddress.getHostName(),
			       inetsocketaddress.getPort(), string,
			       2012680446);
	}
	if (proxy.type() == Proxy.Type.SOCKS) {
	    Socket socket = new Socket(proxy);
	    socket.connect(new InetSocketAddress(aString305,
						 anInt306 * -766038025));
	    return socket;
	}
	return null;
    }
    
    public Socket method978() throws IOException {
	boolean bool = (Boolean.parseBoolean
			(System.getProperty("java.net.useSystemProxies")));
	if (!bool)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean bool_32_ = -766038025 * anInt306 == 443;
	List list;
	List list_33_;
	try {
	    list
		= aProxySelector10988.select(new URI(new StringBuilder().append
							 (bool_32_ ? "https"
							  : "http")
							 .append
							 ("://").append
							 (aString305)
							 .toString()));
	    list_33_
		= aProxySelector10988.select(new URI(new StringBuilder().append
							 (bool_32_ ? "http"
							  : "https")
							 .append
							 ("://").append
							 (aString305)
							 .toString()));
	} catch (URISyntaxException urisyntaxexception) {
	    return method977((byte) 1);
	}
	list.addAll(list_33_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_34_ = objects;
	for (int i = 0; i < objects_34_.length; i++) {
	    Object object = objects_34_[i];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_35_ = method17291(proxy, (byte) 2);
		if (null == socket_35_)
		    continue;
		socket = socket_35_;
	    } catch (IOException_Sub1 ioexception_sub1_36_) {
		ioexception_sub1 = ioexception_sub1_36_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (null != ioexception_sub1)
	    throw ioexception_sub1;
	return method977((byte) 1);
    }
}
