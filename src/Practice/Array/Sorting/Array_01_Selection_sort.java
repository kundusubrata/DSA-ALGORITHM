package Practice.Array.Sorting;

public class Array_01_Selection_sort {
    public static void main(String[] args) {
        int [] arr1={9,8,7,6,5,4,3,2,1};
        int size=arr1.length;
        Sort(arr1,size);
    }

    static void Sort(int[] arr1, int size) {
        for (int i = 0; i < size; i++)
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
        for(int i=0;i<size;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
