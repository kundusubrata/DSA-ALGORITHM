
// Equilibrium index of an array
// Using array of sum



package Array.Searching;

public class Array_13_Equilibrium_index_02 {
    public static void main(String[] args) {
        int [] array19 = { -7, 1, 5, 2, -4, 3, 0 };
        int size = array19.length;

        System.out.println(findEquilibrium(array19,size));
    }

    static int findEquilibrium(int[] array19, int size) {
        int sum=0;
        int leftSum=0;
        for(int i=0;i<size;i++)
        {
            sum+=array19[i];
        }
        for(int i=0;i<size;i++)
        {
            sum-=array19[i];

            if(leftSum==sum)
            {
                return i;
            }

            leftSum+=array19[i];
        }
        return -1;
    }
}
