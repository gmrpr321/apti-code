package J2FN;
import java.util.Scanner;
public class permutation {
    public static void permute(int[] arr,int size,int cur,int[] res,int[] seen)
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
            
            boolean proceed  = true;
            for(int j = 0;j<cur;j++)
            {
                if(seen[j]==i)
                proceed = false;
            }
            if(proceed)
            {
                res[cur]=arr[i];
                seen[cur] = i;
                permute(arr,size,cur+1,res,seen);
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = new int[100];
        int res[] = new int[100];
        int seen[] = new int[100];
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter arr size : ");
        size= scan.nextInt();
        System.out.println("Enter array elements : ");
        for(int i =0;i<size;i++)
        arr[i] = scan.nextInt();
        permutation.permute(arr, size, 0, res,seen);
    }
}
