// File header comes Here
//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:   Generics demo
// Course:   CS 300 Fall 2022
//
// Author:   Eason Xiao
// Email:    ( xiao227@wisc.edu email address)
// Lecturer: (Jeff Nyhoff)
public class TemperatureGeneric<D, S> {
    //instance variables:
    private D degrees;
    private S scale;
    private final String DEGREES_SYMBOL="\u00B0";
    //constructor
    public TemperatureGeneric(D degrees, S scaleGiven){
        this.degrees=degrees;
        this.scale=scaleGiven;
    }
    public String toString(){
        return this.degrees+this.DEGREES_SYMBOL+this.scale+"\n";
    }

    public D getDegrees(){
        return this.degrees;
    }

    public S getScale(){
        return this.scale;
    }

    public void setDegrees(D degrees){
        this.degrees=degrees;
    }

    public void setScale(S scale){
        this.scale=scale;
    }
}
