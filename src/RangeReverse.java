import java.util.*;
class Solution{
    public void rangeReverse(int size,int[] array,int start,int end)
    {
        while(start<end)
        {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }

}
public class RangeReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        int start= scanner.nextInt();
        int end= scanner.nextInt();
        Solution solution=new Solution();
        solution.rangeReverse(n,array,start,end);

    }
}
