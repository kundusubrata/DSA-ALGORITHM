
// Check if a pair exist with given sum in given array
// Two sum using Binary Search


package Array.Searching;

import java.util.Arrays;

public class Array_10_pair_sum_02 {
    public static void main(String[] args) {
        int [] array12= { 1, 4, 45, 6, 10, -8 };
        int sum=14;
        int size=array12.length;
        Arrays.sort(array12);

        if(checkSum1(array12,sum,size))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean checkSum1(int[] array12, int sum, int size) {
        int searchKey;
        for(int i=0;i<size-1;i++)
        {
            searchKey=sum-array12[i];
            if(findSearchKey(array12,0,size-1,searchKey))
                return true;
        }
        return false;
    }

    static boolean findSearchKey(int[] array12, int low, int high, int searchKey) {
        int mid;
        while(low<high)
        {
            mid=low+(high-low)/2;
            if(array12[mid]==searchKey)
                return true;
            else if(array12[mid]<searchKey)
                return findSearchKey(array12,mid+1,high,searchKey);
            return findSearchKey(array12,low,mid-1,searchKey);

        }
        return false;
    }
}
