
// Practice majority element
// Using naive approach

package Practice.Array.Searching;

public class Array_03_majority_element_01 {
    public static void main(String[] args) {
        int [] arr2={3,3,4,2,4,4,2,4,4};
        int size=arr2.length;
        int ele=findMajority(arr2,size);
        System.out.println("Majority element is: "+ele);

    }

    static int findMajority(int[] arr2, int size) {
        int max_count=0;
        int ele=0;
        for(int i=0;i<size;i++)
        {
            int count=0;
            for(int j=0;j<size;j++)
            {
                if(arr2[i]==arr2[j])
                {
                    count++;
                }
            }
            if(count>max_count)
            {
                max_count=count;
                ele=arr2[i];
            }
        }
        return ele;
    }
}
