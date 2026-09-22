import java.util.*;
class ODA_LSLSSM{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
     System.out.println("enter array size  :");
    int n=s.nextInt();
    System.out.println("enter array elements :");
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    int largest=a[0];
    int smallest=a[0];
    int second_largest=a[0];
    int second_smallest=a[0];
    for(int i=0;i<n;i++){
        if(a[i]>largest){
            second_largest=largest;
            largest=a[i];
        }
        else if(a[i]>second_largest && a[i]!=0){
            second_largest=a[i];
        }
        if(a[i]<smallest){
            second_smallest=smallest;
            smallest=a[i];

        }
        else if(a[i]<second_smallest && a[i]!=0){
            second_smallest=a[i];
        }
    }
    System.out.println("largest ="+largest);
    System.out.println("smallest ="+smallest);
    System.out.println("second_largest ="+second_largest);
    System.out.println("second_smallest ="+second_smallest);

    

}
}