package J1FN;
import java.util.Scanner;
public class calc {
    public static double makeCalc(char sym,double a,double b)
    {
        try{
        if(sym == '+')
        return a + b;
        else if(sym =='-')
        return a-b;
        else if (sym=='*')
        return a*b;
        else if(sym=='/')
        return a/b;
        }
        catch(Exception e)
        {
            System.out.println("Invalid Operation");
        }
        return 0;
        
    }
    public static void main(String[] args)
    {
        char sym;
        double a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter double a : ");
        a = scan.nextDouble();
        System.out.println("Enter double b : ");
        b = scan.nextDouble();
        System.out.println("Enter the operation symbol (+,-,*,/)");
        sym = (scan.next()).charAt(0);
        System.out.println("Result : " + makeCalc(sym, a, b));

    }
}
