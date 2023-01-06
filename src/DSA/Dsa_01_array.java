package DSA;

import java.util.Scanner;

public class Dsa_01_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr1=new int[10];
        System.out.println("Enter the array element: ");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("The array element are: ");
        for(int ele: arr1)
        {
            System.out.print(ele+ " ");
        }
    }
}
