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
import pioneertrails.PioneerTrails;

/**
 *
 * @author Bonnie
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("=========================================="
                + "\nGame Menu"
                + "\n========================================="
                + "\n***************************************"
                + "\n* Press 'M' to view map.              *"
                + "\n* Press 'P' to view players.          *"
                + "\n* Press 'F' to view current resources.*"
                + "\n* Press 'I' to view health concerns.  *"
                + "\n* Press 'L' to view location menu.    *"
                + "\n* Press 'G' to go on a hunt.          *"
                + "\n* Press 'H' to view help menu.        *"
                + "\n* Press 'S' to save the game.         *"
                + "\n* Press 'Q' to quit  game.            *"
                + "\n***************************************");
    }

//    @Override
//    public void display() {
//    }
//    
    @Override
    public boolean doAction(String inputs) {

        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "M":
                displayMap();
                break;
            case "P":
                getPlayers();
                break;
            case "F":
                getCurrentResources();
                break;
            case "I":
                getHealth();
                break;
            case "L":
                sceneMenu();
                break;
            case "G":
                goHunt();
                break;
            case "H":
                getHelp();
                break;
            case "S":
                saveGame();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Invalid selection.");
        }
        return false;

    }

    private void getHealth() {
        GetHealth getHealth = new GetHealth();
        getHealth.display();
    }

    public void displayMap() {
        Game game = PioneerTrails.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations(); //MapControl.createLocations();
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
                if(locations[row][column].getScene() == map.getCurrentScene()){
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
                if(locations[row][column].getScene() == null) {
                    
                    // No scene assigned here so use ?? for the symbol
                    System.out.print(leftIndicator + "??" + rightIndicator);
                }
                else
                    System.out.print(leftIndicator
                            + locations[row][column].getScene().getSymbol()
                            //+ Scene.getSymbol()
                            + rightIndicator);
            }
            System.out.println("|");
        }
    
 }

    private void getPlayers() {
        GetPlayers getPlayers = new GetPlayers();
        getPlayers.display();
    }

    private void getCurrentResources() {
        ViewCurrentResources viewCurrentResources = new ViewCurrentResources();
        viewCurrentResources.display();
    }

    private void getHelp() {
        GetHelp getHelp = new GetHelp();
        getHelp.display();
    }

    private void saveGame() {
        SaveGame saveGame = new SaveGame();
        saveGame.display();
    }

    private void goHunt() {
        HuntView newHunt = new HuntView();
        newHunt.display();
    }

    private void sceneMenu() {
        SceneMenu sceneMenu = new SceneMenu();
        sceneMenu.display();
    }

   

    

}
