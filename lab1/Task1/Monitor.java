package com.company;

import java.lang.String;
import java.lang.Double;


public class Monitor
{
    //monitor parameters
    String Producer;
    String Model;
    int Height, Width; // in millimetres
    int ResHeight;
    int ResWidth;
    long Res;
    long Area;
    //we introduce resolution in such way : 720 1080; so we need two variables(or an array) to save them
    Double PPI; //pixel per mm^2
    String Color;

    public Monitor(String SetModel)
    {
        this.Model = SetModel;
    }

    public void SetProducer(String SetProducer)
    {
        Producer = SetProducer;
    }

    public void SetResolution(int SetResHeight, int SetResWidth)
    {
        ResHeight = SetResHeight;
        ResWidth = SetResWidth;
        Res = ResHeight * ResWidth;
    }

    public void SetDimensions(int SetHeight, int SetWidth)
    {
        Width = SetWidth;
        Height = SetHeight;
        Area = Height * Width;
    }

    public void SetPPI()
    {
        PPI = 1.0* (ResHeight*ResWidth) / (Height*Width);
    }

    public void SetColor(String SetColor)
    {
        Color = SetColor;
    }

    public long getMonitorArea()
    {
        return Area;
    }

    public long getMonitorRes()
    {
        return Res;
    }

    public double getMonitorPPI()
    {
        return PPI;
    }

    public void DisplayInfo()
    {
        System.out.println("==================================");
        System.out.println("Producer: "+ Producer );
        System.out.println("Model: " + Model );
        System.out.println("Dimensions: " + Height + "×" + Width + " mm");
        System.out.println("Resolution: " + ResWidth + "×" + ResWidth);
        System.out.println("Pixel on square millimeter: " + PPI);
        System.out.println("==================================");
    }

}
