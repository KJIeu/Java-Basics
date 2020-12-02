package lab8;

//public class Parallepiped extends GeometricBody{
public class Parallepiped implements GeometricBodyInterface{
    protected static int counter = 1;

    double length;
    double width;
    double height;
    String name;

    public Parallepiped(double length, double width, double height, String name){
        //super(length, width, height);
        this.length = length;
        this.width = width;
        this.height= height;
        this.name = name;
    }

    public Parallepiped(double length, double width, double height){
        //super(length, width, height);
        this.length = length;
        this.width = width;
        this.height= height;
        this.name = "Parallepiped_" + Integer.toString(counter);
        counter++;
    }
    @Override
    public double getVolume() {
        return length * width * height;
    }

    @Override
    public double getSurface() {
        return 2 * (length * width + length * height + width * length);
    }

    @Override
    public String getName() {
        return name;
    }
}
