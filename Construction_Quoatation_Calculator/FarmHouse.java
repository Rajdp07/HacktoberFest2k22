package com.mycompany.ta2;
import java.io.*;

public class FarmHouse {
    String tier_type;
    double size;
    String city_name;
double SpecialCosts;

//        File f;
    String scost[];
    BufferedReader br;
    FarmHouse(String type,double s,String name,File f,String arr) throws FileNotFoundException{
        this.tier_type = type;
//        this.f = f;
        this.size = s;
        this.city_name = name;
         this.scost = arr.split(" ");
        this.SpecialCosts = Double.parseDouble(scost[1]);
br = new BufferedReader(new FileReader(f));
    }

    double BmachCost;
    double LabourCost;
    double MaterialCost;
    double FinishingCost;
    double ResourcesCost;
    boolean bool;
    void fhcost() throws FileNotFoundException, IOException{
        if(size<700){
            try{
                throw new PlotSizeNotFound();
            }
            catch(PlotSizeNotFound e){
                System.out.println(e);
            }
        }
        
        String str;
        while((str=br.readLine())!=null){
            String[] ssplit = str.split("    ");
            String name = ssplit[0];
            if(name.equals(city_name)){
                BmachCost = Double.parseDouble(ssplit[1]);
                LabourCost = Double.parseDouble(ssplit[2]);
                MaterialCost = Double.parseDouble(ssplit[3]);
                FinishingCost = Double.parseDouble(ssplit[4]);
                ResourcesCost = Double.parseDouble(ssplit[5]);
                bool =true;
                break;
            }
        }

    }

    void calculateEstimate() throws IOException{
        fhcost();
        System.out.println("City : " + city_name + "    Type : Tier " + tier_type + "    Area : " + size + " sq. feet");
        System.out.println("Estimate : ");
        System.out.println("==================================");
        System.out.println("Basic Machinery Cost : Rs. " + BmachCost*size);
        System.out.println("Labour Cost : Rs. " + LabourCost*size);
        System.out.println("Material Cost : Rs. " + MaterialCost*size);
        System.out.println("Finishing Cost : Rs. " + FinishingCost*size);
        System.out.println("Resources Cost : Rs. " + ResourcesCost*size);
        System.out.println("The quotation for FarmHouse is:" + (this.BmachCost+ this.FinishingCost + this.LabourCost + this.MaterialCost + this.ResourcesCost + this.SpecialCosts));
    }
}
