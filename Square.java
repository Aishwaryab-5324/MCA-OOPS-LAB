public class Square {
    int side;
    void getdata(int s)
    {
        side=s;
    }
    int calArea()
    {
        return side*side;
    }
    public static void main(String args[])
    {
        Square s1=new Square();
        s1.getdata(5);
        System.out.println("area of square:"+s1.calArea());
    }
}
