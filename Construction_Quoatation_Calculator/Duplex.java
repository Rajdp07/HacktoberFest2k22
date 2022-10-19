package com.mycompany.ta2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Duplex {
    String cityName;
    int tier;
    double plotSize;
    BufferedReader in;
    int days = 30;
    String s[];
    double BmachCost;
    double LabourCost;
    double MaterialCost;
    double FinishingCost;
    double ResourcesCost;

    double SpecialCosts;

    String scost[];
    Duplex(String cityName,int tier,double plotSize,File f,String arr) throws FileNotFoundException{
        this.in = new BufferedReader(new FileReader(f));
        this.cityName = cityName;
        this.tier = tier;
        this.plotSize = plotSize;
        this.scost = arr.split(" ");
        this.SpecialCosts = Double.parseDouble(scost[1]);
    }
    void getInfo(){
        System.out.println("City Name: " + this.cityName + "\n" + "Tier: " + this.tier + "\n" + "Plot Size" + this.plotSize);
    }
    String str;
    
    void extractCosts() throws IOException,Exception{
        try{
            while((str = in.readLine())!=null){
                s = str.split("    ");
                if(s[0].equals(this.cityName)){
                this.BmachCost = Double.parseDouble(s[1]);
                this.FinishingCost = Double.parseDouble(s[2]);
                this.LabourCost = Double.parseDouble(s[3]);
                this.MaterialCost = Double.parseDouble(s[4]);
                this.ResourcesCost = Double.parseDouble(s[5]);
                }
            }
        }catch(IOException | NumberFormatException e){
            System.out.println(e);
        }
    }
    
    void calculatecosts() throws Exception{
        extractCosts();
        this.BmachCost = this.BmachCost*this.days;
        this.FinishingCost = this.FinishingCost*this.days;
        this.LabourCost = this.LabourCost*this.days;
        this.MaterialCost = this.MaterialCost*this.days;
        this.ResourcesCost = this.ResourcesCost*this.days;
        this.SpecialCosts = this.SpecialCosts*this.days;
}
    
    long totalEstimate() throws Exception{
        long total;
        calculatecosts();
        System.out.println("Type of house: " + "Duplex");
        System.out.println("Location: " + this.cityName);
        System.out.println("Plot size: " + this.plotSize);
        System.out.println("Basic machinary cost: "+ this.BmachCost);
        System.out.println("Total Finishing cost: " + this.FinishingCost);
        System.out.println("Total Labour cost: " + this.LabourCost);
        System.out.println("Total Material Cost: " + this.MaterialCost);
        System.out.println("Total resource cost: " + this.ResourcesCost);
        System.out.println("Special costs: " + this.SpecialCosts);
        total = (long) (this.BmachCost+ this.FinishingCost + this.LabourCost + this.MaterialCost + this.ResourcesCost + this.SpecialCosts);
        return total;
    }
}
