/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import java.util.Scanner;
/**
 *
 * @author Bonnie
 */
public class AcquireFood {
    
    public AcquireFood(){
    }
    
    void displayAcquireFood() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    boolean endOfView = false;
    Integer foodWeight = 0;
    do{
    System.out.println("==========================================================");
            System.out.println("                     Food Options");
            System.out.println("==========================================================");
            System.out.println("\n********************************************************"); 
            System.out.println("\n* You are allowed a total of 1500 pounds               *");
            System.out.println("\n* of food and water on this trip.                      *");
            System.out.println("\n* Choose wisely.                                       *");
            System.out.println("\n* Press '1' for a 50 gallon barrel of water---450#     *");
            System.out.println("\n* Press '2' for a 30 gallon barrel of flour---210#     *");
            System.out.println("\n* Press '3' for a 50 gallon barrel of flour---350#     *");
            System.out.println("\n* Press '4' for a 30 gallon barrel of sugar---270#     *");
            System.out.println("\n* Press '5' for a 50 gallon barrel of sugar---450#     *");
            System.out.println("\n* Press '6' for a 5 gallon barrel of oil-------50#      *");
            System.out.println("\n* Press '7' for a 5 gallon barrel of salt------70#      *");
            System.out.println("\n* Press 'D' to add up your choices.                    *");
            System.out.println("\n* Press 'Q' to quit game          .                    *");
            System.out.println("\n********************************************************");

            String[] inputs = this.getInputs();

            if (inputs[0].equalsIgnoreCase("Q")) {
                return;
            } else {
                endOfView = doAction(inputs);
            }
        } while (endOfView != true);

    }
    public static double foodWeight = 0;
    private String[] getInputs() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[1];
        Boolean valid = false;
        while (!valid) {
            System.out.println("Please select an option: ");
            inputs[0] = scanner.nextLine();
            inputs[0] = inputs[0].trim();
            if (inputs[0].length() < 1) {
                System.out.println("try again");
                continue;
            }
            valid = true;

        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {

        String menuItem = inputs[0].toUpperCase();
          switch (menuItem) {
                case "1":
                    foodWeight += 450;
                    return false;
                case "2":
                    foodWeight += 210;
                    return false;
                case "3":
                    foodWeight += 350;
                    return false;
                case "4":
                    foodWeight += 270;
                    return false;
                case "5":
                    foodWeight += 450;
                    return false;
                case "6":
                    foodWeight += 50;
                    return false;
                case "7":
                    foodWeight += 70;
                    return false;
                case "D":
                    if (foodWeight <= 1500){
                        System.out.println("Your food weight is : " + foodWeight + " pounds. Good job!");
                    return true;}
                    else{
                    foodWeight = 0;
                        System.out.println("Too greedy. Lost all your food. Try again.");
                    return false;}
                case "Q":
                    return true;
                default:
                    System.out.println("Hello?! McFly! Type in a correct menu item, or make like a tree and leaf.");
            }
            return false;
        }
}
    
