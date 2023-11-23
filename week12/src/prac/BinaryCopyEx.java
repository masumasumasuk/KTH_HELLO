package prac;

import java.io.*;

public class BinaryCopyEx {

	public static void main(String[] args) {
		int c;

		try {
			FileInputStream fi = new FileInputStream("c:\\Windows\\Web\\Wallpaper\\Theme1\\img19.jpg");
			FileOutputStream fo = new FileOutputStream("c:\\Temp\\copyimg.jpg");

			while ((c = fi.read()) != -1) {
				fo.write((byte) c);
			}

			fi.close();
			fo.close();
			System.out.println("File copied!");
		} catch (IOException e) {

			System.out.println("File Copy Error");
		}
	}

}
