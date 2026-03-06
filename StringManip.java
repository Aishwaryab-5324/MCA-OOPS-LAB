import java.util.Scanner;
public class StringManip 
{
    public static void main(String arge[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str1=sc.nextLine();
        System.out.println("\n Length of string="+str1.length());
        System.out.println("\n Character at 2nd position="+str1.charAt(1));
        System.out.println("\n String contains 'ple' sequence"+str1.contains("ple"));
        System.out.println("\n String ends with e:"+str1.endsWith("e"));
        System.out.println("\n Replace 'pp' with 'nk' :"+str1.replaceAll("pp","nk"));
        System.out.println("\n Lower case:"+str1.toLowerCase());
        System.out.println("\n Upper case:"+str1.toUpperCase());
        System.out.println("\n Index of 'e':"+str1.indexOf('e'));
        System.out.println("\n Substring from  index 2:"+str1.substring(2));
        System.out.println("\n Enter 2nd string");
        String str2=sc.nextLine();
        System.out.println("\nString concantenated with String 2:"+str1.concat(str2));
    }
}
