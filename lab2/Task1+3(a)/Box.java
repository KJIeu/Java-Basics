package com.company;

public class Box {
    int  height, width , depth;
    int Volume, SurfaceArea;

    public Box(){
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    public Box(int a){
        this.height = a;
        this.width = a;
        this.depth = a;
    }

    public Box(int a, int b, int c){
        this.height = a;
        this.width = b;
        this.depth = c;
    }

    public void Volume(){
        Volume = height * width * depth;
    }

    public void SurfaceArea(){
        SurfaceArea = 2 * (height * width + width * depth + height * depth);
    }

    public void DisplayData(){
        System.out.println("| height: "+ height + " | width: " + width + " | depth: " + depth + " |");
        System.out.println("| Volume: " + Volume + " | Surface Area: " + SurfaceArea + " |");
    }
}

