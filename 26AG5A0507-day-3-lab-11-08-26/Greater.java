import java.util.*;
class Greater
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter A value");
        int a=s.nextInt();
        System.out.println("enter B value");
         int b=s.nextInt();
         System.out.println("enter C value");
          int c=s.nextInt();
        if(a>b && a>c)
        {
        System.out.println("A is greater");
    }
    else if(b>c){
    System.out.println("B is greater");
    }
    else{
    System.out.print("C is greater");
}
}}
