
// Finding Majority element in the array.
// Using Sorting


package Array.Searching;

import java.util.Arrays;

public class Array_12_Majority_element_01 {
    public static void main(String[] args) {
        int [] array16={1, 1, 2, 1, 3, 5, 1};
        int size=array16.length;
        Arrays.sort(array16);
        majorityElement(array16,size);

    }

    static void majorityElement(int[] array16, int size) {
        int max_ele=0,count=1;
        int temp=array16[0],ele=0;
        int f=0;

        for(int i=0;i<size;i++)
        {
            if(temp==array16[i])
            {
                count++;
            }
            else
            {
                count=1;
                temp=array16[i];
            }

            if(max_ele<count)
            {
                max_ele=count;
                ele=array16[i];
                if(max_ele>(size/2))
                {
                    f=1;
                    break;
                }
            }
        }
        if(f==1)
            System.out.println("Majority element is: "+ele+"and occurrence is: "+max_ele);
        else
            System.out.println("In array no major element is there.");
    }
}
