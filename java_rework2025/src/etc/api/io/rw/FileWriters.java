package etc.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.28
 */
public class FileWriters {
	
	public static void main(String[] args) {
		
		/*
		 - 文字を書いて保存するときに使用するクラスFileWriterです。
		 - 基本的に2バイト単位での処理に適しています
		 */
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:\\java_rework2025\\file\\hello2.txt");
			
			// \r: キャリッジ リターン -> カーソルを使わないと他のオペレーティングシステムでエラーが発生
			// \n: 改行
			// 状況と環境によって行脚時にカーソルを一番前に引っ張らない場合があるので、両方とも書いてください
			String str = "今日は4月28日です。\r\n月曜日です。\r\nところで、どうしてまだ月曜日なんですか？"; 
			
			fw.write(str);
			System.out.println("ファイルが正常に保存されました.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}
