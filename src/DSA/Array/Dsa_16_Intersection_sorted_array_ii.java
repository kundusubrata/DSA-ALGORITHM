package DSA.Array;

import java.util.ArrayList;
import java.util.List;

public class Dsa_16_Intersection_sorted_array_ii {
    public static void main(String[] args) {
        int [] arr17={1,1,1,2,2,2,3,3,3};
        int [] arr18={3,3,3,3,4};
        int m= arr17.length;
        int n= arr18.length;
        int left=0,right=0;

        List<Integer> res =new ArrayList<>();
        while(left<m && right<n)
        {
            //Skip Duplicate Element
            while(left>0 && left<m && arr17[left]==arr17[left-1])
            {
                left++;
            }
            while(right>0 && right<n && arr18[right]==arr18[right-1])
            {
                right++;
            }
            //One array exhaust

            if(left>=m || right>=n)
            {
                break;
            }

            //Comparison

            if(arr17[left]<arr18[right])
            {
                left++;
            }
            else if(arr17[left]>arr18[right])
            {
                right++;
            }
            else
            {
                res.add(arr17[left]);
                left++;
                right++;
            }
        }
        System.out.println(res);
    }
}
