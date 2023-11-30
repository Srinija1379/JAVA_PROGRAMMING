import java.io.*;
import java.util.*;
class add
{
int x,y;
void display()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the two numbers:");
x = s.nextInt();
y = s.nextInt();

System.out.println("sum of two numbers is:"+(x+y));
}
}
class sum
{
public static void main(String args[])
{
add a=new add();
a.display();
}
}
