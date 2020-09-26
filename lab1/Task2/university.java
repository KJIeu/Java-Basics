package com.company;

import java.lang.String;
import java.lang.Double;

class university
{
   String Name;
   int FoundationYear;
   String[] StudList;
   byte i = 0;

    public university(String SetName)
    {
        this.Name = SetName;
    }

    public void SetFY(int SetFY)
    {
        FoundationYear = SetFY;
    }

    public void SetStuds(String SetStuds)
    {
        StudList[i] = SetStuds;
        i++;
    }

}