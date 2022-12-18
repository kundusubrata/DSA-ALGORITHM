
// Check if a pair exist with given sum in given array
// Two sum using Hashing



package Array.Searching;

import java.util.HashSet;

public class Array_10_pair_sum_03 {
    public static void main(String[] args) {
        int [] array13= { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        printPairs(array13,n);
    }

    static void printPairs(int[] array13, int n) {
        HashSet<Integer> s =new HashSet<Integer>();
        for(int i=0;i<array13.length;i++)
        {
            int temp=n-array13[i];
            if(s.contains(temp))
            {
                System.out.println("Yes");
                return;
            }
            s.add(array13[i]);
        }
        System.out.println("No");
    }
}
