package oop.constructor;

/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.21
 *  */

public class BasicConstructor {
	
	public static void main(String[] args) {
		
		Phone basic = new Phone();

//		basic.model = "フォルダーフォン";
//		basic.color = "灰色";
//		basic.price = 200000;	
		basic.showSpec();
		
		System.out.println("------------------------------------");
		Phone galaxy23 = new Phone("ギャラクシー23"); //文字列呼出o
		galaxy23.showSpec();
		
		System.out.println("------------------------------------");
		Phone iPhone14 = new Phone("アイフォン14", "スペースグレー"); //文字列呼出o
		iPhone14.showSpec();
		
	}

}
