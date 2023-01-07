package DSA.Array;

public class Dsa_06_Selection_sort {
    private static int i;

    public static void main(String[] args) {
        int [] arr6={9,8,7,6,5,4,1,3,2};
        int n= arr6.length;
        printArray2(arr6);
        selectionSort2(arr6,n);
        System.out.println("\nSorted Array: ");
        printArray2(arr6);
    }

    static void printArray2(int[] arr6) {
        for(int k: arr6)
            System.out.print(k+" ");
    }

    static void selectionSort2(int[] arr6, int n) {
        {
            for (int i = 0; i < n-1; i++)
            {    // Find the minimum element in unsorted array
                int min_idx2 = i;
                for (int j = i + 1; j < n; j++)
                    if (arr6[j] < arr6[min_idx2])
                        min_idx2 = j;

                // Swap the found minimum element with the first
                // element
                if(min_idx2!=i)
                {
                    int temp = arr6[min_idx2];
                    arr6[min_idx2] = arr6[i];
                    arr6[i] = temp;
                }
            }
        }
    }
}
