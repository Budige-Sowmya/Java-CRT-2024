import java.util.*;
class Biggest
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int a,b,c;
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if(a>b)
{
if(a>c)
{
System.out.println(a);
}
else 
{
System.out.println(c);
}
}
else if(b>c)
{
System.out.println(b);
}
else {
System.out.println(c);
}
}
}