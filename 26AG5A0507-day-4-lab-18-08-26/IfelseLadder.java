import java.util.*;
class IfelseLadder
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter A value");
int a=s.nextInt();
System.out.println("enter B value");
int b=s.nextInt();
System.out.println("enter C value");
int c=s.nextInt();
if(a>b && a>c){
System.out.println(a+" is Bigest");
}
else if(b>c)
{
System.out.println(b+" is Bigest");
}
else{
System.out.println(c+" is Bigest");

}
}
}
