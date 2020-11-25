package lab5;

public class D extends C{
    public String d;

    public D() {
        this.d = "|D|";
    }

    public D(String d,String x) {
        super.x = new X(x);
        this.d = d;
    }

    public void printAll() {
        super.printAll();
        System.out.print(" " + d);
        x.printName();
    }

    protected X x = new X("[ var X in D ]");
}
