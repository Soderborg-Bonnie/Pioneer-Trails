/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Bonnie
 */
public class GetHealth extends View {

    public GetHealth() {

        super();

    }

    @Override
    public boolean doAction(String inputs) {

        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
//            case "D":
//                drinkWater();
//                break;
//            case "F":
//                eatFood();
//                break;
            case "R":
                getRest();
                break;
            case "H":
                HealthTips();
                break;
            case "Q":
                return true;
            default:
                this.console.println("Hello?! McFly! Type in a correct menu item, or make like a tree and get outta here!");
        }
        return false;
    }

//    private void drinkWater() {
//        DrinkWater drinkWater = new DrinkWater();
//        drinkWater.displayDrinkWater();
//    }
//    private void eatFood() {
//        EatFood eatFood = new EatFood();
//        eatFood.displayEatFood();
//    }
    private void getRest() {
        GetRest getRest = new GetRest();
        getRest.display();
    }

    private void HealthTips() {
        HealthTips healthTips = new HealthTips();
        healthTips.display();
    }

    private void gameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    @Override
    protected String getPromptMessage() {
        return "You have the following health concerns: " + "\nWhat would you like to do?"
                + //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                "\n================================================"
                + "\n              Health Menu                     "
                + "\n================================================"
                + "\n**********************************************"
                //                + "\n* Press 'D' to drink some water .            *"
                //                + "\n* Press 'F' to eat some food.                *"
                + "\n* Press 'R' to rest.                         *"
                + "\n* Press 'H' to get health tips.              *"
                + "\n* Press 'Q' to return to the previous menu   *"
                + "\n**********************************************";
    }

}
