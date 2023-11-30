import java.io.*;
import java.util.*;
class student
{
int tot,avg,a,b,c,d,e;
student(String name,int regno)
{
Scanner s= new Scanner(System.in);
}
student(int s1,int s2,int s3,int s4,int s5)
{
a=s1;
b=s2;
c=s3;
d=s4;
e=s5;
Scanner s= new Scanner(System.in);
}
void calculation()
{
tot=a+b+c+d+e;;
if(a<50 && b<50 && c<50 && d<50 && e<50)
{
System.out.println("failed in subject");
}
else
{
 avg=tot/5;
System.out.println("total and avg are:"+tot+","+avg);
}
}
void display()
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
student r=new student("meghana",12345);
student p=new student(90,90,90,90,90);
p.calculation();
p.display();
}
}

