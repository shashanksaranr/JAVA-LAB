import java.util.Scanner;
public class QuadraticEquation

{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a=input.nextDouble();
        System.out.println("Enter the value of b:");
        double b=input.nextDouble();
        System.out.println("Enter the value of c:");
        double c=input.nextDouble();
        double d=b*b-4*a*c;
        double r1,r2;

        if(d==0)
        {
            System.out.println("Roots are real and equal");
            r1=r2=-b/(2*a);
            System.out.println("Root 1="+r1);
            System.out.println("Root 2="+r2);
        }

        else if(d>0)
        {
            System.out.println("Roots are real and distinct");
            double root1=(-b+Math.sqrt(d))/(2*a);
            double root2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Root 1="+root1);
            System.out.println("Root 2="+root2);
        }

        //if d<0

        else
        {
            System.out.println("Roots are real and imaginary");
            r1=-b/(2*a);
            r2=Math.sqrt(-d)/(2*a);
            System.out.println("Root 1="+r1+"+i"+r2);
            System.out.println("Root 2="+r1+"-i"+r2);
        }
    }
}

