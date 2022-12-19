
// Equilibrium index of an array
// Using array of prefix sum


package Array.Searching;

public class Array_13_Equilibrium_index_03 {
    public static void main(String[] args) {
        int [] array19 = { -7, 1, 5, 2, -4, 3, 0 };
        int size = array19.length;

        System.out.println(equilibriumIndex(array19,size));
    }

    static int equilibriumIndex(int[] array19, int size) {
        if(size==1)
            return 0;
        int [] front=new int [size];
        int [] back=new int[size];

        for(int i=0;i<size;i++)
        {
            if(i!=0)
            {
                front[i]=front[i-1]+array19[i];
            }
            else
            {
                front[i]=array19[i];
            }
        }
        for(int i=size-1;i>0;i--)
        {
            if(i<size-2)
            {
                back[i]=back[i+1]+array19[i];
            }
            else
            {
                back[i]=array19[i];
            }
        }
        for(int i=0;i<size;i++)
        {
            if(front[i]==back[i])
                return i;
        }
        return -1;
    }
}
