package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tamlyn Laurence
 */
public class StartProgramView {

    public StartProgramView() {

    }

    public void display() {

        System.out.println("\\__/\\\\\\\\\\\\\\\\\\\\\\\\\\____________________________________________________________________________________________/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_____________________________________/\\\\\\\\\\\\_________________        \n"
                + " _\\/\\\\\\/////////\\\\\\_________________________________________________________________________________________\\///////\\\\\\/////_____________________________________\\////\\\\\\_________________       \n"
                + "  _\\/\\\\\\_______\\/\\\\\\__/\\\\\\_________________________________________________________________________________________\\/\\\\\\_____________________________________/\\\\\\____\\/\\\\\\_________________      \n"
                + "   _\\/\\\\\\\\\\\\\\\\\\\\\\\\\\/__\\///______/\\\\\\\\\\_____/\\\\/\\\\\\\\\\\\_______/\\\\\\\\\\\\\\\\______/\\\\\\\\\\\\\\\\___/\\\\/\\\\\\\\\\\\\\__________________\\/\\\\\\________/\\\\/\\\\\\\\\\\\\\___/\\\\\\\\\\\\\\\\\\____\\///_____\\/\\\\\\_____/\\\\\\\\\\\\\\\\\\\\_     \n"
                + "    _\\/\\\\\\/////////_____/\\\\\\___/\\\\\\///\\\\\\__\\/\\\\\\////\\\\\\____/\\\\\\/////\\\\\\___/\\\\\\/////\\\\\\_\\/\\\\\\/////\\\\\\_________________\\/\\\\\\_______\\/\\\\\\/////\\\\\\_\\////////\\\\\\____/\\\\\\____\\/\\\\\\____\\/\\\\\\//////__    \n"
                + "     _\\/\\\\\\_____________\\/\\\\\\__/\\\\\\__\\//\\\\\\_\\/\\\\\\__\\//\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\___/\\\\\\\\\\\\\\\\\\\\\\__\\/\\\\\\___\\///__________________\\/\\\\\\_______\\/\\\\\\___\\///____/\\\\\\\\\\\\\\\\\\\\__\\/\\\\\\____\\/\\\\\\____\\/\\\\\\\\\\\\\\\\\\\\_   \n"
                + "      _\\/\\\\\\_____________\\/\\\\\\_\\//\\\\\\__/\\\\\\__\\/\\\\\\___\\/\\\\\\_\\//\\\\///////___\\//\\\\///////___\\/\\\\\\_________________________\\/\\\\\\_______\\/\\\\\\__________/\\\\\\/////\\\\\\__\\/\\\\\\____\\/\\\\\\____\\////////\\\\\\_  \n"
                + "       _\\/\\\\\\_____________\\/\\\\\\__\\///\\\\\\\\\\/___\\/\\\\\\___\\/\\\\\\__\\//\\\\\\\\\\\\\\\\\\\\__\\//\\\\\\\\\\\\\\\\\\\\_\\/\\\\\\_________________________\\/\\\\\\_______\\/\\\\\\_________\\//\\\\\\\\\\\\\\\\/\\\\_\\/\\\\\\__/\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\_ \n"
                + "        _\\///______________\\///_____\\/////_____\\///____\\///____\\//////////____\\//////////__\\///__________________________\\///________\\///___________\\////////\\//__\\///__\\/////////__\\//////////__"
        );

        boolean endOfView = false;

        do {
            String[] inputs = this.getInputs();

            if (inputs[0].equalsIgnoreCase("Q")) {
                return;
            } else {
                endOfView = doAction(inputs);
            }
        } while (endOfView != true);

    }

    private String[] getInputs() {

        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[1];
        Boolean valid = false;
        while (!valid) {
            System.out.println("Input name, please: ");
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
////        playersName = get the first value in the inputs array
//player = savePlayer(playersName)
//IF player == null
// display “Could not create the player. “ +
// “Enter a different name.”
// RETURN false
//ENDIF
//DISPLAY "================================================= "
// + "Welcome to the game " + playersName
// + "We hope you have a lot of fun!”
// + "================================================= "
//mainMenuView = Create a new MainMenuView object
//mainMenuView.displayMainMenuView()
//RETURN true 
        //System.out.println("***doAction() called***");
        // System.out.println("\tinputs = " + inputs[0]);
        Player player = GameControl.savePlayer(inputs[0]);
//if (player == null)
//    System.out.println("Couldn't create player. Enter a different name.");
//return false;

        System.out.println("Welcome to the game, " + player + "! We hope you have lots of fun!");

        return true;
//
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
////    public void display(){
////        String[] testCode = getInputs();
////        doAction(testCode);
    }
}
