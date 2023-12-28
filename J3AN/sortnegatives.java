package J3AN;
import java.util.Scanner;
public class sortnegatives {
    public static void main(String[] args)
    {
        int[] arr = new int[100];
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array Size : ");
        size = scan.nextInt();
        System.out.println("Enter array elements : ");
        for(int i = 0;i<size;i++)
        arr[i] = scan.nextInt();
        for(int i = 0;i<size;i++)
        {
            if(arr[i]>0)
            {
                for(int j = i+1;j<size;j++)
                {
                    if(arr[j]<0)
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println("Result : ");
        for(int i = 0;i<size;i++)
        System.out.print(arr[i]+" ");
    }
}
