package servertest;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOService { //test 1,2,3
	public static void main(String[] args) {
		output1();
	}
	public static void output1() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test.txt");
			String str ="æ»≥Á«œººø‰!";
			for(int i=0;i<str.length();i++) {
				fos.write(str.charAt(i));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
