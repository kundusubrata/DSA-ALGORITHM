package DSA;

public class Dsa_07_Occurrence_array_i {
    public static void main(String[] args) {
        int [] arr7={1,2,2,2,2,2,3,4,7,8,8};
        int n= arr7.length;
        int x=2;
        int c=countOccurrence(arr7,n,x);
        System.out.println(x+" Occurs "+c+" times.");

    }

     static int countOccurrence(int[] arr7, int n, int x) {
        int index=binarySearch2(arr7,0,n-1,x);
        if(index==-1)
            return 0;
        int count=1;
        int left=index-1;
        while(left>=0 && arr7[left]==x)
        {
            count++;
            left--;
        }

        int right=index+1;
        while(right<=n-1 && arr7[right]==x)
        {
            count++;
            right++;
        }

        return count;
    }

    static int binarySearch2(int[] arr7, int low, int high, int x) {
        int mid=low+(high-low)/2;
        if(arr7[mid]==x)
            return mid;
        else if(arr7[mid]>x)
            return binarySearch2(arr7,low,mid-1,x);
        return binarySearch2(arr7,mid+1,high,x);
    }

}
