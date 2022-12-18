
// Find the repetitive element between 1 to N-1

package Array.Searching;

import java.util.*;

public class Array_09_repetitive_ele {
    public static void main(String[] args) {
    int [] array10={3,7,8,5,4,6,9,2,1,4};
    int n=array10.length;
        System.out.println("Repetitive element is: "+findRepetitive(array10,n));
    }

     static int findRepetitive(int[] array10, int n) {
         HashSet <Integer> s =new HashSet<Integer>();
         for (int i = 0; i < n; i++) {
             if(s.contains(array10[i]))
                 return array10[i];
             s.add(array10[i]);
         }
         return  -1;
     }
}
