
//Delete an element from an array


package Array.Searching;

public class Array_06_Delete_element {
    public static void main(String[] args) {
        int array4[] = { 10, 50, 30, 40, 20 };
        int n=array4.length;
        int pos=3;
        for (int i = 0; i < n; i++) {
            System.out.print(array4[i]+" ");
        }
        n=deleteElement(array4,n,pos);
        System.out.println("After deletion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array4[i]+" ");
        }
    }

    static int deleteElement(int[] array4, int n, int pos) {
        for (int i =pos; i < n-1; i++) {
            array4[i]=array4[i+1];
        }
        return n-1;
    }
}
