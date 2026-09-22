import java.util.*;
class If
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter your age to confirm major or minor");
int age=s.nextInt();
if(age>=18){
System.out.println("your an major");
}
else{
System.out.println("your an minor");
}
}
}
