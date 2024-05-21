package ch08_interface;

public class Inter04_Interface {
	public static void main(String[] args) {
		Printerable able = PrinterManager.getPrinter("mysql");
		able.print();
		able = PrinterManager.getPrinter("oracle");
		able.print();	}}
interface Printerable {	void print();}
class PrinterManager {
	public static Printerable getPrinter(String type) {
		//Printerable p = new InkZet();
		if (type.equals("oracle"))	return new OracleDao();
		else			return new MysqlDao();	}}

class OracleDao implements  Printerable {
	@Override
	public void print() {System.out.println("oracle Printer에서 출력함");	}
}
class MysqlDao implements  Printerable {
	@Override
	public void print() {System.out.println("mysql Printer에서 출력함");	}
}
 