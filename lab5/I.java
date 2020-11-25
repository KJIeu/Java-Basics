package lab5;

public class I extends H {
    public String i;

    public I() {
        this.i = "|I|";
    }

    public I(String i,String x) {
        super.x = new X(x);
        this.i = i;
    }

    public void printAll() {
        super.printAll();
        System.out.print(" " + i);
    }

}
