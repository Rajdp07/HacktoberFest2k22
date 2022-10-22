package com.mycompany.ta2;
public class CityNotFoundException extends Exception{
//    private String check;
//    CityNotFoundException(String check){
//        this.check = check;
//    }
    @Override
    public String toString() {
        return "Sorry! We don't provide services here...";
    }
}
