package DSA.Array;

public class Dsa_03_min_max_ii {
    public static void main(String[] args) {
        int [] arr3={3,4,5,6,7,2,1,8,9,32,45,67,78,89};
        int n= arr3.length;
        sort(arr3,n);
        System.out.println("Minimum value is: "+arr3[0]);
        System.out.println("Maximum value is: "+arr3[n-1]);
    }

     static void sort(int[] arr3, int n) {
        for(int i=0;i<n-1;i++)
        {
            int min_ind=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr3[j]<arr3[min_ind])
                {
                    min_ind=j;
                }
            }
            int temp=arr3[i];
            arr3[i]=arr3[min_ind];
            arr3[min_ind]=temp;
        }
    }
}
