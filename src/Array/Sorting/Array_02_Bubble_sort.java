
// Bubble Sort


package Array.Sorting;

public class Array_02_Bubble_sort {
    public static void main(String[] args) {
        int [] arr2={9,7,5,3,1,8,6,4,2};
        int size=arr2.length;
        bubbleSort(arr2,size);
    }

    static void bubbleSort(int[] arr2, int size) {
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(arr2[j]>arr2[j+1])
                {
                    int temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                }
            }
        }
        for(int k=0;k<size;k++)
        {
            System.out.print(arr2[k]+" ");
        }
    }
}
