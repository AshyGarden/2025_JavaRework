package javabasic.method;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.25
 */

/*
# メソッド(method)

- メソッドは、繰り返されるコード ブロックに名前を付けたものです。
- メソッドは繰り返されるコードを減らし、より構造化して私たちがコードを分かりやすくします。 (コードのモジュール化)
- メソッドは、宣言するプロセスと呼び出すプロセスに分けられます。

- メソッドの宣言は、メソッド内部では不可能です。
-新しいメソッドの宣言は、必ずメソッド ブロックの外部とクラス ブロックの内部でのみ可能です。

- メソッドの呼び出しは、メソッドまたは生成者の内部でのみ可能です。

- メソッドの呼び出しは、つまりメソッドを使用することを意味します、
1. メソッドが必要とするデータ（枚の値）を呼び出し部から渡すと
2. その値を受け取ってメソッド内部に伝達し、ロジックが実行されます。
3. 実行結果値をメソッドを呼び出した場所に戻します。
4. 返された値は、変数に入れて保存したり、出力したりするなど、さまざまに活用します。


# パラメーター (parameter, argument)
1. 媒介変数は、メソッドを呼び出す時、メソッド実行に必要な値をメソッド内部に伝達する媒介体の役割です
2. メソッド呼び出し部でどのような埋め込み値を伝達するかによって、メソッドの実行結果は異なる場合があります。
3. 売掛値をいくつ受け取って使用するかは、メソッドを宣言するときに宣言部で()内にあらかじめ個数とタイプを指定します。
4. 媒介変数の命名時、呼び出し者が宣言部に戻ってきて、枚の値を確認しないように、どんな値を入れる変数なのか、その意味を分かりやすくしてくだされば、お互いに良いです
5. パラメータを一つも宣言しない場合があります。この時、メソッド宣言部の内部を空にし、呼び出し時にも空にします


# リターン値リターンタイプ(return value, return type)
1. リターン値とは、マサードの実行結果値です
2. パラメータは複数存在できますが、戻り値は1つだけ存在する必要があります！
3. 伝達される値のタイプをリターンタイプといいます。 マサード宣言時、メソッド名の前に必ず返却タイプを宣言する必要があります
4. returnというキーワードを使用し、returnの後に伝達する値を指定(変数、定数)
5. 変換値のあるメソッドは、呼び出し文自体が一つの値で処理されることがありますので
戻り値を他の変数に代入可能、他のマッサッドの埋め込み値でも処理可能です
6. 全てのメソッドに返却値があるわけではありませんが、メソッド実行後に返却する値が特にない場合はreturnを省略しても構いません
7. returnを省略したい場合は、マサード宣言時voidというキーワードを作成する必要があります
8. 全てのマサードはリターンに出会うと強制的にマサードが終了します。 したがって、条件なしにリターン文の下にコードを作成することはできません
9. voidはreturnキーワードを脱出機能として使用できます  
*/

public class MethodExample {
	
	//メソッド宣言可能(普通ここでたくさんする)
	//メソッドの宣言（今はstatic貼り付け / ないと思います）
	static int calcTotal(int x){//メソッドの前に返却するタイプを記さなければなりません
		int total = 0;
		for(int i=0; i<=x; i++) {
			total +=i;
		}
		return total; // 計算された total を返します
	}

	//メソッド宣言可能

	//xからyまでの累積合計を求めるメソッド、媒介変数の数は最大255個です
	static int calcRangeTotal(int start, int end) {//媒介変数名を詳しく書くのが良いです
		int total = 0;
		// if(x>y) {
		// int temp = x;
		// x = y;
		// y = temp;
		// }
		
		for(int i=start; i<=end; i++){
			total += i;
		}
		return total;
	}
	
	//パラメータが必要ない場合
	static String selectRandomFood() {//メソッドはパラメータがなくても括弧は付けてくれます(関数形式)
	double rn = Math.random(); //0.0以上 1.0未満
		if(rn > 0.66) {
			return "チキン";
		} else if(rn > 0.33) {
			return "豚足";
		} else {
			return "サムギョプサル";
		}
	}
	
