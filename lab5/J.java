package lab5;

public class J extends I{
    public String j;

    public J() {
        this.j = "|J|";
    }

    public J(String j,String x) {
        super.x = new X(x);
        this.j = j;
    }

    public void printAll() {
        super.printAll();
        System.out.print(" " + j);
    }

}
