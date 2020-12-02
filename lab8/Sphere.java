package lab8;

//public class Sphere extends GeometricBody{
public class Sphere implements GeometricBodyInterface{
    protected static int counter = 1;
    double radix;
    String name;
    //here length is radix
    public Sphere(double radix, String name){
        //super(radix);
        this.radix = radix;
        this.name = name;
    }

    public Sphere(double radix){
        //super(radix);
        this.radix = radix;
        this.name = "Sphere_" + Integer.toString(counter);
        counter++;
    }

    @Override
    public double getSurface() {
        //return 4 * Math.PI * Math.pow(length, 2);
        return 4 * Math.PI * Math.pow(radix, 2);
    }

    @Override
    public double getVolume() {
        //return 4 * Math.PI * Math.pow(length, 3) / 3;
        return 4 * Math.PI * Math.pow(radix, 3) / 3;
    }

    @Override
    public String getName() {
        return name;
    }
}
