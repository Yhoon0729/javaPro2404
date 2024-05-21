package ch05_array;
/*
 * command 라인에서 파라미터 받기
 * javac ArrayEx6.java 
 *  c:\aaa\> java  ArrayEx6  홍길동 김삿갓 aaa bbb
 *  우클릭  ---> run as  ---> run configurations  --> tab : arguments
 */
public class ArrayEx06 {
	public static void main(String[] args) {
		System.out.println(args.length);
		if(args.length == 0) {
			System.out.println("커맨드라인에 파라미터를 입력하세요");
			System.out.println("java chap6.ArrayEx6 홍길동 김삿갓");
			return;
		}
		for(int i=0;i<args.length;i++) {
			System.out.println("args["+i+"]="+args[i]);
		}
	}
}