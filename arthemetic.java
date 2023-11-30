import java.io.*;
import java.util.*;
class operation
{
public static void main(String args[])
{
int a,b;
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
38.Fibonacci series
import java.io.*;
import java.util.*;
class fibonacci
{
public static void main(String args[])
{
int n,n1=0,n2=1,n3,i;
Scanner s=new Scanner(System.in);
System.out.println("enter nth number:");
n=s.nextInt();
System.out.println(n1+","+n2);
for(i=1;i<=n;i++)
{
n3=n1+n2;
n1=n2;
n2=n3;
System.out.println(n3);
}
}
}
