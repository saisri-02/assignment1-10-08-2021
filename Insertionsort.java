import java.util.*;
class Insertionsort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size : ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter array elements : ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Before sorting : ");
show(a);
insertion(a,n);
System.out.println();
System.out.println("After sorting : ");
show(a);
}
static void insertion(int a[],int n)
{
for(int i=1;i<n;i++)
{
int temp=a[i];
int j=i-1;
while(j>=0 && a[j]>temp)
{
a[j+1]=a[j];
j--;
}
a[j+1]=temp;
}
}
static void show(int a[])
{
for(int i:a)
System.out.print(i+" ");
}
}

output:

Enter array size : 
7
Enter array elements : 
4 12 3 8 1 2 89
Before sorting : 
4 12 3 8 1 2 89 
After sorting : 
1 2 3 4 8 12 89 