class A
{
 void add(int a, int b){
    System.out.println(a+b);
}
 void add(int d,int a,int b){
    System.out.println(d+a+b);
}
class ML{
    public static void main(String args[]) {
        A b=new A();
        b.add(1,1);
        b.add(1,1,2);
    }
}}