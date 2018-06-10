/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.model.Player;
import java.util.Scanner;

/**
 *
 * @author tyler
 */
public class MainMenuView {

    public MainMenuView() {
    }
  
void displayMainMenuView() {
    System.out.println("What would you like to do next?");
    System.out.println("\nPress 'N' to start a new  game.");
    System.out.println("\nPress 'R' to reload a saved game.");
    System.out.println("\nPress 'H' to get help about game.");
    System.out.println("\nPress 'Q' to quit  game.");
                ;
        boolean endOfView = false;

        do {
            String[] inputs = this.getInputs();

            if (inputs[0].equalsIgnoreCase("Q")) {
                return;
            } else {
                endOfView = doAction(inputs);
            }
        } while (endOfView != true);

}
//   
private String[] getInputs() {
        System.out.println("GetInputs called");
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[1];
        Boolean valid = false;
        while (!valid) {
            System.out.println("Please input your choice: ");
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
        String menuChoice = inputs[0];
            switch (menuChoice){
                case "N":

        
                
                         

        return true;
//System.out.println("\nYour choice is: " + x
    }
    }

//IF player == null
// display “Could not create the player. “ +
// “Enter a different name.”
// RETURN false
//ENDIF
//DISPLAY "================================================= "
// + "Welcome to the game " + playersName
// + "We hope you have a lot of fun!”
// + "================================================= "
//mainMenuView = Create a new MainMenuView object
//mainMenuView.displayMainMenuView()
//RETURN true 
        //System.out.println("***doAction() called***");
        // System.out.println("\tinputs = " + inputs[0]);
//        String playersName = inputs[0];
//        Player player = GameControl.savePlayer(playersName);
//        if (player == null) {
//            System.out.println("Couldnot create the player."
//                    + "Enter a different name.");
//            return false;
//        }
////if (player == null)
////    System.out.println("Couldn't create player. Enter a different name.");
////return false;
//
//        System.out.println("\n============================================="
//                + "\nWelcome to the game, " + playersName + "!"
//                + "\nWe hope you have lots of fun!"
//                + "\n=============================================");
//
//        MainMenuView mainMenuView = new MainMenuView();
//        mainMenuView.displayMainMenuView();
//
//        //mainMenuView = Create a new MainMenuView object
//        //mainMenuView.displayMainMenuView()
        return true;

    }   


