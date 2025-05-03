package etc.api.io.buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.02
 */
public class BufferdReader {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\Work\\file\\merong2.txt");
			br = new BufferedReader(fr);
			
			//Buffered ReaderにはreadLine()メソッドがあり
			//一行を丸読みしてStringにリターンします。
			// これ以上読み込むデータがなければnullをリターン。
			
//			System.out.println(br.readLine());
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
