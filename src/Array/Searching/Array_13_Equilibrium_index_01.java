
// Equilibrium index of an array
// Using Naive approach



package Array.Searching;

public class Array_13_Equilibrium_index_01 {
    public static void main(String[] args) {
        int [] array18 = { -7, 1, 5, 2, -4, 3, 0 };
        int size = array18.length;

        System.out.println(equilibrium(array18,size));
    }

    static int equilibrium(int[] array18, int size) {


        for(int i=0;i<size;i++)
        {
            int leftSum=0;
            for(int j=0;j<i;j++)
            {
                leftSum+=array18[j];
            }
            int rightSum=0;
            for(int j=i+1;j<size;j++)
            {
                rightSum+=array18[j];
            }
            if(leftSum==rightSum)
                return i;
        }
        return -1;
    }
}
