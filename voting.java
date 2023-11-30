import java.io.*;
import java.util.*;
class example
{
int area(int a)
{
return a*a;
}
float area(float a)
{
return a*a;
}
int area(int a,int b)
{
return a+b;
}
float area(float a,float b)
{
return a+b;
}
float area(int a,float b)
{
return a+b;
}
String area(String name)
{
return name;
}
}
class mol
{
public static void main(String args[])
{
example e=new example();
System.out.println(e.area(10));
System.out.println(e.area(10.5f));
System.out.println(e.area(10,20));
System.out.println(e.area(10.2f,9.5f));
System.out.println(e.area("sri"));
}
}
