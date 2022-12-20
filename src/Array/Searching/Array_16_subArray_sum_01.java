
// Find a subArray with given sum
// Using nested loop


package Array.Searching;

public class Array_16_subArray_sum_01 {
    public static void main(String[] args) {
        int [] array23 = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = array23.length;
        int sum = 23;
        subArraySum(array23,n,sum);
    }

    static void subArraySum(int[] array23, int n, int sum) {
        for(int i=0;i<n;i++)
        {
            int currSum=array23[i];
            if(currSum==sum)
            {
                System.out.println("Sum found at index: "+i);
                return;
            }
            else
            {
                for(int j=i+1;j<n;j++)
                {
                    currSum+=array23[j];
                    if(currSum==sum)
                    {
                        System.out.println("Sum found between indexes "+i+ " and "+j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subArray found ");

    }
}
