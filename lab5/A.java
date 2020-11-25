package lab5;

public class A {
    public String a;
    public A() {
        this.a = "|A|";
    }

    public A(String a, String x) {
        this.a = a;
        this.x = new X(x);
    }

    public void printAll() {
        System.out.print(a);

         x.printName();
    }

    protected X x = new X("[ var X in A ]");


}
