package byui.cit260.pioneerTrails.view;

import byui.cit260.pioneerTrails.control.GameControl;
import byui.cit260.pioneerTrails.exceptions.GameControlExceptions;
import byui.cit260.pioneerTrails.model.Player;
import byui.cit260.pioneerTrails.model.Scene;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tamlyn Laurence
 */
public class StartProgramView extends View {

    public StartProgramView() {

        super();

    }

    @Override
    public boolean doAction(String inputs) {

        //System.out.println("***doAction() called***");
        // System.out.println("\tinputs = " + inputs[0]);
        String playersName = inputs;
        Player player = null;
        try {
            player = GameControl.savePlayer(playersName);
        } catch (GameControlExceptions ex) {
//            System.out.println(ex.getMessage());
            ErrorView.display(this.getClass().getName(), "Sorry. There's a problem with the game.");
        }
        if (player == null) {
//            System.out.println("Could not create the player."
//                    + "Enter a different name.");
            ErrorView.display(this.getClass().getName(), "Sorry. There's a problem with the player.");
            return false;
        }

        this.console.println("\n======================================="
                + "\nWelcome to the game, " + playersName + "!"
                + "\nWe hope you have lots of fun!"
                + "\n=======================================");

//        Scene scene = GameControl.getCurrentScene();
//            String msg = "Welcome to " + scene.getName() + ", " + scene.getDescription()
//                    + "." + "What would you like to do now?";
//            //System.out.println(msg);
//            return msg;
        return true;

    }

    /*
    public String getInputs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public String getInput(String menuText) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
//    @Override
//    public String getInput(String menuText) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    protected String getPromptMessage() {
        return "\\__/\\\\\\\\\\\\\\\\\\\\\\\\\\____________________________________________________________________________________________/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\_____________________________________/\\\\\\\\\\\\_________________        \n"
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
                + "\nInput name, please: ";
     }
}
