package com.rplbo.tocm;

public class Main_71200535 {
    public static double FeetIncToCm(double feet, double inch){
        double hasil = 0;
        if(feet <= 0){
            return -1;
        }
        else if(inch > 12){
            return -1;
        }
        hasil = hasil + (inch * 2.54);
        hasil = hasil + ((12 * 2.54) * feet);
        System.out.println("Nilai dalam centimeter: "+hasil+" cm");
        return hasil;
    }
    public static double FeetIncToCm(int inch){
        if(inch <= 0){
            return -1;
        }
        int nilaiFeet = inch/12;
        int nilaiInch = inch%12;
        System.out.println(inch+" inc = "+nilaiFeet+" feet "+nilaiInch+" inc");
        return FeetIncToCm(nilaiFeet, nilaiInch);
    }

    public static void main(String[] args) {
        FeetIncToCm(1,3);
        FeetIncToCm(15);
        FeetIncToCm(12, 5);
        FeetIncToCm(30);
    }
}
