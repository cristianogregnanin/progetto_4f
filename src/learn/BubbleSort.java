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
    public static void Sort(int[] arr){
//    int temp;
//		for (int i = 0; i < crunchifyArr.length - 1; i++) {
// 
//			for (int j = 1; j < crunchifyArr.length - i; j++) {
//				if (crunchifyArr[j - 1] > crunchifyArr[j]) {
//					temp = crunchifyArr[j - 1];
//					crunchifyArr[j - 1] = crunchifyArr[j];
//					crunchifyArr[j] = temp;
//				}
//			}
//			//log("Iteration " + (i + 1) + ": " + Arrays.toString(crunchifyArr));
//		}
//	return crunchifyArr;
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }                          
                 }  
      }
 }
}
