class Principal
{
    String name="Rakesh";
}
class Teacher extends Principal
{
    int tchrid=55;
}
class Student extends Teacher
{
    int rno=78;
    void display()
    {
         System.out.print("\n Principal name:"+name);
        System.out.print("\n Teacher ID:"+tchrid);
        System.out.print("\n Student rollno:"+rno);
    }
}
class Multilevel
{
    public static void main(String args[])   
    {
        Student ob=new Student();
        ob.display();
    }
}
