import java.util.*;
class Ams
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n value to check it is amstrong or not amstrong : ");
        int n=s.nextInt();
        int cube=0;
        int sum=0,temp,r,i;
        temp=n;
        for(i=n;0<i;i=n/10)
        {
            r=n%10;
            cube=r*r*r;
            sum=sum+cube;
    
        }
        System.out.println(sum+" " +temp);
        if(temp==sum){
            System.out.println("the entered value is an amstorng number");
        }
        else{
            System.out.println("the entered value is not amstrong number");
        }
    }
}