package ch18_IO;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class IO19_DataStream {
	public static void main(String args[]) {
		int sum=0;  		FileInputStream fis;
		try {
			fis = new FileInputStream("src/ch18_IO/score.dat");
			DataInputStream    dis = new DataInputStream(fis);
			while (true) {
				int score = dis.readInt();
				
				sum+=score;
				System.out.println(score);	}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {	}
		 catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println(sum);
		}
		
	}
}