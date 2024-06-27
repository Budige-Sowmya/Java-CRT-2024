import java.util.*;
class Squares
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int i;
int b[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
b[i]=Math.abs((int)Math.pow(a[i],2));
}
Arrays.sort(b);
for(i=0;i<n;i++)
{
System.out.print(b[i]+" ");
}
}
}