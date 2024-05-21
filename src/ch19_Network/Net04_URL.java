package ch19_Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Net04_URL {

	public static void main(String[] args) {
		URL url = null;
		BufferedReader input = null;
		String address = "https://n.news.naver.com/article/021/0002636688?cds=news_media_pc&type=breakingnews";
		String line = "";

		try {
			url = new URL(address);

		    input = new BufferedReader(new InputStreamReader(url.openStream()));

			while((line=input.readLine()) !=null) {
				System.out.println(line);
			}
			input.close();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
