/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.model.Scene;
import java.util.Scanner;

/**
 *
 * @author Bonnie
 */
public class SceneMenu {

    public SceneMenu() {
    }

    void displayStartNewGame() {
        System.out.println("Yay for new games!");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        boolean endOfView = false;

        do {
            Scene scene = GameControl.getCurrentScene();
            String msg = "Welcome to " + scene.getName();
            System.out.println("=========================================");
            System.out.println(msg);
            System.out.println("=========================================");
            System.out.println("\n***************************************");
            System.out.println("\n* Press 'G' to view Game Menu.        *");
            System.out.println("\n* Press 'A' to acquire food.          *");
            System.out.println("\n* Press 'C' to continue your journey  *");
            System.out.println("\n* Press 'Q' to quit  game.            *");
            System.out.println("\n***************************************");

            String[] inputs = this.getInputs();

            if (inputs[0].equalsIgnoreCase("Q")) {
                return;
            } else {
                endOfView = doAction(inputs);
            }
        } while (endOfView != true);

    }

    private String[] getInputs() {
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
        switch (menuItem) {
            case "G":
                    gameMenuView();
                    break; 
            case "A":
                System.out.println("hungry?");
                acquireFood();
                break;
            case "C":
                return continueJourney();
            case "Q":
                return true;
            default:
                System.out.println("Hello?! McFly! Type in a correct menu item, or make like a tree and leaf.");
        }
        return false;
    }

    private void gameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }
    
    private void acquireFood() {
        AcquireFood acquireFood = new AcquireFood();
        acquireFood.displayAcquireFood();
    }

    private boolean continueJourney() {
        if(GameControl.advanceScene()){
            Scene scene = GameControl.getCurrentScene();
            String msg = "Congratulations! You made it to " + scene.getName() + "." +  scene.getDescription()
            + " The game is over.";
         System.out.println(msg);
         return true;
        }
        // todo: if we die, display we died   return true
        else {
            return false;
        }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
