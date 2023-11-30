import java.io.*;
import java.util.*;
class diag
{
public static void main(String args[])
{
int arr1[][]=new int[5][5];
int r,c,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the elements of  matrix");
for(r=0;r<3;r++)
{
for(c=0;c<3;c++)
{
arr1[r][c]=s.nextInt();
}
}                                              
System.out.println("sum is:");
for(r=0;r<3;r++)
{
for(c=0;c<3;c++)
{
if(arr1[r][r]==0)
{
sum=sum+arr1[r][c];
}
}
}
System.out.println(sum);
}
}

