package sss;
import java.util.*;

import org.junit.Test;

public class HelloWorld {
	private static final double PI = 3.14;
	
	public static void main(String[] args) {
		System.out.println(System.lineSeparator());
		System.out.println("Hello World.");
	}
	
	@Test
	public void userInfo() {
		System.out.println("\n当前用户名称：" + System.getProperty("user.name"));
		System.err.println("当前用户工作路径：" + System.getProperty("user.air"));
	}
	
	
	@Test
	public void envInfo()  {
		System.out.println("\njava的版本号：" + System.getProperty("java.version"));
		System.out.println("jdk所在目录：" + System.getProperty("java.home"));
	}
	
	@Test
	public void timeInfo() {
		System.out.println("\n当前的毫秒数：" + System.currentTimeMillis());
		System.out.println("当前的纳秒数：" + System.nanoTime());
		System.out.println("系统当前时间：" + new Date());
	}
	
	
	
	
	
	
	

}
