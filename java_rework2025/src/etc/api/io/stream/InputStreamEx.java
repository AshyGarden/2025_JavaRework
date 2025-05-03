package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.30
 */
public class InputStreamEx {
	
	public static void main(String[] args) {	
		/*
		 1. ファイルの読み込みに使用するクラスはFileInputStreamです。
		 2. 生成者の埋め込み値で読み込むファイルの完全なパスを書き込みます。
		 3. InputStreamオブジェクトは、生成者にthrowsがあるため
		 例外処理を行わなければなりません。
		 */
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\java_rework2025\\file\\hello.txt");
			
//			while(true) { // 方法1
//			 int data = fis.read(); // 1バイト単位でデータを読み込む。
//			 System.out.print((char) data); // 数字型を文字型に変換出力。
//			 if(data==-1) break; //read() マサードがこれ以上読む値がなければ-1を返還。
//			}
			byte[] arr = new byte[100];
			int result = fis.read(arr);
			System.out.println("読み込んだデータの長さ: " + result);
			System.out.println(Arrays.toString(arr));
			
			int i = 0;
			while(arr[i] != 0) {
				System.out.print((char)arr[i]);
				i++;
			}
			
		} catch (Exception e) { 
			e.printStackTrace(); //例外原因の逆追跡
		} finally {
			try {
				fis.close(); //ストリームを使用しなくなった場合、システムリソースを返却するコードを必ず作成!
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
