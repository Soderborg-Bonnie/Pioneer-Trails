package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.model.Player;
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
                + "        _\\///______________\\///_____\\/////_____\\///____\\///____\\//////////____\\//////////__\\///__________________________\\///________\\///___________\\////////\\//__\\///__\\/////////__\\//////////__     \n"
                + "\n"
                + "\n"
                + "\n"
                + "======================================================================================================================================================================================================================================================= \n"
                + "Pioneer Trails is a text-based role playing game where you lead a pioneer family on a wagon train preparing to go west. \n"
                + "You have suffered constant religious persecution and wish to find freedom and a new life in a better place. You have heard of a place called Zion in the mountains that offers such freedom and are eager to start your journey. \n"
                + "Your family is composed of both parents and three children. Before starting the long journey of 1,500 miles, you must buy a series of items necessary for the trip, such as: food, water, tools, spare parts for the wagon, weapons, ammunition, etc. \n"
                + "You must plan carefully so that you will have the items you need before you begin your journey.\n"
                + "Problems may arise during the trip, such as illness or death of family members, snake bites, broken wagons, adverse weather conditions, etc. \n"
                + "You will have the opportunity to hunt if you have weapons and ammunition when you spot a bison, or an elk. If you have the needed supplies you could repair your damaged wagon, and fish when arriving at a lake or river. \n"
                + "You will also have to stop to rest from time to time, due to weak animals or to obtain food. The game is over when at least two family members have reached Zion. \n"
                + "Good luck as you travel on the Pioneer Trails! \n"
                + "======================================================================================================================================================================================================================================================="
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

        //System.out.println("***doAction() called***");
        // System.out.println("\tinputs = " + inputs[0]);
        String playersName = inputs[0];
        Player player = GameControl.savePlayer(playersName);
        if (player == null) {
            System.out.println("Could not create the player."
                    + "Enter a different name.");
            return false;
        }

        System.out.println("\n======================================="
                + "\nWelcome to the game, " + playersName + "!"
                + "\nWe hope you have lots of fun!"
                + "\n=======================================");

        return true;

    }

}
