package javabasic.loop.LoopNesting;

import java.util.Scanner;

/*
	# 繰り返し文重畳(loop nesting)
	
	- 外部反復文の内部に内部反復文が存在する形態をとります
	反復文重畳と言います。
	
	繰り返し文自体を繰り返す必要がある場合は、重ね合わせを使用します。
	- 内部反復文が終了しても、外部反復文が終わらない場合は
	内部反復文は外部反復文の制御変数の大きさ及び範囲までです
	繰り返し実行されます。
*/

/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.25
 */
public class LoopNesting {
	
	public static void main(String[] args) {
		for(int dan=2; dan<=9; dan++) 
		{
			System.out.println("九九" + dan + "段");
			System.out.println("---------------");
			for(int hang=1; hang<=9; hang++) {
				System.out.printf("%d x %d = %d\n", dan, hang, dan*hang);
			}
			System.out.println("---------------");
		}

		/*
		-整数1個を入力して、その数字まで全ての小数を横出力して小数数を求めます

		ex) 30
		少数:~
		少数個数:n

		*/

		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力してください:");
		int input = sc.nextInt();
		int totalPrime =0;
		int count = 0;
		
		System.out.print("小数: ");
		for(int i=2; i<=input; i++){ // i: 2 から input 値まで 周期
		
			for(int j=1; j<=i; j++){ // 入力されている i に対して j を 1 から i まで 数えます
			
				if(i % j == 0) count++; // もしiがjで割れたら count++
			} //forムーン脱出時count増減凍結
		if(count==2){ // count=2 -> 小数(1と自分自身)
			totalPrime++; // 小数個++
			System.out.print(i + "); // この時、iは小数なので出力します");
		}
		count = 0; // 次の数字に移る前に count初期化
		}

		System.out.println();
		System.out.println("少数の個数:" + totalPrime);
		sc.close();
		sc.close();
	}
}
