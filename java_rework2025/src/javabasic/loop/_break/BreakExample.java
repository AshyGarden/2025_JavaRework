package javabasic.loop._break;

import java.util.Scanner;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.25
 */
public class BreakExample {
	
	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			if(i>7) break; //iが7を超える時、繰り返し文を破って脱出
			System.out.print(i+" ");
		}
		System.out.println("\n繰り返し文終了");

		/*
		- 内部繰り返し文に含まれているブレークで、外側の繰り返し文まで一度に終了したい場合は
		外側の繰り返し文にラベルを付ける。
		break宣言時にlabelを一緒に宣言
		*/

		System.out.println("-------------------------------------------");
		outer: for(int i=0; i<=2; i++){ // Label = 反復文自体に名前を付けてbreak時宣言すれば直ちにすべてのfor文脱出
		for(int j=0; j<=1; j++){ // ブロック内の行が 1 行の場合 中括弧省略可能
			//if(i==j) break; // breakが内側のforドアだけ終了させて脱出
			if(i == j) break outer; // breakがすべてのfor文を終了させて脱出
				System.out.println(i+"-"+j); //外側は影響 x
			}
		} //出力が0-0から割れるので0-1は出力x

		// j=0 j=1
		//i=0 0-0 0-1
		//i=1 1-0 1-1
		//i=2 2-0 2-1
		
		/*
        # 無限ループ
		- 無限ループは反復回数を決めずに無限に反復文を実行する仕組み。
		- 最初に反復文を構成する時、開発者が事前に正確な反復回数を把握できなければ、
		無限ループを一旦構成しておき、特定の条件で終了できるようにコードを設計。
		
		- 一般的に正確な反復回数を知っていれば、for文、
		正確な反復回数が分からない場合は、whileによる無限ループを形成(while(true)、for(;;))
        */
		int i = 1;
		while(true) {
			
			if(i>50) break;
			
			System.out.println("おはようございます" + i);
			i++;
		}
		
		System.out.println("------------------------------------------");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("15 X 6 = ???");
			System.out.println("正解が分からなければ0を入力してください");
			System.out.println(">");
			int answer = sc.nextInt();
			
			if(answer == 90 ) {
				System.out.println("正解です!");
				break;
			} 
			
			else if(answer == 0)
			{				
				System.out.println("正解は90でした");
				break;
			}
			
			else {
				System.out.println("間違っています!");
			}
		}
		
	}
}
