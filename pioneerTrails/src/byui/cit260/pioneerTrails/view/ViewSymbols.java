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
public class ViewSymbols extends View {
    
    public ViewSymbols() {
        this.promptMessage = getSymbolPrompt(); 
}

    @Override
    public boolean doAction(String inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSymbolPrompt() {
        Scene[] scene = GameControl.getSymbol();
        String msg = "The symbol for " + scene.getName() + " is, " + scene.getSymbol()
                    + ".";
            //System.out.println(msg);
            return msg; 
    }
    
}
