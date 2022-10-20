package com.mycompany.ta2;
public class PlotSizeNotFound extends Exception{
    @Override
    public String toString(){
        return "Sorry! We do not provide services for plot size less than 500 sq feet";
    }
}
