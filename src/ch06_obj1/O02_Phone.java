package ch06_obj1;

public class O02_Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone[] parr = new Phone[3];
		for(int i=0;i<parr.length;i++) {
			Phone p = new Phone();
			parr[i] = p; 
			parr[i].no = i+"1234";
			parr[i].color = i+"color";
			//no : 0: 01234, 1:11234 , 2 :21234
			System.out.println(p.color+","+p.power+","+p.no);
		}
		
		for(int i=0;i<parr.length;i++) {
			System.out.printf("parr[%d].no=%s\n",i,parr[i].no);
			parr[i].send((i==0)?parr[parr.length-1].no:parr[i-1].no);
		}
		
	}

}
