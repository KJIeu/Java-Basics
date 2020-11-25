package lab5;

public class C extends B {
    public String c;

    public C() {
        this.c = "|C|";
    }

    public C(String c,String x) {
        super.x = new X(x);
        this.c = c;
    }

    public void printAll() {
        super.printAll();
        System.out.print(" " + c);
    }
}
