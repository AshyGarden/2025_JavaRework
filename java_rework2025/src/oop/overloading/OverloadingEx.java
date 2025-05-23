package oop.overloading;

/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.22
 *  */

public class OverloadingEx {

	/*
	 #オーバーローディング(重複): 一つのクラス内で同じ名前のマッサードや生成者を複数重複して宣言できるようにする文法
	-オーバーローディング適用条件(中1個以上):
	1. パラメータのデータタイプが異なります
	2. 媒介変数の伝達順序が異なること
	3. パラメータ数が異なること 
	 */
	
	void inputData() {}
	
	void inputData(int a) {} //3番満足
	void inputData(int a, int b) {}	
//	void inputData(int b, int a) {} オーバーローディング不可(呼び出し時に区分しなければならない!)
	void inputData(String s) {} //1番満足
	void inputData(int a, double d) {}
	void inputData(double d, int a) {} //2番満足
//	void inputData(int number) {} //整数毎個値1個を受け取るマサードがすでに宣言されています
	
//	int inputData(int number) {//オーバーローディング不可(返却タイプはオーバーローディングに影響を及ぼさない)
//		return 0;
//	}
	int calcRectArea(int a) {
		return a * a;
	}
	
	int calcRectArea(int horizontal, int vertical) {
		return horizontal * vertical;
	}
	
	double calcRectArea(int upper, int lower, int height) {
		return (upper+lower)/2.0 * height;
	}
	
	public static void main(String[] args) {
		/*
        - CalculatorクラスにcalcRectArea()メソッドを宣言します
		1. 長さを 1 つだけ渡すと、正方形の広さをリターンします。
		2. 長さを2つ渡すと、（縦、横）長方形の広さをリターンします。
		3. 長さを三つ伝達すると（底辺、上辺、高さ）台形の広さをリターンします
        */
		OverloadingEx calc = new OverloadingEx();
	
		//calc.calcRectArea(5);
		System.out.println("長さ 5인 丈正方形面積 =  " + calc.calcRectArea(5));
		System.out.println("縦十横二十人長方形 =  " + calc.calcRectArea(10, 20));
		System.out.println("上辺5·下辺13·高さ7のはしご形広さ =  " + calc.calcRectArea(5,13,7));
		

	}
	
}
