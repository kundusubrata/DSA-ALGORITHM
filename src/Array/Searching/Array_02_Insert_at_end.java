
//Insert an element at the end


package Array.Searching;

public class Array_02_Insert_at_end {
    public static void main(String args[])
    {
        int [] array2=new int[20];
        array2[0] = 12;
        array2[1] = 16;
        array2[2] = 20;
        array2[3] = 40;
        array2[4] = 50;
        array2[5] = 70;

        int n=6;
        int capacity=20;
        int key=55;

        System.out.println("Before Installation: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(array2[i] +" ");
        }

        n=insertElement(array2,key,capacity,n);
        System.out.println("After Insertion: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(array2[i] +" ");
        }
    }

     static int insertElement(int[] array2, int key, int capacity,int n) {

        if(n>=capacity)
            return n;
        array2[n]=key;
        return n+1;
    }
}
