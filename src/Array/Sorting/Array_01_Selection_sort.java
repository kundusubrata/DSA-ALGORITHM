// Selection Sort

package Array.Sorting;

public class Array_01_Selection_sort {
    public static void main(String[] args) {
        int [] arr1={3,5,9,1,7,8,6};
        int size=arr1.length;
        selectionSort(arr1,size);
    }

    static void selectionSort(int[] arr1, int size) {
        for(int i=0;i<size;i++)
        {
            int min_index=i;
            for(int j=i+1;j<size;j++)
            {
                if(arr1[j]<arr1[min_index])
                {
                    min_index=j;
                }
            }
            int temp=arr1[min_index];
            arr1[min_index]=arr1[i];
            arr1[i]=temp;
        }
        for(int k=0;k<size;k++)
        {
            System.out.print(arr1[k]+" ");
        }
    }
}
