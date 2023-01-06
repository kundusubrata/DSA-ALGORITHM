
// Alternative Sorting


package Array.Sorting;

public class Array_03_Alternative_sort {
    public static void main(String[] args) {
        int [] arr3 = {1, 12, 4, 6, 7, 10,15};
        int n = arr3.length;
        alternateSort(arr3, n);
    }

    static void alternateSort(int[] arr3, int n) {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr3[j+1]<arr3[j])
                {
                    int temp=arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=arr3[j];
                }
            }
        }
        int i=0;int j=n-1;
        while(i<j)
        {
            System.out.print(arr3[j--]+" ");
            System.out.print(arr3[i++]+" ");
        }
        if(n%2!=0)
            System.out.println(arr3[i]);
    }
}
