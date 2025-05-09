package etc.collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.08
 */
public class HashSetExample {

	public static void main(String[] args) {
		
		/*
		 # Set
		 - 集合を具現化したインターフェース
		 -要素として同じように実装されてくることを許さない
		
		 # Hash
		 - ある値を入れた時、全く予測できない値が生成されなければならないアルゴリズム
		 - 予測できない値を利用するため、ソートが不可能。
		 - 生成された値で元の値を探すことも不可能に近い。
		 - 元の値に戻れない一方向性アルゴリズム
		 - 高速でセキュリティに優れたアルゴリズム。 オブジェクトのアドレス値を割り当てたり
		   暗号化アルゴリズムでよく使われます。
		 */
		
		Set<String> set = new HashSet<>();
		
		////オブジェクトを保存:add（オブジェクト）
		set.add("JAVA");
		set.add("JSP");
		set.add("Spring");
		set.add("Oracle");
		Collections.addAll(set, "Mysql", "JAVA");
		System.out.println(set);
		
		//setのサイズを確認する: size()
		System.out.println("set의 크기: " + set.size());
		
		/*
		 - setはインデックスがないのでメソッドを利用してオブジェクトを得るのではなく
		 リピート(Iterator)を通じて要素を一つずつ取り出してみる必要があります。
		 リピートオブジェクトは、setインタフェースが提供するiterator()を呼び出し
		 得てきます。
		 */
		
		Iterator<String> iter = set.iterator();
		
		/*
		 Iteratorオブジェクトのメソッドnext()により
		 内部要素を1つずつ取り出すことができます。
		 next()を要素の数より多く呼び出すと
		 NoSuchElement例外が発生します。
		
		 hasNext() -> 反復者が持っているオブジェクトをもっと持ってくることができるかの
		 可否を確認するメソッドを通じてnext()を呼び出す必要があります。
		 */
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("---------------------------------");
		//向上for 文 = iterator使用
		
		for(String s:set) {
			System.out.println(s);
		}
			
		//setからオブジェクトを削除 remove(オブジェクト);
		set.remove("JSP");
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
	}
	
}
