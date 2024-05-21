package ch11_API;

class Api21_Clone {
	public static void main(String[] args)  {
		Point original = new Point(3, 5);
		Point copy=null;
		try {
			copy = (Point) original.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	} 
		// 복제(clone)해서 새로운 객체를 생성
		System.out.println(original);
		System.out.println(copy);
	}
	


}
class Point implements Cloneable{
	int x;	int y;
	public Point(int x, int y) {
			this.x = x;		this.y = y;	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();	}	
}//end