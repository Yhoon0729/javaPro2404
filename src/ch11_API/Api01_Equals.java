package ch11_API;
/* Object 클래스
 * equals 메서드 예제 : 동등을 정의 하는 메서드.=> 오버라이딩 필요.
 * => 같은 객체인지 여부는 == (instance) 로 구분이 가능함.
 * => 같은 내용(동등)인지 여부는 equals 메서드를 오버라이딩 해야함. 
 *   */
public class Api01_Equals {

	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		
		if (e1 == e2) {   //주소가 다름  : false
			System.out.println("e1과 e2는 같은 객체임");
		} else {
			System.out.println("e1과 e2는 다른 객체임");
		}
		
		if (e1.equals(e2)) {  //value==e.value  value 같음  :true
			System.out.println("e1과 e2는 같은 내용(동등)의 객체임");
		} else {
			System.out.println("e1과 e2는 다른 내용(동등)의 객체임");
		}
	}
}
class Equal {
	int value;
	Equal(int value) {		this.value = value;	}
	@Override
	public boolean equals(Object obj) {
		 if(obj instanceof Equal) {
			   Equal e = (Equal) obj;
			   return value==e.value;		   } 
		 else {			   return false;		   }
		 }
	} //end class