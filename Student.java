import java.util.*;

class Student
{
public static void main(String args[])
{
   Scanner s=new Scanner(System.in);
   System.out.println("Enter your name = ");
   String name=s.nextLine();
   System.out.println("Enter your age in years= ");
   float age=s.nextFloat();
   s.nextLine();
   System.out.println("Enter your roll no =");
   String roll_no=s.nextLine();
   System.out.println("Enter your address =");
   String adres=s.nextLine();
   System.out.println(name+" "+age+" "+roll_no+" "+adres );



}}