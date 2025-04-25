package javabasic.loop._for;

import java.util.Scanner;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.24
 */
public class ForExample {
	
	public static void main(String[] args) {
		//1~200までの整数のうち6の倍数 12の倍数ではない数 横出力
		for(int i=0;i<=200;i++){
			if(i % 6 == 0 && i % 12 != 0) {
				System.out.printf("%d ",i);
			}
		}
		System.out.println();
		
		//1~60000までの整数中177の倍数
		int count = 0;
		for(int i = 1; i<=60000; i++) {
			if(i % 177 == 0)		
				count++;			
		}
		System.out.println("1~60000までの整数中177の倍数の個数:"+count+"個");

		//入力された整数までファクトリアル値
		
		Scanner sc = new Scanner(System.in);
		System.out.print("定数を入力してください:");
		int fac = sc.nextInt();
		int total1 = 1;
		int total2 = 1;
		
		for(int i=1; i<=fac; i++) {
			total1 *= i;
		}
		
		for(int i = fac; i>=1; i--) {
			total2 *= i;
		}
		System.out.printf("%d!の値は%dです\n", fac, total1);
		System.out.printf("%d!の値は%dです\n", fac, total2);
		
		sc.close();
	}
	
}
