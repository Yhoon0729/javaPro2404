package ch11_API;
public class Api06_ToString {
	public static void main(String[] args) {
		Animal a1 = new Animal("호랑이", 20);
		System.out.println(a1);
	}
}

class Animal {
	String name;
	int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}


	

	
}