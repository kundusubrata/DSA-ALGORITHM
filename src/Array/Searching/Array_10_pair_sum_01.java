
// Check if a pair exist with given sum in given array
// Two sum using sorting and Two pointers Technique


package Array.Searching;

import java.util.Arrays;

public class Array_10_pair_sum_01 {
    public static void main(String[] args) {
        int [] array11= { 1, 4, 45, 6, 10, -8 };
        int sum=14;
        int size=array11.length;

        if(checkSum(array11,sum,size))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean checkSum(int[] array11, int sum, int size) {
        int l,r;
        Arrays.sort(array11);
        l=0;
        r=size-1;

        while(l<r)
        {
            if((array11[l]+array11[r])==sum)
                return true;
            else if((array11[l]+array11[r])>sum)
                r--;
            else
                l++;
        }
        return false;
    }
}
