/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.model.Scene;
import java.util.Scanner;

/**
 *
 * @author Bonnie
 */
public class SceneMenu extends View {

    public SceneMenu() {

        super("\n======================================="
                + "\n             Location Menu             "
                + "\n======================================="
                + "\n***************************************"
                + "\n* Press 'A' to acquire food.          *"
                + "\n* Press 'C' to continue your journey  *"
                + "\n* Press 'Q' to quit  game.            *"
                + "\n***************************************");
    }

    @Override
    public boolean doAction(String inputs) {

        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
//            case "G":
//                    gameMenuView();
//                    break; 
            case "A":
                acquireFood();
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

    private void acquireFood() {
        AcquireFood acquireFood = new AcquireFood();
        acquireFood.display();
    }

    private void continueJourney() {
        ContinueJourney continueJourney = new ContinueJourney();
        continueJourney.display();
    }
}
