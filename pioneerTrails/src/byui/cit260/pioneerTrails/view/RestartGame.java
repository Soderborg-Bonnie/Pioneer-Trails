/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.exceptions.GameControlExceptions;
import byui.cit260.pioneerTrails.model.Game;
import java.util.logging.Level;
import java.util.logging.Logger;
import pioneertrails.PioneerTrails;

/**
 *
 * @author Bonnie
 */
public class RestartGame extends View {

    public RestartGame() {

        super("Yay for old games! Enter game file name. Press Q to quit.");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    private String[] getInputs(String menuText) {
//        String[] inputs = new String[1];
//        this.console.println("Which game do you want to play?");
//        String input1 = getInput(promptMessage);
//        inputs[1] = input1;
//        return inputs;
//    }




@Override
    public boolean doAction(String inputs) {
            String filePath = inputs;
        try {
            GameControl.getGame(filePath);
        } catch (GameControlExceptions ex) {
            ErrorView.display(RestartGame.class.getName(), ex.getMessage());
        }
            GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.display();
            return true;
        }    

    

//private boolean doAction(String [] inputs) {
// filePath = get first value in inputs array
// try
// call the getGame() control method
// catch GameControlException
// Print error passed with the exception
// return false to repeat the view
// endTry
// gameMenuView = Create a new GameMenuView object
// display the gameMenuView
// return true to end the view
//}

//        String menuItem = inputs.toUpperCase();
//        switch (menuItem) {
//            case "N":
//                gameMenuView();
//                break;
//            case "R":
//                restartGame();
//                break;
//            case "H":
//                getHelp();
//                break;
//            case "Q":
//                return true;
//            default:
//                System.out.println("Hello?! McFly! Type in a correct menu item, or make like a tree and leaf.");
//        }
//        return false;
//    }

    public void displayRestartGame() {
        display();//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
