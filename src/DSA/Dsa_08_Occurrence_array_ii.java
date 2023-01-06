package DSA;

public class Dsa_08_Occurrence_array_ii {
    public static void main(String[] args) {
        int [] arr8={1,2,2,3,3,3,3};
        int n= arr8.length;
        int x=3;
        int c=count(arr8,n,x);
        System.out.println(x+" Occurs "+c+" times");
    }

    static int count(int[] arr8, int n, int x) {
        int i;
        i=firstBinarySearch3(arr8,0,n-1,x);
        System.out.println(i);
        int j;
        j=lastBinarySearch3(arr8,0,n-1,x);
        System.out.println(j);

        return j-i+1;

    }

    static int lastBinarySearch3(int[] arr8, int low, int high, int x) {
        int n= arr8.length;
        if(high>=low)
        {
            int mid=low+(high-low)/2;
            if(mid==n-1 || x<arr8[mid+1] && arr8[mid]==x)
                return mid;
            else if(x<arr8[mid])
                return lastBinarySearch3(arr8,low,mid-1,x);
            else
                return lastBinarySearch3(arr8,mid+1,high,x);
        }
        return -1;
    }

    static int firstBinarySearch3(int[] arr8, int low, int high, int x) {
        if(high>=low)
        {
            int mid=low+(high-low)/2;
            if(mid==0 || x>arr8[mid-1] && arr8[mid]==x)
                return mid;
            else if(x>arr8[mid])
                return firstBinarySearch3(arr8,mid+1,high,x);
            else
                return firstBinarySearch3(arr8,low,mid-1,x);
        }
        return -1;
    }
}
