
// Search an element using binary Search


package Array.Searching;

import static java.util.Arrays.binarySearch;

public class Array_05_BinarySearch {
    public static void main(String[] args) {
        int [] array5={11,22,33,44,55,66,77,88,99};
        int n=array5.length-1;
        int key=55;
        System.out.println("Index: "+binarySearch(array5,0,n,key));

    }
    static int binarySearch(int [] array,int low,int high,int ele)
    {
        if(high<low)
        {
            return -1;
        }
        int mid=(low+high)/2;
        if(ele==array[mid])
            return mid;
        if(array[mid]>ele)
            return binarySearch(array,mid+1,high,ele);

        return binarySearch(array,0,mid-1,ele);
    }
}