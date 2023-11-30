import java.io.*;
import java.util.*;
class college
{
String name;
void display()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the college name:");
name=s.nextLine();
}
}
class student extends college
{
 int stu_id;
String stu_name;
void display1()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the student name and id:");
stu_name=s.nextLine();
stu_id=s.nextInt();
}
}
class staff extends college
{
String stf_name;
int stf_id;
void display2()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the staff name and id:");
stf_name=s.nextLine();
stf_id=s.nextInt();
}
}
class office extends college
{
String clerk_name;
void display3()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the clerk name:");
clerk_name=s.nextLine();
}
}
class teaching extends staff
{
String dept_name;
void display4()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the department name:");
dept_name=s.nextLine();
}
}
class nonteaching extends staff
{
String type;
void display5()
{
Scanner s=new Scanner(System.in);
System.out.println("enter type of working condition:");
type=s.nextLine();
}
}
class salary extends teaching
{
int sal;
void display6()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the monthly salary:");
sal=s.nextInt();
}
}
class wage extends teaching
{
int wag;
void display7()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the wage per day:");
wag=s.nextInt();
}
}
class hie
{
public static void main(String args[])
{
wage w=new wage();
w.display4();
w.display7();
salary l=new salary();
l.display6();
l.display4();
nonteaching n=new nonteaching();
n.display5();
n.display2();
teaching t=new teaching();
t.display4();
t.display2();
office o=new office();
o.display3();
o.display();
staff a=new staff();
a.display();
a.display2();
student u=new student();
u.display();
u.display1();
}
}
