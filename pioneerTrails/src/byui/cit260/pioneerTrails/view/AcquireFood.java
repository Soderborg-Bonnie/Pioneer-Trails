///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.pioneerTrails.view;
//
//import byui.cit260.pioneerTrails.control.WagonControl;
//import byui.cit260.pioneerTrails.model.Resource;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
///**
// *
// * @author Bonnie
// */
//public class AcquireFood extends View {
//
////    public static AcquireFood getListOfItems() {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
// 
//
//    public AcquireFood() {
//        promptMessage = getPromptMessage();
//        
//
//    }
//
////    public static double foodWeight = 0;
//////    String[] listOfItems;
////    ArrayList<String> listOfItems = new ArrayList<String>();
//////    public static ArrayList listOfItems[];
//
//    @Override
//    public boolean doAction(String inputs) {
//
//        String menuItem = inputs.toUpperCase();
//        boolean result = false;
//        
//        switch (menuItem) {
//            case "1":
//                result = WagonControl.acquireResource("water", 50, 450);
//                //System.out.println("acquireFood choice 1 result: " +result);
////                System.out.println("what's in array at end of choices: " + Wagon.resources);
//                break;
//            case "2":
//                result = WagonControl.acquireResource("flour", 30, 240);
//                //System.out.println("acquireFood choice 2 result: " +result);
//                break;
//            case "3":
//                result = WagonControl.acquireResource("flour", 50, 350);
//                //System.out.println("acquireFood choice 3 result: " +result);
//                break;
//            case "4":
//                result = WagonControl.acquireResource("sugar", 30, 270);
//                //System.out.println("acquireFood choice 4 result: " +result);
//                break;
//            case "5":
//                result = WagonControl.acquireResource("sugar", 50, 450);
//                //System.out.println("acquireFood choice 5 result: " +result);
//                break;
//            case "6":
//                result = WagonControl.acquireResource("oil", 5, 50);
//                break;
//            case "7":
//                result = WagonControl.acquireResource("salt", 5, 70);
//                break;
//            case "8":
//                result = WagonControl.acquireResource("wheel", 1, 100);
//                break;
//            case "9":
//                result = WagonControl.acquireResource("hammer", 1, 10);
//                break;
//            case "10":
//                result = WagonControl.acquireResource("bullets", 50, 500);
//                break;
//            case "11":
//                result = WagonControl.acquireResource("axe", 1, 15);
//                break;
//            case "12":
//                result = WagonControl.acquireResource("wood", 10, 50);
//                break;
////            case "D":
////                if (foodWeight <= 1500) {
//////                    System.out.println("Your food weight is : " + foodWeight + " pounds. Good job!");
////                    this.console.println("Your food weight is : " + foodWeight + " pounds. Good job!");
//
////                    Collections.sort(listOfItems);
//////                  System.out.println(listOfItems);
////                    this.console.println(listOfItems);
////
////                    return true;
////                } else {
////                    foodWeight = 0;
//////                   System.out.println("Too greedy. Lost all your food. Try again.");
////                    this.console.println("Too greedy. Lost all your food. Try again.");
////                    return false;
////                }
//            case "Q":
//                
//                return true;
//            default:
////                System.out.println("Hello?! McFly! Type in a correct menu item, or make like a tree and get outta here!");
//                this.console.println("Hello?! McFly! Type in a correct menu item, or make like a tree and get outta here!");
//        }
//        if (!result) {
//            this.console.println("That doesn't fit and can't be added.");
//        }
//        
//        return false;
//        
//    }
//
//    @Override
//    protected String getPromptMessage() {
//       return "\n=========================================================="
//                + "\n                     Food Options"
//                + "\n=========================================================="
//                + "\n********************************************************"
//                + "\n* You are allowed a total of 2000 pounds               *"
//                + "\n* of food and water on this trip.                      *"
//                + "\n* Choose wisely.                                       *"
//                + "\n* Press '1' for a 50 gallon barrel of water---450#     *"
//                + "\n* Press '2' for a 30 gallon barrel of flour---210#     *"
//                + "\n* Press '3' for a 50 gallon barrel of flour---350#     *"
//                + "\n* Press '4' for a 30 gallon barrel of sugar---270#     *"
//                + "\n* Press '5' for a 50 gallon barrel of sugar---450#     *"
//                + "\n* Press '6' for a 5 gallon barrel of oil-------50#     *"
//                + "\n* Press '7' for a 5 gallon barrel of salt------70#     *"
//                + "\n* Press '8' for a wheel-----------------------100#     *"
//                + "\n* Press '9' for a hammer-----------------------10#     *"
//                + "\n* Press '10' for 50 bullets--------------------50#     *"
//                + "\n* Press '11' for an axe------------------------15#     *"
//                + "\n* Press '12' for 10 pieces of wood-------------50#     *"
//                //                + "\n* Press 'D' to add up your choices.                    *"
//                + "\n* Press 'Q' to finish and return to Location Menu------*"
//                + "\n********************************************************";
//    }
//
//    
//
//}
////    
////    public void setAcquireFood() {
////        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
//
