import java.util.*;
class Operator
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int a,b;
a=s.nextInt();
b=s.nextInt();
int c;
System.out.println("Enter your choice(1/2/3/4)");
c=s.nextInt();
switch(c)
{
case 1:
int x=a+b;
System.out.println("Sum ="+x);
break;
case 2:
int y=a-b;
System.out.println("Subs ="+y);
break;
case 3:
int z=a*b;
System.out.println("Mult ="+z);
break;
case 4:
System.out.println(a/b);
break;
default:
System.out.println("Invalid choice");
}
}
}