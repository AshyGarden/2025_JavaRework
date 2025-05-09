package etc.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.06
 */
public class ArrayListExample {

	public static void main(String[] args) {
		/*
		 #ArrayList
		 - 配列と異なってサイズが自動で調節される資料構造クラス。
		 - 配列と類似した形であるため、順次データにアクセスしやすい。
		 - インデックスを活用し、オブジェクトの重複保存を許可する。
		 */
		
		List<String> nick = new ArrayList<>(); // <> <-Generic(タイプ指定)
		
		String str = "猫";
		
		//リストに値を追加するマサードadd（オブジェクト）
		nick.add("犬");
		nick.add(str);
		nick.add(new String("カエル"));
		nick.add("鳥");
		nick.add("猫");
		System.out.println(nick);
		
		
		//(インデックス、オブジェクト):特定のインデックスにオブジェクトを挿入するマサード
		nick.add(3,"トラ");
		System.out.println(nick); //後ろにいる子たちが押し出される
		
		//get(インデックス):リスト内部のオブジェクトを参照するマサード
		// String name = nick[3]; // 配列式 方法
		String name = nick.get(3);
		System.out.println("3番インデックスの値:" + name);
		
		//size(): リストのサイズを返す
		 System.out.println("nickの大きさ: " + nick.size());
		 
		//set(インデックス、修正するオブジェクト):リスト内部のオブジェクトを修正してくれるマサード
		 nick.set(2, "ひよこ");
		 System.out.println(nick);
		
		//remove(インデックス)、remove(オブジェクト)
		nick.remove(5);
		System.out.println(nick);
		nick.remove(str); 
		System.out.println(nick);
		
		
		//リスト反復文処理
		for(int i=0; i<nick.size(); i++) {
			System.out.println(nick.get(i));
		}
		
		System.out.println("------------------------");
		
		//向上for文、foreach
		for(String n : nick) {
			System.out.println(n);
		}
		
		//contains（オブジェクト）:リスト内のオブジェクトの存在有無を把握するマサード
		System.out.println(nick.contains("小鉤")); //イナゴ
		
		
		//clear():リスト内部要素全体削除
		nick.clear();
		System.out.println(nick);

		//ieEmpty():リストが空かどうかを確認
		System.out.println(nick.isEmpty());

		//# コレクションオブジェクトはCollectionsの機能を使用可能
		//Collectionsコレクションオブジェクトの付加機能をサポート
		
//		List <int> score = new Array List <(); // 既定値はリスト不可
		List <Integer> score = new ArrayList<>(); //integer(オブジェクト形式)で書かなければならない！
		score.add(65);

		//一度にオブジェクトをたくさん追加する
		Collections.addAll(score, 78,100,88,79,100,21,56,100);
		System.out.println(score);
		
		//特定のオブジェクトの登場回数を求める
		System.out.println("100点 学生数: "+Collections.frequency(score, 100));		
		
		//最大、最小
		System.out.println("最大値: " + Collections.max(score));
		System.out.println("最小値: " + Collections.min(score));
		
		//昇順整列 (小さい値から順に大きくなる整列)
//		Collections.sort(score);
//		System.out.println(score);
		
		//降順整列(大きい値から順に小さくなる整列)
		// Collections.reverse(score); // 逆順配置
		Collections.sort(score, Collections.reverseOrder());
		System.out.println(score);
		
		//2つの要素の位置を入れ替える:swap(リスト、i、j)
		Collections.swap(score, 3, 7);
		System.out.println(score);
		
		//リスト内の要素をランダムに混ぜる
		Collections.shuffle(score);
		System.out.println(score);
		
		//お好みの値でコレクションを初期化
		Collections.fill(score, 100);
		System.out.println(score);
		
		
	}
	
}
