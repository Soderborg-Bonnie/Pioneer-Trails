/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.exceptions.GameControlExceptions;
import byui.cit260.pioneerTrails.exceptions.MapControlExceptions;
import byui.cit260.pioneerTrails.model.Player;
import byui.cit260.pioneerTrails.model.Scene;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tyler
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super();
    }

    @Override
    public boolean doAction(String inputs) {

        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "N": {
                try {
                    gameMenuView();
                } catch (GameControlExceptions ex) {
//                System.out.println(ex.getMessage());
                    ErrorView.display(this.getClass().getName(), "Sorry. There's a problem with the game.");
                } catch (MapControlExceptions ex) {
//                System.out.println(ex.getMessage());
                    ErrorView.display(this.getClass().getName(), "Sorry. There's a problem with the map.");
                }
            }
            break;
            case "R":
                this.restartGame();
                break;
            case "H":
                getHelp();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "Hello?! McFly! Type in a correct menu item, or make like a tree and leaf.");
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

    private void gameMenuView() throws GameControlExceptions, MapControlExceptions {
//        try {
        if (GameControl.createNewGame() == -1) {
            this.console.println("Could not create game.");
            return;
        }
//        } catch (MapControlException mce) {
//            System.out.println(mce.getMessage());
//        }
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    protected String getPromptMessage() {
        
                return "\n======================================="
                + "\n              Main Menu"
                + "\n======================================="
                + "\n*************************************"
                + "\n* Press 'N' to start a new  game.   *"
                + "\n* Press 'R' to reload a saved game. *"
                + "\n* Press 'H' to get help about game. *"
                + "\n* Press 'Q' to quit  game.          *"
                + "\n*************************************";
    }

}
