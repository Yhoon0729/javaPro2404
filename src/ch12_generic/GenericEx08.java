package ch12_generic;
// 
 /* 제네릭 class 실행시에 wildCard를 사용 할 수 있다
  * < ? extends Fruit> Fruit포함 Fruit를 포함 자손(child) 포함 
  * < ? super Fruit>   Fruit포함 Fruit를 포함 조상(parent) 포함 */
class Pool08<T> {
	T v;	Pool08(T n) {		v = n;	}
	void set(T n) {		v = n;	}
	T get() {		return v;	}}


class Food {String name = "Food";String getMsg() {	return name;}}
class Fruit extends Food {	String name = "Fruit";
	String getMsg() {		return name;	}}
class Drink extends Food {	String name = "Drink";
	String getMsg() {		return name;	}}
class Apple extends Fruit {	String name = "Apple";
	String getMsg() {		return name;	}}
class Peach extends Fruit {	String name = "Peach";
	String getMsg() {		return name;	}}
class Coke extends Drink {	String name = "Coke";
	String getMsg() {		return name;	}}
class Sidar extends Drink {	String name = "Sidar";
	String getMsg() {		return name;	}}
public class GenericEx08 {
	public static void main(String[] args) {
		Food food = new Food();		Fruit fruit = new Fruit(); Sidar sidar = new Sidar();	Coke  coke  = new Coke();
		Apple apple = new Apple();	Peach peach = new Peach(); Drink drink = new Drink();
		Pool08<? super Apple> g1 =new Pool08<Fruit>(fruit);System.out.println(g1.get());
		Pool08<? super Apple> g2 =new Pool08<Food>(food);System.out.println(g2.get());
		Pool08<? super Apple> g3 =new Pool08<Apple>(apple);	System.out.println(g3.get());
	//	Pool08<? super Apple> g4 =new Pool08<Sidar>(sidar);
	//	Pool08<? super Apple> g5 =new Pool08<Drink>(drink);
		Pool08<? extends Drink> g6 =new Pool08<Drink>(drink);System.out.println(g6.get());
		Pool08<? extends Drink> g7 =new Pool08<Sidar>(sidar);System.out.println(g7.get());
	//	Pool08<? extends Drink> g8 =new Pool08<Food>(food);
	//	Pool08<? extends Drink> g9 =new Pool08<Apple>(apple);
		}}