package javabasic.loop._while;

import java.util.Scanner;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.24
 */
public class WhileExample {
	
	public static void main(String[] args) {

		/*
		 #while問い合わせ進行順序
		 1.制御変数宣言(開始値セッティング)
		 2.while文のジョガーシンを検査してtrueなら繰り返し文スタート、falseなら繰り返し文終了です
		 3. while文ブロック内部が一度進行されると(最後まで下がると)自試条件式を検査し、trueなら継続進行 falseなら繰り返し文終了です
		 4.繰り返し文内には増減式を配置し、制御変数値を調整します
		*/

		//begin-step-end 繰り返し文 必須要素 3つ
		int n =1; // 制御変数 : 繰り返し文の回数を制御する変数 (begin)
		while(n<=10) { // 論理型条件式 - 繰り返し文が終わる条件を設定(end)
			System.out.println("こんにちは！お会いできて嬉しいです" + n);
			n++; // 増減式: 繰り返し文の終了のために制御変数の値を照電(step)
		}
		System.out.println("-------------------------------------------");
		
		//1~10までの累積合計
		int i =1; //begin
		int total = 0; // 累積記憶する変数

		while(i<=10){ //end

		total += i; //=total=total+1;
			i++; //step
		}

		System.out.println("1~10までの累積合計:" + total);

		// 48~150の整数のうち8の倍数だけを横に出力します。
		//48から数字を一つずつ上げながら 8の倍数判別
		
		int num = 48;
		while(num<=150) {
			if(num % 8 == 0) {
				System.out.print(num+" ");
			} 
			num++;
		}
		System.out.println("<-48~150사이의 8의 배수");
		
		//1~100までの整数のうち、4の倍数でありながら8の倍数ではない数を横に出力します
		int num2 = 1;
		while(num2<=100) {
			if(!(num2%8==0) && num2 % 4 == 0 ) {
				System.out.print(num2+" ");
			}
			num2++;
		}
		System.out.println("<-1~100の間の4の倍数ですが8の倍数ではない数");

		System.out.println("---------------------------------------");
		//1~30000までの整数中258の倍数の個数を出力します
		int count1 = 0;
		int i1 = 1;
		while(i1 <= 30000) {
			if(i1 % 258 == 0) {
				count1++;
				//System.out.print(i1 + " ");
			}
			i1++;
		}
		System.out.println("数字258の倍数個数:"+ count1);

		//1000の約数の個数を求めましょう
		int count2 =0;
		int i2 =1;
		while(i2<=1000) {
			if(1000%i2==0) {
				count2++;
				System.out.print( i2 + " ");
			}		
			i2++;
		}
		
		System.out.println("->数1000の約数: "+ count2);
		
		System.out.println("->数字1000の約数: "+ count2);

		/*
		- 1つの整数を入力して、その整数が素数(prime number)であるかどうかを判別します
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("定数を入力してください");
		int num3 = sc.nextInt(); // 約数の個数が2個なら小数、超過なら小数X
		int i3 = 1;
		int count3 = 0;
	
		while(i3<=num) {
			if(num % i3==0) {
				count3++;
			} 
			i3++;
		}
		
		if(count3 ==2) {
			System.out.println("約数の個数が1と自分だけなので少数です。");
		} else {
			System.out.printf("約数の個数が%d個なので少数ではありません。", count3);
		}
		
		sc.close();
	}

}
