package etc.api.io.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.02
 */
public class BufferWriter {
	
	public static void main(String[] args) {
		
		/*
		 # Buffered I/O
		 - バッファを利用して読み書き性能を向上させるクラス。
		 - バッファ:データを入出力する前に一時的に保存しておく配列形態の空間。

		 # バッファを利用しなければならない理由
		 - バッファを使用しないと入/出力が頻繁に起こる。
		 ex)
		 "Java Programming"を書く場合
		 ->基本Output Streamを使用すると、一文字ずつ16回の出力が発生。
		 ->バッファに保存しておいて、一度に使えば一度の出力で終わるんじゃないですか？
		 */
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("C:\\Work\\file\\merong2.txt");
			bw = new BufferedWriter(fw);
			
			System.out.print("冒頭の文章: ");
			String str1 = sc.nextLine();
			
			System.out.print("二つ目の文章: ");
			String str2 = sc.nextLine();
			
			bw.write(str1 + "\r\n" + str2);
			
			System.out.println("ファイル正常出力完了!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
