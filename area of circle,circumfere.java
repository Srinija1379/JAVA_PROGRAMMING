import java.io.*;
import java.util.*;
class program
{
int r;
void area()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the radius");
r=s.nextInt();
System.out.println("the area is "+(3.14*r*r));
}
void circum()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the radius");
r=s.nextInt();
System.out.println("the circumference  is "+(2*3.14*r));
}}
class circle
{
public static void main(String args[])
{
program a=new program();
a.area();
a.circum();
}}
