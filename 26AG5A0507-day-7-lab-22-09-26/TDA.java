import java.util.*;
class TDA
{
    public static void main(String args[]){
        System.out.println("enter array size :");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println("enter array elements :");
    int a[][]=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        a[i][j]=s.nextInt();
        }

    }
    System.out.println("elements of entered array are :");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        System.out.print(a[i][j]+" ");

    }
    System.out.println("");


    }
}}