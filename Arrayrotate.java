import java.util.*;
class Arrayrotate
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
int k=s.nextInt();
for(i=k;i<n;i++)
{
System.out.print(a[i]+" ");
}
for(i=0;i<k;i++)
{
System.out.print(a[i]+" ");
}
}
}