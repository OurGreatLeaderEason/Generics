// File header comes Here
//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:   Generics demo
// Course:   CS 300 Fall 2022
//
// Author:   Eason Xiao
// Email:    ( xiao227@wisc.edu email address)
// Lecturer: (Jeff Nyhoff)
public class GenericsDemoProgram{
    public static void main(String[] args){
        GenericClothesSize<String> jeffTShirtSize=new GenericClothesSize<String>("XXL");
        System.out.println("Jeff's T-shirt size:");
        System.out.println(jeffTShirtSize.toString());

        GenericClothesSize<String> kellyTShirtSize=new GenericClothesSize<String>("M");
        System.out.println("Kelly's T-shirt size:");
        System.out.println(kellyTShirtSize.toString());
        printSize(kellyTShirtSize);

        GenericClothesSize<Integer> jeffSuitSize=new GenericClothesSize<Integer>(42);
        System.out.println("Jeff's T-shirt size:");
        System.out.println(jeffSuitSize.toString());

        GenericClothesSize<Integer> vinaySuitSize=new GenericClothesSize<Integer>(38);
        System.out.println("Vinay's T-shirt size:");
        System.out.println(vinaySuitSize.toString());
        printSize(vinaySuitSize);

        String[] tShirtArray={"XL", "XS", "M", "M", "L", "S"};

        System.out.println("T-shirt sizes:");
        
        printSizeArray(tShirtArray);

        Integer[] suitsArray={46, 42, 38, 38, 36, 40};
        System.out.println("T-shirt sizes:");
        printSizeArray(suitsArray);

    }
    public static <S> void printSize(S sizeGiven){

        System.out.println(sizeGiven);

    }

    public static <S> void printSizeArray(S[] sizesGiven){
        for(S size:sizesGiven){
            System.out.print(size+ " ");

        }
        System.out.println();
    }
}