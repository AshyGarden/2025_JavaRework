package javabasic.variables;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.21
 */
public class Identifier {
	// 識別する = 分別して調べる

	public static void main(String[] args) {
		// 必ず守らなければならない規則(守らない場合、エラーが発生することがあります。)
		// 識別子の名前は重複を許可しません。
		// そして、大文字と小文字を徹底的に区別します。

		int age = 35;
//		int age = 40;(x)
		int Age = 40;
		System.out.println(age); // 変数は小文字、クラスは大文字を推奨します
		System.out.println(Age);

		// 識別子名は数字で指定するか、数字で開始してはいけません。
		// int 700 = 365; (x) 変数は数字だけでは成り立ちません
		// int 7number = 7; (x) 変数開始は数字不可能
		int number7 = 7;
		int num7ber = 7;

		// 識別子名にスペースを含めることはできません。
//		int my birthday = 19921013; (x)
		int mybirthday = 19940206;
		int myBirthDay = 19940206; // 連結単語の頭文字を大文字(camel case)
		int my_birth_day = 19940206; // 連結単語が下線 (snake case)
		// 識別子の名前に書ける特殊文字は下線(_)、ドル記号($)だけです。
		// しかし使用を推奨しません
		// あの特殊文字は使用すると約束したところが指定されています。

		String $hello = "おはようございます"; // 可能です

		// キーワード（予約語）は識別子名で使用できません。
		// キーワードは既に何らかの機能を内包している指定文字です。
		// ex) int, static, void 等々

//		String class = "クラス"; (x)
		String Class = "クラス"; // (o) 不推奨
		String className = "クラス";

		// ハングルや漢字などの識別子名も指定可能です
		// しかし使用を推奨しません
		int 数字 = 7;
		String 名 = "ホン·ギルドン";
		System.out.println(数字);
		System.out.println("名");
		int sutja = 10; // コングリッシュ 自制

	}

}
