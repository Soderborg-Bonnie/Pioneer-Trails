/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.exceptions.GameControlExceptions;
import byui.cit260.pioneerTrails.model.Game;
import java.io.IOException;
import pioneertrails.PioneerTrails;

/**
 *
 * @author Bonnie
 */
public class SaveGameView extends View {

    public SaveGameView() {
        super();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    private String[] getInputs() {
// inputs = new String array one element long
//
// Display instructions to save the game
// input1 = getInput(thePromptMessage)
// save a reference to input1 in the inputs array
// return inputs
//} 
//    private String[] getInputs(String menuText) {
//        String[] inputs = new String[1];
//        this.console.println("Where do you want to save the game?");
//        String input1 = getInput(promptMessage);
//        inputs[1] = input1;
//        return inputs;
//    }
//    private boolean doAction(String [] inputs) {
// filePath = get first value in inputs array
// game = get the currentGame in the main class
// try
// call the saveGame(game)control method
// catch GameControlException
// Print error passed with the exception
// return false to repeat the view
// endTry
// Print a success message indicating where the
// file was saved
// return true to end the view
//}
    @Override
    public boolean doAction(String inputs) {
        String filePath = inputs;
        Game game = PioneerTrails.getCurrentGame();
        try {
            GameControl.saveGame(game, filePath);
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        this.console.println("\n======================================="
                + "\nThe game was saved to the following file:"
                + "\n" + filePath
                + "\n=======================================");
        return true;
    }

    @Override
    protected String getPromptMessage() {
        return "Save the hard work. Where do you want to save your game? Press Q to exit.";
     }

}
