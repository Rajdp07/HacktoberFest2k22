package com.mycompany.ta2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bunglow {

    String type;
    String city;
    double size;
 double SpecialCosts;

    String scost[];
    BufferedReader in;
    bunglow(String type, String city,double size,File f,String arr) throws FileNotFoundException{
        this.type = type;
        this.city = city;
        this.size = size;
        this.scost = arr.split(" ");
        this.SpecialCosts = Double.parseDouble(scost[1]);
            in = new BufferedReader(new FileReader(f));
    }

    double BmachCost;
    double LabourCost;
    double MaterialCost;
    double FinishingCost;
    double ResourcesCost;
//    double SmachCost;
    boolean b = false;

    void getCost() throws FileNotFoundException, IOException {
        if(size<500){
            try{
                throw new PlotSizeNotFound();
            }
            catch(PlotSizeNotFound e){
                System.out.println(e);
            }
            return;
        }

            String str;


            while((str=in.readLine())!=null){
                String[] ssplit = str.split("    ");
                String name = ssplit[0];
                if(name.equals(city)){
                    BmachCost = Double.parseDouble(ssplit[1]);
                    LabourCost = Double.parseDouble(ssplit[2]);
                    MaterialCost = Double.parseDouble(ssplit[3]);
                    FinishingCost = Double.parseDouble(ssplit[4]);
                    ResourcesCost = Double.parseDouble(ssplit[5]);
//                    SpecialCosts = Double.parseDouble(ssplit[6]);
                    b = true;
                    break;
                }
            }

//            if(b==false){
//                System.out.println("Sorry! Currently we do not provide our services in " + city);
//            }

    }

    void calculateEstimate() throws IOException{
        getCost();
        System.out.println("City : " + city + "    Type : Tier " + type + "    Area : " + size + " sq. feet");
        System.out.println("Estimate : ");
        System.out.println("==================================");
        System.out.println("Basic Machinery Cost : Rs. " + BmachCost*size);
        System.out.println("Labour Cost : Rs. " + LabourCost*size);
        System.out.println("Material Cost : Rs. " + MaterialCost*size);
        System.out.println("Finishing Cost : Rs. " + FinishingCost*size);
        System.out.println("Resources Cost : Rs. " + ResourcesCost*size);
        System.out.println("Special Machinery Cost : Rs. " + SpecialCosts*size);
        System.out.println("The quotation for Bunglow is:" + (this.BmachCost+ this.FinishingCost + this.LabourCost + this.MaterialCost + this.ResourcesCost + this.SpecialCosts));
    }


}
