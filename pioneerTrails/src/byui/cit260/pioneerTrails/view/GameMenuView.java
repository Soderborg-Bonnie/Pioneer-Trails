/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

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
                + "\n* Press 'F' to view resources.        *"
                + "\n* Press 'I' to view health concerns.  *"
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
                getMap();
                break;
            case "P":
                getPlayers();
                break;
            case "F":
                getResources();
                break;
            case "I":
                getHealth();
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
        getHealth.displayGetHealth();
    }

    private void getMap() {
        GetMap getMap = new GetMap();
        getMap.displayGetMap();
    }

    private void getPlayers() {
        GetPlayers getPlayers = new GetPlayers();
        getPlayers.displayGetPlayers();
    }

    private void getResources() {
        GetResources getResources = new GetResources();
        getResources.displayGetResources();
    }

    private void getHelp() {
        GetHelp getHelp = new GetHelp();
        getHelp.display();
    }

    private void saveGame() {
        SaveGame saveGame = new SaveGame();
        saveGame.displaySaveGame();
    }

    private void goHunt() {
        HuntView newHunt = new HuntView();
        newHunt.displayHuntView();
    }

    @Override
    public String getInput(String menuText) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
