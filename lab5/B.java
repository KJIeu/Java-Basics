package lab5;

public class B extends A{
    public String b;

    public B() {
        this.b = "|B|";
    }

    public B(String b,String x) {
        super.x = new X(x);
        this.b = b;
    }

    public void printAll() {
        super.printAll();
        System.out.print(" " + b);
    }
}
