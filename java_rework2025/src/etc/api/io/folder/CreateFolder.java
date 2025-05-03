package etc.api.io.folder;

import java.io.File;

/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.29
 */
public class CreateFolder {
	
	public static void main(String[] args) {
		
		/*
		 - Javaで外部経路でフォルダを作成する時はFileクラスを使用
		 - 生成者の埋め込み値でフォルダーを生成するパス + フォルダー名を指定します。
		 */
		
		File file = new File("C:\\java_rework2025\\wow");
//		File file2 = new File("C:\\java_rework2025\\wow\\test\\mytest\\apple");
		
		if(!file.exists()){ // 宣言したパスにファイルやフォルダが存在する場合true、存在しない場合はfalse
			file.mkdir(); //makediretory(1つだけ生成!、作りたい経路のサウイディレクトリが存在しない場合は動作しない。)
			// file.mkdirs(); //makediretories(複数とも生成!)
			System.out.println("フォルダ作成完了!");
		} else {
			System.out.println("該当フォルダが存在します.");
		}
		
	}

}
