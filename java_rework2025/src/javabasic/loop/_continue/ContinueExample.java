package javabasic.loop._continue;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.25
 */
public class ContinueExample {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			if( i % 2 != 0 ) continue; //この過程をスキップします！
			System.out.print( i + " ");
		}
		System.out.println("\nリピート文終了");

	}

}
