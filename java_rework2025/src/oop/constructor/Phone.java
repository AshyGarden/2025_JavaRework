package oop.constructor;

/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.21
 *  */

public class Phone {
	
	String model;
	String color;
	int price;
	
	/*
	 生成者(Constructor)
	 1. 生成者はオブジェクトを生成する役割をし、そのためクラス内部に必ず一つ以上存在しなければなりません。
	 2. もし、生成者が一つも存在しない場合、JVMが自動的に媒介変数が一つも存在しません
	    最も基本的な形態の生成子(default constructor)を一つ作ってくれます。
	 3. 生成者は必ずクラス名と大/小文字まで同一に作成して宣言、リターンタイプが存在しません。
	 4. 生成者の内部には、オブジェクトが生成されるとすぐに行うべきロジックを記述することができます。
	 
	 */
	
	//生成者宣言(宣言しない場合はJVMが基本生成してくれます)
	Phone(){ //基本生成者(パラメータx)
		System.out.println("基本生成者呼出!");
		model = "フォルダーフォン";
		color = "灰色";
		price = 200000;	
	}
	
	/*
	 生成者 オーバーローディング(重複宣言)
	　1. 作成者は重複宣言が可能です！
	　2. ただし、生成者のパラメータのタイプ、数、順序のいずれかが異なる場合に重複を認めます！
	 */
	Phone(String pModel){ //文字列を投げると、この生成者が呼び出されます
		System.out.println("2番目の生成者呼出");
		model = pModel;
		color = "白";
		price = 1000000;
	}

	Phone(String pModel, String pColor){ //文字列+色を投げると、この生成者が呼び出します
		System.out.println("3番目の生成者呼出");
		model = pModel;
		color = pColor;
		price = 1200000;
	}
	
	void showSpec() {
		System.out.println("***携帯情報***");
		System.out.println("モデル名: " + model);
		System.out.println("色: " + color);
		System.out.println("価格: " + price + "￥");
	}
}
