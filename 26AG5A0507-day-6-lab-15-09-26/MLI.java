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
class C extends B{
    int c;
    public C(){
        c=30;
    }
    public void sum(){
        System.out.println(a+b+c);
    }
}
class MLI{
    public static void main(String[] args) {
       C c=new C();
       c.sum();
    }
}