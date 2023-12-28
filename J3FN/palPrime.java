package J3FN;
import java.util.Scanner;
public class palPrime {
    public palPrime(int number,String message)
    {
        System.out.println(number +" is " + message);
    }
    public static Boolean isPalin(int num)
    {
        int temp = num,res = 0,pow=10;
        while(temp>0)
        {
            int rem = temp%10;
            res *=pow;
            res+=rem;
            temp/=10;
        }
        return num==res;
    }
    public static Boolean isPrime(int num)
    {
        int cur = 2;
        while(cur<num)
        {
            if(num%cur==0)
            return false;
            cur++;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[100];
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of arr : ");
        size = scan.nextInt();
        System.out.println("Enter arr elements : ");
        for(int i = 0;i<size;i++)
        arr[i] = scan.nextInt();
        for(int i = 0;i<size;i++)
        {
            if(palPrime.isPalin(arr[i])&&palPrime.isPrime(arr[i]))
            new palPrime(arr[i], "PalPrime");
            else 
            new palPrime(arr[i], "Not PalPrime");
        }
    }
}
