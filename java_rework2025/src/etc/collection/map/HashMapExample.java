package etc.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.07
 */
public class HashMapExample {
	
	public static void main(String[] args) {
		/*
		 # Map
		 - Key/Valueがセットになる構造
	     - Key値を通じてValueを参照する方式
		 - Keyは重複保存を許さない！	  
		 */
		
		//MapはKey、valueペアを成すため、マルチジェネリックを設定!
		Map<String, String> map = new HashMap<>();
		
		//Mapにデータを追加するマサード: put(key, value)
		map.put("ワンワン","キムチョルス");
		map.put("にゃんこ","ホン·ギルドン");
		map.put("チュンチュンイ","パクヨンヒ");
		System.out.println(map);
		
		//MapはKeyの重複保存を許可しません。
		//もし重複キーを使用してputを呼び出すと、Valueだけが修正されます。
		map.put("ワンワン","キムポピ"); //key重複(既存のvalueが修正値に変わります)
		map.put("オフンイ","ホン·ギルドン"); // value重複
		System.out.println(map);
		
		//Map内部にキーの存在有無を確認するメソッド:Contains Key(key)
		System.out.println(map.containsKey("メロン"));

		//Map内部の値を参照する方法:get(key)
		String name = "小鉤";
		if(map.containsKey(name)) {
			System.out.printf("%s.の あだなを もつがくせいは %sです\n", name, map.get(name));						
		} else {
			System.out.println("そんなニックネームを持つ学生はいませんよ~");
		}
		
		//map의 크기를 확인하는 매서드 size()
		System.out.println("map의 크기는 " + map.size());
		
		//Mapからkeyだけを抽出するマサード:keySet()
		//すべてのキーをSetに入れて返します。
		Set<String> keys = map.keySet();
		
		for(String s: keys) {
			System.out.println(s+":"+map.get(s));
		}
		
		//Mapのオブジェクト削除: remove(key)
		//keyを与えるとvalueも一緒に除去
		map.remove("にゃんこ");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		
	}
}
