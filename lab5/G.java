package lab5;

public class G extends  F{
    public String g;

    public G() {
        this.g = "G";
    }

    public G(String g,String x) {
        super.x = new X(x);
        this.g = g;
    }

    public void printAll() {
        super.printAll();
        System.out.print(" " + g);
    }
}
