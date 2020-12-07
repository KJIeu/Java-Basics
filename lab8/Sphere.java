package lab8;

//public class Sphere extends GeometricBody{
/*to use it with GeometricBody abstract class you must:
1) decomment lines 3, 15, 21, 29, 35
2) comment lines 11, 16, 22, 30, 36
3) replace "double radix" in lines 14 and 20 by "double length"
*/
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
