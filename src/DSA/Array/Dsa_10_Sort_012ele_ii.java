package DSA.Array;

public class Dsa_10_Sort_012ele_ii {
    public static void main(String[] args) {
        int [] arr10={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = arr10.length;
        int low=0,mid=0,high=n-1,temp=0;
        while (mid<=high)
        {
            switch (arr10[mid])
            {
                case 0:
                {
                    temp=arr10[low];
                    arr10[low]=arr10[mid];
                    arr10[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                {
                    mid++;
                    break;
                }
                case 2:
                {
                    temp=arr10[mid];
                    arr10[mid]=arr10[high];
                    arr10[high]=temp;
                    high--;
                    break;
                }
            }
        }
        for(int d: arr10) {
            System.out.print(d+" ");
        }
    }
}
