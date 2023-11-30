import java.io.*;
import java.util.*;
class number
{
int x,y,z;
void display()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the two numbers:");
x = s.nextInt();
y = s.nextInt();

System.out.println("after swapping:");
z=x;
x=y;
y=z;
System.out.println(x+","+y);
}
}
class swap
{
public static void main(String args[])
{
number n=new number();
n.display();
}
}
