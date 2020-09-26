package com.company;


//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        University UTM = new University("UTM", 1964);

        /* 
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of UTM students:  ")
        UTM.SetStuds(in.nextInt());
        */
        
        UTM.SetStuds(10);
        UTM.DisplayData();
        
        System.out.println("\n======================\n======================\n");
        
        University USM = new University("USM", 1970);
        
        /*System.out.print("Input number of USM students:  ")
        USM.SetStuds(in.nextInt());
        */
        
        USM.SetStuds(10);
        USM.DisplayData();
        
        System.out.println("\n======================\n======================\n");
        
        University ULIM = new University("ULIM", 1994);
        
        /*
        System.out.print("Input number of ULIM students:  ")
        ULIM.SetStuds(in.nextInt());
        */
        
        ULIM.SetStuds(10);
        ULIM.DisplayData();
    }
}