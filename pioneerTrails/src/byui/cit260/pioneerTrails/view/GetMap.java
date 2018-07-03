/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.MapControl;
import byui.cit260.pioneerTrails.model.Game;
import byui.cit260.pioneerTrails.model.Location;
import byui.cit260.pioneerTrails.model.Scene;
import pioneertrails.PioneerTrails;

/**
 *
 * @author Bonnie
 */
public class GetMap extends View {

    public GetMap() {
       Game game = PioneerTrails.getCurrentGame();
       Location[][] locations = MapControl.getLocations();
       System.out.print(" |");
       for(int column = 0; column<locations[0].length;column++){
        System.out.print("  " + column + " |"); 
       }
          // Now build the map.  For each row, show the column information
    System.out.println();
    for( int row = 0; row < locations.length; row++){
     System.out.print(row + " "); // print row numbers to side of map
      for( int column = 0; column < locations[row].length; column++){
         // set default indicators as blanks
         String leftIndicator = " ";
         String rightIndicator = " ";
        if(locations[row][column] == MapControl.getCurrentLocation()){
          // Set star indicators to show this is the current location.
          leftIndicator = "*"; 
          rightIndicator = "*"; 
        } 
        else if(locations[row][column].isVisited()){
           // Set < > indicators to show this location has been visited.
           leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
           rightIndicator = "<"; // same as above
        }
       System.out.print("|"); // start map with a |
        if(locations[row][column].getScene() == null)
        {
             // No scene assigned here so use ?? for the symbol
             System.out.print(leftIndicator + "??" + rightIndicator);
        }
        else
          System.out.print(leftIndicator
             + locations[row][column].getScene()
             + Scene.getSymbol()
             + rightIndicator);
      }
     System.out.println("|");
    }
 }

    @Override
    public boolean doAction(String inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
        
    }

    @Override
    public String getInput(String menuText) {
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(String inputs) {
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayGetMap(){
    System.out.println("found the maps");
    }

    

}
