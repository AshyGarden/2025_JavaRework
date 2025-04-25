package javabasic.array;

import java.util.Arrays;
import java.util.Scanner;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.23
 */
public class ArrayBasic {
	
	public static void main(String[] args) {
		
		//#配列(array)
		//-> 同じデータタイプの値を集合形式で並べるための資料型

		//配列 変数宣言
		int[] arr; // ジャワ スタイル
		int arr2[]; // c言語 スタイル
		
		//配列 オブジェクトを生成 - 実際の値が保存される空間を形成
		//作成する時、配列の大きさを決めてください。
		arr = new int[5];
		
		//配列の初期化 - 配列内部に実際の値を保存
		//配列の初期化はインデックスを通じて行う
		//インデックスとは 配列内部の位置を指定できる値
		//インデックスは0番付から1つずつ順次増加
		
//		arr = 65;(x)
		arr[0] = 65; //(o) インデックス指定後、値代入
		arr[1] = 88;
		arr[2] = arr[0]; //2番インデックスに0番インデックスの値を代入して保存
//		arr[3] = 3.14;(x)
//		arr[4] = "入るかな"(x)
//
//		arr[5] = 77;  //インデックス範囲超過、実行時エラー(ランタイムエラーが起きる)(長さ5 -> インデックス4まであり！
// 	    arr[6] = 542; // エラーがないことに注意
		
		//配列の総サイズ(長さ)確認 -> 配列変数名。length
		System.out.println("arr配列の長さ:"+arr.length);

		//配列に保存された値を参照（使用）する方法（インデックス利用）
		
		System.out.println("配列の1番目のデータ: " + arr[0]);
		System.out.println("配列の2番目のデータ: " + arr[1]);
		System.out.println("配列の3番目のデータ: " + arr[2]);
		System.out.println("配列の4番目のデータ: " + arr[3]);
		System.out.println("配列の5番目のデータ: " + arr[4]);
		
		System.out.println("-----------------------------------------");
		
		//配列の繰り返し文処理
		//配列はインデックス番号を制御変数として画竜し、繰り返し文を簡単に処理可能
		for(int idx=0; idx<arr.length; idx++)
		{
			System.out.printf("配列の%d番目のデータ:%d\n", idx+1, arr[idx]);
		}
		//配列内部の要素値を文字列の形で一目で出力

		// System.out.println(arr); // 割れて見えない
		System.out.println(Arrays.toString(arr)); // 配列を文字列で表現	
		
		//配列の宣言と生成を同時にする
		double[] dArr = new double[3]; //doubleのデフォルト値 0.0
		String[] sArr = new String[4]; //stringのデフォルト値 null
		byte[] bArr = new byte[10]; //byteのデフォルト値 0

		//配列は生成されると同時に各タイプのデフォルトに自動初期化
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(bArr));
		
		//配列生成と同時に初期化も進める方法
		char[] letters = new char[] {'a','b','c','d'};
		System.out.println(Arrays.toString(letters));
		
		//宣言と同時に初期化時に1回だけ可能な文法（配列は生成時に大きさが固定されるため、伸びたり縮んだりすることはできない！）
		String[] hello = {"こんに", "ちは"};
		// names = {"一番"、"二番"}; (x)
		
		//もし配列の大きさを増やしたり減らしたいのであれば、既存の配列を操作するのではなく、新たに作成しなければならない
		hello = new String[] {"こんに", "ちは"}; 
		
		Scanner sc = new Scanner(System.in);
		String[] names = new String[6];
		for(int i=0; i<names.length; i++) {
			System.out.print("名前を入力してください");
			String name = sc.next();		
			/*
			 Javaでは文字列同等比較時「==」演算子を使えばちゃんと比較x
			-文字列Stringタイプがオブジェクト参照タイプであるため
			-オブジェクト参照タイプは、該当値を直接持っているのではなく、オブジェクトのアドレス値を持っているので、
			問題列が同じでも住所が違えばfalseを導出			
			- したがって、文字列同等比較を行う際には、[比較文字列1.equals(比較文字列2)]を使用
			 */		
			if(name.equals("やめて")) {//文字列は同等比較時 == 効かない、オブジェクトタイプは比較ボールか、
				System.out.println("入力終了");
				break;
			}	
			names[i] = name;
		}
		System.out.println("-------------------------------");
		//System.out.println(Arrays.toString(names));
		
		for(String n : names) {
			if(n==null) break;
			System.out.println(n + " ");
		}
		sc.close();

		//Modifier
		String[] foods = { "サムギョプサル", "豚足", "ピザ", "ハンバーガー"};
		System.out.println(Arrays.toString(foods));

		foods[0] = "チキン";
		foods[2] = "酢豚";
		System.out.println(Arrays.toString(foods));

		//配列のインデックス探索
		System.out.println("------------------------------------");
		Scanner sc2 = new Scanner(System.in);
		String name = sc2.next();
		int indexNum = 0;

		for (int i = 0; i < foods.length; i++) {
			System.out.printf("%d番目探索:%s%d\n", i + 1, foods[i], indexNum); // i番目の探索:食べ物の名前
			if (name.equals(foods[i])) { // 食べ物を 1番で探した
				System.out.println("探索完了");
				System.out.println("インデックス: " + i + "番");
				break;
			} else if(indexNum==foods.length-1){ // すべてのインデックスを回っても見つからなかった。			
				System.out.println("ない料理です");
				break;
			}
			indexNum++; // 食べ物がi番ではない+インデックス番号が増えるついでに増えた変数
		}
		// System.out.println(count);
		
		int[] arr3 = {1, 3, 5, 7, 9, 11, 13};
		
//		arr[3] = arr[4];
//		arr[4] = arr[5];
//		arr[5] = arr[6]; 
		
		//削除される値を基準に後ろにある値を1マスずつ前に引く作業。
		//今後生成される新しい配列に値をそのまま代入しやすく代入しようとする作業
		for(int i=3; i<arr3.length-1; i++) {
			//削除される値の地点、インデックスサイズ-1 (最後の値がないため、その値の前まで引っぱることができる)
			arr3[i] = arr3[i+1];
		}
		
		//従来の配列より大きさが一つ小さい新しい配列を生成
		int[] temp = new int[arr3.length-1];

		//雲本配列の値を新しい配列にインデックスを合わせてそのまま代入する
		//temp[0] = arr[0]; //~
		
		for(int j=0; j<temp.length; j++){
			temp[j] = arr[j];		
		}

		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(temp));
		
		arr3 = temp; // 元の配列のアドレスを仮のアドレスに変える
		temp= null; // 一時配列のアドレスを消去(tempは自動消滅)
		
		System.out.println(Arrays.toString(arr3));
		sc2.close();
	}

}
