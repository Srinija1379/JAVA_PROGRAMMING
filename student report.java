import java.io.*;
import java.util.*;
class student
{
String name;
int reg;
void getdata()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the name");
name=s.nextLine();
System.out.println("enter the numbver");
reg=s.nextInt();
}
}
class marks extends student
{
int n1,n2,n3,n4,n5,n6,tot,avg;
void calculate()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the marks");
n1=s.nextInt();
n2=s.nextInt();
n3=s.nextInt();
n4=s.nextInt();
n5=s.nextInt();
n6=s.nextInt();
if(n1<50 && n2<50 && n3<50 && n4<50 && n5<50 && n6<50)
{
System.out.println("failed ina subject");
}
else
{
tot=n1+n2+n3+n4+n5+n6;
avg=tot/6;
System.out.println("average is "+avg);
if(avg>=90)
{
System.out.println("S grade");
}
else if(avg<90 && avg>=80)
{
System.out.println("A grade");
}
else if(avg<80 && avg>=70)
{
System.out.println("B grade");
}
else if(avg<70 && avg>=60)
{
System.out.println("C grade");
}
else if(avg<60 && avg>=50)
{
System.out.println("D grade");
}
else
{
System.out.println("FAIL");
}
}
}
}
class report
{
public static void main(String args[])
{
marks g=new marks();
g.calculate();
student p=new student();
p.getdata();
}
}
