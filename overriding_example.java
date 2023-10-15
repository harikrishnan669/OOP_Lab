class A
{
    void print()
    {
        System.out.println("Call me method");
    }
}
class B extends A
{
    void print()
    {
        System.out.println("Call me method");
    }
}
class C extends A
{
    void print()
    {
        System.out.println("Call me method");
    }
}
class Main
{
    public static void main(String args[])
    {
        A a=new A();
        B b=new B();
        C c=new C();
        A r;
        
        r=a;
        r.print();
        r=b;
        r.print();
        r=c;
        r.print();
        r=c;
    }
}
