import java.util.*;
class RestarantSc
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("1.paradise,2.mehifil,3.TG");
System.out.println("enter your Restarant");
int n=s.nextInt();
switch(n){
case 1 : System.out.println("welcome to paradise");
System.out.println("our menu's are :");
System.out.println("chicken biryani - 560 rupees");
System.out.println("mutton biryani - 1250 rupees");
System.out.println("veg rice - 460 rupees");

break;
case 2 : System.out.println("welcome to mehifil");
System.out.println("our menu's are :");
System.out.println("chicken biryani - 600 rupees");
System.out.println("mutton biryani - 1300 rupees");
System.out.println("veg rice - 350 rupees");

break;
case 3 : System.out.println("welcome to TG");
System.out.println("our menu's are :");
System.out.println("chicken biryani - 560 rupees");
System.out.println("mutton biryani - 1250 rupees");
System.out.println("veg rice - 460 rupees");

break;
default : System.out.println("enter valid option");

}
}
}
