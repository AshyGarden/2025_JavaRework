package oop.inherit;

/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.21
 *  */

public class Player {
	
	/*
	#親クラス、上位クラス(Parent、super class)
	- データを他のクラスに継承するクラスを親クラス
	- 継承を使用すると、データを継承するクラスに親クラスのメンバー変数（フィールド）とメソッドが継承されます。
	  ただし、生成者は継承されません
	*/
	
	String name;
	int level;
	int atk;
	int hp;
	
	void charaterInfo() {
		System.out.println("*** キャラクター情報 ***");
		System.out.println("キャラクター名: " + name);
		System.out.println("レベル: " + level );
		System.out.println("攻撃力: " + atk );
		System.out.println("体力: " + hp);
	}
	
}
