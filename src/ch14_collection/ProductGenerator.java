package ch14_collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ProductGenerator {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		String[] cars = {"아반테","그랜저","BMW","벤쯔","라쎄티"};
		String[] remark = {"몰라요","싫어요","그냥이요"};
		
		try {
			fos = new FileOutputStream("src/ch14_collection/product.txt");
			ps = new PrintStream(fos);
			
			for (int i = 0; i < 100 ; i++) {
				ps.print( ((int)(Math.random()*12)+1) +",") ; //1 ~ 12까지의 판매월
				int con = ((int)(Math.random()*3)+1);
				ps.print(con + ",") ;  //1~3까지의 값. 1:생산, 2:판매, 3:반품
				ps.print(cars[(int)(Math.random()*5)]+",") ; //자동차 이름
				ps.print((int)(Math.random()*5)+1) ;//수량 1 ~ 5. 자동차 판매량
				if (con==3) {
				ps.print(","+(remark[(int)(Math.random()*3)])) ;  //반품인경우 사유 
				}
				ps.println();
			}
			System.out.println("파일 생성 완료");
			ps.flush(); ps.close(); fos.close();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  		
	}
}