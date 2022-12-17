
//Delete an element from sorted array

package Array.Searching;

public class Array_07_Delete_sorted_array {
    public static void main(String[] args) {
        int [] array7={10,20,30,40,50,60};
        int n=array7.length;
        int key=30;
        System.out.println("Before Deletion: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(array7[i]+" ");
        }
        n=deleteSorted(array7,n,key);
        System.out.println("\nAfter Deletion: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(array7[i]+" ");
        }

    }

     static int deleteSorted(int[] array7, int n, int key) {
        int pos=searchElement(array7,0,n-1,key);
        if(pos==-1)
        {
            System.out.println("Element not found");
            return n;
        }
        int i;
         for (i = pos; i <n-1; i++)
         {
             array7[i]=array7[i+1];
         }
    return n-1;
    }

     static int searchElement(int[] array7, int low, int high, int key) {
        if(high<=low)
            return -1;
        int mid=(low+high)/2;
        if(key==array7[mid])
            return mid;
        if(key>array7[mid])
            return searchElement(array7,mid+1,high,key);
        return searchElement(array7,low,mid-1,key);

    }
}
