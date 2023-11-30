import java.io.*;
import java.util.*;
class bank
{
void getrateofinterest()
{
System.out.println("provided banks are SBI,ICICI,AXIS");
}
}
class sbi extends bank
{
void getrateofinterest1()
{
System.out.println("the rate of interest is 8.4%");
}
}
class icici extends bank
{
void getrateofinterest2()
{
System.out.println("the rate of interest is 7.3%");
}
}
class axis extends bank
{
void getrateofinterest3()
{
System.out.println("the rate of interest is 9.7%");
}
}
class data
{
public static void main(String args[])
{
axis a=new axis();
a.getrateofinterest3();
a.getrateofinterest();
icici i=new icici();
i.getrateofinterest2();
i.getrateofinterest();
sbi b=new sbi();
b.getrateofinterest1();
b.getrateofinterest();
}
}
