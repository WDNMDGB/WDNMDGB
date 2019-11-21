package sss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

public class TestFile {
	@Test 
	public void writeTxt() throws Exception {
		File file = new File("d:/a.txt");
		OutputStream os = new FileOutputStream(file);

		String msg = "java培优\r\n学好高薪就业!123";
		os.write(msg.getBytes()); 
		os.close();
	}

	@Test 	
	public void readTxt() throws Exception {
		File file = new File("d:/a.txt");
		InputStream is = new FileInputStream(file);
		byte[] buf = new byte[1024];	
		int len = 0;
		while( (len = is.read(buf)) != -1) {		
		
			System.out.write(buf, 0 , len);
		}
		is.close();
	}
}
