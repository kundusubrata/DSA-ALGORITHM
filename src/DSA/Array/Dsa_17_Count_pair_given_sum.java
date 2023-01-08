package DSA.Array;

import java.util.HashMap;

public class Dsa_17_Count_pair_given_sum {
    public static void main(String[] args) {
        int [] arr19 = { 1, 5, 7, -1, 5 };
        int n = arr19.length;
        int sum = 6;
        System.out.print("Count of pairs is "
                + getPairsCount(arr19, n, sum));
    }

    static int getPairsCount(int[] arr19, int n, int sum) {
        HashMap<Integer,Integer> m =new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(m.containsKey(sum-arr19[i]))
            {
                count+=m.get(sum-arr19[i]);
            }
            if(m.containsKey(arr19[i]))
            {
                m.put(arr19[i],m.get(arr19[i])+1);
            }
            else
            {
                m.put(arr19[i],1);
            }
        }
        return count;
    }
}
