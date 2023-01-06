
// Find subArray with given sum
// Using nested loop


package Practice.Array.Searching;

public class Array_04_subArray_sum_01 {
    public static void main(String[] args) {
        int [] arr4 ={1,4,20,3,10,5};
        int size=arr4.length;
        int sum=33;
        subArray(arr4,size,sum);
    }

    static void subArray(int[] arr4,int size, int sum) {
        for(int i=0;i<size;i++)
        {
            int currSum=arr4[i];
            if(currSum==sum)
            {
                System.out.println("SubArray is at index: "+arr4[i]);
                return;
            }
            else
            {
                for(int j=i+1;j<size;j++) {
                    currSum += arr4[j];
                    if (currSum == sum) {
                        System.out.println("SubArray is between " + i + " to " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No SubArray found");
    }
}
