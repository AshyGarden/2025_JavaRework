package javabasic._if;

import java.util.Scanner;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.23
 */
public class ifExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("点数を入力してください:");
		int point = sc.nextInt();
		System.out.println("現在のあなたの点数は: "+ point + "点です。");
		System.out.println("-------------------------");

		if(point>=70) {//条件が真の場合、二重括弧内の実行文を実行
			System.out.println("70点以上ですね。 合格です:)");
		} else {
			System.out.println("70点未満ですね。 不合格です:(");
		}
		System.out.println("試験お疲れ様でした");

		System.out.println("年齢を入力してください:");
		int age = sc.nextInt();

		if(age>=20) {
			System.out.println("成人です");
		} else if(age>=17) {
			System.out.println("高校生です");
		} else if(age>=14) {
			System.out.println("中学生です");
		} else if(age>=8) {
			System.out.println("小学生です");
		} else {
			System.out.println("未就学児です");
		}
		
		//if中帖はelseif文が最初の条件式がfalseの場合、分岐を分けたら
		//ifの重畳文は最初の重畳文がtrueの時に分岐を分ける方式
		/*
		# 変数の使用範囲(有効範囲)
		- 変数は宣言されたブロック内でのみ有効
		- 宣言されたブロックを離れると、メモリから自動的に消滅
		-変数宣言時の使用範囲をよく把握し
		全体的に使用する変数であれば、あらかじめ宣言しておき、
		地域的に使用する変数は、そのブロック範囲内でのみ使用して消滅させた方が良い。
		*/
		
		System.out.println("キーを入力してください:");
		int height = sc.nextInt();

		if(height>=140) {
			System.out.println("年齢を入力してください:");
			int age2 = sc.nextInt(); //if文まで有効
			
			if(age2>=8) {
				System.out.println("アトラクションにご搭乗いただけます。");
			} else if(age2 >= 6) {
				System.out.println("保護者同伴の場合、搭乗が可能です。");
			} else {
				System.out.println("年齢が6歳未満です。");
				System.out.println("アトラクションにご搭乗いただけません。");
			}
		} //ここからはage有効X
		else {
			System.out.println("身長が140cm未満です。");
			System.out.println("アトラクションにご搭乗いただけません。");
		}
		//System.out.println(age);
		sc.close();
		
	}
	
}
