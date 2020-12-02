package lab8;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Part One with GeometricBodyInterface implementation
        List<GeometricBodyInterface> GeometricBodyList = new ArrayList<>();
        GeometricBodyList.add(new Cub(15, "ЯКУБОВИЧ"));
        GeometricBodyList.add(new Parallepiped(10, 20, 15.5, "ЯПАРАЛЛЕПИПЕДОВИЧ"));
        GeometricBodyList.add(new Sphere(5, "ЯШАРОВИЧ"));

        for (int i = 0; i < GeometricBodyList.size(); i++) {
            System.out.println("---------------");
            System.out.println("Name: " + GeometricBodyList.get(i).getName());
            System.out.println("Surface Area: " + GeometricBodyList.get(i).getSurface());
            System.out.println("Volume: " + GeometricBodyList.get(i).getVolume() + "\n");
        }
        System.out.println("---------------");

        //Part Two with GeometricBodyInterface implementation
        GeometricBodyController GBC = new GeometricBodyController(GeometricBodyList);
        int BS = GBC.GetMaxSurface(); //BS == Biggest Surface
        System.out.println("The biggest Surface has "+ GeometricBodyList.get(BS).getName());
        System.out.println("Surface Area is equal with " + GeometricBodyList.get(BS).getSurface());

        int BV = GBC.GetMaxVolume(); //BV == Biggest Volume
        System.out.println("\nThe biggest Volume has "+ GeometricBodyList.get(BV).getName());
        System.out.println("Volume is equal with " + GeometricBodyList.get(BV).getVolume());
    }
}
