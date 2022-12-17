package Practice.Array;

import java.util.Scanner;

public class Insert_End {
    public static void main(String[] args) {
        int [] arr1=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element in array: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        arr1[n]=key;
        for(int i=0;i<=n;i++)
        {
            System.out.println(arr1[i]+" ");
        }

    }
}
