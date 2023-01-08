package DSA.Array;

import java.util.ArrayList;
import java.util.List;

public class Dsa_15_Union_sorted_array_i {
    public static void main(String[] args) {
        int [] arr15={1,1,1,2,2,2,3,3,3};
        int [] arr16={3,3,3,3,4};
        int m= arr15.length;
        int n= arr16.length;
        int left=0,right=0;

        List<Integer>list=new ArrayList<>();
        while(left<m || right <n)
        {
            //Skip duplicate
            while(left>0 && left<m && arr15[left]==arr15[left-1])
            {
                left++;
            }
            while(right>0 && right<n && arr16[right]==arr16[right-1])
            {
                right++;
            }

            //One array exit

            if(left>=m)
            {
                list.add(arr16[right]);
                right++;
                continue;
            }
            if(right>=n)
            {
                list.add(arr15[left]);
                left++;
                continue;
            }

            //Comparison

            if(arr15[left]<arr16[right])
            {
                list.add(arr15[left]);
                left++;
            }
            else if(arr15[left]>arr16[right])
            {
                list.add(arr16[right]);
                right++;
            }
            else
            {
                list.add(arr15[left]);
                left++;
                right++;
            }

        }
        System.out.println(list);

    }
}
