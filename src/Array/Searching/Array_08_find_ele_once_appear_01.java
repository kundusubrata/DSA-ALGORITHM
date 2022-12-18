
//Find the element that appears once in an array where every other element appears twice
//using xor operator
//4^5^5=4;

package Array.Searching;

public class Array_08_find_ele_once_appear_01 {
    public static void main(String[] args) {
        int[] array8={6,7,4,5,7,6,5};
        int n=array8.length;
        System.out.print("Element occur once is:"+singleElement(array8,n));

    }

     static int singleElement(int[] array8, int n) {
        int res=0;
        for (int i = 0; i < n; i++) {
            res^=array8[i];
         }
        return res;
    }
}
