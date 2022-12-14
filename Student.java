import java.util.Scanner;
public class Student
{
    String USN;
    String Name;
    String branch;
    int phone;

    void insertRecord(String reg, String name, String brnch, int ph)
    {
        USN=reg;
        Name=name;
        branch=brnch;
        phone=ph;
    }

    void displayRecord()
    {
        System.out.println("USN is"+USN+"\nName is"+Name+"\nBranch is"+branch+"\nPhone Number is"+phone);
    }

    public static void main(String args[])
    {
        Student s[]=new Student[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
            s[i]=new Student();

        for(int j=0;j<n;j++)
        {
            sc.nextLine();
            System.out.println("Enter the USN,name,branch,phone");
            String USN=sc.nextLine();
            String Name=sc.nextLine();
            String branch=sc.nextLine();
            int phone=sc.nextInt();
            s[j].insertRecord(USN,Name,branch,phone);
        }

        for(int m=0;m<n;m++)
        {
            int i=m+1;
            System.out.println("The details of student"+i+"are");
            s[m].displayRecord();
        }
    }
}


