
// Find a triplet that sum to a given value
// using sorting and two pointer technique


package Array.Searching;

import java.util.Arrays;

class FindTriplet
{

     boolean findTriplet(int[] array14, int sum, int size) {

         for(int i=0;i<size-2;i++)
         {
             int l=0,r=size-1;
             while(l<r)
             {
                 if((array14[i]+array14[l]+array14[r])==sum)
                 {
                     System.out.println("Triplet is: "+array14[i]+","+array14[l]+","+array14[r]);
                     return true;
                 }
                 else if((array14[i]+array14[l]+array14[r])<sum)
                     l++;
                 else
                     r--;
             }
         }
         return false;
    }
}
public class Array_11_triplet_sum_01 {
    public static void main(String[] args) {
        FindTriplet triplet =new FindTriplet();
        int [] array14 = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int size = array14.length;
        Arrays.sort(array14);
        
        triplet.findTriplet(array14,sum,size);

    }
}
