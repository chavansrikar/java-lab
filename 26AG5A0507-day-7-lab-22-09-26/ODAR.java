import java.util.*;
class ODAR
{
    public static void main(String args[]){
        System.out.println("enter array size :");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println("enter array elements :");
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();

    }
    System.out.println("elements of entered array are :");
    for(int i=n-1;i>=0;i--){
       
        System.out.println(a[i]);
    

    }


    }
}