/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ta2;

import java.io.*;
//import static java.lang.System.;
import java.util.*;

public class TA2 {

    public static void main(String[] args) throws IOException, HouseException, CityNotFoundException, Exception {
        Scanner sc = new Scanner(System.in);
        File filecheck = null;
        File f = new File("C:\\Users\\DELL\\Downloads\\teir2.txt");
        File f1 = new File("C:\\Users\\DELL\\Downloads\\tier3.txt");
        File f2 = new File("C:\\Users\\DELL\\Downloads\\tier1.txt");
        File f3 = new File("C:\\Users\\DELL\\Downloads\\HouseType.txt");
        BufferedReader in = new BufferedReader(new FileReader(f));
        BufferedReader in1 = new BufferedReader(new FileReader(f1));
        BufferedReader in2 = new BufferedReader(new FileReader(f2));
        BufferedReader in3 = new BufferedReader(new FileReader(f3));

        String[] arr2 = null;
        String special;
        while ((special = in3.readLine()) != null) {
            arr2 = special.split("    ");
        }

        String str;
        String cityName = null;
        String type = null;
        int tier = 0;
        boolean check = false;
        boolean typecheck = false;
        boolean tier1 = false, tier2 = false, tier3 = false;
        double plotsize = 0;
        int choice = 1;
        while (choice != 0) {
            System.out.println("Enter the city name");
            cityName = sc.next();
            System.out.println("Enter the plot size");
            plotsize = sc.nextDouble();
            boolean plotcheck = false;
//            try{
//                if(plotsize < 500){
//                    throw new PlotSizeNotFound();
////                    exit(0);
//                }
//                else{
//                   
//                }
//            
//            }catch(PlotSizeNotFound e){
//                System.out.println(e);
//            }
 
            System.out.println("Enter the type of house you want to build");
            type = sc.next();
            String str1[];
            String str2[];
            String str3[];
            String strfinal1[];
            String strfinal2[];
            String strfinal3[];

            while ((str = in.readLine()) != null) {
                str1 = str.split("    ");
                if (cityName.equals(str1[0])) {
                    check = true;
                    strfinal1 = str.split("    ");
                    tier2 = true;
                    filecheck = f;
                    break;
                }
            }
           if(check==false){
               
            while ((str = in1.readLine()) != null) {
                str2 = str.split("    ");
                if (cityName.equals(str2[0])) {
                    check = true;
                    strfinal2 = str.split("    ");
                    tier3 = true;
                    filecheck = f1;
                   break;
                } else {
                    check = false;
                }
            }
           }
            if(check==false){
                
            while ((str = in2.readLine()) != null) {
                str3 = str.split("    ");
                if (cityName.equals(str3[0])) {
                    check = true;
                    strfinal3 = str.split("    ");
                    tier1 = true;
                    filecheck = f2;
                    break;
                }
                else{
                    check = false;
                }
            }
            }
            break;
            
        }
        try{
        if(check == false){
            throw new CityNotFoundException();
        }
        if ("Duplex".equals(type) || "Flat".equals(type) || "Bunglow".equals(type) || "FarmHouse".equals(type)) {
            typecheck = true;
        } else {
            throw new HouseException();
        }
        }catch(CityNotFoundException | HouseException e){
            System.out.println(e);
        }

        if (tier1) {
            tier = 1;
        } else if (tier2) {
            tier = 2;
        } else if (tier3) {
            tier = 3;
        }

        if (typecheck) {
            if ("Duplex".equals(type)) {
                Duplex d;
                d = new Duplex(cityName, tier, plotsize, filecheck, arr2[0]);
                d.getInfo();
                d.calculatecosts();
                long estimateCost = d.totalEstimate();
                System.out.println("The quotation for Duplex is: " + estimateCost);
            } else if ("Flat".equals(type)) {
                Flat fl = new Flat(cityName, tier, plotsize, filecheck, arr2[2]);
                fl.calculateQuotation();
            } else if ("Bunglow".equals(type)) {
                bunglow b = new bunglow(type, cityName, plotsize, filecheck, arr2[1]);
                b.calculateEstimate();
            } else if ("FarmHouse".equals(type)) {
                FarmHouse fm = new FarmHouse(type, plotsize, cityName, filecheck, arr2[3]);
                fm.calculateEstimate();
            }
        }

    }
}
