/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.exceptions.GameControlExceptions;
import byui.cit260.pioneerTrails.model.Game;
import pioneertrails.PioneerTrails;

/**
 *
 * @author Bonnie
 */
public class SaveGameView extends View {

    public SaveGameView() {
        super("Save the hard work.");
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

    private String[] getInputs(String menuText) {
        String[] inputs = new String[1];
        this.console.println("Where do you want to save the game?");
        String input1 = getInput(promptMessage);
        inputs[1] = input1;
        return inputs;
    }
    
    public boolean doAction(String[] inputs) {
        String filePath = inputs[1];
        Game game = PioneerTrails.getCurrentGame();
        
        game = GameControl.saveGame(filePath);  
        this.console.println("\n======================================="
                + "\nThe game was saved to the following file:"
                + "\n" + filePath
                + "\n=======================================");
        return true;
    }

    @Override
    public boolean doAction(String inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

}
