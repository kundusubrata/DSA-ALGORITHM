package DSA.Array;

public class Dsa_13_Move_negetive_no_begin_pos_end_ii {
    public static void main(String[] args) {
        int [] arr13={-1,2,-3,4,5,6,-7,8,9};
        int n=arr13.length;
        move(arr13,0,n-1);
        for(int e: arr13)
            System.out.print(e+ " ");
    }

    static void move(int[] arr13, int low, int high) {
        int left=low;
        int right=high;
        int temp=0;
        while(left<=right)
        {
            if(arr13[left]<0 && arr13[right]<0)
            {
                left++;
            }
            else if(arr13[left]>0 && arr13[right]>0)
            {
                right--;
            }
            else if(arr13[left]>0 && arr13[right]<0)
            {
                temp=arr13[left];
                arr13[left]=arr13[right];
                arr13[right]=temp;
                left++;
                right--;
            }
            else
            {
                left++;
                right--;
            }
        }
    }
}
