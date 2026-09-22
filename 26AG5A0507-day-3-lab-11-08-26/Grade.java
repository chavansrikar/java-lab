import java.util.*;
class Big
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your marks");
        int marks=s.nextInt();
        if(marks>=90)
        {
        System.out.println("your grade is A");
    }
    else if(marks<90 && marks >=70){
    System.out.println("your grade is B");
    }
    else if(marks<70 && marks<=50){
    System.out.println("your grade is C");
    }
    else{
    System.out.println("your fail");
    }
}
}
