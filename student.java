import java.io.*;
import java.util.*;
class student
{
public static void main(String args[])
{
int reg,m1,m2,m3,m4,m5,tot;
Scanner p=new Scanner(System.in);
System.out.println("enter the name of the student");
String name=p.nextLine();
System.out.println(name);
System.out.println("enter the register number");
reg=p.nextInt();
System.out.println(reg);
System.out.println("enter the marks of the students");
m1=p.nextInt();
m2=p.nextInt();
m3=p.nextInt();
m4=p.nextInt();
m5=p.nextInt();
tot=m1+m2+m3+m4+m5;
double avg=tot/5;
System.out.println("the total  is"+tot);
System.out.println("the  average is"+avg);
}
}



