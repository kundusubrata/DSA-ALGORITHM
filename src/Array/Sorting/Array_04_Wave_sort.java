package Array.Sorting;

import java.util.Arrays;

public class Array_04_Wave_sort {
    public static void main(String[] args) {
        int [] arr4={10, 90, 49, 2, 1, 5, 23};
        int n=arr4.length;
        Arrays.sort(arr4);
        waveArray(arr4,n);


    }

    static void waveArray(int[] arr4, int n) {
        for(int i=0;i<n-1;i+=2)
        {
            int temp=arr4[i];
            arr4[i]=arr4[i+1];
            arr4[i+1]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr4[i]+" ");
        }
    }
}
