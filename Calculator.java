import java.util.Scanner;
public class Calculator
{
    public static void main(String args[])
    {
        char operator;
        double num1,num2,result;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an Operator");
        operator=s.next().charAt(0);
        System.out.println("Enter first number");
        num1=s.nextDouble();
        System.out.println("Enter second number");
        num2=s.nextDouble();

        switch(operator)
        {
            case'+': result=num1+num2;
                     break;

            case'-': result=num1-num2;
                     break;

            case'*': result=num1*num2;
                     break;

            case'/': result=num1/num2;
                     break;

            case'%': result=num1%num2;
                     break;

            default:System.out.println("Invalid Operator!");
                    return;
        }
        System.out.println(num1+""+operator+""+num2+"="+result);
    }
}
