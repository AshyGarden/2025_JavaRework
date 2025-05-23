package oop.basic;

/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.20
 */

public class Pen {

	//オブジェクトのプロパティ フィールド（メンバー変数）と呼びます.
	String color;
	int price;
	
	//オブジェクトの機能をメソッドといいます.
	void write() {
		System.out.println(color+ "色を書きます.");
	}
	
	void priceInfo() {
		System.out.println(color+ "色ペンの値段は"+ price+"￥です。");
	}
			
}
