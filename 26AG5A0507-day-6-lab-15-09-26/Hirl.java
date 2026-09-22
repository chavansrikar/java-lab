class A{
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
class C extends A{
    int c;
    public C(){
        c=40;
    }
    public void sum(){
        System.out.println(a+c);
    }
}
class Hirl{
    public static void main(String[] args) {
        B c=new B();
        c.sum();
    }
}