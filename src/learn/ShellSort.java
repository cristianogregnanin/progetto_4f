/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author pietro
 */
public class ShellSort {
    static private int x;

static public int[] sort(int[] a)
{
  int i, j, incremento, temp;
  x=a.length;

  incremento = 3;

  while (incremento > 0)
  {
    for (i = 0; i < x; i++)
    {
      j = i;
      temp = a[i];

      while ((j >= incremento) && (a[j - incremento] > temp))
      {
        a[j] = a[j - incremento];
        j = j - incremento;
      }
      a[j] = temp;
    }

    if (incremento / 2 != 0)
    {
      incremento = incremento / 2;
    }
    else if (incremento == 1)
    {
      incremento = 0;
    }
    else
    {
      incremento = 1;
    }
    
  }
  return a;
}
    
}
