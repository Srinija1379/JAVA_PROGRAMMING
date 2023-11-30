import java.io.*;
import java.util.*;
class report
{
int reg,s1,s2,s3,s4,s5,tot,avg;
String name;
void getdata()
{
Scanner s= new Scanner(System.in);
System.out.println("enter name:");
String name=s.nextLine();
System.out.println("enter reg num:");
reg=s.nextInt();

System.out.println("enter 5 sub marks:");
s1=s.nextInt();
s2=s.nextInt();
s3=s.nextInt();
s4=s.nextInt();
s5=s.nextInt();
}
void calculation()
{
tot=s1+s2+s3+s4+s5;
if(s1<50 && s2<50 && s3<50 && s4<50 && s5<50)
{
System.out.println("failed in subject");
}
else
{
 avg=tot/5;
System.out.println("total and avg are:"+tot+","+avg);
}
}
void grade()
{
if(avg>=90)
{
System.out.println("A+ grade");
}
else if(avg>=80 && avg<90)
{
System.out.println("A grade");
}
else if(avg>=70 && avg<80)
{
System.out.println("B grade");
}
else if(avg>=60 && avg<70)
{
System.out.println("C grade");
}
else
{
System.out.println("E grade");
}
}
}
class studentreport
{
public static void main(String args[])
{
report r=new report();
r.getdata();
r.calculation();
r.grade();
}
}
