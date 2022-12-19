
// Find a peak element which is not smaller than its neighbours
// using naive approach

package Array.Searching;

public class Array_15_peak_element {
    public static void main(String[] args) {
        int [] array22 = { 1, 3, 20, 4, 1, 0 };
        int n = array22.length;
        System.out.print("Index of a peak point is " + findPeak(array22, n));
    }

    static int findPeak(int[] array22, int n) {
        if(n==1)
            return 0;
        if(array22[0]>array22[1])
            return 0;
        if(array22[n-1]>array22[n-2])
            return n-1;
        for(int i=1;i<n-1;i++)
        {
            if((array22[i-1]<array22[i])&&(array22[i]>array22[i+1]))
                return i;
        }
        return 0;
    }
}
