package J1FN;
import java.util.Scanner;
public class happyNum {
    static int[] seen = new int[1000];
    static int curSize = 0;
    public static int getSumOfSquares(int num)
    {
        int temp = 0,sum=0;
        while(num!=0)
        {
            temp = num%10;
            sum+=(temp*temp);
            num/=10;
        }
        return sum;
    }
    public static Boolean isSeen(int num)
    {
        for(int i = 0;i<happyNum.curSize;i++)
        {
            if(num==happyNum.seen[i])
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = scan.nextInt();
        while(happyNum.curSize<=1000)
        {

            int temp = getSumOfSquares(num);
            if(temp ==1)
            {
                System.out.println("This is a happy number ");
                break;
            }
            if(!isSeen(temp))
            {
                seen[curSize++]=temp;
                num = temp;
            }
            else 
            {
                System.out.println("Not a happy number ");
                break;
            }
        }
    }
}
