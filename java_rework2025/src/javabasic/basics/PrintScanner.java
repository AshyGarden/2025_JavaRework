package javabasic.basics;

import java.util.Scanner;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.21
 */
public class PrintScanner {

	public static void main(String[] args) {
		//ジャワの標準出力形式は大きく3つです。
		//改行を含まない print(); 改行(改行)
		//自動的に改行を含むprintln();
		
		System.out.print("Hello~"); // 出力後すぐ後ろにカーソル位置
		System.out.println("Java!"); //出力後、一行下げてカーソル位置
		System.out.print("Sad~ "); 		
		System.out.println("Bye!"); 		
		
		//形式指定出力関数 printf();
		//書式文字を利用して文字列を完成させた後、
		//書式文字に入る値を指定して出力する方式
		//自動改行X

		//# フォーマッティング書式文字種類)(printfのみ使用)
		//%d:符号付き整数データ(decimal)
		//%f: ミスデータ(floation point)
		//%s:文字列(String)
		
		// # 脱出コード(escape code) -> print, println, printf 全て動作
		// - 必ず引用符内に位置
		// - 文字列内で特定の命令を出したい時に使用する特殊記号
		// \n: 列改行命令
		// \t:横スペース 4マス(スペース4マス = tab 1番)
		
		int month = 12;
		int day = 25;
		String anni = "クリスマス";
//		12月25日はクリスマスです。		
		System.out.println(month + "月" + day + "日は" + anni + "です。");
		System.out.printf("%d月%d日は%sです。\n" , month, day, anni); // %d = 整数, %s = 文字

		// ミスを表現する書式文字%f -> 基本6桁まで表現
		//%.[桁を指定する数字] f - > 希望する桁まで表現
		//%という文字自体を表現 -> %%	
		double rate = 64.126;
		System.out.printf("合格率は%fです。\n", rate);
		System.out.printf("合格率は%.2fです。", rate); // 小数点2桁に四捨五入
		System.out.printf("合格率は%.2f%です。", rate); // % = 文字で %が 出力
		
		/* - スキャナーを使って名前と年齢を入力してもらい
		名前:XXX
		年齢: xx歳
		出生年度:xxx年
		を出力（出生年度を入力してもらえない） */

		Scanner sc = new Scanner(System.in);

		System.out.print("名前を入力してください:");
		String name = sc.nextLine();
		System.out.printf("お会いできて嬉しいです。 %s様\n",name);
		System.out.print("現在おいくつですか?:");
		int age = sc.nextInt();
		System.out.printf("現在%s様の年齢は%d歳(が)で出生年度は%d年なんですね", name, age, 2023-age + 1);
		sc.close();

		/* Scannerの関数を利用してデータを入力することができます。
		- next():空白のない文字列を入力してもらう
		- next Line():空白を含む文字を入力してもらいます。
		- next+基本タイプ名():該当タイプに合ったデータを入力してもらいます。
		nextInt():定数データを入力してもらう
		next Double():ミスデータを入力してもらう。 */

		System.out.print("名前を入力してください:");
		//String name = sc.next(); //next():空白があれば空白の前までしか受け付けない
		//String name = sc.nextLine();
		System.out.printf("\nはじめまして%s様",name); // もし チェ ヨンジュン-> 'チェ'だけ出力

		System.out.print("\n年齢を入力してください: ");
		//int age = sc.nextInt();
		System.out.printf("\nお会いできて嬉しいです%s様！ 年は%dですね。」",name,age);
		//プログラムが動作するか確認してctrl+f11

		//4. Scannerオブジェクト返却
		//オブジェクトを返却 -> Scannerをメモリから解除
		
		sc.close();
	}

}
