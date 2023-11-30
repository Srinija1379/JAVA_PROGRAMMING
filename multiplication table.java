import java.io.*;
import java.util.*;
class table
{
int n,i;
table(int a)
{
n=a;
for(i=1;i<11;i++)
{
System.out.println(n+"X"+i+"="+n*i);
}
}
}
class mul
{
public static void main(String args[])
{
table t=new table(4);
}
}
