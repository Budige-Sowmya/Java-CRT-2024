import java.util.*;
class Quadratic
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
float a,b,c;
a=s.nextFloat();
b=s.nextFloat();
c=s.nextFloat();
float d=b*b-4*a*c;
if(d<0)
{
System.out.println("roots are not possible");
}
else 
{
float r1=(float)(-b+Math.sqrt(d))/2*a;
float r2=(float)(-b-Math.sqrt(d))/2*a;
System.out.println(r1);
System.out.println(r2);
}
}
}
