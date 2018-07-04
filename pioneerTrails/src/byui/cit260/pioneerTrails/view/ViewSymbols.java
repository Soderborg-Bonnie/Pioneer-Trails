/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.model.Location;
import byui.cit260.pioneerTrails.model.Map;
import byui.cit260.pioneerTrails.model.Scene;
import pioneertrails.PioneerTrails;

/**
 *
 * @author tyler
 */
public class ViewSymbols extends View {

    public ViewSymbols() {
        this.promptMessage = getSymbolPrompt();
    }

    public String getSymbolPrompt() {
        Map map = PioneerTrails.getCurrentGame().getMap();
        Location[][] location = map.getLocations();
        String msg = "";
        for (int row = 0; row < map.getTotalRows(); row++) {
            for (int column = 0; column < map.getTotalColumns(); column++) {
                Scene scene = map.getLocations()[row][column].getScene();
                msg += "The symbol for " + scene.getName() + " is " + scene.getSymbol()
                        + ". \n";
            }
        }
        return msg;
    }

    @Override
    public boolean doAction(String inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
