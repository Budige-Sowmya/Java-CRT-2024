import java.util.*;
class Order
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
for(i=n-1;i>=n/2;i--)
{
System.out.print(a[i]+" ");
}
for(i=0;i<n/2;i++)
{
System.out.print(a[i]+" ");
}
}
}