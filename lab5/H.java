package lab5;

public class H extends G{
    public String h;

    public H() {
        this.h = "|H|";
    }

    public H(String h,String x) {
        super.x = new X(x);
        this.h = h;
    }

    public void printAll() {
        super.printAll();
        System.out.print(" " + h);
        x.printName();
    }

    protected X x = new X("[ var X in H ]");
}