	//整数n個を伝達すると、その整数の合計をリターンするメソッド
	static int calcNumberTotal(int[] nums) {//個数未定(配列で送信)
		int total = 0;
	//  for(int i=0; i<nums。length; i++) { // 一般 for 文
	//			total += nums[i];
	//	}
		for(int n : nums) { //foreach文
			total += n;
		}
		
		return total;
	}
	
	//可変引数（可変パラメータ）を使用したパラメータ作成（n個を渡すとn個を受け取ってくれる感じ）
	//コンマで並んで入ってくる複数の値を配列でまとめて内部に伝達します
	static int calcNumberTotal2(int... nums) { //タイプ··· nums
											   //伝達するintの値をです 
		int total = 0;
		for(int i : nums) { 
			total += i;
		}
		return total;
	}
	
	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int[] operateTotal(int n1, int n2){
		return new int[] {n1+n2, n1-n2, n1*n2, n1/n2};
	}
	
	static double[] calcArrayTotal(int... nums){
		int total = 0;
		for(int i=0; i<nums.length; i++) {
			total += nums[i];
		}
		
		double avg = (double) total/nums.length;
		return new double[] {total, avg};
	}
	
	static void multi(int n1,int n2) {
		int result = n1 * n2;
		System.out.printf("%d x %d = %d\n", n1, n2, result);
	}
	
	static void divide(int n1, int n2) {
		if(n2 ==0) {
			System.out.println("0で割れません!");
			// break; continue; 両方ともvoidでは不可能です
			return; // void 可能
		}
		
		int result = n1 / n2;
		System.out.printf("%d / %d = %d\n", n1, n2, result);
	}
	
	public static void main(String[] args) {
		
		int total = calcTotal(10); ///関数を読み、値を代入します
		System.out.println(total);
		System.out.println("1~100累積合計: "+ calcTotal(100));

		int result =calcRangeTotal(3, 7);
		System.out.println(result);
		System.out.println("今日のお昼は何を食べましょうか???: " + selectRandomFood());
		
		int[] arr = {10, 30, 50, 70, 90, 110 };
		System.out.println("配列要素の合計は??:" + calcNumberTotal(arr));

		int sum = calcNumberTotal(new int[] {1,2,3,4,5,6,7}); //すぐに宣言も可能です
		System.out.println("累積和 :" + sum);
		
		//可変引数（可変パラメータ）を使用したパラメータ作成。
		//コンマで並べられて入ってくる複数の値を配列で束ねて内部に伝えます。
		int sum2 = calcNumberTotal2(1,2,3,4,5,6,7);
		System.out.println("누적합: "+sum2);
		
		int r1 = add(3, 8);   //int r1 = 11;
		int r2 = add(10, 15); //int r2 = 25;
		int r3 = add(add(4,6),add(7,8));
		System.out.println(r3);
		
		int[] totalResult = operateTotal(30, 6);	
		System.out.println("30+6 = " + totalResult[0]);
		System.out.println("30-6 = " + totalResult[1]);
		System.out.println("30*6 = " + totalResult[2]);
		System.out.println("30/6 = " + totalResult[3]);
		
		/*
		1. メソッド名は calcArrayTotal で定義
		2. このメソッドは、整数配列を1つ受け取り、その配列の内部にある
		全ての整数の合計（int）と平均（double）を'配列'に収めます
		リターンするメソッドです。
		3. 2番に定義した条件どおりメソッドを宣言し、実際にメインで呼び出して
		合計と平均（小数点第二位まで）を出力してもらいます。
		{57, 89, 78, 91, 93, 47}
		*/
		
		double[] value = calcArrayTotal(57,89,78,91,93,47);
		System.out.printf("%.0f %.2f",value[0],value[1]);
		System.out.printf("\n%d %.2f",(int) value[0],value[1]);
		
		/*
		 返戻値のないvoidタイプのメソッドは値が戻らないため、実行結果を変数に保存することができず、他のメソッドの埋め込み値としても使用不可です
		 -必ず単独呼び出し使用
		 -voidメソッドは単に動作を指示する役割を果たします
		*/
		
//		int r4 = multi(10, 7); //(x) //int 宣言 X
		// System.out.println(multi(10,7));//X)結果値が表示されないため
		multi(10, 7);
		multi(add(3,4),add(4,7));
		// add(multi(4,4),multi(5,6));//不可能

	}
		
		
	
}
