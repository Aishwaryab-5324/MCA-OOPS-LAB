class InheritanceDemo
{
    int rollno=10;
    String name="Anitha";
}
class ChildInheritance extends InheritanceDemo
{
    int marks=80;
    void display()
    {
        System.out.print("\n Roll no:"+rollno);
        System.out.print("\n Name:"+name);
        System.out.print("\n Marks:"+marks);
    }
}
class SingleInheritance
{
    public static void main(String args[])   
    {
        ChildInheritance ob = new ChildInheritance();
        ob.display();
    }
}
