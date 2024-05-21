package ch11_API;

import java.text.MessageFormat;

public class Api50_MessageFormat {
	public static void main(String[] args) {
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO "+ tableName 
				+" VALUES (''{0}'',''{1}'',{2},''{3}'');";
		// '{0}' 문자로 인식한다
		Object[][] arguments = {
			{"이자바","02-123-1234", "27", "07-09"},
			{"김프로","032-333-1234", "33", "10-07"},};

		for(int i=0; i < arguments.length;i++) {
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}	} // main
}