package oop.inherit;

/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.21
 *  */

public class InheritEx {

	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.name = "戦士1";
		w1.rage = 60;
		w1.charaterInfo();
		System.out.println();
	}	
	
}
