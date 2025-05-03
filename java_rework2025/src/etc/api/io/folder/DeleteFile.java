package etc.api.io.folder;

import java.io.File;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.29
 */
public class DeleteFile {
	
	public static void main(String[] args) {
		
		File file =  new File("C:\\java_rework2025\\wow");
		//削除はいちいち消さなければならない！ 複数生成 x
		
//		if(file.exists()) {
//			file.delete();
//			System.out.println("削除済み!");
//      } else {
// 	    System.out.println("ファイル削除失敗or存在しない!");
//		}
		
		//複数のファイルを削除するロジック
		if(file.exists()) {
			if(file.isDirectory()) { //ファイルがディレクトリであることを確認
				File[] files = file.listFiles();
				for(int i=0; i<files.length; i++) {
					if(files[i].delete()) {
						System.out.println(files[i].getName()+ "削除成功!");
					} else {
						System.out.println(files[i].getName() + "削除失敗!");
					}
				}
			}
			if(file.delete()) {
				System.out.println("削除成功!");
			} else {
				System.out.println("削除失敗!");
			}
	    }
	}
}
