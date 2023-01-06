
// Practice Majority element in the array
// Using sorting technique


package Practice.Array.Searching;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Arrays;

public class Array_01_majority_element_02 {
    public static void main(String[] args) {
        int [] arr3={4,3,4,3,2,3,2,3,4,3,4,2,2,1};
        int size=arr3.length;
        Arrays.sort(arr3);
        findMajorityElement(arr3,size);
    }

    static void findMajorityElement(int[] arr3, int size) {
        int temp=arr3[0];
        int count=1;
        int max_count=-1;
        int ele=0;
        for(int i=1;i<size;i++)
        {
            if(temp==arr3[i])
            {
                count++;
            }
            else
            {
                count=1;
                temp=arr3[i];
            }
            if(count>max_count)
            {
                max_count=count;
                ele=arr3[i];
            }
        }
        System.out.printf("Majority element is : "+ele+" Occurrence is: "+max_count);

    }
}
