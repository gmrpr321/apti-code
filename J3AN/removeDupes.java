package J3AN;
import java.util.Scanner;
public class removeDupes {
    public static void main(String[] args)
    {
        int[] arr = new int[100];
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of arr : ");
        size  = scan.nextInt();
        System.out.println("Enter the array elements : ");
        for(int i = 0;i<size;i++)
        arr[i] = scan.nextInt();
        int f = 0,s=0,t=0;
        while(s<size)
        {
            if(arr[s]!=arr[f])
            {
                arr[t] = arr[f];
                t++;
                f=s;
            }
            s++;
        }
        arr[t] = arr[f];
        System.out.println("Result is : ");
        for(int i =0;i<size;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("Size is : "+(t+1));
    }

}
