package ch11_API;

import java.text.DecimalFormat;

public class Api48_DecimalFormat {
	public static void main(String[] args) {
		double number = 12345.673;
		String[] patterns = { "0", "#", "0.0", "#,###",
				"-#,###.##", "##E0", "#.#%", "'\\'#,###" };

		for (int i = 0; i < patterns.length; i++) {
			DecimalFormat df = new DecimalFormat(patterns[i]);
			System.out.println(patterns[i] + " : " + df.format(number));
		}
	}
}