package J1FN;
import java.util.Scanner;
public class floatadd {
    public static void main(String[] args)
    {
    double a,b;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter double a : ");
    a = scan.nextDouble();
    System.out.println("Enter double b : ");
    b = scan.nextDouble();
    System.out.printf("Average : %.2f%n", (a+b)/2);
    }
    
}
