package com.company;

import java.util.Scanner;



public class Main {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Monitor[] DBM = new Monitor[100];

        int i = 0;
        int max;
        Monitor tmp;

        System.out.print("How much Monitors do you want to introduce?  ");
        byte e = in.nextByte();

        while (i < e) {
            System.out.print("Input Model: ");
            String a = in.nextLine();
            DBM[i] = new Monitor(a);

            System.out.print("Input Producer: ");
            String b = in.nextLine();
            DBM[i].SetProducer(b);

            System.out.print("Input Color: ");
            String c = in.nextLine();
            DBM[i].SetColor(c);

            System.out.println("Input Dimensions: (in millimeters)");
            System.out.print("Height: ");
            int q = in.nextInt();
            System.out.print("Width: ");
            int w = in.nextInt();
            DBM[i].SetDimensions(q, w);

            System.out.println("Input Resolution: ");
            System.out.print("Height: ");
            q = in.nextInt();
            System.out.print("Width: ");
            w = in.nextInt();
            DBM[i].SetResolution(q, w);

            DBM[i].SetPPI();

            System.out.println("==================================");
            i++;
            System.out.println();
        }
        System.out.println("Parameter for monitors sorting?");
        System.out.println("1 - Dimensions");
        System.out.println("2 - Resolution");
        System.out.println("3 - Pixel per mm^2 ");
        System.out.print("Input number :");
        byte a = in.nextByte();
        System.out.println();
        switch (a)
        {
            //sort by dimensions
            case 1: {
                System.out.println("Sort by dimensions :");
                for (i = 0; i < e - 1; i++) {
                    max = i;
                    for (int n = i + 1; n < e; n++) {
                        if (DBM[n].getMonitorArea() > DBM[max].getMonitorArea())
                            max = n;
                    }

                    tmp = DBM[i];
                    DBM[i] = DBM[max];
                    DBM[max] = tmp;
                }
            }
            case 2: {
                System.out.println("Sort by resolution :");
                for (i = 0; i < e - 1; i++) {
                    max = i;
                    for (int n = i + 1; n < e; n++) {
                        if (DBM[n].getMonitorRes() > DBM[max].getMonitorRes())
                            max = n;
                    }

                    tmp = DBM[i];
                    DBM[i] = DBM[max];
                    DBM[max] = tmp;
                }
            }

            case 3: {
                System.out.println("Sort by pixel per mm^2 :");
                for (i = 0; i < e - 1; i++) {
                    max = i;
                    for (int n = i + 1; n < e; n++) {
                        if (DBM[n].getMonitorPPI() > DBM[max].getMonitorPPI())
                            max = n;
                    }

                    tmp = DBM[i];
                    DBM[i] = DBM[max];
                    DBM[max] = tmp;
                }
            }
        }
        for (i = 0; i < e; i++)
            DBM[i].DisplayInfo();
    }
}
