
// Find ceiling in a sorted array
// using linear search


package Array.Searching;

public class Array_14_ceiling_02 {
    public static void main(String[] args) {
        int [] array21= {1, 2, 8, 10, 10, 12, 19};
        int n = array21.length;
        int x = 3;
        int index = ceilBinarySearch(array21, 0, n-1, x);
        if(index == -1)
            System.out.println("Ceiling of "+x+" doesn't exist in array");
        else
            System.out.println("ceiling of "+x+" is "+array21[index]);

    }

    static int ceilBinarySearch(int[] array21, int low, int high, int key) {
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(array21[mid]==key)
                return mid;
            else if(array21[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }
}
