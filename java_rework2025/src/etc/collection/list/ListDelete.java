package etc.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.05
 */
public class ListDelete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		List<String> kakao = new ArrayList<>();
		Collections.addAll(kakao,"ㇺじ","ネオ","アピーチ","ライアン");
		System.out.println("現在保存されている友達:" + kakao);
		System.out.print("削除する友達を入力してください: ");
		String name = sc.next();
		
		/*
		　- 入力された名前をリスト内から削除してください。
　　		　削除後、結果も出力してください。
		　- なければない名前だと出力してください。
		 */
		
//		for(int i=0; i<kakao.size(); i++) {
//			if(kakao.get(i).equals(name)) {
//				flag = true;
//				kakao.remove(name);
//				System.out.println(kakao);			
//			} else if(!flag && i==kakao.size()-1) {
//				System.out.println("ないフレンズです.");	 			
//			}
//		}
		
		if(kakao.contains(name)) {
			kakao.remove(name);
			System.out.println(kakao);			
		} else {
			System.out.println("ないフレンズです.");	 
		}
		
		sc.close();
	}
}
