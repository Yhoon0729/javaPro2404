package ch12_generic;
class Product<T, M> {
	private T kind;	private M model;
	public T getKind() {		return this.kind;	}
	public M getModel() {		return this.model;	}
	public void setKind(T kind) {		this.kind = kind;	}
	public void setModel(M model) {		this.model = model;	}
	@Override
	public String toString() {
		return "Product [kind=" + kind + ", model=" + model + "]";	}}
class Car {	
	public String toString() {		return "Car";	}}
class Tv {	
	public String toString() {		return "Tv";	}}


public class GenericEx03 {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println(product1);
		Product<Car, String> product2 = new Product<Car, String>();	
	    //"디젤"
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String tvModel2 = product2.getModel();
		System.out.println(product2);
		
		
	
	}}







