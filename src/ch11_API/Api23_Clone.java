package ch11_API;

public class Api23_Clone {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(1, 1), 2.0);
		Circle c2 = c1.clone();
		System.out.println("c1=" + c1.hashCode());
		System.out.println("c2=" + c2.hashCode());
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		c1.p.x = 9;
		c1.p.y = 9;
		System.out.println("= c1의 변경 후 =");
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);

	}
}

class Circle implements Cloneable {
	Point p;	double r; // 반지름
	Circle(Point p, double r) {
		this.p = p;		this.r = r;	}
	@Override
	public  Circle clone()  {
		// TODO Auto-generated method stub
		try {
			return (Circle) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	
	
}



