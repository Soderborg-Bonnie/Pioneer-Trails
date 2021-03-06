/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.control.WagonControl;
import byui.cit260.pioneerTrails.model.Scene;
import java.util.Scanner;

/**
 *
 * @author Bonnie
 */
public class SceneMenu extends View {

    public SceneMenu() {

        super();
    }

    @Override
    public boolean doAction(String inputs) {

        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
//            case "G":
//                    gameMenuView();
//                    break; 
            case "A":
                acquireResources();
                //acquireResources();
                break;
            case "W":
                //WagonControl.calcWagonWheelDegradation(0, 0, inputs)
                break;
            case "D":
                printSiteDescriptions();
                break;
            case "V":
                viewSymbols();
                break;
            case "C":
                continueJourney();
                break;
            case "R":
                ViewCurrentResources();
                break;
            case "Q":
                return true;
            default:
                this.console.println("Hello?! McFly! Type in a correct menu item, or make like a tree and get outta here!");
        }
        return false;
    }

    private void acquireResources() {
        AcquireResources acquireResources = new AcquireResources();
        acquireResources.display();
    }

//    private void acquireFood() {
//        AcquireFood acquireFood = new AcquireFood();
//        acquireFood.display();
//    }
    private void printSiteDescriptions() {
        ViewDescriptionsOfSites viewDescriptionsOfSites = new ViewDescriptionsOfSites();
        viewDescriptionsOfSites.display();
    }

    private void ViewCurrentResources() {
        ViewCurrentResources viewCurrentResources = new ViewCurrentResources();
        viewCurrentResources.display();
    }

    private void continueJourney() {
        //System.out.println("Work in progress.");
        ContinueJourney continueJourney = new ContinueJourney();
        continueJourney.display();
    }

    private void viewSymbols() {
        ViewSymbolsReportView viewSymbolsReportView = new ViewSymbolsReportView();
        viewSymbolsReportView.display();
    }

//End the game code, must check if out of resources
//    Println(“You won or lost the game (whatever the appropriate message is”);
//
//    PioneerTrail.getGame().setGameOver(true);
    @Override
    protected String getPromptMessage() {
        return "\n======================================="
                + "\n             Location Menu             "
                + "\n======================================="
                + "\n***************************************"
                + "\n* Press 'A' to acquire resources.     *"
                + "\n* Press 'D' to view site descriptions.*"
                + "\n* Press 'R' to view current resources.*"
                + "\n* Press 'V' to view location symbols. *"
                + "\n* Press 'C' to continue your journey  *"
                + "\n* Press 'Q' to quit  game.            *"
                + "\n***************************************";
    }

}
