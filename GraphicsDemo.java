import graphics.Circle;
import graphics.Rectangle;
import graphics.Square;
import graphics.Triangle;

import java.util.Scanner;
public class GraphicsDemo
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        int x;
        Circle obj1=new Circle();
        Rectangle obj2=new Rectangle();
        Square obj3=new Square();
        Triangle obj4=new Triangle();
        while(true)
        {
            System.out.println("\n 1.Circle\n 2.Recatngle\n 3.Square\n 4.Triangle");
           /*System.out.println("Enter your choice");
            x=sc.nextInt();*/
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1: obj1.area();
                        break;
                case 2: obj2.area();
                        break;
                case 3: obj3.area();
                        break;
                case 4: obj4.area();
                        break;
                case 5: System.out.println("Exiting!!");
                       // sc.close();
                        System.exit(0);
                default:
                        System.out.println("Invalid choice");
                        break;

            }
    
        }
    }
}