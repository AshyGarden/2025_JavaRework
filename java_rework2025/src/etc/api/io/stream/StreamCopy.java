package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.30
 */
public class StreamCopy {

	public static void main(String[] args) {
		
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		try {
			oldFile = new FileInputStream("C:\\java_rework2025\\file\\Planet.jpg");
			newFile = new FileOutputStream("C:\\Users\\CYJ\\Desktop\\copy.jpg");
	
		byte[] arr = new byte[100];
		while(true) {
			//読むデータがあれば読んだデータの長さが返還、なければ-1返還
			int result = oldFile.read(arr);
			if(result ==-1) break;
			
			//バイト単位で0から読んだサイズまでのファイルを作成
			newFile.write(arr,0,result);
		}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
