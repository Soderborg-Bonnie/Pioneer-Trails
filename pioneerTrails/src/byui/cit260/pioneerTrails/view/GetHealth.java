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

        super("You have the following health concerns: " + "What would you like to do?"
                + //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                "================================================"
                + "              Health Menu"
                + "================================================"
                + "\n**********************************************"
                + "\n* Press 'D' to drink some water .            *"
                + "\n* Press 'F' to eat some food.                *"
                + "\n* Press 'R' to rest.                         *"
                + "\n* Press 'H' to get health tips.              *"
                + "\n* Press 'Q' to return to the previous menu   *"
                + "\n**********************************************");

//            String[] inputs = this.getInputs();
//
//            if (inputs[0].equalsIgnoreCase("Q")) {
//                return;
//            } else {
//                endOfView = doAction(inputs);
//            }
//        } while (endOfView != true);
//    }
////   
//
//    private String[] getInputs() {
//        Scanner scanner = new Scanner(System.in);
//        String[] inputs = new String[1];
//        Boolean valid = false;
//        while (!valid) {
//            System.out.println("Please select an option: ");
//            inputs[0] = scanner.nextLine();
//            inputs[0] = inputs[0].trim();
//            if (inputs[0].length() < 1) {
//                System.out.println("try again");
//                continue;
//            }
//            valid = true;
//
//        }
//        return inputs;
    }

    @Override
    public boolean doAction(String inputs) {

        String menuItem = inputs.toUpperCase();
        switch (menuItem) {
            case "D":
                drinkWater();
                break;
            case "F":
                eatFood();
                break;
            case "R":
                getRest();
                break;
            case "H":
                getHelp();
                break;
            case "Q":
                return true;
            default:
                System.out.println("Hello?! McFly! Type in a correct menu item, or make like a tree and get outta here!");
        }
        return false;
    }

    private void drinkWater() {
        DrinkWater drinkWater = new DrinkWater();
        drinkWater.displayDrinkWater();
    }

    private void eatFood() {
        EatFood eatFood = new EatFood();
        eatFood.displayEatFood();
    }

    private void getRest() {
        GetRest getRest = new GetRest();
        getRest.displayGetRest();
    }

    private void getHelp() {
        GetHelp getHelp = new GetHelp();
        getHelp.display();
    }

    private void gameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    @Override
    public String getInput(String menuText) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayGetHealth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
