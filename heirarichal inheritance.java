import java.io.*;
import java.util.*;
class p
{
 int x=30;
void display()
{
System.out.println("i am parent i have 3 children and i have 30 crores property"+x);
}
}
class c1 extends p
{
 int y=10;
void display1()
{
System.out.println("i am first child my parent gave me 10 crores."+y);
}
}
class c2 extends p
{
int z=10;
void display2()
{
System.out.println("i am second child my parent gave me 10 crores:"+z);
}
}
class c3 extends p
{
int z=10;
void display3()
{
System.out.println("i am third child my parent gave me 10 crores:"+z);
}
}
class hierarichal
{
public static void main(String args[])
{
c3 a3=new c3();
a3.display3();
a3.display();
c2 a2=new c2();
a2.display2();
c1 a1=new c1();
a1.display1();
}
}
