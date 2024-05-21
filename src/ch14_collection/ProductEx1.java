package ch14_collection;
/*
 * 1) 월별 리스트 
 * 2) 월별 생산, 판매, 반품 합계현황
 * 3) 제품별  생산, 판매, 반품  합계현황
 *
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class ProductEx1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		List<Product> tlist = new ArrayList<>();
		Scanner sc = new Scanner(new File("src/ch14_collection/product.txt"));
		while(sc.hasNext()) {
			String line=sc.next();
		//	System.out.println(line);	
			tlist.add(new Product(line));
		}
		
		System.out.println("1) 월별 리스트" );
		
		Map<Integer, List<Product>> map1 = new HashMap<>();
		Iterator<Product> it = tlist.iterator();
		while(it.hasNext()) {
			Product p = it.next();
			if (!map1.containsKey(p.mon)) map1.put(p.mon,
					new ArrayList<Product>());
			map1.get(p.mon).add(p);
		}
	
		for (Integer m : map1.keySet()) {
			System.out.println(m+"월============");
			for (Product p : map1.get(m)) {
				System.out.println(p);
			}
		}
		
		System.out.println("2) 월별 생산, 판매, 반품 합계현황" );
		Map<Integer, int[]> map2 = new HashMap<>();
		it = tlist.iterator();
		while(it.hasNext()) {
			Product p = it.next();
			if (!map2.containsKey(p.mon)) map2.put(p.mon,new int[3]);
			map2.get(p.mon)[p.con-1] +=p.qty;
		}
	
		for (Integer m : map2.keySet()) {
			System.out.print(m+"월 ");
			int[] montot = map2.get(m);
			System.out.print(montot[0]+"\t");
			System.out.print(montot[1]+"\t");
			System.out.print(montot[2]+"\t");
			System.out.println();
		}
		System.out.println("3) 제품별  생산, 판매, 반품  합계현황");
		
		Map<String, int[]> map3 = new HashMap<>();
		it = tlist.iterator();
		while(it.hasNext()) {
			Product p = it.next();
			if (!map3.containsKey(p.carname)) 
				        map3.put(p.carname,new int[3]);
			map3.get(p.carname)[p.con-1] +=p.qty;
		}
	
		for (String m : map3.keySet()) {
			System.out.print(m+" \t");
			int[] nametot = map3.get(m);
			System.out.print(nametot[0]+"\t");
			System.out.print(nametot[1]+"\t");
			System.out.print(nametot[2]+"\t");
			System.out.println();
		}
		
	}

}
class Product {
	int mon;
	int con;
	String carname;
	int qty;
	String remark;
	public Product(String line) {
		String[] str = line.split(",");
		
		this.mon = Integer.parseInt(str[0]);
		this.con = Integer.parseInt(str[1]);
		this.carname = str[2];
		this.qty = Integer.parseInt(str[3]);
		if (str.length==5)
		this.remark = str[4];
		else 
		this.remark="";
	}
	@Override
	public String toString() {
		return "Product [mon=" + mon + ", con=" + con + ", carname=" + carname + ", qty=" + qty + ", remark=" + remark
				+ "]";
	}
	
	
	
	
}