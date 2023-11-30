import java.io.*;
import java.util.*;
class palind
{
public static void main(String args[])
{
String str="",rev= "";
Scanner s=new Scanner(System.in);
str=s.nextLine();
int n = str.length();`
for (int i = (n- 1); i >=0; --i)
{
rev = rev + str.charAt(i);
}
if (str.equals(rev)) 
{
System.out.println(str + " is a Palindrome ");
}
else
{
System.out.println(str + " is not a Palindrome ");
}
}
}
