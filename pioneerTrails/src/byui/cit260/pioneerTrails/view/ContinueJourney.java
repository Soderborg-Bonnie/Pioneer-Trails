/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.model.Scene;

/**
 *
 * @author tyler
 */
public class ContinueJourney extends View {

    public ContinueJourney() {
        this.promptMessage = getScenePrompt();
    }

    public String getScenePrompt() {
        if (GameControl.advanceLocation()) {
            Scene scene = GameControl.getCurrentScene();
            String msg = "Welcome to " + scene.getName() + ", " + scene.getDescription()
                    + ". " + "Press 'Q' to return to the location menu and choose an option.";
            //System.out.println(msg);
            return msg;
            //System.out.println(endMsg);
            
        } // todo: if we die, display we died   return true
        else {
            Scene scene = GameControl.getCurrentScene();
            String endMsg = "Congratulations! You made it to " + scene.getName() + "." + scene.getDescription()
                    + " The game is over. Press \"Enter\" to exit the game.";
            return endMsg;
        }
    }

    @Override
    public boolean doAction(String inputs) {
        return false; 
    }

}
