import java.util.*;
class PerfectNo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter A value");
int a=s.nextInt();
int count=0;
int temp=a;
int sum=0;


for(int i=1;i<a;i++)
{
 if(a%i==0){
 sum+=i;

}
}
 if(sum==temp){
System.out.println(a+" is perfect number");
}
else{

System.out.println(a+" is not a perfect number");

}
}
}
