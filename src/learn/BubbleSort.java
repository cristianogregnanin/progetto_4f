/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author nico99
 */
public class BubbleSort implements ISort {
    public static int[] Sort(int[] crunchifyArr){
    int temp;
		for (int i = 0; i < crunchifyArr.length - 1; i++) {
 
			for (int j = 1; j < crunchifyArr.length - i; j++) {
				if (crunchifyArr[j - 1] > crunchifyArr[j]) {
					temp = crunchifyArr[j - 1];
					crunchifyArr[j - 1] = crunchifyArr[j];
					crunchifyArr[j] = temp;
				}
			}
			//log("Iteration " + (i + 1) + ": " + Arrays.toString(crunchifyArr));
		}
		return crunchifyArr;
    }
}
