package ch02_var;
public class DataEx03 {
	public static void main(String[] args) {
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128;
		var4 = var1;
		var1 =  var3;  // var3=128
		float var5 = 1.0;  //1.0 double
		double var6 = 1.0;
		var5 =var6; // error
		var6 = var5;


	}
}
