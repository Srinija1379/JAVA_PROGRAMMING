import java.io.*;
import java.util.*;
class gp
{
 int x=10;
void display()
{
System.out.println("iam having 10 crores"+x);
}
}
class p extends gp
{
 int y=10;
void display1()
{
System.out.println("iam having 10 crores"+y);
}
}
class c extends p
{
int z=10;
void display2()
{
System.out.println("i am having only 10 crores:"+z);
}
}
class multiple
{
public static void main(String args[])
{
c a=new c();
a.display2();
a.display1();
a.display();
}
}
