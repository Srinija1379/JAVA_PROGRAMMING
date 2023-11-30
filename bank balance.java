import java.io.*;
import java.util.*;
class Bank_Account
{
int cusno,intialamt,totalamt;
int depamt,withamt;
void getdata()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the cusno,intial ammount,total amount");
cusno=s.nextInt();
intialamt=s.nextInt();
totalamt=s.nextInt();
}
void Balance()
{
System.out.println("Balance amount in the account is:"+totalamt);
}
void deposit()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the deposit amount");
depamt=s.nextInt();
totalamt=totalamt+depamt;
System.out.println("Balance amount in the account is:"+totalamt);
}

void withdrawal()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the withdrawal amount:");
withamt=s.nextInt();
if(totalamt<=500)
{
System.out.println("withdrawal failed due to insufficient balance");
}
else
{
totalamt=totalamt-withamt;
System.out.println("after withdrawal balance is:"+totalamt);
}
}
}
class account
{
public static void main(String args[])
{
Bank_Account b=new Bank_Account();
b.getdata();
b.Balance();
b.deposit();
b.withdrawal();
}
}
