
// Find ceiling in a sorted array
// using linear search


package Array.Searching;

public class Array_14_ceiling_01 {
    public static void main(String[] args) {
        int [] array20= {1, 2, 8, 10, 10, 12, 19};
        int n = array20.length;
        int x = 3;
        int index = ceilSearch(array20, 0, n-1, x);
        if(index == -1)
            System.out.println("Ceiling of "+x+" doesn't exist in array");
        else
            System.out.println("ceiling of "+x+" is "+array20[index]);
    }

    static int ceilSearch(int[] array20, int low, int high, int x) {
        if(x<array20[low])
            return low;
        for(int i=low;i<high;i++)
        {
            if(array20[i]==x)
                return i;
            if((array20[i]<x)&& (array20[i+1]>x))
                return i+1;
        }
        return -1;
    }
}
