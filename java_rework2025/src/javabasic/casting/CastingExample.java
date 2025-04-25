package javabasic.casting;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.22
 */
public class CastingExample {
	
	public static void main(String[] args) {
		
		/*
		- サイズの小さいデータタイプの資料を大きなデータタイプに変換するときは
		Java仮想マシン(JVM)が自動的にタイプを上げて変換する(promotion, UpCasting)
		* */

		byte b = 10;
		int i = b;
		//タイプが合わなくても大きいタイプが小さいタイプを受ける場合は小さいタイプを大きいタイプに変換して挿入する。
		System.out.println(i);

		char c = 'A'; // charのアスキーコード値が 65
		int j = c;
		System.out.println("Aの文字番号:"+j);

		int k = 500;
		double d = k;
		System.out.println(d);
		
		
		/*
		 -サイズの大きいデータ タイプを値を小さいデータ タイプに変換するには
		 必ず型変換演算子:(type)を使用して明示的に型変換をしなければならない
		 (DownCasting)
		
		 -明示的に型変換をしなければならない理由
		 DownCastingの場合、保存スペースが減り、データ損失の可能性が常に存在するため
		 (overflow, underflowの可能性存在)
		*/
		
		int i2 = 72;
		char c2 = (char) i2; // 入ろうとする側のタイプを値の前に付ける
		System.out.println("72の文字値:" + c);


		//値の損失
		double d2 = 4.98765;
		int j2 = (int) d2;
		System.out.println(j2); // 整数型の値を4だけ残して小数点以下に捨てられる

		int k2 = 1000;
		byte b2 = (byte) k2;
		System.out.println(b2); //-24 = 2進数表現時(-)1111 1110の値

		//互いにタイプが異なる基本データの演算時には
		// データタイプが小さい方が大きい方に合わせて型変換が行われた後、演算が進行。

		char c3 = 'B'; //66번
		int i3 = 2;

		int intResult = c3+i3; // 大きい方に合わせられる
		char charResult = (char) (c3+i3);

		System.out.println(intResult); //
		System.out.println(charResult); //68번의 문자

		int k3 = 10;
		double dd1 = k3/4; //10/4はintの中で2になる。 したがって、dに2.0が挿入される
		System.out.println(dd1);

		double dd2 = (double) k3 / 4; // 方法1 変数を double に引き上げ
		System.out.println(dd2);

		double dd3 = k / 4.0; // 方法2 ミスの方を doubleで literalアップ
		System.out.println(dd3);
		//両方ともdoubleに変える理由がない、二つのうち一つを変えれば望む値が出る

		//intより小さいサイズのデータ演算は自動的に値がintに変換されて処理(データ損失防止)
		byte bb1 = 100;
		byte bb2 = 70;
		System.out.println(bb1+bb2); //値損傷X(JVMがデフォルト値はintに自動変換する)
	}
}
