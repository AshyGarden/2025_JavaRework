package oop.basic;

/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.20
 */

public class MemberVariable {

	/*
	# メンバー変数(field(頻繁に使われる)、class member variable)
	1. クラス ブロックで宣言された変数を意味します。
	2. メモリのheap領域に保存され、値を初期化しなくても、各データタイプのデフォルト値に自動的に初期化されます。
	3. オブジェクトを指しているリファレンス変数（参照変数）が消えたり、アドレス値を失ったりすると、
	メモリからガベージコレクター（GC）によって自動的に削除されます。
	
	# 地域変数（local variable）（パラメータは地域変数の一種）
	1. メソッドや生成者(オブジェクトを生成する役割)ブロック内で宣言された変数を意味します。
	2. メモリのstack領域に保存され、宣言されたブロックを離れると、メモリから自動的に消滅します。
	3. 値を初期化しないと、変数を使用できません。
	*/
	
	int a; //クラスブロックにある - メンバー変数、フィールド（そのタイプの基本値で基本初期化=intなので0）
	
	void printNumber(int c) { //パラメータ（一種の地域変数）（値が伝達されるので値を初期化する必要X）
		int b =1 ; //メソッド内部で宣言 - 地域変数(初期化しない場合は使用不可)
		System.out.println("メンバー変数 a: "+a);
		System.out.println("地域変数 b: "+b);
		System.out.println("媒介変数 c: "+c);	
	}
	
	
	public static void main(String[] args) {
		
		MemberVariable m = new MemberVariable(); //オブジェクト作成
		m.printNumber(4); //参照演算(.)	
		
		/*
		 設計図に作成した属性と機能を使用するには、必ず実体（オブジェクト）を生成しなければならない。
		クラスだけ製作されたままでは何の機能も遂行できない。
		 */
		
		//オブジェクト生成文法:クラスタイプ変数名 = new クラス名();
		Pen redPen = new Pen();
		Pen bluePen = new Pen();
		Pen blackPen = new Pen();
		
		
		//参照演算子(.)を通じてオブジェクトにアクセスした後、属性を指定して機能を使用することができます。
		redPen.color = "赤";
		redPen.price = 500;
		bluePen.color = "青";
		bluePen.price = 600;
		blackPen.color = "黒";
		blackPen.price = 700;
		
		
		redPen.write();
		redPen.priceInfo();
		bluePen.write();
		bluePen.priceInfo();
		blackPen.write();
		blackPen.priceInfo();
	

		System.out.println(redPen);
		System.out.println(bluePen);
		System.out.println(blackPen);
	}
	
	
	
	
}
