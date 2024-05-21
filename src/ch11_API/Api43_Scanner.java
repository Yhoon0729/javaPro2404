package ch11_API;

import java.io.File;
import java.util.Scanner;

class Api43_Scanner {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("src/ch11_API/score.txt"));
		int sum = 0;
		int cnt = 0;
		while (sc.hasNext()) {
			String line = sc.nextLine();
			//System.out.println(line);
			String[] stu = line.split(",");
			System.out.print(stu[0]+":");
			sum=0; cnt=0;
			for (int i = 1; i < stu.length; i++) {
				int num =Integer.parseInt(stu[i]);
				sum +=num;
				++cnt;
				System.out.print(num + " ");
			}
			System.out.println(sum + " "+ (double)sum/cnt);
				
	}
}
}