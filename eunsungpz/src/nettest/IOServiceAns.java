package nettest;

import java.io.FileWriter;
import java.io.IOException;

public class IOServiceAns {
	public static void main(String[] args) {
			output1();
	}
	public static void output1() {
		FileWriter fos = null;	
		try {
			fos = new FileWriter("test.txt");
			String str = "æ»≥Á«œººø‰!";
			fos.write(str);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}