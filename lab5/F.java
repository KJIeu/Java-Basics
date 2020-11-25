package lab5;

public class F extends E{
    protected String f;

    public F() {
        this.f = "|F|";
    }

    public F(String f,String x) {
        super.x = new X(x);
        this.f = f;
    }

    public void printAll() {
        super.printAll();
        System.out.print(" " + f);
    }
}
