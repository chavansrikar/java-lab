import java.util.*;
class SmAvgArray
{
    public static void main(String args[]){
        System.out.println("enter array size :");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println("enter array elements :");
    int a[]=new int[n];
    int sum=0;
    double Avg;
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
        sum=sum+a[i];

    }
    System.out.println("elements of entered array are :");
    for(int i=0;i<n;i++){
        System.out.println(a[i]);

    }
    Avg=sum/n;
    System.out.println("sum of elements entered array is ="+sum);
    System.out.println("Avg of elements entered array is ="+Avg);



    }
}