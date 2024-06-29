import java.util.*;
class Arrayduplicate
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
int b[]=new int[n];
int j=0;
for(i=k;i<n;i++)
{
b[j++]=a[i];
}
for(i=0;i<k;i++)
{
b[j++]=a[i];
}
for(i=0;i<n;i++)
System.out.print(b[i]+" ");
}
}