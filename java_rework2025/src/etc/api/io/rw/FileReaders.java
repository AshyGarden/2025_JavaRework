package etc.api.io.rw;

import java.io.FileReader;
import java.io.IOException;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.28
 */
public class FileReaders {
	
	public static void main(String[] args) {

		/*
		 - 文字ベースで読み込むクラスはFileReaderです。
		 - 2バイト単位で読むため、文字の読み込みに適しています。
		 */
		
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\\\java_rework2025\\\\file\\\\hello2.txt");
			
			char[] arr = new char[100]; //100個の固定個数ではない
			
			int result = fr.read(arr);
			System.out.println("文字数: " + result);
			for(char c: arr) {
				System.out.print(c);
				if(c==0) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}
}
