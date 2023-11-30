import java.io.*;
import java.util.*;
class minmax
{
public static void main(String args[])
{
int x[]=new int[100];
int i,j,t=0;
Scanner s=new Scanner(System.in);
for(i=0;i<10;i++)
{
x[i]=s.nextInt();
}
System.out.println("output");
for(i=0;i<10;i++)
{
for(j=i+1;j<10;j++)
{
if(x[i]>x[j])
{
t=x[i];
x[i]=x[j];
x[j]=t;
}
}
}
System.out.println("max="+x[10]);
System.out.println("min="+x[0]);
int a=x[10]+x[0];
int b=x[10]-x[0];
System.out.println(a);
System.out.println(b);
}
}

