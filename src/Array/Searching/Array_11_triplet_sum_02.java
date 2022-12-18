
// Find a triplet that sum to a given value
// using sorting and two pointer technique


package Array.Searching;

import java.util.HashSet;

public class Array_11_triplet_sum_02 {
    public static void main(String[] args) {
        int [] array15 = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int size = array15.length;

        findTriplet1(array15,sum,size);

    }

     static boolean findTriplet1(int[] array15, int sum, int size) {
         HashSet<Integer>s=new HashSet<Integer>();
        for(int i=0;i<size-2;i++)
        {
            int curr_sum=sum-array15[i];
            for(int j=i+1;j<size-1;j++)
            {
                if(s.contains(curr_sum-array15[j]))
                {
                    System.out.printf("Triplet is %d,%d, %d", array15[i],array15[j], curr_sum - array15[j]);
                    System.out.println("\n"+array15[i]+","+array15[j]+","+(curr_sum - array15[j]));
                    return true;
                }
                s.add(array15[j]);
            }
        }
        return false;
    }
}
