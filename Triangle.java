package graphics;
import java.util.Scanner;
public class Triangle implements Area_cal
{
    int b,h;
    public void area()    
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input breadth");
        b=sc.nextInt();
        System.out.println("Input length");
        h=sc.nextInt();
        System.out.println("Area of triangle:"+(0.5*b*h));
        sc.close();
    }
}