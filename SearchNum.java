import java.util.Scanner;
public class SearchNum 
{
    public static void main(String args[])
    {
        int i,pos=0,flag=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        
        System.out.println(" Enter the elements to be searched");
        int e=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==e)
            {
                flag=1;
                pos=i+1;
                break;
            }
        }
        if(flag!=0)
        {
            System.out.println(e+"is found at position"+pos);
        }
        else
        {
            System.out.println(e+"is not found");
        }
        s.close();
    }
}
 

