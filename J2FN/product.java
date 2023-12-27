package J2FN;
import java.util.Scanner;
public class product{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[100];
        int left[] = new int[100];
        int right[] = new int[100];
         int res[] = new int[100];
        System.out.println("Enter size : ");
        int size  = scan.nextInt();
        System.out.println("Enter array elements : ");
        for(int i = 0;i<size;i++)
        {
            arr[i] = scan.nextInt();
        }
        left[0] = arr[0];
        for(int i = 1;i<size;i++)
        left[i] = left[i-1]*arr[i];
        right[size-1] = arr[size-1];
        for(int i = size-2;i>=0;i--)
        right[i] = right[i+1]*arr[i];
        for(int i = 1;i<size-1;i++)
        {
            res[i] = left[i-1] * right[i+1];
        }
        res[0] = right[1];
        res[size-1] = left[size-2];
        System.out.println("Result is : ");
        for(int i = 0;i<size;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}