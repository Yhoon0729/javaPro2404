package ch18_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IO25_ObjectInput {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = 
			new ObjectInputStream(
					new FileInputStream("src/ch18_IO/object.ser"));
		Customer c1 = (Customer)ois.readObject();
		Customer c2 = (Customer)ois.readObject();
		ois.close();
		System.out.println("고객1:"+ c1);
		System.out.println("고객2:"+ c2);
	}
}