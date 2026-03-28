import java.util.Scanner;
public class Authentication
{
    public static void main(String args[])   
    {
        String username="Ashish";
        String password="ashish@123";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Username:");
        String u1=sc.nextLine();
        System.out.print("Enter your Password:");
        String p1=sc.nextLine();
        try
        {
            if((u1.equals(username))&&(p1.equals(password)))
            {
                System.out.println("Access granted");
            }
            else
            {
                throw new CredentialException("Invalid credentials");
            }
        }
        catch(CredentialException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
