package javabasic.datatype;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.22
 */
public class Datatype {
	
	public static void main(String[] args) {
		
		boolean b1 = true;
		boolean b2 = false;
		
// 		boolean b3 = True; //キーワード認識不可
// 		boolean b4 = False //キーワード認識不可
// 		boolean b5 = 0; // ジャワはだめ。 ただし、他の言語(C、JavaScrpitなど)は可能
// 		boolean b6 = "論理型タイプ"; 
		
		//実数リテラルの基本データタイプはdoubleである。
		float f1 = 7.12345f; //doubleをfloatに変換することはできない。 後付け
		double d1 = 7.12345;

		/////////////////////////////
		float f2 = 1.234567891234f; // 小数点7桁まで表示
		double d2 = 1.234567891234; // 小数点15桁まで表示
		
		System.out.println(f2);
		System.out.println(d2);
		
		byte  a = 127;         //1byte = 8 bit -2^7(bit-1) ~ 2^7 (bit-1)-1
		short b = 32767;       //short = 16bit -2^15(bit-1)~ 2^15(bit-1)-1
		int   c = 2147483647;  //int   = 32bit -2^31(bit-1)~ 2^31(bit-1)-1
//		long  d = 2147483648;  //long  = 64bit
		
		//literal value = 変数に保存される前の定数値
		//ジャワの整数リテラルはintであるため、その範囲を超える値であればエラー
		//したがってint範囲より大きい変数を表現するために後にL追加

		long d = 2147483648L; //long = 64bit
		//数字の後に"L"or"l"を付けると long と認識、大文字推奨（小文字は 1 と紛らわしい）

		char c1 = 'A';//単一文字データタイプ
		System.out.println(c1);

		// char c2 = 「AB」; // 2文字不可
		// char c3 = "A"; // 二重引用符(")は string用、charは無条件に 一重引用符(')

		char c4 = 65; // アスキーコードによって保存した値の文字を出力、65番の文字は A
		System.out.println(c4);
		
		char c5 = 97; // アスキーコードによって保存した値の文字を出力、97番の文字は a
		System.out.println(c5);

		char c6 = 44032; // ガ
		System.out.println(c6);
		//文字表番号 = マイナスなし

		/*
		# 文字列を保存できるデータタイプString
		- 保存したい文字列を二重引用符("")に入れて代入
		- Stringは基本データタイプではない！（Classタイプ）
		ただし、基本データタイプのように使用（実はオブジェクトタイプ）
		* */

		String s1 = "my dream"; // 空白、数字も文字扱い
		String s2 = "is a Programmer";
		System.out.println(s1);
		System.out.println(s2);
		
		//ジャワでは文字列の足し算演算を支援する。
		// 演算結果としては文字列を連結して結合した結果が導出される。
		System.out.println(s1 +" "+ s2); 
		
		//文字列と異なるデータタイプ間の演算
		//結果は無条件文字列の足し算演算と同じだ。
		
     	System.out.println("--------------------------");
     	
     	System.out.println( 100 + 100);
     	System.out.println("100" + "100");
     	System.out.println("100" + 100);
     	System.out.println( 3.14 + "Phi");
     	
     	int month = 10;
     	int day   = 13;
     	
     	//私の誕生日は10月13日です。
     	System.out.println("私の誕生日は" + month + "月" + day + "日です。");
	}
		
}
