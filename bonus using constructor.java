import java.io.*;
import java.util.*;
class employee
{
int sal,bon;
String grd;
employee(int a,String b)
{
sal=a;
grd=b;
if(grd=="A")
{
bon=(sal*5)/100;
System.out.println("bonus is:"+bon);
}
if(grd=="B")
{
bon=(sal*10)/100;
System.out.println("bonus is:"+bon);
}
}
}
class Bonus
{
public static void main(String args[])
{
employee e=new employee(25000,"A");
employee e1=new employee(10500,"B");
}
}
15.single inheritance
import java.io.*;
import java.util.*;
class p
{
 int x=10;
void display()
{
System.out.println("iam having 10 crores"+x);
}
}
class c extends p
{
 int y=10;
void display1()
{
System.out.println("iam having 10 crores"+y);
}
}
class single
{
public static void main(String args[])
{
c a=new c();
a.display1();
a.display();
}
}
