import java.util.Scanner;
public class Emp
{
    int empid;
    String empname;
    double ta,da,hra,tax,basic,netsalary;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee ID");
        empid=sc.nextInt();
        System.out.println("Enter Employee Name");
        empname=sc.next();
        System.out.println("Enter Basic Salary");
        basic=sc.nextDouble();
        System.out.println("Enter Travelling allowance");
        ta=sc.nextDouble();
        System.out.println("Enter DA");
        da=sc.nextDouble();
        System.out.println("Enter house rent allowance");
        hra=sc.nextDouble();
        System.out.println("Enter Tax");
        tax=sc.nextDouble();
        sc.close();
    }
    void calc()
    {
        netsalary=(basic+ta+da+hra)-tax;
    }
    void display()
    {
        System.out.println("\n Employee ID:"+empid);
        System.out.println("\n Employee Name:"+empname);
        System.out.println("\n Net Salary:"+netsalary);
    }
public static void main(String arge[])
{
    Emp e=new Emp();
    e.getdata();
    e.calc();
    e.display();
}
}