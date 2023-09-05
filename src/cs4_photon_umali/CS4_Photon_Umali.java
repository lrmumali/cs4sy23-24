/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4_photon_umali;

/**
 *
 * @author PHOTON
 */
public class CS4_Photon_Umali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ob1 = "Item 1";
    String ob2 = "Item 2";
    String ob3 = "Item 3";

    String ob1Name = "lightbulb";
    String ob2Name = "electric fan";
    String ob3Name = "cellphone";

    int ob1Wattage = 18;
    int ob2Wattage = 50;
    int ob3Wattage = 5;

    String ob1Color = "white";
    String ob2Color = "blue";
    String ob3Color = "black";
    
    
    

    
    System.out.println(ob1);
    System.out.println("Name: " + ob1Name);
    System.out.println("Wattage in watts: " + ob1Wattage);
    System.out.println("Color: " + ob1Color);

    System.out.println("");

    System.out.println(ob2);
    System.out.println("Name: " + ob2Name);
    System.out.println("Wattage in watts: " + ob2Wattage);
    System.out.println("Color: " + ob2Color);

    System.out.println("");

    System.out.println(ob3);
    System.out.println("Name: " + ob3Name);
    System.out.println("Wattage in watts: " + ob3Wattage);
    System.out.println("Color: " + ob3Color);

    System.out.println("");

    System.out.println("Total Wattage: " + (ob1Wattage + ob2Wattage + ob3Wattage));
    System.out.println("Electric fan uses more electricity than cellphone: " + (ob2Wattage > ob3Wattage));
    System.out.println("Cellphone and lightbulb have the same color: " + (ob1Color == ob3Color));
    }
    
}
