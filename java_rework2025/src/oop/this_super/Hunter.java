package oop.this_super;

public class Hunter extends Player{
	
	String pet;

	Hunter(String name) {
		super(name);
		this.pet = "ペット";
	}
	
	@Override
	void charaterInfo() {
		// TODO Auto-generated method stub
		super.charaterInfo();
		System.out.println("ハンターのペット: " + pet);
	}
}
