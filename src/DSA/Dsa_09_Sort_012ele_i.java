package DSA;

public class Dsa_09_Sort_012ele_i {
    public static void main(String[] args) {
        int [] arr9={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n=arr9.length;
        int count0=0,count1=0,count2=0,i;
        for(i=0;i<n;i++)
        {
            switch (arr9[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        i=0;
        while(count0>0)
        {
            arr9[i++]=0;
            count0--;
        }
        while(count1>0)
        {
            arr9[i++]=1;
            count1--;
        }
        while(count2>0)
        {
            arr9[i++]=2;
            count2--;
        }
        for(int e: arr9)
            System.out.print(e+ " ");
    }
}
