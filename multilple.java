import java.io.*;
import java.util.*;
class f
{
void get()
{
System.out.println("iam father");
}
}
interface m
{
public void get1();
}
class c extends f implements m
{
public void get1()
{
System.out.println("iam mother");
}
}
class multiple
{
public static void main(String args[])
{
c b=new c();
b.get();
b.get1();
}
}
