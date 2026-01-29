import java.util.Scanner;
public class Student {
    int rollno,m1,m2,m3;
    String name;
    int total;
    float average;
    void getdata()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n Enter student name,rollno and marks of 3 subjects");
        System.out.println(name=scan.nextLine());
        rollno=scan.nextInt();
        m1=scan.nextInt();
        m2=scan.nextInt();
        m3=scan.nextInt();
    }
    void cal()
    {
        total=m1+m2+m3;
        average=total/3;
        System.out.println("total marks:"+total);
        System.out.println("Average:"+average);
    }
    public static void main(String args[])
    {
        Student s=new Student();
        s.getdata();
        System.out.println("\n Student details");
        System.out.println("\n Name:"+s.name);
        System.out.println("\n Rollno:"+s.rollno);
        s.cal();
    }
}
