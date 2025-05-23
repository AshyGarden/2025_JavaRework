package oop.this_super;

public class Player {
	
	String name;
	int level;
	int atk;
	int hp;
	
	/*
	 # this   
	   thisとは自分自身のオブジェクトを指すキーワードです
	 - 生成者またはメソッド内でthisを使用すると、thisはその生成者またはメソッドを呼び出したオブジェクトのアドレス値が表示されます。
	 - this()を使用して同じクラス内の他の生成者を呼び出すことができます
	 この時、パラメータの宣言に従って括弧内の適切な値を渡せばいいです。
	*/
	
	//オブジェクトごとに隠されたフィールド(this)を持っています
	Player(){
		System.out.println("Playerのデフォルト作成者呼び出し!");
//		System.out.println("thisのアドレス値: "+this);
	this.level = 1;
	this.atk = 3;
	this.hp = 50;
	}
	
	Player(String name){
		this();//同じクラスに異なる作成者を呼び出します
		System.out.println("Playerの2番目の作成者呼び出し!");
//		System.out.println("thisのアドレス値: "+this);
//		level = 1;
//		atk = 3;
//		hp = 50;
		this.name = name; //自分自身のアドレス値 = 生成者を呼び出したそのオブジェクト!
	}
	
	
	Player(String name, int hp){
		//他の生成者呼び出しは必ず最上段に位置しなければなりません
		this(name); //他の生成者が受け取ることができれば、その値をめくる(2番生成者+hp)
		System.out.println("Playerの3番目の作成者呼び出し!");
		//this.name = name;
		this.hp = hp;
	}
	
	//すべての職業が入ることができます
	void Attack(Player target) { //多型実装コード例
//		System.out.println("target: "+ target);
//		System.out.println(this);
		
		if(this == target){
			System.out.println("自分では殴れません");
			return;
		}
		
		//xがyを攻撃します。 //殴るやつの住所値+名前//合うやつの住所値+名前
		System.out.printf("%sが%sを攻撃します. ",this.name,target.name);
	
		//相手の体力10ダウン、自分は体力5回復
		target.hp -=10;
		this.hp +=5;
		System.out.printf(" 私の体力%d、相手の体力 %d\n",this.hp,target.hp);		
	}
	
	void charaterInfo() {
		System.out.println("*** キャラクター情報 ***");
		System.out.println("キャラクター名: " + name);
		System.out.println("レベル: " + level );
		System.out.println("攻撃力: " + atk );
		System.out.println("体力: " + hp);
//		System.out.println("今このメソッドを呼び出したオブジェクトの名前です: "+this.name);
	}
}
