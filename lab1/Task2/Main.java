package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //two objects;)
        university utm = new university("UTM");
        Students[] studs = new Students[100];

        //-------Input Students----------//
        System.out.print("How many students do you want to introduce?  ");
        byte e = in.nextByte();

        for(int i = 0; i < e; i++)
        {
            System.out.println("Student #" + (i+1));
            //Name
            System.out.print("Input student's name: ");
            String a = in.next();
            String b = in.nextLine();
            studs[i] = new Students(a, b);

            //Age
            System.out.print("Input student's age: ");
            studs[i].SetAge(in.nextByte());

            //Mark
            System.out.print("Input student's average mark: ");
            studs[i].SetMark(in.nextDouble());
            System.out.println("\n==================================\n");
            
        }

        //-----Input dates about university-----//
        //Age
        System.out.print("Input foundation year of the university: ");
        utm.SetFY(1964); //in.nextInt()
        System.out.print("Input");
        //-----Associate students with university-----//
        for (int i = 0; i < e; i++)
        {

            utm.SetStuds(studs[i].FirstName + " " + studs[i].FirstName);
        }


        double sum = 0;
        for(int j=0; j <e; j++)
            sum = sum + studs[j].Mark;
        
 
        System.out.print("Average mark: " + sum/e);
        

    }

}








