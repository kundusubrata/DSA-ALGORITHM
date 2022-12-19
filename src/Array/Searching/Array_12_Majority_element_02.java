
// Finding Majority element in the array.
// Using Naive Approach


package Array.Searching;

import java.util.Arrays;

public class Array_12_Majority_element_02 {
    public static void main(String[] args) {
        int [] array17={1, 1, 2, 1, 3, 5, 1};
        int size=array17.length;

        findMajority(array17,size);

    }

    static void findMajority(int[] array17, int size) {

        int index=-1;
        int max_count=0;
        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=0;j<size;j++)
            {
                if(array17[i]==array17[j])
                    count++;
            }
            if(count>max_count)
            {
                max_count=count;
                index=i;
            }
        }
        if(max_count>(size/2))
        {
            System.out.println("Majority element is: "+array17[index]);
            System.out.println("Occurrence is: "+max_count);
        }
        else
            System.out.println("No majority element in the array");

    }
}
