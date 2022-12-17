
// Insert an element in a sorted array


package Array.Searching;

public class Array_04_Insert_sorted_array {
    public static void main(String[] args) {
        int [] array6= new int [20];
        array6[0]=11;
        array6[1]=22;
        array6[2]=33;
        array6[3]=44;
        array6[4]=55;
        array6[5]=66;

        int n=6;
        int key=50;
        int capacity=array6.length;

        System.out.println("Before Insertion: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(array6[i]+" ");
        }
        n=insertSorted(array6,n,capacity,key);
        System.out.println("\nAfter Insertion: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(array6[i]+" ");
        }


    }

     static int insertSorted(int[] array6, int n, int capacity, int key) {
        if(n>=capacity)
        {
            return n;
        }
        int i;
        for(i=n-1;(i>=0 && array6[i]>key);i--)
        {
            array6[i+1]=array6[i];
        }
        array6[i+1]=key;

        return n+1;
    }
}
