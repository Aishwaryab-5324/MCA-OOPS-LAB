import java.util.Scanner;
class Employee
{
    int eNo;
    String eName;
    double eSalary;
    Employee(int n,String name,double sal)
    {
        eNo=n;
        eName=name;
        eSalary=sal;
    }
}
class EmpSearch
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of employee");
        int n=s.nextInt();
        Employee e[]=new Employee[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter details for employee "+(i+1)+":");
            System.out.println("Employee Number:");
            int eNo=s.nextInt();
            System.out.println("Employee Name:");
            String eName=s.next();
            System.out.println("Employee Salary:");
            double eSalary=s.nextDouble();
            e[i]=new Employee(eNo,eName,eSalary);
        }
        System.out.println("\n Enter employee number to search");
        int searchEno=s.nextInt();
        int flag=0;
        for(Employee emp:e)
        {
            if(emp.eNo==searchEno)
            {
                System.out.println("Employee found:");
                System.out.println("Employee Number:"+emp.eNo);
                System.out.println("Employee Name:"+emp.eName);
                System.out.println("Employee Salary:"+emp.eSalary);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Employee with Employee Number:"+searchEno+"not found");
        }    
        s.close(); 
    }
}

