package ch18_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IO23_BufferedReader {  
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new FileReader("src/ch18_IO/buffered.txt"));
		String msg="";
		while((msg = br.readLine()) !=null) {
			System.out.println("["+msg+"]");
		}
}
}