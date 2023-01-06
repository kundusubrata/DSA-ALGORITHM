package DSA;

public class Dsa_04_reverse_array {
    public static void main(String[] args) {
        int [] arr4 = {1,2,3,4,5,6,7,8,9,10};
        int n=arr4.length;
        printArray(arr4,n);
        reverseArray(arr4,0,n-1);
        System.out.println("\nReversed Array is : ");
        printArray(arr4,n);

    }

    static void printArray(int[] arr4, int n) {
        for(int e: arr4)
        {
            System.out.print(e+" ");
        }
    }

    static void reverseArray(int[] arr4, int start, int end) {
        if(start>=end)
        {
            return;
        }
        int temp=arr4[start];
        arr4[start]=arr4[end];
        arr4[end]=temp;

        reverseArray(arr4,start+1,end-1);
    }
}
