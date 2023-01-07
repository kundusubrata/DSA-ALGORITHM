package DSA.Array;

public class Dsa_11_Insertion_sort {
    public static void main(String[] args) {
        int [] arr11={4,8,5,1,9,2,3};
        int n=arr11.length;
        insertionSort(arr11,n);
        for(int e: arr11)
            System.out.print(e+ " ");
    }

    static void insertionSort(int[] arr11, int n) {
        int x;
        for(int i=1;i<n;i++)
        {
            int j=i-1;
            x=arr11[i];
            while(j>-1 && arr11[j]>x)
            {
                arr11[j+1]=arr11[j];
                j--;
            }
            arr11[j+1]=x;
        }
    }
}
