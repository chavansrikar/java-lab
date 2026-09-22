import java.util.*;
class SwitchCase
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter A value");
int a=s.nextInt();
System.out.println("enter B value");
int b=s.nextInt();
System.out.println("1.Addition,2.subtraction,3.multiplication,4.division,5.modulus,");
System.out.println("enter your option :");
int n=s.nextInt();
switch(n){
case 1 : System.out.println(a+b);
break;
case 2 : System.out.println(a-b);
break;
case 3 : System.out.println(a*b);
break;
case 4 : System.out.println(a/b);
break;
case 5 : System.out.println(a%b);
break;
default : System.out.println("enter valid option");

}

}
}
