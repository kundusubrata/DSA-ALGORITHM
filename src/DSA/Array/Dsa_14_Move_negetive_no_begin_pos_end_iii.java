package DSA.Array;

public class Dsa_14_Move_negetive_no_begin_pos_end_iii {
    public static void main(String[] args) {
        int [] arr14={ 1, 2,  -4, -5, 2, -7, 3,
                2, -6, -8, -9, 3, 2,  1 };
        int n= arr14.length;
        moveEle(arr14,0,n-1);
        for(int e: arr14)
            System.out.print(e+ " ");
    }

    static void moveEle(int[] arr14, int low, int high) {

        int temp=0;
        while(low<=high)
        {
            if(arr14[low]<0)
            {
                low++;
            }
            else
            {
                temp=arr14[low];
                arr14[low]=arr14[high];
                arr14[high]=temp;
                high--;
            }
        }
    }
}
