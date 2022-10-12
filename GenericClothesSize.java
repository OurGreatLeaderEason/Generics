// File header comes Here
//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:   Generics demo
// Course:   CS 300 Fall 2022
//
// Author:   Eason Xiao
// Email:    ( xiao227@wisc.edu email address)
// Lecturer: (Jeff Nyhoff)
public class GenericClothesSize<S>{
    //instance variables
    private S size;

    //constructor(s):
    public GenericClothesSize(S sizeGiven){
        this.size=sizeGiven;
    }

    public S getSize(){
        return this.size;
    }

    public void setSize(S size){
        this.size=size;
    }

    //String version
    @Override
    public String toString(){
        return this.size.toString();
    }
}
