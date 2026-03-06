class Product {
    int pcode;
    String pname;
    double price;
    double lowest;
    Product(int c,String n,double p)
    {
        pcode=c;
        pname=n;
        price=p;
    }
    void display()
    {
        System.out.println(pcode+"\t\t"+pname+"\t\t"+price);

    }
    void findLowest(double price1,double price2,double price3)
    {
        if(price1<=price2 && price1<=price3)
        {
            System.out.println("\nProduct 1 is of the lowest price.");
        }
        else if(price2<=price2 && price2<=price3)
        {
            System.out.println("\nProduct 2 is of the lowest price.");
        }
        else{
            System.out.println("\nProduct 3 is of the lowest price.");
        }
    }
}
public class ProductDemo
{
    public static void main(String args[])
    {
        Product p1=new Product(101,"Product 1",100.00);
        Product p2=new Product(102,"Product 2",128.40);
        Product p3=new Product(103,"Product 3",190.00);
        System.out.println("\nProduct information");
        System.out.println("\nProduct Code\t Product Name \t Product Price");
        p1.display();
        p2.display();
        p3.display();
        p1.findLowest(p1.price,p2.price,p3.price);
    }
}
