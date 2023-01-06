package DSA;

public class Dsa_02_min_max_i {
    public static void main(String[] args) {
        int [] arr2= {3, 4, 7, 8, 24, 37, 48, 97, 54, 31};
        int n=arr2.length;
        int min=9999999;
        int max=0;

        for(int i=0;i<n;i++)
        {
            if(arr2[i]<min)
            {
                min=arr2[i];
            }
            if(arr2[i]>max)
            {
                max=arr2[i];
            }
        }
        System.out.println("Minimum value in the array is: "+ min);
        System.out.println("Maximum value in the array is: "+ max);
    }
}
