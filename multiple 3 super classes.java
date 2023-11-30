import java.io.*;
import java.util.*;
class f
{
int age=50;
void get()
{
System.out.println("iam father "+age);
}
}
interface m1
{
int ag=38;
public void get1();
}
interface m2
{
int a=29;
public void get2();
}
class c extends f implements m1,m2
{
public void get1()
{
System.out.println("iam fisrst mother of child "+ag);
}
public void get2()
{
System.out.println("iam the second mother of child "+a);
}
}
class mulp
{
public static void main(String args[])
{
c b=new c();
b.get();
b.get1();
b.get2();
}
}
