package javabasic.variables;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.21
 */
public class VariableExamples {
	public static void main(String[] args) {
		/*	 
		 # 変数 (Variable)
		 1. データが保存される空間に名前を付けておいたものです。
		 2. 変数は、作成時に変数に保存されるデータのサイズと形状によって異なります
		 適切なデータ タイプを宣言する必要があります。
		 ex)int:4バイトの整数、String:文字列(文章)
		 3. 変数は同じ名前で重複宣言できません。
		 4. 変数内部の値はいつでも変更できます。
		*/
		
		//変数の宣言: [資料型（データタイプ）] [変数名];
		int age;
		
		//変数の初期化（最初の値を入れる行為、initialization（init））:
		// =-> assignment（割り当てます）
		// [変数名] = [値];
		age = 40; // 左側の領域に右側の値を代入（割り当て）します。
		
		
		//変数の値参照(使用)
		System.out.println(age);
		
		//変数は宣言と初期化を同時にすることができます。
		//最初に作る時に一度だけ可能です。
		
		int score = 90;
		//int score = 95;(X) // 変数重複宣言
		//変数は一つあたりの値を一つしか代入できませんので
		//既存の値が消滅し、新しい値が割り当てられます。
		score = 95; // 以前の値を代替して入ります
		System.out.println(score);
		
		//変数には、他の変数の値も保存できます。
		int myScore = score -20;
		System.out.println(myScore);
		
		
		//変数のデータ型に合わないデータは保存できません。
		//int count = "一度"; (x)
		//int count = 23.5;  (x)
		//String str = 100;  (x)
		
		//変数は資料型（データタイプ）が異なっても
		//名前が同じなら重複宣言できません。
		String name = "ホン·ギルドン";
		// int name = 1004; (x)

		//宣言及び初期化していない変数は使用できません。(値のない変数は使用不可)
//		int result = myScore + num; (x)
		int result;
//		System.out.println(result); //(x)
		
	}
}
