class A{
    int a;
}
class B extends A{
    int b;
    public B(){
        a=10;
    }
    public void sum(){
       System.out.println(a+b);
        
    }

}

class C extends B{
    int c;
    public C()
    {
    c=30;
    }
    public void sum(){
        System.out.println(a+b+c);

    }
}

class D extends B{
    int d;
    public D()
    {
        d=20;
    }
    public void sum(){
        System.out.println(a+b+d);
    }
}
class Hybirde{
    public static void main(String[] args) {
        D d=new D();
        d.sum();
    }
}