
// Insert an element at specified position


package Array.Searching;

import java.util.Scanner;

public class Array_03_Insert_at_specific_position {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] array3=new int[20];
        array3[0]=10;
        array3[1]=20;
        array3[2]=30;
        array3[3]=40;
        array3[4]=50;
        array3[5]=60;

        int n=6;
        System.out.print("Enter the key element which want to enter specified position: ");
        int key=sc.nextInt();
        System.out.print("Enter the position: ");
        int position=sc.nextInt();
        System.out.println("Before insertion: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(array3[i]+ " ");
        }
        n=insertSpecifiedPosition(array3,key,position,n);
        System.out.println();
        System.out.println("After Installation: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(array3[i]+" ");
        }
    }

     static int insertSpecifiedPosition(int[] array3, int key, int pos, int n) {
        for(int i=n;i>=pos;i--)
        {
            array3[i+1]=array3[i];
        }
        array3[pos]=key;
        return n+1;
    }
}
