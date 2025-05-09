package etc.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.05
 */
public class ListCompare {

	public static void main(String[] args) {
		
		/*
		 ArrayListは、探鳥口オブジェクトを参照する場合に有利
 		 Linked Listは、見つけた挿入·削除などでリストのサイズが変わる時、ガラス
		 サイズが大きくなければ大きな差はない。
		 */
			
		List<Integer> array = new ArrayList<>();
		List<Integer> linked = new LinkedList<>();
		
		for(int i=0; i<1000000; i++) {
			array.add(i);
			linked.add(i);
		}
		
		long start, end;
		start = System.currentTimeMillis();
	
		//配列リストからデータ制御
		for( int i=0; i<array.size(); i++) {
//			array.remove(0); //374ms
			array.get(i); //2ms
		}
		
		end = System.currentTimeMillis();
		System.out.printf("配列リストの所要時間: %dms\n", end - start);
		
		//割り当てリストからのデータ制御
		start = System.currentTimeMillis();
		for( int i=0; i<linked.size(); i++) {
//			linked.remove(0); //
			linked.get(i); //
		}
		
		end = System.currentTimeMillis();
		System.out.printf("割り当てリストの所要時間: %dms\n", end - start);
		
		
	}
	
}
