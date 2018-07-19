/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.MapControl;
import byui.cit260.pioneerTrails.exceptions.MapControlExceptions;
import byui.cit260.pioneerTrails.model.Game;
import byui.cit260.pioneerTrails.model.Location;
import byui.cit260.pioneerTrails.model.Map;
import byui.cit260.pioneerTrails.model.Scene;
import pioneertrails.PioneerTrails;

/**
 *
 * @author Bonnie
 */
public class GetMap extends View {

    public GetMap() {

    }

    @Override
    public boolean doAction(String inputs) {
        this.console.println("We suck at maps");
        return true;
    }

    @Override
    protected String getPromptMessage() {
        StringBuilder builder = new StringBuilder();
        Game game = PioneerTrails.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = MapControl.createLocations();
        builder.append(" |");
        for (int column = 0; column < locations[0].length; column++) {
            builder.append("  " + column + " |");
        }
        // Now build the map.  For each row, show the column information
        this.console.println();
        for (int row = 0; row < locations.length; row++) {
            builder.append(row + " "); // print row numbers to side of map
            for (int column = 0; column < locations[row].length; column++) {
                // set default indicators as blanks
                String leftIndicator = " ";
                String rightIndicator = " ";
                if (locations[row][column].getScene() == map.getCurrentScene()) {
                    // Set star indicators to show this is the current location.
                    leftIndicator = "*";
                    rightIndicator = "*";
                } else if (locations[row][column].isVisited()) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "<"; // same as above
                }

                builder.append("|"); // start map with a |
                if (locations[row][column].getScene() == null) {

                    // No scene assigned here so use ?? for the symbol
                    builder.append(leftIndicator + "??" + rightIndicator);
                } else {
                    builder.append(leftIndicator
                            + locations[row][column].getScene()
                            //+ Scene.getSymbol()
                            + rightIndicator);
                }
            }
            //this.console.println("|");
            builder.append("| \n");
        }
        return builder.toString();
    }

}
