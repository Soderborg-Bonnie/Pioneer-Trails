/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import java.util.Scanner;

/**
 *
 * @author Bonnie
 */
public class GameMenuView {

    public GameMenuView() {
    }

    void displayGameMenuView() {
        boolean endOfView = false;

        do {
            System.out.println("=========================================");
            System.out.println("                Game Menu");
            System.out.println("=========================================");
            System.out.println("\n***************************************");
            System.out.println("\n* Press 'M' to view map.              *");
            System.out.println("\n* Press 'L' to view current location. *");
            System.out.println("\n* Press 'P' to view players.          *");
            System.out.println("\n* Press 'F' to view resources.        *");
            System.out.println("\n* Press 'I' to view health concerns.  *");
            System.out.println("\n* Press 'H' to view help menu.        *");
            System.out.println("\n* Press 'S' to save the game.         *");
            System.out.println("\n* Press 'Q' to quit  game.            *");
            System.out.println("\n***************************************");

            String[] inputs = this.getInputs();

            if (inputs[0].equalsIgnoreCase("Q")) {
                return;
            } else {
                endOfView = doAction(inputs);
            }
        } while (endOfView != true);

    }
//   

    private String[] getInputs() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[1];
        Boolean valid = false;
        while (!valid) {
            System.out.println("Please input your choice: ");
            inputs[0] = scanner.nextLine();
            inputs[0] = inputs[0].trim();
            if (inputs[0].length() < 1) {
                System.out.println("try again");
                continue;
            }
            valid = true;

        }
        return inputs;
    }

    private boolean doAction(String[] inputs) {

        String menuItem = inputs[0].toUpperCase();
        switch (menuItem) {
            case "M":
                getMap();
                break;
            case "L":
                getLocation();
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

    private void getLocation() {
        GetLocation getLocation = new GetLocation();
        getLocation.displayGetLocation();
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
        getHelp.displayGetHelp();
    }

    private void saveGame() {
        SaveGame saveGame = new SaveGame();
        saveGame.displaySaveGame();
    }

}
