import java.util.*;

class GMC
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your username");
        String name=s.nextLine();
        System.out.println("enter your password");
        int pwd=s.nextInt();
        if(name.equals("srikar@gmail.com"))
        {
            if(pwd==1234){
                System.out.println("login success");
            }

        }
        else{
            System.out.println("login invalid");
        }


    }
}