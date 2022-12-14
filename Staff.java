import java.util.Scanner;
class Staff
{
    private String staffid;
    private String name;
    private int phone;
    private float salary;

    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter staffid");
        staffid=sc.next();
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter phone");
        phone=sc.nextInt();
        System.out.println("Enter salary");
        salary=sc.nextFloat();
    }

    public void display()
    {
        System.out.println("staffid:"+staffid);
        System.out.println("name:"+name);
        System.out.println("phone:"+phone);
        System.out.println("salary:"+salary);
    }
}

class Teaching extends Staff
{
    private String domain;
    private String[]publications;
    public void accept()
    {
        super.accept();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter domain");
        domain=sc.next();
        System.out.println("Enter the number of publications");
        int n=sc.nextInt();
        publications=new String[n];
        System.out.println("Enter publications");

        for(int i=0;i<n;i++)
        publications[i]=sc.next();
    }

    public void display()
    {
        super.display();
        System.out.println("domain:"+domain);
        System.out.println("publications");

        for(int i=0;i<publications.length;i++)
            System.out.println(publications[i]);
    }
}

class Technical extends Staff
{
    private String[] skills;
    public void accept()
    {
        super.accept();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of skills");
        int n=sc.nextInt();
        skills=new String[n];
        System.out.println("Enter skills");
        for(int i=0;i<n;i++)
            skills[i]=sc.next();
    }

    public void display()
    {
        super.display();
        System.out.println("skills:");
        for(int i=0;i<skills.length;i++)
            System.out.println(skills[i]);
    }
}

class contract extends Staff
{
    private int period;
    public void accept()
    {
        super.accept();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter period");
        period=sc.nextInt();
    }
    public void display()
    {
        super.display();
        System.out.println("period:"+period);
    }
}
class Main
{
    public static void main(String args[])
    {
        Teaching teaching=new Teaching();
        Technical technical=new Technical();
        contract contract=new contract();

        System.out.println("Enter details of teaching staff member:");
        teaching.accept();
        System.out.println("Enter details of technical staff member:");
        technical.accept();
        System.out.println("Enter details of contract staff member:");
        contract.accept();

        System.out.println("Details of teaching staff member:");
        teaching.display();
        System.out.println("Details of technical staff member:");
        technical.display();
        System.out.println("Details of contract staff member:");
        contract.display();
    }
}
