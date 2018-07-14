package byui.cit260.pioneerTrails.view;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tamlyn Laurence
 */
public class HuntView extends View {

    public HuntView() {
    }

    @Override
    public boolean doAction(String inputs) {
        //  System objects
//        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //  Game variables
        String[] animals = {"Elk", "Bear", "Buffalo"};
        int maxAnimalAlertness = 75;
        int huntEnergyDrain = 35;

        //  Player variables
        int energy = 100;
        int alertnessDamage = 50;
        int numDryBread = 2;
        int dryBreadHealAmount = 30;
        int energizedByHunt = 35;  // Percentage

        boolean running = true;

        this.console.println("Welcome to the hunt!");

        GAME:
        while (running) {
            this.console.println("----------------------------------------------");

            int animalAlertness = rand.nextInt(maxAnimalAlertness);
            String animal = animals[rand.nextInt(animals.length)];
            this.console.println("\t# " + animal + " has been spotted! #\n");

            OUTER:
            while (animalAlertness > 0) {
                this.console.println("\tYour energy level: " + energy);
                this.console.println("\t" + animal + "'s alertness: " + animalAlertness);
                this.console.println("\n\tWhat would you like to do?");
                this.console.println("\t1. Shoot");
                this.console.println("\t2. Eat some dry bread");
                this.console.println("\t3. Run!");
                String input = null;
                try {
                    input = this.keyboard.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(HuntView.class.getName()).log(Level.SEVERE, null, ex);
                }
                switch (input) {
                    case "1":
                        int shotDealt = rand.nextInt(alertnessDamage);
                        int damageEnergy = rand.nextInt(huntEnergyDrain);
                        animalAlertness -= shotDealt;
                        energy -= damageEnergy;
                        this.console.println("\t> You hit the " + animal + " with " + shotDealt + "% damage.");
                        this.console.println("\t> You used " + damageEnergy + "% of your energy!");
                        if (energy < 1) {
                            this.console.println("\t> You have used all your energy reserves.");
                            break OUTER;
                        }
                        break;
                    case "2":
                        if (numDryBread > 0) {
                            energy += dryBreadHealAmount;
                            numDryBread--;
                            this.console.println("\t> You ate some dry bread, rejuvinating yourself by " + dryBreadHealAmount + "%."
                                    + "\n\t> You now have " + energy + " % energy."
                                            + "\n\t> You have " + numDryBread + " dry bread left.\n");
                        } else {
                            this.console.println("\t> You have no Dry Bread left! Shoot well so you can get some meat!\n");
                        }   break;
                    case "3":
                        this.console.println("\tYou run away from the " + animal + "!");
                        continue GAME;
                    default:
                        this.console.println("\tInvalid command!");
                        break;
                }
            }

            if (energy < 1) {
                this.console.println("You limp away from the hunt, too weak to carry any meat.");
                break;
            }

            this.console.println("----------------------------------------------");
            this.console.println(" # " + animal + " was shot! # ");
            this.console.println(" # You now have " + energy + "% of your energy left. # ");
            if (rand.nextInt(100) < energizedByHunt) {
                numDryBread++;
                this.console.println(" # You could return to camp. # ");

            }
           this.console.println("----------------------------------------------");
            this.console.println("What would you like to do now?");
            this.console.println("1. Continue hunting");
           this.console.println("2. Leave the hunt");

            String input = null;
            try {
                input = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(HuntView.class.getName()).log(Level.SEVERE, null, ex);
            }

            while (!input.equals("1") && !input.equals("2")) {
                this.console.println("Invalid command!");
                try {
                    input = this.keyboard.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(HuntView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (input.equals("1")) {
                this.console.println("You continue on your adventure!");
            } else if (input.equals("2")) {
                this.console.println("You return to the wagon train laden with meat for all!");
                break;
            }
        }
        this.console.println("########################");
        this.console.println("#  Thanks for hunting  #");
        this.console.println("########################");
        return false;
    }
}
