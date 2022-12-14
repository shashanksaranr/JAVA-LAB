import java.util.Scanner;
public class Odd_Even_Number
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=input.nextInt();
        int r=a%2;

        if(r==0)
        {
            System.out.println("Even");
        }

        else
        {
         System.out.println("Odd");
        }
    }
}
