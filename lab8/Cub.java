package lab8;


//public class Cub extends GeometricBody{
/*to use it with GeometricBody abstract class you must:
1) decomment lines 4, 15, 21
2) comment lines 11, 16, 22
*/
public class Cub implements GeometricBodyInterface{
    protected static int counter = 1;
    double length;
    String name;

    public Cub(double length, String name){
        //super(length);
        this.length = length;
        this.name = name;
    }

    public Cub(double length){
        //super(length);
        this.length = length;
        this.name = "Cub_" + Integer.toString(counter);
        counter++;
    }

    @Override
    public double getSurface() {
        return 6 * Math.pow(length,2);
    }

    @Override
    public double getVolume() {
        return Math.pow(length, 3);
    }

    @Override
    public String getName() {
        return name;
    }
}
