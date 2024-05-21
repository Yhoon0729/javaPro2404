package ch18_IO;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class IO17_DataStream {
	public static void main(String args[]) {
		try {
			FileInputStream fis = new FileInputStream("src/ch18_IO/sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			File f = new File("src/ch18_IO/sample.dat");
			System.out.println("file length:"+f.length());
			
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			
			//10, 20.0f, true
			
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();		
  		}
	} // main
}