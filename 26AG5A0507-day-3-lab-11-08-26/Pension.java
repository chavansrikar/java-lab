import java.util.*;
class Pension
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter age for pension eligibility to check =");
        int n=s.nextInt();
        if(n>60)
        {
        System.out.println("eligible for pension");
    }

    else{
    System.out.println("not eligible for pension");
    }
}
}
