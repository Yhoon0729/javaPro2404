package ch11_API;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

public class Api52_MessageFormat {
	public static void main(String[] args) throws Exception {
		String tableName = "student";
		String fileName  = "src/ch11_API/score.txt";
		String msg = "INSERT INTO "+ tableName
				+ " VALUES (''{0}'',{1},{2},{3},{4});"; 
		// ' 프린트시에는 ''을 입력하여야 한다
		Scanner s = new Scanner(new File(fileName));
		String pattern = "{0},{1},{2},{3},{4}";
		MessageFormat mf = new MessageFormat(pattern);
		while(s.hasNextLine()) {
			String line = s.nextLine();
			Object[] objs = mf.parse(line);   //각각의 mapping 자료를 배열로 만듬
			System.out.println(MessageFormat.format(msg, objs));
		}
        s.close();	// 작업이 끝났으니 Scanner에서 사용한 파일을 닫아 준다.
	} // main
}


