/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bonnie
 */
public class AcquireFood extends View {

    public static AcquireFood getListOfItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int length;

    public AcquireFood() {
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
                + "\n* Press 'D' to add up your choices.                    *"
                + "\n* Press 'Q' to quit game          .                    *"
                + "\n********************************************************");
    
    
    }

    public static double foodWeight = 0;
//    String[] listOfItems;
    ArrayList<String> listOfItems = new ArrayList<String>();
//    public static ArrayList listOfItems[];
   
        

    @Override
    public boolean doAction(String inputs) {

        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "1":
                foodWeight += 450;
                listOfItems.add("water, 50 gallon barrel");
                return false;
            case "2":
                foodWeight += 210;
                listOfItems.add("flour, 30 gallon barrel");
                return false;
            case "3":
                foodWeight += 350;
                listOfItems.add("flour, 50 gallon barrel");
                return false;
            case "4":
                foodWeight += 270;
                listOfItems.add("sugar 30 gallon barrel");
                return false;
            case "5":
                foodWeight += 450;
                listOfItems.add("sugar, 50 gallon barrel");
                return false;
            case "6":
                foodWeight += 50;
                listOfItems.add("oil, 5 gallon barrel");
                return false;
            case "7":
                foodWeight += 70;
                listOfItems.add("salt, 5 gallon barrel");
                return false;
            case "D":
                if (foodWeight <= 1500) {
                    System.out.println("Your food weight is : " + foodWeight + " pounds. Good job!");
                    
                    System.out.println(listOfItems);
                    
          


return true;
                } else {
                    foodWeight = 0;
                    System.out.println("Too greedy. Lost all your food. Try again.");
                    return false;
                }
            case "Q":
                return true;
            default:
                System.out.println("Hello?! McFly! Type in a correct menu item, or make like a tree and get outta here!");
        }
        return false;
    }
//public static createSortedListOfItems() {
//
//        AcquireFood listOfItems = new ListOfItems();
//        
//        String listOfItems = listOfItems.getAcquireFood();
//        int al = listOfItems.length;
//        int k;
//        for (int a = al; a >= 0; a--) {
//            for (int i = 0; 1 < al - 1; i++) {
//                k = i + 1;
//                if (listOfItems[i] > listOfItems[k]) {
//                    swapSpots(i, k, listOfItems);
//                }
//            }
//        }
//        return listOfItems[];
//    }
//
//    private static void swapSpots(int i, int k, String[] listOfItems) {
//        String temp;
//        temp = listOfItems[i];
//        listOfItems[i] == listOfItems[k];
//        listOfItems[k] == temp;
//        return new listOfItems();
//    }
//
//    private static void printList();
//
//    {
//        for (int i = 0, i <al; i++) {
//            System.out.println(listOfItems[i] + ", ");
//        }
//    }
    public void setAcquireFood() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
