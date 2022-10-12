// File header comes Here
//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:   Generics demo
// Course:   CS 300 Fall 2022
//
// Author:   Eason Xiao
// Email:    ( xiao227@wisc.edu email address)
// Lecturer: (Jeff Nyhoff)
public class GenericTemperatureDemo {
    public static void main(String[] args){

       

        TemperatureGeneric<Integer, String> boilingIntegerFahr=new TemperatureGeneric<Integer, String>(212, "F");
        System.out.print(boilingIntegerFahr);

        TemperatureGeneric<Double, String> boilingDoubleFahr=new TemperatureGeneric<Double, String>(212.0, "F");
        System.out.print(boilingDoubleFahr);

        TemperatureGeneric<Double, Character> boilingDoubleCelcius=new TemperatureGeneric<Double, Character>(100.0, 'C');
        System.out.print(boilingDoubleCelcius);

        TemperatureGeneric<Integer, Character> boilingIntegerCelcius=new TemperatureGeneric<Integer, Character>(100, 'C');
        System.out.print(boilingIntegerCelcius);
    }
}
