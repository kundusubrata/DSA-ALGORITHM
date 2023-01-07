package DSA.Array;

public class Dsa_05_Bubble_sort {
    public static void main(String[] args) {
        int [] arr5={7,8,9,6,5,4,1,2,3};
        int n= arr5.length;
        System.out.println("Original array: ");
        printArray1(arr5);
        bubbleSort(arr5,n);
        System.out.println("\nSorted Array: ");
        printArray1(arr5);

    }

    static void printArray1(int[] arr5) {
        for(int e: arr5)
        {
            System.out.print(e+" ");
        }
    }

    static void bubbleSort(int[] arr5, int n) {
        int flag;
        for(int i=0;i<n-1;i++)
        {
            flag=0;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr5[j]>arr5[j+1])
                {
                    //swap(arr5[j],arr5[j+1]);
                    int temp=arr5[j];
                    arr5[j]=arr5[j+1];
                    arr5[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
    }

//    static void swap(int a, int b) {
//        int temp=a;
//        a=b;
//        b=temp;
//    }

}
