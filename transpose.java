import java.io.*;
import java.util.*;
class Matrixs
{
public static void main(String args[])
{
int arr1[][]=new int[3][3];
int r,c;
Scanner s=new Scanner(System.in);
System.out.println("enter the elements of  matrix");
for(r=0;r<2;r++)
{
for(c=0;c<2;c++)
{
arr1[r][c]=s.nextInt();
}
}                                              
System.out.println("transpose matrix is:");
for(r=0;r<2;r++)
{
for(c=0;c<2;c++)
{
System.out.print(arr1[c][r]+" ");
}
System.out.println();
}
}
}
