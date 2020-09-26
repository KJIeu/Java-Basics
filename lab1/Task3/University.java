package com.company;

import java.util.Random;

public class University {

    String[] FirstNames =
            {
                    "Alexandru", "Bogdan", "Alexei", "Ion", "Iurie", "Eric",
                    "Nicolae", "Nikita", "Daniil", "Marius", "Marc", "David",
                    "Vladislav", "Viorel", "Gheorghe", "Egor", "Octavian", "Eugen",
                    "Felix", "Dominic", "Filip", "Rostislav", "Anatolii", "Gavriil",
                    "Rostislav", "Igor", "Sergiu", "Andrei", "Ilie",
                    "Anna", "Anastasia", "Angela", "Inna", "Lidia", "Maria",
                    "Iuliana", "Iulia", "Paula", "Daniela", "Marinella", "Ina",
                    "Nadejda", "Oxana", "Varvara", "Ksenia", "Daria", "Cristina",
                    "Renata", "Olga", "Irina", "Alina", "Polina", "Natalia",
                    "Claudia", "Nina", "Nelli", "Svetlana", "Valentina", "Elena"
            };

    String[] LastNames =
            {
                    "Popa", "Grigorescu", "Dumitrescu", "Bălan", "Dumitru",
                    "Antonescu", "Lungu", "Lupu", "Matei", "Cojocaru",
                    "Popescu", "Dalca", "Vladimirescu", "Ciobanu", "Moraru",
                    "Șerban", "Petran", "Albu", "Iliescu", "Ardelean",
                    "Volkov", "Filipov", "Romanov", "Fiodorov", "Bogomolov",
                    "Antonov", "Vinogradov", "Voronin", "Sokolov", "Smirnov",
                    "Ivanov", "Popov", "Ceaikovschii", "Cuznetsov", "Cozlov",
                    "Boico", "Zelenco", "Soboli", "Covaliciuc", "Șevciuc",
                    "Șveț", "Gavriliuc", "Tcacenco", "Golub", "Stasiuc",
                    "Borisov", "Ceaica","Zima", "Gorbaciuc", "Ivanenco",
                    "Rudavski", "Panosian", "Rudskih", "Jurav", "Morari",
                    "Colesnic", "Rotaru", "Grecu", "Gavrilita", "Bostan"
            };




    String Name;
    int FoundationYear;
    String[] StudList = new String[10000];
    int NumberOfStuds;
    int[] StudsAge = new int[10000];
    double[] StudsMark = new double[10000];
    double Average = 0.0;

    public University(String SetName, int SetDate)
    {
        this.Name = SetName;
        this.FoundationYear = SetDate;
    }

    public void SetStuds(int n)
    {
        Random rand = new Random();
        //I'm too lazy to input it by myself
        for (int j = 0; j < n; j++)
        {
            //-----name generation-----//
            StudList[j] = FirstNames[rand.nextInt(59)] + " " + LastNames[rand.nextInt(59)];
            //-----age generation-----//
            StudsAge[j] = rand.nextInt(10)+17;
            //-----mark generation-----//
            double q = rand.nextDouble()*10;
            q = q - (q % 0.01);
            StudsMark[j] = q;
            Average += StudsMark[j];
        }
        Average = Average/n;
        Average = Average - (Average % 0.001);
        NumberOfStuds = n;
    }

    public void DisplayData()
    {
        System.out.println(" University:  " + Name);
        System.out.println(" Foundation Year:  " + FoundationYear);
        System.out.println(" Number of students:  " + NumberOfStuds);
        System.out.println(" Average mark in university:  " + Average);
        System.out.println("\n\n List of students: ");
        for (int i = 0; i < NumberOfStuds; i++)
        {
            System.out.println(" Name: " + StudList[i]);
            System.out.println(" Age: " + StudsAge[i]);
            System.out.println(" Mark: " + StudsMark[i]);
            System.out.println("======================");
        }
    }

}
