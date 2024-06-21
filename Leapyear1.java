//if else program
import java.util.*;
class Leapyear1
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int a;
a=s.nextInt();
if((a%4==0)&&(a%100!=0||a%400==0))
{
System.out.println("leapyear");
}
else
{
System.out.println("Not leapyear");
}
}
}