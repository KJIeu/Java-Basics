package com.company;

//Lab 2 Task 1 + Task 3(a)

public class Main {

    public static void main(String[] args) {
	Box Box_a = new Box();
	Box Box_b = new Box(25);
	Box Box_c = new Box(15, 20, 25);

	Box_a.SurfaceArea();
	Box_a.Volume();

	Box_b.SurfaceArea();
	Box_b.Volume();

	Box_c.SurfaceArea();
	Box_c.Volume();

	System.out.println("Box_a: ");
	Box_a.DisplayData();

	System.out.println("\n\nBox_b: ");
	Box_b.DisplayData();

	System.out.println("\n\nBox_c: ");
	Box_c.DisplayData();


    }
}
