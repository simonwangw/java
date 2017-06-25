package com.hin.proxy_4;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

/**
 * ��̬���ɴ��������ࣨ����ӿںʹ�������
 * (����������ӿڵĴ������ʵ������Ĵ���)
 * @author Administrator
 *
 */
public class Proxy {
	public static Object newProxyInstance(Class infce, InvocationHandler h) throws Exception{
		String methodStr = "";
		String rt = "\r\n";
		
		Method[] methods = infce.getMethods();
		for(Method m : methods){  // �����ӿ�����ķ���
			methodStr += "    @Override" + rt +
					 	 "    public void " + m.getName() + "() {" + rt +
						 "    	  try {" + rt +
						 "    		Method md = " + infce.getName() + ".class.getMethod(\"" + m.getName() + "\");" + rt +
						 "    		h.invoke(this, md);" + rt +
						 "    	  }catch(Exception e) {e.printStackTrace();}" + rt +
						 "    }" + rt +
						 "}";			
		}
		
		String src = 
			"package com.hin.proxy_4;" +  rt +
			"import java.lang.reflect.Method;" + rt +
			"public class $proxy1 implements " + infce.getName() + " {" + rt +
			"    public $proxy1(InvocationHandler h) {" + rt +
			"        this.h = h;" + rt +
			"    }" + rt +
			
			"    com.hin.proxy_4.InvocationHandler h;" + rt +
			
			methodStr;  // ���Ͻӿ���ķ���

		String fileName = System.getProperty("user.dir") 
							+ "/src/com/hin/proxy_4/$proxy1.java";
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		
		//compile
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		t.call();
		fileMgr.close();
		
		//load into memory and create an instance
		URL[] urls = new URL[] {new URL("file:/" + System.getProperty("user.dir") +"/src")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.hin.proxy_4.$proxy1");
		System.out.println(c);
		
		Constructor ctr = c.getConstructor(InvocationHandler.class);  // ��ò���ΪMoveable�Ĺ��췽��
		Object m = ctr.newInstance(h);
		//m.move();

		return m;
	}
}