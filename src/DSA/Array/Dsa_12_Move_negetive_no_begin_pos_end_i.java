package DSA.Array;

public class Dsa_12_Move_negetive_no_begin_pos_end_i {
    public static void main(String[] args) {
        int [] arr12={-1,2,-3,4,5,6,-7,8,9};
        int n=arr12.length;
        int j=0,temp;
        for(int i=0;i<n;i++)
        {
            if(arr12[i]<0)
            {
                if(i!=j)
                {
                    temp=arr12[i];
                    arr12[i]=arr12[j];
                    arr12[j]=temp;
                }
                j++;
            }
        }
        for(int e: arr12)
            System.out.print(e+ " ");

    }
}
