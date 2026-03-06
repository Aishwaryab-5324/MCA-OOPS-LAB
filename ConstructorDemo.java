class Student
{
    int rollno;
    String name;
    Student(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollno);
    }
}
public class ConstructorDemo
{
    public static void main(String args[])
    {
        Student ob=new Student(12,"Anu");
        ob.display();
    }
}
