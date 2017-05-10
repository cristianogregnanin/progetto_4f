/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author aleleo
 */
public class BitonicSort {
    static boolean ASCENDING=true,DESCENDING=false;
    public static int[] sort(int vet[],int lo, int cnt, boolean dir)
    {
        if (cnt > 1)
        {
            int k = cnt / 2;
            sort(vet,lo, k, ASCENDING);
            sort(vet,lo + k, k, DESCENDING);
            bitonicMerge(vet,lo, cnt, dir);
        }
        return vet;
    }

    /**
     * The procedure bitonicMerge recursively sorts a bitonic sequence in
     * ascending order, if dir = ASCENDING, and in descending order otherwise.
     * The sequence to be sorted starts at index position lo, the number of
     * elements is cnt.
     *
     */
    static private void bitonicMerge(int vet[], int lo, int cnt, boolean dir)
    {
        if (cnt > 1)
        {
            int k = cnt / 2;
            int i;
            for (i = lo; i < lo + k; i++)
            {
                compare(vet,i, i + k, dir);
            }
            bitonicMerge(vet,lo, k, dir);
            bitonicMerge(vet,lo + k, k, dir);
        }
    }

    /**
     * A comparator is modelled by the procedure compare, where the parameter
     * dir indicates the sorting direction. If dir is ASCENDING and a[i] > a[j]
     * is true or dir is DESCENDING and a[i] > a[j] is false then a[i] and a[j]
     * are interchanged.
     *
     */
   static private void compare(int vet[],int i, int j, boolean dir)
    {
        if (dir == (vet[i] > vet[j]))
        {
            int h = vet[i];
            vet[i] = vet[j];
            vet[j] = h;
        }
    }
    
}
