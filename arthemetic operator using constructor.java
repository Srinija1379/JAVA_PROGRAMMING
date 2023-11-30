import java.io.*;
import java.util.*;
class operation
{
int a,b;
operation()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the two numbers:");
a= s.nextInt();
b = s.nextInt();
System.out.println("sum of two numbers is:"+(a+b));
System.out.println("subtraction of two numbers is:"+(a-b));
System.out.println("multiplication of two numbers is:"+(a*b));
System.out.println("division of two numbers is:"+(a/b));
System.out.println("modulus of two numbers is:"+(a%b));
}
}
class arithoperation
{
public static void main(String args[])
{
operation r=new operation();
}
}
