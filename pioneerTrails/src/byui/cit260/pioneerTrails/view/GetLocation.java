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
public class GetLocation {
    
    public GetLocation() {    
    }

    public void displayGetLocation() {

        boolean endOfView = false;

        do {

            System.out.println("============================================");
            System.out.println("              Location Menu");
            System.out.println("============================================");
            System.out.println("\n******************************************");
            System.out.println("\n* Press 'L' to get current location.     *");
            System.out.println("\n* Press 'C' to continue your journey     *");
            System.out.println("\n* Press 'Q' to quit  game.               *");
            System.out.println("\n******************************************");

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
            System.out.println("Please select an option: ");
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
                case "L":
                    getCurrentLocation();
                    break;
                case "C":
                    continueJourney();
                    break;
                case "Q":
                    return true;
                default:
                    System.out.println("Hello?! McFly! Type in a correct menu item, or make like a tree and get outta here!");
            }
            return false;
        }

    private void getCurrentLocation() {
        GetCurrentLocation getCurrentLocation = new GetCurrentLocation();
        getCurrentLocation.displayGetCurrentLocation();
    }

    private void continueJourney() {
        ContinueJourney continueJourney = new ContinueJourney();
        continueJourney.displayContinueJourney();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    
}
