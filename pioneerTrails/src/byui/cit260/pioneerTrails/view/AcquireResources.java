/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Bonnie
 */
public class AcquireResources extends View {

    public AcquireResources() {
        super("\n=========================================================="
                + "\n                     Food Options"
                + "\n=========================================================="
                + "\n********************************************************"
                + "\n* You are allowed a total of 1500 pounds               *"
                + "\n* of food and water on this trip.                      *"
                + "\n* Choose wisely.                                       *"
                + "\n* Press '1' for a 50 gallon barrel of water---450#     *"
                + "\n* Press '2' for a 30 gallon barrel of flour---210#     *"
                + "\n* Press '3' for a 50 gallon barrel of flour---350#     *"
                + "\n* Press '4' for a 30 gallon barrel of sugar---270#     *"
                + "\n* Press '5' for a 50 gallon barrel of sugar---450#     *"
                + "\n* Press '6' for a 5 gallon barrel of oil-------50#     *"
                + "\n* Press '7' for a 5 gallon barrel of salt------70#     *"
                + "\n* Press '8' for a wheel-----------------------100#     *"
                + "\n* Press '9' for a hammer-----------------------10#     *"
                + "\n* Press '10' for 50 bullets--------------------50#     *"
                + "\n* Press '11' for an axe------------------------15#     *"
                + "\n* Press '12' for 10 pieces of wood-------------50#     *"
                //                + "\n* Press 'D' to add up your choices.                    *"
                + "\n* Press 'Q' to finish and return to Location Menu------*"
                + "\n********************************************************");

    }

    public static double foodWeight = 0;
    //    String[] listOfItems;
    ArrayList<String> listOfItems = new ArrayList<>();
   //resourceList = new String [12][3];
    //    public static ArrayList listOfItems[];

    @Override
    public boolean doAction(String inputs) {
       // ArrayList<> listOfItems = new ArrayList<>();
        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "1":
                foodWeight += 450;
                //listOfItems.add("water", 50, 450);
                listOfItems.add("water---50 gallon barrel");
                return false;
            case "2":
                foodWeight += 210;
                listOfItems.add("flour---30 gallon barrel");
                return false;
            case "3":
                foodWeight += 350;
                listOfItems.add("flour---50 gallon barrel");
                return false;
            case "4":
                foodWeight += 270;
                listOfItems.add("sugar---30 gallon barrel");
                return false;
            case "5":
                foodWeight += 450;
                listOfItems.add("sugar---50 gallon barrel");
                return false;
            case "6":
                foodWeight += 50;
                listOfItems.add("oil---5 gallon barrel");
                return false;
            case "7":
                foodWeight += 70;
                listOfItems.add("salt---5 gallon barrel");
                return false;
                
            case "8":
                foodWeight += 100;
                listOfItems.add("wheel---1");
                return false;
             
            case "9":
                foodWeight += 10;
                listOfItems.add("hammer---1");
                return false;
                
            case "10":
                foodWeight += 50;
                listOfItems.add("bullets---50");
                return false;
                
            case "11":
                foodWeight += 15;
                listOfItems.add("axe---1");
                return false;
                
            case "12":
                foodWeight += 50;
                listOfItems.add("wood---10");
                return false;
                
                
            case "D":
                if (foodWeight <= 1500) {
                    this.console.println("Your food weight is : " + foodWeight + " pounds. Good job!");

                    Collections.sort(listOfItems);
                    //                  System.out.println(listOfItems);
                    this.console.println(listOfItems);
//                    if (!listOfItems.get(0).isEmpty()){
//                    this.console.println(listOfItems.get(0));}
//                    if (listOfItems.get(1) != ""){
//                    this.console.println(listOfItems.get(1));}
//                    if (listOfItems.get(2) != ""){
//                    this.console.println(listOfItems.get(2));}
//                    if (listOfItems.get(3) != ""){
//                    this.console.println(listOfItems.get(3));}
//                    if (listOfItems.get(4) != ""){
//                    this.console.println(listOfItems.get(4));}
//                    if (listOfItems.get(5) != ""){
//                    this.console.println(listOfItems.get(5));}
//                    if (listOfItems.get(6) != ""){
//                    this.console.println(listOfItems.get(6));}
                    
                    return true;
                } else {
                    foodWeight = 0;
                    //                   System.out.println("Too greedy. Lost all your food. Try again.");
                    this.console.println("Too greedy. Lost all your food. Try again.");
                    return false;
                }
            case "Q":
                return true;
            default:
                //                System.out.println("Hello?! McFly! Type in a correct menu item, or make like a tree and get outta here!");
                this.console.println("Hello?! McFly! Type in a correct menu item, or make like a tree and get outta here!");
        }
        return false;
    }

    @Override
    protected String getPromptMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
