import java.io.*;
import java.util.*;
class add{
int x,y;
add(int a,int b)
{
x=a;
y=b;
}
void display()
{
System.out.println("sum is"+(x+y));
}}
class construct
{
public static void main(String args[])
{
add m=new add(10,20);
m.display();
add m1=new add(20,30);
m1.display();
}
}
