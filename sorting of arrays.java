import java.io.*;
import java.util.*;
class number
{
int arr[]=new int[100];
int n,i,j,t=0;
void getdata()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number of elements in array:");
n=s.nextInt();
System.out.println("enter the elements:");
for(i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
}
void calculation()
{
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(arr[i]>arr[j])
{
t=arr[i];
arr[i]=arr[j];
arr[j]=t;
}
}
}
}
void display()
{
System.out.println("the sorted array is:");
for(i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}
}
class sorting
{
public static void main(String args[])
{
number m=new number();
m.getdata();
m.calculation();
m.display();
}
}
