package etc.api.io.util.random;

import java.util.Random;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.01
 */
public class RandomEx {

	public static void main(String[] args) {
		
		Random r = new Random();

		//実数乱数0.0 <= x < 1.0
		double d = r.nextDouble();
		System.out.println(d);
		
		//定数乱数
		int i= r.nextInt(); //int 全範囲
		System.out.println(i);
		
		//0~5 定数乱数(末尾の値未満)
		int j = r.nextInt(6); //5まで出なければならないので6を伝達！
		
		//10~100までの 定数乱数
		int k = r.nextInt(91) + 10; //0~90 + 10
		
		boolean flag = r.nextBoolean();
		System.out.println(flag);	
		
	}
}
