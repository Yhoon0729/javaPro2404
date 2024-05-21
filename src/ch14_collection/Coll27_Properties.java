package ch14_collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

class Coll27_Properties {
	public static void main(String[] args) {
		Properties prop = new Properties();

		prop.setProperty("timeout","30");
		prop.setProperty("language","한글");
		prop.setProperty("size","10");
		prop.setProperty("capacity","10");

try {
	prop.store(new FileOutputStream("src/ch14_collection/output.txt"),
			"Properties Example");
	prop.storeToXML(new FileOutputStream("src/ch14_collection/output.xml"),
			"Properties Example");
} catch(IOException e) {
	e.printStackTrace();		
}
	} // main의 끝
}