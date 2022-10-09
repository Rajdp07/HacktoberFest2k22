import java.util.Scanner;

public class CheckBetween
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            System.out.println("Enter the lower limit:");
            int l = sc.nextInt();
            System.out.println("Enter the upper limit:");
            int u = sc.nextInt();
            if(n > l && n < u)
                System.out.println("The number is between the limits");
            else
                System.out.println("The number is not between the limits");
        }
    }
}