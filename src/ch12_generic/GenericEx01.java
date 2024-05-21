package ch12_generic;
public class GenericEx01 {
	public static void main(String[] args) {
		Pool01 gen = new Pool01();
		gen.set("그랜져"); // Object <--- String type
		String name = (String) gen.get();
		System.out.println(name);
		gen.set(new MyClass01()); // Object <--- MyClass type
		Object g1 =  gen.get();
		System.out.println(g1);
		MyClass01 g2 = (MyClass01) gen.get();
//		String g2 = (String) gen.get();
		System.out.println(g2.name);
		System.out.println(g2);
	}}
class Pool01 {
	private Object object;

	public void set(Object object) {
		this.object = object;	}
	public Object get() {		return object;	}}
class MyClass01 {
	String name;
	@Override
	public String toString() {		return "MyClass01";	}}