/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author Pudda
 */
public class InsertionSort{

    /**
     *
     * @param lista
     */
    public static void Sort(int lista[]) {
         int temp;
         for (int i = 1; i < lista.length; i++) {
             for(int j = i ; j > 0 ; j--){
                 if(lista[j] < lista[j-1]){
                     temp = lista[j];
                     lista[j] = lista[j-1];
                     lista[j-1] = temp;
                 }
             }
         }
     }
}
