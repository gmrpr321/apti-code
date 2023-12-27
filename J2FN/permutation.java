package J2FN;
import java.util.Scanner;
public class permutation {
    public static void permute(int[] arr,int size,int cur,int[] res)
    {
        if(cur==size)
        {
            System.out.println();
            for(int i = 0;i<cur;i++)
            System.out.print(res[i]);
            return;
        }
        for(int i = 0;i<size;i++)
        {
            res[cur]=arr[i];
            permute(arr,size,cur+1,res);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = new int[100];
        int res[] = new int[100];
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter arr size : ");
        size= scan.nextInt();
        System.out.println("Enter array elements : ");
        for(int i =0;i<size;i++)
        arr[i] = scan.nextInt();
        permutation.permute(arr, size, 0, res);
    }
}
