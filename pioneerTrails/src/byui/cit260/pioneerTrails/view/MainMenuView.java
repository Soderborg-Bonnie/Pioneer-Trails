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
        
        String menuItem = inputs[0].toUpperCase();
            switch (menuItem){
                case "N": startNewGame();
                break;
                case "R": restartGame();
                break;
                case "H": getHelp();
                break;
                case "Q":return true;
                default: System.out.println("Invalid selection.");
        }
        return false;

    
    }

 private void startNewGame(){
    StartNewGame startNewGame = new StartNewGame();
    startNewGame.displayStartNewGame();
}

private void reloadGame(){
    RestartGame restartGame = new RestartGame();
    restartGame.displayRestartGame();
}

private void helpMenu(){
    GetHelp getHelp = new GetHelp();
    getHelp.displayGetHelp();
}
}