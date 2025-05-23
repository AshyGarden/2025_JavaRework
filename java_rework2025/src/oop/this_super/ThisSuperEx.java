package oop.this_super;

/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.23
 *  */

public class ThisSuperEx {
	
	public static void main(String[] args) {
		
		Mage m1  = new Mage("マジシャン1");
		m1.charaterInfo();
		Hunter h1 = new Hunter("ハンター1");
		h1.charaterInfo();
		
		h1.Attack(m1);
		m1.Attack(h1);
		
	}
	

}
