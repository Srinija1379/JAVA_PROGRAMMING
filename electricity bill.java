import java.io.*;
import java.util.*;
class electri_bill
{
String name;
float unit,cmr,lmr,cno,amount;
void getdata()
{
Scanner s=new Scanner(System.in);
System.out.println("XYZ CURRENT BILL");
System.out.println("chennai");
System.out.println("enter customer name:");
name=s.nextLine();
System.out.println("enter customer number:");
cno=s.nextInt();
System.out.println("enter current month reading:");
cmr=s.nextInt();
System.out.println("enter last month reading:");
lmr=s.nextInt();
}
void calculation()
{
unit=cmr-lmr;
System.out.println("unit is:"+unit);
if(unit<=100)
{
amount=unit*0;
System.out.println("electric bills is:"+amount);
}
else if(unit>101 && unit<300)
{
amount=((unit-100)*0)+((unit-200)*2.25f);
System.out.println("electric bills is:"+amount);
}
else if(unit>301 && unit<500)
{
amount=((unit-100)*0)+((unit-200)*2.25f)+((unit-300)*3.75f);
System.out.println("electric bills is:"+amount);
}
else if(unit>=500)
{
amount=((unit-100)*0)+((unit-200)*2.25f)+((unit-300)*3.75f)+((unit-400)*5.50f);
System.out.println("electric bills is:"+amount);
}
else
{
System.out.println("no connection");
}
}
}
class bill
{
public static void main(String args[])
{
electri_bill e=new electri_bill();
e.getdata();
e.calculation();
}
}
