import java.util.*;
class Sort
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int i,j;
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
if(n>0)
{
if(n%2!=0)
{
int mid=n/2;
for(i=0;i<=mid;i++)
{
for(j=i+1;j<=mid;j++)
{
if(a[i]>a[j])
{
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
}
else
{
for(i=0;i<n/2;i++)
{
for(j=i+1;j<n/2;j++)
{
if(a[i]>a[j])
{
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
}
}
for(i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}


