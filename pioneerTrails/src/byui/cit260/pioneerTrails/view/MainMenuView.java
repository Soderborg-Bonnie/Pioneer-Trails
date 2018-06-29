/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.model.Player;

/**
 *
 * @author tyler
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n======================================="
                + "\n              Main Menu"
                + "\n======================================="
                + "\n*************************************"
                + "\n* Press 'N' to start a new  game.   *"
                + "\n* Press 'R' to reload a saved game. *"
                + "\n* Press 'H' to get help about game. *"
                + "\n* Press 'Q' to quit  game.          *"
                + "\n*************************************");
    }

    @Override
    public boolean doAction(String inputs) {

        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "N":
                gameMenuView();
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

    private void restartGame() {
        RestartGame restartGame = new RestartGame();
        restartGame.display();
    }

    private void getHelp() {
        GetHelp getHelp = new GetHelp();
        getHelp.display();
    }

    private void gameMenuView() {
        if (GameControl.createNewGame() == -1){
            System.out.println("Could not create game.");
            return;
        }
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
