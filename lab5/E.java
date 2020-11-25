package lab5;

public class E extends D{
    public String e;

    public E() {
        this.e = "|E|";
    }

    public E(String e,String x) {
        super.x = new X(x);
        this.e = e;
    }

    public void printAll() {
        super.printAll();
        System.out.print(" " + e);
    }

}
