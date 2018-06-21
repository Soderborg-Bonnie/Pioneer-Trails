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
public class MainMenuView extends View {

    public MainMenuView() {
        super(
            "\n=======================================" +
            "\n              Main Menu" +
            "\n=======================================" +
            "\n*************************************" +
            "\n* Press 'N' to start a new  game.   *" +
            "\n* Press 'R' to reload a saved game. *" +
            "\n* Press 'H' to get help about game. *" +
            "\n* Press 'Q' to quit  game.          *" +
            "\n*************************************");
    }

//    public void display() {
//
//        boolean endOfView = false;
//
////        do {
//
//            
//
//            String[] inputs = this.getInputs();
//
//            if (inputs[0].equalsIgnoreCase("Q")) {
//                return;
//            } else {
//                endOfView = doAction(inputs);
//            }
//        } while (endOfView != true);
//
//    }
////   
//
//    private String[] getInputs() {
//        Scanner scanner = new Scanner(System.in);
//        String[] inputs = new String[1];
//        Boolean valid = false;
//        while (!valid) {
//            System.out.println("Please select an option: ");
//            inputs[0] = scanner.nextLine();
//            inputs[0] = inputs[0].trim();
//            if (inputs[0].length() < 1) {
//                System.out.println("try again");
//                continue;
//            }
//            valid = true;
//
//        }
//        return inputs;
    //}

    @Override
    public boolean doAction(String inputs) {

        String menuItem = inputs.toUpperCase();
          switch (menuItem) {
                case "N":
                    startNewGame();
                    break;
                case "R":
                    restartGame();
                    break;
                case "H":
                    getHelp();
                    break;
                case "Q":
                    return true;
                default:
                    System.out.println("Hello?! McFly! Type in a correct menu item, or make like a tree and leaf.");
            }
            return false;
        }
    

    private void startNewGame() {
        GameControl.createNewGame();
        SceneMenu startNewGame = new SceneMenu();
        startNewGame.displayStartNewGame();
    }

    private void restartGame() {
        RestartGame restartGame = new RestartGame();
        restartGame.displayRestartGame();
    }

    private void getHelp() {
        GetHelp getHelp = new GetHelp();
        getHelp.displayGetHelp();
    }

    @Override
    public String getInput(String menuText) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    

