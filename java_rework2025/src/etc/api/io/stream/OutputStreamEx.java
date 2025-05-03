package etc.api.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.30
 */
public class OutputStreamEx {
	
	public static void main(String[] args) {	
		/* 
		 1. ファイル作成時に使用するクラスはFile Output Streamです。
		 2. 生成者の埋め込み値でファイルを書き込むフルパスを指定します。
		 3. ioパッケージのすべてのクラスは、生成者にthrowsキーワードがあるため
		 try-catchブロックを常に作成しなければならない。
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ファイル名: ");
		String fileName = sc.next();
		FileOutputStream fos = null;
		                                                                 
		try {                                                                //バックスラッシュ1個だけ作成時に脱出コードとして認識、それでfileの後に2個作成
			fos = new FileOutputStream("C:\\java_rework2025\\file\\" + fileName + ".txt"); //ファイル作成パス
			System.out.print("文章を入力してください:"); //または正スラッシュ1個でもかまいませんx
			sc.nextLine(); // 上にnextのエンターラインで
			String str = sc.nextLine();

			byte[] arr = str.getBytes(); // 問題列データをバイトデータに変換。
			fos.write(arr); // ファイルをバイト単位で書き下ろす;
			System.out.println("ファイルが正常に保存されました。");	        
		} catch (Exception e) {                
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
