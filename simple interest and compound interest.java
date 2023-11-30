import java.io.*;
import java.util.*;
import java.lang.Math;
class simple
{
int p,t;
float r;
void simple_interset()
{
System.out.println("enter p,t and r values:");
Scanner s=new Scanner(System.in);
p=s.nextInt();
t=s.nextInt();
r=s.nextFloat();
float si=(p*t*r)/100;
System.out.println("simple interset is:"+si);
}
void compound_interset()
{
System.out.println("enter p,t and r values:");
Scanner s=new Scanner(System.in);
p=s.nextInt();
t=s.nextInt();
r=s.nextFloat();
double ci=Math.pow(p*(1+(r/100)),t);
System.out.println("compound interset is:"+ci);
}
}
class interest
{
public static void main(String args[])
{
simple e= new simple();
e.simple_interset();
e.compound_interset();
}
}
