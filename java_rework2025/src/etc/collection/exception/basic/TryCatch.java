package etc.collection.exception.basic;

import java.util.Scanner;

/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.09
 */
public class TryCatch {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("定数1を入力してください: ");
		int i =sc.nextInt();

		System.out.print("定数2を入力してください: ");
		int j =sc.nextInt();

		System.out.println("分かち合い始め！");
		
		try { 
			//try ブロックには例外発生の可能性があるコードを作成する
			System.out.printf(" %d / %d = %d \n",i,j,i/j);
			
		} catch(Exception e){
			//キャッチブロックには、tryブロから実際に例外が発生した場合に実行するコードを作成
			System.out.println("0に分けないでください!");
		}
		sc.close();
		
		System.out.println("分割終了!");
	
	}
	
}
