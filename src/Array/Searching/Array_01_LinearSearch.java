
// Search an element in an array using linear Search

package Array.Searching;
import java.util.Scanner;
public class Array_01_LinearSearch {
    public static void main(String[] args) {
        int [] array={3,4,9,6,2,5,1,7,0};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the key value for search in the array:");
        int key=sc.nextInt();
        int length=array.length;
        int position = findElement(array,key,length);

        if(position==-1)
        {
            System.out.println("The key value not in array.");
        }
        else
        {
            System.out.println("The key value is found at "+position+" index.");
        }

    }

     static int findElement(int [] array, int key, int length) {
        for(int i=0;i<length;i++)
        {
            if(array[i]==key)
                return i;
        }
        return -1;
    }
}
