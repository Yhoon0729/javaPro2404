package ch04_controll;
public class ExCont06 {
	/*
	 * 1. 1부터 100까지 수중에  2의 배수이거나 3의 배수의 합구하기 
	 *     2 3 4 6 8 9 10 12 14 15 
	 * 2. 1부터 100까지 수중에 2의 배수도 아니고 3의 배수도 아닌 수의 합구하기 
	 *     1 5 7 11 13 17   
	2의 배수이거나 3의 배수의 합 : 3417
	2와 3의 배수가 아닌수의 합 : 1633
	 */
	public static void main(String[] args) {
		
		int sum1 =0, sum2=0;
		for (int i = 1; i <=100 ; i++) {
			if(i%2==0 || i%3==0)  {  //2의 배수이거나 3의 배수
				sum1 +=i;
			} else {   //2의 배수도 아니고 3의 배수도 아닌
				sum2 +=i;
			}
		}
		System.out.println("2의 배수이거나 3의 배수의 합:"+sum1);
		System.out.println("2의 배수도 아니고 3의 배수도 아닌수의 합:"+sum2);
		
		
		
	}
	}