
// Find a subArray with given sum
// Using sliding window


package Array.Searching;

public class Array_16_subArray_sum_02 {
    public static void main(String[] args) {
        int [] array23 = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = array23.length;
        int sum = 23;
        findSubArraySum(array23,n,sum);
    }

    static void findSubArraySum(int[] array23, int n, int sum) {
        int currSum1=array23[0];
        int start=0;

        for(int i=1;i<=n;i++)
        {
            while(currSum1>sum)
            {
                currSum1=currSum1-array23[start];
                start++;
            }
            if(currSum1==sum)
            {
                int p=i-1;
                System.out.println("Sum found between indexes "+start+" and "+p);
                return ;
            }
            if(i<n)
                currSum1=currSum1+array23[i];
        }
        System.out.println("No subArray found in the array.");
    }
}
