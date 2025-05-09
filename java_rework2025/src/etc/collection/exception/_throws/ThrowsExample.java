package etc.collection.exception._throws;

/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.09
 */
public class ThrowsExample {
	
	static String[] greetings = {"こんにちは","おはいおございます","こんばんは"};
	/* throws
	- throwsは例外原因がメソッド宣言部ではなく呼び出し部にある場合、例外処理をメソッドの呼び出し部に押し付ける方式
	- throwsは生成者でも宣言が可能で、メソッドや生成者を呼び出す時に例外処理を強要したい時に使用
	-また、希望する領域に例外をまとめて一度に処理することも可能
	*/

	static void greet(int idx) throws Exception {
		System.out.println(greetings[idx]);
	}
	public static void main(String[] args) {
		
		try {
			greet(3);
		} catch (Exception e) {
			//printStackTrace()メソッドは例外発生原因を逆追跡して
			//例外がどこで発生したのか、その理由は何なのかを
			//メッセージを通じて開発者に伝えるのでよく使うメソッドです。
			e.printStackTrace();
		}
		

	}
}
