//if condition program in java
import java.util.*;
class Division
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int a,b;
a=s.nextInt();
b=s.nextInt();
if(b==0)
{
System.out.println("Second number cannot be zero");
b=1;
}
int r=a/b;
System.out.println(r);
}
}