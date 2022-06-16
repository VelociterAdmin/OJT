package com.velociter.chapter6example;
//import static com.velociter.chapter6example.ConversionFactors.*;
public class TryConversions extends ConversionFactors {
public static double poundsToGrams(double pounds) {
return pounds*POUND_TO_GRAM;
}
public static double inchesToMillimeters(double inches) {
return inches*INCH_TO_MM;
}
public static double  ounchToMillimeters(double ounch) {
return ounch*OUNCH_TO_MM;
}
public static double horsePowerToWatt(double horseP) {
return horseP*HP_TO_WATT;
}
public static double WattToHorsePower(double watt) {
return watt*WATT_TO_HP;
}


public static void main(String args[]) {
int myWeightInPounds = 180;
int myHeightInInches = 75;
int myHeightInOunch=70;
int currentInHorsePower=80;
int currentInWatt=59656;
System.out.println("My weight in pounds:" +myWeightInPounds +" in grams: "+ (int)poundsToGrams(myWeightInPounds));
System.out.println("My height in inches:" +myHeightInInches +" in millimeters: "+ (int)inchesToMillimeters(myHeightInInches));
System.out.println("My height in ounch:" +myHeightInOunch +" in millimeters: "+ (int)ounchToMillimeters(myHeightInOunch));
System.out.println("Current in HorsePower:" +currentInHorsePower +" in Watt: "+ (int)horsePowerToWatt(currentInHorsePower));
System.out.println("Current in Watt:" +currentInWatt+" in HorsePower: "+ (int)WattToHorsePower(currentInWatt));
 }
}