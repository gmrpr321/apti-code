package J1FN;
import java.util.Scanner;
public class zohocorp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.print("Enter a string:");
        str=sc.next();
        int size,i,j;
        size=(str.length()+2)/3;
        int space = size-2;
        for(i=0;i<str.length();i++)
        {
            if(i<size || space==0)
            System.out.print(" "+str.charAt(i));
            else{
                System.out.println();
                for(j = 0;j<space;j++)
                System.out.print("  ");
                System.out.print(" "+str.charAt(i));
                space--;
                if(space==0)
                System.out.println();
            }

        }
        }
}
