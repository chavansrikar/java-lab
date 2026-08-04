import java.util.*;

class Ao
{
public static void main(String args[])
{
   sum();
   sub();
   mul();
   div();
   modulus();

}
public static void sum(){

Scanner s=new Scanner(System.in);
System.out.println("enter the value of A=");
int a=s.nextInt();
System.out.println("enter the value of B=");
int b=s.nextInt();
System.out.println("the sum of A and B is ="+ (a+b));
}
public static void sub(){

Scanner s=new Scanner(System.in);
System.out.println("enter the value of A=");
int a=s.nextInt();
System.out.println("enter the value of B=");
int b=s.nextInt();
System.out.println("the subtracion of A and B is ="+ (a-b));

}
   public static void mul(){

Scanner s=new Scanner(System.in);
System.out.println("enter the value of A=");
int a=s.nextInt();
System.out.println("enter the value of B=");
int b=s.nextInt();
System.out.println("the multiplication of A and B is ="+ (a*b));
 
}
public static void div(){

Scanner s=new Scanner(System.in);
System.out.println("enter the value of A=");
int a=s.nextInt();
System.out.println("enter the value of B=");
int b=s.nextInt();
System.out.println("the division of A and B is ="+ (a/b));
}

public static void modulus(){

Scanner s=new Scanner(System.in);
System.out.println("enter the value of A=");
int a=s.nextInt();
System.out.println("enter the value of B=");
int b=s.nextInt();
System.out.println("the modulus of A and B is ="+ (a%b));
}}