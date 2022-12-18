
//Find the element that appears once in an array where every other element appears twice
//2*(sum_of_array_without_duplicates) - (sum_of_array)


package Array.Searching;

import java.util.*;


public class Array_08_find_ele_once_appear_02 {
    public static void main(String[] args) {
        int[] array9={6,7,4,5,7,6,5};
        int n=array9.length;
        System.out.print("Element occur once is:"+singleElement(array9,n));
    }
    static int singleElement(int [] array9,int n)
    {
        HashMap<Integer,Integer> m= new HashMap<>();
        long sum1=0,sum2=0;
        for(int i=0;i<n;i++)
        {
            if(!m.containsKey(array9[i]))
            {
                sum1+=array9[i];
                m.put(array9[i],1);
            }
            sum2+=array9[i];
        }
        return (int) ((2*sum1)-sum2);
    }

}
