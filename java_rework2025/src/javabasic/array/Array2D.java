package javabasic.array;

import java.util.Arrays;
/** (/**)  
 * @author チェヨンジュン
 * @date 2025.04.23
 */
public class Array2D {
	
	public static void main(String[] args) {	
		/*
		 # 二次元配列
		-配列の中に配列が存在する形態を二次元配列という
		実際の配列には配列のアドレス値が入る
		*/
		
		int[] arr = {1,2,3};
		int[][] arr2D = {
				{1,2,3}, {4,5,6} , {7,8,9}, {10,11,12,13,14}};
		
		System.out.println(arr2D.length); // 配列(塊)をいくつ持っているか？
		System.out.println(Arrays.toString(arr2D)); //住所値
		System.out.println(Arrays.toString(arr2D[0])); //n番目の配列の塊の配列
		System.out.println(arr2D[0][2]); //配列内の順序まで定めた値

		System.out.println(Arrays.deepToString(arr2D)); //2次元配列内部のすべての配列を見せる
		System.out.println("--------------------------------------------------------");
		
		//空の二次元配列の作成
		int[][] arr2 = new int [3][4]; //配列塊3個配列内の値は4個ずつ存在可能
		arr2[1][2] = 50;
		arr2[2][1] = 75;
		
		for(int[] array : arr2) { //変数タイプ = int配列の塊
			for(int n :array) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
