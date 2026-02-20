class CPU {
    double price=15000.0;
    class Processor
    {
        int cores=10;
        String manufacture="pentium";
    }
    static class RAM{
        double memory=64;
        String manufacture="intel";
    }
}
public class CPUDetails
{
    public static void main(String args[])
    {
        CPU c=new CPU();
        CPU.Processor p=c.new Processor();
        CPU.RAM r=new CPU.RAM();
        System.out.println("CPU Class");
        System.out.println("----------");
        System.out.println("CPU Price="+c.price);
        System.out.println("Processor ineer class");
        System.out.println("---------------------");
        System.out.println("No.of cores="+p.cores);
        System.out.println("Manufacture="+p.manufacture);
        System.out.println("RAM Static Nested Class");
        System.out.println("Memory="+r.memory);
        System.out.println("Manufacture="+r.manufacture);
    }
}
