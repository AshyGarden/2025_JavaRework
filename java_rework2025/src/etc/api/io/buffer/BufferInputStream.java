package etc.api.io.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.05.02
 */
public class BufferInputStream {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("C:\\Work\\file\\hello.txt");
			bis = new BufferedInputStream(fis);
			
			/*
			 - read(): 1バイトをintで読み込む
			 - read(byte[]): 伝達したbyte[]の大きさだけ満たしてくれる。
			 伝達した配列に何 byte を満たしたかを返す。
			 - read(byte[], off, len)
			 : 配信したbyte[]中にoffからlenまでデータを満たす
			 */
			
			int b;
			while((b=bis.read())!= -1) {
				System.out.print((char)b);
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
