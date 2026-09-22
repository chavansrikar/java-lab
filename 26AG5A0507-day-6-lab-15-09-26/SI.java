class A
{
int a;
}
class B extends A{
    int b;
    public B(){
        a=10;
        b=20;
    }
    public void sum(){
        System.out.println(a+b);

    }
}
class SI{
    public static void main(String args[]) {
        B b=new B();
        b.sum();
    }
}